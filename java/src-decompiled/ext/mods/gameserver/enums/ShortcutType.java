// Bytecode for: ext.mods.gameserver.enums.ShortcutType
// File: ext\mods\gameserver\enums\ShortcutType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/ShortcutType.class
  Last modified 9 de jul de 2026; size 1408 bytes
  MD5 checksum 8edd55ce5b4d324b9da1ef0c95283063
  Compiled from "ShortcutType.java"
public final class ext.mods.gameserver.enums.ShortcutType extends java.lang.Enum<ext.mods.gameserver.enums.ShortcutType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/ShortcutType
  super_class: #32                        // java/lang/Enum
  interfaces: 0, fields: 8, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/ShortcutType
   #2 = Utf8               ext/mods/gameserver/enums/ShortcutType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/ShortcutType.NONE:Lext/mods/gameserver/enums/ShortcutType;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/gameserver/enums/ShortcutType;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/gameserver/enums/ShortcutType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/ShortcutType.ITEM:Lext/mods/gameserver/enums/ShortcutType;
   #8 = NameAndType        #9:#6          // ITEM:Lext/mods/gameserver/enums/ShortcutType;
   #9 = Utf8               ITEM
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/ShortcutType.SKILL:Lext/mods/gameserver/enums/ShortcutType;
  #11 = NameAndType        #12:#6         // SKILL:Lext/mods/gameserver/enums/ShortcutType;
  #12 = Utf8               SKILL
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/ShortcutType.ACTION:Lext/mods/gameserver/enums/ShortcutType;
  #14 = NameAndType        #15:#6         // ACTION:Lext/mods/gameserver/enums/ShortcutType;
  #15 = Utf8               ACTION
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/ShortcutType.MACRO:Lext/mods/gameserver/enums/ShortcutType;
  #17 = NameAndType        #18:#6         // MACRO:Lext/mods/gameserver/enums/ShortcutType;
  #18 = Utf8               MACRO
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/ShortcutType.RECIPE:Lext/mods/gameserver/enums/ShortcutType;
  #20 = NameAndType        #21:#6         // RECIPE:Lext/mods/gameserver/enums/ShortcutType;
  #21 = Utf8               RECIPE
  #22 = Fieldref           #1.#23         // ext/mods/gameserver/enums/ShortcutType.$VALUES:[Lext/mods/gameserver/enums/ShortcutType;
  #23 = NameAndType        #24:#25        // $VALUES:[Lext/mods/gameserver/enums/ShortcutType;
  #24 = Utf8               $VALUES
  #25 = Utf8               [Lext/mods/gameserver/enums/ShortcutType;
  #26 = Methodref          #27.#28        // "[Lext/mods/gameserver/enums/ShortcutType;".clone:()Ljava/lang/Object;
  #27 = Class              #25            // "[Lext/mods/gameserver/enums/ShortcutType;"
  #28 = NameAndType        #29:#30        // clone:()Ljava/lang/Object;
  #29 = Utf8               clone
  #30 = Utf8               ()Ljava/lang/Object;
  #31 = Methodref          #32.#33        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #32 = Class              #34            // java/lang/Enum
  #33 = NameAndType        #35:#36        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Utf8               java/lang/Enum
  #35 = Utf8               valueOf
  #36 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #37 = Methodref          #32.#38        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #38 = NameAndType        #39:#40        // "<init>":(Ljava/lang/String;I)V
  #39 = Utf8               <init>
  #40 = Utf8               (Ljava/lang/String;I)V
  #41 = String             #5             // NONE
  #42 = Methodref          #1.#38         // ext/mods/gameserver/enums/ShortcutType."<init>":(Ljava/lang/String;I)V
  #43 = String             #9             // ITEM
  #44 = String             #12            // SKILL
  #45 = String             #15            // ACTION
  #46 = String             #18            // MACRO
  #47 = String             #21            // RECIPE
  #48 = Methodref          #1.#49         // ext/mods/gameserver/enums/ShortcutType.$values:()[Lext/mods/gameserver/enums/ShortcutType;
  #49 = NameAndType        #50:#51        // $values:()[Lext/mods/gameserver/enums/ShortcutType;
  #50 = Utf8               $values
  #51 = Utf8               ()[Lext/mods/gameserver/enums/ShortcutType;
  #52 = Methodref          #1.#53         // ext/mods/gameserver/enums/ShortcutType.values:()[Lext/mods/gameserver/enums/ShortcutType;
  #53 = NameAndType        #54:#51        // values:()[Lext/mods/gameserver/enums/ShortcutType;
  #54 = Utf8               values
  #55 = Fieldref           #1.#56         // ext/mods/gameserver/enums/ShortcutType.VALUES:[Lext/mods/gameserver/enums/ShortcutType;
  #56 = NameAndType        #57:#25        // VALUES:[Lext/mods/gameserver/enums/ShortcutType;
  #57 = Utf8               VALUES
  #58 = Utf8               Code
  #59 = Utf8               LineNumberTable
  #60 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/ShortcutType;
  #61 = Utf8               LocalVariableTable
  #62 = Utf8               name
  #63 = Utf8               Ljava/lang/String;
  #64 = Utf8               MethodParameters
  #65 = Utf8               this
  #66 = Utf8               Signature
  #67 = Utf8               ()V
  #68 = Utf8               <clinit>
  #69 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/ShortcutType;>;
  #70 = Utf8               SourceFile
  #71 = Utf8               ShortcutType.java
{
  public static final ext.mods.gameserver.enums.ShortcutType NONE;
    descriptor: Lext/mods/gameserver/enums/ShortcutType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ShortcutType ITEM;
    descriptor: Lext/mods/gameserver/enums/ShortcutType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ShortcutType SKILL;
    descriptor: Lext/mods/gameserver/enums/ShortcutType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ShortcutType ACTION;
    descriptor: Lext/mods/gameserver/enums/ShortcutType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ShortcutType MACRO;
    descriptor: Lext/mods/gameserver/enums/ShortcutType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ShortcutType RECIPE;
    descriptor: Lext/mods/gameserver/enums/ShortcutType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ShortcutType[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/ShortcutType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.ShortcutType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/ShortcutType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/enums/ShortcutType;
         3: invokevirtual #26                 // Method "[Lext/mods/gameserver/enums/ShortcutType;".clone:()Ljava/lang/Object;
         6: checkcast     #27                 // class "[Lext/mods/gameserver/enums/ShortcutType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.ShortcutType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/ShortcutType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/ShortcutType
         2: aload_0
         3: invokestatic  #31                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/ShortcutType
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
         0: new           #1                  // class ext/mods/gameserver/enums/ShortcutType
         3: dup
         4: ldc           #41                 // String NONE
         6: iconst_0
         7: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/ShortcutType;
        13: new           #1                  // class ext/mods/gameserver/enums/ShortcutType
        16: dup
        17: ldc           #43                 // String ITEM
        19: iconst_1
        20: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field ITEM:Lext/mods/gameserver/enums/ShortcutType;
        26: new           #1                  // class ext/mods/gameserver/enums/ShortcutType
        29: dup
        30: ldc           #44                 // String SKILL
        32: iconst_2
        33: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field SKILL:Lext/mods/gameserver/enums/ShortcutType;
        39: new           #1                  // class ext/mods/gameserver/enums/ShortcutType
        42: dup
        43: ldc           #45                 // String ACTION
        45: iconst_3
        46: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field ACTION:Lext/mods/gameserver/enums/ShortcutType;
        52: new           #1                  // class ext/mods/gameserver/enums/ShortcutType
        55: dup
        56: ldc           #46                 // String MACRO
        58: iconst_4
        59: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field MACRO:Lext/mods/gameserver/enums/ShortcutType;
        65: new           #1                  // class ext/mods/gameserver/enums/ShortcutType
        68: dup
        69: ldc           #47                 // String RECIPE
        71: iconst_5
        72: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field RECIPE:Lext/mods/gameserver/enums/ShortcutType;
        78: invokestatic  #48                 // Method $values:()[Lext/mods/gameserver/enums/ShortcutType;
        81: putstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/enums/ShortcutType;
        84: invokestatic  #52                 // Method values:()[Lext/mods/gameserver/enums/ShortcutType;
        87: putstatic     #55                 // Field VALUES:[Lext/mods/gameserver/enums/ShortcutType;
        90: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 26: 52
        line 27: 65
        line 20: 78
        line 29: 84
}
Signature: #69                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/ShortcutType;>;
SourceFile: "ShortcutType.java"
