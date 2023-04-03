package HW_30_03_2023;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Node {
	int values;
	Node regular;

	Node(int values, Node regular) {
		this.values = values;
		this.regular = regular;
	}
}

class Main {
	public static void printList(Node head) {
		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.values + " ");
			ptr = ptr.regular;
		}
	}

	public static Node reverse(Node head) {
		Node previous = null;
		Node current = head;

		while (current != null) {

			Node regular = current.regular;

			current.regular = previous;

			previous = current;
			current = regular;
		}
		return previous;
	}

	public static void main(String[] args) {
		int[] keys = { 98, 45, 25, 36, 854, 12 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = reverse(head);
		printList(head);
	}
}