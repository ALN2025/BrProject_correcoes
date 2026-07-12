// Bytecode for: ext.mods.dungeon.holder.StageTemplate
// File: ext\mods\dungeon\holder\StageTemplate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dungeon/holder/StageTemplate.class
  Last modified 9 de jul de 2026; size 604 bytes
  MD5 checksum be9a437462aba1bb1c9f87bb072c8db2
  Compiled from "StageTemplate.java"
public class ext.mods.dungeon.holder.StageTemplate
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/dungeon/holder/StageTemplate
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/dungeon/holder/StageTemplate.order:I
   #8 = Class              #10            // ext/mods/dungeon/holder/StageTemplate
   #9 = NameAndType        #11:#12        // order:I
  #10 = Utf8               ext/mods/dungeon/holder/StageTemplate
  #11 = Utf8               order
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/dungeon/holder/StageTemplate.x:I
  #14 = NameAndType        #15:#12        // x:I
  #15 = Utf8               x
  #16 = Fieldref           #8.#17         // ext/mods/dungeon/holder/StageTemplate.y:I
  #17 = NameAndType        #18:#12        // y:I
  #18 = Utf8               y
  #19 = Fieldref           #8.#20         // ext/mods/dungeon/holder/StageTemplate.z:I
  #20 = NameAndType        #21:#12        // z:I
  #21 = Utf8               z
  #22 = Fieldref           #8.#23         // ext/mods/dungeon/holder/StageTemplate.teleport:Z
  #23 = NameAndType        #24:#25        // teleport:Z
  #24 = Utf8               teleport
  #25 = Utf8               Z
  #26 = Fieldref           #8.#27         // ext/mods/dungeon/holder/StageTemplate.timeLimit:I
  #27 = NameAndType        #28:#12        // timeLimit:I
  #28 = Utf8               timeLimit
  #29 = Utf8               (IIIIZI)V
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               this
  #34 = Utf8               Lext/mods/dungeon/holder/StageTemplate;
  #35 = Utf8               SourceFile
  #36 = Utf8               StageTemplate.java
{
  public final int order;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int x;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int y;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int z;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final boolean teleport;
    descriptor: Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int timeLimit;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.dungeon.holder.StageTemplate(int, int, int, int, boolean, int);
    descriptor: (IIIIZI)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=7
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field order:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field x:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field y:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field z:I
        25: aload_0
        26: iload         5
        28: putfield      #22                 // Field teleport:Z
        31: aload_0
        32: iload         6
        34: putfield      #26                 // Field timeLimit:I
        37: return
      LineNumberTable:
        line 28: 0
        line 29: 4
        line 30: 9
        line 31: 14
        line 32: 19
        line 33: 25
        line 34: 31
        line 35: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/dungeon/holder/StageTemplate;
            0      38     1 order   I
            0      38     2     x   I
            0      38     3     y   I
            0      38     4     z   I
            0      38     5 teleport   Z
            0      38     6 timeLimit   I
}
SourceFile: "StageTemplate.java"
