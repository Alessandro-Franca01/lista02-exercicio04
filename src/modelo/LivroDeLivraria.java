package modelo;

public class LivroDeLivraria {
		//Ficaria mehor com herança
		//titulo,ISBN, autor, editora.
	
	private String titulo;
	private String isbn;
	private String autor;
	private String editora;
	private Double preco;
	private Integer quantidade;
	private boolean promocao; // true = esta em promoção  e  false = não esta
	
	public LivroDeLivraria() {
		
	}
	// TESTAR!!
	public LivroDeLivraria(String titulo, String isbn, String autor, String editora, Double preco, Integer quantidade,
			boolean promocao) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
		this.preco = preco;
		this.quantidade = quantidade;
		this.promocao = promocao;
		
	}
	// TESTAR!!
	public void infoLivro() {
		System.out.println("Titulo: "+this.titulo);
		System.out.println("ISBN: "+this.isbn);
		System.out.println("autor: "+this.autor);
		System.out.println("editora: "+this.editora);
		System.out.println("preco: "+this.preco);
		System.out.println("quantidade: "+this.quantidade);
		this.saidaPromocao();
	}
	
	public void saidaPromocao() {
		if(this.promocao == true) {
			System.out.println("Este livro esta em promoçao\n");
		}
		if(this.promocao == false) {
			System.out.println("Este livro não esta em promoção\n");
		}
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	
	
	
}
