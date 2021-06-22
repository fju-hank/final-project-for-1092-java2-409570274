package com;

import javax.swing.*;
import java.awt.*;

public class DrinkShop {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Drink Shop");
        frame.setLayout(null);
        frame.setBounds(800,600,800,600);

        JButton button1 = new JButton("Bubble Milk  #60 ");
        button1.setBounds(100,100,200,50);
        button1.setHorizontalTextPosition(JButton.CENTER);
        frame.add(button1);

        JButton button2 = new JButton("Papaya Milk  #50 ");
        button2.setBounds(100,150,200,50);
        button2.setHorizontalTextPosition(JButton.CENTER);
        frame.add(button2);

        JButton button3 = new JButton("Black Tea  #35 ");
        button3.setBounds(100,200,200,50);
        button3.setHorizontalTextPosition(JButton.CENTER);
        frame.add(button3);

        JButton button4 = new JButton("Green Tea  #35 ");
        button4.setBounds(100,250,200,50);
        button4.setHorizontalTextPosition(JButton.CENTER);
        frame.add(button4);

        JButton button5 = new JButton("Secret Drink  #80 ");
        button5.setBounds(100,300,200,50);
        button5.setHorizontalTextPosition(JButton.CENTER);
        frame.add(button5);

        JButton button6 = new JButton("return");
        button6.setBounds(100,150,150,50);
        button6.setLocation(300,400);
        frame.add(button6);

        JLabel label01 = new JLabel("Menu :");
        label01.setForeground(Color.blue);
        label01.setBounds(200,20,100,20);
        label01.setLocation(100,50);
        frame.add(label01);

        JLabel label = new JLabel("Your Order :");
        label.setForeground(Color.blue);
        label.setBounds(200,20,100,20);
        label.setLocation(450,50);
        frame.add(label);

        List list = new List();
        list.setForeground(Color.RED);
        list.setBounds(200,20,200,250);
        list.setLocation(450,100);
        frame.add(list);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
