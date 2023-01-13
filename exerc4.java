//faça um programa que identifique se uma letra é vogal ou consoante 

import java.util.Scanner;
public class exerc4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("digite uma letra: ");

        String letra = scan.next();

        //posso fazer de duas formas, utilizando if else ou switch case

       /*  if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("vogal");
        } else {
            System.out.println("consoante");
        } */

        //utilizando switch case
        //lenght define quantos caracteres o programador quer que tenha na string 
        if(letra.length() > 1){
            System.out.println("não eh uma letra valida! ")
        } else{

        switch(letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println("vogal"); break;
            default: System.out.println("consoante");
        }
        }
    
    }
}
