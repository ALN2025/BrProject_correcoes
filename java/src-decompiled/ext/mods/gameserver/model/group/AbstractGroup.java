// Bytecode for: ext.mods.gameserver.model.group.AbstractGroup
// File: ext\mods\gameserver\model\group\AbstractGroup.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/group/AbstractGroup.class
  Last modified 9 de jul de 2026; size 2717 bytes
  MD5 checksum fb272e585a5ef77bc591e7fa7a94d415
  Compiled from "AbstractGroup.java"
public abstract class ext.mods.gameserver.model.group.AbstractGroup
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/gameserver/model/group/AbstractGroup
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 19, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/group/AbstractGroup._leader:Lext/mods/gameserver/model/actor/Player;
   #8 = Class              #10            // ext/mods/gameserver/model/group/AbstractGroup
   #9 = NameAndType        #11:#12        // _leader:Lext/mods/gameserver/model/actor/Player;
  #10 = Utf8               ext/mods/gameserver/model/group/AbstractGroup
  #11 = Utf8               _leader
  #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/group/AbstractGroup._level:I
  #14 = NameAndType        #15:#16        // _level:I
  #15 = Utf8               _level
  #16 = Utf8               I
  #17 = Methodref          #18.#19        // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #18 = Class              #20            // ext/mods/gameserver/model/actor/Player
  #19 = NameAndType        #21:#22        // getObjectId:()I
  #20 = Utf8               ext/mods/gameserver/model/actor/Player
  #21 = Utf8               getObjectId
  #22 = Utf8               ()I
  #23 = Methodref          #24.#25        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #24 = Class              #26            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #25 = NameAndType        #27:#28        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #26 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #27 = Utf8               getSystemMessage
  #28 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #29 = Methodref          #8.#30         // ext/mods/gameserver/model/group/AbstractGroup.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #30 = NameAndType        #31:#32        // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #31 = Utf8               broadcastPacket
  #32 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #33 = Methodref          #24.#34        // ext/mods/gameserver/network/serverpackets/SystemMessage.sendString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #34 = NameAndType        #35:#36        // sendString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #35 = Utf8               sendString
  #36 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #37 = Methodref          #8.#38         // ext/mods/gameserver/model/group/AbstractGroup.getMembers:()Ljava/util/List;
  #38 = NameAndType        #39:#40        // getMembers:()Ljava/util/List;
  #39 = Utf8               getMembers
  #40 = Utf8               ()Ljava/util/List;
  #41 = Methodref          #42.#43        // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #42 = Class              #44            // ext/mods/commons/random/Rnd
  #43 = NameAndType        #45:#46        // get:(Ljava/util/List;)Ljava/lang/Object;
  #44 = Utf8               ext/mods/commons/random/Rnd
  #45 = Utf8               get
  #46 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #47 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               this
  #52 = Utf8               Lext/mods/gameserver/model/group/AbstractGroup;
  #53 = Utf8               leader
  #54 = Utf8               Signature
  #55 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #56 = Utf8               getMembersCount
  #57 = Utf8               containsPlayer
  #58 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #59 = Utf8               broadcastCreatureSay
  #60 = Utf8               (Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
  #61 = Utf8               broadcastOnScreen
  #62 = Utf8               (ILext/mods/gameserver/network/NpcStringId;)V
  #63 = Utf8               (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
  #64 = Utf8               recalculateLevel
  #65 = Utf8               disband
  #66 = Utf8               getLevel
  #67 = Utf8               setLevel
  #68 = Utf8               (I)V
  #69 = Utf8               level
  #70 = Utf8               getLeader
  #71 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #72 = Utf8               setLeader
  #73 = Utf8               getLeaderObjectId
  #74 = Utf8               isLeader
  #75 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #76 = Utf8               player
  #77 = Utf8               StackMapTable
  #78 = Utf8               broadcastMessage
  #79 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #80 = Utf8               message
  #81 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #82 = Utf8               broadcastString
  #83 = Utf8               (Ljava/lang/String;)V
  #84 = Utf8               text
  #85 = Utf8               Ljava/lang/String;
  #86 = Utf8               getRandomPlayer
  #87 = Utf8               SourceFile
  #88 = Utf8               AbstractGroup.java
{
  public ext.mods.gameserver.model.group.AbstractGroup(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _leader:Lext/mods/gameserver/model/actor/Player;
         9: return
      LineNumberTable:
        line 39: 0
        line 40: 4
        line 41: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/group/AbstractGroup;
            0      10     1 leader   Lext/mods/gameserver/model/actor/Player;

  public abstract java.util.List<ext.mods.gameserver.model.actor.Player> getMembers();
    descriptor: ()Ljava/util/List;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    Signature: #55                          // ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;

  public abstract int getMembersCount();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean containsPlayer(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void broadcastPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void broadcastCreatureSay(ext.mods.gameserver.network.serverpackets.CreatureSay, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void broadcastOnScreen(int, ext.mods.gameserver.network.NpcStringId);
    descriptor: (ILext/mods/gameserver/network/NpcStringId;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void broadcastOnScreen(int, ext.mods.gameserver.network.NpcStringId, java.lang.Object...);
    descriptor: (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
    flags: (0x0481) ACC_PUBLIC, ACC_VARARGS, ACC_ABSTRACT

  public abstract void recalculateLevel();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void disband();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/AbstractGroup;

  public void setLevel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _level:I
         5: return
      LineNumberTable:
        line 112: 0
        line 113: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/group/AbstractGroup;
            0       6     1 level   I

  public ext.mods.gameserver.model.actor.Player getLeader();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _leader:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/group/AbstractGroup;

  public void setLeader(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #7                  // Field _leader:Lext/mods/gameserver/model/actor/Player;
         5: return
      LineNumberTable:
        line 129: 0
        line 130: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/group/AbstractGroup;
            0       6     1 leader   Lext/mods/gameserver/model/actor/Player;

  public int getLeaderObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _leader:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         7: ireturn
      LineNumberTable:
        line 137: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/group/AbstractGroup;

  public boolean isLeader(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _leader:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         7: aload_1
         8: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        11: if_icmpne     18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 147: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/group/AbstractGroup;
            0      20     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void broadcastMessage(ext.mods.gameserver.network.SystemMessageId);
    descriptor: (Lext/mods/gameserver/network/SystemMessageId;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokestatic  #23                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
         5: invokevirtual #29                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         8: return
      LineNumberTable:
        line 156: 0
        line 157: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/group/AbstractGroup;
            0       9     1 message   Lext/mods/gameserver/network/SystemMessageId;

  public void broadcastString(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokestatic  #33                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.sendString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
         5: invokevirtual #29                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         8: return
      LineNumberTable:
        line 165: 0
        line 166: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/group/AbstractGroup;
            0       9     1  text   Ljava/lang/String;

  public ext.mods.gameserver.model.actor.Player getRandomPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #37                 // Method getMembers:()Ljava/util/List;
         4: invokestatic  #41                 // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
         7: checkcast     #18                 // class ext/mods/gameserver/model/actor/Player
        10: areturn
      LineNumberTable:
        line 173: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/group/AbstractGroup;
}
SourceFile: "AbstractGroup.java"
