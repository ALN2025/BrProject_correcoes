// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestBlock
// File: ext\mods\gameserver\network\clientpackets\RequestBlock.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestBlock.class
  Last modified 9 de jul de 2026; size 2712 bytes
  MD5 checksum e95388e40055f09a0a05b1b04f6e74d3
  Compiled from "RequestBlock.java"
public final class ext.mods.gameserver.network.clientpackets.RequestBlock extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestBlock
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 7, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestBlock.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestBlock
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBlock
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestBlock._type:I
   #14 = NameAndType        #15:#16       // _type:I
   #15 = Utf8               _type
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/RequestBlock.readS:()Ljava/lang/String;
   #18 = NameAndType        #19:#20       // readS:()Ljava/lang/String;
   #19 = Utf8               readS
   #20 = Utf8               ()Ljava/lang/String;
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/network/clientpackets/RequestBlock._targetName:Ljava/lang/String;
   #22 = NameAndType        #23:#24       // _targetName:Ljava/lang/String;
   #23 = Utf8               _targetName
   #24 = Utf8               Ljava/lang/String;
   #25 = Methodref          #8.#26        // ext/mods/gameserver/network/clientpackets/RequestBlock.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #26 = NameAndType        #27:#28       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #27 = Utf8               getClient
   #28 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #29 = Class              #30           // ext/mods/gameserver/network/GameClient
   #30 = Utf8               ext/mods/gameserver/network/GameClient
   #31 = Methodref          #29.#32       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #32 = NameAndType        #33:#34       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #33 = Utf8               getPlayer
   #34 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #36 = Class              #38           // ext/mods/gameserver/data/sql/PlayerInfoTable
   #37 = NameAndType        #39:#40       // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #38 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
   #39 = Utf8               getInstance
   #40 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #41 = Methodref          #36.#42       // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
   #42 = NameAndType        #43:#44       // getPlayerObjectId:(Ljava/lang/String;)I
   #43 = Utf8               getPlayerObjectId
   #44 = Utf8               (Ljava/lang/String;)I
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #46 = Class              #48           // ext/mods/gameserver/model/actor/Player
   #47 = NameAndType        #49:#12       // getObjectId:()I
   #48 = Utf8               ext/mods/gameserver/model/actor/Player
   #49 = Utf8               getObjectId
   #50 = Fieldref           #51.#52       // ext/mods/gameserver/network/SystemMessageId.FAILED_TO_REGISTER_TO_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
   #51 = Class              #53           // ext/mods/gameserver/network/SystemMessageId
   #52 = NameAndType        #54:#55       // FAILED_TO_REGISTER_TO_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
   #53 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #54 = Utf8               FAILED_TO_REGISTER_TO_IGNORE_LIST
   #55 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #56 = Methodref          #46.#57       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #57 = NameAndType        #58:#59       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #58 = Utf8               sendPacket
   #59 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #60 = Methodref          #36.#61       // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerAccessLevel:(I)I
   #61 = NameAndType        #62:#63       // getPlayerAccessLevel:(I)I
   #62 = Utf8               getPlayerAccessLevel
   #63 = Utf8               (I)I
   #64 = Fieldref           #51.#65       // ext/mods/gameserver/network/SystemMessageId.YOU_MAY_NOT_IMPOSE_A_BLOCK_ON_GM:Lext/mods/gameserver/network/SystemMessageId;
   #65 = NameAndType        #66:#55       // YOU_MAY_NOT_IMPOSE_A_BLOCK_ON_GM:Lext/mods/gameserver/network/SystemMessageId;
   #66 = Utf8               YOU_MAY_NOT_IMPOSE_A_BLOCK_ON_GM
   #67 = Methodref          #68.#69       // ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
   #68 = Class              #70           // ext/mods/gameserver/data/manager/RelationManager
   #69 = NameAndType        #39:#71       // getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
   #70 = Utf8               ext/mods/gameserver/data/manager/RelationManager
   #71 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
   #72 = Methodref          #68.#73       // ext/mods/gameserver/data/manager/RelationManager.addToBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
   #73 = NameAndType        #74:#75       // addToBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
   #74 = Utf8               addToBlockList
   #75 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #76 = Methodref          #68.#77       // ext/mods/gameserver/data/manager/RelationManager.removeFromBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
   #77 = NameAndType        #78:#75       // removeFromBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
   #78 = Utf8               removeFromBlockList
   #79 = Methodref          #68.#80       // ext/mods/gameserver/data/manager/RelationManager.sendBlockList:(Lext/mods/gameserver/model/actor/Player;)V
   #80 = NameAndType        #81:#82       // sendBlockList:(Lext/mods/gameserver/model/actor/Player;)V
   #81 = Utf8               sendBlockList
   #82 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #83 = Fieldref           #51.#84       // ext/mods/gameserver/network/SystemMessageId.BLOCKING_ALL:Lext/mods/gameserver/network/SystemMessageId;
   #84 = NameAndType        #85:#55       // BLOCKING_ALL:Lext/mods/gameserver/network/SystemMessageId;
   #85 = Utf8               BLOCKING_ALL
   #86 = Methodref          #46.#87       // ext/mods/gameserver/model/actor/Player.setInBlockingAll:(Z)V
   #87 = NameAndType        #88:#89       // setInBlockingAll:(Z)V
   #88 = Utf8               setInBlockingAll
   #89 = Utf8               (Z)V
   #90 = Fieldref           #51.#91       // ext/mods/gameserver/network/SystemMessageId.NOT_BLOCKING_ALL:Lext/mods/gameserver/network/SystemMessageId;
   #91 = NameAndType        #92:#55       // NOT_BLOCKING_ALL:Lext/mods/gameserver/network/SystemMessageId;
   #92 = Utf8               NOT_BLOCKING_ALL
   #93 = Fieldref           #8.#94        // ext/mods/gameserver/network/clientpackets/RequestBlock.LOGGER:Lext/mods/commons/logging/CLogger;
   #94 = NameAndType        #95:#96       // LOGGER:Lext/mods/commons/logging/CLogger;
   #95 = Utf8               LOGGER
   #96 = Utf8               Lext/mods/commons/logging/CLogger;
   #97 = String             #98           // Unknown block type detected: {}.
   #98 = Utf8               Unknown block type detected: {}.
   #99 = Class              #100          // java/lang/Object
  #100 = Utf8               java/lang/Object
  #101 = Methodref          #102.#103     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #102 = Class              #104          // java/lang/Integer
  #103 = NameAndType        #105:#106     // valueOf:(I)Ljava/lang/Integer;
  #104 = Utf8               java/lang/Integer
  #105 = Utf8               valueOf
  #106 = Utf8               (I)Ljava/lang/Integer;
  #107 = Methodref          #108.#109     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #108 = Class              #110          // ext/mods/commons/logging/CLogger
  #109 = NameAndType        #111:#112     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #110 = Utf8               ext/mods/commons/logging/CLogger
  #111 = Utf8               warn
  #112 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #113 = Utf8               BLOCK
  #114 = Utf8               ConstantValue
  #115 = Integer            0
  #116 = Utf8               UNBLOCK
  #117 = Integer            1
  #118 = Utf8               BLOCKLIST
  #119 = Integer            2
  #120 = Utf8               ALLBLOCK
  #121 = Integer            3
  #122 = Utf8               ALLUNBLOCK
  #123 = Integer            4
  #124 = Utf8               Code
  #125 = Utf8               LineNumberTable
  #126 = Utf8               LocalVariableTable
  #127 = Utf8               this
  #128 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestBlock;
  #129 = Utf8               readImpl
  #130 = Utf8               StackMapTable
  #131 = Utf8               runImpl
  #132 = Utf8               targetId
  #133 = Utf8               player
  #134 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #135 = Utf8               SourceFile
  #136 = Utf8               RequestBlock.java
{
  public ext.mods.gameserver.network.clientpackets.RequestBlock();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestBlock;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _type:I
         8: aload_0
         9: getfield      #13                 // Field _type:I
        12: ifeq          23
        15: aload_0
        16: getfield      #13                 // Field _type:I
        19: iconst_1
        20: if_icmpne     31
        23: aload_0
        24: aload_0
        25: invokevirtual #17                 // Method readS:()Ljava/lang/String;
        28: putfield      #21                 // Field _targetName:Ljava/lang/String;
        31: return
      LineNumberTable:
        line 39: 0
        line 41: 8
        line 42: 23
        line 43: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/network/clientpackets/RequestBlock;
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 7 /* same */

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #25                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #29                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #31                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_0
        17: getfield      #13                 // Field _type:I
        20: tableswitch   { // 0 to 4

                       0: 56

                       1: 56

                       2: 134

                       3: 144

                       4: 159
                 default: 174
            }
        56: invokestatic  #35                 // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
        59: aload_0
        60: getfield      #21                 // Field _targetName:Ljava/lang/String;
        63: invokevirtual #41                 // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
        66: istore_2
        67: iload_2
        68: ifle          79
        71: aload_1
        72: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        75: iload_2
        76: if_icmpne     87
        79: aload_1
        80: getstatic     #50                 // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_REGISTER_TO_IGNORE_LIST:Lext/mods/gameserver/network/SystemMessageId;
        83: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        86: return
        87: invokestatic  #35                 // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
        90: iload_2
        91: invokevirtual #60                 // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerAccessLevel:(I)I
        94: ifle          105
        97: aload_1
        98: getstatic     #64                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_MAY_NOT_IMPOSE_A_BLOCK_ON_GM:Lext/mods/gameserver/network/SystemMessageId;
       101: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       104: return
       105: aload_0
       106: getfield      #13                 // Field _type:I
       109: ifne          123
       112: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
       115: aload_1
       116: iload_2
       117: invokevirtual #72                 // Method ext/mods/gameserver/data/manager/RelationManager.addToBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
       120: goto          196
       123: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
       126: aload_1
       127: iload_2
       128: invokevirtual #76                 // Method ext/mods/gameserver/data/manager/RelationManager.removeFromBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
       131: goto          196
       134: invokestatic  #67                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
       137: aload_1
       138: invokevirtual #79                 // Method ext/mods/gameserver/data/manager/RelationManager.sendBlockList:(Lext/mods/gameserver/model/actor/Player;)V
       141: goto          196
       144: aload_1
       145: getstatic     #83                 // Field ext/mods/gameserver/network/SystemMessageId.BLOCKING_ALL:Lext/mods/gameserver/network/SystemMessageId;
       148: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       151: aload_1
       152: iconst_1
       153: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.setInBlockingAll:(Z)V
       156: goto          196
       159: aload_1
       160: getstatic     #90                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_BLOCKING_ALL:Lext/mods/gameserver/network/SystemMessageId;
       163: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       166: aload_1
       167: iconst_0
       168: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.setInBlockingAll:(Z)V
       171: goto          196
       174: getstatic     #93                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       177: ldc           #97                 // String Unknown block type detected: {}.
       179: iconst_1
       180: anewarray     #99                 // class java/lang/Object
       183: dup
       184: iconst_0
       185: aload_0
       186: getfield      #13                 // Field _type:I
       189: invokestatic  #101                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       192: aastore
       193: invokevirtual #107                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       196: return
      LineNumberTable:
        line 48: 0
        line 49: 11
        line 50: 15
        line 52: 16
        line 55: 56
        line 56: 67
        line 58: 79
        line 59: 86
        line 62: 87
        line 64: 97
        line 65: 104
        line 68: 105
        line 69: 112
        line 71: 123
        line 72: 131
        line 75: 134
        line 76: 141
        line 79: 144
        line 80: 151
        line 81: 156
        line 84: 159
        line 85: 166
        line 86: 171
        line 89: 174
        line 91: 196
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           67      67     2 targetId   I
            0     197     0  this   Lext/mods/gameserver/network/clientpackets/RequestBlock;
           11     186     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 39 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 7 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 9 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 21 /* same */
}
SourceFile: "RequestBlock.java"
