package interfacegrafica;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class EscolherOpcaoInterface extends JOptionPane {

	public void visualizarInterface() {

		ViewInterface cadInfoJogo = new ViewInterface();
		ViewInterfaceCSV arqCSV = new ViewInterfaceCSV();
		arqCSV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadInfoJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		arqCSV.setSize(600, 600);
		cadInfoJogo.setSize(600, 600);
		cadInfoJogo.criarPaineis();
		arqCSV.criarPaineisCSV();

		int op = JOptionPane.showConfirmDialog(this, "Sim para executar a interface, ou Nao para CSV",
				"Escolha como sera a Entrada de Dados", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		if (op == 0) {
			arqCSV.setVisible(false);
			cadInfoJogo.setVisible(true);
		} else if (op == 1) {
			cadInfoJogo.setVisible(false);
			arqCSV.setVisible(true);
		}

	}

}
