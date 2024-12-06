package view;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class SeeView extends JFrame {
    private static SeeView seeView = new SeeView();
    private SeeView(){
        //JFrame 기본설정
        super("Start"); // 창 이름
        setSize(500, 500); // 사이즈
        setLocation(300, 300); // 위치
    }
    public static SeeView getInstance(){return seeView;}

    Scanner scan = new Scanner(System.in);

    public void mainpage(){

        seeView.setDefaultCloseOperation(EXIT_ON_CLOSE); //닫으면 꺼지기

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout()); //
        seeView.add(p1);
        JLabel lb1 = new JLabel("이름");
        p1.add(lb1);
        JLabel lb2 = new JLabel("주소");
        p1.add(lb2);
        JLabel lb3 = new JLabel("전화번호");
        p1.add(lb3);
        JButton b1 = new JButton("시작");
        p1.add(b1);


        setVisible(true); //보이기 true

        boolean result = true;

//        while(result){
//
//
//            System.out.println("선택하세요");
//
//        }
    }
}
