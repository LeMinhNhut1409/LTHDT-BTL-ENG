/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemeng;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class QuanLiNguoiHoc {

    private ArrayList<NguoiHoc> danhSachNguoiHoc;
    private String LABEL = String.format("%s\t%-20s\t%-15s\t%-15s\t%-15s",
            "ID", "Ho Ten", "Gioi Tinh", "Ngay Sinh", "Que Quan");

    public QuanLiNguoiHoc() {
        this.danhSachNguoiHoc = new ArrayList<>();
    }

    public void them(NguoiHoc nguoiHoc) {
        this.danhSachNguoiHoc.add(nguoiHoc);
    }

    public void xoa(int id) {
        int viTri = QuanLiNguoiHoc.this.tonTai(id);
        if (viTri == -1) {
            System.out.println("error");
        } else {
            this.danhSachNguoiHoc.remove(QuanLiNguoiHoc.this.tonTai(id));
        }
    }

    public int tonTai(int id) {
        for (int i = 0; i < this.danhSachNguoiHoc.size(); i++) {
            if (this.danhSachNguoiHoc.get(i).getId() == id) {
                return i;
            }
        }

        return -1;
    }


    public void capNhat(int id) {
        int viTri = QuanLiNguoiHoc.this.tonTai(id);

        if (viTri == -1) {
            System.out.println("ERROR!!!");
        } else {
            System.out.printf("\nCap nhat thong tin nguoi hoc co ID = %d", id);
            this.danhSachNguoiHoc.get(viTri).nhapDuLieu();
        }
    }

    public void xuatDanhSach() {
        System.out.println(this.LABEL);
        for (NguoiHoc nguoiHoc : danhSachNguoiHoc) {
            System.out.println(nguoiHoc);
        }
    }

    public NguoiHoc getNguoiHoc(int id) {
        for (int i = 0; i < this.danhSachNguoiHoc.size(); i++) {
            if (this.danhSachNguoiHoc.get(i).getId() == id) {
                return this.danhSachNguoiHoc.get(i);
            }
        }

        return null;
    }

    public QuanLiNguoiHoc traCuuTheoTen(String ten) {
        QuanLiNguoiHoc result = new QuanLiNguoiHoc();

        for (NguoiHoc nguoiHoc : danhSachNguoiHoc) {
            if (nguoiHoc.getHoTen().toLowerCase().contains(ten.toLowerCase()) == true) {
                result.them(nguoiHoc);
            }
        }

        return result;
    }

    public QuanLiNguoiHoc traCuuTheoQueQuan(String que) {
        QuanLiNguoiHoc result = new QuanLiNguoiHoc();

        for (NguoiHoc nguoiHoc : danhSachNguoiHoc) {
            if (nguoiHoc.getQueQuan().toLowerCase().contains(que.toLowerCase()) == true) {
                result.them(nguoiHoc);
            }
        }

        return result;
    }

    public QuanLiNguoiHoc traCuuTheoGioiTinh(int gt) {
        QuanLiNguoiHoc result = new QuanLiNguoiHoc();

        for (NguoiHoc nguoiHoc : danhSachNguoiHoc) {
            if (nguoiHoc.getGioiTinh() == gt) {
                result.them(nguoiHoc);
            }
        }

        return result;
    }

    public QuanLiNguoiHoc traCuuTheoNgaySinh(Date ns) {
        QuanLiNguoiHoc result = new QuanLiNguoiHoc();

        for (NguoiHoc nguoiHoc : danhSachNguoiHoc) {
            if (nguoiHoc.getNgaySinh().equals(ns)) {
                result.them(nguoiHoc);
            }
        }

        return result;
    }

}
