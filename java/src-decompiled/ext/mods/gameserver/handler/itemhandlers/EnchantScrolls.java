// Bytecode for: ext.mods.gameserver.handler.itemhandlers.EnchantScrolls
// File: ext\mods\gameserver\handler\itemhandlers\EnchantScrolls.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/EnchantScrolls.class
  Last modified 9 de jul de 2026; size 1598 bytes
  MD5 checksum b73138b20fd2d20cfd332e8e03ccd018
  Compiled from "EnchantScrolls.java"
public class ext.mods.gameserver.handler.itemhandlers.EnchantScrolls implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #41                         // ext/mods/gameserver/handler/itemhandlers/EnchantScrolls
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
   #9 = Methodref          #7.#10         // ext/mods/gameserver/model/actor/Player.getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #10 = NameAndType        #11:#12        // getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #11 = Utf8               getActiveEnchantItem
  #12 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/network/SystemMessageId.SELECT_ITEM_TO_ENCHANT:Lext/mods/gameserver/network/SystemMessageId;
  #14 = Class              #16            // ext/mods/gameserver/network/SystemMessageId
  #15 = NameAndType        #17:#18        // SELECT_ITEM_TO_ENCHANT:Lext/mods/gameserver/network/SystemMessageId;
  #16 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #17 = Utf8               SELECT_ITEM_TO_ENCHANT
  #18 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #19 = Methodref          #7.#20         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #20 = NameAndType        #21:#22        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #21 = Utf8               sendPacket
  #22 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #23 = Methodref          #7.#24         // ext/mods/gameserver/model/actor/Player.setActiveEnchantItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #24 = NameAndType        #25:#26        // setActiveEnchantItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #25 = Utf8               setActiveEnchantItem
  #26 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #27 = Class              #28            // ext/mods/gameserver/network/serverpackets/ChooseInventoryItem
  #28 = Utf8               ext/mods/gameserver/network/serverpackets/ChooseInventoryItem
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #30 = Class              #32            // ext/mods/gameserver/model/item/instance/ItemInstance
  #31 = NameAndType        #33:#34        // getItemId:()I
  #32 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #33 = Utf8               getItemId
  #34 = Utf8               ()I
  #35 = Methodref          #27.#36        // ext/mods/gameserver/network/serverpackets/ChooseInventoryItem."<init>":(I)V
  #36 = NameAndType        #5:#37         // "<init>":(I)V
  #37 = Utf8               (I)V
  #38 = Methodref          #7.#39         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #39 = NameAndType        #21:#40        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #40 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #41 = Class              #42            // ext/mods/gameserver/handler/itemhandlers/EnchantScrolls
  #42 = Utf8               ext/mods/gameserver/handler/itemhandlers/EnchantScrolls
  #43 = Class              #44            // ext/mods/gameserver/handler/IItemHandler
  #44 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #45 = Utf8               Code
  #46 = Utf8               LineNumberTable
  #47 = Utf8               LocalVariableTable
  #48 = Utf8               this
  #49 = Utf8               Lext/mods/gameserver/handler/itemhandlers/EnchantScrolls;
  #50 = Utf8               useItem
  #51 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #52 = Utf8               player
  #53 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #54 = Utf8               playable
  #55 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #56 = Utf8               item
  #57 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #58 = Utf8               forceUse
  #59 = Utf8               Z
  #60 = Utf8               StackMapTable
  #61 = Utf8               SourceFile
  #62 = Utf8               EnchantScrolls.java
{
  public ext.mods.gameserver.handler.itemhandlers.EnchantScrolls();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/EnchantScrolls;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: aload         4
        19: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        22: ifnonnull     33
        25: aload         4
        27: getstatic     #13                 // Field ext/mods/gameserver/network/SystemMessageId.SELECT_ITEM_TO_ENCHANT:Lext/mods/gameserver/network/SystemMessageId;
        30: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        33: aload         4
        35: aload_2
        36: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.setActiveEnchantItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        39: aload         4
        41: new           #27                 // class ext/mods/gameserver/network/serverpackets/ChooseInventoryItem
        44: dup
        45: aload_2
        46: invokevirtual #29                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        49: invokespecial #35                 // Method ext/mods/gameserver/network/serverpackets/ChooseInventoryItem."<init>":(I)V
        52: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        55: return
      LineNumberTable:
        line 32: 0
        line 33: 16
        line 35: 17
        line 36: 25
        line 38: 33
        line 39: 39
        line 40: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
            0      56     0  this   Lext/mods/gameserver/handler/itemhandlers/EnchantScrolls;
            0      56     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0      56     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      56     3 forceUse   Z
           17      39     4 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 15 /* same */
}
SourceFile: "EnchantScrolls.java"
