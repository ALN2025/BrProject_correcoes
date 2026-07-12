// Bytecode for: ext.mods.gameserver.enums.skills.PlayerState
// File: ext\mods\gameserver\enums\skills\PlayerState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/skills/PlayerState.class
  Last modified 9 de jul de 2026; size 1515 bytes
  MD5 checksum caa996e6f20fd61015a4094e71a9065a
  Compiled from "PlayerState.java"
public final class ext.mods.gameserver.enums.skills.PlayerState extends java.lang.Enum<ext.mods.gameserver.enums.skills.PlayerState>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/skills/PlayerState
  super_class: #38                        // java/lang/Enum
  interfaces: 0, fields: 9, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/skills/PlayerState
   #2 = Utf8               ext/mods/gameserver/enums/skills/PlayerState
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/skills/PlayerState.RESTING:Lext/mods/gameserver/enums/skills/PlayerState;
   #4 = NameAndType        #5:#6          // RESTING:Lext/mods/gameserver/enums/skills/PlayerState;
   #5 = Utf8               RESTING
   #6 = Utf8               Lext/mods/gameserver/enums/skills/PlayerState;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/skills/PlayerState.MOVING:Lext/mods/gameserver/enums/skills/PlayerState;
   #8 = NameAndType        #9:#6          // MOVING:Lext/mods/gameserver/enums/skills/PlayerState;
   #9 = Utf8               MOVING
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/skills/PlayerState.RUNNING:Lext/mods/gameserver/enums/skills/PlayerState;
  #11 = NameAndType        #12:#6         // RUNNING:Lext/mods/gameserver/enums/skills/PlayerState;
  #12 = Utf8               RUNNING
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/skills/PlayerState.RIDING:Lext/mods/gameserver/enums/skills/PlayerState;
  #14 = NameAndType        #15:#6         // RIDING:Lext/mods/gameserver/enums/skills/PlayerState;
  #15 = Utf8               RIDING
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/skills/PlayerState.FLYING:Lext/mods/gameserver/enums/skills/PlayerState;
  #17 = NameAndType        #18:#6         // FLYING:Lext/mods/gameserver/enums/skills/PlayerState;
  #18 = Utf8               FLYING
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/skills/PlayerState.BEHIND:Lext/mods/gameserver/enums/skills/PlayerState;
  #20 = NameAndType        #21:#6         // BEHIND:Lext/mods/gameserver/enums/skills/PlayerState;
  #21 = Utf8               BEHIND
  #22 = Fieldref           #1.#23         // ext/mods/gameserver/enums/skills/PlayerState.FRONT:Lext/mods/gameserver/enums/skills/PlayerState;
  #23 = NameAndType        #24:#6         // FRONT:Lext/mods/gameserver/enums/skills/PlayerState;
  #24 = Utf8               FRONT
  #25 = Fieldref           #1.#26         // ext/mods/gameserver/enums/skills/PlayerState.OLYMPIAD:Lext/mods/gameserver/enums/skills/PlayerState;
  #26 = NameAndType        #27:#6         // OLYMPIAD:Lext/mods/gameserver/enums/skills/PlayerState;
  #27 = Utf8               OLYMPIAD
  #28 = Fieldref           #1.#29         // ext/mods/gameserver/enums/skills/PlayerState.$VALUES:[Lext/mods/gameserver/enums/skills/PlayerState;
  #29 = NameAndType        #30:#31        // $VALUES:[Lext/mods/gameserver/enums/skills/PlayerState;
  #30 = Utf8               $VALUES
  #31 = Utf8               [Lext/mods/gameserver/enums/skills/PlayerState;
  #32 = Methodref          #33.#34        // "[Lext/mods/gameserver/enums/skills/PlayerState;".clone:()Ljava/lang/Object;
  #33 = Class              #31            // "[Lext/mods/gameserver/enums/skills/PlayerState;"
  #34 = NameAndType        #35:#36        // clone:()Ljava/lang/Object;
  #35 = Utf8               clone
  #36 = Utf8               ()Ljava/lang/Object;
  #37 = Methodref          #38.#39        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #38 = Class              #40            // java/lang/Enum
  #39 = NameAndType        #41:#42        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #40 = Utf8               java/lang/Enum
  #41 = Utf8               valueOf
  #42 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #43 = Methodref          #38.#44        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #44 = NameAndType        #45:#46        // "<init>":(Ljava/lang/String;I)V
  #45 = Utf8               <init>
  #46 = Utf8               (Ljava/lang/String;I)V
  #47 = String             #5             // RESTING
  #48 = Methodref          #1.#44         // ext/mods/gameserver/enums/skills/PlayerState."<init>":(Ljava/lang/String;I)V
  #49 = String             #9             // MOVING
  #50 = String             #12            // RUNNING
  #51 = String             #15            // RIDING
  #52 = String             #18            // FLYING
  #53 = String             #21            // BEHIND
  #54 = String             #24            // FRONT
  #55 = String             #27            // OLYMPIAD
  #56 = Methodref          #1.#57         // ext/mods/gameserver/enums/skills/PlayerState.$values:()[Lext/mods/gameserver/enums/skills/PlayerState;
  #57 = NameAndType        #58:#59        // $values:()[Lext/mods/gameserver/enums/skills/PlayerState;
  #58 = Utf8               $values
  #59 = Utf8               ()[Lext/mods/gameserver/enums/skills/PlayerState;
  #60 = Utf8               values
  #61 = Utf8               Code
  #62 = Utf8               LineNumberTable
  #63 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/PlayerState;
  #64 = Utf8               LocalVariableTable
  #65 = Utf8               name
  #66 = Utf8               Ljava/lang/String;
  #67 = Utf8               MethodParameters
  #68 = Utf8               this
  #69 = Utf8               Signature
  #70 = Utf8               ()V
  #71 = Utf8               <clinit>
  #72 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/PlayerState;>;
  #73 = Utf8               SourceFile
  #74 = Utf8               PlayerState.java
{
  public static final ext.mods.gameserver.enums.skills.PlayerState RESTING;
    descriptor: Lext/mods/gameserver/enums/skills/PlayerState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.PlayerState MOVING;
    descriptor: Lext/mods/gameserver/enums/skills/PlayerState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.PlayerState RUNNING;
    descriptor: Lext/mods/gameserver/enums/skills/PlayerState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.PlayerState RIDING;
    descriptor: Lext/mods/gameserver/enums/skills/PlayerState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.PlayerState FLYING;
    descriptor: Lext/mods/gameserver/enums/skills/PlayerState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.PlayerState BEHIND;
    descriptor: Lext/mods/gameserver/enums/skills/PlayerState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.PlayerState FRONT;
    descriptor: Lext/mods/gameserver/enums/skills/PlayerState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.PlayerState OLYMPIAD;
    descriptor: Lext/mods/gameserver/enums/skills/PlayerState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.skills.PlayerState[] values();
    descriptor: ()[Lext/mods/gameserver/enums/skills/PlayerState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #28                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/PlayerState;
         3: invokevirtual #32                 // Method "[Lext/mods/gameserver/enums/skills/PlayerState;".clone:()Ljava/lang/Object;
         6: checkcast     #33                 // class "[Lext/mods/gameserver/enums/skills/PlayerState;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.skills.PlayerState valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/PlayerState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/skills/PlayerState
         2: aload_0
         3: invokestatic  #37                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/skills/PlayerState
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
         0: new           #1                  // class ext/mods/gameserver/enums/skills/PlayerState
         3: dup
         4: ldc           #47                 // String RESTING
         6: iconst_0
         7: invokespecial #48                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field RESTING:Lext/mods/gameserver/enums/skills/PlayerState;
        13: new           #1                  // class ext/mods/gameserver/enums/skills/PlayerState
        16: dup
        17: ldc           #49                 // String MOVING
        19: iconst_1
        20: invokespecial #48                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field MOVING:Lext/mods/gameserver/enums/skills/PlayerState;
        26: new           #1                  // class ext/mods/gameserver/enums/skills/PlayerState
        29: dup
        30: ldc           #50                 // String RUNNING
        32: iconst_2
        33: invokespecial #48                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field RUNNING:Lext/mods/gameserver/enums/skills/PlayerState;
        39: new           #1                  // class ext/mods/gameserver/enums/skills/PlayerState
        42: dup
        43: ldc           #51                 // String RIDING
        45: iconst_3
        46: invokespecial #48                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field RIDING:Lext/mods/gameserver/enums/skills/PlayerState;
        52: new           #1                  // class ext/mods/gameserver/enums/skills/PlayerState
        55: dup
        56: ldc           #52                 // String FLYING
        58: iconst_4
        59: invokespecial #48                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field FLYING:Lext/mods/gameserver/enums/skills/PlayerState;
        65: new           #1                  // class ext/mods/gameserver/enums/skills/PlayerState
        68: dup
        69: ldc           #53                 // String BEHIND
        71: iconst_5
        72: invokespecial #48                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field BEHIND:Lext/mods/gameserver/enums/skills/PlayerState;
        78: new           #1                  // class ext/mods/gameserver/enums/skills/PlayerState
        81: dup
        82: ldc           #54                 // String FRONT
        84: bipush        6
        86: invokespecial #48                 // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field FRONT:Lext/mods/gameserver/enums/skills/PlayerState;
        92: new           #1                  // class ext/mods/gameserver/enums/skills/PlayerState
        95: dup
        96: ldc           #55                 // String OLYMPIAD
        98: bipush        7
       100: invokespecial #48                 // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field OLYMPIAD:Lext/mods/gameserver/enums/skills/PlayerState;
       106: invokestatic  #56                 // Method $values:()[Lext/mods/gameserver/enums/skills/PlayerState;
       109: putstatic     #28                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/PlayerState;
       112: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 26: 52
        line 27: 65
        line 28: 78
        line 29: 92
        line 20: 106
}
Signature: #72                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/PlayerState;>;
SourceFile: "PlayerState.java"
