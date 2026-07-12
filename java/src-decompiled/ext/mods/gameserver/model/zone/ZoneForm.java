// Bytecode for: ext.mods.gameserver.model.zone.ZoneForm
// File: ext\mods\gameserver\model\zone\ZoneForm.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/ZoneForm.class
  Last modified 9 de jul de 2026; size 853 bytes
  MD5 checksum 20140a0875c35aef7bb11bc5975c5470
  Compiled from "ZoneForm.java"
public abstract class ext.mods.gameserver.model.zone.ZoneForm
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #13                         // ext/mods/gameserver/model/zone/ZoneForm
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // java/awt/geom/Line2D.linesIntersect:(DDDDDDDD)Z
   #8 = Class              #10            // java/awt/geom/Line2D
   #9 = NameAndType        #11:#12        // linesIntersect:(DDDDDDDD)Z
  #10 = Utf8               java/awt/geom/Line2D
  #11 = Utf8               linesIntersect
  #12 = Utf8               (DDDDDDDD)Z
  #13 = Class              #14            // ext/mods/gameserver/model/zone/ZoneForm
  #14 = Utf8               ext/mods/gameserver/model/zone/ZoneForm
  #15 = Utf8               Code
  #16 = Utf8               LineNumberTable
  #17 = Utf8               LocalVariableTable
  #18 = Utf8               this
  #19 = Utf8               Lext/mods/gameserver/model/zone/ZoneForm;
  #20 = Utf8               isInsideZone
  #21 = Utf8               (III)Z
  #22 = Utf8               intersectsRectangle
  #23 = Utf8               (IIII)Z
  #24 = Utf8               getLowZ
  #25 = Utf8               ()I
  #26 = Utf8               getHighZ
  #27 = Utf8               visualizeZone
  #28 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #29 = Utf8               lineSegmentsIntersect
  #30 = Utf8               (IIIIIIII)Z
  #31 = Utf8               ax1
  #32 = Utf8               I
  #33 = Utf8               ay1
  #34 = Utf8               ax2
  #35 = Utf8               ay2
  #36 = Utf8               bx1
  #37 = Utf8               by1
  #38 = Utf8               bx2
  #39 = Utf8               by2
  #40 = Utf8               SourceFile
  #41 = Utf8               ZoneForm.java
{
  public ext.mods.gameserver.model.zone.ZoneForm();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/ZoneForm;

  public abstract boolean isInsideZone(int, int, int);
    descriptor: (III)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean intersectsRectangle(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getLowZ();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getHighZ();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void visualizeZone(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  protected boolean lineSegmentsIntersect(int, int, int, int, int, int, int, int);
    descriptor: (IIIIIIII)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=16, locals=9, args_size=9
         0: iload_1
         1: i2d
         2: iload_2
         3: i2d
         4: iload_3
         5: i2d
         6: iload         4
         8: i2d
         9: iload         5
        11: i2d
        12: iload         6
        14: i2d
        15: iload         7
        17: i2d
        18: iload         8
        20: i2d
        21: invokestatic  #7                  // Method java/awt/geom/Line2D.linesIntersect:(DDDDDDDD)Z
        24: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/zone/ZoneForm;
            0      25     1   ax1   I
            0      25     2   ay1   I
            0      25     3   ax2   I
            0      25     4   ay2   I
            0      25     5   bx1   I
            0      25     6   by1   I
            0      25     7   bx2   I
            0      25     8   by2   I
}
SourceFile: "ZoneForm.java"
