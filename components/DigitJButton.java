package lesson8.components;

import javax.swing.*;
import java.awt.*;

public class DigitJButton extends JButton {
    public DigitJButton(String text){
        super(text);
        setFont(new Font("Roboto",Font.PLAIN,30));
        setBackground(new Color(70,150,230));
    }
}
