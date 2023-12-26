package CreatePattern.Builder;

import CreatePattern.model.Maze;
import CreatePattern.model.normal.Room;

public abstract class MazeBuilder {

	protected MazeBuilder(){

	}
	public abstract Maze getMaze();
	public abstract void buildMaze();
	public abstract void buildRoom( int n );
	public abstract void buildDoor( Room pre, Room after );
}
