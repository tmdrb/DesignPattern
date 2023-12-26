package CreatePattern.model.normal;

import CreatePattern.model.MapSite;
import CreatePattern.model.Direction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite {

	private final int roomNumber;
	private final Map< Direction, MapSite > sides = new HashMap<>(4);

	public Room( int roomNumber ) {

		this.roomNumber = roomNumber;

		init();
	}

	private void init(){

		Arrays.stream( Direction.values() )
				.forEach( direction -> {

					this.setSide( direction, new Wall() );
				} );
	}

	public void setSide( Direction direction, MapSite mapSite ){

		sides.put( direction, mapSite );
	}

	public MapSite getSide( Direction direction ){

		return null;
	}

	@Override
	public void enter() {

	}

	public int getRoomNumber() {
		return roomNumber;
	}
}
