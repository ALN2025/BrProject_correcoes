// Bytecode for: ext.mods.dungeon.enums.DungeonType
// File: ext\mods\dungeon\enums\DungeonType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dungeon/enums/DungeonType.class
  Last modified 9 de jul de 2026; size 1126 bytes
  MD5 checksum 0465fb5025b6fcd98170f6873cee0f4e
  Compiled from "DungeonType.java"
public final class ext.mods.dungeon.enums.DungeonType extends java.lang.Enum<ext.mods.dungeon.enums.DungeonType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/dungeon/enums/DungeonType
  super_class: #20                        // java/lang/Enum
  interfaces: 0, fields: 3, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/dungeon/enums/DungeonType
   #2 = Utf8               ext/mods/dungeon/enums/DungeonType
   #3 = Fieldref           #1.#4          // ext/mods/dungeon/enums/DungeonType.SOLO:Lext/mods/dungeon/enums/DungeonType;
   #4 = NameAndType        #5:#6          // SOLO:Lext/mods/dungeon/enums/DungeonType;
   #5 = Utf8               SOLO
   #6 = Utf8               Lext/mods/dungeon/enums/DungeonType;
   #7 = Fieldref           #1.#8          // ext/mods/dungeon/enums/DungeonType.PARTY:Lext/mods/dungeon/enums/DungeonType;
   #8 = NameAndType        #9:#6          // PARTY:Lext/mods/dungeon/enums/DungeonType;
   #9 = Utf8               PARTY
  #10 = Fieldref           #1.#11         // ext/mods/dungeon/enums/DungeonType.$VALUES:[Lext/mods/dungeon/enums/DungeonType;
  #11 = NameAndType        #12:#13        // $VALUES:[Lext/mods/dungeon/enums/DungeonType;
  #12 = Utf8               $VALUES
  #13 = Utf8               [Lext/mods/dungeon/enums/DungeonType;
  #14 = Methodref          #15.#16        // "[Lext/mods/dungeon/enums/DungeonType;".clone:()Ljava/lang/Object;
  #15 = Class              #13            // "[Lext/mods/dungeon/enums/DungeonType;"
  #16 = NameAndType        #17:#18        // clone:()Ljava/lang/Object;
  #17 = Utf8               clone
  #18 = Utf8               ()Ljava/lang/Object;
  #19 = Methodref          #20.#21        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #20 = Class              #22            // java/lang/Enum
  #21 = NameAndType        #23:#24        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #22 = Utf8               java/lang/Enum
  #23 = Utf8               valueOf
  #24 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #25 = Methodref          #20.#26        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #26 = NameAndType        #27:#28        // "<init>":(Ljava/lang/String;I)V
  #27 = Utf8               <init>
  #28 = Utf8               (Ljava/lang/String;I)V
  #29 = String             #5             // SOLO
  #30 = Methodref          #1.#26         // ext/mods/dungeon/enums/DungeonType."<init>":(Ljava/lang/String;I)V
  #31 = String             #9             // PARTY
  #32 = Methodref          #1.#33         // ext/mods/dungeon/enums/DungeonType.$values:()[Lext/mods/dungeon/enums/DungeonType;
  #33 = NameAndType        #34:#35        // $values:()[Lext/mods/dungeon/enums/DungeonType;
  #34 = Utf8               $values
  #35 = Utf8               ()[Lext/mods/dungeon/enums/DungeonType;
  #36 = Utf8               values
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               (Ljava/lang/String;)Lext/mods/dungeon/enums/DungeonType;
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               name
  #42 = Utf8               Ljava/lang/String;
  #43 = Utf8               MethodParameters
  #44 = Utf8               this
  #45 = Utf8               Signature
  #46 = Utf8               ()V
  #47 = Utf8               <clinit>
  #48 = Utf8               Ljava/lang/Enum<Lext/mods/dungeon/enums/DungeonType;>;
  #49 = Utf8               SourceFile
  #50 = Utf8               DungeonType.java
{
  public static final ext.mods.dungeon.enums.DungeonType SOLO;
    descriptor: Lext/mods/dungeon/enums/DungeonType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.dungeon.enums.DungeonType PARTY;
    descriptor: Lext/mods/dungeon/enums/DungeonType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.dungeon.enums.DungeonType[] values();
    descriptor: ()[Lext/mods/dungeon/enums/DungeonType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #10                 // Field $VALUES:[Lext/mods/dungeon/enums/DungeonType;
         3: invokevirtual #14                 // Method "[Lext/mods/dungeon/enums/DungeonType;".clone:()Ljava/lang/Object;
         6: checkcast     #15                 // class "[Lext/mods/dungeon/enums/DungeonType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.dungeon.enums.DungeonType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/dungeon/enums/DungeonType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/dungeon/enums/DungeonType
         2: aload_0
         3: invokestatic  #19                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/dungeon/enums/DungeonType
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
         0: new           #1                  // class ext/mods/dungeon/enums/DungeonType
         3: dup
         4: ldc           #29                 // String SOLO
         6: iconst_0
         7: invokespecial #30                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field SOLO:Lext/mods/dungeon/enums/DungeonType;
        13: new           #1                  // class ext/mods/dungeon/enums/DungeonType
        16: dup
        17: ldc           #31                 // String PARTY
        19: iconst_1
        20: invokespecial #30                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field PARTY:Lext/mods/dungeon/enums/DungeonType;
        26: invokestatic  #32                 // Method $values:()[Lext/mods/dungeon/enums/DungeonType;
        29: putstatic     #10                 // Field $VALUES:[Lext/mods/dungeon/enums/DungeonType;
        32: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 20: 26
}
Signature: #48                          // Ljava/lang/Enum<Lext/mods/dungeon/enums/DungeonType;>;
SourceFile: "DungeonType.java"
