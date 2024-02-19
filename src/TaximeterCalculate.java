import java.util.Scanner;
public class TaximeterCalculate {
    public static void main(String[] args) {

        //define unit opened price and per km price
         double km, a=2.20, price = 10   ;

        //define Scanner
        Scanner inp=new Scanner(System.in);

        //get values from user
        System.out.print("Alınan Yol (Km): ");
        km=inp.nextDouble();

        //Taximeter opening fee is 10 TL. Taximeter costs 2.20 TL per KM.
        price += km * a;

        //The minimum payable amount is 20 TL. For fares under 20 TL, 20 TL will still be charged.
        price = (price < 20) ? 20: price;
        System.out.println("Toplam Tutar (Tl) : " + price);


    }
}
