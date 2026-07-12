// Bytecode for: ext.mods.gameserver.model.zone.type.NoLandingZone
// File: ext\mods\gameserver\model\zone\type\NoLandingZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/NoLandingZone.class
  Last modified 9 de jul de 2026; size 1112 bytes
  MD5 checksum b1c97ab45807c767cd9071d35ea7263b
  Compiled from "NoLandingZone.java"
public class ext.mods.gameserver.model.zone.type.NoLandingZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #26                         // ext/mods/gameserver/model/zone/type/NoLandingZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #3 = NameAndType        #5:#6          // "<init>":(I)V
   #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #5 = Utf8               <init>
   #6 = Utf8               (I)V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Player
   #8 = Utf8               ext/mods/gameserver/model/actor/Player
   #9 = Fieldref           #10.#11        // ext/mods/gameserver/enums/ZoneId.NO_LANDING:Lext/mods/gameserver/enums/ZoneId;
  #10 = Class              #12            // ext/mods/gameserver/enums/ZoneId
  #11 = NameAndType        #13:#14        // NO_LANDING:Lext/mods/gameserver/enums/ZoneId;
  #12 = Utf8               ext/mods/gameserver/enums/ZoneId
  #13 = Utf8               NO_LANDING
  #14 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #15 = Methodref          #7.#16         // ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #16 = NameAndType        #17:#18        // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #17 = Utf8               setInsideZone
  #18 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #19 = Methodref          #7.#20         // ext/mods/gameserver/model/actor/Player.enterOnNoLandingZone:()V
  #20 = NameAndType        #21:#22        // enterOnNoLandingZone:()V
  #21 = Utf8               enterOnNoLandingZone
  #22 = Utf8               ()V
  #23 = Methodref          #7.#24         // ext/mods/gameserver/model/actor/Player.exitOnNoLandingZone:()V
  #24 = NameAndType        #25:#22        // exitOnNoLandingZone:()V
  #25 = Utf8               exitOnNoLandingZone
  #26 = Class              #27            // ext/mods/gameserver/model/zone/type/NoLandingZone
  #27 = Utf8               ext/mods/gameserver/model/zone/type/NoLandingZone
  #28 = Utf8               Code
  #29 = Utf8               LineNumberTable
  #30 = Utf8               LocalVariableTable
  #31 = Utf8               this
  #32 = Utf8               Lext/mods/gameserver/model/zone/type/NoLandingZone;
  #33 = Utf8               id
  #34 = Utf8               I
  #35 = Utf8               onEnter
  #36 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #37 = Utf8               player
  #38 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #39 = Utf8               creature
  #40 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #41 = Utf8               StackMapTable
  #42 = Utf8               onExit
  #43 = Utf8               SourceFile
  #44 = Utf8               NoLandingZone.java
{
  public ext.mods.gameserver.model.zone.type.NoLandingZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: return
      LineNumberTable:
        line 34: 0
        line 35: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/NoLandingZone;
            0       6     1    id   I

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          24
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #9                  // Field ext/mods/gameserver/enums/ZoneId.NO_LANDING:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_1
        17: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: aload_2
        21: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.enterOnNoLandingZone:()V
        24: return
      LineNumberTable:
        line 40: 0
        line 42: 12
        line 43: 20
        line 45: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      12     2 player   Lext/mods/gameserver/model/actor/Player;
            0      25     0  this   Lext/mods/gameserver/model/zone/type/NoLandingZone;
            0      25     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          24
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #9                  // Field ext/mods/gameserver/enums/ZoneId.NO_LANDING:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_0
        17: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: aload_2
        21: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.exitOnNoLandingZone:()V
        24: return
      LineNumberTable:
        line 50: 0
        line 52: 12
        line 53: 20
        line 55: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      12     2 player   Lext/mods/gameserver/model/actor/Player;
            0      25     0  this   Lext/mods/gameserver/model/zone/type/NoLandingZone;
            0      25     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */
}
SourceFile: "NoLandingZone.java"
