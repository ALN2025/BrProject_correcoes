// Bytecode for: ext.mods.gameserver.model.entity.Duel
// File: ext\mods\gameserver\model\entity\Duel.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/Duel.class
  Last modified 9 de jul de 2026; size 14178 bytes
  MD5 checksum f4afd5b262c7cbcd6a54ffdc5bf5324b
  Compiled from "Duel.java"
public class ext.mods.gameserver.model.entity.Duel
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/entity/Duel
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 11, methods: 22, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #8 = Class              #10           // java/util/concurrent/ConcurrentHashMap
    #9 = NameAndType        #11:#12       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #10 = Utf8               java/util/concurrent/ConcurrentHashMap
   #11 = Utf8               newKeySet
   #12 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/entity/Duel._playerConditions:Ljava/util/Set;
   #14 = Class              #16           // ext/mods/gameserver/model/entity/Duel
   #15 = NameAndType        #17:#18       // _playerConditions:Ljava/util/Set;
   #16 = Utf8               ext/mods/gameserver/model/entity/Duel
   #17 = Utf8               _playerConditions
   #18 = Utf8               Ljava/util/Set;
   #19 = Fieldref           #14.#20       // ext/mods/gameserver/model/entity/Duel._countdown:I
   #20 = NameAndType        #21:#22       // _countdown:I
   #21 = Utf8               _countdown
   #22 = Utf8               I
   #23 = Fieldref           #14.#24       // ext/mods/gameserver/model/entity/Duel._duelId:I
   #24 = NameAndType        #25:#22       // _duelId:I
   #25 = Utf8               _duelId
   #26 = Fieldref           #14.#27       // ext/mods/gameserver/model/entity/Duel._playerA:Lext/mods/gameserver/model/actor/Player;
   #27 = NameAndType        #28:#29       // _playerA:Lext/mods/gameserver/model/actor/Player;
   #28 = Utf8               _playerA
   #29 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #30 = Fieldref           #14.#31       // ext/mods/gameserver/model/entity/Duel._playerB:Lext/mods/gameserver/model/actor/Player;
   #31 = NameAndType        #32:#29       // _playerB:Lext/mods/gameserver/model/actor/Player;
   #32 = Utf8               _playerB
   #33 = Fieldref           #14.#34       // ext/mods/gameserver/model/entity/Duel._isPartyDuel:Z
   #34 = NameAndType        #35:#36       // _isPartyDuel:Z
   #35 = Utf8               _isPartyDuel
   #36 = Utf8               Z
   #37 = Methodref          #38.#39       // java/lang/System.currentTimeMillis:()J
   #38 = Class              #40           // java/lang/System
   #39 = NameAndType        #41:#42       // currentTimeMillis:()J
   #40 = Utf8               java/lang/System
   #41 = Utf8               currentTimeMillis
   #42 = Utf8               ()J
   #43 = Long               120000l
   #45 = Fieldref           #14.#46       // ext/mods/gameserver/model/entity/Duel._duelEndTime:J
   #46 = NameAndType        #47:#48       // _duelEndTime:J
   #47 = Utf8               _duelEndTime
   #48 = Utf8               J
   #49 = Methodref          #14.#50       // ext/mods/gameserver/model/entity/Duel.savePlayerConditions:()V
   #50 = NameAndType        #51:#6        // savePlayerConditions:()V
   #51 = Utf8               savePlayerConditions
   #52 = Fieldref           #53.#54       // ext/mods/gameserver/network/SystemMessageId.IN_A_MOMENT_YOU_WILL_BE_TRANSPORTED_TO_THE_SITE_WHERE_THE_DUEL_WILL_TAKE_PLACE:Lext/mods/gameserver/network/SystemMessageId;
   #53 = Class              #55           // ext/mods/gameserver/network/SystemMessageId
   #54 = NameAndType        #56:#57       // IN_A_MOMENT_YOU_WILL_BE_TRANSPORTED_TO_THE_SITE_WHERE_THE_DUEL_WILL_TAKE_PLACE:Lext/mods/gameserver/network/SystemMessageId;
   #55 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #56 = Utf8               IN_A_MOMENT_YOU_WILL_BE_TRANSPORTED_TO_THE_SITE_WHERE_THE_DUEL_WILL_TAKE_PLACE
   #57 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #58 = Methodref          #59.#60       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #59 = Class              #61           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #60 = NameAndType        #62:#63       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #61 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #62 = Utf8               getSystemMessage
   #63 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #64 = Class              #65           // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #65 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #66 = Methodref          #14.#67       // ext/mods/gameserver/model/entity/Duel.broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #67 = NameAndType        #68:#69       // broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #68 = Utf8               broadcastTo
   #69 = Utf8               (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #70 = Methodref          #71.#72       // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #71 = Class              #73           // ext/mods/gameserver/model/actor/Player
   #72 = NameAndType        #74:#75       // getParty:()Lext/mods/gameserver/model/group/Party;
   #73 = Utf8               ext/mods/gameserver/model/actor/Player
   #74 = Utf8               getParty
   #75 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #76 = Methodref          #77.#78       // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
   #77 = Class              #79           // ext/mods/gameserver/model/group/Party
   #78 = NameAndType        #80:#81       // getMembers:()Ljava/util/List;
   #79 = Utf8               ext/mods/gameserver/model/group/Party
   #80 = Utf8               getMembers
   #81 = Utf8               ()Ljava/util/List;
   #82 = InvokeDynamic      #0:#83        // #0:accept:(Lext/mods/gameserver/model/entity/Duel;)Ljava/util/function/Consumer;
   #83 = NameAndType        #84:#85       // accept:(Lext/mods/gameserver/model/entity/Duel;)Ljava/util/function/Consumer;
   #84 = Utf8               accept
   #85 = Utf8               (Lext/mods/gameserver/model/entity/Duel;)Ljava/util/function/Consumer;
   #86 = InterfaceMethodref #87.#88       // java/util/List.forEach:(Ljava/util/function/Consumer;)V
   #87 = Class              #89           // java/util/List
   #88 = NameAndType        #90:#91       // forEach:(Ljava/util/function/Consumer;)V
   #89 = Utf8               java/util/List
   #90 = Utf8               forEach
   #91 = Utf8               (Ljava/util/function/Consumer;)V
   #92 = InvokeDynamic      #1:#83        // #1:accept:(Lext/mods/gameserver/model/entity/Duel;)Ljava/util/function/Consumer;
   #93 = Methodref          #71.#94       // ext/mods/gameserver/model/actor/Player.setInDuel:(I)V
   #94 = NameAndType        #95:#96       // setInDuel:(I)V
   #95 = Utf8               setInDuel
   #96 = Utf8               (I)V
   #97 = InvokeDynamic      #2:#98        // #2:run:(Lext/mods/gameserver/model/entity/Duel;)Ljava/lang/Runnable;
   #98 = NameAndType        #99:#100      // run:(Lext/mods/gameserver/model/entity/Duel;)Ljava/lang/Runnable;
   #99 = Utf8               run
  #100 = Utf8               (Lext/mods/gameserver/model/entity/Duel;)Ljava/lang/Runnable;
  #101 = Long               1000l
  #103 = Methodref          #104.#105     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #104 = Class              #106          // ext/mods/commons/pool/ThreadPool
  #105 = NameAndType        #107:#108     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #106 = Utf8               ext/mods/commons/pool/ThreadPool
  #107 = Utf8               scheduleAtFixedRate
  #108 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #109 = Fieldref           #14.#110      // ext/mods/gameserver/model/entity/Duel._task:Ljava/util/concurrent/Future;
  #110 = NameAndType        #111:#112     // _task:Ljava/util/concurrent/Future;
  #111 = Utf8               _task
  #112 = Utf8               Ljava/util/concurrent/Future;
  #113 = Methodref          #14.#114      // ext/mods/gameserver/model/entity/Duel.checkEndDuelCondition:()Lext/mods/gameserver/enums/duels/DuelResult;
  #114 = NameAndType        #115:#116     // checkEndDuelCondition:()Lext/mods/gameserver/enums/duels/DuelResult;
  #115 = Utf8               checkEndDuelCondition
  #116 = Utf8               ()Lext/mods/gameserver/enums/duels/DuelResult;
  #117 = Fieldref           #118.#119     // ext/mods/gameserver/enums/duels/DuelResult.CONTINUE:Lext/mods/gameserver/enums/duels/DuelResult;
  #118 = Class              #120          // ext/mods/gameserver/enums/duels/DuelResult
  #119 = NameAndType        #121:#122     // CONTINUE:Lext/mods/gameserver/enums/duels/DuelResult;
  #120 = Utf8               ext/mods/gameserver/enums/duels/DuelResult
  #121 = Utf8               CONTINUE
  #122 = Utf8               Lext/mods/gameserver/enums/duels/DuelResult;
  #123 = InterfaceMethodref #124.#125     // java/util/concurrent/Future.cancel:(Z)Z
  #124 = Class              #126          // java/util/concurrent/Future
  #125 = NameAndType        #127:#128     // cancel:(Z)Z
  #126 = Utf8               java/util/concurrent/Future
  #127 = Utf8               cancel
  #128 = Utf8               (Z)Z
  #129 = Methodref          #77.#130      // ext/mods/gameserver/model/group/Party.stopToFight:()V
  #130 = NameAndType        #131:#6       // stopToFight:()V
  #131 = Utf8               stopToFight
  #132 = Methodref          #71.#130      // ext/mods/gameserver/model/actor/Player.stopToFight:()V
  #133 = Fieldref           #134.#135     // ext/mods/gameserver/model/entity/Duel$1.$SwitchMap$ext$mods$gameserver$enums$duels$DuelResult:[I
  #134 = Class              #136          // ext/mods/gameserver/model/entity/Duel$1
  #135 = NameAndType        #137:#138     // $SwitchMap$ext$mods$gameserver$enums$duels$DuelResult:[I
  #136 = Utf8               ext/mods/gameserver/model/entity/Duel$1
  #137 = Utf8               $SwitchMap$ext$mods$gameserver$enums$duels$DuelResult
  #138 = Utf8               [I
  #139 = Methodref          #118.#140     // ext/mods/gameserver/enums/duels/DuelResult.ordinal:()I
  #140 = NameAndType        #141:#142     // ordinal:()I
  #141 = Utf8               ordinal
  #142 = Utf8               ()I
  #143 = Methodref          #14.#144      // ext/mods/gameserver/model/entity/Duel.playAnimation:(Lext/mods/gameserver/model/actor/Player;)V
  #144 = NameAndType        #145:#146     // playAnimation:(Lext/mods/gameserver/model/actor/Player;)V
  #145 = Utf8               playAnimation
  #146 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #147 = Methodref          #14.#148      // ext/mods/gameserver/model/entity/Duel.endDuel:(Lext/mods/gameserver/enums/duels/DuelResult;)V
  #148 = NameAndType        #149:#150     // endDuel:(Lext/mods/gameserver/enums/duels/DuelResult;)V
  #149 = Utf8               endDuel
  #150 = Utf8               (Lext/mods/gameserver/enums/duels/DuelResult;)V
  #151 = Integer            -83760
  #152 = Integer            -238825
  #153 = Methodref          #14.#154      // ext/mods/gameserver/model/entity/Duel.teleportPlayers:(III)V
  #154 = NameAndType        #155:#156     // teleportPlayers:(III)V
  #155 = Utf8               teleportPlayers
  #156 = Utf8               (III)V
  #157 = Fieldref           #53.#158      // ext/mods/gameserver/network/SystemMessageId.THE_DUEL_WILL_BEGIN_IN_S1_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #158 = NameAndType        #159:#57      // THE_DUEL_WILL_BEGIN_IN_S1_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #159 = Utf8               THE_DUEL_WILL_BEGIN_IN_S1_SECONDS
  #160 = Methodref          #59.#161      // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #161 = NameAndType        #162:#163     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #162 = Utf8               addNumber
  #163 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #164 = Fieldref           #53.#165      // ext/mods/gameserver/network/SystemMessageId.LET_THE_DUEL_BEGIN:Lext/mods/gameserver/network/SystemMessageId;
  #165 = NameAndType        #166:#57      // LET_THE_DUEL_BEGIN:Lext/mods/gameserver/network/SystemMessageId;
  #166 = Utf8               LET_THE_DUEL_BEGIN
  #167 = Methodref          #14.#168      // ext/mods/gameserver/model/entity/Duel.startDuel:()V
  #168 = NameAndType        #169:#6       // startDuel:()V
  #169 = Utf8               startDuel
  #170 = Class              #171          // ext/mods/gameserver/network/serverpackets/ExDuelReady
  #171 = Utf8               ext/mods/gameserver/network/serverpackets/ExDuelReady
  #172 = Methodref          #170.#173     // ext/mods/gameserver/network/serverpackets/ExDuelReady."<init>":(Z)V
  #173 = NameAndType        #5:#174       // "<init>":(Z)V
  #174 = Utf8               (Z)V
  #175 = Class              #176          // ext/mods/gameserver/network/serverpackets/ExDuelStart
  #176 = Utf8               ext/mods/gameserver/network/serverpackets/ExDuelStart
  #177 = Methodref          #175.#173     // ext/mods/gameserver/network/serverpackets/ExDuelStart."<init>":(Z)V
  #178 = Fieldref           #14.#179      // ext/mods/gameserver/model/entity/Duel.B04_S01:Lext/mods/gameserver/network/serverpackets/PlaySound;
  #179 = NameAndType        #180:#181     // B04_S01:Lext/mods/gameserver/network/serverpackets/PlaySound;
  #180 = Utf8               B04_S01
  #181 = Utf8               Lext/mods/gameserver/network/serverpackets/PlaySound;
  #182 = InterfaceMethodref #87.#183      // java/util/List.iterator:()Ljava/util/Iterator;
  #183 = NameAndType        #184:#185     // iterator:()Ljava/util/Iterator;
  #184 = Utf8               iterator
  #185 = Utf8               ()Ljava/util/Iterator;
  #186 = InterfaceMethodref #187.#188     // java/util/Iterator.hasNext:()Z
  #187 = Class              #189          // java/util/Iterator
  #188 = NameAndType        #190:#191     // hasNext:()Z
  #189 = Utf8               java/util/Iterator
  #190 = Utf8               hasNext
  #191 = Utf8               ()Z
  #192 = InterfaceMethodref #187.#193     // java/util/Iterator.next:()Ljava/lang/Object;
  #193 = NameAndType        #194:#195     // next:()Ljava/lang/Object;
  #194 = Utf8               next
  #195 = Utf8               ()Ljava/lang/Object;
  #196 = Fieldref           #197.#198     // ext/mods/gameserver/enums/TeamType.BLUE:Lext/mods/gameserver/enums/TeamType;
  #197 = Class              #199          // ext/mods/gameserver/enums/TeamType
  #198 = NameAndType        #200:#201     // BLUE:Lext/mods/gameserver/enums/TeamType;
  #199 = Utf8               ext/mods/gameserver/enums/TeamType
  #200 = Utf8               BLUE
  #201 = Utf8               Lext/mods/gameserver/enums/TeamType;
  #202 = Methodref          #71.#203      // ext/mods/gameserver/model/actor/Player.prepareToDuel:(Lext/mods/gameserver/enums/TeamType;)V
  #203 = NameAndType        #204:#205     // prepareToDuel:(Lext/mods/gameserver/enums/TeamType;)V
  #204 = Utf8               prepareToDuel
  #205 = Utf8               (Lext/mods/gameserver/enums/TeamType;)V
  #206 = Class              #207          // ext/mods/gameserver/network/serverpackets/ExDuelUpdateUserInfo
  #207 = Utf8               ext/mods/gameserver/network/serverpackets/ExDuelUpdateUserInfo
  #208 = Methodref          #206.#209     // ext/mods/gameserver/network/serverpackets/ExDuelUpdateUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #209 = NameAndType        #5:#146       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #210 = Fieldref           #197.#211     // ext/mods/gameserver/enums/TeamType.RED:Lext/mods/gameserver/enums/TeamType;
  #211 = NameAndType        #212:#201     // RED:Lext/mods/gameserver/enums/TeamType;
  #212 = Utf8               RED
  #213 = Class              #214          // ext/mods/gameserver/model/entity/PlayerCondition
  #214 = Utf8               ext/mods/gameserver/model/entity/PlayerCondition
  #215 = Methodref          #213.#216     // ext/mods/gameserver/model/entity/PlayerCondition."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #216 = NameAndType        #5:#217       // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #217 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #218 = InterfaceMethodref #219.#220     // java/util/Set.add:(Ljava/lang/Object;)Z
  #219 = Class              #221          // java/util/Set
  #220 = NameAndType        #222:#223     // add:(Ljava/lang/Object;)Z
  #221 = Utf8               java/util/Set
  #222 = Utf8               add
  #223 = Utf8               (Ljava/lang/Object;)Z
  #224 = InvokeDynamic      #3:#225       // #3:accept:(Lext/mods/gameserver/model/entity/Duel;Z)Ljava/util/function/Consumer;
  #225 = NameAndType        #84:#226      // accept:(Lext/mods/gameserver/model/entity/Duel;Z)Ljava/util/function/Consumer;
  #226 = Utf8               (Lext/mods/gameserver/model/entity/Duel;Z)Ljava/util/function/Consumer;
  #227 = InterfaceMethodref #219.#88      // java/util/Set.forEach:(Ljava/util/function/Consumer;)V
  #228 = Methodref          #77.#229      // ext/mods/gameserver/model/group/Party.resetDuelState:()V
  #229 = NameAndType        #230:#6       // resetDuelState:()V
  #230 = Utf8               resetDuelState
  #231 = Methodref          #71.#229      // ext/mods/gameserver/model/actor/Player.resetDuelState:()V
  #232 = Methodref          #71.#233      // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #233 = NameAndType        #234:#235     // teleportTo:(IIII)Z
  #234 = Utf8               teleportTo
  #235 = Utf8               (IIII)Z
  #236 = Methodref          #71.#237      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #237 = NameAndType        #238:#239     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #238 = Utf8               sendPacket
  #239 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #240 = Methodref          #71.#241      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #241 = NameAndType        #242:#191     // isOnline:()Z
  #242 = Utf8               isOnline
  #243 = Methodref          #71.#244      // ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
  #244 = NameAndType        #245:#246     // getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
  #245 = Utf8               getDuelState
  #246 = Utf8               ()Lext/mods/gameserver/enums/duels/DuelState;
  #247 = Fieldref           #248.#249     // ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
  #248 = Class              #250          // ext/mods/gameserver/enums/duels/DuelState
  #249 = NameAndType        #251:#252     // DEAD:Lext/mods/gameserver/enums/duels/DuelState;
  #250 = Utf8               ext/mods/gameserver/enums/duels/DuelState
  #251 = Utf8               DEAD
  #252 = Utf8               Lext/mods/gameserver/enums/duels/DuelState;
  #253 = Class              #254          // ext/mods/gameserver/network/serverpackets/SocialAction
  #254 = Utf8               ext/mods/gameserver/network/serverpackets/SocialAction
  #255 = Methodref          #253.#256     // ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
  #256 = NameAndType        #5:#257       // "<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
  #257 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #258 = Methodref          #71.#259      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #259 = NameAndType        #260:#239     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #260 = Utf8               broadcastPacket
  #261 = Fieldref           #53.#262      // ext/mods/gameserver/network/SystemMessageId.SINCE_S1_PARTY_WITHDREW_FROM_THE_DUEL_S2_PARTY_HAS_WON:Lext/mods/gameserver/network/SystemMessageId;
  #262 = NameAndType        #263:#57      // SINCE_S1_PARTY_WITHDREW_FROM_THE_DUEL_S2_PARTY_HAS_WON:Lext/mods/gameserver/network/SystemMessageId;
  #263 = Utf8               SINCE_S1_PARTY_WITHDREW_FROM_THE_DUEL_S2_PARTY_HAS_WON
  #264 = Fieldref           #53.#265      // ext/mods/gameserver/network/SystemMessageId.SINCE_S1_WITHDREW_FROM_THE_DUEL_S2_HAS_WON:Lext/mods/gameserver/network/SystemMessageId;
  #265 = NameAndType        #266:#57      // SINCE_S1_WITHDREW_FROM_THE_DUEL_S2_HAS_WON:Lext/mods/gameserver/network/SystemMessageId;
  #266 = Utf8               SINCE_S1_WITHDREW_FROM_THE_DUEL_S2_HAS_WON
  #267 = Methodref          #71.#268      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #268 = NameAndType        #269:#270     // getName:()Ljava/lang/String;
  #269 = Utf8               getName
  #270 = Utf8               ()Ljava/lang/String;
  #271 = Methodref          #59.#272      // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #272 = NameAndType        #273:#274     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #273 = Utf8               addString
  #274 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #275 = Fieldref           #53.#276      // ext/mods/gameserver/network/SystemMessageId.S1_PARTY_HAS_WON_THE_DUEL:Lext/mods/gameserver/network/SystemMessageId;
  #276 = NameAndType        #277:#57      // S1_PARTY_HAS_WON_THE_DUEL:Lext/mods/gameserver/network/SystemMessageId;
  #277 = Utf8               S1_PARTY_HAS_WON_THE_DUEL
  #278 = Fieldref           #53.#279      // ext/mods/gameserver/network/SystemMessageId.S1_HAS_WON_THE_DUEL:Lext/mods/gameserver/network/SystemMessageId;
  #279 = NameAndType        #280:#57      // S1_HAS_WON_THE_DUEL:Lext/mods/gameserver/network/SystemMessageId;
  #280 = Utf8               S1_HAS_WON_THE_DUEL
  #281 = Fieldref           #53.#282      // ext/mods/gameserver/network/SystemMessageId.THE_DUEL_HAS_ENDED_IN_A_TIE:Lext/mods/gameserver/network/SystemMessageId;
  #282 = NameAndType        #283:#57      // THE_DUEL_HAS_ENDED_IN_A_TIE:Lext/mods/gameserver/network/SystemMessageId;
  #283 = Utf8               THE_DUEL_HAS_ENDED_IN_A_TIE
  #284 = Class              #285          // ext/mods/gameserver/network/serverpackets/ExDuelEnd
  #285 = Utf8               ext/mods/gameserver/network/serverpackets/ExDuelEnd
  #286 = Methodref          #284.#173     // ext/mods/gameserver/network/serverpackets/ExDuelEnd."<init>":(Z)V
  #287 = Fieldref           #118.#288     // ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
  #288 = NameAndType        #289:#122     // CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
  #289 = Utf8               CANCELED
  #290 = Methodref          #14.#291      // ext/mods/gameserver/model/entity/Duel.restorePlayerConditions:(Z)V
  #291 = NameAndType        #292:#174     // restorePlayerConditions:(Z)V
  #292 = Utf8               restorePlayerConditions
  #293 = Methodref          #294.#295     // ext/mods/gameserver/data/manager/DuelManager.getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
  #294 = Class              #296          // ext/mods/gameserver/data/manager/DuelManager
  #295 = NameAndType        #297:#298     // getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
  #296 = Utf8               ext/mods/gameserver/data/manager/DuelManager
  #297 = Utf8               getInstance
  #298 = Utf8               ()Lext/mods/gameserver/data/manager/DuelManager;
  #299 = Methodref          #294.#300     // ext/mods/gameserver/data/manager/DuelManager.removeDuel:(I)V
  #300 = NameAndType        #301:#96      // removeDuel:(I)V
  #301 = Utf8               removeDuel
  #302 = Methodref          #14.#303      // ext/mods/gameserver/model/entity/Duel.onPlayerDefeat:(Lext/mods/gameserver/model/actor/Player;)V
  #303 = NameAndType        #304:#146     // onPlayerDefeat:(Lext/mods/gameserver/model/actor/Player;)V
  #304 = Utf8               onPlayerDefeat
  #305 = Fieldref           #118.#306     // ext/mods/gameserver/enums/duels/DuelResult.TEAM_1_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
  #306 = NameAndType        #307:#122     // TEAM_1_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
  #307 = Utf8               TEAM_1_SURRENDER
  #308 = Fieldref           #118.#309     // ext/mods/gameserver/enums/duels/DuelResult.TEAM_2_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
  #309 = NameAndType        #310:#122     // TEAM_2_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
  #310 = Utf8               TEAM_2_SURRENDER
  #311 = Fieldref           #14.#312      // ext/mods/gameserver/model/entity/Duel._surrenderRequest:I
  #312 = NameAndType        #313:#22      // _surrenderRequest:I
  #313 = Utf8               _surrenderRequest
  #314 = Methodref          #14.#315      // ext/mods/gameserver/model/entity/Duel.getRemainingTime:()I
  #315 = NameAndType        #316:#142     // getRemainingTime:()I
  #316 = Utf8               getRemainingTime
  #317 = Fieldref           #118.#318     // ext/mods/gameserver/enums/duels/DuelResult.TIMEOUT:Lext/mods/gameserver/enums/duels/DuelResult;
  #318 = NameAndType        #319:#122     // TIMEOUT:Lext/mods/gameserver/enums/duels/DuelResult;
  #319 = Utf8               TIMEOUT
  #320 = Fieldref           #248.#321     // ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
  #321 = NameAndType        #322:#252     // WINNER:Lext/mods/gameserver/enums/duels/DuelState;
  #322 = Utf8               WINNER
  #323 = Fieldref           #118.#324     // ext/mods/gameserver/enums/duels/DuelResult.TEAM_1_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
  #324 = NameAndType        #325:#122     // TEAM_1_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
  #325 = Utf8               TEAM_1_WIN
  #326 = Fieldref           #118.#327     // ext/mods/gameserver/enums/duels/DuelResult.TEAM_2_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
  #327 = NameAndType        #328:#122     // TEAM_2_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
  #328 = Utf8               TEAM_2_WIN
  #329 = Fieldref           #248.#330     // ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
  #330 = NameAndType        #331:#252     // INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
  #331 = Utf8               INTERRUPTED
  #332 = Methodref          #71.#333      // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #333 = NameAndType        #334:#335     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #334 = Utf8               isIn3DRadius
  #335 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #336 = Methodref          #71.#337      // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
  #337 = NameAndType        #338:#339     // getPvpFlag:()B
  #338 = Utf8               getPvpFlag
  #339 = Utf8               ()B
  #340 = Fieldref           #341.#342     // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #341 = Class              #343          // ext/mods/gameserver/enums/ZoneId
  #342 = NameAndType        #344:#345     // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #343 = Utf8               ext/mods/gameserver/enums/ZoneId
  #344 = Utf8               PEACE
  #345 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #346 = Methodref          #71.#347      // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #347 = NameAndType        #348:#349     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #348 = Utf8               isInsideZone
  #349 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #350 = Fieldref           #341.#351     // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #351 = NameAndType        #352:#345     // SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #352 = Utf8               SIEGE
  #353 = Fieldref           #341.#354     // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
  #354 = NameAndType        #355:#345     // PVP:Lext/mods/gameserver/enums/ZoneId;
  #355 = Utf8               PVP
  #356 = Methodref          #77.#357      // ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
  #357 = NameAndType        #358:#359     // containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
  #358 = Utf8               containsPlayer
  #359 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #360 = Methodref          #71.#361      // ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
  #361 = NameAndType        #362:#363     // setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
  #362 = Utf8               setDuelState
  #363 = Utf8               (Lext/mods/gameserver/enums/duels/DuelState;)V
  #364 = Fieldref           #248.#365     // ext/mods/gameserver/enums/duels/DuelState.DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
  #365 = NameAndType        #366:#252     // DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
  #366 = Utf8               DUELLING
  #367 = Methodref          #71.#368      // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #368 = NameAndType        #369:#370     // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #369 = Utf8               getMissions
  #370 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #371 = Fieldref           #372.#373     // ext/mods/gameserver/enums/actors/MissionType.DUAL_WON:Lext/mods/gameserver/enums/actors/MissionType;
  #372 = Class              #374          // ext/mods/gameserver/enums/actors/MissionType
  #373 = NameAndType        #375:#376     // DUAL_WON:Lext/mods/gameserver/enums/actors/MissionType;
  #374 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #375 = Utf8               DUAL_WON
  #376 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #377 = Methodref          #378.#379     // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #378 = Class              #380          // ext/mods/gameserver/model/actor/container/player/MissionList
  #379 = NameAndType        #381:#382     // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #380 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
  #381 = Utf8               update
  #382 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
  #383 = InterfaceMethodref #219.#183     // java/util/Set.iterator:()Ljava/util/Iterator;
  #384 = Methodref          #213.#385     // ext/mods/gameserver/model/entity/PlayerCondition.restoreCondition:(Z)V
  #385 = NameAndType        #386:#174     // restoreCondition:(Z)V
  #386 = Utf8               restoreCondition
  #387 = Methodref          #213.#388     // ext/mods/gameserver/model/entity/PlayerCondition.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #388 = NameAndType        #389:#390     // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #389 = Utf8               getPlayer
  #390 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #391 = Class              #392          // ext/mods/gameserver/network/serverpackets/PlaySound
  #392 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
  #393 = String             #180          // B04_S01
  #394 = Methodref          #391.#395     // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;)V
  #395 = NameAndType        #5:#396       // "<init>":(ILjava/lang/String;)V
  #396 = Utf8               (ILjava/lang/String;)V
  #397 = Utf8               TWO_MINUTES
  #398 = Utf8               ConstantValue
  #399 = Integer            120000
  #400 = Utf8               Signature
  #401 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/entity/PlayerCondition;>;
  #402 = Utf8               Ljava/util/concurrent/Future<*>;
  #403 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;ZI)V
  #404 = Utf8               Code
  #405 = Utf8               LineNumberTable
  #406 = Utf8               LocalVariableTable
  #407 = Utf8               sm
  #408 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #409 = Utf8               this
  #410 = Utf8               Lext/mods/gameserver/model/entity/Duel;
  #411 = Utf8               playerA
  #412 = Utf8               playerB
  #413 = Utf8               isPartyDuel
  #414 = Utf8               duelId
  #415 = Utf8               StackMapTable
  #416 = Utf8               start
  #417 = Utf8               status
  #418 = Utf8               partyPlayer
  #419 = Utf8               ready
  #420 = Utf8               Lext/mods/gameserver/network/serverpackets/ExDuelReady;
  #421 = Utf8               Lext/mods/gameserver/network/serverpackets/ExDuelStart;
  #422 = Utf8               abnormalEnd
  #423 = Utf8               getId
  #424 = Utf8               getPlayerA
  #425 = Utf8               getPlayerB
  #426 = Utf8               x
  #427 = Utf8               y
  #428 = Utf8               z
  #429 = Utf8               offset
  #430 = Utf8               packet
  #431 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #432 = Utf8               player
  #433 = Utf8               packets
  #434 = Utf8               [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #435 = Class              #434          // "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;"
  #436 = Utf8               result
  #437 = Utf8               duelEnd
  #438 = Utf8               Lext/mods/gameserver/network/serverpackets/ExDuelEnd;
  #439 = Utf8               partyMember
  #440 = Utf8               doSurrender
  #441 = Utf8               winner
  #442 = Utf8               teamDefeated
  #443 = Utf8               onPartyEdit
  #444 = Utf8               cond
  #445 = Utf8               Lext/mods/gameserver/model/entity/PlayerCondition;
  #446 = Utf8               lambda$restorePlayerConditions$0
  #447 = Utf8               (ZLext/mods/gameserver/model/entity/PlayerCondition;)V
  #448 = Utf8               lambda$new$1
  #449 = Utf8               p
  #450 = Utf8               lambda$new$0
  #451 = Utf8               <clinit>
  #452 = Utf8               SourceFile
  #453 = Utf8               Duel.java
  #454 = Utf8               NestMembers
  #455 = Utf8               BootstrapMethods
  #456 = MethodType         #457          //  (Ljava/lang/Object;)V
  #457 = Utf8               (Ljava/lang/Object;)V
  #458 = MethodHandle       5:#459        // REF_invokeVirtual ext/mods/gameserver/model/entity/Duel.lambda$new$0:(Lext/mods/gameserver/model/actor/Player;)V
  #459 = Methodref          #14.#460      // ext/mods/gameserver/model/entity/Duel.lambda$new$0:(Lext/mods/gameserver/model/actor/Player;)V
  #460 = NameAndType        #450:#146     // lambda$new$0:(Lext/mods/gameserver/model/actor/Player;)V
  #461 = MethodType         #146          //  (Lext/mods/gameserver/model/actor/Player;)V
  #462 = MethodHandle       5:#463        // REF_invokeVirtual ext/mods/gameserver/model/entity/Duel.lambda$new$1:(Lext/mods/gameserver/model/actor/Player;)V
  #463 = Methodref          #14.#464      // ext/mods/gameserver/model/entity/Duel.lambda$new$1:(Lext/mods/gameserver/model/actor/Player;)V
  #464 = NameAndType        #448:#146     // lambda$new$1:(Lext/mods/gameserver/model/actor/Player;)V
  #465 = MethodType         #6            //  ()V
  #466 = MethodHandle       5:#467        // REF_invokeVirtual ext/mods/gameserver/model/entity/Duel.start:()V
  #467 = Methodref          #14.#468      // ext/mods/gameserver/model/entity/Duel.start:()V
  #468 = NameAndType        #416:#6       // start:()V
  #469 = MethodHandle       5:#470        // REF_invokeVirtual ext/mods/gameserver/model/entity/Duel.lambda$restorePlayerConditions$0:(ZLext/mods/gameserver/model/entity/PlayerCondition;)V
  #470 = Methodref          #14.#471      // ext/mods/gameserver/model/entity/Duel.lambda$restorePlayerConditions$0:(ZLext/mods/gameserver/model/entity/PlayerCondition;)V
  #471 = NameAndType        #446:#447     // lambda$restorePlayerConditions$0:(ZLext/mods/gameserver/model/entity/PlayerCondition;)V
  #472 = MethodType         #473          //  (Lext/mods/gameserver/model/entity/PlayerCondition;)V
  #473 = Utf8               (Lext/mods/gameserver/model/entity/PlayerCondition;)V
  #474 = MethodHandle       6:#475        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #475 = Methodref          #476.#477     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #476 = Class              #478          // java/lang/invoke/LambdaMetafactory
  #477 = NameAndType        #479:#480     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #478 = Utf8               java/lang/invoke/LambdaMetafactory
  #479 = Utf8               metafactory
  #480 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #481 = Utf8               InnerClasses
  #482 = Class              #483          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #483 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #484 = Utf8               KeySetView
  #485 = Class              #486          // java/lang/invoke/MethodHandles$Lookup
  #486 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #487 = Class              #488          // java/lang/invoke/MethodHandles
  #488 = Utf8               java/lang/invoke/MethodHandles
  #489 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.Duel(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player, boolean, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;ZI)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokestatic  #7                  // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
         8: putfield      #13                 // Field _playerConditions:Ljava/util/Set;
        11: aload_0
        12: iconst_5
        13: putfield      #19                 // Field _countdown:I
        16: aload_0
        17: iload         4
        19: putfield      #23                 // Field _duelId:I
        22: aload_0
        23: aload_1
        24: putfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        27: aload_0
        28: aload_2
        29: putfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        32: aload_0
        33: iload_3
        34: putfield      #33                 // Field _isPartyDuel:Z
        37: aload_0
        38: invokestatic  #37                 // Method java/lang/System.currentTimeMillis:()J
        41: ldc2_w        #43                 // long 120000l
        44: ladd
        45: putfield      #45                 // Field _duelEndTime:J
        48: aload_0
        49: invokevirtual #49                 // Method savePlayerConditions:()V
        52: aload_0
        53: getfield      #33                 // Field _isPartyDuel:Z
        56: ifeq          152
        59: aload_0
        60: bipush        35
        62: putfield      #19                 // Field _countdown:I
        65: getstatic     #52                 // Field ext/mods/gameserver/network/SystemMessageId.IN_A_MOMENT_YOU_WILL_BE_TRANSPORTED_TO_THE_SITE_WHERE_THE_DUEL_WILL_TAKE_PLACE:Lext/mods/gameserver/network/SystemMessageId;
        68: invokestatic  #58                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        71: astore        5
        73: aload_0
        74: aload_0
        75: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        78: iconst_1
        79: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        82: dup
        83: iconst_0
        84: aload         5
        86: aastore
        87: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        90: aload_0
        91: aload_0
        92: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        95: iconst_1
        96: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        99: dup
       100: iconst_0
       101: aload         5
       103: aastore
       104: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       107: aload_0
       108: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       111: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       114: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       117: aload_0
       118: invokedynamic #82,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/model/entity/Duel;)Ljava/util/function/Consumer;
       123: invokeinterface #86,  2           // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       128: aload_0
       129: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       132: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       135: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       138: aload_0
       139: invokedynamic #92,  0             // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/entity/Duel;)Ljava/util/function/Consumer;
       144: invokeinterface #86,  2           // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       149: goto          174
       152: aload_0
       153: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       156: aload_0
       157: getfield      #23                 // Field _duelId:I
       160: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.setInDuel:(I)V
       163: aload_0
       164: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       167: aload_0
       168: getfield      #23                 // Field _duelId:I
       171: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.setInDuel:(I)V
       174: aload_0
       175: aload_0
       176: invokedynamic #97,  0             // InvokeDynamic #2:run:(Lext/mods/gameserver/model/entity/Duel;)Ljava/lang/Runnable;
       181: ldc2_w        #101                // long 1000l
       184: ldc2_w        #101                // long 1000l
       187: invokestatic  #103                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       190: putfield      #109                // Field _task:Ljava/util/concurrent/Future;
       193: return
      LineNumberTable:
        line 61: 0
        line 48: 4
        line 58: 11
        line 62: 16
        line 63: 22
        line 64: 27
        line 65: 32
        line 67: 37
        line 69: 48
        line 71: 52
        line 73: 59
        line 75: 65
        line 76: 73
        line 77: 90
        line 79: 107
        line 80: 128
        line 81: 149
        line 84: 152
        line 85: 163
        line 88: 174
        line 89: 193
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           73      76     5    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
            0     194     0  this   Lext/mods/gameserver/model/entity/Duel;
            0     194     1 playerA   Lext/mods/gameserver/model/actor/Player;
            0     194     2 playerB   Lext/mods/gameserver/model/actor/Player;
            0     194     3 isPartyDuel   Z
            0     194     4 duelId   I
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 152
          locals = [ class ext/mods/gameserver/model/entity/Duel, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int, int ]
          stack = []
        frame_type = 21 /* same */

  public void start();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #113                // Method checkEndDuelCondition:()Lext/mods/gameserver/enums/duels/DuelResult;
         4: astore_1
         5: aload_1
         6: getstatic     #117                // Field ext/mods/gameserver/enums/duels/DuelResult.CONTINUE:Lext/mods/gameserver/enums/duels/DuelResult;
         9: if_acmpeq     141
        12: aload_0
        13: getfield      #109                // Field _task:Ljava/util/concurrent/Future;
        16: ifnull        35
        19: aload_0
        20: getfield      #109                // Field _task:Ljava/util/concurrent/Future;
        23: iconst_0
        24: invokeinterface #123,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        29: pop
        30: aload_0
        31: aconst_null
        32: putfield      #109                // Field _task:Ljava/util/concurrent/Future;
        35: aload_0
        36: getfield      #33                 // Field _isPartyDuel:Z
        39: ifeq          65
        42: aload_0
        43: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        46: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        49: invokevirtual #129                // Method ext/mods/gameserver/model/group/Party.stopToFight:()V
        52: aload_0
        53: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        56: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        59: invokevirtual #129                // Method ext/mods/gameserver/model/group/Party.stopToFight:()V
        62: goto          79
        65: aload_0
        66: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        69: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Player.stopToFight:()V
        72: aload_0
        73: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        76: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Player.stopToFight:()V
        79: getstatic     #133                // Field ext/mods/gameserver/model/entity/Duel$1.$SwitchMap$ext$mods$gameserver$enums$duels$DuelResult:[I
        82: aload_1
        83: invokevirtual #139                // Method ext/mods/gameserver/enums/duels/DuelResult.ordinal:()I
        86: iaload
        87: tableswitch   { // 1 to 4

                       1: 116

                       2: 116

                       3: 127

                       4: 127
                 default: 135
            }
       116: aload_0
       117: aload_0
       118: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       121: invokevirtual #143                // Method playAnimation:(Lext/mods/gameserver/model/actor/Player;)V
       124: goto          135
       127: aload_0
       128: aload_0
       129: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       132: invokevirtual #143                // Method playAnimation:(Lext/mods/gameserver/model/actor/Player;)V
       135: aload_0
       136: aload_1
       137: invokevirtual #147                // Method endDuel:(Lext/mods/gameserver/enums/duels/DuelResult;)V
       140: return
       141: aload_0
       142: getfield      #19                 // Field _countdown:I
       145: iflt          420
       148: aload_0
       149: getfield      #19                 // Field _countdown:I
       152: tableswitch   { // 0 to 33

                       0: 367

                       1: 318

                       2: 318

                       3: 318

                       4: 410

                       5: 410

                       6: 410

                       7: 410

                       8: 410

                       9: 410

                      10: 318

                      11: 410

                      12: 410

                      13: 410

                      14: 410

                      15: 318

                      16: 410

                      17: 410

                      18: 410

                      19: 410

                      20: 318

                      21: 410

                      22: 410

                      23: 410

                      24: 410

                      25: 410

                      26: 410

                      27: 410

                      28: 410

                      29: 410

                      30: 318

                      31: 410

                      32: 410

                      33: 304
                 default: 410
            }
       304: aload_0
       305: ldc           #151                // int -83760
       307: ldc           #152                // int -238825
       309: sipush        -3331
       312: invokevirtual #153                // Method teleportPlayers:(III)V
       315: goto          410
       318: getstatic     #157                // Field ext/mods/gameserver/network/SystemMessageId.THE_DUEL_WILL_BEGIN_IN_S1_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
       321: invokestatic  #58                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       324: aload_0
       325: getfield      #19                 // Field _countdown:I
       328: invokevirtual #160                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       331: astore_2
       332: aload_0
       333: aload_0
       334: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       337: iconst_1
       338: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       341: dup
       342: iconst_0
       343: aload_2
       344: aastore
       345: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       348: aload_0
       349: aload_0
       350: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       353: iconst_1
       354: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       357: dup
       358: iconst_0
       359: aload_2
       360: aastore
       361: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       364: goto          410
       367: getstatic     #164                // Field ext/mods/gameserver/network/SystemMessageId.LET_THE_DUEL_BEGIN:Lext/mods/gameserver/network/SystemMessageId;
       370: invokestatic  #58                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       373: astore_2
       374: aload_0
       375: aload_0
       376: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       379: iconst_1
       380: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       383: dup
       384: iconst_0
       385: aload_2
       386: aastore
       387: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       390: aload_0
       391: aload_0
       392: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       395: iconst_1
       396: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       399: dup
       400: iconst_0
       401: aload_2
       402: aastore
       403: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       406: aload_0
       407: invokevirtual #167                // Method startDuel:()V
       410: aload_0
       411: dup
       412: getfield      #19                 // Field _countdown:I
       415: iconst_1
       416: isub
       417: putfield      #19                 // Field _countdown:I
       420: return
      LineNumberTable:
        line 102: 0
        line 103: 5
        line 105: 12
        line 107: 19
        line 108: 30
        line 111: 35
        line 113: 42
        line 114: 52
        line 118: 65
        line 119: 72
        line 122: 79
        line 125: 116
        line 126: 124
        line 129: 127
        line 133: 135
        line 134: 140
        line 137: 141
        line 139: 148
        line 142: 304
        line 143: 315
        line 146: 318
        line 147: 332
        line 148: 348
        line 149: 364
        line 152: 367
        line 153: 374
        line 154: 390
        line 156: 406
        line 160: 410
        line 162: 420
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          332      35     2    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          374      36     2    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
            0     421     0  this   Lext/mods/gameserver/model/entity/Duel;
            5     416     1 status   Lext/mods/gameserver/enums/duels/DuelResult;
      StackMapTable: number_of_entries = 12
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/enums/duels/DuelResult ]
        frame_type = 29 /* same */
        frame_type = 13 /* same */
        frame_type = 36 /* same */
        frame_type = 10 /* same */
        frame_type = 7 /* same */
        frame_type = 5 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 162
        frame_type = 13 /* same */
        frame_type = 48 /* same */
        frame_type = 42 /* same */
        frame_type = 9 /* same */

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _duelId:I
         4: ireturn
      LineNumberTable:
        line 248: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/Duel;

  public int getRemainingTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field _duelEndTime:J
         4: invokestatic  #37                 // Method java/lang/System.currentTimeMillis:()J
         7: lsub
         8: l2i
         9: ireturn
      LineNumberTable:
        line 256: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/Duel;

  public ext.mods.gameserver.model.actor.Player getPlayerA();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 264: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/Duel;

  public ext.mods.gameserver.model.actor.Player getPlayerB();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 272: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/Duel;

  public boolean isPartyDuel();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _isPartyDuel:Z
         4: ireturn
      LineNumberTable:
        line 280: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/Duel;

  protected void teleportPlayers(int, int, int);
    descriptor: (III)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=7, args_size=4
         0: aload_0
         1: getfield      #33                 // Field _isPartyDuel:Z
         4: ifne          8
         7: return
         8: iconst_0
         9: istore        4
        11: aload_0
        12: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        15: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        18: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        21: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        26: astore        5
        28: aload         5
        30: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          77
        38: aload         5
        40: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        45: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
        48: astore        6
        50: aload         6
        52: iload_1
        53: iload         4
        55: iadd
        56: sipush        180
        59: isub
        60: iload_2
        61: sipush        150
        64: isub
        65: iload_3
        66: iconst_0
        67: invokevirtual #232                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        70: pop
        71: iinc          4, 40
        74: goto          28
        77: iconst_0
        78: istore        4
        80: aload_0
        81: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        84: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        87: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        90: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        95: astore        5
        97: aload         5
        99: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       104: ifeq          146
       107: aload         5
       109: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       114: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
       117: astore        6
       119: aload         6
       121: iload_1
       122: iload         4
       124: iadd
       125: sipush        180
       128: isub
       129: iload_2
       130: sipush        150
       133: iadd
       134: iload_3
       135: iconst_0
       136: invokevirtual #232                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       139: pop
       140: iinc          4, 40
       143: goto          97
       146: return
      LineNumberTable:
        line 291: 0
        line 292: 7
        line 294: 8
        line 296: 11
        line 298: 50
        line 299: 71
        line 300: 74
        line 302: 77
        line 303: 80
        line 305: 119
        line 306: 140
        line 307: 143
        line 308: 146
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           50      24     6 partyPlayer   Lext/mods/gameserver/model/actor/Player;
          119      24     6 partyPlayer   Lext/mods/gameserver/model/actor/Player;
            0     147     0  this   Lext/mods/gameserver/model/entity/Duel;
            0     147     1     x   I
            0     147     2     y   I
            0     147     3     z   I
           11     136     4 offset   I
      StackMapTable: number_of_entries = 5
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 48
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 48

  public void broadcastTo(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.network.serverpackets.L2GameServerPacket...);
    descriptor: (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=9, args_size=3
         0: aload_0
         1: getfield      #33                 // Field _isPartyDuel:Z
         4: ifeq          91
         7: aload_1
         8: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        11: ifnull        91
        14: aload_1
        15: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        18: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        21: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        26: astore_3
        27: aload_3
        28: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        33: ifeq          88
        36: aload_3
        37: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        42: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
        45: astore        4
        47: aload_2
        48: astore        5
        50: aload         5
        52: arraylength
        53: istore        6
        55: iconst_0
        56: istore        7
        58: iload         7
        60: iload         6
        62: if_icmpge     85
        65: aload         5
        67: iload         7
        69: aaload
        70: astore        8
        72: aload         4
        74: aload         8
        76: invokevirtual #236                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        79: iinc          7, 1
        82: goto          58
        85: goto          27
        88: goto          125
        91: aload_2
        92: astore_3
        93: aload_3
        94: arraylength
        95: istore        4
        97: iconst_0
        98: istore        5
       100: iload         5
       102: iload         4
       104: if_icmpge     125
       107: aload_3
       108: iload         5
       110: aaload
       111: astore        6
       113: aload_1
       114: aload         6
       116: invokevirtual #236                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       119: iinc          5, 1
       122: goto          100
       125: return
      LineNumberTable:
        line 317: 0
        line 319: 14
        line 321: 47
        line 322: 72
        line 321: 79
        line 323: 85
        line 327: 91
        line 328: 113
        line 327: 119
        line 330: 125
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           72       7     8 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
           47      38     4 partyPlayer   Lext/mods/gameserver/model/actor/Player;
          113       6     6 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
            0     126     0  this   Lext/mods/gameserver/model/entity/Duel;
            0     126     1 player   Lext/mods/gameserver/model/actor/Player;
            0     126     2 packets   [Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/entity/Duel, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", class java/util/Iterator, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/entity/Duel, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 8
          locals = [ class "[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 24

  protected void endDuel(ext.mods.gameserver.enums.duels.DuelResult);
    descriptor: (Lext/mods/gameserver/enums/duels/DuelResult;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=4, args_size=2
         0: aconst_null
         1: astore_2
         2: getstatic     #133                // Field ext/mods/gameserver/model/entity/Duel$1.$SwitchMap$ext$mods$gameserver$enums$duels$DuelResult:[I
         5: aload_1
         6: invokevirtual #139                // Method ext/mods/gameserver/enums/duels/DuelResult.ordinal:()I
         9: iaload
        10: tableswitch   { // 1 to 6

                       1: 120

                       2: 48

                       3: 225

                       4: 153

                       5: 258

                       6: 258
                 default: 265
            }
        48: aload_0
        49: getfield      #33                 // Field _isPartyDuel:Z
        52: ifeq          61
        55: getstatic     #261                // Field ext/mods/gameserver/network/SystemMessageId.SINCE_S1_PARTY_WITHDREW_FROM_THE_DUEL_S2_PARTY_HAS_WON:Lext/mods/gameserver/network/SystemMessageId;
        58: goto          64
        61: getstatic     #264                // Field ext/mods/gameserver/network/SystemMessageId.SINCE_S1_WITHDREW_FROM_THE_DUEL_S2_HAS_WON:Lext/mods/gameserver/network/SystemMessageId;
        64: invokestatic  #58                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        67: aload_0
        68: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        71: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        74: invokevirtual #271                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        77: aload_0
        78: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        81: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        84: invokevirtual #271                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        87: astore_2
        88: aload_0
        89: aload_0
        90: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        93: iconst_1
        94: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        97: dup
        98: iconst_0
        99: aload_2
       100: aastore
       101: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       104: aload_0
       105: aload_0
       106: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       109: iconst_1
       110: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       113: dup
       114: iconst_0
       115: aload_2
       116: aastore
       117: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       120: aload_0
       121: getfield      #33                 // Field _isPartyDuel:Z
       124: ifeq          133
       127: getstatic     #275                // Field ext/mods/gameserver/network/SystemMessageId.S1_PARTY_HAS_WON_THE_DUEL:Lext/mods/gameserver/network/SystemMessageId;
       130: goto          136
       133: getstatic     #278                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_WON_THE_DUEL:Lext/mods/gameserver/network/SystemMessageId;
       136: invokestatic  #58                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       139: aload_0
       140: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       143: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       146: invokevirtual #271                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       149: astore_2
       150: goto          265
       153: aload_0
       154: getfield      #33                 // Field _isPartyDuel:Z
       157: ifeq          166
       160: getstatic     #261                // Field ext/mods/gameserver/network/SystemMessageId.SINCE_S1_PARTY_WITHDREW_FROM_THE_DUEL_S2_PARTY_HAS_WON:Lext/mods/gameserver/network/SystemMessageId;
       163: goto          169
       166: getstatic     #264                // Field ext/mods/gameserver/network/SystemMessageId.SINCE_S1_WITHDREW_FROM_THE_DUEL_S2_HAS_WON:Lext/mods/gameserver/network/SystemMessageId;
       169: invokestatic  #58                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       172: aload_0
       173: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       176: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       179: invokevirtual #271                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       182: aload_0
       183: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       186: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       189: invokevirtual #271                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       192: astore_2
       193: aload_0
       194: aload_0
       195: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       198: iconst_1
       199: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       202: dup
       203: iconst_0
       204: aload_2
       205: aastore
       206: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       209: aload_0
       210: aload_0
       211: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       214: iconst_1
       215: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       218: dup
       219: iconst_0
       220: aload_2
       221: aastore
       222: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       225: aload_0
       226: getfield      #33                 // Field _isPartyDuel:Z
       229: ifeq          238
       232: getstatic     #275                // Field ext/mods/gameserver/network/SystemMessageId.S1_PARTY_HAS_WON_THE_DUEL:Lext/mods/gameserver/network/SystemMessageId;
       235: goto          241
       238: getstatic     #278                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_WON_THE_DUEL:Lext/mods/gameserver/network/SystemMessageId;
       241: invokestatic  #58                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       244: aload_0
       245: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       248: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       251: invokevirtual #271                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       254: astore_2
       255: goto          265
       258: getstatic     #281                // Field ext/mods/gameserver/network/SystemMessageId.THE_DUEL_HAS_ENDED_IN_A_TIE:Lext/mods/gameserver/network/SystemMessageId;
       261: invokestatic  #58                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       264: astore_2
       265: new           #284                // class ext/mods/gameserver/network/serverpackets/ExDuelEnd
       268: dup
       269: aload_0
       270: getfield      #33                 // Field _isPartyDuel:Z
       273: invokespecial #286                // Method ext/mods/gameserver/network/serverpackets/ExDuelEnd."<init>":(Z)V
       276: astore_3
       277: aload_0
       278: aload_0
       279: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       282: iconst_2
       283: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       286: dup
       287: iconst_0
       288: aload_2
       289: aastore
       290: dup
       291: iconst_1
       292: aload_3
       293: aastore
       294: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       297: aload_0
       298: aload_0
       299: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       302: iconst_2
       303: anewarray     #64                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       306: dup
       307: iconst_0
       308: aload_2
       309: aastore
       310: dup
       311: iconst_1
       312: aload_3
       313: aastore
       314: invokevirtual #66                 // Method broadcastTo:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       317: aload_0
       318: aload_1
       319: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       322: if_acmpne     329
       325: iconst_1
       326: goto          330
       329: iconst_0
       330: invokevirtual #290                // Method restorePlayerConditions:(Z)V
       333: invokestatic  #293                // Method ext/mods/gameserver/data/manager/DuelManager.getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
       336: aload_0
       337: getfield      #23                 // Field _duelId:I
       340: invokevirtual #299                // Method ext/mods/gameserver/data/manager/DuelManager.removeDuel:(I)V
       343: return
      LineNumberTable:
        line 356: 0
        line 357: 2
        line 360: 48
        line 361: 88
        line 362: 104
        line 364: 120
        line 365: 150
        line 368: 153
        line 369: 193
        line 370: 209
        line 372: 225
        line 373: 255
        line 376: 258
        line 380: 265
        line 382: 277
        line 383: 297
        line 385: 317
        line 387: 333
        line 388: 343
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     344     0  this   Lext/mods/gameserver/model/entity/Duel;
            0     344     1 result   Lext/mods/gameserver/enums/duels/DuelResult;
            2     342     2    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          277      67     3 duelEnd   Lext/mods/gameserver/network/serverpackets/ExDuelEnd;
      StackMapTable: number_of_entries = 16
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]
        frame_type = 12 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 55 /* same */
        frame_type = 12 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 16 /* same */
        frame_type = 12 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 55 /* same */
        frame_type = 12 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 16 /* same */
        frame_type = 6 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/model/entity/Duel, class ext/mods/gameserver/enums/duels/DuelResult, class ext/mods/gameserver/network/serverpackets/SystemMessage, class ext/mods/gameserver/network/serverpackets/ExDuelEnd ]
          stack = [ class ext/mods/gameserver/model/entity/Duel ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/Duel, class ext/mods/gameserver/enums/duels/DuelResult, class ext/mods/gameserver/network/serverpackets/SystemMessage, class ext/mods/gameserver/network/serverpackets/ExDuelEnd ]
          stack = [ class ext/mods/gameserver/model/entity/Duel, int ]

  protected ext.mods.gameserver.enums.duels.DuelResult checkEndDuelCondition();
    descriptor: ()Lext/mods/gameserver/enums/duels/DuelResult;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #240                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
         7: ifne          24
        10: aload_0
        11: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        14: invokevirtual #240                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        17: ifne          24
        20: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
        23: areturn
        24: aload_0
        25: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        28: invokevirtual #240                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        31: ifne          46
        34: aload_0
        35: aload_0
        36: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        39: invokevirtual #302                // Method onPlayerDefeat:(Lext/mods/gameserver/model/actor/Player;)V
        42: getstatic     #305                // Field ext/mods/gameserver/enums/duels/DuelResult.TEAM_1_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
        45: areturn
        46: aload_0
        47: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        50: invokevirtual #240                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        53: ifne          68
        56: aload_0
        57: aload_0
        58: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        61: invokevirtual #302                // Method onPlayerDefeat:(Lext/mods/gameserver/model/actor/Player;)V
        64: getstatic     #308                // Field ext/mods/gameserver/enums/duels/DuelResult.TEAM_2_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
        67: areturn
        68: aload_0
        69: getfield      #311                // Field _surrenderRequest:I
        72: ifeq          93
        75: aload_0
        76: getfield      #311                // Field _surrenderRequest:I
        79: iconst_1
        80: if_icmpne     89
        83: getstatic     #305                // Field ext/mods/gameserver/enums/duels/DuelResult.TEAM_1_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
        86: goto          92
        89: getstatic     #308                // Field ext/mods/gameserver/enums/duels/DuelResult.TEAM_2_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
        92: areturn
        93: aload_0
        94: invokevirtual #314                // Method getRemainingTime:()I
        97: ifgt          104
       100: getstatic     #317                // Field ext/mods/gameserver/enums/duels/DuelResult.TIMEOUT:Lext/mods/gameserver/enums/duels/DuelResult;
       103: areturn
       104: aload_0
       105: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       108: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
       111: getstatic     #320                // Field ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
       114: if_acmpne     121
       117: getstatic     #323                // Field ext/mods/gameserver/enums/duels/DuelResult.TEAM_1_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
       120: areturn
       121: aload_0
       122: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       125: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
       128: getstatic     #320                // Field ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
       131: if_acmpne     138
       134: getstatic     #326                // Field ext/mods/gameserver/enums/duels/DuelResult.TEAM_2_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
       137: areturn
       138: aload_0
       139: getfield      #33                 // Field _isPartyDuel:Z
       142: ifne          302
       145: aload_0
       146: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       149: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
       152: getstatic     #329                // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
       155: if_acmpeq     171
       158: aload_0
       159: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       162: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
       165: getstatic     #329                // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
       168: if_acmpne     175
       171: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       174: areturn
       175: aload_0
       176: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       179: aload_0
       180: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       183: sipush        2000
       186: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       189: ifne          196
       192: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       195: areturn
       196: aload_0
       197: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       200: invokevirtual #336                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
       203: ifne          216
       206: aload_0
       207: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       210: invokevirtual #336                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
       213: ifeq          220
       216: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       219: areturn
       220: aload_0
       221: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       224: getstatic     #340                // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
       227: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       230: ifne          298
       233: aload_0
       234: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       237: getstatic     #340                // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
       240: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       243: ifne          298
       246: aload_0
       247: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       250: getstatic     #350                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       253: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       256: ifne          298
       259: aload_0
       260: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       263: getstatic     #350                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       266: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       269: ifne          298
       272: aload_0
       273: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       276: getstatic     #353                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       279: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       282: ifne          298
       285: aload_0
       286: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       289: getstatic     #353                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       292: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       295: ifeq          552
       298: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       301: areturn
       302: aload_0
       303: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       306: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       309: ifnull        427
       312: aload_0
       313: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       316: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       319: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       322: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       327: astore_1
       328: aload_1
       329: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       334: ifeq          427
       337: aload_1
       338: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       343: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
       346: astore_2
       347: aload_2
       348: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
       351: getstatic     #329                // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
       354: if_acmpne     361
       357: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       360: areturn
       361: aload_2
       362: aload_0
       363: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       366: sipush        2000
       369: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       372: ifne          379
       375: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       378: areturn
       379: aload_2
       380: invokevirtual #336                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
       383: ifeq          390
       386: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       389: areturn
       390: aload_2
       391: getstatic     #340                // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
       394: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       397: ifne          420
       400: aload_2
       401: getstatic     #353                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       404: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       407: ifne          420
       410: aload_2
       411: getstatic     #350                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       414: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       417: ifeq          424
       420: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       423: areturn
       424: goto          328
       427: aload_0
       428: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       431: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       434: ifnull        552
       437: aload_0
       438: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       441: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       444: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       447: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       452: astore_1
       453: aload_1
       454: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       459: ifeq          552
       462: aload_1
       463: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       468: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
       471: astore_2
       472: aload_2
       473: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
       476: getstatic     #329                // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
       479: if_acmpne     486
       482: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       485: areturn
       486: aload_2
       487: aload_0
       488: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       491: sipush        2000
       494: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       497: ifne          504
       500: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       503: areturn
       504: aload_2
       505: invokevirtual #336                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
       508: ifeq          515
       511: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       514: areturn
       515: aload_2
       516: getstatic     #340                // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
       519: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       522: ifne          545
       525: aload_2
       526: getstatic     #353                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       529: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       532: ifne          545
       535: aload_2
       536: getstatic     #350                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       539: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       542: ifeq          549
       545: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
       548: areturn
       549: goto          453
       552: getstatic     #117                // Field ext/mods/gameserver/enums/duels/DuelResult.CONTINUE:Lext/mods/gameserver/enums/duels/DuelResult;
       555: areturn
      LineNumberTable:
        line 396: 0
        line 397: 20
        line 399: 24
        line 401: 34
        line 402: 42
        line 405: 46
        line 407: 56
        line 408: 64
        line 411: 68
        line 412: 75
        line 414: 93
        line 415: 100
        line 417: 104
        line 418: 117
        line 420: 121
        line 421: 134
        line 423: 138
        line 425: 145
        line 426: 171
        line 428: 175
        line 429: 192
        line 431: 196
        line 432: 216
        line 434: 220
        line 435: 298
        line 439: 302
        line 441: 312
        line 443: 347
        line 444: 357
        line 446: 361
        line 447: 375
        line 449: 379
        line 450: 386
        line 452: 390
        line 453: 420
        line 454: 424
        line 457: 427
        line 459: 437
        line 461: 472
        line 462: 482
        line 464: 486
        line 465: 500
        line 467: 504
        line 468: 511
        line 470: 515
        line 471: 545
        line 472: 549
        line 476: 552
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          347      77     2 partyMember   Lext/mods/gameserver/model/actor/Player;
          472      77     2 partyMember   Lext/mods/gameserver/model/actor/Player;
            0     556     0  this   Lext/mods/gameserver/model/entity/Duel;
      StackMapTable: number_of_entries = 30
        frame_type = 24 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 20 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/duels/DuelResult ]
        frame_type = 0 /* same */
        frame_type = 10 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 32 /* same */
        frame_type = 3 /* same */
        frame_type = 20 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 77
        frame_type = 3 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 17 /* same */
        frame_type = 10 /* same */
        frame_type = 29 /* same */
        frame_type = 250 /* chop */
          offset_delta = 3
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 17 /* same */
        frame_type = 10 /* same */
        frame_type = 29 /* same */
        frame_type = 250 /* chop */
          offset_delta = 3
        frame_type = 250 /* chop */
          offset_delta = 2

  public void doSurrender(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #311                // Field _surrenderRequest:I
         4: ifeq          8
         7: return
         8: aload_0
         9: getfield      #33                 // Field _isPartyDuel:Z
        12: ifeq          239
        15: aload_0
        16: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        19: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        22: aload_1
        23: invokevirtual #356                // Method ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
        26: ifeq          127
        29: aload_0
        30: iconst_1
        31: putfield      #311                // Field _surrenderRequest:I
        34: aload_0
        35: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        38: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        41: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        44: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        49: astore_2
        50: aload_2
        51: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        56: ifeq          79
        59: aload_2
        60: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        65: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
        68: astore_3
        69: aload_3
        70: getstatic     #247                // Field ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
        73: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
        76: goto          50
        79: aload_0
        80: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        83: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        86: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        89: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        94: astore_2
        95: aload_2
        96: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       101: ifeq          124
       104: aload_2
       105: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       110: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
       113: astore_3
       114: aload_3
       115: getstatic     #320                // Field ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
       118: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       121: goto          95
       124: goto          308
       127: aload_0
       128: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       131: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       134: aload_1
       135: invokevirtual #356                // Method ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
       138: ifeq          308
       141: aload_0
       142: iconst_2
       143: putfield      #311                // Field _surrenderRequest:I
       146: aload_0
       147: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       150: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       153: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       156: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       161: astore_2
       162: aload_2
       163: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       168: ifeq          191
       171: aload_2
       172: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       177: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
       180: astore_3
       181: aload_3
       182: getstatic     #247                // Field ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
       185: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       188: goto          162
       191: aload_0
       192: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       195: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       198: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       201: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       206: astore_2
       207: aload_2
       208: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       213: ifeq          236
       216: aload_2
       217: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       222: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
       225: astore_3
       226: aload_3
       227: getstatic     #320                // Field ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
       230: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       233: goto          207
       236: goto          308
       239: aload_1
       240: aload_0
       241: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       244: if_acmpne     275
       247: aload_0
       248: iconst_1
       249: putfield      #311                // Field _surrenderRequest:I
       252: aload_0
       253: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       256: getstatic     #247                // Field ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
       259: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       262: aload_0
       263: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       266: getstatic     #320                // Field ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
       269: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       272: goto          308
       275: aload_1
       276: aload_0
       277: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       280: if_acmpne     308
       283: aload_0
       284: iconst_2
       285: putfield      #311                // Field _surrenderRequest:I
       288: aload_0
       289: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       292: getstatic     #247                // Field ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
       295: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       298: aload_0
       299: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       302: getstatic     #320                // Field ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
       305: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       308: return
      LineNumberTable:
        line 485: 0
        line 486: 7
        line 488: 8
        line 490: 15
        line 492: 29
        line 494: 34
        line 495: 69
        line 497: 79
        line 498: 114
        line 500: 127
        line 502: 141
        line 504: 146
        line 505: 181
        line 507: 191
        line 508: 226
        line 513: 239
        line 515: 247
        line 517: 252
        line 518: 262
        line 520: 275
        line 522: 283
        line 524: 288
        line 525: 298
        line 528: 308
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           69       7     3 partyPlayer   Lext/mods/gameserver/model/actor/Player;
          114       7     3 partyPlayer   Lext/mods/gameserver/model/actor/Player;
          181       7     3 partyPlayer   Lext/mods/gameserver/model/actor/Player;
          226       7     3 partyPlayer   Lext/mods/gameserver/model/actor/Player;
            0     309     0  this   Lext/mods/gameserver/model/entity/Duel;
            0     309     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 13
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28
        frame_type = 2 /* same */
        frame_type = 35 /* same */
        frame_type = 32 /* same */

  public void onPlayerDefeat(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_1
         1: getstatic     #247                // Field ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
         4: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
         7: aload_0
         8: getfield      #33                 // Field _isPartyDuel:Z
        11: ifeq          157
        14: iconst_1
        15: istore_2
        16: aload_1
        17: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        20: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        23: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        28: astore_3
        29: aload_3
        30: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          68
        38: aload_3
        39: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
        47: astore        4
        49: aload         4
        51: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
        54: getstatic     #364                // Field ext/mods/gameserver/enums/duels/DuelState.DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
        57: if_acmpne     65
        60: iconst_0
        61: istore_2
        62: goto          68
        65: goto          29
        68: iload_2
        69: ifeq          154
        72: aload_0
        73: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        76: astore_3
        77: aload_0
        78: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
        81: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        84: aload_1
        85: invokevirtual #356                // Method ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
        88: ifeq          96
        91: aload_0
        92: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
        95: astore_3
        96: aload_3
        97: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       100: invokevirtual #76                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       103: invokeinterface #182,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       108: astore        4
       110: aload         4
       112: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       117: ifeq          154
       120: aload         4
       122: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       127: checkcast     #71                 // class ext/mods/gameserver/model/actor/Player
       130: astore        5
       132: aload         5
       134: invokevirtual #367                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       137: getstatic     #371                // Field ext/mods/gameserver/enums/actors/MissionType.DUAL_WON:Lext/mods/gameserver/enums/actors/MissionType;
       140: invokevirtual #377                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       143: aload         5
       145: getstatic     #320                // Field ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
       148: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       151: goto          110
       154: goto          214
       157: aload_0
       158: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       161: aload_1
       162: if_acmpne     191
       165: aload_0
       166: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       169: getstatic     #320                // Field ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
       172: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       175: aload_0
       176: getfield      #30                 // Field _playerB:Lext/mods/gameserver/model/actor/Player;
       179: invokevirtual #367                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       182: getstatic     #371                // Field ext/mods/gameserver/enums/actors/MissionType.DUAL_WON:Lext/mods/gameserver/enums/actors/MissionType;
       185: invokevirtual #377                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       188: goto          214
       191: aload_0
       192: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       195: getstatic     #320                // Field ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
       198: invokevirtual #360                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       201: aload_0
       202: getfield      #26                 // Field _playerA:Lext/mods/gameserver/model/actor/Player;
       205: invokevirtual #367                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       208: getstatic     #371                // Field ext/mods/gameserver/enums/actors/MissionType.DUAL_WON:Lext/mods/gameserver/enums/actors/MissionType;
       211: invokevirtual #377                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       214: return
      LineNumberTable:
        line 536: 0
        line 538: 7
        line 540: 14
        line 541: 16
        line 543: 49
        line 545: 60
        line 546: 62
        line 548: 65
        line 550: 68
        line 552: 72
        line 553: 77
        line 554: 91
        line 556: 96
        line 558: 132
        line 559: 143
        line 560: 151
        line 562: 154
        line 565: 157
        line 567: 165
        line 568: 175
        line 572: 191
        line 573: 201
        line 576: 214
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49      16     4 partyPlayer   Lext/mods/gameserver/model/actor/Player;
          132      19     5 partyPlayer   Lext/mods/gameserver/model/actor/Player;
           77      77     3 winner   Lext/mods/gameserver/model/actor/Player;
           16     138     2 teamDefeated   Z
            0     215     0  this   Lext/mods/gameserver/model/entity/Duel;
            0     215     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 9
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ int, class java/util/Iterator ]
        frame_type = 35 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/util/Iterator ]
        frame_type = 248 /* chop */
          offset_delta = 43
        frame_type = 2 /* same */
        frame_type = 33 /* same */
        frame_type = 22 /* same */

  public void onPartyEdit();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _isPartyDuel:Z
         4: ifne          8
         7: return
         8: aload_0
         9: getfield      #13                 // Field _playerConditions:Ljava/util/Set;
        12: invokeinterface #383,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        17: astore_1
        18: aload_1
        19: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          53
        27: aload_1
        28: invokeinterface #192,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #213                // class ext/mods/gameserver/model/entity/PlayerCondition
        36: astore_2
        37: aload_2
        38: iconst_1
        39: invokevirtual #384                // Method ext/mods/gameserver/model/entity/PlayerCondition.restoreCondition:(Z)V
        42: aload_2
        43: invokevirtual #387                // Method ext/mods/gameserver/model/entity/PlayerCondition.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        46: iconst_0
        47: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.setInDuel:(I)V
        50: goto          18
        53: aload_0
        54: getstatic     #287                // Field ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
        57: invokevirtual #147                // Method endDuel:(Lext/mods/gameserver/enums/duels/DuelResult;)V
        60: return
      LineNumberTable:
        line 583: 0
        line 584: 7
        line 586: 8
        line 588: 37
        line 589: 42
        line 590: 50
        line 592: 53
        line 593: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      13     2  cond   Lext/mods/gameserver/model/entity/PlayerCondition;
            0      61     0  this   Lext/mods/gameserver/model/entity/Duel;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 34

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #391                // class ext/mods/gameserver/network/serverpackets/PlaySound
         3: dup
         4: iconst_1
         5: ldc_w         #393                // String B04_S01
         8: invokespecial #394                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;)V
        11: putstatic     #178                // Field B04_S01:Lext/mods/gameserver/network/serverpackets/PlaySound;
        14: return
      LineNumberTable:
        line 45: 0
}
SourceFile: "Duel.java"
NestMembers:
  ext/mods/gameserver/model/entity/Duel$1
