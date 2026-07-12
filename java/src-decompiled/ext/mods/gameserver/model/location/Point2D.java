// Bytecode for: ext.mods.gameserver.model.location.Point2D
// File: ext\mods\gameserver\model\location\Point2D.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/location/Point2D.class
  Last modified 9 de jul de 2026; size 5080 bytes
  MD5 checksum 7dad2e2b0c8549874f0ab47f971dffa7
  Compiled from "Point2D.java"
public class ext.mods.gameserver.model.location.Point2D
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/location/Point2D
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 26, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/location/Point2D._x:I
    #8 = Class              #10           // ext/mods/gameserver/model/location/Point2D
    #9 = NameAndType        #11:#12       // _x:I
   #10 = Utf8               ext/mods/gameserver/model/location/Point2D
   #11 = Utf8               _x
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/location/Point2D._y:I
   #14 = NameAndType        #15:#12       // _y:I
   #15 = Utf8               _y
   #16 = Methodref          #8.#17        // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
   #17 = NameAndType        #5:#18        // "<init>":(II)V
   #18 = Utf8               (II)V
   #19 = InvokeDynamic      #0:#20        // #0:makeConcatWithConstants:(II)Ljava/lang/String;
   #20 = NameAndType        #21:#22       // makeConcatWithConstants:(II)Ljava/lang/String;
   #21 = Utf8               makeConcatWithConstants
   #22 = Utf8               (II)Ljava/lang/String;
   #23 = Methodref          #24.#25       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #24 = Class              #26           // java/lang/Integer
   #25 = NameAndType        #27:#28       // valueOf:(I)Ljava/lang/Integer;
   #26 = Utf8               java/lang/Integer
   #27 = Utf8               valueOf
   #28 = Utf8               (I)Ljava/lang/Integer;
   #29 = Methodref          #30.#31       // java/util/Objects.hash:([Ljava/lang/Object;)I
   #30 = Class              #32           // java/util/Objects
   #31 = NameAndType        #33:#34       // hash:([Ljava/lang/Object;)I
   #32 = Utf8               java/util/Objects
   #33 = Utf8               hash
   #34 = Utf8               ([Ljava/lang/Object;)I
   #35 = Methodref          #2.#36        // java/lang/Object.getClass:()Ljava/lang/Class;
   #36 = NameAndType        #37:#38       // getClass:()Ljava/lang/Class;
   #37 = Utf8               getClass
   #38 = Utf8               ()Ljava/lang/Class;
   #39 = Methodref          #8.#40        // ext/mods/gameserver/model/location/Point2D.getX:()I
   #40 = NameAndType        #41:#42       // getX:()I
   #41 = Utf8               getX
   #42 = Utf8               ()I
   #43 = Methodref          #8.#44        // ext/mods/gameserver/model/location/Point2D.getY:()I
   #44 = NameAndType        #45:#42       // getY:()I
   #45 = Utf8               getY
   #46 = Methodref          #47.#48       // java/lang/Math.abs:(D)D
   #47 = Class              #49           // java/lang/Math
   #48 = NameAndType        #50:#51       // abs:(D)D
   #49 = Utf8               java/lang/Math
   #50 = Utf8               abs
   #51 = Utf8               (D)D
   #52 = Methodref          #47.#53       // java/lang/Math.sqrt:(D)D
   #53 = NameAndType        #54:#51       // sqrt:(D)D
   #54 = Utf8               sqrt
   #55 = Methodref          #8.#56        // ext/mods/gameserver/model/location/Point2D.distance2D:(II)D
   #56 = NameAndType        #57:#58       // distance2D:(II)D
   #57 = Utf8               distance2D
   #58 = Utf8               (II)D
   #59 = Methodref          #8.#60        // ext/mods/gameserver/model/location/Point2D.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
   #60 = NameAndType        #57:#61       // distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
   #61 = Utf8               (Lext/mods/gameserver/model/location/Point2D;)D
   #62 = Methodref          #63.#64       // ext/mods/commons/random/Rnd.get:(II)I
   #63 = Class              #65           // ext/mods/commons/random/Rnd
   #64 = NameAndType        #66:#67       // get:(II)I
   #65 = Utf8               ext/mods/commons/random/Rnd
   #66 = Utf8               get
   #67 = Utf8               (II)I
   #68 = Methodref          #63.#69       // ext/mods/commons/random/Rnd.get:(I)I
   #69 = NameAndType        #66:#70       // get:(I)I
   #70 = Utf8               (I)I
   #71 = Methodref          #47.#72       // java/lang/Math.toRadians:(D)D
   #72 = NameAndType        #73:#51       // toRadians:(D)D
   #73 = Utf8               toRadians
   #74 = Methodref          #47.#75       // java/lang/Math.cos:(D)D
   #75 = NameAndType        #76:#51       // cos:(D)D
   #76 = Utf8               cos
   #77 = Methodref          #47.#78       // java/lang/Math.sin:(D)D
   #78 = NameAndType        #79:#51       // sin:(D)D
   #79 = Utf8               sin
   #80 = Methodref          #47.#81       // java/lang/Math.round:(D)J
   #81 = NameAndType        #82:#83       // round:(D)J
   #82 = Utf8               round
   #83 = Utf8               (D)J
   #84 = Methodref          #47.#85       // java/lang/Math.atan2:(DD)D
   #85 = NameAndType        #86:#87       // atan2:(DD)D
   #86 = Utf8               atan2
   #87 = Utf8               (DD)D
   #88 = Methodref          #8.#89        // ext/mods/gameserver/model/location/Point2D.clone:()Lext/mods/gameserver/model/location/Point2D;
   #89 = NameAndType        #90:#91       // clone:()Lext/mods/gameserver/model/location/Point2D;
   #90 = Utf8               clone
   #91 = Utf8               ()Lext/mods/gameserver/model/location/Point2D;
   #92 = Utf8               Code
   #93 = Utf8               LineNumberTable
   #94 = Utf8               LocalVariableTable
   #95 = Utf8               this
   #96 = Utf8               Lext/mods/gameserver/model/location/Point2D;
   #97 = Utf8               x
   #98 = Utf8               y
   #99 = Utf8               toString
  #100 = Utf8               ()Ljava/lang/String;
  #101 = Utf8               hashCode
  #102 = Utf8               equals
  #103 = Utf8               (Ljava/lang/Object;)Z
  #104 = Utf8               obj
  #105 = Utf8               Ljava/lang/Object;
  #106 = Utf8               other
  #107 = Utf8               StackMapTable
  #108 = Utf8               (II)Z
  #109 = Utf8               setX
  #110 = Utf8               (I)V
  #111 = Utf8               setY
  #112 = Utf8               set
  #113 = Utf8               setFleeing
  #114 = Utf8               (Lext/mods/gameserver/model/location/Point2D;I)V
  #115 = Utf8               referenceLoc
  #116 = Utf8               distance
  #117 = Utf8               xDiff
  #118 = Utf8               D
  #119 = Utf8               yDiff
  #120 = Utf8               yxRation
  #121 = Utf8               clean
  #122 = Utf8               dx
  #123 = Utf8               dy
  #124 = Utf8               point
  #125 = Utf8               isIn2DRadius
  #126 = Utf8               (III)Z
  #127 = Utf8               radius
  #128 = Utf8               (Lext/mods/gameserver/model/location/Point2D;I)Z
  #129 = Utf8               addStrictOffset
  #130 = Utf8               offset
  #131 = Utf8               addRandomOffset
  #132 = Utf8               addRandomOffsetBetween
  #133 = Utf8               minOffset
  #134 = Utf8               maxOffset
  #135 = Utf8               angle
  #136 = Utf8               addPositiveOffset
  #137 = Utf8               length
  #138 = Utf8               ()D
  #139 = Utf8               scale
  #140 = Utf8               (D)V
  #141 = Utf8               factor
  #142 = Utf8               rotate
  #143 = Utf8               cosAngle
  #144 = Utf8               sinAngle
  #145 = Utf8               newX
  #146 = Utf8               newY
  #147 = Utf8               calculateRelativeAngle
  #148 = Utf8               ()Ljava/lang/Object;
  #149 = Utf8               Exceptions
  #150 = Class              #151          // java/lang/CloneNotSupportedException
  #151 = Utf8               java/lang/CloneNotSupportedException
  #152 = Utf8               SourceFile
  #153 = Utf8               Point2D.java
  #154 = Utf8               BootstrapMethods
  #155 = String             #156          // \u0001, \u0001
  #156 = Utf8               \u0001, \u0001
  #157 = MethodHandle       6:#158        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #158 = Methodref          #159.#160     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #159 = Class              #161          // java/lang/invoke/StringConcatFactory
  #160 = NameAndType        #21:#162      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #161 = Utf8               java/lang/invoke/StringConcatFactory
  #162 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #163 = Utf8               InnerClasses
  #164 = Class              #165          // java/lang/invoke/MethodHandles$Lookup
  #165 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #166 = Class              #167          // java/lang/invoke/MethodHandles
  #167 = Utf8               java/lang/invoke/MethodHandles
  #168 = Utf8               Lookup
{
  protected int _x;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _y;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.location.Point2D(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _x:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _y:I
        14: return
      LineNumberTable:
        line 33: 0
        line 34: 4
        line 35: 9
        line 36: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      15     1     x   I
            0      15     2     y   I

  public ext.mods.gameserver.model.location.Point2D clone();
    descriptor: ()Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: new           #8                  // class ext/mods/gameserver/model/location/Point2D
         3: dup
         4: aload_0
         5: getfield      #7                  // Field _x:I
         8: aload_0
         9: getfield      #13                 // Field _y:I
        12: invokespecial #16                 // Method "<init>":(II)V
        15: areturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/location/Point2D;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _x:I
         4: aload_0
         5: getfield      #13                 // Field _y:I
         8: invokedynamic #19,  0             // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
        13: areturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/location/Point2D;

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
         7: getfield      #7                  // Field _x:I
        10: invokestatic  #23                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        13: aastore
        14: dup
        15: iconst_1
        16: aload_0
        17: getfield      #13                 // Field _y:I
        20: invokestatic  #23                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        23: aastore
        24: invokestatic  #29                 // Method java/util/Objects.hash:([Ljava/lang/Object;)I
        27: ireturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/location/Point2D;

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
         8: ifnonnull     13
        11: iconst_0
        12: ireturn
        13: aload_0
        14: invokevirtual #35                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        17: aload_1
        18: invokevirtual #35                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        21: if_acmpeq     26
        24: iconst_0
        25: ireturn
        26: aload_1
        27: checkcast     #8                  // class ext/mods/gameserver/model/location/Point2D
        30: astore_2
        31: aload_0
        32: getfield      #7                  // Field _x:I
        35: aload_2
        36: getfield      #7                  // Field _x:I
        39: if_icmpne     57
        42: aload_0
        43: getfield      #13                 // Field _y:I
        46: aload_2
        47: getfield      #13                 // Field _y:I
        50: if_icmpne     57
        53: iconst_1
        54: goto          58
        57: iconst_0
        58: ireturn
      LineNumberTable:
        line 59: 0
        line 60: 5
        line 62: 7
        line 63: 11
        line 65: 13
        line 66: 24
        line 68: 26
        line 69: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      59     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      59     1   obj   Ljava/lang/Object;
           31      28     2 other   Lext/mods/gameserver/model/location/Point2D;
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 5 /* same */
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/location/Point2D ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean equals(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #7                  // Field _x:I
         4: iload_1
         5: if_icmpne     20
         8: aload_0
         9: getfield      #13                 // Field _y:I
        12: iload_2
        13: if_icmpne     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      22     1     x   I
            0      22     2     y   I
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _x:I
         4: ireturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/Point2D;

  public void setX(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _x:I
         5: return
      LineNumberTable:
        line 89: 0
        line 90: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/location/Point2D;
            0       6     1     x   I

  public int getY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _y:I
         4: ireturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/Point2D;

  public void setY(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _y:I
         5: return
      LineNumberTable:
        line 99: 0
        line 100: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/location/Point2D;
            0       6     1     y   I

  public void set(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _x:I
         5: aload_0
         6: iload_2
         7: putfield      #13                 // Field _y:I
        10: return
      LineNumberTable:
        line 104: 0
        line 105: 5
        line 106: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      11     1     x   I
            0      11     2     y   I

  public void setFleeing(ext.mods.gameserver.model.location.Point2D, int);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=11, args_size=3
         0: aload_1
         1: invokevirtual #39                 // Method getX:()I
         4: aload_0
         5: getfield      #7                  // Field _x:I
         8: isub
         9: i2d
        10: dstore_3
        11: aload_1
        12: invokevirtual #43                 // Method getY:()I
        15: aload_0
        16: getfield      #13                 // Field _y:I
        19: isub
        20: i2d
        21: dstore        5
        23: dload_3
        24: dload         5
        26: ddiv
        27: invokestatic  #46                 // Method java/lang/Math.abs:(D)D
        30: dstore        7
        32: iload_2
        33: i2d
        34: dload         7
        36: dconst_1
        37: dadd
        38: ddiv
        39: d2i
        40: istore        9
        42: iload         9
        44: i2d
        45: dload         7
        47: dmul
        48: d2i
        49: istore        10
        51: aload_0
        52: dup
        53: getfield      #7                  // Field _x:I
        56: dload_3
        57: dconst_0
        58: dcmpg
        59: ifge          67
        62: iload         10
        64: goto          70
        67: iload         10
        69: ineg
        70: iadd
        71: putfield      #7                  // Field _x:I
        74: aload_0
        75: dup
        76: getfield      #13                 // Field _y:I
        79: dload         5
        81: dconst_0
        82: dcmpg
        83: ifge          91
        86: iload         9
        88: goto          94
        91: iload         9
        93: ineg
        94: iadd
        95: putfield      #13                 // Field _y:I
        98: return
      LineNumberTable:
        line 117: 0
        line 118: 11
        line 120: 23
        line 122: 32
        line 123: 42
        line 125: 51
        line 126: 74
        line 127: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      99     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      99     1 referenceLoc   Lext/mods/gameserver/model/location/Point2D;
            0      99     2 distance   I
           11      88     3 xDiff   D
           23      76     5 yDiff   D
           32      67     7 yxRation   D
           42      57     9     y   I
           51      48    10     x   I
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D, int, double, double, double, int, int ]
          stack = [ class ext/mods/gameserver/model/location/Point2D, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D, int, double, double, double, int, int ]
          stack = [ class ext/mods/gameserver/model/location/Point2D, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D, int, double, double, double, int, int ]
          stack = [ class ext/mods/gameserver/model/location/Point2D, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D, int, double, double, double, int, int ]
          stack = [ class ext/mods/gameserver/model/location/Point2D, int, int ]

  public void clean();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #7                  // Field _x:I
         5: aload_0
         6: iconst_0
         7: putfield      #13                 // Field _y:I
        10: return
      LineNumberTable:
        line 131: 0
        line 132: 5
        line 133: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/location/Point2D;

  public double distance2D(int, int);
    descriptor: (II)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=3
         0: aload_0
         1: getfield      #7                  // Field _x:I
         4: i2d
         5: iload_1
         6: i2d
         7: dsub
         8: dstore_3
         9: aload_0
        10: getfield      #13                 // Field _y:I
        13: i2d
        14: iload_2
        15: i2d
        16: dsub
        17: dstore        5
        19: dload_3
        20: dload_3
        21: dmul
        22: dload         5
        24: dload         5
        26: dmul
        27: dadd
        28: invokestatic  #52                 // Method java/lang/Math.sqrt:(D)D
        31: dreturn
      LineNumberTable:
        line 142: 0
        line 143: 9
        line 145: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      32     1     x   I
            0      32     2     y   I
            9      23     3    dx   D
           19      13     5    dy   D

  public double distance2D(ext.mods.gameserver.model.location.Point2D);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #39                 // Method getX:()I
         5: aload_1
         6: invokevirtual #43                 // Method getY:()I
         9: invokevirtual #55                 // Method distance2D:(II)D
        12: dreturn
      LineNumberTable:
        line 154: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      13     1 point   Lext/mods/gameserver/model/location/Point2D;

  public boolean isIn2DRadius(int, int, int);
    descriptor: (III)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokevirtual #55                 // Method distance2D:(II)D
         6: iload_3
         7: i2d
         8: dcmpg
         9: ifge          16
        12: iconst_1
        13: goto          17
        16: iconst_0
        17: ireturn
      LineNumberTable:
        line 165: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      18     1     x   I
            0      18     2     y   I
            0      18     3 radius   I
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isIn2DRadius(ext.mods.gameserver.model.location.Point2D, int);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #59                 // Method distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
         5: iload_2
         6: i2d
         7: dcmpg
         8: ifge          15
        11: iconst_1
        12: goto          16
        15: iconst_0
        16: ireturn
      LineNumberTable:
        line 175: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      17     1 point   Lext/mods/gameserver/model/location/Point2D;
            0      17     2 radius   I
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void addStrictOffset(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: iconst_0
         1: istore_2
         2: iconst_0
         3: istore_3
         4: iload_2
         5: ifne          27
         8: iload_3
         9: ifne          27
        12: iconst_m1
        13: iconst_1
        14: invokestatic  #62                 // Method ext/mods/commons/random/Rnd.get:(II)I
        17: istore_2
        18: iconst_m1
        19: iconst_1
        20: invokestatic  #62                 // Method ext/mods/commons/random/Rnd.get:(II)I
        23: istore_3
        24: goto          4
        27: iload_2
        28: iload_1
        29: imul
        30: istore_2
        31: iload_3
        32: iload_1
        33: imul
        34: istore_3
        35: aload_0
        36: dup
        37: getfield      #7                  // Field _x:I
        40: iload_2
        41: iadd
        42: putfield      #7                  // Field _x:I
        45: aload_0
        46: dup
        47: getfield      #13                 // Field _y:I
        50: iload_3
        51: iadd
        52: putfield      #13                 // Field _y:I
        55: return
      LineNumberTable:
        line 184: 0
        line 185: 2
        line 186: 4
        line 188: 12
        line 189: 18
        line 192: 27
        line 193: 31
        line 195: 35
        line 196: 45
        line 197: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      56     1 offset   I
            2      54     2     x   I
            4      52     3     y   I
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 4
          locals = [ int, int ]
        frame_type = 22 /* same */

  public void addRandomOffset(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: dup
         2: getfield      #7                  // Field _x:I
         5: iload_1
         6: ineg
         7: iload_1
         8: invokestatic  #62                 // Method ext/mods/commons/random/Rnd.get:(II)I
        11: iadd
        12: putfield      #7                  // Field _x:I
        15: aload_0
        16: dup
        17: getfield      #13                 // Field _y:I
        20: iload_1
        21: ineg
        22: iload_1
        23: invokestatic  #62                 // Method ext/mods/commons/random/Rnd.get:(II)I
        26: iadd
        27: putfield      #13                 // Field _y:I
        30: return
      LineNumberTable:
        line 205: 0
        line 206: 15
        line 207: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      31     1 offset   I

  public void addRandomOffsetBetween(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=3
         0: iload_1
         1: iflt          13
         4: iload_2
         5: iflt          13
         8: iload_2
         9: iload_1
        10: if_icmpge     14
        13: return
        14: sipush        360
        17: invokestatic  #68                 // Method ext/mods/commons/random/Rnd.get:(I)I
        20: i2d
        21: invokestatic  #71                 // Method java/lang/Math.toRadians:(D)D
        24: dstore_3
        25: iload_1
        26: iload_2
        27: invokestatic  #62                 // Method ext/mods/commons/random/Rnd.get:(II)I
        30: istore        5
        32: aload_0
        33: dup
        34: getfield      #7                  // Field _x:I
        37: iload         5
        39: i2d
        40: dload_3
        41: invokestatic  #74                 // Method java/lang/Math.cos:(D)D
        44: dmul
        45: d2i
        46: iadd
        47: putfield      #7                  // Field _x:I
        50: aload_0
        51: dup
        52: getfield      #13                 // Field _y:I
        55: iload         5
        57: i2d
        58: dload_3
        59: invokestatic  #77                 // Method java/lang/Math.sin:(D)D
        62: dmul
        63: d2i
        64: iadd
        65: putfield      #13                 // Field _y:I
        68: return
      LineNumberTable:
        line 216: 0
        line 217: 13
        line 219: 14
        line 221: 25
        line 223: 32
        line 224: 50
        line 225: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      69     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      69     1 minOffset   I
            0      69     2 maxOffset   I
           25      44     3 angle   D
           32      37     5 offset   I
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 0 /* same */

  public void addPositiveOffset(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: dup
         2: getfield      #7                  // Field _x:I
         5: iload_1
         6: invokestatic  #68                 // Method ext/mods/commons/random/Rnd.get:(I)I
         9: iadd
        10: putfield      #7                  // Field _x:I
        13: aload_0
        14: dup
        15: getfield      #13                 // Field _y:I
        18: iload_1
        19: invokestatic  #68                 // Method ext/mods/commons/random/Rnd.get:(I)I
        22: iadd
        23: putfield      #13                 // Field _y:I
        26: return
      LineNumberTable:
        line 233: 0
        line 234: 13
        line 235: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      27     1 offset   I

  public double length();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _x:I
         4: aload_0
         5: getfield      #7                  // Field _x:I
         8: imul
         9: aload_0
        10: getfield      #13                 // Field _y:I
        13: aload_0
        14: getfield      #13                 // Field _y:I
        17: imul
        18: iadd
        19: i2d
        20: invokestatic  #52                 // Method java/lang/Math.sqrt:(D)D
        23: dreturn
      LineNumberTable:
        line 242: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/location/Point2D;

  public void scale(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #7                  // Field _x:I
         5: i2d
         6: dload_1
         7: dmul
         8: invokestatic  #80                 // Method java/lang/Math.round:(D)J
        11: l2i
        12: putfield      #7                  // Field _x:I
        15: aload_0
        16: aload_0
        17: getfield      #13                 // Field _y:I
        20: i2d
        21: dload_1
        22: dmul
        23: invokestatic  #80                 // Method java/lang/Math.round:(D)J
        26: l2i
        27: putfield      #13                 // Field _y:I
        30: return
      LineNumberTable:
        line 251: 0
        line 252: 15
        line 253: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      31     1 factor   D

  public void rotate(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=11, args_size=2
         0: dload_1
         1: invokestatic  #74                 // Method java/lang/Math.cos:(D)D
         4: dstore_3
         5: dload_1
         6: invokestatic  #77                 // Method java/lang/Math.sin:(D)D
         9: dstore        5
        11: aload_0
        12: getfield      #7                  // Field _x:I
        15: i2d
        16: dload_3
        17: dmul
        18: aload_0
        19: getfield      #13                 // Field _y:I
        22: i2d
        23: dload         5
        25: dmul
        26: dsub
        27: dstore        7
        29: aload_0
        30: getfield      #7                  // Field _x:I
        33: i2d
        34: dload         5
        36: dmul
        37: aload_0
        38: getfield      #13                 // Field _y:I
        41: i2d
        42: dload_3
        43: dmul
        44: dadd
        45: dstore        9
        47: aload_0
        48: dload         7
        50: invokestatic  #80                 // Method java/lang/Math.round:(D)J
        53: l2i
        54: putfield      #7                  // Field _x:I
        57: aload_0
        58: dload         9
        60: invokestatic  #80                 // Method java/lang/Math.round:(D)J
        63: l2i
        64: putfield      #13                 // Field _y:I
        67: return
      LineNumberTable:
        line 261: 0
        line 262: 5
        line 264: 11
        line 265: 29
        line 267: 47
        line 268: 57
        line 269: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      68     1 angle   D
            5      63     3 cosAngle   D
           11      57     5 sinAngle   D
           29      39     7  newX   D
           47      21     9  newY   D

  public double calculateRelativeAngle(ext.mods.gameserver.model.location.Point2D);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _y:I
         4: i2d
         5: aload_0
         6: getfield      #7                  // Field _x:I
         9: i2d
        10: invokestatic  #84                 // Method java/lang/Math.atan2:(DD)D
        13: aload_1
        14: invokevirtual #43                 // Method getY:()I
        17: i2d
        18: aload_1
        19: invokevirtual #39                 // Method getX:()I
        22: i2d
        23: invokestatic  #84                 // Method java/lang/Math.atan2:(DD)D
        26: dsub
        27: dreturn
      LineNumberTable:
        line 277: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/location/Point2D;
            0      28     1 point   Lext/mods/gameserver/model/location/Point2D;

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException;
    descriptor: ()Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #88                 // Method clone:()Lext/mods/gameserver/model/location/Point2D;
         4: areturn
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/Point2D;
    Exceptions:
      throws java.lang.CloneNotSupportedException
}
SourceFile: "Point2D.java"
BootstrapMethods:
  0: #157 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #155 \u0001, \u0001
InnerClasses:
  public static final #168= #164 of #166; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
