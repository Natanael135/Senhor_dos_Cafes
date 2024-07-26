package codigojogo;

public abstract class Personagem {

	private String nome;
	private int pontos;
	private int somaAtqtotal;
	private int somaDeftotal;
	private int[] listaAtaque;
	private int[] listaDefesa;
	private int forcaAtq;
	private int forcaDef;

	public Personagem(String nome, int[] listaAtaque, int[] listaDefesa, int forcaDef, int forcaAtq) {
		this.nome = nome;
		this.listaAtaque = listaAtaque;
		this.listaDefesa = listaDefesa;
		this.forcaAtq = forcaAtq;
		this.forcaDef = forcaDef;
		this.somaAtqtotal = computarAtaqueTotal(listaAtaque, forcaAtq);
		this.somaDeftotal = computarDefesaTotal(listaDefesa, forcaDef);
		this.pontos = 0;
	}

	public int computarAtaqueTotal(int[] listaAtaque, int forcaAtq) {
		for (Integer n : listaAtaque) {
			somaAtqtotal += n.intValue();
		}
		somaAtqtotal += forcaAtq;
		return somaAtqtotal;

	}

	public int computarDefesaTotal(int[] listaDefesa, int forcaDef) {
		for (Integer n : listaDefesa) {
			somaDeftotal += n.intValue();
		}
		somaDeftotal += forcaDef;
		return somaDeftotal;
	}

	public void setPontuacao(int ponts) {
		if (this.pontos != ponts)
			this.pontos += ponts;
	}

	public int[] getListaAtaque() {
		return listaAtaque;
	}

	public int[] getListaDefesa() {
		return listaDefesa;
	}

	public int getSomaAtq() {
		return somaAtqtotal;
	}

	public int getSomaDef() {
		return somaDeftotal;
	}

	public String getNome() {
		return nome;
	}

	public int getForcaAtq() {
		return forcaAtq;
	}

	public int getForcaDef() {
		return forcaDef;
	}

	public int getPontos() {
		return pontos;
	}

	public abstract EnumTiposdePersonagens tipo();
}