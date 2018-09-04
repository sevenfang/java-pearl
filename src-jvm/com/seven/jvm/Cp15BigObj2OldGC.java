package com.seven.jvm;

import java.util.ArrayList;
import java.util.List;

/*
大对象直接进入年老代
运行时参数配置：
-Xms9m -Xmx9m -XX:NewRatio=2 -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=D:\jvm\Cp15BigObj2OldGC.log
 */
public class Cp15BigObj2OldGC {

byte[] oneM = new byte[4*1024*1024];
    public  static  void main(String[] args){
long i=0;
List list = new ArrayList();
        while(true){
            list.add(new Cp15BigObj2OldGC());
            System.out.println("number"+ (i++));
        }
    }
}
