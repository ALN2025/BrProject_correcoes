// Bytecode for: ext.mods.battlerboss.holder.EventHolder
// File: ext\mods\battlerboss\holder\EventHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/holder/EventHolder.class
  Last modified 9 de jul de 2026; size 2731 bytes
  MD5 checksum c80b59caeee7b331c38859b7b8409c70
  Compiled from "EventHolder.java"
public class ext.mods.battlerboss.holder.EventHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/battlerboss/holder/EventHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 11, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/battlerboss/holder/EventHolder._id:I
   #8 = Class              #10            // ext/mods/battlerboss/holder/EventHolder
   #9 = NameAndType        #11:#12        // _id:I
  #10 = Utf8               ext/mods/battlerboss/holder/EventHolder
  #11 = Utf8               _id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/battlerboss/holder/EventHolder._name:Ljava/lang/String;
  #14 = NameAndType        #15:#16        // _name:Ljava/lang/String;
  #15 = Utf8               _name
  #16 = Utf8               Ljava/lang/String;
  #17 = Fieldref           #8.#18         // ext/mods/battlerboss/holder/EventHolder._type:Ljava/lang/String;
  #18 = NameAndType        #19:#16        // _type:Ljava/lang/String;
  #19 = Utf8               _type
  #20 = Fieldref           #8.#21         // ext/mods/battlerboss/holder/EventHolder._info:Lext/mods/battlerboss/holder/InfoHolder;
  #21 = NameAndType        #22:#23        // _info:Lext/mods/battlerboss/holder/InfoHolder;
  #22 = Utf8               _info
  #23 = Utf8               Lext/mods/battlerboss/holder/InfoHolder;
  #24 = Fieldref           #8.#25         // ext/mods/battlerboss/holder/EventHolder._registration:Lext/mods/battlerboss/holder/RegistrationHolder;
  #25 = NameAndType        #26:#27        // _registration:Lext/mods/battlerboss/holder/RegistrationHolder;
  #26 = Utf8               _registration
  #27 = Utf8               Lext/mods/battlerboss/holder/RegistrationHolder;
  #28 = Fieldref           #8.#29         // ext/mods/battlerboss/holder/EventHolder._battle:Lext/mods/battlerboss/holder/BattleHolder;
  #29 = NameAndType        #30:#31        // _battle:Lext/mods/battlerboss/holder/BattleHolder;
  #30 = Utf8               _battle
  #31 = Utf8               Lext/mods/battlerboss/holder/BattleHolder;
  #32 = Fieldref           #8.#33         // ext/mods/battlerboss/holder/EventHolder._monster:Lext/mods/battlerboss/holder/MonsterChallengeHolder;
  #33 = NameAndType        #34:#35        // _monster:Lext/mods/battlerboss/holder/MonsterChallengeHolder;
  #34 = Utf8               _monster
  #35 = Utf8               Lext/mods/battlerboss/holder/MonsterChallengeHolder;
  #36 = Fieldref           #8.#37         // ext/mods/battlerboss/holder/EventHolder._teleport:Lext/mods/battlerboss/holder/TeleportHolder;
  #37 = NameAndType        #38:#39        // _teleport:Lext/mods/battlerboss/holder/TeleportHolder;
  #38 = Utf8               _teleport
  #39 = Utf8               Lext/mods/battlerboss/holder/TeleportHolder;
  #40 = Fieldref           #8.#41         // ext/mods/battlerboss/holder/EventHolder._rewards:Lext/mods/battlerboss/holder/RewardsHolder;
  #41 = NameAndType        #42:#43        // _rewards:Lext/mods/battlerboss/holder/RewardsHolder;
  #42 = Utf8               _rewards
  #43 = Utf8               Lext/mods/battlerboss/holder/RewardsHolder;
  #44 = Fieldref           #8.#45         // ext/mods/battlerboss/holder/EventHolder._config:Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #45 = NameAndType        #46:#47        // _config:Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #46 = Utf8               _config
  #47 = Utf8               Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #48 = Utf8               (ILjava/lang/String;Ljava/lang/String;Lext/mods/battlerboss/holder/InfoHolder;Lext/mods/battlerboss/holder/RegistrationHolder;Lext/mods/battlerboss/holder/BattleHolder;Lext/mods/battlerboss/holder/MonsterChallengeHolder;Lext/mods/battlerboss/holder/TeleportHolder;Lext/mods/battlerboss/holder/RewardsHolder;Lext/mods/battlerboss/holder/BattleBossConfigHolder;)V
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               LocalVariableTable
  #52 = Utf8               this
  #53 = Utf8               Lext/mods/battlerboss/holder/EventHolder;
  #54 = Utf8               id
  #55 = Utf8               name
  #56 = Utf8               type
  #57 = Utf8               info
  #58 = Utf8               registration
  #59 = Utf8               battle
  #60 = Utf8               monster
  #61 = Utf8               teleport
  #62 = Utf8               rewards
  #63 = Utf8               config
  #64 = Utf8               getId
  #65 = Utf8               ()I
  #66 = Utf8               getName
  #67 = Utf8               ()Ljava/lang/String;
  #68 = Utf8               getType
  #69 = Utf8               getInfo
  #70 = Utf8               ()Lext/mods/battlerboss/holder/InfoHolder;
  #71 = Utf8               getRegistration
  #72 = Utf8               ()Lext/mods/battlerboss/holder/RegistrationHolder;
  #73 = Utf8               getBattle
  #74 = Utf8               ()Lext/mods/battlerboss/holder/BattleHolder;
  #75 = Utf8               getMonster
  #76 = Utf8               ()Lext/mods/battlerboss/holder/MonsterChallengeHolder;
  #77 = Utf8               getTeleport
  #78 = Utf8               ()Lext/mods/battlerboss/holder/TeleportHolder;
  #79 = Utf8               getRewards
  #80 = Utf8               ()Lext/mods/battlerboss/holder/RewardsHolder;
  #81 = Utf8               getConfig
  #82 = Utf8               ()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #83 = Utf8               SourceFile
  #84 = Utf8               EventHolder.java
{
  public ext.mods.battlerboss.holder.EventHolder(int, java.lang.String, java.lang.String, ext.mods.battlerboss.holder.InfoHolder, ext.mods.battlerboss.holder.RegistrationHolder, ext.mods.battlerboss.holder.BattleHolder, ext.mods.battlerboss.holder.MonsterChallengeHolder, ext.mods.battlerboss.holder.TeleportHolder, ext.mods.battlerboss.holder.RewardsHolder, ext.mods.battlerboss.holder.BattleBossConfigHolder);
    descriptor: (ILjava/lang/String;Ljava/lang/String;Lext/mods/battlerboss/holder/InfoHolder;Lext/mods/battlerboss/holder/RegistrationHolder;Lext/mods/battlerboss/holder/BattleHolder;Lext/mods/battlerboss/holder/MonsterChallengeHolder;Lext/mods/battlerboss/holder/TeleportHolder;Lext/mods/battlerboss/holder/RewardsHolder;Lext/mods/battlerboss/holder/BattleBossConfigHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=11, args_size=11
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _id:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _name:Ljava/lang/String;
        14: aload_0
        15: aload_3
        16: putfield      #17                 // Field _type:Ljava/lang/String;
        19: aload_0
        20: aload         4
        22: putfield      #20                 // Field _info:Lext/mods/battlerboss/holder/InfoHolder;
        25: aload_0
        26: aload         5
        28: putfield      #24                 // Field _registration:Lext/mods/battlerboss/holder/RegistrationHolder;
        31: aload_0
        32: aload         6
        34: putfield      #28                 // Field _battle:Lext/mods/battlerboss/holder/BattleHolder;
        37: aload_0
        38: aload         7
        40: putfield      #32                 // Field _monster:Lext/mods/battlerboss/holder/MonsterChallengeHolder;
        43: aload_0
        44: aload         8
        46: putfield      #36                 // Field _teleport:Lext/mods/battlerboss/holder/TeleportHolder;
        49: aload_0
        50: aload         9
        52: putfield      #40                 // Field _rewards:Lext/mods/battlerboss/holder/RewardsHolder;
        55: aload_0
        56: aload         10
        58: putfield      #44                 // Field _config:Lext/mods/battlerboss/holder/BattleBossConfigHolder;
        61: return
      LineNumberTable:
        line 34: 0
        line 35: 4
        line 36: 9
        line 37: 14
        line 38: 19
        line 39: 25
        line 40: 31
        line 41: 37
        line 42: 43
        line 43: 49
        line 44: 55
        line 45: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/battlerboss/holder/EventHolder;
            0      62     1    id   I
            0      62     2  name   Ljava/lang/String;
            0      62     3  type   Ljava/lang/String;
            0      62     4  info   Lext/mods/battlerboss/holder/InfoHolder;
            0      62     5 registration   Lext/mods/battlerboss/holder/RegistrationHolder;
            0      62     6 battle   Lext/mods/battlerboss/holder/BattleHolder;
            0      62     7 monster   Lext/mods/battlerboss/holder/MonsterChallengeHolder;
            0      62     8 teleport   Lext/mods/battlerboss/holder/TeleportHolder;
            0      62     9 rewards   Lext/mods/battlerboss/holder/RewardsHolder;
            0      62    10 config   Lext/mods/battlerboss/holder/BattleBossConfigHolder;

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _id:I
         4: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/EventHolder;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/EventHolder;

  public java.lang.String getType();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _type:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/EventHolder;

  public ext.mods.battlerboss.holder.InfoHolder getInfo();
    descriptor: ()Lext/mods/battlerboss/holder/InfoHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _info:Lext/mods/battlerboss/holder/InfoHolder;
         4: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/EventHolder;

  public ext.mods.battlerboss.holder.RegistrationHolder getRegistration();
    descriptor: ()Lext/mods/battlerboss/holder/RegistrationHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _registration:Lext/mods/battlerboss/holder/RegistrationHolder;
         4: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/EventHolder;

  public ext.mods.battlerboss.holder.BattleHolder getBattle();
    descriptor: ()Lext/mods/battlerboss/holder/BattleHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _battle:Lext/mods/battlerboss/holder/BattleHolder;
         4: areturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/EventHolder;

  public ext.mods.battlerboss.holder.MonsterChallengeHolder getMonster();
    descriptor: ()Lext/mods/battlerboss/holder/MonsterChallengeHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _monster:Lext/mods/battlerboss/holder/MonsterChallengeHolder;
         4: areturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/EventHolder;

  public ext.mods.battlerboss.holder.TeleportHolder getTeleport();
    descriptor: ()Lext/mods/battlerboss/holder/TeleportHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field _teleport:Lext/mods/battlerboss/holder/TeleportHolder;
         4: areturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/EventHolder;

  public ext.mods.battlerboss.holder.RewardsHolder getRewards();
    descriptor: ()Lext/mods/battlerboss/holder/RewardsHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _rewards:Lext/mods/battlerboss/holder/RewardsHolder;
         4: areturn
      LineNumberTable:
        line 89: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/EventHolder;

  public ext.mods.battlerboss.holder.BattleBossConfigHolder getConfig();
    descriptor: ()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _config:Lext/mods/battlerboss/holder/BattleBossConfigHolder;
         4: areturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/EventHolder;
}
SourceFile: "EventHolder.java"
