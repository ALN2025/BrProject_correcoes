// Bytecode for: ext.mods.gameserver.model.olympiad.Participant
// File: ext\mods\gameserver\model\olympiad\Participant.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/Participant.class
  Last modified 9 de jul de 2026; size 2931 bytes
  MD5 checksum caa1915d6d9bb15c40f842ac2bb5c837
  Compiled from "Participant.java"
public final class ext.mods.gameserver.model.olympiad.Participant
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/olympiad/Participant
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 15, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/olympiad/Participant._isDisconnected:Z
    #8 = Class              #10           // ext/mods/gameserver/model/olympiad/Participant
    #9 = NameAndType        #11:#12       // _isDisconnected:Z
   #10 = Utf8               ext/mods/gameserver/model/olympiad/Participant
   #11 = Utf8               _isDisconnected
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/olympiad/Participant._isDefecting:Z
   #14 = NameAndType        #15:#12       // _isDefecting:Z
   #15 = Utf8               _isDefecting
   #16 = Methodref          #17.#18       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #17 = Class              #19           // ext/mods/gameserver/model/actor/Player
   #18 = NameAndType        #20:#21       // getObjectId:()I
   #19 = Utf8               ext/mods/gameserver/model/actor/Player
   #20 = Utf8               getObjectId
   #21 = Utf8               ()I
   #22 = Fieldref           #8.#23        // ext/mods/gameserver/model/olympiad/Participant._objectId:I
   #23 = NameAndType        #24:#25       // _objectId:I
   #24 = Utf8               _objectId
   #25 = Utf8               I
   #26 = Fieldref           #8.#27        // ext/mods/gameserver/model/olympiad/Participant._player:Lext/mods/gameserver/model/actor/Player;
   #27 = NameAndType        #28:#29       // _player:Lext/mods/gameserver/model/actor/Player;
   #28 = Utf8               _player
   #29 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #30 = Methodref          #17.#31       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #31 = NameAndType        #32:#33       // getName:()Ljava/lang/String;
   #32 = Utf8               getName
   #33 = Utf8               ()Ljava/lang/String;
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/model/olympiad/Participant._name:Ljava/lang/String;
   #35 = NameAndType        #36:#37       // _name:Ljava/lang/String;
   #36 = Utf8               _name
   #37 = Utf8               Ljava/lang/String;
   #38 = Fieldref           #8.#39        // ext/mods/gameserver/model/olympiad/Participant._side:I
   #39 = NameAndType        #40:#25       // _side:I
   #40 = Utf8               _side
   #41 = Methodref          #17.#42       // ext/mods/gameserver/model/actor/Player.getBaseClass:()I
   #42 = NameAndType        #43:#21       // getBaseClass:()I
   #43 = Utf8               getBaseClass
   #44 = Fieldref           #8.#45        // ext/mods/gameserver/model/olympiad/Participant._baseClass:I
   #45 = NameAndType        #46:#25       // _baseClass:I
   #46 = Utf8               _baseClass
   #47 = Methodref          #48.#49       // ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #48 = Class              #50           // ext/mods/gameserver/model/olympiad/Olympiad
   #49 = NameAndType        #51:#52       // getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #50 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
   #51 = Utf8               getInstance
   #52 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
   #53 = Methodref          #48.#54       // ext/mods/gameserver/model/olympiad/Olympiad.getNobleStats:(I)Lext/mods/commons/data/StatSet;
   #54 = NameAndType        #55:#56       // getNobleStats:(I)Lext/mods/commons/data/StatSet;
   #55 = Utf8               getNobleStats
   #56 = Utf8               (I)Lext/mods/commons/data/StatSet;
   #57 = Fieldref           #8.#58        // ext/mods/gameserver/model/olympiad/Participant._set:Lext/mods/commons/data/StatSet;
   #58 = NameAndType        #59:#60       // _set:Lext/mods/commons/data/StatSet;
   #59 = Utf8               _set
   #60 = Utf8               Lext/mods/commons/data/StatSet;
   #61 = String             #62           // -
   #62 = Utf8               -
   #63 = Methodref          #17.#64       // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #64 = NameAndType        #65:#66       // isOnline:()Z
   #65 = Utf8               isOnline
   #66 = Utf8               ()Z
   #67 = Methodref          #68.#69       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #68 = Class              #70           // ext/mods/gameserver/model/World
   #69 = NameAndType        #51:#71       // getInstance:()Lext/mods/gameserver/model/World;
   #70 = Utf8               ext/mods/gameserver/model/World
   #71 = Utf8               ()Lext/mods/gameserver/model/World;
   #72 = Methodref          #68.#73       // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #73 = NameAndType        #74:#75       // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #74 = Utf8               getPlayer
   #75 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
   #76 = Methodref          #77.#78       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #77 = Class              #79           // ext/mods/commons/data/StatSet
   #78 = NameAndType        #80:#81       // getInteger:(Ljava/lang/String;)I
   #79 = Utf8               ext/mods/commons/data/StatSet
   #80 = Utf8               getInteger
   #81 = Utf8               (Ljava/lang/String;)I
   #82 = Methodref          #83.#84       // java/lang/Math.max:(II)I
   #83 = Class              #85           // java/lang/Math
   #84 = NameAndType        #86:#87       // max:(II)I
   #85 = Utf8               java/lang/Math
   #86 = Utf8               max
   #87 = Utf8               (II)I
   #88 = Methodref          #77.#89       // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
   #89 = NameAndType        #90:#91       // set:(Ljava/lang/String;I)V
   #90 = Utf8               set
   #91 = Utf8               (Ljava/lang/String;I)V
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #93 = Utf8               Code
   #94 = Utf8               LineNumberTable
   #95 = Utf8               LocalVariableTable
   #96 = Utf8               this
   #97 = Utf8               Lext/mods/gameserver/model/olympiad/Participant;
   #98 = Utf8               player
   #99 = Utf8               side
  #100 = Utf8               (II)V
  #101 = Utf8               objectId
  #102 = Utf8               getSide
  #103 = Utf8               getStatSet
  #104 = Utf8               ()Lext/mods/commons/data/StatSet;
  #105 = Utf8               isDisconnected
  #106 = Utf8               setDisconnection
  #107 = Utf8               (Z)V
  #108 = Utf8               isDefecting
  #109 = Utf8               setDefection
  #110 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #111 = Utf8               setPlayer
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #113 = Utf8               updatePlayer
  #114 = Utf8               StackMapTable
  #115 = Utf8               updateStat
  #116 = Utf8               statName
  #117 = Utf8               increment
  #118 = Utf8               SourceFile
  #119 = Utf8               Participant.java
{
  public ext.mods.gameserver.model.olympiad.Participant(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _isDisconnected:Z
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field _isDefecting:Z
        14: aload_0
        15: aload_1
        16: invokevirtual #16                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        19: putfield      #22                 // Field _objectId:I
        22: aload_0
        23: aload_1
        24: putfield      #26                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        27: aload_0
        28: aload_1
        29: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        32: putfield      #34                 // Field _name:Ljava/lang/String;
        35: aload_0
        36: iload_2
        37: putfield      #38                 // Field _side:I
        40: aload_0
        41: aload_1
        42: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getBaseClass:()I
        45: putfield      #44                 // Field _baseClass:I
        48: aload_0
        49: invokestatic  #47                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
        52: aload_0
        53: getfield      #22                 // Field _objectId:I
        56: invokevirtual #53                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getNobleStats:(I)Lext/mods/commons/data/StatSet;
        59: putfield      #57                 // Field _set:Lext/mods/commons/data/StatSet;
        62: return
      LineNumberTable:
        line 41: 0
        line 36: 4
        line 37: 9
        line 42: 14
        line 43: 22
        line 44: 27
        line 45: 35
        line 46: 40
        line 47: 48
        line 48: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/olympiad/Participant;
            0      63     1 player   Lext/mods/gameserver/model/actor/Player;
            0      63     2  side   I

  public ext.mods.gameserver.model.olympiad.Participant(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _isDisconnected:Z
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field _isDefecting:Z
        14: aload_0
        15: iload_1
        16: putfield      #22                 // Field _objectId:I
        19: aload_0
        20: aconst_null
        21: putfield      #26                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        24: aload_0
        25: ldc           #61                 // String -
        27: putfield      #34                 // Field _name:Ljava/lang/String;
        30: aload_0
        31: iload_2
        32: putfield      #38                 // Field _side:I
        35: aload_0
        36: iconst_0
        37: putfield      #44                 // Field _baseClass:I
        40: aload_0
        41: aconst_null
        42: putfield      #57                 // Field _set:Lext/mods/commons/data/StatSet;
        45: return
      LineNumberTable:
        line 51: 0
        line 36: 4
        line 37: 9
        line 52: 14
        line 53: 19
        line 54: 24
        line 55: 30
        line 56: 35
        line 57: 40
        line 58: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/olympiad/Participant;
            0      46     1 objectId   I
            0      46     2  side   I

  public int getObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _objectId:I
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/Participant;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/Participant;

  public int getSide();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _side:I
         4: ireturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/Participant;

  public int getBaseClass();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _baseClass:I
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/Participant;

  public ext.mods.commons.data.StatSet getStatSet();
    descriptor: ()Lext/mods/commons/data/StatSet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field _set:Lext/mods/commons/data/StatSet;
         4: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/Participant;

  public boolean isDisconnected();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _isDisconnected:Z
         4: ireturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/Participant;

  public void setDisconnection(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _isDisconnected:Z
         5: return
      LineNumberTable:
        line 92: 0
        line 93: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/olympiad/Participant;
            0       6     1 isDisconnected   Z

  public boolean isDefecting();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _isDefecting:Z
         4: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/Participant;

  public void setDefection(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _isDefecting:Z
         5: return
      LineNumberTable:
        line 102: 0
        line 103: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/olympiad/Participant;
            0       6     1 isDefecting   Z

  public ext.mods.gameserver.model.actor.Player getPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/Participant;

  public void setPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #26                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         5: return
      LineNumberTable:
        line 112: 0
        line 113: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/olympiad/Participant;
            0       6     1 player   Lext/mods/gameserver/model/actor/Player;

  public final void updatePlayer();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #26                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        14: ifne          31
        17: aload_0
        18: invokestatic  #67                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        21: aload_0
        22: getfield      #22                 // Field _objectId:I
        25: invokevirtual #72                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        28: putfield      #26                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        31: return
      LineNumberTable:
        line 117: 0
        line 118: 17
        line 119: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/olympiad/Participant;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 13 /* same */

  public final void updateStat(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: getfield      #57                 // Field _set:Lext/mods/commons/data/StatSet;
         4: aload_1
         5: aload_0
         6: getfield      #57                 // Field _set:Lext/mods/commons/data/StatSet;
         9: aload_1
        10: invokevirtual #76                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: iload_2
        14: iadd
        15: iconst_0
        16: invokestatic  #82                 // Method java/lang/Math.max:(II)I
        19: invokevirtual #88                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        22: return
      LineNumberTable:
        line 123: 0
        line 124: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/olympiad/Participant;
            0      23     1 statName   Ljava/lang/String;
            0      23     2 increment   I
}
SourceFile: "Participant.java"
