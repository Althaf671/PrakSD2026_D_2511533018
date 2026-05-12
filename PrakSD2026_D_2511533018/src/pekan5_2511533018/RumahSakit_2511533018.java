package pekan5_2511533018;
import java.util.Scanner;

public class RumahSakit_2511533018 
{
    private Pasien_2511533018 head_3018 = null;
    private int counter_3018 = 0; 

    public void daftarPasien_2511533018(String nama, String keluhan) {
        counter_3018++;
        Pasien_2511533018 baru_3018 = new Pasien_2511533018(nama, keluhan, counter_3018);
        
        if (head_3018 == null) {
            head_3018 = baru_3018;
        } else {
            Pasien_2511533018 temp_3018 = head_3018;
            while (temp_3018.next_3018 != null) {
                temp_3018 = temp_3018.next_3018;
            }
            temp_3018.next_3018 = baru_3018;
        }
        System.out.println("Pasien berhasil didaftarkan, No Antrian: " + counter_3018);
    }

    public void panggilPasien_2511533018() {
        if (head_3018 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memanggil Pasien: " + head_3018.getNama_3018() + " [No: " + head_3018.getNomor_3018() + "]");
        head_3018 = head_3018.next_3018; 
    }

    public void tampilkanAntrian_2511533018() {
        if (head_3018 == null) {
            System.out.println("Tidak ada antrian.");
            return;
        }
        Pasien_2511533018 curr_3018 = head_3018;
        System.out.println("=== Daftar Antrian ===");
        while (curr_3018 != null) {
            System.out.println(curr_3018.getNomor_3018() + ". " + curr_3018.getNama_3018() + " (" + curr_3018.getPenyakit_3018() + ")");
            curr_3018 = curr_3018.next_3018;
        }
    }

    public void cariPasien_2511533018(String namaCari) {
        Pasien_2511533018 curr_3018 = head_3018;
        boolean ketemu_3018 = false;
        while (curr_3018 != null) {
            if (curr_3018.getNama_3018().equalsIgnoreCase(namaCari)) {
                System.out.println("Pasien ditemukan, No Antrian: " + curr_3018.getNomor_3018());
                ketemu_3018 = true;
                break;
            }
            curr_3018 = curr_3018.next_3018;
        }
        if (!ketemu_3018) System.out.println("Data pasien tidak ditemukan.");
    }

    public static void main(String[] args) {
        RumahSakit_2511533018 rs_3018 = new RumahSakit_2511533018();
        Scanner sc_3018 = new Scanner(System.in);
        int pilihan_3018;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533018 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3018 = sc_3018.nextInt();
            sc_3018.nextLine();

            switch (pilihan_3018) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_3018 = sc_3018.nextLine();
                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_3018 = sc_3018.nextLine();
                    rs_3018.daftarPasien_2511533018(nama_3018, keluhan_3018);
                    break;

                case 2:
                    rs_3018.panggilPasien_2511533018();
                    break;

                case 3:
                    rs_3018.tampilkanAntrian_2511533018();
                    break;

                case 4:
                    System.out.print("Masukkan Nama Pasien yang dicari: ");
                    String cari_3018 = sc_3018.nextLine();
                    rs_3018.cariPasien_2511533018(cari_3018);
                    break;

                case 5:
                    if (rs_3018.head_3018 == null) {
                        System.out.println("Antrian kosong.");
                    } else {
                        int total_3018 = 0;
                        Pasien_2511533018 temp_3018 = rs_3018.head_3018;
                        while(temp_3018 != null) {
                            total_3018++;
                            temp_3018 = temp_3018.next_3018;
                        }
                        System.out.println("Jumlah total pasien: " + total_3018);
                        System.out.println("Pasien terdepan: " + rs_3018.head_3018.getNama_3018());
                    }
                    break;

                case 6:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_3018 != 6);
        
        sc_3018.close();
    }
}