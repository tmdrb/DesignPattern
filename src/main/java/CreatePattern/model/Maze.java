package CreatePattern.model;

import CreatePattern.model.normal.Room;

import java.util.HashMap;
import java.util.Map;

public class Maze {

	private final Map< Integer, Room > roomMap = new HashMap<>();
	public void addRoom( Room room ){

		roomMap.put( room.getRoomNumber(), room );
	}

	public Room getRoom( int id ){

		return roomMap.get( id );
	}

}
