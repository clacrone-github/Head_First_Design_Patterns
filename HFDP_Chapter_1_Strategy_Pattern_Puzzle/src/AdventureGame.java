
public class AdventureGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character king = new King();
		king.useWeapon();
		king.setWeapon(new SwordBehavior());
		king.useWeapon();
		king.fight();
		king.setWeapon(new AxeBehavior());
		king.useWeapon();
	}

}
