
public abstract class Character {
	WeaponBehavior weapon;
	MovementBehavior movement;
	
	abstract void fight();
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
	public void setMovement(MovementBehavior m) {
		this.movement = m;
	}
	
	public void performMovement() {
		if (movement != null) {
			movement.move();
		} else {
			System.out.println("You don't know how to move yet!");
		}
	}
}
