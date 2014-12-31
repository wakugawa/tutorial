package sample;

public class FakeDice implements DiceIF {
	 int[] values = new int[] {
		        3, 4, 2, 1, 5, 6
		    };
		    int current = 0;
	 
	public int roll() {
		// TODO 自動生成されたメソッド・スタブ
		 current++;
	        if (current == 6) current = 0;
	        return values[current];
	}

}
