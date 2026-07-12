// Bytecode for: ext.mods.gameserver.model.group.PartyMatchRoom
// File: ext\mods\gameserver\model\group\PartyMatchRoom.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/group/PartyMatchRoom.class
  Last modified 9 de jul de 2026; size 9093 bytes
  MD5 checksum 58889644617add3beb1dee27eb4fbfb4
  Compiled from "PartyMatchRoom.java"
public class ext.mods.gameserver.model.group.PartyMatchRoom extends ext.mods.gameserver.model.group.AbstractGroup
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/group/PartyMatchRoom
  super_class: #2                         // ext/mods/gameserver/model/group/AbstractGroup
  interfaces: 0, fields: 8, methods: 29, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/group/AbstractGroup."<init>":(Lext/mods/gameserver/model/actor/Player;)V
    #2 = Class              #4            // ext/mods/gameserver/model/group/AbstractGroup
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
    #4 = Utf8               ext/mods/gameserver/model/group/AbstractGroup
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
    #7 = Class              #8            // java/util/concurrent/CopyOnWriteArrayList
    #8 = Utf8               java/util/concurrent/CopyOnWriteArrayList
    #9 = Methodref          #7.#10        // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
   #10 = NameAndType        #5:#11        // "<init>":()V
   #11 = Utf8               ()V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/group/PartyMatchRoom._members:Ljava/util/List;
   #13 = Class              #15           // ext/mods/gameserver/model/group/PartyMatchRoom
   #14 = NameAndType        #16:#17       // _members:Ljava/util/List;
   #15 = Utf8               ext/mods/gameserver/model/group/PartyMatchRoom
   #16 = Utf8               _members
   #17 = Utf8               Ljava/util/List;
   #18 = Fieldref           #13.#19       // ext/mods/gameserver/model/group/PartyMatchRoom._id:I
   #19 = NameAndType        #20:#21       // _id:I
   #20 = Utf8               _id
   #21 = Utf8               I
   #22 = Fieldref           #13.#23       // ext/mods/gameserver/model/group/PartyMatchRoom._title:Ljava/lang/String;
   #23 = NameAndType        #24:#25       // _title:Ljava/lang/String;
   #24 = Utf8               _title
   #25 = Utf8               Ljava/lang/String;
   #26 = Fieldref           #13.#27       // ext/mods/gameserver/model/group/PartyMatchRoom._lootType:I
   #27 = NameAndType        #28:#21       // _lootType:I
   #28 = Utf8               _lootType
   #29 = Methodref          #13.#30       // ext/mods/gameserver/model/group/PartyMatchRoom.refreshLocation:()V
   #30 = NameAndType        #31:#11       // refreshLocation:()V
   #31 = Utf8               refreshLocation
   #32 = Fieldref           #13.#33       // ext/mods/gameserver/model/group/PartyMatchRoom._minLvl:I
   #33 = NameAndType        #34:#21       // _minLvl:I
   #34 = Utf8               _minLvl
   #35 = Fieldref           #13.#36       // ext/mods/gameserver/model/group/PartyMatchRoom._maxLvl:I
   #36 = NameAndType        #37:#21       // _maxLvl:I
   #37 = Utf8               _maxLvl
   #38 = Fieldref           #13.#39       // ext/mods/gameserver/model/group/PartyMatchRoom._maxMembersCount:I
   #39 = NameAndType        #40:#21       // _maxMembersCount:I
   #40 = Utf8               _maxMembersCount
   #41 = InterfaceMethodref #42.#43       // java/util/List.add:(Ljava/lang/Object;)Z
   #42 = Class              #44           // java/util/List
   #43 = NameAndType        #45:#46       // add:(Ljava/lang/Object;)Z
   #44 = Utf8               java/util/List
   #45 = Utf8               add
   #46 = Utf8               (Ljava/lang/Object;)Z
   #47 = InterfaceMethodref #42.#48       // java/util/List.size:()I
   #48 = NameAndType        #49:#50       // size:()I
   #49 = Utf8               size
   #50 = Utf8               ()I
   #51 = InterfaceMethodref #42.#52       // java/util/List.contains:(Ljava/lang/Object;)Z
   #52 = NameAndType        #53:#46       // contains:(Ljava/lang/Object;)Z
   #53 = Utf8               contains
   #54 = InterfaceMethodref #42.#55       // java/util/List.iterator:()Ljava/util/Iterator;
   #55 = NameAndType        #56:#57       // iterator:()Ljava/util/Iterator;
   #56 = Utf8               iterator
   #57 = Utf8               ()Ljava/util/Iterator;
   #58 = InterfaceMethodref #59.#60       // java/util/Iterator.hasNext:()Z
   #59 = Class              #61           // java/util/Iterator
   #60 = NameAndType        #62:#63       // hasNext:()Z
   #61 = Utf8               java/util/Iterator
   #62 = Utf8               hasNext
   #63 = Utf8               ()Z
   #64 = InterfaceMethodref #59.#65       // java/util/Iterator.next:()Ljava/lang/Object;
   #65 = NameAndType        #66:#67       // next:()Ljava/lang/Object;
   #66 = Utf8               next
   #67 = Utf8               ()Ljava/lang/Object;
   #68 = Class              #69           // ext/mods/gameserver/model/actor/Player
   #69 = Utf8               ext/mods/gameserver/model/actor/Player
   #70 = Methodref          #68.#71       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #71 = NameAndType        #72:#73       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #72 = Utf8               sendPacket
   #73 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #74 = Methodref          #75.#76       // ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
   #75 = Class              #77           // ext/mods/gameserver/data/manager/RelationManager
   #76 = NameAndType        #78:#79       // getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
   #77 = Utf8               ext/mods/gameserver/data/manager/RelationManager
   #78 = Utf8               getInstance
   #79 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
   #80 = Methodref          #75.#81       // ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #81 = NameAndType        #82:#83       // isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #82 = Utf8               isInBlockList
   #83 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #84 = Class              #85           // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #85 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #86 = Methodref          #87.#88       // ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
   #87 = Class              #89           // ext/mods/gameserver/network/NpcStringId
   #88 = NameAndType        #90:#91       // getMessage:()Ljava/lang/String;
   #89 = Utf8               ext/mods/gameserver/network/NpcStringId
   #90 = Utf8               getMessage
   #91 = Utf8               ()Ljava/lang/String;
   #92 = Methodref          #84.#93       // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
   #93 = NameAndType        #5:#94        // "<init>":(Ljava/lang/String;I)V
   #94 = Utf8               (Ljava/lang/String;I)V
   #95 = Methodref          #13.#96       // ext/mods/gameserver/model/group/PartyMatchRoom.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #96 = NameAndType        #97:#73       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #97 = Utf8               broadcastPacket
   #98 = Methodref          #87.#99       // ext/mods/gameserver/network/NpcStringId.getMessage:([Ljava/lang/Object;)Ljava/lang/String;
   #99 = NameAndType        #90:#100      // getMessage:([Ljava/lang/Object;)Ljava/lang/String;
  #100 = Utf8               ([Ljava/lang/Object;)Ljava/lang/String;
  #101 = Fieldref           #102.#103     // ext/mods/gameserver/network/serverpackets/ExClosePartyRoom.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExClosePartyRoom;
  #102 = Class              #104          // ext/mods/gameserver/network/serverpackets/ExClosePartyRoom
  #103 = NameAndType        #105:#106     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExClosePartyRoom;
  #104 = Utf8               ext/mods/gameserver/network/serverpackets/ExClosePartyRoom
  #105 = Utf8               STATIC_PACKET
  #106 = Utf8               Lext/mods/gameserver/network/serverpackets/ExClosePartyRoom;
  #107 = Fieldref           #108.#109     // ext/mods/gameserver/network/SystemMessageId.PARTY_ROOM_DISBANDED:Lext/mods/gameserver/network/SystemMessageId;
  #108 = Class              #110          // ext/mods/gameserver/network/SystemMessageId
  #109 = NameAndType        #111:#112     // PARTY_ROOM_DISBANDED:Lext/mods/gameserver/network/SystemMessageId;
  #110 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #111 = Utf8               PARTY_ROOM_DISBANDED
  #112 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #113 = Methodref          #68.#114      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #114 = NameAndType        #72:#115      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #115 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #116 = Methodref          #68.#117      // ext/mods/gameserver/model/actor/Player.setPartyRoom:(I)V
  #117 = NameAndType        #118:#119     // setPartyRoom:(I)V
  #118 = Utf8               setPartyRoom
  #119 = Utf8               (I)V
  #120 = Methodref          #68.#121      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #121 = NameAndType        #122:#11      // broadcastUserInfo:()V
  #122 = Utf8               broadcastUserInfo
  #123 = InterfaceMethodref #42.#124      // java/util/List.clear:()V
  #124 = NameAndType        #125:#11      // clear:()V
  #125 = Utf8               clear
  #126 = Fieldref           #13.#127      // ext/mods/gameserver/model/group/PartyMatchRoom._location:I
  #127 = NameAndType        #128:#21      // _location:I
  #128 = Utf8               _location
  #129 = Methodref          #130.#131     // ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #130 = Class              #132          // ext/mods/gameserver/data/xml/RestartPointData
  #131 = NameAndType        #78:#133      // getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
  #132 = Utf8               ext/mods/gameserver/data/xml/RestartPointData
  #133 = Utf8               ()Lext/mods/gameserver/data/xml/RestartPointData;
  #134 = Methodref          #13.#135      // ext/mods/gameserver/model/group/PartyMatchRoom.getLeader:()Lext/mods/gameserver/model/actor/Player;
  #135 = NameAndType        #136:#137     // getLeader:()Lext/mods/gameserver/model/actor/Player;
  #136 = Utf8               getLeader
  #137 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #138 = Methodref          #130.#139     // ext/mods/gameserver/data/xml/RestartPointData.getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #139 = NameAndType        #140:#141     // getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #140 = Utf8               getRestartPoint
  #141 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #142 = Methodref          #143.#144     // ext/mods/gameserver/model/restart/RestartPoint.getBbs:()I
  #143 = Class              #145          // ext/mods/gameserver/model/restart/RestartPoint
  #144 = NameAndType        #146:#50      // getBbs:()I
  #145 = Utf8               ext/mods/gameserver/model/restart/RestartPoint
  #146 = Utf8               getBbs
  #147 = Methodref          #13.#148      // ext/mods/gameserver/model/group/PartyMatchRoom.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #148 = NameAndType        #149:#150     // isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #149 = Utf8               isLeader
  #150 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #151 = InterfaceMethodref #42.#152      // java/util/List.remove:(Ljava/lang/Object;)Z
  #152 = NameAndType        #153:#46      // remove:(Ljava/lang/Object;)Z
  #153 = Utf8               remove
  #154 = Fieldref           #108.#155     // ext/mods/gameserver/network/SystemMessageId.S1_LEFT_PARTY_ROOM:Lext/mods/gameserver/network/SystemMessageId;
  #155 = NameAndType        #156:#112     // S1_LEFT_PARTY_ROOM:Lext/mods/gameserver/network/SystemMessageId;
  #156 = Utf8               S1_LEFT_PARTY_ROOM
  #157 = Methodref          #158.#159     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #158 = Class              #160          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #159 = NameAndType        #161:#162     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #160 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #161 = Utf8               getSystemMessage
  #162 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #163 = Methodref          #158.#164     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #164 = NameAndType        #165:#166     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #165 = Utf8               addCharName
  #166 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #167 = Class              #168          // ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
  #168 = Utf8               ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
  #169 = Methodref          #167.#170     // ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
  #170 = NameAndType        #5:#171       // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
  #171 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
  #172 = Methodref          #173.#174     // ext/mods/gameserver/data/manager/PartyMatchRoomManager.getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
  #173 = Class              #175          // ext/mods/gameserver/data/manager/PartyMatchRoomManager
  #174 = NameAndType        #78:#176      // getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
  #175 = Utf8               ext/mods/gameserver/data/manager/PartyMatchRoomManager
  #176 = Utf8               ()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
  #177 = Methodref          #173.#178     // ext/mods/gameserver/data/manager/PartyMatchRoomManager.deleteRoom:(I)V
  #178 = NameAndType        #179:#119     // deleteRoom:(I)V
  #179 = Utf8               deleteRoom
  #180 = InterfaceMethodref #42.#181      // java/util/List.stream:()Ljava/util/stream/Stream;
  #181 = NameAndType        #182:#183     // stream:()Ljava/util/stream/Stream;
  #182 = Utf8               stream
  #183 = Utf8               ()Ljava/util/stream/Stream;
  #184 = InvokeDynamic      #0:#185       // #0:test:(Lext/mods/gameserver/model/group/PartyMatchRoom;)Ljava/util/function/Predicate;
  #185 = NameAndType        #186:#187     // test:(Lext/mods/gameserver/model/group/PartyMatchRoom;)Ljava/util/function/Predicate;
  #186 = Utf8               test
  #187 = Utf8               (Lext/mods/gameserver/model/group/PartyMatchRoom;)Ljava/util/function/Predicate;
  #188 = InterfaceMethodref #189.#190     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #189 = Class              #191          // java/util/stream/Stream
  #190 = NameAndType        #192:#193     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #191 = Utf8               java/util/stream/Stream
  #192 = Utf8               filter
  #193 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #194 = InterfaceMethodref #189.#195     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #195 = NameAndType        #196:#197     // findFirst:()Ljava/util/Optional;
  #196 = Utf8               findFirst
  #197 = Utf8               ()Ljava/util/Optional;
  #198 = Methodref          #199.#200     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #199 = Class              #201          // java/util/Optional
  #200 = NameAndType        #202:#203     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #201 = Utf8               java/util/Optional
  #202 = Utf8               orElse
  #203 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #204 = Methodref          #13.#205      // ext/mods/gameserver/model/group/PartyMatchRoom.changeLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #205 = NameAndType        #206:#6       // changeLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #206 = Utf8               changeLeader
  #207 = Methodref          #13.#208      // ext/mods/gameserver/model/group/PartyMatchRoom.removeMember:(Lext/mods/gameserver/model/actor/Player;)V
  #208 = NameAndType        #209:#6       // removeMember:(Lext/mods/gameserver/model/actor/Player;)V
  #209 = Utf8               removeMember
  #210 = InterfaceMethodref #42.#211      // java/util/List.indexOf:(Ljava/lang/Object;)I
  #211 = NameAndType        #212:#213     // indexOf:(Ljava/lang/Object;)I
  #212 = Utf8               indexOf
  #213 = Utf8               (Ljava/lang/Object;)I
  #214 = Methodref          #215.#216     // java/util/Collections.swap:(Ljava/util/List;II)V
  #215 = Class              #217          // java/util/Collections
  #216 = NameAndType        #218:#219     // swap:(Ljava/util/List;II)V
  #217 = Utf8               java/util/Collections
  #218 = Utf8               swap
  #219 = Utf8               (Ljava/util/List;II)V
  #220 = Methodref          #13.#221      // ext/mods/gameserver/model/group/PartyMatchRoom.setLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #221 = NameAndType        #222:#6       // setLeader:(Lext/mods/gameserver/model/actor/Player;)V
  #222 = Utf8               setLeader
  #223 = Fieldref           #108.#224     // ext/mods/gameserver/network/SystemMessageId.PARTY_ROOM_LEADER_CHANGED:Lext/mods/gameserver/network/SystemMessageId;
  #224 = NameAndType        #225:#112     // PARTY_ROOM_LEADER_CHANGED:Lext/mods/gameserver/network/SystemMessageId;
  #225 = Utf8               PARTY_ROOM_LEADER_CHANGED
  #226 = Methodref          #68.#227      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #227 = NameAndType        #228:#229     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #228 = Utf8               getStatus
  #229 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #230 = Methodref          #231.#232     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #231 = Class              #233          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #232 = NameAndType        #234:#50      // getLevel:()I
  #233 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #234 = Utf8               getLevel
  #235 = Utf8               Signature
  #236 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #237 = Utf8               (ILjava/lang/String;IIIILext/mods/gameserver/model/actor/Player;)V
  #238 = Utf8               Code
  #239 = Utf8               LineNumberTable
  #240 = Utf8               LocalVariableTable
  #241 = Utf8               this
  #242 = Utf8               Lext/mods/gameserver/model/group/PartyMatchRoom;
  #243 = Utf8               id
  #244 = Utf8               title
  #245 = Utf8               loot
  #246 = Utf8               minLvl
  #247 = Utf8               maxLvl
  #248 = Utf8               maxMembersCount
  #249 = Utf8               leader
  #250 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #251 = Utf8               getMembers
  #252 = Utf8               ()Ljava/util/List;
  #253 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #254 = Utf8               getMembersCount
  #255 = Utf8               containsPlayer
  #256 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #257 = Utf8               player
  #258 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #259 = Utf8               member
  #260 = Utf8               packet
  #261 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #262 = Utf8               StackMapTable
  #263 = Utf8               broadcastCreatureSay
  #264 = Utf8               (Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
  #265 = Utf8               msg
  #266 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #267 = Utf8               broadcaster
  #268 = Utf8               broadcastOnScreen
  #269 = Utf8               (ILext/mods/gameserver/network/NpcStringId;)V
  #270 = Utf8               time
  #271 = Utf8               npcStringId
  #272 = Utf8               Lext/mods/gameserver/network/NpcStringId;
  #273 = Utf8               (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
  #274 = Utf8               params
  #275 = Utf8               [Ljava/lang/Object;
  #276 = Utf8               recalculateLevel
  #277 = Utf8               disband
  #278 = Utf8               getId
  #279 = Utf8               getLootType
  #280 = Utf8               setLootType
  #281 = Utf8               lootType
  #282 = Utf8               getMinLvl
  #283 = Utf8               setMinLvl
  #284 = Utf8               getMaxLvl
  #285 = Utf8               setMaxLvl
  #286 = Utf8               getLocation
  #287 = Utf8               rp
  #288 = Utf8               Lext/mods/gameserver/model/restart/RestartPoint;
  #289 = Utf8               getMaxMembers
  #290 = Utf8               setMaxMembers
  #291 = Utf8               maxmem
  #292 = Utf8               getTitle
  #293 = Utf8               setTitle
  #294 = Utf8               (Ljava/lang/String;)V
  #295 = Utf8               addMember
  #296 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #297 = Utf8               roomId
  #298 = Utf8               newLeader
  #299 = Utf8               newLeaderIndex
  #300 = Utf8               oldLeader
  #301 = Utf8               isFull
  #302 = Utf8               checkEntrance
  #303 = Utf8               lambda$removeMember$0
  #304 = Utf8               m
  #305 = Utf8               SourceFile
  #306 = Utf8               PartyMatchRoom.java
  #307 = Utf8               BootstrapMethods
  #308 = MethodType         #46           //  (Ljava/lang/Object;)Z
  #309 = MethodHandle       5:#310        // REF_invokeVirtual ext/mods/gameserver/model/group/PartyMatchRoom.lambda$removeMember$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #310 = Methodref          #13.#311      // ext/mods/gameserver/model/group/PartyMatchRoom.lambda$removeMember$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #311 = NameAndType        #303:#150     // lambda$removeMember$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #312 = MethodType         #150          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #313 = MethodHandle       6:#314        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #314 = Methodref          #315.#316     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #315 = Class              #317          // java/lang/invoke/LambdaMetafactory
  #316 = NameAndType        #318:#319     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #317 = Utf8               java/lang/invoke/LambdaMetafactory
  #318 = Utf8               metafactory
  #319 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #320 = Utf8               InnerClasses
  #321 = Class              #322          // java/lang/invoke/MethodHandles$Lookup
  #322 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #323 = Class              #324          // java/lang/invoke/MethodHandles
  #324 = Utf8               java/lang/invoke/MethodHandles
  #325 = Utf8               Lookup
{
  public ext.mods.gameserver.model.group.PartyMatchRoom(int, java.lang.String, int, int, int, int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILjava/lang/String;IIIILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=8
         0: aload_0
         1: aload         7
         3: invokespecial #1                  // Method ext/mods/gameserver/model/group/AbstractGroup."<init>":(Lext/mods/gameserver/model/actor/Player;)V
         6: aload_0
         7: new           #7                  // class java/util/concurrent/CopyOnWriteArrayList
        10: dup
        11: invokespecial #9                  // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
        14: putfield      #12                 // Field _members:Ljava/util/List;
        17: aload_0
        18: iload_1
        19: putfield      #18                 // Field _id:I
        22: aload_0
        23: aload_2
        24: putfield      #22                 // Field _title:Ljava/lang/String;
        27: aload_0
        28: iload_3
        29: putfield      #26                 // Field _lootType:I
        32: aload_0
        33: invokevirtual #29                 // Method refreshLocation:()V
        36: aload_0
        37: iload         4
        39: putfield      #32                 // Field _minLvl:I
        42: aload_0
        43: iload         5
        45: putfield      #35                 // Field _maxLvl:I
        48: aload_0
        49: iload         6
        51: putfield      #38                 // Field _maxMembersCount:I
        54: aload_0
        55: getfield      #12                 // Field _members:Ljava/util/List;
        58: aload         7
        60: invokeinterface #41,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        65: pop
        66: return
      LineNumberTable:
        line 54: 0
        line 41: 6
        line 56: 17
        line 57: 22
        line 58: 27
        line 60: 32
        line 62: 36
        line 63: 42
        line 64: 48
        line 66: 54
        line 67: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0      67     1    id   I
            0      67     2 title   Ljava/lang/String;
            0      67     3  loot   I
            0      67     4 minLvl   I
            0      67     5 maxLvl   I
            0      67     6 maxMembersCount   I
            0      67     7 leader   Lext/mods/gameserver/model/actor/Player;

  public java.util.List<ext.mods.gameserver.model.actor.Player> getMembers();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
    Signature: #253                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;

  public int getMembersCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokeinterface #47,  1           // InterfaceMethod java/util/List.size:()I
         9: ireturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;

  public boolean containsPlayer(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: aload_1
         5: invokeinterface #51,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        10: ireturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0      11     1 player   Lext/mods/gameserver/model/WorldObject;

  public void broadcastPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokeinterface #54,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          37
        19: aload_2
        20: invokeinterface #64,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #68                 // class ext/mods/gameserver/model/actor/Player
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        34: goto          10
        37: return
      LineNumberTable:
        line 90: 0
        line 91: 29
        line 92: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       5     3 member   Lext/mods/gameserver/model/actor/Player;
            0      38     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0      38     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26

  public void broadcastCreatureSay(ext.mods.gameserver.network.serverpackets.CreatureSay, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokeinterface #54,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          51
        19: aload_3
        20: invokeinterface #64,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #68                 // class ext/mods/gameserver/model/actor/Player
        28: astore        4
        30: invokestatic  #74                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
        33: aload         4
        35: aload_2
        36: invokevirtual #80                 // Method ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
        39: ifne          48
        42: aload         4
        44: aload_1
        45: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        48: goto          10
        51: return
      LineNumberTable:
        line 97: 0
        line 99: 30
        line 100: 42
        line 101: 48
        line 102: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      18     4 member   Lext/mods/gameserver/model/actor/Player;
            0      52     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0      52     1   msg   Lext/mods/gameserver/network/serverpackets/CreatureSay;
            0      52     2 broadcaster   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void broadcastOnScreen(int, ext.mods.gameserver.network.NpcStringId);
    descriptor: (ILext/mods/gameserver/network/NpcStringId;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: new           #84                 // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
         4: dup
         5: aload_2
         6: invokevirtual #86                 // Method ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
         9: iload_1
        10: invokespecial #92                 // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
        13: invokevirtual #95                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        16: return
      LineNumberTable:
        line 107: 0
        line 108: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0      17     1  time   I
            0      17     2 npcStringId   Lext/mods/gameserver/network/NpcStringId;

  public void broadcastOnScreen(int, ext.mods.gameserver.network.NpcStringId, java.lang.Object...);
    descriptor: (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: new           #84                 // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
         4: dup
         5: aload_2
         6: aload_3
         7: invokevirtual #98                 // Method ext/mods/gameserver/network/NpcStringId.getMessage:([Ljava/lang/Object;)Ljava/lang/String;
        10: iload_1
        11: invokespecial #92                 // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
        14: invokevirtual #95                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        17: return
      LineNumberTable:
        line 113: 0
        line 114: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0      18     1  time   I
            0      18     2 npcStringId   Lext/mods/gameserver/network/NpcStringId;
            0      18     3 params   [Ljava/lang/Object;

  public void recalculateLevel();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 119: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;

  public void disband();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokeinterface #54,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          55
        19: aload_1
        20: invokeinterface #64,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #68                 // class ext/mods/gameserver/model/actor/Player
        28: astore_2
        29: aload_2
        30: getstatic     #101                // Field ext/mods/gameserver/network/serverpackets/ExClosePartyRoom.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExClosePartyRoom;
        33: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        36: aload_2
        37: getstatic     #107                // Field ext/mods/gameserver/network/SystemMessageId.PARTY_ROOM_DISBANDED:Lext/mods/gameserver/network/SystemMessageId;
        40: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        43: aload_2
        44: iconst_0
        45: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.setPartyRoom:(I)V
        48: aload_2
        49: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        52: goto          10
        55: aload_0
        56: getfield      #12                 // Field _members:Ljava/util/List;
        59: invokeinterface #123,  1          // InterfaceMethod java/util/List.clear:()V
        64: return
      LineNumberTable:
        line 124: 0
        line 126: 29
        line 127: 36
        line 129: 43
        line 130: 48
        line 131: 52
        line 132: 55
        line 133: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      23     2 member   Lext/mods/gameserver/model/actor/Player;
            0      65     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 44

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 137: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;

  public int getLootType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _lootType:I
         4: ireturn
      LineNumberTable:
        line 142: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;

  public void setLootType(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #26                 // Field _lootType:I
         5: return
      LineNumberTable:
        line 147: 0
        line 148: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0       6     1 lootType   I

  public int getMinLvl();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _minLvl:I
         4: ireturn
      LineNumberTable:
        line 152: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;

  public void setMinLvl(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #32                 // Field _minLvl:I
         5: return
      LineNumberTable:
        line 157: 0
        line 158: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0       6     1 minLvl   I

  public int getMaxLvl();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _maxLvl:I
         4: ireturn
      LineNumberTable:
        line 162: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;

  public void setMaxLvl(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #35                 // Field _maxLvl:I
         5: return
      LineNumberTable:
        line 167: 0
        line 168: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0       6     1 maxLvl   I

  public int getLocation();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #126                // Field _location:I
         4: ireturn
      LineNumberTable:
        line 172: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;

  public void refreshLocation();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: invokestatic  #129                // Method ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
         3: aload_0
         4: invokevirtual #134                // Method getLeader:()Lext/mods/gameserver/model/actor/Player;
         7: invokevirtual #138                // Method ext/mods/gameserver/data/xml/RestartPointData.getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
        10: astore_1
        11: aload_0
        12: aload_1
        13: ifnonnull     21
        16: bipush        100
        18: goto          25
        21: aload_1
        22: invokevirtual #142                // Method ext/mods/gameserver/model/restart/RestartPoint.getBbs:()I
        25: putfield      #126                // Field _location:I
        28: return
      LineNumberTable:
        line 177: 0
        line 178: 11
        line 179: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
           11      18     1    rp   Lext/mods/gameserver/model/restart/RestartPoint;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/group/PartyMatchRoom, class ext/mods/gameserver/model/restart/RestartPoint ]
          stack = [ class ext/mods/gameserver/model/group/PartyMatchRoom ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/group/PartyMatchRoom, class ext/mods/gameserver/model/restart/RestartPoint ]
          stack = [ class ext/mods/gameserver/model/group/PartyMatchRoom, int ]

  public int getMaxMembers();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _maxMembersCount:I
         4: ireturn
      LineNumberTable:
        line 183: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;

  public void setMaxMembers(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #38                 // Field _maxMembersCount:I
         5: return
      LineNumberTable:
        line 188: 0
        line 189: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0       6     1 maxmem   I

  public java.lang.String getTitle();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _title:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 193: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;

  public void setTitle(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #22                 // Field _title:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 198: 0
        line 199: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0       6     1 title   Ljava/lang/String;

  public void addMember(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: aload_1
         5: invokeinterface #41,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: aload_1
        12: iload_2
        13: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.setPartyRoom:(I)V
        16: aload_1
        17: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        20: return
      LineNumberTable:
        line 208: 0
        line 210: 11
        line 212: 16
        line 213: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0      21     1 player   Lext/mods/gameserver/model/actor/Player;
            0      21     2 roomId   I

  public void removeMember(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=2
         0: aload_1
         1: ifnull        17
         4: aload_0
         5: getfield      #12                 // Field _members:Ljava/util/List;
         8: aload_1
         9: invokeinterface #51,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        14: ifne          18
        17: return
        18: aload_0
        19: aload_1
        20: invokevirtual #147                // Method isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
        23: ifne          116
        26: aload_0
        27: getfield      #12                 // Field _members:Ljava/util/List;
        30: aload_1
        31: invokeinterface #151,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        36: pop
        37: aload_0
        38: getfield      #12                 // Field _members:Ljava/util/List;
        41: invokeinterface #54,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        46: astore_2
        47: aload_2
        48: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        53: ifeq          97
        56: aload_2
        57: invokeinterface #64,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        62: checkcast     #68                 // class ext/mods/gameserver/model/actor/Player
        65: astore_3
        66: aload_3
        67: getstatic     #154                // Field ext/mods/gameserver/network/SystemMessageId.S1_LEFT_PARTY_ROOM:Lext/mods/gameserver/network/SystemMessageId;
        70: invokestatic  #157                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        73: aload_1
        74: invokevirtual #163                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        77: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        80: aload_3
        81: new           #167                // class ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
        84: dup
        85: aload_1
        86: aload_0
        87: iconst_2
        88: invokespecial #169                // Method ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
        91: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        94: goto          47
        97: aload_1
        98: getstatic     #101                // Field ext/mods/gameserver/network/serverpackets/ExClosePartyRoom.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExClosePartyRoom;
       101: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       104: aload_1
       105: iconst_0
       106: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.setPartyRoom:(I)V
       109: aload_1
       110: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       113: goto          185
       116: aload_0
       117: getfield      #12                 // Field _members:Ljava/util/List;
       120: invokeinterface #47,  1           // InterfaceMethod java/util/List.size:()I
       125: iconst_1
       126: if_icmpne     142
       129: invokestatic  #172                // Method ext/mods/gameserver/data/manager/PartyMatchRoomManager.getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
       132: aload_0
       133: getfield      #18                 // Field _id:I
       136: invokevirtual #177                // Method ext/mods/gameserver/data/manager/PartyMatchRoomManager.deleteRoom:(I)V
       139: goto          185
       142: aload_0
       143: getfield      #12                 // Field _members:Ljava/util/List;
       146: invokeinterface #180,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       151: aload_0
       152: invokedynamic #184,  0            // InvokeDynamic #0:test:(Lext/mods/gameserver/model/group/PartyMatchRoom;)Ljava/util/function/Predicate;
       157: invokeinterface #188,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       162: invokeinterface #194,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
       167: aconst_null
       168: invokevirtual #198                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       171: checkcast     #68                 // class ext/mods/gameserver/model/actor/Player
       174: astore_2
       175: aload_0
       176: aload_2
       177: invokevirtual #204                // Method changeLeader:(Lext/mods/gameserver/model/actor/Player;)V
       180: aload_0
       181: aload_1
       182: invokevirtual #207                // Method removeMember:(Lext/mods/gameserver/model/actor/Player;)V
       185: return
      LineNumberTable:
        line 226: 0
        line 227: 17
        line 229: 18
        line 231: 26
        line 233: 37
        line 235: 66
        line 236: 80
        line 237: 94
        line 239: 97
        line 241: 104
        line 243: 109
        line 245: 116
        line 246: 129
        line 249: 142
        line 251: 175
        line 253: 180
        line 255: 185
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           66      28     3 member   Lext/mods/gameserver/model/actor/Player;
          175      10     2 newLeader   Lext/mods/gameserver/model/actor/Player;
            0     186     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0     186     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 7
        frame_type = 17 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 49
        frame_type = 18 /* same */
        frame_type = 25 /* same */
        frame_type = 42 /* same */

  public void changeLeader(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=2
         0: aload_1
         1: ifnull        38
         4: aload_0
         5: getfield      #12                 // Field _members:Ljava/util/List;
         8: aload_1
         9: invokeinterface #51,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        14: ifeq          38
        17: aload_0
        18: aload_1
        19: invokevirtual #147                // Method isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
        22: ifne          38
        25: aload_0
        26: getfield      #12                 // Field _members:Ljava/util/List;
        29: invokeinterface #47,  1           // InterfaceMethod java/util/List.size:()I
        34: iconst_1
        35: if_icmpne     39
        38: return
        39: aload_0
        40: getfield      #12                 // Field _members:Ljava/util/List;
        43: aload_1
        44: invokeinterface #210,  2          // InterfaceMethod java/util/List.indexOf:(Ljava/lang/Object;)I
        49: istore_2
        50: iload_2
        51: iconst_m1
        52: if_icmpne     56
        55: return
        56: aload_0
        57: invokevirtual #134                // Method getLeader:()Lext/mods/gameserver/model/actor/Player;
        60: astore_3
        61: aload_0
        62: getfield      #12                 // Field _members:Ljava/util/List;
        65: iconst_0
        66: iload_2
        67: invokestatic  #214                // Method java/util/Collections.swap:(Ljava/util/List;II)V
        70: aload_0
        71: aload_1
        72: invokevirtual #220                // Method setLeader:(Lext/mods/gameserver/model/actor/Player;)V
        75: aload_0
        76: getfield      #12                 // Field _members:Ljava/util/List;
        79: invokeinterface #54,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        84: astore        4
        86: aload         4
        88: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        93: ifeq          149
        96: aload         4
        98: invokeinterface #64,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       103: checkcast     #68                 // class ext/mods/gameserver/model/actor/Player
       106: astore        5
       108: aload         5
       110: new           #167                // class ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
       113: dup
       114: aload_1
       115: aload_0
       116: iconst_1
       117: invokespecial #169                // Method ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
       120: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       123: aload         5
       125: new           #167                // class ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
       128: dup
       129: aload_3
       130: aload_0
       131: iconst_1
       132: invokespecial #169                // Method ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
       135: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       138: aload         5
       140: getstatic     #223                // Field ext/mods/gameserver/network/SystemMessageId.PARTY_ROOM_LEADER_CHANGED:Lext/mods/gameserver/network/SystemMessageId;
       143: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       146: goto          86
       149: return
      LineNumberTable:
        line 263: 0
        line 264: 38
        line 266: 39
        line 267: 50
        line 268: 55
        line 270: 56
        line 272: 61
        line 274: 70
        line 276: 75
        line 278: 108
        line 279: 123
        line 280: 138
        line 281: 146
        line 282: 149
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          108      38     5 member   Lext/mods/gameserver/model/actor/Player;
            0     150     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0     150     1 newLeader   Lext/mods/gameserver/model/actor/Player;
           50     100     2 newLeaderIndex   I
           61      89     3 oldLeader   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 38 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ int ]
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 62

  public boolean isFull();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _members:Ljava/util/List;
         4: invokeinterface #47,  1           // InterfaceMethod java/util/List.size:()I
         9: aload_0
        10: getfield      #38                 // Field _maxMembersCount:I
        13: if_icmplt     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 289: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean checkEntrance(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
         4: invokevirtual #230                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
         7: aload_0
         8: getfield      #32                 // Field _minLvl:I
        11: if_icmplt     48
        14: aload_1
        15: invokevirtual #226                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        18: invokevirtual #230                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        21: aload_0
        22: getfield      #35                 // Field _maxLvl:I
        25: if_icmpgt     48
        28: aload_0
        29: getfield      #12                 // Field _members:Ljava/util/List;
        32: invokeinterface #47,  1           // InterfaceMethod java/util/List.size:()I
        37: aload_0
        38: getfield      #38                 // Field _maxMembersCount:I
        41: if_icmpge     48
        44: iconst_1
        45: goto          49
        48: iconst_0
        49: ireturn
      LineNumberTable:
        line 298: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0      50     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 48 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "PartyMatchRoom.java"
BootstrapMethods:
  0: #313 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #308 (Ljava/lang/Object;)Z
      #309 REF_invokeVirtual ext/mods/gameserver/model/group/PartyMatchRoom.lambda$removeMember$0:(Lext/mods/gameserver/model/actor/Player;)Z
      #312 (Lext/mods/gameserver/model/actor/Player;)Z
InnerClasses:
  public static final #325= #321 of #323; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
