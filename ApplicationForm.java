package lesson8;

import lesson8.components.DigitJButton;
import lesson8.components.OperatorJButton;
import lesson8.listener.ButtonListener;
import lesson8.listener.ClearFieldButtonListener;
import lesson8.listener.OperatorsListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {

    private JTextField inputField;


    public ApplicationForm(String title) {
        super(title);
        setBounds(1000, 300, 350, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);

        setJMenuBar(createMenu());

        add(createCenterPanel(), BorderLayout.CENTER);
        setVisible(true);
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);

        inputField.setFont(new Font("Roboto", Font.PLAIN, 25));
        inputField.setMargin(new Insets(8, 0, 8, 0));
        inputField.setBackground(new Color(161, 206, 116));
//        inputField.setText("(1+3)/5=126");
        return top;
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        menuFile.add(clear);

        menuFile.add(new JMenuItem("Exit"));
        menuBar.add(menuFile);

        menuBar.add(new JMenuItem("Help"));
        menuBar.add(new JMenuItem("About"));
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuBar.add(exit);
        return menuBar;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener), BorderLayout.WEST);

        return centerPanel;
    }


    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new GridLayout(4, 3));
        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new DigitJButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        JButton calc = new OperatorJButton("=");
        calc.addActionListener(new OperatorsListener(inputField));
        digitsPanel.add(calc);


        JButton clear = new OperatorJButton("C");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        digitsPanel.add(clear);


        return digitsPanel;
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton minus = new OperatorJButton("-");
        minus.addActionListener(new OperatorsListener(inputField));
        panel.add(minus);

        JButton plus = new OperatorJButton("+");
        plus.addActionListener(new OperatorsListener(inputField));
        panel.add(plus);

        JButton multiply = new OperatorJButton("x");
        multiply.addActionListener(new OperatorsListener(inputField));
        panel.add(multiply);

        JButton divide = new OperatorJButton("/");
        divide.addActionListener(new OperatorsListener(inputField));
        panel.add(divide);

        return panel;
    }
}
