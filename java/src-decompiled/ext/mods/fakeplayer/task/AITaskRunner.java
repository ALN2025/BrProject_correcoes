// Bytecode for: ext.mods.fakeplayer.task.AITaskRunner
// File: ext\mods\fakeplayer\task\AITaskRunner.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/task/AITaskRunner.class
  Last modified 9 de jul de 2026; size 1609 bytes
  MD5 checksum 542f520cf08f39ba3959ced42d0b3d6a
  Compiled from "AITaskRunner.java"
public class ext.mods.fakeplayer.task.AITaskRunner implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #36                         // ext/mods/fakeplayer/task/AITaskRunner
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 3, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/fakeplayer/FakePlayerTaskManager.getInstance:()Lext/mods/fakeplayer/FakePlayerTaskManager;
   #8 = Class              #10            // ext/mods/fakeplayer/FakePlayerTaskManager
   #9 = NameAndType        #11:#12        // getInstance:()Lext/mods/fakeplayer/FakePlayerTaskManager;
  #10 = Utf8               ext/mods/fakeplayer/FakePlayerTaskManager
  #11 = Utf8               getInstance
  #12 = Utf8               ()Lext/mods/fakeplayer/FakePlayerTaskManager;
  #13 = Methodref          #8.#14         // ext/mods/fakeplayer/FakePlayerTaskManager.adjustTaskSize:()V
  #14 = NameAndType        #15:#6         // adjustTaskSize:()V
  #15 = Utf8               adjustTaskSize
  #16 = Methodref          #8.#17         // ext/mods/fakeplayer/FakePlayerTaskManager.getAITasks:()Ljava/util/List;
  #17 = NameAndType        #18:#19        // getAITasks:()Ljava/util/List;
  #18 = Utf8               getAITasks
  #19 = Utf8               ()Ljava/util/List;
  #20 = InvokeDynamic      #0:#21         // #0:accept:()Ljava/util/function/Consumer;
  #21 = NameAndType        #22:#23        // accept:()Ljava/util/function/Consumer;
  #22 = Utf8               accept
  #23 = Utf8               ()Ljava/util/function/Consumer;
  #24 = InterfaceMethodref #25.#26        // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #25 = Class              #27            // java/util/List
  #26 = NameAndType        #28:#29        // forEach:(Ljava/util/function/Consumer;)V
  #27 = Utf8               java/util/List
  #28 = Utf8               forEach
  #29 = Utf8               (Ljava/util/function/Consumer;)V
  #30 = Methodref          #31.#32        // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
  #31 = Class              #33            // ext/mods/commons/pool/ThreadPool
  #32 = NameAndType        #34:#35        // execute:(Ljava/lang/Runnable;)V
  #33 = Utf8               ext/mods/commons/pool/ThreadPool
  #34 = Utf8               execute
  #35 = Utf8               (Ljava/lang/Runnable;)V
  #36 = Class              #37            // ext/mods/fakeplayer/task/AITaskRunner
  #37 = Utf8               ext/mods/fakeplayer/task/AITaskRunner
  #38 = Class              #39            // java/lang/Runnable
  #39 = Utf8               java/lang/Runnable
  #40 = Utf8               Code
  #41 = Utf8               LineNumberTable
  #42 = Utf8               LocalVariableTable
  #43 = Utf8               this
  #44 = Utf8               Lext/mods/fakeplayer/task/AITaskRunner;
  #45 = Utf8               run
  #46 = Utf8               aiTasks
  #47 = Utf8               Ljava/util/List;
  #48 = Utf8               LocalVariableTypeTable
  #49 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/task/AITask;>;
  #50 = Utf8               lambda$run$0
  #51 = Utf8               (Lext/mods/fakeplayer/task/AITask;)V
  #52 = Utf8               aiTask
  #53 = Utf8               Lext/mods/fakeplayer/task/AITask;
  #54 = Utf8               SourceFile
  #55 = Utf8               AITaskRunner.java
  #56 = Utf8               BootstrapMethods
  #57 = MethodType         #58            //  (Ljava/lang/Object;)V
  #58 = Utf8               (Ljava/lang/Object;)V
  #59 = MethodHandle       6:#60          // REF_invokeStatic ext/mods/fakeplayer/task/AITaskRunner.lambda$run$0:(Lext/mods/fakeplayer/task/AITask;)V
  #60 = Methodref          #36.#61        // ext/mods/fakeplayer/task/AITaskRunner.lambda$run$0:(Lext/mods/fakeplayer/task/AITask;)V
  #61 = NameAndType        #50:#51        // lambda$run$0:(Lext/mods/fakeplayer/task/AITask;)V
  #62 = MethodType         #51            //  (Lext/mods/fakeplayer/task/AITask;)V
  #63 = MethodHandle       6:#64          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #64 = Methodref          #65.#66        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #65 = Class              #67            // java/lang/invoke/LambdaMetafactory
  #66 = NameAndType        #68:#69        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #67 = Utf8               java/lang/invoke/LambdaMetafactory
  #68 = Utf8               metafactory
  #69 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #70 = Utf8               InnerClasses
  #71 = Class              #72            // java/lang/invoke/MethodHandles$Lookup
  #72 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #73 = Class              #74            // java/lang/invoke/MethodHandles
  #74 = Utf8               java/lang/invoke/MethodHandles
  #75 = Utf8               Lookup
{
  public ext.mods.fakeplayer.task.AITaskRunner();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/task/AITaskRunner;

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: invokestatic  #7                  // Method ext/mods/fakeplayer/FakePlayerTaskManager.getInstance:()Lext/mods/fakeplayer/FakePlayerTaskManager;
         3: invokevirtual #13                 // Method ext/mods/fakeplayer/FakePlayerTaskManager.adjustTaskSize:()V
         6: invokestatic  #7                  // Method ext/mods/fakeplayer/FakePlayerTaskManager.getInstance:()Lext/mods/fakeplayer/FakePlayerTaskManager;
         9: invokevirtual #16                 // Method ext/mods/fakeplayer/FakePlayerTaskManager.getAITasks:()Ljava/util/List;
        12: astore_1
        13: aload_1
        14: invokedynamic #20,  0             // InvokeDynamic #0:accept:()Ljava/util/function/Consumer;
        19: invokeinterface #24,  2           // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        24: return
      LineNumberTable:
        line 31: 0
        line 32: 6
        line 33: 13
        line 34: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/fakeplayer/task/AITaskRunner;
           13      12     1 aiTasks   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           13      12     1 aiTasks   Ljava/util/List<Lext/mods/fakeplayer/task/AITask;>;
}
SourceFile: "AITaskRunner.java"
BootstrapMethods:
  0: #63 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #57 (Ljava/lang/Object;)V
      #59 REF_invokeStatic ext/mods/fakeplayer/task/AITaskRunner.lambda$run$0:(Lext/mods/fakeplayer/task/AITask;)V
      #62 (Lext/mods/fakeplayer/task/AITask;)V
InnerClasses:
  public static final #75= #71 of #73;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
