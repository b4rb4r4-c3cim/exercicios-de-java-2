//faça um programa que pergunte o preço de tres produtos e informe qual produto voce deve comprar
//sabendo que a decisão é sempre pelo mais barato

import java.util.Scanner;
public class exerc8 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o valor do primeiro produto: ");
        double p1 = scan.nextDouble();
        System.out.println("Digite o valor do segundo produto: ");
        double p2 = scan.nextDouble();
        System.out.println("Digite o valor do terceiro produto: ");
        double p3 = scan.nextDouble();

        if(p1 < p2 && p1 < p3){
            System.out.println("O primeiro produto é o mais em conta com o valor de:  " + p1);
        }else if (p2 < p1 && p2 < p3){
            System.out.println("O segundo produto é o mais em conta com o valor de:  " + p2);
        } else if (p3 < p2 && p3 < p2){
            System.out.println("O terceiro produto é o mais em conta com o valor de:  " + p3);
        }


       
        

    }
}
