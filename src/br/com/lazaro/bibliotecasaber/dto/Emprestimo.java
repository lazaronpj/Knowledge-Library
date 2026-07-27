package br.com.lazaro.bibliotecasaber.dto;

import java.time.LocalDate;

public class Emprestimo {
	
	private int idEmprestimo;
	private int idLivro;
	private int idUsuario;
	private LocalDate dataRetirada;
	private LocalDate dataDevolucao;
	
	public Emprestimo() {
	}
	
	public Emprestimo(int idEmprestimo, int idLivro, int idUsuario, LocalDate dataRetirada, LocalDate dataDevolucao) {
		this.idEmprestimo = idEmprestimo;
		this.idLivro = idLivro;
		this.idUsuario = idUsuario;
		this.dataRetirada = dataRetirada;
		this.dataDevolucao = dataDevolucao;
	}

	public int getIdEmprestimo() {
		return idEmprestimo;
	}

	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public LocalDate getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(LocalDate dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
}
