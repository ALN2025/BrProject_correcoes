// Bytecode for: ext.mods.gameserver.data.manager.CursedWeaponManager
// File: ext\mods\gameserver\data\manager\CursedWeaponManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/CursedWeaponManager.class
  Last modified 9 de jul de 2026; size 7102 bytes
  MD5 checksum 53fd75215abe9ae6d31cbaddb25e32f2
  Compiled from "CursedWeaponManager.java"
public class ext.mods.gameserver.data.manager.CursedWeaponManager implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/CursedWeaponManager
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 17, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/CursedWeaponManager._cursedWeapons:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/CursedWeaponManager
   #12 = NameAndType        #14:#15       // _cursedWeapons:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/CursedWeaponManager
   #14 = Utf8               _cursedWeapons
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #17.#18       // ext/mods/Config.ALLOW_CURSED_WEAPONS:Z
   #17 = Class              #19           // ext/mods/Config
   #18 = NameAndType        #20:#21       // ALLOW_CURSED_WEAPONS:Z
   #19 = Utf8               ext/mods/Config
   #20 = Utf8               ALLOW_CURSED_WEAPONS
   #21 = Utf8               Z
   #22 = Fieldref           #11.#23       // ext/mods/gameserver/data/manager/CursedWeaponManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #23 = NameAndType        #24:#25       // LOGGER:Lext/mods/commons/logging/CLogger;
   #24 = Utf8               LOGGER
   #25 = Utf8               Lext/mods/commons/logging/CLogger;
   #26 = String             #27           // Cursed weapons loading is skipped.
   #27 = Utf8               Cursed weapons loading is skipped.
   #28 = Methodref          #29.#30       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #29 = Class              #31           // ext/mods/commons/logging/CLogger
   #30 = NameAndType        #32:#33       // info:(Ljava/lang/Object;)V
   #31 = Utf8               ext/mods/commons/logging/CLogger
   #32 = Utf8               info
   #33 = Utf8               (Ljava/lang/Object;)V
   #34 = Methodref          #11.#35       // ext/mods/gameserver/data/manager/CursedWeaponManager.load:()V
   #35 = NameAndType        #36:#6        // load:()V
   #36 = Utf8               load
   #37 = String             #38           // xml/cursedWeapons.xml
   #38 = Utf8               xml/cursedWeapons.xml
   #39 = Methodref          #11.#40       // ext/mods/gameserver/data/manager/CursedWeaponManager.parseDataFile:(Ljava/lang/String;)V
   #40 = NameAndType        #41:#42       // parseDataFile:(Ljava/lang/String;)V
   #41 = Utf8               parseDataFile
   #42 = Utf8               (Ljava/lang/String;)V
   #43 = String             #44           // Loaded {} cursed weapons.
   #44 = Utf8               Loaded {} cursed weapons.
   #45 = InterfaceMethodref #46.#47       // java/util/Map.size:()I
   #46 = Class              #48           // java/util/Map
   #47 = NameAndType        #49:#50       // size:()I
   #48 = Utf8               java/util/Map
   #49 = Utf8               size
   #50 = Utf8               ()I
   #51 = Methodref          #52.#53       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #52 = Class              #54           // java/lang/Integer
   #53 = NameAndType        #55:#56       // valueOf:(I)Ljava/lang/Integer;
   #54 = Utf8               java/lang/Integer
   #55 = Utf8               valueOf
   #56 = Utf8               (I)Ljava/lang/Integer;
   #57 = Methodref          #29.#58       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #58 = NameAndType        #32:#59       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #59 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #60 = String             #61           // list
   #61 = Utf8               list
   #62 = InvokeDynamic      #0:#63        // #0:accept:(Lext/mods/gameserver/data/manager/CursedWeaponManager;)Ljava/util/function/Consumer;
   #63 = NameAndType        #64:#65       // accept:(Lext/mods/gameserver/data/manager/CursedWeaponManager;)Ljava/util/function/Consumer;
   #64 = Utf8               accept
   #65 = Utf8               (Lext/mods/gameserver/data/manager/CursedWeaponManager;)Ljava/util/function/Consumer;
   #66 = Methodref          #11.#67       // ext/mods/gameserver/data/manager/CursedWeaponManager.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #67 = NameAndType        #68:#69       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #68 = Utf8               forEach
   #69 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #70 = InterfaceMethodref #46.#71       // java/util/Map.values:()Ljava/util/Collection;
   #71 = NameAndType        #72:#73       // values:()Ljava/util/Collection;
   #72 = Utf8               values
   #73 = Utf8               ()Ljava/util/Collection;
   #74 = InterfaceMethodref #75.#76       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #75 = Class              #77           // java/util/Collection
   #76 = NameAndType        #78:#79       // iterator:()Ljava/util/Iterator;
   #77 = Utf8               java/util/Collection
   #78 = Utf8               iterator
   #79 = Utf8               ()Ljava/util/Iterator;
   #80 = InterfaceMethodref #81.#82       // java/util/Iterator.hasNext:()Z
   #81 = Class              #83           // java/util/Iterator
   #82 = NameAndType        #84:#85       // hasNext:()Z
   #83 = Utf8               java/util/Iterator
   #84 = Utf8               hasNext
   #85 = Utf8               ()Z
   #86 = InterfaceMethodref #81.#87       // java/util/Iterator.next:()Ljava/lang/Object;
   #87 = NameAndType        #88:#89       // next:()Ljava/lang/Object;
   #88 = Utf8               next
   #89 = Utf8               ()Ljava/lang/Object;
   #90 = Class              #91           // ext/mods/gameserver/model/entity/CursedWeapon
   #91 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon
   #92 = Methodref          #90.#93       // ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
   #93 = NameAndType        #94:#6        // endOfLife:()V
   #94 = Utf8               endOfLife
   #95 = InterfaceMethodref #46.#96       // java/util/Map.clear:()V
   #96 = NameAndType        #97:#6        // clear:()V
   #97 = Utf8               clear
   #98 = InterfaceMethodref #46.#99       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #99 = NameAndType        #100:#101     // containsKey:(Ljava/lang/Object;)Z
  #100 = Utf8               containsKey
  #101 = Utf8               (Ljava/lang/Object;)Z
  #102 = InterfaceMethodref #46.#103      // java/util/Map.keySet:()Ljava/util/Set;
  #103 = NameAndType        #104:#105     // keySet:()Ljava/util/Set;
  #104 = Utf8               keySet
  #105 = Utf8               ()Ljava/util/Set;
  #106 = InterfaceMethodref #46.#107      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #107 = NameAndType        #108:#109     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #108 = Utf8               get
  #109 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #110 = Class              #111          // ext/mods/gameserver/model/actor/instance/SiegeGuard
  #111 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeGuard
  #112 = Class              #113          // ext/mods/gameserver/model/actor/instance/GrandBoss
  #113 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
  #114 = Class              #115          // ext/mods/gameserver/model/actor/instance/FeedableBeast
  #115 = Utf8               ext/mods/gameserver/model/actor/instance/FeedableBeast
  #116 = Methodref          #90.#117      // ext/mods/gameserver/model/entity/CursedWeapon.isActive:()Z
  #117 = NameAndType        #118:#85      // isActive:()Z
  #118 = Utf8               isActive
  #119 = Methodref          #90.#120      // ext/mods/gameserver/model/entity/CursedWeapon.checkDrop:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)Z
  #120 = NameAndType        #121:#122     // checkDrop:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)Z
  #121 = Utf8               checkDrop
  #122 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)Z
  #123 = Methodref          #124.#125     // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #124 = Class              #126          // ext/mods/gameserver/model/item/instance/ItemInstance
  #125 = NameAndType        #127:#50      // getItemId:()I
  #126 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #127 = Utf8               getItemId
  #128 = Methodref          #129.#130     // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #129 = Class              #131          // ext/mods/gameserver/model/actor/Player
  #130 = NameAndType        #132:#85      // isCursedWeaponEquipped:()Z
  #131 = Utf8               ext/mods/gameserver/model/actor/Player
  #132 = Utf8               isCursedWeaponEquipped
  #133 = Methodref          #129.#134     // ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
  #134 = NameAndType        #135:#50      // getCursedWeaponEquippedId:()I
  #135 = Utf8               getCursedWeaponEquippedId
  #136 = Methodref          #90.#137      // ext/mods/gameserver/model/entity/CursedWeapon.rankUp:()V
  #137 = NameAndType        #138:#6       // rankUp:()V
  #138 = Utf8               rankUp
  #139 = Methodref          #90.#140      // ext/mods/gameserver/model/entity/CursedWeapon.setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #140 = NameAndType        #141:#142     // setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #141 = Utf8               setPlayer
  #142 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #143 = Methodref          #90.#144      // ext/mods/gameserver/model/entity/CursedWeapon.activate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #144 = NameAndType        #145:#146     // activate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #145 = Utf8               activate
  #146 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #147 = Methodref          #90.#148      // ext/mods/gameserver/model/entity/CursedWeapon.dropIt:(Lext/mods/gameserver/model/actor/Creature;)V
  #148 = NameAndType        #149:#150     // dropIt:(Lext/mods/gameserver/model/actor/Creature;)V
  #149 = Utf8               dropIt
  #150 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #151 = Methodref          #90.#152      // ext/mods/gameserver/model/entity/CursedWeapon.increaseKills:()V
  #152 = NameAndType        #153:#6       // increaseKills:()V
  #153 = Utf8               increaseKills
  #154 = Methodref          #90.#155      // ext/mods/gameserver/model/entity/CursedWeapon.getCurrentStage:()I
  #155 = NameAndType        #156:#50      // getCurrentStage:()I
  #156 = Utf8               getCurrentStage
  #157 = Methodref          #90.#158      // ext/mods/gameserver/model/entity/CursedWeapon.isActivated:()Z
  #158 = NameAndType        #159:#85      // isActivated:()Z
  #159 = Utf8               isActivated
  #160 = Methodref          #129.#161     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #161 = NameAndType        #162:#50      // getObjectId:()I
  #162 = Utf8               getObjectId
  #163 = Methodref          #90.#164      // ext/mods/gameserver/model/entity/CursedWeapon.getPlayerId:()I
  #164 = NameAndType        #165:#50      // getPlayerId:()I
  #165 = Utf8               getPlayerId
  #166 = Methodref          #129.#167     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #167 = NameAndType        #168:#169     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #168 = Utf8               getInventory
  #169 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #170 = Methodref          #90.#125      // ext/mods/gameserver/model/entity/CursedWeapon.getItemId:()I
  #171 = Methodref          #172.#173     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #172 = Class              #174          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #173 = NameAndType        #175:#176     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #174 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #175 = Utf8               getItemByItemId
  #176 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #177 = Methodref          #90.#178      // ext/mods/gameserver/model/entity/CursedWeapon.setItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #178 = NameAndType        #179:#180     // setItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #179 = Utf8               setItem
  #180 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #181 = Methodref          #90.#182      // ext/mods/gameserver/model/entity/CursedWeapon.giveDemonicSkills:()V
  #182 = NameAndType        #183:#6       // giveDemonicSkills:()V
  #183 = Utf8               giveDemonicSkills
  #184 = Methodref          #129.#185     // ext/mods/gameserver/model/actor/Player.setCursedWeaponEquippedId:(I)V
  #185 = NameAndType        #186:#187     // setCursedWeaponEquippedId:(I)V
  #186 = Utf8               setCursedWeaponEquippedId
  #187 = Utf8               (I)V
  #188 = Fieldref           #189.#190     // ext/mods/gameserver/data/manager/CursedWeaponManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/CursedWeaponManager;
  #189 = Class              #191          // ext/mods/gameserver/data/manager/CursedWeaponManager$SingletonHolder
  #190 = NameAndType        #192:#193     // INSTANCE:Lext/mods/gameserver/data/manager/CursedWeaponManager;
  #191 = Utf8               ext/mods/gameserver/data/manager/CursedWeaponManager$SingletonHolder
  #192 = Utf8               INSTANCE
  #193 = Utf8               Lext/mods/gameserver/data/manager/CursedWeaponManager;
  #194 = String             #195          // item
  #195 = Utf8               item
  #196 = InvokeDynamic      #1:#63        // #1:accept:(Lext/mods/gameserver/data/manager/CursedWeaponManager;)Ljava/util/function/Consumer;
  #197 = Methodref          #11.#198      // ext/mods/gameserver/data/manager/CursedWeaponManager.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #198 = NameAndType        #199:#200     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #199 = Utf8               parseAttributes
  #200 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #201 = String             #202          // id
  #202 = Utf8               id
  #203 = Methodref          #204.#205     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #204 = Class              #206          // ext/mods/commons/data/StatSet
  #205 = NameAndType        #207:#208     // getInteger:(Ljava/lang/String;)I
  #206 = Utf8               ext/mods/commons/data/StatSet
  #207 = Utf8               getInteger
  #208 = Utf8               (Ljava/lang/String;)I
  #209 = Methodref          #90.#210      // ext/mods/gameserver/model/entity/CursedWeapon."<init>":(Lext/mods/commons/data/StatSet;)V
  #210 = NameAndType        #5:#211       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #211 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #212 = InterfaceMethodref #46.#213      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #213 = NameAndType        #214:#215     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #214 = Utf8               put
  #215 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #216 = Class              #217          // ext/mods/commons/data/xml/IXmlReader
  #217 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #218 = Utf8               Signature
  #219 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/entity/CursedWeapon;>;
  #220 = Utf8               Code
  #221 = Utf8               LineNumberTable
  #222 = Utf8               LocalVariableTable
  #223 = Utf8               this
  #224 = Utf8               StackMapTable
  #225 = Utf8               parseDocument
  #226 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #227 = Utf8               doc
  #228 = Utf8               Lorg/w3c/dom/Document;
  #229 = Utf8               path
  #230 = Utf8               Ljava/nio/file/Path;
  #231 = Utf8               reload
  #232 = Utf8               cw
  #233 = Utf8               Lext/mods/gameserver/model/entity/CursedWeapon;
  #234 = Utf8               isCursed
  #235 = Utf8               (I)Z
  #236 = Utf8               itemId
  #237 = Utf8               I
  #238 = Utf8               getCursedWeapons
  #239 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/entity/CursedWeapon;>;
  #240 = Utf8               getCursedWeaponsIds
  #241 = Utf8               ()Ljava/util/Set<Ljava/lang/Integer;>;
  #242 = Utf8               getCursedWeapon
  #243 = Utf8               (I)Lext/mods/gameserver/model/entity/CursedWeapon;
  #244 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)V
  #245 = Utf8               attackable
  #246 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #247 = Utf8               player
  #248 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #249 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #250 = Utf8               drop
  #251 = Utf8               (ILext/mods/gameserver/model/actor/Creature;)V
  #252 = Utf8               creature
  #253 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #254 = Utf8               (I)I
  #255 = Utf8               checkPlayer
  #256 = Utf8               getInstance
  #257 = Utf8               ()Lext/mods/gameserver/data/manager/CursedWeaponManager;
  #258 = Utf8               lambda$parseDocument$0
  #259 = Utf8               (Lorg/w3c/dom/Node;)V
  #260 = Utf8               listNode
  #261 = Utf8               Lorg/w3c/dom/Node;
  #262 = Utf8               lambda$parseDocument$1
  #263 = Utf8               itemNode
  #264 = Utf8               set
  #265 = Utf8               Lext/mods/commons/data/StatSet;
  #266 = Utf8               SourceFile
  #267 = Utf8               CursedWeaponManager.java
  #268 = Utf8               NestMembers
  #269 = Utf8               BootstrapMethods
  #270 = MethodType         #33           //  (Ljava/lang/Object;)V
  #271 = MethodHandle       5:#272        // REF_invokeVirtual ext/mods/gameserver/data/manager/CursedWeaponManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #272 = Methodref          #11.#273      // ext/mods/gameserver/data/manager/CursedWeaponManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #273 = NameAndType        #258:#259     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #274 = MethodType         #259          //  (Lorg/w3c/dom/Node;)V
  #275 = MethodHandle       5:#276        // REF_invokeVirtual ext/mods/gameserver/data/manager/CursedWeaponManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #276 = Methodref          #11.#277      // ext/mods/gameserver/data/manager/CursedWeaponManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #277 = NameAndType        #262:#259     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #278 = MethodHandle       6:#279        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #279 = Methodref          #280.#281     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #280 = Class              #282          // java/lang/invoke/LambdaMetafactory
  #281 = NameAndType        #283:#284     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #282 = Utf8               java/lang/invoke/LambdaMetafactory
  #283 = Utf8               metafactory
  #284 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #285 = Utf8               InnerClasses
  #286 = Utf8               SingletonHolder
  #287 = Class              #288          // java/lang/invoke/MethodHandles$Lookup
  #288 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #289 = Class              #290          // java/lang/invoke/MethodHandles
  #290 = Utf8               java/lang/invoke/MethodHandles
  #291 = Utf8               Lookup
{
  public ext.mods.gameserver.data.manager.CursedWeaponManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
        15: getstatic     #16                 // Field ext/mods/Config.ALLOW_CURSED_WEAPONS:Z
        18: ifne          30
        21: getstatic     #22                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        24: ldc           #26                 // String Cursed weapons loading is skipped.
        26: invokevirtual #28                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        29: return
        30: aload_0
        31: invokevirtual #34                 // Method load:()V
        34: return
      LineNumberTable:
        line 56: 0
        line 53: 4
        line 57: 15
        line 59: 21
        line 60: 29
        line 63: 30
        line 64: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/data/manager/CursedWeaponManager ]
          stack = []

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #37                 // String xml/cursedWeapons.xml
         3: invokevirtual #39                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #22                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #43                 // String Loaded {} cursed weapons.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
        21: invokeinterface #45,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #57                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 69: 0
        line 70: 6
        line 71: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #60                 // String list
         4: aload_0
         5: invokedynamic #62,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/manager/CursedWeaponManager;)Ljava/util/function/Consumer;
        10: invokevirtual #66                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 76: 0
        line 81: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
         4: invokeinterface #70,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #74,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        14: astore_1
        15: aload_1
        16: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          41
        24: aload_1
        25: invokeinterface #86,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #90                 // class ext/mods/gameserver/model/entity/CursedWeapon
        33: astore_2
        34: aload_2
        35: invokevirtual #92                 // Method ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
        38: goto          15
        41: aload_0
        42: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
        45: invokeinterface #95,  1           // InterfaceMethod java/util/Map.clear:()V
        50: aload_0
        51: invokevirtual #34                 // Method load:()V
        54: return
      LineNumberTable:
        line 88: 0
        line 89: 34
        line 91: 41
        line 93: 50
        line 94: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34       4     2    cw   Lext/mods/gameserver/model/entity/CursedWeapon;
            0      55     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25

  public boolean isCursed(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #98,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
            0      14     1 itemId   I

  public java.util.Collection<ext.mods.gameserver.model.entity.CursedWeapon> getCursedWeapons();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
         4: invokeinterface #70,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
    Signature: #239                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/entity/CursedWeapon;>;

  public java.util.Set<java.lang.Integer> getCursedWeaponsIds();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
         4: invokeinterface #102,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
         9: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
    Signature: #241                         // ()Ljava/util/Set<Ljava/lang/Integer;>;

  public ext.mods.gameserver.model.entity.CursedWeapon getCursedWeapon(int);
    descriptor: (I)Lext/mods/gameserver/model/entity/CursedWeapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #106,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #90                 // class ext/mods/gameserver/model/entity/CursedWeapon
        16: areturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
            0      17     1 itemId   I

  public synchronized void checkDrop(ext.mods.gameserver.model.actor.Attackable, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=5, args_size=3
         0: aload_1
         1: instanceof    #110                // class ext/mods/gameserver/model/actor/instance/SiegeGuard
         4: ifne          21
         7: aload_1
         8: instanceof    #112                // class ext/mods/gameserver/model/actor/instance/GrandBoss
        11: ifne          21
        14: aload_1
        15: instanceof    #114                // class ext/mods/gameserver/model/actor/instance/FeedableBeast
        18: ifeq          22
        21: return
        22: aload_0
        23: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
        26: invokeinterface #70,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        31: invokeinterface #74,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        36: astore_3
        37: aload_3
        38: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        43: ifeq          84
        46: aload_3
        47: invokeinterface #86,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        52: checkcast     #90                 // class ext/mods/gameserver/model/entity/CursedWeapon
        55: astore        4
        57: aload         4
        59: invokevirtual #116                // Method ext/mods/gameserver/model/entity/CursedWeapon.isActive:()Z
        62: ifeq          68
        65: goto          37
        68: aload         4
        70: aload_1
        71: aload_2
        72: invokevirtual #119                // Method ext/mods/gameserver/model/entity/CursedWeapon.checkDrop:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)Z
        75: ifeq          81
        78: goto          84
        81: goto          37
        84: return
      LineNumberTable:
        line 123: 0
        line 124: 21
        line 126: 22
        line 128: 57
        line 129: 65
        line 131: 68
        line 132: 78
        line 133: 81
        line 134: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           57      24     4    cw   Lext/mods/gameserver/model/entity/CursedWeapon;
            0      85     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
            0      85     1 attackable   Lext/mods/gameserver/model/actor/Attackable;
            0      85     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 21 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon ]
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 250 /* chop */
          offset_delta = 2

  public void activate(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
         4: aload_2
         5: invokevirtual #123                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
         8: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #106,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #90                 // class ext/mods/gameserver/model/entity/CursedWeapon
        19: astore_3
        20: aload_3
        21: ifnonnull     25
        24: return
        25: aload_1
        26: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
        29: ifeq          66
        32: aload_0
        33: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
        36: aload_1
        37: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
        40: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        43: invokeinterface #106,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        48: checkcast     #90                 // class ext/mods/gameserver/model/entity/CursedWeapon
        51: invokevirtual #136                // Method ext/mods/gameserver/model/entity/CursedWeapon.rankUp:()V
        54: aload_3
        55: aload_1
        56: invokevirtual #139                // Method ext/mods/gameserver/model/entity/CursedWeapon.setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
        59: aload_3
        60: invokevirtual #92                 // Method ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
        63: goto          72
        66: aload_3
        67: aload_1
        68: aload_2
        69: invokevirtual #143                // Method ext/mods/gameserver/model/entity/CursedWeapon.activate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        72: return
      LineNumberTable:
        line 143: 0
        line 144: 20
        line 145: 24
        line 147: 25
        line 149: 32
        line 151: 54
        line 153: 59
        line 156: 66
        line 157: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
            0      73     1 player   Lext/mods/gameserver/model/actor/Player;
            0      73     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           20      53     3    cw   Lext/mods/gameserver/model/entity/CursedWeapon;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon ]
        frame_type = 40 /* same */
        frame_type = 5 /* same */

  public void drop(int, ext.mods.gameserver.model.actor.Creature);
    descriptor: (ILext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #106,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #90                 // class ext/mods/gameserver/model/entity/CursedWeapon
        16: astore_3
        17: aload_3
        18: ifnonnull     22
        21: return
        22: aload_3
        23: aload_2
        24: invokevirtual #147                // Method ext/mods/gameserver/model/entity/CursedWeapon.dropIt:(Lext/mods/gameserver/model/actor/Creature;)V
        27: return
      LineNumberTable:
        line 166: 0
        line 167: 17
        line 168: 21
        line 170: 22
        line 171: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
            0      28     1 itemId   I
            0      28     2 creature   Lext/mods/gameserver/model/actor/Creature;
           17      11     3    cw   Lext/mods/gameserver/model/entity/CursedWeapon;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon ]

  public void increaseKills(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #106,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #90                 // class ext/mods/gameserver/model/entity/CursedWeapon
        16: astore_2
        17: aload_2
        18: ifnonnull     22
        21: return
        22: aload_2
        23: invokevirtual #151                // Method ext/mods/gameserver/model/entity/CursedWeapon.increaseKills:()V
        26: return
      LineNumberTable:
        line 179: 0
        line 180: 17
        line 181: 21
        line 183: 22
        line 184: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
            0      27     1 itemId   I
           17      10     2    cw   Lext/mods/gameserver/model/entity/CursedWeapon;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon ]

  public int getCurrentStage(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #106,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #90                 // class ext/mods/gameserver/model/entity/CursedWeapon
        16: astore_2
        17: aload_2
        18: ifnonnull     25
        21: iconst_0
        22: goto          29
        25: aload_2
        26: invokevirtual #154                // Method ext/mods/gameserver/model/entity/CursedWeapon.getCurrentStage:()I
        29: ireturn
      LineNumberTable:
        line 188: 0
        line 189: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
            0      30     1 itemId   I
           17      13     2    cw   Lext/mods/gameserver/model/entity/CursedWeapon;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public void checkPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #10                 // Field _cursedWeapons:Ljava/util/Map;
         9: invokeinterface #70,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        14: invokeinterface #74,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        19: astore_2
        20: aload_2
        21: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        26: ifeq          95
        29: aload_2
        30: invokeinterface #86,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        35: checkcast     #90                 // class ext/mods/gameserver/model/entity/CursedWeapon
        38: astore_3
        39: aload_3
        40: invokevirtual #157                // Method ext/mods/gameserver/model/entity/CursedWeapon.isActivated:()Z
        43: ifeq          92
        46: aload_1
        47: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        50: aload_3
        51: invokevirtual #163                // Method ext/mods/gameserver/model/entity/CursedWeapon.getPlayerId:()I
        54: if_icmpne     92
        57: aload_3
        58: aload_1
        59: invokevirtual #139                // Method ext/mods/gameserver/model/entity/CursedWeapon.setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
        62: aload_3
        63: aload_1
        64: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        67: aload_3
        68: invokevirtual #170                // Method ext/mods/gameserver/model/entity/CursedWeapon.getItemId:()I
        71: invokevirtual #171                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        74: invokevirtual #177                // Method ext/mods/gameserver/model/entity/CursedWeapon.setItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        77: aload_3
        78: invokevirtual #181                // Method ext/mods/gameserver/model/entity/CursedWeapon.giveDemonicSkills:()V
        81: aload_1
        82: aload_3
        83: invokevirtual #170                // Method ext/mods/gameserver/model/entity/CursedWeapon.getItemId:()I
        86: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.setCursedWeaponEquippedId:(I)V
        89: goto          95
        92: goto          20
        95: return
      LineNumberTable:
        line 200: 0
        line 201: 4
        line 203: 5
        line 205: 39
        line 207: 57
        line 208: 62
        line 209: 77
        line 211: 81
        line 212: 89
        line 214: 92
        line 215: 95
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      53     3    cw   Lext/mods/gameserver/model/entity/CursedWeapon;
            0      96     0  this   Lext/mods/gameserver/data/manager/CursedWeaponManager;
            0      96     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 71
        frame_type = 250 /* chop */
          offset_delta = 2

  public static final ext.mods.gameserver.data.manager.CursedWeaponManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/CursedWeaponManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #188                // Field ext/mods/gameserver/data/manager/CursedWeaponManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/CursedWeaponManager;
         3: areturn
      LineNumberTable:
        line 219: 0
}
SourceFile: "CursedWeaponManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/CursedWeaponManager$SingletonHolder
BootstrapMethods:
  0: #278 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #270 (Ljava/lang/Object;)V
      #271 REF_invokeVirtual ext/mods/gameserver/data/manager/CursedWeaponManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #274 (Lorg/w3c/dom/Node;)V
  1: #278 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #270 (Ljava/lang/Object;)V
      #275 REF_invokeVirtual ext/mods/gameserver/data/manager/CursedWeaponManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #274 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #291= #287 of #289; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
