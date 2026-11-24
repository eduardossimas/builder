package strategy;

public class Pagamento {

    private float valor;
    private float percentual;

    public Pagamento(float valor, float percentual) {
        this.valor = valor;
        this.percentual = percentual;
    }

    public float calcular(MetodoPagamento metodoPagamento) {
        return metodoPagamento.calcular(valor, percentual);
    }
}
