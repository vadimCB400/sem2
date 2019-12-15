package checkerGame.jakethurman.components.factories;

import checkerGame.jakethurman.components.SafeNode;
import checkerGame.jakethurman.foundation.Disposable;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;

import java.util.ArrayList;


/* 
 * Helper class for a generating lists 
 */
public class ListViewFactory implements Disposable {
	// Creates a new list view containing the specified values
	public SafeNode create(ArrayList<String> values) {
		// Create the base list view
		ListView<String> lv = new ListView<>();
		
		// Set the items to a wrapped version of the input values
		lv.setItems(FXCollections.observableList(values));
		
		// Return a protected version of the list view node
		return new SafeNode(lv);
	}

	@Override
	public void dispose() {
		//Nothing to dispose
	}
}
