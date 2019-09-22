package modelo;

public class LivroDeBiblioteca {

	private Integer idLivroB;
	private String tituloB;
	private String isbnB;
	private String autorB;
	private String editoraB;
	private Integer quantidadeB;
	private Integer emprestados;
	
	public LivroDeBiblioteca() {
		
	}
	
	public LivroDeBiblioteca(String tituloB, String isbnB, String autorB, String editoraB,
			Integer quantidadeB, Integer emprestados) {
		
		this.tituloB = tituloB;
		this.isbnB = isbnB;
		this.autorB = autorB;
		this.editoraB = editoraB;
		this.quantidadeB = quantidadeB;
		this.emprestados = emprestados;
	}
	
	
	public int estoqueAtual() {
		int quantidadeDisponivel =  quantidadeB - emprestados;
		return quantidadeDisponivel;
	}
	
	public void emprestarLivro(int quant) {
		this.emprestados = this.emprestados + quant; 
	}
	
	public void infoLivroDeBiblioteca() {
		System.out.println("Titulo: "+this.tituloB);
		System.out.println("ISBN: "+this.isbnB);
		System.out.println("Autor: "+this.autorB);
		System.out.println("Editora: "+this.editoraB);
		System.out.println("Emprestimos: "+this.emprestados);
		System.out.println("Quantidade: "+this.quantidadeB);
		System.out.println("Disponibilidade: "+this.estoqueAtual()+" disponiveis\n" );
		
	}
	
	public String getTituloB() {
		return tituloB;
	}

	public void setTituloB(String tituloB) {
		this.tituloB = tituloB;
	}

	public String getIsbnB() {
		return isbnB;
	}

	public void setIsbnB(String isbnB) {
		this.isbnB = isbnB;
	}

	public String getAutorB() {
		return autorB;
	}

	public void setAutorB(String autorB) {
		this.autorB = autorB;
	}

	public String getEditoraB() {
		return editoraB;
	}

	public void setEditoraB(String editoraB) {
		this.editoraB = editoraB;
	}

	public Integer getQuantidadeB() {
		return quantidadeB;
	}

	public void setQuantidadeB(Integer quantidadeB) {
		this.quantidadeB = quantidadeB;
	}

	public int isEmprestado() {
		return emprestados;
	}

	public void setEmprestado(int emprestado) {
		this.emprestados = emprestados;
	}
	
}
