import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, salarioliquido, conta1, conta2, conta3, conta4, sobra;
        System.out.println("Qual o valor de seu salário bruto?");
        salario = sc.nextDouble();
        salarioliquido = salario * 81.5 / 100;
        System.out.println("seu salário liquido é de: " + salarioliquido + ", agora digite o valor das suas 4 contas.");
        conta1 = sc.nextDouble();
        conta2 = sc.nextDouble();
        conta3 = sc.nextDouble();
        conta4 = sc.nextDouble();
        sobra = salarioliquido - conta1 - conta2 - conta3 - conta4;
        
        if (sobra > 0) {
System.out.println("Vamos querer guardar na poupança: " + sobra);
        } else if (sobra == 0) {
            System.out.println("Pelo menos não está no vermelho.");
        } else if (sobra < 0) {
            System.out.println("Deus ruim, falta " + sobra + " no pix");
        }
     }
}