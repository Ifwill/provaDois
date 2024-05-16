package controller;

import java.sql.SQLException;

import dao.PacienteDao;
import model.Medico;
import model.Paciente;
import view.PacienteView;

public class PacienteController {
	private Medico medico;
	private Paciente paciente;
	private PacienteView pacienteView;
	private PacienteDao pacienteDao;
	
	
	public PacienteController() {
		medico = new Medico();
		paciente = new Paciente();
		pacienteView = new PacienteView();
		pacienteDao = new PacienteDao();
		
	}
	
	public void start() {
		int op = 0;
		do {
			switch (pacienteView.menu()) {
			case 1:
				cadastrarPaciente();
				
				break;
			case 2:
				pacienteDao.testaConexao();
				break;
			
			}
				
			
			
		}while(op != 0);
			
	}
	
	public void cadastrarPaciente() {
		String cpf = pacienteView.cpf();
		String nome = pacienteView.nome();
		int idade = pacienteView.idade();
		Boolean sexo = pacienteView.sexo();
		Paciente paciente = new Paciente(cpf,nome,idade,sexo);
		try {
			pacienteDao.cadastrarPaciente(paciente);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		start();
	}

}
