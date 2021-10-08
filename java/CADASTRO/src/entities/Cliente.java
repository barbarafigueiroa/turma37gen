package entities;

public class Cliente {

	public String nome;
	public String endereco;
	public int diaNiversario;
	public int mesNiversario;
	public int anoNascimento;
	public String cpf;
	public int rg;
	public String email;
	public char pronome;

	public int calcularIdade() {

		return 2021 - anoNascimento;
	}

	public String mensagemFelizAniversario(int dataAtual) {
		
		if (dataAtual == diaNiversario) {

		}
		return ("Feliz aniversário" + nome
				+ "! Hoje você terá 20% de desconto em qualquer produto da loja. A P R O V E I T E !!!");
	}

	public String descontoMesNiversario() {
		int mesAtual = 0;
		if (mesAtual == mesNiversario) {

		}
		return ("Chegou o mês do seu aniversário! Estamos contando os dias...");
	}

}
