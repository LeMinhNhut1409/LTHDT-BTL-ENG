/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Support {
    Scanner sc = new Scanner(System.in);

    public Date nhapNgayThangNam(String ns) {
        Date ngay = new Date();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngay = df.parse(ns);
        } catch (Exception e) {
            System.out.println("Invalid Date");
        }

        return ngay;
    }

    public String xuatNgayThangNam(Date target) {
        if (target != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

            return formatter.format(target);
        } else {
            return "n/a";
        }
    }

    public Date nhapThangNam(String ns) {
        Date thangNam = new Date();

        SimpleDateFormat df = new SimpleDateFormat("MM/yyyy");
        try {
            thangNam = df.parse(ns);
        } catch (Exception e) {
            System.out.println("Invalid Date");
        }

        return thangNam;
    }

    public String xuatThangNam(Date target) {
        if (target != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy");

            return formatter.format(target);
        } else {
            return "n/a";
        }
    }

    public int getThang(Date target) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM");

        return Integer.parseInt(formatter.format(target));
    }

    public int getNam(Date target) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");

        return Integer.parseInt(formatter.format(target));
    }

    public String chuanHoa(String str) {
        str = str.trim().replaceAll("\\s+", " ");
        String[] arr = str.split(" ");

        String s = "";
        for (String x : arr) {
            s = s + (x.substring(0, 1).toUpperCase() + x.substring(1));
            s = s + " ";
        }

        return s.trim();
    }

    public boolean matchIDBanAn(String maBan) {
        String str = chuanHoa(maBan);
        Pattern pattern = Pattern.compile("B\\d{3}");
        Matcher matcher = pattern.matcher(str);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    // INTEGERs INPUT
    private boolean checkInputInteger(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int number = Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public int inputInteger() {
        String input;

        input = sc.nextLine();

        if (checkInputInteger(input)) {
            return Integer.parseInt(input);
        } else {
            return -1;
        }
    }

    // DOUBLE INPUT
    private boolean checkInputDouble(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double number = Double.parseDouble(strNum);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public double inputDouble() {
        String input;

        input = sc.nextLine();

        if (checkInputDouble(input)) {
            return Double.parseDouble(input);
        } else {
            return -1;
        }
    }
}
