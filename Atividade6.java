import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double litros, km, kml;
        System.out.println("Qual a quantidade de quilometros percorridos e a quantidade de litros consumidos");
km = sc.nextDouble();
litros = sc.nextDouble();
kml = km / litros;
if (kml < 8) {
System.out.println("Seu carro é econômico.");
} else if (kml >= 8 && kml <= 12) {
    System.out.println("Seu consumo é moderado.");
} else if (kml > 12) {
    System.out.println("SEu consumo é eficiente.");
}
    }
}