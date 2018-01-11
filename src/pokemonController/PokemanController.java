package pokemonController;


import pokemon.model.Dialga;
import pokemon.model.Mewtwo;
import pokemon.model.PokemanModel;
import pokemon.model.Rayquaza;
import pokemonFrame.PokemanFrame;

import java.util.List;
import java.awt.Component;
import java.util.ArrayList;

public class PokemanController
{
	private List<PokemanModel> pokedex;
	private PokemanFrame appFrame;
	
	public PokemanController()
	{
		pokedex = new ArrayList<PokemanModel>();
		buildPokedex();
		
		appFrame = new PokemanFrame(this);
	}

	private void buildPokedex()
	{
		pokedex.add(new Dialga());
		pokedex.add(new Mewtwo());
		pokedex.add(new Rayquaza());
	}

	public Component getPokedex()
	{
		// TODO Auto-generated method stub
		return null;
	}
	

}
