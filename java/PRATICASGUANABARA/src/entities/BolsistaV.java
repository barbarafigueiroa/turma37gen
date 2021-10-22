package entities;

public class BolsistaV extends AlunoV{
	private double bolsa;

	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa do alune " + this.getNome());
		
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " É bolsista! Pagamento facilitado");
	}
	
	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	
	

}
