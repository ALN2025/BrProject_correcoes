// Bytecode for: ext.mods.gameserver.model.actor.container.monster.OverhitState
// File: ext\mods\gameserver\model\actor\container\monster\OverhitState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/monster/OverhitState.class
  Last modified 9 de jul de 2026; size 2104 bytes
  MD5 checksum 2e199fefd6468245cb88421e310548f0
  Compiled from "OverhitState.java"
public class ext.mods.gameserver.model.actor.container.monster.OverhitState
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/monster/OverhitState
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/container/monster/OverhitState._owner:Lext/mods/gameserver/model/actor/instance/Monster;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/container/monster/OverhitState
   #9 = NameAndType        #11:#12        // _owner:Lext/mods/gameserver/model/actor/instance/Monster;
  #10 = Utf8               ext/mods/gameserver/model/actor/container/monster/OverhitState
  #11 = Utf8               _owner
  #12 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/actor/container/monster/OverhitState._isOverhit:Z
  #14 = NameAndType        #15:#16        // _isOverhit:Z
  #15 = Utf8               _isOverhit
  #16 = Utf8               Z
  #17 = Methodref          #18.#19        // ext/mods/gameserver/model/actor/instance/Monster.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #18 = Class              #20            // ext/mods/gameserver/model/actor/instance/Monster
  #19 = NameAndType        #21:#22        // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #20 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #21 = Utf8               getStatus
  #22 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #23 = Methodref          #24.#25        // ext/mods/gameserver/model/actor/status/AttackableStatus.getHp:()D
  #24 = Class              #26            // ext/mods/gameserver/model/actor/status/AttackableStatus
  #25 = NameAndType        #27:#28        // getHp:()D
  #26 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
  #27 = Utf8               getHp
  #28 = Utf8               ()D
  #29 = Double             -1.0d
  #31 = Fieldref           #8.#32         // ext/mods/gameserver/model/actor/container/monster/OverhitState._overhitDamage:D
  #32 = NameAndType        #33:#34        // _overhitDamage:D
  #33 = Utf8               _overhitDamage
  #34 = Utf8               D
  #35 = Fieldref           #8.#36         // ext/mods/gameserver/model/actor/container/monster/OverhitState._overhitAttacker:Lext/mods/gameserver/model/actor/Creature;
  #36 = NameAndType        #37:#38        // _overhitAttacker:Lext/mods/gameserver/model/actor/Creature;
  #37 = Utf8               _overhitAttacker
  #38 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #39 = Double             100.0d
  #41 = Methodref          #24.#42        // ext/mods/gameserver/model/actor/status/AttackableStatus.getMaxHp:()I
  #42 = NameAndType        #43:#44        // getMaxHp:()I
  #43 = Utf8               getMaxHp
  #44 = Utf8               ()I
  #45 = Double             25.0d
  #47 = Methodref          #48.#49        // java/lang/Math.round:(D)J
  #48 = Class              #50            // java/lang/Math
  #49 = NameAndType        #51:#52        // round:(D)J
  #50 = Utf8               java/lang/Math
  #51 = Utf8               round
  #52 = Utf8               (D)J
  #53 = Methodref          #54.#55        // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #54 = Class              #56            // ext/mods/gameserver/model/actor/Creature
  #55 = NameAndType        #57:#58        // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #56 = Utf8               ext/mods/gameserver/model/actor/Creature
  #57 = Utf8               getActingPlayer
  #58 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #59 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)V
  #60 = Utf8               Code
  #61 = Utf8               LineNumberTable
  #62 = Utf8               LocalVariableTable
  #63 = Utf8               this
  #64 = Utf8               Lext/mods/gameserver/model/actor/container/monster/OverhitState;
  #65 = Utf8               owner
  #66 = Utf8               set
  #67 = Utf8               (Z)V
  #68 = Utf8               status
  #69 = Utf8               test
  #70 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #71 = Utf8               attacker
  #72 = Utf8               damage
  #73 = Utf8               overhitDamage
  #74 = Utf8               StackMapTable
  #75 = Utf8               clear
  #76 = Utf8               calculateOverhitExp
  #77 = Utf8               (J)J
  #78 = Utf8               normalExp
  #79 = Utf8               J
  #80 = Utf8               overhitPercentage
  #81 = Utf8               overhitExp
  #82 = Utf8               isValidOverhit
  #83 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #84 = Utf8               player
  #85 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #86 = Utf8               SourceFile
  #87 = Utf8               OverhitState.java
{
  public ext.mods.gameserver.model.actor.container.monster.OverhitState(ext.mods.gameserver.model.actor.instance.Monster);
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
        line 38: 0
        line 39: 4
        line 40: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/monster/OverhitState;
            0      10     1 owner   Lext/mods/gameserver/model/actor/instance/Monster;

  public void set(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _isOverhit:Z
         5: return
      LineNumberTable:
        line 48: 0
        line 49: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/monster/OverhitState;
            0       6     1 status   Z

  public void test(ext.mods.gameserver.model.actor.Creature, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=3
         0: aload_0
         1: getfield      #13                 // Field _isOverhit:Z
         4: ifne          8
         7: return
         8: dload_2
         9: dconst_0
        10: dcmpg
        11: ifgt          20
        14: aload_0
        15: iconst_0
        16: putfield      #13                 // Field _isOverhit:Z
        19: return
        20: aload_0
        21: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/instance/Monster;
        24: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/instance/Monster.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        27: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getHp:()D
        30: dload_2
        31: dsub
        32: ldc2_w        #29                 // double -1.0d
        35: dmul
        36: dstore        4
        38: dload         4
        40: dconst_0
        41: dcmpg
        42: ifge          51
        45: aload_0
        46: iconst_0
        47: putfield      #13                 // Field _isOverhit:Z
        50: return
        51: aload_0
        52: dload         4
        54: putfield      #31                 // Field _overhitDamage:D
        57: aload_0
        58: aload_1
        59: putfield      #35                 // Field _overhitAttacker:Lext/mods/gameserver/model/actor/Creature;
        62: return
      LineNumberTable:
        line 58: 0
        line 59: 7
        line 61: 8
        line 63: 14
        line 64: 19
        line 67: 20
        line 69: 38
        line 71: 45
        line 72: 50
        line 75: 51
        line 76: 57
        line 77: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/actor/container/monster/OverhitState;
            0      63     1 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      63     2 damage   D
           38      25     4 overhitDamage   D
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ double ]

  public void clear();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #13                 // Field _isOverhit:Z
         5: aload_0
         6: dconst_0
         7: putfield      #31                 // Field _overhitDamage:D
        10: aload_0
        11: aconst_null
        12: putfield      #35                 // Field _overhitAttacker:Lext/mods/gameserver/model/actor/Creature;
        15: return
      LineNumberTable:
        line 84: 0
        line 85: 5
        line 86: 10
        line 87: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/container/monster/OverhitState;

  public long calculateOverhitExp(long);
    descriptor: (J)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: getfield      #31                 // Field _overhitDamage:D
         4: ldc2_w        #39                 // double 100.0d
         7: dmul
         8: aload_0
         9: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/instance/Monster;
        12: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/instance/Monster.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        15: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getMaxHp:()I
        18: i2d
        19: ddiv
        20: dstore_3
        21: dload_3
        22: ldc2_w        #45                 // double 25.0d
        25: dcmpl
        26: ifle          33
        29: ldc2_w        #45                 // double 25.0d
        32: dstore_3
        33: dload_3
        34: ldc2_w        #39                 // double 100.0d
        37: ddiv
        38: lload_1
        39: l2d
        40: dmul
        41: dstore        5
        43: dload         5
        45: invokestatic  #47                 // Method java/lang/Math.round:(D)J
        48: lreturn
      LineNumberTable:
        line 96: 0
        line 98: 21
        line 99: 29
        line 101: 33
        line 103: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/actor/container/monster/OverhitState;
            0      49     1 normalExp   J
           21      28     3 overhitPercentage   D
           43       6     5 overhitExp   D
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ double ]

  public boolean isValidOverhit(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _isOverhit:Z
         4: ifeq          39
         7: aload_0
         8: getfield      #35                 // Field _overhitAttacker:Lext/mods/gameserver/model/actor/Creature;
        11: ifnull        39
        14: aload_0
        15: getfield      #35                 // Field _overhitAttacker:Lext/mods/gameserver/model/actor/Creature;
        18: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        21: ifnull        39
        24: aload_1
        25: aload_0
        26: getfield      #35                 // Field _overhitAttacker:Lext/mods/gameserver/model/actor/Creature;
        29: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        32: if_acmpne     39
        35: iconst_1
        36: goto          40
        39: iconst_0
        40: ireturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/container/monster/OverhitState;
            0      41     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 39 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "OverhitState.java"
