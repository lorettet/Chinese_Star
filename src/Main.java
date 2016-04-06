/**
 * Main class of the application
 */
public class Main
{
	// TODO main can not throw exceptions (nothing else can catch them)
	/**
	 * application launcher main method of the Main class
	 * @param args command-line arguments (unused)
	 * @throws UnexpectedNumberOfPlayerException when the number of player is different from 2,3,4 or 6 
	 */
	public static void main(String[] args) throws UnexpectedNumberOfPlayerException
	{
		new ChineseCheckerGame(2).play();
	}

}
