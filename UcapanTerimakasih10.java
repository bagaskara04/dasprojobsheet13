import java.util.Scanner;

public class UcapanTerimakasih10 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan Nama orang : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank You " + nama + "\nMay the force be with you.");
        String ucap = UcapanTambahan(nama);
        System.out.println(ucap);

    }

    public static String UcapanTambahan(String ucapan) {
        ucapan = "Good Luck and Have a Good Day";
        return ucapan;
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
