package aula05;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    //Methods below
    public String abrirConta(String tipo) {

        setStatus(true);
        setTipo(tipo);
        if ("CC".equals(tipo)) {
            setSaldo(50);
            return "Conta Corrente aberta com saldo de 50 reais";
        } else {
            setSaldo(150);
            return "Conta Poupança aberta com saldo de 150 reais";
        }
    }

    public String fecharConta() {
        /**
         * Regras de negócio pra fechar conta não pode ter dinheiro, nem débito.
         */
        if (isStatus() == false) {
            return "Não foi possível fechar a conta pois ela não está aberta";
        } else if (getSaldo() > 0) {
            return "Não foi possível fechar conta, pois possui um saldo de: " + getSaldo();
        } else if (getSaldo() < 0) {
            return "Não foi possível fechar conta, pois possui um saldo negativo de: " + getSaldo();
        } else {
            setStatus(false);
            return "Conta foi fechada com sucesso";
        }
    }

    /**
     * sacar() precisa estar aberta e precisa ter saldo para saque.
     * pagarMensal() ao ser chamado, cliente que tem conta corrente pagará 12
     * reais
     */
    public String depositar(float valor) {
        if (isStatus()) {
            setSaldo(getSaldo() + valor);
            return valor + " Foi adicionado a sua conta";
        } else {
            return "Sua conta não está aberta";
        }
    }

    public String sacar(float valor) {
        if (isStatus() == false) {
            return "Sua conta não está aberta";
        }
        if (valor > getSaldo()) {
            return "Você tentou sacar o valor " + valor + "e acima do saldo atual que é: " + this.saldo;
        } else {
            setSaldo(getSaldo() - valor);
            return "Valor " + valor + " foi sacado com sucesso";
        }
    }

    /**
     * pagarMensal() ao ser chamado, cliente que tem conta corrente pagará 12
     * reais cliente que tem poupança pagará 20 reais todos métodos publicos.
     */
    public String pagarMensal() {
        if ("CC".equals(getTipo())) {
            this.sacar(12f);
            return "Foi pago valor de: 12 reais";
        } else {
            this.sacar(20f);
            return "Foi pago valor de: 20 reais";
        }
    }

    public String status() {
        return "ContaBanco: " + "Numero da conta: " + numConta + ", Tipo: " + tipo + ", Dono: " + dono + ", Saldo: " + saldo + ", Status: " + status + '.';
    }

    //Getters and Setters begin
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Getters and setters end
}
