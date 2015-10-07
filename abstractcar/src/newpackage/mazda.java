package newpackage;
import newpackage.carspecifications;
public class mazda extends carspecifications{
	public mazda()
	{
		System.out.println("\nMazda has been created");
	}
	public void transmission()
	{
		System.out.println("\nThe mazda has Automatic transmission");
	}
	public void topspeed()
	{
		System.out.println("\nThe mazda has a 30kmph topspeed");
		}
	public void colour()
	{
		System.out.println("\nThe mazda is yellow");
		}
	public void display()
	{
		transmission();
		topspeed();
		colour();
	}
	

}


