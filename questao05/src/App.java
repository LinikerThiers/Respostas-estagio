import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String input = ler.nextLine();

        String palavraInvertida = inverterPalavra(input);

        System.out.println("Palavra invertida: " + palavraInvertida);

        ler.close();

    }

    public static String inverterPalavra(String input) {
        char[] charArray = input.toCharArray();
        int esquerdo = 0;
        int direito = charArray.length -1;

        while (esquerdo < direito){
            char temp = charArray[esquerdo];
            charArray[esquerdo] = charArray[direito];
            charArray[direito] = temp;

            esquerdo++;
            direito--;
        }

        return new String(charArray);
    }
}
