package pokemon.model;

public class Palkia extends Pokemon implements Dragon
{
	public Palkia(int number, String name)
	{
		super(number, name);
	}
	
	public String dragonHammer(boolean feelthepain)
	{
		if(feelthepain = true)
		{
			return "you will feel pain";
					
		}
		else
		{
			return "get wrecked scrub";
		}
		

	}
	public String dragonRage(boolean rage)
	{
		if(rage = true)
		{
			return "do you feel the rage";
		}
		else
		{
			return "I'm sorry that you got wrecked";
		}
	}
}
