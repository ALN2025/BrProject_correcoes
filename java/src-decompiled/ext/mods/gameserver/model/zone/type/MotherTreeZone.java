// Bytecode for: ext.mods.gameserver.model.zone.type.MotherTreeZone
// File: ext\mods\gameserver\model\zone\type\MotherTreeZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/MotherTreeZone.class
  Last modified 9 de jul de 2026; size 2661 bytes
  MD5 checksum a4bc8fcddf5f1bf90df732af14ea3bab
  Compiled from "MotherTreeZone.java"
public class ext.mods.gameserver.model.zone.type.MotherTreeZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/type/MotherTreeZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 5, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/zone/type/MotherTreeZone._mpRegen:I
    #8 = Class              #10           // ext/mods/gameserver/model/zone/type/MotherTreeZone
    #9 = NameAndType        #11:#12       // _mpRegen:I
   #10 = Utf8               ext/mods/gameserver/model/zone/type/MotherTreeZone
   #11 = Utf8               _mpRegen
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/zone/type/MotherTreeZone._hpRegen:I
   #14 = NameAndType        #15:#12       // _hpRegen:I
   #15 = Utf8               _hpRegen
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/zone/type/MotherTreeZone._race:I
   #17 = NameAndType        #18:#12       // _race:I
   #18 = Utf8               _race
   #19 = String             #20           // enterMsgId
   #20 = Utf8               enterMsgId
   #21 = Methodref          #22.#23       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #22 = Class              #24           // java/lang/String
   #23 = NameAndType        #25:#26       // equals:(Ljava/lang/Object;)Z
   #24 = Utf8               java/lang/String
   #25 = Utf8               equals
   #26 = Utf8               (Ljava/lang/Object;)Z
   #27 = Methodref          #28.#29       // java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
   #28 = Class              #30           // java/lang/Integer
   #29 = NameAndType        #31:#32       // valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
   #30 = Utf8               java/lang/Integer
   #31 = Utf8               valueOf
   #32 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
   #33 = Methodref          #28.#34       // java/lang/Integer.intValue:()I
   #34 = NameAndType        #35:#36       // intValue:()I
   #35 = Utf8               intValue
   #36 = Utf8               ()I
   #37 = Fieldref           #8.#38        // ext/mods/gameserver/model/zone/type/MotherTreeZone._enterMsg:I
   #38 = NameAndType        #39:#12       // _enterMsg:I
   #39 = Utf8               _enterMsg
   #40 = String             #41           // leaveMsgId
   #41 = Utf8               leaveMsgId
   #42 = Fieldref           #8.#43        // ext/mods/gameserver/model/zone/type/MotherTreeZone._leaveMsg:I
   #43 = NameAndType        #44:#12       // _leaveMsg:I
   #44 = Utf8               _leaveMsg
   #45 = String             #46           // MpRegenBonus
   #46 = Utf8               MpRegenBonus
   #47 = String             #48           // HpRegenBonus
   #48 = Utf8               HpRegenBonus
   #49 = String             #50           // affectedRace
   #50 = Utf8               affectedRace
   #51 = Methodref          #28.#52       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #52 = NameAndType        #53:#54       // parseInt:(Ljava/lang/String;)I
   #53 = Utf8               parseInt
   #54 = Utf8               (Ljava/lang/String;)I
   #55 = Methodref          #2.#56        // ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #56 = NameAndType        #57:#58       // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #57 = Utf8               setParameter
   #58 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #59 = Class              #60           // ext/mods/gameserver/model/actor/Player
   #60 = Utf8               ext/mods/gameserver/model/actor/Player
   #61 = Methodref          #59.#62       // ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
   #62 = NameAndType        #63:#64       // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
   #63 = Utf8               getRace
   #64 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
   #65 = Methodref          #66.#67       // ext/mods/gameserver/enums/actors/ClassRace.ordinal:()I
   #66 = Class              #68           // ext/mods/gameserver/enums/actors/ClassRace
   #67 = NameAndType        #69:#36       // ordinal:()I
   #68 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
   #69 = Utf8               ordinal
   #70 = Fieldref           #71.#72       // ext/mods/gameserver/enums/ZoneId.MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
   #71 = Class              #73           // ext/mods/gameserver/enums/ZoneId
   #72 = NameAndType        #74:#75       // MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
   #73 = Utf8               ext/mods/gameserver/enums/ZoneId
   #74 = Utf8               MOTHER_TREE
   #75 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #76 = Methodref          #59.#77       // ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #77 = NameAndType        #78:#79       // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #78 = Utf8               setInsideZone
   #79 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
   #80 = Methodref          #81.#82       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #81 = Class              #83           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #82 = NameAndType        #84:#85       // getSystemMessage:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #83 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #84 = Utf8               getSystemMessage
   #85 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #86 = Methodref          #59.#87       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #87 = NameAndType        #88:#89       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #88 = Utf8               sendPacket
   #89 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #90 = Utf8               Code
   #91 = Utf8               LineNumberTable
   #92 = Utf8               LocalVariableTable
   #93 = Utf8               this
   #94 = Utf8               Lext/mods/gameserver/model/zone/type/MotherTreeZone;
   #95 = Utf8               id
   #96 = Utf8               name
   #97 = Utf8               Ljava/lang/String;
   #98 = Utf8               value
   #99 = Utf8               StackMapTable
  #100 = Utf8               isAffected
  #101 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #102 = Utf8               player
  #103 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #104 = Utf8               creature
  #105 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #106 = Utf8               onEnter
  #107 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #108 = Utf8               onExit
  #109 = Utf8               getMpRegenBonus
  #110 = Utf8               getHpRegenBonus
  #111 = Utf8               SourceFile
  #112 = Utf8               MotherTreeZone.java
{
  public ext.mods.gameserver.model.zone.type.MotherTreeZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: aload_0
         6: iconst_1
         7: putfield      #7                  // Field _mpRegen:I
        10: aload_0
        11: iconst_1
        12: putfield      #13                 // Field _hpRegen:I
        15: aload_0
        16: iconst_m1
        17: putfield      #16                 // Field _race:I
        20: return
      LineNumberTable:
        line 40: 0
        line 34: 5
        line 35: 10
        line 36: 15
        line 41: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/zone/type/MotherTreeZone;
            0      21     1    id   I

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #19                 // String enterMsgId
         3: invokevirtual #21                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          23
         9: aload_0
        10: aload_2
        11: invokestatic  #27                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        14: invokevirtual #33                 // Method java/lang/Integer.intValue:()I
        17: putfield      #37                 // Field _enterMsg:I
        20: goto          118
        23: aload_1
        24: ldc           #40                 // String leaveMsgId
        26: invokevirtual #21                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        29: ifeq          46
        32: aload_0
        33: aload_2
        34: invokestatic  #27                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        37: invokevirtual #33                 // Method java/lang/Integer.intValue:()I
        40: putfield      #42                 // Field _leaveMsg:I
        43: goto          118
        46: aload_1
        47: ldc           #45                 // String MpRegenBonus
        49: invokevirtual #21                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        52: ifeq          69
        55: aload_0
        56: aload_2
        57: invokestatic  #27                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        60: invokevirtual #33                 // Method java/lang/Integer.intValue:()I
        63: putfield      #7                  // Field _mpRegen:I
        66: goto          118
        69: aload_1
        70: ldc           #47                 // String HpRegenBonus
        72: invokevirtual #21                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        75: ifeq          92
        78: aload_0
        79: aload_2
        80: invokestatic  #27                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        83: invokevirtual #33                 // Method java/lang/Integer.intValue:()I
        86: putfield      #13                 // Field _hpRegen:I
        89: goto          118
        92: aload_1
        93: ldc           #49                 // String affectedRace
        95: invokevirtual #21                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        98: ifeq          112
       101: aload_0
       102: aload_2
       103: invokestatic  #51                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       106: putfield      #16                 // Field _race:I
       109: goto          118
       112: aload_0
       113: aload_1
       114: aload_2
       115: invokespecial #55                 // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
       118: return
      LineNumberTable:
        line 46: 0
        line 47: 9
        line 48: 23
        line 49: 32
        line 50: 46
        line 51: 55
        line 52: 69
        line 53: 78
        line 54: 92
        line 55: 101
        line 57: 112
        line 58: 118
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     119     0  this   Lext/mods/gameserver/model/zone/type/MotherTreeZone;
            0     119     1  name   Ljava/lang/String;
            0     119     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 6
        frame_type = 23 /* same */
        frame_type = 22 /* same */
        frame_type = 22 /* same */
        frame_type = 22 /* same */
        frame_type = 19 /* same */
        frame_type = 5 /* same */

  protected boolean isAffected(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _race:I
         4: iconst_m1
         5: if_icmple     40
         8: aload_1
         9: instanceof    #59                 // class ext/mods/gameserver/model/actor/Player
        12: ifeq          40
        15: aload_1
        16: checkcast     #59                 // class ext/mods/gameserver/model/actor/Player
        19: astore_2
        20: aload_0
        21: getfield      #16                 // Field _race:I
        24: aload_2
        25: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        28: invokevirtual #65                 // Method ext/mods/gameserver/enums/actors/ClassRace.ordinal:()I
        31: if_icmpne     38
        34: iconst_1
        35: goto          39
        38: iconst_0
        39: ireturn
        40: iconst_1
        41: ireturn
      LineNumberTable:
        line 63: 0
        line 64: 20
        line 66: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      20     2 player   Lext/mods/gameserver/model/actor/Player;
            0      42     0  this   Lext/mods/gameserver/model/zone/type/MotherTreeZone;
            0      42     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #59                 // class ext/mods/gameserver/model/actor/Player
         4: ifeq          38
         7: aload_1
         8: checkcast     #59                 // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #70                 // Field ext/mods/gameserver/enums/ZoneId.MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_1
        17: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: aload_0
        21: getfield      #37                 // Field _enterMsg:I
        24: ifeq          38
        27: aload_2
        28: aload_0
        29: getfield      #37                 // Field _enterMsg:I
        32: invokestatic  #80                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        35: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        38: return
      LineNumberTable:
        line 72: 0
        line 74: 12
        line 76: 20
        line 77: 27
        line 79: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      26     2 player   Lext/mods/gameserver/model/actor/Player;
            0      39     0  this   Lext/mods/gameserver/model/zone/type/MotherTreeZone;
            0      39     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 38 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #59                 // class ext/mods/gameserver/model/actor/Player
         4: ifeq          38
         7: aload_1
         8: checkcast     #59                 // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #70                 // Field ext/mods/gameserver/enums/ZoneId.MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_0
        17: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: aload_0
        21: getfield      #42                 // Field _leaveMsg:I
        24: ifeq          38
        27: aload_2
        28: aload_0
        29: getfield      #42                 // Field _leaveMsg:I
        32: invokestatic  #80                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        35: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        38: return
      LineNumberTable:
        line 84: 0
        line 86: 12
        line 88: 20
        line 89: 27
        line 91: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      26     2 player   Lext/mods/gameserver/model/actor/Player;
            0      39     0  this   Lext/mods/gameserver/model/zone/type/MotherTreeZone;
            0      39     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 38 /* same */

  public int getMpRegenBonus();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _mpRegen:I
         4: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/MotherTreeZone;

  public int getHpRegenBonus();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _hpRegen:I
         4: ireturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/MotherTreeZone;
}
SourceFile: "MotherTreeZone.java"
