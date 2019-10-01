import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

	JLabel l1, l2;
	JTextField tx1;
	JPasswordField ps1;
	JButton b1, b2;

	public Login() {

		setVisible(true);
		setSize(300, 300);
		setLayout(new FlowLayout());
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(3,2));

		l1 = new JLabel("UserName");
		l2 = new JLabel("Password");

		tx1 = new JTextField(20);
		ps1 = new JPasswordField(20);

		b1 = new JButton("Login");
		b2 = new JButton("Clear");
		
		jp.add(l1);
		jp.add(tx1);
		jp.add(l2);
		jp.add(ps1);
		jp.add(b1);
		jp.add(b2);
		
		add(jp);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	public static void main(String[] args) {

		Login l=new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			
		}
		else
		{
			
			
		}
		
	}

}
