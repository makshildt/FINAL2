import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JPanel {
    Home() {
        JLabel HomeLabel = new JLabel("Welcome to the Employee Management System!");
        add(HomeLabel);
        
        JButton button = new JButton("Display");
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.sqlite.JDBC");
                    Connection conn = DriverManager.getConnection("jdbc:sqlite:Mydb.db");

                    Statement statement = conn.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM teams2");

                    int columnCount = resultSet.getMetaData().getColumnCount();
                    Object[][] data = new Object[100][columnCount];
                    int row = 0;
                    while (resultSet.next()) {
                        for (int i = 1; i <= columnCount; i++) {
                            data[row][i - 1] = resultSet.getObject(i);
                        }
                        row++;
                    }

                    String[] columnNames = {"Team Name", "Task", "Deadline"};
                    DefaultTableModel model = new DefaultTableModel(data, columnNames);
                    JTable table = new JTable(model);

                    JScrollPane scrollPane = new JScrollPane(table);
                    add(scrollPane);
                    
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}
