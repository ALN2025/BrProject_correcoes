// Bytecode for: ext.mods.gameserver.model.actor.status.SummonStatus
// File: ext\mods\gameserver\model\actor\status\SummonStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/status/SummonStatus.class
  Last modified 9 de jul de 2026; size 3256 bytes
  MD5 checksum c19f535cd59e98395edd8c3e6e847f69
  Compiled from "SummonStatus.java"
public class ext.mods.gameserver.model.actor.status.SummonStatus<T extends ext.mods.gameserver.model.actor.Summon> extends ext.mods.gameserver.model.actor.status.PlayableStatus<T>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/status/SummonStatus
  super_class: #2                         // ext/mods/gameserver/model/actor/status/PlayableStatus
  interfaces: 0, fields: 0, methods: 5, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/status/PlayableStatus."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/status/PlayableStatus
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/status/PlayableStatus
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/status/SummonStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
    #8 = Class              #10           // ext/mods/gameserver/model/actor/status/SummonStatus
    #9 = NameAndType        #11:#12       // reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
   #10 = Utf8               ext/mods/gameserver/model/actor/status/SummonStatus
   #11 = Utf8               reduceHp
   #12 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/status/SummonStatus._actor:Lext/mods/gameserver/model/actor/Creature;
   #14 = NameAndType        #15:#16       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #15 = Utf8               _actor
   #16 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #17 = Class              #18           // ext/mods/gameserver/model/actor/Summon
   #18 = Utf8               ext/mods/gameserver/model/actor/Summon
   #19 = Methodref          #17.#20       // ext/mods/gameserver/model/actor/Summon.isDead:()Z
   #20 = NameAndType        #21:#22       // isDead:()Z
   #21 = Utf8               isDead
   #22 = Utf8               ()Z
   #23 = Methodref          #17.#24       // ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #24 = NameAndType        #25:#26       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #25 = Utf8               getOwner
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Creature
   #29 = NameAndType        #31:#26       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #30 = Utf8               ext/mods/gameserver/model/actor/Creature
   #31 = Utf8               getActingPlayer
   #32 = Methodref          #33.#34       // ext/mods/gameserver/model/actor/Player.getDuelId:()I
   #33 = Class              #35           // ext/mods/gameserver/model/actor/Player
   #34 = NameAndType        #36:#37       // getDuelId:()I
   #35 = Utf8               ext/mods/gameserver/model/actor/Player
   #36 = Utf8               getDuelId
   #37 = Utf8               ()I
   #38 = Fieldref           #39.#40       // ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
   #39 = Class              #41           // ext/mods/gameserver/enums/duels/DuelState
   #40 = NameAndType        #42:#43       // INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
   #41 = Utf8               ext/mods/gameserver/enums/duels/DuelState
   #42 = Utf8               INTERRUPTED
   #43 = Utf8               Lext/mods/gameserver/enums/duels/DuelState;
   #44 = Methodref          #33.#45       // ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
   #45 = NameAndType        #46:#47       // setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
   #46 = Utf8               setDuelState
   #47 = Utf8               (Lext/mods/gameserver/enums/duels/DuelState;)V
   #48 = Methodref          #2.#9         // ext/mods/gameserver/model/actor/status/PlayableStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
   #49 = Class              #50           // ext/mods/gameserver/model/actor/instance/Servitor
   #50 = Utf8               ext/mods/gameserver/model/actor/instance/Servitor
   #51 = Fieldref           #52.#53       // ext/mods/gameserver/network/SystemMessageId.SUMMON_RECEIVED_DAMAGE_S2_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #52 = Class              #54           // ext/mods/gameserver/network/SystemMessageId
   #53 = NameAndType        #55:#56       // SUMMON_RECEIVED_DAMAGE_S2_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #54 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #55 = Utf8               SUMMON_RECEIVED_DAMAGE_S2_BY_S1
   #56 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #57 = Fieldref           #52.#58       // ext/mods/gameserver/network/SystemMessageId.PET_RECEIVED_S2_DAMAGE_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #58 = NameAndType        #59:#56       // PET_RECEIVED_S2_DAMAGE_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #59 = Utf8               PET_RECEIVED_S2_DAMAGE_BY_S1
   #60 = Methodref          #61.#62       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #61 = Class              #63           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #62 = NameAndType        #64:#65       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #63 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #64 = Utf8               getSystemMessage
   #65 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #66 = Methodref          #61.#67       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #67 = NameAndType        #68:#69       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #68 = Utf8               addCharName
   #69 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #70 = Methodref          #61.#71       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #71 = NameAndType        #72:#73       // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #72 = Utf8               addNumber
   #73 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #74 = Methodref          #33.#75       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #75 = NameAndType        #76:#77       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #76 = Utf8               sendPacket
   #77 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #78 = Methodref          #2.#79        // ext/mods/gameserver/model/actor/status/PlayableStatus.broadcastStatusUpdate:()V
   #79 = NameAndType        #80:#81       // broadcastStatusUpdate:()V
   #80 = Utf8               broadcastStatusUpdate
   #81 = Utf8               ()V
   #82 = Methodref          #17.#83       // ext/mods/gameserver/model/actor/Summon.updateAndBroadcastStatus:(I)V
   #83 = NameAndType        #84:#85       // updateAndBroadcastStatus:(I)V
   #84 = Utf8               updateAndBroadcastStatus
   #85 = Utf8               (I)V
   #86 = Methodref          #17.#87       // ext/mods/gameserver/model/actor/Summon.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #87 = NameAndType        #88:#89       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #88 = Utf8               getTemplate
   #89 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #90 = Methodref          #91.#92       // ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
   #91 = Class              #93           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #92 = NameAndType        #94:#95       // getLevel:()B
   #93 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #94 = Utf8               getLevel
   #95 = Utf8               ()B
   #96 = Utf8               (Lext/mods/gameserver/model/actor/Summon;)V
   #97 = Utf8               Code
   #98 = Utf8               LineNumberTable
   #99 = Utf8               LocalVariableTable
  #100 = Utf8               this
  #101 = Utf8               Lext/mods/gameserver/model/actor/status/SummonStatus;
  #102 = Utf8               actor
  #103 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #104 = Utf8               LocalVariableTypeTable
  #105 = Utf8               Lext/mods/gameserver/model/actor/status/SummonStatus<TT;>;
  #106 = Utf8               TT;
  #107 = Utf8               Signature
  #108 = Utf8               (TT;)V
  #109 = Utf8               (DLext/mods/gameserver/model/actor/Creature;)V
  #110 = Utf8               value
  #111 = Utf8               D
  #112 = Utf8               attacker
  #113 = Utf8               attackerPlayer
  #114 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #115 = Utf8               awake
  #116 = Utf8               Z
  #117 = Utf8               isDOT
  #118 = Utf8               isHPConsumption
  #119 = Utf8               owner
  #120 = Utf8               StackMapTable
  #121 = Utf8               <T:Lext/mods/gameserver/model/actor/Summon;>Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
  #122 = Utf8               SourceFile
  #123 = Utf8               SummonStatus.java
{
  public ext.mods.gameserver.model.actor.status.SummonStatus(T);
    descriptor: (Lext/mods/gameserver/model/actor/Summon;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/status/PlayableStatus."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         5: return
      LineNumberTable:
        line 32: 0
        line 33: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/SummonStatus;
            0       6     1 actor   Lext/mods/gameserver/model/actor/Summon;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/SummonStatus<TT;>;
            0       6     1 actor   TT;
    Signature: #108                         // (TT;)V

  public void reduceHp(double, ext.mods.gameserver.model.actor.Creature);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=3
         0: aload_0
         1: dload_1
         2: aload_3
         3: iconst_1
         4: iconst_0
         5: iconst_0
         6: invokevirtual #7                  // Method reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
         9: return
      LineNumberTable:
        line 38: 0
        line 39: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/status/SummonStatus;
            0      10     1 value   D
            0      10     3 attacker   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/status/SummonStatus<TT;>;

  public void reduceHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, boolean);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=9, args_size=6
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/Summon
         7: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Summon.isDead:()Z
        10: ifeq          14
        13: return
        14: aload_0
        15: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: checkcast     #17                 // class ext/mods/gameserver/model/actor/Summon
        21: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        24: astore        7
        26: aload_3
        27: ifnull        67
        30: aload_3
        31: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        34: astore        8
        36: aload         8
        38: ifnull        67
        41: aload         7
        43: ifnull        59
        46: aload         7
        48: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
        51: aload         8
        53: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
        56: if_icmpeq     67
        59: aload         8
        61: getstatic     #38                 // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
        64: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
        67: aload_0
        68: dload_1
        69: aload_3
        70: iload         4
        72: iload         5
        74: iload         6
        76: invokespecial #48                 // Method ext/mods/gameserver/model/actor/status/PlayableStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
        79: aload_3
        80: ifnull        129
        83: iload         5
        85: ifne          129
        88: aload         7
        90: ifnull        129
        93: aload         7
        95: aload_0
        96: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        99: instanceof    #49                 // class ext/mods/gameserver/model/actor/instance/Servitor
       102: ifeq          111
       105: getstatic     #51                 // Field ext/mods/gameserver/network/SystemMessageId.SUMMON_RECEIVED_DAMAGE_S2_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       108: goto          114
       111: getstatic     #57                 // Field ext/mods/gameserver/network/SystemMessageId.PET_RECEIVED_S2_DAMAGE_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       114: invokestatic  #60                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       117: aload_3
       118: invokevirtual #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       121: dload_1
       122: d2i
       123: invokevirtual #70                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       126: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       129: return
      LineNumberTable:
        line 44: 0
        line 45: 13
        line 47: 14
        line 49: 26
        line 51: 30
        line 52: 36
        line 53: 59
        line 56: 67
        line 58: 79
        line 60: 83
        line 61: 93
        line 63: 129
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      31     8 attackerPlayer   Lext/mods/gameserver/model/actor/Player;
            0     130     0  this   Lext/mods/gameserver/model/actor/status/SummonStatus;
            0     130     1 value   D
            0     130     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0     130     4 awake   Z
            0     130     5 isDOT   Z
            0     130     6 isHPConsumption   Z
           26     104     7 owner   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     130     0  this   Lext/mods/gameserver/model/actor/status/SummonStatus<TT;>;
      StackMapTable: number_of_entries = 6
        frame_type = 14 /* same */
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 107 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/status/SummonStatus, double, class ext/mods/gameserver/model/actor/Creature, int, int, int, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 14 /* same */

  public void broadcastStatusUpdate();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #78                 // Method ext/mods/gameserver/model/actor/status/PlayableStatus.broadcastStatusUpdate:()V
         4: aload_0
         5: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #17                 // class ext/mods/gameserver/model/actor/Summon
        11: iconst_1
        12: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Summon.updateAndBroadcastStatus:(I)V
        15: return
      LineNumberTable:
        line 68: 0
        line 70: 4
        line 71: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/status/SummonStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/status/SummonStatus<TT;>;

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/Summon
         7: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Summon.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        10: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
        13: ireturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/status/SummonStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/status/SummonStatus<TT;>;
}
Signature: #121                         // <T:Lext/mods/gameserver/model/actor/Summon;>Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
SourceFile: "SummonStatus.java"
