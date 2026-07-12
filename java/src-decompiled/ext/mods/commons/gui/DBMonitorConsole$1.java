// Bytecode for: ext.mods.commons.gui.DBMonitorConsole$1
// File: ext\mods\commons\gui\DBMonitorConsole$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/DBMonitorConsole$1.class
  Last modified 9 de jul de 2026; size 2601 bytes
  MD5 checksum d33949f84528629305ce0cccc976ba3f
  Compiled from "DBMonitorConsole.java"
class ext.mods.commons.gui.DBMonitorConsole$1 extends java.util.TimerTask
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/DBMonitorConsole$1
  super_class: #24                        // java/util/TimerTask
  interfaces: 0, fields: 4, methods: 2, attributes: 5
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/commons/gui/DBMonitorConsole$1.val$url:Ljava/lang/String;
    #2 = Class              #4            // ext/mods/commons/gui/DBMonitorConsole$1
    #3 = NameAndType        #5:#6         // val$url:Ljava/lang/String;
    #4 = Utf8               ext/mods/commons/gui/DBMonitorConsole$1
    #5 = Utf8               val$url
    #6 = Utf8               Ljava/lang/String;
    #7 = Fieldref           #2.#8         // ext/mods/commons/gui/DBMonitorConsole$1.val$user:Ljava/lang/String;
    #8 = NameAndType        #9:#6         // val$user:Ljava/lang/String;
    #9 = Utf8               val$user
   #10 = Fieldref           #2.#11        // ext/mods/commons/gui/DBMonitorConsole$1.val$pass:Ljava/lang/String;
   #11 = NameAndType        #12:#6        // val$pass:Ljava/lang/String;
   #12 = Utf8               val$pass
   #13 = Methodref          #14.#15       // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #14 = Class              #16           // java/util/Objects
   #15 = NameAndType        #17:#18       // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #16 = Utf8               java/util/Objects
   #17 = Utf8               requireNonNull
   #18 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #19 = Fieldref           #2.#20        // ext/mods/commons/gui/DBMonitorConsole$1.this$0:Lext/mods/commons/gui/DBMonitorConsole;
   #20 = NameAndType        #21:#22       // this$0:Lext/mods/commons/gui/DBMonitorConsole;
   #21 = Utf8               this$0
   #22 = Utf8               Lext/mods/commons/gui/DBMonitorConsole;
   #23 = Methodref          #24.#25       // java/util/TimerTask."<init>":()V
   #24 = Class              #26           // java/util/TimerTask
   #25 = NameAndType        #27:#28       // "<init>":()V
   #26 = Utf8               java/util/TimerTask
   #27 = Utf8               <init>
   #28 = Utf8               ()V
   #29 = Methodref          #30.#31       // java/sql/DriverManager.getConnection:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Connection;
   #30 = Class              #32           // java/sql/DriverManager
   #31 = NameAndType        #33:#34       // getConnection:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Connection;
   #32 = Utf8               java/sql/DriverManager
   #33 = Utf8               getConnection
   #34 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Connection;
   #35 = Methodref          #36.#37       // ext/mods/commons/gui/DBMonitorConsole.checkLongRunningQueries:(Ljava/sql/Connection;)V
   #36 = Class              #38           // ext/mods/commons/gui/DBMonitorConsole
   #37 = NameAndType        #39:#40       // checkLongRunningQueries:(Ljava/sql/Connection;)V
   #38 = Utf8               ext/mods/commons/gui/DBMonitorConsole
   #39 = Utf8               checkLongRunningQueries
   #40 = Utf8               (Ljava/sql/Connection;)V
   #41 = InterfaceMethodref #42.#43       // java/sql/Connection.close:()V
   #42 = Class              #44           // java/sql/Connection
   #43 = NameAndType        #45:#28       // close:()V
   #44 = Utf8               java/sql/Connection
   #45 = Utf8               close
   #46 = Class              #47           // java/lang/Throwable
   #47 = Utf8               java/lang/Throwable
   #48 = Methodref          #46.#49       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #49 = NameAndType        #50:#51       // addSuppressed:(Ljava/lang/Throwable;)V
   #50 = Utf8               addSuppressed
   #51 = Utf8               (Ljava/lang/Throwable;)V
   #52 = Class              #53           // java/sql/SQLException
   #53 = Utf8               java/sql/SQLException
   #54 = Fieldref           #36.#55       // ext/mods/commons/gui/DBMonitorConsole.LOG:Ljava/util/logging/Logger;
   #55 = NameAndType        #56:#57       // LOG:Ljava/util/logging/Logger;
   #56 = Utf8               LOG
   #57 = Utf8               Ljava/util/logging/Logger;
   #58 = Fieldref           #59.#60       // java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
   #59 = Class              #61           // java/util/logging/Level
   #60 = NameAndType        #62:#63       // SEVERE:Ljava/util/logging/Level;
   #61 = Utf8               java/util/logging/Level
   #62 = Utf8               SEVERE
   #63 = Utf8               Ljava/util/logging/Level;
   #64 = Methodref          #52.#65       // java/sql/SQLException.getMessage:()Ljava/lang/String;
   #65 = NameAndType        #66:#67       // getMessage:()Ljava/lang/String;
   #66 = Utf8               getMessage
   #67 = Utf8               ()Ljava/lang/String;
   #68 = InvokeDynamic      #0:#69        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #69 = NameAndType        #70:#71       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #70 = Utf8               makeConcatWithConstants
   #71 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #72 = Methodref          #73.#74       // java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
   #73 = Class              #75           // java/util/logging/Logger
   #74 = NameAndType        #76:#77       // log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
   #75 = Utf8               java/util/logging/Logger
   #76 = Utf8               log
   #77 = Utf8               (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
   #78 = InvokeDynamic      #1:#69        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #79 = Methodref          #36.#80       // ext/mods/commons/gui/DBMonitorConsole.logQuery:(Ljava/lang/String;J)V
   #80 = NameAndType        #81:#82       // logQuery:(Ljava/lang/String;J)V
   #81 = Utf8               logQuery
   #82 = Utf8               (Ljava/lang/String;J)V
   #83 = Methodref          #36.#84       // ext/mods/commons/gui/DBMonitorConsole.stopMonitoring:()V
   #84 = NameAndType        #85:#28       // stopMonitoring:()V
   #85 = Utf8               stopMonitoring
   #86 = Utf8               (Lext/mods/commons/gui/DBMonitorConsole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
   #87 = Utf8               Code
   #88 = Utf8               LineNumberTable
   #89 = Utf8               LocalVariableTable
   #90 = Utf8               this
   #91 = Utf8               Lext/mods/commons/gui/DBMonitorConsole$1;
   #92 = Utf8               MethodParameters
   #93 = Utf8               run
   #94 = Utf8               conn
   #95 = Utf8               Ljava/sql/Connection;
   #96 = Utf8               e
   #97 = Utf8               Ljava/sql/SQLException;
   #98 = Utf8               StackMapTable
   #99 = Utf8               SourceFile
  #100 = Utf8               DBMonitorConsole.java
  #101 = Utf8               EnclosingMethod
  #102 = NameAndType        #103:#104     // startActiveMonitoring:(Ljava/util/Properties;)V
  #103 = Utf8               startActiveMonitoring
  #104 = Utf8               (Ljava/util/Properties;)V
  #105 = Utf8               NestHost
  #106 = Utf8               BootstrapMethods
  #107 = String             #108          // Falha na consulta de monitoramento ativo: \u0001
  #108 = Utf8               Falha na consulta de monitoramento ativo: \u0001
  #109 = String             #110          // ERRO FATAL NO MONITOR: Falha ao consultar o processlist. Monitoramento interrompido. Detalhe: \u0001
  #110 = Utf8               ERRO FATAL NO MONITOR: Falha ao consultar o processlist. Monitoramento interrompido. Detalhe: \u0001
  #111 = MethodHandle       6:#112        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #112 = Methodref          #113.#114     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #113 = Class              #115          // java/lang/invoke/StringConcatFactory
  #114 = NameAndType        #70:#116      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #115 = Utf8               java/lang/invoke/StringConcatFactory
  #116 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #117 = Utf8               InnerClasses
  #118 = Class              #119          // java/lang/invoke/MethodHandles$Lookup
  #119 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #120 = Class              #121          // java/lang/invoke/MethodHandles
  #121 = Utf8               java/lang/invoke/MethodHandles
  #122 = Utf8               Lookup
{
  final java.lang.String val$url;
    descriptor: Ljava/lang/String;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final java.lang.String val$user;
    descriptor: Ljava/lang/String;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final java.lang.String val$pass;
    descriptor: Ljava/lang/String;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.commons.gui.DBMonitorConsole this$0;
    descriptor: Lext/mods/commons/gui/DBMonitorConsole;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.DBMonitorConsole$1(ext.mods.commons.gui.DBMonitorConsole, java.lang.String, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/commons/gui/DBMonitorConsole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0000)
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$url:Ljava/lang/String;
         5: aload_0
         6: aload_3
         7: putfield      #7                  // Field val$user:Ljava/lang/String;
        10: aload_0
        11: aload         4
        13: putfield      #10                 // Field val$pass:Ljava/lang/String;
        16: aload_0
        17: aload_1
        18: dup
        19: invokestatic  #13                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        22: pop
        23: putfield      #19                 // Field this$0:Lext/mods/commons/gui/DBMonitorConsole;
        26: aload_0
        27: invokespecial #23                 // Method java/util/TimerTask."<init>":()V
        30: return
      LineNumberTable:
        line 213: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/commons/gui/DBMonitorConsole$1;
            0      31     1 this$0   Lext/mods/commons/gui/DBMonitorConsole;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic
      <no name>                      final synthetic
      <no name>                      final synthetic

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: getfield      #1                  // Field val$url:Ljava/lang/String;
         4: aload_0
         5: getfield      #7                  // Field val$user:Ljava/lang/String;
         8: aload_0
         9: getfield      #10                 // Field val$pass:Ljava/lang/String;
        12: invokestatic  #29                 // Method java/sql/DriverManager.getConnection:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Connection;
        15: astore_1
        16: aload_0
        17: getfield      #19                 // Field this$0:Lext/mods/commons/gui/DBMonitorConsole;
        20: aload_1
        21: invokevirtual #35                 // Method ext/mods/commons/gui/DBMonitorConsole.checkLongRunningQueries:(Ljava/sql/Connection;)V
        24: aload_1
        25: ifnull        59
        28: aload_1
        29: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
        34: goto          59
        37: astore_2
        38: aload_1
        39: ifnull        57
        42: aload_1
        43: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
        48: goto          57
        51: astore_3
        52: aload_2
        53: aload_3
        54: invokevirtual #48                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        57: aload_2
        58: athrow
        59: goto          106
        62: astore_1
        63: getstatic     #54                 // Field ext/mods/commons/gui/DBMonitorConsole.LOG:Ljava/util/logging/Logger;
        66: getstatic     #58                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        69: aload_1
        70: invokevirtual #64                 // Method java/sql/SQLException.getMessage:()Ljava/lang/String;
        73: invokedynamic #68,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        78: aload_1
        79: invokevirtual #72                 // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        82: aload_0
        83: getfield      #19                 // Field this$0:Lext/mods/commons/gui/DBMonitorConsole;
        86: aload_1
        87: invokevirtual #64                 // Method java/sql/SQLException.getMessage:()Ljava/lang/String;
        90: invokedynamic #78,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        95: lconst_0
        96: invokevirtual #79                 // Method ext/mods/commons/gui/DBMonitorConsole.logQuery:(Ljava/lang/String;J)V
        99: aload_0
       100: getfield      #19                 // Field this$0:Lext/mods/commons/gui/DBMonitorConsole;
       103: invokevirtual #83                 // Method ext/mods/commons/gui/DBMonitorConsole.stopMonitoring:()V
       106: return
      Exception table:
         from    to  target type
            16    24    37   Class java/lang/Throwable
            42    48    51   Class java/lang/Throwable
             0    59    62   Class java/sql/SQLException
      LineNumberTable:
        line 216: 0
        line 217: 16
        line 219: 24
        line 216: 37
        line 223: 59
        line 219: 62
        line 220: 63
        line 221: 82
        line 222: 99
        line 224: 106
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           16      43     1  conn   Ljava/sql/Connection;
           63      43     1     e   Ljava/sql/SQLException;
            0     107     0  this   Lext/mods/commons/gui/DBMonitorConsole$1;
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/commons/gui/DBMonitorConsole$1, class java/sql/Connection ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/commons/gui/DBMonitorConsole$1, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/sql/SQLException ]
        frame_type = 43 /* same */
}
SourceFile: "DBMonitorConsole.java"
EnclosingMethod: #36.#102               // ext.mods.commons.gui.DBMonitorConsole.startActiveMonitoring
NestHost: class ext/mods/commons/gui/DBMonitorConsole
BootstrapMethods:
  0: #111 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #107 Falha na consulta de monitoramento ativo: \u0001
  1: #111 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #109 ERRO FATAL NO MONITOR: Falha ao consultar o processlist. Monitoramento interrompido. Detalhe: \u0001
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/DBMonitorConsole$1
  public static final #122= #118 of #120; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
