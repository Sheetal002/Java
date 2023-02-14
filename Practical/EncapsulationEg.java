class Student{
	private int sid;
	private String name;
	private String email;
	private long phoneno;

	//getter setter method
	public int getSid(){
		return sid;
	}
	public void setSid(int sid){
		this.sid = sid;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public long getPhone(){
		return phoneno;
	}
	public void setPhone(long phoneno){
		this.phoneno = phoneno;
	}

}

class EncapsulationEg{
	public static void main(String args[]){
	Student s = new Student();
	s.setSid(1001);
	s.setName("Sheetal");
	s.setEmail("sheetal@gmail.com");
	s.setPhone(987654321);

	System.out.println("Values are" + s.getSid() + " "+ s.getName() + " "+ s.getEmail() + " " + s.getPhone());
}
}