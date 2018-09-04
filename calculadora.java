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

public class calculadora extends JFrame {
    private JTextField resultado;
    private JButton botao0;
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton botao_div;
    private JButton botao_mult;
    private JButton botao_menos;
    private JButton botao_mais;
    private JButton botao_igual;
    private JButton botao_ponto;
    private JPanel buttonjpannel;
    private FlowLayout layout;      //OBJETO LAYOUT
    private GridLayout gridlayout;
    private Container container;    //CONTÊINER PARA CONFIGURAR LAYOUT
    private int contadorCaracteres = 0;
    private int defineTamanhoCaracteres = 25;
    private List<Double> numero = new ArrayList<Double>();



    public calculadora(){
        super("Calc");
        layout = new FlowLayout();      //CRIA FLOWLAYOUT
        gridlayout = new GridLayout(2,4);
        container = getContentPane();   //OBTÊM CONTEINER PARA LAYOUT
        setLayout(gridlayout);  //CONFIGURA O LAYOUT DE FRAME

        resultado = new JTextField("           ",defineTamanhoCaracteres);
        add(resultado);
        
        buttonjpannel = new JPanel();
        buttonjpannel.setLayout(new GridLayout(4,4));

        botao7 = new JButton("7");    
        buttonjpannel.add(botao7);
        botao8 = new JButton("8");    
        buttonjpannel.add(botao8);
        botao9 = new JButton("9");    
        buttonjpannel.add(botao9);
        botao_div = new JButton("/");    
        buttonjpannel.add(botao_div);

        botao4 = new JButton("4");    
        buttonjpannel.add(botao4);
        botao5 = new JButton("5");    
        buttonjpannel.add(botao5);
        botao6 = new JButton("6");    
        buttonjpannel.add(botao6);
        botao_mult = new JButton("*");    
        buttonjpannel.add(botao_mult);

        botao1 = new JButton("1");    
        buttonjpannel.add(botao1);
        botao2 = new JButton("2");    
        buttonjpannel.add(botao2);
        botao3 = new JButton("3");    
        buttonjpannel.add(botao3);
        botao_menos = new JButton("-");    
        buttonjpannel.add(botao_menos);

        botao0 = new JButton("0");    
        buttonjpannel.add(botao0);
        botao_ponto = new JButton(".");    
        buttonjpannel.add(botao_ponto);
        botao_igual = new JButton("=");    
        buttonjpannel.add(botao_igual);
        botao_mais = new JButton("+");    
        buttonjpannel.add(botao_mais);

        add(buttonjpannel);

        
        
        botao0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"0");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });        
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"1");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });
        botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"2");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });        
        botao3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"3");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });
        botao4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"4");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });        
        botao5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"5");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });
        botao6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"6");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });        
        botao7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"7");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });
        botao8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"8");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });
        botao9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"9");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });
        botao_ponto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+".");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });
        botao_mais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"+");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });
        botao_menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"-");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });
        botao_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"*");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });
        botao_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resultado.setText(resultado.getText()+"/");
                contadorCaracteres++;
                if(contadorCaracteres>=defineTamanhoCaracteres){
                    resultado.setText(" ");
                    contadorCaracteres=0;    
                }
            }
        });



    }

    public static void main(String[] args) {
		calculadora janela = new calculadora();
		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		janela.setSize(200,200);
        janela.setVisible(true);
	}



}