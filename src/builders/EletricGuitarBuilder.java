package builders;

import customEletricStringInstruments.Color;
import customEletricStringInstruments.EletricStringInstrumentsType;
import customEletricStringInstruments.Pickups;
import customEletricStringInstruments.Shape;
import instruments.EletricGuitar;

public class EletricGuitarBuilder implements IEletricStringInstrumentsBuilder {

	private EletricStringInstrumentsType type;
	private int strings;
	private Pickups pickups;
	private Color color;
	private Shape shape;
	
	@Override
	public void setEletricStringInstrumentsType(EletricStringInstrumentsType type) {
		this.type = type;
		
	}

	@Override
	public void setStrings(int strings) {
		this.strings = strings;
		
	}

	@Override
	public void setPickups(Pickups pickups) {
		this.pickups = pickups;
		
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
		
	}

	@Override
	public void setShape(Shape shape) {
		this.shape = shape;
		
	}

	public EletricGuitar getresult() {
		return new EletricGuitar(type, strings, pickups, color, shape);
	}


}
