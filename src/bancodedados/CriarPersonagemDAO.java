package bancodedados;

import codigojogo.*;


	public class CriarPersonagemDAO extends Personagem {
	private EnumTiposdePersonagens  tipo;
	
	public CriarPersonagemDAO(String nome, int[] listaAtaque, int[] listaDefesa, int forcaDef, int forcaAtq) {
		super(nome, listaAtaque, listaDefesa, forcaDef, forcaAtq);
		
	}

	public EnumTiposdePersonagens tipo() {
		
		return this.tipo;
	}

}
