// Bytecode for: ext.mods.gameserver.enums.skills.SkillOpType
// File: ext\mods\gameserver\enums\skills\SkillOpType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/skills/SkillOpType.class
  Last modified 9 de jul de 2026; size 1243 bytes
  MD5 checksum 255adcec75d2af12cd71d84fb560585b
  Compiled from "SkillOpType.java"
public final class ext.mods.gameserver.enums.skills.SkillOpType extends java.lang.Enum<ext.mods.gameserver.enums.skills.SkillOpType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/skills/SkillOpType
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 4, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/skills/SkillOpType
   #2 = Utf8               ext/mods/gameserver/enums/skills/SkillOpType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/skills/SkillOpType.PASSIVE:Lext/mods/gameserver/enums/skills/SkillOpType;
   #4 = NameAndType        #5:#6          // PASSIVE:Lext/mods/gameserver/enums/skills/SkillOpType;
   #5 = Utf8               PASSIVE
   #6 = Utf8               Lext/mods/gameserver/enums/skills/SkillOpType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/skills/SkillOpType.ACTIVE:Lext/mods/gameserver/enums/skills/SkillOpType;
   #8 = NameAndType        #9:#6          // ACTIVE:Lext/mods/gameserver/enums/skills/SkillOpType;
   #9 = Utf8               ACTIVE
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/skills/SkillOpType.TOGGLE:Lext/mods/gameserver/enums/skills/SkillOpType;
  #11 = NameAndType        #12:#6         // TOGGLE:Lext/mods/gameserver/enums/skills/SkillOpType;
  #12 = Utf8               TOGGLE
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/skills/SkillOpType.$VALUES:[Lext/mods/gameserver/enums/skills/SkillOpType;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/gameserver/enums/skills/SkillOpType;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/gameserver/enums/skills/SkillOpType;
  #17 = Methodref          #18.#19        // "[Lext/mods/gameserver/enums/skills/SkillOpType;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/gameserver/enums/skills/SkillOpType;"
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
  #32 = String             #5             // PASSIVE
  #33 = Methodref          #1.#29         // ext/mods/gameserver/enums/skills/SkillOpType."<init>":(Ljava/lang/String;I)V
  #34 = String             #9             // ACTIVE
  #35 = String             #12            // TOGGLE
  #36 = Methodref          #1.#37         // ext/mods/gameserver/enums/skills/SkillOpType.$values:()[Lext/mods/gameserver/enums/skills/SkillOpType;
  #37 = NameAndType        #38:#39        // $values:()[Lext/mods/gameserver/enums/skills/SkillOpType;
  #38 = Utf8               $values
  #39 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillOpType;
  #40 = Utf8               values
  #41 = Utf8               Code
  #42 = Utf8               LineNumberTable
  #43 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/SkillOpType;
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               name
  #46 = Utf8               Ljava/lang/String;
  #47 = Utf8               MethodParameters
  #48 = Utf8               this
  #49 = Utf8               Signature
  #50 = Utf8               ()V
  #51 = Utf8               <clinit>
  #52 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/SkillOpType;>;
  #53 = Utf8               SourceFile
  #54 = Utf8               SkillOpType.java
{
  public static final ext.mods.gameserver.enums.skills.SkillOpType PASSIVE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillOpType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillOpType ACTIVE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillOpType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillOpType TOGGLE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillOpType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.skills.SkillOpType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillOpType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/SkillOpType;
         3: invokevirtual #17                 // Method "[Lext/mods/gameserver/enums/skills/SkillOpType;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/gameserver/enums/skills/SkillOpType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.skills.SkillOpType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/SkillOpType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/skills/SkillOpType
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/skills/SkillOpType
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
         0: new           #1                  // class ext/mods/gameserver/enums/skills/SkillOpType
         3: dup
         4: ldc           #32                 // String PASSIVE
         6: iconst_0
         7: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field PASSIVE:Lext/mods/gameserver/enums/skills/SkillOpType;
        13: new           #1                  // class ext/mods/gameserver/enums/skills/SkillOpType
        16: dup
        17: ldc           #34                 // String ACTIVE
        19: iconst_1
        20: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field ACTIVE:Lext/mods/gameserver/enums/skills/SkillOpType;
        26: new           #1                  // class ext/mods/gameserver/enums/skills/SkillOpType
        29: dup
        30: ldc           #35                 // String TOGGLE
        32: iconst_2
        33: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field TOGGLE:Lext/mods/gameserver/enums/skills/SkillOpType;
        39: invokestatic  #36                 // Method $values:()[Lext/mods/gameserver/enums/skills/SkillOpType;
        42: putstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/SkillOpType;
        45: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 20: 39
}
Signature: #52                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/SkillOpType;>;
SourceFile: "SkillOpType.java"
