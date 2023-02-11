enum Day
{
SUNDAY,
MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY, 
SATURDAY;
Day()
{
	System.out.println("I am the private constructor of enum");
}
}

public class Main{

public static void main(String[] args){
	Day d1 = Day.THURSDAY;
	System.out.println(d1);
	System.out.println("Value of tuesday is"+Day.valueOf("TUESDAY"));
	System.out.println("Index of Tuesday is"+Day.valueOf("TUESDAY").ordinal());
	for( Day d:Day.values())
	System.out.println(d);
}
}