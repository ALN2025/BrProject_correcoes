// Bytecode for: ext.mods.gameserver.handler.itemhandlers.SpecialXMas
// File: ext\mods\gameserver\handler\itemhandlers\SpecialXMas.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/SpecialXMas.class
  Last modified 9 de jul de 2026; size 1169 bytes
  MD5 checksum 99c0ad22c71803d5abad91f48d12d881
  Compiled from "SpecialXMas.java"
public class ext.mods.gameserver.handler.itemhandlers.SpecialXMas implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #24                         // ext/mods/gameserver/handler/itemhandlers/SpecialXMas
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
   #9 = Class              #10            // ext/mods/gameserver/network/serverpackets/ShowXMasSeal
  #10 = Utf8               ext/mods/gameserver/network/serverpackets/ShowXMasSeal
  #11 = Methodref          #12.#13        // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #12 = Class              #14            // ext/mods/gameserver/model/item/instance/ItemInstance
  #13 = NameAndType        #15:#16        // getItemId:()I
  #14 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #15 = Utf8               getItemId
  #16 = Utf8               ()I
  #17 = Methodref          #9.#18         // ext/mods/gameserver/network/serverpackets/ShowXMasSeal."<init>":(I)V
  #18 = NameAndType        #5:#19         // "<init>":(I)V
  #19 = Utf8               (I)V
  #20 = Methodref          #7.#21         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #21 = NameAndType        #22:#23        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #22 = Utf8               sendPacket
  #23 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #24 = Class              #25            // ext/mods/gameserver/handler/itemhandlers/SpecialXMas
  #25 = Utf8               ext/mods/gameserver/handler/itemhandlers/SpecialXMas
  #26 = Class              #27            // ext/mods/gameserver/handler/IItemHandler
  #27 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #28 = Utf8               Code
  #29 = Utf8               LineNumberTable
  #30 = Utf8               LocalVariableTable
  #31 = Utf8               this
  #32 = Utf8               Lext/mods/gameserver/handler/itemhandlers/SpecialXMas;
  #33 = Utf8               useItem
  #34 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #35 = Utf8               player
  #36 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #37 = Utf8               playable
  #38 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #39 = Utf8               item
  #40 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #41 = Utf8               forceUse
  #42 = Utf8               Z
  #43 = Utf8               StackMapTable
  #44 = Utf8               SourceFile
  #45 = Utf8               SpecialXMas.java
{
  public ext.mods.gameserver.handler.itemhandlers.SpecialXMas();
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
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/SpecialXMas;

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
        19: new           #9                  // class ext/mods/gameserver/network/serverpackets/ShowXMasSeal
        22: dup
        23: aload_2
        24: invokevirtual #11                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        27: invokespecial #17                 // Method ext/mods/gameserver/network/serverpackets/ShowXMasSeal."<init>":(I)V
        30: invokevirtual #20                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        33: return
      LineNumberTable:
        line 31: 0
        line 32: 16
        line 34: 17
        line 35: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
            0      34     0  this   Lext/mods/gameserver/handler/itemhandlers/SpecialXMas;
            0      34     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0      34     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      34     3 forceUse   Z
           17      17     4 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
}
SourceFile: "SpecialXMas.java"
