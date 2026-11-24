package builder;

public class ContaBancariaBuilder {

    private ContaBancaria contaBancaria;

    public ContaBancariaBuilder() {
        contaBancaria = new ContaBancaria();
    }

    public ContaBancaria build() {
        if (contaBancaria.getNumeroConta() == 0) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
        if (contaBancaria.getTitular().equals("")) {
            throw new IllegalArgumentException("Titular inválido");
        }
        return contaBancaria;
    }

    public ContaBancariaBuilder setNumeroConta(int numeroConta) {
        contaBancaria.setNumeroConta(numeroConta);
        return this;
    }

    public ContaBancariaBuilder setTitular(String titular) {
        contaBancaria.setTitular(titular);
        return this;
    }

    public ContaBancariaBuilder setAgencia(int agencia) {
        contaBancaria.setAgencia(agencia);
        return this;
    }

    public ContaBancariaBuilder setEmail(String email) {
        contaBancaria.setEmail(email);
        return this;
    }
}
