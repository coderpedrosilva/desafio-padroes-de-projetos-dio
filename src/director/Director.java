package director;

import builders.IEletricStringInstrumentsBuilder;
import customEletricStringInstruments.Color;
import customEletricStringInstruments.EletricStringInstrumentsType;
import customEletricStringInstruments.Pickups;
import customEletricStringInstruments.Shape;

public class Director {

	public void constructRockGuitar(IEletricStringInstrumentsBuilder builder) {
		builder.setEletricStringInstrumentsType(EletricStringInstrumentsType.GUITAR);
		builder.setStrings(6);
		builder.setPickups(Pickups.SINGLE_COIL);
		builder.setColor(Color.BLACK);
		builder.setShape(Shape.STRATOCASTER);
	}
	
	public void constructMetalBass(IEletricStringInstrumentsBuilder builder) {
		builder.setEletricStringInstrumentsType(EletricStringInstrumentsType.BASS);
		builder.setStrings(4);
		builder.setPickups(Pickups.HUMBUCKING);
		builder.setColor(Color.RED);
		builder.setShape(Shape.FLYING_V);
	}
	
}
