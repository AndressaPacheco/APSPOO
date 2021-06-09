public class Poupanca extends Conta {

    private double taxa = 5;

    public Poupanca(int numero, double saldo, String nome, String cpf) {
        super(numero, saldo, nome, cpf);
    }     
    
    public boolean sacar(double valor){
        if(getSaldo() >= valor){
            setSaldo(getSaldo() - (valor + this.taxa));
            return true;
        } 
        return false;
        }

    public boolean depositar(double valor){
        setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso!");
            return true;
        }   

    public double getTaxa(){
        return taxa;
    }

    public void setTaxa(){
        this.taxa = taxa;
    }

    @Override
    public String getDados() {
        return "Numero da Conta:" + getNumero() + "Saldo:" + getSaldo();
    } 
}
