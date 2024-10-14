package mico;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class test {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private Timer timer;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    test window = new test();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public test() {
        initialize();
        startTimer();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 929, 431);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(25, 59, 834, 263);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        tableModel = new DefaultTableModel();
        table.setModel(tableModel);

        JButton btnNewButton = new JButton("New button");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                refreshTableData();
            }
        });
        btnNewButton.setBounds(364, 343, 89, 23);
        frame.getContentPane().add(btnNewButton);
    }

    /**
     * Start the timer to refresh the table data every 5 seconds.
     */
    private void startTimer() {
        int delay = 5000; // Delay in milliseconds (5 seconds)
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                refreshTableData();
            }
        };
        timer = new Timer(delay, taskPerformer);
        timer.start();
    }

    /**
     * Refresh the data in the table.
     */
    private void refreshTableData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://db4free.net:3306/restol";
            String username = "halima";
            String password = "Mouad@2001";

            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM Plat";
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            // Clear the table
            tableModel.setRowCount(0);

            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getCatalogName(i + 1);
                tableModel.setColumnIdentifiers(colName);
            }

            while (rs.next()) {
                String id = rs.getString(1);
                String n = rs.getString(2);
                String d = rs.getString(3);
                String z = rs.getString(4);

                String[] row = { id, n, d ,z};
                tableModel.addRow(row);
            }

            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
