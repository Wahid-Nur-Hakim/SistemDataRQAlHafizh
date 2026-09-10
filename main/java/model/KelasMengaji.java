package model;

public class KelasMengaji {
    private int kodeKelas;
    private String namaKelas;
    private String pengajar;
    private int kapasitas;

    public KelasMengaji(int kodeKelas, String namaKelas, String pengajar, int kapasitas) {
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
        this.pengajar = pengajar;
        this.kapasitas = kapasitas;
    }

    public int getKodeKelas() { return kodeKelas; }
    public String getNamaKelas() { return namaKelas; }
    public String getPengajar() { return pengajar; }
    public int getKapasitas() { return kapasitas; }

    public void setNamaKelas(String namaKelas) {
        if (namaKelas == null || namaKelas.isEmpty()) {
            System.out.println("Nama kelas tidak boleh kosong!");
            return;
        }
        this.namaKelas = namaKelas;
    }

    public void setPengajar(String pengajar) {
        if (pengajar == null || pengajar.isEmpty()) {
            System.out.println("Nama pengajar tidak boleh kosong!");
            return;
        }
        this.pengajar = pengajar;
    }

    public void setKapasitas(int kapasitas) {
        if (kapasitas < 1 || kapasitas > 30) {
            System.out.println("Kapasitas harus antara 1 sampai 30!");
            return;
        }
        this.kapasitas = kapasitas;
    }

    public static String getHeader() {
        return String.format("%-6s | %-20s | %-15s | %-9s",
                "Kode", "Nama Kelas", "Pengajar", "Kapasitas");
    }

    @Override
    public String toString() {
        return String.format("%-6d | %-20s | %-15s | %-9d",
                kodeKelas, namaKelas, pengajar, kapasitas);
    }
}