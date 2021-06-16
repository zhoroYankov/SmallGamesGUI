package com.company.popup;

import javax.swing.*;

public class Popup {

    public static void showInfoMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
    }

}
