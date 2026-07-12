// Bytecode for: ext.mods.gameserver.data.xml.ScriptData$Scheduler
// File: ext\mods\gameserver\data\xml\ScriptData$Scheduler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/ScriptData$Scheduler.class
  Last modified 9 de jul de 2026; size 1330 bytes
  MD5 checksum 537492312a9ba364650c4465632b6f1b
  Compiled from "ScriptData.java"
final class ext.mods.gameserver.data.xml.ScriptData$Scheduler implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/data/xml/ScriptData$Scheduler
  super_class: #10                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/data/xml/ScriptData
   #2 = Utf8               ext/mods/gameserver/data/xml/ScriptData
   #3 = Methodref          #4.#5          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Class              #6             // java/util/Objects
   #5 = NameAndType        #7:#8          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #6 = Utf8               java/util/Objects
   #7 = Utf8               requireNonNull
   #8 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #9 = Methodref          #10.#11        // java/lang/Object."<init>":()V
  #10 = Class              #12            // java/lang/Object
  #11 = NameAndType        #13:#14        // "<init>":()V
  #12 = Utf8               java/lang/Object
  #13 = Utf8               <init>
  #14 = Utf8               ()V
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/data/xml/ScriptData$Scheduler._script:Lext/mods/gameserver/scripting/ScheduledQuest;
  #16 = Class              #18            // ext/mods/gameserver/data/xml/ScriptData$Scheduler
  #17 = NameAndType        #19:#20        // _script:Lext/mods/gameserver/scripting/ScheduledQuest;
  #18 = Utf8               ext/mods/gameserver/data/xml/ScriptData$Scheduler
  #19 = Utf8               _script
  #20 = Utf8               Lext/mods/gameserver/scripting/ScheduledQuest;
  #21 = Methodref          #22.#23        // ext/mods/gameserver/scripting/ScheduledQuest.notifyAndSchedule:()V
  #22 = Class              #24            // ext/mods/gameserver/scripting/ScheduledQuest
  #23 = NameAndType        #25:#14        // notifyAndSchedule:()V
  #24 = Utf8               ext/mods/gameserver/scripting/ScheduledQuest
  #25 = Utf8               notifyAndSchedule
  #26 = Methodref          #27.#28        // java/lang/System.currentTimeMillis:()J
  #27 = Class              #29            // java/lang/System
  #28 = NameAndType        #30:#31        // currentTimeMillis:()J
  #29 = Utf8               java/lang/System
  #30 = Utf8               currentTimeMillis
  #31 = Utf8               ()J
  #32 = Long               300000l
  #34 = Methodref          #22.#35        // ext/mods/gameserver/scripting/ScheduledQuest.getTimeNext:()J
  #35 = NameAndType        #36:#31        // getTimeNext:()J
  #36 = Utf8               getTimeNext
  #37 = Methodref          #38.#39        // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #38 = Class              #40            // ext/mods/commons/pool/ThreadPool
  #39 = NameAndType        #41:#42        // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #40 = Utf8               ext/mods/commons/pool/ThreadPool
  #41 = Utf8               schedule
  #42 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #43 = Methodref          #22.#44        // ext/mods/gameserver/scripting/ScheduledQuest.setTask:(Ljava/util/concurrent/ScheduledFuture;)V
  #44 = NameAndType        #45:#46        // setTask:(Ljava/util/concurrent/ScheduledFuture;)V
  #45 = Utf8               setTask
  #46 = Utf8               (Ljava/util/concurrent/ScheduledFuture;)V
  #47 = Class              #48            // java/lang/Runnable
  #48 = Utf8               java/lang/Runnable
  #49 = Utf8               (Lext/mods/gameserver/data/xml/ScriptData;Lext/mods/gameserver/scripting/ScheduledQuest;)V
  #50 = Utf8               Code
  #51 = Utf8               LineNumberTable
  #52 = Utf8               LocalVariableTable
  #53 = Utf8               this
  #54 = Utf8               Lext/mods/gameserver/data/xml/ScriptData$Scheduler;
  #55 = Utf8               script
  #56 = Utf8               MethodParameters
  #57 = Utf8               run
  #58 = Utf8               eta
  #59 = Utf8               J
  #60 = Utf8               StackMapTable
  #61 = Utf8               SourceFile
  #62 = Utf8               ScriptData.java
  #63 = Utf8               NestHost
  #64 = Utf8               InnerClasses
  #65 = Utf8               Scheduler
{
  protected ext.mods.gameserver.data.xml.ScriptData$Scheduler(ext.mods.gameserver.data.xml.ScriptData, ext.mods.gameserver.scripting.ScheduledQuest);
    descriptor: (Lext/mods/gameserver/data/xml/ScriptData;Lext/mods/gameserver/scripting/ScheduledQuest;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: dup
         2: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokespecial #9                  // Method java/lang/Object."<init>":()V
        11: aload_0
        12: aload_2
        13: putfield      #15                 // Field _script:Lext/mods/gameserver/scripting/ScheduledQuest;
        16: return
      LineNumberTable:
        line 185: 0
        line 186: 11
        line 187: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/ScriptData$Scheduler;
            0      17     2 script   Lext/mods/gameserver/scripting/ScheduledQuest;
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic
      <no name>

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _script:Lext/mods/gameserver/scripting/ScheduledQuest;
         4: invokevirtual #21                 // Method ext/mods/gameserver/scripting/ScheduledQuest.notifyAndSchedule:()V
         7: invokestatic  #26                 // Method java/lang/System.currentTimeMillis:()J
        10: ldc2_w        #32                 // long 300000l
        13: ladd
        14: aload_0
        15: getfield      #15                 // Field _script:Lext/mods/gameserver/scripting/ScheduledQuest;
        18: invokevirtual #34                 // Method ext/mods/gameserver/scripting/ScheduledQuest.getTimeNext:()J
        21: lsub
        22: lstore_1
        23: lload_1
        24: lconst_0
        25: lcmp
        26: ifle          45
        29: aload_0
        30: getfield      #15                 // Field _script:Lext/mods/gameserver/scripting/ScheduledQuest;
        33: aload_0
        34: ldc2_w        #32                 // long 300000l
        37: lload_1
        38: lsub
        39: invokestatic  #37                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        42: invokevirtual #43                 // Method ext/mods/gameserver/scripting/ScheduledQuest.setTask:(Ljava/util/concurrent/ScheduledFuture;)V
        45: return
      LineNumberTable:
        line 192: 0
        line 194: 7
        line 195: 23
        line 196: 29
        line 197: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/data/xml/ScriptData$Scheduler;
           23      23     1   eta   J
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ long ]
}
SourceFile: "ScriptData.java"
NestHost: class ext/mods/gameserver/data/xml/ScriptData
