// Bytecode for: ext.mods.gameserver.model.actor.container.player.CubicList
// File: ext\mods\gameserver\model\actor\container\player\CubicList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/CubicList.class
  Last modified 9 de jul de 2026; size 3582 bytes
  MD5 checksum ce56c9067497648754c67374fc649254
  Compiled from "CubicList.java"
public class ext.mods.gameserver.model.actor.container.player.CubicList extends java.util.concurrent.ConcurrentLinkedQueue<ext.mods.gameserver.model.actor.instance.Cubic>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/player/CubicList
  super_class: #2                         // java/util/concurrent/ConcurrentLinkedQueue
  interfaces: 0, fields: 3, methods: 8, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/util/concurrent/ConcurrentLinkedQueue."<init>":()V
    #2 = Class              #4            // java/util/concurrent/ConcurrentLinkedQueue
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/concurrent/ConcurrentLinkedQueue
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/player/CubicList._owner:Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/player/CubicList
    #9 = NameAndType        #11:#12       // _owner:Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/actor/container/player/CubicList
   #11 = Utf8               _owner
   #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/actor/container/player/CubicList.stream:()Ljava/util/stream/Stream;
   #14 = NameAndType        #15:#16       // stream:()Ljava/util/stream/Stream;
   #15 = Utf8               stream
   #16 = Utf8               ()Ljava/util/stream/Stream;
   #17 = InvokeDynamic      #0:#18        // #0:test:(I)Ljava/util/function/Predicate;
   #18 = NameAndType        #19:#20       // test:(I)Ljava/util/function/Predicate;
   #19 = Utf8               test
   #20 = Utf8               (I)Ljava/util/function/Predicate;
   #21 = InterfaceMethodref #22.#23       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #22 = Class              #24           // java/util/stream/Stream
   #23 = NameAndType        #25:#26       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #24 = Utf8               java/util/stream/Stream
   #25 = Utf8               filter
   #26 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #27 = InterfaceMethodref #22.#28       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #28 = NameAndType        #29:#30       // findFirst:()Ljava/util/Optional;
   #29 = Utf8               findFirst
   #30 = Utf8               ()Ljava/util/Optional;
   #31 = Methodref          #32.#33       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #32 = Class              #34           // java/util/Optional
   #33 = NameAndType        #35:#36       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #34 = Utf8               java/util/Optional
   #35 = Utf8               orElse
   #36 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #37 = Class              #38           // ext/mods/gameserver/model/actor/instance/Cubic
   #38 = Utf8               ext/mods/gameserver/model/actor/instance/Cubic
   #39 = Methodref          #8.#40        // ext/mods/gameserver/model/actor/container/player/CubicList.getCubic:(I)Lext/mods/gameserver/model/actor/instance/Cubic;
   #40 = NameAndType        #41:#42       // getCubic:(I)Lext/mods/gameserver/model/actor/instance/Cubic;
   #41 = Utf8               getCubic
   #42 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Cubic;
   #43 = Methodref          #37.#44       // ext/mods/gameserver/model/actor/instance/Cubic.refreshDisappearTask:(I)V
   #44 = NameAndType        #45:#46       // refreshDisappearTask:(I)V
   #45 = Utf8               refreshDisappearTask
   #46 = Utf8               (I)V
   #47 = Methodref          #8.#48        // ext/mods/gameserver/model/actor/container/player/CubicList.isFull:()Z
   #48 = NameAndType        #49:#50       // isFull:()Z
   #49 = Utf8               isFull
   #50 = Utf8               ()Z
   #51 = Methodref          #8.#52        // ext/mods/gameserver/model/actor/container/player/CubicList.poll:()Ljava/lang/Object;
   #52 = NameAndType        #53:#54       // poll:()Ljava/lang/Object;
   #53 = Utf8               poll
   #54 = Utf8               ()Ljava/lang/Object;
   #55 = Methodref          #37.#56       // ext/mods/gameserver/model/actor/instance/Cubic.stop:(Z)V
   #56 = NameAndType        #57:#58       // stop:(Z)V
   #57 = Utf8               stop
   #58 = Utf8               (Z)V
   #59 = Methodref          #37.#60       // ext/mods/gameserver/model/actor/instance/Cubic."<init>":(Lext/mods/gameserver/model/actor/Player;IIIIIIZ)V
   #60 = NameAndType        #5:#61        // "<init>":(Lext/mods/gameserver/model/actor/Player;IIIIIIZ)V
   #61 = Utf8               (Lext/mods/gameserver/model/actor/Player;IIIIIIZ)V
   #62 = Methodref          #8.#63        // ext/mods/gameserver/model/actor/container/player/CubicList.add:(Ljava/lang/Object;)Z
   #63 = NameAndType        #64:#65       // add:(Ljava/lang/Object;)Z
   #64 = Utf8               add
   #65 = Utf8               (Ljava/lang/Object;)Z
   #66 = Methodref          #67.#68       // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #67 = Class              #69           // ext/mods/gameserver/model/actor/Player
   #68 = NameAndType        #70:#6        // broadcastUserInfo:()V
   #69 = Utf8               ext/mods/gameserver/model/actor/Player
   #70 = Utf8               broadcastUserInfo
   #71 = Methodref          #8.#72        // ext/mods/gameserver/model/actor/container/player/CubicList.remove:(Ljava/lang/Object;)Z
   #72 = NameAndType        #73:#65       // remove:(Ljava/lang/Object;)Z
   #73 = Utf8               remove
   #74 = Methodref          #8.#75        // ext/mods/gameserver/model/actor/container/player/CubicList.isEmpty:()Z
   #75 = NameAndType        #76:#50       // isEmpty:()Z
   #76 = Utf8               isEmpty
   #77 = Methodref          #8.#78        // ext/mods/gameserver/model/actor/container/player/CubicList.iterator:()Ljava/util/Iterator;
   #78 = NameAndType        #79:#80       // iterator:()Ljava/util/Iterator;
   #79 = Utf8               iterator
   #80 = Utf8               ()Ljava/util/Iterator;
   #81 = InterfaceMethodref #82.#83       // java/util/Iterator.hasNext:()Z
   #82 = Class              #84           // java/util/Iterator
   #83 = NameAndType        #85:#50       // hasNext:()Z
   #84 = Utf8               java/util/Iterator
   #85 = Utf8               hasNext
   #86 = InterfaceMethodref #82.#87       // java/util/Iterator.next:()Ljava/lang/Object;
   #87 = NameAndType        #88:#54       // next:()Ljava/lang/Object;
   #88 = Utf8               next
   #89 = Methodref          #37.#90       // ext/mods/gameserver/model/actor/instance/Cubic.givenByOther:()Z
   #90 = NameAndType        #91:#50       // givenByOther:()Z
   #91 = Utf8               givenByOther
   #92 = Methodref          #8.#93        // ext/mods/gameserver/model/actor/container/player/CubicList.size:()I
   #93 = NameAndType        #94:#95       // size:()I
   #94 = Utf8               size
   #95 = Utf8               ()I
   #96 = Methodref          #67.#97       // ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
   #97 = NameAndType        #98:#99       // getSkillLevel:(I)I
   #98 = Utf8               getSkillLevel
   #99 = Utf8               (I)I
  #100 = Methodref          #37.#101      // ext/mods/gameserver/model/actor/instance/Cubic.getId:()I
  #101 = NameAndType        #102:#95      // getId:()I
  #102 = Utf8               getId
  #103 = Utf8               serialVersionUID
  #104 = Utf8               J
  #105 = Utf8               ConstantValue
  #106 = Long               1l
  #108 = Utf8               SKILL_CUBIC_MASTERY
  #109 = Utf8               I
  #110 = Integer            143
  #111 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #112 = Utf8               Code
  #113 = Utf8               LineNumberTable
  #114 = Utf8               LocalVariableTable
  #115 = Utf8               this
  #116 = Utf8               Lext/mods/gameserver/model/actor/container/player/CubicList;
  #117 = Utf8               owner
  #118 = Utf8               id
  #119 = Utf8               addOrRefreshCubic
  #120 = Utf8               (IIDIIIZ)V
  #121 = Utf8               level
  #122 = Utf8               matk
  #123 = Utf8               D
  #124 = Utf8               activationTime
  #125 = Utf8               activationChance
  #126 = Utf8               totalLifetime
  #127 = Utf8               Z
  #128 = Utf8               cubic
  #129 = Utf8               Lext/mods/gameserver/model/actor/instance/Cubic;
  #130 = Utf8               StackMapTable
  #131 = Utf8               removeCubic
  #132 = Utf8               stopCubics
  #133 = Utf8               doBroadcast
  #134 = Utf8               stopCubicsGivenByOthers
  #135 = Utf8               lambda$getCubic$0
  #136 = Utf8               (ILext/mods/gameserver/model/actor/instance/Cubic;)Z
  #137 = Utf8               c
  #138 = Utf8               Signature
  #139 = Utf8               Ljava/util/concurrent/ConcurrentLinkedQueue<Lext/mods/gameserver/model/actor/instance/Cubic;>;
  #140 = Utf8               SourceFile
  #141 = Utf8               CubicList.java
  #142 = Utf8               BootstrapMethods
  #143 = MethodType         #65           //  (Ljava/lang/Object;)Z
  #144 = MethodHandle       6:#145        // REF_invokeStatic ext/mods/gameserver/model/actor/container/player/CubicList.lambda$getCubic$0:(ILext/mods/gameserver/model/actor/instance/Cubic;)Z
  #145 = Methodref          #8.#146       // ext/mods/gameserver/model/actor/container/player/CubicList.lambda$getCubic$0:(ILext/mods/gameserver/model/actor/instance/Cubic;)Z
  #146 = NameAndType        #135:#136     // lambda$getCubic$0:(ILext/mods/gameserver/model/actor/instance/Cubic;)Z
  #147 = MethodType         #148          //  (Lext/mods/gameserver/model/actor/instance/Cubic;)Z
  #148 = Utf8               (Lext/mods/gameserver/model/actor/instance/Cubic;)Z
  #149 = MethodHandle       6:#150        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #150 = Methodref          #151.#152     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #151 = Class              #153          // java/lang/invoke/LambdaMetafactory
  #152 = NameAndType        #154:#155     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #153 = Utf8               java/lang/invoke/LambdaMetafactory
  #154 = Utf8               metafactory
  #155 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #156 = Utf8               InnerClasses
  #157 = Class              #158          // java/lang/invoke/MethodHandles$Lookup
  #158 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #159 = Class              #160          // java/lang/invoke/MethodHandles
  #160 = Utf8               java/lang/invoke/MethodHandles
  #161 = Utf8               Lookup
{
  public static final int SKILL_CUBIC_MASTERY;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 143

  public ext.mods.gameserver.model.actor.container.player.CubicList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/util/concurrent/ConcurrentLinkedQueue."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
         9: return
      LineNumberTable:
        line 39: 0
        line 40: 4
        line 41: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/player/CubicList;
            0      10     1 owner   Lext/mods/gameserver/model/actor/Player;

  public ext.mods.gameserver.model.actor.instance.Cubic getCubic(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/instance/Cubic;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #13                 // Method stream:()Ljava/util/stream/Stream;
         4: iload_1
         5: invokedynamic #17,  0             // InvokeDynamic #0:test:(I)Ljava/util/function/Predicate;
        10: invokeinterface #21,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        15: invokeinterface #27,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        20: aconst_null
        21: invokevirtual #31                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        24: checkcast     #37                 // class ext/mods/gameserver/model/actor/instance/Cubic
        27: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/container/player/CubicList;
            0      28     1    id   I

  public void addOrRefreshCubic(int, int, double, int, int, int, boolean);
    descriptor: (IIDIIIZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=10, args_size=8
         0: aload_0
         1: iload_1
         2: invokevirtual #39                 // Method getCubic:(I)Lext/mods/gameserver/model/actor/instance/Cubic;
         5: astore        9
         7: aload         9
         9: ifnull        22
        12: aload         9
        14: iload         7
        16: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/instance/Cubic.refreshDisappearTask:(I)V
        19: goto          75
        22: aload_0
        23: invokevirtual #47                 // Method isFull:()Z
        26: ifeq          40
        29: aload_0
        30: invokevirtual #51                 // Method poll:()Ljava/lang/Object;
        33: checkcast     #37                 // class ext/mods/gameserver/model/actor/instance/Cubic
        36: iconst_0
        37: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/instance/Cubic.stop:(Z)V
        40: aload_0
        41: new           #37                 // class ext/mods/gameserver/model/actor/instance/Cubic
        44: dup
        45: aload_0
        46: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        49: iload_1
        50: iload_2
        51: dload_3
        52: d2i
        53: iload         5
        55: iload         6
        57: iload         7
        59: iload         8
        61: invokespecial #59                 // Method ext/mods/gameserver/model/actor/instance/Cubic."<init>":(Lext/mods/gameserver/model/actor/Player;IIIIIIZ)V
        64: invokevirtual #62                 // Method add:(Ljava/lang/Object;)Z
        67: pop
        68: aload_0
        69: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        72: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        75: return
      LineNumberTable:
        line 64: 0
        line 65: 7
        line 66: 12
        line 69: 22
        line 70: 29
        line 72: 40
        line 74: 68
        line 76: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      76     0  this   Lext/mods/gameserver/model/actor/container/player/CubicList;
            0      76     1    id   I
            0      76     2 level   I
            0      76     3  matk   D
            0      76     5 activationTime   I
            0      76     6 activationChance   I
            0      76     7 totalLifetime   I
            0      76     8 givenByOther   Z
            7      69     9 cubic   Lext/mods/gameserver/model/actor/instance/Cubic;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/instance/Cubic ]
        frame_type = 17 /* same */
        frame_type = 34 /* same */

  public void removeCubic(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: iload_1
         3: invokevirtual #39                 // Method getCubic:(I)Lext/mods/gameserver/model/actor/instance/Cubic;
         6: invokevirtual #71                 // Method remove:(Ljava/lang/Object;)Z
         9: pop
        10: return
      LineNumberTable:
        line 84: 0
        line 85: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/container/player/CubicList;
            0      11     1    id   I

  public final void stopCubics(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #74                 // Method isEmpty:()Z
         4: ifne          50
         7: aload_0
         8: invokevirtual #77                 // Method iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #81,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          39
        21: aload_2
        22: invokeinterface #86,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #37                 // class ext/mods/gameserver/model/actor/instance/Cubic
        30: astore_3
        31: aload_3
        32: iconst_0
        33: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/instance/Cubic.stop:(Z)V
        36: goto          12
        39: iload_1
        40: ifeq          50
        43: aload_0
        44: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        47: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        50: return
      LineNumberTable:
        line 93: 0
        line 95: 7
        line 96: 31
        line 98: 39
        line 99: 43
        line 101: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31       5     3 cubic   Lext/mods/gameserver/model/actor/instance/Cubic;
            0      51     0  this   Lext/mods/gameserver/model/actor/container/player/CubicList;
            0      51     1 doBroadcast   Z
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26
        frame_type = 10 /* same */

  public final void stopCubicsGivenByOthers();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: invokevirtual #74                 // Method isEmpty:()Z
         4: ifne          61
         7: iconst_0
         8: istore_1
         9: aload_0
        10: invokevirtual #77                 // Method iterator:()Ljava/util/Iterator;
        13: astore_2
        14: aload_2
        15: invokeinterface #81,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          50
        23: aload_2
        24: invokeinterface #86,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        29: checkcast     #37                 // class ext/mods/gameserver/model/actor/instance/Cubic
        32: astore_3
        33: aload_3
        34: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/instance/Cubic.givenByOther:()Z
        37: ifeq          47
        40: aload_3
        41: iconst_0
        42: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/instance/Cubic.stop:(Z)V
        45: iconst_1
        46: istore_1
        47: goto          14
        50: iload_1
        51: ifeq          61
        54: aload_0
        55: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        58: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        61: return
      LineNumberTable:
        line 108: 0
        line 110: 7
        line 111: 9
        line 113: 33
        line 115: 40
        line 116: 45
        line 118: 47
        line 119: 50
        line 120: 54
        line 122: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      14     3 cubic   Lext/mods/gameserver/model/actor/instance/Cubic;
            9      52     1 doBroadcast   Z
            0      62     0  this   Lext/mods/gameserver/model/actor/container/player/CubicList;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ int, class java/util/Iterator ]
        frame_type = 32 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 10

  public final boolean isFull();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #92                 // Method size:()I
         4: aload_0
         5: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
         8: sipush        143
        11: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
        14: if_icmple     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 129: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/container/player/CubicList;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
Signature: #139                         // Ljava/util/concurrent/ConcurrentLinkedQueue<Lext/mods/gameserver/model/actor/instance/Cubic;>;
SourceFile: "CubicList.java"
BootstrapMethods:
  0: #149 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #143 (Ljava/lang/Object;)Z
      #144 REF_invokeStatic ext/mods/gameserver/model/actor/container/player/CubicList.lambda$getCubic$0:(ILext/mods/gameserver/model/actor/instance/Cubic;)Z
      #147 (Lext/mods/gameserver/model/actor/instance/Cubic;)Z
InnerClasses:
  public static final #161= #157 of #159; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
