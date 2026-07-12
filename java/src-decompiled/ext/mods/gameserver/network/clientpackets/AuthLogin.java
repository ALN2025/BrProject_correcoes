// Bytecode for: ext.mods.gameserver.network.clientpackets.AuthLogin
// File: ext\mods\gameserver\network\clientpackets\AuthLogin.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/AuthLogin.class
  Last modified 9 de jul de 2026; size 1480 bytes
  MD5 checksum a3b63d80b9bb1578b82393b518ace2d0
  Compiled from "AuthLogin.java"
public final class ext.mods.gameserver.network.clientpackets.AuthLogin extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/AuthLogin
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 6, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/network/clientpackets/AuthLogin._data:[B
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/AuthLogin
   #9 = NameAndType        #11:#12        // _data:[B
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/AuthLogin
  #11 = Utf8               _data
  #12 = Utf8               [B
  #13 = Methodref          #8.#14         // ext/mods/gameserver/network/clientpackets/AuthLogin.readS:()Ljava/lang/String;
  #14 = NameAndType        #15:#16        // readS:()Ljava/lang/String;
  #15 = Utf8               readS
  #16 = Utf8               ()Ljava/lang/String;
  #17 = Methodref          #18.#19        // java/lang/String.toLowerCase:()Ljava/lang/String;
  #18 = Class              #20            // java/lang/String
  #19 = NameAndType        #21:#16        // toLowerCase:()Ljava/lang/String;
  #20 = Utf8               java/lang/String
  #21 = Utf8               toLowerCase
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/network/clientpackets/AuthLogin._loginName:Ljava/lang/String;
  #23 = NameAndType        #24:#25        // _loginName:Ljava/lang/String;
  #24 = Utf8               _loginName
  #25 = Utf8               Ljava/lang/String;
  #26 = Methodref          #8.#27         // ext/mods/gameserver/network/clientpackets/AuthLogin.readD:()I
  #27 = NameAndType        #28:#29        // readD:()I
  #28 = Utf8               readD
  #29 = Utf8               ()I
  #30 = Fieldref           #8.#31         // ext/mods/gameserver/network/clientpackets/AuthLogin._playKey2:I
  #31 = NameAndType        #32:#33        // _playKey2:I
  #32 = Utf8               _playKey2
  #33 = Utf8               I
  #34 = Fieldref           #8.#35         // ext/mods/gameserver/network/clientpackets/AuthLogin._playKey1:I
  #35 = NameAndType        #36:#33        // _playKey1:I
  #36 = Utf8               _playKey1
  #37 = Fieldref           #8.#38         // ext/mods/gameserver/network/clientpackets/AuthLogin._loginKey1:I
  #38 = NameAndType        #39:#33        // _loginKey1:I
  #39 = Utf8               _loginKey1
  #40 = Fieldref           #8.#41         // ext/mods/gameserver/network/clientpackets/AuthLogin._loginKey2:I
  #41 = NameAndType        #42:#33        // _loginKey2:I
  #42 = Utf8               _loginKey2
  #43 = Methodref          #44.#45        // ext/mods/protection/hwid/hwid.isProtectionOn:()Z
  #44 = Class              #46            // ext/mods/protection/hwid/hwid
  #45 = NameAndType        #47:#48        // isProtectionOn:()Z
  #46 = Utf8               ext/mods/protection/hwid/hwid
  #47 = Utf8               isProtectionOn
  #48 = Utf8               ()Z
  #49 = Methodref          #8.#50         // ext/mods/gameserver/network/clientpackets/AuthLogin.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #50 = NameAndType        #51:#52        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #51 = Utf8               getClient
  #52 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #53 = Class              #54            // ext/mods/gameserver/network/GameClient
  #54 = Utf8               ext/mods/gameserver/network/GameClient
  #55 = Methodref          #44.#56        // ext/mods/protection/hwid/hwid.doAuthLogin:(Lext/mods/gameserver/network/GameClient;[BLjava/lang/String;)Z
  #56 = NameAndType        #57:#58        // doAuthLogin:(Lext/mods/gameserver/network/GameClient;[BLjava/lang/String;)Z
  #57 = Utf8               doAuthLogin
  #58 = Utf8               (Lext/mods/gameserver/network/GameClient;[BLjava/lang/String;)Z
  #59 = Methodref          #60.#61        // ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
  #60 = Class              #62            // ext/mods/gameserver/LoginServerThread
  #61 = NameAndType        #63:#64        // getInstance:()Lext/mods/gameserver/LoginServerThread;
  #62 = Utf8               ext/mods/gameserver/LoginServerThread
  #63 = Utf8               getInstance
  #64 = Utf8               ()Lext/mods/gameserver/LoginServerThread;
  #65 = Methodref          #60.#66        // ext/mods/gameserver/LoginServerThread.addClient:(Ljava/lang/String;IIIILext/mods/gameserver/network/GameClient;)V
  #66 = NameAndType        #67:#68        // addClient:(Ljava/lang/String;IIIILext/mods/gameserver/network/GameClient;)V
  #67 = Utf8               addClient
  #68 = Utf8               (Ljava/lang/String;IIIILext/mods/gameserver/network/GameClient;)V
  #69 = Utf8               Code
  #70 = Utf8               LineNumberTable
  #71 = Utf8               LocalVariableTable
  #72 = Utf8               this
  #73 = Utf8               Lext/mods/gameserver/network/clientpackets/AuthLogin;
  #74 = Utf8               readImpl
  #75 = Utf8               StackMapTable
  #76 = Utf8               runImpl
  #77 = Utf8               SourceFile
  #78 = Utf8               AuthLogin.java
{
  public ext.mods.gameserver.network.clientpackets.AuthLogin();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: aload_0
         5: bipush        48
         7: newarray       byte
         9: putfield      #7                  // Field _data:[B
        12: return
      LineNumberTable:
        line 23: 0
        line 30: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/network/clientpackets/AuthLogin;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #13                 // Method readS:()Ljava/lang/String;
         5: invokevirtual #17                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
         8: putfield      #22                 // Field _loginName:Ljava/lang/String;
        11: aload_0
        12: aload_0
        13: invokevirtual #26                 // Method readD:()I
        16: putfield      #30                 // Field _playKey2:I
        19: aload_0
        20: aload_0
        21: invokevirtual #26                 // Method readD:()I
        24: putfield      #34                 // Field _playKey1:I
        27: aload_0
        28: aload_0
        29: invokevirtual #26                 // Method readD:()I
        32: putfield      #37                 // Field _loginKey1:I
        35: aload_0
        36: aload_0
        37: invokevirtual #26                 // Method readD:()I
        40: putfield      #40                 // Field _loginKey2:I
        43: invokestatic  #43                 // Method ext/mods/protection/hwid/hwid.isProtectionOn:()Z
        46: ifeq          71
        49: aload_0
        50: invokevirtual #49                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        53: checkcast     #53                 // class ext/mods/gameserver/network/GameClient
        56: aload_0
        57: getfield      #7                  // Field _data:[B
        60: aload_0
        61: getfield      #22                 // Field _loginName:Ljava/lang/String;
        64: invokestatic  #55                 // Method ext/mods/protection/hwid/hwid.doAuthLogin:(Lext/mods/gameserver/network/GameClient;[BLjava/lang/String;)Z
        67: ifne          71
        70: return
        71: return
      LineNumberTable:
        line 35: 0
        line 36: 11
        line 37: 19
        line 38: 27
        line 39: 35
        line 41: 43
        line 43: 49
        line 44: 70
        line 47: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/network/clientpackets/AuthLogin;
      StackMapTable: number_of_entries = 1
        frame_type = 251 /* same_frame_extended */
          offset_delta = 71

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=1, args_size=1
         0: invokestatic  #59                 // Method ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
         3: aload_0
         4: getfield      #22                 // Field _loginName:Ljava/lang/String;
         7: aload_0
         8: getfield      #37                 // Field _loginKey1:I
        11: aload_0
        12: getfield      #40                 // Field _loginKey2:I
        15: aload_0
        16: getfield      #34                 // Field _playKey1:I
        19: aload_0
        20: getfield      #30                 // Field _playKey2:I
        23: aload_0
        24: invokevirtual #49                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        27: checkcast     #53                 // class ext/mods/gameserver/network/GameClient
        30: invokevirtual #65                 // Method ext/mods/gameserver/LoginServerThread.addClient:(Ljava/lang/String;IIIILext/mods/gameserver/network/GameClient;)V
        33: return
      LineNumberTable:
        line 52: 0
        line 53: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/network/clientpackets/AuthLogin;
}
SourceFile: "AuthLogin.java"
