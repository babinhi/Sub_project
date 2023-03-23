package Student;

import java.text.DecimalFormat;

public class StudentDTO {

	private static int number = 2301;
	private static DecimalFormat df = new DecimalFormat("###.##");
	
	private String sno;
	private String name;
	private String id;
	private String pw;
	private String phonemunber;
	private String major;
	private int kor;
	private int eng;
	private int mat;
	private int soc;
	private int sci;
	private int total;
	private double avg;
	private char grade;
	
	public StudentDTO() {
		this.sno = "N"+number++;
	}
	public String getSno() {
		return sno;
	}
	public void setSno() {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhonemunber() {
		return phonemunber;
	}
	public void setPhonemunber(String phonemunber) {
		this.phonemunber = phonemunber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		this.total = kor+eng+mat+soc+sci;
		this.avg = total/(double)5;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		this.total = kor+eng+mat+soc+sci;
		this.avg = total/(double)5;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
		this.total = kor+eng+mat+soc+sci;
		this.avg = total/(double)5;
	}
	public int getSoc() {
		return soc;
	}
	public void setSoc(int soc) {
		this.soc = soc;
		this.total = kor+eng+mat+soc+sci;
		this.avg = total/(double)5;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
		this.total = kor+eng+mat+soc+sci;
		this.avg = total/(double)5;
	}
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}

	public char getGrade() {
		return grade;
	}
	public void setGrade() {
		if(avg >=90) {
				this.grade = 'A';
		}else if(avg >= 80) {
		        this.grade = 'B';
		}else if(avg >= 70) {
		    	this.grade = 'C';
		}else if(avg >= 60) {
		    	this.grade = 'D';
		}else {
			   this.grade = 'F';
		   }
		this.grade = grade;
	}
	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",
				sno, name, id, pw, phonemunber, major);
		
	}
	@Override
	public String toString() {
		String i =  sno + " \t " + name + pw +" \t " + phonemunber
				+ " \t " + major + " \t " + kor + " \t " + eng + " \t " + mat + " \t " + soc + " \t " 
				+ sci + " \t " + total +  " \t " + df.format(avg) + " \t " + grade;
		return i;
	}
	
	
	
	
}
