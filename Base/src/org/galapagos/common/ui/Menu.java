package org.galapagos.common.ui;

import java.util.ArrayList;
import java.util.List;

import org.galapagos.common.cli.Input;

public class Menu {
	List<MenuItem> list;

	public Menu() {
		list = new ArrayList<MenuItem>();
	}

	// MenuItem�� ��Ͽ� �߰�
	public void add(MenuItem item) {
		list.add(item);
	}

	public void print() {

		for (int i = 0; i < list.size(); i++) {
			System.out.print((i + 1) + "]" + list.get(i).getTitle() + " ");
		}
		System.out.println();
	}

	public MenuItem select() {
		int i = Input.readInt("����> ") - 1;

		if (i < list.size()) {
			return list.get(i);
		}
		return null;
	}
}
