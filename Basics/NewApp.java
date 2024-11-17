import java.awt.event.*;
import javax.swing.*;

public class NewApp implements ActionListener{

    JTextField textField;
    JLabel label;

    public NewApp(){

        JFrame frame = new JFrame("Text Field Example");
        textField = new JTextField(10);
        label = new JLabel("No input yet");
        JButton button = new JButton("Submit");
        button.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setSize(300,200);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String input = textField.getText();
        label.setText("You Entered: " + input);
    }

    public static void main(String[] args) {
     
        new NewApp();

    }
}