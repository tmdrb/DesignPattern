package CreatePattern;

import ComposePattern.Adapter.Iter;
import ComposePattern.Adapter.ListIterator;
import ComposePattern.Bridge.*;
import CreatePattern.Builder.NormalBuilder;
import CreatePattern.model.Maze;
import CreatePattern.AbstractFactory.MazeFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RunMaze {



	public static void main( String[] args ){

//		MazeGame game = new MazeGame();
//
//		MazeFactory mazeFactory = new MazeFactory();
//		NormalBuilder builder = new NormalBuilder();
//
//		Maze maze = game.createMaze( builder );
//
//		System.out.println("completed!!!");

		List list = new ArrayList();

		list.add( 1 );
		list.add( 2 );
		list.add( 3 );
		list.add( 4 );

//		Iter listIterator = new ListIterator( list );
//
//
//		System.out.println( listIterator.hasNext() );
//		System.out.println( listIterator.next() );
//		System.out.println( listIterator.hasNext() );
//		System.out.println( listIterator.next() );
//		System.out.println( listIterator.hasNext() );
//		System.out.println( listIterator.next() );
//
//		System.out.println( listIterator.hasNext() );
//		System.out.println( listIterator.next() );
//		listIterator.remove();
//		System.out.println( listIterator.hasNext() );
//		System.out.println( listIterator.next() );

		Unit animal = new AnimalUnit( new Animal() );
		Unit person = new PersonUnit( new Person() );

		animal.start();
		person.start();
	}
}
