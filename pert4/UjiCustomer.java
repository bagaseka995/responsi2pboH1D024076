public class UjiCustomer {
    public static void main(String[] args) {

        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        Customer cust1 = new Customer("Budi Santoso", "CST-001", 500000);

        System.out.println("Status: Customer Biasa");
        cust1.tampilkanInfo();

        System.out.println(); // Jarak baris kosong

        Member member1 = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        System.out.println("Status: Member");
        member1.tampilkanInfo();
    }
}