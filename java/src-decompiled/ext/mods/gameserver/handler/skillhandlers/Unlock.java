// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Unlock
// File: ext\mods\gameserver\handler\skillhandlers\Unlock.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Unlock.class
  Last modified 9 de jul de 2026; size 3487 bytes
  MD5 checksum 0bdca1de8b154d678c764870c4978c45
  Compiled from "Unlock.java"
public class ext.mods.gameserver.handler.skillhandlers.Unlock implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #113                        // ext/mods/gameserver/handler/skillhandlers/Unlock
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Class              #10           // ext/mods/gameserver/model/actor/instance/Door
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #11 = Methodref          #9.#12        // ext/mods/gameserver/model/actor/instance/Door.isUnlockable:()Z
   #12 = NameAndType        #13:#14       // isUnlockable:()Z
   #13 = Utf8               isUnlockable
   #14 = Utf8               ()Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #16 = Class              #18           // ext/mods/gameserver/skills/L2Skill
   #17 = NameAndType        #19:#20       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #18 = Utf8               ext/mods/gameserver/skills/L2Skill
   #19 = Utf8               getSkillType
   #20 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #21 = Fieldref           #22.#23       // ext/mods/gameserver/enums/skills/SkillType.UNLOCK_SPECIAL:Lext/mods/gameserver/enums/skills/SkillType;
   #22 = Class              #24           // ext/mods/gameserver/enums/skills/SkillType
   #23 = NameAndType        #25:#26       // UNLOCK_SPECIAL:Lext/mods/gameserver/enums/skills/SkillType;
   #24 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #25 = Utf8               UNLOCK_SPECIAL
   #26 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #27 = Fieldref           #28.#29       // ext/mods/gameserver/network/SystemMessageId.UNABLE_TO_UNLOCK_DOOR:Lext/mods/gameserver/network/SystemMessageId;
   #28 = Class              #30           // ext/mods/gameserver/network/SystemMessageId
   #29 = NameAndType        #31:#32       // UNABLE_TO_UNLOCK_DOOR:Lext/mods/gameserver/network/SystemMessageId;
   #30 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #31 = Utf8               UNABLE_TO_UNLOCK_DOOR
   #32 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #33 = Methodref          #7.#34        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #34 = NameAndType        #35:#36       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #35 = Utf8               sendPacket
   #36 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #37 = Methodref          #9.#38        // ext/mods/gameserver/model/actor/instance/Door.isOpened:()Z
   #38 = NameAndType        #39:#14       // isOpened:()Z
   #39 = Utf8               isOpened
   #40 = Methodref          #41.#42       // ext/mods/gameserver/skills/Formulas.doorUnlock:(Lext/mods/gameserver/skills/L2Skill;)Z
   #41 = Class              #43           // ext/mods/gameserver/skills/Formulas
   #42 = NameAndType        #44:#45       // doorUnlock:(Lext/mods/gameserver/skills/L2Skill;)Z
   #43 = Utf8               ext/mods/gameserver/skills/Formulas
   #44 = Utf8               doorUnlock
   #45 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
   #46 = Methodref          #9.#47        // ext/mods/gameserver/model/actor/instance/Door.openMe:()V
   #47 = NameAndType        #48:#6        // openMe:()V
   #48 = Utf8               openMe
   #49 = Fieldref           #28.#50       // ext/mods/gameserver/network/SystemMessageId.FAILED_TO_UNLOCK_DOOR:Lext/mods/gameserver/network/SystemMessageId;
   #50 = NameAndType        #51:#32       // FAILED_TO_UNLOCK_DOOR:Lext/mods/gameserver/network/SystemMessageId;
   #51 = Utf8               FAILED_TO_UNLOCK_DOOR
   #52 = Class              #53           // ext/mods/gameserver/model/actor/instance/Chest
   #53 = Utf8               ext/mods/gameserver/model/actor/instance/Chest
   #54 = Methodref          #52.#55       // ext/mods/gameserver/model/actor/instance/Chest.isDead:()Z
   #55 = NameAndType        #56:#14       // isDead:()Z
   #56 = Utf8               isDead
   #57 = Methodref          #52.#58       // ext/mods/gameserver/model/actor/instance/Chest.isInteracted:()Z
   #58 = NameAndType        #59:#14       // isInteracted:()Z
   #59 = Utf8               isInteracted
   #60 = Methodref          #52.#61       // ext/mods/gameserver/model/actor/instance/Chest.isBox:()Z
   #61 = NameAndType        #62:#14       // isBox:()Z
   #62 = Utf8               isBox
   #63 = Methodref          #52.#64       // ext/mods/gameserver/model/actor/instance/Chest.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #64 = NameAndType        #65:#66       // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #65 = Utf8               getAI
   #66 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #67 = Double             200.0d
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
   #70 = Class              #72           // ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #71 = NameAndType        #73:#74       // addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
   #72 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #73 = Utf8               addAttackDesire
   #74 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
   #75 = Methodref          #52.#76       // ext/mods/gameserver/model/actor/instance/Chest.setInteracted:()V
   #76 = NameAndType        #77:#6        // setInteracted:()V
   #77 = Utf8               setInteracted
   #78 = Methodref          #52.#79       // ext/mods/gameserver/model/actor/instance/Chest.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #79 = NameAndType        #80:#81       // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #80 = Utf8               getStatus
   #81 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #82 = Methodref          #83.#84       // ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
   #83 = Class              #85           // ext/mods/gameserver/model/actor/status/AttackableStatus
   #84 = NameAndType        #86:#87       // getLevel:()I
   #85 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
   #86 = Utf8               getLevel
   #87 = Utf8               ()I
   #88 = Methodref          #41.#89       // ext/mods/gameserver/skills/Formulas.chestUnlock:(Lext/mods/gameserver/skills/L2Skill;I)Z
   #89 = NameAndType        #90:#91       // chestUnlock:(Lext/mods/gameserver/skills/L2Skill;I)Z
   #90 = Utf8               chestUnlock
   #91 = Utf8               (Lext/mods/gameserver/skills/L2Skill;I)Z
   #92 = Methodref          #70.#93       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #93 = NameAndType        #94:#95       // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #94 = Utf8               getAggroList
   #95 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #96 = Methodref          #97.#98       // ext/mods/gameserver/model/actor/container/attackable/AggroList.addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
   #97 = Class              #99           // ext/mods/gameserver/model/actor/container/attackable/AggroList
   #98 = NameAndType        #100:#101     // addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
   #99 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
  #100 = Utf8               addDamageHate
  #101 = Utf8               (Lext/mods/gameserver/model/actor/Creature;DD)V
  #102 = Methodref          #52.#103      // ext/mods/gameserver/model/actor/instance/Chest.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #103 = NameAndType        #104:#105     // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #104 = Utf8               doDie
  #105 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #106 = Methodref          #52.#107      // ext/mods/gameserver/model/actor/instance/Chest.deleteMe:()V
  #107 = NameAndType        #108:#6       // deleteMe:()V
  #108 = Utf8               deleteMe
  #109 = Fieldref           #28.#110      // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #110 = NameAndType        #111:#32      // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #111 = Utf8               INVALID_TARGET
  #112 = Fieldref           #113.#114     // ext/mods/gameserver/handler/skillhandlers/Unlock.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #113 = Class              #115          // ext/mods/gameserver/handler/skillhandlers/Unlock
  #114 = NameAndType        #116:#117     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #115 = Utf8               ext/mods/gameserver/handler/skillhandlers/Unlock
  #116 = Utf8               SKILL_IDS
  #117 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #118 = Fieldref           #22.#119      // ext/mods/gameserver/enums/skills/SkillType.UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #119 = NameAndType        #120:#26      // UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #120 = Utf8               UNLOCK
  #121 = Fieldref           #22.#122      // ext/mods/gameserver/enums/skills/SkillType.DELUXE_KEY_UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #122 = NameAndType        #123:#26      // DELUXE_KEY_UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #123 = Utf8               DELUXE_KEY_UNLOCK
  #124 = Class              #125          // ext/mods/gameserver/handler/ISkillHandler
  #125 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #126 = Utf8               Code
  #127 = Utf8               LineNumberTable
  #128 = Utf8               LocalVariableTable
  #129 = Utf8               this
  #130 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Unlock;
  #131 = Utf8               useSkill
  #132 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #133 = Utf8               player
  #134 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #135 = Utf8               doorTarget
  #136 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #137 = Utf8               chestTarget
  #138 = Utf8               Lext/mods/gameserver/model/actor/instance/Chest;
  #139 = Utf8               creature
  #140 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #141 = Utf8               skill
  #142 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #143 = Utf8               targets
  #144 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #145 = Utf8               item
  #146 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #147 = Utf8               StackMapTable
  #148 = Utf8               getSkillIds
  #149 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #150 = Utf8               <clinit>
  #151 = Utf8               SourceFile
  #152 = Utf8               Unlock.java
{
  public ext.mods.gameserver.handler.skillhandlers.Unlock();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Unlock;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload_3
        18: iconst_0
        19: aaload
        20: astore        8
        22: aload         8
        24: instanceof    #9                  // class ext/mods/gameserver/model/actor/instance/Door
        27: ifeq          98
        30: aload         8
        32: checkcast     #9                  // class ext/mods/gameserver/model/actor/instance/Door
        35: astore        6
        37: aload         6
        39: invokevirtual #11                 // Method ext/mods/gameserver/model/actor/instance/Door.isUnlockable:()Z
        42: ifne          64
        45: aload_2
        46: invokevirtual #15                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        49: getstatic     #21                 // Field ext/mods/gameserver/enums/skills/SkillType.UNLOCK_SPECIAL:Lext/mods/gameserver/enums/skills/SkillType;
        52: if_acmpeq     64
        55: aload         5
        57: getstatic     #27                 // Field ext/mods/gameserver/network/SystemMessageId.UNABLE_TO_UNLOCK_DOOR:Lext/mods/gameserver/network/SystemMessageId;
        60: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        63: return
        64: aload         6
        66: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/instance/Door.isOpened:()Z
        69: ifne          87
        72: aload_2
        73: invokestatic  #40                 // Method ext/mods/gameserver/skills/Formulas.doorUnlock:(Lext/mods/gameserver/skills/L2Skill;)Z
        76: ifeq          87
        79: aload         6
        81: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/instance/Door.openMe:()V
        84: goto          221
        87: aload         5
        89: getstatic     #49                 // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_UNLOCK_DOOR:Lext/mods/gameserver/network/SystemMessageId;
        92: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        95: goto          221
        98: aload_3
        99: iconst_0
       100: aaload
       101: astore        8
       103: aload         8
       105: instanceof    #52                 // class ext/mods/gameserver/model/actor/instance/Chest
       108: ifeq          213
       111: aload         8
       113: checkcast     #52                 // class ext/mods/gameserver/model/actor/instance/Chest
       116: astore        7
       118: aload         7
       120: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/instance/Chest.isDead:()Z
       123: ifne          134
       126: aload         7
       128: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/instance/Chest.isInteracted:()Z
       131: ifeq          135
       134: return
       135: aload         7
       137: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/instance/Chest.isBox:()Z
       140: ifne          157
       143: aload         7
       145: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/instance/Chest.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       148: aload         5
       150: ldc2_w        #67                 // double 200.0d
       153: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
       156: return
       157: aload         7
       159: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/instance/Chest.setInteracted:()V
       162: aload_2
       163: aload         7
       165: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/instance/Chest.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       168: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       171: invokestatic  #88                 // Method ext/mods/gameserver/skills/Formulas.chestUnlock:(Lext/mods/gameserver/skills/L2Skill;I)Z
       174: ifeq          205
       177: aload         7
       179: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/instance/Chest.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       182: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       185: aload         5
       187: dconst_0
       188: ldc2_w        #67                 // double 200.0d
       191: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
       194: aload         7
       196: aload         5
       198: invokevirtual #102                // Method ext/mods/gameserver/model/actor/instance/Chest.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
       201: pop
       202: goto          221
       205: aload         7
       207: invokevirtual #106                // Method ext/mods/gameserver/model/actor/instance/Chest.deleteMe:()V
       210: goto          221
       213: aload         5
       215: getstatic     #109                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       218: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       221: return
      LineNumberTable:
        line 44: 0
        line 45: 16
        line 47: 17
        line 49: 37
        line 51: 55
        line 52: 63
        line 55: 64
        line 56: 79
        line 58: 87
        line 60: 98
        line 62: 118
        line 63: 134
        line 65: 135
        line 67: 143
        line 68: 156
        line 71: 157
        line 73: 162
        line 75: 177
        line 76: 194
        line 79: 205
        line 82: 213
        line 83: 221
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
           37      61     6 doorTarget   Lext/mods/gameserver/model/actor/instance/Door;
          118      95     7 chestTarget   Lext/mods/gameserver/model/actor/instance/Chest;
            0     222     0  this   Lext/mods/gameserver/handler/skillhandlers/Unlock;
            0     222     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     222     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     222     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     222     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     205     5 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 11
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/model/actor/instance/Door ]
        frame_type = 22 /* same */
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ top, class ext/mods/gameserver/model/actor/instance/Chest ]
        frame_type = 0 /* same */
        frame_type = 21 /* same */
        frame_type = 47 /* same */
        frame_type = 249 /* chop */
          offset_delta = 7
        frame_type = 7 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #112                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Unlock;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_3
         1: anewarray     #22                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #118                // Field ext/mods/gameserver/enums/skills/SkillType.UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #21                 // Field ext/mods/gameserver/enums/skills/SkillType.UNLOCK_SPECIAL:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: dup
        17: iconst_2
        18: getstatic     #121                // Field ext/mods/gameserver/enums/skills/SkillType.DELUXE_KEY_UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
        21: aastore
        22: putstatic     #112                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        25: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "Unlock.java"
