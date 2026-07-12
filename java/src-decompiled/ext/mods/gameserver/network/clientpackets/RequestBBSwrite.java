// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestBBSwrite
// File: ext\mods\gameserver\network\clientpackets\RequestBBSwrite.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestBBSwrite.class
  Last modified 9 de jul de 2026; size 1287 bytes
  MD5 checksum 998fe640f8b325d4cc6e15e472aee364
  Compiled from "RequestBBSwrite.java"
public class ext.mods.gameserver.network.clientpackets.RequestBBSwrite extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestBBSwrite
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 6, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/RequestBBSwrite.readS:()Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/RequestBBSwrite
   #9 = NameAndType        #11:#12        // readS:()Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBBSwrite
  #11 = Utf8               readS
  #12 = Utf8               ()Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/RequestBBSwrite._url:Ljava/lang/String;
  #14 = NameAndType        #15:#16        // _url:Ljava/lang/String;
  #15 = Utf8               _url
  #16 = Utf8               Ljava/lang/String;
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/network/clientpackets/RequestBBSwrite._arg1:Ljava/lang/String;
  #18 = NameAndType        #19:#16        // _arg1:Ljava/lang/String;
  #19 = Utf8               _arg1
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/network/clientpackets/RequestBBSwrite._arg2:Ljava/lang/String;
  #21 = NameAndType        #22:#16        // _arg2:Ljava/lang/String;
  #22 = Utf8               _arg2
  #23 = Fieldref           #8.#24         // ext/mods/gameserver/network/clientpackets/RequestBBSwrite._arg3:Ljava/lang/String;
  #24 = NameAndType        #25:#16        // _arg3:Ljava/lang/String;
  #25 = Utf8               _arg3
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/network/clientpackets/RequestBBSwrite._arg4:Ljava/lang/String;
  #27 = NameAndType        #28:#16        // _arg4:Ljava/lang/String;
  #28 = Utf8               _arg4
  #29 = Fieldref           #8.#30         // ext/mods/gameserver/network/clientpackets/RequestBBSwrite._arg5:Ljava/lang/String;
  #30 = NameAndType        #31:#16        // _arg5:Ljava/lang/String;
  #31 = Utf8               _arg5
  #32 = Methodref          #33.#34        // ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
  #33 = Class              #35            // ext/mods/gameserver/communitybbs/CommunityBoard
  #34 = NameAndType        #36:#37        // getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
  #35 = Utf8               ext/mods/gameserver/communitybbs/CommunityBoard
  #36 = Utf8               getInstance
  #37 = Utf8               ()Lext/mods/gameserver/communitybbs/CommunityBoard;
  #38 = Methodref          #8.#39         // ext/mods/gameserver/network/clientpackets/RequestBBSwrite.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #39 = NameAndType        #40:#41        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #40 = Utf8               getClient
  #41 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #42 = Class              #43            // ext/mods/gameserver/network/GameClient
  #43 = Utf8               ext/mods/gameserver/network/GameClient
  #44 = Methodref          #33.#45        // ext/mods/gameserver/communitybbs/CommunityBoard.handleWriteCommands:(Lext/mods/gameserver/network/GameClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #45 = NameAndType        #46:#47        // handleWriteCommands:(Lext/mods/gameserver/network/GameClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #46 = Utf8               handleWriteCommands
  #47 = Utf8               (Lext/mods/gameserver/network/GameClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               this
  #52 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestBBSwrite;
  #53 = Utf8               readImpl
  #54 = Utf8               runImpl
  #55 = Utf8               SourceFile
  #56 = Utf8               RequestBBSwrite.java
{
  public ext.mods.gameserver.network.clientpackets.RequestBBSwrite();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestBBSwrite;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readS:()Ljava/lang/String;
         5: putfield      #13                 // Field _url:Ljava/lang/String;
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readS:()Ljava/lang/String;
        13: putfield      #17                 // Field _arg1:Ljava/lang/String;
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readS:()Ljava/lang/String;
        21: putfield      #20                 // Field _arg2:Ljava/lang/String;
        24: aload_0
        25: aload_0
        26: invokevirtual #7                  // Method readS:()Ljava/lang/String;
        29: putfield      #23                 // Field _arg3:Ljava/lang/String;
        32: aload_0
        33: aload_0
        34: invokevirtual #7                  // Method readS:()Ljava/lang/String;
        37: putfield      #26                 // Field _arg4:Ljava/lang/String;
        40: aload_0
        41: aload_0
        42: invokevirtual #7                  // Method readS:()Ljava/lang/String;
        45: putfield      #29                 // Field _arg5:Ljava/lang/String;
        48: return
      LineNumberTable:
        line 34: 0
        line 35: 8
        line 36: 16
        line 37: 24
        line 38: 32
        line 39: 40
        line 40: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/network/clientpackets/RequestBBSwrite;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=8, locals=1, args_size=1
         0: invokestatic  #32                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
         3: aload_0
         4: invokevirtual #38                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         7: checkcast     #42                 // class ext/mods/gameserver/network/GameClient
        10: aload_0
        11: getfield      #13                 // Field _url:Ljava/lang/String;
        14: aload_0
        15: getfield      #17                 // Field _arg1:Ljava/lang/String;
        18: aload_0
        19: getfield      #20                 // Field _arg2:Ljava/lang/String;
        22: aload_0
        23: getfield      #23                 // Field _arg3:Ljava/lang/String;
        26: aload_0
        27: getfield      #26                 // Field _arg4:Ljava/lang/String;
        30: aload_0
        31: getfield      #29                 // Field _arg5:Ljava/lang/String;
        34: invokevirtual #44                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.handleWriteCommands:(Lext/mods/gameserver/network/GameClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        37: return
      LineNumberTable:
        line 45: 0
        line 46: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/network/clientpackets/RequestBBSwrite;
}
SourceFile: "RequestBBSwrite.java"
