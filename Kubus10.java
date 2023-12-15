import java.util.Scanner;

public class Kubus10 {

    static Scanner sc = new Scanner(System.in);
    static int sisi;
    
    static int vKubus() {
        int volume = sisi*sisi*sisi;
        return volume;
    }
    static int Lpermukaan(){
        int jmlsisi = 6;
        int lperm = jmlsisi * (sisi*sisi);
        System.out.println("Luas Permukaan : "+lperm);
        return lperm;
    }
    public static void main(String[] args) {
        System.out.print("Masukkan sisi kubus : ");
        sisi = sc.nextInt();
        System.out.println("Volume Kubus : " + vKubus());
        Lpermukaan();
    }
}
