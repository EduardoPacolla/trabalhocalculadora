/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocalculadora;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Notebook
 */
public class Tela extends JFrame implements ActionListener, WindowListener {
    protected Dimension dframe, dlabel, dtextfield, dbutton,dbutton0,dbutton1, dtextarea; 
    protected Button botao0, botao1,botao2,botao3,botao4,botao5,botao6,botao7,botao8,botao9, botaoce, botaoc,
                       menos, soma, vezes, dividir, igual;
    protected TextField txtmsg, txtresultado;
    private Calculadora calculadora;
    double valor1, valor2;
    String sinal;
    
    public Tela(){
      calculadora = new Calculadora();
      dframe = new Dimension(300,200);
      dlabel = new Dimension(40,20);
      dtextfield = new Dimension(225,20);
      dbutton = new Dimension(25,20);
      dbutton0 = new Dimension(125,20);
      dbutton1 = new Dimension(25,45);
      dtextarea = new Dimension(50,25);
      this.setTitle("Calculadora Eduardo Pacolla");
      this.setResizable(false);
      this.setSize(dframe);
      this.setLayout(null);
      
      txtmsg = new TextField(null);
      txtmsg.setSize(dtextfield);
      txtmsg.setLocation(25, 25);
      this.add(txtmsg);
      
      igual = new Button("=");
      igual.setSize(dbutton1);
      igual.setLocation(175, 100);      
      igual.addActionListener(this);
      this.add(igual);  
      
      botao0 = new Button("0");
      botao0.setSize(dbutton0);
      botao0.setLocation(25, 125);      
      botao0.addActionListener(this);
      this.add(botao0);
      
      dividir= new Button("/");
      dividir.setSize(dbutton);
      dividir.setLocation(225, 125);      
      dividir.addActionListener(this);
      this.add(dividir);
      
      botao7 = new Button("7");
      botao7.setSize(dbutton);
      botao7.setLocation(25, 50);      
      botao7.addActionListener(this);
      this.add(botao7);
   
      botao8 = new Button("8");
      botao8.setSize(dbutton);
      botao8.setLocation(75, 50);      
      botao8.addActionListener(this);
      this.add(botao8);
    
      botao9 = new Button("9");
      botao9.setSize(dbutton);
      botao9.setLocation(125, 50);      
      botao9.addActionListener(this);
      this.add(botao9);
      
      soma = new Button("+");
      soma.setSize(dbutton);
      soma.setLocation(225, 50);      
      soma.addActionListener(this);
      this.add(soma);
      
      botao4 = new Button("4");
      botao4.setSize(dbutton);
      botao4.setLocation(25, 75);      
      botao4.addActionListener(this);
      this.add(botao4);
   
      botao5 = new Button("5");
      botao5.setSize(dbutton);
      botao5.setLocation(75,75 );     
      botao5.addActionListener(this);
      this.add(botao5);
    
      botao6 = new Button("6");
      botao6.setSize(dbutton);
      botao6.setLocation(125, 75);      
      botao6.addActionListener(this);
      this.add(botao6);
      
      menos= new Button("-");
      menos.setSize(dbutton);
      menos.setLocation(225, 75);      
      menos.addActionListener(this);
      this.add(menos);
      
      botao1 = new Button("1");
      botao1.setSize(dbutton);
      botao1.setLocation(25, 100);
      botao1.addActionListener(this);
      this.add(botao1);
   
      botao2 = new Button("2");
      botao2.setSize(dbutton);
      botao2.setLocation(75,100 );
      botao2.addActionListener(this);
      this.add(botao2);
    
      botao3 = new Button("3");
      botao3.setSize(dbutton);
      botao3.setLocation(125, 100);
      botao3.addActionListener(this);
      this.add(botao3);
      
      vezes= new Button("*");
      vezes.setSize(dbutton);
      vezes.setLocation(225, 100);
      vezes.addActionListener(this);
      this.add(vezes);
      
      botaoce = new Button("CE");
      botaoce.setSize(dbutton);
      botaoce.setLocation(175, 50);
      botaoce.addActionListener(this);
      this.add(botaoce);
      
      botaoc = new Button("C");
      botaoc.setSize(dbutton);
      botaoc.setLocation(175, 75);
      botaoc.addActionListener(this);
      this.add(botaoc);
      

      this.addWindowListener(this);
      
    }  
    
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
       if(e.getSource()== botao1){
       txtmsg.setText(txtmsg.getText() + "1");
       }
       if(e.getSource()== botao2){
       txtmsg.setText(txtmsg.getText() + "2");       
       }
       if(e.getSource()== botao3){
       txtmsg.setText(txtmsg.getText() + "3");   
       }
       if(e.getSource()== botao4){
       txtmsg.setText(txtmsg.getText() + "4");     
       }
       if(e.getSource()== botao5){
       txtmsg.setText(txtmsg.getText() + "5");
       }
       if(e.getSource()== botao6){
       txtmsg.setText(txtmsg.getText() + "6");   
       }
       if(e.getSource()== botao7){
       txtmsg.setText(txtmsg.getText() + "7");
       }
       if(e.getSource()== botao8){
       txtmsg.setText(txtmsg.getText() + "8");
       }
       if(e.getSource()== botao9){
       txtmsg.setText(txtmsg.getText() + "9");   
       }
       if(e.getSource()== botao0){           
       txtmsg.setText(txtmsg.getText() + "0");  
       }
       if(e.getSource()==  soma){
       valor1 = Double.parseDouble(txtmsg.getText());
       txtmsg.setText("");
       sinal = "soma";
       }
       if(e.getSource()==  menos){
       valor1 = Double.parseDouble(txtmsg.getText());
       txtmsg.setText("");
       sinal = "menos";
       }
       if(e.getSource()==  vezes){
       valor1 = Double.parseDouble(txtmsg.getText());
       txtmsg.setText("");
       sinal = "vezes";
       }
       if(e.getSource()==  dividir){
       valor1 = Double.parseDouble(txtmsg.getText());
       txtmsg.setText("");
       sinal = "dividir";
       }
       if(e.getSource()==  botaoce){
       txtmsg.setText("");
       }
       if(e.getSource()==  botaoc){
       txtmsg.setText("");
       }
       if(e.getSource()==  igual){
       valor2 = Double.parseDouble(txtmsg.getText());
            if (sinal == "soma"){
                txtmsg.setText(String.valueOf(calculadora.somar(valor1, valor2)));
            }
            if (sinal == "menos"){
                txtmsg.setText(String.valueOf(calculadora.menos(valor1, valor2)));
            }
            if (sinal == "vezes"){
                txtmsg.setText(String.valueOf(calculadora.vezes(valor1, valor2)));
            }
            if (sinal == "dividir"){
            txtmsg.setText(String.valueOf(calculadora.dividir(valor1, valor2)));
            }
       }
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
     
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
       
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       
    }
    
}
