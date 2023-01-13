//faça um programa para ler duas notas parciais de um aluno
//o programa dever calcular a media alcançada por aluno e apresentar:
// - a mensagem aprovado se a media for maior ou igual a sete
// - a mensagem reprovado se a media for menor que sete 
// - a mensagem aprovado com distinção, se a media for igual a dez 
import java.util.Scanner;
public class exerc5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2)/2;

        if(media == 10){
            System.out.println("O aluno foi aprovado com distinção.");
        }else if(media >= 7){
            System.out.println("O aluno foi aprovado.");
        }else {
            System.out.println("O aluno foi reprovado.");
        }
       

    }
}
