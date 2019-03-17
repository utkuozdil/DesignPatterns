package abstractfactorydesignpattern;

import abstractfactorydesignpattern.Instance.Capacity;

public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capacityInMib) {
		return new S3Storage(capacityInMib);
	}
}
