import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class MeuTextArea extends JTextArea{
	private static final long serialVersionUID = 1L;
	
//	private int linhas = 2;
//	private int colunas = 30;
	
	public MeuTextArea() {
		super();
		init();
	}

	private void init() {
		this.setPreferredSize(new Dimension(150,30));
		//this.setBorder(BordaFactory.criar());
		
//	private void init() {
//		this.setRows(linhas);
//		this.setColumns(colunas);
//		this.setBorder(BordaFactory.criar());
//		
//	}
		
	}
}
