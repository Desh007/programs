import java.sql.*;
import java.util.Scanner;

public class Book {

	static Connection con;
	static PreparedStatement pst;
	static Scanner sc;
	String isbn, bname, bauthor;
	float bprice;

	public Book() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adjt23", "root", "root");
		sc = new Scanner(System.in);
	}

	public void insert() throws SQLException {
		System.out.println("enter isbn");
		isbn = sc.next();
		System.out.println("enter bname");
		bname = sc.next();
		System.out.println("enter bauthor");
		bauthor = sc.next();
		System.out.println("enter bprice");
		bprice = sc.nextFloat();

		String sql = "insert into book values(?,?,?,?)";

		pst = con.prepareStatement(sql);

		pst.setString(1, isbn);
		pst.setString(2, bname);
		pst.setString(3, bauthor);
		pst.setFloat(4, bprice);

		pst.execute();

		System.out.println("rec inserted");
	}

	public void delete() throws SQLException {
		System.out.println("enter isbn");
		isbn = sc.next();
		String sql = "delete from book where isbn=?";
		pst = con.prepareStatement(sql);
		pst.setString(1, isbn);
		pst.execute();

		System.out.println("rec deleted");

	}

	public void update() throws SQLException {
		
		String sql="update book set bname=?,bauthor=?,bprice=? where isbn=?";
		pst=con.prepareStatement(sql);
		System.out.println("enter isbn");
		isbn = sc.next();
		System.out.println("enter bname");
		bname = sc.next();
		System.out.println("enter bauthor");
		bauthor = sc.next();
		System.out.println("enter bprice");
		bprice = sc.nextFloat();
		pst.setString(1, bname);
		pst.setString(2, bauthor);
		pst.setFloat(3, bprice);
		pst.setString(4, isbn);
		
		pst.execute();
		
		System.out.println("rec updated");
		
		

	}

	public void select() throws SQLException {
		
		String sql="select * from book";
		
		pst=con.prepareStatement(sql);
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
		rs.close();

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Book b=new Book();
		//b.insert();
		b.select();
		//b.delete();
		b.update();
		b.select();
	}

}
