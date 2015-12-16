
public abstract class Character {
	WeaponBehavior weapon;
	abstract void fight();
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
	public void useWeapon() {
		if (weapon != null) {
			weapon.useWeapon();
		} else {
			System.out.println("You don't currently have a weapon!");
		}
	}
}
