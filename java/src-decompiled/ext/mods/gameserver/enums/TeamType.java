// Bytecode for: ext.mods.gameserver.enums.TeamType
// File: ext\mods\gameserver\enums\TeamType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/TeamType.class
  Last modified 9 de jul de 2026; size 1348 bytes
  MD5 checksum 68313b3a7960e649a1c9ecf62c9969c4
  Compiled from "TeamType.java"
public final class ext.mods.gameserver.enums.TeamType extends java.lang.Enum<ext.mods.gameserver.enums.TeamType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/TeamType
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 5, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/TeamType
   #2 = Utf8               ext/mods/gameserver/enums/TeamType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/gameserver/enums/TeamType;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/gameserver/enums/TeamType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/TeamType.BLUE:Lext/mods/gameserver/enums/TeamType;
   #8 = NameAndType        #9:#6          // BLUE:Lext/mods/gameserver/enums/TeamType;
   #9 = Utf8               BLUE
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/TeamType.RED:Lext/mods/gameserver/enums/TeamType;
  #11 = NameAndType        #12:#6         // RED:Lext/mods/gameserver/enums/TeamType;
  #12 = Utf8               RED
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/TeamType.$VALUES:[Lext/mods/gameserver/enums/TeamType;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/gameserver/enums/TeamType;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/gameserver/enums/TeamType;
  #17 = Methodref          #18.#19        // "[Lext/mods/gameserver/enums/TeamType;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/gameserver/enums/TeamType;"
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
  #32 = Fieldref           #1.#33         // ext/mods/gameserver/enums/TeamType._id:I
  #33 = NameAndType        #34:#35        // _id:I
  #34 = Utf8               _id
  #35 = Utf8               I
  #36 = String             #5             // NONE
  #37 = Methodref          #1.#38         // ext/mods/gameserver/enums/TeamType."<init>":(Ljava/lang/String;II)V
  #38 = NameAndType        #30:#39        // "<init>":(Ljava/lang/String;II)V
  #39 = Utf8               (Ljava/lang/String;II)V
  #40 = String             #9             // BLUE
  #41 = String             #12            // RED
  #42 = Methodref          #1.#43         // ext/mods/gameserver/enums/TeamType.$values:()[Lext/mods/gameserver/enums/TeamType;
  #43 = NameAndType        #44:#45        // $values:()[Lext/mods/gameserver/enums/TeamType;
  #44 = Utf8               $values
  #45 = Utf8               ()[Lext/mods/gameserver/enums/TeamType;
  #46 = Utf8               values
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/TeamType;
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               name
  #52 = Utf8               Ljava/lang/String;
  #53 = Utf8               MethodParameters
  #54 = Utf8               this
  #55 = Utf8               id
  #56 = Utf8               Signature
  #57 = Utf8               (I)V
  #58 = Utf8               getId
  #59 = Utf8               ()I
  #60 = Utf8               <clinit>
  #61 = Utf8               ()V
  #62 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/TeamType;>;
  #63 = Utf8               SourceFile
  #64 = Utf8               TeamType.java
{
  public static final ext.mods.gameserver.enums.TeamType NONE;
    descriptor: Lext/mods/gameserver/enums/TeamType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeamType BLUE;
    descriptor: Lext/mods/gameserver/enums/TeamType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeamType RED;
    descriptor: Lext/mods/gameserver/enums/TeamType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.TeamType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/TeamType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/TeamType;
         3: invokevirtual #17                 // Method "[Lext/mods/gameserver/enums/TeamType;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/gameserver/enums/TeamType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.TeamType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/TeamType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/TeamType
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/TeamType
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
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/TeamType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/TeamType
         3: dup
         4: ldc           #36                 // String NONE
         6: iconst_0
         7: iconst_0
         8: invokespecial #37                 // Method "<init>":(Ljava/lang/String;II)V
        11: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/TeamType;
        14: new           #1                  // class ext/mods/gameserver/enums/TeamType
        17: dup
        18: ldc           #40                 // String BLUE
        20: iconst_1
        21: iconst_1
        22: invokespecial #37                 // Method "<init>":(Ljava/lang/String;II)V
        25: putstatic     #7                  // Field BLUE:Lext/mods/gameserver/enums/TeamType;
        28: new           #1                  // class ext/mods/gameserver/enums/TeamType
        31: dup
        32: ldc           #41                 // String RED
        34: iconst_2
        35: iconst_2
        36: invokespecial #37                 // Method "<init>":(Ljava/lang/String;II)V
        39: putstatic     #10                 // Field RED:Lext/mods/gameserver/enums/TeamType;
        42: invokestatic  #42                 // Method $values:()[Lext/mods/gameserver/enums/TeamType;
        45: putstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/TeamType;
        48: return
      LineNumberTable:
        line 22: 0
        line 23: 14
        line 24: 28
        line 20: 42
}
Signature: #62                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/TeamType;>;
SourceFile: "TeamType.java"
