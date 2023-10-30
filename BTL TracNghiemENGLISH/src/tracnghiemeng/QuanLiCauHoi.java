/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemeng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLiCauHoi {

    private List<CauHoi> cauhoi;
    private String LABEL = String.format("%s\t%-15s\t%-15s",
            "Chu De", "Noi dung", "Cap do");

    public QuanLiCauHoi() {
        this.cauhoi = new ArrayList<>();
    }

    public void themCauHoi(CauHoi q) {
        this.getCauhoi().add(q);
    }

    public void xuatDanhSach() {
        cauhoi.forEach(cauHoi -> {
            System.out.print(cauHoi);
        });
    }

    public void xuatNoiDung() {
        for (int i = 0; i < this.cauhoi.size(); i++) {
            System.out.printf("%d) %s\n", i + 1, this.cauhoi.get(i).getNoiDung());
        }

    }

    public QuanLiCauHoi traCuuTheoDoKho(int doKho) {
        QuanLiCauHoi result = new QuanLiCauHoi();
        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi.getCapDo() == doKho) {
                result.themCauHoi(cauHoi);
            }
        }

        return result;
    }

    public QuanLiCauHoi traCuuTheoNoiDung(String nd) {
        QuanLiCauHoi result = new QuanLiCauHoi();

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi.getNoiDung().toLowerCase().contains(nd.toLowerCase())) {
                result.themCauHoi(cauHoi);
            }
        }

        return result;
    }

    public QuanLiCauHoi traCuuTheoChuDe(String chuDe) {
        QuanLiCauHoi result = new QuanLiCauHoi();

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi.getChuDe().toLowerCase().contains(chuDe.toLowerCase())) {
                result.themCauHoi(cauHoi);
            }
        }

        return result;
    }

    public QuanLiCauHoi danhSachTheoMultipleChoice(int n) {
        QuanLiCauHoi result = new QuanLiCauHoi();
        int dem = 0;

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi instanceof MultipleChoice && dem < n) {
                dem++;
                result.themCauHoi(cauHoi);
            }
        }

        return result;
    }


    public CauHoi ngauNhienInComplete(int doKho) {
        QuanLiCauHoi result = new QuanLiCauHoi();

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi instanceof InComplete && cauHoi.getCapDo() == doKho) {
                result.themCauHoi(cauHoi);
            }
        }

        int sl = (int) ((Math.random() * (result.getCauhoi().size() - 0)) + 0);
        return result.getCauhoi().get(sl);
    }

    public CauHoi ngauNhienConversation(int doKho) {
        QuanLiCauHoi result = new QuanLiCauHoi();

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi instanceof Conversation && cauHoi.getCapDo() == doKho) {
                result.themCauHoi(cauHoi);
            }
        }

        int sl = (int) ((Math.random() * (result.getCauhoi().size() - 0)) + 0);
        return result.getCauhoi().get(sl);
    }

    public int soLuongMultipleChoice() {
        int dem = 0;

        for (CauHoi cauHoi : cauhoi) {
            if (cauHoi instanceof MultipleChoice) {
                dem++;
            }
        }

        return dem;
    }

    public void thucThi() {
        for (CauHoi cauHoi : cauhoi) {
            cauHoi.thucThi();
        }
    }

    /**
     * @return the cauhoi
     */
    public List<CauHoi> getCauhoi() {
        return cauhoi;
    }

    /**
     * @param cauhoi the cauhoi to set
     */
    public void setCauhoi(List<CauHoi> cauhoi) {
        this.cauhoi = cauhoi;
    }

}
