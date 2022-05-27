import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yaricapi Giriniz : ");
        double r = input.nextDouble();
        System.out.print("Acı Degerini Giriniz : ");
        double alfa = input.nextDouble();
        System.out.println("Alan = " + (3.14*r*r*alfa/360));


    }
}
