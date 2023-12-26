package ComposePattern.Bridge;

public class AnimalUnit extends Unit{
	public AnimalUnit( Behavior behavior ) {
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
