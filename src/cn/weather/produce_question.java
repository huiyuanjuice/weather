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

public class produce_question extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=utf-8");
		//String id = request.getParameter("id");
		//System.out.println("id:" + student_id);
		
		try {
			////////////
			// do something
			////////////
			DBConnection db = new DBConnection();
			System.out.println("db connection ok!");
			
		   ResultSet rs = db.executeQuery("select * from question ;");
			
			String Tid = "";
			String Tquestion = "";
			String OpA = "";
			String OpB = "";
			String OpC = "";
			String OpD = "";
			String Tanswer = "";
			
			ArrayList<Question> list = new ArrayList();
			
			while(rs.next()){
				Tid=rs.getString(1);
				Tquestion=rs.getString(2);
				OpA=rs.getString(3);
				OpB=rs.getString(4);
				OpC=rs.getString(5);
				OpD=rs.getString(6);
				Tanswer=rs.getString(7);
				Question q = new Question(Tid, Tquestion, OpA, OpB, OpC,OpD,Tanswer);
				list.add(q);
			}
			db.close();
			
			Random r = new Random();
			int j=0;
			int[] ques= {-1,-1,-1,-1};
			while(j<4) {
				int i=0;
				int randnumber = r.nextInt(list.size());
				while(i<4)
				{
					if(randnumber==ques[i])
						break;
					i++;
				}
				if(i==4)
				{
				System.out.println(randnumber);
				//if not exist 
				ques[j] = randnumber;
				j++;
				}
			}
			
			
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			JSONObject obj = new JSONObject();
			
			
			JSONObject obj1 = new JSONObject();
			Question q1 = list.get(ques[0]);
			obj1.put("Tid", q1.getTid());
			obj1.put("Tquestion", q1.getTquestion());
			obj1.put("OpA", q1.getOpA());
			obj1.put("OpB", q1.getOpB());
			obj1.put("OpC", q1.getOpC());
			obj1.put("OpD", q1.getOpD());
			obj1.put("Tanswer",Tanswer);
			obj.put("question1", obj1);
		
			
			JSONObject obj2 = new JSONObject();
			Question q2 = list.get(ques[1]);
			obj2.put("Tid", q2.getTid());
			obj2.put("Tquestion", q2.getTquestion());
			obj2.put("OpA", q2.getOpA());
			obj2.put("OpB", q2.getOpB());
			obj2.put("OpC", q2.getOpC());
			obj2.put("OpD", q2.getOpD());
			obj2.put("Tanswer",Tanswer);
			obj.put("question2", obj2);
			
			JSONObject obj3 = new JSONObject();
			Question q3 = list.get(ques[2]);
			obj3.put("Tid", q3.getTid());
			obj3.put("Tquestion", q3.getTquestion());
			obj3.put("OpA", q3.getOpA());
			obj3.put("OpB", q3.getOpB());
			obj3.put("OpC", q3.getOpC());
			obj3.put("OpD", q3.getOpD());
			obj3.put("Tanswer",Tanswer);
			obj.put("question3", obj3);
			
			
			JSONObject obj4 = new JSONObject();
			Question q4 = list.get(ques[3]);
			obj4.put("Tid", q4.getTid());
			obj4.put("Tquestion", q4.getTquestion());
			obj4.put("OpA", q4.getOpA());
			obj4.put("OpB", q4.getOpB());
			obj4.put("OpC", q4.getOpC());
			obj4.put("OpD", q4.getOpD());
			obj4.put("Tanswer",Tanswer);
			obj.put("question4", obj4);
			
			System.out.println(obj.toString());
			out.print(obj.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void doSearch( ) {
		try {
			
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from question;" );
			
			String Tid = "";
			String Tquestion = "";
			String OpA = "";
			String OpB = "";
			String OpC = "";
			String OpD = "";
			String Tanswer = "";
			
			ArrayList<Question> list = new ArrayList();
			
			while(rs.next()){
				Tid=rs.getString(1);
				Tquestion=rs.getString(2);
				OpA=rs.getString(3);
				OpB=rs.getString(4);
				OpC=rs.getString(5);
				OpD=rs.getString(6);
				Tanswer=rs.getString(7);
				Question t = new Question(Tid, Tquestion, OpA, OpB, OpC,OpD,Tanswer);
				list.add(t);
			}
			db.close();
			
			Random r = new Random();
			int j=0;
			int[] ques= {-1,-1,-1,-1};
			while(j<4) {
				int i=0;
				int randnumber = r.nextInt(list.size());
				while(i<4)
				{
					if(randnumber==ques[i])
						break;
					i++;
				}
				if(i==4)
				{
				System.out.println(randnumber);
				//if not exist 
				ques[j] = randnumber;
				j++;
				}
			}
			
			JSONObject obj = new JSONObject();
			
			JSONObject obj1 = new JSONObject();
			Question q1 = list.get(ques[0]);
			obj1.put("Tid", q1.getTid());
			obj1.put("Tquestion", q1.getTquestion());
			obj1.put("OpA", q1.getOpA());
			obj1.put("OpB", q1.getOpB());
			obj1.put("OpC", q1.getOpC());
			obj1.put("OpD", q1.getOpD());
			obj1.put("Tanswer",Tanswer);
			obj.put("question1", obj1);
		
			
			JSONObject obj2 = new JSONObject();
			Question q2 = list.get(ques[1]);
			obj2.put("Tid", q2.getTid());
			obj2.put("Tquestion", q2.getTquestion());
			obj2.put("OpA", q2.getOpA());
			obj2.put("OpB", q2.getOpB());
			obj2.put("OpC", q2.getOpC());
			obj2.put("OpD", q2.getOpD());
			obj2.put("Tanswer",Tanswer);
			obj.put("question2", obj2);
			
			JSONObject obj3 = new JSONObject();
			Question q3 = list.get(ques[2]);
			obj3.put("Tid", q3.getTid());
			obj3.put("Tquestion", q3.getTquestion());
			obj3.put("OpA", q3.getOpA());
			obj3.put("OpB", q3.getOpB());
			obj3.put("OpC", q3.getOpC());
			obj3.put("OpD", q3.getOpD());
			obj3.put("Tanswer",Tanswer);
			obj.put("question3", obj3);
			
			
			JSONObject obj4 = new JSONObject();
			Question q4 = list.get(ques[3]);
			obj4.put("Tid", q4.getTid());
			obj4.put("Tquestion", q4.getTquestion());
			obj4.put("OpA", q4.getOpA());
			obj4.put("OpB", q4.getOpB());
			obj4.put("OpC", q4.getOpC());
			obj4.put("OpD", q4.getOpD());
			obj4.put("Tanswer",Tanswer);
			obj.put("question4", obj4);
			
			System.out.println(obj.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		doSearch();
	}

}
