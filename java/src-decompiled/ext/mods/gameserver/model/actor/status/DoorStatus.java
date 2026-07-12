// Bytecode for: ext.mods.gameserver.model.actor.status.DoorStatus
// File: ext\mods\gameserver\model\actor\status\DoorStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/status/DoorStatus.class
  Last modified 9 de jul de 2026; size 2898 bytes
  MD5 checksum 9cf83bc9769cff15bae4a49b1eb1e999
  Compiled from "DoorStatus.java"
public class ext.mods.gameserver.model.actor.status.DoorStatus extends ext.mods.gameserver.model.actor.status.CreatureStatus<ext.mods.gameserver.model.actor.instance.Door>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/status/DoorStatus
  super_class: #2                         // ext/mods/gameserver/model/actor/status/CreatureStatus
  interfaces: 0, fields: 1, methods: 8, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/status/CreatureStatus."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/status/CreatureStatus
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/status/DoorStatus._upgradeHpRatio:I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/status/DoorStatus
    #9 = NameAndType        #11:#12       // _upgradeHpRatio:I
   #10 = Utf8               ext/mods/gameserver/model/actor/status/DoorStatus
   #11 = Utf8               _upgradeHpRatio
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/status/DoorStatus._actor:Lext/mods/gameserver/model/actor/Creature;
   #14 = NameAndType        #15:#16       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #15 = Utf8               _actor
   #16 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #17 = Class              #18           // ext/mods/gameserver/model/actor/instance/Door
   #18 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #19 = Methodref          #17.#20       // ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
   #20 = NameAndType        #21:#22       // getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
   #21 = Utf8               getTemplate
   #22 = Utf8               ()Lext/mods/gameserver/model/actor/template/DoorTemplate;
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/actor/template/DoorTemplate.getLevel:()I
   #24 = Class              #26           // ext/mods/gameserver/model/actor/template/DoorTemplate
   #25 = NameAndType        #27:#28       // getLevel:()I
   #26 = Utf8               ext/mods/gameserver/model/actor/template/DoorTemplate
   #27 = Utf8               getLevel
   #28 = Utf8               ()I
   #29 = Class              #30           // ext/mods/gameserver/network/serverpackets/DoorStatusUpdate
   #30 = Utf8               ext/mods/gameserver/network/serverpackets/DoorStatusUpdate
   #31 = Methodref          #29.#32       // ext/mods/gameserver/network/serverpackets/DoorStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/instance/Door;)V
   #32 = NameAndType        #5:#33        // "<init>":(Lext/mods/gameserver/model/actor/instance/Door;)V
   #33 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;)V
   #34 = Methodref          #17.#35       // ext/mods/gameserver/model/actor/instance/Door.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #35 = NameAndType        #36:#37       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #36 = Utf8               broadcastPacket
   #37 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #38 = Methodref          #24.#39       // ext/mods/gameserver/model/actor/template/DoorTemplate.getBaseMDef:()D
   #39 = NameAndType        #40:#41       // getBaseMDef:()D
   #40 = Utf8               getBaseMDef
   #41 = Utf8               ()D
   #42 = Fieldref           #43.#44       // ext/mods/gameserver/model/actor/status/DoorStatus$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
   #43 = Class              #45           // ext/mods/gameserver/model/actor/status/DoorStatus$1
   #44 = NameAndType        #46:#47       // $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
   #45 = Utf8               ext/mods/gameserver/model/actor/status/DoorStatus$1
   #46 = Utf8               $SwitchMap$ext$mods$gameserver$enums$CabalType
   #47 = Utf8               [I
   #48 = Methodref          #49.#50       // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #49 = Class              #51           // ext/mods/gameserver/data/manager/SevenSignsManager
   #50 = NameAndType        #52:#53       // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #51 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #52 = Utf8               getInstance
   #53 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #54 = Fieldref           #55.#56       // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
   #55 = Class              #57           // ext/mods/gameserver/enums/SealType
   #56 = NameAndType        #58:#59       // STRIFE:Lext/mods/gameserver/enums/SealType;
   #57 = Utf8               ext/mods/gameserver/enums/SealType
   #58 = Utf8               STRIFE
   #59 = Utf8               Lext/mods/gameserver/enums/SealType;
   #60 = Methodref          #49.#61       // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #61 = NameAndType        #62:#63       // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #62 = Utf8               getSealOwner
   #63 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #64 = Methodref          #65.#66       // ext/mods/gameserver/enums/CabalType.ordinal:()I
   #65 = Class              #67           // ext/mods/gameserver/enums/CabalType
   #66 = NameAndType        #68:#28       // ordinal:()I
   #67 = Utf8               ext/mods/gameserver/enums/CabalType
   #68 = Utf8               ordinal
   #69 = Double             1.2d
   #71 = Double             0.3d
   #73 = Methodref          #24.#74       // ext/mods/gameserver/model/actor/template/DoorTemplate.getBasePDef:()D
   #74 = NameAndType        #75:#41       // getBasePDef:()D
   #75 = Utf8               getBasePDef
   #76 = Methodref          #2.#77        // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
   #77 = NameAndType        #78:#28       // getMaxHp:()I
   #78 = Utf8               getMaxHp
   #79 = Utf8               Code
   #80 = Utf8               LineNumberTable
   #81 = Utf8               LocalVariableTable
   #82 = Utf8               this
   #83 = Utf8               Lext/mods/gameserver/model/actor/status/DoorStatus;
   #84 = Utf8               actor
   #85 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
   #86 = Utf8               broadcastStatusUpdate
   #87 = Utf8               ()V
   #88 = Utf8               getMDef
   #89 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
   #90 = Utf8               target
   #91 = Utf8               skill
   #92 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #93 = Utf8               defense
   #94 = Utf8               D
   #95 = Utf8               StackMapTable
   #96 = Utf8               getPDef
   #97 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
   #98 = Utf8               setUpgradeHpRatio
   #99 = Utf8               (I)V
  #100 = Utf8               hpRatio
  #101 = Utf8               getUpgradeHpRatio
  #102 = Utf8               Signature
  #103 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus<Lext/mods/gameserver/model/actor/instance/Door;>;
  #104 = Utf8               SourceFile
  #105 = Utf8               DoorStatus.java
  #106 = Utf8               NestMembers
  #107 = Utf8               InnerClasses
{
  public ext.mods.gameserver.model.actor.status.DoorStatus(ext.mods.gameserver.model.actor.instance.Door);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Door;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/status/CreatureStatus."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: aload_0
         6: iconst_1
         7: putfield      #7                  // Field _upgradeHpRatio:I
        10: return
      LineNumberTable:
        line 33: 0
        line 29: 5
        line 34: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/DoorStatus;
            0      11     1 actor   Lext/mods/gameserver/model/actor/instance/Door;

  public final int getLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Door
         7: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
        10: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getLevel:()I
        13: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/status/DoorStatus;

  public void broadcastStatusUpdate();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Door
         7: new           #29                 // class ext/mods/gameserver/network/serverpackets/DoorStatusUpdate
        10: dup
        11: aload_0
        12: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Door
        18: invokespecial #31                 // Method ext/mods/gameserver/network/serverpackets/DoorStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/instance/Door;)V
        21: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/instance/Door.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        24: return
      LineNumberTable:
        line 45: 0
        line 46: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/DoorStatus;

  public int getMDef(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Door
         7: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
        10: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getBaseMDef:()D
        13: dstore_3
        14: getstatic     #42                 // Field ext/mods/gameserver/model/actor/status/DoorStatus$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        17: invokestatic  #48                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        20: getstatic     #54                 // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
        23: invokevirtual #60                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
        26: invokevirtual #64                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        29: iaload
        30: lookupswitch  { // 2

                       1: 56

                       2: 65
                 default: 71
            }
        56: dload_3
        57: ldc2_w        #69                 // double 1.2d
        60: dmul
        61: dstore_3
        62: goto          71
        65: dload_3
        66: ldc2_w        #71                 // double 0.3d
        69: dmul
        70: dstore_3
        71: dload_3
        72: d2i
        73: ireturn
      LineNumberTable:
        line 51: 0
        line 53: 14
        line 56: 56
        line 57: 62
        line 60: 65
        line 64: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      74     0  this   Lext/mods/gameserver/model/actor/status/DoorStatus;
            0      74     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      74     2 skill   Lext/mods/gameserver/skills/L2Skill;
           14      60     3 defense   D
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ double ]
        frame_type = 8 /* same */
        frame_type = 5 /* same */

  public int getPDef(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Door
         7: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
        10: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getBasePDef:()D
        13: dstore_2
        14: getstatic     #42                 // Field ext/mods/gameserver/model/actor/status/DoorStatus$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        17: invokestatic  #48                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        20: getstatic     #54                 // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
        23: invokevirtual #60                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
        26: invokevirtual #64                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        29: iaload
        30: lookupswitch  { // 2

                       1: 56

                       2: 65
                 default: 71
            }
        56: dload_2
        57: ldc2_w        #69                 // double 1.2d
        60: dmul
        61: dstore_2
        62: goto          71
        65: dload_2
        66: ldc2_w        #71                 // double 0.3d
        69: dmul
        70: dstore_2
        71: dload_2
        72: d2i
        73: ireturn
      LineNumberTable:
        line 70: 0
        line 72: 14
        line 75: 56
        line 76: 62
        line 79: 65
        line 83: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      74     0  this   Lext/mods/gameserver/model/actor/status/DoorStatus;
            0      74     1 target   Lext/mods/gameserver/model/actor/Creature;
           14      60     2 defense   D
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ double ]
        frame_type = 8 /* same */
        frame_type = 5 /* same */

  public int getMaxHp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #76                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
         4: aload_0
         5: getfield      #7                  // Field _upgradeHpRatio:I
         8: imul
         9: ireturn
      LineNumberTable:
        line 89: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/status/DoorStatus;

  public final void setUpgradeHpRatio(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _upgradeHpRatio:I
         5: return
      LineNumberTable:
        line 94: 0
        line 95: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/DoorStatus;
            0       6     1 hpRatio   I

  public final int getUpgradeHpRatio();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _upgradeHpRatio:I
         4: ireturn
      LineNumberTable:
        line 99: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/DoorStatus;
}
Signature: #103                         // Lext/mods/gameserver/model/actor/status/CreatureStatus<Lext/mods/gameserver/model/actor/instance/Door;>;
SourceFile: "DoorStatus.java"
NestMembers:
  ext/mods/gameserver/model/actor/status/DoorStatus$1
InnerClasses:
  static #43;                             // class ext/mods/gameserver/model/actor/status/DoorStatus$1
