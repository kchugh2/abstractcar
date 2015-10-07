package newpackage;
import newpackage.ford;
import newpackage.mazda;
import newpackage.porsche;


public class abstractpracticemain {
	public static void main(String[] args)
	{
		porsche cayman = new porsche();
		mazda miata = new mazda();
		ford windstar = new ford();
		cayman.display();
		miata.display();
		windstar.display();
		
	}

}
