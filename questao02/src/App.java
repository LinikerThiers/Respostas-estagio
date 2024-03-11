import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        System.out.println("Sequencia de Fibonacci");
        System.out.println("--------------------");

        System.out.println("Digite um numero para verificar se pertence a sequencia de Fibonacci: ");
        int numero = ler.nextInt();

        if (estaNaSequenciaFibonacci(numero)) {
            System.out.println(numero + " pertence a sequencia de Fibonacci");
        } else {
            System.out.println(numero + " nao pertence a sequencia de Fibonacci");
        }

        ler.close();
    }

    public static boolean estaNaSequenciaFibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (a <= numero) {

            if (a == numero) {
                return true;
            }

            int temp = b;
            b = a + b;
            a = temp;
        }

        return false;
    }
}
