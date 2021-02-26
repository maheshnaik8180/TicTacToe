import java.util.Scanner;

public class tictactoe
{

public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		char[] board = boardDesign();
		System.out.println(board);
		System.out.println("player chose X or O");
		char player = sc.next().charAt(0);

		char computer = chooseLetter(player);
		System.out.println("computer"+computer);

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

	public static char chooseLetter(char player)
{
		if ( Character.toLowerCase(player) == 'x')
		{
				char computer = '0';
				return computer;
		}

		else
		{
			char computer = 'X';
			return computer;
		}

  }


}

