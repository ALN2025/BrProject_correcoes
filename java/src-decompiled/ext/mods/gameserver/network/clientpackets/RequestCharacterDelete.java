// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestCharacterDelete
// File: ext\mods\gameserver\network\clientpackets\RequestCharacterDelete.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestCharacterDelete.class
  Last modified 9 de jul de 2026; size 2201 bytes
  MD5 checksum 895d31446df2c1c97875b7259a9d6d90
  Compiled from "RequestCharacterDelete.java"
public final class ext.mods.gameserver.network.clientpackets.RequestCharacterDelete extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestCharacterDelete
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/RequestCharacterDelete.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/RequestCharacterDelete
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestCharacterDelete
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/RequestCharacterDelete._slot:I
  #14 = NameAndType        #15:#16        // _slot:I
  #15 = Utf8               _slot
  #16 = Utf8               I
  #17 = Methodref          #8.#18         // ext/mods/gameserver/network/clientpackets/RequestCharacterDelete.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #18 = NameAndType        #19:#20        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #19 = Utf8               getClient
  #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #21 = Class              #22            // ext/mods/gameserver/network/GameClient
  #22 = Utf8               ext/mods/gameserver/network/GameClient
  #23 = Fieldref           #24.#25        // ext/mods/gameserver/enums/FloodProtector.CHARACTER_SELECT:Lext/mods/gameserver/enums/FloodProtector;
  #24 = Class              #26            // ext/mods/gameserver/enums/FloodProtector
  #25 = NameAndType        #27:#28        // CHARACTER_SELECT:Lext/mods/gameserver/enums/FloodProtector;
  #26 = Utf8               ext/mods/gameserver/enums/FloodProtector
  #27 = Utf8               CHARACTER_SELECT
  #28 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
  #29 = Methodref          #21.#30        // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
  #30 = NameAndType        #31:#32        // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
  #31 = Utf8               performAction
  #32 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
  #33 = Fieldref           #34.#35        // ext/mods/gameserver/network/serverpackets/CharDeleteFail.REASON_DELETION_FAILED:Lext/mods/gameserver/network/serverpackets/CharDeleteFail;
  #34 = Class              #36            // ext/mods/gameserver/network/serverpackets/CharDeleteFail
  #35 = NameAndType        #37:#38        // REASON_DELETION_FAILED:Lext/mods/gameserver/network/serverpackets/CharDeleteFail;
  #36 = Utf8               ext/mods/gameserver/network/serverpackets/CharDeleteFail
  #37 = Utf8               REASON_DELETION_FAILED
  #38 = Utf8               Lext/mods/gameserver/network/serverpackets/CharDeleteFail;
  #39 = Methodref          #8.#40         // ext/mods/gameserver/network/clientpackets/RequestCharacterDelete.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #40 = NameAndType        #41:#42        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #41 = Utf8               sendPacket
  #42 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #43 = Methodref          #21.#44        // ext/mods/gameserver/network/GameClient.markToDeleteChar:(I)B
  #44 = NameAndType        #45:#46        // markToDeleteChar:(I)B
  #45 = Utf8               markToDeleteChar
  #46 = Utf8               (I)B
  #47 = Fieldref           #48.#49        // ext/mods/gameserver/network/serverpackets/CharDeleteOk.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/CharDeleteOk;
  #48 = Class              #50            // ext/mods/gameserver/network/serverpackets/CharDeleteOk
  #49 = NameAndType        #51:#52        // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/CharDeleteOk;
  #50 = Utf8               ext/mods/gameserver/network/serverpackets/CharDeleteOk
  #51 = Utf8               STATIC_PACKET
  #52 = Utf8               Lext/mods/gameserver/network/serverpackets/CharDeleteOk;
  #53 = Fieldref           #34.#54        // ext/mods/gameserver/network/serverpackets/CharDeleteFail.REASON_YOU_MAY_NOT_DELETE_CLAN_MEMBER:Lext/mods/gameserver/network/serverpackets/CharDeleteFail;
  #54 = NameAndType        #55:#38        // REASON_YOU_MAY_NOT_DELETE_CLAN_MEMBER:Lext/mods/gameserver/network/serverpackets/CharDeleteFail;
  #55 = Utf8               REASON_YOU_MAY_NOT_DELETE_CLAN_MEMBER
  #56 = Fieldref           #34.#57        // ext/mods/gameserver/network/serverpackets/CharDeleteFail.REASON_CLAN_LEADERS_MAY_NOT_BE_DELETED:Lext/mods/gameserver/network/serverpackets/CharDeleteFail;
  #57 = NameAndType        #58:#38        // REASON_CLAN_LEADERS_MAY_NOT_BE_DELETED:Lext/mods/gameserver/network/serverpackets/CharDeleteFail;
  #58 = Utf8               REASON_CLAN_LEADERS_MAY_NOT_BE_DELETED
  #59 = Class              #60            // ext/mods/gameserver/network/serverpackets/CharSelectInfo
  #60 = Utf8               ext/mods/gameserver/network/serverpackets/CharSelectInfo
  #61 = Methodref          #21.#62        // ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
  #62 = NameAndType        #63:#64        // getAccountName:()Ljava/lang/String;
  #63 = Utf8               getAccountName
  #64 = Utf8               ()Ljava/lang/String;
  #65 = Methodref          #21.#66        // ext/mods/gameserver/network/GameClient.getSessionId:()Lext/mods/gameserver/network/SessionKey;
  #66 = NameAndType        #67:#68        // getSessionId:()Lext/mods/gameserver/network/SessionKey;
  #67 = Utf8               getSessionId
  #68 = Utf8               ()Lext/mods/gameserver/network/SessionKey;
  #69 = Fieldref           #70.#71        // ext/mods/gameserver/network/SessionKey.playOkID1:I
  #70 = Class              #72            // ext/mods/gameserver/network/SessionKey
  #71 = NameAndType        #73:#16        // playOkID1:I
  #72 = Utf8               ext/mods/gameserver/network/SessionKey
  #73 = Utf8               playOkID1
  #74 = Methodref          #59.#75        // ext/mods/gameserver/network/serverpackets/CharSelectInfo."<init>":(Ljava/lang/String;II)V
  #75 = NameAndType        #5:#76         // "<init>":(Ljava/lang/String;II)V
  #76 = Utf8               (Ljava/lang/String;II)V
  #77 = Methodref          #59.#78        // ext/mods/gameserver/network/serverpackets/CharSelectInfo.getCharacterSlots:()[Lext/mods/gameserver/model/CharSelectSlot;
  #78 = NameAndType        #79:#80        // getCharacterSlots:()[Lext/mods/gameserver/model/CharSelectSlot;
  #79 = Utf8               getCharacterSlots
  #80 = Utf8               ()[Lext/mods/gameserver/model/CharSelectSlot;
  #81 = Methodref          #21.#82        // ext/mods/gameserver/network/GameClient.setCharSelectSlot:([Lext/mods/gameserver/model/CharSelectSlot;)V
  #82 = NameAndType        #83:#84        // setCharSelectSlot:([Lext/mods/gameserver/model/CharSelectSlot;)V
  #83 = Utf8               setCharSelectSlot
  #84 = Utf8               ([Lext/mods/gameserver/model/CharSelectSlot;)V
  #85 = Utf8               Code
  #86 = Utf8               LineNumberTable
  #87 = Utf8               LocalVariableTable
  #88 = Utf8               this
  #89 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestCharacterDelete;
  #90 = Utf8               readImpl
  #91 = Utf8               runImpl
  #92 = Utf8               csi
  #93 = Utf8               Lext/mods/gameserver/network/serverpackets/CharSelectInfo;
  #94 = Utf8               StackMapTable
  #95 = Utf8               SourceFile
  #96 = Utf8               RequestCharacterDelete.java
{
  public ext.mods.gameserver.network.clientpackets.RequestCharacterDelete();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestCharacterDelete;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _slot:I
         8: return
      LineNumberTable:
        line 32: 0
        line 33: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/RequestCharacterDelete;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: getstatic     #23                 // Field ext/mods/gameserver/enums/FloodProtector.CHARACTER_SELECT:Lext/mods/gameserver/enums/FloodProtector;
        10: invokevirtual #29                 // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
        13: ifne          24
        16: aload_0
        17: getstatic     #33                 // Field ext/mods/gameserver/network/serverpackets/CharDeleteFail.REASON_DELETION_FAILED:Lext/mods/gameserver/network/serverpackets/CharDeleteFail;
        20: invokevirtual #39                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        23: return
        24: aload_0
        25: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        28: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
        31: aload_0
        32: getfield      #13                 // Field _slot:I
        35: invokevirtual #43                 // Method ext/mods/gameserver/network/GameClient.markToDeleteChar:(I)B
        38: tableswitch   { // -1 to 2

                      -1: 68

                       0: 71

                       1: 81

                       2: 91
                 default: 68
            }
        68: goto          98
        71: aload_0
        72: getstatic     #47                 // Field ext/mods/gameserver/network/serverpackets/CharDeleteOk.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/CharDeleteOk;
        75: invokevirtual #39                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        78: goto          98
        81: aload_0
        82: getstatic     #53                 // Field ext/mods/gameserver/network/serverpackets/CharDeleteFail.REASON_YOU_MAY_NOT_DELETE_CLAN_MEMBER:Lext/mods/gameserver/network/serverpackets/CharDeleteFail;
        85: invokevirtual #39                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        88: goto          98
        91: aload_0
        92: getstatic     #56                 // Field ext/mods/gameserver/network/serverpackets/CharDeleteFail.REASON_CLAN_LEADERS_MAY_NOT_BE_DELETED:Lext/mods/gameserver/network/serverpackets/CharDeleteFail;
        95: invokevirtual #39                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        98: new           #59                 // class ext/mods/gameserver/network/serverpackets/CharSelectInfo
       101: dup
       102: aload_0
       103: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
       106: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
       109: invokevirtual #61                 // Method ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
       112: aload_0
       113: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
       116: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
       119: invokevirtual #65                 // Method ext/mods/gameserver/network/GameClient.getSessionId:()Lext/mods/gameserver/network/SessionKey;
       122: getfield      #69                 // Field ext/mods/gameserver/network/SessionKey.playOkID1:I
       125: iconst_0
       126: invokespecial #74                 // Method ext/mods/gameserver/network/serverpackets/CharSelectInfo."<init>":(Ljava/lang/String;II)V
       129: astore_1
       130: aload_0
       131: aload_1
       132: invokevirtual #39                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       135: aload_0
       136: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
       139: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
       142: aload_1
       143: invokevirtual #77                 // Method ext/mods/gameserver/network/serverpackets/CharSelectInfo.getCharacterSlots:()[Lext/mods/gameserver/model/CharSelectSlot;
       146: invokevirtual #81                 // Method ext/mods/gameserver/network/GameClient.setCharSelectSlot:([Lext/mods/gameserver/model/CharSelectSlot;)V
       149: return
      LineNumberTable:
        line 38: 0
        line 40: 16
        line 41: 23
        line 44: 24
        line 48: 68
        line 51: 71
        line 52: 78
        line 55: 81
        line 56: 88
        line 59: 91
        line 63: 98
        line 64: 130
        line 65: 135
        line 66: 149
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     150     0  this   Lext/mods/gameserver/network/clientpackets/RequestCharacterDelete;
          130      20     1   csi   Lext/mods/gameserver/network/serverpackets/CharSelectInfo;
      StackMapTable: number_of_entries = 6
        frame_type = 24 /* same */
        frame_type = 43 /* same */
        frame_type = 2 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 6 /* same */
}
SourceFile: "RequestCharacterDelete.java"
