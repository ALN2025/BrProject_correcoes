// Bytecode for: ext.mods.gameserver.model.actor.ai.type.ClanHallManagerNpcAI
// File: ext\mods\gameserver\model\actor\ai\type\ClanHallManagerNpcAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI.class
  Last modified 9 de jul de 2026; size 3761 bytes
  MD5 checksum 7878e490a7cc8f594c7e156ace5738ad
  Compiled from "ClanHallManagerNpcAI.java"
public class ext.mods.gameserver.model.actor.ai.type.ClanHallManagerNpcAI extends ext.mods.gameserver.model.actor.ai.type.NpcAI<ext.mods.gameserver.model.actor.instance.ClanHallManagerNpc>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/NpcAI
  interfaces: 0, fields: 1, methods: 4, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/ai/type/NpcAI."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/ai/type/NpcAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI._lastBuffCheckTime:J
    #8 = Class              #10           // ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI
    #9 = NameAndType        #11:#12       // _lastBuffCheckTime:J
   #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI
   #11 = Utf8               _lastBuffCheckTime
   #12 = Utf8               J
   #13 = Methodref          #14.#15       // java/lang/System.currentTimeMillis:()J
   #14 = Class              #16           // java/lang/System
   #15 = NameAndType        #17:#18       // currentTimeMillis:()J
   #16 = Utf8               java/lang/System
   #17 = Utf8               currentTimeMillis
   #18 = Utf8               ()J
   #19 = Long               300000l
   #21 = Methodref          #22.#23       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #22 = Class              #24           // ext/mods/gameserver/data/SkillTable
   #23 = NameAndType        #25:#26       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #24 = Utf8               ext/mods/gameserver/data/SkillTable
   #25 = Utf8               getInstance
   #26 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #27 = Methodref          #22.#28       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #28 = NameAndType        #29:#30       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #29 = Utf8               getInfo
   #30 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI._actor:Lext/mods/gameserver/model/actor/Creature;
   #32 = NameAndType        #33:#34       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #33 = Utf8               _actor
   #34 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #35 = Class              #36           // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
   #36 = Utf8               ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
   #37 = Methodref          #35.#38       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #38 = NameAndType        #39:#40       // getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #39 = Utf8               getClanHall
   #40 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #41 = Class              #42           // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #42 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #43 = Methodref          #41.#44       // ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
   #44 = NameAndType        #45:#46       // getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
   #45 = Utf8               getFunction
   #46 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
   #47 = Methodref          #48.#49       // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
   #48 = Class              #50           // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
   #49 = NameAndType        #51:#52       // getLvl:()I
   #50 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
   #51 = Utf8               getLvl
   #52 = Utf8               ()I
   #53 = Methodref          #54.#55       // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #54 = Class              #56           // ext/mods/gameserver/skills/L2Skill
   #55 = NameAndType        #57:#58       // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #56 = Utf8               ext/mods/gameserver/skills/L2Skill
   #57 = Utf8               getEffects
   #58 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #59 = Fieldref           #8.#60        // ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI._currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #60 = NameAndType        #61:#62       // _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #61 = Utf8               _currentIntention
   #62 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
   #63 = Methodref          #64.#65       // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #64 = Class              #66           // ext/mods/gameserver/model/actor/ai/Intention
   #65 = NameAndType        #67:#68       // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #66 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #67 = Utf8               getFinalTarget
   #68 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #70 = Class              #72           // ext/mods/gameserver/model/actor/Creature
   #71 = NameAndType        #73:#74       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #72 = Utf8               ext/mods/gameserver/model/actor/Creature
   #73 = Utf8               getActingPlayer
   #74 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #75 = Methodref          #2.#76        // ext/mods/gameserver/model/actor/ai/type/NpcAI.thinkCast:()V
   #76 = NameAndType        #77:#78       // thinkCast:()V
   #77 = Utf8               thinkCast
   #78 = Utf8               ()V
   #79 = Methodref          #64.#80       // ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #80 = NameAndType        #81:#82       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #81 = Utf8               getSkill
   #82 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #83 = Methodref          #35.#84       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
   #84 = NameAndType        #85:#86       // isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
   #85 = Utf8               isSkillDisabled
   #86 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
   #87 = Class              #88           // ext/mods/gameserver/model/actor/Player
   #88 = Utf8               ext/mods/gameserver/model/actor/Player
   #89 = Class              #90           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #90 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #91 = Methodref          #35.#92       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getObjectId:()I
   #92 = NameAndType        #93:#52       // getObjectId:()I
   #93 = Utf8               getObjectId
   #94 = Methodref          #89.#95       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #95 = NameAndType        #5:#96        // "<init>":(I)V
   #96 = Utf8               (I)V
   #97 = Methodref          #35.#98       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #98 = NameAndType        #99:#100      // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #99 = Utf8               getStatus
  #100 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #101 = Methodref          #102.#103     // ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
  #102 = Class              #104          // ext/mods/gameserver/model/actor/status/NpcStatus
  #103 = NameAndType        #105:#106     // getMp:()D
  #104 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
  #105 = Utf8               getMp
  #106 = Utf8               ()D
  #107 = Methodref          #54.#108      // ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
  #108 = NameAndType        #109:#52      // getMpConsume:()I
  #109 = Utf8               getMpConsume
  #110 = Methodref          #54.#111      // ext/mods/gameserver/skills/L2Skill.getMpInitialConsume:()I
  #111 = NameAndType        #112:#52      // getMpInitialConsume:()I
  #112 = Utf8               getMpInitialConsume
  #113 = Methodref          #87.#114      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #114 = NameAndType        #115:#116     // getLocale:()Ljava/util/Locale;
  #115 = Utf8               getLocale
  #116 = Utf8               ()Ljava/util/Locale;
  #117 = String             #118          // html/clanHallManager/support-no_mana.htm
  #118 = Utf8               html/clanHallManager/support-no_mana.htm
  #119 = Methodref          #89.#120      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #120 = NameAndType        #121:#122     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #121 = Utf8               setFile
  #122 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #123 = String             #124          // html/clanHallManager/support-done.htm
  #124 = Utf8               html/clanHallManager/support-done.htm
  #125 = String             #126          // %mp%
  #126 = Utf8               %mp%
  #127 = Methodref          #89.#128      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #128 = NameAndType        #129:#130     // replace:(Ljava/lang/String;I)V
  #129 = Utf8               replace
  #130 = Utf8               (Ljava/lang/String;I)V
  #131 = String             #132          // %objectId%
  #132 = Utf8               %objectId%
  #133 = Methodref          #87.#134      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #134 = NameAndType        #135:#136     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #135 = Utf8               sendPacket
  #136 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #137 = Utf8               (Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;)V
  #138 = Utf8               Code
  #139 = Utf8               LineNumberTable
  #140 = Utf8               LocalVariableTable
  #141 = Utf8               this
  #142 = Utf8               Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
  #143 = Utf8               clanHallManager
  #144 = Utf8               Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;
  #145 = Utf8               thinkIdle
  #146 = Utf8               supportMagicSkill
  #147 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #148 = Utf8               chfSM
  #149 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
  #150 = Utf8               StackMapTable
  #151 = Utf8               skill
  #152 = Utf8               player
  #153 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #154 = Utf8               html
  #155 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #156 = Utf8               resetBuffCheckTime
  #157 = Utf8               Signature
  #158 = Utf8               Lext/mods/gameserver/model/actor/ai/type/NpcAI<Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;>;
  #159 = Utf8               SourceFile
  #160 = Utf8               ClanHallManagerNpcAI.java
{
  public ext.mods.gameserver.model.actor.ai.type.ClanHallManagerNpcAI(ext.mods.gameserver.model.actor.instance.ClanHallManagerNpc);
    descriptor: (Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/NpcAI."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
         5: aload_0
         6: lconst_0
         7: putfield      #7                  // Field _lastBuffCheckTime:J
        10: return
      LineNumberTable:
        line 34: 0
        line 30: 5
        line 35: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
            0      11     1 clanHallManager   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;

  public void thinkIdle();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: invokestatic  #13                 // Method java/lang/System.currentTimeMillis:()J
         3: aload_0
         4: getfield      #7                  // Field _lastBuffCheckTime:J
         7: lsub
         8: ldc2_w        #19                 // long 300000l
        11: lcmp
        12: ifle          82
        15: aload_0
        16: invokestatic  #13                 // Method java/lang/System.currentTimeMillis:()J
        19: putfield      #7                  // Field _lastBuffCheckTime:J
        22: invokestatic  #21                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        25: sipush        4367
        28: iconst_1
        29: invokevirtual #27                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        32: astore_1
        33: aload_0
        34: getfield      #31                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        37: checkcast     #35                 // class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
        40: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        43: bipush        9
        45: invokevirtual #43                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
        48: astore_2
        49: aload_2
        50: ifnull        69
        53: invokestatic  #21                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        56: sipush        4366
        59: aload_2
        60: invokevirtual #47                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
        63: iadd
        64: iconst_1
        65: invokevirtual #27                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        68: astore_1
        69: aload_1
        70: aload_0
        71: getfield      #31                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        74: aload_0
        75: getfield      #31                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        78: invokevirtual #53                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
        81: pop
        82: return
      LineNumberTable:
        line 40: 0
        line 42: 15
        line 43: 22
        line 44: 33
        line 45: 49
        line 46: 53
        line 48: 69
        line 50: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      49     1 supportMagicSkill   Lext/mods/gameserver/skills/L2Skill;
           49      33     2 chfSM   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
            0      83     0  this   Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 249 /* chop */
          offset_delta = 12

  protected void thinkCast();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
         7: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: ifnonnull     18
        13: aload_0
        14: invokespecial #75                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.thinkCast:()V
        17: return
        18: aload_0
        19: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        22: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        25: astore_1
        26: aload_0
        27: getfield      #31                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #35                 // class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
        33: aload_1
        34: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
        37: ifeq          41
        40: return
        41: aload_0
        42: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        45: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        48: checkcast     #87                 // class ext/mods/gameserver/model/actor/Player
        51: astore_2
        52: new           #89                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        55: dup
        56: aload_0
        57: getfield      #31                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        60: checkcast     #35                 // class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
        63: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getObjectId:()I
        66: invokespecial #94                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        69: astore_3
        70: aload_0
        71: getfield      #31                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        74: checkcast     #35                 // class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
        77: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        80: invokevirtual #101                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
        83: aload_1
        84: invokevirtual #107                // Method ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
        87: aload_1
        88: invokevirtual #110                // Method ext/mods/gameserver/skills/L2Skill.getMpInitialConsume:()I
        91: iadd
        92: i2d
        93: dcmpg
        94: ifge          110
        97: aload_3
        98: aload_2
        99: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       102: ldc           #117                // String html/clanHallManager/support-no_mana.htm
       104: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       107: goto          124
       110: aload_0
       111: invokespecial #75                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.thinkCast:()V
       114: aload_3
       115: aload_2
       116: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       119: ldc           #123                // String html/clanHallManager/support-done.htm
       121: invokevirtual #119                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       124: aload_3
       125: ldc           #125                // String %mp%
       127: aload_0
       128: getfield      #31                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       131: checkcast     #35                 // class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
       134: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       137: invokevirtual #101                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
       140: d2i
       141: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       144: aload_3
       145: ldc           #131                // String %objectId%
       147: aload_0
       148: getfield      #31                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       151: checkcast     #35                 // class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
       154: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getObjectId:()I
       157: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       160: aload_2
       161: aload_3
       162: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       165: return
      LineNumberTable:
        line 55: 0
        line 57: 13
        line 58: 17
        line 61: 18
        line 63: 26
        line 64: 40
        line 66: 41
        line 68: 52
        line 69: 70
        line 70: 97
        line 73: 110
        line 75: 114
        line 78: 124
        line 79: 144
        line 80: 160
        line 81: 165
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     166     0  this   Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
           26     140     1 skill   Lext/mods/gameserver/skills/L2Skill;
           52     114     2 player   Lext/mods/gameserver/model/actor/Player;
           70      96     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 4
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 253 /* append */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 13 /* same */

  public void resetBuffCheckTime();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: lconst_0
         2: putfield      #7                  // Field _lastBuffCheckTime:J
         5: return
      LineNumberTable:
        line 85: 0
        line 86: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
}
Signature: #158                         // Lext/mods/gameserver/model/actor/ai/type/NpcAI<Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;>;
SourceFile: "ClanHallManagerNpcAI.java"
