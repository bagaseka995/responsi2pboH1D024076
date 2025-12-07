public class UjiGalaksi {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");
        System.out.println();

        System.out.println("--- PESAWAT TEMPUR ---");

        PesawatTempur astraFury = new PesawatTempur("Astra-Fury", 2, 8);

        astraFury.aktifkanMesin();
        astraFury.jelajah(10);
        astraFury.jelajah(30);
        astraFury.tembakRudal(3);
        astraFury.tampilStatus();

        System.out.println();

        System.out.println("--- KAPAL EKSPLORASI ---");

        KapalEksplorasi voyagerX = new KapalEksplorasi("Voyager X", 10, 4);

        voyagerX.aktifkanMesin();
        voyagerX.jelajah(15);
        voyagerX.scanPlanet("Kepler-442b");
        voyagerX.tampilStatus();
    }
}