package Gaming;

public class powerups extends A{
	@Override
	public Loadout getLoadout(int num)
	{
		if(num==2)
			return new pu2();
		else if(num==1)
			return new pu1();
		return null;
	}
}