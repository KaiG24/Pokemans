package pokemonController;


import PokemanModel.*;
import pokemonFrame.PokemanFrame;

import java.util.List;
import java.util.ArrayList;

public class PokemanController
{
	private List<Pokeman> pokedex;
	private PokemanFrame appFrame;
	
	public PokemanController()
	{
		pokedex = new ArrayList<Pokeman>();
		buildPokedex();
		
		appFrame = new PokemanFrame(this);
	}

	private void buildPokedex()
	{
		pokedex.add(new Dialga());
		pokedex.add(new Mewtwo());
		pokedex.add(new Rayquaza());
	}
	

}
