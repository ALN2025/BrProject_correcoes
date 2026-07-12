// Bytecode for: ext.mods.gameserver.model.Augmentation
// File: ext\mods\gameserver\model\Augmentation.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/Augmentation.class
  Last modified 9 de jul de 2026; size 3465 bytes
  MD5 checksum bcf2221cac8f57bf9593097931877a99
  Compiled from "Augmentation.java"
public final class ext.mods.gameserver.model.Augmentation
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/Augmentation
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/Augmentation._id:I
    #8 = Class              #10           // ext/mods/gameserver/model/Augmentation
    #9 = NameAndType        #11:#12       // _id:I
   #10 = Utf8               ext/mods/gameserver/model/Augmentation
   #11 = Utf8               _id
   #12 = Utf8               I
   #13 = Class              #14           // ext/mods/gameserver/model/Augmentation$AugmentationStatBoni
   #14 = Utf8               ext/mods/gameserver/model/Augmentation$AugmentationStatBoni
   #15 = Methodref          #13.#16       // ext/mods/gameserver/model/Augmentation$AugmentationStatBoni."<init>":(I)V
   #16 = NameAndType        #5:#17        // "<init>":(I)V
   #17 = Utf8               (I)V
   #18 = Fieldref           #8.#19        // ext/mods/gameserver/model/Augmentation._boni:Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
   #19 = NameAndType        #20:#21       // _boni:Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
   #20 = Utf8               _boni
   #21 = Utf8               Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
   #22 = Fieldref           #8.#23        // ext/mods/gameserver/model/Augmentation._skill:Lext/mods/gameserver/skills/L2Skill;
   #23 = NameAndType        #24:#25       // _skill:Lext/mods/gameserver/skills/L2Skill;
   #24 = Utf8               _skill
   #25 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #26 = Methodref          #27.#28       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #27 = Class              #29           // ext/mods/gameserver/data/SkillTable
   #28 = NameAndType        #30:#31       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #29 = Utf8               ext/mods/gameserver/data/SkillTable
   #30 = Utf8               getInstance
   #31 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #32 = Methodref          #27.#33       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #33 = NameAndType        #34:#35       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #34 = Utf8               getInfo
   #35 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #36 = Methodref          #8.#37        // ext/mods/gameserver/model/Augmentation."<init>":(ILext/mods/gameserver/skills/L2Skill;)V
   #37 = NameAndType        #5:#38        // "<init>":(ILext/mods/gameserver/skills/L2Skill;)V
   #38 = Utf8               (ILext/mods/gameserver/skills/L2Skill;)V
   #39 = Methodref          #13.#40       // ext/mods/gameserver/model/Augmentation$AugmentationStatBoni.applyBonus:(Lext/mods/gameserver/model/actor/Player;)V
   #40 = NameAndType        #41:#42       // applyBonus:(Lext/mods/gameserver/model/actor/Player;)V
   #41 = Utf8               applyBonus
   #42 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #44 = Class              #46           // ext/mods/gameserver/model/actor/Player
   #45 = NameAndType        #47:#48       // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #46 = Utf8               ext/mods/gameserver/model/actor/Player
   #47 = Utf8               addSkill
   #48 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
   #49 = Methodref          #50.#51       // ext/mods/gameserver/skills/L2Skill.isActive:()Z
   #50 = Class              #52           // ext/mods/gameserver/skills/L2Skill
   #51 = NameAndType        #53:#54       // isActive:()Z
   #52 = Utf8               ext/mods/gameserver/skills/L2Skill
   #53 = Utf8               isActive
   #54 = Utf8               ()Z
   #55 = Methodref          #44.#56       // ext/mods/gameserver/model/actor/Player.getReuseTimeStamp:()Ljava/util/Map;
   #56 = NameAndType        #57:#58       // getReuseTimeStamp:()Ljava/util/Map;
   #57 = Utf8               getReuseTimeStamp
   #58 = Utf8               ()Ljava/util/Map;
   #59 = Methodref          #50.#60       // ext/mods/gameserver/skills/L2Skill.getReuseHashCode:()I
   #60 = NameAndType        #61:#62       // getReuseHashCode:()I
   #61 = Utf8               getReuseHashCode
   #62 = Utf8               ()I
   #63 = Methodref          #64.#65       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #64 = Class              #66           // java/lang/Integer
   #65 = NameAndType        #67:#68       // valueOf:(I)Ljava/lang/Integer;
   #66 = Utf8               java/lang/Integer
   #67 = Utf8               valueOf
   #68 = Utf8               (I)Ljava/lang/Integer;
   #69 = InterfaceMethodref #70.#71       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #70 = Class              #72           // java/util/Map
   #71 = NameAndType        #73:#74       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #72 = Utf8               java/util/Map
   #73 = Utf8               get
   #74 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #75 = Class              #76           // ext/mods/gameserver/model/records/Timestamp
   #76 = Utf8               ext/mods/gameserver/model/records/Timestamp
   #77 = Methodref          #75.#78       // ext/mods/gameserver/model/records/Timestamp.getRemaining:()J
   #78 = NameAndType        #79:#80       // getRemaining:()J
   #79 = Utf8               getRemaining
   #80 = Utf8               ()J
   #81 = Methodref          #44.#82       // ext/mods/gameserver/model/actor/Player.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
   #82 = NameAndType        #83:#84       // disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
   #83 = Utf8               disableSkill
   #84 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
   #85 = Class              #86           // ext/mods/gameserver/network/serverpackets/SkillList
   #86 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
   #87 = Methodref          #85.#88       // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #88 = NameAndType        #5:#42        // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #89 = Methodref          #44.#90       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #90 = NameAndType        #91:#92       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #91 = Utf8               sendPacket
   #92 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #93 = Class              #94           // ext/mods/gameserver/network/serverpackets/SkillCoolTime
   #94 = Utf8               ext/mods/gameserver/network/serverpackets/SkillCoolTime
   #95 = Methodref          #93.#88       // ext/mods/gameserver/network/serverpackets/SkillCoolTime."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #96 = Methodref          #13.#97       // ext/mods/gameserver/model/Augmentation$AugmentationStatBoni.removeBonus:(Lext/mods/gameserver/model/actor/Player;)V
   #97 = NameAndType        #98:#42       // removeBonus:(Lext/mods/gameserver/model/actor/Player;)V
   #98 = Utf8               removeBonus
   #99 = Methodref          #50.#100      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #100 = NameAndType        #101:#62      // getId:()I
  #101 = Utf8               getId
  #102 = Methodref          #50.#103      // ext/mods/gameserver/skills/L2Skill.isPassive:()Z
  #103 = NameAndType        #104:#54      // isPassive:()Z
  #104 = Utf8               isPassive
  #105 = Methodref          #50.#106      // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #106 = NameAndType        #107:#54      // isToggle:()Z
  #107 = Utf8               isToggle
  #108 = Methodref          #44.#109      // ext/mods/gameserver/model/actor/Player.removeSkill:(IZZ)Lext/mods/gameserver/skills/L2Skill;
  #109 = NameAndType        #110:#111     // removeSkill:(IZZ)Lext/mods/gameserver/skills/L2Skill;
  #110 = Utf8               removeSkill
  #111 = Utf8               (IZZ)Lext/mods/gameserver/skills/L2Skill;
  #112 = Methodref          #2.#113       // java/lang/Object.getClass:()Ljava/lang/Class;
  #113 = NameAndType        #114:#115     // getClass:()Ljava/lang/Class;
  #114 = Utf8               getClass
  #115 = Utf8               ()Ljava/lang/Class;
  #116 = Methodref          #117.#118     // java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #117 = Class              #119          // java/util/Objects
  #118 = NameAndType        #120:#121     // equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #119 = Utf8               java/util/Objects
  #120 = Utf8               equals
  #121 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #122 = Methodref          #117.#123     // java/util/Objects.hash:([Ljava/lang/Object;)I
  #123 = NameAndType        #124:#125     // hash:([Ljava/lang/Object;)I
  #124 = Utf8               hash
  #125 = Utf8               ([Ljava/lang/Object;)I
  #126 = Utf8               Code
  #127 = Utf8               LineNumberTable
  #128 = Utf8               LocalVariableTable
  #129 = Utf8               this
  #130 = Utf8               Lext/mods/gameserver/model/Augmentation;
  #131 = Utf8               id
  #132 = Utf8               skill
  #133 = Utf8               (III)V
  #134 = Utf8               skillLevel
  #135 = Utf8               StackMapTable
  #136 = Utf8               getSkill
  #137 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #138 = Utf8               delay
  #139 = Utf8               J
  #140 = Utf8               ts
  #141 = Utf8               Lext/mods/gameserver/model/records/Timestamp;
  #142 = Utf8               updateTimeStamp
  #143 = Utf8               Z
  #144 = Utf8               player
  #145 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #146 = Utf8               (Ljava/lang/Object;)Z
  #147 = Utf8               obj
  #148 = Utf8               Ljava/lang/Object;
  #149 = Utf8               other
  #150 = Utf8               hashCode
  #151 = Utf8               SourceFile
  #152 = Utf8               Augmentation.java
  #153 = Utf8               NestMembers
  #154 = Utf8               InnerClasses
  #155 = Utf8               AugmentationStatBoni
{
  public ext.mods.gameserver.model.Augmentation(int, ext.mods.gameserver.skills.L2Skill);
    descriptor: (ILext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _id:I
         9: aload_0
        10: new           #13                 // class ext/mods/gameserver/model/Augmentation$AugmentationStatBoni
        13: dup
        14: aload_0
        15: getfield      #7                  // Field _id:I
        18: invokespecial #15                 // Method ext/mods/gameserver/model/Augmentation$AugmentationStatBoni."<init>":(I)V
        21: putfield      #18                 // Field _boni:Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
        24: aload_0
        25: aload_2
        26: putfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        29: return
      LineNumberTable:
        line 49: 0
        line 50: 4
        line 51: 9
        line 52: 24
        line 53: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/Augmentation;
            0      30     1    id   I
            0      30     2 skill   Lext/mods/gameserver/skills/L2Skill;

  public ext.mods.gameserver.model.Augmentation(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: ifeq          17
         6: invokestatic  #26                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
         9: iload_2
        10: iload_3
        11: invokevirtual #32                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        14: goto          18
        17: aconst_null
        18: invokespecial #36                 // Method "<init>":(ILext/mods/gameserver/skills/L2Skill;)V
        21: return
      LineNumberTable:
        line 57: 0
        line 58: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/Augmentation;
            0      22     1    id   I
            0      22     2 skill   I
            0      22     3 skillLevel   I
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ this, int, int, int ]
          stack = [ this, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ this, int, int, int ]
          stack = [ this, int, class ext/mods/gameserver/skills/L2Skill ]

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _id:I
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Augmentation;

  public ext.mods.gameserver.skills.L2Skill getSkill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Augmentation;

  public void applyBonus(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _boni:Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
         4: aload_1
         5: invokevirtual #39                 // Method ext/mods/gameserver/model/Augmentation$AugmentationStatBoni.applyBonus:(Lext/mods/gameserver/model/actor/Player;)V
         8: aload_0
         9: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        12: ifnull        117
        15: iconst_0
        16: istore_2
        17: aload_1
        18: aload_0
        19: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        22: iconst_0
        23: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
        26: pop
        27: aload_0
        28: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        31: invokevirtual #49                 // Method ext/mods/gameserver/skills/L2Skill.isActive:()Z
        34: ifeq          89
        37: aload_1
        38: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getReuseTimeStamp:()Ljava/util/Map;
        41: aload_0
        42: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        45: invokevirtual #59                 // Method ext/mods/gameserver/skills/L2Skill.getReuseHashCode:()I
        48: invokestatic  #63                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        51: invokeinterface #69,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        56: checkcast     #75                 // class ext/mods/gameserver/model/records/Timestamp
        59: astore_3
        60: aload_3
        61: ifnull        89
        64: aload_3
        65: invokevirtual #77                 // Method ext/mods/gameserver/model/records/Timestamp.getRemaining:()J
        68: lstore        4
        70: lload         4
        72: lconst_0
        73: lcmp
        74: ifle          89
        77: aload_1
        78: aload_0
        79: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        82: lload         4
        84: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
        87: iconst_1
        88: istore_2
        89: aload_1
        90: new           #85                 // class ext/mods/gameserver/network/serverpackets/SkillList
        93: dup
        94: aload_1
        95: invokespecial #87                 // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        98: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       101: iload_2
       102: ifeq          117
       105: aload_1
       106: new           #93                 // class ext/mods/gameserver/network/serverpackets/SkillCoolTime
       109: dup
       110: aload_1
       111: invokespecial #95                 // Method ext/mods/gameserver/network/serverpackets/SkillCoolTime."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       114: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       117: return
      LineNumberTable:
        line 76: 0
        line 78: 8
        line 80: 15
        line 82: 17
        line 84: 27
        line 86: 37
        line 87: 60
        line 89: 64
        line 90: 70
        line 92: 77
        line 93: 87
        line 98: 89
        line 100: 101
        line 101: 105
        line 103: 117
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           70      19     4 delay   J
           60      29     3    ts   Lext/mods/gameserver/model/records/Timestamp;
           17     100     2 updateTimeStamp   Z
            0     118     0  this   Lext/mods/gameserver/model/Augmentation;
            0     118     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 89
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 27

  public void removeBonus(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _boni:Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
         4: aload_1
         5: invokevirtual #96                 // Method ext/mods/gameserver/model/Augmentation$AugmentationStatBoni.removeBonus:(Lext/mods/gameserver/model/actor/Player;)V
         8: aload_0
         9: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        12: ifnull        65
        15: aload_1
        16: aload_0
        17: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        20: invokevirtual #99                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        23: iconst_0
        24: aload_0
        25: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        28: invokevirtual #102                // Method ext/mods/gameserver/skills/L2Skill.isPassive:()Z
        31: ifne          44
        34: aload_0
        35: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        38: invokevirtual #105                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
        41: ifeq          48
        44: iconst_1
        45: goto          49
        48: iconst_0
        49: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZZ)Lext/mods/gameserver/skills/L2Skill;
        52: pop
        53: aload_1
        54: new           #85                 // class ext/mods/gameserver/network/serverpackets/SkillList
        57: dup
        58: aload_1
        59: invokespecial #87                 // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        62: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        65: return
      LineNumberTable:
        line 111: 0
        line 113: 8
        line 115: 15
        line 117: 53
        line 119: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/model/Augmentation;
            0      66     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/Augmentation, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/Augmentation, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/Augmentation, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int, int, int ]
        frame_type = 15 /* same */

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: ifnull        22
        11: aload_0
        12: invokevirtual #112                // Method java/lang/Object.getClass:()Ljava/lang/Class;
        15: aload_1
        16: invokevirtual #112                // Method java/lang/Object.getClass:()Ljava/lang/Class;
        19: if_acmpeq     24
        22: iconst_0
        23: ireturn
        24: aload_1
        25: checkcast     #8                  // class ext/mods/gameserver/model/Augmentation
        28: astore_2
        29: aload_0
        30: getfield      #7                  // Field _id:I
        33: aload_2
        34: getfield      #7                  // Field _id:I
        37: if_icmpne     72
        40: aload_0
        41: getfield      #18                 // Field _boni:Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
        44: aload_2
        45: getfield      #18                 // Field _boni:Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
        48: invokestatic  #116                // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        51: ifeq          72
        54: aload_0
        55: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        58: aload_2
        59: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        62: invokestatic  #116                // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        65: ifeq          72
        68: iconst_1
        69: goto          73
        72: iconst_0
        73: ireturn
      LineNumberTable:
        line 189: 0
        line 190: 5
        line 192: 7
        line 193: 22
        line 195: 24
        line 196: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      74     0  this   Lext/mods/gameserver/model/Augmentation;
            0      74     1   obj   Ljava/lang/Object;
           29      45     2 other   Lext/mods/gameserver/model/Augmentation;
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/Augmentation ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: iconst_3
         1: anewarray     #2                  // class java/lang/Object
         4: dup
         5: iconst_0
         6: aload_0
         7: getfield      #7                  // Field _id:I
        10: invokestatic  #63                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        13: aastore
        14: dup
        15: iconst_1
        16: aload_0
        17: getfield      #18                 // Field _boni:Lext/mods/gameserver/model/Augmentation$AugmentationStatBoni;
        20: aastore
        21: dup
        22: iconst_2
        23: aload_0
        24: getfield      #22                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        27: aastore
        28: invokestatic  #122                // Method java/util/Objects.hash:([Ljava/lang/Object;)I
        31: ireturn
      LineNumberTable:
        line 202: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/Augmentation;
}
SourceFile: "Augmentation.java"
NestMembers:
  ext/mods/gameserver/model/Augmentation$AugmentationStatBoni
InnerClasses:
  public static #155= #13 of #8;          // AugmentationStatBoni=class ext/mods/gameserver/model/Augmentation$AugmentationStatBoni of class ext/mods/gameserver/model/Augmentation
