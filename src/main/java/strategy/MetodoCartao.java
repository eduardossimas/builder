package strategy;

public class MetodoCartao implements MetodoPagamento {

    public float calcular(float valor, float percentual) {
        return valor + (valor * percentual);
    }
}
