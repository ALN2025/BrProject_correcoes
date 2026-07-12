// Bytecode for: ext.mods.gameserver.model.CharSelectSlot
// File: ext\mods\gameserver\model\CharSelectSlot.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/CharSelectSlot.class
  Last modified 9 de jul de 2026; size 9152 bytes
  MD5 checksum 15f4c7a2ca559b2b7657c29719c4fd39
  Compiled from "CharSelectSlot.java"
public class ext.mods.gameserver.model.CharSelectSlot
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #9                          // ext/mods/gameserver/model/CharSelectSlot
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 33, methods: 64, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Integer            199546
    #8 = Fieldref           #9.#10        // ext/mods/gameserver/model/CharSelectSlot._charId:I
    #9 = Class              #11           // ext/mods/gameserver/model/CharSelectSlot
   #10 = NameAndType        #12:#13       // _charId:I
   #11 = Utf8               ext/mods/gameserver/model/CharSelectSlot
   #12 = Utf8               _charId
   #13 = Utf8               I
   #14 = Fieldref           #9.#15        // ext/mods/gameserver/model/CharSelectSlot._exp:J
   #15 = NameAndType        #16:#17       // _exp:J
   #16 = Utf8               _exp
   #17 = Utf8               J
   #18 = Fieldref           #9.#19        // ext/mods/gameserver/model/CharSelectSlot._sp:I
   #19 = NameAndType        #20:#13       // _sp:I
   #20 = Utf8               _sp
   #21 = Fieldref           #9.#22        // ext/mods/gameserver/model/CharSelectSlot._clanId:I
   #22 = NameAndType        #23:#13       // _clanId:I
   #23 = Utf8               _clanId
   #24 = Fieldref           #9.#25        // ext/mods/gameserver/model/CharSelectSlot._race:I
   #25 = NameAndType        #26:#13       // _race:I
   #26 = Utf8               _race
   #27 = Fieldref           #9.#28        // ext/mods/gameserver/model/CharSelectSlot._classId:I
   #28 = NameAndType        #29:#13       // _classId:I
   #29 = Utf8               _classId
   #30 = Fieldref           #9.#31        // ext/mods/gameserver/model/CharSelectSlot._baseClassId:I
   #31 = NameAndType        #32:#13       // _baseClassId:I
   #32 = Utf8               _baseClassId
   #33 = Fieldref           #9.#34        // ext/mods/gameserver/model/CharSelectSlot._deleteTimer:J
   #34 = NameAndType        #35:#17       // _deleteTimer:J
   #35 = Utf8               _deleteTimer
   #36 = Fieldref           #9.#37        // ext/mods/gameserver/model/CharSelectSlot._lastAccess:J
   #37 = NameAndType        #38:#17       // _lastAccess:J
   #38 = Utf8               _lastAccess
   #39 = Fieldref           #9.#40        // ext/mods/gameserver/model/CharSelectSlot._face:I
   #40 = NameAndType        #41:#13       // _face:I
   #41 = Utf8               _face
   #42 = Fieldref           #9.#43        // ext/mods/gameserver/model/CharSelectSlot._hairStyle:I
   #43 = NameAndType        #44:#13       // _hairStyle:I
   #44 = Utf8               _hairStyle
   #45 = Fieldref           #9.#46        // ext/mods/gameserver/model/CharSelectSlot._hairColor:I
   #46 = NameAndType        #47:#13       // _hairColor:I
   #47 = Utf8               _hairColor
   #48 = Fieldref           #9.#49        // ext/mods/gameserver/model/CharSelectSlot._sex:I
   #49 = NameAndType        #50:#13       // _sex:I
   #50 = Utf8               _sex
   #51 = Fieldref           #9.#52        // ext/mods/gameserver/model/CharSelectSlot._level:I
   #52 = NameAndType        #53:#13       // _level:I
   #53 = Utf8               _level
   #54 = Fieldref           #9.#55        // ext/mods/gameserver/model/CharSelectSlot._maxHp:I
   #55 = NameAndType        #56:#13       // _maxHp:I
   #56 = Utf8               _maxHp
   #57 = Fieldref           #9.#58        // ext/mods/gameserver/model/CharSelectSlot._currentHp:D
   #58 = NameAndType        #59:#60       // _currentHp:D
   #59 = Utf8               _currentHp
   #60 = Utf8               D
   #61 = Fieldref           #9.#62        // ext/mods/gameserver/model/CharSelectSlot._maxMp:I
   #62 = NameAndType        #63:#13       // _maxMp:I
   #63 = Utf8               _maxMp
   #64 = Fieldref           #9.#65        // ext/mods/gameserver/model/CharSelectSlot._currentMp:D
   #65 = NameAndType        #66:#60       // _currentMp:D
   #66 = Utf8               _currentMp
   #67 = Fieldref           #9.#68        // ext/mods/gameserver/model/CharSelectSlot._karma:I
   #68 = NameAndType        #69:#13       // _karma:I
   #69 = Utf8               _karma
   #70 = Fieldref           #9.#71        // ext/mods/gameserver/model/CharSelectSlot._pkKills:I
   #71 = NameAndType        #72:#13       // _pkKills:I
   #72 = Utf8               _pkKills
   #73 = Fieldref           #9.#74        // ext/mods/gameserver/model/CharSelectSlot._pvpKills:I
   #74 = NameAndType        #75:#13       // _pvpKills:I
   #75 = Utf8               _pvpKills
   #76 = Fieldref           #9.#77        // ext/mods/gameserver/model/CharSelectSlot._augmentationId:I
   #77 = NameAndType        #78:#13       // _augmentationId:I
   #78 = Utf8               _augmentationId
   #79 = Fieldref           #9.#80        // ext/mods/gameserver/model/CharSelectSlot._x:I
   #80 = NameAndType        #81:#13       // _x:I
   #81 = Utf8               _x
   #82 = Fieldref           #9.#83        // ext/mods/gameserver/model/CharSelectSlot._y:I
   #83 = NameAndType        #84:#13       // _y:I
   #84 = Utf8               _y
   #85 = Fieldref           #9.#86        // ext/mods/gameserver/model/CharSelectSlot._z:I
   #86 = NameAndType        #87:#13       // _z:I
   #87 = Utf8               _z
   #88 = Fieldref           #9.#89        // ext/mods/gameserver/model/CharSelectSlot._accessLevel:I
   #89 = NameAndType        #90:#13       // _accessLevel:I
   #90 = Utf8               _accessLevel
   #91 = Fieldref           #9.#92        // ext/mods/gameserver/model/CharSelectSlot._objectId:I
   #92 = NameAndType        #93:#13       // _objectId:I
   #93 = Utf8               _objectId
   #94 = Fieldref           #9.#95        // ext/mods/gameserver/model/CharSelectSlot._name:Ljava/lang/String;
   #95 = NameAndType        #96:#97       // _name:Ljava/lang/String;
   #96 = Utf8               _name
   #97 = Utf8               Ljava/lang/String;
   #98 = Methodref          #9.#99        // ext/mods/gameserver/model/CharSelectSlot.restoreVisibleInventory:(I)[[I
   #99 = NameAndType        #100:#101     // restoreVisibleInventory:(I)[[I
  #100 = Utf8               restoreVisibleInventory
  #101 = Utf8               (I)[[I
  #102 = Fieldref           #9.#103       // ext/mods/gameserver/model/CharSelectSlot._paperdoll:[[I
  #103 = NameAndType        #104:#105     // _paperdoll:[[I
  #104 = Utf8               _paperdoll
  #105 = Utf8               [[I
  #106 = Methodref          #107.#108     // ext/mods/gameserver/enums/Paperdoll.getId:()I
  #107 = Class              #109          // ext/mods/gameserver/enums/Paperdoll
  #108 = NameAndType        #110:#111     // getId:()I
  #109 = Utf8               ext/mods/gameserver/enums/Paperdoll
  #110 = Utf8               getId
  #111 = Utf8               ()I
  #112 = Fieldref           #107.#113     // ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
  #113 = NameAndType        #114:#115     // RHAND:Lext/mods/gameserver/enums/Paperdoll;
  #114 = Utf8               RHAND
  #115 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
  #116 = Class              #105          // "[[I"
  #117 = Methodref          #118.#119     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #118 = Class              #120          // ext/mods/commons/pool/ConnectionPool
  #119 = NameAndType        #121:#122     // getConnection:()Ljava/sql/Connection;
  #120 = Utf8               ext/mods/commons/pool/ConnectionPool
  #121 = Utf8               getConnection
  #122 = Utf8               ()Ljava/sql/Connection;
  #123 = String             #124          // SELECT object_id,item_id,loc_data,enchant_level FROM items WHERE owner_id=? AND loc=\'PAPERDOLL\'
  #124 = Utf8               SELECT object_id,item_id,loc_data,enchant_level FROM items WHERE owner_id=? AND loc=\'PAPERDOLL\'
  #125 = InterfaceMethodref #126.#127     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #126 = Class              #128          // java/sql/Connection
  #127 = NameAndType        #129:#130     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #128 = Utf8               java/sql/Connection
  #129 = Utf8               prepareStatement
  #130 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #131 = InterfaceMethodref #132.#133     // java/sql/PreparedStatement.setInt:(II)V
  #132 = Class              #134          // java/sql/PreparedStatement
  #133 = NameAndType        #135:#136     // setInt:(II)V
  #134 = Utf8               java/sql/PreparedStatement
  #135 = Utf8               setInt
  #136 = Utf8               (II)V
  #137 = InterfaceMethodref #132.#138     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #138 = NameAndType        #139:#140     // executeQuery:()Ljava/sql/ResultSet;
  #139 = Utf8               executeQuery
  #140 = Utf8               ()Ljava/sql/ResultSet;
  #141 = InterfaceMethodref #142.#143     // java/sql/ResultSet.next:()Z
  #142 = Class              #144          // java/sql/ResultSet
  #143 = NameAndType        #145:#146     // next:()Z
  #144 = Utf8               java/sql/ResultSet
  #145 = Utf8               next
  #146 = Utf8               ()Z
  #147 = String             #148          // loc_data
  #148 = Utf8               loc_data
  #149 = InterfaceMethodref #142.#150     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #150 = NameAndType        #151:#152     // getInt:(Ljava/lang/String;)I
  #151 = Utf8               getInt
  #152 = Utf8               (Ljava/lang/String;)I
  #153 = String             #154          // object_id
  #154 = Utf8               object_id
  #155 = String             #156          // item_id
  #156 = Utf8               item_id
  #157 = String             #158          // enchant_level
  #158 = Utf8               enchant_level
  #159 = InterfaceMethodref #142.#160     // java/sql/ResultSet.close:()V
  #160 = NameAndType        #161:#6       // close:()V
  #161 = Utf8               close
  #162 = Class              #163          // java/lang/Throwable
  #163 = Utf8               java/lang/Throwable
  #164 = Methodref          #162.#165     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #165 = NameAndType        #166:#167     // addSuppressed:(Ljava/lang/Throwable;)V
  #166 = Utf8               addSuppressed
  #167 = Utf8               (Ljava/lang/Throwable;)V
  #168 = InterfaceMethodref #132.#160     // java/sql/PreparedStatement.close:()V
  #169 = InterfaceMethodref #126.#160     // java/sql/Connection.close:()V
  #170 = Class              #171          // java/lang/Exception
  #171 = Utf8               java/lang/Exception
  #172 = Fieldref           #9.#173       // ext/mods/gameserver/model/CharSelectSlot.LOGGER:Lext/mods/commons/logging/CLogger;
  #173 = NameAndType        #174:#175     // LOGGER:Lext/mods/commons/logging/CLogger;
  #174 = Utf8               LOGGER
  #175 = Utf8               Lext/mods/commons/logging/CLogger;
  #176 = String             #177          // Couldn\'t restore paperdolls for {}.
  #177 = Utf8               Couldn\'t restore paperdolls for {}.
  #178 = Methodref          #179.#180     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #179 = Class              #181          // java/lang/Integer
  #180 = NameAndType        #182:#183     // valueOf:(I)Ljava/lang/Integer;
  #181 = Utf8               java/lang/Integer
  #182 = Utf8               valueOf
  #183 = Utf8               (I)Ljava/lang/Integer;
  #184 = Methodref          #185.#186     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #185 = Class              #187          // ext/mods/commons/logging/CLogger
  #186 = NameAndType        #188:#189     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #187 = Utf8               ext/mods/commons/logging/CLogger
  #188 = Utf8               error
  #189 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #190 = Fieldref           #9.#191       // ext/mods/gameserver/model/CharSelectSlot._armorSkin:Lext/mods/dressme/holder/DressMeHolder;
  #191 = NameAndType        #192:#193     // _armorSkin:Lext/mods/dressme/holder/DressMeHolder;
  #192 = Utf8               _armorSkin
  #193 = Utf8               Lext/mods/dressme/holder/DressMeHolder;
  #194 = Fieldref           #9.#195       // ext/mods/gameserver/model/CharSelectSlot._weaponSkin:Lext/mods/dressme/holder/DressMeHolder;
  #195 = NameAndType        #196:#193     // _weaponSkin:Lext/mods/dressme/holder/DressMeHolder;
  #196 = Utf8               _weaponSkin
  #197 = Methodref          #198.#199     // java/lang/Class.getName:()Ljava/lang/String;
  #198 = Class              #200          // java/lang/Class
  #199 = NameAndType        #201:#202     // getName:()Ljava/lang/String;
  #200 = Utf8               java/lang/Class
  #201 = Utf8               getName
  #202 = Utf8               ()Ljava/lang/String;
  #203 = Methodref          #185.#204     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #204 = NameAndType        #5:#205       // "<init>":(Ljava/lang/String;)V
  #205 = Utf8               (Ljava/lang/String;)V
  #206 = Utf8               RESTORE_PAPERDOLLS
  #207 = Utf8               ConstantValue
  #208 = Utf8               (ILjava/lang/String;)V
  #209 = Utf8               Code
  #210 = Utf8               LineNumberTable
  #211 = Utf8               LocalVariableTable
  #212 = Utf8               this
  #213 = Utf8               Lext/mods/gameserver/model/CharSelectSlot;
  #214 = Utf8               objectId
  #215 = Utf8               name
  #216 = Utf8               getObjectId
  #217 = Utf8               getAccessLevel
  #218 = Utf8               setAccessLevel
  #219 = Utf8               (I)V
  #220 = Utf8               level
  #221 = Utf8               getCharId
  #222 = Utf8               setCharId
  #223 = Utf8               charId
  #224 = Utf8               getClanId
  #225 = Utf8               setClanId
  #226 = Utf8               clanId
  #227 = Utf8               getClassId
  #228 = Utf8               setClassId
  #229 = Utf8               classId
  #230 = Utf8               getBaseClassId
  #231 = Utf8               setBaseClassId
  #232 = Utf8               baseClassId
  #233 = Utf8               getCurrentHp
  #234 = Utf8               ()D
  #235 = Utf8               setCurrentHp
  #236 = Utf8               (D)V
  #237 = Utf8               currentHp
  #238 = Utf8               getCurrentMp
  #239 = Utf8               setCurrentMp
  #240 = Utf8               currentMp
  #241 = Utf8               getDeleteTimer
  #242 = Utf8               ()J
  #243 = Utf8               setDeleteTimer
  #244 = Utf8               (J)V
  #245 = Utf8               deleteTimer
  #246 = Utf8               getLastAccess
  #247 = Utf8               setLastAccess
  #248 = Utf8               lastAccess
  #249 = Utf8               getExp
  #250 = Utf8               setExp
  #251 = Utf8               exp
  #252 = Utf8               getFace
  #253 = Utf8               setFace
  #254 = Utf8               face
  #255 = Utf8               getHairColor
  #256 = Utf8               setHairColor
  #257 = Utf8               hairColor
  #258 = Utf8               getHairStyle
  #259 = Utf8               setHairStyle
  #260 = Utf8               hairStyle
  #261 = Utf8               getPaperdollObjectId
  #262 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)I
  #263 = Utf8               slot
  #264 = Utf8               getPaperdollItemId
  #265 = Utf8               getLevel
  #266 = Utf8               setLevel
  #267 = Utf8               getMaxHp
  #268 = Utf8               setMaxHp
  #269 = Utf8               maxHp
  #270 = Utf8               getMaxMp
  #271 = Utf8               setMaxMp
  #272 = Utf8               maxMp
  #273 = Utf8               getRace
  #274 = Utf8               setRace
  #275 = Utf8               race
  #276 = Utf8               getSex
  #277 = Utf8               setSex
  #278 = Utf8               sex
  #279 = Utf8               getSp
  #280 = Utf8               setSp
  #281 = Utf8               sp
  #282 = Utf8               getEnchantEffect
  #283 = Utf8               getKarma
  #284 = Utf8               setKarma
  #285 = Utf8               k
  #286 = Utf8               getAugmentationId
  #287 = Utf8               setAugmentationId
  #288 = Utf8               augmentationId
  #289 = Utf8               getPkKills
  #290 = Utf8               setPkKills
  #291 = Utf8               pkKills
  #292 = Utf8               getPvpKills
  #293 = Utf8               setPvpKills
  #294 = Utf8               pvpKills
  #295 = Utf8               getX
  #296 = Utf8               setX
  #297 = Utf8               x
  #298 = Utf8               getY
  #299 = Utf8               setY
  #300 = Utf8               y
  #301 = Utf8               getZ
  #302 = Utf8               setZ
  #303 = Utf8               z
  #304 = Utf8               rs
  #305 = Utf8               Ljava/sql/ResultSet;
  #306 = Utf8               ps
  #307 = Utf8               Ljava/sql/PreparedStatement;
  #308 = Utf8               con
  #309 = Utf8               Ljava/sql/Connection;
  #310 = Utf8               e
  #311 = Utf8               Ljava/lang/Exception;
  #312 = Utf8               paperdoll
  #313 = Utf8               StackMapTable
  #314 = Utf8               getArmorSkin
  #315 = Utf8               ()Lext/mods/dressme/holder/DressMeHolder;
  #316 = Utf8               setArmorSkin
  #317 = Utf8               (Lext/mods/dressme/holder/DressMeHolder;)V
  #318 = Utf8               skin
  #319 = Utf8               getWeaponSkin
  #320 = Utf8               setWeaponSkin
  #321 = Utf8               <clinit>
  #322 = Utf8               SourceFile
  #323 = Utf8               CharSelectSlot.java
{
  public ext.mods.gameserver.model.CharSelectSlot(int, java.lang.String);
    descriptor: (ILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: ldc           #7                  // int 199546
         7: putfield      #8                  // Field _charId:I
        10: aload_0
        11: lconst_0
        12: putfield      #14                 // Field _exp:J
        15: aload_0
        16: iconst_0
        17: putfield      #18                 // Field _sp:I
        20: aload_0
        21: iconst_0
        22: putfield      #21                 // Field _clanId:I
        25: aload_0
        26: iconst_0
        27: putfield      #24                 // Field _race:I
        30: aload_0
        31: iconst_0
        32: putfield      #27                 // Field _classId:I
        35: aload_0
        36: iconst_0
        37: putfield      #30                 // Field _baseClassId:I
        40: aload_0
        41: lconst_0
        42: putfield      #33                 // Field _deleteTimer:J
        45: aload_0
        46: lconst_0
        47: putfield      #36                 // Field _lastAccess:J
        50: aload_0
        51: iconst_0
        52: putfield      #39                 // Field _face:I
        55: aload_0
        56: iconst_0
        57: putfield      #42                 // Field _hairStyle:I
        60: aload_0
        61: iconst_0
        62: putfield      #45                 // Field _hairColor:I
        65: aload_0
        66: iconst_0
        67: putfield      #48                 // Field _sex:I
        70: aload_0
        71: iconst_1
        72: putfield      #51                 // Field _level:I
        75: aload_0
        76: iconst_0
        77: putfield      #54                 // Field _maxHp:I
        80: aload_0
        81: dconst_0
        82: putfield      #57                 // Field _currentHp:D
        85: aload_0
        86: iconst_0
        87: putfield      #61                 // Field _maxMp:I
        90: aload_0
        91: dconst_0
        92: putfield      #64                 // Field _currentMp:D
        95: aload_0
        96: iconst_0
        97: putfield      #67                 // Field _karma:I
       100: aload_0
       101: iconst_0
       102: putfield      #70                 // Field _pkKills:I
       105: aload_0
       106: iconst_0
       107: putfield      #73                 // Field _pvpKills:I
       110: aload_0
       111: iconst_0
       112: putfield      #76                 // Field _augmentationId:I
       115: aload_0
       116: iconst_0
       117: putfield      #79                 // Field _x:I
       120: aload_0
       121: iconst_0
       122: putfield      #82                 // Field _y:I
       125: aload_0
       126: iconst_0
       127: putfield      #85                 // Field _z:I
       130: aload_0
       131: iconst_0
       132: putfield      #88                 // Field _accessLevel:I
       135: aload_0
       136: iload_1
       137: putfield      #91                 // Field _objectId:I
       140: aload_0
       141: aload_2
       142: putfield      #94                 // Field _name:Ljava/lang/String;
       145: aload_0
       146: iload_1
       147: invokestatic  #98                 // Method restoreVisibleInventory:(I)[[I
       150: putfield      #102                // Field _paperdoll:[[I
       153: return
      LineNumberTable:
        line 74: 0
        line 43: 4
        line 44: 10
        line 45: 15
        line 46: 20
        line 47: 25
        line 48: 30
        line 49: 35
        line 50: 40
        line 51: 45
        line 52: 50
        line 53: 55
        line 54: 60
        line 55: 65
        line 56: 70
        line 57: 75
        line 58: 80
        line 59: 85
        line 60: 90
        line 62: 95
        line 63: 100
        line 64: 105
        line 65: 110
        line 66: 115
        line 67: 120
        line 68: 125
        line 69: 130
        line 75: 135
        line 76: 140
        line 77: 145
        line 78: 153
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     154     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0     154     1 objectId   I
            0     154     2  name   Ljava/lang/String;

  public int getObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #91                 // Field _objectId:I
         4: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public int getAccessLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #88                 // Field _accessLevel:I
         4: ireturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setAccessLevel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #88                 // Field _accessLevel:I
         5: return
      LineNumberTable:
        line 92: 0
        line 93: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 level   I

  public int getCharId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #8                  // Field _charId:I
         4: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setCharId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #8                  // Field _charId:I
         5: return
      LineNumberTable:
        line 102: 0
        line 103: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 charId   I

  public int getClanId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _clanId:I
         4: ireturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setClanId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #21                 // Field _clanId:I
         5: return
      LineNumberTable:
        line 112: 0
        line 113: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 clanId   I

  public int getClassId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _classId:I
         4: ireturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setClassId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #27                 // Field _classId:I
         5: return
      LineNumberTable:
        line 122: 0
        line 123: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 classId   I

  public int getBaseClassId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _baseClassId:I
         4: ireturn
      LineNumberTable:
        line 127: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setBaseClassId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #30                 // Field _baseClassId:I
         5: return
      LineNumberTable:
        line 132: 0
        line 133: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 baseClassId   I

  public double getCurrentHp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field _currentHp:D
         4: dreturn
      LineNumberTable:
        line 137: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setCurrentHp(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: putfield      #57                 // Field _currentHp:D
         5: return
      LineNumberTable:
        line 142: 0
        line 143: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 currentHp   D

  public double getCurrentMp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #64                 // Field _currentMp:D
         4: dreturn
      LineNumberTable:
        line 147: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setCurrentMp(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: putfield      #64                 // Field _currentMp:D
         5: return
      LineNumberTable:
        line 152: 0
        line 153: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 currentMp   D

  public long getDeleteTimer();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _deleteTimer:J
         4: lreturn
      LineNumberTable:
        line 157: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setDeleteTimer(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #33                 // Field _deleteTimer:J
         5: return
      LineNumberTable:
        line 162: 0
        line 163: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 deleteTimer   J

  public long getLastAccess();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field _lastAccess:J
         4: lreturn
      LineNumberTable:
        line 167: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setLastAccess(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #36                 // Field _lastAccess:J
         5: return
      LineNumberTable:
        line 172: 0
        line 173: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 lastAccess   J

  public long getExp();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field _exp:J
         4: lreturn
      LineNumberTable:
        line 177: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setExp(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #14                 // Field _exp:J
         5: return
      LineNumberTable:
        line 182: 0
        line 183: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1   exp   J

  public int getFace();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _face:I
         4: ireturn
      LineNumberTable:
        line 187: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setFace(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #39                 // Field _face:I
         5: return
      LineNumberTable:
        line 192: 0
        line 193: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1  face   I

  public int getHairColor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field _hairColor:I
         4: ireturn
      LineNumberTable:
        line 197: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setHairColor(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #45                 // Field _hairColor:I
         5: return
      LineNumberTable:
        line 202: 0
        line 203: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 hairColor   I

  public int getHairStyle();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _hairStyle:I
         4: ireturn
      LineNumberTable:
        line 207: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setHairStyle(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #42                 // Field _hairStyle:I
         5: return
      LineNumberTable:
        line 212: 0
        line 213: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 hairStyle   I

  public int getPaperdollObjectId(ext.mods.gameserver.enums.Paperdoll);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #102                // Field _paperdoll:[[I
         4: aload_1
         5: invokevirtual #106                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
         8: aaload
         9: iconst_0
        10: iaload
        11: ireturn
      LineNumberTable:
        line 217: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0      12     1  slot   Lext/mods/gameserver/enums/Paperdoll;

  public int getPaperdollItemId(ext.mods.gameserver.enums.Paperdoll);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #102                // Field _paperdoll:[[I
         4: aload_1
         5: invokevirtual #106                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
         8: aaload
         9: iconst_1
        10: iaload
        11: ireturn
      LineNumberTable:
        line 222: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0      12     1  slot   Lext/mods/gameserver/enums/Paperdoll;

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 227: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setLevel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #51                 // Field _level:I
         5: return
      LineNumberTable:
        line 232: 0
        line 233: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 level   I

  public int getMaxHp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #54                 // Field _maxHp:I
         4: ireturn
      LineNumberTable:
        line 237: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setMaxHp(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #54                 // Field _maxHp:I
         5: return
      LineNumberTable:
        line 242: 0
        line 243: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 maxHp   I

  public int getMaxMp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #61                 // Field _maxMp:I
         4: ireturn
      LineNumberTable:
        line 247: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setMaxMp(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #61                 // Field _maxMp:I
         5: return
      LineNumberTable:
        line 252: 0
        line 253: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 maxMp   I

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #94                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 257: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public int getRace();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _race:I
         4: ireturn
      LineNumberTable:
        line 262: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setRace(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #24                 // Field _race:I
         5: return
      LineNumberTable:
        line 267: 0
        line 268: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1  race   I

  public int getSex();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _sex:I
         4: ireturn
      LineNumberTable:
        line 272: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setSex(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #48                 // Field _sex:I
         5: return
      LineNumberTable:
        line 277: 0
        line 278: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1   sex   I

  public int getSp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _sp:I
         4: ireturn
      LineNumberTable:
        line 282: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setSp(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #18                 // Field _sp:I
         5: return
      LineNumberTable:
        line 287: 0
        line 288: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1    sp   I

  public int getEnchantEffect();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #102                // Field _paperdoll:[[I
         4: getstatic     #112                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
         7: invokevirtual #106                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
        10: aaload
        11: iconst_2
        12: iaload
        13: ireturn
      LineNumberTable:
        line 292: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public int getKarma();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #67                 // Field _karma:I
         4: ireturn
      LineNumberTable:
        line 297: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setKarma(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #67                 // Field _karma:I
         5: return
      LineNumberTable:
        line 302: 0
        line 303: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1     k   I

  public int getAugmentationId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #76                 // Field _augmentationId:I
         4: ireturn
      LineNumberTable:
        line 307: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setAugmentationId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #76                 // Field _augmentationId:I
         5: return
      LineNumberTable:
        line 312: 0
        line 313: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 augmentationId   I

  public int getPkKills();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #70                 // Field _pkKills:I
         4: ireturn
      LineNumberTable:
        line 317: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setPkKills(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #70                 // Field _pkKills:I
         5: return
      LineNumberTable:
        line 322: 0
        line 323: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 pkKills   I

  public int getPvpKills();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _pvpKills:I
         4: ireturn
      LineNumberTable:
        line 327: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setPvpKills(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #73                 // Field _pvpKills:I
         5: return
      LineNumberTable:
        line 332: 0
        line 333: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1 pvpKills   I

  public int getX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #79                 // Field _x:I
         4: ireturn
      LineNumberTable:
        line 337: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setX(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #79                 // Field _x:I
         5: return
      LineNumberTable:
        line 342: 0
        line 343: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1     x   I

  public int getY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #82                 // Field _y:I
         4: ireturn
      LineNumberTable:
        line 347: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setY(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #82                 // Field _y:I
         5: return
      LineNumberTable:
        line 352: 0
        line 353: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1     y   I

  public int getZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #85                 // Field _z:I
         4: ireturn
      LineNumberTable:
        line 357: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setZ(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #85                 // Field _z:I
         5: return
      LineNumberTable:
        line 362: 0
        line 363: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1     z   I

  public ext.mods.dressme.holder.DressMeHolder getArmorSkin();
    descriptor: ()Lext/mods/dressme/holder/DressMeHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #190                // Field _armorSkin:Lext/mods/dressme/holder/DressMeHolder;
         4: areturn
      LineNumberTable:
        line 395: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setArmorSkin(ext.mods.dressme.holder.DressMeHolder);
    descriptor: (Lext/mods/dressme/holder/DressMeHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #190                // Field _armorSkin:Lext/mods/dressme/holder/DressMeHolder;
         5: return
      LineNumberTable:
        line 400: 0
        line 401: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1  skin   Lext/mods/dressme/holder/DressMeHolder;

  public ext.mods.dressme.holder.DressMeHolder getWeaponSkin();
    descriptor: ()Lext/mods/dressme/holder/DressMeHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #194                // Field _weaponSkin:Lext/mods/dressme/holder/DressMeHolder;
         4: areturn
      LineNumberTable:
        line 405: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/CharSelectSlot;

  public void setWeaponSkin(ext.mods.dressme.holder.DressMeHolder);
    descriptor: (Lext/mods/dressme/holder/DressMeHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #194                // Field _weaponSkin:Lext/mods/dressme/holder/DressMeHolder;
         5: return
      LineNumberTable:
        line 410: 0
        line 411: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/CharSelectSlot;
            0       6     1  skin   Lext/mods/dressme/holder/DressMeHolder;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #185                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #9                  // class ext/mods/gameserver/model/CharSelectSlot
         6: invokevirtual #197                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #203                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #172                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "CharSelectSlot.java"
