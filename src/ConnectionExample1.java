import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver de conexão carregado.");
			
			Connection cn =  DriverManager.getConnection("jdbc:mysql://192.168.15.86:3306",
					"usuario","senha");
			
			System.out.println("Conexão aberta com sucesso.");
			
			cn.close();
			System.out.println("Conexão encerrada.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Não foi possível encontrar o arquivo de conexão.");
			e.printStackTrace();
		} catch(SQLException sqle) {
			System.out.println("Não foi possível abrir a conexão.");
			sqle.printStackTrace();
		}
	}
}
