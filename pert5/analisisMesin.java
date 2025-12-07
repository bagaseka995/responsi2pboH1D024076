public class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] listMesin = new defaultMesin[5];

        listMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");

        listMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0); // Tarik 5.0 sesuai output contoh

        listMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);

        listMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");

        listMesin[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);


        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin m : listMesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin m : listMesin) {
            if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            } else if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin mesinTertinggi = listMesin[0];
        for (int i = 1; i < listMesin.length; i++) {
            if (listMesin[i].nilaiPerforma() > mesinTertinggi.nilaiPerforma()) {
                mesinTertinggi = listMesin[i];
            }
        }
        System.out.println(mesinTertinggi.namaMesin + " \u2192 " + mesinTertinggi.nilaiPerforma());


        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        for (int i = 0; i < listMesin.length - 1; i++) {
            for (int j = 0; j < listMesin.length - i - 1; j++) {
                if (listMesin[j].nilaiPerforma() < listMesin[j + 1].nilaiPerforma()) {
                    defaultMesin temp = listMesin[j];
                    listMesin[j] = listMesin[j + 1];
                    listMesin[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + listMesin[i].namaMesin + " \u2192 " + listMesin[i].nilaiPerforma());
        }
    }
}