package codigojogo;

public class Copinho extends Personagem {

	public Copinho(String nome, int[] listaAtq, int[] listaDef, int somaAtq, int somaDef) {
		super(nome, listaAtq, listaDef, somaAtq, somaDef);
	}

	public EnumTiposdePersonagens tipo() {
		return EnumTiposdePersonagens.COP;
	}

}
