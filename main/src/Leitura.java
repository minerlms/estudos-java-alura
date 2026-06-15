import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu anime favorito:  ");
        String anime = scanner.nextLine();

        System.out.println("Qual o ano de lançamento do seu anime favorito? ");
        int yearRelease = scanner.nextInt();

        System.out.println("De uma avaliação para o anime: ");
        double evaluation = scanner.nextDouble();

        System.out.println("Anime favorito: " + anime);
        System.out.println("Ano de lançamento: " + yearRelease);
        System.out.println("Nota de avaliação: " + evaluation);
    }
}
