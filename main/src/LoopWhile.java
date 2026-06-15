import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaNotas = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("De uma nota para o anime ou -1 para encerrar o programa: ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                mediaNotas += nota;
                totalNotas++;
            }
        }
        System.out.println("A média das notas é: " + mediaNotas/totalNotas);
    }
}
