import java.util.Scanner;
public class M3laporan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 123456;
        System.out.print(" Masukkan Password : ");
        int code = sc.nextInt();

        while (code != pin) {
            System.out.println(" Password anda salah");
            System.out.print(" Masukkan Password : ");
            code = sc.nextInt();

        }

        boolean ulang = true;
        while (ulang) {
            System.out.println("|a Tarik Tunai                                  |");
            System.out.println("|b Transfer                                     |");
            System.out.println("|c Info Kartu                                   |");
            System.out.println("  ");
            System.out.print(" choose an option: ");
            String opt = sc.next();

            switch (opt) {
                case "a":
                    System.out.println("| Tarik Tunai                                   |");
                    System.out.print("|  Masukkan Jumlah: Rp");
                    int uang = sc.nextInt();

                    System.out.println("|                                               |");
                    System.out.println("|             TARIK TUNAI BERHASIL              |");
                    System.out.println("|                                               |");
                    System.out.println("|                  TERIMA KASIH                 |");
                    System.out.println("|                                               |");
                    break;

                case "b":
                    System.out.println("|a Antar Rekening                               |");
                    System.out.println("|b Antar Bank                                   |");
                    System.out.println("  ");
                    System.out.print(" choose an option: ");
                    char tf = sc.next().charAt(0);

                    if (tf == 'a') {
                        System.out.print("|  Masukan Nomor Rekening: ");
                        int norek = sc.nextInt();
                        System.out.println("|                                               |");

                        System.out.print("|  Masukan Jumlah: Rp ");
                        int uang1 = sc.nextInt();
                        System.out.println("|                                               |");
                        System.out.println("|               TRANSFER BERHASIL               |");
                        System.out.println("|                                               |");
                        System.out.println("|                  TERIMA KASIH                 |");
                        System.out.println("|                                               |");

                    } else if (tf == 'b') {

                        System.out.println("|                                               |");
                        System.out.println("|a BCA                                          |");
                        System.out.println("|b BNI                                          |");
                        System.out.println("|c BRI                                          |");
                        System.out.println("|d Jago                                         |");
                        System.out.println("|e Mandiri                                      |");
                        System.out.println("|                                               |");
                        System.out.print("  choose an option: ");
                        String bank = sc.next();

                        if (bank.equals("a")) {
                            System.out.println("| BCA                                           |");
                        } else if (bank.equals("b")) {
                            System.out.println("| BNI                                           |");
                        } else if (bank.equals("c")) {
                            System.out.println("| BRI                                           |");
                        } else if (bank.equals("d")) {
                            System.out.println("| Jago                                          |");
                        } else if (bank.equals("e")) {
                            System.out.println("| Mandiri                                       |");
                        }

                        System.out.println("|                                               |");
                        System.out.print("|  Masukan Nomor Rekening: ");
                        int norek = sc.nextInt();

                        System.out.println("|                                               |");
                        System.out.print("|  Masukan Nominal: Rp ");
                        int uang2 = sc.nextInt();

                        System.out.println("|                                               |");
                        System.out.println("|               TRANSFER BERHASIL               |");
                        System.out.println("|                                               |");
                        System.out.println("|                  TERIMA KASIH                 |");
                        System.out.println("|                                               |");
                    }
                    break;

                case "c":
                    System.out.println("|  Info Kartu                                   |");
                    System.out.println("|                                               |");
                    System.out.println("|  Jumlah Saldo: Rp 999999999999                |");
                    System.out.println("|                                               |");
                    System.out.println("|                                               |");
                    System.out.println("|                  TERIMA KASIH                 |");
                    System.out.println("|                                               |");
                    break;

                default:
                    System.out.println("|                                               |");
                    System.out.println("|                Invalid Option                 |");
                    System.out.println("|                                               |");

            }
            System.out.println("|  Apakah ada transaksi lagi ?                  |");
            System.out.println("|                  ya / tidak                   |");
            System.out.print(" choose an option: ");
            String yt = sc.next();

            switch (yt) {
                case "ya":
                    break;
                case "tidak":
                    if (true) {
                        ulang = false;

                    }
                    break;
            }
        }
    }
}