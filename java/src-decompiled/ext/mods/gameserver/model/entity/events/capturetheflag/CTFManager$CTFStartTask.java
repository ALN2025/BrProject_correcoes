// Bytecode for: ext.mods.gameserver.model.entity.events.capturetheflag.CTFManager$CTFStartTask
// File: ext\mods\gameserver\model\entity\events\capturetheflag\CTFManager$CTFStartTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask.class
  Last modified 9 de jul de 2026; size 3433 bytes
  MD5 checksum c7acc2ff5c6b6d9b03576744a9a7a9d5
  Compiled from "CTFManager.java"
class ext.mods.gameserver.model.entity.events.capturetheflag.CTFManager$CTFStartTask implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 3, methods: 4, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #2 = Class              #4            // java/util/Objects
    #3 = NameAndType        #5:#6         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Utf8               java/util/Objects
    #5 = Utf8               requireNonNull
    #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask.this$0:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
    #8 = Class              #10           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask
    #9 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
   #10 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
   #13 = Methodref          #14.#15       // java/lang/Object."<init>":()V
   #14 = Class              #16           // java/lang/Object
   #15 = NameAndType        #17:#18       // "<init>":()V
   #16 = Utf8               java/lang/Object
   #17 = Utf8               <init>
   #18 = Utf8               ()V
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask._startTime:J
   #20 = NameAndType        #21:#22       // _startTime:J
   #21 = Utf8               _startTime
   #22 = Utf8               J
   #23 = Methodref          #24.#25       // java/lang/System.currentTimeMillis:()J
   #24 = Class              #26           // java/lang/System
   #25 = NameAndType        #27:#28       // currentTimeMillis:()J
   #26 = Utf8               java/lang/System
   #27 = Utf8               currentTimeMillis
   #28 = Utf8               ()J
   #29 = Double             1000.0d
   #31 = Methodref          #32.#33       // java/lang/Math.round:(D)J
   #32 = Class              #34           // java/lang/Math
   #33 = NameAndType        #35:#36       // round:(D)J
   #34 = Utf8               java/lang/Math
   #35 = Utf8               round
   #36 = Utf8               (D)J
   #37 = Methodref          #8.#38        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask.announce:(J)V
   #38 = NameAndType        #39:#40       // announce:(J)V
   #39 = Utf8               announce
   #40 = Utf8               (J)V
   #41 = Methodref          #42.#43       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #42 = Class              #44           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #43 = NameAndType        #45:#46       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #44 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #45 = Utf8               getInstance
   #46 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #47 = Methodref          #42.#48       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isInactive:()Z
   #48 = NameAndType        #49:#50       // isInactive:()Z
   #49 = Utf8               isInactive
   #50 = Utf8               ()Z
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.startReg:()V
   #52 = Class              #54           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
   #53 = NameAndType        #55:#18       // startReg:()V
   #54 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
   #55 = Utf8               startReg
   #56 = Methodref          #42.#57       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
   #57 = NameAndType        #58:#50       // isParticipating:()Z
   #58 = Utf8               isParticipating
   #59 = Methodref          #52.#60       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.startEvent:()V
   #60 = NameAndType        #61:#18       // startEvent:()V
   #61 = Utf8               startEvent
   #62 = Methodref          #52.#63       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.endEvent:()V
   #63 = NameAndType        #64:#18       // endEvent:()V
   #64 = Utf8               endEvent
   #65 = Methodref          #66.#67       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #66 = Class              #68           // ext/mods/commons/pool/ThreadPool
   #67 = NameAndType        #69:#70       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #68 = Utf8               ext/mods/commons/pool/ThreadPool
   #69 = Utf8               schedule
   #70 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #71 = Fieldref           #8.#72        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask.nextRun:Ljava/util/concurrent/ScheduledFuture;
   #72 = NameAndType        #73:#74       // nextRun:Ljava/util/concurrent/ScheduledFuture;
   #73 = Utf8               nextRun
   #74 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #75 = Long               3600l
   #77 = Long               60l
   #79 = InvokeDynamic      #0:#80        // #0:makeConcatWithConstants:(J)Ljava/lang/String;
   #80 = NameAndType        #81:#82       // makeConcatWithConstants:(J)Ljava/lang/String;
   #81 = Utf8               makeConcatWithConstants
   #82 = Utf8               (J)Ljava/lang/String;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
   #84 = Class              #86           // ext/mods/gameserver/model/World
   #85 = NameAndType        #87:#88       // announceToOnlinePlayers:(Ljava/lang/String;)V
   #86 = Utf8               ext/mods/gameserver/model/World
   #87 = Utf8               announceToOnlinePlayers
   #88 = Utf8               (Ljava/lang/String;)V
   #89 = Methodref          #42.#90       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
   #90 = NameAndType        #91:#50       // isStarted:()Z
   #91 = Utf8               isStarted
   #92 = InvokeDynamic      #1:#80        // #1:makeConcatWithConstants:(J)Ljava/lang/String;
   #93 = Methodref          #42.#94       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
   #94 = NameAndType        #95:#88       // sysMsgToAllParticipants:(Ljava/lang/String;)V
   #95 = Utf8               sysMsgToAllParticipants
   #96 = InvokeDynamic      #2:#80        // #2:makeConcatWithConstants:(J)Ljava/lang/String;
   #97 = InvokeDynamic      #3:#80        // #3:makeConcatWithConstants:(J)Ljava/lang/String;
   #98 = InvokeDynamic      #4:#80        // #4:makeConcatWithConstants:(J)Ljava/lang/String;
   #99 = InvokeDynamic      #5:#80        // #5:makeConcatWithConstants:(J)Ljava/lang/String;
  #100 = Class              #101          // java/lang/Runnable
  #101 = Utf8               java/lang/Runnable
  #102 = Utf8               Signature
  #103 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #104 = Utf8               (Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;J)V
  #105 = Utf8               Code
  #106 = Utf8               LineNumberTable
  #107 = Utf8               LocalVariableTable
  #108 = Utf8               this
  #109 = Utf8               Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
  #110 = Utf8               startTime
  #111 = Utf8               MethodParameters
  #112 = Utf8               setStartTime
  #113 = Utf8               run
  #114 = Utf8               delay
  #115 = Utf8               I
  #116 = Utf8               nextMsg
  #117 = Utf8               StackMapTable
  #118 = Utf8               time
  #119 = Utf8               SourceFile
  #120 = Utf8               CTFManager.java
  #121 = Utf8               NestHost
  #122 = Utf8               BootstrapMethods
  #123 = String             #124          // CTF Event: \u0001 hour(s) until registration is closed!
  #124 = Utf8               CTF Event: \u0001 hour(s) until registration is closed!
  #125 = String             #126          // \u0001 hour(s) until event is finished!
  #126 = Utf8               \u0001 hour(s) until event is finished!
  #127 = String             #128          // CTF Event: \u0001 minute(s) until registration is closed!
  #128 = Utf8               CTF Event: \u0001 minute(s) until registration is closed!
  #129 = String             #130          // \u0001 minute(s) until the event is finished!
  #130 = Utf8               \u0001 minute(s) until the event is finished!
  #131 = String             #132          // CTF Event: \u0001 second(s) until registration is closed!
  #132 = Utf8               CTF Event: \u0001 second(s) until registration is closed!
  #133 = String             #134          // \u0001 second(s) until the event is finished!
  #134 = Utf8               \u0001 second(s) until the event is finished!
  #135 = MethodHandle       6:#136        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #136 = Methodref          #137.#138     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #137 = Class              #139          // java/lang/invoke/StringConcatFactory
  #138 = NameAndType        #81:#140      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #139 = Utf8               java/lang/invoke/StringConcatFactory
  #140 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #141 = Utf8               InnerClasses
  #142 = Utf8               CTFStartTask
  #143 = Class              #144          // java/lang/invoke/MethodHandles$Lookup
  #144 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #145 = Class              #146          // java/lang/invoke/MethodHandles
  #146 = Utf8               java/lang/invoke/MethodHandles
  #147 = Utf8               Lookup
{
  public java.util.concurrent.ScheduledFuture<?> nextRun;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0001) ACC_PUBLIC
    Signature: #103                         // Ljava/util/concurrent/ScheduledFuture<*>;

  final ext.mods.gameserver.model.entity.events.capturetheflag.CTFManager this$0;
    descriptor: Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  public ext.mods.gameserver.model.entity.events.capturetheflag.CTFManager$CTFStartTask(ext.mods.gameserver.model.entity.events.capturetheflag.CTFManager, long);
    descriptor: (Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: aload_0
        15: lload_2
        16: putfield      #19                 // Field _startTime:J
        19: return
      LineNumberTable:
        line 190: 0
        line 191: 14
        line 192: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
            0      20     1 this$0   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
            0      20     2 startTime   J
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>

  public void setStartTime(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #19                 // Field _startTime:J
         5: return
      LineNumberTable:
        line 196: 0
        line 197: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
            0       6     1 startTime   J

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _startTime:J
         4: invokestatic  #23                 // Method java/lang/System.currentTimeMillis:()J
         7: lsub
         8: l2d
         9: ldc2_w        #29                 // double 1000.0d
        12: ddiv
        13: invokestatic  #31                 // Method java/lang/Math.round:(D)J
        16: l2i
        17: istore_1
        18: iload_1
        19: ifle          28
        22: aload_0
        23: iload_1
        24: i2l
        25: invokevirtual #37                 // Method announce:(J)V
        28: iconst_0
        29: istore_2
        30: iload_1
        31: sipush        3600
        34: if_icmple     46
        37: iload_1
        38: sipush        3600
        41: isub
        42: istore_2
        43: goto          190
        46: iload_1
        47: sipush        1800
        50: if_icmple     62
        53: iload_1
        54: sipush        1800
        57: isub
        58: istore_2
        59: goto          190
        62: iload_1
        63: sipush        900
        66: if_icmple     78
        69: iload_1
        70: sipush        900
        73: isub
        74: istore_2
        75: goto          190
        78: iload_1
        79: sipush        600
        82: if_icmple     94
        85: iload_1
        86: sipush        600
        89: isub
        90: istore_2
        91: goto          190
        94: iload_1
        95: sipush        300
        98: if_icmple     110
       101: iload_1
       102: sipush        300
       105: isub
       106: istore_2
       107: goto          190
       110: iload_1
       111: bipush        60
       113: if_icmple     124
       116: iload_1
       117: bipush        60
       119: isub
       120: istore_2
       121: goto          190
       124: iload_1
       125: iconst_5
       126: if_icmple     136
       129: iload_1
       130: iconst_5
       131: isub
       132: istore_2
       133: goto          190
       136: iload_1
       137: ifle          145
       140: iload_1
       141: istore_2
       142: goto          190
       145: invokestatic  #41                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       148: invokevirtual #47                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isInactive:()Z
       151: ifeq          164
       154: aload_0
       155: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
       158: invokevirtual #51                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.startReg:()V
       161: goto          190
       164: invokestatic  #41                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       167: invokevirtual #56                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
       170: ifeq          183
       173: aload_0
       174: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
       177: invokevirtual #59                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.startEvent:()V
       180: goto          190
       183: aload_0
       184: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
       187: invokevirtual #62                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.endEvent:()V
       190: iload_1
       191: ifle          208
       194: aload_0
       195: aload_0
       196: iload_2
       197: sipush        1000
       200: imul
       201: i2l
       202: invokestatic  #65                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       205: putfield      #71                 // Field nextRun:Ljava/util/concurrent/ScheduledFuture;
       208: return
      LineNumberTable:
        line 202: 0
        line 204: 18
        line 205: 22
        line 207: 28
        line 208: 30
        line 209: 37
        line 210: 46
        line 211: 53
        line 212: 62
        line 213: 69
        line 214: 78
        line 215: 85
        line 216: 94
        line 217: 101
        line 218: 110
        line 219: 116
        line 220: 124
        line 221: 129
        line 222: 136
        line 223: 140
        line 226: 145
        line 227: 154
        line 228: 164
        line 229: 173
        line 231: 183
        line 234: 190
        line 235: 194
        line 236: 208
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     209     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
           18     191     1 delay   I
           30     179     2 nextMsg   I
      StackMapTable: number_of_entries = 13
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 13 /* same */
        frame_type = 11 /* same */
        frame_type = 8 /* same */
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 6 /* same */
        frame_type = 17 /* same */
}
SourceFile: "CTFManager.java"
NestHost: class ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
BootstrapMethods:
  0: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #123 CTF Event: \u0001 hour(s) until registration is closed!
  1: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #125 \u0001 hour(s) until event is finished!
  2: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #127 CTF Event: \u0001 minute(s) until registration is closed!
  3: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #129 \u0001 minute(s) until the event is finished!
  4: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #131 CTF Event: \u0001 second(s) until registration is closed!
  5: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #133 \u0001 second(s) until the event is finished!
InnerClasses:
  #142= #8 of #52;                        // CTFStartTask=class ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask of class ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
  public static final #147= #143 of #145; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
