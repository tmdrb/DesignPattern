package ComposePattern.Bridge;

public class Animal implements Behavior{
	@Override
	public void attack() {

		System.out.println("동물이 공격");
	}

	@Override
	public void move() {

		System.out.println("동물이 움직임");
	}

	@Override
	public void stop() {
		System.out.println("동물이 멈춰");

	}
}
