package pekan1_2511533018;

public class Mobil_2511533018 {

    private String Nama;

    private int Tahun;
    
    private int Cc;

    private int Harga;

    private String Merk;

    public Mobil_2511533018(
        String nama,
        int tahun,
        int cc,
        int harga,
        String merk)
    {
        Nama = nama;
        Tahun = tahun;
        Cc = cc;
        Harga = harga;
        Merk = merk;
    }

    public void SetNama(String nama)
    {
        Nama = nama;
    }

    public void SetTahun(int tahun)
    {
        Tahun = tahun;
    }

    public void SetCc(int cc)
    {
        Cc = cc;
    }

    public void SetHarga(int harga)
    {
        Harga = harga;
    }

    public void SetMerk(String merk)
    {
        Merk = merk;
    }

    public String GetNama()
    {
        return Nama;
    }

    public int GetTahun()
    {
        return Tahun;
    }

    public int GetCc()
    {
        return Cc;
    }

    public int GetHarga()
    {
        return Harga;
    }

    public String GetMerk()
    {
        return Merk;
    }
}

