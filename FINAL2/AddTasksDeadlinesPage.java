import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

public class AddTasksDeadlinesPage extends JPanel {
    AddTasksDeadlinesPage() {
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
