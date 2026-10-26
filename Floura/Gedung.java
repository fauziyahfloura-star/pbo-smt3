package Floura;

public abstract class Gedung {
    private String nama;
    private String lokasi;

    public Gedung(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    // Method overloading
    public void tampilkanInfo(String catatan) {
        tampilkanInfo();
        System.out.println("Catatan: " + catatan);
    }

    public abstract void tampilkanInfo();
}
