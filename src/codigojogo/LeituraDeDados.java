package codigojogo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeituraDeDados {

	private FabricaPersonagens criarFabricaPersonagem;
	public ArrayList<Personagem> personagemP1;
	private ArrayList<Personagem> personagemP2;
	private int quantCombates;
	private int quantBatalhas;


	
	public LeituraDeDados() {
		this.criarFabricaPersonagem = new FabricaPersonagens();
		this.personagemP1 = new ArrayList<Personagem>();
		this.personagemP2 = new ArrayList<Personagem>();
		this.quantCombates = 0;
		this.quantBatalhas = 0;
	
	}

	public void ler(String caminho) {
		BufferedReader buff;

		try {
			buff = new BufferedReader(new FileReader(caminho));

			while (buff.ready()) {
				split(buff.readLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void split(String nLinha) {

		if (nLinha != null) {
			String[] spliteLinha = nLinha.split(";");

			if (spliteLinha.length > 1) {
				criarPersonagens(spliteLinha);

				quantCombates++;
				if (Integer.parseInt(spliteLinha[1]) != quantBatalhas) {
					quantBatalhas++;
				}
			}
		}
	}

	public void criarPersonagens(String[] splite) {
		int forcaAtq1 = Integer.parseInt(splite[5]);
		int forcaDef1 = Integer.parseInt(splite[6]);
		int forcaAtq2 = Integer.parseInt(splite[9]);
		int forcaDef2 = Integer.parseInt(splite[10]);
		int[] listaAtqP1 = new int[10];
		int[] listaDefP1 = new int[10];
		int[] listaAtqP2 = new int[10];
		int[] listaDefP2 = new int[10];
		int aux = 0;

		for (int i = 11; i <= 20; i++) {
			listaAtqP1[aux] = Integer.parseInt(splite[i]);
			aux++;
		}
		aux = 0;
		for (int i = 21; i <= 30; i++) {
			listaDefP1[aux] = Integer.parseInt(splite[i]);
			aux++;
		}

		personagemP1.add(criarFabricaPersonagem.criarPersonagem(EnumTiposdePersonagens.valueOf(splite[3]), splite[4], listaAtqP1,
				listaDefP1, forcaAtq1, forcaDef1));

		aux = 0;
		for (int i = 31; i <= 40; i++) {
			listaAtqP2[aux] = Integer.parseInt(splite[i]);
			aux++;
		}
		aux = 0;
		for (int i = 41; i <= 50; i++) {
			listaDefP2[aux] = Integer.parseInt(splite[i]);
			aux++;
		}
		personagemP2.add(criarFabricaPersonagem.criarPersonagem(EnumTiposdePersonagens.valueOf(splite[7]), splite[8], listaAtqP2,
				listaDefP2, forcaAtq2, forcaDef2));

	}

	public ArrayList<Personagem> getPersonagens1() {
		return personagemP1;
	}

	public ArrayList<Personagem> getPersonagens2() {
		return personagemP2;
	}

	public int getQuantBatalhas() {
		return quantBatalhas;
	}

	public int getQuantCombates() {
		return quantCombates;
	}

	public FabricaPersonagens getCriar() {
		return criarFabricaPersonagem;
	}

}
