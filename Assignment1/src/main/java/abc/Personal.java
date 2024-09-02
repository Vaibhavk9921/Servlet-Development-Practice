package abc;

public class Personal {
	private String name;
	private String phone;
	private String qualification;
	private String institute;
	private String marks;

	public Personal() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Personal(String name, String phone, String qualification, String institute, String marks) {
		super();
		this.name = name;
		this.phone = phone;
		this.qualification = qualification;
		this.institute = institute;
		this.marks = marks;
	}

}