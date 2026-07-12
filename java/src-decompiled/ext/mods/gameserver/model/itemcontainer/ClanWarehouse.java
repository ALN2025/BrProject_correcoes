// Bytecode for: ext.mods.gameserver.model.itemcontainer.ClanWarehouse
// File: ext\mods\gameserver\model\itemcontainer\ClanWarehouse.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/ClanWarehouse.class
  Last modified 9 de jul de 2026; size 1751 bytes
  MD5 checksum 6b1752a4752baf61a42d3da13927bbb1
  Compiled from "ClanWarehouse.java"
public final class ext.mods.gameserver.model.itemcontainer.ClanWarehouse extends ext.mods.gameserver.model.itemcontainer.ItemContainer
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/itemcontainer/ClanWarehouse
  super_class: #2                         // ext/mods/gameserver/model/itemcontainer/ItemContainer
  interfaces: 0, fields: 1, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/itemcontainer/ItemContainer."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/model/itemcontainer/ItemContainer
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/itemcontainer/ClanWarehouse._clan:Lext/mods/gameserver/model/pledge/Clan;
   #8 = Class              #10            // ext/mods/gameserver/model/itemcontainer/ClanWarehouse
   #9 = NameAndType        #11:#12        // _clan:Lext/mods/gameserver/model/pledge/Clan;
  #10 = Utf8               ext/mods/gameserver/model/itemcontainer/ClanWarehouse
  #11 = Utf8               _clan
  #12 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #13 = String             #14            // ClanWarehouse
  #14 = Utf8               ClanWarehouse
  #15 = Methodref          #16.#17        // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
  #16 = Class              #18            // ext/mods/gameserver/model/pledge/Clan
  #17 = NameAndType        #19:#20        // getClanId:()I
  #18 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #19 = Utf8               getClanId
  #20 = Utf8               ()I
  #21 = Methodref          #16.#22        // ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
  #22 = NameAndType        #23:#24        // getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
  #23 = Utf8               getLeader
  #24 = Utf8               ()Lext/mods/gameserver/model/pledge/ClanMember;
  #25 = Methodref          #26.#27        // ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
  #26 = Class              #28            // ext/mods/gameserver/model/pledge/ClanMember
  #27 = NameAndType        #29:#30        // getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
  #28 = Utf8               ext/mods/gameserver/model/pledge/ClanMember
  #29 = Utf8               getPlayerInstance
  #30 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #31 = Fieldref           #32.#33        // ext/mods/gameserver/enums/items/ItemLocation.CLANWH:Lext/mods/gameserver/enums/items/ItemLocation;
  #32 = Class              #34            // ext/mods/gameserver/enums/items/ItemLocation
  #33 = NameAndType        #35:#36        // CLANWH:Lext/mods/gameserver/enums/items/ItemLocation;
  #34 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
  #35 = Utf8               CLANWH
  #36 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
  #37 = Fieldref           #8.#38         // ext/mods/gameserver/model/itemcontainer/ClanWarehouse._items:Ljava/util/Set;
  #38 = NameAndType        #39:#40        // _items:Ljava/util/Set;
  #39 = Utf8               _items
  #40 = Utf8               Ljava/util/Set;
  #41 = InterfaceMethodref #42.#43        // java/util/Set.size:()I
  #42 = Class              #44            // java/util/Set
  #43 = NameAndType        #45:#20        // size:()I
  #44 = Utf8               java/util/Set
  #45 = Utf8               size
  #46 = Fieldref           #47.#48        // ext/mods/Config.WAREHOUSE_SLOTS_CLAN:I
  #47 = Class              #49            // ext/mods/Config
  #48 = NameAndType        #50:#51        // WAREHOUSE_SLOTS_CLAN:I
  #49 = Utf8               ext/mods/Config
  #50 = Utf8               WAREHOUSE_SLOTS_CLAN
  #51 = Utf8               I
  #52 = Methodref          #8.#53         // ext/mods/gameserver/model/itemcontainer/ClanWarehouse.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #53 = NameAndType        #54:#30        // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #54 = Utf8               getOwner
  #55 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #56 = Utf8               Code
  #57 = Utf8               LineNumberTable
  #58 = Utf8               LocalVariableTable
  #59 = Utf8               this
  #60 = Utf8               Lext/mods/gameserver/model/itemcontainer/ClanWarehouse;
  #61 = Utf8               clan
  #62 = Utf8               getName
  #63 = Utf8               ()Ljava/lang/String;
  #64 = Utf8               getOwnerId
  #65 = Utf8               StackMapTable
  #66 = Utf8               getBaseLocation
  #67 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
  #68 = Utf8               validateCapacity
  #69 = Utf8               (I)Z
  #70 = Utf8               slotCount
  #71 = Utf8               ()Lext/mods/gameserver/model/actor/Playable;
  #72 = Utf8               SourceFile
  #73 = Utf8               ClanWarehouse.java
{
  public ext.mods.gameserver.model.itemcontainer.ClanWarehouse(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/itemcontainer/ItemContainer."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
         9: return
      LineNumberTable:
        line 30: 0
        line 31: 4
        line 32: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/itemcontainer/ClanWarehouse;
            0      10     1  clan   Lext/mods/gameserver/model/pledge/Clan;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #13                 // String ClanWarehouse
         2: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/model/itemcontainer/ClanWarehouse;

  public int getOwnerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
         4: invokevirtual #15                 // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
         7: ireturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/itemcontainer/ClanWarehouse;

  public ext.mods.gameserver.model.actor.Player getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
         4: invokevirtual #21                 // Method ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
         7: ifnonnull     12
        10: aconst_null
        11: areturn
        12: aload_0
        13: getfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
        16: invokevirtual #21                 // Method ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
        19: invokevirtual #25                 // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
        22: areturn
      LineNumberTable:
        line 49: 0
        line 50: 10
        line 52: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/itemcontainer/ClanWarehouse;
      StackMapTable: number_of_entries = 1
        frame_type = 12 /* same */

  public ext.mods.gameserver.enums.items.ItemLocation getBaseLocation();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #31                 // Field ext/mods/gameserver/enums/items/ItemLocation.CLANWH:Lext/mods/gameserver/enums/items/ItemLocation;
         3: areturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/itemcontainer/ClanWarehouse;

  public boolean validateCapacity(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: ifne          6
         4: iconst_1
         5: ireturn
         6: aload_0
         7: getfield      #37                 // Field _items:Ljava/util/Set;
        10: invokeinterface #41,  1           // InterfaceMethod java/util/Set.size:()I
        15: iload_1
        16: iadd
        17: getstatic     #46                 // Field ext/mods/Config.WAREHOUSE_SLOTS_CLAN:I
        20: if_icmpgt     27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 64: 0
        line 65: 4
        line 67: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/itemcontainer/ClanWarehouse;
            0      29     1 slotCount   I
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.actor.Playable getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Playable;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #52                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/ClanWarehouse;
}
SourceFile: "ClanWarehouse.java"
