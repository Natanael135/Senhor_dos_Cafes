package codigojogo;

public class Neo extends Personagem {

	public Neo(String nome, int[] listaAtaque, int[] listaDefesa, int somaAtq, int somaDef) {
		super(nome, listaAtaque, listaDefesa, somaAtq, somaDef);
	}

	public EnumTiposdePersonagens tipo() {
		return EnumTiposdePersonagens.NEO;
	}

}
