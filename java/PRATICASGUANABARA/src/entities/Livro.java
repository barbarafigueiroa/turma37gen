package entities;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor; // vai ser uma instancia da classe pessoa

	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.leitor = leitor;
		this.aberto = false;
		this.pagAtual = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public String detalhes() {
		return "Livro \n TÍTULO: " + titulo + " |AUTOR: " + autor + "\n TOTAL DE PÁGINAS: " + totalPaginas
				+ " |PÁGINA ATUAL: " + pagAtual + "\n ABERTO? : " + aberto + "\n LEITOR: " + leitor.getNome()
				+ " |IDADE: " + leitor.getIdade() + ", |SEXO: " + leitor.getSexo() + "]\n";
	}

	@Override
	public void abrir() {

	}

	@Override
	public void fechar() {

	}

	@Override
	public void folhear(int pg) {
		if (pg > this.totalPaginas) {
			this.pagAtual = 0;

		} else {
			this.pagAtual = pg;
		}

	}

	@Override
	public void avancarPg() {
		this.pagAtual++;

	}

	@Override
	public void voltarPg() {
		this.pagAtual--;

	}

}
