package ComposePattern.Bridge;

public class PersonUnit extends Unit{
	public PersonUnit( Behavior behavior ) {
		super( behavior );
	}

	@Override
	public void attack() {
		behavior.attack();
	}

	@Override
	public void move() {
		behavior.move();
	}

	@Override
	public void stop() {
		behavior.stop();
	}

	public void start(){
		move();
		stop();
		attack();
	}
}
