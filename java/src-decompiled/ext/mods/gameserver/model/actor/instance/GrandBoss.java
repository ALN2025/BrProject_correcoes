// Bytecode for: ext.mods.gameserver.model.actor.instance.GrandBoss
// File: ext\mods\gameserver\model\actor\instance\GrandBoss.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/GrandBoss.class
  Last modified 9 de jul de 2026; size 5536 bytes
  MD5 checksum 8fde325f385eb9986f198addaba0f3ac
  Compiled from "GrandBoss.java"
public final class ext.mods.gameserver.model.actor.instance.GrandBoss extends ext.mods.gameserver.model.actor.instance.Monster
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/GrandBoss
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Monster
  interfaces: 0, fields: 1, methods: 8, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Monster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Monster
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/instance/GrandBoss._lastAnnouncedHpPercent:I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/GrandBoss
    #9 = NameAndType        #11:#12       // _lastAnnouncedHpPercent:I
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
   #11 = Utf8               _lastAnnouncedHpPercent
   #12 = Utf8               I
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/actor/instance/GrandBoss.setRaidRelated:()V
   #14 = NameAndType        #15:#16       // setRaidRelated:()V
   #15 = Utf8               setRaidRelated
   #16 = Utf8               ()V
   #17 = Methodref          #8.#18        // ext/mods/gameserver/model/actor/instance/GrandBoss.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #18 = NameAndType        #19:#20       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #19 = Utf8               getTemplate
   #20 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
   #22 = Class              #24           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #23 = NameAndType        #25:#26       // getAggroRange:()I
   #24 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #25 = Utf8               getAggroRange
   #26 = Utf8               ()I
   #27 = Methodref          #8.#28        // ext/mods/gameserver/model/actor/instance/GrandBoss.setNoRndWalk:(Z)V
   #28 = NameAndType        #29:#30       // setNoRndWalk:(Z)V
   #29 = Utf8               setNoRndWalk
   #30 = Utf8               (Z)V
   #31 = Methodref          #2.#32        // ext/mods/gameserver/model/actor/instance/Monster.onSpawn:()V
   #32 = NameAndType        #33:#16       // onSpawn:()V
   #33 = Utf8               onSpawn
   #34 = Methodref          #2.#35        // ext/mods/gameserver/model/actor/instance/Monster.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #35 = NameAndType        #36:#37       // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #36 = Utf8               doDie
   #37 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #38 = Methodref          #39.#40       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #39 = Class              #41           // ext/mods/gameserver/model/actor/Creature
   #40 = NameAndType        #42:#43       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #41 = Utf8               ext/mods/gameserver/model/actor/Creature
   #42 = Utf8               getActingPlayer
   #43 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #44 = Fieldref           #45.#46       // ext/mods/gameserver/network/SystemMessageId.RAID_WAS_SUCCESSFUL:Lext/mods/gameserver/network/SystemMessageId;
   #45 = Class              #47           // ext/mods/gameserver/network/SystemMessageId
   #46 = NameAndType        #48:#49       // RAID_WAS_SUCCESSFUL:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #48 = Utf8               RAID_WAS_SUCCESSFUL
   #49 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #50 = Methodref          #51.#52       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #51 = Class              #53           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #52 = NameAndType        #54:#55       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #53 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #54 = Utf8               getSystemMessage
   #55 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #56 = Methodref          #8.#57        // ext/mods/gameserver/model/actor/instance/GrandBoss.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #57 = NameAndType        #58:#59       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #58 = Utf8               broadcastPacket
   #59 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #60 = Class              #61           // ext/mods/gameserver/network/serverpackets/PlaySound
   #61 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
   #62 = String             #63           // systemmsg_e.1209
   #63 = Utf8               systemmsg_e.1209
   #64 = Methodref          #60.#65       // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
   #65 = NameAndType        #5:#66        // "<init>":(Ljava/lang/String;)V
   #66 = Utf8               (Ljava/lang/String;)V
   #67 = Fieldref           #68.#69       // ext/mods/Config.ANNOUNCE_DIE_GRANDBOSS:Z
   #68 = Class              #70           // ext/mods/Config
   #69 = NameAndType        #71:#72       // ANNOUNCE_DIE_GRANDBOSS:Z
   #70 = Utf8               ext/mods/Config
   #71 = Utf8               ANNOUNCE_DIE_GRANDBOSS
   #72 = Utf8               Z
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #74 = Class              #76           // ext/mods/gameserver/model/actor/Player
   #75 = NameAndType        #77:#78       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #76 = Utf8               ext/mods/gameserver/model/actor/Player
   #77 = Utf8               getClan
   #78 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #79 = Class              #80           // java/lang/Object
   #80 = Utf8               java/lang/Object
   #81 = Methodref          #8.#82        // ext/mods/gameserver/model/actor/instance/GrandBoss.getName:()Ljava/lang/String;
   #82 = NameAndType        #83:#84       // getName:()Ljava/lang/String;
   #83 = Utf8               getName
   #84 = Utf8               ()Ljava/lang/String;
   #85 = Methodref          #8.#86        // ext/mods/gameserver/model/actor/instance/GrandBoss.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #86 = NameAndType        #87:#88       // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #87 = Utf8               getStatus
   #88 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #89 = Methodref          #90.#91       // ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
   #90 = Class              #92           // ext/mods/gameserver/model/actor/status/AttackableStatus
   #91 = NameAndType        #93:#26       // getLevel:()I
   #92 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
   #93 = Utf8               getLevel
   #94 = Methodref          #95.#96       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #95 = Class              #97           // java/lang/Integer
   #96 = NameAndType        #98:#99       // valueOf:(I)Ljava/lang/Integer;
   #97 = Utf8               java/lang/Integer
   #98 = Utf8               valueOf
   #99 = Utf8               (I)Ljava/lang/Integer;
  #100 = Methodref          #74.#82       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #101 = Methodref          #102.#82      // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #102 = Class              #103          // ext/mods/gameserver/model/pledge/Clan
  #103 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #104 = Methodref          #74.#105      // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #105 = NameAndType        #106:#107     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #106 = Utf8               getSysString
  #107 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #108 = Methodref          #109.#110     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
  #109 = Class              #111          // ext/mods/gameserver/model/World
  #110 = NameAndType        #112:#66      // announceToOnlinePlayers:(Ljava/lang/String;)V
  #111 = Utf8               ext/mods/gameserver/model/World
  #112 = Utf8               announceToOnlinePlayers
  #113 = Methodref          #74.#114      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #114 = NameAndType        #115:#116     // getParty:()Lext/mods/gameserver/model/group/Party;
  #115 = Utf8               getParty
  #116 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #117 = Methodref          #118.#119     // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
  #118 = Class              #120          // ext/mods/gameserver/model/group/Party
  #119 = NameAndType        #121:#122     // getMembers:()Ljava/util/List;
  #120 = Utf8               ext/mods/gameserver/model/group/Party
  #121 = Utf8               getMembers
  #122 = Utf8               ()Ljava/util/List;
  #123 = InterfaceMethodref #124.#125     // java/util/List.iterator:()Ljava/util/Iterator;
  #124 = Class              #126          // java/util/List
  #125 = NameAndType        #127:#128     // iterator:()Ljava/util/Iterator;
  #126 = Utf8               java/util/List
  #127 = Utf8               iterator
  #128 = Utf8               ()Ljava/util/Iterator;
  #129 = InterfaceMethodref #130.#131     // java/util/Iterator.hasNext:()Z
  #130 = Class              #132          // java/util/Iterator
  #131 = NameAndType        #133:#134     // hasNext:()Z
  #132 = Utf8               java/util/Iterator
  #133 = Utf8               hasNext
  #134 = Utf8               ()Z
  #135 = InterfaceMethodref #130.#136     // java/util/Iterator.next:()Ljava/lang/Object;
  #136 = NameAndType        #137:#138     // next:()Ljava/lang/Object;
  #137 = Utf8               next
  #138 = Utf8               ()Ljava/lang/Object;
  #139 = Methodref          #140.#141     // ext/mods/gameserver/data/manager/RaidPointManager.getInstance:()Lext/mods/gameserver/data/manager/RaidPointManager;
  #140 = Class              #142          // ext/mods/gameserver/data/manager/RaidPointManager
  #141 = NameAndType        #143:#144     // getInstance:()Lext/mods/gameserver/data/manager/RaidPointManager;
  #142 = Utf8               ext/mods/gameserver/data/manager/RaidPointManager
  #143 = Utf8               getInstance
  #144 = Utf8               ()Lext/mods/gameserver/data/manager/RaidPointManager;
  #145 = Methodref          #8.#146       // ext/mods/gameserver/model/actor/instance/GrandBoss.getNpcId:()I
  #146 = NameAndType        #147:#26      // getNpcId:()I
  #147 = Utf8               getNpcId
  #148 = Methodref          #149.#150     // ext/mods/commons/random/Rnd.get:(II)I
  #149 = Class              #151          // ext/mods/commons/random/Rnd
  #150 = NameAndType        #152:#153     // get:(II)I
  #151 = Utf8               ext/mods/commons/random/Rnd
  #152 = Utf8               get
  #153 = Utf8               (II)I
  #154 = Methodref          #140.#155     // ext/mods/gameserver/data/manager/RaidPointManager.addPoints:(Lext/mods/gameserver/model/actor/Player;II)V
  #155 = NameAndType        #156:#157     // addPoints:(Lext/mods/gameserver/model/actor/Player;II)V
  #156 = Utf8               addPoints
  #157 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
  #158 = Methodref          #74.#159      // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #159 = NameAndType        #160:#134     // isNoble:()Z
  #160 = Utf8               isNoble
  #161 = Methodref          #162.#163     // ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
  #162 = Class              #164          // ext/mods/gameserver/data/manager/HeroManager
  #163 = NameAndType        #143:#165     // getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
  #164 = Utf8               ext/mods/gameserver/data/manager/HeroManager
  #165 = Utf8               ()Lext/mods/gameserver/data/manager/HeroManager;
  #166 = Methodref          #74.#167      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #167 = NameAndType        #168:#26      // getObjectId:()I
  #168 = Utf8               getObjectId
  #169 = Methodref          #162.#170     // ext/mods/gameserver/data/manager/HeroManager.setRBkilled:(II)V
  #170 = NameAndType        #171:#172     // setRBkilled:(II)V
  #171 = Utf8               setRBkilled
  #172 = Utf8               (II)V
  #173 = Methodref          #2.#174       // ext/mods/gameserver/model/actor/instance/Monster.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #174 = NameAndType        #175:#176     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #175 = Utf8               reduceCurrentHp
  #176 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #177 = Methodref          #178.#179     // ext/mods/gameserver/custom/data/BossHpAnnounceData.getInstance:()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
  #178 = Class              #180          // ext/mods/gameserver/custom/data/BossHpAnnounceData
  #179 = NameAndType        #143:#181     // getInstance:()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
  #180 = Utf8               ext/mods/gameserver/custom/data/BossHpAnnounceData
  #181 = Utf8               ()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
  #182 = Methodref          #178.#183     // ext/mods/gameserver/custom/data/BossHpAnnounceData.isAnnounceEnabledFor:(I)Z
  #183 = NameAndType        #184:#185     // isAnnounceEnabledFor:(I)Z
  #184 = Utf8               isAnnounceEnabledFor
  #185 = Utf8               (I)Z
  #186 = Methodref          #90.#187      // ext/mods/gameserver/model/actor/status/AttackableStatus.getMaxHp:()I
  #187 = NameAndType        #188:#26      // getMaxHp:()I
  #188 = Utf8               getMaxHp
  #189 = Methodref          #90.#190      // ext/mods/gameserver/model/actor/status/AttackableStatus.getHp:()D
  #190 = NameAndType        #191:#192     // getHp:()D
  #191 = Utf8               getHp
  #192 = Utf8               ()D
  #193 = Double             100.0d
  #195 = Methodref          #178.#196     // ext/mods/gameserver/custom/data/BossHpAnnounceData.getThresholds:(I)Ljava/util/List;
  #196 = NameAndType        #197:#198     // getThresholds:(I)Ljava/util/List;
  #197 = Utf8               getThresholds
  #198 = Utf8               (I)Ljava/util/List;
  #199 = Class              #200          // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
  #200 = Utf8               ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
  #201 = Fieldref           #199.#202     // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
  #202 = NameAndType        #203:#12      // percent:I
  #203 = Utf8               percent
  #204 = Fieldref           #199.#205     // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.message:Ljava/lang/String;
  #205 = NameAndType        #206:#207     // message:Ljava/lang/String;
  #206 = Utf8               message
  #207 = Utf8               Ljava/lang/String;
  #208 = String             #209          // %boss%
  #209 = Utf8               %boss%
  #210 = Methodref          #211.#212     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #211 = Class              #213          // java/lang/String
  #212 = NameAndType        #214:#215     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #213 = Utf8               java/lang/String
  #214 = Utf8               replace
  #215 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #216 = String             #217          // %hp%
  #217 = Utf8               %hp%
  #218 = Methodref          #211.#219     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #219 = NameAndType        #98:#220      // valueOf:(I)Ljava/lang/String;
  #220 = Utf8               (I)Ljava/lang/String;
  #221 = Methodref          #109.#222     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #222 = NameAndType        #112:#223     // announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #223 = Utf8               (Ljava/lang/String;Z)V
  #224 = Fieldref           #68.#225      // ext/mods/Config.BLOCK_HEAL_ON_GRANDBOSS:Z
  #225 = NameAndType        #226:#72      // BLOCK_HEAL_ON_GRANDBOSS:Z
  #226 = Utf8               BLOCK_HEAL_ON_GRANDBOSS
  #227 = Methodref          #2.#228       // ext/mods/gameserver/model/actor/instance/Monster.canBeHealed:()Z
  #228 = NameAndType        #229:#134     // canBeHealed:()Z
  #229 = Utf8               canBeHealed
  #230 = Utf8               Code
  #231 = Utf8               LineNumberTable
  #232 = Utf8               LocalVariableTable
  #233 = Utf8               this
  #234 = Utf8               Lext/mods/gameserver/model/actor/instance/GrandBoss;
  #235 = Utf8               objectId
  #236 = Utf8               template
  #237 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #238 = Utf8               getSeeRange
  #239 = Utf8               isRaidBoss
  #240 = Utf8               member
  #241 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #242 = Utf8               party
  #243 = Utf8               Lext/mods/gameserver/model/group/Party;
  #244 = Utf8               killer
  #245 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #246 = Utf8               player
  #247 = Utf8               StackMapTable
  #248 = Utf8               msg
  #249 = Utf8               threshold
  #250 = Utf8               Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;
  #251 = Utf8               damage
  #252 = Utf8               D
  #253 = Utf8               attacker
  #254 = Utf8               awake
  #255 = Utf8               isDOT
  #256 = Utf8               skill
  #257 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #258 = Utf8               currentPercent
  #259 = Utf8               block
  #260 = Utf8               returnHome
  #261 = Utf8               SourceFile
  #262 = Utf8               GrandBoss.java
  #263 = Utf8               InnerClasses
  #264 = Utf8               HpThreshold
{
  public ext.mods.gameserver.model.actor.instance.GrandBoss(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 45: 0
        line 110: 6
        line 47: 12
        line 48: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/instance/GrandBoss;
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
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/GrandBoss;

  public boolean isRaidBoss();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/GrandBoss;

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: invokevirtual #27                 // Method setNoRndWalk:(Z)V
         5: aload_0
         6: invokespecial #31                 // Method ext/mods/gameserver/model/actor/instance/Monster.onSpawn:()V
         9: return
      LineNumberTable:
        line 65: 0
        line 66: 5
        line 67: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/GrandBoss;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #34                 // Method ext/mods/gameserver/model/actor/instance/Monster.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        14: astore_2
        15: aload_2
        16: ifnull        297
        19: aload_0
        20: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.RAID_WAS_SUCCESSFUL:Lext/mods/gameserver/network/SystemMessageId;
        23: invokestatic  #50                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        26: invokevirtual #56                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        29: aload_0
        30: new           #60                 // class ext/mods/gameserver/network/serverpackets/PlaySound
        33: dup
        34: ldc           #62                 // String systemmsg_e.1209
        36: invokespecial #64                 // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
        39: invokevirtual #56                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        42: getstatic     #67                 // Field ext/mods/Config.ANNOUNCE_DIE_GRANDBOSS:Z
        45: ifeq          150
        48: aload_2
        49: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        52: ifnull        109
        55: aload_2
        56: sipush        10235
        59: iconst_4
        60: anewarray     #79                 // class java/lang/Object
        63: dup
        64: iconst_0
        65: aload_0
        66: invokevirtual #81                 // Method getName:()Ljava/lang/String;
        69: aastore
        70: dup
        71: iconst_1
        72: aload_0
        73: invokevirtual #85                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        76: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
        79: invokestatic  #94                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        82: aastore
        83: dup
        84: iconst_2
        85: aload_2
        86: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        89: aastore
        90: dup
        91: iconst_3
        92: aload_2
        93: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        96: invokevirtual #101                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
        99: aastore
       100: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       103: invokestatic  #108                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
       106: goto          150
       109: aload_2
       110: sipush        10236
       113: iconst_3
       114: anewarray     #79                 // class java/lang/Object
       117: dup
       118: iconst_0
       119: aload_0
       120: invokevirtual #81                 // Method getName:()Ljava/lang/String;
       123: aastore
       124: dup
       125: iconst_1
       126: aload_0
       127: invokevirtual #85                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       130: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       133: invokestatic  #94                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       136: aastore
       137: dup
       138: iconst_2
       139: aload_2
       140: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       143: aastore
       144: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       147: invokestatic  #108                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
       150: aload_2
       151: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       154: astore_3
       155: aload_3
       156: ifnull        249
       159: aload_3
       160: invokevirtual #117                // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       163: invokeinterface #123,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       168: astore        4
       170: aload         4
       172: invokeinterface #129,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       177: ifeq          246
       180: aload         4
       182: invokeinterface #135,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       187: checkcast     #74                 // class ext/mods/gameserver/model/actor/Player
       190: astore        5
       192: invokestatic  #139                // Method ext/mods/gameserver/data/manager/RaidPointManager.getInstance:()Lext/mods/gameserver/data/manager/RaidPointManager;
       195: aload         5
       197: aload_0
       198: invokevirtual #145                // Method getNpcId:()I
       201: aload_0
       202: invokevirtual #85                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       205: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       208: iconst_2
       209: idiv
       210: bipush        -5
       212: iconst_5
       213: invokestatic  #148                // Method ext/mods/commons/random/Rnd.get:(II)I
       216: iadd
       217: invokevirtual #154                // Method ext/mods/gameserver/data/manager/RaidPointManager.addPoints:(Lext/mods/gameserver/model/actor/Player;II)V
       220: aload         5
       222: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       225: ifeq          243
       228: invokestatic  #161                // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
       231: aload         5
       233: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       236: aload_0
       237: invokevirtual #145                // Method getNpcId:()I
       240: invokevirtual #169                // Method ext/mods/gameserver/data/manager/HeroManager.setRBkilled:(II)V
       243: goto          170
       246: goto          297
       249: invokestatic  #139                // Method ext/mods/gameserver/data/manager/RaidPointManager.getInstance:()Lext/mods/gameserver/data/manager/RaidPointManager;
       252: aload_2
       253: aload_0
       254: invokevirtual #145                // Method getNpcId:()I
       257: aload_0
       258: invokevirtual #85                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       261: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       264: iconst_2
       265: idiv
       266: bipush        -5
       268: iconst_5
       269: invokestatic  #148                // Method ext/mods/commons/random/Rnd.get:(II)I
       272: iadd
       273: invokevirtual #154                // Method ext/mods/gameserver/data/manager/RaidPointManager.addPoints:(Lext/mods/gameserver/model/actor/Player;II)V
       276: aload_2
       277: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       280: ifeq          297
       283: invokestatic  #161                // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
       286: aload_2
       287: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       290: aload_0
       291: invokevirtual #145                // Method getNpcId:()I
       294: invokevirtual #169                // Method ext/mods/gameserver/data/manager/HeroManager.setRBkilled:(II)V
       297: iconst_1
       298: ireturn
      LineNumberTable:
        line 72: 0
        line 73: 8
        line 75: 10
        line 76: 15
        line 78: 19
        line 79: 29
        line 81: 42
        line 83: 48
        line 84: 55
        line 86: 109
        line 89: 150
        line 90: 155
        line 92: 159
        line 94: 192
        line 95: 220
        line 96: 228
        line 97: 243
        line 101: 249
        line 102: 276
        line 103: 283
        line 107: 297
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          192      51     5 member   Lext/mods/gameserver/model/actor/Player;
          155     142     3 party   Lext/mods/gameserver/model/group/Party;
            0     299     0  this   Lext/mods/gameserver/model/actor/instance/GrandBoss;
            0     299     1 killer   Lext/mods/gameserver/model/actor/Creature;
           15     284     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 8
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 98
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 40 /* same */
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/group/Party, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 72
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
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
         9: invokespecial #173                // Method ext/mods/gameserver/model/actor/instance/Monster.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
        12: invokestatic  #177                // Method ext/mods/gameserver/custom/data/BossHpAnnounceData.getInstance:()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
        15: aload_0
        16: invokevirtual #145                // Method getNpcId:()I
        19: invokevirtual #182                // Method ext/mods/gameserver/custom/data/BossHpAnnounceData.isAnnounceEnabledFor:(I)Z
        22: ifeq          35
        25: aload_0
        26: invokevirtual #85                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        29: invokevirtual #186                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getMaxHp:()I
        32: ifgt          36
        35: return
        36: aload_0
        37: invokevirtual #85                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        40: invokevirtual #189                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getHp:()D
        43: aload_0
        44: invokevirtual #85                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        47: invokevirtual #186                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getMaxHp:()I
        50: i2d
        51: ddiv
        52: ldc2_w        #193                // double 100.0d
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
        74: invokestatic  #177                // Method ext/mods/gameserver/custom/data/BossHpAnnounceData.getInstance:()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
        77: aload_0
        78: invokevirtual #145                // Method getNpcId:()I
        81: invokevirtual #195                // Method ext/mods/gameserver/custom/data/BossHpAnnounceData.getThresholds:(I)Ljava/util/List;
        84: invokeinterface #123,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        89: astore        8
        91: aload         8
        93: invokeinterface #129,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        98: ifeq          185
       101: aload         8
       103: invokeinterface #135,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       108: checkcast     #199                // class ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
       111: astore        9
       113: iload         7
       115: aload         9
       117: getfield      #201                // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
       120: if_icmpgt     182
       123: aload_0
       124: getfield      #7                  // Field _lastAnnouncedHpPercent:I
       127: aload         9
       129: getfield      #201                // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
       132: if_icmple     182
       135: aload_0
       136: aload         9
       138: getfield      #201                // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
       141: putfield      #7                  // Field _lastAnnouncedHpPercent:I
       144: aload         9
       146: getfield      #204                // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.message:Ljava/lang/String;
       149: ldc           #208                // String %boss%
       151: aload_0
       152: invokevirtual #81                 // Method getName:()Ljava/lang/String;
       155: invokevirtual #210                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       158: ldc           #216                // String %hp%
       160: aload         9
       162: getfield      #201                // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
       165: invokestatic  #218                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       168: invokevirtual #210                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       171: astore        10
       173: aload         10
       175: iconst_1
       176: invokestatic  #221                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
       179: goto          185
       182: goto          91
       185: return
      LineNumberTable:
        line 115: 0
        line 117: 12
        line 118: 35
        line 120: 36
        line 122: 59
        line 123: 68
        line 125: 74
        line 127: 113
        line 129: 135
        line 130: 144
        line 131: 173
        line 132: 179
        line 134: 182
        line 135: 185
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          173       9    10   msg   Ljava/lang/String;
          113      69     9 threshold   Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;
            0     186     0  this   Lext/mods/gameserver/model/actor/instance/GrandBoss;
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
         3: instanceof    #8                  // class ext/mods/gameserver/model/actor/instance/GrandBoss
         6: ifeq          17
         9: getstatic     #224                // Field ext/mods/Config.BLOCK_HEAL_ON_GRANDBOSS:Z
        12: ifeq          17
        15: iconst_1
        16: istore_1
        17: iload_1
        18: ifne          32
        21: aload_0
        22: invokespecial #227                // Method ext/mods/gameserver/model/actor/instance/Monster.canBeHealed:()Z
        25: ifeq          32
        28: iconst_1
        29: goto          33
        32: iconst_0
        33: ireturn
      LineNumberTable:
        line 139: 0
        line 140: 2
        line 141: 15
        line 143: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/actor/instance/GrandBoss;
            2      32     1 block   Z
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ int ]
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean returnHome();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 149: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/GrandBoss;
}
SourceFile: "GrandBoss.java"
InnerClasses:
  public static #264= #199 of #178;       // HpThreshold=class ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold of class ext/mods/gameserver/custom/data/BossHpAnnounceData
