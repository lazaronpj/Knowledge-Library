package br.com.lazaro.bibliotecasaber.dto;

public class LivroDTO {

	private int idLivro;
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String resumo;
	
	public LivroDTO() {
	}
	
	public LivroDTO(int idLivro, String titulo, String autor, int anoPublicacao, String resumo) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.resumo = resumo;
	}
	
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
		
}
