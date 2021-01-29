package ch17.resource_impl;

/**
 * 練習問題17.3
 */
public interface Resource {
	void use(Object key, Object... args);
	void release();
}
