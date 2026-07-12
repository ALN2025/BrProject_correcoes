// Bytecode for: ext.mods.gameserver.model.entity.events.lastman.LMPlayer
// File: ext\mods\gameserver\model\entity\events\lastman\LMPlayer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/lastman/LMPlayer.class
  Last modified 9 de jul de 2026; size 1613 bytes
  MD5 checksum d219223e7fae104f6ab2026756036154
  Compiled from "LMPlayer.java"
public class ext.mods.gameserver.model.entity.events.lastman.LMPlayer
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/events/lastman/LMPlayer
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 10, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/entity/events/lastman/LMPlayer._player:Lext/mods/gameserver/model/actor/Player;
   #8 = Class              #10            // ext/mods/gameserver/model/entity/events/lastman/LMPlayer
   #9 = NameAndType        #11:#12        // _player:Lext/mods/gameserver/model/actor/Player;
  #10 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMPlayer
  #11 = Utf8               _player
  #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/entity/events/lastman/LMPlayer._points:S
  #14 = NameAndType        #15:#16        // _points:S
  #15 = Utf8               _points
  #16 = Utf8               S
  #17 = Fieldref           #18.#19        // ext/mods/Config.LM_EVENT_PLAYER_CREDITS:S
  #18 = Class              #20            // ext/mods/Config
  #19 = NameAndType        #21:#16        // LM_EVENT_PLAYER_CREDITS:S
  #20 = Utf8               ext/mods/Config
  #21 = Utf8               LM_EVENT_PLAYER_CREDITS
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/entity/events/lastman/LMPlayer._credits:S
  #23 = NameAndType        #24:#16        // _credits:S
  #24 = Utf8               _credits
  #25 = Fieldref           #8.#26         // ext/mods/gameserver/model/entity/events/lastman/LMPlayer._hexCode:Ljava/lang/String;
  #26 = NameAndType        #27:#28        // _hexCode:Ljava/lang/String;
  #27 = Utf8               _hexCode
  #28 = Utf8               Ljava/lang/String;
  #29 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               this
  #34 = Utf8               Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
  #35 = Utf8               player
  #36 = Utf8               hexCode
  #37 = Utf8               getPlayer
  #38 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #39 = Utf8               setPlayer
  #40 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #41 = Utf8               getCredits
  #42 = Utf8               ()S
  #43 = Utf8               setCredits
  #44 = Utf8               (S)V
  #45 = Utf8               credits
  #46 = Utf8               decreaseCredits
  #47 = Utf8               getPoints
  #48 = Utf8               setPoints
  #49 = Utf8               points
  #50 = Utf8               increasePoints
  #51 = Utf8               getHexCode
  #52 = Utf8               ()Ljava/lang/String;
  #53 = Utf8               SourceFile
  #54 = Utf8               LMPlayer.java
{
  public ext.mods.gameserver.model.entity.events.lastman.LMPlayer(ext.mods.gameserver.model.actor.Player, java.lang.String);
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
        15: getstatic     #17                 // Field ext/mods/Config.LM_EVENT_PLAYER_CREDITS:S
        18: putfield      #22                 // Field _credits:S
        21: aload_0
        22: aload_2
        23: putfield      #25                 // Field _hexCode:Ljava/lang/String;
        26: return
      LineNumberTable:
        line 31: 0
        line 32: 4
        line 33: 9
        line 34: 14
        line 35: 21
        line 36: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
            0      27     1 player   Lext/mods/gameserver/model/actor/Player;
            0      27     2 hexCode   Ljava/lang/String;

  public ext.mods.gameserver.model.actor.Player getPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;

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
        line 45: 0
        line 46: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
            0       6     1 player   Lext/mods/gameserver/model/actor/Player;

  public short getCredits();
    descriptor: ()S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _credits:S
         4: ireturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;

  public void setCredits(short);
    descriptor: (S)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #22                 // Field _credits:S
         5: return
      LineNumberTable:
        line 55: 0
        line 56: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
            0       6     1 credits   S

  public void decreaseCredits();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: dup
         2: getfield      #22                 // Field _credits:S
         5: iconst_1
         6: isub
         7: i2s
         8: putfield      #22                 // Field _credits:S
        11: return
      LineNumberTable:
        line 60: 0
        line 61: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;

  public short getPoints();
    descriptor: ()S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _points:S
         4: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;

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
        line 70: 0
        line 71: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
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
        line 75: 0
        line 76: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;

  public java.lang.String getHexCode();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _hexCode:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
}
SourceFile: "LMPlayer.java"
