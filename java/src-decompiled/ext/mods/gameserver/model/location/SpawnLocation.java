// Bytecode for: ext.mods.gameserver.model.location.SpawnLocation
// File: ext\mods\gameserver\model\location\SpawnLocation.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/location/SpawnLocation.class
  Last modified 9 de jul de 2026; size 5170 bytes
  MD5 checksum 57bd944ea5b5e1a2d009df050617ff67
  Compiled from "SpawnLocation.java"
public class ext.mods.gameserver.model.location.SpawnLocation extends ext.mods.gameserver.model.location.Location
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/location/SpawnLocation
  super_class: #2                         // ext/mods/gameserver/model/location/Location
  interfaces: 0, fields: 2, methods: 22, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/location/Location."<init>":(III)V
    #2 = Class              #4            // ext/mods/gameserver/model/location/Location
    #3 = NameAndType        #5:#6         // "<init>":(III)V
    #4 = Utf8               ext/mods/gameserver/model/location/Location
    #5 = Utf8               <init>
    #6 = Utf8               (III)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/location/SpawnLocation._heading:I
    #8 = Class              #10           // ext/mods/gameserver/model/location/SpawnLocation
    #9 = NameAndType        #11:#12       // _heading:I
   #10 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #11 = Utf8               _heading
   #12 = Utf8               I
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
   #14 = NameAndType        #15:#16       // getX:()I
   #15 = Utf8               getX
   #16 = Utf8               ()I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
   #18 = NameAndType        #19:#16       // getY:()I
   #19 = Utf8               getY
   #20 = Methodref          #8.#21        // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
   #21 = NameAndType        #22:#16       // getZ:()I
   #22 = Utf8               getZ
   #23 = Methodref          #8.#24        // ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
   #24 = NameAndType        #25:#16       // getHeading:()I
   #25 = Utf8               getHeading
   #26 = Fieldref           #8.#27        // ext/mods/gameserver/model/location/SpawnLocation._x:I
   #27 = NameAndType        #28:#12       // _x:I
   #28 = Utf8               _x
   #29 = Fieldref           #8.#30        // ext/mods/gameserver/model/location/SpawnLocation._y:I
   #30 = NameAndType        #31:#12       // _y:I
   #31 = Utf8               _y
   #32 = Fieldref           #8.#33        // ext/mods/gameserver/model/location/SpawnLocation._z:I
   #33 = NameAndType        #34:#12       // _z:I
   #34 = Utf8               _z
   #35 = Methodref          #8.#36        // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
   #36 = NameAndType        #5:#37        // "<init>":(IIII)V
   #37 = Utf8               (IIII)V
   #38 = InvokeDynamic      #0:#39        // #0:makeConcatWithConstants:(IIII)Ljava/lang/String;
   #39 = NameAndType        #40:#41       // makeConcatWithConstants:(IIII)Ljava/lang/String;
   #40 = Utf8               makeConcatWithConstants
   #41 = Utf8               (IIII)Ljava/lang/String;
   #42 = Methodref          #2.#43        // ext/mods/gameserver/model/location/Location.hashCode:()I
   #43 = NameAndType        #44:#16       // hashCode:()I
   #44 = Utf8               hashCode
   #45 = Class              #46           // java/lang/Object
   #46 = Utf8               java/lang/Object
   #47 = Methodref          #48.#49       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #48 = Class              #50           // java/lang/Integer
   #49 = NameAndType        #51:#52       // valueOf:(I)Ljava/lang/Integer;
   #50 = Utf8               java/lang/Integer
   #51 = Utf8               valueOf
   #52 = Utf8               (I)Ljava/lang/Integer;
   #53 = Methodref          #54.#55       // java/util/Objects.hash:([Ljava/lang/Object;)I
   #54 = Class              #56           // java/util/Objects
   #55 = NameAndType        #57:#58       // hash:([Ljava/lang/Object;)I
   #56 = Utf8               java/util/Objects
   #57 = Utf8               hash
   #58 = Utf8               ([Ljava/lang/Object;)I
   #59 = Methodref          #2.#60        // ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
   #60 = NameAndType        #61:#62       // equals:(Ljava/lang/Object;)Z
   #61 = Utf8               equals
   #62 = Utf8               (Ljava/lang/Object;)Z
   #63 = Methodref          #45.#64       // java/lang/Object.getClass:()Ljava/lang/Class;
   #64 = NameAndType        #65:#66       // getClass:()Ljava/lang/Class;
   #65 = Utf8               getClass
   #66 = Utf8               ()Ljava/lang/Class;
   #67 = Methodref          #2.#68        // ext/mods/gameserver/model/location/Location.set:(III)V
   #68 = NameAndType        #69:#6        // set:(III)V
   #69 = Utf8               set
   #70 = Methodref          #71.#72       // ext/mods/commons/math/MathUtil.calculateHeadingFrom:(IIII)I
   #71 = Class              #73           // ext/mods/commons/math/MathUtil
   #72 = NameAndType        #74:#75       // calculateHeadingFrom:(IIII)I
   #73 = Utf8               ext/mods/commons/math/MathUtil
   #74 = Utf8               calculateHeadingFrom
   #75 = Utf8               (IIII)I
   #76 = Methodref          #77.#14       // ext/mods/gameserver/model/WorldObject.getX:()I
   #77 = Class              #78           // ext/mods/gameserver/model/WorldObject
   #78 = Utf8               ext/mods/gameserver/model/WorldObject
   #79 = Methodref          #77.#18       // ext/mods/gameserver/model/WorldObject.getY:()I
   #80 = Methodref          #8.#81        // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(II)V
   #81 = NameAndType        #82:#83       // setHeadingTo:(II)V
   #82 = Utf8               setHeadingTo
   #83 = Utf8               (II)V
   #84 = Methodref          #2.#14        // ext/mods/gameserver/model/location/Location.getX:()I
   #85 = Methodref          #2.#18        // ext/mods/gameserver/model/location/Location.getY:()I
   #86 = Methodref          #71.#87       // ext/mods/commons/math/MathUtil.convertHeadingToDegree:(I)D
   #87 = NameAndType        #88:#89       // convertHeadingToDegree:(I)D
   #88 = Utf8               convertHeadingToDegree
   #89 = Utf8               (I)D
   #90 = Methodref          #91.#92       // java/lang/Math.toRadians:(D)D
   #91 = Class              #93           // java/lang/Math
   #92 = NameAndType        #94:#95       // toRadians:(D)D
   #93 = Utf8               java/lang/Math
   #94 = Utf8               toRadians
   #95 = Utf8               (D)D
   #96 = Methodref          #91.#97       // java/lang/Math.cos:(D)D
   #97 = NameAndType        #98:#95       // cos:(D)D
   #98 = Utf8               cos
   #99 = Methodref          #91.#100      // java/lang/Math.sin:(D)D
  #100 = NameAndType        #101:#95      // sin:(D)D
  #101 = Utf8               sin
  #102 = Double             60.0d
  #104 = Methodref          #71.#105      // ext/mods/commons/math/MathUtil.calculateAngleFrom:(IIII)D
  #105 = NameAndType        #106:#107     // calculateAngleFrom:(IIII)D
  #106 = Utf8               calculateAngleFrom
  #107 = Utf8               (IIII)D
  #108 = Methodref          #77.#24       // ext/mods/gameserver/model/WorldObject.getHeading:()I
  #109 = Double             -300.0d
  #111 = Double             360.0d
  #113 = Double             300.0d
  #115 = Methodref          #91.#116      // java/lang/Math.abs:(D)D
  #116 = NameAndType        #117:#95      // abs:(D)D
  #117 = Utf8               abs
  #118 = Double             -360.0d
  #120 = Methodref          #8.#121       // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #121 = NameAndType        #122:#123     // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #122 = Utf8               clone
  #123 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #124 = Fieldref           #8.#125       // ext/mods/gameserver/model/location/SpawnLocation.DUMMY_SPAWNLOC:Lext/mods/gameserver/model/location/SpawnLocation;
  #125 = NameAndType        #126:#127     // DUMMY_SPAWNLOC:Lext/mods/gameserver/model/location/SpawnLocation;
  #126 = Utf8               DUMMY_SPAWNLOC
  #127 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #128 = Utf8               Code
  #129 = Utf8               LineNumberTable
  #130 = Utf8               LocalVariableTable
  #131 = Utf8               this
  #132 = Utf8               x
  #133 = Utf8               y
  #134 = Utf8               z
  #135 = Utf8               heading
  #136 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
  #137 = Utf8               loc
  #138 = Utf8               toString
  #139 = Utf8               ()Ljava/lang/String;
  #140 = Utf8               prime
  #141 = Utf8               result
  #142 = Utf8               obj
  #143 = Utf8               Ljava/lang/Object;
  #144 = Utf8               other
  #145 = Utf8               StackMapTable
  #146 = Utf8               clean
  #147 = Utf8               ()V
  #148 = Utf8               setHeading
  #149 = Utf8               (I)V
  #150 = Utf8               targetX
  #151 = Utf8               targetY
  #152 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #153 = Utf8               object
  #154 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #155 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #156 = Utf8               Lext/mods/gameserver/model/location/Location;
  #157 = Utf8               addOffsetBasedOnHeading
  #158 = Utf8               offset
  #159 = Utf8               radian
  #160 = Utf8               D
  #161 = Utf8               isBehind
  #162 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #163 = Utf8               target
  #164 = Utf8               maxAngleDiff
  #165 = Utf8               angleChar
  #166 = Utf8               angleTarget
  #167 = Utf8               angleDiff
  #168 = Utf8               isInFrontOf
  #169 = Utf8               isFacing
  #170 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #171 = Utf8               maxAngle
  #172 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #173 = Utf8               ()Lext/mods/gameserver/model/location/Point2D;
  #174 = Utf8               ()Ljava/lang/Object;
  #175 = Utf8               Exceptions
  #176 = Class              #177          // java/lang/CloneNotSupportedException
  #177 = Utf8               java/lang/CloneNotSupportedException
  #178 = Utf8               <clinit>
  #179 = Utf8               SourceFile
  #180 = Utf8               SpawnLocation.java
  #181 = Utf8               BootstrapMethods
  #182 = String             #183          // \u0001, \u0001, \u0001, \u0001
  #183 = Utf8               \u0001, \u0001, \u0001, \u0001
  #184 = MethodHandle       6:#185        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #185 = Methodref          #186.#187     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #186 = Class              #188          // java/lang/invoke/StringConcatFactory
  #187 = NameAndType        #40:#189      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #188 = Utf8               java/lang/invoke/StringConcatFactory
  #189 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #190 = Utf8               InnerClasses
  #191 = Class              #192          // java/lang/invoke/MethodHandles$Lookup
  #192 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #193 = Class              #194          // java/lang/invoke/MethodHandles
  #194 = Utf8               java/lang/invoke/MethodHandles
  #195 = Utf8               Lookup
{
  public static final ext.mods.gameserver.model.location.SpawnLocation DUMMY_SPAWNLOC;
    descriptor: Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  protected volatile int _heading;
    descriptor: I
    flags: (0x0044) ACC_PROTECTED, ACC_VOLATILE

  public ext.mods.gameserver.model.location.SpawnLocation(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: invokespecial #1                  // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
         7: aload_0
         8: iload         4
        10: putfield      #7                  // Field _heading:I
        13: return
      LineNumberTable:
        line 37: 0
        line 39: 7
        line 40: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      14     1     x   I
            0      14     2     y   I
            0      14     3     z   I
            0      14     4 heading   I

  public ext.mods.gameserver.model.location.SpawnLocation(ext.mods.gameserver.model.location.SpawnLocation);
    descriptor: (Lext/mods/gameserver/model/location/SpawnLocation;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #13                 // Method getX:()I
         5: aload_1
         6: invokevirtual #17                 // Method getY:()I
         9: aload_1
        10: invokevirtual #20                 // Method getZ:()I
        13: invokespecial #1                  // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        16: aload_0
        17: aload_1
        18: invokevirtual #23                 // Method getHeading:()I
        21: putfield      #7                  // Field _heading:I
        24: return
      LineNumberTable:
        line 44: 0
        line 46: 16
        line 47: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      25     1   loc   Lext/mods/gameserver/model/location/SpawnLocation;

  public ext.mods.gameserver.model.location.SpawnLocation clone();
    descriptor: ()Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: new           #8                  // class ext/mods/gameserver/model/location/SpawnLocation
         3: dup
         4: aload_0
         5: getfield      #26                 // Field _x:I
         8: aload_0
         9: getfield      #29                 // Field _y:I
        12: aload_0
        13: getfield      #32                 // Field _z:I
        16: aload_0
        17: getfield      #7                  // Field _heading:I
        20: invokespecial #35                 // Method "<init>":(IIII)V
        23: areturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/location/SpawnLocation;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _x:I
         4: aload_0
         5: getfield      #29                 // Field _y:I
         8: aload_0
         9: getfield      #32                 // Field _z:I
        12: aload_0
        13: getfield      #7                  // Field _heading:I
        16: invokedynamic #38,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIII)Ljava/lang/String;
        21: areturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/location/SpawnLocation;

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: bipush        31
         2: istore_1
         3: aload_0
         4: invokespecial #42                 // Method ext/mods/gameserver/model/location/Location.hashCode:()I
         7: istore_2
         8: bipush        31
        10: iload_2
        11: imul
        12: iconst_1
        13: anewarray     #45                 // class java/lang/Object
        16: dup
        17: iconst_0
        18: aload_0
        19: getfield      #7                  // Field _heading:I
        22: invokestatic  #47                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        25: aastore
        26: invokestatic  #53                 // Method java/util/Objects.hash:([Ljava/lang/Object;)I
        29: iadd
        30: istore_2
        31: iload_2
        32: ireturn
      LineNumberTable:
        line 64: 0
        line 65: 3
        line 66: 8
        line 67: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            3      30     1 prime   I
            8      25     2 result   I

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
         7: aload_0
         8: aload_1
         9: invokespecial #59                 // Method ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
        12: ifne          17
        15: iconst_0
        16: ireturn
        17: aload_0
        18: invokevirtual #63                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        21: aload_1
        22: invokevirtual #63                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        25: if_acmpeq     30
        28: iconst_0
        29: ireturn
        30: aload_1
        31: checkcast     #8                  // class ext/mods/gameserver/model/location/SpawnLocation
        34: astore_2
        35: aload_0
        36: getfield      #7                  // Field _heading:I
        39: aload_2
        40: getfield      #7                  // Field _heading:I
        43: if_icmpne     50
        46: iconst_1
        47: goto          51
        50: iconst_0
        51: ireturn
      LineNumberTable:
        line 73: 0
        line 74: 5
        line 76: 7
        line 77: 15
        line 79: 17
        line 80: 28
        line 82: 30
        line 83: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      52     1   obj   Ljava/lang/Object;
           35      17     2 other   Lext/mods/gameserver/model/location/SpawnLocation;
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 9 /* same */
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void clean();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: iconst_0
         3: iconst_0
         4: invokespecial #67                 // Method ext/mods/gameserver/model/location/Location.set:(III)V
         7: aload_0
         8: iconst_0
         9: putfield      #7                  // Field _heading:I
        12: return
      LineNumberTable:
        line 89: 0
        line 91: 7
        line 92: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/location/SpawnLocation;

  public int getHeading();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _heading:I
         4: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/SpawnLocation;

  public void setHeading(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _heading:I
         5: return
      LineNumberTable:
        line 101: 0
        line 102: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0       6     1 heading   I

  public void setHeadingTo(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_0
         2: getfield      #26                 // Field _x:I
         5: aload_0
         6: getfield      #29                 // Field _y:I
         9: iload_1
        10: iload_2
        11: invokestatic  #70                 // Method ext/mods/commons/math/MathUtil.calculateHeadingFrom:(IIII)I
        14: putfield      #7                  // Field _heading:I
        17: return
      LineNumberTable:
        line 111: 0
        line 112: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      18     1 targetX   I
            0      18     2 targetY   I

  public void setHeadingTo(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #76                 // Method ext/mods/gameserver/model/WorldObject.getX:()I
         5: aload_1
         6: invokevirtual #79                 // Method ext/mods/gameserver/model/WorldObject.getY:()I
         9: invokevirtual #80                 // Method setHeadingTo:(II)V
        12: return
      LineNumberTable:
        line 121: 0
        line 122: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      13     1 object   Lext/mods/gameserver/model/WorldObject;

  public void setHeadingTo(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #84                 // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #85                 // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: invokevirtual #80                 // Method setHeadingTo:(II)V
        12: return
      LineNumberTable:
        line 131: 0
        line 132: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      13     1   loc   Lext/mods/gameserver/model/location/Location;

  public void set(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: invokespecial #67                 // Method ext/mods/gameserver/model/location/Location.set:(III)V
         7: aload_0
         8: iload         4
        10: putfield      #7                  // Field _heading:I
        13: return
      LineNumberTable:
        line 136: 0
        line 138: 7
        line 139: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      14     1     x   I
            0      14     2     y   I
            0      14     3     z   I
            0      14     4 heading   I

  public void set(ext.mods.gameserver.model.location.SpawnLocation);
    descriptor: (Lext/mods/gameserver/model/location/SpawnLocation;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #13                 // Method getX:()I
         5: aload_1
         6: invokevirtual #17                 // Method getY:()I
         9: aload_1
        10: invokevirtual #20                 // Method getZ:()I
        13: invokespecial #67                 // Method ext/mods/gameserver/model/location/Location.set:(III)V
        16: aload_0
        17: aload_1
        18: invokevirtual #23                 // Method getHeading:()I
        21: putfield      #7                  // Field _heading:I
        24: return
      LineNumberTable:
        line 143: 0
        line 145: 16
        line 146: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      25     1   loc   Lext/mods/gameserver/model/location/SpawnLocation;

  public void addOffsetBasedOnHeading(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _heading:I
         4: invokestatic  #86                 // Method ext/mods/commons/math/MathUtil.convertHeadingToDegree:(I)D
         7: invokestatic  #90                 // Method java/lang/Math.toRadians:(D)D
        10: dstore_2
        11: aload_0
        12: dup
        13: getfield      #26                 // Field _x:I
        16: dload_2
        17: invokestatic  #96                 // Method java/lang/Math.cos:(D)D
        20: iload_1
        21: i2d
        22: dmul
        23: d2i
        24: iadd
        25: putfield      #26                 // Field _x:I
        28: aload_0
        29: dup
        30: getfield      #29                 // Field _y:I
        33: dload_2
        34: invokestatic  #99                 // Method java/lang/Math.sin:(D)D
        37: iload_1
        38: i2d
        39: dmul
        40: d2i
        41: iadd
        42: putfield      #29                 // Field _y:I
        45: return
      LineNumberTable:
        line 154: 0
        line 156: 11
        line 157: 28
        line 158: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      46     1 offset   I
           11      35     2 radian   D

  public boolean isBehind(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: ldc2_w        #102                // double 60.0d
         9: dstore_2
        10: aload_0
        11: getfield      #26                 // Field _x:I
        14: aload_0
        15: getfield      #29                 // Field _y:I
        18: aload_1
        19: invokevirtual #76                 // Method ext/mods/gameserver/model/WorldObject.getX:()I
        22: aload_1
        23: invokevirtual #79                 // Method ext/mods/gameserver/model/WorldObject.getY:()I
        26: invokestatic  #104                // Method ext/mods/commons/math/MathUtil.calculateAngleFrom:(IIII)D
        29: dstore        4
        31: aload_1
        32: invokevirtual #108                // Method ext/mods/gameserver/model/WorldObject.getHeading:()I
        35: invokestatic  #86                 // Method ext/mods/commons/math/MathUtil.convertHeadingToDegree:(I)D
        38: dstore        6
        40: dload         4
        42: dload         6
        44: dsub
        45: dstore        8
        47: dload         8
        49: ldc2_w        #109                // double -300.0d
        52: dcmpg
        53: ifgt          64
        56: dload         8
        58: ldc2_w        #111                // double 360.0d
        61: dadd
        62: dstore        8
        64: dload         8
        66: ldc2_w        #113                // double 300.0d
        69: dcmpl
        70: iflt          81
        73: dload         8
        75: ldc2_w        #111                // double 360.0d
        78: dsub
        79: dstore        8
        81: dload         8
        83: invokestatic  #115                // Method java/lang/Math.abs:(D)D
        86: ldc2_w        #102                // double 60.0d
        89: dcmpg
        90: ifgt          97
        93: iconst_1
        94: goto          98
        97: iconst_0
        98: ireturn
      LineNumberTable:
        line 166: 0
        line 167: 4
        line 169: 6
        line 170: 10
        line 171: 31
        line 173: 40
        line 175: 47
        line 176: 56
        line 178: 64
        line 179: 73
        line 181: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      99     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      99     1 target   Lext/mods/gameserver/model/WorldObject;
           10      89     2 maxAngleDiff   D
           31      68     4 angleChar   D
           40      59     6 angleTarget   D
           47      52     8 angleDiff   D
      StackMapTable: number_of_entries = 5
        frame_type = 6 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation, class ext/mods/gameserver/model/WorldObject, double, double, double, double ]
          stack = []
        frame_type = 16 /* same */
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isInFrontOf(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: ldc2_w        #102                // double 60.0d
         9: dstore_2
        10: aload_1
        11: invokevirtual #76                 // Method ext/mods/gameserver/model/WorldObject.getX:()I
        14: aload_1
        15: invokevirtual #79                 // Method ext/mods/gameserver/model/WorldObject.getY:()I
        18: aload_0
        19: getfield      #26                 // Field _x:I
        22: aload_0
        23: getfield      #29                 // Field _y:I
        26: invokestatic  #104                // Method ext/mods/commons/math/MathUtil.calculateAngleFrom:(IIII)D
        29: dstore        4
        31: aload_1
        32: invokevirtual #108                // Method ext/mods/gameserver/model/WorldObject.getHeading:()I
        35: invokestatic  #86                 // Method ext/mods/commons/math/MathUtil.convertHeadingToDegree:(I)D
        38: dstore        6
        40: dload         6
        42: dload         4
        44: dsub
        45: dstore        8
        47: dload         8
        49: ldc2_w        #109                // double -300.0d
        52: dcmpg
        53: ifgt          64
        56: dload         8
        58: ldc2_w        #111                // double 360.0d
        61: dadd
        62: dstore        8
        64: dload         8
        66: ldc2_w        #113                // double 300.0d
        69: dcmpl
        70: iflt          81
        73: dload         8
        75: ldc2_w        #111                // double 360.0d
        78: dsub
        79: dstore        8
        81: dload         8
        83: invokestatic  #115                // Method java/lang/Math.abs:(D)D
        86: ldc2_w        #102                // double 60.0d
        89: dcmpg
        90: ifgt          97
        93: iconst_1
        94: goto          98
        97: iconst_0
        98: ireturn
      LineNumberTable:
        line 190: 0
        line 191: 4
        line 193: 6
        line 194: 10
        line 195: 31
        line 197: 40
        line 199: 47
        line 200: 56
        line 202: 64
        line 203: 73
        line 205: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      99     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0      99     1 target   Lext/mods/gameserver/model/WorldObject;
           10      89     2 maxAngleDiff   D
           31      68     4 angleTarget   D
           40      59     6 angleChar   D
           47      52     8 angleDiff   D
      StackMapTable: number_of_entries = 5
        frame_type = 6 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation, class ext/mods/gameserver/model/WorldObject, double, double, double, double ]
          stack = []
        frame_type = 16 /* same */
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isFacing(ext.mods.gameserver.model.WorldObject, int);
    descriptor: (Lext/mods/gameserver/model/WorldObject;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=11, args_size=3
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: iload_2
         7: iconst_2
         8: idiv
         9: i2d
        10: dstore_3
        11: aload_0
        12: getfield      #26                 // Field _x:I
        15: aload_0
        16: getfield      #29                 // Field _y:I
        19: aload_1
        20: invokevirtual #76                 // Method ext/mods/gameserver/model/WorldObject.getX:()I
        23: aload_1
        24: invokevirtual #79                 // Method ext/mods/gameserver/model/WorldObject.getY:()I
        27: invokestatic  #104                // Method ext/mods/commons/math/MathUtil.calculateAngleFrom:(IIII)D
        30: dstore        5
        32: aload_0
        33: invokevirtual #23                 // Method getHeading:()I
        36: invokestatic  #86                 // Method ext/mods/commons/math/MathUtil.convertHeadingToDegree:(I)D
        39: dstore        7
        41: dload         7
        43: dload         5
        45: dsub
        46: dstore        9
        48: dload         9
        50: ldc2_w        #118                // double -360.0d
        53: dload_3
        54: dadd
        55: dcmpg
        56: ifgt          67
        59: dload         9
        61: ldc2_w        #111                // double 360.0d
        64: dadd
        65: dstore        9
        67: dload         9
        69: ldc2_w        #111                // double 360.0d
        72: dload_3
        73: dsub
        74: dcmpl
        75: iflt          86
        78: dload         9
        80: ldc2_w        #111                // double 360.0d
        83: dsub
        84: dstore        9
        86: dload         9
        88: invokestatic  #115                // Method java/lang/Math.abs:(D)D
        91: dload_3
        92: dcmpg
        93: ifgt          100
        96: iconst_1
        97: goto          101
       100: iconst_0
       101: ireturn
      LineNumberTable:
        line 215: 0
        line 216: 4
        line 218: 6
        line 219: 11
        line 220: 32
        line 222: 41
        line 224: 48
        line 225: 59
        line 227: 67
        line 228: 78
        line 230: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     102     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
            0     102     1 target   Lext/mods/gameserver/model/WorldObject;
            0     102     2 maxAngle   I
           11      91     3 maxAngleDiff   D
           32      70     5 angleTarget   D
           41      61     7 angleChar   D
           48      54     9 angleDiff   D
      StackMapTable: number_of_entries = 5
        frame_type = 6 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation, class ext/mods/gameserver/model/WorldObject, int, double, double, double, double ]
          stack = []
        frame_type = 18 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.location.Location clone();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #120                // Method clone:()Lext/mods/gameserver/model/location/SpawnLocation;
         4: areturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/SpawnLocation;

  public ext.mods.gameserver.model.location.Point2D clone();
    descriptor: ()Lext/mods/gameserver/model/location/Point2D;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #120                // Method clone:()Lext/mods/gameserver/model/location/SpawnLocation;
         4: areturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/SpawnLocation;

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException;
    descriptor: ()Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #120                // Method clone:()Lext/mods/gameserver/model/location/SpawnLocation;
         4: areturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/SpawnLocation;
    Exceptions:
      throws java.lang.CloneNotSupportedException

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #8                  // class ext/mods/gameserver/model/location/SpawnLocation
         3: dup
         4: iconst_0
         5: iconst_0
         6: iconst_0
         7: iconst_0
         8: invokespecial #35                 // Method "<init>":(IIII)V
        11: putstatic     #124                // Field DUMMY_SPAWNLOC:Lext/mods/gameserver/model/location/SpawnLocation;
        14: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "SpawnLocation.java"
BootstrapMethods:
  0: #184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #182 \u0001, \u0001, \u0001, \u0001
InnerClasses:
  public static final #195= #191 of #193; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
