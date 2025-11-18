import java.sql.*;
import javax.swing.*;
public class StudentDBGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Records");
        JTextArea area = new JTextArea();
        f.add(new JScrollPane(area));
        f.setSize(200, 200);
        f.setVisible(true);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sns", "root", "1234");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            while (rs.next())
                area.append(rs.getInt(1) + " " + rs.getString(2) + "\n");
            con.close();
        } catch (Exception e) {
            area.setText("Database Error: " + e.getMessage());
        }
    }
}
