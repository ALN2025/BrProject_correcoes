// Bytecode for: ext.mods.gameserver.model.multisell.CommunityBoardListContainer
// File: ext\mods\gameserver\model\multisell\CommunityBoardListContainer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/multisell/CommunityBoardListContainer.class
  Last modified 9 de jul de 2026; size 3547 bytes
  MD5 checksum def97363d1c2f0a8497d96c2a6aa3e3e
  Compiled from "CommunityBoardListContainer.java"
public class ext.mods.gameserver.model.multisell.CommunityBoardListContainer extends ext.mods.gameserver.model.multisell.PreparedListContainer
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/multisell/CommunityBoardListContainer
  super_class: #8                         // ext/mods/gameserver/model/multisell/PreparedListContainer
  interfaces: 0, fields: 1, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/multisell/ListContainer.getId:()I
    #2 = Class              #4            // ext/mods/gameserver/model/multisell/ListContainer
    #3 = NameAndType        #5:#6         // getId:()I
    #4 = Utf8               ext/mods/gameserver/model/multisell/ListContainer
    #5 = Utf8               getId
    #6 = Utf8               ()I
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/multisell/PreparedListContainer."<init>":(I)V
    #8 = Class              #10           // ext/mods/gameserver/model/multisell/PreparedListContainer
    #9 = NameAndType        #11:#12       // "<init>":(I)V
   #10 = Utf8               ext/mods/gameserver/model/multisell/PreparedListContainer
   #11 = Utf8               <init>
   #12 = Utf8               (I)V
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/multisell/CommunityBoardListContainer._npcObjectId:I
   #14 = Class              #16           // ext/mods/gameserver/model/multisell/CommunityBoardListContainer
   #15 = NameAndType        #17:#18       // _npcObjectId:I
   #16 = Utf8               ext/mods/gameserver/model/multisell/CommunityBoardListContainer
   #17 = Utf8               _npcObjectId
   #18 = Utf8               I
   #19 = Methodref          #2.#20        // ext/mods/gameserver/model/multisell/ListContainer.getMaintainEnchantment:()Z
   #20 = NameAndType        #21:#22       // getMaintainEnchantment:()Z
   #21 = Utf8               getMaintainEnchantment
   #22 = Utf8               ()Z
   #23 = Methodref          #14.#24       // ext/mods/gameserver/model/multisell/CommunityBoardListContainer.setMaintainEnchantment:(Z)V
   #24 = NameAndType        #25:#26       // setMaintainEnchantment:(Z)V
   #25 = Utf8               setMaintainEnchantment
   #26 = Utf8               (Z)V
   #27 = Methodref          #14.#28       // ext/mods/gameserver/model/multisell/CommunityBoardListContainer.setApplyTaxes:(Z)V
   #28 = NameAndType        #29:#26       // setApplyTaxes:(Z)V
   #29 = Utf8               setApplyTaxes
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
   #31 = Class              #33           // ext/mods/gameserver/model/actor/Npc
   #32 = NameAndType        #34:#6        // getObjectId:()I
   #33 = Utf8               ext/mods/gameserver/model/actor/Npc
   #34 = Utf8               getObjectId
   #35 = Methodref          #31.#36       // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #36 = NameAndType        #37:#6        // getNpcId:()I
   #37 = Utf8               getNpcId
   #38 = Methodref          #2.#39        // ext/mods/gameserver/model/multisell/ListContainer.getApplyTaxes:()Z
   #39 = NameAndType        #40:#22       // getApplyTaxes:()Z
   #40 = Utf8               getApplyTaxes
   #41 = Methodref          #31.#42       // ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #42 = NameAndType        #43:#44       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #43 = Utf8               getCastle
   #44 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
   #46 = Class              #48           // ext/mods/gameserver/model/residence/castle/Castle
   #47 = NameAndType        #49:#6        // getOwnerId:()I
   #48 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #49 = Utf8               getOwnerId
   #50 = Methodref          #46.#51       // ext/mods/gameserver/model/residence/castle/Castle.getTaxRate:()D
   #51 = NameAndType        #52:#53       // getTaxRate:()D
   #52 = Utf8               getTaxRate
   #53 = Utf8               ()D
   #54 = Class              #55           // java/util/LinkedList
   #55 = Utf8               java/util/LinkedList
   #56 = Methodref          #54.#57       // java/util/LinkedList."<init>":()V
   #57 = NameAndType        #11:#58       // "<init>":()V
   #58 = Utf8               ()V
   #59 = Fieldref           #14.#60       // ext/mods/gameserver/model/multisell/CommunityBoardListContainer._entries:Ljava/util/List;
   #60 = NameAndType        #61:#62       // _entries:Ljava/util/List;
   #61 = Utf8               _entries
   #62 = Utf8               Ljava/util/List;
   #63 = Methodref          #64.#65       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #64 = Class              #66           // ext/mods/gameserver/model/actor/Player
   #65 = NameAndType        #67:#68       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #66 = Utf8               ext/mods/gameserver/model/actor/Player
   #67 = Utf8               getInventory
   #68 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #69 = Methodref          #14.#20       // ext/mods/gameserver/model/multisell/CommunityBoardListContainer.getMaintainEnchantment:()Z
   #70 = Methodref          #71.#72       // ext/mods/gameserver/model/itemcontainer/PcInventory.getUniqueItems:(ZZZZZ)Ljava/util/List;
   #71 = Class              #73           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #72 = NameAndType        #74:#75       // getUniqueItems:(ZZZZZ)Ljava/util/List;
   #73 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #74 = Utf8               getUniqueItems
   #75 = Utf8               (ZZZZZ)Ljava/util/List;
   #76 = InterfaceMethodref #77.#78       // java/util/List.iterator:()Ljava/util/Iterator;
   #77 = Class              #79           // java/util/List
   #78 = NameAndType        #80:#81       // iterator:()Ljava/util/Iterator;
   #79 = Utf8               java/util/List
   #80 = Utf8               iterator
   #81 = Utf8               ()Ljava/util/Iterator;
   #82 = InterfaceMethodref #83.#84       // java/util/Iterator.hasNext:()Z
   #83 = Class              #85           // java/util/Iterator
   #84 = NameAndType        #86:#22       // hasNext:()Z
   #85 = Utf8               java/util/Iterator
   #86 = Utf8               hasNext
   #87 = InterfaceMethodref #83.#88       // java/util/Iterator.next:()Ljava/lang/Object;
   #88 = NameAndType        #89:#90       // next:()Ljava/lang/Object;
   #89 = Utf8               next
   #90 = Utf8               ()Ljava/lang/Object;
   #91 = Class              #92           // ext/mods/gameserver/model/item/instance/ItemInstance
   #92 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #93 = Methodref          #91.#94       // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
   #94 = NameAndType        #95:#22       // isEquipped:()Z
   #95 = Utf8               isEquipped
   #96 = Methodref          #91.#97       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #97 = NameAndType        #98:#99       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #98 = Utf8               getItem
   #99 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #100 = Class              #101          // ext/mods/gameserver/model/item/kind/Armor
  #101 = Utf8               ext/mods/gameserver/model/item/kind/Armor
  #102 = Class              #103          // ext/mods/gameserver/model/item/kind/Weapon
  #103 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #104 = Methodref          #2.#105       // ext/mods/gameserver/model/multisell/ListContainer.getEntries:()Ljava/util/List;
  #105 = NameAndType        #106:#107     // getEntries:()Ljava/util/List;
  #106 = Utf8               getEntries
  #107 = Utf8               ()Ljava/util/List;
  #108 = Class              #109          // ext/mods/gameserver/model/multisell/Entry
  #109 = Utf8               ext/mods/gameserver/model/multisell/Entry
  #110 = Methodref          #108.#111     // ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
  #111 = NameAndType        #112:#107     // getIngredients:()Ljava/util/List;
  #112 = Utf8               getIngredients
  #113 = Class              #114          // ext/mods/gameserver/model/multisell/Ingredient
  #114 = Utf8               ext/mods/gameserver/model/multisell/Ingredient
  #115 = Methodref          #91.#116      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #116 = NameAndType        #117:#6       // getItemId:()I
  #117 = Utf8               getItemId
  #118 = Methodref          #113.#116     // ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
  #119 = Class              #120          // ext/mods/gameserver/model/multisell/PreparedEntry
  #120 = Utf8               ext/mods/gameserver/model/multisell/PreparedEntry
  #121 = Methodref          #14.#39       // ext/mods/gameserver/model/multisell/CommunityBoardListContainer.getApplyTaxes:()Z
  #122 = Methodref          #119.#123     // ext/mods/gameserver/model/multisell/PreparedEntry."<init>":(Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
  #123 = NameAndType        #11:#124      // "<init>":(Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
  #124 = Utf8               (Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
  #125 = InterfaceMethodref #77.#126      // java/util/List.add:(Ljava/lang/Object;)Z
  #126 = NameAndType        #127:#128     // add:(Ljava/lang/Object;)Z
  #127 = Utf8               add
  #128 = Utf8               (Ljava/lang/Object;)Z
  #129 = Class              #130          // java/util/ArrayList
  #130 = Utf8               java/util/ArrayList
  #131 = InterfaceMethodref #77.#132      // java/util/List.size:()I
  #132 = NameAndType        #133:#6       // size:()I
  #133 = Utf8               size
  #134 = Methodref          #129.#9       // java/util/ArrayList."<init>":(I)V
  #135 = Utf8               (Lext/mods/gameserver/model/multisell/ListContainer;ZLext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
  #136 = Utf8               Code
  #137 = Utf8               LineNumberTable
  #138 = Utf8               LocalVariableTable
  #139 = Utf8               ing
  #140 = Utf8               Lext/mods/gameserver/model/multisell/Ingredient;
  #141 = Utf8               ent
  #142 = Utf8               Lext/mods/gameserver/model/multisell/Entry;
  #143 = Utf8               item
  #144 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #145 = Utf8               this
  #146 = Utf8               Lext/mods/gameserver/model/multisell/CommunityBoardListContainer;
  #147 = Utf8               template
  #148 = Utf8               Lext/mods/gameserver/model/multisell/ListContainer;
  #149 = Utf8               inventoryOnly
  #150 = Utf8               Z
  #151 = Utf8               player
  #152 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #153 = Utf8               npc
  #154 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #155 = Utf8               taxRate
  #156 = Utf8               D
  #157 = Utf8               npcId
  #158 = Utf8               StackMapTable
  #159 = Utf8               checkNpcObjectId
  #160 = Utf8               (I)Z
  #161 = Utf8               npcObjectId
  #162 = Utf8               SourceFile
  #163 = Utf8               CommunityBoardListContainer.java
{
  public ext.mods.gameserver.model.multisell.CommunityBoardListContainer(ext.mods.gameserver.model.multisell.ListContainer, boolean, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/multisell/ListContainer;ZLext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=14, args_size=5
         0: aload_0
         1: aload_1
         2: invokevirtual #1                  // Method ext/mods/gameserver/model/multisell/ListContainer.getId:()I
         5: invokespecial #7                  // Method ext/mods/gameserver/model/multisell/PreparedListContainer."<init>":(I)V
         8: aload_0
         9: iconst_0
        10: putfield      #13                 // Field _npcObjectId:I
        13: aload_0
        14: aload_1
        15: invokevirtual #19                 // Method ext/mods/gameserver/model/multisell/ListContainer.getMaintainEnchantment:()Z
        18: invokevirtual #23                 // Method setMaintainEnchantment:(Z)V
        21: aload_0
        22: iconst_0
        23: invokevirtual #27                 // Method setApplyTaxes:(Z)V
        26: dconst_0
        27: dstore        5
        29: iconst_0
        30: istore        7
        32: aload         4
        34: ifnull        94
        37: aload_0
        38: aload         4
        40: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
        43: putfield      #13                 // Field _npcObjectId:I
        46: aload         4
        48: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        51: istore        7
        53: aload_1
        54: invokevirtual #38                 // Method ext/mods/gameserver/model/multisell/ListContainer.getApplyTaxes:()Z
        57: ifeq          94
        60: aload         4
        62: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        65: ifnull        94
        68: aload         4
        70: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        73: invokevirtual #45                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        76: ifle          94
        79: aload_0
        80: iconst_1
        81: invokevirtual #27                 // Method setApplyTaxes:(Z)V
        84: aload         4
        86: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        89: invokevirtual #50                 // Method ext/mods/gameserver/model/residence/castle/Castle.getTaxRate:()D
        92: dstore        5
        94: iload_2
        95: ifeq          326
        98: aload_3
        99: ifnonnull     103
       102: return
       103: aload_0
       104: new           #54                 // class java/util/LinkedList
       107: dup
       108: invokespecial #56                 // Method java/util/LinkedList."<init>":()V
       111: putfield      #59                 // Field _entries:Ljava/util/List;
       114: aload_3
       115: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       118: aload_0
       119: invokevirtual #69                 // Method getMaintainEnchantment:()Z
       122: iconst_0
       123: iconst_0
       124: iconst_0
       125: iload         7
       127: sipush        31760
       130: if_icmpne     137
       133: iconst_1
       134: goto          138
       137: iconst_0
       138: invokevirtual #70                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getUniqueItems:(ZZZZZ)Ljava/util/List;
       141: invokeinterface #76,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       146: astore        8
       148: aload         8
       150: invokeinterface #82,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       155: ifeq          323
       158: aload         8
       160: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       165: checkcast     #91                 // class ext/mods/gameserver/model/item/instance/ItemInstance
       168: astore        9
       170: aload         9
       172: invokevirtual #93                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
       175: ifne          320
       178: aload         9
       180: invokevirtual #96                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       183: instanceof    #100                // class ext/mods/gameserver/model/item/kind/Armor
       186: ifne          200
       189: aload         9
       191: invokevirtual #96                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       194: instanceof    #102                // class ext/mods/gameserver/model/item/kind/Weapon
       197: ifeq          320
       200: aload_1
       201: invokevirtual #104                // Method ext/mods/gameserver/model/multisell/ListContainer.getEntries:()Ljava/util/List;
       204: invokeinterface #76,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       209: astore        10
       211: aload         10
       213: invokeinterface #82,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       218: ifeq          320
       221: aload         10
       223: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       228: checkcast     #108                // class ext/mods/gameserver/model/multisell/Entry
       231: astore        11
       233: aload         11
       235: invokevirtual #110                // Method ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
       238: invokeinterface #76,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       243: astore        12
       245: aload         12
       247: invokeinterface #82,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       252: ifeq          317
       255: aload         12
       257: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       262: checkcast     #113                // class ext/mods/gameserver/model/multisell/Ingredient
       265: astore        13
       267: aload         9
       269: invokevirtual #115                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       272: aload         13
       274: invokevirtual #118                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       277: if_icmpne     314
       280: aload_0
       281: getfield      #59                 // Field _entries:Ljava/util/List;
       284: new           #119                // class ext/mods/gameserver/model/multisell/PreparedEntry
       287: dup
       288: aload         11
       290: aload         9
       292: aload_0
       293: invokevirtual #121                // Method getApplyTaxes:()Z
       296: aload_0
       297: invokevirtual #69                 // Method getMaintainEnchantment:()Z
       300: dload         5
       302: invokespecial #122                // Method ext/mods/gameserver/model/multisell/PreparedEntry."<init>":(Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
       305: invokeinterface #125,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       310: pop
       311: goto          317
       314: goto          245
       317: goto          211
       320: goto          148
       323: goto          409
       326: aload_0
       327: new           #129                // class java/util/ArrayList
       330: dup
       331: aload_1
       332: invokevirtual #104                // Method ext/mods/gameserver/model/multisell/ListContainer.getEntries:()Ljava/util/List;
       335: invokeinterface #131,  1          // InterfaceMethod java/util/List.size:()I
       340: invokespecial #134                // Method java/util/ArrayList."<init>":(I)V
       343: putfield      #59                 // Field _entries:Ljava/util/List;
       346: aload_1
       347: invokevirtual #104                // Method ext/mods/gameserver/model/multisell/ListContainer.getEntries:()Ljava/util/List;
       350: invokeinterface #76,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       355: astore        8
       357: aload         8
       359: invokeinterface #82,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       364: ifeq          409
       367: aload         8
       369: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       374: checkcast     #108                // class ext/mods/gameserver/model/multisell/Entry
       377: astore        9
       379: aload_0
       380: getfield      #59                 // Field _entries:Ljava/util/List;
       383: new           #119                // class ext/mods/gameserver/model/multisell/PreparedEntry
       386: dup
       387: aload         9
       389: aconst_null
       390: aload_0
       391: invokevirtual #121                // Method getApplyTaxes:()Z
       394: iconst_0
       395: dload         5
       397: invokespecial #122                // Method ext/mods/gameserver/model/multisell/PreparedEntry."<init>":(Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
       400: invokeinterface #125,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       405: pop
       406: goto          357
       409: return
      LineNumberTable:
        line 40: 0
        line 36: 8
        line 42: 13
        line 43: 21
        line 45: 26
        line 46: 29
        line 48: 32
        line 50: 37
        line 51: 46
        line 53: 53
        line 55: 79
        line 56: 84
        line 60: 94
        line 62: 98
        line 63: 102
        line 65: 103
        line 67: 114
        line 69: 170
        line 71: 200
        line 73: 233
        line 75: 267
        line 77: 280
        line 78: 311
        line 80: 314
        line 81: 317
        line 83: 320
        line 87: 326
        line 89: 346
        line 90: 379
        line 92: 409
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          267      47    13   ing   Lext/mods/gameserver/model/multisell/Ingredient;
          233      84    11   ent   Lext/mods/gameserver/model/multisell/Entry;
          170     150     9  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          379      27     9   ent   Lext/mods/gameserver/model/multisell/Entry;
            0     410     0  this   Lext/mods/gameserver/model/multisell/CommunityBoardListContainer;
            0     410     1 template   Lext/mods/gameserver/model/multisell/ListContainer;
            0     410     2 inventoryOnly   Z
            0     410     3 player   Lext/mods/gameserver/model/actor/Player;
            0     410     4   npc   Lext/mods/gameserver/model/actor/Npc;
           29     381     5 taxRate   D
           32     378     7 npcId   I
      StackMapTable: number_of_entries = 15
        frame_type = 255 /* full_frame */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/model/multisell/CommunityBoardListContainer, class ext/mods/gameserver/model/multisell/ListContainer, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, double, int ]
          stack = []
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/multisell/CommunityBoardListContainer, class ext/mods/gameserver/model/multisell/ListContainer, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, double, int ]
          stack = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, int, int, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/multisell/CommunityBoardListContainer, class ext/mods/gameserver/model/multisell/ListContainer, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, double, int ]
          stack = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, int, int, int, int, int ]
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/multisell/Entry, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 51

  public final boolean checkNpcObjectId(int);
    descriptor: (I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _npcObjectId:I
         4: ifeq          15
         7: aload_0
         8: getfield      #13                 // Field _npcObjectId:I
        11: iload_1
        12: if_icmpne     19
        15: iconst_1
        16: goto          20
        19: iconst_0
        20: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/multisell/CommunityBoardListContainer;
            0      21     1 npcObjectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 15 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "CommunityBoardListContainer.java"
