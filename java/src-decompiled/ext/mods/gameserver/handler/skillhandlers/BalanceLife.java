// Bytecode for: ext.mods.gameserver.handler.skillhandlers.BalanceLife
// File: ext\mods\gameserver\handler\skillhandlers\BalanceLife.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/BalanceLife.class
  Last modified 9 de jul de 2026; size 3264 bytes
  MD5 checksum f46f53fb7c953d863010661e50269408
  Compiled from "BalanceLife.java"
public class ext.mods.gameserver.handler.skillhandlers.BalanceLife implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #88                         // ext/mods/gameserver/handler/skillhandlers/BalanceLife
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
    #8 = Class              #10           // ext/mods/gameserver/handler/SkillHandler
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/gameserver/handler/SkillHandler;
   #10 = Utf8               ext/mods/gameserver/handler/SkillHandler
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/handler/SkillHandler;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
   #14 = Class              #16           // ext/mods/gameserver/enums/skills/SkillType
   #15 = NameAndType        #17:#18       // BUFF:Lext/mods/gameserver/enums/skills/SkillType;
   #16 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #17 = Utf8               BUFF
   #18 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #19 = Methodref          #8.#20        // ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
   #20 = NameAndType        #21:#22       // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
   #21 = Utf8               getHandler
   #22 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
   #23 = InterfaceMethodref #24.#25       // ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #24 = Class              #26           // ext/mods/gameserver/handler/ISkillHandler
   #25 = NameAndType        #27:#28       // useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #26 = Utf8               ext/mods/gameserver/handler/ISkillHandler
   #27 = Utf8               useSkill
   #28 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #30 = Class              #32           // ext/mods/gameserver/model/actor/Creature
   #31 = NameAndType        #33:#34       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #32 = Utf8               ext/mods/gameserver/model/actor/Creature
   #33 = Utf8               getActingPlayer
   #34 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #35 = Class              #36           // java/util/ArrayList
   #36 = Utf8               java/util/ArrayList
   #37 = Methodref          #35.#3        // java/util/ArrayList."<init>":()V
   #38 = Methodref          #30.#39       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #39 = NameAndType        #40:#41       // isDead:()Z
   #40 = Utf8               isDead
   #41 = Utf8               ()Z
   #42 = Class              #43           // ext/mods/gameserver/model/actor/Player
   #43 = Utf8               ext/mods/gameserver/model/actor/Player
   #44 = Methodref          #42.#45       // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
   #45 = NameAndType        #46:#41       // isCursedWeaponEquipped:()Z
   #46 = Utf8               isCursedWeaponEquipped
   #47 = Methodref          #30.#48       // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #48 = NameAndType        #49:#50       // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #49 = Utf8               getStatus
   #50 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
   #52 = Class              #54           // ext/mods/gameserver/model/actor/status/CreatureStatus
   #53 = NameAndType        #55:#56       // getMaxHp:()I
   #54 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #55 = Utf8               getMaxHp
   #56 = Utf8               ()I
   #57 = Methodref          #52.#58       // ext/mods/gameserver/model/actor/status/CreatureStatus.getHp:()D
   #58 = NameAndType        #59:#60       // getHp:()D
   #59 = Utf8               getHp
   #60 = Utf8               ()D
   #61 = InterfaceMethodref #62.#63       // java/util/List.add:(Ljava/lang/Object;)Z
   #62 = Class              #64           // java/util/List
   #63 = NameAndType        #65:#66       // add:(Ljava/lang/Object;)Z
   #64 = Utf8               java/util/List
   #65 = Utf8               add
   #66 = Utf8               (Ljava/lang/Object;)Z
   #67 = InterfaceMethodref #62.#68       // java/util/List.isEmpty:()Z
   #68 = NameAndType        #69:#41       // isEmpty:()Z
   #69 = Utf8               isEmpty
   #70 = InterfaceMethodref #62.#71       // java/util/List.iterator:()Ljava/util/Iterator;
   #71 = NameAndType        #72:#73       // iterator:()Ljava/util/Iterator;
   #72 = Utf8               iterator
   #73 = Utf8               ()Ljava/util/Iterator;
   #74 = InterfaceMethodref #75.#76       // java/util/Iterator.hasNext:()Z
   #75 = Class              #77           // java/util/Iterator
   #76 = NameAndType        #78:#41       // hasNext:()Z
   #77 = Utf8               java/util/Iterator
   #78 = Utf8               hasNext
   #79 = InterfaceMethodref #75.#80       // java/util/Iterator.next:()Ljava/lang/Object;
   #80 = NameAndType        #81:#82       // next:()Ljava/lang/Object;
   #81 = Utf8               next
   #82 = Utf8               ()Ljava/lang/Object;
   #83 = Methodref          #52.#84       // ext/mods/gameserver/model/actor/status/CreatureStatus.setHp:(D)V
   #84 = NameAndType        #85:#86       // setHp:(D)V
   #85 = Utf8               setHp
   #86 = Utf8               (D)V
   #87 = Fieldref           #88.#89       // ext/mods/gameserver/handler/skillhandlers/BalanceLife.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #88 = Class              #90           // ext/mods/gameserver/handler/skillhandlers/BalanceLife
   #89 = NameAndType        #91:#92       // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #90 = Utf8               ext/mods/gameserver/handler/skillhandlers/BalanceLife
   #91 = Utf8               SKILL_IDS
   #92 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
   #93 = Fieldref           #14.#94       // ext/mods/gameserver/enums/skills/SkillType.BALANCE_LIFE:Lext/mods/gameserver/enums/skills/SkillType;
   #94 = NameAndType        #95:#18       // BALANCE_LIFE:Lext/mods/gameserver/enums/skills/SkillType;
   #95 = Utf8               BALANCE_LIFE
   #96 = Utf8               Code
   #97 = Utf8               LineNumberTable
   #98 = Utf8               LocalVariableTable
   #99 = Utf8               this
  #100 = Utf8               Lext/mods/gameserver/handler/skillhandlers/BalanceLife;
  #101 = Utf8               targetPlayer
  #102 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #103 = Utf8               targetCreature
  #104 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #105 = Utf8               obj
  #106 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #107 = Utf8               target
  #108 = Utf8               percentHP
  #109 = Utf8               D
  #110 = Utf8               creature
  #111 = Utf8               skill
  #112 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #113 = Utf8               targets
  #114 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #115 = Utf8               item
  #116 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #117 = Utf8               handler
  #118 = Utf8               Lext/mods/gameserver/handler/ISkillHandler;
  #119 = Utf8               player
  #120 = Utf8               finalList
  #121 = Utf8               Ljava/util/List;
  #122 = Utf8               fullHP
  #123 = Utf8               currentHPs
  #124 = Utf8               LocalVariableTypeTable
  #125 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #126 = Utf8               StackMapTable
  #127 = Class              #128          // ext/mods/gameserver/skills/L2Skill
  #128 = Utf8               ext/mods/gameserver/skills/L2Skill
  #129 = Class              #114          // "[Lext/mods/gameserver/model/WorldObject;"
  #130 = Class              #131          // ext/mods/gameserver/model/item/instance/ItemInstance
  #131 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #132 = Class              #133          // ext/mods/gameserver/model/WorldObject
  #133 = Utf8               ext/mods/gameserver/model/WorldObject
  #134 = Utf8               getSkillIds
  #135 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #136 = Utf8               <clinit>
  #137 = Utf8               SourceFile
  #138 = Utf8               BalanceLife.java
{
  public ext.mods.gameserver.handler.skillhandlers.BalanceLife();
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
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/BalanceLife;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=18, args_size=5
         0: invokestatic  #7                  // Method ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
         3: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
         6: invokevirtual #19                 // Method ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
         9: astore        5
        11: aload         5
        13: ifnull        28
        16: aload         5
        18: aload_1
        19: aload_2
        20: aload_3
        21: aload         4
        23: invokeinterface #23,  5           // InterfaceMethod ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        28: aload_1
        29: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        32: astore        6
        34: new           #35                 // class java/util/ArrayList
        37: dup
        38: invokespecial #37                 // Method java/util/ArrayList."<init>":()V
        41: astore        7
        43: dconst_0
        44: dstore        8
        46: dconst_0
        47: dstore        10
        49: aload_3
        50: astore        12
        52: aload         12
        54: arraylength
        55: istore        13
        57: iconst_0
        58: istore        14
        60: iload         14
        62: iload         13
        64: if_icmpge     191
        67: aload         12
        69: iload         14
        71: aaload
        72: astore        15
        74: aload         15
        76: instanceof    #30                 // class ext/mods/gameserver/model/actor/Creature
        79: ifeq          185
        82: aload         15
        84: checkcast     #30                 // class ext/mods/gameserver/model/actor/Creature
        87: astore        16
        89: aload         16
        91: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        94: ifeq          100
        97: goto          185
       100: aload         16
       102: aload_1
       103: if_acmpeq     148
       106: aload         16
       108: instanceof    #42                 // class ext/mods/gameserver/model/actor/Player
       111: ifeq          132
       114: aload         16
       116: checkcast     #42                 // class ext/mods/gameserver/model/actor/Player
       119: astore        17
       121: aload         17
       123: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       126: ifeq          132
       129: goto          185
       132: aload         6
       134: ifnull        148
       137: aload         6
       139: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       142: ifeq          148
       145: goto          185
       148: dload         8
       150: aload         16
       152: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       155: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
       158: i2d
       159: dadd
       160: dstore        8
       162: dload         10
       164: aload         16
       166: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       169: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getHp:()D
       172: dadd
       173: dstore        10
       175: aload         7
       177: aload         16
       179: invokeinterface #61,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       184: pop
       185: iinc          14, 1
       188: goto          60
       191: aload         7
       193: invokeinterface #67,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       198: ifne          262
       201: dload         10
       203: dload         8
       205: ddiv
       206: dstore        12
       208: aload         7
       210: invokeinterface #70,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       215: astore        14
       217: aload         14
       219: invokeinterface #74,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       224: ifeq          262
       227: aload         14
       229: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       234: checkcast     #30                 // class ext/mods/gameserver/model/actor/Creature
       237: astore        15
       239: aload         15
       241: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       244: aload         15
       246: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       249: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
       252: i2d
       253: dload         12
       255: dmul
       256: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.setHp:(D)V
       259: goto          217
       262: return
      LineNumberTable:
        line 42: 0
        line 43: 11
        line 44: 16
        line 46: 28
        line 47: 34
        line 49: 43
        line 50: 46
        line 52: 49
        line 54: 74
        line 57: 89
        line 58: 97
        line 60: 100
        line 62: 106
        line 63: 129
        line 65: 132
        line 66: 145
        line 69: 148
        line 70: 162
        line 72: 175
        line 52: 185
        line 75: 191
        line 77: 201
        line 79: 208
        line 80: 239
        line 82: 262
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          121      11    17 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           89      96    16 targetCreature   Lext/mods/gameserver/model/actor/Creature;
           74     111    15   obj   Lext/mods/gameserver/model/WorldObject;
          239      20    15 target   Lext/mods/gameserver/model/actor/Creature;
          208      54    12 percentHP   D
            0     263     0  this   Lext/mods/gameserver/handler/skillhandlers/BalanceLife;
            0     263     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     263     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     263     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     263     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           11     252     5 handler   Lext/mods/gameserver/handler/ISkillHandler;
           34     229     6 player   Lext/mods/gameserver/model/actor/Player;
           43     220     7 finalList   Ljava/util/List;
           46     217     8 fullHP   D
           49     214    10 currentHPs   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           43     220     7 finalList   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/handler/ISkillHandler ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/handler/skillhandlers/BalanceLife, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/handler/ISkillHandler, class ext/mods/gameserver/model/actor/Player, class java/util/List, double, double, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 31 /* same */
        frame_type = 15 /* same */
        frame_type = 249 /* chop */
          offset_delta = 36
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ double, class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 44

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #87                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/BalanceLife;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #14                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #93                 // Field ext/mods/gameserver/enums/skills/SkillType.BALANCE_LIFE:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #87                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "BalanceLife.java"
