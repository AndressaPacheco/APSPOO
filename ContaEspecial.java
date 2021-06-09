public class ContaEspecial extends Conta {
    
    private double limite;

	public ContaEspecial(double saldo, double limite, int numero, String nome, String cpf){
		super(numero, saldo, nome, cpf);
		this.limite=limite;
	}

	public boolean sacar(double valor){
        if(getSaldo() >= (valor + getLimite())){
			return true;
		}
            return false;
    }
	
	@Override
	public boolean depositar(double valor){
		setSaldo(getSaldo() + valor);
		return true;
	}
 
	public double getLimite(){
		return limite;
	}
	
	public void setLimite(double limite){
		this.limite=limite;
	}
	@Override
	public String getDados() {
		return "Numero da Conta:" + getNumero() + "Saldo:" + getSaldo() + "Limite" + limite; 
	}
    }
    

