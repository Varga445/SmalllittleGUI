package com.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GUI implements ActionListener, MouseMotionListener {

    private JFrame frame;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private JPanel panel;
    private JButton button;
    private JButton button2;


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        button.setVisible(false);
        label3.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    //pentru ca butonul sa respecte comenzileclasa GUI trebe sa  sa implementeze interfetele MouseMotionListener si ActionListener
    //trebe sa 'respecte contractul' adica sa supra-scrie metodele din interfate.

    public void actionPerformed2(ActionEvent e) {

        label2.setText("Ok");
        button.setVisible(false);
    }




    public GUI() {
        frame = new JFrame();// imi fac un frame(un cadru in care sa se petreaca magia)
        button2 = new JButton("Da");

        button = new JButton("Nu");//imi fac un buton:))
        button.addMouseMotionListener(this);


        button2.addActionListener(this::actionPerformed2);

        label = new JLabel("Esti multumit de salar?");

        label2 = new JLabel();

        label3 = new JLabel("Doar nu ai crezut ca poti sa da-i click pe 'Nu'?");
        label3.setVisible(false);


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200, 300, 100, 300));
        //asa setez dimensiunile 'ferestrei' , pentru a seta 'borderele' am nevoie de un obj de tip
        //'Border', dupa cum ii spune si numele, BorderFactory.createEmptyBorder() imi va face unu.
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);//adaug butonul panel in panel
        panel.add(button2);
        frame.add(panel, BorderLayout.CENTER);
        //am adaugat panel-ul frame-ului si am setat sa fie pozitionat pe centru


        panel.add(label);
        panel.add(label2);
        panel.add(label3);


        panel.setBackground(new Color(202, 240, 236));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //aici am specificat ce sa faca cand inchid 'fereastra', adica va oprii 'Run-ul'

        frame.setTitle("GUI");//nume titlu
        frame.pack();
        frame.setVisible(true);//sa fie vizibila


    }


}


