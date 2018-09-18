import java.awt.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import java.util.ArrayList;
import java.util.List;

public class ColorSelect extends JFrame {
    private JCheckBox background, foreground;
    private String[] opcoes = {"Vermelho", "Verde", "Preto", "Branco", "Azul", "Amarelo"};
    private JPanel buttonjpannel;
    private FlowLayout layout;      //OBJETO LAYOUT
    private GridLayout gridlayout;
    private Container container;    //CONTÊINER PARA CONFIGURAR LAYOUT
    private JButton ok;
    private JButton cancel;
 	private JButton changeColorJButton;
	private Color color = Color.LIGHT_GRAY;

    public ColorSelect(){
        super("Color Selector");
        layout = new FlowLayout();      //CRIA FLOWLAYOUT
        gridlayout = new GridLayout(3,1);
        container = getContentPane();   //OBTÊM CONTEINER PARA LAYOUT
        setLayout(gridlayout);  //CONFIGURA O LAYOUT DE FRAME

        buttonjpannel = new JPanel();
        buttonjpannel.setLayout(new GridLayout(2,1));

		changeColorJButton = new JButton("Mudar cor");
		changeColorJButton.addActionListener(
			new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				color = JColorChooser.showDialog("Escolhe uma cor", color); 
				if (color == null)
					color = Color.LIGHT_GRAY;

				getContentPane().setBackground(color); 
			} 
			} 
		); 

        background = new JCheckBox("Background");
        foreground = new JCheckBox("Foreground");
        buttonjpannel.add(background);
        buttonjpannel.add(foreground);

        ok = new JButton("OK");    
        buttonjpannel.add(ok);
        cancel = new JButton("Cancel");    
        buttonjpannel.add(cancel);
   
        add(buttonjpannel);

    }

    public static void main(String[] args) {
        ColorSelect janela = new ColorSelect();
		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		janela.setSize(300,150);
        janela.setVisible(true);
       // janela.getContentPane().setBackground(Color.black);
	}
}