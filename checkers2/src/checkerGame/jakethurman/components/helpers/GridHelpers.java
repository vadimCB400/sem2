package checkerGame.jakethurman.components.helpers;

import checkerGame.jakethurman.components.SafeGridPane;
import checkerGame.jakethurman.components.SafePaint;
import checkerGame.jakethurman.components.factories.ShapeFactory;
import checkerGame.jakethurman.foundation.CleanupHandler;
import checkerGame.jakethurman.foundation.Disposable;
import checkerGame.jakethurman.foundation.Point;

/* Simple helper class only used to fill a grid with squares. */
public class GridHelpers implements Disposable {
	/* Dependencies */
	private final ShapeFactory shapeFactory;
	private final CleanupHandler cleanup;
	
	//C'tor
	public GridHelpers(final ShapeFactory shapeFactory) {
		this.shapeFactory = shapeFactory;
		this.cleanup = new CleanupHandler(shapeFactory);
	}
	
	// Fills a grid with squares.
	public void fillGridWithSquares(final SafeGridPane parentNode) {
		final SafePaint[] squareColors = new SafePaint[] {SafePaint.WHITE, SafePaint.BLACK};
		
		int rows = parentNode.getRowCount();
		int columns = parentNode.getColumnCount();
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				// Add a rectangle at every cell of alternating White-Black coloring.
				parentNode.add(shapeFactory.createRect(squareColors[(row+col)%2]), new Point(col, row));
			}
		}
	}
	
	@Override
	public void dispose() {
		cleanup.dispose();
	}
}
