// Bytecode for: ext.mods.gameserver.model.actor.container.player.SubClass
// File: ext\mods\gameserver\model\actor\container\player\SubClass.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/SubClass.class
  Last modified 9 de jul de 2026; size 2299 bytes
  MD5 checksum 11835c2f5d457ab122f8658a28afb49f
  Compiled from "SubClass.java"
public final class ext.mods.gameserver.model.actor.container.player.SubClass
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/container/player/SubClass
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 12, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
   #8 = Class              #10            // ext/mods/gameserver/enums/actors/ClassId
   #9 = NameAndType        #11:#12        // VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #10 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #11 = Utf8               VALUES
  #12 = Utf8               [Lext/mods/gameserver/enums/actors/ClassId;
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/model/actor/container/player/SubClass._class:Lext/mods/gameserver/enums/actors/ClassId;
  #14 = Class              #16            // ext/mods/gameserver/model/actor/container/player/SubClass
  #15 = NameAndType        #17:#18        // _class:Lext/mods/gameserver/enums/actors/ClassId;
  #16 = Utf8               ext/mods/gameserver/model/actor/container/player/SubClass
  #17 = Utf8               _class
  #18 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #19 = Fieldref           #14.#20        // ext/mods/gameserver/model/actor/container/player/SubClass._classIndex:I
  #20 = NameAndType        #21:#22        // _classIndex:I
  #21 = Utf8               _classIndex
  #22 = Utf8               I
  #23 = Fieldref           #14.#24        // ext/mods/gameserver/model/actor/container/player/SubClass._exp:J
  #24 = NameAndType        #25:#26        // _exp:J
  #25 = Utf8               _exp
  #26 = Utf8               J
  #27 = Fieldref           #14.#28        // ext/mods/gameserver/model/actor/container/player/SubClass._sp:I
  #28 = NameAndType        #29:#22        // _sp:I
  #29 = Utf8               _sp
  #30 = Fieldref           #14.#31        // ext/mods/gameserver/model/actor/container/player/SubClass._level:I
  #31 = NameAndType        #32:#22        // _level:I
  #32 = Utf8               _level
  #33 = Methodref          #34.#35        // ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #34 = Class              #36            // ext/mods/gameserver/data/xml/PlayerLevelData
  #35 = NameAndType        #37:#38        // getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #36 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData
  #37 = Utf8               getInstance
  #38 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #39 = Methodref          #34.#40        // ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
  #40 = NameAndType        #41:#42        // getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
  #41 = Utf8               getPlayerLevel
  #42 = Utf8               (I)Lext/mods/gameserver/model/records/PlayerLevel;
  #43 = Methodref          #44.#45        // ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
  #44 = Class              #46            // ext/mods/gameserver/model/records/PlayerLevel
  #45 = NameAndType        #47:#48        // requiredExpToLevelUp:()J
  #46 = Utf8               ext/mods/gameserver/model/records/PlayerLevel
  #47 = Utf8               requiredExpToLevelUp
  #48 = Utf8               ()J
  #49 = Methodref          #8.#50         // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #50 = NameAndType        #51:#52        // getId:()I
  #51 = Utf8               getId
  #52 = Utf8               ()I
  #53 = Methodref          #34.#54        // ext/mods/gameserver/data/xml/PlayerLevelData.getRequiredExpForHighestLevel:()J
  #54 = NameAndType        #55:#48        // getRequiredExpForHighestLevel:()J
  #55 = Utf8               getRequiredExpForHighestLevel
  #56 = Methodref          #57.#58        // java/lang/Math.min:(JJ)J
  #57 = Class              #59            // java/lang/Math
  #58 = NameAndType        #60:#61        // min:(JJ)J
  #59 = Utf8               java/lang/Math
  #60 = Utf8               min
  #61 = Utf8               (JJ)J
  #62 = Methodref          #34.#63        // ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
  #63 = NameAndType        #64:#52        // getRealMaxLevel:()I
  #64 = Utf8               getRealMaxLevel
  #65 = Methodref          #57.#66        // java/lang/Math.clamp:(JII)I
  #66 = NameAndType        #67:#68        // clamp:(JII)I
  #67 = Utf8               clamp
  #68 = Utf8               (JII)I
  #69 = Utf8               (IIJIB)V
  #70 = Utf8               Code
  #71 = Utf8               LineNumberTable
  #72 = Utf8               LocalVariableTable
  #73 = Utf8               this
  #74 = Utf8               Lext/mods/gameserver/model/actor/container/player/SubClass;
  #75 = Utf8               classId
  #76 = Utf8               classIndex
  #77 = Utf8               exp
  #78 = Utf8               sp
  #79 = Utf8               level
  #80 = Utf8               B
  #81 = Utf8               (II)V
  #82 = Utf8               getClassDefinition
  #83 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #84 = Utf8               getClassId
  #85 = Utf8               setClassId
  #86 = Utf8               (I)V
  #87 = Utf8               getClassIndex
  #88 = Utf8               getExp
  #89 = Utf8               setExp
  #90 = Utf8               (J)V
  #91 = Utf8               getSp
  #92 = Utf8               setSp
  #93 = Utf8               getLevel
  #94 = Utf8               setLevel
  #95 = Utf8               SourceFile
  #96 = Utf8               SubClass.java
{
  public ext.mods.gameserver.model.actor.container.player.SubClass(int, int, long, int, byte);
    descriptor: (IIJIB)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: getstatic     #7                  // Field ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
         8: iload_1
         9: aaload
        10: putfield      #13                 // Field _class:Lext/mods/gameserver/enums/actors/ClassId;
        13: aload_0
        14: iload_2
        15: putfield      #19                 // Field _classIndex:I
        18: aload_0
        19: lload_3
        20: putfield      #23                 // Field _exp:J
        23: aload_0
        24: iload         5
        26: putfield      #27                 // Field _sp:I
        29: aload_0
        30: iload         6
        32: putfield      #30                 // Field _level:I
        35: return
      LineNumberTable:
        line 43: 0
        line 44: 4
        line 45: 13
        line 46: 18
        line 47: 23
        line 48: 29
        line 49: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;
            0      36     1 classId   I
            0      36     2 classIndex   I
            0      36     3   exp   J
            0      36     5    sp   I
            0      36     6 level   B

  public ext.mods.gameserver.model.actor.container.player.SubClass(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: getstatic     #7                  // Field ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
         8: iload_1
         9: aaload
        10: putfield      #13                 // Field _class:Lext/mods/gameserver/enums/actors/ClassId;
        13: aload_0
        14: iload_2
        15: putfield      #19                 // Field _classIndex:I
        18: aload_0
        19: invokestatic  #33                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
        22: bipush        40
        24: invokevirtual #39                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
        27: invokevirtual #43                 // Method ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
        30: putfield      #23                 // Field _exp:J
        33: aload_0
        34: iconst_0
        35: putfield      #27                 // Field _sp:I
        38: aload_0
        39: bipush        40
        41: putfield      #30                 // Field _level:I
        44: return
      LineNumberTable:
        line 57: 0
        line 58: 4
        line 59: 13
        line 60: 18
        line 61: 33
        line 62: 38
        line 63: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;
            0      45     1 classId   I
            0      45     2 classIndex   I

  public ext.mods.gameserver.enums.actors.ClassId getClassDefinition();
    descriptor: ()Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _class:Lext/mods/gameserver/enums/actors/ClassId;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;

  public int getClassId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _class:Lext/mods/gameserver/enums/actors/ClassId;
         4: invokevirtual #49                 // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
         7: ireturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;

  public void setClassId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getstatic     #7                  // Field ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
         4: iload_1
         5: aaload
         6: putfield      #13                 // Field _class:Lext/mods/gameserver/enums/actors/ClassId;
         9: return
      LineNumberTable:
        line 77: 0
        line 78: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;
            0      10     1 classId   I

  public int getClassIndex();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _classIndex:I
         4: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;

  public long getExp();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _exp:J
         4: lreturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;

  public void setExp(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: invokestatic  #33                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         5: invokevirtual #53                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRequiredExpForHighestLevel:()J
         8: invokestatic  #56                 // Method java/lang/Math.min:(JJ)J
        11: putfield      #23                 // Field _exp:J
        14: return
      LineNumberTable:
        line 92: 0
        line 93: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;
            0      15     1   exp   J

  public int getSp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _sp:I
         4: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;

  public void setSp(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #27                 // Field _sp:I
         5: return
      LineNumberTable:
        line 102: 0
        line 103: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;
            0       6     1    sp   I

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;

  public void setLevel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: i2l
         3: bipush        40
         5: invokestatic  #33                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         8: invokevirtual #62                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
        11: invokestatic  #65                 // Method java/lang/Math.clamp:(JII)I
        14: putfield      #30                 // Field _level:I
        17: return
      LineNumberTable:
        line 112: 0
        line 113: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/container/player/SubClass;
            0      18     1 level   I
}
SourceFile: "SubClass.java"
