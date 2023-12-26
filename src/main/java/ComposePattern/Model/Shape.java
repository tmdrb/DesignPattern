package ComposePattern.Model;

public interface Shape {

	void boundingBox( int w, int h );
	Manipulator createManipulator();
}
