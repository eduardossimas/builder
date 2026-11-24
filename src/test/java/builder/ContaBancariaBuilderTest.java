package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaBuilderTest {

    @Test
    void deveRetornarExcecaoParaContaSemNumero() {
        try {
            ContaBancariaBuilder contaBancariaBuilder = new ContaBancariaBuilder();
            ContaBancaria contaBancaria = contaBancariaBuilder
                    .setTitular("Titular 1")
                    .setEmail("titular1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número da conta inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaContaSemTitular() {
        try {
            ContaBancariaBuilder contaBancariaBuilder = new ContaBancariaBuilder();
            ContaBancaria contaBancaria = contaBancariaBuilder
                    .setNumeroConta(1)
                    .setEmail("titular1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Titular inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarContaBancariaValida() {
        ContaBancariaBuilder contaBancariaBuilder = new ContaBancariaBuilder();
        ContaBancaria contaBancaria = contaBancariaBuilder
                .setNumeroConta(1)
                .setTitular("Titular 1")
                .setAgencia(100)
                .setEmail("titular1@email.com")
                .build();

        assertNotNull(contaBancaria);
    }
}
