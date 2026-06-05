package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoSB {
    
    public Connection conectar() {
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/SmartBianco?user=root&password=1234";
            
            conn = DriverManager.getConnection(url);
            System.out.println("Conexão com o banco de dados realizada com sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na Conexão com o Banco: " + erro.getMessage());
        }
        
        return conn;
    }
}