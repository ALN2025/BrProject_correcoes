// Bytecode for: ext.mods.gameserver.model.actor.move.MovementIntegration$MovementPrediction
// File: ext\mods\gameserver\model\actor\move\MovementIntegration$MovementPrediction.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction.class
  Last modified 9 de jul de 2026; size 1306 bytes
  MD5 checksum bf11ebfc0076a15188ddbd4884b0636f
  Compiled from "MovementIntegration.java"
class ext.mods.gameserver.model.actor.move.MovementIntegration$MovementPrediction
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 5, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction._startPosition:Lext/mods/gameserver/model/location/Location;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction
   #9 = NameAndType        #11:#12        // _startPosition:Lext/mods/gameserver/model/location/Location;
  #10 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction
  #11 = Utf8               _startPosition
  #12 = Utf8               Lext/mods/gameserver/model/location/Location;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction._destination:Lext/mods/gameserver/model/location/Location;
  #14 = NameAndType        #15:#12        // _destination:Lext/mods/gameserver/model/location/Location;
  #15 = Utf8               _destination
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction._startTime:J
  #17 = NameAndType        #18:#19        // _startTime:J
  #18 = Utf8               _startTime
  #19 = Utf8               J
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction._speed:D
  #21 = NameAndType        #22:#23        // _speed:D
  #22 = Utf8               _speed
  #23 = Utf8               D
  #24 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;JD)V
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               LocalVariableTable
  #28 = Utf8               this
  #29 = Utf8               Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;
  #30 = Utf8               startPosition
  #31 = Utf8               destination
  #32 = Utf8               startTime
  #33 = Utf8               speed
  #34 = Utf8               getStartPosition
  #35 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #36 = Utf8               getDestination
  #37 = Utf8               getStartTime
  #38 = Utf8               ()J
  #39 = Utf8               getSpeed
  #40 = Utf8               ()D
  #41 = Utf8               SourceFile
  #42 = Utf8               MovementIntegration.java
  #43 = Utf8               NestHost
  #44 = Class              #45            // ext/mods/gameserver/model/actor/move/MovementIntegration
  #45 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
  #46 = Utf8               InnerClasses
  #47 = Utf8               MovementPrediction
{
  public ext.mods.gameserver.model.actor.move.MovementIntegration$MovementPrediction(ext.mods.gameserver.model.location.Location, ext.mods.gameserver.model.location.Location, long, double);
    descriptor: (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;JD)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _startPosition:Lext/mods/gameserver/model/location/Location;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _destination:Lext/mods/gameserver/model/location/Location;
        14: aload_0
        15: lload_3
        16: putfield      #16                 // Field _startTime:J
        19: aload_0
        20: dload         5
        22: putfield      #20                 // Field _speed:D
        25: return
      LineNumberTable:
        line 299: 0
        line 300: 4
        line 301: 9
        line 302: 14
        line 303: 19
        line 304: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;
            0      26     1 startPosition   Lext/mods/gameserver/model/location/Location;
            0      26     2 destination   Lext/mods/gameserver/model/location/Location;
            0      26     3 startTime   J
            0      26     5 speed   D

  public ext.mods.gameserver.model.location.Location getStartPosition();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _startPosition:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 306: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;

  public ext.mods.gameserver.model.location.Location getDestination();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _destination:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 307: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;

  public long getStartTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _startTime:J
         4: lreturn
      LineNumberTable:
        line 308: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;

  public double getSpeed();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _speed:D
         4: dreturn
      LineNumberTable:
        line 309: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/MovementIntegration$MovementPrediction;
}
SourceFile: "MovementIntegration.java"
NestHost: class ext/mods/gameserver/model/actor/move/MovementIntegration
