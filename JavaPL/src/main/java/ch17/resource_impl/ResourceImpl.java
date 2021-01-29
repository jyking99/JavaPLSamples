package ch17.resource_impl;

/**
 * 練習問題17.3
 */
public class ResourceImpl implements Resource {
	Object key;
	boolean needsRelease = false;

	ResourceImpl(Object key) {
		this.key = key;
		// ..外部リソースの設定
		needsRelease = true;
	}

	public void use(Object key, Object... args) {
		if (this.key != key)
			throw new IllegalArgumentException("wrong key");
		// ... リソースの使用.. .
	}

	public synchronized void release() {
		if (needsRelease) {
			needsRelease = false;
			// .. リソースの解放.
		}
	}
}
