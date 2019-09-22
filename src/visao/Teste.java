package visao;
import java.util.Scanner;
import modelo.LivroDeBiblioteca;
import modelo.LivroDeLivraria;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*String titulo, autor, isbn, editora;
		boolean promo;
		double preco;
		int quant;*/
		
		// TESTANDO LIVRO COMERCIAL
		LivroDeLivraria lv01 = new LivroDeLivraria("Java para iniciantes", "ISBN", "Oracle", "Saraiva", 80.00, 10, false);
		LivroDeLivraria lv02 = new LivroDeLivraria("Introducao a Sistemas BD", "ISBN", "Date", "Elsever", 140.00, 15, true);
		lv01.infoLivro();
		lv02.infoLivro();
		
		// TESTANDO LIVRO DE BIBLIOTECA
		LivroDeBiblioteca lb01 = new LivroDeBiblioteca("HTML e CSS", "ISBN", "Robson e Freeman", "Altar Books", 10, 3);
		LivroDeBiblioteca lb02 = new LivroDeBiblioteca("Java - GUIA Do Programdor", "ISBN", "Jandl JR.", "Novatec", 5, 5);
		lb01.infoLivroDeBiblioteca();
		lb02.infoLivroDeBiblioteca();
	}

}
