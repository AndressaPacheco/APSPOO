import java.util.ArrayList;
import static java.util.Objects.isNull;

public class GerenciarConta {
    private ArrayList<Conta> contas;

    public GerenciarConta() {
        contas = new ArrayList<>();
    }

    public void novaConta(int numero, double saldo, String nome, String cpf) {
        contas.add(new Corrente(numero, saldo, nome, cpf));
    }

    public boolean remover(String nome) {
        for (Conta conta : contas) {
            if (conta.getNome().equalsIgnoreCase(nome)) {
                contas.remove(conta);
                return true;
            }
    }
        return false;
    }

    public String listarConta() {
        String saida = "";
        for (Conta conta : contas) {
            saida += conta.getDados() + "\n";
        }
        return saida;
    }

    public boolean sacar(double valor, Integer numero){
       
        Conta contaSelecionada = this.buscarConta(numero);
        if (!isNull(contaSelecionada)) {
            return contaSelecionada.depositar(valor);
        }
        return false;
    }

    public boolean depositar(double valor, Integer numero){
        Conta contaSelecionada = this.buscarConta(numero);
        if (!isNull(contaSelecionada)) {
            return contaSelecionada.depositar(valor);
        }
        return false;
    }

    public Conta buscarConta(Integer contaNumero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == contaNumero) {
                return conta;
            }
        }
        return null;
    }             
    
}
