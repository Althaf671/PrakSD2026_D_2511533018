package pekan1_2511533018;

public class MobilDriver_2511533018 {

    private Mobil_2511533018[] koleksiMobil; 

    private static int jumlah = 0;

    public MobilDriver_2511533018()
    {
        koleksiMobil = new Mobil_2511533018[5];
    }

    public static void main(String[] args)
    {
        MobilDriver_2511533018 driver = new MobilDriver_2511533018();

        driver.TambahMobil("BMW M4", 2022, 2000, 1500000000, "BMW");
        driver.TambahMobil("Volvo S100", 2015, 1750, 1000000000, "Volvo");
        driver.TambahMobil("Avanze", 2007, 1200, 12000000, "Toyota");

        driver.HapusMobil(1);
    }
    
    public void TambahMobil(
        String nama,
        int tahun,
        int cc,
        int harga,
        String merk)
    {
        if (jumlah < koleksiMobil.length)
        {
            koleksiMobil[jumlah] = new Mobil_2511533018(nama, tahun, cc, harga, merk);
            jumlah++;
            System.out.println("Sukses menambahkan mobil dengan nama: " + nama);
        }
        
        return;
    }

    public void HapusMobil(int idx)
    {
        if (idx < 0 || idx >= jumlah)
        {
            System.out.println("Input index invalid");
            return;
        }

        for (int i = idx; i < jumlah - 1; i++)
        {
            koleksiMobil[i] = koleksiMobil[i + 1];
        }

        koleksiMobil[jumlah - 1] = null;
        jumlah--;

        System.out.println("Sukses menghapsu mobil.");
        return;
    }
}



