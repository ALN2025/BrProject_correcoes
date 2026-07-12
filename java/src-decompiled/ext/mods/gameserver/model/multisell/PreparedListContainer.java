// Bytecode for: ext.mods.gameserver.model.multisell.PreparedListContainer
// File: ext\mods\gameserver\model\multisell\PreparedListContainer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/multisell/PreparedListContainer.class
  Last modified 9 de jul de 2026; size 3616 bytes
  MD5 checksum 0151f432526cc2a9c356af3acc6ec00d
  Compiled from "PreparedListContainer.java"
public class ext.mods.gameserver.model.multisell.PreparedListContainer extends ext.mods.gameserver.model.multisell.ListContainer
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #12                         // ext/mods/gameserver/model/multisell/PreparedListContainer
  super_class: #2                         // ext/mods/gameserver/model/multisell/ListContainer
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/multisell/ListContainer.getId:()I
    #2 = Class              #4            // ext/mods/gameserver/model/multisell/ListContainer
    #3 = NameAndType        #5:#6         // getId:()I
    #4 = Utf8               ext/mods/gameserver/model/multisell/ListContainer
    #5 = Utf8               getId
    #6 = Utf8               ()I
    #7 = Methodref          #2.#8         // ext/mods/gameserver/model/multisell/ListContainer."<init>":(I)V
    #8 = NameAndType        #9:#10        // "<init>":(I)V
    #9 = Utf8               <init>
   #10 = Utf8               (I)V
   #11 = Fieldref           #12.#13       // ext/mods/gameserver/model/multisell/PreparedListContainer._npcObjectId:I
   #12 = Class              #14           // ext/mods/gameserver/model/multisell/PreparedListContainer
   #13 = NameAndType        #15:#16       // _npcObjectId:I
   #14 = Utf8               ext/mods/gameserver/model/multisell/PreparedListContainer
   #15 = Utf8               _npcObjectId
   #16 = Utf8               I
   #17 = Methodref          #2.#18        // ext/mods/gameserver/model/multisell/ListContainer.getMaintainEnchantment:()Z
   #18 = NameAndType        #19:#20       // getMaintainEnchantment:()Z
   #19 = Utf8               getMaintainEnchantment
   #20 = Utf8               ()Z
   #21 = Methodref          #12.#22       // ext/mods/gameserver/model/multisell/PreparedListContainer.setMaintainEnchantment:(Z)V
   #22 = NameAndType        #23:#24       // setMaintainEnchantment:(Z)V
   #23 = Utf8               setMaintainEnchantment
   #24 = Utf8               (Z)V
   #25 = Methodref          #12.#26       // ext/mods/gameserver/model/multisell/PreparedListContainer.setApplyTaxes:(Z)V
   #26 = NameAndType        #27:#24       // setApplyTaxes:(Z)V
   #27 = Utf8               setApplyTaxes
   #28 = Fieldref           #2.#29        // ext/mods/gameserver/model/multisell/ListContainer._npcsAllowed:Ljava/util/Set;
   #29 = NameAndType        #30:#31       // _npcsAllowed:Ljava/util/Set;
   #30 = Utf8               _npcsAllowed
   #31 = Utf8               Ljava/util/Set;
   #32 = Fieldref           #12.#29       // ext/mods/gameserver/model/multisell/PreparedListContainer._npcsAllowed:Ljava/util/Set;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
   #34 = Class              #36           // ext/mods/gameserver/model/actor/Npc
   #35 = NameAndType        #37:#6        // getObjectId:()I
   #36 = Utf8               ext/mods/gameserver/model/actor/Npc
   #37 = Utf8               getObjectId
   #38 = Methodref          #34.#39       // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #39 = NameAndType        #40:#6        // getNpcId:()I
   #40 = Utf8               getNpcId
   #41 = Methodref          #2.#42        // ext/mods/gameserver/model/multisell/ListContainer.getApplyTaxes:()Z
   #42 = NameAndType        #43:#20       // getApplyTaxes:()Z
   #43 = Utf8               getApplyTaxes
   #44 = Methodref          #34.#45       // ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #45 = NameAndType        #46:#47       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #46 = Utf8               getCastle
   #47 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
   #49 = Class              #51           // ext/mods/gameserver/model/residence/castle/Castle
   #50 = NameAndType        #52:#6        // getOwnerId:()I
   #51 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #52 = Utf8               getOwnerId
   #53 = Methodref          #49.#54       // ext/mods/gameserver/model/residence/castle/Castle.getTaxRate:()D
   #54 = NameAndType        #55:#56       // getTaxRate:()D
   #55 = Utf8               getTaxRate
   #56 = Utf8               ()D
   #57 = Class              #58           // java/util/LinkedList
   #58 = Utf8               java/util/LinkedList
   #59 = Methodref          #57.#60       // java/util/LinkedList."<init>":()V
   #60 = NameAndType        #9:#61        // "<init>":()V
   #61 = Utf8               ()V
   #62 = Fieldref           #12.#63       // ext/mods/gameserver/model/multisell/PreparedListContainer._entries:Ljava/util/List;
   #63 = NameAndType        #64:#65       // _entries:Ljava/util/List;
   #64 = Utf8               _entries
   #65 = Utf8               Ljava/util/List;
   #66 = Methodref          #67.#68       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #67 = Class              #69           // ext/mods/gameserver/model/actor/Player
   #68 = NameAndType        #70:#71       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #69 = Utf8               ext/mods/gameserver/model/actor/Player
   #70 = Utf8               getInventory
   #71 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #72 = Methodref          #12.#18       // ext/mods/gameserver/model/multisell/PreparedListContainer.getMaintainEnchantment:()Z
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/itemcontainer/PcInventory.getUniqueItems:(ZZZZZ)Ljava/util/List;
   #74 = Class              #76           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #75 = NameAndType        #77:#78       // getUniqueItems:(ZZZZZ)Ljava/util/List;
   #76 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #77 = Utf8               getUniqueItems
   #78 = Utf8               (ZZZZZ)Ljava/util/List;
   #79 = InterfaceMethodref #80.#81       // java/util/List.iterator:()Ljava/util/Iterator;
   #80 = Class              #82           // java/util/List
   #81 = NameAndType        #83:#84       // iterator:()Ljava/util/Iterator;
   #82 = Utf8               java/util/List
   #83 = Utf8               iterator
   #84 = Utf8               ()Ljava/util/Iterator;
   #85 = InterfaceMethodref #86.#87       // java/util/Iterator.hasNext:()Z
   #86 = Class              #88           // java/util/Iterator
   #87 = NameAndType        #89:#20       // hasNext:()Z
   #88 = Utf8               java/util/Iterator
   #89 = Utf8               hasNext
   #90 = InterfaceMethodref #86.#91       // java/util/Iterator.next:()Ljava/lang/Object;
   #91 = NameAndType        #92:#93       // next:()Ljava/lang/Object;
   #92 = Utf8               next
   #93 = Utf8               ()Ljava/lang/Object;
   #94 = Class              #95           // ext/mods/gameserver/model/item/instance/ItemInstance
   #95 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #96 = Methodref          #94.#97       // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
   #97 = NameAndType        #98:#20       // isEquipped:()Z
   #98 = Utf8               isEquipped
   #99 = Methodref          #94.#100      // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #100 = NameAndType        #101:#102     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #101 = Utf8               getItem
  #102 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #103 = Class              #104          // ext/mods/gameserver/model/item/kind/Armor
  #104 = Utf8               ext/mods/gameserver/model/item/kind/Armor
  #105 = Class              #106          // ext/mods/gameserver/model/item/kind/Weapon
  #106 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #107 = Methodref          #2.#108       // ext/mods/gameserver/model/multisell/ListContainer.getEntries:()Ljava/util/List;
  #108 = NameAndType        #109:#110     // getEntries:()Ljava/util/List;
  #109 = Utf8               getEntries
  #110 = Utf8               ()Ljava/util/List;
  #111 = Class              #112          // ext/mods/gameserver/model/multisell/Entry
  #112 = Utf8               ext/mods/gameserver/model/multisell/Entry
  #113 = Methodref          #111.#114     // ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
  #114 = NameAndType        #115:#110     // getIngredients:()Ljava/util/List;
  #115 = Utf8               getIngredients
  #116 = Class              #117          // ext/mods/gameserver/model/multisell/Ingredient
  #117 = Utf8               ext/mods/gameserver/model/multisell/Ingredient
  #118 = Methodref          #94.#119      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #119 = NameAndType        #120:#6       // getItemId:()I
  #120 = Utf8               getItemId
  #121 = Methodref          #116.#119     // ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
  #122 = Class              #123          // ext/mods/gameserver/model/multisell/PreparedEntry
  #123 = Utf8               ext/mods/gameserver/model/multisell/PreparedEntry
  #124 = Methodref          #12.#42       // ext/mods/gameserver/model/multisell/PreparedListContainer.getApplyTaxes:()Z
  #125 = Methodref          #122.#126     // ext/mods/gameserver/model/multisell/PreparedEntry."<init>":(Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
  #126 = NameAndType        #9:#127       // "<init>":(Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
  #127 = Utf8               (Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
  #128 = InterfaceMethodref #80.#129      // java/util/List.add:(Ljava/lang/Object;)Z
  #129 = NameAndType        #130:#131     // add:(Ljava/lang/Object;)Z
  #130 = Utf8               add
  #131 = Utf8               (Ljava/lang/Object;)Z
  #132 = Class              #133          // java/util/ArrayList
  #133 = Utf8               java/util/ArrayList
  #134 = InterfaceMethodref #80.#135      // java/util/List.size:()I
  #135 = NameAndType        #136:#6       // size:()I
  #136 = Utf8               size
  #137 = Methodref          #132.#8       // java/util/ArrayList."<init>":(I)V
  #138 = Utf8               (Lext/mods/gameserver/model/multisell/ListContainer;ZLext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
  #139 = Utf8               Code
  #140 = Utf8               LineNumberTable
  #141 = Utf8               LocalVariableTable
  #142 = Utf8               ing
  #143 = Utf8               Lext/mods/gameserver/model/multisell/Ingredient;
  #144 = Utf8               ent
  #145 = Utf8               Lext/mods/gameserver/model/multisell/Entry;
  #146 = Utf8               item
  #147 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #148 = Utf8               this
  #149 = Utf8               Lext/mods/gameserver/model/multisell/PreparedListContainer;
  #150 = Utf8               template
  #151 = Utf8               Lext/mods/gameserver/model/multisell/ListContainer;
  #152 = Utf8               inventoryOnly
  #153 = Utf8               Z
  #154 = Utf8               player
  #155 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #156 = Utf8               npc
  #157 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #158 = Utf8               taxRate
  #159 = Utf8               D
  #160 = Utf8               npcId
  #161 = Utf8               StackMapTable
  #162 = Utf8               id
  #163 = Utf8               checkNpcObjectId
  #164 = Utf8               (I)Z
  #165 = Utf8               npcObjectId
  #166 = Utf8               SourceFile
  #167 = Utf8               PreparedListContainer.java
{
  public ext.mods.gameserver.model.multisell.PreparedListContainer(ext.mods.gameserver.model.multisell.ListContainer, boolean, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/multisell/ListContainer;ZLext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=14, args_size=5
         0: aload_0
         1: aload_1
         2: invokevirtual #1                  // Method ext/mods/gameserver/model/multisell/ListContainer.getId:()I
         5: invokespecial #7                  // Method ext/mods/gameserver/model/multisell/ListContainer."<init>":(I)V
         8: aload_0
         9: iconst_0
        10: putfield      #11                 // Field _npcObjectId:I
        13: aload_0
        14: aload_1
        15: invokevirtual #17                 // Method ext/mods/gameserver/model/multisell/ListContainer.getMaintainEnchantment:()Z
        18: invokevirtual #21                 // Method setMaintainEnchantment:(Z)V
        21: aload_0
        22: iconst_0
        23: invokevirtual #25                 // Method setApplyTaxes:(Z)V
        26: aload_0
        27: aload_1
        28: getfield      #28                 // Field ext/mods/gameserver/model/multisell/ListContainer._npcsAllowed:Ljava/util/Set;
        31: putfield      #32                 // Field _npcsAllowed:Ljava/util/Set;
        34: dconst_0
        35: dstore        5
        37: iconst_0
        38: istore        7
        40: aload         4
        42: ifnull        102
        45: aload_0
        46: aload         4
        48: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
        51: putfield      #11                 // Field _npcObjectId:I
        54: aload         4
        56: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        59: istore        7
        61: aload_1
        62: invokevirtual #41                 // Method ext/mods/gameserver/model/multisell/ListContainer.getApplyTaxes:()Z
        65: ifeq          102
        68: aload         4
        70: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        73: ifnull        102
        76: aload         4
        78: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        81: invokevirtual #48                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        84: ifle          102
        87: aload_0
        88: iconst_1
        89: invokevirtual #25                 // Method setApplyTaxes:(Z)V
        92: aload         4
        94: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        97: invokevirtual #53                 // Method ext/mods/gameserver/model/residence/castle/Castle.getTaxRate:()D
       100: dstore        5
       102: iload_2
       103: ifeq          334
       106: aload_3
       107: ifnonnull     111
       110: return
       111: aload_0
       112: new           #57                 // class java/util/LinkedList
       115: dup
       116: invokespecial #59                 // Method java/util/LinkedList."<init>":()V
       119: putfield      #62                 // Field _entries:Ljava/util/List;
       122: aload_3
       123: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       126: aload_0
       127: invokevirtual #72                 // Method getMaintainEnchantment:()Z
       130: iconst_0
       131: iconst_0
       132: iconst_0
       133: iload         7
       135: sipush        31760
       138: if_icmpne     145
       141: iconst_1
       142: goto          146
       145: iconst_0
       146: invokevirtual #73                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getUniqueItems:(ZZZZZ)Ljava/util/List;
       149: invokeinterface #79,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       154: astore        8
       156: aload         8
       158: invokeinterface #85,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       163: ifeq          331
       166: aload         8
       168: invokeinterface #90,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       173: checkcast     #94                 // class ext/mods/gameserver/model/item/instance/ItemInstance
       176: astore        9
       178: aload         9
       180: invokevirtual #96                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
       183: ifne          328
       186: aload         9
       188: invokevirtual #99                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       191: instanceof    #103                // class ext/mods/gameserver/model/item/kind/Armor
       194: ifne          208
       197: aload         9
       199: invokevirtual #99                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       202: instanceof    #105                // class ext/mods/gameserver/model/item/kind/Weapon
       205: ifeq          328
       208: aload_1
       209: invokevirtual #107                // Method ext/mods/gameserver/model/multisell/ListContainer.getEntries:()Ljava/util/List;
       212: invokeinterface #79,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       217: astore        10
       219: aload         10
       221: invokeinterface #85,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       226: ifeq          328
       229: aload         10
       231: invokeinterface #90,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       236: checkcast     #111                // class ext/mods/gameserver/model/multisell/Entry
       239: astore        11
       241: aload         11
       243: invokevirtual #113                // Method ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
       246: invokeinterface #79,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       251: astore        12
       253: aload         12
       255: invokeinterface #85,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       260: ifeq          325
       263: aload         12
       265: invokeinterface #90,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       270: checkcast     #116                // class ext/mods/gameserver/model/multisell/Ingredient
       273: astore        13
       275: aload         9
       277: invokevirtual #118                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       280: aload         13
       282: invokevirtual #121                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       285: if_icmpne     322
       288: aload_0
       289: getfield      #62                 // Field _entries:Ljava/util/List;
       292: new           #122                // class ext/mods/gameserver/model/multisell/PreparedEntry
       295: dup
       296: aload         11
       298: aload         9
       300: aload_0
       301: invokevirtual #124                // Method getApplyTaxes:()Z
       304: aload_0
       305: invokevirtual #72                 // Method getMaintainEnchantment:()Z
       308: dload         5
       310: invokespecial #125                // Method ext/mods/gameserver/model/multisell/PreparedEntry."<init>":(Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
       313: invokeinterface #128,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       318: pop
       319: goto          325
       322: goto          253
       325: goto          219
       328: goto          156
       331: goto          417
       334: aload_0
       335: new           #132                // class java/util/ArrayList
       338: dup
       339: aload_1
       340: invokevirtual #107                // Method ext/mods/gameserver/model/multisell/ListContainer.getEntries:()Ljava/util/List;
       343: invokeinterface #134,  1          // InterfaceMethod java/util/List.size:()I
       348: invokespecial #137                // Method java/util/ArrayList."<init>":(I)V
       351: putfield      #62                 // Field _entries:Ljava/util/List;
       354: aload_1
       355: invokevirtual #107                // Method ext/mods/gameserver/model/multisell/ListContainer.getEntries:()Ljava/util/List;
       358: invokeinterface #79,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       363: astore        8
       365: aload         8
       367: invokeinterface #85,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       372: ifeq          417
       375: aload         8
       377: invokeinterface #90,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       382: checkcast     #111                // class ext/mods/gameserver/model/multisell/Entry
       385: astore        9
       387: aload_0
       388: getfield      #62                 // Field _entries:Ljava/util/List;
       391: new           #122                // class ext/mods/gameserver/model/multisell/PreparedEntry
       394: dup
       395: aload         9
       397: aconst_null
       398: aload_0
       399: invokevirtual #124                // Method getApplyTaxes:()Z
       402: iconst_0
       403: dload         5
       405: invokespecial #125                // Method ext/mods/gameserver/model/multisell/PreparedEntry."<init>":(Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
       408: invokeinterface #128,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       413: pop
       414: goto          365
       417: return
      LineNumberTable:
        line 40: 0
        line 36: 8
        line 42: 13
        line 43: 21
        line 45: 26
        line 47: 34
        line 48: 37
        line 50: 40
        line 52: 45
        line 53: 54
        line 55: 61
        line 57: 87
        line 58: 92
        line 62: 102
        line 64: 106
        line 65: 110
        line 67: 111
        line 69: 122
        line 71: 178
        line 73: 208
        line 75: 241
        line 77: 275
        line 79: 288
        line 80: 319
        line 82: 322
        line 83: 325
        line 85: 328
        line 89: 334
        line 91: 354
        line 92: 387
        line 94: 417
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          275      47    13   ing   Lext/mods/gameserver/model/multisell/Ingredient;
          241      84    11   ent   Lext/mods/gameserver/model/multisell/Entry;
          178     150     9  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          387      27     9   ent   Lext/mods/gameserver/model/multisell/Entry;
            0     418     0  this   Lext/mods/gameserver/model/multisell/PreparedListContainer;
            0     418     1 template   Lext/mods/gameserver/model/multisell/ListContainer;
            0     418     2 inventoryOnly   Z
            0     418     3 player   Lext/mods/gameserver/model/actor/Player;
            0     418     4   npc   Lext/mods/gameserver/model/actor/Npc;
           37     381     5 taxRate   D
           40     378     7 npcId   I
      StackMapTable: number_of_entries = 15
        frame_type = 255 /* full_frame */
          offset_delta = 102
          locals = [ class ext/mods/gameserver/model/multisell/PreparedListContainer, class ext/mods/gameserver/model/multisell/ListContainer, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, double, int ]
          stack = []
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/multisell/PreparedListContainer, class ext/mods/gameserver/model/multisell/ListContainer, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, double, int ]
          stack = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, int, int, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/multisell/PreparedListContainer, class ext/mods/gameserver/model/multisell/ListContainer, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, double, int ]
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

  public ext.mods.gameserver.model.multisell.PreparedListContainer(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #7                  // Method ext/mods/gameserver/model/multisell/ListContainer."<init>":(I)V
         5: aload_0
         6: iconst_0
         7: putfield      #11                 // Field _npcObjectId:I
        10: return
      LineNumberTable:
        line 98: 0
        line 36: 5
        line 99: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/multisell/PreparedListContainer;
            0      11     1    id   I

  public boolean checkNpcObjectId(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #11                 // Field _npcObjectId:I
         4: ifeq          15
         7: aload_0
         8: getfield      #11                 // Field _npcObjectId:I
        11: iload_1
        12: if_icmpne     19
        15: iconst_1
        16: goto          20
        19: iconst_0
        20: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/multisell/PreparedListContainer;
            0      21     1 npcObjectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 15 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "PreparedListContainer.java"
