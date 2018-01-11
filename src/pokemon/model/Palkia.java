package pokemon.model;

public class Palkia extends PokemanModel implements Dragon
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
	public String dragonRush(boolean sprint)
	{
		if(sprint = true)
		{
			return "too fast for you";
		}
		else
		{
			return "next time keep up";
		}
	}

	@Override
	public String dragonHammer()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dragonRush()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dragonRage()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
