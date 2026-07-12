// Bytecode for: ext.mods.gameserver.model.entity.events.deathmatch.DMPlayer
// File: ext\mods\gameserver\model\entity\events\deathmatch\DMPlayer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.class
  Last modified 9 de jul de 2026; size 1550 bytes
  MD5 checksum a9c53b523f1077d4fc4cb98c5cb844cc
  Compiled from "DMPlayer.java"
public class ext.mods.gameserver.model.entity.events.deathmatch.DMPlayer
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 10, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer._player:Lext/mods/gameserver/model/actor/Player;
   #8 = Class              #10            // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
   #9 = NameAndType        #11:#12        // _player:Lext/mods/gameserver/model/actor/Player;
  #10 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
  #11 = Utf8               _player
  #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer._points:S
  #14 = NameAndType        #15:#16        // _points:S
  #15 = Utf8               _points
  #16 = Utf8               S
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer._death:S
  #18 = NameAndType        #19:#16        // _death:S
  #19 = Utf8               _death
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer._hexCode:Ljava/lang/String;
  #21 = NameAndType        #22:#23        // _hexCode:Ljava/lang/String;
  #22 = Utf8               _hexCode
  #23 = Utf8               Ljava/lang/String;
  #24 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               LocalVariableTable
  #28 = Utf8               this
  #29 = Utf8               Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
  #30 = Utf8               player
  #31 = Utf8               hexCode
  #32 = Utf8               getPlayer
  #33 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #34 = Utf8               setPlayer
  #35 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #36 = Utf8               getPoints
  #37 = Utf8               ()S
  #38 = Utf8               setPoints
  #39 = Utf8               (S)V
  #40 = Utf8               points
  #41 = Utf8               increasePoints
  #42 = Utf8               getDeath
  #43 = Utf8               setDeath
  #44 = Utf8               death
  #45 = Utf8               increaseDeath
  #46 = Utf8               getHexCode
  #47 = Utf8               ()Ljava/lang/String;
  #48 = Utf8               SourceFile
  #49 = Utf8               DMPlayer.java
{
  public ext.mods.gameserver.model.entity.events.deathmatch.DMPlayer(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field _points:S
        14: aload_0
        15: iconst_0
        16: putfield      #17                 // Field _death:S
        19: aload_0
        20: aload_2
        21: putfield      #20                 // Field _hexCode:Ljava/lang/String;
        24: return
      LineNumberTable:
        line 30: 0
        line 31: 4
        line 32: 9
        line 33: 14
        line 34: 19
        line 35: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
            0      25     1 player   Lext/mods/gameserver/model/actor/Player;
            0      25     2 hexCode   Ljava/lang/String;

  public ext.mods.gameserver.model.actor.Player getPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;

  public void setPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         5: return
      LineNumberTable:
        line 44: 0
        line 45: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
            0       6     1 player   Lext/mods/gameserver/model/actor/Player;

  public short getPoints();
    descriptor: ()S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _points:S
         4: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;

  public void setPoints(short);
    descriptor: (S)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _points:S
         5: return
      LineNumberTable:
        line 54: 0
        line 55: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
            0       6     1 points   S

  public void increasePoints();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: dup
         2: getfield      #13                 // Field _points:S
         5: iconst_1
         6: iadd
         7: i2s
         8: putfield      #13                 // Field _points:S
        11: return
      LineNumberTable:
        line 59: 0
        line 60: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;

  public short getDeath();
    descriptor: ()S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _death:S
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;

  public void setDeath(short);
    descriptor: (S)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #17                 // Field _death:S
         5: return
      LineNumberTable:
        line 69: 0
        line 70: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
            0       6     1 death   S

  public void increaseDeath();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: dup
         2: getfield      #17                 // Field _death:S
         5: iconst_1
         6: iadd
         7: i2s
         8: putfield      #17                 // Field _death:S
        11: return
      LineNumberTable:
        line 74: 0
        line 75: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;

  public java.lang.String getHexCode();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _hexCode:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
}
SourceFile: "DMPlayer.java"
