// Bytecode for: ext.mods.gameserver.data.manager.BufferManager$BufferSchemeType
// File: ext\mods\gameserver\data\manager\BufferManager$BufferSchemeType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType.class
  Last modified 9 de jul de 2026; size 1425 bytes
  MD5 checksum 4842a69d596dbd1fb31b48331e2560e7
  Compiled from "BufferManager.java"
public final class ext.mods.gameserver.data.manager.BufferManager$BufferSchemeType extends java.lang.Enum<ext.mods.gameserver.data.manager.BufferManager$BufferSchemeType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
  super_class: #20                        // java/lang/Enum
  interfaces: 0, fields: 3, methods: 5, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
   #2 = Utf8               ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType.FIGHTER:Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
   #4 = NameAndType        #5:#6          // FIGHTER:Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
   #5 = Utf8               FIGHTER
   #6 = Utf8               Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType.MAGE:Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
   #8 = NameAndType        #9:#6          // MAGE:Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
   #9 = Utf8               MAGE
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType.$VALUES:[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #11 = NameAndType        #12:#13        // $VALUES:[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #12 = Utf8               $VALUES
  #13 = Utf8               [Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #14 = Methodref          #15.#16        // "[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;".clone:()Ljava/lang/Object;
  #15 = Class              #13            // "[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;"
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
  #29 = String             #5             // FIGHTER
  #30 = Methodref          #1.#26         // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType."<init>":(Ljava/lang/String;I)V
  #31 = String             #9             // MAGE
  #32 = Methodref          #1.#33         // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType.$values:()[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #33 = NameAndType        #34:#35        // $values:()[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #34 = Utf8               $values
  #35 = Utf8               ()[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #36 = Utf8               values
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               name
  #42 = Utf8               Ljava/lang/String;
  #43 = Utf8               MethodParameters
  #44 = Utf8               this
  #45 = Utf8               Signature
  #46 = Utf8               ()V
  #47 = Utf8               <clinit>
  #48 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;>;
  #49 = Utf8               SourceFile
  #50 = Utf8               BufferManager.java
  #51 = Utf8               NestHost
  #52 = Class              #53            // ext/mods/gameserver/data/manager/BufferManager
  #53 = Utf8               ext/mods/gameserver/data/manager/BufferManager
  #54 = Utf8               InnerClasses
  #55 = Utf8               BufferSchemeType
{
  public static final ext.mods.gameserver.data.manager.BufferManager$BufferSchemeType FIGHTER;
    descriptor: Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.manager.BufferManager$BufferSchemeType MAGE;
    descriptor: Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.data.manager.BufferManager$BufferSchemeType[] values();
    descriptor: ()[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #10                 // Field $VALUES:[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
         3: invokevirtual #14                 // Method "[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;".clone:()Ljava/lang/Object;
         6: checkcast     #15                 // class "[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;"
         9: areturn
      LineNumberTable:
        line 63: 0

  public static ext.mods.gameserver.data.manager.BufferManager$BufferSchemeType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
         2: aload_0
         3: invokestatic  #19                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
         9: areturn
      LineNumberTable:
        line 63: 0
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
         0: new           #1                  // class ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
         3: dup
         4: ldc           #29                 // String FIGHTER
         6: iconst_0
         7: invokespecial #30                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field FIGHTER:Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
        13: new           #1                  // class ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
        16: dup
        17: ldc           #31                 // String MAGE
        19: iconst_1
        20: invokespecial #30                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field MAGE:Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
        26: invokestatic  #32                 // Method $values:()[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
        29: putstatic     #10                 // Field $VALUES:[Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
        32: return
      LineNumberTable:
        line 65: 0
        line 66: 13
        line 63: 26
}
Signature: #48                          // Ljava/lang/Enum<Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;>;
SourceFile: "BufferManager.java"
NestHost: class ext/mods/gameserver/data/manager/BufferManager
InnerClasses:
  public static final #55= #1 of #52;     // BufferSchemeType=class ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType of class ext/mods/gameserver/data/manager/BufferManager
