// Bytecode for: ext.mods.gameserver.enums.items.ShotType
// File: ext\mods\gameserver\enums\items\ShotType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/items/ShotType.class
  Last modified 9 de jul de 2026; size 1438 bytes
  MD5 checksum fbb07f98a846a84ae9732d55ea9f4370
  Compiled from "ShotType.java"
public final class ext.mods.gameserver.enums.items.ShotType extends java.lang.Enum<ext.mods.gameserver.enums.items.ShotType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/items/ShotType
  super_class: #26                        // java/lang/Enum
  interfaces: 0, fields: 6, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/items/ShotType
   #2 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #4 = NameAndType        #5:#6          // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #5 = Utf8               SOULSHOT
   #6 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #8 = NameAndType        #9:#6          // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #9 = Utf8               SPIRITSHOT
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #11 = NameAndType        #12:#6         // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #12 = Utf8               BLESSED_SPIRITSHOT
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/items/ShotType.FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #14 = NameAndType        #15:#6         // FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #15 = Utf8               FISH_SOULSHOT
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/items/ShotType.$VALUES:[Lext/mods/gameserver/enums/items/ShotType;
  #17 = NameAndType        #18:#19        // $VALUES:[Lext/mods/gameserver/enums/items/ShotType;
  #18 = Utf8               $VALUES
  #19 = Utf8               [Lext/mods/gameserver/enums/items/ShotType;
  #20 = Methodref          #21.#22        // "[Lext/mods/gameserver/enums/items/ShotType;".clone:()Ljava/lang/Object;
  #21 = Class              #19            // "[Lext/mods/gameserver/enums/items/ShotType;"
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
  #35 = Methodref          #1.#36         // ext/mods/gameserver/enums/items/ShotType.ordinal:()I
  #36 = NameAndType        #37:#38        // ordinal:()I
  #37 = Utf8               ordinal
  #38 = Utf8               ()I
  #39 = Fieldref           #1.#40         // ext/mods/gameserver/enums/items/ShotType._mask:I
  #40 = NameAndType        #41:#42        // _mask:I
  #41 = Utf8               _mask
  #42 = Utf8               I
  #43 = String             #5             // SOULSHOT
  #44 = Methodref          #1.#32         // ext/mods/gameserver/enums/items/ShotType."<init>":(Ljava/lang/String;I)V
  #45 = String             #9             // SPIRITSHOT
  #46 = String             #12            // BLESSED_SPIRITSHOT
  #47 = String             #15            // FISH_SOULSHOT
  #48 = Methodref          #1.#49         // ext/mods/gameserver/enums/items/ShotType.$values:()[Lext/mods/gameserver/enums/items/ShotType;
  #49 = NameAndType        #50:#51        // $values:()[Lext/mods/gameserver/enums/items/ShotType;
  #50 = Utf8               $values
  #51 = Utf8               ()[Lext/mods/gameserver/enums/items/ShotType;
  #52 = Utf8               values
  #53 = Utf8               Code
  #54 = Utf8               LineNumberTable
  #55 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/ShotType;
  #56 = Utf8               LocalVariableTable
  #57 = Utf8               name
  #58 = Utf8               Ljava/lang/String;
  #59 = Utf8               MethodParameters
  #60 = Utf8               this
  #61 = Utf8               Signature
  #62 = Utf8               ()V
  #63 = Utf8               getMask
  #64 = Utf8               <clinit>
  #65 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/items/ShotType;>;
  #66 = Utf8               SourceFile
  #67 = Utf8               ShotType.java
{
  public static final ext.mods.gameserver.enums.items.ShotType SOULSHOT;
    descriptor: Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ShotType SPIRITSHOT;
    descriptor: Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ShotType BLESSED_SPIRITSHOT;
    descriptor: Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ShotType FISH_SOULSHOT;
    descriptor: Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.items.ShotType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/items/ShotType;
         3: invokevirtual #20                 // Method "[Lext/mods/gameserver/enums/items/ShotType;".clone:()Ljava/lang/Object;
         6: checkcast     #21                 // class "[Lext/mods/gameserver/enums/items/ShotType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.items.ShotType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/items/ShotType
         2: aload_0
         3: invokestatic  #25                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/items/ShotType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public int getMask();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _mask:I
         4: ireturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/ShotType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/items/ShotType
         3: dup
         4: ldc           #43                 // String SOULSHOT
         6: iconst_0
         7: invokespecial #44                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        13: new           #1                  // class ext/mods/gameserver/enums/items/ShotType
        16: dup
        17: ldc           #45                 // String SPIRITSHOT
        19: iconst_1
        20: invokespecial #44                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        26: new           #1                  // class ext/mods/gameserver/enums/items/ShotType
        29: dup
        30: ldc           #46                 // String BLESSED_SPIRITSHOT
        32: iconst_2
        33: invokespecial #44                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        39: new           #1                  // class ext/mods/gameserver/enums/items/ShotType
        42: dup
        43: ldc           #47                 // String FISH_SOULSHOT
        45: iconst_3
        46: invokespecial #44                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        52: invokestatic  #48                 // Method $values:()[Lext/mods/gameserver/enums/items/ShotType;
        55: putstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/items/ShotType;
        58: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 20: 52
}
Signature: #65                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/items/ShotType;>;
SourceFile: "ShotType.java"
