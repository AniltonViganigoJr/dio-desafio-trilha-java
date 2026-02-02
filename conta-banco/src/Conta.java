public class Conta {
    
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private double saldo = 0.0;

    public Conta(){};

    public Conta(Integer numero, String agencia, String nomeCliente, Double saldo) {
        
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public double depositar(Double valor) {
        if (valor == null || valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        this.saldo += valor;
        return this.saldo;
    }


    @Override
    public String toString() {
        return "Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\nSua agência é " + agencia 
                + ".\nSua conta é " + numero + ".\nE seu saldo de R$" + String.format("%.2f", saldo) + ", já está disponível para saque.";
    }
}
