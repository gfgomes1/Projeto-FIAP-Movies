import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

public class MeuLabel extends JLabel{

	private static final long serialVersionUID = 1L;
	
	private int size = 19;
	private Color cor = new Color(240, 0, 150);
	//private Dimension imageIcon = new Dimension(300, 155);
	
//	public MeuLabel(String texto) {
//		super(texto);
//		init();
//	}
	
	public MeuLabel(String texto, Color cor) {
		super(texto);
		this.cor = cor;
		init();
	}	
		

	public MeuLabel(ImageIcon imageIcon) {
		super(imageIcon);
		init();
	}

	private void init() {
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setForeground(cor);
		//this.setPreferredSize(new Dimension(300, 155));
		this.setFont(new Font(null, Font.PLAIN, size));
	
	}
}
