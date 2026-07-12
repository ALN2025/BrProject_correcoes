// Bytecode for: ext.mods.gameserver.model.boat.ScheduledBoatMessages
// File: ext\mods\gameserver\model\boat\ScheduledBoatMessages.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/boat/ScheduledBoatMessages.class
  Last modified 9 de jul de 2026; size 1022 bytes
  MD5 checksum 2f8270fcd1381591dea179769d28bfad
  Compiled from "ScheduledBoatMessages.java"
public class ext.mods.gameserver.model.boat.ScheduledBoatMessages
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/boat/ScheduledBoatMessages
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/boat/ScheduledBoatMessages._delay:I
   #8 = Class              #10            // ext/mods/gameserver/model/boat/ScheduledBoatMessages
   #9 = NameAndType        #11:#12        // _delay:I
  #10 = Utf8               ext/mods/gameserver/model/boat/ScheduledBoatMessages
  #11 = Utf8               _delay
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/boat/ScheduledBoatMessages._messages:Ljava/util/List;
  #14 = NameAndType        #15:#16        // _messages:Ljava/util/List;
  #15 = Utf8               _messages
  #16 = Utf8               Ljava/util/List;
  #17 = Utf8               Signature
  #18 = Utf8               Ljava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;
  #19 = Utf8               (ILjava/util/List;)V
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/gameserver/model/boat/ScheduledBoatMessages;
  #25 = Utf8               delay
  #26 = Utf8               messages
  #27 = Utf8               LocalVariableTypeTable
  #28 = Utf8               (ILjava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;)V
  #29 = Utf8               getDelay
  #30 = Utf8               ()I
  #31 = Utf8               getMessages
  #32 = Utf8               ()Ljava/util/List;
  #33 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;
  #34 = Utf8               SourceFile
  #35 = Utf8               ScheduledBoatMessages.java
{
  public ext.mods.gameserver.model.boat.ScheduledBoatMessages(int, java.util.List<ext.mods.gameserver.network.serverpackets.L2GameServerPacket>);
    descriptor: (ILjava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _delay:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _messages:Ljava/util/List;
        14: return
      LineNumberTable:
        line 30: 0
        line 31: 4
        line 32: 9
        line 33: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/boat/ScheduledBoatMessages;
            0      15     1 delay   I
            0      15     2 messages   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     2 messages   Ljava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;
    Signature: #28                          // (ILjava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;)V

  public int getDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _delay:I
         4: ireturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/ScheduledBoatMessages;

  public java.util.List<ext.mods.gameserver.network.serverpackets.L2GameServerPacket> getMessages();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _messages:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/ScheduledBoatMessages;
    Signature: #33                          // ()Ljava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;
}
SourceFile: "ScheduledBoatMessages.java"
