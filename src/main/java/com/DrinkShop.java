package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrinkShop {
    public static void main(String[] args){


        JFrame frame = new JFrame("Drink Shop");
        frame.setLayout(null);
        frame.setBounds(800,600,800,600);

        JButton button1 = new JButton("Bubble MilkTea  #60 ");
        button1.setBounds(100,100,200,50);
        button1.setHorizontalTextPosition(JButton.CENTER);
        button1.setBackground(Color.ORANGE);
        button1.setForeground(Color.blue);
        frame.add(button1);

        JButton button2 = new JButton("Papaya Milk  #50 ");
        button2.setBounds(100,150,200,50);
        button2.setHorizontalTextPosition(JButton.CENTER);
        button2.setBackground(Color.ORANGE);
        button2.setForeground(Color.blue);
        frame.add(button2);

        JButton button3 = new JButton("Black Tea  #35 ");
        button3.setBounds(100,200,200,50);
        button3.setHorizontalTextPosition(JButton.CENTER);
        button3.setBackground(Color.ORANGE);
        button3.setForeground(Color.blue);
        frame.add(button3);

        JButton button4 = new JButton("Green Tea  #35 ");
        button4.setBounds(100,250,200,50);
        button4.setHorizontalTextPosition(JButton.CENTER);
        button4.setBackground(Color.ORANGE);
        button4.setForeground(Color.blue);
        frame.add(button4);

        JButton button5 = new JButton("Secret Drink  #80 ");
        button5.setBounds(100,300,200,50);
        button5.setHorizontalTextPosition(JButton.CENTER);
        button5.setBackground(Color.ORANGE);
        button5.setForeground(Color.blue);
        frame.add(button5);

        JButton button6 = new JButton("RETURN");
        button6.setBounds(100,150,150,50);
        button6.setLocation(300,430);
        button6.setBackground(Color.yellow);
        button6.setForeground(Color.blue);
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
        list.setForeground(Color.red);
        list.setBounds(200,20,200,250);
        list.setLocation(450,100);
        frame.add(list);

        Label label02 = new Label("Total:0#");
        label02.setForeground(Color.RED);
        label02.setBounds(200,500,100,20);
        label02.setLocation(470,360);
        frame.add(label02);

        button1.addActionListener(e -> {
            String[] foods = list.getItems();
            boolean items = false;
            int index = 0;
            for (int i = 0; i < foods.length; i++) {
                if (foods[i].contains("Bubble MilkTea")){
                    index = i;
                    items = true;
                    break;
                }
            }
            if(items){
                String food = list.getItem(index);
                int x_index = food.indexOf("X");
                String value = food.substring(x_index + 1);
                food = food.substring(0, x_index + 1)
                        + (Integer.parseInt(value) + 1);
                list.remove(index);
                list.add(food, index);
            } else {
                list.add("Bubble MilkTea  X1");
            }
            String value = label02.getText();
            int begin = value.indexOf(":");
            int end = value.indexOf("#");
            String money = value.substring(begin + 1, end);
            String newValue = String.valueOf((Integer.parseInt(money) + 60));
            value = value.replaceAll(money, newValue);
            label02.setText(value);
        });
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String[] foods = list.getItems();
                boolean items = false;
                int index = 0;
                for (int i = 0; i < foods.length; i++) {
                    if (foods[i].contains("Papaya Milk")){
                        index = i;
                        items = true;
                        break;
                    }
                }
                if(items){
                    String food = list.getItem(index);
                    int x_index = food.indexOf("X");
                    String value = food.substring(x_index + 1);
                    food = food.substring(0, x_index + 1)
                            + (Integer.parseInt(value) + 1);
                    list.remove(index);
                    list.add(food, index);
                } else {
                    list.add("Papaya Milk  X1");
                }
                String value = label02.getText();
                int begin = value.indexOf(":");
                int end = value.indexOf("#");
                String money = value.substring(begin + 1, end);
                String newValue = String.valueOf((Integer.parseInt(money) + 50));
                value = value.replaceAll(money, newValue);
                label02.setText(value);
            }
        });
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String[] foods = list.getItems();
                boolean items = false;
                int index = 0;
                for (int i = 0; i < foods.length; i++) {
                    if (foods[i].contains("Black Tea")){
                        index = i;
                        items = true;
                        break;
                    }
                }
                if(items){
                    String food = list.getItem(index);
                    int x_index = food.indexOf("X");
                    String value = food.substring(x_index + 1);
                    food = food.substring(0, x_index + 1)
                            + (Integer.parseInt(value) + 1);
                    list.remove(index);
                    list.add(food, index);
                } else {
                    list.add("Black Tea  X1");
                }
                String value = label02.getText();
                int begin = value.indexOf(":");
                int end = value.indexOf("#");
                String money = value.substring(begin + 1, end);
                String newValue = String.valueOf((Integer.parseInt(money) + 35));
                value = value.replaceAll(money, newValue);
                label02.setText(value);
            }
        });
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String[] foods = list.getItems();
                boolean items = false;
                int index = 0;
                for (int i = 0; i < foods.length; i++) {
                    if (foods[i].contains("Green Tea")){
                        index = i;
                        items = true;
                        break;
                    }
                }
                if(items){
                    String food = list.getItem(index);
                    int x_index = food.indexOf("X");
                    String value = food.substring(x_index + 1);
                    food = food.substring(0, x_index + 1)
                            + (Integer.parseInt(value) + 1);
                    list.remove(index);
                    list.add(food, index);
                } else {
                    list.add("Green Tea  X1");
                }
                String value = label02.getText();
                int begin = value.indexOf(":");
                int end = value.indexOf("#");
                String money = value.substring(begin + 1, end);
                String newValue = String.valueOf((Integer.parseInt(money) + 35));
                value = value.replaceAll(money, newValue);
                label02.setText(value);
            }
        });
        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String[] foods = list.getItems();
                boolean items = false;
                int index = 0;
                for (int i = 0; i < foods.length; i++) {
                    if (foods[i].contains("Secret Drink")){
                        index = i;
                        items = true;
                        break;
                    }
                }
                if(items){
                    String food = list.getItem(index);
                    int x_index = food.indexOf("X");
                    String value = food.substring(x_index + 1);
                    food = food.substring(0, x_index + 1)
                            + (Integer.parseInt(value) + 1);
                    list.remove(index);
                    list.add(food, index);
                } else {
                    list.add("Secret Drink  X1");
                }
                String value = label02.getText();
                int begin = value.indexOf(":");
                int end = value.indexOf("#");
                String money = value.substring(begin + 1, end);
                String newValue = String.valueOf((Integer.parseInt(money) + 80));
                value = value.replaceAll(money, newValue);
                label02.setText(value);
            }
        });
        button6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                list.removeAll();

                String value = label02.getText();
                int begin = value.indexOf(":");
                int end = value.indexOf("#");
                String money = value.substring(begin + 1, end);
                String newValue = "0";
                value = value.replaceAll(money, newValue);
                label02.setText(value);
            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
