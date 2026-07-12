// Bytecode for: ext.mods.dungeon.holder.SpawnTemplate
// File: ext\mods\dungeon\holder\SpawnTemplate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dungeon/holder/SpawnTemplate.class
  Last modified 9 de jul de 2026; size 742 bytes
  MD5 checksum 1a2722d3229b3d57cd3534f40c9b90c7
  Compiled from "SpawnTemplate.java"
public class ext.mods.dungeon.holder.SpawnTemplate
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/dungeon/holder/SpawnTemplate
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/dungeon/holder/SpawnTemplate.npcId:I
   #8 = Class              #10            // ext/mods/dungeon/holder/SpawnTemplate
   #9 = NameAndType        #11:#12        // npcId:I
  #10 = Utf8               ext/mods/dungeon/holder/SpawnTemplate
  #11 = Utf8               npcId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/dungeon/holder/SpawnTemplate.title:Ljava/lang/String;
  #14 = NameAndType        #15:#16        // title:Ljava/lang/String;
  #15 = Utf8               title
  #16 = Utf8               Ljava/lang/String;
  #17 = Fieldref           #8.#18         // ext/mods/dungeon/holder/SpawnTemplate.count:I
  #18 = NameAndType        #19:#12        // count:I
  #19 = Utf8               count
  #20 = Fieldref           #8.#21         // ext/mods/dungeon/holder/SpawnTemplate.range:I
  #21 = NameAndType        #22:#12        // range:I
  #22 = Utf8               range
  #23 = Fieldref           #8.#24         // ext/mods/dungeon/holder/SpawnTemplate.x:I
  #24 = NameAndType        #25:#12        // x:I
  #25 = Utf8               x
  #26 = Fieldref           #8.#27         // ext/mods/dungeon/holder/SpawnTemplate.y:I
  #27 = NameAndType        #28:#12        // y:I
  #28 = Utf8               y
  #29 = Fieldref           #8.#30         // ext/mods/dungeon/holder/SpawnTemplate.z:I
  #30 = NameAndType        #31:#12        // z:I
  #31 = Utf8               z
  #32 = Fieldref           #8.#33         // ext/mods/dungeon/holder/SpawnTemplate.drops:Ljava/lang/String;
  #33 = NameAndType        #34:#16        // drops:Ljava/lang/String;
  #34 = Utf8               drops
  #35 = Utf8               (ILjava/lang/String;IIIIILjava/lang/String;)V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/dungeon/holder/SpawnTemplate;
  #41 = Utf8               SourceFile
  #42 = Utf8               SpawnTemplate.java
{
  public final int npcId;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final java.lang.String title;
    descriptor: Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int count;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int range;
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

  public final java.lang.String drops;
    descriptor: Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.dungeon.holder.SpawnTemplate(int, java.lang.String, int, int, int, int, int, java.lang.String);
    descriptor: (ILjava/lang/String;IIIIILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=9, args_size=9
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field npcId:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field title:Ljava/lang/String;
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field count:I
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field range:I
        25: aload_0
        26: iload         5
        28: putfield      #23                 // Field x:I
        31: aload_0
        32: iload         6
        34: putfield      #26                 // Field y:I
        37: aload_0
        38: iload         7
        40: putfield      #29                 // Field z:I
        43: aload_0
        44: aload         8
        46: putfield      #32                 // Field drops:Ljava/lang/String;
        49: return
      LineNumberTable:
        line 31: 0
        line 32: 4
        line 33: 9
        line 34: 14
        line 35: 19
        line 36: 25
        line 37: 31
        line 38: 37
        line 39: 43
        line 40: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/dungeon/holder/SpawnTemplate;
            0      50     1 npcId   I
            0      50     2 title   Ljava/lang/String;
            0      50     3 count   I
            0      50     4 range   I
            0      50     5     x   I
            0      50     6     y   I
            0      50     7     z   I
            0      50     8 drops   Ljava/lang/String;
}
SourceFile: "SpawnTemplate.java"
