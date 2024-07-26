package codigojogo;

public class Oraculo extends Personagem {

	public Oraculo(String nome, int[] listaAtaque, int[] listaDefesa, int somaAtq, int somaDef) {
		super(nome, listaAtaque, listaDefesa, somaAtq, somaDef);
	}

	public EnumTiposdePersonagens tipo() {
		return EnumTiposdePersonagens.ORC;
	}

}
