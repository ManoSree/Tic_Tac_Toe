
public abstract class Player {
	
	String name;
	char mark;
	
	abstract void makeMove();
	
	boolean isVaildMove(int row , int col)
	{
		if(row>=0 && row<=2 && col>=0 && col<=2) 
		{
			if(Tic_Tac_Toe.board[row][col]==' ') {
				return true;
			}
		}
		return false;
	}

}
