import java.util.Scanner;
public class exerc17 {
   public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o ano: ");
    int ano = scan.nextInt();

    if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
        System.out.println("eh bissexto");
    } else {
        System.out.println("nao eh bissexto");
    }

   } 
}
