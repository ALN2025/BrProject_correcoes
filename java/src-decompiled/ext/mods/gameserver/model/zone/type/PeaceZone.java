// Bytecode for: ext.mods.gameserver.model.zone.type.PeaceZone
// File: ext\mods\gameserver\model\zone\type\PeaceZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/PeaceZone.class
  Last modified 9 de jul de 2026; size 1145 bytes
  MD5 checksum f34cbe6676767efac7d5f0291ce3bffd
  Compiled from "PeaceZone.java"
public class ext.mods.gameserver.model.zone.type.PeaceZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #31                         // ext/mods/gameserver/model/zone/type/PeaceZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #3 = NameAndType        #5:#6          // "<init>":(I)V
   #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #5 = Utf8               <init>
   #6 = Utf8               (I)V
   #7 = Fieldref           #8.#9          // ext/mods/Config.ZONE_TOWN:I
   #8 = Class              #10            // ext/mods/Config
   #9 = NameAndType        #11:#12        // ZONE_TOWN:I
  #10 = Utf8               ext/mods/Config
  #11 = Utf8               ZONE_TOWN
  #12 = Utf8               I
  #13 = Class              #14            // ext/mods/gameserver/model/actor/Player
  #14 = Utf8               ext/mods/gameserver/model/actor/Player
  #15 = Methodref          #13.#16        // ext/mods/gameserver/model/actor/Player.getSiegeState:()I
  #16 = NameAndType        #17:#18        // getSiegeState:()I
  #17 = Utf8               getSiegeState
  #18 = Utf8               ()I
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #20 = Class              #22            // ext/mods/gameserver/enums/ZoneId
  #21 = NameAndType        #23:#24        // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #22 = Utf8               ext/mods/gameserver/enums/ZoneId
  #23 = Utf8               PEACE
  #24 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #25 = Methodref          #26.#27        // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #26 = Class              #28            // ext/mods/gameserver/model/actor/Creature
  #27 = NameAndType        #29:#30        // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #28 = Utf8               ext/mods/gameserver/model/actor/Creature
  #29 = Utf8               setInsideZone
  #30 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #31 = Class              #32            // ext/mods/gameserver/model/zone/type/PeaceZone
  #32 = Utf8               ext/mods/gameserver/model/zone/type/PeaceZone
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               this
  #37 = Utf8               Lext/mods/gameserver/model/zone/type/PeaceZone;
  #38 = Utf8               id
  #39 = Utf8               onEnter
  #40 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #41 = Utf8               player
  #42 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #43 = Utf8               creature
  #44 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #45 = Utf8               StackMapTable
  #46 = Utf8               onExit
  #47 = Utf8               SourceFile
  #48 = Utf8               PeaceZone.java
{
  public ext.mods.gameserver.model.zone.type.PeaceZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: return
      LineNumberTable:
        line 33: 0
        line 34: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/PeaceZone;
            0       6     1    id   I

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: getstatic     #7                  // Field ext/mods/Config.ZONE_TOWN:I
         3: iconst_1
         4: if_icmpne     27
         7: aload_1
         8: instanceof    #13                 // class ext/mods/gameserver/model/actor/Player
        11: ifeq          27
        14: aload_1
        15: checkcast     #13                 // class ext/mods/gameserver/model/actor/Player
        18: astore_2
        19: aload_2
        20: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getSiegeState:()I
        23: ifeq          27
        26: return
        27: getstatic     #7                  // Field ext/mods/Config.ZONE_TOWN:I
        30: iconst_2
        31: if_icmpeq     42
        34: aload_1
        35: getstatic     #19                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        38: iconst_1
        39: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        42: return
      LineNumberTable:
        line 39: 0
        line 40: 26
        line 42: 27
        line 43: 34
        line 44: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19       8     2 player   Lext/mods/gameserver/model/actor/Player;
            0      43     0  this   Lext/mods/gameserver/model/zone/type/PeaceZone;
            0      43     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 27 /* same */
        frame_type = 14 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: getstatic     #7                  // Field ext/mods/Config.ZONE_TOWN:I
         3: iconst_2
         4: if_icmpeq     15
         7: aload_1
         8: getstatic     #19                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        11: iconst_0
        12: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        15: return
      LineNumberTable:
        line 49: 0
        line 50: 7
        line 51: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/zone/type/PeaceZone;
            0      16     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */
}
SourceFile: "PeaceZone.java"
