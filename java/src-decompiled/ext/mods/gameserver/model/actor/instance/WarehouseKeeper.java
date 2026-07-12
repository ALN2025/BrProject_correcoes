// Bytecode for: ext.mods.gameserver.model.actor.instance.WarehouseKeeper
// File: ext\mods\gameserver\model\actor\instance\WarehouseKeeper.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/WarehouseKeeper.class
  Last modified 9 de jul de 2026; size 6090 bytes
  MD5 checksum 797ac12bc416e99fa33a448ca9f9221b
  Compiled from "WarehouseKeeper.java"
public class ext.mods.gameserver.model.actor.instance.WarehouseKeeper extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #34                         // ext/mods/gameserver/model/actor/instance/WarehouseKeeper
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = String             #8            //
    #8 = Utf8
    #9 = InvokeDynamic      #0:#10        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #10 = NameAndType        #11:#12       // makeConcatWithConstants:(I)Ljava/lang/String;
   #11 = Utf8               makeConcatWithConstants
   #12 = Utf8               (I)Ljava/lang/String;
   #13 = InvokeDynamic      #1:#14        // #1:makeConcatWithConstants:(II)Ljava/lang/String;
   #14 = NameAndType        #11:#15       // makeConcatWithConstants:(II)Ljava/lang/String;
   #15 = Utf8               (II)Ljava/lang/String;
   #16 = InvokeDynamic      #2:#17        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #17 = NameAndType        #11:#18       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #18 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #19 = Fieldref           #20.#21       // ext/mods/Config.KARMA_PLAYER_CAN_USE_WH:Z
   #20 = Class              #22           // ext/mods/Config
   #21 = NameAndType        #23:#24       // KARMA_PLAYER_CAN_USE_WH:Z
   #22 = Utf8               ext/mods/Config
   #23 = Utf8               KARMA_PLAYER_CAN_USE_WH
   #24 = Utf8               Z
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/actor/Player.getKarma:()I
   #26 = Class              #28           // ext/mods/gameserver/model/actor/Player
   #27 = NameAndType        #29:#30       // getKarma:()I
   #28 = Utf8               ext/mods/gameserver/model/actor/Player
   #29 = Utf8               getKarma
   #30 = Utf8               ()I
   #31 = String             #32           // warehouse
   #32 = Utf8               warehouse
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/instance/WarehouseKeeper.showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #34 = Class              #36           // ext/mods/gameserver/model/actor/instance/WarehouseKeeper
   #35 = NameAndType        #37:#38       // showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #36 = Utf8               ext/mods/gameserver/model/actor/instance/WarehouseKeeper
   #37 = Utf8               showPkDenyChatWindow
   #38 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #39 = Methodref          #26.#40       // ext/mods/gameserver/model/actor/Player.isProcessingTransaction:()Z
   #40 = NameAndType        #41:#42       // isProcessingTransaction:()Z
   #41 = Utf8               isProcessingTransaction
   #42 = Utf8               ()Z
   #43 = Fieldref           #44.#45       // ext/mods/gameserver/network/SystemMessageId.ALREADY_TRADING:Lext/mods/gameserver/network/SystemMessageId;
   #44 = Class              #46           // ext/mods/gameserver/network/SystemMessageId
   #45 = NameAndType        #47:#48       // ALREADY_TRADING:Lext/mods/gameserver/network/SystemMessageId;
   #46 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #47 = Utf8               ALREADY_TRADING
   #48 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #49 = Methodref          #26.#50       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #50 = NameAndType        #51:#52       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #51 = Utf8               sendPacket
   #52 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #53 = Methodref          #26.#54       // ext/mods/gameserver/model/actor/Player.cancelActiveEnchant:()V
   #54 = NameAndType        #55:#56       // cancelActiveEnchant:()V
   #55 = Utf8               cancelActiveEnchant
   #56 = Utf8               ()V
   #57 = String             #58           // WithdrawP
   #58 = Utf8               WithdrawP
   #59 = Methodref          #60.#61       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #60 = Class              #62           // java/lang/String
   #61 = NameAndType        #63:#64       // startsWith:(Ljava/lang/String;)Z
   #62 = Utf8               java/lang/String
   #63 = Utf8               startsWith
   #64 = Utf8               (Ljava/lang/String;)Z
   #65 = Methodref          #26.#66       // ext/mods/gameserver/model/actor/Player.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/PcWarehouse;
   #66 = NameAndType        #67:#68       // getWarehouse:()Lext/mods/gameserver/model/itemcontainer/PcWarehouse;
   #67 = Utf8               getWarehouse
   #68 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcWarehouse;
   #69 = Methodref          #26.#70       // ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
   #70 = NameAndType        #71:#72       // setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
   #71 = Utf8               setActiveWarehouse
   #72 = Utf8               (Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
   #73 = Methodref          #26.#74       // ext/mods/gameserver/model/actor/Player.getActiveWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
   #74 = NameAndType        #75:#76       // getActiveWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
   #75 = Utf8               getActiveWarehouse
   #76 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
   #77 = Methodref          #78.#79       // ext/mods/gameserver/model/itemcontainer/ItemContainer.getSize:()I
   #78 = Class              #80           // ext/mods/gameserver/model/itemcontainer/ItemContainer
   #79 = NameAndType        #81:#30       // getSize:()I
   #80 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
   #81 = Utf8               getSize
   #82 = Fieldref           #44.#83       // ext/mods/gameserver/network/SystemMessageId.NO_ITEM_DEPOSITED_IN_WH:Lext/mods/gameserver/network/SystemMessageId;
   #83 = NameAndType        #84:#48       // NO_ITEM_DEPOSITED_IN_WH:Lext/mods/gameserver/network/SystemMessageId;
   #84 = Utf8               NO_ITEM_DEPOSITED_IN_WH
   #85 = Class              #86           // ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList
   #86 = Utf8               ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList
   #87 = Methodref          #85.#88       // ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
   #88 = NameAndType        #5:#89        // "<init>":(Lext/mods/gameserver/model/actor/Player;I)V
   #89 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #90 = Methodref          #26.#91       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #91 = NameAndType        #51:#92       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #93 = Fieldref           #94.#95       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #94 = Class              #96           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #95 = NameAndType        #97:#98       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #96 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #97 = Utf8               STATIC_PACKET
   #98 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #99 = String             #100          // DepositP
  #100 = Utf8               DepositP
  #101 = Methodref          #60.#102      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #102 = NameAndType        #103:#104     // equals:(Ljava/lang/Object;)Z
  #103 = Utf8               equals
  #104 = Utf8               (Ljava/lang/Object;)Z
  #105 = Methodref          #26.#106      // ext/mods/gameserver/model/actor/Player.tempInventoryDisable:()V
  #106 = NameAndType        #107:#56      // tempInventoryDisable:()V
  #107 = Utf8               tempInventoryDisable
  #108 = Class              #109          // ext/mods/gameserver/network/serverpackets/WarehouseDepositList
  #109 = Utf8               ext/mods/gameserver/network/serverpackets/WarehouseDepositList
  #110 = Methodref          #108.#88      // ext/mods/gameserver/network/serverpackets/WarehouseDepositList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
  #111 = String             #112          // WithdrawC
  #112 = Utf8               WithdrawC
  #113 = Fieldref           #114.#115     // ext/mods/gameserver/enums/PrivilegeType.SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
  #114 = Class              #116          // ext/mods/gameserver/enums/PrivilegeType
  #115 = NameAndType        #117:#118     // SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
  #116 = Utf8               ext/mods/gameserver/enums/PrivilegeType
  #117 = Utf8               SP_WAREHOUSE_SEARCH
  #118 = Utf8               Lext/mods/gameserver/enums/PrivilegeType;
  #119 = Methodref          #26.#120      // ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #120 = NameAndType        #121:#122     // hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #121 = Utf8               hasClanPrivileges
  #122 = Utf8               (Lext/mods/gameserver/enums/PrivilegeType;)Z
  #123 = Fieldref           #44.#124      // ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_HAVE_THE_RIGHT_TO_USE_CLAN_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
  #124 = NameAndType        #125:#48      // YOU_DO_NOT_HAVE_THE_RIGHT_TO_USE_CLAN_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
  #125 = Utf8               YOU_DO_NOT_HAVE_THE_RIGHT_TO_USE_CLAN_WAREHOUSE
  #126 = Methodref          #26.#127      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #127 = NameAndType        #128:#129     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #128 = Utf8               getClan
  #129 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #130 = Methodref          #131.#132     // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #131 = Class              #133          // ext/mods/gameserver/model/pledge/Clan
  #132 = NameAndType        #134:#30      // getLevel:()I
  #133 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #134 = Utf8               getLevel
  #135 = Fieldref           #44.#136      // ext/mods/gameserver/network/SystemMessageId.ONLY_LEVEL_1_CLAN_OR_HIGHER_CAN_USE_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
  #136 = NameAndType        #137:#48      // ONLY_LEVEL_1_CLAN_OR_HIGHER_CAN_USE_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
  #137 = Utf8               ONLY_LEVEL_1_CLAN_OR_HIGHER_CAN_USE_WAREHOUSE
  #138 = Methodref          #131.#139     // ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #139 = NameAndType        #67:#76       // getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #140 = String             #141          // DepositC
  #141 = Utf8               DepositC
  #142 = String             #143          // WithdrawF
  #143 = Utf8               WithdrawF
  #144 = Fieldref           #20.#145      // ext/mods/Config.ALLOW_FREIGHT:Z
  #145 = NameAndType        #146:#24      // ALLOW_FREIGHT:Z
  #146 = Utf8               ALLOW_FREIGHT
  #147 = Methodref          #26.#148      // ext/mods/gameserver/model/actor/Player.getFreight:()Lext/mods/gameserver/model/itemcontainer/PcFreight;
  #148 = NameAndType        #149:#150     // getFreight:()Lext/mods/gameserver/model/itemcontainer/PcFreight;
  #149 = Utf8               getFreight
  #150 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcFreight;
  #151 = Methodref          #152.#79      // ext/mods/gameserver/model/itemcontainer/PcFreight.getSize:()I
  #152 = Class              #153          // ext/mods/gameserver/model/itemcontainer/PcFreight
  #153 = Utf8               ext/mods/gameserver/model/itemcontainer/PcFreight
  #154 = Fieldref           #20.#155      // ext/mods/Config.REGION_BASED_FREIGHT:Z
  #155 = NameAndType        #156:#24      // REGION_BASED_FREIGHT:Z
  #156 = Utf8               REGION_BASED_FREIGHT
  #157 = Methodref          #34.#158      // ext/mods/gameserver/model/actor/instance/WarehouseKeeper.getRegion:()Lext/mods/gameserver/model/WorldRegion;
  #158 = NameAndType        #159:#160     // getRegion:()Lext/mods/gameserver/model/WorldRegion;
  #159 = Utf8               getRegion
  #160 = Utf8               ()Lext/mods/gameserver/model/WorldRegion;
  #161 = Methodref          #162.#163     // java/lang/Object.hashCode:()I
  #162 = Class              #164          // java/lang/Object
  #163 = NameAndType        #165:#30      // hashCode:()I
  #164 = Utf8               java/lang/Object
  #165 = Utf8               hashCode
  #166 = Methodref          #152.#167     // ext/mods/gameserver/model/itemcontainer/PcFreight.setActiveLocation:(I)V
  #167 = NameAndType        #168:#169     // setActiveLocation:(I)V
  #168 = Utf8               setActiveLocation
  #169 = Utf8               (I)V
  #170 = String             #171          // DepositF
  #171 = Utf8               DepositF
  #172 = Methodref          #26.#173      // ext/mods/gameserver/model/actor/Player.getAccountChars:()Ljava/util/Map;
  #173 = NameAndType        #174:#175     // getAccountChars:()Ljava/util/Map;
  #174 = Utf8               getAccountChars
  #175 = Utf8               ()Ljava/util/Map;
  #176 = InterfaceMethodref #177.#178     // java/util/Map.isEmpty:()Z
  #177 = Class              #179          // java/util/Map
  #178 = NameAndType        #180:#42      // isEmpty:()Z
  #179 = Utf8               java/util/Map
  #180 = Utf8               isEmpty
  #181 = Fieldref           #44.#182      // ext/mods/gameserver/network/SystemMessageId.CHARACTER_DOES_NOT_EXIST:Lext/mods/gameserver/network/SystemMessageId;
  #182 = NameAndType        #183:#48      // CHARACTER_DOES_NOT_EXIST:Lext/mods/gameserver/network/SystemMessageId;
  #183 = Utf8               CHARACTER_DOES_NOT_EXIST
  #184 = InterfaceMethodref #177.#185     // java/util/Map.size:()I
  #185 = NameAndType        #186:#30      // size:()I
  #186 = Utf8               size
  #187 = Class              #188          // ext/mods/gameserver/network/serverpackets/PackageToList
  #188 = Utf8               ext/mods/gameserver/network/serverpackets/PackageToList
  #189 = Methodref          #187.#190     // ext/mods/gameserver/network/serverpackets/PackageToList."<init>":(Ljava/util/Map;)V
  #190 = NameAndType        #5:#191       // "<init>":(Ljava/util/Map;)V
  #191 = Utf8               (Ljava/util/Map;)V
  #192 = String             #193          // FreightChar
  #193 = Utf8               FreightChar
  #194 = String             #195          // _
  #195 = Utf8               _
  #196 = Methodref          #60.#197      // java/lang/String.lastIndexOf:(Ljava/lang/String;)I
  #197 = NameAndType        #198:#199     // lastIndexOf:(Ljava/lang/String;)I
  #198 = Utf8               lastIndexOf
  #199 = Utf8               (Ljava/lang/String;)I
  #200 = Methodref          #60.#201      // java/lang/String.substring:(I)Ljava/lang/String;
  #201 = NameAndType        #202:#12      // substring:(I)Ljava/lang/String;
  #202 = Utf8               substring
  #203 = Methodref          #204.#205     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #204 = Class              #206          // java/lang/Integer
  #205 = NameAndType        #207:#199     // parseInt:(Ljava/lang/String;)I
  #206 = Utf8               java/lang/Integer
  #207 = Utf8               parseInt
  #208 = Methodref          #26.#209      // ext/mods/gameserver/model/actor/Player.getDepositedFreight:(I)Lext/mods/gameserver/model/itemcontainer/PcFreight;
  #209 = NameAndType        #210:#211     // getDepositedFreight:(I)Lext/mods/gameserver/model/itemcontainer/PcFreight;
  #210 = Utf8               getDepositedFreight
  #211 = Utf8               (I)Lext/mods/gameserver/model/itemcontainer/PcFreight;
  #212 = Methodref          #2.#213       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #213 = NameAndType        #214:#215     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #214 = Utf8               onBypassFeedback
  #215 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #216 = Methodref          #34.#217      // ext/mods/gameserver/model/actor/instance/WarehouseKeeper.getNpcId:()I
  #217 = NameAndType        #218:#30      // getNpcId:()I
  #218 = Utf8               getNpcId
  #219 = Methodref          #34.#220      // ext/mods/gameserver/model/actor/instance/WarehouseKeeper.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #220 = NameAndType        #221:#222     // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #221 = Utf8               getHtmlPath
  #222 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #223 = Methodref          #34.#224      // ext/mods/gameserver/model/actor/instance/WarehouseKeeper.showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #224 = NameAndType        #225:#215     // showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #225 = Utf8               showChatWindow
  #226 = Utf8               Code
  #227 = Utf8               LineNumberTable
  #228 = Utf8               LocalVariableTable
  #229 = Utf8               this
  #230 = Utf8               Lext/mods/gameserver/model/actor/instance/WarehouseKeeper;
  #231 = Utf8               objectId
  #232 = Utf8               I
  #233 = Utf8               template
  #234 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #235 = Utf8               isWarehouse
  #236 = Utf8               player
  #237 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #238 = Utf8               npcId
  #239 = Utf8               val
  #240 = Utf8               filename
  #241 = Utf8               Ljava/lang/String;
  #242 = Utf8               StackMapTable
  #243 = Utf8               clan
  #244 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #245 = Utf8               freight
  #246 = Utf8               Lext/mods/gameserver/model/itemcontainer/PcFreight;
  #247 = Utf8               chars
  #248 = Utf8               Ljava/util/Map;
  #249 = Utf8               id
  #250 = Utf8               command
  #251 = Utf8               LocalVariableTypeTable
  #252 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;
  #253 = Utf8               SourceFile
  #254 = Utf8               WarehouseKeeper.java
  #255 = Utf8               BootstrapMethods
  #256 = String             #257          // \u0001
  #257 = Utf8               \u0001
  #258 = String             #259          // \u0001-\u0001
  #259 = Utf8               \u0001-\u0001
  #260 = String             #261          // html/warehouse/\u0001.htm
  #261 = Utf8               html/warehouse/\u0001.htm
  #262 = MethodHandle       6:#263        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #263 = Methodref          #264.#265     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #264 = Class              #266          // java/lang/invoke/StringConcatFactory
  #265 = NameAndType        #11:#267      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #266 = Utf8               java/lang/invoke/StringConcatFactory
  #267 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #268 = Utf8               InnerClasses
  #269 = Class              #270          // java/lang/invoke/MethodHandles$Lookup
  #270 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #271 = Class              #272          // java/lang/invoke/MethodHandles
  #272 = Utf8               java/lang/invoke/MethodHandles
  #273 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.WarehouseKeeper(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 43: 0
        line 44: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/WarehouseKeeper;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isWarehouse();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/WarehouseKeeper;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: ldc           #7                  // String
         2: astore        4
         4: iload_3
         5: ifne          19
         8: iload_2
         9: invokedynamic #9,  0              // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        14: astore        4
        16: goto          28
        19: iload_2
        20: iload_3
        21: invokedynamic #13,  0             // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
        26: astore        4
        28: aload         4
        30: invokedynamic #16,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: areturn
      LineNumberTable:
        line 55: 0
        line 56: 4
        line 57: 8
        line 59: 19
        line 61: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/WarehouseKeeper;
            0      36     1 player   Lext/mods/gameserver/model/actor/Player;
            0      36     2 npcId   I
            0      36     3   val   I
            4      32     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/String ]
        frame_type = 8 /* same */

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=3
         0: getstatic     #19                 // Field ext/mods/Config.KARMA_PLAYER_CAN_USE_WH:Z
         3: ifne          24
         6: aload_1
         7: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        10: ifle          24
        13: aload_0
        14: aload_1
        15: ldc           #31                 // String warehouse
        17: invokevirtual #33                 // Method showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        20: ifeq          24
        23: return
        24: aload_1
        25: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.isProcessingTransaction:()Z
        28: ifeq          39
        31: aload_1
        32: getstatic     #43                 // Field ext/mods/gameserver/network/SystemMessageId.ALREADY_TRADING:Lext/mods/gameserver/network/SystemMessageId;
        35: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        38: return
        39: aload_1
        40: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.cancelActiveEnchant:()V
        43: aload_2
        44: ldc           #57                 // String WithdrawP
        46: invokevirtual #59                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        49: ifeq          101
        52: aload_1
        53: aload_1
        54: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/PcWarehouse;
        57: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
        60: aload_1
        61: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getActiveWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
        64: invokevirtual #77                 // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.getSize:()I
        67: ifne          78
        70: aload_1
        71: getstatic     #82                 // Field ext/mods/gameserver/network/SystemMessageId.NO_ITEM_DEPOSITED_IN_WH:Lext/mods/gameserver/network/SystemMessageId;
        74: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        77: return
        78: aload_1
        79: new           #85                 // class ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList
        82: dup
        83: aload_1
        84: iconst_1
        85: invokespecial #87                 // Method ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
        88: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        91: aload_1
        92: getstatic     #93                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        95: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        98: goto          581
       101: aload_2
       102: ldc           #99                 // String DepositP
       104: invokevirtual #101                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       107: ifeq          145
       110: aload_1
       111: getstatic     #93                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       114: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       117: aload_1
       118: aload_1
       119: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/PcWarehouse;
       122: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
       125: aload_1
       126: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.tempInventoryDisable:()V
       129: aload_1
       130: new           #108                // class ext/mods/gameserver/network/serverpackets/WarehouseDepositList
       133: dup
       134: aload_1
       135: iconst_1
       136: invokespecial #110                // Method ext/mods/gameserver/network/serverpackets/WarehouseDepositList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
       139: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       142: goto          581
       145: aload_2
       146: ldc           #111                // String WithdrawC
       148: invokevirtual #101                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       151: ifeq          249
       154: aload_1
       155: getstatic     #113                // Field ext/mods/gameserver/enums/PrivilegeType.SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
       158: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
       161: ifne          172
       164: aload_1
       165: getstatic     #123                // Field ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_HAVE_THE_RIGHT_TO_USE_CLAN_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
       168: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       171: return
       172: aload_1
       173: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       176: astore_3
       177: aload_3
       178: ifnonnull     182
       181: return
       182: aload_3
       183: invokevirtual #130                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
       186: ifne          197
       189: aload_1
       190: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.ONLY_LEVEL_1_CLAN_OR_HIGHER_CAN_USE_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
       193: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       196: return
       197: aload_1
       198: aload_1
       199: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       202: invokevirtual #138                // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
       205: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
       208: aload_1
       209: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getActiveWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
       212: invokevirtual #77                 // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.getSize:()I
       215: ifne          226
       218: aload_1
       219: getstatic     #82                 // Field ext/mods/gameserver/network/SystemMessageId.NO_ITEM_DEPOSITED_IN_WH:Lext/mods/gameserver/network/SystemMessageId;
       222: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       225: return
       226: aload_1
       227: new           #85                 // class ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList
       230: dup
       231: aload_1
       232: iconst_2
       233: invokespecial #87                 // Method ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
       236: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       239: aload_1
       240: getstatic     #93                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       243: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       246: goto          581
       249: aload_2
       250: ldc           #140                // String DepositC
       252: invokevirtual #101                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       255: ifeq          321
       258: aload_1
       259: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       262: astore_3
       263: aload_3
       264: ifnonnull     268
       267: return
       268: aload_3
       269: invokevirtual #130                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
       272: ifne          283
       275: aload_1
       276: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.ONLY_LEVEL_1_CLAN_OR_HIGHER_CAN_USE_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
       279: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       282: return
       283: aload_1
       284: aload_1
       285: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       288: invokevirtual #138                // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
       291: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
       294: aload_1
       295: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.tempInventoryDisable:()V
       298: aload_1
       299: new           #108                // class ext/mods/gameserver/network/serverpackets/WarehouseDepositList
       302: dup
       303: aload_1
       304: iconst_2
       305: invokespecial #110                // Method ext/mods/gameserver/network/serverpackets/WarehouseDepositList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
       308: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       311: aload_1
       312: getstatic     #93                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       315: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       318: goto          581
       321: aload_2
       322: ldc           #142                // String WithdrawF
       324: invokevirtual #59                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       327: ifeq          410
       330: getstatic     #144                // Field ext/mods/Config.ALLOW_FREIGHT:Z
       333: ifne          337
       336: return
       337: aload_1
       338: getstatic     #93                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       341: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       344: aload_1
       345: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.getFreight:()Lext/mods/gameserver/model/itemcontainer/PcFreight;
       348: astore_3
       349: aload_3
       350: ifnull        360
       353: aload_3
       354: invokevirtual #151                // Method ext/mods/gameserver/model/itemcontainer/PcFreight.getSize:()I
       357: ifgt          368
       360: aload_1
       361: getstatic     #82                 // Field ext/mods/gameserver/network/SystemMessageId.NO_ITEM_DEPOSITED_IN_WH:Lext/mods/gameserver/network/SystemMessageId;
       364: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       367: return
       368: aload_3
       369: getstatic     #154                // Field ext/mods/Config.REGION_BASED_FREIGHT:Z
       372: ifeq          385
       375: aload_0
       376: invokevirtual #157                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
       379: invokevirtual #161                // Method java/lang/Object.hashCode:()I
       382: goto          386
       385: iconst_0
       386: invokevirtual #166                // Method ext/mods/gameserver/model/itemcontainer/PcFreight.setActiveLocation:(I)V
       389: aload_1
       390: aload_3
       391: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
       394: aload_1
       395: new           #85                 // class ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList
       398: dup
       399: aload_1
       400: iconst_4
       401: invokespecial #87                 // Method ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
       404: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       407: goto          581
       410: aload_2
       411: ldc           #170                // String DepositF
       413: invokevirtual #59                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       416: ifeq          481
       419: getstatic     #144                // Field ext/mods/Config.ALLOW_FREIGHT:Z
       422: ifne          426
       425: return
       426: aload_1
       427: getstatic     #93                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       430: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       433: aload_1
       434: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getAccountChars:()Ljava/util/Map;
       437: astore_3
       438: aload_3
       439: invokeinterface #176,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
       444: ifeq          455
       447: aload_1
       448: getstatic     #181                // Field ext/mods/gameserver/network/SystemMessageId.CHARACTER_DOES_NOT_EXIST:Lext/mods/gameserver/network/SystemMessageId;
       451: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       454: return
       455: aload_3
       456: invokeinterface #184,  1          // InterfaceMethod java/util/Map.size:()I
       461: iconst_1
       462: if_icmpge     466
       465: return
       466: aload_1
       467: new           #187                // class ext/mods/gameserver/network/serverpackets/PackageToList
       470: dup
       471: aload_3
       472: invokespecial #189                // Method ext/mods/gameserver/network/serverpackets/PackageToList."<init>":(Ljava/util/Map;)V
       475: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       478: goto          581
       481: aload_2
       482: ldc           #192                // String FreightChar
       484: invokevirtual #59                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       487: ifeq          575
       490: getstatic     #144                // Field ext/mods/Config.ALLOW_FREIGHT:Z
       493: ifne          497
       496: return
       497: aload_2
       498: aload_2
       499: ldc           #194                // String _
       501: invokevirtual #196                // Method java/lang/String.lastIndexOf:(Ljava/lang/String;)I
       504: iconst_1
       505: iadd
       506: invokevirtual #200                // Method java/lang/String.substring:(I)Ljava/lang/String;
       509: astore_3
       510: aload_1
       511: aload_3
       512: invokestatic  #203                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       515: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getDepositedFreight:(I)Lext/mods/gameserver/model/itemcontainer/PcFreight;
       518: astore        4
       520: aload         4
       522: getstatic     #154                // Field ext/mods/Config.REGION_BASED_FREIGHT:Z
       525: ifeq          538
       528: aload_0
       529: invokevirtual #157                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
       532: invokevirtual #161                // Method java/lang/Object.hashCode:()I
       535: goto          539
       538: iconst_0
       539: invokevirtual #166                // Method ext/mods/gameserver/model/itemcontainer/PcFreight.setActiveLocation:(I)V
       542: aload_1
       543: getstatic     #93                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       546: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       549: aload_1
       550: aload         4
       552: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
       555: aload_1
       556: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.tempInventoryDisable:()V
       559: aload_1
       560: new           #108                // class ext/mods/gameserver/network/serverpackets/WarehouseDepositList
       563: dup
       564: aload_1
       565: iconst_4
       566: invokespecial #110                // Method ext/mods/gameserver/network/serverpackets/WarehouseDepositList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
       569: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       572: goto          581
       575: aload_0
       576: aload_1
       577: aload_2
       578: invokespecial #212                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       581: return
      LineNumberTable:
        line 67: 0
        line 68: 23
        line 70: 24
        line 72: 31
        line 73: 38
        line 76: 39
        line 78: 43
        line 80: 52
        line 82: 60
        line 84: 70
        line 85: 77
        line 88: 78
        line 89: 91
        line 91: 101
        line 93: 110
        line 94: 117
        line 95: 125
        line 96: 129
        line 98: 145
        line 100: 154
        line 102: 164
        line 103: 171
        line 106: 172
        line 107: 177
        line 108: 181
        line 110: 182
        line 112: 189
        line 113: 196
        line 116: 197
        line 118: 208
        line 120: 218
        line 121: 225
        line 124: 226
        line 125: 239
        line 126: 246
        line 127: 249
        line 129: 258
        line 130: 263
        line 131: 267
        line 133: 268
        line 135: 275
        line 136: 282
        line 139: 283
        line 140: 294
        line 141: 298
        line 142: 311
        line 143: 318
        line 144: 321
        line 146: 330
        line 147: 336
        line 149: 337
        line 151: 344
        line 152: 349
        line 154: 360
        line 155: 367
        line 158: 368
        line 160: 389
        line 161: 394
        line 162: 407
        line 163: 410
        line 165: 419
        line 166: 425
        line 168: 426
        line 170: 433
        line 171: 438
        line 173: 447
        line 174: 454
        line 177: 455
        line 178: 465
        line 180: 466
        line 181: 478
        line 182: 481
        line 184: 490
        line 185: 496
        line 187: 497
        line 188: 510
        line 189: 520
        line 191: 542
        line 192: 549
        line 193: 555
        line 194: 559
        line 195: 572
        line 197: 575
        line 198: 581
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          177      69     3  clan   Lext/mods/gameserver/model/pledge/Clan;
          263      55     3  clan   Lext/mods/gameserver/model/pledge/Clan;
          349      58     3 freight   Lext/mods/gameserver/model/itemcontainer/PcFreight;
          438      40     3 chars   Ljava/util/Map;
          510      62     3    id   Ljava/lang/String;
          520      52     4 freight   Lext/mods/gameserver/model/itemcontainer/PcFreight;
            0     582     0  this   Lext/mods/gameserver/model/actor/instance/WarehouseKeeper;
            0     582     1 player   Lext/mods/gameserver/model/actor/Player;
            0     582     2 command   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          438      40     3 chars   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;
      StackMapTable: number_of_entries = 28
        frame_type = 24 /* same */
        frame_type = 14 /* same */
        frame_type = 38 /* same */
        frame_type = 22 /* same */
        frame_type = 43 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 14 /* same */
        frame_type = 28 /* same */
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 14 /* same */
        frame_type = 250 /* chop */
          offset_delta = 37
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/itemcontainer/PcFreight ]
        frame_type = 7 /* same */
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/itemcontainer/PcFreight ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/WarehouseKeeper, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/model/itemcontainer/PcFreight ]
          stack = [ class ext/mods/gameserver/model/itemcontainer/PcFreight, int ]
        frame_type = 250 /* chop */
          offset_delta = 23
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/Map ]
        frame_type = 10 /* same */
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/actor/instance/WarehouseKeeper, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/itemcontainer/PcFreight ]
          stack = [ class ext/mods/gameserver/model/itemcontainer/PcFreight ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/WarehouseKeeper, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/itemcontainer/PcFreight ]
          stack = [ class ext/mods/gameserver/model/itemcontainer/PcFreight, int ]
        frame_type = 249 /* chop */
          offset_delta = 35
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: getstatic     #19                 // Field ext/mods/Config.KARMA_PLAYER_CAN_USE_WH:Z
         3: ifne          24
         6: aload_1
         7: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        10: ifle          24
        13: aload_0
        14: aload_1
        15: ldc           #31                 // String warehouse
        17: invokevirtual #33                 // Method showPkDenyChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        20: ifeq          24
        23: return
        24: aload_0
        25: aload_1
        26: aload_0
        27: aload_1
        28: aload_0
        29: invokevirtual #216                // Method getNpcId:()I
        32: iload_2
        33: invokevirtual #219                // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        36: invokevirtual #223                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        39: return
      LineNumberTable:
        line 203: 0
        line 204: 23
        line 206: 24
        line 207: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/actor/instance/WarehouseKeeper;
            0      40     1 player   Lext/mods/gameserver/model/actor/Player;
            0      40     2   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */
}
SourceFile: "WarehouseKeeper.java"
BootstrapMethods:
  0: #262 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #256 \u0001
  1: #262 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #258 \u0001-\u0001
  2: #262 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #260 html/warehouse/\u0001.htm
InnerClasses:
  public static final #273= #269 of #271; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
