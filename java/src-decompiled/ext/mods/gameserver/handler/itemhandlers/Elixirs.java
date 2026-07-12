// Bytecode for: ext.mods.gameserver.handler.itemhandlers.Elixirs
// File: ext\mods\gameserver\handler\itemhandlers\Elixirs.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/Elixirs.class
  Last modified 9 de jul de 2026; size 1279 bytes
  MD5 checksum 52601ca793e8a8df0adab873bb21863a
  Compiled from "Elixirs.java"
public class ext.mods.gameserver.handler.itemhandlers.Elixirs extends ext.mods.gameserver.handler.itemhandlers.ItemSkills
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #31                         // ext/mods/gameserver/handler/itemhandlers/Elixirs
  super_class: #2                         // ext/mods/gameserver/handler/itemhandlers/ItemSkills
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/handler/itemhandlers/ItemSkills."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/handler/itemhandlers/ItemSkills
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/handler/itemhandlers/ItemSkills
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Player
   #8 = Utf8               ext/mods/gameserver/model/actor/Player
   #9 = Fieldref           #10.#11        // ext/mods/gameserver/network/SystemMessageId.ITEM_NOT_FOR_PETS:Lext/mods/gameserver/network/SystemMessageId;
  #10 = Class              #12            // ext/mods/gameserver/network/SystemMessageId
  #11 = NameAndType        #13:#14        // ITEM_NOT_FOR_PETS:Lext/mods/gameserver/network/SystemMessageId;
  #12 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #13 = Utf8               ITEM_NOT_FOR_PETS
  #14 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #15 = Methodref          #16.#17        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #16 = Class              #18            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #17 = NameAndType        #19:#20        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #18 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #19 = Utf8               getSystemMessage
  #20 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #21 = Methodref          #22.#23        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #22 = Class              #24            // ext/mods/gameserver/model/actor/Playable
  #23 = NameAndType        #25:#26        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #24 = Utf8               ext/mods/gameserver/model/actor/Playable
  #25 = Utf8               sendPacket
  #26 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #27 = Methodref          #2.#28         // ext/mods/gameserver/handler/itemhandlers/ItemSkills.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #28 = NameAndType        #29:#30        // useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #29 = Utf8               useItem
  #30 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #31 = Class              #32            // ext/mods/gameserver/handler/itemhandlers/Elixirs
  #32 = Utf8               ext/mods/gameserver/handler/itemhandlers/Elixirs
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               this
  #37 = Utf8               Lext/mods/gameserver/handler/itemhandlers/Elixirs;
  #38 = Utf8               playable
  #39 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #40 = Utf8               item
  #41 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #42 = Utf8               forceUse
  #43 = Utf8               Z
  #44 = Utf8               StackMapTable
  #45 = Utf8               SourceFile
  #46 = Utf8               Elixirs.java
{
  public ext.mods.gameserver.handler.itemhandlers.Elixirs();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/handler/itemhandlers/ItemSkills."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/Elixirs;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifne          18
         7: aload_1
         8: getstatic     #9                  // Field ext/mods/gameserver/network/SystemMessageId.ITEM_NOT_FOR_PETS:Lext/mods/gameserver/network/SystemMessageId;
        11: invokestatic  #15                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        14: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        17: return
        18: aload_0
        19: aload_1
        20: aload_2
        21: iload_3
        22: invokespecial #27                 // Method ext/mods/gameserver/handler/itemhandlers/ItemSkills.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
        25: return
      LineNumberTable:
        line 31: 0
        line 33: 7
        line 34: 17
        line 36: 18
        line 37: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/handler/itemhandlers/Elixirs;
            0      26     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0      26     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      26     3 forceUse   Z
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */
}
SourceFile: "Elixirs.java"
