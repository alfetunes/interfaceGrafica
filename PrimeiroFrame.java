import java.awt.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class PrimeiroFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField password;
    private FlowLayout layout;      //OBJETO LAYOUT
    private Container container;    //CONTÊINER PARA CONFIGURAR LAYOUT
    private JButton botaoDireito;   //BOTÃO PARA CONFIGURAR O ALINHAMENTO À DIREITA
    private JButton botaoEntra;   //BOTÃO PARA CONFIGURAR O ALINHAMENTO À DIREITA
    private JButton botaoEsquerdo;  //BOTÃO PARA CONFIGURAR O ALINHAMENTO À ESQUERDA
    private JButton botaoCentral;   //BOTÃO PARA CONFIGURAR O ALINHAMENTO CENTRALIZADO
    private static int contador = 0;
    public PrimeiroFrame(){
        super("teste");
        layout = new FlowLayout();      //CRIA FLOWLAYOUT
        container = getContentPane();   //OBTÊM CONTEINER PARA LAYOUT
        
        setLayout(layout);  //CONFIGURA O LAYOUT DE FRAME
        layout.setAlignment(BoxLayout.LINE_AXIS);
        layout.layoutContainer(container);  
        container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
        // Define o ícone
        Icon icon= new ImageIcon("ufsc.png"); // Cria um label com um texto e um ícone; o ícone aparecee a esquerda do texto
        JLabel label = new JLabel("", icon, JLabel.LEFT); // Cria o label com um ícone label = new JLabel(icon);
        add(label);

        JLabel label2 = new JLabel("Digite o texto a ser copiado no campo abaixo depois pressione enter"); 
        add(label2);
        textField1 = new JTextField("Digite nome",10);
        add(textField1);
        textField1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                textField1.setText("");
            }
        });

        botaoEntra = new JButton("Enter");    
        add(botaoEntra);

        JLabel label3 = new JLabel("Texto copiado abaixo"); 
        add(label3);
        textField2 = new JTextField(" ",10);
        add(textField2);

        botaoEntra.addActionListener(new ActionListener() {
         
            @Override
             public void actionPerformed(ActionEvent e) {
             String texto = textField1.getText();
             textField2.setText(texto);
            }
        }
        );        

      //  password = new JPasswordField("password");
      //  add(password);

        JRadioButton option1 = new JRadioButton("Normal");
        JRadioButton option2 = new JRadioButton("Italico");
        JRadioButton option3 = new JRadioButton("Negrito");
 
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        add(option1);
        add(option2);
        add(option3);
        JLabel label4 = new JLabel("Opção selecionada:"); 
        add(label4);
        option1.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent event) {
                textField3.setText("Normal");
                Font font3 = new Font("Times New Roman", Font.TRUETYPE_FONT,12);  
                label4.setFont(font3);  
                label4.setText("Normal");
         
            }
        });
        option2.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent event) {
                textField3.setText("Italico");
                Font font2 = new Font("Times New Roman", Font.ITALIC,12);  
                label4.setFont(font2);  
                label4.setText("Italico");
         
            }
        });
        option3.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent event) {
                textField3.setText("Negrito");
                Font font1 = new Font("Times New Roman", Font.BOLD,12);  
                label4.setFont(font1);  
                label4.setText("Negrito");
            }
        });

        textField3 = new JTextField("Opção selecionada ",10);
        add(textField3);

        //CONFIGURA LEFTBUTTON E REGISTRA LISTENER
        botaoEsquerdo = new JButton("Esquerda");    //CRIA O BOTÃO LEFT
        add(botaoEsquerdo);     //ADICIONA O BOTÃO ESQUERDO AO FRAME

        Icon iconeEsquerda = new ImageIcon(getClass().getResource("esquerda.jpg"));
        botaoEsquerdo.setIcon(iconeEsquerda);

        botaoEsquerdo.addActionListener(new ActionListener() {
         
                @Override
                //PROCESSA O EVENTO BOTÃO ESQUERDO
                 public void actionPerformed(ActionEvent e) {
                 layout.setAlignment(FlowLayout.LEFT);
                 
                 //REALINHA OS COMPONENTES ANEXADOS
                  layout.layoutContainer(container);
                }
            }
        );
     

       //CONFIGURA O BOTÃO CENTRAL E REGISTRA O LISTENER
       botaoCentral = new JButton("Centro");   //CRIA P BOTÃO CENTRAL
       add(botaoCentral);  //ADICIONO O BOTÃO AO FRAME
        
       botaoCentral.addActionListener(new ActionListener() {
            
               @Override
               public void actionPerformed(ActionEvent e) {
                   layout.setAlignment(FlowLayout.CENTER);
                    
                   //REALINHA OS COMPONENTES ANEXADOS
                   layout.layoutContainer(container);                  
               }
           }
       );

        botaoDireito = new JButton("Direita");
        add(botaoDireito);  //ADICIONA BOTÃO
        Icon iconeDireita = new ImageIcon(getClass().getResource("direita.gif"));
        botaoDireito.setIcon(iconeDireita);


         
        botaoDireito.addActionListener(new ActionListener() {
             
                @Override
                public void actionPerformed(ActionEvent e) {
                    layout.setAlignment(FlowLayout.RIGHT);
                     
                    layout.layoutContainer(container);                  
                }
            }
        );

    }
    public static void main(String[] args) {
		PrimeiroFrame janela = new PrimeiroFrame();
		
        janela.getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                //adiciona dinamicamente no clique
                JLabel textField = new JLabel("Clicou "+ ++contador); 
                janela.add(textField);
                textField.setBounds(event.getX(), event.getY(), 200, 30);
                janela.getContentPane().add(textField);
            }
        });

		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		janela.setSize(500,800);
        janela.setVisible(true);
        

	}

}