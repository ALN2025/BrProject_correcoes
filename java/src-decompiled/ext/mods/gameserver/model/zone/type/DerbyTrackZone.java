// Bytecode for: ext.mods.gameserver.model.zone.type.DerbyTrackZone
// File: ext\mods\gameserver\model\zone\type\DerbyTrackZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/DerbyTrackZone.class
  Last modified 9 de jul de 2026; size 1132 bytes
  MD5 checksum 1588dc3a58ce329d1e25a8aca6965ab2
  Compiled from "DerbyTrackZone.java"
public class ext.mods.gameserver.model.zone.type.DerbyTrackZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #25                         // ext/mods/gameserver/model/zone/type/DerbyTrackZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #3 = NameAndType        #5:#6          // "<init>":(I)V
   #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #5 = Utf8               <init>
   #6 = Utf8               (I)V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Playable
   #8 = Utf8               ext/mods/gameserver/model/actor/Playable
   #9 = Fieldref           #10.#11        // ext/mods/gameserver/enums/ZoneId.MONSTER_TRACK:Lext/mods/gameserver/enums/ZoneId;
  #10 = Class              #12            // ext/mods/gameserver/enums/ZoneId
  #11 = NameAndType        #13:#14        // MONSTER_TRACK:Lext/mods/gameserver/enums/ZoneId;
  #12 = Utf8               ext/mods/gameserver/enums/ZoneId
  #13 = Utf8               MONSTER_TRACK
  #14 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #15 = Methodref          #7.#16         // ext/mods/gameserver/model/actor/Playable.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #16 = NameAndType        #17:#18        // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #17 = Utf8               setInsideZone
  #18 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #19 = Fieldref           #10.#20        // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #20 = NameAndType        #21:#14        // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #21 = Utf8               PEACE
  #22 = Fieldref           #10.#23        // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #23 = NameAndType        #24:#14        // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #24 = Utf8               NO_SUMMON_FRIEND
  #25 = Class              #26            // ext/mods/gameserver/model/zone/type/DerbyTrackZone
  #26 = Utf8               ext/mods/gameserver/model/zone/type/DerbyTrackZone
  #27 = Utf8               Code
  #28 = Utf8               LineNumberTable
  #29 = Utf8               LocalVariableTable
  #30 = Utf8               this
  #31 = Utf8               Lext/mods/gameserver/model/zone/type/DerbyTrackZone;
  #32 = Utf8               id
  #33 = Utf8               I
  #34 = Utf8               onEnter
  #35 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #36 = Utf8               playable
  #37 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #38 = Utf8               creature
  #39 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #40 = Utf8               StackMapTable
  #41 = Utf8               onExit
  #42 = Utf8               SourceFile
  #43 = Utf8               DerbyTrackZone.java
{
  public ext.mods.gameserver.model.zone.type.DerbyTrackZone(int);
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
            0       6     0  this   Lext/mods/gameserver/model/zone/type/DerbyTrackZone;
            0       6     1    id   I

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Playable
         4: ifeq          36
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Playable
        11: astore_2
        12: aload_2
        13: getstatic     #9                  // Field ext/mods/gameserver/enums/ZoneId.MONSTER_TRACK:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_1
        17: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Playable.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: aload_2
        21: getstatic     #19                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        24: iconst_1
        25: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Playable.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        28: aload_2
        29: getstatic     #22                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        32: iconst_1
        33: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Playable.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        36: return
      LineNumberTable:
        line 40: 0
        line 42: 12
        line 43: 20
        line 44: 28
        line 46: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      24     2 playable   Lext/mods/gameserver/model/actor/Playable;
            0      37     0  this   Lext/mods/gameserver/model/zone/type/DerbyTrackZone;
            0      37     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 36 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Playable
         4: ifeq          36
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Playable
        11: astore_2
        12: aload_2
        13: getstatic     #9                  // Field ext/mods/gameserver/enums/ZoneId.MONSTER_TRACK:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_0
        17: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Playable.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: aload_2
        21: getstatic     #19                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        24: iconst_0
        25: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Playable.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        28: aload_2
        29: getstatic     #22                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        32: iconst_0
        33: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Playable.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        36: return
      LineNumberTable:
        line 51: 0
        line 53: 12
        line 54: 20
        line 55: 28
        line 57: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      24     2 playable   Lext/mods/gameserver/model/actor/Playable;
            0      37     0  this   Lext/mods/gameserver/model/zone/type/DerbyTrackZone;
            0      37     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 36 /* same */
}
SourceFile: "DerbyTrackZone.java"
