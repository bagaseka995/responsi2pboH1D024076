public class EWalletPayment implements PaymentMethod {

    // Atribut yang diperlukan
    private String namaLayanan;
    private double saldo;
    private double nominalTransaksi;

    public EWalletPayment(String namaLayanan, double saldo, double nominalTransaksi) {
        this.namaLayanan = namaLayanan;
        this.saldo = saldo;
        this.nominalTransaksi = nominalTransaksi;
    }

    @Override
    public void processPayment() {
        if (saldo >= nominalTransaksi) {
            saldo = saldo - nominalTransaksi;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return 2000.0;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}