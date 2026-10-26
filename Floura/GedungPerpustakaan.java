package Floura;

public class GedungPerpustakaan extends Gedung {
    private int kapasitas;

    public GedungPerpustakaan(String nama, String lokasi,
    int kapasitas) {
        super(nama, lokasi);
        this.kapasitas = kapasitas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("\nJenis: Gedung Perpustakaan");
        System.out.println("Nama: " + getNama());
        System.out.println("Lokasi: " + getLokasi());
        System.out.println("Kapasitas pengunjung: " + kapasitas);
    }
}
