//faça um programa que peça um valor e mostre na tela se o valor eh positivo ou negativo
import java.util.Scanner;
public class exerc2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = scan.nextDouble();

        if(valor < 0){
            System.out.println("Esse numero eh negativo ");
        }else{
            System.out.println("Esse numero eh positivo ");
        }

    }
}
