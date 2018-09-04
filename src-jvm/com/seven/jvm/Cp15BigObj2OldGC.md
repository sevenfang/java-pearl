  ****运行时参数设置：-Xms9m -Xmx9m -XX:NewRatio=2 -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=D:\jvm\Cp15BigObj2OldGC.log
  gc日志  
`  _eden space 2048K, 4% used `[0x00000000ffd00000,0x00000000ffd192a8,0x00000000fff00000)
  from space 512K, 0% used [0x00000000fff00000,0x00000000fff00000,0x00000000fff80000)
  to   space 512K, 0% used [0x00000000fff80000,0x00000000fff80000,0x0000000100000000)
 ParOldGen       total 7168K, used 4781K [0x00000000ff600000, 0x00000000ffd00000, 0x00000000ffd00000)
`  object space 7168K, 66% used` [0x00000000ff600000,0x00000000ffaab550,0x00000000ffd00000)
 Metaspace       used 3465K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 377K, capacity 388K, committed 512K, reserved 1048576K_
  
  年轻代内存很低只有4%，而object space是66%，说明 新对象直接进入了年老代。