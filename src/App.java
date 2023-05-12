import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***** CONVERSOR DE TEMPERATURA FAHRENHEIT PARA CELCIUS  *****");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor em Fahrenheit");
        double F = teclado.nextInt();

        double C = 5 * ((F - 32) / 9);

        teclado.close();

        System.out.printf("A temperatura em graus Cº é %.2f ", C);

    }
}
