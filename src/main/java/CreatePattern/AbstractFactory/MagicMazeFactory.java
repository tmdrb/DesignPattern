package CreatePattern.AbstractFactory;

import CreatePattern.model.magic.MagicDoor;
import CreatePattern.model.magic.MagicRoom;
import CreatePattern.model.normal.Door;
import CreatePattern.model.normal.Room;

public class MagicMazeFactory extends MazeFactory {

	@Override
	public Door createDoor( Room pre, Room after ) {

		return new MagicDoor( pre, after );
	}

	@Override
	public Room createRoom( int roomNumber ) {

		return new MagicRoom( roomNumber );
	}
}
