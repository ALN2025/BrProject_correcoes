// Bytecode for: ext.mods.gameserver.model.location.ObserverLocation
// File: ext\mods\gameserver\model\location\ObserverLocation.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/location/ObserverLocation.class
  Last modified 9 de jul de 2026; size 1712 bytes
  MD5 checksum f4d9c9878b321f7a6982d398174336b4
  Compiled from "ObserverLocation.java"
public class ext.mods.gameserver.model.location.ObserverLocation extends ext.mods.gameserver.model.location.Location
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/location/ObserverLocation
  super_class: #2                         // ext/mods/gameserver/model/location/Location
  interfaces: 0, fields: 5, methods: 8, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #2 = Class              #4             // ext/mods/gameserver/model/location/Location
   #3 = NameAndType        #5:#6          // "<init>":(III)V
   #4 = Utf8               ext/mods/gameserver/model/location/Location
   #5 = Utf8               <init>
   #6 = Utf8               (III)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/location/ObserverLocation._locId:I
   #8 = Class              #10            // ext/mods/gameserver/model/location/ObserverLocation
   #9 = NameAndType        #11:#12        // _locId:I
  #10 = Utf8               ext/mods/gameserver/model/location/ObserverLocation
  #11 = Utf8               _locId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/location/ObserverLocation._yaw:I
  #14 = NameAndType        #15:#12        // _yaw:I
  #15 = Utf8               _yaw
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/location/ObserverLocation._pitch:I
  #17 = NameAndType        #18:#12        // _pitch:I
  #18 = Utf8               _pitch
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/location/ObserverLocation._cost:I
  #20 = NameAndType        #21:#12        // _cost:I
  #21 = Utf8               _cost
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/location/ObserverLocation._castleId:I
  #23 = NameAndType        #24:#12        // _castleId:I
  #24 = Utf8               _castleId
  #25 = Methodref          #2.#26         // ext/mods/gameserver/model/location/Location.getX:()I
  #26 = NameAndType        #27:#28        // getX:()I
  #27 = Utf8               getX
  #28 = Utf8               ()I
  #29 = Methodref          #2.#30         // ext/mods/gameserver/model/location/Location.getY:()I
  #30 = NameAndType        #31:#28        // getY:()I
  #31 = Utf8               getY
  #32 = Methodref          #2.#33         // ext/mods/gameserver/model/location/Location.getZ:()I
  #33 = NameAndType        #34:#28        // getZ:()I
  #34 = Utf8               getZ
  #35 = Methodref          #8.#36         // ext/mods/gameserver/model/location/ObserverLocation."<init>":(IIIIIIII)V
  #36 = NameAndType        #5:#37         // "<init>":(IIIIIIII)V
  #37 = Utf8               (IIIIIIII)V
  #38 = String             #39            // locId
  #39 = Utf8               locId
  #40 = Methodref          #41.#42        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #41 = Class              #43            // ext/mods/commons/data/StatSet
  #42 = NameAndType        #44:#45        // getInteger:(Ljava/lang/String;)I
  #43 = Utf8               ext/mods/commons/data/StatSet
  #44 = Utf8               getInteger
  #45 = Utf8               (Ljava/lang/String;)I
  #46 = String             #47            // x
  #47 = Utf8               x
  #48 = String             #49            // y
  #49 = Utf8               y
  #50 = String             #51            // z
  #51 = Utf8               z
  #52 = String             #53            // yaw
  #53 = Utf8               yaw
  #54 = String             #55            // pitch
  #55 = Utf8               pitch
  #56 = String             #57            // cost
  #57 = Utf8               cost
  #58 = String             #59            // castle
  #59 = Utf8               castle
  #60 = Utf8               Code
  #61 = Utf8               LineNumberTable
  #62 = Utf8               LocalVariableTable
  #63 = Utf8               this
  #64 = Utf8               Lext/mods/gameserver/model/location/ObserverLocation;
  #65 = Utf8               castleId
  #66 = Utf8               (ILext/mods/gameserver/model/location/Location;IIII)V
  #67 = Utf8               loc
  #68 = Utf8               Lext/mods/gameserver/model/location/Location;
  #69 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #70 = Utf8               set
  #71 = Utf8               Lext/mods/commons/data/StatSet;
  #72 = Utf8               getLocId
  #73 = Utf8               getYaw
  #74 = Utf8               getPitch
  #75 = Utf8               getCost
  #76 = Utf8               getCastleId
  #77 = Utf8               SourceFile
  #78 = Utf8               ObserverLocation.java
{
  public ext.mods.gameserver.model.location.ObserverLocation(int, int, int, int, int, int, int, int);
    descriptor: (IIIIIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=9, args_size=9
         0: aload_0
         1: iload_2
         2: iload_3
         3: iload         4
         5: invokespecial #1                  // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
         8: aload_0
         9: iload_1
        10: putfield      #7                  // Field _locId:I
        13: aload_0
        14: iload         5
        16: putfield      #13                 // Field _yaw:I
        19: aload_0
        20: iload         6
        22: putfield      #16                 // Field _pitch:I
        25: aload_0
        26: iload         7
        28: putfield      #19                 // Field _cost:I
        31: aload_0
        32: iload         8
        34: putfield      #22                 // Field _castleId:I
        37: return
      LineNumberTable:
        line 34: 0
        line 36: 8
        line 38: 13
        line 39: 19
        line 40: 25
        line 41: 31
        line 42: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/location/ObserverLocation;
            0      38     1 locId   I
            0      38     2     x   I
            0      38     3     y   I
            0      38     4     z   I
            0      38     5   yaw   I
            0      38     6 pitch   I
            0      38     7  cost   I
            0      38     8 castleId   I

  public ext.mods.gameserver.model.location.ObserverLocation(int, ext.mods.gameserver.model.location.Location, int, int, int, int);
    descriptor: (ILext/mods/gameserver/model/location/Location;IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=7, args_size=7
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokevirtual #25                 // Method ext/mods/gameserver/model/location/Location.getX:()I
         6: aload_2
         7: invokevirtual #29                 // Method ext/mods/gameserver/model/location/Location.getY:()I
        10: aload_2
        11: invokevirtual #32                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
        14: iload_3
        15: iload         4
        17: iload         5
        19: iload         6
        21: invokespecial #35                 // Method "<init>":(IIIIIIII)V
        24: return
      LineNumberTable:
        line 46: 0
        line 47: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/location/ObserverLocation;
            0      25     1 locId   I
            0      25     2   loc   Lext/mods/gameserver/model/location/Location;
            0      25     3   yaw   I
            0      25     4 pitch   I
            0      25     5  cost   I
            0      25     6 castleId   I

  public ext.mods.gameserver.model.location.ObserverLocation(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #38                 // String locId
         4: invokevirtual #40                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #46                 // String x
        10: invokevirtual #40                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #48                 // String y
        16: invokevirtual #40                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        19: aload_1
        20: ldc           #50                 // String z
        22: invokevirtual #40                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        25: aload_1
        26: ldc           #52                 // String yaw
        28: invokevirtual #40                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        31: aload_1
        32: ldc           #54                 // String pitch
        34: invokevirtual #40                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        37: aload_1
        38: ldc           #56                 // String cost
        40: invokevirtual #40                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        43: aload_1
        44: ldc           #58                 // String castle
        46: invokevirtual #40                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        49: invokespecial #35                 // Method "<init>":(IIIIIIII)V
        52: return
      LineNumberTable:
        line 51: 0
        line 52: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/model/location/ObserverLocation;
            0      53     1   set   Lext/mods/commons/data/StatSet;

  public int getLocId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _locId:I
         4: ireturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/ObserverLocation;

  public int getYaw();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _yaw:I
         4: ireturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/ObserverLocation;

  public int getPitch();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _pitch:I
         4: ireturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/ObserverLocation;

  public int getCost();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _cost:I
         4: ireturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/ObserverLocation;

  public int getCastleId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _castleId:I
         4: ireturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/ObserverLocation;
}
SourceFile: "ObserverLocation.java"
