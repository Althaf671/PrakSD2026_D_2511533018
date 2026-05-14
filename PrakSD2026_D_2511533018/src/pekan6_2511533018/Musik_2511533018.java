package pekan6_2511533018;

import java.util.Scanner;

public class Musik_2511533018 
{
    private Lagu_2511533018 head_3018;
    private Lagu_2511533018 tail_3018;

    public void tambahLagu_3018(String judul_3018, String penyanyi_3018) 
    {
        Lagu_2511533018 laguBaru_3018 = new Lagu_2511533018(judul_3018, penyanyi_3018);
        
        if (head_3018 == null) 
        {
            head_3018 = tail_3018 = laguBaru_3018;
        } 
        else 
        {
            tail_3018.next_3018 = laguBaru_3018;
            laguBaru_3018.prev_3018 = tail_3018;
            tail_3018 = laguBaru_3018;
        }
        
        System.out.println("Lagu '" + judul_3018 + "' berhasil ditambahkan!");
    }

    public void hapusLaguAwal_3018() 
    {
        if (head_3018 == null) 
        {
            System.out.println("Playlist kosong, gagal menghapus.");
            return;
        }
        
        System.out.println("Menghapus lagu: " + head_3018.getJudul_3018());
        
        if (head_3018 == tail_3018) 
        {
            head_3018 = tail_3018 = null;
        } 
        else 
        {
            head_3018 = head_3018.next_3018;
            head_3018.prev_3018 = null;
        }
    }

    public void tampilMaju_3018() 
    {
        if (head_3018 == null) 
        {
            System.out.println("Playlist Kosong.");
            return;
        }
        
        Lagu_2511533018 temp_3018 = head_3018;
        System.out.println("\n--- Playlist (Maju) ---");
        
        while (temp_3018 != null) 
        {
            System.out.println("- " + temp_3018.getJudul_3018() + " (" + temp_3018.getPenyanyi_3018() + ")");
            temp_3018 = temp_3018.next_3018;
        }
    }

    public void tampilMundur_3018() 
    {
        if (tail_3018 == null) 
        {
            System.out.println("Playlist Kosong.");
            return;
        }
        
        Lagu_2511533018 temp_3018 = tail_3018;
        System.out.println("\n--- Playlist (Mundur) ---");
        
        while (temp_3018 != null) 
        {
            System.out.println("- " + temp_3018.getJudul_3018() + " (" + temp_3018.getPenyanyi_3018() + ")");
            temp_3018 = temp_3018.prev_3018;
        }
    }

    public void cariLagu_3018(String judul_3018) 
    {
        Lagu_2511533018 temp_3018 = head_3018;
        boolean ditemukan = false;
        
        while (temp_3018 != null) 
        {
            if (temp_3018.getJudul_3018().equalsIgnoreCase(judul_3018)) 
            {
                System.out.println("Lagu Ditemukan: " + temp_3018.getJudul_3018() + " oleh " + temp_3018.getPenyanyi_3018());
                ditemukan = true;
                break;
            }
            
            temp_3018 = temp_3018.next_3018;
        }
        
        if (!ditemukan) 
        	System.out.println("Lagu dengan judul '" + judul_3018 + "' tidak ada di playlist.");
    }

    public static void main(String[] args) 
    {
        Musik_2511533018 playlist_3018 = new Musik_2511533018();
        Scanner input = new Scanner(System.in);
        int pilihan_3018;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511533018 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3018 = input.nextInt();
            input.nextLine(); 

            switch (pilihan_3018) {
                case 1:
                    System.out.print("Judul: ");
                    String jdl = input.nextLine();
                    System.out.print("Penyanyi: ");
                    String pny = input.nextLine();
                    playlist_3018.tambahLagu_3018(jdl, pny);
                    break;
                case 2:
                	playlist_3018.hapusLaguAwal_3018();
                    break;
                case 3:
                	playlist_3018.tampilMaju_3018();
                    break;
                case 4:
                	playlist_3018.tampilMundur_3018();
                    break;
                case 5:
                    System.out.print("Cari Judul: ");
                    String cari = input.nextLine();
                    playlist_3018.cariLagu_3018(cari);
                    break;
                case 6:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_3018 != 6);
        
        input.close();
    }
}