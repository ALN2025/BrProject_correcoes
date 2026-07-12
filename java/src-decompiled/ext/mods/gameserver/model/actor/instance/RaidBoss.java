// Bytecode for: ext.mods.gameserver.model.actor.instance.RaidBoss
// File: ext\mods\gameserver\model\actor\instance\RaidBoss.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/RaidBoss.class
  Last modified 9 de jul de 2026; size 5334 bytes
  MD5 checksum 12d223fd680bea465a139b8bef302b5f
  Compiled from "RaidBoss.java"
public class ext.mods.gameserver.model.actor.instance.RaidBoss extends ext.mods.gameserver.model.actor.instance.Monster
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/RaidBoss
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Monster
  interfaces: 0, fields: 1, methods: 6, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Monster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Monster
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/instance/RaidBoss._lastAnnouncedHpPercent:I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/RaidBoss
    #9 = NameAndType        #11:#12       // _lastAnnouncedHpPercent:I
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/RaidBoss
   #11 = Utf8               _lastAnnouncedHpPercent
   #12 = Utf8               I
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/actor/instance/RaidBoss.setRaidRelated:()V
   #14 = NameAndType        #15:#16       // setRaidRelated:()V
   #15 = Utf8               setRaidRelated
   #16 = Utf8               ()V
   #17 = Methodref          #8.#18        // ext/mods/gameserver/model/actor/instance/RaidBoss.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #18 = NameAndType        #19:#20       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #19 = Utf8               getTemplate
   #20 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
   #22 = Class              #24           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #23 = NameAndType        #25:#26       // getAggroRange:()I
   #24 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #25 = Utf8               getAggroRange
   #26 = Utf8               ()I
   #27 = Methodref          #2.#28        // ext/mods/gameserver/model/actor/instance/Monster.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #28 = NameAndType        #29:#30       // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #29 = Utf8               doDie
   #30 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #32 = Class              #34           // ext/mods/gameserver/model/actor/Creature
   #33 = NameAndType        #35:#36       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #34 = Utf8               ext/mods/gameserver/model/actor/Creature
   #35 = Utf8               getActingPlayer
   #36 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #37 = Fieldref           #38.#39       // ext/mods/gameserver/network/SystemMessageId.RAID_WAS_SUCCESSFUL:Lext/mods/gameserver/network/SystemMessageId;
   #38 = Class              #40           // ext/mods/gameserver/network/SystemMessageId
   #39 = NameAndType        #41:#42       // RAID_WAS_SUCCESSFUL:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #41 = Utf8               RAID_WAS_SUCCESSFUL
   #42 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #44 = Class              #46           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #45 = NameAndType        #47:#48       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #46 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #47 = Utf8               getSystemMessage
   #48 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #49 = Methodref          #8.#50        // ext/mods/gameserver/model/actor/instance/RaidBoss.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #50 = NameAndType        #51:#52       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #51 = Utf8               broadcastPacket
   #52 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = Class              #54           // ext/mods/gameserver/network/serverpackets/PlaySound
   #54 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
   #55 = String             #56           // systemmsg_e.1209
   #56 = Utf8               systemmsg_e.1209
   #57 = Methodref          #53.#58       // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
   #58 = NameAndType        #5:#59        // "<init>":(Ljava/lang/String;)V
   #59 = Utf8               (Ljava/lang/String;)V
   #60 = Fieldref           #61.#62       // ext/mods/Config.ANNOUNCE_DIE_RAIDBOSS:Z
   #61 = Class              #63           // ext/mods/Config
   #62 = NameAndType        #64:#65       // ANNOUNCE_DIE_RAIDBOSS:Z
   #63 = Utf8               ext/mods/Config
   #64 = Utf8               ANNOUNCE_DIE_RAIDBOSS
   #65 = Utf8               Z
   #66 = Methodref          #67.#68       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #67 = Class              #69           // ext/mods/gameserver/model/actor/Player
   #68 = NameAndType        #70:#71       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #69 = Utf8               ext/mods/gameserver/model/actor/Player
   #70 = Utf8               getClan
   #71 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #72 = Class              #73           // java/lang/Object
   #73 = Utf8               java/lang/Object
   #74 = Methodref          #8.#75        // ext/mods/gameserver/model/actor/instance/RaidBoss.getName:()Ljava/lang/String;
   #75 = NameAndType        #76:#77       // getName:()Ljava/lang/String;
   #76 = Utf8               getName
   #77 = Utf8               ()Ljava/lang/String;
   #78 = Methodref          #8.#79        // ext/mods/gameserver/model/actor/instance/RaidBoss.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #79 = NameAndType        #80:#81       // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #80 = Utf8               getStatus
   #81 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #82 = Methodref          #83.#84       // ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
   #83 = Class              #85           // ext/mods/gameserver/model/actor/status/AttackableStatus
   #84 = NameAndType        #86:#26       // getLevel:()I
   #85 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
   #86 = Utf8               getLevel
   #87 = Methodref          #88.#89       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #88 = Class              #90           // java/lang/Integer
   #89 = NameAndType        #91:#92       // valueOf:(I)Ljava/lang/Integer;
   #90 = Utf8               java/lang/Integer
   #91 = Utf8               valueOf
   #92 = Utf8               (I)Ljava/lang/Integer;
   #93 = Methodref          #67.#75       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #94 = Methodref          #95.#75       // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
   #95 = Class              #96           // ext/mods/gameserver/model/pledge/Clan
   #96 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #97 = Methodref          #67.#98       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #98 = NameAndType        #99:#100      // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #99 = Utf8               getSysString
  #100 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #101 = Methodref          #102.#103     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #102 = Class              #104          // ext/mods/gameserver/model/World
  #103 = NameAndType        #105:#106     // announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #104 = Utf8               ext/mods/gameserver/model/World
  #105 = Utf8               announceToOnlinePlayers
  #106 = Utf8               (Ljava/lang/String;Z)V
  #107 = Methodref          #67.#108      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #108 = NameAndType        #109:#110     // getParty:()Lext/mods/gameserver/model/group/Party;
  #109 = Utf8               getParty
  #110 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #111 = Methodref          #112.#113     // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
  #112 = Class              #114          // ext/mods/gameserver/model/group/Party
  #113 = NameAndType        #115:#116     // getMembers:()Ljava/util/List;
  #114 = Utf8               ext/mods/gameserver/model/group/Party
  #115 = Utf8               getMembers
  #116 = Utf8               ()Ljava/util/List;
  #117 = InterfaceMethodref #118.#119     // java/util/List.iterator:()Ljava/util/Iterator;
  #118 = Class              #120          // java/util/List
  #119 = NameAndType        #121:#122     // iterator:()Ljava/util/Iterator;
  #120 = Utf8               java/util/List
  #121 = Utf8               iterator
  #122 = Utf8               ()Ljava/util/Iterator;
  #123 = InterfaceMethodref #124.#125     // java/util/Iterator.hasNext:()Z
  #124 = Class              #126          // java/util/Iterator
  #125 = NameAndType        #127:#128     // hasNext:()Z
  #126 = Utf8               java/util/Iterator
  #127 = Utf8               hasNext
  #128 = Utf8               ()Z
  #129 = InterfaceMethodref #124.#130     // java/util/Iterator.next:()Ljava/lang/Object;
  #130 = NameAndType        #131:#132     // next:()Ljava/lang/Object;
  #131 = Utf8               next
  #132 = Utf8               ()Ljava/lang/Object;
  #133 = Methodref          #134.#135     // ext/mods/gameserver/data/manager/RaidPointManager.getInstance:()Lext/mods/gameserver/data/manager/RaidPointManager;
  #134 = Class              #136          // ext/mods/gameserver/data/manager/RaidPointManager
  #135 = NameAndType        #137:#138     // getInstance:()Lext/mods/gameserver/data/manager/RaidPointManager;
  #136 = Utf8               ext/mods/gameserver/data/manager/RaidPointManager
  #137 = Utf8               getInstance
  #138 = Utf8               ()Lext/mods/gameserver/data/manager/RaidPointManager;
  #139 = Methodref          #8.#140       // ext/mods/gameserver/model/actor/instance/RaidBoss.getNpcId:()I
  #140 = NameAndType        #141:#26      // getNpcId:()I
  #141 = Utf8               getNpcId
  #142 = Methodref          #143.#144     // ext/mods/commons/random/Rnd.get:(II)I
  #143 = Class              #145          // ext/mods/commons/random/Rnd
  #144 = NameAndType        #146:#147     // get:(II)I
  #145 = Utf8               ext/mods/commons/random/Rnd
  #146 = Utf8               get
  #147 = Utf8               (II)I
  #148 = Methodref          #134.#149     // ext/mods/gameserver/data/manager/RaidPointManager.addPoints:(Lext/mods/gameserver/model/actor/Player;II)V
  #149 = NameAndType        #150:#151     // addPoints:(Lext/mods/gameserver/model/actor/Player;II)V
  #150 = Utf8               addPoints
  #151 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
  #152 = Methodref          #67.#153      // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #153 = NameAndType        #154:#128     // isNoble:()Z
  #154 = Utf8               isNoble
  #155 = Methodref          #156.#157     // ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
  #156 = Class              #158          // ext/mods/gameserver/data/manager/HeroManager
  #157 = NameAndType        #137:#159     // getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
  #158 = Utf8               ext/mods/gameserver/data/manager/HeroManager
  #159 = Utf8               ()Lext/mods/gameserver/data/manager/HeroManager;
  #160 = Methodref          #67.#161      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #161 = NameAndType        #162:#26      // getObjectId:()I
  #162 = Utf8               getObjectId
  #163 = Methodref          #156.#164     // ext/mods/gameserver/data/manager/HeroManager.setRBkilled:(II)V
  #164 = NameAndType        #165:#166     // setRBkilled:(II)V
  #165 = Utf8               setRBkilled
  #166 = Utf8               (II)V
  #167 = Methodref          #2.#168       // ext/mods/gameserver/model/actor/instance/Monster.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #168 = NameAndType        #169:#170     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #169 = Utf8               reduceCurrentHp
  #170 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #171 = Methodref          #172.#173     // ext/mods/gameserver/custom/data/BossHpAnnounceData.getInstance:()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
  #172 = Class              #174          // ext/mods/gameserver/custom/data/BossHpAnnounceData
  #173 = NameAndType        #137:#175     // getInstance:()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
  #174 = Utf8               ext/mods/gameserver/custom/data/BossHpAnnounceData
  #175 = Utf8               ()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
  #176 = Methodref          #172.#177     // ext/mods/gameserver/custom/data/BossHpAnnounceData.isAnnounceEnabledFor:(I)Z
  #177 = NameAndType        #178:#179     // isAnnounceEnabledFor:(I)Z
  #178 = Utf8               isAnnounceEnabledFor
  #179 = Utf8               (I)Z
  #180 = Methodref          #83.#181      // ext/mods/gameserver/model/actor/status/AttackableStatus.getMaxHp:()I
  #181 = NameAndType        #182:#26      // getMaxHp:()I
  #182 = Utf8               getMaxHp
  #183 = Methodref          #83.#184      // ext/mods/gameserver/model/actor/status/AttackableStatus.getHp:()D
  #184 = NameAndType        #185:#186     // getHp:()D
  #185 = Utf8               getHp
  #186 = Utf8               ()D
  #187 = Double             100.0d
  #189 = Methodref          #172.#190     // ext/mods/gameserver/custom/data/BossHpAnnounceData.getThresholds:(I)Ljava/util/List;
  #190 = NameAndType        #191:#192     // getThresholds:(I)Ljava/util/List;
  #191 = Utf8               getThresholds
  #192 = Utf8               (I)Ljava/util/List;
  #193 = Class              #194          // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
  #194 = Utf8               ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
  #195 = Fieldref           #193.#196     // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
  #196 = NameAndType        #197:#12      // percent:I
  #197 = Utf8               percent
  #198 = Fieldref           #193.#199     // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.message:Ljava/lang/String;
  #199 = NameAndType        #200:#201     // message:Ljava/lang/String;
  #200 = Utf8               message
  #201 = Utf8               Ljava/lang/String;
  #202 = String             #203          // %boss%
  #203 = Utf8               %boss%
  #204 = Methodref          #205.#206     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #205 = Class              #207          // java/lang/String
  #206 = NameAndType        #208:#209     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #207 = Utf8               java/lang/String
  #208 = Utf8               replace
  #209 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #210 = String             #211          // %hp%
  #211 = Utf8               %hp%
  #212 = Methodref          #205.#213     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #213 = NameAndType        #91:#214      // valueOf:(I)Ljava/lang/String;
  #214 = Utf8               (I)Ljava/lang/String;
  #215 = Fieldref           #61.#216      // ext/mods/Config.BLOCK_HEAL_ON_RAIDBOSS:Z
  #216 = NameAndType        #217:#65      // BLOCK_HEAL_ON_RAIDBOSS:Z
  #217 = Utf8               BLOCK_HEAL_ON_RAIDBOSS
  #218 = Methodref          #2.#219       // ext/mods/gameserver/model/actor/instance/Monster.canBeHealed:()Z
  #219 = NameAndType        #220:#128     // canBeHealed:()Z
  #220 = Utf8               canBeHealed
  #221 = Utf8               Code
  #222 = Utf8               LineNumberTable
  #223 = Utf8               LocalVariableTable
  #224 = Utf8               this
  #225 = Utf8               Lext/mods/gameserver/model/actor/instance/RaidBoss;
  #226 = Utf8               objectId
  #227 = Utf8               template
  #228 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #229 = Utf8               getSeeRange
  #230 = Utf8               isRaidBoss
  #231 = Utf8               member
  #232 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #233 = Utf8               party
  #234 = Utf8               Lext/mods/gameserver/model/group/Party;
  #235 = Utf8               player
  #236 = Utf8               killer
  #237 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #238 = Utf8               StackMapTable
  #239 = Utf8               msg
  #240 = Utf8               threshold
  #241 = Utf8               Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;
  #242 = Utf8               damage
  #243 = Utf8               D
  #244 = Utf8               attacker
  #245 = Utf8               awake
  #246 = Utf8               isDOT
  #247 = Utf8               skill
  #248 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #249 = Utf8               currentPercent
  #250 = Utf8               block
  #251 = Utf8               SourceFile
  #252 = Utf8               RaidBoss.java
  #253 = Utf8               InnerClasses
  #254 = Utf8               HpThreshold
{
  public ext.mods.gameserver.model.actor.instance.RaidBoss(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Monster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: bipush        100
         9: putfield      #7                  // Field _lastAnnouncedHpPercent:I
        12: aload_0
        13: invokevirtual #13                 // Method setRaidRelated:()V
        16: return
      LineNumberTable:
        line 50: 0
        line 111: 6
        line 52: 12
        line 53: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/instance/RaidBoss;
            0      17     1 objectId   I
            0      17     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getSeeRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
         7: ireturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/RaidBoss;

  public boolean isRaidBoss();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/RaidBoss;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #27                 // Method ext/mods/gameserver/model/actor/instance/Monster.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: ifnull        303
        14: aload_1
        15: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        18: astore_2
        19: aload_2
        20: ifnull        303
        23: aload_0
        24: getstatic     #37                 // Field ext/mods/gameserver/network/SystemMessageId.RAID_WAS_SUCCESSFUL:Lext/mods/gameserver/network/SystemMessageId;
        27: invokestatic  #43                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        30: invokevirtual #49                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        33: aload_0
        34: new           #53                 // class ext/mods/gameserver/network/serverpackets/PlaySound
        37: dup
        38: ldc           #55                 // String systemmsg_e.1209
        40: invokespecial #57                 // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
        43: invokevirtual #49                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        46: getstatic     #60                 // Field ext/mods/Config.ANNOUNCE_DIE_RAIDBOSS:Z
        49: ifeq          156
        52: aload_2
        53: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        56: ifnull        114
        59: aload_2
        60: sipush        10233
        63: iconst_4
        64: anewarray     #72                 // class java/lang/Object
        67: dup
        68: iconst_0
        69: aload_0
        70: invokevirtual #74                 // Method getName:()Ljava/lang/String;
        73: aastore
        74: dup
        75: iconst_1
        76: aload_0
        77: invokevirtual #78                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        80: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
        83: invokestatic  #87                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        86: aastore
        87: dup
        88: iconst_2
        89: aload_2
        90: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        93: aastore
        94: dup
        95: iconst_3
        96: aload_2
        97: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       100: invokevirtual #94                 // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       103: aastore
       104: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       107: iconst_1
       108: invokestatic  #101                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
       111: goto          156
       114: aload_2
       115: sipush        10234
       118: iconst_3
       119: anewarray     #72                 // class java/lang/Object
       122: dup
       123: iconst_0
       124: aload_0
       125: invokevirtual #74                 // Method getName:()Ljava/lang/String;
       128: aastore
       129: dup
       130: iconst_1
       131: aload_0
       132: invokevirtual #78                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       135: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       138: invokestatic  #87                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       141: aastore
       142: dup
       143: iconst_2
       144: aload_2
       145: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       148: aastore
       149: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       152: iconst_1
       153: invokestatic  #101                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
       156: aload_2
       157: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       160: astore_3
       161: aload_3
       162: ifnull        255
       165: aload_3
       166: invokevirtual #111                // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       169: invokeinterface #117,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       174: astore        4
       176: aload         4
       178: invokeinterface #123,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       183: ifeq          252
       186: aload         4
       188: invokeinterface #129,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       193: checkcast     #67                 // class ext/mods/gameserver/model/actor/Player
       196: astore        5
       198: invokestatic  #133                // Method ext/mods/gameserver/data/manager/RaidPointManager.getInstance:()Lext/mods/gameserver/data/manager/RaidPointManager;
       201: aload         5
       203: aload_0
       204: invokevirtual #139                // Method getNpcId:()I
       207: aload_0
       208: invokevirtual #78                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       211: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       214: iconst_2
       215: idiv
       216: bipush        -5
       218: iconst_5
       219: invokestatic  #142                // Method ext/mods/commons/random/Rnd.get:(II)I
       222: iadd
       223: invokevirtual #148                // Method ext/mods/gameserver/data/manager/RaidPointManager.addPoints:(Lext/mods/gameserver/model/actor/Player;II)V
       226: aload         5
       228: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       231: ifeq          249
       234: invokestatic  #155                // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
       237: aload         5
       239: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       242: aload_0
       243: invokevirtual #139                // Method getNpcId:()I
       246: invokevirtual #163                // Method ext/mods/gameserver/data/manager/HeroManager.setRBkilled:(II)V
       249: goto          176
       252: goto          303
       255: invokestatic  #133                // Method ext/mods/gameserver/data/manager/RaidPointManager.getInstance:()Lext/mods/gameserver/data/manager/RaidPointManager;
       258: aload_2
       259: aload_0
       260: invokevirtual #139                // Method getNpcId:()I
       263: aload_0
       264: invokevirtual #78                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       267: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       270: iconst_2
       271: idiv
       272: bipush        -5
       274: iconst_5
       275: invokestatic  #142                // Method ext/mods/commons/random/Rnd.get:(II)I
       278: iadd
       279: invokevirtual #148                // Method ext/mods/gameserver/data/manager/RaidPointManager.addPoints:(Lext/mods/gameserver/model/actor/Player;II)V
       282: aload_2
       283: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       286: ifeq          303
       289: invokestatic  #155                // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
       292: aload_2
       293: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       296: aload_0
       297: invokevirtual #139                // Method getNpcId:()I
       300: invokevirtual #163                // Method ext/mods/gameserver/data/manager/HeroManager.setRBkilled:(II)V
       303: iconst_1
       304: ireturn
      LineNumberTable:
        line 70: 0
        line 71: 8
        line 73: 10
        line 75: 14
        line 76: 19
        line 78: 23
        line 79: 33
        line 81: 46
        line 83: 52
        line 84: 59
        line 86: 114
        line 89: 156
        line 90: 161
        line 92: 165
        line 94: 198
        line 95: 226
        line 96: 234
        line 97: 249
        line 101: 255
        line 102: 282
        line 103: 289
        line 108: 303
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          198      51     5 member   Lext/mods/gameserver/model/actor/Player;
          161     142     3 party   Lext/mods/gameserver/model/group/Party;
           19     284     2 player   Lext/mods/gameserver/model/actor/Player;
            0     305     0  this   Lext/mods/gameserver/model/actor/instance/RaidBoss;
            0     305     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 8
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 103
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 41 /* same */
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/group/Party, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 72
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 249 /* chop */
          offset_delta = 47

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=11, args_size=6
         0: aload_0
         1: dload_1
         2: aload_3
         3: iload         4
         5: iload         5
         7: aload         6
         9: invokespecial #167                // Method ext/mods/gameserver/model/actor/instance/Monster.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
        12: invokestatic  #171                // Method ext/mods/gameserver/custom/data/BossHpAnnounceData.getInstance:()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
        15: aload_0
        16: invokevirtual #139                // Method getNpcId:()I
        19: invokevirtual #176                // Method ext/mods/gameserver/custom/data/BossHpAnnounceData.isAnnounceEnabledFor:(I)Z
        22: ifeq          35
        25: aload_0
        26: invokevirtual #78                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        29: invokevirtual #180                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getMaxHp:()I
        32: ifgt          36
        35: return
        36: aload_0
        37: invokevirtual #78                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        40: invokevirtual #183                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getHp:()D
        43: aload_0
        44: invokevirtual #78                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        47: invokevirtual #180                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getMaxHp:()I
        50: i2d
        51: ddiv
        52: ldc2_w        #187                // double 100.0d
        55: dmul
        56: d2i
        57: istore        7
        59: iload         7
        61: aload_0
        62: getfield      #7                  // Field _lastAnnouncedHpPercent:I
        65: if_icmple     74
        68: aload_0
        69: bipush        100
        71: putfield      #7                  // Field _lastAnnouncedHpPercent:I
        74: invokestatic  #171                // Method ext/mods/gameserver/custom/data/BossHpAnnounceData.getInstance:()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
        77: aload_0
        78: invokevirtual #139                // Method getNpcId:()I
        81: invokevirtual #189                // Method ext/mods/gameserver/custom/data/BossHpAnnounceData.getThresholds:(I)Ljava/util/List;
        84: invokeinterface #117,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        89: astore        8
        91: aload         8
        93: invokeinterface #123,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        98: ifeq          185
       101: aload         8
       103: invokeinterface #129,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       108: checkcast     #193                // class ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
       111: astore        9
       113: iload         7
       115: aload         9
       117: getfield      #195                // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
       120: if_icmpgt     182
       123: aload_0
       124: getfield      #7                  // Field _lastAnnouncedHpPercent:I
       127: aload         9
       129: getfield      #195                // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
       132: if_icmple     182
       135: aload_0
       136: aload         9
       138: getfield      #195                // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
       141: putfield      #7                  // Field _lastAnnouncedHpPercent:I
       144: aload         9
       146: getfield      #198                // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.message:Ljava/lang/String;
       149: ldc           #202                // String %boss%
       151: aload_0
       152: invokevirtual #74                 // Method getName:()Ljava/lang/String;
       155: invokevirtual #204                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       158: ldc           #210                // String %hp%
       160: aload         9
       162: getfield      #195                // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
       165: invokestatic  #212                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       168: invokevirtual #204                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       171: astore        10
       173: aload         10
       175: iconst_1
       176: invokestatic  #101                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
       179: goto          185
       182: goto          91
       185: return
      LineNumberTable:
        line 116: 0
        line 118: 12
        line 119: 35
        line 121: 36
        line 123: 59
        line 124: 68
        line 126: 74
        line 128: 113
        line 130: 135
        line 131: 144
        line 132: 173
        line 133: 179
        line 135: 182
        line 136: 185
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          173       9    10   msg   Ljava/lang/String;
          113      69     9 threshold   Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;
            0     186     0  this   Lext/mods/gameserver/model/actor/instance/RaidBoss;
            0     186     1 damage   D
            0     186     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0     186     4 awake   Z
            0     186     5 isDOT   Z
            0     186     6 skill   Lext/mods/gameserver/skills/L2Skill;
           59     127     7 currentPercent   I
      StackMapTable: number_of_entries = 6
        frame_type = 35 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 90
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean canBeHealed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: instanceof    #8                  // class ext/mods/gameserver/model/actor/instance/RaidBoss
         6: ifeq          17
         9: getstatic     #215                // Field ext/mods/Config.BLOCK_HEAL_ON_RAIDBOSS:Z
        12: ifeq          17
        15: iconst_1
        16: istore_1
        17: iload_1
        18: ifne          32
        21: aload_0
        22: invokespecial #218                // Method ext/mods/gameserver/model/actor/instance/Monster.canBeHealed:()Z
        25: ifeq          32
        28: iconst_1
        29: goto          33
        32: iconst_0
        33: ireturn
      LineNumberTable:
        line 140: 0
        line 141: 2
        line 142: 15
        line 144: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/actor/instance/RaidBoss;
            2      32     1 block   Z
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ int ]
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "RaidBoss.java"
InnerClasses:
  public static #254= #193 of #172;       // HpThreshold=class ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold of class ext/mods/gameserver/custom/data/BossHpAnnounceData
