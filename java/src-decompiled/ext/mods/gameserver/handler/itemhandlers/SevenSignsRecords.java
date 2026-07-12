// Bytecode for: ext.mods.gameserver.handler.itemhandlers.SevenSignsRecords
// File: ext\mods\gameserver\handler\itemhandlers\SevenSignsRecords.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/SevenSignsRecords.class
  Last modified 9 de jul de 2026; size 1131 bytes
  MD5 checksum b72267b719c57835374cdd8b5ecb4d2d
  Compiled from "SevenSignsRecords.java"
public class ext.mods.gameserver.handler.itemhandlers.SevenSignsRecords implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #22                         // ext/mods/gameserver/handler/itemhandlers/SevenSignsRecords
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
   #9 = Class              #10            // ext/mods/gameserver/network/serverpackets/SSQStatus
  #10 = Utf8               ext/mods/gameserver/network/serverpackets/SSQStatus
  #11 = Methodref          #7.#12         // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #12 = NameAndType        #13:#14        // getObjectId:()I
  #13 = Utf8               getObjectId
  #14 = Utf8               ()I
  #15 = Methodref          #9.#16         // ext/mods/gameserver/network/serverpackets/SSQStatus."<init>":(II)V
  #16 = NameAndType        #5:#17         // "<init>":(II)V
  #17 = Utf8               (II)V
  #18 = Methodref          #7.#19         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #19 = NameAndType        #20:#21        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #20 = Utf8               sendPacket
  #21 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #22 = Class              #23            // ext/mods/gameserver/handler/itemhandlers/SevenSignsRecords
  #23 = Utf8               ext/mods/gameserver/handler/itemhandlers/SevenSignsRecords
  #24 = Class              #25            // ext/mods/gameserver/handler/IItemHandler
  #25 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #26 = Utf8               Code
  #27 = Utf8               LineNumberTable
  #28 = Utf8               LocalVariableTable
  #29 = Utf8               this
  #30 = Utf8               Lext/mods/gameserver/handler/itemhandlers/SevenSignsRecords;
  #31 = Utf8               useItem
  #32 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #33 = Utf8               player
  #34 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #35 = Utf8               playable
  #36 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #37 = Utf8               item
  #38 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #39 = Utf8               forceUse
  #40 = Utf8               Z
  #41 = Utf8               StackMapTable
  #42 = Utf8               SourceFile
  #43 = Utf8               SevenSignsRecords.java
{
  public ext.mods.gameserver.handler.itemhandlers.SevenSignsRecords();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/SevenSignsRecords;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: aload         4
        19: new           #9                  // class ext/mods/gameserver/network/serverpackets/SSQStatus
        22: dup
        23: aload         4
        25: invokevirtual #11                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        28: iconst_1
        29: invokespecial #15                 // Method ext/mods/gameserver/network/serverpackets/SSQStatus."<init>":(II)V
        32: invokevirtual #18                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        35: return
      LineNumberTable:
        line 31: 0
        line 32: 16
        line 34: 17
        line 35: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
            0      36     0  this   Lext/mods/gameserver/handler/itemhandlers/SevenSignsRecords;
            0      36     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0      36     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      36     3 forceUse   Z
           17      19     4 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
}
SourceFile: "SevenSignsRecords.java"
