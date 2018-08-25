import java.awt.*;
import javax.swing.*;

public class PrimeiroFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField iconeTexto;
    private JPasswordField password;

    public PrimeiroFrame(){
        super("teste");
        setLayout(new FlowLayout());

        iconeTexto= new JTextField("Testes do Alfeu",20);
        Icon teste = new ImageIcon(getClass().getResource("ufsc.png"));
        iconeTexto.setIcon(teste);
        add(iconeTexto);

        textField1 = new JTextField("Testes do Alfeu",20);
        add(textField1);

        textField2 = new JTextField("Olá",20);
        add(textField2);

        textField3 = new JTextField("Mundo!",20);
        add(textField3);
        textField3.setEditable(false);

        password = new JPasswordField("Esse texto está escondido");
        add(password);
    }
    public static void main(String[] args) {
		PrimeiroFrame janela = new PrimeiroFrame();
		
		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		janela.setSize(200,200);
		janela.setVisible(true);
	}

}