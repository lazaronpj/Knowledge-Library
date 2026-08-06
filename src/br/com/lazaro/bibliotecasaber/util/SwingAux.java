package br.com.lazaro.bibliotecasaber.util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingAux {

	final private Color corCampo = new Color(1, 1 , 1);
	final private Color corBotao = new Color(1, 1, 1);
//	final private Color corBotao = new Color(1, 1, 1);
//	final private Color corBotao = new Color(1, 1, 1);
//	final private Color corBotao = new Color(1, 1, 1);
//	final private Color corBotao = new Color(1, 1, 1);
	
	
	public JPanel criarPainelLinha(String texto, javax.swing.JComponent campo) {
		JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 5));
		JLabel linha = new JLabel(texto);
		linha.setFont(new Font("Arial",Font.BOLD,14));
		campo.setFont(new Font("Arial",Font.PLAIN,14));
		campo.setPreferredSize(new Dimension(250,25));
		painel.add(linha);
		painel.add(campo);
		return painel;
	}
	
	public JLabel criarRotulo(String texto, int tamanho) {
		JLabel rotulo = new JLabel(texto, tamanho);
		rotulo.setFont(new Font("Arial", Font.PLAIN,14));
		return rotulo;		
	}
	
	public JButton criarBotao(String texto, int tamanho) {
		JButton botao = new JButton(texto);
		botao.setBackground(corBotao);		
		botao.setPreferredSize(new Dimension(tamanho, 30));
		return botao;		
	}
	
	
	
	
	private void alerta(String msg) {
		JOptionPane.showMessageDialog(null, "<html>⚠️ <b><font color='orange'>Aviso:</font></b> " + msg + "</html>", "Aviso",
				JOptionPane.WARNING_MESSAGE);
	}

	/** Exibe mensagem de sucesso. */
	private void alertaSucesso(String msg) {
		JOptionPane.showMessageDialog(null, "<html>✅ <b><font color='green'>Sucesso:</font></b> " + msg + "</html>", "Sucesso",
				JOptionPane.INFORMATION_MESSAGE);
	}

	/** Exibe mensagem de erro. */
	private void alertaErro(String msg) {
		JOptionPane.showMessageDialog(null, "<html>❌ <b><font color='red'>Erro:</font></b> " + msg + "</html>", "Erro",
				JOptionPane.ERROR_MESSAGE);
	}
	
	public static final JLabel criarCopyright() {
		String texto = "<html><div style='text-align:center; color:#808080; font-family: Arial, sans-serif;'>© 2026 Lazaro Coder <span style='color:#C0C0C0;'>v1.0</span></div></html>";
		return new JLabel(texto);
	}
}
