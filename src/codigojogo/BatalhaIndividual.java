package codigojogo;

import bancodedados.ComputarBancoDeDados;
import bancodedados.Conexao;

public class BatalhaIndividual {

	private Personagem personagem1;
	private Personagem personagem2;
	private Personagem pVencedor;
	private Personagem pPerdedor;
	private int cod;

	Conexao conexao = new Conexao();
	ComputarBancoDeDados d = new ComputarBancoDeDados();

	//construtor para dados vindo de arquivo
	public BatalhaIndividual(Personagem x, Personagem y, int bCod) {
		this.personagem1 = x;
		this.personagem2 = y;
		this.cod = bCod;
		conexao.getConexao();
		d.inserirComArquivo(this);

	}
	//construtor para dados vindo de interface
	public BatalhaIndividual(Personagem x, Personagem y) {
		this.personagem1 = x;
		this.personagem2 = y;
		conexao.getConexao();

		// d.inserirComArquivo(this);

	}

	public void p1lutarComp2() {

		if (personagem1.getSomaAtq() > personagem2.getSomaDef()) {
			personagem1.setPontuacao(personagem1.getSomaAtq() - personagem2.getSomaDef());
			personagem2.setPontuacao(personagem2.getSomaDef() - personagem1.getSomaAtq());
		} else if (personagem1.getSomaAtq() < personagem2.getSomaDef()) {
			personagem1.setPontuacao(personagem1.getSomaAtq() - personagem2.getSomaDef());
			personagem2.setPontuacao(personagem2.getSomaDef() - personagem1.getSomaAtq());
		}
		if (personagem2.getSomaAtq() > personagem1.getSomaDef()) {
			personagem2.setPontuacao(personagem2.getSomaAtq() - personagem1.getSomaDef());
			personagem1.setPontuacao(personagem1.getSomaDef() - personagem2.getSomaAtq());
		} else if (personagem2.getSomaAtq() < personagem1.getSomaDef()) {
			personagem2.setPontuacao(personagem2.getSomaAtq() - personagem1.getSomaDef());
			personagem1.setPontuacao(personagem1.getSomaDef() - personagem2.getSomaAtq());
		}
		verVencedorePerdedor();
	}

	private void verVencedorePerdedor() {

		if (personagem1.getPontos() > personagem2.getPontos()) {
			this.pVencedor = personagem1;
			this.pPerdedor = personagem2;

		} else if (personagem1.getPontos() < personagem2.getPontos()) {
			this.pVencedor = personagem2;
			this.pPerdedor = personagem1;
		}
	}

	public Personagem getPersonagem1() {
		return personagem1;
	}

	public Personagem getPersonagem2() {
		return personagem2;
	}

	public Personagem getVencedor() {
		return pVencedor;
	}

	public int getCodigo() {
		return cod;
	}

	public Personagem getPerdedor() {
		return pPerdedor;
	}

}
