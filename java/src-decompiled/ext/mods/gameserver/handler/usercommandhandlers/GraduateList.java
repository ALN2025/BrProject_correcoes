// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.GraduateList
// File: ext\mods\gameserver\handler\usercommandhandlers\GraduateList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/GraduateList.class
  Last modified 9 de jul de 2026; size 2442 bytes
  MD5 checksum 18c86dea35a31b170ad16baf21b54aa6
  Compiled from "GraduateList.java"
public class ext.mods.gameserver.handler.usercommandhandlers.GraduateList implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #81                         // ext/mods/gameserver/handler/usercommandhandlers/GraduateList
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getClan
   #12 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/pledge/Clan.getGraduates:()Ljava/util/Set;
   #14 = Class              #16           // ext/mods/gameserver/model/pledge/Clan
   #15 = NameAndType        #17:#18       // getGraduates:()Ljava/util/Set;
   #16 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #17 = Utf8               getGraduates
   #18 = Utf8               ()Ljava/util/Set;
   #19 = InterfaceMethodref #20.#21       // java/util/Set.isEmpty:()Z
   #20 = Class              #22           // java/util/Set
   #21 = NameAndType        #23:#24       // isEmpty:()Z
   #22 = Utf8               java/util/Set
   #23 = Utf8               isEmpty
   #24 = Utf8               ()Z
   #25 = Fieldref           #26.#27       // ext/mods/gameserver/network/SystemMessageId.ACADEMY_LIST_HEADER:Lext/mods/gameserver/network/SystemMessageId;
   #26 = Class              #28           // ext/mods/gameserver/network/SystemMessageId
   #27 = NameAndType        #29:#30       // ACADEMY_LIST_HEADER:Lext/mods/gameserver/network/SystemMessageId;
   #28 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #29 = Utf8               ACADEMY_LIST_HEADER
   #30 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #31 = Methodref          #8.#32        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #32 = NameAndType        #33:#34       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #33 = Utf8               sendPacket
   #34 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #35 = InterfaceMethodref #20.#36       // java/util/Set.iterator:()Ljava/util/Iterator;
   #36 = NameAndType        #37:#38       // iterator:()Ljava/util/Iterator;
   #37 = Utf8               iterator
   #38 = Utf8               ()Ljava/util/Iterator;
   #39 = InterfaceMethodref #40.#41       // java/util/Iterator.hasNext:()Z
   #40 = Class              #42           // java/util/Iterator
   #41 = NameAndType        #43:#24       // hasNext:()Z
   #42 = Utf8               java/util/Iterator
   #43 = Utf8               hasNext
   #44 = InterfaceMethodref #40.#45       // java/util/Iterator.next:()Ljava/lang/Object;
   #45 = NameAndType        #46:#47       // next:()Ljava/lang/Object;
   #46 = Utf8               next
   #47 = Utf8               ()Ljava/lang/Object;
   #48 = Class              #49           // java/lang/Integer
   #49 = Utf8               java/lang/Integer
   #50 = Methodref          #48.#51       // java/lang/Integer.intValue:()I
   #51 = NameAndType        #52:#53       // intValue:()I
   #52 = Utf8               intValue
   #53 = Utf8               ()I
   #54 = Methodref          #55.#56       // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #55 = Class              #57           // ext/mods/gameserver/data/sql/PlayerInfoTable
   #56 = NameAndType        #58:#59       // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #57 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
   #58 = Utf8               getInstance
   #59 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #60 = Methodref          #55.#61       // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
   #61 = NameAndType        #62:#63       // getPlayerName:(I)Ljava/lang/String;
   #62 = Utf8               getPlayerName
   #63 = Utf8               (I)Ljava/lang/String;
   #64 = Fieldref           #26.#65       // ext/mods/gameserver/network/SystemMessageId.GRADUATES_S1:Lext/mods/gameserver/network/SystemMessageId;
   #65 = NameAndType        #66:#30       // GRADUATES_S1:Lext/mods/gameserver/network/SystemMessageId;
   #66 = Utf8               GRADUATES_S1
   #67 = Methodref          #68.#69       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #68 = Class              #70           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #69 = NameAndType        #71:#72       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #70 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #71 = Utf8               getSystemMessage
   #72 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #73 = Methodref          #68.#74       // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #74 = NameAndType        #75:#76       // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #75 = Utf8               addString
   #76 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #77 = Methodref          #8.#78        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #78 = NameAndType        #33:#79       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #79 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #80 = Fieldref           #81.#82       // ext/mods/gameserver/handler/usercommandhandlers/GraduateList.COMMAND_IDS:[I
   #81 = Class              #83           // ext/mods/gameserver/handler/usercommandhandlers/GraduateList
   #82 = NameAndType        #84:#85       // COMMAND_IDS:[I
   #83 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/GraduateList
   #84 = Utf8               COMMAND_IDS
   #85 = Utf8               [I
   #86 = Class              #87           // ext/mods/gameserver/handler/IUserCommandHandler
   #87 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
   #88 = Utf8               Code
   #89 = Utf8               LineNumberTable
   #90 = Utf8               LocalVariableTable
   #91 = Utf8               this
   #92 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/GraduateList;
   #93 = Utf8               useUserCommand
   #94 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
   #95 = Utf8               playerName
   #96 = Utf8               Ljava/lang/String;
   #97 = Utf8               objectId
   #98 = Utf8               I
   #99 = Utf8               id
  #100 = Utf8               player
  #101 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #102 = Utf8               clan
  #103 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #104 = Utf8               graduates
  #105 = Utf8               Ljava/util/Set;
  #106 = Utf8               LocalVariableTypeTable
  #107 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #108 = Utf8               StackMapTable
  #109 = Utf8               getUserCommandList
  #110 = Utf8               ()[I
  #111 = Utf8               <clinit>
  #112 = Utf8               SourceFile
  #113 = Utf8               GraduateList.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.GraduateList();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/GraduateList;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore_3
         5: aload_3
         6: ifnonnull     10
         9: return
        10: aload_3
        11: invokevirtual #13                 // Method ext/mods/gameserver/model/pledge/Clan.getGraduates:()Ljava/util/Set;
        14: astore        4
        16: aload         4
        18: invokeinterface #19,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
        23: ifeq          27
        26: return
        27: aload_2
        28: getstatic     #25                 // Field ext/mods/gameserver/network/SystemMessageId.ACADEMY_LIST_HEADER:Lext/mods/gameserver/network/SystemMessageId;
        31: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        34: aload         4
        36: invokeinterface #35,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        41: astore        5
        43: aload         5
        45: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        50: ifeq          101
        53: aload         5
        55: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        60: checkcast     #48                 // class java/lang/Integer
        63: invokevirtual #50                 // Method java/lang/Integer.intValue:()I
        66: istore        6
        68: invokestatic  #54                 // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
        71: iload         6
        73: invokevirtual #60                 // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
        76: astore        7
        78: aload         7
        80: ifnull        98
        83: aload_2
        84: getstatic     #64                 // Field ext/mods/gameserver/network/SystemMessageId.GRADUATES_S1:Lext/mods/gameserver/network/SystemMessageId;
        87: invokestatic  #67                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        90: aload         7
        92: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        95: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        98: goto          43
       101: return
      LineNumberTable:
        line 39: 0
        line 40: 5
        line 41: 9
        line 43: 10
        line 44: 16
        line 45: 26
        line 47: 27
        line 49: 34
        line 51: 68
        line 52: 78
        line 53: 83
        line 54: 98
        line 55: 101
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           78      20     7 playerName   Ljava/lang/String;
           68      30     6 objectId   I
            0     102     0  this   Lext/mods/gameserver/handler/usercommandhandlers/GraduateList;
            0     102     1    id   I
            0     102     2 player   Lext/mods/gameserver/model/actor/Player;
            5      97     3  clan   Lext/mods/gameserver/model/pledge/Clan;
           16      86     4 graduates   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           16      86     4 graduates   Ljava/util/Set<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/util/Set ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 54 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #80                 // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/GraduateList;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        110
         7: iastore
         8: putstatic     #80                 // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "GraduateList.java"
