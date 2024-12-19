import java.util.Arrays;
import java.util.Scanner;

public class Parte1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por , ");

        String resposta = s.next();
        String[] vetStr = resposta.split(",");
        int i = 0;

        System.out.println("Lista Desordenada: ");
        for(i=0; i<vetStr.length; i++) {
            System.out.println(vetStr[i]);

        }

        Arrays.sort(vetStr);
        System.out.println("Lista Ordenada: ");
        for(String nome : vetStr) {
            System.out.println(nome);
        }

    }

}
