// Bytecode for: ext.mods.gameserver.model.actor.instance.Door
// File: ext\mods\gameserver\model\actor\instance\Door.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Door.class
  Last modified 9 de jul de 2026; size 15767 bytes
  MD5 checksum a7733011c547fd485b438f6c53cd7ca0
  Compiled from "Door.java"
public class ext.mods.gameserver.model.actor.instance.Door extends ext.mods.gameserver.model.actor.Creature implements ext.mods.gameserver.geoengine.geodata.IGeoObject
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/Door
  super_class: #2                         // ext/mods/gameserver/model/actor/Creature
  interfaces: 1, fields: 5, methods: 48, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Creature."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Creature
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Creature
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/Door
    #9 = NameAndType        #11:#12       // getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #11 = Utf8               getTemplate
   #12 = Utf8               ()Lext/mods/gameserver/model/actor/template/DoorTemplate;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/template/DoorTemplate.isOpened:()Z
   #14 = Class              #16           // ext/mods/gameserver/model/actor/template/DoorTemplate
   #15 = NameAndType        #17:#18       // isOpened:()Z
   #16 = Utf8               ext/mods/gameserver/model/actor/template/DoorTemplate
   #17 = Utf8               isOpened
   #18 = Utf8               ()Z
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/actor/instance/Door._open:Z
   #20 = NameAndType        #21:#22       // _open:Z
   #21 = Utf8               _open
   #22 = Utf8               Z
   #23 = Methodref          #14.#24       // ext/mods/gameserver/model/actor/template/DoorTemplate.getName:()Ljava/lang/String;
   #24 = NameAndType        #25:#26       // getName:()Ljava/lang/String;
   #25 = Utf8               getName
   #26 = Utf8               ()Ljava/lang/String;
   #27 = Methodref          #8.#28        // ext/mods/gameserver/model/actor/instance/Door.setName:(Ljava/lang/String;)V
   #28 = NameAndType        #29:#30       // setName:(Ljava/lang/String;)V
   #29 = Utf8               setName
   #30 = Utf8               (Ljava/lang/String;)V
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/model/actor/instance/Door._ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #32 = NameAndType        #33:#34       // _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #33 = Utf8               _ai
   #34 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #35 = Class              #36           // ext/mods/gameserver/model/actor/ai/type/DoorAI
   #36 = Utf8               ext/mods/gameserver/model/actor/ai/type/DoorAI
   #37 = Methodref          #35.#38       // ext/mods/gameserver/model/actor/ai/type/DoorAI."<init>":(Lext/mods/gameserver/model/actor/instance/Door;)V
   #38 = NameAndType        #5:#39        // "<init>":(Lext/mods/gameserver/model/actor/instance/Door;)V
   #39 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;)V
   #40 = Fieldref           #8.#41        // ext/mods/gameserver/model/actor/instance/Door._status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #41 = NameAndType        #42:#43       // _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #42 = Utf8               _status
   #43 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #44 = Class              #45           // ext/mods/gameserver/model/actor/status/DoorStatus
   #45 = Utf8               ext/mods/gameserver/model/actor/status/DoorStatus
   #46 = Methodref          #44.#38       // ext/mods/gameserver/model/actor/status/DoorStatus."<init>":(Lext/mods/gameserver/model/actor/instance/Door;)V
   #47 = Methodref          #2.#48        // ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #48 = NameAndType        #11:#49       // getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #49 = Utf8               ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #50 = Methodref          #2.#51        // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #51 = NameAndType        #52:#53       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #52 = Utf8               isAttackableBy
   #53 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #54 = Class              #55           // ext/mods/gameserver/model/actor/Playable
   #55 = Utf8               ext/mods/gameserver/model/actor/Playable
   #56 = Fieldref           #8.#57        // ext/mods/gameserver/model/actor/instance/Door._residence:Lext/mods/gameserver/model/residence/Residence;
   #57 = NameAndType        #58:#59       // _residence:Lext/mods/gameserver/model/residence/Residence;
   #58 = Utf8               _residence
   #59 = Utf8               Lext/mods/gameserver/model/residence/Residence;
   #60 = Class              #61           // ext/mods/gameserver/model/residence/castle/Castle
   #61 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #62 = Methodref          #60.#63       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #63 = NameAndType        #64:#65       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #64 = Utf8               getSiege
   #65 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #66 = Methodref          #67.#68       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #67 = Class              #69           // ext/mods/gameserver/model/residence/castle/Siege
   #68 = NameAndType        #70:#18       // isInProgress:()Z
   #69 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #70 = Utf8               isInProgress
   #71 = Methodref          #2.#72        // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #72 = NameAndType        #73:#74       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #73 = Utf8               getActingPlayer
   #74 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #75 = Methodref          #76.#77       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #76 = Class              #78           // ext/mods/gameserver/model/actor/Player
   #77 = NameAndType        #79:#80       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #78 = Utf8               ext/mods/gameserver/model/actor/Player
   #79 = Utf8               getClan
   #80 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #81 = Class              #82           // ext/mods/gameserver/enums/SiegeSide
   #82 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #83 = Fieldref           #81.#84       // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #84 = NameAndType        #85:#86       // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #85 = Utf8               ATTACKER
   #86 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #87 = Methodref          #67.#88       // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #88 = NameAndType        #89:#90       // checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #89 = Utf8               checkSides
   #90 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #91 = Methodref          #8.#92        // ext/mods/gameserver/model/actor/instance/Door.isWall:()Z
   #92 = NameAndType        #93:#18       // isWall:()Z
   #93 = Utf8               isWall
   #94 = Class              #95           // ext/mods/gameserver/model/actor/instance/SiegeSummon
   #95 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeSummon
   #96 = Methodref          #94.#97       // ext/mods/gameserver/model/actor/instance/SiegeSummon.getNpcId:()I
   #97 = NameAndType        #98:#99       // getNpcId:()I
   #98 = Utf8               getNpcId
   #99 = Utf8               ()I
  #100 = Class              #101          // ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #101 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #102 = Methodref          #100.#103     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
  #103 = NameAndType        #104:#18      // isInSiege:()Z
  #104 = Utf8               isInSiege
  #105 = Methodref          #100.#106     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #106 = NameAndType        #64:#107      // getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #107 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #108 = Methodref          #109.#110     // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.doorIsAutoAttackable:()Z
  #109 = Class              #111          // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  #110 = NameAndType        #112:#18      // doorIsAutoAttackable:()Z
  #111 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  #112 = Utf8               doorIsAutoAttackable
  #113 = Methodref          #109.#88      // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
  #114 = Methodref          #8.#51        // ext/mods/gameserver/model/actor/instance/Door.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #115 = Methodref          #8.#116       // ext/mods/gameserver/model/actor/instance/Door.canBeManuallyOpenedBy:(Lext/mods/gameserver/model/actor/Player;)Z
  #116 = NameAndType        #117:#118     // canBeManuallyOpenedBy:(Lext/mods/gameserver/model/actor/Player;)Z
  #117 = Utf8               canBeManuallyOpenedBy
  #118 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #119 = Methodref          #76.#120      // ext/mods/gameserver/model/actor/Player.setRequestedGate:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #120 = NameAndType        #121:#39      // setRequestedGate:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #121 = Utf8               setRequestedGate
  #122 = Class              #123          // ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #123 = Utf8               ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #124 = Methodref          #8.#15        // ext/mods/gameserver/model/actor/instance/Door.isOpened:()Z
  #125 = Methodref          #122.#126     // ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
  #126 = NameAndType        #5:#127       // "<init>":(I)V
  #127 = Utf8               (I)V
  #128 = Methodref          #76.#129      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #129 = NameAndType        #130:#131     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #130 = Utf8               sendPacket
  #131 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #132 = Methodref          #2.#133       // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #133 = NameAndType        #134:#135     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #134 = Utf8               reduceCurrentHp
  #135 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #136 = Methodref          #100.#137     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #137 = NameAndType        #138:#139     // getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #138 = Utf8               getSiegeZone
  #139 = Utf8               ()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #140 = Methodref          #141.#142     // ext/mods/gameserver/model/zone/type/SiegeZone.isActive:()Z
  #141 = Class              #143          // ext/mods/gameserver/model/zone/type/SiegeZone
  #142 = NameAndType        #144:#18      // isActive:()Z
  #143 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
  #144 = Utf8               isActive
  #145 = Class              #146          // ext/mods/gameserver/model/actor/Npc
  #146 = Utf8               ext/mods/gameserver/model/actor/Npc
  #147 = InvokeDynamic      #0:#148       // #0:accept:(Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
  #148 = NameAndType        #149:#150     // accept:(Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
  #149 = Utf8               accept
  #150 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
  #151 = Methodref          #8.#152       // ext/mods/gameserver/model/actor/instance/Door.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #152 = NameAndType        #153:#154     // forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #153 = Utf8               forEachKnownTypeInRadius
  #154 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #155 = Methodref          #8.#156       // ext/mods/gameserver/model/actor/instance/Door.changeState:(ZZ)V
  #156 = NameAndType        #157:#158     // changeState:(ZZ)V
  #157 = Utf8               changeState
  #158 = Utf8               (ZZ)V
  #159 = Methodref          #2.#160       // ext/mods/gameserver/model/actor/Creature.onSpawn:()V
  #160 = NameAndType        #161:#162     // onSpawn:()V
  #161 = Utf8               onSpawn
  #162 = Utf8               ()V
  #163 = Methodref          #2.#164       // ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #164 = NameAndType        #165:#53      // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #165 = Utf8               doDie
  #166 = Methodref          #167.#168     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #167 = Class              #169          // ext/mods/gameserver/geoengine/GeoEngine
  #168 = NameAndType        #170:#171     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #169 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #170 = Utf8               getInstance
  #171 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #172 = Methodref          #167.#173     // ext/mods/gameserver/geoengine/GeoEngine.removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #173 = NameAndType        #174:#175     // removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #174 = Utf8               removeGeoObject
  #175 = Utf8               (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #176 = Fieldref           #177.#178     // ext/mods/gameserver/network/SystemMessageId.CASTLE_WALL_DAMAGED:Lext/mods/gameserver/network/SystemMessageId;
  #177 = Class              #179          // ext/mods/gameserver/network/SystemMessageId
  #178 = NameAndType        #180:#181     // CASTLE_WALL_DAMAGED:Lext/mods/gameserver/network/SystemMessageId;
  #179 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #180 = Utf8               CASTLE_WALL_DAMAGED
  #181 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #182 = Fieldref           #177.#183     // ext/mods/gameserver/network/SystemMessageId.CASTLE_GATE_BROKEN_DOWN:Lext/mods/gameserver/network/SystemMessageId;
  #183 = NameAndType        #184:#181     // CASTLE_GATE_BROKEN_DOWN:Lext/mods/gameserver/network/SystemMessageId;
  #184 = Utf8               CASTLE_GATE_BROKEN_DOWN
  #185 = Fieldref           #81.#186      // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #186 = NameAndType        #187:#86      // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #187 = Utf8               DEFENDER
  #188 = Methodref          #67.#189      // ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
  #189 = NameAndType        #190:#191     // announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
  #190 = Utf8               announce
  #191 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
  #192 = Fieldref           #8.#193       // ext/mods/gameserver/model/actor/instance/Door._autoTask:Ljava/util/concurrent/ScheduledFuture;
  #193 = NameAndType        #194:#195     // _autoTask:Ljava/util/concurrent/ScheduledFuture;
  #194 = Utf8               _autoTask
  #195 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #196 = InterfaceMethodref #197.#198     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #197 = Class              #199          // java/util/concurrent/ScheduledFuture
  #198 = NameAndType        #200:#201     // cancel:(Z)Z
  #199 = Utf8               java/util/concurrent/ScheduledFuture
  #200 = Utf8               cancel
  #201 = Utf8               (Z)Z
  #202 = Methodref          #167.#203     // ext/mods/gameserver/geoengine/GeoEngine.addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #203 = NameAndType        #204:#175     // addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #204 = Utf8               addGeoObject
  #205 = Methodref          #2.#206       // ext/mods/gameserver/model/actor/Creature.doRevive:()V
  #206 = NameAndType        #207:#162     // doRevive:()V
  #207 = Utf8               doRevive
  #208 = Class              #209          // ext/mods/gameserver/network/serverpackets/DoorInfo
  #209 = Utf8               ext/mods/gameserver/network/serverpackets/DoorInfo
  #210 = Methodref          #208.#211     // ext/mods/gameserver/network/serverpackets/DoorInfo."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;)V
  #211 = NameAndType        #5:#212       // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;)V
  #212 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;)V
  #213 = Class              #214          // ext/mods/gameserver/network/serverpackets/DoorStatusUpdate
  #214 = Utf8               ext/mods/gameserver/network/serverpackets/DoorStatusUpdate
  #215 = Methodref          #213.#38      // ext/mods/gameserver/network/serverpackets/DoorStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/instance/Door;)V
  #216 = Methodref          #14.#217      // ext/mods/gameserver/model/actor/template/DoorTemplate.getGeoX:()I
  #217 = NameAndType        #218:#99      // getGeoX:()I
  #218 = Utf8               getGeoX
  #219 = Methodref          #14.#220      // ext/mods/gameserver/model/actor/template/DoorTemplate.getGeoY:()I
  #220 = NameAndType        #221:#99      // getGeoY:()I
  #221 = Utf8               getGeoY
  #222 = Methodref          #14.#223      // ext/mods/gameserver/model/actor/template/DoorTemplate.getGeoZ:()I
  #223 = NameAndType        #224:#99      // getGeoZ:()I
  #224 = Utf8               getGeoZ
  #225 = Methodref          #14.#226      // ext/mods/gameserver/model/actor/template/DoorTemplate.getCollisionHeight:()D
  #226 = NameAndType        #227:#228     // getCollisionHeight:()D
  #227 = Utf8               getCollisionHeight
  #228 = Utf8               ()D
  #229 = Methodref          #14.#230      // ext/mods/gameserver/model/actor/template/DoorTemplate.getGeoData:()[[B
  #230 = NameAndType        #231:#232     // getGeoData:()[[B
  #231 = Utf8               getGeoData
  #232 = Utf8               ()[[B
  #233 = Double             2.0d
  #235 = Methodref          #14.#236      // ext/mods/gameserver/model/actor/template/DoorTemplate.getId:()I
  #236 = NameAndType        #237:#99      // getId:()I
  #237 = Utf8               getId
  #238 = Methodref          #14.#239      // ext/mods/gameserver/model/actor/template/DoorTemplate.getOpenType:()Lext/mods/gameserver/enums/OpenType;
  #239 = NameAndType        #240:#241     // getOpenType:()Lext/mods/gameserver/enums/OpenType;
  #240 = Utf8               getOpenType
  #241 = Utf8               ()Lext/mods/gameserver/enums/OpenType;
  #242 = Fieldref           #243.#244     // ext/mods/gameserver/enums/OpenType.SKILL:Lext/mods/gameserver/enums/OpenType;
  #243 = Class              #245          // ext/mods/gameserver/enums/OpenType
  #244 = NameAndType        #246:#247     // SKILL:Lext/mods/gameserver/enums/OpenType;
  #245 = Utf8               ext/mods/gameserver/enums/OpenType
  #246 = Utf8               SKILL
  #247 = Utf8               Lext/mods/gameserver/enums/OpenType;
  #248 = Methodref          #14.#249      // ext/mods/gameserver/model/actor/template/DoorTemplate.getType:()Lext/mods/gameserver/enums/DoorType;
  #249 = NameAndType        #250:#251     // getType:()Lext/mods/gameserver/enums/DoorType;
  #250 = Utf8               getType
  #251 = Utf8               ()Lext/mods/gameserver/enums/DoorType;
  #252 = Fieldref           #253.#254     // ext/mods/gameserver/enums/DoorType.WALL:Lext/mods/gameserver/enums/DoorType;
  #253 = Class              #255          // ext/mods/gameserver/enums/DoorType
  #254 = NameAndType        #256:#257     // WALL:Lext/mods/gameserver/enums/DoorType;
  #255 = Utf8               ext/mods/gameserver/enums/DoorType
  #256 = Utf8               WALL
  #257 = Utf8               Lext/mods/gameserver/enums/DoorType;
  #258 = Methodref          #8.#259       // ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
  #259 = NameAndType        #260:#261     // getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
  #260 = Utf8               getStatus
  #261 = Utf8               ()Lext/mods/gameserver/model/actor/status/DoorStatus;
  #262 = Methodref          #44.#263      // ext/mods/gameserver/model/actor/status/DoorStatus.getHpRatio:()D
  #263 = NameAndType        #264:#228     // getHpRatio:()D
  #264 = Utf8               getHpRatio
  #265 = Double             6.0d
  #267 = Methodref          #268.#269     // java/lang/Math.ceil:(D)D
  #268 = Class              #270          // java/lang/Math
  #269 = NameAndType        #271:#272     // ceil:(D)D
  #270 = Utf8               java/lang/Math
  #271 = Utf8               ceil
  #272 = Utf8               (D)D
  #273 = Methodref          #268.#274     // java/lang/Math.min:(II)I
  #274 = NameAndType        #275:#276     // min:(II)I
  #275 = Utf8               min
  #276 = Utf8               (II)I
  #277 = Methodref          #268.#278     // java/lang/Math.max:(II)I
  #278 = NameAndType        #279:#276     // max:(II)I
  #279 = Utf8               max
  #280 = Methodref          #8.#281       // ext/mods/gameserver/model/actor/instance/Door.isDead:()Z
  #281 = NameAndType        #282:#18      // isDead:()Z
  #282 = Utf8               isDead
  #283 = Methodref          #44.#284      // ext/mods/gameserver/model/actor/status/DoorStatus.broadcastStatusUpdate:()V
  #284 = NameAndType        #285:#162     // broadcastStatusUpdate:()V
  #285 = Utf8               broadcastStatusUpdate
  #286 = Methodref          #287.#288     // ext/mods/extensions/listener/manager/DoorListenerManager.getInstance:()Lext/mods/extensions/listener/manager/DoorListenerManager;
  #287 = Class              #289          // ext/mods/extensions/listener/manager/DoorListenerManager
  #288 = NameAndType        #170:#290     // getInstance:()Lext/mods/extensions/listener/manager/DoorListenerManager;
  #289 = Utf8               ext/mods/extensions/listener/manager/DoorListenerManager
  #290 = Utf8               ()Lext/mods/extensions/listener/manager/DoorListenerManager;
  #291 = Methodref          #287.#292     // ext/mods/extensions/listener/manager/DoorListenerManager.notifyDoorOpen:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #292 = NameAndType        #293:#39      // notifyDoorOpen:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #293 = Utf8               notifyDoorOpen
  #294 = Methodref          #287.#295     // ext/mods/extensions/listener/manager/DoorListenerManager.notifyDoorClose:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #295 = NameAndType        #296:#39      // notifyDoorClose:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #296 = Utf8               notifyDoorClose
  #297 = Fieldref           #8.#298       // ext/mods/gameserver/model/actor/instance/Door._quests:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
  #298 = NameAndType        #299:#300     // _quests:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
  #299 = Utf8               _quests
  #300 = Utf8               Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
  #301 = Methodref          #302.#303     // it/unimi/dsi/fastutil/objects/ObjectArrayList.size:()I
  #302 = Class              #304          // it/unimi/dsi/fastutil/objects/ObjectArrayList
  #303 = NameAndType        #305:#99      // size:()I
  #304 = Utf8               it/unimi/dsi/fastutil/objects/ObjectArrayList
  #305 = Utf8               size
  #306 = Methodref          #302.#307     // it/unimi/dsi/fastutil/objects/ObjectArrayList.get:(I)Ljava/lang/Object;
  #307 = NameAndType        #308:#309     // get:(I)Ljava/lang/Object;
  #308 = Utf8               get
  #309 = Utf8               (I)Ljava/lang/Object;
  #310 = Class              #311          // ext/mods/gameserver/scripting/Quest
  #311 = Utf8               ext/mods/gameserver/scripting/Quest
  #312 = Methodref          #310.#313     // ext/mods/gameserver/scripting/Quest.onDoorChange:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #313 = NameAndType        #314:#39      // onDoorChange:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #314 = Utf8               onDoorChange
  #315 = Fieldref           #8.#316       // ext/mods/gameserver/model/actor/instance/Door._npcMakers:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
  #316 = NameAndType        #317:#300     // _npcMakers:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
  #317 = Utf8               _npcMakers
  #318 = Class              #319          // ext/mods/gameserver/model/spawn/NpcMaker
  #319 = Utf8               ext/mods/gameserver/model/spawn/NpcMaker
  #320 = Methodref          #318.#321     // ext/mods/gameserver/model/spawn/NpcMaker.getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
  #321 = NameAndType        #322:#323     // getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
  #322 = Utf8               getMaker
  #323 = Utf8               ()Lext/mods/gameserver/scripting/SpawnMaker;
  #324 = Methodref          #325.#326     // ext/mods/gameserver/scripting/SpawnMaker.onDoorEvent:(Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #325 = Class              #327          // ext/mods/gameserver/scripting/SpawnMaker
  #326 = NameAndType        #328:#329     // onDoorEvent:(Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #327 = Utf8               ext/mods/gameserver/scripting/SpawnMaker
  #328 = Utf8               onDoorEvent
  #329 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #330 = Methodref          #14.#331      // ext/mods/gameserver/model/actor/template/DoorTemplate.getTriggerId:()I
  #331 = NameAndType        #332:#99      // getTriggerId:()I
  #332 = Utf8               getTriggerId
  #333 = Methodref          #334.#335     // ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
  #334 = Class              #336          // ext/mods/gameserver/data/xml/DoorData
  #335 = NameAndType        #170:#337     // getInstance:()Lext/mods/gameserver/data/xml/DoorData;
  #336 = Utf8               ext/mods/gameserver/data/xml/DoorData
  #337 = Utf8               ()Lext/mods/gameserver/data/xml/DoorData;
  #338 = Methodref          #334.#339     // ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
  #339 = NameAndType        #340:#341     // getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
  #340 = Utf8               getDoor
  #341 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Door;
  #342 = Methodref          #14.#343      // ext/mods/gameserver/model/actor/template/DoorTemplate.getCloseTime:()I
  #343 = NameAndType        #344:#99      // getCloseTime:()I
  #344 = Utf8               getCloseTime
  #345 = Methodref          #14.#346      // ext/mods/gameserver/model/actor/template/DoorTemplate.getOpenTime:()I
  #346 = NameAndType        #347:#99      // getOpenTime:()I
  #347 = Utf8               getOpenTime
  #348 = Methodref          #14.#349      // ext/mods/gameserver/model/actor/template/DoorTemplate.getRandomTime:()I
  #349 = NameAndType        #350:#99      // getRandomTime:()I
  #350 = Utf8               getRandomTime
  #351 = Methodref          #352.#353     // ext/mods/commons/random/Rnd.get:(I)I
  #352 = Class              #354          // ext/mods/commons/random/Rnd
  #353 = NameAndType        #308:#355     // get:(I)I
  #354 = Utf8               ext/mods/commons/random/Rnd
  #355 = Utf8               (I)I
  #356 = InvokeDynamic      #1:#357       // #1:run:(Lext/mods/gameserver/model/actor/instance/Door;Z)Ljava/lang/Runnable;
  #357 = NameAndType        #358:#359     // run:(Lext/mods/gameserver/model/actor/instance/Door;Z)Ljava/lang/Runnable;
  #358 = Utf8               run
  #359 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;Z)Ljava/lang/Runnable;
  #360 = Long               1000l
  #362 = Methodref          #363.#364     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #363 = Class              #365          // ext/mods/commons/pool/ThreadPool
  #364 = NameAndType        #366:#367     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #365 = Utf8               ext/mods/commons/pool/ThreadPool
  #366 = Utf8               schedule
  #367 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #368 = Methodref          #302.#126     // it/unimi/dsi/fastutil/objects/ObjectArrayList."<init>":(I)V
  #369 = Methodref          #302.#370     // it/unimi/dsi/fastutil/objects/ObjectArrayList.remove:(Ljava/lang/Object;)Z
  #370 = NameAndType        #371:#372     // remove:(Ljava/lang/Object;)Z
  #371 = Utf8               remove
  #372 = Utf8               (Ljava/lang/Object;)Z
  #373 = Methodref          #302.#374     // it/unimi/dsi/fastutil/objects/ObjectArrayList.add:(Ljava/lang/Object;)Z
  #374 = NameAndType        #375:#372     // add:(Ljava/lang/Object;)Z
  #375 = Utf8               add
  #376 = Class              #377          // ext/mods/gameserver/model/residence/clanhall/ClanHall
  #377 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
  #378 = Methodref          #76.#379      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #379 = NameAndType        #380:#99      // getClanId:()I
  #380 = Utf8               getClanId
  #381 = Methodref          #376.#382     // ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
  #382 = NameAndType        #383:#99      // getOwnerId:()I
  #383 = Utf8               getOwnerId
  #384 = Fieldref           #385.#386     // ext/mods/gameserver/enums/PrivilegeType.CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
  #385 = Class              #387          // ext/mods/gameserver/enums/PrivilegeType
  #386 = NameAndType        #388:#389     // CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
  #387 = Utf8               ext/mods/gameserver/enums/PrivilegeType
  #388 = Utf8               CHP_ENTRY_EXIT_RIGHTS
  #389 = Utf8               Lext/mods/gameserver/enums/PrivilegeType;
  #390 = Methodref          #76.#391      // ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #391 = NameAndType        #392:#393     // hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #392 = Utf8               hasClanPrivileges
  #393 = Utf8               (Lext/mods/gameserver/enums/PrivilegeType;)Z
  #394 = Methodref          #8.#395       // ext/mods/gameserver/model/actor/instance/Door.getAI:()Lext/mods/gameserver/model/actor/ai/type/DoorAI;
  #395 = NameAndType        #396:#397     // getAI:()Lext/mods/gameserver/model/actor/ai/type/DoorAI;
  #396 = Utf8               getAI
  #397 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/DoorAI;
  #398 = Methodref          #8.#399       // ext/mods/gameserver/model/actor/instance/Door.getSecondaryWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #399 = NameAndType        #400:#401     // getSecondaryWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #400 = Utf8               getSecondaryWeaponItem
  #401 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #402 = Methodref          #145.#281     // ext/mods/gameserver/model/actor/Npc.isDead:()Z
  #403 = Methodref          #145.#404     // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #404 = NameAndType        #11:#405      // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #405 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #406 = Methodref          #407.#408     // ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
  #407 = Class              #409          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #408 = NameAndType        #410:#411     // getClans:()[Ljava/lang/String;
  #409 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #410 = Utf8               getClans
  #411 = Utf8               ()[Ljava/lang/String;
  #412 = String             #413          // door_clan
  #413 = Utf8               door_clan
  #414 = Methodref          #415.#416     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #415 = Class              #417          // java/lang/String
  #416 = NameAndType        #418:#372     // equals:(Ljava/lang/Object;)Z
  #417 = Utf8               java/lang/String
  #418 = Utf8               equals
  #419 = Fieldref           #420.#421     // ext/mods/gameserver/enums/EventHandler.STATIC_OBJECT_CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
  #420 = Class              #422          // ext/mods/gameserver/enums/EventHandler
  #421 = NameAndType        #423:#424     // STATIC_OBJECT_CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
  #422 = Utf8               ext/mods/gameserver/enums/EventHandler
  #423 = Utf8               STATIC_OBJECT_CLAN_ATTACKED
  #424 = Utf8               Lext/mods/gameserver/enums/EventHandler;
  #425 = Methodref          #407.#426     // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #426 = NameAndType        #427:#428     // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #427 = Utf8               getEventQuests
  #428 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #429 = InterfaceMethodref #430.#431     // java/util/List.isEmpty:()Z
  #430 = Class              #432          // java/util/List
  #431 = NameAndType        #433:#18      // isEmpty:()Z
  #432 = Utf8               java/util/List
  #433 = Utf8               isEmpty
  #434 = InterfaceMethodref #430.#303     // java/util/List.size:()I
  #435 = InterfaceMethodref #430.#307     // java/util/List.get:(I)Ljava/lang/Object;
  #436 = Methodref          #310.#437     // ext/mods/gameserver/scripting/Quest.onStaticObjectClanAttacked:(Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
  #437 = NameAndType        #438:#439     // onStaticObjectClanAttacked:(Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
  #438 = Utf8               onStaticObjectClanAttacked
  #439 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
  #440 = Class              #441          // ext/mods/gameserver/geoengine/geodata/IGeoObject
  #441 = Utf8               ext/mods/gameserver/geoengine/geodata/IGeoObject
  #442 = Utf8               Signature
  #443 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #444 = Utf8               Lit/unimi/dsi/fastutil/objects/ObjectArrayList<Lext/mods/gameserver/scripting/Quest;>;
  #445 = Utf8               Lit/unimi/dsi/fastutil/objects/ObjectArrayList<Lext/mods/gameserver/model/spawn/NpcMaker;>;
  #446 = Utf8               (ILext/mods/gameserver/model/actor/template/DoorTemplate;)V
  #447 = Utf8               Code
  #448 = Utf8               LineNumberTable
  #449 = Utf8               LocalVariableTable
  #450 = Utf8               this
  #451 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #452 = Utf8               objectId
  #453 = Utf8               I
  #454 = Utf8               template
  #455 = Utf8               Lext/mods/gameserver/model/actor/template/DoorTemplate;
  #456 = Utf8               StackMapTable
  #457 = Utf8               setAI
  #458 = Utf8               setStatus
  #459 = Utf8               addFuncsToNewCharacter
  #460 = Utf8               updateAbnormalEffect
  #461 = Utf8               getActiveWeaponInstance
  #462 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #463 = Utf8               getActiveWeaponItem
  #464 = Utf8               getSecondaryWeaponInstance
  #465 = Utf8               siegeSummon
  #466 = Utf8               Lext/mods/gameserver/model/actor/instance/SiegeSummon;
  #467 = Utf8               castle
  #468 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #469 = Utf8               sh
  #470 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #471 = Utf8               attacker
  #472 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #473 = Utf8               isAttackableWithoutForceBy
  #474 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
  #475 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #476 = Utf8               onInteract
  #477 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #478 = Utf8               player
  #479 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #480 = Utf8               damage
  #481 = Utf8               D
  #482 = Utf8               awake
  #483 = Utf8               isDOT
  #484 = Utf8               skill
  #485 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #486 = Utf8               reduceCurrentHpByDOT
  #487 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #488 = Utf8               i
  #489 = Utf8               killer
  #490 = Utf8               sendInfo
  #491 = Utf8               getHeight
  #492 = Utf8               getObjectGeoData
  #493 = Utf8               canBeHealed
  #494 = Utf8               isLethalable
  #495 = Utf8               getDoorId
  #496 = Utf8               isUnlockable
  #497 = Utf8               getDamage
  #498 = Utf8               openMe
  #499 = Utf8               closeMe
  #500 = Utf8               npcMaker
  #501 = Utf8               Lext/mods/gameserver/model/spawn/NpcMaker;
  #502 = Utf8               door
  #503 = Utf8               time
  #504 = Utf8               open
  #505 = Utf8               triggered
  #506 = Utf8               triggerId
  #507 = Utf8               getResidence
  #508 = Utf8               ()Lext/mods/gameserver/model/residence/Residence;
  #509 = Utf8               setResidence
  #510 = Utf8               (Lext/mods/gameserver/model/residence/Residence;)V
  #511 = Utf8               residence
  #512 = Utf8               addQuestEvent
  #513 = Utf8               (Lext/mods/gameserver/scripting/Quest;)V
  #514 = Utf8               quest
  #515 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #516 = Utf8               addMakerEvent
  #517 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #518 = Utf8               ch
  #519 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #520 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #521 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #522 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #523 = Utf8               lambda$changeState$0
  #524 = Utf8               (Z)V
  #525 = Utf8               lambda$reduceCurrentHp$0
  #526 = Utf8               (Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Npc;)V
  #527 = Utf8               called
  #528 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #529 = Utf8               clans
  #530 = Utf8               [Ljava/lang/String;
  #531 = Utf8               isDoorClan
  #532 = Utf8               eventQuests
  #533 = Utf8               Ljava/util/List;
  #534 = Utf8               LocalVariableTypeTable
  #535 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #536 = Class              #530          // "[Ljava/lang/String;"
  #537 = Utf8               SourceFile
  #538 = Utf8               Door.java
  #539 = Utf8               BootstrapMethods
  #540 = MethodType         #541          //  (Ljava/lang/Object;)V
  #541 = Utf8               (Ljava/lang/Object;)V
  #542 = MethodHandle       5:#543        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Door.lambda$reduceCurrentHp$0:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Npc;)V
  #543 = Methodref          #8.#544       // ext/mods/gameserver/model/actor/instance/Door.lambda$reduceCurrentHp$0:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Npc;)V
  #544 = NameAndType        #525:#526     // lambda$reduceCurrentHp$0:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Npc;)V
  #545 = MethodType         #546          //  (Lext/mods/gameserver/model/actor/Npc;)V
  #546 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #547 = MethodType         #162          //  ()V
  #548 = MethodHandle       5:#549        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Door.lambda$changeState$0:(Z)V
  #549 = Methodref          #8.#550       // ext/mods/gameserver/model/actor/instance/Door.lambda$changeState$0:(Z)V
  #550 = NameAndType        #523:#524     // lambda$changeState$0:(Z)V
  #551 = MethodHandle       6:#552        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #552 = Methodref          #553.#554     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #553 = Class              #555          // java/lang/invoke/LambdaMetafactory
  #554 = NameAndType        #556:#557     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #555 = Utf8               java/lang/invoke/LambdaMetafactory
  #556 = Utf8               metafactory
  #557 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #558 = Utf8               InnerClasses
  #559 = Class              #560          // java/lang/invoke/MethodHandles$Lookup
  #560 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #561 = Class              #562          // java/lang/invoke/MethodHandles
  #562 = Utf8               java/lang/invoke/MethodHandles
  #563 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Door(int, ext.mods.gameserver.model.actor.template.DoorTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/DoorTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Creature."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
         6: aload_0
         7: aload_0
         8: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
        11: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/template/DoorTemplate.isOpened:()Z
        14: ifne          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: putfield      #19                 // Field _open:Z
        25: aload_0
        26: aload_2
        27: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getName:()Ljava/lang/String;
        30: invokevirtual #27                 // Method setName:(Ljava/lang/String;)V
        33: return
      LineNumberTable:
        line 70: 0
        line 72: 6
        line 74: 25
        line 75: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0      34     1 objectId   I
            0      34     2 template   Lext/mods/gameserver/model/actor/template/DoorTemplate;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/actor/instance/Door, int, class ext/mods/gameserver/model/actor/template/DoorTemplate ]
          stack = [ class ext/mods/gameserver/model/actor/instance/Door ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/Door, int, class ext/mods/gameserver/model/actor/template/DoorTemplate ]
          stack = [ class ext/mods/gameserver/model/actor/instance/Door, int ]

  public ext.mods.gameserver.model.actor.ai.type.DoorAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/DoorAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         4: checkcast     #35                 // class ext/mods/gameserver/model/actor/ai/type/DoorAI
         7: areturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public void setAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #35                 // class ext/mods/gameserver/model/actor/ai/type/DoorAI
         4: dup
         5: aload_0
         6: invokespecial #37                 // Method ext/mods/gameserver/model/actor/ai/type/DoorAI."<init>":(Lext/mods/gameserver/model/actor/instance/Door;)V
         9: putfield      #31                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        12: return
      LineNumberTable:
        line 86: 0
        line 87: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public final ext.mods.gameserver.model.actor.status.DoorStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/DoorStatus;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
         4: checkcast     #44                 // class ext/mods/gameserver/model/actor/status/DoorStatus
         7: areturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public void setStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #44                 // class ext/mods/gameserver/model/actor/status/DoorStatus
         4: dup
         5: aload_0
         6: invokespecial #46                 // Method ext/mods/gameserver/model/actor/status/DoorStatus."<init>":(Lext/mods/gameserver/model/actor/instance/Door;)V
         9: putfield      #40                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
        12: return
      LineNumberTable:
        line 98: 0
        line 99: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public final ext.mods.gameserver.model.actor.template.DoorTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/DoorTemplate;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #47                 // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         4: checkcast     #14                 // class ext/mods/gameserver/model/actor/template/DoorTemplate
         7: areturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public void addFuncsToNewCharacter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public void updateAbnormalEffect();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 115: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public ext.mods.gameserver.model.item.instance.ItemInstance getActiveWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public ext.mods.gameserver.model.item.kind.Weapon getActiveWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 126: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public ext.mods.gameserver.model.item.instance.ItemInstance getSecondaryWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public ext.mods.gameserver.model.item.kind.Weapon getSecondaryWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #50                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: instanceof    #54                 // class ext/mods/gameserver/model/actor/Playable
        14: ifne          19
        17: iconst_0
        18: ireturn
        19: aload_0
        20: getfield      #56                 // Field _residence:Lext/mods/gameserver/model/residence/Residence;
        23: astore_3
        24: aload_3
        25: instanceof    #60                 // class ext/mods/gameserver/model/residence/castle/Castle
        28: ifeq          112
        31: aload_3
        32: checkcast     #60                 // class ext/mods/gameserver/model/residence/castle/Castle
        35: astore_2
        36: aload_2
        37: invokevirtual #62                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        40: invokevirtual #66                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        43: ifeq          112
        46: aload_2
        47: invokevirtual #62                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        50: aload_1
        51: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        54: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        57: iconst_1
        58: anewarray     #81                 // class ext/mods/gameserver/enums/SiegeSide
        61: dup
        62: iconst_0
        63: getstatic     #83                 // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        66: aastore
        67: invokevirtual #87                 // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
        70: ifne          75
        73: iconst_0
        74: ireturn
        75: aload_0
        76: invokevirtual #91                 // Method isWall:()Z
        79: ifeq          110
        82: aload_1
        83: instanceof    #94                 // class ext/mods/gameserver/model/actor/instance/SiegeSummon
        86: ifeq          108
        89: aload_1
        90: checkcast     #94                 // class ext/mods/gameserver/model/actor/instance/SiegeSummon
        93: astore_3
        94: aload_3
        95: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/instance/SiegeSummon.getNpcId:()I
        98: sipush        14839
       101: if_icmpeq     108
       104: iconst_1
       105: goto          109
       108: iconst_0
       109: ireturn
       110: iconst_1
       111: ireturn
       112: aload_0
       113: getfield      #56                 // Field _residence:Lext/mods/gameserver/model/residence/Residence;
       116: astore_3
       117: aload_3
       118: instanceof    #100                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
       121: ifeq          179
       124: aload_3
       125: checkcast     #100                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
       128: astore_2
       129: aload_2
       130: invokevirtual #102                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
       133: ifeq          177
       136: aload_2
       137: invokevirtual #105                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
       140: invokevirtual #108                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.doorIsAutoAttackable:()Z
       143: ifeq          177
       146: aload_2
       147: invokevirtual #105                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
       150: aload_1
       151: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       154: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       157: iconst_1
       158: anewarray     #81                 // class ext/mods/gameserver/enums/SiegeSide
       161: dup
       162: iconst_0
       163: getstatic     #83                 // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       166: aastore
       167: invokevirtual #113                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
       170: ifeq          177
       173: iconst_1
       174: goto          178
       177: iconst_0
       178: ireturn
       179: iconst_0
       180: ireturn
      LineNumberTable:
        line 144: 0
        line 145: 8
        line 147: 10
        line 148: 17
        line 150: 19
        line 152: 46
        line 153: 73
        line 155: 75
        line 156: 82
        line 158: 110
        line 161: 112
        line 162: 129
        line 164: 179
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           94      14     3 siegeSummon   Lext/mods/gameserver/model/actor/instance/SiegeSummon;
           36      76     2 castle   Lext/mods/gameserver/model/residence/castle/Castle;
          129      50     2    sh   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0     181     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0     181     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 10
        frame_type = 10 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 32 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 252 /* append */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/model/residence/clanhall/SiegableHall ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public boolean isAttackableWithoutForceBy(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #114                // Method isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ireturn
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0       6     1 attacker   Lext/mods/gameserver/model/actor/Playable;

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #115                // Method canBeManuallyOpenedBy:(Lext/mods/gameserver/model/actor/Player;)Z
         5: ifeq          40
         8: aload_1
         9: aload_0
        10: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.setRequestedGate:(Lext/mods/gameserver/model/actor/instance/Door;)V
        13: aload_1
        14: new           #122                // class ext/mods/gameserver/network/serverpackets/ConfirmDlg
        17: dup
        18: aload_0
        19: invokevirtual #124                // Method isOpened:()Z
        22: ifne          31
        25: sipush        1140
        28: goto          34
        31: sipush        1141
        34: invokespecial #125                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
        37: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        40: return
      LineNumberTable:
        line 176: 0
        line 178: 8
        line 179: 13
        line 181: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0      41     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/actor/instance/Door, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 14, uninitialized 14 ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/Door, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 14, uninitialized 14, int ]
        frame_type = 5 /* same */

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=10, args_size=6
         0: aload_0
         1: getfield      #56                 // Field _residence:Lext/mods/gameserver/model/residence/Residence;
         4: astore        9
         6: aload         9
         8: instanceof    #60                 // class ext/mods/gameserver/model/residence/castle/Castle
        11: ifeq          72
        14: aload         9
        16: checkcast     #60                 // class ext/mods/gameserver/model/residence/castle/Castle
        19: astore        7
        21: aload         7
        23: invokevirtual #62                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        26: invokevirtual #66                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        29: ifeq          72
        32: aload_3
        33: instanceof    #94                 // class ext/mods/gameserver/model/actor/instance/SiegeSummon
        36: ifeq          57
        39: aload_3
        40: checkcast     #94                 // class ext/mods/gameserver/model/actor/instance/SiegeSummon
        43: astore        9
        45: aload         9
        47: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/instance/SiegeSummon.getNpcId:()I
        50: sipush        14839
        53: if_icmpne     57
        56: return
        57: aload_0
        58: dload_1
        59: aload_3
        60: iload         4
        62: iload         5
        64: aload         6
        66: invokespecial #132                // Method ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
        69: goto          116
        72: aload_0
        73: getfield      #56                 // Field _residence:Lext/mods/gameserver/model/residence/Residence;
        76: astore        9
        78: aload         9
        80: instanceof    #100                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        83: ifeq          116
        86: aload         9
        88: checkcast     #100                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        91: astore        8
        93: aload         8
        95: invokevirtual #136                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
        98: invokevirtual #140                // Method ext/mods/gameserver/model/zone/type/SiegeZone.isActive:()Z
       101: ifeq          116
       104: aload_0
       105: dload_1
       106: aload_3
       107: iload         4
       109: iload         5
       111: aload         6
       113: invokespecial #132                // Method ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
       116: aload_0
       117: ldc           #145                // class ext/mods/gameserver/model/actor/Npc
       119: sipush        600
       122: aload_0
       123: aload_3
       124: dload_1
       125: aload         6
       127: invokedynamic #147,  0            // InvokeDynamic #0:accept:(Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
       132: invokevirtual #151                // Method forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
       135: return
      LineNumberTable:
        line 186: 0
        line 188: 32
        line 189: 56
        line 191: 57
        line 193: 72
        line 194: 104
        line 196: 116
        line 227: 135
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45      12     9 siegeSummon   Lext/mods/gameserver/model/actor/instance/SiegeSummon;
           21      51     7 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           93      23     8    sh   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0     136     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0     136     1 damage   D
            0     136     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0     136     4 awake   Z
            0     136     5 isDOT   Z
            0     136     6 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 43 /* same */

  public void reduceCurrentHpByDOT(double, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=5, args_size=4
         0: return
      LineNumberTable:
        line 232: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0       1     1     i   D
            0       1     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0       1     4 skill   Lext/mods/gameserver/skills/L2Skill;

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         5: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/template/DoorTemplate.isOpened:()Z
         8: iconst_0
         9: invokevirtual #155                // Method changeState:(ZZ)V
        12: aload_0
        13: invokespecial #159                // Method ext/mods/gameserver/model/actor/Creature.onSpawn:()V
        16: return
      LineNumberTable:
        line 237: 0
        line 239: 12
        line 240: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #163                // Method ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: getfield      #19                 // Field _open:Z
        14: ifne          24
        17: invokestatic  #166                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        20: aload_0
        21: invokevirtual #172                // Method ext/mods/gameserver/geoengine/GeoEngine.removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
        24: aload_0
        25: getfield      #56                 // Field _residence:Lext/mods/gameserver/model/residence/Residence;
        28: astore_3
        29: aload_3
        30: instanceof    #60                 // class ext/mods/gameserver/model/residence/castle/Castle
        33: ifeq          84
        36: aload_3
        37: checkcast     #60                 // class ext/mods/gameserver/model/residence/castle/Castle
        40: astore_2
        41: aload_2
        42: invokevirtual #62                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        45: invokevirtual #66                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        48: ifeq          84
        51: aload_2
        52: invokevirtual #62                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        55: aload_0
        56: invokevirtual #91                 // Method isWall:()Z
        59: ifeq          68
        62: getstatic     #176                // Field ext/mods/gameserver/network/SystemMessageId.CASTLE_WALL_DAMAGED:Lext/mods/gameserver/network/SystemMessageId;
        65: goto          71
        68: getstatic     #182                // Field ext/mods/gameserver/network/SystemMessageId.CASTLE_GATE_BROKEN_DOWN:Lext/mods/gameserver/network/SystemMessageId;
        71: iconst_1
        72: anewarray     #81                 // class ext/mods/gameserver/enums/SiegeSide
        75: dup
        76: iconst_0
        77: getstatic     #185                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
        80: aastore
        81: invokevirtual #188                // Method ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
        84: aload_0
        85: getfield      #192                // Field _autoTask:Ljava/util/concurrent/ScheduledFuture;
        88: ifnull        107
        91: aload_0
        92: getfield      #192                // Field _autoTask:Ljava/util/concurrent/ScheduledFuture;
        95: iconst_0
        96: invokeinterface #196,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
       101: pop
       102: aload_0
       103: aconst_null
       104: putfield      #192                // Field _autoTask:Ljava/util/concurrent/ScheduledFuture;
       107: iconst_1
       108: ireturn
      LineNumberTable:
        line 245: 0
        line 246: 8
        line 248: 10
        line 249: 17
        line 251: 24
        line 252: 51
        line 254: 84
        line 256: 91
        line 257: 102
        line 260: 107
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      43     2 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0     109     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0     109     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 6
        frame_type = 10 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/actor/instance/Door, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/residence/castle/Castle ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/Door, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/residence/castle/Castle ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 22 /* same */

  public void doRevive();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         5: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/template/DoorTemplate.isOpened:()Z
         8: putfield      #19                 // Field _open:Z
        11: aload_0
        12: getfield      #19                 // Field _open:Z
        15: ifne          25
        18: invokestatic  #166                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        21: aload_0
        22: invokevirtual #202                // Method ext/mods/gameserver/geoengine/GeoEngine.addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
        25: aload_0
        26: invokespecial #205                // Method ext/mods/gameserver/model/actor/Creature.doRevive:()V
        29: return
      LineNumberTable:
        line 266: 0
        line 268: 11
        line 269: 18
        line 271: 25
        line 272: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/instance/Door;
      StackMapTable: number_of_entries = 1
        frame_type = 25 /* same */

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: new           #208                // class ext/mods/gameserver/network/serverpackets/DoorInfo
         4: dup
         5: aload_1
         6: aload_0
         7: invokespecial #210                // Method ext/mods/gameserver/network/serverpackets/DoorInfo."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;)V
        10: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        13: aload_1
        14: new           #213                // class ext/mods/gameserver/network/serverpackets/DoorStatusUpdate
        17: dup
        18: aload_0
        19: invokespecial #215                // Method ext/mods/gameserver/network/serverpackets/DoorStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/instance/Door;)V
        22: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        25: return
      LineNumberTable:
        line 277: 0
        line 278: 13
        line 279: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0      26     1 player   Lext/mods/gameserver/model/actor/Player;

  public int getGeoX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         4: invokevirtual #216                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getGeoX:()I
         7: ireturn
      LineNumberTable:
        line 284: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public int getGeoY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         4: invokevirtual #219                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getGeoY:()I
         7: ireturn
      LineNumberTable:
        line 290: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public int getGeoZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         4: invokevirtual #222                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getGeoZ:()I
         7: ireturn
      LineNumberTable:
        line 296: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public int getHeight();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         4: invokevirtual #225                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getCollisionHeight:()D
         7: d2i
         8: ireturn
      LineNumberTable:
        line 302: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public byte[][] getObjectGeoData();
    descriptor: ()[[B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         4: invokevirtual #229                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getGeoData:()[[B
         7: areturn
      LineNumberTable:
        line 308: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public double getCollisionHeight();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         4: invokevirtual #225                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getCollisionHeight:()D
         7: ldc2_w        #233                // double 2.0d
        10: ddiv
        11: dreturn
      LineNumberTable:
        line 314: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public boolean canBeHealed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 320: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public boolean isLethalable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 326: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public final int getDoorId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         4: invokevirtual #235                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getId:()I
         7: ireturn
      LineNumberTable:
        line 334: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public final boolean isOpened();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _open:Z
         4: ireturn
      LineNumberTable:
        line 342: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public final boolean isUnlockable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         4: invokevirtual #238                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getOpenType:()Lext/mods/gameserver/enums/OpenType;
         7: getstatic     #242                // Field ext/mods/gameserver/enums/OpenType.SKILL:Lext/mods/gameserver/enums/OpenType;
        10: if_acmpne     17
        13: iconst_1
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 350: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/instance/Door;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isWall();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         4: invokevirtual #248                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getType:()Lext/mods/gameserver/enums/DoorType;
         7: getstatic     #252                // Field ext/mods/gameserver/enums/DoorType.WALL:Lext/mods/gameserver/enums/DoorType;
        10: if_acmpne     17
        13: iconst_1
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 358: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/instance/Door;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final int getDamage();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=1, args_size=1
         0: iconst_0
         1: bipush        6
         3: bipush        6
         5: aload_0
         6: invokevirtual #258                // Method getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
         9: invokevirtual #262                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getHpRatio:()D
        12: ldc2_w        #265                // double 6.0d
        15: dmul
        16: invokestatic  #267                // Method java/lang/Math.ceil:(D)D
        19: d2i
        20: isub
        21: invokestatic  #273                // Method java/lang/Math.min:(II)I
        24: invokestatic  #277                // Method java/lang/Math.max:(II)I
        27: ireturn
      LineNumberTable:
        line 366: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public final void openMe();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: iconst_0
         3: invokevirtual #155                // Method changeState:(ZZ)V
         6: return
      LineNumberTable:
        line 374: 0
        line 375: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public final void closeMe();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: iconst_0
         3: invokevirtual #155                // Method changeState:(ZZ)V
         6: return
      LineNumberTable:
        line 382: 0
        line 383: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public final void changeState(boolean, boolean);
    descriptor: (ZZ)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=6, args_size=3
         0: aload_0
         1: invokevirtual #280                // Method isDead:()Z
         4: ifne          15
         7: aload_0
         8: getfield      #19                 // Field _open:Z
        11: iload_1
        12: if_icmpne     16
        15: return
        16: aload_0
        17: getfield      #192                // Field _autoTask:Ljava/util/concurrent/ScheduledFuture;
        20: ifnull        39
        23: aload_0
        24: getfield      #192                // Field _autoTask:Ljava/util/concurrent/ScheduledFuture;
        27: iconst_0
        28: invokeinterface #196,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        33: pop
        34: aload_0
        35: aconst_null
        36: putfield      #192                // Field _autoTask:Ljava/util/concurrent/ScheduledFuture;
        39: aload_0
        40: iload_1
        41: putfield      #19                 // Field _open:Z
        44: iload_1
        45: ifeq          58
        48: invokestatic  #166                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        51: aload_0
        52: invokevirtual #172                // Method ext/mods/gameserver/geoengine/GeoEngine.removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
        55: goto          65
        58: invokestatic  #166                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        61: aload_0
        62: invokevirtual #202                // Method ext/mods/gameserver/geoengine/GeoEngine.addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
        65: aload_0
        66: invokevirtual #258                // Method getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
        69: invokevirtual #283                // Method ext/mods/gameserver/model/actor/status/DoorStatus.broadcastStatusUpdate:()V
        72: iload_1
        73: ifeq          86
        76: invokestatic  #286                // Method ext/mods/extensions/listener/manager/DoorListenerManager.getInstance:()Lext/mods/extensions/listener/manager/DoorListenerManager;
        79: aload_0
        80: invokevirtual #291                // Method ext/mods/extensions/listener/manager/DoorListenerManager.notifyDoorOpen:(Lext/mods/gameserver/model/actor/instance/Door;)V
        83: goto          93
        86: invokestatic  #286                // Method ext/mods/extensions/listener/manager/DoorListenerManager.getInstance:()Lext/mods/extensions/listener/manager/DoorListenerManager;
        89: aload_0
        90: invokevirtual #294                // Method ext/mods/extensions/listener/manager/DoorListenerManager.notifyDoorClose:(Lext/mods/gameserver/model/actor/instance/Door;)V
        93: aload_0
        94: getfield      #297                // Field _quests:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
        97: ifnull        138
       100: iconst_0
       101: istore_3
       102: aload_0
       103: getfield      #297                // Field _quests:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
       106: invokevirtual #301                // Method it/unimi/dsi/fastutil/objects/ObjectArrayList.size:()I
       109: istore        4
       111: iload_3
       112: iload         4
       114: if_icmpge     138
       117: aload_0
       118: getfield      #297                // Field _quests:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
       121: iload_3
       122: invokevirtual #306                // Method it/unimi/dsi/fastutil/objects/ObjectArrayList.get:(I)Ljava/lang/Object;
       125: checkcast     #310                // class ext/mods/gameserver/scripting/Quest
       128: aload_0
       129: invokevirtual #312                // Method ext/mods/gameserver/scripting/Quest.onDoorChange:(Lext/mods/gameserver/model/actor/instance/Door;)V
       132: iinc          3, 1
       135: goto          111
       138: aload_0
       139: getfield      #315                // Field _npcMakers:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
       142: ifnull        192
       145: iconst_0
       146: istore_3
       147: aload_0
       148: getfield      #315                // Field _npcMakers:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
       151: invokevirtual #301                // Method it/unimi/dsi/fastutil/objects/ObjectArrayList.size:()I
       154: istore        4
       156: iload_3
       157: iload         4
       159: if_icmpge     192
       162: aload_0
       163: getfield      #315                // Field _npcMakers:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
       166: iload_3
       167: invokevirtual #306                // Method it/unimi/dsi/fastutil/objects/ObjectArrayList.get:(I)Ljava/lang/Object;
       170: checkcast     #318                // class ext/mods/gameserver/model/spawn/NpcMaker
       173: astore        5
       175: aload         5
       177: invokevirtual #320                // Method ext/mods/gameserver/model/spawn/NpcMaker.getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
       180: aload_0
       181: aload         5
       183: invokevirtual #324                // Method ext/mods/gameserver/scripting/SpawnMaker.onDoorEvent:(Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/model/spawn/NpcMaker;)V
       186: iinc          3, 1
       189: goto          156
       192: aload_0
       193: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       196: invokevirtual #330                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getTriggerId:()I
       199: istore_3
       200: iload_3
       201: ifle          225
       204: invokestatic  #333                // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
       207: iload_3
       208: invokevirtual #338                // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
       211: astore        4
       213: aload         4
       215: ifnull        225
       218: aload         4
       220: iload_1
       221: iconst_1
       222: invokevirtual #155                // Method changeState:(ZZ)V
       225: iload_2
       226: ifne          303
       229: iload_1
       230: ifeq          243
       233: aload_0
       234: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       237: invokevirtual #342                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getCloseTime:()I
       240: goto          250
       243: aload_0
       244: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       247: invokevirtual #345                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getOpenTime:()I
       250: istore        4
       252: aload_0
       253: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       256: invokevirtual #348                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getRandomTime:()I
       259: ifle          277
       262: iload         4
       264: aload_0
       265: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       268: invokevirtual #348                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getRandomTime:()I
       271: invokestatic  #351                // Method ext/mods/commons/random/Rnd.get:(I)I
       274: iadd
       275: istore        4
       277: iload         4
       279: ifle          303
       282: aload_0
       283: aload_0
       284: iload_1
       285: invokedynamic #356,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/model/actor/instance/Door;Z)Ljava/lang/Runnable;
       290: iload         4
       292: i2l
       293: ldc2_w        #360                // long 1000l
       296: lmul
       297: invokestatic  #362                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       300: putfield      #192                // Field _autoTask:Ljava/util/concurrent/ScheduledFuture;
       303: return
      LineNumberTable:
        line 392: 0
        line 393: 15
        line 395: 16
        line 397: 23
        line 398: 34
        line 401: 39
        line 402: 44
        line 403: 48
        line 405: 58
        line 407: 65
        line 409: 72
        line 410: 76
        line 412: 86
        line 414: 93
        line 416: 100
        line 418: 117
        line 416: 132
        line 422: 138
        line 424: 145
        line 426: 162
        line 427: 175
        line 424: 186
        line 431: 192
        line 432: 200
        line 434: 204
        line 435: 213
        line 436: 218
        line 439: 225
        line 441: 229
        line 442: 252
        line 443: 262
        line 445: 277
        line 447: 282
        line 450: 303
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          102      36     3     i   I
          111      27     4  size   I
          175      11     5 npcMaker   Lext/mods/gameserver/model/spawn/NpcMaker;
          147      45     3     i   I
          156      36     4  size   I
          213      12     4  door   Lext/mods/gameserver/model/actor/instance/Door;
          252      51     4  time   I
            0     304     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0     304     1  open   Z
            0     304     2 triggered   Z
          200     104     3 triggerId   I
      StackMapTable: number_of_entries = 16
        frame_type = 15 /* same */
        frame_type = 0 /* same */
        frame_type = 22 /* same */
        frame_type = 18 /* same */
        frame_type = 6 /* same */
        frame_type = 20 /* same */
        frame_type = 6 /* same */
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ int, int ]
        frame_type = 249 /* chop */
          offset_delta = 26
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ int, int ]
        frame_type = 249 /* chop */
          offset_delta = 35
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ int ]
        frame_type = 17 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 25

  public final ext.mods.gameserver.model.residence.Residence getResidence();
    descriptor: ()Lext/mods/gameserver/model/residence/Residence;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field _residence:Lext/mods/gameserver/model/residence/Residence;
         4: areturn
      LineNumberTable:
        line 454: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public final void setResidence(ext.mods.gameserver.model.residence.Residence);
    descriptor: (Lext/mods/gameserver/model/residence/Residence;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #56                 // Field _residence:Lext/mods/gameserver/model/residence/Residence;
         5: return
      LineNumberTable:
        line 459: 0
        line 460: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0       6     1 residence   Lext/mods/gameserver/model/residence/Residence;

  public void addQuestEvent(ext.mods.gameserver.scripting.Quest);
    descriptor: (Lext/mods/gameserver/scripting/Quest;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #297                // Field _quests:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
         4: ifnonnull     19
         7: aload_0
         8: new           #302                // class it/unimi/dsi/fastutil/objects/ObjectArrayList
        11: dup
        12: iconst_3
        13: invokespecial #368                // Method it/unimi/dsi/fastutil/objects/ObjectArrayList."<init>":(I)V
        16: putfield      #297                // Field _quests:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
        19: aload_0
        20: getfield      #297                // Field _quests:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
        23: aload_1
        24: invokevirtual #369                // Method it/unimi/dsi/fastutil/objects/ObjectArrayList.remove:(Ljava/lang/Object;)Z
        27: pop
        28: aload_0
        29: getfield      #297                // Field _quests:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
        32: aload_1
        33: invokevirtual #373                // Method it/unimi/dsi/fastutil/objects/ObjectArrayList.add:(Ljava/lang/Object;)Z
        36: pop
        37: return
      LineNumberTable:
        line 470: 0
        line 471: 7
        line 473: 19
        line 474: 28
        line 475: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0      38     1 quest   Lext/mods/gameserver/scripting/Quest;
      StackMapTable: number_of_entries = 1
        frame_type = 19 /* same */

  public void addMakerEvent(ext.mods.gameserver.model.spawn.NpcMaker);
    descriptor: (Lext/mods/gameserver/model/spawn/NpcMaker;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #315                // Field _npcMakers:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
         4: ifnonnull     19
         7: aload_0
         8: new           #302                // class it/unimi/dsi/fastutil/objects/ObjectArrayList
        11: dup
        12: iconst_3
        13: invokespecial #368                // Method it/unimi/dsi/fastutil/objects/ObjectArrayList."<init>":(I)V
        16: putfield      #315                // Field _npcMakers:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
        19: aload_0
        20: getfield      #315                // Field _npcMakers:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
        23: aload_1
        24: invokevirtual #369                // Method it/unimi/dsi/fastutil/objects/ObjectArrayList.remove:(Ljava/lang/Object;)Z
        27: pop
        28: aload_0
        29: getfield      #315                // Field _npcMakers:Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
        32: aload_1
        33: invokevirtual #373                // Method it/unimi/dsi/fastutil/objects/ObjectArrayList.add:(Ljava/lang/Object;)Z
        36: pop
        37: return
      LineNumberTable:
        line 485: 0
        line 486: 7
        line 488: 19
        line 489: 28
        line 490: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0      38     1 npcMaker   Lext/mods/gameserver/model/spawn/NpcMaker;
      StackMapTable: number_of_entries = 1
        frame_type = 19 /* same */

  public boolean canBeManuallyOpenedBy(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: ifnull        49
         7: aload_0
         8: getfield      #56                 // Field _residence:Lext/mods/gameserver/model/residence/Residence;
        11: astore_3
        12: aload_3
        13: instanceof    #376                // class ext/mods/gameserver/model/residence/clanhall/ClanHall
        16: ifeq          49
        19: aload_3
        20: checkcast     #376                // class ext/mods/gameserver/model/residence/clanhall/ClanHall
        23: astore_2
        24: aload_1
        25: invokevirtual #378                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        28: aload_2
        29: invokevirtual #381                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
        32: if_icmpne     49
        35: aload_1
        36: getstatic     #384                // Field ext/mods/gameserver/enums/PrivilegeType.CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
        39: invokevirtual #390                // Method ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
        42: ifeq          49
        45: iconst_1
        46: goto          50
        49: iconst_0
        50: ireturn
      LineNumberTable:
        line 498: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      25     2    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
            0      51     0  this   Lext/mods/gameserver/model/actor/instance/Door;
            0      51     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 49 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.actor.template.CreatureTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
         4: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public ext.mods.gameserver.model.actor.status.CreatureStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #258                // Method getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
         4: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public ext.mods.gameserver.model.actor.ai.type.CreatureAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #394                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/DoorAI;
         4: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Door;

  public ext.mods.gameserver.model.item.kind.Item getSecondaryWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #398                // Method getSecondaryWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
         4: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Door;
}
SourceFile: "Door.java"
BootstrapMethods:
  0: #551 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #540 (Ljava/lang/Object;)V
      #542 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Door.lambda$reduceCurrentHp$0:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Npc;)V
      #545 (Lext/mods/gameserver/model/actor/Npc;)V
  1: #551 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #547 ()V
      #548 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Door.lambda$changeState$0:(Z)V
      #547 ()V
InnerClasses:
  public static final #563= #559 of #561; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
