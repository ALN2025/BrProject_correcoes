// Bytecode for: ext.mods.gameserver.model.actor.instance.SchemeBuffer
// File: ext\mods\gameserver\model\actor\instance\SchemeBuffer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/SchemeBuffer.class
  Last modified 9 de jul de 2026; size 21041 bytes
  MD5 checksum d4e126ffcb643136698eea4301a0c208
  Compiled from "SchemeBuffer.java"
public class ext.mods.gameserver.model.actor.instance.SchemeBuffer extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/actor/instance/SchemeBuffer
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 2, methods: 16, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#10        // java/util/HashMap."<init>":()V
   #10 = NameAndType        #5:#11        // "<init>":()V
   #11 = Utf8               ()V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/actor/instance/SchemeBuffer._isPetTarget:Ljava/util/Map;
   #13 = Class              #15           // ext/mods/gameserver/model/actor/instance/SchemeBuffer
   #14 = NameAndType        #16:#17       // _isPetTarget:Ljava/util/Map;
   #15 = Utf8               ext/mods/gameserver/model/actor/instance/SchemeBuffer
   #16 = Utf8               _isPetTarget
   #17 = Utf8               Ljava/util/Map;
   #18 = Class              #19           // java/util/StringTokenizer
   #19 = Utf8               java/util/StringTokenizer
   #20 = String             #21           //
   #21 = Utf8
   #22 = Methodref          #18.#23       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #23 = NameAndType        #5:#24        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #24 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #25 = Methodref          #18.#26       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #26 = NameAndType        #27:#28       // nextToken:()Ljava/lang/String;
   #27 = Utf8               nextToken
   #28 = Utf8               ()Ljava/lang/String;
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #30 = Class              #32           // ext/mods/gameserver/model/actor/Player
   #31 = NameAndType        #33:#34       // getObjectId:()I
   #32 = Utf8               ext/mods/gameserver/model/actor/Player
   #33 = Utf8               getObjectId
   #34 = Utf8               ()I
   #35 = Methodref          #36.#37       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #36 = Class              #38           // java/lang/Integer
   #37 = NameAndType        #39:#40       // valueOf:(I)Ljava/lang/Integer;
   #38 = Utf8               java/lang/Integer
   #39 = Utf8               valueOf
   #40 = Utf8               (I)Ljava/lang/Integer;
   #41 = Methodref          #42.#43       // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #42 = Class              #44           // java/lang/Boolean
   #43 = NameAndType        #39:#45       // valueOf:(Z)Ljava/lang/Boolean;
   #44 = Utf8               java/lang/Boolean
   #45 = Utf8               (Z)Ljava/lang/Boolean;
   #46 = InterfaceMethodref #47.#48       // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #47 = Class              #49           // java/util/Map
   #48 = NameAndType        #50:#51       // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #49 = Utf8               java/util/Map
   #50 = Utf8               getOrDefault
   #51 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #52 = Methodref          #42.#53       // java/lang/Boolean.booleanValue:()Z
   #53 = NameAndType        #54:#55       // booleanValue:()Z
   #54 = Utf8               booleanValue
   #55 = Utf8               ()Z
   #56 = Methodref          #30.#57       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #57 = NameAndType        #58:#59       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #58 = Utf8               getSummon
   #59 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #60 = Methodref          #61.#62       // java/lang/String.hashCode:()I
   #61 = Class              #63           // java/lang/String
   #62 = NameAndType        #64:#34       // hashCode:()I
   #63 = Utf8               java/lang/String
   #64 = Utf8               hashCode
   #65 = String             #66           // premium
   #66 = Utf8               premium
   #67 = Methodref          #61.#68       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #68 = NameAndType        #69:#70       // equals:(Ljava/lang/Object;)Z
   #69 = Utf8               equals
   #70 = Utf8               (Ljava/lang/Object;)Z
   #71 = String             #72           // heal
   #72 = Utf8               heal
   #73 = String             #74           // cleanse
   #74 = Utf8               cleanse
   #75 = String             #76           // support
   #76 = Utf8               support
   #77 = String             #78           // cleanup
   #78 = Utf8               cleanup
   #79 = Methodref          #30.#80       // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #80 = NameAndType        #81:#34       // getPremiumService:()I
   #81 = Utf8               getPremiumService
   #82 = Class              #83           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #83 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #84 = Methodref          #82.#85       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #85 = NameAndType        #5:#86        // "<init>":(I)V
   #86 = Utf8               (I)V
   #87 = Methodref          #30.#88       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #88 = NameAndType        #89:#90       // getLocale:()Ljava/util/Locale;
   #89 = Utf8               getLocale
   #90 = Utf8               ()Ljava/util/Locale;
   #91 = Methodref          #13.#92       // ext/mods/gameserver/model/actor/instance/SchemeBuffer.getNpcId:()I
   #92 = NameAndType        #93:#34       // getNpcId:()I
   #93 = Utf8               getNpcId
   #94 = Methodref          #13.#95       // ext/mods/gameserver/model/actor/instance/SchemeBuffer.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #95 = NameAndType        #96:#97       // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #96 = Utf8               getHtmlPath
   #97 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #98 = Methodref          #82.#99       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #99 = NameAndType        #100:#101     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #100 = Utf8               setFile
  #101 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #102 = String             #103          // %objectId%
  #103 = Utf8               %objectId%
  #104 = Methodref          #13.#31       // ext/mods/gameserver/model/actor/instance/SchemeBuffer.getObjectId:()I
  #105 = Methodref          #82.#106      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #106 = NameAndType        #107:#108     // replace:(Ljava/lang/String;I)V
  #107 = Utf8               replace
  #108 = Utf8               (Ljava/lang/String;I)V
  #109 = Methodref          #30.#110      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = NameAndType        #111:#112     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = Utf8               sendPacket
  #112 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #113 = Methodref          #30.#114      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #114 = NameAndType        #115:#116     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #115 = Utf8               getStatus
  #116 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #117 = Methodref          #118.#119     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
  #118 = Class              #120          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #119 = NameAndType        #121:#11      // setMaxCpHpMp:()V
  #120 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #121 = Utf8               setMaxCpHpMp
  #122 = Methodref          #123.#124     // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #123 = Class              #125          // ext/mods/gameserver/model/actor/Creature
  #124 = NameAndType        #115:#126     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #125 = Utf8               ext/mods/gameserver/model/actor/Creature
  #126 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #127 = Methodref          #128.#129     // ext/mods/gameserver/model/actor/status/CreatureStatus.setMaxHpMp:()V
  #128 = Class              #130          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #129 = NameAndType        #131:#11      // setMaxHpMp:()V
  #130 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #131 = Utf8               setMaxHpMp
  #132 = Methodref          #13.#133      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.showPage:(Lext/mods/gameserver/model/actor/Player;)V
  #133 = NameAndType        #134:#135     // showPage:(Lext/mods/gameserver/model/actor/Player;)V
  #134 = Utf8               showPage
  #135 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #136 = Methodref          #123.#137     // ext/mods/gameserver/model/actor/Creature.stopAllEffectsDebuff:()V
  #137 = NameAndType        #138:#11      // stopAllEffectsDebuff:()V
  #138 = Utf8               stopAllEffectsDebuff
  #139 = Methodref          #13.#140      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #140 = NameAndType        #141:#135     // showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #141 = Utf8               showGiveBuffsWindow
  #142 = Methodref          #123.#143     // ext/mods/gameserver/model/actor/Creature.stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #143 = NameAndType        #144:#11      // stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #144 = Utf8               stopAllEffectsExceptThoseThatLastThroughDeath
  #145 = String             #146          // menu
  #146 = Utf8               menu
  #147 = Methodref          #61.#148      // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #148 = NameAndType        #149:#150     // startsWith:(Ljava/lang/String;)Z
  #149 = Utf8               startsWith
  #150 = Utf8               (Ljava/lang/String;)Z
  #151 = InterfaceMethodref #47.#152      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #152 = NameAndType        #153:#51      // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #153 = Utf8               put
  #154 = InterfaceMethodref #47.#155      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #155 = NameAndType        #156:#157     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #156 = Utf8               get
  #157 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #158 = Class              #159          // java/lang/Object
  #159 = Utf8               java/lang/Object
  #160 = Methodref          #30.#161      // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #161 = NameAndType        #162:#163     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #162 = Utf8               getSysString
  #163 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #164 = Methodref          #30.#165      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #165 = NameAndType        #166:#167     // sendMessage:(Ljava/lang/String;)V
  #166 = Utf8               sendMessage
  #167 = Utf8               (Ljava/lang/String;)V
  #168 = String             #169          // getscheme
  #169 = Utf8               getscheme
  #170 = Methodref          #171.#172     // ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
  #171 = Class              #173          // ext/mods/gameserver/data/manager/BufferManager
  #172 = NameAndType        #174:#175     // getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
  #173 = Utf8               ext/mods/gameserver/data/manager/BufferManager
  #174 = Utf8               getInstance
  #175 = Utf8               ()Lext/mods/gameserver/data/manager/BufferManager;
  #176 = Methodref          #61.#177      // java/lang/String.toUpperCase:()Ljava/lang/String;
  #177 = NameAndType        #178:#28      // toUpperCase:()Ljava/lang/String;
  #178 = Utf8               toUpperCase
  #179 = Methodref          #180.#181     // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #180 = Class              #182          // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
  #181 = NameAndType        #39:#183      // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #182 = Utf8               ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
  #183 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #184 = Methodref          #171.#185     // ext/mods/gameserver/data/manager/BufferManager.getSchemeSkills:(Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List;
  #185 = NameAndType        #186:#187     // getSchemeSkills:(Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List;
  #186 = Utf8               getSchemeSkills
  #187 = Utf8               (Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List;
  #188 = InterfaceMethodref #189.#190     // java/util/List.iterator:()Ljava/util/Iterator;
  #189 = Class              #191          // java/util/List
  #190 = NameAndType        #192:#193     // iterator:()Ljava/util/Iterator;
  #191 = Utf8               java/util/List
  #192 = Utf8               iterator
  #193 = Utf8               ()Ljava/util/Iterator;
  #194 = InterfaceMethodref #195.#196     // java/util/Iterator.hasNext:()Z
  #195 = Class              #197          // java/util/Iterator
  #196 = NameAndType        #198:#55      // hasNext:()Z
  #197 = Utf8               java/util/Iterator
  #198 = Utf8               hasNext
  #199 = InterfaceMethodref #195.#200     // java/util/Iterator.next:()Ljava/lang/Object;
  #200 = NameAndType        #201:#202     // next:()Ljava/lang/Object;
  #201 = Utf8               next
  #202 = Utf8               ()Ljava/lang/Object;
  #203 = Class              #204          // ext/mods/gameserver/skills/L2Skill
  #204 = Utf8               ext/mods/gameserver/skills/L2Skill
  #205 = Class              #206          // java/util/ArrayList
  #206 = Utf8               java/util/ArrayList
  #207 = Methodref          #205.#10      // java/util/ArrayList."<init>":()V
  #208 = Methodref          #209.#210     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #209 = Class              #211          // ext/mods/gameserver/data/SkillTable
  #210 = NameAndType        #174:#212     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #211 = Utf8               ext/mods/gameserver/data/SkillTable
  #212 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #213 = Methodref          #203.#214     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #214 = NameAndType        #215:#34      // getId:()I
  #215 = Utf8               getId
  #216 = Methodref          #203.#217     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #217 = NameAndType        #218:#34      // getLevel:()I
  #218 = Utf8               getLevel
  #219 = Methodref          #209.#220     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #220 = NameAndType        #221:#222     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #221 = Utf8               getInfo
  #222 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #223 = InterfaceMethodref #189.#224     // java/util/List.add:(Ljava/lang/Object;)Z
  #224 = NameAndType        #225:#70      // add:(Ljava/lang/Object;)Z
  #225 = Utf8               add
  #226 = Methodref          #13.#227      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.getFee:(Ljava/util/List;)I
  #227 = NameAndType        #228:#229     // getFee:(Ljava/util/List;)I
  #228 = Utf8               getFee
  #229 = Utf8               (Ljava/util/List;)I
  #230 = Methodref          #30.#231      // ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
  #231 = NameAndType        #232:#233     // reduceAdena:(IZ)Z
  #232 = Utf8               reduceAdena
  #233 = Utf8               (IZ)Z
  #234 = InvokeDynamic      #0:#235       // #0:accept:(Lext/mods/gameserver/model/actor/instance/SchemeBuffer;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #235 = NameAndType        #236:#237     // accept:(Lext/mods/gameserver/model/actor/instance/SchemeBuffer;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #236 = Utf8               accept
  #237 = Utf8               (Lext/mods/gameserver/model/actor/instance/SchemeBuffer;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #238 = InterfaceMethodref #189.#239     // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #239 = NameAndType        #240:#241     // forEach:(Ljava/util/function/Consumer;)V
  #240 = Utf8               forEach
  #241 = Utf8               (Ljava/util/function/Consumer;)V
  #242 = String             #243          // getbuff
  #243 = Utf8               getbuff
  #244 = Methodref          #36.#245      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #245 = NameAndType        #246:#247     // parseInt:(Ljava/lang/String;)I
  #246 = Utf8               parseInt
  #247 = Utf8               (Ljava/lang/String;)I
  #248 = InvokeDynamic      #1:#235       // #1:accept:(Lext/mods/gameserver/model/actor/instance/SchemeBuffer;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #249 = String             #250          // singlebuff
  #250 = Utf8               singlebuff
  #251 = Methodref          #13.#252      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.showSingleBuffSelectionWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #252 = NameAndType        #253:#254     // showSingleBuffSelectionWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #253 = Utf8               showSingleBuffSelectionWindow
  #254 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
  #255 = String             #256          // givebuffs
  #256 = Utf8               givebuffs
  #257 = Methodref          #18.#258      // java/util/StringTokenizer.hasMoreTokens:()Z
  #258 = NameAndType        #259:#55      // hasMoreTokens:()Z
  #259 = Utf8               hasMoreTokens
  #260 = String             #261          // pet
  #261 = Utf8               pet
  #262 = Methodref          #61.#263      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #263 = NameAndType        #264:#150     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #264 = Utf8               equalsIgnoreCase
  #265 = String             #266          // You don\'t have a pet.
  #266 = Utf8               You don\'t have a pet.
  #267 = Methodref          #171.#268     // ext/mods/gameserver/data/manager/BufferManager.applySchemeEffects:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILjava/lang/String;)V
  #268 = NameAndType        #269:#270     // applySchemeEffects:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILjava/lang/String;)V
  #269 = Utf8               applySchemeEffects
  #270 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILjava/lang/String;)V
  #271 = String             #272          // editschemes
  #272 = Utf8               editschemes
  #273 = Methodref          #13.#274      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.showEditSchemeWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;I)V
  #274 = NameAndType        #275:#276     // showEditSchemeWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;I)V
  #275 = Utf8               showEditSchemeWindow
  #276 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;I)V
  #277 = String             #278          // buff
  #278 = Utf8               buff
  #279 = Methodref          #18.#280      // java/util/StringTokenizer.countTokens:()I
  #280 = NameAndType        #281:#34      // countTokens:()I
  #281 = Utf8               countTokens
  #282 = Methodref          #36.#283      // java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
  #283 = NameAndType        #39:#284      // valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
  #284 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #285 = Methodref          #36.#286      // java/lang/Integer.intValue:()I
  #286 = NameAndType        #287:#34      // intValue:()I
  #287 = Utf8               intValue
  #288 = Methodref          #171.#289     // ext/mods/gameserver/data/manager/BufferManager.getAvailableBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
  #289 = NameAndType        #290:#291     // getAvailableBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
  #290 = Utf8               getAvailableBuff
  #291 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
  #292 = Fieldref           #13.#293      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.LOGGER:Lext/mods/commons/logging/CLogger;
  #293 = NameAndType        #294:#295     // LOGGER:Lext/mods/commons/logging/CLogger;
  #294 = Utf8               LOGGER
  #295 = Utf8               Lext/mods/commons/logging/CLogger;
  #296 = String             #297          // bypass hack detected player npc [{}], skill id [{}]
  #297 = Utf8               bypass hack detected player npc [{}], skill id [{}]
  #298 = Methodref          #30.#299      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #299 = NameAndType        #300:#28      // getName:()Ljava/lang/String;
  #300 = Utf8               getName
  #301 = Methodref          #302.#303     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #302 = Class              #304          // ext/mods/commons/logging/CLogger
  #303 = NameAndType        #305:#306     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #304 = Utf8               ext/mods/commons/logging/CLogger
  #305 = Utf8               info
  #306 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #307 = Methodref          #308.#309     // ext/mods/gameserver/model/records/BuffSkill.type:()Ljava/lang/String;
  #308 = Class              #310          // ext/mods/gameserver/model/records/BuffSkill
  #309 = NameAndType        #311:#28      // type:()Ljava/lang/String;
  #310 = Utf8               ext/mods/gameserver/model/records/BuffSkill
  #311 = Utf8               type
  #312 = String             #313          // bypass hack detected player npc not premium [{}]
  #313 = Utf8               bypass hack detected player npc not premium [{}]
  #314 = Methodref          #13.#315      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #315 = NameAndType        #316:#317     // showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #316 = Utf8               showChatWindow
  #317 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #318 = Methodref          #203.#319     // ext/mods/gameserver/skills/L2Skill.getEffectsNpc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #319 = NameAndType        #320:#321     // getEffectsNpc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #320 = Utf8               getEffectsNpc
  #321 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #322 = String             #323          // skill
  #323 = Utf8               skill
  #324 = Methodref          #171.#325     // ext/mods/gameserver/data/manager/BufferManager.getScheme:(ILjava/lang/String;)Ljava/util/List;
  #325 = NameAndType        #326:#327     // getScheme:(ILjava/lang/String;)Ljava/util/List;
  #326 = Utf8               getScheme
  #327 = Utf8               (ILjava/lang/String;)Ljava/util/List;
  #328 = Methodref          #13.#329      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.premiumSkills:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
  #329 = NameAndType        #330:#331     // premiumSkills:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
  #330 = Utf8               premiumSkills
  #331 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
  #332 = String             #333          // skillselect
  #333 = Utf8               skillselect
  #334 = String             #335          // none
  #335 = Utf8               none
  #336 = InterfaceMethodref #189.#337     // java/util/List.size:()I
  #337 = NameAndType        #338:#34      // size:()I
  #338 = Utf8               size
  #339 = Methodref          #30.#340      // ext/mods/gameserver/model/actor/Player.getMaxBuffCount:()I
  #340 = NameAndType        #341:#34      // getMaxBuffCount:()I
  #341 = Utf8               getMaxBuffCount
  #342 = String             #343          // skillunselect
  #343 = Utf8               skillunselect
  #344 = InterfaceMethodref #189.#345     // java/util/List.remove:(Ljava/lang/Object;)Z
  #345 = NameAndType        #346:#70      // remove:(Ljava/lang/Object;)Z
  #346 = Utf8               remove
  #347 = String             #348          // createscheme
  #348 = Utf8               createscheme
  #349 = Methodref          #61.#350      // java/lang/String.length:()I
  #350 = NameAndType        #351:#34      // length:()I
  #351 = Utf8               length
  #352 = Methodref          #171.#353     // ext/mods/gameserver/data/manager/BufferManager.getPlayerSchemes:(I)Ljava/util/Map;
  #353 = NameAndType        #354:#355     // getPlayerSchemes:(I)Ljava/util/Map;
  #354 = Utf8               getPlayerSchemes
  #355 = Utf8               (I)Ljava/util/Map;
  #356 = InterfaceMethodref #47.#337      // java/util/Map.size:()I
  #357 = Fieldref           #358.#359     // ext/mods/Config.BUFFER_MAX_SCHEMES:I
  #358 = Class              #360          // ext/mods/Config
  #359 = NameAndType        #361:#362     // BUFFER_MAX_SCHEMES:I
  #360 = Utf8               ext/mods/Config
  #361 = Utf8               BUFFER_MAX_SCHEMES
  #362 = Utf8               I
  #363 = InterfaceMethodref #47.#364      // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #364 = NameAndType        #365:#70      // containsKey:(Ljava/lang/Object;)Z
  #365 = Utf8               containsKey
  #366 = Methodref          #61.#367      // java/lang/String.trim:()Ljava/lang/String;
  #367 = NameAndType        #368:#28      // trim:()Ljava/lang/String;
  #368 = Utf8               trim
  #369 = Methodref          #171.#370     // ext/mods/gameserver/data/manager/BufferManager.setScheme:(ILjava/lang/String;Ljava/util/ArrayList;)V
  #370 = NameAndType        #371:#372     // setScheme:(ILjava/lang/String;Ljava/util/ArrayList;)V
  #371 = Utf8               setScheme
  #372 = Utf8               (ILjava/lang/String;Ljava/util/ArrayList;)V
  #373 = Class              #374          // java/lang/Exception
  #374 = Utf8               java/lang/Exception
  #375 = String             #376          // deletescheme
  #376 = Utf8               deletescheme
  #377 = InterfaceMethodref #47.#378      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #378 = NameAndType        #346:#157     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #379 = Methodref          #2.#380       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #380 = NameAndType        #381:#382     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #381 = Utf8               onBypassFeedback
  #382 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #383 = String             #384          //
  #384 = Utf8
  #385 = InvokeDynamic      #2:#386       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #386 = NameAndType        #387:#388     // makeConcatWithConstants:(I)Ljava/lang/String;
  #387 = Utf8               makeConcatWithConstants
  #388 = Utf8               (I)Ljava/lang/String;
  #389 = InvokeDynamic      #3:#390       // #3:makeConcatWithConstants:(II)Ljava/lang/String;
  #390 = NameAndType        #387:#391     // makeConcatWithConstants:(II)Ljava/lang/String;
  #391 = Utf8               (II)Ljava/lang/String;
  #392 = Methodref          #30.#393      // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #393 = NameAndType        #394:#34      // getKarma:()I
  #394 = Utf8               getKarma
  #395 = InvokeDynamic      #4:#396       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #396 = NameAndType        #387:#397     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #397 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #398 = InvokeDynamic      #5:#396       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #399 = String             #400          // %target%
  #400 = Utf8               %target%
  #401 = String             #402          // Summon
  #402 = Utf8               Summon
  #403 = String             #404          // Player
  #404 = Utf8               Player
  #405 = Methodref          #82.#406      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #406 = NameAndType        #107:#24      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #407 = Fieldref           #408.#409     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #408 = Class              #410          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #409 = NameAndType        #411:#412     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #410 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #411 = Utf8               STATIC_PACKET
  #412 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #413 = Class              #414          // java/lang/StringBuilder
  #414 = Utf8               java/lang/StringBuilder
  #415 = Methodref          #413.#85      // java/lang/StringBuilder."<init>":(I)V
  #416 = InterfaceMethodref #47.#417      // java/util/Map.isEmpty:()Z
  #417 = NameAndType        #418:#55      // isEmpty:()Z
  #418 = Utf8               isEmpty
  #419 = InvokeDynamic      #6:#396       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #420 = Methodref          #413.#421     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #421 = NameAndType        #422:#423     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #422 = Utf8               append
  #423 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #424 = InterfaceMethodref #47.#425      // java/util/Map.entrySet:()Ljava/util/Set;
  #425 = NameAndType        #426:#427     // entrySet:()Ljava/util/Set;
  #426 = Utf8               entrySet
  #427 = Utf8               ()Ljava/util/Set;
  #428 = InterfaceMethodref #429.#190     // java/util/Set.iterator:()Ljava/util/Iterator;
  #429 = Class              #430          // java/util/Set
  #430 = Utf8               java/util/Set
  #431 = Class              #432          // java/util/Map$Entry
  #432 = Utf8               java/util/Map$Entry
  #433 = InterfaceMethodref #431.#434     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #434 = NameAndType        #435:#202     // getValue:()Ljava/lang/Object;
  #435 = Utf8               getValue
  #436 = String             #437          // <table><tr><td width=\"200\"><font color=\"LEVEL\">
  #437 = Utf8               <table><tr><td width=\"200\"><font color=\"LEVEL\">
  #438 = InterfaceMethodref #431.#439     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #439 = NameAndType        #440:#202     // getKey:()Ljava/lang/Object;
  #440 = Utf8               getKey
  #441 = String             #442          //  [
  #442 = Utf8                [
  #443 = Methodref          #205.#337     // java/util/ArrayList.size:()I
  #444 = String             #445          //  /
  #445 = Utf8                /
  #446 = String             #447          // ]
  #447 = Utf8               ]
  #448 = Methodref          #449.#450     // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
  #449 = Class              #451          // ext/mods/commons/lang/StringUtil
  #450 = NameAndType        #452:#453     // formatNumber:(J)Ljava/lang/String;
  #451 = Utf8               ext/mods/commons/lang/StringUtil
  #452 = Utf8               formatNumber
  #453 = Utf8               (J)Ljava/lang/String;
  #454 = InvokeDynamic      #7:#396       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #455 = String             #456          // </font></td></tr></table><br1>
  #456 = Utf8               </font></td></tr></table><br1>
  #457 = Methodref          #449.#458     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #458 = NameAndType        #422:#459     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #459 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #460 = InvokeDynamic      #8:#396       // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #461 = String             #462          // \" width=69 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #462 = Utf8               \" width=69 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #463 = InvokeDynamic      #9:#396       // #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #464 = String             #465          //  pet\" width=69 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #465 = Utf8                pet\" width=69 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #466 = InvokeDynamic      #10:#396      // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #467 = String             #468          //  1\" width=69 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #468 = Utf8                1\" width=69 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
  #469 = InvokeDynamic      #11:#396      // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #470 = String             #471          // \" width=69 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td></tr></table><br>
  #471 = Utf8               \" width=69 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td></tr></table><br>
  #472 = String             #473          // %schemes%
  #473 = Utf8               %schemes%
  #474 = Methodref          #413.#475     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #475 = NameAndType        #476:#28      // toString:()Ljava/lang/String;
  #476 = Utf8               toString
  #477 = String             #478          // %max_schemes%
  #478 = Utf8               %max_schemes%
  #479 = String             #480          // %schemename%
  #480 = Utf8               %schemename%
  #481 = String             #482          // %count%
  #482 = Utf8               %count%
  #483 = InvokeDynamic      #12:#390      // #12:makeConcatWithConstants:(II)Ljava/lang/String;
  #484 = String             #485          // %typesframe%
  #485 = Utf8               %typesframe%
  #486 = Methodref          #13.#487      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.getTypesFrame:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
  #487 = NameAndType        #488:#489     // getTypesFrame:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
  #488 = Utf8               getTypesFrame
  #489 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
  #490 = String             #491          // %skilllistframe%
  #491 = Utf8               %skilllistframe%
  #492 = Methodref          #13.#493      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.getGroupSkillList:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;ZI)Ljava/lang/String;
  #493 = NameAndType        #494:#495     // getGroupSkillList:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;ZI)Ljava/lang/String;
  #494 = Utf8               getGroupSkillList
  #495 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;ZI)Ljava/lang/String;
  #496 = Methodref          #171.#497     // ext/mods/gameserver/data/manager/BufferManager.getSkillsIdsByType:(Ljava/lang/String;)Ljava/util/List;
  #497 = NameAndType        #498:#499     // getSkillsIdsByType:(Ljava/lang/String;)Ljava/util/List;
  #498 = Utf8               getSkillsIdsByType
  #499 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #500 = InterfaceMethodref #189.#417     // java/util/List.isEmpty:()Z
  #501 = Methodref          #502.#503     // ext/mods/commons/math/MathUtil.countPagesNumber:(II)I
  #502 = Class              #504          // ext/mods/commons/math/MathUtil
  #503 = NameAndType        #505:#506     // countPagesNumber:(II)I
  #504 = Utf8               ext/mods/commons/math/MathUtil
  #505 = Utf8               countPagesNumber
  #506 = Utf8               (II)I
  #507 = Methodref          #508.#509     // java/lang/Math.min:(II)I
  #508 = Class              #510          // java/lang/Math
  #509 = NameAndType        #511:#506     // min:(II)I
  #510 = Utf8               java/lang/Math
  #511 = Utf8               min
  #512 = InterfaceMethodref #189.#513     // java/util/List.subList:(II)Ljava/util/List;
  #513 = NameAndType        #514:#515     // subList:(II)Ljava/util/List;
  #514 = Utf8               subList
  #515 = Utf8               (II)Ljava/util/List;
  #516 = String             #517          // <table width=\"280\" bgcolor=\"000000\"><tr>
  #517 = Utf8               <table width=\"280\" bgcolor=\"000000\"><tr>
  #518 = String             #519          // <table width=\"280\"><tr>
  #519 = Utf8               <table width=\"280\"><tr>
  #520 = InvokeDynamic      #13:#386      // #13:makeConcatWithConstants:(I)Ljava/lang/String;
  #521 = String             #522          // \" width=32 height=32 back=\"
  #522 = Utf8               \" width=32 height=32 back=\"
  #523 = Methodref          #203.#524     // ext/mods/gameserver/skills/L2Skill.getIcon:()Ljava/lang/String;
  #524 = NameAndType        #525:#28      // getIcon:()Ljava/lang/String;
  #525 = Utf8               getIcon
  #526 = String             #527          // \" fore=\"
  #527 = Utf8               \" fore=\"
  #528 = String             #529          // \" /></td><td width=190>
  #529 = Utf8               \" /></td><td width=190>
  #530 = Methodref          #203.#299     // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #531 = String             #532          // <br1><font color=\"B09878\">
  #532 = Utf8               <br1><font color=\"B09878\">
  #533 = Methodref          #308.#534     // ext/mods/gameserver/model/records/BuffSkill.description:()Ljava/lang/String;
  #534 = NameAndType        #535:#28      // description:()Ljava/lang/String;
  #535 = Utf8               description
  #536 = String             #537          // </font></td>
  #537 = Utf8               </font></td>
  #538 = InterfaceMethodref #189.#539     // java/util/List.contains:(Ljava/lang/Object;)Z
  #539 = NameAndType        #540:#70      // contains:(Ljava/lang/Object;)Z
  #540 = Utf8               contains
  #541 = String             #542          // <td height=40 width=40><img src=\"
  #542 = Utf8               <td height=40 width=40><img src=\"
  #543 = String             #544          // \" width=32 height=32></td><td width=190>
  #544 = Utf8               \" width=32 height=32></td><td width=190>
  #545 = String             #546          // </font></td><td><button action=\"bypass npc_%objectId%_skillunselect
  #546 = Utf8               </font></td><td><button action=\"bypass npc_%objectId%_skillunselect
  #547 = String             #548          // \" width=32 height=32 back=\"L2UI_CH3.mapbutton_zoomout2\" fore=\"L2UI_CH3.mapbutton_zoomout1\"></td>
  #548 = Utf8               \" width=32 height=32 back=\"L2UI_CH3.mapbutton_zoomout2\" fore=\"L2UI_CH3.mapbutton_zoomout1\"></td>
  #549 = String             #550          // </font></td><td><button action=\"bypass npc_%objectId%_skillselect
  #550 = Utf8               </font></td><td><button action=\"bypass npc_%objectId%_skillselect
  #551 = String             #552          // \" width=32 height=32 back=\"L2UI_CH3.mapbutton_zoomin2\" fore=\"L2UI_CH3.mapbutton_zoomin1\"></td>
  #552 = Utf8               \" width=32 height=32 back=\"L2UI_CH3.mapbutton_zoomin2\" fore=\"L2UI_CH3.mapbutton_zoomin1\"></td>
  #553 = String             #554          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #554 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #555 = String             #556          // <img height=41>
  #556 = Utf8               <img height=41>
  #557 = String             #558          // <br><img src=\"L2UI.SquareGray\" width=280 height=1><table width=\"100%\" bgcolor=000000><tr>
  #558 = Utf8               <br><img src=\"L2UI.SquareGray\" width=280 height=1><table width=\"100%\" bgcolor=000000><tr>
  #559 = InvokeDynamic      #14:#386      // #14:makeConcatWithConstants:(I)Ljava/lang/String;
  #560 = InvokeDynamic      #15:#396      // #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #561 = InvokeDynamic      #16:#386      // #16:makeConcatWithConstants:(I)Ljava/lang/String;
  #562 = InvokeDynamic      #17:#396      // #17:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #563 = InvokeDynamic      #18:#396      // #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #564 = String             #565          // </td>
  #565 = Utf8               </td>
  #566 = InvokeDynamic      #19:#386      // #19:makeConcatWithConstants:(I)Ljava/lang/String;
  #567 = InvokeDynamic      #20:#386      // #20:makeConcatWithConstants:(I)Ljava/lang/String;
  #568 = InvokeDynamic      #21:#396      // #21:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #569 = String             #570          // <table>
  #570 = Utf8               <table>
  #571 = Methodref          #171.#572     // ext/mods/gameserver/data/manager/BufferManager.getSkillTypes:()Ljava/util/List;
  #572 = NameAndType        #573:#574     // getSkillTypes:()Ljava/util/List;
  #573 = Utf8               getSkillTypes
  #574 = Utf8               ()Ljava/util/List;
  #575 = Fieldref           #358.#576     // ext/mods/Config.PREMIUM_BUFFS_CATEGORY:Ljava/util/List;
  #576 = NameAndType        #577:#578     // PREMIUM_BUFFS_CATEGORY:Ljava/util/List;
  #577 = Utf8               PREMIUM_BUFFS_CATEGORY
  #578 = Utf8               Ljava/util/List;
  #579 = String             #580          // <tr>
  #580 = Utf8               <tr>
  #581 = String             #582          // <td width=65>
  #582 = Utf8               <td width=65>
  #583 = String             #584          // <td width=65><a action=\"bypass npc_%objectId%_singlebuff
  #584 = Utf8               <td width=65><a action=\"bypass npc_%objectId%_singlebuff
  #585 = String             #586          //  1\">
  #586 = Utf8                1\">
  #587 = String             #588          // </a></td>
  #588 = Utf8               </a></td>
  #589 = String             #590          // <td width=65><a action=\"bypass npc_%objectId%_editschemes
  #590 = Utf8               <td width=65><a action=\"bypass npc_%objectId%_editschemes
  #591 = String             #592          // </tr>
  #592 = Utf8               </tr>
  #593 = Methodref          #61.#594      // java/lang/String.endsWith:(Ljava/lang/String;)Z
  #594 = NameAndType        #595:#150     // endsWith:(Ljava/lang/String;)Z
  #595 = Utf8               endsWith
  #596 = String             #597          // </table>
  #597 = Utf8               </table>
  #598 = Fieldref           #358.#599     // ext/mods/Config.BUFFER_STATIC_BUFF_COST:I
  #599 = NameAndType        #600:#362     // BUFFER_STATIC_BUFF_COST:I
  #600 = Utf8               BUFFER_STATIC_BUFF_COST
  #601 = Methodref          #308.#602     // ext/mods/gameserver/model/records/BuffSkill.price:()I
  #602 = NameAndType        #603:#34      // price:()I
  #603 = Utf8               price
  #604 = InvokeDynamic      #22:#605      // #22:test:()Ljava/util/function/Predicate;
  #605 = NameAndType        #606:#607     // test:()Ljava/util/function/Predicate;
  #606 = Utf8               test
  #607 = Utf8               ()Ljava/util/function/Predicate;
  #608 = InterfaceMethodref #189.#609     // java/util/List.removeIf:(Ljava/util/function/Predicate;)Z
  #609 = NameAndType        #610:#611     // removeIf:(Ljava/util/function/Predicate;)Z
  #610 = Utf8               removeIf
  #611 = Utf8               (Ljava/util/function/Predicate;)Z
  #612 = Fieldref           #358.#613     // ext/mods/Config.BUFFS_CATEGORY:Ljava/lang/String;
  #613 = NameAndType        #614:#615     // BUFFS_CATEGORY:Ljava/lang/String;
  #614 = Utf8               BUFFS_CATEGORY
  #615 = Utf8               Ljava/lang/String;
  #616 = Methodref          #61.#617      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #617 = NameAndType        #540:#618     // contains:(Ljava/lang/CharSequence;)Z
  #618 = Utf8               (Ljava/lang/CharSequence;)Z
  #619 = Methodref          #13.#620      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.getEffect:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #620 = NameAndType        #621:#622     // getEffect:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #621 = Utf8               getEffect
  #622 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #623 = Utf8               PAGE_LIMIT
  #624 = Utf8               ConstantValue
  #625 = Integer            6
  #626 = Utf8               Signature
  #627 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Boolean;>;
  #628 = Utf8               Code
  #629 = Utf8               LineNumberTable
  #630 = Utf8               LocalVariableTable
  #631 = Utf8               this
  #632 = Utf8               Lext/mods/gameserver/model/actor/instance/SchemeBuffer;
  #633 = Utf8               objectId
  #634 = Utf8               template
  #635 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #636 = Utf8               html
  #637 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #638 = Utf8               isPet
  #639 = Utf8               Ljava/lang/Boolean;
  #640 = Utf8               list
  #641 = Utf8               cost
  #642 = Utf8               scheme
  #643 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #644 = Utf8               schemes
  #645 = Utf8               skillId
  #646 = Utf8               skillLevel
  #647 = Utf8               targetType
  #648 = Utf8               schemeName
  #649 = Utf8               targets
  #650 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #651 = Utf8               buffIds
  #652 = Utf8               buffLevel
  #653 = Utf8               nextWindow
  #654 = Utf8               Lext/mods/gameserver/model/records/BuffSkill;
  #655 = Utf8               groupType
  #656 = Utf8               page
  #657 = Utf8               skills
  #658 = Utf8               e
  #659 = Utf8               Ljava/lang/Exception;
  #660 = Utf8               player
  #661 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #662 = Utf8               command
  #663 = Utf8               st
  #664 = Utf8               Ljava/util/StringTokenizer;
  #665 = Utf8               target
  #666 = Utf8               LocalVariableTypeTable
  #667 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #668 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
  #669 = Utf8               StackMapTable
  #670 = Class              #671          // ext/mods/gameserver/model/actor/Playable
  #671 = Utf8               ext/mods/gameserver/model/actor/Playable
  #672 = Utf8               npcId
  #673 = Utf8               val
  #674 = Utf8               filename
  #675 = Utf8               Ljava/util/Map$Entry;
  #676 = Utf8               sb
  #677 = Utf8               Ljava/lang/StringBuilder;
  #678 = Utf8               Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
  #679 = Class              #680          // "[Ljava/lang/Object;"
  #680 = Utf8               [Ljava/lang/Object;
  #681 = Utf8               schemeSkills
  #682 = Utf8               i
  #683 = Utf8               singleSelection
  #684 = Utf8               Z
  #685 = Utf8               max
  #686 = Utf8               row
  #687 = Utf8               count
  #688 = Utf8               buffSkill
  #689 = Utf8               sk
  #690 = Utf8               fee
  #691 = Utf8               (Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;)I
  #692 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;)V
  #693 = Utf8               lambda$premiumSkills$0
  #694 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #695 = Utf8               lambda$onBypassFeedback$1
  #696 = Utf8               buffId
  #697 = Utf8               lambda$onBypassFeedback$0
  #698 = Utf8               SourceFile
  #699 = Utf8               SchemeBuffer.java
  #700 = Utf8               BootstrapMethods
  #701 = MethodType         #702          //  (Ljava/lang/Object;)V
  #702 = Utf8               (Ljava/lang/Object;)V
  #703 = MethodHandle       5:#704        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/SchemeBuffer.lambda$onBypassFeedback$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #704 = Methodref          #13.#705      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.lambda$onBypassFeedback$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #705 = NameAndType        #697:#622     // lambda$onBypassFeedback$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #706 = MethodType         #707          //  (Lext/mods/gameserver/skills/L2Skill;)V
  #707 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)V
  #708 = MethodHandle       5:#709        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/SchemeBuffer.lambda$onBypassFeedback$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #709 = Methodref          #13.#710      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.lambda$onBypassFeedback$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #710 = NameAndType        #695:#622     // lambda$onBypassFeedback$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #711 = String             #712          // \u0001
  #712 = Utf8               \u0001
  #713 = String             #714          // \u0001-\u0001
  #714 = Utf8               \u0001-\u0001
  #715 = String             #716          // html/mods/buffer/\u0001-pk.htm
  #716 = Utf8               html/mods/buffer/\u0001-pk.htm
  #717 = String             #718          // html/mods/buffer/\u0001.htm
  #718 = Utf8               html/mods/buffer/\u0001.htm
  #719 = String             #720          // <font color=\"LEVEL\">\u0001</font>
  #720 = Utf8               <font color=\"LEVEL\">\u0001</font>
  #721 = String             #722          //  - cost: \u0001
  #722 = Utf8                - cost: \u0001
  #723 = String             #724          // <table><tr><td><button value=\u0001 action=\"bypass npc_%objectId%_givebuffs
  #724 = Utf8               <table><tr><td><button value=\u0001 action=\"bypass npc_%objectId%_givebuffs
  #725 = String             #726          // <td><button value=\u0001 action=\"bypass npc_%objectId%_givebuffs
  #726 = Utf8               <td><button value=\u0001 action=\"bypass npc_%objectId%_givebuffs
  #727 = String             #728          // <td><button value=\u0001 action=\"bypass npc_%objectId%_editschemes Buffs
  #728 = Utf8               <td><button value=\u0001 action=\"bypass npc_%objectId%_editschemes Buffs
  #729 = String             #730          // <td><button value=\u0001 action=\"bypass npc_%objectId%_deletescheme
  #730 = Utf8               <td><button value=\u0001 action=\"bypass npc_%objectId%_deletescheme
  #731 = String             #732          // \u0001 / \u0001
  #732 = Utf8               \u0001 / \u0001
  #733 = String             #734          // <td height=40 width=40><button action=\"bypass npc_\u0001_getbuff
  #734 = Utf8               <td height=40 width=40><button action=\"bypass npc_\u0001_getbuff
  #735 = String             #736          // <td align=left width=70><a action=\"bypass npc_\u0001_singlebuff
  #736 = Utf8               <td align=left width=70><a action=\"bypass npc_\u0001_singlebuff
  #737 = String             #738          // \">\u0001</a></td>
  #738 = Utf8               \">\u0001</a></td>
  #739 = String             #740          // <td align=left width=70><a action=\"bypass npc_\u0001_editschemes
  #740 = Utf8               <td align=left width=70><a action=\"bypass npc_\u0001_editschemes
  #741 = String             #742          // <td align=left width=70>\u0001</td>
  #742 = Utf8               <td align=left width=70>\u0001</td>
  #743 = String             #744          // <td align=center width=100>\u0001
  #744 = Utf8               <td align=center width=100>\u0001
  #745 = String             #746          // <td align=right width=70><a action=\"bypass npc_\u0001_singlebuff
  #746 = Utf8               <td align=right width=70><a action=\"bypass npc_\u0001_singlebuff
  #747 = String             #748          // <td align=right width=70><a action=\"bypass npc_\u0001_editschemes
  #748 = Utf8               <td align=right width=70><a action=\"bypass npc_\u0001_editschemes
  #749 = String             #750          // <td align=right width=70>\u0001</td>
  #750 = Utf8               <td align=right width=70>\u0001</td>
  #751 = MethodType         #70           //  (Ljava/lang/Object;)Z
  #752 = MethodHandle       6:#753        // REF_invokeStatic ext/mods/gameserver/model/actor/instance/SchemeBuffer.lambda$premiumSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #753 = Methodref          #13.#754      // ext/mods/gameserver/model/actor/instance/SchemeBuffer.lambda$premiumSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #754 = NameAndType        #693:#694     // lambda$premiumSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #755 = MethodType         #694          //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #756 = MethodHandle       6:#757        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #757 = Methodref          #758.#759     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #758 = Class              #760          // java/lang/invoke/LambdaMetafactory
  #759 = NameAndType        #761:#762     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #760 = Utf8               java/lang/invoke/LambdaMetafactory
  #761 = Utf8               metafactory
  #762 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #763 = MethodHandle       6:#764        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #764 = Methodref          #765.#766     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #765 = Class              #767          // java/lang/invoke/StringConcatFactory
  #766 = NameAndType        #387:#768     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #767 = Utf8               java/lang/invoke/StringConcatFactory
  #768 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #769 = Utf8               InnerClasses
  #770 = Utf8               BufferSchemeType
  #771 = Utf8               Entry
  #772 = Class              #773          // java/lang/invoke/MethodHandles$Lookup
  #773 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #774 = Class              #775          // java/lang/invoke/MethodHandles
  #775 = Utf8               java/lang/invoke/MethodHandles
  #776 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.SchemeBuffer(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: new           #7                  // class java/util/HashMap
        10: dup
        11: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        14: putfield      #12                 // Field _isPetTarget:Ljava/util/Map;
        17: return
      LineNumberTable:
        line 49: 0
        line 45: 6
        line 50: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/instance/SchemeBuffer;
            0      18     1 objectId   I
            0      18     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=12, args_size=3
         0: new           #18                 // class java/util/StringTokenizer
         3: dup
         4: aload_2
         5: ldc           #20                 // String
         7: invokespecial #22                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_1
        17: astore        4
        19: aload_0
        20: getfield      #12                 // Field _isPetTarget:Ljava/util/Map;
        23: aload_1
        24: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        27: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        30: iconst_0
        31: invokestatic  #41                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        34: invokeinterface #46,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        39: checkcast     #42                 // class java/lang/Boolean
        42: invokevirtual #52                 // Method java/lang/Boolean.booleanValue:()Z
        45: ifeq          61
        48: aload_1
        49: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        52: ifnull        61
        55: aload_1
        56: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        59: astore        4
        61: aload_2
        62: astore        5
        64: iconst_m1
        65: istore        6
        67: aload         5
        69: invokevirtual #60                 // Method java/lang/String.hashCode:()I
        72: lookupswitch  { // 5

             -1854767153: 172

              -318452137: 124

                 3198440: 140

               856774235: 156

               856774308: 188
                 default: 201
            }
       124: aload         5
       126: ldc           #65                 // String premium
       128: invokevirtual #67                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       131: ifeq          201
       134: iconst_0
       135: istore        6
       137: goto          201
       140: aload         5
       142: ldc           #71                 // String heal
       144: invokevirtual #67                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       147: ifeq          201
       150: iconst_1
       151: istore        6
       153: goto          201
       156: aload         5
       158: ldc           #73                 // String cleanse
       160: invokevirtual #67                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       163: ifeq          201
       166: iconst_2
       167: istore        6
       169: goto          201
       172: aload         5
       174: ldc           #75                 // String support
       176: invokevirtual #67                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       179: ifeq          201
       182: iconst_3
       183: istore        6
       185: goto          201
       188: aload         5
       190: ldc           #77                 // String cleanup
       192: invokevirtual #67                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       195: ifeq          201
       198: iconst_4
       199: istore        6
       201: iload         6
       203: tableswitch   { // 0 to 4

                       0: 236

                       1: 343

                       2: 375

                       3: 388

                       4: 396
                 default: 406
            }
       236: aload_1
       237: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       240: iconst_1
       241: if_icmpne     293
       244: new           #82                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       247: dup
       248: iconst_0
       249: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       252: astore        7
       254: aload         7
       256: aload_1
       257: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       260: aload_0
       261: aload_1
       262: aload_0
       263: invokevirtual #91                 // Method getNpcId:()I
       266: iconst_4
       267: invokevirtual #94                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       270: invokevirtual #98                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       273: aload         7
       275: ldc           #102                // String %objectId%
       277: aload_0
       278: invokevirtual #104                // Method getObjectId:()I
       281: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       284: aload_1
       285: aload         7
       287: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       290: goto          406
       293: new           #82                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       296: dup
       297: iconst_0
       298: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       301: astore        7
       303: aload         7
       305: aload_1
       306: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       309: aload_0
       310: aload_1
       311: aload_0
       312: invokevirtual #91                 // Method getNpcId:()I
       315: bipush        8
       317: invokevirtual #94                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
       320: invokevirtual #98                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       323: aload         7
       325: ldc           #102                // String %objectId%
       327: aload_0
       328: invokevirtual #104                // Method getObjectId:()I
       331: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       334: aload_1
       335: aload         7
       337: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       340: goto          406
       343: aload         4
       345: aload_1
       346: if_acmpne     359
       349: aload_1
       350: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       353: invokevirtual #117                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
       356: goto          367
       359: aload         4
       361: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       364: invokevirtual #127                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.setMaxHpMp:()V
       367: aload_0
       368: aload_1
       369: invokevirtual #132                // Method showPage:(Lext/mods/gameserver/model/actor/Player;)V
       372: goto          406
       375: aload         4
       377: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Creature.stopAllEffectsDebuff:()V
       380: aload_0
       381: aload_1
       382: invokevirtual #132                // Method showPage:(Lext/mods/gameserver/model/actor/Player;)V
       385: goto          406
       388: aload_0
       389: aload_1
       390: invokevirtual #139                // Method showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
       393: goto          406
       396: aload         4
       398: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Creature.stopAllEffectsExceptThoseThatLastThroughDeath:()V
       401: aload_0
       402: aload_1
       403: invokevirtual #132                // Method showPage:(Lext/mods/gameserver/model/actor/Player;)V
       406: aload_2
       407: ldc           #145                // String menu
       409: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       412: ifeq          604
       415: aload_0
       416: getfield      #12                 // Field _isPetTarget:Ljava/util/Map;
       419: aload_1
       420: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       423: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       426: iconst_0
       427: invokestatic  #41                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       430: invokeinterface #46,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       435: checkcast     #42                 // class java/lang/Boolean
       438: astore        5
       440: aload         5
       442: invokevirtual #52                 // Method java/lang/Boolean.booleanValue:()Z
       445: ifeq          479
       448: aload_1
       449: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       452: ifnonnull     479
       455: aload_0
       456: getfield      #12                 // Field _isPetTarget:Ljava/util/Map;
       459: aload_1
       460: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       463: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       466: iconst_0
       467: invokestatic  #41                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       470: invokeinterface #151,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       475: pop
       476: goto          596
       479: aload_1
       480: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       483: ifnull        557
       486: aload_0
       487: getfield      #12                 // Field _isPetTarget:Ljava/util/Map;
       490: aload_1
       491: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       494: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       497: aload         5
       499: invokevirtual #52                 // Method java/lang/Boolean.booleanValue:()Z
       502: ifne          509
       505: iconst_1
       506: goto          510
       509: iconst_0
       510: invokestatic  #41                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       513: invokeinterface #151,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       518: pop
       519: aload_0
       520: getfield      #12                 // Field _isPetTarget:Ljava/util/Map;
       523: aload_1
       524: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       527: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       530: invokeinterface #154,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       535: checkcast     #42                 // class java/lang/Boolean
       538: invokevirtual #52                 // Method java/lang/Boolean.booleanValue:()Z
       541: ifeq          551
       544: aload_1
       545: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       548: goto          552
       551: aload_1
       552: astore        4
       554: goto          596
       557: aload_1
       558: aload_1
       559: sipush        10201
       562: iconst_0
       563: anewarray     #158                // class java/lang/Object
       566: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       569: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       572: aload_0
       573: getfield      #12                 // Field _isPetTarget:Ljava/util/Map;
       576: aload_1
       577: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       580: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       583: iconst_0
       584: invokestatic  #41                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       587: invokeinterface #151,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       592: pop
       593: aload_1
       594: astore        4
       596: aload_0
       597: aload_1
       598: invokevirtual #132                // Method showPage:(Lext/mods/gameserver/model/actor/Player;)V
       601: goto          1750
       604: aload_2
       605: ldc           #168                // String getscheme
       607: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       610: ifeq          742
       613: invokestatic  #170                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
       616: aload_3
       617: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       620: invokevirtual #176                // Method java/lang/String.toUpperCase:()Ljava/lang/String;
       623: invokestatic  #179                // Method ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
       626: invokevirtual #184                // Method ext/mods/gameserver/data/manager/BufferManager.getSchemeSkills:(Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List;
       629: astore        5
       631: aload         5
       633: invokeinterface #188,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       638: astore        6
       640: aload         6
       642: invokeinterface #194,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       647: ifeq          734
       650: aload         6
       652: invokeinterface #199,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       657: checkcast     #203                // class ext/mods/gameserver/skills/L2Skill
       660: astore        7
       662: new           #205                // class java/util/ArrayList
       665: dup
       666: invokespecial #207                // Method java/util/ArrayList."<init>":()V
       669: astore        8
       671: aload         8
       673: invokestatic  #208                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       676: aload         7
       678: invokevirtual #213                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       681: aload         7
       683: invokevirtual #216                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       686: invokevirtual #219                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       689: invokeinterface #223,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       694: pop
       695: aload         8
       697: invokestatic  #226                // Method getFee:(Ljava/util/List;)I
       700: istore        9
       702: iload         9
       704: ifeq          717
       707: aload_1
       708: iload         9
       710: iconst_1
       711: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
       714: ifeq          731
       717: aload         8
       719: aload_0
       720: aload_1
       721: invokedynamic #234,  0            // InvokeDynamic #0:accept:(Lext/mods/gameserver/model/actor/instance/SchemeBuffer;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
       726: invokeinterface #238,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       731: goto          640
       734: aload_0
       735: aload_1
       736: invokevirtual #132                // Method showPage:(Lext/mods/gameserver/model/actor/Player;)V
       739: goto          1750
       742: aload_2
       743: ldc           #242                // String getbuff
       745: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       748: ifeq          835
       751: aload_3
       752: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       755: invokestatic  #244                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       758: istore        5
       760: aload_3
       761: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       764: invokestatic  #244                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       767: istore        6
       769: new           #205                // class java/util/ArrayList
       772: dup
       773: invokespecial #207                // Method java/util/ArrayList."<init>":()V
       776: astore        7
       778: aload         7
       780: invokestatic  #208                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       783: iload         5
       785: iload         6
       787: invokevirtual #219                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       790: invokeinterface #223,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       795: pop
       796: aload         7
       798: invokestatic  #226                // Method getFee:(Ljava/util/List;)I
       801: istore        8
       803: iload         8
       805: ifeq          818
       808: aload_1
       809: iload         8
       811: iconst_1
       812: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
       815: ifeq          832
       818: aload         7
       820: aload_0
       821: aload_1
       822: invokedynamic #248,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/instance/SchemeBuffer;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
       827: invokeinterface #238,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       832: goto          1750
       835: aload_2
       836: ldc           #249                // String singlebuff
       838: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       841: ifeq          863
       844: aload_0
       845: aload_1
       846: aload_3
       847: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       850: aload_3
       851: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       854: invokestatic  #244                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       857: invokevirtual #251                // Method showSingleBuffSelectionWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;I)V
       860: goto          1750
       863: aload_2
       864: ldc           #255                // String givebuffs
       866: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       869: ifeq          979
       872: aload_3
       873: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       876: astore        5
       878: aload_3
       879: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       882: invokestatic  #244                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       885: istore        6
       887: aconst_null
       888: astore        7
       890: aload_3
       891: invokevirtual #257                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       894: ifeq          928
       897: aload_3
       898: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       901: astore        8
       903: aload         8
       905: ifnull        925
       908: aload         8
       910: ldc_w         #260                // String pet
       913: invokevirtual #262                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       916: ifeq          925
       919: aload_1
       920: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       923: astore        7
       925: goto          931
       928: aload_1
       929: astore        7
       931: aload         7
       933: ifnonnull     946
       936: aload_1
       937: ldc_w         #265                // String You don\'t have a pet.
       940: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       943: goto          976
       946: iload         6
       948: ifeq          961
       951: aload_1
       952: iload         6
       954: iconst_1
       955: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
       958: ifeq          976
       961: invokestatic  #170                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
       964: aload_0
       965: aload         7
       967: aload_1
       968: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       971: aload         5
       973: invokevirtual #267                // Method ext/mods/gameserver/data/manager/BufferManager.applySchemeEffects:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILjava/lang/String;)V
       976: goto          1750
       979: aload_2
       980: ldc_w         #271                // String editschemes
       983: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       986: ifeq          1012
       989: aload_0
       990: aload_1
       991: aload_3
       992: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       995: aload_3
       996: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       999: aload_3
      1000: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1003: invokestatic  #244                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1006: invokevirtual #273                // Method showEditSchemeWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;I)V
      1009: goto          1750
      1012: aload_2
      1013: ldc_w         #277                // String buff
      1016: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1019: ifeq          1322
      1022: iconst_0
      1023: istore        5
      1025: iconst_1
      1026: istore        6
      1028: iconst_0
      1029: istore        7
      1031: aload_3
      1032: invokevirtual #279                // Method java/util/StringTokenizer.countTokens:()I
      1035: iconst_3
      1036: if_icmpne     1078
      1039: aload_3
      1040: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1043: invokestatic  #282                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
      1046: invokevirtual #285                // Method java/lang/Integer.intValue:()I
      1049: istore        5
      1051: aload_3
      1052: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1055: invokestatic  #282                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
      1058: invokevirtual #285                // Method java/lang/Integer.intValue:()I
      1061: istore        6
      1063: aload_3
      1064: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1067: invokestatic  #282                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
      1070: invokevirtual #285                // Method java/lang/Integer.intValue:()I
      1073: istore        7
      1075: goto          1133
      1078: aload_3
      1079: invokevirtual #279                // Method java/util/StringTokenizer.countTokens:()I
      1082: iconst_2
      1083: if_icmpne     1113
      1086: aload_3
      1087: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1090: invokestatic  #282                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
      1093: invokevirtual #285                // Method java/lang/Integer.intValue:()I
      1096: istore        5
      1098: aload_3
      1099: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1102: invokestatic  #282                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
      1105: invokevirtual #285                // Method java/lang/Integer.intValue:()I
      1108: istore        7
      1110: goto          1133
      1113: aload_3
      1114: invokevirtual #279                // Method java/util/StringTokenizer.countTokens:()I
      1117: iconst_1
      1118: if_icmpne     1133
      1121: aload_3
      1122: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1125: invokestatic  #282                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
      1128: invokevirtual #285                // Method java/lang/Integer.intValue:()I
      1131: istore        7
      1133: new           #205                // class java/util/ArrayList
      1136: dup
      1137: invokespecial #207                // Method java/util/ArrayList."<init>":()V
      1140: astore        8
      1142: invokestatic  #208                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
      1145: iload         5
      1147: iload         6
      1149: invokevirtual #219                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
      1152: astore        9
      1154: invokestatic  #170                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
      1157: aload         9
      1159: invokevirtual #288                // Method ext/mods/gameserver/data/manager/BufferManager.getAvailableBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
      1162: astore        10
      1164: aload         10
      1166: ifnonnull     1203
      1169: getstatic     #292                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1172: ldc_w         #296                // String bypass hack detected player npc [{}], skill id [{}]
      1175: iconst_2
      1176: anewarray     #158                // class java/lang/Object
      1179: dup
      1180: iconst_0
      1181: aload_1
      1182: invokevirtual #298                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1185: aastore
      1186: dup
      1187: iconst_1
      1188: aload         9
      1190: invokevirtual #213                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
      1193: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1196: aastore
      1197: invokevirtual #301                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1200: goto          1319
      1203: aload         8
      1205: invokestatic  #208                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
      1208: iload         5
      1210: iload         6
      1212: invokevirtual #219                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
      1215: invokeinterface #223,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      1220: pop
      1221: aload         8
      1223: invokestatic  #226                // Method getFee:(Ljava/util/List;)I
      1226: istore        11
      1228: iload         5
      1230: ifeq          1319
      1233: ldc           #65                 // String premium
      1235: aload         10
      1237: invokevirtual #307                // Method ext/mods/gameserver/model/records/BuffSkill.type:()Ljava/lang/String;
      1240: invokevirtual #67                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1243: ifeq          1281
      1246: aload_1
      1247: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
      1250: ifne          1281
      1253: getstatic     #292                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1256: ldc_w         #312                // String bypass hack detected player npc not premium [{}]
      1259: iconst_1
      1260: anewarray     #158                // class java/lang/Object
      1263: dup
      1264: iconst_0
      1265: aload_1
      1266: invokevirtual #298                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1269: aastore
      1270: invokevirtual #301                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1273: aload_0
      1274: aload_1
      1275: iload         7
      1277: invokevirtual #314                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
      1280: return
      1281: iload         11
      1283: ifeq          1296
      1286: aload_1
      1287: iload         11
      1289: iconst_1
      1290: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
      1293: ifeq          1319
      1296: aload         9
      1298: ifnull        1311
      1301: aload         9
      1303: aload         4
      1305: aload         4
      1307: invokevirtual #318                // Method ext/mods/gameserver/skills/L2Skill.getEffectsNpc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
      1310: pop
      1311: aload_0
      1312: aload_1
      1313: iload         7
      1315: invokevirtual #314                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
      1318: return
      1319: goto          1750
      1322: aload_2
      1323: ldc_w         #322                // String skill
      1326: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1329: ifeq          1504
      1332: aload_3
      1333: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1336: astore        5
      1338: aload_3
      1339: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1342: astore        6
      1344: aload_3
      1345: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1348: invokestatic  #244                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1351: istore        7
      1353: aload_3
      1354: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1357: invokestatic  #244                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1360: istore        8
      1362: aload_3
      1363: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1366: invokestatic  #244                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1369: istore        9
      1371: invokestatic  #208                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
      1374: iload         7
      1376: iload         8
      1378: invokevirtual #219                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
      1381: astore        10
      1383: invokestatic  #170                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
      1386: aload_1
      1387: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1390: aload         6
      1392: invokevirtual #324                // Method ext/mods/gameserver/data/manager/BufferManager.getScheme:(ILjava/lang/String;)Ljava/util/List;
      1395: astore        11
      1397: aload_0
      1398: aload_1
      1399: aload         11
      1401: invokevirtual #328                // Method premiumSkills:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
      1404: aload_2
      1405: ldc_w         #332                // String skillselect
      1408: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1411: ifeq          1470
      1414: aload         6
      1416: ldc_w         #334                // String none
      1419: invokevirtual #262                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1422: ifne          1470
      1425: aload         11
      1427: invokeinterface #336,  1          // InterfaceMethod java/util/List.size:()I
      1432: aload_1
      1433: invokevirtual #339                // Method ext/mods/gameserver/model/actor/Player.getMaxBuffCount:()I
      1436: if_icmpge     1452
      1439: aload         11
      1441: aload         10
      1443: invokeinterface #223,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      1448: pop
      1449: goto          1490
      1452: aload_1
      1453: aload_1
      1454: sipush        10180
      1457: iconst_0
      1458: anewarray     #158                // class java/lang/Object
      1461: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1464: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1467: goto          1490
      1470: aload_2
      1471: ldc_w         #342                // String skillunselect
      1474: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1477: ifeq          1490
      1480: aload         11
      1482: aload         10
      1484: invokeinterface #344,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
      1489: pop
      1490: aload_0
      1491: aload_1
      1492: aload         5
      1494: aload         6
      1496: iload         9
      1498: invokevirtual #273                // Method showEditSchemeWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;I)V
      1501: goto          1750
      1504: aload_2
      1505: ldc_w         #347                // String createscheme
      1508: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1511: ifeq          1670
      1514: aload_3
      1515: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1518: astore        5
      1520: aload         5
      1522: invokevirtual #349                // Method java/lang/String.length:()I
      1525: bipush        14
      1527: if_icmple     1546
      1530: aload_1
      1531: aload_1
      1532: sipush        10181
      1535: iconst_0
      1536: anewarray     #158                // class java/lang/Object
      1539: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1542: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1545: return
      1546: invokestatic  #170                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
      1549: aload_1
      1550: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1553: invokevirtual #352                // Method ext/mods/gameserver/data/manager/BufferManager.getPlayerSchemes:(I)Ljava/util/Map;
      1556: astore        6
      1558: aload         6
      1560: ifnull        1620
      1563: aload         6
      1565: invokeinterface #356,  1          // InterfaceMethod java/util/Map.size:()I
      1570: getstatic     #357                // Field ext/mods/Config.BUFFER_MAX_SCHEMES:I
      1573: if_icmpne     1592
      1576: aload_1
      1577: aload_1
      1578: sipush        10182
      1581: iconst_0
      1582: anewarray     #158                // class java/lang/Object
      1585: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1588: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1591: return
      1592: aload         6
      1594: aload         5
      1596: invokeinterface #363,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      1601: ifeq          1620
      1604: aload_1
      1605: aload_1
      1606: sipush        10183
      1609: iconst_0
      1610: anewarray     #158                // class java/lang/Object
      1613: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1616: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1619: return
      1620: invokestatic  #170                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
      1623: aload_1
      1624: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1627: aload         5
      1629: invokevirtual #366                // Method java/lang/String.trim:()Ljava/lang/String;
      1632: new           #205                // class java/util/ArrayList
      1635: dup
      1636: invokespecial #207                // Method java/util/ArrayList."<init>":()V
      1639: invokevirtual #369                // Method ext/mods/gameserver/data/manager/BufferManager.setScheme:(ILjava/lang/String;Ljava/util/ArrayList;)V
      1642: aload_0
      1643: aload_1
      1644: invokevirtual #139                // Method showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
      1647: goto          1750
      1650: astore        5
      1652: aload_1
      1653: aload_1
      1654: sipush        10181
      1657: iconst_0
      1658: anewarray     #158                // class java/lang/Object
      1661: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1664: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1667: goto          1750
      1670: aload_2
      1671: ldc_w         #375                // String deletescheme
      1674: invokevirtual #147                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1677: ifeq          1750
      1680: aload_3
      1681: invokevirtual #25                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1684: astore        5
      1686: invokestatic  #170                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
      1689: aload_1
      1690: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1693: invokevirtual #352                // Method ext/mods/gameserver/data/manager/BufferManager.getPlayerSchemes:(I)Ljava/util/Map;
      1696: astore        6
      1698: aload         6
      1700: ifnull        1725
      1703: aload         6
      1705: aload         5
      1707: invokeinterface #363,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      1712: ifeq          1725
      1715: aload         6
      1717: aload         5
      1719: invokeinterface #377,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
      1724: pop
      1725: goto          1745
      1728: astore        5
      1730: aload_1
      1731: aload_1
      1732: sipush        10184
      1735: iconst_0
      1736: anewarray     #158                // class java/lang/Object
      1739: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1742: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1745: aload_0
      1746: aload_1
      1747: invokevirtual #139                // Method showGiveBuffsWindow:(Lext/mods/gameserver/model/actor/Player;)V
      1750: aload_0
      1751: aload_1
      1752: aload_2
      1753: invokespecial #379                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      1756: return
      Exception table:
         from    to  target type
          1514  1545  1650   Class java/lang/Exception
          1546  1591  1650   Class java/lang/Exception
          1592  1619  1650   Class java/lang/Exception
          1620  1647  1650   Class java/lang/Exception
          1680  1725  1728   Class java/lang/Exception
      LineNumberTable:
        line 55: 0
        line 56: 11
        line 58: 16
        line 59: 19
        line 60: 55
        line 62: 61
        line 65: 236
        line 67: 244
        line 68: 254
        line 69: 273
        line 70: 284
        line 71: 290
        line 74: 293
        line 75: 303
        line 76: 323
        line 77: 334
        line 79: 340
        line 82: 343
        line 83: 349
        line 85: 359
        line 87: 367
        line 88: 372
        line 90: 375
        line 91: 380
        line 92: 385
        line 94: 388
        line 95: 393
        line 97: 396
        line 98: 401
        line 102: 406
        line 104: 415
        line 105: 440
        line 106: 455
        line 107: 479
        line 109: 486
        line 110: 519
        line 114: 557
        line 115: 572
        line 116: 593
        line 119: 596
        line 120: 601
        line 121: 604
        line 123: 613
        line 124: 631
        line 126: 662
        line 127: 671
        line 128: 695
        line 129: 702
        line 130: 717
        line 131: 731
        line 132: 734
        line 133: 739
        line 134: 742
        line 136: 751
        line 137: 760
        line 138: 769
        line 139: 778
        line 140: 796
        line 141: 803
        line 142: 818
        line 143: 832
        line 144: 835
        line 145: 844
        line 146: 863
        line 148: 872
        line 149: 878
        line 151: 887
        line 152: 890
        line 154: 897
        line 155: 903
        line 156: 919
        line 157: 925
        line 159: 928
        line 161: 931
        line 162: 936
        line 163: 946
        line 164: 961
        line 165: 976
        line 166: 979
        line 167: 989
        line 168: 1012
        line 170: 1022
        line 171: 1031
        line 173: 1039
        line 174: 1051
        line 175: 1063
        line 177: 1078
        line 179: 1086
        line 180: 1098
        line 182: 1113
        line 183: 1121
        line 185: 1133
        line 187: 1142
        line 188: 1154
        line 189: 1164
        line 190: 1169
        line 193: 1203
        line 194: 1221
        line 195: 1228
        line 197: 1233
        line 199: 1246
        line 201: 1253
        line 202: 1273
        line 203: 1280
        line 207: 1281
        line 209: 1296
        line 210: 1301
        line 212: 1311
        line 213: 1318
        line 217: 1319
        line 218: 1322
        line 220: 1332
        line 221: 1338
        line 223: 1344
        line 224: 1353
        line 225: 1362
        line 227: 1371
        line 228: 1383
        line 229: 1397
        line 230: 1404
        line 232: 1425
        line 233: 1439
        line 235: 1452
        line 237: 1470
        line 238: 1480
        line 240: 1490
        line 241: 1501
        line 242: 1504
        line 246: 1514
        line 247: 1520
        line 249: 1530
        line 250: 1545
        line 253: 1546
        line 254: 1558
        line 256: 1563
        line 258: 1576
        line 259: 1591
        line 262: 1592
        line 264: 1604
        line 265: 1619
        line 269: 1620
        line 270: 1642
        line 275: 1647
        line 272: 1650
        line 274: 1652
        line 275: 1667
        line 277: 1670
        line 281: 1680
        line 282: 1686
        line 284: 1698
        line 285: 1715
        line 290: 1725
        line 287: 1728
        line 289: 1730
        line 291: 1745
        line 294: 1750
        line 295: 1756
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          254      36     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          303      37     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          440     161     5 isPet   Ljava/lang/Boolean;
          671      60     8  list   Ljava/util/List;
          702      29     9  cost   I
          662      69     7 scheme   Lext/mods/gameserver/skills/L2Skill;
          631     108     5 schemes   Ljava/util/List;
          760      72     5 skillId   I
          769      63     6 skillLevel   I
          778      54     7  list   Ljava/util/List;
          803      29     8  cost   I
          903      22     8 targetType   Ljava/lang/String;
          878      98     5 schemeName   Ljava/lang/String;
          887      89     6  cost   I
          890      86     7 targets   Lext/mods/gameserver/model/actor/Creature;
         1228      91    11  cost   I
         1025     294     5 buffIds   I
         1028     291     6 buffLevel   I
         1031     288     7 nextWindow   I
         1142     177     8  list   Ljava/util/List;
         1154     165     9 skill   Lext/mods/gameserver/skills/L2Skill;
         1164     155    10  buff   Lext/mods/gameserver/model/records/BuffSkill;
         1338     163     5 groupType   Ljava/lang/String;
         1344     157     6 schemeName   Ljava/lang/String;
         1353     148     7 skillId   I
         1362     139     8 skillLevel   I
         1371     130     9  page   I
         1383     118    10 skill   Lext/mods/gameserver/skills/L2Skill;
         1397     104    11 skills   Ljava/util/List;
         1520     127     5 schemeName   Ljava/lang/String;
         1558      89     6 schemes   Ljava/util/Map;
         1652      15     5     e   Ljava/lang/Exception;
         1686      39     5 schemeName   Ljava/lang/String;
         1698      27     6 schemes   Ljava/util/Map;
         1730      15     5     e   Ljava/lang/Exception;
            0    1757     0  this   Lext/mods/gameserver/model/actor/instance/SchemeBuffer;
            0    1757     1 player   Lext/mods/gameserver/model/actor/Player;
            0    1757     2 command   Ljava/lang/String;
           11    1746     3    st   Ljava/util/StringTokenizer;
           19    1738     4 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          671      60     8  list   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
          631     108     5 schemes   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
          778      54     7  list   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
         1142     177     8  list   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
         1397     104    11 skills   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
         1558      89     6 schemes   Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
         1698      27     6 schemes   Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
      StackMapTable: number_of_entries = 63
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
        frame_type = 56 /* same */
        frame_type = 49 /* same */
        frame_type = 15 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 12 /* same */
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 252 /* append */
          offset_delta = 72
          locals = [ class java/lang/Boolean ]
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class java/lang/Boolean ]
          stack = [ class java/util/Map, class java/lang/Integer ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class java/lang/Boolean ]
          stack = [ class java/util/Map, class java/lang/Integer, int ]
        frame_type = 40 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 4 /* same */
        frame_type = 38 /* same */
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/skills/L2Skill, class java/util/List, int ]
        frame_type = 248 /* chop */
          offset_delta = 13
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 255 /* full_frame */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, int, int, class java/util/List, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 27 /* same */
        frame_type = 254 /* append */
          offset_delta = 61
          locals = [ class java/lang/String, int, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 2 /* same */
        frame_type = 2 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 248 /* chop */
          offset_delta = 14
        frame_type = 2 /* same */
        frame_type = 32 /* same */
        frame_type = 254 /* append */
          offset_delta = 65
          locals = [ int, int, int ]
        frame_type = 34 /* same */
        frame_type = 19 /* same */
        frame_type = 254 /* append */
          offset_delta = 69
          locals = [ class java/util/List, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/records/BuffSkill ]
        frame_type = 252 /* append */
          offset_delta = 77
          locals = [ int ]
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 129
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, class java/lang/String, class java/lang/String, int, int, int, class ext/mods/gameserver/skills/L2Skill, class java/util/List ]
          stack = []
        frame_type = 17 /* same */
        frame_type = 19 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class java/util/Map ]
        frame_type = 27 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature ]
          stack = [ class java/lang/Exception ]
        frame_type = 19 /* same */
        frame_type = 54 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 16 /* same */
        frame_type = 4 /* same */

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: ldc_w         #383                // String
         3: astore        4
         5: iload_3
         6: ifne          20
         9: iload_2
        10: invokedynamic #385,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        15: astore        4
        17: goto          29
        20: iload_2
        21: iload_3
        22: invokedynamic #389,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
        27: astore        4
        29: aload_1
        30: invokevirtual #392                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        33: ifle          46
        36: aload         4
        38: invokedynamic #395,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        43: goto          53
        46: aload         4
        48: invokedynamic #398,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        53: areturn
      LineNumberTable:
        line 309: 0
        line 310: 5
        line 311: 9
        line 313: 20
        line 315: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/model/actor/instance/SchemeBuffer;
            0      54     1 player   Lext/mods/gameserver/model/actor/Player;
            0      54     2 npcId   I
            0      54     3   val   I
            5      49     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/String ]
        frame_type = 8 /* same */
        frame_type = 16 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=3
         0: new           #82                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: aload_0
         5: invokevirtual #104                // Method getObjectId:()I
         8: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        11: astore_3
        12: aload_3
        13: aload_1
        14: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        17: aload_0
        18: aload_1
        19: aload_0
        20: invokevirtual #91                 // Method getNpcId:()I
        23: iload_2
        24: invokevirtual #94                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        27: invokevirtual #98                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        30: aload_1
        31: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        34: ifnonnull     58
        37: aload_0
        38: getfield      #12                 // Field _isPetTarget:Ljava/util/Map;
        41: aload_1
        42: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        45: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        48: iconst_0
        49: invokestatic  #41                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        52: invokeinterface #151,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        57: pop
        58: aload_0
        59: getfield      #12                 // Field _isPetTarget:Ljava/util/Map;
        62: aload_1
        63: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        66: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        69: iconst_0
        70: invokestatic  #41                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        73: invokeinterface #46,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        78: checkcast     #42                 // class java/lang/Boolean
        81: astore        4
        83: aload_3
        84: ldc_w         #399                // String %target%
        87: aload         4
        89: invokevirtual #52                 // Method java/lang/Boolean.booleanValue:()Z
        92: ifeq          101
        95: ldc_w         #401                // String Summon
        98: goto          104
       101: ldc_w         #403                // String Player
       104: invokevirtual #405                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       107: aload_3
       108: ldc           #102                // String %objectId%
       110: aload_0
       111: invokevirtual #104                // Method getObjectId:()I
       114: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       117: aload_1
       118: aload_3
       119: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       122: aload_1
       123: getstatic     #407                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       126: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       129: return
      LineNumberTable:
        line 321: 0
        line 322: 12
        line 324: 30
        line 325: 37
        line 327: 58
        line 328: 83
        line 329: 107
        line 331: 117
        line 332: 122
        line 333: 129
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     130     0  this   Lext/mods/gameserver/model/actor/instance/SchemeBuffer;
            0     130     1 player   Lext/mods/gameserver/model/actor/Player;
            0     130     2   val   I
           12     118     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           83      47     4 isPet   Ljava/lang/Boolean;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/Boolean ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/Boolean ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]

  public void showPage(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=2
         0: new           #82                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_0
         5: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore_2
         9: aload_2
        10: aload_1
        11: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        14: aload_0
        15: aload_1
        16: aload_0
        17: invokevirtual #91                 // Method getNpcId:()I
        20: iconst_0
        21: invokevirtual #94                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        24: invokevirtual #98                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        27: aload_0
        28: getfield      #12                 // Field _isPetTarget:Ljava/util/Map;
        31: aload_1
        32: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        35: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        38: iconst_0
        39: invokestatic  #41                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        42: invokeinterface #46,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        47: checkcast     #42                 // class java/lang/Boolean
        50: astore_3
        51: aload_2
        52: ldc_w         #399                // String %target%
        55: aload_3
        56: invokevirtual #52                 // Method java/lang/Boolean.booleanValue:()Z
        59: ifeq          68
        62: ldc_w         #401                // String Summon
        65: goto          71
        68: ldc_w         #403                // String Player
        71: invokevirtual #405                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        74: aload_2
        75: ldc           #102                // String %objectId%
        77: aload_0
        78: invokevirtual #104                // Method getObjectId:()I
        81: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        84: aload_1
        85: aload_2
        86: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        89: return
      LineNumberTable:
        line 337: 0
        line 338: 9
        line 339: 27
        line 340: 51
        line 341: 74
        line 342: 84
        line 343: 89
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      90     0  this   Lext/mods/gameserver/model/actor/instance/SchemeBuffer;
            0      90     1 player   Lext/mods/gameserver/model/actor/Player;
            9      81     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           51      39     3 isPet   Ljava/lang/Boolean;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/Boolean ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/SchemeBuffer, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/Boolean ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
}
SourceFile: "SchemeBuffer.java"
BootstrapMethods:
  0: #756 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #701 (Ljava/lang/Object;)V
      #703 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/SchemeBuffer.lambda$onBypassFeedback$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
      #706 (Lext/mods/gameserver/skills/L2Skill;)V
  1: #756 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #701 (Ljava/lang/Object;)V
      #708 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/SchemeBuffer.lambda$onBypassFeedback$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
      #706 (Lext/mods/gameserver/skills/L2Skill;)V
  2: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #711 \u0001
  3: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #713 \u0001-\u0001
  4: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #715 html/mods/buffer/\u0001-pk.htm
  5: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #717 html/mods/buffer/\u0001.htm
  6: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #719 <font color=\"LEVEL\">\u0001</font>
  7: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #721  - cost: \u0001
  8: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #723 <table><tr><td><button value=\u0001 action=\"bypass npc_%objectId%_givebuffs
  9: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #725 <td><button value=\u0001 action=\"bypass npc_%objectId%_givebuffs
  10: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #727 <td><button value=\u0001 action=\"bypass npc_%objectId%_editschemes Buffs
  11: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #729 <td><button value=\u0001 action=\"bypass npc_%objectId%_deletescheme
  12: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #731 \u0001 / \u0001
  13: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #733 <td height=40 width=40><button action=\"bypass npc_\u0001_getbuff
  14: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #735 <td align=left width=70><a action=\"bypass npc_\u0001_singlebuff
  15: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #737 \">\u0001</a></td>
  16: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #739 <td align=left width=70><a action=\"bypass npc_\u0001_editschemes
  17: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #741 <td align=left width=70>\u0001</td>
  18: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #743 <td align=center width=100>\u0001
  19: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #745 <td align=right width=70><a action=\"bypass npc_\u0001_singlebuff
  20: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #747 <td align=right width=70><a action=\"bypass npc_\u0001_editschemes
  21: #763 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #749 <td align=right width=70>\u0001</td>
  22: #756 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #751 (Ljava/lang/Object;)Z
      #752 REF_invokeStatic ext/mods/gameserver/model/actor/instance/SchemeBuffer.lambda$premiumSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
      #755 (Lext/mods/gameserver/skills/L2Skill;)Z
InnerClasses:
  public static final #770= #180 of #171; // BufferSchemeType=class ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType of class ext/mods/gameserver/data/manager/BufferManager
  public static #771= #431 of #47;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #776= #772 of #774; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
