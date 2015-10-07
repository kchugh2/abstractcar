package newpackage;
import java.util.*;
import newpackage.carspecifications;

public class porsche extends carspecifications {
	public porsche()
	{
		System.out.println("Porsche has been created");
	}
	public void transmission()
	{
		System.out.println("The porsche has manual transmission");
	}
	public void topspeed()
	{
		System.out.println("The porsche has a 300kmph topspeed");
		}
	public void colour()
	{
		System.out.println("The Porsche is red");
		}
	public void display()
	{
		transmission();
		topspeed();
		colour();
	}
	

}
