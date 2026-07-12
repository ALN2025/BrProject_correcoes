// Bytecode for: ext.mods.gameserver.data.manager.DerbyTrackManager$RaceState
// File: ext\mods\gameserver\data\manager\DerbyTrackManager$RaceState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.class
  Last modified 9 de jul de 2026; size 1533 bytes
  MD5 checksum 0d5e2925921e3b6f351e4a7fdc6375bf
  Compiled from "DerbyTrackManager.java"
public final class ext.mods.gameserver.data.manager.DerbyTrackManager$RaceState extends java.lang.Enum<ext.mods.gameserver.data.manager.DerbyTrackManager$RaceState>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
  super_class: #26                        // java/lang/Enum
  interfaces: 0, fields: 5, methods: 5, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
   #2 = Utf8               ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.ACCEPTING_BETS:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #4 = NameAndType        #5:#6          // ACCEPTING_BETS:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #5 = Utf8               ACCEPTING_BETS
   #6 = Utf8               Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.WAITING:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #8 = NameAndType        #9:#6          // WAITING:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #9 = Utf8               WAITING
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.STARTING_RACE:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #11 = NameAndType        #12:#6         // STARTING_RACE:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #12 = Utf8               STARTING_RACE
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.RACE_END:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #14 = NameAndType        #15:#6         // RACE_END:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #15 = Utf8               RACE_END
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.$VALUES:[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #17 = NameAndType        #18:#19        // $VALUES:[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #18 = Utf8               $VALUES
  #19 = Utf8               [Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #20 = Methodref          #21.#22        // "[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;".clone:()Ljava/lang/Object;
  #21 = Class              #19            // "[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;"
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
  #35 = String             #5             // ACCEPTING_BETS
  #36 = Methodref          #1.#32         // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState."<init>":(Ljava/lang/String;I)V
  #37 = String             #9             // WAITING
  #38 = String             #12            // STARTING_RACE
  #39 = String             #15            // RACE_END
  #40 = Methodref          #1.#41         // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.$values:()[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #41 = NameAndType        #42:#43        // $values:()[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #42 = Utf8               $values
  #43 = Utf8               ()[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #44 = Utf8               values
  #45 = Utf8               Code
  #46 = Utf8               LineNumberTable
  #47 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               name
  #50 = Utf8               Ljava/lang/String;
  #51 = Utf8               MethodParameters
  #52 = Utf8               this
  #53 = Utf8               Signature
  #54 = Utf8               ()V
  #55 = Utf8               <clinit>
  #56 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;>;
  #57 = Utf8               SourceFile
  #58 = Utf8               DerbyTrackManager.java
  #59 = Utf8               NestHost
  #60 = Class              #61            // ext/mods/gameserver/data/manager/DerbyTrackManager
  #61 = Utf8               ext/mods/gameserver/data/manager/DerbyTrackManager
  #62 = Utf8               InnerClasses
  #63 = Utf8               RaceState
{
  public static final ext.mods.gameserver.data.manager.DerbyTrackManager$RaceState ACCEPTING_BETS;
    descriptor: Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.manager.DerbyTrackManager$RaceState WAITING;
    descriptor: Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.manager.DerbyTrackManager$RaceState STARTING_RACE;
    descriptor: Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.manager.DerbyTrackManager$RaceState RACE_END;
    descriptor: Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.data.manager.DerbyTrackManager$RaceState[] values();
    descriptor: ()[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
         3: invokevirtual #20                 // Method "[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;".clone:()Ljava/lang/Object;
         6: checkcast     #21                 // class "[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;"
         9: areturn
      LineNumberTable:
        line 58: 0

  public static ext.mods.gameserver.data.manager.DerbyTrackManager$RaceState valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
         2: aload_0
         3: invokestatic  #25                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
         9: areturn
      LineNumberTable:
        line 58: 0
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
         0: new           #1                  // class ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
         3: dup
         4: ldc           #35                 // String ACCEPTING_BETS
         6: iconst_0
         7: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field ACCEPTING_BETS:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
        13: new           #1                  // class ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
        16: dup
        17: ldc           #37                 // String WAITING
        19: iconst_1
        20: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field WAITING:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
        26: new           #1                  // class ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
        29: dup
        30: ldc           #38                 // String STARTING_RACE
        32: iconst_2
        33: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field STARTING_RACE:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
        39: new           #1                  // class ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
        42: dup
        43: ldc           #39                 // String RACE_END
        45: iconst_3
        46: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field RACE_END:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
        52: invokestatic  #40                 // Method $values:()[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
        55: putstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
        58: return
      LineNumberTable:
        line 60: 0
        line 61: 13
        line 62: 26
        line 63: 39
        line 58: 52
}
Signature: #56                          // Ljava/lang/Enum<Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;>;
SourceFile: "DerbyTrackManager.java"
NestHost: class ext/mods/gameserver/data/manager/DerbyTrackManager
InnerClasses:
  public static final #63= #1 of #60;     // RaceState=class ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState of class ext/mods/gameserver/data/manager/DerbyTrackManager
