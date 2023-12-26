package CreatePattern.AbstractFactory;

import CreatePattern.model.boom.BoomedRoom;
import CreatePattern.model.boom.BoomedWall;
import CreatePattern.model.normal.Room;
import CreatePattern.model.normal.Wall;

public class BoomMazeFactory extends MazeFactory {

	@Override
	public Wall createWall() {
		return new BoomedWall();
	}

	@Override
	public Room createRoom( int roomNumber ) {

		return new BoomedRoom( roomNumber );
	}
}
