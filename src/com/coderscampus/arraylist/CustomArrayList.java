package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			increaseArraySize();
		}
		items[size++] = item;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
		}
		return (T) items[index];
	}

	private void increaseArraySize() {
		int newSize = items.length * 2;
		Object[] newArray = new Object[newSize];
		for (int i = 0; i < items.length; i++) {
			newArray[i] = items[i];
		}
		items = newArray;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
		}

		if (size == items.length) {
			increaseArraySize();
		}

		for (int i = size; i > index; i--) {
			items[i] = items[i - 1];
		}

		items[index] = item;
		size++;
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
		}

		T removedItem = (T) items[index];
		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}

		size--;
		items[size] = null;
		return removedItem;
	}
}
