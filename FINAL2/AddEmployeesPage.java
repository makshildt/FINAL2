import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddEmployeesPage extends JPanel {
    AddEmployeesPage() {
        JLabel AddEmpLabel = new JLabel("First Name:");
        add(AddEmpLabel);
        JTextField AddEmpTextField = new JTextField((10));
        add(AddEmpTextField);

        JLabel AddEmpLabel2 = new JLabel("Last Name:");
        add(AddEmpLabel2);
        JTextField AddEmpTextField2 = new JTextField((10));
        add(AddEmpTextField2);

        JLabel AddEmpLabel3 = new JLabel("Year of Birth:");
        add(AddEmpLabel3);
        JTextField AddEmpTextField3 = new JTextField((10));
        add(AddEmpTextField3);

        JLabel AddEmpLabel4 = new JLabel("Email:");
        add(AddEmpLabel4);
        JTextField AddEmpTextField4 = new JTextField((10));
        add(AddEmpTextField4);

        JLabel AddEmpLabel5 = new JLabel("Role:");
        add(AddEmpLabel5);
        JTextField AddEmpTextField5 = new JTextField((10));
        add(AddEmpTextField5);

        JLabel ComboBoxTeams = new JLabel("Team:");
        add(ComboBoxTeams);

        JComboBox AddEmpLabel6 = new JComboBox();
        AddEmpLabel6.addItem("Team 1");
        AddEmpLabel6.addItem("Team 2");
        AddEmpLabel6.addItem("Team 3");
        add(AddEmpLabel6);

        JButton AddEmpButton = new JButton("Submit");
        add(AddEmpButton);
        AddEmpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String FirstName = AddEmpTextField.getText();
                String LastName = AddEmpTextField2.getText();
                String YearOfBirth = AddEmpTextField3.getText();
                String Email = AddEmpTextField4.getText();
                String Role = AddEmpTextField5.getText();
                //String Team = AddEmpLabel6.getSelectedItem().toString();
                try {
                    Class.forName("org.sqlite.JDBC");
                    Connection connection = DriverManager.getConnection("jdbc:sqlite:mydb.db");
                    PreparedStatement statement = connection.prepareStatement("INSERT INTO employees (first_name, last_name, year_of_birth, email, role) VALUES (?, ?, ?, ?, ?)");
                    statement.setString(1, FirstName);
                    statement.setString(2, LastName);
                    statement.setString(3, YearOfBirth);
                    statement.setString(4, Email);
                    statement.setString(5, Role);
                    //statement.setString(6, Team);
                    statement.executeUpdate();
                    connection.close();
                    JOptionPane.showMessageDialog(null, "Employee Added Successfully");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                AddEmpTextField.setText("");
                AddEmpTextField2.setText("");
                AddEmpTextField3.setText("");
                AddEmpTextField4.setText("");
                AddEmpTextField5.setText("");
            }
        });
    }
}

