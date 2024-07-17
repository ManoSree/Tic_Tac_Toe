
public class LaunchGame {
	
	

	public static void main(String[] args) {
		
		Tic_Tac_Toe t= new Tic_Tac_Toe();
		
		HumanPlayer p1 = new HumanPlayer("Sree" , 'X');
		AIPlayer p2 = new AIPlayer("Sai" , 'O');
		Player cp=p1;
		
		while(true) {
			System.out.println(cp.name + " turn");
			cp.makeMove();
			Tic_Tac_Toe.displayBoard();
			
			if(Tic_Tac_Toe.checkColWin() || Tic_Tac_Toe.checkDigWin() || Tic_Tac_Toe.checkRowWin()) {
				System.out.println(cp.name +" has won!!");
				break;
			}
			else if(Tic_Tac_Toe.checkDraw()) {
				System.out.println("Game is draw");
				break;
			}
			else {
				if(cp == p1) {
					cp = p2;
				}
				else {
					cp = p1;
				}
			}
		}
		

	}

}
