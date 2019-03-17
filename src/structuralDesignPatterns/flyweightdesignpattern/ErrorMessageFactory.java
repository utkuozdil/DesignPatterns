package flyweightdesignpattern;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {
	
	public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}
	
	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}
	
	private Map<ErrorType, SystemErrorMessage> errorMessageMap = new HashMap<>();
	
	private ErrorMessageFactory() {
		errorMessageMap.put(ErrorType.GenericSystemError, new SystemErrorMessage("A generic error of type $errorCode occured.", "www.google.com/q="));
		errorMessageMap.put(ErrorType.PageNotFoundError, new SystemErrorMessage("Page not found(Error of type $errorCode occured.)", "www.google.com/q="));
	}
	
	public SystemErrorMessage getError(ErrorType type){
		return errorMessageMap.get(type);
	}
	
	public UserBannedErrorMessage getUserBannedMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}
}