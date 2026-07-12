// Bytecode for: ext.mods.gameserver.model.actor.container.monster.SeedState
// File: ext\mods\gameserver\model\actor\container\monster\SeedState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/monster/SeedState.class
  Last modified 9 de jul de 2026; size 3415 bytes
  MD5 checksum e93db69d764b8f2ed98a8bcd03f42c86
  Compiled from "SeedState.java"
public class ext.mods.gameserver.model.actor.container.monster.SeedState
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/monster/SeedState
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 9, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/monster/SeedState._owner:Lext/mods/gameserver/model/actor/instance/Monster;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/monster/SeedState
    #9 = NameAndType        #11:#12       // _owner:Lext/mods/gameserver/model/actor/instance/Monster;
   #10 = Utf8               ext/mods/gameserver/model/actor/container/monster/SeedState
   #11 = Utf8               _owner
   #12 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/container/monster/SeedState._seederId:I
   #14 = NameAndType        #15:#16       // _seederId:I
   #15 = Utf8               _seederId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/actor/container/monster/SeedState._seed:Lext/mods/gameserver/model/manor/Seed;
   #18 = NameAndType        #19:#20       // _seed:Lext/mods/gameserver/model/manor/Seed;
   #19 = Utf8               _seed
   #20 = Utf8               Lext/mods/gameserver/model/manor/Seed;
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #22 = Class              #24           // ext/mods/gameserver/model/actor/Player
   #23 = NameAndType        #25:#26       // getObjectId:()I
   #24 = Utf8               ext/mods/gameserver/model/actor/Player
   #25 = Utf8               getObjectId
   #26 = Utf8               ()I
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/actor/container/monster/SeedState._isHarvested:Z
   #28 = NameAndType        #29:#30       // _isHarvested:Z
   #29 = Utf8               _isHarvested
   #30 = Utf8               Z
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #32 = Class              #34           // ext/mods/gameserver/model/World
   #33 = NameAndType        #35:#36       // getInstance:()Lext/mods/gameserver/model/World;
   #34 = Utf8               ext/mods/gameserver/model/World
   #35 = Utf8               getInstance
   #36 = Utf8               ()Lext/mods/gameserver/model/World;
   #37 = Methodref          #32.#38       // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #38 = NameAndType        #39:#40       // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #39 = Utf8               getPlayer
   #40 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
   #41 = Methodref          #22.#42       // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #42 = NameAndType        #43:#44       // getParty:()Lext/mods/gameserver/model/group/Party;
   #43 = Utf8               getParty
   #44 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
   #46 = Class              #48           // ext/mods/gameserver/model/group/Party
   #47 = NameAndType        #49:#50       // containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
   #48 = Utf8               ext/mods/gameserver/model/group/Party
   #49 = Utf8               containsPlayer
   #50 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/actor/instance/Monster.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #52 = Class              #54           // ext/mods/gameserver/model/actor/instance/Monster
   #53 = NameAndType        #55:#56       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #54 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #55 = Utf8               getTemplate
   #56 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #57 = Methodref          #58.#59       // ext/mods/gameserver/model/actor/template/NpcTemplate.getPassives:()Ljava/util/List;
   #58 = Class              #60           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #59 = NameAndType        #61:#62       // getPassives:()Ljava/util/List;
   #60 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #61 = Utf8               getPassives
   #62 = Utf8               ()Ljava/util/List;
   #63 = InterfaceMethodref #64.#65       // java/util/List.iterator:()Ljava/util/Iterator;
   #64 = Class              #66           // java/util/List
   #65 = NameAndType        #67:#68       // iterator:()Ljava/util/Iterator;
   #66 = Utf8               java/util/List
   #67 = Utf8               iterator
   #68 = Utf8               ()Ljava/util/Iterator;
   #69 = InterfaceMethodref #70.#71       // java/util/Iterator.hasNext:()Z
   #70 = Class              #72           // java/util/Iterator
   #71 = NameAndType        #73:#74       // hasNext:()Z
   #72 = Utf8               java/util/Iterator
   #73 = Utf8               hasNext
   #74 = Utf8               ()Z
   #75 = InterfaceMethodref #70.#76       // java/util/Iterator.next:()Ljava/lang/Object;
   #76 = NameAndType        #77:#78       // next:()Ljava/lang/Object;
   #77 = Utf8               next
   #78 = Utf8               ()Ljava/lang/Object;
   #79 = Class              #80           // ext/mods/gameserver/skills/L2Skill
   #80 = Utf8               ext/mods/gameserver/skills/L2Skill
   #81 = Methodref          #79.#82       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #82 = NameAndType        #83:#26       // getId:()I
   #83 = Utf8               getId
   #84 = Methodref          #79.#85       // ext/mods/gameserver/skills/L2Skill.getLevel:()I
   #85 = NameAndType        #86:#26       // getLevel:()I
   #86 = Utf8               getLevel
   #87 = Methodref          #52.#88       // ext/mods/gameserver/model/actor/instance/Monster.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #88 = NameAndType        #89:#90       // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #89 = Utf8               getStatus
   #90 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #91 = Methodref          #92.#85       // ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
   #92 = Class              #93           // ext/mods/gameserver/model/actor/status/AttackableStatus
   #93 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
   #94 = Methodref          #95.#85       // ext/mods/gameserver/model/manor/Seed.getLevel:()I
   #95 = Class              #96           // ext/mods/gameserver/model/manor/Seed
   #96 = Utf8               ext/mods/gameserver/model/manor/Seed
   #97 = Class              #98           // ext/mods/gameserver/model/holder/IntIntHolder
   #98 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #99 = Methodref          #95.#100      // ext/mods/gameserver/model/manor/Seed.getCropId:()I
  #100 = NameAndType        #101:#26      // getCropId:()I
  #101 = Utf8               getCropId
  #102 = Fieldref           #103.#104     // ext/mods/Config.RATE_DROP_MANOR:I
  #103 = Class              #105          // ext/mods/Config
  #104 = NameAndType        #106:#16      // RATE_DROP_MANOR:I
  #105 = Utf8               ext/mods/Config
  #106 = Utf8               RATE_DROP_MANOR
  #107 = Methodref          #97.#108      // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #108 = NameAndType        #5:#109       // "<init>":(II)V
  #109 = Utf8               (II)V
  #110 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)V
  #111 = Utf8               Code
  #112 = Utf8               LineNumberTable
  #113 = Utf8               LocalVariableTable
  #114 = Utf8               this
  #115 = Utf8               Lext/mods/gameserver/model/actor/container/monster/SeedState;
  #116 = Utf8               owner
  #117 = Utf8               isSeeded
  #118 = Utf8               StackMapTable
  #119 = Utf8               getSeed
  #120 = Utf8               ()Lext/mods/gameserver/model/manor/Seed;
  #121 = Utf8               setSeeded
  #122 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/manor/Seed;)V
  #123 = Utf8               player
  #124 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #125 = Utf8               seed
  #126 = Utf8               isHarvested
  #127 = Utf8               setHarvested
  #128 = Utf8               isAllowedToHarvest
  #129 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #130 = Utf8               seeder
  #131 = Utf8               getHarvestedCrop
  #132 = Utf8               ()Lext/mods/gameserver/model/holder/IntIntHolder;
  #133 = Utf8               skill
  #134 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #135 = Utf8               count
  #136 = Utf8               diff
  #137 = Utf8               clear
  #138 = Utf8               SourceFile
  #139 = Utf8               SeedState.java
{
  public ext.mods.gameserver.model.actor.container.monster.SeedState(ext.mods.gameserver.model.actor.instance.Monster);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Monster;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/instance/Monster;
         9: return
      LineNumberTable:
        line 42: 0
        line 43: 4
        line 44: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/monster/SeedState;
            0      10     1 owner   Lext/mods/gameserver/model/actor/instance/Monster;

  public boolean isSeeded();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _seederId:I
         4: ifeq          11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 48: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/container/monster/SeedState;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.manor.Seed getSeed();
    descriptor: ()Lext/mods/gameserver/model/manor/Seed;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _seed:Lext/mods/gameserver/model/manor/Seed;
         4: areturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/monster/SeedState;

  public void setSeeded(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.manor.Seed);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/manor/Seed;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         5: putfield      #13                 // Field _seederId:I
         8: aload_0
         9: aload_2
        10: putfield      #17                 // Field _seed:Lext/mods/gameserver/model/manor/Seed;
        13: return
      LineNumberTable:
        line 63: 0
        line 64: 8
        line 65: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/container/monster/SeedState;
            0      14     1 player   Lext/mods/gameserver/model/actor/Player;
            0      14     2  seed   Lext/mods/gameserver/model/manor/Seed;

  public boolean isHarvested();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _isHarvested:Z
         4: ireturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/monster/SeedState;

  public void setHarvested();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #27                 // Field _isHarvested:Z
         5: return
      LineNumberTable:
        line 74: 0
        line 75: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/monster/SeedState;

  public boolean isAllowedToHarvest(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_1
         7: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        10: aload_0
        11: getfield      #13                 // Field _seederId:I
        14: if_icmpne     19
        17: iconst_1
        18: ireturn
        19: invokestatic  #31                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        22: aload_0
        23: getfield      #13                 // Field _seederId:I
        26: invokevirtual #37                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        29: astore_2
        30: aload_2
        31: ifnull        41
        34: aload_2
        35: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        38: ifnonnull     43
        41: iconst_0
        42: ireturn
        43: aload_2
        44: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        47: aload_1
        48: invokevirtual #45                 // Method ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
        51: ireturn
      LineNumberTable:
        line 83: 0
        line 84: 4
        line 86: 6
        line 87: 17
        line 89: 19
        line 90: 30
        line 91: 41
        line 93: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/actor/container/monster/SeedState;
            0      52     1 player   Lext/mods/gameserver/model/actor/Player;
           30      22     2 seeder   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 6 /* same */
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 1 /* same */

  public ext.mods.gameserver.model.holder.IntIntHolder getHarvestedCrop();
    descriptor: ()Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=1
         0: iconst_1
         1: istore_1
         2: aload_0
         3: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/instance/Monster;
         6: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/instance/Monster.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         9: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getPassives:()Ljava/util/List;
        12: invokeinterface #63,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        17: astore_2
        18: aload_2
        19: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          156
        27: aload_2
        28: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #79                 // class ext/mods/gameserver/skills/L2Skill
        36: astore_3
        37: aload_3
        38: invokevirtual #81                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        41: sipush        4408
        44: if_icmpne     153
        47: aload_3
        48: invokevirtual #84                 // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        51: tableswitch   { // 10 to 17

                      10: 96

                      11: 103

                      12: 110

                      13: 117

                      14: 124

                      15: 132

                      16: 140

                      17: 148
                 default: 153
            }
        96: iload_1
        97: iconst_2
        98: imul
        99: istore_1
       100: goto          153
       103: iload_1
       104: iconst_3
       105: imul
       106: istore_1
       107: goto          153
       110: iload_1
       111: iconst_4
       112: imul
       113: istore_1
       114: goto          153
       117: iload_1
       118: iconst_5
       119: imul
       120: istore_1
       121: goto          153
       124: iload_1
       125: bipush        6
       127: imul
       128: istore_1
       129: goto          153
       132: iload_1
       133: bipush        7
       135: imul
       136: istore_1
       137: goto          153
       140: iload_1
       141: bipush        8
       143: imul
       144: istore_1
       145: goto          153
       148: iload_1
       149: bipush        9
       151: imul
       152: istore_1
       153: goto          18
       156: aload_0
       157: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/instance/Monster;
       160: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/instance/Monster.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       163: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       166: aload_0
       167: getfield      #17                 // Field _seed:Lext/mods/gameserver/model/manor/Seed;
       170: invokevirtual #94                 // Method ext/mods/gameserver/model/manor/Seed.getLevel:()I
       173: isub
       174: iconst_5
       175: isub
       176: istore_2
       177: iload_2
       178: ifle          185
       181: iload_1
       182: iload_2
       183: iadd
       184: istore_1
       185: new           #97                 // class ext/mods/gameserver/model/holder/IntIntHolder
       188: dup
       189: aload_0
       190: getfield      #17                 // Field _seed:Lext/mods/gameserver/model/manor/Seed;
       193: invokevirtual #99                 // Method ext/mods/gameserver/model/manor/Seed.getCropId:()I
       196: iload_1
       197: getstatic     #102                // Field ext/mods/Config.RATE_DROP_MANOR:I
       200: imul
       201: invokespecial #107                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
       204: areturn
      LineNumberTable:
        line 101: 0
        line 102: 2
        line 104: 37
        line 106: 47
        line 109: 96
        line 110: 100
        line 112: 103
        line 113: 107
        line 115: 110
        line 116: 114
        line 118: 117
        line 119: 121
        line 121: 124
        line 122: 129
        line 124: 132
        line 125: 137
        line 127: 140
        line 128: 145
        line 130: 148
        line 134: 153
        line 136: 156
        line 137: 177
        line 138: 181
        line 140: 185
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37     116     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0     205     0  this   Lext/mods/gameserver/model/actor/container/monster/SeedState;
            2     203     1 count   I
          177      28     2  diff   I
      StackMapTable: number_of_entries = 12
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 77
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ int ]

  public void clear();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #13                 // Field _seederId:I
         5: aload_0
         6: aconst_null
         7: putfield      #17                 // Field _seed:Lext/mods/gameserver/model/manor/Seed;
        10: aload_0
        11: iconst_0
        12: putfield      #27                 // Field _isHarvested:Z
        15: return
      LineNumberTable:
        line 148: 0
        line 149: 5
        line 150: 10
        line 151: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/container/monster/SeedState;
}
SourceFile: "SeedState.java"
