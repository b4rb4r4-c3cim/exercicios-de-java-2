import java.util.Scanner;
public class exerc15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o lado 1: ");
        double lado1 = scan.nextDouble();

        System.out.println("Entre com o lado 2: ");
        double lado2 = scan.nextDouble();

        System.out.println("Entre com o lado 3: ");
        double lado3 = scan.nextDouble();

        if(((lado1 + lado2) > lado3)
         || ((lado1 + lado3) > lado2)
          || ((lado2 + lado3) > lado1)){
          
            if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println(" Triangulo Equilatero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){

                System.out.println(" Triangulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println(" Triangulo Isoceles");
            }


        } else {
            System.out.println("Nao forma um triangulo!"); 
        }
    }
}
