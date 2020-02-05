import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Student")
public class Student extends HttpServlet {
private static final long serialVersionUID = 1L;
     
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("hi");
String s1=request.getParameter("stud_id");
int studId=Integer.parseInt(s1);
String studName=request.getParameter("stud_name");
String s2=request.getParameter("stud_marks");
int studMarks=Integer.parseInt(s2);
String address=request.getParameter("stud_address");
String s3=request.getParameter("stud_mobile");
long studMobile=Long.parseLong(s3);
String studEmail=request.getParameter("stud_email");
String password=request.getParameter("password");
try {
String date=request.getParameter("stud_dob");
System.out.println(date);
SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
java.util.Date d=sdf.parse(date);
java.sql.Date ds=new java.sql.Date(d.getTime());
/*PrintWriter out=response.getWriter();
out.println("registration done "+studName);*/
Class.forName("oracle.jdbc.driver.OracleDriver");
//System.out.println("driver loaded");
Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
//System.out.println("Connection established");
PreparedStatement ps=cname.prepareStatement("insert into student1 values(?,?,?,?,?,?,?,?)");
ps.setString(1,studName );
ps.setInt(2,studId );
ps.setInt(3,studMarks );
ps.setString(4, address);
ps.setLong(5,studMobile );
ps.setString(6, studEmail);
ps.setDate(7, ds);
        ps.setString(8, password);
int result=ps.executeUpdate();
if(result>0)
{
cname.commit();
PrintWriter out=response.getWriter();
out.println("registration done "+studName);

}

}
catch(ClassNotFoundException c)
{
System.out.println(c);
}
catch(SQLException s)
{
System.out.println(s);
}
catch(ParseException p)
{
System.out.println(p);
}

}
}