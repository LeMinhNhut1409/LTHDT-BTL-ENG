/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemeng;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NguoiHoc {
    private static int dem = 0;
    private int id;
    private String username;
    private String password;
    private String hoTen;    
    private int gioiTinh;
    private Date ngaySinh;
    private String queQuan;
    private int diem;

    private static Support sp = new Support();
    private static Scanner sc = new Scanner(System.in);

    {
        dem++;
        this.id = dem;
    }

    public NguoiHoc() {
    }

    public NguoiHoc(String username, String password, String hoTen, int gioiTinh, String ns, String queQuan) {
        this.username = username;
        this.password = password;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = sp.nhapNgayThangNam(ns);
        this.queQuan = queQuan;
    }

    public String toString() {
        return String.format("%d"
                + "\t%-20s"
                + "\t%-15s"
                + "\t%-15s"
                + "\t%-15s", this.id, this.hoTen, this.gioiTinh == 0 ? "Nam" : "Nu", sp.xuatNgayThangNam(this.ngaySinh), this.queQuan);
    }
    
    public void nhapDuLieu(){
        System.out.println("");        
        System.out.print("Ho Ten: ");
        this.hoTen = sc.nextLine();
        
        System.out.print("Gioi Tinh: (Nam: 0, Nu: 1): ");
        this.gioiTinh = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Ngay Sinh (dd/MM/yyyy): ");
        this.ngaySinh = sp.nhapNgayThangNam(sc.nextLine());
        
        System.out.print("Que Quan: ");
        this.queQuan = sc.nextLine();
    }
    
    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        NguoiHoc.dem = dem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
