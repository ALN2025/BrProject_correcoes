// Bytecode for: ext.mods.fakeplayer.FakePlayerTaskManager
// File: ext\mods\fakeplayer\FakePlayerTaskManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/FakePlayerTaskManager.class
  Last modified 9 de jul de 2026; size 2258 bytes
  MD5 checksum c17dcd0f0a6415595942c396e23b4544
  Compiled from "FakePlayerTaskManager.java"
public class ext.mods.fakeplayer.FakePlayerTaskManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/FakePlayerTaskManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 8, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/fakeplayer/FakePlayerTaskManager.aiTaskRunnerInterval:I
   #8 = Class              #10            // ext/mods/fakeplayer/FakePlayerTaskManager
   #9 = NameAndType        #11:#12        // aiTaskRunnerInterval:I
  #10 = Utf8               ext/mods/fakeplayer/FakePlayerTaskManager
  #11 = Utf8               aiTaskRunnerInterval
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/fakeplayer/FakePlayerTaskManager._playerCountPerTask:I
  #14 = NameAndType        #15:#12        // _playerCountPerTask:I
  #15 = Utf8               _playerCountPerTask
  #16 = Class              #17            // ext/mods/fakeplayer/task/AITaskRunner
  #17 = Utf8               ext/mods/fakeplayer/task/AITaskRunner
  #18 = Methodref          #16.#3         // ext/mods/fakeplayer/task/AITaskRunner."<init>":()V
  #19 = Long               700l
  #21 = Methodref          #22.#23        // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #22 = Class              #24            // ext/mods/commons/pool/ThreadPool
  #23 = NameAndType        #25:#26        // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #24 = Utf8               ext/mods/commons/pool/ThreadPool
  #25 = Utf8               scheduleAtFixedRate
  #26 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #27 = Class              #28            // java/util/ArrayList
  #28 = Utf8               java/util/ArrayList
  #29 = Methodref          #27.#3         // java/util/ArrayList."<init>":()V
  #30 = Fieldref           #8.#31         // ext/mods/fakeplayer/FakePlayerTaskManager._aiTasks:Ljava/util/List;
  #31 = NameAndType        #32:#33        // _aiTasks:Ljava/util/List;
  #32 = Utf8               _aiTasks
  #33 = Utf8               Ljava/util/List;
  #34 = Methodref          #35.#36        // ext/mods/fakeplayer/FakePlayerManager.getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
  #35 = Class              #37            // ext/mods/fakeplayer/FakePlayerManager
  #36 = NameAndType        #38:#39        // getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
  #37 = Utf8               ext/mods/fakeplayer/FakePlayerManager
  #38 = Utf8               getInstance
  #39 = Utf8               ()Lext/mods/fakeplayer/FakePlayerManager;
  #40 = Methodref          #35.#41        // ext/mods/fakeplayer/FakePlayerManager.getFakePlayersCount:()I
  #41 = NameAndType        #42:#43        // getFakePlayersCount:()I
  #42 = Utf8               getFakePlayersCount
  #43 = Utf8               ()I
  #44 = Methodref          #8.#45         // ext/mods/fakeplayer/FakePlayerTaskManager.calculateTasksNeeded:(I)I
  #45 = NameAndType        #46:#47        // calculateTasksNeeded:(I)I
  #46 = Utf8               calculateTasksNeeded
  #47 = Utf8               (I)I
  #48 = InterfaceMethodref #49.#50        // java/util/List.clear:()V
  #49 = Class              #51            // java/util/List
  #50 = NameAndType        #52:#6         // clear:()V
  #51 = Utf8               java/util/List
  #52 = Utf8               clear
  #53 = Class              #54            // ext/mods/fakeplayer/task/AITask
  #54 = Utf8               ext/mods/fakeplayer/task/AITask
  #55 = Methodref          #53.#56        // ext/mods/fakeplayer/task/AITask."<init>":(II)V
  #56 = NameAndType        #5:#57         // "<init>":(II)V
  #57 = Utf8               (II)V
  #58 = InterfaceMethodref #49.#59        // java/util/List.add:(Ljava/lang/Object;)Z
  #59 = NameAndType        #60:#61        // add:(Ljava/lang/Object;)Z
  #60 = Utf8               add
  #61 = Utf8               (Ljava/lang/Object;)Z
  #62 = InterfaceMethodref #49.#63        // java/util/List.size:()I
  #63 = NameAndType        #64:#43        // size:()I
  #64 = Utf8               size
  #65 = Fieldref           #66.#67        // ext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder._instance:Lext/mods/fakeplayer/FakePlayerTaskManager;
  #66 = Class              #68            // ext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder
  #67 = NameAndType        #69:#70        // _instance:Lext/mods/fakeplayer/FakePlayerTaskManager;
  #68 = Utf8               ext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder
  #69 = Utf8               _instance
  #70 = Utf8               Lext/mods/fakeplayer/FakePlayerTaskManager;
  #71 = Utf8               ConstantValue
  #72 = Integer            700
  #73 = Integer            2000
  #74 = Utf8               Signature
  #75 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/task/AITask;>;
  #76 = Utf8               Code
  #77 = Utf8               LineNumberTable
  #78 = Utf8               LocalVariableTable
  #79 = Utf8               this
  #80 = Utf8               initialise
  #81 = Utf8               adjustTaskSize
  #82 = Utf8               from
  #83 = Utf8               to
  #84 = Utf8               i
  #85 = Utf8               fakePlayerCount
  #86 = Utf8               tasksNeeded
  #87 = Utf8               StackMapTable
  #88 = Utf8               getPlayerCountPerTask
  #89 = Utf8               getTaskCount
  #90 = Utf8               getAITasks
  #91 = Utf8               ()Ljava/util/List;
  #92 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/task/AITask;>;
  #93 = Utf8               ()Lext/mods/fakeplayer/FakePlayerTaskManager;
  #94 = Utf8               SourceFile
  #95 = Utf8               FakePlayerTaskManager.java
  #96 = Utf8               NestMembers
  #97 = Utf8               InnerClasses
  #98 = Utf8               SingletonHolder
{
  public ext.mods.fakeplayer.FakePlayerTaskManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: sipush        700
         8: putfield      #7                  // Field aiTaskRunnerInterval:I
        11: aload_0
        12: sipush        2000
        15: putfield      #13                 // Field _playerCountPerTask:I
        18: return
      LineNumberTable:
        line 28: 0
        line 30: 4
        line 31: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/fakeplayer/FakePlayerTaskManager;

  public void initialise();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: new           #16                 // class ext/mods/fakeplayer/task/AITaskRunner
         3: dup
         4: invokespecial #18                 // Method ext/mods/fakeplayer/task/AITaskRunner."<init>":()V
         7: ldc2_w        #19                 // long 700l
        10: ldc2_w        #19                 // long 700l
        13: invokestatic  #21                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        16: pop
        17: aload_0
        18: new           #27                 // class java/util/ArrayList
        21: dup
        22: invokespecial #29                 // Method java/util/ArrayList."<init>":()V
        25: putfield      #30                 // Field _aiTasks:Ljava/util/List;
        28: return
      LineNumberTable:
        line 36: 0
        line 37: 17
        line 38: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/fakeplayer/FakePlayerTaskManager;

  public void adjustTaskSize();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=1
         0: invokestatic  #34                 // Method ext/mods/fakeplayer/FakePlayerManager.getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
         3: invokevirtual #40                 // Method ext/mods/fakeplayer/FakePlayerManager.getFakePlayersCount:()I
         6: istore_1
         7: aload_0
         8: iload_1
         9: invokevirtual #44                 // Method calculateTasksNeeded:(I)I
        12: istore_2
        13: aload_0
        14: getfield      #30                 // Field _aiTasks:Ljava/util/List;
        17: invokeinterface #48,  1           // InterfaceMethod java/util/List.clear:()V
        22: iconst_0
        23: istore_3
        24: iload_3
        25: iload_2
        26: if_icmpge     72
        29: iload_3
        30: sipush        2000
        33: imul
        34: istore        4
        36: iload_3
        37: iconst_1
        38: iadd
        39: sipush        2000
        42: imul
        43: istore        5
        45: aload_0
        46: getfield      #30                 // Field _aiTasks:Ljava/util/List;
        49: new           #53                 // class ext/mods/fakeplayer/task/AITask
        52: dup
        53: iload         4
        55: iload         5
        57: invokespecial #55                 // Method ext/mods/fakeplayer/task/AITask."<init>":(II)V
        60: invokeinterface #58,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        65: pop
        66: iinc          3, 1
        69: goto          24
        72: return
      LineNumberTable:
        line 42: 0
        line 43: 7
        line 44: 13
        line 46: 22
        line 48: 29
        line 49: 36
        line 50: 45
        line 46: 66
        line 52: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      30     4  from   I
           45      21     5    to   I
           24      48     3     i   I
            0      73     0  this   Lext/mods/fakeplayer/FakePlayerTaskManager;
            7      66     1 fakePlayerCount   I
           13      60     2 tasksNeeded   I
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 24
          locals = [ int, int, int ]
        frame_type = 250 /* chop */
          offset_delta = 47

  public int getPlayerCountPerTask();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: sipush        2000
         3: ireturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/FakePlayerTaskManager;

  public int getTaskCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _aiTasks:Ljava/util/List;
         4: invokeinterface #62,  1           // InterfaceMethod java/util/List.size:()I
         9: ireturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/fakeplayer/FakePlayerTaskManager;

  public java.util.List<ext.mods.fakeplayer.task.AITask> getAITasks();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _aiTasks:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/FakePlayerTaskManager;
    Signature: #92                          // ()Ljava/util/List<Lext/mods/fakeplayer/task/AITask;>;

  public static ext.mods.fakeplayer.FakePlayerTaskManager getInstance();
    descriptor: ()Lext/mods/fakeplayer/FakePlayerTaskManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #65                 // Field ext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder._instance:Lext/mods/fakeplayer/FakePlayerTaskManager;
         3: areturn
      LineNumberTable:
        line 76: 0
}
SourceFile: "FakePlayerTaskManager.java"
NestMembers:
  ext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder
