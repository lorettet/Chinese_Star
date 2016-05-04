/**
 * A tray of Chinese Checker
 * */
public class Tray {
	
	/**
	 * A table of the different areas
	 * [Number of the area][Position]
	 */
	private final static Position[][] PLINTHS_BY_AREA;
	
	static
	{
		PLINTHS_BY_AREA = new Position[7][];
		
		PLINTHS_BY_AREA[0] = new Position[61];
		int index = 0;
		for(int i=4;i<=8;i++) PLINTHS_BY_AREA[0][index++] = new Position(i,4);
		for(int i=4;i<=9;i++) PLINTHS_BY_AREA[0][index++] = new Position(i,5);
		for(int i=4;i<=10;i++) PLINTHS_BY_AREA[0][index++] = new Position(i,6);
		for(int i=4;i<=11;i++) PLINTHS_BY_AREA[0][index++] = new Position(i,7);
		for(int i=4;i<=12;i++) PLINTHS_BY_AREA[0][index++] = new Position(i,8);
		for(int i=5;i<=12;i++) PLINTHS_BY_AREA[0][index++] = new Position(i,9);
		for(int i=6;i<=12;i++) PLINTHS_BY_AREA[0][index++] = new Position(i,10);
		for(int i=7;i<=12;i++) PLINTHS_BY_AREA[0][index++] = new Position(i,11);
		for(int i=8;i<=12;i++) PLINTHS_BY_AREA[0][index++] = new Position(i,12);
		
		PLINTHS_BY_AREA[1] = new Position[10];
		index = 0;
		for(int i=0;i<=3;i++) PLINTHS_BY_AREA[1][index++] = new Position(i,4);
		for(int i=1;i<=3;i++) PLINTHS_BY_AREA[1][index++] = new Position(i,5);
		for(int i=2;i<=3;i++) PLINTHS_BY_AREA[1][index++] = new Position(i,6);
		PLINTHS_BY_AREA[1][index++] = new Position(3,7);
		
		PLINTHS_BY_AREA[2] = new Position[10];
		index = 0;
		PLINTHS_BY_AREA[2][index++] = new Position(4,9);
		for(int i=4;i<=5;i++) PLINTHS_BY_AREA[2][index++] = new Position(i,10);
		for(int i=4;i<=6;i++) PLINTHS_BY_AREA[2][index++] = new Position(i,11);
		for(int i=4;i<=7;i++) PLINTHS_BY_AREA[2][index++] = new Position(i,12);
		
		PLINTHS_BY_AREA[3] = new Position[10];
		index = 0;
		for(int i=9;i<=12;i++) PLINTHS_BY_AREA[3][index++] = new Position(i,13);
		for(int i=10;i<=12;i++) PLINTHS_BY_AREA[3][index++] = new Position(i,14);
		for(int i=11;i<=12;i++) PLINTHS_BY_AREA[3][index++] = new Position(i,15);
		PLINTHS_BY_AREA[3][index++] = new Position(12,16);
		
		PLINTHS_BY_AREA[4] = new Position[10];
		index = 0;
		PLINTHS_BY_AREA[4][index++] = new Position(13,9);
		for(int i=13;i<=14;i++)  PLINTHS_BY_AREA[4][index++] = new Position(i,10);
		for(int i=13;i<=15;i++)  PLINTHS_BY_AREA[4][index++] = new Position(i,11);
		for(int i=13;i<=16;i++)  PLINTHS_BY_AREA[4][index++] = new Position(i,12);
		
		PLINTHS_BY_AREA[5] = new Position[10];
		index = 0;
		for(int i=9;i<=12;i++) PLINTHS_BY_AREA[5][index++] = new Position(i,4);
		for(int i=10;i<=12;i++) PLINTHS_BY_AREA[5][index++] = new Position(i,5);
		for(int i=11;i<=12;i++) PLINTHS_BY_AREA[5][index++] = new Position(i,6);
		PLINTHS_BY_AREA[5][index++] = new Position(12,7);
		
		PLINTHS_BY_AREA[6] = new Position[10];
		index = 0;
		PLINTHS_BY_AREA[6][index++] = new Position(4,0);
		for(int i=4;i<=5;i++) PLINTHS_BY_AREA[6][index++] = new Position(i,1);
		for(int i=4;i<=6;i++) PLINTHS_BY_AREA[6][index++] = new Position(i,2);
		for(int i=4;i<=7;i++) PLINTHS_BY_AREA[6][index++] = new Position(i,3);
	}
			
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
	
