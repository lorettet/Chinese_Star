/**
 * Represent the game mode : the number of player and all parameter which depend on
 * @author lorettet
 */
public enum GameMode {
		
	TWO_PLAYERS_GAME_MODE(2, new Player[] {Player.PLAYER1,Player.PLAYER2}, new PlinthType[] {PlinthType.PLINTH1,PlinthType.PLINTH4},null),
	THREE_PLAYERS_GAME_MODE(3,new Player[]{Player.PLAYER1,Player.PLAYER2, Player.PLAYER3}, new PlinthType[]{PlinthType.PLINTH1,PlinthType.PLINTH3,PlinthType.PLINTH5},new PlinthType[]{PlinthType.PLINTH2,PlinthType.PLINTH4,PlinthType.PLINTH6}),
	FOUR_PLAYERS_GAME_MODE(4,new Player[]{Player.PLAYER1,Player.PLAYER2, Player.PLAYER3, Player.PLAYER4},new PlinthType[]{PlinthType.PLINTH2,PlinthType.PLINTH3,PlinthType.PLINTH5,PlinthType.PLINTH6},null),
	SIX_PLAYERS_GAME_MODE(6,new Player[]{Player.PLAYER1,Player.PLAYER2, Player.PLAYER3, Player.PLAYER4, Player.PLAYER5, Player.PLAYER6},new PlinthType[]{PlinthType.PLINTH1,PlinthType.PLINTH2,PlinthType.PLINTH3,PlinthType.PLINTH4,PlinthType.PLINTH5,PlinthType.PLINTH6,}, null);

	/**
	 * The number of player
	 */
	private int nbrPlayer;
	/**
	 * the different player
	 */
	private Player[] players;
	/**
	 * the different plinth type
	 */
	private PlinthType[] plinthesDependingOnPlayer;
	/**
	 * the zone wich exist but are empty (for 3 player)
	 */
	private PlinthType[] existingPlinth;
	
	/**
	 * AutoConstructor
	 * @param nbrPlayer
	 * @param players
	 * @param plinthes
	 */
	private GameMode(int nbrPlayer, Player[] players, PlinthType[] plinthes, PlinthType[] existingPlinth) {
		this.nbrPlayer = nbrPlayer;
		this.players = players;
		this.plinthesDependingOnPlayer = plinthes;
		this.existingPlinth = existingPlinth;
		
	}

	/**
	 * Get the number of player
	 * @return int
	 */
	public int getNbrPlayer() {
		return this.nbrPlayer;
	}

	/**
	 * Get the player
	 * @return PLayer[]
	 */
	public Player[] getPlayers() {
		return this.players;
	}

	/**
	 * Get the plinth
	 * @return PlinthType[]
	 */
	public PlinthType[] getPlinthes() {
		return this.plinthesDependingOnPlayer;
	}
	
	
	
}
