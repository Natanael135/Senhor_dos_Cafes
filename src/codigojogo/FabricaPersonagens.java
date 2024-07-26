package codigojogo;

public class FabricaPersonagens {

	private int quantMOR;
	private int quantCOP;
	private int quantCAF;
	private int quantORC;
	private int quantNEO;
	private int quantTRI;

	public Personagem criarPersonagem(EnumTiposdePersonagens tipo, String nome, int[] ataques, int[] defesas, int forcaAtq,
			int forcaDef) {

		switch (tipo) {
		case NEO:
			quantNEO++;
			return new Neo(nome, ataques, defesas, forcaAtq, forcaDef);
		case ORC:
			quantORC++;
			return new Oraculo(nome, ataques, defesas, forcaAtq, forcaDef);
		case TRI:
			quantTRI++;
			return new Trinity(nome, ataques, defesas, forcaAtq, forcaDef);
		case MOR:
			quantMOR++;
			return new Morfeu(nome, ataques, defesas, forcaAtq, forcaDef);
		case COP:
			quantCOP++;
			return new Copinho(nome, ataques, defesas, forcaAtq, forcaDef);
		case CAF:
			quantCAF++;
			return new Cafezinho(nome, ataques, defesas, forcaAtq, forcaDef);
		default:
			return null;
		}

	}

	public int getQtdMOR() {
		return quantMOR;
	}

	public int getQtdCOP() {
		return quantCOP;
	}

	public int getQtdCAF() {
		return quantCAF;
	}

	public int getQtdORC() {
		return quantORC;
	}

	public int getQtdNEO() {
		return quantNEO;
	}

	public int getQtdTRI() {
		return quantTRI;
	}

}
