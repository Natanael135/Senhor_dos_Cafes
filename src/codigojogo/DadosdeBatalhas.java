package codigojogo;

import java.util.ArrayList;

public class DadosdeBatalhas {

	private ArrayList<String> qMortos;
	private ArrayList<String> qVivos;

	private int qPtsCAF;
	private int qPtsNEO;
	private int qPtsORC;
	private int qPtsTRI;
	private int qPtsCOP;
	private int qPtsMOR;

	public DadosdeBatalhas() {
		qMortos = new ArrayList<String>();
		qVivos = new ArrayList<String>();
		this.qPtsMOR = 0;
		this.qPtsCOP = 0;
		this.qPtsCAF = 0;
		this.qPtsNEO = 0;
		this.qPtsORC = 0;
		this.qPtsTRI = 0;
	}

	public void contaPontos(EnumTiposdePersonagens tipo, int pontos) {

		switch (tipo) {
		case NEO:
			qPtsNEO += pontos;
			break;
		case ORC:
			qPtsORC += pontos;
			break;
		case TRI:
			qPtsTRI += pontos;
			break;
		case MOR:
			qPtsMOR += pontos;
			break;
		case COP:
			qPtsCOP += pontos;
			break;
		case CAF:
			qPtsCAF += pontos;
			break;
		}
	}

	public void contaVivos(String nome, int pontos) {

		if (pontos < 0)
			qMortos.add(nome);
		else
			qVivos.add(nome);
	}

	public String mostrarVivos() {

		String msg = "";

		for (String quantPString : qVivos) {
			if (quantPString == qVivos.get(qVivos.size() - 1))
				msg += quantPString;
			else
				msg += quantPString + ",";
		}
		return msg;
	}

	public String mostrarMortos() {

		String msg = "";

		for (String quantPString : qMortos) {
			if (quantPString == qMortos.get(qMortos.size() - 1))
				msg += quantPString;
			else
				msg += quantPString + ",";
		}
		return msg;
	}

	public String toString() {

		return ";MOR=" + qPtsMOR + ", COP=" + qPtsCOP + ", CAF=" + qPtsCAF + ", NEO=" + qPtsNEO + ", ORC=" + qPtsORC
				+ ", TRI=" + qPtsTRI + ";" + qVivos.size() + ";" + qMortos.size() + ";" + mostrarVivos() + ";"
				+ mostrarMortos();
	}

	public int getQuantPontMOR() {
		return qPtsMOR;
	}

	public int getQuantPontCOP() {
		return qPtsCOP;
	}

	public int getQuantPontCAF() {
		return qPtsCAF;
	}

	public int getQuantPontNEO() {
		return qPtsNEO;
	}

	public int getQuantPontORC() {
		return qPtsORC;
	}

	public int getQuantPontTRI() {
		return qPtsTRI;
	}
}
