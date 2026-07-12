// Bytecode for: ext.mods.gameserver.handler.itemhandlers.BeastSpiritShots
// File: ext\mods\gameserver\handler\itemhandlers\BeastSpiritShots.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/BeastSpiritShots.class
  Last modified 9 de jul de 2026; size 3465 bytes
  MD5 checksum c5359d87ad7339f167417268d1782f5b
  Compiled from "BeastSpiritShots.java"
public class ext.mods.gameserver.handler.itemhandlers.BeastSpiritShots implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #118                        // ext/mods/gameserver/handler/itemhandlers/BeastSpiritShots
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
   #41 = Methodref          #42.#43       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #42 = Class              #44           // ext/mods/gameserver/model/item/instance/ItemInstance
   #43 = NameAndType        #45:#46       // getItemId:()I
   #44 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #45 = Utf8               getItemId
   #46 = Utf8               ()I
   #47 = Fieldref           #48.#49       // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #48 = Class              #50           // ext/mods/gameserver/enums/items/ShotType
   #49 = NameAndType        #51:#52       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #50 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #51 = Utf8               BLESSED_SPIRITSHOT
   #52 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #53 = Fieldref           #48.#54       // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #54 = NameAndType        #55:#52       // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #55 = Utf8               SPIRITSHOT
   #56 = Methodref          #13.#57       // ext/mods/gameserver/model/actor/Summon.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #57 = NameAndType        #58:#59       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #58 = Utf8               isChargedShot
   #59 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #60 = Fieldref           #61.#62       // ext/mods/Config.INFINITY_SS:Z
   #61 = Class              #63           // ext/mods/Config
   #62 = NameAndType        #64:#65       // INFINITY_SS:Z
   #63 = Utf8               ext/mods/Config
   #64 = Utf8               INFINITY_SS
   #65 = Utf8               Z
   #66 = Fieldref           #61.#67       // ext/mods/Config.INFINITY_SS_PREMIUM_ONLY:Z
   #67 = NameAndType        #68:#65       // INFINITY_SS_PREMIUM_ONLY:Z
   #68 = Utf8               INFINITY_SS_PREMIUM_ONLY
   #69 = Methodref          #22.#70       // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #70 = NameAndType        #71:#46       // getPremiumService:()I
   #71 = Utf8               getPremiumService
   #72 = Methodref          #42.#73       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #73 = NameAndType        #74:#46       // getObjectId:()I
   #74 = Utf8               getObjectId
   #75 = Methodref          #13.#76       // ext/mods/gameserver/model/actor/Summon.getSpiritShotsPerHit:()I
   #76 = NameAndType        #77:#46       // getSpiritShotsPerHit:()I
   #77 = Utf8               getSpiritShotsPerHit
   #78 = Methodref          #22.#79       // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
   #79 = NameAndType        #80:#81       // destroyItem:(IIZ)Z
   #80 = Utf8               destroyItem
   #81 = Utf8               (IIZ)Z
   #82 = Methodref          #22.#83       // ext/mods/gameserver/model/actor/Player.disableAutoShot:(I)Z
   #83 = NameAndType        #84:#85       // disableAutoShot:(I)Z
   #84 = Utf8               disableAutoShot
   #85 = Utf8               (I)Z
   #86 = Fieldref           #16.#87       // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SPIRITSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
   #87 = NameAndType        #88:#20       // NOT_ENOUGH_SPIRITSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
   #88 = Utf8               NOT_ENOUGH_SPIRITSHOTS_FOR_PET
   #89 = Fieldref           #16.#90       // ext/mods/gameserver/network/SystemMessageId.PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
   #90 = NameAndType        #91:#20       // PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
   #91 = Utf8               PET_USES_S1
   #92 = Methodref          #93.#94       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #93 = Class              #95           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #94 = NameAndType        #96:#97       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #95 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #96 = Utf8               getSystemMessage
   #97 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #98 = Methodref          #93.#99       // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #99 = NameAndType        #100:#101     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #100 = Utf8               addItemName
  #101 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #102 = Methodref          #22.#103      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #103 = NameAndType        #25:#104      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #104 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #105 = Methodref          #13.#106      // ext/mods/gameserver/model/actor/Summon.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #106 = NameAndType        #107:#108     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #107 = Utf8               setChargedShot
  #108 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #109 = Class              #110          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #110 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #111 = Methodref          #109.#112     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #112 = NameAndType        #5:#113       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #113 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #114 = Methodref          #22.#115      // ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #115 = NameAndType        #116:#117     // broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #116 = Utf8               broadcastPacketInRadius
  #117 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #118 = Class              #119          // ext/mods/gameserver/handler/itemhandlers/BeastSpiritShots
  #119 = Utf8               ext/mods/gameserver/handler/itemhandlers/BeastSpiritShots
  #120 = Class              #121          // ext/mods/gameserver/handler/IItemHandler
  #121 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #122 = Utf8               Code
  #123 = Utf8               LineNumberTable
  #124 = Utf8               LocalVariableTable
  #125 = Utf8               this
  #126 = Utf8               Lext/mods/gameserver/handler/itemhandlers/BeastSpiritShots;
  #127 = Utf8               useItem
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #129 = Utf8               playable
  #130 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #131 = Utf8               item
  #132 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #133 = Utf8               forceUse
  #134 = Utf8               player
  #135 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #136 = Utf8               summon
  #137 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #138 = Utf8               itemId
  #139 = Utf8               I
  #140 = Utf8               isBlessed
  #141 = Utf8               infinitySS
  #142 = Utf8               StackMapTable
  #143 = Utf8               SourceFile
  #144 = Utf8               BeastSpiritShots.java
{
  public ext.mods.gameserver.handler.itemhandlers.BeastSpiritShots();
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
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/BeastSpiritShots;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=9, args_size=4
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
        71: aload_2
        72: invokevirtual #41                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        75: istore        6
        77: iload         6
        79: sipush        6647
        82: if_icmpne     89
        85: iconst_1
        86: goto          90
        89: iconst_0
        90: istore        7
        92: aload         5
        94: iload         7
        96: ifeq          105
        99: getstatic     #47                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       102: goto          108
       105: getstatic     #53                 // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       108: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Summon.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
       111: ifeq          115
       114: return
       115: getstatic     #60                 // Field ext/mods/Config.INFINITY_SS:Z
       118: ifeq          139
       121: getstatic     #66                 // Field ext/mods/Config.INFINITY_SS_PREMIUM_ONLY:Z
       124: ifeq          135
       127: aload         4
       129: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       132: ifle          139
       135: iconst_1
       136: goto          140
       139: iconst_0
       140: istore        8
       142: iload         8
       144: ifne          184
       147: aload         4
       149: aload_2
       150: invokevirtual #72                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       153: aload         5
       155: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Summon.getSpiritShotsPerHit:()I
       158: iconst_0
       159: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
       162: ifne          184
       165: aload         4
       167: iload         6
       169: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.disableAutoShot:(I)Z
       172: ifne          183
       175: aload         4
       177: getstatic     #86                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SPIRITSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
       180: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       183: return
       184: aload         4
       186: getstatic     #89                 // Field ext/mods/gameserver/network/SystemMessageId.PET_USES_S1:Lext/mods/gameserver/network/SystemMessageId;
       189: invokestatic  #92                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       192: iload         6
       194: invokevirtual #98                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       197: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       200: aload         5
       202: iload         7
       204: ifeq          213
       207: getstatic     #47                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       210: goto          216
       213: getstatic     #53                 // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       216: iconst_1
       217: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Summon.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       220: aload         4
       222: new           #109                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       225: dup
       226: aload         5
       228: aload         5
       230: iload         7
       232: ifeq          241
       235: sipush        2009
       238: goto          244
       241: sipush        2008
       244: iconst_1
       245: iconst_0
       246: iconst_0
       247: invokespecial #111                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       250: sipush        600
       253: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
       256: return
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
        line 63: 77
        line 65: 92
        line 66: 114
        line 68: 115
        line 69: 142
        line 71: 165
        line 72: 175
        line 74: 183
        line 77: 184
        line 78: 200
        line 79: 220
        line 80: 256
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     257     0  this   Lext/mods/gameserver/handler/itemhandlers/BeastSpiritShots;
            0     257     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     257     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     257     3 forceUse   Z
           11     246     4 player   Lext/mods/gameserver/model/actor/Player;
           40     217     5 summon   Lext/mods/gameserver/model/actor/Summon;
           77     180     6 itemId   I
           92     165     7 isBlessed   Z
          142     115     8 infinitySS   Z
      StackMapTable: number_of_entries = 19
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/handler/itemhandlers/BeastSpiritShots, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Summon, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/itemhandlers/BeastSpiritShots, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Summon, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/enums/items/ShotType ]
        frame_type = 6 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ int ]
        frame_type = 0 /* same */
        frame_type = 92 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/itemhandlers/BeastSpiritShots, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Summon, int, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/enums/items/ShotType ]
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/handler/itemhandlers/BeastSpiritShots, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Summon, int, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 222, uninitialized 222, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/itemhandlers/BeastSpiritShots, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Summon, int, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 222, uninitialized 222, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Summon, int ]
}
SourceFile: "BeastSpiritShots.java"
