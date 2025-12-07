class Manajer extends Karyawan {
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    void tampilInfo() {
        double totalGaji = super.gajiPokok + this.tunjangan;
        System.out.println("Nama: " + super.nama + " | Gaji Pokok: Rp " + super.gajiPokok + " | Tunjangan: Rp " + this.tunjangan);
        System.out.println("Total Pendapatan: Rp " + totalGaji);
    }
}