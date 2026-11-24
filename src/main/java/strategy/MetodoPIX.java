package strategy;

public class MetodoPIX implements MetodoPagamento {

    public float calcular(float valor, float percentual) {
        return valor - (valor * percentual);
    }
}
