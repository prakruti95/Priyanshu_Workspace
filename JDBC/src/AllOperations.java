import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class AllOperations 
{
	JFrame insertframe,deleteframe,updateframe,editframe;
	JTextField tf1,tf2,tf3;
	JButton btnadd,btndelete,btnedit,btnupdate;
	JPanel jp,jp2;
	
	public void insert()
	{
		insertframe = new JFrame();
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		btnadd = new JButton("Add");
		
		btnadd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tops","root","");
					
					String fname = tf1.getText().toString();
					String lname = tf2.getText().toString();
					
					String sql = "insert into details values (null,'"+fname+"','"+lname+"')";
					
					Statement stmt = con.createStatement();
					
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						System.out.println("Inserted");
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Fail");
					}
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btnadd);
		
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	
	public void view()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tops","root","");
			
			String sql = "select * from details";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(sql);
			
			while(set.next())
			{
				int id = set.getInt(1);
				String fname = set.getString(2);
				String lname =set.getString(3);
				
				System.out.println(id+" "+fname+" "+lname);
			}
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete()
	{
		deleteframe = new JFrame();
		
		tf3 = new JTextField(20);
		
		btndelete = new JButton("Add");
		
		btndelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tops","root","");
					
					String id = tf3.getText().toString();
					
					
					String sql = "delete from details where id='"+id+"'";
					
					Statement stmt = con.createStatement();
					
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						System.out.println("Deleted");
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Fail");
					}
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		deleteframe.add(tf3);
		deleteframe.add(btndelete);
		
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
	}
	
	public void update()
	{
		updateframe = new JFrame();
		
		jp  = new JPanel();
		jp2 = new JPanel();
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		btnedit = new JButton("Edit");
		btnupdate = new JButton("Update");
		
		jp.add(tf3);
		jp.add(btnedit);
		
		jp2.add(tf1);
		jp2.add(tf2);
		jp2.add(btnupdate);
		
//		updateframe.add(tf1);
//		updateframe.add(tf2);
//		updateframe.add(tf3);
//		updateframe.add(btnedit);
//		updateframe.add(btnupdate);
		
		updateframe.add(jp);
		updateframe.add(jp2);
		jp2.setVisible(false);
		
		btnedit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tops","root","");
					String myid = tf3.getText().toString();
					
					String sql = "select * from details where id='"+myid+"'";
					
					Statement stmt = con.createStatement();
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						int id = set.getInt(1);
						String name = set.getString(2);
						String lname = set.getString(3);
						
						tf1.setText(name);
						tf2.setText(lname);
						
						btnupdate.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
							
								try 
								{
									Class.forName("com.mysql.jdbc.Driver");
									Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tops","root","");
								
									String fname = tf1.getText().toString();
									String lname = tf2.getText().toString();
									String id = tf3.getText().toString();
									
									String sql = "update details set fname='"+fname+"',lname ='"+lname+"' where id='"+id+"'";
									Statement stmt = con.createStatement();
									
									int status = stmt.executeUpdate(sql);
									
									if(status>0)
									{
										System.out.println("Updated");
										updateframe.setVisible(false);
									}
									else
									{
										System.out.println("Error");
									}
								}
								catch (Exception e1)
								{
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
							}
						});
					}
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				jp2.setVisible(true);
				jp.setVisible(false);
				
				
			}
		});
		
		
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
	}
}
