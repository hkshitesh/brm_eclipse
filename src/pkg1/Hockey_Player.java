package pkg1;

public class Hockey_Player extends Player{

	public void CommonDisplay()
	{
		System.out.println("Hockey Player Display");
	}
	public static void main(String[] args) {

		Hockey_Player ob = new Hockey_Player();
		ob.MyDisplay();
		ob.CommonDisplay();

	}

}
