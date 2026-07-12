// Bytecode for: ext.mods.gameserver.network.clientpackets.PetitionVote
// File: ext\mods\gameserver\network\clientpackets\PetitionVote.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/PetitionVote.class
  Last modified 9 de jul de 2026; size 1705 bytes
  MD5 checksum 74b5e9a047104aac7f8c1cbdf910258b
  Compiled from "PetitionVote.java"
public final class ext.mods.gameserver.network.clientpackets.PetitionVote extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/PetitionVote
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/PetitionVote.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/PetitionVote
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/PetitionVote
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/PetitionVote._rate:I
  #14 = NameAndType        #15:#16        // _rate:I
  #15 = Utf8               _rate
  #16 = Utf8               I
  #17 = Methodref          #8.#18         // ext/mods/gameserver/network/clientpackets/PetitionVote.readS:()Ljava/lang/String;
  #18 = NameAndType        #19:#20        // readS:()Ljava/lang/String;
  #19 = Utf8               readS
  #20 = Utf8               ()Ljava/lang/String;
  #21 = Fieldref           #8.#22         // ext/mods/gameserver/network/clientpackets/PetitionVote._feedback:Ljava/lang/String;
  #22 = NameAndType        #23:#24        // _feedback:Ljava/lang/String;
  #23 = Utf8               _feedback
  #24 = Utf8               Ljava/lang/String;
  #25 = Methodref          #8.#26         // ext/mods/gameserver/network/clientpackets/PetitionVote.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #26 = NameAndType        #27:#28        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #27 = Utf8               getClient
  #28 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #29 = Class              #30            // ext/mods/gameserver/network/GameClient
  #30 = Utf8               ext/mods/gameserver/network/GameClient
  #31 = Methodref          #29.#32        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #32 = NameAndType        #33:#34        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #33 = Utf8               getPlayer
  #34 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #35 = Methodref          #36.#37        // ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
  #36 = Class              #38            // ext/mods/gameserver/data/manager/PetitionManager
  #37 = NameAndType        #39:#40        // getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
  #38 = Utf8               ext/mods/gameserver/data/manager/PetitionManager
  #39 = Utf8               getInstance
  #40 = Utf8               ()Lext/mods/gameserver/data/manager/PetitionManager;
  #41 = Methodref          #36.#42        // ext/mods/gameserver/data/manager/PetitionManager.getFeedbackPetition:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #42 = NameAndType        #43:#44        // getFeedbackPetition:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #43 = Utf8               getFeedbackPetition
  #44 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #45 = Fieldref           #46.#47        // ext/mods/gameserver/enums/petitions/PetitionRate.VALUES:[Lext/mods/gameserver/enums/petitions/PetitionRate;
  #46 = Class              #48            // ext/mods/gameserver/enums/petitions/PetitionRate
  #47 = NameAndType        #49:#50        // VALUES:[Lext/mods/gameserver/enums/petitions/PetitionRate;
  #48 = Utf8               ext/mods/gameserver/enums/petitions/PetitionRate
  #49 = Utf8               VALUES
  #50 = Utf8               [Lext/mods/gameserver/enums/petitions/PetitionRate;
  #51 = Methodref          #52.#53        // java/lang/String.trim:()Ljava/lang/String;
  #52 = Class              #54            // java/lang/String
  #53 = NameAndType        #55:#20        // trim:()Ljava/lang/String;
  #54 = Utf8               java/lang/String
  #55 = Utf8               trim
  #56 = Methodref          #57.#58        // ext/mods/gameserver/model/Petition.setFeedback:(Lext/mods/gameserver/enums/petitions/PetitionRate;Ljava/lang/String;)V
  #57 = Class              #59            // ext/mods/gameserver/model/Petition
  #58 = NameAndType        #60:#61        // setFeedback:(Lext/mods/gameserver/enums/petitions/PetitionRate;Ljava/lang/String;)V
  #59 = Utf8               ext/mods/gameserver/model/Petition
  #60 = Utf8               setFeedback
  #61 = Utf8               (Lext/mods/gameserver/enums/petitions/PetitionRate;Ljava/lang/String;)V
  #62 = Utf8               Code
  #63 = Utf8               LineNumberTable
  #64 = Utf8               LocalVariableTable
  #65 = Utf8               this
  #66 = Utf8               Lext/mods/gameserver/network/clientpackets/PetitionVote;
  #67 = Utf8               readImpl
  #68 = Utf8               runImpl
  #69 = Utf8               player
  #70 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #71 = Utf8               petition
  #72 = Utf8               Lext/mods/gameserver/model/Petition;
  #73 = Utf8               StackMapTable
  #74 = Class              #75            // ext/mods/gameserver/model/actor/Player
  #75 = Utf8               ext/mods/gameserver/model/actor/Player
  #76 = Utf8               SourceFile
  #77 = Utf8               PetitionVote.java
{
  public ext.mods.gameserver.network.clientpackets.PetitionVote();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/PetitionVote;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method readD:()I
         4: pop
         5: aload_0
         6: aload_0
         7: invokevirtual #7                  // Method readD:()I
        10: putfield      #13                 // Field _rate:I
        13: aload_0
        14: aload_0
        15: invokevirtual #17                 // Method readS:()Ljava/lang/String;
        18: putfield      #21                 // Field _feedback:Ljava/lang/String;
        21: return
      LineNumberTable:
        line 33: 0
        line 34: 5
        line 35: 13
        line 36: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/network/clientpackets/PetitionVote;

  public void runImpl();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #25                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #29                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #31                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: invokestatic  #35                 // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
        19: aload_1
        20: invokevirtual #41                 // Method ext/mods/gameserver/data/manager/PetitionManager.getFeedbackPetition:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
        23: astore_2
        24: aload_2
        25: ifnonnull     29
        28: return
        29: aload_2
        30: getstatic     #45                 // Field ext/mods/gameserver/enums/petitions/PetitionRate.VALUES:[Lext/mods/gameserver/enums/petitions/PetitionRate;
        33: aload_0
        34: getfield      #13                 // Field _rate:I
        37: aaload
        38: aload_0
        39: getfield      #21                 // Field _feedback:Ljava/lang/String;
        42: invokevirtual #51                 // Method java/lang/String.trim:()Ljava/lang/String;
        45: invokevirtual #56                 // Method ext/mods/gameserver/model/Petition.setFeedback:(Lext/mods/gameserver/enums/petitions/PetitionRate;Ljava/lang/String;)V
        48: return
      LineNumberTable:
        line 41: 0
        line 42: 11
        line 43: 15
        line 45: 16
        line 46: 24
        line 47: 28
        line 49: 29
        line 50: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/network/clientpackets/PetitionVote;
           11      38     1 player   Lext/mods/gameserver/model/actor/Player;
           24      25     2 petition   Lext/mods/gameserver/model/Petition;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/Petition ]
}
SourceFile: "PetitionVote.java"
