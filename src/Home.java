
import java.sql.*;
        import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("Enter the option below");
            System.out.println("1 :Insert");
            System.out.println("2 :View");
            System.out.println("3 :Search");
            System.out.println("4 :Update");
            System.out.println("5 :Delete");

            System.out.println("6 :exit");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Insert the data ");

                    System.out.println("Enter the  temperature");
                    int temp = sc.nextInt();
                    System.out.println("Enter the humidity");
                    String humd = sc.next();
                    System.out.println("moisture");
                    String mois = sc.next();



                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homeautomationdb", "root", "");
                        String sql = "INSERT INTO `sensorvalues`(`temperature`, `humidity`, `moisture`, `date`) VALUES (?,?,?,now())";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setInt(1,temp);
                        stmt.setString(2,humd);
                        stmt.setString(3, mois);
                        stmt.executeUpdate();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("View");



                    break;
                case 3:
                    System.out.println("Search");

                    break;
                case 4:
                    System.out.println("Update");


                    break;
                case 5:
                    System.out.println("Delete");



                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}