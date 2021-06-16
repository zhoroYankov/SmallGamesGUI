package com.company.screen;

import javax.swing.*;
import java.awt.*;

public class BullsAndCowsScreen extends JFrame {

    private JLabel passLabel;
    private JTextField passGuessField;


    public BullsAndCowsScreen() {
        super();
        setLayout(new FlowLayout());
        setTitle("BullsAndCows");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        initializeFields();


    }

    public void initializeFields() {

        passLabel = new JLabel("You have to decode the 4 digit password");
        add(passLabel);

        passGuessField = new JTextField("Your 4 digit guess");
        add(passGuessField);

    }




}
