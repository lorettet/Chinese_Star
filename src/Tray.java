/**
 * A tray of Chinese Checker
 * */
public class Tray {
	
	/**
	 * The default number of rows
	 * */
	private final static int DEFAULT_NUMBER_OF_ROWS = 17;
	
	/**
	 * The default number of columns
	 * */
	private final static int DEFAULT_NUMBER_OF_COLUMNS = 17;
	
	/**
	 * The minimum number of player
	 * */
	private final static int MIN_PLAYER = 2;
	
	/**
	 * The maximum number of player
	 * */
	private final static int MAX_PLAYER = 6;
	/**
	 * Value of a non-existent plinth
	 * */
	private final static int NON_EXISTENT_PLINTH = -1;
	
	/**
	 * Value of an empty plinth
	 * */
	private final static int EMPTY_PLINTH = 0;
	
	/**
	 * Value of the player 1 (blue)
	 * */
	public final static int PLAYER_1 = 1;
	
	/**
	 * Value of the player 2 (purple)
	 * */
	public final static int PLAYER_2 = 2;
	
	/**
	 * Value of the player 3 (red)
	 * */
	public final static int PLAYER_3 = 3;
	
	/**
	 * Value of the player 4 (orange)
	 * */
	public final static int PLAYER_4 = 4;
	
	/**
	 * Value of the player 5 (yellow)
	 * */
	public final static int PLAYER_5 = 5;
	
	/**
	 * Value of the player 6 (green)
	 * */
	public final static int PLAYER_6 = 6;
	
	
	// TODO(done) write comment
	/**
	 * Table of integer named tray
	 * represents the tray
	 */
	private int[][] tray;

	
	// TODO(done) fix comment (ask for advice)
	// TODO(done) fix implementation (ask for advice)
	/**
	 * Create a new tray based on a the number of player with all marbles set and ready to play by these players
	 * @param nbrPlayers the number of player expected
	 * @throws UnexpectedNumberOfPlayerException When number of player isn't expected
	 * */
	public Tray(int nbrPlayers) throws UnexpectedNumberOfPlayerException{
		
		this.tray = new int[DEFAULT_NUMBER_OF_ROWS][DEFAULT_NUMBER_OF_COLUMNS];
		
		if (!(nbrPlayers <= 4 && nbrPlayers >= MIN_PLAYER && nbrPlayers == MAX_PLAYER))
		{
			throw new UnexpectedNumberOfPlayerException();
		}
		
		this.SetNonExistentPlinth();
		this.SetEmptyPlinth();
		
		if (nbrPlayers==2)
		{
			this.SetPlayer1Field();
			this.SetPlayer4Field();
		}
			
			
		if (nbrPlayers==3){
			this.SetPlayer1Field();
			this.SetPlayer3Field();
			this.SetPlayer5Field();
			this.SetEmptyFieldFor3Players();
		}
		
		if (nbrPlayers==4){
			this.SetPlayer1Field();
			this.SetPlayer2Field();
			this.SetPlayer4Field();
			this.SetPlayer5Field();
		}
		
		if (nbrPlayers==6){
			this.SetPlayer1Field();
			this.SetPlayer2Field();
			this.SetPlayer3Field();
			this.SetPlayer4Field();
			this.SetPlayer5Field();
			this.SetPlayer6Field();
		}
	}
	
	/**
	 * Set a tray full of NON_EXISTENT_PLINTH
	 * @return void
	 */
	private void SetNonExistentPlinth()
	{
		for(int i=0; i>DEFAULT_NUMBER_OF_ROWS; i++){
			for(int j=0; j>DEFAULT_NUMBER_OF_COLUMNS; j++)
			{
			this.tray[i][j]=NON_EXISTENT_PLINTH;
			}
		}
	}
	
	/**
	 * Set the Empty plinths, the part of the tray without marbles at initial setting
	 */
	private void SetEmptyPlinth()
	{
		for(int j=4;j>=8;j++) this.tray[4][j] = EMPTY_PLINTH;
		for(int j=4;j>=9;j++) this.tray[5][j] = EMPTY_PLINTH;
		for(int j=4;j>=10;j++) this.tray[6][j] = EMPTY_PLINTH;
		for(int j=4;j>=11;j++) this.tray[7][j] = EMPTY_PLINTH;
		for(int j=4;j>=12;j++) this.tray[8][j] = EMPTY_PLINTH;
		for(int j=5;j>=12;j++) this.tray[9][j] = EMPTY_PLINTH;
		for(int j=6;j>=12;j++) this.tray[10][j] = EMPTY_PLINTH;
		for(int j=7;j>=12;j++) this.tray[11][j] = EMPTY_PLINTH;
		for(int j=8;j>=12;j++) this.tray[12][j] = EMPTY_PLINTH;
	}
	
