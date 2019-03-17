package compoistedesignpattern;

public class BinaryFile extends File {

	private long size;

	public BinaryFile(String name, long size) {
		super(name);
		this.size = size;
	}

	@Override
	public void ls() {
		System.out.println(getName() + "\t" + size);
	}

	@Override
	public void addFile(File file) {
		throw new UnsupportedOperationException("BinaryFile addFile desteklemiyor");
	}

	@Override
	public File[] getFiles() {
		throw new UnsupportedOperationException("BinaryFile getFiles desteklemiyor");
	}

	@Override
	public boolean removeFile(File file) {
		throw new UnsupportedOperationException("BinaryFile removeFile desteklemiyor");
	}
}
