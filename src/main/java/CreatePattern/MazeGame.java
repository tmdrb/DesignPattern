package CreatePattern;

import CreatePattern.Builder.MazeBuilder;
import CreatePattern.model.Maze;
import CreatePattern.model.normal.Door;
import CreatePattern.AbstractFactory.MazeFactory;
import CreatePattern.model.normal.Room;
import CreatePattern.model.Direction;

public class MazeGame {

	Maze createMaze( MazeFactory factory ){

		Maze maze = factory.createMaze();

		Room room1 = factory.createRoom( 1 );
		Room room2 = factory.createRoom( 2 );
		Door door = new Door( room1, room2 );

		maze.addRoom( room1 );
		maze.addRoom( room2 );

		room1.setSide( Direction.North, door );

		room2.setSide( Direction.South, door );

		return maze;
	}

	Maze createMaze( MazeBuilder builder ){

		builder.buildMaze();

		builder.buildRoom( 1 );
		builder.buildRoom( 2 );
		builder.buildRoom( 3 );

		return builder.getMaze();
	}
}
