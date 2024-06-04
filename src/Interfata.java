
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfata{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JFrame frame;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JButton b1;
	JButton b2;
	JButton b3;
	JPanel p1;
	JPanel p2;
	JPanel p3;
	DefaultListModel<String> model=new DefaultListModel<String>();
	JList<String> list=new JList<String>(model);
	ArrayList<Volum> arrayList=new ArrayList<Volum>();
	public Interfata() {
		frame=new JFrame("Calcul");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		l1=new JLabel("Raza");
		l2=new JLabel("Inaltime");
		l3=new JLabel("Rezultat");
		text1=new JTextField();
		text1.setSize(200,10);
		text2=new JTextField();
		text2.setSize(200,10);
		text3=new JTextField();
		text3.setSize(200,10);
		
		b1=new JButton("Calculeaza");
		b1.addActionListener(new Buton1Apasat());
		b2=new JButton("Resetare");
		b2.addActionListener(new Buton2Apasat());
		p1=new JPanel();
		p1.setLayout(new GridLayout(2, 2));
		p1.add(l1);
		p1.add(text1);
		p1.add(l2);
		p1.add(text2);
		frame.getContentPane().add(p1);
		p2=new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(b1);
		p2.add(b2);
		frame.getContentPane().add(p2);	
		p3=new JPanel();
		p3.setLayout(new GridLayout(1,1));
		p3.add(l3);
		p3.add(text3);
		frame.getContentPane().add(p3);
	}
	
	class Buton1Apasat implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		   
			String r=text1.getText();
			String h=text2.getText();
			int raza=Integer.parseInt(r);
			int he=Integer.parseInt(h);
			Volum volum=new Volum(raza, he);
			double rezultat=volum.CalculVolum();
			text3.setText(Double.toString(rezultat));
			text3.setVisible(true);
			
			 try {
				 FileWriter fileWriter = new FileWriter("C:\\Users\\Admin\\Desktop\\Rezultat.txt", true);
				fileWriter.write(volum.toString()+ " "+ Double.toString(rezultat));
				fileWriter.write("\n");
				fileWriter.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
		}
		
				
			}
			

	class Buton2Apasat implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			text1.setText("");
			text2.setText("");
			text3.setText("");
	}
	}

		
	}
	


