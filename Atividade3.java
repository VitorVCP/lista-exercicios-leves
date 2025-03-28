import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, beleza, carisma;
        System.out.println("Dê a nota para seu parceiro ou parceira. (de 0 a 10) \n Altura, beleza e carisma");
        altura = sc.nextInt();
        beleza = sc.nextInt();
        carisma = sc.nextInt();

        if (altura > 7 && beleza > 7 && carisma > 7) {
System.out.println("Booooraa");
        } else if ((altura > 7 && beleza > 7 && carisma <= 7) || (altura > 7 && beleza > 7 && carisma <= 7) || ((altura <= 7 && beleza > 7 && carisma > 7))) {
            System.out.println("Só vai...");
        } else if ((altura > 7 && beleza <= 7 && carisma <= 7) || (altura <= 7 && beleza > 7 && carisma <= 7) || ((altura <= 7 && beleza <= 7 && carisma > 7))) {
            System.out.println("Fé em Deus...");
        } else {
            System.out.println("Misericórdia");
        }
    }
}