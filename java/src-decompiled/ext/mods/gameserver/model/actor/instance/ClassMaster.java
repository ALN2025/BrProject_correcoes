// Bytecode for: ext.mods.gameserver.model.actor.instance.ClassMaster
// File: ext\mods\gameserver\model\actor\instance\ClassMaster.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/ClassMaster.class
  Last modified 9 de jul de 2026; size 14151 bytes
  MD5 checksum 5f88122f559922d86f7ec9cda2c18277
  Compiled from "ClassMaster.java"
public final class ext.mods.gameserver.model.actor.instance.ClassMaster extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #36                         // ext/mods/gameserver/model/actor/instance/ClassMaster
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 13, attributes: 3
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
   #13 = InvokeDynamic      #1:#14        // #1:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #14 = NameAndType        #11:#15       // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #15 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
   #16 = Class              #17           // java/util/StringTokenizer
   #17 = Utf8               java/util/StringTokenizer
   #18 = String             #19           //
   #19 = Utf8
   #20 = Methodref          #16.#21       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #21 = NameAndType        #5:#22        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #22 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #23 = Methodref          #16.#24       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #24 = NameAndType        #25:#26       // nextToken:()Ljava/lang/String;
   #25 = Utf8               nextToken
   #26 = Utf8               ()Ljava/lang/String;
   #27 = String             #28           // 1stClass
   #28 = Utf8               1stClass
   #29 = Methodref          #30.#31       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #30 = Class              #32           // java/lang/String
   #31 = NameAndType        #33:#34       // startsWith:(Ljava/lang/String;)Z
   #32 = Utf8               java/lang/String
   #33 = Utf8               startsWith
   #34 = Utf8               (Ljava/lang/String;)Z
   #35 = Methodref          #36.#37       // ext/mods/gameserver/model/actor/instance/ClassMaster.getObjectId:()I
   #36 = Class              #38           // ext/mods/gameserver/model/actor/instance/ClassMaster
   #37 = NameAndType        #39:#40       // getObjectId:()I
   #38 = Utf8               ext/mods/gameserver/model/actor/instance/ClassMaster
   #39 = Utf8               getObjectId
   #40 = Utf8               ()I
   #41 = Methodref          #36.#42       // ext/mods/gameserver/model/actor/instance/ClassMaster.showHtmlMenu:(Lext/mods/gameserver/model/actor/Player;II)V
   #42 = NameAndType        #43:#44       // showHtmlMenu:(Lext/mods/gameserver/model/actor/Player;II)V
   #43 = Utf8               showHtmlMenu
   #44 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
   #45 = String             #46           // 2ndClass
   #46 = Utf8               2ndClass
   #47 = String             #48           // 3rdClass
   #48 = Utf8               3rdClass
   #49 = String             #50           // change_class
   #50 = Utf8               change_class
   #51 = Methodref          #30.#52       // java/lang/String.substring:(I)Ljava/lang/String;
   #52 = NameAndType        #53:#12       // substring:(I)Ljava/lang/String;
   #53 = Utf8               substring
   #54 = Methodref          #55.#56       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #55 = Class              #57           // java/lang/Integer
   #56 = NameAndType        #58:#59       // parseInt:(Ljava/lang/String;)I
   #57 = Utf8               java/lang/Integer
   #58 = Utf8               parseInt
   #59 = Utf8               (Ljava/lang/String;)I
   #60 = Methodref          #36.#61       // ext/mods/gameserver/model/actor/instance/ClassMaster.checkAndChangeClass:(Lext/mods/gameserver/model/actor/Player;I)Z
   #61 = NameAndType        #62:#63       // checkAndChangeClass:(Lext/mods/gameserver/model/actor/Player;I)Z
   #62 = Utf8               checkAndChangeClass
   #63 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
   #64 = Class              #65           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #65 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #66 = Methodref          #64.#67       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #67 = NameAndType        #5:#68        // "<init>":(I)V
   #68 = Utf8               (I)V
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #70 = Class              #72           // ext/mods/gameserver/model/actor/Player
   #71 = NameAndType        #73:#74       // getLocale:()Ljava/util/Locale;
   #72 = Utf8               ext/mods/gameserver/model/actor/Player
   #73 = Utf8               getLocale
   #74 = Utf8               ()Ljava/util/Locale;
   #75 = Methodref          #36.#76       // ext/mods/gameserver/model/actor/instance/ClassMaster.getNpcId:()I
   #76 = NameAndType        #77:#40       // getNpcId:()I
   #77 = Utf8               getNpcId
   #78 = Methodref          #36.#79       // ext/mods/gameserver/model/actor/instance/ClassMaster.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #79 = NameAndType        #80:#81       // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #80 = Utf8               getHtmlPath
   #81 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #82 = Methodref          #64.#83       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #83 = NameAndType        #84:#85       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #84 = Utf8               setFile
   #85 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #86 = String             #87           // %name%
   #87 = Utf8               %name%
   #88 = Methodref          #89.#90       // ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
   #89 = Class              #91           // ext/mods/gameserver/data/xml/PlayerData
   #90 = NameAndType        #92:#93       // getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
   #91 = Utf8               ext/mods/gameserver/data/xml/PlayerData
   #92 = Utf8               getInstance
   #93 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerData;
   #94 = Methodref          #89.#95       // ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
   #95 = NameAndType        #96:#12       // getClassNameById:(I)Ljava/lang/String;
   #96 = Utf8               getClassNameById
   #97 = Methodref          #64.#98       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #98 = NameAndType        #99:#22       // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #99 = Utf8               replace
  #100 = Methodref          #70.#101      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #101 = NameAndType        #102:#103     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = Utf8               sendPacket
  #103 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #104 = String             #105          // become_noble
  #105 = Utf8               become_noble
  #106 = Methodref          #70.#107      // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #107 = NameAndType        #108:#109     // isNoble:()Z
  #108 = Utf8               isNoble
  #109 = Utf8               ()Z
  #110 = Fieldref           #111.#112     // ext/mods/Config.NOBLE_ITEM_ID:I
  #111 = Class              #113          // ext/mods/Config
  #112 = NameAndType        #114:#115     // NOBLE_ITEM_ID:I
  #113 = Utf8               ext/mods/Config
  #114 = Utf8               NOBLE_ITEM_ID
  #115 = Utf8               I
  #116 = Fieldref           #111.#117     // ext/mods/Config.NOBLE_ITEM_COUNT:I
  #117 = NameAndType        #118:#115     // NOBLE_ITEM_COUNT:I
  #118 = Utf8               NOBLE_ITEM_COUNT
  #119 = Methodref          #70.#120      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #120 = NameAndType        #121:#122     // destroyItemByItemId:(IIZ)Z
  #121 = Utf8               destroyItemByItemId
  #122 = Utf8               (IIZ)Z
  #123 = Methodref          #70.#124      // ext/mods/gameserver/model/actor/Player.setNoble:(ZZ)V
  #124 = NameAndType        #125:#126     // setNoble:(ZZ)V
  #125 = Utf8               setNoble
  #126 = Utf8               (ZZ)V
  #127 = Class              #128          // ext/mods/gameserver/network/serverpackets/UserInfo
  #128 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
  #129 = Methodref          #127.#130     // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #130 = NameAndType        #5:#131       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #131 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #132 = String             #133          // learn_skills
  #133 = Utf8               learn_skills
  #134 = Methodref          #70.#135      // ext/mods/gameserver/model/actor/Player.rewardSkills:()V
  #135 = NameAndType        #136:#137     // rewardSkills:()V
  #136 = Utf8               rewardSkills
  #137 = Utf8               ()V
  #138 = Methodref          #2.#139       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #139 = NameAndType        #140:#141     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #140 = Utf8               onBypassFeedback
  #141 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #142 = Fieldref           #111.#143     // ext/mods/Config.ALTERNATE_CLASS_MASTER:Z
  #143 = NameAndType        #144:#145     // ALTERNATE_CLASS_MASTER:Z
  #144 = Utf8               ALTERNATE_CLASS_MASTER
  #145 = Utf8               Z
  #146 = String             #147          // CO
  #147 = Utf8               CO
  #148 = Class              #149          // java/lang/NumberFormatException
  #149 = Utf8               java/lang/NumberFormatException
  #150 = Fieldref           #151.#152     // ext/mods/gameserver/network/serverpackets/TutorialCloseHtml.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/TutorialCloseHtml;
  #151 = Class              #153          // ext/mods/gameserver/network/serverpackets/TutorialCloseHtml
  #152 = NameAndType        #154:#155     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/TutorialCloseHtml;
  #153 = Utf8               ext/mods/gameserver/network/serverpackets/TutorialCloseHtml
  #154 = Utf8               STATIC_PACKET
  #155 = Utf8               Lext/mods/gameserver/network/serverpackets/TutorialCloseHtml;
  #156 = Methodref          #157.#158     // ext/mods/levelupmaker/LevelUpMakerManager.getInstance:()Lext/mods/levelupmaker/LevelUpMakerManager;
  #157 = Class              #159          // ext/mods/levelupmaker/LevelUpMakerManager
  #158 = NameAndType        #92:#160      // getInstance:()Lext/mods/levelupmaker/LevelUpMakerManager;
  #159 = Utf8               ext/mods/levelupmaker/LevelUpMakerManager
  #160 = Utf8               ()Lext/mods/levelupmaker/LevelUpMakerManager;
  #161 = Methodref          #157.#162     // ext/mods/levelupmaker/LevelUpMakerManager.isEnabled:()Z
  #162 = NameAndType        #163:#109     // isEnabled:()Z
  #163 = Utf8               isEnabled
  #164 = Methodref          #157.#165     // ext/mods/levelupmaker/LevelUpMakerManager.getQuestionMarkId:()I
  #165 = NameAndType        #166:#40      // getQuestionMarkId:()I
  #166 = Utf8               getQuestionMarkId
  #167 = Methodref          #157.#168     // ext/mods/levelupmaker/LevelUpMakerManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #168 = NameAndType        #169:#170     // getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #169 = Utf8               getTutorialAlertHtml
  #170 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #171 = Methodref          #64.#172      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #172 = NameAndType        #173:#174     // setHtml:(Ljava/lang/String;)V
  #173 = Utf8               setHtml
  #174 = Utf8               (Ljava/lang/String;)V
  #175 = Class              #176          // ext/mods/tour/TournamentEvent
  #176 = Utf8               ext/mods/tour/TournamentEvent
  #177 = Methodref          #175.#168     // ext/mods/tour/TournamentEvent.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #178 = Class              #179          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
  #179 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
  #180 = Methodref          #178.#181     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
  #181 = NameAndType        #92:#182      // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
  #182 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
  #183 = Methodref          #178.#168     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #184 = Class              #185          // ext/mods/gameserver/model/entity/events/deathmatch/DMManager
  #185 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMManager
  #186 = Methodref          #184.#187     // ext/mods/gameserver/model/entity/events/deathmatch/DMManager.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
  #187 = NameAndType        #92:#188      // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
  #188 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
  #189 = Methodref          #184.#168     // ext/mods/gameserver/model/entity/events/deathmatch/DMManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #190 = Class              #191          // ext/mods/gameserver/model/entity/events/lastman/LMManager
  #191 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMManager
  #192 = Methodref          #190.#193     // ext/mods/gameserver/model/entity/events/lastman/LMManager.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
  #193 = NameAndType        #92:#194      // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
  #194 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
  #195 = Methodref          #190.#168     // ext/mods/gameserver/model/entity/events/lastman/LMManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #196 = Class              #197          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
  #197 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
  #198 = Methodref          #196.#199     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
  #199 = NameAndType        #92:#200      // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
  #200 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
  #201 = Methodref          #196.#168     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #202 = Methodref          #203.#204     // ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
  #203 = Class              #205          // ext/mods/Crypta/RandomManager
  #204 = NameAndType        #92:#206      // getInstance:()Lext/mods/Crypta/RandomManager;
  #205 = Utf8               ext/mods/Crypta/RandomManager
  #206 = Utf8               ()Lext/mods/Crypta/RandomManager;
  #207 = Methodref          #203.#208     // ext/mods/Crypta/RandomManager.getActiveZones:()Ljava/util/List;
  #208 = NameAndType        #209:#210     // getActiveZones:()Ljava/util/List;
  #209 = Utf8               getActiveZones
  #210 = Utf8               ()Ljava/util/List;
  #211 = InterfaceMethodref #212.#213     // java/util/List.iterator:()Ljava/util/Iterator;
  #212 = Class              #214          // java/util/List
  #213 = NameAndType        #215:#216     // iterator:()Ljava/util/Iterator;
  #214 = Utf8               java/util/List
  #215 = Utf8               iterator
  #216 = Utf8               ()Ljava/util/Iterator;
  #217 = InterfaceMethodref #218.#219     // java/util/Iterator.hasNext:()Z
  #218 = Class              #220          // java/util/Iterator
  #219 = NameAndType        #221:#109     // hasNext:()Z
  #220 = Utf8               java/util/Iterator
  #221 = Utf8               hasNext
  #222 = InterfaceMethodref #218.#223     // java/util/Iterator.next:()Ljava/lang/Object;
  #223 = NameAndType        #224:#225     // next:()Ljava/lang/Object;
  #224 = Utf8               next
  #225 = Utf8               ()Ljava/lang/Object;
  #226 = Class              #227          // ext/mods/gameserver/model/zone/type/RandomZone
  #227 = Utf8               ext/mods/gameserver/model/zone/type/RandomZone
  #228 = Methodref          #203.#229     // ext/mods/Crypta/RandomManager.getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #229 = NameAndType        #230:#231     // getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #230 = Utf8               getZoneDataForZone
  #231 = Utf8               (Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #232 = Methodref          #55.#233      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #233 = NameAndType        #234:#235     // valueOf:(I)Ljava/lang/Integer;
  #234 = Utf8               valueOf
  #235 = Utf8               (I)Ljava/lang/Integer;
  #236 = Methodref          #237.#238     // ext/mods/FarmEventRandom/holder/RandomZoneData.isActive:()Z
  #237 = Class              #239          // ext/mods/FarmEventRandom/holder/RandomZoneData
  #238 = NameAndType        #240:#109     // isActive:()Z
  #239 = Utf8               ext/mods/FarmEventRandom/holder/RandomZoneData
  #240 = Utf8               isActive
  #241 = Methodref          #55.#242      // java/lang/Integer.intValue:()I
  #242 = NameAndType        #243:#40      // intValue:()I
  #243 = Utf8               intValue
  #244 = Methodref          #203.#168     // ext/mods/Crypta/RandomManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #245 = Methodref          #36.#246      // ext/mods/gameserver/model/actor/instance/ClassMaster.showTutorialHtml:(Lext/mods/gameserver/model/actor/Player;)V
  #246 = NameAndType        #247:#131     // showTutorialHtml:(Lext/mods/gameserver/model/actor/Player;)V
  #247 = Utf8               showTutorialHtml
  #248 = Methodref          #70.#249      // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #249 = NameAndType        #250:#251     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #250 = Utf8               getClassId
  #251 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #252 = Methodref          #253.#254     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #253 = Class              #255          // ext/mods/gameserver/enums/actors/ClassId
  #254 = NameAndType        #256:#40      // getLevel:()I
  #255 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #256 = Utf8               getLevel
  #257 = Methodref          #36.#258      // ext/mods/gameserver/model/actor/instance/ClassMaster.getMinLevel:(I)I
  #258 = NameAndType        #259:#260     // getMinLevel:(I)I
  #259 = Utf8               getMinLevel
  #260 = Utf8               (I)I
  #261 = Methodref          #70.#262      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #262 = NameAndType        #263:#264     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #263 = Utf8               getStatus
  #264 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #265 = Methodref          #266.#254     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #266 = Class              #267          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #267 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #268 = Fieldref           #111.#269     // ext/mods/Config.CLASS_MASTER_SETTINGS:Lext/mods/Config$ClassMasterSettings;
  #269 = NameAndType        #270:#271     // CLASS_MASTER_SETTINGS:Lext/mods/Config$ClassMasterSettings;
  #270 = Utf8               CLASS_MASTER_SETTINGS
  #271 = Utf8               Lext/mods/Config$ClassMasterSettings;
  #272 = Methodref          #273.#274     // ext/mods/Config$ClassMasterSettings.isAllowed:(I)Z
  #273 = Class              #275          // ext/mods/Config$ClassMasterSettings
  #274 = NameAndType        #276:#277     // isAllowed:(I)Z
  #275 = Utf8               ext/mods/Config$ClassMasterSettings
  #276 = Utf8               isAllowed
  #277 = Utf8               (I)Z
  #278 = Class              #279          // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #279 = Utf8               ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #280 = Methodref          #278.#67      // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
  #281 = Class              #282          // java/lang/StringBuilder
  #282 = Utf8               java/lang/StringBuilder
  #283 = Methodref          #281.#67      // java/lang/StringBuilder."<init>":(I)V
  #284 = String             #285          // <html><body>
  #285 = Utf8               <html><body>
  #286 = Methodref          #281.#287     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #287 = NameAndType        #288:#289     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #288 = Utf8               append
  #289 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #290 = String             #291          // Come back here when you reached level 20 to change your class.<br>
  #291 = Utf8               Come back here when you reached level 20 to change your class.<br>
  #292 = String             #293          // Come back after your first occupation change.<br>
  #293 = Utf8               Come back after your first occupation change.<br>
  #294 = String             #295          // Come back after your second occupation change.<br>
  #295 = Utf8               Come back after your second occupation change.<br>
  #296 = String             #297          // I can\'t change your occupation.<br>
  #297 = Utf8               I can\'t change your occupation.<br>
  #298 = String             #299          // Come back here when you reached level 40 to change your class.<br>
  #299 = Utf8               Come back here when you reached level 40 to change your class.<br>
  #300 = String             #301          // Come back here when you reached level 76 to change your class.<br>
  #301 = Utf8               Come back here when you reached level 76 to change your class.<br>
  #302 = String             #303          // There is no class change available for you anymore.<br>
  #303 = Utf8               There is no class change available for you anymore.<br>
  #304 = String             #305          // </body></html>
  #305 = Utf8               </body></html>
  #306 = Methodref          #281.#307     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #307 = NameAndType        #308:#26      // toString:()Ljava/lang/String;
  #308 = Utf8               toString
  #309 = Fieldref           #111.#310     // ext/mods/Config.ALLOW_ENTIRE_TREE:Z
  #310 = NameAndType        #311:#145     // ALLOW_ENTIRE_TREE:Z
  #311 = Utf8               ALLOW_ENTIRE_TREE
  #312 = Fieldref           #253.#313     // ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #313 = NameAndType        #314:#315     // VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #314 = Utf8               VALUES
  #315 = Utf8               [Lext/mods/gameserver/enums/actors/ClassId;
  #316 = Methodref          #36.#317      // ext/mods/gameserver/model/actor/instance/ClassMaster.validateClassId:(Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/enums/actors/ClassId;)Z
  #317 = NameAndType        #318:#319     // validateClassId:(Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/enums/actors/ClassId;)Z
  #318 = Utf8               validateClassId
  #319 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/enums/actors/ClassId;)Z
  #320 = Class              #321          // java/lang/Object
  #321 = Utf8               java/lang/Object
  #322 = String             #323          // <a action=\"bypass -h npc_%objectId%_change_class
  #323 = Utf8               <a action=\"bypass -h npc_%objectId%_change_class
  #324 = Methodref          #253.#325     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #325 = NameAndType        #326:#40      // getId:()I
  #326 = Utf8               getId
  #327 = String             #328          // \">
  #328 = Utf8               \">
  #329 = String             #330          // </a><br>
  #330 = Utf8               </a><br>
  #331 = Methodref          #332.#333     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #332 = Class              #334          // ext/mods/commons/lang/StringUtil
  #333 = NameAndType        #288:#335     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #334 = Utf8               ext/mods/commons/lang/StringUtil
  #335 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #336 = Methodref          #281.#337     // java/lang/StringBuilder.length:()I
  #337 = NameAndType        #338:#40      // length:()I
  #338 = Utf8               length
  #339 = String             #340          // %menu%
  #340 = Utf8               %menu%
  #341 = String             #342          // %level%
  #342 = Utf8               %level%
  #343 = Methodref          #64.#344      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #344 = NameAndType        #99:#345      // replace:(Ljava/lang/String;I)V
  #345 = Utf8               (Ljava/lang/String;I)V
  #346 = Integer            2147483647
  #347 = String             #348          // %objectId%
  #348 = Utf8               %objectId%
  #349 = String             #350          // %req_items%
  #350 = Utf8               %req_items%
  #351 = Methodref          #36.#352      // ext/mods/gameserver/model/actor/instance/ClassMaster.getRequiredItems:(I)Ljava/lang/String;
  #352 = NameAndType        #353:#12      // getRequiredItems:(I)Ljava/lang/String;
  #353 = Utf8               getRequiredItems
  #354 = Methodref          #355.#356     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #355 = Class              #357          // ext/mods/gameserver/data/HTMLData
  #356 = NameAndType        #92:#358      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #357 = Utf8               ext/mods/gameserver/data/HTMLData
  #358 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #359 = String             #360          // html/mods/classmaster/50000-7.htm
  #360 = Utf8               html/mods/classmaster/50000-7.htm
  #361 = Methodref          #355.#362     // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #362 = NameAndType        #363:#364     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #363 = Utf8               getHtm
  #364 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #365 = Methodref          #30.#366      // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #366 = NameAndType        #367:#368     // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #367 = Utf8               replaceAll
  #368 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #369 = Methodref          #253.#370     // ext/mods/gameserver/enums/actors/ClassId.values:()[Lext/mods/gameserver/enums/actors/ClassId;
  #370 = NameAndType        #371:#372     // values:()[Lext/mods/gameserver/enums/actors/ClassId;
  #371 = Utf8               values
  #372 = Utf8               ()[Lext/mods/gameserver/enums/actors/ClassId;
  #373 = String             #374          // <a action=\"link CO
  #374 = Utf8               <a action=\"link CO
  #375 = Methodref          #30.#376      // java/lang/String.valueOf:(I)Ljava/lang/String;
  #376 = NameAndType        #234:#12      // valueOf:(I)Ljava/lang/String;
  #377 = Methodref          #30.#378      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #378 = NameAndType        #99:#379      // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #379 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #380 = Class              #381          // ext/mods/gameserver/network/serverpackets/TutorialShowHtml
  #381 = Utf8               ext/mods/gameserver/network/serverpackets/TutorialShowHtml
  #382 = Methodref          #380.#383     // ext/mods/gameserver/network/serverpackets/TutorialShowHtml."<init>":(Ljava/lang/String;)V
  #383 = NameAndType        #5:#174       // "<init>":(Ljava/lang/String;)V
  #384 = Methodref          #36.#385      // ext/mods/gameserver/model/actor/instance/ClassMaster.validateClassId:(Lext/mods/gameserver/enums/actors/ClassId;I)Z
  #385 = NameAndType        #318:#386     // validateClassId:(Lext/mods/gameserver/enums/actors/ClassId;I)Z
  #386 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;I)Z
  #387 = Methodref          #70.#388      // ext/mods/gameserver/model/actor/Player.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
  #388 = NameAndType        #389:#390     // getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
  #389 = Utf8               getWeightPenalty
  #390 = Utf8               ()Lext/mods/gameserver/enums/actors/WeightPenalty;
  #391 = Methodref          #392.#393     // ext/mods/gameserver/enums/actors/WeightPenalty.ordinal:()I
  #392 = Class              #394          // ext/mods/gameserver/enums/actors/WeightPenalty
  #393 = NameAndType        #395:#40      // ordinal:()I
  #394 = Utf8               ext/mods/gameserver/enums/actors/WeightPenalty
  #395 = Utf8               ordinal
  #396 = Methodref          #273.#397     // ext/mods/Config$ClassMasterSettings.getRewardItems:(I)Ljava/util/List;
  #397 = NameAndType        #398:#399     // getRewardItems:(I)Ljava/util/List;
  #398 = Utf8               getRewardItems
  #399 = Utf8               (I)Ljava/util/List;
  #400 = InterfaceMethodref #212.#401     // java/util/List.isEmpty:()Z
  #401 = NameAndType        #402:#109     // isEmpty:()Z
  #402 = Utf8               isEmpty
  #403 = Fieldref           #404.#405     // ext/mods/gameserver/network/SystemMessageId.INVENTORY_LESS_THAN_80_PERCENT:Lext/mods/gameserver/network/SystemMessageId;
  #404 = Class              #406          // ext/mods/gameserver/network/SystemMessageId
  #405 = NameAndType        #407:#408     // INVENTORY_LESS_THAN_80_PERCENT:Lext/mods/gameserver/network/SystemMessageId;
  #406 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #407 = Utf8               INVENTORY_LESS_THAN_80_PERCENT
  #408 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #409 = Methodref          #70.#410      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #410 = NameAndType        #102:#411     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #411 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #412 = Methodref          #273.#413     // ext/mods/Config$ClassMasterSettings.getRequiredItems:(I)Ljava/util/List;
  #413 = NameAndType        #353:#399     // getRequiredItems:(I)Ljava/util/List;
  #414 = Class              #415          // ext/mods/gameserver/model/holder/IntIntHolder
  #415 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #416 = Methodref          #70.#417      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #417 = NameAndType        #418:#419     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #418 = Utf8               getInventory
  #419 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #420 = Methodref          #414.#325     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #421 = Methodref          #422.#423     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(I)I
  #422 = Class              #424          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #423 = NameAndType        #425:#260     // getItemCount:(I)I
  #424 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #425 = Utf8               getItemCount
  #426 = Methodref          #414.#427     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #427 = NameAndType        #428:#40      // getValue:()I
  #428 = Utf8               getValue
  #429 = Fieldref           #404.#430     // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #430 = NameAndType        #431:#408     // NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #431 = Utf8               NOT_ENOUGH_ITEMS
  #432 = Methodref          #70.#433      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #433 = NameAndType        #434:#435     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #434 = Utf8               addItem
  #435 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #436 = Methodref          #70.#437      // ext/mods/gameserver/model/actor/Player.setClassId:(I)V
  #437 = NameAndType        #438:#68      // setClassId:(I)V
  #438 = Utf8               setClassId
  #439 = Methodref          #70.#440      // ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
  #440 = NameAndType        #441:#109     // isSubClassActive:()Z
  #441 = Utf8               isSubClassActive
  #442 = Methodref          #70.#443      // ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
  #443 = NameAndType        #444:#445     // getSubClasses:()Ljava/util/Map;
  #444 = Utf8               getSubClasses
  #445 = Utf8               ()Ljava/util/Map;
  #446 = Methodref          #70.#447      // ext/mods/gameserver/model/actor/Player.getClassIndex:()I
  #447 = NameAndType        #448:#40      // getClassIndex:()I
  #448 = Utf8               getClassIndex
  #449 = InterfaceMethodref #450.#451     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #450 = Class              #452          // java/util/Map
  #451 = NameAndType        #453:#454     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #452 = Utf8               java/util/Map
  #453 = Utf8               get
  #454 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #455 = Class              #456          // ext/mods/gameserver/model/actor/container/player/SubClass
  #456 = Utf8               ext/mods/gameserver/model/actor/container/player/SubClass
  #457 = Methodref          #70.#458      // ext/mods/gameserver/model/actor/Player.getActiveClass:()I
  #458 = NameAndType        #459:#40      // getActiveClass:()I
  #459 = Utf8               getActiveClass
  #460 = Methodref          #455.#437     // ext/mods/gameserver/model/actor/container/player/SubClass.setClassId:(I)V
  #461 = Methodref          #70.#462      // ext/mods/gameserver/model/actor/Player.setBaseClass:(I)V
  #462 = NameAndType        #463:#68      // setBaseClass:(I)V
  #463 = Utf8               setBaseClass
  #464 = Methodref          #36.#465      // ext/mods/gameserver/model/actor/instance/ClassMaster.showQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
  #465 = NameAndType        #466:#131     // showQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
  #466 = Utf8               showQuestionMark
  #467 = Methodref          #70.#468      // ext/mods/gameserver/model/actor/Player.refreshHennaList:()V
  #468 = NameAndType        #469:#137     // refreshHennaList:()V
  #469 = Utf8               refreshHennaList
  #470 = Methodref          #70.#471      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #471 = NameAndType        #472:#137     // broadcastUserInfo:()V
  #472 = Utf8               broadcastUserInfo
  #473 = Class              #474          // java/lang/Exception
  #474 = Utf8               java/lang/Exception
  #475 = Methodref          #253.#476     // ext/mods/gameserver/enums/actors/ClassId.getParent:()Lext/mods/gameserver/enums/actors/ClassId;
  #476 = NameAndType        #477:#251     // getParent:()Lext/mods/gameserver/enums/actors/ClassId;
  #477 = Utf8               getParent
  #478 = Methodref          #253.#479     // ext/mods/gameserver/enums/actors/ClassId.isChildOf:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #479 = NameAndType        #480:#481     // isChildOf:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #480 = Utf8               isChildOf
  #481 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Z
  #482 = String             #483          // <tr><td>none</td></tr>
  #483 = Utf8               <tr><td>none</td></tr>
  #484 = Methodref          #281.#485     // java/lang/StringBuilder."<init>":()V
  #485 = NameAndType        #5:#137       // "<init>":()V
  #486 = String             #487          // <tr><td><font color=\"LEVEL\">
  #487 = Utf8               <tr><td><font color=\"LEVEL\">
  #488 = String             #489          // </font></td><td>
  #489 = Utf8               </font></td><td>
  #490 = Methodref          #491.#492     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #491 = Class              #493          // ext/mods/gameserver/data/xml/ItemData
  #492 = NameAndType        #92:#494      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #493 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #494 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #495 = Methodref          #491.#496     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #496 = NameAndType        #497:#498     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #497 = Utf8               getTemplate
  #498 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #499 = Methodref          #500.#501     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #500 = Class              #502          // ext/mods/gameserver/model/item/kind/Item
  #501 = NameAndType        #503:#26      // getName:()Ljava/lang/String;
  #502 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #503 = Utf8               getName
  #504 = String             #505          // </td></tr>
  #505 = Utf8               </td></tr>
  #506 = Utf8               Code
  #507 = Utf8               LineNumberTable
  #508 = Utf8               LocalVariableTable
  #509 = Utf8               this
  #510 = Utf8               Lext/mods/gameserver/model/actor/instance/ClassMaster;
  #511 = Utf8               objectId
  #512 = Utf8               template
  #513 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #514 = Utf8               player
  #515 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #516 = Utf8               npcId
  #517 = Utf8               val
  #518 = Utf8               StackMapTable
  #519 = Utf8               html
  #520 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #521 = Utf8               command
  #522 = Utf8               Ljava/lang/String;
  #523 = Utf8               st
  #524 = Utf8               Ljava/util/StringTokenizer;
  #525 = Utf8               onTutorialLink
  #526 = Utf8               request
  #527 = Utf8               onTutorialQuestionMark
  #528 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #529 = Utf8               msg
  #530 = Utf8               zoneData
  #531 = Utf8               Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #532 = Utf8               qmId
  #533 = Utf8               Ljava/lang/Integer;
  #534 = Utf8               zone
  #535 = Utf8               Lext/mods/gameserver/model/zone/type/RandomZone;
  #536 = Utf8               number
  #537 = Utf8               classId
  #538 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #539 = Utf8               sb
  #540 = Utf8               Ljava/lang/StringBuilder;
  #541 = Utf8               cid
  #542 = Utf8               menu
  #543 = Utf8               minLevel
  #544 = Utf8               currentClassId
  #545 = Utf8               level
  #546 = Class              #315          // "[Lext/mods/gameserver/enums/actors/ClassId;"
  #547 = Utf8               item
  #548 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #549 = Utf8               newJobLevel
  #550 = Utf8               neededItems
  #551 = Utf8               Ljava/util/List;
  #552 = Utf8               LocalVariableTypeTable
  #553 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #554 = Utf8               oldCID
  #555 = Utf8               newCID
  #556 = Utf8               SourceFile
  #557 = Utf8               ClassMaster.java
  #558 = Utf8               BootstrapMethods
  #559 = String             #560          // -\u0001
  #560 = Utf8               -\u0001
  #561 = String             #562          // html/mods/classmaster/\u0001\u0001.htm
  #562 = Utf8               html/mods/classmaster/\u0001\u0001.htm
  #563 = MethodHandle       6:#564        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #564 = Methodref          #565.#566     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #565 = Class              #567          // java/lang/invoke/StringConcatFactory
  #566 = NameAndType        #11:#568      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #567 = Utf8               java/lang/invoke/StringConcatFactory
  #568 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #569 = Utf8               InnerClasses
  #570 = Utf8               ClassMasterSettings
  #571 = Class              #572          // java/lang/invoke/MethodHandles$Lookup
  #572 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #573 = Class              #574          // java/lang/invoke/MethodHandles
  #574 = Utf8               java/lang/invoke/MethodHandles
  #575 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.ClassMaster(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 63: 0
        line 64: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/ClassMaster;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: iload_2
         1: iload_3
         2: ifne          10
         5: ldc           #7                  // String
         7: goto          16
        10: iload_3
        11: invokedynamic #9,  0              // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        16: invokedynamic #13,  0             // InvokeDynamic #1:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
        21: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/instance/ClassMaster;
            0      22     1 player   Lext/mods/gameserver/model/actor/Player;
            0      22     2 npcId   I
            0      22     3   val   I
      StackMapTable: number_of_entries = 2
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/instance/ClassMaster, class ext/mods/gameserver/model/actor/Player, int, int ]
          stack = [ int, class java/lang/String ]

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=3
         0: new           #16                 // class java/util/StringTokenizer
         3: dup
         4: aload_2
         5: ldc           #18                 // String
         7: invokespecial #20                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_2
        17: ldc           #27                 // String 1stClass
        19: invokevirtual #29                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        22: ifeq          38
        25: aload_0
        26: aload_1
        27: aload_0
        28: invokevirtual #35                 // Method getObjectId:()I
        31: iconst_1
        32: invokevirtual #41                 // Method showHtmlMenu:(Lext/mods/gameserver/model/actor/Player;II)V
        35: goto          306
        38: aload_2
        39: ldc           #45                 // String 2ndClass
        41: invokevirtual #29                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        44: ifeq          60
        47: aload_0
        48: aload_1
        49: aload_0
        50: invokevirtual #35                 // Method getObjectId:()I
        53: iconst_2
        54: invokevirtual #41                 // Method showHtmlMenu:(Lext/mods/gameserver/model/actor/Player;II)V
        57: goto          306
        60: aload_2
        61: ldc           #47                 // String 3rdClass
        63: invokevirtual #29                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        66: ifeq          82
        69: aload_0
        70: aload_1
        71: aload_0
        72: invokevirtual #35                 // Method getObjectId:()I
        75: iconst_3
        76: invokevirtual #41                 // Method showHtmlMenu:(Lext/mods/gameserver/model/actor/Player;II)V
        79: goto          306
        82: aload_2
        83: ldc           #49                 // String change_class
        85: invokevirtual #29                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        88: ifeq          167
        91: aload_2
        92: bipush        13
        94: invokevirtual #51                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        97: invokestatic  #54                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       100: istore        4
       102: aload_1
       103: iload         4
       105: invokestatic  #60                 // Method checkAndChangeClass:(Lext/mods/gameserver/model/actor/Player;I)Z
       108: ifeq          164
       111: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       114: dup
       115: aload_0
       116: invokevirtual #35                 // Method getObjectId:()I
       119: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       122: astore        5
       124: aload         5
       126: aload_1
       127: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       130: aload_0
       131: aload_1
       132: aload_0
       133: invokevirtual #75                 // Method getNpcId:()I
       136: iconst_4
       137: invokevirtual #78                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       140: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       143: aload         5
       145: ldc           #86                 // String %name%
       147: invokestatic  #88                 // Method ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
       150: iload         4
       152: invokevirtual #94                 // Method ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
       155: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       158: aload_1
       159: aload         5
       161: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       164: goto          306
       167: aload_2
       168: ldc           #104                // String become_noble
       170: invokevirtual #29                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       173: ifeq          284
       176: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       179: dup
       180: aload_0
       181: invokevirtual #35                 // Method getObjectId:()I
       184: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       187: astore        4
       189: aload_1
       190: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       193: ifeq          222
       196: aload         4
       198: aload_1
       199: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       202: aload_0
       203: aload_1
       204: aload_0
       205: invokevirtual #75                 // Method getNpcId:()I
       208: iconst_5
       209: invokevirtual #78                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       212: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       215: aload_1
       216: aload         4
       218: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       221: return
       222: aload_1
       223: getstatic     #110                // Field ext/mods/Config.NOBLE_ITEM_ID:I
       226: getstatic     #116                // Field ext/mods/Config.NOBLE_ITEM_COUNT:I
       229: iconst_1
       230: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       233: ifne          237
       236: return
       237: aload         4
       239: aload_1
       240: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       243: aload_0
       244: aload_1
       245: aload_0
       246: invokevirtual #75                 // Method getNpcId:()I
       249: bipush        6
       251: invokevirtual #78                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       254: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       257: aload_1
       258: iconst_1
       259: iconst_1
       260: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.setNoble:(ZZ)V
       263: aload_1
       264: new           #127                // class ext/mods/gameserver/network/serverpackets/UserInfo
       267: dup
       268: aload_1
       269: invokespecial #129                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       272: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       275: aload_1
       276: aload         4
       278: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       281: goto          306
       284: aload_2
       285: ldc           #132                // String learn_skills
       287: invokevirtual #29                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       290: ifeq          300
       293: aload_1
       294: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Player.rewardSkills:()V
       297: goto          306
       300: aload_0
       301: aload_1
       302: aload_2
       303: invokespecial #138                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       306: return
      LineNumberTable:
        line 75: 0
        line 76: 11
        line 78: 16
        line 79: 25
        line 80: 38
        line 81: 47
        line 82: 60
        line 83: 69
        line 84: 82
        line 86: 91
        line 88: 102
        line 90: 111
        line 91: 124
        line 92: 143
        line 93: 158
        line 95: 164
        line 96: 167
        line 98: 176
        line 100: 189
        line 102: 196
        line 103: 215
        line 104: 221
        line 107: 222
        line 108: 236
        line 110: 237
        line 111: 257
        line 112: 263
        line 113: 275
        line 114: 281
        line 115: 284
        line 116: 293
        line 118: 300
        line 119: 306
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          124      40     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          102      62     4   val   I
          189      92     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     307     0  this   Lext/mods/gameserver/model/actor/instance/ClassMaster;
            0     307     1 player   Lext/mods/gameserver/model/actor/Player;
            0     307     2 command   Ljava/lang/String;
           11     296     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 10
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class java/util/StringTokenizer ]
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 81
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 14 /* same */
        frame_type = 250 /* chop */
          offset_delta = 46
        frame_type = 15 /* same */
        frame_type = 5 /* same */

  public static final void onTutorialLink(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: getstatic     #142                // Field ext/mods/Config.ALTERNATE_CLASS_MASTER:Z
         3: ifeq          19
         6: aload_1
         7: ifnull        19
        10: aload_1
        11: ldc           #146                // String CO
        13: invokevirtual #29                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        16: ifne          20
        19: return
        20: aload_1
        21: iconst_2
        22: invokevirtual #51                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        25: invokestatic  #54                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        28: istore_2
        29: aload_0
        30: iload_2
        31: invokestatic  #60                 // Method checkAndChangeClass:(Lext/mods/gameserver/model/actor/Player;I)Z
        34: pop
        35: goto          39
        38: astore_2
        39: aload_0
        40: getstatic     #150                // Field ext/mods/gameserver/network/serverpackets/TutorialCloseHtml.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/TutorialCloseHtml;
        43: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        46: return
      Exception table:
         from    to  target type
            20    35    38   Class java/lang/NumberFormatException
      LineNumberTable:
        line 123: 0
        line 124: 19
        line 128: 20
        line 129: 29
        line 133: 35
        line 131: 38
        line 134: 39
        line 135: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       6     2   val   I
            0      47     0 player   Lext/mods/gameserver/model/actor/Player;
            0      47     1 request   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 19 /* same */
        frame_type = 0 /* same */
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 0 /* same */

  public static final void onTutorialQuestionMark(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=8, args_size=2
         0: invokestatic  #156                // Method ext/mods/levelupmaker/LevelUpMakerManager.getInstance:()Lext/mods/levelupmaker/LevelUpMakerManager;
         3: invokevirtual #161                // Method ext/mods/levelupmaker/LevelUpMakerManager.isEnabled:()Z
         6: ifeq          51
         9: iload_1
        10: invokestatic  #156                // Method ext/mods/levelupmaker/LevelUpMakerManager.getInstance:()Lext/mods/levelupmaker/LevelUpMakerManager;
        13: invokevirtual #164                // Method ext/mods/levelupmaker/LevelUpMakerManager.getQuestionMarkId:()I
        16: if_icmpne     51
        19: invokestatic  #156                // Method ext/mods/levelupmaker/LevelUpMakerManager.getInstance:()Lext/mods/levelupmaker/LevelUpMakerManager;
        22: aload_0
        23: invokevirtual #167                // Method ext/mods/levelupmaker/LevelUpMakerManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
        26: astore_2
        27: aload_2
        28: ifnull        50
        31: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        34: dup
        35: iconst_0
        36: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        39: astore_3
        40: aload_3
        41: aload_2
        42: invokevirtual #171                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
        45: aload_0
        46: aload_3
        47: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        50: return
        51: iload_1
        52: sipush        2000
        55: if_icmpne     87
        58: aload_0
        59: invokestatic  #177                // Method ext/mods/tour/TournamentEvent.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
        62: astore_2
        63: aload_2
        64: ifnull        86
        67: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        70: dup
        71: iconst_0
        72: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        75: astore_3
        76: aload_3
        77: aload_2
        78: invokevirtual #171                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
        81: aload_0
        82: aload_3
        83: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        86: return
        87: iload_1
        88: sipush        2001
        91: if_icmpne     126
        94: invokestatic  #180                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
        97: aload_0
        98: invokevirtual #183                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       101: astore_2
       102: aload_2
       103: ifnull        125
       106: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       109: dup
       110: iconst_0
       111: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       114: astore_3
       115: aload_3
       116: aload_2
       117: invokevirtual #171                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       120: aload_0
       121: aload_3
       122: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       125: return
       126: iload_1
       127: sipush        2002
       130: if_icmpne     165
       133: invokestatic  #186                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMManager.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
       136: aload_0
       137: invokevirtual #189                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       140: astore_2
       141: aload_2
       142: ifnull        164
       145: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       148: dup
       149: iconst_0
       150: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       153: astore_3
       154: aload_3
       155: aload_2
       156: invokevirtual #171                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       159: aload_0
       160: aload_3
       161: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       164: return
       165: iload_1
       166: sipush        2003
       169: if_icmpne     204
       172: invokestatic  #192                // Method ext/mods/gameserver/model/entity/events/lastman/LMManager.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
       175: aload_0
       176: invokevirtual #195                // Method ext/mods/gameserver/model/entity/events/lastman/LMManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       179: astore_2
       180: aload_2
       181: ifnull        203
       184: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       187: dup
       188: iconst_0
       189: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       192: astore_3
       193: aload_3
       194: aload_2
       195: invokevirtual #171                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       198: aload_0
       199: aload_3
       200: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       203: return
       204: iload_1
       205: sipush        2004
       208: if_icmpne     243
       211: invokestatic  #198                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
       214: aload_0
       215: invokevirtual #201                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       218: astore_2
       219: aload_2
       220: ifnull        242
       223: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       226: dup
       227: iconst_0
       228: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       231: astore_3
       232: aload_3
       233: aload_2
       234: invokevirtual #171                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       237: aload_0
       238: aload_3
       239: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       242: return
       243: invokestatic  #202                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       246: invokevirtual #207                // Method ext/mods/Crypta/RandomManager.getActiveZones:()Ljava/util/List;
       249: invokeinterface #211,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       254: astore_2
       255: aload_2
       256: invokeinterface #217,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       261: ifeq          354
       264: aload_2
       265: invokeinterface #222,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       270: checkcast     #226                // class ext/mods/gameserver/model/zone/type/RandomZone
       273: astore_3
       274: invokestatic  #202                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       277: aload_3
       278: invokevirtual #228                // Method ext/mods/Crypta/RandomManager.getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
       281: astore        4
       283: sipush        2005
       286: invokestatic  #232                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       289: astore        5
       291: aload         4
       293: ifnull        351
       296: aload         4
       298: invokevirtual #236                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.isActive:()Z
       301: ifeq          351
       304: iload_1
       305: aload         5
       307: invokevirtual #241                // Method java/lang/Integer.intValue:()I
       310: if_icmpne     351
       313: invokestatic  #202                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       316: aload_0
       317: invokevirtual #244                // Method ext/mods/Crypta/RandomManager.getTutorialAlertHtml:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       320: astore        6
       322: aload         6
       324: ifnull        350
       327: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       330: dup
       331: iconst_0
       332: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       335: astore        7
       337: aload         7
       339: aload         6
       341: invokevirtual #171                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       344: aload_0
       345: aload         7
       347: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       350: return
       351: goto          255
       354: getstatic     #142                // Field ext/mods/Config.ALTERNATE_CLASS_MASTER:Z
       357: ifeq          367
       360: iload_1
       361: sipush        1001
       364: if_icmpeq     368
       367: return
       368: aload_0
       369: invokestatic  #245                // Method showTutorialHtml:(Lext/mods/gameserver/model/actor/Player;)V
       372: return
      LineNumberTable:
        line 139: 0
        line 141: 19
        line 142: 27
        line 144: 31
        line 145: 40
        line 146: 45
        line 148: 50
        line 150: 51
        line 152: 58
        line 153: 63
        line 155: 67
        line 156: 76
        line 157: 81
        line 159: 86
        line 161: 87
        line 163: 94
        line 164: 102
        line 166: 106
        line 167: 115
        line 168: 120
        line 170: 125
        line 172: 126
        line 174: 133
        line 175: 141
        line 177: 145
        line 178: 154
        line 179: 159
        line 181: 164
        line 183: 165
        line 185: 172
        line 186: 180
        line 188: 184
        line 189: 193
        line 190: 198
        line 192: 203
        line 194: 204
        line 196: 211
        line 197: 219
        line 199: 223
        line 200: 232
        line 201: 237
        line 203: 242
        line 205: 243
        line 207: 274
        line 208: 283
        line 209: 291
        line 211: 313
        line 212: 322
        line 214: 327
        line 215: 337
        line 216: 344
        line 218: 350
        line 220: 351
        line 221: 354
        line 222: 367
        line 224: 368
        line 225: 372
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      10     3   msg   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           27      24     2  html   Ljava/lang/String;
           76      10     3   msg   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           63      24     2  html   Ljava/lang/String;
          115      10     3   msg   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          102      24     2  html   Ljava/lang/String;
          154      10     3   msg   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          141      24     2  html   Ljava/lang/String;
          193      10     3   msg   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          180      24     2  html   Ljava/lang/String;
          232      10     3   msg   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          219      24     2  html   Ljava/lang/String;
          337      13     7   msg   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          322      29     6  html   Ljava/lang/String;
          283      68     4 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
          291      60     5  qmId   Ljava/lang/Integer;
          274      77     3  zone   Lext/mods/gameserver/model/zone/type/RandomZone;
            0     373     0 player   Lext/mods/gameserver/model/actor/Player;
            0     373     1 number   I
      StackMapTable: number_of_entries = 18
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/model/actor/Player, int, class java/util/Iterator, class ext/mods/gameserver/model/zone/type/RandomZone, class ext/mods/FarmEventRandom/holder/RandomZoneData, class java/lang/Integer, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 12 /* same */
        frame_type = 0 /* same */

  public static final void showQuestionMark(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=1
         0: getstatic     #142                // Field ext/mods/Config.ALTERNATE_CLASS_MASTER:Z
         3: ifne          7
         6: return
         7: aload_0
         8: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
        11: astore_1
        12: aload_1
        13: invokevirtual #252                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
        16: invokestatic  #257                // Method getMinLevel:(I)I
        19: aload_0
        20: invokevirtual #261                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        23: invokevirtual #265                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        26: if_icmple     30
        29: return
        30: getstatic     #268                // Field ext/mods/Config.CLASS_MASTER_SETTINGS:Lext/mods/Config$ClassMasterSettings;
        33: aload_1
        34: invokevirtual #252                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
        37: iconst_1
        38: iadd
        39: invokevirtual #272                // Method ext/mods/Config$ClassMasterSettings.isAllowed:(I)Z
        42: ifne          46
        45: return
        46: aload_0
        47: new           #278                // class ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
        50: dup
        51: sipush        1001
        54: invokespecial #280                // Method ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
        57: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        60: return
      LineNumberTable:
        line 229: 0
        line 230: 6
        line 232: 7
        line 233: 12
        line 234: 29
        line 236: 30
        line 237: 45
        line 239: 46
        line 240: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0 player   Lext/mods/gameserver/model/actor/Player;
           12      49     1 classId   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 3
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/enums/actors/ClassId ]
        frame_type = 15 /* same */
}
SourceFile: "ClassMaster.java"
BootstrapMethods:
  0: #563 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #559 -\u0001
  1: #563 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #561 html/mods/classmaster/\u0001\u0001.htm
InnerClasses:
  public static final #570= #273 of #111; // ClassMasterSettings=class ext/mods/Config$ClassMasterSettings of class ext/mods/Config
  public static final #575= #571 of #573; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
