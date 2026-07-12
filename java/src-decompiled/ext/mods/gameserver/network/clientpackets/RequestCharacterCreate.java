// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestCharacterCreate
// File: ext\mods\gameserver\network\clientpackets\RequestCharacterCreate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestCharacterCreate.class
  Last modified 9 de jul de 2026; size 11547 bytes
  MD5 checksum 857a81f71dd5a2ae68c3134533ddf209
  Compiled from "RequestCharacterCreate.java"
public final class ext.mods.gameserver.network.clientpackets.RequestCharacterCreate extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 7, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate.readS:()Ljava/lang/String;
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate
    #9 = NameAndType        #11:#12       // readS:()Ljava/lang/String;
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestCharacterCreate
   #11 = Utf8               readS
   #12 = Utf8               ()Ljava/lang/String;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate._name:Ljava/lang/String;
   #14 = NameAndType        #15:#16       // _name:Ljava/lang/String;
   #15 = Utf8               _name
   #16 = Utf8               Ljava/lang/String;
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate.readD:()I
   #18 = NameAndType        #19:#20       // readD:()I
   #19 = Utf8               readD
   #20 = Utf8               ()I
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate._race:I
   #22 = NameAndType        #23:#24       // _race:I
   #23 = Utf8               _race
   #24 = Utf8               I
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate._sex:B
   #26 = NameAndType        #27:#28       // _sex:B
   #27 = Utf8               _sex
   #28 = Utf8               B
   #29 = Fieldref           #8.#30        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate._classId:I
   #30 = NameAndType        #31:#24       // _classId:I
   #31 = Utf8               _classId
   #32 = Fieldref           #8.#33        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate._hairStyle:B
   #33 = NameAndType        #34:#28       // _hairStyle:B
   #34 = Utf8               _hairStyle
   #35 = Fieldref           #8.#36        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate._hairColor:B
   #36 = NameAndType        #37:#28       // _hairColor:B
   #37 = Utf8               _hairColor
   #38 = Fieldref           #8.#39        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate._face:B
   #39 = NameAndType        #40:#28       // _face:B
   #40 = Utf8               _face
   #41 = Fieldref           #42.#43       // ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_CREATION_FAILED:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
   #42 = Class              #44           // ext/mods/gameserver/network/serverpackets/CharCreateFail
   #43 = NameAndType        #45:#46       // REASON_CREATION_FAILED:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
   #44 = Utf8               ext/mods/gameserver/network/serverpackets/CharCreateFail
   #45 = Utf8               REASON_CREATION_FAILED
   #46 = Utf8               Lext/mods/gameserver/network/serverpackets/CharCreateFail;
   #47 = Methodref          #8.#48        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #48 = NameAndType        #49:#50       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #49 = Utf8               sendPacket
   #50 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #51 = Fieldref           #52.#53       // ext/mods/Config.LIST_RESTRICTED_CHAR_NAMES:Ljava/util/List;
   #52 = Class              #54           // ext/mods/Config
   #53 = NameAndType        #55:#56       // LIST_RESTRICTED_CHAR_NAMES:Ljava/util/List;
   #54 = Utf8               ext/mods/Config
   #55 = Utf8               LIST_RESTRICTED_CHAR_NAMES
   #56 = Utf8               Ljava/util/List;
   #57 = Methodref          #58.#59       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #58 = Class              #60           // java/lang/String
   #59 = NameAndType        #61:#12       // toLowerCase:()Ljava/lang/String;
   #60 = Utf8               java/lang/String
   #61 = Utf8               toLowerCase
   #62 = InterfaceMethodref #63.#64       // java/util/List.contains:(Ljava/lang/Object;)Z
   #63 = Class              #65           // java/util/List
   #64 = NameAndType        #66:#67       // contains:(Ljava/lang/Object;)Z
   #65 = Utf8               java/util/List
   #66 = Utf8               contains
   #67 = Utf8               (Ljava/lang/Object;)Z
   #68 = Fieldref           #42.#69       // ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_INCORRECT_NAME:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
   #69 = NameAndType        #70:#46       // REASON_INCORRECT_NAME:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
   #70 = Utf8               REASON_INCORRECT_NAME
   #71 = Fieldref           #52.#72       // ext/mods/Config.CNAME_TEMPLATE:Ljava/lang/String;
   #72 = NameAndType        #73:#16       // CNAME_TEMPLATE:Ljava/lang/String;
   #73 = Utf8               CNAME_TEMPLATE
   #74 = Methodref          #75.#76       // ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
   #75 = Class              #77           // ext/mods/commons/lang/StringUtil
   #76 = NameAndType        #78:#79       // isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
   #77 = Utf8               ext/mods/commons/lang/StringUtil
   #78 = Utf8               isValidString
   #79 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Z
   #80 = Methodref          #81.#82       // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #81 = Class              #83           // ext/mods/gameserver/data/xml/NpcData
   #82 = NameAndType        #84:#85       // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #83 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #84 = Utf8               getInstance
   #85 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #86 = Methodref          #81.#87       // ext/mods/gameserver/data/xml/NpcData.getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #87 = NameAndType        #88:#89       // getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #88 = Utf8               getTemplateByName
   #89 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #90 = Methodref          #91.#92       // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #91 = Class              #93           // ext/mods/gameserver/data/sql/PlayerInfoTable
   #92 = NameAndType        #84:#94       // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #93 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
   #94 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #95 = Methodref          #8.#96        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #96 = NameAndType        #97:#98       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #97 = Utf8               getClient
   #98 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #99 = Class              #100          // ext/mods/gameserver/network/GameClient
  #100 = Utf8               ext/mods/gameserver/network/GameClient
  #101 = Methodref          #99.#102      // ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
  #102 = NameAndType        #103:#12      // getAccountName:()Ljava/lang/String;
  #103 = Utf8               getAccountName
  #104 = Methodref          #91.#105      // ext/mods/gameserver/data/sql/PlayerInfoTable.getCharactersInAcc:(Ljava/lang/String;)I
  #105 = NameAndType        #106:#107     // getCharactersInAcc:(Ljava/lang/String;)I
  #106 = Utf8               getCharactersInAcc
  #107 = Utf8               (Ljava/lang/String;)I
  #108 = Fieldref           #42.#109      // ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_TOO_MANY_CHARACTERS:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
  #109 = NameAndType        #110:#46      // REASON_TOO_MANY_CHARACTERS:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
  #110 = Utf8               REASON_TOO_MANY_CHARACTERS
  #111 = Methodref          #91.#112      // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
  #112 = NameAndType        #113:#107     // getPlayerObjectId:(Ljava/lang/String;)I
  #113 = Utf8               getPlayerObjectId
  #114 = Fieldref           #42.#115      // ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_NAME_ALREADY_EXISTS:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
  #115 = NameAndType        #116:#46      // REASON_NAME_ALREADY_EXISTS:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
  #116 = Utf8               REASON_NAME_ALREADY_EXISTS
  #117 = Methodref          #118.#119     // ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
  #118 = Class              #120          // ext/mods/gameserver/data/xml/PlayerData
  #119 = NameAndType        #84:#121      // getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
  #120 = Utf8               ext/mods/gameserver/data/xml/PlayerData
  #121 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerData;
  #122 = Methodref          #118.#123     // ext/mods/gameserver/data/xml/PlayerData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #123 = NameAndType        #124:#125     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #124 = Utf8               getTemplate
  #125 = Utf8               (I)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #126 = Methodref          #127.#128     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassBaseLevel:()I
  #127 = Class              #129          // ext/mods/gameserver/model/actor/template/PlayerTemplate
  #128 = NameAndType        #130:#20      // getClassBaseLevel:()I
  #129 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
  #130 = Utf8               getClassBaseLevel
  #131 = Methodref          #132.#133     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #132 = Class              #134          // ext/mods/gameserver/idfactory/IdFactory
  #133 = NameAndType        #84:#135      // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #134 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #135 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #136 = Methodref          #132.#137     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #137 = NameAndType        #138:#20      // getNextId:()I
  #138 = Utf8               getNextId
  #139 = Fieldref           #140.#141     // ext/mods/gameserver/enums/actors/Sex.VALUES:[Lext/mods/gameserver/enums/actors/Sex;
  #140 = Class              #142          // ext/mods/gameserver/enums/actors/Sex
  #141 = NameAndType        #143:#144     // VALUES:[Lext/mods/gameserver/enums/actors/Sex;
  #142 = Utf8               ext/mods/gameserver/enums/actors/Sex
  #143 = Utf8               VALUES
  #144 = Utf8               [Lext/mods/gameserver/enums/actors/Sex;
  #145 = Methodref          #146.#147     // ext/mods/gameserver/model/actor/Player.create:(ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Ljava/lang/String;BBBLext/mods/gameserver/enums/actors/Sex;)Lext/mods/gameserver/model/actor/Player;
  #146 = Class              #148          // ext/mods/gameserver/model/actor/Player
  #147 = NameAndType        #149:#150     // create:(ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Ljava/lang/String;BBBLext/mods/gameserver/enums/actors/Sex;)Lext/mods/gameserver/model/actor/Player;
  #148 = Utf8               ext/mods/gameserver/model/actor/Player
  #149 = Utf8               create
  #150 = Utf8               (ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Ljava/lang/String;BBBLext/mods/gameserver/enums/actors/Sex;)Lext/mods/gameserver/model/actor/Player;
  #151 = Methodref          #146.#152     // ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #152 = NameAndType        #124:#153     // getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #153 = Utf8               ()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #154 = Methodref          #127.#155     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getBuffIds:()[Ljava/lang/String;
  #155 = NameAndType        #156:#157     // getBuffIds:()[Ljava/lang/String;
  #156 = Utf8               getBuffIds
  #157 = Utf8               ()[Ljava/lang/String;
  #158 = String             #159          // -
  #159 = Utf8               -
  #160 = Methodref          #58.#161      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #161 = NameAndType        #162:#163     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #162 = Utf8               split
  #163 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #164 = Methodref          #165.#166     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #165 = Class              #167          // java/lang/Integer
  #166 = NameAndType        #168:#107     // parseInt:(Ljava/lang/String;)I
  #167 = Utf8               java/lang/Integer
  #168 = Utf8               parseInt
  #169 = Methodref          #170.#171     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #170 = Class              #172          // ext/mods/gameserver/data/SkillTable
  #171 = NameAndType        #84:#173      // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #172 = Utf8               ext/mods/gameserver/data/SkillTable
  #173 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #174 = Methodref          #170.#175     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #175 = NameAndType        #176:#177     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #176 = Utf8               getInfo
  #177 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #178 = Methodref          #179.#180     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #179 = Class              #181          // ext/mods/gameserver/skills/L2Skill
  #180 = NameAndType        #182:#183     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #181 = Utf8               ext/mods/gameserver/skills/L2Skill
  #182 = Utf8               getEffects
  #183 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #184 = Methodref          #146.#185     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #185 = NameAndType        #186:#187     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #186 = Utf8               getStatus
  #187 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #188 = Methodref          #189.#190     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxHpMp:()V
  #189 = Class              #191          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #190 = NameAndType        #192:#6       // setMaxHpMp:()V
  #191 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #192 = Utf8               setMaxHpMp
  #193 = Fieldref           #194.#195     // ext/mods/gameserver/network/serverpackets/CharCreateOk.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/CharCreateOk;
  #194 = Class              #196          // ext/mods/gameserver/network/serverpackets/CharCreateOk
  #195 = NameAndType        #197:#198     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/CharCreateOk;
  #196 = Utf8               ext/mods/gameserver/network/serverpackets/CharCreateOk
  #197 = Utf8               STATIC_PACKET
  #198 = Utf8               Lext/mods/gameserver/network/serverpackets/CharCreateOk;
  #199 = Methodref          #200.#201     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #200 = Class              #202          // ext/mods/gameserver/model/World
  #201 = NameAndType        #84:#203      // getInstance:()Lext/mods/gameserver/model/World;
  #202 = Utf8               ext/mods/gameserver/model/World
  #203 = Utf8               ()Lext/mods/gameserver/model/World;
  #204 = Methodref          #200.#205     // ext/mods/gameserver/model/World.addObject:(Lext/mods/gameserver/model/WorldObject;)V
  #205 = NameAndType        #206:#207     // addObject:(Lext/mods/gameserver/model/WorldObject;)V
  #206 = Utf8               addObject
  #207 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #208 = Methodref          #146.#209     // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #209 = NameAndType        #210:#211     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #210 = Utf8               getPosition
  #211 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #212 = Methodref          #127.#213     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getRandomSpawn:()Lext/mods/gameserver/model/location/Location;
  #213 = NameAndType        #214:#215     // getRandomSpawn:()Lext/mods/gameserver/model/location/Location;
  #214 = Utf8               getRandomSpawn
  #215 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #216 = Methodref          #217.#218     // ext/mods/gameserver/model/location/SpawnLocation.set:(Lext/mods/gameserver/model/location/Location;)V
  #217 = Class              #219          // ext/mods/gameserver/model/location/SpawnLocation
  #218 = NameAndType        #220:#221     // set:(Lext/mods/gameserver/model/location/Location;)V
  #219 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #220 = Utf8               set
  #221 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #222 = Methodref          #127.#223     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getTitle:()Ljava/lang/String;
  #223 = NameAndType        #224:#12      // getTitle:()Ljava/lang/String;
  #224 = Utf8               getTitle
  #225 = Methodref          #146.#226     // ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
  #226 = NameAndType        #227:#228     // setTitle:(Ljava/lang/String;)V
  #227 = Utf8               setTitle
  #228 = Utf8               (Ljava/lang/String;)V
  #229 = Methodref          #230.#231     // ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #230 = Class              #232          // ext/mods/gameserver/data/xml/PlayerLevelData
  #231 = NameAndType        #84:#233      // getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #232 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData
  #233 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #234 = Methodref          #127.#235     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getStartLevel:()I
  #235 = NameAndType        #236:#20      // getStartLevel:()I
  #236 = Utf8               getStartLevel
  #237 = Methodref          #230.#238     // ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
  #238 = NameAndType        #239:#240     // getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
  #239 = Utf8               getPlayerLevel
  #240 = Utf8               (I)Lext/mods/gameserver/model/records/PlayerLevel;
  #241 = Methodref          #242.#243     // ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
  #242 = Class              #244          // ext/mods/gameserver/model/records/PlayerLevel
  #243 = NameAndType        #245:#246     // requiredExpToLevelUp:()J
  #244 = Utf8               ext/mods/gameserver/model/records/PlayerLevel
  #245 = Utf8               requiredExpToLevelUp
  #246 = Utf8               ()J
  #247 = Methodref          #146.#248     // ext/mods/gameserver/model/actor/Player.addExpAndSp:(JI)V
  #248 = NameAndType        #249:#250     // addExpAndSp:(JI)V
  #249 = Utf8               addExpAndSp
  #250 = Utf8               (JI)V
  #251 = Methodref          #127.#252     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getMacros:()Ljava/util/List;
  #252 = NameAndType        #253:#254     // getMacros:()Ljava/util/List;
  #253 = Utf8               getMacros
  #254 = Utf8               ()Ljava/util/List;
  #255 = InterfaceMethodref #63.#256      // java/util/List.iterator:()Ljava/util/Iterator;
  #256 = NameAndType        #257:#258     // iterator:()Ljava/util/Iterator;
  #257 = Utf8               iterator
  #258 = Utf8               ()Ljava/util/Iterator;
  #259 = InterfaceMethodref #260.#261     // java/util/Iterator.hasNext:()Z
  #260 = Class              #262          // java/util/Iterator
  #261 = NameAndType        #263:#264     // hasNext:()Z
  #262 = Utf8               java/util/Iterator
  #263 = Utf8               hasNext
  #264 = Utf8               ()Z
  #265 = InterfaceMethodref #260.#266     // java/util/Iterator.next:()Ljava/lang/Object;
  #266 = NameAndType        #267:#268     // next:()Ljava/lang/Object;
  #267 = Utf8               next
  #268 = Utf8               ()Ljava/lang/Object;
  #269 = Class              #270          // ext/mods/gameserver/model/records/custom/Macros
  #270 = Utf8               ext/mods/gameserver/model/records/custom/Macros
  #271 = Class              #272          // java/util/ArrayList
  #272 = Utf8               java/util/ArrayList
  #273 = Methodref          #271.#3       // java/util/ArrayList."<init>":()V
  #274 = Class              #275          // ext/mods/gameserver/model/records/MacroCmd
  #275 = Utf8               ext/mods/gameserver/model/records/MacroCmd
  #276 = Methodref          #269.#277     // ext/mods/gameserver/model/records/custom/Macros.command:()Ljava/lang/String;
  #277 = NameAndType        #278:#12      // command:()Ljava/lang/String;
  #278 = Utf8               command
  #279 = Methodref          #274.#280     // ext/mods/gameserver/model/records/MacroCmd."<init>":(IIIILjava/lang/String;)V
  #280 = NameAndType        #5:#281       // "<init>":(IIIILjava/lang/String;)V
  #281 = Utf8               (IIIILjava/lang/String;)V
  #282 = InterfaceMethodref #63.#283      // java/util/List.add:(Ljava/lang/Object;)Z
  #283 = NameAndType        #284:#67      // add:(Ljava/lang/Object;)Z
  #284 = Utf8               add
  #285 = Class              #286          // ext/mods/gameserver/model/Macro
  #286 = Utf8               ext/mods/gameserver/model/Macro
  #287 = Methodref          #269.#288     // ext/mods/gameserver/model/records/custom/Macros.name:()Ljava/lang/String;
  #288 = NameAndType        #289:#12      // name:()Ljava/lang/String;
  #289 = Utf8               name
  #290 = Methodref          #269.#291     // ext/mods/gameserver/model/records/custom/Macros.action:()Ljava/lang/String;
  #291 = NameAndType        #292:#12      // action:()Ljava/lang/String;
  #292 = Utf8               action
  #293 = Methodref          #269.#294     // ext/mods/gameserver/model/records/custom/Macros.acronim:()Ljava/lang/String;
  #294 = NameAndType        #295:#12      // acronim:()Ljava/lang/String;
  #295 = Utf8               acronim
  #296 = InterfaceMethodref #63.#297      // java/util/List.size:()I
  #297 = NameAndType        #298:#20      // size:()I
  #298 = Utf8               size
  #299 = InterfaceMethodref #63.#300      // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #300 = NameAndType        #301:#302     // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #301 = Utf8               toArray
  #302 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
  #303 = Class              #304          // "[Lext/mods/gameserver/model/records/MacroCmd;"
  #304 = Utf8               [Lext/mods/gameserver/model/records/MacroCmd;
  #305 = Methodref          #285.#306     // ext/mods/gameserver/model/Macro."<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lext/mods/gameserver/model/records/MacroCmd;)V
  #306 = NameAndType        #5:#307       // "<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lext/mods/gameserver/model/records/MacroCmd;)V
  #307 = Utf8               (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lext/mods/gameserver/model/records/MacroCmd;)V
  #308 = Class              #309          // ext/mods/gameserver/model/Shortcut
  #309 = Utf8               ext/mods/gameserver/model/Shortcut
  #310 = Methodref          #269.#311     // ext/mods/gameserver/model/records/custom/Macros.slot:()I
  #311 = NameAndType        #312:#20      // slot:()I
  #312 = Utf8               slot
  #313 = Methodref          #269.#314     // ext/mods/gameserver/model/records/custom/Macros.panel:()I
  #314 = NameAndType        #315:#20      // panel:()I
  #315 = Utf8               panel
  #316 = Fieldref           #317.#318     // ext/mods/gameserver/enums/ShortcutType.MACRO:Lext/mods/gameserver/enums/ShortcutType;
  #317 = Class              #319          // ext/mods/gameserver/enums/ShortcutType
  #318 = NameAndType        #320:#321     // MACRO:Lext/mods/gameserver/enums/ShortcutType;
  #319 = Utf8               ext/mods/gameserver/enums/ShortcutType
  #320 = Utf8               MACRO
  #321 = Utf8               Lext/mods/gameserver/enums/ShortcutType;
  #322 = Methodref          #146.#323     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #323 = NameAndType        #324:#325     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #324 = Utf8               getClassId
  #325 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #326 = Methodref          #327.#328     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #327 = Class              #329          // ext/mods/gameserver/enums/actors/ClassId
  #328 = NameAndType        #330:#20      // getId:()I
  #329 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #330 = Utf8               getId
  #331 = Methodref          #308.#332     // ext/mods/gameserver/model/Shortcut."<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
  #332 = NameAndType        #5:#333       // "<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
  #333 = Utf8               (IILext/mods/gameserver/enums/ShortcutType;III)V
  #334 = Methodref          #146.#335     // ext/mods/gameserver/model/actor/Player.getMacroList:()Lext/mods/gameserver/model/actor/container/player/MacroList;
  #335 = NameAndType        #336:#337     // getMacroList:()Lext/mods/gameserver/model/actor/container/player/MacroList;
  #336 = Utf8               getMacroList
  #337 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MacroList;
  #338 = Methodref          #339.#340     // ext/mods/gameserver/model/actor/container/player/MacroList.registerMacro:(Lext/mods/gameserver/model/Macro;)V
  #339 = Class              #341          // ext/mods/gameserver/model/actor/container/player/MacroList
  #340 = NameAndType        #342:#343     // registerMacro:(Lext/mods/gameserver/model/Macro;)V
  #341 = Utf8               ext/mods/gameserver/model/actor/container/player/MacroList
  #342 = Utf8               registerMacro
  #343 = Utf8               (Lext/mods/gameserver/model/Macro;)V
  #344 = Class              #345          // ext/mods/gameserver/network/serverpackets/ShortCutRegister
  #345 = Utf8               ext/mods/gameserver/network/serverpackets/ShortCutRegister
  #346 = Methodref          #344.#347     // ext/mods/gameserver/network/serverpackets/ShortCutRegister."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Shortcut;)V
  #347 = NameAndType        #5:#348       // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Shortcut;)V
  #348 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Shortcut;)V
  #349 = Methodref          #146.#48      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #350 = Methodref          #146.#351     // ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
  #351 = NameAndType        #352:#353     // getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
  #352 = Utf8               getShortcutList
  #353 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
  #354 = Methodref          #355.#356     // ext/mods/gameserver/model/actor/container/player/ShortcutList.addShortcut:(Lext/mods/gameserver/model/Shortcut;)V
  #355 = Class              #357          // ext/mods/gameserver/model/actor/container/player/ShortcutList
  #356 = NameAndType        #358:#359     // addShortcut:(Lext/mods/gameserver/model/Shortcut;)V
  #357 = Utf8               ext/mods/gameserver/model/actor/container/player/ShortcutList
  #358 = Utf8               addShortcut
  #359 = Utf8               (Lext/mods/gameserver/model/Shortcut;)V
  #360 = Fieldref           #317.#361     // ext/mods/gameserver/enums/ShortcutType.ACTION:Lext/mods/gameserver/enums/ShortcutType;
  #361 = NameAndType        #362:#321     // ACTION:Lext/mods/gameserver/enums/ShortcutType;
  #362 = Utf8               ACTION
  #363 = Methodref          #127.#364     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getItems:()Ljava/util/List;
  #364 = NameAndType        #365:#254     // getItems:()Ljava/util/List;
  #365 = Utf8               getItems
  #366 = Class              #367          // ext/mods/gameserver/model/records/NewbieItem
  #367 = Utf8               ext/mods/gameserver/model/records/NewbieItem
  #368 = Methodref          #146.#369     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #369 = NameAndType        #370:#371     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #370 = Utf8               getInventory
  #371 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #372 = Methodref          #366.#373     // ext/mods/gameserver/model/records/NewbieItem.id:()I
  #373 = NameAndType        #374:#20      // id:()I
  #374 = Utf8               id
  #375 = Methodref          #366.#376     // ext/mods/gameserver/model/records/NewbieItem.count:()I
  #376 = NameAndType        #377:#20      // count:()I
  #377 = Utf8               count
  #378 = Methodref          #379.#380     // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #379 = Class              #381          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #380 = NameAndType        #382:#383     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #381 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #382 = Utf8               addItem
  #383 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #384 = Fieldref           #317.#385     // ext/mods/gameserver/enums/ShortcutType.ITEM:Lext/mods/gameserver/enums/ShortcutType;
  #385 = NameAndType        #386:#321     // ITEM:Lext/mods/gameserver/enums/ShortcutType;
  #386 = Utf8               ITEM
  #387 = Methodref          #388.#389     // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #388 = Class              #390          // ext/mods/gameserver/model/item/instance/ItemInstance
  #389 = NameAndType        #391:#20      // getObjectId:()I
  #390 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #391 = Utf8               getObjectId
  #392 = Methodref          #366.#393     // ext/mods/gameserver/model/records/NewbieItem.enchant:()I
  #393 = NameAndType        #394:#20      // enchant:()I
  #394 = Utf8               enchant
  #395 = Methodref          #388.#396     // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #396 = NameAndType        #397:#398     // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #397 = Utf8               setEnchantLevel
  #398 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #399 = Methodref          #388.#400     // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
  #400 = NameAndType        #401:#264     // isEquipable:()Z
  #401 = Utf8               isEquipable
  #402 = Methodref          #366.#403     // ext/mods/gameserver/model/records/NewbieItem.isEquipped:()Z
  #403 = NameAndType        #404:#264     // isEquipped:()Z
  #404 = Utf8               isEquipped
  #405 = Methodref          #379.#406     // ext/mods/gameserver/model/itemcontainer/PcInventory.equipItemAndRecord:(Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #406 = NameAndType        #407:#408     // equipItemAndRecord:(Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #407 = Utf8               equipItemAndRecord
  #408 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #409 = Methodref          #146.#410     // ext/mods/gameserver/model/actor/Player.getAvailableAutoGetSkills:()Ljava/util/List;
  #410 = NameAndType        #411:#254     // getAvailableAutoGetSkills:()Ljava/util/List;
  #411 = Utf8               getAvailableAutoGetSkills
  #412 = Class              #413          // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
  #413 = Utf8               ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
  #414 = Methodref          #412.#328     // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getId:()I
  #415 = Fieldref           #317.#416     // ext/mods/gameserver/enums/ShortcutType.SKILL:Lext/mods/gameserver/enums/ShortcutType;
  #416 = NameAndType        #417:#321     // SKILL:Lext/mods/gameserver/enums/ShortcutType;
  #417 = Utf8               SKILL
  #418 = Methodref          #355.#419     // ext/mods/gameserver/model/actor/container/player/ShortcutList.addShortcut:(Lext/mods/gameserver/model/Shortcut;ZZ)V
  #419 = NameAndType        #358:#420     // addShortcut:(Lext/mods/gameserver/model/Shortcut;ZZ)V
  #420 = Utf8               (Lext/mods/gameserver/model/Shortcut;ZZ)V
  #421 = Methodref          #422.#423     // ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
  #422 = Class              #424          // ext/mods/gameserver/data/xml/ScriptData
  #423 = NameAndType        #84:#425      // getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
  #424 = Utf8               ext/mods/gameserver/data/xml/ScriptData
  #425 = Utf8               ()Lext/mods/gameserver/data/xml/ScriptData;
  #426 = String             #427          // Tutorial
  #427 = Utf8               Tutorial
  #428 = Methodref          #422.#429     // ext/mods/gameserver/data/xml/ScriptData.getQuest:(Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
  #429 = NameAndType        #430:#431     // getQuest:(Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
  #430 = Utf8               getQuest
  #431 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
  #432 = Methodref          #433.#434     // ext/mods/gameserver/scripting/Quest.newQuestState:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/scripting/QuestState;
  #433 = Class              #435          // ext/mods/gameserver/scripting/Quest
  #434 = NameAndType        #436:#437     // newQuestState:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/scripting/QuestState;
  #435 = Utf8               ext/mods/gameserver/scripting/Quest
  #436 = Utf8               newQuestState
  #437 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/scripting/QuestState;
  #438 = Fieldref           #439.#440     // ext/mods/gameserver/enums/QuestStatus.STARTED:Lext/mods/gameserver/enums/QuestStatus;
  #439 = Class              #441          // ext/mods/gameserver/enums/QuestStatus
  #440 = NameAndType        #442:#443     // STARTED:Lext/mods/gameserver/enums/QuestStatus;
  #441 = Utf8               ext/mods/gameserver/enums/QuestStatus
  #442 = Utf8               STARTED
  #443 = Utf8               Lext/mods/gameserver/enums/QuestStatus;
  #444 = Methodref          #445.#446     // ext/mods/gameserver/scripting/QuestState.setState:(Lext/mods/gameserver/enums/QuestStatus;)V
  #445 = Class              #447          // ext/mods/gameserver/scripting/QuestState
  #446 = NameAndType        #448:#449     // setState:(Lext/mods/gameserver/enums/QuestStatus;)V
  #447 = Utf8               ext/mods/gameserver/scripting/QuestState
  #448 = Utf8               setState
  #449 = Utf8               (Lext/mods/gameserver/enums/QuestStatus;)V
  #450 = Methodref          #451.#452     // ext/mods/quests/QuestData.getInstance:()Lext/mods/quests/QuestData;
  #451 = Class              #453          // ext/mods/quests/QuestData
  #452 = NameAndType        #84:#454      // getInstance:()Lext/mods/quests/QuestData;
  #453 = Utf8               ext/mods/quests/QuestData
  #454 = Utf8               ()Lext/mods/quests/QuestData;
  #455 = Methodref          #451.#456     // ext/mods/quests/QuestData.getQuests:()Ljava/util/Collection;
  #456 = NameAndType        #457:#458     // getQuests:()Ljava/util/Collection;
  #457 = Utf8               getQuests
  #458 = Utf8               ()Ljava/util/Collection;
  #459 = InterfaceMethodref #460.#461     // java/util/Collection.isEmpty:()Z
  #460 = Class              #462          // java/util/Collection
  #461 = NameAndType        #463:#264     // isEmpty:()Z
  #462 = Utf8               java/util/Collection
  #463 = Utf8               isEmpty
  #464 = Methodref          #146.#465     // ext/mods/gameserver/model/actor/Player.setQuestCompleted:(IZ)V
  #465 = NameAndType        #466:#467     // setQuestCompleted:(IZ)V
  #466 = Utf8               setQuestCompleted
  #467 = Utf8               (IZ)V
  #468 = Methodref          #146.#469     // ext/mods/gameserver/model/actor/Player.setQuestNotifyHtml:(Z)V
  #469 = NameAndType        #470:#471     // setQuestNotifyHtml:(Z)V
  #470 = Utf8               setQuestNotifyHtml
  #471 = Utf8               (Z)V
  #472 = Methodref          #146.#473     // ext/mods/gameserver/model/actor/Player.setQuestNotifyChat:(Z)V
  #473 = NameAndType        #474:#471     // setQuestNotifyChat:(Z)V
  #474 = Utf8               setQuestNotifyChat
  #475 = Methodref          #146.#476     // ext/mods/gameserver/model/actor/Player.setOnlineStatus:(ZZ)V
  #476 = NameAndType        #477:#478     // setOnlineStatus:(ZZ)V
  #477 = Utf8               setOnlineStatus
  #478 = Utf8               (ZZ)V
  #479 = Methodref          #146.#480     // ext/mods/gameserver/model/actor/Player.deleteMe:()V
  #480 = NameAndType        #481:#6       // deleteMe:()V
  #481 = Utf8               deleteMe
  #482 = Class              #483          // ext/mods/gameserver/network/serverpackets/CharSelectInfo
  #483 = Utf8               ext/mods/gameserver/network/serverpackets/CharSelectInfo
  #484 = Methodref          #99.#485      // ext/mods/gameserver/network/GameClient.getSessionId:()Lext/mods/gameserver/network/SessionKey;
  #485 = NameAndType        #486:#487     // getSessionId:()Lext/mods/gameserver/network/SessionKey;
  #486 = Utf8               getSessionId
  #487 = Utf8               ()Lext/mods/gameserver/network/SessionKey;
  #488 = Fieldref           #489.#490     // ext/mods/gameserver/network/SessionKey.playOkID1:I
  #489 = Class              #491          // ext/mods/gameserver/network/SessionKey
  #490 = NameAndType        #492:#24      // playOkID1:I
  #491 = Utf8               ext/mods/gameserver/network/SessionKey
  #492 = Utf8               playOkID1
  #493 = Methodref          #482.#494     // ext/mods/gameserver/network/serverpackets/CharSelectInfo."<init>":(Ljava/lang/String;I)V
  #494 = NameAndType        #5:#495       // "<init>":(Ljava/lang/String;I)V
  #495 = Utf8               (Ljava/lang/String;I)V
  #496 = Methodref          #482.#497     // ext/mods/gameserver/network/serverpackets/CharSelectInfo.getCharacterSlots:()[Lext/mods/gameserver/model/CharSelectSlot;
  #497 = NameAndType        #498:#499     // getCharacterSlots:()[Lext/mods/gameserver/model/CharSelectSlot;
  #498 = Utf8               getCharacterSlots
  #499 = Utf8               ()[Lext/mods/gameserver/model/CharSelectSlot;
  #500 = Methodref          #99.#501      // ext/mods/gameserver/network/GameClient.setCharSelectSlot:([Lext/mods/gameserver/model/CharSelectSlot;)V
  #501 = NameAndType        #502:#503     // setCharSelectSlot:([Lext/mods/gameserver/model/CharSelectSlot;)V
  #502 = Utf8               setCharSelectSlot
  #503 = Utf8               ([Lext/mods/gameserver/model/CharSelectSlot;)V
  #504 = Utf8               Code
  #505 = Utf8               LineNumberTable
  #506 = Utf8               LocalVariableTable
  #507 = Utf8               this
  #508 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestCharacterCreate;
  #509 = Utf8               readImpl
  #510 = Utf8               runImpl
  #511 = Utf8               parts
  #512 = Utf8               [Ljava/lang/String;
  #513 = Utf8               skillId
  #514 = Utf8               skillLevel
  #515 = Utf8               skill
  #516 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #517 = Utf8               buff
  #518 = Utf8               commands
  #519 = Utf8               macros
  #520 = Utf8               shortcuts
  #521 = Utf8               cmd
  #522 = Utf8               Lext/mods/gameserver/model/records/MacroCmd;
  #523 = Utf8               m
  #524 = Utf8               Lext/mods/gameserver/model/Macro;
  #525 = Utf8               shortcut
  #526 = Utf8               Lext/mods/gameserver/model/Shortcut;
  #527 = Utf8               macro
  #528 = Utf8               Lext/mods/gameserver/model/records/custom/Macros;
  #529 = Utf8               item
  #530 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #531 = Utf8               holder
  #532 = Utf8               Lext/mods/gameserver/model/records/NewbieItem;
  #533 = Utf8               Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
  #534 = Utf8               template
  #535 = Utf8               Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #536 = Utf8               player
  #537 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #538 = Utf8               i
  #539 = Utf8               quest
  #540 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #541 = Utf8               tutorial
  #542 = Utf8               Ljava/util/Collection;
  #543 = Utf8               csi
  #544 = Utf8               Lext/mods/gameserver/network/serverpackets/CharSelectInfo;
  #545 = Utf8               LocalVariableTypeTable
  #546 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/MacroCmd;>;
  #547 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/Macro;>;
  #548 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/Shortcut;>;
  #549 = Utf8               Ljava/util/Collection<Lext/mods/quests/holder/QuestHolder;>;
  #550 = Utf8               StackMapTable
  #551 = Class              #512          // "[Ljava/lang/String;"
  #552 = Utf8               SourceFile
  #553 = Utf8               RequestCharacterCreate.java
{
  public ext.mods.gameserver.network.clientpackets.RequestCharacterCreate();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestCharacterCreate;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readS:()Ljava/lang/String;
         5: putfield      #13                 // Field _name:Ljava/lang/String;
         8: aload_0
         9: aload_0
        10: invokevirtual #17                 // Method readD:()I
        13: putfield      #21                 // Field _race:I
        16: aload_0
        17: aload_0
        18: invokevirtual #17                 // Method readD:()I
        21: i2b
        22: putfield      #25                 // Field _sex:B
        25: aload_0
        26: aload_0
        27: invokevirtual #17                 // Method readD:()I
        30: putfield      #29                 // Field _classId:I
        33: aload_0
        34: invokevirtual #17                 // Method readD:()I
        37: pop
        38: aload_0
        39: invokevirtual #17                 // Method readD:()I
        42: pop
        43: aload_0
        44: invokevirtual #17                 // Method readD:()I
        47: pop
        48: aload_0
        49: invokevirtual #17                 // Method readD:()I
        52: pop
        53: aload_0
        54: invokevirtual #17                 // Method readD:()I
        57: pop
        58: aload_0
        59: invokevirtual #17                 // Method readD:()I
        62: pop
        63: aload_0
        64: aload_0
        65: invokevirtual #17                 // Method readD:()I
        68: i2b
        69: putfield      #32                 // Field _hairStyle:B
        72: aload_0
        73: aload_0
        74: invokevirtual #17                 // Method readD:()I
        77: i2b
        78: putfield      #35                 // Field _hairColor:B
        81: aload_0
        82: aload_0
        83: invokevirtual #17                 // Method readD:()I
        86: i2b
        87: putfield      #38                 // Field _face:B
        90: return
      LineNumberTable:
        line 68: 0
        line 69: 8
        line 70: 16
        line 71: 25
        line 72: 33
        line 73: 38
        line 74: 43
        line 75: 48
        line 76: 53
        line 77: 58
        line 78: 63
        line 79: 72
        line 80: 81
        line 81: 90
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      91     0  this   Lext/mods/gameserver/network/clientpackets/RequestCharacterCreate;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=9, locals=12, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _race:I
         4: iconst_4
         5: if_icmpgt     15
         8: aload_0
         9: getfield      #21                 // Field _race:I
        12: ifge          23
        15: aload_0
        16: getstatic     #41                 // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_CREATION_FAILED:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
        19: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        22: return
        23: aload_0
        24: getfield      #38                 // Field _face:B
        27: iconst_2
        28: if_icmpgt     38
        31: aload_0
        32: getfield      #38                 // Field _face:B
        35: ifge          46
        38: aload_0
        39: getstatic     #41                 // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_CREATION_FAILED:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
        42: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        45: return
        46: aload_0
        47: getfield      #32                 // Field _hairStyle:B
        50: iflt          84
        53: aload_0
        54: getfield      #25                 // Field _sex:B
        57: ifne          68
        60: aload_0
        61: getfield      #32                 // Field _hairStyle:B
        64: iconst_4
        65: if_icmpgt     84
        68: aload_0
        69: getfield      #25                 // Field _sex:B
        72: ifeq          92
        75: aload_0
        76: getfield      #32                 // Field _hairStyle:B
        79: bipush        6
        81: if_icmple     92
        84: aload_0
        85: getstatic     #41                 // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_CREATION_FAILED:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
        88: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        91: return
        92: aload_0
        93: getfield      #35                 // Field _hairColor:B
        96: iconst_3
        97: if_icmpgt     107
       100: aload_0
       101: getfield      #35                 // Field _hairColor:B
       104: ifge          115
       107: aload_0
       108: getstatic     #41                 // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_CREATION_FAILED:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
       111: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       114: return
       115: getstatic     #51                 // Field ext/mods/Config.LIST_RESTRICTED_CHAR_NAMES:Ljava/util/List;
       118: aload_0
       119: getfield      #13                 // Field _name:Ljava/lang/String;
       122: invokevirtual #57                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       125: invokeinterface #62,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       130: ifeq          141
       133: aload_0
       134: getstatic     #68                 // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_INCORRECT_NAME:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
       137: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       140: return
       141: aload_0
       142: getfield      #13                 // Field _name:Ljava/lang/String;
       145: getstatic     #71                 // Field ext/mods/Config.CNAME_TEMPLATE:Ljava/lang/String;
       148: invokestatic  #74                 // Method ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
       151: ifne          162
       154: aload_0
       155: getstatic     #68                 // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_INCORRECT_NAME:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
       158: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       161: return
       162: invokestatic  #80                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
       165: aload_0
       166: getfield      #13                 // Field _name:Ljava/lang/String;
       169: invokevirtual #86                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
       172: ifnull        183
       175: aload_0
       176: getstatic     #68                 // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_INCORRECT_NAME:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
       179: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       182: return
       183: invokestatic  #90                 // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
       186: aload_0
       187: invokevirtual #95                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
       190: checkcast     #99                 // class ext/mods/gameserver/network/GameClient
       193: invokevirtual #101                // Method ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
       196: invokevirtual #104                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getCharactersInAcc:(Ljava/lang/String;)I
       199: bipush        7
       201: if_icmplt     212
       204: aload_0
       205: getstatic     #108                // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_TOO_MANY_CHARACTERS:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
       208: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       211: return
       212: invokestatic  #90                 // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
       215: aload_0
       216: getfield      #13                 // Field _name:Ljava/lang/String;
       219: invokevirtual #111                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
       222: ifle          233
       225: aload_0
       226: getstatic     #114                // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_NAME_ALREADY_EXISTS:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
       229: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       232: return
       233: invokestatic  #117                // Method ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
       236: aload_0
       237: getfield      #29                 // Field _classId:I
       240: invokevirtual #122                // Method ext/mods/gameserver/data/xml/PlayerData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
       243: astore_1
       244: aload_1
       245: ifnull        256
       248: aload_1
       249: invokevirtual #126                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassBaseLevel:()I
       252: iconst_1
       253: if_icmple     264
       256: aload_0
       257: getstatic     #41                 // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_CREATION_FAILED:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
       260: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       263: return
       264: invokestatic  #131                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       267: invokevirtual #136                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
       270: aload_1
       271: aload_0
       272: invokevirtual #95                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
       275: checkcast     #99                 // class ext/mods/gameserver/network/GameClient
       278: invokevirtual #101                // Method ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
       281: aload_0
       282: getfield      #13                 // Field _name:Ljava/lang/String;
       285: aload_0
       286: getfield      #32                 // Field _hairStyle:B
       289: aload_0
       290: getfield      #35                 // Field _hairColor:B
       293: aload_0
       294: getfield      #38                 // Field _face:B
       297: getstatic     #139                // Field ext/mods/gameserver/enums/actors/Sex.VALUES:[Lext/mods/gameserver/enums/actors/Sex;
       300: aload_0
       301: getfield      #25                 // Field _sex:B
       304: aaload
       305: invokestatic  #145                // Method ext/mods/gameserver/model/actor/Player.create:(ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Ljava/lang/String;BBBLext/mods/gameserver/enums/actors/Sex;)Lext/mods/gameserver/model/actor/Player;
       308: astore_2
       309: aload_2
       310: ifnonnull     321
       313: aload_0
       314: getstatic     #41                 // Field ext/mods/gameserver/network/serverpackets/CharCreateFail.REASON_CREATION_FAILED:Lext/mods/gameserver/network/serverpackets/CharCreateFail;
       317: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       320: return
       321: aload_2
       322: invokevirtual #151                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
       325: invokevirtual #154                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getBuffIds:()[Ljava/lang/String;
       328: astore_3
       329: aload_3
       330: arraylength
       331: istore        4
       333: iconst_0
       334: istore        5
       336: iload         5
       338: iload         4
       340: if_icmpge     407
       343: aload_3
       344: iload         5
       346: aaload
       347: astore        6
       349: aload         6
       351: ldc           #158                // String -
       353: invokevirtual #160                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       356: astore        7
       358: aload         7
       360: iconst_0
       361: aaload
       362: invokestatic  #164                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       365: istore        8
       367: aload         7
       369: iconst_1
       370: aaload
       371: invokestatic  #164                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       374: istore        9
       376: invokestatic  #169                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       379: iload         8
       381: iload         9
       383: invokevirtual #174                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       386: astore        10
       388: aload         10
       390: ifnull        401
       393: aload         10
       395: aload_2
       396: aload_2
       397: invokevirtual #178                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       400: pop
       401: iinc          5, 1
       404: goto          336
       407: aload_2
       408: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       411: invokevirtual #188                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxHpMp:()V
       414: aload_0
       415: getstatic     #193                // Field ext/mods/gameserver/network/serverpackets/CharCreateOk.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/CharCreateOk;
       418: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       421: invokestatic  #199                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       424: aload_2
       425: invokevirtual #204                // Method ext/mods/gameserver/model/World.addObject:(Lext/mods/gameserver/model/WorldObject;)V
       428: aload_2
       429: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       432: aload_1
       433: invokevirtual #212                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getRandomSpawn:()Lext/mods/gameserver/model/location/Location;
       436: invokevirtual #216                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(Lext/mods/gameserver/model/location/Location;)V
       439: aload_2
       440: aload_1
       441: invokevirtual #222                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getTitle:()Ljava/lang/String;
       444: invokevirtual #225                // Method ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
       447: aload_2
       448: invokestatic  #229                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
       451: aload_1
       452: invokevirtual #234                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getStartLevel:()I
       455: invokevirtual #237                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
       458: invokevirtual #241                // Method ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
       461: iconst_0
       462: invokevirtual #247                // Method ext/mods/gameserver/model/actor/Player.addExpAndSp:(JI)V
       465: iconst_0
       466: istore_3
       467: aload_1
       468: invokevirtual #251                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getMacros:()Ljava/util/List;
       471: invokeinterface #255,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       476: astore        4
       478: aload         4
       480: invokeinterface #259,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       485: ifeq          696
       488: aload         4
       490: invokeinterface #265,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       495: checkcast     #269                // class ext/mods/gameserver/model/records/custom/Macros
       498: astore        5
       500: new           #271                // class java/util/ArrayList
       503: dup
       504: invokespecial #273                // Method java/util/ArrayList."<init>":()V
       507: astore        6
       509: new           #271                // class java/util/ArrayList
       512: dup
       513: invokespecial #273                // Method java/util/ArrayList."<init>":()V
       516: astore        7
       518: new           #271                // class java/util/ArrayList
       521: dup
       522: invokespecial #273                // Method java/util/ArrayList."<init>":()V
       525: astore        8
       527: new           #274                // class ext/mods/gameserver/model/records/MacroCmd
       530: dup
       531: iconst_1
       532: iconst_3
       533: iconst_0
       534: iconst_0
       535: aload         5
       537: invokevirtual #276                // Method ext/mods/gameserver/model/records/custom/Macros.command:()Ljava/lang/String;
       540: invokespecial #279                // Method ext/mods/gameserver/model/records/MacroCmd."<init>":(IIIILjava/lang/String;)V
       543: astore        9
       545: aload         6
       547: aload         9
       549: invokeinterface #282,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       554: pop
       555: new           #285                // class ext/mods/gameserver/model/Macro
       558: dup
       559: bipush        100
       561: iload_3
       562: iadd
       563: iconst_0
       564: aload         5
       566: invokevirtual #287                // Method ext/mods/gameserver/model/records/custom/Macros.name:()Ljava/lang/String;
       569: aload         5
       571: invokevirtual #290                // Method ext/mods/gameserver/model/records/custom/Macros.action:()Ljava/lang/String;
       574: aload         5
       576: invokevirtual #293                // Method ext/mods/gameserver/model/records/custom/Macros.acronim:()Ljava/lang/String;
       579: aload         6
       581: aload         6
       583: invokeinterface #296,  1          // InterfaceMethod java/util/List.size:()I
       588: anewarray     #274                // class ext/mods/gameserver/model/records/MacroCmd
       591: invokeinterface #299,  2          // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       596: checkcast     #303                // class "[Lext/mods/gameserver/model/records/MacroCmd;"
       599: invokespecial #305                // Method ext/mods/gameserver/model/Macro."<init>":(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lext/mods/gameserver/model/records/MacroCmd;)V
       602: astore        10
       604: aload         7
       606: aload         10
       608: invokeinterface #282,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       613: pop
       614: new           #308                // class ext/mods/gameserver/model/Shortcut
       617: dup
       618: aload         5
       620: invokevirtual #310                // Method ext/mods/gameserver/model/records/custom/Macros.slot:()I
       623: aload         5
       625: invokevirtual #313                // Method ext/mods/gameserver/model/records/custom/Macros.panel:()I
       628: getstatic     #316                // Field ext/mods/gameserver/enums/ShortcutType.MACRO:Lext/mods/gameserver/enums/ShortcutType;
       631: bipush        100
       633: iload_3
       634: iadd
       635: iconst_0
       636: aload_2
       637: invokevirtual #322                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       640: invokevirtual #326                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
       643: invokespecial #331                // Method ext/mods/gameserver/model/Shortcut."<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
       646: astore        11
       648: aload         8
       650: aload         11
       652: invokeinterface #282,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       657: pop
       658: aload_2
       659: invokevirtual #334                // Method ext/mods/gameserver/model/actor/Player.getMacroList:()Lext/mods/gameserver/model/actor/container/player/MacroList;
       662: aload         10
       664: invokevirtual #338                // Method ext/mods/gameserver/model/actor/container/player/MacroList.registerMacro:(Lext/mods/gameserver/model/Macro;)V
       667: aload_2
       668: new           #344                // class ext/mods/gameserver/network/serverpackets/ShortCutRegister
       671: dup
       672: aload_2
       673: aload         11
       675: invokespecial #346                // Method ext/mods/gameserver/network/serverpackets/ShortCutRegister."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Shortcut;)V
       678: invokevirtual #349                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       681: aload_2
       682: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
       685: aload         11
       687: invokevirtual #354                // Method ext/mods/gameserver/model/actor/container/player/ShortcutList.addShortcut:(Lext/mods/gameserver/model/Shortcut;)V
       690: iinc          3, 1
       693: goto          478
       696: aload_2
       697: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
       700: new           #308                // class ext/mods/gameserver/model/Shortcut
       703: dup
       704: iconst_0
       705: iconst_0
       706: getstatic     #360                // Field ext/mods/gameserver/enums/ShortcutType.ACTION:Lext/mods/gameserver/enums/ShortcutType;
       709: iconst_2
       710: iconst_m1
       711: iconst_1
       712: invokespecial #331                // Method ext/mods/gameserver/model/Shortcut."<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
       715: invokevirtual #354                // Method ext/mods/gameserver/model/actor/container/player/ShortcutList.addShortcut:(Lext/mods/gameserver/model/Shortcut;)V
       718: aload_2
       719: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
       722: new           #308                // class ext/mods/gameserver/model/Shortcut
       725: dup
       726: iconst_3
       727: iconst_0
       728: getstatic     #360                // Field ext/mods/gameserver/enums/ShortcutType.ACTION:Lext/mods/gameserver/enums/ShortcutType;
       731: iconst_5
       732: iconst_m1
       733: iconst_1
       734: invokespecial #331                // Method ext/mods/gameserver/model/Shortcut."<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
       737: invokevirtual #354                // Method ext/mods/gameserver/model/actor/container/player/ShortcutList.addShortcut:(Lext/mods/gameserver/model/Shortcut;)V
       740: aload_2
       741: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
       744: new           #308                // class ext/mods/gameserver/model/Shortcut
       747: dup
       748: bipush        10
       750: iconst_0
       751: getstatic     #360                // Field ext/mods/gameserver/enums/ShortcutType.ACTION:Lext/mods/gameserver/enums/ShortcutType;
       754: iconst_0
       755: iconst_m1
       756: iconst_1
       757: invokespecial #331                // Method ext/mods/gameserver/model/Shortcut."<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
       760: invokevirtual #354                // Method ext/mods/gameserver/model/actor/container/player/ShortcutList.addShortcut:(Lext/mods/gameserver/model/Shortcut;)V
       763: aload_1
       764: invokevirtual #363                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getItems:()Ljava/util/List;
       767: invokeinterface #255,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       772: astore        4
       774: aload         4
       776: invokeinterface #259,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       781: ifeq          893
       784: aload         4
       786: invokeinterface #265,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       791: checkcast     #366                // class ext/mods/gameserver/model/records/NewbieItem
       794: astore        5
       796: aload_2
       797: invokevirtual #368                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       800: aload         5
       802: invokevirtual #372                // Method ext/mods/gameserver/model/records/NewbieItem.id:()I
       805: aload         5
       807: invokevirtual #375                // Method ext/mods/gameserver/model/records/NewbieItem.count:()I
       810: invokevirtual #378                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       813: astore        6
       815: aload         5
       817: invokevirtual #372                // Method ext/mods/gameserver/model/records/NewbieItem.id:()I
       820: sipush        5588
       823: if_icmpne     853
       826: aload_2
       827: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
       830: new           #308                // class ext/mods/gameserver/model/Shortcut
       833: dup
       834: bipush        11
       836: iconst_0
       837: getstatic     #384                // Field ext/mods/gameserver/enums/ShortcutType.ITEM:Lext/mods/gameserver/enums/ShortcutType;
       840: aload         6
       842: invokevirtual #387                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       845: iconst_m1
       846: iconst_1
       847: invokespecial #331                // Method ext/mods/gameserver/model/Shortcut."<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
       850: invokevirtual #354                // Method ext/mods/gameserver/model/actor/container/player/ShortcutList.addShortcut:(Lext/mods/gameserver/model/Shortcut;)V
       853: aload         6
       855: aload         5
       857: invokevirtual #392                // Method ext/mods/gameserver/model/records/NewbieItem.enchant:()I
       860: aconst_null
       861: invokevirtual #395                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       864: aload         6
       866: invokevirtual #399                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
       869: ifeq          890
       872: aload         5
       874: invokevirtual #402                // Method ext/mods/gameserver/model/records/NewbieItem.isEquipped:()Z
       877: ifeq          890
       880: aload_2
       881: invokevirtual #368                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       884: aload         6
       886: invokevirtual #405                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.equipItemAndRecord:(Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
       889: pop
       890: goto          774
       893: aload_2
       894: invokevirtual #409                // Method ext/mods/gameserver/model/actor/Player.getAvailableAutoGetSkills:()Ljava/util/List;
       897: invokeinterface #255,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       902: astore        4
       904: aload         4
       906: invokeinterface #259,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       911: ifeq          1019
       914: aload         4
       916: invokeinterface #265,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       921: checkcast     #412                // class ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
       924: astore        5
       926: aload         5
       928: invokevirtual #414                // Method ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getId:()I
       931: sipush        1001
       934: if_icmpeq     948
       937: aload         5
       939: invokevirtual #414                // Method ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getId:()I
       942: sipush        1177
       945: if_icmpne     976
       948: aload_2
       949: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
       952: new           #308                // class ext/mods/gameserver/model/Shortcut
       955: dup
       956: iconst_1
       957: iconst_0
       958: getstatic     #415                // Field ext/mods/gameserver/enums/ShortcutType.SKILL:Lext/mods/gameserver/enums/ShortcutType;
       961: aload         5
       963: invokevirtual #414                // Method ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getId:()I
       966: iconst_1
       967: iconst_1
       968: invokespecial #331                // Method ext/mods/gameserver/model/Shortcut."<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
       971: iconst_0
       972: iconst_1
       973: invokevirtual #418                // Method ext/mods/gameserver/model/actor/container/player/ShortcutList.addShortcut:(Lext/mods/gameserver/model/Shortcut;ZZ)V
       976: aload         5
       978: invokevirtual #414                // Method ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getId:()I
       981: sipush        1216
       984: if_icmpne     1016
       987: aload_2
       988: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
       991: new           #308                // class ext/mods/gameserver/model/Shortcut
       994: dup
       995: bipush        9
       997: iconst_0
       998: getstatic     #415                // Field ext/mods/gameserver/enums/ShortcutType.SKILL:Lext/mods/gameserver/enums/ShortcutType;
      1001: aload         5
      1003: invokevirtual #414                // Method ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getId:()I
      1006: iconst_1
      1007: iconst_1
      1008: invokespecial #331                // Method ext/mods/gameserver/model/Shortcut."<init>":(IILext/mods/gameserver/enums/ShortcutType;III)V
      1011: iconst_0
      1012: iconst_1
      1013: invokevirtual #418                // Method ext/mods/gameserver/model/actor/container/player/ShortcutList.addShortcut:(Lext/mods/gameserver/model/Shortcut;ZZ)V
      1016: goto          904
      1019: invokestatic  #421                // Method ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
      1022: ldc_w         #426                // String Tutorial
      1025: invokevirtual #428                // Method ext/mods/gameserver/data/xml/ScriptData.getQuest:(Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
      1028: astore        4
      1030: aload         4
      1032: ifnull        1047
      1035: aload         4
      1037: aload_2
      1038: invokevirtual #432                // Method ext/mods/gameserver/scripting/Quest.newQuestState:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/scripting/QuestState;
      1041: getstatic     #438                // Field ext/mods/gameserver/enums/QuestStatus.STARTED:Lext/mods/gameserver/enums/QuestStatus;
      1044: invokevirtual #444                // Method ext/mods/gameserver/scripting/QuestState.setState:(Lext/mods/gameserver/enums/QuestStatus;)V
      1047: invokestatic  #450                // Method ext/mods/quests/QuestData.getInstance:()Lext/mods/quests/QuestData;
      1050: invokevirtual #455                // Method ext/mods/quests/QuestData.getQuests:()Ljava/util/Collection;
      1053: astore        5
      1055: aload         5
      1057: invokeinterface #459,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
      1062: ifne          1071
      1065: aload_2
      1066: iconst_1
      1067: iconst_0
      1068: invokevirtual #464                // Method ext/mods/gameserver/model/actor/Player.setQuestCompleted:(IZ)V
      1071: aload_2
      1072: iconst_0
      1073: invokevirtual #468                // Method ext/mods/gameserver/model/actor/Player.setQuestNotifyHtml:(Z)V
      1076: aload_2
      1077: iconst_0
      1078: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Player.setQuestNotifyChat:(Z)V
      1081: aload_2
      1082: iconst_1
      1083: iconst_0
      1084: invokevirtual #475                // Method ext/mods/gameserver/model/actor/Player.setOnlineStatus:(ZZ)V
      1087: aload_2
      1088: invokevirtual #479                // Method ext/mods/gameserver/model/actor/Player.deleteMe:()V
      1091: new           #482                // class ext/mods/gameserver/network/serverpackets/CharSelectInfo
      1094: dup
      1095: aload_0
      1096: invokevirtual #95                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
      1099: checkcast     #99                 // class ext/mods/gameserver/network/GameClient
      1102: invokevirtual #101                // Method ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
      1105: aload_0
      1106: invokevirtual #95                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
      1109: checkcast     #99                 // class ext/mods/gameserver/network/GameClient
      1112: invokevirtual #484                // Method ext/mods/gameserver/network/GameClient.getSessionId:()Lext/mods/gameserver/network/SessionKey;
      1115: getfield      #488                // Field ext/mods/gameserver/network/SessionKey.playOkID1:I
      1118: invokespecial #493                // Method ext/mods/gameserver/network/serverpackets/CharSelectInfo."<init>":(Ljava/lang/String;I)V
      1121: astore        6
      1123: aload_0
      1124: aload         6
      1126: invokevirtual #47                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1129: aload_0
      1130: invokevirtual #95                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
      1133: checkcast     #99                 // class ext/mods/gameserver/network/GameClient
      1136: aload         6
      1138: invokevirtual #496                // Method ext/mods/gameserver/network/serverpackets/CharSelectInfo.getCharacterSlots:()[Lext/mods/gameserver/model/CharSelectSlot;
      1141: invokevirtual #500                // Method ext/mods/gameserver/network/GameClient.setCharSelectSlot:([Lext/mods/gameserver/model/CharSelectSlot;)V
      1144: return
      LineNumberTable:
        line 86: 0
        line 88: 15
        line 89: 22
        line 92: 23
        line 94: 38
        line 95: 45
        line 98: 46
        line 100: 84
        line 101: 91
        line 104: 92
        line 106: 107
        line 107: 114
        line 110: 115
        line 112: 133
        line 113: 140
        line 116: 141
        line 118: 154
        line 119: 161
        line 122: 162
        line 124: 175
        line 125: 182
        line 128: 183
        line 130: 204
        line 131: 211
        line 134: 212
        line 136: 225
        line 137: 232
        line 140: 233
        line 141: 244
        line 143: 256
        line 144: 263
        line 147: 264
        line 148: 309
        line 150: 313
        line 151: 320
        line 154: 321
        line 156: 349
        line 157: 358
        line 158: 367
        line 160: 376
        line 161: 388
        line 162: 393
        line 154: 401
        line 165: 407
        line 167: 414
        line 169: 421
        line 171: 428
        line 172: 439
        line 174: 447
        line 176: 465
        line 177: 467
        line 179: 500
        line 180: 509
        line 181: 518
        line 183: 527
        line 184: 545
        line 186: 555
        line 187: 604
        line 189: 614
        line 190: 648
        line 192: 658
        line 193: 667
        line 194: 681
        line 195: 690
        line 196: 693
        line 198: 696
        line 199: 718
        line 200: 740
        line 202: 763
        line 204: 796
        line 206: 815
        line 207: 826
        line 209: 853
        line 211: 864
        line 212: 880
        line 213: 890
        line 215: 893
        line 217: 926
        line 218: 948
        line 220: 976
        line 221: 987
        line 222: 1016
        line 224: 1019
        line 225: 1030
        line 226: 1035
        line 228: 1047
        line 229: 1055
        line 231: 1065
        line 233: 1071
        line 234: 1076
        line 235: 1081
        line 236: 1087
        line 238: 1091
        line 239: 1123
        line 240: 1129
        line 242: 1144
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          358      43     7 parts   [Ljava/lang/String;
          367      34     8 skillId   I
          376      25     9 skillLevel   I
          388      13    10 skill   Lext/mods/gameserver/skills/L2Skill;
          349      52     6  buff   Ljava/lang/String;
          509     184     6 commands   Ljava/util/List;
          518     175     7 macros   Ljava/util/List;
          527     166     8 shortcuts   Ljava/util/List;
          545     148     9   cmd   Lext/mods/gameserver/model/records/MacroCmd;
          604      89    10     m   Lext/mods/gameserver/model/Macro;
          648      45    11 shortcut   Lext/mods/gameserver/model/Shortcut;
          500     193     5 macro   Lext/mods/gameserver/model/records/custom/Macros;
          815      75     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          796      94     5 holder   Lext/mods/gameserver/model/records/NewbieItem;
          926      90     5 skill   Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
            0    1145     0  this   Lext/mods/gameserver/network/clientpackets/RequestCharacterCreate;
          244     901     1 template   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
          309     836     2 player   Lext/mods/gameserver/model/actor/Player;
          467     678     3     i   I
         1030     115     4 quest   Lext/mods/gameserver/scripting/Quest;
         1055      90     5 tutorial   Ljava/util/Collection;
         1123      22     6   csi   Lext/mods/gameserver/network/serverpackets/CharSelectInfo;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          509     184     6 commands   Ljava/util/List<Lext/mods/gameserver/model/records/MacroCmd;>;
          518     175     7 macros   Ljava/util/List<Lext/mods/gameserver/model/Macro;>;
          527     166     8 shortcuts   Ljava/util/List<Lext/mods/gameserver/model/Shortcut;>;
         1055      90     5 tutorial   Ljava/util/Collection<Lext/mods/quests/holder/QuestHolder;>;
      StackMapTable: number_of_entries = 33
        frame_type = 15 /* same */
        frame_type = 7 /* same */
        frame_type = 14 /* same */
        frame_type = 7 /* same */
        frame_type = 21 /* same */
        frame_type = 15 /* same */
        frame_type = 7 /* same */
        frame_type = 14 /* same */
        frame_type = 7 /* same */
        frame_type = 25 /* same */
        frame_type = 20 /* same */
        frame_type = 20 /* same */
        frame_type = 28 /* same */
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/template/PlayerTemplate ]
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 254 /* append */
          offset_delta = 14
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 253 /* append */
          offset_delta = 70
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 217
        frame_type = 252 /* append */
          offset_delta = 77
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/model/records/NewbieItem, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 249 /* chop */
          offset_delta = 36
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode ]
        frame_type = 27 /* same */
        frame_type = 250 /* chop */
          offset_delta = 39
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/scripting/Quest ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/util/Collection ]
}
SourceFile: "RequestCharacterCreate.java"
