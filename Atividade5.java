import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, ano;
        System.out.println("Qual o seu salário?");
        salario = sc.nextDouble();
        System.out.println("Quanto tempo está na empresa?");
        ano = sc.nextDouble();
        
        if (ano >= 5 && ano < 10) {
System.out.println("Seu salário aumentará 5%, tornando: " + (salario * 105 / 100));
        } else if (ano >= 10) {
        System.out.println("Seu salário aumentará 10%, tornando: " + (salario * 110 / 100));
        } else {
            System.out.println("Espere alguns anos");
        }
    }
} 