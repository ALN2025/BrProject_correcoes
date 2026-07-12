// Bytecode for: ext.mods.gameserver.handler.itemhandlers.RollingDices
// File: ext\mods\gameserver\handler\itemhandlers\RollingDices.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/RollingDices.class
  Last modified 9 de jul de 2026; size 2339 bytes
  MD5 checksum b2eb3c5455681cca93116d8358648d64
  Compiled from "RollingDices.java"
public class ext.mods.gameserver.handler.itemhandlers.RollingDices implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #73                         // ext/mods/gameserver/handler/itemhandlers/RollingDices
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Player
   #8 = Utf8               ext/mods/gameserver/model/actor/Player
   #9 = Methodref          #7.#10         // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #10 = NameAndType        #11:#12        // getClient:()Lext/mods/gameserver/network/GameClient;
  #11 = Utf8               getClient
  #12 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/enums/FloodProtector.ROLL_DICE:Lext/mods/gameserver/enums/FloodProtector;
  #14 = Class              #16            // ext/mods/gameserver/enums/FloodProtector
  #15 = NameAndType        #17:#18        // ROLL_DICE:Lext/mods/gameserver/enums/FloodProtector;
  #16 = Utf8               ext/mods/gameserver/enums/FloodProtector
  #17 = Utf8               ROLL_DICE
  #18 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
  #19 = Methodref          #20.#21        // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
  #20 = Class              #22            // ext/mods/gameserver/network/GameClient
  #21 = NameAndType        #23:#24        // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
  #22 = Utf8               ext/mods/gameserver/network/GameClient
  #23 = Utf8               performAction
  #24 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
  #25 = Fieldref           #26.#27        // ext/mods/gameserver/network/SystemMessageId.YOU_MAY_NOT_THROW_THE_DICE_AT_THIS_TIME_TRY_AGAIN_LATER:Lext/mods/gameserver/network/SystemMessageId;
  #26 = Class              #28            // ext/mods/gameserver/network/SystemMessageId
  #27 = NameAndType        #29:#30        // YOU_MAY_NOT_THROW_THE_DICE_AT_THIS_TIME_TRY_AGAIN_LATER:Lext/mods/gameserver/network/SystemMessageId;
  #28 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #29 = Utf8               YOU_MAY_NOT_THROW_THE_DICE_AT_THIS_TIME_TRY_AGAIN_LATER
  #30 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #31 = Methodref          #7.#32         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #32 = NameAndType        #33:#34        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #33 = Utf8               sendPacket
  #34 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #35 = Methodref          #36.#37        // ext/mods/commons/random/Rnd.get:(II)I
  #36 = Class              #38            // ext/mods/commons/random/Rnd
  #37 = NameAndType        #39:#40        // get:(II)I
  #38 = Utf8               ext/mods/commons/random/Rnd
  #39 = Utf8               get
  #40 = Utf8               (II)I
  #41 = Class              #42            // ext/mods/gameserver/network/serverpackets/Dice
  #42 = Utf8               ext/mods/gameserver/network/serverpackets/Dice
  #43 = Methodref          #44.#45        // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #44 = Class              #46            // ext/mods/gameserver/model/item/instance/ItemInstance
  #45 = NameAndType        #47:#48        // getItemId:()I
  #46 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #47 = Utf8               getItemId
  #48 = Utf8               ()I
  #49 = Methodref          #41.#50        // ext/mods/gameserver/network/serverpackets/Dice."<init>":(Lext/mods/gameserver/model/actor/Player;II)V
  #50 = NameAndType        #5:#51         // "<init>":(Lext/mods/gameserver/model/actor/Player;II)V
  #51 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
  #52 = Methodref          #7.#53         // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #53 = NameAndType        #54:#55        // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #54 = Utf8               broadcastPacket
  #55 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #56 = Fieldref           #26.#57        // ext/mods/gameserver/network/SystemMessageId.S1_ROLLED_S2:Lext/mods/gameserver/network/SystemMessageId;
  #57 = NameAndType        #58:#30        // S1_ROLLED_S2:Lext/mods/gameserver/network/SystemMessageId;
  #58 = Utf8               S1_ROLLED_S2
  #59 = Methodref          #60.#61        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #60 = Class              #62            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #61 = NameAndType        #63:#64        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #62 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #63 = Utf8               getSystemMessage
  #64 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #65 = Methodref          #60.#66        // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #66 = NameAndType        #67:#68        // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #67 = Utf8               addCharName
  #68 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #69 = Methodref          #60.#70        // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #70 = NameAndType        #71:#72        // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #71 = Utf8               addNumber
  #72 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #73 = Class              #74            // ext/mods/gameserver/handler/itemhandlers/RollingDices
  #74 = Utf8               ext/mods/gameserver/handler/itemhandlers/RollingDices
  #75 = Class              #76            // ext/mods/gameserver/handler/IItemHandler
  #76 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #77 = Utf8               Code
  #78 = Utf8               LineNumberTable
  #79 = Utf8               LocalVariableTable
  #80 = Utf8               this
  #81 = Utf8               Lext/mods/gameserver/handler/itemhandlers/RollingDices;
  #82 = Utf8               useItem
  #83 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #84 = Utf8               player
  #85 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #86 = Utf8               playable
  #87 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #88 = Utf8               item
  #89 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #90 = Utf8               forceUse
  #91 = Utf8               Z
  #92 = Utf8               number
  #93 = Utf8               I
  #94 = Utf8               StackMapTable
  #95 = Utf8               SourceFile
  #96 = Utf8               RollingDices.java
{
  public ext.mods.gameserver.handler.itemhandlers.RollingDices();
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
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/RollingDices;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: aload         4
        19: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        22: getstatic     #13                 // Field ext/mods/gameserver/enums/FloodProtector.ROLL_DICE:Lext/mods/gameserver/enums/FloodProtector;
        25: invokevirtual #19                 // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
        28: ifne          40
        31: aload         4
        33: getstatic     #25                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_MAY_NOT_THROW_THE_DICE_AT_THIS_TIME_TRY_AGAIN_LATER:Lext/mods/gameserver/network/SystemMessageId;
        36: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        39: return
        40: iconst_1
        41: bipush        6
        43: invokestatic  #35                 // Method ext/mods/commons/random/Rnd.get:(II)I
        46: istore        5
        48: aload         4
        50: new           #41                 // class ext/mods/gameserver/network/serverpackets/Dice
        53: dup
        54: aload         4
        56: aload_2
        57: invokevirtual #43                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        60: iload         5
        62: invokespecial #49                 // Method ext/mods/gameserver/network/serverpackets/Dice."<init>":(Lext/mods/gameserver/model/actor/Player;II)V
        65: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        68: aload         4
        70: getstatic     #56                 // Field ext/mods/gameserver/network/SystemMessageId.S1_ROLLED_S2:Lext/mods/gameserver/network/SystemMessageId;
        73: invokestatic  #59                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        76: aload         4
        78: invokevirtual #65                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        81: iload         5
        83: invokevirtual #69                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        86: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        89: return
      LineNumberTable:
        line 36: 0
        line 37: 16
        line 39: 17
        line 41: 31
        line 42: 39
        line 45: 40
        line 47: 48
        line 48: 68
        line 49: 89
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
            0      90     0  this   Lext/mods/gameserver/handler/itemhandlers/RollingDices;
            0      90     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0      90     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      90     3 forceUse   Z
           17      73     4 player   Lext/mods/gameserver/model/actor/Player;
           48      42     5 number   I
      StackMapTable: number_of_entries = 3
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 22 /* same */
}
SourceFile: "RollingDices.java"
