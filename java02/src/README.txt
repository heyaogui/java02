

Java 的由来:
1991 Oak
1994 Java - Sun 设计开发(高斯林) - 2010 Oracle (收购)
1995 蓬勃发展

Java 咖啡的品牌           程序设计语言
Bean 豆;咖啡豆            最原始的类Class
jar  容器;装咖啡豆的容器  类的容器;类的压缩包


Java开发工具包(Java Development Kit)
jre - 可运行 Java 程序
jdk - 可开发,并且可运行 Java 程序

JVM: Java 虚拟机


下载 JDK:
http://www.oracle.com/technetwork/java/javase/downloads/index.html


安装 JDK,设置环境变量

开发步骤:
1.编写 Java 程序(源码)
  打开记事本(Notepad++),写代码,另存为一个 Xxx.java 文件(Xxx 与代码中 class 后的单词一致)
2.编译源码 - 把 .java 文件编译成 .class 文件(字节码文件)
  javac Xxx.java
3.执行字节码文件
  java Xxx
  
  
使用 STS 开发 Java 项目:
1.File - New - Java Project 创建一个 Java 项目(工程)

  在 Package Explorer 窗口中的空白处右击 - New - Java Project 创建一个 Java 项目(工程)

  New Java Project 向导中
  src - 源码    .java
  bin - 字节码  .class
  
2.在 src 上右击 - New - Class
  输入类名
3.写代码  
4.编译
  在工具栏点击 绿色播放按钮 编译+运行
  
  在代码区右击 - Run As - Java Application 编译+运行
  

package 包名;
src
  java01
    HelloWorld.java
    Hi.java    
  java02
    HelloWorld.java
    //  \n表示换行 \t 表示一个制表符 
    //整型
    byte b =127;// 8位 ；一个字节
    int age =1888888888;// 32位； 4 个字节
    long l =1000;// 64位；8个字节
    l=99l;l=88l;//99是int类型 在后面加了一个L就说明是一个long的类型
    
    //非整型、
    float f = 99； //32位；4个字节
    double d =100.99；//64位 8个字节
    d=100d；
    //布尔型
    boolean isMarried =true；//1位
    isMarried = false；
    //字符型
    char c='a';//
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
