package bancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;

import codigojogo.*;

public class ComputarBancoDeDados {
	private String nomeVencedor;
	private int pontosVencedor;
	private String nomePerdedor;
	private int pontosPerdedor;

	public void inserirComArquivo(BatalhaIndividual p) {

		try {
			Connection conexao = new Conexao().getConexao();
			PreparedStatement conectadoBD = conexao.prepareStatement("INSERT INTO banco (TipoP1, NomeP1, FdefP1,"
					+ "FatkP1, TipoP2, NomeP2, FdefP2, FatkP2, SomaAtkP1, SomaDefP1, SomaAtkP2, SomaDefP2)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

			conectadoBD.setString(1, "" + p.getPersonagem1().tipo());
			conectadoBD.setString(2, p.getPersonagem1().getNome());
			conectadoBD.setInt(3, p.getPersonagem1().getForcaAtq());
			conectadoBD.setInt(4, p.getPersonagem1().getForcaDef());

			conectadoBD.setString(5, "" + p.getPersonagem2().tipo());
			conectadoBD.setString(6, p.getPersonagem2().getNome());
			conectadoBD.setInt(7, p.getPersonagem2().getForcaAtq());
			conectadoBD.setInt(8, p.getPersonagem2().getForcaDef());

			conectadoBD.setInt(9, p.getPersonagem1().getSomaAtq() - p.getPersonagem1().getForcaAtq());
			conectadoBD.setInt(10, p.getPersonagem1().getSomaDef() - p.getPersonagem1().getForcaDef());
			conectadoBD.setInt(11, p.getPersonagem2().getSomaAtq() - p.getPersonagem2().getForcaAtq());
			conectadoBD.setInt(12, p.getPersonagem2().getSomaDef() - p.getPersonagem1().getForcaDef());

			conectadoBD.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.err.println("nao foi computado");
		}

	}

	public void inserirComInterface(PersonagemDAO a) {

		try {
			Connection conexao = new Conexao().getConexao();
			PreparedStatement conectadoBD = conexao.prepareStatement("INSERT INTO banco (TipoP1, NomeP1, FdefP1, "
					+ "FatkP1, TipoP2, NomeP2, FdefP2, FatkP2, SomaAtkP1, SomaDefP1, SomaAtkP2, SomaDefP2)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

			conectadoBD.setString(1, "" + a.getTipoP1());
			conectadoBD.setString(2, a.getNomeP1());
			conectadoBD.setInt(3, a.getFatkP1());
			conectadoBD.setInt(4, a.getFdefP1());

			conectadoBD.setString(5, "" + a.getTipoP2());
			conectadoBD.setString(6, a.getNomeP2());
			conectadoBD.setInt(7, a.getFatkP2());
			conectadoBD.setInt(8, a.getFdefP2());

			conectadoBD.setInt(9, a.getSomaAtkP1());
			conectadoBD.setInt(10, a.getSomaDefP1());
			conectadoBD.setInt(11, a.getSomaAtkP2());
			conectadoBD.setInt(12, a.getSomaDefP2());

			conectadoBD.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.err.println("nao foi computado");
		}

		int[] somaDefP1 = { a.getSomaDefP1() };
		int[] somaAtqP2 = { a.getSomaAtkP2() };
		int[] somaDefP2 = { a.getSomaDefP2() };
		int[] somaAtkP1 = { a.getSomaAtkP1() };

		CriarPersonagemDAO p1 = new CriarPersonagemDAO(a.getNomeP1(), somaAtkP1, somaDefP1, a.getFatkP1(),
				a.getFdefP1());
		CriarPersonagemDAO p2 = new CriarPersonagemDAO(a.getNomeP2(), somaAtqP2, somaDefP2, a.getFatkP2(),
				a.getFdefP2());

		BatalhaIndividual p = new BatalhaIndividual(p1, p2);

		p.p1lutarComp2();
		pontosVencedor = p.getVencedor().getPontos();
		nomeVencedor = p.getVencedor().getNome();
		nomePerdedor = p.getPerdedor().getNome();
		pontosPerdedor = p.getPerdedor().getPontos();

	}

	public String getNomeVencedor() {
		return this.nomeVencedor;
	}

	public int getPontosVencedor() {
		return this.pontosVencedor;
	}

	public String getNomePerdedor() {
		return nomePerdedor;
	}

	public int getPontosPerdedor() {
		return pontosPerdedor;
	}
}
