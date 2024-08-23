package day6_1_TO_String;
import day4.MyDate;

public class Student {
	private int studId;
	private String studName;
	private MyDate  addmissionDate;
	
	public Student() {
		studId=101;
		studName="amit";
		addmissionDate=new MyDate();	
	}
	
	public Student(int studId, String studName, MyDate addmissionDate) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.addmissionDate = addmissionDate;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", addmissionDate=" + addmissionDate + "]";
	}

}