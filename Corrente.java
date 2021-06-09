public class Corrente extends Conta {

    public Corrente(int numero, double saldo, String nome, String cpf) {
        super(numero, saldo, nome, cpf);
    }

    @Override
    public boolean sacar(double valor){
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            return true;
        }else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
        return false;
    }

    @Override
    public boolean depositar(double valor){
        setSaldo(getSaldo() + valor);
        System.out.println("Valor depositado com Sucesso!");
        return true;
    }

    @Override
    public String getDados() {
        return "Numero da Conta:" + getNumero() + "Saldo:" + getSaldo();
    }   
}