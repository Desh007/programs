import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuForm extends JFrame{
	
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem m11,m21;
	
	public MenuForm() {
		setVisible(true);
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		mb=new JMenuBar();
		m1=new JMenu("Transaction");
		m2=new JMenu("Report");
		m11=new JMenuItem("BookTrans");
		m21=new JMenuItem("BookReport");
		
		m1.add(m11);
		m2.add(m21);
		mb.add(m1);
		mb.add(m2);
		
		add(mb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MenuForm m=new MenuForm();
	}

}
