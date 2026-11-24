package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarBoleto() {
        Cliente cliente = new Cliente();
        cliente.pagarComBoleto(100.0f);
        assertEquals(100.0f, cliente.getValor());
    }

    @Test
    void deveRetornarCartaoComJuros() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartao(100.0f, 0.10f);
        assertEquals(110.0f, cliente.getValor());
    }

    @Test
    void deveRetornarPixComDesconto() {
        Cliente cliente = new Cliente();
        cliente.pagarComPix(100.0f, 0.10f);
        assertEquals(90.0f, cliente.getValor());
    }
}
