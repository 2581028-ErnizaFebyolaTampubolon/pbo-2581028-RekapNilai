import java.util.Scanner;

public class RekapNilai {
    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== REKAP NILAI KELAS =====");

        int nomor = 1;
        int jumlahSah = 0;
        double total = 0;
        int nilai;

        // do-while lebih pas karena nilai pertama memang harus diminta dulu sebelum ada yang bisa dinilai.
        do {
            System.out.print("Nilai ke-" + nomor + ": ");
            nilai = scanner.nextInt();

            if (nilai == SELESAI) {
                break;
            }

            nomor++;
        } while (nilai != SELESAI);

        scanner.close();
    }
}