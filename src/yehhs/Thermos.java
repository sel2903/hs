package yehhs;
/**
 * This class is about Thermos:</p>
 * 1)liquid is added
 * 2)liquid is poured
 * @author salina23
 * @version 1.0
 */

public class Thermos {
	float vol;
	String Brand;
	String Liquid;
	/**
	 * This is a constructor for initializing the variables
	 * @param vol-it tells the volume in the thermos
	 * @param Brand- it tells the brand of the thermos 
	 * @param Liquid- it tells the type of liquid the thermos contains
	 */
	Thermos(float vol,String Brand,String Liquid)
	{
		this.vol=vol;
		this.Brand=Brand;
		this.Liquid=Liquid;
	}
	/**
	 * This is  method of adding liquid in the thermos
	 */
	 void addliquid()
	{
		Liquid=Liquid+vol;
	}
	 /**
	  * This method pours the liquid
	  * @return- it returns the liquid value
	  */
	 String pourliquid()
	 {
		 return Liquid;
	 }
	 /**
	  * this method is for displaying thethe liquid details. 
	  */
	 void display()
	 {
		 System.out.println(Liquid);
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
