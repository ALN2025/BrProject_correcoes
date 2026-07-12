// Bytecode for: ext.mods.gameserver.communitybbs.custom.BuffBBSManager
// File: ext\mods\gameserver\communitybbs\custom\BuffBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/custom/BuffBBSManager.class
  Last modified 9 de jul de 2026; size 21945 bytes
  MD5 checksum b36499c21c9519532e028e5e3378ecc7
  Compiled from "BuffBBSManager.java"
public class ext.mods.gameserver.communitybbs.custom.BuffBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/communitybbs/custom/BuffBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 2, methods: 19, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/communitybbs/custom/BuffBBSManager._isPetTarget:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/communitybbs/custom/BuffBBSManager
   #12 = NameAndType        #14:#15       // _isPetTarget:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/communitybbs/custom/BuffBBSManager
   #14 = Utf8               _isPetTarget
   #15 = Utf8               Ljava/util/Map;
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
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#32       // getObjectId:()I
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               getObjectId
   #32 = Utf8               ()I
   #33 = Methodref          #34.#35       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #34 = Class              #36           // java/lang/Integer
   #35 = NameAndType        #37:#38       // valueOf:(I)Ljava/lang/Integer;
   #36 = Utf8               java/lang/Integer
   #37 = Utf8               valueOf
   #38 = Utf8               (I)Ljava/lang/Integer;
   #39 = Methodref          #40.#41       // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #40 = Class              #42           // java/lang/Boolean
   #41 = NameAndType        #37:#43       // valueOf:(Z)Ljava/lang/Boolean;
   #42 = Utf8               java/lang/Boolean
   #43 = Utf8               (Z)Ljava/lang/Boolean;
   #44 = InterfaceMethodref #45.#46       // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #45 = Class              #47           // java/util/Map
   #46 = NameAndType        #48:#49       // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #47 = Utf8               java/util/Map
   #48 = Utf8               getOrDefault
   #49 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #50 = Methodref          #40.#51       // java/lang/Boolean.booleanValue:()Z
   #51 = NameAndType        #52:#53       // booleanValue:()Z
   #52 = Utf8               booleanValue
   #53 = Utf8               ()Z
   #54 = Methodref          #28.#55       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #55 = NameAndType        #56:#57       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #56 = Utf8               getSummon
   #57 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #58 = Methodref          #59.#60       // java/lang/String.hashCode:()I
   #59 = Class              #61           // java/lang/String
   #60 = NameAndType        #62:#32       // hashCode:()I
   #61 = Utf8               java/lang/String
   #62 = Utf8               hashCode
   #63 = String             #64           // _bbsloc;premium
   #64 = Utf8               _bbsloc;premium
   #65 = Methodref          #59.#66       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #66 = NameAndType        #67:#68       // equals:(Ljava/lang/Object;)Z
   #67 = Utf8               equals
   #68 = Utf8               (Ljava/lang/Object;)Z
   #69 = String             #70           // _bbsloc;heal
   #70 = Utf8               _bbsloc;heal
   #71 = String             #72           // _bbsloc;cleanse
   #72 = Utf8               _bbsloc;cleanse
   #73 = String             #74           // _bbsloc;support
   #74 = Utf8               _bbsloc;support
   #75 = String             #76           // _bbsloc;cancel
   #76 = Utf8               _bbsloc;cancel
   #77 = Methodref          #28.#78       // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #78 = NameAndType        #79:#32       // getPremiumService:()I
   #79 = Utf8               getPremiumService
   #80 = Methodref          #81.#82       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #81 = Class              #83           // ext/mods/gameserver/data/HTMLData
   #82 = NameAndType        #84:#85       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #83 = Utf8               ext/mods/gameserver/data/HTMLData
   #84 = Utf8               getInstance
   #85 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #86 = Methodref          #28.#87       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #87 = NameAndType        #88:#89       // getLocale:()Ljava/util/Locale;
   #88 = Utf8               getLocale
   #89 = Utf8               ()Ljava/util/Locale;
   #90 = Methodref          #11.#91       // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.getFolder:()Ljava/lang/String;
   #91 = NameAndType        #92:#26       // getFolder:()Ljava/lang/String;
   #92 = Utf8               getFolder
   #93 = InvokeDynamic      #0:#94        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #94 = NameAndType        #95:#96       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #95 = Utf8               makeConcatWithConstants
   #96 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #97 = Methodref          #81.#98       // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #98 = NameAndType        #99:#100      // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #99 = Utf8               getHtm
  #100 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #101 = String             #102          // %name%
  #102 = Utf8               %name%
  #103 = Methodref          #28.#104      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #104 = NameAndType        #105:#26      // getName:()Ljava/lang/String;
  #105 = Utf8               getName
  #106 = Methodref          #59.#107      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #107 = NameAndType        #108:#109     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #108 = Utf8               replace
  #109 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #110 = Methodref          #11.#111      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #111 = NameAndType        #112:#113     // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #112 = Utf8               separateAndSend
  #113 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #114 = InvokeDynamic      #1:#94        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #115 = Methodref          #28.#116      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #116 = NameAndType        #117:#118     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #117 = Utf8               getStatus
  #118 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #119 = Methodref          #120.#121     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
  #120 = Class              #122          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #121 = NameAndType        #123:#6       // setMaxCpHpMp:()V
  #122 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #123 = Utf8               setMaxCpHpMp
  #124 = Methodref          #125.#126     // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #125 = Class              #127          // ext/mods/gameserver/model/actor/Creature
  #126 = NameAndType        #117:#128     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #127 = Utf8               ext/mods/gameserver/model/actor/Creature
  #128 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/actor/status/CreatureStatus.setMaxHpMp:()V
  #130 = Class              #132          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #131 = NameAndType        #133:#6       // setMaxHpMp:()V
  #132 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #133 = Utf8               setMaxHpMp
  #134 = Methodref          #11.#135      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.showIndexPage:(Lext/mods/gameserver/model/actor/Player;)V
  #135 = NameAndType        #136:#137     // showIndexPage:(Lext/mods/gameserver/model/actor/Player;)V
  #136 = Utf8               showIndexPage
  #137 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #138 = Methodref          #125.#139     // ext/mods/gameserver/model/actor/Creature.stopAllEffectsDebuff:()V
  #139 = NameAndType        #140:#6       // stopAllEffectsDebuff:()V
  #140 = Utf8               stopAllEffectsDebuff
  #141 = Methodref          #11.#142      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #142 = NameAndType        #143:#137     // showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #143 = Utf8               showGiveBuffsWindow
  #144 = Methodref          #125.#145     // ext/mods/gameserver/model/actor/Creature.stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #145 = NameAndType        #146:#6       // stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #146 = Utf8               stopAllEffectsExceptThoseThatLastThroughDeath
  #147 = String             #148          // _bbsloc
  #148 = Utf8               _bbsloc
  #149 = String             #150          // _bbsloc;menu
  #150 = Utf8               _bbsloc;menu
  #151 = Methodref          #59.#152      // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #152 = NameAndType        #153:#154     // startsWith:(Ljava/lang/String;)Z
  #153 = Utf8               startsWith
  #154 = Utf8               (Ljava/lang/String;)Z
  #155 = InterfaceMethodref #45.#156      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #156 = NameAndType        #157:#49      // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #157 = Utf8               put
  #158 = InterfaceMethodref #45.#159      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #159 = NameAndType        #160:#161     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #160 = Utf8               get
  #161 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #162 = Class              #163          // java/lang/Object
  #163 = Utf8               java/lang/Object
  #164 = Methodref          #28.#165      // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #165 = NameAndType        #166:#167     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #166 = Utf8               getSysString
  #167 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #168 = Methodref          #28.#169      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #169 = NameAndType        #170:#171     // sendMessage:(Ljava/lang/String;)V
  #170 = Utf8               sendMessage
  #171 = Utf8               (Ljava/lang/String;)V
  #172 = String             #173          // _bbsloc;page
  #173 = Utf8               _bbsloc;page
  #174 = Methodref          #59.#175      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #175 = NameAndType        #176:#177     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #176 = Utf8               split
  #177 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #178 = Methodref          #11.#179      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #179 = NameAndType        #180:#113     // showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #180 = Utf8               showPage
  #181 = String             #182          // _bbsloc;getscheme
  #182 = Utf8               _bbsloc;getscheme
  #183 = Methodref          #184.#185     // ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
  #184 = Class              #186          // ext/mods/gameserver/data/manager/BufferManager
  #185 = NameAndType        #84:#187      // getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
  #186 = Utf8               ext/mods/gameserver/data/manager/BufferManager
  #187 = Utf8               ()Lext/mods/gameserver/data/manager/BufferManager;
  #188 = Methodref          #59.#189      // java/lang/String.toUpperCase:()Ljava/lang/String;
  #189 = NameAndType        #190:#26      // toUpperCase:()Ljava/lang/String;
  #190 = Utf8               toUpperCase
  #191 = Methodref          #192.#193     // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #192 = Class              #194          // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
  #193 = NameAndType        #37:#195      // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #194 = Utf8               ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
  #195 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #196 = Methodref          #184.#197     // ext/mods/gameserver/data/manager/BufferManager.getSchemeSkills:(Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List;
  #197 = NameAndType        #198:#199     // getSchemeSkills:(Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List;
  #198 = Utf8               getSchemeSkills
  #199 = Utf8               (Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List;
  #200 = InterfaceMethodref #201.#202     // java/util/List.iterator:()Ljava/util/Iterator;
  #201 = Class              #203          // java/util/List
  #202 = NameAndType        #204:#205     // iterator:()Ljava/util/Iterator;
  #203 = Utf8               java/util/List
  #204 = Utf8               iterator
  #205 = Utf8               ()Ljava/util/Iterator;
  #206 = InterfaceMethodref #207.#208     // java/util/Iterator.hasNext:()Z
  #207 = Class              #209          // java/util/Iterator
  #208 = NameAndType        #210:#53      // hasNext:()Z
  #209 = Utf8               java/util/Iterator
  #210 = Utf8               hasNext
  #211 = InterfaceMethodref #207.#212     // java/util/Iterator.next:()Ljava/lang/Object;
  #212 = NameAndType        #213:#214     // next:()Ljava/lang/Object;
  #213 = Utf8               next
  #214 = Utf8               ()Ljava/lang/Object;
  #215 = Class              #216          // ext/mods/gameserver/skills/L2Skill
  #216 = Utf8               ext/mods/gameserver/skills/L2Skill
  #217 = Class              #218          // java/util/ArrayList
  #218 = Utf8               java/util/ArrayList
  #219 = Methodref          #217.#3       // java/util/ArrayList."<init>":()V
  #220 = Methodref          #221.#222     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #221 = Class              #223          // ext/mods/gameserver/data/SkillTable
  #222 = NameAndType        #84:#224      // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #223 = Utf8               ext/mods/gameserver/data/SkillTable
  #224 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #225 = Methodref          #215.#226     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #226 = NameAndType        #227:#32      // getId:()I
  #227 = Utf8               getId
  #228 = Methodref          #215.#229     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #229 = NameAndType        #230:#32      // getLevel:()I
  #230 = Utf8               getLevel
  #231 = Methodref          #221.#232     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #232 = NameAndType        #233:#234     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #233 = Utf8               getInfo
  #234 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #235 = InterfaceMethodref #201.#236     // java/util/List.add:(Ljava/lang/Object;)Z
  #236 = NameAndType        #237:#68      // add:(Ljava/lang/Object;)Z
  #237 = Utf8               add
  #238 = Methodref          #11.#239      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.getFee:(Ljava/util/List;)I
  #239 = NameAndType        #240:#241     // getFee:(Ljava/util/List;)I
  #240 = Utf8               getFee
  #241 = Utf8               (Ljava/util/List;)I
  #242 = Methodref          #28.#243      // ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
  #243 = NameAndType        #244:#245     // reduceAdena:(IZ)Z
  #244 = Utf8               reduceAdena
  #245 = Utf8               (IZ)Z
  #246 = InvokeDynamic      #2:#247       // #2:accept:(Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #247 = NameAndType        #248:#249     // accept:(Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #248 = Utf8               accept
  #249 = Utf8               (Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #250 = InterfaceMethodref #201.#251     // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #251 = NameAndType        #252:#253     // forEach:(Ljava/util/function/Consumer;)V
  #252 = Utf8               forEach
  #253 = Utf8               (Ljava/util/function/Consumer;)V
  #254 = String             #255          // Wrong command!
  #255 = Utf8               Wrong command!
  #256 = String             #257          // _bbsloc;buff
  #257 = Utf8               _bbsloc;buff
  #258 = Methodref          #34.#259      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #259 = NameAndType        #260:#261     // parseInt:(Ljava/lang/String;)I
  #260 = Utf8               parseInt
  #261 = Utf8               (Ljava/lang/String;)I
  #262 = Methodref          #184.#263     // ext/mods/gameserver/data/manager/BufferManager.getAvailableBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
  #263 = NameAndType        #264:#265     // getAvailableBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
  #264 = Utf8               getAvailableBuff
  #265 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
  #266 = Fieldref           #11.#267      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #267 = NameAndType        #268:#269     // LOGGER:Lext/mods/commons/logging/CLogger;
  #268 = Utf8               LOGGER
  #269 = Utf8               Lext/mods/commons/logging/CLogger;
  #270 = String             #271          // bypass hack detected player [{}], skill id [{}]
  #271 = Utf8               bypass hack detected player [{}], skill id [{}]
  #272 = Methodref          #273.#274     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #273 = Class              #275          // ext/mods/commons/logging/CLogger
  #274 = NameAndType        #276:#277     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #275 = Utf8               ext/mods/commons/logging/CLogger
  #276 = Utf8               info
  #277 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #278 = String             #279          // premium
  #279 = Utf8               premium
  #280 = Methodref          #281.#282     // ext/mods/gameserver/model/records/BuffSkill.type:()Ljava/lang/String;
  #281 = Class              #283          // ext/mods/gameserver/model/records/BuffSkill
  #282 = NameAndType        #284:#26      // type:()Ljava/lang/String;
  #283 = Utf8               ext/mods/gameserver/model/records/BuffSkill
  #284 = Utf8               type
  #285 = String             #286          // bypass hack detected player not premium [{}]
  #286 = Utf8               bypass hack detected player not premium [{}]
  #287 = InvokeDynamic      #3:#247       // #3:accept:(Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #288 = Class              #289          // java/lang/NumberFormatException
  #289 = Utf8               java/lang/NumberFormatException
  #290 = Methodref          #288.#291     // java/lang/NumberFormatException.getMessage:()Ljava/lang/String;
  #291 = NameAndType        #292:#26      // getMessage:()Ljava/lang/String;
  #292 = Utf8               getMessage
  #293 = InvokeDynamic      #4:#94        // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #294 = Methodref          #273.#295     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
  #295 = NameAndType        #296:#297     // error:(Ljava/lang/Object;)V
  #296 = Utf8               error
  #297 = Utf8               (Ljava/lang/Object;)V
  #298 = String             #299          // _bbsloc;skill
  #299 = Utf8               _bbsloc;skill
  #300 = Methodref          #184.#301     // ext/mods/gameserver/data/manager/BufferManager.getScheme:(ILjava/lang/String;)Ljava/util/List;
  #301 = NameAndType        #302:#303     // getScheme:(ILjava/lang/String;)Ljava/util/List;
  #302 = Utf8               getScheme
  #303 = Utf8               (ILjava/lang/String;)Ljava/util/List;
  #304 = Methodref          #11.#305      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.premiumSkills:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
  #305 = NameAndType        #306:#307     // premiumSkills:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
  #306 = Utf8               premiumSkills
  #307 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
  #308 = String             #309          // _bbsloc;skillselect
  #309 = Utf8               _bbsloc;skillselect
  #310 = String             #311          // none
  #311 = Utf8               none
  #312 = Methodref          #59.#313      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #313 = NameAndType        #314:#154     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #314 = Utf8               equalsIgnoreCase
  #315 = InterfaceMethodref #201.#316     // java/util/List.size:()I
  #316 = NameAndType        #317:#32      // size:()I
  #317 = Utf8               size
  #318 = Methodref          #28.#319      // ext/mods/gameserver/model/actor/Player.getMaxBuffCount:()I
  #319 = NameAndType        #320:#32      // getMaxBuffCount:()I
  #320 = Utf8               getMaxBuffCount
  #321 = String             #322          // _bbsloc;skillunselect
  #322 = Utf8               _bbsloc;skillunselect
  #323 = InterfaceMethodref #201.#324     // java/util/List.remove:(Ljava/lang/Object;)Z
  #324 = NameAndType        #325:#68      // remove:(Ljava/lang/Object;)Z
  #325 = Utf8               remove
  #326 = Methodref          #11.#327      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.showEditSchemeWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;I)V
  #327 = NameAndType        #328:#329     // showEditSchemeWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;I)V
  #328 = Utf8               showEditSchemeWindow
  #329 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;I)V
  #330 = String             #331          // _bbsloc;createscheme
  #331 = Utf8               _bbsloc;createscheme
  #332 = Methodref          #59.#333      // java/lang/String.length:()I
  #333 = NameAndType        #334:#32      // length:()I
  #334 = Utf8               length
  #335 = Methodref          #184.#336     // ext/mods/gameserver/data/manager/BufferManager.getPlayerSchemes:(I)Ljava/util/Map;
  #336 = NameAndType        #337:#338     // getPlayerSchemes:(I)Ljava/util/Map;
  #337 = Utf8               getPlayerSchemes
  #338 = Utf8               (I)Ljava/util/Map;
  #339 = InterfaceMethodref #45.#316      // java/util/Map.size:()I
  #340 = Fieldref           #341.#342     // ext/mods/Config.BUFFER_MAX_SCHEMES:I
  #341 = Class              #343          // ext/mods/Config
  #342 = NameAndType        #344:#345     // BUFFER_MAX_SCHEMES:I
  #343 = Utf8               ext/mods/Config
  #344 = Utf8               BUFFER_MAX_SCHEMES
  #345 = Utf8               I
  #346 = InterfaceMethodref #45.#347      // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #347 = NameAndType        #348:#68      // containsKey:(Ljava/lang/Object;)Z
  #348 = Utf8               containsKey
  #349 = Methodref          #59.#350      // java/lang/String.trim:()Ljava/lang/String;
  #350 = NameAndType        #351:#26      // trim:()Ljava/lang/String;
  #351 = Utf8               trim
  #352 = Methodref          #184.#353     // ext/mods/gameserver/data/manager/BufferManager.setScheme:(ILjava/lang/String;Ljava/util/ArrayList;)V
  #353 = NameAndType        #354:#355     // setScheme:(ILjava/lang/String;Ljava/util/ArrayList;)V
  #354 = Utf8               setScheme
  #355 = Utf8               (ILjava/lang/String;Ljava/util/ArrayList;)V
  #356 = Class              #357          // java/lang/Exception
  #357 = Utf8               java/lang/Exception
  #358 = String             #359          // _bbsloc;editschemes
  #359 = Utf8               _bbsloc;editschemes
  #360 = String             #361          // _bbsloc;deletescheme
  #361 = Utf8               _bbsloc;deletescheme
  #362 = InterfaceMethodref #45.#363      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #363 = NameAndType        #325:#161     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #364 = String             #365          // _bbsloc;getbuff
  #365 = Utf8               _bbsloc;getbuff
  #366 = InvokeDynamic      #5:#247       // #5:accept:(Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #367 = String             #368          // _bbsloc;singlebuff
  #368 = Utf8               _bbsloc;singlebuff
  #369 = Methodref          #11.#370      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.showSingleBuffSelectionWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #370 = NameAndType        #371:#372     // showSingleBuffSelectionWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #371 = Utf8               showSingleBuffSelectionWindow
  #372 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #373 = String             #374          // _bbsloc;givebuffs
  #374 = Utf8               _bbsloc;givebuffs
  #375 = Methodref          #16.#376      // java/util/StringTokenizer.hasMoreTokens:()Z
  #376 = NameAndType        #377:#53      // hasMoreTokens:()Z
  #377 = Utf8               hasMoreTokens
  #378 = String             #379          // pet
  #379 = Utf8               pet
  #380 = String             #381          // You have not summon
  #381 = Utf8               You have not summon
  #382 = Methodref          #184.#383     // ext/mods/gameserver/data/manager/BufferManager.applySchemeEffects:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILjava/lang/String;)V
  #383 = NameAndType        #384:#385     // applySchemeEffects:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILjava/lang/String;)V
  #384 = Utf8               applySchemeEffects
  #385 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILjava/lang/String;)V
  #386 = InvokeDynamic      #6:#94        // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #387 = Methodref          #59.#388      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #388 = NameAndType        #389:#390     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #389 = Utf8               format
  #390 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #391 = String             #392          // %target%
  #392 = Utf8               %target%
  #393 = String             #394          // Summon
  #394 = Utf8               Summon
  #395 = String             #396          // Player
  #396 = Utf8               Player
  #397 = Methodref          #59.#398      // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #398 = NameAndType        #399:#400     // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #399 = Utf8               replaceAll
  #400 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #401 = InvokeDynamic      #7:#94        // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #402 = String             #403          // Player %s tried access unknown page: %s
  #403 = Utf8               Player %s tried access unknown page: %s
  #404 = Methodref          #273.#405     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #405 = NameAndType        #296:#277     // error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #406 = Methodref          #215.#407     // ext/mods/gameserver/skills/L2Skill.getEffectsNpc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #407 = NameAndType        #408:#409     // getEffectsNpc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #408 = Utf8               getEffectsNpc
  #409 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #410 = Class              #411          // java/lang/StringBuilder
  #411 = Utf8               java/lang/StringBuilder
  #412 = Methodref          #410.#413     // java/lang/StringBuilder."<init>":(I)V
  #413 = NameAndType        #5:#414       // "<init>":(I)V
  #414 = Utf8               (I)V
  #415 = InterfaceMethodref #45.#416      // java/util/Map.isEmpty:()Z
  #416 = NameAndType        #417:#53      // isEmpty:()Z
  #417 = Utf8               isEmpty
  #418 = InvokeDynamic      #8:#94        // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #419 = Methodref          #410.#420     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #420 = NameAndType        #421:#422     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #421 = Utf8               append
  #422 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #423 = InterfaceMethodref #45.#424      // java/util/Map.entrySet:()Ljava/util/Set;
  #424 = NameAndType        #425:#426     // entrySet:()Ljava/util/Set;
  #425 = Utf8               entrySet
  #426 = Utf8               ()Ljava/util/Set;
  #427 = InterfaceMethodref #428.#202     // java/util/Set.iterator:()Ljava/util/Iterator;
  #428 = Class              #429          // java/util/Set
  #429 = Utf8               java/util/Set
  #430 = Class              #431          // java/util/Map$Entry
  #431 = Utf8               java/util/Map$Entry
  #432 = InterfaceMethodref #430.#433     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #433 = NameAndType        #434:#214     // getValue:()Ljava/lang/Object;
  #434 = Utf8               getValue
  #435 = String             #436          // <table width=\"320\"><tr><td width=\"200\"><font color=\"LEVEL\">
  #436 = Utf8               <table width=\"320\"><tr><td width=\"200\"><font color=\"LEVEL\">
  #437 = InterfaceMethodref #430.#438     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #438 = NameAndType        #439:#214     // getKey:()Ljava/lang/Object;
  #439 = Utf8               getKey
  #440 = String             #441          //  [
  #441 = Utf8                [
  #442 = Methodref          #217.#316     // java/util/ArrayList.size:()I
  #443 = String             #444          //  /
  #444 = Utf8                /
  #445 = String             #446          // ]
  #446 = Utf8               ]
  #447 = Methodref          #448.#449     // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
  #448 = Class              #450          // ext/mods/commons/lang/StringUtil
  #449 = NameAndType        #451:#452     // formatNumber:(J)Ljava/lang/String;
  #450 = Utf8               ext/mods/commons/lang/StringUtil
  #451 = Utf8               formatNumber
  #452 = Utf8               (J)Ljava/lang/String;
  #453 = InvokeDynamic      #9:#94        // #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #454 = String             #455          //
  #455 = Utf8
  #456 = String             #457          // </font></td></tr></table><br1>
  #457 = Utf8               </font></td></tr></table><br1>
  #458 = Methodref          #448.#459     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #459 = NameAndType        #421:#460     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #460 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #461 = InvokeDynamic      #10:#94       // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #462 = String             #463          // \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #463 = Utf8               \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #464 = InvokeDynamic      #11:#94       // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #465 = String             #466          //  pet\" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #466 = Utf8                pet\" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #467 = InvokeDynamic      #12:#94       // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #468 = String             #469          //  1\" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #469 = Utf8                1\" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #470 = InvokeDynamic      #13:#94       // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #471 = String             #472          // \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td></tr></table><br>
  #472 = Utf8               \" width=75 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td></tr></table><br>
  #473 = InvokeDynamic      #14:#94       // #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #474 = String             #475          // %schemes%
  #475 = Utf8               %schemes%
  #476 = Methodref          #410.#477     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #477 = NameAndType        #478:#26      // toString:()Ljava/lang/String;
  #478 = Utf8               toString
  #479 = String             #480          // %max_schemes%
  #480 = Utf8               %max_schemes%
  #481 = Methodref          #59.#482      // java/lang/String.valueOf:(I)Ljava/lang/String;
  #482 = NameAndType        #37:#483      // valueOf:(I)Ljava/lang/String;
  #483 = Utf8               (I)Ljava/lang/String;
  #484 = InvokeDynamic      #15:#94       // #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #485 = String             #486          // %schemename%
  #486 = Utf8               %schemename%
  #487 = String             #488          // %count%
  #488 = Utf8               %count%
  #489 = InvokeDynamic      #16:#490      // #16:makeConcatWithConstants:(II)Ljava/lang/String;
  #490 = NameAndType        #95:#491      // makeConcatWithConstants:(II)Ljava/lang/String;
  #491 = Utf8               (II)Ljava/lang/String;
  #492 = String             #493          // %typesframe%
  #493 = Utf8               %typesframe%
  #494 = Methodref          #11.#495      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.getTypesFrame:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
  #495 = NameAndType        #496:#497     // getTypesFrame:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
  #496 = Utf8               getTypesFrame
  #497 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
  #498 = String             #499          // %skilllistframe%
  #499 = Utf8               %skilllistframe%
  #500 = Methodref          #11.#501      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.getGroupSkillList:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;ZI)Ljava/lang/String;
  #501 = NameAndType        #502:#503     // getGroupSkillList:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;ZI)Ljava/lang/String;
  #502 = Utf8               getGroupSkillList
  #503 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;ZI)Ljava/lang/String;
  #504 = InvokeDynamic      #17:#94       // #17:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #505 = Methodref          #184.#506     // ext/mods/gameserver/data/manager/BufferManager.getSkillsIdsByType:(Ljava/lang/String;)Ljava/util/List;
  #506 = NameAndType        #507:#508     // getSkillsIdsByType:(Ljava/lang/String;)Ljava/util/List;
  #507 = Utf8               getSkillsIdsByType
  #508 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #509 = InterfaceMethodref #201.#416     // java/util/List.isEmpty:()Z
  #510 = Methodref          #511.#512     // ext/mods/commons/math/MathUtil.countPagesNumber:(II)I
  #511 = Class              #513          // ext/mods/commons/math/MathUtil
  #512 = NameAndType        #514:#515     // countPagesNumber:(II)I
  #513 = Utf8               ext/mods/commons/math/MathUtil
  #514 = Utf8               countPagesNumber
  #515 = Utf8               (II)I
  #516 = Methodref          #517.#518     // java/lang/Math.min:(II)I
  #517 = Class              #519          // java/lang/Math
  #518 = NameAndType        #520:#515     // min:(II)I
  #519 = Utf8               java/lang/Math
  #520 = Utf8               min
  #521 = InterfaceMethodref #201.#522     // java/util/List.subList:(II)Ljava/util/List;
  #522 = NameAndType        #523:#524     // subList:(II)Ljava/util/List;
  #523 = Utf8               subList
  #524 = Utf8               (II)Ljava/util/List;
  #525 = String             #526          // <table width=\"280\" bgcolor=\"000000\"><tr>
  #526 = Utf8               <table width=\"280\" bgcolor=\"000000\"><tr>
  #527 = String             #528          // <table width=\"280\"><tr>
  #528 = Utf8               <table width=\"280\"><tr>
  #529 = String             #530          // <td height=40 width=40><button action=\"bypass _bbsloc;getbuff
  #530 = Utf8               <td height=40 width=40><button action=\"bypass _bbsloc;getbuff
  #531 = String             #532          // \" width=32 height=32 back=\"
  #532 = Utf8               \" width=32 height=32 back=\"
  #533 = Methodref          #215.#534     // ext/mods/gameserver/skills/L2Skill.getIcon:()Ljava/lang/String;
  #534 = NameAndType        #535:#26      // getIcon:()Ljava/lang/String;
  #535 = Utf8               getIcon
  #536 = String             #537          // \" fore=\"
  #537 = Utf8               \" fore=\"
  #538 = String             #539          // \" /></td><td width=190>
  #539 = Utf8               \" /></td><td width=190>
  #540 = Methodref          #215.#104     // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #541 = String             #542          // <br1><font color=\"B09878\">
  #542 = Utf8               <br1><font color=\"B09878\">
  #543 = Methodref          #281.#544     // ext/mods/gameserver/model/records/BuffSkill.description:()Ljava/lang/String;
  #544 = NameAndType        #545:#26      // description:()Ljava/lang/String;
  #545 = Utf8               description
  #546 = String             #547          // </font></td>
  #547 = Utf8               </font></td>
  #548 = InterfaceMethodref #201.#549     // java/util/List.contains:(Ljava/lang/Object;)Z
  #549 = NameAndType        #550:#68      // contains:(Ljava/lang/Object;)Z
  #550 = Utf8               contains
  #551 = String             #552          // <td height=40 width=40><img src=\"
  #552 = Utf8               <td height=40 width=40><img src=\"
  #553 = String             #554          // \" width=32 height=32></td><td width=190>
  #554 = Utf8               \" width=32 height=32></td><td width=190>
  #555 = String             #556          // </font></td><td><button action=\"bypass _bbsloc;skillunselect
  #556 = Utf8               </font></td><td><button action=\"bypass _bbsloc;skillunselect
  #557 = String             #558          // \" width=32 height=32 back=\"L2UI_CH3.mapbutton_zoomout2\" fore=\"L2UI_CH3.mapbutton_zoomout1\"></td>
  #558 = Utf8               \" width=32 height=32 back=\"L2UI_CH3.mapbutton_zoomout2\" fore=\"L2UI_CH3.mapbutton_zoomout1\"></td>
  #559 = String             #560          // </font></td><td><button action=\"bypass _bbsloc;skillselect
  #560 = Utf8               </font></td><td><button action=\"bypass _bbsloc;skillselect
  #561 = String             #562          // \" width=32 height=32 back=\"L2UI_CH3.mapbutton_zoomin2\" fore=\"L2UI_CH3.mapbutton_zoomin1\"></td>
  #562 = Utf8               \" width=32 height=32 back=\"L2UI_CH3.mapbutton_zoomin2\" fore=\"L2UI_CH3.mapbutton_zoomin1\"></td>
  #563 = String             #564          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #564 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #565 = String             #566          // <img height=41>
  #566 = Utf8               <img height=41>
  #567 = String             #568          // <br><img src=\"L2UI.SquareGray\" width=280 height=1><table width=\"100%\" bgcolor=000000><tr>
  #568 = Utf8               <br><img src=\"L2UI.SquareGray\" width=280 height=1><table width=\"100%\" bgcolor=000000><tr>
  #569 = String             #570          // <td align=left width=70><a action=\"bypass _bbsloc;singlebuff
  #570 = Utf8               <td align=left width=70><a action=\"bypass _bbsloc;singlebuff
  #571 = InvokeDynamic      #18:#94       // #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #572 = String             #573          // <td align=left width=70><a action=\"bypass _bbsloc;editschemes
  #573 = Utf8               <td align=left width=70><a action=\"bypass _bbsloc;editschemes
  #574 = InvokeDynamic      #19:#94       // #19:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #575 = InvokeDynamic      #20:#94       // #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #576 = String             #577          // </td>
  #577 = Utf8               </td>
  #578 = String             #579          // <td align=right width=70><a action=\"bypass _bbsloc;singlebuff
  #579 = Utf8               <td align=right width=70><a action=\"bypass _bbsloc;singlebuff
  #580 = String             #581          // <td align=right width=70><a action=\"bypass _bbsloc;editschemes
  #581 = Utf8               <td align=right width=70><a action=\"bypass _bbsloc;editschemes
  #582 = InvokeDynamic      #21:#94       // #21:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #583 = String             #584          // <table>
  #584 = Utf8               <table>
  #585 = Methodref          #184.#586     // ext/mods/gameserver/data/manager/BufferManager.getSkillTypes:()Ljava/util/List;
  #586 = NameAndType        #587:#588     // getSkillTypes:()Ljava/util/List;
  #587 = Utf8               getSkillTypes
  #588 = Utf8               ()Ljava/util/List;
  #589 = Fieldref           #341.#590     // ext/mods/Config.PREMIUM_BUFFS_CATEGORY:Ljava/util/List;
  #590 = NameAndType        #591:#592     // PREMIUM_BUFFS_CATEGORY:Ljava/util/List;
  #591 = Utf8               PREMIUM_BUFFS_CATEGORY
  #592 = Utf8               Ljava/util/List;
  #593 = String             #594          // <tr>
  #594 = Utf8               <tr>
  #595 = String             #596          // <td width=65>
  #596 = Utf8               <td width=65>
  #597 = String             #598          // <td width=65><a action=\"bypass _bbsloc;singlebuff
  #598 = Utf8               <td width=65><a action=\"bypass _bbsloc;singlebuff
  #599 = String             #600          //  1\">
  #600 = Utf8                1\">
  #601 = String             #602          // </a></td>
  #602 = Utf8               </a></td>
  #603 = String             #604          // <td width=65><a action=\"bypass _bbsloc;editschemes
  #604 = Utf8               <td width=65><a action=\"bypass _bbsloc;editschemes
  #605 = String             #606          // </tr>
  #606 = Utf8               </tr>
  #607 = Methodref          #59.#608      // java/lang/String.endsWith:(Ljava/lang/String;)Z
  #608 = NameAndType        #609:#154     // endsWith:(Ljava/lang/String;)Z
  #609 = Utf8               endsWith
  #610 = String             #611          // </table>
  #611 = Utf8               </table>
  #612 = Fieldref           #341.#613     // ext/mods/Config.BUFFER_STATIC_BUFF_COST:I
  #613 = NameAndType        #614:#345     // BUFFER_STATIC_BUFF_COST:I
  #614 = Utf8               BUFFER_STATIC_BUFF_COST
  #615 = Methodref          #281.#616     // ext/mods/gameserver/model/records/BuffSkill.price:()I
  #616 = NameAndType        #617:#32      // price:()I
  #617 = Utf8               price
  #618 = InvokeDynamic      #22:#619      // #22:test:()Ljava/util/function/Predicate;
  #619 = NameAndType        #620:#621     // test:()Ljava/util/function/Predicate;
  #620 = Utf8               test
  #621 = Utf8               ()Ljava/util/function/Predicate;
  #622 = InterfaceMethodref #201.#623     // java/util/List.removeIf:(Ljava/util/function/Predicate;)Z
  #623 = NameAndType        #624:#625     // removeIf:(Ljava/util/function/Predicate;)Z
  #624 = Utf8               removeIf
  #625 = Utf8               (Ljava/util/function/Predicate;)Z
  #626 = Methodref          #2.#627       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #627 = NameAndType        #628:#629     // parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #628 = Utf8               parseWrite
  #629 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #630 = String             #631          // custom/buff/
  #631 = Utf8               custom/buff/
  #632 = Fieldref           #633.#634     // ext/mods/gameserver/communitybbs/custom/BuffBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
  #633 = Class              #635          // ext/mods/gameserver/communitybbs/custom/BuffBBSManager$SingletonHolder
  #634 = NameAndType        #636:#637     // INSTANCE:Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
  #635 = Utf8               ext/mods/gameserver/communitybbs/custom/BuffBBSManager$SingletonHolder
  #636 = Utf8               INSTANCE
  #637 = Utf8               Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
  #638 = Fieldref           #341.#639     // ext/mods/Config.BUFFS_CATEGORY:Ljava/lang/String;
  #639 = NameAndType        #640:#641     // BUFFS_CATEGORY:Ljava/lang/String;
  #640 = Utf8               BUFFS_CATEGORY
  #641 = Utf8               Ljava/lang/String;
  #642 = Methodref          #59.#643      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #643 = NameAndType        #550:#644     // contains:(Ljava/lang/CharSequence;)Z
  #644 = Utf8               (Ljava/lang/CharSequence;)Z
  #645 = Methodref          #11.#646      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.getEffect:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #646 = NameAndType        #647:#648     // getEffect:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #647 = Utf8               getEffect
  #648 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #649 = Utf8               PAGE_LIMIT
  #650 = Utf8               ConstantValue
  #651 = Integer            6
  #652 = Utf8               Signature
  #653 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Boolean;>;
  #654 = Utf8               Code
  #655 = Utf8               LineNumberTable
  #656 = Utf8               LocalVariableTable
  #657 = Utf8               this
  #658 = Utf8               parseCmd
  #659 = Utf8               vip
  #660 = Utf8               isPet
  #661 = Utf8               Ljava/lang/Boolean;
  #662 = Utf8               args
  #663 = Utf8               [Ljava/lang/String;
  #664 = Utf8               list
  #665 = Utf8               cost
  #666 = Utf8               scheme
  #667 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #668 = Utf8               schemes
  #669 = Utf8               skill
  #670 = Utf8               buff
  #671 = Utf8               Lext/mods/gameserver/model/records/BuffSkill;
  #672 = Utf8               skillId
  #673 = Utf8               skillLvl
  #674 = Utf8               nextPage
  #675 = Utf8               e
  #676 = Utf8               Ljava/lang/NumberFormatException;
  #677 = Utf8               groupType
  #678 = Utf8               schemeName
  #679 = Utf8               skillLevel
  #680 = Utf8               page
  #681 = Utf8               skills
  #682 = Utf8               Ljava/lang/Exception;
  #683 = Utf8               targetType
  #684 = Utf8               targets
  #685 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #686 = Utf8               command
  #687 = Utf8               player
  #688 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #689 = Utf8               st
  #690 = Utf8               Ljava/util/StringTokenizer;
  #691 = Utf8               target
  #692 = Utf8               LocalVariableTypeTable
  #693 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #694 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
  #695 = Utf8               StackMapTable
  #696 = Class              #697          // ext/mods/gameserver/model/actor/Playable
  #697 = Utf8               ext/mods/gameserver/model/actor/Playable
  #698 = Class              #663          // "[Ljava/lang/String;"
  #699 = Utf8               index
  #700 = Utf8               content
  #701 = Utf8               Ljava/util/Map$Entry;
  #702 = Utf8               sb
  #703 = Utf8               Ljava/lang/StringBuilder;
  #704 = Utf8               html
  #705 = Utf8               Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
  #706 = Class              #707          // "[Ljava/lang/Object;"
  #707 = Utf8               [Ljava/lang/Object;
  #708 = Utf8               schemeSkills
  #709 = Utf8               i
  #710 = Utf8               singleSelection
  #711 = Utf8               Z
  #712 = Utf8               max
  #713 = Utf8               row
  #714 = Utf8               count
  #715 = Utf8               buffSkill
  #716 = Utf8               sk
  #717 = Utf8               fee
  #718 = Utf8               (Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;)I
  #719 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;)V
  #720 = Utf8               ar1
  #721 = Utf8               ar2
  #722 = Utf8               ar3
  #723 = Utf8               ar4
  #724 = Utf8               ar5
  #725 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
  #726 = Utf8               lambda$premiumSkills$0
  #727 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #728 = Utf8               lambda$parseCmd$2
  #729 = Utf8               buffId
  #730 = Utf8               lambda$parseCmd$1
  #731 = Utf8               lambda$parseCmd$0
  #732 = Utf8               SourceFile
  #733 = Utf8               BuffBBSManager.java
  #734 = Utf8               NestMembers
  #735 = Utf8               BootstrapMethods
  #736 = String             #737          // html/CommunityBoard/\u0001premium.htm
  #737 = Utf8               html/CommunityBoard/\u0001premium.htm
  #738 = String             #739          // html/CommunityBoard/\u0001noPremium.htm
  #739 = Utf8               html/CommunityBoard/\u0001noPremium.htm
  #740 = MethodType         #297          //  (Ljava/lang/Object;)V
  #741 = MethodHandle       5:#742        // REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$parseCmd$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #742 = Methodref          #11.#743      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$parseCmd$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #743 = NameAndType        #731:#648     // lambda$parseCmd$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #744 = MethodType         #745          //  (Lext/mods/gameserver/skills/L2Skill;)V
  #745 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)V
  #746 = MethodHandle       5:#747        // REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$parseCmd$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #747 = Methodref          #11.#748      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$parseCmd$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #748 = NameAndType        #730:#648     // lambda$parseCmd$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #749 = String             #750          // Error while processing buff command : \u0001
  #750 = Utf8               Error while processing buff command : \u0001
  #751 = MethodHandle       5:#752        // REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$parseCmd$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #752 = Methodref          #11.#753      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$parseCmd$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #753 = NameAndType        #728:#648     // lambda$parseCmd$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #754 = String             #755          // html/CommunityBoard/\u0001index.htm
  #755 = Utf8               html/CommunityBoard/\u0001index.htm
  #756 = String             #757          // html/CommunityBoard/\u0001%s.htm
  #757 = Utf8               html/CommunityBoard/\u0001%s.htm
  #758 = String             #759          // <font color=\"LEVEL\">\u0001</font>
  #759 = Utf8               <font color=\"LEVEL\">\u0001</font>
  #760 = String             #761          //  - cost: \u0001
  #761 = Utf8                - cost: \u0001
  #762 = String             #763          // <table><tr><td><button value=\u0001 action=\"bypass _bbsloc;givebuffs
  #763 = Utf8               <table><tr><td><button value=\u0001 action=\"bypass _bbsloc;givebuffs
  #764 = String             #765          // <td><button value=\u0001 action=\"bypass _bbsloc;givebuffs
  #765 = Utf8               <td><button value=\u0001 action=\"bypass _bbsloc;givebuffs
  #766 = String             #767          // <td><button value=\u0001 action=\"bypass _bbsloc;editschemes Buffs
  #767 = Utf8               <td><button value=\u0001 action=\"bypass _bbsloc;editschemes Buffs
  #768 = String             #769          // <td><button value=\u0001 action=\"bypass _bbsloc;deletescheme
  #769 = Utf8               <td><button value=\u0001 action=\"bypass _bbsloc;deletescheme
  #770 = String             #771          // html/CommunityBoard/\u0001profile/index.htm
  #771 = Utf8               html/CommunityBoard/\u0001profile/index.htm
  #772 = String             #773          // html/CommunityBoard/\u0001profile/edit.htm
  #773 = Utf8               html/CommunityBoard/\u0001profile/edit.htm
  #774 = String             #775          // \u0001 / \u0001
  #775 = Utf8               \u0001 / \u0001
  #776 = String             #777          // html/CommunityBoard/\u0001profile/single.htm
  #777 = Utf8               html/CommunityBoard/\u0001profile/single.htm
  #778 = String             #779          // \">\u0001</a></td>
  #779 = Utf8               \">\u0001</a></td>
  #780 = String             #781          // <td align=left width=70>\u0001</td>
  #781 = Utf8               <td align=left width=70>\u0001</td>
  #782 = String             #783          // <td align=center width=100>\u0001
  #783 = Utf8               <td align=center width=100>\u0001
  #784 = String             #785          // <td align=right width=70>\u0001</td>
  #785 = Utf8               <td align=right width=70>\u0001</td>
  #786 = MethodType         #68           //  (Ljava/lang/Object;)Z
  #787 = MethodHandle       6:#788        // REF_invokeStatic ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$premiumSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #788 = Methodref          #11.#789      // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$premiumSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #789 = NameAndType        #726:#727     // lambda$premiumSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #790 = MethodType         #727          //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #791 = MethodHandle       6:#792        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #792 = Methodref          #793.#794     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #793 = Class              #795          // java/lang/invoke/StringConcatFactory
  #794 = NameAndType        #95:#796      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #795 = Utf8               java/lang/invoke/StringConcatFactory
  #796 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #797 = MethodHandle       6:#798        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #798 = Methodref          #799.#800     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #799 = Class              #801          // java/lang/invoke/LambdaMetafactory
  #800 = NameAndType        #802:#803     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #801 = Utf8               java/lang/invoke/LambdaMetafactory
  #802 = Utf8               metafactory
  #803 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #804 = Utf8               InnerClasses
  #805 = Utf8               BufferSchemeType
  #806 = Utf8               Entry
  #807 = Utf8               SingletonHolder
  #808 = Class              #809          // java/lang/invoke/MethodHandles$Lookup
  #809 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #810 = Class              #811          // java/lang/invoke/MethodHandles
  #811 = Utf8               java/lang/invoke/MethodHandles
  #812 = Utf8               Lookup
{
  public ext.mods.gameserver.communitybbs.custom.BuffBBSManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _isPetTarget:Ljava/util/Map;
        15: return
      LineNumberTable:
        line 40: 0
        line 44: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=13, args_size=3
         0: new           #16                 // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #18                 // String
         7: invokespecial #20                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_2
        17: astore        4
        19: aload_0
        20: getfield      #10                 // Field _isPetTarget:Ljava/util/Map;
        23: aload_2
        24: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        27: invokestatic  #33                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        30: iconst_0
        31: invokestatic  #39                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        34: invokeinterface #44,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        39: checkcast     #40                 // class java/lang/Boolean
        42: invokevirtual #50                 // Method java/lang/Boolean.booleanValue:()Z
        45: ifeq          61
        48: aload_2
        49: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        52: ifnull        61
        55: aload_2
        56: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        59: astore        4
        61: aload_1
        62: astore        5
        64: iconst_m1
        65: istore        6
        67: aload         5
        69: invokevirtual #58                 // Method java/lang/String.hashCode:()I
        72: lookupswitch  { // 5

             -2097287928: 124

              -922061556: 156

               661364352: 172

              1484387753: 188

              1753650391: 140
                 default: 201
            }
       124: aload         5
       126: ldc           #63                 // String _bbsloc;premium
       128: invokevirtual #65                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       131: ifeq          201
       134: iconst_0
       135: istore        6
       137: goto          201
       140: aload         5
       142: ldc           #69                 // String _bbsloc;heal
       144: invokevirtual #65                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       147: ifeq          201
       150: iconst_1
       151: istore        6
       153: goto          201
       156: aload         5
       158: ldc           #71                 // String _bbsloc;cleanse
       160: invokevirtual #65                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       163: ifeq          201
       166: iconst_2
       167: istore        6
       169: goto          201
       172: aload         5
       174: ldc           #73                 // String _bbsloc;support
       176: invokevirtual #65                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       179: ifeq          201
       182: iconst_3
       183: istore        6
       185: goto          201
       188: aload         5
       190: ldc           #75                 // String _bbsloc;cancel
       192: invokevirtual #65                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       195: ifeq          201
       198: iconst_4
       199: istore        6
       201: iload         6
       203: tableswitch   { // 0 to 4

                       0: 236

                       1: 312

                       2: 344

                       3: 357

                       4: 365
                 default: 375
            }
       236: aload_2
       237: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       240: iconst_1
       241: if_icmpne     286
       244: invokestatic  #80                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       247: aload_2
       248: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       251: aload_0
       252: invokevirtual #90                 // Method getFolder:()Ljava/lang/String;
       255: invokedynamic #93,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       260: invokevirtual #97                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
       263: astore        7
       265: aload         7
       267: ldc           #101                // String %name%
       269: aload_2
       270: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       273: invokevirtual #106                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       276: pop
       277: aload         7
       279: aload_2
       280: invokestatic  #110                // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       283: goto          375
       286: invokestatic  #80                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       289: aload_2
       290: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       293: aload_0
       294: invokevirtual #90                 // Method getFolder:()Ljava/lang/String;
       297: invokedynamic #114,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       302: invokevirtual #97                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
       305: aload_2
       306: invokestatic  #110                // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       309: goto          375
       312: aload         4
       314: aload_2
       315: if_acmpne     328
       318: aload_2
       319: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       322: invokevirtual #119                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
       325: goto          336
       328: aload         4
       330: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       333: invokevirtual #129                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.setMaxHpMp:()V
       336: aload_0
       337: aload_2
       338: invokevirtual #134                // Method showIndexPage:(Lext/mods/gameserver/model/actor/Player;)V
       341: goto          375
       344: aload         4
       346: invokevirtual #138                // Method ext/mods/gameserver/model/actor/Creature.stopAllEffectsDebuff:()V
       349: aload_0
       350: aload_2
       351: invokevirtual #134                // Method showIndexPage:(Lext/mods/gameserver/model/actor/Player;)V
       354: goto          375
       357: aload_0
       358: aload_2
       359: invokevirtual #141                // Method showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
       362: goto          375
       365: aload         4
       367: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Creature.stopAllEffectsExceptThoseThatLastThroughDeath:()V
       370: aload_0
       371: aload_2
       372: invokevirtual #134                // Method showIndexPage:(Lext/mods/gameserver/model/actor/Player;)V
       375: aload_1
       376: ldc           #147                // String _bbsloc
       378: invokevirtual #65                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       381: ifeq          392
       384: aload_0
       385: aload_2
       386: invokevirtual #134                // Method showIndexPage:(Lext/mods/gameserver/model/actor/Player;)V
       389: goto          1751
       392: aload_1
       393: ldc           #149                // String _bbsloc;menu
       395: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       398: ifeq          590
       401: aload_0
       402: getfield      #10                 // Field _isPetTarget:Ljava/util/Map;
       405: aload_2
       406: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       409: invokestatic  #33                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       412: iconst_0
       413: invokestatic  #39                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       416: invokeinterface #44,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       421: checkcast     #40                 // class java/lang/Boolean
       424: astore        5
       426: aload         5
       428: invokevirtual #50                 // Method java/lang/Boolean.booleanValue:()Z
       431: ifeq          465
       434: aload_2
       435: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       438: ifnonnull     465
       441: aload_0
       442: getfield      #10                 // Field _isPetTarget:Ljava/util/Map;
       445: aload_2
       446: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       449: invokestatic  #33                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       452: iconst_0
       453: invokestatic  #39                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       456: invokeinterface #155,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       461: pop
       462: goto          582
       465: aload_2
       466: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       469: ifnull        543
       472: aload_0
       473: getfield      #10                 // Field _isPetTarget:Ljava/util/Map;
       476: aload_2
       477: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       480: invokestatic  #33                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       483: aload         5
       485: invokevirtual #50                 // Method java/lang/Boolean.booleanValue:()Z
       488: ifne          495
       491: iconst_1
       492: goto          496
       495: iconst_0
       496: invokestatic  #39                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       499: invokeinterface #155,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       504: pop
       505: aload_0
       506: getfield      #10                 // Field _isPetTarget:Ljava/util/Map;
       509: aload_2
       510: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       513: invokestatic  #33                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       516: invokeinterface #158,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       521: checkcast     #40                 // class java/lang/Boolean
       524: invokevirtual #50                 // Method java/lang/Boolean.booleanValue:()Z
       527: ifeq          537
       530: aload_2
       531: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       534: goto          538
       537: aload_2
       538: astore        4
       540: goto          582
       543: aload_2
       544: aload_2
       545: sipush        10201
       548: iconst_0
       549: anewarray     #162                // class java/lang/Object
       552: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       555: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       558: aload_0
       559: getfield      #10                 // Field _isPetTarget:Ljava/util/Map;
       562: aload_2
       563: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       566: invokestatic  #33                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       569: iconst_0
       570: invokestatic  #39                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       573: invokeinterface #155,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       578: pop
       579: aload_2
       580: astore        4
       582: aload_0
       583: aload_2
       584: invokevirtual #134                // Method showIndexPage:(Lext/mods/gameserver/model/actor/Player;)V
       587: goto          1751
       590: aload_1
       591: ldc           #172                // String _bbsloc;page
       593: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       596: ifeq          626
       599: aload_1
       600: ldc           #18                 // String
       602: invokevirtual #174                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       605: astore        5
       607: aload         5
       609: arraylength
       610: iconst_1
       611: if_icmple     623
       614: aload_0
       615: aload         5
       617: iconst_1
       618: aaload
       619: aload_2
       620: invokevirtual #178                // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       623: goto          1751
       626: aload_1
       627: ldc           #181                // String _bbsloc;getscheme
       629: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       632: ifeq          788
       635: aload_1
       636: ldc           #18                 // String
       638: invokevirtual #174                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       641: astore        5
       643: aload         5
       645: arraylength
       646: iconst_1
       647: if_icmple     774
       650: invokestatic  #183                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
       653: aload         5
       655: iconst_1
       656: aaload
       657: invokevirtual #188                // Method java/lang/String.toUpperCase:()Ljava/lang/String;
       660: invokestatic  #191                // Method ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
       663: invokevirtual #196                // Method ext/mods/gameserver/data/manager/BufferManager.getSchemeSkills:(Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List;
       666: astore        6
       668: aload         6
       670: invokeinterface #200,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       675: astore        7
       677: aload         7
       679: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       684: ifeq          771
       687: aload         7
       689: invokeinterface #211,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       694: checkcast     #215                // class ext/mods/gameserver/skills/L2Skill
       697: astore        8
       699: new           #217                // class java/util/ArrayList
       702: dup
       703: invokespecial #219                // Method java/util/ArrayList."<init>":()V
       706: astore        9
       708: aload         9
       710: invokestatic  #220                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       713: aload         8
       715: invokevirtual #225                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       718: aload         8
       720: invokevirtual #228                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       723: invokevirtual #231                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       726: invokeinterface #235,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       731: pop
       732: aload         9
       734: invokestatic  #238                // Method getFee:(Ljava/util/List;)I
       737: istore        10
       739: iload         10
       741: ifeq          754
       744: aload_2
       745: iload         10
       747: iconst_1
       748: invokevirtual #242                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
       751: ifeq          768
       754: aload         9
       756: aload_0
       757: aload_2
       758: invokedynamic #246,  0            // InvokeDynamic #2:accept:(Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
       763: invokeinterface #250,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       768: goto          677
       771: goto          780
       774: aload_2
       775: ldc           #254                // String Wrong command!
       777: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       780: aload_0
       781: aload_2
       782: invokevirtual #134                // Method showIndexPage:(Lext/mods/gameserver/model/actor/Player;)V
       785: goto          1751
       788: aload_1
       789: ldc_w         #256                // String _bbsloc;buff
       792: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       795: ifeq          1046
       798: aload_1
       799: ldc           #18                 // String
       801: invokevirtual #174                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       804: astore        5
       806: aload         5
       808: arraylength
       809: iconst_4
       810: if_icmpne     1022
       813: aload         5
       815: iconst_1
       816: aaload
       817: invokestatic  #258                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       820: istore        6
       822: aload         5
       824: iconst_2
       825: aaload
       826: invokestatic  #258                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       829: istore        7
       831: aload         5
       833: iconst_3
       834: aaload
       835: astore        8
       837: iload         6
       839: ifeq          1015
       842: new           #217                // class java/util/ArrayList
       845: dup
       846: invokespecial #219                // Method java/util/ArrayList."<init>":()V
       849: astore        9
       851: invokestatic  #220                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       854: iload         6
       856: iload         7
       858: invokevirtual #231                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       861: astore        10
       863: invokestatic  #183                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
       866: aload         10
       868: invokevirtual #262                // Method ext/mods/gameserver/data/manager/BufferManager.getAvailableBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
       871: astore        11
       873: aload         11
       875: ifnonnull     912
       878: getstatic     #266                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       881: ldc_w         #270                // String bypass hack detected player [{}], skill id [{}]
       884: iconst_2
       885: anewarray     #162                // class java/lang/Object
       888: dup
       889: iconst_0
       890: aload_2
       891: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       894: aastore
       895: dup
       896: iconst_1
       897: aload         10
       899: invokevirtual #225                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       902: invokestatic  #33                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       905: aastore
       906: invokevirtual #272                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       909: goto          1015
       912: ldc_w         #278                // String premium
       915: aload         11
       917: invokevirtual #280                // Method ext/mods/gameserver/model/records/BuffSkill.type:()Ljava/lang/String;
       920: invokevirtual #65                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       923: ifeq          961
       926: aload_2
       927: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       930: ifne          961
       933: getstatic     #266                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       936: ldc_w         #285                // String bypass hack detected player not premium [{}]
       939: iconst_1
       940: anewarray     #162                // class java/lang/Object
       943: dup
       944: iconst_0
       945: aload_2
       946: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       949: aastore
       950: invokevirtual #272                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       953: aload_0
       954: aload         8
       956: aload_2
       957: invokevirtual #178                // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       960: return
       961: aload         9
       963: invokestatic  #220                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       966: iload         6
       968: iload         7
       970: invokevirtual #231                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       973: invokeinterface #235,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       978: pop
       979: aload         9
       981: invokestatic  #238                // Method getFee:(Ljava/util/List;)I
       984: istore        12
       986: iload         12
       988: ifeq          1001
       991: aload_2
       992: iload         12
       994: iconst_1
       995: invokevirtual #242                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
       998: ifeq          1015
      1001: aload         9
      1003: aload_0
      1004: aload_2
      1005: invokedynamic #287,  0            // InvokeDynamic #3:accept:(Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
      1010: invokeinterface #250,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
      1015: aload_0
      1016: aload         8
      1018: aload_2
      1019: invokevirtual #178                // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
      1022: goto          1751
      1025: astore        5
      1027: getstatic     #266                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1030: aload         5
      1032: invokevirtual #290                // Method java/lang/NumberFormatException.getMessage:()Ljava/lang/String;
      1035: invokedynamic #293,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1040: invokevirtual #294                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
      1043: goto          1751
      1046: aload_1
      1047: ldc_w         #298                // String _bbsloc;skill
      1050: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1053: ifeq          1228
      1056: aload_3
      1057: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1060: astore        5
      1062: aload_3
      1063: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1066: astore        6
      1068: aload_3
      1069: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1072: invokestatic  #258                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1075: istore        7
      1077: aload_3
      1078: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1081: invokestatic  #258                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1084: istore        8
      1086: aload_3
      1087: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1090: invokestatic  #258                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1093: istore        9
      1095: invokestatic  #220                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
      1098: iload         7
      1100: iload         8
      1102: invokevirtual #231                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
      1105: astore        10
      1107: invokestatic  #183                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
      1110: aload_2
      1111: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1114: aload         6
      1116: invokevirtual #300                // Method ext/mods/gameserver/data/manager/BufferManager.getScheme:(ILjava/lang/String;)Ljava/util/List;
      1119: astore        11
      1121: aload_0
      1122: aload_2
      1123: aload         11
      1125: invokevirtual #304                // Method premiumSkills:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
      1128: aload_1
      1129: ldc_w         #308                // String _bbsloc;skillselect
      1132: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1135: ifeq          1194
      1138: aload         6
      1140: ldc_w         #310                // String none
      1143: invokevirtual #312                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1146: ifne          1194
      1149: aload         11
      1151: invokeinterface #315,  1          // InterfaceMethod java/util/List.size:()I
      1156: aload_2
      1157: invokevirtual #318                // Method ext/mods/gameserver/model/actor/Player.getMaxBuffCount:()I
      1160: if_icmpge     1176
      1163: aload         11
      1165: aload         10
      1167: invokeinterface #235,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      1172: pop
      1173: goto          1214
      1176: aload_2
      1177: aload_2
      1178: sipush        10180
      1181: iconst_0
      1182: anewarray     #162                // class java/lang/Object
      1185: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1188: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1191: goto          1214
      1194: aload_1
      1195: ldc_w         #321                // String _bbsloc;skillunselect
      1198: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1201: ifeq          1214
      1204: aload         11
      1206: aload         10
      1208: invokeinterface #323,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
      1213: pop
      1214: aload_0
      1215: aload_2
      1216: aload         5
      1218: aload         6
      1220: iload         9
      1222: invokevirtual #326                // Method showEditSchemeWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;I)V
      1225: goto          1751
      1228: aload_1
      1229: ldc_w         #330                // String _bbsloc;createscheme
      1232: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1235: ifeq          1393
      1238: aload_3
      1239: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1242: astore        5
      1244: aload         5
      1246: invokevirtual #332                // Method java/lang/String.length:()I
      1249: bipush        14
      1251: if_icmple     1270
      1254: aload_2
      1255: aload_2
      1256: sipush        10181
      1259: iconst_0
      1260: anewarray     #162                // class java/lang/Object
      1263: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1266: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1269: return
      1270: invokestatic  #183                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
      1273: aload_2
      1274: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1277: invokevirtual #335                // Method ext/mods/gameserver/data/manager/BufferManager.getPlayerSchemes:(I)Ljava/util/Map;
      1280: astore        6
      1282: aload         6
      1284: ifnull        1343
      1287: aload         6
      1289: invokeinterface #339,  1          // InterfaceMethod java/util/Map.size:()I
      1294: getstatic     #340                // Field ext/mods/Config.BUFFER_MAX_SCHEMES:I
      1297: if_icmpne     1316
      1300: aload_2
      1301: aload_2
      1302: sipush        10182
      1305: iconst_0
      1306: anewarray     #162                // class java/lang/Object
      1309: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1312: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1315: return
      1316: aload         6
      1318: aload         5
      1320: invokeinterface #346,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      1325: ifeq          1343
      1328: aload_2
      1329: aload_2
      1330: sipush        10183
      1333: iconst_0
      1334: anewarray     #162                // class java/lang/Object
      1337: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1340: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1343: invokestatic  #183                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
      1346: aload_2
      1347: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1350: aload         5
      1352: invokevirtual #349                // Method java/lang/String.trim:()Ljava/lang/String;
      1355: new           #217                // class java/util/ArrayList
      1358: dup
      1359: invokespecial #219                // Method java/util/ArrayList."<init>":()V
      1362: invokevirtual #352                // Method ext/mods/gameserver/data/manager/BufferManager.setScheme:(ILjava/lang/String;Ljava/util/ArrayList;)V
      1365: aload_0
      1366: aload_2
      1367: invokevirtual #141                // Method showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
      1370: goto          1751
      1373: astore        5
      1375: aload_2
      1376: aload_2
      1377: sipush        10181
      1380: iconst_0
      1381: anewarray     #162                // class java/lang/Object
      1384: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1387: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1390: goto          1751
      1393: aload_1
      1394: ldc_w         #358                // String _bbsloc;editschemes
      1397: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1400: ifeq          1426
      1403: aload_0
      1404: aload_2
      1405: aload_3
      1406: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1409: aload_3
      1410: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1413: aload_3
      1414: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1417: invokestatic  #258                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1420: invokevirtual #326                // Method showEditSchemeWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;I)V
      1423: goto          1751
      1426: aload_1
      1427: ldc_w         #360                // String _bbsloc;deletescheme
      1430: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1433: ifeq          1509
      1436: aload_3
      1437: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1440: astore        5
      1442: invokestatic  #183                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
      1445: aload_2
      1446: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1449: invokevirtual #335                // Method ext/mods/gameserver/data/manager/BufferManager.getPlayerSchemes:(I)Ljava/util/Map;
      1452: astore        6
      1454: aload         6
      1456: ifnull        1481
      1459: aload         6
      1461: aload         5
      1463: invokeinterface #346,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      1468: ifeq          1481
      1471: aload         6
      1473: aload         5
      1475: invokeinterface #362,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
      1480: pop
      1481: goto          1501
      1484: astore        5
      1486: aload_2
      1487: aload_2
      1488: sipush        10184
      1491: iconst_0
      1492: anewarray     #162                // class java/lang/Object
      1495: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1498: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1501: aload_0
      1502: aload_2
      1503: invokevirtual #141                // Method showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
      1506: goto          1751
      1509: aload_1
      1510: ldc_w         #364                // String _bbsloc;getbuff
      1513: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1516: ifeq          1603
      1519: aload_3
      1520: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1523: invokestatic  #258                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1526: istore        5
      1528: aload_3
      1529: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1532: invokestatic  #258                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1535: istore        6
      1537: new           #217                // class java/util/ArrayList
      1540: dup
      1541: invokespecial #219                // Method java/util/ArrayList."<init>":()V
      1544: astore        7
      1546: aload         7
      1548: invokestatic  #220                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
      1551: iload         5
      1553: iload         6
      1555: invokevirtual #231                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
      1558: invokeinterface #235,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      1563: pop
      1564: aload         7
      1566: invokestatic  #238                // Method getFee:(Ljava/util/List;)I
      1569: istore        8
      1571: iload         8
      1573: ifeq          1586
      1576: aload_2
      1577: iload         8
      1579: iconst_1
      1580: invokevirtual #242                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
      1583: ifeq          1600
      1586: aload         7
      1588: aload_0
      1589: aload_2
      1590: invokedynamic #366,  0            // InvokeDynamic #5:accept:(Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
      1595: invokeinterface #250,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
      1600: goto          1751
      1603: aload_1
      1604: ldc_w         #367                // String _bbsloc;singlebuff
      1607: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1610: ifeq          1632
      1613: aload_0
      1614: aload_2
      1615: aload_3
      1616: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1619: aload_3
      1620: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1623: invokestatic  #258                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1626: invokevirtual #369                // Method showSingleBuffSelectionWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
      1629: goto          1751
      1632: aload_1
      1633: ldc_w         #373                // String _bbsloc;givebuffs
      1636: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1639: ifeq          1751
      1642: aload_3
      1643: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1646: astore        5
      1648: aload_3
      1649: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1652: invokestatic  #258                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1655: istore        6
      1657: aload_0
      1658: aload_2
      1659: invokevirtual #141                // Method showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
      1662: aconst_null
      1663: astore        7
      1665: aload_3
      1666: invokevirtual #375                // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1669: ifeq          1703
      1672: aload_3
      1673: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1676: astore        8
      1678: aload         8
      1680: ifnull        1700
      1683: aload         8
      1685: ldc_w         #378                // String pet
      1688: invokevirtual #312                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1691: ifeq          1700
      1694: aload_2
      1695: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
      1698: astore        7
      1700: goto          1706
      1703: aload_2
      1704: astore        7
      1706: aload         7
      1708: ifnonnull     1721
      1711: aload_2
      1712: ldc_w         #380                // String You have not summon
      1715: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1718: goto          1751
      1721: iload         6
      1723: ifeq          1736
      1726: aload_2
      1727: iload         6
      1729: iconst_1
      1730: invokevirtual #242                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
      1733: ifeq          1751
      1736: invokestatic  #183                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
      1739: aconst_null
      1740: aload         7
      1742: aload_2
      1743: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1746: aload         5
      1748: invokevirtual #382                // Method ext/mods/gameserver/data/manager/BufferManager.applySchemeEffects:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILjava/lang/String;)V
      1751: return
      Exception table:
         from    to  target type
           798   960  1025   Class java/lang/NumberFormatException
           961  1022  1025   Class java/lang/NumberFormatException
          1238  1269  1373   Class java/lang/Exception
          1270  1315  1373   Class java/lang/Exception
          1316  1370  1373   Class java/lang/Exception
          1436  1481  1484   Class java/lang/Exception
      LineNumberTable:
        line 49: 0
        line 50: 11
        line 52: 16
        line 53: 19
        line 54: 55
        line 56: 61
        line 59: 236
        line 61: 244
        line 62: 265
        line 63: 277
        line 64: 283
        line 66: 286
        line 68: 309
        line 70: 312
        line 71: 318
        line 73: 328
        line 75: 336
        line 76: 341
        line 78: 344
        line 79: 349
        line 80: 354
        line 82: 357
        line 83: 362
        line 85: 365
        line 86: 370
        line 90: 375
        line 91: 384
        line 92: 392
        line 94: 401
        line 95: 426
        line 96: 441
        line 97: 465
        line 99: 472
        line 100: 505
        line 104: 543
        line 105: 558
        line 106: 579
        line 109: 582
        line 110: 587
        line 111: 590
        line 113: 599
        line 114: 607
        line 115: 614
        line 116: 623
        line 117: 626
        line 119: 635
        line 120: 643
        line 122: 650
        line 123: 668
        line 125: 699
        line 126: 708
        line 127: 732
        line 128: 739
        line 129: 754
        line 130: 768
        line 131: 771
        line 133: 774
        line 135: 780
        line 136: 785
        line 137: 788
        line 141: 798
        line 142: 806
        line 144: 813
        line 145: 822
        line 146: 831
        line 148: 837
        line 150: 842
        line 151: 851
        line 152: 863
        line 153: 873
        line 154: 878
        line 157: 912
        line 159: 926
        line 161: 933
        line 162: 953
        line 163: 960
        line 167: 961
        line 168: 979
        line 169: 986
        line 170: 1001
        line 174: 1015
        line 180: 1022
        line 177: 1025
        line 179: 1027
        line 180: 1043
        line 182: 1046
        line 184: 1056
        line 185: 1062
        line 187: 1068
        line 188: 1077
        line 189: 1086
        line 191: 1095
        line 192: 1107
        line 193: 1121
        line 194: 1128
        line 196: 1149
        line 197: 1163
        line 199: 1176
        line 201: 1194
        line 202: 1204
        line 204: 1214
        line 205: 1225
        line 206: 1228
        line 210: 1238
        line 211: 1244
        line 213: 1254
        line 214: 1269
        line 217: 1270
        line 218: 1282
        line 220: 1287
        line 222: 1300
        line 223: 1315
        line 226: 1316
        line 227: 1328
        line 230: 1343
        line 231: 1365
        line 236: 1370
        line 233: 1373
        line 235: 1375
        line 236: 1390
        line 238: 1393
        line 239: 1403
        line 240: 1426
        line 244: 1436
        line 245: 1442
        line 247: 1454
        line 248: 1471
        line 253: 1481
        line 250: 1484
        line 252: 1486
        line 254: 1501
        line 256: 1509
        line 258: 1519
        line 259: 1528
        line 260: 1537
        line 261: 1546
        line 262: 1564
        line 263: 1571
        line 264: 1586
        line 265: 1600
        line 266: 1603
        line 267: 1613
        line 268: 1632
        line 270: 1642
        line 271: 1648
        line 273: 1657
        line 275: 1662
        line 276: 1665
        line 278: 1672
        line 279: 1678
        line 280: 1694
        line 281: 1700
        line 283: 1703
        line 285: 1706
        line 286: 1711
        line 287: 1721
        line 288: 1736
        line 290: 1751
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          265      18     7   vip   Ljava/lang/String;
          426     161     5 isPet   Ljava/lang/Boolean;
          607      16     5  args   [Ljava/lang/String;
          708      60     9  list   Ljava/util/List;
          739      29    10  cost   I
          699      69     8 scheme   Lext/mods/gameserver/skills/L2Skill;
          668     103     6 schemes   Ljava/util/List;
          643     142     5  args   [Ljava/lang/String;
          986      29    12  cost   I
          851     164     9  list   Ljava/util/List;
          863     152    10 skill   Lext/mods/gameserver/skills/L2Skill;
          873     142    11  buff   Lext/mods/gameserver/model/records/BuffSkill;
          822     200     6 skillId   I
          831     191     7 skillLvl   I
          837     185     8 nextPage   Ljava/lang/String;
          806     216     5  args   [Ljava/lang/String;
         1027      16     5     e   Ljava/lang/NumberFormatException;
         1062     163     5 groupType   Ljava/lang/String;
         1068     157     6 schemeName   Ljava/lang/String;
         1077     148     7 skillId   I
         1086     139     8 skillLevel   I
         1095     130     9  page   I
         1107     118    10 skill   Lext/mods/gameserver/skills/L2Skill;
         1121     104    11 skills   Ljava/util/List;
         1244     126     5 schemeName   Ljava/lang/String;
         1282      88     6 schemes   Ljava/util/Map;
         1375      15     5     e   Ljava/lang/Exception;
         1442      39     5 schemeName   Ljava/lang/String;
         1454      27     6 schemes   Ljava/util/Map;
         1486      15     5     e   Ljava/lang/Exception;
         1528      72     5 skillId   I
         1537      63     6 skillLvl   I
         1546      54     7  list   Ljava/util/List;
         1571      29     8  cost   I
         1678      22     8 targetType   Ljava/lang/String;
         1648     103     5 schemeName   Ljava/lang/String;
         1657      94     6  cost   I
         1665      86     7 targets   Lext/mods/gameserver/model/actor/Creature;
            0    1752     0  this   Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
            0    1752     1 command   Ljava/lang/String;
            0    1752     2 player   Lext/mods/gameserver/model/actor/Player;
           11    1741     3    st   Ljava/util/StringTokenizer;
           19    1733     4 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          708      60     9  list   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
          668     103     6 schemes   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
          851     164     9  list   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
         1121     104    11 skills   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
         1282      88     6 schemes   Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
         1454      27     6 schemes   Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
         1546      54     7  list   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
      StackMapTable: number_of_entries = 65
        frame_type = 253 /* append */
          offset_delta = 61
          locals = [ class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 253 /* append */
          offset_delta = 62
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 34 /* same */
        frame_type = 49 /* same */
        frame_type = 25 /* same */
        frame_type = 15 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 12 /* same */
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 72
          locals = [ class java/lang/Boolean ]
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/communitybbs/custom/BuffBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class java/lang/Boolean ]
          stack = [ class java/util/Map, class java/lang/Integer ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/communitybbs/custom/BuffBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class java/lang/Boolean ]
          stack = [ class java/util/Map, class java/lang/Integer, int ]
        frame_type = 40 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 4 /* same */
        frame_type = 38 /* same */
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 32 /* same */
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 50
          locals = [ class "[Ljava/lang/String;", class java/util/List, class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/skills/L2Skill, class java/util/List, int ]
        frame_type = 248 /* chop */
          offset_delta = 13
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 5 /* same */
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 255 /* full_frame */
          offset_delta = 123
          locals = [ class ext/mods/gameserver/communitybbs/custom/BuffBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class "[Ljava/lang/String;", int, int, class java/lang/String, class java/util/List, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/records/BuffSkill ]
          stack = []
        frame_type = 48 /* same */
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/custom/BuffBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class "[Ljava/lang/String;", int, int, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/communitybbs/custom/BuffBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 20 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 129
          locals = [ class ext/mods/gameserver/communitybbs/custom/BuffBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class java/lang/String, class java/lang/String, int, int, int, class ext/mods/gameserver/skills/L2Skill, class java/util/List ]
          stack = []
        frame_type = 17 /* same */
        frame_type = 19 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/custom/BuffBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class java/util/Map ]
        frame_type = 26 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/communitybbs/custom/BuffBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature ]
          stack = [ class java/lang/Exception ]
        frame_type = 19 /* same */
        frame_type = 32 /* same */
        frame_type = 54 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 16 /* same */
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/communitybbs/custom/BuffBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, int, int, class java/util/List, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/custom/BuffBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 28 /* same */
        frame_type = 254 /* append */
          offset_delta = 67
          locals = [ class java/lang/String, int, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 2 /* same */
        frame_type = 2 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 248 /* chop */
          offset_delta = 14

  public void parseWrite(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=7
         0: aload_0
         1: aload_1
         2: aload_2
         3: aload_3
         4: aload         4
         6: aload         5
         8: aload         6
        10: invokespecial #626                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        13: return
      LineNumberTable:
        line 555: 0
        line 556: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
            0      14     1   ar1   Ljava/lang/String;
            0      14     2   ar2   Ljava/lang/String;
            0      14     3   ar3   Ljava/lang/String;
            0      14     4   ar4   Ljava/lang/String;
            0      14     5   ar5   Ljava/lang/String;
            0      14     6 player   Lext/mods/gameserver/model/actor/Player;

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc_w         #630                // String custom/buff/
         3: areturn
      LineNumberTable:
        line 561: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;

  public static ext.mods.gameserver.communitybbs.custom.BuffBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #632                // Field ext/mods/gameserver/communitybbs/custom/BuffBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
         3: areturn
      LineNumberTable:
        line 566: 0
}
SourceFile: "BuffBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/custom/BuffBBSManager$SingletonHolder
BootstrapMethods:
  0: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #736 html/CommunityBoard/\u0001premium.htm
  1: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #738 html/CommunityBoard/\u0001noPremium.htm
  2: #797 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #740 (Ljava/lang/Object;)V
      #741 REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$parseCmd$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
      #744 (Lext/mods/gameserver/skills/L2Skill;)V
  3: #797 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #740 (Ljava/lang/Object;)V
      #746 REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$parseCmd$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
      #744 (Lext/mods/gameserver/skills/L2Skill;)V
  4: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #749 Error while processing buff command : \u0001
  5: #797 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #740 (Ljava/lang/Object;)V
      #751 REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$parseCmd$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
      #744 (Lext/mods/gameserver/skills/L2Skill;)V
  6: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #754 html/CommunityBoard/\u0001index.htm
  7: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #756 html/CommunityBoard/\u0001%s.htm
  8: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #758 <font color=\"LEVEL\">\u0001</font>
  9: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #760  - cost: \u0001
  10: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #762 <table><tr><td><button value=\u0001 action=\"bypass _bbsloc;givebuffs
  11: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #764 <td><button value=\u0001 action=\"bypass _bbsloc;givebuffs
  12: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #766 <td><button value=\u0001 action=\"bypass _bbsloc;editschemes Buffs
  13: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #768 <td><button value=\u0001 action=\"bypass _bbsloc;deletescheme
  14: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #770 html/CommunityBoard/\u0001profile/index.htm
  15: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #772 html/CommunityBoard/\u0001profile/edit.htm
  16: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #774 \u0001 / \u0001
  17: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #776 html/CommunityBoard/\u0001profile/single.htm
  18: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #778 \">\u0001</a></td>
  19: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #780 <td align=left width=70>\u0001</td>
  20: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #782 <td align=center width=100>\u0001
  21: #791 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #784 <td align=right width=70>\u0001</td>
  22: #797 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #786 (Ljava/lang/Object;)Z
      #787 REF_invokeStatic ext/mods/gameserver/communitybbs/custom/BuffBBSManager.lambda$premiumSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
      #790 (Lext/mods/gameserver/skills/L2Skill;)Z
InnerClasses:
  public static final #805= #192 of #184; // BufferSchemeType=class ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType of class ext/mods/gameserver/data/manager/BufferManager
  public static #806= #430 of #45;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #812= #808 of #810; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
