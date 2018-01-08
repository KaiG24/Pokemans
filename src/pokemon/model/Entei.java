package pokemon.model;

public class Entei extends Pokemon implements Fire
{
	public Entei(int number, String name)
	{
		super(number, name);
	}
	
	public String magmastorm(boolean lava)
	{
		if(lava = true)
		{
			return "can you feel the heat";
		}
		else
		{
			return "you just got burned";
		}
	}
	
	public String flamethrower(boolean flames)
	{
		if(flames = true)
		{
			return "feel the flames";
		}
		else 
		{
			return "get roasted";
		}
	}
	public String firefang(boolean heat)
	{
		if(heat = true)
		{
			return "can't handle the heat";
		}
		else
		{
			return  "if you can't handle the flames, get out of the kitchen"; 
		}
	}

	@Override
	public String magmaStorm()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String flamethrower()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fireFang()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
