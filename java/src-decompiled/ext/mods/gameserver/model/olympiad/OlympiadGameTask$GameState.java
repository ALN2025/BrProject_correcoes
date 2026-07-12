// Bytecode for: ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState
// File: ext\mods\gameserver\model\olympiad\OlympiadGameTask$GameState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.class
  Last modified 9 de jul de 2026; size 1901 bytes
  MD5 checksum c8256afcdc6c75d1ff23ab1545e79af3
  Compiled from "OlympiadGameTask.java"
final class ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState extends java.lang.Enum<ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState>
  minor version: 0
  major version: 69
  flags: (0x4030) ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
  super_class: #44                        // java/lang/Enum
  interfaces: 0, fields: 11, methods: 5, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
   #2 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BEGIN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #4 = NameAndType        #5:#6          // BEGIN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #5 = Utf8               BEGIN
   #6 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.TELE_TO_ARENA:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #8 = NameAndType        #9:#6          // TELE_TO_ARENA:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #9 = Utf8               TELE_TO_ARENA
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #11 = NameAndType        #12:#6         // GAME_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #12 = Utf8               GAME_STARTED
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_COUNTDOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #14 = NameAndType        #15:#6         // BATTLE_COUNTDOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #15 = Utf8               BATTLE_COUNTDOWN
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #17 = NameAndType        #18:#6         // BATTLE_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #18 = Utf8               BATTLE_STARTED
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_IN_PROGRESS:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #20 = NameAndType        #21:#6         // BATTLE_IN_PROGRESS:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #21 = Utf8               BATTLE_IN_PROGRESS
  #22 = Fieldref           #1.#23         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STOPPED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #23 = NameAndType        #24:#6         // GAME_STOPPED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #24 = Utf8               GAME_STOPPED
  #25 = Fieldref           #1.#26         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.TELE_TO_TOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #26 = NameAndType        #27:#6         // TELE_TO_TOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #27 = Utf8               TELE_TO_TOWN
  #28 = Fieldref           #1.#29         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.CLEANUP:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #29 = NameAndType        #30:#6         // CLEANUP:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #30 = Utf8               CLEANUP
  #31 = Fieldref           #1.#32         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.IDLE:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #32 = NameAndType        #33:#6         // IDLE:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #33 = Utf8               IDLE
  #34 = Fieldref           #1.#35         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.$VALUES:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #35 = NameAndType        #36:#37        // $VALUES:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #36 = Utf8               $VALUES
  #37 = Utf8               [Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #38 = Methodref          #39.#40        // "[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;".clone:()Ljava/lang/Object;
  #39 = Class              #37            // "[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;"
  #40 = NameAndType        #41:#42        // clone:()Ljava/lang/Object;
  #41 = Utf8               clone
  #42 = Utf8               ()Ljava/lang/Object;
  #43 = Methodref          #44.#45        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #44 = Class              #46            // java/lang/Enum
  #45 = NameAndType        #47:#48        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #46 = Utf8               java/lang/Enum
  #47 = Utf8               valueOf
  #48 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #49 = Methodref          #44.#50        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #50 = NameAndType        #51:#52        // "<init>":(Ljava/lang/String;I)V
  #51 = Utf8               <init>
  #52 = Utf8               (Ljava/lang/String;I)V
  #53 = String             #5             // BEGIN
  #54 = Methodref          #1.#50         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState."<init>":(Ljava/lang/String;I)V
  #55 = String             #9             // TELE_TO_ARENA
  #56 = String             #12            // GAME_STARTED
  #57 = String             #15            // BATTLE_COUNTDOWN
  #58 = String             #18            // BATTLE_STARTED
  #59 = String             #21            // BATTLE_IN_PROGRESS
  #60 = String             #24            // GAME_STOPPED
  #61 = String             #27            // TELE_TO_TOWN
  #62 = String             #30            // CLEANUP
  #63 = String             #33            // IDLE
  #64 = Methodref          #1.#65         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.$values:()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #65 = NameAndType        #66:#67        // $values:()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #66 = Utf8               $values
  #67 = Utf8               ()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #68 = Utf8               values
  #69 = Utf8               Code
  #70 = Utf8               LineNumberTable
  #71 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #72 = Utf8               LocalVariableTable
  #73 = Utf8               name
  #74 = Utf8               Ljava/lang/String;
  #75 = Utf8               MethodParameters
  #76 = Utf8               this
  #77 = Utf8               Signature
  #78 = Utf8               ()V
  #79 = Utf8               <clinit>
  #80 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;>;
  #81 = Utf8               SourceFile
  #82 = Utf8               OlympiadGameTask.java
  #83 = Utf8               NestHost
  #84 = Class              #85            // ext/mods/gameserver/model/olympiad/OlympiadGameTask
  #85 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask
  #86 = Utf8               InnerClasses
  #87 = Utf8               GameState
{
  public static final ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState BEGIN;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState TELE_TO_ARENA;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState GAME_STARTED;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState BATTLE_COUNTDOWN;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState BATTLE_STARTED;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState BATTLE_IN_PROGRESS;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState GAME_STOPPED;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState TELE_TO_TOWN;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState CLEANUP;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState IDLE;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState[] values();
    descriptor: ()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #34                 // Field $VALUES:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         3: invokevirtual #38                 // Method "[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;".clone:()Ljava/lang/Object;
         6: checkcast     #39                 // class "[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;"
         9: areturn
      LineNumberTable:
        line 90: 0

  public static ext.mods.gameserver.model.olympiad.OlympiadGameTask$GameState valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
         2: aload_0
         3: invokestatic  #43                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
         9: areturn
      LineNumberTable:
        line 90: 0
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
         0: new           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
         3: dup
         4: ldc           #53                 // String BEGIN
         6: iconst_0
         7: invokespecial #54                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field BEGIN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        13: new           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
        16: dup
        17: ldc           #55                 // String TELE_TO_ARENA
        19: iconst_1
        20: invokespecial #54                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field TELE_TO_ARENA:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        26: new           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
        29: dup
        30: ldc           #56                 // String GAME_STARTED
        32: iconst_2
        33: invokespecial #54                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field GAME_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        39: new           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
        42: dup
        43: ldc           #57                 // String BATTLE_COUNTDOWN
        45: iconst_3
        46: invokespecial #54                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field BATTLE_COUNTDOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        52: new           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
        55: dup
        56: ldc           #58                 // String BATTLE_STARTED
        58: iconst_4
        59: invokespecial #54                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field BATTLE_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        65: new           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
        68: dup
        69: ldc           #59                 // String BATTLE_IN_PROGRESS
        71: iconst_5
        72: invokespecial #54                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field BATTLE_IN_PROGRESS:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        78: new           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
        81: dup
        82: ldc           #60                 // String GAME_STOPPED
        84: bipush        6
        86: invokespecial #54                 // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field GAME_STOPPED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        92: new           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
        95: dup
        96: ldc           #61                 // String TELE_TO_TOWN
        98: bipush        7
       100: invokespecial #54                 // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field TELE_TO_TOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       106: new           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
       109: dup
       110: ldc           #62                 // String CLEANUP
       112: bipush        8
       114: invokespecial #54                 // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field CLEANUP:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       120: new           #1                  // class ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
       123: dup
       124: ldc           #63                 // String IDLE
       126: bipush        9
       128: invokespecial #54                 // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field IDLE:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       134: invokestatic  #64                 // Method $values:()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       137: putstatic     #34                 // Field $VALUES:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       140: return
      LineNumberTable:
        line 92: 0
        line 93: 13
        line 94: 26
        line 95: 39
        line 96: 52
        line 97: 65
        line 98: 78
        line 99: 92
        line 100: 106
        line 101: 120
        line 90: 134
}
Signature: #80                          // Ljava/lang/Enum<Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;>;
SourceFile: "OlympiadGameTask.java"
NestHost: class ext/mods/gameserver/model/olympiad/OlympiadGameTask
