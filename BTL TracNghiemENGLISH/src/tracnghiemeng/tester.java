/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiemeng;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class tester {

    public static Scanner sc = new Scanner(System.in);
    public static Support sp = new Support();

    public void Controller() {
        QuanLiCauHoi quanLiCauHoi = new QuanLiCauHoi();

        NguoiHoc h1 = new NguoiHoc("user1", "user1", "Nguyen Huu Nam", 0, "19/9/2001", "Ha Noi");
        NguoiHoc h2 = new NguoiHoc("user2", "user2", "Nguyen Hoang Anh", 0, "17/10/2007", "Ha Noi");
        NguoiHoc h3 = new NguoiHoc("user3", "user3", "Bui Thi Lan", 1, "19/9/2001", "Thai Binh");
        NguoiHoc h4 = new NguoiHoc("user4", "user4", "Nguyen Nhat Sang", 0, "14/3/2001", "Hue");
        NguoiHoc h5 = new NguoiHoc("user5", "user5", "Huynh Nguyen", 0, "16/5/2001", "Quang Nam");

        QuanLiNguoiHoc quanLiNguoiHoc = new QuanLiNguoiHoc();
        quanLiNguoiHoc.them(h1);
        quanLiNguoiHoc.them(h2);
        quanLiNguoiHoc.them(h3);
        quanLiNguoiHoc.them(h4);
        quanLiNguoiHoc.them(h5);

//      MULTIPLECHOIE
        MultipleChoice m1 = new MultipleChoice("Grammar", "What ... your name? (info)", 3);
        Choices m1c1 = new Choices("are", false);
        Choices m1c2 = new Choices("is", true);
        Choices m1c3 = new Choices("it", false);
        Choices m1c4 = new Choices("do", false);
        m1.addChoice(m1c1);
        m1.addChoice(m1c2);
        m1.addChoice(m1c3);
        m1.addChoice(m1c4);

        MultipleChoice m2 = new MultipleChoice("Grammar", " ... old are you? (info)", 3);
        Choices m2c1 = new Choices("How", true);
        Choices m2c2 = new Choices("What", false);
        Choices m2c3 = new Choices("Which", false);
        Choices m2c4 = new Choices("Who", false);
        m2.addChoice(m2c1);
        m2.addChoice(m2c2);
        m2.addChoice(m2c3);
        m2.addChoice(m2c4);

        MultipleChoice m3 = new MultipleChoice("Grammar", "Where ... you born? (info)", 3);
        Choices m3c1 = new Choices("was", false);
        Choices m3c2 = new Choices("have", false);
        Choices m3c3 = new Choices("are", false);
        Choices m3c4 = new Choices("were", true);
        m3.addChoice(m3c1);
        m3.addChoice(m3c2);
        m3.addChoice(m3c3);
        m3.addChoice(m3c4);
        
        MultipleChoice m4 = new MultipleChoice("Tenses", "A computer ... a tool for finding data.(Tech)", 3);
        Choices m4c1 = new Choices("was", false);
        Choices m4c2 = new Choices("have", false);
        Choices m4c3 = new Choices("are", false);
        Choices m4c4 = new Choices("is", true);
        m4.addChoice(m4c1);
        m4.addChoice(m4c2);
        m4.addChoice(m4c3);
        m4.addChoice(m4c4);
        
        MultipleChoice m5 = new MultipleChoice("Tenses", "Computers ... helped people a lot in all fields.(Tech)", 3);
        Choices m5c1 = new Choices("was", false);
        Choices m5c2 = new Choices("have", true);
        Choices m5c3 = new Choices("are", false);
        Choices m5c4 = new Choices("is", false);
        m5.addChoice(m5c1);
        m5.addChoice(m5c2);
        m5.addChoice(m5c3);
        m5.addChoice(m5c4);
        
        MultipleChoice m6 = new MultipleChoice("Tenses", "A LAN is a network that connects computers. (Tech)", 3);
        Choices m6c1 = new Choices("was", false);
        Choices m6c2 = new Choices("have", false);
        Choices m6c3 = new Choices("are", false);
        Choices m6c4 = new Choices("is", true);
        m6.addChoice(m6c1);
        m6.addChoice(m6c2);
        m6.addChoice(m6c3);
        m6.addChoice(m6c4);

        quanLiCauHoi.themCauHoi(m1);
        quanLiCauHoi.themCauHoi(m2);
        quanLiCauHoi.themCauHoi(m3);
        quanLiCauHoi.themCauHoi(m4);
        quanLiCauHoi.themCauHoi(m5);
        quanLiCauHoi.themCauHoi(m6);

//      InComplete
        //Easy
        InComplete i1 = new InComplete("Grammar", "What ... your name? ... name is Nam (info)", 0);

        MultipleChoice i1m1 = new MultipleChoice("eng", "Dien vao cho trong thu (1)", 0);
        Choices i1m1c1 = new Choices("is", true);
        Choices i1m1c2 = new Choices("are", false);
        Choices i1m1c3 = new Choices("were", false);
        Choices i1m1c4 = new Choices("was", false);
        i1m1.addChoice(i1m1c1);
        i1m1.addChoice(i1m1c2);
        i1m1.addChoice(i1m1c3);
        i1m1.addChoice(i1m1c4);

        MultipleChoice i1m2 = new MultipleChoice("Grammar", "Dien vao cho trong thu (2)", 0);
        Choices i1m2c1 = new Choices("His", false);
        Choices i1m2c2 = new Choices("Her", false);
        Choices i1m2c3 = new Choices("My", true);
        Choices i1m2c4 = new Choices("Your", false);
        i1m2.addChoice(i1m2c1);
        i1m2.addChoice(i1m2c2);
        i1m2.addChoice(i1m2c3);
        i1m2.addChoice(i1m2c4);

        i1.themCauHoi(i1m1);
        i1.themCauHoi(i1m2);

        InComplete i2 = new InComplete("Grammar", " ... do you live? I live ... Viet Nam (info)", 0);

        MultipleChoice i2m1 = new MultipleChoice("Grammar", "Dien vao cho trong thu (1)", 0);
        Choices i2m1c1 = new Choices("What", false);
        Choices i2m1c2 = new Choices("Where", true);
        Choices i2m1c3 = new Choices("Who", false);
        Choices i2m1c4 = new Choices("Which", false);
        i2m1.addChoice(i2m1c1);
        i2m1.addChoice(i2m1c2);
        i2m1.addChoice(i2m1c3);
        i2m1.addChoice(i2m1c4);

        MultipleChoice i2m2 = new MultipleChoice("Grammar", "Dien vao cho trong thu (2)", 0);
        Choices i2m2c1 = new Choices("in", true);
        Choices i2m2c2 = new Choices("on", false);
        Choices i2m2c3 = new Choices("at", false);
        Choices i2m2c4 = new Choices("it", false);
        i2m2.addChoice(i2m2c1);
        i2m2.addChoice(i2m2c2);
        i2m2.addChoice(i2m2c3);
        i2m2.addChoice(i2m2c4);

        i2.themCauHoi(i2m1);
        i2.themCauHoi(i2m2);

        //Normal
        InComplete i3 = new InComplete("Tenses", "My friends ... to the zoo but we ... yesterday", 1);

        MultipleChoice i3m1 = new MultipleChoice("Tenses", "Dien vao cho trong thu (1)", 1);
        Choices i3m1c1 = new Choices("didn't go", false);
        Choices i3m1c2 = new Choices("don't go", true);
        Choices i3m1c3 = new Choices("does go", false);
        Choices i3m1c4 = new Choices("doesn't go", false);
        i3m1.addChoice(i3m1c1);
        i3m1.addChoice(i3m1c2);
        i3m1.addChoice(i3m1c3);
        i3m1.addChoice(i3m1c4);

        MultipleChoice i3m2 = new MultipleChoice("Tenses", "Dien vao cho trong thu (2)", 1);
        Choices i3m2c1 = new Choices("were", true);
        Choices i3m2c2 = new Choices("did", false);
        Choices i3m2c3 = new Choices("don't", false);
        Choices i3m2c4 = new Choices("was", false);
        i3m2.addChoice(i3m2c1);
        i3m2.addChoice(i3m2c2);
        i3m2.addChoice(i3m2c3);
        i3m2.addChoice(i3m2c4);

        i3.themCauHoi(i3m1);
        i3.themCauHoi(i3m2);

        InComplete i4 = new InComplete("Tenses", "We ... not allower ... jeans at school", 1);

        MultipleChoice i4m1 = new MultipleChoice("Tenses", "Dien vao cho trong thu (1)", 1);
        Choices i4m1c1 = new Choices("is", false);
        Choices i4m1c2 = new Choices("are", true);
        Choices i4m1c3 = new Choices("was", false);
        Choices i4m1c4 = new Choices("were", false);
        i4m1.addChoice(i4m1c1);
        i4m1.addChoice(i4m1c2);
        i4m1.addChoice(i4m1c3);
        i4m1.addChoice(i4m1c4);

        MultipleChoice i4m2 = new MultipleChoice("Tenses", "Dien vao cho trong thu (2)", 1);
        Choices i4m2c1 = new Choices("to wear", true);
        Choices i4m2c2 = new Choices("wear", false);
        Choices i4m2c3 = new Choices("wearing", false);
        Choices i4m2c4 = new Choices("worn", false);
        i4m2.addChoice(i4m2c1);
        i4m2.addChoice(i4m2c2);
        i4m2.addChoice(i4m2c3);
        i4m2.addChoice(i4m2c4);

        i4.themCauHoi(i4m1);
        i4.themCauHoi(i4m2);

        //Hard
        InComplete i5 = new InComplete("Tenses", "How .... since we .... school?", 2);

        MultipleChoice i5m1 = new MultipleChoice("Tenses", "Dien vao cho trong thu (1)", 2);
        Choices i5m1c1 = new Choices("are you", false);
        Choices i5m1c2 = new Choices("have you", true);
        Choices i5m1c3 = new Choices("have you been", false);
        Choices i5m1c4 = new Choices("were you", false);
        i5m1.addChoice(i5m1c1);
        i5m1.addChoice(i5m1c2);
        i5m1.addChoice(i5m1c3);
        i5m1.addChoice(i5m1c4);

        MultipleChoice i5m2 = new MultipleChoice("Tenses", "Dien vao cho trong thu (2)", 2);
        Choices i5m2c1 = new Choices("left", false);
        Choices i5m2c2 = new Choices("have left", true);
        Choices i5m2c3 = new Choices("has left", false);
        Choices i5m2c4 = new Choices("had left", false);
        i5m2.addChoice(i5m2c1);
        i5m2.addChoice(i5m2c2);
        i5m2.addChoice(i5m2c3);
        i5m2.addChoice(i5m2c4);

        i5.themCauHoi(i5m1);
        i5.themCauHoi(i5m2);

        InComplete i6 = new InComplete("Tenses", "Since we .... in the new house we .... very busy.", 2);

        MultipleChoice i6m1 = new MultipleChoice("Tenses", "Dien vao cho trong thu (1)", 2);
        Choices i6m1c1 = new Choices("move", false);
        Choices i6m1c2 = new Choices("have moved", true);
        Choices i6m1c3 = new Choices("moved", false);
        Choices i6m1c4 = new Choices("has move", false);
        i6m1.addChoice(i6m1c1);
        i6m1.addChoice(i6m1c2);
        i6m1.addChoice(i6m1c3);
        i6m1.addChoice(i6m1c4);

        MultipleChoice i6m2 = new MultipleChoice("Tenses", "Dien vao cho trong thu (2)", 2);
        Choices i6m2c1 = new Choices("is", false);
        Choices i6m2c2 = new Choices("are", true);
        Choices i6m2c3 = new Choices("were", false);
        Choices i6m2c4 = new Choices("have been", false);
        i6m2.addChoice(i6m2c1);
        i6m2.addChoice(i6m2c2);
        i6m2.addChoice(i6m2c3);
        i6m2.addChoice(i6m2c4);

        i6.themCauHoi(i6m1);
        i6.themCauHoi(i6m2);

        quanLiCauHoi.themCauHoi(i1);
        quanLiCauHoi.themCauHoi(i2);
        quanLiCauHoi.themCauHoi(i3);
        quanLiCauHoi.themCauHoi(i4);
        quanLiCauHoi.themCauHoi(i5);
        quanLiCauHoi.themCauHoi(i6);

//Conservation
        Conversation c1 = new Conversation("Success", "Books which give instructions on how to do things are very popular in the United States today.\nThousands of these How-to books are useful. In fact, there are about four thousand books with\ntitles that begin with the words “How to”.One book may tell you how to earn more money.\nAnother may tell you how to save or spend it and another may explain how to give your money away.\n"
                + "\n"
                + "Many How-to books give advice on careers. They tell you how to choose a career and ‘now to succeed in it.\nIf you fail, however, you can buy the book ” How to Turn Failure into Success”. If you would like to\nbecome very rich, you can buy the book “How to Make a Millionaire”.\nIf you never make any money at all, you may need a book called “How to Live on Nothing”.\n"
                + "\n"
                + "One of the most popular types of books is one that helps you with personal problems. If you want\nto have a better love of life, you can read “How to Succeed in Love every Minute of Your Life”.\nIf you are tired of books on happiness, you may prefer books which give step-by-step instructions\non how to redecorate or enlarge a house.\n"
                + "\n"
                + "Why have How-to books become so popular? Probably because life has become so complex. Today people\nhave far more free time to use, more choices to make, and more problems to solve. How-to books help\npeople deal with modern life.", 0);

        MultipleChoice c1m1 = new MultipleChoice("Success", "What is the passage mainly about?", 0);
        Choices c1m1v1 = new Choices("How to succeed in love every minute of your life.", false);
        Choices c1m1v2 = new Choices("How to turn failure into success.", false);
        Choices c1m1v3 = new Choices("How to make a millionaire.", false);
        Choices c1m1v4 = new Choices("How-to books.", true);
        c1m1.addChoice(c1m1v1);
        c1m1.addChoice(c1m1v2);
        c1m1.addChoice(c1m1v3);
        c1m1.addChoice(c1m1v4);

        MultipleChoice c1m2 = new MultipleChoice("Success", "The word “it” in paragraph 2 refers to _________", 0);
        Choices c1m2v1 = new Choices("advice ", false);
        Choices c1m2v2 = new Choices("instruction ", true);
        Choices c1m2v3 = new Choices("how-to books ", false);
        Choices c1m2v4 = new Choices("career", false);
        c1m2.addChoice(c1m2v1);
        c1m2.addChoice(c1m2v2);
        c1m2.addChoice(c1m2v3);
        c1m2.addChoice(c1m2v4);

        MultipleChoice c1m3 = new MultipleChoice("Success", "Which of the following is NOT the type of books giving information on careers?", 0);
        Choices c1m3v1 = new Choices("“How to Succeed in Love every Minute of Your Life”.", true);
        Choices c1m3v2 = new Choices("“How to Live on Nothing”", false);
        Choices c1m3v3 = new Choices("“How to Make a Millionaire”.", false);
        Choices c1m3v4 = new Choices("“How to Turn Failure into Success”", false);
        c1m3.addChoice(c1m3v1);
        c1m3.addChoice(c1m3v2);
        c1m3.addChoice(c1m3v3);
        c1m3.addChoice(c1m3v4);

        MultipleChoice c1m4 = new MultipleChoice("Success", "The word “step-by-step” in paragraph 3 is closest in meaning to", 0);
        Choices c1m4v1 = new Choices("little by little", false);
        Choices c1m4v2 = new Choices("gradually", true);
        Choices c1m4v3 = new Choices("slower and slower", false);
        Choices c1m4v4 = new Choices("A and B", false);
        c1m4.addChoice(c1m4v1);
        c1m4.addChoice(c1m4v2);
        c1m4.addChoice(c1m4v3);
        c1m4.addChoice(c1m4v4);

        MultipleChoice c1m5 = new MultipleChoice("Success", "It can be inferred from the passage that", 0);
        Choices c1m5v1 = new Choices("Today people are more bored with the modern life.", false);
        Choices c1m5v2 = new Choices("Modern life is more difficult to deal with.", true);
        Choices c1m5v3 = new Choices("Today people have fewer choices to make.", false);
        Choices c1m5v4 = new Choices("Today people are more interested in modern life.", false);
        c1m5.addChoice(c1m5v1);
        c1m5.addChoice(c1m5v2);
        c1m5.addChoice(c1m5v3);
        c1m5.addChoice(c1m5v4);

        c1.themCauHoi(c1m1);
        c1.themCauHoi(c1m2);
        c1.themCauHoi(c1m3);
        c1.themCauHoi(c1m4);
        c1.themCauHoi(c1m5);

        Conversation c2 = new Conversation("Entertainment", "Most of us tend to think of production when we think of mass media industries. After all, it\n"
                + "is the output of this production – the papers we read, the cable TV shows we watch – that grab our\n"
                + "attention, make us happy or angry, interested or bored. Moreover, most public discussion about\n"
                + "mass communication tends to be about production. The latest gossip about that actor will be in\n"
                + "what film, the angry comments a mayor makes about the violence on local TV news, the newest\n"
                + "CDs by an up-and-coming group – these are the kinds of topics that focus our attention on the\n"
                + "making of content, not its distribution or exhibition.\n"
                + "Media executives know, however, that production is only one step in the arduous and risky\n"
                + "process of getting a mass media idea to an audience. Distribution is the delivery of the produced\n"
                + "material to the point where it will be shown to its intended audience. The activity takes place out of\n"
                + "public view. We have already mentioned the NBC acts as a distributor when it disseminates\n"
                + "television programming via satellite to TV stations. When Philadelphia Newspapers Inc. delivers\n"
                + "its Philadelphia Inquirer to city newsstands, when Twentieth – Century – Fox moves its Musicland\n"
                + "stores, they are involved in distribution to exhibitions.", 2);

        MultipleChoice c2m1 = new MultipleChoice("Entertainment", "In this passage, “arduous” means .", 2);
        Choices c2m1v1 = new Choices("difficult", true);
        Choices c2m1v2 = new Choices("lucrative", false);
        Choices c2m1v3 = new Choices("lengthy", false);
        Choices c2m1v4 = new Choices("free", false);
        c2m1.addChoice(c2m1v1);
        c2m1.addChoice(c2m1v2);
        c2m1.addChoice(c2m1v3);
        c2m1.addChoice(c2m1v4);

        MultipleChoice c2m2 = new MultipleChoice("Entertainment", "The passage states that people tend to focus on production because .", 2);
        Choices c2m2v1 = new Choices("it takes place out of public view ", false);
        Choices c2m2v2 = new Choices("mass media companies do not own production divisions ", false);
        Choices c2m2v3 = new Choices("the output of mass media is intended to grab our attention", true);
        Choices c2m2v4 = new Choices("companies can function as both producers and distributors", false);
        c2m2.addChoice(c2m2v1);
        c2m2.addChoice(c2m2v2);
        c2m2.addChoice(c2m2v3);
        c2m2.addChoice(c2m2v4);

        MultipleChoice c2m3 = new MultipleChoice("Entertainment", "In this passage, to “disseminate” means to __ .", 2);
        Choices c2m3v1 = new Choices("create", false);
        Choices c2m3v2 = new Choices("send out", true);
        Choices c2m3v3 = new Choices("take in", false);
        Choices c2m3v4 = new Choices("fertilize", false);
        c2m3.addChoice(c2m3v1);
        c2m3.addChoice(c2m3v2);
        c2m3.addChoice(c2m3v3);
        c2m3.addChoice(c2m3v4);

        MultipleChoice c2m4 = new MultipleChoice("Entertainment", "This passage states that distribution is .", 2);
        Choices c2m4v1 = new Choices("the first step in mass media production", false);
        Choices c2m4v2 = new Choices("the most talked-about step in mass media production", false);
        Choices c2m4v3 = new Choices("at least as important as production", true);
        Choices c2m4v4 = new Choices("not as important as exhibition", false);
        c2m4.addChoice(c2m4v1);
        c2m4.addChoice(c2m4v2);
        c2m4.addChoice(c2m4v3);
        c2m4.addChoice(c2m4v4);

        MultipleChoice c2m5 = new MultipleChoice("Entertainment", "The author’s purpose in writing this passage is to .", 2);
        Choices c2m5v1 = new Choices("tell an interesting story", false);
        Choices c2m5v2 = new Choices("define a concept clearly", true);
        Choices c2m5v3 = new Choices("describe a scene vividly", false);
        Choices c2m5v4 = new Choices("argue with the reader", false);
        c2m5.addChoice(c2m5v1);
        c2m5.addChoice(c2m5v2);
        c2m5.addChoice(c2m5v3);
        c2m5.addChoice(c2m5v4);

        c2.themCauHoi(c2m1);
        c2.themCauHoi(c2m2);
        c2.themCauHoi(c2m3);
        c2.themCauHoi(c2m4);
        c2.themCauHoi(c2m5);

        Conversation c3 = new Conversation("Entertainment", "When we were in England last year, I went fishing with my friend, Peter. Early in the\n"
                + "morning we were sitting quietly by the side of the lake when we had an unpleasant surprise. We\n"
                + "saw a duck come along with three ducklings padding cheerfully behind her. As we watched them,\n"
                + "there was a sudden swirl in the water. We caught a glimpse of the vicious jaws of a pike – a fish\n"
                + "which is rather like a freshwater shark – and one of the ducklings was dragged below the surface.\n"
                + "This incident made Peter furious. He vowed to catch the pike. On three successive\n"
                + "mornings we returned to the vicinity and used several different kinds of bait. On the third day\n"
                + "Peter was lucky. Using an artificial frog as bait, he managed to hook the monster. There was a\n"
                + "desperate fight but Peter was determined to capture the pike and succeeded. When he had got it\n"
                + "ashore and killed it, he wieghed the fish and found that it scaled nearly thirty pounds\n"
                + "– a record for that district.", 1);

        MultipleChoice c3m1 = new MultipleChoice("Entertainment", "Why do you think Peter was sitting quietly by the lake?", 1);
        Choices c3m1v1 = new Choices("He was watching the ducks.", false);
        Choices c3m1v2 = new Choices("He wasn’t very talkative.", false);
        Choices c3m1v3 = new Choices("He was waiting for the pike to appear.", false);
        Choices c3m1v4 = new Choices("He was fishing", true);
        c3m1.addChoice(c3m1v1);
        c3m1.addChoice(c3m1v2);
        c3m1.addChoice(c3m1v3);
        c3m1.addChoice(c3m1v4);

        MultipleChoice c3m2 = new MultipleChoice("Entertainment", "To what does surprise in line 3 probably refer?", 1);
        Choices c3m2v1 = new Choices("to the duck.", false);
        Choices c3m2v2 = new Choices("to the ducklings.", false);
        Choices c3m2v3 = new Choices("to the action of the pike.", true);
        Choices c3m2v4 = new Choices("to the time of the day", false);
        c3m2.addChoice(c3m2v1);
        c3m2.addChoice(c3m2v2);
        c3m2.addChoice(c3m2v3);
        c3m2.addChoice(c3m2v4);

        MultipleChoice c3m3 = new MultipleChoice("Entertainment", "What were Peter’s feelings about the incident two days later?", 1);
        Choices c3m3v1 = new Choices("He caught and killed the pike.", false);
        Choices c3m3v2 = new Choices("He vowed that he would catch the remaining ducklings", true);
        Choices c3m3v3 = new Choices("He remained determined to catch the pike.", false);
        Choices c3m3v4 = new Choices("He caught a frog and used it as bait for the pike.", false);
        c3m3.addChoice(c3m3v1);
        c3m3.addChoice(c3m3v2);
        c3m3.addChoice(c3m3v3);
        c3m3.addChoice(c3m3v4);

        MultipleChoice c3m4 = new MultipleChoice("Entertainment", "How much was the pike worth?", 1);
        Choices c3m4v1 = new Choices("about thirty pounds.", false);
        Choices c3m4v2 = new Choices("about two hundred and forty dollars.", false);
        Choices c3m4v3 = new Choices("the passage contains no information on this point.", true);
        Choices c3m4v4 = new Choices("the passage says that the fish scaled nearly thirty pound.", false);
        c3m4.addChoice(c3m4v1);
        c3m4.addChoice(c3m4v2);
        c3m4.addChoice(c3m4v3);
        c3m4.addChoice(c3m4v4);

        MultipleChoice c3m5 = new MultipleChoice("Entertainment", "Which of the following titles best sums up the whole passage?", 1);
        Choices c3m5v1 = new Choices("Mysterious disappearance of ducklings.", false);
        Choices c3m5v2 = new Choices("Revenge on a duck.", true);
        Choices c3m5v3 = new Choices("Record pike caught by an angry fisherman.", false);
        Choices c3m5v4 = new Choices("Huge pike caught by fisherman after desperate struggle atsea.", false);
        c3m5.addChoice(c3m5v1);
        c3m5.addChoice(c3m5v2);
        c3m5.addChoice(c3m5v3);
        c3m5.addChoice(c3m5v4);

        c3.themCauHoi(c3m1);
        c3.themCauHoi(c3m2);
        c3.themCauHoi(c3m3);
        c3.themCauHoi(c3m4);
        c3.themCauHoi(c3m5);

        quanLiCauHoi.themCauHoi(c1);
        quanLiCauHoi.themCauHoi(c3);
        quanLiCauHoi.themCauHoi(c2);

        int choiceMenuChinh, choiceNguoiHoc, choiceLoaiCauHoi, choiceQuanLiCauHoi;
        boolean mainThread, threadNguoiHoc, threadLamBai, threadCauHoi;

        mainThread = true;

        // MENU CHINH
        while (mainThread) {
            threadNguoiHoc = threadLamBai = threadCauHoi = true;
            posMenuChinh:
            menuChinh();
            choiceMenuChinh = sc.nextInt();

            switch (choiceMenuChinh) {
                case 1:
                    while (threadNguoiHoc) {
                        menuNguoiHoc();
                        choiceNguoiHoc = sc.nextInt();

                        switch (choiceNguoiHoc) {
                            case 1:
                                System.out.println("Danh sach nguoi hoc la: ");
                                quanLiNguoiHoc.xuatDanhSach();
                                break;
                            case 2:
                                System.out.print("Nhap ngay sinh can tra cuu: ");
                                sc.nextLine();
                                Date ns;
                                ns = sp.nhapNgayThangNam(sc.nextLine());
                                quanLiNguoiHoc.traCuuTheoNgaySinh(ns).xuatDanhSach();

                                break;
                            case 3:
                                System.out.print("Nhap ten can tra cuu: ");
                                sc.nextLine();
                                String ten = sc.nextLine();
                                System.out.println("Danh sach sau khi tra cuu theo ten la: ");
                                quanLiNguoiHoc.traCuuTheoTen(ten).xuatDanhSach();

                                break;
                            case 4:
                                System.out.print("Nhap que quan can tra cuu: ");
                                sc.nextLine();
                                String quequan = sc.nextLine();

                                System.out.println("Danh sach sau khi tra cuu theo que quan la: ");
                                quanLiNguoiHoc.traCuuTheoQueQuan(quequan).xuatDanhSach();
                                break;
                            case 5:
                                System.out.print("Nhap gioi tinh can tra cuu (Nam: 0, Nu: 1): ");
                                int gioitinh = sc.nextInt();

                                System.out.println("Danh sach sau khi tra cuu theo gioi tinh la: ");
                                quanLiNguoiHoc.traCuuTheoGioiTinh(gioitinh).xuatDanhSach();
                                break;
                            case 6:
                                System.out.println("Them hoc vien moi");
                                NguoiHoc hocVienMoi = new NguoiHoc();
                                hocVienMoi.nhapDuLieu();
                                quanLiNguoiHoc.them(hocVienMoi);

                                break;
                            case 7:
                                System.out.println("\nCap nhat thong tin nguoi hoc");
                                quanLiNguoiHoc.xuatDanhSach();

                                System.out.print("\nId can cap nhat: ");
                                int id = sc.nextInt();

                                System.out.println(quanLiNguoiHoc.getNguoiHoc(id));
                                quanLiNguoiHoc.capNhat(id);
                                break;
                            case 8:
                                System.out.println("\nXoa thong tin nguoi hoc");
                                quanLiNguoiHoc.xuatDanhSach();
                                System.out.print("\nId can xoa: ");
                                int ID = sc.nextInt();
                                quanLiNguoiHoc.xoa(ID);
                                break;
                            case 0:
                                threadNguoiHoc = false;
                                break;
                            default:
                                System.out.println("Loi!");
                                break;
                        }
                    }
                    break;

                case 2:
                    while (threadCauHoi) {
                        menuQuanLiCauHoi();
                        choiceQuanLiCauHoi = sc.nextInt();

                        switch (choiceQuanLiCauHoi) {
                            case 1:
                                quanLiCauHoi.xuatNoiDung();
                                break;
                            case 2:
                                System.out.print("\nNoi dung can tra cuu: ");
                                sc.nextLine();
                                String noiDungTraCuu = sc.nextLine();
                                quanLiCauHoi.traCuuTheoNoiDung(noiDungTraCuu).xuatNoiDung();
                                break;
                            case 3:
                                System.out.print("\nChu de can tra cuu: ");
                                sc.nextLine();
                                String chuDeTraCuu = sc.nextLine();
                                quanLiCauHoi.traCuuTheoChuDe(chuDeTraCuu).xuatNoiDung();
                                break;
                            case 4:
                                System.out.print("Do kho (De: 0, Trung Binh: 1, Kho: 2): ");
                                int doKhoTraCuu = sc.nextInt();
                                quanLiCauHoi.traCuuTheoDoKho(doKhoTraCuu).xuatNoiDung();
                                break;
                            case 0:
                                threadCauHoi = false;
                                break;
                            default:
                                System.out.println("LOI !!!");
                                break;
                        }
                    }
                    break;

                case 3:
                    while (threadLamBai) {
                        menuChonCauHoi();
                        choiceLoaiCauHoi = sc.nextInt();

                        switch (choiceLoaiCauHoi) {
                            case 1:
                                int soCauMultiple;
                                System.out.print("So luong cau hoi muon lam: ");
                                soCauMultiple = sc.nextInt();

                                if (soCauMultiple > quanLiCauHoi.soLuongMultipleChoice()) {
                                    System.out.println("\nSo luong cau hoi khong du");
                                } else {
                                    quanLiCauHoi.danhSachTheoMultipleChoice(soCauMultiple).thucThi();
                                }
                                break;

                            case 2:
                                int doKho;
                                System.out.print("Do kho (De: 0, Trung Binh: 1, Kho: 2): ");
                                doKho = sc.nextInt();

                                quanLiCauHoi.ngauNhienInComplete(doKho).thucThi();
                                break;

                            case 3:
                                int dokho;
                                System.out.print("Do kho (De: 0, Trung Binh: 1, Kho: 2): ");
                                dokho = sc.nextInt();

                                quanLiCauHoi.ngauNhienConversation(dokho).thucThi();
                                break;

                            case 0:
                                threadLamBai = false;
                                break;

                            default:
                                System.out.println("LOI !!!");
                                break;
                        }
                    }
                    break;

                case 0:
                    mainThread = false;
                    break;
                default:
                    System.out.println("LOI !!!");
                    break;
            }
        }

//      menu lam cau hoi
    }

    /**
     * create menu
     */
    public static void menuChinh() {
        System.out.println("\n\n----------- MENU ------------");
        System.out.println("1. Quan li nguoi hoc");
        System.out.println("2. Quan li cau hoi");
        System.out.println("3. Lam bai kiem tra");
        System.out.println("0. Thoat!");
        System.out.println("---------------------------");
        System.out.print("Your choice: ");
    }

    public static void menuNguoiHoc() {
        System.out.println("\n\n----------- MENU HOC VIEN ------------");
        System.out.println("1. Xuat danh sach thanh vien trong lop hoc ");
        System.out.println("2. Tra cuu thong tin nguoi dung theo ngay sinh");
        System.out.println("3. Tra cuu thong tin nguoi dung theo ten");
        System.out.println("4. Tra cuu thong tin nguoi dung theo que quan");
        System.out.println("5. Tra cuu thong tin nguoi dung theo gioi tinh");
        System.out.println("6. Them thong tin hoc vien moi");
        System.out.println("7. Cap nhat thong tin cua hoc vien");
        System.out.println("8. Xoa thong tin cua hoc vien");
        System.out.println("0. Tro lai menu chinh!");
        System.out.println("---------------------------");
        System.out.print("Your choice: ");
    }

    public static void menuQuanLiCauHoi() {
        System.out.println("\n\n----------- MENU QUAN LI CAU HOI ------------");
        System.out.println("1. Xuat danh sach cau hoi");
        System.out.println("2. Tra cuu theo noi dung");
        System.out.println("3. Tra cuu theo danh muc");
        System.out.println("4. Tra cuu theo muc do");
        System.out.println("0. Tro lai menu chinh!");
        System.out.println("---------------------------");
        System.out.print("Your choice: ");
    }

    public static void menuChonCauHoi() {
        System.out.println("\n\n----------- MENU CHON LOAI CAU HOI ------------");
        System.out.println("1. MultipleChoice");
        System.out.println("2. InComplete");
        System.out.println("3. Conversation");
        System.out.println("0. Tro lai menu chinh!");
        System.out.println("---------------------------");
        System.out.print("Your choice: ");
    }
}
