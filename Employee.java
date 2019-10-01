import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.*;
public class Employee extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3;
	JTextField tx1,tx2,tx3;
	JButton b1,b2,b3,b4;
	static Connection con;
	static PreparedStatement pst;
	public Employee() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adjt23", "root", "root");
		setVisible(true);
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		l1=new JLabel("EmpID");
		l2=new JLabel("EmpName");
		l3=new JLabel("EmpSal");
		
		tx1=new JTextField(20);
		tx2=new JTextField(20);
		tx3=new JTextField(20);
		
		b1=new JButton("Add");
		b2=new JButton("Delete");
		b3=new JButton("Update");
		b4=new JButton("Select");
		
		JPanel jp=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		
		p1.setLayout(new GridLayout(3,2));
		p2.setLayout(new FlowLayout());
		jp.setLayout(new GridLayout(2,1));
		
		p1.add(l1);
		p1.add(tx1);
		p1.add(l2);
		p1.add(tx2);
		p1.add(l3);
		p1.add(tx3);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		jp.add(p1);
		jp.add(p2);
		add(jp);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Employee e=new Employee();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			String eid=tx1.getText();
			String ename=tx2.getText();
			String esal=tx3.getText();
			String sql="insert into emp values(?,?,?)";
			try {
				pst=con.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(eid));
				pst.setString(2, ename);
				pst.setFloat(3, Float.parseFloat(esal));
				
				pst.executeUpdate();
				
				JOptionPane.showMessageDialog(this, "rec inserted");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b2)
		{
			String sql="delete from emp where eid=?";
			try {
				pst=con.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(tx1.getText()));
				
				pst.executeUpdate();
				
				JOptionPane.showMessageDialog(this, "rec deleted");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		else if(e.getSource()==b3)
		{
			
		}
		else
		{
			
		}
		
	}

}
