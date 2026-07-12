// Bytecode for: ext.mods.gameserver.model.group.CommandChannel
// File: ext\mods\gameserver\model\group\CommandChannel.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/group/CommandChannel.class
  Last modified 9 de jul de 2026; size 6978 bytes
  MD5 checksum 9ab2736e2bc5125cd343eb2df8b91d0b
  Compiled from "CommandChannel.java"
public class ext.mods.gameserver.model.group.CommandChannel extends ext.mods.gameserver.model.group.AbstractGroup
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #19                         // ext/mods/gameserver/model/group/CommandChannel
  super_class: #8                         // ext/mods/gameserver/model/group/AbstractGroup
  interfaces: 0, fields: 1, methods: 15, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/group/Party.getLeader:()Lext/mods/gameserver/model/actor/Player;
    #2 = Class              #4            // ext/mods/gameserver/model/group/Party
    #3 = NameAndType        #5:#6         // getLeader:()Lext/mods/gameserver/model/actor/Player;
    #4 = Utf8               ext/mods/gameserver/model/group/Party
    #5 = Utf8               getLeader
    #6 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/group/AbstractGroup."<init>":(Lext/mods/gameserver/model/actor/Player;)V
    #8 = Class              #10           // ext/mods/gameserver/model/group/AbstractGroup
    #9 = NameAndType        #11:#12       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #10 = Utf8               ext/mods/gameserver/model/group/AbstractGroup
   #11 = Utf8               <init>
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #13 = Class              #14           // java/util/concurrent/CopyOnWriteArrayList
   #14 = Utf8               java/util/concurrent/CopyOnWriteArrayList
   #15 = Methodref          #13.#16       // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
   #16 = NameAndType        #11:#17       // "<init>":()V
   #17 = Utf8               ()V
   #18 = Fieldref           #19.#20       // ext/mods/gameserver/model/group/CommandChannel._parties:Ljava/util/List;
   #19 = Class              #21           // ext/mods/gameserver/model/group/CommandChannel
   #20 = NameAndType        #22:#23       // _parties:Ljava/util/List;
   #21 = Utf8               ext/mods/gameserver/model/group/CommandChannel
   #22 = Utf8               _parties
   #23 = Utf8               Ljava/util/List;
   #24 = InterfaceMethodref #25.#26       // java/util/List.add:(Ljava/lang/Object;)Z
   #25 = Class              #27           // java/util/List
   #26 = NameAndType        #28:#29       // add:(Ljava/lang/Object;)Z
   #27 = Utf8               java/util/List
   #28 = Utf8               add
   #29 = Utf8               (Ljava/lang/Object;)Z
   #30 = Methodref          #2.#31        // ext/mods/gameserver/model/group/Party.setCommandChannel:(Lext/mods/gameserver/model/group/CommandChannel;)V
   #31 = NameAndType        #32:#33       // setCommandChannel:(Lext/mods/gameserver/model/group/CommandChannel;)V
   #32 = Utf8               setCommandChannel
   #33 = Utf8               (Lext/mods/gameserver/model/group/CommandChannel;)V
   #34 = Methodref          #19.#35       // ext/mods/gameserver/model/group/CommandChannel.recalculateLevel:()V
   #35 = NameAndType        #36:#17       // recalculateLevel:()V
   #36 = Utf8               recalculateLevel
   #37 = Methodref          #2.#38        // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
   #38 = NameAndType        #39:#40       // getMembers:()Ljava/util/List;
   #39 = Utf8               getMembers
   #40 = Utf8               ()Ljava/util/List;
   #41 = InterfaceMethodref #25.#42       // java/util/List.iterator:()Ljava/util/Iterator;
   #42 = NameAndType        #43:#44       // iterator:()Ljava/util/Iterator;
   #43 = Utf8               iterator
   #44 = Utf8               ()Ljava/util/Iterator;
   #45 = InterfaceMethodref #46.#47       // java/util/Iterator.hasNext:()Z
   #46 = Class              #48           // java/util/Iterator
   #47 = NameAndType        #49:#50       // hasNext:()Z
   #48 = Utf8               java/util/Iterator
   #49 = Utf8               hasNext
   #50 = Utf8               ()Z
   #51 = InterfaceMethodref #46.#52       // java/util/Iterator.next:()Ljava/lang/Object;
   #52 = NameAndType        #53:#54       // next:()Ljava/lang/Object;
   #53 = Utf8               next
   #54 = Utf8               ()Ljava/lang/Object;
   #55 = Class              #56           // ext/mods/gameserver/model/actor/Player
   #56 = Utf8               ext/mods/gameserver/model/actor/Player
   #57 = Fieldref           #58.#59       // ext/mods/gameserver/network/SystemMessageId.COMMAND_CHANNEL_FORMED:Lext/mods/gameserver/network/SystemMessageId;
   #58 = Class              #60           // ext/mods/gameserver/network/SystemMessageId
   #59 = NameAndType        #61:#62       // COMMAND_CHANNEL_FORMED:Lext/mods/gameserver/network/SystemMessageId;
   #60 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #61 = Utf8               COMMAND_CHANNEL_FORMED
   #62 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #63 = Methodref          #55.#64       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #64 = NameAndType        #65:#66       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #65 = Utf8               sendPacket
   #66 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #67 = Fieldref           #68.#69       // ext/mods/gameserver/network/serverpackets/ExOpenMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOpenMPCC;
   #68 = Class              #70           // ext/mods/gameserver/network/serverpackets/ExOpenMPCC
   #69 = NameAndType        #71:#72       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOpenMPCC;
   #70 = Utf8               ext/mods/gameserver/network/serverpackets/ExOpenMPCC
   #71 = Utf8               STATIC_PACKET
   #72 = Utf8               Lext/mods/gameserver/network/serverpackets/ExOpenMPCC;
   #73 = Methodref          #55.#74       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #74 = NameAndType        #65:#75       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #75 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #76 = Fieldref           #58.#77       // ext/mods/gameserver/network/SystemMessageId.JOINED_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
   #77 = NameAndType        #78:#62       // JOINED_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
   #78 = Utf8               JOINED_COMMAND_CHANNEL
   #79 = Class              #80           // java/util/ArrayList
   #80 = Utf8               java/util/ArrayList
   #81 = Methodref          #79.#16       // java/util/ArrayList."<init>":()V
   #82 = InterfaceMethodref #25.#83       // java/util/List.addAll:(Ljava/util/Collection;)Z
   #83 = NameAndType        #84:#85       // addAll:(Ljava/util/Collection;)Z
   #84 = Utf8               addAll
   #85 = Utf8               (Ljava/util/Collection;)Z
   #86 = Methodref          #2.#87        // ext/mods/gameserver/model/group/Party.getMembersCount:()I
   #87 = NameAndType        #88:#89       // getMembersCount:()I
   #88 = Utf8               getMembersCount
   #89 = Utf8               ()I
   #90 = Methodref          #2.#91        // ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
   #91 = NameAndType        #92:#93       // containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
   #92 = Utf8               containsPlayer
   #93 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #94 = Methodref          #2.#95        // ext/mods/gameserver/model/group/Party.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #95 = NameAndType        #96:#75       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #96 = Utf8               broadcastPacket
   #97 = Methodref          #2.#98        // ext/mods/gameserver/model/group/Party.broadcastCreatureSay:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
   #98 = NameAndType        #99:#100      // broadcastCreatureSay:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
   #99 = Utf8               broadcastCreatureSay
  #100 = Utf8               (Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
  #101 = Class              #102          // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #102 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #103 = Methodref          #104.#105     // ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
  #104 = Class              #106          // ext/mods/gameserver/network/NpcStringId
  #105 = NameAndType        #107:#108     // getMessage:()Ljava/lang/String;
  #106 = Utf8               ext/mods/gameserver/network/NpcStringId
  #107 = Utf8               getMessage
  #108 = Utf8               ()Ljava/lang/String;
  #109 = Methodref          #101.#110     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
  #110 = NameAndType        #11:#111      // "<init>":(Ljava/lang/String;I)V
  #111 = Utf8               (Ljava/lang/String;I)V
  #112 = Methodref          #19.#95       // ext/mods/gameserver/model/group/CommandChannel.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #113 = Methodref          #104.#114     // ext/mods/gameserver/network/NpcStringId.getMessage:([Ljava/lang/Object;)Ljava/lang/String;
  #114 = NameAndType        #107:#115     // getMessage:([Ljava/lang/Object;)Ljava/lang/String;
  #115 = Utf8               ([Ljava/lang/Object;)Ljava/lang/String;
  #116 = Methodref          #2.#117       // ext/mods/gameserver/model/group/Party.getLevel:()I
  #117 = NameAndType        #118:#89      // getLevel:()I
  #118 = Utf8               getLevel
  #119 = Methodref          #19.#120      // ext/mods/gameserver/model/group/CommandChannel.setLevel:(I)V
  #120 = NameAndType        #121:#122     // setLevel:(I)V
  #121 = Utf8               setLevel
  #122 = Utf8               (I)V
  #123 = Fieldref           #124.#125     // ext/mods/gameserver/network/serverpackets/ExCloseMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExCloseMPCC;
  #124 = Class              #126          // ext/mods/gameserver/network/serverpackets/ExCloseMPCC
  #125 = NameAndType        #71:#127      // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExCloseMPCC;
  #126 = Utf8               ext/mods/gameserver/network/serverpackets/ExCloseMPCC
  #127 = Utf8               Lext/mods/gameserver/network/serverpackets/ExCloseMPCC;
  #128 = Fieldref           #58.#129      // ext/mods/gameserver/network/SystemMessageId.COMMAND_CHANNEL_DISBANDED:Lext/mods/gameserver/network/SystemMessageId;
  #129 = NameAndType        #130:#62      // COMMAND_CHANNEL_DISBANDED:Lext/mods/gameserver/network/SystemMessageId;
  #130 = Utf8               COMMAND_CHANNEL_DISBANDED
  #131 = Methodref          #2.#132       // ext/mods/gameserver/model/group/Party.broadcastMessage:(Lext/mods/gameserver/network/SystemMessageId;)V
  #132 = NameAndType        #133:#66      // broadcastMessage:(Lext/mods/gameserver/network/SystemMessageId;)V
  #133 = Utf8               broadcastMessage
  #134 = InterfaceMethodref #25.#135      // java/util/List.clear:()V
  #135 = NameAndType        #136:#17      // clear:()V
  #136 = Utf8               clear
  #137 = InterfaceMethodref #25.#138      // java/util/List.contains:(Ljava/lang/Object;)Z
  #138 = NameAndType        #139:#29      // contains:(Ljava/lang/Object;)Z
  #139 = Utf8               contains
  #140 = Class              #141          // ext/mods/gameserver/network/serverpackets/ExMPCCPartyInfoUpdate
  #141 = Utf8               ext/mods/gameserver/network/serverpackets/ExMPCCPartyInfoUpdate
  #142 = Methodref          #140.#143     // ext/mods/gameserver/network/serverpackets/ExMPCCPartyInfoUpdate."<init>":(Lext/mods/gameserver/model/group/Party;I)V
  #143 = NameAndType        #11:#144      // "<init>":(Lext/mods/gameserver/model/group/Party;I)V
  #144 = Utf8               (Lext/mods/gameserver/model/group/Party;I)V
  #145 = Methodref          #19.#117      // ext/mods/gameserver/model/group/CommandChannel.getLevel:()I
  #146 = InterfaceMethodref #25.#147      // java/util/List.size:()I
  #147 = NameAndType        #148:#89      // size:()I
  #148 = Utf8               size
  #149 = Methodref          #19.#150      // ext/mods/gameserver/model/group/CommandChannel.disband:()V
  #150 = NameAndType        #151:#17      // disband:()V
  #151 = Utf8               disband
  #152 = InterfaceMethodref #25.#153      // java/util/List.remove:(Ljava/lang/Object;)Z
  #153 = NameAndType        #154:#29      // remove:(Ljava/lang/Object;)Z
  #154 = Utf8               remove
  #155 = Methodref          #19.#156      // ext/mods/gameserver/model/group/CommandChannel.getLeaderObjectId:()I
  #156 = NameAndType        #157:#89      // getLeaderObjectId:()I
  #157 = Utf8               getLeaderObjectId
  #158 = Methodref          #55.#159      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #159 = NameAndType        #160:#161     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #160 = Utf8               getClan
  #161 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #162 = Methodref          #163.#164     // ext/mods/gameserver/model/pledge/Clan.getLeaderId:()I
  #163 = Class              #165          // ext/mods/gameserver/model/pledge/Clan
  #164 = NameAndType        #166:#89      // getLeaderId:()I
  #165 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #166 = Utf8               getLeaderId
  #167 = Methodref          #55.#168      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #168 = NameAndType        #169:#89      // getObjectId:()I
  #169 = Utf8               getObjectId
  #170 = Methodref          #163.#117     // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #171 = Fieldref           #58.#172      // ext/mods/gameserver/network/SystemMessageId.COMMAND_CHANNEL_ONLY_BY_LEVEL_5_CLAN_LEADER_PARTY_LEADER:Lext/mods/gameserver/network/SystemMessageId;
  #172 = NameAndType        #173:#62      // COMMAND_CHANNEL_ONLY_BY_LEVEL_5_CLAN_LEADER_PARTY_LEADER:Lext/mods/gameserver/network/SystemMessageId;
  #173 = Utf8               COMMAND_CHANNEL_ONLY_BY_LEVEL_5_CLAN_LEADER_PARTY_LEADER
  #174 = Methodref          #55.#175      // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #175 = NameAndType        #176:#177     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #176 = Utf8               getSkill
  #177 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #178 = Methodref          #55.#179      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #179 = NameAndType        #180:#181     // destroyItemByItemId:(IIZ)Z
  #180 = Utf8               destroyItemByItemId
  #181 = Utf8               (IIZ)Z
  #182 = Methodref          #55.#183      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #183 = NameAndType        #184:#185     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #184 = Utf8               getInventory
  #185 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #186 = Methodref          #187.#188     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #187 = Class              #189          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #188 = NameAndType        #190:#191     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #189 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #190 = Utf8               getItemByItemId
  #191 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #192 = Fieldref           #58.#193      // ext/mods/gameserver/network/SystemMessageId.CANNOT_LONGER_SETUP_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
  #193 = NameAndType        #194:#62      // CANNOT_LONGER_SETUP_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
  #194 = Utf8               CANNOT_LONGER_SETUP_COMMAND_CHANNEL
  #195 = Utf8               Signature
  #196 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/group/Party;>;
  #197 = Utf8               (Lext/mods/gameserver/model/group/Party;Lext/mods/gameserver/model/group/Party;)V
  #198 = Utf8               Code
  #199 = Utf8               LineNumberTable
  #200 = Utf8               LocalVariableTable
  #201 = Utf8               member
  #202 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #203 = Utf8               this
  #204 = Utf8               Lext/mods/gameserver/model/group/CommandChannel;
  #205 = Utf8               requestor
  #206 = Utf8               Lext/mods/gameserver/model/group/Party;
  #207 = Utf8               target
  #208 = Utf8               StackMapTable
  #209 = Utf8               party
  #210 = Utf8               members
  #211 = Utf8               LocalVariableTypeTable
  #212 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #213 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #214 = Utf8               count
  #215 = Utf8               I
  #216 = Utf8               player
  #217 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #218 = Utf8               packet
  #219 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #220 = Utf8               msg
  #221 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #222 = Utf8               broadcaster
  #223 = Utf8               broadcastOnScreen
  #224 = Utf8               (ILext/mods/gameserver/network/NpcStringId;)V
  #225 = Utf8               time
  #226 = Utf8               npcStringId
  #227 = Utf8               Lext/mods/gameserver/network/NpcStringId;
  #228 = Utf8               (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
  #229 = Utf8               params
  #230 = Utf8               [Ljava/lang/Object;
  #231 = Utf8               newLevel
  #232 = Utf8               addParty
  #233 = Utf8               (Lext/mods/gameserver/model/group/Party;)V
  #234 = Utf8               removeParty
  #235 = Utf8               (Lext/mods/gameserver/model/group/Party;)Z
  #236 = Utf8               getParties
  #237 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/group/Party;>;
  #238 = Utf8               equals
  #239 = Utf8               (Lext/mods/gameserver/model/group/CommandChannel;)Z
  #240 = Utf8               cc
  #241 = Utf8               checkAuthority
  #242 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Z
  #243 = Utf8               deleteItem
  #244 = Utf8               Z
  #245 = Utf8               requestorClan
  #246 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #247 = Utf8               hasItem
  #248 = Utf8               SourceFile
  #249 = Utf8               CommandChannel.java
{
  public ext.mods.gameserver.model.group.CommandChannel(ext.mods.gameserver.model.group.Party, ext.mods.gameserver.model.group.Party);
    descriptor: (Lext/mods/gameserver/model/group/Party;Lext/mods/gameserver/model/group/Party;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #1                  // Method ext/mods/gameserver/model/group/Party.getLeader:()Lext/mods/gameserver/model/actor/Player;
         5: invokespecial #7                  // Method ext/mods/gameserver/model/group/AbstractGroup."<init>":(Lext/mods/gameserver/model/actor/Player;)V
         8: aload_0
         9: new           #13                 // class java/util/concurrent/CopyOnWriteArrayList
        12: dup
        13: invokespecial #15                 // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
        16: putfield      #18                 // Field _parties:Ljava/util/List;
        19: aload_0
        20: getfield      #18                 // Field _parties:Ljava/util/List;
        23: aload_1
        24: invokeinterface #24,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        29: pop
        30: aload_0
        31: getfield      #18                 // Field _parties:Ljava/util/List;
        34: aload_2
        35: invokeinterface #24,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        40: pop
        41: aload_1
        42: aload_0
        43: invokevirtual #30                 // Method ext/mods/gameserver/model/group/Party.setCommandChannel:(Lext/mods/gameserver/model/group/CommandChannel;)V
        46: aload_2
        47: aload_0
        48: invokevirtual #30                 // Method ext/mods/gameserver/model/group/Party.setCommandChannel:(Lext/mods/gameserver/model/group/CommandChannel;)V
        51: aload_0
        52: invokevirtual #34                 // Method recalculateLevel:()V
        55: aload_1
        56: invokevirtual #37                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        59: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        64: astore_3
        65: aload_3
        66: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        71: ifeq          104
        74: aload_3
        75: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        80: checkcast     #55                 // class ext/mods/gameserver/model/actor/Player
        83: astore        4
        85: aload         4
        87: getstatic     #57                 // Field ext/mods/gameserver/network/SystemMessageId.COMMAND_CHANNEL_FORMED:Lext/mods/gameserver/network/SystemMessageId;
        90: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        93: aload         4
        95: getstatic     #67                 // Field ext/mods/gameserver/network/serverpackets/ExOpenMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOpenMPCC;
        98: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       101: goto          65
       104: aload_2
       105: invokevirtual #37                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       108: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       113: astore_3
       114: aload_3
       115: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       120: ifeq          153
       123: aload_3
       124: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       129: checkcast     #55                 // class ext/mods/gameserver/model/actor/Player
       132: astore        4
       134: aload         4
       136: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.JOINED_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
       139: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       142: aload         4
       144: getstatic     #67                 // Field ext/mods/gameserver/network/serverpackets/ExOpenMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOpenMPCC;
       147: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       150: goto          114
       153: return
      LineNumberTable:
        line 67: 0
        line 63: 8
        line 69: 19
        line 70: 30
        line 72: 41
        line 73: 46
        line 75: 51
        line 77: 55
        line 79: 85
        line 80: 93
        line 81: 101
        line 83: 104
        line 85: 134
        line 86: 142
        line 87: 150
        line 88: 153
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           85      16     4 member   Lext/mods/gameserver/model/actor/Player;
          134      16     4 member   Lext/mods/gameserver/model/actor/Player;
            0     154     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            0     154     1 requestor   Lext/mods/gameserver/model/group/Party;
            0     154     2 target   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 65
          locals = [ class ext/mods/gameserver/model/group/CommandChannel, class ext/mods/gameserver/model/group/Party, class ext/mods/gameserver/model/group/Party, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 38
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 38

  public java.util.List<ext.mods.gameserver.model.actor.Player> getMembers();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: new           #79                 // class java/util/ArrayList
         3: dup
         4: invokespecial #81                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_0
         9: getfield      #18                 // Field _parties:Ljava/util/List;
        12: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        17: astore_2
        18: aload_2
        19: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          51
        27: aload_2
        28: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #2                  // class ext/mods/gameserver/model/group/Party
        36: astore_3
        37: aload_1
        38: aload_3
        39: invokevirtual #37                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        42: invokeinterface #82,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
        47: pop
        48: goto          18
        51: aload_1
        52: areturn
      LineNumberTable:
        line 96: 0
        line 97: 8
        line 98: 37
        line 100: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      11     3 party   Lext/mods/gameserver/model/group/Party;
            0      53     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            8      45     1 members   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      45     1 members   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 32
    Signature: #213                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;

  public int getMembersCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: getfield      #18                 // Field _parties:Ljava/util/List;
         6: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          41
        21: aload_2
        22: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #2                  // class ext/mods/gameserver/model/group/Party
        30: astore_3
        31: iload_1
        32: aload_3
        33: invokevirtual #86                 // Method ext/mods/gameserver/model/group/Party.getMembersCount:()I
        36: iadd
        37: istore_1
        38: goto          12
        41: iload_1
        42: ireturn
      LineNumberTable:
        line 106: 0
        line 107: 2
        line 108: 31
        line 110: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31       7     3 party   Lext/mods/gameserver/model/group/Party;
            0      43     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            2      41     1 count   I
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 12
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public boolean containsPlayer(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _parties:Ljava/util/List;
         4: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_2
        20: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #2                  // class ext/mods/gameserver/model/group/Party
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokevirtual #90                 // Method ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
        34: ifeq          39
        37: iconst_1
        38: ireturn
        39: goto          10
        42: iconst_0
        43: ireturn
      LineNumberTable:
        line 116: 0
        line 118: 29
        line 119: 37
        line 120: 39
        line 121: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      10     3 party   Lext/mods/gameserver/model/group/Party;
            0      44     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            0      44     1 player   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 28 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void broadcastPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _parties:Ljava/util/List;
         4: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          37
        19: aload_2
        20: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #2                  // class ext/mods/gameserver/model/group/Party
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokevirtual #94                 // Method ext/mods/gameserver/model/group/Party.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        34: goto          10
        37: return
      LineNumberTable:
        line 127: 0
        line 128: 29
        line 129: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       5     3 party   Lext/mods/gameserver/model/group/Party;
            0      38     0  this   Lext/mods/gameserver/model/group/CommandChannel;
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
         1: getfield      #18                 // Field _parties:Ljava/util/List;
         4: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          40
        19: aload_3
        20: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #2                  // class ext/mods/gameserver/model/group/Party
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokevirtual #97                 // Method ext/mods/gameserver/model/group/Party.broadcastCreatureSay:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
        37: goto          10
        40: return
      LineNumberTable:
        line 134: 0
        line 135: 30
        line 136: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       7     4 party   Lext/mods/gameserver/model/group/Party;
            0      41     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            0      41     1   msg   Lext/mods/gameserver/network/serverpackets/CreatureSay;
            0      41     2 broadcaster   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 29

  public void broadcastOnScreen(int, ext.mods.gameserver.network.NpcStringId);
    descriptor: (ILext/mods/gameserver/network/NpcStringId;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: new           #101                // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
         4: dup
         5: aload_2
         6: invokevirtual #103                // Method ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
         9: iload_1
        10: invokespecial #109                // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
        13: invokevirtual #112                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        16: return
      LineNumberTable:
        line 141: 0
        line 142: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            0      17     1  time   I
            0      17     2 npcStringId   Lext/mods/gameserver/network/NpcStringId;

  public void broadcastOnScreen(int, ext.mods.gameserver.network.NpcStringId, java.lang.Object...);
    descriptor: (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: new           #101                // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
         4: dup
         5: aload_2
         6: aload_3
         7: invokevirtual #113                // Method ext/mods/gameserver/network/NpcStringId.getMessage:([Ljava/lang/Object;)Ljava/lang/String;
        10: iload_1
        11: invokespecial #109                // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
        14: invokevirtual #112                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        17: return
      LineNumberTable:
        line 147: 0
        line 148: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            0      18     1  time   I
            0      18     2 npcStringId   Lext/mods/gameserver/network/NpcStringId;
            0      18     3 params   [Ljava/lang/Object;

  public void recalculateLevel();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: getfield      #18                 // Field _parties:Ljava/util/List;
         6: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          47
        21: aload_2
        22: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #2                  // class ext/mods/gameserver/model/group/Party
        30: astore_3
        31: aload_3
        32: invokevirtual #116                // Method ext/mods/gameserver/model/group/Party.getLevel:()I
        35: iload_1
        36: if_icmple     44
        39: aload_3
        40: invokevirtual #116                // Method ext/mods/gameserver/model/group/Party.getLevel:()I
        43: istore_1
        44: goto          12
        47: aload_0
        48: iload_1
        49: invokevirtual #119                // Method setLevel:(I)V
        52: return
      LineNumberTable:
        line 153: 0
        line 154: 2
        line 156: 31
        line 157: 39
        line 158: 44
        line 159: 47
        line 160: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      13     3 party   Lext/mods/gameserver/model/group/Party;
            0      53     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            2      51     1 newLevel   I
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 12
          locals = [ int, class java/util/Iterator ]
        frame_type = 31 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void disband();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _parties:Ljava/util/List;
         4: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          51
        19: aload_1
        20: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #2                  // class ext/mods/gameserver/model/group/Party
        28: astore_2
        29: aload_2
        30: aconst_null
        31: invokevirtual #30                 // Method ext/mods/gameserver/model/group/Party.setCommandChannel:(Lext/mods/gameserver/model/group/CommandChannel;)V
        34: aload_2
        35: getstatic     #123                // Field ext/mods/gameserver/network/serverpackets/ExCloseMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExCloseMPCC;
        38: invokevirtual #94                 // Method ext/mods/gameserver/model/group/Party.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        41: aload_2
        42: getstatic     #128                // Field ext/mods/gameserver/network/SystemMessageId.COMMAND_CHANNEL_DISBANDED:Lext/mods/gameserver/network/SystemMessageId;
        45: invokevirtual #131                // Method ext/mods/gameserver/model/group/Party.broadcastMessage:(Lext/mods/gameserver/network/SystemMessageId;)V
        48: goto          10
        51: aload_0
        52: getfield      #18                 // Field _parties:Ljava/util/List;
        55: invokeinterface #134,  1          // InterfaceMethod java/util/List.clear:()V
        60: return
      LineNumberTable:
        line 165: 0
        line 167: 29
        line 168: 34
        line 169: 41
        line 170: 48
        line 171: 51
        line 172: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      19     2 party   Lext/mods/gameserver/model/group/Party;
            0      61     0  this   Lext/mods/gameserver/model/group/CommandChannel;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 40

  public void addParty(ext.mods.gameserver.model.group.Party);
    descriptor: (Lext/mods/gameserver/model/group/Party;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_1
         1: ifnull        17
         4: aload_0
         5: getfield      #18                 // Field _parties:Ljava/util/List;
         8: aload_1
         9: invokeinterface #137,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        14: ifeq          18
        17: return
        18: aload_0
        19: new           #140                // class ext/mods/gameserver/network/serverpackets/ExMPCCPartyInfoUpdate
        22: dup
        23: aload_1
        24: iconst_1
        25: invokespecial #142                // Method ext/mods/gameserver/network/serverpackets/ExMPCCPartyInfoUpdate."<init>":(Lext/mods/gameserver/model/group/Party;I)V
        28: invokevirtual #112                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        31: aload_0
        32: getfield      #18                 // Field _parties:Ljava/util/List;
        35: aload_1
        36: invokeinterface #24,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        41: pop
        42: aload_1
        43: invokevirtual #116                // Method ext/mods/gameserver/model/group/Party.getLevel:()I
        46: aload_0
        47: invokevirtual #145                // Method getLevel:()I
        50: if_icmple     61
        53: aload_0
        54: aload_1
        55: invokevirtual #116                // Method ext/mods/gameserver/model/group/Party.getLevel:()I
        58: invokevirtual #119                // Method setLevel:(I)V
        61: aload_1
        62: aload_0
        63: invokevirtual #30                 // Method ext/mods/gameserver/model/group/Party.setCommandChannel:(Lext/mods/gameserver/model/group/CommandChannel;)V
        66: aload_1
        67: invokevirtual #37                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        70: invokeinterface #41,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        75: astore_2
        76: aload_2
        77: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        82: ifeq          112
        85: aload_2
        86: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        91: checkcast     #55                 // class ext/mods/gameserver/model/actor/Player
        94: astore_3
        95: aload_3
        96: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.JOINED_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
        99: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       102: aload_3
       103: getstatic     #67                 // Field ext/mods/gameserver/network/serverpackets/ExOpenMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOpenMPCC;
       106: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       109: goto          76
       112: return
      LineNumberTable:
        line 180: 0
        line 181: 17
        line 183: 18
        line 185: 31
        line 187: 42
        line 188: 53
        line 190: 61
        line 192: 66
        line 194: 95
        line 195: 102
        line 196: 109
        line 197: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           95      14     3 member   Lext/mods/gameserver/model/actor/Player;
            0     113     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            0     113     1 party   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 5
        frame_type = 17 /* same */
        frame_type = 0 /* same */
        frame_type = 42 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 35

  public boolean removeParty(ext.mods.gameserver.model.group.Party);
    descriptor: (Lext/mods/gameserver/model/group/Party;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: ifnull        17
         4: aload_0
         5: getfield      #18                 // Field _parties:Ljava/util/List;
         8: aload_1
         9: invokeinterface #137,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        14: ifne          19
        17: iconst_0
        18: ireturn
        19: aload_0
        20: getfield      #18                 // Field _parties:Ljava/util/List;
        23: invokeinterface #146,  1          // InterfaceMethod java/util/List.size:()I
        28: iconst_2
        29: if_icmpne     39
        32: aload_0
        33: invokevirtual #149                // Method disband:()V
        36: goto          79
        39: aload_0
        40: getfield      #18                 // Field _parties:Ljava/util/List;
        43: aload_1
        44: invokeinterface #152,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        49: pop
        50: aload_1
        51: aconst_null
        52: invokevirtual #30                 // Method ext/mods/gameserver/model/group/Party.setCommandChannel:(Lext/mods/gameserver/model/group/CommandChannel;)V
        55: aload_1
        56: getstatic     #123                // Field ext/mods/gameserver/network/serverpackets/ExCloseMPCC.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExCloseMPCC;
        59: invokevirtual #94                 // Method ext/mods/gameserver/model/group/Party.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        62: aload_0
        63: invokevirtual #34                 // Method recalculateLevel:()V
        66: aload_0
        67: new           #140                // class ext/mods/gameserver/network/serverpackets/ExMPCCPartyInfoUpdate
        70: dup
        71: aload_1
        72: iconst_0
        73: invokespecial #142                // Method ext/mods/gameserver/network/serverpackets/ExMPCCPartyInfoUpdate."<init>":(Lext/mods/gameserver/model/group/Party;I)V
        76: invokevirtual #112                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        79: iconst_1
        80: ireturn
      LineNumberTable:
        line 206: 0
        line 207: 17
        line 209: 19
        line 210: 32
        line 213: 39
        line 215: 50
        line 216: 55
        line 218: 62
        line 220: 66
        line 222: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      81     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            0      81     1 party   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 4
        frame_type = 17 /* same */
        frame_type = 1 /* same */
        frame_type = 19 /* same */
        frame_type = 39 /* same */

  public java.util.List<ext.mods.gameserver.model.group.Party> getParties();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _parties:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 230: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/CommandChannel;
    Signature: #237                         // ()Ljava/util/List<Lext/mods/gameserver/model/group/Party;>;

  public boolean equals(ext.mods.gameserver.model.group.CommandChannel);
    descriptor: (Lext/mods/gameserver/model/group/CommandChannel;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        19
         4: aload_0
         5: invokevirtual #155                // Method getLeaderObjectId:()I
         8: aload_1
         9: invokevirtual #155                // Method getLeaderObjectId:()I
        12: if_icmpne     19
        15: iconst_1
        16: goto          20
        19: iconst_0
        20: ireturn
      LineNumberTable:
        line 240: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/group/CommandChannel;
            0      21     1    cc   Lext/mods/gameserver/model/group/CommandChannel;
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public static boolean checkAuthority(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore_2
         5: aload_2
         6: ifnull        28
         9: aload_2
        10: invokevirtual #162                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderId:()I
        13: aload_0
        14: invokevirtual #167                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        17: if_icmpne     28
        20: aload_2
        21: invokevirtual #170                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
        24: iconst_5
        25: if_icmpge     37
        28: aload_0
        29: getstatic     #171                // Field ext/mods/gameserver/network/SystemMessageId.COMMAND_CHANNEL_ONLY_BY_LEVEL_5_CLAN_LEADER_PARTY_LEADER:Lext/mods/gameserver/network/SystemMessageId;
        32: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        35: iconst_0
        36: ireturn
        37: aload_0
        38: sipush        391
        41: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
        44: ifnull        49
        47: iconst_1
        48: ireturn
        49: iload_1
        50: ifeq          65
        53: aload_0
        54: sipush        8871
        57: iconst_1
        58: iconst_1
        59: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        62: goto          83
        65: aload_0
        66: invokevirtual #182                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        69: sipush        8871
        72: invokevirtual #186                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        75: ifnull        82
        78: iconst_1
        79: goto          83
        82: iconst_0
        83: istore_3
        84: iload_3
        85: ifne          95
        88: aload_0
        89: getstatic     #192                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_LONGER_SETUP_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
        92: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        95: iload_3
        96: ireturn
      LineNumberTable:
        line 251: 0
        line 252: 5
        line 254: 28
        line 255: 35
        line 258: 37
        line 259: 47
        line 261: 49
        line 262: 84
        line 263: 88
        line 265: 95
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      97     0 player   Lext/mods/gameserver/model/actor/Player;
            0      97     1 deleteItem   Z
            5      92     2 requestorClan   Lext/mods/gameserver/model/pledge/Clan;
           84      13     3 hasItem   Z
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 8 /* same */
        frame_type = 11 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
}
SourceFile: "CommandChannel.java"
