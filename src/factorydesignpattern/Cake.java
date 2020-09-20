package factorydesignpattern;

import java.util.ArrayList;
/**
 * Cake houses all of the important functions that determine what
 * will be printed to the user concerning the cake's shape, flavor,
 * icing, decorations, price, layers, and its name.
 * Takes information given by the concrete class of the cake instance given by the
 * bakery. 
 * @author zacharystthomas
 */
public abstract class Cake {

	protected String name;
	protected double price;
	protected int numLayers;
	protected ArrayList<String> decorations;
	protected Shape shape;
	protected String flavor;
	protected String icing;
	/**
	 * Constructor. Simply initializes the decorations ArrayList.
	 */
	public Cake() {
		
		decorations = new ArrayList<String>();
	}
	/**
	 * Called by the bakery, utilizes the rest of the methods in the class to print
	 * information about the cake to the user.
	 */
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
		System.out.println("Price: $"+getPrice());
	}
	/**
	 * Called by createCake, uses a switch statement to print out a different line of text
	 * depending on which shape it is.
	 * If it happens to be either a round, square or sheet shape, it will print out different
	 * messages depending whether or not it has multiple layers. 
	 * Utilizes the values of the shape, numLayers, and flavor variables.
	 */
	private void createLayers() {
		switch(this.shape) {
		
		case CUPCAKES:
			System.out.println("Creating "+this.flavor+" cupcakes");
			break;
		case BUNT:
			System.out.println("Creating a "+this.flavor+" bunt cake");
			break;
		case ROUND:
			if(this.numLayers == 1){
				System.out.println("Creating a 1 layer round "+this.flavor+" cake");
				break;
			}else {
				System.out.println("Creating a "+this.numLayers+" layered round "+this.flavor+" cake");
				break;
			}
		case SHEET:
			if(this.numLayers == 1){
				System.out.println("Creating a 1 layer sheet "+this.flavor+" cake");
				break;
			}else {
				System.out.println("Creating a "+this.numLayers+" layered sheet "+this.flavor+" cake");
				break;
			}
		case SQUARE:
			if(this.numLayers == 1){
				System.out.println("Creating a 1 layer square "+this.flavor+" cake");
				break;
			}else {
				System.out.println("Creating a "+this.numLayers+" layered square "+this.flavor+" cake");
				break;
			}
		default:
			System.out.println("Creating a 1 layer round funfetti cake");
			break;
		}
		
		
	}
	/**
	 *Simply prints out one line detailing which icing is used to frost the cake,
	 *using the value of the icing variable. 
	 */
	private void frostCake() {
		System.out.println("Frost cake with "+this.icing+" icing.");
	}
	/**
	 * Loops through each String in the decorations ArrayList
	 * and returns a simple string detailing that the decoration 
	 * is being added.
	 */
	private void addDecorations() {
		for(String decoration: decorations) {
			System.out.println("Adding "+decoration+".");
		}
		
	}
	/**
	 * @return Returns the value of the price variable.
	 */
	public double getPrice() {
		
		return this.price;
	}
	
	
}
