public class tictactoe
{
public static void main(String[] args) 
	{


		char[] board = boardDesign();
		System.out.println(board);

	}

	public static char[] boardDesign()
	{
		char[] board = new char[10];
		board[0] = ' ';

		for(int i=1; i<10; i++)
		{
			board[i] = ' ';
		}

		return board;
	}
}
