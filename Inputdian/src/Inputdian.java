import java.util.Scanner;

public class Inputdian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama barang 1   : ");
        String namaBarang1 = scanner.nextLine();
        System.out.print("Harga satuan    : ");
        int hargaBarang1 = scanner.nextInt();
        System.out.print("Jumlah          : ");
        int jumlahBarang1 = scanner.nextInt();
        scanner.nextLine(); // buang sisa newline

        System.out.print("Nama barang 2   : ");
        String namaBarang2 = scanner.nextLine();
        System.out.print("Harga satuan    : ");
        int hargaBarang2 = scanner.nextInt();
        System.out.print("Jumlah          : ");
        int jumlahBarang2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama barang 3   : ");
        String namaBarang3 = scanner.nextLine();
        System.out.print("Harga satuan    : ");
        int hargaBarang3 = scanner.nextInt();
        System.out.print("Jumlah          : ");
        int jumlahBarang3 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Uang dibayar    : ");
        int uangDibayar = scanner.nextInt();

        int subtotalBarang1 = hargaBarang1 * jumlahBarang1;
        int subtotalBarang2 = hargaBarang2 * jumlahBarang2;
        int subtotalBarang3 = hargaBarang3 * jumlahBarang3;

        int totalBelanja = subtotalBarang1 + subtotalBarang2 + subtotalBarang3;
        int kembalian = uangDibayar - totalBelanja;

        scanner.close();
    }
}