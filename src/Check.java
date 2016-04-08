public class Check {
	private boolean gotPoint = false;

	public synchronized boolean checkBoard(final String[] array, final Player player) { //checks every turn if there's a winner already
			Thread[] checkBoard = new Thread[3];
		
			checkBoard[0] = new Thread() {
				@Override
				public void run() {
					gotPoint = checkBoardRow(array, player);
				}
			};
		
			checkBoard[1] = new Thread() {
				@Override
				public void run() {
					gotPoint = checkBoardColumn(array, player);
				}
			};
		
			checkBoard[2] = new Thread() {
				@Override
				public void run() {
					gotPoint = checkBoardDiagonal(array, player);
				}
			};
		
			for(int i = 0; i < 3; i++) {
				checkBoard[i].start();
			}
			
			return gotPoint;
			
		}
	
		public synchronized boolean checkBoardRow(String[] array, Player player) { //checks every turn if there's a winner already //mode to check whose player's turn
			if(array[1].equals(array[2]) && array[1].equals(array[3]) && (array[1].equals("X") || array[1].equals("O"))) {
				player.addPoint();
				return true;
			} else if(array[4].equals(array[5]) && array[4].equals(array[6]) && (array[4].equals("X") || array[4].equals("O"))) {
				player.addPoint();
				return true;
			} else if(array[7].equals(array[8]) && array[7].equals(array[9]) && (array[7].equals("X") || array[7].equals("O"))) {
				player.addPoint();
				return true;
			} else return false;
			
		}
	
		public synchronized boolean checkBoardColumn(String[] array, Player player) { //checks every turn if there's a winner already
			if(array[1].equals(array[4]) && array[4].equals(array[7]) && (array[1].equals("X") || array[1].equals("O"))) {
				player.addPoint();
				return true;
			} else if(array[2].equals(array[5]) && array[5].equals(array[8]) && (array[2].equals("X") || array[2].equals("O"))) {
				player.addPoint();
				return true;
			} else if(array[3].equals(array[6]) && array[6].equals(array[9]) && (array[3].equals("X") || array[3].equals("O"))) {
				player.addPoint();
				return true;
			} else return false;
		}
	
		public synchronized boolean checkBoardDiagonal(String[] array, Player player) { //checks every turn if there's a winner already
			if(array[1].equals(array[5]) && array[5].equals(array[9]) && (array[1].equals("X") || array[1].equals("O"))) {
				player.addPoint();
				return true;
			} else if(array[3].equals(array[5]) && array[5].equals(array[7]) && (array[3].equals("X") || array[3].equals("O"))) {
				player.addPoint();
				return true;
			} else return false;
		}
}
