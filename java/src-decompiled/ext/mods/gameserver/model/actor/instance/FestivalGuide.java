// Bytecode for: ext.mods.gameserver.model.actor.instance.FestivalGuide
// File: ext\mods\gameserver\model\actor\instance\FestivalGuide.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/FestivalGuide.class
  Last modified 9 de jul de 2026; size 15176 bytes
  MD5 checksum d309b153c341c4d903c47b16b96bf46e
  Compiled from "FestivalGuide.java"
public final class ext.mods.gameserver.model.actor.instance.FestivalGuide extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/FestivalGuide
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 5, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/instance/FestivalGuide.getNpcId:()I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/FestivalGuide
    #9 = NameAndType        #11:#12       // getNpcId:()I
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/FestivalGuide
   #11 = Utf8               getNpcId
   #12 = Utf8               ()I
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/FestivalType.MAX_31:Lext/mods/gameserver/enums/FestivalType;
   #14 = Class              #16           // ext/mods/gameserver/enums/FestivalType
   #15 = NameAndType        #17:#18       // MAX_31:Lext/mods/gameserver/enums/FestivalType;
   #16 = Utf8               ext/mods/gameserver/enums/FestivalType
   #17 = Utf8               MAX_31
   #18 = Utf8               Lext/mods/gameserver/enums/FestivalType;
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/actor/instance/FestivalGuide._festivalType:Lext/mods/gameserver/enums/FestivalType;
   #20 = NameAndType        #21:#18       // _festivalType:Lext/mods/gameserver/enums/FestivalType;
   #21 = Utf8               _festivalType
   #22 = Fieldref           #23.#24       // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
   #23 = Class              #25           // ext/mods/gameserver/enums/CabalType
   #24 = NameAndType        #26:#27       // DAWN:Lext/mods/gameserver/enums/CabalType;
   #25 = Utf8               ext/mods/gameserver/enums/CabalType
   #26 = Utf8               DAWN
   #27 = Utf8               Lext/mods/gameserver/enums/CabalType;
   #28 = Fieldref           #8.#29        // ext/mods/gameserver/model/actor/instance/FestivalGuide._festivalOracle:Lext/mods/gameserver/enums/CabalType;
   #29 = NameAndType        #30:#27       // _festivalOracle:Lext/mods/gameserver/enums/CabalType;
   #30 = Utf8               _festivalOracle
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/model/actor/instance/FestivalGuide._blueStonesNeeded:I
   #32 = NameAndType        #33:#34       // _blueStonesNeeded:I
   #33 = Utf8               _blueStonesNeeded
   #34 = Utf8               I
   #35 = Fieldref           #8.#36        // ext/mods/gameserver/model/actor/instance/FestivalGuide._greenStonesNeeded:I
   #36 = NameAndType        #37:#34       // _greenStonesNeeded:I
   #37 = Utf8               _greenStonesNeeded
   #38 = Fieldref           #8.#39        // ext/mods/gameserver/model/actor/instance/FestivalGuide._redStonesNeeded:I
   #39 = NameAndType        #40:#34       // _redStonesNeeded:I
   #40 = Utf8               _redStonesNeeded
   #41 = Fieldref           #14.#42       // ext/mods/gameserver/enums/FestivalType.MAX_42:Lext/mods/gameserver/enums/FestivalType;
   #42 = NameAndType        #43:#18       // MAX_42:Lext/mods/gameserver/enums/FestivalType;
   #43 = Utf8               MAX_42
   #44 = Fieldref           #14.#45       // ext/mods/gameserver/enums/FestivalType.MAX_53:Lext/mods/gameserver/enums/FestivalType;
   #45 = NameAndType        #46:#18       // MAX_53:Lext/mods/gameserver/enums/FestivalType;
   #46 = Utf8               MAX_53
   #47 = Fieldref           #14.#48       // ext/mods/gameserver/enums/FestivalType.MAX_64:Lext/mods/gameserver/enums/FestivalType;
   #48 = NameAndType        #49:#18       // MAX_64:Lext/mods/gameserver/enums/FestivalType;
   #49 = Utf8               MAX_64
   #50 = Fieldref           #14.#51       // ext/mods/gameserver/enums/FestivalType.MAX_NONE:Lext/mods/gameserver/enums/FestivalType;
   #51 = NameAndType        #52:#18       // MAX_NONE:Lext/mods/gameserver/enums/FestivalType;
   #52 = Utf8               MAX_NONE
   #53 = Fieldref           #23.#54       // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
   #54 = NameAndType        #55:#27       // DUSK:Lext/mods/gameserver/enums/CabalType;
   #55 = Utf8               DUSK
   #56 = String             #57           // FestivalDesc
   #57 = Utf8               FestivalDesc
   #58 = Methodref          #59.#60       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #59 = Class              #61           // java/lang/String
   #60 = NameAndType        #62:#63       // startsWith:(Ljava/lang/String;)Z
   #61 = Utf8               java/lang/String
   #62 = Utf8               startsWith
   #63 = Utf8               (Ljava/lang/String;)Z
   #64 = Methodref          #59.#65       // java/lang/String.substring:(I)Ljava/lang/String;
   #65 = NameAndType        #66:#67       // substring:(I)Ljava/lang/String;
   #66 = Utf8               substring
   #67 = Utf8               (I)Ljava/lang/String;
   #68 = Methodref          #69.#70       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #69 = Class              #71           // java/lang/Integer
   #70 = NameAndType        #72:#73       // parseInt:(Ljava/lang/String;)I
   #71 = Utf8               java/lang/Integer
   #72 = Utf8               parseInt
   #73 = Utf8               (Ljava/lang/String;)I
   #74 = Methodref          #8.#75        // ext/mods/gameserver/model/actor/instance/FestivalGuide.showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
   #75 = NameAndType        #76:#77       // showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
   #76 = Utf8               showChatWindow
   #77 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
   #78 = String             #79           // Festival
   #79 = Utf8               Festival
   #80 = Methodref          #14.#81       // ext/mods/gameserver/enums/FestivalType.ordinal:()I
   #81 = NameAndType        #82:#12       // ordinal:()I
   #82 = Utf8               ordinal
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #84 = Class              #86           // ext/mods/gameserver/model/actor/Player
   #85 = NameAndType        #87:#88       // getParty:()Lext/mods/gameserver/model/group/Party;
   #86 = Utf8               ext/mods/gameserver/model/actor/Player
   #87 = Utf8               getParty
   #88 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #89 = Methodref          #59.#90       // java/lang/String.substring:(II)Ljava/lang/String;
   #90 = NameAndType        #66:#91       // substring:(II)Ljava/lang/String;
   #91 = Utf8               (II)Ljava/lang/String;
   #92 = Methodref          #93.#94       // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #93 = Class              #95           // ext/mods/gameserver/data/manager/SevenSignsManager
   #94 = NameAndType        #96:#97       // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #95 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #96 = Utf8               getInstance
   #97 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #98 = Methodref          #93.#99       // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
   #99 = NameAndType        #100:#101     // isSealValidationPeriod:()Z
  #100 = Utf8               isSealValidationPeriod
  #101 = Utf8               ()Z
  #102 = String             #103          // a
  #103 = Utf8               a
  #104 = Methodref          #105.#106     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #105 = Class              #107          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  #106 = NameAndType        #96:#108      // getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #107 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  #108 = Utf8               ()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #109 = Methodref          #105.#110     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isFestivalInitialized:()Z
  #110 = NameAndType        #111:#101     // isFestivalInitialized:()Z
  #111 = Utf8               isFestivalInitialized
  #112 = String             #113          // You cannot sign up while a festival is in progress.
  #113 = Utf8               You cannot sign up while a festival is in progress.
  #114 = Methodref          #84.#115      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #115 = NameAndType        #116:#117     // sendMessage:(Ljava/lang/String;)V
  #116 = Utf8               sendMessage
  #117 = Utf8               (Ljava/lang/String;)V
  #118 = Methodref          #119.#120     // java/util/Calendar.getInstance:()Ljava/util/Calendar;
  #119 = Class              #121          // java/util/Calendar
  #120 = NameAndType        #96:#122      // getInstance:()Ljava/util/Calendar;
  #121 = Utf8               java/util/Calendar
  #122 = Utf8               ()Ljava/util/Calendar;
  #123 = Methodref          #119.#124     // java/util/Calendar.get:(I)I
  #124 = NameAndType        #125:#126     // get:(I)I
  #125 = Utf8               get
  #126 = Utf8               (I)I
  #127 = String             #128          // b
  #128 = Utf8               b
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #130 = Class              #132          // ext/mods/gameserver/model/group/Party
  #131 = NameAndType        #133:#134     // isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #132 = Utf8               ext/mods/gameserver/model/group/Party
  #133 = Utf8               isLeader
  #134 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #135 = String             #136          // c
  #136 = Utf8               c
  #137 = Methodref          #130.#138     // ext/mods/gameserver/model/group/Party.getMembersCount:()I
  #138 = NameAndType        #139:#12      // getMembersCount:()I
  #139 = Utf8               getMembersCount
  #140 = Fieldref           #141.#142     // ext/mods/Config.FESTIVAL_MIN_PLAYER:I
  #141 = Class              #143          // ext/mods/Config
  #142 = NameAndType        #144:#34      // FESTIVAL_MIN_PLAYER:I
  #143 = Utf8               ext/mods/Config
  #144 = Utf8               FESTIVAL_MIN_PLAYER
  #145 = Methodref          #130.#146     // ext/mods/gameserver/model/group/Party.getLevel:()I
  #146 = NameAndType        #147:#12      // getLevel:()I
  #147 = Utf8               getLevel
  #148 = Methodref          #14.#149      // ext/mods/gameserver/enums/FestivalType.getMaxLevel:()I
  #149 = NameAndType        #150:#12      // getMaxLevel:()I
  #150 = Utf8               getMaxLevel
  #151 = String             #152          // d
  #152 = Utf8               d
  #153 = Methodref          #84.#154      // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
  #154 = NameAndType        #155:#101     // isFestivalParticipant:()Z
  #155 = Utf8               isFestivalParticipant
  #156 = Methodref          #105.#157     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.setParticipants:(Lext/mods/gameserver/enums/CabalType;ILext/mods/gameserver/model/group/Party;)V
  #157 = NameAndType        #158:#159     // setParticipants:(Lext/mods/gameserver/enums/CabalType;ILext/mods/gameserver/model/group/Party;)V
  #158 = Utf8               setParticipants
  #159 = Utf8               (Lext/mods/gameserver/enums/CabalType;ILext/mods/gameserver/model/group/Party;)V
  #160 = String             #161          // f
  #161 = Utf8               f
  #162 = Methodref          #84.#163      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #163 = NameAndType        #164:#165     // destroyItemByItemId:(IIZ)Z
  #164 = Utf8               destroyItemByItemId
  #165 = Utf8               (IIZ)Z
  #166 = Methodref          #105.#167     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.addAccumulatedBonus:(III)V
  #167 = NameAndType        #168:#169     // addAccumulatedBonus:(III)V
  #168 = Utf8               addAccumulatedBonus
  #169 = Utf8               (III)V
  #170 = Methodref          #105.#171     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #171 = NameAndType        #172:#134     // isParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #172 = Utf8               isParticipant
  #173 = Class              #174          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
  #174 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
  #175 = Methodref          #176.#177     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #176 = Class              #178          // java/util/Objects
  #177 = NameAndType        #179:#180     // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #178 = Utf8               java/util/Objects
  #179 = Utf8               requireNonNull
  #180 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #181 = Methodref          #173.#182     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival."<init>":(Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;Lext/mods/gameserver/enums/CabalType;I)V
  #182 = NameAndType        #5:#183       // "<init>":(Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;Lext/mods/gameserver/enums/CabalType;I)V
  #183 = Utf8               (Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;Lext/mods/gameserver/enums/CabalType;I)V
  #184 = Methodref          #185.#186     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager.setFestivalInstance:(ILext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;)V
  #185 = Class              #187          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager
  #186 = NameAndType        #188:#189     // setFestivalInstance:(ILext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;)V
  #187 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager
  #188 = Utf8               setFestivalInstance
  #189 = Utf8               (ILext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;)V
  #190 = Methodref          #191.#192     // ext/mods/gameserver/model/TimeAttackEventRoom.getInstance:()Lext/mods/gameserver/model/TimeAttackEventRoom;
  #191 = Class              #193          // ext/mods/gameserver/model/TimeAttackEventRoom
  #192 = NameAndType        #96:#194      // getInstance:()Lext/mods/gameserver/model/TimeAttackEventRoom;
  #193 = Utf8               ext/mods/gameserver/model/TimeAttackEventRoom
  #194 = Utf8               ()Lext/mods/gameserver/model/TimeAttackEventRoom;
  #195 = Methodref          #23.#81       // ext/mods/gameserver/enums/CabalType.ordinal:()I
  #196 = Methodref          #191.#197     // ext/mods/gameserver/model/TimeAttackEventRoom.addParty:(IILext/mods/gameserver/model/group/Party;)Z
  #197 = NameAndType        #198:#199     // addParty:(IILext/mods/gameserver/model/group/Party;)Z
  #198 = Utf8               addParty
  #199 = Utf8               (IILext/mods/gameserver/model/group/Party;)Z
  #200 = String             #201          // e
  #201 = Utf8               e
  #202 = Methodref          #105.#203     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isFestivalInProgress:()Z
  #203 = NameAndType        #204:#101     // isFestivalInProgress:()Z
  #204 = Utf8               isFestivalInProgress
  #205 = String             #206          // You cannot register a score while a festival is in progress.
  #206 = Utf8               You cannot register a score while a festival is in progress.
  #207 = Methodref          #105.#208     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getPreviousParticipants:(Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
  #208 = NameAndType        #209:#210     // getPreviousParticipants:(Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
  #209 = Utf8               getPreviousParticipants
  #210 = Utf8               (Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
  #211 = InterfaceMethodref #212.#213     // java/util/List.isEmpty:()Z
  #212 = Class              #214          // java/util/List
  #213 = NameAndType        #215:#101     // isEmpty:()Z
  #214 = Utf8               java/util/List
  #215 = Utf8               isEmpty
  #216 = Methodref          #84.#217      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #217 = NameAndType        #218:#12      // getObjectId:()I
  #218 = Utf8               getObjectId
  #219 = Methodref          #69.#220      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #220 = NameAndType        #221:#222     // valueOf:(I)Ljava/lang/Integer;
  #221 = Utf8               valueOf
  #222 = Utf8               (I)Ljava/lang/Integer;
  #223 = InterfaceMethodref #212.#224     // java/util/List.contains:(Ljava/lang/Object;)Z
  #224 = NameAndType        #225:#226     // contains:(Ljava/lang/Object;)Z
  #225 = Utf8               contains
  #226 = Utf8               (Ljava/lang/Object;)Z
  #227 = InterfaceMethodref #212.#228     // java/util/List.get:(I)Ljava/lang/Object;
  #228 = NameAndType        #125:#229     // get:(I)Ljava/lang/Object;
  #229 = Utf8               (I)Ljava/lang/Object;
  #230 = Methodref          #69.#231      // java/lang/Integer.intValue:()I
  #231 = NameAndType        #232:#12      // intValue:()I
  #232 = Utf8               intValue
  #233 = Methodref          #84.#234      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #234 = NameAndType        #235:#236     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #235 = Utf8               getInventory
  #236 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #237 = Methodref          #238.#239     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #238 = Class              #240          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #239 = NameAndType        #241:#242     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #240 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #241 = Utf8               getItemByItemId
  #242 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #243 = String             #244          // You do not have any blood offerings to contribute.
  #244 = Utf8               You do not have any blood offerings to contribute.
  #245 = Methodref          #246.#247     // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #246 = Class              #248          // ext/mods/gameserver/model/item/instance/ItemInstance
  #247 = NameAndType        #249:#12      // getCount:()I
  #248 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #249 = Utf8               getCount
  #250 = Methodref          #84.#251      // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #251 = NameAndType        #252:#253     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #252 = Utf8               destroyItem
  #253 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #254 = Methodref          #105.#255     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.setFinalScore:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/CabalType;Lext/mods/gameserver/enums/FestivalType;I)Z
  #255 = NameAndType        #256:#257     // setFinalScore:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/CabalType;Lext/mods/gameserver/enums/FestivalType;I)Z
  #256 = Utf8               setFinalScore
  #257 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/CabalType;Lext/mods/gameserver/enums/FestivalType;I)Z
  #258 = Fieldref           #259.#260     // ext/mods/gameserver/network/SystemMessageId.CONTRIB_SCORE_INCREASED_S1:Lext/mods/gameserver/network/SystemMessageId;
  #259 = Class              #261          // ext/mods/gameserver/network/SystemMessageId
  #260 = NameAndType        #262:#263     // CONTRIB_SCORE_INCREASED_S1:Lext/mods/gameserver/network/SystemMessageId;
  #261 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #262 = Utf8               CONTRIB_SCORE_INCREASED_S1
  #263 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #264 = Methodref          #265.#266     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #265 = Class              #267          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #266 = NameAndType        #268:#269     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #267 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #268 = Utf8               getSystemMessage
  #269 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #270 = Methodref          #265.#271     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #271 = NameAndType        #272:#273     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #272 = Utf8               addNumber
  #273 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #274 = Methodref          #84.#275      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #275 = NameAndType        #276:#277     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #276 = Utf8               sendPacket
  #277 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #278 = Class              #279          // java/lang/StringBuilder
  #279 = Utf8               java/lang/StringBuilder
  #280 = String             #281          // <html><body>Festival Guide:<br>These are the top scores of the week, for the
  #281 = Utf8               <html><body>Festival Guide:<br>These are the top scores of the week, for the
  #282 = Methodref          #278.#283     // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
  #283 = NameAndType        #5:#117       // "<init>":(Ljava/lang/String;)V
  #284 = Methodref          #105.#285     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getHighestScoreData:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
  #285 = NameAndType        #286:#287     // getHighestScoreData:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
  #286 = Utf8               getHighestScoreData
  #287 = Utf8               (Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
  #288 = Methodref          #105.#289     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getOverallHighestScoreData:(I)Lext/mods/commons/data/StatSet;
  #289 = NameAndType        #290:#291     // getOverallHighestScoreData:(I)Lext/mods/commons/data/StatSet;
  #290 = Utf8               getOverallHighestScoreData
  #291 = Utf8               (I)Lext/mods/commons/data/StatSet;
  #292 = String             #293          // score
  #293 = Utf8               score
  #294 = Methodref          #295.#296     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #295 = Class              #297          // ext/mods/commons/data/StatSet
  #296 = NameAndType        #298:#73      // getInteger:(Ljava/lang/String;)I
  #297 = Utf8               ext/mods/commons/data/StatSet
  #298 = Utf8               getInteger
  #299 = Methodref          #14.#300      // ext/mods/gameserver/enums/FestivalType.getName:()Ljava/lang/String;
  #300 = NameAndType        #301:#302     // getName:()Ljava/lang/String;
  #301 = Utf8               getName
  #302 = Utf8               ()Ljava/lang/String;
  #303 = InvokeDynamic      #0:#304       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #304 = NameAndType        #305:#306     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #305 = Utf8               makeConcatWithConstants
  #306 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #307 = Methodref          #278.#308     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #308 = NameAndType        #309:#310     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #309 = Utf8               append
  #310 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #311 = String             #312          // date
  #312 = Utf8               date
  #313 = Methodref          #295.#314     // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #314 = NameAndType        #315:#306     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #315 = Utf8               getString
  #316 = Methodref          #8.#317       // ext/mods/gameserver/model/actor/instance/FestivalGuide.calculateDate:(Ljava/lang/String;)Ljava/lang/String;
  #317 = NameAndType        #318:#306     // calculateDate:(Ljava/lang/String;)Ljava/lang/String;
  #318 = Utf8               calculateDate
  #319 = String             #320          // members
  #320 = Utf8               members
  #321 = InvokeDynamic      #1:#322       // #1:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #322 = NameAndType        #305:#323     // makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #323 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #324 = String             #325          // Dawn: No record exists. Score 0<br>
  #325 = Utf8               Dawn: No record exists. Score 0<br>
  #326 = InvokeDynamic      #2:#322       // #2:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #327 = String             #328          // Dusk: No record exists. Score 0<br>
  #328 = Utf8               Dusk: No record exists. Score 0<br>
  #329 = String             #330          // Children of Dusk
  #330 = Utf8               Children of Dusk
  #331 = String             #332          // cabal
  #332 = Utf8               cabal
  #333 = String             #334          // dawn
  #334 = Utf8               dawn
  #335 = Methodref          #59.#336      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #336 = NameAndType        #337:#226     // equals:(Ljava/lang/Object;)Z
  #337 = Utf8               equals
  #338 = String             #339          // Children of Dawn
  #339 = Utf8               Children of Dawn
  #340 = InvokeDynamic      #3:#341       // #3:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #341 = NameAndType        #305:#342     // makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #342 = Utf8               (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #343 = String             #344          // Consecutive top scores: No record exists. Score 0<br>
  #344 = Utf8               Consecutive top scores: No record exists. Score 0<br>
  #345 = Methodref          #8.#217       // ext/mods/gameserver/model/actor/instance/FestivalGuide.getObjectId:()I
  #346 = InvokeDynamic      #4:#347       // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #347 = NameAndType        #305:#67      // makeConcatWithConstants:(I)Ljava/lang/String;
  #348 = Class              #349          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #349 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #350 = Methodref          #348.#351     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #351 = NameAndType        #5:#352       // "<init>":(I)V
  #352 = Utf8               (I)V
  #353 = Methodref          #278.#354     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #354 = NameAndType        #355:#302     // toString:()Ljava/lang/String;
  #355 = Utf8               toString
  #356 = Methodref          #348.#357     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #357 = NameAndType        #358:#117     // setHtml:(Ljava/lang/String;)V
  #358 = Utf8               setHtml
  #359 = Methodref          #105.#360     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
  #360 = NameAndType        #361:#362     // updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
  #361 = Utf8               updateParticipants
  #362 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
  #363 = Fieldref           #364.#365     // ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #364 = Class              #366          // ext/mods/gameserver/enums/MessageType
  #365 = NameAndType        #367:#368     // EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #366 = Utf8               ext/mods/gameserver/enums/MessageType
  #367 = Utf8               EXPELLED
  #368 = Utf8               Lext/mods/gameserver/enums/MessageType;
  #369 = Methodref          #130.#370     // ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #370 = NameAndType        #371:#372     // removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #371 = Utf8               removePartyMember
  #372 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #373 = String             #374          // Bonuses cannot be paid during the competition period.
  #374 = Utf8               Bonuses cannot be paid during the competition period.
  #375 = Methodref          #105.#376     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.distribAccumulatedBonus:(Lext/mods/gameserver/model/actor/Player;)I
  #376 = NameAndType        #377:#378     // distribAccumulatedBonus:(Lext/mods/gameserver/model/actor/Player;)I
  #377 = Utf8               distribAccumulatedBonus
  #378 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #379 = Methodref          #2.#380       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #380 = NameAndType        #381:#382     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #381 = Utf8               onBypassFeedback
  #382 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #383 = String             #384          // html/seven_signs/
  #384 = Utf8               html/seven_signs/
  #385 = Methodref          #8.#386       // ext/mods/gameserver/model/actor/instance/FestivalGuide.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #386 = NameAndType        #387:#388     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #387 = Utf8               getTemplate
  #388 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #389 = Methodref          #390.#9       // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
  #390 = Class              #391          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #391 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #392 = InvokeDynamic      #5:#304       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #393 = InvokeDynamic      #6:#304       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #394 = InvokeDynamic      #7:#304       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #395 = Methodref          #84.#396      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #396 = NameAndType        #397:#398     // getLocale:()Ljava/util/Locale;
  #397 = Utf8               getLocale
  #398 = Utf8               ()Ljava/util/Locale;
  #399 = Methodref          #348.#400     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #400 = NameAndType        #401:#402     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #401 = Utf8               setFile
  #402 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #403 = String             #404          // %objectId%
  #404 = Utf8               %objectId%
  #405 = Methodref          #348.#406     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #406 = NameAndType        #407:#408     // replace:(Ljava/lang/String;I)V
  #407 = Utf8               replace
  #408 = Utf8               (Ljava/lang/String;I)V
  #409 = String             #410          // %festivalMins%
  #410 = Utf8               %festivalMins%
  #411 = Methodref          #105.#412     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getTimeToNextFestivalStr:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #412 = NameAndType        #413:#414     // getTimeToNextFestivalStr:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #413 = Utf8               getTimeToNextFestivalStr
  #414 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #415 = Methodref          #348.#416     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #416 = NameAndType        #407:#417     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #417 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #418 = Fieldref           #419.#420     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #419 = Class              #421          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #420 = NameAndType        #422:#423     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #421 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #422 = Utf8               STATIC_PACKET
  #423 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #424 = String             #425          // desc_
  #425 = Utf8               desc_
  #426 = String             #427          // festival_
  #427 = Utf8               festival_
  #428 = InvokeDynamic      #8:#429       // #8:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #429 = NameAndType        #305:#430     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #430 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #431 = Methodref          #59.#432      // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #432 = NameAndType        #221:#433     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #433 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #434 = InvokeDynamic      #9:#435       // #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #435 = NameAndType        #305:#436     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #436 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #437 = String             #438          // %festivalType%
  #438 = Utf8               %festivalType%
  #439 = String             #440          // %cycleMins%
  #440 = Utf8               %cycleMins%
  #441 = Methodref          #105.#442     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getMinsToNextCycle:()I
  #442 = NameAndType        #443:#12      // getMinsToNextCycle:()I
  #443 = Utf8               getMinsToNextCycle
  #444 = String             #445          // 2b
  #445 = Utf8               2b
  #446 = String             #447          // %minFestivalPartyMembers%
  #447 = Utf8               %minFestivalPartyMembers%
  #448 = String             #449          // %blueStoneNeeded%
  #449 = Utf8               %blueStoneNeeded%
  #450 = String             #451          // %greenStoneNeeded%
  #451 = Utf8               %greenStoneNeeded%
  #452 = String             #453          // %redStoneNeeded%
  #453 = Utf8               %redStoneNeeded%
  #454 = String             #455          // %statsTable%
  #455 = Utf8               %statsTable%
  #456 = Methodref          #8.#457       // ext/mods/gameserver/model/actor/instance/FestivalGuide.getStatsTable:()Ljava/lang/String;
  #457 = NameAndType        #458:#302     // getStatsTable:()Ljava/lang/String;
  #458 = Utf8               getStatsTable
  #459 = String             #460          // %bonusTable%
  #460 = Utf8               %bonusTable%
  #461 = Methodref          #8.#462       // ext/mods/gameserver/model/actor/instance/FestivalGuide.getBonusTable:()Ljava/lang/String;
  #462 = NameAndType        #463:#302     // getBonusTable:()Ljava/lang/String;
  #463 = Utf8               getBonusTable
  #464 = Methodref          #278.#465     // java/lang/StringBuilder."<init>":()V
  #465 = NameAndType        #5:#466       // "<init>":()V
  #466 = Utf8               ()V
  #467 = Methodref          #105.#468     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getHighestScore:(Lext/mods/gameserver/enums/CabalType;I)I
  #468 = NameAndType        #469:#470     // getHighestScore:(Lext/mods/gameserver/enums/CabalType;I)I
  #469 = Utf8               getHighestScore
  #470 = Utf8               (Lext/mods/gameserver/enums/CabalType;I)I
  #471 = String             #472          // None
  #472 = Utf8               None
  #473 = Fieldref           #14.#474      // ext/mods/gameserver/enums/FestivalType.VALUES:[Lext/mods/gameserver/enums/FestivalType;
  #474 = NameAndType        #475:#476     // VALUES:[Lext/mods/gameserver/enums/FestivalType;
  #475 = Utf8               VALUES
  #476 = Utf8               [Lext/mods/gameserver/enums/FestivalType;
  #477 = InvokeDynamic      #10:#478      // #10:makeConcatWithConstants:(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;
  #478 = NameAndType        #305:#479     // makeConcatWithConstants:(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;
  #479 = Utf8               (Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;
  #480 = Methodref          #105.#481     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getAccumulatedBonus:(I)I
  #481 = NameAndType        #482:#126     // getAccumulatedBonus:(I)I
  #482 = Utf8               getAccumulatedBonus
  #483 = InvokeDynamic      #11:#484      // #11:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #484 = NameAndType        #305:#485     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #485 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #486 = Methodref          #487.#488     // java/lang/Long.parseLong:(Ljava/lang/String;)J
  #487 = Class              #489          // java/lang/Long
  #488 = NameAndType        #490:#491     // parseLong:(Ljava/lang/String;)J
  #489 = Utf8               java/lang/Long
  #490 = Utf8               parseLong
  #491 = Utf8               (Ljava/lang/String;)J
  #492 = Methodref          #119.#493     // java/util/Calendar.setTimeInMillis:(J)V
  #493 = NameAndType        #494:#495     // setTimeInMillis:(J)V
  #494 = Utf8               setTimeInMillis
  #495 = Utf8               (J)V
  #496 = InvokeDynamic      #12:#497      // #12:makeConcatWithConstants:(III)Ljava/lang/String;
  #497 = NameAndType        #305:#498     // makeConcatWithConstants:(III)Ljava/lang/String;
  #498 = Utf8               (III)Ljava/lang/String;
  #499 = Methodref          #2.#500       // ext/mods/gameserver/model/actor/instance/Folk.onSpawn:()V
  #500 = NameAndType        #501:#466     // onSpawn:()V
  #501 = Utf8               onSpawn
  #502 = Methodref          #503.#504     // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #503 = Class              #505          // ext/mods/gameserver/data/manager/ZoneManager
  #504 = NameAndType        #96:#506      // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #505 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
  #506 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
  #507 = Class              #508          // ext/mods/gameserver/model/zone/type/PeaceZone
  #508 = Utf8               ext/mods/gameserver/model/zone/type/PeaceZone
  #509 = Methodref          #503.#510     // ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #510 = NameAndType        #511:#512     // getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #511 = Utf8               getZone
  #512 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #513 = Methodref          #105.#514     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.addPeaceZone:(Lext/mods/gameserver/model/zone/type/PeaceZone;Z)V
  #514 = NameAndType        #515:#516     // addPeaceZone:(Lext/mods/gameserver/model/zone/type/PeaceZone;Z)V
  #515 = Utf8               addPeaceZone
  #516 = Utf8               (Lext/mods/gameserver/model/zone/type/PeaceZone;Z)V
  #517 = Utf8               Code
  #518 = Utf8               LineNumberTable
  #519 = Utf8               LocalVariableTable
  #520 = Utf8               this
  #521 = Utf8               Lext/mods/gameserver/model/actor/instance/FestivalGuide;
  #522 = Utf8               objectId
  #523 = Utf8               template
  #524 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #525 = Utf8               StackMapTable
  #526 = Utf8               val
  #527 = Utf8               currentMinute
  #528 = Utf8               stoneType
  #529 = Utf8               stonesNeeded
  #530 = Utf8               prevParticipants
  #531 = Utf8               Ljava/util/List;
  #532 = Utf8               bloodOfferings
  #533 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #534 = Utf8               offeringScore
  #535 = Utf8               isHighestScore
  #536 = Utf8               Z
  #537 = Utf8               cabalStr
  #538 = Utf8               Ljava/lang/String;
  #539 = Utf8               sb
  #540 = Utf8               Ljava/lang/StringBuilder;
  #541 = Utf8               dawnData
  #542 = Utf8               Lext/mods/commons/data/StatSet;
  #543 = Utf8               duskData
  #544 = Utf8               overallData
  #545 = Utf8               dawnScore
  #546 = Utf8               duskScore
  #547 = Utf8               html
  #548 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #549 = Utf8               festivalIndex
  #550 = Utf8               playerParty
  #551 = Utf8               Lext/mods/gameserver/model/group/Party;
  #552 = Utf8               player
  #553 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #554 = Utf8               command
  #555 = Utf8               LocalVariableTypeTable
  #556 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #557 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #558 = Utf8               filename
  #559 = Utf8               suffix
  #560 = Utf8               isDescription
  #561 = Class              #562          // java/util/Locale
  #562 = Utf8               java/util/Locale
  #563 = Class              #564          // java/io/Serializable
  #564 = Utf8               java/io/Serializable
  #565 = Utf8               winningCabal
  #566 = Utf8               i
  #567 = Utf8               milliFromEpoch
  #568 = Utf8               numMillis
  #569 = Utf8               J
  #570 = Utf8               calCalc
  #571 = Utf8               Ljava/util/Calendar;
  #572 = Utf8               zone
  #573 = Utf8               Lext/mods/gameserver/model/zone/type/PeaceZone;
  #574 = Utf8               SourceFile
  #575 = Utf8               FestivalGuide.java
  #576 = Utf8               BootstrapMethods
  #577 = String             #578          // \u0001 festival.<br>
  #578 = Utf8               \u0001 festival.<br>
  #579 = String             #580          // Dawn: \u0001. Score \u0001<br>\u0001<br>
  #580 = Utf8               Dawn: \u0001. Score \u0001<br>\u0001<br>
  #581 = String             #582          // Dusk: \u0001. Score \u0001<br>\u0001<br>
  #582 = Utf8               Dusk: \u0001. Score \u0001<br>\u0001<br>
  #583 = String             #584          // Consecutive top scores: \u0001. Score \u0001<br>Affilated side: \u0001<br>\u0001<br>
  #584 = Utf8               Consecutive top scores: \u0001. Score \u0001<br>Affilated side: \u0001<br>\u0001<br>
  #585 = String             #586          // <a action=\"bypass -h npc_\u0001_Chat 0\">Go back.</a></body></html>
  #586 = Utf8               <a action=\"bypass -h npc_\u0001_Chat 0\">Go back.</a></body></html>
  #587 = String             #588          // \u0001festival/dawn_guide.htm
  #588 = Utf8               \u0001festival/dawn_guide.htm
  #589 = String             #590          // \u0001festival/dusk_guide.htm
  #590 = Utf8               \u0001festival/dusk_guide.htm
  #591 = String             #592          // \u0001festival/festival_witch.htm
  #592 = Utf8               \u0001festival/festival_witch.htm
  #593 = String             #594          // \u0001\u0001
  #594 = Utf8               \u0001\u0001
  #595 = String             #596          // html/seven_signs/festival/\u0001\u0001.htm
  #596 = Utf8               html/seven_signs/festival/\u0001\u0001.htm
  #597 = String             #598          // <tr><td width=\"100\" align=\"center\">\u0001</td><td align=\"center\" width=\"35\">\u0001</td><td align=\"center\" width=\"35\">\u0001</td><td align=\"center\" width=\"130\">\u0001</td></tr>
  #598 = Utf8               <tr><td width=\"100\" align=\"center\">\u0001</td><td align=\"center\" width=\"35\">\u0001</td><td align=\"center\" width=\"35\">\u0001</td><td align=\"center\" width=\"130\">\u0001</td></tr>
  #599 = String             #600          // <tr><td align=\"center\" width=\"150\">\u0001</td><td align=\"center\" width=\"150\">\u0001</td></tr>
  #600 = Utf8               <tr><td align=\"center\" width=\"150\">\u0001</td><td align=\"center\" width=\"150\">\u0001</td></tr>
  #601 = String             #602          // \u0001/\u0001/\u0001
  #602 = Utf8               \u0001/\u0001/\u0001
  #603 = MethodHandle       6:#604        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #604 = Methodref          #605.#606     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #605 = Class              #607          // java/lang/invoke/StringConcatFactory
  #606 = NameAndType        #305:#608     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #607 = Utf8               java/lang/invoke/StringConcatFactory
  #608 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #609 = Utf8               InnerClasses
  #610 = Utf8               L2DarknessFestival
  #611 = Utf8               FestivalManager
  #612 = Class              #613          // java/lang/invoke/MethodHandles$Lookup
  #613 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #614 = Class              #615          // java/lang/invoke/MethodHandles
  #615 = Utf8               java/lang/invoke/MethodHandles
  #616 = Utf8               Lookup
{
  protected ext.mods.gameserver.enums.FestivalType _festivalType;
    descriptor: Lext/mods/gameserver/enums/FestivalType;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.enums.CabalType _festivalOracle;
    descriptor: Lext/mods/gameserver/enums/CabalType;
    flags: (0x0004) ACC_PROTECTED

  protected int _blueStonesNeeded;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _greenStonesNeeded;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _redStonesNeeded;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.actor.instance.FestivalGuide(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: invokevirtual #7                  // Method getNpcId:()I
        10: tableswitch   { // 31127 to 31146

                   31127: 104

                   31128: 142

                   31129: 180

                   31130: 218

                   31131: 256

                   31132: 104

                   31133: 142

                   31134: 180

                   31135: 218

                   31136: 256

                   31137: 294

                   31138: 332

                   31139: 370

                   31140: 408

                   31141: 446

                   31142: 294

                   31143: 332

                   31144: 370

                   31145: 408

                   31146: 446
                 default: 481
            }
       104: aload_0
       105: getstatic     #13                 // Field ext/mods/gameserver/enums/FestivalType.MAX_31:Lext/mods/gameserver/enums/FestivalType;
       108: putfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       111: aload_0
       112: getstatic     #22                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       115: putfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       118: aload_0
       119: sipush        900
       122: putfield      #31                 // Field _blueStonesNeeded:I
       125: aload_0
       126: sipush        540
       129: putfield      #35                 // Field _greenStonesNeeded:I
       132: aload_0
       133: sipush        270
       136: putfield      #38                 // Field _redStonesNeeded:I
       139: goto          481
       142: aload_0
       143: getstatic     #41                 // Field ext/mods/gameserver/enums/FestivalType.MAX_42:Lext/mods/gameserver/enums/FestivalType;
       146: putfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       149: aload_0
       150: getstatic     #22                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       153: putfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       156: aload_0
       157: sipush        1500
       160: putfield      #31                 // Field _blueStonesNeeded:I
       163: aload_0
       164: sipush        900
       167: putfield      #35                 // Field _greenStonesNeeded:I
       170: aload_0
       171: sipush        450
       174: putfield      #38                 // Field _redStonesNeeded:I
       177: goto          481
       180: aload_0
       181: getstatic     #44                 // Field ext/mods/gameserver/enums/FestivalType.MAX_53:Lext/mods/gameserver/enums/FestivalType;
       184: putfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       187: aload_0
       188: getstatic     #22                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       191: putfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       194: aload_0
       195: sipush        3000
       198: putfield      #31                 // Field _blueStonesNeeded:I
       201: aload_0
       202: sipush        1800
       205: putfield      #35                 // Field _greenStonesNeeded:I
       208: aload_0
       209: sipush        900
       212: putfield      #38                 // Field _redStonesNeeded:I
       215: goto          481
       218: aload_0
       219: getstatic     #47                 // Field ext/mods/gameserver/enums/FestivalType.MAX_64:Lext/mods/gameserver/enums/FestivalType;
       222: putfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       225: aload_0
       226: getstatic     #22                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       229: putfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       232: aload_0
       233: sipush        4500
       236: putfield      #31                 // Field _blueStonesNeeded:I
       239: aload_0
       240: sipush        2700
       243: putfield      #35                 // Field _greenStonesNeeded:I
       246: aload_0
       247: sipush        1350
       250: putfield      #38                 // Field _redStonesNeeded:I
       253: goto          481
       256: aload_0
       257: getstatic     #50                 // Field ext/mods/gameserver/enums/FestivalType.MAX_NONE:Lext/mods/gameserver/enums/FestivalType;
       260: putfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       263: aload_0
       264: getstatic     #22                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       267: putfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       270: aload_0
       271: sipush        6000
       274: putfield      #31                 // Field _blueStonesNeeded:I
       277: aload_0
       278: sipush        3600
       281: putfield      #35                 // Field _greenStonesNeeded:I
       284: aload_0
       285: sipush        1800
       288: putfield      #38                 // Field _redStonesNeeded:I
       291: goto          481
       294: aload_0
       295: getstatic     #13                 // Field ext/mods/gameserver/enums/FestivalType.MAX_31:Lext/mods/gameserver/enums/FestivalType;
       298: putfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       301: aload_0
       302: getstatic     #53                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       305: putfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       308: aload_0
       309: sipush        900
       312: putfield      #31                 // Field _blueStonesNeeded:I
       315: aload_0
       316: sipush        540
       319: putfield      #35                 // Field _greenStonesNeeded:I
       322: aload_0
       323: sipush        270
       326: putfield      #38                 // Field _redStonesNeeded:I
       329: goto          481
       332: aload_0
       333: getstatic     #41                 // Field ext/mods/gameserver/enums/FestivalType.MAX_42:Lext/mods/gameserver/enums/FestivalType;
       336: putfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       339: aload_0
       340: getstatic     #53                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       343: putfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       346: aload_0
       347: sipush        1500
       350: putfield      #31                 // Field _blueStonesNeeded:I
       353: aload_0
       354: sipush        900
       357: putfield      #35                 // Field _greenStonesNeeded:I
       360: aload_0
       361: sipush        450
       364: putfield      #38                 // Field _redStonesNeeded:I
       367: goto          481
       370: aload_0
       371: getstatic     #44                 // Field ext/mods/gameserver/enums/FestivalType.MAX_53:Lext/mods/gameserver/enums/FestivalType;
       374: putfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       377: aload_0
       378: getstatic     #53                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       381: putfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       384: aload_0
       385: sipush        3000
       388: putfield      #31                 // Field _blueStonesNeeded:I
       391: aload_0
       392: sipush        1800
       395: putfield      #35                 // Field _greenStonesNeeded:I
       398: aload_0
       399: sipush        900
       402: putfield      #38                 // Field _redStonesNeeded:I
       405: goto          481
       408: aload_0
       409: getstatic     #47                 // Field ext/mods/gameserver/enums/FestivalType.MAX_64:Lext/mods/gameserver/enums/FestivalType;
       412: putfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       415: aload_0
       416: getstatic     #53                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       419: putfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       422: aload_0
       423: sipush        4500
       426: putfield      #31                 // Field _blueStonesNeeded:I
       429: aload_0
       430: sipush        2700
       433: putfield      #35                 // Field _greenStonesNeeded:I
       436: aload_0
       437: sipush        1350
       440: putfield      #38                 // Field _redStonesNeeded:I
       443: goto          481
       446: aload_0
       447: getstatic     #50                 // Field ext/mods/gameserver/enums/FestivalType.MAX_NONE:Lext/mods/gameserver/enums/FestivalType;
       450: putfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       453: aload_0
       454: getstatic     #53                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       457: putfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       460: aload_0
       461: sipush        6000
       464: putfield      #31                 // Field _blueStonesNeeded:I
       467: aload_0
       468: sipush        3600
       471: putfield      #35                 // Field _greenStonesNeeded:I
       474: aload_0
       475: sipush        1800
       478: putfield      #38                 // Field _redStonesNeeded:I
       481: return
      LineNumberTable:
        line 54: 0
        line 56: 6
        line 59: 104
        line 60: 111
        line 61: 118
        line 62: 125
        line 63: 132
        line 64: 139
        line 67: 142
        line 68: 149
        line 69: 156
        line 70: 163
        line 71: 170
        line 72: 177
        line 75: 180
        line 76: 187
        line 77: 194
        line 78: 201
        line 79: 208
        line 80: 215
        line 83: 218
        line 84: 225
        line 85: 232
        line 86: 239
        line 87: 246
        line 88: 253
        line 91: 256
        line 92: 263
        line 93: 270
        line 94: 277
        line 95: 284
        line 96: 291
        line 99: 294
        line 100: 301
        line 101: 308
        line 102: 315
        line 103: 322
        line 104: 329
        line 107: 332
        line 108: 339
        line 109: 346
        line 110: 353
        line 111: 360
        line 112: 367
        line 115: 370
        line 116: 377
        line 117: 384
        line 118: 391
        line 119: 398
        line 120: 405
        line 123: 408
        line 124: 415
        line 125: 422
        line 126: 429
        line 127: 436
        line 128: 443
        line 131: 446
        line 132: 453
        line 133: 460
        line 134: 467
        line 135: 474
        line 138: 481
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     482     0  this   Lext/mods/gameserver/model/actor/instance/FestivalGuide;
            0     482     1 objectId   I
            0     482     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
      StackMapTable: number_of_entries = 11
        frame_type = 255 /* full_frame */
          offset_delta = 104
          locals = [ class ext/mods/gameserver/model/actor/instance/FestivalGuide, int, class ext/mods/gameserver/model/actor/template/NpcTemplate ]
          stack = []
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 34 /* same */

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=21, args_size=3
         0: aload_2
         1: ldc           #56                 // String FestivalDesc
         3: invokevirtual #58                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          30
         9: aload_2
        10: bipush        13
        12: invokevirtual #64                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        15: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        18: istore_3
        19: aload_0
        20: aload_1
        21: iload_3
        22: aconst_null
        23: iconst_1
        24: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
        27: goto          1243
        30: aload_2
        31: ldc           #78                 // String Festival
        33: invokevirtual #58                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        36: ifeq          1237
        39: aload_0
        40: getfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
        43: invokevirtual #80                 // Method ext/mods/gameserver/enums/FestivalType.ordinal:()I
        46: istore_3
        47: aload_1
        48: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        51: astore        4
        53: aload_2
        54: bipush        9
        56: bipush        10
        58: invokevirtual #89                 // Method java/lang/String.substring:(II)Ljava/lang/String;
        61: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        64: istore        5
        66: iload         5
        68: tableswitch   { // 0 to 9

                       0: 1174

                       1: 124

                       2: 340

                       3: 568

                       4: 811

                       5: 1225

                       6: 1225

                       7: 1225

                       8: 1225

                       9: 1123
                 default: 1225
            }
       124: invokestatic  #92                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       127: invokevirtual #98                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
       130: ifeq          143
       133: aload_0
       134: aload_1
       135: iconst_2
       136: ldc           #102                // String a
       138: iconst_0
       139: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       142: return
       143: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       146: invokevirtual #109                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isFestivalInitialized:()Z
       149: ifeq          159
       152: aload_1
       153: ldc           #112                // String You cannot sign up while a festival is in progress.
       155: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       158: return
       159: invokestatic  #118                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
       162: bipush        12
       164: invokevirtual #123                // Method java/util/Calendar.get:(I)I
       167: istore        6
       169: iload         6
       171: iflt          181
       174: iload         6
       176: bipush        18
       178: if_icmplt     209
       181: iload         6
       183: bipush        20
       185: if_icmplt     195
       188: iload         6
       190: bipush        38
       192: if_icmplt     209
       195: iload         6
       197: bipush        40
       199: if_icmplt     219
       202: iload         6
       204: bipush        58
       206: if_icmpge     219
       209: aload_0
       210: aload_1
       211: bipush        9
       213: aconst_null
       214: iconst_0
       215: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       218: return
       219: aload         4
       221: ifnonnull     234
       224: aload_0
       225: aload_1
       226: iconst_2
       227: ldc           #127                // String b
       229: iconst_0
       230: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       233: return
       234: aload         4
       236: aload_1
       237: invokevirtual #129                // Method ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
       240: ifne          253
       243: aload_0
       244: aload_1
       245: iconst_2
       246: ldc           #135                // String c
       248: iconst_0
       249: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       252: return
       253: aload         4
       255: invokevirtual #137                // Method ext/mods/gameserver/model/group/Party.getMembersCount:()I
       258: getstatic     #140                // Field ext/mods/Config.FESTIVAL_MIN_PLAYER:I
       261: if_icmpge     274
       264: aload_0
       265: aload_1
       266: iconst_2
       267: ldc           #127                // String b
       269: iconst_0
       270: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       273: return
       274: aload         4
       276: invokevirtual #145                // Method ext/mods/gameserver/model/group/Party.getLevel:()I
       279: aload_0
       280: getfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       283: invokevirtual #148                // Method ext/mods/gameserver/enums/FestivalType.getMaxLevel:()I
       286: if_icmple     299
       289: aload_0
       290: aload_1
       291: iconst_2
       292: ldc           #151                // String d
       294: iconst_0
       295: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       298: return
       299: aload_1
       300: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
       303: ifeq          329
       306: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       309: aload_0
       310: getfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       313: iload_3
       314: aload         4
       316: invokevirtual #156                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.setParticipants:(Lext/mods/gameserver/enums/CabalType;ILext/mods/gameserver/model/group/Party;)V
       319: aload_0
       320: aload_1
       321: iconst_2
       322: ldc           #160                // String f
       324: iconst_0
       325: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       328: return
       329: aload_0
       330: aload_1
       331: iconst_1
       332: aconst_null
       333: iconst_0
       334: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       337: goto          1234
       340: aload_2
       341: bipush        11
       343: invokevirtual #64                 // Method java/lang/String.substring:(I)Ljava/lang/String;
       346: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       349: istore        7
       351: iconst_0
       352: istore        8
       354: iload         7
       356: tableswitch   { // 6360 to 6362

                    6360: 384

                    6361: 393

                    6362: 402
                 default: 408
            }
       384: aload_0
       385: getfield      #31                 // Field _blueStonesNeeded:I
       388: istore        8
       390: goto          408
       393: aload_0
       394: getfield      #35                 // Field _greenStonesNeeded:I
       397: istore        8
       399: goto          408
       402: aload_0
       403: getfield      #38                 // Field _redStonesNeeded:I
       406: istore        8
       408: aload_1
       409: iload         7
       411: iload         8
       413: iconst_1
       414: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       417: ifne          421
       420: return
       421: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       424: aload_0
       425: getfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       428: iload_3
       429: aload         4
       431: invokevirtual #156                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.setParticipants:(Lext/mods/gameserver/enums/CabalType;ILext/mods/gameserver/model/group/Party;)V
       434: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       437: iload_3
       438: iload         7
       440: iload         8
       442: invokevirtual #166                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.addAccumulatedBonus:(III)V
       445: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       448: aload_1
       449: invokevirtual #170                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       452: ifeq          491
       455: aload_0
       456: getfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       459: getstatic     #53                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       462: if_acmpne     491
       465: bipush        10
       467: iload_3
       468: iadd
       469: new           #173                // class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
       472: dup
       473: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       476: dup
       477: invokestatic  #175                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
       480: pop
       481: getstatic     #53                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       484: iload_3
       485: invokespecial #181                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival."<init>":(Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;Lext/mods/gameserver/enums/CabalType;I)V
       488: invokestatic  #184                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager.setFestivalInstance:(ILext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;)V
       491: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       494: aload_1
       495: invokevirtual #170                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       498: ifeq          537
       501: aload_0
       502: getfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       505: getstatic     #22                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       508: if_acmpne     537
       511: bipush        20
       513: iload_3
       514: iadd
       515: new           #173                // class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
       518: dup
       519: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       522: dup
       523: invokestatic  #175                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
       526: pop
       527: getstatic     #22                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       530: iload_3
       531: invokespecial #181                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival."<init>":(Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;Lext/mods/gameserver/enums/CabalType;I)V
       534: invokestatic  #184                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager.setFestivalInstance:(ILext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;)V
       537: invokestatic  #190                // Method ext/mods/gameserver/model/TimeAttackEventRoom.getInstance:()Lext/mods/gameserver/model/TimeAttackEventRoom;
       540: iload_3
       541: iconst_1
       542: iadd
       543: aload_0
       544: getfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       547: invokevirtual #195                // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
       550: aload         4
       552: invokevirtual #196                // Method ext/mods/gameserver/model/TimeAttackEventRoom.addParty:(IILext/mods/gameserver/model/group/Party;)Z
       555: pop
       556: aload_0
       557: aload_1
       558: iconst_2
       559: ldc           #200                // String e
       561: iconst_0
       562: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       565: goto          1234
       568: invokestatic  #92                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       571: invokevirtual #98                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
       574: ifeq          587
       577: aload_0
       578: aload_1
       579: iconst_3
       580: ldc           #102                // String a
       582: iconst_0
       583: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       586: return
       587: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       590: invokevirtual #202                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isFestivalInProgress:()Z
       593: ifeq          603
       596: aload_1
       597: ldc           #205                // String You cannot register a score while a festival is in progress.
       599: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       602: return
       603: aload         4
       605: ifnonnull     618
       608: aload_0
       609: aload_1
       610: iconst_3
       611: ldc           #127                // String b
       613: iconst_0
       614: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       617: return
       618: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       621: aload_0
       622: getfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       625: iload_3
       626: invokevirtual #207                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getPreviousParticipants:(Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
       629: astore        9
       631: aload         9
       633: ifnull        663
       636: aload         9
       638: invokeinterface #211,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       643: ifne          663
       646: aload         9
       648: aload_1
       649: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       652: invokestatic  #219                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       655: invokeinterface #223,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       660: ifne          673
       663: aload_0
       664: aload_1
       665: iconst_3
       666: ldc           #127                // String b
       668: iconst_0
       669: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       672: return
       673: aload_1
       674: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       677: aload         9
       679: iconst_0
       680: invokeinterface #227,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       685: checkcast     #69                 // class java/lang/Integer
       688: invokevirtual #230                // Method java/lang/Integer.intValue:()I
       691: if_icmpeq     704
       694: aload_0
       695: aload_1
       696: iconst_3
       697: ldc           #127                // String b
       699: iconst_0
       700: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       703: return
       704: aload_1
       705: invokevirtual #233                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       708: sipush        5901
       711: invokevirtual #237                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       714: astore        10
       716: aload         10
       718: ifnonnull     728
       721: aload_1
       722: ldc           #243                // String You do not have any blood offerings to contribute.
       724: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       727: return
       728: aload         10
       730: invokevirtual #245                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       733: iconst_5
       734: imul
       735: istore        11
       737: aload_1
       738: aload         10
       740: iconst_0
       741: invokevirtual #250                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
       744: ifne          748
       747: return
       748: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       751: aload_1
       752: aload_0
       753: getfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
       756: aload_0
       757: getfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       760: iload         11
       762: invokevirtual #254                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.setFinalScore:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/CabalType;Lext/mods/gameserver/enums/FestivalType;I)Z
       765: istore        12
       767: aload_1
       768: getstatic     #258                // Field ext/mods/gameserver/network/SystemMessageId.CONTRIB_SCORE_INCREASED_S1:Lext/mods/gameserver/network/SystemMessageId;
       771: invokestatic  #264                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       774: iload         11
       776: invokevirtual #270                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       779: invokevirtual #274                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       782: iload         12
       784: ifeq          799
       787: aload_0
       788: aload_1
       789: iconst_3
       790: ldc           #135                // String c
       792: iconst_0
       793: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       796: goto          1234
       799: aload_0
       800: aload_1
       801: iconst_3
       802: ldc           #151                // String d
       804: iconst_0
       805: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
       808: goto          1234
       811: new           #278                // class java/lang/StringBuilder
       814: dup
       815: ldc_w         #280                // String <html><body>Festival Guide:<br>These are the top scores of the week, for the
       818: invokespecial #282                // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
       821: astore        13
       823: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       826: getstatic     #22                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       829: iload_3
       830: invokevirtual #284                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getHighestScoreData:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
       833: astore        14
       835: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       838: getstatic     #53                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       841: iload_3
       842: invokevirtual #284                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getHighestScoreData:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
       845: astore        15
       847: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       850: iload_3
       851: invokevirtual #288                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getOverallHighestScoreData:(I)Lext/mods/commons/data/StatSet;
       854: astore        16
       856: aload         14
       858: ldc_w         #292                // String score
       861: invokevirtual #294                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       864: istore        17
       866: aload         15
       868: ldc_w         #292                // String score
       871: invokevirtual #294                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       874: istore        18
       876: aload         13
       878: aload_0
       879: getfield      #19                 // Field _festivalType:Lext/mods/gameserver/enums/FestivalType;
       882: invokevirtual #299                // Method ext/mods/gameserver/enums/FestivalType.getName:()Ljava/lang/String;
       885: invokedynamic #303,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       890: invokevirtual #307                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       893: pop
       894: iload         17
       896: ifle          934
       899: aload         13
       901: aload         14
       903: ldc_w         #311                // String date
       906: invokevirtual #313                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       909: invokestatic  #316                // Method calculateDate:(Ljava/lang/String;)Ljava/lang/String;
       912: iload         17
       914: aload         14
       916: ldc_w         #319                // String members
       919: invokevirtual #313                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       922: invokedynamic #321,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
       927: invokevirtual #307                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       930: pop
       931: goto          943
       934: aload         13
       936: ldc_w         #324                // String Dawn: No record exists. Score 0<br>
       939: invokevirtual #307                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       942: pop
       943: iload         18
       945: ifle          983
       948: aload         13
       950: aload         15
       952: ldc_w         #311                // String date
       955: invokevirtual #313                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       958: invokestatic  #316                // Method calculateDate:(Ljava/lang/String;)Ljava/lang/String;
       961: iload         18
       963: aload         15
       965: ldc_w         #319                // String members
       968: invokevirtual #313                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       971: invokedynamic #326,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
       976: invokevirtual #307                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       979: pop
       980: goto          992
       983: aload         13
       985: ldc_w         #327                // String Dusk: No record exists. Score 0<br>
       988: invokevirtual #307                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       991: pop
       992: aload         16
       994: ifnull        1067
       997: ldc_w         #329                // String Children of Dusk
      1000: astore        19
      1002: aload         16
      1004: ldc_w         #331                // String cabal
      1007: invokevirtual #313                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
      1010: ldc_w         #333                // String dawn
      1013: invokevirtual #335                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1016: ifeq          1024
      1019: ldc_w         #338                // String Children of Dawn
      1022: astore        19
      1024: aload         13
      1026: aload         16
      1028: ldc_w         #311                // String date
      1031: invokevirtual #313                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
      1034: invokestatic  #316                // Method calculateDate:(Ljava/lang/String;)Ljava/lang/String;
      1037: aload         16
      1039: ldc_w         #292                // String score
      1042: invokevirtual #294                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
      1045: aload         19
      1047: aload         16
      1049: ldc_w         #319                // String members
      1052: invokevirtual #313                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
      1055: invokedynamic #340,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1060: invokevirtual #307                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1063: pop
      1064: goto          1076
      1067: aload         13
      1069: ldc_w         #343                // String Consecutive top scores: No record exists. Score 0<br>
      1072: invokevirtual #307                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1075: pop
      1076: aload         13
      1078: aload_0
      1079: invokevirtual #345                // Method getObjectId:()I
      1082: invokedynamic #346,  0            // InvokeDynamic #4:makeConcatWithConstants:(I)Ljava/lang/String;
      1087: invokevirtual #307                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      1090: pop
      1091: new           #348                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1094: dup
      1095: aload_0
      1096: invokevirtual #345                // Method getObjectId:()I
      1099: invokespecial #350                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1102: astore        19
      1104: aload         19
      1106: aload         13
      1108: invokevirtual #353                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      1111: invokevirtual #356                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
      1114: aload_1
      1115: aload         19
      1117: invokevirtual #274                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1120: goto          1234
      1123: aload         4
      1125: ifnonnull     1129
      1128: return
      1129: aload         4
      1131: aload_1
      1132: invokevirtual #129                // Method ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
      1135: istore        20
      1137: iload         20
      1139: ifeq          1153
      1142: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
      1145: aload_1
      1146: aconst_null
      1147: invokevirtual #359                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
      1150: goto          1234
      1153: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
      1156: aload_1
      1157: aload         4
      1159: invokevirtual #359                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
      1162: aload         4
      1164: aload_1
      1165: getstatic     #363                // Field ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
      1168: invokevirtual #369                // Method ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
      1171: goto          1234
      1174: invokestatic  #92                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
      1177: invokevirtual #98                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
      1180: ifne          1191
      1183: aload_1
      1184: ldc_w         #373                // String Bonuses cannot be paid during the competition period.
      1187: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1190: return
      1191: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
      1194: aload_1
      1195: invokevirtual #375                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.distribAccumulatedBonus:(Lext/mods/gameserver/model/actor/Player;)I
      1198: ifle          1213
      1201: aload_0
      1202: aload_1
      1203: iconst_0
      1204: ldc           #102                // String a
      1206: iconst_0
      1207: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
      1210: goto          1234
      1213: aload_0
      1214: aload_1
      1215: iconst_0
      1216: ldc           #127                // String b
      1218: iconst_0
      1219: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
      1222: goto          1234
      1225: aload_0
      1226: aload_1
      1227: iload         5
      1229: aconst_null
      1230: iconst_0
      1231: invokevirtual #74                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;Z)V
      1234: goto          1243
      1237: aload_0
      1238: aload_1
      1239: aload_2
      1240: invokespecial #379                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1243: return
      LineNumberTable:
        line 143: 0
        line 145: 9
        line 147: 19
        line 148: 27
        line 149: 30
        line 151: 39
        line 153: 47
        line 154: 53
        line 156: 66
        line 159: 124
        line 161: 133
        line 162: 142
        line 165: 143
        line 167: 152
        line 168: 158
        line 171: 159
        line 172: 169
        line 174: 209
        line 175: 218
        line 178: 219
        line 180: 224
        line 181: 233
        line 184: 234
        line 186: 243
        line 187: 252
        line 190: 253
        line 192: 264
        line 193: 273
        line 196: 274
        line 198: 289
        line 199: 298
        line 202: 299
        line 204: 306
        line 205: 319
        line 206: 328
        line 209: 329
        line 210: 337
        line 212: 340
        line 213: 351
        line 215: 354
        line 218: 384
        line 219: 390
        line 221: 393
        line 222: 399
        line 224: 402
        line 228: 408
        line 229: 420
        line 231: 421
        line 232: 434
        line 234: 445
        line 235: 465
        line 237: 491
        line 238: 511
        line 240: 537
        line 242: 556
        line 243: 565
        line 245: 568
        line 247: 577
        line 248: 586
        line 251: 587
        line 253: 596
        line 254: 602
        line 257: 603
        line 259: 608
        line 260: 617
        line 263: 618
        line 265: 631
        line 267: 663
        line 268: 672
        line 271: 673
        line 273: 694
        line 274: 703
        line 277: 704
        line 279: 716
        line 281: 721
        line 282: 727
        line 285: 728
        line 286: 737
        line 287: 747
        line 289: 748
        line 291: 767
        line 293: 782
        line 294: 787
        line 296: 799
        line 297: 808
        line 299: 811
        line 301: 823
        line 302: 835
        line 303: 847
        line 305: 856
        line 306: 866
        line 308: 876
        line 310: 894
        line 311: 899
        line 313: 934
        line 315: 943
        line 316: 948
        line 318: 983
        line 320: 992
        line 322: 997
        line 324: 1002
        line 325: 1019
        line 327: 1024
        line 328: 1064
        line 330: 1067
        line 332: 1076
        line 334: 1091
        line 335: 1104
        line 336: 1114
        line 337: 1120
        line 339: 1123
        line 340: 1128
        line 345: 1129
        line 347: 1137
        line 349: 1142
        line 353: 1153
        line 354: 1162
        line 356: 1171
        line 358: 1174
        line 360: 1183
        line 361: 1190
        line 364: 1191
        line 365: 1201
        line 367: 1213
        line 368: 1222
        line 370: 1225
        line 372: 1234
        line 375: 1237
        line 377: 1243
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19       8     3   val   I
          169     171     6 currentMinute   I
          351     217     7 stoneType   I
          354     214     8 stonesNeeded   I
          631     180     9 prevParticipants   Ljava/util/List;
          716      95    10 bloodOfferings   Lext/mods/gameserver/model/item/instance/ItemInstance;
          737      74    11 offeringScore   I
          767      44    12 isHighestScore   Z
         1002      62    19 cabalStr   Ljava/lang/String;
          823     300    13    sb   Ljava/lang/StringBuilder;
          835     288    14 dawnData   Lext/mods/commons/data/StatSet;
          847     276    15 duskData   Lext/mods/commons/data/StatSet;
          856     267    16 overallData   Lext/mods/commons/data/StatSet;
          866     257    17 dawnScore   I
          876     247    18 duskScore   I
         1104      19    19  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1137      37    20 isLeader   Z
           47    1187     3 festivalIndex   I
           53    1181     4 playerParty   Lext/mods/gameserver/model/group/Party;
           66    1168     5   val   I
            0    1244     0  this   Lext/mods/gameserver/model/actor/instance/FestivalGuide;
            0    1244     1 player   Lext/mods/gameserver/model/actor/Player;
            0    1244     2 command   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          631     180     9 prevParticipants   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 49
        frame_type = 30 /* same */
        frame_type = 254 /* append */
          offset_delta = 93
          locals = [ int, class ext/mods/gameserver/model/group/Party, int ]
        frame_type = 18 /* same */
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 9 /* same */
        frame_type = 14 /* same */
        frame_type = 18 /* same */
        frame_type = 20 /* same */
        frame_type = 24 /* same */
        frame_type = 29 /* same */
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 254 /* append */
          offset_delta = 43
          locals = [ top, int, int ]
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 5 /* same */
        frame_type = 12 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 69
        frame_type = 45 /* same */
        frame_type = 248 /* chop */
          offset_delta = 30
        frame_type = 18 /* same */
        frame_type = 15 /* same */
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/actor/instance/FestivalGuide, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/group/Party, int, top, top, top, class java/util/List ]
          stack = []
        frame_type = 9 /* same */
        frame_type = 30 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/actor/instance/FestivalGuide, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/group/Party, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 122
          locals = [ class ext/mods/gameserver/model/actor/instance/FestivalGuide, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/group/Party, int, top, top, top, top, top, top, top, class java/lang/StringBuilder, class ext/mods/commons/data/StatSet, class ext/mods/commons/data/StatSet, class ext/mods/commons/data/StatSet, int, int ]
          stack = []
        frame_type = 8 /* same */
        frame_type = 39 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 42
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/model/actor/instance/FestivalGuide, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/group/Party, int ]
          stack = []
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/actor/instance/FestivalGuide, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/group/Party, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/instance/FestivalGuide, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/model/group/Party, int ]
          stack = []
        frame_type = 16 /* same */
        frame_type = 21 /* same */
        frame_type = 11 /* same */
        frame_type = 248 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: ldc_w         #383                // String html/seven_signs/
         3: astore_3
         4: aload_0
         5: invokevirtual #385                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         8: invokevirtual #389                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        11: tableswitch   { // 31127 to 31146

                   31127: 104

                   31128: 104

                   31129: 104

                   31130: 104

                   31131: 104

                   31132: 124

                   31133: 124

                   31134: 124

                   31135: 124

                   31136: 124

                   31137: 114

                   31138: 114

                   31139: 114

                   31140: 114

                   31141: 114

                   31142: 124

                   31143: 124

                   31144: 124

                   31145: 124

                   31146: 124
                 default: 131
            }
       104: aload_3
       105: invokedynamic #392,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       110: astore_3
       111: goto          131
       114: aload_3
       115: invokedynamic #393,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       120: astore_3
       121: goto          131
       124: aload_3
       125: invokedynamic #394,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       130: astore_3
       131: new           #348                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       134: dup
       135: aload_0
       136: invokevirtual #345                // Method getObjectId:()I
       139: invokespecial #350                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       142: astore        4
       144: aload         4
       146: aload_1
       147: invokevirtual #395                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       150: aload_3
       151: invokevirtual #399                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       154: aload         4
       156: ldc_w         #403                // String %objectId%
       159: aload_0
       160: invokevirtual #345                // Method getObjectId:()I
       163: invokevirtual #405                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       166: aload         4
       168: ldc_w         #409                // String %festivalMins%
       171: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       174: aload_1
       175: invokevirtual #411                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getTimeToNextFestivalStr:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       178: invokevirtual #415                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       181: aload_1
       182: aload         4
       184: invokevirtual #274                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       187: aload_1
       188: getstatic     #418                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       191: invokevirtual #274                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       194: return
      LineNumberTable:
        line 382: 0
        line 384: 4
        line 387: 104
        line 388: 111
        line 391: 114
        line 392: 121
        line 395: 124
        line 399: 131
        line 400: 144
        line 401: 154
        line 402: 166
        line 403: 181
        line 405: 187
        line 406: 194
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     195     0  this   Lext/mods/gameserver/model/actor/instance/FestivalGuide;
            0     195     1 player   Lext/mods/gameserver/model/actor/Player;
            0     195     2   val   I
            4     191     3 filename   Ljava/lang/String;
          144      51     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 104
          locals = [ class java/lang/String ]
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 6 /* same */

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: invokespecial #499                // Method ext/mods/gameserver/model/actor/instance/Folk.onSpawn:()V
         4: invokestatic  #502                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
         7: aload_0
         8: ldc_w         #507                // class ext/mods/gameserver/model/zone/type/PeaceZone
        11: invokevirtual #509                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        14: checkcast     #507                // class ext/mods/gameserver/model/zone/type/PeaceZone
        17: astore_1
        18: aload_1
        19: ifnull        44
        22: invokestatic  #104                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
        25: aload_1
        26: aload_0
        27: getfield      #28                 // Field _festivalOracle:Lext/mods/gameserver/enums/CabalType;
        30: getstatic     #22                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        33: if_acmpne     40
        36: iconst_1
        37: goto          41
        40: iconst_0
        41: invokevirtual #513                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.addPeaceZone:(Lext/mods/gameserver/model/zone/type/PeaceZone;Z)V
        44: return
      LineNumberTable:
        line 476: 0
        line 478: 4
        line 480: 18
        line 481: 22
        line 482: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/instance/FestivalGuide;
           18      27     1  zone   Lext/mods/gameserver/model/zone/type/PeaceZone;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/actor/instance/FestivalGuide, class ext/mods/gameserver/model/zone/type/PeaceZone ]
          stack = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class ext/mods/gameserver/model/zone/type/PeaceZone ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/FestivalGuide, class ext/mods/gameserver/model/zone/type/PeaceZone ]
          stack = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class ext/mods/gameserver/model/zone/type/PeaceZone, int ]
        frame_type = 2 /* same */
}
SourceFile: "FestivalGuide.java"
BootstrapMethods:
  0: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #577 \u0001 festival.<br>
  1: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #579 Dawn: \u0001. Score \u0001<br>\u0001<br>
  2: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #581 Dusk: \u0001. Score \u0001<br>\u0001<br>
  3: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #583 Consecutive top scores: \u0001. Score \u0001<br>Affilated side: \u0001<br>\u0001<br>
  4: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #585 <a action=\"bypass -h npc_\u0001_Chat 0\">Go back.</a></body></html>
  5: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #587 \u0001festival/dawn_guide.htm
  6: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #589 \u0001festival/dusk_guide.htm
  7: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #591 \u0001festival/festival_witch.htm
  8: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #593 \u0001\u0001
  9: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #595 html/seven_signs/festival/\u0001\u0001.htm
  10: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #597 <tr><td width=\"100\" align=\"center\">\u0001</td><td align=\"center\" width=\"35\">\u0001</td><td align=\"center\" width=\"35\">\u0001</td><td align=\"center\" width=\"130\">\u0001</td></tr>
  11: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #599 <tr><td align=\"center\" width=\"150\">\u0001</td><td align=\"center\" width=\"150\">\u0001</td></tr>
  12: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #601 \u0001/\u0001/\u0001
InnerClasses:
  public #610= #173 of #105;              // L2DarknessFestival=class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival of class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  public #611= #185 of #105;              // FestivalManager=class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager of class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  public static final #616= #612 of #614; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
