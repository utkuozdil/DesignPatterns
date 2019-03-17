package chainofresponsibilitydesignpattern;

public abstract class Employee implements LeaveApprover {

	private String role;

	private LeaveApprover successor;

	public Employee(String role, LeaveApprover successor) {
		this.role = role;
		this.successor = successor;
	}

	protected abstract boolean processRequest(LeaveApplication leaveApplication);

	@Override
	public void processLeaveApplication(LeaveApplication leaveApplication) {
		if (!processRequest(leaveApplication) && successor != null)
			successor.processLeaveApplication(leaveApplication);
	}

	@Override
	public String getApproverRole() {
		return role;
	}

}
