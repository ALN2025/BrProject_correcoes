// Bytecode for: ext.mods.gameserver.model.zone.type.SwampZone
// File: ext\mods\gameserver\model\zone\type\SwampZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/SwampZone.class
  Last modified 9 de jul de 2026; size 1966 bytes
  MD5 checksum 7db2eb407da3cdc668393079b4f4a6da
  Compiled from "SwampZone.java"
public class ext.mods.gameserver.model.zone.type.SwampZone extends ext.mods.gameserver.model.zone.type.subtype.CastleZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/type/SwampZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
  interfaces: 0, fields: 1, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType."<init>":(I)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
   #3 = NameAndType        #5:#6          // "<init>":(I)V
   #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
   #5 = Utf8               <init>
   #6 = Utf8               (I)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/zone/type/SwampZone._moveBonus:I
   #8 = Class              #10            // ext/mods/gameserver/model/zone/type/SwampZone
   #9 = NameAndType        #11:#12        // _moveBonus:I
  #10 = Utf8               ext/mods/gameserver/model/zone/type/SwampZone
  #11 = Utf8               _moveBonus
  #12 = Utf8               I
  #13 = String             #14            // move_bonus
  #14 = Utf8               move_bonus
  #15 = Methodref          #16.#17        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #16 = Class              #18            // java/lang/String
  #17 = NameAndType        #19:#20        // equals:(Ljava/lang/Object;)Z
  #18 = Utf8               java/lang/String
  #19 = Utf8               equals
  #20 = Utf8               (Ljava/lang/Object;)Z
  #21 = Methodref          #22.#23        // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #22 = Class              #24            // java/lang/Integer
  #23 = NameAndType        #25:#26        // parseInt:(Ljava/lang/String;)I
  #24 = Utf8               java/lang/Integer
  #25 = Utf8               parseInt
  #26 = Utf8               (Ljava/lang/String;)I
  #27 = Methodref          #2.#28         // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #28 = NameAndType        #29:#30        // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #29 = Utf8               setParameter
  #30 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #31 = Methodref          #8.#32         // ext/mods/gameserver/model/zone/type/SwampZone.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #32 = NameAndType        #33:#34        // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #33 = Utf8               getCastle
  #34 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #35 = Methodref          #8.#36         // ext/mods/gameserver/model/zone/type/SwampZone.isEnabled:()Z
  #36 = NameAndType        #37:#38        // isEnabled:()Z
  #37 = Utf8               isEnabled
  #38 = Utf8               ()Z
  #39 = Methodref          #40.#41        // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #40 = Class              #42            // ext/mods/gameserver/model/residence/castle/Castle
  #41 = NameAndType        #43:#44        // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #42 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #43 = Utf8               getSiege
  #44 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #45 = Methodref          #46.#47        // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
  #46 = Class              #48            // ext/mods/gameserver/model/residence/castle/Siege
  #47 = NameAndType        #49:#38        // isInProgress:()Z
  #48 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #49 = Utf8               isInProgress
  #50 = Fieldref           #51.#52        // ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
  #51 = Class              #53            // ext/mods/gameserver/enums/ZoneId
  #52 = NameAndType        #54:#55        // SWAMP:Lext/mods/gameserver/enums/ZoneId;
  #53 = Utf8               ext/mods/gameserver/enums/ZoneId
  #54 = Utf8               SWAMP
  #55 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #56 = Methodref          #57.#58        // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #57 = Class              #59            // ext/mods/gameserver/model/actor/Creature
  #58 = NameAndType        #60:#61        // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #59 = Utf8               ext/mods/gameserver/model/actor/Creature
  #60 = Utf8               setInsideZone
  #61 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #62 = Class              #63            // ext/mods/gameserver/model/actor/Player
  #63 = Utf8               ext/mods/gameserver/model/actor/Player
  #64 = Methodref          #62.#65        // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #65 = NameAndType        #66:#67        // broadcastUserInfo:()V
  #66 = Utf8               broadcastUserInfo
  #67 = Utf8               ()V
  #68 = Utf8               Code
  #69 = Utf8               LineNumberTable
  #70 = Utf8               LocalVariableTable
  #71 = Utf8               this
  #72 = Utf8               Lext/mods/gameserver/model/zone/type/SwampZone;
  #73 = Utf8               id
  #74 = Utf8               name
  #75 = Utf8               Ljava/lang/String;
  #76 = Utf8               value
  #77 = Utf8               StackMapTable
  #78 = Utf8               onEnter
  #79 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #80 = Utf8               player
  #81 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #82 = Utf8               creature
  #83 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #84 = Utf8               onExit
  #85 = Utf8               getMoveBonus
  #86 = Utf8               ()I
  #87 = Utf8               SourceFile
  #88 = Utf8               SwampZone.java
{
  public ext.mods.gameserver.model.zone.type.SwampZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/CastleZoneType."<init>":(I)V
         5: aload_0
         6: bipush        -50
         8: putfield      #7                  // Field _moveBonus:I
        11: return
      LineNumberTable:
        line 36: 0
        line 32: 5
        line 37: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/zone/type/SwampZone;
            0      12     1    id   I

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #13                 // String move_bonus
         3: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          20
         9: aload_0
        10: aload_2
        11: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        14: putfield      #7                  // Field _moveBonus:I
        17: goto          26
        20: aload_0
        21: aload_1
        22: aload_2
        23: invokespecial #27                 // Method ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
        26: return
      LineNumberTable:
        line 42: 0
        line 43: 9
        line 45: 20
        line 46: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/zone/type/SwampZone;
            0      27     1  name   Ljava/lang/String;
            0      27     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 5 /* same */

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #31                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
         4: ifnull        28
         7: aload_0
         8: invokevirtual #35                 // Method isEnabled:()Z
        11: ifeq          27
        14: aload_0
        15: invokevirtual #31                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        18: invokevirtual #39                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        21: invokevirtual #45                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        24: ifne          28
        27: return
        28: aload_1
        29: getstatic     #50                 // Field ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
        32: iconst_1
        33: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        36: aload_1
        37: instanceof    #62                 // class ext/mods/gameserver/model/actor/Player
        40: ifeq          52
        43: aload_1
        44: checkcast     #62                 // class ext/mods/gameserver/model/actor/Player
        47: astore_2
        48: aload_2
        49: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        52: return
      LineNumberTable:
        line 51: 0
        line 52: 27
        line 54: 28
        line 55: 36
        line 56: 48
        line 57: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48       4     2 player   Lext/mods/gameserver/model/actor/Player;
            0      53     0  this   Lext/mods/gameserver/model/zone/type/SwampZone;
            0      53     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 27 /* same */
        frame_type = 0 /* same */
        frame_type = 23 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: getstatic     #50                 // Field ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_0
         5: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: aload_1
         9: instanceof    #62                 // class ext/mods/gameserver/model/actor/Player
        12: ifeq          24
        15: aload_1
        16: checkcast     #62                 // class ext/mods/gameserver/model/actor/Player
        19: astore_2
        20: aload_2
        21: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        24: return
      LineNumberTable:
        line 62: 0
        line 63: 8
        line 64: 20
        line 65: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20       4     2 player   Lext/mods/gameserver/model/actor/Player;
            0      25     0  this   Lext/mods/gameserver/model/zone/type/SwampZone;
            0      25     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public int getMoveBonus();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _moveBonus:I
         4: ireturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/SwampZone;
}
SourceFile: "SwampZone.java"
