package ComposePattern.Bridge;

public abstract class Unit {

	protected Behavior behavior;

	public Unit( Behavior behavior ) {
		this.behavior = behavior;
	}

	public abstract void attack();

	public abstract void move();
	public abstract void stop();
	public abstract void start();
}
