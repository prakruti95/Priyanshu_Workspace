import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 implements ActionListener
{
	JFrame frame;
	JButton btninsert,btnview,btnupdate,btndelete;
	
	
	public Test1() 
	{
		frame = new JFrame();
		
		btninsert = new JButton("INSERT");
		btnview = new JButton("VIEW");
		btnupdate = new JButton("UPDATE");
		btndelete = new JButton("DELETE");
		
		frame.add(btninsert);
		frame.add(btnview);
		frame.add(btnupdate);
		frame.add(btndelete);
		
		btninsert.addActionListener(this);
		btnview.addActionListener(this);
		btnupdate.addActionListener(this);
		btndelete.addActionListener(this);
		
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Test1();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		AllOperations a = new AllOperations();
		
		if(e.getSource()==btninsert)
		{
			a.insert();
		}
		if(e.getSource()==btnview)
		{
			a.view();
		}
		if(e.getSource()==btnupdate)
		{
			a.update();
		}
		if(e.getSource()==btndelete)
		{
			a.delete();
		}
		
	}
}
