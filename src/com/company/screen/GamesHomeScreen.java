package com.company.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamesHomeScreen extends JFrame implements ActionListener {

    private JButton ticTacToeButton;
    private JButton bullsAndCows;

    public GamesHomeScreen() {
        super("Hello choose game");
        setSize(500, 500);
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initializeGameButtons();
    }

    public void initializeGameButtons() {
        ticTacToeButton = new JButton("TicTacToe");
        ticTacToeButton.addActionListener(this);
        add(ticTacToeButton);

        bullsAndCows = new JButton("Bulls and Cows");
        bullsAndCows.addActionListener(this);
        add(bullsAndCows);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ticTacToeButton) {
            TicTacToeScreen ticTacToe = new TicTacToeScreen();
            ticTacToe.setVisible(true);
            this.setVisible(false);

        } else if (e.getSource() == bullsAndCows){
            BullsAndCowsScreen bullsAndCows = new BullsAndCowsScreen();
            bullsAndCows.setVisible(true);
            this.setVisible(false);
        }
    }
}
