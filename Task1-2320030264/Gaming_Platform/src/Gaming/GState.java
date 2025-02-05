package Gaming;
public class GState
{
	private static GState instance;
	private GState() {}
	public static GState getInstance()
	{
		if(instance==null)
			instance=new GState();
		return instance;
	}
	public void msg(String state)
	{
		if(state.equalsIgnoreCase("ON"))
			System.out.println("State on");
		else
			System.out.println("State Off");
	}
}