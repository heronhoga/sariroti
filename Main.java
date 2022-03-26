//import method;

import java.util.Scanner;
public class Main {
    public static void identitas (String nama, String alamat){
        System.out.println("Pesanan untuk "+nama+", dengan tujuan "+alamat);
    }
    public static void ucapan (){
        System.out.println("Hello, terima kasih sudah menggunakan jasa Tiger Express");
    }
    public static String estimasi (String text){
        return text;
    }
    public static String waktu (){
        return "Barang akan diantar dalam waktu 4 hari";
    }

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Scanner sc = new Scanner (System.in);
        System.out.println("Dimensi barang (Dalam satuan cm) ");
        System.out.print("Panjang : ");
        double pjg = sc.nextDouble();
        System.out.print("Lebar : ");
        double lbr = sc.nextDouble();
        System.out.print("Tinggi : ");
        double tgi = sc.nextDouble();
        System.out.print("Berat(kg): ");
        double brt = sc.nextDouble();

        double bv = pjg*lbr*tgi/1000;
        double x1=0;
        double x2=0;

        if (bv >= 10){
            x1 = 15000;
        }
        else if (bv >= 7){
            x1 = 13000;
        }
        else if (bv >= 5){
            x1 = 10000;
        }
        else if (bv >= 3){
            x1 = 7000;
        }
        else if (bv >= 1){
            x1 = 5000;
        }

        if (brt <= 1) {
            x2 = 0;
        }
        else if (brt >=10){
            x2 = 15000;
        }
        else if (brt >= 7){
            x2 = 11000;
        }
        else if (brt >= 5){
            x2 = 9000;
        }
        else if (brt >= 3){
            x2 = 6000;
        }
        else if (brt > 1){
            x2 = 3000;
        }

        double total = x1+x2;
        System.out.println("Harga Rp"+total);

        method objek = new method();
        Scanner input = new Scanner(System.in);

        objek.bayar();
        System.out.println("===============================");

        System.out.print("Masukkan kota tujuan = ");
        String kota = input.nextLine();

//        String print = objek.tujuan(kota);
        System.out.println(objek.tujuan(kota));
        System.out.println("===============================");

        // fungsi
        System.out.print("Nama anda: "); String nama= input.next();
        System.out.println("Alamat: "+kota);
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.print(".");
        }
        System.out.println(" ");
        identitas(nama, kota);
        ucapan();
        System.out.println(estimasi("Estimasi harga dari berat barang adalah "+total));
        System.out.println(waktu());System.out.println("===============================");

        for (int i=1; i<=4; i++ ){
            System.out.println("Pengiriman barang hari ke-" +i);Thread.sleep(1000);
        }
        System.out.println("===============================");
        System.out.println("Barang telah sampai ke tujuan.");
        System.out.println("Beri bintang dan rate aplikasi ini.");
        System.out.println("Terima kasih telah menggunakan jasa Tiger Express.");
    }
}
