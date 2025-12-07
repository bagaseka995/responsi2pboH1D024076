public class PesawatTempur extends KendaraanGalaksi {

    private int jumlahRudal;


    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    public void aktifkanMesin() {
        if (levelEnergi < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsiEnergi = jarak * 3;

        if (levelEnergi >= konsumsiEnergi) {
            levelEnergi -= konsumsiEnergi;
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        levelEnergi += jumlah;
        if (levelEnergi > 100) {
            levelEnergi = 100;
        }
        System.out.println("Energi pesawat ditingkatkan menjadi " + levelEnergi + "%.");
    }

    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal! Jumlah rudal tidak cukup.");
        }
    }
}