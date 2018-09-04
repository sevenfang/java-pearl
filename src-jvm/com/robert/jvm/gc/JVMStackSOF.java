package com.robert.jvm.gc;

import java.util.ArrayList;
import java.util.List;

//-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:PrintGCDetails -XX:SurviorRation=8
public class JVMStackSOF {

    private int stackLength =1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args){

        JVMStackSOF oom = new JVMStackSOF();
        oom.stackLeak();
    }
}
