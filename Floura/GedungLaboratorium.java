package Floura;

public class GedungLaboratorium extends Gedung {
    private String jenisLab;

    public GedungLaboratorium(String nama, String lokasi,
                              String jenisLab) {
        super(nama, lokasi);
        this.jenisLab = jenisLab;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("\nJenis: Gedung Laboratorium");
        System.out.println("Nama: " + getNama());
        System.out.println("Lokasi: " + getLokasi());
        System.out.println("Jenis laboratorium: " + jenisLab);
    }
}
