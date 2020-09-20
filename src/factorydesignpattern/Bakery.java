package factorydesignpattern;
/**
 * 
 * Bakery acts as an intermediate between the Cake class and the driver.
 * Bakery determines which cake type was entered by the driver,
 * and then calls that cake's createCake method.
 * @author zacharystthomas
 *
 */
public class Bakery {
	/**
	 * Creates the Cake object, uses this class' createCake 
	 * to select which concrete cake it is.
	 * Then calls the cake's createCake method.
	 * @param type: Given by the driver, represents the type of cake to create.
	 * @return Returns the cake's toString.
	 */
	public Cake orderCake(String type) {
		
		Cake cake = this.createCake(type);
		cake.createCake();
		
		
		
		
		return cake;
		
	}
/**
 * Takes the string given from orderCake, and uses a switch
 * statement to return a new instance of whichever cake
 * correlates to the string. For example,
 * "carrot cake" returns a new instance of the CarrotCake class.
 * @param type: given from orderCake, represents the type of cake to create.
 * @return Returns a new instance of whichever cake was given.
 */
	private Cake createCake(String type) {
		
		
		switch(type) {
		
		case "carrot cake":
			return new CarrotCake();
		case "black forest cake":	
			return new BlackForestCake();
		case "birthday cake":
			return new BirthdayCake();
		default:
			return null;
		
		}
		
	}
	
}
