import java.util.Scanner;

public class tictactoe
{
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) 	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("player chose X or O");	
		
		char player = sc.next().charAt(0);

		char computer = chooseLetter(player);
		System.out.println("computer"+computer);
		System.out.println("computer\r"+computer);

		System.out.println("Let's Start The Game");
		System.out.println("Current board is :");
		showBoard();


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

				public static void showBoard()
	{
		char[] board = boardDesign();


		System.out.println("         |                    |           ");
		System.out.println(board[7]+"        |          "+board[8]+"         |          "+board[9]);
  		System.out.println("---------|--------------------|-----------");
	    System.out.println("         |                    |           ");
	    System.out.println(board[4]+"        |          "+board[5]+"         |          "+board[6]);
	    System.out.println("---------|--------------------|-----------");
	    System.out.println("         |                    |           ");
	    System.out.println(board[1]+"        |          "+board[2]+"         |          "+board[3]);

	}



  }




