package CreatePattern.Builder;

import CreatePattern.model.Direction;
import CreatePattern.model.Maze;
import CreatePattern.model.normal.Door;
import CreatePattern.model.normal.Room;

public class NormalBuilder extends MazeBuilder{

	private Maze currentMaze;
	@Override
	public Maze getMaze() {
		return currentMaze;
	}

	@Override
	public void buildMaze() {

		currentMaze = new Maze();
	}

	@Override
	public void buildRoom( int n ) {

		if( currentMaze != null ){

			Room room = new Room( n );

			currentMaze.addRoom( room );
		}
	}

	@Override
	public void buildDoor( Room pre, Room after ) {

		Door door = new Door( pre, after );

		pre.setSide( Direction.South, door );
		after.setSide( Direction.North, door );
	}


}
