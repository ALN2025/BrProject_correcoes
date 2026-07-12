// Bytecode for: ext.mods.gameserver.handler.skillhandlers.SummonCreature
// File: ext\mods\gameserver\handler\skillhandlers\SummonCreature.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/SummonCreature.class
  Last modified 9 de jul de 2026; size 7053 bytes
  MD5 checksum bc63635b2b5886a4c5a96ba9cc8be8be
  Compiled from "SummonCreature.java"
public class ext.mods.gameserver.handler.skillhandlers.SummonCreature implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #251                        // ext/mods/gameserver/handler/skillhandlers/SummonCreature
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #10 = NameAndType        #11:#12       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #11 = Utf8               getInventory
   #12 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #13 = Methodref          #7.#14        // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #14 = NameAndType        #15:#16       // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #15 = Utf8               getAI
   #16 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #18 = Class              #20           // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #19 = NameAndType        #21:#22       // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #20 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #21 = Utf8               getCurrentIntention
   #22 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
   #24 = Class              #26           // ext/mods/gameserver/model/actor/ai/Intention
   #25 = NameAndType        #27:#28       // getItemObjectId:()I
   #26 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #27 = Utf8               getItemObjectId
   #28 = Utf8               ()I
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #30 = Class              #32           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #31 = NameAndType        #33:#34       // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #32 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #33 = Utf8               getItemByObjectId
   #34 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
   #36 = Class              #38           // ext/mods/gameserver/model/item/instance/ItemInstance
   #37 = NameAndType        #39:#28       // getOwnerId:()I
   #38 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #39 = Utf8               getOwnerId
   #40 = Methodref          #7.#41        // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #41 = NameAndType        #42:#28       // getObjectId:()I
   #42 = Utf8               getObjectId
   #43 = Methodref          #36.#44       // ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
   #44 = NameAndType        #45:#46       // getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
   #45 = Utf8               getLocation
   #46 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
   #47 = Fieldref           #48.#49       // ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
   #48 = Class              #50           // ext/mods/gameserver/enums/items/ItemLocation
   #49 = NameAndType        #51:#52       // INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
   #50 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
   #51 = Utf8               INVENTORY
   #52 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
   #53 = Methodref          #54.#55       // ext/mods/Crypta/AgathionData.getInstance:()Lext/mods/Crypta/AgathionData;
   #54 = Class              #56           // ext/mods/Crypta/AgathionData
   #55 = NameAndType        #57:#58       // getInstance:()Lext/mods/Crypta/AgathionData;
   #56 = Utf8               ext/mods/Crypta/AgathionData
   #57 = Utf8               getInstance
   #58 = Utf8               ()Lext/mods/Crypta/AgathionData;
   #59 = Methodref          #36.#60       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #60 = NameAndType        #61:#28       // getItemId:()I
   #61 = Utf8               getItemId
   #62 = Methodref          #54.#63       // ext/mods/Crypta/AgathionData.getAgathionsByItemId:(I)Ljava/util/List;
   #63 = NameAndType        #64:#65       // getAgathionsByItemId:(I)Ljava/util/List;
   #64 = Utf8               getAgathionsByItemId
   #65 = Utf8               (I)Ljava/util/List;
   #66 = InterfaceMethodref #67.#68       // java/util/List.isEmpty:()Z
   #67 = Class              #69           // java/util/List
   #68 = NameAndType        #70:#71       // isEmpty:()Z
   #69 = Utf8               java/util/List
   #70 = Utf8               isEmpty
   #71 = Utf8               ()Z
   #72 = InterfaceMethodref #67.#73       // java/util/List.get:(I)Ljava/lang/Object;
   #73 = NameAndType        #74:#75       // get:(I)Ljava/lang/Object;
   #74 = Utf8               get
   #75 = Utf8               (I)Ljava/lang/Object;
   #76 = Class              #77           // ext/mods/aghation/holder/AgathionHolder
   #77 = Utf8               ext/mods/aghation/holder/AgathionHolder
   #78 = Methodref          #76.#79       // ext/mods/aghation/holder/AgathionHolder.getNpcId:()I
   #79 = NameAndType        #80:#28       // getNpcId:()I
   #80 = Utf8               getNpcId
   #81 = Class              #82           // java/lang/Exception
   #82 = Utf8               java/lang/Exception
   #83 = Methodref          #84.#85       // ext/mods/gameserver/data/xml/SummonItemData.getInstance:()Lext/mods/gameserver/data/xml/SummonItemData;
   #84 = Class              #86           // ext/mods/gameserver/data/xml/SummonItemData
   #85 = NameAndType        #57:#87       // getInstance:()Lext/mods/gameserver/data/xml/SummonItemData;
   #86 = Utf8               ext/mods/gameserver/data/xml/SummonItemData
   #87 = Utf8               ()Lext/mods/gameserver/data/xml/SummonItemData;
   #88 = Methodref          #84.#89       // ext/mods/gameserver/data/xml/SummonItemData.getSummonItem:(I)Lext/mods/gameserver/model/holder/IntIntHolder;
   #89 = NameAndType        #90:#91       // getSummonItem:(I)Lext/mods/gameserver/model/holder/IntIntHolder;
   #90 = Utf8               getSummonItem
   #91 = Utf8               (I)Lext/mods/gameserver/model/holder/IntIntHolder;
   #92 = Methodref          #93.#94       // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
   #93 = Class              #95           // ext/mods/gameserver/model/holder/IntIntHolder
   #94 = NameAndType        #96:#28       // getId:()I
   #95 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #96 = Utf8               getId
   #97 = Methodref          #98.#99       // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #98 = Class              #100          // ext/mods/gameserver/data/xml/NpcData
   #99 = NameAndType        #57:#101      // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #100 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #101 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #102 = Methodref          #98.#103      // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #103 = NameAndType        #104:#105     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #104 = Utf8               getTemplate
  #105 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #106 = Methodref          #107.#108     // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #107 = Class              #109          // ext/mods/gameserver/model/actor/Creature
  #108 = NameAndType        #110:#111     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #109 = Utf8               ext/mods/gameserver/model/actor/Creature
  #110 = Utf8               getPosition
  #111 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #112 = Methodref          #113.#114     // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #113 = Class              #115          // ext/mods/gameserver/model/location/SpawnLocation
  #114 = NameAndType        #116:#111     // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #115 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #116 = Utf8               clone
  #117 = Fieldref           #118.#119     // ext/mods/Config.SUMMON_DRIFT_RANGE:I
  #118 = Class              #120          // ext/mods/Config
  #119 = NameAndType        #121:#122     // SUMMON_DRIFT_RANGE:I
  #120 = Utf8               ext/mods/Config
  #121 = Utf8               SUMMON_DRIFT_RANGE
  #122 = Utf8               I
  #123 = Methodref          #113.#124     // ext/mods/gameserver/model/location/SpawnLocation.addStrictOffset:(I)V
  #124 = NameAndType        #125:#126     // addStrictOffset:(I)V
  #125 = Utf8               addStrictOffset
  #126 = Utf8               (I)V
  #127 = Methodref          #113.#128     // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
  #128 = NameAndType        #129:#130     // setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
  #129 = Utf8               setHeadingTo
  #130 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #131 = Methodref          #132.#133     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #132 = Class              #134          // ext/mods/gameserver/geoengine/GeoEngine
  #133 = NameAndType        #57:#135      // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #134 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #135 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #136 = Methodref          #132.#137     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #137 = NameAndType        #138:#139     // getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #138 = Utf8               getValidLocation
  #139 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #140 = Methodref          #113.#141     // ext/mods/gameserver/model/location/SpawnLocation.set:(Lext/mods/gameserver/model/location/Location;)V
  #141 = NameAndType        #142:#130     // set:(Lext/mods/gameserver/model/location/Location;)V
  #142 = Utf8               set
  #143 = Methodref          #7.#144       // ext/mods/gameserver/model/actor/Player.getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
  #144 = NameAndType        #145:#146     // getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
  #145 = Utf8               getCurrentAgation
  #146 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Agathion;
  #147 = Class              #148          // ext/mods/gameserver/model/actor/instance/Agathion
  #148 = Utf8               ext/mods/gameserver/model/actor/instance/Agathion
  #149 = Methodref          #150.#151     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #150 = Class              #152          // ext/mods/gameserver/idfactory/IdFactory
  #151 = NameAndType        #57:#153      // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #152 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #153 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #154 = Methodref          #150.#155     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #155 = NameAndType        #156:#28      // getNextId:()I
  #156 = Utf8               getNextId
  #157 = Methodref          #147.#158     // ext/mods/gameserver/model/actor/instance/Agathion."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;I)V
  #158 = NameAndType        #5:#159       // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;I)V
  #159 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;I)V
  #160 = Methodref          #7.#161       // ext/mods/gameserver/model/actor/Player.setCurrentAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
  #161 = NameAndType        #162:#163     // setCurrentAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
  #162 = Utf8               setCurrentAgation
  #163 = Utf8               (Lext/mods/gameserver/model/actor/instance/Agathion;)V
  #164 = Methodref          #7.#165       // ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
  #165 = NameAndType        #166:#167     // getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
  #166 = Utf8               getMemos
  #167 = Utf8               ()Lext/mods/gameserver/model/memo/PlayerMemo;
  #168 = String             #169          // agation
  #169 = Utf8               agation
  #170 = Methodref          #171.#172     // ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;I)V
  #171 = Class              #173          // ext/mods/gameserver/model/memo/PlayerMemo
  #172 = NameAndType        #142:#174     // set:(Ljava/lang/String;I)V
  #173 = Utf8               ext/mods/gameserver/model/memo/PlayerMemo
  #174 = Utf8               (Ljava/lang/String;I)V
  #175 = Methodref          #147.#176     // ext/mods/gameserver/model/actor/instance/Agathion.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #176 = NameAndType        #177:#178     // spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #177 = Utf8               spawnMe
  #178 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
  #179 = Methodref          #7.#180       // ext/mods/gameserver/model/actor/Player.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
  #180 = NameAndType        #181:#182     // getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
  #181 = Utf8               getInstanceMap
  #182 = Utf8               ()Lext/mods/InstanceMap/MapInstance;
  #183 = Methodref          #147.#184     // ext/mods/gameserver/model/actor/instance/Agathion.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
  #184 = NameAndType        #185:#186     // setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
  #185 = Utf8               setInstanceMap
  #186 = Utf8               (Lext/mods/InstanceMap/MapInstance;Z)V
  #187 = Methodref          #147.#188     // ext/mods/gameserver/model/actor/instance/Agathion.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #188 = NameAndType        #15:#189      // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #189 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #190 = Double             1000.0d
  #192 = Methodref          #193.#194     // ext/mods/gameserver/model/actor/ai/type/NpcAI.addFollowDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
  #193 = Class              #195          // ext/mods/gameserver/model/actor/ai/type/NpcAI
  #194 = NameAndType        #196:#197     // addFollowDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
  #195 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
  #196 = Utf8               addFollowDesire
  #197 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #198 = Methodref          #147.#199     // ext/mods/gameserver/model/actor/instance/Agathion.forceRunStance:()V
  #199 = NameAndType        #200:#6       // forceRunStance:()V
  #200 = Utf8               forceRunStance
  #201 = Methodref          #7.#202       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #202 = NameAndType        #203:#204     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #203 = Utf8               getSummon
  #204 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #205 = Methodref          #206.#207     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #206 = Class              #208          // ext/mods/gameserver/model/World
  #207 = NameAndType        #57:#209      // getInstance:()Lext/mods/gameserver/model/World;
  #208 = Utf8               ext/mods/gameserver/model/World
  #209 = Utf8               ()Lext/mods/gameserver/model/World;
  #210 = Methodref          #206.#211     // ext/mods/gameserver/model/World.getPet:(I)Lext/mods/gameserver/model/actor/instance/Pet;
  #211 = NameAndType        #212:#213     // getPet:(I)Lext/mods/gameserver/model/actor/instance/Pet;
  #212 = Utf8               getPet
  #213 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Pet;
  #214 = Methodref          #215.#216     // ext/mods/gameserver/model/actor/instance/Pet.restore:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Pet;
  #215 = Class              #217          // ext/mods/gameserver/model/actor/instance/Pet
  #216 = NameAndType        #218:#219     // restore:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Pet;
  #217 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #218 = Utf8               restore
  #219 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Pet;
  #220 = Methodref          #206.#221     // ext/mods/gameserver/model/World.addPet:(ILext/mods/gameserver/model/actor/instance/Pet;)V
  #221 = NameAndType        #222:#223     // addPet:(ILext/mods/gameserver/model/actor/instance/Pet;)V
  #222 = Utf8               addPet
  #223 = Utf8               (ILext/mods/gameserver/model/actor/instance/Pet;)V
  #224 = Methodref          #7.#225       // ext/mods/gameserver/model/actor/Player.setSummon:(Lext/mods/gameserver/model/actor/Summon;)V
  #225 = NameAndType        #226:#227     // setSummon:(Lext/mods/gameserver/model/actor/Summon;)V
  #226 = Utf8               setSummon
  #227 = Utf8               (Lext/mods/gameserver/model/actor/Summon;)V
  #228 = Methodref          #215.#199     // ext/mods/gameserver/model/actor/instance/Pet.forceRunStance:()V
  #229 = Methodref          #7.#230       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #230 = NameAndType        #231:#232     // getName:()Ljava/lang/String;
  #231 = Utf8               getName
  #232 = Utf8               ()Ljava/lang/String;
  #233 = Methodref          #215.#234     // ext/mods/gameserver/model/actor/instance/Pet.setTitle:(Ljava/lang/String;)V
  #234 = NameAndType        #235:#236     // setTitle:(Ljava/lang/String;)V
  #235 = Utf8               setTitle
  #236 = Utf8               (Ljava/lang/String;)V
  #237 = Methodref          #215.#238     // ext/mods/gameserver/model/actor/instance/Pet.startFeed:()V
  #238 = NameAndType        #239:#6       // startFeed:()V
  #239 = Utf8               startFeed
  #240 = Methodref          #215.#176     // ext/mods/gameserver/model/actor/instance/Pet.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #241 = Methodref          #215.#242     // ext/mods/gameserver/model/actor/instance/Pet.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #242 = NameAndType        #15:#243      // getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #243 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #244 = Methodref          #245.#246     // ext/mods/gameserver/model/actor/ai/type/SummonAI.setFollowStatus:(Z)V
  #245 = Class              #247          // ext/mods/gameserver/model/actor/ai/type/SummonAI
  #246 = NameAndType        #248:#249     // setFollowStatus:(Z)V
  #247 = Utf8               ext/mods/gameserver/model/actor/ai/type/SummonAI
  #248 = Utf8               setFollowStatus
  #249 = Utf8               (Z)V
  #250 = Fieldref           #251.#252     // ext/mods/gameserver/handler/skillhandlers/SummonCreature.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #251 = Class              #253          // ext/mods/gameserver/handler/skillhandlers/SummonCreature
  #252 = NameAndType        #254:#255     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #253 = Utf8               ext/mods/gameserver/handler/skillhandlers/SummonCreature
  #254 = Utf8               SKILL_IDS
  #255 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #256 = Class              #257          // ext/mods/gameserver/enums/skills/SkillType
  #257 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #258 = Fieldref           #256.#259     // ext/mods/gameserver/enums/skills/SkillType.SUMMON_CREATURE:Lext/mods/gameserver/enums/skills/SkillType;
  #259 = NameAndType        #260:#261     // SUMMON_CREATURE:Lext/mods/gameserver/enums/skills/SkillType;
  #260 = Utf8               SUMMON_CREATURE
  #261 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #262 = Class              #263          // ext/mods/gameserver/handler/ISkillHandler
  #263 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #264 = Utf8               Code
  #265 = Utf8               LineNumberTable
  #266 = Utf8               LocalVariableTable
  #267 = Utf8               this
  #268 = Utf8               Lext/mods/gameserver/handler/skillhandlers/SummonCreature;
  #269 = Utf8               useSkill
  #270 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #271 = Utf8               player
  #272 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #273 = Utf8               agathionList
  #274 = Utf8               Ljava/util/List;
  #275 = Utf8               summonItem
  #276 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #277 = Utf8               agathion
  #278 = Utf8               Lext/mods/gameserver/model/actor/instance/Agathion;
  #279 = Utf8               pet
  #280 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #281 = Utf8               creature
  #282 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #283 = Utf8               skill
  #284 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #285 = Utf8               targets
  #286 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #287 = Utf8               item
  #288 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #289 = Utf8               checkedItem
  #290 = Utf8               npcId
  #291 = Utf8               isAgathion
  #292 = Utf8               Z
  #293 = Utf8               agathionDataInstance
  #294 = Utf8               Ljava/lang/Object;
  #295 = Utf8               npcTemplate
  #296 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #297 = Utf8               spawnLoc
  #298 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #299 = Utf8               LocalVariableTypeTable
  #300 = Utf8               Ljava/util/List<Lext/mods/aghation/holder/AgathionHolder;>;
  #301 = Utf8               StackMapTable
  #302 = Class              #303          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #303 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #304 = Utf8               getSkillIds
  #305 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #306 = Utf8               <clinit>
  #307 = Utf8               SourceFile
  #308 = Utf8               SummonCreature.java
{
  public ext.mods.gameserver.handler.skillhandlers.SummonCreature();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/SummonCreature;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=13, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload         5
        19: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        22: aload         5
        24: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        27: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
        30: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
        33: invokevirtual #29                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        36: astore        6
        38: aload         6
        40: ifnonnull     44
        43: return
        44: aload         6
        46: invokevirtual #35                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        49: aload         5
        51: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        54: if_icmpne     68
        57: aload         6
        59: invokevirtual #43                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        62: getstatic     #47                 // Field ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
        65: if_acmpeq     69
        68: return
        69: iconst_0
        70: istore        7
        72: iconst_0
        73: istore        8
        75: invokestatic  #53                 // Method ext/mods/Crypta/AgathionData.getInstance:()Lext/mods/Crypta/AgathionData;
        78: astore        9
        80: aload         9
        82: ifnull        137
        85: invokestatic  #53                 // Method ext/mods/Crypta/AgathionData.getInstance:()Lext/mods/Crypta/AgathionData;
        88: aload         6
        90: invokevirtual #59                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        93: invokevirtual #62                 // Method ext/mods/Crypta/AgathionData.getAgathionsByItemId:(I)Ljava/util/List;
        96: astore        10
        98: aload         10
       100: ifnull        132
       103: aload         10
       105: invokeinterface #66,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       110: ifne          132
       113: aload         10
       115: iconst_0
       116: invokeinterface #72,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       121: checkcast     #76                 // class ext/mods/aghation/holder/AgathionHolder
       124: invokevirtual #78                 // Method ext/mods/aghation/holder/AgathionHolder.getNpcId:()I
       127: istore        7
       129: iconst_1
       130: istore        8
       132: goto          137
       135: astore        10
       137: iload         7
       139: ifne          167
       142: invokestatic  #83                 // Method ext/mods/gameserver/data/xml/SummonItemData.getInstance:()Lext/mods/gameserver/data/xml/SummonItemData;
       145: aload         6
       147: invokevirtual #59                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       150: invokevirtual #88                 // Method ext/mods/gameserver/data/xml/SummonItemData.getSummonItem:(I)Lext/mods/gameserver/model/holder/IntIntHolder;
       153: astore        10
       155: aload         10
       157: ifnull        167
       160: aload         10
       162: invokevirtual #92                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       165: istore        7
       167: iload         7
       169: ifne          173
       172: return
       173: invokestatic  #97                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
       176: iload         7
       178: invokevirtual #102                // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
       181: astore        10
       183: aload         10
       185: ifnonnull     189
       188: return
       189: aload_1
       190: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       193: invokevirtual #112                // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
       196: astore        11
       198: aload         11
       200: getstatic     #117                // Field ext/mods/Config.SUMMON_DRIFT_RANGE:I
       203: invokevirtual #123                // Method ext/mods/gameserver/model/location/SpawnLocation.addStrictOffset:(I)V
       206: aload         11
       208: aload_1
       209: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       212: invokevirtual #127                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
       215: aload         11
       217: invokestatic  #131                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       220: aload_1
       221: aload         11
       223: invokevirtual #136                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
       226: invokevirtual #140                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(Lext/mods/gameserver/model/location/Location;)V
       229: iload         8
       231: ifeq          328
       234: aload         5
       236: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
       239: ifnull        243
       242: return
       243: new           #147                // class ext/mods/gameserver/model/actor/instance/Agathion
       246: dup
       247: invokestatic  #149                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       250: invokevirtual #154                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
       253: aload         10
       255: aload         5
       257: aload         6
       259: invokevirtual #59                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       262: invokespecial #157                // Method ext/mods/gameserver/model/actor/instance/Agathion."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;I)V
       265: astore        12
       267: aload         5
       269: aload         12
       271: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.setCurrentAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
       274: aload         5
       276: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
       279: ldc           #168                // String agation
       281: aload         6
       283: invokevirtual #59                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       286: invokevirtual #170                // Method ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;I)V
       289: aload         12
       291: aload         11
       293: invokevirtual #175                // Method ext/mods/gameserver/model/actor/instance/Agathion.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
       296: aload         12
       298: aload         5
       300: invokevirtual #179                // Method ext/mods/gameserver/model/actor/Player.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
       303: iconst_0
       304: invokevirtual #183                // Method ext/mods/gameserver/model/actor/instance/Agathion.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
       307: aload         12
       309: invokevirtual #187                // Method ext/mods/gameserver/model/actor/instance/Agathion.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
       312: aload         5
       314: ldc2_w        #190                // double 1000.0d
       317: invokevirtual #192                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.addFollowDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
       320: aload         12
       322: invokevirtual #198                // Method ext/mods/gameserver/model/actor/instance/Agathion.forceRunStance:()V
       325: goto          424
       328: aload         5
       330: invokevirtual #201                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       333: ifnonnull     350
       336: invokestatic  #205                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       339: aload         5
       341: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       344: invokevirtual #210                // Method ext/mods/gameserver/model/World.getPet:(I)Lext/mods/gameserver/model/actor/instance/Pet;
       347: ifnull        351
       350: return
       351: aload         6
       353: aload         10
       355: aload         5
       357: invokestatic  #214                // Method ext/mods/gameserver/model/actor/instance/Pet.restore:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Pet;
       360: astore        12
       362: aload         12
       364: ifnonnull     368
       367: return
       368: invokestatic  #205                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       371: aload         5
       373: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       376: aload         12
       378: invokevirtual #220                // Method ext/mods/gameserver/model/World.addPet:(ILext/mods/gameserver/model/actor/instance/Pet;)V
       381: aload         5
       383: aload         12
       385: invokevirtual #224                // Method ext/mods/gameserver/model/actor/Player.setSummon:(Lext/mods/gameserver/model/actor/Summon;)V
       388: aload         12
       390: invokevirtual #228                // Method ext/mods/gameserver/model/actor/instance/Pet.forceRunStance:()V
       393: aload         12
       395: aload         5
       397: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       400: invokevirtual #233                // Method ext/mods/gameserver/model/actor/instance/Pet.setTitle:(Ljava/lang/String;)V
       403: aload         12
       405: invokevirtual #237                // Method ext/mods/gameserver/model/actor/instance/Pet.startFeed:()V
       408: aload         12
       410: aload         11
       412: invokevirtual #240                // Method ext/mods/gameserver/model/actor/instance/Pet.spawnMe:(Lext/mods/gameserver/model/location/SpawnLocation;)V
       415: aload         12
       417: invokevirtual #241                // Method ext/mods/gameserver/model/actor/instance/Pet.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
       420: iconst_1
       421: invokevirtual #244                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.setFollowStatus:(Z)V
       424: return
      Exception table:
         from    to  target type
            85   132   135   Class java/lang/Exception
      LineNumberTable:
        line 54: 0
        line 55: 16
        line 57: 17
        line 58: 38
        line 59: 43
        line 61: 44
        line 62: 68
        line 64: 69
        line 65: 72
        line 67: 75
        line 68: 80
        line 73: 85
        line 74: 98
        line 76: 113
        line 77: 129
        line 82: 132
        line 80: 135
        line 85: 137
        line 87: 142
        line 88: 155
        line 90: 160
        line 94: 167
        line 95: 172
        line 97: 173
        line 98: 183
        line 99: 188
        line 101: 189
        line 102: 198
        line 103: 206
        line 104: 215
        line 106: 229
        line 108: 234
        line 109: 242
        line 111: 243
        line 113: 267
        line 114: 274
        line 116: 289
        line 117: 296
        line 119: 307
        line 120: 320
        line 121: 325
        line 124: 328
        line 125: 350
        line 127: 351
        line 128: 362
        line 129: 367
        line 131: 368
        line 133: 381
        line 135: 388
        line 136: 393
        line 137: 403
        line 138: 408
        line 139: 415
        line 141: 424
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
           98      34    10 agathionList   Ljava/util/List;
          155      12    10 summonItem   Lext/mods/gameserver/model/holder/IntIntHolder;
          267      58    12 agathion   Lext/mods/gameserver/model/actor/instance/Agathion;
          362      62    12   pet   Lext/mods/gameserver/model/actor/instance/Pet;
            0     425     0  this   Lext/mods/gameserver/handler/skillhandlers/SummonCreature;
            0     425     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     425     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     425     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     425     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     408     5 player   Lext/mods/gameserver/model/actor/Player;
           38     387     6 checkedItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           72     353     7 npcId   I
           75     350     8 isAgathion   Z
           80     345     9 agathionDataInstance   Ljava/lang/Object;
          183     242    10 npcTemplate   Lext/mods/gameserver/model/actor/template/NpcTemplate;
          198     227    11 spawnLoc   Lext/mods/gameserver/model/location/SpawnLocation;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           98      34    10 agathionList   Ljava/util/List<Lext/mods/aghation/holder/AgathionHolder;>;
      StackMapTable: number_of_entries = 17
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 23 /* same */
        frame_type = 0 /* same */
        frame_type = 254 /* append */
          offset_delta = 62
          locals = [ int, int, class java/lang/Object ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 1 /* same */
        frame_type = 29 /* same */
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 252 /* append */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 84
        frame_type = 21 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet ]
        frame_type = 250 /* chop */
          offset_delta = 55

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #250                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 146: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/SummonCreature;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #256                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #258                // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON_CREATURE:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #250                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 46: 0
}
SourceFile: "SummonCreature.java"
