package tracnghiemeng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class InComplete extends CauHoi {

    private List<MultipleChoice> question;
    private int doKho;
    Scanner sc = new Scanner(System.in);

    public InComplete(String content, int doKho) {
        super(content, doKho);
        this.question = new ArrayList<>();
    }
    
    public InComplete(String chuDe, String content, int doKho) {
        super(chuDe, content, doKho);
        this.question = new ArrayList<>();
    }

    public void themCauHoi(MultipleChoice q) {
        this.question.add(q);
    }

    public void thucThi() {
        System.out.println(this.getNoiDung());
        for (int i = 0; i < this.question.size(); i++) {
            System.out.printf("\nTra loi cau hoi so %d: ", i + 1);
            this.question.get(i).thucThi();
        }    
    }

    @Override
    public String toString() {
        String s = super.toString(); //To change body of generated methods, choose Tools | Templates.

        for (MultipleChoice q : this.question) {
            s += q;
        }
        return s;
    }

    /**
     * @return the question
     */
    public List<MultipleChoice> getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(List<MultipleChoice> question) {
        this.question = question;
    }

    public int getDoKho() {
        return doKho;
    }

    public void setDoKho(int doKho) {
        this.doKho = doKho;
    }

    
}
