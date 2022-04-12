import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver de conex�o carregado.");
			
			Connection cn =  DriverManager.getConnection("jdbc:mysql://192.168.15.86:3306",
					"usuario","senha");
			
			System.out.println("Conex�o aberta com sucesso.");
			
			cn.close();
			System.out.println("Conex�o encerrada.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("N�o foi poss�vel encontrar o arquivo de conex�o.");
			e.printStackTrace();
		} catch(SQLException sqle) {
			System.out.println("N�o foi poss�vel abrir a conex�o.");
			sqle.printStackTrace();
		}
	}
}
