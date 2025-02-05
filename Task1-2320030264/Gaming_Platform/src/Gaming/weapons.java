package Gaming;

public class weapons extends A{
	@Override
	public Loadout getLoadout(int num)
	{
		if(num==1)
			return new wea1();
		else if(num==2)
			return new wea2();
		else
			return null;
	}
}
