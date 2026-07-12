// Bytecode for: ext.mods.gameserver.communitybbs.custom.ClassMasterBBSManager
// File: ext\mods\gameserver\communitybbs\custom\ClassMasterBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.class
  Last modified 9 de jul de 2026; size 11266 bytes
  MD5 checksum a41636de68c8cf660b9af80f2b1c9e5c
  Compiled from "ClassMasterBBSManager.java"
public class ext.mods.gameserver.communitybbs.custom.ClassMasterBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #29                         // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 0, methods: 12, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = String             #19           // _bbsmemo
   #19 = Utf8               _bbsmemo
   #20 = Methodref          #21.#22       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #21 = Class              #23           // java/lang/String
   #22 = NameAndType        #24:#25       // equals:(Ljava/lang/Object;)Z
   #23 = Utf8               java/lang/String
   #24 = Utf8               equals
   #25 = Utf8               (Ljava/lang/Object;)Z
   #26 = String             #27           // index
   #27 = Utf8               index
   #28 = Methodref          #29.#30       // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #29 = Class              #31           // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager
   #30 = NameAndType        #32:#33       // showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #31 = Utf8               ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager
   #32 = Utf8               showPage
   #33 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #34 = String             #35           // _bbsmemo;page
   #35 = Utf8               _bbsmemo;page
   #36 = Methodref          #21.#37       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #37 = NameAndType        #38:#39       // startsWith:(Ljava/lang/String;)Z
   #38 = Utf8               startsWith
   #39 = Utf8               (Ljava/lang/String;)Z
   #40 = Methodref          #21.#41       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #41 = NameAndType        #42:#43       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #42 = Utf8               split
   #43 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #44 = String             #45           // _bbsmemo;1stClass
   #45 = Utf8               _bbsmemo;1stClass
   #46 = Methodref          #47.#48       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #47 = Class              #49           // ext/mods/gameserver/model/actor/Player
   #48 = NameAndType        #50:#51       // getObjectId:()I
   #49 = Utf8               ext/mods/gameserver/model/actor/Player
   #50 = Utf8               getObjectId
   #51 = Utf8               ()I
   #52 = Methodref          #29.#53       // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.showHtmlMenu:(Lext/mods/gameserver/model/actor/Player;II)V
   #53 = NameAndType        #54:#55       // showHtmlMenu:(Lext/mods/gameserver/model/actor/Player;II)V
   #54 = Utf8               showHtmlMenu
   #55 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
   #56 = String             #57           // _bbsmemo;2ndClass
   #57 = Utf8               _bbsmemo;2ndClass
   #58 = String             #59           // _bbsmemo;3rdClass
   #59 = Utf8               _bbsmemo;3rdClass
   #60 = String             #61           // _bbsmemo;change_class
   #61 = Utf8               _bbsmemo;change_class
   #62 = Methodref          #63.#64       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #63 = Class              #65           // java/lang/Integer
   #64 = NameAndType        #66:#67       // parseInt:(Ljava/lang/String;)I
   #65 = Utf8               java/lang/Integer
   #66 = Utf8               parseInt
   #67 = Utf8               (Ljava/lang/String;)I
   #68 = Methodref          #29.#69       // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.checkAndChangeClass:(Lext/mods/gameserver/model/actor/Player;I)Z
   #69 = NameAndType        #70:#71       // checkAndChangeClass:(Lext/mods/gameserver/model/actor/Player;I)Z
   #70 = Utf8               checkAndChangeClass
   #71 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
   #72 = Class              #73           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #73 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #74 = Methodref          #72.#75       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #75 = NameAndType        #5:#76        // "<init>":(I)V
   #76 = Utf8               (I)V
   #77 = Methodref          #47.#78       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #78 = NameAndType        #79:#80       // getLocale:()Ljava/util/Locale;
   #79 = Utf8               getLocale
   #80 = Utf8               ()Ljava/util/Locale;
   #81 = Methodref          #29.#82       // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.getFolder:()Ljava/lang/String;
   #82 = NameAndType        #83:#17       // getFolder:()Ljava/lang/String;
   #83 = Utf8               getFolder
   #84 = InvokeDynamic      #0:#85        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #85 = NameAndType        #86:#87       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #86 = Utf8               makeConcatWithConstants
   #87 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #88 = Methodref          #72.#89       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #89 = NameAndType        #90:#91       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #90 = Utf8               setFile
   #91 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #92 = String             #93           // %name%
   #93 = Utf8               %name%
   #94 = Methodref          #95.#96       // ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
   #95 = Class              #97           // ext/mods/gameserver/data/xml/PlayerData
   #96 = NameAndType        #98:#99       // getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
   #97 = Utf8               ext/mods/gameserver/data/xml/PlayerData
   #98 = Utf8               getInstance
   #99 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerData;
  #100 = Methodref          #95.#101      // ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
  #101 = NameAndType        #102:#103     // getClassNameById:(I)Ljava/lang/String;
  #102 = Utf8               getClassNameById
  #103 = Utf8               (I)Ljava/lang/String;
  #104 = Methodref          #72.#105      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #105 = NameAndType        #106:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #106 = Utf8               replace
  #107 = Methodref          #47.#108      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #108 = NameAndType        #109:#110     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #109 = Utf8               sendPacket
  #110 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = String             #112          // _bbsmemo;become_noble
  #112 = Utf8               _bbsmemo;become_noble
  #113 = Methodref          #47.#114      // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #114 = NameAndType        #115:#116     // isNoble:()Z
  #115 = Utf8               isNoble
  #116 = Utf8               ()Z
  #117 = InvokeDynamic      #1:#85        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #118 = Fieldref           #119.#120     // ext/mods/Config.NOBLE_ITEM_ID:I
  #119 = Class              #121          // ext/mods/Config
  #120 = NameAndType        #122:#123     // NOBLE_ITEM_ID:I
  #121 = Utf8               ext/mods/Config
  #122 = Utf8               NOBLE_ITEM_ID
  #123 = Utf8               I
  #124 = Fieldref           #119.#125     // ext/mods/Config.NOBLE_ITEM_COUNT:I
  #125 = NameAndType        #126:#123     // NOBLE_ITEM_COUNT:I
  #126 = Utf8               NOBLE_ITEM_COUNT
  #127 = Methodref          #47.#128      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #128 = NameAndType        #129:#130     // destroyItemByItemId:(IIZ)Z
  #129 = Utf8               destroyItemByItemId
  #130 = Utf8               (IIZ)Z
  #131 = InvokeDynamic      #2:#85        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #132 = Methodref          #47.#133      // ext/mods/gameserver/model/actor/Player.setNoble:(ZZ)V
  #133 = NameAndType        #134:#135     // setNoble:(ZZ)V
  #134 = Utf8               setNoble
  #135 = Utf8               (ZZ)V
  #136 = Class              #137          // ext/mods/gameserver/network/serverpackets/UserInfo
  #137 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
  #138 = Methodref          #136.#139     // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #139 = NameAndType        #5:#140       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #140 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #141 = String             #142          // _bbsmemo;learn_skills
  #142 = Utf8               _bbsmemo;learn_skills
  #143 = Methodref          #47.#144      // ext/mods/gameserver/model/actor/Player.rewardSkills:()V
  #144 = NameAndType        #145:#6       // rewardSkills:()V
  #145 = Utf8               rewardSkills
  #146 = Fieldref           #119.#147     // ext/mods/Config.CLASS_MASTER_SETTINGS:Lext/mods/Config$ClassMasterSettings;
  #147 = NameAndType        #148:#149     // CLASS_MASTER_SETTINGS:Lext/mods/Config$ClassMasterSettings;
  #148 = Utf8               CLASS_MASTER_SETTINGS
  #149 = Utf8               Lext/mods/Config$ClassMasterSettings;
  #150 = Methodref          #151.#152     // ext/mods/Config$ClassMasterSettings.isAllowed:(I)Z
  #151 = Class              #153          // ext/mods/Config$ClassMasterSettings
  #152 = NameAndType        #154:#155     // isAllowed:(I)Z
  #153 = Utf8               ext/mods/Config$ClassMasterSettings
  #154 = Utf8               isAllowed
  #155 = Utf8               (I)Z
  #156 = Class              #157          // java/lang/StringBuilder
  #157 = Utf8               java/lang/StringBuilder
  #158 = Methodref          #156.#75      // java/lang/StringBuilder."<init>":(I)V
  #159 = String             #160          // <html><body>
  #160 = Utf8               <html><body>
  #161 = Methodref          #156.#162     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #162 = NameAndType        #163:#164     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #163 = Utf8               append
  #164 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #165 = Methodref          #47.#166      // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #166 = NameAndType        #167:#168     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #167 = Utf8               getClassId
  #168 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #169 = Methodref          #170.#171     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #170 = Class              #172          // ext/mods/gameserver/enums/actors/ClassId
  #171 = NameAndType        #173:#51      // getLevel:()I
  #172 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #173 = Utf8               getLevel
  #174 = String             #175          // Come back here when you reached level 20 to change your class.<br>
  #175 = Utf8               Come back here when you reached level 20 to change your class.<br>
  #176 = String             #177          // Come back after your first occupation change.<br>
  #177 = Utf8               Come back after your first occupation change.<br>
  #178 = String             #179          // Come back after your second occupation change.<br>
  #179 = Utf8               Come back after your second occupation change.<br>
  #180 = String             #181          // I can\'t change your occupation.<br>
  #181 = Utf8               I can\'t change your occupation.<br>
  #182 = String             #183          // Come back here when you reached level 40 to change your class.<br>
  #183 = Utf8               Come back here when you reached level 40 to change your class.<br>
  #184 = String             #185          // Come back here when you reached level 76 to change your class.<br>
  #185 = Utf8               Come back here when you reached level 76 to change your class.<br>
  #186 = String             #187          // There is no class change available for you anymore.<br>
  #187 = Utf8               There is no class change available for you anymore.<br>
  #188 = String             #189          // </body></html>
  #189 = Utf8               </body></html>
  #190 = Methodref          #156.#191     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #191 = NameAndType        #192:#17      // toString:()Ljava/lang/String;
  #192 = Utf8               toString
  #193 = Methodref          #72.#194      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #194 = NameAndType        #195:#196     // setHtml:(Ljava/lang/String;)V
  #195 = Utf8               setHtml
  #196 = Utf8               (Ljava/lang/String;)V
  #197 = InvokeDynamic      #3:#85        // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #198 = Methodref          #29.#199      // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.getMinLevel:(I)I
  #199 = NameAndType        #200:#201     // getMinLevel:(I)I
  #200 = Utf8               getMinLevel
  #201 = Utf8               (I)I
  #202 = Methodref          #47.#203      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #203 = NameAndType        #204:#205     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #204 = Utf8               getStatus
  #205 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #206 = Methodref          #207.#171     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #207 = Class              #208          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #208 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #209 = Fieldref           #119.#210     // ext/mods/Config.ALLOW_ENTIRE_TREE:Z
  #210 = NameAndType        #211:#212     // ALLOW_ENTIRE_TREE:Z
  #211 = Utf8               ALLOW_ENTIRE_TREE
  #212 = Utf8               Z
  #213 = Fieldref           #170.#214     // ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #214 = NameAndType        #215:#216     // VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #215 = Utf8               VALUES
  #216 = Utf8               [Lext/mods/gameserver/enums/actors/ClassId;
  #217 = Methodref          #29.#218      // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.validateClassId:(Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/enums/actors/ClassId;)Z
  #218 = NameAndType        #219:#220     // validateClassId:(Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/enums/actors/ClassId;)Z
  #219 = Utf8               validateClassId
  #220 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/enums/actors/ClassId;)Z
  #221 = Class              #222          // java/lang/Object
  #222 = Utf8               java/lang/Object
  #223 = String             #224          // <a action=\"bypass -h _bbsmemo;change_class
  #224 = Utf8               <a action=\"bypass -h _bbsmemo;change_class
  #225 = Methodref          #170.#226     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #226 = NameAndType        #227:#51      // getId:()I
  #227 = Utf8               getId
  #228 = Methodref          #63.#229      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #229 = NameAndType        #230:#231     // valueOf:(I)Ljava/lang/Integer;
  #230 = Utf8               valueOf
  #231 = Utf8               (I)Ljava/lang/Integer;
  #232 = String             #233          // \">
  #233 = Utf8               \">
  #234 = String             #235          // </a><br>
  #235 = Utf8               </a><br>
  #236 = Methodref          #237.#238     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #237 = Class              #239          // ext/mods/commons/lang/StringUtil
  #238 = NameAndType        #163:#240     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #239 = Utf8               ext/mods/commons/lang/StringUtil
  #240 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #241 = Methodref          #156.#242     // java/lang/StringBuilder.length:()I
  #242 = NameAndType        #243:#51      // length:()I
  #243 = Utf8               length
  #244 = InvokeDynamic      #4:#85        // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #245 = String             #246          // %menu%
  #246 = Utf8               %menu%
  #247 = InvokeDynamic      #5:#85        // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #248 = String             #249          // %level%
  #249 = Utf8               %level%
  #250 = Methodref          #72.#251      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #251 = NameAndType        #106:#252     // replace:(Ljava/lang/String;I)V
  #252 = Utf8               (Ljava/lang/String;I)V
  #253 = Integer            2147483647
  #254 = String             #255          // %objectId%
  #255 = Utf8               %objectId%
  #256 = String             #257          // %req_items%
  #257 = Utf8               %req_items%
  #258 = Methodref          #29.#259      // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.getRequiredItems:(I)Ljava/lang/String;
  #259 = NameAndType        #260:#103     // getRequiredItems:(I)Ljava/lang/String;
  #260 = Utf8               getRequiredItems
  #261 = Methodref          #29.#262      // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.validateClassId:(Lext/mods/gameserver/enums/actors/ClassId;I)Z
  #262 = NameAndType        #219:#263     // validateClassId:(Lext/mods/gameserver/enums/actors/ClassId;I)Z
  #263 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;I)Z
  #264 = Methodref          #151.#265     // ext/mods/Config$ClassMasterSettings.getRewardItems:(I)Ljava/util/List;
  #265 = NameAndType        #266:#267     // getRewardItems:(I)Ljava/util/List;
  #266 = Utf8               getRewardItems
  #267 = Utf8               (I)Ljava/util/List;
  #268 = InterfaceMethodref #269.#270     // java/util/List.isEmpty:()Z
  #269 = Class              #271          // java/util/List
  #270 = NameAndType        #272:#116     // isEmpty:()Z
  #271 = Utf8               java/util/List
  #272 = Utf8               isEmpty
  #273 = Methodref          #47.#274      // ext/mods/gameserver/model/actor/Player.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
  #274 = NameAndType        #275:#276     // getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
  #275 = Utf8               getWeightPenalty
  #276 = Utf8               ()Lext/mods/gameserver/enums/actors/WeightPenalty;
  #277 = Methodref          #278.#279     // ext/mods/gameserver/enums/actors/WeightPenalty.ordinal:()I
  #278 = Class              #280          // ext/mods/gameserver/enums/actors/WeightPenalty
  #279 = NameAndType        #281:#51      // ordinal:()I
  #280 = Utf8               ext/mods/gameserver/enums/actors/WeightPenalty
  #281 = Utf8               ordinal
  #282 = Fieldref           #283.#284     // ext/mods/gameserver/network/SystemMessageId.INVENTORY_LESS_THAN_80_PERCENT:Lext/mods/gameserver/network/SystemMessageId;
  #283 = Class              #285          // ext/mods/gameserver/network/SystemMessageId
  #284 = NameAndType        #286:#287     // INVENTORY_LESS_THAN_80_PERCENT:Lext/mods/gameserver/network/SystemMessageId;
  #285 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #286 = Utf8               INVENTORY_LESS_THAN_80_PERCENT
  #287 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #288 = Methodref          #47.#289      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #289 = NameAndType        #109:#290     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #290 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #291 = Methodref          #151.#292     // ext/mods/Config$ClassMasterSettings.getRequiredItems:(I)Ljava/util/List;
  #292 = NameAndType        #260:#267     // getRequiredItems:(I)Ljava/util/List;
  #293 = InterfaceMethodref #269.#294     // java/util/List.iterator:()Ljava/util/Iterator;
  #294 = NameAndType        #295:#296     // iterator:()Ljava/util/Iterator;
  #295 = Utf8               iterator
  #296 = Utf8               ()Ljava/util/Iterator;
  #297 = InterfaceMethodref #298.#299     // java/util/Iterator.hasNext:()Z
  #298 = Class              #300          // java/util/Iterator
  #299 = NameAndType        #301:#116     // hasNext:()Z
  #300 = Utf8               java/util/Iterator
  #301 = Utf8               hasNext
  #302 = InterfaceMethodref #298.#303     // java/util/Iterator.next:()Ljava/lang/Object;
  #303 = NameAndType        #304:#305     // next:()Ljava/lang/Object;
  #304 = Utf8               next
  #305 = Utf8               ()Ljava/lang/Object;
  #306 = Class              #307          // ext/mods/gameserver/model/holder/IntIntHolder
  #307 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #308 = Methodref          #47.#309      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #309 = NameAndType        #310:#311     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #310 = Utf8               getInventory
  #311 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #312 = Methodref          #306.#226     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #313 = Methodref          #314.#315     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(I)I
  #314 = Class              #316          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #315 = NameAndType        #317:#201     // getItemCount:(I)I
  #316 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #317 = Utf8               getItemCount
  #318 = Methodref          #306.#319     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #319 = NameAndType        #320:#51      // getValue:()I
  #320 = Utf8               getValue
  #321 = Fieldref           #283.#322     // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #322 = NameAndType        #323:#287     // NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #323 = Utf8               NOT_ENOUGH_ITEMS
  #324 = Methodref          #47.#325      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #325 = NameAndType        #326:#327     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #326 = Utf8               addItem
  #327 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #328 = Methodref          #47.#329      // ext/mods/gameserver/model/actor/Player.setClassId:(I)V
  #329 = NameAndType        #330:#76      // setClassId:(I)V
  #330 = Utf8               setClassId
  #331 = Methodref          #47.#332      // ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
  #332 = NameAndType        #333:#116     // isSubClassActive:()Z
  #333 = Utf8               isSubClassActive
  #334 = Methodref          #47.#335      // ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
  #335 = NameAndType        #336:#337     // getSubClasses:()Ljava/util/Map;
  #336 = Utf8               getSubClasses
  #337 = Utf8               ()Ljava/util/Map;
  #338 = Methodref          #47.#339      // ext/mods/gameserver/model/actor/Player.getClassIndex:()I
  #339 = NameAndType        #340:#51      // getClassIndex:()I
  #340 = Utf8               getClassIndex
  #341 = InterfaceMethodref #342.#343     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #342 = Class              #344          // java/util/Map
  #343 = NameAndType        #345:#346     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #344 = Utf8               java/util/Map
  #345 = Utf8               get
  #346 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #347 = Class              #348          // ext/mods/gameserver/model/actor/container/player/SubClass
  #348 = Utf8               ext/mods/gameserver/model/actor/container/player/SubClass
  #349 = Methodref          #47.#350      // ext/mods/gameserver/model/actor/Player.getActiveClass:()I
  #350 = NameAndType        #351:#51      // getActiveClass:()I
  #351 = Utf8               getActiveClass
  #352 = Methodref          #347.#329     // ext/mods/gameserver/model/actor/container/player/SubClass.setClassId:(I)V
  #353 = Methodref          #47.#354      // ext/mods/gameserver/model/actor/Player.setBaseClass:(I)V
  #354 = NameAndType        #355:#76      // setBaseClass:(I)V
  #355 = Utf8               setBaseClass
  #356 = Methodref          #47.#357      // ext/mods/gameserver/model/actor/Player.refreshHennaList:()V
  #357 = NameAndType        #358:#6       // refreshHennaList:()V
  #358 = Utf8               refreshHennaList
  #359 = Methodref          #47.#360      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #360 = NameAndType        #361:#6       // broadcastUserInfo:()V
  #361 = Utf8               broadcastUserInfo
  #362 = Class              #363          // java/lang/Exception
  #363 = Utf8               java/lang/Exception
  #364 = Methodref          #170.#365     // ext/mods/gameserver/enums/actors/ClassId.getParent:()Lext/mods/gameserver/enums/actors/ClassId;
  #365 = NameAndType        #366:#168     // getParent:()Lext/mods/gameserver/enums/actors/ClassId;
  #366 = Utf8               getParent
  #367 = Methodref          #170.#368     // ext/mods/gameserver/enums/actors/ClassId.isChildOf:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #368 = NameAndType        #369:#370     // isChildOf:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #369 = Utf8               isChildOf
  #370 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Z
  #371 = String             #372          // <tr><td>none</td></r>
  #372 = Utf8               <tr><td>none</td></r>
  #373 = Methodref          #156.#3       // java/lang/StringBuilder."<init>":()V
  #374 = String             #375          // <tr><td><font color=\"LEVEL\">
  #375 = Utf8               <tr><td><font color=\"LEVEL\">
  #376 = String             #377          // </font></td><td>
  #377 = Utf8               </font></td><td>
  #378 = Methodref          #379.#380     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #379 = Class              #381          // ext/mods/gameserver/data/xml/ItemData
  #380 = NameAndType        #98:#382      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #381 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #382 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #383 = Methodref          #379.#384     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #384 = NameAndType        #385:#386     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #385 = Utf8               getTemplate
  #386 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #387 = Methodref          #388.#389     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #388 = Class              #390          // ext/mods/gameserver/model/item/kind/Item
  #389 = NameAndType        #391:#17      // getName:()Ljava/lang/String;
  #390 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #391 = Utf8               getName
  #392 = String             #393          // </td></tr>
  #393 = Utf8               </td></tr>
  #394 = Methodref          #395.#396     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #395 = Class              #397          // ext/mods/gameserver/data/HTMLData
  #396 = NameAndType        #98:#398      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #397 = Utf8               ext/mods/gameserver/data/HTMLData
  #398 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #399 = InvokeDynamic      #6:#85        // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #400 = Methodref          #21.#401      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #401 = NameAndType        #402:#403     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #402 = Utf8               format
  #403 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #404 = Methodref          #395.#405     // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #405 = NameAndType        #406:#407     // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #406 = Utf8               getHtm
  #407 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #408 = Methodref          #47.#389      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #409 = Methodref          #21.#410      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #410 = NameAndType        #106:#411     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #411 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #412 = Methodref          #29.#413      // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #413 = NameAndType        #414:#33      // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #414 = Utf8               separateAndSend
  #415 = String             #416          // custom/classmaster/
  #416 = Utf8               custom/classmaster/
  #417 = Fieldref           #418.#419     // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
  #418 = Class              #420          // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager$SingletonHolder
  #419 = NameAndType        #421:#422     // INSTANCE:Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
  #420 = Utf8               ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager$SingletonHolder
  #421 = Utf8               INSTANCE
  #422 = Utf8               Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
  #423 = Utf8               Code
  #424 = Utf8               LineNumberTable
  #425 = Utf8               LocalVariableTable
  #426 = Utf8               this
  #427 = Utf8               parseCmd
  #428 = Utf8               args
  #429 = Utf8               [Ljava/lang/String;
  #430 = Utf8               html
  #431 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #432 = Utf8               val
  #433 = Utf8               command
  #434 = Utf8               Ljava/lang/String;
  #435 = Utf8               player
  #436 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #437 = Utf8               st
  #438 = Utf8               Ljava/util/StringTokenizer;
  #439 = Utf8               StackMapTable
  #440 = Utf8               sb
  #441 = Utf8               Ljava/lang/StringBuilder;
  #442 = Utf8               cid
  #443 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #444 = Utf8               menu
  #445 = Utf8               minLevel
  #446 = Utf8               currentClassId
  #447 = Utf8               objectId
  #448 = Utf8               level
  #449 = Class              #216          // "[Lext/mods/gameserver/enums/actors/ClassId;"
  #450 = Utf8               item
  #451 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #452 = Utf8               newJobLevel
  #453 = Utf8               neededItems
  #454 = Utf8               Ljava/util/List;
  #455 = Utf8               LocalVariableTypeTable
  #456 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #457 = Utf8               oldCID
  #458 = Utf8               newCID
  #459 = Utf8               parseWrite
  #460 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #461 = Utf8               ar1
  #462 = Utf8               ar2
  #463 = Utf8               ar3
  #464 = Utf8               ar4
  #465 = Utf8               ar5
  #466 = Utf8               page
  #467 = Utf8               content
  #468 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
  #469 = Utf8               SourceFile
  #470 = Utf8               ClassMasterBBSManager.java
  #471 = Utf8               NestMembers
  #472 = Utf8               BootstrapMethods
  #473 = String             #474          // html/CommunityBoard/\u0001ok.htm
  #474 = Utf8               html/CommunityBoard/\u0001ok.htm
  #475 = String             #476          // html/CommunityBoard/\u0001alreadynoble.htm
  #476 = Utf8               html/CommunityBoard/\u0001alreadynoble.htm
  #477 = String             #478          // html/CommunityBoard/\u0001nobleok.htm
  #478 = Utf8               html/CommunityBoard/\u0001nobleok.htm
  #479 = String             #480          // html/CommunityBoard/\u0001nomore.htm
  #480 = Utf8               html/CommunityBoard/\u0001nomore.htm
  #481 = String             #482          // html/CommunityBoard/\u0001template.htm
  #482 = Utf8               html/CommunityBoard/\u0001template.htm
  #483 = String             #484          // html/CommunityBoard/\u0001comebacklater.htm
  #484 = Utf8               html/CommunityBoard/\u0001comebacklater.htm
  #485 = String             #486          // html/CommunityBoard/\u0001%s.htm
  #486 = Utf8               html/CommunityBoard/\u0001%s.htm
  #487 = MethodHandle       6:#488        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #488 = Methodref          #489.#490     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #489 = Class              #491          // java/lang/invoke/StringConcatFactory
  #490 = NameAndType        #86:#492      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #491 = Utf8               java/lang/invoke/StringConcatFactory
  #492 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #493 = Utf8               InnerClasses
  #494 = Utf8               ClassMasterSettings
  #495 = Utf8               SingletonHolder
  #496 = Class              #497          // java/lang/invoke/MethodHandles$Lookup
  #497 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #498 = Class              #499          // java/lang/invoke/MethodHandles
  #499 = Utf8               java/lang/invoke/MethodHandles
  #500 = Utf8               Lookup
{
  public ext.mods.gameserver.communitybbs.custom.ClassMasterBBSManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_1
        17: ldc           #18                 // String _bbsmemo
        19: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        22: ifeq          32
        25: aload_0
        26: ldc           #26                 // String index
        28: aload_2
        29: invokevirtual #28                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        32: aload_1
        33: ldc           #34                 // String _bbsmemo;page
        35: invokevirtual #36                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        38: ifeq          65
        41: aload_1
        42: ldc           #9                  // String
        44: invokevirtual #40                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        47: astore        4
        49: aload         4
        51: arraylength
        52: iconst_1
        53: if_icmple     65
        56: aload_0
        57: aload         4
        59: iconst_1
        60: aaload
        61: aload_2
        62: invokevirtual #28                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        65: aload_1
        66: ldc           #44                 // String _bbsmemo;1stClass
        68: invokevirtual #36                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        71: ifeq          87
        74: aload_0
        75: aload_2
        76: aload_2
        77: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        80: iconst_1
        81: invokevirtual #52                 // Method showHtmlMenu:(Lext/mods/gameserver/model/actor/Player;II)V
        84: goto          361
        87: aload_1
        88: ldc           #56                 // String _bbsmemo;2ndClass
        90: invokevirtual #36                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        93: ifeq          109
        96: aload_0
        97: aload_2
        98: aload_2
        99: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       102: iconst_2
       103: invokevirtual #52                 // Method showHtmlMenu:(Lext/mods/gameserver/model/actor/Player;II)V
       106: goto          361
       109: aload_1
       110: ldc           #58                 // String _bbsmemo;3rdClass
       112: invokevirtual #36                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       115: ifeq          131
       118: aload_0
       119: aload_2
       120: aload_2
       121: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       124: iconst_3
       125: invokevirtual #52                 // Method showHtmlMenu:(Lext/mods/gameserver/model/actor/Player;II)V
       128: goto          361
       131: aload_1
       132: ldc           #60                 // String _bbsmemo;change_class
       134: invokevirtual #36                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       137: ifeq          220
       140: aload_0
       141: ldc           #26                 // String index
       143: aload_2
       144: invokevirtual #28                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       147: aload_3
       148: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       151: invokestatic  #62                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       154: istore        4
       156: aload_2
       157: iload         4
       159: invokestatic  #68                 // Method checkAndChangeClass:(Lext/mods/gameserver/model/actor/Player;I)Z
       162: ifeq          217
       165: new           #72                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       168: dup
       169: aload_2
       170: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       173: invokespecial #74                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       176: astore        5
       178: aload         5
       180: aload_2
       181: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       184: aload_0
       185: invokevirtual #81                 // Method getFolder:()Ljava/lang/String;
       188: invokedynamic #84,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       193: invokevirtual #88                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       196: aload         5
       198: ldc           #92                 // String %name%
       200: invokestatic  #94                 // Method ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
       203: iload         4
       205: invokevirtual #100                // Method ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
       208: invokevirtual #104                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       211: aload_2
       212: aload         5
       214: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       217: goto          361
       220: aload_1
       221: ldc           #111                // String _bbsmemo;become_noble
       223: invokevirtual #36                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       226: ifeq          341
       229: new           #72                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       232: dup
       233: aload_2
       234: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       237: invokespecial #74                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       240: astore        4
       242: aload_0
       243: ldc           #26                 // String index
       245: aload_2
       246: invokevirtual #28                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       249: aload_2
       250: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       253: ifeq          281
       256: aload         4
       258: aload_2
       259: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       262: aload_0
       263: invokevirtual #81                 // Method getFolder:()Ljava/lang/String;
       266: invokedynamic #117,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       271: invokevirtual #88                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       274: aload_2
       275: aload         4
       277: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       280: return
       281: aload_2
       282: getstatic     #118                // Field ext/mods/Config.NOBLE_ITEM_ID:I
       285: getstatic     #124                // Field ext/mods/Config.NOBLE_ITEM_COUNT:I
       288: iconst_1
       289: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       292: ifne          296
       295: return
       296: aload         4
       298: aload_2
       299: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       302: aload_0
       303: invokevirtual #81                 // Method getFolder:()Ljava/lang/String;
       306: invokedynamic #131,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       311: invokevirtual #88                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       314: aload_2
       315: iconst_1
       316: iconst_1
       317: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Player.setNoble:(ZZ)V
       320: aload_2
       321: new           #136                // class ext/mods/gameserver/network/serverpackets/UserInfo
       324: dup
       325: aload_2
       326: invokespecial #138                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       329: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       332: aload_2
       333: aload         4
       335: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       338: goto          361
       341: aload_1
       342: ldc           #141                // String _bbsmemo;learn_skills
       344: invokevirtual #36                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       347: ifeq          361
       350: aload_0
       351: ldc           #26                 // String index
       353: aload_2
       354: invokevirtual #28                 // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       357: aload_2
       358: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.rewardSkills:()V
       361: return
      LineNumberTable:
        line 42: 0
        line 43: 11
        line 45: 16
        line 46: 25
        line 47: 32
        line 49: 41
        line 50: 49
        line 51: 56
        line 53: 65
        line 54: 74
        line 55: 87
        line 56: 96
        line 57: 109
        line 58: 118
        line 59: 131
        line 61: 140
        line 62: 147
        line 64: 156
        line 66: 165
        line 67: 178
        line 68: 196
        line 69: 211
        line 71: 217
        line 72: 220
        line 74: 229
        line 76: 242
        line 78: 249
        line 80: 256
        line 81: 274
        line 82: 280
        line 85: 281
        line 86: 295
        line 88: 296
        line 89: 314
        line 90: 320
        line 91: 332
        line 92: 338
        line 93: 341
        line 95: 350
        line 96: 357
        line 98: 361
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49      16     4  args   [Ljava/lang/String;
          178      39     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          156      61     4   val   I
          242      96     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     362     0  this   Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
            0     362     1 command   Ljava/lang/String;
            0     362     2 player   Lext/mods/gameserver/model/actor/Player;
           11     351     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/util/StringTokenizer ]
        frame_type = 32 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 85
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 14 /* same */
        frame_type = 250 /* chop */
          offset_delta = 44
        frame_type = 19 /* same */

  public void parseWrite(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=7, args_size=7
         0: aload         6
         2: ifnonnull     6
         5: return
         6: return
      LineNumberTable:
        line 322: 0
        line 323: 5
        line 324: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
            0       7     1   ar1   Ljava/lang/String;
            0       7     2   ar2   Ljava/lang/String;
            0       7     3   ar3   Ljava/lang/String;
            0       7     4   ar4   Ljava/lang/String;
            0       7     5   ar5   Ljava/lang/String;
            0       7     6 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc_w         #415                // String custom/classmaster/
         3: areturn
      LineNumberTable:
        line 336: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;

  public static ext.mods.gameserver.communitybbs.custom.ClassMasterBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #417                // Field ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
         3: areturn
      LineNumberTable:
        line 341: 0
}
SourceFile: "ClassMasterBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager$SingletonHolder
BootstrapMethods:
  0: #487 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #473 html/CommunityBoard/\u0001ok.htm
  1: #487 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #475 html/CommunityBoard/\u0001alreadynoble.htm
  2: #487 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #477 html/CommunityBoard/\u0001nobleok.htm
  3: #487 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #479 html/CommunityBoard/\u0001nomore.htm
  4: #487 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #481 html/CommunityBoard/\u0001template.htm
  5: #487 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #483 html/CommunityBoard/\u0001comebacklater.htm
  6: #487 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #485 html/CommunityBoard/\u0001%s.htm
InnerClasses:
  public static final #494= #151 of #119; // ClassMasterSettings=class ext/mods/Config$ClassMasterSettings of class ext/mods/Config
  public static final #500= #496 of #498; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
