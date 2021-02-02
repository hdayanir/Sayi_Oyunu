
import java.util.*;

public class SayiOyunu {

    int bulunacaksayi;
    int sayac=0;
    int hak;
    int girilensayi;
    boolean sayiBulundu;
        private void buyukKucukGoster()
        {
           if(sayac<4){
            if(girilensayi>bulunacaksayi){
                sayac++;
                hak=5-sayac;
                System.out.println("Girdiğiniz sayi buyuk!");
                System.out.println("Lutfen daha kucuk bir sayi girin!");
                System.out.println(hak+" Hakkiniz Kaldi");
                
            }
            else if(girilensayi<bulunacaksayi){
                sayac++;
                hak=5-sayac;
                System.out.println("Girdiğiniz sayi kucuk!");
                System.out.println("Lutfen daha buyuk bir sayi girin!");
                System.out.println(hak+" Hakkiniz Kaldi");
            }
            
            else{
                sayac++;
                System.out.println("Sayi Bulundu!");
                System.out.println(sayac+"Kere de buldunuz!");
                sayiBulundu=true;
                sayac=0;
            }
           }
           else{
             System.out.println("HAKKINIZ BİTTİ!");
             sayiBulundu=true;
             sayac=0;
           }
               
        }   
        public void oyunSorusu ()
        {
            String cevap;
            Scanner klavye = new Scanner(System.in);
            do{
                oyunOyna();
                System.out.println("Bir kez daha oynamak ister misiniz?");
                cevap = klavye.next();
            }
            while(cevap.equalsIgnoreCase("Evet"));
            System.out.println("İyi Bayramlar Caglar!");
        }
        private void oyunaBasla()
        {
            bulunacaksayi=(int)(Math.random()*100+1);
            sayiBulundu=false;
        }
        private void sayiSor ()
        {
            Scanner klavye= new Scanner(System.in);
            do{
                System.out.print("1-100 Arasinda bir sayi giriniz:");
                girilensayi=klavye.nextInt();
            }
            while((girilensayi<1) && (girilensayi>100));
        }
        private void oyunOyna()
        {
            oyunaBasla();
            do{
               sayiSor();
               buyukKucukGoster();
            }
            while(!(sayiBulundu));
        }
}
