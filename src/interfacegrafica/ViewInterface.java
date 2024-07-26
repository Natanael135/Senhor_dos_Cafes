package interfacegrafica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import bancodedados.PersonagemDAO;
import bancodedados.ComputarBancoDeDados;

@SuppressWarnings("serial")
public class ViewInterface extends JFrame {

	private JTextField fieldTipoP1;
	private JTextField fieldNomeP1;
	private JTextField fieldFatkP1;
	private JTextField fieldFdefP1;
	private JTextField fieldTipoP2;
	private JTextField fieldNomeP2;
	private JTextField fieldFatkP2;
	private JTextField fieldFdefP2;
	private JTextField fieldSomaAtkP1;
	private JTextField fieldSomaDefP1;
	private JTextField fieldSomaAtkP2;
	private JTextField fieldSomaDefP2;
	private int tamanhoCaixaTexto = 15;

	// fonte
	Font fonte = new Font("Courier New", Font.BOLD, 15);
	Font fonteTitulo = new Font("Courier New", Font.BOLD, 30);

	public void criarPaineis() {

		setLayout(new BorderLayout());
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new FlowLayout());

		// Titulo
		JLabel labelTitulo = new JLabel("Cadastro de informacoes do jogo");
		painelPrincipal.add(labelTitulo);
		labelTitulo.setFont(fonteTitulo);
		add(painelPrincipal, BorderLayout.NORTH);

		// P1
		JPanel panelTipoP1 = new JPanel();
		JLabel labelTipoP1 = new JLabel("Tipo do personagem 1");
		fieldTipoP1 = new JTextField(tamanhoCaixaTexto);
		labelTipoP1.setFont(fonte);

		JPanel panelNomeP1 = new JPanel();
		JLabel labelNomeP1 = new JLabel("Nome do personagem 1");
		fieldNomeP1 = new JTextField(tamanhoCaixaTexto);
		labelNomeP1.setFont(fonte);

		JPanel panelFatkP1 = new JPanel();
		JLabel labelFatkP1 = new JLabel("For�a de ataque do personagem 1");
		fieldFatkP1 = new JTextField(tamanhoCaixaTexto);
		labelFatkP1.setFont(fonte);

		JPanel panelFdefP1 = new JPanel();
		JLabel labelFdefP1 = new JLabel("For�a de defesa do personagem 1");
		fieldFdefP1 = new JTextField(tamanhoCaixaTexto);
		labelFdefP1.setFont(fonte);

		// P2
		JPanel panelTipoP2 = new JPanel();
		JLabel labelTipoP2 = new JLabel("Tipo do personagem 2");
		fieldTipoP2 = new JTextField(tamanhoCaixaTexto);
		labelTipoP2.setFont(fonte);

		JPanel panelNomeP2 = new JPanel();
		JLabel labelNomeP2 = new JLabel("Nome do personagem 2");
		fieldNomeP2 = new JTextField(tamanhoCaixaTexto);
		labelNomeP2.setFont(fonte);

		JPanel panelFatkP2 = new JPanel();
		JLabel labelFatkP2 = new JLabel("For�a de ataque do personagem 2");
		fieldFatkP2 = new JTextField(tamanhoCaixaTexto);
		labelFatkP2.setFont(fonte);

		JPanel panelFdefP2 = new JPanel();
		JLabel labelFdefP2 = new JLabel("For�a de defesa do personagem 2");
		fieldFdefP2 = new JTextField(tamanhoCaixaTexto);
		labelFdefP2.setFont(fonte);

		// Soma Total
		JPanel panelSomaAtkP1 = new JPanel();
		JLabel labelSomaAtkP1 = new JLabel("Somat�rio do ataque personagem 1");
		fieldSomaAtkP1 = new JTextField(tamanhoCaixaTexto);
		labelSomaAtkP1.setFont(fonte);

		JPanel panelSomaDefP1 = new JPanel();
		JLabel labelSomaDefP1 = new JLabel("Somat�rio do defesa personagem 1");
		fieldSomaDefP1 = new JTextField(tamanhoCaixaTexto);
		labelSomaDefP1.setFont(fonte);

		JPanel panelSomaAtkP2 = new JPanel();
		JLabel labelSomaAtkP2 = new JLabel("Somat�rio do ataque personagem 2");
		fieldSomaAtkP2 = new JTextField(tamanhoCaixaTexto);
		labelSomaAtkP2.setFont(fonte);

		JPanel panelSomaDefP2 = new JPanel();
		JLabel labelSomaDefP2 = new JLabel("Somat�rio do defesa personagem 2");
		fieldSomaDefP2 = new JTextField(tamanhoCaixaTexto);
		labelSomaDefP2.setFont(fonte);

		// P1
		panelTipoP1.add(labelTipoP1);
		panelTipoP1.add(fieldTipoP1);
		panelNomeP1.add(labelNomeP1);
		panelNomeP1.add(fieldNomeP1);
		panelFatkP1.add(labelFatkP1);
		panelFatkP1.add(fieldFatkP1);
		panelFdefP1.add(labelFdefP1);
		panelFdefP1.add(fieldFdefP1);

