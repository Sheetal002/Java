enum Genres
{
	FILMI,
	PARTY,
	DESIPOP;
	
}
public class EnumWIthSwitch{
	public static void main(String[] args) {
	Genres reco =Genres.FILMI;
	switch(reco)
	{
	case FILMI: System.out.println("Play: Agar Tum Sath Ho" );
		break;
	case PARTY: System.out.println("Play: Permission to Dance");
		break;
	case DESIPOP: System.out.println("Play: It's thetime to disco" );
		break;
	
		}
	}
}