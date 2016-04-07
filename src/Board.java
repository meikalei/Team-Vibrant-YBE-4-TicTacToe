public class Board {
	public static void main (String[] args) {
	
		String[] array; //board of characters
		int mode;
		
		//input names of players
		
		Exercise exer = new Exercise();
		
		//instantiate those players
		
		//input best of, loops until input is odd
		
		/*while() { //while best of is not yet reached, game will go on
		
		}*/
	
	}
	
	public synchronized void checkBoard(final String[] array, final Player player) { //checks every turn if there's a winner already
		Thread[] checkBoard = new Thread[3];
		
		checkBoard[0] = new Thread() {
			@Override
			public void run() {
				checkBoardRow(array, player);
			}
		};
		
		checkBoard[1] = new Thread() {
			@Override
			public void run() {
				checkBoardColumn(array, player);
			}
		};
		
		checkBoard[2] = new Thread() {
			@Override
			public void run() {
				checkBoardDiagonal(array, player);
			}
		};
		
		for(int i = 0; i < 3; i++) {
			checkBoard[i].start();
		}
	}
	
	public synchronized void checkBoardRow(String[] array, Player player) { //checks every turn if there's a winner already //mode to check whose player's turn
		if(array[1].equals(array[2]) && array[2].equals(array[3])) {
			player.addPoint();
		} else if(array[4].equals(array[5]) && array[5].equals(array[6])) {
			player.addPoint();
		} else if(array[7].equals(array[8]) && array[8].equals(array[9])) {
			player.addPoint();
		}
	}
	
	public synchronized void checkBoardColumn(String[] array, Player player) { //checks every turn if there's a winner already
		if(array[1].equals(array[4]) && array[4].equals(array[7])) {
			player.addPoint();
		} else if(array[2].equals(array[5]) && array[5].equals(array[8])) {
			player.addPoint();
		} else if(array[3].equals(array[6]) && array[6].equals(array[9])) {
			player.addPoint();
		}
	}
	
	public synchronized void checkBoardDiagonal(String[] array, Player player) { //checks every turn if there's a winner already
		if(array[1].equals(array[5]) && array[5].equals(array[9])) {
			player.addPoint();
		} else if(array[3].equals(array[5]) && array[5].equals(array[7])) {
			player.addPoint();
		}
	}
	
	//method for keyListener for each player's turn

}
