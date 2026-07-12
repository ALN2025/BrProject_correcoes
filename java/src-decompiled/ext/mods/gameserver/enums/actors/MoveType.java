// Bytecode for: ext.mods.gameserver.enums.actors.MoveType
// File: ext\mods\gameserver\enums\actors\MoveType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/actors/MoveType.class
  Last modified 9 de jul de 2026; size 1523 bytes
  MD5 checksum df27b0cdece665f7196a680945663f4a
  Compiled from "MoveType.java"
public final class ext.mods.gameserver.enums.actors.MoveType extends java.lang.Enum<ext.mods.gameserver.enums.actors.MoveType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/actors/MoveType
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 6, methods: 7, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/actors/MoveType
   #2 = Utf8               ext/mods/gameserver/enums/actors/MoveType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
   #4 = NameAndType        #5:#6          // GROUND:Lext/mods/gameserver/enums/actors/MoveType;
   #5 = Utf8               GROUND
   #6 = Utf8               Lext/mods/gameserver/enums/actors/MoveType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
   #8 = NameAndType        #9:#6          // SWIM:Lext/mods/gameserver/enums/actors/MoveType;
   #9 = Utf8               SWIM
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
  #11 = NameAndType        #12:#6         // FLY:Lext/mods/gameserver/enums/actors/MoveType;
  #12 = Utf8               FLY
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/actors/MoveType.$VALUES:[Lext/mods/gameserver/enums/actors/MoveType;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/gameserver/enums/actors/MoveType;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/gameserver/enums/actors/MoveType;
  #17 = Methodref          #18.#19        // "[Lext/mods/gameserver/enums/actors/MoveType;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/gameserver/enums/actors/MoveType;"
  #19 = NameAndType        #20:#21        // clone:()Ljava/lang/Object;
  #20 = Utf8               clone
  #21 = Utf8               ()Ljava/lang/Object;
  #22 = Methodref          #23.#24        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #23 = Class              #25            // java/lang/Enum
  #24 = NameAndType        #26:#27        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #25 = Utf8               java/lang/Enum
  #26 = Utf8               valueOf
  #27 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #28 = Methodref          #23.#29        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #29 = NameAndType        #30:#31        // "<init>":(Ljava/lang/String;I)V
  #30 = Utf8               <init>
  #31 = Utf8               (Ljava/lang/String;I)V
  #32 = Fieldref           #1.#33         // ext/mods/gameserver/enums/actors/MoveType._id:I
  #33 = NameAndType        #34:#35        // _id:I
  #34 = Utf8               _id
  #35 = Utf8               I
  #36 = Methodref          #1.#37         // ext/mods/gameserver/enums/actors/MoveType.ordinal:()I
  #37 = NameAndType        #38:#39        // ordinal:()I
  #38 = Utf8               ordinal
  #39 = Utf8               ()I
  #40 = Fieldref           #1.#41         // ext/mods/gameserver/enums/actors/MoveType._mask:I
  #41 = NameAndType        #42:#35        // _mask:I
  #42 = Utf8               _mask
  #43 = String             #5             // GROUND
  #44 = Methodref          #1.#45         // ext/mods/gameserver/enums/actors/MoveType."<init>":(Ljava/lang/String;II)V
  #45 = NameAndType        #30:#46        // "<init>":(Ljava/lang/String;II)V
  #46 = Utf8               (Ljava/lang/String;II)V
  #47 = String             #9             // SWIM
  #48 = String             #12            // FLY
  #49 = Methodref          #1.#50         // ext/mods/gameserver/enums/actors/MoveType.$values:()[Lext/mods/gameserver/enums/actors/MoveType;
  #50 = NameAndType        #51:#52        // $values:()[Lext/mods/gameserver/enums/actors/MoveType;
  #51 = Utf8               $values
  #52 = Utf8               ()[Lext/mods/gameserver/enums/actors/MoveType;
  #53 = Utf8               values
  #54 = Utf8               Code
  #55 = Utf8               LineNumberTable
  #56 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MoveType;
  #57 = Utf8               LocalVariableTable
  #58 = Utf8               name
  #59 = Utf8               Ljava/lang/String;
  #60 = Utf8               MethodParameters
  #61 = Utf8               this
  #62 = Utf8               id
  #63 = Utf8               Signature
  #64 = Utf8               (I)V
  #65 = Utf8               getId
  #66 = Utf8               getMask
  #67 = Utf8               <clinit>
  #68 = Utf8               ()V
  #69 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/MoveType;>;
  #70 = Utf8               SourceFile
  #71 = Utf8               MoveType.java
{
  public static final ext.mods.gameserver.enums.actors.MoveType GROUND;
    descriptor: Lext/mods/gameserver/enums/actors/MoveType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MoveType SWIM;
    descriptor: Lext/mods/gameserver/enums/actors/MoveType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MoveType FLY;
    descriptor: Lext/mods/gameserver/enums/actors/MoveType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.actors.MoveType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/actors/MoveType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/MoveType;
         3: invokevirtual #17                 // Method "[Lext/mods/gameserver/enums/actors/MoveType;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/gameserver/enums/actors/MoveType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.actors.MoveType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MoveType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/actors/MoveType
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/actors/MoveType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/MoveType;

  public int getMask();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _mask:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/MoveType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/actors/MoveType
         3: dup
         4: ldc           #43                 // String GROUND
         6: iconst_0
         7: iconst_0
         8: invokespecial #44                 // Method "<init>":(Ljava/lang/String;II)V
        11: putstatic     #3                  // Field GROUND:Lext/mods/gameserver/enums/actors/MoveType;
        14: new           #1                  // class ext/mods/gameserver/enums/actors/MoveType
        17: dup
        18: ldc           #47                 // String SWIM
        20: iconst_1
        21: iconst_1
        22: invokespecial #44                 // Method "<init>":(Ljava/lang/String;II)V
        25: putstatic     #7                  // Field SWIM:Lext/mods/gameserver/enums/actors/MoveType;
        28: new           #1                  // class ext/mods/gameserver/enums/actors/MoveType
        31: dup
        32: ldc           #48                 // String FLY
        34: iconst_2
        35: iconst_2
        36: invokespecial #44                 // Method "<init>":(Ljava/lang/String;II)V
        39: putstatic     #10                 // Field FLY:Lext/mods/gameserver/enums/actors/MoveType;
        42: invokestatic  #49                 // Method $values:()[Lext/mods/gameserver/enums/actors/MoveType;
        45: putstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/MoveType;
        48: return
      LineNumberTable:
        line 22: 0
        line 23: 14
        line 24: 28
        line 20: 42
}
Signature: #69                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/MoveType;>;
SourceFile: "MoveType.java"
