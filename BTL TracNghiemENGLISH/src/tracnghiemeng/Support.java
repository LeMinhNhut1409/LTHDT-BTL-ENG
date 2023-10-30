/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemeng;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Support {
    Scanner sc = new Scanner(System.in);

    public Date nhapNgayThangNam(String ns) {
        Date ngay = new Date();

        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        try {
            ngay = df.parse(ns);
        } catch (Exception e) {
            System.out.println("Invalid Date");
        }

        return ngay;
    }

    public String xuatNgayThangNam(Date target) {
        if (target != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

            return formatter.format(target);
        } else {
            return "n/a";
        }
    }
}
