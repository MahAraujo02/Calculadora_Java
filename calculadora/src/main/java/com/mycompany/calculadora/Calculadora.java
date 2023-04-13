
package com.mycompany.calculadora;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame 
implements ActionListener
{

JLabel lV1;
JLabel lV2;
JLabel lSoma;
JTextField tfV1, tfV2, tfResult;
JButton  bSoma, bMult, bSub, bDiv;

  Soma som = new Soma();
  Multiplicaçao mult = new Multiplicaçao();
  Div dDiv = new Div();
  Sub sSub = new Sub();



  public Calculadora () {
    setLayout(new FlowLayout());
    setSize(400,400);
    setVisible(true);

    lV1 = new JLabel("valor 1");
    add(lV1);

    tfV1 = new JTextField(5);
    tfV1.addActionListener(this);
    add(tfV1);

    lV2 = new JLabel("valor 2");
    add(lV2);

    tfV2 = new JTextField(5);
    tfV2.addActionListener(this);
    add(tfV2);

    lSoma = new JLabel("resultado");
    add(lSoma);

    tfResult = new JTextField(5);
    add(tfResult);

    bSoma = new JButton("Somar");
    bSoma.addActionListener(this);
    add(bSoma);
    
    bMult = new JButton("Multiplicar");
    bMult.addActionListener(this);
    add(bMult);

    bSub = new JButton("Subtrair");
    bSub.addActionListener(this);
    add(bSub);

    bDiv = new JButton("Dividir");
    bDiv.addActionListener(this);
    add(bDiv);

  }

public static void main(String[] args) 
  {
    Calculadora app = new Calculadora();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }

@Override
public void actionPerformed(ActionEvent e)
 {  if(e.getSource() == bSoma)
    {
        int a = Integer.parseInt(tfV1.getText());
        int b = Integer.parseInt(tfV2.getText());
        int s = som.soma(a, b);
        tfResult.setText(String.valueOf(s));
    }
   if(e.getSource() == bMult){
       
        int a = Integer.parseInt(tfV1.getText());
        int b = Integer.parseInt(tfV2.getText());
        int s = mult.mult(a, b);
        tfResult.setText(String.valueOf(s));
       
   }

   if(e.getSource() == bSub){
       
    int a = Integer.parseInt(tfV1.getText());
    int b = Integer.parseInt(tfV2.getText());
    int s = sSub.subtraçao(a, b);
    tfResult.setText(String.valueOf(s));
   
 }

 if(e.getSource() == bDiv){
       
  int a = Integer.parseInt(tfV1.getText());
  int b = Integer.parseInt(tfV2.getText());
  float s = dDiv.divisao(a, b);
  tfResult.setText(String.valueOf(s));
 
}


    if(e.getSource() == tfV1){
        tfV2.requestFocus();
    }


 }

}