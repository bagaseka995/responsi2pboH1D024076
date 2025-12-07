public class KapalEksplorasi extends KendaraanGalaksi {

    private int modulScan;

    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    @Override
    public void aktifkanMesin() {
        if (levelEnergi < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsiEnergi = jarak * 2;

        if (levelEnergi >= konsumsiEnergi) {
            levelEnergi -= konsumsiEnergi;
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak cukup untuk perjalanan sejauh itu.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        levelEnergi += jumlah;
        if (levelEnergi > 100) {
            levelEnergi = 100;
        }
        System.out.println("Energi kapal diisi ulang. Level sekarang: " + levelEnergi + "%.");
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}