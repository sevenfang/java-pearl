package com.hbase;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * create 'hbase_1102',  {NAME=>'cf1'}
 *
 put'hbase_1102', '311551203891_9223370752725414807','cf1:name','Tom1'
 put'hbase_1102', '311551203891_9223370752639014807','cf1:name','Tom2'
 put'hbase_1102', '311551203891_9223370752552614807','cf1:name','Tom3'
 put'hbase_1102', '311551203891_9223370752466214807','cf1:name','Tom4'
 put'hbase_1102', '311551203891_9223370752379814807','cf1:name','Tom5'
 put'hbase_1102', '311551203891_9223370752293414807','cf1:name','Tom6'
 put'hbase_1102', '311551203891_9223370752207014807','cf1:name','Tom7'
 put'hbase_1102', '311551203891_9223370752120614807','cf1:name','Tom8'
 put'hbase_1102', '311551203891_9223370752034214807','cf1:name','Tom9'
 put'hbase_1102', '311551203891_9223370751947814807','cf1:name','Tom10'


 get  'hbase_1102','311551203891_9223370751947814807'
 scan  'hbase_1102',{STARTROW =>'311551203891_9223370752639014807',ENDROW =>'311551203891_9223370752725414807'}
 */
public class TestHbaseKey {

    public static void main(String[] args) throws ParseException {
        String userid="198302155113";

for (int i=0;i<10;i++){
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date myDate1 = dateFormat1.parse("2010-09-1"+i+" 22:36:01");
      long startTime = myDate1.getTime();

        String key1 = reverseStringBuilder(userid)+"_"+(Long.MAX_VALUE-startTime);
        System.out.println(key1);
}


    }

    public static String reverseStringBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        String afterreverse = sb.reverse().toString();
        return afterreverse;
    }
}
