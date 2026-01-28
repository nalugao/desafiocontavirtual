import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dados principais
        StringBuilder newline = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            newline.append("-");
        }
        System.out.println(newline.toString());

        String nome = "Natalia Lugão";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;
        String menu = """
                \n** Operações **
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir Valor
                4 - Sair
                
                Digite a opção desejada: 
                """;

        System.out.println("Dados iniciais do cliente:");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println(newline.toString());

        //Menu
        Scanner leitor = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é R$ " + saldo);

            } else if (opcao == 2) {
                System.out.print("Informe o valor a receber: ");
                double valorReceber = leitor.nextDouble();
                saldo += valorReceber;
                System.out.println("Saldo atualizado: " + saldo);

            } else if (opcao == 3) {
                System.out.print("Informe o valor a transferir: ");
                double valorTransferir = leitor.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transação.");
                } else {
                    saldo -= valorTransferir;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}