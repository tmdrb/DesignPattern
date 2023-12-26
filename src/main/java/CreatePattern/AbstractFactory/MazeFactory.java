package CreatePattern.AbstractFactory;

import CreatePattern.model.Maze;
import CreatePattern.model.normal.Door;
import CreatePattern.model.normal.Room;
import CreatePattern.model.normal.Wall;

public class MazeFactory {

	public Maze createMaze(){

		return new Maze();
	}

	public Wall createWall(){

		return new Wall();
	}

	public Door createDoor( Room pre, Room after ){

		return new Door( pre, after );
	}

	public Room createRoom( int roomNumber ){

		return new Room( roomNumber );
	}
}
