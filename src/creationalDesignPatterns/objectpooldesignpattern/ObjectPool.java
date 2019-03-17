package objectpooldesignpattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

	public ObjectPool(Supplier<T> creator, int count) {
		availablePool = new LinkedBlockingQueue<>();
		for (int i = 0; i < count; i++)
			availablePool.offer(creator.get());
	}

	private BlockingQueue<T> availablePool;

	public T get() {
		try {
			return availablePool.take();
		} catch (InterruptedException interruptedException) {
			System.err.println("take() was interrupted");
		}
		return null;
	}

	public void release(T object) {
		object.reset();
		try {
			availablePool.put(object);
		} catch (InterruptedException e) {
			System.err.println("put() was interrupted");
		}
	}
}
