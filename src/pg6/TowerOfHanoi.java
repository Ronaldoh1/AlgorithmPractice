package pg6;

public class TowerOfHanoi {
	
	public void move (int numberOfDisc, char from, char to, char inter){
		if (numberOfDisc == 1){
			System.out.println("Moving Disc 1  from "  + from + " to " + to);
		}else {
		move(numberOfDisc - 1, from, inter, to);
		System.out.println("Moving disc " + numberOfDisc + "from " + from + " to " + to);
		move(numberOfDisc -1, inter, to, from);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TowerOfHanoi tower = new TowerOfHanoi();

		tower.move(3, 'A', 'C', 'B');

	}

}
