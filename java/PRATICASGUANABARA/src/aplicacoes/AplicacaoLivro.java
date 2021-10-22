package aplicacoes;

import entities.Livro;
import entities.Pessoa;

public class AplicacaoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "m");
		p[1] = new Pessoa("barbara", 28, "f");
		
		l[0] = new Livro("ainda da", "Cortella", 110, p[1]);
		l[1] = new Livro("a vida n é util", "Krenak", 75, p[0]);
		l[2] = new Livro("java", "alguem", 450, p[1]);
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPg();
		
		
		
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		
		
		

	}

}
