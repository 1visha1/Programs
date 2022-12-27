import java.awt.*;
import java.awt.event.*;

public class awtProgram extends Frame { 
            TextField tf1; 
            TextField tf2; 
            Label l1; 
            Button b,b2,b3,b4;
            awtProgram() { 
                          setTitle("Adder"); 
                          tf1 = new TextField(); 
                          tf1.setBounds(100, 50, 85, 20);
                          tf2 = new TextField(); 
                          tf2.setBounds(100, 100, 85, 20); 
                          b = new Button("Add"); 
                          b.setBounds(90,220,60,40);
                          b2 = new Button("Sub");
                          b2.setBounds(90,180,60,40);
                          b3 = new Button("Mul");
                          b3.setBounds(150,180,60,40);
                          b4 = new Button("Div"); 
                          b4.setBounds(150,220,60,40);
                          l1 = new Label(""); 
                          l1.setBounds(100, 120, 85, 20); 
                          add(b); 
                          add(b2);
                          add(b3);
                          add(b4);
                          add(tf1); 
                          add(tf2); 
                          add(l1); 
                          setSize(300,300); 
                          setVisible(true); 

        b.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) { 
                    int a = Integer.parseInt(tf1.getText());
                    int b = Integer.parseInt(tf2.getText()); 
                    int c = a + b; 
                    l1.setText("Their sum is = " + String.valueOf(c)); 
                                      }
                }); 
                b2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) { 
                         int a = Integer.parseInt(tf1.getText());
                         int b = Integer.parseInt(tf2.getText()); 
                         int c = a - b; 
                         l1.setText("Their sub is = " + String.valueOf(c)); 
                                           }
                     }); 
                     b3.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) { 
                             int a = Integer.parseInt(tf1.getText());
                             int b = Integer.parseInt(tf2.getText()); 
                             int c = a * b; 
                             l1.setText("Their Mul is = " + String.valueOf(c)); 
                                               }
                         }); 
                         b4.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) { 
                                 int a = Integer.parseInt(tf1.getText());
                                 int b = Integer.parseInt(tf2.getText()); 
                                 int c = a / b; 
                                 l1.setText("Their Div is = " + String.valueOf(c)); 
                                                   }
                             }); 
            } 
public static void main(String []args) { 
                   new awtProgram();
          } 
}