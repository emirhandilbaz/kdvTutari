/* 
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV tutarı = 1.8;

KDV'li Fiyat = 11.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. 
*/
package Java.ilKonu.egzersizler;

import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args){
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ücret tutarını giriniz: ");
        tutar = scan.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
             
        System.out.print("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);




    }
    
}