BootstrapMethods:
  0: #474 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #456 (Ljava/lang/Object;)V
      #458 REF_invokeVirtual ext/mods/gameserver/model/entity/Duel.lambda$new$0:(Lext/mods/gameserver/model/actor/Player;)V
      #461 (Lext/mods/gameserver/model/actor/Player;)V
  1: #474 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #456 (Ljava/lang/Object;)V
      #462 REF_invokeVirtual ext/mods/gameserver/model/entity/Duel.lambda$new$1:(Lext/mods/gameserver/model/actor/Player;)V
      #461 (Lext/mods/gameserver/model/actor/Player;)V
  2: #474 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #465 ()V
      #466 REF_invokeVirtual ext/mods/gameserver/model/entity/Duel.start:()V
      #465 ()V
  3: #474 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #456 (Ljava/lang/Object;)V
      #469 REF_invokeVirtual ext/mods/gameserver/model/entity/Duel.lambda$restorePlayerConditions$0:(ZLext/mods/gameserver/model/entity/PlayerCondition;)V
      #472 (Lext/mods/gameserver/model/entity/PlayerCondition;)V
InnerClasses:
  public static final #484= #482 of #8;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  static #134;                            // class ext/mods/gameserver/model/entity/Duel$1
  public static final #489= #485 of #487; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
