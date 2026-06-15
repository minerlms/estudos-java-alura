import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        String message = """
                ---------------------------------
                Bem vindo ao jogo de adivinhação!
                ---------------------------------
                """;
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);

        int numberGenerated = new Random().nextInt(100) + 1; //o +1 define 1 como ponto de partida ao invés de 0
        int attempts = 0;
        int inputNumber = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número entre (10) e (100) para tentar adivinhar: ");
            inputNumber = scanner.nextInt();
            attempts += 1;

            if (inputNumber == numberGenerated) {
                System.out.println("Parabéns! Você acertou o número em " + attempts + " tentativa(s)\n");
                break;
            } else if (inputNumber > numberGenerated) {
                System.out.println("Tente um número menor!\n");
            } else {
                System.out.println("Tente um número maior!\n");
            }
            int remaining = 10 - attempts;
            if (attempts < 0)
                System.out.println("Você tem " + remaining + "restante(s) \n");
        }


        if (inputNumber != numberGenerated) {
            System.out.println("Suas tentativas acabaram! O número era " + numberGenerated);
        }
    }
}
