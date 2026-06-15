import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double notas = 0; //Inicia no valor 0
    double nota; //Inicia no valor 0 (sem precisar declara-lo)
    for (int i = 0; i < 3; i++) { // Itera sobre as condiçoes CONHECIDAS (neste caso 3 vezes)
        System.out.println("De uma nota para o anime: "); //Exibe mensagem pedindo uma nota
        nota = scanner.nextDouble(); // Lê as notas do usuario
        notas += nota; //Acumula as notas
    }
        double mediaNotas = notas / 3; //Faz a média das notas digitadas pelo usuario

    System.out.println("A média das notas é: " + mediaNotas); //Imprime a mensgaem + media das notas
}
