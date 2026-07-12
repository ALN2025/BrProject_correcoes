// Bytecode for: ext.mods.gameserver.model.actor.instance.Pet
// File: ext\mods\gameserver\model\actor\instance\Pet.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Pet.class
  Last modified 9 de jul de 2026; size 21287 bytes
  MD5 checksum 20f8198ce4d7ed1e1bac6b06fad6f297
  Compiled from "Pet.java"
public class ext.mods.gameserver.model.actor.instance.Pet extends ext.mods.gameserver.model.actor.Summon
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/actor/instance/Pet
  super_class: #2                         // ext/mods/gameserver/model/actor/Summon
  interfaces: 0, fields: 13, methods: 59, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Summon."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Summon
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Summon
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#10        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = NameAndType        #5:#11        // "<init>":()V
   #11 = Utf8               ()V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/actor/instance/Pet._reuseTimeStamps:Ljava/util/Map;
   #13 = Class              #15           // ext/mods/gameserver/model/actor/instance/Pet
   #14 = NameAndType        #16:#17       // _reuseTimeStamps:Ljava/util/Map;
   #15 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #16 = Utf8               _reuseTimeStamps
   #17 = Utf8               Ljava/util/Map;
   #18 = Class              #19           // ext/mods/gameserver/model/itemcontainer/PetInventory
   #19 = Utf8               ext/mods/gameserver/model/itemcontainer/PetInventory
   #20 = Methodref          #18.#21       // ext/mods/gameserver/model/itemcontainer/PetInventory."<init>":(Lext/mods/gameserver/model/actor/instance/Pet;)V
   #21 = NameAndType        #5:#22        // "<init>":(Lext/mods/gameserver/model/actor/instance/Pet;)V
   #22 = Utf8               (Lext/mods/gameserver/model/actor/instance/Pet;)V
   #23 = Fieldref           #13.#24       // ext/mods/gameserver/model/actor/instance/Pet._inventory:Lext/mods/gameserver/model/itemcontainer/PetInventory;
   #24 = NameAndType        #25:#26       // _inventory:Lext/mods/gameserver/model/itemcontainer/PetInventory;
   #25 = Utf8               _inventory
   #26 = Utf8               Lext/mods/gameserver/model/itemcontainer/PetInventory;
   #27 = Class              #28           // ext/mods/gameserver/network/serverpackets/PetInventoryUpdate
   #28 = Utf8               ext/mods/gameserver/network/serverpackets/PetInventoryUpdate
   #29 = Methodref          #27.#30       // ext/mods/gameserver/network/serverpackets/PetInventoryUpdate."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
   #30 = NameAndType        #5:#31        // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
   #31 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
   #32 = Fieldref           #13.#33       // ext/mods/gameserver/model/actor/instance/Pet._iu:Lext/mods/gameserver/network/serverpackets/PetInventoryUpdate;
   #33 = NameAndType        #34:#35       // _iu:Lext/mods/gameserver/network/serverpackets/PetInventoryUpdate;
   #34 = Utf8               _iu
   #35 = Utf8               Lext/mods/gameserver/network/serverpackets/PetInventoryUpdate;
   #36 = Fieldref           #37.#38       // ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
   #37 = Class              #39           // ext/mods/gameserver/enums/actors/WeightPenalty
   #38 = NameAndType        #40:#41       // NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
   #39 = Utf8               ext/mods/gameserver/enums/actors/WeightPenalty
   #40 = Utf8               NONE
   #41 = Utf8               Lext/mods/gameserver/enums/actors/WeightPenalty;
   #42 = Fieldref           #13.#43       // ext/mods/gameserver/model/actor/instance/Pet._weightPenalty:Lext/mods/gameserver/enums/actors/WeightPenalty;
   #43 = NameAndType        #44:#41       // _weightPenalty:Lext/mods/gameserver/enums/actors/WeightPenalty;
   #44 = Utf8               _weightPenalty
   #45 = Fieldref           #13.#46       // ext/mods/gameserver/model/actor/instance/Pet._expBeforeDeath:J
   #46 = NameAndType        #47:#48       // _expBeforeDeath:J
   #47 = Utf8               _expBeforeDeath
   #48 = Utf8               J
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #50 = Class              #52           // ext/mods/gameserver/model/item/instance/ItemInstance
   #51 = NameAndType        #53:#54       // getObjectId:()I
   #52 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #53 = Utf8               getObjectId
   #54 = Utf8               ()I
   #55 = Fieldref           #13.#56       // ext/mods/gameserver/model/actor/instance/Pet._controlItemId:I
   #56 = NameAndType        #57:#58       // _controlItemId:I
   #57 = Utf8               _controlItemId
   #58 = Utf8               I
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
   #60 = Class              #62           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #61 = NameAndType        #63:#54       // getNpcId:()I
   #62 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #63 = Utf8               getNpcId
   #64 = Fieldref           #13.#65       // ext/mods/gameserver/model/actor/instance/Pet._isMountable:Z
   #65 = NameAndType        #66:#67       // _isMountable:Z
   #66 = Utf8               _isMountable
   #67 = Utf8               Z
   #68 = Fieldref           #13.#69       // ext/mods/gameserver/model/actor/instance/Pet._status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #69 = NameAndType        #70:#71       // _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #70 = Utf8               _status
   #71 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #72 = Class              #73           // ext/mods/gameserver/model/actor/status/PetStatus
   #73 = Utf8               ext/mods/gameserver/model/actor/status/PetStatus
   #74 = Methodref          #72.#21       // ext/mods/gameserver/model/actor/status/PetStatus."<init>":(Lext/mods/gameserver/model/actor/instance/Pet;)V
   #75 = Methodref          #2.#76        // ext/mods/gameserver/model/actor/Summon.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #76 = NameAndType        #77:#78       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #77 = Utf8               getTemplate
   #78 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #79 = Class              #80           // ext/mods/gameserver/model/actor/template/PetTemplate
   #80 = Utf8               ext/mods/gameserver/model/actor/template/PetTemplate
   #81 = Methodref          #82.#51       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #82 = Class              #83           // ext/mods/gameserver/model/actor/Player
   #83 = Utf8               ext/mods/gameserver/model/actor/Player
   #84 = Methodref          #13.#85       // ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #85 = NameAndType        #86:#87       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #86 = Utf8               getOwner
   #87 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #88 = Methodref          #13.#89       // ext/mods/gameserver/model/actor/instance/Pet.setOwner:(Lext/mods/gameserver/model/actor/Player;)V
   #89 = NameAndType        #90:#91       // setOwner:(Lext/mods/gameserver/model/actor/Player;)V
   #90 = Utf8               setOwner
   #91 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #92 = Methodref          #2.#93        // ext/mods/gameserver/model/actor/Summon.onAction:(Lext/mods/gameserver/model/actor/Player;ZZ)V
   #93 = NameAndType        #94:#95       // onAction:(Lext/mods/gameserver/model/actor/Player;ZZ)V
   #94 = Utf8               onAction
   #95 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
   #96 = Fieldref           #97.#98       // ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
   #97 = Class              #99           // ext/mods/gameserver/enums/Paperdoll
   #98 = NameAndType        #100:#101     // RHAND:Lext/mods/gameserver/enums/Paperdoll;
   #99 = Utf8               ext/mods/gameserver/enums/Paperdoll
  #100 = Utf8               RHAND
  #101 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
  #102 = Methodref          #18.#103      // ext/mods/gameserver/model/itemcontainer/PetInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #103 = NameAndType        #104:#105     // getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #104 = Utf8               getItemFrom
  #105 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #106 = Methodref          #13.#107      // ext/mods/gameserver/model/actor/instance/Pet.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #107 = NameAndType        #108:#109     // getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #108 = Utf8               getActiveWeaponInstance
  #109 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #110 = Methodref          #50.#111      // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #111 = NameAndType        #112:#113     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #112 = Utf8               getItem
  #113 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #114 = Class              #115          // ext/mods/gameserver/model/item/kind/Weapon
  #115 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #116 = Methodref          #50.#117      // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #117 = NameAndType        #118:#54      // getCount:()I
  #118 = Utf8               getCount
  #119 = Methodref          #50.#120      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #120 = NameAndType        #121:#54      // getItemId:()I
  #121 = Utf8               getItemId
  #122 = Fieldref           #123.#124     // ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S1_ADENA:Lext/mods/gameserver/network/SystemMessageId;
  #123 = Class              #125          // ext/mods/gameserver/network/SystemMessageId
  #124 = NameAndType        #126:#127     // PET_PICKED_S1_ADENA:Lext/mods/gameserver/network/SystemMessageId;
  #125 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #126 = Utf8               PET_PICKED_S1_ADENA
  #127 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #128 = Methodref          #129.#130     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #129 = Class              #131          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #130 = NameAndType        #132:#133     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #131 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #132 = Utf8               getSystemMessage
  #133 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #134 = Methodref          #129.#135     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #135 = NameAndType        #136:#137     // addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #136 = Utf8               addItemNumber
  #137 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #138 = Methodref          #13.#139      // ext/mods/gameserver/model/actor/instance/Pet.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #139 = NameAndType        #140:#141     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #140 = Utf8               sendPacket
  #141 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #142 = Methodref          #50.#143      // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #143 = NameAndType        #144:#54      // getEnchantLevel:()I
  #144 = Utf8               getEnchantLevel
  #145 = Fieldref           #123.#146     // ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S1_S2:Lext/mods/gameserver/network/SystemMessageId;
  #146 = NameAndType        #147:#127     // PET_PICKED_S1_S2:Lext/mods/gameserver/network/SystemMessageId;
  #147 = Utf8               PET_PICKED_S1_S2
  #148 = Methodref          #129.#149     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #149 = NameAndType        #150:#137     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #150 = Utf8               addNumber
  #151 = Methodref          #129.#152     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #152 = NameAndType        #153:#137     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #153 = Utf8               addItemName
  #154 = Fieldref           #123.#155     // ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #155 = NameAndType        #156:#127     // PET_PICKED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #156 = Utf8               PET_PICKED_S2_S1_S
  #157 = Fieldref           #123.#158     // ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S1:Lext/mods/gameserver/network/SystemMessageId;
  #158 = NameAndType        #159:#127     // PET_PICKED_S1:Lext/mods/gameserver/network/SystemMessageId;
  #159 = Utf8               PET_PICKED_S1
  #160 = Methodref          #18.#161      // ext/mods/gameserver/model/itemcontainer/PetInventory.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #161 = NameAndType        #162:#163     // addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #162 = Utf8               addItem
  #163 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #164 = Methodref          #18.#165      // ext/mods/gameserver/model/itemcontainer/PetInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #165 = NameAndType        #162:#166     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #166 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #167 = Methodref          #18.#168      // ext/mods/gameserver/model/itemcontainer/PetInventory.destroyItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #168 = NameAndType        #169:#166     // destroyItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #169 = Utf8               destroyItem
  #170 = Fieldref           #123.#171     // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #171 = NameAndType        #172:#127     // NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #172 = Utf8               NOT_ENOUGH_ITEMS
  #173 = Methodref          #13.#174      // ext/mods/gameserver/model/actor/instance/Pet.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #174 = NameAndType        #140:#175     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #175 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #176 = Fieldref           #123.#177     // ext/mods/gameserver/network/SystemMessageId.S2_S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
  #177 = NameAndType        #178:#127     // S2_S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
  #178 = Utf8               S2_S1_DISAPPEARED
  #179 = Fieldref           #123.#180     // ext/mods/gameserver/network/SystemMessageId.S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
  #180 = NameAndType        #181:#127     // S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
  #181 = Utf8               S1_DISAPPEARED
  #182 = Methodref          #18.#183      // ext/mods/gameserver/model/itemcontainer/PetInventory.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #183 = NameAndType        #184:#166     // destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #184 = Utf8               destroyItemByItemId
  #185 = Methodref          #13.#186      // ext/mods/gameserver/model/actor/instance/Pet.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #186 = NameAndType        #187:#188     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #187 = Utf8               getInventory
  #188 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #189 = Methodref          #18.#190      // ext/mods/gameserver/model/itemcontainer/PetInventory.deleteMe:()V
  #190 = NameAndType        #191:#11      // deleteMe:()V
  #191 = Utf8               deleteMe
  #192 = Methodref          #2.#193       // ext/mods/gameserver/model/actor/Summon.deleteMe:(Lext/mods/gameserver/model/actor/Player;)V
  #193 = NameAndType        #191:#91      // deleteMe:(Lext/mods/gameserver/model/actor/Player;)V
  #194 = Methodref          #13.#195      // ext/mods/gameserver/model/actor/instance/Pet.destroyControlItem:(Lext/mods/gameserver/model/actor/Player;)V
  #195 = NameAndType        #196:#91      // destroyControlItem:(Lext/mods/gameserver/model/actor/Player;)V
  #196 = Utf8               destroyControlItem
  #197 = Methodref          #2.#198       // ext/mods/gameserver/model/actor/Summon.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #198 = NameAndType        #199:#200     // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #199 = Utf8               doDie
  #200 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #201 = Methodref          #13.#202      // ext/mods/gameserver/model/actor/instance/Pet.stopFeed:()V
  #202 = NameAndType        #203:#11      // stopFeed:()V
  #203 = Utf8               stopFeed
  #204 = Fieldref           #123.#205     // ext/mods/gameserver/network/SystemMessageId.MAKE_SURE_YOU_RESSURECT_YOUR_PET_WITHIN_20_MINUTES:Lext/mods/gameserver/network/SystemMessageId;
  #205 = NameAndType        #206:#127     // MAKE_SURE_YOU_RESSURECT_YOUR_PET_WITHIN_20_MINUTES:Lext/mods/gameserver/network/SystemMessageId;
  #206 = Utf8               MAKE_SURE_YOU_RESSURECT_YOUR_PET_WITHIN_20_MINUTES
  #207 = Methodref          #208.#209     // ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #208 = Class              #210          // ext/mods/gameserver/taskmanager/DecayTaskManager
  #209 = NameAndType        #211:#212     // getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #210 = Utf8               ext/mods/gameserver/taskmanager/DecayTaskManager
  #211 = Utf8               getInstance
  #212 = Utf8               ()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #213 = Methodref          #208.#214     // ext/mods/gameserver/taskmanager/DecayTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;I)V
  #214 = NameAndType        #215:#216     // add:(Lext/mods/gameserver/model/actor/Creature;I)V
  #215 = Utf8               add
  #216 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #217 = Methodref          #82.#218      // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
  #218 = NameAndType        #219:#220     // isInDuel:()Z
  #219 = Utf8               isInDuel
  #220 = Utf8               ()Z
  #221 = Fieldref           #222.#223     // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
  #222 = Class              #224          // ext/mods/gameserver/enums/ZoneId
  #223 = NameAndType        #225:#226     // PVP:Lext/mods/gameserver/enums/ZoneId;
  #224 = Utf8               ext/mods/gameserver/enums/ZoneId
  #225 = Utf8               PVP
  #226 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #227 = Methodref          #13.#228      // ext/mods/gameserver/model/actor/instance/Pet.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #228 = NameAndType        #229:#230     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #229 = Utf8               isInsideZone
  #230 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #231 = Fieldref           #222.#232     // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #232 = NameAndType        #233:#226     // SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #233 = Utf8               SIEGE
  #234 = Methodref          #13.#235      // ext/mods/gameserver/model/actor/instance/Pet.deathPenalty:()V
  #235 = NameAndType        #236:#11      // deathPenalty:()V
  #236 = Utf8               deathPenalty
  #237 = Methodref          #82.#238      // ext/mods/gameserver/model/actor/Player.removeReviving:()V
  #238 = NameAndType        #239:#11      // removeReviving:()V
  #239 = Utf8               removeReviving
  #240 = Methodref          #2.#241       // ext/mods/gameserver/model/actor/Summon.doRevive:()V
  #241 = NameAndType        #242:#11      // doRevive:()V
  #242 = Utf8               doRevive
  #243 = Methodref          #208.#244     // ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
  #244 = NameAndType        #245:#200     // cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
  #245 = Utf8               cancel
  #246 = Methodref          #13.#247      // ext/mods/gameserver/model/actor/instance/Pet.startFeed:()V
  #247 = NameAndType        #248:#11      // startFeed:()V
  #248 = Utf8               startFeed
  #249 = Methodref          #13.#250      // ext/mods/gameserver/model/actor/instance/Pet.checkHungryState:()Z
  #250 = NameAndType        #251:#220     // checkHungryState:()Z
  #251 = Utf8               checkHungryState
  #252 = Methodref          #13.#253      // ext/mods/gameserver/model/actor/instance/Pet.forceRunStance:()V
  #253 = NameAndType        #254:#11      // forceRunStance:()V
  #254 = Utf8               forceRunStance
  #255 = Methodref          #13.#256      // ext/mods/gameserver/model/actor/instance/Pet.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #256 = NameAndType        #257:#258     // getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #257 = Utf8               getAI
  #258 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #259 = Methodref          #260.#261     // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToIdle:()V
  #260 = Class              #262          // ext/mods/gameserver/model/actor/ai/type/SummonAI
  #261 = NameAndType        #263:#11      // tryToIdle:()V
  #262 = Utf8               ext/mods/gameserver/model/actor/ai/type/SummonAI
  #263 = Utf8               tryToIdle
  #264 = Methodref          #13.#265      // ext/mods/gameserver/model/actor/instance/Pet.restoreExp:(D)V
  #265 = NameAndType        #266:#267     // restoreExp:(D)V
  #266 = Utf8               restoreExp
  #267 = Utf8               (D)V
  #268 = Methodref          #13.#241      // ext/mods/gameserver/model/actor/instance/Pet.doRevive:()V
  #269 = Fieldref           #97.#270      // ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
  #270 = NameAndType        #271:#101     // CHEST:Lext/mods/gameserver/enums/Paperdoll;
  #271 = Utf8               CHEST
  #272 = Methodref          #273.#274     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #273 = Class              #275          // ext/mods/commons/pool/ConnectionPool
  #274 = NameAndType        #276:#277     // getConnection:()Ljava/sql/Connection;
  #275 = Utf8               ext/mods/commons/pool/ConnectionPool
  #276 = Utf8               getConnection
  #277 = Utf8               ()Ljava/sql/Connection;
  #278 = String             #279          // INSERT INTO pets (name,level,curHp,curMp,exp,sp,fed,item_obj_id) VALUES (?,?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE name=VALUES(name),level=VALUES(level),curHp=VALUES(curHp),curMp=VALUES(curMp),exp=VALUES(exp),sp=VALUES(sp),fed=VALUES(fed)
  #279 = Utf8               INSERT INTO pets (name,level,curHp,curMp,exp,sp,fed,item_obj_id) VALUES (?,?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE name=VALUES(name),level=VALUES(level),curHp=VALUES(curHp),curMp=VALUES(curMp),exp=VALUES(exp),sp=VALUES(sp),fed=VALUES(fed)
  #280 = InterfaceMethodref #281.#282     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #281 = Class              #283          // java/sql/Connection
  #282 = NameAndType        #284:#285     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #283 = Utf8               java/sql/Connection
  #284 = Utf8               prepareStatement
  #285 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #286 = Methodref          #13.#287      // ext/mods/gameserver/model/actor/instance/Pet.getName:()Ljava/lang/String;
  #287 = NameAndType        #288:#289     // getName:()Ljava/lang/String;
  #288 = Utf8               getName
  #289 = Utf8               ()Ljava/lang/String;
  #290 = InterfaceMethodref #291.#292     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #291 = Class              #293          // java/sql/PreparedStatement
  #292 = NameAndType        #294:#295     // setString:(ILjava/lang/String;)V
  #293 = Utf8               java/sql/PreparedStatement
  #294 = Utf8               setString
  #295 = Utf8               (ILjava/lang/String;)V
  #296 = Methodref          #13.#297      // ext/mods/gameserver/model/actor/instance/Pet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
  #297 = NameAndType        #298:#299     // getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
  #298 = Utf8               getStatus
  #299 = Utf8               ()Lext/mods/gameserver/model/actor/status/PetStatus;
  #300 = Methodref          #72.#301      // ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
  #301 = NameAndType        #302:#54      // getLevel:()I
  #302 = Utf8               getLevel
  #303 = InterfaceMethodref #291.#304     // java/sql/PreparedStatement.setInt:(II)V
  #304 = NameAndType        #305:#306     // setInt:(II)V
  #305 = Utf8               setInt
  #306 = Utf8               (II)V
  #307 = Methodref          #72.#308      // ext/mods/gameserver/model/actor/status/PetStatus.getHp:()D
  #308 = NameAndType        #309:#310     // getHp:()D
  #309 = Utf8               getHp
  #310 = Utf8               ()D
  #311 = InterfaceMethodref #291.#312     // java/sql/PreparedStatement.setDouble:(ID)V
  #312 = NameAndType        #313:#314     // setDouble:(ID)V
  #313 = Utf8               setDouble
  #314 = Utf8               (ID)V
  #315 = Methodref          #72.#316      // ext/mods/gameserver/model/actor/status/PetStatus.getMp:()D
  #316 = NameAndType        #317:#310     // getMp:()D
  #317 = Utf8               getMp
  #318 = Methodref          #72.#319      // ext/mods/gameserver/model/actor/status/PetStatus.getExp:()J
  #319 = NameAndType        #320:#321     // getExp:()J
  #320 = Utf8               getExp
  #321 = Utf8               ()J
  #322 = InterfaceMethodref #291.#323     // java/sql/PreparedStatement.setLong:(IJ)V
  #323 = NameAndType        #324:#325     // setLong:(IJ)V
  #324 = Utf8               setLong
  #325 = Utf8               (IJ)V
  #326 = Methodref          #72.#327      // ext/mods/gameserver/model/actor/status/PetStatus.getSp:()I
  #327 = NameAndType        #328:#54      // getSp:()I
  #328 = Utf8               getSp
  #329 = Methodref          #13.#330      // ext/mods/gameserver/model/actor/instance/Pet.getCurrentFed:()I
  #330 = NameAndType        #331:#54      // getCurrentFed:()I
  #331 = Utf8               getCurrentFed
  #332 = InterfaceMethodref #291.#333     // java/sql/PreparedStatement.executeUpdate:()I
  #333 = NameAndType        #334:#54      // executeUpdate:()I
  #334 = Utf8               executeUpdate
  #335 = InterfaceMethodref #291.#336     // java/sql/PreparedStatement.close:()V
  #336 = NameAndType        #337:#11      // close:()V
  #337 = Utf8               close
  #338 = Class              #339          // java/lang/Throwable
  #339 = Utf8               java/lang/Throwable
  #340 = Methodref          #338.#341     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #341 = NameAndType        #342:#343     // addSuppressed:(Ljava/lang/Throwable;)V
  #342 = Utf8               addSuppressed
  #343 = Utf8               (Ljava/lang/Throwable;)V
  #344 = InterfaceMethodref #281.#336     // java/sql/Connection.close:()V
  #345 = Class              #346          // java/lang/Exception
  #346 = Utf8               java/lang/Exception
  #347 = Fieldref           #13.#348      // ext/mods/gameserver/model/actor/instance/Pet.LOGGER:Lext/mods/commons/logging/CLogger;
  #348 = NameAndType        #349:#350     // LOGGER:Lext/mods/commons/logging/CLogger;
  #349 = Utf8               LOGGER
  #350 = Utf8               Lext/mods/commons/logging/CLogger;
  #351 = String             #352          // Couldn\'t store pet data for {}.
  #352 = Utf8               Couldn\'t store pet data for {}.
  #353 = Class              #354          // java/lang/Object
  #354 = Utf8               java/lang/Object
  #355 = Methodref          #13.#51       // ext/mods/gameserver/model/actor/instance/Pet.getObjectId:()I
  #356 = Methodref          #357.#358     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #357 = Class              #359          // java/lang/Integer
  #358 = NameAndType        #360:#361     // valueOf:(I)Ljava/lang/Integer;
  #359 = Utf8               java/lang/Integer
  #360 = Utf8               valueOf
  #361 = Utf8               (I)Ljava/lang/Integer;
  #362 = Methodref          #363.#364     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #363 = Class              #365          // ext/mods/commons/logging/CLogger
  #364 = NameAndType        #366:#367     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #365 = Utf8               ext/mods/commons/logging/CLogger
  #366 = Utf8               error
  #367 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #368 = Methodref          #13.#369      // ext/mods/gameserver/model/actor/instance/Pet.getControlItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #369 = NameAndType        #370:#109     // getControlItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #370 = Utf8               getControlItem
  #371 = Methodref          #50.#372      // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #372 = NameAndType        #373:#374     // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #373 = Utf8               setEnchantLevel
  #374 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #375 = Methodref          #13.#376      // ext/mods/gameserver/model/actor/instance/Pet.isDead:()Z
  #376 = NameAndType        #377:#220     // isDead:()Z
  #377 = Utf8               isDead
  #378 = Methodref          #2.#379       // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #379 = NameAndType        #380:#91      // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #380 = Utf8               unSummon
  #381 = Methodref          #382.#383     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #382 = Class              #384          // ext/mods/gameserver/model/World
  #383 = NameAndType        #211:#385     // getInstance:()Lext/mods/gameserver/model/World;
  #384 = Utf8               ext/mods/gameserver/model/World
  #385 = Utf8               ()Lext/mods/gameserver/model/World;
  #386 = Methodref          #382.#387     // ext/mods/gameserver/model/World.removePet:(I)V
  #387 = NameAndType        #388:#389     // removePet:(I)V
  #388 = Utf8               removePet
  #389 = Utf8               (I)V
  #390 = Methodref          #13.#61       // ext/mods/gameserver/model/actor/instance/Pet.getNpcId:()I
  #391 = Fieldref           #392.#393     // ext/mods/Config.SINEATER_XP_RATE:D
  #392 = Class              #394          // ext/mods/Config
  #393 = NameAndType        #395:#396     // SINEATER_XP_RATE:D
  #394 = Utf8               ext/mods/Config
  #395 = Utf8               SINEATER_XP_RATE
  #396 = Utf8               D
  #397 = Fieldref           #392.#398     // ext/mods/Config.PET_XP_RATE:D
  #398 = NameAndType        #399:#396     // PET_XP_RATE:D
  #399 = Utf8               PET_XP_RATE
  #400 = Methodref          #401.#402     // java/lang/Math.round:(D)J
  #401 = Class              #403          // java/lang/Math
  #402 = NameAndType        #404:#405     // round:(D)J
  #403 = Utf8               java/lang/Math
  #404 = Utf8               round
  #405 = Utf8               (D)J
  #406 = Methodref          #72.#407      // ext/mods/gameserver/model/actor/status/PetStatus.addExpAndSp:(JI)Z
  #407 = NameAndType        #408:#409     // addExpAndSp:(JI)Z
  #408 = Utf8               addExpAndSp
  #409 = Utf8               (JI)Z
  #410 = Methodref          #13.#411      // ext/mods/gameserver/model/actor/instance/Pet.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #411 = NameAndType        #412:#413     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #412 = Utf8               getSkill
  #413 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #414 = Methodref          #415.#416     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #415 = Class              #417          // ext/mods/gameserver/data/SkillTable
  #416 = NameAndType        #211:#418     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #417 = Utf8               ext/mods/gameserver/data/SkillTable
  #418 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #419 = Methodref          #415.#420     // ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
  #420 = NameAndType        #421:#422     // getMaxLevel:(I)I
  #421 = Utf8               getMaxLevel
  #422 = Utf8               (I)I
  #423 = Methodref          #401.#424     // java/lang/Math.clamp:(JII)I
  #424 = NameAndType        #425:#426     // clamp:(JII)I
  #425 = Utf8               clamp
  #426 = Utf8               (JII)I
  #427 = Fieldref           #428.#429     // ext/mods/gameserver/enums/skills/Stats.WEIGHT_LIMIT:Lext/mods/gameserver/enums/skills/Stats;
  #428 = Class              #430          // ext/mods/gameserver/enums/skills/Stats
  #429 = NameAndType        #431:#432     // WEIGHT_LIMIT:Lext/mods/gameserver/enums/skills/Stats;
  #430 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #431 = Utf8               WEIGHT_LIMIT
  #432 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #433 = Double             34500.0d
  #435 = Fieldref           #436.#437     // ext/mods/gameserver/skills/Formulas.CON_BONUS:[D
  #436 = Class              #438          // ext/mods/gameserver/skills/Formulas
  #437 = NameAndType        #439:#440     // CON_BONUS:[D
  #438 = Utf8               ext/mods/gameserver/skills/Formulas
  #439 = Utf8               CON_BONUS
  #440 = Utf8               [D
  #441 = Methodref          #72.#442      // ext/mods/gameserver/model/actor/status/PetStatus.getCON:()I
  #442 = NameAndType        #443:#54      // getCON:()I
  #443 = Utf8               getCON
  #444 = Fieldref           #392.#445     // ext/mods/Config.WEIGHT_LIMIT:D
  #445 = NameAndType        #431:#396     // WEIGHT_LIMIT:D
  #446 = Methodref          #72.#447      // ext/mods/gameserver/model/actor/status/PetStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #447 = NameAndType        #448:#449     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #448 = Utf8               calcStat
  #449 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #450 = Methodref          #13.#451      // ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
  #451 = NameAndType        #452:#453     // getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
  #452 = Utf8               getPetData
  #453 = Utf8               ()Lext/mods/gameserver/model/records/PetDataEntry;
  #454 = Methodref          #455.#456     // ext/mods/gameserver/model/records/PetDataEntry.ssCount:()I
  #455 = Class              #457          // ext/mods/gameserver/model/records/PetDataEntry
  #456 = NameAndType        #458:#54      // ssCount:()I
  #457 = Utf8               ext/mods/gameserver/model/records/PetDataEntry
  #458 = Utf8               ssCount
  #459 = Methodref          #455.#460     // ext/mods/gameserver/model/records/PetDataEntry.spsCount:()I
  #460 = NameAndType        #461:#54      // spsCount:()I
  #461 = Utf8               spsCount
  #462 = Methodref          #13.#463      // ext/mods/gameserver/model/actor/instance/Pet.refreshWeightPenalty:()V
  #463 = NameAndType        #464:#11      // refreshWeightPenalty:()V
  #464 = Utf8               refreshWeightPenalty
  #465 = Methodref          #2.#466       // ext/mods/gameserver/model/actor/Summon.updateAndBroadcastStatus:(I)V
  #466 = NameAndType        #467:#389     // updateAndBroadcastStatus:(I)V
  #467 = Utf8               updateAndBroadcastStatus
  #468 = Methodref          #469.#470     // ext/mods/gameserver/skills/L2Skill.getReuseHashCode:()I
  #469 = Class              #471          // ext/mods/gameserver/skills/L2Skill
  #470 = NameAndType        #472:#54      // getReuseHashCode:()I
  #471 = Utf8               ext/mods/gameserver/skills/L2Skill
  #472 = Utf8               getReuseHashCode
  #473 = Class              #474          // ext/mods/gameserver/model/records/Timestamp
  #474 = Utf8               ext/mods/gameserver/model/records/Timestamp
  #475 = Methodref          #473.#476     // ext/mods/gameserver/model/records/Timestamp."<init>":(Lext/mods/gameserver/skills/L2Skill;J)V
  #476 = NameAndType        #5:#477       // "<init>":(Lext/mods/gameserver/skills/L2Skill;J)V
  #477 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
  #478 = InterfaceMethodref #479.#480     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #479 = Class              #481          // java/util/Map
  #480 = NameAndType        #482:#483     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #481 = Utf8               java/util/Map
  #482 = Utf8               put
  #483 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #484 = InterfaceMethodref #479.#485     // java/util/Map.values:()Ljava/util/Collection;
  #485 = NameAndType        #486:#487     // values:()Ljava/util/Collection;
  #486 = Utf8               values
  #487 = Utf8               ()Ljava/util/Collection;
  #488 = Fieldref           #13.#489      // ext/mods/gameserver/model/actor/instance/Pet._petData:Lext/mods/gameserver/model/records/PetDataEntry;
  #489 = NameAndType        #490:#491     // _petData:Lext/mods/gameserver/model/records/PetDataEntry;
  #490 = Utf8               _petData
  #491 = Utf8               Lext/mods/gameserver/model/records/PetDataEntry;
  #492 = Methodref          #13.#493      // ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
  #493 = NameAndType        #77:#494      // getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
  #494 = Utf8               ()Lext/mods/gameserver/model/actor/template/PetTemplate;
  #495 = Methodref          #79.#496      // ext/mods/gameserver/model/actor/template/PetTemplate.getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
  #496 = NameAndType        #497:#498     // getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
  #497 = Utf8               getPetDataEntry
  #498 = Utf8               (I)Lext/mods/gameserver/model/records/PetDataEntry;
  #499 = Methodref          #82.#500      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #500 = NameAndType        #187:#501     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #501 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #502 = Methodref          #503.#504     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #503 = Class              #505          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #504 = NameAndType        #506:#507     // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #505 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #506 = Utf8               getItemByObjectId
  #507 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #508 = Fieldref           #13.#509      // ext/mods/gameserver/model/actor/instance/Pet._curFed:I
  #509 = NameAndType        #510:#58      // _curFed:I
  #510 = Utf8               _curFed
  #511 = Methodref          #455.#512     // ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
  #512 = NameAndType        #513:#54      // maxMeal:()I
  #513 = Utf8               maxMeal
  #514 = Methodref          #401.#515     // java/lang/Math.min:(II)I
  #515 = NameAndType        #516:#517     // min:(II)I
  #516 = Utf8               min
  #517 = Utf8               (II)I
  #518 = Methodref          #13.#519      // ext/mods/gameserver/model/actor/instance/Pet.checkItemManipulation:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #519 = NameAndType        #520:#166     // checkItemManipulation:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #520 = Utf8               checkItemManipulation
  #521 = Methodref          #50.#522      // ext/mods/gameserver/model/item/instance/ItemInstance.isPetItem:()Z
  #522 = NameAndType        #523:#220     // isPetItem:()Z
  #523 = Utf8               isPetItem
  #524 = Methodref          #50.#525      // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
  #525 = NameAndType        #526:#220     // isEquipped:()Z
  #526 = Utf8               isEquipped
  #527 = Methodref          #2.#528       // ext/mods/gameserver/model/actor/Summon.transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #528 = NameAndType        #529:#530     // transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #529 = Utf8               transferItem
  #530 = Utf8               (IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #531 = Fieldref           #123.#532     // ext/mods/gameserver/network/SystemMessageId.PET_TOOK_OFF_S1:Lext/mods/gameserver/network/SystemMessageId;
  #532 = NameAndType        #533:#127     // PET_TOOK_OFF_S1:Lext/mods/gameserver/network/SystemMessageId;
  #533 = Utf8               PET_TOOK_OFF_S1
  #534 = Methodref          #129.#535     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #535 = NameAndType        #153:#536     // addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #536 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #537 = Methodref          #18.#504      // ext/mods/gameserver/model/itemcontainer/PetInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #538 = Methodref          #50.#539      // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
  #539 = NameAndType        #540:#220     // isStackable:()Z
  #540 = Utf8               isStackable
  #541 = Methodref          #82.#542      // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
  #542 = NameAndType        #169:#543     // destroyItem:(IIZ)Z
  #543 = Utf8               (IIZ)Z
  #544 = String             #545          // DELETE FROM pets WHERE item_obj_id=?
  #545 = Utf8               DELETE FROM pets WHERE item_obj_id=?
  #546 = String             #547          // Couldn\'t delete pet data for {}.
  #547 = Utf8               Couldn\'t delete pet data for {}.
  #548 = String             #549          // BabyPet
  #549 = Utf8               BabyPet
  #550 = Methodref          #60.#551      // ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
  #551 = NameAndType        #552:#553     // isType:(Ljava/lang/String;)Z
  #552 = Utf8               isType
  #553 = Utf8               (Ljava/lang/String;)Z
  #554 = Class              #555          // ext/mods/gameserver/model/actor/instance/BabyPet
  #555 = Utf8               ext/mods/gameserver/model/actor/instance/BabyPet
  #556 = Methodref          #557.#558     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #557 = Class              #559          // ext/mods/gameserver/idfactory/IdFactory
  #558 = NameAndType        #211:#560     // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #559 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #560 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #561 = Methodref          #557.#562     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #562 = NameAndType        #563:#54      // getNextId:()I
  #563 = Utf8               getNextId
  #564 = Methodref          #554.#565     // ext/mods/gameserver/model/actor/instance/BabyPet."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #565 = NameAndType        #5:#566       // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #566 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #567 = Methodref          #13.#565      // ext/mods/gameserver/model/actor/instance/Pet."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #568 = String             #569          // SELECT name, level, curHp, curMp, exp, sp, fed FROM pets WHERE item_obj_id=?
  #569 = Utf8               SELECT name, level, curHp, curMp, exp, sp, fed FROM pets WHERE item_obj_id=?
  #570 = InterfaceMethodref #291.#571     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #571 = NameAndType        #572:#573     // executeQuery:()Ljava/sql/ResultSet;
  #572 = Utf8               executeQuery
  #573 = Utf8               ()Ljava/sql/ResultSet;
  #574 = InterfaceMethodref #575.#576     // java/sql/ResultSet.next:()Z
  #575 = Class              #577          // java/sql/ResultSet
  #576 = NameAndType        #578:#220     // next:()Z
  #577 = Utf8               java/sql/ResultSet
  #578 = Utf8               next
  #579 = String             #580          // name
  #580 = Utf8               name
  #581 = InterfaceMethodref #575.#582     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #582 = NameAndType        #583:#584     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #583 = Utf8               getString
  #584 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #585 = Methodref          #13.#586      // ext/mods/gameserver/model/actor/instance/Pet.setName:(Ljava/lang/String;)V
  #586 = NameAndType        #587:#588     // setName:(Ljava/lang/String;)V
  #587 = Utf8               setName
  #588 = Utf8               (Ljava/lang/String;)V
  #589 = String             #590          // level
  #590 = Utf8               level
  #591 = InterfaceMethodref #575.#592     // java/sql/ResultSet.getByte:(Ljava/lang/String;)B
  #592 = NameAndType        #593:#594     // getByte:(Ljava/lang/String;)B
  #593 = Utf8               getByte
  #594 = Utf8               (Ljava/lang/String;)B
  #595 = Methodref          #72.#596      // ext/mods/gameserver/model/actor/status/PetStatus.setLevel:(I)V
  #596 = NameAndType        #597:#389     // setLevel:(I)V
  #597 = Utf8               setLevel
  #598 = String             #599          // exp
  #599 = Utf8               exp
  #600 = InterfaceMethodref #575.#601     // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #601 = NameAndType        #602:#603     // getLong:(Ljava/lang/String;)J
  #602 = Utf8               getLong
  #603 = Utf8               (Ljava/lang/String;)J
  #604 = Methodref          #72.#605      // ext/mods/gameserver/model/actor/status/PetStatus.setExp:(J)V
  #605 = NameAndType        #606:#607     // setExp:(J)V
  #606 = Utf8               setExp
  #607 = Utf8               (J)V
  #608 = String             #609          // sp
  #609 = Utf8               sp
  #610 = InterfaceMethodref #575.#611     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #611 = NameAndType        #612:#613     // getInt:(Ljava/lang/String;)I
  #612 = Utf8               getInt
  #613 = Utf8               (Ljava/lang/String;)I
  #614 = Methodref          #72.#615      // ext/mods/gameserver/model/actor/status/PetStatus.setSp:(I)V
  #615 = NameAndType        #616:#389     // setSp:(I)V
  #616 = Utf8               setSp
  #617 = String             #618          // curHp
  #618 = Utf8               curHp
  #619 = InterfaceMethodref #575.#620     // java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
  #620 = NameAndType        #621:#622     // getDouble:(Ljava/lang/String;)D
  #621 = Utf8               getDouble
  #622 = Utf8               (Ljava/lang/String;)D
  #623 = String             #624          // curMp
  #624 = Utf8               curMp
  #625 = Methodref          #72.#626      // ext/mods/gameserver/model/actor/status/PetStatus.setHpMp:(DD)V
  #626 = NameAndType        #627:#628     // setHpMp:(DD)V
  #627 = Utf8               setHpMp
  #628 = Utf8               (DD)V
  #629 = Double             0.5d
  #631 = Methodref          #13.#632      // ext/mods/gameserver/model/actor/instance/Pet.setIsDead:(Z)V
  #632 = NameAndType        #633:#634     // setIsDead:(Z)V
  #633 = Utf8               setIsDead
  #634 = Utf8               (Z)V
  #635 = Methodref          #72.#636      // ext/mods/gameserver/model/actor/status/PetStatus.stopHpMpRegeneration:()V
  #636 = NameAndType        #637:#11      // stopHpMpRegeneration:()V
  #637 = Utf8               stopHpMpRegeneration
  #638 = String             #639          // fed
  #639 = Utf8               fed
  #640 = Methodref          #13.#641      // ext/mods/gameserver/model/actor/instance/Pet.setCurrentFed:(I)V
  #641 = NameAndType        #642:#389     // setCurrentFed:(I)V
  #642 = Utf8               setCurrentFed
  #643 = Methodref          #82.#644      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #644 = NameAndType        #298:#645     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #645 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #646 = Methodref          #647.#301     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #647 = Class              #648          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #648 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #649 = Methodref          #60.#650      // ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
  #650 = NameAndType        #302:#651     // getLevel:()B
  #651 = Utf8               ()B
  #652 = Methodref          #72.#653      // ext/mods/gameserver/model/actor/status/PetStatus.getExpForThisLevel:()J
  #653 = NameAndType        #654:#321     // getExpForThisLevel:()J
  #654 = Utf8               getExpForThisLevel
  #655 = Methodref          #72.#656      // ext/mods/gameserver/model/actor/status/PetStatus.setMaxHpMp:()V
  #656 = NameAndType        #657:#11      // setMaxHpMp:()V
  #657 = Utf8               setMaxHpMp
  #658 = Methodref          #13.#659      // ext/mods/gameserver/model/actor/instance/Pet.store:()V
  #659 = NameAndType        #660:#11      // store:()V
  #660 = Utf8               store
  #661 = InterfaceMethodref #575.#336     // java/sql/ResultSet.close:()V
  #662 = String             #663          // Couldn\'t restore pet data for {}.
  #663 = Utf8               Couldn\'t restore pet data for {}.
  #664 = Methodref          #82.#287      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #665 = Fieldref           #13.#666      // ext/mods/gameserver/model/actor/instance/Pet._feedTask:Ljava/util/concurrent/Future;
  #666 = NameAndType        #667:#668     // _feedTask:Ljava/util/concurrent/Future;
  #667 = Utf8               _feedTask
  #668 = Utf8               Ljava/util/concurrent/Future;
  #669 = InterfaceMethodref #670.#671     // java/util/concurrent/Future.cancel:(Z)Z
  #670 = Class              #672          // java/util/concurrent/Future
  #671 = NameAndType        #245:#673     // cancel:(Z)Z
  #672 = Utf8               java/util/concurrent/Future
  #673 = Utf8               (Z)Z
  #674 = Methodref          #82.#675      // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #675 = NameAndType        #676:#677     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #676 = Utf8               getSummon
  #677 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #678 = Class              #679          // ext/mods/gameserver/model/actor/instance/Pet$FeedTask
  #679 = Utf8               ext/mods/gameserver/model/actor/instance/Pet$FeedTask
  #680 = Methodref          #678.#21      // ext/mods/gameserver/model/actor/instance/Pet$FeedTask."<init>":(Lext/mods/gameserver/model/actor/instance/Pet;)V
  #681 = Long               10000l
  #683 = Methodref          #684.#685     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #684 = Class              #686          // ext/mods/commons/pool/ThreadPool
  #685 = NameAndType        #687:#688     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #686 = Utf8               ext/mods/commons/pool/ThreadPool
  #687 = Utf8               scheduleAtFixedRate
  #688 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #689 = Double             100.0d
  #691 = Methodref          #72.#692      // ext/mods/gameserver/model/actor/status/PetStatus.addExp:(J)Z
  #692 = NameAndType        #693:#694     // addExp:(J)Z
  #693 = Utf8               addExp
  #694 = Utf8               (J)Z
  #695 = Double             -0.07d
  #697 = Double             6.5d
  #699 = Methodref          #72.#700      // ext/mods/gameserver/model/actor/status/PetStatus.getExpForLevel:(I)J
  #700 = NameAndType        #701:#702     // getExpForLevel:(I)J
  #701 = Utf8               getExpForLevel
  #702 = Utf8               (I)J
  #703 = Methodref          #18.#704      // ext/mods/gameserver/model/itemcontainer/PetInventory.getTotalWeight:()I
  #704 = NameAndType        #705:#54      // getTotalWeight:()I
  #705 = Utf8               getTotalWeight
  #706 = Fieldref           #392.#707     // ext/mods/Config.INVENTORY_MAXIMUM_PET:I
  #707 = NameAndType        #708:#58      // INVENTORY_MAXIMUM_PET:I
  #708 = Utf8               INVENTORY_MAXIMUM_PET
  #709 = Methodref          #13.#710      // ext/mods/gameserver/model/actor/instance/Pet.getWeightLimit:()I
  #710 = NameAndType        #711:#54      // getWeightLimit:()I
  #711 = Utf8               getWeightLimit
  #712 = Methodref          #13.#713      // ext/mods/gameserver/model/actor/instance/Pet.getCurrentWeight:()I
  #713 = NameAndType        #714:#54      // getCurrentWeight:()I
  #714 = Utf8               getCurrentWeight
  #715 = Fieldref           #428.#716     // ext/mods/gameserver/enums/skills/Stats.WEIGHT_PENALTY:Lext/mods/gameserver/enums/skills/Stats;
  #716 = NameAndType        #717:#432     // WEIGHT_PENALTY:Lext/mods/gameserver/enums/skills/Stats;
  #717 = Utf8               WEIGHT_PENALTY
  #718 = Double             0.666d
  #720 = Fieldref           #37.#721      // ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_1:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #721 = NameAndType        #722:#41      // LEVEL_1:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #722 = Utf8               LEVEL_1
  #723 = Double             0.8d
  #725 = Fieldref           #37.#726      // ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_2:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #726 = NameAndType        #727:#41      // LEVEL_2:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #727 = Utf8               LEVEL_2
  #728 = Fieldref           #37.#729      // ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_3:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #729 = NameAndType        #730:#41      // LEVEL_3:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #730 = Utf8               LEVEL_3
  #731 = Fieldref           #37.#732      // ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_4:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #732 = NameAndType        #733:#41      // LEVEL_4:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #733 = Utf8               LEVEL_4
  #734 = Methodref          #72.#735      // ext/mods/gameserver/model/actor/status/PetStatus.broadcastStatusUpdate:()V
  #735 = NameAndType        #736:#11      // broadcastStatusUpdate:()V
  #736 = Utf8               broadcastStatusUpdate
  #737 = Methodref          #79.#738      // ext/mods/gameserver/model/actor/template/PetTemplate.getAutoFeedLimit:()D
  #738 = NameAndType        #739:#310     // getAutoFeedLimit:()D
  #739 = Utf8               getAutoFeedLimit
  #740 = Methodref          #79.#741      // ext/mods/gameserver/model/actor/template/PetTemplate.getHungryLimit:()D
  #741 = NameAndType        #742:#310     // getHungryLimit:()D
  #742 = Utf8               getHungryLimit
  #743 = Methodref          #79.#744      // ext/mods/gameserver/model/actor/template/PetTemplate.getUnsummonLimit:()D
  #744 = NameAndType        #745:#310     // getUnsummonLimit:()D
  #745 = Utf8               getUnsummonLimit
  #746 = Utf8               LOAD_PET
  #747 = Utf8               Ljava/lang/String;
  #748 = Utf8               ConstantValue
  #749 = Utf8               STORE_PET
  #750 = Utf8               DELETE_PET
  #751 = Utf8               Signature
  #752 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/Timestamp;>;
  #753 = Utf8               Ljava/util/concurrent/Future<*>;
  #754 = Utf8               Code
  #755 = Utf8               LineNumberTable
  #756 = Utf8               LocalVariableTable
  #757 = Utf8               this
  #758 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #759 = Utf8               objectId
  #760 = Utf8               template
  #761 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #762 = Utf8               owner
  #763 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #764 = Utf8               control
  #765 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #766 = Utf8               StackMapTable
  #767 = Utf8               setStatus
  #768 = Utf8               getControlItemId
  #769 = Utf8               isMountable
  #770 = Utf8               getSummonType
  #771 = Utf8               player
  #772 = Utf8               isCtrlPressed
  #773 = Utf8               isShiftPressed
  #774 = Utf8               getActiveWeaponItem
  #775 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #776 = Utf8               weapon
  #777 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #778 = Utf8               item
  #779 = Utf8               sendMessage
  #780 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #781 = Utf8               itemId
  #782 = Utf8               count
  #783 = Utf8               killer
  #784 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #785 = Utf8               revivePower
  #786 = Utf8               getWeapon
  #787 = Utf8               getArmor
  #788 = Utf8               ps
  #789 = Utf8               Ljava/sql/PreparedStatement;
  #790 = Utf8               con
  #791 = Utf8               Ljava/sql/Connection;
  #792 = Utf8               e
  #793 = Utf8               Ljava/lang/Exception;
  #794 = Utf8               itemInst
  #795 = Utf8               (JI)V
  #796 = Utf8               addToExp
  #797 = Utf8               addToSp
  #798 = Utf8               getSkillLevel
  #799 = Utf8               skillId
  #800 = Utf8               getWeightPenalty
  #801 = Utf8               ()Lext/mods/gameserver/enums/actors/WeightPenalty;
  #802 = Utf8               getSoulShotsPerHit
  #803 = Utf8               getSpiritShotsPerHit
  #804 = Utf8               val
  #805 = Utf8               addTimeStamp
  #806 = Utf8               skill
  #807 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #808 = Utf8               reuse
  #809 = Utf8               getReuseTimeStamps
  #810 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/records/Timestamp;>;
  #811 = Utf8               getReuseTimeStamp
  #812 = Utf8               ()Ljava/util/Map;
  #813 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/Timestamp;>;
  #814 = Utf8               setPetData
  #815 = Utf8               num
  #816 = Utf8               target
  #817 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #818 = Utf8               oldItem
  #819 = Utf8               wasWorn
  #820 = Utf8               newItem
  #821 = Utf8               restore
  #822 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Pet;
  #823 = Utf8               pet
  #824 = Utf8               rs
  #825 = Utf8               Ljava/sql/ResultSet;
  #826 = Utf8               restorePercent
  #827 = Utf8               lvl
  #828 = Utf8               percentLost
  #829 = Utf8               lostExp
  #830 = Utf8               getInventoryLimit
  #831 = Utf8               newWeightPenalty
  #832 = Utf8               weightLimit
  #833 = Utf8               ratio
  #834 = Utf8               checkAutoFeedState
  #835 = Utf8               checkUnsummonState
  #836 = Utf8               sendIU
  #837 = Utf8               ()Lext/mods/gameserver/model/actor/status/SummonStatus;
  #838 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayableStatus;
  #839 = Utf8               ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #840 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #841 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #842 = Utf8               SourceFile
  #843 = Utf8               Pet.java
  #844 = Utf8               NestMembers
  #845 = Utf8               InnerClasses
  #846 = Utf8               FeedTask
{
  public ext.mods.gameserver.model.actor.instance.Pet(int, ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: aload_2
         3: aload_3
         4: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Summon."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)V
         7: aload_0
         8: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        11: dup
        12: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        15: putfield      #12                 // Field _reuseTimeStamps:Ljava/util/Map;
        18: aload_0
        19: new           #18                 // class ext/mods/gameserver/model/itemcontainer/PetInventory
        22: dup
        23: aload_0
        24: invokespecial #20                 // Method ext/mods/gameserver/model/itemcontainer/PetInventory."<init>":(Lext/mods/gameserver/model/actor/instance/Pet;)V
        27: putfield      #23                 // Field _inventory:Lext/mods/gameserver/model/itemcontainer/PetInventory;
        30: aload_0
        31: new           #27                 // class ext/mods/gameserver/network/serverpackets/PetInventoryUpdate
        34: dup
        35: aload_0
        36: invokespecial #29                 // Method ext/mods/gameserver/network/serverpackets/PetInventoryUpdate."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
        39: putfield      #32                 // Field _iu:Lext/mods/gameserver/network/serverpackets/PetInventoryUpdate;
        42: aload_0
        43: getstatic     #36                 // Field ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
        46: putfield      #42                 // Field _weightPenalty:Lext/mods/gameserver/enums/actors/WeightPenalty;
        49: aload_0
        50: lconst_0
        51: putfield      #45                 // Field _expBeforeDeath:J
        54: aload_0
        55: aload         4
        57: invokevirtual #49                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        60: putfield      #55                 // Field _controlItemId:I
        63: aload_0
        64: aload_2
        65: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        68: sipush        12526
        71: if_icmpeq     104
        74: aload_2
        75: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        78: sipush        12527
        81: if_icmpeq     104
        84: aload_2
        85: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        88: sipush        12528
        91: if_icmpeq     104
        94: aload_2
        95: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        98: sipush        12621
       101: if_icmpne     108
       104: iconst_1
       105: goto          109
       108: iconst_0
       109: putfield      #64                 // Field _isMountable:Z
       112: return
      LineNumberTable:
        line 96: 0
        line 77: 7
        line 79: 18
        line 80: 30
        line 86: 42
        line 88: 49
        line 98: 54
        line 99: 63
        line 100: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     113     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0     113     1 objectId   I
            0     113     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0     113     3 owner   Lext/mods/gameserver/model/actor/Player;
            0     113     4 control   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 104
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/actor/instance/Pet ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/instance/Pet ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/actor/instance/Pet, int ]

  public ext.mods.gameserver.model.actor.status.PetStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/PetStatus;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #68                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
         4: checkcast     #72                 // class ext/mods/gameserver/model/actor/status/PetStatus
         7: areturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public void setStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #72                 // class ext/mods/gameserver/model/actor/status/PetStatus
         4: dup
         5: aload_0
         6: invokespecial #74                 // Method ext/mods/gameserver/model/actor/status/PetStatus."<init>":(Lext/mods/gameserver/model/actor/instance/Pet;)V
         9: putfield      #68                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
        12: return
      LineNumberTable:
        line 111: 0
        line 112: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public ext.mods.gameserver.model.actor.template.PetTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/PetTemplate;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #75                 // Method ext/mods/gameserver/model/actor/Summon.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: checkcast     #79                 // class ext/mods/gameserver/model/actor/template/PetTemplate
         7: areturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public ext.mods.gameserver.model.itemcontainer.PetInventory getInventory();
    descriptor: ()Lext/mods/gameserver/model/itemcontainer/PetInventory;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _inventory:Lext/mods/gameserver/model/itemcontainer/PetInventory;
         4: areturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public int getControlItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #55                 // Field _controlItemId:I
         4: ireturn
      LineNumberTable:
        line 129: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public boolean isMountable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #64                 // Field _isMountable:Z
         4: ireturn
      LineNumberTable:
        line 135: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public int getSummonType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_2
         1: ireturn
      LineNumberTable:
        line 141: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public void onAction(ext.mods.gameserver.model.actor.Player, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_1
         1: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         4: aload_0
         5: invokevirtual #84                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         8: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        11: if_icmpne     27
        14: aload_1
        15: aload_0
        16: invokevirtual #84                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        19: if_acmpeq     27
        22: aload_0
        23: aload_1
        24: invokevirtual #88                 // Method setOwner:(Lext/mods/gameserver/model/actor/Player;)V
        27: aload_0
        28: aload_1
        29: iload_2
        30: iload_3
        31: invokespecial #92                 // Method ext/mods/gameserver/model/actor/Summon.onAction:(Lext/mods/gameserver/model/actor/Player;ZZ)V
        34: return
      LineNumberTable:
        line 147: 0
        line 148: 22
        line 150: 27
        line 151: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      35     1 player   Lext/mods/gameserver/model/actor/Player;
            0      35     2 isCtrlPressed   Z
            0      35     3 isShiftPressed   Z
      StackMapTable: number_of_entries = 1
        frame_type = 27 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance getActiveWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _inventory:Lext/mods/gameserver/model/itemcontainer/PetInventory;
         4: getstatic     #96                 // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
         7: invokevirtual #102                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        10: areturn
      LineNumberTable:
        line 156: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public ext.mods.gameserver.model.item.kind.Weapon getActiveWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #106                // Method getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: astore_1
         5: aload_1
         6: ifnonnull     13
         9: aconst_null
        10: goto          20
        13: aload_1
        14: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        17: checkcast     #114                // class ext/mods/gameserver/model/item/kind/Weapon
        20: areturn
      LineNumberTable:
        line 162: 0
        line 163: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            5      16     1 weapon   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/kind/Weapon ]

  public void addItem(ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: invokevirtual #116                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
         4: iconst_1
         5: if_icmpge     9
         8: return
         9: iload_2
        10: ifeq          128
        13: aload_1
        14: invokevirtual #119                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        17: bipush        57
        19: if_icmpne     42
        22: aload_0
        23: getstatic     #122                // Field ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S1_ADENA:Lext/mods/gameserver/network/SystemMessageId;
        26: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        29: aload_1
        30: invokevirtual #116                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        33: invokevirtual #134                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        36: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        39: goto          128
        42: aload_1
        43: invokevirtual #142                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        46: ifle          76
        49: aload_0
        50: getstatic     #145                // Field ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S1_S2:Lext/mods/gameserver/network/SystemMessageId;
        53: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        56: aload_1
        57: invokevirtual #142                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        60: invokevirtual #148                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        63: aload_1
        64: invokevirtual #119                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        67: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        70: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        73: goto          128
        76: aload_1
        77: invokevirtual #116                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        80: iconst_1
        81: if_icmple     111
        84: aload_0
        85: getstatic     #154                // Field ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
        88: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        91: aload_1
        92: invokevirtual #119                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        95: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        98: aload_1
        99: invokevirtual #116                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       102: invokevirtual #134                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       105: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       108: goto          128
       111: aload_0
       112: getstatic     #157                // Field ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S1:Lext/mods/gameserver/network/SystemMessageId;
       115: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       118: aload_1
       119: invokevirtual #119                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       122: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       125: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       128: aload_0
       129: getfield      #23                 // Field _inventory:Lext/mods/gameserver/model/itemcontainer/PetInventory;
       132: aload_1
       133: invokevirtual #160                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       136: pop
       137: return
      LineNumberTable:
        line 169: 0
        line 170: 8
        line 172: 9
        line 174: 13
        line 175: 22
        line 176: 42
        line 177: 49
        line 178: 76
        line 179: 84
        line 181: 111
        line 184: 128
        line 185: 137
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     138     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0     138     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     138     2 sendMessage   Z
      StackMapTable: number_of_entries = 5
        frame_type = 9 /* same */
        frame_type = 32 /* same */
        frame_type = 33 /* same */
        frame_type = 34 /* same */
        frame_type = 16 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance addItem(int, int, boolean);
    descriptor: (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: iload_2
         1: iconst_1
         2: if_icmpge     7
         5: aconst_null
         6: areturn
         7: iload_3
         8: ifeq          74
        11: iload_1
        12: bipush        57
        14: if_icmpne     34
        17: aload_0
        18: getstatic     #122                // Field ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S1_ADENA:Lext/mods/gameserver/network/SystemMessageId;
        21: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        24: iload_2
        25: invokevirtual #134                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        28: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        31: goto          74
        34: iload_2
        35: iconst_1
        36: if_icmple     60
        39: aload_0
        40: getstatic     #154                // Field ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
        43: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        46: iload_1
        47: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        50: iload_2
        51: invokevirtual #134                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        54: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        57: goto          74
        60: aload_0
        61: getstatic     #157                // Field ext/mods/gameserver/network/SystemMessageId.PET_PICKED_S1:Lext/mods/gameserver/network/SystemMessageId;
        64: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        67: iload_1
        68: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        71: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        74: aload_0
        75: getfield      #23                 // Field _inventory:Lext/mods/gameserver/model/itemcontainer/PetInventory;
        78: iload_1
        79: iload_2
        80: invokevirtual #164                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        83: areturn
      LineNumberTable:
        line 190: 0
        line 191: 5
        line 193: 7
        line 195: 11
        line 196: 17
        line 197: 34
        line 198: 39
        line 200: 60
        line 203: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      84     1 itemId   I
            0      84     2 count   I
            0      84     3 sendMessage   Z
      StackMapTable: number_of_entries = 4
        frame_type = 7 /* same */
        frame_type = 26 /* same */
        frame_type = 25 /* same */
        frame_type = 13 /* same */

  public boolean destroyItem(int, int, boolean);
    descriptor: (IIZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_0
         1: getfield      #23                 // Field _inventory:Lext/mods/gameserver/model/itemcontainer/PetInventory;
         4: iload_1
         5: iload_2
         6: invokevirtual #167                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.destroyItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
         9: astore        4
        11: aload         4
        13: ifnonnull     29
        16: iload_3
        17: ifeq          27
        20: aload_0
        21: getstatic     #170                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        24: invokevirtual #173                // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        27: iconst_0
        28: ireturn
        29: iload_3
        30: ifeq          81
        33: iload_2
        34: iconst_1
        35: if_icmple     63
        38: aload_0
        39: getstatic     #176                // Field ext/mods/gameserver/network/SystemMessageId.S2_S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
        42: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        45: aload         4
        47: invokevirtual #119                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        50: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        53: iload_2
        54: invokevirtual #134                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        57: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        60: goto          81
        63: aload_0
        64: getstatic     #179                // Field ext/mods/gameserver/network/SystemMessageId.S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
        67: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        70: aload         4
        72: invokevirtual #119                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        75: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        78: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        81: iconst_1
        82: ireturn
      LineNumberTable:
        line 209: 0
        line 210: 11
        line 212: 16
        line 213: 20
        line 215: 27
        line 218: 29
        line 220: 33
        line 221: 38
        line 223: 63
        line 225: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      83     1 objectId   I
            0      83     2 count   I
            0      83     3 sendMessage   Z
           11      72     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 1 /* same */
        frame_type = 33 /* same */
        frame_type = 17 /* same */

  public boolean destroyItemByItemId(int, int, boolean);
    descriptor: (IIZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_0
         1: getfield      #23                 // Field _inventory:Lext/mods/gameserver/model/itemcontainer/PetInventory;
         4: iload_1
         5: iload_2
         6: invokevirtual #182                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
         9: astore        4
        11: aload         4
        13: ifnonnull     29
        16: iload_3
        17: ifeq          27
        20: aload_0
        21: getstatic     #170                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        24: invokevirtual #173                // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        27: iconst_0
        28: ireturn
        29: iload_3
        30: ifeq          81
        33: iload_2
        34: iconst_1
        35: if_icmple     63
        38: aload_0
        39: getstatic     #176                // Field ext/mods/gameserver/network/SystemMessageId.S2_S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
        42: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        45: aload         4
        47: invokevirtual #119                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        50: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        53: iload_2
        54: invokevirtual #134                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        57: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        60: goto          81
        63: aload_0
        64: getstatic     #179                // Field ext/mods/gameserver/network/SystemMessageId.S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
        67: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        70: aload         4
        72: invokevirtual #119                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        75: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        78: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        81: iconst_1
        82: ireturn
      LineNumberTable:
        line 231: 0
        line 232: 11
        line 234: 16
        line 235: 20
        line 237: 27
        line 240: 29
        line 242: 33
        line 243: 38
        line 245: 63
        line 247: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      83     1 itemId   I
            0      83     2 count   I
            0      83     3 sendMessage   Z
           11      72     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 1 /* same */
        frame_type = 33 /* same */
        frame_type = 17 /* same */

  public void deleteMe(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #185                // Method getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
         4: invokevirtual #189                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.deleteMe:()V
         7: aload_0
         8: aload_1
         9: invokespecial #192                // Method ext/mods/gameserver/model/actor/Summon.deleteMe:(Lext/mods/gameserver/model/actor/Player;)V
        12: aload_0
        13: aload_1
        14: invokevirtual #194                // Method destroyControlItem:(Lext/mods/gameserver/model/actor/Player;)V
        17: return
      LineNumberTable:
        line 253: 0
        line 254: 7
        line 255: 12
        line 256: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      18     1 owner   Lext/mods/gameserver/model/actor/Player;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #197                // Method ext/mods/gameserver/model/actor/Summon.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: invokevirtual #201                // Method stopFeed:()V
        14: aload_0
        15: getstatic     #204                // Field ext/mods/gameserver/network/SystemMessageId.MAKE_SURE_YOU_RESSURECT_YOUR_PET_WITHIN_20_MINUTES:Lext/mods/gameserver/network/SystemMessageId;
        18: invokevirtual #173                // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        21: invokestatic  #207                // Method ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
        24: aload_0
        25: sipush        1200
        28: invokevirtual #213                // Method ext/mods/gameserver/taskmanager/DecayTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;I)V
        31: aload_0
        32: invokevirtual #84                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        35: astore_2
        36: aload_2
        37: ifnull        71
        40: aload_2
        41: invokevirtual #217                // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
        44: ifne          71
        47: aload_0
        48: getstatic     #221                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        51: invokevirtual #227                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        54: ifeq          67
        57: aload_0
        58: getstatic     #231                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
        61: invokevirtual #227                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        64: ifeq          71
        67: aload_0
        68: invokevirtual #234                // Method deathPenalty:()V
        71: iconst_1
        72: ireturn
      LineNumberTable:
        line 261: 0
        line 262: 8
        line 264: 10
        line 266: 14
        line 268: 21
        line 270: 31
        line 271: 36
        line 272: 67
        line 274: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      73     1 killer   Lext/mods/gameserver/model/actor/Creature;
           36      37     2 owner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 3 /* same */

  public void doRevive();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #84                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #237                // Method ext/mods/gameserver/model/actor/Player.removeReviving:()V
         7: aload_0
         8: invokespecial #240                // Method ext/mods/gameserver/model/actor/Summon.doRevive:()V
        11: invokestatic  #207                // Method ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
        14: aload_0
        15: invokevirtual #243                // Method ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
        18: pop
        19: aload_0
        20: invokevirtual #246                // Method startFeed:()V
        23: aload_0
        24: invokevirtual #249                // Method checkHungryState:()Z
        27: ifne          34
        30: aload_0
        31: invokevirtual #252                // Method forceRunStance:()V
        34: aload_0
        35: invokevirtual #255                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
        38: invokevirtual #259                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToIdle:()V
        41: return
      LineNumberTable:
        line 280: 0
        line 282: 7
        line 284: 11
        line 286: 19
        line 288: 23
        line 289: 30
        line 291: 34
        line 292: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
      StackMapTable: number_of_entries = 1
        frame_type = 34 /* same */

  public void doRevive(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: invokevirtual #264                // Method restoreExp:(D)V
         5: aload_0
         6: invokevirtual #268                // Method doRevive:()V
         9: return
      LineNumberTable:
        line 297: 0
        line 298: 5
        line 299: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      10     1 revivePower   D

  public final int getWeapon();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #106                // Method getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: astore_1
         5: aload_1
         6: ifnonnull     13
         9: iconst_0
        10: goto          17
        13: aload_1
        14: invokevirtual #119                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        17: ireturn
      LineNumberTable:
        line 304: 0
        line 305: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            5      13     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public final int getArmor();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #185                // Method getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
         4: getstatic     #269                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
         7: invokevirtual #102                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        10: astore_1
        11: aload_1
        12: ifnonnull     19
        15: iconst_0
        16: goto          23
        19: aload_1
        20: invokevirtual #119                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        23: ireturn
      LineNumberTable:
        line 311: 0
        line 312: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
           11      13     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public void store();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=1
         0: aload_0
         1: getfield      #55                 // Field _controlItemId:I
         4: ifne          8
         7: return
         8: invokestatic  #272                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        11: astore_1
        12: aload_1
        13: ldc_w         #278                // String INSERT INTO pets (name,level,curHp,curMp,exp,sp,fed,item_obj_id) VALUES (?,?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE name=VALUES(name),level=VALUES(level),curHp=VALUES(curHp),curMp=VALUES(curMp),exp=VALUES(exp),sp=VALUES(sp),fed=VALUES(fed)
        16: invokeinterface #280,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        21: astore_2
        22: aload_2
        23: iconst_1
        24: aload_0
        25: invokevirtual #286                // Method getName:()Ljava/lang/String;
        28: invokeinterface #290,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        33: aload_2
        34: iconst_2
        35: aload_0
        36: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        39: invokevirtual #300                // Method ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
        42: invokeinterface #303,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        47: aload_2
        48: iconst_3
        49: aload_0
        50: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        53: invokevirtual #307                // Method ext/mods/gameserver/model/actor/status/PetStatus.getHp:()D
        56: invokeinterface #311,  4          // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
        61: aload_2
        62: iconst_4
        63: aload_0
        64: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        67: invokevirtual #315                // Method ext/mods/gameserver/model/actor/status/PetStatus.getMp:()D
        70: invokeinterface #311,  4          // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
        75: aload_2
        76: iconst_5
        77: aload_0
        78: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        81: invokevirtual #318                // Method ext/mods/gameserver/model/actor/status/PetStatus.getExp:()J
        84: invokeinterface #322,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        89: aload_2
        90: bipush        6
        92: aload_0
        93: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        96: invokevirtual #326                // Method ext/mods/gameserver/model/actor/status/PetStatus.getSp:()I
        99: invokeinterface #303,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       104: aload_2
       105: bipush        7
       107: aload_0
       108: invokevirtual #329                // Method getCurrentFed:()I
       111: invokeinterface #303,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       116: aload_2
       117: bipush        8
       119: aload_0
       120: getfield      #55                 // Field _controlItemId:I
       123: invokeinterface #303,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       128: aload_2
       129: invokeinterface #332,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       134: pop
       135: aload_2
       136: ifnull        172
       139: aload_2
       140: invokeinterface #335,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       145: goto          172
       148: astore_3
       149: aload_2
       150: ifnull        170
       153: aload_2
       154: invokeinterface #335,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       159: goto          170
       162: astore        4
       164: aload_3
       165: aload         4
       167: invokevirtual #340                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       170: aload_3
       171: athrow
       172: aload_1
       173: ifnull        207
       176: aload_1
       177: invokeinterface #344,  1          // InterfaceMethod java/sql/Connection.close:()V
       182: goto          207
       185: astore_2
       186: aload_1
       187: ifnull        205
       190: aload_1
       191: invokeinterface #344,  1          // InterfaceMethod java/sql/Connection.close:()V
       196: goto          205
       199: astore_3
       200: aload_2
       201: aload_3
       202: invokevirtual #340                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       205: aload_2
       206: athrow
       207: goto          235
       210: astore_1
       211: getstatic     #347                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       214: ldc_w         #351                // String Couldn\'t store pet data for {}.
       217: aload_1
       218: iconst_1
       219: anewarray     #353                // class java/lang/Object
       222: dup
       223: iconst_0
       224: aload_0
       225: invokevirtual #355                // Method getObjectId:()I
       228: invokestatic  #356                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       231: aastore
       232: invokevirtual #362                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       235: aload_0
       236: invokevirtual #368                // Method getControlItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
       239: astore_1
       240: aload_1
       241: ifnull        273
       244: aload_1
       245: invokevirtual #142                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       248: aload_0
       249: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       252: invokevirtual #300                // Method ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
       255: if_icmpeq     273
       258: aload_1
       259: aload_0
       260: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       263: invokevirtual #300                // Method ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
       266: aload_0
       267: invokevirtual #84                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
       270: invokevirtual #371                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       273: return
      Exception table:
         from    to  target type
            22   135   148   Class java/lang/Throwable
           153   159   162   Class java/lang/Throwable
            12   172   185   Class java/lang/Throwable
           190   196   199   Class java/lang/Throwable
             8   207   210   Class java/lang/Exception
      LineNumberTable:
        line 318: 0
        line 319: 7
        line 321: 8
        line 322: 12
        line 324: 22
        line 325: 33
        line 326: 47
        line 327: 61
        line 328: 75
        line 329: 89
        line 330: 104
        line 331: 116
        line 332: 128
        line 333: 135
        line 321: 148
        line 333: 172
        line 321: 185
        line 337: 207
        line 334: 210
        line 336: 211
        line 339: 235
        line 340: 240
        line 341: 258
        line 342: 273
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22     150     2    ps   Ljava/sql/PreparedStatement;
           12     195     1   con   Ljava/sql/Connection;
          211      24     1     e   Ljava/lang/Exception;
            0     274     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
          240      34     1 itemInst   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 12
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 139
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 24 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public synchronized void unSummon(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #201                // Method stopFeed:()V
         4: aload_0
         5: invokevirtual #375                // Method isDead:()Z
         8: ifne          25
        11: aload_0
        12: invokevirtual #185                // Method getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
        15: ifnull        25
        18: aload_0
        19: invokevirtual #185                // Method getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
        22: invokevirtual #189                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.deleteMe:()V
        25: aload_0
        26: aload_1
        27: invokespecial #378                // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
        30: aload_0
        31: invokevirtual #375                // Method isDead:()Z
        34: ifne          47
        37: invokestatic  #381                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        40: aload_1
        41: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        44: invokevirtual #386                // Method ext/mods/gameserver/model/World.removePet:(I)V
        47: return
      LineNumberTable:
        line 347: 0
        line 349: 4
        line 350: 18
        line 352: 25
        line 354: 30
        line 355: 37
        line 356: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      48     1 owner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 25 /* same */
        frame_type = 21 /* same */

  public void addExpAndSp(long, int);
    descriptor: (JI)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: aload_0
         1: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
         4: lload_1
         5: l2d
         6: aload_0
         7: invokevirtual #390                // Method getNpcId:()I
        10: sipush        12564
        13: if_icmpne     22
        16: getstatic     #391                // Field ext/mods/Config.SINEATER_XP_RATE:D
        19: goto          25
        22: getstatic     #397                // Field ext/mods/Config.PET_XP_RATE:D
        25: dmul
        26: invokestatic  #400                // Method java/lang/Math.round:(D)J
        29: iload_3
        30: invokevirtual #406                // Method ext/mods/gameserver/model/actor/status/PetStatus.addExpAndSp:(JI)Z
        33: pop
        34: return
      LineNumberTable:
        line 361: 0
        line 362: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      35     1 addToExp   J
            0      35     3 addToSp   I
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet, long, int ]
          stack = [ class ext/mods/gameserver/model/actor/status/PetStatus, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet, long, int ]
          stack = [ class ext/mods/gameserver/model/actor/status/PetStatus, double, double ]

  public int getSkillLevel(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: iload_1
         2: invokevirtual #410                // Method getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
         5: ifnonnull     10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        14: invokevirtual #300                // Method ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
        17: istore_2
        18: iload_2
        19: bipush        70
        21: if_icmpge     34
        24: iconst_1
        25: iload_2
        26: bipush        10
        28: idiv
        29: iadd
        30: istore_2
        31: goto          44
        34: bipush        8
        36: iload_2
        37: bipush        70
        39: isub
        40: iconst_5
        41: idiv
        42: iadd
        43: istore_2
        44: iload_2
        45: i2l
        46: iconst_1
        47: invokestatic  #414                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        50: iload_1
        51: invokevirtual #419                // Method ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
        54: invokestatic  #423                // Method java/lang/Math.clamp:(JII)I
        57: ireturn
      LineNumberTable:
        line 367: 0
        line 368: 8
        line 370: 10
        line 371: 18
        line 372: 24
        line 374: 34
        line 376: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      58     1 skillId   I
           18      40     2 level   I
      StackMapTable: number_of_entries = 3
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 9 /* same */

  public final int getWeightLimit();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
         4: getstatic     #427                // Field ext/mods/gameserver/enums/skills/Stats.WEIGHT_LIMIT:Lext/mods/gameserver/enums/skills/Stats;
         7: ldc2_w        #433                // double 34500.0d
        10: getstatic     #435                // Field ext/mods/gameserver/skills/Formulas.CON_BONUS:[D
        13: aload_0
        14: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        17: invokevirtual #441                // Method ext/mods/gameserver/model/actor/status/PetStatus.getCON:()I
        20: daload
        21: dmul
        22: getstatic     #444                // Field ext/mods/Config.WEIGHT_LIMIT:D
        25: dmul
        26: aload_0
        27: aconst_null
        28: invokevirtual #446                // Method ext/mods/gameserver/model/actor/status/PetStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        31: d2i
        32: ireturn
      LineNumberTable:
        line 385: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public final ext.mods.gameserver.enums.actors.WeightPenalty getWeightPenalty();
    descriptor: ()Lext/mods/gameserver/enums/actors/WeightPenalty;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _weightPenalty:Lext/mods/gameserver/enums/actors/WeightPenalty;
         4: areturn
      LineNumberTable:
        line 390: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public int getSoulShotsPerHit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #450                // Method getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
         4: invokevirtual #454                // Method ext/mods/gameserver/model/records/PetDataEntry.ssCount:()I
         7: ireturn
      LineNumberTable:
        line 396: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public int getSpiritShotsPerHit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #450                // Method getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
         4: invokevirtual #459                // Method ext/mods/gameserver/model/records/PetDataEntry.spsCount:()I
         7: ireturn
      LineNumberTable:
        line 402: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public void updateAndBroadcastStatus(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #462                // Method refreshWeightPenalty:()V
         4: aload_0
         5: iload_1
         6: invokespecial #465                // Method ext/mods/gameserver/model/actor/Summon.updateAndBroadcastStatus:(I)V
         9: return
      LineNumberTable:
        line 408: 0
        line 409: 4
        line 410: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      10     1   val   I

  public void addTimeStamp(ext.mods.gameserver.skills.L2Skill, long);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _reuseTimeStamps:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #468                // Method ext/mods/gameserver/skills/L2Skill.getReuseHashCode:()I
         8: invokestatic  #356                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: new           #473                // class ext/mods/gameserver/model/records/Timestamp
        14: dup
        15: aload_1
        16: lload_2
        17: invokespecial #475                // Method ext/mods/gameserver/model/records/Timestamp."<init>":(Lext/mods/gameserver/skills/L2Skill;J)V
        20: invokeinterface #478,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        25: pop
        26: return
      LineNumberTable:
        line 415: 0
        line 416: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      27     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0      27     2 reuse   J

  public java.util.Collection<ext.mods.gameserver.model.records.Timestamp> getReuseTimeStamps();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _reuseTimeStamps:Ljava/util/Map;
         4: invokeinterface #484,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 420: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
    Signature: #810                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/records/Timestamp;>;

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.model.records.Timestamp> getReuseTimeStamp();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _reuseTimeStamps:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 425: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
    Signature: #813                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/Timestamp;>;

  public ext.mods.gameserver.model.records.PetDataEntry getPetData();
    descriptor: ()Lext/mods/gameserver/model/records/PetDataEntry;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #488                // Field _petData:Lext/mods/gameserver/model/records/PetDataEntry;
         4: areturn
      LineNumberTable:
        line 430: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public void setPetData(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: invokevirtual #492                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
         5: iload_1
         6: invokevirtual #495                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
         9: putfield      #488                // Field _petData:Lext/mods/gameserver/model/records/PetDataEntry;
        12: return
      LineNumberTable:
        line 435: 0
        line 436: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      13     1 level   I

  public ext.mods.gameserver.model.item.instance.ItemInstance getControlItem();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #84                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #499                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
         7: aload_0
         8: getfield      #55                 // Field _controlItemId:I
        11: invokevirtual #502                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        14: areturn
      LineNumberTable:
        line 440: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public int getCurrentFed();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #508                // Field _curFed:I
         4: ireturn
      LineNumberTable:
        line 445: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public void setCurrentFed(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: aload_0
         3: invokevirtual #450                // Method getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
         6: invokevirtual #511                // Method ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
         9: invokestatic  #514                // Method java/lang/Math.min:(II)I
        12: putfield      #508                // Field _curFed:I
        15: return
      LineNumberTable:
        line 450: 0
        line 451: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      16     1   num   I

  public ext.mods.gameserver.model.item.instance.ItemInstance transferItem(int, int, ext.mods.gameserver.model.actor.Playable);
    descriptor: (IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokevirtual #518                // Method checkItemManipulation:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
         6: astore        4
         8: aload         4
        10: ifnonnull     15
        13: aconst_null
        14: areturn
        15: aload         4
        17: invokevirtual #521                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isPetItem:()Z
        20: ifeq          35
        23: aload         4
        25: invokevirtual #524                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
        28: ifeq          35
        31: iconst_1
        32: goto          36
        35: iconst_0
        36: istore        5
        38: aload_0
        39: iload_1
        40: iload_2
        41: aload_3
        42: invokespecial #527                // Method ext/mods/gameserver/model/actor/Summon.transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        45: astore        6
        47: aload         6
        49: ifnonnull     54
        52: aconst_null
        53: areturn
        54: iload         5
        56: ifeq          74
        59: aload_0
        60: getstatic     #531                // Field ext/mods/gameserver/network/SystemMessageId.PET_TOOK_OFF_S1:Lext/mods/gameserver/network/SystemMessageId;
        63: invokestatic  #128                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        66: aload         6
        68: invokevirtual #534                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        71: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        74: aload         6
        76: areturn
      LineNumberTable:
        line 456: 0
        line 457: 8
        line 458: 13
        line 460: 15
        line 462: 38
        line 463: 47
        line 464: 52
        line 466: 54
        line 467: 59
        line 469: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      77     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      77     1 objectId   I
            0      77     2 count   I
            0      77     3 target   Lext/mods/gameserver/model/actor/Playable;
            8      69     4 oldItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           38      39     5 wasWorn   Z
           47      30     6 newItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 19 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance checkItemManipulation(int, int);
    descriptor: (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: invokevirtual #185                // Method getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
         4: iload_1
         5: invokevirtual #537                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         8: astore_3
         9: aload_3
        10: ifnonnull     15
        13: aconst_null
        14: areturn
        15: iload_2
        16: iconst_1
        17: if_icmplt     32
        20: iload_2
        21: iconst_1
        22: if_icmple     34
        25: aload_3
        26: invokevirtual #538                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        29: ifne          34
        32: aconst_null
        33: areturn
        34: iload_2
        35: aload_3
        36: invokevirtual #116                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        39: if_icmple     44
        42: aconst_null
        43: areturn
        44: aload_3
        45: areturn
      LineNumberTable:
        line 475: 0
        line 476: 9
        line 477: 13
        line 479: 15
        line 480: 32
        line 482: 34
        line 483: 42
        line 485: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      46     1 objectId   I
            0      46     2 count   I
            9      37     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 16 /* same */
        frame_type = 1 /* same */
        frame_type = 9 /* same */

  public void destroyControlItem(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=2
         0: invokestatic  #381                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: aload_1
         4: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         7: invokevirtual #386                // Method ext/mods/gameserver/model/World.removePet:(I)V
        10: aload_1
        11: aload_0
        12: getfield      #55                 // Field _controlItemId:I
        15: iconst_1
        16: iconst_0
        17: invokevirtual #541                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
        20: pop
        21: invokestatic  #272                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        24: astore_2
        25: aload_2
        26: ldc_w         #544                // String DELETE FROM pets WHERE item_obj_id=?
        29: invokeinterface #280,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        34: astore_3
        35: aload_3
        36: iconst_1
        37: aload_0
        38: getfield      #55                 // Field _controlItemId:I
        41: invokeinterface #303,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        46: aload_3
        47: invokeinterface #332,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        52: pop
        53: aload_3
        54: ifnull        93
        57: aload_3
        58: invokeinterface #335,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        63: goto          93
        66: astore        4
        68: aload_3
        69: ifnull        90
        72: aload_3
        73: invokeinterface #335,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        78: goto          90
        81: astore        5
        83: aload         4
        85: aload         5
        87: invokevirtual #340                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        90: aload         4
        92: athrow
        93: aload_2
        94: ifnull        130
        97: aload_2
        98: invokeinterface #344,  1          // InterfaceMethod java/sql/Connection.close:()V
       103: goto          130
       106: astore_3
       107: aload_2
       108: ifnull        128
       111: aload_2
       112: invokeinterface #344,  1          // InterfaceMethod java/sql/Connection.close:()V
       117: goto          128
       120: astore        4
       122: aload_3
       123: aload         4
       125: invokevirtual #340                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       128: aload_3
       129: athrow
       130: goto          158
       133: astore_2
       134: getstatic     #347                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       137: ldc_w         #546                // String Couldn\'t delete pet data for {}.
       140: aload_2
       141: iconst_1
       142: anewarray     #353                // class java/lang/Object
       145: dup
       146: iconst_0
       147: aload_0
       148: invokevirtual #355                // Method getObjectId:()I
       151: invokestatic  #356                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       154: aastore
       155: invokevirtual #362                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       158: return
      Exception table:
         from    to  target type
            35    53    66   Class java/lang/Throwable
            72    78    81   Class java/lang/Throwable
            25    93   106   Class java/lang/Throwable
           111   117   120   Class java/lang/Throwable
            21   130   133   Class java/lang/Exception
      LineNumberTable:
        line 494: 0
        line 496: 10
        line 498: 21
        line 499: 25
        line 501: 35
        line 502: 46
        line 503: 53
        line 498: 66
        line 503: 93
        line 498: 106
        line 507: 130
        line 504: 133
        line 506: 134
        line 508: 158
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      58     3    ps   Ljava/sql/PreparedStatement;
           25     105     2   con   Ljava/sql/Connection;
          134      24     2     e   Ljava/lang/Exception;
            0     159     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0     159     1 owner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 24 /* same */

  public static ext.mods.gameserver.model.actor.instance.Pet restore(ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Pet;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=9, args_size=3
         0: aload_1
         1: ldc_w         #548                // String BabyPet
         4: invokevirtual #550                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
         7: ifeq          30
        10: new           #554                // class ext/mods/gameserver/model/actor/instance/BabyPet
        13: dup
        14: invokestatic  #556                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        17: invokevirtual #561                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        20: aload_1
        21: aload_2
        22: aload_0
        23: invokespecial #564                // Method ext/mods/gameserver/model/actor/instance/BabyPet."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        26: astore_3
        27: goto          47
        30: new           #13                 // class ext/mods/gameserver/model/actor/instance/Pet
        33: dup
        34: invokestatic  #556                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        37: invokevirtual #561                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        40: aload_1
        41: aload_2
        42: aload_0
        43: invokespecial #567                // Method "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        46: astore_3
        47: invokestatic  #272                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        50: astore        4
        52: aload         4
        54: ldc_w         #568                // String SELECT name, level, curHp, curMp, exp, sp, fed FROM pets WHERE item_obj_id=?
        57: invokeinterface #280,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        62: astore        5
        64: aload         5
        66: iconst_1
        67: aload_0
        68: invokevirtual #49                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        71: invokeinterface #303,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        76: aload         5
        78: invokeinterface #570,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        83: astore        6
        85: aload         6
        87: invokeinterface #574,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        92: ifeq          233
        95: aload_3
        96: aload         6
        98: ldc_w         #579                // String name
       101: invokeinterface #581,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       106: invokevirtual #585                // Method setName:(Ljava/lang/String;)V
       109: aload_3
       110: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       113: aload         6
       115: ldc_w         #589                // String level
       118: invokeinterface #591,  2          // InterfaceMethod java/sql/ResultSet.getByte:(Ljava/lang/String;)B
       123: invokevirtual #595                // Method ext/mods/gameserver/model/actor/status/PetStatus.setLevel:(I)V
       126: aload_3
       127: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       130: aload         6
       132: ldc_w         #598                // String exp
       135: invokeinterface #600,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       140: invokevirtual #604                // Method ext/mods/gameserver/model/actor/status/PetStatus.setExp:(J)V
       143: aload_3
       144: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       147: aload         6
       149: ldc_w         #608                // String sp
       152: invokeinterface #610,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       157: invokevirtual #614                // Method ext/mods/gameserver/model/actor/status/PetStatus.setSp:(I)V
       160: aload_3
       161: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       164: aload         6
       166: ldc_w         #617                // String curHp
       169: invokeinterface #619,  2          // InterfaceMethod java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
       174: aload         6
       176: ldc_w         #623                // String curMp
       179: invokeinterface #619,  2          // InterfaceMethod java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
       184: invokevirtual #625                // Method ext/mods/gameserver/model/actor/status/PetStatus.setHpMp:(DD)V
       187: aload         6
       189: ldc_w         #617                // String curHp
       192: invokeinterface #619,  2          // InterfaceMethod java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
       197: ldc2_w        #629                // double 0.5d
       200: dcmpg
       201: ifge          216
       204: aload_3
       205: iconst_1
       206: invokevirtual #631                // Method setIsDead:(Z)V
       209: aload_3
       210: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       213: invokevirtual #635                // Method ext/mods/gameserver/model/actor/status/PetStatus.stopHpMpRegeneration:()V
       216: aload_3
       217: aload         6
       219: ldc_w         #638                // String fed
       222: invokeinterface #610,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       227: invokevirtual #640                // Method setCurrentFed:(I)V
       230: goto          304
       233: aload_3
       234: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       237: aload_1
       238: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
       241: sipush        12564
       244: if_icmpne     261
       247: aload_3
       248: invokevirtual #84                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
       251: invokevirtual #643                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       254: invokevirtual #646                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       257: i2b
       258: goto          265
       261: aload_1
       262: invokevirtual #649                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
       265: invokevirtual #595                // Method ext/mods/gameserver/model/actor/status/PetStatus.setLevel:(I)V
       268: aload_3
       269: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       272: aload_3
       273: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       276: invokevirtual #652                // Method ext/mods/gameserver/model/actor/status/PetStatus.getExpForThisLevel:()J
       279: invokevirtual #604                // Method ext/mods/gameserver/model/actor/status/PetStatus.setExp:(J)V
       282: aload_3
       283: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       286: invokevirtual #655                // Method ext/mods/gameserver/model/actor/status/PetStatus.setMaxHpMp:()V
       289: aload_3
       290: aload_3
       291: invokevirtual #450                // Method getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
       294: invokevirtual #511                // Method ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
       297: invokevirtual #640                // Method setCurrentFed:(I)V
       300: aload_3
       301: invokevirtual #658                // Method store:()V
       304: aload         6
       306: ifnull        348
       309: aload         6
       311: invokeinterface #661,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       316: goto          348
       319: astore        7
       321: aload         6
       323: ifnull        345
       326: aload         6
       328: invokeinterface #661,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       333: goto          345
       336: astore        8
       338: aload         7
       340: aload         8
       342: invokevirtual #340                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       345: aload         7
       347: athrow
       348: aload         5
       350: ifnull        392
       353: aload         5
       355: invokeinterface #335,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       360: goto          392
       363: astore        6
       365: aload         5
       367: ifnull        389
       370: aload         5
       372: invokeinterface #335,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       377: goto          389
       380: astore        7
       382: aload         6
       384: aload         7
       386: invokevirtual #340                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       389: aload         6
       391: athrow
       392: aload         4
       394: ifnull        436
       397: aload         4
       399: invokeinterface #344,  1          // InterfaceMethod java/sql/Connection.close:()V
       404: goto          436
       407: astore        5
       409: aload         4
       411: ifnull        433
       414: aload         4
       416: invokeinterface #344,  1          // InterfaceMethod java/sql/Connection.close:()V
       421: goto          433
       424: astore        6
       426: aload         5
       428: aload         6
       430: invokevirtual #340                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       433: aload         5
       435: athrow
       436: goto          465
       439: astore        4
       441: getstatic     #347                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       444: ldc_w         #662                // String Couldn\'t restore pet data for {}.
       447: aload         4
       449: iconst_1
       450: anewarray     #353                // class java/lang/Object
       453: dup
       454: iconst_0
       455: aload_2
       456: invokevirtual #664                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       459: aastore
       460: invokevirtual #362                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       463: aconst_null
       464: areturn
       465: aload_3
       466: areturn
      Exception table:
         from    to  target type
            85   304   319   Class java/lang/Throwable
           326   333   336   Class java/lang/Throwable
            64   348   363   Class java/lang/Throwable
           370   377   380   Class java/lang/Throwable
            52   392   407   Class java/lang/Throwable
           414   421   424   Class java/lang/Throwable
            47   436   439   Class java/lang/Exception
      LineNumberTable:
        line 513: 0
        line 514: 10
        line 516: 30
        line 518: 47
        line 519: 52
        line 521: 64
        line 523: 76
        line 525: 85
        line 527: 95
        line 529: 109
        line 530: 126
        line 531: 143
        line 533: 160
        line 535: 187
        line 537: 204
        line 538: 209
        line 541: 216
        line 545: 233
        line 546: 268
        line 547: 282
        line 548: 289
        line 549: 300
        line 551: 304
        line 523: 319
        line 552: 348
        line 518: 363
        line 552: 392
        line 518: 407
        line 557: 436
        line 553: 439
        line 555: 441
        line 556: 463
        line 558: 465
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27       3     3   pet   Lext/mods/gameserver/model/actor/instance/Pet;
           85     263     6    rs   Ljava/sql/ResultSet;
           64     328     5    ps   Ljava/sql/PreparedStatement;
           52     384     4   con   Ljava/sql/Connection;
          441      24     4     e   Ljava/lang/Exception;
            0     467     0 control   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     467     1 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0     467     2 owner   Lext/mods/gameserver/model/actor/Player;
           47     420     3   pet   Lext/mods/gameserver/model/actor/instance/Pet;
      StackMapTable: number_of_entries = 21
        frame_type = 30 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet ]
        frame_type = 254 /* append */
          offset_delta = 168
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 16 /* same */
        frame_type = 91 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/status/PetStatus ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Pet, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = [ class ext/mods/gameserver/model/actor/status/PetStatus, int ]
        frame_type = 38 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Pet, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Pet, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Pet, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 25 /* same */

  public synchronized void stopFeed();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #665                // Field _feedTask:Ljava/util/concurrent/Future;
         4: ifnull        23
         7: aload_0
         8: getfield      #665                // Field _feedTask:Ljava/util/concurrent/Future;
        11: iconst_0
        12: invokeinterface #669,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #665                // Field _feedTask:Ljava/util/concurrent/Future;
        23: return
      LineNumberTable:
        line 563: 0
        line 565: 7
        line 566: 18
        line 568: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public synchronized void startFeed();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #201                // Method stopFeed:()V
         4: aload_0
         5: invokevirtual #375                // Method isDead:()Z
         8: ifne          43
        11: aload_0
        12: invokevirtual #84                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        15: invokevirtual #674                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        18: aload_0
        19: if_acmpne     43
        22: aload_0
        23: new           #678                // class ext/mods/gameserver/model/actor/instance/Pet$FeedTask
        26: dup
        27: aload_0
        28: invokespecial #680                // Method ext/mods/gameserver/model/actor/instance/Pet$FeedTask."<init>":(Lext/mods/gameserver/model/actor/instance/Pet;)V
        31: ldc2_w        #681                // long 10000l
        34: ldc2_w        #681                // long 10000l
        37: invokestatic  #683                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        40: putfield      #665                // Field _feedTask:Ljava/util/concurrent/Future;
        43: return
      LineNumberTable:
        line 572: 0
        line 574: 4
        line 575: 22
        line 576: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
      StackMapTable: number_of_entries = 1
        frame_type = 43 /* same */

  public void restoreExp(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: getfield      #45                 // Field _expBeforeDeath:J
         4: lconst_0
         5: lcmp
         6: ifle          44
         9: aload_0
        10: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        13: aload_0
        14: getfield      #45                 // Field _expBeforeDeath:J
        17: aload_0
        18: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        21: invokevirtual #318                // Method ext/mods/gameserver/model/actor/status/PetStatus.getExp:()J
        24: lsub
        25: l2d
        26: dload_1
        27: dmul
        28: ldc2_w        #689                // double 100.0d
        31: ddiv
        32: invokestatic  #400                // Method java/lang/Math.round:(D)J
        35: invokevirtual #691                // Method ext/mods/gameserver/model/actor/status/PetStatus.addExp:(J)Z
        38: pop
        39: aload_0
        40: lconst_0
        41: putfield      #45                 // Field _expBeforeDeath:J
        44: return
      LineNumberTable:
        line 584: 0
        line 586: 9
        line 588: 39
        line 590: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            0      45     1 restorePercent   D
      StackMapTable: number_of_entries = 1
        frame_type = 44 /* same */

  public int getCurrentWeight();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _inventory:Lext/mods/gameserver/model/itemcontainer/PetInventory;
         4: invokevirtual #703                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.getTotalWeight:()I
         7: ireturn
      LineNumberTable:
        line 606: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public int getInventoryLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #706                // Field ext/mods/Config.INVENTORY_MAXIMUM_PET:I
         3: ireturn
      LineNumberTable:
        line 611: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public void refreshWeightPenalty();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #709                // Method getWeightLimit:()I
         4: istore_1
         5: iload_1
         6: ifgt          10
         9: return
        10: aload_0
        11: invokevirtual #712                // Method getCurrentWeight:()I
        14: i2d
        15: aload_0
        16: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        19: getstatic     #715                // Field ext/mods/gameserver/enums/skills/Stats.WEIGHT_PENALTY:Lext/mods/gameserver/enums/skills/Stats;
        22: dconst_0
        23: aload_0
        24: aconst_null
        25: invokevirtual #446                // Method ext/mods/gameserver/model/actor/status/PetStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        28: dsub
        29: iload_1
        30: i2d
        31: ddiv
        32: dstore_2
        33: dload_2
        34: ldc2_w        #629                // double 0.5d
        37: dcmpg
        38: ifge          49
        41: getstatic     #36                 // Field ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
        44: astore        4
        46: goto          100
        49: dload_2
        50: ldc2_w        #718                // double 0.666d
        53: dcmpg
        54: ifge          65
        57: getstatic     #720                // Field ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_1:Lext/mods/gameserver/enums/actors/WeightPenalty;
        60: astore        4
        62: goto          100
        65: dload_2
        66: ldc2_w        #723                // double 0.8d
        69: dcmpg
        70: ifge          81
        73: getstatic     #725                // Field ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_2:Lext/mods/gameserver/enums/actors/WeightPenalty;
        76: astore        4
        78: goto          100
        81: dload_2
        82: dconst_1
        83: dcmpg
        84: ifge          95
        87: getstatic     #728                // Field ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_3:Lext/mods/gameserver/enums/actors/WeightPenalty;
        90: astore        4
        92: goto          100
        95: getstatic     #731                // Field ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_4:Lext/mods/gameserver/enums/actors/WeightPenalty;
        98: astore        4
       100: aload_0
       101: getfield      #42                 // Field _weightPenalty:Lext/mods/gameserver/enums/actors/WeightPenalty;
       104: aload         4
       106: if_acmpeq     122
       109: aload_0
       110: aload         4
       112: putfield      #42                 // Field _weightPenalty:Lext/mods/gameserver/enums/actors/WeightPenalty;
       115: aload_0
       116: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       119: invokevirtual #734                // Method ext/mods/gameserver/model/actor/status/PetStatus.broadcastStatusUpdate:()V
       122: return
      LineNumberTable:
        line 616: 0
        line 617: 5
        line 618: 9
        line 620: 10
        line 623: 33
        line 624: 41
        line 625: 49
        line 626: 57
        line 627: 65
        line 628: 73
        line 629: 81
        line 630: 87
        line 632: 95
        line 634: 100
        line 636: 109
        line 638: 115
        line 640: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46       3     4 newWeightPenalty   Lext/mods/gameserver/enums/actors/WeightPenalty;
           62       3     4 newWeightPenalty   Lext/mods/gameserver/enums/actors/WeightPenalty;
           78       3     4 newWeightPenalty   Lext/mods/gameserver/enums/actors/WeightPenalty;
           92       3     4 newWeightPenalty   Lext/mods/gameserver/enums/actors/WeightPenalty;
            0     123     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
            5     118     1 weightLimit   I
           33      90     2 ratio   D
          100      23     4 newWeightPenalty   Lext/mods/gameserver/enums/actors/WeightPenalty;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ double ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/enums/actors/WeightPenalty ]
        frame_type = 21 /* same */

  public boolean checkAutoFeedState();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #329                // Method getCurrentFed:()I
         4: i2d
         5: aload_0
         6: getfield      #488                // Field _petData:Lext/mods/gameserver/model/records/PetDataEntry;
         9: invokevirtual #511                // Method ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
        12: i2d
        13: aload_0
        14: invokevirtual #492                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        17: invokevirtual #737                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getAutoFeedLimit:()D
        20: dmul
        21: dcmpg
        22: ifge          29
        25: iconst_1
        26: goto          30
        29: iconst_0
        30: ireturn
      LineNumberTable:
        line 647: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
      StackMapTable: number_of_entries = 2
        frame_type = 29 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean checkHungryState();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #329                // Method getCurrentFed:()I
         4: i2d
         5: aload_0
         6: getfield      #488                // Field _petData:Lext/mods/gameserver/model/records/PetDataEntry;
         9: invokevirtual #511                // Method ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
        12: i2d
        13: aload_0
        14: invokevirtual #492                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        17: invokevirtual #740                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getHungryLimit:()D
        20: dmul
        21: dcmpg
        22: ifge          29
        25: iconst_1
        26: goto          30
        29: iconst_0
        30: ireturn
      LineNumberTable:
        line 655: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
      StackMapTable: number_of_entries = 2
        frame_type = 29 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean checkUnsummonState();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #329                // Method getCurrentFed:()I
         4: i2d
         5: aload_0
         6: getfield      #488                // Field _petData:Lext/mods/gameserver/model/records/PetDataEntry;
         9: invokevirtual #511                // Method ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
        12: i2d
        13: aload_0
        14: invokevirtual #492                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        17: invokevirtual #743                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getUnsummonLimit:()D
        20: dmul
        21: dcmpg
        22: ifge          29
        25: iconst_1
        26: goto          30
        29: iconst_0
        30: ireturn
      LineNumberTable:
        line 663: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
      StackMapTable: number_of_entries = 2
        frame_type = 29 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void sendIU();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #32                 // Field _iu:Lext/mods/gameserver/network/serverpackets/PetInventoryUpdate;
         5: invokevirtual #138                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         8: return
      LineNumberTable:
        line 740: 0
        line 741: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public ext.mods.gameserver.model.actor.template.NpcTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #492                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
         4: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public ext.mods.gameserver.model.actor.status.SummonStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/SummonStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
         4: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public ext.mods.gameserver.model.actor.status.PlayableStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/PlayableStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
         4: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public ext.mods.gameserver.model.actor.template.CreatureTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #492                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
         4: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public ext.mods.gameserver.model.actor.status.CreatureStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #296                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
         4: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;

  public ext.mods.gameserver.model.itemcontainer.Inventory getInventory();
    descriptor: ()Lext/mods/gameserver/model/itemcontainer/Inventory;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #185                // Method getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
         4: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Pet;
}
SourceFile: "Pet.java"
NestMembers:
  ext/mods/gameserver/model/actor/instance/Pet$FeedTask
InnerClasses:
  protected #846= #678 of #13;            // FeedTask=class ext/mods/gameserver/model/actor/instance/Pet$FeedTask of class ext/mods/gameserver/model/actor/instance/Pet
