// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.OlympiadStat
// File: ext\mods\gameserver\handler\usercommandhandlers\OlympiadStat.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/OlympiadStat.class
  Last modified 9 de jul de 2026; size 2278 bytes
  MD5 checksum 63f78f729e6f05df4f70225d4a46e104
  Compiled from "OlympiadStat.java"
public class ext.mods.gameserver.handler.usercommandhandlers.OlympiadStat implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #68                         // ext/mods/gameserver/handler/usercommandhandlers/OlympiadStat
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/Player.isNoble:()Z
   #8 = Class              #10            // ext/mods/gameserver/model/actor/Player
   #9 = NameAndType        #11:#12        // isNoble:()Z
  #10 = Utf8               ext/mods/gameserver/model/actor/Player
  #11 = Utf8               isNoble
  #12 = Utf8               ()Z
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/network/SystemMessageId.NOBLESSE_ONLY:Lext/mods/gameserver/network/SystemMessageId;
  #14 = Class              #16            // ext/mods/gameserver/network/SystemMessageId
  #15 = NameAndType        #17:#18        // NOBLESSE_ONLY:Lext/mods/gameserver/network/SystemMessageId;
  #16 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #17 = Utf8               NOBLESSE_ONLY
  #18 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #19 = Methodref          #8.#20         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #20 = NameAndType        #21:#22        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #21 = Utf8               sendPacket
  #22 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #23 = Fieldref           #14.#24        // ext/mods/gameserver/network/SystemMessageId.THE_CURRENT_RECORD_FOR_THIS_OLYMPIAD_SESSION_IS_S1_MATCHES_S2_WINS_S3_DEFEATS_YOU_HAVE_EARNED_S4_OLYMPIAD_POINTS:Lext/mods/gameserver/network/SystemMessageId;
  #24 = NameAndType        #25:#18        // THE_CURRENT_RECORD_FOR_THIS_OLYMPIAD_SESSION_IS_S1_MATCHES_S2_WINS_S3_DEFEATS_YOU_HAVE_EARNED_S4_OLYMPIAD_POINTS:Lext/mods/gameserver/network/SystemMessageId;
  #25 = Utf8               THE_CURRENT_RECORD_FOR_THIS_OLYMPIAD_SESSION_IS_S1_MATCHES_S2_WINS_S3_DEFEATS_YOU_HAVE_EARNED_S4_OLYMPIAD_POINTS
  #26 = Methodref          #27.#28        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #27 = Class              #29            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #28 = NameAndType        #30:#31        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #29 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #30 = Utf8               getSystemMessage
  #31 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #32 = Methodref          #33.#34        // ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
  #33 = Class              #35            // ext/mods/gameserver/model/olympiad/Olympiad
  #34 = NameAndType        #36:#37        // getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
  #35 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
  #36 = Utf8               getInstance
  #37 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
  #38 = Methodref          #8.#39         // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #39 = NameAndType        #40:#41        // getObjectId:()I
  #40 = Utf8               getObjectId
  #41 = Utf8               ()I
  #42 = Methodref          #33.#43        // ext/mods/gameserver/model/olympiad/Olympiad.getNobleStats:(I)Lext/mods/commons/data/StatSet;
  #43 = NameAndType        #44:#45        // getNobleStats:(I)Lext/mods/commons/data/StatSet;
  #44 = Utf8               getNobleStats
  #45 = Utf8               (I)Lext/mods/commons/data/StatSet;
  #46 = Methodref          #27.#47        // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #47 = NameAndType        #48:#49        // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #48 = Utf8               addNumber
  #49 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #50 = String             #51            // competitions_done
  #51 = Utf8               competitions_done
  #52 = Methodref          #53.#54        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #53 = Class              #55            // ext/mods/commons/data/StatSet
  #54 = NameAndType        #56:#57        // getInteger:(Ljava/lang/String;)I
  #55 = Utf8               ext/mods/commons/data/StatSet
  #56 = Utf8               getInteger
  #57 = Utf8               (Ljava/lang/String;)I
  #58 = String             #59            // competitions_won
  #59 = Utf8               competitions_won
  #60 = String             #61            // competitions_lost
  #61 = Utf8               competitions_lost
  #62 = String             #63            // olympiad_points
  #63 = Utf8               olympiad_points
  #64 = Methodref          #8.#65         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #65 = NameAndType        #21:#66        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #66 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #67 = Fieldref           #68.#69        // ext/mods/gameserver/handler/usercommandhandlers/OlympiadStat.COMMAND_IDS:[I
  #68 = Class              #70            // ext/mods/gameserver/handler/usercommandhandlers/OlympiadStat
  #69 = NameAndType        #71:#72        // COMMAND_IDS:[I
  #70 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/OlympiadStat
  #71 = Utf8               COMMAND_IDS
  #72 = Utf8               [I
  #73 = Class              #74            // ext/mods/gameserver/handler/IUserCommandHandler
  #74 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #75 = Utf8               Code
  #76 = Utf8               LineNumberTable
  #77 = Utf8               LocalVariableTable
  #78 = Utf8               this
  #79 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/OlympiadStat;
  #80 = Utf8               useUserCommand
  #81 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #82 = Utf8               id
  #83 = Utf8               I
  #84 = Utf8               player
  #85 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #86 = Utf8               sm
  #87 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #88 = Utf8               set
  #89 = Utf8               Lext/mods/commons/data/StatSet;
  #90 = Utf8               StackMapTable
  #91 = Utf8               getUserCommandList
  #92 = Utf8               ()[I
  #93 = Utf8               <clinit>
  #94 = Utf8               SourceFile
  #95 = Utf8               OlympiadStat.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.OlympiadStat();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/OlympiadStat;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
         4: ifne          15
         7: aload_2
         8: getstatic     #13                 // Field ext/mods/gameserver/network/SystemMessageId.NOBLESSE_ONLY:Lext/mods/gameserver/network/SystemMessageId;
        11: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        14: return
        15: getstatic     #23                 // Field ext/mods/gameserver/network/SystemMessageId.THE_CURRENT_RECORD_FOR_THIS_OLYMPIAD_SESSION_IS_S1_MATCHES_S2_WINS_S3_DEFEATS_YOU_HAVE_EARNED_S4_OLYMPIAD_POINTS:Lext/mods/gameserver/network/SystemMessageId;
        18: invokestatic  #26                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        21: astore_3
        22: invokestatic  #32                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
        25: aload_2
        26: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        29: invokevirtual #42                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getNobleStats:(I)Lext/mods/commons/data/StatSet;
        32: astore        4
        34: aload         4
        36: ifnonnull     66
        39: aload_3
        40: iconst_0
        41: invokevirtual #46                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        44: pop
        45: aload_3
        46: iconst_0
        47: invokevirtual #46                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        50: pop
        51: aload_3
        52: iconst_0
        53: invokevirtual #46                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        56: pop
        57: aload_3
        58: iconst_0
        59: invokevirtual #46                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        62: pop
        63: goto          114
        66: aload_3
        67: aload         4
        69: ldc           #50                 // String competitions_done
        71: invokevirtual #52                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        74: invokevirtual #46                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        77: pop
        78: aload_3
        79: aload         4
        81: ldc           #58                 // String competitions_won
        83: invokevirtual #52                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        86: invokevirtual #46                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        89: pop
        90: aload_3
        91: aload         4
        93: ldc           #60                 // String competitions_lost
        95: invokevirtual #52                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        98: invokevirtual #46                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       101: pop
       102: aload_3
       103: aload         4
       105: ldc           #62                 // String olympiad_points
       107: invokevirtual #52                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       110: invokevirtual #46                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       113: pop
       114: aload_2
       115: aload_3
       116: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       119: return
      LineNumberTable:
        line 38: 0
        line 40: 7
        line 41: 14
        line 44: 15
        line 46: 22
        line 47: 34
        line 49: 39
        line 50: 45
        line 51: 51
        line 52: 57
        line 56: 66
        line 57: 78
        line 58: 90
        line 59: 102
        line 61: 114
        line 62: 119
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     120     0  this   Lext/mods/gameserver/handler/usercommandhandlers/OlympiadStat;
            0     120     1    id   I
            0     120     2 player   Lext/mods/gameserver/model/actor/Player;
           22      98     3    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
           34      86     4   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 3
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage, class ext/mods/commons/data/StatSet ]
        frame_type = 47 /* same */

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #67                 // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/OlympiadStat;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        109
         7: iastore
         8: putstatic     #67                 // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "OlympiadStat.java"
