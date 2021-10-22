package aplicacoes;

import entities.AlunoV;
import entities.BolsistaV;
import entities.VisitanteV;

//import entities.PessoaV;

public class AaplicationVisitante {

	public static void main(String[] args) {
		
		//PessoaV p1 = new PessoaV(); NÃO PODE SER INSTANCIADA POIS É ABSTRATA
		VisitanteV v1 = new VisitanteV();
		v1.setNome("Barbara");
		v1.setIdade(28);
		v1.setSexo("F");
		System.out.println(v1.toString());
		
		AlunoV a1 = new AlunoV();
		a1.setNome("Claudio");
		a1.setMatricula(1216);
		a1.setCurso("Informática");
		a1.setIdade(28);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		BolsistaV b1 = new BolsistaV();
		b1.setMatricula(1123);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5);
		b1.setSexo("m");
		b1.pagarMensalidade();
		
		
		
		

	}

}
