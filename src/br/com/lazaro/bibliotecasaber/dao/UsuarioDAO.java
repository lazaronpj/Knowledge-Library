package br.com.lazaro.bibliotecasaber.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.lazaro.bibliotecasaber.bd.Banco;
import br.com.lazaro.bibliotecasaber.dto.UsuarioDTO;

public class UsuarioDAO {

	public boolean cadastrarUsuario(UsuarioDTO usr) {
		String sql = "INSERT INTO usuario (nome, email, senha, telefone) VALUES (?, ?, ?, ?)";
		try(Connection cnx = new Banco().conectaBD();
				PreparedStatement stmt = cnx.prepareStatement(sql)){
			stmt.setString(1, usr.getNome());
			stmt.setString(2, usr.getEmail());
			stmt.setString(3, usr.getSenha());
			stmt.setString(4, usr.getTelefone());
			return stmt.executeUpdate() > 0;
			
		} catch(SQLException e) {
			System.err.println("Erro ao cadastrar usuário no banco de dados!");
			
			return false;
		}
		
//	public List<UsuarioDTO> listarUsuarios();
//	
//		
	}
}
