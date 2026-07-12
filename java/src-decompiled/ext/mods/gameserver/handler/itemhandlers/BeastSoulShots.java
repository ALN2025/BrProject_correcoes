// Bytecode for: ext.mods.gameserver.handler.itemhandlers.BeastSoulShots
// File: ext\mods\gameserver\handler\itemhandlers\BeastSoulShots.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/BeastSoulShots.class
  Last modified 9 de jul de 2026; size 3135 bytes
  MD5 checksum f5895928297859a572373745f7f6548b
  Compiled from "BeastSoulShots.java"
public class ext.mods.gameserver.handler.itemhandlers.BeastSoulShots implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #115                        // ext/mods/gameserver/handler/itemhandlers/BeastSoulShots
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Playable
    #9 = NameAndType        #11:#12       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/actor/Playable
   #11 = Utf8               getActingPlayer
   #12 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Summon
   #14 = Utf8               ext/mods/gameserver/model/actor/Summon
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/network/SystemMessageId.PET_CANNOT_USE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
   #16 = Class              #18           // ext/mods/gameserver/network/SystemMessageId
   #17 = NameAndType        #19:#20       // PET_CANNOT_USE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
   #18 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #19 = Utf8               PET_CANNOT_USE_ITEM
   #20 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #22 = Class              #24           // ext/mods/gameserver/model/actor/Player
   #23 = NameAndType        #25:#26       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #24 = Utf8               ext/mods/gameserver/model/actor/Player
   #25 = Utf8               sendPacket
   #26 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #27 = Methodref          #22.#28       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #28 = NameAndType        #29:#30       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #29 = Utf8               getSummon
   #30 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #31 = Fieldref           #16.#32       // ext/mods/gameserver/network/SystemMessageId.PETS_ARE_NOT_AVAILABLE_AT_THIS_TIME:Lext/mods/gameserver/network/SystemMessageId;
   #32 = NameAndType        #33:#20       // PETS_ARE_NOT_AVAILABLE_AT_THIS_TIME:Lext/mods/gameserver/network/SystemMessageId;
   #33 = Utf8               PETS_ARE_NOT_AVAILABLE_AT_THIS_TIME
   #34 = Methodref          #13.#35       // ext/mods/gameserver/model/actor/Summon.isDead:()Z
   #35 = NameAndType        #36:#37       // isDead:()Z
   #36 = Utf8               isDead
   #37 = Utf8               ()Z
   #38 = Fieldref           #16.#39       // ext/mods/gameserver/network/SystemMessageId.SOULSHOTS_AND_SPIRITSHOTS_ARE_NOT_AVAILABLE_FOR_A_DEAD_PET:Lext/mods/gameserver/network/SystemMessageId;
   #39 = NameAndType        #40:#20       // SOULSHOTS_AND_SPIRITSHOTS_ARE_NOT_AVAILABLE_FOR_A_DEAD_PET:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Utf8               SOULSHOTS_AND_SPIRITSHOTS_ARE_NOT_AVAILABLE_FOR_A_DEAD_PET
   #41 = Fieldref           #42.#43       // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #42 = Class              #44           // ext/mods/gameserver/enums/items/ShotType
   #43 = NameAndType        #45:#46       // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #44 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #45 = Utf8               SOULSHOT
   #46 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #47 = Methodref          #13.#48       // ext/mods/gameserver/model/actor/Summon.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #48 = NameAndType        #49:#50       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #49 = Utf8               isChargedShot
   #50 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #51 = Fieldref           #52.#53       // ext/mods/Config.INFINITY_SS:Z
   #52 = Class              #54           // ext/mods/Config
   #53 = NameAndType        #55:#56       // INFINITY_SS:Z
   #54 = Utf8               ext/mods/Config
   #55 = Utf8               INFINITY_SS
   #56 = Utf8               Z
   #57 = Fieldref           #52.#58       // ext/mods/Config.INFINITY_SS_PREMIUM_ONLY:Z
   #58 = NameAndType        #59:#56       // INFINITY_SS_PREMIUM_ONLY:Z
   #59 = Utf8               INFINITY_SS_PREMIUM_ONLY
   #60 = Methodref          #22.#61       // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #61 = NameAndType        #62:#63       // getPremiumService:()I
   #62 = Utf8               getPremiumService
   #63 = Utf8               ()I
   #64 = Methodref          #65.#66       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #65 = Class              #67           // ext/mods/gameserver/model/item/instance/ItemInstance
   #66 = NameAndType        #68:#63       // getObjectId:()I
   #67 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #68 = Utf8               getObjectId
   #69 = Methodref          #13.#70       // ext/mods/gameserver/model/actor/Summon.getSoulShotsPerHit:()I
   #70 = NameAndType        #71:#63       // getSoulShotsPerHit:()I
   #71 = Utf8               getSoulShotsPerHit
   #72 = Methodref          #22.#73       // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
   #73 = NameAndType        #74:#75       // destroyItem:(IIZ)Z
   #74 = Utf8               destroyItem
   #75 = Utf8               (IIZ)Z
   #76 = Methodref          #65.#77       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #77 = NameAndType        #78:#63       // getItemId:()I
   #78 = Utf8               getItemId
   #79 = Methodref          #22.#80       // ext/mods/gameserver/model/actor/Player.disableAutoShot:(I)Z
   #80 = NameAndType        #81:#82       // disableAutoShot:(I)Z
   #81 = Utf8               disableAutoShot
   #82 = Utf8               (I)Z
   #83 = Fieldref           #16.#84       // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SOULSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
   #84 = NameAndType        #85:#20       // NOT_ENOUGH_SOULSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
   #85 = Utf8               NOT_ENOUGH_SOULSHOTS_FOR_PET
   #86 = Fieldref           #16.#87       // ext/mods/gameserver/network/SystemMessageId.PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
   #87 = NameAndType        #88:#20       // PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
   #88 = Utf8               PET_USES_S1
   #89 = Methodref          #90.#91       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #90 = Class              #92           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #91 = NameAndType        #93:#94       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #92 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #93 = Utf8               getSystemMessage
   #94 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #95 = Methodref          #90.#96       // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #96 = NameAndType        #97:#98       // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #97 = Utf8               addItemName
   #98 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #99 = Methodref          #22.#100      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #100 = NameAndType        #25:#101      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #101 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = Methodref          #13.#103      // ext/mods/gameserver/model/actor/Summon.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #103 = NameAndType        #104:#105     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #104 = Utf8               setChargedShot
  #105 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #106 = Class              #107          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #107 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #108 = Methodref          #106.#109     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #109 = NameAndType        #5:#110       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #110 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #111 = Methodref          #22.#112      // ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #112 = NameAndType        #113:#114     // broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #113 = Utf8               broadcastPacketInRadius
  #114 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #115 = Class              #116          // ext/mods/gameserver/handler/itemhandlers/BeastSoulShots
  #116 = Utf8               ext/mods/gameserver/handler/itemhandlers/BeastSoulShots
  #117 = Class              #118          // ext/mods/gameserver/handler/IItemHandler
  #118 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #119 = Utf8               Code
  #120 = Utf8               LineNumberTable
  #121 = Utf8               LocalVariableTable
  #122 = Utf8               this
  #123 = Utf8               Lext/mods/gameserver/handler/itemhandlers/BeastSoulShots;
  #124 = Utf8               useItem
  #125 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #126 = Utf8               playable
  #127 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #128 = Utf8               item
  #129 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #130 = Utf8               forceUse
  #131 = Utf8               player
  #132 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #133 = Utf8               summon
  #134 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #135 = Utf8               infinitySS
  #136 = Utf8               StackMapTable
  #137 = Utf8               SourceFile
  #138 = Utf8               BeastSoulShots.java
{
  public ext.mods.gameserver.handler.itemhandlers.BeastSoulShots();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/BeastSoulShots;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=7, args_size=4
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_1
         6: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         9: astore        4
        11: aload         4
        13: ifnonnull     17
        16: return
        17: aload_1
        18: instanceof    #13                 // class ext/mods/gameserver/model/actor/Summon
        21: ifeq          33
        24: aload         4
        26: getstatic     #15                 // Field ext/mods/gameserver/network/SystemMessageId.PET_CANNOT_USE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
        29: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        32: return
        33: aload         4
        35: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        38: astore        5
        40: aload         5
        42: ifnonnull     54
        45: aload         4
        47: getstatic     #31                 // Field ext/mods/gameserver/network/SystemMessageId.PETS_ARE_NOT_AVAILABLE_AT_THIS_TIME:Lext/mods/gameserver/network/SystemMessageId;
        50: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        53: return
        54: aload         5
        56: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Summon.isDead:()Z
        59: ifeq          71
        62: aload         4
        64: getstatic     #38                 // Field ext/mods/gameserver/network/SystemMessageId.SOULSHOTS_AND_SPIRITSHOTS_ARE_NOT_AVAILABLE_FOR_A_DEAD_PET:Lext/mods/gameserver/network/SystemMessageId;
        67: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        70: return
        71: aload         5
        73: getstatic     #41                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        76: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Summon.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        79: ifeq          83
        82: return
        83: getstatic     #51                 // Field ext/mods/Config.INFINITY_SS:Z
        86: ifeq          107
        89: getstatic     #57                 // Field ext/mods/Config.INFINITY_SS_PREMIUM_ONLY:Z
        92: ifeq          103
        95: aload         4
        97: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       100: ifle          107
       103: iconst_1
       104: goto          108
       107: iconst_0
       108: istore        6
       110: iload         6
       112: ifne          154
       115: aload         4
       117: aload_2
       118: invokevirtual #64                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       121: aload         5
       123: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Summon.getSoulShotsPerHit:()I
       126: iconst_0
       127: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
       130: ifne          154
       133: aload         4
       135: aload_2
       136: invokevirtual #76                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       139: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.disableAutoShot:(I)Z
       142: ifne          153
       145: aload         4
       147: getstatic     #83                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SOULSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
       150: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       153: return
       154: aload         4
       156: getstatic     #86                 // Field ext/mods/gameserver/network/SystemMessageId.PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
       159: invokestatic  #89                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       162: aload_2
       163: invokevirtual #76                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       166: invokevirtual #95                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       169: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       172: aload         5
       174: getstatic     #41                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       177: iconst_1
       178: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Summon.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       181: aload         4
       183: new           #106                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       186: dup
       187: aload         5
       189: aload         5
       191: sipush        2033
       194: iconst_1
       195: iconst_0
       196: iconst_0
       197: invokespecial #108                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       200: sipush        600
       203: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
       206: return
      LineNumberTable:
        line 36: 0
        line 37: 4
        line 39: 5
        line 40: 11
        line 41: 16
        line 43: 17
        line 45: 24
        line 46: 32
        line 49: 33
        line 50: 40
        line 52: 45
        line 53: 53
        line 56: 54
        line 58: 62
        line 59: 70
        line 62: 71
        line 63: 82
        line 65: 83
        line 66: 110
        line 68: 133
        line 69: 145
        line 71: 153
        line 74: 154
        line 75: 172
        line 76: 181
        line 77: 206
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     207     0  this   Lext/mods/gameserver/handler/itemhandlers/BeastSoulShots;
            0     207     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     207     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     207     3 forceUse   Z
           11     196     4 player   Lext/mods/gameserver/model/actor/Player;
           40     167     5 summon   Lext/mods/gameserver/model/actor/Summon;
          110      97     6 infinitySS   Z
      StackMapTable: number_of_entries = 11
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 16 /* same */
        frame_type = 11 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ int ]
        frame_type = 0 /* same */
}
SourceFile: "BeastSoulShots.java"
