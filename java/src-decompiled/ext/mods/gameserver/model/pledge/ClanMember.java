// Bytecode for: ext.mods.gameserver.model.pledge.ClanMember
// File: ext\mods\gameserver\model\pledge\ClanMember.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/pledge/ClanMember.class
  Last modified 9 de jul de 2026; size 9598 bytes
  MD5 checksum 4b4236be32eeaa533c1cb8c2b164b4e4
  Compiled from "ClanMember.java"
public class ext.mods.gameserver.model.pledge.ClanMember
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/pledge/ClanMember
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 17, methods: 25, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/pledge/ClanMember._clan:Lext/mods/gameserver/model/pledge/Clan;
    #8 = Class              #10           // ext/mods/gameserver/model/pledge/ClanMember
    #9 = NameAndType        #11:#12       // _clan:Lext/mods/gameserver/model/pledge/Clan;
   #10 = Utf8               ext/mods/gameserver/model/pledge/ClanMember
   #11 = Utf8               _clan
   #12 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
   #13 = String             #14           // char_name
   #14 = Utf8               char_name
   #15 = InterfaceMethodref #16.#17       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #16 = Class              #18           // java/sql/ResultSet
   #17 = NameAndType        #19:#20       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #18 = Utf8               java/sql/ResultSet
   #19 = Utf8               getString
   #20 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/pledge/ClanMember._name:Ljava/lang/String;
   #22 = NameAndType        #23:#24       // _name:Ljava/lang/String;
   #23 = Utf8               _name
   #24 = Utf8               Ljava/lang/String;
   #25 = String             #26           // title
   #26 = Utf8               title
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/pledge/ClanMember._title:Ljava/lang/String;
   #28 = NameAndType        #29:#24       // _title:Ljava/lang/String;
   #29 = Utf8               _title
   #30 = Fieldref           #31.#32       // ext/mods/gameserver/enums/actors/Sex.VALUES:[Lext/mods/gameserver/enums/actors/Sex;
   #31 = Class              #33           // ext/mods/gameserver/enums/actors/Sex
   #32 = NameAndType        #34:#35       // VALUES:[Lext/mods/gameserver/enums/actors/Sex;
   #33 = Utf8               ext/mods/gameserver/enums/actors/Sex
   #34 = Utf8               VALUES
   #35 = Utf8               [Lext/mods/gameserver/enums/actors/Sex;
   #36 = String             #37           // sex
   #37 = Utf8               sex
   #38 = InterfaceMethodref #16.#39       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #39 = NameAndType        #40:#41       // getInt:(Ljava/lang/String;)I
   #40 = Utf8               getInt
   #41 = Utf8               (Ljava/lang/String;)I
   #42 = Fieldref           #8.#43        // ext/mods/gameserver/model/pledge/ClanMember._sex:Lext/mods/gameserver/enums/actors/Sex;
   #43 = NameAndType        #44:#45       // _sex:Lext/mods/gameserver/enums/actors/Sex;
   #44 = Utf8               _sex
   #45 = Utf8               Lext/mods/gameserver/enums/actors/Sex;
   #46 = Fieldref           #47.#48       // ext/mods/gameserver/enums/actors/ClassRace.VALUES:[Lext/mods/gameserver/enums/actors/ClassRace;
   #47 = Class              #49           // ext/mods/gameserver/enums/actors/ClassRace
   #48 = NameAndType        #34:#50       // VALUES:[Lext/mods/gameserver/enums/actors/ClassRace;
   #49 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
   #50 = Utf8               [Lext/mods/gameserver/enums/actors/ClassRace;
   #51 = String             #52           // race
   #52 = Utf8               race
   #53 = Fieldref           #8.#54        // ext/mods/gameserver/model/pledge/ClanMember._race:Lext/mods/gameserver/enums/actors/ClassRace;
   #54 = NameAndType        #55:#56       // _race:Lext/mods/gameserver/enums/actors/ClassRace;
   #55 = Utf8               _race
   #56 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
   #57 = String             #58           // obj_Id
   #58 = Utf8               obj_Id
   #59 = Fieldref           #8.#60        // ext/mods/gameserver/model/pledge/ClanMember._objectId:I
   #60 = NameAndType        #61:#62       // _objectId:I
   #61 = Utf8               _objectId
   #62 = Utf8               I
   #63 = String             #64           // level
   #64 = Utf8               level
   #65 = Fieldref           #8.#66        // ext/mods/gameserver/model/pledge/ClanMember._level:I
   #66 = NameAndType        #67:#62       // _level:I
   #67 = Utf8               _level
   #68 = String             #69           // classid
   #69 = Utf8               classid
   #70 = Fieldref           #8.#71        // ext/mods/gameserver/model/pledge/ClanMember._classId:I
   #71 = NameAndType        #72:#62       // _classId:I
   #72 = Utf8               _classId
   #73 = String             #74           // subpledge
   #74 = Utf8               subpledge
   #75 = Fieldref           #8.#76        // ext/mods/gameserver/model/pledge/ClanMember._pledgeType:I
   #76 = NameAndType        #77:#62       // _pledgeType:I
   #77 = Utf8               _pledgeType
   #78 = String             #79           // power_grade
   #79 = Utf8               power_grade
   #80 = Fieldref           #8.#81        // ext/mods/gameserver/model/pledge/ClanMember._powerGrade:I
   #81 = NameAndType        #82:#62       // _powerGrade:I
   #82 = Utf8               _powerGrade
   #83 = String             #84           // apprentice
   #84 = Utf8               apprentice
   #85 = Fieldref           #8.#86        // ext/mods/gameserver/model/pledge/ClanMember._apprentice:I
   #86 = NameAndType        #87:#62       // _apprentice:I
   #87 = Utf8               _apprentice
   #88 = String             #89           // sponsor
   #89 = Utf8               sponsor
   #90 = Fieldref           #8.#91        // ext/mods/gameserver/model/pledge/ClanMember._sponsor:I
   #91 = NameAndType        #92:#62       // _sponsor:I
   #92 = Utf8               _sponsor
   #93 = Fieldref           #8.#94        // ext/mods/gameserver/model/pledge/ClanMember._player:Lext/mods/gameserver/model/actor/Player;
   #94 = NameAndType        #95:#96       // _player:Lext/mods/gameserver/model/actor/Player;
   #95 = Utf8               _player
   #96 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #97 = Methodref          #98.#99       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #98 = Class              #100          // ext/mods/gameserver/model/actor/Player
   #99 = NameAndType        #101:#102     // getName:()Ljava/lang/String;
  #100 = Utf8               ext/mods/gameserver/model/actor/Player
  #101 = Utf8               getName
  #102 = Utf8               ()Ljava/lang/String;
  #103 = Methodref          #98.#104      // ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
  #104 = NameAndType        #105:#102     // getTitle:()Ljava/lang/String;
  #105 = Utf8               getTitle
  #106 = Methodref          #98.#107      // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #107 = NameAndType        #108:#109     // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #108 = Utf8               getAppearance
  #109 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #110 = Methodref          #111.#112     // ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
  #111 = Class              #113          // ext/mods/gameserver/model/actor/container/player/Appearance
  #112 = NameAndType        #114:#115     // getSex:()Lext/mods/gameserver/enums/actors/Sex;
  #113 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #114 = Utf8               getSex
  #115 = Utf8               ()Lext/mods/gameserver/enums/actors/Sex;
  #116 = Methodref          #98.#117      // ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #117 = NameAndType        #118:#119     // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #118 = Utf8               getRace
  #119 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
  #120 = Methodref          #98.#121      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #121 = NameAndType        #122:#123     // getObjectId:()I
  #122 = Utf8               getObjectId
  #123 = Utf8               ()I
  #124 = Methodref          #98.#125      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #125 = NameAndType        #126:#127     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #126 = Utf8               getStatus
  #127 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #128 = Methodref          #129.#130     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #129 = Class              #131          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #130 = NameAndType        #132:#123     // getLevel:()I
  #131 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #132 = Utf8               getLevel
  #133 = Methodref          #98.#134      // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #134 = NameAndType        #135:#136     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #135 = Utf8               getClassId
  #136 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #137 = Methodref          #138.#139     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #138 = Class              #140          // ext/mods/gameserver/enums/actors/ClassId
  #139 = NameAndType        #141:#123     // getId:()I
  #140 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #141 = Utf8               getId
  #142 = Methodref          #98.#143      // ext/mods/gameserver/model/actor/Player.getPledgeType:()I
  #143 = NameAndType        #144:#123     // getPledgeType:()I
  #144 = Utf8               getPledgeType
  #145 = Methodref          #98.#146      // ext/mods/gameserver/model/actor/Player.getPowerGrade:()I
  #146 = NameAndType        #147:#123     // getPowerGrade:()I
  #147 = Utf8               getPowerGrade
  #148 = Methodref          #98.#149      // ext/mods/gameserver/model/actor/Player.getApprentice:()I
  #149 = NameAndType        #150:#123     // getApprentice:()I
  #150 = Utf8               getApprentice
  #151 = Methodref          #98.#152      // ext/mods/gameserver/model/actor/Player.getSponsor:()I
  #152 = NameAndType        #153:#123     // getSponsor:()I
  #153 = Utf8               getSponsor
  #154 = Methodref          #155.#156     // ext/mods/gameserver/model/pledge/Clan.checkAndAddClanSkills:(Lext/mods/gameserver/model/actor/Player;)Z
  #155 = Class              #157          // ext/mods/gameserver/model/pledge/Clan
  #156 = NameAndType        #158:#159     // checkAndAddClanSkills:(Lext/mods/gameserver/model/actor/Player;)Z
  #157 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #158 = Utf8               checkAndAddClanSkills
  #159 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #160 = Methodref          #155.#130     // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #161 = Fieldref           #162.#163     // ext/mods/Config.MINIMUM_CLAN_LEVEL:I
  #162 = Class              #164          // ext/mods/Config
  #163 = NameAndType        #165:#62      // MINIMUM_CLAN_LEVEL:I
  #164 = Utf8               ext/mods/Config
  #165 = Utf8               MINIMUM_CLAN_LEVEL
  #166 = Methodref          #98.#167      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #167 = NameAndType        #168:#169     // isClanLeader:()Z
  #168 = Utf8               isClanLeader
  #169 = Utf8               ()Z
  #170 = Methodref          #98.#171      // ext/mods/gameserver/model/actor/Player.addSiegeSkills:()V
  #171 = NameAndType        #172:#6       // addSiegeSkills:()V
  #172 = Utf8               addSiegeSkills
  #173 = Methodref          #98.#174      // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #174 = NameAndType        #175:#176     // getClient:()Lext/mods/gameserver/network/GameClient;
  #175 = Utf8               getClient
  #176 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #177 = Methodref          #178.#179     // ext/mods/gameserver/network/GameClient.isDetached:()Z
  #178 = Class              #180          // ext/mods/gameserver/network/GameClient
  #179 = NameAndType        #181:#169     // isDetached:()Z
  #180 = Utf8               ext/mods/gameserver/network/GameClient
  #181 = Utf8               isDetached
  #182 = Methodref          #98.#183      // ext/mods/gameserver/model/actor/Player.setPledgeType:(I)V
  #183 = NameAndType        #184:#185     // setPledgeType:(I)V
  #184 = Utf8               setPledgeType
  #185 = Utf8               (I)V
  #186 = Methodref          #187.#188     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #187 = Class              #189          // ext/mods/commons/pool/ConnectionPool
  #188 = NameAndType        #190:#191     // getConnection:()Ljava/sql/Connection;
  #189 = Utf8               ext/mods/commons/pool/ConnectionPool
  #190 = Utf8               getConnection
  #191 = Utf8               ()Ljava/sql/Connection;
  #192 = String             #193          // UPDATE characters SET subpledge=? WHERE obj_id=?
  #193 = Utf8               UPDATE characters SET subpledge=? WHERE obj_id=?
  #194 = InterfaceMethodref #195.#196     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #195 = Class              #197          // java/sql/Connection
  #196 = NameAndType        #198:#199     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #197 = Utf8               java/sql/Connection
  #198 = Utf8               prepareStatement
  #199 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #200 = InterfaceMethodref #201.#202     // java/sql/PreparedStatement.setInt:(II)V
  #201 = Class              #203          // java/sql/PreparedStatement
  #202 = NameAndType        #204:#205     // setInt:(II)V
  #203 = Utf8               java/sql/PreparedStatement
  #204 = Utf8               setInt
  #205 = Utf8               (II)V
  #206 = Methodref          #8.#121       // ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
  #207 = InterfaceMethodref #201.#208     // java/sql/PreparedStatement.executeUpdate:()I
  #208 = NameAndType        #209:#123     // executeUpdate:()I
  #209 = Utf8               executeUpdate
  #210 = InterfaceMethodref #201.#211     // java/sql/PreparedStatement.close:()V
  #211 = NameAndType        #212:#6       // close:()V
  #212 = Utf8               close
  #213 = Class              #214          // java/lang/Throwable
  #214 = Utf8               java/lang/Throwable
  #215 = Methodref          #213.#216     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #216 = NameAndType        #217:#218     // addSuppressed:(Ljava/lang/Throwable;)V
  #217 = Utf8               addSuppressed
  #218 = Utf8               (Ljava/lang/Throwable;)V
  #219 = InterfaceMethodref #195.#211     // java/sql/Connection.close:()V
  #220 = Class              #221          // java/lang/Exception
  #221 = Utf8               java/lang/Exception
  #222 = Fieldref           #8.#223       // ext/mods/gameserver/model/pledge/ClanMember.LOGGER:Lext/mods/commons/logging/CLogger;
  #223 = NameAndType        #224:#225     // LOGGER:Lext/mods/commons/logging/CLogger;
  #224 = Utf8               LOGGER
  #225 = Utf8               Lext/mods/commons/logging/CLogger;
  #226 = String             #227          // Couldn\'t update ClanMember pledge.
  #227 = Utf8               Couldn\'t update ClanMember pledge.
  #228 = Methodref          #229.#230     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #229 = Class              #231          // ext/mods/commons/logging/CLogger
  #230 = NameAndType        #232:#233     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #231 = Utf8               ext/mods/commons/logging/CLogger
  #232 = Utf8               error
  #233 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #234 = Methodref          #98.#235      // ext/mods/gameserver/model/actor/Player.setPowerGrade:(I)V
  #235 = NameAndType        #236:#185     // setPowerGrade:(I)V
  #236 = Utf8               setPowerGrade
  #237 = String             #238          // UPDATE characters SET power_grade=? WHERE obj_id=?
  #238 = Utf8               UPDATE characters SET power_grade=? WHERE obj_id=?
  #239 = String             #240          // Couldn\'t update ClanMember power grade.
  #240 = Utf8               Couldn\'t update ClanMember power grade.
  #241 = Methodref          #155.#242     // ext/mods/gameserver/model/pledge/Clan.getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
  #242 = NameAndType        #243:#244     // getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
  #243 = Utf8               getClanMember
  #244 = Utf8               (I)Lext/mods/gameserver/model/pledge/ClanMember;
  #245 = Methodref          #8.#99        // ext/mods/gameserver/model/pledge/ClanMember.getName:()Ljava/lang/String;
  #246 = String             #247          // Error
  #247 = Utf8               Error
  #248 = String             #249          //
  #249 = Utf8
  #250 = String             #251          // UPDATE characters SET apprentice=?,sponsor=? WHERE obj_Id=?
  #251 = Utf8               UPDATE characters SET apprentice=?,sponsor=? WHERE obj_Id=?
  #252 = String             #253          // Couldn\'t update ClanMember sponsor/apprentice.
  #253 = Utf8               Couldn\'t update ClanMember sponsor/apprentice.
  #254 = Methodref          #98.#255      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #255 = NameAndType        #256:#257     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #256 = Utf8               getClan
  #257 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #258 = Methodref          #98.#259      // ext/mods/gameserver/model/actor/Player.isAcademyMember:()Z
  #259 = NameAndType        #260:#169     // isAcademyMember:()Z
  #260 = Utf8               isAcademyMember
  #261 = Methodref          #155.#262     // ext/mods/gameserver/model/pledge/Clan.getLeaderSubPledge:(I)I
  #262 = NameAndType        #263:#264     // getLeaderSubPledge:(I)I
  #263 = Utf8               getLeaderSubPledge
  #264 = Utf8               (I)I
  #265 = Methodref          #98.#266      // ext/mods/gameserver/model/actor/Player.isHero:()Z
  #266 = NameAndType        #267:#169     // isHero:()Z
  #267 = Utf8               isHero
  #268 = Methodref          #98.#269      // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #269 = NameAndType        #270:#169     // isNoble:()Z
  #270 = Utf8               isNoble
  #271 = Methodref          #272.#99      // java/lang/Class.getName:()Ljava/lang/String;
  #272 = Class              #273          // java/lang/Class
  #273 = Utf8               java/lang/Class
  #274 = Methodref          #229.#275     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #275 = NameAndType        #5:#276       // "<init>":(Ljava/lang/String;)V
  #276 = Utf8               (Ljava/lang/String;)V
  #277 = Utf8               UPDATE_PLEDGE
  #278 = Utf8               ConstantValue
  #279 = Utf8               UPDATE_POWER_GRADE
  #280 = Utf8               UPDATE_SPONSOR
  #281 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Ljava/sql/ResultSet;)V
  #282 = Utf8               Code
  #283 = Utf8               LineNumberTable
  #284 = Utf8               LocalVariableTable
  #285 = Utf8               this
  #286 = Utf8               Lext/mods/gameserver/model/pledge/ClanMember;
  #287 = Utf8               clan
  #288 = Utf8               rs
  #289 = Utf8               Ljava/sql/ResultSet;
  #290 = Utf8               Exceptions
  #291 = Class              #292          // java/sql/SQLException
  #292 = Utf8               java/sql/SQLException
  #293 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
  #294 = Utf8               player
  #295 = Utf8               setPlayerInstance
  #296 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #297 = Utf8               StackMapTable
  #298 = Utf8               getPlayerInstance
  #299 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #300 = Class              #301          // java/lang/String
  #301 = Utf8               java/lang/String
  #302 = Utf8               refreshLevel
  #303 = Utf8               isOnline
  #304 = Utf8               ps
  #305 = Utf8               Ljava/sql/PreparedStatement;
  #306 = Utf8               con
  #307 = Utf8               Ljava/sql/Connection;
  #308 = Utf8               e
  #309 = Utf8               Ljava/lang/Exception;
  #310 = Utf8               pledgeType
  #311 = Utf8               powerGrade
  #312 = Utf8               getApprenticeOrSponsorName
  #313 = Utf8               setApprenticeAndSponsor
  #314 = Utf8               apprenticeId
  #315 = Utf8               sponsorId
  #316 = Utf8               saveApprenticeAndSponsor
  #317 = Utf8               calculatePledgeClass
  #318 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #319 = Utf8               pledgeClass
  #320 = Utf8               <clinit>
  #321 = Utf8               SourceFile
  #322 = Utf8               ClanMember.java
{
  public ext.mods.gameserver.model.pledge.ClanMember(ext.mods.gameserver.model.pledge.Clan, java.sql.ResultSet) throws java.sql.SQLException;
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;Ljava/sql/ResultSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
         9: aload_0
        10: aload_2
        11: ldc           #13                 // String char_name
        13: invokeinterface #15,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        18: putfield      #21                 // Field _name:Ljava/lang/String;
        21: aload_0
        22: aload_2
        23: ldc           #25                 // String title
        25: invokeinterface #15,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        30: putfield      #27                 // Field _title:Ljava/lang/String;
        33: aload_0
        34: getstatic     #30                 // Field ext/mods/gameserver/enums/actors/Sex.VALUES:[Lext/mods/gameserver/enums/actors/Sex;
        37: aload_2
        38: ldc           #36                 // String sex
        40: invokeinterface #38,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        45: aaload
        46: putfield      #42                 // Field _sex:Lext/mods/gameserver/enums/actors/Sex;
        49: aload_0
        50: getstatic     #46                 // Field ext/mods/gameserver/enums/actors/ClassRace.VALUES:[Lext/mods/gameserver/enums/actors/ClassRace;
        53: aload_2
        54: ldc           #51                 // String race
        56: invokeinterface #38,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        61: aaload
        62: putfield      #53                 // Field _race:Lext/mods/gameserver/enums/actors/ClassRace;
        65: aload_0
        66: aload_2
        67: ldc           #57                 // String obj_Id
        69: invokeinterface #38,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        74: putfield      #59                 // Field _objectId:I
        77: aload_0
        78: aload_2
        79: ldc           #63                 // String level
        81: invokeinterface #38,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        86: putfield      #65                 // Field _level:I
        89: aload_0
        90: aload_2
        91: ldc           #68                 // String classid
        93: invokeinterface #38,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        98: putfield      #70                 // Field _classId:I
       101: aload_0
       102: aload_2
       103: ldc           #73                 // String subpledge
       105: invokeinterface #38,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       110: putfield      #75                 // Field _pledgeType:I
       113: aload_0
       114: aload_2
       115: ldc           #78                 // String power_grade
       117: invokeinterface #38,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       122: putfield      #80                 // Field _powerGrade:I
       125: aload_0
       126: aload_2
       127: ldc           #83                 // String apprentice
       129: invokeinterface #38,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       134: putfield      #85                 // Field _apprentice:I
       137: aload_0
       138: aload_2
       139: ldc           #88                 // String sponsor
       141: invokeinterface #38,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       146: putfield      #90                 // Field _sponsor:I
       149: return
      LineNumberTable:
        line 66: 0
        line 67: 4
        line 69: 9
        line 70: 21
        line 72: 33
        line 73: 49
        line 75: 65
        line 76: 77
        line 77: 89
        line 78: 101
        line 79: 113
        line 80: 125
        line 81: 137
        line 82: 149
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     150     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
            0     150     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     150     2    rs   Ljava/sql/ResultSet;
    Exceptions:
      throws java.sql.SQLException

  public ext.mods.gameserver.model.pledge.ClanMember(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
         9: aload_0
        10: aload_2
        11: putfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        14: aload_0
        15: aload_2
        16: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        19: putfield      #21                 // Field _name:Ljava/lang/String;
        22: aload_0
        23: aload_2
        24: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
        27: putfield      #27                 // Field _title:Ljava/lang/String;
        30: aload_0
        31: aload_2
        32: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        35: invokevirtual #110                // Method ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
        38: putfield      #42                 // Field _sex:Lext/mods/gameserver/enums/actors/Sex;
        41: aload_0
        42: aload_2
        43: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        46: putfield      #53                 // Field _race:Lext/mods/gameserver/enums/actors/ClassRace;
        49: aload_0
        50: aload_2
        51: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        54: putfield      #59                 // Field _objectId:I
        57: aload_0
        58: aload_2
        59: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        62: invokevirtual #128                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        65: putfield      #65                 // Field _level:I
        68: aload_0
        69: aload_2
        70: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
        73: invokevirtual #137                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
        76: putfield      #70                 // Field _classId:I
        79: aload_0
        80: aload_2
        81: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Player.getPledgeType:()I
        84: putfield      #75                 // Field _pledgeType:I
        87: aload_0
        88: aload_2
        89: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.getPowerGrade:()I
        92: putfield      #80                 // Field _powerGrade:I
        95: aload_0
        96: iconst_0
        97: putfield      #85                 // Field _apprentice:I
       100: aload_0
       101: iconst_0
       102: putfield      #90                 // Field _sponsor:I
       105: return
      LineNumberTable:
        line 90: 0
        line 91: 4
        line 93: 9
        line 95: 14
        line 96: 22
        line 98: 30
        line 99: 41
        line 101: 49
        line 102: 57
        line 103: 68
        line 104: 79
        line 105: 87
        line 106: 95
        line 107: 100
        line 108: 105
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     106     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
            0     106     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     106     2 player   Lext/mods/gameserver/model/actor/Player;

  public void setPlayerInstance(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     141
         4: aload_0
         5: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         8: ifnull        141
        11: aload_0
        12: aload_0
        13: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        16: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        19: putfield      #21                 // Field _name:Ljava/lang/String;
        22: aload_0
        23: aload_0
        24: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        27: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
        30: putfield      #27                 // Field _title:Ljava/lang/String;
        33: aload_0
        34: aload_0
        35: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        38: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        41: invokevirtual #110                // Method ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
        44: putfield      #42                 // Field _sex:Lext/mods/gameserver/enums/actors/Sex;
        47: aload_0
        48: aload_0
        49: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        52: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        55: putfield      #53                 // Field _race:Lext/mods/gameserver/enums/actors/ClassRace;
        58: aload_0
        59: aload_0
        60: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        63: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        66: putfield      #59                 // Field _objectId:I
        69: aload_0
        70: aload_0
        71: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        74: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        77: invokevirtual #128                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        80: putfield      #65                 // Field _level:I
        83: aload_0
        84: aload_0
        85: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        88: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
        91: invokevirtual #137                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
        94: putfield      #70                 // Field _classId:I
        97: aload_0
        98: aload_0
        99: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       102: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.getPowerGrade:()I
       105: putfield      #80                 // Field _powerGrade:I
       108: aload_0
       109: aload_0
       110: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       113: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Player.getPledgeType:()I
       116: putfield      #75                 // Field _pledgeType:I
       119: aload_0
       120: aload_0
       121: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       124: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getApprentice:()I
       127: putfield      #85                 // Field _apprentice:I
       130: aload_0
       131: aload_0
       132: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       135: invokevirtual #151                // Method ext/mods/gameserver/model/actor/Player.getSponsor:()I
       138: putfield      #90                 // Field _sponsor:I
       141: aload_1
       142: ifnull        178
       145: aload_0
       146: getfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
       149: aload_1
       150: invokevirtual #154                // Method ext/mods/gameserver/model/pledge/Clan.checkAndAddClanSkills:(Lext/mods/gameserver/model/actor/Player;)Z
       153: pop
       154: aload_0
       155: getfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
       158: invokevirtual #160                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
       161: getstatic     #161                // Field ext/mods/Config.MINIMUM_CLAN_LEVEL:I
       164: if_icmplt     178
       167: aload_1
       168: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       171: ifeq          178
       174: aload_1
       175: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.addSiegeSkills:()V
       178: aload_0
       179: aload_1
       180: putfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       183: return
      LineNumberTable:
        line 112: 0
        line 114: 11
        line 115: 22
        line 117: 33
        line 118: 47
        line 120: 58
        line 121: 69
        line 122: 83
        line 123: 97
        line 124: 108
        line 125: 119
        line 126: 130
        line 129: 141
        line 131: 145
        line 133: 154
        line 134: 174
        line 136: 178
        line 137: 183
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     184     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
            0     184     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 141
        frame_type = 36 /* same */

  public ext.mods.gameserver.model.pledge.Clan getClan();
    descriptor: ()Lext/mods/gameserver/model/pledge/Clan;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
         4: areturn
      LineNumberTable:
        line 141: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/ClanMember;

  public ext.mods.gameserver.model.actor.Player getPlayerInstance();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 146: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/ClanMember;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        14: goto          21
        17: aload_0
        18: getfield      #21                 // Field _name:Ljava/lang/String;
        21: areturn
      LineNumberTable:
        line 151: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public java.lang.String getTitle();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
        14: goto          21
        17: aload_0
        18: getfield      #27                 // Field _title:Ljava/lang/String;
        21: areturn
      LineNumberTable:
        line 156: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public ext.mods.gameserver.enums.actors.Sex getSex();
    descriptor: ()Lext/mods/gameserver/enums/actors/Sex;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        20
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        14: invokevirtual #110                // Method ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
        17: goto          24
        20: aload_0
        21: getfield      #42                 // Field _sex:Lext/mods/gameserver/enums/actors/Sex;
        24: areturn
      LineNumberTable:
        line 161: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/actors/Sex ]

  public ext.mods.gameserver.enums.actors.ClassRace getRace();
    descriptor: ()Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        14: goto          21
        17: aload_0
        18: getfield      #53                 // Field _race:Lext/mods/gameserver/enums/actors/ClassRace;
        21: areturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/actors/ClassRace ]

  public int getObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        14: goto          21
        17: aload_0
        18: getfield      #59                 // Field _objectId:I
        21: ireturn
      LineNumberTable:
        line 171: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        20
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        14: invokevirtual #128                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        17: goto          24
        20: aload_0
        21: getfield      #65                 // Field _level:I
        24: ireturn
      LineNumberTable:
        line 176: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public void refreshLevel();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        21
         7: aload_0
         8: aload_0
         9: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        12: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        15: invokevirtual #128                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        18: putfield      #65                 // Field _level:I
        21: return
      LineNumberTable:
        line 181: 0
        line 182: 7
        line 183: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 1
        frame_type = 21 /* same */

  public int getClassId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        20
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
        14: invokevirtual #137                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
        17: goto          24
        20: aload_0
        21: getfield      #70                 // Field _classId:I
        24: ireturn
      LineNumberTable:
        line 187: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isOnline();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        36
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        14: invokevirtual #177                // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
        17: ifeq          36
        20: aload_0
        21: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        24: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        27: ifnonnull     34
        30: iconst_1
        31: goto          35
        34: iconst_0
        35: ireturn
        36: aload_0
        37: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        40: ifnull        57
        43: aload_0
        44: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        47: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        50: ifnull        57
        53: iconst_1
        54: goto          58
        57: iconst_0
        58: ireturn
      LineNumberTable:
        line 192: 0
        line 193: 20
        line 195: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      59     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 5
        frame_type = 34 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getPledgeType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Player.getPledgeType:()I
        14: goto          21
        17: aload_0
        18: getfield      #75                 // Field _pledgeType:I
        21: ireturn
      LineNumberTable:
        line 200: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setPledgeType(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #75                 // Field _pledgeType:I
         5: aload_0
         6: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         9: ifnull        23
        12: aload_0
        13: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        16: iload_1
        17: invokevirtual #182                // Method ext/mods/gameserver/model/actor/Player.setPledgeType:(I)V
        20: goto          155
        23: invokestatic  #186                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        26: astore_2
        27: aload_2
        28: ldc           #192                // String UPDATE characters SET subpledge=? WHERE obj_id=?
        30: invokeinterface #194,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        35: astore_3
        36: aload_3
        37: iconst_1
        38: aload_0
        39: getfield      #75                 // Field _pledgeType:I
        42: invokeinterface #200,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        47: aload_3
        48: iconst_2
        49: aload_0
        50: invokevirtual #206                // Method getObjectId:()I
        53: invokeinterface #200,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        58: aload_3
        59: invokeinterface #207,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        64: pop
        65: aload_3
        66: ifnull        105
        69: aload_3
        70: invokeinterface #210,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        75: goto          105
        78: astore        4
        80: aload_3
        81: ifnull        102
        84: aload_3
        85: invokeinterface #210,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        90: goto          102
        93: astore        5
        95: aload         4
        97: aload         5
        99: invokevirtual #215                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       102: aload         4
       104: athrow
       105: aload_2
       106: ifnull        142
       109: aload_2
       110: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       115: goto          142
       118: astore_3
       119: aload_2
       120: ifnull        140
       123: aload_2
       124: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       129: goto          140
       132: astore        4
       134: aload_3
       135: aload         4
       137: invokevirtual #215                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       140: aload_3
       141: athrow
       142: goto          155
       145: astore_2
       146: getstatic     #222                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       149: ldc           #226                // String Couldn\'t update ClanMember pledge.
       151: aload_2
       152: invokevirtual #228                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       155: return
      Exception table:
         from    to  target type
            36    65    78   Class java/lang/Throwable
            84    90    93   Class java/lang/Throwable
            27   105   118   Class java/lang/Throwable
           123   129   132   Class java/lang/Throwable
            23   142   145   Class java/lang/Exception
      LineNumberTable:
        line 205: 0
        line 207: 5
        line 208: 12
        line 211: 23
        line 212: 27
        line 214: 36
        line 215: 47
        line 216: 58
        line 217: 65
        line 211: 78
        line 217: 105
        line 211: 118
        line 221: 142
        line 218: 145
        line 220: 146
        line 223: 155
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      69     3    ps   Ljava/sql/PreparedStatement;
           27     115     2   con   Ljava/sql/Connection;
          146       9     2     e   Ljava/lang/Exception;
            0     156     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
            0     156     1 pledgeType   I
      StackMapTable: number_of_entries = 11
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public int getPowerGrade();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.getPowerGrade:()I
        14: goto          21
        17: aload_0
        18: getfield      #80                 // Field _powerGrade:I
        21: ireturn
      LineNumberTable:
        line 227: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setPowerGrade(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #80                 // Field _powerGrade:I
         5: aload_0
         6: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         9: ifnull        23
        12: aload_0
        13: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        16: iload_1
        17: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.setPowerGrade:(I)V
        20: goto          155
        23: invokestatic  #186                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        26: astore_2
        27: aload_2
        28: ldc           #237                // String UPDATE characters SET power_grade=? WHERE obj_id=?
        30: invokeinterface #194,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        35: astore_3
        36: aload_3
        37: iconst_1
        38: aload_0
        39: getfield      #80                 // Field _powerGrade:I
        42: invokeinterface #200,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        47: aload_3
        48: iconst_2
        49: aload_0
        50: invokevirtual #206                // Method getObjectId:()I
        53: invokeinterface #200,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        58: aload_3
        59: invokeinterface #207,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        64: pop
        65: aload_3
        66: ifnull        105
        69: aload_3
        70: invokeinterface #210,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        75: goto          105
        78: astore        4
        80: aload_3
        81: ifnull        102
        84: aload_3
        85: invokeinterface #210,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        90: goto          102
        93: astore        5
        95: aload         4
        97: aload         5
        99: invokevirtual #215                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       102: aload         4
       104: athrow
       105: aload_2
       106: ifnull        142
       109: aload_2
       110: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       115: goto          142
       118: astore_3
       119: aload_2
       120: ifnull        140
       123: aload_2
       124: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       129: goto          140
       132: astore        4
       134: aload_3
       135: aload         4
       137: invokevirtual #215                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       140: aload_3
       141: athrow
       142: goto          155
       145: astore_2
       146: getstatic     #222                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       149: ldc           #239                // String Couldn\'t update ClanMember power grade.
       151: aload_2
       152: invokevirtual #228                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       155: return
      Exception table:
         from    to  target type
            36    65    78   Class java/lang/Throwable
            84    90    93   Class java/lang/Throwable
            27   105   118   Class java/lang/Throwable
           123   129   132   Class java/lang/Throwable
            23   142   145   Class java/lang/Exception
      LineNumberTable:
        line 232: 0
        line 234: 5
        line 235: 12
        line 238: 23
        line 239: 27
        line 241: 36
        line 242: 47
        line 243: 58
        line 244: 65
        line 238: 78
        line 244: 105
        line 238: 118
        line 248: 142
        line 245: 145
        line 247: 146
        line 250: 155
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      69     3    ps   Ljava/sql/PreparedStatement;
           27     115     2   con   Ljava/sql/Connection;
          146       9     2     e   Ljava/lang/Exception;
            0     156     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
            0     156     1 powerGrade   I
      StackMapTable: number_of_entries = 11
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public int getSponsor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #151                // Method ext/mods/gameserver/model/actor/Player.getSponsor:()I
        14: goto          21
        17: aload_0
        18: getfield      #90                 // Field _sponsor:I
        21: ireturn
      LineNumberTable:
        line 254: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getApprentice();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getApprentice:()I
        14: goto          21
        17: aload_0
        18: getfield      #85                 // Field _apprentice:I
        21: ireturn
      LineNumberTable:
        line 259: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.lang.String getApprenticeOrSponsorName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        29
         7: aload_0
         8: aload_0
         9: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        12: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getApprentice:()I
        15: putfield      #85                 // Field _apprentice:I
        18: aload_0
        19: aload_0
        20: getfield      #93                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        23: invokevirtual #151                // Method ext/mods/gameserver/model/actor/Player.getSponsor:()I
        26: putfield      #90                 // Field _sponsor:I
        29: aload_0
        30: getfield      #85                 // Field _apprentice:I
        33: ifeq          60
        36: aload_0
        37: getfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
        40: aload_0
        41: getfield      #85                 // Field _apprentice:I
        44: invokevirtual #241                // Method ext/mods/gameserver/model/pledge/Clan.getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
        47: astore_1
        48: aload_1
        49: ifnull        57
        52: aload_1
        53: invokevirtual #245                // Method getName:()Ljava/lang/String;
        56: areturn
        57: ldc           #246                // String Error
        59: areturn
        60: aload_0
        61: getfield      #90                 // Field _sponsor:I
        64: ifeq          91
        67: aload_0
        68: getfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
        71: aload_0
        72: getfield      #90                 // Field _sponsor:I
        75: invokevirtual #241                // Method ext/mods/gameserver/model/pledge/Clan.getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
        78: astore_1
        79: aload_1
        80: ifnull        88
        83: aload_1
        84: invokevirtual #245                // Method getName:()Ljava/lang/String;
        87: areturn
        88: ldc           #246                // String Error
        90: areturn
        91: ldc           #248                // String
        93: areturn
      LineNumberTable:
        line 264: 0
        line 266: 7
        line 267: 18
        line 270: 29
        line 272: 36
        line 273: 48
        line 274: 52
        line 276: 57
        line 279: 60
        line 281: 67
        line 282: 79
        line 283: 83
        line 285: 88
        line 287: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48      12     1 apprentice   Lext/mods/gameserver/model/pledge/ClanMember;
           79      12     1 sponsor   Lext/mods/gameserver/model/pledge/ClanMember;
            0      94     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
      StackMapTable: number_of_entries = 5
        frame_type = 29 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember ]
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember ]
        frame_type = 250 /* chop */
          offset_delta = 2

  public void setApprenticeAndSponsor(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: putfield      #85                 // Field _apprentice:I
         5: aload_0
         6: iload_2
         7: putfield      #90                 // Field _sponsor:I
        10: return
      LineNumberTable:
        line 292: 0
        line 293: 5
        line 294: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
            0      11     1 apprenticeId   I
            0      11     2 sponsorId   I

  public void saveApprenticeAndSponsor(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=3
         0: invokestatic  #186                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_3
         4: aload_3
         5: ldc           #250                // String UPDATE characters SET apprentice=?,sponsor=? WHERE obj_Id=?
         7: invokeinterface #194,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore        4
        14: aload         4
        16: iconst_1
        17: iload_1
        18: invokeinterface #200,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        23: aload         4
        25: iconst_2
        26: iload_2
        27: invokeinterface #200,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        32: aload         4
        34: iconst_3
        35: aload_0
        36: invokevirtual #206                // Method getObjectId:()I
        39: invokeinterface #200,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        44: aload         4
        46: invokeinterface #207,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        51: pop
        52: aload         4
        54: ifnull        96
        57: aload         4
        59: invokeinterface #210,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        64: goto          96
        67: astore        5
        69: aload         4
        71: ifnull        93
        74: aload         4
        76: invokeinterface #210,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        81: goto          93
        84: astore        6
        86: aload         5
        88: aload         6
        90: invokevirtual #215                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        93: aload         5
        95: athrow
        96: aload_3
        97: ifnull        136
       100: aload_3
       101: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       106: goto          136
       109: astore        4
       111: aload_3
       112: ifnull        133
       115: aload_3
       116: invokeinterface #219,  1          // InterfaceMethod java/sql/Connection.close:()V
       121: goto          133
       124: astore        5
       126: aload         4
       128: aload         5
       130: invokevirtual #215                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       133: aload         4
       135: athrow
       136: goto          149
       139: astore_3
       140: getstatic     #222                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       143: ldc           #252                // String Couldn\'t update ClanMember sponsor/apprentice.
       145: aload_3
       146: invokevirtual #228                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       149: return
      Exception table:
         from    to  target type
            14    52    67   Class java/lang/Throwable
            74    81    84   Class java/lang/Throwable
             4    96   109   Class java/lang/Throwable
           115   121   124   Class java/lang/Throwable
             0   136   139   Class java/lang/Exception
      LineNumberTable:
        line 303: 0
        line 304: 4
        line 306: 14
        line 307: 23
        line 308: 32
        line 309: 44
        line 310: 52
        line 303: 67
        line 310: 96
        line 303: 109
        line 314: 136
        line 311: 139
        line 313: 140
        line 315: 149
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      82     4    ps   Ljava/sql/PreparedStatement;
            4     132     3   con   Ljava/sql/Connection;
          140       9     3     e   Ljava/lang/Exception;
            0     150     0  this   Lext/mods/gameserver/model/pledge/ClanMember;
            0     150     1 apprentice   I
            0     150     2 sponsor   I
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public static int calculatePledgeClass(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         6: astore_2
         7: aload_2
         8: ifnull        611
        11: aload_2
        12: invokevirtual #160                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
        15: tableswitch   { // 4 to 8

                       4: 48

                       5: 60

                       6: 89

                       7: 210

                       8: 408
                 default: 609
            }
        48: aload_0
        49: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        52: ifeq          611
        55: iconst_3
        56: istore_1
        57: goto          611
        60: aload_0
        61: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        64: ifeq          72
        67: iconst_4
        68: istore_1
        69: goto          611
        72: aload_0
        73: invokevirtual #258                // Method ext/mods/gameserver/model/actor/Player.isAcademyMember:()Z
        76: ifeq          84
        79: iconst_1
        80: istore_1
        81: goto          611
        84: iconst_2
        85: istore_1
        86: goto          611
        89: aload_0
        90: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Player.getPledgeType:()I
        93: lookupswitch  { // 4

                      -1: 136

                       0: 146

                     100: 141

                     200: 141
                 default: 207
            }
       136: iconst_1
       137: istore_1
       138: goto          207
       141: iconst_2
       142: istore_1
       143: goto          207
       146: aload_0
       147: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       150: ifeq          158
       153: iconst_5
       154: istore_1
       155: goto          207
       158: aload_2
       159: aload_0
       160: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       163: invokevirtual #261                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderSubPledge:(I)I
       166: lookupswitch  { // 3

                      -1: 205

                     100: 200

                     200: 200
                 default: 205
            }
       200: iconst_4
       201: istore_1
       202: goto          207
       205: iconst_3
       206: istore_1
       207: goto          611
       210: aload_0
       211: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Player.getPledgeType:()I
       214: lookupswitch  { // 8

                      -1: 288

                       0: 303

                     100: 293

                     200: 293

                    1001: 298

                    1002: 298

                    2001: 298

                    2002: 298
                 default: 405
            }
       288: iconst_1
       289: istore_1
       290: goto          405
       293: iconst_3
       294: istore_1
       295: goto          405
       298: iconst_2
       299: istore_1
       300: goto          405
       303: aload_0
       304: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       307: ifeq          316
       310: bipush        7
       312: istore_1
       313: goto          405
       316: aload_2
       317: aload_0
       318: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       321: invokevirtual #261                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderSubPledge:(I)I
       324: lookupswitch  { // 7

                      -1: 403

                     100: 392

                     200: 392

                    1001: 398

                    1002: 398

                    2001: 398

                    2002: 398
                 default: 403
            }
       392: bipush        6
       394: istore_1
       395: goto          405
       398: iconst_5
       399: istore_1
       400: goto          405
       403: iconst_4
       404: istore_1
       405: goto          611
       408: aload_0
       409: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Player.getPledgeType:()I
       412: lookupswitch  { // 8

                      -1: 488

                       0: 503

                     100: 493

                     200: 493

                    1001: 498

                    1002: 498

                    2001: 498

                    2002: 498
                 default: 606
            }
       488: iconst_1
       489: istore_1
       490: goto          606
       493: iconst_4
       494: istore_1
       495: goto          606
       498: iconst_3
       499: istore_1
       500: goto          606
       503: aload_0
       504: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       507: ifeq          516
       510: bipush        8
       512: istore_1
       513: goto          606
       516: aload_2
       517: aload_0
       518: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       521: invokevirtual #261                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderSubPledge:(I)I
       524: lookupswitch  { // 7

                      -1: 604

                     100: 592

                     200: 592

                    1001: 598

                    1002: 598

                    2001: 598

                    2002: 598
                 default: 604
            }
       592: bipush        7
       594: istore_1
       595: goto          606
       598: bipush        6
       600: istore_1
       601: goto          606
       604: iconst_5
       605: istore_1
       606: goto          611
       609: iconst_1
       610: istore_1
       611: aload_0
       612: invokevirtual #265                // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
       615: ifeq          630
       618: iload_1
       619: bipush        8
       621: if_icmpge     630
       624: bipush        8
       626: istore_1
       627: goto          644
       630: aload_0
       631: invokevirtual #268                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       634: ifeq          644
       637: iload_1
       638: iconst_5
       639: if_icmpge     644
       642: iconst_5
       643: istore_1
       644: iload_1
       645: ireturn
      LineNumberTable:
        line 324: 0
        line 326: 2
        line 327: 7
        line 329: 11
        line 332: 48
        line 333: 55
        line 337: 60
        line 338: 67
        line 339: 72
        line 340: 79
        line 342: 84
        line 343: 86
        line 346: 89
        line 349: 136
        line 350: 138
        line 353: 141
        line 354: 143
        line 357: 146
        line 358: 153
        line 360: 158
        line 363: 200
        line 364: 202
        line 368: 205
        line 373: 207
        line 376: 210
        line 379: 288
        line 380: 290
        line 383: 293
        line 384: 295
        line 387: 298
        line 388: 300
        line 391: 303
        line 392: 310
        line 394: 316
        line 397: 392
        line 398: 395
        line 401: 398
        line 402: 400
        line 406: 403
        line 411: 405
        line 414: 408
        line 417: 488
        line 418: 490
        line 422: 493
        line 423: 495
        line 429: 498
        line 430: 500
        line 433: 503
        line 434: 510
        line 436: 516
        line 440: 592
        line 441: 595
        line 447: 598
        line 448: 601
        line 452: 604
        line 457: 606
        line 460: 609
        line 465: 611
        line 466: 624
        line 467: 630
        line 468: 642
        line 470: 644
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     646     0 player   Lext/mods/gameserver/model/actor/Player;
            2     644     1 pledgeClass   I
            7     639     2  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 36
        frame_type = 253 /* append */
          offset_delta = 48
          locals = [ int, class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 4 /* same */
        frame_type = 46 /* same */
        frame_type = 4 /* same */
        frame_type = 4 /* same */
        frame_type = 11 /* same */
        frame_type = 41 /* same */
        frame_type = 4 /* same */
        frame_type = 1 /* same */
        frame_type = 2 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 77
        frame_type = 4 /* same */
        frame_type = 4 /* same */
        frame_type = 4 /* same */
        frame_type = 12 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 75
        frame_type = 5 /* same */
        frame_type = 4 /* same */
        frame_type = 1 /* same */
        frame_type = 2 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 79
        frame_type = 4 /* same */
        frame_type = 4 /* same */
        frame_type = 4 /* same */
        frame_type = 12 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 75
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 1 /* same */
        frame_type = 2 /* same */
        frame_type = 1 /* same */
        frame_type = 18 /* same */
        frame_type = 13 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #229                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/pledge/ClanMember
         6: invokevirtual #271                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #274                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #222                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "ClanMember.java"
