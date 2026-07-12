// Bytecode for: ext.mods.gameserver.model.location.RadarMarker
// File: ext\mods\gameserver\model\location\RadarMarker.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/location/RadarMarker.class
  Last modified 9 de jul de 2026; size 1213 bytes
  MD5 checksum 35f66afd935d7f16e75e5a6e5964e722
  Compiled from "RadarMarker.java"
public class ext.mods.gameserver.model.location.RadarMarker extends ext.mods.gameserver.model.location.Location
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/location/RadarMarker
  super_class: #2                         // ext/mods/gameserver/model/location/Location
  interfaces: 0, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #2 = Class              #4             // ext/mods/gameserver/model/location/Location
   #3 = NameAndType        #5:#6          // "<init>":(III)V
   #4 = Utf8               ext/mods/gameserver/model/location/Location
   #5 = Utf8               <init>
   #6 = Utf8               (III)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/location/RadarMarker._type:I
   #8 = Class              #10            // ext/mods/gameserver/model/location/RadarMarker
   #9 = NameAndType        #11:#12        // _type:I
  #10 = Utf8               ext/mods/gameserver/model/location/RadarMarker
  #11 = Utf8               _type
  #12 = Utf8               I
  #13 = Methodref          #2.#14         // ext/mods/gameserver/model/location/Location.hashCode:()I
  #14 = NameAndType        #15:#16        // hashCode:()I
  #15 = Utf8               hashCode
  #16 = Utf8               ()I
  #17 = Class              #18            // java/lang/Object
  #18 = Utf8               java/lang/Object
  #19 = Methodref          #20.#21        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #20 = Class              #22            // java/lang/Integer
  #21 = NameAndType        #23:#24        // valueOf:(I)Ljava/lang/Integer;
  #22 = Utf8               java/lang/Integer
  #23 = Utf8               valueOf
  #24 = Utf8               (I)Ljava/lang/Integer;
  #25 = Methodref          #26.#27        // java/util/Objects.hash:([Ljava/lang/Object;)I
  #26 = Class              #28            // java/util/Objects
  #27 = NameAndType        #29:#30        // hash:([Ljava/lang/Object;)I
  #28 = Utf8               java/util/Objects
  #29 = Utf8               hash
  #30 = Utf8               ([Ljava/lang/Object;)I
  #31 = Methodref          #2.#32         // ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
  #32 = NameAndType        #33:#34        // equals:(Ljava/lang/Object;)Z
  #33 = Utf8               equals
  #34 = Utf8               (Ljava/lang/Object;)Z
  #35 = Methodref          #17.#36        // java/lang/Object.getClass:()Ljava/lang/Class;
  #36 = NameAndType        #37:#38        // getClass:()Ljava/lang/Class;
  #37 = Utf8               getClass
  #38 = Utf8               ()Ljava/lang/Class;
  #39 = Utf8               (IIII)V
  #40 = Utf8               Code
  #41 = Utf8               LineNumberTable
  #42 = Utf8               LocalVariableTable
  #43 = Utf8               this
  #44 = Utf8               Lext/mods/gameserver/model/location/RadarMarker;
  #45 = Utf8               type
  #46 = Utf8               x
  #47 = Utf8               y
  #48 = Utf8               z
  #49 = Utf8               prime
  #50 = Utf8               result
  #51 = Utf8               obj
  #52 = Utf8               Ljava/lang/Object;
  #53 = Utf8               other
  #54 = Utf8               StackMapTable
  #55 = Utf8               SourceFile
  #56 = Utf8               RadarMarker.java
{
  public ext.mods.gameserver.model.location.RadarMarker(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=5
         0: aload_0
         1: iload_2
         2: iload_3
         3: iload         4
         5: invokespecial #1                  // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
         8: aload_0
         9: iload_1
        10: putfield      #7                  // Field _type:I
        13: return
      LineNumberTable:
        line 28: 0
        line 30: 8
        line 31: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/location/RadarMarker;
            0      14     1  type   I
            0      14     2     x   I
            0      14     3     y   I
            0      14     4     z   I

  public ext.mods.gameserver.model.location.RadarMarker(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: invokespecial #1                  // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
         7: aload_0
         8: iconst_1
         9: putfield      #7                  // Field _type:I
        12: return
      LineNumberTable:
        line 35: 0
        line 37: 7
        line 38: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/location/RadarMarker;
            0      13     1     x   I
            0      13     2     y   I
            0      13     3     z   I

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: bipush        31
         2: istore_1
         3: aload_0
         4: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location.hashCode:()I
         7: istore_2
         8: bipush        31
        10: iload_2
        11: imul
        12: iconst_1
        13: anewarray     #17                 // class java/lang/Object
        16: dup
        17: iconst_0
        18: aload_0
        19: getfield      #7                  // Field _type:I
        22: invokestatic  #19                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        25: aastore
        26: invokestatic  #25                 // Method java/util/Objects.hash:([Ljava/lang/Object;)I
        29: iadd
        30: istore_2
        31: iload_2
        32: ireturn
      LineNumberTable:
        line 43: 0
        line 44: 3
        line 45: 8
        line 46: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/location/RadarMarker;
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
         9: invokespecial #31                 // Method ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
        12: ifne          17
        15: iconst_0
        16: ireturn
        17: aload_0
        18: invokevirtual #35                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        21: aload_1
        22: invokevirtual #35                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        25: if_acmpeq     30
        28: iconst_0
        29: ireturn
        30: aload_1
        31: checkcast     #8                  // class ext/mods/gameserver/model/location/RadarMarker
        34: astore_2
        35: aload_0
        36: getfield      #7                  // Field _type:I
        39: aload_2
        40: getfield      #7                  // Field _type:I
        43: if_icmpne     50
        46: iconst_1
        47: goto          51
        50: iconst_0
        51: ireturn
      LineNumberTable:
        line 52: 0
        line 53: 5
        line 55: 7
        line 56: 15
        line 58: 17
        line 59: 28
        line 61: 30
        line 62: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/location/RadarMarker;
            0      52     1   obj   Ljava/lang/Object;
           35      17     2 other   Lext/mods/gameserver/model/location/RadarMarker;
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 9 /* same */
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/location/RadarMarker ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "RadarMarker.java"
