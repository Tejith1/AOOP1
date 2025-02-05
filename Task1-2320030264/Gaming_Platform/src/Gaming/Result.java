package Gaming;

public class Result {
	public Enemies getEnemies(int level)
	{
		if(level==1)
			return new Level1();
		else if(level==2)
			return new level2();
		else
			return null;
	}
}