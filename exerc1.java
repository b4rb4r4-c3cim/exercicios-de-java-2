//faça um programa que peça dois numeros e imprima o maior deles.
import java.util.Scanner;

public class exerc1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo numero");
        double n2 = scan.nextDouble();

        if(n1>n2){
            System.out.println("O primeiro numero eh maior que o segundo");
        }else if (n2>n1){
            System.out.println("O segundo numero eh maior que o primeiro");
        }else{
            System.out.println("Os numeros sao iguais");
        }

    }
}