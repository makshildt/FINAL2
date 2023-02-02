import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

public class AddTeamsPage extends JPanel {
    AddTeamsPage() {
        JLabel AddTeamsLabel = new JLabel("Enter Team Name:");
        add(AddTeamsLabel);
        JTextField AddTeamsTextField = new JTextField((10));
        add(AddTeamsTextField);
        JButton AddTeamsButton = new JButton("Submit");
        add(AddTeamsButton);
        AddTeamsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String AddTeamsText = AddTeamsTextField.getText();
                System.out.println(AddTeamsText);
                AddTeamsTextField.setText("");
                
                
            }
        });
    }
}
