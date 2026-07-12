// Bytecode for: ext.mods.gameserver.enums.OpenType
// File: ext\mods\gameserver\enums\OpenType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/OpenType.class
  Last modified 9 de jul de 2026; size 1225 bytes
  MD5 checksum 26653593bff49a0064152e221e385087
  Compiled from "OpenType.java"
public final class ext.mods.gameserver.enums.OpenType extends java.lang.Enum<ext.mods.gameserver.enums.OpenType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/OpenType
  super_class: #26                        // java/lang/Enum
  interfaces: 0, fields: 5, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/OpenType
   #2 = Utf8               ext/mods/gameserver/enums/OpenType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/OpenType.CLICK:Lext/mods/gameserver/enums/OpenType;
   #4 = NameAndType        #5:#6          // CLICK:Lext/mods/gameserver/enums/OpenType;
   #5 = Utf8               CLICK
   #6 = Utf8               Lext/mods/gameserver/enums/OpenType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/OpenType.TIME:Lext/mods/gameserver/enums/OpenType;
   #8 = NameAndType        #9:#6          // TIME:Lext/mods/gameserver/enums/OpenType;
   #9 = Utf8               TIME
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/OpenType.SKILL:Lext/mods/gameserver/enums/OpenType;
  #11 = NameAndType        #12:#6         // SKILL:Lext/mods/gameserver/enums/OpenType;
  #12 = Utf8               SKILL
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/OpenType.NPC:Lext/mods/gameserver/enums/OpenType;
  #14 = NameAndType        #15:#6         // NPC:Lext/mods/gameserver/enums/OpenType;
  #15 = Utf8               NPC
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/OpenType.$VALUES:[Lext/mods/gameserver/enums/OpenType;
  #17 = NameAndType        #18:#19        // $VALUES:[Lext/mods/gameserver/enums/OpenType;
  #18 = Utf8               $VALUES
  #19 = Utf8               [Lext/mods/gameserver/enums/OpenType;
  #20 = Methodref          #21.#22        // "[Lext/mods/gameserver/enums/OpenType;".clone:()Ljava/lang/Object;
  #21 = Class              #19            // "[Lext/mods/gameserver/enums/OpenType;"
  #22 = NameAndType        #23:#24        // clone:()Ljava/lang/Object;
  #23 = Utf8               clone
  #24 = Utf8               ()Ljava/lang/Object;
  #25 = Methodref          #26.#27        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #26 = Class              #28            // java/lang/Enum
  #27 = NameAndType        #29:#30        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #28 = Utf8               java/lang/Enum
  #29 = Utf8               valueOf
  #30 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #31 = Methodref          #26.#32        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #32 = NameAndType        #33:#34        // "<init>":(Ljava/lang/String;I)V
  #33 = Utf8               <init>
  #34 = Utf8               (Ljava/lang/String;I)V
  #35 = String             #5             // CLICK
  #36 = Methodref          #1.#32         // ext/mods/gameserver/enums/OpenType."<init>":(Ljava/lang/String;I)V
  #37 = String             #9             // TIME
  #38 = String             #12            // SKILL
  #39 = String             #15            // NPC
  #40 = Methodref          #1.#41         // ext/mods/gameserver/enums/OpenType.$values:()[Lext/mods/gameserver/enums/OpenType;
  #41 = NameAndType        #42:#43        // $values:()[Lext/mods/gameserver/enums/OpenType;
  #42 = Utf8               $values
  #43 = Utf8               ()[Lext/mods/gameserver/enums/OpenType;
  #44 = Utf8               values
  #45 = Utf8               Code
  #46 = Utf8               LineNumberTable
  #47 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/OpenType;
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               name
  #50 = Utf8               Ljava/lang/String;
  #51 = Utf8               MethodParameters
  #52 = Utf8               this
  #53 = Utf8               Signature
  #54 = Utf8               ()V
  #55 = Utf8               <clinit>
  #56 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/OpenType;>;
  #57 = Utf8               SourceFile
  #58 = Utf8               OpenType.java
{
  public static final ext.mods.gameserver.enums.OpenType CLICK;
    descriptor: Lext/mods/gameserver/enums/OpenType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.OpenType TIME;
    descriptor: Lext/mods/gameserver/enums/OpenType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.OpenType SKILL;
    descriptor: Lext/mods/gameserver/enums/OpenType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.OpenType NPC;
    descriptor: Lext/mods/gameserver/enums/OpenType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.OpenType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/OpenType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/OpenType;
         3: invokevirtual #20                 // Method "[Lext/mods/gameserver/enums/OpenType;".clone:()Ljava/lang/Object;
         6: checkcast     #21                 // class "[Lext/mods/gameserver/enums/OpenType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.OpenType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/OpenType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/OpenType
         2: aload_0
         3: invokestatic  #25                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/OpenType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/OpenType
         3: dup
         4: ldc           #35                 // String CLICK
         6: iconst_0
         7: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field CLICK:Lext/mods/gameserver/enums/OpenType;
        13: new           #1                  // class ext/mods/gameserver/enums/OpenType
        16: dup
        17: ldc           #37                 // String TIME
        19: iconst_1
        20: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field TIME:Lext/mods/gameserver/enums/OpenType;
        26: new           #1                  // class ext/mods/gameserver/enums/OpenType
        29: dup
        30: ldc           #38                 // String SKILL
        32: iconst_2
        33: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field SKILL:Lext/mods/gameserver/enums/OpenType;
        39: new           #1                  // class ext/mods/gameserver/enums/OpenType
        42: dup
        43: ldc           #39                 // String NPC
        45: iconst_3
        46: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field NPC:Lext/mods/gameserver/enums/OpenType;
        52: invokestatic  #40                 // Method $values:()[Lext/mods/gameserver/enums/OpenType;
        55: putstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/OpenType;
        58: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 20: 52
}
Signature: #56                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/OpenType;>;
SourceFile: "OpenType.java"
