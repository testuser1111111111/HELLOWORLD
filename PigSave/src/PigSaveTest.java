
public class PigSaveTest {
	public static void main(String[] args) {
		PigSaveEx save = new PigSaveEx();
		save.deposit(100);
		save.deposit(500);
		int totalMoney = save.getTotal();
		System.out.println("�Ѿ�: "+ totalMoney);
		
		totalMoney = 1000;
		int afterMoney = save.getTotal();
		
		System.out.println("����Ǿ���?"+ afterMoney );
}
}
