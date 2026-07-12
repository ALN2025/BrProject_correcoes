// Bytecode for: ext.mods.gameserver.custom.data.OlympiadEnchantData
// File: ext\mods\gameserver\custom\data\OlympiadEnchantData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/OlympiadEnchantData.class
  Last modified 9 de jul de 2026; size 5508 bytes
  MD5 checksum de7596aee285117aa377e4b8c0a6ef4c
  Compiled from "OlympiadEnchantData.java"
public class ext.mods.gameserver.custom.data.OlympiadEnchantData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/custom/data/OlympiadEnchantData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 5, methods: 8, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/custom/data/OlympiadEnchantData.enabled:Z
    #8 = Class              #10           // ext/mods/gameserver/custom/data/OlympiadEnchantData
    #9 = NameAndType        #11:#12       // enabled:Z
   #10 = Utf8               ext/mods/gameserver/custom/data/OlympiadEnchantData
   #11 = Utf8               enabled
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/custom/data/OlympiadEnchantData.enchantValue:I
   #14 = NameAndType        #15:#16       // enchantValue:I
   #15 = Utf8               enchantValue
   #16 = Utf8               I
   #17 = String             #18           //
   #18 = Utf8
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/custom/data/OlympiadEnchantData.enterMessage:Ljava/lang/String;
   #20 = NameAndType        #21:#22       // enterMessage:Ljava/lang/String;
   #21 = Utf8               enterMessage
   #22 = Utf8               Ljava/lang/String;
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/custom/data/OlympiadEnchantData.exitMessage:Ljava/lang/String;
   #24 = NameAndType        #25:#22       // exitMessage:Ljava/lang/String;
   #25 = Utf8               exitMessage
   #26 = Class              #27           // java/util/HashMap
   #27 = Utf8               java/util/HashMap
   #28 = Methodref          #26.#3        // java/util/HashMap."<init>":()V
   #29 = Fieldref           #8.#30        // ext/mods/gameserver/custom/data/OlympiadEnchantData.enchantBackup:Ljava/util/Map;
   #30 = NameAndType        #31:#32       // enchantBackup:Ljava/util/Map;
   #31 = Utf8               enchantBackup
   #32 = Utf8               Ljava/util/Map;
   #33 = Methodref          #8.#34        // ext/mods/gameserver/custom/data/OlympiadEnchantData.load:()V
   #34 = NameAndType        #35:#6        // load:()V
   #35 = Utf8               load
   #36 = String             #37           // custom/mods/olympiad_enchant_config.xml
   #37 = Utf8               custom/mods/olympiad_enchant_config.xml
   #38 = Methodref          #8.#39        // ext/mods/gameserver/custom/data/OlympiadEnchantData.parseDataFile:(Ljava/lang/String;)V
   #39 = NameAndType        #40:#41       // parseDataFile:(Ljava/lang/String;)V
   #40 = Utf8               parseDataFile
   #41 = Utf8               (Ljava/lang/String;)V
   #42 = String             #43           // olympiadEnchant
   #43 = Utf8               olympiadEnchant
   #44 = InvokeDynamic      #0:#45        // #0:accept:(Lext/mods/gameserver/custom/data/OlympiadEnchantData;)Ljava/util/function/Consumer;
   #45 = NameAndType        #46:#47       // accept:(Lext/mods/gameserver/custom/data/OlympiadEnchantData;)Ljava/util/function/Consumer;
   #46 = Utf8               accept
   #47 = Utf8               (Lext/mods/gameserver/custom/data/OlympiadEnchantData;)Ljava/util/function/Consumer;
   #48 = Methodref          #8.#49        // ext/mods/gameserver/custom/data/OlympiadEnchantData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #49 = NameAndType        #50:#51       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #50 = Utf8               forEach
   #51 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #52 = Methodref          #53.#54       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #53 = Class              #55           // ext/mods/gameserver/model/actor/Player
   #54 = NameAndType        #56:#57       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #55 = Utf8               ext/mods/gameserver/model/actor/Player
   #56 = Utf8               getInventory
   #57 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #58 = Methodref          #59.#60       // ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
   #59 = Class              #61           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #60 = NameAndType        #62:#63       // getPaperdollItems:()Ljava/util/List;
   #61 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #62 = Utf8               getPaperdollItems
   #63 = Utf8               ()Ljava/util/List;
   #64 = InterfaceMethodref #65.#66       // java/util/List.iterator:()Ljava/util/Iterator;
   #65 = Class              #67           // java/util/List
   #66 = NameAndType        #68:#69       // iterator:()Ljava/util/Iterator;
   #67 = Utf8               java/util/List
   #68 = Utf8               iterator
   #69 = Utf8               ()Ljava/util/Iterator;
   #70 = InterfaceMethodref #71.#72       // java/util/Iterator.hasNext:()Z
   #71 = Class              #73           // java/util/Iterator
   #72 = NameAndType        #74:#75       // hasNext:()Z
   #73 = Utf8               java/util/Iterator
   #74 = Utf8               hasNext
   #75 = Utf8               ()Z
   #76 = InterfaceMethodref #71.#77       // java/util/Iterator.next:()Ljava/lang/Object;
   #77 = NameAndType        #78:#79       // next:()Ljava/lang/Object;
   #78 = Utf8               next
   #79 = Utf8               ()Ljava/lang/Object;
   #80 = Class              #81           // ext/mods/gameserver/model/item/instance/ItemInstance
   #81 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #82 = Methodref          #80.#83       // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
   #83 = NameAndType        #84:#75       // isEquipable:()Z
   #84 = Utf8               isEquipable
   #85 = Methodref          #80.#86       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #86 = NameAndType        #87:#88       // getObjectId:()I
   #87 = Utf8               getObjectId
   #88 = Utf8               ()I
   #89 = Methodref          #90.#91       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #90 = Class              #92           // java/lang/Integer
   #91 = NameAndType        #93:#94       // valueOf:(I)Ljava/lang/Integer;
   #92 = Utf8               java/lang/Integer
   #93 = Utf8               valueOf
   #94 = Utf8               (I)Ljava/lang/Integer;
   #95 = Methodref          #80.#96       // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #96 = NameAndType        #97:#88       // getEnchantLevel:()I
   #97 = Utf8               getEnchantLevel
   #98 = InterfaceMethodref #99.#100      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #99 = Class              #101          // java/util/Map
  #100 = NameAndType        #102:#103     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #101 = Utf8               java/util/Map
  #102 = Utf8               put
  #103 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #104 = Methodref          #80.#105      // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #105 = NameAndType        #106:#107     // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #106 = Utf8               setEnchantLevel
  #107 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #108 = Methodref          #53.#86       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #109 = String             #110          // {enchant}
  #110 = Utf8               {enchant}
  #111 = Methodref          #112.#113     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #112 = Class              #114          // java/lang/String
  #113 = NameAndType        #93:#115      // valueOf:(I)Ljava/lang/String;
  #114 = Utf8               java/lang/String
  #115 = Utf8               (I)Ljava/lang/String;
  #116 = Methodref          #112.#117     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #117 = NameAndType        #118:#119     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #118 = Utf8               replace
  #119 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #120 = Methodref          #53.#121      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #121 = NameAndType        #122:#41      // sendMessage:(Ljava/lang/String;)V
  #122 = Utf8               sendMessage
  #123 = Class              #124          // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #124 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #125 = Methodref          #123.#126     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
  #126 = NameAndType        #5:#127       // "<init>":(Ljava/lang/String;I)V
  #127 = Utf8               (Ljava/lang/String;I)V
  #128 = Methodref          #53.#129      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #129 = NameAndType        #130:#131     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #130 = Utf8               sendPacket
  #131 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #132 = Methodref          #53.#133      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #133 = NameAndType        #134:#6       // broadcastUserInfo:()V
  #134 = Utf8               broadcastUserInfo
  #135 = InterfaceMethodref #99.#136      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #136 = NameAndType        #137:#138     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #137 = Utf8               remove
  #138 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #139 = InterfaceMethodref #99.#140      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #140 = NameAndType        #141:#138     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #141 = Utf8               get
  #142 = Methodref          #90.#143      // java/lang/Integer.intValue:()I
  #143 = NameAndType        #144:#88      // intValue:()I
  #144 = Utf8               intValue
  #145 = Fieldref           #146.#147     // ext/mods/gameserver/custom/data/OlympiadEnchantData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/OlympiadEnchantData;
  #146 = Class              #148          // ext/mods/gameserver/custom/data/OlympiadEnchantData$SingletonHolder
  #147 = NameAndType        #149:#150     // INSTANCE:Lext/mods/gameserver/custom/data/OlympiadEnchantData;
  #148 = Utf8               ext/mods/gameserver/custom/data/OlympiadEnchantData$SingletonHolder
  #149 = Utf8               INSTANCE
  #150 = Utf8               Lext/mods/gameserver/custom/data/OlympiadEnchantData;
  #151 = Class              #152          // ext/mods/commons/data/StatSet
  #152 = Utf8               ext/mods/commons/data/StatSet
  #153 = Methodref          #8.#154       // ext/mods/gameserver/custom/data/OlympiadEnchantData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #154 = NameAndType        #155:#156     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #155 = Utf8               parseAttributes
  #156 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #157 = Methodref          #151.#158     // ext/mods/commons/data/StatSet."<init>":(Lext/mods/commons/data/StatSet;)V
  #158 = NameAndType        #5:#159       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #159 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #160 = String             #11           // enabled
  #161 = Methodref          #151.#162     // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #162 = NameAndType        #163:#164     // getBool:(Ljava/lang/String;Z)Z
  #163 = Utf8               getBool
  #164 = Utf8               (Ljava/lang/String;Z)Z
  #165 = String             #166          // value
  #166 = Utf8               value
  #167 = Methodref          #151.#168     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #168 = NameAndType        #169:#170     // getInteger:(Ljava/lang/String;I)I
  #169 = Utf8               getInteger
  #170 = Utf8               (Ljava/lang/String;I)I
  #171 = InterfaceMethodref #172.#173     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #172 = Class              #174          // org/w3c/dom/Node
  #173 = NameAndType        #175:#176     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #174 = Utf8               org/w3c/dom/Node
  #175 = Utf8               getAttributes
  #176 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #177 = String             #21           // enterMessage
  #178 = String             #179          // Their equipment has been refined to +{enchant} for the Olympiad.
  #179 = Utf8               Their equipment has been refined to +{enchant} for the Olympiad.
  #180 = Methodref          #8.#181       // ext/mods/gameserver/custom/data/OlympiadEnchantData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #181 = NameAndType        #182:#183     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #182 = Utf8               parseString
  #183 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #184 = String             #25           // exitMessage
  #185 = String             #186          // Your equipment has returned to its original refinement.
  #186 = Utf8               Your equipment has returned to its original refinement.
  #187 = Class              #188          // ext/mods/commons/data/xml/IXmlReader
  #188 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #189 = Utf8               Signature
  #190 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;>;
  #191 = Utf8               Code
  #192 = Utf8               LineNumberTable
  #193 = Utf8               LocalVariableTable
  #194 = Utf8               this
  #195 = Utf8               parseDocument
  #196 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #197 = Utf8               doc
  #198 = Utf8               Lorg/w3c/dom/Document;
  #199 = Utf8               path
  #200 = Utf8               Ljava/nio/file/Path;
  #201 = Utf8               applyOlympiadEnchant
  #202 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #203 = Utf8               item
  #204 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #205 = Utf8               player
  #206 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #207 = Utf8               originalEnchants
  #208 = Utf8               LocalVariableTypeTable
  #209 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #210 = Utf8               StackMapTable
  #211 = Utf8               restoreEnchant
  #212 = Utf8               original
  #213 = Utf8               Ljava/lang/Integer;
  #214 = Utf8               backup
  #215 = Utf8               isEnabled
  #216 = Utf8               getInstance
  #217 = Utf8               ()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
  #218 = Utf8               lambda$parseDocument$0
  #219 = Utf8               (Lorg/w3c/dom/Node;)V
  #220 = Utf8               node
  #221 = Utf8               Lorg/w3c/dom/Node;
  #222 = Utf8               set
  #223 = Utf8               Lext/mods/commons/data/StatSet;
  #224 = Utf8               attrs
  #225 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #226 = Utf8               SourceFile
  #227 = Utf8               OlympiadEnchantData.java
  #228 = Utf8               NestMembers
  #229 = Utf8               BootstrapMethods
  #230 = MethodType         #231          //  (Ljava/lang/Object;)V
  #231 = Utf8               (Ljava/lang/Object;)V
  #232 = MethodHandle       5:#233        // REF_invokeVirtual ext/mods/gameserver/custom/data/OlympiadEnchantData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #233 = Methodref          #8.#234       // ext/mods/gameserver/custom/data/OlympiadEnchantData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #234 = NameAndType        #218:#219     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #235 = MethodType         #219          //  (Lorg/w3c/dom/Node;)V
  #236 = MethodHandle       6:#237        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #237 = Methodref          #238.#239     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #238 = Class              #240          // java/lang/invoke/LambdaMetafactory
  #239 = NameAndType        #241:#242     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #240 = Utf8               java/lang/invoke/LambdaMetafactory
  #241 = Utf8               metafactory
  #242 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #243 = Utf8               InnerClasses
  #244 = Utf8               SingletonHolder
  #245 = Class              #246          // java/lang/invoke/MethodHandles$Lookup
  #246 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #247 = Class              #248          // java/lang/invoke/MethodHandles
  #248 = Utf8               java/lang/invoke/MethodHandles
  #249 = Utf8               Lookup
{
  protected ext.mods.gameserver.custom.data.OlympiadEnchantData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field enabled:Z
         9: aload_0
        10: bipush        6
        12: putfield      #13                 // Field enchantValue:I
        15: aload_0
        16: ldc           #17                 // String
        18: putfield      #19                 // Field enterMessage:Ljava/lang/String;
        21: aload_0
        22: ldc           #17                 // String
        24: putfield      #23                 // Field exitMessage:Ljava/lang/String;
        27: aload_0
        28: new           #26                 // class java/util/HashMap
        31: dup
        32: invokespecial #28                 // Method java/util/HashMap."<init>":()V
        35: putfield      #29                 // Field enchantBackup:Ljava/util/Map;
        38: aload_0
        39: invokevirtual #33                 // Method load:()V
        42: return
      LineNumberTable:
        line 45: 0
        line 37: 4
        line 38: 9
        line 39: 15
        line 40: 21
        line 42: 27
        line 46: 38
        line 47: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/custom/data/OlympiadEnchantData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #36                 // String custom/mods/olympiad_enchant_config.xml
         3: invokevirtual #38                 // Method parseDataFile:(Ljava/lang/String;)V
         6: return
      LineNumberTable:
        line 52: 0
        line 53: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/custom/data/OlympiadEnchantData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #42                 // String olympiadEnchant
         4: aload_0
         5: invokedynamic #44,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/custom/data/OlympiadEnchantData;)Ljava/util/function/Consumer;
        10: invokevirtual #48                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 58: 0
        line 68: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/OlympiadEnchantData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void applyOlympiadEnchant(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=2
         0: aload_0
         1: getfield      #7                  // Field enabled:Z
         4: ifeq          11
         7: aload_1
         8: ifnonnull     12
        11: return
        12: new           #26                 // class java/util/HashMap
        15: dup
        16: invokespecial #28                 // Method java/util/HashMap."<init>":()V
        19: astore_2
        20: aload_1
        21: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        24: invokevirtual #58                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
        27: invokeinterface #64,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        32: astore_3
        33: aload_3
        34: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        39: ifeq          102
        42: aload_3
        43: invokeinterface #76,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        48: checkcast     #80                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        51: astore        4
        53: aload         4
        55: ifnull        99
        58: aload         4
        60: invokevirtual #82                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
        63: ifeq          99
        66: aload_2
        67: aload         4
        69: invokevirtual #85                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        72: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        75: aload         4
        77: invokevirtual #95                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        80: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        83: invokeinterface #98,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        88: pop
        89: aload         4
        91: aload_0
        92: getfield      #13                 // Field enchantValue:I
        95: aload_1
        96: invokevirtual #104                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
        99: goto          33
       102: aload_0
       103: getfield      #29                 // Field enchantBackup:Ljava/util/Map;
       106: aload_1
       107: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       110: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       113: aload_2
       114: invokeinterface #98,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       119: pop
       120: aload_1
       121: aload_0
       122: getfield      #19                 // Field enterMessage:Ljava/lang/String;
       125: ldc           #109                // String {enchant}
       127: aload_0
       128: getfield      #13                 // Field enchantValue:I
       131: invokestatic  #111                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       134: invokevirtual #116                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       137: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       140: aload_1
       141: new           #123                // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
       144: dup
       145: aload_0
       146: getfield      #19                 // Field enterMessage:Ljava/lang/String;
       149: ldc           #109                // String {enchant}
       151: aload_0
       152: getfield      #13                 // Field enchantValue:I
       155: invokestatic  #111                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       158: invokevirtual #116                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       161: sipush        4000
       164: invokespecial #125                // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
       167: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       170: aload_1
       171: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       174: return
      LineNumberTable:
        line 72: 0
        line 73: 11
        line 75: 12
        line 76: 20
        line 78: 53
        line 80: 66
        line 81: 89
        line 83: 99
        line 84: 102
        line 86: 120
        line 87: 140
        line 88: 170
        line 89: 174
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      46     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     175     0  this   Lext/mods/gameserver/custom/data/OlympiadEnchantData;
            0     175     1 player   Lext/mods/gameserver/model/actor/Player;
           20     155     2 originalEnchants   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           20     155     2 originalEnchants   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 5
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ class java/util/Map, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 65
        frame_type = 250 /* chop */
          offset_delta = 2

  public void restoreEnchant(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=2
         0: aload_0
         1: getfield      #7                  // Field enabled:Z
         4: ifeq          11
         7: aload_1
         8: ifnonnull     12
        11: return
        12: aload_0
        13: getfield      #29                 // Field enchantBackup:Ljava/util/Map;
        16: aload_1
        17: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        20: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        23: invokeinterface #135,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        28: checkcast     #99                 // class java/util/Map
        31: astore_2
        32: aload_2
        33: ifnonnull     37
        36: return
        37: aload_1
        38: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        41: invokevirtual #58                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
        44: invokeinterface #64,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        49: astore_3
        50: aload_3
        51: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        56: ifeq          121
        59: aload_3
        60: invokeinterface #76,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        65: checkcast     #80                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        68: astore        4
        70: aload         4
        72: ifnull        118
        75: aload         4
        77: invokevirtual #82                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
        80: ifeq          118
        83: aload_2
        84: aload         4
        86: invokevirtual #85                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        89: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        92: invokeinterface #139,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        97: checkcast     #90                 // class java/lang/Integer
       100: astore        5
       102: aload         5
       104: ifnull        118
       107: aload         4
       109: aload         5
       111: invokevirtual #142                // Method java/lang/Integer.intValue:()I
       114: aload_1
       115: invokevirtual #104                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       118: goto          50
       121: aload_1
       122: aload_0
       123: getfield      #23                 // Field exitMessage:Ljava/lang/String;
       126: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       129: aload_1
       130: new           #123                // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
       133: dup
       134: aload_0
       135: getfield      #23                 // Field exitMessage:Ljava/lang/String;
       138: sipush        4000
       141: invokespecial #125                // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
       144: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       147: aload_1
       148: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       151: return
      LineNumberTable:
        line 93: 0
        line 94: 11
        line 96: 12
        line 97: 32
        line 98: 36
        line 100: 37
        line 102: 70
        line 104: 83
        line 105: 102
        line 106: 107
        line 108: 118
        line 110: 121
        line 111: 129
        line 112: 147
        line 113: 151
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          102      16     5 original   Ljava/lang/Integer;
           70      48     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     152     0  this   Lext/mods/gameserver/custom/data/OlympiadEnchantData;
            0     152     1 player   Lext/mods/gameserver/model/actor/Player;
           32     120     2 backup   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           32     120     2 backup   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 6
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/util/Map ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean isEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field enabled:Z
         4: ireturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/OlympiadEnchantData;

  public static ext.mods.gameserver.custom.data.OlympiadEnchantData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #145                // Field ext/mods/gameserver/custom/data/OlympiadEnchantData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/OlympiadEnchantData;
         3: areturn
      LineNumberTable:
        line 122: 0
}
SourceFile: "OlympiadEnchantData.java"
NestMembers:
  ext/mods/gameserver/custom/data/OlympiadEnchantData$SingletonHolder
BootstrapMethods:
  0: #236 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #230 (Ljava/lang/Object;)V
      #232 REF_invokeVirtual ext/mods/gameserver/custom/data/OlympiadEnchantData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #235 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #249= #245 of #247; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
