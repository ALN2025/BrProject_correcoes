// Bytecode for: ext.mods.gameserver.handler.itemhandlers.ItemNobles
// File: ext\mods\gameserver\handler\itemhandlers\ItemNobles.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/ItemNobles.class
  Last modified 9 de jul de 2026; size 2073 bytes
  MD5 checksum f1b66664d5286b75200f99a6e3ef102f
  Compiled from "ItemNobles.java"
public class ext.mods.gameserver.handler.itemhandlers.ItemNobles implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #71                         // ext/mods/gameserver/handler/itemhandlers/ItemNobles
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
   #9 = Methodref          #7.#10         // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #10 = NameAndType        #11:#12        // isInOlympiadMode:()Z
  #11 = Utf8               isInOlympiadMode
  #12 = Utf8               ()Z
  #13 = String             #14            // This item cannot be used on Olympiad Games.
  #14 = Utf8               This item cannot be used on Olympiad Games.
  #15 = Methodref          #7.#16         // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #16 = NameAndType        #17:#18        // sendMessage:(Ljava/lang/String;)V
  #17 = Utf8               sendMessage
  #18 = Utf8               (Ljava/lang/String;)V
  #19 = Methodref          #7.#20         // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #20 = NameAndType        #21:#12        // isNoble:()Z
  #21 = Utf8               isNoble
  #22 = String             #23            // You are already a noblesse.
  #23 = Utf8               You are already a noblesse.
  #24 = Class              #25            // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #25 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #26 = Methodref          #24.#27        // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
  #27 = NameAndType        #5:#28         // "<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
  #28 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIII)V
  #29 = Methodref          #7.#30         // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #30 = NameAndType        #31:#32        // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #31 = Utf8               broadcastPacket
  #32 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #33 = Class              #34            // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #34 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #35 = String             #36            // Congratulations! You are a Noble!
  #36 = Utf8               Congratulations! You are a Noble!
  #37 = Methodref          #33.#38        // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
  #38 = NameAndType        #5:#39         // "<init>":(Ljava/lang/String;I)V
  #39 = Utf8               (Ljava/lang/String;I)V
  #40 = Methodref          #7.#41         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #41 = NameAndType        #42:#32        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #42 = Utf8               sendPacket
  #43 = Methodref          #7.#44         // ext/mods/gameserver/model/actor/Player.setNoble:(ZZ)V
  #44 = NameAndType        #45:#46        // setNoble:(ZZ)V
  #45 = Utf8               setNoble
  #46 = Utf8               (ZZ)V
  #47 = Methodref          #7.#48         // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #48 = NameAndType        #49:#50        // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #49 = Utf8               getInventory
  #50 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #51 = Methodref          #52.#53        // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #52 = Class              #54            // ext/mods/gameserver/model/itemcontainer/PcInventory
  #53 = NameAndType        #55:#56        // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #54 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #55 = Utf8               addItem
  #56 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #57 = String             #58            // You are now a Noble, Check your Skills!
  #58 = Utf8               You are now a Noble, Check your Skills!
  #59 = Methodref          #60.#61        // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #60 = Class              #62            // ext/mods/gameserver/model/item/instance/ItemInstance
  #61 = NameAndType        #63:#64        // getObjectId:()I
  #62 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #63 = Utf8               getObjectId
  #64 = Utf8               ()I
  #65 = Methodref          #52.#66        // ext/mods/gameserver/model/itemcontainer/PcInventory.destroyItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #66 = NameAndType        #67:#56        // destroyItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #67 = Utf8               destroyItem
  #68 = Methodref          #7.#69         // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #69 = NameAndType        #70:#6         // broadcastUserInfo:()V
  #70 = Utf8               broadcastUserInfo
  #71 = Class              #72            // ext/mods/gameserver/handler/itemhandlers/ItemNobles
  #72 = Utf8               ext/mods/gameserver/handler/itemhandlers/ItemNobles
  #73 = Class              #74            // ext/mods/gameserver/handler/IItemHandler
  #74 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #75 = Utf8               Code
  #76 = Utf8               LineNumberTable
  #77 = Utf8               LocalVariableTable
  #78 = Utf8               this
  #79 = Utf8               Lext/mods/gameserver/handler/itemhandlers/ItemNobles;
  #80 = Utf8               useItem
  #81 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #82 = Utf8               playable
  #83 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #84 = Utf8               item
  #85 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #86 = Utf8               forceUse
  #87 = Utf8               Z
  #88 = Utf8               activeChar
  #89 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #90 = Utf8               StackMapTable
  #91 = Utf8               SourceFile
  #92 = Utf8               ItemNobles.java
{
  public ext.mods.gameserver.handler.itemhandlers.ItemNobles();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
        line 35: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/ItemNobles;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=5, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifne          8
         7: return
         8: aload_1
         9: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        12: astore        4
        14: aload         4
        16: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        19: ifeq          30
        22: aload         4
        24: ldc           #13                 // String This item cannot be used on Olympiad Games.
        26: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        29: return
        30: aload         4
        32: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
        35: ifeq          46
        38: aload         4
        40: ldc           #22                 // String You are already a noblesse.
        42: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        45: return
        46: aload         4
        48: new           #24                 // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
        51: dup
        52: aload         4
        54: sipush        5103
        57: iconst_1
        58: sipush        1000
        61: iconst_0
        62: invokespecial #26                 // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
        65: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        68: aload         4
        70: new           #33                 // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
        73: dup
        74: ldc           #35                 // String Congratulations! You are a Noble!
        76: sipush        8000
        79: invokespecial #37                 // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
        82: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        85: aload         4
        87: iconst_1
        88: iconst_1
        89: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setNoble:(ZZ)V
        92: aload         4
        94: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        97: sipush        7694
       100: iconst_1
       101: invokevirtual #51                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       104: pop
       105: aload         4
       107: ldc           #57                 // String You are now a Noble, Check your Skills!
       109: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       112: aload         4
       114: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       117: aload_2
       118: invokevirtual #59                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       121: iconst_1
       122: invokevirtual #65                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.destroyItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       125: pop
       126: aload         4
       128: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       131: aconst_null
       132: astore        4
       134: return
      LineNumberTable:
        line 40: 0
        line 41: 7
        line 43: 8
        line 45: 14
        line 47: 22
        line 48: 29
        line 51: 30
        line 53: 38
        line 54: 45
        line 57: 46
        line 58: 68
        line 59: 85
        line 60: 92
        line 61: 105
        line 62: 112
        line 63: 126
        line 65: 131
        line 66: 134
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     135     0  this   Lext/mods/gameserver/handler/itemhandlers/ItemNobles;
            0     135     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     135     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     135     3 forceUse   Z
           14     121     4 activeChar   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 15 /* same */
}
SourceFile: "ItemNobles.java"
