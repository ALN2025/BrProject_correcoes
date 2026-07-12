// Bytecode for: ext.mods.gameserver.data.manager.FestivalOfDarknessManager$FestivalSpawn
// File: ext\mods\gameserver\data\manager\FestivalOfDarknessManager$FestivalSpawn.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn.class
  Last modified 9 de jul de 2026; size 833 bytes
  MD5 checksum 2865b3a3a985c0ec69388e251e380dcd
  Compiled from "FestivalOfDarknessManager.java"
public class ext.mods.gameserver.data.manager.FestivalOfDarknessManager$FestivalSpawn
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._x:I
   #8 = Class              #10            // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
   #9 = NameAndType        #11:#12        // _x:I
  #10 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
  #11 = Utf8               _x
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._y:I
  #14 = NameAndType        #15:#12        // _y:I
  #15 = Utf8               _y
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._z:I
  #17 = NameAndType        #18:#12        // _z:I
  #18 = Utf8               _z
  #19 = Utf8               (IIII)V
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
  #25 = Utf8               x
  #26 = Utf8               y
  #27 = Utf8               z
  #28 = Utf8               heading
  #29 = Utf8               ([I)V
  #30 = Utf8               spawnData
  #31 = Utf8               [I
  #32 = Utf8               SourceFile
  #33 = Utf8               FestivalOfDarknessManager.java
  #34 = Utf8               NestHost
  #35 = Class              #36            // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  #36 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  #37 = Utf8               InnerClasses
  #38 = Utf8               FestivalSpawn
{
  public final int _x;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int _y;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int _z;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.gameserver.data.manager.FestivalOfDarknessManager$FestivalSpawn(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _x:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _y:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _z:I
        19: return
      LineNumberTable:
        line 971: 0
        line 972: 4
        line 973: 9
        line 974: 14
        line 975: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
            0      20     1     x   I
            0      20     2     y   I
            0      20     3     z   I
            0      20     4 heading   I

  public ext.mods.gameserver.data.manager.FestivalOfDarknessManager$FestivalSpawn(int[]);
    descriptor: ([I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: iconst_0
         7: iaload
         8: putfield      #7                  // Field _x:I
        11: aload_0
        12: aload_1
        13: iconst_1
        14: iaload
        15: putfield      #13                 // Field _y:I
        18: aload_0
        19: aload_1
        20: iconst_2
        21: iaload
        22: putfield      #16                 // Field _z:I
        25: return
      LineNumberTable:
        line 978: 0
        line 979: 4
        line 980: 11
        line 981: 18
        line 982: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
            0      26     1 spawnData   [I
}
SourceFile: "FestivalOfDarknessManager.java"
NestHost: class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
InnerClasses:
  public static #38= #8 of #35;           // FestivalSpawn=class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn of class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
