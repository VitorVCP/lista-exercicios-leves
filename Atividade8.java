import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double salario, prestacao, porcento;
System.out.println("Qual o seu salário? ");
salario = sc.nextDouble();
System.out.println("Qual a sua prestação? ");
prestacao = sc.nextDouble();
porcento = prestacao * 100 / salario;
if (porcento > 30) {
    System.out.println("Não foi aprovado");
}else if (porcento <= 30) {
    System.out.println("Foi aprovado");
    }
    }
}