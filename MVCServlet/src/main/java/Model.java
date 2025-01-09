import java.sql.*;


public class Model {
	String name;
	String addmission;
	String password;
	int marks;
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pass="system";
	String sql="select * from Kodnest where Addmission=? and Password=?";
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	public Model() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean getResults() {
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1,addmission);
			pst.setString(2, password);
			rs=pst.executeQuery();
		
			if(rs.next()==true) {
				name=rs.getString(1);
				addmission=rs.getString(2);
				password=rs.getString(3);
				marks=rs.getInt(4);
				return true;	
			}
			else {
				return false;
			}
			
		} catch (Exception e) {	
		e.printStackTrace();
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddmission() {
		return addmission;
	}

	public void setAddmission(String addmission) {
		this.addmission = addmission;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
