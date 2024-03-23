import javax.swing.*;

public class View extends JFrame{

    private JTextArea textField1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton decimalButton;
    private JButton a0Button;
    private JButton equalsButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JPanel mainPanel;

    public View(){
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null); // Centers the frame on the screen
        setVisible(true);


        a0Button.addActionListener(e -> {
            textField1.setText(textField1.getText() + "0");
        });

        a1Button.addActionListener(e -> {
            textField1.setText(textField1.getText() + "1");
        });

        a2Button.addActionListener(e -> {
            textField1.setText(textField1.getText() + "2");
        });

        a3Button.addActionListener(e -> {
            textField1.setText(textField1.getText() + "3");
        });

        a4Button.addActionListener(e -> {
            textField1.setText(textField1.getText() + "4");
        });

        a5Button.addActionListener(e -> {
            textField1.setText(textField1.getText() + "5");
        });

        a6Button.addActionListener(e -> {
            textField1.setText(textField1.getText() + "6");
        });

        a7Button.addActionListener(e -> {
            textField1.setText(textField1.getText() + "7");
        });

        a8Button.addActionListener(e -> {
            textField1.setText(textField1.getText() + "8");
        });

        a9Button.addActionListener(e -> {
            textField1.setText(textField1.getText() + "9");
        });

        equalsButton.addActionListener(e -> {

        });
        plusButton.addActionListener(e -> {

        });
        minusButton.addActionListener(e -> {

        });
        multiplyButton.addActionListener(e -> {

        });
        divideButton.addActionListener(e -> {

        });
        decimalButton.addActionListener(e -> {
            String currentText = textField1.getText();
            if (currentText.isEmpty() || currentText.equals("-")) {
                textField1.setText("0.");
            } else if (!currentText.contains(".")) {
                textField1.setText(currentText + ".");
            }
        });
    }

    public static void main(String[] args) {
        new View();
    }
}


