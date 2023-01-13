//faça um programa que pergunte em que turno voce estuda. peça para digitar M-matutino, V-vespertino, N-noturno
//imprima a mensagem bom dia, boa tarde ou boa noite ou valor invalido, conforme o caso

import java.util.Scanner;
public class exerc10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ola, digite em que turno voce estuda, M (matutino),V(vespertino),N(noturno): ");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("m")){
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("v")){
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("n")){
            System.out.println("Boa noite!");
        } else {
                System.out.println("Turno invalido");
            }
        }

        //poderia usar o switch case também
        /*
         switch (turno){
            case: "m"
            case: "M" : System.out.println("Bom dia!"); break;
            case: "v"
            case: "V" : System.out.println("Boa tarde!"); break;
            case: "n"
            case: "N" : System.out.println("Boa noite!"); break;
            default: System.out.println("Turno invalido");
         }
         */


    }
