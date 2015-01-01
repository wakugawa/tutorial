package sample;

public class Sample92 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sample92 app = new Sample92();
        System.out.println("FakeDice");
        app.rolls(new FakeDice());
        System.out.println("RealDice");
        app.rolls(new RealDice());
	}
    
	 public void rolls(DiceIF dice) {
	        for (int i=0 ; i<6 ; i++) {
	            System.out.println(dice.roll());
	        }
	 }
}
