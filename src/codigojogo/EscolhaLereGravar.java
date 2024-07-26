package codigojogo;

public class EscolhaLereGravar {

	public String escolhaArquivoLer(int opcao) {

		switch (opcao) {
		case 1:
			return "dados/BF_1.csv";
		case 2:
			return "dados/BF_2.csv";
		case 3:
			return "dados/BF_5.csv";
		case 4:
			return "dados/BF_10.csv";
		case 5:
			return "dados/BF_30.csv";
		case 6:
			return "dados/BF_50.csv";
		case 7:
			return "dados/BF_100.csv";
		case 8:
			return "dados/BF_150.csv";
		case 9:
			return "dados/BF_200.csv";
		case 10:
			return "dados/BF_500.csv";
		case 11:
			return "dados/BF_1000.csv";
		// case 12: //return "dados/" + "" +".csv";
		default:
			return null;

		}

	}

	public String escolhaArquivoGravar(int a) {
		switch (a) {
		case 1:
			return "dados_resposta/BF_1_resposta.csv";
		case 2:
			return "dados_resposta/BF_2_resposta.csv";
		case 3:
			return "dados_resposta/BF_5_resposta.csv";
		case 4:
			return "dados_resposta/BF_10_resposta.csv";
		case 5:
			return "dados_resposta/BF_30_resposta.csv";
		case 6:
			return "dados_resposta/BF_50_resposta.csv";
		case 7:
			return "dados_resposta/BF_100_resposta.csv";
		case 8:
			return "dados_resposta/BF_150_resposta.csv";
		case 9:
			return "dados_resposta/BF_200_resposta.csv";
		case 10:
			return "dados_resposta/BF_500_resposta.csv";
		case 11:
			return "dados_resposta/BF_1000_resposta.csv";
		// case 12: return "dados_resposta/" + "" + ".csv";
		default:
			return null;
		}

	}
}
