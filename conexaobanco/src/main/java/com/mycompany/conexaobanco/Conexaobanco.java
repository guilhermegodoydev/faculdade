/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexaobanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Conexaobanco {
    private static final String url = "jdbc:mysql://localhost:3306/bd_aula_java";
    private static final String user = "root";
    private static final String senha = "1234";
    
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(url, user, senha);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar", e);
        }
    }
    
    public static void main(String[] args) {
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
    }
}
