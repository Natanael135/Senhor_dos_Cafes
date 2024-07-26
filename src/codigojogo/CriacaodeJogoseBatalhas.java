package codigojogo;

import java.util.ArrayList;

public class CriacaodeJogoseBatalhas {

	private LeituraDeDados ler;
	private DadosdeBatalhas dadosdeBatalhas;
	private GravacaoDoResultado gravar;
	private ArrayList<BatalhaIndividual> batalhasIndividuais;
	EscolhaLereGravar computar = new EscolhaLereGravar();
	private int opp;

	public CriacaodeJogoseBatalhas() {
		batalhasIndividuais = new ArrayList<BatalhaIndividual>();
		ler = new LeituraDeDados();
		dadosdeBatalhas = new DadosdeBatalhas();
		gravar = new GravacaoDoResultado();

	}

	public void iniciar() {

		// Opcao para escolher o caminho do arquivo ** precisa melhorar**

		System.out.println(this.opp);

		ler.ler(computar.escolhaArquivoLer(this.opp));
		gerarBatalhas();
		lutarBatalhas();
		contarPontos();
		contarVivos();

		gravar.gravar(computar.escolhaArquivoGravar(this.opp), gravarNoArquivo());
		this.opp = 0;
	}

	public void gerarBatalhas() {

		for (int i = 0; i < ler.getQuantCombates(); i++) {
			batalhasIndividuais
					.add(new BatalhaIndividual(ler.getPersonagens1().get(i), ler.getPersonagens2().get(i), i));
		}
	}

	public void lutarBatalhas() {

		for (int i = 0; i < ler.getQuantCombates(); i++) {
			batalhasIndividuais.get(i).p1lutarComp2();
		}

	}

	public void contarPontos() {
		for (BatalhaIndividual batalhaIndividual : batalhasIndividuais) {
			dadosdeBatalhas.contaPontos(batalhaIndividual.getPersonagem1().tipo(),
					batalhaIndividual.getPersonagem1().getPontos());
			dadosdeBatalhas.contaPontos(batalhaIndividual.getPersonagem2().tipo(),
					batalhaIndividual.getPersonagem2().getPontos());
		}
	}

	public void contarVivos() {
		for (BatalhaIndividual batalhaIndividual : batalhasIndividuais) {
			dadosdeBatalhas.contaVivos(batalhaIndividual.getPersonagem1().getNome(),
					batalhaIndividual.getPersonagem1().getPontos());

			dadosdeBatalhas.contaVivos(batalhaIndividual.getPersonagem2().getNome(),
					batalhaIndividual.getPersonagem2().getPontos());
		}
	}

	public String gravarNoArquivo() {

		String result = ler.getQuantBatalhas() + ";" + ler.getQuantCombates() + ";MOR=" + ler.getCriar().getQtdMOR()
				+ ", COP=" + ler.getCriar().getQtdCOP() + ", CAF=" + ler.getCriar().getQtdCAF() + ", NEO="
				+ ler.getCriar().getQtdNEO() + ", ORC=" + ler.getCriar().getQtdORC() + ", TRI="
				+ ler.getCriar().getQtdTRI() + dadosdeBatalhas;

		return result;
	}

	public int atribuirValor(int a) {
		this.opp = a;
		return this.opp;
	}

}
