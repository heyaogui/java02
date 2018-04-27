package java01;
/**
 * Java 数据类型转换
 * @author Administrator
 *
 */

public class ZhuangHuan {

	public static void main(String[] args) {
		//声明变量salary,直接赋值
		//1.声明变量并赋初始值
		int salary = 9999;
		 
		//2.声明变量（没有变量）
		int age;
		//赋值
		age =29;
		//隐式装换:自动转换：（小类型转大类型）
		long l=salary;
		System.out.println(l);
		//显示转换:强制转换：（大类型转小类型）
		age=(int) l;
		System.out.println(age);
		
		char c= 'a';
		int i =0;
		i=c;
		System.out.println(i);
		
		i =65;
		c=(char)i;
		System.out.println(c);
		

	}

}
