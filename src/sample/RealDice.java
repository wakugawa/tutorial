package sample;

public class RealDice implements DiceIF {
 java.util.Random r = new java.util.Random();
	    int maxNum = 6;
	
	
	public int roll() {
		// TODO 自動生成されたメソッド・スタブ
		return r.nextInt(maxNum) + 1;
	}

}
