package checkerGame.jakethurman.games;

import checkerGame.jakethurman.components.SafeScene;
import checkerGame.jakethurman.games.checkers.components.CheckersRenderer;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.function.Consumer;

/*
 * PROJECT TODOs:
 * 		- Add named high scores
 * 
 */
public class App extends Application {
	
	public static void main(String[] args) {
		launch(args); // Start the application
	}

	@Override
	public void start(Stage primaryStage) {
		// This is a helper function to allow for setting 
		// the scene without passing down the stage
		Consumer<SafeScene> setScene = s -> primaryStage.setScene(s.getUnsafe());
				
		// GameChoiceScene is a scene where 
		// The player can choose between any 
		// passed in renderer to render the game
		new GameChoiceScene(
			new CheckersRenderer(Difficulty.HUMAN)
			//, new jakethurman.games.chess.components.ChessRenderer() // TODO: Finish or remove
		).render(setScene);
		
		// Show the stage!
		primaryStage.show();    	
	}
}