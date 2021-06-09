public abstract class Conta {
    private int numero; 
    private double saldo;
    private String cliente;
    private String cpf;
    private String nome;
    public double depositar, sacar;

    public Conta(int numero, double saldo, String nome, String cpf){
    this.numero = numero;
    this.saldo = saldo;
    this.nome = nome;
    this.cpf = cpf; 
    }

    public int getNumero() {
        return numero;
    }
    public int setNumero(){
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public double setSaldo(double valor){
        return saldo;
    }
    public String getCpf() {
        return cpf;
    }
    public String setCpf(){
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String setNome(){
        return nome;
    }
    public boolean depositar(double valor){
        return true;
    }
    public boolean sacar(double valor){
        return true;
    }    
    public abstract String getDados();
}