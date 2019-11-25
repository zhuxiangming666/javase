package day17set;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet2 {
	/**
	 * LinkedHashSet 底层是链表实现的,是set集合中唯一一个能保证怎么存就怎么取的集合对象
	 *因为是HashSet的子类,所以也是保证元素唯一的,与HashSet的原理一样
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		//String 重写了hashcode方法
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		lhs.add(new String("a"));
		System.out.println(lhs);
	}

}