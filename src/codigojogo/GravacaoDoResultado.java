package codigojogo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GravacaoDoResultado {

	public void gravar(String caminho, String msg) {

		try {
			FileWriter write = new FileWriter(new File(caminho));
			write.write(msg);
			write.close();
		} catch (IOException e) {
			System.err.println("nao foi possivel gravar o arquivo");
			e.printStackTrace();
		}

	}

}
