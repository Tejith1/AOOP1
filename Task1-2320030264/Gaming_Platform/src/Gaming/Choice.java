package Gaming;

public class Choice {
	public static A getA(boolean pu)
	{
		if(pu)
			return new powerups();
		else
			return new weapons();
	}
}
