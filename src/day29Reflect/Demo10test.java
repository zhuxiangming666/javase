package day29Reflect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* 已知一个类，定义如下： 
 * 		public class DemoClass {
			public void run() {
				System.out.println("welcome to heima!");
			}
		}
 * (1) 写一个Properties格式的配置文件，配置类的完整名称。 
 * (2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，用反射的方式运行run方法。
*/
public class Demo10test {
	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BufferedReader aReader=new BufferedReader(new 
				FileReader("src/day29Reflect/config.properties1"));
		String aString=aReader.readLine();
		Class aClass=Class.forName(aString);
		Object aObject=aClass.newInstance();	//利用空参构造创建对象
		Method aMethod=aClass.getDeclaredMethod("say");	
		aMethod.invoke(aObject);
	}
}
