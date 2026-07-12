// Bytecode for: ext.mods.gameserver.model.Augmentation$AugmentationStatBoni
// File: ext\mods\gameserver\model\Augmentation$AugmentationStatBoni.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/Augmentation$AugmentationStatBoni.class
  Last modified 9 de jul de 2026; size 3046 bytes
  MD5 checksum 9c40fb1c98741a81fe4c34eb45a12c2e
  Compiled from "Augmentation.java"
public class ext.mods.gameserver.model.Augmentation$AugmentationStatBoni
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/Augmentation$AugmentationStatBoni
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/Augmentation$AugmentationStatBoni._active:Z
    #8 = Class              #10           // ext/mods/gameserver/model/Augmentation$AugmentationStatBoni
    #9 = NameAndType        #11:#12       // _active:Z
   #10 = Utf8               ext/mods/gameserver/model/Augmentation$AugmentationStatBoni
   #11 = Utf8               _active
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/data/xml/AugmentationData.getInstance:()Lext/mods/gameserver/data/xml/AugmentationData;
   #14 = Class              #16           // ext/mods/gameserver/data/xml/AugmentationData
   #15 = NameAndType        #17:#18       // getInstance:()Lext/mods/gameserver/data/xml/AugmentationData;
   #16 = Utf8               ext/mods/gameserver/data/xml/AugmentationData
   #17 = Utf8               getInstance
   #18 = Utf8               ()Lext/mods/gameserver/data/xml/AugmentationData;
   #19 = Methodref          #14.#20       // ext/mods/gameserver/data/xml/AugmentationData.getAugStatsById:(I)Ljava/util/List;
   #20 = NameAndType        #21:#22       // getAugStatsById:(I)Ljava/util/List;
   #21 = Utf8               getAugStatsById
   #22 = Utf8               (I)Ljava/util/List;
   #23 = InterfaceMethodref #24.#25       // java/util/List.size:()I
   #24 = Class              #26           // java/util/List
   #25 = NameAndType        #27:#28       // size:()I
   #26 = Utf8               java/util/List
   #27 = Utf8               size
   #28 = Utf8               ()I
   #29 = Class              #30           // ext/mods/gameserver/enums/skills/Stats
   #30 = Utf8               ext/mods/gameserver/enums/skills/Stats
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/model/Augmentation$AugmentationStatBoni._stats:[Lext/mods/gameserver/enums/skills/Stats;
   #32 = NameAndType        #33:#34       // _stats:[Lext/mods/gameserver/enums/skills/Stats;
   #33 = Utf8               _stats
   #34 = Utf8               [Lext/mods/gameserver/enums/skills/Stats;
   #35 = Fieldref           #8.#36        // ext/mods/gameserver/model/Augmentation$AugmentationStatBoni._values:[F
   #36 = NameAndType        #37:#38       // _values:[F
   #37 = Utf8               _values
   #38 = Utf8               [F
   #39 = InterfaceMethodref #24.#40       // java/util/List.iterator:()Ljava/util/Iterator;
   #40 = NameAndType        #41:#42       // iterator:()Ljava/util/Iterator;
   #41 = Utf8               iterator
   #42 = Utf8               ()Ljava/util/Iterator;
   #43 = InterfaceMethodref #44.#45       // java/util/Iterator.hasNext:()Z
   #44 = Class              #46           // java/util/Iterator
   #45 = NameAndType        #47:#48       // hasNext:()Z
   #46 = Utf8               java/util/Iterator
   #47 = Utf8               hasNext
   #48 = Utf8               ()Z
   #49 = InterfaceMethodref #44.#50       // java/util/Iterator.next:()Ljava/lang/Object;
   #50 = NameAndType        #51:#52       // next:()Ljava/lang/Object;
   #51 = Utf8               next
   #52 = Utf8               ()Ljava/lang/Object;
   #53 = Class              #54           // ext/mods/gameserver/data/xml/AugmentationData$AugStat
   #54 = Utf8               ext/mods/gameserver/data/xml/AugmentationData$AugStat
   #55 = Methodref          #53.#56       // ext/mods/gameserver/data/xml/AugmentationData$AugStat.getStat:()Lext/mods/gameserver/enums/skills/Stats;
   #56 = NameAndType        #57:#58       // getStat:()Lext/mods/gameserver/enums/skills/Stats;
   #57 = Utf8               getStat
   #58 = Utf8               ()Lext/mods/gameserver/enums/skills/Stats;
   #59 = Methodref          #53.#60       // ext/mods/gameserver/data/xml/AugmentationData$AugStat.getValue:()F
   #60 = NameAndType        #61:#62       // getValue:()F
   #61 = Utf8               getValue
   #62 = Utf8               ()F
   #63 = Class              #64           // ext/mods/gameserver/skills/basefuncs/FuncAdd
   #64 = Utf8               ext/mods/gameserver/skills/basefuncs/FuncAdd
   #65 = Methodref          #63.#66       // ext/mods/gameserver/skills/basefuncs/FuncAdd."<init>":(Ljava/lang/Object;Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/skills/conditions/Condition;)V
   #66 = NameAndType        #5:#67        // "<init>":(Ljava/lang/Object;Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/skills/conditions/Condition;)V
   #67 = Utf8               (Ljava/lang/Object;Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/skills/conditions/Condition;)V
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/actor/Player.addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
   #69 = Class              #71           // ext/mods/gameserver/model/actor/Player
   #70 = NameAndType        #72:#73       // addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
   #71 = Utf8               ext/mods/gameserver/model/actor/Player
   #72 = Utf8               addStatFunc
   #73 = Utf8               (Lext/mods/gameserver/skills/basefuncs/Func;)V
   #74 = Methodref          #69.#75       // ext/mods/gameserver/model/actor/Player.removeStatsByOwner:(Ljava/lang/Object;)V
   #75 = NameAndType        #76:#77       // removeStatsByOwner:(Ljava/lang/Object;)V
   #76 = Utf8               removeStatsByOwner
   #77 = Utf8               (Ljava/lang/Object;)V
   #78 = Methodref          #2.#79        // java/lang/Object.getClass:()Ljava/lang/Class;
   #79 = NameAndType        #80:#81       // getClass:()Ljava/lang/Class;
   #80 = Utf8               getClass
   #81 = Utf8               ()Ljava/lang/Class;
   #82 = Methodref          #83.#84       // java/util/Arrays.equals:([Ljava/lang/Object;[Ljava/lang/Object;)Z
   #83 = Class              #85           // java/util/Arrays
   #84 = NameAndType        #86:#87       // equals:([Ljava/lang/Object;[Ljava/lang/Object;)Z
   #85 = Utf8               java/util/Arrays
   #86 = Utf8               equals
   #87 = Utf8               ([Ljava/lang/Object;[Ljava/lang/Object;)Z
   #88 = Methodref          #83.#89       // java/util/Arrays.equals:([F[F)Z
   #89 = NameAndType        #86:#90       // equals:([F[F)Z
   #90 = Utf8               ([F[F)Z
   #91 = Methodref          #83.#92       // java/util/Arrays.hashCode:([Ljava/lang/Object;)I
   #92 = NameAndType        #93:#94       // hashCode:([Ljava/lang/Object;)I
   #93 = Utf8               hashCode
   #94 = Utf8               ([Ljava/lang/Object;)I
   #95 = Methodref          #96.#97       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #96 = Class              #98           // java/lang/Integer
   #97 = NameAndType        #99:#100      // valueOf:(I)Ljava/lang/Integer;
   #98 = Utf8               java/lang/Integer
   #99 = Utf8               valueOf
  #100 = Utf8               (I)Ljava/lang/Integer;
  #101 = Methodref          #83.#102      // java/util/Arrays.hashCode:([F)I
  #102 = NameAndType        #93:#103      // hashCode:([F)I
  #103 = Utf8               ([F)I
  #104 = Methodref          #105.#106     // java/util/Objects.hash:([Ljava/lang/Object;)I
  #105 = Class              #107          // java/util/Objects
  #106 = NameAndType        #108:#94      // hash:([Ljava/lang/Object;)I
  #107 = Utf8               java/util/Objects
  #108 = Utf8               hash
  #109 = Utf8               (I)V
  #110 = Utf8               Code
  #111 = Utf8               LineNumberTable
  #112 = Utf8               LocalVariableTable
  #113 = Utf8               aStat
  #114 = Utf8               Lext/mods/gameserver/data/xml/AugmentationData$AugStat;
  #115 = Utf8               this
  #116 = Utf8               Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
  #117 = Utf8               augmentationId
  #118 = Utf8               I
  #119 = Utf8               as
  #120 = Utf8               Ljava/util/List;
  #121 = Utf8               i
  #122 = Utf8               LocalVariableTypeTable
  #123 = Utf8               Ljava/util/List<Lext/mods/gameserver/data/xml/AugmentationData$AugStat;>;
  #124 = Utf8               StackMapTable
  #125 = Utf8               applyBonus
  #126 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #127 = Utf8               player
  #128 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #129 = Utf8               removeBonus
  #130 = Utf8               (Ljava/lang/Object;)Z
  #131 = Utf8               obj
  #132 = Utf8               Ljava/lang/Object;
  #133 = Utf8               other
  #134 = Utf8               SourceFile
  #135 = Utf8               Augmentation.java
  #136 = Utf8               NestHost
  #137 = Class              #138          // ext/mods/gameserver/model/Augmentation
  #138 = Utf8               ext/mods/gameserver/model/Augmentation
  #139 = Utf8               InnerClasses
  #140 = Utf8               AugmentationStatBoni
  #141 = Utf8               AugStat
{
  public ext.mods.gameserver.model.Augmentation$AugmentationStatBoni(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _active:Z
         9: invokestatic  #13                 // Method ext/mods/gameserver/data/xml/AugmentationData.getInstance:()Lext/mods/gameserver/data/xml/AugmentationData;
        12: iload_1
        13: invokevirtual #19                 // Method ext/mods/gameserver/data/xml/AugmentationData.getAugStatsById:(I)Ljava/util/List;
        16: astore_2
        17: aload_0
        18: aload_2
        19: invokeinterface #23,  1           // InterfaceMethod java/util/List.size:()I
        24: anewarray     #29                 // class ext/mods/gameserver/enums/skills/Stats
        27: putfield      #31                 // Field _stats:[Lext/mods/gameserver/enums/skills/Stats;
        30: aload_0
        31: aload_2
        32: invokeinterface #23,  1           // InterfaceMethod java/util/List.size:()I
        37: newarray       float
        39: putfield      #35                 // Field _values:[F
        42: iconst_0
        43: istore_3
        44: aload_2
        45: invokeinterface #39,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        50: astore        4
        52: aload         4
        54: invokeinterface #43,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        59: ifeq          102
        62: aload         4
        64: invokeinterface #49,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        69: checkcast     #53                 // class ext/mods/gameserver/data/xml/AugmentationData$AugStat
        72: astore        5
        74: aload_0
        75: getfield      #31                 // Field _stats:[Lext/mods/gameserver/enums/skills/Stats;
        78: iload_3
        79: aload         5
        81: invokevirtual #55                 // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat.getStat:()Lext/mods/gameserver/enums/skills/Stats;
        84: aastore
        85: aload_0
        86: getfield      #35                 // Field _values:[F
        89: iload_3
        90: aload         5
        92: invokevirtual #59                 // Method ext/mods/gameserver/data/xml/AugmentationData$AugStat.getValue:()F
        95: fastore
        96: iinc          3, 1
        99: goto          52
       102: return
      LineNumberTable:
        line 129: 0
        line 130: 4
        line 131: 9
        line 133: 17
        line 134: 30
        line 136: 42
        line 137: 44
        line 139: 74
        line 140: 85
        line 141: 96
        line 142: 99
        line 143: 102
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           74      25     5 aStat   Lext/mods/gameserver/data/xml/AugmentationData$AugStat;
            0     103     0  this   Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
            0     103     1 augmentationId   I
           17      86     2    as   Ljava/util/List;
           44      59     3     i   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           17      86     2    as   Ljava/util/List<Lext/mods/gameserver/data/xml/AugmentationData$AugStat;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/Augmentation$AugmentationStatBoni, int, class java/util/List, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 49

  public void applyBonus(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=3, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _active:Z
         4: ifeq          8
         7: return
         8: iconst_0
         9: istore_2
        10: iload_2
        11: aload_0
        12: getfield      #31                 // Field _stats:[Lext/mods/gameserver/enums/skills/Stats;
        15: arraylength
        16: if_icmpge     51
        19: aload_1
        20: new           #63                 // class ext/mods/gameserver/skills/basefuncs/FuncAdd
        23: dup
        24: aload_0
        25: aload_0
        26: getfield      #31                 // Field _stats:[Lext/mods/gameserver/enums/skills/Stats;
        29: iload_2
        30: aaload
        31: aload_0
        32: getfield      #35                 // Field _values:[F
        35: iload_2
        36: faload
        37: f2d
        38: aconst_null
        39: invokespecial #65                 // Method ext/mods/gameserver/skills/basefuncs/FuncAdd."<init>":(Ljava/lang/Object;Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/skills/conditions/Condition;)V
        42: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        45: iinc          2, 1
        48: goto          10
        51: aload_0
        52: iconst_1
        53: putfield      #7                  // Field _active:Z
        56: return
      LineNumberTable:
        line 147: 0
        line 148: 7
        line 150: 8
        line 151: 19
        line 150: 45
        line 153: 51
        line 154: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           10      41     2     i   I
            0      57     0  this   Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
            0      57     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 40

  public void removeBonus(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _active:Z
         4: ifne          8
         7: return
         8: aload_1
         9: aload_0
        10: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.removeStatsByOwner:(Ljava/lang/Object;)V
        13: aload_0
        14: iconst_0
        15: putfield      #7                  // Field _active:Z
        18: return
      LineNumberTable:
        line 158: 0
        line 159: 7
        line 161: 8
        line 163: 13
        line 164: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
            0      19     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: ifnull        22
        11: aload_0
        12: invokevirtual #78                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        15: aload_1
        16: invokevirtual #78                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        19: if_acmpeq     24
        22: iconst_0
        23: ireturn
        24: aload_1
        25: checkcast     #8                  // class ext/mods/gameserver/model/Augmentation$AugmentationStatBoni
        28: astore_2
        29: aload_0
        30: getfield      #31                 // Field _stats:[Lext/mods/gameserver/enums/skills/Stats;
        33: aload_2
        34: getfield      #31                 // Field _stats:[Lext/mods/gameserver/enums/skills/Stats;
        37: invokestatic  #82                 // Method java/util/Arrays.equals:([Ljava/lang/Object;[Ljava/lang/Object;)Z
        40: ifeq          61
        43: aload_0
        44: getfield      #35                 // Field _values:[F
        47: aload_2
        48: getfield      #35                 // Field _values:[F
        51: invokestatic  #88                 // Method java/util/Arrays.equals:([F[F)Z
        54: ifeq          61
        57: iconst_1
        58: goto          62
        61: iconst_0
        62: ireturn
      LineNumberTable:
        line 169: 0
        line 170: 5
        line 172: 7
        line 173: 22
        line 175: 24
        line 176: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
            0      63     1   obj   Ljava/lang/Object;
           29      34     2 other   Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/Augmentation$AugmentationStatBoni ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: iconst_2
         1: anewarray     #2                  // class java/lang/Object
         4: dup
         5: iconst_0
         6: aload_0
         7: getfield      #31                 // Field _stats:[Lext/mods/gameserver/enums/skills/Stats;
        10: invokestatic  #91                 // Method java/util/Arrays.hashCode:([Ljava/lang/Object;)I
        13: invokestatic  #95                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: aastore
        17: dup
        18: iconst_1
        19: aload_0
        20: getfield      #35                 // Field _values:[F
        23: invokestatic  #101                // Method java/util/Arrays.hashCode:([F)I
        26: invokestatic  #95                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokestatic  #104                // Method java/util/Objects.hash:([Ljava/lang/Object;)I
        33: ireturn
      LineNumberTable:
        line 182: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
}
SourceFile: "Augmentation.java"
NestHost: class ext/mods/gameserver/model/Augmentation
InnerClasses:
  public static #140= #8 of #137;         // AugmentationStatBoni=class ext/mods/gameserver/model/Augmentation$AugmentationStatBoni of class ext/mods/gameserver/model/Augmentation
  public static #141= #53 of #14;         // AugStat=class ext/mods/gameserver/data/xml/AugmentationData$AugStat of class ext/mods/gameserver/data/xml/AugmentationData
