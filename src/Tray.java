import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

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
	
	/**
	 * Table of integer named tray
	 * represents the tray
	 */
	private PlinthType[][] tray;

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

	public boolean GameWonTest(int numberPlayers, Player currentPlayer) throws InvalidParameterPlayerException
	{
			// TODO edit this method 
		int fieldToWin = 0;
		PlinthType PlinthToWin = null;
		switch(numberPlayers){
		case 2:
			switch(currentPlayer){
			case PLAYER1: 	fieldToWin = 4;
							PlinthToWin = PlinthType.PLINTH1;
							break;
			case PLAYER2: 	fieldToWin = 1;
							PlinthToWin = PlinthType.PLINTH2;
							break;
			default: throw new InvalidParameterPlayerException();
			}
		case 3:
			switch(currentPlayer){
			case PLAYER1: 	fieldToWin = 4;
							PlinthToWin = PlinthType.PLINTH1;
							break;
			case PLAYER2: 	fieldToWin = 6;
							PlinthToWin = PlinthType.PLINTH2;
							break;
			case PLAYER3: 	fieldToWin = 2;
							PlinthToWin = PlinthType.PLINTH3;
							break;
			default: throw new InvalidParameterPlayerException();
			}
		case 4:
			switch(currentPlayer){
			case PLAYER1: 	fieldToWin = 5;
							PlinthToWin = PlinthType.PLINTH1;
							break;
			case PLAYER2: 	fieldToWin = 6;
							PlinthToWin = PlinthType.PLINTH2;
							break;
			case PLAYER3: 	fieldToWin = 2;
							PlinthToWin = PlinthType.PLINTH3;
							break;
			case PLAYER4: 	fieldToWin = 3;
							PlinthToWin = PlinthType.PLINTH4;
							break;
			default: throw new InvalidParameterPlayerException();
			}
		case 6:
			switch(currentPlayer){
			case PLAYER1: 	fieldToWin = 4;
							PlinthToWin = PlinthType.PLINTH1;
							break;
			case PLAYER2: 	fieldToWin = 5;
							PlinthToWin = PlinthType.PLINTH2;
							break;
			case PLAYER3: 	fieldToWin = 6;
							PlinthToWin = PlinthType.PLINTH3;
							break;
			case PLAYER4: 	fieldToWin = 1;
							PlinthToWin = PlinthType.PLINTH4;
							break;
			case PLAYER5: 	fieldToWin = 2;
							PlinthToWin = PlinthType.PLINTH5;
							break;
			case PLAYER6: 	fieldToWin = 3;
							PlinthToWin = PlinthType.PLINTH6;
							break;
			default: throw new InvalidParameterPlayerException();
			}
		}
		for (int index = 0; index<PLINTHS_BY_AREA[fieldToWin].length; index++){
			if(this.tray[PLINTHS_BY_AREA[fieldToWin][index].getI()][PLINTHS_BY_AREA[fieldToWin][index].getJ()] != PlinthToWin)return false;
		}
		return true;	
	}
				/**
				 * Return the next player depending on the number of players & the current player
				 * @param nbrPlayers
				 * @param currentPlayer
				 * @return
				 * @throws InvalidParameterPlayerException 
				 * @throws UnexpectedNumberOfPlayerException 
				 */
	public Player NextPlayer(int numberPlayers, Player currentPlayer) throws InvalidParameterPlayerException, UnexpectedNumberOfPlayerException
				// TODO edit this method
	{
		switch(numberPlayers){
		case 2:
			switch(currentPlayer){
			case PLAYER1: return Player.PLAYER2;
			case PLAYER2: return Player.PLAYER1;
			default: throw new InvalidParameterPlayerException();
			}
		case 3:
			switch(currentPlayer){
			case PLAYER1: return Player.PLAYER2;
			case PLAYER2: return Player.PLAYER3;
			case PLAYER3: return Player.PLAYER1;
			default: throw new InvalidParameterPlayerException();
			}
		case 4:
			switch(currentPlayer){
			case PLAYER1: return Player.PLAYER2;	
			case PLAYER2: return Player.PLAYER3;
			case PLAYER3: return Player.PLAYER4;
			case PLAYER4: return Player.PLAYER1;
			default: throw new InvalidParameterPlayerException();
			}
		case 6:
			switch(currentPlayer){
			case PLAYER1: return Player.PLAYER2;
			case PLAYER2: return Player.PLAYER3;
			case PLAYER3: return Player.PLAYER4;
			case PLAYER4: return Player.PLAYER5;
			case PLAYER5: return Player.PLAYER6;
			case PLAYER6: return Player.PLAYER1;
			default: throw new InvalidParameterPlayerException();
			}
		}
		throw new UnexpectedNumberOfPlayerException();
	}
	
	/**
	 * Ask if the move is allowed
	 * @param initPosition
	 * @param nextPosition
	 * @return boolean
	 */
	public boolean movePawnTest(LinkedList<Position> moveList, Player currentPlayer){
		
		
		Position initPosition = moveList.get(0);
		Position finalPosition = moveList.get(moveList.size()-1);
		
		//Test for a simple move
		if(moveList.size()==2){
			LinkedList<Position> aroundPlinthList = initPosition.plinthRadar();
			LinkedList<Position> aroundEmptyPlinthList = new LinkedList<Position>();
			
			for(Position position : aroundPlinthList){
					if(this.tray[position.getI()][position.getJ()]==PlinthType.EMPTY_PLINTH)
						aroundEmptyPlinthList.add(position);
					}
			if (aroundEmptyPlinthList.contains(finalPosition)) return true;
			
			LinkedList<Position> aroundEmptySecondPlinthList = new LinkedList<Position>();

			/*
			 * Save the second empty neighbor position for each directions depending on the initial position
			 */
			for(Direction direction : Direction.values()){
				Position position = (initPosition.getNeighborPosition(direction)).getNeighborPosition(direction);
				if (this.tray[position.getI()][position.getJ()]==PlinthType.EMPTY_PLINTH)
					aroundEmptySecondPlinthList.add((initPosition.getNeighborPosition(direction)).getNeighborPosition(direction));
			}
			if(aroundEmptySecondPlinthList.contains(finalPosition)) return true;
		}
		//Test for a complex move
		else{
			//TODO hard to do...
		}
		return false;
	}
	

	
	
	/**
	 * Move a pawn
	 * @param currentPlayer
	 * @param initPosition
	 * @param nextPosition
	 */
	public void movePawn(Player currentPlayer, Position initPosition, Position nextPosition) {
		
		switch(currentPlayer){
		case PLAYER1: this.tray[nextPosition.getI()][nextPosition.getJ()] = PlinthType.PLINTH1;break;
		case PLAYER2: this.tray[nextPosition.getI()][nextPosition.getJ()] = PlinthType.PLINTH2;break;
		case PLAYER3: this.tray[nextPosition.getI()][nextPosition.getJ()] = PlinthType.PLINTH3;break;
		case PLAYER4: this.tray[nextPosition.getI()][nextPosition.getJ()] = PlinthType.PLINTH4;break;
		case PLAYER5: this.tray[nextPosition.getI()][nextPosition.getJ()] = PlinthType.PLINTH5;break;
		case PLAYER6: this.tray[nextPosition.getI()][nextPosition.getJ()] = PlinthType.PLINTH6;break;
		}
		this.tray[initPosition.getI()][initPosition.getJ()] = PlinthType.EMPTY_PLINTH;	
	}
}

