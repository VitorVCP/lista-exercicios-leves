import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, soma, diferenca;
        System.out.println("Insira dois números inteiros.");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        soma = numero1 + numero2;
        diferenca = numero1 - numero2;
        System.out.println("Sua soma é: " + soma);

        if (soma % 2 == 0) {
        System.out.println("Seu número é par.");
        } else {
        System.out.println("Seu número é impar");
        }

        if (diferenca > 0) {
            System.out.println("Além da diferença ser positiva");
        } else if (diferenca < 0) {
        System.out.println("Além da diferença ser negativa");
        } else if (diferenca == 0) {
        System.out.println("Além da diferença ser igual a 0");
        }
    }
}