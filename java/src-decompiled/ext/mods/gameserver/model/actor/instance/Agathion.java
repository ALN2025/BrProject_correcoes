// Bytecode for: ext.mods.gameserver.model.actor.instance.Agathion
// File: ext\mods\gameserver\model\actor\instance\Agathion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Agathion.class
  Last modified 9 de jul de 2026; size 12488 bytes
  MD5 checksum 2b1ac9b1d47f3aa8be0fd8baeca8ad88
  Compiled from "Agathion.java"
public class ext.mods.gameserver.model.actor.instance.Agathion extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/Agathion
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 7, methods: 16, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/instance/Agathion.lastCheckPostionTime:J
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/Agathion
    #9 = NameAndType        #11:#12       // lastCheckPostionTime:J
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/Agathion
   #11 = Utf8               lastCheckPostionTime
   #12 = Utf8               J
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/instance/Agathion.lastRandomAnimationTime:J
   #14 = NameAndType        #15:#12       // lastRandomAnimationTime:J
   #15 = Utf8               lastRandomAnimationTime
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/actor/instance/Agathion.lastHealTime:J
   #17 = NameAndType        #18:#12       // lastHealTime:J
   #18 = Utf8               lastHealTime
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/actor/instance/Agathion._lastPlayerInstanceId:I
   #20 = NameAndType        #21:#22       // _lastPlayerInstanceId:I
   #21 = Utf8               _lastPlayerInstanceId
   #22 = Utf8               I
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/actor/instance/Agathion._player:Lext/mods/gameserver/model/actor/Player;
   #24 = NameAndType        #25:#26       // _player:Lext/mods/gameserver/model/actor/Player;
   #25 = Utf8               _player
   #26 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/actor/instance/Agathion._itemId:I
   #28 = NameAndType        #29:#22       // _itemId:I
   #29 = Utf8               _itemId
   #30 = Methodref          #2.#31        // ext/mods/gameserver/model/actor/instance/Folk.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #31 = NameAndType        #32:#33       // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #32 = Utf8               doDie
   #33 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #34 = Methodref          #8.#35        // ext/mods/gameserver/model/actor/instance/Agathion.setInvul:(Z)V
   #35 = NameAndType        #36:#37       // setInvul:(Z)V
   #36 = Utf8               setInvul
   #37 = Utf8               (Z)V
   #38 = Methodref          #8.#39        // ext/mods/gameserver/model/actor/instance/Agathion.start:()V
   #39 = NameAndType        #40:#41       // start:()V
   #40 = Utf8               start
   #41 = Utf8               ()V
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/actor/Player.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
   #43 = Class              #45           // ext/mods/gameserver/model/actor/Player
   #44 = NameAndType        #46:#47       // getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
   #45 = Utf8               ext/mods/gameserver/model/actor/Player
   #46 = Utf8               getInstanceMap
   #47 = Utf8               ()Lext/mods/InstanceMap/MapInstance;
   #48 = Methodref          #49.#50       // ext/mods/InstanceMap/MapInstance.getId:()I
   #49 = Class              #51           // ext/mods/InstanceMap/MapInstance
   #50 = NameAndType        #52:#53       // getId:()I
   #51 = Utf8               ext/mods/InstanceMap/MapInstance
   #52 = Utf8               getId
   #53 = Utf8               ()I
   #54 = Methodref          #55.#56       // java/lang/Math.random:()D
   #55 = Class              #57           // java/lang/Math
   #56 = NameAndType        #58:#59       // random:()D
   #57 = Utf8               java/lang/Math
   #58 = Utf8               random
   #59 = Utf8               ()D
   #60 = Double             360.0d
   #62 = Methodref          #55.#63       // java/lang/Math.toRadians:(D)D
   #63 = NameAndType        #64:#65       // toRadians:(D)D
   #64 = Utf8               toRadians
   #65 = Utf8               (D)D
   #66 = Methodref          #55.#67       // java/lang/Math.cos:(D)D
   #67 = NameAndType        #68:#65       // cos:(D)D
   #68 = Utf8               cos
   #69 = Double             20.0d
   #71 = Methodref          #55.#72       // java/lang/Math.sin:(D)D
   #72 = NameAndType        #73:#65       // sin:(D)D
   #73 = Utf8               sin
   #74 = Class              #75           // ext/mods/gameserver/model/location/Location
   #75 = Utf8               ext/mods/gameserver/model/location/Location
   #76 = Methodref          #43.#77       // ext/mods/gameserver/model/actor/Player.getX:()I
   #77 = NameAndType        #78:#53       // getX:()I
   #78 = Utf8               getX
   #79 = Methodref          #43.#80       // ext/mods/gameserver/model/actor/Player.getY:()I
   #80 = NameAndType        #81:#53       // getY:()I
   #81 = Utf8               getY
   #82 = Methodref          #43.#83       // ext/mods/gameserver/model/actor/Player.getZ:()I
   #83 = NameAndType        #84:#53       // getZ:()I
   #84 = Utf8               getZ
   #85 = Methodref          #74.#86       // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #86 = NameAndType        #5:#87        // "<init>":(III)V
   #87 = Utf8               (III)V
   #88 = Methodref          #8.#89        // ext/mods/gameserver/model/actor/instance/Agathion.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #89 = NameAndType        #90:#91       // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #90 = Utf8               teleportTo
   #91 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
   #92 = Methodref          #8.#93        // ext/mods/gameserver/model/actor/instance/Agathion.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #93 = NameAndType        #94:#95       // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #94 = Utf8               getAI
   #95 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #96 = Methodref          #97.#98       // ext/mods/gameserver/model/actor/ai/type/NpcAI.setFollowStatus:(Z)V
   #97 = Class              #99           // ext/mods/gameserver/model/actor/ai/type/NpcAI
   #98 = NameAndType        #100:#37      // setFollowStatus:(Z)V
   #99 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
  #100 = Utf8               setFollowStatus
  #101 = Methodref          #8.#102       // ext/mods/gameserver/model/actor/instance/Agathion.thinking:()V
  #102 = NameAndType        #103:#41      // thinking:()V
  #103 = Utf8               thinking
  #104 = Methodref          #8.#105       // ext/mods/gameserver/model/actor/instance/Agathion.stop:()V
  #105 = NameAndType        #106:#41      // stop:()V
  #106 = Utf8               stop
  #107 = Methodref          #8.#108       // ext/mods/gameserver/model/actor/instance/Agathion.decayMe:()V
  #108 = NameAndType        #109:#41      // decayMe:()V
  #109 = Utf8               decayMe
  #110 = Methodref          #8.#111       // ext/mods/gameserver/model/actor/instance/Agathion.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
  #111 = NameAndType        #112:#113     // setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
  #112 = Utf8               setInstanceMap
  #113 = Utf8               (Lext/mods/InstanceMap/MapInstance;Z)V
  #114 = Double             30.0d
  #116 = Methodref          #8.#44        // ext/mods/gameserver/model/actor/instance/Agathion.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
  #117 = Double             25.0d
  #119 = Fieldref           #8.#120       // ext/mods/gameserver/model/actor/instance/Agathion._task:Ljava/util/concurrent/ScheduledFuture;
  #120 = NameAndType        #121:#122     // _task:Ljava/util/concurrent/ScheduledFuture;
  #121 = Utf8               _task
  #122 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #123 = Methodref          #124.#125     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #124 = Class              #126          // ext/mods/gameserver/model/World
  #125 = NameAndType        #127:#128     // getInstance:()Lext/mods/gameserver/model/World;
  #126 = Utf8               ext/mods/gameserver/model/World
  #127 = Utf8               getInstance
  #128 = Utf8               ()Lext/mods/gameserver/model/World;
  #129 = Methodref          #43.#130      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #130 = NameAndType        #131:#53      // getObjectId:()I
  #131 = Utf8               getObjectId
  #132 = Methodref          #124.#133     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #133 = NameAndType        #134:#135     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #134 = Utf8               getPlayer
  #135 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #136 = Methodref          #43.#137      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #137 = NameAndType        #138:#139     // isOnline:()Z
  #138 = Utf8               isOnline
  #139 = Utf8               ()Z
  #140 = Methodref          #43.#141      // ext/mods/gameserver/model/actor/Player.getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
  #141 = NameAndType        #142:#143     // getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
  #142 = Utf8               getCurrentAgation
  #143 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Agathion;
  #144 = Methodref          #43.#145      // ext/mods/gameserver/model/actor/Player.deletedAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
  #145 = NameAndType        #146:#147     // deletedAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
  #146 = Utf8               deletedAgation
  #147 = Utf8               (Lext/mods/gameserver/model/actor/instance/Agathion;)V
  #148 = Methodref          #43.#149      // ext/mods/gameserver/model/actor/Player.setCurrentAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
  #149 = NameAndType        #150:#147     // setCurrentAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
  #150 = Utf8               setCurrentAgation
  #151 = Methodref          #8.#152       // ext/mods/gameserver/model/actor/instance/Agathion.deleteMe:()V
  #152 = NameAndType        #153:#41      // deleteMe:()V
  #153 = Utf8               deleteMe
  #154 = Methodref          #8.#155       // ext/mods/gameserver/model/actor/instance/Agathion.checkInstanceChange:()V
  #155 = NameAndType        #156:#41      // checkInstanceChange:()V
  #156 = Utf8               checkInstanceChange
  #157 = Methodref          #8.#158       // ext/mods/gameserver/model/actor/instance/Agathion.moviment:()V
  #158 = NameAndType        #159:#41      // moviment:()V
  #159 = Utf8               moviment
  #160 = Methodref          #8.#161       // ext/mods/gameserver/model/actor/instance/Agathion.animationRandom:()V
  #161 = NameAndType        #162:#41      // animationRandom:()V
  #162 = Utf8               animationRandom
  #163 = Methodref          #8.#164       // ext/mods/gameserver/model/actor/instance/Agathion.heal:()V
  #164 = NameAndType        #165:#41      // heal:()V
  #165 = Utf8               heal
  #166 = Methodref          #167.#168     // ext/mods/Crypta/AgathionData.getInstance:()Lext/mods/Crypta/AgathionData;
  #167 = Class              #169          // ext/mods/Crypta/AgathionData
  #168 = NameAndType        #127:#170     // getInstance:()Lext/mods/Crypta/AgathionData;
  #169 = Utf8               ext/mods/Crypta/AgathionData
  #170 = Utf8               ()Lext/mods/Crypta/AgathionData;
  #171 = String             #172          // AgathionData não está disponível.
  #172 = Utf8               AgathionData não está disponível.
  #173 = Methodref          #43.#174      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #174 = NameAndType        #175:#176     // sendMessage:(Ljava/lang/String;)V
  #175 = Utf8               sendMessage
  #176 = Utf8               (Ljava/lang/String;)V
  #177 = Methodref          #167.#178     // ext/mods/Crypta/AgathionData.getAgathionsByItemId:(I)Ljava/util/List;
  #178 = NameAndType        #179:#180     // getAgathionsByItemId:(I)Ljava/util/List;
  #179 = Utf8               getAgathionsByItemId
  #180 = Utf8               (I)Ljava/util/List;
  #181 = Class              #182          // java/lang/Exception
  #182 = Utf8               java/lang/Exception
  #183 = String             #184          // Erro ao acessar dados do Agathion.
  #184 = Utf8               Erro ao acessar dados do Agathion.
  #185 = Methodref          #181.#186     // java/lang/Exception.printStackTrace:()V
  #186 = NameAndType        #187:#41      // printStackTrace:()V
  #187 = Utf8               printStackTrace
  #188 = InterfaceMethodref #189.#190     // java/util/List.isEmpty:()Z
  #189 = Class              #191          // java/util/List
  #190 = NameAndType        #192:#139     // isEmpty:()Z
  #191 = Utf8               java/util/List
  #192 = Utf8               isEmpty
  #193 = String             #194          // No Agathion is associated with this item.
  #194 = Utf8               No Agathion is associated with this item.
  #195 = InterfaceMethodref #189.#196     // java/util/List.iterator:()Ljava/util/Iterator;
  #196 = NameAndType        #197:#198     // iterator:()Ljava/util/Iterator;
  #197 = Utf8               iterator
  #198 = Utf8               ()Ljava/util/Iterator;
  #199 = InterfaceMethodref #200.#201     // java/util/Iterator.hasNext:()Z
  #200 = Class              #202          // java/util/Iterator
  #201 = NameAndType        #203:#139     // hasNext:()Z
  #202 = Utf8               java/util/Iterator
  #203 = Utf8               hasNext
  #204 = InterfaceMethodref #200.#205     // java/util/Iterator.next:()Ljava/lang/Object;
  #205 = NameAndType        #206:#207     // next:()Ljava/lang/Object;
  #206 = Utf8               next
  #207 = Utf8               ()Ljava/lang/Object;
  #208 = Class              #209          // ext/mods/aghation/holder/AgathionHolder
  #209 = Utf8               ext/mods/aghation/holder/AgathionHolder
  #210 = Methodref          #211.#212     // java/lang/System.currentTimeMillis:()J
  #211 = Class              #213          // java/lang/System
  #212 = NameAndType        #214:#215     // currentTimeMillis:()J
  #213 = Utf8               java/lang/System
  #214 = Utf8               currentTimeMillis
  #215 = Utf8               ()J
  #216 = Fieldref           #217.#218     // java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
  #217 = Class              #219          // java/util/concurrent/TimeUnit
  #218 = NameAndType        #220:#221     // SECONDS:Ljava/util/concurrent/TimeUnit;
  #219 = Utf8               java/util/concurrent/TimeUnit
  #220 = Utf8               SECONDS
  #221 = Utf8               Ljava/util/concurrent/TimeUnit;
  #222 = Methodref          #208.#223     // ext/mods/aghation/holder/AgathionHolder.getHealDelay:()I
  #223 = NameAndType        #224:#53      // getHealDelay:()I
  #224 = Utf8               getHealDelay
  #225 = Methodref          #217.#226     // java/util/concurrent/TimeUnit.toMillis:(J)J
  #226 = NameAndType        #227:#228     // toMillis:(J)J
  #227 = Utf8               toMillis
  #228 = Utf8               (J)J
  #229 = Methodref          #208.#230     // ext/mods/aghation/holder/AgathionHolder.getHealAmount:()I
  #230 = NameAndType        #231:#53      // getHealAmount:()I
  #231 = Utf8               getHealAmount
  #232 = Methodref          #43.#233      // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #233 = NameAndType        #234:#139     // isInOlympiadMode:()Z
  #234 = Utf8               isInOlympiadMode
  #235 = Methodref          #43.#236      // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
  #236 = NameAndType        #237:#139     // isAlikeDead:()Z
  #237 = Utf8               isAlikeDead
  #238 = Methodref          #43.#239      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #239 = NameAndType        #240:#139     // isDead:()Z
  #240 = Utf8               isDead
  #241 = Methodref          #43.#242      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #242 = NameAndType        #243:#244     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #243 = Utf8               getStatus
  #244 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #245 = Methodref          #246.#247     // ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
  #246 = Class              #248          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #247 = NameAndType        #249:#59      // getCp:()D
  #248 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #249 = Utf8               getCp
  #250 = Methodref          #246.#251     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
  #251 = NameAndType        #252:#53      // getMaxCp:()I
  #252 = Utf8               getMaxCp
  #253 = Methodref          #55.#254      // java/lang/Math.min:(DD)D
  #254 = NameAndType        #255:#256     // min:(DD)D
  #255 = Utf8               min
  #256 = Utf8               (DD)D
  #257 = Methodref          #246.#258     // ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
  #258 = NameAndType        #259:#260     // setCp:(D)V
  #259 = Utf8               setCp
  #260 = Utf8               (D)V
  #261 = Class              #262          // ext/mods/gameserver/network/serverpackets/StatusUpdate
  #262 = Utf8               ext/mods/gameserver/network/serverpackets/StatusUpdate
  #263 = Methodref          #261.#264     // ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #264 = NameAndType        #5:#265       // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #265 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #266 = Fieldref           #267.#268     // ext/mods/gameserver/enums/StatusType.CUR_CP:Lext/mods/gameserver/enums/StatusType;
  #267 = Class              #269          // ext/mods/gameserver/enums/StatusType
  #268 = NameAndType        #270:#271     // CUR_CP:Lext/mods/gameserver/enums/StatusType;
  #269 = Utf8               ext/mods/gameserver/enums/StatusType
  #270 = Utf8               CUR_CP
  #271 = Utf8               Lext/mods/gameserver/enums/StatusType;
  #272 = Methodref          #261.#273     // ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #273 = NameAndType        #274:#275     // addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #274 = Utf8               addAttribute
  #275 = Utf8               (Lext/mods/gameserver/enums/StatusType;I)V
  #276 = Methodref          #43.#277      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #277 = NameAndType        #278:#279     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #278 = Utf8               sendPacket
  #279 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #280 = Class              #281          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #281 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #282 = Methodref          #280.#283     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #283 = NameAndType        #5:#284       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #284 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #285 = Methodref          #43.#286      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #286 = NameAndType        #287:#279     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #287 = Utf8               broadcastPacket
  #288 = InvokeDynamic      #0:#289       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #289 = NameAndType        #290:#291     // makeConcatWithConstants:(I)Ljava/lang/String;
  #290 = Utf8               makeConcatWithConstants
  #291 = Utf8               (I)Ljava/lang/String;
  #292 = Methodref          #246.#293     // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
  #293 = NameAndType        #294:#59      // getHp:()D
  #294 = Utf8               getHp
  #295 = Methodref          #246.#296     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
  #296 = NameAndType        #297:#53      // getMaxHp:()I
  #297 = Utf8               getMaxHp
  #298 = Methodref          #246.#299     // ext/mods/gameserver/model/actor/status/PlayerStatus.setHp:(D)V
  #299 = NameAndType        #300:#260     // setHp:(D)V
  #300 = Utf8               setHp
  #301 = Fieldref           #267.#302     // ext/mods/gameserver/enums/StatusType.CUR_HP:Lext/mods/gameserver/enums/StatusType;
  #302 = NameAndType        #303:#271     // CUR_HP:Lext/mods/gameserver/enums/StatusType;
  #303 = Utf8               CUR_HP
  #304 = Fieldref           #305.#306     // ext/mods/gameserver/network/SystemMessageId.S1_HP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
  #305 = Class              #307          // ext/mods/gameserver/network/SystemMessageId
  #306 = NameAndType        #308:#309     // S1_HP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
  #307 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #308 = Utf8               S1_HP_RESTORED
  #309 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #310 = Methodref          #311.#312     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #311 = Class              #313          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #312 = NameAndType        #314:#315     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #313 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #314 = Utf8               getSystemMessage
  #315 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #316 = Methodref          #311.#317     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #317 = NameAndType        #318:#319     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #318 = Utf8               addNumber
  #319 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #320 = Methodref          #246.#321     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
  #321 = NameAndType        #322:#59      // getMp:()D
  #322 = Utf8               getMp
  #323 = Methodref          #246.#324     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
  #324 = NameAndType        #325:#53      // getMaxMp:()I
  #325 = Utf8               getMaxMp
  #326 = Methodref          #246.#327     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMp:(D)V
  #327 = NameAndType        #328:#260     // setMp:(D)V
  #328 = Utf8               setMp
  #329 = Fieldref           #267.#330     // ext/mods/gameserver/enums/StatusType.CUR_MP:Lext/mods/gameserver/enums/StatusType;
  #330 = NameAndType        #331:#271     // CUR_MP:Lext/mods/gameserver/enums/StatusType;
  #331 = Utf8               CUR_MP
  #332 = Fieldref           #305.#333     // ext/mods/gameserver/network/SystemMessageId.S1_MP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
  #333 = NameAndType        #334:#309     // S1_MP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
  #334 = Utf8               S1_MP_RESTORED
  #335 = Methodref          #208.#336     // ext/mods/aghation/holder/AgathionHolder.getRandomAnimDelay:()I
  #336 = NameAndType        #337:#53      // getRandomAnimDelay:()I
  #337 = Utf8               getRandomAnimDelay
  #338 = Methodref          #8.#339       // ext/mods/gameserver/model/actor/instance/Agathion.isMoving:()Z
  #339 = NameAndType        #340:#139     // isMoving:()Z
  #340 = Utf8               isMoving
  #341 = Methodref          #97.#342      // ext/mods/gameserver/model/actor/ai/type/NpcAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #342 = NameAndType        #343:#344     // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #343 = Utf8               getCurrentIntention
  #344 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
  #345 = Methodref          #346.#347     // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
  #346 = Class              #348          // ext/mods/gameserver/model/actor/ai/Intention
  #347 = NameAndType        #349:#350     // getType:()Lext/mods/gameserver/enums/IntentionType;
  #348 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
  #349 = Utf8               getType
  #350 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
  #351 = Fieldref           #352.#353     // ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
  #352 = Class              #354          // ext/mods/gameserver/enums/IntentionType
  #353 = NameAndType        #355:#356     // IDLE:Lext/mods/gameserver/enums/IntentionType;
  #354 = Utf8               ext/mods/gameserver/enums/IntentionType
  #355 = Utf8               IDLE
  #356 = Utf8               Lext/mods/gameserver/enums/IntentionType;
  #357 = Methodref          #358.#359     // ext/mods/commons/random/Rnd.get:(I)I
  #358 = Class              #360          // ext/mods/commons/random/Rnd
  #359 = NameAndType        #361:#362     // get:(I)I
  #360 = Utf8               ext/mods/commons/random/Rnd
  #361 = Utf8               get
  #362 = Utf8               (I)I
  #363 = Methodref          #97.#364      // ext/mods/gameserver/model/actor/ai/type/NpcAI.onRandomAnimation:(I)V
  #364 = NameAndType        #365:#366     // onRandomAnimation:(I)V
  #365 = Utf8               onRandomAnimation
  #366 = Utf8               (I)V
  #367 = Methodref          #208.#368     // ext/mods/aghation/holder/AgathionHolder.getFollowCheckDelay:()I
  #368 = NameAndType        #369:#53      // getFollowCheckDelay:()I
  #369 = Utf8               getFollowCheckDelay
  #370 = Methodref          #8.#371       // ext/mods/gameserver/model/actor/instance/Agathion.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
  #371 = NameAndType        #372:#373     // distance2D:(Lext/mods/gameserver/model/WorldObject;)D
  #372 = Utf8               distance2D
  #373 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
  #374 = Double             1500.0d
  #376 = Methodref          #43.#377      // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #377 = NameAndType        #378:#139     // isTeleporting:()Z
  #378 = Utf8               isTeleporting
  #379 = Double             45.0d
  #381 = Methodref          #43.#382      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #382 = NameAndType        #383:#384     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #383 = Utf8               getPosition
  #384 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #385 = Methodref          #386.#387     // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #386 = Class              #388          // ext/mods/gameserver/model/location/SpawnLocation
  #387 = NameAndType        #389:#384     // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #388 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #389 = Utf8               clone
  #390 = Methodref          #74.#77       // ext/mods/gameserver/model/location/Location.getX:()I
  #391 = Methodref          #74.#392      // ext/mods/gameserver/model/location/Location.setX:(I)V
  #392 = NameAndType        #393:#366     // setX:(I)V
  #393 = Utf8               setX
  #394 = Methodref          #74.#80       // ext/mods/gameserver/model/location/Location.getY:()I
  #395 = Methodref          #74.#396      // ext/mods/gameserver/model/location/Location.setY:(I)V
  #396 = NameAndType        #397:#366     // setY:(I)V
  #397 = Utf8               setY
  #398 = Methodref          #8.#399       // ext/mods/gameserver/model/actor/instance/Agathion.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #399 = NameAndType        #400:#401     // isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #400 = Utf8               isIn2DRadius
  #401 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #402 = Methodref          #8.#77        // ext/mods/gameserver/model/actor/instance/Agathion.getX:()I
  #403 = Methodref          #8.#80        // ext/mods/gameserver/model/actor/instance/Agathion.getY:()I
  #404 = Methodref          #55.#405      // java/lang/Math.sqrt:(D)D
  #405 = NameAndType        #406:#65      // sqrt:(D)D
  #406 = Utf8               sqrt
  #407 = Methodref          #74.#83       // ext/mods/gameserver/model/location/Location.getZ:()I
  #408 = Methodref          #409.#410     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #409 = Class              #411          // ext/mods/gameserver/geoengine/GeoEngine
  #410 = NameAndType        #127:#412     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #411 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #412 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #413 = Methodref          #8.#83        // ext/mods/gameserver/model/actor/instance/Agathion.getZ:()I
  #414 = Methodref          #409.#415     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #415 = NameAndType        #416:#417     // canMoveToTarget:(IIIIII)Z
  #416 = Utf8               canMoveToTarget
  #417 = Utf8               (IIIIII)Z
  #418 = Methodref          #8.#419       // ext/mods/gameserver/model/actor/instance/Agathion.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #419 = NameAndType        #420:#421     // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #420 = Utf8               getMove
  #421 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #422 = Methodref          #423.#424     // ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #423 = Class              #425          // ext/mods/gameserver/model/actor/move/CreatureMove
  #424 = NameAndType        #426:#427     // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #425 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
  #426 = Utf8               maybeMoveToLocation
  #427 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #428 = InvokeDynamic      #1:#429       // #1:run:(Lext/mods/gameserver/model/actor/instance/Agathion;)Ljava/lang/Runnable;
  #429 = NameAndType        #430:#431     // run:(Lext/mods/gameserver/model/actor/instance/Agathion;)Ljava/lang/Runnable;
  #430 = Utf8               run
  #431 = Utf8               (Lext/mods/gameserver/model/actor/instance/Agathion;)Ljava/lang/Runnable;
  #432 = Long               500l
  #434 = Methodref          #435.#436     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #435 = Class              #437          // ext/mods/commons/pool/ThreadPool
  #436 = NameAndType        #438:#439     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #437 = Utf8               ext/mods/commons/pool/ThreadPool
  #438 = Utf8               scheduleAtFixedRate
  #439 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #440 = InterfaceMethodref #441.#442     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #441 = Class              #443          // java/util/concurrent/ScheduledFuture
  #442 = NameAndType        #444:#445     // cancel:(Z)Z
  #443 = Utf8               java/util/concurrent/ScheduledFuture
  #444 = Utf8               cancel
  #445 = Utf8               (Z)Z
  #446 = Utf8               Signature
  #447 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #448 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;I)V
  #449 = Utf8               Code
  #450 = Utf8               LineNumberTable
  #451 = Utf8               LocalVariableTable
  #452 = Utf8               this
  #453 = Utf8               Lext/mods/gameserver/model/actor/instance/Agathion;
  #454 = Utf8               objectId
  #455 = Utf8               template
  #456 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #457 = Utf8               player
  #458 = Utf8               itemId
  #459 = Utf8               onInteract
  #460 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #461 = Utf8               killer
  #462 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #463 = Utf8               StackMapTable
  #464 = Utf8               onSpawn
  #465 = Utf8               safeOffset
  #466 = Utf8               angleDeg
  #467 = Utf8               rad
  #468 = Utf8               D
  #469 = Utf8               dx
  #470 = Utf8               dy
  #471 = Utf8               loc
  #472 = Utf8               Lext/mods/gameserver/model/location/Location;
  #473 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #474 = Utf8               newLoc
  #475 = Utf8               currentPlayerInstanceId
  #476 = Utf8               forceFollowPlayer
  #477 = Utf8               onlinePlayer
  #478 = Utf8               tempList
  #479 = Utf8               Ljava/util/List;
  #480 = Utf8               e
  #481 = Utf8               Ljava/lang/Exception;
  #482 = Utf8               su
  #483 = Utf8               Lext/mods/gameserver/network/serverpackets/StatusUpdate;
  #484 = Utf8               currentTime
  #485 = Utf8               healCooldown
  #486 = Utf8               agation
  #487 = Utf8               Lext/mods/aghation/holder/AgathionHolder;
  #488 = Utf8               agathionDataInstance
  #489 = Utf8               Ljava/lang/Object;
  #490 = Utf8               agationList
  #491 = Utf8               LocalVariableTypeTable
  #492 = Utf8               Ljava/util/List<Lext/mods/aghation/holder/AgathionHolder;>;
  #493 = Class              #494          // java/lang/Object
  #494 = Utf8               java/lang/Object
  #495 = Utf8               animCooldown
  #496 = Utf8               ownerPos
  #497 = Utf8               targetLoc
  #498 = Utf8               ratio
  #499 = Utf8               targetX
  #500 = Utf8               targetY
  #501 = Utf8               targetZ
  #502 = Utf8               playerLoc
  #503 = Utf8               distance
  #504 = Utf8               followDistance
  #505 = Utf8               followCooldown
  #506 = Utf8               isInMyTerritory
  #507 = Utf8               running
  #508 = Utf8               SourceFile
  #509 = Utf8               Agathion.java
  #510 = Utf8               BootstrapMethods
  #511 = String             #512          // \u0001 CP Restored
  #512 = Utf8               \u0001 CP Restored
  #513 = MethodType         #41           //  ()V
  #514 = MethodHandle       5:#101        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Agathion.thinking:()V
  #515 = MethodHandle       6:#516        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #516 = Methodref          #517.#518     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #517 = Class              #519          // java/lang/invoke/StringConcatFactory
  #518 = NameAndType        #290:#520     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #519 = Utf8               java/lang/invoke/StringConcatFactory
  #520 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #521 = MethodHandle       6:#522        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #522 = Methodref          #523.#524     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #523 = Class              #525          // java/lang/invoke/LambdaMetafactory
  #524 = NameAndType        #526:#527     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #525 = Utf8               java/lang/invoke/LambdaMetafactory
  #526 = Utf8               metafactory
  #527 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #528 = Utf8               InnerClasses
  #529 = Class              #530          // java/lang/invoke/MethodHandles$Lookup
  #530 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #531 = Class              #532          // java/lang/invoke/MethodHandles
  #532 = Utf8               java/lang/invoke/MethodHandles
  #533 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Agathion(int, ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Player, int);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: lconst_0
         8: putfield      #7                  // Field lastCheckPostionTime:J
        11: aload_0
        12: lconst_0
        13: putfield      #13                 // Field lastRandomAnimationTime:J
        16: aload_0
        17: lconst_0
        18: putfield      #16                 // Field lastHealTime:J
        21: aload_0
        22: iconst_0
        23: putfield      #19                 // Field _lastPlayerInstanceId:I
        26: aload_0
        27: aload_3
        28: putfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        31: aload_0
        32: iload         4
        34: putfield      #27                 // Field _itemId:I
        37: return
      LineNumberTable:
        line 58: 0
        line 46: 6
        line 48: 11
        line 50: 16
        line 53: 21
        line 60: 26
        line 61: 31
        line 62: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;
            0      38     1 objectId   I
            0      38     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      38     3 player   Lext/mods/gameserver/model/actor/Player;
            0      38     4 itemId   I

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;
            0       1     1 player   Lext/mods/gameserver/model/actor/Player;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #30                 // Method ext/mods/gameserver/model/actor/instance/Folk.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: iconst_1
        11: ireturn
      LineNumberTable:
        line 73: 0
        line 75: 8
        line 77: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;
            0      12     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 10 /* same */

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=1
         0: aload_0
         1: iconst_1
         2: invokevirtual #34                 // Method setInvul:(Z)V
         5: aload_0
         6: invokevirtual #38                 // Method start:()V
         9: aload_0
        10: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        13: ifnull        125
        16: aload_0
        17: aload_0
        18: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        21: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
        24: invokevirtual #48                 // Method ext/mods/InstanceMap/MapInstance.getId:()I
        27: putfield      #19                 // Field _lastPlayerInstanceId:I
        30: bipush        20
        32: istore_1
        33: invokestatic  #54                 // Method java/lang/Math.random:()D
        36: ldc2_w        #60                 // double 360.0d
        39: dmul
        40: d2i
        41: istore_2
        42: iload_2
        43: i2d
        44: invokestatic  #62                 // Method java/lang/Math.toRadians:(D)D
        47: dstore_3
        48: dload_3
        49: invokestatic  #66                 // Method java/lang/Math.cos:(D)D
        52: ldc2_w        #69                 // double 20.0d
        55: dmul
        56: d2i
        57: istore        5
        59: dload_3
        60: invokestatic  #71                 // Method java/lang/Math.sin:(D)D
        63: ldc2_w        #69                 // double 20.0d
        66: dmul
        67: d2i
        68: istore        6
        70: new           #74                 // class ext/mods/gameserver/model/location/Location
        73: dup
        74: aload_0
        75: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        78: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
        81: iload         5
        83: iadd
        84: aload_0
        85: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        88: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
        91: iload         6
        93: iadd
        94: aload_0
        95: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        98: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       101: invokespecial #85                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       104: astore        7
       106: aload_0
       107: aload         7
       109: iconst_0
       110: invokevirtual #88                 // Method teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       113: aload_0
       114: invokevirtual #92                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
       117: iconst_1
       118: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.setFollowStatus:(Z)V
       121: aload_0
       122: invokevirtual #101                // Method thinking:()V
       125: return
      LineNumberTable:
        line 83: 0
        line 84: 5
        line 85: 9
        line 87: 16
        line 89: 30
        line 90: 33
        line 91: 42
        line 92: 48
        line 93: 59
        line 94: 70
        line 95: 106
        line 97: 113
        line 98: 121
        line 100: 125
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      92     1 safeOffset   I
           42      83     2 angleDeg   I
           48      77     3   rad   D
           59      66     5    dx   I
           70      55     6    dy   I
          106      19     7   loc   Lext/mods/gameserver/model/location/Location;
            0     126     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;
      StackMapTable: number_of_entries = 1
        frame_type = 251 /* same_frame_extended */
          offset_delta = 125

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #104                // Method stop:()V
         4: aload_0
         5: invokevirtual #107                // Method decayMe:()V
         8: return
      LineNumberTable:
        line 105: 0
        line 106: 4
        line 108: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;

  public ext.mods.gameserver.model.actor.Player getPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;

  public void forceFollowPlayer();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: invokevirtual #116                // Method getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
        12: invokevirtual #48                 // Method ext/mods/InstanceMap/MapInstance.getId:()I
        15: aload_0
        16: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        19: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
        22: invokevirtual #48                 // Method ext/mods/InstanceMap/MapInstance.getId:()I
        25: if_icmpeq     54
        28: aload_0
        29: aload_0
        30: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        33: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
        36: iconst_0
        37: invokevirtual #110                // Method setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
        40: aload_0
        41: aload_0
        42: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        45: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
        48: invokevirtual #48                 // Method ext/mods/InstanceMap/MapInstance.getId:()I
        51: putfield      #19                 // Field _lastPlayerInstanceId:I
        54: bipush        25
        56: istore_1
        57: invokestatic  #54                 // Method java/lang/Math.random:()D
        60: ldc2_w        #60                 // double 360.0d
        63: dmul
        64: d2i
        65: istore_2
        66: iload_2
        67: i2d
        68: invokestatic  #62                 // Method java/lang/Math.toRadians:(D)D
        71: dstore_3
        72: dload_3
        73: invokestatic  #66                 // Method java/lang/Math.cos:(D)D
        76: ldc2_w        #117                // double 25.0d
        79: dmul
        80: d2i
        81: istore        5
        83: dload_3
        84: invokestatic  #71                 // Method java/lang/Math.sin:(D)D
        87: ldc2_w        #117                // double 25.0d
        90: dmul
        91: d2i
        92: istore        6
        94: new           #74                 // class ext/mods/gameserver/model/location/Location
        97: dup
        98: aload_0
        99: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       102: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
       105: iload         5
       107: iadd
       108: aload_0
       109: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       112: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
       115: iload         6
       117: iadd
       118: aload_0
       119: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       122: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       125: invokespecial #85                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       128: astore        7
       130: aload_0
       131: aload         7
       133: iconst_0
       134: invokevirtual #88                 // Method teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       137: aload_0
       138: invokevirtual #92                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
       141: iconst_1
       142: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.setFollowStatus:(Z)V
       145: return
      LineNumberTable:
        line 149: 0
        line 150: 7
        line 152: 8
        line 154: 28
        line 155: 40
        line 158: 54
        line 159: 57
        line 160: 66
        line 161: 72
        line 162: 83
        line 163: 94
        line 164: 130
        line 166: 137
        line 167: 145
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     146     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;
           57      89     1 safeOffset   I
           66      80     2 angleDeg   I
           72      74     3   rad   D
           83      63     5    dx   I
           94      52     6    dy   I
          130      16     7 newLoc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 45 /* same */

  public boolean isInMyTerritory();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 409: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;

  public void start();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #119                // Field _task:Ljava/util/concurrent/ScheduledFuture;
         4: ifnonnull     26
         7: aload_0
         8: aload_0
         9: invokedynamic #428,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/model/actor/instance/Agathion;)Ljava/lang/Runnable;
        14: ldc2_w        #432                // long 500l
        17: ldc2_w        #432                // long 500l
        20: invokestatic  #434                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        23: putfield      #119                // Field _task:Ljava/util/concurrent/ScheduledFuture;
        26: return
      LineNumberTable:
        line 414: 0
        line 416: 7
        line 418: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;
      StackMapTable: number_of_entries = 1
        frame_type = 26 /* same */

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #119                // Field _task:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #119                // Field _task:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_0
        12: invokeinterface #440,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #119                // Field _task:Ljava/util/concurrent/ScheduledFuture;
        23: return
      LineNumberTable:
        line 422: 0
        line 424: 7
        line 425: 18
        line 428: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public boolean running();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #119                // Field _task:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 432: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/instance/Agathion;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "Agathion.java"
BootstrapMethods:
  0: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #511 \u0001 CP Restored
  1: #521 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #513 ()V
      #514 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Agathion.thinking:()V
      #513 ()V
InnerClasses:
  public static final #533= #529 of #531; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
