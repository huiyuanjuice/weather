package cn.weather;

public class Question {

	public String getTid() {
		return Tid;
	}

	public void setTid(String Tid) {
		this.Tid = Tid;
	}

	public String getTquestion() {
		return Tquestion;
	}

	public void setTquestion(String Tquestion) {
		this.Tquestion = Tquestion;
	}
	public String getOpA() {
		return OpA;
	}

	public void setOpA(String OpA) {
		this.OpA = OpA;
	}
	
	public String getOpB() {
		return OpB;
	}

	public void setOpB(String OpB) {
		this.OpB = OpB;
	}

	public String getOpC() {
		return OpC;
	}

	public void setOpC(String OpC) {
		this.OpD = OpC;
	} 

	public String getOpD() {
		return OpD;
	}

	public void setOpD(String OpD) {
		this.OpD = OpD;
	}

	public String getTanswer() {
		return Tanswer;
	}

	public void setTanswer(String Tanswer) {
		this.Tanswer = Tanswer;
	}

	private String Tid;
	private String Tquestion;
	private String OpA;
	private String OpB;
	private String OpC;
	private String OpD;
	private String Tanswer;
	
	public Question() {
		
	}
	public Question(
			String Tid, 
			String Tquestion, 
			String OpA, 
			String OpB,
			String OpC,
			String OpD,
			String Tanswer) {
		this.Tid = Tid;
		this.Tquestion = Tquestion;
		this.OpA = OpA;
		this.OpB = OpB;
		this.OpC = OpC;
		this.OpD = OpD;
		this.Tquestion = Tquestion;
	}
	public static void main(String[] args) {
		

	}

}
