package checkerGame.jakethurman.foundation.tests;/*package checkerGame.jakethurman.foundation.tests;

import checkerGame.jakethurman.foundation.CleanupHandler;
import checkerGame.jakethurman.foundation.Disposable;
import checkerGame.jakethurman.tests.TestCase;
import checkerGame.jakethurman.tests.TestFailureException;
import checkerGame.jakethurman.tests.TestUnit;

*//* Tests for the CleanupHandler class (see jakethuman.tests.TestApp to run) *//*
public class CleanupHandlerTests extends TestUnit {
	
	private CleanupHandler ch;
	private TestDisposable d;
	
	@Override
	public void beforeEach() {
		d  = new TestDisposable();
		ch = new CleanupHandler(d);
	}
	
	@Override
	public TestCase[] getTests() {
		return new TestCase[] {
			new TestCase("Disposed is not called on the object before the cleanup handler finishes.", () -> { 
				if (d.disposed)
					throw new TestFailureException("The object was disposed before the cleanup handler tried to dispose it!");
			}),
			new TestCase("The dispose method is only called once per item", () -> {
				ch.dispose();
				
				if (!d.disposed)
					throw new TestFailureException("The object was not disposed after the cleanup handler tried to dispose it!");
			})
		};
	}
		
	private class TestDisposable implements Disposable {
		public boolean disposed = false;
		
		public TestDisposable() {
		}

		@Override
		public void dispose() {
			disposed = true;
		}
	}
}*/
