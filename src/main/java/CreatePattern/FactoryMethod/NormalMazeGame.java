package CreatePattern.FactoryMethod;

import CreatePattern.model.MapSite;
import CreatePattern.model.Maze;
import CreatePattern.model.normal.Door;
import CreatePattern.model.normal.Room;
import CreatePattern.model.normal.Wall;

public class NormalMazeGame extends MazeGame{

	@Override
	Maze createMaze() {

		Maze maze = makeMaze();

		Room room1 = makeRoom( 1 );
		Room room2 = makeRoom( 2 );

		maze.addRoom( room1 );
		maze.addRoom( room2 );

		Door door = makeDoor( room1, room2 );

		return maze;
	}

	@Override
	Maze makeMaze() {
		return new Maze();
	}

	@Override
	Room makeRoom( int n ) {
		return new Room( n );
	}

	@Override
	Wall makeWall() {
		return new Wall();
	}

	@Override
	Door makeDoor( Room r1, Room r2 ) {
		return new Door( r1, r2 );
	}
}
