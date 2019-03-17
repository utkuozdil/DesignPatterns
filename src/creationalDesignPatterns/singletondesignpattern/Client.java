package singletondesignpattern;

public class Client {
	public static void main(String[] args) {
		EagerRegistry eagerRegistry = EagerRegistry.getInstance();
		EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
		System.out.println(eagerRegistry == eagerRegistry2);

		LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazyRegistryWithDCL == lazyRegistryWithDCL2);

		LazyRegistryIODH lazyRegistryIODH = LazyRegistryIODH.getInstance();
		LazyRegistryIODH lazyRegistryIODH2 = LazyRegistryIODH.getInstance();
		System.out.println(lazyRegistryIODH == lazyRegistryIODH2);
	}
}
