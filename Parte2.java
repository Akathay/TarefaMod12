import java.util.*;

public class Parte2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes e o sexo das pessoas conforme no exemplo abaixo:");
        System.out.println("Ex: João-M,Maria-F,");

        String resposta = s.next();
        String[] vetStr = resposta.split(",");
        int i = 0;
        ArrayList<String> m = new ArrayList<String>();
        ArrayList<String> f = new ArrayList<String>();


        for(String nome : vetStr){
            if(nome.contains("-M")){
                   m.add(nome);
            }else if(nome.contains("-F")){
                f.add(nome);
            }
            }

        System.out.println("Lista Masculina");
        for(String nomes : m){
            System.out.println(nomes);
        }
        System.out.println("Lista Feminina");
        for(String nomes : f){
            System.out.println(nomes);
        }

    }
}


