// Bytecode for: ext.mods.gameserver.model.actor.instance.OlympiadManagerNpc
// File: ext\mods\gameserver\model\actor\instance\OlympiadManagerNpc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc.class
  Last modified 9 de jul de 2026; size 10192 bytes
  MD5 checksum a05e6fb5eddac561acefc30da8ea32e3
  Compiled from "OlympiadManagerNpc.java"
public class ext.mods.gameserver.model.actor.instance.OlympiadManagerNpc extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 2, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc._managers:Ljava/util/List;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc
    #9 = NameAndType        #11:#12       // _managers:Ljava/util/List;
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc
   #11 = Utf8               _managers
   #12 = Utf8               Ljava/util/List;
   #13 = String             #14           // noble
   #14 = Utf8               noble
   #15 = InvokeDynamic      #0:#16        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #16 = NameAndType        #17:#18       // makeConcatWithConstants:(I)Ljava/lang/String;
   #17 = Utf8               makeConcatWithConstants
   #18 = Utf8               (I)Ljava/lang/String;
   #19 = InvokeDynamic      #1:#20        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #20 = NameAndType        #17:#21       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #21 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #22 = Methodref          #8.#23        // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #23 = NameAndType        #24:#25       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #24 = Utf8               getTemplate
   #25 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #26 = Methodref          #27.#28       // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
   #27 = Class              #29           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #28 = NameAndType        #30:#31       // getNpcId:()I
   #29 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #30 = Utf8               getNpcId
   #31 = Utf8               ()I
   #32 = Methodref          #8.#33        // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #33 = NameAndType        #34:#35       // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #34 = Utf8               getHtmlPath
   #35 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #36 = Methodref          #37.#38       // ext/mods/gameserver/model/actor/Player.isNoble:()Z
   #37 = Class              #39           // ext/mods/gameserver/model/actor/Player
   #38 = NameAndType        #40:#41       // isNoble:()Z
   #39 = Utf8               ext/mods/gameserver/model/actor/Player
   #40 = Utf8               isNoble
   #41 = Utf8               ()Z
   #42 = String             #43           // noble_main.htm
   #43 = Utf8               noble_main.htm
   #44 = Methodref          #37.#45       // ext/mods/gameserver/model/actor/Player.isHero:()Z
   #45 = NameAndType        #46:#41       // isHero:()Z
   #46 = Utf8               isHero
   #47 = Methodref          #48.#49       // ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
   #48 = Class              #50           // ext/mods/gameserver/data/manager/HeroManager
   #49 = NameAndType        #51:#52       // getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
   #50 = Utf8               ext/mods/gameserver/data/manager/HeroManager
   #51 = Utf8               getInstance
   #52 = Utf8               ()Lext/mods/gameserver/data/manager/HeroManager;
   #53 = Methodref          #37.#54       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #54 = NameAndType        #55:#31       // getObjectId:()I
   #55 = Utf8               getObjectId
   #56 = Methodref          #48.#57       // ext/mods/gameserver/data/manager/HeroManager.isInactiveHero:(I)Z
   #57 = NameAndType        #58:#59       // isInactiveHero:(I)Z
   #58 = Utf8               isInactiveHero
   #59 = Utf8               (I)Z
   #60 = String             #61           // hero_main.htm
   #61 = Utf8               hero_main.htm
   #62 = String             #63           // hero_main2.htm
   #63 = Utf8               hero_main2.htm
   #64 = Class              #65           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #65 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #66 = Methodref          #8.#54        // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc.getObjectId:()I
   #67 = Methodref          #64.#68       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #68 = NameAndType        #5:#69        // "<init>":(I)V
   #69 = Utf8               (I)V
   #70 = Methodref          #37.#71       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #71 = NameAndType        #72:#73       // getLocale:()Ljava/util/Locale;
   #72 = Utf8               getLocale
   #73 = Utf8               ()Ljava/util/Locale;
   #74 = InvokeDynamic      #2:#20        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #75 = Methodref          #64.#76       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #76 = NameAndType        #77:#78       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #77 = Utf8               setFile
   #78 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #79 = Methodref          #80.#81       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #80 = Class              #82           // java/lang/String
   #81 = NameAndType        #83:#84       // equals:(Ljava/lang/Object;)Z
   #82 = Utf8               java/lang/String
   #83 = Utf8               equals
   #84 = Utf8               (Ljava/lang/Object;)Z
   #85 = String             #86           //
   #86 = Utf8
   #87 = String             #88           // <a action=\"bypass -h npc_%objectId%_Olympiad 5\">\"I want to be a Hero.\"</a><br>
   #88 = Utf8               <a action=\"bypass -h npc_%objectId%_Olympiad 5\">\"I want to be a Hero.\"</a><br>
   #89 = String             #90           // %hero%
   #90 = Utf8               %hero%
   #91 = Methodref          #64.#92       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #92 = NameAndType        #93:#94       // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #93 = Utf8               replace
   #94 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #95 = String             #96           // %objectId%
   #96 = Utf8               %objectId%
   #97 = Methodref          #64.#98       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #98 = NameAndType        #93:#99       // replace:(Ljava/lang/String;I)V
   #99 = Utf8               (Ljava/lang/String;I)V
  #100 = Methodref          #37.#101      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #101 = NameAndType        #102:#103     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = Utf8               sendPacket
  #103 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #104 = Fieldref           #105.#106     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #105 = Class              #107          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #106 = NameAndType        #108:#109     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #107 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #108 = Utf8               STATIC_PACKET
  #109 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #110 = String             #111          // OlympiadNoble
  #111 = Utf8               OlympiadNoble
  #112 = Methodref          #80.#113      // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #113 = NameAndType        #114:#115     // startsWith:(Ljava/lang/String;)Z
  #114 = Utf8               startsWith
  #115 = Utf8               (Ljava/lang/String;)Z
  #116 = Methodref          #37.#117      // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #117 = NameAndType        #118:#41      // isCursedWeaponEquipped:()Z
  #118 = Utf8               isCursedWeaponEquipped
  #119 = Class              #120          // ext/mods/gameserver/model/olympiad/Olympiad
  #120 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
  #121 = String             #122          // html/olympiad/noble_cant_cw.htm
  #122 = Utf8               html/olympiad/noble_cant_cw.htm
  #123 = Methodref          #37.#124      // ext/mods/gameserver/model/actor/Player.getClassIndex:()I
  #124 = NameAndType        #125:#31      // getClassIndex:()I
  #125 = Utf8               getClassIndex
  #126 = String             #127          // html/olympiad/noble_cant_sub.htm
  #127 = Utf8               html/olympiad/noble_cant_sub.htm
  #128 = Methodref          #37.#129      // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #129 = NameAndType        #130:#131     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #130 = Utf8               getClassId
  #131 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #132 = Methodref          #133.#134     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #133 = Class              #135          // ext/mods/gameserver/enums/actors/ClassId
  #134 = NameAndType        #136:#31      // getLevel:()I
  #135 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #136 = Utf8               getLevel
  #137 = String             #138          // html/olympiad/noble_cant_thirdclass.htm
  #138 = Utf8               html/olympiad/noble_cant_thirdclass.htm
  #139 = Methodref          #80.#140      // java/lang/String.substring:(I)Ljava/lang/String;
  #140 = NameAndType        #141:#18      // substring:(I)Ljava/lang/String;
  #141 = Utf8               substring
  #142 = Methodref          #143.#144     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #143 = Class              #145          // java/lang/Integer
  #144 = NameAndType        #146:#147     // parseInt:(Ljava/lang/String;)I
  #145 = Utf8               java/lang/Integer
  #146 = Utf8               parseInt
  #147 = Utf8               (Ljava/lang/String;)I
  #148 = Methodref          #149.#150     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #149 = Class              #151          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #150 = NameAndType        #51:#152      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #151 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #152 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #153 = Methodref          #149.#154     // ext/mods/gameserver/model/olympiad/OlympiadManager.unRegisterNoble:(Lext/mods/gameserver/model/actor/Player;)Z
  #154 = NameAndType        #155:#156     // unRegisterNoble:(Lext/mods/gameserver/model/actor/Player;)Z
  #155 = Utf8               unRegisterNoble
  #156 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #157 = Methodref          #149.#158     // ext/mods/gameserver/model/olympiad/OlympiadManager.getNonClassBasedParticipants:()Ljava/util/List;
  #158 = NameAndType        #159:#160     // getNonClassBasedParticipants:()Ljava/util/List;
  #159 = Utf8               getNonClassBasedParticipants
  #160 = Utf8               ()Ljava/util/List;
  #161 = InterfaceMethodref #162.#163     // java/util/List.size:()I
  #162 = Class              #164          // java/util/List
  #163 = NameAndType        #165:#31      // size:()I
  #164 = Utf8               java/util/List
  #165 = Utf8               size
  #166 = Methodref          #149.#167     // ext/mods/gameserver/model/olympiad/OlympiadManager.getClassBasedParticipants:()Ljava/util/Map;
  #167 = NameAndType        #168:#169     // getClassBasedParticipants:()Ljava/util/Map;
  #168 = Utf8               getClassBasedParticipants
  #169 = Utf8               ()Ljava/util/Map;
  #170 = InterfaceMethodref #171.#163     // java/util/Map.size:()I
  #171 = Class              #172          // java/util/Map
  #172 = Utf8               java/util/Map
  #173 = String             #174          // html/olympiad/noble_registered.htm
  #174 = Utf8               html/olympiad/noble_registered.htm
  #175 = String             #176          // %listClassed%
  #176 = Utf8               %listClassed%
  #177 = String             #178          // %listNonClassed%
  #178 = Utf8               %listNonClassed%
  #179 = Methodref          #119.#180     // ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
  #180 = NameAndType        #51:#181      // getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
  #181 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
  #182 = Methodref          #119.#183     // ext/mods/gameserver/model/olympiad/Olympiad.getNoblePoints:(I)I
  #183 = NameAndType        #184:#185     // getNoblePoints:(I)I
  #184 = Utf8               getNoblePoints
  #185 = Utf8               (I)I
  #186 = String             #187          // html/olympiad/noble_points1.htm
  #187 = Utf8               html/olympiad/noble_points1.htm
  #188 = String             #189          // %points%
  #189 = Utf8               %points%
  #190 = Fieldref           #191.#192     // ext/mods/gameserver/enums/OlympiadType.NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
  #191 = Class              #193          // ext/mods/gameserver/enums/OlympiadType
  #192 = NameAndType        #194:#195     // NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
  #193 = Utf8               ext/mods/gameserver/enums/OlympiadType
  #194 = Utf8               NON_CLASSED
  #195 = Utf8               Lext/mods/gameserver/enums/OlympiadType;
  #196 = Methodref          #149.#197     // ext/mods/gameserver/model/olympiad/OlympiadManager.registerNoble:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/OlympiadType;)Z
  #197 = NameAndType        #198:#199     // registerNoble:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/OlympiadType;)Z
  #198 = Utf8               registerNoble
  #199 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/OlympiadType;)Z
  #200 = Fieldref           #191.#201     // ext/mods/gameserver/enums/OlympiadType.CLASSED:Lext/mods/gameserver/enums/OlympiadType;
  #201 = NameAndType        #202:#195     // CLASSED:Lext/mods/gameserver/enums/OlympiadType;
  #202 = Utf8               CLASSED
  #203 = Methodref          #119.#204     // ext/mods/gameserver/model/olympiad/Olympiad.getNoblessePasses:(Lext/mods/gameserver/model/actor/Player;Z)I
  #204 = NameAndType        #205:#206     // getNoblessePasses:(Lext/mods/gameserver/model/actor/Player;Z)I
  #205 = Utf8               getNoblessePasses
  #206 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)I
  #207 = String             #208          // noble_settle.htm
  #208 = Utf8               noble_settle.htm
  #209 = String             #210          // noble_nopoints2.htm
  #210 = Utf8               noble_nopoints2.htm
  #211 = Methodref          #212.#213     // ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #212 = Class              #214          // ext/mods/gameserver/data/xml/MultisellData
  #213 = NameAndType        #51:#215      // getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #214 = Utf8               ext/mods/gameserver/data/xml/MultisellData
  #215 = Utf8               ()Lext/mods/gameserver/data/xml/MultisellData;
  #216 = String             #217          // 102
  #217 = Utf8               102
  #218 = Methodref          #212.#219     // ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #219 = NameAndType        #220:#221     // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #220 = Utf8               separateAndSend
  #221 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #222 = Methodref          #37.#223      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #223 = NameAndType        #224:#225     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #224 = Utf8               addItem
  #225 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #226 = String             #227          // Olympiad
  #227 = Utf8               Olympiad
  #228 = Methodref          #80.#229      // java/lang/String.substring:(II)Ljava/lang/String;
  #229 = NameAndType        #141:#230     // substring:(II)Ljava/lang/String;
  #230 = Utf8               (II)Ljava/lang/String;
  #231 = Methodref          #119.#232     // ext/mods/gameserver/model/olympiad/Olympiad.getClassLeaderBoard:(I)Ljava/util/List;
  #232 = NameAndType        #233:#234     // getClassLeaderBoard:(I)Ljava/util/List;
  #233 = Utf8               getClassLeaderBoard
  #234 = Utf8               (I)Ljava/util/List;
  #235 = String             #236          // html/olympiad/noble_ranking.htm
  #236 = Utf8               html/olympiad/noble_ranking.htm
  #237 = InterfaceMethodref #162.#238     // java/util/List.iterator:()Ljava/util/Iterator;
  #238 = NameAndType        #239:#240     // iterator:()Ljava/util/Iterator;
  #239 = Utf8               iterator
  #240 = Utf8               ()Ljava/util/Iterator;
  #241 = InterfaceMethodref #242.#243     // java/util/Iterator.hasNext:()Z
  #242 = Class              #244          // java/util/Iterator
  #243 = NameAndType        #245:#41      // hasNext:()Z
  #244 = Utf8               java/util/Iterator
  #245 = Utf8               hasNext
  #246 = InterfaceMethodref #242.#247     // java/util/Iterator.next:()Ljava/lang/Object;
  #247 = NameAndType        #248:#249     // next:()Ljava/lang/Object;
  #248 = Utf8               next
  #249 = Utf8               ()Ljava/lang/Object;
  #250 = InvokeDynamic      #3:#16        // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #251 = InvokeDynamic      #4:#16        // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #252 = String             #253          // html/olympiad/olympiad_observe_list.htm
  #253 = Utf8               html/olympiad/olympiad_observe_list.htm
  #254 = Class              #255          // java/lang/StringBuilder
  #255 = Utf8               java/lang/StringBuilder
  #256 = Methodref          #254.#68      // java/lang/StringBuilder."<init>":(I)V
  #257 = Methodref          #258.#259     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #258 = Class              #260          // ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #259 = NameAndType        #51:#261      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #260 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #261 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #262 = Methodref          #258.#263     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getOlympiadTasks:()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #263 = NameAndType        #264:#265     // getOlympiadTasks:()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #264 = Utf8               getOlympiadTasks
  #265 = Utf8               ()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #266 = Class              #267          // java/lang/Object
  #267 = Utf8               java/lang/Object
  #268 = String             #269          // <a action=\"bypass arenachange
  #269 = Utf8               <a action=\"bypass arenachange
  #270 = Methodref          #143.#271     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #271 = NameAndType        #272:#273     // valueOf:(I)Ljava/lang/Integer;
  #272 = Utf8               valueOf
  #273 = Utf8               (I)Ljava/lang/Integer;
  #274 = String             #275          // \">Arena
  #275 = Utf8               \">Arena
  #276 = String             #277          // &nbsp;
  #277 = Utf8               &nbsp;
  #278 = Methodref          #279.#280     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #279 = Class              #281          // ext/mods/commons/lang/StringUtil
  #280 = NameAndType        #282:#283     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #281 = Utf8               ext/mods/commons/lang/StringUtil
  #282 = Utf8               append
  #283 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #284 = Methodref          #285.#286     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.isGameStarted:()Z
  #285 = Class              #287          // ext/mods/gameserver/model/olympiad/OlympiadGameTask
  #286 = NameAndType        #288:#41      // isGameStarted:()Z
  #287 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask
  #288 = Utf8               isGameStarted
  #289 = Methodref          #285.#290     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.isInTimerTime:()Z
  #290 = NameAndType        #291:#41      // isInTimerTime:()Z
  #291 = Utf8               isInTimerTime
  #292 = String             #293          // (&$907;)
  #293 = Utf8               (&$907;)
  #294 = Methodref          #285.#295     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.isBattleStarted:()Z
  #295 = NameAndType        #296:#41      // isBattleStarted:()Z
  #296 = Utf8               isBattleStarted
  #297 = String             #298          // (&$829;)
  #298 = Utf8               (&$829;)
  #299 = String             #300          // (&$908;)
  #300 = Utf8               (&$908;)
  #301 = Methodref          #285.#302     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #302 = NameAndType        #303:#304     // getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #303 = Utf8               getGame
  #304 = Utf8               ()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #305 = Methodref          #306.#307     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.getPlayerNames:()[Ljava/lang/String;
  #306 = Class              #308          // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  #307 = NameAndType        #309:#310     // getPlayerNames:()[Ljava/lang/String;
  #308 = Utf8               ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  #309 = Utf8               getPlayerNames
  #310 = Utf8               ()[Ljava/lang/String;
  #311 = String             #312          // &nbsp; : &nbsp;
  #312 = Utf8               &nbsp; : &nbsp;
  #313 = String             #314          // (&$906;)</td><td>&nbsp;
  #314 = Utf8               (&$906;)</td><td>&nbsp;
  #315 = String             #316          // </a><br>
  #316 = Utf8               </a><br>
  #317 = String             #318          // %list%
  #318 = Utf8               %list%
  #319 = Methodref          #254.#320     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #320 = NameAndType        #321:#322     // toString:()Ljava/lang/String;
  #321 = Utf8               toString
  #322 = Utf8               ()Ljava/lang/String;
  #323 = Class              #324          // ext/mods/gameserver/network/serverpackets/ExHeroList
  #324 = Utf8               ext/mods/gameserver/network/serverpackets/ExHeroList
  #325 = Methodref          #323.#326     // ext/mods/gameserver/network/serverpackets/ExHeroList."<init>":()V
  #326 = NameAndType        #5:#327       // "<init>":()V
  #327 = Utf8               ()V
  #328 = String             #329          // html/olympiad/hero_confirm.htm
  #329 = Utf8               html/olympiad/hero_confirm.htm
  #330 = Methodref          #37.#331      // ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
  #331 = NameAndType        #332:#41      // isSubClassActive:()Z
  #332 = Utf8               isSubClassActive
  #333 = Methodref          #37.#334      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #334 = NameAndType        #335:#336     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #335 = Utf8               getStatus
  #336 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #337 = Methodref          #338.#134     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #338 = Class              #339          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #339 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #340 = String             #341          // You may only become an hero on a main class whose level is 75 or more.
  #341 = Utf8               You may only become an hero on a main class whose level is 75 or more.
  #342 = Methodref          #37.#343      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #343 = NameAndType        #344:#345     // sendMessage:(Ljava/lang/String;)V
  #344 = Utf8               sendMessage
  #345 = Utf8               (Ljava/lang/String;)V
  #346 = Methodref          #48.#347      // ext/mods/gameserver/data/manager/HeroManager.activateHero:(Lext/mods/gameserver/model/actor/Player;)V
  #347 = NameAndType        #348:#349     // activateHero:(Lext/mods/gameserver/model/actor/Player;)V
  #348 = Utf8               activateHero
  #349 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #350 = String             #351          // html/olympiad/hero_main.htm
  #351 = Utf8               html/olympiad/hero_main.htm
  #352 = Methodref          #2.#353       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #353 = NameAndType        #354:#355     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #354 = Utf8               onBypassFeedback
  #355 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #356 = Methodref          #2.#357       // ext/mods/gameserver/model/actor/instance/Folk.onSpawn:()V
  #357 = NameAndType        #358:#327     // onSpawn:()V
  #358 = Utf8               onSpawn
  #359 = Methodref          #8.#28        // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc.getNpcId:()I
  #360 = InterfaceMethodref #162.#361     // java/util/List.add:(Ljava/lang/Object;)Z
  #361 = NameAndType        #362:#84      // add:(Ljava/lang/Object;)Z
  #362 = Utf8               add
  #363 = InterfaceMethodref #162.#364     // java/util/List.remove:(Ljava/lang/Object;)Z
  #364 = NameAndType        #365:#84      // remove:(Ljava/lang/Object;)Z
  #365 = Utf8               remove
  #366 = Methodref          #2.#367       // ext/mods/gameserver/model/actor/instance/Folk.onDecay:()V
  #367 = NameAndType        #368:#327     // onDecay:()V
  #368 = Utf8               onDecay
  #369 = Class              #370          // java/util/concurrent/CopyOnWriteArrayList
  #370 = Utf8               java/util/concurrent/CopyOnWriteArrayList
  #371 = Methodref          #369.#326     // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
  #372 = Utf8               Signature
  #373 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;>;
  #374 = Utf8               GATE_PASS
  #375 = Utf8               I
  #376 = Utf8               ConstantValue
  #377 = Integer            6651
  #378 = Utf8               Code
  #379 = Utf8               LineNumberTable
  #380 = Utf8               LocalVariableTable
  #381 = Utf8               this
  #382 = Utf8               Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;
  #383 = Utf8               objectId
  #384 = Utf8               template
  #385 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #386 = Utf8               getInstances
  #387 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;>;
  #388 = Utf8               player
  #389 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #390 = Utf8               npcId
  #391 = Utf8               val
  #392 = Utf8               filename
  #393 = Utf8               Ljava/lang/String;
  #394 = Utf8               StackMapTable
  #395 = Utf8               showChatWindow
  #396 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #397 = Utf8               hiddenText
  #398 = Utf8               html
  #399 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #400 = Utf8               nonClassed
  #401 = Utf8               classed
  #402 = Utf8               points
  #403 = Utf8               name
  #404 = Utf8               names
  #405 = Utf8               index
  #406 = Utf8               classId
  #407 = Utf8               task
  #408 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #409 = Utf8               i
  #410 = Utf8               sb
  #411 = Utf8               Ljava/lang/StringBuilder;
  #412 = Utf8               command
  #413 = Utf8               LocalVariableTypeTable
  #414 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #415 = Class              #416          // java/util/Locale
  #416 = Utf8               java/util/Locale
  #417 = Class              #418          // "[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;"
  #418 = Utf8               [Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #419 = Utf8               <clinit>
  #420 = Utf8               SourceFile
  #421 = Utf8               OlympiadManagerNpc.java
  #422 = Utf8               BootstrapMethods
  #423 = String             #424          // noble_\u0001
  #424 = Utf8               noble_\u0001
  #425 = String             #426          // \u0001.htm
  #426 = Utf8               \u0001.htm
  #427 = String             #428          // html/olympiad/\u0001
  #428 = Utf8               html/olympiad/\u0001
  #429 = String             #430          // %place\u0001%
  #430 = Utf8               %place\u0001%
  #431 = String             #432          // %rank\u0001%
  #432 = Utf8               %rank\u0001%
  #433 = MethodHandle       6:#434        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #434 = Methodref          #435.#436     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #435 = Class              #437          // java/lang/invoke/StringConcatFactory
  #436 = NameAndType        #17:#438      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #437 = Utf8               java/lang/invoke/StringConcatFactory
  #438 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #439 = Utf8               InnerClasses
  #440 = Class              #441          // java/lang/invoke/MethodHandles$Lookup
  #441 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #442 = Class              #443          // java/lang/invoke/MethodHandles
  #443 = Utf8               java/lang/invoke/MethodHandles
  #444 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.OlympiadManagerNpc(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 46: 0
        line 47: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public static java.util.List<ext.mods.gameserver.model.actor.instance.OlympiadManagerNpc> getInstances();
    descriptor: ()Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #7                  // Field _managers:Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 51: 0
    Signature: #387                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;>;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=4
         0: ldc           #13                 // String noble
         2: astore        4
         4: iload_3
         5: ifle          16
         8: iload_3
         9: invokedynamic #15,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        14: astore        4
        16: aload         4
        18: invokedynamic #19,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        23: areturn
      LineNumberTable:
        line 57: 0
        line 59: 4
        line 60: 8
        line 62: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;
            0      24     1 player   Lext/mods/gameserver/model/actor/Player;
            0      24     2 npcId   I
            0      24     3   val   I
            4      20     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/lang/String ]

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=3
         0: aload_0
         1: invokevirtual #22                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
         7: istore_3
         8: aload_0
         9: aload_1
        10: iload_3
        11: iload_2
        12: invokevirtual #32                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        15: astore        4
        17: iload_3
        18: lookupswitch  { // 6

                   31688: 76

                   31690: 94

                   31769: 94

                   31770: 94

                   31771: 94

                   31772: 94
                 default: 125
            }
        76: aload_1
        77: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
        80: ifeq          125
        83: iload_2
        84: ifne          125
        87: ldc           #42                 // String noble_main.htm
        89: astore        4
        91: goto          125
        94: aload_1
        95: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
        98: ifne          114
       101: invokestatic  #47                 // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
       104: aload_1
       105: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       108: invokevirtual #56                 // Method ext/mods/gameserver/data/manager/HeroManager.isInactiveHero:(I)Z
       111: ifeq          121
       114: ldc           #60                 // String hero_main.htm
       116: astore        4
       118: goto          125
       121: ldc           #62                 // String hero_main2.htm
       123: astore        4
       125: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       128: dup
       129: aload_0
       130: invokevirtual #66                 // Method getObjectId:()I
       133: invokespecial #67                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       136: astore        5
       138: aload         5
       140: aload_1
       141: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       144: aload         4
       146: invokedynamic #74,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       151: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       154: aload         4
       156: ldc           #60                 // String hero_main.htm
       158: invokevirtual #79                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       161: ifeq          194
       164: ldc           #85                 // String
       166: astore        6
       168: invokestatic  #47                 // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
       171: aload_1
       172: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       175: invokevirtual #56                 // Method ext/mods/gameserver/data/manager/HeroManager.isInactiveHero:(I)Z
       178: ifeq          185
       181: ldc           #87                 // String <a action=\"bypass -h npc_%objectId%_Olympiad 5\">\"I want to be a Hero.\"</a><br>
       183: astore        6
       185: aload         5
       187: ldc           #89                 // String %hero%
       189: aload         6
       191: invokevirtual #91                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       194: aload         5
       196: ldc           #95                 // String %objectId%
       198: aload_0
       199: invokevirtual #66                 // Method getObjectId:()I
       202: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       205: aload_1
       206: aload         5
       208: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       211: aload_1
       212: getstatic     #104                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       215: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       218: return
      LineNumberTable:
        line 68: 0
        line 69: 8
        line 71: 17
        line 74: 76
        line 75: 87
        line 79: 94
        line 80: 114
        line 82: 121
        line 86: 125
        line 87: 138
        line 89: 154
        line 91: 164
        line 92: 168
        line 93: 181
        line 95: 185
        line 97: 194
        line 98: 205
        line 100: 211
        line 101: 218
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          168      26     6 hiddenText   Ljava/lang/String;
            0     219     0  this   Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;
            0     219     1 player   Lext/mods/gameserver/model/actor/Player;
            0     219     2   val   I
            8     211     3 npcId   I
           17     202     4 filename   Ljava/lang/String;
          138      81     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 7
        frame_type = 253 /* append */
          offset_delta = 76
          locals = [ int, class java/lang/String ]
        frame_type = 17 /* same */
        frame_type = 19 /* same */
        frame_type = 6 /* same */
        frame_type = 3 /* same */
        frame_type = 253 /* append */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 8

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=12, args_size=3
         0: aload_2
         1: ldc           #110                // String OlympiadNoble
         3: invokevirtual #112                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          433
         9: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        12: dup
        13: aload_0
        14: invokevirtual #66                 // Method getObjectId:()I
        17: invokespecial #67                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        20: astore_3
        21: aload_1
        22: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
        25: ifeq          44
        28: aload_3
        29: aload_1
        30: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        33: ldc           #121                // String html/olympiad/noble_cant_cw.htm
        35: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        38: aload_1
        39: aload_3
        40: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        43: return
        44: aload_1
        45: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        48: ifeq          77
        51: aload_3
        52: aload_1
        53: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        56: ldc           #126                // String html/olympiad/noble_cant_sub.htm
        58: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        61: aload_3
        62: ldc           #95                 // String %objectId%
        64: aload_0
        65: invokevirtual #66                 // Method getObjectId:()I
        68: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        71: aload_1
        72: aload_3
        73: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        76: return
        77: aload_1
        78: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
        81: ifeq          95
        84: aload_1
        85: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
        88: invokevirtual #132                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
        91: iconst_3
        92: if_icmpge     121
        95: aload_3
        96: aload_1
        97: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       100: ldc           #137                // String html/olympiad/noble_cant_thirdclass.htm
       102: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       105: aload_3
       106: ldc           #95                 // String %objectId%
       108: aload_0
       109: invokevirtual #66                 // Method getObjectId:()I
       112: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       115: aload_1
       116: aload_3
       117: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       120: return
       121: aload_2
       122: bipush        14
       124: invokevirtual #139                // Method java/lang/String.substring:(I)Ljava/lang/String;
       127: invokestatic  #142                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       130: istore        4
       132: iload         4
       134: tableswitch   { // 1 to 10

                       1: 188

                       2: 199

                       3: 269

                       4: 317

                       5: 332

                       6: 347

                       7: 396

                       8: 430

                       9: 430

                      10: 410
                 default: 430
            }
       188: invokestatic  #148                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       191: aload_1
       192: invokevirtual #153                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.unRegisterNoble:(Lext/mods/gameserver/model/actor/Player;)Z
       195: pop
       196: goto          430
       199: invokestatic  #148                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       202: invokevirtual #157                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getNonClassBasedParticipants:()Ljava/util/List;
       205: invokeinterface #161,  1          // InterfaceMethod java/util/List.size:()I
       210: istore        5
       212: invokestatic  #148                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       215: invokevirtual #166                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getClassBasedParticipants:()Ljava/util/Map;
       218: invokeinterface #170,  1          // InterfaceMethod java/util/Map.size:()I
       223: istore        6
       225: aload_3
       226: aload_1
       227: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       230: ldc           #173                // String html/olympiad/noble_registered.htm
       232: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       235: aload_3
       236: ldc           #175                // String %listClassed%
       238: iload         6
       240: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       243: aload_3
       244: ldc           #177                // String %listNonClassed%
       246: iload         5
       248: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       251: aload_3
       252: ldc           #95                 // String %objectId%
       254: aload_0
       255: invokevirtual #66                 // Method getObjectId:()I
       258: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       261: aload_1
       262: aload_3
       263: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       266: goto          430
       269: invokestatic  #179                // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
       272: aload_1
       273: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       276: invokevirtual #182                // Method ext/mods/gameserver/model/olympiad/Olympiad.getNoblePoints:(I)I
       279: istore        7
       281: aload_3
       282: aload_1
       283: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       286: ldc           #186                // String html/olympiad/noble_points1.htm
       288: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       291: aload_3
       292: ldc           #188                // String %points%
       294: iload         7
       296: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       299: aload_3
       300: ldc           #95                 // String %objectId%
       302: aload_0
       303: invokevirtual #66                 // Method getObjectId:()I
       306: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       309: aload_1
       310: aload_3
       311: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       314: goto          430
       317: invokestatic  #148                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       320: aload_0
       321: aload_1
       322: getstatic     #190                // Field ext/mods/gameserver/enums/OlympiadType.NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
       325: invokevirtual #196                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.registerNoble:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/OlympiadType;)Z
       328: pop
       329: goto          430
       332: invokestatic  #148                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       335: aload_0
       336: aload_1
       337: getstatic     #200                // Field ext/mods/gameserver/enums/OlympiadType.CLASSED:Lext/mods/gameserver/enums/OlympiadType;
       340: invokevirtual #196                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.registerNoble:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/OlympiadType;)Z
       343: pop
       344: goto          430
       347: aload_3
       348: aload_1
       349: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       352: invokestatic  #179                // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
       355: aload_1
       356: iconst_0
       357: invokevirtual #203                // Method ext/mods/gameserver/model/olympiad/Olympiad.getNoblessePasses:(Lext/mods/gameserver/model/actor/Player;Z)I
       360: ifle          368
       363: ldc           #207                // String noble_settle.htm
       365: goto          370
       368: ldc           #209                // String noble_nopoints2.htm
       370: invokedynamic #74,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       375: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       378: aload_3
       379: ldc           #95                 // String %objectId%
       381: aload_0
       382: invokevirtual #66                 // Method getObjectId:()I
       385: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       388: aload_1
       389: aload_3
       390: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       393: goto          430
       396: invokestatic  #211                // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
       399: ldc           #216                // String 102
       401: aload_1
       402: aload_0
       403: iconst_0
       404: invokevirtual #218                // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
       407: goto          430
       410: aload_1
       411: sipush        6651
       414: invokestatic  #179                // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
       417: aload_1
       418: iconst_1
       419: invokevirtual #203                // Method ext/mods/gameserver/model/olympiad/Olympiad.getNoblessePasses:(Lext/mods/gameserver/model/actor/Player;Z)I
       422: iconst_1
       423: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       426: pop
       427: goto          430
       430: goto          1169
       433: aload_2
       434: ldc           #226                // String Olympiad
       436: invokevirtual #112                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       439: ifeq          1163
       442: aload_2
       443: bipush        9
       445: bipush        10
       447: invokevirtual #228                // Method java/lang/String.substring:(II)Ljava/lang/String;
       450: invokestatic  #142                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       453: istore_3
       454: new           #64                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       457: dup
       458: aload_0
       459: invokevirtual #66                 // Method getObjectId:()I
       462: invokespecial #67                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       465: astore        4
       467: iload_3
       468: tableswitch   { // 2 to 7

                       2: 508

                       3: 693

                       4: 989

                       5: 1003

                       6: 1048

                       7: 1098
                 default: 1160
            }
       508: aload_2
       509: bipush        11
       511: invokevirtual #139                // Method java/lang/String.substring:(I)Ljava/lang/String;
       514: invokestatic  #142                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       517: istore        5
       519: iload         5
       521: bipush        88
       523: if_icmplt     1160
       526: iload         5
       528: bipush        118
       530: if_icmpgt     1160
       533: invokestatic  #179                // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
       536: iload         5
       538: invokevirtual #231                // Method ext/mods/gameserver/model/olympiad/Olympiad.getClassLeaderBoard:(I)Ljava/util/List;
       541: astore        6
       543: aload         4
       545: aload_1
       546: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       549: ldc           #235                // String html/olympiad/noble_ranking.htm
       551: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       554: iconst_1
       555: istore        7
       557: aload         6
       559: invokeinterface #237,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       564: astore        8
       566: aload         8
       568: invokeinterface #241,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       573: ifeq          632
       576: aload         8
       578: invokeinterface #246,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       583: checkcast     #80                 // class java/lang/String
       586: astore        9
       588: aload         4
       590: iload         7
       592: invokedynamic #250,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       597: iload         7
       599: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       602: aload         4
       604: iload         7
       606: invokedynamic #251,  0            // InvokeDynamic #4:makeConcatWithConstants:(I)Ljava/lang/String;
       611: aload         9
       613: invokevirtual #91                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       616: iinc          7, 1
       619: iload         7
       621: bipush        10
       623: if_icmple     629
       626: goto          632
       629: goto          566
       632: iload         7
       634: bipush        10
       636: if_icmpgt     673
       639: aload         4
       641: iload         7
       643: invokedynamic #250,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       648: ldc           #85                 // String
       650: invokevirtual #91                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       653: aload         4
       655: iload         7
       657: invokedynamic #251,  0            // InvokeDynamic #4:makeConcatWithConstants:(I)Ljava/lang/String;
       662: ldc           #85                 // String
       664: invokevirtual #91                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       667: iinc          7, 1
       670: goto          632
       673: aload         4
       675: ldc           #95                 // String %objectId%
       677: aload_0
       678: invokevirtual #66                 // Method getObjectId:()I
       681: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       684: aload_1
       685: aload         4
       687: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       690: goto          1160
       693: aload         4
       695: aload_1
       696: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       699: ldc           #252                // String html/olympiad/olympiad_observe_list.htm
       701: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       704: iconst_0
       705: istore        6
       707: new           #254                // class java/lang/StringBuilder
       710: dup
       711: sipush        2000
       714: invokespecial #256                // Method java/lang/StringBuilder."<init>":(I)V
       717: astore        7
       719: invokestatic  #257                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
       722: invokevirtual #262                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.getOlympiadTasks:()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
       725: astore        8
       727: aload         8
       729: arraylength
       730: istore        9
       732: iconst_0
       733: istore        10
       735: iload         10
       737: iload         9
       739: if_icmpge     956
       742: aload         8
       744: iload         10
       746: aaload
       747: astore        11
       749: aload         7
       751: iconst_5
       752: anewarray     #266                // class java/lang/Object
       755: dup
       756: iconst_0
       757: ldc_w         #268                // String <a action=\"bypass arenachange
       760: aastore
       761: dup
       762: iconst_1
       763: iload         6
       765: invokestatic  #270                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       768: aastore
       769: dup
       770: iconst_2
       771: ldc_w         #274                // String \">Arena
       774: aastore
       775: dup
       776: iconst_3
       777: iinc          6, 1
       780: iload         6
       782: invokestatic  #270                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       785: aastore
       786: dup
       787: iconst_4
       788: ldc_w         #276                // String &nbsp;
       791: aastore
       792: invokestatic  #278                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       795: aload         11
       797: invokevirtual #284                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isGameStarted:()Z
       800: ifeq          920
       803: aload         11
       805: invokevirtual #289                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isInTimerTime:()Z
       808: ifeq          829
       811: aload         7
       813: iconst_1
       814: anewarray     #266                // class java/lang/Object
       817: dup
       818: iconst_0
       819: ldc_w         #292                // String (&$907;)
       822: aastore
       823: invokestatic  #278                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       826: goto          870
       829: aload         11
       831: invokevirtual #294                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isBattleStarted:()Z
       834: ifeq          855
       837: aload         7
       839: iconst_1
       840: anewarray     #266                // class java/lang/Object
       843: dup
       844: iconst_0
       845: ldc_w         #297                // String (&$829;)
       848: aastore
       849: invokestatic  #278                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       852: goto          870
       855: aload         7
       857: iconst_1
       858: anewarray     #266                // class java/lang/Object
       861: dup
       862: iconst_0
       863: ldc_w         #299                // String (&$908;)
       866: aastore
       867: invokestatic  #278                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       870: aload         7
       872: iconst_4
       873: anewarray     #266                // class java/lang/Object
       876: dup
       877: iconst_0
       878: ldc_w         #276                // String &nbsp;
       881: aastore
       882: dup
       883: iconst_1
       884: aload         11
       886: invokevirtual #301                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
       889: invokevirtual #305                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.getPlayerNames:()[Ljava/lang/String;
       892: iconst_0
       893: aaload
       894: aastore
       895: dup
       896: iconst_2
       897: ldc_w         #311                // String &nbsp; : &nbsp;
       900: aastore
       901: dup
       902: iconst_3
       903: aload         11
       905: invokevirtual #301                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
       908: invokevirtual #305                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.getPlayerNames:()[Ljava/lang/String;
       911: iconst_1
       912: aaload
       913: aastore
       914: invokestatic  #278                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       917: goto          935
       920: aload         7
       922: iconst_1
       923: anewarray     #266                // class java/lang/Object
       926: dup
       927: iconst_0
       928: ldc_w         #313                // String (&$906;)</td><td>&nbsp;
       931: aastore
       932: invokestatic  #278                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       935: aload         7
       937: iconst_1
       938: anewarray     #266                // class java/lang/Object
       941: dup
       942: iconst_0
       943: ldc_w         #315                // String </a><br>
       946: aastore
       947: invokestatic  #278                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       950: iinc          10, 1
       953: goto          735
       956: aload         4
       958: ldc_w         #317                // String %list%
       961: aload         7
       963: invokevirtual #319                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       966: invokevirtual #91                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       969: aload         4
       971: ldc           #95                 // String %objectId%
       973: aload_0
       974: invokevirtual #66                 // Method getObjectId:()I
       977: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       980: aload_1
       981: aload         4
       983: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       986: goto          1160
       989: aload_1
       990: new           #323                // class ext/mods/gameserver/network/serverpackets/ExHeroList
       993: dup
       994: invokespecial #325                // Method ext/mods/gameserver/network/serverpackets/ExHeroList."<init>":()V
       997: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1000: goto          1160
      1003: invokestatic  #47                 // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
      1006: aload_1
      1007: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1010: invokevirtual #56                 // Method ext/mods/gameserver/data/manager/HeroManager.isInactiveHero:(I)Z
      1013: ifeq          1160
      1016: aload         4
      1018: aload_1
      1019: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1022: ldc_w         #328                // String html/olympiad/hero_confirm.htm
      1025: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1028: aload         4
      1030: ldc           #95                 // String %objectId%
      1032: aload_0
      1033: invokevirtual #66                 // Method getObjectId:()I
      1036: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1039: aload_1
      1040: aload         4
      1042: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1045: goto          1160
      1048: invokestatic  #47                 // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
      1051: aload_1
      1052: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1055: invokevirtual #56                 // Method ext/mods/gameserver/data/manager/HeroManager.isInactiveHero:(I)Z
      1058: ifeq          1160
      1061: aload_1
      1062: invokevirtual #330                // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
      1065: ifne          1080
      1068: aload_1
      1069: invokevirtual #333                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1072: invokevirtual #337                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1075: bipush        76
      1077: if_icmpge     1088
      1080: aload_1
      1081: ldc_w         #340                // String You may only become an hero on a main class whose level is 75 or more.
      1084: invokevirtual #342                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1087: return
      1088: invokestatic  #47                 // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
      1091: aload_1
      1092: invokevirtual #346                // Method ext/mods/gameserver/data/manager/HeroManager.activateHero:(Lext/mods/gameserver/model/actor/Player;)V
      1095: goto          1160
      1098: aload         4
      1100: aload_1
      1101: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1104: ldc_w         #350                // String html/olympiad/hero_main.htm
      1107: invokevirtual #75                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1110: ldc           #85                 // String
      1112: astore        8
      1114: invokestatic  #47                 // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
      1117: aload_1
      1118: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1121: invokevirtual #56                 // Method ext/mods/gameserver/data/manager/HeroManager.isInactiveHero:(I)Z
      1124: ifeq          1131
      1127: ldc           #87                 // String <a action=\"bypass -h npc_%objectId%_Olympiad 5\">\"I want to be a Hero.\"</a><br>
      1129: astore        8
      1131: aload         4
      1133: ldc           #89                 // String %hero%
      1135: aload         8
      1137: invokevirtual #91                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1140: aload         4
      1142: ldc           #95                 // String %objectId%
      1144: aload_0
      1145: invokevirtual #66                 // Method getObjectId:()I
      1148: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1151: aload_1
      1152: aload         4
      1154: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1157: goto          1160
      1160: goto          1169
      1163: aload_0
      1164: aload_1
      1165: aload_2
      1166: invokespecial #352                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1169: return
      LineNumberTable:
        line 106: 0
        line 108: 9
        line 109: 21
        line 111: 28
        line 112: 38
        line 113: 43
        line 116: 44
        line 118: 51
        line 119: 61
        line 120: 71
        line 121: 76
        line 124: 77
        line 126: 95
        line 127: 105
        line 128: 115
        line 129: 120
        line 132: 121
        line 133: 132
        line 136: 188
        line 137: 196
        line 140: 199
        line 141: 212
        line 143: 225
        line 144: 235
        line 145: 243
        line 146: 251
        line 147: 261
        line 148: 266
        line 151: 269
        line 152: 281
        line 153: 291
        line 154: 299
        line 155: 309
        line 156: 314
        line 159: 317
        line 160: 329
        line 163: 332
        line 164: 344
        line 167: 347
        line 169: 378
        line 170: 388
        line 171: 393
        line 174: 396
        line 175: 407
        line 178: 410
        line 179: 427
        line 184: 430
        line 185: 433
        line 187: 442
        line 189: 454
        line 190: 467
        line 193: 508
        line 194: 519
        line 196: 533
        line 197: 543
        line 199: 554
        line 200: 557
        line 202: 588
        line 203: 602
        line 205: 616
        line 206: 619
        line 207: 626
        line 208: 629
        line 210: 632
        line 212: 639
        line 213: 653
        line 210: 667
        line 216: 673
        line 217: 684
        line 218: 690
        line 222: 693
        line 224: 704
        line 226: 707
        line 227: 719
        line 229: 749
        line 231: 795
        line 233: 803
        line 234: 811
        line 235: 829
        line 236: 837
        line 238: 855
        line 240: 870
        line 243: 920
        line 245: 935
        line 227: 950
        line 247: 956
        line 248: 969
        line 249: 980
        line 250: 986
        line 253: 989
        line 254: 1000
        line 257: 1003
        line 259: 1016
        line 260: 1028
        line 261: 1039
        line 266: 1048
        line 268: 1061
        line 270: 1080
        line 271: 1087
        line 274: 1088
        line 279: 1098
        line 281: 1110
        line 282: 1114
        line 283: 1127
        line 285: 1131
        line 286: 1140
        line 287: 1151
        line 288: 1157
        line 293: 1160
        line 295: 1163
        line 296: 1169
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          212      57     5 nonClassed   I
          225      44     6 classed   I
          281      36     7 points   I
           21     409     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          132     298     4   val   I
          588      41     9  name   Ljava/lang/String;
          543     147     6 names   Ljava/util/List;
          557     133     7 index   I
          519     174     5 classId   I
          749     201    11  task   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
          707     282     6     i   I
          719     270     7    sb   Ljava/lang/StringBuilder;
         1114      46     8 hiddenText   Ljava/lang/String;
          454     706     3   val   I
          467     693     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0    1170     0  this   Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;
            0    1170     1 player   Lext/mods/gameserver/model/actor/Player;
            0    1170     2 command   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          543     147     6 names   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 39
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 32 /* same */
        frame_type = 17 /* same */
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 66
          locals = [ int ]
        frame_type = 10 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 69
        frame_type = 47 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, class java/lang/String ]
        frame_type = 25 /* same */
        frame_type = 13 /* same */
        frame_type = 249 /* chop */
          offset_delta = 19
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 74
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, class java/util/List, int, class java/util/Iterator ]
          stack = []
        frame_type = 62 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 40 /* same */
        frame_type = 248 /* chop */
          offset_delta = 19
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, int, class java/lang/StringBuilder, class "[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 93
          locals = [ class ext/mods/gameserver/model/olympiad/OlympiadGameTask ]
        frame_type = 25 /* same */
        frame_type = 14 /* same */
        frame_type = 49 /* same */
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, int, class java/lang/StringBuilder ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 32
        frame_type = 13 /* same */
        frame_type = 44 /* same */
        frame_type = 31 /* same */
        frame_type = 7 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, top, top, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 5 /* same */

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #356                // Method ext/mods/gameserver/model/actor/instance/Folk.onSpawn:()V
         4: aload_0
         5: invokevirtual #359                // Method getNpcId:()I
         8: sipush        31688
        11: if_icmpne     24
        14: getstatic     #7                  // Field _managers:Ljava/util/List;
        17: aload_0
        18: invokeinterface #360,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        23: pop
        24: return
      LineNumberTable:
        line 301: 0
        line 303: 4
        line 304: 14
        line 305: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public void onDecay();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #7                  // Field _managers:Ljava/util/List;
         3: aload_0
         4: invokeinterface #363,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
         9: pop
        10: aload_0
        11: invokespecial #366                // Method ext/mods/gameserver/model/actor/instance/Folk.onDecay:()V
        14: return
      LineNumberTable:
        line 310: 0
        line 311: 10
        line 312: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #369                // class java/util/concurrent/CopyOnWriteArrayList
         3: dup
         4: invokespecial #371                // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
         7: putstatic     #7                  // Field _managers:Ljava/util/List;
        10: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "OlympiadManagerNpc.java"
BootstrapMethods:
  0: #433 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #423 noble_\u0001
  1: #433 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #425 \u0001.htm
  2: #433 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #427 html/olympiad/\u0001
  3: #433 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #429 %place\u0001%
  4: #433 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #431 %rank\u0001%
InnerClasses:
  public static final #444= #440 of #442; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
