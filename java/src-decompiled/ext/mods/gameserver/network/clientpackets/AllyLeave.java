// Bytecode for: ext.mods.gameserver.network.clientpackets.AllyLeave
// File: ext\mods\gameserver\network\clientpackets\AllyLeave.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/AllyLeave.class
  Last modified 9 de jul de 2026; size 2017 bytes
  MD5 checksum ea14b512b72f101985ae2b101652f3f3
  Compiled from "AllyLeave.java"
public final class ext.mods.gameserver.network.clientpackets.AllyLeave extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/AllyLeave
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/AllyLeave.getClient:()Lext/mods/commons/mmocore/MMOClient;
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/AllyLeave
    #9 = NameAndType        #11:#12       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/AllyLeave
   #11 = Utf8               getClient
   #12 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #13 = Class              #14           // ext/mods/gameserver/network/GameClient
   #14 = Utf8               ext/mods/gameserver/network/GameClient
   #15 = Methodref          #13.#16       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #16 = NameAndType        #17:#18       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #17 = Utf8               getPlayer
   #18 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #20 = Class              #22           // ext/mods/gameserver/model/actor/Player
   #21 = NameAndType        #23:#24       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #22 = Utf8               ext/mods/gameserver/model/actor/Player
   #23 = Utf8               getClan
   #24 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #25 = Fieldref           #26.#27       // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_A_CLAN_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
   #26 = Class              #28           // ext/mods/gameserver/network/SystemMessageId
   #27 = NameAndType        #29:#30       // YOU_ARE_NOT_A_CLAN_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
   #28 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #29 = Utf8               YOU_ARE_NOT_A_CLAN_MEMBER
   #30 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #31 = Methodref          #20.#32       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #32 = NameAndType        #33:#34       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #33 = Utf8               sendPacket
   #34 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #35 = Methodref          #20.#36       // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #36 = NameAndType        #37:#38       // isClanLeader:()Z
   #37 = Utf8               isClanLeader
   #38 = Utf8               ()Z
   #39 = Fieldref           #26.#40       // ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEADER_WITHDRAW_ALLY:Lext/mods/gameserver/network/SystemMessageId;
   #40 = NameAndType        #41:#30       // ONLY_CLAN_LEADER_WITHDRAW_ALLY:Lext/mods/gameserver/network/SystemMessageId;
   #41 = Utf8               ONLY_CLAN_LEADER_WITHDRAW_ALLY
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
   #43 = Class              #45           // ext/mods/gameserver/model/pledge/Clan
   #44 = NameAndType        #46:#47       // getAllyId:()I
   #45 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #46 = Utf8               getAllyId
   #47 = Utf8               ()I
   #48 = Fieldref           #26.#49       // ext/mods/gameserver/network/SystemMessageId.NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
   #49 = NameAndType        #50:#30       // NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
   #50 = Utf8               NO_CURRENT_ALLIANCES
   #51 = Methodref          #43.#52       // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
   #52 = NameAndType        #53:#47       // getClanId:()I
   #53 = Utf8               getClanId
   #54 = Fieldref           #26.#55       // ext/mods/gameserver/network/SystemMessageId.ALLIANCE_LEADER_CANT_WITHDRAW:Lext/mods/gameserver/network/SystemMessageId;
   #55 = NameAndType        #56:#30       // ALLIANCE_LEADER_CANT_WITHDRAW:Lext/mods/gameserver/network/SystemMessageId;
   #56 = Utf8               ALLIANCE_LEADER_CANT_WITHDRAW
   #57 = Methodref          #58.#59       // java/lang/System.currentTimeMillis:()J
   #58 = Class              #60           // java/lang/System
   #59 = NameAndType        #61:#62       // currentTimeMillis:()J
   #60 = Utf8               java/lang/System
   #61 = Utf8               currentTimeMillis
   #62 = Utf8               ()J
   #63 = Methodref          #43.#64       // ext/mods/gameserver/model/pledge/Clan.setAllyId:(I)V
   #64 = NameAndType        #65:#66       // setAllyId:(I)V
   #65 = Utf8               setAllyId
   #66 = Utf8               (I)V
   #67 = Methodref          #43.#68       // ext/mods/gameserver/model/pledge/Clan.setAllyName:(Ljava/lang/String;)V
   #68 = NameAndType        #69:#70       // setAllyName:(Ljava/lang/String;)V
   #69 = Utf8               setAllyName
   #70 = Utf8               (Ljava/lang/String;)V
   #71 = Methodref          #43.#72       // ext/mods/gameserver/model/pledge/Clan.changeAllyCrest:(IZ)V
   #72 = NameAndType        #73:#74       // changeAllyCrest:(IZ)V
   #73 = Utf8               changeAllyCrest
   #74 = Utf8               (IZ)V
   #75 = Fieldref           #76.#77       // ext/mods/Config.ALLY_JOIN_DAYS_WHEN_LEAVED:I
   #76 = Class              #78           // ext/mods/Config
   #77 = NameAndType        #79:#80       // ALLY_JOIN_DAYS_WHEN_LEAVED:I
   #78 = Utf8               ext/mods/Config
   #79 = Utf8               ALLY_JOIN_DAYS_WHEN_LEAVED
   #80 = Utf8               I
   #81 = Long               86400000l
   #83 = Methodref          #43.#84       // ext/mods/gameserver/model/pledge/Clan.setAllyPenaltyExpiryTime:(JI)V
   #84 = NameAndType        #85:#86       // setAllyPenaltyExpiryTime:(JI)V
   #85 = Utf8               setAllyPenaltyExpiryTime
   #86 = Utf8               (JI)V
   #87 = Methodref          #43.#88       // ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
   #88 = NameAndType        #89:#6        // updateClanInDB:()V
   #89 = Utf8               updateClanInDB
   #90 = Fieldref           #26.#91       // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_WITHDRAWN_FROM_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
   #91 = NameAndType        #92:#30       // YOU_HAVE_WITHDRAWN_FROM_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
   #92 = Utf8               YOU_HAVE_WITHDRAWN_FROM_ALLIANCE
   #93 = Utf8               Code
   #94 = Utf8               LineNumberTable
   #95 = Utf8               LocalVariableTable
   #96 = Utf8               this
   #97 = Utf8               Lext/mods/gameserver/network/clientpackets/AllyLeave;
   #98 = Utf8               readImpl
   #99 = Utf8               runImpl
  #100 = Utf8               player
  #101 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #102 = Utf8               clan
  #103 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #104 = Utf8               currentTime
  #105 = Utf8               J
  #106 = Utf8               StackMapTable
  #107 = Utf8               SourceFile
  #108 = Utf8               AllyLeave.java
{
  public ext.mods.gameserver.network.clientpackets.AllyLeave();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/AllyLeave;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/network/clientpackets/AllyLeave;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #13                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #15                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        20: astore_2
        21: aload_2
        22: ifnonnull     33
        25: aload_1
        26: getstatic     #25                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_A_CLAN_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
        29: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        32: return
        33: aload_1
        34: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        37: ifne          48
        40: aload_1
        41: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.ONLY_CLAN_LEADER_WITHDRAW_ALLY:Lext/mods/gameserver/network/SystemMessageId;
        44: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        47: return
        48: aload_2
        49: invokevirtual #42                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
        52: ifne          63
        55: aload_1
        56: getstatic     #48                 // Field ext/mods/gameserver/network/SystemMessageId.NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
        59: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        62: return
        63: aload_2
        64: invokevirtual #51                 // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        67: aload_2
        68: invokevirtual #42                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
        71: if_icmpne     82
        74: aload_1
        75: getstatic     #54                 // Field ext/mods/gameserver/network/SystemMessageId.ALLIANCE_LEADER_CANT_WITHDRAW:Lext/mods/gameserver/network/SystemMessageId;
        78: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        81: return
        82: invokestatic  #57                 // Method java/lang/System.currentTimeMillis:()J
        85: lstore_3
        86: aload_2
        87: iconst_0
        88: invokevirtual #63                 // Method ext/mods/gameserver/model/pledge/Clan.setAllyId:(I)V
        91: aload_2
        92: aconst_null
        93: invokevirtual #67                 // Method ext/mods/gameserver/model/pledge/Clan.setAllyName:(Ljava/lang/String;)V
        96: aload_2
        97: iconst_0
        98: iconst_1
        99: invokevirtual #71                 // Method ext/mods/gameserver/model/pledge/Clan.changeAllyCrest:(IZ)V
       102: aload_2
       103: lload_3
       104: getstatic     #75                 // Field ext/mods/Config.ALLY_JOIN_DAYS_WHEN_LEAVED:I
       107: i2l
       108: ldc2_w        #81                 // long 86400000l
       111: lmul
       112: ladd
       113: iconst_1
       114: invokevirtual #83                 // Method ext/mods/gameserver/model/pledge/Clan.setAllyPenaltyExpiryTime:(JI)V
       117: aload_2
       118: invokevirtual #87                 // Method ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
       121: aload_1
       122: getstatic     #90                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_WITHDRAWN_FROM_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
       125: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       128: return
      LineNumberTable:
        line 35: 0
        line 36: 11
        line 37: 15
        line 39: 16
        line 40: 21
        line 42: 25
        line 43: 32
        line 46: 33
        line 48: 40
        line 49: 47
        line 52: 48
        line 54: 55
        line 55: 62
        line 58: 63
        line 60: 74
        line 61: 81
        line 64: 82
        line 65: 86
        line 66: 91
        line 67: 96
        line 68: 102
        line 69: 117
        line 71: 121
        line 72: 128
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     129     0  this   Lext/mods/gameserver/network/clientpackets/AllyLeave;
           11     118     1 player   Lext/mods/gameserver/model/actor/Player;
           21     108     2  clan   Lext/mods/gameserver/model/pledge/Clan;
           86      43     3 currentTime   J
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 18 /* same */
}
SourceFile: "AllyLeave.java"
