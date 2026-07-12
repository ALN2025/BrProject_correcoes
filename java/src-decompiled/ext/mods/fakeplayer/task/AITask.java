// Bytecode for: ext.mods.fakeplayer.task.AITask
// File: ext\mods\fakeplayer\task\AITask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/task/AITask.class
  Last modified 9 de jul de 2026; size 2660 bytes
  MD5 checksum c5720f1687bb9493e79f8bc08df42a86
  Compiled from "AITask.java"
public class ext.mods.fakeplayer.task.AITask implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/task/AITask
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/task/AITask._from:I
    #8 = Class              #10           // ext/mods/fakeplayer/task/AITask
    #9 = NameAndType        #11:#12       // _from:I
   #10 = Utf8               ext/mods/fakeplayer/task/AITask
   #11 = Utf8               _from
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/fakeplayer/task/AITask._to:I
   #14 = NameAndType        #15:#12       // _to:I
   #15 = Utf8               _to
   #16 = Methodref          #8.#17        // ext/mods/fakeplayer/task/AITask.adjustPotentialIndexOutOfBounds:()V
   #17 = NameAndType        #18:#6        // adjustPotentialIndexOutOfBounds:()V
   #18 = Utf8               adjustPotentialIndexOutOfBounds
   #19 = Methodref          #20.#21       // ext/mods/fakeplayer/FakePlayerManager.getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
   #20 = Class              #22           // ext/mods/fakeplayer/FakePlayerManager
   #21 = NameAndType        #23:#24       // getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
   #22 = Utf8               ext/mods/fakeplayer/FakePlayerManager
   #23 = Utf8               getInstance
   #24 = Utf8               ()Lext/mods/fakeplayer/FakePlayerManager;
   #25 = Methodref          #20.#26       // ext/mods/fakeplayer/FakePlayerManager.getFakePlayers:()Ljava/util/List;
   #26 = NameAndType        #27:#28       // getFakePlayers:()Ljava/util/List;
   #27 = Utf8               getFakePlayers
   #28 = Utf8               ()Ljava/util/List;
   #29 = InterfaceMethodref #30.#31       // java/util/List.subList:(II)Ljava/util/List;
   #30 = Class              #32           // java/util/List
   #31 = NameAndType        #33:#34       // subList:(II)Ljava/util/List;
   #32 = Utf8               java/util/List
   #33 = Utf8               subList
   #34 = Utf8               (II)Ljava/util/List;
   #35 = InterfaceMethodref #30.#36       // java/util/List.stream:()Ljava/util/stream/Stream;
   #36 = NameAndType        #37:#38       // stream:()Ljava/util/stream/Stream;
   #37 = Utf8               stream
   #38 = Utf8               ()Ljava/util/stream/Stream;
   #39 = InvokeDynamic      #0:#40        // #0:test:()Ljava/util/function/Predicate;
   #40 = NameAndType        #41:#42       // test:()Ljava/util/function/Predicate;
   #41 = Utf8               test
   #42 = Utf8               ()Ljava/util/function/Predicate;
   #43 = InterfaceMethodref #44.#45       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #44 = Class              #46           // java/util/stream/Stream
   #45 = NameAndType        #47:#48       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #46 = Utf8               java/util/stream/Stream
   #47 = Utf8               filter
   #48 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #49 = InvokeDynamic      #1:#50        // #1:accept:()Ljava/util/function/Consumer;
   #50 = NameAndType        #51:#52       // accept:()Ljava/util/function/Consumer;
   #51 = Utf8               accept
   #52 = Utf8               ()Ljava/util/function/Consumer;
   #53 = InterfaceMethodref #44.#54       // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
   #54 = NameAndType        #55:#56       // forEach:(Ljava/util/function/Consumer;)V
   #55 = Utf8               forEach
   #56 = Utf8               (Ljava/util/function/Consumer;)V
   #57 = Class              #58           // java/lang/Exception
   #58 = Utf8               java/lang/Exception
   #59 = Methodref          #57.#60       // java/lang/Exception.printStackTrace:()V
   #60 = NameAndType        #61:#6        // printStackTrace:()V
   #61 = Utf8               printStackTrace
   #62 = Methodref          #20.#63       // ext/mods/fakeplayer/FakePlayerManager.getFakePlayersCount:()I
   #63 = NameAndType        #64:#65       // getFakePlayersCount:()I
   #64 = Utf8               getFakePlayersCount
   #65 = Utf8               ()I
   #66 = Methodref          #67.#68       // ext/mods/fakeplayer/FakePlayer.getAi:()Lext/mods/fakeplayer/ai/FakePlayerAI;
   #67 = Class              #69           // ext/mods/fakeplayer/FakePlayer
   #68 = NameAndType        #70:#71       // getAi:()Lext/mods/fakeplayer/ai/FakePlayerAI;
   #69 = Utf8               ext/mods/fakeplayer/FakePlayer
   #70 = Utf8               getAi
   #71 = Utf8               ()Lext/mods/fakeplayer/ai/FakePlayerAI;
   #72 = Methodref          #73.#74       // ext/mods/fakeplayer/ai/FakePlayerAI.thinkAndAct:()V
   #73 = Class              #75           // ext/mods/fakeplayer/ai/FakePlayerAI
   #74 = NameAndType        #76:#6        // thinkAndAct:()V
   #75 = Utf8               ext/mods/fakeplayer/ai/FakePlayerAI
   #76 = Utf8               thinkAndAct
   #77 = Methodref          #73.#78       // ext/mods/fakeplayer/ai/FakePlayerAI.isBusyThinking:()Z
   #78 = NameAndType        #79:#80       // isBusyThinking:()Z
   #79 = Utf8               isBusyThinking
   #80 = Utf8               ()Z
   #81 = Class              #82           // java/lang/Runnable
   #82 = Utf8               java/lang/Runnable
   #83 = Utf8               (II)V
   #84 = Utf8               Code
   #85 = Utf8               LineNumberTable
   #86 = Utf8               LocalVariableTable
   #87 = Utf8               this
   #88 = Utf8               Lext/mods/fakeplayer/task/AITask;
   #89 = Utf8               from
   #90 = Utf8               to
   #91 = Utf8               run
   #92 = Utf8               ex
   #93 = Utf8               Ljava/lang/Exception;
   #94 = Utf8               fakePlayers
   #95 = Utf8               Ljava/util/List;
   #96 = Utf8               LocalVariableTypeTable
   #97 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;
   #98 = Utf8               StackMapTable
   #99 = Utf8               lambda$run$1
  #100 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
  #101 = Utf8               e
  #102 = Utf8               fp
  #103 = Utf8               Lext/mods/fakeplayer/FakePlayer;
  #104 = Utf8               lambda$run$0
  #105 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)Z
  #106 = Utf8               SourceFile
  #107 = Utf8               AITask.java
  #108 = Utf8               BootstrapMethods
  #109 = MethodType         #110          //  (Ljava/lang/Object;)Z
  #110 = Utf8               (Ljava/lang/Object;)Z
  #111 = MethodHandle       6:#112        // REF_invokeStatic ext/mods/fakeplayer/task/AITask.lambda$run$0:(Lext/mods/fakeplayer/FakePlayer;)Z
  #112 = Methodref          #8.#113       // ext/mods/fakeplayer/task/AITask.lambda$run$0:(Lext/mods/fakeplayer/FakePlayer;)Z
  #113 = NameAndType        #104:#105     // lambda$run$0:(Lext/mods/fakeplayer/FakePlayer;)Z
  #114 = MethodType         #105          //  (Lext/mods/fakeplayer/FakePlayer;)Z
  #115 = MethodType         #116          //  (Ljava/lang/Object;)V
  #116 = Utf8               (Ljava/lang/Object;)V
  #117 = MethodHandle       6:#118        // REF_invokeStatic ext/mods/fakeplayer/task/AITask.lambda$run$1:(Lext/mods/fakeplayer/FakePlayer;)V
  #118 = Methodref          #8.#119       // ext/mods/fakeplayer/task/AITask.lambda$run$1:(Lext/mods/fakeplayer/FakePlayer;)V
  #119 = NameAndType        #99:#100      // lambda$run$1:(Lext/mods/fakeplayer/FakePlayer;)V
  #120 = MethodType         #100          //  (Lext/mods/fakeplayer/FakePlayer;)V
  #121 = MethodHandle       6:#122        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #122 = Methodref          #123.#124     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #123 = Class              #125          // java/lang/invoke/LambdaMetafactory
  #124 = NameAndType        #126:#127     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #125 = Utf8               java/lang/invoke/LambdaMetafactory
  #126 = Utf8               metafactory
  #127 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #128 = Utf8               InnerClasses
  #129 = Class              #130          // java/lang/invoke/MethodHandles$Lookup
  #130 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #131 = Class              #132          // java/lang/invoke/MethodHandles
  #132 = Utf8               java/lang/invoke/MethodHandles
  #133 = Utf8               Lookup
{
  public ext.mods.fakeplayer.task.AITask(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _from:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _to:I
        14: return
      LineNumberTable:
        line 31: 0
        line 32: 4
        line 33: 9
        line 34: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/fakeplayer/task/AITask;
            0      15     1  from   I
            0      15     2    to   I

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #16                 // Method adjustPotentialIndexOutOfBounds:()V
         4: invokestatic  #19                 // Method ext/mods/fakeplayer/FakePlayerManager.getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
         7: invokevirtual #25                 // Method ext/mods/fakeplayer/FakePlayerManager.getFakePlayers:()Ljava/util/List;
        10: aload_0
        11: getfield      #7                  // Field _from:I
        14: aload_0
        15: getfield      #13                 // Field _to:I
        18: invokeinterface #29,  3           // InterfaceMethod java/util/List.subList:(II)Ljava/util/List;
        23: astore_1
        24: aload_1
        25: invokeinterface #35,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        30: invokedynamic #39,  0             // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        35: invokeinterface #43,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        40: invokedynamic #49,  0             // InvokeDynamic #1:accept:()Ljava/util/function/Consumer;
        45: invokeinterface #53,  2           // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        50: goto          58
        53: astore_2
        54: aload_2
        55: invokevirtual #59                 // Method java/lang/Exception.printStackTrace:()V
        58: return
      Exception table:
         from    to  target type
            24    50    53   Class java/lang/Exception
      LineNumberTable:
        line 39: 0
        line 40: 4
        line 43: 24
        line 59: 50
        line 56: 53
        line 58: 54
        line 61: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54       4     2    ex   Ljava/lang/Exception;
            0      59     0  this   Lext/mods/fakeplayer/task/AITask;
           24      35     1 fakePlayers   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           24      35     1 fakePlayers   Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/fakeplayer/task/AITask, class java/util/List ]
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */
}
SourceFile: "AITask.java"
BootstrapMethods:
  0: #121 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #109 (Ljava/lang/Object;)Z
      #111 REF_invokeStatic ext/mods/fakeplayer/task/AITask.lambda$run$0:(Lext/mods/fakeplayer/FakePlayer;)Z
      #114 (Lext/mods/fakeplayer/FakePlayer;)Z
  1: #121 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #115 (Ljava/lang/Object;)V
      #117 REF_invokeStatic ext/mods/fakeplayer/task/AITask.lambda$run$1:(Lext/mods/fakeplayer/FakePlayer;)V
      #120 (Lext/mods/fakeplayer/FakePlayer;)V
InnerClasses:
  public static final #133= #129 of #131; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
