import javax.swing.JOptionPane;

interface CanFight{
	public void fight();
}

interface CanSwim{
	public void swim();
}

interface CanFly{
	public void fly();
}

class ActionCharacter{
	public void fight() {
		JOptionPane.showMessageDialog(null, "I am fighting!");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly{
	
	public void swim() {
		JOptionPane.showMessageDialog(null, "I am swimming!");
	}
	
	public void fly() {
		JOptionPane.showMessageDialog(null, "I am flying!");
	}
}

public class Adventure {

	public static void main(String[] args) {
		Hero superman = new Hero();
		
		superman.fly();
		superman.fight();
		
		System.exit(0);
	}
}
