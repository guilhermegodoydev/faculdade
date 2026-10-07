/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexaobanco;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class CRUD {
    public static void main(String[] args) {
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);
        
        try (Connection conexao = Conexaobanco.conectar()) {
            System.out.println("Conectado ao sql com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }
}
