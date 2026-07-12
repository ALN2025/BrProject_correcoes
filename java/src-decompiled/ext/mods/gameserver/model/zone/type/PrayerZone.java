// Bytecode for: ext.mods.gameserver.model.zone.type.PrayerZone
// File: ext\mods\gameserver\model\zone\type\PrayerZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/PrayerZone.class
  Last modified 9 de jul de 2026; size 886 bytes
  MD5 checksum eeee0c09cefa36dcaeee12e06961b151
  Compiled from "PrayerZone.java"
public class ext.mods.gameserver.model.zone.type.PrayerZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #19                         // ext/mods/gameserver/model/zone/type/PrayerZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #3 = NameAndType        #5:#6          // "<init>":(I)V
   #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #5 = Utf8               <init>
   #6 = Utf8               (I)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/ZoneId.CAST_ON_ARTIFACT:Lext/mods/gameserver/enums/ZoneId;
   #8 = Class              #10            // ext/mods/gameserver/enums/ZoneId
   #9 = NameAndType        #11:#12        // CAST_ON_ARTIFACT:Lext/mods/gameserver/enums/ZoneId;
  #10 = Utf8               ext/mods/gameserver/enums/ZoneId
  #11 = Utf8               CAST_ON_ARTIFACT
  #12 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #14 = Class              #16            // ext/mods/gameserver/model/actor/Creature
  #15 = NameAndType        #17:#18        // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #16 = Utf8               ext/mods/gameserver/model/actor/Creature
  #17 = Utf8               setInsideZone
  #18 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #19 = Class              #20            // ext/mods/gameserver/model/zone/type/PrayerZone
  #20 = Utf8               ext/mods/gameserver/model/zone/type/PrayerZone
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lext/mods/gameserver/model/zone/type/PrayerZone;
  #26 = Utf8               id
  #27 = Utf8               I
  #28 = Utf8               onEnter
  #29 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #30 = Utf8               creature
  #31 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #32 = Utf8               onExit
  #33 = Utf8               SourceFile
  #34 = Utf8               PrayerZone.java
{
  public ext.mods.gameserver.model.zone.type.PrayerZone(int);
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
            0       6     0  this   Lext/mods/gameserver/model/zone/type/PrayerZone;
            0       6     1    id   I

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: getstatic     #7                  // Field ext/mods/gameserver/enums/ZoneId.CAST_ON_ARTIFACT:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_1
         5: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: return
      LineNumberTable:
        line 39: 0
        line 40: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/zone/type/PrayerZone;
            0       9     1 creature   Lext/mods/gameserver/model/actor/Creature;

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: getstatic     #7                  // Field ext/mods/gameserver/enums/ZoneId.CAST_ON_ARTIFACT:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_0
         5: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: return
      LineNumberTable:
        line 45: 0
        line 46: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/zone/type/PrayerZone;
            0       9     1 creature   Lext/mods/gameserver/model/actor/Creature;
}
SourceFile: "PrayerZone.java"
