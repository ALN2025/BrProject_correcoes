// Bytecode for: ext.mods.gameserver.network.clientpackets.MultiSellChoose
// File: ext\mods\gameserver\network\clientpackets\MultiSellChoose.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/MultiSellChoose.class
  Last modified 9 de jul de 2026; size 9240 bytes
  MD5 checksum e2dd99232a88e39f312a59bbd46efea5
  Compiled from "MultiSellChoose.java"
public class ext.mods.gameserver.network.clientpackets.MultiSellChoose extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/MultiSellChoose
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 5, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/MultiSellChoose.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/MultiSellChoose
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/MultiSellChoose
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/MultiSellChoose._listId:I
   #14 = NameAndType        #15:#16       // _listId:I
   #15 = Utf8               _listId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/MultiSellChoose._entryId:I
   #18 = NameAndType        #19:#16       // _entryId:I
   #19 = Utf8               _entryId
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/network/clientpackets/MultiSellChoose._amount:I
   #21 = NameAndType        #22:#16       // _amount:I
   #22 = Utf8               _amount
   #23 = Methodref          #8.#24        // ext/mods/gameserver/network/clientpackets/MultiSellChoose.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #24 = NameAndType        #25:#26       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #25 = Utf8               getClient
   #26 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #27 = Class              #28           // ext/mods/gameserver/network/GameClient
   #28 = Utf8               ext/mods/gameserver/network/GameClient
   #29 = Methodref          #27.#30       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #30 = NameAndType        #31:#32       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #31 = Utf8               getPlayer
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #33 = Fieldref           #34.#35       // ext/mods/gameserver/enums/FloodProtector.MULTISELL:Lext/mods/gameserver/enums/FloodProtector;
   #34 = Class              #36           // ext/mods/gameserver/enums/FloodProtector
   #35 = NameAndType        #37:#38       // MULTISELL:Lext/mods/gameserver/enums/FloodProtector;
   #36 = Utf8               ext/mods/gameserver/enums/FloodProtector
   #37 = Utf8               MULTISELL
   #38 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
   #39 = Methodref          #27.#40       // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #40 = NameAndType        #41:#42       // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #41 = Utf8               performAction
   #42 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
   #44 = Class              #46           // ext/mods/gameserver/model/actor/Player
   #45 = NameAndType        #47:#48       // setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
   #46 = Utf8               ext/mods/gameserver/model/actor/Player
   #47 = Utf8               setMultiSell
   #48 = Utf8               (Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
   #49 = Fieldref           #50.#51       // ext/mods/Config.MULTISELL_MAX_AMOUNT:I
   #50 = Class              #52           // ext/mods/Config
   #51 = NameAndType        #53:#16       // MULTISELL_MAX_AMOUNT:I
   #52 = Utf8               ext/mods/Config
   #53 = Utf8               MULTISELL_MAX_AMOUNT
   #54 = Methodref          #44.#55       // ext/mods/gameserver/model/actor/Player.getMultiSell:()Lext/mods/gameserver/model/multisell/PreparedListContainer;
   #55 = NameAndType        #56:#57       // getMultiSell:()Lext/mods/gameserver/model/multisell/PreparedListContainer;
   #56 = Utf8               getMultiSell
   #57 = Utf8               ()Lext/mods/gameserver/model/multisell/PreparedListContainer;
   #58 = Methodref          #59.#60       // ext/mods/gameserver/model/multisell/PreparedListContainer.getId:()I
   #59 = Class              #61           // ext/mods/gameserver/model/multisell/PreparedListContainer
   #60 = NameAndType        #62:#12       // getId:()I
   #61 = Utf8               ext/mods/gameserver/model/multisell/PreparedListContainer
   #62 = Utf8               getId
   #63 = Methodref          #59.#64       // ext/mods/gameserver/model/multisell/PreparedListContainer.getEntries:()Ljava/util/List;
   #64 = NameAndType        #65:#66       // getEntries:()Ljava/util/List;
   #65 = Utf8               getEntries
   #66 = Utf8               ()Ljava/util/List;
   #67 = InterfaceMethodref #68.#69       // java/util/List.size:()I
   #68 = Class              #70           // java/util/List
   #69 = NameAndType        #71:#12       // size:()I
   #70 = Utf8               java/util/List
   #71 = Utf8               size
   #72 = Methodref          #44.#73       // ext/mods/gameserver/model/actor/Player.getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
   #73 = NameAndType        #74:#75       // getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
   #74 = Utf8               getCurrentFolk
   #75 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Folk;
   #76 = Methodref          #77.#78       // ext/mods/gameserver/model/actor/instance/Folk.getNpcId:()I
   #77 = Class              #79           // ext/mods/gameserver/model/actor/instance/Folk
   #78 = NameAndType        #80:#12       // getNpcId:()I
   #79 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #80 = Utf8               getNpcId
   #81 = Methodref          #59.#82       // ext/mods/gameserver/model/multisell/PreparedListContainer.isNpcAllowed:(I)Z
   #82 = NameAndType        #83:#84       // isNpcAllowed:(I)Z
   #83 = Utf8               isNpcAllowed
   #84 = Utf8               (I)Z
   #85 = Methodref          #59.#86       // ext/mods/gameserver/model/multisell/PreparedListContainer.isNpcOnly:()Z
   #86 = NameAndType        #87:#88       // isNpcOnly:()Z
   #87 = Utf8               isNpcOnly
   #88 = Utf8               ()Z
   #89 = Methodref          #44.#90       // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #90 = NameAndType        #91:#92       // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #91 = Utf8               getAI
   #92 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #93 = Methodref          #94.#95       // ext/mods/gameserver/model/actor/ai/type/PlayerAI.canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #94 = Class              #96           // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #95 = NameAndType        #97:#98       // canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #96 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #97 = Utf8               canDoInteract
   #98 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #99 = Methodref          #44.#100      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #100 = NameAndType        #101:#102     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #101 = Utf8               getInventory
  #102 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #103 = InterfaceMethodref #68.#104      // java/util/List.get:(I)Ljava/lang/Object;
  #104 = NameAndType        #105:#106     // get:(I)Ljava/lang/Object;
  #105 = Utf8               get
  #106 = Utf8               (I)Ljava/lang/Object;
  #107 = Class              #108          // ext/mods/gameserver/model/multisell/Entry
  #108 = Utf8               ext/mods/gameserver/model/multisell/Entry
  #109 = Methodref          #107.#110     // ext/mods/gameserver/model/multisell/Entry.isStackable:()Z
  #110 = NameAndType        #111:#88      // isStackable:()Z
  #111 = Utf8               isStackable
  #112 = Methodref          #107.#113     // ext/mods/gameserver/model/multisell/Entry.getProducts:()Ljava/util/List;
  #113 = NameAndType        #114:#66      // getProducts:()Ljava/util/List;
  #114 = Utf8               getProducts
  #115 = InterfaceMethodref #68.#116      // java/util/List.iterator:()Ljava/util/Iterator;
  #116 = NameAndType        #117:#118     // iterator:()Ljava/util/Iterator;
  #117 = Utf8               iterator
  #118 = Utf8               ()Ljava/util/Iterator;
  #119 = InterfaceMethodref #120.#121     // java/util/Iterator.hasNext:()Z
  #120 = Class              #122          // java/util/Iterator
  #121 = NameAndType        #123:#88      // hasNext:()Z
  #122 = Utf8               java/util/Iterator
  #123 = Utf8               hasNext
  #124 = InterfaceMethodref #120.#125     // java/util/Iterator.next:()Ljava/lang/Object;
  #125 = NameAndType        #126:#127     // next:()Ljava/lang/Object;
  #126 = Utf8               next
  #127 = Utf8               ()Ljava/lang/Object;
  #128 = Class              #129          // ext/mods/gameserver/model/multisell/Ingredient
  #129 = Utf8               ext/mods/gameserver/model/multisell/Ingredient
  #130 = Methodref          #128.#131     // ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
  #131 = NameAndType        #132:#12      // getItemId:()I
  #132 = Utf8               getItemId
  #133 = Methodref          #128.#110     // ext/mods/gameserver/model/multisell/Ingredient.isStackable:()Z
  #134 = Methodref          #128.#135     // ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
  #135 = NameAndType        #136:#12      // getItemCount:()I
  #136 = Utf8               getItemCount
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #138 = Class              #140          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #139 = NameAndType        #141:#142     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #140 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #141 = Utf8               getItemByItemId
  #142 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #143 = Methodref          #128.#144     // ext/mods/gameserver/model/multisell/Ingredient.getWeight:()I
  #144 = NameAndType        #145:#12      // getWeight:()I
  #145 = Utf8               getWeight
  #146 = Methodref          #138.#147     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateWeight:(I)Z
  #147 = NameAndType        #148:#84      // validateWeight:(I)Z
  #148 = Utf8               validateWeight
  #149 = Fieldref           #150.#151     // ext/mods/gameserver/network/SystemMessageId.WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
  #150 = Class              #152          // ext/mods/gameserver/network/SystemMessageId
  #151 = NameAndType        #153:#154     // WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
  #152 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #153 = Utf8               WEIGHT_LIMIT_EXCEEDED
  #154 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #155 = Methodref          #44.#156      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #156 = NameAndType        #157:#158     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #157 = Utf8               sendPacket
  #158 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #159 = Methodref          #138.#160     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
  #160 = NameAndType        #161:#84      // validateCapacity:(I)Z
  #161 = Utf8               validateCapacity
  #162 = Fieldref           #150.#163     // ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #163 = NameAndType        #164:#154     // SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #164 = Utf8               SLOTS_FULL
  #165 = Class              #166          // java/util/ArrayList
  #166 = Utf8               java/util/ArrayList
  #167 = Methodref          #107.#168     // ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
  #168 = NameAndType        #169:#66      // getIngredients:()Ljava/util/List;
  #169 = Utf8               getIngredients
  #170 = Methodref          #165.#171     // java/util/ArrayList."<init>":(I)V
  #171 = NameAndType        #5:#172       // "<init>":(I)V
  #172 = Utf8               (I)V
  #173 = Methodref          #128.#174     // ext/mods/gameserver/model/multisell/Ingredient.getEnchantLevel:()I
  #174 = NameAndType        #175:#12      // getEnchantLevel:()I
  #175 = Utf8               getEnchantLevel
  #176 = Class              #177          // java/lang/Integer
  #177 = Utf8               java/lang/Integer
  #178 = Integer            2147483647
  #179 = Fieldref           #150.#180     // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_EXCEEDED_QUANTITY_THAT_CAN_BE_INPUTTED:Lext/mods/gameserver/network/SystemMessageId;
  #180 = NameAndType        #181:#154     // YOU_HAVE_EXCEEDED_QUANTITY_THAT_CAN_BE_INPUTTED:Lext/mods/gameserver/network/SystemMessageId;
  #181 = Utf8               YOU_HAVE_EXCEEDED_QUANTITY_THAT_CAN_BE_INPUTTED
  #182 = Methodref          #128.#183     // ext/mods/gameserver/model/multisell/Ingredient.getCopy:()Lext/mods/gameserver/model/multisell/Ingredient;
  #183 = NameAndType        #184:#185     // getCopy:()Lext/mods/gameserver/model/multisell/Ingredient;
  #184 = Utf8               getCopy
  #185 = Utf8               ()Lext/mods/gameserver/model/multisell/Ingredient;
  #186 = Methodref          #128.#187     // ext/mods/gameserver/model/multisell/Ingredient.setItemCount:(I)V
  #187 = NameAndType        #188:#172     // setItemCount:(I)V
  #188 = Utf8               setItemCount
  #189 = InterfaceMethodref #68.#190      // java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
  #190 = NameAndType        #191:#192     // set:(ILjava/lang/Object;)Ljava/lang/Object;
  #191 = Utf8               set
  #192 = Utf8               (ILjava/lang/Object;)Ljava/lang/Object;
  #193 = InterfaceMethodref #68.#194      // java/util/List.add:(Ljava/lang/Object;)Z
  #194 = NameAndType        #195:#196     // add:(Ljava/lang/Object;)Z
  #195 = Utf8               add
  #196 = Utf8               (Ljava/lang/Object;)Z
  #197 = Integer            65336
  #198 = Methodref          #44.#199      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #199 = NameAndType        #200:#201     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #200 = Utf8               getClan
  #201 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #202 = Fieldref           #150.#203     // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_A_CLAN_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
  #203 = NameAndType        #204:#154     // YOU_ARE_NOT_A_CLAN_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
  #204 = Utf8               YOU_ARE_NOT_A_CLAN_MEMBER
  #205 = Methodref          #44.#206      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #206 = NameAndType        #207:#88      // isClanLeader:()Z
  #207 = Utf8               isClanLeader
  #208 = Fieldref           #150.#209     // ext/mods/gameserver/network/SystemMessageId.ONLY_THE_CLAN_LEADER_IS_ENABLED:Lext/mods/gameserver/network/SystemMessageId;
  #209 = NameAndType        #210:#154     // ONLY_THE_CLAN_LEADER_IS_ENABLED:Lext/mods/gameserver/network/SystemMessageId;
  #210 = Utf8               ONLY_THE_CLAN_LEADER_IS_ENABLED
  #211 = Methodref          #212.#213     // ext/mods/gameserver/model/pledge/Clan.getReputationScore:()I
  #212 = Class              #214          // ext/mods/gameserver/model/pledge/Clan
  #213 = NameAndType        #215:#12      // getReputationScore:()I
  #214 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #215 = Utf8               getReputationScore
  #216 = Fieldref           #150.#217     // ext/mods/gameserver/network/SystemMessageId.THE_CLAN_REPUTATION_SCORE_IS_TOO_LOW:Lext/mods/gameserver/network/SystemMessageId;
  #217 = NameAndType        #218:#154     // THE_CLAN_REPUTATION_SCORE_IS_TOO_LOW:Lext/mods/gameserver/network/SystemMessageId;
  #218 = Utf8               THE_CLAN_REPUTATION_SCORE_IS_TOO_LOW
  #219 = Integer            65436
  #220 = Methodref          #44.#221      // ext/mods/gameserver/model/actor/Player.getPcCafePoints:()I
  #221 = NameAndType        #222:#12      // getPcCafePoints:()I
  #222 = Utf8               getPcCafePoints
  #223 = Fieldref           #150.#224     // ext/mods/gameserver/network/SystemMessageId.SHORT_OF_ACCUMULATED_POINTS:Lext/mods/gameserver/network/SystemMessageId;
  #224 = NameAndType        #225:#154     // SHORT_OF_ACCUMULATED_POINTS:Lext/mods/gameserver/network/SystemMessageId;
  #225 = Utf8               SHORT_OF_ACCUMULATED_POINTS
  #226 = Methodref          #227.#228     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #227 = Class              #229          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #228 = NameAndType        #230:#231     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #229 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #230 = Utf8               getSystemMessage
  #231 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #232 = Methodref          #44.#233      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #233 = NameAndType        #157:#234     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #234 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #235 = Methodref          #59.#236      // ext/mods/gameserver/model/multisell/PreparedListContainer.getMaintainEnchantment:()Z
  #236 = NameAndType        #237:#88      // getMaintainEnchantment:()Z
  #237 = Utf8               getMaintainEnchantment
  #238 = Methodref          #138.#239     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(IIZ)I
  #239 = NameAndType        #136:#240     // getItemCount:(IIZ)I
  #240 = Utf8               (IIZ)I
  #241 = Methodref          #128.#242     // ext/mods/gameserver/model/multisell/Ingredient.getMaintainIngredient:()Z
  #242 = NameAndType        #243:#88      // getMaintainIngredient:()Z
  #243 = Utf8               getMaintainIngredient
  #244 = Fieldref           #150.#245     // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #245 = NameAndType        #246:#154     // NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #246 = Utf8               NOT_ENOUGH_ITEMS
  #247 = Methodref          #165.#3       // java/util/ArrayList."<init>":()V
  #248 = Methodref          #212.#249     // ext/mods/gameserver/model/pledge/Clan.takeReputationScore:(I)Z
  #249 = NameAndType        #250:#84      // takeReputationScore:(I)Z
  #250 = Utf8               takeReputationScore
  #251 = Fieldref           #150.#252     // ext/mods/gameserver/network/SystemMessageId.S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
  #252 = NameAndType        #253:#154     // S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
  #253 = Utf8               S1_DEDUCTED_FROM_CLAN_REP
  #254 = Methodref          #227.#255     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #255 = NameAndType        #256:#257     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #256 = Utf8               addNumber
  #257 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #258 = Methodref          #44.#259      // ext/mods/gameserver/model/actor/Player.decreasePcCafePoints:(I)V
  #259 = NameAndType        #260:#172     // decreasePcCafePoints:(I)V
  #260 = Utf8               decreasePcCafePoints
  #261 = Methodref          #262.#110     // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
  #262 = Class              #263          // ext/mods/gameserver/model/item/instance/ItemInstance
  #263 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #264 = Methodref          #262.#265     // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #265 = NameAndType        #266:#12      // getObjectId:()I
  #266 = Utf8               getObjectId
  #267 = Methodref          #44.#268      // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
  #268 = NameAndType        #269:#270     // destroyItem:(IIZ)Z
  #269 = Utf8               destroyItem
  #270 = Utf8               (IIZ)Z
  #271 = Methodref          #138.#272     // ext/mods/gameserver/model/itemcontainer/PcInventory.getAllItemsByItemId:(IIZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #272 = NameAndType        #273:#274     // getAllItemsByItemId:(IIZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #273 = Utf8               getAllItemsByItemId
  #274 = Utf8               (IIZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #275 = Methodref          #262.#276     // ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
  #276 = NameAndType        #277:#88      // isAugmented:()Z
  #277 = Utf8               isAugmented
  #278 = Methodref          #262.#279     // ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
  #279 = NameAndType        #280:#281     // getAugmentation:()Lext/mods/gameserver/model/Augmentation;
  #280 = Utf8               getAugmentation
  #281 = Utf8               ()Lext/mods/gameserver/model/Augmentation;
  #282 = Methodref          #138.#283     // ext/mods/gameserver/model/itemcontainer/PcInventory.getAllItemsByItemId:(IZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #283 = NameAndType        #273:#284     // getAllItemsByItemId:(IZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #284 = Utf8               (IZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #285 = Methodref          #262.#174     // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #286 = Methodref          #212.#287     // ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
  #287 = NameAndType        #288:#84      // addReputationScore:(I)Z
  #288 = Utf8               addReputationScore
  #289 = Methodref          #138.#290     // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #290 = NameAndType        #291:#292     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #291 = Utf8               addItem
  #292 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #293 = Class              #294          // ext/mods/gameserver/model/Augmentation
  #294 = Utf8               ext/mods/gameserver/model/Augmentation
  #295 = Methodref          #293.#60      // ext/mods/gameserver/model/Augmentation.getId:()I
  #296 = Methodref          #293.#297     // ext/mods/gameserver/model/Augmentation.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #297 = NameAndType        #298:#299     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #298 = Utf8               getSkill
  #299 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #300 = Methodref          #293.#301     // ext/mods/gameserver/model/Augmentation."<init>":(ILext/mods/gameserver/skills/L2Skill;)V
  #301 = NameAndType        #5:#302       // "<init>":(ILext/mods/gameserver/skills/L2Skill;)V
  #302 = Utf8               (ILext/mods/gameserver/skills/L2Skill;)V
  #303 = Methodref          #262.#304     // ext/mods/gameserver/model/item/instance/ItemInstance.setAugmentation:(Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
  #304 = NameAndType        #305:#306     // setAugmentation:(Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
  #305 = Utf8               setAugmentation
  #306 = Utf8               (Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
  #307 = Methodref          #262.#308     // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #308 = NameAndType        #309:#310     // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #309 = Utf8               setEnchantLevel
  #310 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #311 = Fieldref           #150.#312     // ext/mods/gameserver/network/SystemMessageId.EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #312 = NameAndType        #313:#154     // EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #313 = Utf8               EARNED_S2_S1_S
  #314 = Methodref          #227.#315     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #315 = NameAndType        #316:#257     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #316 = Utf8               addItemName
  #317 = Fieldref           #150.#318     // ext/mods/gameserver/network/SystemMessageId.ACQUIRED_S1_S2:Lext/mods/gameserver/network/SystemMessageId;
  #318 = NameAndType        #319:#154     // ACQUIRED_S1_S2:Lext/mods/gameserver/network/SystemMessageId;
  #319 = Utf8               ACQUIRED_S1_S2
  #320 = Fieldref           #150.#321     // ext/mods/gameserver/network/SystemMessageId.EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #321 = NameAndType        #322:#154     // EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #322 = Utf8               EARNED_ITEM_S1
  #323 = Fieldref           #150.#324     // ext/mods/gameserver/network/SystemMessageId.SUCCESSFULLY_TRADED_WITH_NPC:Lext/mods/gameserver/network/SystemMessageId;
  #324 = NameAndType        #325:#154     // SUCCESSFULLY_TRADED_WITH_NPC:Lext/mods/gameserver/network/SystemMessageId;
  #325 = Utf8               SUCCESSFULLY_TRADED_WITH_NPC
  #326 = Methodref          #107.#327     // ext/mods/gameserver/model/multisell/Entry.getTaxAmount:()I
  #327 = NameAndType        #328:#12      // getTaxAmount:()I
  #328 = Utf8               getTaxAmount
  #329 = Methodref          #77.#330      // ext/mods/gameserver/model/actor/instance/Folk.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #330 = NameAndType        #331:#332     // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #331 = Utf8               getCastle
  #332 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #333 = Methodref          #334.#335     // ext/mods/gameserver/model/residence/castle/Castle.riseTaxRevenue:(J)V
  #334 = Class              #336          // ext/mods/gameserver/model/residence/castle/Castle
  #335 = NameAndType        #337:#338     // riseTaxRevenue:(J)V
  #336 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #337 = Utf8               riseTaxRevenue
  #338 = Utf8               (J)V
  #339 = Utf8               CLAN_REPUTATION
  #340 = Utf8               ConstantValue
  #341 = Utf8               PC_BANG_POINTS
  #342 = Utf8               Code
  #343 = Utf8               LineNumberTable
  #344 = Utf8               LocalVariableTable
  #345 = Utf8               this
  #346 = Utf8               Lext/mods/gameserver/network/clientpackets/MultiSellChoose;
  #347 = Utf8               readImpl
  #348 = Utf8               runImpl
  #349 = Utf8               e
  #350 = Utf8               Lext/mods/gameserver/model/multisell/Ingredient;
  #351 = Utf8               ing
  #352 = Utf8               ex
  #353 = Utf8               i
  #354 = Utf8               newIng
  #355 = Utf8               Z
  #356 = Utf8               amount
  #357 = Utf8               inventoryContents
  #358 = Utf8               [Lext/mods/gameserver/model/item/instance/ItemInstance;
  #359 = Utf8               item
  #360 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #361 = Utf8               itemToTake
  #362 = Utf8               product
  #363 = Utf8               sm
  #364 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #365 = Utf8               player
  #366 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #367 = Utf8               list
  #368 = Utf8               Lext/mods/gameserver/model/multisell/PreparedListContainer;
  #369 = Utf8               folk
  #370 = Utf8               Lext/mods/gameserver/model/actor/instance/Folk;
  #371 = Utf8               inv
  #372 = Utf8               Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #373 = Utf8               entry
  #374 = Utf8               Lext/mods/gameserver/model/multisell/Entry;
  #375 = Utf8               slots
  #376 = Utf8               weight
  #377 = Utf8               ingredientsList
  #378 = Utf8               Ljava/util/List;
  #379 = Utf8               augmentation
  #380 = Utf8               LocalVariableTypeTable
  #381 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;
  #382 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/Augmentation;>;
  #383 = Utf8               StackMapTable
  #384 = Class              #358          // "[Lext/mods/gameserver/model/item/instance/ItemInstance;"
  #385 = Utf8               SourceFile
  #386 = Utf8               MultiSellChoose.java
{
  public ext.mods.gameserver.network.clientpackets.MultiSellChoose();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/MultiSellChoose;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _listId:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _entryId:I
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readD:()I
        21: putfield      #20                 // Field _amount:I
        24: return
      LineNumberTable:
        line 48: 0
        line 49: 8
        line 50: 16
        line 51: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/network/clientpackets/MultiSellChoose;

  public void runImpl();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=20, args_size=1
         0: aload_0
         1: invokevirtual #23                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #27                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #29                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_0
        17: invokevirtual #23                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        20: checkcast     #27                 // class ext/mods/gameserver/network/GameClient
        23: getstatic     #33                 // Field ext/mods/gameserver/enums/FloodProtector.MULTISELL:Lext/mods/gameserver/enums/FloodProtector;
        26: invokevirtual #39                 // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
        29: ifne          38
        32: aload_1
        33: aconst_null
        34: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
        37: return
        38: aload_0
        39: getfield      #20                 // Field _amount:I
        42: iconst_1
        43: if_icmplt     56
        46: aload_0
        47: getfield      #20                 // Field _amount:I
        50: getstatic     #49                 // Field ext/mods/Config.MULTISELL_MAX_AMOUNT:I
        53: if_icmple     62
        56: aload_1
        57: aconst_null
        58: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
        61: return
        62: aload_1
        63: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getMultiSell:()Lext/mods/gameserver/model/multisell/PreparedListContainer;
        66: astore_2
        67: aload_2
        68: ifnull        82
        71: aload_2
        72: invokevirtual #58                 // Method ext/mods/gameserver/model/multisell/PreparedListContainer.getId:()I
        75: aload_0
        76: getfield      #13                 // Field _listId:I
        79: if_icmpeq     88
        82: aload_1
        83: aconst_null
        84: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
        87: return
        88: aload_0
        89: getfield      #17                 // Field _entryId:I
        92: iconst_1
        93: if_icmplt     112
        96: aload_0
        97: getfield      #17                 // Field _entryId:I
       100: aload_2
       101: invokevirtual #63                 // Method ext/mods/gameserver/model/multisell/PreparedListContainer.getEntries:()Ljava/util/List;
       104: invokeinterface #67,  1           // InterfaceMethod java/util/List.size:()I
       109: if_icmple     118
       112: aload_1
       113: aconst_null
       114: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
       117: return
       118: aload_1
       119: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
       122: astore_3
       123: aload_3
       124: ifnull        138
       127: aload_2
       128: aload_3
       129: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/instance/Folk.getNpcId:()I
       132: invokevirtual #81                 // Method ext/mods/gameserver/model/multisell/PreparedListContainer.isNpcAllowed:(I)Z
       135: ifeq          149
       138: aload_3
       139: ifnonnull     155
       142: aload_2
       143: invokevirtual #85                 // Method ext/mods/gameserver/model/multisell/PreparedListContainer.isNpcOnly:()Z
       146: ifeq          155
       149: aload_1
       150: aconst_null
       151: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
       154: return
       155: aload_3
       156: ifnull        176
       159: aload_1
       160: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       163: aload_3
       164: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
       167: ifne          176
       170: aload_1
       171: aconst_null
       172: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
       175: return
       176: aload_1
       177: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       180: astore        4
       182: aload_2
       183: invokevirtual #63                 // Method ext/mods/gameserver/model/multisell/PreparedListContainer.getEntries:()Ljava/util/List;
       186: aload_0
       187: getfield      #17                 // Field _entryId:I
       190: iconst_1
       191: isub
       192: invokeinterface #103,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       197: checkcast     #107                // class ext/mods/gameserver/model/multisell/Entry
       200: astore        5
       202: aload         5
       204: ifnonnull     213
       207: aload_1
       208: aconst_null
       209: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
       212: return
       213: aload         5
       215: invokevirtual #109                // Method ext/mods/gameserver/model/multisell/Entry.isStackable:()Z
       218: ifne          235
       221: aload_0
       222: getfield      #20                 // Field _amount:I
       225: iconst_1
       226: if_icmple     235
       229: aload_1
       230: aconst_null
       231: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
       234: return
       235: iconst_0
       236: istore        6
       238: iconst_0
       239: istore        7
       241: aload         5
       243: invokevirtual #112                // Method ext/mods/gameserver/model/multisell/Entry.getProducts:()Ljava/util/List;
       246: invokeinterface #115,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       251: astore        8
       253: aload         8
       255: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       260: ifeq          354
       263: aload         8
       265: invokeinterface #124,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       270: checkcast     #128                // class ext/mods/gameserver/model/multisell/Ingredient
       273: astore        9
       275: aload         9
       277: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       280: ifge          286
       283: goto          253
       286: aload         9
       288: invokevirtual #133                // Method ext/mods/gameserver/model/multisell/Ingredient.isStackable:()Z
       291: ifne          312
       294: iload         6
       296: aload         9
       298: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       301: aload_0
       302: getfield      #20                 // Field _amount:I
       305: imul
       306: iadd
       307: istore        6
       309: goto          330
       312: aload_1
       313: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       316: aload         9
       318: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       321: invokevirtual #137                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       324: ifnonnull     330
       327: iinc          6, 1
       330: iload         7
       332: aload         9
       334: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       337: aload_0
       338: getfield      #20                 // Field _amount:I
       341: imul
       342: aload         9
       344: invokevirtual #143                // Method ext/mods/gameserver/model/multisell/Ingredient.getWeight:()I
       347: imul
       348: iadd
       349: istore        7
       351: goto          253
       354: aload         4
       356: iload         7
       358: invokevirtual #146                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateWeight:(I)Z
       361: ifne          372
       364: aload_1
       365: getstatic     #149                // Field ext/mods/gameserver/network/SystemMessageId.WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
       368: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       371: return
       372: aload         4
       374: iload         6
       376: invokevirtual #159                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
       379: ifne          390
       382: aload_1
       383: getstatic     #162                // Field ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
       386: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       389: return
       390: new           #165                // class java/util/ArrayList
       393: dup
       394: aload         5
       396: invokevirtual #167                // Method ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
       399: invokeinterface #67,  1           // InterfaceMethod java/util/List.size:()I
       404: invokespecial #170                // Method java/util/ArrayList."<init>":(I)V
       407: astore        8
       409: aload         5
       411: invokevirtual #167                // Method ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
       414: invokeinterface #115,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       419: astore        10
       421: aload         10
       423: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       428: ifeq          589
       431: aload         10
       433: invokeinterface #124,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       438: checkcast     #128                // class ext/mods/gameserver/model/multisell/Ingredient
       441: astore        11
       443: iconst_1
       444: istore        9
       446: aload         8
       448: invokeinterface #67,  1           // InterfaceMethod java/util/List.size:()I
       453: istore        12
       455: iinc          12, -1
       458: iload         12
       460: iflt          571
       463: aload         8
       465: iload         12
       467: invokeinterface #103,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       472: checkcast     #128                // class ext/mods/gameserver/model/multisell/Ingredient
       475: astore        13
       477: aload         13
       479: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       482: aload         11
       484: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       487: if_icmpne     568
       490: aload         13
       492: invokevirtual #173                // Method ext/mods/gameserver/model/multisell/Ingredient.getEnchantLevel:()I
       495: aload         11
       497: invokevirtual #173                // Method ext/mods/gameserver/model/multisell/Ingredient.getEnchantLevel:()I
       500: if_icmpne     568
       503: aload         13
       505: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       508: ldc           #178                // int 2147483647
       510: aload         11
       512: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       515: isub
       516: if_icmple     527
       519: aload_1
       520: getstatic     #179                // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_EXCEEDED_QUANTITY_THAT_CAN_BE_INPUTTED:Lext/mods/gameserver/network/SystemMessageId;
       523: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       526: return
       527: aload         13
       529: invokevirtual #182                // Method ext/mods/gameserver/model/multisell/Ingredient.getCopy:()Lext/mods/gameserver/model/multisell/Ingredient;
       532: astore        14
       534: aload         14
       536: aload         13
       538: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       541: aload         11
       543: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       546: iadd
       547: invokevirtual #186                // Method ext/mods/gameserver/model/multisell/Ingredient.setItemCount:(I)V
       550: aload         8
       552: iload         12
       554: aload         14
       556: invokeinterface #189,  3          // InterfaceMethod java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
       561: pop
       562: iconst_0
       563: istore        9
       565: goto          571
       568: goto          455
       571: iload         9
       573: ifeq          586
       576: aload         8
       578: aload         11
       580: invokeinterface #193,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       585: pop
       586: goto          421
       589: aload         8
       591: invokeinterface #115,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       596: astore        10
       598: aload         10
       600: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       605: ifeq          816
       608: aload         10
       610: invokeinterface #124,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       615: checkcast     #128                // class ext/mods/gameserver/model/multisell/Ingredient
       618: astore        11
       620: aload         11
       622: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       625: ldc           #178                // int 2147483647
       627: aload_0
       628: getfield      #20                 // Field _amount:I
       631: idiv
       632: if_icmple     643
       635: aload_1
       636: getstatic     #179                // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_EXCEEDED_QUANTITY_THAT_CAN_BE_INPUTTED:Lext/mods/gameserver/network/SystemMessageId;
       639: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       642: return
       643: aload         11
       645: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       648: ldc           #197                // int 65336
       650: if_icmpne     711
       653: aload_1
       654: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       657: ifnonnull     668
       660: aload_1
       661: getstatic     #202                // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_A_CLAN_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
       664: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       667: return
       668: aload_1
       669: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       672: ifne          683
       675: aload_1
       676: getstatic     #208                // Field ext/mods/gameserver/network/SystemMessageId.ONLY_THE_CLAN_LEADER_IS_ENABLED:Lext/mods/gameserver/network/SystemMessageId;
       679: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       682: return
       683: aload_1
       684: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       687: invokevirtual #211                // Method ext/mods/gameserver/model/pledge/Clan.getReputationScore:()I
       690: aload         11
       692: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       695: aload_0
       696: getfield      #20                 // Field _amount:I
       699: imul
       700: if_icmpge     813
       703: aload_1
       704: getstatic     #216                // Field ext/mods/gameserver/network/SystemMessageId.THE_CLAN_REPUTATION_SCORE_IS_TOO_LOW:Lext/mods/gameserver/network/SystemMessageId;
       707: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       710: return
       711: aload         11
       713: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       716: ldc           #219                // int 65436
       718: if_icmpne     749
       721: aload_1
       722: invokevirtual #220                // Method ext/mods/gameserver/model/actor/Player.getPcCafePoints:()I
       725: aload         11
       727: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       730: aload_0
       731: getfield      #20                 // Field _amount:I
       734: imul
       735: if_icmpge     813
       738: aload_1
       739: getstatic     #223                // Field ext/mods/gameserver/network/SystemMessageId.SHORT_OF_ACCUMULATED_POINTS:Lext/mods/gameserver/network/SystemMessageId;
       742: invokestatic  #226                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       745: invokevirtual #232                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       748: return
       749: aload         4
       751: aload         11
       753: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       756: aload_2
       757: invokevirtual #235                // Method ext/mods/gameserver/model/multisell/PreparedListContainer.getMaintainEnchantment:()Z
       760: ifeq          771
       763: aload         11
       765: invokevirtual #173                // Method ext/mods/gameserver/model/multisell/Ingredient.getEnchantLevel:()I
       768: goto          772
       771: iconst_m1
       772: iconst_0
       773: invokevirtual #238                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(IIZ)I
       776: aload         11
       778: invokevirtual #241                // Method ext/mods/gameserver/model/multisell/Ingredient.getMaintainIngredient:()Z
       781: ifne          797
       784: aload         11
       786: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       789: aload_0
       790: getfield      #20                 // Field _amount:I
       793: imul
       794: goto          802
       797: aload         11
       799: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       802: if_icmpge     813
       805: aload_1
       806: getstatic     #244                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
       809: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       812: return
       813: goto          598
       816: new           #165                // class java/util/ArrayList
       819: dup
       820: invokespecial #247                // Method java/util/ArrayList."<init>":()V
       823: astore        10
       825: aload         5
       827: invokevirtual #167                // Method ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
       830: invokeinterface #115,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       835: astore        11
       837: aload         11
       839: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       844: ifeq          1240
       847: aload         11
       849: invokeinterface #124,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       854: checkcast     #128                // class ext/mods/gameserver/model/multisell/Ingredient
       857: astore        12
       859: aload         12
       861: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       864: ldc           #197                // int 65336
       866: if_icmpne     909
       869: aload         12
       871: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       874: aload_0
       875: getfield      #20                 // Field _amount:I
       878: imul
       879: istore        13
       881: aload_1
       882: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       885: iload         13
       887: invokevirtual #248                // Method ext/mods/gameserver/model/pledge/Clan.takeReputationScore:(I)Z
       890: pop
       891: aload_1
       892: getstatic     #251                // Field ext/mods/gameserver/network/SystemMessageId.S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
       895: invokestatic  #226                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       898: iload         13
       900: invokevirtual #254                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       903: invokevirtual #232                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       906: goto          1237
       909: aload         12
       911: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       914: ldc           #219                // int 65436
       916: if_icmpne     936
       919: aload_1
       920: aload         12
       922: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       925: aload_0
       926: getfield      #20                 // Field _amount:I
       929: imul
       930: invokevirtual #258                // Method ext/mods/gameserver/model/actor/Player.decreasePcCafePoints:(I)V
       933: goto          1237
       936: aload         4
       938: aload         12
       940: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
       943: invokevirtual #137                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       946: astore        13
       948: aload         13
       950: ifnonnull     959
       953: aload_1
       954: aconst_null
       955: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
       958: return
       959: aload         12
       961: invokevirtual #241                // Method ext/mods/gameserver/model/multisell/Ingredient.getMaintainIngredient:()Z
       964: ifne          1237
       967: aload         13
       969: invokevirtual #261                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
       972: ifeq          1004
       975: aload_1
       976: aload         13
       978: invokevirtual #264                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       981: aload         12
       983: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       986: aload_0
       987: getfield      #20                 // Field _amount:I
       990: imul
       991: iconst_1
       992: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
       995: ifne          1237
       998: aload_1
       999: aconst_null
      1000: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
      1003: return
      1004: aload_2
      1005: invokevirtual #235                // Method ext/mods/gameserver/model/multisell/PreparedListContainer.getMaintainEnchantment:()Z
      1008: ifeq          1106
      1011: aload         4
      1013: aload         12
      1015: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
      1018: aload         12
      1020: invokevirtual #173                // Method ext/mods/gameserver/model/multisell/Ingredient.getEnchantLevel:()I
      1023: iconst_0
      1024: invokevirtual #271                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAllItemsByItemId:(IIZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
      1027: astore        14
      1029: iconst_0
      1030: istore        15
      1032: iload         15
      1034: aload         12
      1036: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
      1039: aload_0
      1040: getfield      #20                 // Field _amount:I
      1043: imul
      1044: if_icmpge     1103
      1047: aload         14
      1049: iload         15
      1051: aaload
      1052: invokevirtual #275                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
      1055: ifeq          1074
      1058: aload         10
      1060: aload         14
      1062: iload         15
      1064: aaload
      1065: invokevirtual #278                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
      1068: invokeinterface #193,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      1073: pop
      1074: aload_1
      1075: aload         14
      1077: iload         15
      1079: aaload
      1080: invokevirtual #264                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
      1083: iconst_1
      1084: iconst_1
      1085: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
      1088: ifne          1097
      1091: aload_1
      1092: aconst_null
      1093: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
      1096: return
      1097: iinc          15, 1
      1100: goto          1032
      1103: goto          1237
      1106: iconst_1
      1107: istore        14
      1109: iload         14
      1111: aload         12
      1113: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
      1116: aload_0
      1117: getfield      #20                 // Field _amount:I
      1120: imul
      1121: if_icmpgt     1237
      1124: aload         4
      1126: aload         12
      1128: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
      1131: iconst_0
      1132: invokevirtual #282                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAllItemsByItemId:(IZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
      1135: astore        15
      1137: aload         15
      1139: iconst_0
      1140: aaload
      1141: astore        13
      1143: aload         13
      1145: invokevirtual #285                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
      1148: ifle          1211
      1151: aload         15
      1153: astore        16
      1155: aload         16
      1157: arraylength
      1158: istore        17
      1160: iconst_0
      1161: istore        18
      1163: iload         18
      1165: iload         17
      1167: if_icmpge     1211
      1170: aload         16
      1172: iload         18
      1174: aaload
      1175: astore        19
      1177: aload         19
      1179: invokevirtual #285                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
      1182: aload         13
      1184: invokevirtual #285                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
      1187: if_icmpge     1205
      1190: aload         19
      1192: astore        13
      1194: aload         13
      1196: invokevirtual #285                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
      1199: ifne          1205
      1202: goto          1211
      1205: iinc          18, 1
      1208: goto          1163
      1211: aload_1
      1212: aload         13
      1214: invokevirtual #264                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
      1217: iconst_1
      1218: iconst_1
      1219: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
      1222: ifne          1231
      1225: aload_1
      1226: aconst_null
      1227: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
      1230: return
      1231: iinc          14, 1
      1234: goto          1109
      1237: goto          837
      1240: aload         5
      1242: invokevirtual #112                // Method ext/mods/gameserver/model/multisell/Entry.getProducts:()Ljava/util/List;
      1245: invokeinterface #115,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      1250: astore        11
      1252: aload         11
      1254: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1259: ifeq          1566
      1262: aload         11
      1264: invokeinterface #124,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1269: checkcast     #128                // class ext/mods/gameserver/model/multisell/Ingredient
      1272: astore        12
      1274: aload         12
      1276: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
      1279: ldc           #197                // int 65336
      1281: if_icmpne     1305
      1284: aload_1
      1285: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
      1288: aload         12
      1290: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
      1293: aload_0
      1294: getfield      #20                 // Field _amount:I
      1297: imul
      1298: invokevirtual #286                // Method ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
      1301: pop
      1302: goto          1563
      1305: aload         12
      1307: invokevirtual #133                // Method ext/mods/gameserver/model/multisell/Ingredient.isStackable:()Z
      1310: ifeq          1337
      1313: aload         4
      1315: aload         12
      1317: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
      1320: aload         12
      1322: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
      1325: aload_0
      1326: getfield      #20                 // Field _amount:I
      1329: imul
      1330: invokevirtual #289                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
      1333: pop
      1334: goto          1453
      1337: iconst_0
      1338: istore        13
      1340: iload         13
      1342: aload         12
      1344: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
      1347: aload_0
      1348: getfield      #20                 // Field _amount:I
      1351: imul
      1352: if_icmpge     1453
      1355: aload         4
      1357: aload         12
      1359: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
      1362: iconst_1
      1363: invokevirtual #289                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
      1366: astore        14
      1368: aload         14
      1370: ifnull        1447
      1373: aload_2
      1374: invokevirtual #235                // Method ext/mods/gameserver/model/multisell/PreparedListContainer.getMaintainEnchantment:()Z
      1377: ifeq          1447
      1380: iload         13
      1382: aload         10
      1384: invokeinterface #67,  1           // InterfaceMethod java/util/List.size:()I
      1389: if_icmpge     1436
      1392: aload         14
      1394: new           #293                // class ext/mods/gameserver/model/Augmentation
      1397: dup
      1398: aload         10
      1400: iload         13
      1402: invokeinterface #103,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1407: checkcast     #293                // class ext/mods/gameserver/model/Augmentation
      1410: invokevirtual #295                // Method ext/mods/gameserver/model/Augmentation.getId:()I
      1413: aload         10
      1415: iload         13
      1417: invokeinterface #103,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1422: checkcast     #293                // class ext/mods/gameserver/model/Augmentation
      1425: invokevirtual #296                // Method ext/mods/gameserver/model/Augmentation.getSkill:()Lext/mods/gameserver/skills/L2Skill;
      1428: invokespecial #300                // Method ext/mods/gameserver/model/Augmentation."<init>":(ILext/mods/gameserver/skills/L2Skill;)V
      1431: aload_1
      1432: invokevirtual #303                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setAugmentation:(Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
      1435: pop
      1436: aload         14
      1438: aload         12
      1440: invokevirtual #173                // Method ext/mods/gameserver/model/multisell/Ingredient.getEnchantLevel:()I
      1443: aload_1
      1444: invokevirtual #307                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
      1447: iinc          13, 1
      1450: goto          1340
      1453: aload         12
      1455: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
      1458: aload_0
      1459: getfield      #20                 // Field _amount:I
      1462: imul
      1463: iconst_1
      1464: if_icmple     1499
      1467: getstatic     #311                // Field ext/mods/gameserver/network/SystemMessageId.EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
      1470: invokestatic  #226                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1473: aload         12
      1475: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
      1478: invokevirtual #314                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1481: aload         12
      1483: invokevirtual #134                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
      1486: aload_0
      1487: getfield      #20                 // Field _amount:I
      1490: imul
      1491: invokevirtual #254                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1494: astore        13
      1496: goto          1557
      1499: aload_2
      1500: invokevirtual #235                // Method ext/mods/gameserver/model/multisell/PreparedListContainer.getMaintainEnchantment:()Z
      1503: ifeq          1541
      1506: aload         12
      1508: invokevirtual #173                // Method ext/mods/gameserver/model/multisell/Ingredient.getEnchantLevel:()I
      1511: ifle          1541
      1514: getstatic     #317                // Field ext/mods/gameserver/network/SystemMessageId.ACQUIRED_S1_S2:Lext/mods/gameserver/network/SystemMessageId;
      1517: invokestatic  #226                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1520: aload         12
      1522: invokevirtual #173                // Method ext/mods/gameserver/model/multisell/Ingredient.getEnchantLevel:()I
      1525: invokevirtual #254                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1528: aload         12
      1530: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
      1533: invokevirtual #314                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1536: astore        13
      1538: goto          1557
      1541: getstatic     #320                // Field ext/mods/gameserver/network/SystemMessageId.EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
      1544: invokestatic  #226                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1547: aload         12
      1549: invokevirtual #130                // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
      1552: invokevirtual #314                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1555: astore        13
      1557: aload_1
      1558: aload         13
      1560: invokevirtual #232                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1563: goto          1252
      1566: aload_1
      1567: getstatic     #323                // Field ext/mods/gameserver/network/SystemMessageId.SUCCESSFULLY_TRADED_WITH_NPC:Lext/mods/gameserver/network/SystemMessageId;
      1570: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1573: aload_3
      1574: ifnull        1603
      1577: aload         5
      1579: invokevirtual #326                // Method ext/mods/gameserver/model/multisell/Entry.getTaxAmount:()I
      1582: ifle          1603
      1585: aload_3
      1586: invokevirtual #329                // Method ext/mods/gameserver/model/actor/instance/Folk.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      1589: aload         5
      1591: invokevirtual #326                // Method ext/mods/gameserver/model/multisell/Entry.getTaxAmount:()I
      1594: aload_0
      1595: getfield      #20                 // Field _amount:I
      1598: imul
      1599: i2l
      1600: invokevirtual #333                // Method ext/mods/gameserver/model/residence/castle/Castle.riseTaxRevenue:(J)V
      1603: return
      LineNumberTable:
        line 56: 0
        line 57: 11
        line 58: 15
        line 60: 16
        line 62: 32
        line 63: 37
        line 66: 38
        line 68: 56
        line 69: 61
        line 72: 62
        line 73: 67
        line 75: 82
        line 76: 87
        line 79: 88
        line 81: 112
        line 82: 117
        line 85: 118
        line 86: 123
        line 88: 149
        line 89: 154
        line 92: 155
        line 94: 170
        line 95: 175
        line 98: 176
        line 99: 182
        line 100: 202
        line 102: 207
        line 103: 212
        line 106: 213
        line 108: 229
        line 109: 234
        line 112: 235
        line 113: 238
        line 115: 241
        line 117: 275
        line 118: 283
        line 120: 286
        line 121: 294
        line 122: 312
        line 123: 327
        line 125: 330
        line 126: 351
        line 128: 354
        line 130: 364
        line 131: 371
        line 134: 372
        line 136: 382
        line 137: 389
        line 140: 390
        line 143: 409
        line 145: 443
        line 147: 446
        line 149: 463
        line 151: 477
        line 153: 503
        line 155: 519
        line 156: 526
        line 159: 527
        line 160: 534
        line 161: 550
        line 163: 562
        line 164: 565
        line 166: 568
        line 168: 571
        line 169: 576
        line 170: 586
        line 172: 589
        line 174: 620
        line 176: 635
        line 177: 642
        line 180: 643
        line 182: 653
        line 184: 660
        line 185: 667
        line 188: 668
        line 190: 675
        line 191: 682
        line 194: 683
        line 196: 703
        line 197: 710
        line 200: 711
        line 202: 721
        line 204: 738
        line 205: 748
        line 210: 749
        line 212: 805
        line 213: 812
        line 216: 813
        line 218: 816
        line 220: 825
        line 222: 859
        line 224: 869
        line 226: 881
        line 227: 891
        line 228: 906
        line 229: 909
        line 230: 919
        line 233: 936
        line 234: 948
        line 236: 953
        line 237: 958
        line 240: 959
        line 242: 967
        line 244: 975
        line 246: 998
        line 247: 1003
        line 253: 1004
        line 255: 1011
        line 256: 1029
        line 258: 1047
        line 259: 1058
        line 261: 1074
        line 263: 1091
        line 264: 1096
        line 256: 1097
        line 267: 1103
        line 270: 1106
        line 272: 1124
        line 274: 1137
        line 275: 1143
        line 277: 1151
        line 279: 1177
        line 281: 1190
        line 283: 1194
        line 284: 1202
        line 277: 1205
        line 289: 1211
        line 291: 1225
        line 292: 1230
        line 270: 1231
        line 299: 1237
        line 301: 1240
        line 303: 1274
        line 304: 1284
        line 307: 1305
        line 308: 1313
        line 311: 1337
        line 313: 1355
        line 314: 1368
        line 316: 1380
        line 317: 1392
        line 319: 1436
        line 311: 1447
        line 326: 1453
        line 327: 1467
        line 330: 1499
        line 331: 1514
        line 333: 1541
        line 335: 1557
        line 337: 1563
        line 339: 1566
        line 341: 1573
        line 342: 1585
        line 343: 1603
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          275      76     9     e   Lext/mods/gameserver/model/multisell/Ingredient;
          534      34    14   ing   Lext/mods/gameserver/model/multisell/Ingredient;
          477      91    13    ex   Lext/mods/gameserver/model/multisell/Ingredient;
          455     116    12     i   I
          443     143    11     e   Lext/mods/gameserver/model/multisell/Ingredient;
          446     143     9 newIng   Z
          620     193    11     e   Lext/mods/gameserver/model/multisell/Ingredient;
          881      25    13 amount   I
         1032      71    15     i   I
         1029      74    14 inventoryContents   [Lext/mods/gameserver/model/item/instance/ItemInstance;
         1177      28    19  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
         1137      94    15 inventoryContents   [Lext/mods/gameserver/model/item/instance/ItemInstance;
         1109     128    14     i   I
          948     289    13 itemToTake   Lext/mods/gameserver/model/item/instance/ItemInstance;
          859     378    12     e   Lext/mods/gameserver/model/multisell/Ingredient;
         1368      79    14 product   Lext/mods/gameserver/model/item/instance/ItemInstance;
         1340     113    13     i   I
         1496       3    13    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
         1538       3    13    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
         1557       6    13    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
         1274     289    12     e   Lext/mods/gameserver/model/multisell/Ingredient;
            0    1604     0  this   Lext/mods/gameserver/network/clientpackets/MultiSellChoose;
           11    1593     1 player   Lext/mods/gameserver/model/actor/Player;
           67    1537     2  list   Lext/mods/gameserver/model/multisell/PreparedListContainer;
          123    1481     3  folk   Lext/mods/gameserver/model/actor/instance/Folk;
          182    1422     4   inv   Lext/mods/gameserver/model/itemcontainer/PcInventory;
          202    1402     5 entry   Lext/mods/gameserver/model/multisell/Entry;
          238    1366     6 slots   I
          241    1363     7 weight   I
          409    1195     8 ingredientsList   Ljava/util/List;
          825     779    10 augmentation   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          409    1195     8 ingredientsList   Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;
          825     779    10 augmentation   Ljava/util/List<Lext/mods/gameserver/model/Augmentation;>;
      StackMapTable: number_of_entries = 70
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 21 /* same */
        frame_type = 17 /* same */
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/multisell/PreparedListContainer ]
        frame_type = 5 /* same */
        frame_type = 23 /* same */
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/Folk ]
        frame_type = 10 /* same */
        frame_type = 5 /* same */
        frame_type = 20 /* same */
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, class ext/mods/gameserver/model/multisell/Entry ]
        frame_type = 21 /* same */
        frame_type = 254 /* append */
          offset_delta = 17
          locals = [ int, int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/multisell/Ingredient ]
        frame_type = 25 /* same */
        frame_type = 17 /* same */
        frame_type = 249 /* chop */
          offset_delta = 23
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 254 /* append */
          offset_delta = 30
          locals = [ class java/util/List, top, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/network/clientpackets/MultiSellChoose, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/multisell/PreparedListContainer, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/model/itemcontainer/PcInventory, class ext/mods/gameserver/model/multisell/Entry, int, int, class java/util/List, int, class java/util/Iterator, class ext/mods/gameserver/model/multisell/Ingredient, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/model/multisell/Ingredient ]
        frame_type = 250 /* chop */
          offset_delta = 40
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 8
          locals = [ top, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/multisell/Ingredient ]
        frame_type = 24 /* same */
        frame_type = 14 /* same */
        frame_type = 27 /* same */
        frame_type = 37 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/network/clientpackets/MultiSellChoose, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/multisell/PreparedListContainer, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/model/itemcontainer/PcInventory, class ext/mods/gameserver/model/multisell/Entry, int, int, class java/util/List, top, class java/util/Iterator, class ext/mods/gameserver/model/multisell/Ingredient ]
          stack = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/MultiSellChoose, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/multisell/PreparedListContainer, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/model/itemcontainer/PcInventory, class ext/mods/gameserver/model/multisell/Entry, int, int, class java/util/List, top, class java/util/Iterator, class ext/mods/gameserver/model/multisell/Ingredient ]
          stack = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, int, int ]
        frame_type = 88 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/network/clientpackets/MultiSellChoose, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/multisell/PreparedListContainer, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/model/itemcontainer/PcInventory, class ext/mods/gameserver/model/multisell/Entry, int, int, class java/util/List, top, class java/util/Iterator, class ext/mods/gameserver/model/multisell/Ingredient ]
          stack = [ int, int ]
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ top, class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/model/multisell/Ingredient ]
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 44 /* same */
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ class "[Lext/mods/gameserver/model/item/instance/ItemInstance;", int ]
        frame_type = 41 /* same */
        frame_type = 22 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/network/clientpackets/MultiSellChoose, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/multisell/PreparedListContainer, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/model/itemcontainer/PcInventory, class ext/mods/gameserver/model/multisell/Entry, int, int, class java/util/List, top, class java/util/List, class java/util/Iterator, class ext/mods/gameserver/model/multisell/Ingredient, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class "[Lext/mods/gameserver/model/item/instance/ItemInstance;", class "[Lext/mods/gameserver/model/item/instance/ItemInstance;", int, int ]
          stack = []
        frame_type = 41 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/multisell/Ingredient ]
        frame_type = 31 /* same */
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 95
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 45 /* same */
        frame_type = 41 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 36 /* same */
}
SourceFile: "MultiSellChoose.java"
