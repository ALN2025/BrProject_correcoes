// Bytecode for: ext.mods.gameserver.handler.itemhandlers.MercenaryTickets
// File: ext\mods\gameserver\handler\itemhandlers\MercenaryTickets.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/MercenaryTickets.class
  Last modified 9 de jul de 2026; size 3921 bytes
  MD5 checksum ec79a3e2e9b699baab5b3a497969b240
  Compiled from "MercenaryTickets.java"
public class ext.mods.gameserver.handler.itemhandlers.MercenaryTickets implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #144                        // ext/mods/gameserver/handler/itemhandlers/MercenaryTickets
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #10.#11       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #10 = Class              #12           // ext/mods/gameserver/data/manager/CastleManager
   #11 = NameAndType        #13:#14       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #12 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #13 = Utf8               getInstance
   #14 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #15 = Methodref          #10.#16       // ext/mods/gameserver/data/manager/CastleManager.getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
   #16 = NameAndType        #17:#18       // getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
   #17 = Utf8               getCastle
   #18 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
   #20 = Class              #22           // ext/mods/gameserver/model/residence/castle/Castle
   #21 = NameAndType        #23:#24       // getId:()I
   #22 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #23 = Utf8               getId
   #24 = Utf8               ()I
   #25 = Methodref          #7.#26        // ext/mods/gameserver/model/actor/Player.isCastleLord:(I)Z
   #26 = NameAndType        #27:#28       // isCastleLord:(I)Z
   #27 = Utf8               isCastleLord
   #28 = Utf8               (I)Z
   #29 = Fieldref           #30.#31       // ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_HAVE_AUTHORITY_TO_POSITION_MERCENARIES:Lext/mods/gameserver/network/SystemMessageId;
   #30 = Class              #32           // ext/mods/gameserver/network/SystemMessageId
   #31 = NameAndType        #33:#34       // YOU_DO_NOT_HAVE_AUTHORITY_TO_POSITION_MERCENARIES:Lext/mods/gameserver/network/SystemMessageId;
   #32 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #33 = Utf8               YOU_DO_NOT_HAVE_AUTHORITY_TO_POSITION_MERCENARIES
   #34 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #35 = Methodref          #7.#36        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #36 = NameAndType        #37:#38       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #37 = Utf8               sendPacket
   #38 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #39 = Methodref          #40.#41       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #40 = Class              #42           // ext/mods/gameserver/model/item/instance/ItemInstance
   #41 = NameAndType        #43:#24       // getItemId:()I
   #42 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #43 = Utf8               getItemId
   #44 = Methodref          #20.#45       // ext/mods/gameserver/model/residence/castle/Castle.getTicket:(I)Lext/mods/gameserver/model/item/MercenaryTicket;
   #45 = NameAndType        #46:#47       // getTicket:(I)Lext/mods/gameserver/model/item/MercenaryTicket;
   #46 = Utf8               getTicket
   #47 = Utf8               (I)Lext/mods/gameserver/model/item/MercenaryTicket;
   #48 = Fieldref           #30.#49       // ext/mods/gameserver/network/SystemMessageId.MERCENARIES_CANNOT_BE_POSITIONED_HERE:Lext/mods/gameserver/network/SystemMessageId;
   #49 = NameAndType        #50:#34       // MERCENARIES_CANNOT_BE_POSITIONED_HERE:Lext/mods/gameserver/network/SystemMessageId;
   #50 = Utf8               MERCENARIES_CANNOT_BE_POSITIONED_HERE
   #51 = Methodref          #20.#52       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #52 = NameAndType        #53:#54       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #53 = Utf8               getSiege
   #54 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #56 = Class              #58           // ext/mods/gameserver/model/residence/castle/Siege
   #57 = NameAndType        #59:#60       // isInProgress:()Z
   #58 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #59 = Utf8               isInProgress
   #60 = Utf8               ()Z
   #61 = Fieldref           #30.#62       // ext/mods/gameserver/network/SystemMessageId.THIS_MERCENARY_CANNOT_BE_POSITIONED_ANYMORE:Lext/mods/gameserver/network/SystemMessageId;
   #62 = NameAndType        #63:#34       // THIS_MERCENARY_CANNOT_BE_POSITIONED_ANYMORE:Lext/mods/gameserver/network/SystemMessageId;
   #63 = Utf8               THIS_MERCENARY_CANNOT_BE_POSITIONED_ANYMORE
   #64 = Methodref          #65.#66       // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #65 = Class              #67           // ext/mods/gameserver/data/manager/SevenSignsManager
   #66 = NameAndType        #13:#68       // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #67 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #68 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #69 = Methodref          #65.#70       // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
   #70 = NameAndType        #71:#60       // isSealValidationPeriod:()Z
   #71 = Utf8               isSealValidationPeriod
   #72 = Fieldref           #30.#73       // ext/mods/gameserver/network/SystemMessageId.MERC_CAN_BE_ASSIGNED:Lext/mods/gameserver/network/SystemMessageId;
   #73 = NameAndType        #74:#34       // MERC_CAN_BE_ASSIGNED:Lext/mods/gameserver/network/SystemMessageId;
   #74 = Utf8               MERC_CAN_BE_ASSIGNED
   #75 = Fieldref           #76.#77       // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
   #76 = Class              #78           // ext/mods/gameserver/enums/SealType
   #77 = NameAndType        #79:#80       // STRIFE:Lext/mods/gameserver/enums/SealType;
   #78 = Utf8               ext/mods/gameserver/enums/SealType
   #79 = Utf8               STRIFE
   #80 = Utf8               Lext/mods/gameserver/enums/SealType;
   #81 = Methodref          #65.#82       // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #82 = NameAndType        #83:#84       // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #83 = Utf8               getSealOwner
   #84 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #85 = Methodref          #86.#87       // ext/mods/gameserver/model/item/MercenaryTicket.isSsqType:(Lext/mods/gameserver/enums/CabalType;)Z
   #86 = Class              #88           // ext/mods/gameserver/model/item/MercenaryTicket
   #87 = NameAndType        #89:#90       // isSsqType:(Lext/mods/gameserver/enums/CabalType;)Z
   #88 = Utf8               ext/mods/gameserver/model/item/MercenaryTicket
   #89 = Utf8               isSsqType
   #90 = Utf8               (Lext/mods/gameserver/enums/CabalType;)Z
   #91 = Fieldref           #30.#92       // ext/mods/gameserver/network/SystemMessageId.MERC_CANT_BE_ASSIGNED_USING_STRIFE:Lext/mods/gameserver/network/SystemMessageId;
   #92 = NameAndType        #93:#34       // MERC_CANT_BE_ASSIGNED_USING_STRIFE:Lext/mods/gameserver/network/SystemMessageId;
   #93 = Utf8               MERC_CANT_BE_ASSIGNED_USING_STRIFE
   #94 = Methodref          #20.#95       // ext/mods/gameserver/model/residence/castle/Castle.getDroppedTicketsCount:(I)I
   #95 = NameAndType        #96:#97       // getDroppedTicketsCount:(I)I
   #96 = Utf8               getDroppedTicketsCount
   #97 = Utf8               (I)I
   #98 = Methodref          #86.#99       // ext/mods/gameserver/model/item/MercenaryTicket.getMaxAmount:()I
   #99 = NameAndType        #100:#24      // getMaxAmount:()I
  #100 = Utf8               getMaxAmount
  #101 = Methodref          #7.#102       // ext/mods/gameserver/model/actor/Player.getX:()I
  #102 = NameAndType        #103:#24      // getX:()I
  #103 = Utf8               getX
  #104 = Methodref          #7.#105       // ext/mods/gameserver/model/actor/Player.getY:()I
  #105 = NameAndType        #106:#24      // getY:()I
  #106 = Utf8               getY
  #107 = Methodref          #7.#108       // ext/mods/gameserver/model/actor/Player.getZ:()I
  #108 = NameAndType        #109:#24      // getZ:()I
  #109 = Utf8               getZ
  #110 = Methodref          #20.#111      // ext/mods/gameserver/model/residence/castle/Castle.isTooCloseFromDroppedTicket:(III)Z
  #111 = NameAndType        #112:#113     // isTooCloseFromDroppedTicket:(III)Z
  #112 = Utf8               isTooCloseFromDroppedTicket
  #113 = Utf8               (III)Z
  #114 = Fieldref           #30.#115      // ext/mods/gameserver/network/SystemMessageId.POSITIONING_CANNOT_BE_DONE_BECAUSE_DISTANCE_BETWEEN_MERCENARIES_TOO_SHORT:Lext/mods/gameserver/network/SystemMessageId;
  #115 = NameAndType        #116:#34      // POSITIONING_CANNOT_BE_DONE_BECAUSE_DISTANCE_BETWEEN_MERCENARIES_TOO_SHORT:Lext/mods/gameserver/network/SystemMessageId;
  #116 = Utf8               POSITIONING_CANNOT_BE_DONE_BECAUSE_DISTANCE_BETWEEN_MERCENARIES_TOO_SHORT
  #117 = Methodref          #40.#118      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #118 = NameAndType        #119:#24      // getObjectId:()I
  #119 = Utf8               getObjectId
  #120 = Methodref          #7.#121       // ext/mods/gameserver/model/actor/Player.dropItem:(IIIIIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #121 = NameAndType        #122:#123     // dropItem:(IIIIIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #122 = Utf8               dropItem
  #123 = Utf8               (IIIIIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #124 = Methodref          #20.#125      // ext/mods/gameserver/model/residence/castle/Castle.addDroppedTicket:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #125 = NameAndType        #126:#127     // addDroppedTicket:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #126 = Utf8               addDroppedTicket
  #127 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #128 = Fieldref           #30.#129      // ext/mods/gameserver/network/SystemMessageId.PLACE_S1_IN_CURRENT_LOCATION_AND_DIRECTION:Lext/mods/gameserver/network/SystemMessageId;
  #129 = NameAndType        #130:#34      // PLACE_S1_IN_CURRENT_LOCATION_AND_DIRECTION:Lext/mods/gameserver/network/SystemMessageId;
  #130 = Utf8               PLACE_S1_IN_CURRENT_LOCATION_AND_DIRECTION
  #131 = Methodref          #132.#133     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #132 = Class              #134          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #133 = NameAndType        #135:#136     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #134 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #135 = Utf8               getSystemMessage
  #136 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #137 = Methodref          #132.#138     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #138 = NameAndType        #139:#140     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #139 = Utf8               addItemName
  #140 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #141 = Methodref          #7.#142       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #142 = NameAndType        #37:#143      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #143 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #144 = Class              #145          // ext/mods/gameserver/handler/itemhandlers/MercenaryTickets
  #145 = Utf8               ext/mods/gameserver/handler/itemhandlers/MercenaryTickets
  #146 = Class              #147          // ext/mods/gameserver/handler/IItemHandler
  #147 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #148 = Utf8               Code
  #149 = Utf8               LineNumberTable
  #150 = Utf8               LocalVariableTable
  #151 = Utf8               this
  #152 = Utf8               Lext/mods/gameserver/handler/itemhandlers/MercenaryTickets;
  #153 = Utf8               useItem
  #154 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #155 = Utf8               playable
  #156 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #157 = Utf8               item
  #158 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #159 = Utf8               forceUse
  #160 = Utf8               Z
  #161 = Utf8               player
  #162 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #163 = Utf8               castle
  #164 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #165 = Utf8               itemId
  #166 = Utf8               I
  #167 = Utf8               ticket
  #168 = Utf8               Lext/mods/gameserver/model/item/MercenaryTicket;
  #169 = Utf8               droppedTicket
  #170 = Utf8               StackMapTable
  #171 = Utf8               SourceFile
  #172 = Utf8               MercenaryTickets.java
{
  public ext.mods.gameserver.handler.itemhandlers.MercenaryTickets();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/MercenaryTickets;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=9, args_size=4
         0: aload_1
         1: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
         4: astore        4
         6: aload         4
         8: ifnonnull     12
        11: return
        12: invokestatic  #9                  // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        15: aload         4
        17: invokevirtual #15                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
        20: astore        5
        22: aload         5
        24: ifnonnull     28
        27: return
        28: aload         4
        30: aload         5
        32: invokevirtual #19                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        35: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.isCastleLord:(I)Z
        38: ifne          50
        41: aload         4
        43: getstatic     #29                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_HAVE_AUTHORITY_TO_POSITION_MERCENARIES:Lext/mods/gameserver/network/SystemMessageId;
        46: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        49: return
        50: aload_2
        51: invokevirtual #39                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        54: istore        6
        56: aload         5
        58: iload         6
        60: invokevirtual #44                 // Method ext/mods/gameserver/model/residence/castle/Castle.getTicket:(I)Lext/mods/gameserver/model/item/MercenaryTicket;
        63: astore        7
        65: aload         7
        67: ifnonnull     79
        70: aload         4
        72: getstatic     #48                 // Field ext/mods/gameserver/network/SystemMessageId.MERCENARIES_CANNOT_BE_POSITIONED_HERE:Lext/mods/gameserver/network/SystemMessageId;
        75: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        78: return
        79: aload         5
        81: invokevirtual #51                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        84: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        87: ifeq          99
        90: aload         4
        92: getstatic     #61                 // Field ext/mods/gameserver/network/SystemMessageId.THIS_MERCENARY_CANNOT_BE_POSITIONED_ANYMORE:Lext/mods/gameserver/network/SystemMessageId;
        95: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        98: return
        99: invokestatic  #64                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       102: invokevirtual #69                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
       105: ifne          117
       108: aload         4
       110: getstatic     #72                 // Field ext/mods/gameserver/network/SystemMessageId.MERC_CAN_BE_ASSIGNED:Lext/mods/gameserver/network/SystemMessageId;
       113: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       116: return
       117: aload         7
       119: invokestatic  #64                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       122: getstatic     #75                 // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
       125: invokevirtual #81                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
       128: invokevirtual #85                 // Method ext/mods/gameserver/model/item/MercenaryTicket.isSsqType:(Lext/mods/gameserver/enums/CabalType;)Z
       131: ifne          143
       134: aload         4
       136: getstatic     #91                 // Field ext/mods/gameserver/network/SystemMessageId.MERC_CANT_BE_ASSIGNED_USING_STRIFE:Lext/mods/gameserver/network/SystemMessageId;
       139: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       142: return
       143: aload         5
       145: iload         6
       147: invokevirtual #94                 // Method ext/mods/gameserver/model/residence/castle/Castle.getDroppedTicketsCount:(I)I
       150: aload         7
       152: invokevirtual #98                 // Method ext/mods/gameserver/model/item/MercenaryTicket.getMaxAmount:()I
       155: if_icmplt     167
       158: aload         4
       160: getstatic     #61                 // Field ext/mods/gameserver/network/SystemMessageId.THIS_MERCENARY_CANNOT_BE_POSITIONED_ANYMORE:Lext/mods/gameserver/network/SystemMessageId;
       163: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       166: return
       167: aload         5
       169: aload         4
       171: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       174: aload         4
       176: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       179: aload         4
       181: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       184: invokevirtual #110                // Method ext/mods/gameserver/model/residence/castle/Castle.isTooCloseFromDroppedTicket:(III)Z
       187: ifeq          199
       190: aload         4
       192: getstatic     #114                // Field ext/mods/gameserver/network/SystemMessageId.POSITIONING_CANNOT_BE_DONE_BECAUSE_DISTANCE_BETWEEN_MERCENARIES_TOO_SHORT:Lext/mods/gameserver/network/SystemMessageId;
       195: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       198: return
       199: aload         4
       201: aload_2
       202: invokevirtual #117                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       205: iconst_1
       206: aload         4
       208: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       211: aload         4
       213: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       216: aload         4
       218: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       221: iconst_0
       222: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.dropItem:(IIIIIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       225: astore        8
       227: aload         8
       229: ifnonnull     233
       232: return
       233: aload         5
       235: aload         8
       237: invokevirtual #124                // Method ext/mods/gameserver/model/residence/castle/Castle.addDroppedTicket:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       240: aload         4
       242: getstatic     #128                // Field ext/mods/gameserver/network/SystemMessageId.PLACE_S1_IN_CURRENT_LOCATION_AND_DIRECTION:Lext/mods/gameserver/network/SystemMessageId;
       245: invokestatic  #131                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       248: iload         6
       250: invokevirtual #137                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       253: invokevirtual #141                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       256: return
      LineNumberTable:
        line 49: 0
        line 50: 6
        line 51: 11
        line 53: 12
        line 54: 22
        line 55: 27
        line 57: 28
        line 59: 41
        line 60: 49
        line 63: 50
        line 64: 56
        line 66: 65
        line 68: 70
        line 69: 78
        line 72: 79
        line 74: 90
        line 75: 98
        line 78: 99
        line 80: 108
        line 81: 116
        line 84: 117
        line 86: 134
        line 87: 142
        line 90: 143
        line 92: 158
        line 93: 166
        line 96: 167
        line 98: 190
        line 99: 198
        line 102: 199
        line 103: 227
        line 104: 232
        line 106: 233
        line 108: 240
        line 109: 256
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     257     0  this   Lext/mods/gameserver/handler/itemhandlers/MercenaryTickets;
            0     257     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     257     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     257     3 forceUse   Z
            6     251     4 player   Lext/mods/gameserver/model/actor/Player;
           22     235     5 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           56     201     6 itemId   I
           65     192     7 ticket   Lext/mods/gameserver/model/item/MercenaryTicket;
          227      30     8 droppedTicket   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 10
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 21 /* same */
        frame_type = 253 /* append */
          offset_delta = 28
          locals = [ int, class ext/mods/gameserver/model/item/MercenaryTicket ]
        frame_type = 19 /* same */
        frame_type = 17 /* same */
        frame_type = 25 /* same */
        frame_type = 23 /* same */
        frame_type = 31 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
}
SourceFile: "MercenaryTickets.java"
