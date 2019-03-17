package chainofresponsibilitydesignpattern;

import chainofresponsibilitydesignpattern.LeaveApplication.Type;

public class ProjectLead extends Employee {

	public ProjectLead(LeaveApprover successor) {
		super("Project Lead", successor);
	}

	@Override
	protected boolean processRequest(LeaveApplication leaveApplication) {
		if (leaveApplication.getType().equals(Type.Sick) && leaveApplication.getNoOfDays() <= 2) {
			leaveApplication.approve(getApproverRole());
			return true;
		} else
			return false;
	}
}