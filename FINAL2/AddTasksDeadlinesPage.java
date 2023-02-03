import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.*;

public class AddTasksDeadlinesPage extends JPanel {
    AddTasksDeadlinesPage() {

        JLabel ComboBoxTD = new JLabel("Team:");
        add(ComboBoxTD);

        JComboBox AddEmpLabel6 = new JComboBox();
        AddEmpLabel6.addItem("Team 1");
        AddEmpLabel6.addItem("Team 2");
        AddEmpLabel6.addItem("Team 3");
        add(AddEmpLabel6);

        JLabel AddTDLabel = new JLabel("Enter Task Name:");
        add(AddTDLabel);
        JTextField AddTDTextField = new JTextField((10));
        add(AddTDTextField);

        JLabel AddTDLabel2 = new JLabel("Enter Deadline Date:");
        add(AddTDLabel2);
        JTextField AddTDTextField2 = new JTextField((10));
        add(AddTDTextField2);

        JButton AddTDButton = new JButton("Submit");
        add(AddTDButton);
    }
}
