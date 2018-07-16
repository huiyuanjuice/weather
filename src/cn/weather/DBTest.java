package cn.weather;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class DBTest {

	public static void main(String[] args) {
		try {
			DBConnection b =new DBConnection();
			//String sql = "insert into question(Tid,Tquestion,OpA,OpB,OpC,OpD,Tanswer) values('1507','Tom',20,'hnust','ºþÄÏÏæÌ¶')";
			
			//b.execute(sql);
			ResultSet rs = b.executeQuery("select * from  question");
			
			ArrayList<Question> list = new ArrayList();
			while(rs.next()){
				String Tid = rs.getString(1);
				String Tquestion = rs.getString(2);
				String OpA = rs.getString(3);
				String OpB = rs.getString(4);
				String OpC = rs.getString(5);
				String OpD = rs.getString(6);
                String Tanswer = rs.getString(7);
				Question t = new Question(Tid, Tquestion, OpA, OpB, OpC,OpD,Tanswer);
				list.add(t);
			}
			b.close();
		
			
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
			
			for(int k=0;k<4;k++) {
				Question s = list.get(ques[k]);
				System.out.println(s.getTid());
				System.out.println(s.getTquestion());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}