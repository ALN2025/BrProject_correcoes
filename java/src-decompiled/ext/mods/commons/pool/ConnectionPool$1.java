// Bytecode for: ext.mods.commons.pool.ConnectionPool$1
// File: ext\mods\commons\pool\ConnectionPool$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/ConnectionPool$1.class
  Last modified 9 de jul de 2026; size 2372 bytes
  MD5 checksum 7b6acfba7ce261fe349da6ae9ef7a6a5
  Compiled from "ConnectionPool.java"
class ext.mods.commons.pool.ConnectionPool$1 implements java.lang.reflect.InvocationHandler
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/pool/ConnectionPool$1
  super_class: #8                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 5
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/commons/pool/ConnectionPool$1.val$realConnection:Ljava/sql/Connection;
    #2 = Class              #4            // ext/mods/commons/pool/ConnectionPool$1
    #3 = NameAndType        #5:#6         // val$realConnection:Ljava/sql/Connection;
    #4 = Utf8               ext/mods/commons/pool/ConnectionPool$1
    #5 = Utf8               val$realConnection
    #6 = Utf8               Ljava/sql/Connection;
    #7 = Methodref          #8.#9         // java/lang/Object."<init>":()V
    #8 = Class              #10           // java/lang/Object
    #9 = NameAndType        #11:#12       // "<init>":()V
   #10 = Utf8               java/lang/Object
   #11 = Utf8               <init>
   #12 = Utf8               ()V
   #13 = Methodref          #14.#15       // java/lang/reflect/Method.getName:()Ljava/lang/String;
   #14 = Class              #16           // java/lang/reflect/Method
   #15 = NameAndType        #17:#18       // getName:()Ljava/lang/String;
   #16 = Utf8               java/lang/reflect/Method
   #17 = Utf8               getName
   #18 = Utf8               ()Ljava/lang/String;
   #19 = String             #20           // prepareStatement
   #20 = Utf8               prepareStatement
   #21 = Methodref          #22.#23       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #22 = Class              #24           // java/lang/String
   #23 = NameAndType        #25:#26       // equals:(Ljava/lang/Object;)Z
   #24 = Utf8               java/lang/String
   #25 = Utf8               equals
   #26 = Utf8               (Ljava/lang/Object;)Z
   #27 = Fieldref           #28.#29       // ext/mods/commons/pool/ConnectionPool.LOGGER:Lext/mods/commons/logging/CLogger;
   #28 = Class              #30           // ext/mods/commons/pool/ConnectionPool
   #29 = NameAndType        #31:#32       // LOGGER:Lext/mods/commons/logging/CLogger;
   #30 = Utf8               ext/mods/commons/pool/ConnectionPool
   #31 = Utf8               LOGGER
   #32 = Utf8               Lext/mods/commons/logging/CLogger;
   #33 = InvokeDynamic      #0:#34        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #34 = NameAndType        #35:#36       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #35 = Utf8               makeConcatWithConstants
   #36 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #37 = Methodref          #38.#39       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #38 = Class              #40           // ext/mods/commons/logging/CLogger
   #39 = NameAndType        #41:#42       // info:(Ljava/lang/Object;)V
   #40 = Utf8               ext/mods/commons/logging/CLogger
   #41 = Utf8               info
   #42 = Utf8               (Ljava/lang/Object;)V
   #43 = Methodref          #14.#44       // java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #44 = NameAndType        #45:#46       // invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #45 = Utf8               invoke
   #46 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #47 = Class              #48           // java/sql/PreparedStatement
   #48 = Utf8               java/sql/PreparedStatement
   #49 = Methodref          #28.#50       // ext/mods/commons/pool/ConnectionPool.wrapPreparedStatement:(Ljava/sql/PreparedStatement;Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #50 = NameAndType        #51:#52       // wrapPreparedStatement:(Ljava/sql/PreparedStatement;Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #51 = Utf8               wrapPreparedStatement
   #52 = Utf8               (Ljava/sql/PreparedStatement;Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #53 = String             #54           // createStatement
   #54 = Utf8               createStatement
   #55 = Class              #56           // java/sql/Statement
   #56 = Utf8               java/sql/Statement
   #57 = Methodref          #28.#58       // ext/mods/commons/pool/ConnectionPool.wrapStatement:(Ljava/sql/Statement;)Ljava/sql/Statement;
   #58 = NameAndType        #59:#60       // wrapStatement:(Ljava/sql/Statement;)Ljava/sql/Statement;
   #59 = Utf8               wrapStatement
   #60 = Utf8               (Ljava/sql/Statement;)Ljava/sql/Statement;
   #61 = Class              #62           // java/lang/reflect/InvocationHandler
   #62 = Utf8               java/lang/reflect/InvocationHandler
   #63 = Utf8               (Ljava/sql/Connection;)V
   #64 = Utf8               Code
   #65 = Utf8               LineNumberTable
   #66 = Utf8               LocalVariableTable
   #67 = Utf8               this
   #68 = Utf8               Lext/mods/commons/pool/ConnectionPool$1;
   #69 = Utf8               Signature
   #70 = Utf8               (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
   #71 = Utf8               sql
   #72 = Utf8               Ljava/lang/String;
   #73 = Utf8               ps
   #74 = Utf8               Ljava/sql/PreparedStatement;
   #75 = Utf8               st
   #76 = Utf8               Ljava/sql/Statement;
   #77 = Utf8               proxy
   #78 = Utf8               Ljava/lang/Object;
   #79 = Utf8               method
   #80 = Utf8               Ljava/lang/reflect/Method;
   #81 = Utf8               args
   #82 = Utf8               [Ljava/lang/Object;
   #83 = Utf8               methodName
   #84 = Utf8               StackMapTable
   #85 = Utf8               Exceptions
   #86 = Class              #87           // java/lang/Throwable
   #87 = Utf8               java/lang/Throwable
   #88 = Utf8               SourceFile
   #89 = Utf8               ConnectionPool.java
   #90 = Utf8               EnclosingMethod
   #91 = NameAndType        #92:#93       // wrapConnection:(Ljava/sql/Connection;)Ljava/sql/Connection;
   #92 = Utf8               wrapConnection
   #93 = Utf8               (Ljava/sql/Connection;)Ljava/sql/Connection;
   #94 = Utf8               NestHost
   #95 = Utf8               BootstrapMethods
   #96 = String             #97           // QUERY PREPARED: \u0001
   #97 = Utf8               QUERY PREPARED: \u0001
   #98 = MethodHandle       6:#99         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #99 = Methodref          #100.#101     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #100 = Class              #102          // java/lang/invoke/StringConcatFactory
  #101 = NameAndType        #35:#103      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #102 = Utf8               java/lang/invoke/StringConcatFactory
  #103 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #104 = Utf8               InnerClasses
  #105 = Class              #106          // java/lang/invoke/MethodHandles$Lookup
  #106 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #107 = Class              #108          // java/lang/invoke/MethodHandles
  #108 = Utf8               java/lang/invoke/MethodHandles
  #109 = Utf8               Lookup
{
  final java.sql.Connection val$realConnection;
    descriptor: Ljava/sql/Connection;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.pool.ConnectionPool$1();
    descriptor: (Ljava/sql/Connection;)V
    flags: (0x0000)
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #1                  // Field val$realConnection:Ljava/sql/Connection;
         5: aload_0
         6: invokespecial #7                  // Method java/lang/Object."<init>":()V
         9: return
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/pool/ConnectionPool$1;
    Signature: #12                          // ()V

  public java.lang.Object invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]) throws java.lang.Throwable;
    descriptor: (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=4
         0: aload_2
         1: invokevirtual #13                 // Method java/lang/reflect/Method.getName:()Ljava/lang/String;
         4: astore        4
         6: ldc           #19                 // String prepareStatement
         8: aload         4
        10: invokevirtual #21                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        13: ifeq          68
        16: aload_3
        17: ifnull        68
        20: aload_3
        21: arraylength
        22: ifle          68
        25: aload_3
        26: iconst_0
        27: aaload
        28: checkcast     #22                 // class java/lang/String
        31: astore        5
        33: getstatic     #27                 // Field ext/mods/commons/pool/ConnectionPool.LOGGER:Lext/mods/commons/logging/CLogger;
        36: aload         5
        38: invokedynamic #33,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        43: invokevirtual #37                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        46: aload_2
        47: aload_0
        48: getfield      #1                  // Field val$realConnection:Ljava/sql/Connection;
        51: aload_3
        52: invokevirtual #43                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        55: checkcast     #47                 // class java/sql/PreparedStatement
        58: astore        6
        60: aload         6
        62: aload         5
        64: invokestatic  #49                 // Method ext/mods/commons/pool/ConnectionPool.wrapPreparedStatement:(Ljava/sql/PreparedStatement;Ljava/lang/String;)Ljava/sql/PreparedStatement;
        67: areturn
        68: ldc           #53                 // String createStatement
        70: aload         4
        72: invokevirtual #21                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        75: ifeq          98
        78: aload_2
        79: aload_0
        80: getfield      #1                  // Field val$realConnection:Ljava/sql/Connection;
        83: aload_3
        84: invokevirtual #43                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        87: checkcast     #55                 // class java/sql/Statement
        90: astore        5
        92: aload         5
        94: invokestatic  #57                 // Method ext/mods/commons/pool/ConnectionPool.wrapStatement:(Ljava/sql/Statement;)Ljava/sql/Statement;
        97: areturn
        98: aload_2
        99: aload_0
       100: getfield      #1                  // Field val$realConnection:Ljava/sql/Connection;
       103: aload_3
       104: invokevirtual #43                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
       107: areturn
      LineNumberTable:
        line 131: 0
        line 133: 6
        line 134: 25
        line 136: 33
        line 138: 46
        line 139: 60
        line 142: 68
        line 143: 78
        line 144: 92
        line 147: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      35     5   sql   Ljava/lang/String;
           60       8     6    ps   Ljava/sql/PreparedStatement;
           92       6     5    st   Ljava/sql/Statement;
            0     108     0  this   Lext/mods/commons/pool/ConnectionPool$1;
            0     108     1 proxy   Ljava/lang/Object;
            0     108     2 method   Ljava/lang/reflect/Method;
            0     108     3  args   [Ljava/lang/Object;
            6     102     4 methodName   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 68
          locals = [ class java/lang/String ]
        frame_type = 29 /* same */
    Exceptions:
      throws java.lang.Throwable
}
SourceFile: "ConnectionPool.java"
EnclosingMethod: #28.#91                // ext.mods.commons.pool.ConnectionPool.wrapConnection
NestHost: class ext/mods/commons/pool/ConnectionPool
BootstrapMethods:
  0: #98 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #96 QUERY PREPARED: \u0001
InnerClasses:
  #2;                                     // class ext/mods/commons/pool/ConnectionPool$1
  public static final #109= #105 of #107; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
