import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Data de nacimento: ");
        Data nacimento = new Data(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(nacimento.infoDate());
        scanner.close();
    }
}
