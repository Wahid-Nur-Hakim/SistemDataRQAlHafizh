package model;

public class Santri {
    private String nama;
    private int umur;
    private String noTelpWali;
    private KelasMengaji kelasMengaji;

    public Santri(String nama, int umur, String noTelpWali, KelasMengaji kelasMengaji) {
        this.nama = nama;
        this.umur = umur;
        this.noTelpWali = noTelpWali;
        this.kelasMengaji = kelasMengaji;
    }

    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public String getNoTelpWali() { return noTelpWali; }
    public KelasMengaji getKelasMengaji() { return kelasMengaji; }

    public void setKelasMengaji(KelasMengaji kelasMengaji) {
        if (kelasMengaji == null) {
            System.out.println("Kelas mengaji tidak boleh kosong!");
            return;
        }
        this.kelasMengaji = kelasMengaji;
    }

    public static String getHeader() {
        return String.format("%-4s | %-20s | %-5s | %-15s | %-6s",
                "No.", "Nama", "Umur", "No. Telp Wali", "Kode Kelas");
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-5d | %-15s | %-6d",
                nama, umur, noTelpWali, kelasMengaji.getKodeKelas());
    }
}