package ComposePattern.Model;

public abstract class TextView {

	abstract void getOrigin( int x, int y );
	abstract void getExtent( int w, int h );
	abstract boolean isEmpty();
}

