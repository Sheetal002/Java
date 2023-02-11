enum Directions
{
	EAST,
	WEST,
	NORTH,
	SOUTH;
}
public class EnumExample{
	Directions direction;
	public EnumExample(Directions direction) {
	this.direction = direction;
	}
	void checkDirection(){
	switch(direction)
	{
		case EAST: System.out.println("East is the direction");
			break;
		case WEST: System.out.println("West is the direction");
			break;
		case NORTH: System.out.println("North is the direction");
			break;
		case SOUTH: System.out.println("South is the direction");
			break;
		default: System.out.println("Input correct direction");
			break;
		}
	}
public static void main(String[] args){
	String str="SOUTH";
	EnumExample e = new EnumExample(Directions.valueOf(str));
	e.checkDirection();
}
}