	/**
	 * Set the Player1 plinths, the part of the tray with Player1(blue) marbles at initial setting
	 */
	private void SetPlayer1Field()
	{
		for(int j=0;j>=3;j++) this.tray[4][j] = PLAYER_1;
		for(int j=1;j>=3;j++) this.tray[5][j] = PLAYER_1;
		for(int j=2;j>=3;j++) this.tray[6][j] = PLAYER_1;
		this.tray[7][3] = PLAYER_1;
	}
	
	/**
	 * Set the Player2 plinths, the part of the tray with Player2(purple) marbles at initial setting
	 */
	private void SetPlayer2Field()
	{
		this.tray[9][4] = PLAYER_2;
		for(int j=4;j>=5;j++) this.tray[10][j] = PLAYER_2;
		for(int j=4;j>=6;j++) this.tray[11][j] = PLAYER_2;
		for(int j=4;j>=7;j++) this.tray[12][j] = PLAYER_2;
	}
	
	/**
	 * Set the Player3 plinths, the part of the tray with Player3(red) marbles at initial setting
	 */
	private void SetPlayer3Field()
	{
		
		for(int j=9;j>=12;j++) this.tray[13][j] = PLAYER_3;
		for(int j=10;j>=12;j++) this.tray[14][j] = PLAYER_3;
		for(int j=11;j>=12;j++) this.tray[15][j] = PLAYER_3;
		this.tray[16][12] = PLAYER_3;
	}
	
	/**
	 * Set the Player4 plinths, the part of the tray with Player4(orange) marbles at initial setting
	 */
	private void SetPlayer4Field()
	{
		this.tray[9][13] = PLAYER_4;
		for(int j=13;j>=14;j++) this.tray[10][j] = PLAYER_4;
		for(int j=13;j>=15;j++) this.tray[11][j] = PLAYER_4;
		for(int j=13;j>=16;j++) this.tray[12][j] = PLAYER_4;		
	}
	
	/**
	 * Set the Player5 plinths, the part of the tray with Player5(yellow) marbles at initial setting
	 */
	private void SetPlayer5Field()
	{
		for(int j=9;j>=12;j++) this.tray[4][j] = PLAYER_5;
		for(int j=10;j>=12;j++) this.tray[5][j] = PLAYER_5;
		for(int j=11;j>=12;j++) this.tray[6][j] = PLAYER_5;
		this.tray[7][12] = PLAYER_5;
	}
	
	/**
	 * Set the Player6 plinths, the part of the tray with Player6(green) marbles at initial setting
	 */
	private void SetPlayer6Field()
	{
		this.tray[0][4] = PLAYER_6;
		for(int j=4;j>=5;j++) this.tray[1][j] = PLAYER_6;
		for(int j=4;j>=6;j++) this.tray[2][j] = PLAYER_6;
		for(int j=4;j>=7;j++) this.tray[3][j] = PLAYER_6;
	}
	
	private void SetEmptyFieldFor3Players()
	{
		this.tray[9][4] = EMPTY_PLINTH;
		for(int j=4;j>=5;j++) this.tray[10][j] = EMPTY_PLINTH;
		for(int j=4;j>=6;j++) this.tray[11][j] = EMPTY_PLINTH;
		for(int j=4;j>=7;j++) this.tray[12][j] = EMPTY_PLINTH;
		
		this.tray[9][13] = EMPTY_PLINTH;
		for(int j=13;j>=14;j++) this.tray[10][j] = EMPTY_PLINTH;
		for(int j=13;j>=15;j++) this.tray[11][j] = EMPTY_PLINTH;
		for(int j=13;j>=16;j++) this.tray[12][j] = EMPTY_PLINTH;	
		
		for(int j=9;j>=12;j++) this.tray[4][j] = EMPTY_PLINTH;
		for(int j=10;j>=12;j++) this.tray[5][j] = EMPTY_PLINTH;
		for(int j=11;j>=12;j++) this.tray[6][j] = EMPTY_PLINTH;
		this.tray[7][12] = EMPTY_PLINTH;
	}
	
