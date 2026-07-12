// Bytecode for: ext.mods.commons.pool.ConnectionPool$2
// File: ext\mods\commons\pool\ConnectionPool$2.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/ConnectionPool$2.class
  Last modified 9 de jul de 2026; size 2430 bytes
  MD5 checksum f41c1e6557e7db0887539fcc7bf6cbdc
  Compiled from "ConnectionPool.java"
class ext.mods.commons.pool.ConnectionPool$2 implements java.lang.reflect.InvocationHandler
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #4                          // ext/mods/commons/pool/ConnectionPool$2
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 2, methods: 2, attributes: 5
Constant pool:
    #1 = Class              #2            // ext/mods/commons/pool/ConnectionPool
    #2 = Utf8               ext/mods/commons/pool/ConnectionPool
    #3 = Fieldref           #4.#5         // ext/mods/commons/pool/ConnectionPool$2.val$realPs:Ljava/sql/PreparedStatement;
    #4 = Class              #6            // ext/mods/commons/pool/ConnectionPool$2
    #5 = NameAndType        #7:#8         // val$realPs:Ljava/sql/PreparedStatement;
    #6 = Utf8               ext/mods/commons/pool/ConnectionPool$2
    #7 = Utf8               val$realPs
    #8 = Utf8               Ljava/sql/PreparedStatement;
    #9 = Fieldref           #4.#10        // ext/mods/commons/pool/ConnectionPool$2.val$sql:Ljava/lang/String;
   #10 = NameAndType        #11:#12       // val$sql:Ljava/lang/String;
   #11 = Utf8               val$sql
   #12 = Utf8               Ljava/lang/String;
   #13 = Methodref          #14.#15       // java/lang/Object."<init>":()V
   #14 = Class              #16           // java/lang/Object
   #15 = NameAndType        #17:#18       // "<init>":()V
   #16 = Utf8               java/lang/Object
   #17 = Utf8               <init>
   #18 = Utf8               ()V
   #19 = Methodref          #20.#21       // java/lang/reflect/Method.getName:()Ljava/lang/String;
   #20 = Class              #22           // java/lang/reflect/Method
   #21 = NameAndType        #23:#24       // getName:()Ljava/lang/String;
   #22 = Utf8               java/lang/reflect/Method
   #23 = Utf8               getName
   #24 = Utf8               ()Ljava/lang/String;
   #25 = String             #26           // execute
   #26 = Utf8               execute
   #27 = Methodref          #28.#29       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #28 = Class              #30           // java/lang/String
   #29 = NameAndType        #31:#32       // equals:(Ljava/lang/Object;)Z
   #30 = Utf8               java/lang/String
   #31 = Utf8               equals
   #32 = Utf8               (Ljava/lang/Object;)Z
   #33 = String             #34           // executeQuery
   #34 = Utf8               executeQuery
   #35 = String             #36           // executeUpdate
   #36 = Utf8               executeUpdate
   #37 = String             #38           // executeBatch
   #38 = Utf8               executeBatch
   #39 = Methodref          #40.#41       // java/lang/System.currentTimeMillis:()J
   #40 = Class              #42           // java/lang/System
   #41 = NameAndType        #43:#44       // currentTimeMillis:()J
   #42 = Utf8               java/lang/System
   #43 = Utf8               currentTimeMillis
   #44 = Utf8               ()J
   #45 = Methodref          #20.#46       // java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #46 = NameAndType        #47:#48       // invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #47 = Utf8               invoke
   #48 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #49 = Long               50l
   #51 = Fieldref           #1.#52        // ext/mods/commons/pool/ConnectionPool.LOGGER:Lext/mods/commons/logging/CLogger;
   #52 = NameAndType        #53:#54       // LOGGER:Lext/mods/commons/logging/CLogger;
   #53 = Utf8               LOGGER
   #54 = Utf8               Lext/mods/commons/logging/CLogger;
   #55 = InvokeDynamic      #0:#56        // #0:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
   #56 = NameAndType        #57:#58       // makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
   #57 = Utf8               makeConcatWithConstants
   #58 = Utf8               (JLjava/lang/String;)Ljava/lang/String;
   #59 = Methodref          #60.#61       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #60 = Class              #62           // ext/mods/commons/logging/CLogger
   #61 = NameAndType        #63:#64       // warn:(Ljava/lang/Object;)V
   #62 = Utf8               ext/mods/commons/logging/CLogger
   #63 = Utf8               warn
   #64 = Utf8               (Ljava/lang/Object;)V
   #65 = Class              #66           // java/lang/reflect/InvocationHandler
   #66 = Utf8               java/lang/reflect/InvocationHandler
   #67 = Utf8               (Ljava/sql/PreparedStatement;Ljava/lang/String;)V
   #68 = Utf8               Code
   #69 = Utf8               LineNumberTable
   #70 = Utf8               LocalVariableTable
   #71 = Utf8               this
   #72 = Utf8               Lext/mods/commons/pool/ConnectionPool$2;
   #73 = Utf8               Signature
   #74 = Utf8               (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
   #75 = Utf8               duration
   #76 = Utf8               J
   #77 = Utf8               start
   #78 = Utf8               proxy
   #79 = Utf8               Ljava/lang/Object;
   #80 = Utf8               method
   #81 = Utf8               Ljava/lang/reflect/Method;
   #82 = Utf8               args
   #83 = Utf8               [Ljava/lang/Object;
   #84 = Utf8               methodName
   #85 = Utf8               StackMapTable
   #86 = Class              #83           // "[Ljava/lang/Object;"
   #87 = Class              #88           // java/lang/Throwable
   #88 = Utf8               java/lang/Throwable
   #89 = Utf8               Exceptions
   #90 = Utf8               SourceFile
   #91 = Utf8               ConnectionPool.java
   #92 = Utf8               EnclosingMethod
   #93 = NameAndType        #94:#95       // wrapPreparedStatement:(Ljava/sql/PreparedStatement;Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #94 = Utf8               wrapPreparedStatement
   #95 = Utf8               (Ljava/sql/PreparedStatement;Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #96 = Utf8               NestHost
   #97 = Utf8               BootstrapMethods
   #98 = String             #99           // SLOW QUERY (\u0001ms): \u0001
   #99 = Utf8               SLOW QUERY (\u0001ms): \u0001
  #100 = MethodHandle       6:#101        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #101 = Methodref          #102.#103     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #102 = Class              #104          // java/lang/invoke/StringConcatFactory
  #103 = NameAndType        #57:#105      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #104 = Utf8               java/lang/invoke/StringConcatFactory
  #105 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #106 = Utf8               InnerClasses
  #107 = Class              #108          // java/lang/invoke/MethodHandles$Lookup
  #108 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #109 = Class              #110          // java/lang/invoke/MethodHandles
  #110 = Utf8               java/lang/invoke/MethodHandles
  #111 = Utf8               Lookup
{
  final java.sql.PreparedStatement val$realPs;
    descriptor: Ljava/sql/PreparedStatement;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final java.lang.String val$sql;
    descriptor: Ljava/lang/String;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.pool.ConnectionPool$2();
    descriptor: (Ljava/sql/PreparedStatement;Ljava/lang/String;)V
    flags: (0x0000)
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: putfield      #3                  // Field val$realPs:Ljava/sql/PreparedStatement;
         5: aload_0
         6: aload_2
         7: putfield      #9                  // Field val$sql:Ljava/lang/String;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: return
      LineNumberTable:
        line 157: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/pool/ConnectionPool$2;
    Signature: #18                          // ()V

  public java.lang.Object invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]) throws java.lang.Throwable;
    descriptor: (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=13, args_size=4
         0: aload_2
         1: invokevirtual #19                 // Method java/lang/reflect/Method.getName:()Ljava/lang/String;
         4: astore        4
         6: ldc           #25                 // String execute
         8: aload         4
        10: invokevirtual #27                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        13: ifne          46
        16: ldc           #33                 // String executeQuery
        18: aload         4
        20: invokevirtual #27                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        23: ifne          46
        26: ldc           #35                 // String executeUpdate
        28: aload         4
        30: invokevirtual #27                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        33: ifne          46
        36: ldc           #37                 // String executeBatch
        38: aload         4
        40: invokevirtual #27                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        43: ifeq          138
        46: invokestatic  #39                 // Method java/lang/System.currentTimeMillis:()J
        49: lstore        5
        51: aload_2
        52: aload_0
        53: getfield      #3                  // Field val$realPs:Ljava/sql/PreparedStatement;
        56: aload_3
        57: invokevirtual #45                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        60: astore        7
        62: invokestatic  #39                 // Method java/lang/System.currentTimeMillis:()J
        65: lload         5
        67: lsub
        68: lstore        8
        70: lload         8
        72: ldc2_w        #49                 // long 50l
        75: lcmp
        76: ifle          96
        79: getstatic     #51                 // Field ext/mods/commons/pool/ConnectionPool.LOGGER:Lext/mods/commons/logging/CLogger;
        82: lload         8
        84: aload_0
        85: getfield      #9                  // Field val$sql:Ljava/lang/String;
        88: invokedynamic #55,  0             // InvokeDynamic #0:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
        93: invokevirtual #59                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        96: aload         7
        98: areturn
        99: astore        10
       101: invokestatic  #39                 // Method java/lang/System.currentTimeMillis:()J
       104: lload         5
       106: lsub
       107: lstore        11
       109: lload         11
       111: ldc2_w        #49                 // long 50l
       114: lcmp
       115: ifle          135
       118: getstatic     #51                 // Field ext/mods/commons/pool/ConnectionPool.LOGGER:Lext/mods/commons/logging/CLogger;
       121: lload         11
       123: aload_0
       124: getfield      #9                  // Field val$sql:Ljava/lang/String;
       127: invokedynamic #55,  0             // InvokeDynamic #0:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
       132: invokevirtual #59                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       135: aload         10
       137: athrow
       138: aload_2
       139: aload_0
       140: getfield      #3                  // Field val$realPs:Ljava/sql/PreparedStatement;
       143: aload_3
       144: invokevirtual #45                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
       147: areturn
      Exception table:
         from    to  target type
            51    62    99   any
            99   101    99   any
      LineNumberTable:
        line 160: 0
        line 162: 6
        line 163: 46
        line 165: 51
        line 167: 62
        line 168: 70
        line 169: 79
        line 165: 96
        line 167: 99
        line 168: 109
        line 169: 118
        line 172: 135
        line 174: 138
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           70      26     8 duration   J
          109      26    11 duration   J
           51      87     5 start   J
            0     148     0  this   Lext/mods/commons/pool/ConnectionPool$2;
            0     148     1 proxy   Ljava/lang/Object;
            0     148     2 method   Ljava/lang/reflect/Method;
            0     148     3  args   [Ljava/lang/Object;
            6     142     4 methodName   Ljava/lang/String;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 49
          locals = [ long, class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/commons/pool/ConnectionPool$2, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;", class java/lang/String, long ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/commons/pool/ConnectionPool$2, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;", class java/lang/String, long, top, top, top, class java/lang/Throwable ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/commons/pool/ConnectionPool$2, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;", class java/lang/String ]
          stack = []
    Exceptions:
      throws java.lang.Throwable
}
SourceFile: "ConnectionPool.java"
EnclosingMethod: #1.#93                 // ext.mods.commons.pool.ConnectionPool.wrapPreparedStatement
NestHost: class ext/mods/commons/pool/ConnectionPool
BootstrapMethods:
  0: #100 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #98 SLOW QUERY (\u0001ms): \u0001
InnerClasses:
  #4;                                     // class ext/mods/commons/pool/ConnectionPool$2
  public static final #111= #107 of #109; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
