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
                    quanLyCD.layCDTruocNam(2020);
                    break;
                case 3:
                    System.out.print("Nhap chuoi can tim trong ten CD: ");
                    String chuoi = scanner.nextLine();
                    quanLyCD.timCDCoChuaChu(chuoi);
                    break;
                case 4:
                    quanLyCD.sapXepTheoGiaGiamDan();
                    quanLyCD.xuatDanhSachCD();
                    break;
                case 5:
                    System.out.println("Nhập mã số CD cần xóa:");
                    String maXoa = scanner.nextLine();
                    quanLyCD.xoaCDTheoMaSo(maXoa);
                    break;
                case 6:
                    System.out.println("Nhập mã số CD cần sửa giá:");
                    String maSua = scanner.nextLine();
                    System.out.println("Nhập giá bán mới:");
                    double giaMoi = scanner.nextDouble();
                    quanLyCD.suaGiaBanTheoMaSo(maSua, giaMoi);
                    break;
                case 7:
                    System.out.println("Tổng trị giá các CD: " + quanLyCD.tinhTongTriGia());
                    break;
                case 0:
                    scanner.close();
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