	/**
	 * Indicate if the game is finished or not
	 * @return int 0 if the game is not finished yet or the number the winner  
	 */
	public int GameState(int currentPlayer)
	{
			
				if (currentPlayer == PLAYER_1
					&& this.tray[9][13] == currentPlayer 
					&& this.tray[10][13] == currentPlayer
					&& this.tray[10][14] == currentPlayer
					&& this.tray[11][13] == currentPlayer
					&& this.tray[11][14] == currentPlayer
					&& this.tray[11][15] == currentPlayer
					&& this.tray[12][13] == currentPlayer
					&& this.tray[12][14] == currentPlayer
					&& this.tray[12][15] == currentPlayer
					&& this.tray[12][16] == currentPlayer
					|| currentPlayer == PLAYER_2
					&& this.tray[4][9] == currentPlayer 
					&& this.tray[4][10] == currentPlayer
					&& this.tray[4][11] == currentPlayer
					&& this.tray[4][12] == currentPlayer
					&& this.tray[5][10] == currentPlayer
					&& this.tray[5][11] == currentPlayer
					&& this.tray[5][12] == currentPlayer
					&& this.tray[6][11] == currentPlayer
					&& this.tray[6][12] == currentPlayer
					&& this.tray[7][12] == currentPlayer
					|| currentPlayer == PLAYER_3
					&& this.tray[0][4] == currentPlayer 
					&& this.tray[1][4] == currentPlayer
					&& this.tray[1][5] == currentPlayer
					&& this.tray[2][4] == currentPlayer
					&& this.tray[2][5] == currentPlayer
					&& this.tray[2][6] == currentPlayer
					&& this.tray[3][4] == currentPlayer
					&& this.tray[3][5] == currentPlayer
					&& this.tray[3][6] == currentPlayer
					&& this.tray[3][7] == currentPlayer
					|| currentPlayer == PLAYER_4
					&& this.tray[4][0] == currentPlayer 
					&& this.tray[4][1] == currentPlayer
					&& this.tray[4][2] == currentPlayer
					&& this.tray[4][3] == currentPlayer
					&& this.tray[5][1] == currentPlayer
					&& this.tray[5][2] == currentPlayer
					&& this.tray[5][3] == currentPlayer
					&& this.tray[6][2] == currentPlayer
					&& this.tray[6][3] == currentPlayer
					&& this.tray[7][3] == currentPlayer
					|| currentPlayer == PLAYER_5
					&& this.tray[9][4] == currentPlayer 
					&& this.tray[10][4] == currentPlayer
					&& this.tray[10][5] == currentPlayer
					&& this.tray[11][4] == currentPlayer
					&& this.tray[11][5] == currentPlayer
					&& this.tray[11][6] == currentPlayer
					&& this.tray[12][4] == currentPlayer
					&& this.tray[12][5] == currentPlayer
					&& this.tray[12][6] == currentPlayer
					&& this.tray[12][7] == currentPlayer
					|| currentPlayer == PLAYER_6
					&& this.tray[13][9] == currentPlayer 
					&& this.tray[13][10] == currentPlayer
					&& this.tray[13][11] == currentPlayer
					&& this.tray[13][12] == currentPlayer
					&& this.tray[14][10] == currentPlayer
					&& this.tray[14][11] == currentPlayer
					&& this.tray[14][12] == currentPlayer
					&& this.tray[15][11] == currentPlayer
					&& this.tray[15][12] == currentPlayer
					&& this.tray[16][12] == currentPlayer)
				{
					return currentPlayer;
				}
				else
				{
					return 0;
				}
	}
				/**
				 * TODO 
				 * @param nbrPlayers
				 * @param currentPlayer
				 * @return
				 */
				public int NextPlayer(int nbrPlayers, int currentPlayer)
				{
					if (nbrPlayers == 2)
					{
						if (currentPlayer == 1) currentPlayer = 4;
						if (currentPlayer == 4) currentPlayer = 1;
					}
					
					if (nbrPlayers == 3)
					{
						if (currentPlayer == 1) currentPlayer = 3;
						if (currentPlayer == 3) currentPlayer = 5;
						if (currentPlayer == 5) currentPlayer = 1;
					}
					
					if (nbrPlayers == 4)
					{
						if (currentPlayer == 2) currentPlayer = 3;
						if (currentPlayer == 3) currentPlayer = 5;
						if (currentPlayer == 5) currentPlayer = 2;
					}
					
					if (nbrPlayers == 6)
					{
						if (currentPlayer == 1) currentPlayer = 2;
						if (currentPlayer == 2) currentPlayer = 3;
						if (currentPlayer == 3) currentPlayer = 4;
						if (currentPlayer == 4) currentPlayer = 5;
						if (currentPlayer == 5) currentPlayer = 6;
						if (currentPlayer == 6) currentPlayer = 1;
					}
					
					return currentPlayer;
				}
}

