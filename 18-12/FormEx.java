import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormEx 
{
	JFrame frame;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2,tf3;
	JButton btn1;
	
	public FormEx()
	{
		frame = new JFrame();
		
		l1 = new JLabel("Registration Form");
		l1.setBounds(180,20,150,60);
		
		l2 = new JLabel("Username");
		l2.setBounds(70,50,150,60);
		
		tf1 = new JTextField();
		tf1.setBounds(180,70,150,20);
		
		l3 = new JLabel("Email");
		l3.setBounds(70,80,150,60);
		
		tf2 = new JTextField();
		tf2.setBounds(180,100,150,20);
		
		l4 = new JLabel("Password");
		l4.setBounds(70,110,150,60);
		
		tf3 = new JTextField();
		tf3.setBounds(180,130,150,20);
		
		btn1 = new JButton("Submit");
		btn1.setBounds(150,180,120,20);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new FormEx();
	}
}
