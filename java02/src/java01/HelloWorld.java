package java01;
// 设置类的包名,相当于文件夹,避免类(Java文件)的冲突

/**
 * My First Java App
 * 
 * @auth SONG
 * @date 2018-04-25
 */
// public 关键字: 此类是公共的 (公共的类)
// class 关键字: 是一个类
// HelloWorld: 类名(tips: 类名与文件名必需一致)
// 命名规则: 驼峰式命名 Game LoveGame TencentGame MyLoveGame - 用名词
public class HelloWorld {
  /**
   * public: 公共的方法 
   * static: 静态的方法 
   * void: 无返回值 
   * main() 方法名:是程序的入口 String[] 
   * args: 方法的参数,用来从命令行接收参数
   * String[]: 数据类型 (字符串数组) args: 参数变量(可改变)
   */
  public static void main(String[] args) {
    /*
     * 在控制台输出指定的字符串
     */
    // println(): print line 输出后换行
    System.out.println("Hello World of Java");
    // print(): 输出后不换行
    System.out.print("HI..");
    System.out.println("你好,Java!");
  }
}

// 注释的三种方式:
/**
 * 文档注释: 多行注释;类或方法上使用
 */

/*
 * 多行注释: 与 C 语言中的注释一致
 */

// 单行注释
