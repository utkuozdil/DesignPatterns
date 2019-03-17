package chainofresponsibilitydesignpattern;

public interface LeaveApprover {
	void processLeaveApplication(LeaveApplication leaveApplication);
	
	String getApproverRole();
}