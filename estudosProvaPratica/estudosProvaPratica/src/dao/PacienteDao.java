package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Paciente;

public class PacienteDao {
	private String url = "jdbc:mysql://localhost:3306/meuBanquinho";
	private String usuario = "root";
	private String senha = "aluno";
	private Connection connection;
	
	public void cadastrarPaciente(Paciente paciente) throws SQLException {
		abreConexao();
		
		String sql = "INSERT INTO paciente(cpf, nome, idade, sexo) VALUES (?,?,?,?)";
		try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
			preparedStatement.setString(1,paciente.getCpf());
			preparedStatement.setString(2,paciente.getNome());
			preparedStatement.setInt(3,paciente.getIdade());
			preparedStatement.setBoolean(4,paciente.isSexo());
			preparedStatement.executeUpdate();
			
		}
		fechaConexao();
	}
	
	public boolean excluirPaciente(String cpf) throws SQLException {
		PreparedStatement preparedStatement = null;
		int linhasAfetadas = 0;

		abreConexao();

		String sql = "DELETE FROM paciente WHERE cpf = ?;";

		try {
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, cpf);

			linhasAfetadas = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return linhasAfetadas > 0;
	}
	
	/*public List<Paciente> listaDePacientes(){
		List<Paciente> Paciente = null;
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Paciente paciente = null;
		
		try {
			abreConexao();
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		
	}
	*/
	
	
	
	
	
	
	
	
	
	
	public boolean abreConexao() {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
    		connection = DriverManager.getConnection(url, usuario, senha);
    		
    		if (connection != null) {
    			return true;
    			
    		} else {
    			return false;
    		}
    	} catch (ClassNotFoundException | SQLException e) {
    		e.printStackTrace();
    		return false;
    	}
    }
	
	   public void fechaConexao() {
	    	try {
	    		if (connection != null) {
	    			connection.close();
	    		}
	    	} catch (SQLException e) {
	    		e.printStackTrace();
	    	}
	    }
	   
	   public boolean testaConexao() {
		    boolean conectou = abreConexao();
		    	
		    fechaConexao();
		    	
		    return conectou;
		}




}
