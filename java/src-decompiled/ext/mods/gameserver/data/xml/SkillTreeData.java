// Bytecode for: ext.mods.gameserver.data.xml.SkillTreeData
// File: ext\mods\gameserver\data\xml\SkillTreeData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/SkillTreeData.class
  Last modified 9 de jul de 2026; size 11837 bytes
  MD5 checksum e9b85f12b91f1f9e8e5288d9ac940966
  Compiled from "SkillTreeData.java"
public class ext.mods.gameserver.data.xml.SkillTreeData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/SkillTreeData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 25, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/LinkedList
    #8 = Utf8               java/util/LinkedList
    #9 = Methodref          #7.#3         // java/util/LinkedList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/SkillTreeData._fishingSkills:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/SkillTreeData
   #12 = NameAndType        #14:#15       // _fishingSkills:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/xml/SkillTreeData
   #14 = Utf8               _fishingSkills
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/data/xml/SkillTreeData._clanSkills:Ljava/util/List;
   #17 = NameAndType        #18:#15       // _clanSkills:Ljava/util/List;
   #18 = Utf8               _clanSkills
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/xml/SkillTreeData._enchantSkills:Ljava/util/List;
   #20 = NameAndType        #21:#15       // _enchantSkills:Ljava/util/List;
   #21 = Utf8               _enchantSkills
   #22 = Methodref          #11.#23       // ext/mods/gameserver/data/xml/SkillTreeData.load:()V
   #23 = NameAndType        #24:#6        // load:()V
   #24 = Utf8               load
   #25 = String             #26           // xml/skillstrees
   #26 = Utf8               xml/skillstrees
   #27 = Methodref          #11.#28       // ext/mods/gameserver/data/xml/SkillTreeData.parseDataFile:(Ljava/lang/String;)V
   #28 = NameAndType        #29:#30       // parseDataFile:(Ljava/lang/String;)V
   #29 = Utf8               parseDataFile
   #30 = Utf8               (Ljava/lang/String;)V
   #31 = Fieldref           #11.#32       // ext/mods/gameserver/data/xml/SkillTreeData.LOGGER:Lext/mods/commons/logging/CLogger;
   #32 = NameAndType        #33:#34       // LOGGER:Lext/mods/commons/logging/CLogger;
   #33 = Utf8               LOGGER
   #34 = Utf8               Lext/mods/commons/logging/CLogger;
   #35 = String             #36           // Loaded {} fishing skills.
   #36 = Utf8               Loaded {} fishing skills.
   #37 = InterfaceMethodref #38.#39       // java/util/List.size:()I
   #38 = Class              #40           // java/util/List
   #39 = NameAndType        #41:#42       // size:()I
   #40 = Utf8               java/util/List
   #41 = Utf8               size
   #42 = Utf8               ()I
   #43 = Methodref          #44.#45       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #44 = Class              #46           // java/lang/Integer
   #45 = NameAndType        #47:#48       // valueOf:(I)Ljava/lang/Integer;
   #46 = Utf8               java/lang/Integer
   #47 = Utf8               valueOf
   #48 = Utf8               (I)Ljava/lang/Integer;
   #49 = Methodref          #50.#51       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #50 = Class              #52           // ext/mods/commons/logging/CLogger
   #51 = NameAndType        #53:#54       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #52 = Utf8               ext/mods/commons/logging/CLogger
   #53 = Utf8               info
   #54 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #55 = String             #56           // Loaded {} clan skills.
   #56 = Utf8               Loaded {} clan skills.
   #57 = String             #58           // Loaded {} enchant skills.
   #58 = Utf8               Loaded {} enchant skills.
   #59 = String             #60           // list
   #60 = Utf8               list
   #61 = InvokeDynamic      #0:#62        // #0:accept:(Lext/mods/gameserver/data/xml/SkillTreeData;)Ljava/util/function/Consumer;
   #62 = NameAndType        #63:#64       // accept:(Lext/mods/gameserver/data/xml/SkillTreeData;)Ljava/util/function/Consumer;
   #63 = Utf8               accept
   #64 = Utf8               (Lext/mods/gameserver/data/xml/SkillTreeData;)Ljava/util/function/Consumer;
   #65 = Methodref          #11.#66       // ext/mods/gameserver/data/xml/SkillTreeData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #66 = NameAndType        #67:#68       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #67 = Utf8               forEach
   #68 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #69 = Class              #70           // java/util/ArrayList
   #70 = Utf8               java/util/ArrayList
   #71 = Methodref          #69.#3        // java/util/ArrayList."<init>":()V
   #72 = InterfaceMethodref #38.#73       // java/util/List.stream:()Ljava/util/stream/Stream;
   #73 = NameAndType        #74:#75       // stream:()Ljava/util/stream/Stream;
   #74 = Utf8               stream
   #75 = Utf8               ()Ljava/util/stream/Stream;
   #76 = InvokeDynamic      #1:#77        // #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #77 = NameAndType        #78:#79       // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #78 = Utf8               test
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #80 = InterfaceMethodref #81.#82       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #81 = Class              #83           // java/util/stream/Stream
   #82 = NameAndType        #84:#85       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #83 = Utf8               java/util/stream/Stream
   #84 = Utf8               filter
   #85 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #86 = InvokeDynamic      #2:#87        // #2:accept:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)Ljava/util/function/Consumer;
   #87 = NameAndType        #63:#88       // accept:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)Ljava/util/function/Consumer;
   #88 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)Ljava/util/function/Consumer;
   #89 = InterfaceMethodref #81.#90       // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
   #90 = NameAndType        #67:#91       // forEach:(Ljava/util/function/Consumer;)V
   #91 = Utf8               (Ljava/util/function/Consumer;)V
   #92 = InvokeDynamic      #3:#93        // #3:test:(IILext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #93 = NameAndType        #78:#94       // test:(IILext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #94 = Utf8               (IILext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #95 = InterfaceMethodref #81.#96       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #96 = NameAndType        #97:#98       // findFirst:()Ljava/util/Optional;
   #97 = Utf8               findFirst
   #98 = Utf8               ()Ljava/util/Optional;
   #99 = Methodref          #100.#101     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #100 = Class              #102          // java/util/Optional
  #101 = NameAndType        #103:#104     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #102 = Utf8               java/util/Optional
  #103 = Utf8               orElse
  #104 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #105 = Class              #106          // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode
  #106 = Utf8               ext/mods/gameserver/model/holder/skillnode/FishingSkillNode
  #107 = Methodref          #105.#108     // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getMinLvl:()I
  #108 = NameAndType        #109:#42      // getMinLvl:()I
  #109 = Utf8               getMinLvl
  #110 = Methodref          #111.#112     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #111 = Class              #113          // ext/mods/gameserver/model/actor/Player
  #112 = NameAndType        #114:#115     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #113 = Utf8               ext/mods/gameserver/model/actor/Player
  #114 = Utf8               getStatus
  #115 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #116 = Methodref          #117.#118     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #117 = Class              #119          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #118 = NameAndType        #120:#42      // getLevel:()I
  #119 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #120 = Utf8               getLevel
  #121 = Methodref          #111.#122     // ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
  #122 = NameAndType        #123:#124     // getSkillLevel:(I)I
  #123 = Utf8               getSkillLevel
  #124 = Utf8               (I)I
  #125 = Methodref          #105.#126     // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getValue:()I
  #126 = NameAndType        #127:#42      // getValue:()I
  #127 = Utf8               getValue
  #128 = InvokeDynamic      #4:#77        // #4:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #129 = InvokeDynamic      #5:#130       // #5:compare:()Ljava/util/Comparator;
  #130 = NameAndType        #131:#132     // compare:()Ljava/util/Comparator;
  #131 = Utf8               compare
  #132 = Utf8               ()Ljava/util/Comparator;
  #133 = InterfaceMethodref #81.#134      // java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
  #134 = NameAndType        #135:#136     // min:(Ljava/util/Comparator;)Ljava/util/Optional;
  #135 = Utf8               min
  #136 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
  #137 = InvokeDynamic      #6:#138       // #6:apply:()Ljava/util/function/Function;
  #138 = NameAndType        #139:#140     // apply:()Ljava/util/function/Function;
  #139 = Utf8               apply
  #140 = Utf8               ()Ljava/util/function/Function;
  #141 = Methodref          #100.#142     // java/util/Optional.map:(Ljava/util/function/Function;)Ljava/util/Optional;
  #142 = NameAndType        #143:#144     // map:(Ljava/util/function/Function;)Ljava/util/Optional;
  #143 = Utf8               map
  #144 = Utf8               (Ljava/util/function/Function;)Ljava/util/Optional;
  #145 = Methodref          #44.#146      // java/lang/Integer.intValue:()I
  #146 = NameAndType        #147:#42      // intValue:()I
  #147 = Utf8               intValue
  #148 = Methodref          #111.#149     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #149 = NameAndType        #150:#151     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #150 = Utf8               getClan
  #151 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #152 = Methodref          #153.#154     // java/util/Collections.emptyList:()Ljava/util/List;
  #153 = Class              #155          // java/util/Collections
  #154 = NameAndType        #156:#157     // emptyList:()Ljava/util/List;
  #155 = Utf8               java/util/Collections
  #156 = Utf8               emptyList
  #157 = Utf8               ()Ljava/util/List;
  #158 = InvokeDynamic      #7:#159       // #7:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #159 = NameAndType        #78:#160      // test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #160 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #161 = InvokeDynamic      #8:#162       // #8:accept:(Lext/mods/gameserver/model/pledge/Clan;Ljava/util/List;)Ljava/util/function/Consumer;
  #162 = NameAndType        #63:#163      // accept:(Lext/mods/gameserver/model/pledge/Clan;Ljava/util/List;)Ljava/util/function/Consumer;
  #163 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Ljava/util/List;)Ljava/util/function/Consumer;
  #164 = InvokeDynamic      #9:#165       // #9:test:(II)Ljava/util/function/Predicate;
  #165 = NameAndType        #78:#166      // test:(II)Ljava/util/function/Predicate;
  #166 = Utf8               (II)Ljava/util/function/Predicate;
  #167 = Class              #168          // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode
  #168 = Utf8               ext/mods/gameserver/model/holder/skillnode/ClanSkillNode
  #169 = Methodref          #167.#108     // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getMinLvl:()I
  #170 = Methodref          #171.#118     // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #171 = Class              #172          // ext/mods/gameserver/model/pledge/Clan
  #172 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #173 = Methodref          #171.#174     // ext/mods/gameserver/model/pledge/Clan.getClanSkills:()Ljava/util/Map;
  #174 = NameAndType        #175:#176     // getClanSkills:()Ljava/util/Map;
  #175 = Utf8               getClanSkills
  #176 = Utf8               ()Ljava/util/Map;
  #177 = InterfaceMethodref #178.#179     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #178 = Class              #180          // java/util/Map
  #179 = NameAndType        #181:#104     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #180 = Utf8               java/util/Map
  #181 = Utf8               get
  #182 = Class              #183          // ext/mods/gameserver/skills/L2Skill
  #183 = Utf8               ext/mods/gameserver/skills/L2Skill
  #184 = Methodref          #167.#126     // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getValue:()I
  #185 = Methodref          #182.#118     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #186 = InterfaceMethodref #38.#187      // java/util/List.iterator:()Ljava/util/Iterator;
  #187 = NameAndType        #188:#189     // iterator:()Ljava/util/Iterator;
  #188 = Utf8               iterator
  #189 = Utf8               ()Ljava/util/Iterator;
  #190 = InterfaceMethodref #191.#192     // java/util/Iterator.hasNext:()Z
  #191 = Class              #193          // java/util/Iterator
  #192 = NameAndType        #194:#195     // hasNext:()Z
  #193 = Utf8               java/util/Iterator
  #194 = Utf8               hasNext
  #195 = Utf8               ()Z
  #196 = InterfaceMethodref #191.#197     // java/util/Iterator.next:()Ljava/lang/Object;
  #197 = NameAndType        #198:#199     // next:()Ljava/lang/Object;
  #198 = Utf8               next
  #199 = Utf8               ()Ljava/lang/Object;
  #200 = Class              #201          // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode
  #201 = Utf8               ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode
  #202 = Methodref          #200.#203     // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode.getId:()I
  #203 = NameAndType        #204:#42      // getId:()I
  #204 = Utf8               getId
  #205 = Methodref          #111.#206     // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #206 = NameAndType        #207:#208     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #207 = Utf8               getSkill
  #208 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #209 = Methodref          #210.#211     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #210 = Class              #212          // ext/mods/gameserver/data/SkillTable
  #211 = NameAndType        #213:#214     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #212 = Utf8               ext/mods/gameserver/data/SkillTable
  #213 = Utf8               getInstance
  #214 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #215 = Methodref          #182.#203     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #216 = Methodref          #210.#217     // ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
  #217 = NameAndType        #218:#124     // getMaxLevel:(I)I
  #218 = Utf8               getMaxLevel
  #219 = Methodref          #200.#126     // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode.getValue:()I
  #220 = InterfaceMethodref #38.#221      // java/util/List.add:(Ljava/lang/Object;)Z
  #221 = NameAndType        #222:#223     // add:(Ljava/lang/Object;)Z
  #222 = Utf8               add
  #223 = Utf8               (Ljava/lang/Object;)Z
  #224 = InvokeDynamic      #10:#165      // #10:test:(II)Ljava/util/function/Predicate;
  #225 = Fieldref           #226.#227     // ext/mods/gameserver/data/xml/SkillTreeData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SkillTreeData;
  #226 = Class              #228          // ext/mods/gameserver/data/xml/SkillTreeData$SingletonHolder
  #227 = NameAndType        #229:#230     // INSTANCE:Lext/mods/gameserver/data/xml/SkillTreeData;
  #228 = Utf8               ext/mods/gameserver/data/xml/SkillTreeData$SingletonHolder
  #229 = Utf8               INSTANCE
  #230 = Utf8               Lext/mods/gameserver/data/xml/SkillTreeData;
  #231 = Methodref          #167.#203     // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getId:()I
  #232 = Methodref          #44.#233      // java/lang/Integer.compare:(II)I
  #233 = NameAndType        #131:#234     // compare:(II)I
  #234 = Utf8               (II)I
  #235 = Methodref          #105.#236     // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.isDwarven:()Z
  #236 = NameAndType        #237:#195     // isDwarven:()Z
  #237 = Utf8               isDwarven
  #238 = Methodref          #111.#239     // ext/mods/gameserver/model/actor/Player.hasDwarvenCraft:()Z
  #239 = NameAndType        #240:#195     // hasDwarvenCraft:()Z
  #240 = Utf8               hasDwarvenCraft
  #241 = Methodref          #105.#203     // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getId:()I
  #242 = String             #243          // clanSkill
  #243 = Utf8               clanSkill
  #244 = InvokeDynamic      #11:#62       // #11:accept:(Lext/mods/gameserver/data/xml/SkillTreeData;)Ljava/util/function/Consumer;
  #245 = String             #246          // fishingSkill
  #246 = Utf8               fishingSkill
  #247 = InvokeDynamic      #12:#62       // #12:accept:(Lext/mods/gameserver/data/xml/SkillTreeData;)Ljava/util/function/Consumer;
  #248 = String             #249          // enchantSkill
  #249 = Utf8               enchantSkill
  #250 = InvokeDynamic      #13:#62       // #13:accept:(Lext/mods/gameserver/data/xml/SkillTreeData;)Ljava/util/function/Consumer;
  #251 = Methodref          #11.#252      // ext/mods/gameserver/data/xml/SkillTreeData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #252 = NameAndType        #253:#254     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #253 = Utf8               parseAttributes
  #254 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #255 = Methodref          #200.#256     // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode."<init>":(Lext/mods/commons/data/StatSet;)V
  #256 = NameAndType        #5:#257       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #257 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #258 = Methodref          #105.#256     // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode."<init>":(Lext/mods/commons/data/StatSet;)V
  #259 = Methodref          #167.#256     // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode."<init>":(Lext/mods/commons/data/StatSet;)V
  #260 = Class              #261          // ext/mods/commons/data/xml/IXmlReader
  #261 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #262 = Utf8               Signature
  #263 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;>;
  #264 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;>;
  #265 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;>;
  #266 = Utf8               Code
  #267 = Utf8               LineNumberTable
  #268 = Utf8               LocalVariableTable
  #269 = Utf8               this
  #270 = Utf8               parseDocument
  #271 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #272 = Utf8               doc
  #273 = Utf8               Lorg/w3c/dom/Document;
  #274 = Utf8               path
  #275 = Utf8               Ljava/nio/file/Path;
  #276 = Utf8               getFishingSkillsFor
  #277 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #278 = Utf8               player
  #279 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #280 = Utf8               result
  #281 = Utf8               LocalVariableTypeTable
  #282 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;>;
  #283 = Utf8               getFishingSkillFor
  #284 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #285 = Utf8               skillId
  #286 = Utf8               I
  #287 = Utf8               skillLevel
  #288 = Utf8               fsn
  #289 = Utf8               Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #290 = Utf8               StackMapTable
  #291 = Utf8               getRequiredLevelForNextFishingSkill
  #292 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #293 = Utf8               getClanSkillsFor
  #294 = Utf8               clan
  #295 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #296 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;>;
  #297 = Utf8               getClanSkillFor
  #298 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
  #299 = Utf8               csn
  #300 = Utf8               Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
  #301 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #302 = Utf8               getEnchantSkillsFor
  #303 = Utf8               skill
  #304 = Utf8               esn
  #305 = Utf8               Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;
  #306 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;>;
  #307 = Utf8               getEnchantSkillFor
  #308 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;
  #309 = Utf8               currentSkillLevel
  #310 = Utf8               ()Lext/mods/gameserver/data/xml/SkillTreeData;
  #311 = Utf8               lambda$getEnchantSkillFor$0
  #312 = Utf8               (IILext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;)Z
  #313 = Utf8               s
  #314 = Utf8               lambda$getClanSkillFor$0
  #315 = Utf8               (IILext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  #316 = Utf8               lambda$getClanSkillsFor$1
  #317 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Ljava/util/List;Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)V
  #318 = Utf8               lambda$getClanSkillsFor$0
  #319 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  #320 = Utf8               lambda$getRequiredLevelForNextFishingSkill$2
  #321 = Utf8               (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Ljava/lang/Integer;
  #322 = Utf8               lambda$getRequiredLevelForNextFishingSkill$1
  #323 = Utf8               (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)I
  #324 = Utf8               s1
  #325 = Utf8               s2
  #326 = Utf8               lambda$getRequiredLevelForNextFishingSkill$0
  #327 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #328 = Utf8               lambda$getFishingSkillFor$0
  #329 = Utf8               (IILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #330 = Utf8               lambda$getFishingSkillsFor$1
  #331 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)V
  #332 = Utf8               lambda$getFishingSkillsFor$0
  #333 = Utf8               lambda$parseDocument$0
  #334 = Utf8               (Lorg/w3c/dom/Node;)V
  #335 = Utf8               listNode
  #336 = Utf8               Lorg/w3c/dom/Node;
  #337 = Utf8               lambda$parseDocument$3
  #338 = Utf8               enchantSkillNode
  #339 = Utf8               lambda$parseDocument$2
  #340 = Utf8               fishingSkillNode
  #341 = Utf8               lambda$parseDocument$1
  #342 = Utf8               clanSkillNode
  #343 = Utf8               SourceFile
  #344 = Utf8               SkillTreeData.java
  #345 = Utf8               NestMembers
  #346 = Utf8               BootstrapMethods
  #347 = MethodType         #348          //  (Ljava/lang/Object;)V
  #348 = Utf8               (Ljava/lang/Object;)V
  #349 = MethodHandle       5:#350        // REF_invokeVirtual ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #350 = Methodref          #11.#351      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #351 = NameAndType        #333:#334     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #352 = MethodType         #334          //  (Lorg/w3c/dom/Node;)V
  #353 = MethodType         #223          //  (Ljava/lang/Object;)Z
  #354 = MethodHandle       6:#355        // REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getFishingSkillsFor$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #355 = Methodref          #11.#356      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$getFishingSkillsFor$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #356 = NameAndType        #332:#327     // lambda$getFishingSkillsFor$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #357 = MethodType         #358          //  (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #358 = Utf8               (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #359 = MethodHandle       6:#360        // REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getFishingSkillsFor$1:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)V
  #360 = Methodref          #11.#361      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$getFishingSkillsFor$1:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)V
  #361 = NameAndType        #330:#331     // lambda$getFishingSkillsFor$1:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)V
  #362 = MethodType         #363          //  (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)V
  #363 = Utf8               (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)V
  #364 = MethodHandle       6:#365        // REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getFishingSkillFor$0:(IILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #365 = Methodref          #11.#366      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$getFishingSkillFor$0:(IILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #366 = NameAndType        #328:#329     // lambda$getFishingSkillFor$0:(IILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #367 = MethodHandle       6:#368        // REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getRequiredLevelForNextFishingSkill$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #368 = Methodref          #11.#369      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$getRequiredLevelForNextFishingSkill$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #369 = NameAndType        #326:#327     // lambda$getRequiredLevelForNextFishingSkill$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  #370 = MethodType         #371          //  (Ljava/lang/Object;Ljava/lang/Object;)I
  #371 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #372 = MethodHandle       6:#373        // REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getRequiredLevelForNextFishingSkill$1:(Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)I
  #373 = Methodref          #11.#374      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$getRequiredLevelForNextFishingSkill$1:(Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)I
  #374 = NameAndType        #322:#323     // lambda$getRequiredLevelForNextFishingSkill$1:(Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)I
  #375 = MethodType         #323          //  (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)I
  #376 = MethodType         #104          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #377 = MethodHandle       6:#378        // REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getRequiredLevelForNextFishingSkill$2:(Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Ljava/lang/Integer;
  #378 = Methodref          #11.#379      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$getRequiredLevelForNextFishingSkill$2:(Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Ljava/lang/Integer;
  #379 = NameAndType        #320:#321     // lambda$getRequiredLevelForNextFishingSkill$2:(Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Ljava/lang/Integer;
  #380 = MethodType         #321          //  (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Ljava/lang/Integer;
  #381 = MethodHandle       6:#382        // REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getClanSkillsFor$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  #382 = Methodref          #11.#383      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$getClanSkillsFor$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  #383 = NameAndType        #318:#319     // lambda$getClanSkillsFor$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  #384 = MethodType         #385          //  (Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  #385 = Utf8               (Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  #386 = MethodHandle       6:#387        // REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getClanSkillsFor$1:(Lext/mods/gameserver/model/pledge/Clan;Ljava/util/List;Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)V
  #387 = Methodref          #11.#388      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$getClanSkillsFor$1:(Lext/mods/gameserver/model/pledge/Clan;Ljava/util/List;Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)V
  #388 = NameAndType        #316:#317     // lambda$getClanSkillsFor$1:(Lext/mods/gameserver/model/pledge/Clan;Ljava/util/List;Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)V
  #389 = MethodType         #390          //  (Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)V
  #390 = Utf8               (Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)V
  #391 = MethodHandle       6:#392        // REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getClanSkillFor$0:(IILext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  #392 = Methodref          #11.#393      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$getClanSkillFor$0:(IILext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  #393 = NameAndType        #314:#315     // lambda$getClanSkillFor$0:(IILext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  #394 = MethodHandle       6:#395        // REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getEnchantSkillFor$0:(IILext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;)Z
  #395 = Methodref          #11.#396      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$getEnchantSkillFor$0:(IILext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;)Z
  #396 = NameAndType        #311:#312     // lambda$getEnchantSkillFor$0:(IILext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;)Z
  #397 = MethodType         #398          //  (Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;)Z
  #398 = Utf8               (Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;)Z
  #399 = MethodHandle       5:#400        // REF_invokeVirtual ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #400 = Methodref          #11.#401      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #401 = NameAndType        #341:#334     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #402 = MethodHandle       5:#403        // REF_invokeVirtual ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #403 = Methodref          #11.#404      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #404 = NameAndType        #339:#334     // lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #405 = MethodHandle       5:#406        // REF_invokeVirtual ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #406 = Methodref          #11.#407      // ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #407 = NameAndType        #337:#334     // lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #408 = MethodHandle       6:#409        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #409 = Methodref          #410.#411     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #410 = Class              #412          // java/lang/invoke/LambdaMetafactory
  #411 = NameAndType        #413:#414     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #412 = Utf8               java/lang/invoke/LambdaMetafactory
  #413 = Utf8               metafactory
  #414 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #415 = Utf8               InnerClasses
  #416 = Utf8               SingletonHolder
  #417 = Class              #418          // java/lang/invoke/MethodHandles$Lookup
  #418 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #419 = Class              #420          // java/lang/invoke/MethodHandles
  #420 = Utf8               java/lang/invoke/MethodHandles
  #421 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.SkillTreeData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/LinkedList
         8: dup
         9: invokespecial #9                  // Method java/util/LinkedList."<init>":()V
        12: putfield      #10                 // Field _fishingSkills:Ljava/util/List;
        15: aload_0
        16: new           #7                  // class java/util/LinkedList
        19: dup
        20: invokespecial #9                  // Method java/util/LinkedList."<init>":()V
        23: putfield      #16                 // Field _clanSkills:Ljava/util/List;
        26: aload_0
        27: new           #7                  // class java/util/LinkedList
        30: dup
        31: invokespecial #9                  // Method java/util/LinkedList."<init>":()V
        34: putfield      #19                 // Field _enchantSkills:Ljava/util/List;
        37: aload_0
        38: invokevirtual #22                 // Method load:()V
        41: return
      LineNumberTable:
        line 48: 0
        line 43: 4
        line 44: 15
        line 45: 26
        line 49: 37
        line 50: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/data/xml/SkillTreeData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #25                 // String xml/skillstrees
         3: invokevirtual #27                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #31                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #35                 // String Loaded {} fishing skills.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _fishingSkills:Ljava/util/List;
        21: invokeinterface #37,  1           // InterfaceMethod java/util/List.size:()I
        26: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #49                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: getstatic     #31                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        36: ldc           #55                 // String Loaded {} clan skills.
        38: iconst_1
        39: anewarray     #2                  // class java/lang/Object
        42: dup
        43: iconst_0
        44: aload_0
        45: getfield      #16                 // Field _clanSkills:Ljava/util/List;
        48: invokeinterface #37,  1           // InterfaceMethod java/util/List.size:()I
        53: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        56: aastore
        57: invokevirtual #49                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        60: getstatic     #31                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        63: ldc           #57                 // String Loaded {} enchant skills.
        65: iconst_1
        66: anewarray     #2                  // class java/lang/Object
        69: dup
        70: iconst_0
        71: aload_0
        72: getfield      #19                 // Field _enchantSkills:Ljava/util/List;
        75: invokeinterface #37,  1           // InterfaceMethod java/util/List.size:()I
        80: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        83: aastore
        84: invokevirtual #49                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        87: return
      LineNumberTable:
        line 55: 0
        line 56: 6
        line 57: 33
        line 58: 60
        line 59: 87
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      88     0  this   Lext/mods/gameserver/data/xml/SkillTreeData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #59                 // String list
         4: aload_0
         5: invokedynamic #61,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/SkillTreeData;)Ljava/util/function/Consumer;
        10: invokevirtual #65                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 64: 0
        line 70: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/SkillTreeData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public java.util.List<ext.mods.gameserver.model.holder.skillnode.FishingSkillNode> getFishingSkillsFor(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: new           #69                 // class java/util/ArrayList
         3: dup
         4: invokespecial #71                 // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: aload_0
         9: getfield      #10                 // Field _fishingSkills:Ljava/util/List;
        12: invokeinterface #72,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        17: aload_1
        18: invokedynamic #76,  0             // InvokeDynamic #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        23: invokeinterface #80,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        28: aload_1
        29: aload_2
        30: invokedynamic #86,  0             // InvokeDynamic #2:accept:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)Ljava/util/function/Consumer;
        35: invokeinterface #89,  2           // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        40: aload_2
        41: areturn
      LineNumberTable:
        line 78: 0
        line 80: 8
        line 86: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/data/xml/SkillTreeData;
            0      42     1 player   Lext/mods/gameserver/model/actor/Player;
            8      34     2 result   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      34     2 result   Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;>;
    Signature: #282                         // (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;>;

  public ext.mods.gameserver.model.holder.skillnode.FishingSkillNode getFishingSkillFor(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=4
         0: aload_0
         1: getfield      #10                 // Field _fishingSkills:Ljava/util/List;
         4: invokeinterface #72,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_2
        10: iload_3
        11: aload_1
        12: invokedynamic #92,  0             // InvokeDynamic #3:test:(IILext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        17: invokeinterface #80,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        22: invokeinterface #95,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        27: aconst_null
        28: invokevirtual #99                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        31: checkcast     #105                // class ext/mods/gameserver/model/holder/skillnode/FishingSkillNode
        34: astore        4
        36: aload         4
        38: ifnonnull     43
        41: aconst_null
        42: areturn
        43: aload         4
        45: invokevirtual #107                // Method ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getMinLvl:()I
        48: aload_1
        49: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        52: invokevirtual #116                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        55: if_icmple     60
        58: aconst_null
        59: areturn
        60: aload_1
        61: iload_2
        62: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
        65: aload         4
        67: invokevirtual #125                // Method ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getValue:()I
        70: iconst_1
        71: isub
        72: if_icmpne     78
        75: aload         4
        77: areturn
        78: aconst_null
        79: areturn
      LineNumberTable:
        line 97: 0
        line 98: 36
        line 99: 41
        line 101: 43
        line 102: 58
        line 104: 60
        line 105: 75
        line 107: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      80     0  this   Lext/mods/gameserver/data/xml/SkillTreeData;
            0      80     1 player   Lext/mods/gameserver/model/actor/Player;
            0      80     2 skillId   I
            0      80     3 skillLevel   I
           36      44     4   fsn   Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/holder/skillnode/FishingSkillNode ]
        frame_type = 16 /* same */
        frame_type = 17 /* same */

  public int getRequiredLevelForNextFishingSkill(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _fishingSkills:Ljava/util/List;
         4: invokeinterface #72,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #128,  0            // InvokeDynamic #4:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        15: invokeinterface #80,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokedynamic #129,  0            // InvokeDynamic #5:compare:()Ljava/util/Comparator;
        25: invokeinterface #133,  2          // InterfaceMethod java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
        30: invokedynamic #137,  0            // InvokeDynamic #6:apply:()Ljava/util/function/Function;
        35: invokevirtual #141                // Method java/util/Optional.map:(Ljava/util/function/Function;)Ljava/util/Optional;
        38: iconst_0
        39: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        42: invokevirtual #99                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        45: checkcast     #44                 // class java/lang/Integer
        48: invokevirtual #145                // Method java/lang/Integer.intValue:()I
        51: ireturn
      LineNumberTable:
        line 116: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/data/xml/SkillTreeData;
            0      52     1 player   Lext/mods/gameserver/model/actor/Player;

  public java.util.List<ext.mods.gameserver.model.holder.skillnode.ClanSkillNode> getClanSkillsFor(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore_2
         5: aload_2
         6: ifnonnull     13
         9: invokestatic  #152                // Method java/util/Collections.emptyList:()Ljava/util/List;
        12: areturn
        13: new           #69                 // class java/util/ArrayList
        16: dup
        17: invokespecial #71                 // Method java/util/ArrayList."<init>":()V
        20: astore_3
        21: aload_0
        22: getfield      #16                 // Field _clanSkills:Ljava/util/List;
        25: invokeinterface #72,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        30: aload_2
        31: invokedynamic #158,  0            // InvokeDynamic #7:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
        36: invokeinterface #80,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        41: aload_2
        42: aload_3
        43: invokedynamic #161,  0            // InvokeDynamic #8:accept:(Lext/mods/gameserver/model/pledge/Clan;Ljava/util/List;)Ljava/util/function/Consumer;
        48: invokeinterface #89,  2           // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        53: aload_3
        54: areturn
      LineNumberTable:
        line 125: 0
        line 126: 5
        line 127: 9
        line 129: 13
        line 131: 21
        line 138: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/data/xml/SkillTreeData;
            0      55     1 player   Lext/mods/gameserver/model/actor/Player;
            5      50     2  clan   Lext/mods/gameserver/model/pledge/Clan;
           21      34     3 result   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           21      34     3 result   Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
    Signature: #296                         // (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;>;

  public ext.mods.gameserver.model.holder.skillnode.ClanSkillNode getClanSkillFor(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=4
         0: aload_1
         1: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore        4
         6: aload         4
         8: ifnonnull     13
        11: aconst_null
        12: areturn
        13: aload_0
        14: getfield      #16                 // Field _clanSkills:Ljava/util/List;
        17: invokeinterface #72,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        22: iload_2
        23: iload_3
        24: invokedynamic #164,  0            // InvokeDynamic #9:test:(II)Ljava/util/function/Predicate;
        29: invokeinterface #80,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        34: invokeinterface #95,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        39: aconst_null
        40: invokevirtual #99                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        43: checkcast     #167                // class ext/mods/gameserver/model/holder/skillnode/ClanSkillNode
        46: astore        5
        48: aload         5
        50: ifnonnull     55
        53: aconst_null
        54: areturn
        55: aload         5
        57: invokevirtual #169                // Method ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getMinLvl:()I
        60: aload         4
        62: invokevirtual #170                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
        65: if_icmple     70
        68: aconst_null
        69: areturn
        70: aload         4
        72: invokevirtual #173                // Method ext/mods/gameserver/model/pledge/Clan.getClanSkills:()Ljava/util/Map;
        75: iload_2
        76: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        79: invokeinterface #177,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        84: checkcast     #182                // class ext/mods/gameserver/skills/L2Skill
        87: astore        6
        89: aload         6
        91: ifnonnull     103
        94: aload         5
        96: invokevirtual #184                // Method ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getValue:()I
        99: iconst_1
       100: if_icmpeq     123
       103: aload         6
       105: ifnull        126
       108: aload         6
       110: invokevirtual #185                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       113: aload         5
       115: invokevirtual #184                // Method ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getValue:()I
       118: iconst_1
       119: isub
       120: if_icmpne     126
       123: aload         5
       125: areturn
       126: aconst_null
       127: areturn
      LineNumberTable:
        line 149: 0
        line 150: 6
        line 151: 11
        line 153: 13
        line 154: 48
        line 155: 53
        line 157: 55
        line 158: 68
        line 160: 70
        line 161: 89
        line 162: 123
        line 164: 126
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     128     0  this   Lext/mods/gameserver/data/xml/SkillTreeData;
            0     128     1 player   Lext/mods/gameserver/model/actor/Player;
            0     128     2 skillId   I
            0     128     3 skillLevel   I
            6     122     4  clan   Lext/mods/gameserver/model/pledge/Clan;
           48      80     5   csn   Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
           89      39     6 clanSkill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/holder/skillnode/ClanSkillNode ]
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 19 /* same */
        frame_type = 2 /* same */

  public java.util.List<ext.mods.gameserver.model.holder.skillnode.EnchantSkillNode> getEnchantSkillsFor(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: new           #69                 // class java/util/ArrayList
         3: dup
         4: invokespecial #71                 // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: aload_0
         9: getfield      #19                 // Field _enchantSkills:Ljava/util/List;
        12: invokeinterface #186,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        17: astore_3
        18: aload_3
        19: invokeinterface #190,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          121
        27: aload_3
        28: invokeinterface #196,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #200                // class ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode
        36: astore        4
        38: aload_1
        39: aload         4
        41: invokevirtual #202                // Method ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode.getId:()I
        44: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
        47: astore        5
        49: aload         5
        51: ifnull        118
        54: aload         5
        56: invokevirtual #185                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        59: invokestatic  #209                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        62: aload         5
        64: invokevirtual #215                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        67: invokevirtual #216                // Method ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
        70: if_icmpne     94
        73: aload         4
        75: invokevirtual #219                // Method ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode.getValue:()I
        78: bipush        101
        80: if_icmpeq     109
        83: aload         4
        85: invokevirtual #219                // Method ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode.getValue:()I
        88: sipush        141
        91: if_icmpeq     109
        94: aload         5
        96: invokevirtual #185                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        99: aload         4
       101: invokevirtual #219                // Method ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode.getValue:()I
       104: iconst_1
       105: isub
       106: if_icmpne     118
       109: aload_2
       110: aload         4
       112: invokeinterface #220,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       117: pop
       118: goto          18
       121: aload_2
       122: areturn
      LineNumberTable:
        line 173: 0
        line 175: 8
        line 177: 38
        line 178: 49
        line 179: 109
        line 180: 118
        line 181: 121
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49      69     5 skill   Lext/mods/gameserver/skills/L2Skill;
           38      80     4   esn   Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;
            0     123     0  this   Lext/mods/gameserver/data/xml/SkillTreeData;
            0     123     1 player   Lext/mods/gameserver/model/actor/Player;
            8     115     2 result   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     115     2 result   Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 14 /* same */
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #306                         // (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;>;

  public ext.mods.gameserver.model.holder.skillnode.EnchantSkillNode getEnchantSkillFor(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: aload_0
         1: getfield      #19                 // Field _enchantSkills:Ljava/util/List;
         4: invokeinterface #72,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_2
        10: iload_3
        11: invokedynamic #224,  0            // InvokeDynamic #10:test:(II)Ljava/util/function/Predicate;
        16: invokeinterface #80,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        21: invokeinterface #95,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        26: aconst_null
        27: invokevirtual #99                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #200                // class ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode
        33: astore        4
        35: aload         4
        37: ifnonnull     42
        40: aconst_null
        41: areturn
        42: aload_1
        43: iload_2
        44: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
        47: istore        5
        49: iload         5
        51: invokestatic  #209                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        54: iload_2
        55: invokevirtual #216                // Method ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
        58: if_icmpne     74
        61: iload_3
        62: bipush        101
        64: if_icmpeq     82
        67: iload_3
        68: sipush        141
        71: if_icmpeq     82
        74: iload         5
        76: iload_3
        77: iconst_1
        78: isub
        79: if_icmpne     85
        82: aload         4
        84: areturn
        85: aconst_null
        86: areturn
      LineNumberTable:
        line 192: 0
        line 193: 35
        line 194: 40
        line 196: 42
        line 197: 49
        line 198: 82
        line 200: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      87     0  this   Lext/mods/gameserver/data/xml/SkillTreeData;
            0      87     1 player   Lext/mods/gameserver/model/actor/Player;
            0      87     2 skillId   I
            0      87     3 skillLevel   I
           35      52     4   esn   Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;
           49      38     5 currentSkillLevel   I
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode ]
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]
        frame_type = 7 /* same */
        frame_type = 2 /* same */

  public static ext.mods.gameserver.data.xml.SkillTreeData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/SkillTreeData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #225                // Field ext/mods/gameserver/data/xml/SkillTreeData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SkillTreeData;
         3: areturn
      LineNumberTable:
        line 205: 0
}
SourceFile: "SkillTreeData.java"
NestMembers:
  ext/mods/gameserver/data/xml/SkillTreeData$SingletonHolder
BootstrapMethods:
  0: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #347 (Ljava/lang/Object;)V
      #349 REF_invokeVirtual ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #352 (Lorg/w3c/dom/Node;)V
  1: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #353 (Ljava/lang/Object;)Z
      #354 REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getFishingSkillsFor$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
      #357 (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  2: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #347 (Ljava/lang/Object;)V
      #359 REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getFishingSkillsFor$1:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)V
      #362 (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)V
  3: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #353 (Ljava/lang/Object;)Z
      #364 REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getFishingSkillFor$0:(IILext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
      #357 (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  4: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #353 (Ljava/lang/Object;)Z
      #367 REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getRequiredLevelForNextFishingSkill$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
      #357 (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Z
  5: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #370 (Ljava/lang/Object;Ljava/lang/Object;)I
      #372 REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getRequiredLevelForNextFishingSkill$1:(Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)I
      #375 (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)I
  6: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #376 (Ljava/lang/Object;)Ljava/lang/Object;
      #377 REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getRequiredLevelForNextFishingSkill$2:(Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Ljava/lang/Integer;
      #380 (Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;)Ljava/lang/Integer;
  7: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #353 (Ljava/lang/Object;)Z
      #381 REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getClanSkillsFor$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
      #384 (Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  8: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #347 (Ljava/lang/Object;)V
      #386 REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getClanSkillsFor$1:(Lext/mods/gameserver/model/pledge/Clan;Ljava/util/List;Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)V
      #389 (Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)V
  9: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #353 (Ljava/lang/Object;)Z
      #391 REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getClanSkillFor$0:(IILext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
      #384 (Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;)Z
  10: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #353 (Ljava/lang/Object;)Z
      #394 REF_invokeStatic ext/mods/gameserver/data/xml/SkillTreeData.lambda$getEnchantSkillFor$0:(IILext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;)Z
      #397 (Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;)Z
  11: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #347 (Ljava/lang/Object;)V
      #399 REF_invokeVirtual ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #352 (Lorg/w3c/dom/Node;)V
  12: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #347 (Ljava/lang/Object;)V
      #402 REF_invokeVirtual ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
      #352 (Lorg/w3c/dom/Node;)V
  13: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #347 (Ljava/lang/Object;)V
      #405 REF_invokeVirtual ext/mods/gameserver/data/xml/SkillTreeData.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
      #352 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #421= #417 of #419; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
