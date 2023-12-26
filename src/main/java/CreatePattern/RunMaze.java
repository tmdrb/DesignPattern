package CreatePattern;

import CreatePattern.Builder.NormalBuilder;
import CreatePattern.model.Maze;
import CreatePattern.AbstractFactory.MazeFactory;

public class RunMaze {



	public static void main( String[] args ){

		MazeGame game = new MazeGame();

		MazeFactory mazeFactory = new MazeFactory();
		NormalBuilder builder = new NormalBuilder();

		Maze maze = game.createMaze( builder );

		System.out.println("completed!!!");
	}
}
