package pkg1;

public class Cricket_Player extends Player {
	
	public void CommonDisplay()
	{
		System.out.println("Cricket Player Display");
	}

	public static void main(String[] args) {

		Cricket_Player ob = new Cricket_Player();
		ob.MyDisplay();
		ob.CommonDisplay();

	}

}
