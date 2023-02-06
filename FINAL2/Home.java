import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JPanel {
    JTable table;
    String[] columnNames = {"Team Name", "Task", "Deadline"};

    // JTable tableEmp;
    // String[] columnNamesEmp = {"First Name", "Last Name", "Team Name"};

    Home() {
        JLabel HomeLabel = new JLabel("Welcome to the Employee Management System!");
        add(HomeLabel);
        
        JButton button = new JButton("Display Teams with Tasks");
        add(button);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        DefaultTableModel model = new DefaultTableModel(new Object[0][columnNames.length], columnNames);
        add(scrollPane);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTable();
            }
        });

        JButton buttonEmp = new JButton("Display Employees");
        add(buttonEmp);

        // //Employee Table
        // tableEmp = new JTable();
        // JScrollPane scrollPaneEmp = new JScrollPane(table);
        // DefaultTableModel modelEmp = new DefaultTableModel(new Object[0][columnNames.length], columnNames);
        // add(scrollPane);

        // buttonEmp.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         updateEmps();
        //     }
        // });

    }

    public void updateTable() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Mydb.db");

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM teams2");

            //int columnCount = resultSet.getMetaData().getColumnCount();
            ArrayList<Object[]> rows = new ArrayList<Object[]>();
            while (resultSet.next()) {
                Object[] row = new Object[columnNames.length];
                for (int i = 1; i <= columnNames.length; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                rows.add(row);
            }
            Object[][] data = rows.toArray(new Object[0][]);
            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            table.setModel(model);                   
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    // public void updateEmps() {
    //     try {
    //         Class.forName("org.sqlite.JDBC");
    //         Connection conn = DriverManager.getConnection("jdbc:sqlite:Mydb.db");

    //         Statement statement = conn.createStatement();
    //         ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

    //         //int columnCount = resultSet.getMetaData().getColumnCount();
    //         ArrayList<Object[]> rows = new ArrayList<Object[]>();
    //         while (resultSet.next()) {
    //             Object[] row = new Object[columnNames.length];
    //             for (int i = 1; i <= columnNames.length; i++) {
    //                 row[i - 1] = resultSet.getObject(i);
    //             }
    //             rows.add(row);
    //         }
    //         Object[][] data = rows.toArray(new Object[0][]);
    //         DefaultTableModel modelEmp = new DefaultTableModel(data, columnNames);
    //         table.setModel(modelEmp);                   
    //     } catch (Exception e1) {
    //         e1.printStackTrace();
    //     }
    // }
}
