package caixaeletronico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Caixa extends JFrame implements ActionListener {

	JButton buttonD = new JButton("1 - Depósito");
	JButton buttonSaque = new JButton("2 - Saque");
	JButton buttonTrans = new JButton("3 - Trasferência");
	JButton buttonCons = new JButton("4 - Consulta de Saldo");
	JButton buttonPix = new JButton("5 - Pix");
	JButton buttonInvestimento = new JButton("6 - Investimento");
	JButton home = new JButton("Voltar");

	public void actionPerformed(ActionEvent e) {

		// Depósito
		if (e.getSource() == buttonD) {
			JLabel lb1 = new JLabel("Deposite um valor:");// Label
			JTextField tf = new JTextField();// Campo de texto
			JButton bdeposito = new JButton("Depositar"); // Botão depositar

			// Adicionando os componentes na tela
			add(tf);
			add(lb1);
			add(bdeposito);
			add(home);

			buttonD.setVisible(false);// Tira a visibilidade do botão de depósito
			buttonSaque.setVisible(false);
			buttonTrans.setVisible(false);
			buttonCons.setVisible(false);
			buttonPix.setVisible(false);
			buttonInvestimento.setVisible(false);
			home.setVisible(true);// Tira a visibilidade do botão home

			// Estilizando o botão
			tf.setBounds(255, 150, 200, 30);
			tf.setVisible(true);

			// Estilizando a label
			lb1.setBounds(255, 50, 200, 50);
			lb1.setVisible(true);
			lb1.setHorizontalAlignment(SwingConstants.CENTER);

			// Estilizando o botão de depósito
			bdeposito.setBounds(255, 220, 200, 30);
			bdeposito.setVisible(true);

			// Lógica para os depósitos
			bdeposito.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String value = tf.getText();
					int a = Integer.parseInt(value);

					if (a > 0) {
						JOptionPane.showMessageDialog(null, "Depósito efetuado no valor de R$" + a);
					} else if (a == 0) {
						JOptionPane.showMessageDialog(null, "Deposite um valor");
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
				}
			});

			// Botão voltar
			home.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					buttonD.setVisible(true);
					buttonSaque.setVisible(true);
					buttonTrans.setVisible(true);
					buttonCons.setVisible(true);
					buttonPix.setVisible(true);
					buttonInvestimento.setVisible(true);
					lb1.setVisible(false);
					bdeposito.setVisible(false);
					tf.setVisible(false);
					home.setVisible(false);

				}
			});
		} // Fim do Depósito

		// Saque
		if (e.getSource() == buttonSaque) {
			JLabel lb2 = new JLabel("Seu valor em conta é de R$700,00");
			JTextField saque = new JTextField();
			JButton btnSaque = new JButton("Sacar"); // Botão sacar
			add(lb2);
			add(saque);
			add(btnSaque);
			add(home);

			buttonD.setVisible(false);// Tira a visibilidade do botão de depósito
			buttonSaque.setVisible(false);
			buttonTrans.setVisible(false);
			buttonCons.setVisible(false);
			buttonPix.setVisible(false);
			buttonInvestimento.setVisible(false);
			home.setVisible(true);// Tira a visibilidade do botão home

			// Estilizando a label
			lb2.setBounds(255, 100, 200, 50);
			lb2.setVisible(true);
			lb2.setHorizontalAlignment(SwingConstants.CENTER);

			// Estilizando Text Field
			saque.setBounds(255, 155, 200, 30);
			saque.setVisible(true);

			// Estilizando Button
			btnSaque.setBounds(255, 225, 200, 30);
			btnSaque.setVisible(true);

			home.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {// Adiciona uma funcionalidade
					// TODO Auto-generated method stub
					buttonD.setVisible(true);
					buttonSaque.setVisible(true);
					buttonTrans.setVisible(true);
					buttonCons.setVisible(true);
					buttonPix.setVisible(true);
					buttonInvestimento.setVisible(true);
					lb2.setVisible(false);
					saque.setVisible(false);
					btnSaque.setVisible(false);
					home.setVisible(false);

				}
			});

			btnSaque.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String value = saque.getText();
					int a = Integer.parseInt(value);

					if (a > 0) {
						JOptionPane.showMessageDialog(null, "Saque efetuado!");
					} else if (a == 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor");
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
				}

			});

		} // Fim do Saque

		// Transferência

		if (e.getSource() == buttonTrans) {
			JLabel lb3 = new JLabel("Informe a conta destino:");
			JTextField textT = new JTextField();

			JLabel lb4 = new JLabel("Informe o valor a ser transferido:");
			JTextField textT2 = new JTextField();

			JButton btnT = new JButton("Transferir");

			add(lb3);
			add(lb4);
			add(textT);
			add(textT2);
			add(btnT);
			add(home);

			buttonD.setVisible(false);// Tira a visibilidade do botão de depósito
			buttonSaque.setVisible(false);
			buttonTrans.setVisible(false);
			buttonCons.setVisible(false);
			buttonPix.setVisible(false);
			buttonInvestimento.setVisible(false);
			home.setVisible(true);// Tira a visibilidade do botão home

			lb3.setBounds(255, 50, 200, 50);
			lb3.setVisible(true);
			lb3.setHorizontalAlignment(SwingConstants.CENTER);

			textT.setBounds(255, 100, 200, 30);
			textT.setVisible(true);

			// Estilizando a label
			textT2.setBounds(255, 165, 200, 30);
			textT2.setVisible(true);

			lb4.setBounds(255, 125, 200, 50);
			lb4.setVisible(true);
			lb4.setHorizontalAlignment(SwingConstants.CENTER);

			btnT.setBounds(255, 220, 200, 30);
			btnT.setVisible(true);

			home.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					buttonD.setVisible(true);
					buttonSaque.setVisible(true);
					buttonTrans.setVisible(true);
					buttonCons.setVisible(true);
					buttonPix.setVisible(true);
					buttonInvestimento.setVisible(true);
					lb3.setVisible(false);
					lb4.setVisible(false);
					textT.setVisible(false);
					textT2.setVisible(false);
					btnT.setVisible(false);
					home.setVisible(false);

				}
			});

			btnT.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String value = textT2.getText();
					int a = Integer.parseInt(value);

					if (a > 0) {
						JOptionPane.showMessageDialog(null, "Transferência efetuada!");
					} else if (a == 0) {
						JOptionPane.showMessageDialog(null, "Deposite um valor");
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
				}

			});

		} // Fim da Trasferencia

		// Consulta de Saldo

		if (e.getSource() == buttonCons) {
			JLabel saldo = new JLabel("Meu Saldo:");
			JLabel valor = new JLabel("R$500,00");

			add(valor);
			add(saldo);

			saldo.setBounds(255, 130, 200, 30);
			saldo.setVisible(true);
			saldo.setHorizontalAlignment(SwingConstants.CENTER);
			valor.setBounds(255, 165, 200, 30);
			valor.setVisible(true);
			valor.setHorizontalAlignment(SwingConstants.CENTER);

			buttonD.setVisible(false);// Tira a visibilidade do botão de depósito
			buttonSaque.setVisible(false);
			buttonTrans.setVisible(false);
			buttonCons.setVisible(false);
			buttonPix.setVisible(false);
			buttonInvestimento.setVisible(false);
			home.setVisible(true);// Tira a visibilidade do botão home

			home.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					buttonD.setVisible(true);
					buttonSaque.setVisible(true);
					buttonTrans.setVisible(true);
					buttonCons.setVisible(true);
					buttonPix.setVisible(true);
					buttonInvestimento.setVisible(true);
					saldo.setVisible(false);
					valor.setVisible(false);
					home.setVisible(false);

				}
			});

		} // Fim consulta de saldo

		// Pix
		if (e.getSource() == buttonPix) {
			JLabel pixC = new JLabel("Informe a chave pix");
			JTextField pixT = new JTextField();

			JLabel valorP = new JLabel("Informe o valor a ser transferido:");
			JTextField valorT = new JTextField();

			JButton btnPix = new JButton("Faça o pix");

			add(pixC);
			add(pixT);
			add(valorP);
			add(valorT);
			add(btnPix);
			add(home);

			buttonD.setVisible(false);// Tira a visibilidade do botão de depósito
			buttonSaque.setVisible(false);
			buttonTrans.setVisible(false);
			buttonCons.setVisible(false);
			buttonPix.setVisible(false);
			buttonInvestimento.setVisible(false);
			home.setVisible(true);// Tira a visibilidade do botão home

			pixC.setBounds(255, 50, 200, 50);
			pixC.setVisible(true);
			pixC.setHorizontalAlignment(SwingConstants.CENTER);

			pixT.setBounds(255, 100, 200, 30);
			pixT.setVisible(true);

			// Estilizando a label
			valorT.setBounds(255, 165, 200, 30);
			valorT.setVisible(true);

			valorP.setBounds(255, 125, 200, 50);
			valorP.setVisible(true);
			valorP.setHorizontalAlignment(SwingConstants.CENTER);

			btnPix.setBounds(255, 220, 200, 30);
			btnPix.setVisible(true);

			home.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					buttonD.setVisible(true);
					buttonSaque.setVisible(true);
					buttonTrans.setVisible(true);
					buttonCons.setVisible(true);
					buttonPix.setVisible(true);
					buttonInvestimento.setVisible(true);
					pixC.setVisible(false);
					pixT.setVisible(false);
					valorP.setVisible(false);
					valorT.setVisible(false);
					btnPix.setVisible(false);
					home.setVisible(false);

				}
			});

			btnPix.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String value = valorT.getText();
					int a = Integer.parseInt(value);

					if (a > 0) {
						JOptionPane.showMessageDialog(null, "Pix efetuado!");
					} else if (a == 0) {
						JOptionPane.showMessageDialog(null, "Insira um valor");
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
				}

			});
		} // fim Pix

		// Investimento
		if (e.getSource() == buttonInvestimento) {
			JLabel investimento = new JLabel("Meus Investimentos:");
			JLabel valor0 = new JLabel("Selic: R$ 500,00");
			JLabel valor1 = new JLabel("CDB: R$ 900,00");
			JLabel valor2 = new JLabel("CDI: R$200,00");

			add(valor0);
			add(valor1);
			add(valor2);
			add(investimento);

			investimento.setBounds(255, 100, 200, 30);
			investimento.setVisible(true);
			investimento.setHorizontalAlignment(SwingConstants.CENTER);
			valor0.setBounds(255, 135, 200, 30);
			valor0.setVisible(true);
			valor0.setHorizontalAlignment(SwingConstants.CENTER);
			valor1.setBounds(255, 165, 200, 30);
			valor1.setVisible(true);
			valor1.setHorizontalAlignment(SwingConstants.CENTER);
			valor2.setBounds(255, 200, 200, 30);
			valor2.setVisible(true);
			valor2.setHorizontalAlignment(SwingConstants.CENTER);

			buttonD.setVisible(false);// Tira a visibilidade do botão de depósito
			buttonSaque.setVisible(false);
			buttonTrans.setVisible(false);
			buttonCons.setVisible(false);
			buttonPix.setVisible(false);
			buttonInvestimento.setVisible(false);
			home.setVisible(true);// Tira a visibilidade do botão home

			home.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					buttonD.setVisible(true);
					buttonSaque.setVisible(true);
					buttonTrans.setVisible(true);
					buttonCons.setVisible(true);
					buttonPix.setVisible(true);
					buttonInvestimento.setVisible(true);
					investimento.setVisible(false);
					valor0.setVisible(false);
					valor1.setVisible(false);
					valor2.setVisible(false);
					home.setVisible(false);

				}
			});

		} // Fim Investimento

	}// Fim da classe

	public Caixa() {
		// Criando o layout
		setLayout(null);
		setSize(700, 400);
		setVisible(true);

		// Adicionando os botões
		add(buttonD);
		add(buttonSaque);
		add(buttonTrans);
		add(buttonCons);
		add(buttonPix);
		add(buttonInvestimento);
		add(home);

		// Posicionamento e tamanho dos botões
		buttonD.setBounds(80, 75, 160, 70);
		buttonSaque.setBounds(255, 75, 160, 70);
		buttonTrans.setBounds(425, 75, 160, 70);
		buttonCons.setBounds(80, 175, 160, 70);
		buttonPix.setBounds(255, 175, 160, 70);
		buttonInvestimento.setBounds(425, 175, 160, 70);

		buttonD.setVisible(true);
		buttonSaque.setVisible(true);
		buttonTrans.setVisible(true);
		buttonCons.setVisible(true);
		buttonPix.setVisible(true);
		buttonInvestimento.setVisible(true);

		buttonD.addActionListener(this);// Esse botão tem a funcionalidade
		buttonSaque.addActionListener(this);// Esse botão tem a funcionalidade
		buttonTrans.addActionListener(this);// Esse botão tem a funcionalidade
		buttonCons.addActionListener(this);// Esse botão tem a funcionalidade
		buttonPix.addActionListener(this);// Esse botão tem a funcionalidade
		buttonInvestimento.addActionListener(this);// Esse botão tem a funcionalidade

		home.setBounds(255, 260, 200, 30);
		home.setVisible(false);
		home.addActionListener(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Caixa();
	}

}
