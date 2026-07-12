// Bytecode for: ext.mods.gameserver.model.pledge.Clan
// File: ext\mods\gameserver\model\pledge\Clan.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/pledge/Clan.class
  Last modified 9 de jul de 2026; size 57078 bytes
  MD5 checksum fc662d4501b6b3966bcdc5b138ce0d29
  Compiled from "Clan.java"
public class ext.mods.gameserver.model.pledge.Clan
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/pledge/Clan
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 74, methods: 129, attributes: 3
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Class              #8           // java/util/concurrent/ConcurrentHashMap
     #8 = Utf8               java/util/concurrent/ConcurrentHashMap
     #9 = Methodref          #7.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #10 = Fieldref           #11.#12      // ext/mods/gameserver/model/pledge/Clan._members:Ljava/util/Map;
    #11 = Class              #13          // ext/mods/gameserver/model/pledge/Clan
    #12 = NameAndType        #14:#15      // _members:Ljava/util/Map;
    #13 = Utf8               ext/mods/gameserver/model/pledge/Clan
    #14 = Utf8               _members
    #15 = Utf8               Ljava/util/Map;
    #16 = Fieldref           #11.#17      // ext/mods/gameserver/model/pledge/Clan._warPenaltyExpiryTime:Ljava/util/Map;
    #17 = NameAndType        #18:#15      // _warPenaltyExpiryTime:Ljava/util/Map;
    #18 = Utf8               _warPenaltyExpiryTime
    #19 = Fieldref           #11.#20      // ext/mods/gameserver/model/pledge/Clan._skills:Ljava/util/Map;
    #20 = NameAndType        #21:#15      // _skills:Ljava/util/Map;
    #21 = Utf8               _skills
    #22 = Fieldref           #11.#23      // ext/mods/gameserver/model/pledge/Clan._privileges:Ljava/util/Map;
    #23 = NameAndType        #24:#15      // _privileges:Ljava/util/Map;
    #24 = Utf8               _privileges
    #25 = Fieldref           #11.#26      // ext/mods/gameserver/model/pledge/Clan._subPledges:Ljava/util/Map;
    #26 = NameAndType        #27:#15      // _subPledges:Ljava/util/Map;
    #27 = Utf8               _subPledges
    #28 = Methodref          #7.#29       // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #29 = NameAndType        #30:#31      // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #30 = Utf8               newKeySet
    #31 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #32 = Fieldref           #11.#33      // ext/mods/gameserver/model/pledge/Clan._atWarWith:Ljava/util/Set;
    #33 = NameAndType        #34:#35      // _atWarWith:Ljava/util/Set;
    #34 = Utf8               _atWarWith
    #35 = Utf8               Ljava/util/Set;
    #36 = Fieldref           #11.#37      // ext/mods/gameserver/model/pledge/Clan._atWarAttackers:Ljava/util/Set;
    #37 = NameAndType        #38:#35      // _atWarAttackers:Ljava/util/Set;
    #38 = Utf8               _atWarAttackers
    #39 = Fieldref           #11.#40      // ext/mods/gameserver/model/pledge/Clan._graduates:Ljava/util/Set;
    #40 = NameAndType        #41:#35      // _graduates:Ljava/util/Set;
    #41 = Utf8               _graduates
    #42 = Class              #43          // ext/mods/gameserver/model/itemcontainer/ClanWarehouse
    #43 = Utf8               ext/mods/gameserver/model/itemcontainer/ClanWarehouse
    #44 = Methodref          #42.#45      // ext/mods/gameserver/model/itemcontainer/ClanWarehouse."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
    #45 = NameAndType        #5:#46       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
    #46 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
    #47 = Fieldref           #11.#48      // ext/mods/gameserver/model/pledge/Clan._warehouse:Lext/mods/gameserver/model/itemcontainer/ItemContainer;
    #48 = NameAndType        #49:#50      // _warehouse:Lext/mods/gameserver/model/itemcontainer/ItemContainer;
    #49 = Utf8               _warehouse
    #50 = Utf8               Lext/mods/gameserver/model/itemcontainer/ItemContainer;
    #51 = Fieldref           #11.#52      // ext/mods/gameserver/model/pledge/Clan._clanId:I
    #52 = NameAndType        #53:#54      // _clanId:I
    #53 = Utf8               _clanId
    #54 = Utf8               I
    #55 = Methodref          #56.#57      // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
    #56 = Class              #58          // ext/mods/commons/pool/ConnectionPool
    #57 = NameAndType        #59:#60      // getConnection:()Ljava/sql/Connection;
    #58 = Utf8               ext/mods/commons/pool/ConnectionPool
    #59 = Utf8               getConnection
    #60 = Utf8               ()Ljava/sql/Connection;
    #61 = String             #62          // SELECT char_name,level,classid,obj_Id,title,power_grade,subpledge,apprentice,sponsor,sex,race FROM characters WHERE clanid=?
    #62 = Utf8               SELECT char_name,level,classid,obj_Id,title,power_grade,subpledge,apprentice,sponsor,sex,race FROM characters WHERE clanid=?
    #63 = InterfaceMethodref #64.#65      // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
    #64 = Class              #66          // java/sql/Connection
    #65 = NameAndType        #67:#68      // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
    #66 = Utf8               java/sql/Connection
    #67 = Utf8               prepareStatement
    #68 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
    #69 = InterfaceMethodref #70.#71      // java/sql/PreparedStatement.setInt:(II)V
    #70 = Class              #72          // java/sql/PreparedStatement
    #71 = NameAndType        #73:#74      // setInt:(II)V
    #72 = Utf8               java/sql/PreparedStatement
    #73 = Utf8               setInt
    #74 = Utf8               (II)V
    #75 = InterfaceMethodref #70.#76      // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
    #76 = NameAndType        #77:#78      // executeQuery:()Ljava/sql/ResultSet;
    #77 = Utf8               executeQuery
    #78 = Utf8               ()Ljava/sql/ResultSet;
    #79 = InterfaceMethodref #80.#81      // java/sql/ResultSet.next:()Z
    #80 = Class              #82          // java/sql/ResultSet
    #81 = NameAndType        #83:#84      // next:()Z
    #82 = Utf8               java/sql/ResultSet
    #83 = Utf8               next
    #84 = Utf8               ()Z
    #85 = Class              #86          // ext/mods/gameserver/model/pledge/ClanMember
    #86 = Utf8               ext/mods/gameserver/model/pledge/ClanMember
    #87 = Methodref          #85.#88      // ext/mods/gameserver/model/pledge/ClanMember."<init>":(Lext/mods/gameserver/model/pledge/Clan;Ljava/sql/ResultSet;)V
    #88 = NameAndType        #5:#89       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;Ljava/sql/ResultSet;)V
    #89 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Ljava/sql/ResultSet;)V
    #90 = Methodref          #85.#91      // ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
    #91 = NameAndType        #92:#93      // getObjectId:()I
    #92 = Utf8               getObjectId
    #93 = Utf8               ()I
    #94 = Methodref          #11.#95      // ext/mods/gameserver/model/pledge/Clan.setLeader:(Lext/mods/gameserver/model/pledge/ClanMember;)V
    #95 = NameAndType        #96:#97      // setLeader:(Lext/mods/gameserver/model/pledge/ClanMember;)V
    #96 = Utf8               setLeader
    #97 = Utf8               (Lext/mods/gameserver/model/pledge/ClanMember;)V
    #98 = Methodref          #99.#100     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
    #99 = Class              #101         // java/lang/Integer
   #100 = NameAndType        #102:#103    // valueOf:(I)Ljava/lang/Integer;
   #101 = Utf8               java/lang/Integer
   #102 = Utf8               valueOf
   #103 = Utf8               (I)Ljava/lang/Integer;
   #104 = InterfaceMethodref #105.#106    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #105 = Class              #107         // java/util/Map
   #106 = NameAndType        #108:#109    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #107 = Utf8               java/util/Map
   #108 = Utf8               put
   #109 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #110 = InterfaceMethodref #80.#111     // java/sql/ResultSet.close:()V
   #111 = NameAndType        #112:#6      // close:()V
   #112 = Utf8               close
   #113 = Class              #114         // java/lang/Throwable
   #114 = Utf8               java/lang/Throwable
   #115 = Methodref          #113.#116    // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #116 = NameAndType        #117:#118    // addSuppressed:(Ljava/lang/Throwable;)V
   #117 = Utf8               addSuppressed
   #118 = Utf8               (Ljava/lang/Throwable;)V
   #119 = InterfaceMethodref #70.#111     // java/sql/PreparedStatement.close:()V
   #120 = String             #121         // SELECT sub_pledge_id,name,leader_id FROM clan_subpledges WHERE clan_id=?
   #121 = Utf8               SELECT sub_pledge_id,name,leader_id FROM clan_subpledges WHERE clan_id=?
   #122 = String             #123         // sub_pledge_id
   #123 = Utf8               sub_pledge_id
   #124 = InterfaceMethodref #80.#125     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #125 = NameAndType        #126:#127    // getInt:(Ljava/lang/String;)I
   #126 = Utf8               getInt
   #127 = Utf8               (Ljava/lang/String;)I
   #128 = Class              #129         // ext/mods/gameserver/model/pledge/SubPledge
   #129 = Utf8               ext/mods/gameserver/model/pledge/SubPledge
   #130 = String             #131         // name
   #131 = Utf8               name
   #132 = InterfaceMethodref #80.#133     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #133 = NameAndType        #134:#135    // getString:(Ljava/lang/String;)Ljava/lang/String;
   #134 = Utf8               getString
   #135 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #136 = String             #137         // leader_id
   #137 = Utf8               leader_id
   #138 = Methodref          #128.#139    // ext/mods/gameserver/model/pledge/SubPledge."<init>":(ILjava/lang/String;I)V
   #139 = NameAndType        #5:#140      // "<init>":(ILjava/lang/String;I)V
   #140 = Utf8               (ILjava/lang/String;I)V
   #141 = String             #142         // SELECT ranking,privs FROM clan_privs WHERE clan_id=?
   #142 = Utf8               SELECT ranking,privs FROM clan_privs WHERE clan_id=?
   #143 = String             #144         // ranking
   #144 = Utf8               ranking
   #145 = String             #146         // privs
   #146 = Utf8               privs
   #147 = String             #148         // SELECT skill_id,skill_level FROM clan_skills WHERE clan_id=?
   #148 = Utf8               SELECT skill_id,skill_level FROM clan_skills WHERE clan_id=?
   #149 = String             #150         // skill_id
   #150 = Utf8               skill_id
   #151 = String             #152         // skill_level
   #152 = Utf8               skill_level
   #153 = Methodref          #154.#155    // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #154 = Class              #156         // ext/mods/gameserver/data/SkillTable
   #155 = NameAndType        #157:#158    // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #156 = Utf8               ext/mods/gameserver/data/SkillTable
   #157 = Utf8               getInstance
   #158 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #159 = Methodref          #154.#160    // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #160 = NameAndType        #161:#162    // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #161 = Utf8               getInfo
   #162 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #163 = InterfaceMethodref #64.#111     // java/sql/Connection.close:()V
   #164 = Class              #165         // java/lang/Exception
   #165 = Utf8               java/lang/Exception
   #166 = Fieldref           #11.#167     // ext/mods/gameserver/model/pledge/Clan.LOGGER:Lext/mods/commons/logging/CLogger;
   #167 = NameAndType        #168:#169    // LOGGER:Lext/mods/commons/logging/CLogger;
   #168 = Utf8               LOGGER
   #169 = Utf8               Lext/mods/commons/logging/CLogger;
   #170 = String             #171         // Error while restoring clan.
   #171 = Utf8               Error while restoring clan.
   #172 = Methodref          #173.#174    // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #173 = Class              #175         // ext/mods/commons/logging/CLogger
   #174 = NameAndType        #176:#177    // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #175 = Utf8               ext/mods/commons/logging/CLogger
   #176 = Utf8               error
   #177 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #178 = Fieldref           #11.#179     // ext/mods/gameserver/model/pledge/Clan._crestId:I
   #179 = NameAndType        #180:#54     // _crestId:I
   #180 = Utf8               _crestId
   #181 = Methodref          #182.#183    // ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
   #182 = Class              #184         // ext/mods/gameserver/data/cache/CrestCache
   #183 = NameAndType        #157:#185    // getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
   #184 = Utf8               ext/mods/gameserver/data/cache/CrestCache
   #185 = Utf8               ()Lext/mods/gameserver/data/cache/CrestCache;
   #186 = Fieldref           #187.#188    // ext/mods/gameserver/enums/CrestType.PLEDGE:Lext/mods/gameserver/enums/CrestType;
   #187 = Class              #189         // ext/mods/gameserver/enums/CrestType
   #188 = NameAndType        #190:#191    // PLEDGE:Lext/mods/gameserver/enums/CrestType;
   #189 = Utf8               ext/mods/gameserver/enums/CrestType
   #190 = Utf8               PLEDGE
   #191 = Utf8               Lext/mods/gameserver/enums/CrestType;
   #192 = Methodref          #182.#193    // ext/mods/gameserver/data/cache/CrestCache.getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
   #193 = NameAndType        #194:#195    // getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
   #194 = Utf8               getCrest
   #195 = Utf8               (Lext/mods/gameserver/enums/CrestType;I)[B
   #196 = String             #197         // Removing non-existent crest for clan {}, crestId: {}.
   #197 = Utf8               Removing non-existent crest for clan {}, crestId: {}.
   #198 = Methodref          #11.#199     // ext/mods/gameserver/model/pledge/Clan.toString:()Ljava/lang/String;
   #199 = NameAndType        #200:#201    // toString:()Ljava/lang/String;
   #200 = Utf8               toString
   #201 = Utf8               ()Ljava/lang/String;
   #202 = Methodref          #173.#203    // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #203 = NameAndType        #204:#205    // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #204 = Utf8               warn
   #205 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #206 = Methodref          #11.#207     // ext/mods/gameserver/model/pledge/Clan.changeClanCrest:(I)V
   #207 = NameAndType        #208:#209    // changeClanCrest:(I)V
   #208 = Utf8               changeClanCrest
   #209 = Utf8               (I)V
   #210 = Fieldref           #11.#211     // ext/mods/gameserver/model/pledge/Clan._crestLargeId:I
   #211 = NameAndType        #212:#54     // _crestLargeId:I
   #212 = Utf8               _crestLargeId
   #213 = Fieldref           #187.#214    // ext/mods/gameserver/enums/CrestType.PLEDGE_LARGE:Lext/mods/gameserver/enums/CrestType;
   #214 = NameAndType        #215:#191    // PLEDGE_LARGE:Lext/mods/gameserver/enums/CrestType;
   #215 = Utf8               PLEDGE_LARGE
   #216 = String             #217         // Removing non-existent large crest for clan {}, crestLargeId: {}.
   #217 = Utf8               Removing non-existent large crest for clan {}, crestLargeId: {}.
   #218 = Methodref          #11.#219     // ext/mods/gameserver/model/pledge/Clan.changeLargeCrest:(I)V
   #219 = NameAndType        #220:#209    // changeLargeCrest:(I)V
   #220 = Utf8               changeLargeCrest
   #221 = Fieldref           #11.#222     // ext/mods/gameserver/model/pledge/Clan._allyCrestId:I
   #222 = NameAndType        #223:#54     // _allyCrestId:I
   #223 = Utf8               _allyCrestId
   #224 = Fieldref           #187.#225    // ext/mods/gameserver/enums/CrestType.ALLY:Lext/mods/gameserver/enums/CrestType;
   #225 = NameAndType        #226:#191    // ALLY:Lext/mods/gameserver/enums/CrestType;
   #226 = Utf8               ALLY
   #227 = String             #228         // Removing non-existent ally crest for clan {}, allyCrestId: {}.
   #228 = Utf8               Removing non-existent ally crest for clan {}, allyCrestId: {}.
   #229 = Methodref          #11.#230     // ext/mods/gameserver/model/pledge/Clan.changeAllyCrest:(IZ)V
   #230 = NameAndType        #231:#232    // changeAllyCrest:(IZ)V
   #231 = Utf8               changeAllyCrest
   #232 = Utf8               (IZ)V
   #233 = Methodref          #234.#235    // ext/mods/gameserver/model/itemcontainer/ItemContainer.restore:()V
   #234 = Class              #236         // ext/mods/gameserver/model/itemcontainer/ItemContainer
   #235 = NameAndType        #237:#6      // restore:()V
   #236 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
   #237 = Utf8               restore
   #238 = Fieldref           #11.#239     // ext/mods/gameserver/model/pledge/Clan._name:Ljava/lang/String;
   #239 = NameAndType        #240:#241    // _name:Ljava/lang/String;
   #240 = Utf8               _name
   #241 = Utf8               Ljava/lang/String;
   #242 = String             #243         //
   #243 = Utf8
   #244 = Fieldref           #11.#245     // ext/mods/gameserver/model/pledge/Clan._notice:Ljava/lang/String;
   #245 = NameAndType        #246:#241    // _notice:Ljava/lang/String;
   #246 = Utf8               _notice
   #247 = Fieldref           #11.#248     // ext/mods/gameserver/model/pledge/Clan._introduction:Ljava/lang/String;
   #248 = NameAndType        #249:#241    // _introduction:Ljava/lang/String;
   #249 = Utf8               _introduction
   #250 = Fieldref           #11.#251     // ext/mods/gameserver/model/pledge/Clan._leader:Lext/mods/gameserver/model/pledge/ClanMember;
   #251 = NameAndType        #252:#253    // _leader:Lext/mods/gameserver/model/pledge/ClanMember;
   #252 = Utf8               _leader
   #253 = Utf8               Lext/mods/gameserver/model/pledge/ClanMember;
   #254 = Methodref          #85.#255     // ext/mods/gameserver/model/pledge/ClanMember.getName:()Ljava/lang/String;
   #255 = NameAndType        #256:#201    // getName:()Ljava/lang/String;
   #256 = Utf8               getName
   #257 = Methodref          #85.#258     // ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
   #258 = NameAndType        #259:#260    // getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
   #259 = Utf8               getPlayerInstance
   #260 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #261 = Methodref          #11.#262     // ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
   #262 = NameAndType        #263:#264    // getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
   #263 = Utf8               getLeader
   #264 = Utf8               ()Lext/mods/gameserver/model/pledge/ClanMember;
   #265 = Methodref          #11.#266     // ext/mods/gameserver/model/pledge/Clan.getLeaderId:()I
   #266 = NameAndType        #267:#93     // getLeaderId:()I
   #267 = Utf8               getLeaderId
   #268 = Fieldref           #11.#269     // ext/mods/gameserver/model/pledge/Clan._newLeaderId:I
   #269 = NameAndType        #270:#54     // _newLeaderId:I
   #270 = Utf8               _newLeaderId
   #271 = Methodref          #11.#272     // ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
   #272 = NameAndType        #273:#6      // updateClanInDB:()V
   #273 = Utf8               updateClanInDB
   #274 = Methodref          #275.#276    // ext/mods/gameserver/model/actor/Player.isFlying:()Z
   #275 = Class              #277         // ext/mods/gameserver/model/actor/Player
   #276 = NameAndType        #278:#84     // isFlying:()Z
   #277 = Utf8               ext/mods/gameserver/model/actor/Player
   #278 = Utf8               isFlying
   #279 = Methodref          #275.#280    // ext/mods/gameserver/model/actor/Player.dismount:()V
   #280 = NameAndType        #281:#6      // dismount:()V
   #281 = Utf8               dismount
   #282 = Fieldref           #11.#283     // ext/mods/gameserver/model/pledge/Clan._level:I
   #283 = NameAndType        #284:#54     // _level:I
   #284 = Utf8               _level
   #285 = Fieldref           #286.#287    // ext/mods/Config.MINIMUM_CLAN_LEVEL:I
   #286 = Class              #288         // ext/mods/Config
   #287 = NameAndType        #289:#54     // MINIMUM_CLAN_LEVEL:I
   #288 = Utf8               ext/mods/Config
   #289 = Utf8               MINIMUM_CLAN_LEVEL
   #290 = Methodref          #275.#291    // ext/mods/gameserver/model/actor/Player.removeSiegeSkills:()V
   #291 = NameAndType        #292:#6      // removeSiegeSkills:()V
   #292 = Utf8               removeSiegeSkills
   #293 = Methodref          #275.#294    // ext/mods/gameserver/model/actor/Player.setPowerGrade:(I)V
   #294 = NameAndType        #295:#209    // setPowerGrade:(I)V
   #295 = Utf8               setPowerGrade
   #296 = Methodref          #85.#297     // ext/mods/gameserver/model/pledge/ClanMember.calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
   #297 = NameAndType        #298:#299    // calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
   #298 = Utf8               calculatePledgeClass
   #299 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
   #300 = Methodref          #275.#301    // ext/mods/gameserver/model/actor/Player.setPledgeClass:(I)V
   #301 = NameAndType        #302:#209    // setPledgeClass:(I)V
   #302 = Utf8               setPledgeClass
   #303 = Methodref          #275.#304    // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #304 = NameAndType        #305:#6      // broadcastUserInfo:()V
   #305 = Utf8               broadcastUserInfo
   #306 = Methodref          #275.#307    // ext/mods/gameserver/model/actor/Player.checkItemRestriction:()V
   #307 = NameAndType        #308:#6      // checkItemRestriction:()V
   #308 = Utf8               checkItemRestriction
   #309 = Methodref          #275.#310    // ext/mods/gameserver/model/actor/Player.addSiegeSkills:()V
   #310 = NameAndType        #311:#6      // addSiegeSkills:()V
   #311 = Utf8               addSiegeSkills
   #312 = String             #313         // UPDATE characters SET power_grade=? WHERE obj_Id=?
   #313 = Utf8               UPDATE characters SET power_grade=? WHERE obj_Id=?
   #314 = InterfaceMethodref #70.#315     // java/sql/PreparedStatement.addBatch:()V
   #315 = NameAndType        #316:#6      // addBatch:()V
   #316 = Utf8               addBatch
   #317 = InterfaceMethodref #70.#318     // java/sql/PreparedStatement.executeBatch:()[I
   #318 = NameAndType        #319:#320    // executeBatch:()[I
   #319 = Utf8               executeBatch
   #320 = Utf8               ()[I
   #321 = String             #322         // Couldn\'t update clan privs.
   #322 = Utf8               Couldn\'t update clan privs.
   #323 = Methodref          #11.#324     // ext/mods/gameserver/model/pledge/Clan.broadcastClanStatus:()V
   #324 = NameAndType        #325:#6      // broadcastClanStatus:()V
   #325 = Utf8               broadcastClanStatus
   #326 = Class              #327         // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #327 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #328 = Fieldref           #329.#330    // ext/mods/gameserver/network/SystemMessageId.CLAN_LEADER_PRIVILEGES_HAVE_BEEN_TRANSFERRED_TO_S1:Lext/mods/gameserver/network/SystemMessageId;
   #329 = Class              #331         // ext/mods/gameserver/network/SystemMessageId
   #330 = NameAndType        #332:#333    // CLAN_LEADER_PRIVILEGES_HAVE_BEEN_TRANSFERRED_TO_S1:Lext/mods/gameserver/network/SystemMessageId;
   #331 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #332 = Utf8               CLAN_LEADER_PRIVILEGES_HAVE_BEEN_TRANSFERRED_TO_S1
   #333 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #334 = Methodref          #335.#336    // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #335 = Class              #337         // ext/mods/gameserver/network/serverpackets/SystemMessage
   #336 = NameAndType        #338:#339    // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #337 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #338 = Utf8               getSystemMessage
   #339 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #340 = Methodref          #335.#341    // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #341 = NameAndType        #342:#343    // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #342 = Utf8               addString
   #343 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #344 = Methodref          #11.#345     // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #345 = NameAndType        #346:#347    // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #346 = Utf8               broadcastToMembers
   #347 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #348 = Fieldref           #11.#349     // ext/mods/gameserver/model/pledge/Clan._allyName:Ljava/lang/String;
   #349 = NameAndType        #350:#241    // _allyName:Ljava/lang/String;
   #350 = Utf8               _allyName
   #351 = Fieldref           #11.#352     // ext/mods/gameserver/model/pledge/Clan._allyId:I
   #352 = NameAndType        #353:#54     // _allyId:I
   #353 = Utf8               _allyId
   #354 = Fieldref           #286.#355    // ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
   #355 = NameAndType        #356:#357    // ENABLE_COMMUNITY_BOARD:Z
   #356 = Utf8               ENABLE_COMMUNITY_BOARD
   #357 = Utf8               Z
   #358 = Fieldref           #11.#359     // ext/mods/gameserver/model/pledge/Clan._annBoard:Lext/mods/gameserver/communitybbs/model/Forum;
   #359 = NameAndType        #360:#361    // _annBoard:Lext/mods/gameserver/communitybbs/model/Forum;
   #360 = Utf8               _annBoard
   #361 = Utf8               Lext/mods/gameserver/communitybbs/model/Forum;
   #362 = Methodref          #363.#364    // ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #363 = Class              #365         // ext/mods/gameserver/communitybbs/CommunityBoard
   #364 = NameAndType        #157:#366    // getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #365 = Utf8               ext/mods/gameserver/communitybbs/CommunityBoard
   #366 = Utf8               ()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #367 = Fieldref           #368.#369    // ext/mods/gameserver/enums/bbs/ForumType.CLAN_ANN:Lext/mods/gameserver/enums/bbs/ForumType;
   #368 = Class              #370         // ext/mods/gameserver/enums/bbs/ForumType
   #369 = NameAndType        #371:#372    // CLAN_ANN:Lext/mods/gameserver/enums/bbs/ForumType;
   #370 = Utf8               ext/mods/gameserver/enums/bbs/ForumType
   #371 = Utf8               CLAN_ANN
   #372 = Utf8               Lext/mods/gameserver/enums/bbs/ForumType;
   #373 = Fieldref           #374.#375    // ext/mods/gameserver/enums/bbs/ForumAccess.READ:Lext/mods/gameserver/enums/bbs/ForumAccess;
   #374 = Class              #376         // ext/mods/gameserver/enums/bbs/ForumAccess
   #375 = NameAndType        #377:#378    // READ:Lext/mods/gameserver/enums/bbs/ForumAccess;
   #376 = Utf8               ext/mods/gameserver/enums/bbs/ForumAccess
   #377 = Utf8               READ
   #378 = Utf8               Lext/mods/gameserver/enums/bbs/ForumAccess;
   #379 = Methodref          #363.#380    // ext/mods/gameserver/communitybbs/CommunityBoard.getOrCreateForum:(Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)Lext/mods/gameserver/communitybbs/model/Forum;
   #380 = NameAndType        #381:#382    // getOrCreateForum:(Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)Lext/mods/gameserver/communitybbs/model/Forum;
   #381 = Utf8               getOrCreateForum
   #382 = Utf8               (Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)Lext/mods/gameserver/communitybbs/model/Forum;
   #383 = Fieldref           #11.#384     // ext/mods/gameserver/model/pledge/Clan._cbbBoard:Lext/mods/gameserver/communitybbs/model/Forum;
   #384 = NameAndType        #385:#361    // _cbbBoard:Lext/mods/gameserver/communitybbs/model/Forum;
   #385 = Utf8               _cbbBoard
   #386 = Fieldref           #368.#387    // ext/mods/gameserver/enums/bbs/ForumType.CLAN_CBB:Lext/mods/gameserver/enums/bbs/ForumType;
   #387 = NameAndType        #388:#372    // CLAN_CBB:Lext/mods/gameserver/enums/bbs/ForumType;
   #388 = Utf8               CLAN_CBB
   #389 = Fieldref           #11.#390     // ext/mods/gameserver/model/pledge/Clan._castleId:I
   #390 = NameAndType        #391:#54     // _castleId:I
   #391 = Utf8               _castleId
   #392 = Fieldref           #11.#393     // ext/mods/gameserver/model/pledge/Clan._chId:I
   #393 = NameAndType        #394:#54     // _chId:I
   #394 = Utf8               _chId
   #395 = Fieldref           #11.#396     // ext/mods/gameserver/model/pledge/Clan._siegeKills:I
   #396 = NameAndType        #397:#54     // _siegeKills:I
   #397 = Utf8               _siegeKills
   #398 = Fieldref           #11.#399     // ext/mods/gameserver/model/pledge/Clan._siegeDeaths:I
   #399 = NameAndType        #400:#54     // _siegeDeaths:I
   #400 = Utf8               _siegeDeaths
   #401 = Fieldref           #11.#402     // ext/mods/gameserver/model/pledge/Clan._flag:Lext/mods/gameserver/model/actor/Npc;
   #402 = NameAndType        #403:#404    // _flag:Lext/mods/gameserver/model/actor/Npc;
   #403 = Utf8               _flag
   #404 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #405 = Methodref          #406.#407    // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
   #406 = Class              #408         // ext/mods/gameserver/model/actor/Npc
   #407 = NameAndType        #409:#6      // deleteMe:()V
   #408 = Utf8               ext/mods/gameserver/model/actor/Npc
   #409 = Utf8               deleteMe
   #410 = Fieldref           #11.#411     // ext/mods/gameserver/model/pledge/Clan._allyPenaltyExpiryTime:J
   #411 = NameAndType        #412:#413    // _allyPenaltyExpiryTime:J
   #412 = Utf8               _allyPenaltyExpiryTime
   #413 = Utf8               J
   #414 = Fieldref           #11.#415     // ext/mods/gameserver/model/pledge/Clan._allyPenaltyType:I
   #415 = NameAndType        #416:#54     // _allyPenaltyType:I
   #416 = Utf8               _allyPenaltyType
   #417 = Fieldref           #11.#418     // ext/mods/gameserver/model/pledge/Clan._charPenaltyExpiryTime:J
   #418 = NameAndType        #419:#413    // _charPenaltyExpiryTime:J
   #419 = Utf8               _charPenaltyExpiryTime
   #420 = Fieldref           #11.#421     // ext/mods/gameserver/model/pledge/Clan._dissolvingExpiryTime:J
   #421 = NameAndType        #422:#413    // _dissolvingExpiryTime:J
   #422 = Utf8               _dissolvingExpiryTime
   #423 = InterfaceMethodref #105.#424    // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #424 = NameAndType        #425:#426    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #425 = Utf8               get
   #426 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #427 = InterfaceMethodref #105.#428    // java/util/Map.values:()Ljava/util/Collection;
   #428 = NameAndType        #429:#430    // values:()Ljava/util/Collection;
   #429 = Utf8               values
   #430 = Utf8               ()Ljava/util/Collection;
   #431 = InterfaceMethodref #432.#433    // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #432 = Class              #434         // java/util/Collection
   #433 = NameAndType        #435:#436    // stream:()Ljava/util/stream/Stream;
   #434 = Utf8               java/util/Collection
   #435 = Utf8               stream
   #436 = Utf8               ()Ljava/util/stream/Stream;
   #437 = InvokeDynamic      #0:#438      // #0:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #438 = NameAndType        #439:#440    // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #439 = Utf8               test
   #440 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
   #441 = InterfaceMethodref #442.#443    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #442 = Class              #444         // java/util/stream/Stream
   #443 = NameAndType        #445:#446    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #444 = Utf8               java/util/stream/Stream
   #445 = Utf8               filter
   #446 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #447 = InterfaceMethodref #442.#448    // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #448 = NameAndType        #449:#450    // findFirst:()Ljava/util/Optional;
   #449 = Utf8               findFirst
   #450 = Utf8               ()Ljava/util/Optional;
   #451 = Methodref          #452.#453    // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #452 = Class              #454         // java/util/Optional
   #453 = NameAndType        #455:#426    // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #454 = Utf8               java/util/Optional
   #455 = Utf8               orElse
   #456 = InterfaceMethodref #105.#457    // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #457 = NameAndType        #458:#459    // containsKey:(Ljava/lang/Object;)Z
   #458 = Utf8               containsKey
   #459 = Utf8               (Ljava/lang/Object;)Z
   #460 = Methodref          #85.#461     // ext/mods/gameserver/model/pledge/ClanMember."<init>":(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
   #461 = NameAndType        #5:#462      // "<init>":(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
   #462 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
   #463 = Methodref          #85.#464     // ext/mods/gameserver/model/pledge/ClanMember.setPlayerInstance:(Lext/mods/gameserver/model/actor/Player;)V
   #464 = NameAndType        #465:#466    // setPlayerInstance:(Lext/mods/gameserver/model/actor/Player;)V
   #465 = Utf8               setPlayerInstance
   #466 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #467 = Methodref          #275.#468    // ext/mods/gameserver/model/actor/Player.setClan:(Lext/mods/gameserver/model/pledge/Clan;)V
   #468 = NameAndType        #469:#46     // setClan:(Lext/mods/gameserver/model/pledge/Clan;)V
   #469 = Utf8               setClan
   #470 = Methodref          #471.#472    // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #471 = Class              #473         // ext/mods/gameserver/data/manager/CastleManager
   #472 = NameAndType        #157:#474    // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #473 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #474 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #475 = Methodref          #471.#476    // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
   #476 = NameAndType        #477:#430    // getCastles:()Ljava/util/Collection;
   #477 = Utf8               getCastles
   #478 = InterfaceMethodref #432.#479    // java/util/Collection.iterator:()Ljava/util/Iterator;
   #479 = NameAndType        #480:#481    // iterator:()Ljava/util/Iterator;
   #480 = Utf8               iterator
   #481 = Utf8               ()Ljava/util/Iterator;
   #482 = InterfaceMethodref #483.#484    // java/util/Iterator.hasNext:()Z
   #483 = Class              #485         // java/util/Iterator
   #484 = NameAndType        #486:#84     // hasNext:()Z
   #485 = Utf8               java/util/Iterator
   #486 = Utf8               hasNext
   #487 = InterfaceMethodref #483.#488    // java/util/Iterator.next:()Ljava/lang/Object;
   #488 = NameAndType        #83:#489     // next:()Ljava/lang/Object;
   #489 = Utf8               ()Ljava/lang/Object;
   #490 = Class              #491         // ext/mods/gameserver/model/residence/castle/Castle
   #491 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #492 = Methodref          #490.#493    // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #493 = NameAndType        #494:#495    // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #494 = Utf8               getSiege
   #495 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #496 = Methodref          #497.#498    // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #497 = Class              #499         // ext/mods/gameserver/model/residence/castle/Siege
   #498 = NameAndType        #500:#84     // isInProgress:()Z
   #499 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #500 = Utf8               isInProgress
   #501 = Fieldref           #502.#503    // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #502 = Class              #504         // ext/mods/gameserver/enums/SiegeSide
   #503 = NameAndType        #505:#506    // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #504 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #505 = Utf8               ATTACKER
   #506 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #507 = Methodref          #497.#508    // ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #508 = NameAndType        #509:#510    // checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #509 = Utf8               checkSide
   #510 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #511 = Methodref          #275.#512    // ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
   #512 = NameAndType        #513:#209    // setSiegeState:(I)V
   #513 = Utf8               setSiegeState
   #514 = Fieldref           #502.#515    // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #515 = NameAndType        #516:#506    // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #516 = Utf8               DEFENDER
   #517 = Fieldref           #502.#518    // ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
   #518 = NameAndType        #519:#506    // OWNER:Lext/mods/gameserver/enums/SiegeSide;
   #519 = Utf8               OWNER
   #520 = Methodref          #497.#521    // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #521 = NameAndType        #522:#523    // checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #522 = Utf8               checkSides
   #523 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #524 = Class              #525         // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate
   #525 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate
   #526 = Methodref          #524.#527    // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #527 = NameAndType        #5:#466      // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #528 = Methodref          #275.#529    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #529 = NameAndType        #530:#531    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #530 = Utf8               sendPacket
   #531 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #532 = Class              #533         // ext/mods/gameserver/network/serverpackets/UserInfo
   #533 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
   #534 = Methodref          #532.#527    // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #535 = InterfaceMethodref #105.#536    // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #536 = NameAndType        #537:#426    // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #537 = Utf8               remove
   #538 = Methodref          #11.#539     // ext/mods/gameserver/model/pledge/Clan.getLeaderSubPledge:(I)I
   #539 = NameAndType        #540:#541    // getLeaderSubPledge:(I)I
   #540 = Utf8               getLeaderSubPledge
   #541 = Utf8               (I)I
   #542 = Methodref          #11.#543     // ext/mods/gameserver/model/pledge/Clan.getSubPledge:(I)Lext/mods/gameserver/model/pledge/SubPledge;
   #543 = NameAndType        #544:#545    // getSubPledge:(I)Lext/mods/gameserver/model/pledge/SubPledge;
   #544 = Utf8               getSubPledge
   #545 = Utf8               (I)Lext/mods/gameserver/model/pledge/SubPledge;
   #546 = Methodref          #128.#547    // ext/mods/gameserver/model/pledge/SubPledge.setLeaderId:(I)V
   #547 = NameAndType        #548:#209    // setLeaderId:(I)V
   #548 = Utf8               setLeaderId
   #549 = Methodref          #11.#550     // ext/mods/gameserver/model/pledge/Clan.updateSubPledgeInDB:(Lext/mods/gameserver/model/pledge/SubPledge;)V
   #550 = NameAndType        #551:#552    // updateSubPledgeInDB:(Lext/mods/gameserver/model/pledge/SubPledge;)V
   #551 = Utf8               updateSubPledgeInDB
   #552 = Utf8               (Lext/mods/gameserver/model/pledge/SubPledge;)V
   #553 = Methodref          #85.#554     // ext/mods/gameserver/model/pledge/ClanMember.getApprentice:()I
   #554 = NameAndType        #555:#93     // getApprentice:()I
   #555 = Utf8               getApprentice
   #556 = Methodref          #11.#557     // ext/mods/gameserver/model/pledge/Clan.getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
   #557 = NameAndType        #558:#559    // getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
   #558 = Utf8               getClanMember
   #559 = Utf8               (I)Lext/mods/gameserver/model/pledge/ClanMember;
   #560 = Methodref          #275.#561    // ext/mods/gameserver/model/actor/Player.setSponsor:(I)V
   #561 = NameAndType        #562:#209    // setSponsor:(I)V
   #562 = Utf8               setSponsor
   #563 = Methodref          #85.#564     // ext/mods/gameserver/model/pledge/ClanMember.setApprenticeAndSponsor:(II)V
   #564 = NameAndType        #565:#74     // setApprenticeAndSponsor:(II)V
   #565 = Utf8               setApprenticeAndSponsor
   #566 = Methodref          #85.#567     // ext/mods/gameserver/model/pledge/ClanMember.saveApprenticeAndSponsor:(II)V
   #567 = NameAndType        #568:#74     // saveApprenticeAndSponsor:(II)V
   #568 = Utf8               saveApprenticeAndSponsor
   #569 = Methodref          #85.#570     // ext/mods/gameserver/model/pledge/ClanMember.getSponsor:()I
   #570 = NameAndType        #571:#93     // getSponsor:()I
   #571 = Utf8               getSponsor
   #572 = Methodref          #275.#573    // ext/mods/gameserver/model/actor/Player.setApprentice:(I)V
   #573 = NameAndType        #574:#209    // setApprentice:(I)V
   #574 = Utf8               setApprentice
   #575 = Methodref          #11.#576     // ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
   #576 = NameAndType        #577:#84     // hasCastle:()Z
   #577 = Utf8               hasCastle
   #578 = Methodref          #471.#579    // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #579 = NameAndType        #580:#581    // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #580 = Utf8               getCastleById
   #581 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
   #582 = Methodref          #490.#583    // ext/mods/gameserver/model/residence/castle/Castle.checkItemsForMember:(Lext/mods/gameserver/model/pledge/ClanMember;)V
   #583 = NameAndType        #584:#97     // checkItemsForMember:(Lext/mods/gameserver/model/pledge/ClanMember;)V
   #584 = Utf8               checkItemsForMember
   #585 = Methodref          #85.#586     // ext/mods/gameserver/model/pledge/ClanMember.isOnline:()Z
   #586 = NameAndType        #587:#84     // isOnline:()Z
   #587 = Utf8               isOnline
   #588 = Methodref          #275.#589    // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #589 = NameAndType        #590:#84     // isClanLeader:()Z
   #590 = Utf8               isClanLeader
   #591 = Methodref          #490.#592    // ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
   #592 = NameAndType        #593:#594    // getSkillsLeader:()Ljava/util/Map;
   #593 = Utf8               getSkillsLeader
   #594 = Utf8               ()Ljava/util/Map;
   #595 = Methodref          #490.#596    // ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
   #596 = NameAndType        #597:#594    // getSkillsMember:()Ljava/util/Map;
   #597 = Utf8               getSkillsMember
   #598 = InvokeDynamic      #1:#599      // #1:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #599 = NameAndType        #600:#601    // accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #600 = Utf8               accept
   #601 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #602 = InterfaceMethodref #105.#603    // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
   #603 = NameAndType        #604:#605    // forEach:(Ljava/util/function/BiConsumer;)V
   #604 = Utf8               forEach
   #605 = Utf8               (Ljava/util/function/BiConsumer;)V
   #606 = Methodref          #275.#607    // ext/mods/gameserver/model/actor/Player.isNoble:()Z
   #607 = NameAndType        #608:#84     // isNoble:()Z
   #608 = Utf8               isNoble
   #609 = Methodref          #275.#610    // ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
   #610 = NameAndType        #611:#612    // setTitle:(Ljava/lang/String;)V
   #611 = Utf8               setTitle
   #612 = Utf8               (Ljava/lang/String;)V
   #613 = Methodref          #275.#614    // ext/mods/gameserver/model/actor/Player.getActiveWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
   #614 = NameAndType        #615:#616    // getActiveWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
   #615 = Utf8               getActiveWarehouse
   #616 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
   #617 = Methodref          #275.#618    // ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
   #618 = NameAndType        #619:#620    // setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
   #619 = Utf8               setActiveWarehouse
   #620 = Utf8               (Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
   #621 = Methodref          #622.#623    // java/lang/System.currentTimeMillis:()J
   #622 = Class              #624         // java/lang/System
   #623 = NameAndType        #625:#626    // currentTimeMillis:()J
   #624 = Utf8               java/lang/System
   #625 = Utf8               currentTimeMillis
   #626 = Utf8               ()J
   #627 = Fieldref           #286.#628    // ext/mods/Config.CLAN_CREATE_DAYS:I
   #628 = NameAndType        #629:#54     // CLAN_CREATE_DAYS:I
   #629 = Utf8               CLAN_CREATE_DAYS
   #630 = Long               86400000l
   #632 = Methodref          #275.#633    // ext/mods/gameserver/model/actor/Player.setClanCreateExpiryTime:(J)V
   #633 = NameAndType        #634:#635    // setClanCreateExpiryTime:(J)V
   #634 = Utf8               setClanCreateExpiryTime
   #635 = Utf8               (J)V
   #636 = Class              #637         // ext/mods/gameserver/skills/L2Skill
   #637 = Utf8               ext/mods/gameserver/skills/L2Skill
   #638 = Methodref          #636.#639    // ext/mods/gameserver/skills/L2Skill.getId:()I
   #639 = NameAndType        #640:#93     // getId:()I
   #640 = Utf8               getId
   #641 = Methodref          #275.#642    // ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
   #642 = NameAndType        #643:#644    // removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
   #643 = Utf8               removeSkill
   #644 = Utf8               (IZ)Lext/mods/gameserver/skills/L2Skill;
   #645 = Class              #646         // ext/mods/gameserver/network/serverpackets/SkillList
   #646 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
   #647 = Methodref          #645.#527    // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #648 = Methodref          #85.#649     // ext/mods/gameserver/model/pledge/ClanMember.getPledgeType:()I
   #649 = NameAndType        #650:#93     // getPledgeType:()I
   #650 = Utf8               getPledgeType
   #651 = Methodref          #275.#652    // ext/mods/gameserver/model/actor/Player.setClanJoinExpiryTime:(J)V
   #652 = NameAndType        #653:#635    // setClanJoinExpiryTime:(J)V
   #653 = Utf8               setClanJoinExpiryTime
   #654 = Fieldref           #655.#656    // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListDeleteAll.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PledgeShowMemberListDeleteAll;
   #655 = Class              #657         // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListDeleteAll
   #656 = NameAndType        #658:#659    // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PledgeShowMemberListDeleteAll;
   #657 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowMemberListDeleteAll
   #658 = Utf8               STATIC_PACKET
   #659 = Utf8               Lext/mods/gameserver/network/serverpackets/PledgeShowMemberListDeleteAll;
   #660 = String             #661         // UPDATE characters SET clanid=0, title=?, clan_join_expiry_time=?, clan_create_expiry_time=?, wantspeace=0, subpledge=0, lvl_joined_academy=0, apprentice=0, sponsor=0 WHERE obj_Id=?
   #661 = Utf8               UPDATE characters SET clanid=0, title=?, clan_join_expiry_time=?, clan_create_expiry_time=?, wantspeace=0, subpledge=0, lvl_joined_academy=0, apprentice=0, sponsor=0 WHERE obj_Id=?
   #662 = InterfaceMethodref #70.#663     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
   #663 = NameAndType        #664:#665    // setString:(ILjava/lang/String;)V
   #664 = Utf8               setString
   #665 = Utf8               (ILjava/lang/String;)V
   #666 = InterfaceMethodref #70.#667     // java/sql/PreparedStatement.setLong:(IJ)V
   #667 = NameAndType        #668:#669    // setLong:(IJ)V
   #668 = Utf8               setLong
   #669 = Utf8               (IJ)V
   #670 = InterfaceMethodref #70.#671     // java/sql/PreparedStatement.executeUpdate:()I
   #671 = NameAndType        #672:#93     // executeUpdate:()I
   #672 = Utf8               executeUpdate
   #673 = String             #674         // UPDATE characters SET apprentice=0 WHERE apprentice=?
   #674 = Utf8               UPDATE characters SET apprentice=0 WHERE apprentice=?
   #675 = String             #676         // UPDATE characters SET sponsor=0 WHERE sponsor=?
   #676 = Utf8               UPDATE characters SET sponsor=0 WHERE sponsor=?
   #677 = String             #678         // Error while removing clan member.
   #678 = Utf8               Error while removing clan member.
   #679 = InterfaceMethodref #105.#680    // java/util/Map.size:()I
   #680 = NameAndType        #681:#93     // size:()I
   #681 = Utf8               size
   #682 = InvokeDynamic      #2:#683      // #2:test:(I)Ljava/util/function/Predicate;
   #683 = NameAndType        #439:#684    // test:(I)Ljava/util/function/Predicate;
   #684 = Utf8               (I)Ljava/util/function/Predicate;
   #685 = InterfaceMethodref #442.#686    // java/util/stream/Stream.count:()J
   #686 = NameAndType        #687:#626    // count:()J
   #687 = Utf8               count
   #688 = Methodref          #128.#266    // ext/mods/gameserver/model/pledge/SubPledge.getLeaderId:()I
   #689 = Methodref          #128.#639    // ext/mods/gameserver/model/pledge/SubPledge.getId:()I
   #690 = String             #691         // SubPledge leader {} is missing from clan: {}.
   #691 = Utf8               SubPledge leader {} is missing from clan: {}.
   #692 = Class              #693         // java/util/ArrayList
   #693 = Utf8               java/util/ArrayList
   #694 = Methodref          #692.#3      // java/util/ArrayList."<init>":()V
   #695 = InterfaceMethodref #696.#697    // java/util/List.add:(Ljava/lang/Object;)Z
   #696 = Class              #698         // java/util/List
   #697 = NameAndType        #699:#459    // add:(Ljava/lang/Object;)Z
   #698 = Utf8               java/util/List
   #699 = Utf8               add
   #700 = InterfaceMethodref #696.#680    // java/util/List.size:()I
   #701 = InterfaceMethodref #696.#702    // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #702 = NameAndType        #703:#704    // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #703 = Utf8               toArray
   #704 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #705 = Class              #706         // "[Lext/mods/gameserver/model/actor/Player;"
   #706 = Utf8               [Lext/mods/gameserver/model/actor/Player;
   #707 = InvokeDynamic      #3:#708      // #3:test:()Ljava/util/function/Predicate;
   #708 = NameAndType        #439:#709    // test:()Ljava/util/function/Predicate;
   #709 = Utf8               ()Ljava/util/function/Predicate;
   #710 = String             #711         // UPDATE clan_data SET leader_id=?,new_leader_id=?,ally_id=?,ally_name=?,reputation_score=?,ally_penalty_expiry_time=?,ally_penalty_type=?,char_penalty_expiry_time=?,dissolving_expiry_time=? WHERE clan_id=?
   #711 = Utf8               UPDATE clan_data SET leader_id=?,new_leader_id=?,ally_id=?,ally_name=?,reputation_score=?,ally_penalty_expiry_time=?,ally_penalty_type=?,char_penalty_expiry_time=?,dissolving_expiry_time=? WHERE clan_id=?
   #712 = Fieldref           #11.#713     // ext/mods/gameserver/model/pledge/Clan._reputationScore:I
   #713 = NameAndType        #714:#54     // _reputationScore:I
   #714 = Utf8               _reputationScore
   #715 = String             #716         // Error while updating clan.
   #716 = Utf8               Error while updating clan.
   #717 = String             #718         // INSERT INTO clan_data (clan_id,clan_name,clan_level,hasCastle,ally_id,ally_name,leader_id,new_leader_id,crest_id,crest_large_id,ally_crest_id) VALUES (?,?,?,?,?,?,?,?,?,?,?)
   #718 = Utf8               INSERT INTO clan_data (clan_id,clan_name,clan_level,hasCastle,ally_id,ally_name,leader_id,new_leader_id,crest_id,crest_large_id,ally_crest_id) VALUES (?,?,?,?,?,?,?,?,?,?,?)
   #719 = String             #720         // Error while storing clan.
   #720 = Utf8               Error while storing clan.
   #721 = Fieldref           #11.#722     // ext/mods/gameserver/model/pledge/Clan._noticeEnabled:Z
   #722 = NameAndType        #723:#357    // _noticeEnabled:Z
   #723 = Utf8               _noticeEnabled
   #724 = Methodref          #725.#726    // ext/mods/commons/lang/StringUtil.trim:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #725 = Class              #727         // ext/mods/commons/lang/StringUtil
   #726 = NameAndType        #728:#729    // trim:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #727 = Utf8               ext/mods/commons/lang/StringUtil
   #728 = Utf8               trim
   #729 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #730 = String             #731         // UPDATE clan_data SET enabled=?,notice=? WHERE clan_id=?
   #731 = Utf8               UPDATE clan_data SET enabled=?,notice=? WHERE clan_id=?
   #732 = InterfaceMethodref #70.#733     // java/sql/PreparedStatement.setBoolean:(IZ)V
   #733 = NameAndType        #734:#232    // setBoolean:(IZ)V
   #734 = Utf8               setBoolean
   #735 = String             #736         // Error while storing notice.
   #736 = Utf8               Error while storing notice.
   #737 = Methodref          #11.#738     // ext/mods/gameserver/model/pledge/Clan.setNotice:(Ljava/lang/String;ZZ)V
   #738 = NameAndType        #739:#740    // setNotice:(Ljava/lang/String;ZZ)V
   #739 = Utf8               setNotice
   #740 = Utf8               (Ljava/lang/String;ZZ)V
   #741 = String             #742         // UPDATE clan_data SET introduction=? WHERE clan_id=?
   #742 = Utf8               UPDATE clan_data SET introduction=? WHERE clan_id=?
   #743 = String             #744         // Error while storing introduction.
   #744 = Utf8               Error while storing introduction.
   #745 = Methodref          #636.#746    // ext/mods/gameserver/skills/L2Skill.getLevel:()I
   #746 = NameAndType        #747:#93     // getLevel:()I
   #747 = Utf8               getLevel
   #748 = String             #749         // INSERT INTO clan_skills (clan_id,skill_id,skill_level) VALUES (?,?,?) ON DUPLICATE KEY UPDATE skill_level=VALUES(skill_level)
   #749 = Utf8               INSERT INTO clan_skills (clan_id,skill_id,skill_level) VALUES (?,?,?) ON DUPLICATE KEY UPDATE skill_level=VALUES(skill_level)
   #750 = String             #751         // Error while storing a clan skill.
   #751 = Utf8               Error while storing a clan skill.
   #752 = Class              #753         // ext/mods/gameserver/network/serverpackets/PledgeSkillListAdd
   #753 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeSkillListAdd
   #754 = Methodref          #752.#755    // ext/mods/gameserver/network/serverpackets/PledgeSkillListAdd."<init>":(Lext/mods/gameserver/skills/L2Skill;)V
   #755 = NameAndType        #5:#756      // "<init>":(Lext/mods/gameserver/skills/L2Skill;)V
   #756 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)V
   #757 = Fieldref           #329.#758    // ext/mods/gameserver/network/SystemMessageId.CLAN_SKILL_S1_ADDED:Lext/mods/gameserver/network/SystemMessageId;
   #758 = NameAndType        #759:#333    // CLAN_SKILL_S1_ADDED:Lext/mods/gameserver/network/SystemMessageId;
   #759 = Utf8               CLAN_SKILL_S1_ADDED
   #760 = Methodref          #335.#761    // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #761 = NameAndType        #762:#763    // addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #762 = Utf8               addSkillName
   #763 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #764 = Methodref          #11.#765     // ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
   #765 = NameAndType        #766:#767    // getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
   #766 = Utf8               getOnlineMembers
   #767 = Utf8               ()[Lext/mods/gameserver/model/actor/Player;
   #768 = Methodref          #11.#769     // ext/mods/gameserver/model/pledge/Clan.checkAndAddClanSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
   #769 = NameAndType        #770:#771    // checkAndAddClanSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
   #770 = Utf8               checkAndAddClanSkill
   #771 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
   #772 = Methodref          #275.#773    // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #773 = NameAndType        #774:#775    // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #774 = Utf8               addSkill
   #775 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
   #776 = String             #777         // DELETE FROM clan_skills WHERE clan_id=? AND skill_id=?
   #777 = Utf8               DELETE FROM clan_skills WHERE clan_id=? AND skill_id=?
   #778 = String             #779         // Error while removing a clan skill.
   #779 = Utf8               Error while removing a clan skill.
   #780 = Class              #781         // ext/mods/gameserver/network/serverpackets/PledgeSkillList
   #781 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeSkillList
   #782 = Methodref          #780.#45     // ext/mods/gameserver/network/serverpackets/PledgeSkillList."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
   #783 = Methodref          #154.#784    // ext/mods/gameserver/data/SkillTable.getClanSkills:()[Lext/mods/gameserver/skills/L2Skill;
   #784 = NameAndType        #785:#786    // getClanSkills:()[Lext/mods/gameserver/skills/L2Skill;
   #785 = Utf8               getClanSkills
   #786 = Utf8               ()[Lext/mods/gameserver/skills/L2Skill;
   #787 = Methodref          #788.#789    // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #788 = Class              #790         // java/util/Arrays
   #789 = NameAndType        #435:#791    // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #790 = Utf8               java/util/Arrays
   #791 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #792 = InvokeDynamic      #4:#793      // #4:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
   #793 = NameAndType        #439:#794    // test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
   #794 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
   #795 = InterfaceMethodref #442.#796    // java/util/stream/Stream.toList:()Ljava/util/List;
   #796 = NameAndType        #797:#798    // toList:()Ljava/util/List;
   #797 = Utf8               toList
   #798 = Utf8               ()Ljava/util/List;
   #799 = InterfaceMethodref #696.#800    // java/util/List.isEmpty:()Z
   #800 = NameAndType        #801:#84     // isEmpty:()Z
   #801 = Utf8               isEmpty
   #802 = InterfaceMethodref #696.#479    // java/util/List.iterator:()Ljava/util/Iterator;
   #803 = String             #804         // Error while adding all clan skills.
   #804 = Utf8               Error while adding all clan skills.
   #805 = Methodref          #11.#806     // ext/mods/gameserver/model/pledge/Clan.checkAndAddClanSkills:(Lext/mods/gameserver/model/actor/Player;)Z
   #806 = NameAndType        #807:#808    // checkAndAddClanSkills:(Lext/mods/gameserver/model/actor/Player;)Z
   #807 = Utf8               checkAndAddClanSkills
   #808 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #809 = InterfaceMethodref #105.#800    // java/util/Map.isEmpty:()Z
   #810 = String             #811         // DELETE FROM clan_skills WHERE clan_id=?
   #811 = Utf8               DELETE FROM clan_skills WHERE clan_id=?
   #812 = String             #813         // Error while removing all clan skills.
   #813 = Utf8               Error while removing all clan skills.
   #814 = InterfaceMethodref #105.#815    // java/util/Map.clear:()V
   #815 = NameAndType        #816:#6      // clear:()V
   #816 = Utf8               clear
   #817 = Methodref          #275.#818    // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #818 = NameAndType        #819:#84     // isInOlympiadMode:()Z
   #819 = Utf8               isInOlympiadMode
   #820 = Methodref          #636.#821    // ext/mods/gameserver/skills/L2Skill.getMinPledgeClass:()I
   #821 = NameAndType        #822:#93     // getMinPledgeClass:()I
   #822 = Utf8               getMinPledgeClass
   #823 = Methodref          #275.#824    // ext/mods/gameserver/model/actor/Player.getPledgeClass:()I
   #824 = NameAndType        #825:#93     // getPledgeClass:()I
   #825 = Utf8               getPledgeClass
   #826 = Methodref          #827.#828    // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #827 = Class              #829         // ext/mods/gameserver/data/sql/ClanTable
   #828 = NameAndType        #157:#830    // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #829 = Utf8               ext/mods/gameserver/data/sql/ClanTable
   #830 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
   #831 = Methodref          #827.#832    // ext/mods/gameserver/data/sql/ClanTable.getClanAllies:(I)Ljava/util/List;
   #832 = NameAndType        #833:#834    // getClanAllies:(I)Ljava/util/List;
   #833 = Utf8               getClanAllies
   #834 = Utf8               (I)Ljava/util/List;
   #835 = InvokeDynamic      #5:#836      // #5:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #836 = NameAndType        #837:#838    // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #837 = Utf8               makeConcatWithConstants
   #838 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #839 = InterfaceMethodref #840.#841    // java/util/Set.contains:(Ljava/lang/Object;)Z
   #840 = Class              #842         // java/util/Set
   #841 = NameAndType        #843:#459    // contains:(Ljava/lang/Object;)Z
   #842 = Utf8               java/util/Set
   #843 = Utf8               contains
   #844 = InterfaceMethodref #840.#697    // java/util/Set.add:(Ljava/lang/Object;)Z
   #845 = InterfaceMethodref #840.#846    // java/util/Set.remove:(Ljava/lang/Object;)Z
   #846 = NameAndType        #537:#459    // remove:(Ljava/lang/Object;)Z
   #847 = Methodref          #848.#849    // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #848 = Class              #850         // java/lang/Long
   #849 = NameAndType        #102:#851    // valueOf:(J)Ljava/lang/Long;
   #850 = Utf8               java/lang/Long
   #851 = Utf8               (J)Ljava/lang/Long;
   #852 = Methodref          #848.#853    // java/lang/Long.longValue:()J
   #853 = NameAndType        #854:#626    // longValue:()J
   #854 = Utf8               longValue
   #855 = InterfaceMethodref #840.#800    // java/util/Set.isEmpty:()Z
   #856 = InterfaceMethodref #840.#433    // java/util/Set.stream:()Ljava/util/stream/Stream;
   #857 = InvokeDynamic      #6:#858      // #6:apply:()Ljava/util/function/Function;
   #858 = NameAndType        #859:#860    // apply:()Ljava/util/function/Function;
   #859 = Utf8               apply
   #860 = Utf8               ()Ljava/util/function/Function;
   #861 = InterfaceMethodref #442.#862    // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #862 = NameAndType        #863:#864    // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #863 = Utf8               map
   #864 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #865 = String             #866         // ;
   #866 = Utf8               ;
   #867 = Methodref          #868.#869    // java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #868 = Class              #870         // java/util/stream/Collectors
   #869 = NameAndType        #871:#872    // joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #870 = Utf8               java/util/stream/Collectors
   #871 = Utf8               joining
   #872 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #873 = InterfaceMethodref #442.#874    // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #874 = NameAndType        #875:#876    // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #875 = Utf8               collect
   #876 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #877 = Class              #878         // java/lang/String
   #878 = Utf8               java/lang/String
   #879 = String             #880         // UPDATE clan_data SET graduates=? WHERE clan_id=?
   #880 = Utf8               UPDATE clan_data SET graduates=? WHERE clan_id=?
   #881 = String             #882         // Error while storing graduates.
   #882 = Utf8               Error while storing graduates.
   #883 = Methodref          #877.#884    // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #884 = NameAndType        #885:#886    // split:(Ljava/lang/String;)[Ljava/lang/String;
   #885 = Utf8               split
   #886 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #887 = Methodref          #877.#888    // java/lang/String.trim:()Ljava/lang/String;
   #888 = NameAndType        #728:#201    // trim:()Ljava/lang/String;
   #889 = Methodref          #99.#890     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #890 = NameAndType        #891:#127    // parseInt:(Ljava/lang/String;)I
   #891 = Utf8               parseInt
   #892 = Class              #893         // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
   #893 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
   #894 = Methodref          #892.#895    // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
   #895 = NameAndType        #5:#896      // "<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
   #896 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;I)V
   #897 = Methodref          #11.#898     // ext/mods/gameserver/model/pledge/Clan.getAllSubPledges:()[Lext/mods/gameserver/model/pledge/SubPledge;
   #898 = NameAndType        #899:#900    // getAllSubPledges:()[Lext/mods/gameserver/model/pledge/SubPledge;
   #899 = Utf8               getAllSubPledges
   #900 = Utf8               ()[Lext/mods/gameserver/model/pledge/SubPledge;
   #901 = InvokeDynamic      #7:#438      // #7:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #902 = InterfaceMethodref #432.#680    // java/util/Collection.size:()I
   #903 = InterfaceMethodref #432.#702    // java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #904 = Class              #905         // "[Lext/mods/gameserver/model/pledge/SubPledge;"
   #905 = Utf8               [Lext/mods/gameserver/model/pledge/SubPledge;
   #906 = Methodref          #11.#907     // ext/mods/gameserver/model/pledge/Clan.getAvailablePledgeTypes:(I)I
   #907 = NameAndType        #908:#541    // getAvailablePledgeTypes:(I)I
   #908 = Utf8               getAvailablePledgeTypes
   #909 = Fieldref           #329.#910    // ext/mods/gameserver/network/SystemMessageId.CLAN_HAS_ALREADY_ESTABLISHED_A_CLAN_ACADEMY:Lext/mods/gameserver/network/SystemMessageId;
   #910 = NameAndType        #911:#333    // CLAN_HAS_ALREADY_ESTABLISHED_A_CLAN_ACADEMY:Lext/mods/gameserver/network/SystemMessageId;
   #911 = Utf8               CLAN_HAS_ALREADY_ESTABLISHED_A_CLAN_ACADEMY
   #912 = Fieldref           #329.#913    // ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_MILITARY_UNIT:Lext/mods/gameserver/network/SystemMessageId;
   #913 = NameAndType        #914:#333    // YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_MILITARY_UNIT:Lext/mods/gameserver/network/SystemMessageId;
   #914 = Utf8               YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_MILITARY_UNIT
   #915 = Methodref          #275.#916    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #916 = NameAndType        #530:#917    // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #917 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #918 = Fieldref           #329.#919    // ext/mods/gameserver/network/SystemMessageId.THE_CLAN_REPUTATION_SCORE_IS_TOO_LOW:Lext/mods/gameserver/network/SystemMessageId;
   #919 = NameAndType        #920:#333    // THE_CLAN_REPUTATION_SCORE_IS_TOO_LOW:Lext/mods/gameserver/network/SystemMessageId;
   #920 = Utf8               THE_CLAN_REPUTATION_SCORE_IS_TOO_LOW
   #921 = String             #922         // INSERT INTO clan_subpledges (clan_id,sub_pledge_id,name,leader_id) values (?,?,?,?)
   #922 = Utf8               INSERT INTO clan_subpledges (clan_id,sub_pledge_id,name,leader_id) values (?,?,?,?)
   #923 = String             #924         // Error creating subpledge.
   #924 = Utf8               Error creating subpledge.
   #925 = Methodref          #11.#926     // ext/mods/gameserver/model/pledge/Clan.takeReputationScore:(I)Z
   #926 = NameAndType        #927:#928    // takeReputationScore:(I)Z
   #927 = Utf8               takeReputationScore
   #928 = Utf8               (I)Z
   #929 = Class              #930         // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
   #930 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
   #931 = Methodref          #929.#45     // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
   #932 = Class              #933         // ext/mods/gameserver/network/serverpackets/PledgeReceiveSubPledgeCreated
   #933 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeReceiveSubPledgeCreated
   #934 = Methodref          #932.#935    // ext/mods/gameserver/network/serverpackets/PledgeReceiveSubPledgeCreated."<init>":(Lext/mods/gameserver/model/pledge/SubPledge;Lext/mods/gameserver/model/pledge/Clan;)V
   #935 = NameAndType        #5:#936      // "<init>":(Lext/mods/gameserver/model/pledge/SubPledge;Lext/mods/gameserver/model/pledge/Clan;)V
   #936 = Utf8               (Lext/mods/gameserver/model/pledge/SubPledge;Lext/mods/gameserver/model/pledge/Clan;)V
   #937 = String             #938         // UPDATE clan_subpledges SET leader_id=?, name=? WHERE clan_id=? AND sub_pledge_id=?
   #938 = Utf8               UPDATE clan_subpledges SET leader_id=?, name=? WHERE clan_id=? AND sub_pledge_id=?
   #939 = Methodref          #128.#255    // ext/mods/gameserver/model/pledge/SubPledge.getName:()Ljava/lang/String;
   #940 = String             #941         // Error updating subpledge.
   #941 = Utf8               Error updating subpledge.
   #942 = Fieldref           #943.#944    // ext/mods/gameserver/enums/PrivilegeType.NONE:Lext/mods/gameserver/enums/PrivilegeType;
   #943 = Class              #945         // ext/mods/gameserver/enums/PrivilegeType
   #944 = NameAndType        #946:#947    // NONE:Lext/mods/gameserver/enums/PrivilegeType;
   #945 = Utf8               ext/mods/gameserver/enums/PrivilegeType
   #946 = Utf8               NONE
   #947 = Utf8               Lext/mods/gameserver/enums/PrivilegeType;
   #948 = Methodref          #943.#949    // ext/mods/gameserver/enums/PrivilegeType.getMask:()I
   #949 = NameAndType        #950:#93     // getMask:()I
   #950 = Utf8               getMask
   #951 = InterfaceMethodref #105.#952    // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #952 = NameAndType        #953:#109    // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #953 = Utf8               getOrDefault
   #954 = Methodref          #99.#955     // java/lang/Integer.intValue:()I
   #955 = NameAndType        #956:#93     // intValue:()I
   #956 = Utf8               intValue
   #957 = Fieldref           #943.#958    // ext/mods/gameserver/enums/PrivilegeType.SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
   #958 = NameAndType        #959:#947    // SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
   #959 = Utf8               SP_WAREHOUSE_SEARCH
   #960 = Fieldref           #943.#961    // ext/mods/gameserver/enums/PrivilegeType.CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #961 = NameAndType        #962:#947    // CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #962 = Utf8               CHP_ENTRY_EXIT_RIGHTS
   #963 = Fieldref           #943.#964    // ext/mods/gameserver/enums/PrivilegeType.CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #964 = NameAndType        #965:#947    // CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #965 = Utf8               CHP_USE_FUNCTIONS
   #966 = Fieldref           #943.#967    // ext/mods/gameserver/enums/PrivilegeType.CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #967 = NameAndType        #968:#947    // CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #968 = Utf8               CP_ENTRY_EXIT_RIGHTS
   #969 = Fieldref           #943.#970    // ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #970 = NameAndType        #971:#947    // CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #971 = Utf8               CP_USE_FUNCTIONS
   #972 = String             #973         // INSERT INTO clan_privs (clan_id,ranking,privs) VALUES (?,?,?) ON DUPLICATE KEY UPDATE privs=VALUES(privs)
   #973 = Utf8               INSERT INTO clan_privs (clan_id,ranking,privs) VALUES (?,?,?) ON DUPLICATE KEY UPDATE privs=VALUES(privs)
   #974 = String             #975         // Error while storing ranking.
   #975 = Utf8               Error while storing ranking.
   #976 = Methodref          #11.#977     // ext/mods/gameserver/model/pledge/Clan.setReputationScore:(I)Z
   #977 = NameAndType        #978:#928    // setReputationScore:(I)Z
   #978 = Utf8               setReputationScore
   #979 = Integer            -100000000
   #980 = Integer            100000000
   #981 = Methodref          #982.#983    // java/lang/Math.clamp:(JII)I
   #982 = Class              #984         // java/lang/Math
   #983 = NameAndType        #985:#986    // clamp:(JII)I
   #984 = Utf8               java/lang/Math
   #985 = Utf8               clamp
   #986 = Utf8               (JII)I
   #987 = Fieldref           #329.#988    // ext/mods/gameserver/network/SystemMessageId.REPUTATION_POINTS_0_OR_LOWER_CLAN_SKILLS_DEACTIVATED:Lext/mods/gameserver/network/SystemMessageId;
   #988 = NameAndType        #989:#333    // REPUTATION_POINTS_0_OR_LOWER_CLAN_SKILLS_DEACTIVATED:Lext/mods/gameserver/network/SystemMessageId;
   #989 = Utf8               REPUTATION_POINTS_0_OR_LOWER_CLAN_SKILLS_DEACTIVATED
   #990 = Fieldref           #329.#991    // ext/mods/gameserver/network/SystemMessageId.CLAN_SKILLS_WILL_BE_ACTIVATED_SINCE_REPUTATION_IS_0_OR_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
   #991 = NameAndType        #992:#333    // CLAN_SKILLS_WILL_BE_ACTIVATED_SINCE_REPUTATION_IS_0_OR_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
   #992 = Utf8               CLAN_SKILLS_WILL_BE_ACTIVATED_SINCE_REPUTATION_IS_0_OR_HIGHER
   #993 = Methodref          #275.#994    // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Z)V
   #994 = NameAndType        #995:#996    // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Z)V
   #995 = Utf8               broadcastPacket
   #996 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Z)V
   #997 = String             #998         // UPDATE clan_data SET reputation_score=? WHERE clan_id=?
   #998 = Utf8               UPDATE clan_data SET reputation_score=? WHERE clan_id=?
   #999 = String             #1000        // Error while updating clan reputation points.
  #1000 = Utf8               Error while updating clan reputation points.
  #1001 = Fieldref           #11.#1002    // ext/mods/gameserver/model/pledge/Clan._rank:I
  #1002 = NameAndType        #1003:#54    // _rank:I
  #1003 = Utf8               _rank
  #1004 = Fieldref           #11.#1005    // ext/mods/gameserver/model/pledge/Clan._auctionBiddedAt:I
  #1005 = NameAndType        #1006:#54    // _auctionBiddedAt:I
  #1006 = Utf8               _auctionBiddedAt
  #1007 = String             #1008        // UPDATE clan_data SET auction_bid_at=? WHERE clan_id=?
  #1008 = Utf8               UPDATE clan_data SET auction_bid_at=? WHERE clan_id=?
  #1009 = String             #1010        // Error while updating clan auction.
  #1010 = Utf8               Error while updating clan auction.
  #1011 = Fieldref           #943.#1012   // ext/mods/gameserver/enums/PrivilegeType.SP_INVITE:Lext/mods/gameserver/enums/PrivilegeType;
  #1012 = NameAndType        #1013:#947   // SP_INVITE:Lext/mods/gameserver/enums/PrivilegeType;
  #1013 = Utf8               SP_INVITE
  #1014 = Methodref          #275.#1015   // ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #1015 = NameAndType        #1016:#1017  // hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #1016 = Utf8               hasClanPrivileges
  #1017 = Utf8               (Lext/mods/gameserver/enums/PrivilegeType;)Z
  #1018 = Fieldref           #329.#1019   // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
  #1019 = NameAndType        #1020:#333   // YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
  #1020 = Utf8               YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT
  #1021 = Fieldref           #329.#1022   // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_INVITED_THE_WRONG_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #1022 = NameAndType        #1023:#333   // YOU_HAVE_INVITED_THE_WRONG_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #1023 = Utf8               YOU_HAVE_INVITED_THE_WRONG_TARGET
  #1024 = Methodref          #275.#91     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #1025 = Fieldref           #329.#1026   // ext/mods/gameserver/network/SystemMessageId.CANNOT_INVITE_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
  #1026 = NameAndType        #1027:#333   // CANNOT_INVITE_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
  #1027 = Utf8               CANNOT_INVITE_YOURSELF
  #1028 = Methodref          #275.#1029   // ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
  #1029 = NameAndType        #1030:#84    // isBlockingAll:()Z
  #1030 = Utf8               isBlockingAll
  #1031 = Fieldref           #329.#1032   // ext/mods/gameserver/network/SystemMessageId.S1_BLOCKED_EVERYTHING:Lext/mods/gameserver/network/SystemMessageId;
  #1032 = NameAndType        #1033:#333   // S1_BLOCKED_EVERYTHING:Lext/mods/gameserver/network/SystemMessageId;
  #1033 = Utf8               S1_BLOCKED_EVERYTHING
  #1034 = Methodref          #335.#1035   // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #1035 = NameAndType        #1036:#1037  // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #1036 = Utf8               addCharName
  #1037 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #1038 = Methodref          #1039.#1040  // ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
  #1039 = Class              #1041        // ext/mods/gameserver/data/manager/RelationManager
  #1040 = NameAndType        #157:#1042   // getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
  #1041 = Utf8               ext/mods/gameserver/data/manager/RelationManager
  #1042 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
  #1043 = Methodref          #1039.#1044  // ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #1044 = NameAndType        #1045:#1046  // isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #1045 = Utf8               isInBlockList
  #1046 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #1047 = Fieldref           #329.#1048   // ext/mods/gameserver/network/SystemMessageId.S1_HAS_ADDED_YOU_TO_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #1048 = NameAndType        #1049:#333   // S1_HAS_ADDED_YOU_TO_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
  #1049 = Utf8               S1_HAS_ADDED_YOU_TO_IGNORE_LIST
  #1050 = Methodref          #275.#1051   // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #1051 = NameAndType        #1052:#93    // getClanId:()I
  #1052 = Utf8               getClanId
  #1053 = Fieldref           #329.#1054   // ext/mods/gameserver/network/SystemMessageId.S1_WORKING_WITH_ANOTHER_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #1054 = NameAndType        #1055:#333   // S1_WORKING_WITH_ANOTHER_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #1055 = Utf8               S1_WORKING_WITH_ANOTHER_CLAN
  #1056 = Fieldref           #329.#1057   // ext/mods/gameserver/network/SystemMessageId.YOU_MUST_WAIT_BEFORE_ACCEPTING_A_NEW_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
  #1057 = NameAndType        #1058:#333   // YOU_MUST_WAIT_BEFORE_ACCEPTING_A_NEW_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
  #1058 = Utf8               YOU_MUST_WAIT_BEFORE_ACCEPTING_A_NEW_MEMBER
  #1059 = Methodref          #275.#1060   // ext/mods/gameserver/model/actor/Player.getClanJoinExpiryTime:()J
  #1060 = NameAndType        #1061:#626   // getClanJoinExpiryTime:()J
  #1061 = Utf8               getClanJoinExpiryTime
  #1062 = Fieldref           #329.#1063   // ext/mods/gameserver/network/SystemMessageId.S1_MUST_WAIT_BEFORE_JOINING_ANOTHER_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #1063 = NameAndType        #1064:#333   // S1_MUST_WAIT_BEFORE_JOINING_ANOTHER_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #1064 = Utf8               S1_MUST_WAIT_BEFORE_JOINING_ANOTHER_CLAN
  #1065 = Methodref          #275.#1066   // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #1066 = NameAndType        #1067:#1068  // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #1067 = Utf8               getStatus
  #1068 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #1069 = Methodref          #1070.#746   // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #1070 = Class              #1071        // ext/mods/gameserver/model/actor/status/PlayerStatus
  #1071 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #1072 = Methodref          #275.#1073   // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #1073 = NameAndType        #1074:#1075  // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #1074 = Utf8               getClassId
  #1075 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #1076 = Methodref          #1077.#746   // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #1077 = Class              #1078        // ext/mods/gameserver/enums/actors/ClassId
  #1078 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #1079 = Fieldref           #329.#1080   // ext/mods/gameserver/network/SystemMessageId.S1_DOESNOT_MEET_REQUIREMENTS_TO_JOIN_ACADEMY:Lext/mods/gameserver/network/SystemMessageId;
  #1080 = NameAndType        #1081:#333   // S1_DOESNOT_MEET_REQUIREMENTS_TO_JOIN_ACADEMY:Lext/mods/gameserver/network/SystemMessageId;
  #1081 = Utf8               S1_DOESNOT_MEET_REQUIREMENTS_TO_JOIN_ACADEMY
  #1082 = Fieldref           #329.#1083   // ext/mods/gameserver/network/SystemMessageId.ACADEMY_REQUIREMENTS:Lext/mods/gameserver/network/SystemMessageId;
  #1083 = NameAndType        #1084:#333   // ACADEMY_REQUIREMENTS:Lext/mods/gameserver/network/SystemMessageId;
  #1084 = Utf8               ACADEMY_REQUIREMENTS
  #1085 = Methodref          #11.#1086    // ext/mods/gameserver/model/pledge/Clan.getSubPledgeMembersCount:(I)I
  #1086 = NameAndType        #1087:#541   // getSubPledgeMembersCount:(I)I
  #1087 = Utf8               getSubPledgeMembersCount
  #1088 = Methodref          #11.#1089    // ext/mods/gameserver/model/pledge/Clan.getMaxNrOfMembers:(I)I
  #1089 = NameAndType        #1090:#541   // getMaxNrOfMembers:(I)I
  #1090 = Utf8               getMaxNrOfMembers
  #1091 = Fieldref           #329.#1092   // ext/mods/gameserver/network/SystemMessageId.S1_CLAN_IS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #1092 = NameAndType        #1093:#333   // S1_CLAN_IS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #1093 = Utf8               S1_CLAN_IS_FULL
  #1094 = Methodref          #11.#255     // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #1095 = Fieldref           #329.#1096   // ext/mods/gameserver/network/SystemMessageId.SUBCLAN_IS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #1096 = NameAndType        #1097:#333   // SUBCLAN_IS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #1097 = Utf8               SUBCLAN_IS_FULL
  #1098 = Methodref          #275.#1099   // ext/mods/gameserver/model/actor/Player.getAllyId:()I
  #1099 = NameAndType        #1100:#93    // getAllyId:()I
  #1100 = Utf8               getAllyId
  #1101 = Fieldref           #329.#1102   // ext/mods/gameserver/network/SystemMessageId.FEATURE_ONLY_FOR_ALLIANCE_LEADER:Lext/mods/gameserver/network/SystemMessageId;
  #1102 = NameAndType        #1103:#333   // FEATURE_ONLY_FOR_ALLIANCE_LEADER:Lext/mods/gameserver/network/SystemMessageId;
  #1103 = Utf8               FEATURE_ONLY_FOR_ALLIANCE_LEADER
  #1104 = Methodref          #275.#1105   // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #1105 = NameAndType        #1106:#1107  // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #1106 = Utf8               getClan
  #1107 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #1108 = Methodref          #11.#1109    // ext/mods/gameserver/model/pledge/Clan.getAllyPenaltyType:()I
  #1109 = NameAndType        #1110:#93    // getAllyPenaltyType:()I
  #1110 = Utf8               getAllyPenaltyType
  #1111 = Methodref          #11.#1112    // ext/mods/gameserver/model/pledge/Clan.getAllyPenaltyExpiryTime:()J
  #1112 = NameAndType        #1113:#626   // getAllyPenaltyExpiryTime:()J
  #1113 = Utf8               getAllyPenaltyExpiryTime
  #1114 = Fieldref           #329.#1115   // ext/mods/gameserver/network/SystemMessageId.CANT_INVITE_CLAN_WITHIN_1_DAY:Lext/mods/gameserver/network/SystemMessageId;
  #1115 = NameAndType        #1116:#333   // CANT_INVITE_CLAN_WITHIN_1_DAY:Lext/mods/gameserver/network/SystemMessageId;
  #1116 = Utf8               CANT_INVITE_CLAN_WITHIN_1_DAY
  #1117 = Fieldref           #329.#1118   // ext/mods/gameserver/network/SystemMessageId.SELECT_USER_TO_INVITE:Lext/mods/gameserver/network/SystemMessageId;
  #1118 = NameAndType        #1119:#333   // SELECT_USER_TO_INVITE:Lext/mods/gameserver/network/SystemMessageId;
  #1119 = Utf8               SELECT_USER_TO_INVITE
  #1120 = Fieldref           #329.#1121   // ext/mods/gameserver/network/SystemMessageId.TARGET_MUST_BE_IN_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #1121 = NameAndType        #1122:#333   // TARGET_MUST_BE_IN_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #1122 = Utf8               TARGET_MUST_BE_IN_CLAN
  #1123 = Fieldref           #329.#1124   // ext/mods/gameserver/network/SystemMessageId.S1_IS_NOT_A_CLAN_LEADER:Lext/mods/gameserver/network/SystemMessageId;
  #1124 = NameAndType        #1125:#333   // S1_IS_NOT_A_CLAN_LEADER:Lext/mods/gameserver/network/SystemMessageId;
  #1125 = Utf8               S1_IS_NOT_A_CLAN_LEADER
  #1126 = Fieldref           #329.#1127   // ext/mods/gameserver/network/SystemMessageId.S1_CLAN_ALREADY_MEMBER_OF_S2_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
  #1127 = NameAndType        #1128:#333   // S1_CLAN_ALREADY_MEMBER_OF_S2_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
  #1128 = Utf8               S1_CLAN_ALREADY_MEMBER_OF_S2_ALLIANCE
  #1129 = Methodref          #11.#1130    // ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
  #1130 = NameAndType        #1131:#201   // getAllyName:()Ljava/lang/String;
  #1131 = Utf8               getAllyName
  #1132 = Fieldref           #329.#1133   // ext/mods/gameserver/network/SystemMessageId.S1_CANT_ENTER_ALLIANCE_WITHIN_1_DAY:Lext/mods/gameserver/network/SystemMessageId;
  #1133 = NameAndType        #1134:#333   // S1_CANT_ENTER_ALLIANCE_WITHIN_1_DAY:Lext/mods/gameserver/network/SystemMessageId;
  #1134 = Utf8               S1_CANT_ENTER_ALLIANCE_WITHIN_1_DAY
  #1135 = Fieldref           #329.#1136   // ext/mods/gameserver/network/SystemMessageId.CANT_ENTER_ALLIANCE_WITHIN_1_DAY:Lext/mods/gameserver/network/SystemMessageId;
  #1136 = NameAndType        #1137:#333   // CANT_ENTER_ALLIANCE_WITHIN_1_DAY:Lext/mods/gameserver/network/SystemMessageId;
  #1137 = Utf8               CANT_ENTER_ALLIANCE_WITHIN_1_DAY
  #1138 = Methodref          #497.#1139   // ext/mods/gameserver/model/residence/castle/Siege.isOnOppositeSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #1139 = NameAndType        #1140:#1141  // isOnOppositeSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #1140 = Utf8               isOnOppositeSide
  #1141 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #1142 = Fieldref           #329.#1143   // ext/mods/gameserver/network/SystemMessageId.OPPOSING_CLAN_IS_PARTICIPATING_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #1143 = NameAndType        #1144:#333   // OPPOSING_CLAN_IS_PARTICIPATING_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #1144 = Utf8               OPPOSING_CLAN_IS_PARTICIPATING_IN_SIEGE
  #1145 = Methodref          #11.#1051    // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
  #1146 = Methodref          #11.#1147    // ext/mods/gameserver/model/pledge/Clan.isAtWarWith:(I)Z
  #1147 = NameAndType        #1148:#928   // isAtWarWith:(I)Z
  #1148 = Utf8               isAtWarWith
  #1149 = Fieldref           #329.#1150   // ext/mods/gameserver/network/SystemMessageId.MAY_NOT_ALLY_CLAN_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
  #1150 = NameAndType        #1151:#333   // MAY_NOT_ALLY_CLAN_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
  #1151 = Utf8               MAY_NOT_ALLY_CLAN_BATTLE
  #1152 = Fieldref           #286.#1153   // ext/mods/Config.MAX_NUM_OF_CLANS_IN_ALLY:I
  #1153 = NameAndType        #1154:#54    // MAX_NUM_OF_CLANS_IN_ALLY:I
  #1154 = Utf8               MAX_NUM_OF_CLANS_IN_ALLY
  #1155 = Fieldref           #329.#1156   // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_EXCEEDED_THE_LIMIT:Lext/mods/gameserver/network/SystemMessageId;
  #1156 = NameAndType        #1157:#333   // YOU_HAVE_EXCEEDED_THE_LIMIT:Lext/mods/gameserver/network/SystemMessageId;
  #1157 = Utf8               YOU_HAVE_EXCEEDED_THE_LIMIT
  #1158 = Fieldref           #329.#1159   // ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEADER_CREATE_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
  #1159 = NameAndType        #1160:#333   // ONLY_CLAN_LEADER_CREATE_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
  #1160 = Utf8               ONLY_CLAN_LEADER_CREATE_ALLIANCE
  #1161 = Fieldref           #329.#1162   // ext/mods/gameserver/network/SystemMessageId.ALREADY_JOINED_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
  #1162 = NameAndType        #1163:#333   // ALREADY_JOINED_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
  #1163 = Utf8               ALREADY_JOINED_ALLIANCE
  #1164 = Fieldref           #329.#1165   // ext/mods/gameserver/network/SystemMessageId.TO_CREATE_AN_ALLY_YOU_CLAN_MUST_BE_LEVEL_5_OR_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
  #1165 = NameAndType        #1166:#333   // TO_CREATE_AN_ALLY_YOU_CLAN_MUST_BE_LEVEL_5_OR_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
  #1166 = Utf8               TO_CREATE_AN_ALLY_YOU_CLAN_MUST_BE_LEVEL_5_OR_HIGHER
  #1167 = Fieldref           #329.#1168   // ext/mods/gameserver/network/SystemMessageId.CANT_CREATE_ALLIANCE_10_DAYS_DISOLUTION:Lext/mods/gameserver/network/SystemMessageId;
  #1168 = NameAndType        #1169:#333   // CANT_CREATE_ALLIANCE_10_DAYS_DISOLUTION:Lext/mods/gameserver/network/SystemMessageId;
  #1169 = Utf8               CANT_CREATE_ALLIANCE_10_DAYS_DISOLUTION
  #1170 = Fieldref           #329.#1171   // ext/mods/gameserver/network/SystemMessageId.YOU_MAY_NOT_CREATE_ALLY_WHILE_DISSOLVING:Lext/mods/gameserver/network/SystemMessageId;
  #1171 = NameAndType        #1172:#333   // YOU_MAY_NOT_CREATE_ALLY_WHILE_DISSOLVING:Lext/mods/gameserver/network/SystemMessageId;
  #1172 = Utf8               YOU_MAY_NOT_CREATE_ALLY_WHILE_DISSOLVING
  #1173 = Methodref          #725.#1174   // ext/mods/commons/lang/StringUtil.isAlphaNumeric:(Ljava/lang/String;)Z
  #1174 = NameAndType        #1175:#1176  // isAlphaNumeric:(Ljava/lang/String;)Z
  #1175 = Utf8               isAlphaNumeric
  #1176 = Utf8               (Ljava/lang/String;)Z
  #1177 = Fieldref           #329.#1178   // ext/mods/gameserver/network/SystemMessageId.INCORRECT_ALLIANCE_NAME:Lext/mods/gameserver/network/SystemMessageId;
  #1178 = NameAndType        #1179:#333   // INCORRECT_ALLIANCE_NAME:Lext/mods/gameserver/network/SystemMessageId;
  #1179 = Utf8               INCORRECT_ALLIANCE_NAME
  #1180 = Methodref          #877.#1181   // java/lang/String.length:()I
  #1181 = NameAndType        #1182:#93    // length:()I
  #1182 = Utf8               length
  #1183 = Fieldref           #329.#1184   // ext/mods/gameserver/network/SystemMessageId.INCORRECT_ALLIANCE_NAME_LENGTH:Lext/mods/gameserver/network/SystemMessageId;
  #1184 = NameAndType        #1185:#333   // INCORRECT_ALLIANCE_NAME_LENGTH:Lext/mods/gameserver/network/SystemMessageId;
  #1185 = Utf8               INCORRECT_ALLIANCE_NAME_LENGTH
  #1186 = Methodref          #827.#1187   // ext/mods/gameserver/data/sql/ClanTable.isAllyExists:(Ljava/lang/String;)Z
  #1187 = NameAndType        #1188:#1176  // isAllyExists:(Ljava/lang/String;)Z
  #1188 = Utf8               isAllyExists
  #1189 = Fieldref           #329.#1190   // ext/mods/gameserver/network/SystemMessageId.ALLIANCE_ALREADY_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
  #1190 = NameAndType        #1191:#333   // ALLIANCE_ALREADY_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
  #1191 = Utf8               ALLIANCE_ALREADY_EXISTS
  #1192 = Methodref          #497.#1193   // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #1193 = NameAndType        #522:#1194   // checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #1194 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Z
  #1195 = Fieldref           #329.#1196   // ext/mods/gameserver/network/SystemMessageId.NO_ALLY_CREATION_WHILE_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #1196 = NameAndType        #1197:#333   // NO_ALLY_CREATION_WHILE_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #1197 = Utf8               NO_ALLY_CREATION_WHILE_SIEGE
  #1198 = Methodref          #11.#1199    // ext/mods/gameserver/model/pledge/Clan.setAllyPenaltyExpiryTime:(JI)V
  #1199 = NameAndType        #1200:#1201  // setAllyPenaltyExpiryTime:(JI)V
  #1200 = Utf8               setAllyPenaltyExpiryTime
  #1201 = Utf8               (JI)V
  #1202 = Fieldref           #329.#1203   // ext/mods/gameserver/network/SystemMessageId.NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
  #1203 = NameAndType        #1204:#333   // NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
  #1204 = Utf8               NO_CURRENT_ALLIANCES
  #1205 = Fieldref           #329.#1206   // ext/mods/gameserver/network/SystemMessageId.CANNOT_DISSOLVE_ALLY_WHILE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #1206 = NameAndType        #1207:#333   // CANNOT_DISSOLVE_ALLY_WHILE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #1207 = Utf8               CANNOT_DISSOLVE_ALLY_WHILE_IN_SIEGE
  #1208 = Fieldref           #329.#1209   // ext/mods/gameserver/network/SystemMessageId.ALLIANCE_DISOLVED:Lext/mods/gameserver/network/SystemMessageId;
  #1209 = NameAndType        #1210:#333   // ALLIANCE_DISOLVED:Lext/mods/gameserver/network/SystemMessageId;
  #1210 = Utf8               ALLIANCE_DISOLVED
  #1211 = Methodref          #11.#1212    // ext/mods/gameserver/model/pledge/Clan.broadcastToAllyMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1212 = NameAndType        #1213:#347   // broadcastToAllyMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1213 = Utf8               broadcastToAllyMembers
  #1214 = Methodref          #827.#1215   // ext/mods/gameserver/data/sql/ClanTable.getClans:()Ljava/util/Collection;
  #1215 = NameAndType        #1216:#430   // getClans:()Ljava/util/Collection;
  #1216 = Utf8               getClans
  #1217 = Methodref          #11.#1099    // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
  #1218 = Methodref          #11.#1219    // ext/mods/gameserver/model/pledge/Clan.setAllyId:(I)V
  #1219 = NameAndType        #1220:#209   // setAllyId:(I)V
  #1220 = Utf8               setAllyId
  #1221 = Methodref          #11.#1222    // ext/mods/gameserver/model/pledge/Clan.setAllyName:(Ljava/lang/String;)V
  #1222 = NameAndType        #1223:#612   // setAllyName:(Ljava/lang/String;)V
  #1223 = Utf8               setAllyName
  #1224 = Fieldref           #286.#1225   // ext/mods/Config.CREATE_ALLY_DAYS_WHEN_DISSOLVED:I
  #1225 = NameAndType        #1226:#54    // CREATE_ALLY_DAYS_WHEN_DISSOLVED:I
  #1226 = Utf8               CREATE_ALLY_DAYS_WHEN_DISSOLVED
  #1227 = Methodref          #275.#1228   // ext/mods/gameserver/model/actor/Player.applyDeathPenalty:(ZZ)V
  #1228 = NameAndType        #1229:#1230  // applyDeathPenalty:(ZZ)V
  #1229 = Utf8               applyDeathPenalty
  #1230 = Utf8               (ZZ)V
  #1231 = Fieldref           #329.#1232   // ext/mods/gameserver/network/SystemMessageId.CANNOT_RISE_LEVEL_WHILE_DISSOLUTION_IN_PROGRESS:Lext/mods/gameserver/network/SystemMessageId;
  #1232 = NameAndType        #1233:#333   // CANNOT_RISE_LEVEL_WHILE_DISSOLUTION_IN_PROGRESS:Lext/mods/gameserver/network/SystemMessageId;
  #1233 = Utf8               CANNOT_RISE_LEVEL_WHILE_DISSOLUTION_IN_PROGRESS
  #1234 = Methodref          #1070.#1235  // ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
  #1235 = NameAndType        #1236:#93    // getSp:()I
  #1236 = Utf8               getSp
  #1237 = Integer            650000
  #1238 = Methodref          #275.#1239   // ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
  #1239 = NameAndType        #1240:#1241  // reduceAdena:(IZ)Z
  #1240 = Utf8               reduceAdena
  #1241 = Utf8               (IZ)Z
  #1242 = Methodref          #275.#1243   // ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
  #1243 = NameAndType        #1244:#1201  // removeExpAndSp:(JI)V
  #1244 = Utf8               removeExpAndSp
  #1245 = Integer            150000
  #1246 = Integer            2500000
  #1247 = Integer            500000
  #1248 = Methodref          #275.#1249   // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #1249 = NameAndType        #1250:#1251  // destroyItemByItemId:(IIZ)Z
  #1250 = Utf8               destroyItemByItemId
  #1251 = Utf8               (IIZ)Z
  #1252 = Integer            1400000
  #1253 = Integer            3500000
  #1254 = Methodref          #11.#1255    // ext/mods/gameserver/model/pledge/Clan.getMembersCount:()I
  #1255 = NameAndType        #1256:#93    // getMembersCount:()I
  #1256 = Utf8               getMembersCount
  #1257 = Fieldref           #329.#1258   // ext/mods/gameserver/network/SystemMessageId.S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
  #1258 = NameAndType        #1259:#333   // S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
  #1259 = Utf8               S1_DEDUCTED_FROM_CLAN_REP
  #1260 = Methodref          #335.#1261   // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #1261 = NameAndType        #1262:#763   // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #1262 = Utf8               addNumber
  #1263 = Integer            40000
  #1264 = Fieldref           #329.#1265   // ext/mods/gameserver/network/SystemMessageId.FAILED_TO_INCREASE_CLAN_LEVEL:Lext/mods/gameserver/network/SystemMessageId;
  #1265 = NameAndType        #1266:#333   // FAILED_TO_INCREASE_CLAN_LEVEL:Lext/mods/gameserver/network/SystemMessageId;
  #1266 = Utf8               FAILED_TO_INCREASE_CLAN_LEVEL
  #1267 = Methodref          #11.#1268    // ext/mods/gameserver/model/pledge/Clan.changeLevel:(I)V
  #1268 = NameAndType        #1269:#209   // changeLevel:(I)V
  #1269 = Utf8               changeLevel
  #1270 = String             #1271        // UPDATE clan_data SET clan_level = ? WHERE clan_id = ?
  #1271 = Utf8               UPDATE clan_data SET clan_level = ? WHERE clan_id = ?
  #1272 = String             #1273        // Error while updating clan level.
  #1273 = Utf8               Error while updating clan level.
  #1274 = Methodref          #11.#1275    // ext/mods/gameserver/model/pledge/Clan.setLevel:(I)V
  #1275 = NameAndType        #1276:#209   // setLevel:(I)V
  #1276 = Utf8               setLevel
  #1277 = Fieldref           #329.#1278   // ext/mods/gameserver/network/SystemMessageId.CLAN_CAN_ACCUMULATE_CLAN_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
  #1278 = NameAndType        #1279:#333   // CLAN_CAN_ACCUMULATE_CLAN_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
  #1279 = Utf8               CLAN_CAN_ACCUMULATE_CLAN_REPUTATION_POINTS
  #1280 = Fieldref           #329.#1281   // ext/mods/gameserver/network/SystemMessageId.CLAN_LEVEL_INCREASED:Lext/mods/gameserver/network/SystemMessageId;
  #1281 = NameAndType        #1282:#333   // CLAN_LEVEL_INCREASED:Lext/mods/gameserver/network/SystemMessageId;
  #1282 = Utf8               CLAN_LEVEL_INCREASED
  #1283 = Methodref          #182.#1284   // ext/mods/gameserver/data/cache/CrestCache.removeCrest:(Lext/mods/gameserver/enums/CrestType;I)V
  #1284 = NameAndType        #1285:#1286  // removeCrest:(Lext/mods/gameserver/enums/CrestType;I)V
  #1285 = Utf8               removeCrest
  #1286 = Utf8               (Lext/mods/gameserver/enums/CrestType;I)V
  #1287 = String             #1288        // UPDATE clan_data SET crest_id = ? WHERE clan_id = ?
  #1288 = Utf8               UPDATE clan_data SET crest_id = ? WHERE clan_id = ?
  #1289 = String             #1290        // Error while updating clan crest.
  #1290 = Utf8               Error while updating clan crest.
  #1291 = String             #1292        // UPDATE clan_data SET ally_crest_id = ? WHERE clan_id = ?
  #1292 = Utf8               UPDATE clan_data SET ally_crest_id = ? WHERE clan_id = ?
  #1293 = String             #1294        // UPDATE clan_data SET ally_crest_id = ? WHERE ally_id = ?
  #1294 = Utf8               UPDATE clan_data SET ally_crest_id = ? WHERE ally_id = ?
  #1295 = String             #1296        // Error while updating ally crest.
  #1296 = Utf8               Error while updating ally crest.
  #1297 = Methodref          #11.#1298    // ext/mods/gameserver/model/pledge/Clan.setAllyCrestId:(I)V
  #1298 = NameAndType        #1299:#209   // setAllyCrestId:(I)V
  #1299 = Utf8               setAllyCrestId
  #1300 = String             #1301        // UPDATE clan_data SET crest_large_id = ? WHERE clan_id = ?
  #1301 = Utf8               UPDATE clan_data SET crest_large_id = ? WHERE clan_id = ?
  #1302 = String             #1303        // Error while updating large crest.
  #1303 = Utf8               Error while updating large crest.
  #1304 = Methodref          #877.#1305   // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #1305 = NameAndType        #1306:#1176  // equalsIgnoreCase:(Ljava/lang/String;)Z
  #1306 = Utf8               equalsIgnoreCase
  #1307 = Methodref          #877.#1308   // java/lang/String.equals:(Ljava/lang/Object;)Z
  #1308 = NameAndType        #1309:#459   // equals:(Ljava/lang/Object;)Z
  #1309 = Utf8               equals
  #1310 = Methodref          #1311.#255   // java/lang/Class.getName:()Ljava/lang/String;
  #1311 = Class              #1312        // java/lang/Class
  #1312 = Utf8               java/lang/Class
  #1313 = Methodref          #173.#1314   // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #1314 = NameAndType        #5:#612      // "<init>":(Ljava/lang/String;)V
  #1315 = Utf8               LOAD_MEMBERS
  #1316 = Utf8               ConstantValue
  #1317 = Utf8               LOAD_SUBPLEDGES
  #1318 = Utf8               LOAD_PRIVILEGES
  #1319 = Utf8               LOAD_SKILLS
  #1320 = Utf8               SET_MEMBER_POWER_GRADE
  #1321 = Utf8               REMOVE_MEMBER
  #1322 = Utf8               REMOVE_APPRENTICE
  #1323 = Utf8               REMOVE_SPONSOR
  #1324 = Utf8               UPDATE_CLAN
  #1325 = Utf8               STORE_CLAN
  #1326 = Utf8               UPDATE_NOTICE
  #1327 = Utf8               UPDATE_INTRODUCTION
  #1328 = Utf8               ADD_OR_UPDATE_SKILL
  #1329 = Utf8               REMOVE_SKILL
  #1330 = Utf8               REMOVE_ALL_SKILLS
  #1331 = Utf8               INSERT_SUBPLEDGE
  #1332 = Utf8               UPDATE_SUBPLEDGE
  #1333 = Utf8               ADD_OR_UPDATE_PRIVILEGE
  #1334 = Utf8               UPDATE_CRP
  #1335 = Utf8               UPDATE_AUCTION
  #1336 = Utf8               UPDATE_CLAN_LEVEL
  #1337 = Utf8               UPDATE_CLAN_CREST
  #1338 = Utf8               UPDATE_LARGE_CREST
  #1339 = Utf8               UPDATE_GRADUATES
  #1340 = Utf8               PENALTY_TYPE_CLAN_LEAVED
  #1341 = Integer            1
  #1342 = Utf8               PENALTY_TYPE_CLAN_DISMISSED
  #1343 = Integer            2
  #1344 = Utf8               PENALTY_TYPE_DISMISS_CLAN
  #1345 = Integer            3
  #1346 = Utf8               PENALTY_TYPE_DISSOLVE_ALLY
  #1347 = Integer            4
  #1348 = Utf8               SUBUNIT_ACADEMY
  #1349 = Integer            -1
  #1350 = Utf8               SUBUNIT_ROYAL1
  #1351 = Integer            100
  #1352 = Utf8               SUBUNIT_ROYAL2
  #1353 = Integer            200
  #1354 = Utf8               SUBUNIT_KNIGHT1
  #1355 = Integer            1001
  #1356 = Utf8               SUBUNIT_KNIGHT2
  #1357 = Integer            1002
  #1358 = Utf8               SUBUNIT_KNIGHT3
  #1359 = Integer            2001
  #1360 = Utf8               SUBUNIT_KNIGHT4
  #1361 = Integer            2002
  #1362 = Utf8               MAX_NOTICE_LENGTH
  #1363 = Integer            8192
  #1364 = Utf8               MAX_INTRODUCTION_LENGTH
  #1365 = Integer            300
  #1366 = Utf8               Signature
  #1367 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/ClanMember;>;
  #1368 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #1369 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/skills/L2Skill;>;
  #1370 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #1371 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/SubPledge;>;
  #1372 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #1373 = Utf8               Code
  #1374 = Utf8               LineNumberTable
  #1375 = Utf8               LocalVariableTable
  #1376 = Utf8               member
  #1377 = Utf8               rs
  #1378 = Utf8               Ljava/sql/ResultSet;
  #1379 = Utf8               ps
  #1380 = Utf8               Ljava/sql/PreparedStatement;
  #1381 = Utf8               id
  #1382 = Utf8               level
  #1383 = Utf8               skill
  #1384 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #1385 = Utf8               con
  #1386 = Utf8               Ljava/sql/Connection;
  #1387 = Utf8               e
  #1388 = Utf8               Ljava/lang/Exception;
  #1389 = Utf8               this
  #1390 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #1391 = Utf8               clanId
  #1392 = Utf8               leaderId
  #1393 = Utf8               StackMapTable
  #1394 = Utf8               clanName
  #1395 = Utf8               setName
  #1396 = Utf8               setClanId
  #1397 = Utf8               getLeaderName
  #1398 = Utf8               leader
  #1399 = Utf8               setNewLeader
  #1400 = Utf8               newLeader
  #1401 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1402 = Utf8               exLeader
  #1403 = Utf8               newLeaderId
  #1404 = Utf8               exLeaderId
  #1405 = Utf8               getNewLeaderId
  #1406 = Utf8               setNewLeaderId
  #1407 = Utf8               objectId
  #1408 = Utf8               storeInDb
  #1409 = Utf8               allyName
  #1410 = Utf8               allyId
  #1411 = Utf8               getAllyCrestId
  #1412 = Utf8               allyCrestId
  #1413 = Utf8               getCastleId
  #1414 = Utf8               setCastle
  #1415 = Utf8               castle
  #1416 = Utf8               getClanHallId
  #1417 = Utf8               hasClanHall
  #1418 = Utf8               setClanHallId
  #1419 = Utf8               getCrestId
  #1420 = Utf8               setCrestId
  #1421 = Utf8               crestId
  #1422 = Utf8               getCrestLargeId
  #1423 = Utf8               setCrestLargeId
  #1424 = Utf8               crestLargeId
  #1425 = Utf8               getSiegeKills
  #1426 = Utf8               getSiegeDeaths
  #1427 = Utf8               setSiegeKills
  #1428 = Utf8               value
  #1429 = Utf8               setSiegeDeaths
  #1430 = Utf8               getFlag
  #1431 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #1432 = Utf8               setFlag
  #1433 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #1434 = Utf8               flag
  #1435 = Utf8               expiryTime
  #1436 = Utf8               penaltyType
  #1437 = Utf8               getCharPenaltyExpiryTime
  #1438 = Utf8               setCharPenaltyExpiryTime
  #1439 = Utf8               time
  #1440 = Utf8               getDissolvingExpiryTime
  #1441 = Utf8               setDissolvingExpiryTime
  #1442 = Utf8               getAnnBoard
  #1443 = Utf8               ()Lext/mods/gameserver/communitybbs/model/Forum;
  #1444 = Utf8               getCbbBoard
  #1445 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/ClanMember;
  #1446 = Utf8               isMember
  #1447 = Utf8               addClanMember
  #1448 = Utf8               siege
  #1449 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
  #1450 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #1451 = Utf8               player
  #1452 = Utf8               removeClanMember
  #1453 = Utf8               pledge
  #1454 = Utf8               Lext/mods/gameserver/model/pledge/SubPledge;
  #1455 = Utf8               apprentice
  #1456 = Utf8               sponsor
  #1457 = Utf8               clanJoinExpiryTime
  #1458 = Utf8               exMember
  #1459 = Utf8               subPledgeId
  #1460 = Utf8               LocalVariableTypeTable
  #1461 = Utf8               getMembers
  #1462 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/pledge/ClanMember;>;
  #1463 = Utf8               pledgeType
  #1464 = Utf8               getSubPledgeLeaderName
  #1465 = Utf8               (I)Ljava/lang/String;
  #1466 = Utf8               subPledge
  #1467 = Utf8               temp
  #1468 = Utf8               list
  #1469 = Utf8               Ljava/util/List;
  #1470 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #1471 = Utf8               getOnlineMembersCount
  #1472 = Utf8               store
  #1473 = Utf8               getNotice
  #1474 = Utf8               isNoticeEnabled
  #1475 = Utf8               notice
  #1476 = Utf8               enabled
  #1477 = Utf8               saveOnDb
  #1478 = Utf8               (Z)V
  #1479 = Utf8               getIntroduction
  #1480 = Utf8               setIntroduction
  #1481 = Utf8               (Ljava/lang/String;Z)V
  #1482 = Utf8               introduction
  #1483 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/skills/L2Skill;>;
  #1484 = Utf8               addClanSkill
  #1485 = Utf8               needRefresh
  #1486 = Utf8               existingSkill
  #1487 = Utf8               psla
  #1488 = Utf8               Lext/mods/gameserver/network/serverpackets/PledgeSkillListAdd;
  #1489 = Utf8               sm
  #1490 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #1491 = Utf8               removeClanSkill
  #1492 = Utf8               psl
  #1493 = Utf8               Lext/mods/gameserver/network/serverpackets/PledgeSkillList;
  #1494 = Utf8               addAllClanSkills
  #1495 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #1496 = Utf8               removeAllClanSkills
  #1497 = Utf8               packet
  #1498 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #1499 = Utf8               packets
  #1500 = Utf8               [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #1501 = Class              #1500        // "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;"
  #1502 = Utf8               clan
  #1503 = Utf8               broadcastToMembersExcept
  #1504 = Utf8               (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1505 = Utf8               getWarehouse
  #1506 = Utf8               isAtWarAttacker
  #1507 = Utf8               setEnemyClan
  #1508 = Utf8               setAttackerClan
  #1509 = Utf8               deleteEnemyClan
  #1510 = Utf8               deleteAttackerClan
  #1511 = Utf8               addWarPenaltyTime
  #1512 = Utf8               hasWarPenaltyWith
  #1513 = Utf8               getWarPenalty
  #1514 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #1515 = Utf8               isAtWar
  #1516 = Utf8               getWarList
  #1517 = Utf8               ()Ljava/util/Set;
  #1518 = Utf8               ()Ljava/util/Set<Ljava/lang/Integer;>;
  #1519 = Utf8               getAttackerList
  #1520 = Utf8               getGraduates
  #1521 = Utf8               addGraduate
  #1522 = Utf8               toSave
  #1523 = Utf8               setGraduates
  #1524 = Utf8               toParse
  #1525 = Class              #1526        // "[Ljava/lang/String;"
  #1526 = Utf8               [Ljava/lang/String;
  #1527 = Utf8               sp
  #1528 = Utf8               isSubPledgeLeader
  #1529 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/SubPledge;
  #1530 = Utf8               pledgeName
  #1531 = Utf8               createSubPledge
  #1532 = Utf8               (Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;)Lext/mods/gameserver/model/pledge/SubPledge;
  #1533 = Utf8               type
  #1534 = Utf8               subPledgeName
  #1535 = Utf8               getPrivilegesByRank
  #1536 = Utf8               rank
  #1537 = Utf8               setPrivilegesForRank
  #1538 = Utf8               getReputationScore
  #1539 = Utf8               addReputationScore
  #1540 = Utf8               sk
  #1541 = Utf8               skills
  #1542 = Utf8               Ljava/util/Collection;
  #1543 = Utf8               members
  #1544 = Utf8               infoRefresh
  #1545 = Utf8               Lext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate;
  #1546 = Utf8               Ljava/util/Collection<Lext/mods/gameserver/skills/L2Skill;>;
  #1547 = Utf8               getRank
  #1548 = Utf8               setRank
  #1549 = Utf8               getAuctionBiddedAt
  #1550 = Utf8               setAuctionBiddedAt
  #1551 = Utf8               checkClanJoinCondition
  #1552 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)Z
  #1553 = Utf8               target
  #1554 = Utf8               checkAllyJoinCondition
  #1555 = Utf8               leaderClan
  #1556 = Utf8               targetClan
  #1557 = Utf8               createAlly
  #1558 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #1559 = Utf8               dissolveAlly
  #1560 = Utf8               currentTime
  #1561 = Utf8               levelUpClan
  #1562 = Utf8               increaseClanLevel
  #1563 = Utf8               onlyThisClan
  #1564 = Utf8               query
  #1565 = Utf8               isRegisteredOnSiege
  #1566 = Utf8               lambda$getSubPledge$0
  #1567 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/pledge/SubPledge;)Z
  #1568 = Utf8               s
  #1569 = Utf8               lambda$addAllClanSkills$0
  #1570 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #1571 = Utf8               lambda$getSubPledgeMembersCount$0
  #1572 = Utf8               (ILext/mods/gameserver/model/pledge/ClanMember;)Z
  #1573 = Utf8               m
  #1574 = Utf8               lambda$removeClanMember$0
  #1575 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1576 = Utf8               skillId
  #1577 = Utf8               Ljava/lang/Integer;
  #1578 = Utf8               skillLvl
  #1579 = Utf8               lambda$getClanMember$0
  #1580 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/pledge/ClanMember;)Z
  #1581 = Utf8               <clinit>
  #1582 = Utf8               SourceFile
  #1583 = Utf8               Clan.java
  #1584 = Utf8               BootstrapMethods
  #1585 = MethodType         #459         //  (Ljava/lang/Object;)Z
  #1586 = MethodHandle       6:#1587      // REF_invokeStatic ext/mods/gameserver/model/pledge/Clan.lambda$getClanMember$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/ClanMember;)Z
  #1587 = Methodref          #11.#1588    // ext/mods/gameserver/model/pledge/Clan.lambda$getClanMember$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/ClanMember;)Z
  #1588 = NameAndType        #1579:#1580  // lambda$getClanMember$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/ClanMember;)Z
  #1589 = MethodType         #1590        //  (Lext/mods/gameserver/model/pledge/ClanMember;)Z
  #1590 = Utf8               (Lext/mods/gameserver/model/pledge/ClanMember;)Z
  #1591 = MethodType         #1592        //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #1592 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #1593 = MethodHandle       6:#1594      // REF_invokeStatic ext/mods/gameserver/model/pledge/Clan.lambda$removeClanMember$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1594 = Methodref          #11.#1595    // ext/mods/gameserver/model/pledge/Clan.lambda$removeClanMember$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1595 = NameAndType        #1574:#1575  // lambda$removeClanMember$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1596 = MethodType         #1597        //  (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1597 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1598 = MethodHandle       6:#1599      // REF_invokeStatic ext/mods/gameserver/model/pledge/Clan.lambda$getSubPledgeMembersCount$0:(ILext/mods/gameserver/model/pledge/ClanMember;)Z
  #1599 = Methodref          #11.#1600    // ext/mods/gameserver/model/pledge/Clan.lambda$getSubPledgeMembersCount$0:(ILext/mods/gameserver/model/pledge/ClanMember;)Z
  #1600 = NameAndType        #1571:#1572  // lambda$getSubPledgeMembersCount$0:(ILext/mods/gameserver/model/pledge/ClanMember;)Z
  #1601 = MethodHandle       5:#585       // REF_invokeVirtual ext/mods/gameserver/model/pledge/ClanMember.isOnline:()Z
  #1602 = MethodHandle       5:#1603      // REF_invokeVirtual ext/mods/gameserver/model/pledge/Clan.lambda$addAllClanSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1603 = Methodref          #11.#1604    // ext/mods/gameserver/model/pledge/Clan.lambda$addAllClanSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1604 = NameAndType        #1569:#1570  // lambda$addAllClanSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1605 = MethodType         #1570        //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #1606 = String             #1607        // \u0001[\u0001]
  #1607 = Utf8               \u0001[\u0001]
  #1608 = MethodType         #426         //  (Ljava/lang/Object;)Ljava/lang/Object;
  #1609 = MethodHandle       6:#1610      // REF_invokeStatic java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #1610 = Methodref          #877.#1611   // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #1611 = NameAndType        #102:#1612   // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #1612 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #1613 = MethodType         #1614        //  (Ljava/lang/Integer;)Ljava/lang/String;
  #1614 = Utf8               (Ljava/lang/Integer;)Ljava/lang/String;
  #1615 = MethodHandle       6:#1616      // REF_invokeStatic ext/mods/gameserver/model/pledge/Clan.lambda$getSubPledge$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/SubPledge;)Z
  #1616 = Methodref          #11.#1617    // ext/mods/gameserver/model/pledge/Clan.lambda$getSubPledge$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/SubPledge;)Z
  #1617 = NameAndType        #1566:#1567  // lambda$getSubPledge$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/SubPledge;)Z
  #1618 = MethodType         #1619        //  (Lext/mods/gameserver/model/pledge/SubPledge;)Z
  #1619 = Utf8               (Lext/mods/gameserver/model/pledge/SubPledge;)Z
  #1620 = MethodHandle       6:#1621      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1621 = Methodref          #1622.#1623  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1622 = Class              #1624        // java/lang/invoke/LambdaMetafactory
  #1623 = NameAndType        #1625:#1626  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1624 = Utf8               java/lang/invoke/LambdaMetafactory
  #1625 = Utf8               metafactory
  #1626 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1627 = MethodHandle       6:#1628      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1628 = Methodref          #1629.#1630  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1629 = Class              #1631        // java/lang/invoke/StringConcatFactory
  #1630 = NameAndType        #837:#1632   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1631 = Utf8               java/lang/invoke/StringConcatFactory
  #1632 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1633 = Utf8               InnerClasses
  #1634 = Class              #1635        // java/util/concurrent/ConcurrentHashMap$KeySetView
  #1635 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #1636 = Utf8               KeySetView
  #1637 = Class              #1638        // java/lang/invoke/MethodHandles$Lookup
  #1638 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1639 = Class              #1640        // java/lang/invoke/MethodHandles
  #1640 = Utf8               java/lang/invoke/MethodHandles
  #1641 = Utf8               Lookup
{
  public static final int PENALTY_TYPE_CLAN_LEAVED;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int PENALTY_TYPE_CLAN_DISMISSED;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int PENALTY_TYPE_DISMISS_CLAN;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  public static final int PENALTY_TYPE_DISSOLVE_ALLY;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final int SUBUNIT_ACADEMY;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int -1

  public static final int SUBUNIT_ROYAL1;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 100

  public static final int SUBUNIT_ROYAL2;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 200

  public static final int SUBUNIT_KNIGHT1;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1001

  public static final int SUBUNIT_KNIGHT2;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1002

  public static final int SUBUNIT_KNIGHT3;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2001

  public static final int SUBUNIT_KNIGHT4;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2002

  public ext.mods.gameserver.model.pledge.Clan(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=9, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _members:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        19: dup
        20: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        23: putfield      #16                 // Field _warPenaltyExpiryTime:Ljava/util/Map;
        26: aload_0
        27: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        30: dup
        31: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        34: putfield      #19                 // Field _skills:Ljava/util/Map;
        37: aload_0
        38: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        41: dup
        42: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        45: putfield      #22                 // Field _privileges:Ljava/util/Map;
        48: aload_0
        49: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        52: dup
        53: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        56: putfield      #25                 // Field _subPledges:Ljava/util/Map;
        59: aload_0
        60: invokestatic  #28                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        63: putfield      #32                 // Field _atWarWith:Ljava/util/Set;
        66: aload_0
        67: invokestatic  #28                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        70: putfield      #36                 // Field _atWarAttackers:Ljava/util/Set;
        73: aload_0
        74: invokestatic  #28                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        77: putfield      #39                 // Field _graduates:Ljava/util/Set;
        80: aload_0
        81: new           #42                 // class ext/mods/gameserver/model/itemcontainer/ClanWarehouse
        84: dup
        85: aload_0
        86: invokespecial #44                 // Method ext/mods/gameserver/model/itemcontainer/ClanWarehouse."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
        89: putfield      #47                 // Field _warehouse:Lext/mods/gameserver/model/itemcontainer/ItemContainer;
        92: aload_0
        93: iload_1
        94: putfield      #51                 // Field _clanId:I
        97: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       100: astore_3
       101: aload_3
       102: ldc           #61                 // String SELECT char_name,level,classid,obj_Id,title,power_grade,subpledge,apprentice,sponsor,sex,race FROM characters WHERE clanid=?
       104: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       109: astore        4
       111: aload         4
       113: iconst_1
       114: aload_0
       115: getfield      #51                 // Field _clanId:I
       118: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       123: aload         4
       125: invokeinterface #75,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       130: astore        5
       132: aload         5
       134: invokeinterface #79,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       139: ifeq          195
       142: new           #85                 // class ext/mods/gameserver/model/pledge/ClanMember
       145: dup
       146: aload_0
       147: aload         5
       149: invokespecial #87                 // Method ext/mods/gameserver/model/pledge/ClanMember."<init>":(Lext/mods/gameserver/model/pledge/Clan;Ljava/sql/ResultSet;)V
       152: astore        6
       154: aload         6
       156: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
       159: iload_2
       160: if_icmpne     172
       163: aload_0
       164: aload         6
       166: invokevirtual #94                 // Method setLeader:(Lext/mods/gameserver/model/pledge/ClanMember;)V
       169: goto          192
       172: aload_0
       173: getfield      #10                 // Field _members:Ljava/util/Map;
       176: aload         6
       178: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
       181: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       184: aload         6
       186: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       191: pop
       192: goto          132
       195: aload         5
       197: ifnull        239
       200: aload         5
       202: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       207: goto          239
       210: astore        6
       212: aload         5
       214: ifnull        236
       217: aload         5
       219: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       224: goto          236
       227: astore        7
       229: aload         6
       231: aload         7
       233: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       236: aload         6
       238: athrow
       239: aload         4
       241: ifnull        283
       244: aload         4
       246: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       251: goto          283
       254: astore        5
       256: aload         4
       258: ifnull        280
       261: aload         4
       263: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       268: goto          280
       271: astore        6
       273: aload         5
       275: aload         6
       277: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       280: aload         5
       282: athrow
       283: aload_3
       284: ldc           #120                // String SELECT sub_pledge_id,name,leader_id FROM clan_subpledges WHERE clan_id=?
       286: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       291: astore        4
       293: aload         4
       295: iconst_1
       296: aload_0
       297: getfield      #51                 // Field _clanId:I
       300: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       305: aload         4
       307: invokeinterface #75,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       312: astore        5
       314: aload         5
       316: invokeinterface #79,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       321: ifeq          380
       324: aload         5
       326: ldc           #122                // String sub_pledge_id
       328: invokeinterface #124,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       333: istore        6
       335: aload_0
       336: getfield      #25                 // Field _subPledges:Ljava/util/Map;
       339: iload         6
       341: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       344: new           #128                // class ext/mods/gameserver/model/pledge/SubPledge
       347: dup
       348: iload         6
       350: aload         5
       352: ldc           #130                // String name
       354: invokeinterface #132,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       359: aload         5
       361: ldc           #136                // String leader_id
       363: invokeinterface #124,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       368: invokespecial #138                // Method ext/mods/gameserver/model/pledge/SubPledge."<init>":(ILjava/lang/String;I)V
       371: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       376: pop
       377: goto          314
       380: aload         5
       382: ifnull        424
       385: aload         5
       387: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       392: goto          424
       395: astore        6
       397: aload         5
       399: ifnull        421
       402: aload         5
       404: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       409: goto          421
       412: astore        7
       414: aload         6
       416: aload         7
       418: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       421: aload         6
       423: athrow
       424: aload         4
       426: ifnull        468
       429: aload         4
       431: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       436: goto          468
       439: astore        5
       441: aload         4
       443: ifnull        465
       446: aload         4
       448: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       453: goto          465
       456: astore        6
       458: aload         5
       460: aload         6
       462: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       465: aload         5
       467: athrow
       468: aload_3
       469: ldc           #141                // String SELECT ranking,privs FROM clan_privs WHERE clan_id=?
       471: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       476: astore        4
       478: aload         4
       480: iconst_1
       481: aload_0
       482: getfield      #51                 // Field _clanId:I
       485: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       490: aload         4
       492: invokeinterface #75,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       497: astore        5
       499: aload         5
       501: invokeinterface #79,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       506: ifeq          546
       509: aload_0
       510: getfield      #22                 // Field _privileges:Ljava/util/Map;
       513: aload         5
       515: ldc           #143                // String ranking
       517: invokeinterface #124,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       522: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       525: aload         5
       527: ldc           #145                // String privs
       529: invokeinterface #124,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       534: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       537: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       542: pop
       543: goto          499
       546: aload         5
       548: ifnull        590
       551: aload         5
       553: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       558: goto          590
       561: astore        6
       563: aload         5
       565: ifnull        587
       568: aload         5
       570: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       575: goto          587
       578: astore        7
       580: aload         6
       582: aload         7
       584: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       587: aload         6
       589: athrow
       590: aload         4
       592: ifnull        634
       595: aload         4
       597: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       602: goto          634
       605: astore        5
       607: aload         4
       609: ifnull        631
       612: aload         4
       614: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       619: goto          631
       622: astore        6
       624: aload         5
       626: aload         6
       628: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       631: aload         5
       633: athrow
       634: aload_3
       635: ldc           #147                // String SELECT skill_id,skill_level FROM clan_skills WHERE clan_id=?
       637: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       642: astore        4
       644: aload         4
       646: iconst_1
       647: aload_0
       648: getfield      #51                 // Field _clanId:I
       651: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       656: aload         4
       658: invokeinterface #75,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       663: astore        5
       665: aload         5
       667: invokeinterface #79,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       672: ifeq          737
       675: aload         5
       677: ldc           #149                // String skill_id
       679: invokeinterface #124,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       684: istore        6
       686: aload         5
       688: ldc           #151                // String skill_level
       690: invokeinterface #124,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       695: istore        7
       697: invokestatic  #153                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       700: iload         6
       702: iload         7
       704: invokevirtual #159                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       707: astore        8
       709: aload         8
       711: ifnonnull     717
       714: goto          665
       717: aload_0
       718: getfield      #19                 // Field _skills:Ljava/util/Map;
       721: iload         6
       723: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       726: aload         8
       728: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       733: pop
       734: goto          665
       737: aload         5
       739: ifnull        781
       742: aload         5
       744: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       749: goto          781
       752: astore        6
       754: aload         5
       756: ifnull        778
       759: aload         5
       761: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       766: goto          778
       769: astore        7
       771: aload         6
       773: aload         7
       775: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       778: aload         6
       780: athrow
       781: aload         4
       783: ifnull        825
       786: aload         4
       788: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       793: goto          825
       796: astore        5
       798: aload         4
       800: ifnull        822
       803: aload         4
       805: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       810: goto          822
       813: astore        6
       815: aload         5
       817: aload         6
       819: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       822: aload         5
       824: athrow
       825: aload_3
       826: ifnull        865
       829: aload_3
       830: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       835: goto          865
       838: astore        4
       840: aload_3
       841: ifnull        862
       844: aload_3
       845: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       850: goto          862
       853: astore        5
       855: aload         4
       857: aload         5
       859: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       862: aload         4
       864: athrow
       865: goto          878
       868: astore_3
       869: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       872: ldc           #170                // String Error while restoring clan.
       874: aload_3
       875: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       878: aload_0
       879: getfield      #178                // Field _crestId:I
       882: ifeq          935
       885: invokestatic  #181                // Method ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
       888: getstatic     #186                // Field ext/mods/gameserver/enums/CrestType.PLEDGE:Lext/mods/gameserver/enums/CrestType;
       891: aload_0
       892: getfield      #178                // Field _crestId:I
       895: invokevirtual #192                // Method ext/mods/gameserver/data/cache/CrestCache.getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
       898: ifnonnull     935
       901: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       904: ldc           #196                // String Removing non-existent crest for clan {}, crestId: {}.
       906: iconst_2
       907: anewarray     #2                  // class java/lang/Object
       910: dup
       911: iconst_0
       912: aload_0
       913: invokevirtual #198                // Method toString:()Ljava/lang/String;
       916: aastore
       917: dup
       918: iconst_1
       919: aload_0
       920: getfield      #178                // Field _crestId:I
       923: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       926: aastore
       927: invokevirtual #202                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       930: aload_0
       931: iconst_0
       932: invokevirtual #206                // Method changeClanCrest:(I)V
       935: aload_0
       936: getfield      #210                // Field _crestLargeId:I
       939: ifeq          992
       942: invokestatic  #181                // Method ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
       945: getstatic     #213                // Field ext/mods/gameserver/enums/CrestType.PLEDGE_LARGE:Lext/mods/gameserver/enums/CrestType;
       948: aload_0
       949: getfield      #210                // Field _crestLargeId:I
       952: invokevirtual #192                // Method ext/mods/gameserver/data/cache/CrestCache.getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
       955: ifnonnull     992
       958: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       961: ldc           #216                // String Removing non-existent large crest for clan {}, crestLargeId: {}.
       963: iconst_2
       964: anewarray     #2                  // class java/lang/Object
       967: dup
       968: iconst_0
       969: aload_0
       970: invokevirtual #198                // Method toString:()Ljava/lang/String;
       973: aastore
       974: dup
       975: iconst_1
       976: aload_0
       977: getfield      #210                // Field _crestLargeId:I
       980: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       983: aastore
       984: invokevirtual #202                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       987: aload_0
       988: iconst_0
       989: invokevirtual #218                // Method changeLargeCrest:(I)V
       992: aload_0
       993: getfield      #221                // Field _allyCrestId:I
       996: ifeq          1050
       999: invokestatic  #181                // Method ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
      1002: getstatic     #224                // Field ext/mods/gameserver/enums/CrestType.ALLY:Lext/mods/gameserver/enums/CrestType;
      1005: aload_0
      1006: getfield      #221                // Field _allyCrestId:I
      1009: invokevirtual #192                // Method ext/mods/gameserver/data/cache/CrestCache.getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
      1012: ifnonnull     1050
      1015: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1018: ldc           #227                // String Removing non-existent ally crest for clan {}, allyCrestId: {}.
      1020: iconst_2
      1021: anewarray     #2                  // class java/lang/Object
      1024: dup
      1025: iconst_0
      1026: aload_0
      1027: invokevirtual #198                // Method toString:()Ljava/lang/String;
      1030: aastore
      1031: dup
      1032: iconst_1
      1033: aload_0
      1034: getfield      #221                // Field _allyCrestId:I
      1037: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1040: aastore
      1041: invokevirtual #202                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1044: aload_0
      1045: iconst_0
      1046: iconst_1
      1047: invokevirtual #229                // Method changeAllyCrest:(IZ)V
      1050: aload_0
      1051: getfield      #47                 // Field _warehouse:Lext/mods/gameserver/model/itemcontainer/ItemContainer;
      1054: invokevirtual #233                // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.restore:()V
      1057: return
      Exception table:
         from    to  target type
           132   195   210   Class java/lang/Throwable
           217   224   227   Class java/lang/Throwable
           111   239   254   Class java/lang/Throwable
           261   268   271   Class java/lang/Throwable
           314   380   395   Class java/lang/Throwable
           402   409   412   Class java/lang/Throwable
           293   424   439   Class java/lang/Throwable
           446   453   456   Class java/lang/Throwable
           499   546   561   Class java/lang/Throwable
           568   575   578   Class java/lang/Throwable
           478   590   605   Class java/lang/Throwable
           612   619   622   Class java/lang/Throwable
           665   737   752   Class java/lang/Throwable
           759   766   769   Class java/lang/Throwable
           644   781   796   Class java/lang/Throwable
           803   810   813   Class java/lang/Throwable
           101   825   838   Class java/lang/Throwable
           844   850   853   Class java/lang/Throwable
            97   865   868   Class java/lang/Exception
      LineNumberTable:
        line 180: 0
        line 128: 4
        line 129: 15
        line 130: 26
        line 131: 37
        line 132: 48
        line 134: 59
        line 135: 66
        line 136: 73
        line 138: 80
        line 181: 92
        line 183: 97
        line 185: 101
        line 187: 111
        line 189: 123
        line 191: 132
        line 193: 142
        line 194: 154
        line 195: 163
        line 197: 172
        line 198: 192
        line 199: 195
        line 189: 210
        line 200: 239
        line 185: 254
        line 202: 283
        line 204: 293
        line 206: 305
        line 208: 314
        line 210: 324
        line 212: 335
        line 213: 377
        line 214: 380
        line 206: 395
        line 215: 424
        line 202: 439
        line 217: 468
        line 219: 478
        line 221: 490
        line 223: 499
        line 224: 509
        line 225: 546
        line 221: 561
        line 226: 590
        line 217: 605
        line 228: 634
        line 230: 644
        line 232: 656
        line 234: 665
        line 236: 675
        line 237: 686
        line 239: 697
        line 240: 709
        line 241: 714
        line 243: 717
        line 244: 734
        line 245: 737
        line 232: 752
        line 246: 781
        line 228: 796
        line 247: 825
        line 183: 838
        line 251: 865
        line 248: 868
        line 250: 869
        line 253: 878
        line 255: 901
        line 256: 930
        line 259: 935
        line 261: 958
        line 262: 987
        line 265: 992
        line 267: 1015
        line 268: 1044
        line 271: 1050
        line 272: 1057
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          154      38     6 member   Lext/mods/gameserver/model/pledge/ClanMember;
          132     107     5    rs   Ljava/sql/ResultSet;
          111     172     4    ps   Ljava/sql/PreparedStatement;
          335      42     6    id   I
          314     110     5    rs   Ljava/sql/ResultSet;
          293     175     4    ps   Ljava/sql/PreparedStatement;
          499      91     5    rs   Ljava/sql/ResultSet;
          478     156     4    ps   Ljava/sql/PreparedStatement;
          686      48     6    id   I
          697      37     7 level   I
          709      25     8 skill   Lext/mods/gameserver/skills/L2Skill;
          665     116     5    rs   Ljava/sql/ResultSet;
          644     181     4    ps   Ljava/sql/PreparedStatement;
          101     764     3   con   Ljava/sql/Connection;
          869       9     3     e   Ljava/lang/Exception;
            0    1058     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0    1058     1 clanId   I
            0    1058     2 leaderId   I
      StackMapTable: number_of_entries = 52
        frame_type = 255 /* full_frame */
          offset_delta = 132
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember ]
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 2 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 65
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 46 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 254 /* append */
          offset_delta = 51
          locals = [ int, int, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 248 /* chop */
          offset_delta = 19
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */
        frame_type = 56 /* same */
        frame_type = 56 /* same */
        frame_type = 57 /* same */

  public ext.mods.gameserver.model.pledge.Clan(int, java.lang.String);
    descriptor: (ILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _members:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        19: dup
        20: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        23: putfield      #16                 // Field _warPenaltyExpiryTime:Ljava/util/Map;
        26: aload_0
        27: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        30: dup
        31: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        34: putfield      #19                 // Field _skills:Ljava/util/Map;
        37: aload_0
        38: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        41: dup
        42: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        45: putfield      #22                 // Field _privileges:Ljava/util/Map;
        48: aload_0
        49: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        52: dup
        53: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        56: putfield      #25                 // Field _subPledges:Ljava/util/Map;
        59: aload_0
        60: invokestatic  #28                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        63: putfield      #32                 // Field _atWarWith:Ljava/util/Set;
        66: aload_0
        67: invokestatic  #28                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        70: putfield      #36                 // Field _atWarAttackers:Ljava/util/Set;
        73: aload_0
        74: invokestatic  #28                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        77: putfield      #39                 // Field _graduates:Ljava/util/Set;
        80: aload_0
        81: new           #42                 // class ext/mods/gameserver/model/itemcontainer/ClanWarehouse
        84: dup
        85: aload_0
        86: invokespecial #44                 // Method ext/mods/gameserver/model/itemcontainer/ClanWarehouse."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
        89: putfield      #47                 // Field _warehouse:Lext/mods/gameserver/model/itemcontainer/ItemContainer;
        92: aload_0
        93: iload_1
        94: putfield      #51                 // Field _clanId:I
        97: aload_0
        98: aload_2
        99: putfield      #238                // Field _name:Ljava/lang/String;
       102: aload_0
       103: ldc           #242                // String
       105: putfield      #244                // Field _notice:Ljava/lang/String;
       108: aload_0
       109: ldc           #242                // String
       111: putfield      #247                // Field _introduction:Ljava/lang/String;
       114: return
      LineNumberTable:
        line 280: 0
        line 128: 4
        line 129: 15
        line 130: 26
        line 131: 37
        line 132: 48
        line 134: 59
        line 135: 66
        line 136: 73
        line 138: 80
        line 281: 92
        line 282: 97
        line 284: 102
        line 285: 108
        line 286: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     115     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     115     1 clanId   I
            0     115     2 clanName   Ljava/lang/String;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #238                // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 290: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setName(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #238                // Field _name:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 295: 0
        line 296: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1  name   Ljava/lang/String;

  public int getClanId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _clanId:I
         4: ireturn
      LineNumberTable:
        line 300: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setClanId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #51                 // Field _clanId:I
         5: return
      LineNumberTable:
        line 305: 0
        line 306: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1 clanId   I

  public ext.mods.gameserver.model.pledge.ClanMember getLeader();
    descriptor: ()Lext/mods/gameserver/model/pledge/ClanMember;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
         4: areturn
      LineNumberTable:
        line 310: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public int getLeaderId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
         4: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
         7: ireturn
      LineNumberTable:
        line 315: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public java.lang.String getLeaderName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
         4: ifnonnull     12
         7: ldc           #242                // String
         9: goto          19
        12: aload_0
        13: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
        16: invokevirtual #254                // Method ext/mods/gameserver/model/pledge/ClanMember.getName:()Ljava/lang/String;
        19: areturn
      LineNumberTable:
        line 320: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public void setLeader(ext.mods.gameserver.model.pledge.ClanMember);
    descriptor: (Lext/mods/gameserver/model/pledge/ClanMember;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
         5: aload_0
         6: getfield      #10                 // Field _members:Ljava/util/Map;
         9: aload_1
        10: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
        13: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: aload_1
        17: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        22: pop
        23: return
      LineNumberTable:
        line 325: 0
        line 326: 5
        line 327: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      24     1 leader   Lext/mods/gameserver/model/pledge/ClanMember;

  public void setNewLeader(ext.mods.gameserver.model.pledge.ClanMember);
    descriptor: (Lext/mods/gameserver/model/pledge/ClanMember;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=10, args_size=2
         0: aload_1
         1: invokevirtual #257                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
         4: astore_2
         5: aload_0
         6: invokevirtual #261                // Method getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
         9: invokevirtual #257                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
        12: astore_3
        13: aload_1
        14: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
        17: istore        4
        19: aload_0
        20: invokevirtual #265                // Method getLeaderId:()I
        23: istore        5
        25: aload_0
        26: aload_1
        27: putfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
        30: aload_0
        31: iconst_0
        32: putfield      #268                // Field _newLeaderId:I
        35: aload_0
        36: invokevirtual #271                // Method updateClanInDB:()V
        39: aload_3
        40: ifnull        90
        43: aload_3
        44: invokevirtual #274                // Method ext/mods/gameserver/model/actor/Player.isFlying:()Z
        47: ifeq          54
        50: aload_3
        51: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Player.dismount:()V
        54: aload_0
        55: getfield      #282                // Field _level:I
        58: getstatic     #285                // Field ext/mods/Config.MINIMUM_CLAN_LEVEL:I
        61: if_icmplt     68
        64: aload_3
        65: invokevirtual #290                // Method ext/mods/gameserver/model/actor/Player.removeSiegeSkills:()V
        68: aload_3
        69: bipush        6
        71: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.setPowerGrade:(I)V
        74: aload_3
        75: aload_3
        76: invokestatic  #296                // Method ext/mods/gameserver/model/pledge/ClanMember.calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
        79: invokevirtual #300                // Method ext/mods/gameserver/model/actor/Player.setPledgeClass:(I)V
        82: aload_3
        83: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        86: aload_3
        87: invokevirtual #306                // Method ext/mods/gameserver/model/actor/Player.checkItemRestriction:()V
        90: aload_2
        91: ifnull        125
        94: aload_2
        95: iconst_0
        96: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.setPowerGrade:(I)V
        99: aload_2
       100: aload_2
       101: invokestatic  #296                // Method ext/mods/gameserver/model/pledge/ClanMember.calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
       104: invokevirtual #300                // Method ext/mods/gameserver/model/actor/Player.setPledgeClass:(I)V
       107: aload_0
       108: getfield      #282                // Field _level:I
       111: getstatic     #285                // Field ext/mods/Config.MINIMUM_CLAN_LEVEL:I
       114: if_icmplt     121
       117: aload_2
       118: invokevirtual #309                // Method ext/mods/gameserver/model/actor/Player.addSiegeSkills:()V
       121: aload_2
       122: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       125: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       128: astore        6
       130: aload         6
       132: ldc_w         #312                // String UPDATE characters SET power_grade=? WHERE obj_Id=?
       135: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       140: astore        7
       142: aload         7
       144: iconst_1
       145: iconst_0
       146: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       151: aload         7
       153: iconst_2
       154: iload         4
       156: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       161: aload         7
       163: invokeinterface #314,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       168: aload         7
       170: iconst_1
       171: bipush        6
       173: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       178: aload         7
       180: iconst_2
       181: iload         5
       183: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       188: aload         7
       190: invokeinterface #314,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       195: aload         7
       197: invokeinterface #317,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       202: pop
       203: aload         7
       205: ifnull        247
       208: aload         7
       210: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       215: goto          247
       218: astore        8
       220: aload         7
       222: ifnull        244
       225: aload         7
       227: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       232: goto          244
       235: astore        9
       237: aload         8
       239: aload         9
       241: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       244: aload         8
       246: athrow
       247: aload         6
       249: ifnull        291
       252: aload         6
       254: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       259: goto          291
       262: astore        7
       264: aload         6
       266: ifnull        288
       269: aload         6
       271: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       276: goto          288
       279: astore        8
       281: aload         7
       283: aload         8
       285: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       288: aload         7
       290: athrow
       291: goto          307
       294: astore        6
       296: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       299: ldc_w         #321                // String Couldn\'t update clan privs.
       302: aload         6
       304: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       307: aload_0
       308: invokevirtual #323                // Method broadcastClanStatus:()V
       311: aload_0
       312: iconst_1
       313: anewarray     #326                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       316: dup
       317: iconst_0
       318: getstatic     #328                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_LEADER_PRIVILEGES_HAVE_BEEN_TRANSFERRED_TO_S1:Lext/mods/gameserver/network/SystemMessageId;
       321: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       324: aload_1
       325: invokevirtual #254                // Method ext/mods/gameserver/model/pledge/ClanMember.getName:()Ljava/lang/String;
       328: invokevirtual #340                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       331: aastore
       332: invokevirtual #344                // Method broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       335: return
      Exception table:
         from    to  target type
           142   203   218   Class java/lang/Throwable
           225   232   235   Class java/lang/Throwable
           130   247   262   Class java/lang/Throwable
           269   276   279   Class java/lang/Throwable
           125   291   294   Class java/lang/Exception
      LineNumberTable:
        line 331: 0
        line 332: 5
        line 334: 13
        line 335: 19
        line 337: 25
        line 338: 30
        line 340: 35
        line 342: 39
        line 344: 43
        line 345: 50
        line 347: 54
        line 348: 64
        line 350: 68
        line 351: 74
        line 352: 82
        line 353: 86
        line 356: 90
        line 358: 94
        line 359: 99
        line 361: 107
        line 362: 117
        line 364: 121
        line 367: 125
        line 368: 130
        line 370: 142
        line 371: 151
        line 372: 161
        line 374: 168
        line 375: 178
        line 376: 188
        line 378: 195
        line 379: 203
        line 367: 218
        line 379: 247
        line 367: 262
        line 383: 291
        line 380: 294
        line 382: 296
        line 385: 307
        line 386: 311
        line 387: 335
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          142     105     7    ps   Ljava/sql/PreparedStatement;
          130     161     6   con   Ljava/sql/Connection;
          296      11     6     e   Ljava/lang/Exception;
            0     336     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     336     1 member   Lext/mods/gameserver/model/pledge/ClanMember;
            5     331     2 newLeader   Lext/mods/gameserver/model/actor/Player;
           13     323     3 exLeader   Lext/mods/gameserver/model/actor/Player;
           19     317     4 newLeaderId   I
           25     311     5 exLeaderId   I
      StackMapTable: number_of_entries = 15
        frame_type = 255 /* full_frame */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/ClanMember, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int, int ]
          stack = []
        frame_type = 13 /* same */
        frame_type = 21 /* same */
        frame_type = 30 /* same */
        frame_type = 3 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 92
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/ClanMember, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/ClanMember, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/ClanMember, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */

  public int getNewLeaderId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #268                // Field _newLeaderId:I
         4: ireturn
      LineNumberTable:
        line 391: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setNewLeaderId(int, boolean);
    descriptor: (IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: putfield      #268                // Field _newLeaderId:I
         5: iload_2
         6: ifeq          13
         9: aload_0
        10: invokevirtual #271                // Method updateClanInDB:()V
        13: return
      LineNumberTable:
        line 396: 0
        line 398: 5
        line 399: 9
        line 400: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      14     1 objectId   I
            0      14     2 storeInDb   Z
      StackMapTable: number_of_entries = 1
        frame_type = 13 /* same */

  public java.lang.String getAllyName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #348                // Field _allyName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 404: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setAllyName(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #348                // Field _allyName:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 409: 0
        line 410: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1 allyName   Ljava/lang/String;

  public int getAllyId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #351                // Field _allyId:I
         4: ireturn
      LineNumberTable:
        line 414: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setAllyId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #351                // Field _allyId:I
         5: return
      LineNumberTable:
        line 419: 0
        line 420: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1 allyId   I

  public int getAllyCrestId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #221                // Field _allyCrestId:I
         4: ireturn
      LineNumberTable:
        line 424: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setAllyCrestId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #221                // Field _allyCrestId:I
         5: return
      LineNumberTable:
        line 429: 0
        line 430: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1 allyCrestId   I

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #282                // Field _level:I
         4: ireturn
      LineNumberTable:
        line 434: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setLevel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #282                // Field _level:I
         5: getstatic     #354                // Field ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
         8: ifeq          73
        11: aload_0
        12: getfield      #282                // Field _level:I
        15: iconst_2
        16: if_icmplt     73
        19: aload_0
        20: getfield      #358                // Field _annBoard:Lext/mods/gameserver/communitybbs/model/Forum;
        23: ifnonnull     46
        26: aload_0
        27: invokestatic  #362                // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
        30: getstatic     #367                // Field ext/mods/gameserver/enums/bbs/ForumType.CLAN_ANN:Lext/mods/gameserver/enums/bbs/ForumType;
        33: getstatic     #373                // Field ext/mods/gameserver/enums/bbs/ForumAccess.READ:Lext/mods/gameserver/enums/bbs/ForumAccess;
        36: aload_0
        37: getfield      #51                 // Field _clanId:I
        40: invokevirtual #379                // Method ext/mods/gameserver/communitybbs/CommunityBoard.getOrCreateForum:(Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)Lext/mods/gameserver/communitybbs/model/Forum;
        43: putfield      #358                // Field _annBoard:Lext/mods/gameserver/communitybbs/model/Forum;
        46: aload_0
        47: getfield      #383                // Field _cbbBoard:Lext/mods/gameserver/communitybbs/model/Forum;
        50: ifnonnull     73
        53: aload_0
        54: invokestatic  #362                // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
        57: getstatic     #386                // Field ext/mods/gameserver/enums/bbs/ForumType.CLAN_CBB:Lext/mods/gameserver/enums/bbs/ForumType;
        60: getstatic     #373                // Field ext/mods/gameserver/enums/bbs/ForumAccess.READ:Lext/mods/gameserver/enums/bbs/ForumAccess;
        63: aload_0
        64: getfield      #51                 // Field _clanId:I
        67: invokevirtual #379                // Method ext/mods/gameserver/communitybbs/CommunityBoard.getOrCreateForum:(Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)Lext/mods/gameserver/communitybbs/model/Forum;
        70: putfield      #383                // Field _cbbBoard:Lext/mods/gameserver/communitybbs/model/Forum;
        73: return
      LineNumberTable:
        line 443: 0
        line 445: 5
        line 447: 19
        line 448: 26
        line 450: 46
        line 451: 53
        line 453: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      74     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      74     1 level   I
      StackMapTable: number_of_entries = 2
        frame_type = 46 /* same */
        frame_type = 26 /* same */

  public int getCastleId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #389                // Field _castleId:I
         4: ireturn
      LineNumberTable:
        line 457: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public boolean hasCastle();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #389                // Field _castleId:I
         4: ifle          11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 462: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setCastle(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #389                // Field _castleId:I
         5: return
      LineNumberTable:
        line 467: 0
        line 468: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1 castle   I

  public int getClanHallId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #392                // Field _chId:I
         4: ireturn
      LineNumberTable:
        line 472: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public boolean hasClanHall();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #392                // Field _chId:I
         4: ifle          11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 477: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setClanHallId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #392                // Field _chId:I
         5: return
      LineNumberTable:
        line 482: 0
        line 483: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1    id   I

  public int getCrestId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #178                // Field _crestId:I
         4: ireturn
      LineNumberTable:
        line 487: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setCrestId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #178                // Field _crestId:I
         5: return
      LineNumberTable:
        line 492: 0
        line 493: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1 crestId   I

  public int getCrestLargeId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #210                // Field _crestLargeId:I
         4: ireturn
      LineNumberTable:
        line 497: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setCrestLargeId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #210                // Field _crestLargeId:I
         5: return
      LineNumberTable:
        line 502: 0
        line 503: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1 crestLargeId   I

  public int getSiegeKills();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #395                // Field _siegeKills:I
         4: ireturn
      LineNumberTable:
        line 507: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public int getSiegeDeaths();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #398                // Field _siegeDeaths:I
         4: ireturn
      LineNumberTable:
        line 512: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setSiegeKills(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #395                // Field _siegeKills:I
         5: return
      LineNumberTable:
        line 517: 0
        line 518: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1 value   I

  public void setSiegeDeaths(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #398                // Field _siegeDeaths:I
         5: return
      LineNumberTable:
        line 522: 0
        line 523: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1 value   I

  public ext.mods.gameserver.model.actor.Npc getFlag();
    descriptor: ()Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #401                // Field _flag:Lext/mods/gameserver/model/actor/Npc;
         4: areturn
      LineNumberTable:
        line 527: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setFlag(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     18
         4: aload_0
         5: getfield      #401                // Field _flag:Lext/mods/gameserver/model/actor/Npc;
         8: ifnull        18
        11: aload_0
        12: getfield      #401                // Field _flag:Lext/mods/gameserver/model/actor/Npc;
        15: invokevirtual #405                // Method ext/mods/gameserver/model/actor/Npc.deleteMe:()V
        18: aload_0
        19: aload_1
        20: putfield      #401                // Field _flag:Lext/mods/gameserver/model/actor/Npc;
        23: return
      LineNumberTable:
        line 532: 0
        line 533: 11
        line 535: 18
        line 536: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      24     1  flag   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  public long getAllyPenaltyExpiryTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #410                // Field _allyPenaltyExpiryTime:J
         4: lreturn
      LineNumberTable:
        line 540: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public int getAllyPenaltyType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #414                // Field _allyPenaltyType:I
         4: ireturn
      LineNumberTable:
        line 545: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setAllyPenaltyExpiryTime(long, int);
    descriptor: (JI)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: lload_1
         2: putfield      #410                // Field _allyPenaltyExpiryTime:J
         5: aload_0
         6: iload_3
         7: putfield      #414                // Field _allyPenaltyType:I
        10: return
      LineNumberTable:
        line 550: 0
        line 551: 5
        line 552: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      11     1 expiryTime   J
            0      11     3 penaltyType   I

  public long getCharPenaltyExpiryTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #417                // Field _charPenaltyExpiryTime:J
         4: lreturn
      LineNumberTable:
        line 556: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setCharPenaltyExpiryTime(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #417                // Field _charPenaltyExpiryTime:J
         5: return
      LineNumberTable:
        line 561: 0
        line 562: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1  time   J

  public long getDissolvingExpiryTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #420                // Field _dissolvingExpiryTime:J
         4: lreturn
      LineNumberTable:
        line 566: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setDissolvingExpiryTime(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #420                // Field _dissolvingExpiryTime:J
         5: return
      LineNumberTable:
        line 571: 0
        line 572: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1  time   J

  public ext.mods.gameserver.communitybbs.model.Forum getAnnBoard();
    descriptor: ()Lext/mods/gameserver/communitybbs/model/Forum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #358                // Field _annBoard:Lext/mods/gameserver/communitybbs/model/Forum;
         4: areturn
      LineNumberTable:
        line 576: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public ext.mods.gameserver.communitybbs.model.Forum getCbbBoard();
    descriptor: ()Lext/mods/gameserver/communitybbs/model/Forum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #383                // Field _cbbBoard:Lext/mods/gameserver/communitybbs/model/Forum;
         4: areturn
      LineNumberTable:
        line 581: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public ext.mods.gameserver.model.pledge.ClanMember getClanMember(int);
    descriptor: (I)Lext/mods/gameserver/model/pledge/ClanMember;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _members:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #423,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #85                 // class ext/mods/gameserver/model/pledge/ClanMember
        16: areturn
      LineNumberTable:
        line 590: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      17     1 objectId   I

  public ext.mods.gameserver.model.pledge.ClanMember getClanMember(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/ClanMember;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _members:Ljava/util/Map;
         4: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #431,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #437,  0            // InvokeDynamic #0:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        20: invokeinterface #441,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #447,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #451                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #85                 // class ext/mods/gameserver/model/pledge/ClanMember
        37: areturn
      LineNumberTable:
        line 599: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      38     1  name   Ljava/lang/String;

  public boolean isMember(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _members:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #456,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ireturn
      LineNumberTable:
        line 608: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      14     1 objectId   I

  public void addClanMember(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=2
         0: new           #85                 // class ext/mods/gameserver/model/pledge/ClanMember
         3: dup
         4: aload_0
         5: aload_1
         6: invokespecial #460                // Method ext/mods/gameserver/model/pledge/ClanMember."<init>":(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
         9: astore_2
        10: aload_2
        11: aload_1
        12: invokevirtual #463                // Method ext/mods/gameserver/model/pledge/ClanMember.setPlayerInstance:(Lext/mods/gameserver/model/actor/Player;)V
        15: aload_0
        16: getfield      #10                 // Field _members:Ljava/util/Map;
        19: aload_2
        20: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
        23: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        26: aload_2
        27: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        32: pop
        33: aload_1
        34: aload_0
        35: invokevirtual #467                // Method ext/mods/gameserver/model/actor/Player.setClan:(Lext/mods/gameserver/model/pledge/Clan;)V
        38: aload_1
        39: aload_1
        40: invokestatic  #296                // Method ext/mods/gameserver/model/pledge/ClanMember.calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
        43: invokevirtual #300                // Method ext/mods/gameserver/model/actor/Player.setPledgeClass:(I)V
        46: invokestatic  #470                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        49: invokevirtual #475                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
        52: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        57: astore_3
        58: aload_3
        59: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        64: ifeq          149
        67: aload_3
        68: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        73: checkcast     #490                // class ext/mods/gameserver/model/residence/castle/Castle
        76: astore        4
        78: aload         4
        80: invokevirtual #492                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        83: astore        5
        85: aload         5
        87: invokevirtual #496                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        90: ifne          96
        93: goto          58
        96: aload         5
        98: aload_0
        99: getstatic     #501                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       102: invokevirtual #507                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
       105: ifeq          116
       108: aload_1
       109: iconst_1
       110: invokevirtual #511                // Method ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
       113: goto          146
       116: aload         5
       118: aload_0
       119: iconst_2
       120: anewarray     #502                // class ext/mods/gameserver/enums/SiegeSide
       123: dup
       124: iconst_0
       125: getstatic     #514                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       128: aastore
       129: dup
       130: iconst_1
       131: getstatic     #517                // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
       134: aastore
       135: invokevirtual #520                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
       138: ifeq          146
       141: aload_1
       142: iconst_2
       143: invokevirtual #511                // Method ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
       146: goto          58
       149: aload_1
       150: new           #524                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate
       153: dup
       154: aload_1
       155: invokespecial #526                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       158: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       161: aload_1
       162: new           #532                // class ext/mods/gameserver/network/serverpackets/UserInfo
       165: dup
       166: aload_1
       167: invokespecial #534                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       170: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       173: return
      LineNumberTable:
        line 623: 0
        line 624: 10
        line 626: 15
        line 628: 33
        line 629: 38
        line 631: 46
        line 633: 78
        line 634: 85
        line 635: 93
        line 637: 96
        line 638: 108
        line 639: 116
        line 640: 141
        line 641: 146
        line 643: 149
        line 644: 161
        line 645: 173
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           85      61     5 siege   Lext/mods/gameserver/model/residence/castle/Siege;
           78      68     4 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0     174     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     174     1 player   Lext/mods/gameserver/model/actor/Player;
           10     164     2 member   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 19 /* same */
        frame_type = 249 /* chop */
          offset_delta = 29
        frame_type = 250 /* chop */
          offset_delta = 2

  public void removeClanMember(int, long);
    descriptor: (IJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=10, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _members:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #535,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #85                 // class ext/mods/gameserver/model/pledge/ClanMember
        16: astore        4
        18: aload         4
        20: ifnonnull     24
        23: return
        24: aload_0
        25: iload_1
        26: invokevirtual #538                // Method getLeaderSubPledge:(I)I
        29: istore        5
        31: iload         5
        33: ifeq          61
        36: aload_0
        37: iload         5
        39: invokevirtual #542                // Method getSubPledge:(I)Lext/mods/gameserver/model/pledge/SubPledge;
        42: astore        6
        44: aload         6
        46: ifnull        61
        49: aload         6
        51: iconst_0
        52: invokevirtual #546                // Method ext/mods/gameserver/model/pledge/SubPledge.setLeaderId:(I)V
        55: aload_0
        56: aload         6
        58: invokevirtual #549                // Method updateSubPledgeInDB:(Lext/mods/gameserver/model/pledge/SubPledge;)V
        61: aload         4
        63: invokevirtual #553                // Method ext/mods/gameserver/model/pledge/ClanMember.getApprentice:()I
        66: ifeq          119
        69: aload_0
        70: aload         4
        72: invokevirtual #553                // Method ext/mods/gameserver/model/pledge/ClanMember.getApprentice:()I
        75: invokevirtual #556                // Method getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
        78: astore        6
        80: aload         6
        82: ifnull        119
        85: aload         6
        87: invokevirtual #257                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
        90: ifnull        105
        93: aload         6
        95: invokevirtual #257                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
        98: iconst_0
        99: invokevirtual #560                // Method ext/mods/gameserver/model/actor/Player.setSponsor:(I)V
       102: goto          112
       105: aload         6
       107: iconst_0
       108: iconst_0
       109: invokevirtual #563                // Method ext/mods/gameserver/model/pledge/ClanMember.setApprenticeAndSponsor:(II)V
       112: aload         6
       114: iconst_0
       115: iconst_0
       116: invokevirtual #566                // Method ext/mods/gameserver/model/pledge/ClanMember.saveApprenticeAndSponsor:(II)V
       119: aload         4
       121: invokevirtual #569                // Method ext/mods/gameserver/model/pledge/ClanMember.getSponsor:()I
       124: ifeq          177
       127: aload_0
       128: aload         4
       130: invokevirtual #569                // Method ext/mods/gameserver/model/pledge/ClanMember.getSponsor:()I
       133: invokevirtual #556                // Method getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
       136: astore        6
       138: aload         6
       140: ifnull        177
       143: aload         6
       145: invokevirtual #257                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
       148: ifnull        163
       151: aload         6
       153: invokevirtual #257                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
       156: iconst_0
       157: invokevirtual #572                // Method ext/mods/gameserver/model/actor/Player.setApprentice:(I)V
       160: goto          170
       163: aload         6
       165: iconst_0
       166: iconst_0
       167: invokevirtual #563                // Method ext/mods/gameserver/model/pledge/ClanMember.setApprenticeAndSponsor:(II)V
       170: aload         6
       172: iconst_0
       173: iconst_0
       174: invokevirtual #566                // Method ext/mods/gameserver/model/pledge/ClanMember.saveApprenticeAndSponsor:(II)V
       177: aload         4
       179: iconst_0
       180: iconst_0
       181: invokevirtual #566                // Method ext/mods/gameserver/model/pledge/ClanMember.saveApprenticeAndSponsor:(II)V
       184: aload_0
       185: invokevirtual #575                // Method hasCastle:()Z
       188: ifeq          206
       191: invokestatic  #470                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       194: aload_0
       195: getfield      #389                // Field _castleId:I
       198: invokevirtual #578                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
       201: aload         4
       203: invokevirtual #582                // Method ext/mods/gameserver/model/residence/castle/Castle.checkItemsForMember:(Lext/mods/gameserver/model/pledge/ClanMember;)V
       206: aload         4
       208: invokevirtual #585                // Method ext/mods/gameserver/model/pledge/ClanMember.isOnline:()Z
       211: ifeq          487
       214: aload         4
       216: invokevirtual #257                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
       219: astore        6
       221: invokestatic  #470                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       224: invokevirtual #475                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
       227: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       232: astore        7
       234: aload         7
       236: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       241: ifeq          296
       244: aload         7
       246: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       251: checkcast     #490                // class ext/mods/gameserver/model/residence/castle/Castle
       254: astore        8
       256: aload         6
       258: invokevirtual #588                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       261: ifeq          272
       264: aload         8
       266: invokevirtual #591                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
       269: goto          277
       272: aload         8
       274: invokevirtual #595                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
       277: astore        9
       279: aload         9
       281: aload         6
       283: invokedynamic #598,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       288: invokeinterface #602,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       293: goto          234
       296: aload         6
       298: invokevirtual #606                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       301: ifne          311
       304: aload         6
       306: ldc           #242                // String
       308: invokevirtual #609                // Method ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
       311: aload         6
       313: invokevirtual #613                // Method ext/mods/gameserver/model/actor/Player.getActiveWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
       316: ifnull        325
       319: aload         6
       321: aconst_null
       322: invokevirtual #617                // Method ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
       325: aload         6
       327: iconst_0
       328: invokevirtual #572                // Method ext/mods/gameserver/model/actor/Player.setApprentice:(I)V
       331: aload         6
       333: iconst_0
       334: invokevirtual #560                // Method ext/mods/gameserver/model/actor/Player.setSponsor:(I)V
       337: aload         6
       339: iconst_0
       340: invokevirtual #511                // Method ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
       343: aload         6
       345: invokevirtual #588                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       348: ifeq          373
       351: aload         6
       353: invokevirtual #290                // Method ext/mods/gameserver/model/actor/Player.removeSiegeSkills:()V
       356: aload         6
       358: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
       361: getstatic     #627                // Field ext/mods/Config.CLAN_CREATE_DAYS:I
       364: i2l
       365: ldc2_w        #630                // long 86400000l
       368: lmul
       369: ladd
       370: invokevirtual #632                // Method ext/mods/gameserver/model/actor/Player.setClanCreateExpiryTime:(J)V
       373: aload_0
       374: getfield      #19                 // Field _skills:Ljava/util/Map;
       377: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       382: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       387: astore        7
       389: aload         7
       391: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       396: ifeq          426
       399: aload         7
       401: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       406: checkcast     #636                // class ext/mods/gameserver/skills/L2Skill
       409: astore        8
       411: aload         6
       413: aload         8
       415: invokevirtual #638                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       418: iconst_0
       419: invokevirtual #641                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       422: pop
       423: goto          389
       426: aload         6
       428: new           #645                // class ext/mods/gameserver/network/serverpackets/SkillList
       431: dup
       432: aload         6
       434: invokespecial #647                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       437: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       440: aload         6
       442: aconst_null
       443: invokevirtual #467                // Method ext/mods/gameserver/model/actor/Player.setClan:(Lext/mods/gameserver/model/pledge/Clan;)V
       446: aload         4
       448: invokevirtual #648                // Method ext/mods/gameserver/model/pledge/ClanMember.getPledgeType:()I
       451: iconst_m1
       452: if_icmpeq     461
       455: aload         6
       457: lload_2
       458: invokevirtual #651                // Method ext/mods/gameserver/model/actor/Player.setClanJoinExpiryTime:(J)V
       461: aload         6
       463: aload         6
       465: invokestatic  #296                // Method ext/mods/gameserver/model/pledge/ClanMember.calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
       468: invokevirtual #300                // Method ext/mods/gameserver/model/actor/Player.setPledgeClass:(I)V
       471: aload         6
       473: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       476: aload         6
       478: getstatic     #654                // Field ext/mods/gameserver/network/serverpackets/PledgeShowMemberListDeleteAll.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PledgeShowMemberListDeleteAll;
       481: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       484: goto          837
       487: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       490: astore        6
       492: aload         6
       494: ldc_w         #660                // String UPDATE characters SET clanid=0, title=?, clan_join_expiry_time=?, clan_create_expiry_time=?, wantspeace=0, subpledge=0, lvl_joined_academy=0, apprentice=0, sponsor=0 WHERE obj_Id=?
       497: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       502: astore        7
       504: aload         7
       506: iconst_1
       507: ldc           #242                // String
       509: invokeinterface #662,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       514: aload         7
       516: iconst_2
       517: lload_2
       518: invokeinterface #666,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       523: aload         7
       525: iconst_3
       526: aload_0
       527: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
       530: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
       533: iload_1
       534: if_icmpne     552
       537: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
       540: getstatic     #627                // Field ext/mods/Config.CLAN_CREATE_DAYS:I
       543: i2l
       544: ldc2_w        #630                // long 86400000l
       547: lmul
       548: ladd
       549: goto          553
       552: lconst_0
       553: invokeinterface #666,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       558: aload         7
       560: iconst_4
       561: aload         4
       563: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
       566: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       571: aload         7
       573: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       578: pop
       579: aload         7
       581: ifnull        623
       584: aload         7
       586: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       591: goto          623
       594: astore        8
       596: aload         7
       598: ifnull        620
       601: aload         7
       603: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       608: goto          620
       611: astore        9
       613: aload         8
       615: aload         9
       617: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       620: aload         8
       622: athrow
       623: aload         6
       625: ldc_w         #673                // String UPDATE characters SET apprentice=0 WHERE apprentice=?
       628: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       633: astore        7
       635: aload         7
       637: iconst_1
       638: aload         4
       640: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
       643: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       648: aload         7
       650: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       655: pop
       656: aload         7
       658: ifnull        700
       661: aload         7
       663: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       668: goto          700
       671: astore        8
       673: aload         7
       675: ifnull        697
       678: aload         7
       680: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       685: goto          697
       688: astore        9
       690: aload         8
       692: aload         9
       694: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       697: aload         8
       699: athrow
       700: aload         6
       702: ldc_w         #675                // String UPDATE characters SET sponsor=0 WHERE sponsor=?
       705: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       710: astore        7
       712: aload         7
       714: iconst_1
       715: aload         4
       717: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
       720: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       725: aload         7
       727: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       732: pop
       733: aload         7
       735: ifnull        777
       738: aload         7
       740: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       745: goto          777
       748: astore        8
       750: aload         7
       752: ifnull        774
       755: aload         7
       757: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       762: goto          774
       765: astore        9
       767: aload         8
       769: aload         9
       771: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       774: aload         8
       776: athrow
       777: aload         6
       779: ifnull        821
       782: aload         6
       784: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       789: goto          821
       792: astore        7
       794: aload         6
       796: ifnull        818
       799: aload         6
       801: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       806: goto          818
       809: astore        8
       811: aload         7
       813: aload         8
       815: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       818: aload         7
       820: athrow
       821: goto          837
       824: astore        6
       826: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       829: ldc_w         #677                // String Error while removing clan member.
       832: aload         6
       834: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       837: return
      Exception table:
         from    to  target type
           504   579   594   Class java/lang/Throwable
           601   608   611   Class java/lang/Throwable
           635   656   671   Class java/lang/Throwable
           678   685   688   Class java/lang/Throwable
           712   733   748   Class java/lang/Throwable
           755   762   765   Class java/lang/Throwable
           492   777   792   Class java/lang/Throwable
           799   806   809   Class java/lang/Throwable
           487   821   824   Class java/lang/Exception
      LineNumberTable:
        line 654: 0
        line 655: 18
        line 656: 23
        line 658: 24
        line 659: 31
        line 661: 36
        line 662: 44
        line 664: 49
        line 666: 55
        line 670: 61
        line 672: 69
        line 673: 80
        line 675: 85
        line 676: 93
        line 678: 105
        line 680: 112
        line 684: 119
        line 686: 127
        line 687: 138
        line 689: 143
        line 690: 151
        line 692: 163
        line 694: 170
        line 697: 177
        line 699: 184
        line 700: 191
        line 702: 206
        line 704: 214
        line 706: 221
        line 708: 256
        line 709: 279
        line 713: 293
        line 715: 296
        line 716: 304
        line 718: 311
        line 719: 319
        line 721: 325
        line 722: 331
        line 723: 337
        line 725: 343
        line 727: 351
        line 728: 356
        line 731: 373
        line 732: 411
        line 734: 426
        line 735: 440
        line 737: 446
        line 738: 455
        line 740: 461
        line 741: 471
        line 743: 476
        line 744: 484
        line 747: 487
        line 749: 492
        line 751: 504
        line 752: 514
        line 753: 523
        line 754: 558
        line 755: 571
        line 756: 579
        line 749: 594
        line 758: 623
        line 760: 635
        line 761: 648
        line 762: 656
        line 758: 671
        line 764: 700
        line 766: 712
        line 767: 725
        line 768: 733
        line 764: 748
        line 769: 777
        line 747: 792
        line 773: 821
        line 770: 824
        line 772: 826
        line 775: 837
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      17     6 pledge   Lext/mods/gameserver/model/pledge/SubPledge;
           80      39     6 apprentice   Lext/mods/gameserver/model/pledge/ClanMember;
          138      39     6 sponsor   Lext/mods/gameserver/model/pledge/ClanMember;
          279      14     9 skill   Ljava/util/Map;
          256      37     8 castle   Lext/mods/gameserver/model/residence/castle/Castle;
          411      12     8 skill   Lext/mods/gameserver/skills/L2Skill;
          221     263     6 player   Lext/mods/gameserver/model/actor/Player;
          504     119     7    ps   Ljava/sql/PreparedStatement;
          635      65     7    ps   Ljava/sql/PreparedStatement;
          712      65     7    ps   Ljava/sql/PreparedStatement;
          492     329     6   con   Ljava/sql/Connection;
          826      11     6     e   Ljava/lang/Exception;
            0     838     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     838     1 objectId   I
            0     838     2 clanJoinExpiryTime   J
           18     820     4 exMember   Lext/mods/gameserver/model/pledge/ClanMember;
           31     807     5 subPledgeId   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          279      14     9 skill   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 40
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember ]
        frame_type = 6 /* same */
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember ]
        frame_type = 6 /* same */
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 28 /* same */
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 249 /* chop */
          offset_delta = 18
        frame_type = 14 /* same */
        frame_type = 13 /* same */
        frame_type = 47 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 34 /* same */
        frame_type = 250 /* chop */
          offset_delta = 25
        frame_type = 255 /* full_frame */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, long, class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, long, class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int, long ]
        frame_type = 104 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, long, class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, long, class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, long, class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, long, class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, long, class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, long, class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */

  public java.util.Collection<ext.mods.gameserver.model.pledge.ClanMember> getMembers();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _members:Ljava/util/Map;
         4: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 779: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/pledge/Clan;
    Signature: #1462                        // ()Ljava/util/Collection<Lext/mods/gameserver/model/pledge/ClanMember;>;

  public int getMembersCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _members:Ljava/util/Map;
         4: invokeinterface #679,  1          // InterfaceMethod java/util/Map.size:()I
         9: ireturn
      LineNumberTable:
        line 784: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public int getSubPledgeMembersCount(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _members:Ljava/util/Map;
         4: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #431,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: iload_1
        15: invokedynamic #682,  0            // InvokeDynamic #2:test:(I)Ljava/util/function/Predicate;
        20: invokeinterface #441,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #685,  1          // InterfaceMethod java/util/stream/Stream.count:()J
        30: l2i
        31: ireturn
      LineNumberTable:
        line 789: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      32     1 pledgeType   I

  public java.lang.String getSubPledgeLeaderName(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=2
         0: iload_1
         1: ifne          12
         4: aload_0
         5: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
         8: invokevirtual #254                // Method ext/mods/gameserver/model/pledge/ClanMember.getName:()Ljava/lang/String;
        11: areturn
        12: aload_0
        13: getfield      #25                 // Field _subPledges:Ljava/util/Map;
        16: iload_1
        17: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        20: invokeinterface #423,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        25: checkcast     #128                // class ext/mods/gameserver/model/pledge/SubPledge
        28: astore_2
        29: aload_2
        30: invokevirtual #688                // Method ext/mods/gameserver/model/pledge/SubPledge.getLeaderId:()I
        33: istore_3
        34: aload_2
        35: invokevirtual #689                // Method ext/mods/gameserver/model/pledge/SubPledge.getId:()I
        38: iconst_m1
        39: if_icmpeq     46
        42: iload_3
        43: ifne          49
        46: ldc           #242                // String
        48: areturn
        49: aload_0
        50: getfield      #10                 // Field _members:Ljava/util/Map;
        53: iload_3
        54: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        57: invokeinterface #456,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        62: ifne          95
        65: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        68: ldc_w         #690                // String SubPledge leader {} is missing from clan: {}.
        71: iconst_2
        72: anewarray     #2                  // class java/lang/Object
        75: dup
        76: iconst_0
        77: iload_3
        78: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        81: aastore
        82: dup
        83: iconst_1
        84: aload_0
        85: invokevirtual #198                // Method toString:()Ljava/lang/String;
        88: aastore
        89: invokevirtual #202                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        92: ldc           #242                // String
        94: areturn
        95: aload_0
        96: getfield      #10                 // Field _members:Ljava/util/Map;
        99: iload_3
       100: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       103: invokeinterface #423,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       108: checkcast     #85                 // class ext/mods/gameserver/model/pledge/ClanMember
       111: invokevirtual #254                // Method ext/mods/gameserver/model/pledge/ClanMember.getName:()Ljava/lang/String;
       114: areturn
      LineNumberTable:
        line 794: 0
        line 795: 4
        line 797: 12
        line 798: 29
        line 800: 34
        line 801: 46
        line 803: 49
        line 805: 65
        line 806: 92
        line 809: 95
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     115     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     115     1 pledgeType   I
           29      86     2 subPledge   Lext/mods/gameserver/model/pledge/SubPledge;
           34      81     3 leaderId   I
      StackMapTable: number_of_entries = 4
        frame_type = 12 /* same */
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/pledge/SubPledge, int ]
        frame_type = 2 /* same */
        frame_type = 45 /* same */

  public int getMaxNrOfMembers(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iload_1
         1: lookupswitch  { // 8

                      -1: 127

                       0: 76

                     100: 127

                     200: 127

                    1001: 130

                    1002: 130

                    2001: 130

                    2002: 130
                 default: 133
            }
        76: aload_0
        77: getfield      #282                // Field _level:I
        80: tableswitch   { // 0 to 3

                       0: 112

                       1: 115

                       2: 118

                       3: 121
                 default: 124
            }
       112: bipush        10
       114: ireturn
       115: bipush        15
       117: ireturn
       118: bipush        20
       120: ireturn
       121: bipush        30
       123: ireturn
       124: bipush        40
       126: ireturn
       127: bipush        20
       129: ireturn
       130: bipush        10
       132: ireturn
       133: iconst_0
       134: ireturn
      LineNumberTable:
        line 818: 0
        line 821: 76
        line 824: 112
        line 827: 115
        line 830: 118
        line 833: 121
        line 836: 124
        line 840: 127
        line 843: 130
        line 845: 133
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     135     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     135     1 pledgeType   I
      StackMapTable: number_of_entries = 9
        frame_type = 251 /* same_frame_extended */
          offset_delta = 76
        frame_type = 35 /* same */
        frame_type = 2 /* same */
        frame_type = 2 /* same */
        frame_type = 2 /* same */
        frame_type = 2 /* same */
        frame_type = 2 /* same */
        frame_type = 2 /* same */
        frame_type = 2 /* same */

  public ext.mods.gameserver.model.actor.Player[] getOnlineMembers();
    descriptor: ()[Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: new           #692                // class java/util/ArrayList
         3: dup
         4: invokespecial #694                // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_0
         9: getfield      #10                 // Field _members:Ljava/util/Map;
        12: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        17: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        22: astore_2
        23: aload_2
        24: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          67
        32: aload_2
        33: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #85                 // class ext/mods/gameserver/model/pledge/ClanMember
        41: astore_3
        42: aload_3
        43: ifnull        64
        46: aload_3
        47: invokevirtual #585                // Method ext/mods/gameserver/model/pledge/ClanMember.isOnline:()Z
        50: ifeq          64
        53: aload_1
        54: aload_3
        55: invokevirtual #257                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
        58: invokeinterface #695,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        63: pop
        64: goto          23
        67: aload_1
        68: aload_1
        69: invokeinterface #700,  1          // InterfaceMethod java/util/List.size:()I
        74: anewarray     #275                // class ext/mods/gameserver/model/actor/Player
        77: invokeinterface #701,  2          // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        82: checkcast     #705                // class "[Lext/mods/gameserver/model/actor/Player;"
        85: areturn
      LineNumberTable:
        line 850: 0
        line 851: 8
        line 853: 42
        line 854: 53
        line 855: 64
        line 856: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      22     3  temp   Lext/mods/gameserver/model/pledge/ClanMember;
            0      86     0  this   Lext/mods/gameserver/model/pledge/Clan;
            8      78     1  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      78     1  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 40 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public int getOnlineMembersCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _members:Ljava/util/Map;
         4: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #431,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: invokedynamic #707,  0            // InvokeDynamic #3:test:()Ljava/util/function/Predicate;
        19: invokeinterface #441,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        24: invokeinterface #685,  1          // InterfaceMethod java/util/stream/Stream.count:()J
        29: l2i
        30: ireturn
      LineNumberTable:
        line 864: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void updateClanInDB();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #710                // String UPDATE clan_data SET leader_id=?,new_leader_id=?,ally_id=?,ally_name=?,reputation_score=?,ally_penalty_expiry_time=?,ally_penalty_type=?,char_penalty_expiry_time=?,dissolving_expiry_time=? WHERE clan_id=?
         8: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_2
        15: iconst_1
        16: aload_0
        17: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
        20: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
        23: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        28: aload_2
        29: iconst_2
        30: aload_0
        31: getfield      #268                // Field _newLeaderId:I
        34: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        39: aload_2
        40: iconst_3
        41: aload_0
        42: getfield      #351                // Field _allyId:I
        45: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        50: aload_2
        51: iconst_4
        52: aload_0
        53: getfield      #348                // Field _allyName:Ljava/lang/String;
        56: invokeinterface #662,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        61: aload_2
        62: iconst_5
        63: aload_0
        64: getfield      #712                // Field _reputationScore:I
        67: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        72: aload_2
        73: bipush        6
        75: aload_0
        76: getfield      #410                // Field _allyPenaltyExpiryTime:J
        79: invokeinterface #666,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        84: aload_2
        85: bipush        7
        87: aload_0
        88: getfield      #414                // Field _allyPenaltyType:I
        91: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        96: aload_2
        97: bipush        8
        99: aload_0
       100: getfield      #417                // Field _charPenaltyExpiryTime:J
       103: invokeinterface #666,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       108: aload_2
       109: bipush        9
       111: aload_0
       112: getfield      #420                // Field _dissolvingExpiryTime:J
       115: invokeinterface #666,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       120: aload_2
       121: bipush        10
       123: aload_0
       124: getfield      #51                 // Field _clanId:I
       127: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       132: aload_2
       133: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       138: pop
       139: aload_2
       140: ifnull        176
       143: aload_2
       144: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       149: goto          176
       152: astore_3
       153: aload_2
       154: ifnull        174
       157: aload_2
       158: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       163: goto          174
       166: astore        4
       168: aload_3
       169: aload         4
       171: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       174: aload_3
       175: athrow
       176: aload_1
       177: ifnull        211
       180: aload_1
       181: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       186: goto          211
       189: astore_2
       190: aload_1
       191: ifnull        209
       194: aload_1
       195: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       200: goto          209
       203: astore_3
       204: aload_2
       205: aload_3
       206: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       209: aload_2
       210: athrow
       211: goto          225
       214: astore_1
       215: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       218: ldc_w         #715                // String Error while updating clan.
       221: aload_1
       222: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       225: return
      Exception table:
         from    to  target type
            14   139   152   Class java/lang/Throwable
           157   163   166   Class java/lang/Throwable
             4   176   189   Class java/lang/Throwable
           194   200   203   Class java/lang/Throwable
             0   211   214   Class java/lang/Exception
      LineNumberTable:
        line 872: 0
        line 873: 4
        line 875: 14
        line 876: 28
        line 877: 39
        line 878: 50
        line 879: 61
        line 880: 72
        line 881: 84
        line 882: 96
        line 883: 108
        line 884: 120
        line 885: 132
        line 886: 139
        line 872: 152
        line 886: 176
        line 872: 189
        line 890: 211
        line 887: 214
        line 889: 215
        line 891: 225
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14     162     2    ps   Ljava/sql/PreparedStatement;
            4     207     1   con   Ljava/sql/Connection;
          215      10     1     e   Ljava/lang/Exception;
            0     226     0  this   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 152
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void store();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #717                // String INSERT INTO clan_data (clan_id,clan_name,clan_level,hasCastle,ally_id,ally_name,leader_id,new_leader_id,crest_id,crest_large_id,ally_crest_id) VALUES (?,?,?,?,?,?,?,?,?,?,?)
         8: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_2
        15: iconst_1
        16: aload_0
        17: getfield      #51                 // Field _clanId:I
        20: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        25: aload_2
        26: iconst_2
        27: aload_0
        28: getfield      #238                // Field _name:Ljava/lang/String;
        31: invokeinterface #662,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        36: aload_2
        37: iconst_3
        38: aload_0
        39: getfield      #282                // Field _level:I
        42: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        47: aload_2
        48: iconst_4
        49: aload_0
        50: getfield      #389                // Field _castleId:I
        53: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        58: aload_2
        59: iconst_5
        60: aload_0
        61: getfield      #351                // Field _allyId:I
        64: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        69: aload_2
        70: bipush        6
        72: aload_0
        73: getfield      #348                // Field _allyName:Ljava/lang/String;
        76: invokeinterface #662,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        81: aload_2
        82: bipush        7
        84: aload_0
        85: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
        88: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
        91: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        96: aload_2
        97: bipush        8
        99: aload_0
       100: getfield      #268                // Field _newLeaderId:I
       103: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       108: aload_2
       109: bipush        9
       111: aload_0
       112: getfield      #178                // Field _crestId:I
       115: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       120: aload_2
       121: bipush        10
       123: aload_0
       124: getfield      #210                // Field _crestLargeId:I
       127: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       132: aload_2
       133: bipush        11
       135: aload_0
       136: getfield      #221                // Field _allyCrestId:I
       139: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       144: aload_2
       145: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       150: pop
       151: aload_2
       152: ifnull        188
       155: aload_2
       156: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       161: goto          188
       164: astore_3
       165: aload_2
       166: ifnull        186
       169: aload_2
       170: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       175: goto          186
       178: astore        4
       180: aload_3
       181: aload         4
       183: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       186: aload_3
       187: athrow
       188: aload_1
       189: ifnull        223
       192: aload_1
       193: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       198: goto          223
       201: astore_2
       202: aload_1
       203: ifnull        221
       206: aload_1
       207: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       212: goto          221
       215: astore_3
       216: aload_2
       217: aload_3
       218: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       221: aload_2
       222: athrow
       223: goto          237
       226: astore_1
       227: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       230: ldc_w         #719                // String Error while storing clan.
       233: aload_1
       234: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       237: return
      Exception table:
         from    to  target type
            14   151   164   Class java/lang/Throwable
           169   175   178   Class java/lang/Throwable
             4   188   201   Class java/lang/Throwable
           206   212   215   Class java/lang/Throwable
             0   223   226   Class java/lang/Exception
      LineNumberTable:
        line 898: 0
        line 899: 4
        line 901: 14
        line 902: 25
        line 903: 36
        line 904: 47
        line 905: 58
        line 906: 69
        line 907: 81
        line 908: 96
        line 909: 108
        line 910: 120
        line 911: 132
        line 912: 144
        line 913: 151
        line 898: 164
        line 913: 188
        line 898: 201
        line 917: 223
        line 914: 226
        line 916: 227
        line 918: 237
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14     174     2    ps   Ljava/sql/PreparedStatement;
            4     219     1   con   Ljava/sql/Connection;
          227      10     1     e   Ljava/lang/Exception;
            0     238     0  this   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 164
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public java.lang.String getNotice();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #244                // Field _notice:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 925: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public boolean isNoticeEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #721                // Field _noticeEnabled:Z
         4: ireturn
      LineNumberTable:
        line 930: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setNotice(java.lang.String, boolean, boolean);
    descriptor: (Ljava/lang/String;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=4
         0: aload_0
         1: aload_1
         2: sipush        8192
         5: ldc           #242                // String
         7: invokestatic  #724                // Method ext/mods/commons/lang/StringUtil.trim:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
        10: putfield      #244                // Field _notice:Ljava/lang/String;
        13: aload_0
        14: iload_2
        15: putfield      #721                // Field _noticeEnabled:Z
        18: iload_3
        19: ifeq          187
        22: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        25: astore        4
        27: aload         4
        29: ldc_w         #730                // String UPDATE clan_data SET enabled=?,notice=? WHERE clan_id=?
        32: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        37: astore        5
        39: aload         5
        41: iconst_1
        42: aload_0
        43: getfield      #721                // Field _noticeEnabled:Z
        46: invokeinterface #732,  3          // InterfaceMethod java/sql/PreparedStatement.setBoolean:(IZ)V
        51: aload         5
        53: iconst_2
        54: aload_0
        55: getfield      #244                // Field _notice:Ljava/lang/String;
        58: invokeinterface #662,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        63: aload         5
        65: iconst_3
        66: aload_0
        67: getfield      #51                 // Field _clanId:I
        70: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        75: aload         5
        77: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        82: pop
        83: aload         5
        85: ifnull        127
        88: aload         5
        90: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        95: goto          127
        98: astore        6
       100: aload         5
       102: ifnull        124
       105: aload         5
       107: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       112: goto          124
       115: astore        7
       117: aload         6
       119: aload         7
       121: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       124: aload         6
       126: athrow
       127: aload         4
       129: ifnull        171
       132: aload         4
       134: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       139: goto          171
       142: astore        5
       144: aload         4
       146: ifnull        168
       149: aload         4
       151: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       156: goto          168
       159: astore        6
       161: aload         5
       163: aload         6
       165: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       168: aload         5
       170: athrow
       171: goto          187
       174: astore        4
       176: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       179: ldc_w         #735                // String Error while storing notice.
       182: aload         4
       184: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       187: return
      Exception table:
         from    to  target type
            39    83    98   Class java/lang/Throwable
           105   112   115   Class java/lang/Throwable
            27   127   142   Class java/lang/Throwable
           149   156   159   Class java/lang/Throwable
            22   171   174   Class java/lang/Exception
      LineNumberTable:
        line 941: 0
        line 942: 13
        line 944: 18
        line 946: 22
        line 947: 27
        line 949: 39
        line 950: 51
        line 951: 63
        line 952: 75
        line 953: 83
        line 946: 98
        line 953: 127
        line 946: 142
        line 957: 171
        line 954: 174
        line 956: 176
        line 959: 187
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      88     5    ps   Ljava/sql/PreparedStatement;
           27     144     4   con   Ljava/sql/Connection;
          176      11     4     e   Ljava/lang/Exception;
            0     188     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     188     1 notice   Ljava/lang/String;
            0     188     2 enabled   Z
            0     188     3 saveOnDb   Z
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 98
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/lang/String, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/lang/String, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/lang/String, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */

  public void setNotice(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #244                // Field _notice:Ljava/lang/String;
         5: iload_1
         6: iconst_1
         7: invokevirtual #737                // Method setNotice:(Ljava/lang/String;ZZ)V
        10: return
      LineNumberTable:
        line 968: 0
        line 969: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      11     1 enabled   Z

  public void setNotice(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aload_0
         3: getfield      #721                // Field _noticeEnabled:Z
         6: iconst_1
         7: invokevirtual #737                // Method setNotice:(Ljava/lang/String;ZZ)V
        10: return
      LineNumberTable:
        line 978: 0
        line 979: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      11     1 notice   Ljava/lang/String;

  public java.lang.String getIntroduction();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #247                // Field _introduction:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 986: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setIntroduction(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=3
         0: aload_0
         1: aload_1
         2: sipush        300
         5: ldc           #242                // String
         7: invokestatic  #724                // Method ext/mods/commons/lang/StringUtil.trim:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
        10: putfield      #247                // Field _introduction:Ljava/lang/String;
        13: iload_2
        14: ifeq          162
        17: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        20: astore_3
        21: aload_3
        22: ldc_w         #741                // String UPDATE clan_data SET introduction=? WHERE clan_id=?
        25: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        30: astore        4
        32: aload         4
        34: iconst_1
        35: aload_0
        36: getfield      #247                // Field _introduction:Ljava/lang/String;
        39: invokeinterface #662,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        44: aload         4
        46: iconst_2
        47: aload_0
        48: getfield      #51                 // Field _clanId:I
        51: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        56: aload         4
        58: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        63: pop
        64: aload         4
        66: ifnull        108
        69: aload         4
        71: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        76: goto          108
        79: astore        5
        81: aload         4
        83: ifnull        105
        86: aload         4
        88: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        93: goto          105
        96: astore        6
        98: aload         5
       100: aload         6
       102: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       105: aload         5
       107: athrow
       108: aload_3
       109: ifnull        148
       112: aload_3
       113: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       118: goto          148
       121: astore        4
       123: aload_3
       124: ifnull        145
       127: aload_3
       128: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       133: goto          145
       136: astore        5
       138: aload         4
       140: aload         5
       142: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       145: aload         4
       147: athrow
       148: goto          162
       151: astore_3
       152: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       155: ldc_w         #743                // String Error while storing introduction.
       158: aload_3
       159: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       162: return
      Exception table:
         from    to  target type
            32    64    79   Class java/lang/Throwable
            86    93    96   Class java/lang/Throwable
            21   108   121   Class java/lang/Throwable
           127   133   136   Class java/lang/Throwable
            17   148   151   Class java/lang/Exception
      LineNumberTable:
        line 996: 0
        line 998: 13
        line 1000: 17
        line 1001: 21
        line 1003: 32
        line 1004: 44
        line 1005: 56
        line 1006: 64
        line 1000: 79
        line 1006: 108
        line 1000: 121
        line 1010: 148
        line 1007: 151
        line 1009: 152
        line 1012: 162
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           32      76     4    ps   Ljava/sql/PreparedStatement;
           21     127     3   con   Ljava/sql/Connection;
          152      10     3     e   Ljava/lang/Exception;
            0     163     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     163     1 introduction   Ljava/lang/String;
            0     163     2 saveOnDb   Z
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/lang/String, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/lang/String, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/lang/String, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public final java.util.Map<java.lang.Integer, ext.mods.gameserver.skills.L2Skill> getClanSkills();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _skills:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 1019: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;
    Signature: #1483                        // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/skills/L2Skill;>;

  public boolean addClanSkill(ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=3
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: getfield      #19                 // Field _skills:Ljava/util/Map;
        10: aload_1
        11: invokevirtual #638                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        14: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        17: invokeinterface #423,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        22: checkcast     #636                // class ext/mods/gameserver/skills/L2Skill
        25: astore_3
        26: aload_3
        27: ifnull        43
        30: aload_3
        31: invokevirtual #745                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        34: aload_1
        35: invokevirtual #745                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        38: if_icmpne     43
        41: iconst_0
        42: ireturn
        43: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        46: astore        4
        48: aload         4
        50: ldc_w         #748                // String INSERT INTO clan_skills (clan_id,skill_id,skill_level) VALUES (?,?,?) ON DUPLICATE KEY UPDATE skill_level=VALUES(skill_level)
        53: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        58: astore        5
        60: aload         5
        62: iconst_1
        63: aload_0
        64: getfield      #51                 // Field _clanId:I
        67: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        72: aload         5
        74: iconst_2
        75: aload_1
        76: invokevirtual #638                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        79: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        84: aload         5
        86: iconst_3
        87: aload_1
        88: invokevirtual #745                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        91: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        96: aload         5
        98: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       103: pop
       104: aload         5
       106: ifnull        148
       109: aload         5
       111: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       116: goto          148
       119: astore        6
       121: aload         5
       123: ifnull        145
       126: aload         5
       128: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       133: goto          145
       136: astore        7
       138: aload         6
       140: aload         7
       142: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       145: aload         6
       147: athrow
       148: aload         4
       150: ifnull        192
       153: aload         4
       155: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       160: goto          192
       163: astore        5
       165: aload         4
       167: ifnull        189
       170: aload         4
       172: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       177: goto          189
       180: astore        6
       182: aload         5
       184: aload         6
       186: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       189: aload         5
       191: athrow
       192: goto          210
       195: astore        4
       197: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       200: ldc_w         #750                // String Error while storing a clan skill.
       203: aload         4
       205: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       208: iconst_0
       209: ireturn
       210: aload_0
       211: getfield      #19                 // Field _skills:Ljava/util/Map;
       214: aload_1
       215: invokevirtual #638                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       218: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       221: aload_1
       222: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       227: pop
       228: new           #752                // class ext/mods/gameserver/network/serverpackets/PledgeSkillListAdd
       231: dup
       232: aload_1
       233: invokespecial #754                // Method ext/mods/gameserver/network/serverpackets/PledgeSkillListAdd."<init>":(Lext/mods/gameserver/skills/L2Skill;)V
       236: astore        4
       238: getstatic     #757                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_SKILL_S1_ADDED:Lext/mods/gameserver/network/SystemMessageId;
       241: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       244: aload_1
       245: invokevirtual #638                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       248: invokevirtual #760                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       251: astore        5
       253: aload_0
       254: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       257: astore        6
       259: aload         6
       261: arraylength
       262: istore        7
       264: iconst_0
       265: istore        8
       267: iload         8
       269: iload         7
       271: if_icmpge     337
       274: aload         6
       276: iload         8
       278: aaload
       279: astore        9
       281: iload_2
       282: ifne          317
       285: aload_0
       286: aload         9
       288: aload_1
       289: invokevirtual #768                // Method checkAndAddClanSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
       292: ifeq          317
       295: aload         9
       297: aload_1
       298: iconst_0
       299: invokevirtual #772                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       302: pop
       303: aload         9
       305: new           #645                // class ext/mods/gameserver/network/serverpackets/SkillList
       308: dup
       309: aload         9
       311: invokespecial #647                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       314: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       317: aload         9
       319: aload         4
       321: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       324: aload         9
       326: aload         5
       328: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       331: iinc          8, 1
       334: goto          267
       337: iconst_1
       338: ireturn
      Exception table:
         from    to  target type
            60   104   119   Class java/lang/Throwable
           126   133   136   Class java/lang/Throwable
            48   148   163   Class java/lang/Throwable
           170   177   180   Class java/lang/Throwable
            43   192   195   Class java/lang/Exception
      LineNumberTable:
        line 1030: 0
        line 1031: 4
        line 1033: 6
        line 1034: 26
        line 1035: 41
        line 1037: 43
        line 1038: 48
        line 1040: 60
        line 1041: 72
        line 1042: 84
        line 1043: 96
        line 1044: 104
        line 1037: 119
        line 1044: 148
        line 1037: 163
        line 1049: 192
        line 1045: 195
        line 1047: 197
        line 1048: 208
        line 1051: 210
        line 1053: 228
        line 1054: 238
        line 1056: 253
        line 1058: 281
        line 1060: 295
        line 1061: 303
        line 1063: 317
        line 1064: 324
        line 1056: 331
        line 1066: 337
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           60      88     5    ps   Ljava/sql/PreparedStatement;
           48     144     4   con   Ljava/sql/Connection;
          197      13     4     e   Ljava/lang/Exception;
          281      50     9 player   Lext/mods/gameserver/model/actor/Player;
            0     339     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     339     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0     339     2 needRefresh   Z
           26     313     3 existingSkill   Lext/mods/gameserver/skills/L2Skill;
          238     101     4  psla   Lext/mods/gameserver/network/serverpackets/PledgeSkillListAdd;
          253      86     5    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
      StackMapTable: number_of_entries = 15
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 255 /* full_frame */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/skills/L2Skill, int, class ext/mods/gameserver/skills/L2Skill, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/skills/L2Skill, int, class ext/mods/gameserver/skills/L2Skill, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/skills/L2Skill, int, class ext/mods/gameserver/skills/L2Skill, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/skills/L2Skill, int, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/network/serverpackets/PledgeSkillListAdd, class ext/mods/gameserver/network/serverpackets/SystemMessage, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/skills/L2Skill, int, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/network/serverpackets/PledgeSkillListAdd, class ext/mods/gameserver/network/serverpackets/SystemMessage ]
          stack = []

  public boolean removeClanSkill(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _skills:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #535,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #636                // class ext/mods/gameserver/skills/L2Skill
        16: astore_2
        17: aload_2
        18: ifnonnull     23
        21: iconst_0
        22: ireturn
        23: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        26: astore_3
        27: aload_3
        28: ldc_w         #776                // String DELETE FROM clan_skills WHERE clan_id=? AND skill_id=?
        31: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        36: astore        4
        38: aload         4
        40: iconst_1
        41: aload_0
        42: getfield      #51                 // Field _clanId:I
        45: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        50: aload         4
        52: iconst_2
        53: iload_1
        54: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        59: aload         4
        61: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        66: pop
        67: aload         4
        69: ifnull        111
        72: aload         4
        74: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        79: goto          111
        82: astore        5
        84: aload         4
        86: ifnull        108
        89: aload         4
        91: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        96: goto          108
        99: astore        6
       101: aload         5
       103: aload         6
       105: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       108: aload         5
       110: athrow
       111: aload_3
       112: ifnull        151
       115: aload_3
       116: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       121: goto          151
       124: astore        4
       126: aload_3
       127: ifnull        148
       130: aload_3
       131: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       136: goto          148
       139: astore        5
       141: aload         4
       143: aload         5
       145: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       148: aload         4
       150: athrow
       151: goto          167
       154: astore_3
       155: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       158: ldc_w         #778                // String Error while removing a clan skill.
       161: aload_3
       162: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       165: iconst_0
       166: ireturn
       167: new           #780                // class ext/mods/gameserver/network/serverpackets/PledgeSkillList
       170: dup
       171: aload_0
       172: invokespecial #782                // Method ext/mods/gameserver/network/serverpackets/PledgeSkillList."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
       175: astore_3
       176: aload_0
       177: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       180: astore        4
       182: aload         4
       184: arraylength
       185: istore        5
       187: iconst_0
       188: istore        6
       190: iload         6
       192: iload         5
       194: if_icmpge     238
       197: aload         4
       199: iload         6
       201: aaload
       202: astore        7
       204: aload         7
       206: iload_1
       207: iconst_0
       208: invokevirtual #641                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       211: pop
       212: aload         7
       214: new           #645                // class ext/mods/gameserver/network/serverpackets/SkillList
       217: dup
       218: aload         7
       220: invokespecial #647                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       223: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       226: aload         7
       228: aload_3
       229: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       232: iinc          6, 1
       235: goto          190
       238: iconst_1
       239: ireturn
      Exception table:
         from    to  target type
            38    67    82   Class java/lang/Throwable
            89    96    99   Class java/lang/Throwable
            27   111   124   Class java/lang/Throwable
           130   136   139   Class java/lang/Throwable
            23   151   154   Class java/lang/Exception
      LineNumberTable:
        line 1076: 0
        line 1077: 17
        line 1078: 21
        line 1080: 23
        line 1081: 27
        line 1083: 38
        line 1084: 50
        line 1085: 59
        line 1086: 67
        line 1080: 82
        line 1086: 111
        line 1080: 124
        line 1091: 151
        line 1087: 154
        line 1089: 155
        line 1090: 165
        line 1093: 167
        line 1095: 176
        line 1097: 204
        line 1098: 212
        line 1100: 226
        line 1095: 232
        line 1102: 238
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      73     4    ps   Ljava/sql/PreparedStatement;
           27     124     3   con   Ljava/sql/Connection;
          155      12     3     e   Ljava/lang/Exception;
          204      28     7 player   Lext/mods/gameserver/model/actor/Player;
            0     240     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     240     1    id   I
           17     223     2 skill   Lext/mods/gameserver/skills/L2Skill;
          176      64     3   psl   Lext/mods/gameserver/network/serverpackets/PledgeSkillList;
      StackMapTable: number_of_entries = 13
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 255 /* full_frame */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class ext/mods/gameserver/skills/L2Skill, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class ext/mods/gameserver/skills/L2Skill, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class ext/mods/gameserver/skills/L2Skill, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/network/serverpackets/PledgeSkillList, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 47

  public boolean addAllClanSkills();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=1
         0: invokestatic  #783                // Method ext/mods/gameserver/data/SkillTable.getClanSkills:()[Lext/mods/gameserver/skills/L2Skill;
         3: invokestatic  #787                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
         6: aload_0
         7: invokedynamic #792,  0            // InvokeDynamic #4:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
        12: invokeinterface #441,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        17: invokeinterface #795,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        22: astore_1
        23: aload_1
        24: invokeinterface #799,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        29: ifeq          34
        32: iconst_0
        33: ireturn
        34: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        37: astore_2
        38: aload_2
        39: ldc_w         #748                // String INSERT INTO clan_skills (clan_id,skill_id,skill_level) VALUES (?,?,?) ON DUPLICATE KEY UPDATE skill_level=VALUES(skill_level)
        42: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        47: astore_3
        48: aload_3
        49: iconst_1
        50: aload_0
        51: getfield      #51                 // Field _clanId:I
        54: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        59: aload_1
        60: invokeinterface #802,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        65: astore        4
        67: aload         4
        69: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        74: ifeq          122
        77: aload         4
        79: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        84: checkcast     #636                // class ext/mods/gameserver/skills/L2Skill
        87: astore        5
        89: aload_3
        90: iconst_2
        91: aload         5
        93: invokevirtual #638                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        96: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       101: aload_3
       102: iconst_3
       103: aload         5
       105: invokevirtual #745                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       108: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       113: aload_3
       114: invokeinterface #314,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       119: goto          67
       122: aload_3
       123: invokeinterface #317,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       128: pop
       129: aload_3
       130: ifnull        169
       133: aload_3
       134: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       139: goto          169
       142: astore        4
       144: aload_3
       145: ifnull        166
       148: aload_3
       149: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       154: goto          166
       157: astore        5
       159: aload         4
       161: aload         5
       163: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       166: aload         4
       168: athrow
       169: aload_2
       170: ifnull        206
       173: aload_2
       174: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       179: goto          206
       182: astore_3
       183: aload_2
       184: ifnull        204
       187: aload_2
       188: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       193: goto          204
       196: astore        4
       198: aload_3
       199: aload         4
       201: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       204: aload_3
       205: athrow
       206: goto          222
       209: astore_2
       210: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       213: ldc_w         #803                // String Error while adding all clan skills.
       216: aload_2
       217: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       220: iconst_0
       221: ireturn
       222: aload_1
       223: invokeinterface #802,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       228: astore_2
       229: aload_2
       230: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       235: ifeq          269
       238: aload_2
       239: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       244: checkcast     #636                // class ext/mods/gameserver/skills/L2Skill
       247: astore_3
       248: aload_0
       249: getfield      #19                 // Field _skills:Ljava/util/Map;
       252: aload_3
       253: invokevirtual #638                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       256: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       259: aload_3
       260: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       265: pop
       266: goto          229
       269: new           #780                // class ext/mods/gameserver/network/serverpackets/PledgeSkillList
       272: dup
       273: aload_0
       274: invokespecial #782                // Method ext/mods/gameserver/network/serverpackets/PledgeSkillList."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
       277: astore_2
       278: aload_0
       279: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       282: astore_3
       283: aload_3
       284: arraylength
       285: istore        4
       287: iconst_0
       288: istore        5
       290: iload         5
       292: iload         4
       294: if_icmpge     338
       297: aload_3
       298: iload         5
       300: aaload
       301: astore        6
       303: aload_0
       304: aload         6
       306: invokevirtual #805                // Method checkAndAddClanSkills:(Lext/mods/gameserver/model/actor/Player;)Z
       309: ifeq          326
       312: aload         6
       314: new           #645                // class ext/mods/gameserver/network/serverpackets/SkillList
       317: dup
       318: aload         6
       320: invokespecial #647                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       323: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       326: aload         6
       328: aload_2
       329: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       332: iinc          5, 1
       335: goto          290
       338: iconst_1
       339: ireturn
      Exception table:
         from    to  target type
            48   129   142   Class java/lang/Throwable
           148   154   157   Class java/lang/Throwable
            38   169   182   Class java/lang/Throwable
           187   193   196   Class java/lang/Throwable
            34   206   209   Class java/lang/Exception
      LineNumberTable:
        line 1111: 0
        line 1112: 23
        line 1113: 32
        line 1115: 34
        line 1116: 38
        line 1118: 48
        line 1120: 59
        line 1122: 89
        line 1123: 101
        line 1124: 113
        line 1125: 119
        line 1126: 122
        line 1127: 129
        line 1115: 142
        line 1127: 169
        line 1115: 182
        line 1132: 206
        line 1128: 209
        line 1130: 210
        line 1131: 220
        line 1134: 222
        line 1135: 248
        line 1137: 269
        line 1139: 278
        line 1141: 303
        line 1142: 312
        line 1144: 326
        line 1139: 332
        line 1146: 338
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           89      30     5 skill   Lext/mods/gameserver/skills/L2Skill;
           48     121     3    ps   Ljava/sql/PreparedStatement;
           38     168     2   con   Ljava/sql/Connection;
          210      12     2     e   Ljava/lang/Exception;
          248      18     3 skill   Lext/mods/gameserver/skills/L2Skill;
          303      29     6 player   Lext/mods/gameserver/model/actor/Player;
            0     340     0  this   Lext/mods/gameserver/model/pledge/Clan;
           23     317     1  list   Ljava/util/List;
          278      62     2   psl   Lext/mods/gameserver/network/serverpackets/PledgeSkillList;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           23     317     1  list   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
      StackMapTable: number_of_entries = 18
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/util/List ]
        frame_type = 254 /* append */
          offset_delta = 32
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 54
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/util/List, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/util/List, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 39
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/util/List, class ext/mods/gameserver/network/serverpackets/PledgeSkillList, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/util/List, class ext/mods/gameserver/network/serverpackets/PledgeSkillList ]
          stack = []

  public boolean removeAllClanSkills();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _skills:Ljava/util/Map;
         4: invokeinterface #809,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
         9: ifeq          14
        12: iconst_0
        13: ireturn
        14: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        17: astore_1
        18: aload_1
        19: ldc_w         #810                // String DELETE FROM clan_skills WHERE clan_id=?
        22: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        27: astore_2
        28: aload_2
        29: iconst_1
        30: aload_0
        31: getfield      #51                 // Field _clanId:I
        34: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        39: aload_2
        40: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        45: pop
        46: aload_2
        47: ifnull        83
        50: aload_2
        51: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        56: goto          83
        59: astore_3
        60: aload_2
        61: ifnull        81
        64: aload_2
        65: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        70: goto          81
        73: astore        4
        75: aload_3
        76: aload         4
        78: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        81: aload_3
        82: athrow
        83: aload_1
        84: ifnull        118
        87: aload_1
        88: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
        93: goto          118
        96: astore_2
        97: aload_1
        98: ifnull        116
       101: aload_1
       102: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       107: goto          116
       110: astore_3
       111: aload_2
       112: aload_3
       113: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       116: aload_2
       117: athrow
       118: goto          134
       121: astore_1
       122: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       125: ldc_w         #812                // String Error while removing all clan skills.
       128: aload_1
       129: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       132: iconst_0
       133: ireturn
       134: new           #780                // class ext/mods/gameserver/network/serverpackets/PledgeSkillList
       137: dup
       138: aload_0
       139: invokespecial #782                // Method ext/mods/gameserver/network/serverpackets/PledgeSkillList."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
       142: astore_1
       143: aload_0
       144: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       147: astore_2
       148: aload_2
       149: arraylength
       150: istore_3
       151: iconst_0
       152: istore        4
       154: iload         4
       156: iload_3
       157: if_icmpge     245
       160: aload_2
       161: iload         4
       163: aaload
       164: astore        5
       166: aload_0
       167: getfield      #19                 // Field _skills:Ljava/util/Map;
       170: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       175: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       180: astore        6
       182: aload         6
       184: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       189: ifeq          219
       192: aload         6
       194: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       199: checkcast     #636                // class ext/mods/gameserver/skills/L2Skill
       202: astore        7
       204: aload         5
       206: aload         7
       208: invokevirtual #638                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       211: iconst_0
       212: invokevirtual #641                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       215: pop
       216: goto          182
       219: aload         5
       221: new           #645                // class ext/mods/gameserver/network/serverpackets/SkillList
       224: dup
       225: aload         5
       227: invokespecial #647                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       230: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       233: aload         5
       235: aload_1
       236: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       239: iinc          4, 1
       242: goto          154
       245: aload_0
       246: getfield      #19                 // Field _skills:Ljava/util/Map;
       249: invokeinterface #814,  1          // InterfaceMethod java/util/Map.clear:()V
       254: iconst_1
       255: ireturn
      Exception table:
         from    to  target type
            28    46    59   Class java/lang/Throwable
            64    70    73   Class java/lang/Throwable
            18    83    96   Class java/lang/Throwable
           101   107   110   Class java/lang/Throwable
            14   118   121   Class java/lang/Exception
      LineNumberTable:
        line 1155: 0
        line 1156: 12
        line 1158: 14
        line 1159: 18
        line 1161: 28
        line 1162: 39
        line 1163: 46
        line 1158: 59
        line 1163: 83
        line 1158: 96
        line 1168: 118
        line 1164: 121
        line 1166: 122
        line 1167: 132
        line 1170: 134
        line 1172: 143
        line 1174: 166
        line 1175: 204
        line 1177: 219
        line 1178: 233
        line 1172: 239
        line 1181: 245
        line 1183: 254
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           28      55     2    ps   Ljava/sql/PreparedStatement;
           18     100     1   con   Ljava/sql/Connection;
          122      12     1     e   Ljava/lang/Exception;
          204      12     7 skill   Lext/mods/gameserver/skills/L2Skill;
          166      73     5 player   Lext/mods/gameserver/model/actor/Player;
            0     256     0  this   Lext/mods/gameserver/model/pledge/Clan;
          143     113     1   psl   Lext/mods/gameserver/network/serverpackets/PledgeSkillList;
      StackMapTable: number_of_entries = 15
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/network/serverpackets/PledgeSkillList, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/network/serverpackets/PledgeSkillList ]
          stack = []

  public boolean checkAndAddClanSkill(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #712                // Field _reputationScore:I
         4: ifle          14
         7: aload_1
         8: invokevirtual #817                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        11: ifeq          16
        14: iconst_0
        15: ireturn
        16: aload_2
        17: invokevirtual #820                // Method ext/mods/gameserver/skills/L2Skill.getMinPledgeClass:()I
        20: aload_1
        21: invokevirtual #823                // Method ext/mods/gameserver/model/actor/Player.getPledgeClass:()I
        24: if_icmple     29
        27: iconst_0
        28: ireturn
        29: aload_1
        30: aload_2
        31: iconst_0
        32: invokevirtual #772                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
        35: pop
        36: iconst_1
        37: ireturn
      LineNumberTable:
        line 1194: 0
        line 1195: 14
        line 1197: 16
        line 1198: 27
        line 1200: 29
        line 1201: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      38     1 player   Lext/mods/gameserver/model/actor/Player;
            0      38     2 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 3
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 12 /* same */

  public boolean checkAndAddClanSkills(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: getfield      #712                // Field _reputationScore:I
         4: ifle          14
         7: aload_1
         8: invokevirtual #817                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        11: ifeq          16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: getfield      #19                 // Field _skills:Ljava/util/Map;
        20: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        25: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        30: astore_2
        31: aload_2
        32: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        37: ifeq          71
        40: aload_2
        41: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        46: checkcast     #636                // class ext/mods/gameserver/skills/L2Skill
        49: astore_3
        50: aload_3
        51: invokevirtual #820                // Method ext/mods/gameserver/skills/L2Skill.getMinPledgeClass:()I
        54: aload_1
        55: invokevirtual #823                // Method ext/mods/gameserver/model/actor/Player.getPledgeClass:()I
        58: if_icmpgt     68
        61: aload_1
        62: aload_3
        63: iconst_0
        64: invokevirtual #772                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
        67: pop
        68: goto          31
        71: iconst_1
        72: ireturn
      LineNumberTable:
        line 1211: 0
        line 1212: 14
        line 1214: 16
        line 1216: 50
        line 1217: 61
        line 1218: 68
        line 1219: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           50      18     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      73     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      73     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 36 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void broadcastToMembers(ext.mods.gameserver.network.serverpackets.L2GameServerPacket...);
    descriptor: ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=10, args_size=2
         0: aload_0
         1: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
         4: astore_2
         5: aload_2
         6: arraylength
         7: istore_3
         8: iconst_0
         9: istore        4
        11: iload         4
        13: iload_3
        14: if_icmpge     67
        17: aload_2
        18: iload         4
        20: aaload
        21: astore        5
        23: aload_1
        24: astore        6
        26: aload         6
        28: arraylength
        29: istore        7
        31: iconst_0
        32: istore        8
        34: iload         8
        36: iload         7
        38: if_icmpge     61
        41: aload         6
        43: iload         8
        45: aaload
        46: astore        9
        48: aload         5
        50: aload         9
        52: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        55: iinc          8, 1
        58: goto          34
        61: iinc          4, 1
        64: goto          11
        67: return
      LineNumberTable:
        line 1224: 0
        line 1226: 23
        line 1227: 48
        line 1226: 55
        line 1224: 61
        line 1229: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48       7     9 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
           23      38     5 member   Lext/mods/gameserver/model/actor/Player;
            0      68     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      68     1 packets   [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", class "[Lext/mods/gameserver/model/actor/Player;", int, int, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5

  public void broadcastToAllyMembers(ext.mods.gameserver.network.serverpackets.L2GameServerPacket...);
    descriptor: ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=4, args_size=2
         0: invokestatic  #826                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
         3: aload_0
         4: getfield      #351                // Field _allyId:I
         7: invokevirtual #831                // Method ext/mods/gameserver/data/sql/ClanTable.getClanAllies:(I)Ljava/util/List;
        10: invokeinterface #802,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        15: astore_2
        16: aload_2
        17: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        22: ifeq          43
        25: aload_2
        26: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        31: checkcast     #11                 // class ext/mods/gameserver/model/pledge/Clan
        34: astore_3
        35: aload_3
        36: aload_1
        37: invokevirtual #344                // Method broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        40: goto          16
        43: return
      LineNumberTable:
        line 1233: 0
        line 1234: 35
        line 1235: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35       5     3  clan   Lext/mods/gameserver/model/pledge/Clan;
            0      44     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      44     1 packets   [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26

  public void broadcastToMembersExcept(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.network.serverpackets.L2GameServerPacket...);
    descriptor: (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=11, args_size=3
         0: aload_0
         1: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
         4: astore_3
         5: aload_3
         6: arraylength
         7: istore        4
         9: iconst_0
        10: istore        5
        12: iload         5
        14: iload         4
        16: if_icmpge     75
        19: aload_3
        20: iload         5
        22: aaload
        23: astore        6
        25: aload         6
        27: aload_1
        28: if_acmpeq     69
        31: aload_2
        32: astore        7
        34: aload         7
        36: arraylength
        37: istore        8
        39: iconst_0
        40: istore        9
        42: iload         9
        44: iload         8
        46: if_icmpge     69
        49: aload         7
        51: iload         9
        53: aaload
        54: astore        10
        56: aload         6
        58: aload         10
        60: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        63: iinc          9, 1
        66: goto          42
        69: iinc          5, 1
        72: goto          12
        75: return
      LineNumberTable:
        line 1239: 0
        line 1241: 25
        line 1243: 31
        line 1244: 56
        line 1243: 63
        line 1239: 69
        line 1247: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56       7    10 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
           25      44     6 member   Lext/mods/gameserver/model/actor/Player;
            0      76     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      76     1 player   Lext/mods/gameserver/model/actor/Player;
            0      76     2 packets   [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 12
          locals = [ class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", class "[Lext/mods/gameserver/model/actor/Player;", int, int, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #238                // Field _name:Ljava/lang/String;
         4: aload_0
         5: getfield      #51                 // Field _clanId:I
         8: invokedynamic #835,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        13: areturn
      LineNumberTable:
        line 1252: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public ext.mods.gameserver.model.itemcontainer.ItemContainer getWarehouse();
    descriptor: ()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _warehouse:Lext/mods/gameserver/model/itemcontainer/ItemContainer;
         4: areturn
      LineNumberTable:
        line 1257: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public boolean isAtWarWith(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #32                 // Field _atWarWith:Ljava/util/Set;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #839,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        13: ireturn
      LineNumberTable:
        line 1262: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      14     1    id   I

  public boolean isAtWarAttacker(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #36                 // Field _atWarAttackers:Ljava/util/Set;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #839,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        13: ireturn
      LineNumberTable:
        line 1267: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      14     1    id   I

  public void setEnemyClan(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #32                 // Field _atWarWith:Ljava/util/Set;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #844,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        13: pop
        14: return
      LineNumberTable:
        line 1272: 0
        line 1273: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      15     1 clanId   I

  public void setAttackerClan(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #36                 // Field _atWarAttackers:Ljava/util/Set;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #844,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        13: pop
        14: return
      LineNumberTable:
        line 1277: 0
        line 1278: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      15     1 clanId   I

  public void deleteEnemyClan(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #32                 // Field _atWarWith:Ljava/util/Set;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #845,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        13: pop
        14: return
      LineNumberTable:
        line 1282: 0
        line 1283: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      15     1 clanId   I

  public void deleteAttackerClan(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #36                 // Field _atWarAttackers:Ljava/util/Set;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #845,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        13: pop
        14: return
      LineNumberTable:
        line 1287: 0
        line 1288: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      15     1 clanId   I

  public void addWarPenaltyTime(int, long);
    descriptor: (IJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: getfield      #16                 // Field _warPenaltyExpiryTime:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: lload_2
         9: invokestatic  #847                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        12: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        17: pop
        18: return
      LineNumberTable:
        line 1292: 0
        line 1293: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      19     1 clanId   I
            0      19     2 expiryTime   J

  public boolean hasWarPenaltyWith(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _warPenaltyExpiryTime:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #456,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ifne          18
        16: iconst_0
        17: ireturn
        18: aload_0
        19: getfield      #16                 // Field _warPenaltyExpiryTime:Ljava/util/Map;
        22: iload_1
        23: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        26: invokeinterface #423,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        31: checkcast     #848                // class java/lang/Long
        34: invokevirtual #852                // Method java/lang/Long.longValue:()J
        37: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
        40: lcmp
        41: ifle          48
        44: iconst_1
        45: goto          49
        48: iconst_0
        49: ireturn
      LineNumberTable:
        line 1297: 0
        line 1298: 16
        line 1300: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      50     1 clanId   I
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 29 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.Map<java.lang.Integer, java.lang.Long> getWarPenalty();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _warPenaltyExpiryTime:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 1305: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;
    Signature: #1514                        // ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;

  public boolean isAtWar();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _atWarWith:Ljava/util/Set;
         4: invokeinterface #855,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifne          16
        12: iconst_1
        13: goto          17
        16: iconst_0
        17: ireturn
      LineNumberTable:
        line 1310: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.Set<java.lang.Integer> getWarList();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _atWarWith:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 1315: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;
    Signature: #1518                        // ()Ljava/util/Set<Ljava/lang/Integer;>;

  public java.util.Set<java.lang.Integer> getAttackerList();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field _atWarAttackers:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 1320: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;
    Signature: #1518                        // ()Ljava/util/Set<Ljava/lang/Integer;>;

  public java.util.Set<java.lang.Integer> getGraduates();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _graduates:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 1325: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;
    Signature: #1518                        // ()Ljava/util/Set<Ljava/lang/Integer;>;

  public void addGraduate(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: aload_0
         1: getfield      #39                 // Field _graduates:Ljava/util/Set;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #844,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        13: pop
        14: aload_0
        15: getfield      #39                 // Field _graduates:Ljava/util/Set;
        18: invokeinterface #856,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        23: invokedynamic #857,  0            // InvokeDynamic #6:apply:()Ljava/util/function/Function;
        28: invokeinterface #861,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        33: ldc_w         #865                // String ;
        36: invokestatic  #867                // Method java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
        39: invokeinterface #873,  2          // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        44: checkcast     #877                // class java/lang/String
        47: astore_2
        48: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        51: astore_3
        52: aload_3
        53: ldc_w         #879                // String UPDATE clan_data SET graduates=? WHERE clan_id=?
        56: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        61: astore        4
        63: aload         4
        65: iconst_1
        66: aload_2
        67: invokeinterface #662,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        72: aload         4
        74: iconst_2
        75: aload_0
        76: getfield      #51                 // Field _clanId:I
        79: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        84: aload         4
        86: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        91: pop
        92: aload         4
        94: ifnull        136
        97: aload         4
        99: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       104: goto          136
       107: astore        5
       109: aload         4
       111: ifnull        133
       114: aload         4
       116: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       121: goto          133
       124: astore        6
       126: aload         5
       128: aload         6
       130: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       133: aload         5
       135: athrow
       136: aload_3
       137: ifnull        176
       140: aload_3
       141: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       146: goto          176
       149: astore        4
       151: aload_3
       152: ifnull        173
       155: aload_3
       156: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       161: goto          173
       164: astore        5
       166: aload         4
       168: aload         5
       170: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       173: aload         4
       175: athrow
       176: goto          190
       179: astore_3
       180: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       183: ldc_w         #881                // String Error while storing graduates.
       186: aload_3
       187: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       190: return
      Exception table:
         from    to  target type
            63    92   107   Class java/lang/Throwable
           114   121   124   Class java/lang/Throwable
            52   136   149   Class java/lang/Throwable
           155   161   164   Class java/lang/Throwable
            48   176   179   Class java/lang/Exception
      LineNumberTable:
        line 1330: 0
        line 1332: 14
        line 1334: 48
        line 1335: 52
        line 1337: 63
        line 1338: 72
        line 1339: 84
        line 1340: 92
        line 1334: 107
        line 1340: 136
        line 1334: 149
        line 1344: 176
        line 1341: 179
        line 1343: 180
        line 1345: 190
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           63      73     4    ps   Ljava/sql/PreparedStatement;
           52     124     3   con   Ljava/sql/Connection;
          180      10     3     e   Ljava/lang/Exception;
            0     191     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     191     1 objectId   I
           48     143     2 toSave   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 107
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/lang/String, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void setGraduates(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_1
         6: ldc_w         #865                // String ;
         9: invokevirtual #883                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        12: astore_2
        13: aload_2
        14: arraylength
        15: istore_3
        16: iconst_0
        17: istore        4
        19: iload         4
        21: iload_3
        22: if_icmpge     58
        25: aload_2
        26: iload         4
        28: aaload
        29: astore        5
        31: aload_0
        32: getfield      #39                 // Field _graduates:Ljava/util/Set;
        35: aload         5
        37: invokevirtual #887                // Method java/lang/String.trim:()Ljava/lang/String;
        40: invokestatic  #889                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        43: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        46: invokeinterface #844,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        51: pop
        52: iinc          4, 1
        55: goto          19
        58: return
      LineNumberTable:
        line 1349: 0
        line 1350: 4
        line 1352: 5
        line 1353: 31
        line 1352: 52
        line 1354: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      21     5 objectId   Ljava/lang/String;
            0      59     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      59     1 toParse   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 5 /* same */
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 38

  public void broadcastClanStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=1
         0: aload_0
         1: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
         4: astore_1
         5: aload_1
         6: arraylength
         7: istore_2
         8: iconst_0
         9: istore_3
        10: iload_3
        11: iload_2
        12: if_icmpge     114
        15: aload_1
        16: iload_3
        17: aaload
        18: astore        4
        20: aload         4
        22: getstatic     #654                // Field ext/mods/gameserver/network/serverpackets/PledgeShowMemberListDeleteAll.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/PledgeShowMemberListDeleteAll;
        25: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        28: aload         4
        30: new           #892                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
        33: dup
        34: aload_0
        35: iconst_0
        36: invokespecial #894                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
        39: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        42: aload_0
        43: invokevirtual #897                // Method getAllSubPledges:()[Lext/mods/gameserver/model/pledge/SubPledge;
        46: astore        5
        48: aload         5
        50: arraylength
        51: istore        6
        53: iconst_0
        54: istore        7
        56: iload         7
        58: iload         6
        60: if_icmpge     94
        63: aload         5
        65: iload         7
        67: aaload
        68: astore        8
        70: aload         4
        72: new           #892                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
        75: dup
        76: aload_0
        77: aload         8
        79: invokevirtual #689                // Method ext/mods/gameserver/model/pledge/SubPledge.getId:()I
        82: invokespecial #894                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
        85: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        88: iinc          7, 1
        91: goto          56
        94: aload         4
        96: new           #532                // class ext/mods/gameserver/network/serverpackets/UserInfo
        99: dup
       100: aload         4
       102: invokespecial #534                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       105: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       108: iinc          3, 1
       111: goto          10
       114: return
      LineNumberTable:
        line 1358: 0
        line 1360: 20
        line 1361: 28
        line 1363: 42
        line 1364: 70
        line 1363: 88
        line 1366: 94
        line 1358: 108
        line 1368: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           70      18     8    sp   Lext/mods/gameserver/model/pledge/SubPledge;
           20      88     4 member   Lext/mods/gameserver/model/actor/Player;
            0     115     0  this   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class "[Lext/mods/gameserver/model/actor/Player;", int, int, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/model/pledge/SubPledge;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 37
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
          stack = []

  public boolean isSubPledgeLeader(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_0
         1: invokevirtual #897                // Method getAllSubPledges:()[Lext/mods/gameserver/model/pledge/SubPledge;
         4: astore_2
         5: aload_2
         6: arraylength
         7: istore_3
         8: iconst_0
         9: istore        4
        11: iload         4
        13: iload_3
        14: if_icmpge     40
        17: aload_2
        18: iload         4
        20: aaload
        21: astore        5
        23: aload         5
        25: invokevirtual #688                // Method ext/mods/gameserver/model/pledge/SubPledge.getLeaderId:()I
        28: iload_1
        29: if_icmpne     34
        32: iconst_1
        33: ireturn
        34: iinc          4, 1
        37: goto          11
        40: iconst_0
        41: ireturn
      LineNumberTable:
        line 1372: 0
        line 1374: 23
        line 1375: 32
        line 1372: 34
        line 1378: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23      11     5    sp   Lext/mods/gameserver/model/pledge/SubPledge;
            0      42     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      42     1 objectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/pledge/SubPledge;", int, int ]
        frame_type = 22 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public final ext.mods.gameserver.model.pledge.SubPledge getSubPledge(int);
    descriptor: (I)Lext/mods/gameserver/model/pledge/SubPledge;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field _subPledges:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #423,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #128                // class ext/mods/gameserver/model/pledge/SubPledge
        16: areturn
      LineNumberTable:
        line 1388: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      17     1 pledgeType   I

  public final ext.mods.gameserver.model.pledge.SubPledge getSubPledge(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/SubPledge;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field _subPledges:Ljava/util/Map;
         4: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #431,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #901,  0            // InvokeDynamic #7:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        20: invokeinterface #441,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #447,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #451                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #128                // class ext/mods/gameserver/model/pledge/SubPledge
        37: areturn
      LineNumberTable:
        line 1398: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      38     1 pledgeName   Ljava/lang/String;

  public final ext.mods.gameserver.model.pledge.SubPledge[] getAllSubPledges();
    descriptor: ()[Lext/mods/gameserver/model/pledge/SubPledge;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _subPledges:Ljava/util/Map;
         4: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: aload_0
        10: getfield      #25                 // Field _subPledges:Ljava/util/Map;
        13: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        18: invokeinterface #902,  1          // InterfaceMethod java/util/Collection.size:()I
        23: anewarray     #128                // class ext/mods/gameserver/model/pledge/SubPledge
        26: invokeinterface #903,  2          // InterfaceMethod java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        31: checkcast     #904                // class "[Lext/mods/gameserver/model/pledge/SubPledge;"
        34: areturn
      LineNumberTable:
        line 1407: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public ext.mods.gameserver.model.pledge.SubPledge createSubPledge(ext.mods.gameserver.model.actor.Player, int, int, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;IILjava/lang/String;)Lext/mods/gameserver/model/pledge/SubPledge;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=10, args_size=5
         0: aload_0
         1: iload_2
         2: invokevirtual #906                // Method getAvailablePledgeTypes:(I)I
         5: istore        5
         7: iload         5
         9: ifne          32
        12: aload_1
        13: iload_2
        14: iconst_m1
        15: if_icmpne     24
        18: getstatic     #909                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_HAS_ALREADY_ESTABLISHED_A_CLAN_ACADEMY:Lext/mods/gameserver/network/SystemMessageId;
        21: goto          27
        24: getstatic     #912                // Field ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_MILITARY_UNIT:Lext/mods/gameserver/network/SystemMessageId;
        27: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        30: aconst_null
        31: areturn
        32: aload_0
        33: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
        36: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
        39: iload_3
        40: if_icmpne     52
        43: aload_1
        44: getstatic     #912                // Field ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_MILITARY_UNIT:Lext/mods/gameserver/network/SystemMessageId;
        47: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        50: aconst_null
        51: areturn
        52: iload         5
        54: iconst_m1
        55: if_icmpeq     103
        58: aload_0
        59: getfield      #712                // Field _reputationScore:I
        62: sipush        5000
        65: if_icmpge     76
        68: iload         5
        70: sipush        1001
        73: if_icmplt     94
        76: aload_0
        77: getfield      #712                // Field _reputationScore:I
        80: sipush        10000
        83: if_icmpge     103
        86: iload         5
        88: sipush        200
        91: if_icmple     103
        94: aload_1
        95: getstatic     #918                // Field ext/mods/gameserver/network/SystemMessageId.THE_CLAN_REPUTATION_SCORE_IS_TOO_LOW:Lext/mods/gameserver/network/SystemMessageId;
        98: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       101: aconst_null
       102: areturn
       103: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       106: astore        6
       108: aload         6
       110: ldc_w         #921                // String INSERT INTO clan_subpledges (clan_id,sub_pledge_id,name,leader_id) values (?,?,?,?)
       113: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       118: astore        7
       120: aload         7
       122: iconst_1
       123: aload_0
       124: getfield      #51                 // Field _clanId:I
       127: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       132: aload         7
       134: iconst_2
       135: iload         5
       137: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       142: aload         7
       144: iconst_3
       145: aload         4
       147: invokeinterface #662,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       152: aload         7
       154: iconst_4
       155: iload         5
       157: iconst_m1
       158: if_icmpeq     165
       161: iload_3
       162: goto          166
       165: iconst_0
       166: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       171: aload         7
       173: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       178: pop
       179: aload         7
       181: ifnull        223
       184: aload         7
       186: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       191: goto          223
       194: astore        8
       196: aload         7
       198: ifnull        220
       201: aload         7
       203: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       208: goto          220
       211: astore        9
       213: aload         8
       215: aload         9
       217: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       220: aload         8
       222: athrow
       223: aload         6
       225: ifnull        267
       228: aload         6
       230: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       235: goto          267
       238: astore        7
       240: aload         6
       242: ifnull        264
       245: aload         6
       247: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       252: goto          264
       255: astore        8
       257: aload         7
       259: aload         8
       261: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       264: aload         7
       266: athrow
       267: goto          285
       270: astore        6
       272: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       275: ldc_w         #923                // String Error creating subpledge.
       278: aload         6
       280: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       283: aconst_null
       284: areturn
       285: new           #128                // class ext/mods/gameserver/model/pledge/SubPledge
       288: dup
       289: iload         5
       291: aload         4
       293: iload_3
       294: invokespecial #138                // Method ext/mods/gameserver/model/pledge/SubPledge."<init>":(ILjava/lang/String;I)V
       297: astore        6
       299: aload_0
       300: getfield      #25                 // Field _subPledges:Ljava/util/Map;
       303: iload         5
       305: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       308: aload         6
       310: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       315: pop
       316: iload         5
       318: iconst_m1
       319: if_icmpeq     357
       322: iload         5
       324: sipush        1001
       327: if_icmpge     341
       330: aload_0
       331: sipush        5000
       334: invokevirtual #925                // Method takeReputationScore:(I)Z
       337: pop
       338: goto          357
       341: iload         5
       343: sipush        200
       346: if_icmple     357
       349: aload_0
       350: sipush        10000
       353: invokevirtual #925                // Method takeReputationScore:(I)Z
       356: pop
       357: aload_0
       358: iconst_2
       359: anewarray     #326                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       362: dup
       363: iconst_0
       364: new           #929                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
       367: dup
       368: aload_0
       369: invokespecial #931                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
       372: aastore
       373: dup
       374: iconst_1
       375: new           #932                // class ext/mods/gameserver/network/serverpackets/PledgeReceiveSubPledgeCreated
       378: dup
       379: aload         6
       381: aload_0
       382: invokespecial #934                // Method ext/mods/gameserver/network/serverpackets/PledgeReceiveSubPledgeCreated."<init>":(Lext/mods/gameserver/model/pledge/SubPledge;Lext/mods/gameserver/model/pledge/Clan;)V
       385: aastore
       386: invokevirtual #344                // Method broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       389: aload         6
       391: areturn
      Exception table:
         from    to  target type
           120   179   194   Class java/lang/Throwable
           201   208   211   Class java/lang/Throwable
           108   223   238   Class java/lang/Throwable
           245   252   255   Class java/lang/Throwable
           103   267   270   Class java/lang/Exception
      LineNumberTable:
        line 1412: 0
        line 1413: 7
        line 1415: 12
        line 1416: 30
        line 1419: 32
        line 1421: 43
        line 1422: 50
        line 1425: 52
        line 1427: 94
        line 1428: 101
        line 1431: 103
        line 1432: 108
        line 1434: 120
        line 1435: 132
        line 1436: 142
        line 1437: 152
        line 1438: 171
        line 1439: 179
        line 1431: 194
        line 1439: 223
        line 1431: 238
        line 1444: 267
        line 1440: 270
        line 1442: 272
        line 1443: 283
        line 1446: 285
        line 1447: 299
        line 1449: 316
        line 1451: 322
        line 1452: 330
        line 1453: 341
        line 1454: 349
        line 1457: 357
        line 1459: 389
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          120     103     7    ps   Ljava/sql/PreparedStatement;
          108     159     6   con   Ljava/sql/Connection;
          272      13     6     e   Ljava/lang/Exception;
            0     392     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     392     1 player   Lext/mods/gameserver/model/actor/Player;
            0     392     2  type   I
            0     392     3 leaderId   I
            0     392     4 subPledgeName   Ljava/lang/String;
            7     385     5 pledgeType   I
          299      93     6 subPledge   Lext/mods/gameserver/model/pledge/SubPledge;
      StackMapTable: number_of_entries = 21
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 4 /* same */
        frame_type = 19 /* same */
        frame_type = 23 /* same */
        frame_type = 17 /* same */
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/String, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/String, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int, int ]
        frame_type = 91 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/String, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/String, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/pledge/SubPledge ]
        frame_type = 15 /* same */

  public int getAvailablePledgeTypes(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field _subPledges:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #423,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: ifnull        134
        16: iload_1
        17: lookupswitch  { // 7

                      -1: 84

                     100: 86

                     200: 97

                    1001: 99

                    1002: 110

                    2001: 121

                    2002: 132
                 default: 134
            }
        84: iconst_0
        85: ireturn
        86: aload_0
        87: sipush        200
        90: invokevirtual #906                // Method getAvailablePledgeTypes:(I)I
        93: istore_1
        94: goto          134
        97: iconst_0
        98: ireturn
        99: aload_0
       100: sipush        1002
       103: invokevirtual #906                // Method getAvailablePledgeTypes:(I)I
       106: istore_1
       107: goto          134
       110: aload_0
       111: sipush        2001
       114: invokevirtual #906                // Method getAvailablePledgeTypes:(I)I
       117: istore_1
       118: goto          134
       121: aload_0
       122: sipush        2002
       125: invokevirtual #906                // Method getAvailablePledgeTypes:(I)I
       128: istore_1
       129: goto          134
       132: iconst_0
       133: ireturn
       134: iload_1
       135: ireturn
      LineNumberTable:
        line 1464: 0
        line 1466: 16
        line 1469: 84
        line 1472: 86
        line 1473: 94
        line 1476: 97
        line 1479: 99
        line 1480: 107
        line 1483: 110
        line 1484: 118
        line 1487: 121
        line 1488: 129
        line 1491: 132
        line 1494: 134
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     136     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     136     1 pledgeType   I
      StackMapTable: number_of_entries = 8
        frame_type = 251 /* same_frame_extended */
          offset_delta = 84
        frame_type = 1 /* same */
        frame_type = 10 /* same */
        frame_type = 1 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 1 /* same */

  public void updateSubPledgeInDB(ext.mods.gameserver.model.pledge.SubPledge);
    descriptor: (Lext/mods/gameserver/model/pledge/SubPledge;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_2
         4: aload_2
         5: ldc_w         #937                // String UPDATE clan_subpledges SET leader_id=?, name=? WHERE clan_id=? AND sub_pledge_id=?
         8: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_3
        14: aload_3
        15: iconst_1
        16: aload_1
        17: invokevirtual #688                // Method ext/mods/gameserver/model/pledge/SubPledge.getLeaderId:()I
        20: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        25: aload_3
        26: iconst_2
        27: aload_1
        28: invokevirtual #939                // Method ext/mods/gameserver/model/pledge/SubPledge.getName:()Ljava/lang/String;
        31: invokeinterface #662,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        36: aload_3
        37: iconst_3
        38: aload_0
        39: getfield      #51                 // Field _clanId:I
        42: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        47: aload_3
        48: iconst_4
        49: aload_1
        50: invokevirtual #689                // Method ext/mods/gameserver/model/pledge/SubPledge.getId:()I
        53: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        58: aload_3
        59: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        64: pop
        65: aload_3
        66: ifnull        105
        69: aload_3
        70: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        75: goto          105
        78: astore        4
        80: aload_3
        81: ifnull        102
        84: aload_3
        85: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        90: goto          102
        93: astore        5
        95: aload         4
        97: aload         5
        99: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       102: aload         4
       104: athrow
       105: aload_2
       106: ifnull        142
       109: aload_2
       110: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       115: goto          142
       118: astore_3
       119: aload_2
       120: ifnull        140
       123: aload_2
       124: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       129: goto          140
       132: astore        4
       134: aload_3
       135: aload         4
       137: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       140: aload_3
       141: athrow
       142: goto          156
       145: astore_2
       146: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       149: ldc_w         #940                // String Error updating subpledge.
       152: aload_2
       153: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       156: return
      Exception table:
         from    to  target type
            14    65    78   Class java/lang/Throwable
            84    90    93   Class java/lang/Throwable
             4   105   118   Class java/lang/Throwable
           123   129   132   Class java/lang/Throwable
             0   142   145   Class java/lang/Exception
      LineNumberTable:
        line 1499: 0
        line 1500: 4
        line 1502: 14
        line 1503: 25
        line 1504: 36
        line 1505: 47
        line 1506: 58
        line 1507: 65
        line 1499: 78
        line 1507: 105
        line 1499: 118
        line 1511: 142
        line 1508: 145
        line 1510: 146
        line 1512: 156
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      91     3    ps   Ljava/sql/PreparedStatement;
            4     138     2   con   Ljava/sql/Connection;
          146      10     2     e   Ljava/lang/Exception;
            0     157     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     157     1 pledge   Lext/mods/gameserver/model/pledge/SubPledge;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/SubPledge, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/SubPledge, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/SubPledge, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public int getPrivilegesByRank(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field _privileges:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: getstatic     #942                // Field ext/mods/gameserver/enums/PrivilegeType.NONE:Lext/mods/gameserver/enums/PrivilegeType;
        11: invokevirtual #948                // Method ext/mods/gameserver/enums/PrivilegeType.getMask:()I
        14: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        17: invokeinterface #951,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        22: checkcast     #99                 // class java/lang/Integer
        25: invokevirtual #954                // Method java/lang/Integer.intValue:()I
        28: ireturn
      LineNumberTable:
        line 1516: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      29     1  rank   I

  public void setPrivilegesForRank(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=3
         0: iload_1
         1: iconst_1
         2: if_icmplt     11
         5: iload_1
         6: bipush        9
         8: if_icmple     12
        11: return
        12: iload_1
        13: bipush        9
        15: if_icmpne     63
        18: iload_2
        19: getstatic     #957                // Field ext/mods/gameserver/enums/PrivilegeType.SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
        22: invokevirtual #948                // Method ext/mods/gameserver/enums/PrivilegeType.getMask:()I
        25: iand
        26: iload_2
        27: getstatic     #960                // Field ext/mods/gameserver/enums/PrivilegeType.CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
        30: invokevirtual #948                // Method ext/mods/gameserver/enums/PrivilegeType.getMask:()I
        33: iand
        34: iadd
        35: iload_2
        36: getstatic     #963                // Field ext/mods/gameserver/enums/PrivilegeType.CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
        39: invokevirtual #948                // Method ext/mods/gameserver/enums/PrivilegeType.getMask:()I
        42: iand
        43: iadd
        44: iload_2
        45: getstatic     #966                // Field ext/mods/gameserver/enums/PrivilegeType.CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
        48: invokevirtual #948                // Method ext/mods/gameserver/enums/PrivilegeType.getMask:()I
        51: iand
        52: iadd
        53: iload_2
        54: getstatic     #969                // Field ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
        57: invokevirtual #948                // Method ext/mods/gameserver/enums/PrivilegeType.getMask:()I
        60: iand
        61: iadd
        62: istore_2
        63: aload_0
        64: getfield      #22                 // Field _privileges:Ljava/util/Map;
        67: iload_1
        68: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        71: iload_2
        72: invokestatic  #98                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        75: invokeinterface #104,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        80: pop
        81: aload_0
        82: invokevirtual #323                // Method broadcastClanStatus:()V
        85: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        88: astore_3
        89: aload_3
        90: ldc_w         #972                // String INSERT INTO clan_privs (clan_id,ranking,privs) VALUES (?,?,?) ON DUPLICATE KEY UPDATE privs=VALUES(privs)
        93: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        98: astore        4
       100: aload         4
       102: iconst_1
       103: aload_0
       104: getfield      #51                 // Field _clanId:I
       107: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       112: aload         4
       114: iconst_2
       115: iload_1
       116: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       121: aload         4
       123: iconst_3
       124: iload_2
       125: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       130: aload         4
       132: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       137: pop
       138: aload         4
       140: ifnull        182
       143: aload         4
       145: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       150: goto          182
       153: astore        5
       155: aload         4
       157: ifnull        179
       160: aload         4
       162: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       167: goto          179
       170: astore        6
       172: aload         5
       174: aload         6
       176: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       179: aload         5
       181: athrow
       182: aload_3
       183: ifnull        222
       186: aload_3
       187: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       192: goto          222
       195: astore        4
       197: aload_3
       198: ifnull        219
       201: aload_3
       202: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       207: goto          219
       210: astore        5
       212: aload         4
       214: aload         5
       216: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       219: aload         4
       221: athrow
       222: goto          236
       225: astore_3
       226: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       229: ldc_w         #974                // String Error while storing ranking.
       232: aload_3
       233: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       236: return
      Exception table:
         from    to  target type
           100   138   153   Class java/lang/Throwable
           160   167   170   Class java/lang/Throwable
            89   182   195   Class java/lang/Throwable
           201   207   210   Class java/lang/Throwable
            85   222   225   Class java/lang/Exception
      LineNumberTable:
        line 1526: 0
        line 1527: 11
        line 1529: 12
        line 1531: 18
        line 1534: 63
        line 1536: 81
        line 1538: 85
        line 1539: 89
        line 1541: 100
        line 1542: 112
        line 1543: 121
        line 1544: 130
        line 1545: 138
        line 1538: 153
        line 1545: 182
        line 1538: 195
        line 1549: 222
        line 1546: 225
        line 1548: 226
        line 1550: 236
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          100      82     4    ps   Ljava/sql/PreparedStatement;
           89     133     3   con   Ljava/sql/Connection;
          226      10     3     e   Ljava/lang/Exception;
            0     237     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     237     1  rank   I
            0     237     2 privs   I
      StackMapTable: number_of_entries = 13
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 50 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 89
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public int getLeaderSubPledge(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: iconst_0
         1: istore_2
         2: aload_0
         3: getfield      #25                 // Field _subPledges:Ljava/util/Map;
         6: invokeinterface #427,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        11: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        16: astore_3
        17: aload_3
        18: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        23: ifeq          66
        26: aload_3
        27: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        32: checkcast     #128                // class ext/mods/gameserver/model/pledge/SubPledge
        35: astore        4
        37: aload         4
        39: invokevirtual #688                // Method ext/mods/gameserver/model/pledge/SubPledge.getLeaderId:()I
        42: ifne          48
        45: goto          17
        48: aload         4
        50: invokevirtual #688                // Method ext/mods/gameserver/model/pledge/SubPledge.getLeaderId:()I
        53: iload_1
        54: if_icmpne     63
        57: aload         4
        59: invokevirtual #689                // Method ext/mods/gameserver/model/pledge/SubPledge.getId:()I
        62: istore_2
        63: goto          17
        66: iload_2
        67: ireturn
      LineNumberTable:
        line 1554: 0
        line 1555: 2
        line 1557: 37
        line 1558: 45
        line 1560: 48
        line 1561: 57
        line 1562: 63
        line 1563: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      26     4    sp   Lext/mods/gameserver/model/pledge/SubPledge;
            0      68     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      68     1 leaderId   I
            2      66     2    id   I
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/pledge/SubPledge ]
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 250 /* chop */
          offset_delta = 2

  public int getReputationScore();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #712                // Field _reputationScore:I
         4: ireturn
      LineNumberTable:
        line 1568: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public synchronized boolean addReputationScore(int);
    descriptor: (I)Z
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #712                // Field _reputationScore:I
         5: iload_1
         6: iadd
         7: invokevirtual #976                // Method setReputationScore:(I)Z
        10: ireturn
      LineNumberTable:
        line 1578: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      11     1 value   I

  public synchronized boolean takeReputationScore(int);
    descriptor: (I)Z
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #712                // Field _reputationScore:I
         5: iload_1
         6: isub
         7: invokevirtual #976                // Method setReputationScore:(I)Z
        10: ireturn
      LineNumberTable:
        line 1588: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0      11     1 value   I

  public int getRank();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #1001               // Field _rank:I
         4: ireturn
      LineNumberTable:
        line 1662: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setRank(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #1001               // Field _rank:I
         5: return
      LineNumberTable:
        line 1667: 0
        line 1668: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0       6     1  rank   I

  public int getAuctionBiddedAt();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #1004               // Field _auctionBiddedAt:I
         4: ireturn
      LineNumberTable:
        line 1672: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/Clan;

  public void setAuctionBiddedAt(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #1004               // Field _auctionBiddedAt:I
         5: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         8: astore_2
         9: aload_2
        10: ldc_w         #1007               // String UPDATE clan_data SET auction_bid_at=? WHERE clan_id=?
        13: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        18: astore_3
        19: aload_3
        20: iconst_1
        21: iload_1
        22: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        27: aload_3
        28: iconst_2
        29: aload_0
        30: getfield      #51                 // Field _clanId:I
        33: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        38: aload_3
        39: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        44: pop
        45: aload_3
        46: ifnull        85
        49: aload_3
        50: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        55: goto          85
        58: astore        4
        60: aload_3
        61: ifnull        82
        64: aload_3
        65: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        70: goto          82
        73: astore        5
        75: aload         4
        77: aload         5
        79: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        82: aload         4
        84: athrow
        85: aload_2
        86: ifnull        122
        89: aload_2
        90: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
        95: goto          122
        98: astore_3
        99: aload_2
       100: ifnull        120
       103: aload_2
       104: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       109: goto          120
       112: astore        4
       114: aload_3
       115: aload         4
       117: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       120: aload_3
       121: athrow
       122: goto          136
       125: astore_2
       126: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       129: ldc_w         #1009               // String Error while updating clan auction.
       132: aload_2
       133: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       136: return
      Exception table:
         from    to  target type
            19    45    58   Class java/lang/Throwable
            64    70    73   Class java/lang/Throwable
             9    85    98   Class java/lang/Throwable
           103   109   112   Class java/lang/Throwable
             5   122   125   Class java/lang/Exception
      LineNumberTable:
        line 1677: 0
        line 1679: 5
        line 1680: 9
        line 1682: 19
        line 1683: 27
        line 1684: 38
        line 1685: 45
        line 1679: 58
        line 1685: 85
        line 1679: 98
        line 1689: 122
        line 1686: 125
        line 1688: 126
        line 1690: 136
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      66     3    ps   Ljava/sql/PreparedStatement;
            9     113     2   con   Ljava/sql/Connection;
          126      10     2     e   Ljava/lang/Exception;
            0     137     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     137     1    id   I
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public boolean checkClanJoinCondition(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_1
         7: getstatic     #1011               // Field ext/mods/gameserver/enums/PrivilegeType.SP_INVITE:Lext/mods/gameserver/enums/PrivilegeType;
        10: invokevirtual #1014               // Method ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
        13: ifne          25
        16: aload_1
        17: getstatic     #1018               // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
        20: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        23: iconst_0
        24: ireturn
        25: aload_2
        26: ifnonnull     38
        29: aload_1
        30: getstatic     #1021               // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_INVITED_THE_WRONG_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        33: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        36: iconst_0
        37: ireturn
        38: aload_1
        39: invokevirtual #1024               // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        42: aload_2
        43: invokevirtual #1024               // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        46: if_icmpne     58
        49: aload_1
        50: getstatic     #1025               // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_INVITE_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
        53: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        56: iconst_0
        57: ireturn
        58: aload_2
        59: invokevirtual #1028               // Method ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
        62: ifeq          81
        65: aload_1
        66: getstatic     #1031               // Field ext/mods/gameserver/network/SystemMessageId.S1_BLOCKED_EVERYTHING:Lext/mods/gameserver/network/SystemMessageId;
        69: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        72: aload_2
        73: invokevirtual #1034               // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        76: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        79: iconst_0
        80: ireturn
        81: invokestatic  #1038               // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
        84: aload_2
        85: aload_1
        86: invokevirtual #1043               // Method ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
        89: ifeq          108
        92: aload_1
        93: getstatic     #1047               // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_ADDED_YOU_TO_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
        96: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        99: aload_2
       100: invokevirtual #1034               // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       103: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       106: iconst_0
       107: ireturn
       108: aload_2
       109: invokevirtual #1050               // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
       112: ifeq          131
       115: aload_1
       116: getstatic     #1053               // Field ext/mods/gameserver/network/SystemMessageId.S1_WORKING_WITH_ANOTHER_CLAN:Lext/mods/gameserver/network/SystemMessageId;
       119: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       122: aload_2
       123: invokevirtual #1034               // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       126: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       129: iconst_0
       130: ireturn
       131: aload_0
       132: getfield      #417                // Field _charPenaltyExpiryTime:J
       135: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
       138: lcmp
       139: ifle          151
       142: aload_1
       143: getstatic     #1056               // Field ext/mods/gameserver/network/SystemMessageId.YOU_MUST_WAIT_BEFORE_ACCEPTING_A_NEW_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
       146: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       149: iconst_0
       150: ireturn
       151: aload_2
       152: invokevirtual #1059               // Method ext/mods/gameserver/model/actor/Player.getClanJoinExpiryTime:()J
       155: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
       158: lcmp
       159: ifle          178
       162: aload_1
       163: getstatic     #1062               // Field ext/mods/gameserver/network/SystemMessageId.S1_MUST_WAIT_BEFORE_JOINING_ANOTHER_CLAN:Lext/mods/gameserver/network/SystemMessageId;
       166: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       169: aload_2
       170: invokevirtual #1034               // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       173: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       176: iconst_0
       177: ireturn
       178: aload_2
       179: invokevirtual #1065               // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       182: invokevirtual #1069               // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       185: bipush        40
       187: if_icmpgt     201
       190: aload_2
       191: invokevirtual #1072               // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       194: invokevirtual #1076               // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
       197: iconst_2
       198: if_icmplt     229
       201: iload_3
       202: iconst_m1
       203: if_icmpne     229
       206: aload_1
       207: getstatic     #1079               // Field ext/mods/gameserver/network/SystemMessageId.S1_DOESNOT_MEET_REQUIREMENTS_TO_JOIN_ACADEMY:Lext/mods/gameserver/network/SystemMessageId;
       210: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       213: aload_2
       214: invokevirtual #1034               // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       217: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       220: aload_1
       221: getstatic     #1082               // Field ext/mods/gameserver/network/SystemMessageId.ACADEMY_REQUIREMENTS:Lext/mods/gameserver/network/SystemMessageId;
       224: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       227: iconst_0
       228: ireturn
       229: aload_0
       230: iload_3
       231: invokevirtual #1085               // Method getSubPledgeMembersCount:(I)I
       234: aload_0
       235: iload_3
       236: invokevirtual #1088               // Method getMaxNrOfMembers:(I)I
       239: if_icmplt     275
       242: iload_3
       243: ifne          266
       246: aload_1
       247: getstatic     #1091               // Field ext/mods/gameserver/network/SystemMessageId.S1_CLAN_IS_FULL:Lext/mods/gameserver/network/SystemMessageId;
       250: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       253: aload_0
       254: invokevirtual #1094               // Method getName:()Ljava/lang/String;
       257: invokevirtual #340                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       260: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       263: goto          273
       266: aload_1
       267: getstatic     #1095               // Field ext/mods/gameserver/network/SystemMessageId.SUBCLAN_IS_FULL:Lext/mods/gameserver/network/SystemMessageId;
       270: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       273: iconst_0
       274: ireturn
       275: iconst_1
       276: ireturn
      LineNumberTable:
        line 1700: 0
        line 1701: 4
        line 1703: 6
        line 1705: 16
        line 1706: 23
        line 1709: 25
        line 1711: 29
        line 1712: 36
        line 1715: 38
        line 1717: 49
        line 1718: 56
        line 1721: 58
        line 1723: 65
        line 1724: 79
        line 1727: 81
        line 1729: 92
        line 1730: 106
        line 1733: 108
        line 1735: 115
        line 1736: 129
        line 1739: 131
        line 1741: 142
        line 1742: 149
        line 1745: 151
        line 1747: 162
        line 1748: 176
        line 1751: 178
        line 1753: 206
        line 1754: 220
        line 1755: 227
        line 1758: 229
        line 1760: 242
        line 1761: 246
        line 1763: 266
        line 1765: 273
        line 1767: 275
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     277     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     277     1 player   Lext/mods/gameserver/model/actor/Player;
            0     277     2 target   Lext/mods/gameserver/model/actor/Player;
            0     277     3 pledgeType   I
      StackMapTable: number_of_entries = 14
        frame_type = 6 /* same */
        frame_type = 18 /* same */
        frame_type = 12 /* same */
        frame_type = 19 /* same */
        frame_type = 22 /* same */
        frame_type = 26 /* same */
        frame_type = 22 /* same */
        frame_type = 19 /* same */
        frame_type = 26 /* same */
        frame_type = 22 /* same */
        frame_type = 27 /* same */
        frame_type = 36 /* same */
        frame_type = 6 /* same */
        frame_type = 1 /* same */

  public static boolean checkAllyJoinCondition(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=6, args_size=2
         0: aload_0
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: invokevirtual #1098               // Method ext/mods/gameserver/model/actor/Player.getAllyId:()I
        10: ifeq          31
        13: aload_0
        14: invokevirtual #588                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        17: ifeq          31
        20: aload_0
        21: invokevirtual #1050               // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        24: aload_0
        25: invokevirtual #1098               // Method ext/mods/gameserver/model/actor/Player.getAllyId:()I
        28: if_icmpeq     40
        31: aload_0
        32: getstatic     #1101               // Field ext/mods/gameserver/network/SystemMessageId.FEATURE_ONLY_FOR_ALLIANCE_LEADER:Lext/mods/gameserver/network/SystemMessageId;
        35: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        38: iconst_0
        39: ireturn
        40: aload_0
        41: invokevirtual #1104               // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        44: astore_2
        45: aload_2
        46: invokevirtual #1108               // Method getAllyPenaltyType:()I
        49: iconst_3
        50: if_icmpne     73
        53: aload_2
        54: invokevirtual #1111               // Method getAllyPenaltyExpiryTime:()J
        57: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
        60: lcmp
        61: ifle          73
        64: aload_0
        65: getstatic     #1114               // Field ext/mods/gameserver/network/SystemMessageId.CANT_INVITE_CLAN_WITHIN_1_DAY:Lext/mods/gameserver/network/SystemMessageId;
        68: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        71: iconst_0
        72: ireturn
        73: aload_1
        74: ifnonnull     86
        77: aload_0
        78: getstatic     #1117               // Field ext/mods/gameserver/network/SystemMessageId.SELECT_USER_TO_INVITE:Lext/mods/gameserver/network/SystemMessageId;
        81: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        84: iconst_0
        85: ireturn
        86: aload_0
        87: invokevirtual #1024               // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        90: aload_1
        91: invokevirtual #1024               // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        94: if_icmpne     106
        97: aload_0
        98: getstatic     #1025               // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_INVITE_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
       101: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       104: iconst_0
       105: ireturn
       106: aload_1
       107: invokevirtual #1104               // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       110: ifnonnull     122
       113: aload_0
       114: getstatic     #1120               // Field ext/mods/gameserver/network/SystemMessageId.TARGET_MUST_BE_IN_CLAN:Lext/mods/gameserver/network/SystemMessageId;
       117: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       120: iconst_0
       121: ireturn
       122: aload_1
       123: invokevirtual #588                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       126: ifne          145
       129: aload_0
       130: getstatic     #1123               // Field ext/mods/gameserver/network/SystemMessageId.S1_IS_NOT_A_CLAN_LEADER:Lext/mods/gameserver/network/SystemMessageId;
       133: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       136: aload_1
       137: invokevirtual #1034               // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       140: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       143: iconst_0
       144: ireturn
       145: aload_1
       146: invokevirtual #1104               // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       149: astore_3
       150: aload_1
       151: invokevirtual #1098               // Method ext/mods/gameserver/model/actor/Player.getAllyId:()I
       154: ifeq          183
       157: aload_0
       158: getstatic     #1126               // Field ext/mods/gameserver/network/SystemMessageId.S1_CLAN_ALREADY_MEMBER_OF_S2_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
       161: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       164: aload_3
       165: invokevirtual #1094               // Method getName:()Ljava/lang/String;
       168: invokevirtual #340                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       171: aload_3
       172: invokevirtual #1129               // Method getAllyName:()Ljava/lang/String;
       175: invokevirtual #340                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       178: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       181: iconst_0
       182: ireturn
       183: aload_3
       184: invokevirtual #1111               // Method getAllyPenaltyExpiryTime:()J
       187: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
       190: lcmp
       191: ifle          238
       194: aload_3
       195: invokevirtual #1108               // Method getAllyPenaltyType:()I
       198: iconst_1
       199: if_icmpne     221
       202: aload_0
       203: getstatic     #1132               // Field ext/mods/gameserver/network/SystemMessageId.S1_CANT_ENTER_ALLIANCE_WITHIN_1_DAY:Lext/mods/gameserver/network/SystemMessageId;
       206: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       209: aload_3
       210: invokevirtual #1094               // Method getName:()Ljava/lang/String;
       213: invokevirtual #340                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       216: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       219: iconst_0
       220: ireturn
       221: aload_3
       222: invokevirtual #1108               // Method getAllyPenaltyType:()I
       225: iconst_2
       226: if_icmpne     238
       229: aload_0
       230: getstatic     #1135               // Field ext/mods/gameserver/network/SystemMessageId.CANT_ENTER_ALLIANCE_WITHIN_1_DAY:Lext/mods/gameserver/network/SystemMessageId;
       233: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       236: iconst_0
       237: ireturn
       238: invokestatic  #470                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       241: invokevirtual #475                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
       244: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       249: astore        4
       251: aload         4
       253: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       258: ifeq          298
       261: aload         4
       263: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       268: checkcast     #490                // class ext/mods/gameserver/model/residence/castle/Castle
       271: astore        5
       273: aload         5
       275: invokevirtual #492                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       278: aload_2
       279: aload_3
       280: invokevirtual #1138               // Method ext/mods/gameserver/model/residence/castle/Siege.isOnOppositeSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
       283: ifeq          295
       286: aload_0
       287: getstatic     #1142               // Field ext/mods/gameserver/network/SystemMessageId.OPPOSING_CLAN_IS_PARTICIPATING_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
       290: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       293: iconst_0
       294: ireturn
       295: goto          251
       298: aload_2
       299: aload_3
       300: invokevirtual #1145               // Method getClanId:()I
       303: invokevirtual #1146               // Method isAtWarWith:(I)Z
       306: ifeq          318
       309: aload_0
       310: getstatic     #1149               // Field ext/mods/gameserver/network/SystemMessageId.MAY_NOT_ALLY_CLAN_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
       313: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       316: iconst_0
       317: ireturn
       318: invokestatic  #826                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       321: aload_0
       322: invokevirtual #1098               // Method ext/mods/gameserver/model/actor/Player.getAllyId:()I
       325: invokevirtual #831                // Method ext/mods/gameserver/data/sql/ClanTable.getClanAllies:(I)Ljava/util/List;
       328: invokeinterface #700,  1          // InterfaceMethod java/util/List.size:()I
       333: getstatic     #1152               // Field ext/mods/Config.MAX_NUM_OF_CLANS_IN_ALLY:I
       336: if_icmplt     348
       339: aload_0
       340: getstatic     #1155               // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_EXCEEDED_THE_LIMIT:Lext/mods/gameserver/network/SystemMessageId;
       343: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       346: iconst_0
       347: ireturn
       348: iconst_1
       349: ireturn
      LineNumberTable:
        line 1777: 0
        line 1778: 4
        line 1780: 6
        line 1782: 31
        line 1783: 38
        line 1786: 40
        line 1787: 45
        line 1789: 64
        line 1790: 71
        line 1793: 73
        line 1795: 77
        line 1796: 84
        line 1799: 86
        line 1801: 97
        line 1802: 104
        line 1805: 106
        line 1807: 113
        line 1808: 120
        line 1811: 122
        line 1813: 129
        line 1814: 143
        line 1817: 145
        line 1818: 150
        line 1820: 157
        line 1821: 181
        line 1824: 183
        line 1826: 194
        line 1828: 202
        line 1829: 219
        line 1832: 221
        line 1834: 229
        line 1835: 236
        line 1839: 238
        line 1841: 273
        line 1843: 286
        line 1844: 293
        line 1846: 295
        line 1848: 298
        line 1850: 309
        line 1851: 316
        line 1854: 318
        line 1856: 339
        line 1857: 346
        line 1860: 348
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          273      22     5 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0     350     0 player   Lext/mods/gameserver/model/actor/Player;
            0     350     1 target   Lext/mods/gameserver/model/actor/Player;
           45     305     2 leaderClan   Lext/mods/gameserver/model/pledge/Clan;
          150     200     3 targetClan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 16
        frame_type = 6 /* same */
        frame_type = 24 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 12 /* same */
        frame_type = 19 /* same */
        frame_type = 15 /* same */
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 37 /* same */
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 43 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 19 /* same */
        frame_type = 29 /* same */

  public boolean createAlly(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_1
         7: invokevirtual #588                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        10: ifne          22
        13: aload_1
        14: getstatic     #1158               // Field ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEADER_CREATE_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
        17: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        20: iconst_0
        21: ireturn
        22: aload_0
        23: getfield      #351                // Field _allyId:I
        26: ifeq          38
        29: aload_1
        30: getstatic     #1161               // Field ext/mods/gameserver/network/SystemMessageId.ALREADY_JOINED_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
        33: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        36: iconst_0
        37: ireturn
        38: aload_0
        39: getfield      #282                // Field _level:I
        42: iconst_5
        43: if_icmpge     55
        46: aload_1
        47: getstatic     #1164               // Field ext/mods/gameserver/network/SystemMessageId.TO_CREATE_AN_ALLY_YOU_CLAN_MUST_BE_LEVEL_5_OR_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
        50: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        53: iconst_0
        54: ireturn
        55: aload_0
        56: getfield      #414                // Field _allyPenaltyType:I
        59: iconst_4
        60: if_icmpne     83
        63: aload_0
        64: getfield      #410                // Field _allyPenaltyExpiryTime:J
        67: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
        70: lcmp
        71: ifle          83
        74: aload_1
        75: getstatic     #1167               // Field ext/mods/gameserver/network/SystemMessageId.CANT_CREATE_ALLIANCE_10_DAYS_DISOLUTION:Lext/mods/gameserver/network/SystemMessageId;
        78: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        81: iconst_0
        82: ireturn
        83: aload_0
        84: getfield      #420                // Field _dissolvingExpiryTime:J
        87: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
        90: lcmp
        91: ifle          103
        94: aload_1
        95: getstatic     #1170               // Field ext/mods/gameserver/network/SystemMessageId.YOU_MAY_NOT_CREATE_ALLY_WHILE_DISSOLVING:Lext/mods/gameserver/network/SystemMessageId;
        98: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       101: iconst_0
       102: ireturn
       103: aload_2
       104: invokestatic  #1173               // Method ext/mods/commons/lang/StringUtil.isAlphaNumeric:(Ljava/lang/String;)Z
       107: ifne          119
       110: aload_1
       111: getstatic     #1177               // Field ext/mods/gameserver/network/SystemMessageId.INCORRECT_ALLIANCE_NAME:Lext/mods/gameserver/network/SystemMessageId;
       114: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       117: iconst_0
       118: ireturn
       119: aload_2
       120: invokevirtual #1180               // Method java/lang/String.length:()I
       123: bipush        16
       125: if_icmpgt     136
       128: aload_2
       129: invokevirtual #1180               // Method java/lang/String.length:()I
       132: iconst_2
       133: if_icmpge     145
       136: aload_1
       137: getstatic     #1183               // Field ext/mods/gameserver/network/SystemMessageId.INCORRECT_ALLIANCE_NAME_LENGTH:Lext/mods/gameserver/network/SystemMessageId;
       140: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       143: iconst_0
       144: ireturn
       145: invokestatic  #826                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       148: aload_2
       149: invokevirtual #1186               // Method ext/mods/gameserver/data/sql/ClanTable.isAllyExists:(Ljava/lang/String;)Z
       152: ifeq          164
       155: aload_1
       156: getstatic     #1189               // Field ext/mods/gameserver/network/SystemMessageId.ALLIANCE_ALREADY_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
       159: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       162: iconst_0
       163: ireturn
       164: invokestatic  #470                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       167: invokevirtual #475                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
       170: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       175: astore_3
       176: aload_3
       177: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       182: ifeq          231
       185: aload_3
       186: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       191: checkcast     #490                // class ext/mods/gameserver/model/residence/castle/Castle
       194: astore        4
       196: aload         4
       198: invokevirtual #492                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       201: invokevirtual #496                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
       204: ifeq          228
       207: aload         4
       209: invokevirtual #492                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       212: aload_0
       213: invokevirtual #1192               // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
       216: ifeq          228
       219: aload_1
       220: getstatic     #1195               // Field ext/mods/gameserver/network/SystemMessageId.NO_ALLY_CREATION_WHILE_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
       223: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       226: iconst_0
       227: ireturn
       228: goto          176
       231: aload_0
       232: aload_0
       233: getfield      #51                 // Field _clanId:I
       236: putfield      #351                // Field _allyId:I
       239: aload_0
       240: aload_2
       241: putfield      #348                // Field _allyName:Ljava/lang/String;
       244: aload_0
       245: lconst_0
       246: iconst_0
       247: invokevirtual #1198               // Method setAllyPenaltyExpiryTime:(JI)V
       250: aload_0
       251: invokevirtual #271                // Method updateClanInDB:()V
       254: aload_1
       255: new           #532                // class ext/mods/gameserver/network/serverpackets/UserInfo
       258: dup
       259: aload_1
       260: invokespecial #534                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       263: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       266: iconst_1
       267: ireturn
      LineNumberTable:
        line 1865: 0
        line 1866: 4
        line 1868: 6
        line 1870: 13
        line 1871: 20
        line 1874: 22
        line 1876: 29
        line 1877: 36
        line 1880: 38
        line 1882: 46
        line 1883: 53
        line 1886: 55
        line 1888: 74
        line 1889: 81
        line 1892: 83
        line 1894: 94
        line 1895: 101
        line 1898: 103
        line 1900: 110
        line 1901: 117
        line 1904: 119
        line 1906: 136
        line 1907: 143
        line 1910: 145
        line 1912: 155
        line 1913: 162
        line 1916: 164
        line 1918: 196
        line 1920: 219
        line 1921: 226
        line 1923: 228
        line 1925: 231
        line 1926: 239
        line 1927: 244
        line 1928: 250
        line 1930: 254
        line 1931: 266
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          196      32     4 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0     268     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     268     1 player   Lext/mods/gameserver/model/actor/Player;
            0     268     2 allyName   Ljava/lang/String;
      StackMapTable: number_of_entries = 13
        frame_type = 6 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 27 /* same */
        frame_type = 19 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 8 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 51 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void dissolveAlly(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=2
         0: aload_0
         1: getfield      #351                // Field _allyId:I
         4: ifne          15
         7: aload_1
         8: getstatic     #1202               // Field ext/mods/gameserver/network/SystemMessageId.NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
        11: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        14: return
        15: aload_1
        16: invokevirtual #588                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        19: ifeq          33
        22: aload_0
        23: getfield      #51                 // Field _clanId:I
        26: aload_0
        27: getfield      #351                // Field _allyId:I
        30: if_icmpeq     41
        33: aload_1
        34: getstatic     #1101               // Field ext/mods/gameserver/network/SystemMessageId.FEATURE_ONLY_FOR_ALLIANCE_LEADER:Lext/mods/gameserver/network/SystemMessageId;
        37: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        40: return
        41: invokestatic  #826                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        44: aload_0
        45: getfield      #351                // Field _allyId:I
        48: invokevirtual #831                // Method ext/mods/gameserver/data/sql/ClanTable.getClanAllies:(I)Ljava/util/List;
        51: invokeinterface #802,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        56: astore_2
        57: aload_2
        58: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        63: ifeq          148
        66: aload_2
        67: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        72: checkcast     #11                 // class ext/mods/gameserver/model/pledge/Clan
        75: astore_3
        76: invokestatic  #470                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        79: invokevirtual #475                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
        82: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        87: astore        4
        89: aload         4
        91: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        96: ifeq          145
        99: aload         4
       101: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       106: checkcast     #490                // class ext/mods/gameserver/model/residence/castle/Castle
       109: astore        5
       111: aload         5
       113: invokevirtual #492                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       116: invokevirtual #496                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
       119: ifeq          142
       122: aload         5
       124: invokevirtual #492                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       127: aload_3
       128: invokevirtual #1192               // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
       131: ifeq          142
       134: aload_1
       135: getstatic     #1205               // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_DISSOLVE_ALLY_WHILE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
       138: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       141: return
       142: goto          89
       145: goto          57
       148: aload_0
       149: iconst_1
       150: anewarray     #326                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       153: dup
       154: iconst_0
       155: getstatic     #1208               // Field ext/mods/gameserver/network/SystemMessageId.ALLIANCE_DISOLVED:Lext/mods/gameserver/network/SystemMessageId;
       158: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       161: aastore
       162: invokevirtual #1211               // Method broadcastToAllyMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       165: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
       168: lstore_2
       169: invokestatic  #826                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       172: invokevirtual #1214               // Method ext/mods/gameserver/data/sql/ClanTable.getClans:()Ljava/util/Collection;
       175: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       180: astore        4
       182: aload         4
       184: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       189: ifeq          255
       192: aload         4
       194: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       199: checkcast     #11                 // class ext/mods/gameserver/model/pledge/Clan
       202: astore        5
       204: aload         5
       206: invokevirtual #1217               // Method getAllyId:()I
       209: aload_0
       210: getfield      #351                // Field _allyId:I
       213: if_icmpne     252
       216: aload         5
       218: invokevirtual #1145               // Method getClanId:()I
       221: aload_0
       222: getfield      #51                 // Field _clanId:I
       225: if_icmpeq     252
       228: aload         5
       230: iconst_0
       231: invokevirtual #1218               // Method setAllyId:(I)V
       234: aload         5
       236: aconst_null
       237: invokevirtual #1221               // Method setAllyName:(Ljava/lang/String;)V
       240: aload         5
       242: lconst_0
       243: iconst_0
       244: invokevirtual #1198               // Method setAllyPenaltyExpiryTime:(JI)V
       247: aload         5
       249: invokevirtual #271                // Method updateClanInDB:()V
       252: goto          182
       255: aload_0
       256: iconst_0
       257: putfield      #351                // Field _allyId:I
       260: aload_0
       261: aconst_null
       262: putfield      #348                // Field _allyName:Ljava/lang/String;
       265: aload_0
       266: iconst_0
       267: iconst_0
       268: invokevirtual #229                // Method changeAllyCrest:(IZ)V
       271: aload_0
       272: lload_2
       273: getstatic     #1224               // Field ext/mods/Config.CREATE_ALLY_DAYS_WHEN_DISSOLVED:I
       276: i2l
       277: ldc2_w        #630                // long 86400000l
       280: lmul
       281: ladd
       282: iconst_4
       283: invokevirtual #1198               // Method setAllyPenaltyExpiryTime:(JI)V
       286: aload_0
       287: invokevirtual #271                // Method updateClanInDB:()V
       290: aload_1
       291: iconst_0
       292: iconst_0
       293: invokevirtual #1227               // Method ext/mods/gameserver/model/actor/Player.applyDeathPenalty:(ZZ)V
       296: return
      LineNumberTable:
        line 1936: 0
        line 1938: 7
        line 1939: 14
        line 1942: 15
        line 1944: 33
        line 1945: 40
        line 1948: 41
        line 1950: 76
        line 1952: 111
        line 1954: 134
        line 1955: 141
        line 1957: 142
        line 1958: 145
        line 1960: 148
        line 1962: 165
        line 1963: 169
        line 1965: 204
        line 1967: 228
        line 1968: 234
        line 1969: 240
        line 1970: 247
        line 1972: 252
        line 1974: 255
        line 1975: 260
        line 1976: 265
        line 1977: 271
        line 1978: 286
        line 1980: 290
        line 1981: 296
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          111      31     5 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           76      69     3  clan   Lext/mods/gameserver/model/pledge/Clan;
          204      48     5  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     297     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     297     1 player   Lext/mods/gameserver/model/actor/Player;
          169     128     2 currentTime   J
      StackMapTable: number_of_entries = 11
        frame_type = 15 /* same */
        frame_type = 17 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class java/util/Iterator ]
        frame_type = 52 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ long, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 69
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean levelUpClan(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #588                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
         4: ifne          16
         7: aload_1
         8: getstatic     #1018               // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
        11: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        14: iconst_0
        15: ireturn
        16: invokestatic  #621                // Method java/lang/System.currentTimeMillis:()J
        19: aload_0
        20: getfield      #420                // Field _dissolvingExpiryTime:J
        23: lcmp
        24: ifge          36
        27: aload_1
        28: getstatic     #1231               // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_RISE_LEVEL_WHILE_DISSOLUTION_IN_PROGRESS:Lext/mods/gameserver/network/SystemMessageId;
        31: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        34: iconst_0
        35: ireturn
        36: iconst_0
        37: istore_2
        38: aload_0
        39: getfield      #282                // Field _level:I
        42: tableswitch   { // 0 to 7

                       0: 88

                       1: 125

                       2: 162

                       3: 200

                       4: 238

                       5: 276

                       6: 324

                       7: 372
                 default: 417
            }
        88: aload_1
        89: invokevirtual #1065               // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        92: invokevirtual #1234               // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
        95: sipush        30000
        98: if_icmplt     417
       101: aload_1
       102: ldc_w         #1237               // int 650000
       105: iconst_1
       106: invokevirtual #1238               // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
       109: ifeq          417
       112: aload_1
       113: lconst_0
       114: sipush        30000
       117: invokevirtual #1242               // Method ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
       120: iconst_1
       121: istore_2
       122: goto          417
       125: aload_1
       126: invokevirtual #1065               // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       129: invokevirtual #1234               // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
       132: ldc_w         #1245               // int 150000
       135: if_icmplt     417
       138: aload_1
       139: ldc_w         #1246               // int 2500000
       142: iconst_1
       143: invokevirtual #1238               // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
       146: ifeq          417
       149: aload_1
       150: lconst_0
       151: ldc_w         #1245               // int 150000
       154: invokevirtual #1242               // Method ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
       157: iconst_1
       158: istore_2
       159: goto          417
       162: aload_1
       163: invokevirtual #1065               // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       166: invokevirtual #1234               // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
       169: ldc_w         #1247               // int 500000
       172: if_icmplt     417
       175: aload_1
       176: sipush        1419
       179: iconst_1
       180: iconst_1
       181: invokevirtual #1248               // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       184: ifeq          417
       187: aload_1
       188: lconst_0
       189: ldc_w         #1247               // int 500000
       192: invokevirtual #1242               // Method ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
       195: iconst_1
       196: istore_2
       197: goto          417
       200: aload_1
       201: invokevirtual #1065               // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       204: invokevirtual #1234               // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
       207: ldc_w         #1252               // int 1400000
       210: if_icmplt     417
       213: aload_1
       214: sipush        3874
       217: iconst_1
       218: iconst_1
       219: invokevirtual #1248               // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       222: ifeq          417
       225: aload_1
       226: lconst_0
       227: ldc_w         #1252               // int 1400000
       230: invokevirtual #1242               // Method ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
       233: iconst_1
       234: istore_2
       235: goto          417
       238: aload_1
       239: invokevirtual #1065               // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       242: invokevirtual #1234               // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
       245: ldc_w         #1253               // int 3500000
       248: if_icmplt     417
       251: aload_1
       252: sipush        3870
       255: iconst_1
       256: iconst_1
       257: invokevirtual #1248               // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       260: ifeq          417
       263: aload_1
       264: lconst_0
       265: ldc_w         #1253               // int 3500000
       268: invokevirtual #1242               // Method ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
       271: iconst_1
       272: istore_2
       273: goto          417
       276: aload_0
       277: getfield      #712                // Field _reputationScore:I
       280: sipush        10000
       283: if_icmplt     417
       286: aload_0
       287: invokevirtual #1254               // Method getMembersCount:()I
       290: bipush        30
       292: if_icmplt     417
       295: aload_0
       296: sipush        10000
       299: invokevirtual #925                // Method takeReputationScore:(I)Z
       302: pop
       303: aload_1
       304: getstatic     #1257               // Field ext/mods/gameserver/network/SystemMessageId.S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
       307: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       310: sipush        10000
       313: invokevirtual #1260               // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       316: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       319: iconst_1
       320: istore_2
       321: goto          417
       324: aload_0
       325: getfield      #712                // Field _reputationScore:I
       328: sipush        20000
       331: if_icmplt     417
       334: aload_0
       335: invokevirtual #1254               // Method getMembersCount:()I
       338: bipush        80
       340: if_icmplt     417
       343: aload_0
       344: sipush        20000
       347: invokevirtual #925                // Method takeReputationScore:(I)Z
       350: pop
       351: aload_1
       352: getstatic     #1257               // Field ext/mods/gameserver/network/SystemMessageId.S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
       355: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       358: sipush        20000
       361: invokevirtual #1260               // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       364: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       367: iconst_1
       368: istore_2
       369: goto          417
       372: aload_0
       373: getfield      #712                // Field _reputationScore:I
       376: ldc_w         #1263               // int 40000
       379: if_icmplt     417
       382: aload_0
       383: invokevirtual #1254               // Method getMembersCount:()I
       386: bipush        120
       388: if_icmplt     417
       391: aload_0
       392: ldc_w         #1263               // int 40000
       395: invokevirtual #925                // Method takeReputationScore:(I)Z
       398: pop
       399: aload_1
       400: getstatic     #1257               // Field ext/mods/gameserver/network/SystemMessageId.S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
       403: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       406: ldc_w         #1263               // int 40000
       409: invokevirtual #1260               // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       412: invokevirtual #528                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       415: iconst_1
       416: istore_2
       417: iload_2
       418: ifne          430
       421: aload_1
       422: getstatic     #1264               // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_INCREASE_CLAN_LEVEL:Lext/mods/gameserver/network/SystemMessageId;
       425: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       428: iconst_0
       429: ireturn
       430: aload_0
       431: aload_0
       432: getfield      #282                // Field _level:I
       435: iconst_1
       436: iadd
       437: invokevirtual #1267               // Method changeLevel:(I)V
       440: iconst_1
       441: ireturn
      LineNumberTable:
        line 1985: 0
        line 1987: 7
        line 1988: 14
        line 1991: 16
        line 1993: 27
        line 1994: 34
        line 1997: 36
        line 1999: 38
        line 2002: 88
        line 2004: 112
        line 2005: 120
        line 2010: 125
        line 2012: 149
        line 2013: 157
        line 2018: 162
        line 2020: 187
        line 2021: 195
        line 2026: 200
        line 2028: 225
        line 2029: 233
        line 2034: 238
        line 2036: 263
        line 2037: 271
        line 2042: 276
        line 2044: 295
        line 2045: 303
        line 2046: 319
        line 2051: 324
        line 2053: 343
        line 2054: 351
        line 2055: 367
        line 2060: 372
        line 2062: 391
        line 2063: 399
        line 2064: 415
        line 2069: 417
        line 2071: 421
        line 2072: 428
        line 2075: 430
        line 2076: 440
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     442     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     442     1 player   Lext/mods/gameserver/model/actor/Player;
           38     404     2 increaseClanLevel   Z
      StackMapTable: number_of_entries = 12
        frame_type = 16 /* same */
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ int ]
        frame_type = 36 /* same */
        frame_type = 36 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 47 /* same */
        frame_type = 47 /* same */
        frame_type = 44 /* same */
        frame_type = 12 /* same */

  public void changeLevel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=2
         0: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_2
         4: aload_2
         5: ldc_w         #1270               // String UPDATE clan_data SET clan_level = ? WHERE clan_id = ?
         8: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_3
        14: aload_3
        15: iconst_1
        16: iload_1
        17: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        22: aload_3
        23: iconst_2
        24: aload_0
        25: getfield      #51                 // Field _clanId:I
        28: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        33: aload_3
        34: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        39: pop
        40: aload_3
        41: ifnull        80
        44: aload_3
        45: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        50: goto          80
        53: astore        4
        55: aload_3
        56: ifnull        77
        59: aload_3
        60: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        65: goto          77
        68: astore        5
        70: aload         4
        72: aload         5
        74: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        77: aload         4
        79: athrow
        80: aload_2
        81: ifnull        117
        84: aload_2
        85: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
        90: goto          117
        93: astore_3
        94: aload_2
        95: ifnull        115
        98: aload_2
        99: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       104: goto          115
       107: astore        4
       109: aload_3
       110: aload         4
       112: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       115: aload_3
       116: athrow
       117: goto          131
       120: astore_2
       121: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       124: ldc_w         #1272               // String Error while updating clan level.
       127: aload_2
       128: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       131: aload_0
       132: iload_1
       133: invokevirtual #1274               // Method setLevel:(I)V
       136: aload_0
       137: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
       140: invokevirtual #585                // Method ext/mods/gameserver/model/pledge/ClanMember.isOnline:()Z
       143: ifeq          187
       146: aload_0
       147: getfield      #250                // Field _leader:Lext/mods/gameserver/model/pledge/ClanMember;
       150: invokevirtual #257                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
       153: astore_2
       154: iconst_3
       155: iload_1
       156: if_icmpge     166
       159: aload_2
       160: invokevirtual #309                // Method ext/mods/gameserver/model/actor/Player.addSiegeSkills:()V
       163: goto          175
       166: iconst_4
       167: iload_1
       168: if_icmple     175
       171: aload_2
       172: invokevirtual #290                // Method ext/mods/gameserver/model/actor/Player.removeSiegeSkills:()V
       175: iconst_4
       176: iload_1
       177: if_icmpge     187
       180: aload_2
       181: getstatic     #1277               // Field ext/mods/gameserver/network/SystemMessageId.CLAN_CAN_ACCUMULATE_CLAN_REPUTATION_POINTS:Lext/mods/gameserver/network/SystemMessageId;
       184: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       187: aload_0
       188: iconst_2
       189: anewarray     #326                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       192: dup
       193: iconst_0
       194: new           #929                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
       197: dup
       198: aload_0
       199: invokespecial #931                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
       202: aastore
       203: dup
       204: iconst_1
       205: getstatic     #1280               // Field ext/mods/gameserver/network/SystemMessageId.CLAN_LEVEL_INCREASED:Lext/mods/gameserver/network/SystemMessageId;
       208: invokestatic  #334                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       211: aastore
       212: invokevirtual #344                // Method broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       215: return
      Exception table:
         from    to  target type
            14    40    53   Class java/lang/Throwable
            59    65    68   Class java/lang/Throwable
             4    80    93   Class java/lang/Throwable
            98   104   107   Class java/lang/Throwable
             0   117   120   Class java/lang/Exception
      LineNumberTable:
        line 2081: 0
        line 2082: 4
        line 2084: 14
        line 2085: 22
        line 2086: 33
        line 2087: 40
        line 2081: 53
        line 2087: 80
        line 2081: 93
        line 2091: 117
        line 2088: 120
        line 2090: 121
        line 2093: 131
        line 2095: 136
        line 2097: 146
        line 2098: 154
        line 2099: 159
        line 2100: 166
        line 2101: 171
        line 2103: 175
        line 2104: 180
        line 2107: 187
        line 2108: 215
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      66     3    ps   Ljava/sql/PreparedStatement;
            4     113     2   con   Ljava/sql/Connection;
          121      10     2     e   Ljava/lang/Exception;
          154      33     2 leader   Lext/mods/gameserver/model/actor/Player;
            0     216     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     216     1 level   I
      StackMapTable: number_of_entries = 13
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 8 /* same */
        frame_type = 250 /* chop */
          offset_delta = 11

  public void changeClanCrest(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: getfield      #178                // Field _crestId:I
         4: ifeq          20
         7: invokestatic  #181                // Method ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
        10: getstatic     #186                // Field ext/mods/gameserver/enums/CrestType.PLEDGE:Lext/mods/gameserver/enums/CrestType;
        13: aload_0
        14: getfield      #178                // Field _crestId:I
        17: invokevirtual #1283               // Method ext/mods/gameserver/data/cache/CrestCache.removeCrest:(Lext/mods/gameserver/enums/CrestType;I)V
        20: aload_0
        21: iload_1
        22: putfield      #178                // Field _crestId:I
        25: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        28: astore_2
        29: aload_2
        30: ldc_w         #1287               // String UPDATE clan_data SET crest_id = ? WHERE clan_id = ?
        33: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        38: astore_3
        39: aload_3
        40: iconst_1
        41: iload_1
        42: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        47: aload_3
        48: iconst_2
        49: aload_0
        50: getfield      #51                 // Field _clanId:I
        53: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        58: aload_3
        59: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        64: pop
        65: aload_3
        66: ifnull        105
        69: aload_3
        70: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        75: goto          105
        78: astore        4
        80: aload_3
        81: ifnull        102
        84: aload_3
        85: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        90: goto          102
        93: astore        5
        95: aload         4
        97: aload         5
        99: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       102: aload         4
       104: athrow
       105: aload_2
       106: ifnull        142
       109: aload_2
       110: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       115: goto          142
       118: astore_3
       119: aload_2
       120: ifnull        140
       123: aload_2
       124: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       129: goto          140
       132: astore        4
       134: aload_3
       135: aload         4
       137: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       140: aload_3
       141: athrow
       142: goto          156
       145: astore_2
       146: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       149: ldc_w         #1289               // String Error while updating clan crest.
       152: aload_2
       153: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       156: aload_0
       157: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       160: astore_2
       161: aload_2
       162: arraylength
       163: istore_3
       164: iconst_0
       165: istore        4
       167: iload         4
       169: iload_3
       170: if_icmpge     190
       173: aload_2
       174: iload         4
       176: aaload
       177: astore        5
       179: aload         5
       181: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       184: iinc          4, 1
       187: goto          167
       190: return
      Exception table:
         from    to  target type
            39    65    78   Class java/lang/Throwable
            84    90    93   Class java/lang/Throwable
            29   105   118   Class java/lang/Throwable
           123   129   132   Class java/lang/Throwable
            25   142   145   Class java/lang/Exception
      LineNumberTable:
        line 2116: 0
        line 2117: 7
        line 2119: 20
        line 2121: 25
        line 2122: 29
        line 2124: 39
        line 2125: 47
        line 2126: 58
        line 2127: 65
        line 2121: 78
        line 2127: 105
        line 2121: 118
        line 2131: 142
        line 2128: 145
        line 2130: 146
        line 2133: 156
        line 2134: 179
        line 2133: 184
        line 2135: 190
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      66     3    ps   Ljava/sql/PreparedStatement;
           29     113     2   con   Ljava/sql/Connection;
          146      10     2     e   Ljava/lang/Exception;
          179       5     5 member   Lext/mods/gameserver/model/actor/Player;
            0     191     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     191     1 crestId   I
      StackMapTable: number_of_entries = 13
        frame_type = 20 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 22

  public void changeAllyCrest(int, boolean);
    descriptor: (IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=11, args_size=3
         0: ldc_w         #1291               // String UPDATE clan_data SET ally_crest_id = ? WHERE clan_id = ?
         3: astore_3
         4: aload_0
         5: getfield      #51                 // Field _clanId:I
         8: istore        4
        10: iload_2
        11: ifne          44
        14: aload_0
        15: getfield      #221                // Field _allyCrestId:I
        18: ifeq          34
        21: invokestatic  #181                // Method ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
        24: getstatic     #224                // Field ext/mods/gameserver/enums/CrestType.ALLY:Lext/mods/gameserver/enums/CrestType;
        27: aload_0
        28: getfield      #221                // Field _allyCrestId:I
        31: invokevirtual #1283               // Method ext/mods/gameserver/data/cache/CrestCache.removeCrest:(Lext/mods/gameserver/enums/CrestType;I)V
        34: ldc_w         #1293               // String UPDATE clan_data SET ally_crest_id = ? WHERE ally_id = ?
        37: astore_3
        38: aload_0
        39: getfield      #351                // Field _allyId:I
        42: istore        4
        44: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        47: astore        5
        49: aload         5
        51: aload_3
        52: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        57: astore        6
        59: aload         6
        61: iconst_1
        62: iload_1
        63: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        68: aload         6
        70: iconst_2
        71: iload         4
        73: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        78: aload         6
        80: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        85: pop
        86: aload         6
        88: ifnull        130
        91: aload         6
        93: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        98: goto          130
       101: astore        7
       103: aload         6
       105: ifnull        127
       108: aload         6
       110: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       115: goto          127
       118: astore        8
       120: aload         7
       122: aload         8
       124: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       127: aload         7
       129: athrow
       130: aload         5
       132: ifnull        174
       135: aload         5
       137: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       142: goto          174
       145: astore        6
       147: aload         5
       149: ifnull        171
       152: aload         5
       154: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       159: goto          171
       162: astore        7
       164: aload         6
       166: aload         7
       168: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       171: aload         6
       173: athrow
       174: goto          190
       177: astore        5
       179: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       182: ldc_w         #1295               // String Error while updating ally crest.
       185: aload         5
       187: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       190: iload_2
       191: ifeq          241
       194: aload_0
       195: iload_1
       196: putfield      #221                // Field _allyCrestId:I
       199: aload_0
       200: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       203: astore        5
       205: aload         5
       207: arraylength
       208: istore        6
       210: iconst_0
       211: istore        7
       213: iload         7
       215: iload         6
       217: if_icmpge     238
       220: aload         5
       222: iload         7
       224: aaload
       225: astore        8
       227: aload         8
       229: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       232: iinc          7, 1
       235: goto          213
       238: goto          337
       241: invokestatic  #826                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       244: invokevirtual #1214               // Method ext/mods/gameserver/data/sql/ClanTable.getClans:()Ljava/util/Collection;
       247: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       252: astore        5
       254: aload         5
       256: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       261: ifeq          337
       264: aload         5
       266: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       271: checkcast     #11                 // class ext/mods/gameserver/model/pledge/Clan
       274: astore        6
       276: aload         6
       278: invokevirtual #1217               // Method getAllyId:()I
       281: aload_0
       282: getfield      #351                // Field _allyId:I
       285: if_icmpne     334
       288: aload         6
       290: iload_1
       291: invokevirtual #1297               // Method setAllyCrestId:(I)V
       294: aload         6
       296: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       299: astore        7
       301: aload         7
       303: arraylength
       304: istore        8
       306: iconst_0
       307: istore        9
       309: iload         9
       311: iload         8
       313: if_icmpge     334
       316: aload         7
       318: iload         9
       320: aaload
       321: astore        10
       323: aload         10
       325: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       328: iinc          9, 1
       331: goto          309
       334: goto          254
       337: return
      Exception table:
         from    to  target type
            59    86   101   Class java/lang/Throwable
           108   115   118   Class java/lang/Throwable
            49   130   145   Class java/lang/Throwable
           152   159   162   Class java/lang/Throwable
            44   174   177   Class java/lang/Exception
      LineNumberTable:
        line 2144: 0
        line 2145: 4
        line 2146: 10
        line 2148: 14
        line 2149: 21
        line 2151: 34
        line 2152: 38
        line 2155: 44
        line 2156: 49
        line 2158: 59
        line 2159: 68
        line 2160: 78
        line 2161: 86
        line 2155: 101
        line 2161: 130
        line 2155: 145
        line 2165: 174
        line 2162: 177
        line 2164: 179
        line 2167: 190
        line 2169: 194
        line 2170: 199
        line 2171: 227
        line 2170: 232
        line 2175: 241
        line 2177: 276
        line 2179: 288
        line 2180: 294
        line 2181: 323
        line 2180: 328
        line 2183: 334
        line 2185: 337
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      71     6    ps   Ljava/sql/PreparedStatement;
           49     125     5   con   Ljava/sql/Connection;
          179      11     5     e   Ljava/lang/Exception;
          227       5     8 member   Lext/mods/gameserver/model/actor/Player;
          323       5    10 member   Lext/mods/gameserver/model/actor/Player;
          276      58     6  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     338     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     338     1 crestId   I
            0     338     2 onlyThisClan   Z
            4     334     3 query   Ljava/lang/String;
           10     328     4 allyId   I
      StackMapTable: number_of_entries = 19
        frame_type = 253 /* append */
          offset_delta = 34
          locals = [ class java/lang/String, int ]
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/lang/String, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/lang/String, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/lang/String, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
        frame_type = 254 /* append */
          offset_delta = 22
          locals = [ class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 24
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/lang/String, int, class java/util/Iterator, class ext/mods/gameserver/model/pledge/Clan, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, int, class java/lang/String, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2

  public void changeLargeCrest(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: getfield      #210                // Field _crestLargeId:I
         4: ifeq          20
         7: invokestatic  #181                // Method ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
        10: getstatic     #213                // Field ext/mods/gameserver/enums/CrestType.PLEDGE_LARGE:Lext/mods/gameserver/enums/CrestType;
        13: aload_0
        14: getfield      #210                // Field _crestLargeId:I
        17: invokevirtual #1283               // Method ext/mods/gameserver/data/cache/CrestCache.removeCrest:(Lext/mods/gameserver/enums/CrestType;I)V
        20: aload_0
        21: iload_1
        22: putfield      #210                // Field _crestLargeId:I
        25: invokestatic  #55                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        28: astore_2
        29: aload_2
        30: ldc_w         #1300               // String UPDATE clan_data SET crest_large_id = ? WHERE clan_id = ?
        33: invokeinterface #63,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        38: astore_3
        39: aload_3
        40: iconst_1
        41: iload_1
        42: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        47: aload_3
        48: iconst_2
        49: aload_0
        50: getfield      #51                 // Field _clanId:I
        53: invokeinterface #69,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        58: aload_3
        59: invokeinterface #670,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        64: pop
        65: aload_3
        66: ifnull        105
        69: aload_3
        70: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        75: goto          105
        78: astore        4
        80: aload_3
        81: ifnull        102
        84: aload_3
        85: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        90: goto          102
        93: astore        5
        95: aload         4
        97: aload         5
        99: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       102: aload         4
       104: athrow
       105: aload_2
       106: ifnull        142
       109: aload_2
       110: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       115: goto          142
       118: astore_3
       119: aload_2
       120: ifnull        140
       123: aload_2
       124: invokeinterface #163,  1          // InterfaceMethod java/sql/Connection.close:()V
       129: goto          140
       132: astore        4
       134: aload_3
       135: aload         4
       137: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       140: aload_3
       141: athrow
       142: goto          156
       145: astore_2
       146: getstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       149: ldc_w         #1302               // String Error while updating large crest.
       152: aload_2
       153: invokevirtual #172                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       156: aload_0
       157: invokevirtual #764                // Method getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       160: astore_2
       161: aload_2
       162: arraylength
       163: istore_3
       164: iconst_0
       165: istore        4
       167: iload         4
       169: iload_3
       170: if_icmpge     190
       173: aload_2
       174: iload         4
       176: aaload
       177: astore        5
       179: aload         5
       181: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       184: iinc          4, 1
       187: goto          167
       190: return
      Exception table:
         from    to  target type
            39    65    78   Class java/lang/Throwable
            84    90    93   Class java/lang/Throwable
            29   105   118   Class java/lang/Throwable
           123   129   132   Class java/lang/Throwable
            25   142   145   Class java/lang/Exception
      LineNumberTable:
        line 2193: 0
        line 2194: 7
        line 2196: 20
        line 2198: 25
        line 2199: 29
        line 2201: 39
        line 2202: 47
        line 2203: 58
        line 2204: 65
        line 2198: 78
        line 2204: 105
        line 2198: 118
        line 2208: 142
        line 2205: 145
        line 2207: 146
        line 2210: 156
        line 2211: 179
        line 2210: 184
        line 2212: 190
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      66     3    ps   Ljava/sql/PreparedStatement;
           29     113     2   con   Ljava/sql/Connection;
          146      10     2     e   Ljava/lang/Exception;
          179       5     5 member   Lext/mods/gameserver/model/actor/Player;
            0     191     0  this   Lext/mods/gameserver/model/pledge/Clan;
            0     191     1 crestId   I
      StackMapTable: number_of_entries = 13
        frame_type = 20 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 22

  public boolean isRegisteredOnSiege();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: invokestatic  #470                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
         3: invokevirtual #475                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
         6: invokeinterface #478,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        11: astore_1
        12: aload_1
        13: invokeinterface #482,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          47
        21: aload_1
        22: invokeinterface #487,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #490                // class ext/mods/gameserver/model/residence/castle/Castle
        30: astore_2
        31: aload_2
        32: invokevirtual #492                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        35: aload_0
        36: invokevirtual #1192               // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;)Z
        39: ifeq          44
        42: iconst_1
        43: ireturn
        44: goto          12
        47: iconst_0
        48: ireturn
      LineNumberTable:
        line 2220: 0
        line 2221: 31
        line 2222: 42
        line 2221: 44
        line 2224: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      13     2 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0      49     0  this   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 31 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #173                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/model/pledge/Clan
         6: invokevirtual #1310               // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #1313               // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #166                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 76: 0
}
SourceFile: "Clan.java"
BootstrapMethods:
  0: #1620 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1585 (Ljava/lang/Object;)Z
      #1586 REF_invokeStatic ext/mods/gameserver/model/pledge/Clan.lambda$getClanMember$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/ClanMember;)Z
      #1589 (Lext/mods/gameserver/model/pledge/ClanMember;)Z
  1: #1620 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1591 (Ljava/lang/Object;Ljava/lang/Object;)V
      #1593 REF_invokeStatic ext/mods/gameserver/model/pledge/Clan.lambda$removeClanMember$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #1596 (Ljava/lang/Integer;Ljava/lang/Integer;)V
  2: #1620 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1585 (Ljava/lang/Object;)Z
      #1598 REF_invokeStatic ext/mods/gameserver/model/pledge/Clan.lambda$getSubPledgeMembersCount$0:(ILext/mods/gameserver/model/pledge/ClanMember;)Z
      #1589 (Lext/mods/gameserver/model/pledge/ClanMember;)Z
  3: #1620 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1585 (Ljava/lang/Object;)Z
      #1601 REF_invokeVirtual ext/mods/gameserver/model/pledge/ClanMember.isOnline:()Z
      #1589 (Lext/mods/gameserver/model/pledge/ClanMember;)Z
  4: #1620 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1585 (Ljava/lang/Object;)Z
      #1602 REF_invokeVirtual ext/mods/gameserver/model/pledge/Clan.lambda$addAllClanSkills$0:(Lext/mods/gameserver/skills/L2Skill;)Z
      #1605 (Lext/mods/gameserver/skills/L2Skill;)Z
  5: #1627 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1606 \u0001[\u0001]
  6: #1620 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1608 (Ljava/lang/Object;)Ljava/lang/Object;
      #1609 REF_invokeStatic java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      #1613 (Ljava/lang/Integer;)Ljava/lang/String;
  7: #1620 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1585 (Ljava/lang/Object;)Z
      #1615 REF_invokeStatic ext/mods/gameserver/model/pledge/Clan.lambda$getSubPledge$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/SubPledge;)Z
      #1618 (Lext/mods/gameserver/model/pledge/SubPledge;)Z
InnerClasses:
  public static final #1636= #1634 of #7; // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #1641= #1637 of #1639; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
