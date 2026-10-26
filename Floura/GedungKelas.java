package Floura;

public class GedungKelas extends Gedung {
    private int jumlahKelas;

    public GedungKelas(String nama, String lokasi,
                       int jumlahKelas) {
        super(nama, lokasi);
        this.jumlahKelas = jumlahKelas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("\nJenis: Gedung Kelas");
        System.out.println("Nama: " + getNama());
        System.out.println("Lokasi: " + getLokasi());
        System.out.println("Jumlah kelas: " + jumlahKelas);
    }
}
