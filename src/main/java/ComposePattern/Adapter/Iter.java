package ComposePattern.Adapter;

import java.util.Iterator;

public interface Iter {

	public boolean hasNext();

	public Object next();

	public void remove();
}
