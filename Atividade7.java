import java.util.Random;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int numero, numeroaleatorio;
        System.out.println("escola um número de 1 a 10");
        numero = sc.nextInt();
       numeroaleatorio = rm.nextInt(10)+1;
System.out.println("O número sorteado foi: " + numeroaleatorio);

if (numero == numeroaleatorio) {
    System.out.println("Você acertou! ");
} else if (numero != numeroaleatorio) {
System.out.println("Você errou! ");
{
    if (numero > numeroaleatorio) {
        System.out.println("Seu número foi maior.");
    } else {
System.out.println("Seu número foi menor.");
    }
}
}
    }
}