package lesson8.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class OperatorsListener implements ActionListener {
    private JTextField inputField;
    static double value1 = 0;
    static double value2 = 0;
    static double result = 0;
    static int operator = 0;


    public OperatorsListener(JTextField inputField) {

        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn.getText().equals("-")) {
            value1 = Double.parseDouble(inputField.getText());
            operator = 1;
            inputField.setText("");
        }
        if (btn.getText().equals("+")) {
            value1 = Double.parseDouble(inputField.getText());
            operator = 2;
            inputField.setText("");
        }
        if (btn.getText().equals("x")) {
            value1 = Double.parseDouble(inputField.getText());
            operator = 3;
            inputField.setText("");
        }
        if (btn.getText().equals("/")) {
            value1 = Double.parseDouble(inputField.getText());
            operator = 4;
            inputField.setText("");
        }
        if (btn.getText().equals("=")) {
            value2 = Double.parseDouble(inputField.getText());
            switch (operator) {
                case 1:
                    result = value1 - value2;
                    break;
                case 2:
                    result = value1 + value2;
                    break;
                case 3:
                    result = value1 * value2;
                    break;
                case 4:
                    result = value1 / value2;
                    break;
                default:
                    result = 0;
            }
            inputField.setText("" + result);
        }
    }
}

