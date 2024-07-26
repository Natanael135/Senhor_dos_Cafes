package codigojogo;

public class Cafezinho extends Personagem {

	public Cafezinho(String nome, int[] listaAtq, int[] listaDef, int somaAtq, int somaDef) {
		super(nome, listaAtq, listaDef, somaAtq, somaDef);
	}

	public EnumTiposdePersonagens tipo() {
		return EnumTiposdePersonagens.CAF;
	}

}
