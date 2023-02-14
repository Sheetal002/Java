class Book{
	private int bid;
	private String name;
	private String author;
	private int no_of_copies;

	//getter setter method
	public int getBid(){
		return bid;
	}
	public void setBid(int bid){
		this.bid = bid;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public int getNoOfCopies(){
		return no_of_copies;
	}
	public void setNoOfCopies(int no_of_copies){
		this.no_of_copies = no_of_copies;
	}

}

class EncapsulationEg1{
	public static void main(String args[]){
	Book b = new Book();
	b.setBid(101);
	b.setName("AnyBook");
	b.setAuthor("SomeAuthor");
	b.setNoOfCopies(5);

	System.out.println("Values are: " + b.getBid() + " "+ b.getName() + " "+ b.getAuthor() + " " + b.getNoOfCopies());
}
}