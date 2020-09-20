package factorydesignpattern;
/**
 * 
 * CarrotCake is one of the three concrete children of the Cake class.
 * They provide values for the parent's variables when intialized.
 * @author zacharystthomas
 *
 */
public class CarrotCake extends Cake{
	/**
	 * Constructor, initializes all variables of the parent. 
	 */
	
	public CarrotCake() {
		
		super.name = "Carrot Cake";
		super.price = 54.99;
		super.numLayers = 2;
		super.shape = Shape.ROUND;
		super.flavor = "Carrot";
		super.icing = "Cream Cheese";
		super.decorations.add("Walnuts");
		super.decorations.add("Candy Carrots");

	}
}
