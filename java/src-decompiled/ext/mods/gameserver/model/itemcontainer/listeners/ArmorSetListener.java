// Bytecode for: ext.mods.gameserver.model.itemcontainer.listeners.ArmorSetListener
// File: ext\mods\gameserver\model\itemcontainer\listeners\ArmorSetListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener.class
  Last modified 9 de jul de 2026; size 4358 bytes
  MD5 checksum d5af593c7b481fde94e1ca2d1abd69d6
  Compiled from "ArmorSetListener.java"
public class ext.mods.gameserver.model.itemcontainer.listeners.ArmorSetListener implements ext.mods.gameserver.model.itemcontainer.listeners.OnEquipListener
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #115                        // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
    #8 = Class              #10           // ext/mods/gameserver/model/item/instance/ItemInstance
    #9 = NameAndType        #11:#12       // isEquipable:()Z
   #10 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #11 = Utf8               isEquipable
   #12 = Utf8               ()Z
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Player
   #14 = Utf8               ext/mods/gameserver/model/actor/Player
   #15 = Methodref          #8.#16        // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #16 = NameAndType        #17:#18       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #17 = Utf8               getItem
   #18 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
   #20 = Class              #22           // ext/mods/gameserver/model/item/kind/Item
   #21 = NameAndType        #23:#24       // getBodyPart:()I
   #22 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #23 = Utf8               getBodyPart
   #24 = Utf8               ()I
   #25 = Integer            131072
   #26 = Class              #27           // ext/mods/gameserver/network/serverpackets/SkillList
   #27 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
   #28 = Methodref          #26.#29       // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #29 = NameAndType        #5:#30        // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #30 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #31 = Methodref          #13.#32       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #32 = NameAndType        #33:#34       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #33 = Utf8               sendPacket
   #34 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #35 = Methodref          #13.#36       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #36 = NameAndType        #37:#38       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #37 = Utf8               getInventory
   #38 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #39 = Fieldref           #40.#41       // ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
   #40 = Class              #42           // ext/mods/gameserver/enums/Paperdoll
   #41 = NameAndType        #43:#44       // CHEST:Lext/mods/gameserver/enums/Paperdoll;
   #42 = Utf8               ext/mods/gameserver/enums/Paperdoll
   #43 = Utf8               CHEST
   #44 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
   #46 = Class              #48           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #47 = NameAndType        #49:#50       // getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
   #48 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #49 = Utf8               getItemIdFrom
   #50 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)I
   #51 = Methodref          #52.#53       // ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
   #52 = Class              #54           // ext/mods/gameserver/data/xml/ArmorSetData
   #53 = NameAndType        #55:#56       // getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
   #54 = Utf8               ext/mods/gameserver/data/xml/ArmorSetData
   #55 = Utf8               getInstance
   #56 = Utf8               ()Lext/mods/gameserver/data/xml/ArmorSetData;
   #57 = Methodref          #52.#58       // ext/mods/gameserver/data/xml/ArmorSetData.getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
   #58 = NameAndType        #59:#60       // getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
   #59 = Utf8               getSet
   #60 = Utf8               (I)Lext/mods/gameserver/model/item/ArmorSet;
   #61 = Methodref          #8.#62        // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #62 = NameAndType        #63:#24       // getItemId:()I
   #63 = Utf8               getItemId
   #64 = Methodref          #65.#66       // ext/mods/gameserver/model/item/ArmorSet.containsItem:(Lext/mods/gameserver/enums/Paperdoll;I)Z
   #65 = Class              #67           // ext/mods/gameserver/model/item/ArmorSet
   #66 = NameAndType        #68:#69       // containsItem:(Lext/mods/gameserver/enums/Paperdoll;I)Z
   #67 = Utf8               ext/mods/gameserver/model/item/ArmorSet
   #68 = Utf8               containsItem
   #69 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;I)Z
   #70 = Methodref          #65.#71       // ext/mods/gameserver/model/item/ArmorSet.containsAll:(Lext/mods/gameserver/model/actor/Player;)Z
   #71 = NameAndType        #72:#73       // containsAll:(Lext/mods/gameserver/model/actor/Player;)Z
   #72 = Utf8               containsAll
   #73 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #74 = Methodref          #75.#76       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #75 = Class              #77           // ext/mods/gameserver/data/SkillTable
   #76 = NameAndType        #55:#78       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #77 = Utf8               ext/mods/gameserver/data/SkillTable
   #78 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #79 = Methodref          #65.#80       // ext/mods/gameserver/model/item/ArmorSet.getSkillId:()I
   #80 = NameAndType        #81:#24       // getSkillId:()I
   #81 = Utf8               getSkillId
   #82 = Methodref          #75.#83       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #83 = NameAndType        #84:#85       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #84 = Utf8               getInfo
   #85 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #86 = Methodref          #13.#87       // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #87 = NameAndType        #88:#89       // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #88 = Utf8               addSkill
   #89 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
   #90 = Methodref          #65.#91       // ext/mods/gameserver/model/item/ArmorSet.containsShield:(Lext/mods/gameserver/model/actor/Player;)Z
   #91 = NameAndType        #92:#73       // containsShield:(Lext/mods/gameserver/model/actor/Player;)Z
   #92 = Utf8               containsShield
   #93 = Methodref          #65.#94       // ext/mods/gameserver/model/item/ArmorSet.getShieldSkillId:()I
   #94 = NameAndType        #95:#24       // getShieldSkillId:()I
   #95 = Utf8               getShieldSkillId
   #96 = Methodref          #65.#97       // ext/mods/gameserver/model/item/ArmorSet.isEnchanted6:(Lext/mods/gameserver/model/actor/Player;)Z
   #97 = NameAndType        #98:#73       // isEnchanted6:(Lext/mods/gameserver/model/actor/Player;)Z
   #98 = Utf8               isEnchanted6
   #99 = Methodref          #65.#100      // ext/mods/gameserver/model/item/ArmorSet.getEnchant6skillId:()I
  #100 = NameAndType        #101:#24      // getEnchant6skillId:()I
  #101 = Utf8               getEnchant6skillId
  #102 = Methodref          #65.#103      // ext/mods/gameserver/model/item/ArmorSet.containsShield:(I)Z
  #103 = NameAndType        #92:#104      // containsShield:(I)Z
  #104 = Utf8               (I)Z
  #105 = Methodref          #13.#106      // ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
  #106 = NameAndType        #107:#108     // removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
  #107 = Utf8               removeSkill
  #108 = Utf8               (IZ)Lext/mods/gameserver/skills/L2Skill;
  #109 = Fieldref           #110.#111     // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
  #110 = Class              #112          // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder
  #111 = NameAndType        #113:#114     // INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
  #112 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder
  #113 = Utf8               INSTANCE
  #114 = Utf8               Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
  #115 = Class              #116          // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener
  #116 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener
  #117 = Class              #118          // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #118 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #119 = Utf8               Code
  #120 = Utf8               LineNumberTable
  #121 = Utf8               LocalVariableTable
  #122 = Utf8               this
  #123 = Utf8               onEquip
  #124 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #125 = Utf8               skills
  #126 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #127 = Utf8               skille
  #128 = Utf8               skillId
  #129 = Utf8               I
  #130 = Utf8               skill
  #131 = Utf8               slot
  #132 = Utf8               item
  #133 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #134 = Utf8               actor
  #135 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #136 = Utf8               player
  #137 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #138 = Utf8               chestId
  #139 = Utf8               armorSet
  #140 = Utf8               Lext/mods/gameserver/model/item/ArmorSet;
  #141 = Utf8               StackMapTable
  #142 = Class              #143          // ext/mods/gameserver/skills/L2Skill
  #143 = Utf8               ext/mods/gameserver/skills/L2Skill
  #144 = Utf8               onUnequip
  #145 = Utf8               remove
  #146 = Utf8               Z
  #147 = Utf8               removeSkillId1
  #148 = Utf8               removeSkillId2
  #149 = Utf8               removeSkillId3
  #150 = Class              #151          // ext/mods/gameserver/model/actor/Playable
  #151 = Utf8               ext/mods/gameserver/model/actor/Playable
  #152 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
  #153 = Utf8               SourceFile
  #154 = Utf8               ArmorSetListener.java
  #155 = Utf8               NestMembers
  #156 = Utf8               InnerClasses
  #157 = Utf8               SingletonHolder
{
  public ext.mods.gameserver.model.itemcontainer.listeners.ArmorSetListener();
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
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;

  public void onEquip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=4
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
         4: ifne          8
         7: return
         8: aload_3
         9: checkcast     #13                 // class ext/mods/gameserver/model/actor/Player
        12: astore        4
        14: aload_2
        15: invokevirtual #15                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        18: invokevirtual #19                 // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
        21: ldc           #25                 // int 131072
        23: if_icmpne     41
        26: aload         4
        28: new           #26                 // class ext/mods/gameserver/network/serverpackets/SkillList
        31: dup
        32: aload         4
        34: invokespecial #28                 // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        37: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        40: return
        41: aload         4
        43: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        46: getstatic     #39                 // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
        49: invokevirtual #45                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
        52: istore        5
        54: iload         5
        56: ifne          60
        59: return
        60: invokestatic  #51                 // Method ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
        63: iload         5
        65: invokevirtual #57                 // Method ext/mods/gameserver/data/xml/ArmorSetData.getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
        68: astore        6
        70: aload         6
        72: ifnonnull     76
        75: return
        76: aload         6
        78: aload_1
        79: aload_2
        80: invokevirtual #61                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        83: invokevirtual #64                 // Method ext/mods/gameserver/model/item/ArmorSet.containsItem:(Lext/mods/gameserver/enums/Paperdoll;I)Z
        86: ifeq          274
        89: aload         6
        91: aload         4
        93: invokevirtual #70                 // Method ext/mods/gameserver/model/item/ArmorSet.containsAll:(Lext/mods/gameserver/model/actor/Player;)Z
        96: ifeq          338
        99: invokestatic  #74                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       102: aload         6
       104: invokevirtual #79                 // Method ext/mods/gameserver/model/item/ArmorSet.getSkillId:()I
       107: iconst_1
       108: invokevirtual #82                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       111: astore        7
       113: aload         7
       115: ifnull        158
       118: aload         4
       120: invokestatic  #74                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       123: sipush        3006
       126: iconst_1
       127: invokevirtual #82                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       130: iconst_0
       131: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       134: pop
       135: aload         4
       137: aload         7
       139: iconst_0
       140: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       143: pop
       144: aload         4
       146: new           #26                 // class ext/mods/gameserver/network/serverpackets/SkillList
       149: dup
       150: aload         4
       152: invokespecial #28                 // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       155: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       158: aload         6
       160: aload         4
       162: invokevirtual #90                 // Method ext/mods/gameserver/model/item/ArmorSet.containsShield:(Lext/mods/gameserver/model/actor/Player;)Z
       165: ifeq          210
       168: invokestatic  #74                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       171: aload         6
       173: invokevirtual #93                 // Method ext/mods/gameserver/model/item/ArmorSet.getShieldSkillId:()I
       176: iconst_1
       177: invokevirtual #82                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       180: astore        8
       182: aload         8
       184: ifnull        210
       187: aload         4
       189: aload         8
       191: iconst_0
       192: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       195: pop
       196: aload         4
       198: new           #26                 // class ext/mods/gameserver/network/serverpackets/SkillList
       201: dup
       202: aload         4
       204: invokespecial #28                 // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       207: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       210: aload         6
       212: aload         4
       214: invokevirtual #96                 // Method ext/mods/gameserver/model/item/ArmorSet.isEnchanted6:(Lext/mods/gameserver/model/actor/Player;)Z
       217: ifeq          271
       220: aload         6
       222: invokevirtual #99                 // Method ext/mods/gameserver/model/item/ArmorSet.getEnchant6skillId:()I
       225: istore        8
       227: iload         8
       229: ifle          271
       232: invokestatic  #74                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       235: iload         8
       237: iconst_1
       238: invokevirtual #82                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       241: astore        9
       243: aload         9
       245: ifnull        271
       248: aload         4
       250: aload         9
       252: iconst_0
       253: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       256: pop
       257: aload         4
       259: new           #26                 // class ext/mods/gameserver/network/serverpackets/SkillList
       262: dup
       263: aload         4
       265: invokespecial #28                 // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       268: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       271: goto          338
       274: aload         6
       276: aload_2
       277: invokevirtual #61                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       280: invokevirtual #102                // Method ext/mods/gameserver/model/item/ArmorSet.containsShield:(I)Z
       283: ifeq          338
       286: aload         6
       288: aload         4
       290: invokevirtual #70                 // Method ext/mods/gameserver/model/item/ArmorSet.containsAll:(Lext/mods/gameserver/model/actor/Player;)Z
       293: ifeq          338
       296: invokestatic  #74                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       299: aload         6
       301: invokevirtual #93                 // Method ext/mods/gameserver/model/item/ArmorSet.getShieldSkillId:()I
       304: iconst_1
       305: invokevirtual #82                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       308: astore        7
       310: aload         7
       312: ifnull        338
       315: aload         4
       317: aload         7
       319: iconst_0
       320: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       323: pop
       324: aload         4
       326: new           #26                 // class ext/mods/gameserver/network/serverpackets/SkillList
       329: dup
       330: aload         4
       332: invokespecial #28                 // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       335: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       338: return
      LineNumberTable:
        line 36: 0
        line 37: 7
        line 39: 8
        line 41: 14
        line 43: 26
        line 44: 40
        line 47: 41
        line 48: 54
        line 49: 59
        line 51: 60
        line 52: 70
        line 53: 75
        line 55: 76
        line 57: 89
        line 59: 99
        line 60: 113
        line 62: 118
        line 63: 135
        line 64: 144
        line 67: 158
        line 69: 168
        line 70: 182
        line 72: 187
        line 73: 196
        line 77: 210
        line 79: 220
        line 80: 227
        line 82: 232
        line 83: 243
        line 85: 248
        line 86: 257
        line 90: 271
        line 92: 274
        line 94: 296
        line 95: 310
        line 97: 315
        line 98: 324
        line 101: 338
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          182      28     8 skills   Lext/mods/gameserver/skills/L2Skill;
          243      28     9 skille   Lext/mods/gameserver/skills/L2Skill;
          227      44     8 skillId   I
          113     158     7 skill   Lext/mods/gameserver/skills/L2Skill;
          310      28     7 skills   Lext/mods/gameserver/skills/L2Skill;
            0     339     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
            0     339     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0     339     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     339     3 actor   Lext/mods/gameserver/model/actor/Playable;
           14     325     4 player   Lext/mods/gameserver/model/actor/Player;
           54     285     5 chestId   I
           70     269     6 armorSet   Lext/mods/gameserver/model/item/ArmorSet;
      StackMapTable: number_of_entries = 9
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/item/ArmorSet ]
        frame_type = 252 /* append */
          offset_delta = 81
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 51 /* same */
        frame_type = 250 /* chop */
          offset_delta = 60
        frame_type = 2 /* same */
        frame_type = 63 /* same */

  public void onUnequip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=4
         0: aload_3
         1: checkcast     #13                 // class ext/mods/gameserver/model/actor/Player
         4: astore        4
         6: aload_2
         7: invokevirtual #15                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        10: invokevirtual #19                 // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
        13: ldc           #25                 // int 131072
        15: if_icmpne     33
        18: aload         4
        20: new           #26                 // class ext/mods/gameserver/network/serverpackets/SkillList
        23: dup
        24: aload         4
        26: invokespecial #28                 // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        29: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        32: return
        33: iconst_0
        34: istore        5
        36: iconst_0
        37: istore        6
        39: iconst_0
        40: istore        7
        42: iconst_0
        43: istore        8
        45: aload_1
        46: getstatic     #39                 // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
        49: if_acmpne     97
        52: invokestatic  #51                 // Method ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
        55: aload_2
        56: invokevirtual #61                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        59: invokevirtual #57                 // Method ext/mods/gameserver/data/xml/ArmorSetData.getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
        62: astore        9
        64: aload         9
        66: ifnonnull     70
        69: return
        70: iconst_1
        71: istore        5
        73: aload         9
        75: invokevirtual #79                 // Method ext/mods/gameserver/model/item/ArmorSet.getSkillId:()I
        78: istore        6
        80: aload         9
        82: invokevirtual #93                 // Method ext/mods/gameserver/model/item/ArmorSet.getShieldSkillId:()I
        85: istore        7
        87: aload         9
        89: invokevirtual #99                 // Method ext/mods/gameserver/model/item/ArmorSet.getEnchant6skillId:()I
        92: istore        8
        94: goto          194
        97: aload         4
        99: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       102: getstatic     #39                 // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       105: invokevirtual #45                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
       108: istore        9
       110: iload         9
       112: ifne          116
       115: return
       116: invokestatic  #51                 // Method ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
       119: iload         9
       121: invokevirtual #57                 // Method ext/mods/gameserver/data/xml/ArmorSetData.getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
       124: astore        10
       126: aload         10
       128: ifnonnull     132
       131: return
       132: aload         10
       134: aload_1
       135: aload_2
       136: invokevirtual #61                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       139: invokevirtual #64                 // Method ext/mods/gameserver/model/item/ArmorSet.containsItem:(Lext/mods/gameserver/enums/Paperdoll;I)Z
       142: ifeq          172
       145: iconst_1
       146: istore        5
       148: aload         10
       150: invokevirtual #79                 // Method ext/mods/gameserver/model/item/ArmorSet.getSkillId:()I
       153: istore        6
       155: aload         10
       157: invokevirtual #93                 // Method ext/mods/gameserver/model/item/ArmorSet.getShieldSkillId:()I
       160: istore        7
       162: aload         10
       164: invokevirtual #99                 // Method ext/mods/gameserver/model/item/ArmorSet.getEnchant6skillId:()I
       167: istore        8
       169: goto          194
       172: aload         10
       174: aload_2
       175: invokevirtual #61                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       178: invokevirtual #102                // Method ext/mods/gameserver/model/item/ArmorSet.containsShield:(I)Z
       181: ifeq          194
       184: iconst_1
       185: istore        5
       187: aload         10
       189: invokevirtual #93                 // Method ext/mods/gameserver/model/item/ArmorSet.getShieldSkillId:()I
       192: istore        7
       194: iload         5
       196: ifeq          265
       199: iload         6
       201: ifeq          223
       204: aload         4
       206: sipush        3006
       209: iconst_0
       210: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       213: pop
       214: aload         4
       216: iload         6
       218: iconst_0
       219: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       222: pop
       223: iload         7
       225: ifeq          237
       228: aload         4
       230: iload         7
       232: iconst_0
       233: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       236: pop
       237: iload         8
       239: ifeq          251
       242: aload         4
       244: iload         8
       246: iconst_0
       247: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       250: pop
       251: aload         4
       253: new           #26                 // class ext/mods/gameserver/network/serverpackets/SkillList
       256: dup
       257: aload         4
       259: invokespecial #28                 // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       262: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       265: return
      LineNumberTable:
        line 106: 0
        line 108: 6
        line 110: 18
        line 111: 32
        line 114: 33
        line 115: 36
        line 116: 39
        line 117: 42
        line 119: 45
        line 121: 52
        line 122: 64
        line 123: 69
        line 125: 70
        line 126: 73
        line 127: 80
        line 128: 87
        line 129: 94
        line 132: 97
        line 133: 110
        line 134: 115
        line 136: 116
        line 137: 126
        line 138: 131
        line 140: 132
        line 142: 145
        line 143: 148
        line 144: 155
        line 145: 162
        line 147: 172
        line 149: 184
        line 150: 187
        line 154: 194
        line 156: 199
        line 158: 204
        line 159: 214
        line 162: 223
        line 163: 228
        line 165: 237
        line 166: 242
        line 168: 251
        line 170: 265
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64      30     9 armorSet   Lext/mods/gameserver/model/item/ArmorSet;
          110      84     9 chestId   I
          126      68    10 armorSet   Lext/mods/gameserver/model/item/ArmorSet;
            0     266     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
            0     266     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0     266     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     266     3 actor   Lext/mods/gameserver/model/actor/Playable;
            6     260     4 player   Lext/mods/gameserver/model/actor/Player;
           36     230     5 remove   Z
           39     227     6 removeSkillId1   I
           42     224     7 removeSkillId2   I
           45     221     8 removeSkillId3   I
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, int, int, int, int, class ext/mods/gameserver/model/item/ArmorSet ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 26
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/item/ArmorSet ]
        frame_type = 39 /* same */
        frame_type = 249 /* chop */
          offset_delta = 21
        frame_type = 28 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */

  public static final ext.mods.gameserver.model.itemcontainer.listeners.ArmorSetListener getInstance();
    descriptor: ()Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #109                // Field ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
         3: areturn
      LineNumberTable:
        line 174: 0
}
SourceFile: "ArmorSetListener.java"
NestMembers:
  ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder
