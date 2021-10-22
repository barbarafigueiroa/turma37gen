package entities;

public class ContaPoupanca extends Conta {
	private int diaAniversario;

	public ContaPoupanca(int numero, String cpf, int diaAniversario) {
		super(numero, cpf);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void correcao(int diaAtual) {

		if (diaAniversario == diaAtual) {
			super.creditoEmConta(super.getSaldo() * 0.0005);
		
		}
		else {
			System.out.println("N�o houve corre��o, pois n�o � anivers�rio da conta");
		}
		

	}

	
}