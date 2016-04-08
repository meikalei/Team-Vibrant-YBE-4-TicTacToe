public class Board {
	public static void main (String[] args) {
	
		String[] array = new String[10]; //board of characters
		
		for(int i = 0; i < 10; i++) {
			array[i] = ".";
		}
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		Exercise exer = new Exercise(array, p1, p2);
		
		/*while() { //while best of is not yet reached, game will go on
		
		}*/
	
	}

}
