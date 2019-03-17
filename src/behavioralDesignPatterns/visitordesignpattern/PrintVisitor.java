package visitordesignpattern;

public class PrintVisitor implements Visitor {

	@Override
	public void visit(Programmer programmer) {
		String message = programmer.getName() + " is a " + programmer.getSkill() + " programmer";
		System.out.println(message);
	}

	@Override
	public void visit(ProjectLead projectLead) {
		String message = projectLead.getName() + " is a project lead with " + projectLead.getDirectReports().size()
				+ " programmers reporting.";
		System.out.println(message);
	}

	@Override
	public void visit(Manager manager) {
		String message = manager.getName() + " is a manager with " + manager.getDirectReports().size()
				+ " project lead reporting.";
		System.out.println(message);
	}

	@Override
	public void visit(VicePresident vicePresident) {
		String message = vicePresident.getName() + " is a vc with " + vicePresident.getDirectReports().size()
				+ " manager reporting.";
		System.out.println(message);
	}

}