		// p2
		panelTipoP2.add(labelTipoP2);
		panelTipoP2.add(fieldTipoP2);
		panelNomeP2.add(labelNomeP2);
		panelNomeP2.add(fieldNomeP2);
		panelFatkP2.add(labelFatkP2);
		panelFatkP2.add(fieldFatkP2);
		panelFdefP2.add(labelFdefP2);
		panelFdefP2.add(fieldFdefP2);

		// soma total
		panelSomaAtkP1.add(labelSomaAtkP1);
		panelSomaAtkP1.add(fieldSomaAtkP1);
		panelSomaDefP1.add(labelSomaDefP1);
		panelSomaDefP1.add(fieldSomaDefP1);

		panelSomaAtkP2.add(labelSomaAtkP2);
		panelSomaAtkP2.add(fieldSomaAtkP2);
		panelSomaDefP2.add(labelSomaDefP2);
		panelSomaDefP2.add(fieldSomaDefP2);

		// p1
		add(panelTipoP1, BorderLayout.WEST);
		add(panelNomeP1, BorderLayout.EAST);
		add(panelFatkP1, BorderLayout.WEST);
		add(panelFdefP1, BorderLayout.EAST);

		// p2
		add(panelTipoP2, BorderLayout.WEST);
		add(panelNomeP2, BorderLayout.EAST);
		add(panelFatkP2, BorderLayout.WEST);
		add(panelFdefP2, BorderLayout.EAST);

		// soma total
		add(panelSomaAtkP1, BorderLayout.WEST);
		add(panelSomaDefP1, BorderLayout.EAST);
		add(panelSomaAtkP2, BorderLayout.WEST);
		add(panelSomaDefP2, BorderLayout.EAST);

		JPanel panelDadosPersonagens = new JPanel();
		panelDadosPersonagens.setLayout(new GridLayout(14, 2));
		panelDadosPersonagens.add(panelTipoP1);
		panelDadosPersonagens.add(panelNomeP1);
		panelDadosPersonagens.add(panelFatkP1);
		panelDadosPersonagens.add(panelFdefP1);

		panelDadosPersonagens.add(panelTipoP2);
		panelDadosPersonagens.add(panelNomeP2);
		panelDadosPersonagens.add(panelFatkP2);
		panelDadosPersonagens.add(panelFdefP2);

		panelDadosPersonagens.add(panelSomaAtkP1);
		panelDadosPersonagens.add(panelSomaDefP1);
		panelDadosPersonagens.add(panelSomaAtkP2);
		panelDadosPersonagens.add(panelSomaDefP2);

		add(panelDadosPersonagens, BorderLayout.CENTER);

		JPanel panelBotao = new JPanel();
		ComputarDados computarAcoes = new ComputarDados();

		JButton botaoComputar = new JButton("Computar");
		botaoComputar.addActionListener(computarAcoes);
		panelBotao.setLayout(new FlowLayout());
		panelBotao.setLayout(new FlowLayout());

		panelBotao.add(botaoComputar);
		botaoComputar.setFont(fonteTitulo);
		add(panelBotao, BorderLayout.SOUTH);

	}

	public class ComputarDados implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			PersonagemDAO dadosPerso = new PersonagemDAO();

			dadosPerso.setTipoP1(fieldTipoP1.getText());
			dadosPerso.setNomeP1(fieldNomeP1.getText());
			dadosPerso.setFatkP1(fieldFatkP1.getText());
			dadosPerso.setFdefP1(fieldFdefP1.getText());

			dadosPerso.setTipoP2(fieldTipoP2.getText());
			dadosPerso.setNomeP2(fieldNomeP2.getText());
			dadosPerso.setFatkP2(fieldFatkP2.getText());
			dadosPerso.setFdefP2(fieldFdefP2.getText());

			dadosPerso.setSomaAtkP1(fieldSomaAtkP1.getText());
			dadosPerso.setSomaDefP1(fieldSomaDefP1.getText());
			dadosPerso.setSomaAtkP2(fieldSomaAtkP2.getText());
			dadosPerso.setSomaDefP2(fieldSomaDefP2.getText());

			// computar no BD
			ComputarBancoDeDados PersonDAO = new ComputarBancoDeDados();
			PersonDAO.inserirComInterface(dadosPerso);

			JOptionPane.showMessageDialog(null, "Computado com Sucesso");
			JOptionPane.showMessageDialog(null, "O Vencedor foi: " + PersonDAO.getNomeVencedor()
					+ " Com a pontua�ao de " + PersonDAO.getPontosVencedor() + " Pontos");
			JOptionPane.showMessageDialog(null, "O Perdedor foi: " + PersonDAO.getNomePerdedor()
					+ " Com a pontua�ao de " + PersonDAO.getPontosPerdedor() + " Pontos");

			// resetar campos de texto apos salvar
			fieldTipoP1.setText("");
			fieldNomeP1.setText("");
			fieldFatkP1.setText("");
			fieldFdefP1.setText("");

			fieldTipoP2.setText("");
			fieldNomeP2.setText("");
			fieldFatkP2.setText("");
			fieldFdefP2.setText("");

			fieldSomaAtkP1.setText("");
			fieldSomaDefP1.setText("");
			fieldSomaAtkP2.setText("");
			fieldSomaDefP2.setText("");

		}

	}

}
