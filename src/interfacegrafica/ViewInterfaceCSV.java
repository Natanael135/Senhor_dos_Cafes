package interfacegrafica;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import codigojogo.CriacaodeJogoseBatalhas;

public class ViewInterfaceCSV extends JFrame {

	private static final long serialVersionUID = 1L;
	Font fonte = new Font("Courier New", Font.BOLD, 15);
	Font fonteTitulo = new Font("Courier New", Font.BOLD, 30);

	// criação de botoes
	JButton csvBotao1 = new JButton("Arquivo 1");
	JButton csvBotao2 = new JButton("Arquivo 2");
	JButton csvBotao3 = new JButton("Arquivo 5");
	JButton csvBotao4 = new JButton("Arquivo 10");
	JButton csvBotao5 = new JButton("Arquivo 30");
	JButton csvBotao6 = new JButton("Arquivo 50");
	JButton csvBotao7 = new JButton("Arquivo 100");
	JButton csvBotao8 = new JButton("Arquivo 150");
	JButton csvBotao9 = new JButton("Arquivo 200");
	JButton csvBotao10 = new JButton("Arquivo 500");
	JButton csvBotao11 = new JButton("Arquivo 1000");
	CriacaodeJogoseBatalhas jogo = new CriacaodeJogoseBatalhas();

	public void criarPaineisCSV() {

		setTitle("Escolha qual Arquivo voce deseja");
		setLayout(new FlowLayout());
		csvBotao1.setFont(fonteTitulo);
		csvBotao2.setFont(fonteTitulo);
		csvBotao3.setFont(fonteTitulo);
		csvBotao4.setFont(fonteTitulo);
		csvBotao5.setFont(fonteTitulo);
		csvBotao6.setFont(fonteTitulo);
		csvBotao7.setFont(fonteTitulo);
		csvBotao8.setFont(fonteTitulo);
		csvBotao9.setFont(fonteTitulo);
		csvBotao10.setFont(fonteTitulo);
		csvBotao11.setFont(fonteTitulo);
		// criacao de botao
		add(csvBotao1);
		add(csvBotao2);
		add(csvBotao3);
		add(csvBotao4);
		add(csvBotao5);
		add(csvBotao6);
		add(csvBotao7);
		add(csvBotao8);
		add(csvBotao9);
		add(csvBotao10);
		add(csvBotao11);
		// criacao de acoes do botao
		ComputarAcaoB1 acaoB1csv = new ComputarAcaoB1();
		ComputarAcaoB2 acaoB2csv = new ComputarAcaoB2();
		ComputarAcaoB3 acaoB3csv = new ComputarAcaoB3();
		ComputarAcaoB4 acaoB4csv = new ComputarAcaoB4();
		ComputarAcaoB5 acaoB5csv = new ComputarAcaoB5();
		ComputarAcaoB6 acaoB6csv = new ComputarAcaoB6();
		ComputarAcaoB7 acaoB7csv = new ComputarAcaoB7();
		ComputarAcaoB8 acaoB8csv = new ComputarAcaoB8();
		ComputarAcaoB9 acaoB9csv = new ComputarAcaoB9();
		ComputarAcaoB10 acaoB10csv = new ComputarAcaoB10();
		ComputarAcaoB11 acaoB11csv = new ComputarAcaoB11();

		csvBotao1.addActionListener(acaoB1csv);
		csvBotao2.addActionListener(acaoB2csv);
		csvBotao3.addActionListener(acaoB3csv);
		csvBotao4.addActionListener(acaoB4csv);
		csvBotao5.addActionListener(acaoB5csv);
		csvBotao6.addActionListener(acaoB6csv);
		csvBotao7.addActionListener(acaoB7csv);
		csvBotao8.addActionListener(acaoB8csv);
		csvBotao9.addActionListener(acaoB9csv);
		csvBotao10.addActionListener(acaoB10csv);
		csvBotao11.addActionListener(acaoB11csv);
	}

	public class ComputarAcaoB1 implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			jogo.atribuirValor(1);
			jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			JOptionPane.showMessageDialog(null, "Agora o programa vai encerrar");
			System.exit(0);

		}
	}

	public class ComputarAcaoB2 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// jogo.atribuirValor(2);
			// jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			JOptionPane.showMessageDialog(null, "Agora o programa vai encerrar");
			System.exit(0);
		}
	}

	public class ComputarAcaoB3 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			jogo.atribuirValor(3);
			jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			System.exit(0);
		}
	}

	public class ComputarAcaoB4 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			jogo.atribuirValor(4);
			jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			JOptionPane.showMessageDialog(null, "Agora o programa vai encerrar");
			System.exit(0);
		}
	}

	public class ComputarAcaoB5 implements ActionListener {
		CriacaodeJogoseBatalhas jogo = new CriacaodeJogoseBatalhas();

		public void actionPerformed(ActionEvent e) {
			jogo.atribuirValor(5);
			jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			JOptionPane.showMessageDialog(null, "Agora o programa vai encerrar");
			System.exit(0);
		}
	}

	public class ComputarAcaoB6 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			jogo.atribuirValor(6);
			jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			JOptionPane.showMessageDialog(null, "Agora o programa vai encerrar");
			System.exit(0);
		}
	}

	public class ComputarAcaoB7 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			jogo.atribuirValor(7);
			jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			JOptionPane.showMessageDialog(null, "Agora o programa vai encerrar");
			System.exit(0);
		}
	}

	public class ComputarAcaoB8 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			jogo.atribuirValor(8);
			jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			JOptionPane.showMessageDialog(null, "Agora o programa vai encerrar");
			System.exit(0);
		}
	}

	public class ComputarAcaoB9 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			jogo.atribuirValor(9);
			jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			JOptionPane.showMessageDialog(null, "Agora o programa vai encerrar");
			System.exit(0);
		}
	}

	public class ComputarAcaoB10 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			jogo.atribuirValor(10);
			jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			JOptionPane.showMessageDialog(null, "Agora o programa vai encerrar");
			System.exit(0);
		}
	}

	public class ComputarAcaoB11 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			jogo.atribuirValor(11);
			jogo.iniciar();
			JOptionPane.showMessageDialog(null, "Computado com Sucesso, favor verificar resultado em arquivo .CSV");
			JOptionPane.showMessageDialog(null, "Agora o programa vai encerrar");
			System.exit(0);
		}
	}

}
