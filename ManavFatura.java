import java.util.Scanner;

public class ManavFatura {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, total;
         int kg;

         System.out.print("Kaç Kilo Armut Aldınız:  ");
         Scanner input1 = new Scanner(System.in);
         kg = input1.nextInt();
         armut = kg * armut;

         System.out.print("Kaç Kilo Elma Aldınız:  ");
         Scanner input2 = new Scanner(System.in);
         kg = input2.nextInt();
         elma = kg * elma;

         System.out.print("Kaç Kilo Domates Aldınız:  ");
         Scanner input3 = new Scanner(System.in);
         kg = input3.nextInt();
         domates = kg * domates;

         System.out.print("Kaç Kilo Muz Aldınız:  ");
         Scanner input4 = new Scanner(System.in);
         kg = input4.nextInt();
         muz = kg * muz;

         System.out.print("Kaç Kilo Patlıcan Aldınız:  ");
         Scanner input5 = new Scanner(System.in);
         kg = input5.nextInt();
         patlican = kg * patlican;

         total = armut + elma + domates + muz + patlican;
         System.out.println("Toplam Tutar:  "+total+"₺");
         System.out.println("Alışverinizi Tamamladınız! iyi Günler Dileriz!");

    }
}
