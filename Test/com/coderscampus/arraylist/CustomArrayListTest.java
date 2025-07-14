package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_item() {
		CustomList<String> list = new CustomArrayList<>();
		assertTrue(list.add("A"));
		assertEquals(1, list.getSize());
		assertEquals("A", list.get(0));
	}

	@Test
	void should_handle_array_resizing() {
		CustomList<Integer> list = new CustomArrayList<>();
		for (int i = 0; i < 15; i++) {
			list.add(i);
		}
		assertEquals(15, list.getSize());
		assertEquals(14, list.get(14));
	}

	@Test
	void should_throw_index_exception_for_get() {
		CustomList<String> list = new CustomArrayList<>();
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
		list.add("A");
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
	}

	@Test
	void should_insert_item_at_index() {
		CustomList<String> list = new CustomArrayList<>();
		list.add("A");
		list.add("C");
		assertTrue(list.add(1, "B"));
		assertEquals(3, list.getSize());
		assertEquals("A", list.get(0));
		assertEquals("B", list.get(1));
		assertEquals("C", list.get(2));
	}

	@Test
	void should_throw_when_inserting_invalid_index() {
		CustomList<String> list = new CustomArrayList<>();
		assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, "A"));
		assertThrows(IndexOutOfBoundsException.class, () -> list.add(1, "A"));
	}

	@Test
	void should_remove_item_at_index() {
		CustomList<String> list = new CustomArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		String removed = list.remove(1);
		assertEquals("B", removed);
		assertEquals(2, list.getSize());
		assertEquals("A", list.get(0));
		assertEquals("C", list.get(1));
	}

	@Test
	void should_throw_when_removing_invalid_index() {
		CustomList<String> list = new CustomArrayList<>();
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
	}
}
