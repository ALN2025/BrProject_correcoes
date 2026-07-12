// Bytecode for: ext.mods.gameserver.model.actor.attack.PlayableAttack
// File: ext\mods\gameserver\model\actor\attack\PlayableAttack.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/attack/PlayableAttack.class
  Last modified 9 de jul de 2026; size 2146 bytes
  MD5 checksum dc82ac2071516dfc2cfa12b8ea99ae43
  Compiled from "PlayableAttack.java"
public class ext.mods.gameserver.model.actor.attack.PlayableAttack<T extends ext.mods.gameserver.model.actor.Playable> extends ext.mods.gameserver.model.actor.attack.CreatureAttack<T>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/attack/PlayableAttack
  super_class: #2                         // ext/mods/gameserver/model/actor/attack/CreatureAttack
  interfaces: 0, fields: 0, methods: 3, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/attack/CreatureAttack."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/attack/CreatureAttack
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #7 = Methodref          #2.#8          // ext/mods/gameserver/model/actor/attack/CreatureAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
   #8 = NameAndType        #9:#10         // canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
   #9 = Utf8               canAttack
  #10 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #11 = Class              #12            // ext/mods/gameserver/model/actor/Playable
  #12 = Utf8               ext/mods/gameserver/model/actor/Playable
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/model/actor/attack/PlayableAttack._actor:Lext/mods/gameserver/model/actor/Creature;
  #14 = Class              #16            // ext/mods/gameserver/model/actor/attack/PlayableAttack
  #15 = NameAndType        #17:#18        // _actor:Lext/mods/gameserver/model/actor/Creature;
  #16 = Utf8               ext/mods/gameserver/model/actor/attack/PlayableAttack
  #17 = Utf8               _actor
  #18 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #20 = Class              #22            // ext/mods/gameserver/enums/ZoneId
  #21 = NameAndType        #23:#24        // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #22 = Utf8               ext/mods/gameserver/enums/ZoneId
  #23 = Utf8               PEACE
  #24 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #25 = Methodref          #11.#26        // ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #26 = NameAndType        #27:#28        // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #27 = Utf8               isInsideZone
  #28 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #29 = Fieldref           #30.#31        // ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #30 = Class              #32            // ext/mods/gameserver/network/SystemMessageId
  #31 = NameAndType        #33:#34        // CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #32 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #33 = Utf8               CANT_ATK_PEACEZONE
  #34 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #35 = Methodref          #36.#37        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #36 = Class              #38            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #37 = NameAndType        #39:#40        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #38 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #39 = Utf8               getSystemMessage
  #40 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #41 = Methodref          #11.#42        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #42 = NameAndType        #43:#44        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #43 = Utf8               sendPacket
  #44 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #45 = Fieldref           #30.#46        // ext/mods/gameserver/network/SystemMessageId.TARGET_IN_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #46 = NameAndType        #47:#34        // TARGET_IN_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #47 = Utf8               TARGET_IN_PEACEZONE
  #48 = Methodref          #2.#49         // ext/mods/gameserver/model/actor/attack/CreatureAttack.stop:()V
  #49 = NameAndType        #50:#51        // stop:()V
  #50 = Utf8               stop
  #51 = Utf8               ()V
  #52 = Methodref          #11.#53        // ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #53 = NameAndType        #54:#55        // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #54 = Utf8               getAI
  #55 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #56 = Methodref          #57.#58        // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToIdle:()V
  #57 = Class              #59            // ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #58 = NameAndType        #60:#51        // tryToIdle:()V
  #59 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #60 = Utf8               tryToIdle
  #61 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
  #62 = Utf8               Code
  #63 = Utf8               LineNumberTable
  #64 = Utf8               LocalVariableTable
  #65 = Utf8               this
  #66 = Utf8               Lext/mods/gameserver/model/actor/attack/PlayableAttack;
  #67 = Utf8               actor
  #68 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #69 = Utf8               LocalVariableTypeTable
  #70 = Utf8               Lext/mods/gameserver/model/actor/attack/PlayableAttack<TT;>;
  #71 = Utf8               TT;
  #72 = Utf8               Signature
  #73 = Utf8               (TT;)V
  #74 = Utf8               targetPlayable
  #75 = Utf8               target
  #76 = Utf8               StackMapTable
  #77 = Utf8               <T:Lext/mods/gameserver/model/actor/Playable;>Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;
  #78 = Utf8               SourceFile
  #79 = Utf8               PlayableAttack.java
{
  public ext.mods.gameserver.model.actor.attack.PlayableAttack(T);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/attack/CreatureAttack."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: return
      LineNumberTable:
        line 34: 0
        line 35: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/attack/PlayableAttack;
            0       6     1 actor   Lext/mods/gameserver/model/actor/Playable;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/attack/PlayableAttack<TT;>;
            0       6     1 actor   TT;
    Signature: #73                          // (TT;)V

  public boolean canAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #7                  // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: instanceof    #11                 // class ext/mods/gameserver/model/actor/Playable
        14: ifeq          84
        17: aload_1
        18: checkcast     #11                 // class ext/mods/gameserver/model/actor/Playable
        21: astore_2
        22: aload_0
        23: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        26: checkcast     #11                 // class ext/mods/gameserver/model/actor/Playable
        29: getstatic     #19                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        32: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        35: ifeq          56
        38: aload_0
        39: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        42: checkcast     #11                 // class ext/mods/gameserver/model/actor/Playable
        45: getstatic     #29                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
        48: invokestatic  #35                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        51: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        54: iconst_0
        55: ireturn
        56: aload_2
        57: getstatic     #19                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        60: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        63: ifeq          84
        66: aload_0
        67: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        70: checkcast     #11                 // class ext/mods/gameserver/model/actor/Playable
        73: getstatic     #45                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IN_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
        76: invokestatic  #35                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        79: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        82: iconst_0
        83: ireturn
        84: iconst_1
        85: ireturn
      LineNumberTable:
        line 40: 0
        line 41: 8
        line 43: 10
        line 45: 22
        line 47: 38
        line 48: 54
        line 51: 56
        line 53: 66
        line 54: 82
        line 58: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22      62     2 targetPlayable   Lext/mods/gameserver/model/actor/Playable;
            0      86     0  this   Lext/mods/gameserver/model/actor/attack/PlayableAttack;
            0      86     1 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      86     0  this   Lext/mods/gameserver/model/actor/attack/PlayableAttack<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 250 /* chop */
          offset_delta = 27

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #48                 // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.stop:()V
         4: aload_0
         5: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #11                 // class ext/mods/gameserver/model/actor/Playable
        11: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
        14: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToIdle:()V
        17: return
      LineNumberTable:
        line 64: 0
        line 66: 4
        line 67: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/attack/PlayableAttack;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/attack/PlayableAttack<TT;>;
}
Signature: #77                          // <T:Lext/mods/gameserver/model/actor/Playable;>Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;
SourceFile: "PlayableAttack.java"
