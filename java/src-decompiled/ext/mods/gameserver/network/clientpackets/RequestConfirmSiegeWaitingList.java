// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestConfirmSiegeWaitingList
// File: ext\mods\gameserver\network\clientpackets\RequestConfirmSiegeWaitingList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList.class
  Last modified 9 de jul de 2026; size 2936 bytes
  MD5 checksum a58937f98fc9cbe9b3b5913690fdedc1
  Compiled from "RequestConfirmSiegeWaitingList.java"
public final class ext.mods.gameserver.network.clientpackets.RequestConfirmSiegeWaitingList extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 3, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList._castleId:I
   #14 = NameAndType        #15:#16       // _castleId:I
   #15 = Utf8               _castleId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList._clanId:I
   #18 = NameAndType        #19:#16       // _clanId:I
   #19 = Utf8               _clanId
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList._approved:I
   #21 = NameAndType        #22:#16       // _approved:I
   #22 = Utf8               _approved
   #23 = Methodref          #8.#24        // ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #24 = NameAndType        #25:#26       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #25 = Utf8               getClient
   #26 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #27 = Class              #28           // ext/mods/gameserver/network/GameClient
   #28 = Utf8               ext/mods/gameserver/network/GameClient
   #29 = Methodref          #27.#30       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #30 = NameAndType        #31:#32       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #31 = Utf8               getPlayer
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #34 = Class              #36           // ext/mods/gameserver/model/actor/Player
   #35 = NameAndType        #37:#38       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #36 = Utf8               ext/mods/gameserver/model/actor/Player
   #37 = Utf8               getClan
   #38 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #39 = Methodref          #40.#41       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #40 = Class              #42           // ext/mods/gameserver/data/manager/CastleManager
   #41 = NameAndType        #43:#44       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #42 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #43 = Utf8               getInstance
   #44 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #45 = Methodref          #40.#46       // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #46 = NameAndType        #47:#48       // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #47 = Utf8               getCastleById
   #48 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
   #50 = Class              #52           // ext/mods/gameserver/model/residence/castle/Castle
   #51 = NameAndType        #53:#12       // getOwnerId:()I
   #52 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #53 = Utf8               getOwnerId
   #54 = Methodref          #34.#55       // ext/mods/gameserver/model/actor/Player.getClanId:()I
   #55 = NameAndType        #56:#12       // getClanId:()I
   #56 = Utf8               getClanId
   #57 = Methodref          #34.#58       // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #58 = NameAndType        #59:#60       // isClanLeader:()Z
   #59 = Utf8               isClanLeader
   #60 = Utf8               ()Z
   #61 = Methodref          #62.#63       // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #62 = Class              #64           // ext/mods/gameserver/data/sql/ClanTable
   #63 = NameAndType        #43:#65       // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #64 = Utf8               ext/mods/gameserver/data/sql/ClanTable
   #65 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
   #66 = Methodref          #62.#67       // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
   #67 = NameAndType        #37:#68       // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
   #68 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
   #69 = Methodref          #50.#70       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #70 = NameAndType        #71:#72       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #71 = Utf8               getSiege
   #72 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/residence/castle/Siege.isRegistrationOver:()Z
   #74 = Class              #76           // ext/mods/gameserver/model/residence/castle/Siege
   #75 = NameAndType        #77:#60       // isRegistrationOver:()Z
   #76 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #77 = Utf8               isRegistrationOver
   #78 = Fieldref           #79.#80       // ext/mods/gameserver/enums/SiegeSide.PENDING:Lext/mods/gameserver/enums/SiegeSide;
   #79 = Class              #81           // ext/mods/gameserver/enums/SiegeSide
   #80 = NameAndType        #82:#83       // PENDING:Lext/mods/gameserver/enums/SiegeSide;
   #81 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #82 = Utf8               PENDING
   #83 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #84 = Methodref          #74.#85       // ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #85 = NameAndType        #86:#87       // checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #86 = Utf8               checkSide
   #87 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #88 = Fieldref           #79.#89       // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #89 = NameAndType        #90:#83       // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #90 = Utf8               DEFENDER
   #91 = Methodref          #74.#92       // ext/mods/gameserver/model/residence/castle/Siege.registerClan:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
   #92 = NameAndType        #93:#94       // registerClan:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
   #93 = Utf8               registerClan
   #94 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
   #95 = Methodref          #74.#96       // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #96 = NameAndType        #97:#98       // checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #97 = Utf8               checkSides
   #98 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #99 = Methodref          #74.#100      // ext/mods/gameserver/model/residence/castle/Siege.unregisterClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #100 = NameAndType        #101:#102     // unregisterClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #101 = Utf8               unregisterClan
  #102 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #103 = Class              #104          // ext/mods/gameserver/network/serverpackets/SiegeDefenderList
  #104 = Utf8               ext/mods/gameserver/network/serverpackets/SiegeDefenderList
  #105 = Methodref          #103.#106     // ext/mods/gameserver/network/serverpackets/SiegeDefenderList."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
  #106 = NameAndType        #5:#107       // "<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
  #107 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;)V
  #108 = Methodref          #34.#109      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #109 = NameAndType        #110:#111     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = Utf8               sendPacket
  #111 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #112 = Utf8               Code
  #113 = Utf8               LineNumberTable
  #114 = Utf8               LocalVariableTable
  #115 = Utf8               this
  #116 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList;
  #117 = Utf8               readImpl
  #118 = Utf8               runImpl
  #119 = Utf8               player
  #120 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #121 = Utf8               castle
  #122 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #123 = Utf8               clan
  #124 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #125 = Utf8               StackMapTable
  #126 = Class              #127          // ext/mods/gameserver/model/pledge/Clan
  #127 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #128 = Utf8               SourceFile
  #129 = Utf8               RequestConfirmSiegeWaitingList.java
{
  public ext.mods.gameserver.network.clientpackets.RequestConfirmSiegeWaitingList();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _castleId:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _clanId:I
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readD:()I
        21: putfield      #20                 // Field _approved:I
        24: return
      LineNumberTable:
        line 37: 0
        line 38: 8
        line 39: 16
        line 40: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=4, args_size=1
         0: aload_0
         1: invokevirtual #23                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #27                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #29                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        20: ifnonnull     24
        23: return
        24: invokestatic  #39                 // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        27: aload_0
        28: getfield      #13                 // Field _castleId:I
        31: invokevirtual #45                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
        34: astore_2
        35: aload_2
        36: ifnonnull     40
        39: return
        40: aload_2
        41: invokevirtual #49                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        44: aload_1
        45: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        48: if_icmpne     58
        51: aload_1
        52: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        55: ifne          59
        58: return
        59: invokestatic  #61                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        62: aload_0
        63: getfield      #17                 // Field _clanId:I
        66: invokevirtual #66                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        69: astore_3
        70: aload_3
        71: ifnonnull     75
        74: return
        75: aload_2
        76: invokevirtual #69                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        79: invokevirtual #73                 // Method ext/mods/gameserver/model/residence/castle/Siege.isRegistrationOver:()Z
        82: ifne          156
        85: aload_0
        86: getfield      #20                 // Field _approved:I
        89: iconst_1
        90: if_icmpne     121
        93: aload_2
        94: invokevirtual #69                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        97: aload_3
        98: getstatic     #78                 // Field ext/mods/gameserver/enums/SiegeSide.PENDING:Lext/mods/gameserver/enums/SiegeSide;
       101: invokevirtual #84                 // Method ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
       104: ifeq          156
       107: aload_2
       108: invokevirtual #69                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       111: aload_3
       112: getstatic     #88                 // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       115: invokevirtual #91                 // Method ext/mods/gameserver/model/residence/castle/Siege.registerClan:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)V
       118: goto          156
       121: aload_2
       122: invokevirtual #69                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       125: aload_3
       126: iconst_2
       127: anewarray     #79                 // class ext/mods/gameserver/enums/SiegeSide
       130: dup
       131: iconst_0
       132: getstatic     #78                 // Field ext/mods/gameserver/enums/SiegeSide.PENDING:Lext/mods/gameserver/enums/SiegeSide;
       135: aastore
       136: dup
       137: iconst_1
       138: getstatic     #88                 // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       141: aastore
       142: invokevirtual #95                 // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
       145: ifeq          156
       148: aload_2
       149: invokevirtual #69                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       152: aload_3
       153: invokevirtual #99                 // Method ext/mods/gameserver/model/residence/castle/Siege.unregisterClan:(Lext/mods/gameserver/model/pledge/Clan;)V
       156: aload_1
       157: new           #103                // class ext/mods/gameserver/network/serverpackets/SiegeDefenderList
       160: dup
       161: aload_2
       162: invokespecial #105                // Method ext/mods/gameserver/network/serverpackets/SiegeDefenderList."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
       165: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       168: return
      LineNumberTable:
        line 45: 0
        line 46: 11
        line 47: 15
        line 49: 16
        line 50: 23
        line 52: 24
        line 53: 35
        line 54: 39
        line 56: 40
        line 57: 58
        line 59: 59
        line 60: 70
        line 61: 74
        line 63: 75
        line 65: 85
        line 67: 93
        line 68: 107
        line 72: 121
        line 73: 148
        line 77: 156
        line 78: 168
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     169     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList;
           11     158     1 player   Lext/mods/gameserver/model/actor/Player;
           35     134     2 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           70      99     3  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 17 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 45 /* same */
        frame_type = 34 /* same */
}
SourceFile: "RequestConfirmSiegeWaitingList.java"
