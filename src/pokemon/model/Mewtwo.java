package pokemon.model;

public class Mewtwo extends Pokemon implements Psychic
{
	public Mewtwo()
	{
		super(1000, "Mewtwo");
		setup();
	}
	
	public Mewtwo(String name)
	{
		super(1000, name);
		setup();
	}
	
	public Mewtwo(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(650);
		this.setEnhancementModifier(.9);
		this.setHealthPoints(300);
	}

	private void setHealthPoints(int i)
	{
		// TODO Auto-generated method stub
		
	}

	private void setEnhancementModifier(double d)
	{
		// TODO Auto-generated method stub
		
	}

	private void setAttackPoints(int i)
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
