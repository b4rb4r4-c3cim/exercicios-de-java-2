//faça um programa que leia 3 numeros e mostre o maior e o menor entre eles 
import java.util.Scanner;
public class exerc7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double n2 = scan.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        double n3 = scan.nextDouble();

        if (n1 > n2 && n1 > n3){
            System.out.println("O primeiro numero eh o maior: " + n1);
        } else if(n2 > n1 && n2 > n3){
            System.out.println("O segundo numero eh o maior: " + n2);
        } else {
            System.out.println("O terceiro numero eh o maior: " + n3);
        }

        if (n1 < n2 && n1 < n3){
            System.out.println("O primeiro numero eh o menor: " + n1);
        } else if(n2 < n1 && n2 < n3){
            System.out.println("O segundo numero eh o menor: " + n2);
        } else {
            System.out.println("O terceiro numero eh o menor: " + n3);
        }

        
}
}
