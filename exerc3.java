//faça um programa que verifique se uma letra digitada é "f" ou "m".
//conforme a letra, escrever: F - feminino, M - masculino, sexo invalido.

import java.util.Scanner;
public class exerc3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite F para sexo femino e M para sexo masculino: ");
        //como é uma letra, vamos ler uma string
        String input = scan.next();

 //Para comparação de String não usamos "==", sabendo que em java String é um classe
 //Então iremos usar: .equalsIgnoreCase

        if(input.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        } else if (input.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        }else {
            System.out.println("Sexo  invalido");
        }
    }
    
}
