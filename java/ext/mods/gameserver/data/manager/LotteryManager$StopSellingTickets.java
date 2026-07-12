// Bytecode for: ext.mods.gameserver.data.manager.LotteryManager$StopSellingTickets
// File: ext\mods\gameserver\data\manager\LotteryManager$StopSellingTickets.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets.class
  Last modified 9 de jul de 2026; size 1390 bytes
  MD5 checksum 67c322a7f60c7c09c6d1753f1e03eb71
  Compiled from "LotteryManager.java"
class ext.mods.gameserver.data.manager.LotteryManager$StopSellingTickets implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets.this$0:Lext/mods/gameserver/data/manager/LotteryManager;
   #8 = Class              #10            // ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/gameserver/data/manager/LotteryManager;
  #10 = Utf8               ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/gameserver/data/manager/LotteryManager;
  #13 = Methodref          #14.#15        // java/lang/Object."<init>":()V
  #14 = Class              #16            // java/lang/Object
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/lang/Object
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/data/manager/LotteryManager._isSellingTickets:Z
  #20 = Class              #22            // ext/mods/gameserver/data/manager/LotteryManager
  #21 = NameAndType        #23:#24        // _isSellingTickets:Z
  #22 = Utf8               ext/mods/gameserver/data/manager/LotteryManager
  #23 = Utf8               _isSellingTickets
  #24 = Utf8               Z
  #25 = Fieldref           #26.#27        // ext/mods/gameserver/network/SystemMessageId.LOTTERY_TICKET_SALES_TEMP_SUSPENDED:Lext/mods/gameserver/network/SystemMessageId;
  #26 = Class              #28            // ext/mods/gameserver/network/SystemMessageId
  #27 = NameAndType        #29:#30        // LOTTERY_TICKET_SALES_TEMP_SUSPENDED:Lext/mods/gameserver/network/SystemMessageId;
  #28 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #29 = Utf8               LOTTERY_TICKET_SALES_TEMP_SUSPENDED
  #30 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #31 = Methodref          #32.#33        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #32 = Class              #34            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #33 = NameAndType        #35:#36        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #34 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #35 = Utf8               getSystemMessage
  #36 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #37 = Methodref          #38.#39        // ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #38 = Class              #40            // ext/mods/gameserver/model/World
  #39 = NameAndType        #41:#42        // toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #40 = Utf8               ext/mods/gameserver/model/World
  #41 = Utf8               toAllOnlinePlayers
  #42 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #43 = Class              #44            // java/lang/Runnable
  #44 = Utf8               java/lang/Runnable
  #45 = Utf8               (Lext/mods/gameserver/data/manager/LotteryManager;)V
  #46 = Utf8               Code
  #47 = Utf8               LineNumberTable
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               this
  #50 = Utf8               Lext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets;
  #51 = Utf8               MethodParameters
  #52 = Utf8               run
  #53 = Utf8               SourceFile
  #54 = Utf8               LotteryManager.java
  #55 = Utf8               NestHost
  #56 = Utf8               InnerClasses
  #57 = Utf8               StopSellingTickets
{
  final ext.mods.gameserver.data.manager.LotteryManager this$0;
    descriptor: Lext/mods/gameserver/data/manager/LotteryManager;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  protected ext.mods.gameserver.data.manager.LotteryManager$StopSellingTickets(ext.mods.gameserver.data.manager.LotteryManager);
    descriptor: (Lext/mods/gameserver/data/manager/LotteryManager;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: return
      LineNumberTable:
        line 324: 0
        line 325: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets;
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
         4: iconst_0
         5: putfield      #19                 // Field ext/mods/gameserver/data/manager/LotteryManager._isSellingTickets:Z
         8: getstatic     #25                 // Field ext/mods/gameserver/network/SystemMessageId.LOTTERY_TICKET_SALES_TEMP_SUSPENDED:Lext/mods/gameserver/network/SystemMessageId;
        11: invokestatic  #31                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        14: invokestatic  #37                 // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        17: return
      LineNumberTable:
        line 330: 0
        line 332: 8
        line 333: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets;
}
SourceFile: "LotteryManager.java"
NestHost: class ext/mods/gameserver/data/manager/LotteryManager
