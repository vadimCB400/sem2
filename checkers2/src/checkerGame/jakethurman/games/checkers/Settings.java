package checkerGame.jakethurman.games.checkers;

import checkerGame.jakethurman.components.SafePaint;
import checkerGame.jakethurman.components.factories.ShapeSettings;
import checkerGame.jakethurman.games.Difficulty;

// All of the checkers specific settings 
public class Settings implements ShapeSettings {
	/*
	 * Board Design Settings
	 */
    private static final int BOARD_SIZE    = 8,
                             SQUARE_SIZE   = 60,
                             NUM_PIECES    = 12,
                             CIRCLE_RADIUS = SQUARE_SIZE/2-6,
                             CIRCLE_BORDER = 2;

    private static final SafePaint SELECTED_COLOR = SafePaint.BLUE;
    
    /*
     * Data Settings
     */
    private static final String SAVE_FILE_LOCATION = "scores.json";
    
    /*
     * User Settings.
     */
	private Difficulty difficulty;
    private int bot_sleep_time = 500; // Basically static - overriden by DEBUGgoToDoubleAISettings
	
	public Settings(Difficulty difficulty) {
		this.difficulty = difficulty;
	}
    
    /*
     * Simple getMethods for easier unit testing in the future. 
     */
	@Override public int getCircleRadius() { return CIRCLE_RADIUS; }
	@Override public int getCircleBorder() { return CIRCLE_BORDER; }
	@Override public int getSquareSize()   { return SQUARE_SIZE;   }
	public int getNumPieces() { return NUM_PIECES; }
	public int getBoardSize() { return BOARD_SIZE; }	
	public SafePaint getSelectColor() { return SELECTED_COLOR; }
	public String getSaveFileLocation() { return SAVE_FILE_LOCATION; }
	public long getBotSleepMS() { return bot_sleep_time; }
	public Difficulty getDifficulty() { return difficulty; }
	
	/*
	 * DEBUG methods
	 */
	/*public void DEBUGgoToDoubleAISettings() {
		this.difficulty = Difficulty.HARD;
		this.bot_sleep_time = 20;
	}*/
	
	/* TODO: Disposable was a mistake... It should probably die altogether, but especially here. */
	@Override public void dispose() { /* Nothing to dispose */ }

	
}
