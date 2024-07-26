package codigojogo;

public class Trinity extends Personagem {

	public Trinity(String nome, int[] listaAtaque, int[] listaDefesa, int somaAtq, int somaDef) {
		super(nome, listaAtaque, listaDefesa, somaAtq, somaDef);
	}

	public EnumTiposdePersonagens tipo() {
		return EnumTiposdePersonagens.TRI;
	}
}
