// Bytecode for: ext.mods.gameserver.model.itemcontainer.listeners.ItemPassiveSkillsListener
// File: ext\mods\gameserver\model\itemcontainer\listeners\ItemPassiveSkillsListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener.class
  Last modified 9 de jul de 2026; size 5391 bytes
  MD5 checksum b597e2dc88fc036cd524f92c34cb8a79
  Compiled from "ItemPassiveSkillsListener.java"
public class ext.mods.gameserver.model.itemcontainer.listeners.ItemPassiveSkillsListener implements ext.mods.gameserver.model.itemcontainer.listeners.OnEquipListener
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #161                        // ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #10.#11       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #10 = Class              #12           // ext/mods/gameserver/model/item/instance/ItemInstance
   #11 = NameAndType        #13:#14       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #12 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #13 = Utf8               getItem
   #14 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #15 = Class              #16           // ext/mods/gameserver/model/item/kind/Weapon
   #16 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
   #17 = Methodref          #10.#18       // ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
   #18 = NameAndType        #19:#20       // isAugmented:()Z
   #19 = Utf8               isAugmented
   #20 = Utf8               ()Z
   #21 = Methodref          #10.#22       // ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
   #22 = NameAndType        #23:#24       // getAugmentation:()Lext/mods/gameserver/model/Augmentation;
   #23 = Utf8               getAugmentation
   #24 = Utf8               ()Lext/mods/gameserver/model/Augmentation;
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/Augmentation.applyBonus:(Lext/mods/gameserver/model/actor/Player;)V
   #26 = Class              #28           // ext/mods/gameserver/model/Augmentation
   #27 = NameAndType        #29:#30       // applyBonus:(Lext/mods/gameserver/model/actor/Player;)V
   #28 = Utf8               ext/mods/gameserver/model/Augmentation
   #29 = Utf8               applyBonus
   #30 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #31 = Class              #32           // ext/mods/gameserver/skills/L2Skill
   #32 = Utf8               ext/mods/gameserver/skills/L2Skill
   #33 = Methodref          #7.#34        // ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
   #34 = NameAndType        #35:#36       // getSkillLevel:(I)I
   #35 = Utf8               getSkillLevel
   #36 = Utf8               (I)I
   #37 = Methodref          #15.#38       // ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #38 = NameAndType        #39:#40       // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #39 = Utf8               getCrystalType
   #40 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
   #41 = Methodref          #42.#43       // ext/mods/gameserver/enums/items/CrystalType.getId:()I
   #42 = Class              #44           // ext/mods/gameserver/enums/items/CrystalType
   #43 = NameAndType        #45:#46       // getId:()I
   #44 = Utf8               ext/mods/gameserver/enums/items/CrystalType
   #45 = Utf8               getId
   #46 = Utf8               ()I
   #47 = Methodref          #10.#48       // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #48 = NameAndType        #49:#46       // getEnchantLevel:()I
   #49 = Utf8               getEnchantLevel
   #50 = Methodref          #15.#51       // ext/mods/gameserver/model/item/kind/Weapon.getEnchant4Skill:()Lext/mods/gameserver/skills/L2Skill;
   #51 = NameAndType        #52:#53       // getEnchant4Skill:()Lext/mods/gameserver/skills/L2Skill;
   #52 = Utf8               getEnchant4Skill
   #53 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #54 = Methodref          #7.#55        // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #55 = NameAndType        #56:#57       // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #56 = Utf8               addSkill
   #57 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
   #58 = Methodref          #59.#60       // ext/mods/gameserver/model/item/kind/Item.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #59 = Class              #61           // ext/mods/gameserver/model/item/kind/Item
   #60 = NameAndType        #62:#63       // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #61 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #62 = Utf8               getSkills
   #63 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #64 = Methodref          #65.#66       // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #65 = Class              #67           // ext/mods/gameserver/model/holder/IntIntHolder
   #66 = NameAndType        #68:#53       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #67 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #68 = Utf8               getSkill
   #69 = Methodref          #31.#70       // ext/mods/gameserver/skills/L2Skill.isActive:()Z
   #70 = NameAndType        #71:#20       // isActive:()Z
   #71 = Utf8               isActive
   #72 = Methodref          #7.#73        // ext/mods/gameserver/model/actor/Player.getReuseTimeStamp:()Ljava/util/Map;
   #73 = NameAndType        #74:#75       // getReuseTimeStamp:()Ljava/util/Map;
   #74 = Utf8               getReuseTimeStamp
   #75 = Utf8               ()Ljava/util/Map;
   #76 = Methodref          #31.#77       // ext/mods/gameserver/skills/L2Skill.getReuseHashCode:()I
   #77 = NameAndType        #78:#46       // getReuseHashCode:()I
   #78 = Utf8               getReuseHashCode
   #79 = Methodref          #80.#81       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #80 = Class              #82           // java/lang/Integer
   #81 = NameAndType        #83:#84       // valueOf:(I)Ljava/lang/Integer;
   #82 = Utf8               java/lang/Integer
   #83 = Utf8               valueOf
   #84 = Utf8               (I)Ljava/lang/Integer;
   #85 = InterfaceMethodref #86.#87       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #86 = Class              #88           // java/util/Map
   #87 = NameAndType        #89:#90       // containsKey:(Ljava/lang/Object;)Z
   #88 = Utf8               java/util/Map
   #89 = Utf8               containsKey
   #90 = Utf8               (Ljava/lang/Object;)Z
   #91 = Methodref          #31.#92       // ext/mods/gameserver/skills/L2Skill.getEquipDelay:()I
   #92 = NameAndType        #93:#46       // getEquipDelay:()I
   #93 = Utf8               getEquipDelay
   #94 = Methodref          #7.#95        // ext/mods/gameserver/model/actor/Player.addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
   #95 = NameAndType        #96:#97       // addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
   #96 = Utf8               addTimeStamp
   #97 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
   #98 = Methodref          #7.#99        // ext/mods/gameserver/model/actor/Player.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
   #99 = NameAndType        #100:#97      // disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
  #100 = Utf8               disableSkill
  #101 = Class              #102          // ext/mods/gameserver/network/serverpackets/SkillList
  #102 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
  #103 = Methodref          #101.#104     // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #104 = NameAndType        #5:#30        // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #105 = Methodref          #7.#106       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #106 = NameAndType        #107:#108     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #107 = Utf8               sendPacket
  #108 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #109 = Class              #110          // ext/mods/gameserver/network/serverpackets/SkillCoolTime
  #110 = Utf8               ext/mods/gameserver/network/serverpackets/SkillCoolTime
  #111 = Methodref          #109.#104     // ext/mods/gameserver/network/serverpackets/SkillCoolTime."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #112 = Methodref          #26.#113      // ext/mods/gameserver/model/Augmentation.removeBonus:(Lext/mods/gameserver/model/actor/Player;)V
  #113 = NameAndType        #114:#30      // removeBonus:(Lext/mods/gameserver/model/actor/Player;)V
  #114 = Utf8               removeBonus
  #115 = Methodref          #31.#43       // ext/mods/gameserver/skills/L2Skill.getId:()I
  #116 = Methodref          #31.#117      // ext/mods/gameserver/skills/L2Skill.isPassive:()Z
  #117 = NameAndType        #118:#20      // isPassive:()Z
  #118 = Utf8               isPassive
  #119 = Methodref          #31.#120      // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #120 = NameAndType        #121:#20      // isToggle:()Z
  #121 = Utf8               isToggle
  #122 = Methodref          #7.#123       // ext/mods/gameserver/model/actor/Player.removeSkill:(IZZ)Lext/mods/gameserver/skills/L2Skill;
  #123 = NameAndType        #124:#125     // removeSkill:(IZZ)Lext/mods/gameserver/skills/L2Skill;
  #124 = Utf8               removeSkill
  #125 = Utf8               (IZZ)Lext/mods/gameserver/skills/L2Skill;
  #126 = Methodref          #7.#127       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #127 = NameAndType        #128:#129     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #128 = Utf8               getInventory
  #129 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #130 = Methodref          #131.#132     // ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
  #131 = Class              #133          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #132 = NameAndType        #134:#135     // getPaperdollItems:()Ljava/util/List;
  #133 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #134 = Utf8               getPaperdollItems
  #135 = Utf8               ()Ljava/util/List;
  #136 = InterfaceMethodref #137.#138     // java/util/List.iterator:()Ljava/util/Iterator;
  #137 = Class              #139          // java/util/List
  #138 = NameAndType        #140:#141     // iterator:()Ljava/util/Iterator;
  #139 = Utf8               java/util/List
  #140 = Utf8               iterator
  #141 = Utf8               ()Ljava/util/Iterator;
  #142 = InterfaceMethodref #143.#144     // java/util/Iterator.hasNext:()Z
  #143 = Class              #145          // java/util/Iterator
  #144 = NameAndType        #146:#20      // hasNext:()Z
  #145 = Utf8               java/util/Iterator
  #146 = Utf8               hasNext
  #147 = InterfaceMethodref #143.#148     // java/util/Iterator.next:()Ljava/lang/Object;
  #148 = NameAndType        #149:#150     // next:()Ljava/lang/Object;
  #149 = Utf8               next
  #150 = Utf8               ()Ljava/lang/Object;
  #151 = Methodref          #59.#152      // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
  #152 = NameAndType        #153:#46      // getItemId:()I
  #153 = Utf8               getItemId
  #154 = Methodref          #10.#152      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #155 = Fieldref           #156.#157     // ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
  #156 = Class              #158          // ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener$SingletonHolder
  #157 = NameAndType        #159:#160     // INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
  #158 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener$SingletonHolder
  #159 = Utf8               INSTANCE
  #160 = Utf8               Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
  #161 = Class              #162          // ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener
  #162 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener
  #163 = Class              #164          // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #164 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #165 = Utf8               Code
  #166 = Utf8               LineNumberTable
  #167 = Utf8               LocalVariableTable
  #168 = Utf8               this
  #169 = Utf8               onEquip
  #170 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #171 = Utf8               enchant4Skill
  #172 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #173 = Utf8               weapon
  #174 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #175 = Utf8               equipDelay
  #176 = Utf8               I
  #177 = Utf8               itemSkill
  #178 = Utf8               skillInfo
  #179 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #180 = Utf8               slot
  #181 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
  #182 = Utf8               item
  #183 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #184 = Utf8               actor
  #185 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #186 = Utf8               player
  #187 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #188 = Utf8               it
  #189 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #190 = Utf8               update
  #191 = Utf8               Z
  #192 = Utf8               updateTimeStamp
  #193 = Utf8               skills
  #194 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #195 = Utf8               StackMapTable
  #196 = Class              #197          // ext/mods/gameserver/enums/Paperdoll
  #197 = Utf8               ext/mods/gameserver/enums/Paperdoll
  #198 = Class              #199          // ext/mods/gameserver/model/actor/Playable
  #199 = Utf8               ext/mods/gameserver/model/actor/Playable
  #200 = Class              #194          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #201 = Utf8               onUnequip
  #202 = Utf8               pItem
  #203 = Utf8               found
  #204 = Utf8               getInstance
  #205 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
  #206 = Utf8               SourceFile
  #207 = Utf8               ItemPassiveSkillsListener.java
  #208 = Utf8               NestMembers
  #209 = Utf8               InnerClasses
  #210 = Utf8               SingletonHolder
{
  public ext.mods.gameserver.model.itemcontainer.listeners.ItemPassiveSkillsListener();
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
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;

  public void onEquip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=15, args_size=4
         0: aload_3
         1: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
         4: astore        4
         6: aload_2
         7: invokevirtual #9                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        10: astore        5
        12: iconst_0
        13: istore        6
        15: iconst_0
        16: istore        7
        18: aload         5
        20: instanceof    #15                 // class ext/mods/gameserver/model/item/kind/Weapon
        23: ifeq          101
        26: aload         5
        28: checkcast     #15                 // class ext/mods/gameserver/model/item/kind/Weapon
        31: astore        8
        33: aload_2
        34: invokevirtual #17                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
        37: ifeq          49
        40: aload_2
        41: invokevirtual #21                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
        44: aload         4
        46: invokevirtual #25                 // Method ext/mods/gameserver/model/Augmentation.applyBonus:(Lext/mods/gameserver/model/actor/Player;)V
        49: aload         4
        51: sipush        239
        54: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
        57: aload         8
        59: invokevirtual #37                 // Method ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        62: invokevirtual #41                 // Method ext/mods/gameserver/enums/items/CrystalType.getId:()I
        65: if_icmpge     69
        68: return
        69: aload_2
        70: invokevirtual #47                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        73: iconst_4
        74: if_icmplt     101
        77: aload         8
        79: invokevirtual #50                 // Method ext/mods/gameserver/model/item/kind/Weapon.getEnchant4Skill:()Lext/mods/gameserver/skills/L2Skill;
        82: astore        9
        84: aload         9
        86: ifnull        101
        89: aload         4
        91: aload         9
        93: iconst_0
        94: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
        97: pop
        98: iconst_1
        99: istore        6
       101: aload         5
       103: invokevirtual #58                 // Method ext/mods/gameserver/model/item/kind/Item.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       106: astore        8
       108: aload         8
       110: ifnull        241
       113: aload         8
       115: astore        9
       117: aload         9
       119: arraylength
       120: istore        10
       122: iconst_0
       123: istore        11
       125: iload         11
       127: iload         10
       129: if_icmpge     241
       132: aload         9
       134: iload         11
       136: aaload
       137: astore        12
       139: aload         12
       141: ifnonnull     147
       144: goto          235
       147: aload         12
       149: invokevirtual #64                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       152: astore        13
       154: aload         13
       156: ifnull        235
       159: aload         4
       161: aload         13
       163: iconst_0
       164: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       167: pop
       168: aload         13
       170: invokevirtual #69                 // Method ext/mods/gameserver/skills/L2Skill.isActive:()Z
       173: ifeq          232
       176: aload         4
       178: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.getReuseTimeStamp:()Ljava/util/Map;
       181: aload         13
       183: invokevirtual #76                 // Method ext/mods/gameserver/skills/L2Skill.getReuseHashCode:()I
       186: invokestatic  #79                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       189: invokeinterface #85,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
       194: ifne          229
       197: aload         13
       199: invokevirtual #91                 // Method ext/mods/gameserver/skills/L2Skill.getEquipDelay:()I
       202: istore        14
       204: iload         14
       206: ifle          229
       209: aload         4
       211: aload         13
       213: iload         14
       215: i2l
       216: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
       219: aload         4
       221: aload         13
       223: iload         14
       225: i2l
       226: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
       229: iconst_1
       230: istore        7
       232: iconst_1
       233: istore        6
       235: iinc          11, 1
       238: goto          125
       241: iload         6
       243: ifeq          279
       246: aload         4
       248: new           #101                // class ext/mods/gameserver/network/serverpackets/SkillList
       251: dup
       252: aload         4
       254: invokespecial #103                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       257: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       260: iload         7
       262: ifeq          279
       265: aload         4
       267: new           #109                // class ext/mods/gameserver/network/serverpackets/SkillCoolTime
       270: dup
       271: aload         4
       273: invokespecial #111                // Method ext/mods/gameserver/network/serverpackets/SkillCoolTime."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       276: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       279: return
      LineNumberTable:
        line 36: 0
        line 37: 6
        line 39: 12
        line 40: 15
        line 42: 18
        line 44: 33
        line 45: 40
        line 47: 49
        line 48: 68
        line 50: 69
        line 52: 77
        line 53: 84
        line 55: 89
        line 56: 98
        line 61: 101
        line 62: 108
        line 64: 113
        line 66: 139
        line 67: 144
        line 69: 147
        line 70: 154
        line 72: 159
        line 74: 168
        line 76: 176
        line 78: 197
        line 79: 204
        line 81: 209
        line 82: 219
        line 85: 229
        line 87: 232
        line 64: 235
        line 92: 241
        line 94: 246
        line 96: 260
        line 97: 265
        line 99: 279
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           84      17     9 enchant4Skill   Lext/mods/gameserver/skills/L2Skill;
           33      68     8 weapon   Lext/mods/gameserver/model/item/kind/Weapon;
          204      25    14 equipDelay   I
          154      81    13 itemSkill   Lext/mods/gameserver/skills/L2Skill;
          139      96    12 skillInfo   Lext/mods/gameserver/model/holder/IntIntHolder;
            0     280     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
            0     280     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0     280     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     280     3 actor   Lext/mods/gameserver/model/actor/Playable;
            6     274     4 player   Lext/mods/gameserver/model/actor/Player;
           12     268     5    it   Lext/mods/gameserver/model/item/kind/Item;
           15     265     6 update   Z
           18     262     7 updateTimeStamp   Z
          108     172     8 skills   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/kind/Item, int, int, class ext/mods/gameserver/model/item/kind/Weapon ]
          stack = []
        frame_type = 19 /* same */
        frame_type = 250 /* chop */
          offset_delta = 31
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/kind/Item, int, int, class "[Lext/mods/gameserver/model/holder/IntIntHolder;", class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 252 /* append */
          offset_delta = 81
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 2 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 37 /* same */

  public void onUnequip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=16, args_size=4
         0: aload_3
         1: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
         4: astore        4
         6: aload_2
         7: invokevirtual #9                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        10: astore        5
        12: iconst_0
        13: istore        6
        15: aload         5
        17: instanceof    #15                 // class ext/mods/gameserver/model/item/kind/Weapon
        20: ifeq          102
        23: aload         5
        25: checkcast     #15                 // class ext/mods/gameserver/model/item/kind/Weapon
        28: astore        7
        30: aload_2
        31: invokevirtual #17                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
        34: ifeq          46
        37: aload_2
        38: invokevirtual #21                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
        41: aload         4
        43: invokevirtual #112                // Method ext/mods/gameserver/model/Augmentation.removeBonus:(Lext/mods/gameserver/model/actor/Player;)V
        46: aload_2
        47: invokevirtual #47                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        50: iconst_4
        51: if_icmplt     102
        54: aload         7
        56: invokevirtual #50                 // Method ext/mods/gameserver/model/item/kind/Weapon.getEnchant4Skill:()Lext/mods/gameserver/skills/L2Skill;
        59: astore        8
        61: aload         8
        63: ifnull        102
        66: aload         4
        68: aload         8
        70: invokevirtual #115                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        73: iconst_0
        74: aload         8
        76: invokevirtual #116                // Method ext/mods/gameserver/skills/L2Skill.isPassive:()Z
        79: ifne          90
        82: aload         8
        84: invokevirtual #119                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
        87: ifeq          94
        90: iconst_1
        91: goto          95
        94: iconst_0
        95: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZZ)Lext/mods/gameserver/skills/L2Skill;
        98: pop
        99: iconst_1
       100: istore        6
       102: aload         5
       104: invokevirtual #58                 // Method ext/mods/gameserver/model/item/kind/Item.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       107: astore        7
       109: aload         7
       111: ifnull        269
       114: aload         7
       116: astore        8
       118: aload         8
       120: arraylength
       121: istore        9
       123: iconst_0
       124: istore        10
       126: iload         10
       128: iload         9
       130: if_icmpge     269
       133: aload         8
       135: iload         10
       137: aaload
       138: astore        11
       140: aload         11
       142: ifnonnull     148
       145: goto          263
       148: aload         11
       150: invokevirtual #64                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       153: astore        12
       155: aload         12
       157: ifnull        263
       160: iconst_0
       161: istore        13
       163: aload         4
       165: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       168: invokevirtual #130                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
       171: invokeinterface #136,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       176: astore        14
       178: aload         14
       180: invokeinterface #142,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       185: ifeq          222
       188: aload         14
       190: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       195: checkcast     #10                 // class ext/mods/gameserver/model/item/instance/ItemInstance
       198: astore        15
       200: aload         5
       202: invokevirtual #151                // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
       205: aload         15
       207: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       210: if_icmpne     219
       213: iconst_1
       214: istore        13
       216: goto          222
       219: goto          178
       222: iload         13
       224: ifne          263
       227: aload         4
       229: aload         12
       231: invokevirtual #115                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       234: iconst_0
       235: aload         12
       237: invokevirtual #116                // Method ext/mods/gameserver/skills/L2Skill.isPassive:()Z
       240: ifne          251
       243: aload         12
       245: invokevirtual #119                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       248: ifeq          255
       251: iconst_1
       252: goto          256
       255: iconst_0
       256: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZZ)Lext/mods/gameserver/skills/L2Skill;
       259: pop
       260: iconst_1
       261: istore        6
       263: iinc          10, 1
       266: goto          126
       269: iload         6
       271: ifeq          288
       274: aload         4
       276: new           #101                // class ext/mods/gameserver/network/serverpackets/SkillList
       279: dup
       280: aload         4
       282: invokespecial #103                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       285: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       288: return
      LineNumberTable:
        line 104: 0
        line 105: 6
        line 107: 12
        line 109: 15
        line 111: 30
        line 112: 37
        line 114: 46
        line 116: 54
        line 117: 61
        line 119: 66
        line 120: 99
        line 125: 102
        line 126: 109
        line 128: 114
        line 130: 140
        line 131: 145
        line 133: 148
        line 134: 155
        line 136: 160
        line 138: 163
        line 140: 200
        line 142: 213
        line 143: 216
        line 145: 219
        line 147: 222
        line 149: 227
        line 150: 260
        line 128: 263
        line 156: 269
        line 157: 274
        line 158: 288
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           61      41     8 enchant4Skill   Lext/mods/gameserver/skills/L2Skill;
           30      72     7 weapon   Lext/mods/gameserver/model/item/kind/Weapon;
          200      19    15 pItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
          163     100    13 found   Z
          155     108    12 itemSkill   Lext/mods/gameserver/skills/L2Skill;
          140     123    11 skillInfo   Lext/mods/gameserver/model/holder/IntIntHolder;
            0     289     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
            0     289     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0     289     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     289     3 actor   Lext/mods/gameserver/model/actor/Playable;
            6     283     4 player   Lext/mods/gameserver/model/actor/Player;
           12     277     5    it   Lext/mods/gameserver/model/item/kind/Item;
           15     274     6 update   Z
          109     180     7 skills   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/kind/Item, int, class ext/mods/gameserver/model/item/kind/Weapon ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/kind/Item, int, class ext/mods/gameserver/model/item/kind/Weapon, class ext/mods/gameserver/skills/L2Skill ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/kind/Item, int, class ext/mods/gameserver/model/item/kind/Weapon, class ext/mods/gameserver/skills/L2Skill ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/kind/Item, int, class ext/mods/gameserver/model/item/kind/Weapon, class ext/mods/gameserver/skills/L2Skill ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int, int, int ]
        frame_type = 249 /* chop */
          offset_delta = 6
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/kind/Item, int, class "[Lext/mods/gameserver/model/holder/IntIntHolder;", class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 254 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/skills/L2Skill, int, class java/util/Iterator ]
        frame_type = 40 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/kind/Item, int, class "[Lext/mods/gameserver/model/holder/IntIntHolder;", class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/skills/L2Skill, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/kind/Item, int, class "[Lext/mods/gameserver/model/holder/IntIntHolder;", class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/skills/L2Skill, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener, class ext/mods/gameserver/enums/Paperdoll, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/kind/Item, int, class "[Lext/mods/gameserver/model/holder/IntIntHolder;", class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/skills/L2Skill, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int, int, int ]
        frame_type = 248 /* chop */
          offset_delta = 6
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 18 /* same */

  public static final ext.mods.gameserver.model.itemcontainer.listeners.ItemPassiveSkillsListener getInstance();
    descriptor: ()Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #155                // Field ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
         3: areturn
      LineNumberTable:
        line 162: 0
}
SourceFile: "ItemPassiveSkillsListener.java"
NestMembers:
  ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener$SingletonHolder
