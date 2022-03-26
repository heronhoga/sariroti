public class functionTigerExpress {
    public static void identitas (String nama, String alamat){
        System.out.println(nama+", "+alamat);
    }
    public static void ucapan (){
        System.out.println("Hello, terima kasih sudah menggunakan jasa Tiger Express");
    }
    public static String estimasi (String text){
        return text;
    }
    public static String waktu (){
        return "Barang akan diantar dalam waktu 3-7 hari";
    }

    public static void main(String[] args) {
        identitas("Fidel", "Semarang Barat");
        ucapan();
        System.out.println(estimasi("Estimasi harga dari berat barang adalah ()"));
        System.out.println(waktu());
    }
}
