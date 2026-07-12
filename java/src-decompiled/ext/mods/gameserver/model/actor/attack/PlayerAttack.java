// Bytecode for: ext.mods.gameserver.model.actor.attack.PlayerAttack
// File: ext\mods\gameserver\model\actor\attack\PlayerAttack.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/attack/PlayerAttack.class
  Last modified 9 de jul de 2026; size 4095 bytes
  MD5 checksum af8407ceff61b7b03286c1581f2eff8f
  Compiled from "PlayerAttack.java"
public class ext.mods.gameserver.model.actor.attack.PlayerAttack extends ext.mods.gameserver.model.actor.attack.PlayableAttack<ext.mods.gameserver.model.actor.Player>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/attack/PlayerAttack
  super_class: #2                         // ext/mods/gameserver/model/actor/attack/PlayableAttack
  interfaces: 0, fields: 1, methods: 6, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/attack/PlayableAttack."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/attack/PlayableAttack
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/attack/PlayableAttack
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/attack/PlayerAttack.isMeleeDebug:()Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/attack/PlayerAttack
    #9 = NameAndType        #11:#12       // isMeleeDebug:()Z
   #10 = Utf8               ext/mods/gameserver/model/actor/attack/PlayerAttack
   #11 = Utf8               isMeleeDebug
   #12 = Utf8               ()Z
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/attack/PlayerAttack.LOGGER:Lext/mods/commons/logging/CLogger;
   #14 = NameAndType        #15:#16       // LOGGER:Lext/mods/commons/logging/CLogger;
   #15 = Utf8               LOGGER
   #16 = Utf8               Lext/mods/commons/logging/CLogger;
   #17 = String             #18           // [MeleeDebug][PlayerAttack][doAttack] actor={} target={} dist={}
   #18 = Utf8               [MeleeDebug][PlayerAttack][doAttack] actor={} target={} dist={}
   #19 = Class              #20           // java/lang/Object
   #20 = Utf8               java/lang/Object
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/actor/attack/PlayerAttack._actor:Lext/mods/gameserver/model/actor/Creature;
   #22 = NameAndType        #23:#24       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #23 = Utf8               _actor
   #24 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #25 = Class              #26           // ext/mods/gameserver/model/actor/Player
   #26 = Utf8               ext/mods/gameserver/model/actor/Player
   #27 = Methodref          #25.#28       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #28 = NameAndType        #29:#30       // getObjectId:()I
   #29 = Utf8               getObjectId
   #30 = Utf8               ()I
   #31 = Methodref          #32.#33       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #32 = Class              #34           // java/lang/Integer
   #33 = NameAndType        #35:#36       // valueOf:(I)Ljava/lang/Integer;
   #34 = Utf8               java/lang/Integer
   #35 = Utf8               valueOf
   #36 = Utf8               (I)Ljava/lang/Integer;
   #37 = Methodref          #38.#28       // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
   #38 = Class              #39           // ext/mods/gameserver/model/actor/Creature
   #39 = Utf8               ext/mods/gameserver/model/actor/Creature
   #40 = Methodref          #25.#41       // ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #41 = NameAndType        #42:#43       // distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #42 = Utf8               distance2D
   #43 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
   #44 = Methodref          #45.#46       // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #45 = Class              #47           // java/lang/Double
   #46 = NameAndType        #35:#48       // valueOf:(D)Ljava/lang/Double;
   #47 = Utf8               java/lang/Double
   #48 = Utf8               (D)Ljava/lang/Double;
   #49 = Methodref          #50.#51       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #50 = Class              #52           // ext/mods/commons/logging/CLogger
   #51 = NameAndType        #53:#54       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #52 = Utf8               ext/mods/commons/logging/CLogger
   #53 = Utf8               info
   #54 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #55 = Methodref          #2.#56        // ext/mods/gameserver/model/actor/attack/PlayableAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
   #56 = NameAndType        #57:#58       // doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
   #57 = Utf8               doAttack
   #58 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #59 = Methodref          #25.#60       // ext/mods/gameserver/model/actor/Player.clearRecentFakeDeath:()V
   #60 = NameAndType        #61:#62       // clearRecentFakeDeath:()V
   #61 = Utf8               clearRecentFakeDeath
   #62 = Utf8               ()V
   #63 = String             #64           // [MeleeDebug][PlayerAttack][canAttack] actor={} target={} dist={} range={}
   #64 = Utf8               [MeleeDebug][PlayerAttack][canAttack] actor={} target={} dist={} range={}
   #65 = Methodref          #25.#66       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #66 = NameAndType        #67:#68       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #67 = Utf8               getStatus
   #68 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
   #70 = Class              #72           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #71 = NameAndType        #73:#30       // getPhysicalAttackRange:()I
   #72 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #73 = Utf8               getPhysicalAttackRange
   #74 = Methodref          #2.#75        // ext/mods/gameserver/model/actor/attack/PlayableAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
   #75 = NameAndType        #76:#77       // canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
   #76 = Utf8               canAttack
   #77 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #78 = Methodref          #25.#79       // ext/mods/gameserver/model/actor/Player.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
   #79 = NameAndType        #80:#81       // getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
   #80 = Utf8               getActiveWeaponItem
   #81 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
   #82 = Fieldref           #83.#84       // ext/mods/gameserver/model/actor/attack/PlayerAttack$1.$SwitchMap$ext$mods$gameserver$enums$items$WeaponType:[I
   #83 = Class              #85           // ext/mods/gameserver/model/actor/attack/PlayerAttack$1
   #84 = NameAndType        #86:#87       // $SwitchMap$ext$mods$gameserver$enums$items$WeaponType:[I
   #85 = Utf8               ext/mods/gameserver/model/actor/attack/PlayerAttack$1
   #86 = Utf8               $SwitchMap$ext$mods$gameserver$enums$items$WeaponType
   #87 = Utf8               [I
   #88 = Methodref          #89.#90       // ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
   #89 = Class              #91           // ext/mods/gameserver/model/item/kind/Weapon
   #90 = NameAndType        #92:#93       // getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
   #91 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
   #92 = Utf8               getItemType
   #93 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
   #94 = Methodref          #95.#96       // ext/mods/gameserver/enums/items/WeaponType.ordinal:()I
   #95 = Class              #97           // ext/mods/gameserver/enums/items/WeaponType
   #96 = NameAndType        #98:#30       // ordinal:()I
   #97 = Utf8               ext/mods/gameserver/enums/items/WeaponType
   #98 = Utf8               ordinal
   #99 = Fieldref           #100.#101     // ext/mods/gameserver/network/SystemMessageId.CANNOT_ATTACK_WITH_FISHING_POLE:Lext/mods/gameserver/network/SystemMessageId;
  #100 = Class              #102          // ext/mods/gameserver/network/SystemMessageId
  #101 = NameAndType        #103:#104     // CANNOT_ATTACK_WITH_FISHING_POLE:Lext/mods/gameserver/network/SystemMessageId;
  #102 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #103 = Utf8               CANNOT_ATTACK_WITH_FISHING_POLE
  #104 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #105 = Methodref          #25.#106      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #106 = NameAndType        #107:#108     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #107 = Utf8               sendPacket
  #108 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #109 = Methodref          #25.#110      // ext/mods/gameserver/model/actor/Player.checkAndEquipArrows:()Z
  #110 = NameAndType        #111:#12      // checkAndEquipArrows:()Z
  #111 = Utf8               checkAndEquipArrows
  #112 = Fieldref           #100.#113     // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ARROWS:Lext/mods/gameserver/network/SystemMessageId;
  #113 = NameAndType        #114:#104     // NOT_ENOUGH_ARROWS:Lext/mods/gameserver/network/SystemMessageId;
  #114 = Utf8               NOT_ENOUGH_ARROWS
  #115 = Methodref          #89.#116      // ext/mods/gameserver/model/item/kind/Weapon.getMpConsume:()I
  #116 = NameAndType        #117:#30      // getMpConsume:()I
  #117 = Utf8               getMpConsume
  #118 = Methodref          #70.#119      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
  #119 = NameAndType        #120:#121     // getMp:()D
  #120 = Utf8               getMp
  #121 = Utf8               ()D
  #122 = Fieldref           #100.#123     // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_MP:Lext/mods/gameserver/network/SystemMessageId;
  #123 = NameAndType        #124:#104     // NOT_ENOUGH_MP:Lext/mods/gameserver/network/SystemMessageId;
  #124 = Utf8               NOT_ENOUGH_MP
  #125 = Methodref          #126.#127     // ext/mods/extensions/listener/manager/CreatureListenerManager.getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
  #126 = Class              #128          // ext/mods/extensions/listener/manager/CreatureListenerManager
  #127 = NameAndType        #129:#130     // getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
  #128 = Utf8               ext/mods/extensions/listener/manager/CreatureListenerManager
  #129 = Utf8               getInstance
  #130 = Utf8               ()Lext/mods/extensions/listener/manager/CreatureListenerManager;
  #131 = Methodref          #126.#132     // ext/mods/extensions/listener/manager/CreatureListenerManager.notifyAttack:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #132 = NameAndType        #133:#134     // notifyAttack:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #133 = Utf8               notifyAttack
  #134 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #135 = Fieldref           #136.#137     // ext/mods/Config.DEBUG_MELEE_ATTACK:Z
  #136 = Class              #138          // ext/mods/Config
  #137 = NameAndType        #139:#140     // DEBUG_MELEE_ATTACK:Z
  #138 = Utf8               ext/mods/Config
  #139 = Utf8               DEBUG_MELEE_ATTACK
  #140 = Utf8               Z
  #141 = Methodref          #2.#142       // ext/mods/gameserver/model/actor/attack/PlayableAttack.stop:()V
  #142 = NameAndType        #143:#62      // stop:()V
  #143 = Utf8               stop
  #144 = Methodref          #25.#145      // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #145 = NameAndType        #146:#147     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #146 = Utf8               getAI
  #147 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #148 = Methodref          #149.#150     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.clientActionFailed:()V
  #149 = Class              #151          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #150 = NameAndType        #152:#62      // clientActionFailed:()V
  #151 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #152 = Utf8               clientActionFailed
  #153 = Methodref          #154.#155     // java/lang/Class.getName:()Ljava/lang/String;
  #154 = Class              #156          // java/lang/Class
  #155 = NameAndType        #157:#158     // getName:()Ljava/lang/String;
  #156 = Utf8               java/lang/Class
  #157 = Utf8               getName
  #158 = Utf8               ()Ljava/lang/String;
  #159 = Methodref          #50.#160      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #160 = NameAndType        #5:#161       // "<init>":(Ljava/lang/String;)V
  #161 = Utf8               (Ljava/lang/String;)V
  #162 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #163 = Utf8               Code
  #164 = Utf8               LineNumberTable
  #165 = Utf8               LocalVariableTable
  #166 = Utf8               this
  #167 = Utf8               Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #168 = Utf8               creature
  #169 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #170 = Utf8               target
  #171 = Utf8               StackMapTable
  #172 = Utf8               mpConsume
  #173 = Utf8               I
  #174 = Utf8               weaponItem
  #175 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #176 = Utf8               <clinit>
  #177 = Utf8               Signature
  #178 = Utf8               Lext/mods/gameserver/model/actor/attack/PlayableAttack<Lext/mods/gameserver/model/actor/Player;>;
  #179 = Utf8               SourceFile
  #180 = Utf8               PlayerAttack.java
  #181 = Utf8               NestMembers
  #182 = Utf8               InnerClasses
{
  public ext.mods.gameserver.model.actor.attack.PlayerAttack(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/attack/PlayableAttack."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         5: return
      LineNumberTable:
        line 37: 0
        line 38: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/attack/PlayerAttack;
            0       6     1 creature   Lext/mods/gameserver/model/actor/Player;

  public void doAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #7                  // Method isMeleeDebug:()Z
         4: ifeq          62
         7: getstatic     #13                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        10: ldc           #17                 // String [MeleeDebug][PlayerAttack][doAttack] actor={} target={} dist={}
        12: iconst_3
        13: anewarray     #19                 // class java/lang/Object
        16: dup
        17: iconst_0
        18: aload_0
        19: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        25: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        28: invokestatic  #31                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        31: aastore
        32: dup
        33: iconst_1
        34: aload_1
        35: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        38: invokestatic  #31                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        41: aastore
        42: dup
        43: iconst_2
        44: aload_0
        45: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        48: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        51: aload_1
        52: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        55: invokestatic  #44                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        58: aastore
        59: invokevirtual #49                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        62: aload_0
        63: aload_1
        64: invokespecial #55                 // Method ext/mods/gameserver/model/actor/attack/PlayableAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
        67: aload_0
        68: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        71: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        74: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.clearRecentFakeDeath:()V
        77: return
      LineNumberTable:
        line 43: 0
        line 45: 7
        line 46: 25
        line 45: 59
        line 48: 62
        line 50: 67
        line 51: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      78     0  this   Lext/mods/gameserver/model/actor/attack/PlayerAttack;
            0      78     1 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 62 /* same */

  public boolean canAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #7                  // Method isMeleeDebug:()Z
         4: ifeq          81
         7: getstatic     #13                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        10: ldc           #63                 // String [MeleeDebug][PlayerAttack][canAttack] actor={} target={} dist={} range={}
        12: iconst_4
        13: anewarray     #19                 // class java/lang/Object
        16: dup
        17: iconst_0
        18: aload_0
        19: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        25: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        28: invokestatic  #31                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        31: aastore
        32: dup
        33: iconst_1
        34: aload_1
        35: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        38: invokestatic  #31                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        41: aastore
        42: dup
        43: iconst_2
        44: aload_0
        45: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        48: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        51: aload_1
        52: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        55: invokestatic  #44                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        58: aastore
        59: dup
        60: iconst_3
        61: aload_0
        62: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        65: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        68: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        71: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
        74: invokestatic  #31                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        77: aastore
        78: invokevirtual #49                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        81: aload_0
        82: aload_1
        83: invokespecial #74                 // Method ext/mods/gameserver/model/actor/attack/PlayableAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
        86: ifne          91
        89: iconst_0
        90: ireturn
        91: aload_0
        92: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        95: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        98: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
       101: astore_2
       102: getstatic     #82                 // Field ext/mods/gameserver/model/actor/attack/PlayerAttack$1.$SwitchMap$ext$mods$gameserver$enums$items$WeaponType:[I
       105: aload_2
       106: invokevirtual #88                 // Method ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
       109: invokevirtual #94                 // Method ext/mods/gameserver/enums/items/WeaponType.ordinal:()I
       112: iaload
       113: lookupswitch  { // 2

                       1: 140

                       2: 155
                 default: 226
            }
       140: aload_0
       141: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       144: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       147: getstatic     #99                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_ATTACK_WITH_FISHING_POLE:Lext/mods/gameserver/network/SystemMessageId;
       150: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       153: iconst_0
       154: ireturn
       155: aload_0
       156: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       159: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       162: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.checkAndEquipArrows:()Z
       165: ifne          183
       168: aload_0
       169: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       172: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       175: getstatic     #112                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ARROWS:Lext/mods/gameserver/network/SystemMessageId;
       178: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       181: iconst_0
       182: ireturn
       183: aload_2
       184: invokevirtual #115                // Method ext/mods/gameserver/model/item/kind/Weapon.getMpConsume:()I
       187: istore_3
       188: iload_3
       189: ifle          226
       192: iload_3
       193: i2d
       194: aload_0
       195: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       198: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       201: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       204: invokevirtual #118                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
       207: dcmpl
       208: ifle          226
       211: aload_0
       212: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       215: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
       218: getstatic     #122                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_MP:Lext/mods/gameserver/network/SystemMessageId;
       221: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       224: iconst_0
       225: ireturn
       226: invokestatic  #125                // Method ext/mods/extensions/listener/manager/CreatureListenerManager.getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
       229: aload_0
       230: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       233: aload_1
       234: invokevirtual #131                // Method ext/mods/extensions/listener/manager/CreatureListenerManager.notifyAttack:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
       237: iconst_1
       238: ireturn
      LineNumberTable:
        line 56: 0
        line 58: 7
        line 59: 25
        line 58: 78
        line 62: 81
        line 63: 89
        line 65: 91
        line 67: 102
        line 70: 140
        line 71: 153
        line 74: 155
        line 76: 168
        line 77: 181
        line 80: 183
        line 81: 188
        line 83: 211
        line 84: 224
        line 88: 226
        line 89: 237
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          188      38     3 mpConsume   I
            0     239     0  this   Lext/mods/gameserver/model/actor/attack/PlayerAttack;
            0     239     1 target   Lext/mods/gameserver/model/actor/Creature;
          102     137     2 weaponItem   Lext/mods/gameserver/model/item/kind/Weapon;
      StackMapTable: number_of_entries = 6
        frame_type = 251 /* same_frame_extended */
          offset_delta = 81
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/item/kind/Weapon ]
        frame_type = 14 /* same */
        frame_type = 27 /* same */
        frame_type = 42 /* same */

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #141                // Method ext/mods/gameserver/model/actor/attack/PlayableAttack.stop:()V
         4: aload_0
         5: getfield      #21                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #25                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        14: invokevirtual #148                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.clientActionFailed:()V
        17: return
      LineNumberTable:
        line 100: 0
        line 102: 4
        line 103: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/attack/PlayerAttack;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #50                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/actor/attack/PlayerAttack
         6: invokevirtual #153                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #159                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #13                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 33: 0
}
Signature: #178                         // Lext/mods/gameserver/model/actor/attack/PlayableAttack<Lext/mods/gameserver/model/actor/Player;>;
SourceFile: "PlayerAttack.java"
NestMembers:
  ext/mods/gameserver/model/actor/attack/PlayerAttack$1
InnerClasses:
  static #83;                             // class ext/mods/gameserver/model/actor/attack/PlayerAttack$1
