package abc;

public class Education {
	private String qualification;
	private String institute;
	private String marks;

	public Education() {

	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public Education(String qualification, String institute, String marks) {
		super();
		this.qualification = qualification;
		this.institute = institute;
		this.marks = marks;
	}

}
