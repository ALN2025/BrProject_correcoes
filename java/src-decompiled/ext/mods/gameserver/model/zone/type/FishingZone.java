// Bytecode for: ext.mods.gameserver.model.zone.type.FishingZone
// File: ext\mods\gameserver\model\zone\type\FishingZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/FishingZone.class
  Last modified 9 de jul de 2026; size 862 bytes
  MD5 checksum ac4adbb2e830ee813a9c5efb1b6044ca
  Compiled from "FishingZone.java"
public class ext.mods.gameserver.model.zone.type.FishingZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/type/FishingZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 0, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #3 = NameAndType        #5:#6          // "<init>":(I)V
   #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #5 = Utf8               <init>
   #6 = Utf8               (I)V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/zone/type/FishingZone.getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
   #8 = Class              #10            // ext/mods/gameserver/model/zone/type/FishingZone
   #9 = NameAndType        #11:#12        // getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
  #10 = Utf8               ext/mods/gameserver/model/zone/type/FishingZone
  #11 = Utf8               getZone
  #12 = Utf8               ()Lext/mods/gameserver/model/zone/ZoneForm;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/zone/ZoneForm.getHighZ:()I
  #14 = Class              #16            // ext/mods/gameserver/model/zone/ZoneForm
  #15 = NameAndType        #17:#18        // getHighZ:()I
  #16 = Utf8               ext/mods/gameserver/model/zone/ZoneForm
  #17 = Utf8               getHighZ
  #18 = Utf8               ()I
  #19 = Utf8               Code
  #20 = Utf8               LineNumberTable
  #21 = Utf8               LocalVariableTable
  #22 = Utf8               this
  #23 = Utf8               Lext/mods/gameserver/model/zone/type/FishingZone;
  #24 = Utf8               id
  #25 = Utf8               I
  #26 = Utf8               onEnter
  #27 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #28 = Utf8               creature
  #29 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #30 = Utf8               onExit
  #31 = Utf8               getWaterZ
  #32 = Utf8               SourceFile
  #33 = Utf8               FishingZone.java
{
  public ext.mods.gameserver.model.zone.type.FishingZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: return
      LineNumberTable:
        line 30: 0
        line 31: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/FishingZone;
            0       6     1    id   I

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/zone/type/FishingZone;
            0       1     1 creature   Lext/mods/gameserver/model/actor/Creature;

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/zone/type/FishingZone;
            0       1     1 creature   Lext/mods/gameserver/model/actor/Creature;

  public int getWaterZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
         4: invokevirtual #13                 // Method ext/mods/gameserver/model/zone/ZoneForm.getHighZ:()I
         7: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/zone/type/FishingZone;
}
SourceFile: "FishingZone.java"
