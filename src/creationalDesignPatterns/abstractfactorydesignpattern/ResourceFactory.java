package abstractfactorydesignpattern;

public interface ResourceFactory {

	Instance createInstance(Instance.Capacity capacity);

	Storage createStorage(int capacityInMib);
}