	// TODO(done) write comment
	/**
	 * Table of integer named tray
	 * represents the tray
	 */
	private PlinthType[][] tray;

	
	
	
	// TODO(done) fix comment (ask for advice)
	// TODO(done) fix implementation (ask for advice)
	/**
	 * Create a new tray based on a the number of player with all marbles set and ready to play by these players
	 * @param nbrPlayers the number of player expected
	 * @throws UnexpectedNumberOfPlayerException When number of player isn't expected
	 * */
	public Tray(int nbrPlayers) throws UnexpectedNumberOfPlayerException{
		
		this.tray = new PlinthType[DEFAULT_NUMBER_OF_ROWS][DEFAULT_NUMBER_OF_COLUMNS];
		
		if (!(nbrPlayers <= 4 && nbrPlayers >= MIN_PLAYER && nbrPlayers == MAX_PLAYER))
		{
			throw new UnexpectedNumberOfPlayerException();
		}
		
		this.setNonExistentPlinth();
		plinthFiller(0, PlinthType.EMPTY_PLINTH);
		
		if (nbrPlayers==2)
		{

			//set plinth of player one
			plinthFiller(1, PlinthType.PLINTH1);
			plinthFiller(4, PlinthType.PLINTH2);
		}
			
			
		if (nbrPlayers==3){
			
			plinthFiller(1, PlinthType.PLINTH1);
			plinthFiller(2, PlinthType.EMPTY_PLINTH);
			plinthFiller(3, PlinthType.PLINTH2);
			plinthFiller(4, PlinthType.EMPTY_PLINTH);
			plinthFiller(5, PlinthType.PLINTH3);
			plinthFiller(6, PlinthType.EMPTY_PLINTH);
		}
		
		if (nbrPlayers==4){
			plinthFiller(2, PlinthType.PLINTH1);
			plinthFiller(3, PlinthType.PLINTH2);
			plinthFiller(5, PlinthType.PLINTH3);
			plinthFiller(6, PlinthType.PLINTH4);
		}
		
		if (nbrPlayers==6){
			plinthFiller(1, PlinthType.PLINTH1);
			plinthFiller(2, PlinthType.PLINTH2);
			plinthFiller(3, PlinthType.PLINTH3);
			plinthFiller(4, PlinthType.PLINTH4);
			plinthFiller(5, PlinthType.PLINTH5);
			plinthFiller(6, PlinthType.PLINTH6);
		}
	}
	
	/**
	 * Set a tray full of NON_EXISTENT_PLINTH
	 * @return void
	 */
	private void setNonExistentPlinth()
	{
		for(int i=0; i>DEFAULT_NUMBER_OF_ROWS; i++){
			for(int j=0; j>DEFAULT_NUMBER_OF_COLUMNS; j++)
			{
			this.tray[i][j]=PlinthType.NON_EXISTENT_PLINTH;
			}
		}
	}
	
	/**
	 * Set a field full of PLinthType
	 * @param int area the index of the area
	 * @param int value
	 */
	private void plinthFiller(int field, PlinthType value){ 
		for (int index = 0; index<PLINTHS_BY_AREA[field].length; index++){
			this.tray[PLINTHS_BY_AREA[field][index].getI()][PLINTHS_BY_AREA[field][index].getJ()] = value;
		}
	}
	
	/**
	 * Indicate if the game is finished or not
	 * @return int 0 if the game is not finished yet or the number the winner  
	 * @throws InvalidParameterPlayerException 
	 */

	public Player GameWonTest(int numberPlayers, Player currentPlayer) throws InvalidParameterPlayerException
	{
			// TODO edit this method 
		int numberCurrentPlayer = 0;
		PlinthType PlinthToWin;
		switch(numberPlayers){
		case 2:
			switch(currentPlayer){
			case PLAYER1: 	numberCurrentPlayer = 1;
							PlinthToWin = PlinthType.PLINTH4;
			case PLAYER2: 	numberCurrentPlayer = 2;
							PlinthToWin = PlinthType.PLINTH1;
			default: throw new InvalidParameterPlayerException();
			}
		case 3:
			switch(currentPlayer){
			case PLAYER1: 	numberCurrentPlayer = 1;
							PlinthToWin = PlinthType.PLINTH4;
			case PLAYER2: 	numberCurrentPlayer = 2;
							PlinthToWin = PlinthType.PLINTH6;
			case PLAYER3: 	numberCurrentPlayer = 3;
							PlinthToWin = PlinthType.PLINTH2;
			default: throw new InvalidParameterPlayerException();
			}
		case 4:
			switch(currentPlayer){
			case PLAYER1: 	numberCurrentPlayer = 1;
							PlinthToWin = PlinthType.PLINTH5;
			case PLAYER2: 	numberCurrentPlayer = 2;
							PlinthToWin = PlinthType.PLINTH6;
			case PLAYER3: 	numberCurrentPlayer = 3;
							PlinthToWin = PlinthType.PLINTH2;
			case PLAYER4: 	numberCurrentPlayer = 4;
							PlinthToWin = PlinthType.PLINTH3;
			default: throw new InvalidParameterPlayerException();
			}
		case 6:
		}
		for (int index = 0; index<PLINTHS_BY_AREA[numberCurrentPlayer].length; index++){
			
		}
		return Player.PLAYER0;
				
	}
				/**
				 * TODO 
				 * @param nbrPlayers
				 * @param currentPlayer
				 * @return
				 */
				public int NextPlayer(int nbrPlayers, int currentPlayer)
				// TODO edit this method
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

