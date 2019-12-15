package checkerGame.jakethurman.components;

/*
 * Helper class for position nodes on a border pane (with chaining!)
 */
public class PositionedNodes implements ReadOnlyPositionedNodes {
	// Each of current the nodes
	private SafeNode center;
	private SafeNode bottom;
	private SafeNode top;
	private SafeNode left;
	private SafeNode right;
	
	public PositionedNodes setCenter(final SafeNode n) {
		this.center = n;
		return this;
	}
	
	@Override
	public SafeNode getCenter() {
		return center;
	}
	
	public PositionedNodes setBottom(final SafeNode n) {
		this.bottom = n;
		return this;
	}
	
	@Override
	public SafeNode getBottom() {
		return bottom;
	}

	public PositionedNodes setTop(final SafeNode n) {
		this.top = n;
		return this;
	}
	
	@Override
	public SafeNode getTop() {
		return top;
	}

	public PositionedNodes setLeft(final SafeNode n) {
		this.left = n;
		return this;
	}
	
	@Override
	public SafeNode getLeft() {
		return left;
	}

	public PositionedNodes setRight(final SafeNode n) {
		this.right = n;
		return this;
	}
	
	@Override
	public SafeNode getRight() {
		return right;
	}
	
	@Override
	public void dispose() {
		this.center = null;
		this.bottom = null;
		this.top    = null;
		this.left   = null;
		this.right  = null;
	}
}
