// Bytecode for: ext.mods.commons.gui.InterfaceGSInfo$2
// File: ext\mods\commons\gui\InterfaceGSInfo$2.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceGSInfo$2.class
  Last modified 9 de jul de 2026; size 3519 bytes
  MD5 checksum cd32fcba5d7fc7f53571381b967c9c7c
  Compiled from "InterfaceGSInfo.java"
class ext.mods.commons.gui.InterfaceGSInfo$2 extends java.util.TimerTask
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/InterfaceGSInfo$2
  super_class: #14                        // java/util/TimerTask
  interfaces: 0, fields: 1, methods: 3, attributes: 5
Constant pool:
    #1 = Methodref          #2.#3         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #2 = Class              #4            // java/util/Objects
    #3 = NameAndType        #5:#6         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Utf8               java/util/Objects
    #5 = Utf8               requireNonNull
    #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #7 = Fieldref           #8.#9         // ext/mods/commons/gui/InterfaceGSInfo$2.this$0:Lext/mods/commons/gui/InterfaceGSInfo;
    #8 = Class              #10           // ext/mods/commons/gui/InterfaceGSInfo$2
    #9 = NameAndType        #11:#12       // this$0:Lext/mods/commons/gui/InterfaceGSInfo;
   #10 = Utf8               ext/mods/commons/gui/InterfaceGSInfo$2
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/commons/gui/InterfaceGSInfo;
   #13 = Methodref          #14.#15       // java/util/TimerTask."<init>":()V
   #14 = Class              #16           // java/util/TimerTask
   #15 = NameAndType        #17:#18       // "<init>":()V
   #16 = Utf8               java/util/TimerTask
   #17 = Utf8               <init>
   #18 = Utf8               ()V
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #20 = Class              #22           // ext/mods/gameserver/model/World
   #21 = NameAndType        #23:#24       // getInstance:()Lext/mods/gameserver/model/World;
   #22 = Utf8               ext/mods/gameserver/model/World
   #23 = Utf8               getInstance
   #24 = Utf8               ()Lext/mods/gameserver/model/World;
   #25 = Methodref          #20.#26       // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
   #26 = NameAndType        #27:#28       // getPlayers:()Ljava/util/Collection;
   #27 = Utf8               getPlayers
   #28 = Utf8               ()Ljava/util/Collection;
   #29 = InterfaceMethodref #30.#31       // java/util/Collection.size:()I
   #30 = Class              #32           // java/util/Collection
   #31 = NameAndType        #33:#34       // size:()I
   #32 = Utf8               java/util/Collection
   #33 = Utf8               size
   #34 = Utf8               ()I
   #35 = Fieldref           #20.#36       // ext/mods/gameserver/model/World.MAX_CONNECTED_COUNT:I
   #36 = NameAndType        #37:#38       // MAX_CONNECTED_COUNT:I
   #37 = Utf8               MAX_CONNECTED_COUNT
   #38 = Utf8               I
   #39 = Fieldref           #20.#40       // ext/mods/gameserver/model/World.OFFLINE_TRADE_COUNT:I
   #40 = NameAndType        #41:#38       // OFFLINE_TRADE_COUNT:I
   #41 = Utf8               OFFLINE_TRADE_COUNT
   #42 = Methodref          #43.#44       // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
   #43 = Class              #45           // java/lang/Runtime
   #44 = NameAndType        #46:#47       // getRuntime:()Ljava/lang/Runtime;
   #45 = Utf8               java/lang/Runtime
   #46 = Utf8               getRuntime
   #47 = Utf8               ()Ljava/lang/Runtime;
   #48 = Methodref          #43.#49       // java/lang/Runtime.totalMemory:()J
   #49 = NameAndType        #50:#51       // totalMemory:()J
   #50 = Utf8               totalMemory
   #51 = Utf8               ()J
   #52 = Methodref          #43.#53       // java/lang/Runtime.freeMemory:()J
   #53 = NameAndType        #54:#51       // freeMemory:()J
   #54 = Utf8               freeMemory
   #55 = Methodref          #56.#57       // java/lang/System.currentTimeMillis:()J
   #56 = Class              #58           // java/lang/System
   #57 = NameAndType        #59:#51       // currentTimeMillis:()J
   #58 = Utf8               java/lang/System
   #59 = Utf8               currentTimeMillis
   #60 = Fieldref           #61.#62       // ext/mods/commons/gui/InterfaceGSInfo.START_TIME:J
   #61 = Class              #63           // ext/mods/commons/gui/InterfaceGSInfo
   #62 = NameAndType        #64:#65       // START_TIME:J
   #63 = Utf8               ext/mods/commons/gui/InterfaceGSInfo
   #64 = Utf8               START_TIME
   #65 = Utf8               J
   #66 = Methodref          #61.#67       // ext/mods/commons/gui/InterfaceGSInfo.getDurationBreakdown:(J)Ljava/lang/String;
   #67 = NameAndType        #68:#69       // getDurationBreakdown:(J)Ljava/lang/String;
   #68 = Utf8               getDurationBreakdown
   #69 = Utf8               (J)Ljava/lang/String;
   #70 = InvokeDynamic      #0:#71        // #0:run:(Lext/mods/commons/gui/InterfaceGSInfo$2;Ljava/lang/String;IIIJJ)Ljava/lang/Runnable;
   #71 = NameAndType        #72:#73       // run:(Lext/mods/commons/gui/InterfaceGSInfo$2;Ljava/lang/String;IIIJJ)Ljava/lang/Runnable;
   #72 = Utf8               run
   #73 = Utf8               (Lext/mods/commons/gui/InterfaceGSInfo$2;Ljava/lang/String;IIIJJ)Ljava/lang/Runnable;
   #74 = Methodref          #75.#76       // javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
   #75 = Class              #77           // javax/swing/SwingUtilities
   #76 = NameAndType        #78:#79       // invokeLater:(Ljava/lang/Runnable;)V
   #77 = Utf8               javax/swing/SwingUtilities
   #78 = Utf8               invokeLater
   #79 = Utf8               (Ljava/lang/Runnable;)V
   #80 = Class              #81           // java/lang/Exception
   #81 = Utf8               java/lang/Exception
   #82 = Fieldref           #61.#83       // ext/mods/commons/gui/InterfaceGSInfo.rowUptime:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #83 = NameAndType        #84:#85       // rowUptime:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #84 = Utf8               rowUptime
   #85 = Utf8               Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #86 = Methodref          #87.#88       // ext/mods/commons/gui/InterfaceGSInfo$InfoRow.setValue:(Ljava/lang/String;)V
   #87 = Class              #89           // ext/mods/commons/gui/InterfaceGSInfo$InfoRow
   #88 = NameAndType        #90:#91       // setValue:(Ljava/lang/String;)V
   #89 = Utf8               ext/mods/commons/gui/InterfaceGSInfo$InfoRow
   #90 = Utf8               setValue
   #91 = Utf8               (Ljava/lang/String;)V
   #92 = Fieldref           #61.#93       // ext/mods/commons/gui/InterfaceGSInfo.rowOffline:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #93 = NameAndType        #94:#85       // rowOffline:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
   #94 = Utf8               rowOffline
   #95 = Methodref          #96.#97       // java/lang/String.valueOf:(I)Ljava/lang/String;
   #96 = Class              #98           // java/lang/String
   #97 = NameAndType        #99:#100      // valueOf:(I)Ljava/lang/String;
   #98 = Utf8               java/lang/String
   #99 = Utf8               valueOf
  #100 = Utf8               (I)Ljava/lang/String;
  #101 = Fieldref           #61.#102      // ext/mods/commons/gui/InterfaceGSInfo.rowPlayers:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
  #102 = NameAndType        #103:#85      // rowPlayers:Lext/mods/commons/gui/InterfaceGSInfo$InfoRow;
  #103 = Utf8               rowPlayers
  #104 = InvokeDynamic      #1:#105       // #1:makeConcatWithConstants:(II)Ljava/lang/String;
  #105 = NameAndType        #106:#107     // makeConcatWithConstants:(II)Ljava/lang/String;
  #106 = Utf8               makeConcatWithConstants
  #107 = Utf8               (II)Ljava/lang/String;
  #108 = Fieldref           #61.#109      // ext/mods/commons/gui/InterfaceGSInfo.barMemory:Lext/mods/commons/gui/InterfaceGSInfo$MetricBar;
  #109 = NameAndType        #110:#111     // barMemory:Lext/mods/commons/gui/InterfaceGSInfo$MetricBar;
  #110 = Utf8               barMemory
  #111 = Utf8               Lext/mods/commons/gui/InterfaceGSInfo$MetricBar;
  #112 = String             #113          // Memory
  #113 = Utf8               Memory
  #114 = Methodref          #61.#115      // ext/mods/commons/gui/InterfaceGSInfo.formatMemorySize:(J)Ljava/lang/String;
  #115 = NameAndType        #116:#69      // formatMemorySize:(J)Ljava/lang/String;
  #116 = Utf8               formatMemorySize
  #117 = InvokeDynamic      #2:#118       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #118 = NameAndType        #106:#119     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #119 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #120 = Long               1024l
  #122 = Methodref          #123.#124     // ext/mods/commons/gui/InterfaceGSInfo$MetricBar.set:(Ljava/lang/String;Ljava/lang/String;II)V
  #123 = Class              #125          // ext/mods/commons/gui/InterfaceGSInfo$MetricBar
  #124 = NameAndType        #126:#127     // set:(Ljava/lang/String;Ljava/lang/String;II)V
  #125 = Utf8               ext/mods/commons/gui/InterfaceGSInfo$MetricBar
  #126 = Utf8               set
  #127 = Utf8               (Ljava/lang/String;Ljava/lang/String;II)V
  #128 = Utf8               (Lext/mods/commons/gui/InterfaceGSInfo;)V
  #129 = Utf8               Code
  #130 = Utf8               LineNumberTable
  #131 = Utf8               LocalVariableTable
  #132 = Utf8               this
  #133 = Utf8               Lext/mods/commons/gui/InterfaceGSInfo$2;
  #134 = Utf8               MethodParameters
  #135 = Utf8               playerCount
  #136 = Utf8               maxOnline
  #137 = Utf8               offlineCount
  #138 = Utf8               rt
  #139 = Utf8               Ljava/lang/Runtime;
  #140 = Utf8               usedMemory
  #141 = Utf8               uptimeStr
  #142 = Utf8               Ljava/lang/String;
  #143 = Utf8               StackMapTable
  #144 = Utf8               lambda$run$0
  #145 = Utf8               (Ljava/lang/String;IIIJJ)V
  #146 = Utf8               SourceFile
  #147 = Utf8               InterfaceGSInfo.java
  #148 = Utf8               EnclosingMethod
  #149 = NameAndType        #150:#18      // startUpdateTask:()V
  #150 = Utf8               startUpdateTask
  #151 = Utf8               NestHost
  #152 = Utf8               BootstrapMethods
  #153 = MethodType         #18           //  ()V
  #154 = MethodHandle       5:#155        // REF_invokeVirtual ext/mods/commons/gui/InterfaceGSInfo$2.lambda$run$0:(Ljava/lang/String;IIIJJ)V
  #155 = Methodref          #8.#156       // ext/mods/commons/gui/InterfaceGSInfo$2.lambda$run$0:(Ljava/lang/String;IIIJJ)V
  #156 = NameAndType        #144:#145     // lambda$run$0:(Ljava/lang/String;IIIJJ)V
  #157 = String             #158          // \u0001 / \u0001 (Max)
  #158 = Utf8               \u0001 / \u0001 (Max)
  #159 = String             #160          // \u0001 / \u0001
  #160 = Utf8               \u0001 / \u0001
  #161 = MethodHandle       6:#162        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #162 = Methodref          #163.#164     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #163 = Class              #165          // java/lang/invoke/LambdaMetafactory
  #164 = NameAndType        #166:#167     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #165 = Utf8               java/lang/invoke/LambdaMetafactory
  #166 = Utf8               metafactory
  #167 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #168 = MethodHandle       6:#169        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #169 = Methodref          #170.#171     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #170 = Class              #172          // java/lang/invoke/StringConcatFactory
  #171 = NameAndType        #106:#173     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #172 = Utf8               java/lang/invoke/StringConcatFactory
  #173 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #174 = Utf8               InnerClasses
  #175 = Utf8               InfoRow
  #176 = Utf8               MetricBar
  #177 = Class              #178          // java/lang/invoke/MethodHandles$Lookup
  #178 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #179 = Class              #180          // java/lang/invoke/MethodHandles
  #180 = Utf8               java/lang/invoke/MethodHandles
  #181 = Utf8               Lookup
{
  final ext.mods.commons.gui.InterfaceGSInfo this$0;
    descriptor: Lext/mods/commons/gui/InterfaceGSInfo;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceGSInfo$2(ext.mods.commons.gui.InterfaceGSInfo);
    descriptor: (Lext/mods/commons/gui/InterfaceGSInfo;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceGSInfo;
        10: aload_0
        11: invokespecial #13                 // Method java/util/TimerTask."<init>":()V
        14: return
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/InterfaceGSInfo$2;
            0      15     1 this$0   Lext/mods/commons/gui/InterfaceGSInfo;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=10, args_size=1
         0: invokestatic  #19                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: invokevirtual #25                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
         6: invokeinterface #29,  1           // InterfaceMethod java/util/Collection.size:()I
        11: istore_1
        12: invokestatic  #19                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        15: getfield      #35                 // Field ext/mods/gameserver/model/World.MAX_CONNECTED_COUNT:I
        18: iload_1
        19: if_icmpge     29
        22: invokestatic  #19                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        25: iload_1
        26: putfield      #35                 // Field ext/mods/gameserver/model/World.MAX_CONNECTED_COUNT:I
        29: invokestatic  #19                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        32: getfield      #35                 // Field ext/mods/gameserver/model/World.MAX_CONNECTED_COUNT:I
        35: istore_2
        36: invokestatic  #19                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        39: getfield      #39                 // Field ext/mods/gameserver/model/World.OFFLINE_TRADE_COUNT:I
        42: istore_3
        43: invokestatic  #42                 // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        46: astore        4
        48: aload         4
        50: invokevirtual #48                 // Method java/lang/Runtime.totalMemory:()J
        53: lstore        5
        55: lload         5
        57: aload         4
        59: invokevirtual #52                 // Method java/lang/Runtime.freeMemory:()J
        62: lsub
        63: lstore        7
        65: invokestatic  #55                 // Method java/lang/System.currentTimeMillis:()J
        68: getstatic     #60                 // Field ext/mods/commons/gui/InterfaceGSInfo.START_TIME:J
        71: lsub
        72: invokestatic  #66                 // Method ext/mods/commons/gui/InterfaceGSInfo.getDurationBreakdown:(J)Ljava/lang/String;
        75: astore        9
        77: aload_0
        78: aload         9
        80: iload_3
        81: iload_1
        82: iload_2
        83: lload         7
        85: lload         5
        87: invokedynamic #70,  0             // InvokeDynamic #0:run:(Lext/mods/commons/gui/InterfaceGSInfo$2;Ljava/lang/String;IIIJJ)Ljava/lang/Runnable;
        92: invokestatic  #74                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        95: goto          99
        98: astore_1
        99: return
      Exception table:
         from    to  target type
             0    95    98   Class java/lang/Exception
      LineNumberTable:
        line 97: 0
        line 98: 12
        line 99: 22
        line 102: 29
        line 103: 36
        line 105: 43
        line 106: 48
        line 107: 55
        line 109: 65
        line 111: 77
        line 123: 95
        line 124: 99
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      83     1 playerCount   I
           36      59     2 maxOnline   I
           43      52     3 offlineCount   I
           48      47     4    rt   Ljava/lang/Runtime;
           55      40     5 totalMemory   J
           65      30     7 usedMemory   J
           77      18     9 uptimeStr   Ljava/lang/String;
            0     100     0  this   Lext/mods/commons/gui/InterfaceGSInfo$2;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/commons/gui/InterfaceGSInfo$2 ]
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */
}
SourceFile: "InterfaceGSInfo.java"
EnclosingMethod: #61.#149               // ext.mods.commons.gui.InterfaceGSInfo.startUpdateTask
NestHost: class ext/mods/commons/gui/InterfaceGSInfo
BootstrapMethods:
  0: #161 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #153 ()V
      #154 REF_invokeVirtual ext/mods/commons/gui/InterfaceGSInfo$2.lambda$run$0:(Ljava/lang/String;IIIJJ)V
      #153 ()V
  1: #168 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #157 \u0001 / \u0001 (Max)
  2: #168 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #159 \u0001 / \u0001
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/InterfaceGSInfo$2
  public static final #181= #177 of #179; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
