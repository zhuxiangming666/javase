package day16List;

import java.util.ArrayList;
import java.util.Collection;

public class DemoFangXing5 {
	

		/**
		 * * A:泛型通配符<?>	
				* 任意类型，如果没有明确，那么就是Object以及任意的Java类了
			* B:? extends E
				* 向下限定，E及其子类
			* C:? super E
				* 向上限定，E及其父类
				* 用于comparable接口等等
		 */
		public static void main(String[] args) {
			//List<?> list = new ArrayList<Integer>();			//当右边的泛型是不确定时,左边可以指定为?
			ArrayList<Person> list1 = new ArrayList<>();
			list1.add(new Person("张三", "23"));
			list1.add(new Person("李四", "24"));
			list1.add(new Person("王五", "25"));
			
			ArrayList<Student> list2 = new ArrayList<>();
			list2.add(new Student("赵六", "26"));
			list2.add(new Student("周七", "27"));
			
			//public boolean addAll(Collection<? extends E> c)
			list1.addAll(list2);
			System.out.println(list1);//打印中有student 是多态现象
			//list2.addAll(list1);//因为list2 是子类，子类集合不会装父类
		}

	}
