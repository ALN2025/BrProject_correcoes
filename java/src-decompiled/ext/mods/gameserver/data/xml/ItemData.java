// Bytecode for: ext.mods.gameserver.data.xml.ItemData
// File: ext\mods\gameserver\data\xml\ItemData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/ItemData.class
  Last modified 9 de jul de 2026; size 5879 bytes
  MD5 checksum 3f103d9fe27e038e5cf2bb61eed660c8
  Compiled from "ItemData.java"
public class ext.mods.gameserver.data.xml.ItemData
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/xml/ItemData
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 11, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/data/xml/ItemData.load:()V
    #8 = Class              #10           // ext/mods/gameserver/data/xml/ItemData
    #9 = NameAndType        #11:#6        // load:()V
   #10 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #11 = Utf8               load
   #12 = Fieldref           #8.#13        // ext/mods/gameserver/data/xml/ItemData.armors:Ljava/util/Map;
   #13 = NameAndType        #14:#15       // armors:Ljava/util/Map;
   #14 = Utf8               armors
   #15 = Utf8               Ljava/util/Map;
   #16 = InterfaceMethodref #17.#18       // java/util/Map.clear:()V
   #17 = Class              #19           // java/util/Map
   #18 = NameAndType        #20:#6        // clear:()V
   #19 = Utf8               java/util/Map
   #20 = Utf8               clear
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/data/xml/ItemData.etcItems:Ljava/util/Map;
   #22 = NameAndType        #23:#15       // etcItems:Ljava/util/Map;
   #23 = Utf8               etcItems
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/data/xml/ItemData.weapons:Ljava/util/Map;
   #25 = NameAndType        #26:#15       // weapons:Ljava/util/Map;
   #26 = Utf8               weapons
   #27 = Fieldref           #28.#29       // ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
   #28 = Class              #30           // ext/mods/Config
   #29 = NameAndType        #31:#32       // DATA_PATH:Ljava/nio/file/Path;
   #30 = Utf8               ext/mods/Config
   #31 = Utf8               DATA_PATH
   #32 = Utf8               Ljava/nio/file/Path;
   #33 = String             #34           // xml
   #34 = Utf8               xml
   #35 = InterfaceMethodref #36.#37       // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
   #36 = Class              #38           // java/nio/file/Path
   #37 = NameAndType        #39:#40       // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
   #38 = Utf8               java/nio/file/Path
   #39 = Utf8               resolve
   #40 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
   #41 = String             #42           // items
   #42 = Utf8               items
   #43 = InterfaceMethodref #36.#44       // java/nio/file/Path.toFile:()Ljava/io/File;
   #44 = NameAndType        #45:#46       // toFile:()Ljava/io/File;
   #45 = Utf8               toFile
   #46 = Utf8               ()Ljava/io/File;
   #47 = Methodref          #48.#49       // java/io/File.listFiles:()[Ljava/io/File;
   #48 = Class              #50           // java/io/File
   #49 = NameAndType        #51:#52       // listFiles:()[Ljava/io/File;
   #50 = Utf8               java/io/File
   #51 = Utf8               listFiles
   #52 = Utf8               ()[Ljava/io/File;
   #53 = Class              #54           // ext/mods/gameserver/data/DocumentItem
   #54 = Utf8               ext/mods/gameserver/data/DocumentItem
   #55 = Methodref          #53.#56       // ext/mods/gameserver/data/DocumentItem."<init>":(Ljava/io/File;)V
   #56 = NameAndType        #5:#57        // "<init>":(Ljava/io/File;)V
   #57 = Utf8               (Ljava/io/File;)V
   #58 = Methodref          #53.#59       // ext/mods/gameserver/data/DocumentItem.parse:()Lorg/w3c/dom/Document;
   #59 = NameAndType        #60:#61       // parse:()Lorg/w3c/dom/Document;
   #60 = Utf8               parse
   #61 = Utf8               ()Lorg/w3c/dom/Document;
   #62 = Methodref          #53.#63       // ext/mods/gameserver/data/DocumentItem.getItemList:()Ljava/util/List;
   #63 = NameAndType        #64:#65       // getItemList:()Ljava/util/List;
   #64 = Utf8               getItemList
   #65 = Utf8               ()Ljava/util/List;
   #66 = InterfaceMethodref #67.#68       // java/util/List.iterator:()Ljava/util/Iterator;
   #67 = Class              #69           // java/util/List
   #68 = NameAndType        #70:#71       // iterator:()Ljava/util/Iterator;
   #69 = Utf8               java/util/List
   #70 = Utf8               iterator
   #71 = Utf8               ()Ljava/util/Iterator;
   #72 = InterfaceMethodref #73.#74       // java/util/Iterator.hasNext:()Z
   #73 = Class              #75           // java/util/Iterator
   #74 = NameAndType        #76:#77       // hasNext:()Z
   #75 = Utf8               java/util/Iterator
   #76 = Utf8               hasNext
   #77 = Utf8               ()Z
   #78 = InterfaceMethodref #73.#79       // java/util/Iterator.next:()Ljava/lang/Object;
   #79 = NameAndType        #80:#81       // next:()Ljava/lang/Object;
   #80 = Utf8               next
   #81 = Utf8               ()Ljava/lang/Object;
   #82 = Class              #83           // ext/mods/gameserver/model/item/kind/Item
   #83 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #84 = Methodref          #82.#85       // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
   #85 = NameAndType        #86:#87       // getItemId:()I
   #86 = Utf8               getItemId
   #87 = Utf8               ()I
   #88 = Class              #89           // ext/mods/gameserver/model/item/kind/EtcItem
   #89 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
   #90 = Methodref          #91.#92       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #91 = Class              #93           // java/lang/Integer
   #92 = NameAndType        #94:#95       // valueOf:(I)Ljava/lang/Integer;
   #93 = Utf8               java/lang/Integer
   #94 = Utf8               valueOf
   #95 = Utf8               (I)Ljava/lang/Integer;
   #96 = InterfaceMethodref #17.#97       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #97 = NameAndType        #98:#99       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #98 = Utf8               put
   #99 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #100 = Class              #101          // ext/mods/gameserver/model/item/kind/Armor
  #101 = Utf8               ext/mods/gameserver/model/item/kind/Armor
  #102 = Class              #103          // ext/mods/gameserver/model/item/kind/Weapon
  #103 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #104 = Fieldref           #8.#105       // ext/mods/gameserver/data/xml/ItemData._templates:[Lext/mods/gameserver/model/item/kind/Item;
  #105 = NameAndType        #106:#107     // _templates:[Lext/mods/gameserver/model/item/kind/Item;
  #106 = Utf8               _templates
  #107 = Utf8               [Lext/mods/gameserver/model/item/kind/Item;
  #108 = InterfaceMethodref #17.#109      // java/util/Map.values:()Ljava/util/Collection;
  #109 = NameAndType        #110:#111     // values:()Ljava/util/Collection;
  #110 = Utf8               values
  #111 = Utf8               ()Ljava/util/Collection;
  #112 = InterfaceMethodref #113.#68      // java/util/Collection.iterator:()Ljava/util/Iterator;
  #113 = Class              #114          // java/util/Collection
  #114 = Utf8               java/util/Collection
  #115 = Methodref          #100.#85      // ext/mods/gameserver/model/item/kind/Armor.getItemId:()I
  #116 = Methodref          #102.#85      // ext/mods/gameserver/model/item/kind/Weapon.getItemId:()I
  #117 = Methodref          #88.#85       // ext/mods/gameserver/model/item/kind/EtcItem.getItemId:()I
  #118 = Fieldref           #8.#119       // ext/mods/gameserver/data/xml/ItemData.LOGGER:Lext/mods/commons/logging/CLogger;
  #119 = NameAndType        #120:#121     // LOGGER:Lext/mods/commons/logging/CLogger;
  #120 = Utf8               LOGGER
  #121 = Utf8               Lext/mods/commons/logging/CLogger;
  #122 = String             #123          // Loaded items.
  #123 = Utf8               Loaded items.
  #124 = Methodref          #125.#126     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #125 = Class              #127          // ext/mods/commons/logging/CLogger
  #126 = NameAndType        #128:#129     // info:(Ljava/lang/Object;)V
  #127 = Utf8               ext/mods/commons/logging/CLogger
  #128 = Utf8               info
  #129 = Utf8               (Ljava/lang/Object;)V
  #130 = Methodref          #8.#131       // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #131 = NameAndType        #132:#133     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #132 = Utf8               getTemplate
  #133 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #134 = Class              #135          // ext/mods/gameserver/model/item/instance/ItemInstance
  #135 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #136 = Methodref          #134.#137     // ext/mods/gameserver/model/item/instance/ItemInstance."<init>":(ILext/mods/gameserver/model/item/kind/Item;)V
  #137 = NameAndType        #5:#138       // "<init>":(ILext/mods/gameserver/model/item/kind/Item;)V
  #138 = Utf8               (ILext/mods/gameserver/model/item/kind/Item;)V
  #139 = Class              #140          // java/util/ArrayList
  #140 = Utf8               java/util/ArrayList
  #141 = Methodref          #139.#3       // java/util/ArrayList."<init>":()V
  #142 = Methodref          #143.#144     // java/lang/String.toLowerCase:()Ljava/lang/String;
  #143 = Class              #145          // java/lang/String
  #144 = NameAndType        #146:#147     // toLowerCase:()Ljava/lang/String;
  #145 = Utf8               java/lang/String
  #146 = Utf8               toLowerCase
  #147 = Utf8               ()Ljava/lang/String;
  #148 = Methodref          #100.#149     // ext/mods/gameserver/model/item/kind/Armor.getName:()Ljava/lang/String;
  #149 = NameAndType        #150:#147     // getName:()Ljava/lang/String;
  #150 = Utf8               getName
  #151 = Methodref          #143.#152     // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #152 = NameAndType        #153:#154     // contains:(Ljava/lang/CharSequence;)Z
  #153 = Utf8               contains
  #154 = Utf8               (Ljava/lang/CharSequence;)Z
  #155 = InterfaceMethodref #67.#156      // java/util/List.add:(Ljava/lang/Object;)Z
  #156 = NameAndType        #157:#158     // add:(Ljava/lang/Object;)Z
  #157 = Utf8               add
  #158 = Utf8               (Ljava/lang/Object;)Z
  #159 = Methodref          #88.#149      // ext/mods/gameserver/model/item/kind/EtcItem.getName:()Ljava/lang/String;
  #160 = Methodref          #102.#149     // ext/mods/gameserver/model/item/kind/Weapon.getName:()Ljava/lang/String;
  #161 = Methodref          #143.#162     // java/lang/String.trim:()Ljava/lang/String;
  #162 = NameAndType        #163:#147     // trim:()Ljava/lang/String;
  #163 = Utf8               trim
  #164 = Methodref          #143.#165     // java/lang/String.isEmpty:()Z
  #165 = NameAndType        #166:#77      // isEmpty:()Z
  #166 = Utf8               isEmpty
  #167 = Methodref          #143.#168     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #168 = NameAndType        #169:#170     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #169 = Utf8               equalsIgnoreCase
  #170 = Utf8               (Ljava/lang/String;)Z
  #171 = Fieldref           #172.#173     // ext/mods/gameserver/data/xml/ItemData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/ItemData;
  #172 = Class              #174          // ext/mods/gameserver/data/xml/ItemData$SingletonHolder
  #173 = NameAndType        #175:#176     // INSTANCE:Lext/mods/gameserver/data/xml/ItemData;
  #174 = Utf8               ext/mods/gameserver/data/xml/ItemData$SingletonHolder
  #175 = Utf8               INSTANCE
  #176 = Utf8               Lext/mods/gameserver/data/xml/ItemData;
  #177 = Methodref          #178.#149     // java/lang/Class.getName:()Ljava/lang/String;
  #178 = Class              #179          // java/lang/Class
  #179 = Utf8               java/lang/Class
  #180 = Methodref          #125.#181     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #181 = NameAndType        #5:#182       // "<init>":(Ljava/lang/String;)V
  #182 = Utf8               (Ljava/lang/String;)V
  #183 = Class              #184          // java/util/HashMap
  #184 = Utf8               java/util/HashMap
  #185 = Methodref          #183.#3       // java/util/HashMap."<init>":()V
  #186 = Utf8               Signature
  #187 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/item/kind/Armor;>;
  #188 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/item/kind/EtcItem;>;
  #189 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/item/kind/Weapon;>;
  #190 = Utf8               Code
  #191 = Utf8               LineNumberTable
  #192 = Utf8               LocalVariableTable
  #193 = Utf8               this
  #194 = Utf8               reload
  #195 = Utf8               etcItem
  #196 = Utf8               Lext/mods/gameserver/model/item/kind/EtcItem;
  #197 = Utf8               armor
  #198 = Utf8               Lext/mods/gameserver/model/item/kind/Armor;
  #199 = Utf8               weapon
  #200 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #201 = Utf8               item
  #202 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #203 = Utf8               document
  #204 = Utf8               Lext/mods/gameserver/data/DocumentItem;
  #205 = Utf8               file
  #206 = Utf8               Ljava/io/File;
  #207 = Utf8               dir
  #208 = Utf8               highest
  #209 = Utf8               I
  #210 = Utf8               StackMapTable
  #211 = Class              #212          // "[Ljava/io/File;"
  #212 = Utf8               [Ljava/io/File;
  #213 = Utf8               createDummyItem
  #214 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #215 = Utf8               itemId
  #216 = Utf8               id
  #217 = Utf8               getArraySize
  #218 = Utf8               getTemplates
  #219 = Utf8               ()[Lext/mods/gameserver/model/item/kind/Item;
  #220 = Utf8               searchItemsByName
  #221 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #222 = Utf8               name
  #223 = Utf8               Ljava/lang/String;
  #224 = Utf8               result
  #225 = Utf8               Ljava/util/List;
  #226 = Utf8               lowerName
  #227 = Utf8               LocalVariableTypeTable
  #228 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/kind/Item;>;
  #229 = Utf8               (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/item/kind/Item;>;
  #230 = Utf8               getItemIdByName
  #231 = Utf8               (Ljava/lang/String;)I
  #232 = Utf8               itemName
  #233 = Utf8               getInstance
  #234 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #235 = Utf8               <clinit>
  #236 = Utf8               SourceFile
  #237 = Utf8               ItemData.java
  #238 = Utf8               NestMembers
  #239 = Utf8               InnerClasses
  #240 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.data.xml.ItemData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokevirtual #7                  // Method load:()V
         8: return
      LineNumberTable:
        line 48: 0
        line 49: 4
        line 50: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/data/xml/ItemData;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #12                 // Field armors:Ljava/util/Map;
         3: invokeinterface #16,  1           // InterfaceMethod java/util/Map.clear:()V
         8: getstatic     #21                 // Field etcItems:Ljava/util/Map;
        11: invokeinterface #16,  1           // InterfaceMethod java/util/Map.clear:()V
        16: getstatic     #24                 // Field weapons:Ljava/util/Map;
        19: invokeinterface #16,  1           // InterfaceMethod java/util/Map.clear:()V
        24: aload_0
        25: invokevirtual #7                  // Method load:()V
        28: return
      LineNumberTable:
        line 54: 0
        line 55: 8
        line 56: 16
        line 58: 24
        line 59: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/data/xml/ItemData;

  public ext.mods.gameserver.model.item.instance.ItemInstance createDummyItem(int);
    descriptor: (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: iload_1
         2: invokevirtual #130                // Method getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
         5: astore_2
         6: aload_2
         7: ifnonnull     12
        10: aconst_null
        11: areturn
        12: new           #134                // class ext/mods/gameserver/model/item/instance/ItemInstance
        15: dup
        16: iconst_0
        17: aload_2
        18: invokespecial #136                // Method ext/mods/gameserver/model/item/instance/ItemInstance."<init>":(ILext/mods/gameserver/model/item/kind/Item;)V
        21: areturn
      LineNumberTable:
        line 101: 0
        line 102: 6
        line 103: 10
        line 105: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/data/xml/ItemData;
            0      22     1 itemId   I
            6      16     2  item   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]

  public ext.mods.gameserver.model.item.kind.Item getTemplate(int);
    descriptor: (I)Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: aload_0
         2: getfield      #104                // Field _templates:[Lext/mods/gameserver/model/item/kind/Item;
         5: arraylength
         6: if_icmplt     13
         9: aconst_null
        10: goto          19
        13: aload_0
        14: getfield      #104                // Field _templates:[Lext/mods/gameserver/model/item/kind/Item;
        17: iload_1
        18: aaload
        19: areturn
      LineNumberTable:
        line 114: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/ItemData;
            0      20     1    id   I
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/kind/Item ]

  public int getArraySize();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #104                // Field _templates:[Lext/mods/gameserver/model/item/kind/Item;
         4: arraylength
         5: ireturn
      LineNumberTable:
        line 119: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/data/xml/ItemData;

  public ext.mods.gameserver.model.item.kind.Item[] getTemplates();
    descriptor: ()[Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #104                // Field _templates:[Lext/mods/gameserver/model/item/kind/Item;
         4: areturn
      LineNumberTable:
        line 127: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/ItemData;

  public java.util.List<ext.mods.gameserver.model.item.kind.Item> searchItemsByName(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=2
         0: new           #139                // class java/util/ArrayList
         3: dup
         4: invokespecial #141                // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: aload_1
         9: invokevirtual #142                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        12: astore_3
        13: getstatic     #12                 // Field armors:Ljava/util/Map;
        16: invokeinterface #108,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        21: invokeinterface #112,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        26: astore        4
        28: aload         4
        30: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          77
        38: aload         4
        40: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        45: checkcast     #100                // class ext/mods/gameserver/model/item/kind/Armor
        48: astore        5
        50: aload         5
        52: invokevirtual #148                // Method ext/mods/gameserver/model/item/kind/Armor.getName:()Ljava/lang/String;
        55: invokevirtual #142                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        58: aload_3
        59: invokevirtual #151                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        62: ifeq          74
        65: aload_2
        66: aload         5
        68: invokeinterface #155,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        73: pop
        74: goto          28
        77: getstatic     #21                 // Field etcItems:Ljava/util/Map;
        80: invokeinterface #108,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        85: invokeinterface #112,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        90: astore        4
        92: aload         4
        94: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        99: ifeq          141
       102: aload         4
       104: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       109: checkcast     #88                 // class ext/mods/gameserver/model/item/kind/EtcItem
       112: astore        5
       114: aload         5
       116: invokevirtual #159                // Method ext/mods/gameserver/model/item/kind/EtcItem.getName:()Ljava/lang/String;
       119: invokevirtual #142                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       122: aload_3
       123: invokevirtual #151                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       126: ifeq          138
       129: aload_2
       130: aload         5
       132: invokeinterface #155,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       137: pop
       138: goto          92
       141: getstatic     #24                 // Field weapons:Ljava/util/Map;
       144: invokeinterface #108,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       149: invokeinterface #112,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       154: astore        4
       156: aload         4
       158: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       163: ifeq          205
       166: aload         4
       168: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       173: checkcast     #102                // class ext/mods/gameserver/model/item/kind/Weapon
       176: astore        5
       178: aload         5
       180: invokevirtual #160                // Method ext/mods/gameserver/model/item/kind/Weapon.getName:()Ljava/lang/String;
       183: invokevirtual #142                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       186: aload_3
       187: invokevirtual #151                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       190: ifeq          202
       193: aload_2
       194: aload         5
       196: invokeinterface #155,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       201: pop
       202: goto          156
       205: aload_2
       206: areturn
      LineNumberTable:
        line 132: 0
        line 133: 8
        line 135: 13
        line 137: 50
        line 139: 65
        line 141: 74
        line 143: 77
        line 145: 114
        line 147: 129
        line 149: 138
        line 151: 141
        line 153: 178
        line 155: 193
        line 157: 202
        line 159: 205
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           50      24     5 armor   Lext/mods/gameserver/model/item/kind/Armor;
          114      24     5 etcItem   Lext/mods/gameserver/model/item/kind/EtcItem;
          178      24     5 weapon   Lext/mods/gameserver/model/item/kind/Weapon;
            0     207     0  this   Lext/mods/gameserver/data/xml/ItemData;
            0     207     1  name   Ljava/lang/String;
            8     199     2 result   Ljava/util/List;
           13     194     3 lowerName   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     199     2 result   Ljava/util/List<Lext/mods/gameserver/model/item/kind/Item;>;
      StackMapTable: number_of_entries = 9
        frame_type = 254 /* append */
          offset_delta = 28
          locals = [ class java/util/List, class java/lang/String, class java/util/Iterator ]
        frame_type = 45 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 45 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 45 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #229                         // (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/item/kind/Item;>;

  public int getItemIdByName(java.lang.String);
    descriptor: (Ljava/lang/String;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: ifnull        14
         4: aload_1
         5: invokevirtual #161                // Method java/lang/String.trim:()Ljava/lang/String;
         8: invokevirtual #164                // Method java/lang/String.isEmpty:()Z
        11: ifeq          16
        14: iconst_m1
        15: ireturn
        16: getstatic     #12                 // Field armors:Ljava/util/Map;
        19: invokeinterface #108,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        24: invokeinterface #112,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        29: astore_2
        30: aload_2
        31: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        36: ifeq          68
        39: aload_2
        40: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        45: checkcast     #100                // class ext/mods/gameserver/model/item/kind/Armor
        48: astore_3
        49: aload_3
        50: invokevirtual #148                // Method ext/mods/gameserver/model/item/kind/Armor.getName:()Ljava/lang/String;
        53: aload_1
        54: invokevirtual #167                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        57: ifeq          65
        60: aload_3
        61: invokevirtual #115                // Method ext/mods/gameserver/model/item/kind/Armor.getItemId:()I
        64: ireturn
        65: goto          30
        68: getstatic     #21                 // Field etcItems:Ljava/util/Map;
        71: invokeinterface #108,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        76: invokeinterface #112,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        81: astore_2
        82: aload_2
        83: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        88: ifeq          120
        91: aload_2
        92: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        97: checkcast     #88                 // class ext/mods/gameserver/model/item/kind/EtcItem
       100: astore_3
       101: aload_3
       102: invokevirtual #159                // Method ext/mods/gameserver/model/item/kind/EtcItem.getName:()Ljava/lang/String;
       105: aload_1
       106: invokevirtual #167                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       109: ifeq          117
       112: aload_3
       113: invokevirtual #117                // Method ext/mods/gameserver/model/item/kind/EtcItem.getItemId:()I
       116: ireturn
       117: goto          82
       120: getstatic     #24                 // Field weapons:Ljava/util/Map;
       123: invokeinterface #108,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       128: invokeinterface #112,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       133: astore_2
       134: aload_2
       135: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       140: ifeq          172
       143: aload_2
       144: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       149: checkcast     #102                // class ext/mods/gameserver/model/item/kind/Weapon
       152: astore_3
       153: aload_3
       154: invokevirtual #160                // Method ext/mods/gameserver/model/item/kind/Weapon.getName:()Ljava/lang/String;
       157: aload_1
       158: invokevirtual #167                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       161: ifeq          169
       164: aload_3
       165: invokevirtual #116                // Method ext/mods/gameserver/model/item/kind/Weapon.getItemId:()I
       168: ireturn
       169: goto          134
       172: iconst_m1
       173: ireturn
      LineNumberTable:
        line 166: 0
        line 168: 14
        line 171: 16
        line 173: 49
        line 175: 60
        line 177: 65
        line 179: 68
        line 181: 101
        line 183: 112
        line 185: 117
        line 187: 120
        line 189: 153
        line 191: 164
        line 193: 169
        line 195: 172
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49      16     3 armor   Lext/mods/gameserver/model/item/kind/Armor;
          101      16     3 etcItem   Lext/mods/gameserver/model/item/kind/EtcItem;
          153      16     3 weapon   Lext/mods/gameserver/model/item/kind/Weapon;
            0     174     0  this   Lext/mods/gameserver/data/xml/ItemData;
            0     174     1 itemName   Ljava/lang/String;
      StackMapTable: number_of_entries = 11
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/util/Iterator ]
        frame_type = 34 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/util/Iterator ]
        frame_type = 34 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/util/Iterator ]
        frame_type = 34 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public static ext.mods.gameserver.data.xml.ItemData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/ItemData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #171                // Field ext/mods/gameserver/data/xml/ItemData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/ItemData;
         3: areturn
      LineNumberTable:
        line 200: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #125                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/data/xml/ItemData
         6: invokevirtual #177                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #180                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #118                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: new           #183                // class java/util/HashMap
        18: dup
        19: invokespecial #185                // Method java/util/HashMap."<init>":()V
        22: putstatic     #12                 // Field armors:Ljava/util/Map;
        25: new           #183                // class java/util/HashMap
        28: dup
        29: invokespecial #185                // Method java/util/HashMap."<init>":()V
        32: putstatic     #21                 // Field etcItems:Ljava/util/Map;
        35: new           #183                // class java/util/HashMap
        38: dup
        39: invokespecial #185                // Method java/util/HashMap."<init>":()V
        42: putstatic     #24                 // Field weapons:Ljava/util/Map;
        45: return
      LineNumberTable:
        line 40: 0
        line 43: 15
        line 44: 25
        line 45: 35
}
SourceFile: "ItemData.java"
NestMembers:
  ext/mods/gameserver/data/xml/ItemData$SingletonHolder
