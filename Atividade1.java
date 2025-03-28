import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Float nota, frequencia, presenca;
        System.out.println("Qual a nota do aluno? ");
        Scanner scanner = new Scanner(System.in);
        nota = scanner.nextFloat();
        System.out.println("Qual a frequência do aluno em %? ");
        frequencia = scanner.nextFloat();
         presenca = frequencia / 100;

        if (nota >= 7  && presenca >= 0.75) {
        System.out.println("APROVADO");
        } else if (nota < 4 || presenca < 0.75) {
            System.out.println("REPROVADO");
        } else if ((nota < 7 && nota > 4) && presenca >= 0.75) {
        System.out.println("EM RECUPERAÇÃO");
        } else 
        System.out.println("Ocorreu um erro, tente novamente.");
    }
}