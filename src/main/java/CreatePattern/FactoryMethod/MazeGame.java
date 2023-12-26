package CreatePattern.FactoryMethod;

import CreatePattern.model.MapSite;
import CreatePattern.model.Maze;
import CreatePattern.model.normal.Door;
import CreatePattern.model.normal.Room;
import CreatePattern.model.normal.Wall;
import org.xml.sax.HandlerBase;

public abstract class MazeGame {

	Maze createMaze(){

		return null;
	}

	abstract Maze makeMaze();
	abstract Room makeRoom( int n );
	abstract Wall makeWall();
	abstract Door makeDoor( Room r1, Room r2 );
}
