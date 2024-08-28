/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class ChuongTrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyCD quanLyCD = new QuanLyCD();

        while (true) {
            System.out.println("\n------ Quan Ly CD ---");
            System.out.println("1. Xuat toan bo CD");
            System.out.println("2. Lay ra cac CD phat hanh truoc nam 2020");
            System.out.println("3. Tim cac CD co ten chua chu 'tinh'");
            System.out.println("4. Sap xep CD theo gia giam dan");
            System.out.println("5. Xoa CD theo ma so");
            System.out.println("6. Sua gia ban CD theo ma so");
            System.out.println("7. Tinh tong tri gia cac CD");
            System.out.println("8. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    quanLyCD.xuatDanhSachCD();
                    break;
                case 2:
                    quanLyCD.tinhTongTriGia();
                    break;
                case 3:
                    quanLyCD.layCDTruocNam(2020);
                    break;
                case 4:
                    quanLyCD.sapXepTheoGiaGiamDan();
                    break;
                case 5:
                    System.out.print("Nhap ma so CD can xoa: ");
                    String xoaMaSo = scanner.nextLine();
                    quanLyCD.xoaCDTheoMaSo(xoaMaSo);
                    break;
                case 6:
                    System.out.print("Nhap ma so CD can sua gia: ");
                    String capNhat = scanner.nextLine();
                    System.out.print("Nhap gia ban moi: ");
                    double giaMoi = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    quanLyCD.suaGiaBanTheoMaSo(capNhat, giaMoi);
                    break;
                case 7:
                    double tongTriGia = quanLyCD.tinhTongTriGia();
                    System.out.println("Tong tri gia cac CD: " + tongTriGia);
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le.Vui long chon lai!");
            }
        }
    }
}
