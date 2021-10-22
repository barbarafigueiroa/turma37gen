package aplicacoes;

import entities.ContaBanco;

public class aplicandoBanco {

	public static void main(String[] args) {
		ContaBanco pessoa1 = new ContaBanco();
		pessoa1.setNumeroConta(1002182-0);
		pessoa1.setNomeTitular("Bárbara Figueirôa Amorim");
		pessoa1.abrirConta("cc");
		
		
		ContaBanco pessoa2 = new ContaBanco();
		
		pessoa2.setNumeroConta(2500563);
		pessoa2.setNomeTitular("Maria Joseleide de Castro Figueirôa de Moura");
		pessoa2.abrirConta("cp");
		
		pessoa1.depositar(100);
		pessoa2.depositar(500);
		pessoa2.sacar(pessoa2.getSaldo());
		pessoa1.sacar(pessoa1.getSaldo());
		pessoa2.fecharConta();
		pessoa1.fecharConta();
		
		
		
		pessoa1.estadoAtual();
		pessoa2.estadoAtual();
		
		

	}

}
