package password;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Gui {
	
	public Gui()
	{
		JFrame win = new JFrame("nome");
		
		JPanel pan = new JPanel();
		pan.setLayout(null);
		pan.setBackground(Color.black);
		win.add(pan);
		
		JPasswordField f = new JPasswordField(10);
		f.setBounds(0, 100,	1000, 35);
		f.setFont(new Font(f.getFont().getName(), f.getFont().getStyle(), 33));
		f.setForeground(Color.magenta);
		f.setEchoChar('*');
		pan.add(f);
		
		f.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				String pass = new String(f.getPassword());
				FilePassword obj = new FilePassword();
				obj.Scrivi("password digitata: " + pass + "\n");
			}
			
		});
		
		JLabel lab = new JLabel("inserisci una password e premi invio");
		lab.setForeground(Color.red);
		lab.setFont(new Font(lab.getFont().getName(), lab.getFont().getStyle(), 33));
		win.add(lab, BorderLayout.BEFORE_FIRST_LINE);
		
		JButton button = new JButton("Controlla");
		button.setFocusable(false);
		button.setBounds(210, 200,	100, 35);
		pan.add(button);
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				try
				{
					Runtime.getRuntime().exec("cmd.exe /c start program.lnk");
				}
				catch(Exception e1)
				{
					return;
				}
				
			}
			
		});
		
		win.setSize(600, 600);
		win.getContentPane().setBackground(Color.black);
		win.setLocationRelativeTo(null);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
