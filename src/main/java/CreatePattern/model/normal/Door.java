package CreatePattern.model.normal;

import CreatePattern.model.MapSite;

public class Door implements MapSite {

	private final Room pre;
	private final Room after;
	private boolean isOpen = false;

	public Door( Room pre, Room after ) {

		this.pre = pre;
		this.after = after;
	}

	public boolean isOpen(){

		return isOpen;
	}
	@Override
	public void enter() {

	}
}
