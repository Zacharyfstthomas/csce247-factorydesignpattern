package factorydesignpattern;
/**
 * 
 * BirthdayCake is one of the three concrete children of the Cake class.
 * They provide values for the parent's variables when intialized.
 * @author zacharystthomas
 *
 */
public class BirthdayCake extends Cake{

	/**
	 * Constructor, initializes all variables of the parent. 
	 */
	public BirthdayCake() {
		
		super.name = "Birthday Cake";
		super.price = 109.99;
		super.numLayers = 1;
		super.shape = Shape.SHEET;
		super.flavor = "Funfetti";
		super.icing = "Vanilla";
		super.decorations.add("Sprinkles");
		super.decorations.add("Candy Flowers");
		super.decorations.add("Icing Writing");
		
	}
}
