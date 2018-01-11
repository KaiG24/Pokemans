package pokemon.model;

public abstract class PokemanModel
{
	private int healthPoints;
	private int attackPoints;
	private double enhancementModifier;
	protected static int number;
	protected static String name;
	private boolean canEvolve;
	
	public PokemanModel(int number2, String name2)
	{
		// TODO Auto-generated constructor stub
	}

	public void Pokeman (int number, String name)
	{
		this.name = name;
		this.number = number;
	}
	
	public final String[] getPokemonTypes()
	{
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		return pokeTypes;
	}
}
