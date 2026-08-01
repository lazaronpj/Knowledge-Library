package br.com.lazaro.bibliotecasaber.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Essa classe é a principal responsável pela comunicação com o banco de dados
 * 
 * @author Lazaro Nogueira
 * @version 1.0
 * @since 2026-08-01
 * */

public class Banco {

	private final String URL = "jdbc:mysql://localhost:3306/biblioteca_saber";
	private final String USER = "root";
	private final String PASS = "1212";
	
	/*
	 * Esse método efetua a conexão com o banco de dados com tratamento de erros
	 * @return Retorna a realização da conexão com o banco
	 * @throws SQLException ativa caso ocorra algum problema com a conexão com o banco
	 * */
	
	public Connection conectaBD() throws SQLException {
		
		try {
			return DriverManager.getConnection(URL, USER, PASS);
		} catch(SQLException e) {
			System.err.println("Não foi possível se conectar ao banco de dados!" + e);
			throw e;
		}
		
	}
	
	
}
