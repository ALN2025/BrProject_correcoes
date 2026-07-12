// Bytecode for: ext.mods.commons.util.SysUtil
// File: ext\mods\commons\util\SysUtil.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/util/SysUtil.class
  Last modified 9 de jul de 2026; size 736 bytes
  MD5 checksum 3ffa8e2e807c50ff8dec43a6db1d4fa1
  Compiled from "SysUtil.java"
public class ext.mods.commons.util.SysUtil
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #27                         // ext/mods/commons/util/SysUtil
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/lang/IllegalStateException
   #8 = Utf8               java/lang/IllegalStateException
   #9 = String             #10            // Utility class
  #10 = Utf8               Utility class
  #11 = Methodref          #7.#12         // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #12 = NameAndType        #5:#13         // "<init>":(Ljava/lang/String;)V
  #13 = Utf8               (Ljava/lang/String;)V
  #14 = Methodref          #15.#16        // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
  #15 = Class              #17            // java/lang/Runtime
  #16 = NameAndType        #18:#19        // getRuntime:()Ljava/lang/Runtime;
  #17 = Utf8               java/lang/Runtime
  #18 = Utf8               getRuntime
  #19 = Utf8               ()Ljava/lang/Runtime;
  #20 = Methodref          #15.#21        // java/lang/Runtime.totalMemory:()J
  #21 = NameAndType        #22:#23        // totalMemory:()J
  #22 = Utf8               totalMemory
  #23 = Utf8               ()J
  #24 = Methodref          #15.#25        // java/lang/Runtime.freeMemory:()J
  #25 = NameAndType        #26:#23        // freeMemory:()J
  #26 = Utf8               freeMemory
  #27 = Class              #28            // ext/mods/commons/util/SysUtil
  #28 = Utf8               ext/mods/commons/util/SysUtil
  #29 = Long               1048576l
  #31 = Methodref          #15.#32        // java/lang/Runtime.maxMemory:()J
  #32 = NameAndType        #33:#23        // maxMemory:()J
  #33 = Utf8               maxMemory
  #34 = Utf8               MEBIOCTET
  #35 = Utf8               I
  #36 = Utf8               ConstantValue
  #37 = Integer            1048576
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               this
  #42 = Utf8               Lext/mods/commons/util/SysUtil;
  #43 = Utf8               getUsedMemory
  #44 = Utf8               getMaxMemory
  #45 = Utf8               SourceFile
  #46 = Utf8               SysUtil.java
{
  public static long getUsedMemory();
    descriptor: ()J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: invokestatic  #14                 // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
         3: invokevirtual #20                 // Method java/lang/Runtime.totalMemory:()J
         6: invokestatic  #14                 // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
         9: invokevirtual #24                 // Method java/lang/Runtime.freeMemory:()J
        12: lsub
        13: ldc2_w        #29                 // long 1048576l
        16: ldiv
        17: lreturn
      LineNumberTable:
        line 37: 0

  public static long getMaxMemory();
    descriptor: ()J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: invokestatic  #14                 // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
         3: invokevirtual #31                 // Method java/lang/Runtime.maxMemory:()J
         6: ldc2_w        #29                 // long 1048576l
         9: ldiv
        10: lreturn
      LineNumberTable:
        line 45: 0
}
SourceFile: "SysUtil.java"
