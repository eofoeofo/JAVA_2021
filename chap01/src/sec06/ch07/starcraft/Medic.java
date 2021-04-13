package sec06.ch07.starcraft;

public class Medic implements Bionic {
	private int currentHP = 3;
	private final int MAX_HP = 15;

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public void heal(Object unit) { // 메인에서 다 접근하려면 오브젝트로 접근한다
		if (this == unit || !(unit instanceof Bionic)) {
			System.out.println("치료할 수 없습니다.");
			return;
		}

		if (unit instanceof Marine) {
			Marine marine = (Marine) unit;
			marine.setCurrentHP(marine.getMAX_HP());

		} else if (unit instanceof Medic) {
			Medic medic = (Medic) unit;
			medic.setCurrentHP(medic.MAX_HP);
		}
	}
}
