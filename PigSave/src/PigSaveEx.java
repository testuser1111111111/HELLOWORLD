
public class PigSaveEx {
	private int total;
	public int getTotal(){
		return total;
	}
	
	public void deposit(int amount){
		System.out.println("������ �Ա�");
		total = total + amount;
	}

	public void withdraw(){
		System.out.println("������ �� ����");
		total = 0;
	}

}
