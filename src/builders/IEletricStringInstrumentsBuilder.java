package builders;

import customEletricStringInstruments.Color;
import customEletricStringInstruments.EletricStringInstrumentsType;
import customEletricStringInstruments.Pickups;
import customEletricStringInstruments.Shape;

public interface IEletricStringInstrumentsBuilder {

	 void setEletricStringInstrumentsType (EletricStringInstrumentsType type);
	 void setStrings (int strings);
	 void setPickups (Pickups pickups);
	 void setColor (Color color);
	 void setShape (Shape shape);
}
