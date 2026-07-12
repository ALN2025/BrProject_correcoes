// Bytecode for: ext.mods.gameserver.model.actor.ai.DesireQueue
// File: ext\mods\gameserver\model\actor\ai\DesireQueue.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/DesireQueue.class
  Last modified 9 de jul de 2026; size 3921 bytes
  MD5 checksum f53c9ecc611fdd8754ce5208de24e28a
  Compiled from "DesireQueue.java"
public class ext.mods.gameserver.model.actor.ai.DesireQueue
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/ai/DesireQueue
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #8 = Class              #10           // java/util/concurrent/ConcurrentHashMap
    #9 = NameAndType        #11:#12       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #10 = Utf8               java/util/concurrent/ConcurrentHashMap
   #11 = Utf8               newKeySet
   #12 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/actor/ai/DesireQueue._desires:Ljava/util/Set;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/ai/DesireQueue
   #15 = NameAndType        #17:#18       // _desires:Ljava/util/Set;
   #16 = Utf8               ext/mods/gameserver/model/actor/ai/DesireQueue
   #17 = Utf8               _desires
   #18 = Utf8               Ljava/util/Set;
   #19 = InterfaceMethodref #20.#21       // java/util/Set.stream:()Ljava/util/stream/Stream;
   #20 = Class              #22           // java/util/Set
   #21 = NameAndType        #23:#24       // stream:()Ljava/util/stream/Stream;
   #22 = Utf8               java/util/Set
   #23 = Utf8               stream
   #24 = Utf8               ()Ljava/util/stream/Stream;
   #25 = InvokeDynamic      #0:#26        // #0:test:(Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/util/function/Predicate;
   #26 = NameAndType        #27:#28       // test:(Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/util/function/Predicate;
   #27 = Utf8               test
   #28 = Utf8               (Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/util/function/Predicate;
   #29 = InterfaceMethodref #30.#31       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #30 = Class              #32           // java/util/stream/Stream
   #31 = NameAndType        #33:#34       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #32 = Utf8               java/util/stream/Stream
   #33 = Utf8               filter
   #34 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #35 = InterfaceMethodref #30.#36       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #36 = NameAndType        #37:#38       // findFirst:()Ljava/util/Optional;
   #37 = Utf8               findFirst
   #38 = Utf8               ()Ljava/util/Optional;
   #39 = InvokeDynamic      #1:#40        // #1:accept:(Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/util/function/Consumer;
   #40 = NameAndType        #41:#42       // accept:(Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/util/function/Consumer;
   #41 = Utf8               accept
   #42 = Utf8               (Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/util/function/Consumer;
   #43 = InvokeDynamic      #2:#44        // #2:run:(Lext/mods/gameserver/model/actor/ai/DesireQueue;Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/lang/Runnable;
   #44 = NameAndType        #45:#46       // run:(Lext/mods/gameserver/model/actor/ai/DesireQueue;Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/lang/Runnable;
   #45 = Utf8               run
   #46 = Utf8               (Lext/mods/gameserver/model/actor/ai/DesireQueue;Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/lang/Runnable;
   #47 = Methodref          #48.#49       // java/util/Optional.ifPresentOrElse:(Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
   #48 = Class              #50           // java/util/Optional
   #49 = NameAndType        #51:#52       // ifPresentOrElse:(Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
   #50 = Utf8               java/util/Optional
   #51 = Utf8               ifPresentOrElse
   #52 = Utf8               (Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
   #53 = InterfaceMethodref #20.#54       // java/util/Set.isEmpty:()Z
   #54 = NameAndType        #55:#56       // isEmpty:()Z
   #55 = Utf8               isEmpty
   #56 = Utf8               ()Z
   #57 = InvokeDynamic      #3:#58        // #3:accept:()Ljava/util/function/Consumer;
   #58 = NameAndType        #41:#59       // accept:()Ljava/util/function/Consumer;
   #59 = Utf8               ()Ljava/util/function/Consumer;
   #60 = InterfaceMethodref #20.#61       // java/util/Set.forEach:(Ljava/util/function/Consumer;)V
   #61 = NameAndType        #62:#63       // forEach:(Ljava/util/function/Consumer;)V
   #62 = Utf8               forEach
   #63 = Utf8               (Ljava/util/function/Consumer;)V
   #64 = InvokeDynamic      #4:#65        // #4:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
   #65 = NameAndType        #66:#67       // applyAsDouble:()Ljava/util/function/ToDoubleFunction;
   #66 = Utf8               applyAsDouble
   #67 = Utf8               ()Ljava/util/function/ToDoubleFunction;
   #68 = InterfaceMethodref #69.#70       // java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #69 = Class              #71           // java/util/Comparator
   #70 = NameAndType        #72:#73       // comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #71 = Utf8               java/util/Comparator
   #72 = Utf8               comparingDouble
   #73 = Utf8               (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #74 = InterfaceMethodref #30.#75       // java/util/stream/Stream.max:(Ljava/util/Comparator;)Ljava/util/Optional;
   #75 = NameAndType        #76:#77       // max:(Ljava/util/Comparator;)Ljava/util/Optional;
   #76 = Utf8               max
   #77 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
   #78 = Methodref          #48.#79       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #79 = NameAndType        #80:#81       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #80 = Utf8               orElse
   #81 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #82 = Class              #83           // ext/mods/gameserver/model/actor/ai/Desire
   #83 = Utf8               ext/mods/gameserver/model/actor/ai/Desire
   #84 = InterfaceMethodref #20.#85       // java/util/Set.size:()I
   #85 = NameAndType        #86:#87       // size:()I
   #86 = Utf8               size
   #87 = Utf8               ()I
   #88 = InterfaceMethodref #20.#89       // java/util/Set.add:(Ljava/lang/Object;)Z
   #89 = NameAndType        #90:#91       // add:(Ljava/lang/Object;)Z
   #90 = Utf8               add
   #91 = Utf8               (Ljava/lang/Object;)Z
   #92 = Methodref          #82.#93       // ext/mods/gameserver/model/actor/ai/Desire.getWeight:()D
   #93 = NameAndType        #94:#95       // getWeight:()D
   #94 = Utf8               getWeight
   #95 = Utf8               ()D
   #96 = Methodref          #82.#97       // ext/mods/gameserver/model/actor/ai/Desire.addWeight:(D)V
   #97 = NameAndType        #98:#99       // addWeight:(D)V
   #98 = Utf8               addWeight
   #99 = Utf8               (D)V
  #100 = Methodref          #82.#101      // ext/mods/gameserver/model/actor/ai/Desire.equals:(Ljava/lang/Object;)Z
  #101 = NameAndType        #102:#91      // equals:(Ljava/lang/Object;)Z
  #102 = Utf8               equals
  #103 = Utf8               MAX_CAPACITY
  #104 = Utf8               I
  #105 = Utf8               ConstantValue
  #106 = Integer            50
  #107 = Utf8               Signature
  #108 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/ai/Desire;>;
  #109 = Utf8               Code
  #110 = Utf8               LineNumberTable
  #111 = Utf8               LocalVariableTable
  #112 = Utf8               this
  #113 = Utf8               Lext/mods/gameserver/model/actor/ai/DesireQueue;
  #114 = Utf8               getDesires
  #115 = Utf8               ()Ljava/util/Set;
  #116 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/actor/ai/Desire;>;
  #117 = Utf8               addOrUpdate
  #118 = Utf8               (Lext/mods/gameserver/model/actor/ai/Desire;)V
  #119 = Utf8               desire
  #120 = Utf8               Lext/mods/gameserver/model/actor/ai/Desire;
  #121 = Utf8               autoDecreaseWeight
  #122 = Utf8               StackMapTable
  #123 = Utf8               getLast
  #124 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Desire;
  #125 = Utf8               lambda$addOrUpdate$2
  #126 = Utf8               lambda$addOrUpdate$1
  #127 = Utf8               (Lext/mods/gameserver/model/actor/ai/Desire;Lext/mods/gameserver/model/actor/ai/Desire;)V
  #128 = Utf8               d
  #129 = Utf8               lambda$addOrUpdate$0
  #130 = Utf8               (Lext/mods/gameserver/model/actor/ai/Desire;Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #131 = Utf8               SourceFile
  #132 = Utf8               DesireQueue.java
  #133 = Utf8               BootstrapMethods
  #134 = MethodType         #91           //  (Ljava/lang/Object;)Z
  #135 = MethodHandle       6:#136        // REF_invokeStatic ext/mods/gameserver/model/actor/ai/DesireQueue.lambda$addOrUpdate$0:(Lext/mods/gameserver/model/actor/ai/Desire;Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #136 = Methodref          #14.#137      // ext/mods/gameserver/model/actor/ai/DesireQueue.lambda$addOrUpdate$0:(Lext/mods/gameserver/model/actor/ai/Desire;Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #137 = NameAndType        #129:#130     // lambda$addOrUpdate$0:(Lext/mods/gameserver/model/actor/ai/Desire;Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #138 = MethodType         #139          //  (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #139 = Utf8               (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #140 = MethodType         #141          //  (Ljava/lang/Object;)V
  #141 = Utf8               (Ljava/lang/Object;)V
  #142 = MethodHandle       6:#143        // REF_invokeStatic ext/mods/gameserver/model/actor/ai/DesireQueue.lambda$addOrUpdate$1:(Lext/mods/gameserver/model/actor/ai/Desire;Lext/mods/gameserver/model/actor/ai/Desire;)V
  #143 = Methodref          #14.#144      // ext/mods/gameserver/model/actor/ai/DesireQueue.lambda$addOrUpdate$1:(Lext/mods/gameserver/model/actor/ai/Desire;Lext/mods/gameserver/model/actor/ai/Desire;)V
  #144 = NameAndType        #126:#127     // lambda$addOrUpdate$1:(Lext/mods/gameserver/model/actor/ai/Desire;Lext/mods/gameserver/model/actor/ai/Desire;)V
  #145 = MethodType         #118          //  (Lext/mods/gameserver/model/actor/ai/Desire;)V
  #146 = MethodType         #6            //  ()V
  #147 = MethodHandle       5:#148        // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/DesireQueue.lambda$addOrUpdate$2:(Lext/mods/gameserver/model/actor/ai/Desire;)V
  #148 = Methodref          #14.#149      // ext/mods/gameserver/model/actor/ai/DesireQueue.lambda$addOrUpdate$2:(Lext/mods/gameserver/model/actor/ai/Desire;)V
  #149 = NameAndType        #125:#118     // lambda$addOrUpdate$2:(Lext/mods/gameserver/model/actor/ai/Desire;)V
  #150 = MethodHandle       5:#151        // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/Desire.autoDecreaseWeight:()V
  #151 = Methodref          #82.#152      // ext/mods/gameserver/model/actor/ai/Desire.autoDecreaseWeight:()V
  #152 = NameAndType        #121:#6       // autoDecreaseWeight:()V
  #153 = MethodType         #154          //  (Ljava/lang/Object;)D
  #154 = Utf8               (Ljava/lang/Object;)D
  #155 = MethodHandle       5:#92         // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/Desire.getWeight:()D
  #156 = MethodType         #157          //  (Lext/mods/gameserver/model/actor/ai/Desire;)D
  #157 = Utf8               (Lext/mods/gameserver/model/actor/ai/Desire;)D
  #158 = MethodHandle       6:#159        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #159 = Methodref          #160.#161     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #160 = Class              #162          // java/lang/invoke/LambdaMetafactory
  #161 = NameAndType        #163:#164     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #162 = Utf8               java/lang/invoke/LambdaMetafactory
  #163 = Utf8               metafactory
  #164 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #165 = Utf8               InnerClasses
  #166 = Class              #167          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #167 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #168 = Utf8               KeySetView
  #169 = Class              #170          // java/lang/invoke/MethodHandles$Lookup
  #170 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #171 = Class              #172          // java/lang/invoke/MethodHandles
  #172 = Utf8               java/lang/invoke/MethodHandles
  #173 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.ai.DesireQueue();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokestatic  #7                  // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
         8: putfield      #13                 // Field _desires:Ljava/util/Set;
        11: return
      LineNumberTable:
        line 31: 0
        line 35: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/ai/DesireQueue;

  public java.util.Set<ext.mods.gameserver.model.actor.ai.Desire> getDesires();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _desires:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/DesireQueue;
    Signature: #116                         // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/ai/Desire;>;

  public void addOrUpdate(ext.mods.gameserver.model.actor.ai.Desire);
    descriptor: (Lext/mods/gameserver/model/actor/ai/Desire;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _desires:Ljava/util/Set;
         4: invokeinterface #19,  1           // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #25,  0             // InvokeDynamic #0:test:(Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/util/function/Predicate;
        15: invokeinterface #29,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #35,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aload_1
        26: invokedynamic #39,  0             // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/util/function/Consumer;
        31: aload_0
        32: aload_1
        33: invokedynamic #43,  0             // InvokeDynamic #2:run:(Lext/mods/gameserver/model/actor/ai/DesireQueue;Lext/mods/gameserver/model/actor/ai/Desire;)Ljava/lang/Runnable;
        38: invokevirtual #47                 // Method java/util/Optional.ifPresentOrElse:(Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
        41: return
      LineNumberTable:
        line 51: 0
        line 56: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/model/actor/ai/DesireQueue;
            0      42     1 desire   Lext/mods/gameserver/model/actor/ai/Desire;

  public void autoDecreaseWeight();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _desires:Ljava/util/Set;
         4: invokeinterface #53,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          13
        12: return
        13: aload_0
        14: getfield      #13                 // Field _desires:Ljava/util/Set;
        17: invokedynamic #57,  0             // InvokeDynamic #3:accept:()Ljava/util/function/Consumer;
        22: invokeinterface #60,  2           // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        27: return
      LineNumberTable:
        line 63: 0
        line 64: 12
        line 66: 13
        line 67: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/ai/DesireQueue;
      StackMapTable: number_of_entries = 1
        frame_type = 13 /* same */

  public ext.mods.gameserver.model.actor.ai.Desire getLast();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/Desire;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _desires:Ljava/util/Set;
         4: invokeinterface #53,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          14
        12: aconst_null
        13: areturn
        14: aload_0
        15: getfield      #13                 // Field _desires:Ljava/util/Set;
        18: invokeinterface #19,  1           // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        23: invokedynamic #64,  0             // InvokeDynamic #4:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
        28: invokestatic  #68                 // InterfaceMethod java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
        31: invokeinterface #74,  2           // InterfaceMethod java/util/stream/Stream.max:(Ljava/util/Comparator;)Ljava/util/Optional;
        36: aconst_null
        37: invokevirtual #78                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        40: checkcast     #82                 // class ext/mods/gameserver/model/actor/ai/Desire
        43: areturn
      LineNumberTable:
        line 74: 0
        line 75: 12
        line 77: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/actor/ai/DesireQueue;
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */
}
SourceFile: "DesireQueue.java"
BootstrapMethods:
  0: #158 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #134 (Ljava/lang/Object;)Z
      #135 REF_invokeStatic ext/mods/gameserver/model/actor/ai/DesireQueue.lambda$addOrUpdate$0:(Lext/mods/gameserver/model/actor/ai/Desire;Lext/mods/gameserver/model/actor/ai/Desire;)Z
      #138 (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  1: #158 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #140 (Ljava/lang/Object;)V
      #142 REF_invokeStatic ext/mods/gameserver/model/actor/ai/DesireQueue.lambda$addOrUpdate$1:(Lext/mods/gameserver/model/actor/ai/Desire;Lext/mods/gameserver/model/actor/ai/Desire;)V
      #145 (Lext/mods/gameserver/model/actor/ai/Desire;)V
  2: #158 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #146 ()V
      #147 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/DesireQueue.lambda$addOrUpdate$2:(Lext/mods/gameserver/model/actor/ai/Desire;)V
      #146 ()V
  3: #158 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #140 (Ljava/lang/Object;)V
      #150 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/Desire.autoDecreaseWeight:()V
      #145 (Lext/mods/gameserver/model/actor/ai/Desire;)V
  4: #158 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #153 (Ljava/lang/Object;)D
      #155 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/Desire.getWeight:()D
      #156 (Lext/mods/gameserver/model/actor/ai/Desire;)D
InnerClasses:
  public static final #168= #166 of #8;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #173= #169 of #171; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
