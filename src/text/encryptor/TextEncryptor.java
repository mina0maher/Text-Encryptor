/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.encryptor;

import java.awt.Color;
import text.encryptor.ui.MainPage;

/**
 *
 * @author maher
 */
public class TextEncryptor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainPage mainPage = new MainPage();
        mainPage.setLocationRelativeTo(null);
        mainPage.getContentPane().setBackground(Color.WHITE);
        mainPage.setVisible(true);
    }
    
}
