import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "Lucas";
        String accountType = "Corrente";
        double balance = 3000.00;
        int option = 0;

        System.out.println("***************************************\n");
        System.out.println("Nome:          " + name);
        System.out.println("Tipo conta:    " + accountType);
        System.out.println("Saldo atual:   " + balance);
        System.out.println("\n***************************************\n");

        String menu = """
                \nOperações:
                
                1-Consultar saldo
                2-Transferir valor
                3-Receber valor
                4-Sair
                
                Digite a opção desejada:
                """;

        while (option != 4) {
            System.out.println(menu);

            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Saldo atual: " + balance);
            } else if (option == 2) {
                System.out.println("Qual valor deseja transferir?");
                double transferValue = scanner.nextDouble();

                if (transferValue <= 0) {
                    System.out.println("Valor inválido. Digite um valor maior que zero!");
                } else if (balance < transferValue) {
                    System.out.println("Saldo insuficiente! ");
                } else {
                    balance -= transferValue;
                    System.out.println("Você transferiu R$" + transferValue);
                }
            } else if (option == 3) {
                System.out.println("Qual valor deseja receber? ");
                double receiveValue = scanner.nextDouble();

                if (receiveValue <= 0) {
                    System.out.println("Valor inválido. Digite um valor maior que zero!");
                } else {
                    balance += receiveValue;
                    System.out.println("Você recebeu R$" + receiveValue);
                }
            } else if (option != 4) {
                System.out.println("Opção inválida! Digite uma das opções abaixo");
            }
        }
    }
}