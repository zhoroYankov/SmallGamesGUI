package com.company.screen;

import com.company.popup.Popup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToeScreen extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;


    public TicTacToeScreen() {
        super();
        setLayout(new GridLayout(3, 3));
        setTitle("TicTacToe");
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initializeButtons();

    }


    public void initializeButtons() {
        button1 = new JButton();
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton();
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton();
        button3.addActionListener(this);
        add(button3);

        button4 = new JButton();
        button4.addActionListener(this);
        add(button4);

        button5 = new JButton();
        button5.addActionListener(this);
        add(button5);

        button6 = new JButton();
        button6.addActionListener(this);
        add(button6);

        button7 = new JButton();
        button7.addActionListener(this);
        add(button7);

        button8 = new JButton();
        button8.addActionListener(this);
        add(button8);

        button9 = new JButton();
        button9.addActionListener(this);
        add(button9);
    }


    public Boolean checkForWin() {
        boolean haveWon = false;

           //1st horizontal statement
        if (button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText()) && button3.getText().equals(button1.getText())) {
            if (button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) {
                Popup.showInfoMessage("You win the game!");
                haveWon = true;
            } else if (button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) {
                Popup.showInfoMessage("Computer win!");
                haveWon = true;
            }

            //2nd horizontal statement
        } else if (button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText()) && button6.getText().equals(button4.getText())) {
            if (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) {
                Popup.showInfoMessage("You win the game!");
                haveWon = true;
            } else if (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) {
                Popup.showInfoMessage("Computer win!");
                haveWon = true;
            }

            //3rd horizontal statement
        } else if (button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText()) && button9.getText().equals(button7.getText())) {
            if (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) {
                Popup.showInfoMessage("You win the game!");
                haveWon = true;
            } else if (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) {
                Popup.showInfoMessage("Computer win!");
                haveWon = true;
            }

            //left diagonal statement
        } else if (button1.getText().equals(button5.getText()) && button5.getText().equals(button9.getText()) && button9.getText().equals(button1.getText())) {
            if (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) {
                Popup.showInfoMessage("You win the game!");
                haveWon = true;
            } else if (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) {
                Popup.showInfoMessage("Computer win!");
                haveWon = true;
            }

            //right diagonal statement
        } else if (button3.getText().equals(button5.getText()) && button5.getText().equals(button7.getText()) && button7.getText().equals(button3.getText())) {
            if (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")) {
                Popup.showInfoMessage("You win the game!");
                haveWon = true;
            } else if (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")) {
                Popup.showInfoMessage("Computer win!");
                haveWon = true;
            }

            //1st vertical statement
        } else if (button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText()) && button7.getText().equals(button1.getText())) {
            if (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) {
                Popup.showInfoMessage("You win the game!");
                haveWon = true;
            } else if (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) {
                Popup.showInfoMessage("Computer win!");
                haveWon = true;
            }

            //2nd vertical statement
        } else if (button2.getText().equals(button5.getText()) && button5.getText().equals(button8.getText()) && button8.getText().equals(button2.getText())) {
            if (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) {
                Popup.showInfoMessage("You win the game!");
                haveWon = true;
            } else if (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) {
                Popup.showInfoMessage("Computer win!");
                haveWon = true;
            }

            //3rd vertical statement
        } else if (button3.getText().equals(button6.getText()) && button6.getText().equals(button9.getText()) && button9.getText().equals(button3.getText())) {
            if (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) {
                Popup.showInfoMessage("You win the game!");
                haveWon = true;
            } else if (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) {
                Popup.showInfoMessage("Computer win!");
                haveWon = true;
            }
        }
        return haveWon;
    }


    public void initializeComputer() {
        Random random = new Random();
        int computerPos = random.nextInt(9) + 1;

        switch (computerPos) {
            case 1:
                if (button1.getText().equals("X") || button1.getText().equals("O")) {
                    initializeComputer();
                } else {
                    button1.setText("O");
                    button1.setEnabled(false);
                }
                break;
            case 2:
                if (button2.getText().equals("X") || button2.getText().equals("O")) {
                    initializeComputer();
                } else {
                    button2.setText("O");
                    button2.setEnabled(false);
                }
                break;
            case 3:
                if (button3.getText().equals("X") || button3.getText().equals("O")) {
                    initializeComputer();
                } else {
                    button3.setText("O");
                    button3.setEnabled(false);
                }
                break;
            case 4:
                if (button4.getText().equals("X") || button4.getText().equals("O")) {
                    initializeComputer();
                } else {
                    button4.setText("O");
                    button4.setEnabled(false);
                }
                break;
            case 5:
                if (button5.getText().equals("X") || button5.getText().equals("O")) {
                    initializeComputer();
                } else {
                    button5.setText("O");
                    button5.setEnabled(false);
                }
                break;
            case 6:
                if (button6.getText().equals("X") || button6.getText().equals("O")) {
                    initializeComputer();
                } else {
                    button6.setText("O");
                    button6.setEnabled(false);
                }
                break;
            case 7:
                if (button7.getText().equals("X") || button7.getText().equals("O")) {
                    initializeComputer();
                } else {
                    button7.setText("O");
                    button7.setEnabled(false);
                }
                break;
            case 8:
                if (button8.getText().equals("X") || button8.getText().equals("O")) {
                    initializeComputer();
                } else {
                    button8.setText("O");
                    button8.setEnabled(false);

                }
                break;
            case 9:
                if (button9.getText().equals("X") || button9.getText().equals("O")) {
                    initializeComputer();
                } else {
                    button9.setText("O");
                    button9.setEnabled(false);
                }
                break;
            default:
                break;
        }
    }


    public void restart() {
        GamesHomeScreen gameScreen = new GamesHomeScreen();
        gameScreen.setVisible(true);
        this.setVisible(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == button1) {
            button1.setText("X");
            button1.setEnabled(false);
            initializeComputer();
            if (checkForWin())
                restart();

        } else if (e.getSource() == button2) {
            button2.setText("X");
            button2.setEnabled(false);
            initializeComputer();
            if (checkForWin())
                restart();

        } else if (e.getSource() == button3) {
            button3.setText("X");
            button3.setEnabled(false);
            initializeComputer();
            if (checkForWin())
                restart();

        } else if (e.getSource() == button4) {
            button4.setText("X");
            button4.setEnabled(false);
            initializeComputer();
            if (checkForWin())
                restart();

        } else if (e.getSource() == button5) {
            button5.setText("X");
            button5.setEnabled(false);
            initializeComputer();
            if (checkForWin())
                restart();

        } else if (e.getSource() == button6) {
            button6.setText("X");
            button6.setEnabled(false);
            initializeComputer();
            if (checkForWin())
                restart();

        } else if (e.getSource() == button7) {
            button7.setText("X");
            button7.setEnabled(false);
            initializeComputer();
            if (checkForWin())
                restart();

        } else if (e.getSource() == button8) {
            button8.setText("X");
            button8.setEnabled(false);
            initializeComputer();
            if (checkForWin())
                restart();

        } else if (e.getSource() == button9) {
            button9.setText("X");
            button9.setEnabled(false);
            initializeComputer();
            if (checkForWin())
                restart();
        }
    }
}
