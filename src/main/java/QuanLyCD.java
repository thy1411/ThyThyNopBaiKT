
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class QuanLyCD {
    private final ArrayList<CD> danhSachCD;

    // Constructor
    public QuanLyCD() {
        this.danhSachCD = new ArrayList<>();
        khoiTaoDuLieu();
    }

    // Phương thức khởi tạo danh sách CD
    private void khoiTaoDuLieu() {
        danhSachCD.add(new CD("CD01", "Noi buon gac tro", "Quang Linh", 195000, 2018));
        danhSachCD.add(new CD("CD02", "Bai tinh ca dem", "Duc Tuan", 185000, 2021));
        danhSachCD.add(new CD("CD03", "Cau ho chieu que", "Nhieu ca si", 172000, 2022));
        danhSachCD.add(new CD("CD04", "Tinh dau tinh cuoi", "Van Khanh", 139000, 2022));
        danhSachCD.add(new CD("CD05", "Thanh pho mua bay", "Dan Nguyen", 182000, 2019));
    }

    // Phương thức xuất toàn bộ CD
    public void xuatDanhSachCD() {
        for (CD cd : danhSachCD) {
            System.out.println(cd);
        }
    }

    // Phương thức tính tổng trị giá CD trong cửa hàng
    public double tinhTongTriGia() {
        double tong = 0;
        for (CD cd : danhSachCD) {
            tong += cd.getGiaban();
        }
        return tong;
    }

    // Phương thức lấy ra các CD phát hành trước năm 2020
    public void layCDTruocNam(int nam) {
        for (CD cd : danhSachCD) {
            if (cd.getNamphathanh() < nam) {
                System.out.println(cd);
            }
        }
    }

    // Phương thức tìm các CD mà tên CD có chứa chữ "tinh"
    public void timCDCoChuaChu(String chuoi) {
        for (CD cd : danhSachCD) {
            if (cd.getTenCD().toLowerCase().contains(chuoi.toLowerCase())) {
                System.out.println(cd);
            }
        }
    }

    // Phương thức sắp xếp CD theo giá giảm dần
    public void sapXepTheoGiaGiamDan() {
        Collections.sort(danhSachCD, (CD cd1, CD cd2) -> Double.compare(cd2.getGiaban(), cd1.getGiaban()));
    }

    // Phương thức xóa CD theo mã số
    public void xoaCDTheoMaSo(String maso) {
        Iterator<CD> iterator = danhSachCD.iterator();
        while (iterator.hasNext()) {
            CD cd = iterator.next();
            if (cd.getMaso().equalsIgnoreCase(maso)) {
                iterator.remove();
                System.out.println("Da xoa CD co ma so: " + maso);
                return;
            }
        }
        System.out.println("Khong tim thay ma so: " + maso);
    }

    // Phương thức sửa giá bán của CD theo mã số
    public void suaGiaBanTheoMaSo(String maso, double giaMoi) {
        for (CD cd : danhSachCD) {
            if (cd.getMaso().equalsIgnoreCase(maso)) {
                cd.setGiaban(giaMoi);
                System.out.println("Da cap nhat gia moi cho CD co ma so: " + maso);
                return;
            }
        }
        System.out.println("Khong tim thay CD co ma so: " + maso);
    }
}