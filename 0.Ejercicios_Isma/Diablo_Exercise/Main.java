import java.sql.*;

//Class Main
public class Main {
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jardineria", "testuser", "1234");
            Statement stmt = connection.createStatement();
            //                                             0    1     2
            ResultSet rs = stmt.executeQuery("SELECT (id, cost, name) FROM spells");

            while (rs.next()) {
                System.out.println("CodigoEmpleado: " + rs.getInt(0));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Game game = new Game();
        // game.init();
        // game.startGame();
        
    }
    
}
