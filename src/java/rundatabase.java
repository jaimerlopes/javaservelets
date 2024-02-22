import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class rundatabase {

    public static void main(String[] args) {
        // Configurações de conexão ao MySQL
        String url = "jdbc:mysql://localhost:3306/";
        String usuario = "root";
        String senha = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            // Criar a base de dados 'exemplo'
            try (Statement statement = conexao.createStatement()) {
                statement.executeUpdate("CREATE DATABASE IF NOT EXISTS Tretas");
                System.out.println("Base de dados 'exemplo' criada com sucesso.");
            }

            // Usar a base de dados 'exemplo'
            try (Statement statement = conexao.createStatement()) {
                statement.executeUpdate("USE exemplo");
            }

            // Criar a tabela 'tarefas'
            try (Statement statement = conexao.createStatement()) {
                statement.executeUpdate("""
                    CREATE TABLE IF NOT EXISTS tarefas (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        descricao VARCHAR(255) NOT NULL,
                        completada BOOLEAN NOT NULL
                    )
                """);
                System.out.println("Tabela 'tarefas' criada com sucesso.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
