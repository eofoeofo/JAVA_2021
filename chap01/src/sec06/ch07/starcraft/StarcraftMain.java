package sec06.ch07.starcraft;

public class StarcraftMain {
	public static void main(String[] args) {
		Medic medic1 = new Medic();
		Medic medic2 = new Medic();
		Marine marine = new Marine();
		Tank tank = new Tank(); // Tank의 부모는 Mechanic이기에 
		System.out.println("Marine - hp : " + marine.getCurrentHP());
		System.out.println("Medic1 - hp : " + medic1.getCurrentHP());
		System.out.println("Medic2 - hp : " + medic2.getCurrentHP());
		// Bionic으로 형변환이 안됨(타입으로 올 수 없다)
		medic1.heal(medic1);
		medic1.heal(medic2);
		medic1.heal(marine);
		medic1.heal(tank);
		System.out.println("Marine - hp : " + marine.getCurrentHP());
		System.out.println("Medic1 - hp : " + medic1.getCurrentHP());
		System.out.println("Medic2 - hp : " + medic2.getCurrentHP());
	}
}

