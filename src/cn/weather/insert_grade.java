package cn.weather;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.Random;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import org.json.JSONException;
	import org.json.JSONObject;

	import cn.weather.DBConnection;

	public class insert_grade extends HttpServlet {

		public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			doGet(request, response);
		}	
		
		
      public void doGet(HttpServletRequest request, HttpServletResponse response)
			      throws ServletException, IOException {
					
					response.setContentType("text/plain;charset=utf-8");
					String User_id = request.getParameter("id");
				//	System.out.println("id:" + student_id);
					
					try {
						////////////
						// do something
						////////////
						DBConnection db = new DBConnection();
						System.out.println("db connection ok!");
						
						
			     String id = request.getParameter("id");
			     String Uid= request.getParameter("Uid");
			     String Grade= request.getParameter("Grade");
			     String Time = request.getParameter("Time");
			     String sql="insert into tablename (id,Uid,Grade,Time) values("+id+","+Uid+","+Grade+","+Time+")";	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
