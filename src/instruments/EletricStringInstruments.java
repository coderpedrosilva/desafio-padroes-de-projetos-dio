package instruments;

import customEletricStringInstruments.Color;
import customEletricStringInstruments.EletricStringInstrumentsType;
import customEletricStringInstruments.Pickups;
import customEletricStringInstruments.Shape;

public abstract class EletricStringInstruments {

	private final EletricStringInstrumentsType type;
	private final int strings;
	private final Pickups pickups;
	private final Color color;
	private final Shape shape;
	
	public EletricStringInstruments(
			EletricStringInstrumentsType type, 
			int strings, 
			Pickups pickups, 
			Color color,
			Shape shape) {
		this.type = type;
		this.strings = strings;
		this.pickups = pickups;
		this.color = color;
		this.shape = shape;
	}

	public EletricStringInstrumentsType getType() {
		return type;
	}

	public int getStrings() {
		return strings;
	}

	public Pickups getPickups() {
		return pickups;
	}

	public Color getColor() {
		return color;
	}

	public Shape getShape() {
		return shape;
	}

	@Override
	public String toString() {
		return "***INSTRUMENT*** \n"
				+ "Type = " + type 
				+ ", \nStrings = " + strings 
				+ ", \nPickups = " + pickups 
				+ ", \nColor = "
				+ color 
				+ ", \nShape = " + shape 
				+ "\n";
	}
	
	
}
