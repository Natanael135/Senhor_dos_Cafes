package bancodedados;

public class PersonagemDAO {

	private String tipoP1;
	private String nomeP1;
	private int FatkP1;
	private int FdefP1;
	private String TipoP2;
	private String NomeP2;
	private int FatkP2;
	private int FdefP2;
	private int SomaAtkP1;
	private int SomaDefP1;
	private int SomaAtkP2;
	private int SomaDefP2;
	
	
	public String getTipoP1() {
		return tipoP1;
	}
	public String getNomeP1() {
		return nomeP1;
	}
	public int getFatkP1() {
		return FatkP1;
	}
	public int getFdefP1() {
		return FdefP1;
	}
	public String getTipoP2() {
		return TipoP2;
	}
	public String getNomeP2() {
		return NomeP2;
	}
	public int getFatkP2() {
		return FatkP2;
	}
	public int getFdefP2() {
		return FdefP2;
	}
	public int getSomaAtkP1() {	
		return SomaAtkP1;
	}
	public int getSomaDefP1() {
		
		return SomaDefP1;
	}
	public int getSomaAtkP2() {
		
		return SomaAtkP2;
	}
	public int getSomaDefP2() {
		
		return SomaDefP2;
	}

	public void setTipoP1(String tipoP1) {
		this.tipoP1 = tipoP1.toUpperCase();
	}

	public void setNomeP1(String nomeP1) {
		this.nomeP1 = nomeP1.toUpperCase();
	}

	public void setFatkP1(String fatkP1) {
		FatkP1 = Integer.parseInt(fatkP1);
	}

	public void setFdefP1(String fdefP1) {
		FdefP1 = Integer.parseInt(fdefP1);
	}

	public void setTipoP2(String tipoP2) {
		TipoP2 = tipoP2.toUpperCase();
	}

	public void setNomeP2(String nomeP2) {
		NomeP2 = nomeP2.toUpperCase();
	}

	public void setFatkP2(String fatkP2) {
		FatkP2 = Integer.parseInt(fatkP2);
	}

	public void setFdefP2(String fdefP2) {
		FdefP2 = Integer.parseInt(fdefP2);
	}

	public void setSomaAtkP1(String somaAtkP1) {
		SomaAtkP1 = Integer.parseInt(somaAtkP1);
	}

	public void setSomaDefP1(String somaDefP1) {
		SomaDefP1 = Integer.parseInt(somaDefP1);
	}

	public void setSomaAtkP2(String somaAtkP2) {
		SomaAtkP2 = Integer.parseInt(somaAtkP2);
	}

	public void setSomaDefP2(String somaDefP2) {
		SomaDefP2 = Integer.parseInt(somaDefP2);
	}
	
}
