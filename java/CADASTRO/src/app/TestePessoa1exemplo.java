package app;

import entities.Coordenador1exemplo;
import entities.Funcionario1exemplo;
import entities.Pessoa1exemplo;

public class TestePessoa1exemplo {

	public static void main(String[] args) {
		
		Pessoa1exemplo barbara = new Pessoa1exemplo("Bárbara", 343437);
		Funcionario1exemplo pedro = new Funcionario1exemplo("Pedro", 222200, "TI");
		Pessoa1exemplo maria = new Funcionario1exemplo("Maria", 665588,"Informática--Desenvolvimento");
		Pessoa1exemplo jose = new Coordenador1exemplo("Jose", 445588, "CC");
		
		
		System.out.println(barbara.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
		

	}

}
