import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EmployeeReport extends JFrame implements ActionListener,ItemListener{
	

	JLabel l1,l2,l3;
	JComboBox<String> cb1;
	JTextField tx2,tx3;
	JButton b1;
	static Connection con;
	static PreparedStatement pst;
	public EmployeeReport() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adjt23", "root", "root");
		setVisible(true);
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		l1=new JLabel("EmpID");
		l2=new JLabel("EmpName");
		l3=new JLabel("EmpSal");
		
		cb1=new JComboBox<String>();
		tx2=new JTextField(20);
		tx3=new JTextField(20);
		
		b1=new JButton("Show");
		
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(4,2));
		
		jp.add(l1);
		jp.add(cb1);
		jp.add(l2);
		jp.add(tx2);
		jp.add(l3);
		jp.add(tx3);
		jp.add(b1);
		
		add(jp);
		b1.addActionListener(this);
		
		String sql="select eid from emp";
		
		pst=con.prepareStatement(sql);
		
		ResultSet rs=pst.executeQuery();
		cb1.addItem("none");
		while(rs.next())
		{
			
			int eid=rs.getInt(1);
			cb1.addItem(String.valueOf(eid));
		}
		rs.close();
		cb1.addItemListener(this);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
       EmployeeReport er=new EmployeeReport();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==cb1)
		{
			
			Object eid=cb1.getSelectedItem();
			String sql="select * from emp where eid=?";
			
			try {
				pst=con.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(eid.toString()));
				
				ResultSet rs=pst.executeQuery();
				
				rs.first();
				
				String ename=rs.getString(2);
				String esal=rs.getString(3);
				
				tx2.setText(ename);
				tx3.setText(esal);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		
	}

}
