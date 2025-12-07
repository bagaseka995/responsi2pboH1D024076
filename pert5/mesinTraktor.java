public class mesinTraktor extends defaultMesin {
    protected double kapasitasTarik;

    public mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Traktor " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    public double nilaiPerforma() {
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor";
    }

    public void suaraMesin() {
        System.out.println(namaMesin + " \u2192 GGGRRRR! Hidup mesinnn!");
    }
}