package tugas;

public class Mahasiswa extends BinusUniversity{

	private String classCode;
	private String faculty;
	
	
	public Mahasiswa(String classCode, String faculty) {
		super();
		this.classCode = classCode;
		this.faculty = faculty;
	}

	public Mahasiswa(String id, String name, String address, String classCode, String faculty) {
		super(id, name, address);
		this.classCode = classCode;
		this.faculty = faculty;
		// TODO Auto-generated constructor stub
	}

	public String getClassCode() {
		return classCode;
	}


	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	
}
