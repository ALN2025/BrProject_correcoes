// Bytecode for: ext.mods.battlerboss.matches.BattleBossRumble$Phase
// File: ext\mods\battlerboss\matches\BattleBossRumble$Phase.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/matches/BattleBossRumble$Phase.class
  Last modified 9 de jul de 2026; size 1394 bytes
  MD5 checksum fec1b82ac5ce847e5f975ae995df96d7
  Compiled from "BattleBossRumble.java"
final class ext.mods.battlerboss.matches.BattleBossRumble$Phase extends java.lang.Enum<ext.mods.battlerboss.matches.BattleBossRumble$Phase>
  minor version: 0
  major version: 69
  flags: (0x4030) ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/battlerboss/matches/BattleBossRumble$Phase
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 4, methods: 5, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/battlerboss/matches/BattleBossRumble$Phase
   #2 = Utf8               ext/mods/battlerboss/matches/BattleBossRumble$Phase
   #3 = Fieldref           #1.#4          // ext/mods/battlerboss/matches/BattleBossRumble$Phase.PREP:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
   #4 = NameAndType        #5:#6          // PREP:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
   #5 = Utf8               PREP
   #6 = Utf8               Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
   #7 = Fieldref           #1.#8          // ext/mods/battlerboss/matches/BattleBossRumble$Phase.BATTLE:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
   #8 = NameAndType        #9:#6          // BATTLE:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
   #9 = Utf8               BATTLE
  #10 = Fieldref           #1.#11         // ext/mods/battlerboss/matches/BattleBossRumble$Phase.BOSS:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
  #11 = NameAndType        #12:#6         // BOSS:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
  #12 = Utf8               BOSS
  #13 = Fieldref           #1.#14         // ext/mods/battlerboss/matches/BattleBossRumble$Phase.$VALUES:[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
  #17 = Methodref          #18.#19        // "[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;"
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
  #32 = String             #5             // PREP
  #33 = Methodref          #1.#29         // ext/mods/battlerboss/matches/BattleBossRumble$Phase."<init>":(Ljava/lang/String;I)V
  #34 = String             #9             // BATTLE
  #35 = String             #12            // BOSS
  #36 = Methodref          #1.#37         // ext/mods/battlerboss/matches/BattleBossRumble$Phase.$values:()[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
  #37 = NameAndType        #38:#39        // $values:()[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
  #38 = Utf8               $values
  #39 = Utf8               ()[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
  #40 = Utf8               values
  #41 = Utf8               Code
  #42 = Utf8               LineNumberTable
  #43 = Utf8               (Ljava/lang/String;)Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               name
  #46 = Utf8               Ljava/lang/String;
  #47 = Utf8               MethodParameters
  #48 = Utf8               this
  #49 = Utf8               Signature
  #50 = Utf8               ()V
  #51 = Utf8               <clinit>
  #52 = Utf8               Ljava/lang/Enum<Lext/mods/battlerboss/matches/BattleBossRumble$Phase;>;
  #53 = Utf8               SourceFile
  #54 = Utf8               BattleBossRumble.java
  #55 = Utf8               NestHost
  #56 = Class              #57            // ext/mods/battlerboss/matches/BattleBossRumble
  #57 = Utf8               ext/mods/battlerboss/matches/BattleBossRumble
  #58 = Utf8               InnerClasses
  #59 = Utf8               Phase
{
  public static final ext.mods.battlerboss.matches.BattleBossRumble$Phase PREP;
    descriptor: Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.battlerboss.matches.BattleBossRumble$Phase BATTLE;
    descriptor: Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.battlerboss.matches.BattleBossRumble$Phase BOSS;
    descriptor: Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.battlerboss.matches.BattleBossRumble$Phase[] values();
    descriptor: ()[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
         3: invokevirtual #17                 // Method "[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;"
         9: areturn
      LineNumberTable:
        line 62: 0

  public static ext.mods.battlerboss.matches.BattleBossRumble$Phase valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/battlerboss/matches/BattleBossRumble$Phase
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/battlerboss/matches/BattleBossRumble$Phase
         9: areturn
      LineNumberTable:
        line 62: 0
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
         0: new           #1                  // class ext/mods/battlerboss/matches/BattleBossRumble$Phase
         3: dup
         4: ldc           #32                 // String PREP
         6: iconst_0
         7: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field PREP:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
        13: new           #1                  // class ext/mods/battlerboss/matches/BattleBossRumble$Phase
        16: dup
        17: ldc           #34                 // String BATTLE
        19: iconst_1
        20: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field BATTLE:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
        26: new           #1                  // class ext/mods/battlerboss/matches/BattleBossRumble$Phase
        29: dup
        30: ldc           #35                 // String BOSS
        32: iconst_2
        33: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field BOSS:Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
        39: invokestatic  #36                 // Method $values:()[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
        42: putstatic     #13                 // Field $VALUES:[Lext/mods/battlerboss/matches/BattleBossRumble$Phase;
        45: return
      LineNumberTable:
        line 64: 0
        line 65: 13
        line 66: 26
        line 62: 39
}
Signature: #52                          // Ljava/lang/Enum<Lext/mods/battlerboss/matches/BattleBossRumble$Phase;>;
SourceFile: "BattleBossRumble.java"
NestHost: class ext/mods/battlerboss/matches/BattleBossRumble
