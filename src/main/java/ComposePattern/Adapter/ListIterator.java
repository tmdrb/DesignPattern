package ComposePattern.Adapter;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator implements Iter {

	private List list;
	private int cursor;
	private int last = -1;
	public ListIterator( List list ) {
		this.list = list;
		this.cursor = 0;
	}

	@Override
	public boolean hasNext() {
		return list.size() != cursor;
	}

	@Override
	public Object next() {

		int i = cursor;
		if( i > list.size() )
			throw new NoSuchElementException();
		cursor += 1;
		return list.get( last = i );

	}

	@Override
	public void remove() {

		if( last < 0 )
			throw  new IllegalArgumentException();

		list.remove( list.get( last ) );

		cursor = last;
		last = -1;
	}
}
