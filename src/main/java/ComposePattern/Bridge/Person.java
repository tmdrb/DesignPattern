package ComposePattern.Bridge;

public class Person implements Behavior{
	@Override
	public void attack() {
		System.out.println("사람이 공격");
	}

	@Override
	public void move() {

		System.out.println("사람이 움직임");
	}

	@Override
	public void stop() {

		System.out.println("사람이 멈춰");
	}
}
