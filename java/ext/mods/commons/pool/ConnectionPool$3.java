// Bytecode for: ext.mods.commons.pool.ConnectionPool$3
// File: ext\mods\commons\pool\ConnectionPool$3.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/ConnectionPool$3.class
  Last modified 9 de jul de 2026; size 2454 bytes
  MD5 checksum 0624325b47e6c52b553f19fb2923b398
  Compiled from "ConnectionPool.java"
class ext.mods.commons.pool.ConnectionPool$3 implements java.lang.reflect.InvocationHandler
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #4                          // ext/mods/commons/pool/ConnectionPool$3
  super_class: #10                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 5
Constant pool:
    #1 = Class              #2            // ext/mods/commons/pool/ConnectionPool
    #2 = Utf8               ext/mods/commons/pool/ConnectionPool
    #3 = Fieldref           #4.#5         // ext/mods/commons/pool/ConnectionPool$3.val$realSt:Ljava/sql/Statement;
    #4 = Class              #6            // ext/mods/commons/pool/ConnectionPool$3
    #5 = NameAndType        #7:#8         // val$realSt:Ljava/sql/Statement;
    #6 = Utf8               ext/mods/commons/pool/ConnectionPool$3
    #7 = Utf8               val$realSt
    #8 = Utf8               Ljava/sql/Statement;
    #9 = Methodref          #10.#11       // java/lang/Object."<init>":()V
   #10 = Class              #12           // java/lang/Object
   #11 = NameAndType        #13:#14       // "<init>":()V
   #12 = Utf8               java/lang/Object
   #13 = Utf8               <init>
   #14 = Utf8               ()V
   #15 = Methodref          #16.#17       // java/lang/reflect/Method.getName:()Ljava/lang/String;
   #16 = Class              #18           // java/lang/reflect/Method
   #17 = NameAndType        #19:#20       // getName:()Ljava/lang/String;
   #18 = Utf8               java/lang/reflect/Method
   #19 = Utf8               getName
   #20 = Utf8               ()Ljava/lang/String;
   #21 = String             #22           // execute
   #22 = Utf8               execute
   #23 = Methodref          #24.#25       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #24 = Class              #26           // java/lang/String
   #25 = NameAndType        #27:#28       // equals:(Ljava/lang/Object;)Z
   #26 = Utf8               java/lang/String
   #27 = Utf8               equals
   #28 = Utf8               (Ljava/lang/Object;)Z
   #29 = String             #30           // executeQuery
   #30 = Utf8               executeQuery
   #31 = String             #32           // executeUpdate
   #32 = Utf8               executeUpdate
   #33 = Methodref          #34.#35       // java/lang/System.currentTimeMillis:()J
   #34 = Class              #36           // java/lang/System
   #35 = NameAndType        #37:#38       // currentTimeMillis:()J
   #36 = Utf8               java/lang/System
   #37 = Utf8               currentTimeMillis
   #38 = Utf8               ()J
   #39 = Fieldref           #1.#40        // ext/mods/commons/pool/ConnectionPool.LOGGER:Lext/mods/commons/logging/CLogger;
   #40 = NameAndType        #41:#42       // LOGGER:Lext/mods/commons/logging/CLogger;
   #41 = Utf8               LOGGER
   #42 = Utf8               Lext/mods/commons/logging/CLogger;
   #43 = InvokeDynamic      #0:#44        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #44 = NameAndType        #45:#46       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #45 = Utf8               makeConcatWithConstants
   #46 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #47 = Methodref          #48.#49       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #48 = Class              #50           // ext/mods/commons/logging/CLogger
   #49 = NameAndType        #51:#52       // info:(Ljava/lang/Object;)V
   #50 = Utf8               ext/mods/commons/logging/CLogger
   #51 = Utf8               info
   #52 = Utf8               (Ljava/lang/Object;)V
   #53 = Methodref          #16.#54       // java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #54 = NameAndType        #55:#56       // invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #55 = Utf8               invoke
   #56 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #57 = Long               50l
   #59 = InvokeDynamic      #1:#60        // #1:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
   #60 = NameAndType        #45:#61       // makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
   #61 = Utf8               (JLjava/lang/String;)Ljava/lang/String;
   #62 = Methodref          #48.#63       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #63 = NameAndType        #64:#52       // warn:(Ljava/lang/Object;)V
   #64 = Utf8               warn
   #65 = Class              #66           // java/lang/reflect/InvocationHandler
   #66 = Utf8               java/lang/reflect/InvocationHandler
   #67 = Utf8               (Ljava/sql/Statement;)V
   #68 = Utf8               Code
   #69 = Utf8               LineNumberTable
   #70 = Utf8               LocalVariableTable
   #71 = Utf8               this
   #72 = Utf8               Lext/mods/commons/pool/ConnectionPool$3;
   #73 = Utf8               Signature
   #74 = Utf8               (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
   #75 = Utf8               duration
   #76 = Utf8               J
   #77 = Utf8               sql
   #78 = Utf8               Ljava/lang/String;
   #79 = Utf8               start
   #80 = Utf8               proxy
   #81 = Utf8               Ljava/lang/Object;
   #82 = Utf8               method
   #83 = Utf8               Ljava/lang/reflect/Method;
   #84 = Utf8               args
   #85 = Utf8               [Ljava/lang/Object;
   #86 = Utf8               methodName
   #87 = Utf8               StackMapTable
   #88 = Class              #85           // "[Ljava/lang/Object;"
   #89 = Class              #90           // java/lang/Throwable
   #90 = Utf8               java/lang/Throwable
   #91 = Utf8               Exceptions
   #92 = Utf8               SourceFile
   #93 = Utf8               ConnectionPool.java
   #94 = Utf8               EnclosingMethod
   #95 = NameAndType        #96:#97       // wrapStatement:(Ljava/sql/Statement;)Ljava/sql/Statement;
   #96 = Utf8               wrapStatement
   #97 = Utf8               (Ljava/sql/Statement;)Ljava/sql/Statement;
   #98 = Utf8               NestHost
   #99 = Utf8               BootstrapMethods
  #100 = String             #101          // DIRECT QUERY: \u0001
  #101 = Utf8               DIRECT QUERY: \u0001
  #102 = String             #103          // SLOW DIRECT QUERY (\u0001ms): \u0001
  #103 = Utf8               SLOW DIRECT QUERY (\u0001ms): \u0001
  #104 = MethodHandle       6:#105        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #105 = Methodref          #106.#107     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #106 = Class              #108          // java/lang/invoke/StringConcatFactory
  #107 = NameAndType        #45:#109      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #108 = Utf8               java/lang/invoke/StringConcatFactory
  #109 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #110 = Utf8               InnerClasses
  #111 = Class              #112          // java/lang/invoke/MethodHandles$Lookup
  #112 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #113 = Class              #114          // java/lang/invoke/MethodHandles
  #114 = Utf8               java/lang/invoke/MethodHandles
  #115 = Utf8               Lookup
{
  final java.sql.Statement val$realSt;
    descriptor: Ljava/sql/Statement;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.pool.ConnectionPool$3();
    descriptor: (Ljava/sql/Statement;)V
    flags: (0x0000)
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #3                  // Field val$realSt:Ljava/sql/Statement;
         5: aload_0
         6: invokespecial #9                  // Method java/lang/Object."<init>":()V
         9: return
      LineNumberTable:
        line 184: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/pool/ConnectionPool$3;
    Signature: #14                          // ()V

  public java.lang.Object invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]) throws java.lang.Throwable;
    descriptor: (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=14, args_size=4
         0: aload_2
         1: invokevirtual #15                 // Method java/lang/reflect/Method.getName:()Ljava/lang/String;
         4: astore        4
         6: ldc           #21                 // String execute
         8: aload         4
        10: invokevirtual #23                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        13: ifne          36
        16: ldc           #29                 // String executeQuery
        18: aload         4
        20: invokevirtual #23                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        23: ifne          36
        26: ldc           #31                 // String executeUpdate
        28: aload         4
        30: invokevirtual #23                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        33: ifeq          154
        36: aload_3
        37: ifnull        154
        40: aload_3
        41: arraylength
        42: ifle          154
        45: aload_3
        46: iconst_0
        47: aaload
        48: checkcast     #24                 // class java/lang/String
        51: astore        5
        53: invokestatic  #33                 // Method java/lang/System.currentTimeMillis:()J
        56: lstore        6
        58: getstatic     #39                 // Field ext/mods/commons/pool/ConnectionPool.LOGGER:Lext/mods/commons/logging/CLogger;
        61: aload         5
        63: invokedynamic #43,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        68: invokevirtual #47                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        71: aload_2
        72: aload_0
        73: getfield      #3                  // Field val$realSt:Ljava/sql/Statement;
        76: aload_3
        77: invokevirtual #53                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        80: astore        8
        82: invokestatic  #33                 // Method java/lang/System.currentTimeMillis:()J
        85: lload         6
        87: lsub
        88: lstore        9
        90: lload         9
        92: ldc2_w        #57                 // long 50l
        95: lcmp
        96: ifle          114
        99: getstatic     #39                 // Field ext/mods/commons/pool/ConnectionPool.LOGGER:Lext/mods/commons/logging/CLogger;
       102: lload         9
       104: aload         5
       106: invokedynamic #59,  0             // InvokeDynamic #1:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
       111: invokevirtual #62                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       114: aload         8
       116: areturn
       117: astore        11
       119: invokestatic  #33                 // Method java/lang/System.currentTimeMillis:()J
       122: lload         6
       124: lsub
       125: lstore        12
       127: lload         12
       129: ldc2_w        #57                 // long 50l
       132: lcmp
       133: ifle          151
       136: getstatic     #39                 // Field ext/mods/commons/pool/ConnectionPool.LOGGER:Lext/mods/commons/logging/CLogger;
       139: lload         12
       141: aload         5
       143: invokedynamic #59,  0             // InvokeDynamic #1:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
       148: invokevirtual #62                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       151: aload         11
       153: athrow
       154: aload_2
       155: aload_0
       156: getfield      #3                  // Field val$realSt:Ljava/sql/Statement;
       159: aload_3
       160: invokevirtual #53                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
       163: areturn
      Exception table:
         from    to  target type
            58    82   117   any
           117   119   117   any
      LineNumberTable:
        line 187: 0
        line 189: 6
        line 190: 45
        line 191: 53
        line 193: 58
        line 194: 71
        line 196: 82
        line 197: 90
        line 198: 99
        line 194: 114
        line 196: 117
        line 197: 127
        line 198: 136
        line 200: 151
        line 202: 154
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           90      24     9 duration   J
          127      24    12 duration   J
           53     101     5   sql   Ljava/lang/String;
           58      96     6 start   J
            0     164     0  this   Lext/mods/commons/pool/ConnectionPool$3;
            0     164     1 proxy   Ljava/lang/Object;
            0     164     2 method   Ljava/lang/reflect/Method;
            0     164     3  args   [Ljava/lang/Object;
            6     158     4 methodName   Ljava/lang/String;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class java/lang/String ]
        frame_type = 254 /* append */
          offset_delta = 77
          locals = [ class java/lang/String, long, class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/commons/pool/ConnectionPool$3, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;", class java/lang/String, class java/lang/String, long ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/commons/pool/ConnectionPool$3, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;", class java/lang/String, class java/lang/String, long, top, top, top, class java/lang/Throwable ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/commons/pool/ConnectionPool$3, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;", class java/lang/String ]
          stack = []
    Exceptions:
      throws java.lang.Throwable
}
SourceFile: "ConnectionPool.java"
EnclosingMethod: #1.#95                 // ext.mods.commons.pool.ConnectionPool.wrapStatement
NestHost: class ext/mods/commons/pool/ConnectionPool
BootstrapMethods:
  0: #104 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #100 DIRECT QUERY: \u0001
  1: #104 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #102 SLOW DIRECT QUERY (\u0001ms): \u0001
InnerClasses:
  #4;                                     // class ext/mods/commons/pool/ConnectionPool$3
  public static final #115= #111 of #113; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
