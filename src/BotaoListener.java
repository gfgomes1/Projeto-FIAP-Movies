import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

public class BotaoListener implements ActionListener, MouseListener {

	private MeuTextField tituloTextField;
	private MeuTextArea sinopseTextArea;
	private MeuRadioGroup group;
	private String[] genero;
	

	public BotaoListener(MeuTextField tituloTextField, MeuTextArea sinopseTextArea, MeuRadioGroup group, String[] genero) {
		this.tituloTextField = tituloTextField;	
		this.sinopseTextArea = sinopseTextArea;
		this.group = group;
		this.genero = genero;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog("-" + tituloTextField.getText(), "-" + sinopseTextArea.getText(), "-" + group.getText(), "-" + genero.getText); 		
	}

	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse in");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse out");
	}

	public String[] getGenero() {
		return genero;
	}

	public void setGenero(String[] genero) {
		this.genero = genero;
	}
	
}
