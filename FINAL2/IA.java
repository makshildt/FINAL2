import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class IA {
    public static void main(String[] args) {
        new IA();
    }

    JFrame mainFrame;
    JTabbedPane tabbedPane;
    JPanel page1;

    IA() {
        mainFrame = new JFrame("IA");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 400);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);

        tabbedPane = new JTabbedPane();
        mainFrame.add(tabbedPane);

        page1 = new JPanel();

        Pages.Home = new Home();
        tabbedPane.addTab("Home", Pages.Home);
        
        Pages.AddTeamsPage = new AddTeamsPage();
        tabbedPane.addTab("Add Teams", Pages.AddTeamsPage);

        Pages.AddEmployeesPage = new AddEmployeesPage();
        tabbedPane.addTab("Add Employees", Pages.AddEmployeesPage);

        Pages.AddTasksDeadlinesPage = new AddTasksDeadlinesPage();
        tabbedPane.addTab("Add Tasks/Deadlines", Pages.AddTasksDeadlinesPage);

    }
}

