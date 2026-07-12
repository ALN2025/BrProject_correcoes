// Bytecode for: ext.mods.gameserver.model.actor.status.BoatStatus
// File: ext\mods\gameserver\model\actor\status\BoatStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/status/BoatStatus.class
  Last modified 9 de jul de 2026; size 1078 bytes
  MD5 checksum ce07d765e2466cb3d44151fd03da7cd6
  Compiled from "BoatStatus.java"
public class ext.mods.gameserver.model.actor.status.BoatStatus extends ext.mods.gameserver.model.actor.status.CreatureStatus<ext.mods.gameserver.model.actor.Boat>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/status/BoatStatus
  super_class: #2                         // ext/mods/gameserver/model/actor/status/CreatureStatus
  interfaces: 0, fields: 2, methods: 5, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/status/CreatureStatus."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/status/CreatureStatus
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/status/BoatStatus._moveSpeed:I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/status/BoatStatus
   #9 = NameAndType        #11:#12        // _moveSpeed:I
  #10 = Utf8               ext/mods/gameserver/model/actor/status/BoatStatus
  #11 = Utf8               _moveSpeed
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/actor/status/BoatStatus._rotationSpeed:I
  #14 = NameAndType        #15:#12        // _rotationSpeed:I
  #15 = Utf8               _rotationSpeed
  #16 = Utf8               (Lext/mods/gameserver/model/actor/Boat;)V
  #17 = Utf8               Code
  #18 = Utf8               LineNumberTable
  #19 = Utf8               LocalVariableTable
  #20 = Utf8               this
  #21 = Utf8               Lext/mods/gameserver/model/actor/status/BoatStatus;
  #22 = Utf8               actor
  #23 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #24 = Utf8               getMoveSpeed
  #25 = Utf8               ()F
  #26 = Utf8               setMoveSpeed
  #27 = Utf8               (I)V
  #28 = Utf8               speed
  #29 = Utf8               getRotationSpeed
  #30 = Utf8               ()I
  #31 = Utf8               setRotationSpeed
  #32 = Utf8               Signature
  #33 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus<Lext/mods/gameserver/model/actor/Boat;>;
  #34 = Utf8               SourceFile
  #35 = Utf8               BoatStatus.java
{
  public ext.mods.gameserver.model.actor.status.BoatStatus(ext.mods.gameserver.model.actor.Boat);
    descriptor: (Lext/mods/gameserver/model/actor/Boat;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/status/CreatureStatus."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: return
      LineNumberTable:
        line 29: 0
        line 30: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/BoatStatus;
            0       6     1 actor   Lext/mods/gameserver/model/actor/Boat;

  public float getMoveSpeed();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _moveSpeed:I
         4: i2f
         5: freturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/BoatStatus;

  public final void setMoveSpeed(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _moveSpeed:I
         5: return
      LineNumberTable:
        line 40: 0
        line 41: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/BoatStatus;
            0       6     1 speed   I

  public final int getRotationSpeed();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _rotationSpeed:I
         4: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/BoatStatus;

  public final void setRotationSpeed(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _rotationSpeed:I
         5: return
      LineNumberTable:
        line 50: 0
        line 51: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/BoatStatus;
            0       6     1 speed   I
}
Signature: #33                          // Lext/mods/gameserver/model/actor/status/CreatureStatus<Lext/mods/gameserver/model/actor/Boat;>;
SourceFile: "BoatStatus.java"
