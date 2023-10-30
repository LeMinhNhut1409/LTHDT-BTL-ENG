/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemeng;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class CauHoi {
    private static int dem = 0;
    private int STT;
    private String chuDe;
    private String noiDung;
    private int capDo;
    
    Scanner sc = new Scanner(System.in);
    
    {
        dem++;
        this.STT = dem;
    }
    
    public CauHoi(){}
    
    public CauHoi(String noiDung){
        this.noiDung = noiDung;
    }
    
    public CauHoi(String noiDung, int doKho){
        this(noiDung);
        this.capDo = doKho;
    }
    
    /**
     *
     * @param chuDe
     * @param noiDung
     * @param capDo
     */
    public CauHoi(String chuDe, String noiDung, int capDo){
        this.noiDung = noiDung;
        this.capDo = capDo;
        this.chuDe = chuDe;
    }
    
    
    @Override
    public String toString() {
        return String.format("%-15s"
                + "\t%-15s"
                + "\t%-15s\n"
                , this.chuDe
                , this.noiDung
                , this.capDo);
    }
    
    public void addChoice(Choices c) {}
    public void thucThi() {}

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getChuDe() {
        return chuDe;
    }

    public void setChuDe(String chuDe) {
        this.chuDe = chuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getCapDo() {
        return capDo;
    }

    public void setCapDo(int capDo) {
        this.capDo = capDo;
    }  
}
