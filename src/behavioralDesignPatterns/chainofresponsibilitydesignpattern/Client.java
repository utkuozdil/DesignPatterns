package chainofresponsibilitydesignpattern;

import java.time.LocalDate;

import chainofresponsibilitydesignpattern.LeaveApplication.Type;

public class Client {

	public static void main(String[] args) {
		LeaveApplication leaveApplication = LeaveApplication.getBuilder().withType(Type.Sick).from(LocalDate.now()).to(LocalDate.of(2019, 1, 17)).build();
		LeaveApprover leaveApprover = createChain();
		
		System.out.println(leaveApplication);
		System.out.println("**********************");
		leaveApprover.processLeaveApplication(leaveApplication);
		System.out.println(leaveApplication);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead projectLead = new ProjectLead(manager);
		return projectLead;
	}
}
