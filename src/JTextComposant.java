import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextComposant {
		final static Ecran mEcran = new Ecran(400, 400, "TextArea");
		final static JScrollPane mScrollPane = new JScrollPane();
		final static JTextArea mTextArea = new JTextArea("text", 300, 300);
		final static JCheckBox retourLigne = new JCheckBox();
		final static JCheckBox retourMot = new JCheckBox();
		final static JCheckBox gras = new JCheckBox();
		final static JCheckBox italique = new JCheckBox();
		final static JRadioButton changeBg = new JRadioButton();
		final static JRadioButton changeFg = new JRadioButton();
		final static JPanel panel1 = new JPanel();
		final static JPanel panel2 = new JPanel();

	public static void main(String[] args) {
		
		mScrollPane.add(mTextArea);
		
		retourMot.setText("Retour entre deux mots");
		retourLigne.setText("Retour à la ligne");
		
		panel1.setLayout(new BorderLayout());
		panel1.add(mScrollPane);
		
		panel2.setLayout(new GridLayout());
		panel2.add(retourLigne);
		panel2.add(retourMot);
		
		mEcran.GetPanel().add(panel1, BorderLayout.NORTH);
		mEcran.GetPanel().add(panel2, BorderLayout.SOUTH);
		
		if(retourLigne.isSelected())
			mTextArea.setLineWrap(true);
		else if(retourMot.isSelected())
			mTextArea.setWrapStyleWord(true);
		
		
		mEcran.SetVisible();
	}

	public void ChangePolice(){
		int att=0;
		
		if(gras.isSelected())
			att = att+Font.BOLD;
		else if(italique.isSelected())
			att = att+Font.ITALIC;
		
		Font police = new Font(mTextArea.getFont().getName(), att, mTextArea.getFont().getSize());
		mTextArea.setFont(police);
	}
	
}


