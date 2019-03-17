package flyweightdesignpattern;

import flyweightdesignpattern.ErrorMessageFactory.ErrorType;

public class Client {
	public static void main(String[] args) {
		SystemErrorMessage systemErrorMessage1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		System.out.println(systemErrorMessage1.getText("4056"));
		
		UserBannedErrorMessage userBannedErrorMessage1 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
		System.out.println(userBannedErrorMessage1.getText(null));
	}
}