//faça um programa que leia tres numeros e mostre em ordem decrescente
import java.util.Scanner;
public class exerc9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int n1 = scan.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int n2 = scan.nextInt();
        System.out.println("Entre com o terceiro numero: ");
        int n3 = scan.nextInt();

        
        if(n1 < n2 && n1 < n3 && n2 < n3){
            //n1<n2<n3

            System.out.println(n3 + "-" + n2 + "-" + n1);

        } else if(n1 < n2 && n1 < n3 && n3 < n2){ 
            //n1<n3<n2
            System.out.println(n2 + "-" + n3 + "-" + n1);
        } else if(n2 < n1 && n2 < n3 && n1 < n3){
            //n2<n1<n3 
            System.out.println(n3 + "-" + n1 + "-" + n2);
        } else if(n2 < n1 && n2 < n3 && n3 < n1){
            //n2<n3<n1 
            System.out.println(n1 + "-" + n3 + "-" + n2);
        } else if(n3 < n1 && n3 < n2 && n1 < n2){
            //n3<n1<n2 
            System.out.println(n2 + "-" + n1 + "-" + n3);
        } else if(n3 < n1 && n3 < n2 && n2 < n1){
            //n3<n2<n1 
            System.out.println(n1 + "-" + n2 + "-" + n3);
        }


    }
}
