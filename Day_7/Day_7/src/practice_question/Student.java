// Create a class Student with following details: rollno, sname, course,
// attendance_percentage, score
// 1. Add constructors - default and parameterized
// 2. Add method – calculateGrade()
// 3. If the attendance_percentage is lesser than 60%, throw a user defined exception
// and print appropriate message
// 4. Store 10 student objects in file using serialization
// 5. Create appropriate collection for storing students in the decreasing order of
// attendance_percentage


package practice_question;

import java.io.Serializable;

public class Student implements Serializable {
	private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;
    private String grade;
    
	public Student() {
		super();
	}

	public Student(int rollno, String sname, String course, double attendance_percentage, double score, String grade) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.course = course;
		this.attendance_percentage = attendance_percentage;
		this.score = score;
		this.grade = grade;
	}
	
	// Method to calculate grade
    public void calculateGrade() throws LowAttendanceException {
        if (attendance_percentage < 60) {
            throw new LowAttendanceException(
                "Student " + sname + " has low attendance " + attendance_percentage + "%"
            );
        }

        if (score >= 90) grade = "A";
        else if (score >= 75) grade = "B";
        else if (score >= 60) grade = "C";
        else if (score >= 40) grade = "D";
        else grade = "F";
    }
    
    public double getAttendance() {
        return attendance_percentage;
    }

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getAttendance_percentage() {
		return attendance_percentage;
	}

	public void setAttendance_percentage(double attendance_percentage) {
		this.attendance_percentage = attendance_percentage;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", course=" + course + ", attendance_percentage="
				+ attendance_percentage + ", score=" + score + ", grade=" + grade + "]";
	}
    
}
