// Bytecode for: ext.mods.gameserver.model.zone.type.NoStoreZone
// File: ext\mods\gameserver\model\zone\type\NoStoreZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/NoStoreZone.class
  Last modified 9 de jul de 2026; size 1017 bytes
  MD5 checksum b32ecdf218b43f9558e89a75025456a7
  Compiled from "NoStoreZone.java"
public class ext.mods.gameserver.model.zone.type.NoStoreZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #19                         // ext/mods/gameserver/model/zone/type/NoStoreZone
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
   #9 = Fieldref           #10.#11        // ext/mods/gameserver/enums/ZoneId.NO_STORE:Lext/mods/gameserver/enums/ZoneId;
  #10 = Class              #12            // ext/mods/gameserver/enums/ZoneId
  #11 = NameAndType        #13:#14        // NO_STORE:Lext/mods/gameserver/enums/ZoneId;
  #12 = Utf8               ext/mods/gameserver/enums/ZoneId
  #13 = Utf8               NO_STORE
  #14 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #15 = Methodref          #7.#16         // ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #16 = NameAndType        #17:#18        // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #17 = Utf8               setInsideZone
  #18 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #19 = Class              #20            // ext/mods/gameserver/model/zone/type/NoStoreZone
  #20 = Utf8               ext/mods/gameserver/model/zone/type/NoStoreZone
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lext/mods/gameserver/model/zone/type/NoStoreZone;
  #26 = Utf8               id
  #27 = Utf8               I
  #28 = Utf8               onEnter
  #29 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #30 = Utf8               player
  #31 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #32 = Utf8               creature
  #33 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #34 = Utf8               StackMapTable
  #35 = Utf8               onExit
  #36 = Utf8               SourceFile
  #37 = Utf8               NoStoreZone.java
{
  public ext.mods.gameserver.model.zone.type.NoStoreZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: return
      LineNumberTable:
        line 32: 0
        line 33: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/NoStoreZone;
            0       6     1    id   I

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          20
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #9                  // Field ext/mods/gameserver/enums/ZoneId.NO_STORE:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_1
        17: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: return
      LineNumberTable:
        line 38: 0
        line 39: 12
        line 40: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12       8     2 player   Lext/mods/gameserver/model/actor/Player;
            0      21     0  this   Lext/mods/gameserver/model/zone/type/NoStoreZone;
            0      21     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 20 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          20
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #9                  // Field ext/mods/gameserver/enums/ZoneId.NO_STORE:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_0
        17: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: return
      LineNumberTable:
        line 45: 0
        line 46: 12
        line 47: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12       8     2 player   Lext/mods/gameserver/model/actor/Player;
            0      21     0  this   Lext/mods/gameserver/model/zone/type/NoStoreZone;
            0      21     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 20 /* same */
}
SourceFile: "NoStoreZone.java"
