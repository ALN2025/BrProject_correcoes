// Bytecode for: ext.mods.gameserver.model.entity.CursedWeapon
// File: ext\mods\gameserver\model\entity\CursedWeapon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/CursedWeapon.class
  Last modified 9 de jul de 2026; size 18580 bytes
  MD5 checksum d5336d9d44f937d9efc56ed8bc253aaf
  Compiled from "CursedWeapon.java"
public class ext.mods.gameserver.model.entity.CursedWeapon
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/CursedWeapon
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 31, methods: 41, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/entity/CursedWeapon._item:Lext/mods/gameserver/model/item/instance/ItemInstance;
    #8 = Class              #10           // ext/mods/gameserver/model/entity/CursedWeapon
    #9 = NameAndType        #11:#12       // _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #10 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon
   #11 = Utf8               _item
   #12 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/entity/CursedWeapon._playerId:I
   #14 = NameAndType        #15:#16       // _playerId:I
   #15 = Utf8               _playerId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/entity/CursedWeapon._player:Lext/mods/gameserver/model/actor/Player;
   #18 = NameAndType        #19:#20       // _player:Lext/mods/gameserver/model/actor/Player;
   #19 = Utf8               _player
   #20 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/entity/CursedWeapon._isDropped:Z
   #22 = NameAndType        #23:#24       // _isDropped:Z
   #23 = Utf8               _isDropped
   #24 = Utf8               Z
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/model/entity/CursedWeapon._isActivated:Z
   #26 = NameAndType        #27:#24       // _isActivated:Z
   #27 = Utf8               _isActivated
   #28 = Fieldref           #8.#29        // ext/mods/gameserver/model/entity/CursedWeapon._playerKarma:I
   #29 = NameAndType        #30:#16       // _playerKarma:I
   #30 = Utf8               _playerKarma
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/model/entity/CursedWeapon._playerPkKills:I
   #32 = NameAndType        #33:#16       // _playerPkKills:I
   #33 = Utf8               _playerPkKills
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/model/entity/CursedWeapon._nbKills:I
   #35 = NameAndType        #36:#16       // _nbKills:I
   #36 = Utf8               _nbKills
   #37 = Fieldref           #8.#38        // ext/mods/gameserver/model/entity/CursedWeapon._currentStage:I
   #38 = NameAndType        #39:#16       // _currentStage:I
   #39 = Utf8               _currentStage
   #40 = Fieldref           #8.#41        // ext/mods/gameserver/model/entity/CursedWeapon._numberBeforeNextStage:I
   #41 = NameAndType        #42:#16       // _numberBeforeNextStage:I
   #42 = Utf8               _numberBeforeNextStage
   #43 = Fieldref           #8.#44        // ext/mods/gameserver/model/entity/CursedWeapon._hungryTime:I
   #44 = NameAndType        #45:#16       // _hungryTime:I
   #45 = Utf8               _hungryTime
   #46 = Fieldref           #8.#47        // ext/mods/gameserver/model/entity/CursedWeapon._endTime:J
   #47 = NameAndType        #48:#49       // _endTime:J
   #48 = Utf8               _endTime
   #49 = Utf8               J
   #50 = String             #51           // name
   #51 = Utf8               name
   #52 = Methodref          #53.#54       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #53 = Class              #55           // ext/mods/commons/data/StatSet
   #54 = NameAndType        #56:#57       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #55 = Utf8               ext/mods/commons/data/StatSet
   #56 = Utf8               getString
   #57 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #58 = Fieldref           #8.#59        // ext/mods/gameserver/model/entity/CursedWeapon._name:Ljava/lang/String;
   #59 = NameAndType        #60:#61       // _name:Ljava/lang/String;
   #60 = Utf8               _name
   #61 = Utf8               Ljava/lang/String;
   #62 = String             #63           // id
   #63 = Utf8               id
   #64 = Methodref          #53.#65       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #65 = NameAndType        #66:#67       // getInteger:(Ljava/lang/String;)I
   #66 = Utf8               getInteger
   #67 = Utf8               (Ljava/lang/String;)I
   #68 = Fieldref           #8.#69        // ext/mods/gameserver/model/entity/CursedWeapon._itemId:I
   #69 = NameAndType        #70:#16       // _itemId:I
   #70 = Utf8               _itemId
   #71 = String             #72           // skillId
   #72 = Utf8               skillId
   #73 = Fieldref           #8.#74        // ext/mods/gameserver/model/entity/CursedWeapon._skillId:I
   #74 = NameAndType        #75:#16       // _skillId:I
   #75 = Utf8               _skillId
   #76 = String             #77           // dropRate
   #77 = Utf8               dropRate
   #78 = Fieldref           #8.#79        // ext/mods/gameserver/model/entity/CursedWeapon._dropRate:I
   #79 = NameAndType        #80:#16       // _dropRate:I
   #80 = Utf8               _dropRate
   #81 = String             #82           // dissapearChance
   #82 = Utf8               dissapearChance
   #83 = Fieldref           #8.#84        // ext/mods/gameserver/model/entity/CursedWeapon._dissapearChance:I
   #84 = NameAndType        #85:#16       // _dissapearChance:I
   #85 = Utf8               _dissapearChance
   #86 = String             #87           // duration
   #87 = Utf8               duration
   #88 = Fieldref           #8.#89        // ext/mods/gameserver/model/entity/CursedWeapon._duration:I
   #89 = NameAndType        #90:#16       // _duration:I
   #90 = Utf8               _duration
   #91 = String             #92           // durationLost
   #92 = Utf8               durationLost
   #93 = Fieldref           #8.#94        // ext/mods/gameserver/model/entity/CursedWeapon._durationLost:I
   #94 = NameAndType        #95:#16       // _durationLost:I
   #95 = Utf8               _durationLost
   #96 = String             #97           // stageKills
   #97 = Utf8               stageKills
   #98 = Fieldref           #8.#99        // ext/mods/gameserver/model/entity/CursedWeapon._stageKills:I
   #99 = NameAndType        #100:#16      // _stageKills:I
  #100 = Utf8               _stageKills
  #101 = Methodref          #102.#103     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #102 = Class              #104          // ext/mods/gameserver/data/SkillTable
  #103 = NameAndType        #105:#106     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #104 = Utf8               ext/mods/gameserver/data/SkillTable
  #105 = Utf8               getInstance
  #106 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #107 = Methodref          #102.#108     // ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
  #108 = NameAndType        #109:#110     // getMaxLevel:(I)I
  #109 = Utf8               getMaxLevel
  #110 = Utf8               (I)I
  #111 = Fieldref           #8.#112       // ext/mods/gameserver/model/entity/CursedWeapon._skillMaxLevel:I
  #112 = NameAndType        #113:#16      // _skillMaxLevel:I
  #113 = Utf8               _skillMaxLevel
  #114 = Methodref          #115.#116     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #115 = Class              #117          // ext/mods/commons/pool/ConnectionPool
  #116 = NameAndType        #118:#119     // getConnection:()Ljava/sql/Connection;
  #117 = Utf8               ext/mods/commons/pool/ConnectionPool
  #118 = Utf8               getConnection
  #119 = Utf8               ()Ljava/sql/Connection;
  #120 = String             #121          // SELECT * FROM cursed_weapons WHERE itemId=?
  #121 = Utf8               SELECT * FROM cursed_weapons WHERE itemId=?
  #122 = InterfaceMethodref #123.#124     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #123 = Class              #125          // java/sql/Connection
  #124 = NameAndType        #126:#127     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #125 = Utf8               java/sql/Connection
  #126 = Utf8               prepareStatement
  #127 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #128 = InterfaceMethodref #129.#130     // java/sql/PreparedStatement.setInt:(II)V
  #129 = Class              #131          // java/sql/PreparedStatement
  #130 = NameAndType        #132:#133     // setInt:(II)V
  #131 = Utf8               java/sql/PreparedStatement
  #132 = Utf8               setInt
  #133 = Utf8               (II)V
  #134 = InterfaceMethodref #129.#135     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #135 = NameAndType        #136:#137     // executeQuery:()Ljava/sql/ResultSet;
  #136 = Utf8               executeQuery
  #137 = Utf8               ()Ljava/sql/ResultSet;
  #138 = InterfaceMethodref #139.#140     // java/sql/ResultSet.next:()Z
  #139 = Class              #141          // java/sql/ResultSet
  #140 = NameAndType        #142:#143     // next:()Z
  #141 = Utf8               java/sql/ResultSet
  #142 = Utf8               next
  #143 = Utf8               ()Z
  #144 = String             #145          // playerId
  #145 = Utf8               playerId
  #146 = InterfaceMethodref #139.#147     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #147 = NameAndType        #148:#67      // getInt:(Ljava/lang/String;)I
  #148 = Utf8               getInt
  #149 = String             #150          // playerKarma
  #150 = Utf8               playerKarma
  #151 = String             #152          // playerPkKills
  #152 = Utf8               playerPkKills
  #153 = String             #154          // nbKills
  #154 = Utf8               nbKills
  #155 = String             #156          // currentStage
  #156 = Utf8               currentStage
  #157 = String             #158          // numberBeforeNextStage
  #158 = Utf8               numberBeforeNextStage
  #159 = String             #160          // hungryTime
  #160 = Utf8               hungryTime
  #161 = String             #162          // endTime
  #162 = Utf8               endTime
  #163 = InterfaceMethodref #139.#164     // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #164 = NameAndType        #165:#166     // getLong:(Ljava/lang/String;)J
  #165 = Utf8               getLong
  #166 = Utf8               (Ljava/lang/String;)J
  #167 = Methodref          #8.#168       // ext/mods/gameserver/model/entity/CursedWeapon.reActivate:(Z)V
  #168 = NameAndType        #169:#170     // reActivate:(Z)V
  #169 = Utf8               reActivate
  #170 = Utf8               (Z)V
  #171 = InterfaceMethodref #139.#172     // java/sql/ResultSet.close:()V
  #172 = NameAndType        #173:#6       // close:()V
  #173 = Utf8               close
  #174 = Class              #175          // java/lang/Throwable
  #175 = Utf8               java/lang/Throwable
  #176 = Methodref          #174.#177     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #177 = NameAndType        #178:#179     // addSuppressed:(Ljava/lang/Throwable;)V
  #178 = Utf8               addSuppressed
  #179 = Utf8               (Ljava/lang/Throwable;)V
  #180 = InterfaceMethodref #129.#172     // java/sql/PreparedStatement.close:()V
  #181 = InterfaceMethodref #123.#172     // java/sql/Connection.close:()V
  #182 = Class              #183          // java/lang/Exception
  #183 = Utf8               java/lang/Exception
  #184 = Fieldref           #8.#185       // ext/mods/gameserver/model/entity/CursedWeapon.LOGGER:Lext/mods/commons/logging/CLogger;
  #185 = NameAndType        #186:#187     // LOGGER:Lext/mods/commons/logging/CLogger;
  #186 = Utf8               LOGGER
  #187 = Utf8               Lext/mods/commons/logging/CLogger;
  #188 = String             #189          // Couldn\'t restore cursed weapons data.
  #189 = Utf8               Couldn\'t restore cursed weapons data.
  #190 = Methodref          #191.#192     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #191 = Class              #193          // ext/mods/commons/logging/CLogger
  #192 = NameAndType        #194:#195     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #193 = Utf8               ext/mods/commons/logging/CLogger
  #194 = Utf8               error
  #195 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #196 = Methodref          #197.#198     // java/lang/System.currentTimeMillis:()J
  #197 = Class              #199          // java/lang/System
  #198 = NameAndType        #200:#201     // currentTimeMillis:()J
  #199 = Utf8               java/lang/System
  #200 = Utf8               currentTimeMillis
  #201 = Utf8               ()J
  #202 = Methodref          #203.#204     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #203 = Class              #205          // ext/mods/gameserver/model/actor/Player
  #204 = NameAndType        #206:#143     // isOnline:()Z
  #205 = Utf8               ext/mods/gameserver/model/actor/Player
  #206 = Utf8               isOnline
  #207 = String             #208          // {} is being removed online.
  #208 = Utf8               {} is being removed online.
  #209 = Methodref          #191.#210     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #210 = NameAndType        #211:#212     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #211 = Utf8               info
  #212 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #213 = Methodref          #203.#214     // ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #214 = NameAndType        #215:#216     // getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #215 = Utf8               getAttack
  #216 = Utf8               ()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #217 = Methodref          #218.#219     // ext/mods/gameserver/model/actor/attack/PlayerAttack.stop:()V
  #218 = Class              #220          // ext/mods/gameserver/model/actor/attack/PlayerAttack
  #219 = NameAndType        #221:#6       // stop:()V
  #220 = Utf8               ext/mods/gameserver/model/actor/attack/PlayerAttack
  #221 = Utf8               stop
  #222 = Methodref          #203.#223     // ext/mods/gameserver/model/actor/Player.setKarma:(I)V
  #223 = NameAndType        #224:#225     // setKarma:(I)V
  #224 = Utf8               setKarma
  #225 = Utf8               (I)V
  #226 = Methodref          #203.#227     // ext/mods/gameserver/model/actor/Player.setPkKills:(I)V
  #227 = NameAndType        #228:#225     // setPkKills:(I)V
  #228 = Utf8               setPkKills
  #229 = Methodref          #203.#230     // ext/mods/gameserver/model/actor/Player.setCursedWeaponEquippedId:(I)V
  #230 = NameAndType        #231:#225     // setCursedWeaponEquippedId:(I)V
  #231 = Utf8               setCursedWeaponEquippedId
  #232 = Methodref          #8.#233       // ext/mods/gameserver/model/entity/CursedWeapon.removeDemonicSkills:()V
  #233 = NameAndType        #234:#6       // removeDemonicSkills:()V
  #234 = Utf8               removeDemonicSkills
  #235 = Methodref          #203.#236     // ext/mods/gameserver/model/actor/Player.useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #236 = NameAndType        #237:#238     // useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #237 = Utf8               useEquippableItem
  #238 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #239 = Methodref          #203.#240     // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #240 = NameAndType        #241:#242     // destroyItemByItemId:(IIZ)Z
  #241 = Utf8               destroyItemByItemId
  #242 = Utf8               (IIZ)Z
  #243 = Methodref          #203.#244     // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #244 = NameAndType        #245:#6       // broadcastUserInfo:()V
  #245 = Utf8               broadcastUserInfo
  #246 = Methodref          #203.#247     // ext/mods/gameserver/model/actor/Player.store:()V
  #247 = NameAndType        #248:#6       // store:()V
  #248 = Utf8               store
  #249 = String             #250          // {} is being removed offline.
  #250 = Utf8               {} is being removed offline.
  #251 = String             #252          // DELETE FROM items WHERE owner_id=? AND item_id=?
  #252 = Utf8               DELETE FROM items WHERE owner_id=? AND item_id=?
  #253 = String             #254          // UPDATE characters SET karma=?, pkkills=? WHERE obj_Id=?
  #254 = Utf8               UPDATE characters SET karma=?, pkkills=? WHERE obj_Id=?
  #255 = InterfaceMethodref #129.#256     // java/sql/PreparedStatement.executeUpdate:()I
  #256 = NameAndType        #257:#258     // executeUpdate:()I
  #257 = Utf8               executeUpdate
  #258 = Utf8               ()I
  #259 = InvokeDynamic      #0:#260       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #260 = NameAndType        #261:#262     // makeConcatWithConstants:(II)Ljava/lang/String;
  #261 = Utf8               makeConcatWithConstants
  #262 = Utf8               (II)Ljava/lang/String;
  #263 = Methodref          #191.#264     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #264 = NameAndType        #265:#266     // warn:(Ljava/lang/Object;)V
  #265 = Utf8               warn
  #266 = Utf8               (Ljava/lang/Object;)V
  #267 = InvokeDynamic      #1:#268       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #268 = NameAndType        #261:#269     // makeConcatWithConstants:(I)Ljava/lang/String;
  #269 = Utf8               (I)Ljava/lang/String;
  #270 = String             #271          // Couldn\'t cleanup {} from offline player {}.
  #271 = Utf8               Couldn\'t cleanup {} from offline player {}.
  #272 = Methodref          #273.#274     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #273 = Class              #275          // java/lang/Integer
  #274 = NameAndType        #276:#277     // valueOf:(I)Ljava/lang/Integer;
  #275 = Utf8               java/lang/Integer
  #276 = Utf8               valueOf
  #277 = Utf8               (I)Ljava/lang/Integer;
  #278 = Methodref          #191.#279     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #279 = NameAndType        #194:#280     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #280 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #281 = Methodref          #203.#282     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #282 = NameAndType        #283:#284     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #283 = Utf8               getInventory
  #284 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #285 = Methodref          #286.#287     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #286 = Class              #288          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #287 = NameAndType        #289:#290     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #288 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #289 = Utf8               getItemByItemId
  #290 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #291 = String             #292          // {} has been assimilated.
  #292 = Utf8               {} has been assimilated.
  #293 = Methodref          #294.#295     // ext/mods/gameserver/model/item/instance/ItemInstance.decayMe:()V
  #294 = Class              #296          // ext/mods/gameserver/model/item/instance/ItemInstance
  #295 = NameAndType        #297:#6       // decayMe:()V
  #296 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #297 = Utf8               decayMe
  #298 = String             #299          // {} has been removed from world.
  #299 = Utf8               {} has been removed from world.
  #300 = Methodref          #8.#301       // ext/mods/gameserver/model/entity/CursedWeapon.cancelDailyTimer:()V
  #301 = NameAndType        #302:#6       // cancelDailyTimer:()V
  #302 = Utf8               cancelDailyTimer
  #303 = Methodref          #8.#304       // ext/mods/gameserver/model/entity/CursedWeapon.cancelOverallTimer:()V
  #304 = NameAndType        #305:#6       // cancelOverallTimer:()V
  #305 = Utf8               cancelOverallTimer
  #306 = Methodref          #8.#307       // ext/mods/gameserver/model/entity/CursedWeapon.cancelDropTimer:()V
  #307 = NameAndType        #308:#6       // cancelDropTimer:()V
  #308 = Utf8               cancelDropTimer
  #309 = Methodref          #8.#310       // ext/mods/gameserver/model/entity/CursedWeapon.removeFromDb:()V
  #310 = NameAndType        #311:#6       // removeFromDb:()V
  #311 = Utf8               removeFromDb
  #312 = Fieldref           #313.#314     // ext/mods/gameserver/network/SystemMessageId.S1_HAS_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
  #313 = Class              #315          // ext/mods/gameserver/network/SystemMessageId
  #314 = NameAndType        #316:#317     // S1_HAS_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
  #315 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #316 = Utf8               S1_HAS_DISAPPEARED
  #317 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #318 = Methodref          #319.#320     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #319 = Class              #321          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #320 = NameAndType        #322:#323     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #321 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #322 = Utf8               getSystemMessage
  #323 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #324 = Methodref          #319.#325     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #325 = NameAndType        #326:#327     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #326 = Utf8               addItemName
  #327 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #328 = Methodref          #329.#330     // ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #329 = Class              #331          // ext/mods/gameserver/model/World
  #330 = NameAndType        #332:#333     // toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #331 = Utf8               ext/mods/gameserver/model/World
  #332 = Utf8               toAllOnlinePlayers
  #333 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #334 = Fieldref           #8.#335       // ext/mods/gameserver/model/entity/CursedWeapon._dailyTimer:Ljava/util/concurrent/ScheduledFuture;
  #335 = NameAndType        #336:#337     // _dailyTimer:Ljava/util/concurrent/ScheduledFuture;
  #336 = Utf8               _dailyTimer
  #337 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #338 = InterfaceMethodref #339.#340     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #339 = Class              #341          // java/util/concurrent/ScheduledFuture
  #340 = NameAndType        #342:#343     // cancel:(Z)Z
  #341 = Utf8               java/util/concurrent/ScheduledFuture
  #342 = Utf8               cancel
  #343 = Utf8               (Z)Z
  #344 = Fieldref           #8.#345       // ext/mods/gameserver/model/entity/CursedWeapon._overallTimer:Ljava/util/concurrent/ScheduledFuture;
  #345 = NameAndType        #346:#337     // _overallTimer:Ljava/util/concurrent/ScheduledFuture;
  #346 = Utf8               _overallTimer
  #347 = Fieldref           #8.#348       // ext/mods/gameserver/model/entity/CursedWeapon._dropTimer:Ljava/util/concurrent/ScheduledFuture;
  #348 = NameAndType        #349:#337     // _dropTimer:Ljava/util/concurrent/ScheduledFuture;
  #349 = Utf8               _dropTimer
  #350 = Methodref          #294.#351     // ext/mods/gameserver/model/item/instance/ItemInstance.setDestroyProtected:(Z)V
  #351 = NameAndType        #352:#170     // setDestroyProtected:(Z)V
  #352 = Utf8               setDestroyProtected
  #353 = Methodref          #203.#354     // ext/mods/gameserver/model/actor/Player.dropItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #354 = NameAndType        #355:#356     // dropItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #355 = Utf8               dropItem
  #356 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #357 = Class              #358          // ext/mods/gameserver/model/entity/CursedWeapon$DropTimer
  #358 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon$DropTimer
  #359 = Methodref          #357.#360     // ext/mods/gameserver/model/entity/CursedWeapon$DropTimer."<init>":(Lext/mods/gameserver/model/entity/CursedWeapon;)V
  #360 = NameAndType        #5:#361       // "<init>":(Lext/mods/gameserver/model/entity/CursedWeapon;)V
  #361 = Utf8               (Lext/mods/gameserver/model/entity/CursedWeapon;)V
  #362 = Long               3600000l
  #364 = Methodref          #365.#366     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #365 = Class              #367          // ext/mods/commons/pool/ThreadPool
  #366 = NameAndType        #368:#369     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #367 = Utf8               ext/mods/commons/pool/ThreadPool
  #368 = Utf8               schedule
  #369 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #370 = Fieldref           #313.#371     // ext/mods/gameserver/network/SystemMessageId.S2_WAS_DROPPED_IN_THE_S1_REGION:Lext/mods/gameserver/network/SystemMessageId;
  #371 = NameAndType        #372:#317     // S2_WAS_DROPPED_IN_THE_S1_REGION:Lext/mods/gameserver/network/SystemMessageId;
  #372 = Utf8               S2_WAS_DROPPED_IN_THE_S1_REGION
  #373 = Methodref          #203.#374     // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #374 = NameAndType        #375:#376     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #375 = Utf8               getPosition
  #376 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #377 = Methodref          #319.#378     // ext/mods/gameserver/network/serverpackets/SystemMessage.addZoneName:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #378 = NameAndType        #379:#380     // addZoneName:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #379 = Utf8               addZoneName
  #380 = Utf8               (Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #381 = Methodref          #294.#382     // ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #382 = NameAndType        #383:#384     // create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #383 = Utf8               create
  #384 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #385 = Methodref          #294.#386     // ext/mods/gameserver/model/item/instance/ItemInstance.dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
  #386 = NameAndType        #387:#388     // dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
  #387 = Utf8               dropMe
  #388 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #389 = Class              #390          // ext/mods/gameserver/network/serverpackets/ExRedSky
  #390 = Utf8               ext/mods/gameserver/network/serverpackets/ExRedSky
  #391 = Methodref          #389.#392     // ext/mods/gameserver/network/serverpackets/ExRedSky."<init>":(I)V
  #392 = NameAndType        #5:#225       // "<init>":(I)V
  #393 = Class              #394          // ext/mods/gameserver/network/serverpackets/Earthquake
  #394 = Utf8               ext/mods/gameserver/network/serverpackets/Earthquake
  #395 = Methodref          #393.#396     // ext/mods/gameserver/network/serverpackets/Earthquake."<init>":(Lext/mods/gameserver/model/WorldObject;II)V
  #396 = NameAndType        #5:#397       // "<init>":(Lext/mods/gameserver/model/WorldObject;II)V
  #397 = Utf8               (Lext/mods/gameserver/model/WorldObject;II)V
  #398 = Fieldref           #313.#399     // ext/mods/gameserver/network/SystemMessageId.S2_OWNER_HAS_LOGGED_INTO_THE_S1_REGION:Lext/mods/gameserver/network/SystemMessageId;
  #399 = NameAndType        #400:#317     // S2_OWNER_HAS_LOGGED_INTO_THE_S1_REGION:Lext/mods/gameserver/network/SystemMessageId;
  #400 = Utf8               S2_OWNER_HAS_LOGGED_INTO_THE_S1_REGION
  #401 = Methodref          #203.#402     // ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
  #402 = NameAndType        #403:#258     // getCursedWeaponEquippedId:()I
  #403 = Utf8               getCursedWeaponEquippedId
  #404 = Methodref          #8.#405       // ext/mods/gameserver/model/entity/CursedWeapon.getTimeLeft:()J
  #405 = NameAndType        #406:#201     // getTimeLeft:()J
  #406 = Utf8               getTimeLeft
  #407 = Long               60000l
  #409 = Fieldref           #313.#410     // ext/mods/gameserver/network/SystemMessageId.S2_MINUTE_OF_USAGE_TIME_ARE_LEFT_FOR_S1:Lext/mods/gameserver/network/SystemMessageId;
  #410 = NameAndType        #411:#317     // S2_MINUTE_OF_USAGE_TIME_ARE_LEFT_FOR_S1:Lext/mods/gameserver/network/SystemMessageId;
  #411 = Utf8               S2_MINUTE_OF_USAGE_TIME_ARE_LEFT_FOR_S1
  #412 = Methodref          #319.#413     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #413 = NameAndType        #414:#327     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #414 = Utf8               addNumber
  #415 = Methodref          #203.#416     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #416 = NameAndType        #417:#333     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #417 = Utf8               sendPacket
  #418 = Methodref          #102.#419     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #419 = NameAndType        #420:#421     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #420 = Utf8               getInfo
  #421 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #422 = Methodref          #203.#423     // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #423 = NameAndType        #424:#425     // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #424 = Utf8               addSkill
  #425 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
  #426 = Class              #427          // ext/mods/gameserver/network/serverpackets/SkillList
  #427 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
  #428 = Methodref          #426.#429     // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #429 = NameAndType        #5:#430       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #430 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #431 = Methodref          #203.#432     // ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
  #432 = NameAndType        #433:#434     // removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
  #433 = Utf8               removeSkill
  #434 = Utf8               (IZ)Lext/mods/gameserver/skills/L2Skill;
  #435 = Class              #436          // ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer
  #436 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer
  #437 = Methodref          #435.#360     // ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer."<init>":(Lext/mods/gameserver/model/entity/CursedWeapon;)V
  #438 = Methodref          #365.#439     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #439 = NameAndType        #440:#441     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #440 = Utf8               scheduleAtFixedRate
  #441 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #442 = Methodref          #8.#443       // ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
  #443 = NameAndType        #444:#6       // endOfLife:()V
  #444 = Utf8               endOfLife
  #445 = Class              #446          // ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer
  #446 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer
  #447 = Methodref          #445.#360     // ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer."<init>":(Lext/mods/gameserver/model/entity/CursedWeapon;)V
  #448 = Integer            1000000
  #449 = Methodref          #450.#451     // ext/mods/commons/random/Rnd.get:(I)I
  #450 = Class              #452          // ext/mods/commons/random/Rnd
  #451 = NameAndType        #453:#110     // get:(I)I
  #452 = Utf8               ext/mods/commons/random/Rnd
  #453 = Utf8               get
  #454 = Methodref          #8.#455       // ext/mods/gameserver/model/entity/CursedWeapon.dropFromMob:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)V
  #455 = NameAndType        #456:#457     // dropFromMob:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)V
  #456 = Utf8               dropFromMob
  #457 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)V
  #458 = Methodref          #203.#459     // ext/mods/gameserver/model/actor/Player.isMounted:()Z
  #459 = NameAndType        #460:#143     // isMounted:()Z
  #460 = Utf8               isMounted
  #461 = Methodref          #203.#462     // ext/mods/gameserver/model/actor/Player.dismount:()V
  #462 = NameAndType        #463:#6       // dismount:()V
  #463 = Utf8               dismount
  #464 = Methodref          #203.#465     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #465 = NameAndType        #466:#258     // getObjectId:()I
  #466 = Utf8               getObjectId
  #467 = Methodref          #203.#468     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #468 = NameAndType        #469:#258     // getKarma:()I
  #469 = Utf8               getKarma
  #470 = Methodref          #203.#471     // ext/mods/gameserver/model/actor/Player.getPkKills:()I
  #471 = NameAndType        #472:#258     // getPkKills:()I
  #472 = Utf8               getPkKills
  #473 = Double             0.5d
  #475 = Methodref          #476.#477     // java/lang/Math.round:(D)J
  #476 = Class              #478          // java/lang/Math
  #477 = NameAndType        #479:#480     // round:(D)J
  #478 = Utf8               java/lang/Math
  #479 = Utf8               round
  #480 = Utf8               (D)J
  #481 = Double             1.5d
  #483 = Methodref          #450.#484     // ext/mods/commons/random/Rnd.get:(II)I
  #484 = NameAndType        #453:#485     // get:(II)I
  #485 = Utf8               (II)I
  #486 = String             #487          // INSERT INTO cursed_weapons (itemId, playerId, playerKarma, playerPkKills, nbKills, currentStage, numberBeforeNextStage, hungryTime, endTime) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
  #487 = Utf8               INSERT INTO cursed_weapons (itemId, playerId, playerKarma, playerPkKills, nbKills, currentStage, numberBeforeNextStage, hungryTime, endTime) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
  #488 = InterfaceMethodref #129.#489     // java/sql/PreparedStatement.setLong:(IJ)V
  #489 = NameAndType        #490:#491     // setLong:(IJ)V
  #490 = Utf8               setLong
  #491 = Utf8               (IJ)V
  #492 = String             #493          // Failed to insert cursed weapon data.
  #493 = Utf8               Failed to insert cursed weapon data.
  #494 = Integer            9999999
  #495 = Methodref          #203.#496     // ext/mods/gameserver/model/actor/Player.isInParty:()Z
  #496 = NameAndType        #497:#143     // isInParty:()Z
  #497 = Utf8               isInParty
  #498 = Methodref          #203.#499     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #499 = NameAndType        #500:#501     // getParty:()Lext/mods/gameserver/model/group/Party;
  #500 = Utf8               getParty
  #501 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #502 = Fieldref           #503.#504     // ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #503 = Class              #505          // ext/mods/gameserver/enums/MessageType
  #504 = NameAndType        #506:#507     // EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #505 = Utf8               ext/mods/gameserver/enums/MessageType
  #506 = Utf8               EXPELLED
  #507 = Utf8               Lext/mods/gameserver/enums/MessageType;
  #508 = Methodref          #509.#510     // ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #509 = Class              #511          // ext/mods/gameserver/model/group/Party
  #510 = NameAndType        #512:#513     // removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #511 = Utf8               ext/mods/gameserver/model/group/Party
  #512 = Utf8               removePartyMember
  #513 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #514 = Methodref          #203.#515     // ext/mods/gameserver/model/actor/Player.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #515 = NameAndType        #516:#517     // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #516 = Utf8               getAllEffects
  #517 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
  #518 = Methodref          #519.#520     // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #519 = Class              #521          // ext/mods/gameserver/skills/AbstractEffect
  #520 = NameAndType        #522:#523     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #521 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #522 = Utf8               getSkill
  #523 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #524 = Methodref          #525.#526     // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #525 = Class              #527          // ext/mods/gameserver/skills/L2Skill
  #526 = NameAndType        #528:#143     // isToggle:()Z
  #527 = Utf8               ext/mods/gameserver/skills/L2Skill
  #528 = Utf8               isToggle
  #529 = Methodref          #519.#530     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #530 = NameAndType        #531:#6       // exit:()V
  #531 = Utf8               exit
  #532 = Methodref          #8.#533       // ext/mods/gameserver/model/entity/CursedWeapon.giveDemonicSkills:()V
  #533 = NameAndType        #534:#6       // giveDemonicSkills:()V
  #534 = Utf8               giveDemonicSkills
  #535 = Methodref          #203.#536     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #536 = NameAndType        #537:#538     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #537 = Utf8               getStatus
  #538 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #539 = Methodref          #540.#541     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
  #540 = Class              #542          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #541 = NameAndType        #543:#6       // setMaxCpHpMp:()V
  #542 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #543 = Utf8               setMaxCpHpMp
  #544 = Methodref          #203.#545     // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #545 = NameAndType        #546:#547     // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #546 = Utf8               getMissions
  #547 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #548 = Fieldref           #549.#550     // ext/mods/gameserver/enums/actors/MissionType.CURSED_WEAPON:Lext/mods/gameserver/enums/actors/MissionType;
  #549 = Class              #551          // ext/mods/gameserver/enums/actors/MissionType
  #550 = NameAndType        #552:#553     // CURSED_WEAPON:Lext/mods/gameserver/enums/actors/MissionType;
  #551 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #552 = Utf8               CURSED_WEAPON
  #553 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #554 = Methodref          #555.#556     // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #555 = Class              #557          // ext/mods/gameserver/model/actor/container/player/MissionList
  #556 = NameAndType        #558:#559     // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #557 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
  #558 = Utf8               update
  #559 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
  #560 = Fieldref           #313.#561     // ext/mods/gameserver/network/SystemMessageId.THE_OWNER_OF_S2_HAS_APPEARED_IN_THE_S1_REGION:Lext/mods/gameserver/network/SystemMessageId;
  #561 = NameAndType        #562:#317     // THE_OWNER_OF_S2_HAS_APPEARED_IN_THE_S1_REGION:Lext/mods/gameserver/network/SystemMessageId;
  #562 = Utf8               THE_OWNER_OF_S2_HAS_APPEARED_IN_THE_S1_REGION
  #563 = Methodref          #294.#564     // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #564 = NameAndType        #565:#258     // getItemId:()I
  #565 = Utf8               getItemId
  #566 = String             #567          // DELETE FROM cursed_weapons WHERE itemId = ?
  #567 = Utf8               DELETE FROM cursed_weapons WHERE itemId = ?
  #568 = String             #569          // Failed to remove cursed weapon data.
  #569 = Utf8               Failed to remove cursed weapon data.
  #570 = Methodref          #8.#571       // ext/mods/gameserver/model/entity/CursedWeapon.dropFromPlayer:(Lext/mods/gameserver/model/actor/Creature;)V
  #571 = NameAndType        #572:#388     // dropFromPlayer:(Lext/mods/gameserver/model/actor/Creature;)V
  #572 = Utf8               dropFromPlayer
  #573 = Class              #574          // ext/mods/gameserver/network/serverpackets/UserInfo
  #574 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
  #575 = Methodref          #573.#429     // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #576 = Methodref          #8.#577       // ext/mods/gameserver/model/entity/CursedWeapon.rankUp:()V
  #577 = NameAndType        #578:#6       // rankUp:()V
  #578 = Utf8               rankUp
  #579 = Class              #580          // ext/mods/gameserver/network/serverpackets/SocialAction
  #580 = Utf8               ext/mods/gameserver/network/serverpackets/SocialAction
  #581 = Methodref          #579.#582     // ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
  #582 = NameAndType        #5:#583       // "<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
  #583 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #584 = Methodref          #203.#585     // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #585 = NameAndType        #586:#333     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #586 = Utf8               broadcastPacket
  #587 = Methodref          #203.#588     // ext/mods/gameserver/model/actor/Player.getX:()I
  #588 = NameAndType        #589:#258     // getX:()I
  #589 = Utf8               getX
  #590 = Methodref          #203.#591     // ext/mods/gameserver/model/actor/Player.getY:()I
  #591 = NameAndType        #592:#258     // getY:()I
  #592 = Utf8               getY
  #593 = Methodref          #203.#594     // ext/mods/gameserver/model/actor/Player.getZ:()I
  #594 = NameAndType        #595:#258     // getZ:()I
  #595 = Utf8               getZ
  #596 = Methodref          #203.#597     // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #597 = NameAndType        #598:#599     // teleportTo:(IIII)Z
  #598 = Utf8               teleportTo
  #599 = Utf8               (IIII)Z
  #600 = Methodref          #294.#588     // ext/mods/gameserver/model/item/instance/ItemInstance.getX:()I
  #601 = Methodref          #294.#591     // ext/mods/gameserver/model/item/instance/ItemInstance.getY:()I
  #602 = Methodref          #294.#594     // ext/mods/gameserver/model/item/instance/ItemInstance.getZ:()I
  #603 = InvokeDynamic      #2:#604       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #604 = NameAndType        #261:#57      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #605 = Methodref          #203.#606     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #606 = NameAndType        #607:#608     // sendMessage:(Ljava/lang/String;)V
  #607 = Utf8               sendMessage
  #608 = Utf8               (Ljava/lang/String;)V
  #609 = Methodref          #294.#374     // ext/mods/gameserver/model/item/instance/ItemInstance.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #610 = Methodref          #611.#612     // java/lang/Class.getName:()Ljava/lang/String;
  #611 = Class              #613          // java/lang/Class
  #612 = NameAndType        #614:#615     // getName:()Ljava/lang/String;
  #613 = Utf8               java/lang/Class
  #614 = Utf8               getName
  #615 = Utf8               ()Ljava/lang/String;
  #616 = Methodref          #191.#617     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #617 = NameAndType        #5:#608       // "<init>":(Ljava/lang/String;)V
  #618 = Utf8               LOAD_CW
  #619 = Utf8               ConstantValue
  #620 = Utf8               DELETE_ITEM
  #621 = Utf8               UPDATE_PLAYER
  #622 = Utf8               INSERT_CW
  #623 = Utf8               DELETE_CW
  #624 = Utf8               UPDATE_CW
  #625 = String             #626          // UPDATE cursed_weapons SET nbKills=?, currentStage=?, numberBeforeNextStage=?, hungryTime=?, endTime=? WHERE itemId=?
  #626 = Utf8               UPDATE cursed_weapons SET nbKills=?, currentStage=?, numberBeforeNextStage=?, hungryTime=?, endTime=? WHERE itemId=?
  #627 = Utf8               Signature
  #628 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #629 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #630 = Utf8               Code
  #631 = Utf8               LineNumberTable
  #632 = Utf8               LocalVariableTable
  #633 = Utf8               rs
  #634 = Utf8               Ljava/sql/ResultSet;
  #635 = Utf8               ps
  #636 = Utf8               Ljava/sql/PreparedStatement;
  #637 = Utf8               con
  #638 = Utf8               Ljava/sql/Connection;
  #639 = Utf8               e
  #640 = Utf8               Ljava/lang/Exception;
  #641 = Utf8               this
  #642 = Utf8               Lext/mods/gameserver/model/entity/CursedWeapon;
  #643 = Utf8               set
  #644 = Utf8               Lext/mods/commons/data/StatSet;
  #645 = Utf8               StackMapTable
  #646 = Utf8               setPlayer
  #647 = Utf8               player
  #648 = Utf8               setItem
  #649 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #650 = Utf8               item
  #651 = Utf8               isActivated
  #652 = Utf8               isDropped
  #653 = Utf8               getEndTime
  #654 = Utf8               getDuration
  #655 = Utf8               getDurationLost
  #656 = Utf8               getSkillId
  #657 = Utf8               getPlayerId
  #658 = Utf8               getPlayer
  #659 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #660 = Utf8               getPlayerKarma
  #661 = Utf8               getPlayerPkKills
  #662 = Utf8               getNbKills
  #663 = Utf8               getStageKills
  #664 = Utf8               isActive
  #665 = Utf8               getCurrentStage
  #666 = Utf8               getNumberBeforeNextStage
  #667 = Utf8               getHungryTime
  #668 = Utf8               del
  #669 = Utf8               killer
  #670 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #671 = Utf8               attackable
  #672 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #673 = Utf8               cursedOnLogin
  #674 = Utf8               sm
  #675 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #676 = Utf8               timeLeft
  #677 = Utf8               skill
  #678 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #679 = Utf8               fromZero
  #680 = Utf8               checkDrop
  #681 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)Z
  #682 = Utf8               activate
  #683 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #684 = Utf8               effect
  #685 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #686 = Class              #687          // "[Lext/mods/gameserver/skills/AbstractEffect;"
  #687 = Utf8               [Lext/mods/gameserver/skills/AbstractEffect;
  #688 = Utf8               dropIt
  #689 = Utf8               increaseKills
  #690 = Utf8               getWorldPosition
  #691 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #692 = Utf8               <clinit>
  #693 = Utf8               SourceFile
  #694 = Utf8               CursedWeapon.java
  #695 = Utf8               NestMembers
  #696 = Utf8               BootstrapMethods
  #697 = String             #698          // Error while deleting itemId \u0001 from userId \u0001
  #698 = Utf8               Error while deleting itemId \u0001 from userId \u0001
  #699 = String             #700          // Error while updating karma & pkkills for userId \u0001
  #700 = Utf8               Error while updating karma & pkkills for userId \u0001
  #701 = String             #702          // \u0001 isn\'t in the world.
  #702 = Utf8               \u0001 isn\'t in the world.
  #703 = MethodHandle       6:#704        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #704 = Methodref          #705.#706     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #705 = Class              #707          // java/lang/invoke/StringConcatFactory
  #706 = NameAndType        #261:#708     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #707 = Utf8               java/lang/invoke/StringConcatFactory
  #708 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #709 = Utf8               InnerClasses
  #710 = Utf8               DropTimer
  #711 = Utf8               OverallTimer
  #712 = Utf8               DailyTimer
  #713 = Class              #714          // java/lang/invoke/MethodHandles$Lookup
  #714 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #715 = Class              #716          // java/lang/invoke/MethodHandles
  #716 = Utf8               java/lang/invoke/MethodHandles
  #717 = Utf8               Lookup
{
  protected final int _itemId;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected ext.mods.gameserver.model.actor.Player _player;
    descriptor: Lext/mods/gameserver/model/actor/Player;
    flags: (0x0004) ACC_PROTECTED

  protected int _nbKills;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _currentStage;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _numberBeforeNextStage;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _hungryTime;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected long _endTime;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.entity.CursedWeapon(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aconst_null
         6: putfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field _playerId:I
        14: aload_0
        15: aconst_null
        16: putfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        19: aload_0
        20: iconst_0
        21: putfield      #21                 // Field _isDropped:Z
        24: aload_0
        25: iconst_0
        26: putfield      #25                 // Field _isActivated:Z
        29: aload_0
        30: iconst_0
        31: putfield      #28                 // Field _playerKarma:I
        34: aload_0
        35: iconst_0
        36: putfield      #31                 // Field _playerPkKills:I
        39: aload_0
        40: iconst_0
        41: putfield      #34                 // Field _nbKills:I
        44: aload_0
        45: iconst_1
        46: putfield      #37                 // Field _currentStage:I
        49: aload_0
        50: iconst_0
        51: putfield      #40                 // Field _numberBeforeNextStage:I
        54: aload_0
        55: iconst_0
        56: putfield      #43                 // Field _hungryTime:I
        59: aload_0
        60: lconst_0
        61: putfield      #46                 // Field _endTime:J
        64: aload_0
        65: aload_1
        66: ldc           #50                 // String name
        68: invokevirtual #52                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        71: putfield      #58                 // Field _name:Ljava/lang/String;
        74: aload_0
        75: aload_1
        76: ldc           #62                 // String id
        78: invokevirtual #64                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        81: putfield      #68                 // Field _itemId:I
        84: aload_0
        85: aload_1
        86: ldc           #71                 // String skillId
        88: invokevirtual #64                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        91: putfield      #73                 // Field _skillId:I
        94: aload_0
        95: aload_1
        96: ldc           #76                 // String dropRate
        98: invokevirtual #64                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       101: putfield      #78                 // Field _dropRate:I
       104: aload_0
       105: aload_1
       106: ldc           #81                 // String dissapearChance
       108: invokevirtual #64                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       111: putfield      #83                 // Field _dissapearChance:I
       114: aload_0
       115: aload_1
       116: ldc           #86                 // String duration
       118: invokevirtual #64                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       121: putfield      #88                 // Field _duration:I
       124: aload_0
       125: aload_1
       126: ldc           #91                 // String durationLost
       128: invokevirtual #64                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       131: putfield      #93                 // Field _durationLost:I
       134: aload_0
       135: aload_1
       136: ldc           #96                 // String stageKills
       138: invokevirtual #64                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       141: putfield      #98                 // Field _stageKills:I
       144: aload_0
       145: invokestatic  #101                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       148: aload_0
       149: getfield      #73                 // Field _skillId:I
       152: invokevirtual #107                // Method ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
       155: putfield      #111                // Field _skillMaxLevel:I
       158: invokestatic  #114                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       161: astore_2
       162: aload_2
       163: ldc           #120                // String SELECT * FROM cursed_weapons WHERE itemId=?
       165: invokeinterface #122,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       170: astore_3
       171: aload_3
       172: iconst_1
       173: aload_0
       174: getfield      #68                 // Field _itemId:I
       177: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       182: aload_3
       183: invokeinterface #134,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       188: astore        4
       190: aload         4
       192: invokeinterface #138,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
       197: ifeq          312
       200: aload_0
       201: aload         4
       203: ldc           #144                // String playerId
       205: invokeinterface #146,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       210: putfield      #13                 // Field _playerId:I
       213: aload_0
       214: aload         4
       216: ldc           #149                // String playerKarma
       218: invokeinterface #146,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       223: putfield      #28                 // Field _playerKarma:I
       226: aload_0
       227: aload         4
       229: ldc           #151                // String playerPkKills
       231: invokeinterface #146,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       236: putfield      #31                 // Field _playerPkKills:I
       239: aload_0
       240: aload         4
       242: ldc           #153                // String nbKills
       244: invokeinterface #146,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       249: putfield      #34                 // Field _nbKills:I
       252: aload_0
       253: aload         4
       255: ldc           #155                // String currentStage
       257: invokeinterface #146,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       262: putfield      #37                 // Field _currentStage:I
       265: aload_0
       266: aload         4
       268: ldc           #157                // String numberBeforeNextStage
       270: invokeinterface #146,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       275: putfield      #40                 // Field _numberBeforeNextStage:I
       278: aload_0
       279: aload         4
       281: ldc           #159                // String hungryTime
       283: invokeinterface #146,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       288: putfield      #43                 // Field _hungryTime:I
       291: aload_0
       292: aload         4
       294: ldc           #161                // String endTime
       296: invokeinterface #163,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       301: putfield      #46                 // Field _endTime:J
       304: aload_0
       305: iconst_0
       306: invokevirtual #167                // Method reActivate:(Z)V
       309: goto          190
       312: aload         4
       314: ifnull        356
       317: aload         4
       319: invokeinterface #171,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       324: goto          356
       327: astore        5
       329: aload         4
       331: ifnull        353
       334: aload         4
       336: invokeinterface #171,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       341: goto          353
       344: astore        6
       346: aload         5
       348: aload         6
       350: invokevirtual #176                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       353: aload         5
       355: athrow
       356: aload_3
       357: ifnull        396
       360: aload_3
       361: invokeinterface #180,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       366: goto          396
       369: astore        4
       371: aload_3
       372: ifnull        393
       375: aload_3
       376: invokeinterface #180,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       381: goto          393
       384: astore        5
       386: aload         4
       388: aload         5
       390: invokevirtual #176                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       393: aload         4
       395: athrow
       396: aload_2
       397: ifnull        433
       400: aload_2
       401: invokeinterface #181,  1          // InterfaceMethod java/sql/Connection.close:()V
       406: goto          433
       409: astore_3
       410: aload_2
       411: ifnull        431
       414: aload_2
       415: invokeinterface #181,  1          // InterfaceMethod java/sql/Connection.close:()V
       420: goto          431
       423: astore        4
       425: aload_3
       426: aload         4
       428: invokevirtual #176                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       431: aload_3
       432: athrow
       433: goto          446
       436: astore_2
       437: getstatic     #184                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       440: ldc           #188                // String Couldn\'t restore cursed weapons data.
       442: aload_2
       443: invokevirtual #190                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       446: return
      Exception table:
         from    to  target type
           190   312   327   Class java/lang/Throwable
           334   341   344   Class java/lang/Throwable
           171   356   369   Class java/lang/Throwable
           375   381   384   Class java/lang/Throwable
           162   396   409   Class java/lang/Throwable
           414   420   423   Class java/lang/Throwable
           158   433   436   Class java/lang/Exception
      LineNumberTable:
        line 110: 0
        line 76: 4
        line 78: 9
        line 79: 14
        line 92: 19
        line 93: 24
        line 99: 29
        line 100: 34
        line 102: 39
        line 103: 44
        line 104: 49
        line 106: 54
        line 107: 59
        line 111: 64
        line 112: 74
        line 113: 84
        line 114: 94
        line 115: 104
        line 116: 114
        line 117: 124
        line 118: 134
        line 120: 144
        line 122: 158
        line 124: 162
        line 126: 171
        line 128: 182
        line 130: 190
        line 132: 200
        line 133: 213
        line 134: 226
        line 135: 239
        line 136: 252
        line 137: 265
        line 138: 278
        line 139: 291
        line 141: 304
        line 143: 312
        line 128: 327
        line 144: 356
        line 124: 369
        line 145: 396
        line 122: 409
        line 149: 433
        line 146: 436
        line 148: 437
        line 150: 446
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          190     166     4    rs   Ljava/sql/ResultSet;
          171     225     3    ps   Ljava/sql/PreparedStatement;
          162     271     2   con   Ljava/sql/Connection;
          437       9     2     e   Ljava/lang/Exception;
            0     447     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
            0     447     1   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 190
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon, class ext/mods/commons/data/StatSet, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 121
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon, class ext/mods/commons/data/StatSet, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon, class ext/mods/commons/data/StatSet, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon, class ext/mods/commons/data/StatSet, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void setPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         5: return
      LineNumberTable:
        line 154: 0
        line 155: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
            0       6     1 player   Lext/mods/gameserver/model/actor/Player;

  public void setItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: return
      LineNumberTable:
        line 159: 0
        line 160: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
            0       6     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isActivated();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _isActivated:Z
         4: ireturn
      LineNumberTable:
        line 164: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public boolean isDropped();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _isDropped:Z
         4: ireturn
      LineNumberTable:
        line 169: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public long getEndTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _endTime:J
         4: lreturn
      LineNumberTable:
        line 174: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public long getDuration();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #88                 // Field _duration:I
         4: i2l
         5: lreturn
      LineNumberTable:
        line 179: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getDurationLost();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _durationLost:I
         4: ireturn
      LineNumberTable:
        line 184: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #58                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 189: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #68                 // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 194: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getSkillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _skillId:I
         4: ireturn
      LineNumberTable:
        line 199: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getPlayerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _playerId:I
         4: ireturn
      LineNumberTable:
        line 204: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public ext.mods.gameserver.model.actor.Player getPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 209: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getPlayerKarma();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _playerKarma:I
         4: ireturn
      LineNumberTable:
        line 214: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getPlayerPkKills();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _playerPkKills:I
         4: ireturn
      LineNumberTable:
        line 219: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getNbKills();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field _nbKills:I
         4: ireturn
      LineNumberTable:
        line 224: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getStageKills();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #98                 // Field _stageKills:I
         4: ireturn
      LineNumberTable:
        line 229: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public boolean isActive();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _isActivated:Z
         4: ifne          14
         7: aload_0
         8: getfield      #21                 // Field _isDropped:Z
        11: ifeq          18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 234: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
      StackMapTable: number_of_entries = 3
        frame_type = 14 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public long getTimeLeft();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _endTime:J
         4: invokestatic  #196                // Method java/lang/System.currentTimeMillis:()J
         7: lsub
         8: lreturn
      LineNumberTable:
        line 239: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getCurrentStage();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _currentStage:I
         4: ireturn
      LineNumberTable:
        line 244: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getNumberBeforeNextStage();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _numberBeforeNextStage:I
         4: ireturn
      LineNumberTable:
        line 249: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public int getHungryTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _hungryTime:I
         4: ireturn
      LineNumberTable:
        line 254: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;

  public void endOfLife();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _isActivated:Z
         4: ifeq          430
         7: aload_0
         8: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: ifnull        130
        14: aload_0
        15: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        18: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        21: ifeq          130
        24: getstatic     #184                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        27: ldc           #207                // String {} is being removed online.
        29: iconst_1
        30: anewarray     #2                  // class java/lang/Object
        33: dup
        34: iconst_0
        35: aload_0
        36: getfield      #58                 // Field _name:Ljava/lang/String;
        39: aastore
        40: invokevirtual #209                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        43: aload_0
        44: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        47: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
        50: invokevirtual #217                // Method ext/mods/gameserver/model/actor/attack/PlayerAttack.stop:()V
        53: aload_0
        54: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        57: aload_0
        58: getfield      #28                 // Field _playerKarma:I
        61: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.setKarma:(I)V
        64: aload_0
        65: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        68: aload_0
        69: getfield      #31                 // Field _playerPkKills:I
        72: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.setPkKills:(I)V
        75: aload_0
        76: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        79: iconst_0
        80: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Player.setCursedWeaponEquippedId:(I)V
        83: aload_0
        84: invokevirtual #232                // Method removeDemonicSkills:()V
        87: aload_0
        88: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        91: aload_0
        92: getfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
        95: iconst_1
        96: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
        99: aload_0
       100: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       103: aload_0
       104: getfield      #68                 // Field _itemId:I
       107: iconst_1
       108: iconst_0
       109: invokevirtual #239                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       112: pop
       113: aload_0
       114: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       117: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       120: aload_0
       121: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       124: invokevirtual #246                // Method ext/mods/gameserver/model/actor/Player.store:()V
       127: goto          525
       130: getstatic     #184                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       133: ldc           #249                // String {} is being removed offline.
       135: iconst_1
       136: anewarray     #2                  // class java/lang/Object
       139: dup
       140: iconst_0
       141: aload_0
       142: getfield      #58                 // Field _name:Ljava/lang/String;
       145: aastore
       146: invokevirtual #209                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       149: invokestatic  #114                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       152: astore_1
       153: aload_1
       154: ldc           #251                // String DELETE FROM items WHERE owner_id=? AND item_id=?
       156: invokeinterface #122,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       161: astore_2
       162: aload_1
       163: ldc           #253                // String UPDATE characters SET karma=?, pkkills=? WHERE obj_Id=?
       165: invokeinterface #122,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       170: astore_3
       171: aload_2
       172: iconst_1
       173: aload_0
       174: getfield      #13                 // Field _playerId:I
       177: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       182: aload_2
       183: iconst_2
       184: aload_0
       185: getfield      #68                 // Field _itemId:I
       188: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       193: aload_2
       194: invokeinterface #255,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       199: iconst_1
       200: if_icmpeq     222
       203: getstatic     #184                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       206: aload_0
       207: getfield      #68                 // Field _itemId:I
       210: aload_0
       211: getfield      #13                 // Field _playerId:I
       214: invokedynamic #259,  0            // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
       219: invokevirtual #263                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       222: aload_3
       223: iconst_1
       224: aload_0
       225: getfield      #28                 // Field _playerKarma:I
       228: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       233: aload_3
       234: iconst_2
       235: aload_0
       236: getfield      #31                 // Field _playerPkKills:I
       239: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       244: aload_3
       245: iconst_3
       246: aload_0
       247: getfield      #13                 // Field _playerId:I
       250: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       255: aload_3
       256: invokeinterface #255,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       261: iconst_1
       262: if_icmpeq     280
       265: getstatic     #184                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       268: aload_0
       269: getfield      #13                 // Field _playerId:I
       272: invokedynamic #267,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       277: invokevirtual #263                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       280: aload_3
       281: ifnull        320
       284: aload_3
       285: invokeinterface #180,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       290: goto          320
       293: astore        4
       295: aload_3
       296: ifnull        317
       299: aload_3
       300: invokeinterface #180,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       305: goto          317
       308: astore        5
       310: aload         4
       312: aload         5
       314: invokevirtual #176                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       317: aload         4
       319: athrow
       320: aload_2
       321: ifnull        357
       324: aload_2
       325: invokeinterface #180,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       330: goto          357
       333: astore_3
       334: aload_2
       335: ifnull        355
       338: aload_2
       339: invokeinterface #180,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       344: goto          355
       347: astore        4
       349: aload_3
       350: aload         4
       352: invokevirtual #176                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       355: aload_3
       356: athrow
       357: aload_1
       358: ifnull        392
       361: aload_1
       362: invokeinterface #181,  1          // InterfaceMethod java/sql/Connection.close:()V
       367: goto          392
       370: astore_2
       371: aload_1
       372: ifnull        390
       375: aload_1
       376: invokeinterface #181,  1          // InterfaceMethod java/sql/Connection.close:()V
       381: goto          390
       384: astore_3
       385: aload_2
       386: aload_3
       387: invokevirtual #176                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       390: aload_2
       391: athrow
       392: goto          525
       395: astore_1
       396: getstatic     #184                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       399: ldc_w         #270                // String Couldn\'t cleanup {} from offline player {}.
       402: aload_1
       403: iconst_2
       404: anewarray     #2                  // class java/lang/Object
       407: dup
       408: iconst_0
       409: aload_0
       410: getfield      #58                 // Field _name:Ljava/lang/String;
       413: aastore
       414: dup
       415: iconst_1
       416: aload_0
       417: getfield      #13                 // Field _playerId:I
       420: invokestatic  #272                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       423: aastore
       424: invokevirtual #278                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       427: goto          525
       430: aload_0
       431: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       434: ifnull        491
       437: aload_0
       438: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       441: invokevirtual #281                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       444: aload_0
       445: getfield      #68                 // Field _itemId:I
       448: invokevirtual #285                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       451: ifnull        491
       454: aload_0
       455: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       458: aload_0
       459: getfield      #68                 // Field _itemId:I
       462: iconst_1
       463: iconst_0
       464: invokevirtual #239                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       467: pop
       468: getstatic     #184                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       471: ldc_w         #291                // String {} has been assimilated.
       474: iconst_1
       475: anewarray     #2                  // class java/lang/Object
       478: dup
       479: iconst_0
       480: aload_0
       481: getfield      #58                 // Field _name:Ljava/lang/String;
       484: aastore
       485: invokevirtual #209                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       488: goto          525
       491: aload_0
       492: getfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
       495: ifnull        525
       498: aload_0
       499: getfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
       502: invokevirtual #293                // Method ext/mods/gameserver/model/item/instance/ItemInstance.decayMe:()V
       505: getstatic     #184                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       508: ldc_w         #298                // String {} has been removed from world.
       511: iconst_1
       512: anewarray     #2                  // class java/lang/Object
       515: dup
       516: iconst_0
       517: aload_0
       518: getfield      #58                 // Field _name:Ljava/lang/String;
       521: aastore
       522: invokevirtual #209                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       525: aload_0
       526: invokevirtual #300                // Method cancelDailyTimer:()V
       529: aload_0
       530: invokevirtual #303                // Method cancelOverallTimer:()V
       533: aload_0
       534: invokevirtual #306                // Method cancelDropTimer:()V
       537: aload_0
       538: invokevirtual #309                // Method removeFromDb:()V
       541: getstatic     #312                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
       544: invokestatic  #318                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       547: aload_0
       548: getfield      #68                 // Field _itemId:I
       551: invokevirtual #324                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       554: invokestatic  #328                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       557: aload_0
       558: aconst_null
       559: putfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       562: aload_0
       563: aconst_null
       564: putfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
       567: aload_0
       568: iconst_0
       569: putfield      #25                 // Field _isActivated:Z
       572: aload_0
       573: iconst_0
       574: putfield      #21                 // Field _isDropped:Z
       577: aload_0
       578: iconst_0
       579: putfield      #34                 // Field _nbKills:I
       582: aload_0
       583: iconst_1
       584: putfield      #37                 // Field _currentStage:I
       587: aload_0
       588: iconst_0
       589: putfield      #40                 // Field _numberBeforeNextStage:I
       592: aload_0
       593: iconst_0
       594: putfield      #43                 // Field _hungryTime:I
       597: aload_0
       598: lconst_0
       599: putfield      #46                 // Field _endTime:J
       602: aload_0
       603: iconst_0
       604: putfield      #13                 // Field _playerId:I
       607: aload_0
       608: iconst_0
       609: putfield      #28                 // Field _playerKarma:I
       612: aload_0
       613: iconst_0
       614: putfield      #31                 // Field _playerPkKills:I
       617: return
      Exception table:
         from    to  target type
           171   280   293   Class java/lang/Throwable
           299   305   308   Class java/lang/Throwable
           162   320   333   Class java/lang/Throwable
           338   344   347   Class java/lang/Throwable
           153   357   370   Class java/lang/Throwable
           375   381   384   Class java/lang/Throwable
           149   392   395   Class java/lang/Exception
      LineNumberTable:
        line 269: 0
        line 271: 7
        line 273: 24
        line 275: 43
        line 277: 53
        line 278: 64
        line 279: 75
        line 280: 83
        line 282: 87
        line 283: 99
        line 285: 113
        line 287: 120
        line 291: 130
        line 293: 149
        line 294: 153
        line 295: 162
        line 297: 171
        line 298: 182
        line 299: 193
        line 300: 203
        line 302: 222
        line 303: 233
        line 304: 244
        line 305: 255
        line 306: 265
        line 307: 280
        line 293: 293
        line 307: 320
        line 293: 333
        line 307: 357
        line 293: 370
        line 311: 392
        line 308: 395
        line 310: 396
        line 311: 427
        line 314: 430
        line 316: 454
        line 317: 468
        line 319: 491
        line 321: 498
        line 322: 505
        line 325: 525
        line 326: 529
        line 327: 533
        line 329: 537
        line 331: 541
        line 333: 557
        line 334: 562
        line 336: 567
        line 337: 572
        line 339: 577
        line 340: 582
        line 341: 587
        line 343: 592
        line 344: 597
        line 346: 602
        line 347: 607
        line 348: 612
        line 349: 617
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          171     149     3    ps   Ljava/sql/PreparedStatement;
          162     195     2   del   Ljava/sql/PreparedStatement;
          153     239     1   con   Ljava/sql/Connection;
          396      31     1     e   Ljava/lang/Exception;
            0     618     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
      StackMapTable: number_of_entries = 19
        frame_type = 251 /* same_frame_extended */
          offset_delta = 130
        frame_type = 254 /* append */
          offset_delta = 91
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement ]
        frame_type = 57 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 34 /* same */
        frame_type = 60 /* same */
        frame_type = 33 /* same */

  public void cursedOnLogin();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: getstatic     #398                // Field ext/mods/gameserver/network/SystemMessageId.S2_OWNER_HAS_LOGGED_INTO_THE_S1_REGION:Lext/mods/gameserver/network/SystemMessageId;
         3: invokestatic  #318                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
         6: aload_0
         7: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        10: invokevirtual #373                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        13: invokevirtual #377                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addZoneName:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        16: aload_0
        17: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        20: invokevirtual #401                // Method ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
        23: invokevirtual #324                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        26: astore_1
        27: aload_1
        28: invokestatic  #328                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        31: aload_0
        32: invokevirtual #404                // Method getTimeLeft:()J
        35: ldc2_w        #407                // long 60000l
        38: ldiv
        39: l2i
        40: istore_2
        41: getstatic     #409                // Field ext/mods/gameserver/network/SystemMessageId.S2_MINUTE_OF_USAGE_TIME_ARE_LEFT_FOR_S1:Lext/mods/gameserver/network/SystemMessageId;
        44: invokestatic  #318                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        47: aload_0
        48: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        51: invokevirtual #401                // Method ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
        54: invokevirtual #324                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        57: iload_2
        58: invokevirtual #412                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        61: astore_1
        62: aload_0
        63: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        66: aload_1
        67: invokevirtual #415                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        70: return
      LineNumberTable:
        line 440: 0
        line 441: 27
        line 443: 31
        line 444: 41
        line 445: 62
        line 446: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
           27      44     1    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
           41      30     2 timeLeft   I

  public void giveDemonicSkills();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=1
         0: invokestatic  #101                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
         3: aload_0
         4: getfield      #73                 // Field _skillId:I
         7: aload_0
         8: getfield      #37                 // Field _currentStage:I
        11: invokevirtual #418                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        14: astore_1
        15: aload_1
        16: ifnull        47
        19: aload_0
        20: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        23: aload_1
        24: iconst_0
        25: invokevirtual #422                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
        28: pop
        29: aload_0
        30: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        33: new           #426                // class ext/mods/gameserver/network/serverpackets/SkillList
        36: dup
        37: aload_0
        38: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        41: invokespecial #428                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        44: invokevirtual #415                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        47: return
      LineNumberTable:
        line 453: 0
        line 454: 15
        line 456: 19
        line 457: 29
        line 459: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
           15      33     1 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/skills/L2Skill ]

  public void reActivate(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: iload_1
         1: ifeq          56
         4: aload_0
         5: aload_0
         6: getfield      #93                 // Field _durationLost:I
         9: bipush        60
        11: imul
        12: putfield      #43                 // Field _hungryTime:I
        15: aload_0
        16: invokestatic  #196                // Method java/lang/System.currentTimeMillis:()J
        19: aload_0
        20: getfield      #88                 // Field _duration:I
        23: i2l
        24: ldc2_w        #362                // long 3600000l
        27: lmul
        28: ladd
        29: putfield      #46                 // Field _endTime:J
        32: aload_0
        33: new           #435                // class ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer
        36: dup
        37: aload_0
        38: invokespecial #437                // Method ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer."<init>":(Lext/mods/gameserver/model/entity/CursedWeapon;)V
        41: ldc2_w        #407                // long 60000l
        44: ldc2_w        #407                // long 60000l
        47: invokestatic  #438                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        50: putfield      #344                // Field _overallTimer:Ljava/util/concurrent/ScheduledFuture;
        53: goto          123
        56: aload_0
        57: iconst_1
        58: putfield      #25                 // Field _isActivated:Z
        61: aload_0
        62: getfield      #46                 // Field _endTime:J
        65: invokestatic  #196                // Method java/lang/System.currentTimeMillis:()J
        68: lsub
        69: lconst_0
        70: lcmp
        71: ifgt          81
        74: aload_0
        75: invokevirtual #442                // Method endOfLife:()V
        78: goto          123
        81: aload_0
        82: new           #445                // class ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer
        85: dup
        86: aload_0
        87: invokespecial #447                // Method ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer."<init>":(Lext/mods/gameserver/model/entity/CursedWeapon;)V
        90: ldc2_w        #407                // long 60000l
        93: ldc2_w        #407                // long 60000l
        96: invokestatic  #438                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        99: putfield      #334                // Field _dailyTimer:Ljava/util/concurrent/ScheduledFuture;
       102: aload_0
       103: new           #435                // class ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer
       106: dup
       107: aload_0
       108: invokespecial #437                // Method ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer."<init>":(Lext/mods/gameserver/model/entity/CursedWeapon;)V
       111: ldc2_w        #407                // long 60000l
       114: ldc2_w        #407                // long 60000l
       117: invokestatic  #438                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       120: putfield      #344                // Field _overallTimer:Ljava/util/concurrent/ScheduledFuture;
       123: return
      LineNumberTable:
        line 473: 0
        line 475: 4
        line 476: 15
        line 478: 32
        line 482: 56
        line 484: 61
        line 485: 74
        line 488: 81
        line 489: 102
        line 492: 123
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     124     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
            0     124     1 fromZero   Z
      StackMapTable: number_of_entries = 3
        frame_type = 56 /* same */
        frame_type = 24 /* same */
        frame_type = 41 /* same */

  public boolean checkDrop(ext.mods.gameserver.model.actor.Attackable, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=3
         0: ldc_w         #448                // int 1000000
         3: invokestatic  #449                // Method ext/mods/commons/random/Rnd.get:(I)I
         6: aload_0
         7: getfield      #78                 // Field _dropRate:I
        10: if_icmpge     77
        13: aload_0
        14: aload_1
        15: aload_2
        16: invokevirtual #454                // Method dropFromMob:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/actor/Player;)V
        19: aload_0
        20: invokestatic  #196                // Method java/lang/System.currentTimeMillis:()J
        23: aload_0
        24: getfield      #88                 // Field _duration:I
        27: i2l
        28: ldc2_w        #362                // long 3600000l
        31: lmul
        32: ladd
        33: putfield      #46                 // Field _endTime:J
        36: aload_0
        37: new           #435                // class ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer
        40: dup
        41: aload_0
        42: invokespecial #437                // Method ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer."<init>":(Lext/mods/gameserver/model/entity/CursedWeapon;)V
        45: ldc2_w        #407                // long 60000l
        48: ldc2_w        #407                // long 60000l
        51: invokestatic  #438                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        54: putfield      #344                // Field _overallTimer:Ljava/util/concurrent/ScheduledFuture;
        57: aload_0
        58: new           #357                // class ext/mods/gameserver/model/entity/CursedWeapon$DropTimer
        61: dup
        62: aload_0
        63: invokespecial #359                // Method ext/mods/gameserver/model/entity/CursedWeapon$DropTimer."<init>":(Lext/mods/gameserver/model/entity/CursedWeapon;)V
        66: ldc2_w        #362                // long 3600000l
        69: invokestatic  #364                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        72: putfield      #347                // Field _dropTimer:Ljava/util/concurrent/ScheduledFuture;
        75: iconst_1
        76: ireturn
        77: iconst_0
        78: ireturn
      LineNumberTable:
        line 502: 0
        line 504: 13
        line 506: 19
        line 507: 36
        line 508: 57
        line 510: 75
        line 512: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
            0      79     1 attackable   Lext/mods/gameserver/model/actor/Attackable;
            0      79     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 251 /* same_frame_extended */
          offset_delta = 77

  public void activate(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=3
         0: aload_1
         1: invokevirtual #458                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
         4: ifeq          11
         7: aload_1
         8: invokevirtual #461                // Method ext/mods/gameserver/model/actor/Player.dismount:()V
        11: aload_0
        12: iconst_1
        13: putfield      #25                 // Field _isActivated:Z
        16: aload_0
        17: aload_1
        18: putfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        21: aload_0
        22: aload_0
        23: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        26: invokevirtual #464                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        29: putfield      #13                 // Field _playerId:I
        32: aload_0
        33: aload_0
        34: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        37: invokevirtual #467                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        40: putfield      #28                 // Field _playerKarma:I
        43: aload_0
        44: aload_0
        45: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        48: invokevirtual #470                // Method ext/mods/gameserver/model/actor/Player.getPkKills:()I
        51: putfield      #31                 // Field _playerPkKills:I
        54: aload_0
        55: aload_2
        56: putfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
        59: aload_0
        60: aload_0
        61: getfield      #98                 // Field _stageKills:I
        64: i2d
        65: ldc2_w        #473                // double 0.5d
        68: dmul
        69: invokestatic  #475                // Method java/lang/Math.round:(D)J
        72: l2i
        73: aload_0
        74: getfield      #98                 // Field _stageKills:I
        77: i2d
        78: ldc2_w        #481                // double 1.5d
        81: dmul
        82: invokestatic  #475                // Method java/lang/Math.round:(D)J
        85: l2i
        86: invokestatic  #483                // Method ext/mods/commons/random/Rnd.get:(II)I
        89: putfield      #40                 // Field _numberBeforeNextStage:I
        92: aload_0
        93: aload_0
        94: getfield      #93                 // Field _durationLost:I
        97: bipush        60
        99: imul
       100: putfield      #43                 // Field _hungryTime:I
       103: aload_0
       104: new           #445                // class ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer
       107: dup
       108: aload_0
       109: invokespecial #447                // Method ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer."<init>":(Lext/mods/gameserver/model/entity/CursedWeapon;)V
       112: ldc2_w        #407                // long 60000l
       115: ldc2_w        #407                // long 60000l
       118: invokestatic  #438                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       121: putfield      #334                // Field _dailyTimer:Ljava/util/concurrent/ScheduledFuture;
       124: aload_0
       125: invokevirtual #306                // Method cancelDropTimer:()V
       128: invokestatic  #114                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       131: astore_3
       132: aload_3
       133: ldc_w         #486                // String INSERT INTO cursed_weapons (itemId, playerId, playerKarma, playerPkKills, nbKills, currentStage, numberBeforeNextStage, hungryTime, endTime) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
       136: invokeinterface #122,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       141: astore        4
       143: aload         4
       145: iconst_1
       146: aload_0
       147: getfield      #68                 // Field _itemId:I
       150: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       155: aload         4
       157: iconst_2
       158: aload_0
       159: getfield      #13                 // Field _playerId:I
       162: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       167: aload         4
       169: iconst_3
       170: aload_0
       171: getfield      #28                 // Field _playerKarma:I
       174: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       179: aload         4
       181: iconst_4
       182: aload_0
       183: getfield      #31                 // Field _playerPkKills:I
       186: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       191: aload         4
       193: iconst_5
       194: aload_0
       195: getfield      #34                 // Field _nbKills:I
       198: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       203: aload         4
       205: bipush        6
       207: aload_0
       208: getfield      #37                 // Field _currentStage:I
       211: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       216: aload         4
       218: bipush        7
       220: aload_0
       221: getfield      #40                 // Field _numberBeforeNextStage:I
       224: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       229: aload         4
       231: bipush        8
       233: aload_0
       234: getfield      #43                 // Field _hungryTime:I
       237: invokeinterface #128,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       242: aload         4
       244: bipush        9
       246: aload_0
       247: getfield      #46                 // Field _endTime:J
       250: invokeinterface #488,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       255: aload         4
       257: invokeinterface #255,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       262: pop
       263: aload         4
       265: ifnull        307
       268: aload         4
       270: invokeinterface #180,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       275: goto          307
       278: astore        5
       280: aload         4
       282: ifnull        304
       285: aload         4
       287: invokeinterface #180,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       292: goto          304
       295: astore        6
       297: aload         5
       299: aload         6
       301: invokevirtual #176                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       304: aload         5
       306: athrow
       307: aload_3
       308: ifnull        347
       311: aload_3
       312: invokeinterface #181,  1          // InterfaceMethod java/sql/Connection.close:()V
       317: goto          347
       320: astore        4
       322: aload_3
       323: ifnull        344
       326: aload_3
       327: invokeinterface #181,  1          // InterfaceMethod java/sql/Connection.close:()V
       332: goto          344
       335: astore        5
       337: aload         4
       339: aload         5
       341: invokevirtual #176                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       344: aload         4
       346: athrow
       347: goto          361
       350: astore_3
       351: getstatic     #184                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       354: ldc_w         #492                // String Failed to insert cursed weapon data.
       357: aload_3
       358: invokevirtual #190                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       361: aload_0
       362: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       365: aload_0
       366: getfield      #68                 // Field _itemId:I
       369: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Player.setCursedWeaponEquippedId:(I)V
       372: aload_0
       373: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       376: ldc_w         #494                // int 9999999
       379: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.setKarma:(I)V
       382: aload_0
       383: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       386: iconst_0
       387: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.setPkKills:(I)V
       390: aload_0
       391: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       394: invokevirtual #495                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       397: ifeq          417
       400: aload_0
       401: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       404: invokevirtual #498                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       407: aload_0
       408: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       411: getstatic     #502                // Field ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
       414: invokevirtual #508                // Method ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
       417: aload_0
       418: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       421: invokevirtual #514                // Method ext/mods/gameserver/model/actor/Player.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
       424: astore_3
       425: aload_3
       426: arraylength
       427: istore        4
       429: iconst_0
       430: istore        5
       432: iload         5
       434: iload         4
       436: if_icmpge     467
       439: aload_3
       440: iload         5
       442: aaload
       443: astore        6
       445: aload         6
       447: invokevirtual #518                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       450: invokevirtual #524                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       453: ifeq          461
       456: aload         6
       458: invokevirtual #529                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       461: iinc          5, 1
       464: goto          432
       467: aload_0
       468: invokevirtual #532                // Method giveDemonicSkills:()V
       471: aload_0
       472: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       475: aload_0
       476: getfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
       479: iconst_1
       480: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       483: aload_0
       484: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       487: invokevirtual #535                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       490: invokevirtual #539                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
       493: aload_0
       494: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       497: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       500: aload_0
       501: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       504: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       507: getstatic     #548                // Field ext/mods/gameserver/enums/actors/MissionType.CURSED_WEAPON:Lext/mods/gameserver/enums/actors/MissionType;
       510: invokevirtual #554                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       513: aload_0
       514: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       517: getstatic     #409                // Field ext/mods/gameserver/network/SystemMessageId.S2_MINUTE_OF_USAGE_TIME_ARE_LEFT_FOR_S1:Lext/mods/gameserver/network/SystemMessageId;
       520: invokestatic  #318                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       523: aload_0
       524: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       527: invokevirtual #401                // Method ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
       530: invokevirtual #324                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       533: aload_0
       534: invokevirtual #404                // Method getTimeLeft:()J
       537: ldc2_w        #407                // long 60000l
       540: ldiv
       541: l2i
       542: invokevirtual #412                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       545: invokevirtual #415                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       548: getstatic     #560                // Field ext/mods/gameserver/network/SystemMessageId.THE_OWNER_OF_S2_HAS_APPEARED_IN_THE_S1_REGION:Lext/mods/gameserver/network/SystemMessageId;
       551: invokestatic  #318                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       554: aload_0
       555: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       558: invokevirtual #373                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       561: invokevirtual #377                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addZoneName:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       564: aload_0
       565: getfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
       568: invokevirtual #563                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       571: invokevirtual #324                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       574: invokestatic  #328                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       577: return
      Exception table:
         from    to  target type
           143   263   278   Class java/lang/Throwable
           285   292   295   Class java/lang/Throwable
           132   307   320   Class java/lang/Throwable
           326   332   335   Class java/lang/Throwable
           128   347   350   Class java/lang/Exception
      LineNumberTable:
        line 524: 0
        line 525: 7
        line 527: 11
        line 529: 16
        line 530: 21
        line 531: 32
        line 532: 43
        line 534: 54
        line 536: 59
        line 538: 92
        line 540: 103
        line 542: 124
        line 544: 128
        line 546: 132
        line 548: 143
        line 549: 155
        line 550: 167
        line 551: 179
        line 552: 191
        line 553: 203
        line 554: 216
        line 555: 229
        line 556: 242
        line 557: 255
        line 558: 263
        line 546: 278
        line 559: 307
        line 544: 320
        line 563: 347
        line 560: 350
        line 562: 351
        line 565: 361
        line 566: 372
        line 567: 382
        line 569: 390
        line 570: 400
        line 572: 417
        line 574: 445
        line 575: 456
        line 572: 461
        line 578: 467
        line 580: 471
        line 582: 483
        line 584: 493
        line 586: 500
        line 588: 513
        line 589: 548
        line 590: 577
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          143     164     4    ps   Ljava/sql/PreparedStatement;
          132     215     3   con   Ljava/sql/Connection;
          351      10     3     e   Ljava/lang/Exception;
          445      16     6 effect   Lext/mods/gameserver/skills/AbstractEffect;
            0     578     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
            0     578     1 player   Lext/mods/gameserver/model/actor/Player;
            0     578     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 15
        frame_type = 11 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 266
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 55 /* same */
        frame_type = 254 /* append */
          offset_delta = 14
          locals = [ class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int ]
        frame_type = 28 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public void dropIt(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: bipush        100
         2: invokestatic  #449                // Method ext/mods/commons/random/Rnd.get:(I)I
         5: aload_0
         6: getfield      #83                 // Field _dissapearChance:I
         9: if_icmpgt     19
        12: aload_0
        13: invokevirtual #442                // Method endOfLife:()V
        16: goto          24
        19: aload_0
        20: aload_1
        21: invokevirtual #570                // Method dropFromPlayer:(Lext/mods/gameserver/model/actor/Creature;)V
        24: return
      LineNumberTable:
        line 617: 0
        line 618: 12
        line 620: 19
        line 621: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
            0      25     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 4 /* same */

  public void increaseKills();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        143
         7: aload_0
         8: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        14: ifeq          143
        17: aload_0
        18: dup
        19: getfield      #34                 // Field _nbKills:I
        22: iconst_1
        23: iadd
        24: putfield      #34                 // Field _nbKills:I
        27: aload_0
        28: aload_0
        29: getfield      #93                 // Field _durationLost:I
        32: bipush        60
        34: imul
        35: putfield      #43                 // Field _hungryTime:I
        38: aload_0
        39: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        42: aload_0
        43: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        46: invokevirtual #470                // Method ext/mods/gameserver/model/actor/Player.getPkKills:()I
        49: iconst_1
        50: iadd
        51: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.setPkKills:(I)V
        54: aload_0
        55: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        58: new           #573                // class ext/mods/gameserver/network/serverpackets/UserInfo
        61: dup
        62: aload_0
        63: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        66: invokespecial #575                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        69: invokevirtual #415                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        72: aload_0
        73: getfield      #34                 // Field _nbKills:I
        76: aload_0
        77: getfield      #40                 // Field _numberBeforeNextStage:I
        80: if_icmplt     125
        83: aload_0
        84: iconst_0
        85: putfield      #34                 // Field _nbKills:I
        88: aload_0
        89: aload_0
        90: getfield      #98                 // Field _stageKills:I
        93: i2d
        94: ldc2_w        #473                // double 0.5d
        97: dmul
        98: invokestatic  #475                // Method java/lang/Math.round:(D)J
       101: l2i
       102: aload_0
       103: getfield      #98                 // Field _stageKills:I
       106: i2d
       107: ldc2_w        #481                // double 1.5d
       110: dmul
       111: invokestatic  #475                // Method java/lang/Math.round:(D)J
       114: l2i
       115: invokestatic  #483                // Method ext/mods/commons/random/Rnd.get:(II)I
       118: putfield      #40                 // Field _numberBeforeNextStage:I
       121: aload_0
       122: invokevirtual #576                // Method rankUp:()V
       125: aload_0
       126: dup
       127: getfield      #46                 // Field _endTime:J
       130: aload_0
       131: getfield      #93                 // Field _durationLost:I
       134: i2l
       135: ldc2_w        #407                // long 60000l
       138: lmul
       139: lsub
       140: putfield      #46                 // Field _endTime:J
       143: return
      LineNumberTable:
        line 628: 0
        line 630: 17
        line 631: 27
        line 633: 38
        line 634: 54
        line 636: 72
        line 638: 83
        line 640: 88
        line 642: 121
        line 645: 125
        line 647: 143
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     144     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
      StackMapTable: number_of_entries = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 125
        frame_type = 17 /* same */

  public void rankUp();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _currentStage:I
         4: aload_0
         5: getfield      #111                // Field _skillMaxLevel:I
         8: if_icmplt     12
        11: return
        12: aload_0
        13: dup
        14: getfield      #37                 // Field _currentStage:I
        17: iconst_1
        18: iadd
        19: putfield      #37                 // Field _currentStage:I
        22: aload_0
        23: invokevirtual #532                // Method giveDemonicSkills:()V
        26: aload_0
        27: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        30: new           #579                // class ext/mods/gameserver/network/serverpackets/SocialAction
        33: dup
        34: aload_0
        35: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        38: bipush        17
        40: invokespecial #581                // Method ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
        43: invokevirtual #584                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        46: return
      LineNumberTable:
        line 654: 0
        line 655: 11
        line 657: 12
        line 659: 22
        line 661: 26
        line 662: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
      StackMapTable: number_of_entries = 1
        frame_type = 12 /* same */

  public void teleportTo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #25                 // Field _isActivated:Z
         9: ifeq          42
        12: aload_1
        13: aload_0
        14: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        17: invokevirtual #587                // Method ext/mods/gameserver/model/actor/Player.getX:()I
        20: aload_0
        21: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        24: invokevirtual #590                // Method ext/mods/gameserver/model/actor/Player.getY:()I
        27: aload_0
        28: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        31: invokevirtual #593                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        34: iconst_0
        35: invokevirtual #596                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        38: pop
        39: goto          92
        42: aload_0
        43: getfield      #21                 // Field _isDropped:Z
        46: ifeq          79
        49: aload_1
        50: aload_0
        51: getfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
        54: invokevirtual #600                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getX:()I
        57: aload_0
        58: getfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
        61: invokevirtual #601                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getY:()I
        64: aload_0
        65: getfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
        68: invokevirtual #602                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getZ:()I
        71: iconst_0
        72: invokevirtual #596                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        75: pop
        76: goto          92
        79: aload_1
        80: aload_0
        81: getfield      #58                 // Field _name:Ljava/lang/String;
        84: invokedynamic #603,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        89: invokevirtual #605                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        92: return
      LineNumberTable:
        line 666: 0
        line 667: 4
        line 669: 5
        line 670: 12
        line 671: 42
        line 672: 49
        line 674: 79
        line 675: 92
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      93     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
            0      93     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 5 /* same */
        frame_type = 36 /* same */
        frame_type = 36 /* same */
        frame_type = 12 /* same */

  public ext.mods.gameserver.model.location.Location getWorldPosition();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _isActivated:Z
         4: ifeq          22
         7: aload_0
         8: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: ifnull        22
        14: aload_0
        15: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        18: invokevirtual #373                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        21: areturn
        22: aload_0
        23: getfield      #21                 // Field _isDropped:Z
        26: ifeq          44
        29: aload_0
        30: getfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
        33: ifnull        44
        36: aload_0
        37: getfield      #7                  // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
        40: invokevirtual #609                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        43: areturn
        44: aconst_null
        45: areturn
      LineNumberTable:
        line 679: 0
        line 680: 14
        line 682: 22
        line 683: 36
        line 685: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/entity/CursedWeapon;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 21 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #191                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/entity/CursedWeapon
         6: invokevirtual #610                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #616                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #184                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 64: 0
}
SourceFile: "CursedWeapon.java"
NestMembers:
  ext/mods/gameserver/model/entity/CursedWeapon$DropTimer
  ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer
  ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer
BootstrapMethods:
  0: #703 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #697 Error while deleting itemId \u0001 from userId \u0001
  1: #703 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #699 Error while updating karma & pkkills for userId \u0001
  2: #703 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #701 \u0001 isn\'t in the world.
InnerClasses:
  public static final #717= #713 of #715; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
