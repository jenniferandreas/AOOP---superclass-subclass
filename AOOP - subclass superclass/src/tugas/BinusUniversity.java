package tugas;

public class BinusUniversity {
	private String id;
	private String address;
	private String name;
	
	public BinusUniversity(){
		
	}
	

	public BinusUniversity(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;	
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
