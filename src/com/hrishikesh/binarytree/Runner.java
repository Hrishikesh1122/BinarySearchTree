package com.hrishikesh.binarytree;
/*************************************************************************
 * Purpose : Implement Binary Search Tree
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 14-06-202
 *
 ************************************************************************/
public class Runner {

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.insert(56);
		b.insert(30);
		b.insert(70);
		b.insert(22);
		b.insert(40);
		b.insert(60);
		b.insert(95);
		b.insert(11);
		b.insert(65);
		b.insert(3);
		b.insert(16);
		b.insert(63);
		b.insert(67);
		System.out.println(b.size());

	}

}
