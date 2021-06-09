import java.util.Scanner;

public class AppConta {
 public static void main(String[] args) {
     GerenciarConta contas = new GerenciarConta();
     Scanner entrada = new Scanner(System.in);
     int opcao, numero;
     String nome, cpf, conta;
     double saldo, valor, limite, taxa;

     System.out.println("Bem-vindo ao seu banco!");

     System.out.println("Infome o seu nome:");
        nome = entrada.next();
        System.out.println("Informe o seu CPF:");
        cpf = entrada.next();
        System.out.println("Informe o numero da sua conta:");
        numero = entrada.nextInt();
      
        System.out.println("Parabéns sua conta foi aberta !");

        System.out.println("Número da conta: " + numero);   

        do{

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Adicionar");
            System.out.println("4 - Remover");
            System.out.println("5 - Listar");
            opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Informe o numero da sua conta:");
                    numero = entrada.nextInt();
                    System.out.println("Informe o valor do saque:");
                    valor = entrada.nextDouble();
                    if (contas.sacar(valor, numero)){
                        System.out.println("Saque concluido com sucesso!");
                    }    
                 else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 2:
                    System.out.println("Informe o numero da sua conta:");
                    numero = entrada.nextInt();
                    System.out.println("Informe o valor do depósito:");
                    valor = entrada.nextDouble();
                    if (contas.depositar(valor, numero)){
                    System.out.println("Depósito realizado com sucesso");
                    } else {
                        System.out.println("Não foi possivel realizar o deposito, tente novamente!");
                    }                                    
                    break;
                case 3:
                    System.out.println("Informe o seu nome:");
                    nome = entrada.nextLine();
                    System.out.println("Informe o seu CPF");
                    cpf = entrada.nextLine();
                    System.out.println("Informe o numero da Conta:");
                    numero = entrada.nextInt();
                    System.out.println("Saldo:");
                    saldo = entrada.nextDouble();
                    contas.novaConta(numero, saldo, nome, cpf);
                    break;
                case 4:
                    System.out.println("Remover Conta (Digite o seu nome):");
                    nome = entrada.nextLine();
                    System.out.println(contas.remover(nome));
                    break;
                case 5:
                    System.out.println(contas.listarConta());   
                    break;
                case 6:
                    break;

                    default:
                    System.out.println("Opção inválida");
                    }

                }while (opcao != 6);

                    entrada.close();   

}
}


