package commanddesignpattern;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(fiboDyno(46));
		System.out.println(fiboRecur(46));
		 EWSService ewsService = new EWSService();
		 Command command1 = new AddMemberCommand("mailAdress", "spamList",
		 ewsService);
		 MailTasksRunner.getInstance().addCommand(command1);
		
		 Command command2 = new AddMemberCommand("mailAdress2", "spamList",
		 ewsService);
		 MailTasksRunner.getInstance().addCommand(command2);
		
		 Thread.sleep(3000);
		 MailTasksRunner.getInstance().shutdown();
	}

	public static int fiboDyno(int number) {
		int[] array = new int[number];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < number; i++)
			array[i] = array[i - 1] + array[i - 2];
		return array[number - 1];
	}

	public static int fiboRecur(int number) {
		if (number == 1 || number == 2)
			return 1;
		else
			return fiboRecur(number - 1) + fiboRecur(number - 2);
	}
}