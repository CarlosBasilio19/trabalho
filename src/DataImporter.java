import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class DataImporter {

    private static final String URL = "jdbc:mysql://localhost:3306/ccc?serverTimezone=America/Sao_Paulo";
    private static final String USER = "root";
    private static final String PASSWORD = "6363";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        try {
            // Carregar o driver MySQL
            Class.forName(DRIVER_CLASS);

            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                 Statement statement = connection.createStatement()) {

                // Consultar todos os dados da tabela funcionarios
                String query = "SELECT id, nome, cargo, salario, data_admissao FROM funcionarios";
                StringBuilder resultBuilder = new StringBuilder("Dados da tabela 'funcionarios':\n");

                try (ResultSet resultSet = statement.executeQuery(query)) {
                    // Obter metadados da tabela
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    // Adicionar os dados de cada linha à StringBuilder
                    while (resultSet.next()) {
                        for (int i = 1; i <= columnCount; i++) {
                            String columnName = metaData.getColumnName(i);
                            Object value = resultSet.getObject(i);
                            resultBuilder.append(columnName).append(": ").append(value).append(" ");
                        }
                        resultBuilder.append("\n");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao consultar a tabela 'funcionarios': " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Exibir os dados em uma caixa de diálogo
                JOptionPane.showMessageDialog(null, resultBuilder.toString(), "Dados da Tabela 'Funcionarios'", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
