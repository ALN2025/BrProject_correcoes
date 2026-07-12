// Bytecode for: ext.mods.gameserver.model.entity.autofarm.zone.form.ZoneCylinderZ
// File: ext\mods\gameserver\model\entity\autofarm\zone\form\ZoneCylinderZ.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneCylinderZ.class
  Last modified 9 de jul de 2026; size 772 bytes
  MD5 checksum b218e16b79b6c5c5f0240f3c0317d10c
  Compiled from "ZoneCylinderZ.java"
public class ext.mods.gameserver.model.entity.autofarm.zone.form.ZoneCylinderZ extends ext.mods.gameserver.model.zone.form.ZoneCylinder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneCylinderZ
  super_class: #2                         // ext/mods/gameserver/model/zone/form/ZoneCylinder
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/form/ZoneCylinder."<init>":(IIIII)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/form/ZoneCylinder
   #3 = NameAndType        #5:#6          // "<init>":(IIIII)V
   #4 = Utf8               ext/mods/gameserver/model/zone/form/ZoneCylinder
   #5 = Utf8               <init>
   #6 = Utf8               (IIIII)V
   #7 = Class              #8             // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneCylinderZ
   #8 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneCylinderZ
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneCylinderZ;
  #14 = Utf8               x
  #15 = Utf8               I
  #16 = Utf8               y
  #17 = Utf8               z1
  #18 = Utf8               z2
  #19 = Utf8               rad
  #20 = Utf8               visualizeZone
  #21 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #22 = Utf8               info
  #23 = Utf8               Ljava/lang/String;
  #24 = Utf8               debug
  #25 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #26 = Utf8               SourceFile
  #27 = Utf8               ZoneCylinderZ.java
{
  public ext.mods.gameserver.model.entity.autofarm.zone.form.ZoneCylinderZ(int, int, int, int, int);
    descriptor: (IIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=6
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: iload         4
         6: iload         5
         8: invokespecial #1                  // Method ext/mods/gameserver/model/zone/form/ZoneCylinder."<init>":(IIIII)V
        11: return
      LineNumberTable:
        line 29: 0
        line 30: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneCylinderZ;
            0      12     1     x   I
            0      12     2     y   I
            0      12     3    z1   I
            0      12     4    z2   I
            0      12     5   rad   I

  public void visualizeZone(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneCylinderZ;
            0       1     1  info   Ljava/lang/String;
            0       1     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
}
SourceFile: "ZoneCylinderZ.java"
