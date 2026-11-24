package strategy;

public class Cliente {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void pagarComBoleto(float valor) {
        Pagamento pagamento = new Pagamento(valor, 0.0f);
        this.valor = pagamento.calcular(new MetodoBoleto());
    }

    public void pagarComCartao(float valor, float percentualJuros) {
        Pagamento pagamento = new Pagamento(valor, percentualJuros);
        this.valor = pagamento.calcular(new MetodoCartao());
    }

    public void pagarComPix(float valor, float percentualDesconto) {
        Pagamento pagamento = new Pagamento(valor, percentualDesconto);
        this.valor = pagamento.calcular(new MetodoPIX());
    }
}
