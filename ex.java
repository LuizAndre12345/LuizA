import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        while (!ler.hasNextDouble()) {
            System.out.println("Por favor, digite um número válido.");
            System.out.print("Digite um número: ");
            ler.nextLine();
        }

        double numero = ler.nextDouble();
        System.out.println("Você digitou o número " + numero + ".");
    }
}