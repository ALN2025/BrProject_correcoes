// Bytecode for: ext.mods.gameserver.handler.itemhandlers.FishShots
// File: ext\mods\gameserver\handler\itemhandlers\FishShots.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/FishShots.class
  Last modified 9 de jul de 2026; size 2858 bytes
  MD5 checksum 14f6d60d87246887bee38ec13e04a07c
  Compiled from "FishShots.java"
public class ext.mods.gameserver.handler.itemhandlers.FishShots implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #95                         // ext/mods/gameserver/handler/itemhandlers/FishShots
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
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Player.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #10 = NameAndType        #11:#12       // getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #11 = Utf8               getActiveWeaponInstance
   #12 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #13 = Methodref          #7.#14        // ext/mods/gameserver/model/actor/Player.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
   #14 = NameAndType        #15:#16       // getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
   #15 = Utf8               getActiveWeaponItem
   #16 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
   #18 = Class              #20           // ext/mods/gameserver/model/item/kind/Weapon
   #19 = NameAndType        #21:#22       // getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
   #20 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
   #21 = Utf8               getItemType
   #22 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
   #23 = Fieldref           #24.#25       // ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
   #24 = Class              #26           // ext/mods/gameserver/enums/items/WeaponType
   #25 = NameAndType        #27:#28       // FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
   #26 = Utf8               ext/mods/gameserver/enums/items/WeaponType
   #27 = Utf8               FISHINGROD
   #28 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
   #29 = Fieldref           #30.#31       // ext/mods/gameserver/enums/items/ShotType.FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #30 = Class              #32           // ext/mods/gameserver/enums/items/ShotType
   #31 = NameAndType        #33:#34       // FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #32 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #33 = Utf8               FISH_SOULSHOT
   #34 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #35 = Methodref          #7.#36        // ext/mods/gameserver/model/actor/Player.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #36 = NameAndType        #37:#38       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #37 = Utf8               isChargedShot
   #38 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #39 = Methodref          #18.#40       // ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #40 = NameAndType        #41:#42       // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #41 = Utf8               getCrystalType
   #42 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #44 = Class              #46           // ext/mods/gameserver/model/item/instance/ItemInstance
   #45 = NameAndType        #47:#48       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #46 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #47 = Utf8               getItem
   #48 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #49 = Methodref          #50.#40       // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #50 = Class              #51           // ext/mods/gameserver/model/item/kind/Item
   #51 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #52 = Fieldref           #53.#54       // ext/mods/gameserver/network/SystemMessageId.WRONG_FISHINGSHOT_GRADE:Lext/mods/gameserver/network/SystemMessageId;
   #53 = Class              #55           // ext/mods/gameserver/network/SystemMessageId
   #54 = NameAndType        #56:#57       // WRONG_FISHINGSHOT_GRADE:Lext/mods/gameserver/network/SystemMessageId;
   #55 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #56 = Utf8               WRONG_FISHINGSHOT_GRADE
   #57 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #58 = Methodref          #7.#59        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #59 = NameAndType        #60:#61       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #60 = Utf8               sendPacket
   #61 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #62 = Methodref          #44.#63       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #63 = NameAndType        #64:#65       // getObjectId:()I
   #64 = Utf8               getObjectId
   #65 = Utf8               ()I
   #66 = Methodref          #7.#67        // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
   #67 = NameAndType        #68:#69       // destroyItem:(IIZ)Z
   #68 = Utf8               destroyItem
   #69 = Utf8               (IIZ)Z
   #70 = Fieldref           #53.#71       // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SOULSHOTS:Lext/mods/gameserver/network/SystemMessageId;
   #71 = NameAndType        #72:#57       // NOT_ENOUGH_SOULSHOTS:Lext/mods/gameserver/network/SystemMessageId;
   #72 = Utf8               NOT_ENOUGH_SOULSHOTS
   #73 = Methodref          #50.#74       // ext/mods/gameserver/model/item/kind/Item.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #74 = NameAndType        #75:#76       // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #75 = Utf8               getSkills
   #76 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #77 = Methodref          #7.#78        // ext/mods/gameserver/model/actor/Player.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
   #78 = NameAndType        #79:#80       // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
   #79 = Utf8               setChargedShot
   #80 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
   #81 = Class              #82           // ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #82 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
   #84 = Class              #86           // ext/mods/gameserver/model/holder/IntIntHolder
   #85 = NameAndType        #87:#65       // getId:()I
   #86 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #87 = Utf8               getId
   #88 = Methodref          #81.#89       // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
   #89 = NameAndType        #5:#90        // "<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
   #90 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIII)V
   #91 = Methodref          #7.#92        // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = NameAndType        #93:#94       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #93 = Utf8               broadcastPacket
   #94 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #95 = Class              #96           // ext/mods/gameserver/handler/itemhandlers/FishShots
   #96 = Utf8               ext/mods/gameserver/handler/itemhandlers/FishShots
   #97 = Class              #98           // ext/mods/gameserver/handler/IItemHandler
   #98 = Utf8               ext/mods/gameserver/handler/IItemHandler
   #99 = Utf8               Code
  #100 = Utf8               LineNumberTable
  #101 = Utf8               LocalVariableTable
  #102 = Utf8               this
  #103 = Utf8               Lext/mods/gameserver/handler/itemhandlers/FishShots;
  #104 = Utf8               useItem
  #105 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #106 = Utf8               player
  #107 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #108 = Utf8               playable
  #109 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #110 = Utf8               item
  #111 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #112 = Utf8               forceUse
  #113 = Utf8               Z
  #114 = Utf8               weaponInst
  #115 = Utf8               weaponItem
  #116 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #117 = Utf8               skills
  #118 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #119 = Utf8               StackMapTable
  #120 = Utf8               SourceFile
  #121 = Utf8               FishShots.java
{
  public ext.mods.gameserver.handler.itemhandlers.FishShots();
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
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/FishShots;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=8, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: aload         4
        19: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        22: astore        5
        24: aload         4
        26: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
        29: astore        6
        31: aload         5
        33: ifnull        47
        36: aload         6
        38: invokevirtual #17                 // Method ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
        41: getstatic     #23                 // Field ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
        44: if_acmpeq     48
        47: return
        48: aload         4
        50: getstatic     #29                 // Field ext/mods/gameserver/enums/items/ShotType.FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        53: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        56: ifeq          60
        59: return
        60: aload         6
        62: invokevirtual #39                 // Method ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        65: aload_2
        66: invokevirtual #43                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        69: invokevirtual #49                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        72: if_acmpeq     84
        75: aload         4
        77: getstatic     #52                 // Field ext/mods/gameserver/network/SystemMessageId.WRONG_FISHINGSHOT_GRADE:Lext/mods/gameserver/network/SystemMessageId;
        80: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        83: return
        84: aload         4
        86: aload_2
        87: invokevirtual #62                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        90: iconst_1
        91: iconst_0
        92: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
        95: ifne          107
        98: aload         4
       100: getstatic     #70                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SOULSHOTS:Lext/mods/gameserver/network/SystemMessageId;
       103: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       106: return
       107: aload_2
       108: invokevirtual #43                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       111: invokevirtual #73                 // Method ext/mods/gameserver/model/item/kind/Item.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       114: astore        7
       116: aload         4
       118: getstatic     #29                 // Field ext/mods/gameserver/enums/items/ShotType.FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       121: iconst_1
       122: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       125: aload         4
       127: new           #81                 // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       130: dup
       131: aload         4
       133: aload         7
       135: iconst_0
       136: aaload
       137: invokevirtual #83                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       140: iconst_1
       141: iconst_0
       142: iconst_0
       143: invokespecial #88                 // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
       146: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       149: return
      LineNumberTable:
        line 36: 0
        line 37: 16
        line 39: 17
        line 40: 24
        line 42: 31
        line 43: 47
        line 45: 48
        line 46: 59
        line 48: 60
        line 50: 75
        line 51: 83
        line 54: 84
        line 56: 98
        line 57: 106
        line 60: 107
        line 62: 116
        line 63: 125
        line 64: 149
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
            0     150     0  this   Lext/mods/gameserver/handler/itemhandlers/FishShots;
            0     150     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     150     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     150     3 forceUse   Z
           17     133     4 player   Lext/mods/gameserver/model/actor/Player;
           24     126     5 weaponInst   Lext/mods/gameserver/model/item/instance/ItemInstance;
           31     119     6 weaponItem   Lext/mods/gameserver/model/item/kind/Weapon;
          116      34     7 skills   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 7
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Weapon ]
        frame_type = 0 /* same */
        frame_type = 11 /* same */
        frame_type = 23 /* same */
        frame_type = 22 /* same */
}
SourceFile: "FishShots.java"
