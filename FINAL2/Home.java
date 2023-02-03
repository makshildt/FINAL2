import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Home extends JPanel {

    Home() {
        JLabel HomeLabel = new JLabel("Welcome to the Employee Management System!");
        add(HomeLabel);

        JTable table = new JTable();
        add(table);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }
}


    //     Connection connection = null;
    //     DefaultTableModel tableModel;
    //     try {
    //         Class.forName("org.sqlite.JDBC");
    //         connection = DriverManager.getConnection("jdbc:sqlite:mydb.db");
    //         ResultSet resultSet = ((java.sql.Statement) connection).executeQuery("SELECT * FROM teams");

    //         ResultSetMetaData metaData = resultSet.getMetaData();
    //         int columnCount = metaData.getColumnCount();

    //         DefaultTableModel model = new DefaultTableModel();
    //         for (int i = 1; i <= columnCount; i++) {
    //             model.addColumn(metaData.getColumnName(i));
    //         }

    //         Object[] row = new Object[columnCount];
    //         while (resultSet.next()) {
    //             for (int i = 0; i < columnCount; i++) {
    //                 row[i] = resultSet.getObject(i + 1);
    //             }
    //         }
    //         tableModel.addRow(row);
    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //     }
        
    //     table.setModel(tableModel);
    // }



        // Connection connection = null;
        // try {
        //     Class.forName("org.sqlite.JDBC");
        //     connection = DriverManager.getConnection("jdbc:sqlite:mydb.db");
        //     Statement statement = (Statement) connection.createStatement();
        //     ResultSet resultSet = ((java.sql.Statement) statement).executeQuery("SELECT * FROM teams");
        //     while (resultSet.next()) {
        //         String teamName = resultSet.getString("name");
        //         JLabel CurrentTeams = new JLabel(teamName);
        //         add(CurrentTeams);
        //     }
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        // JLabel CurrentTeams = new JLabel("Current Teams:");
        // CurrentTeams.setBounds(10, 100, 100, 100);
        // add(CurrentTeams);

        
        // while (resultSet.next()) {
        //     String teamName = resultSet.getString("name");
        //     JLabel CurrentTeams = new JLabel(teamName);
        //     CurrentTeams.setBounds(10, 100, 100, 100);
        //     add(CurrentTeams);
        // }

        // DefaultTableModel model = new DefaultTableModel();
        // model.setColumnIdentifiers(new Object[] { "Column1", "Column2", "Column3" });
        
        // while (resultSet.next()) {
        //     model.addRow(new Object[] { resultSet.getString(1), resultSet.getString(2), resultSet.getString(3) });
        // }

        // JTable table = new JTable(model);

        // JScrollPane scrollPane = new JScrollPane(table);

        // frame.add(scrollPane, BorderLayout.CENTER);
