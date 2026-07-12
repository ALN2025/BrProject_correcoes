// Bytecode for: ext.mods.gameserver.enums.TeleportMode
// File: ext\mods\gameserver\enums\TeleportMode.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/TeleportMode.class
  Last modified 9 de jul de 2026; size 1315 bytes
  MD5 checksum c72d279719296e7f3b8915ee9977f961
  Compiled from "TeleportMode.java"
public final class ext.mods.gameserver.enums.TeleportMode extends java.lang.Enum<ext.mods.gameserver.enums.TeleportMode>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/TeleportMode
  super_class: #26                        // java/lang/Enum
  interfaces: 0, fields: 6, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/TeleportMode
   #2 = Utf8               ext/mods/gameserver/enums/TeleportMode
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/TeleportMode.NONE:Lext/mods/gameserver/enums/TeleportMode;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/gameserver/enums/TeleportMode;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/gameserver/enums/TeleportMode;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/TeleportMode.ONE_TIME:Lext/mods/gameserver/enums/TeleportMode;
   #8 = NameAndType        #9:#6          // ONE_TIME:Lext/mods/gameserver/enums/TeleportMode;
   #9 = Utf8               ONE_TIME
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/TeleportMode.FULL_TIME:Lext/mods/gameserver/enums/TeleportMode;
  #11 = NameAndType        #12:#6         // FULL_TIME:Lext/mods/gameserver/enums/TeleportMode;
  #12 = Utf8               FULL_TIME
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/TeleportMode.CAMERA_MODE:Lext/mods/gameserver/enums/TeleportMode;
  #14 = NameAndType        #15:#6         // CAMERA_MODE:Lext/mods/gameserver/enums/TeleportMode;
  #15 = Utf8               CAMERA_MODE
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/TeleportMode.$VALUES:[Lext/mods/gameserver/enums/TeleportMode;
  #17 = NameAndType        #18:#19        // $VALUES:[Lext/mods/gameserver/enums/TeleportMode;
  #18 = Utf8               $VALUES
  #19 = Utf8               [Lext/mods/gameserver/enums/TeleportMode;
  #20 = Methodref          #21.#22        // "[Lext/mods/gameserver/enums/TeleportMode;".clone:()Ljava/lang/Object;
  #21 = Class              #19            // "[Lext/mods/gameserver/enums/TeleportMode;"
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
  #35 = String             #5             // NONE
  #36 = Methodref          #1.#32         // ext/mods/gameserver/enums/TeleportMode."<init>":(Ljava/lang/String;I)V
  #37 = String             #9             // ONE_TIME
  #38 = String             #12            // FULL_TIME
  #39 = String             #15            // CAMERA_MODE
  #40 = Methodref          #1.#41         // ext/mods/gameserver/enums/TeleportMode.$values:()[Lext/mods/gameserver/enums/TeleportMode;
  #41 = NameAndType        #42:#43        // $values:()[Lext/mods/gameserver/enums/TeleportMode;
  #42 = Utf8               $values
  #43 = Utf8               ()[Lext/mods/gameserver/enums/TeleportMode;
  #44 = Methodref          #1.#45         // ext/mods/gameserver/enums/TeleportMode.values:()[Lext/mods/gameserver/enums/TeleportMode;
  #45 = NameAndType        #46:#43        // values:()[Lext/mods/gameserver/enums/TeleportMode;
  #46 = Utf8               values
  #47 = Fieldref           #1.#48         // ext/mods/gameserver/enums/TeleportMode.VALUES:[Lext/mods/gameserver/enums/TeleportMode;
  #48 = NameAndType        #49:#19        // VALUES:[Lext/mods/gameserver/enums/TeleportMode;
  #49 = Utf8               VALUES
  #50 = Utf8               Code
  #51 = Utf8               LineNumberTable
  #52 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/TeleportMode;
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               name
  #55 = Utf8               Ljava/lang/String;
  #56 = Utf8               MethodParameters
  #57 = Utf8               this
  #58 = Utf8               Signature
  #59 = Utf8               ()V
  #60 = Utf8               <clinit>
  #61 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/TeleportMode;>;
  #62 = Utf8               SourceFile
  #63 = Utf8               TeleportMode.java
{
  public static final ext.mods.gameserver.enums.TeleportMode NONE;
    descriptor: Lext/mods/gameserver/enums/TeleportMode;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeleportMode ONE_TIME;
    descriptor: Lext/mods/gameserver/enums/TeleportMode;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeleportMode FULL_TIME;
    descriptor: Lext/mods/gameserver/enums/TeleportMode;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeleportMode CAMERA_MODE;
    descriptor: Lext/mods/gameserver/enums/TeleportMode;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeleportMode[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/TeleportMode;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.TeleportMode[] values();
    descriptor: ()[Lext/mods/gameserver/enums/TeleportMode;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/TeleportMode;
         3: invokevirtual #20                 // Method "[Lext/mods/gameserver/enums/TeleportMode;".clone:()Ljava/lang/Object;
         6: checkcast     #21                 // class "[Lext/mods/gameserver/enums/TeleportMode;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.TeleportMode valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/TeleportMode;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/TeleportMode
         2: aload_0
         3: invokestatic  #25                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/TeleportMode
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
         0: new           #1                  // class ext/mods/gameserver/enums/TeleportMode
         3: dup
         4: ldc           #35                 // String NONE
         6: iconst_0
         7: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/TeleportMode;
        13: new           #1                  // class ext/mods/gameserver/enums/TeleportMode
        16: dup
        17: ldc           #37                 // String ONE_TIME
        19: iconst_1
        20: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field ONE_TIME:Lext/mods/gameserver/enums/TeleportMode;
        26: new           #1                  // class ext/mods/gameserver/enums/TeleportMode
        29: dup
        30: ldc           #38                 // String FULL_TIME
        32: iconst_2
        33: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field FULL_TIME:Lext/mods/gameserver/enums/TeleportMode;
        39: new           #1                  // class ext/mods/gameserver/enums/TeleportMode
        42: dup
        43: ldc           #39                 // String CAMERA_MODE
        45: iconst_3
        46: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field CAMERA_MODE:Lext/mods/gameserver/enums/TeleportMode;
        52: invokestatic  #40                 // Method $values:()[Lext/mods/gameserver/enums/TeleportMode;
        55: putstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/TeleportMode;
        58: invokestatic  #44                 // Method values:()[Lext/mods/gameserver/enums/TeleportMode;
        61: putstatic     #47                 // Field VALUES:[Lext/mods/gameserver/enums/TeleportMode;
        64: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 20: 52
        line 27: 58
}
Signature: #61                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/TeleportMode;>;
SourceFile: "TeleportMode.java"
