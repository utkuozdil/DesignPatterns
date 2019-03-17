package abstractfactorydesignpattern;

import abstractfactorydesignpattern.Instance.Capacity;

public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capacityInMib) {
		return new GoogleCloudStorage(capacityInMib);
	}
}
