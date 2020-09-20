package factorydesignpattern;
/**
 * 
 * BlackForestCake is one of the three concrete children of the Cake class.
 * They provide values for the parent's variables when intialized.
 * @author zacharystthomas
 *
 */
public class BlackForestCake extends Cake{

	/**
	 * Constructor, initializes all variables of the parent. 
	 */
	public BlackForestCake() {
		
		super.name = "Black Forest Cake";
		super.price = 47.99;
		super.numLayers = 3;
		super.shape = Shape.ROUND;
		super.flavor = "Black Forest";
		super.icing = "Whipped Cream";
		super.decorations.add("Cherries");
		super.decorations.add("Chocolate Flakes");
		super.decorations.add("Whipped Cream");
		
	}
}
