package entities;

public interface Publicacao {

	public abstract void abrir();
	public abstract void fechar();
	public abstract void folhear(int pg);
	public abstract void avancarPg();
	public abstract void voltarPg();
	public abstract String detalhes();
	
}
