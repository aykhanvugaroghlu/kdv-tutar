import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armutPrice = 2.14, elmaPrice = 3.67,domatesPrice = 1.11,muzPrice = 0.95,patlicanPrice = 5, totalKg;
        double armut,elma,domates,muz,patlican;

        armut  = input.nextDouble();
        System.out.println(armut * armutPrice);

        elma = input.nextDouble();
        System.out.println(elma * elmaPrice);

        domates = input.nextDouble();

        System.out.println(domates * domatesPrice);
        muz = input.nextDouble();

        System.out.println(muz*muzPrice);
        patlican = input.nextDouble();

        System.out.println(patlican*patlicanPrice);

        totalKg = (armut+elma+domates+muz+patlican);
        System.out.println("Toplam tutar " + totalKg);







    }

}


//    public static void main(String[] args) {
//
//        int km;
//        double perkm=2.20, minper = 10, totalKM;
//
//        Scanner input = new  Scanner(System.in);
//
//                km = input.nextInt();
//
//        totalKM = minper + (km * perkm);
//
//        totalKM = (totalKM<20)? 20: totalKM;
//
//        System.out.println(totalKM);
//
//
//
//
//
//    }
//}



