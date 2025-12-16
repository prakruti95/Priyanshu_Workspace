package com.a1612;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIEx 
{
	JFrame frame;
	JTextField tf;
	JButton btn;
	
	public GUIEx() 
	{
		frame = new JFrame();
		
		tf = new JTextField();
		tf.setBounds(95, 50, 199, 34);
		
		btn = new JButton("Submit");
		btn.setBounds(140, 95, 99, 34);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String name = tf.getText().toString();
				System.out.println(name);
				
			}
		});
		
		frame.add(tf);
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEx();
	}
}
