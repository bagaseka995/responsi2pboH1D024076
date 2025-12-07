public class PaymentTest {

    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        double saldoAwal = 150000;
        double bayar = 50000;
        EWalletPayment eWallet = new EWalletPayment("OVO", saldoAwal, bayar);

        System.out.println("Saldo awal: " + (int)eWallet.getBalance()); // Casting ke int biar rapi
        System.out.println("Memproses pembayaran sebesar " + (int)bayar + "...");

        eWallet.processPayment();

        System.out.println("Sisa saldo: " + (int)eWallet.getBalance());

        System.out.println("Detail Transaksi: " + eWallet.getPaymentDetails());
    }
}