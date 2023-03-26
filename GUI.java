import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    public static void main(String args[]) {
        Abc obj = new Abc();
    }
}

class Abc extends JFrame implements ActionListener {
	JLabel l;
	JLabel ll;
	JLabel l2;
	JLabel l3;
	JTextField p;
	JButton b;
	int c=0;
	Random rand= new Random();
	int randomnumber=rand.nextInt(100)+1;
    public Abc() {
        
        super("Guessing a number");
		  setLayout(new FlowLayout());
		  l=new JLabel("enter the number");
		  p=new JTextField(20);
		  ll=new JLabel("");
		  l2=new JLabel("");
		  l3=new JLabel("");
		  b=new JButton("check");
		  add(l);
		  add(p);
		  add(ll);
		  add(l2);
		  add(l3);
		  add(b);
		  p.addActionListener(this);
		  b.addActionListener(this);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	 public void actionPerformed(ActionEvent ae) {
			int number;
			number=Integer.parseInt(p.getText());
			if (number==randomnumber)
			{
				ll.setText("Congratulations");
				l2.setText("No of attempts are    " + Integer.toString(c+1));
				if(c==1){
					l3.setText("your score is 100");
				}
				else if(c>1 && c<=10){
					l3.setText("your score is 90");
				}
				else if((c>10) && (c<=20)){
					l3.setText("your score is 80");
				}
				else{
					l3.setText("your score is 70");
				}
				return;
			}
			else if(number>randomnumber){
				c=c+1;
				ll.setText("number is too high");
			}
			else{
				c=c+1;
				ll.setText("number is too low");
			}
		 }
		
		 
    
}

 

