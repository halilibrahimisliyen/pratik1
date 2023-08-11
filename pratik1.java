import java.util.Scanner;

public class pratik1{

        public static void main(String[] args){

            System.out.println("Not Ortalaması Hesaplama Uygulamasına Hoşgeldiniz!");
            Scanner input=new Scanner(System.in);
            int mat,trk,mzk,fzk,kmy,trh;
            System.out.print("Lütfen matematik notunuzu giriniz: ");
            mat=input.nextInt(); 
            System.out.print("Lütfen türkçe notunuzu giriniz: ");
            trk=input.nextInt(); 
            System.out.print("Lütfen müzik notunuzu giriniz: ");
            mzk=input.nextInt(); 
            System.out.print("Lütfen fizik notunuzu giriniz: ");
            fzk=input.nextInt(); 
            System.out.print("Lütfen kimya notunuzu giriniz: ");
            kmy=input.nextInt(); 
            System.out.print("Lütfen tarih notunuzu giriniz: ");
            trh=input.nextInt(); 

            double ort=(mat+trk+mzk+fzk+kmy+trh)/6;
            System.out.println("ortalamanız: "+ort);

            boolean netice1=(ort>=60);
            
            String metin=netice1 ? "Başardınız" : "Başaramadınız";
            System.out.println(metin);
            







        }
}



