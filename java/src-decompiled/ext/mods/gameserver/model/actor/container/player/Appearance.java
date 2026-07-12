// Bytecode for: ext.mods.gameserver.model.actor.container.player.Appearance
// File: ext\mods\gameserver\model\actor\container\player\Appearance.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/Appearance.class
  Last modified 9 de jul de 2026; size 2382 bytes
  MD5 checksum 529e8d3f6c481510a72996cd602e3c73
  Compiled from "Appearance.java"
public final class ext.mods.gameserver.model.actor.container.player.Appearance
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/player/Appearance
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 17, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/container/player/Appearance._isVisible:Z
   #8 = Class              #10            // ext/mods/gameserver/model/actor/container/player/Appearance
   #9 = NameAndType        #11:#12        // _isVisible:Z
  #10 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #11 = Utf8               _isVisible
  #12 = Utf8               Z
  #13 = Integer            16777215
  #14 = Fieldref           #8.#15         // ext/mods/gameserver/model/actor/container/player/Appearance._nameColor:I
  #15 = NameAndType        #16:#17        // _nameColor:I
  #16 = Utf8               _nameColor
  #17 = Utf8               I
  #18 = Integer            16777079
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/actor/container/player/Appearance._titleColor:I
  #20 = NameAndType        #21:#17        // _titleColor:I
  #21 = Utf8               _titleColor
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/actor/container/player/Appearance._face:B
  #23 = NameAndType        #24:#25        // _face:B
  #24 = Utf8               _face
  #25 = Utf8               B
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/model/actor/container/player/Appearance._hairColor:B
  #27 = NameAndType        #28:#25        // _hairColor:B
  #28 = Utf8               _hairColor
  #29 = Fieldref           #8.#30         // ext/mods/gameserver/model/actor/container/player/Appearance._hairStyle:B
  #30 = NameAndType        #31:#25        // _hairStyle:B
  #31 = Utf8               _hairStyle
  #32 = Fieldref           #8.#33         // ext/mods/gameserver/model/actor/container/player/Appearance._sex:Lext/mods/gameserver/enums/actors/Sex;
  #33 = NameAndType        #34:#35        // _sex:Lext/mods/gameserver/enums/actors/Sex;
  #34 = Utf8               _sex
  #35 = Utf8               Lext/mods/gameserver/enums/actors/Sex;
  #36 = Utf8               (BBBLext/mods/gameserver/enums/actors/Sex;)V
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               LocalVariableTable
  #40 = Utf8               this
  #41 = Utf8               Lext/mods/gameserver/model/actor/container/player/Appearance;
  #42 = Utf8               face
  #43 = Utf8               hColor
  #44 = Utf8               hStyle
  #45 = Utf8               sex
  #46 = Utf8               getFace
  #47 = Utf8               ()B
  #48 = Utf8               setFace
  #49 = Utf8               (I)V
  #50 = Utf8               value
  #51 = Utf8               getHairColor
  #52 = Utf8               setHairColor
  #53 = Utf8               getHairStyle
  #54 = Utf8               setHairStyle
  #55 = Utf8               getSex
  #56 = Utf8               ()Lext/mods/gameserver/enums/actors/Sex;
  #57 = Utf8               setSex
  #58 = Utf8               (Lext/mods/gameserver/enums/actors/Sex;)V
  #59 = Utf8               isVisible
  #60 = Utf8               ()Z
  #61 = Utf8               setVisible
  #62 = Utf8               (Z)V
  #63 = Utf8               val
  #64 = Utf8               getNameColor
  #65 = Utf8               ()I
  #66 = Utf8               setNameColor
  #67 = Utf8               nameColor
  #68 = Utf8               (III)V
  #69 = Utf8               red
  #70 = Utf8               green
  #71 = Utf8               blue
  #72 = Utf8               getTitleColor
  #73 = Utf8               setTitleColor
  #74 = Utf8               titleColor
  #75 = Utf8               SourceFile
  #76 = Utf8               Appearance.java
{
  public ext.mods.gameserver.model.actor.container.player.Appearance(byte, byte, byte, ext.mods.gameserver.enums.actors.Sex);
    descriptor: (BBBLext/mods/gameserver/enums/actors/Sex;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_1
         6: putfield      #7                  // Field _isVisible:Z
         9: aload_0
        10: ldc           #13                 // int 16777215
        12: putfield      #14                 // Field _nameColor:I
        15: aload_0
        16: ldc           #18                 // int 16777079
        18: putfield      #19                 // Field _titleColor:I
        21: aload_0
        22: iload_1
        23: putfield      #22                 // Field _face:B
        26: aload_0
        27: iload_2
        28: putfield      #26                 // Field _hairColor:B
        31: aload_0
        32: iload_3
        33: putfield      #29                 // Field _hairStyle:B
        36: aload_0
        37: aload         4
        39: putfield      #32                 // Field _sex:Lext/mods/gameserver/enums/actors/Sex;
        42: return
      LineNumberTable:
        line 33: 0
        line 28: 4
        line 29: 9
        line 30: 15
        line 34: 21
        line 35: 26
        line 36: 31
        line 37: 36
        line 38: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;
            0      43     1  face   B
            0      43     2 hColor   B
            0      43     3 hStyle   B
            0      43     4   sex   Lext/mods/gameserver/enums/actors/Sex;

  public byte getFace();
    descriptor: ()B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _face:B
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;

  public void setFace(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: i2b
         3: putfield      #22                 // Field _face:B
         6: return
      LineNumberTable:
        line 47: 0
        line 48: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;
            0       7     1 value   I

  public byte getHairColor();
    descriptor: ()B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _hairColor:B
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;

  public void setHairColor(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: i2b
         3: putfield      #26                 // Field _hairColor:B
         6: return
      LineNumberTable:
        line 57: 0
        line 58: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;
            0       7     1 value   I

  public byte getHairStyle();
    descriptor: ()B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _hairStyle:B
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;

  public void setHairStyle(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: i2b
         3: putfield      #29                 // Field _hairStyle:B
         6: return
      LineNumberTable:
        line 67: 0
        line 68: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;
            0       7     1 value   I

  public ext.mods.gameserver.enums.actors.Sex getSex();
    descriptor: ()Lext/mods/gameserver/enums/actors/Sex;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _sex:Lext/mods/gameserver/enums/actors/Sex;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;

  public void setSex(ext.mods.gameserver.enums.actors.Sex);
    descriptor: (Lext/mods/gameserver/enums/actors/Sex;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #32                 // Field _sex:Lext/mods/gameserver/enums/actors/Sex;
         5: return
      LineNumberTable:
        line 77: 0
        line 78: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;
            0       6     1   sex   Lext/mods/gameserver/enums/actors/Sex;

  public boolean isVisible();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _isVisible:Z
         4: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;

  public void setVisible(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _isVisible:Z
         5: return
      LineNumberTable:
        line 87: 0
        line 88: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;
            0       6     1   val   Z

  public int getNameColor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field _nameColor:I
         4: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;

  public void setNameColor(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #14                 // Field _nameColor:I
         5: return
      LineNumberTable:
        line 97: 0
        line 98: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;
            0       6     1 nameColor   I

  public void setNameColor(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: sipush        255
         5: iand
         6: iload_2
         7: sipush        255
        10: iand
        11: bipush        8
        13: ishl
        14: iadd
        15: iload_3
        16: sipush        255
        19: iand
        20: bipush        16
        22: ishl
        23: iadd
        24: putfield      #14                 // Field _nameColor:I
        27: return
      LineNumberTable:
        line 102: 0
        line 103: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;
            0      28     1   red   I
            0      28     2 green   I
            0      28     3  blue   I

  public int getTitleColor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _titleColor:I
         4: ireturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;

  public void setTitleColor(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #19                 // Field _titleColor:I
         5: return
      LineNumberTable:
        line 112: 0
        line 113: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;
            0       6     1 titleColor   I

  public void setTitleColor(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: sipush        255
         5: iand
         6: iload_2
         7: sipush        255
        10: iand
        11: bipush        8
        13: ishl
        14: iadd
        15: iload_3
        16: sipush        255
        19: iand
        20: bipush        16
        22: ishl
        23: iadd
        24: putfield      #19                 // Field _titleColor:I
        27: return
      LineNumberTable:
        line 117: 0
        line 118: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/container/player/Appearance;
            0      28     1   red   I
            0      28     2 green   I
            0      28     3  blue   I
}
SourceFile: "Appearance.java"
