package com.tasks.java.olympic;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Scanner;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class FlyingSnakes {
	public static void main(String[] args) {
		int graphTops;
		int ribs;
		int top;
		int rib;
		int length =0;
		boolean isSequentially = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count of graph tops");
		graphTops = sc.nextInt();
		System.out.println("Enter ribs ot the graph");
		ribs = sc.nextInt();
		Multimap<Integer, Integer> topRibsPair = ArrayListMultimap.create();
		Node<Integer> node = new Node<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= ribs; i++) {
			System.out.println("Enter " + i + " top and rib pair");
			System.out.println("Enter top");
			top = sc.nextInt();
			if(top >= graphTops) {
				System.out.println("Top of graph cannot be grater than " + graphTops);
			} else {
				System.out.println("Enter rib");
				rib = sc.nextInt();
				topRibsPair.put(top, rib);
				Node<Integer> nod = new Node<>();
				nod.insertToTree(top);
				nod.insertToTree(rib);
				sb.append(nod);
			}
		}
		for(Map.Entry<Integer, Integer> entry : topRibsPair.entries()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			if(entry.getValue() == (entry.getKey()+1)){
				isSequentially = true;
				length++;
			}
			else {
				isSequentially = false;
				length = 0;
			}
		}
		System.out.println(length);
	}
}


class Node<T extends Comparable<T>> {
	T value;
	Node<T> left;
	Node<T> right;

	void insertToTree(T t) {
		if(value == null) {
			value = t;
			return;
		}
		if(t.compareTo(value) < 0) {
			if(left == null) {
				left = new Node<>();
			}
			left.insertToTree(t);
		} else {
			if(right == null) {
				right = new Node<>();
			}
			right.insertToTree(t);
		}
	}

	void printGraph(OutputStreamWriter out) throws IOException {
		if(right != null) {
			right.printGraph(out, true, "");
		}
		printGraphValue(out);
		if(left != null) {
			left.printGraph(out, false, "");
		}
	}

	private void printGraphValue(OutputStreamWriter out) throws IOException {
		if(value == null) {
			out.write("<null>");
		} else {
			out.write(value.toString());
		}
		out.write('\n');
	}

	private void printGraph(OutputStreamWriter out, boolean isRight, String indent) throws IOException {
		if(right != null) {
			right.printGraph(out, true, indent + (isRight ? "   " : "|    "));
		}
		out.write(indent);
		if(isRight) {
			out.write("/");
		} else {
			out.write("\\");
		}
		out.write("---");
		printGraphValue(out);
		if(left != null) {
			left.printGraph(out, false, indent + (isRight ? " |      " : "        "));
		}
	}

	public StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb) {
		if(right != null) {
			right.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
		}
		sb.append(prefix).append(isTail ? "└── " : "┌── ").append(value.toString()).append("\n");
		if(left != null) {
			left.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
		}
		return sb;
	}

	@Override
	public String toString() {
		return this.toString(new StringBuilder(), true, new StringBuilder()).toString();
	}
}



