package day16List;

import java.util.ArrayList;
import java.util.Collection;

public class DemoFangXing5 {
	

		/**
		 * * A:����ͨ���<?>	
				* �������ͣ����û����ȷ����ô����Object�Լ������Java����
			* B:? extends E
				* �����޶���E��������
			* C:? super E
				* �����޶���E���丸��
				* ����comparable�ӿڵȵ�
		 */
		public static void main(String[] args) {
			//List<?> list = new ArrayList<Integer>();			//���ұߵķ����ǲ�ȷ��ʱ,��߿���ָ��Ϊ?
			ArrayList<Person> list1 = new ArrayList<>();
			list1.add(new Person("����", "23"));
			list1.add(new Person("����", "24"));
			list1.add(new Person("����", "25"));
			
			ArrayList<Student> list2 = new ArrayList<>();
			list2.add(new Student("����", "26"));
			list2.add(new Student("����", "27"));
			
			//public boolean addAll(Collection<? extends E> c)
			list1.addAll(list2);
			System.out.println(list1);//��ӡ����student �Ƕ�̬����
			//list2.addAll(list1);//��Ϊlist2 �����࣬���༯�ϲ���װ����
		}

	}