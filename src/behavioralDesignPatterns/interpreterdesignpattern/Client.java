package interpreterdesignpattern;

public class Client {
	public static void main(String[] args) {
		Report report1 = new Report("Cashflow report", "FINANCE_ADMIN OR ADMIN");
		ExpressionBuilder expressionBuilder = new ExpressionBuilder();
		PermissionExpression permissionExpression = expressionBuilder.build(report1);
		System.out.println(permissionExpression);
		
		User user1 = new User("Utku", "USER");
		System.out.println("User access report: " + permissionExpression.interpret(user1));
	}
}
