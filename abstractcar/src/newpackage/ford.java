package newpackage;
import newpackage.carspecifications;
public class ford extends carspecifications{
	public ford()
	{
		System.out.println("\nFord has been created");
	}
	public void transmission()
	{
		System.out.println("\nThe Ford has Automatic transmission");
	}
	public void topspeed()
	{
		System.out.println("\nThe ford has a 3kmph topspeed");
		}
	public void colour()
	{
		System.out.println("\nThe ford is black");
		}
	public void display()
	{
		transmission();
		topspeed();
		colour();
	}
	


}
