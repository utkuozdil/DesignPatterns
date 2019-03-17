package abstractfactorydesignpattern;

import abstractfactorydesignpattern.Instance.Capacity;

public class Client {

	public Client(ResourceFactory resourceFactory) {
		this.resourceFactory = resourceFactory;
	}

	private ResourceFactory resourceFactory;

	public Instance createServer(Instance.Capacity capacity, int storageCapacityInMib) {
		Instance instance = resourceFactory.createInstance(capacity);
		Storage storage = resourceFactory.createStorage(storageCapacityInMib);
		instance.attachStorage(storage);
		return instance;
	}

	public static void main(String[] args) {
		Client aws = new Client(new AwsResourceFactory());
		Instance awsInstance = aws.createServer(Capacity.micro, 20480);
		awsInstance.start();
		awsInstance.stop();

		System.out.println("");

		Client googleCloud = new Client(new GoogleResourceFactory());
		Instance googleCloudInstance = googleCloud.createServer(Capacity.micro, 20480);
		googleCloudInstance.start();
		googleCloudInstance.stop();
	}
}
