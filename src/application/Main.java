package application;

import builders.EletricBassBuilder;
import builders.EletricGuitarBuilder;
import director.Director;
import instruments.EletricBass;
import instruments.EletricGuitar;

public class Main {

	public static void main(String[] args) {
		
		Director director = new Director();
		
		//creating a eletric guitar
		EletricGuitarBuilder rockGuitar = new EletricGuitarBuilder();
		director.constructRockGuitar(rockGuitar);
		
		EletricGuitar eletricGuitar = rockGuitar.getresult();
		System.out.println(eletricGuitar.toString());
		
		//creating a eletric bass
		EletricBassBuilder metalBass = new EletricBassBuilder();
		director.constructMetalBass(metalBass);
		
		EletricBass eletricBass = metalBass.getresult();
		System.out.println(eletricBass.toString());

	}

}
