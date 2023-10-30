package tracnghiemeng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class MultipleChoice extends CauHoi {

    private static final String[] LABELS = {"A", "B", "C", "D"};
    private List<Choices> choices;

    public MultipleChoice(String chuDe, String noiDung, int doKho) {
        super(chuDe, noiDung, doKho);
        this.choices = new ArrayList<>();
    }

    @Override
    public void addChoice(Choices c) {
        if (this.choices.size() < LABELS.length) {
            this.choices.add(c);
        }
    }

    public boolean checkAnswer(String ans) {
        for (int i = 0; i < this.choices.size(); i++) {
            if (this.choices.get(i).isCorrect() == true
                    && LABELS[i].equals(ans.toUpperCase()) == true) {
                return true;
            }
        }
        return false;
    }

    public void thucThi() {
        System.out.println(this);

        String traLoi;
        System.out.printf("Tra loi cau hoi: ");
        traLoi = sc.nextLine();
        System.out.printf("%b\n", checkAnswer(traLoi));
    }

    @Override
    public String toString() {
        String s = "\n" + super.getNoiDung() + "\n";

        for (int i = 0; i < this.choices.size(); i++) {
            s += String.format("%s.%s\n", LABELS[i], this.choices.get(i));
        }
        return s;
    }

    /**
     * @return the choices
     */
    public List<Choices> getChoices() {
        return choices;
    }

    /**
     * @param choices the choices to set
     */
    public void setChoices(List<Choices> choices) {
        this.choices = choices;
    }
    
    @Override
    public String getChuDe(){
        return super.getChuDe();
    }
}
