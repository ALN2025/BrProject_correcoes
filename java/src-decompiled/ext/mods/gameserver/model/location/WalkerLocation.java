// Bytecode for: ext.mods.gameserver.model.location.WalkerLocation
// File: ext\mods\gameserver\model\location\WalkerLocation.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/location/WalkerLocation.class
  Last modified 9 de jul de 2026; size 1146 bytes
  MD5 checksum ee339cf41391e40baeef65a5ddeabe71
  Compiled from "WalkerLocation.java"
public class ext.mods.gameserver.model.location.WalkerLocation extends ext.mods.gameserver.model.location.Location
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/location/WalkerLocation
  super_class: #2                         // ext/mods/gameserver/model/location/Location
  interfaces: 0, fields: 3, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/commons/data/StatSet;)V
   #2 = Class              #4             // ext/mods/gameserver/model/location/Location
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/commons/data/StatSet;)V
   #4 = Utf8               ext/mods/gameserver/model/location/Location
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #7 = String             #8             // delay
   #8 = Utf8               delay
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;I)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;I)I
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/model/location/WalkerLocation._delay:I
  #16 = Class              #18            // ext/mods/gameserver/model/location/WalkerLocation
  #17 = NameAndType        #19:#20        // _delay:I
  #18 = Utf8               ext/mods/gameserver/model/location/WalkerLocation
  #19 = Utf8               _delay
  #20 = Utf8               I
  #21 = String             #22            // fstring
  #22 = Utf8               fstring
  #23 = Methodref          #10.#24        // ext/mods/commons/data/StatSet.getNpcStringId:(Ljava/lang/String;Lext/mods/gameserver/network/NpcStringId;)Lext/mods/gameserver/network/NpcStringId;
  #24 = NameAndType        #25:#26        // getNpcStringId:(Ljava/lang/String;Lext/mods/gameserver/network/NpcStringId;)Lext/mods/gameserver/network/NpcStringId;
  #25 = Utf8               getNpcStringId
  #26 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/NpcStringId;)Lext/mods/gameserver/network/NpcStringId;
  #27 = Fieldref           #16.#28        // ext/mods/gameserver/model/location/WalkerLocation._fstring:Lext/mods/gameserver/network/NpcStringId;
  #28 = NameAndType        #29:#30        // _fstring:Lext/mods/gameserver/network/NpcStringId;
  #29 = Utf8               _fstring
  #30 = Utf8               Lext/mods/gameserver/network/NpcStringId;
  #31 = String             #32            // socialId
  #32 = Utf8               socialId
  #33 = Fieldref           #16.#34        // ext/mods/gameserver/model/location/WalkerLocation._socialId:I
  #34 = NameAndType        #35:#20        // _socialId:I
  #35 = Utf8               _socialId
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/gameserver/model/location/WalkerLocation;
  #41 = Utf8               set
  #42 = Utf8               Lext/mods/commons/data/StatSet;
  #43 = Utf8               getDelay
  #44 = Utf8               ()I
  #45 = Utf8               ()Lext/mods/gameserver/network/NpcStringId;
  #46 = Utf8               getSocialId
  #47 = Utf8               SourceFile
  #48 = Utf8               WalkerLocation.java
{
  public ext.mods.gameserver.model.location.WalkerLocation(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #7                  // String delay
         9: iconst_0
        10: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        13: sipush        1000
        16: imul
        17: putfield      #15                 // Field _delay:I
        20: aload_0
        21: aload_1
        22: ldc           #21                 // String fstring
        24: aconst_null
        25: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getNpcStringId:(Ljava/lang/String;Lext/mods/gameserver/network/NpcStringId;)Lext/mods/gameserver/network/NpcStringId;
        28: putfield      #27                 // Field _fstring:Lext/mods/gameserver/network/NpcStringId;
        31: aload_0
        32: aload_1
        33: ldc           #31                 // String socialId
        35: iconst_0
        36: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        39: putfield      #33                 // Field _socialId:I
        42: return
      LineNumberTable:
        line 37: 0
        line 39: 5
        line 40: 20
        line 41: 31
        line 42: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/location/WalkerLocation;
            0      43     1   set   Lext/mods/commons/data/StatSet;

  public int getDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _delay:I
         4: ireturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/WalkerLocation;

  public ext.mods.gameserver.network.NpcStringId getNpcStringId();
    descriptor: ()Lext/mods/gameserver/network/NpcStringId;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _fstring:Lext/mods/gameserver/network/NpcStringId;
         4: areturn
      LineNumberTable:
        line 51: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/WalkerLocation;

  public int getSocialId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _socialId:I
         4: ireturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/WalkerLocation;
}
SourceFile: "WalkerLocation.java"
