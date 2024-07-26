package codigojogo;

public class Morfeu extends Personagem {

	public Morfeu(String nome, int[] listaAtq, int[] listaDef, int somaAtq, int somaDef) {
		super(nome, listaAtq, listaDef, somaAtq, somaDef);
	}

	public EnumTiposdePersonagens tipo() {
		return EnumTiposdePersonagens.MOR;
	}

}
