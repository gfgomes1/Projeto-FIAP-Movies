import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FIAPMovies {


	public static void main (String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar aparencia");
		}
		JFrame frame = new JFrame();
		
		JPanel janela = new JPanel ();
		janela.setLayout(new FlowLayout());
		
		
		janela.add(new JLabel(new ImageIcon("/src/Vikings2.jpg")));
		MeuTextField tituloTextField = new MeuTextField();
		janela.add(new MeuLabel("Titulo", Color.BLACK));
		janela.add(tituloTextField);
		MeuTextArea sinopseTextArea = new MeuTextArea();
		janela.add(new MeuLabel("Sinopse", Color.BLACK));
		janela.add(sinopseTextArea);
		//janela.add(new MeuTextArea());
		
		janela.add(new JCheckBox("Assistido"));
		
		List<String> listaDeOpcoes = List.of("Netflix", "Prime Video", "Pirate Bay");
		MeuRadioGroup group = new MeuRadioGroup (listaDeOpcoes);
		janela.add(group);	
				
		String[] genero = {"Ação", "Aventura", "Comédia", "Documentário", "Drama", "Ficção científica", "Romance", "Terror", "Suspense", "Seriado"};
		janela.add(new JComboBox<String>(genero));
		
		janela.add(new StarRater(5));
		
		JButton botao = new JButton("Salvar");
		botao.addActionListener(new BotaoListener(tituloTextField, sinopseTextArea, group, genero));
		//botao.addMouseListener(new BotaoListener(tituloTextField));
		//JPanel painelBotao = new JPanel(new FlowLayout());
		//botao.setLocation(400,420);
		janela.add(botao);
		
		
		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", janela);
		abas.add("Lista", new JPanel());		
		frame.add(abas);		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 450);
		frame.setVisible(true);
	}
	
}

