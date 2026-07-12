// Bytecode for: ext.mods.dungeon.Dungeon$DropData
// File: ext\mods\dungeon\Dungeon$DropData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dungeon/Dungeon$DropData.class
  Last modified 9 de jul de 2026; size 805 bytes
  MD5 checksum 1764d68f35a98fe2dff9a4de8480741a
  Compiled from "Dungeon.java"
public class ext.mods.dungeon.Dungeon$DropData
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/dungeon/Dungeon$DropData
  super_class: #8                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Methodref          #8.#9          // java/lang/Object."<init>":()V
   #8 = Class              #10            // java/lang/Object
   #9 = NameAndType        #11:#12        // "<init>":()V
  #10 = Utf8               java/lang/Object
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Fieldref           #14.#15        // ext/mods/dungeon/Dungeon$DropData.itemId:I
  #14 = Class              #16            // ext/mods/dungeon/Dungeon$DropData
  #15 = NameAndType        #17:#18        // itemId:I
  #16 = Utf8               ext/mods/dungeon/Dungeon$DropData
  #17 = Utf8               itemId
  #18 = Utf8               I
  #19 = Fieldref           #14.#20        // ext/mods/dungeon/Dungeon$DropData.min:I
  #20 = NameAndType        #21:#18        // min:I
  #21 = Utf8               min
  #22 = Fieldref           #14.#23        // ext/mods/dungeon/Dungeon$DropData.max:I
  #23 = NameAndType        #24:#18        // max:I
  #24 = Utf8               max
  #25 = Fieldref           #14.#26        // ext/mods/dungeon/Dungeon$DropData.chance:I
  #26 = NameAndType        #27:#18        // chance:I
  #27 = Utf8               chance
  #28 = Utf8               (Lext/mods/dungeon/Dungeon;IIII)V
  #29 = Utf8               Code
  #30 = Utf8               LineNumberTable
  #31 = Utf8               LocalVariableTable
  #32 = Utf8               this
  #33 = Utf8               Lext/mods/dungeon/Dungeon$DropData;
  #34 = Utf8               this$0
  #35 = Utf8               Lext/mods/dungeon/Dungeon;
  #36 = Utf8               MethodParameters
  #37 = Utf8               SourceFile
  #38 = Utf8               Dungeon.java
  #39 = Utf8               NestHost
  #40 = Class              #41            // ext/mods/dungeon/Dungeon
  #41 = Utf8               ext/mods/dungeon/Dungeon
  #42 = Utf8               InnerClasses
  #43 = Utf8               DropData
{
  public final int itemId;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int min;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int max;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int chance;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.dungeon.Dungeon$DropData(ext.mods.dungeon.Dungeon, int, int, int, int);
    descriptor: (Lext/mods/dungeon/Dungeon;IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_1
         1: dup
         2: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokespecial #7                  // Method java/lang/Object."<init>":()V
        11: aload_0
        12: iload_2
        13: putfield      #13                 // Field itemId:I
        16: aload_0
        17: iload_3
        18: putfield      #19                 // Field min:I
        21: aload_0
        22: iload         4
        24: putfield      #22                 // Field max:I
        27: aload_0
        28: iload         5
        30: putfield      #25                 // Field chance:I
        33: return
      LineNumberTable:
        line 635: 0
        line 636: 11
        line 637: 16
        line 638: 21
        line 639: 27
        line 640: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/dungeon/Dungeon$DropData;
            0      34     1 this$0   Lext/mods/dungeon/Dungeon;
            0      34     2 itemId   I
            0      34     3   min   I
            0      34     4   max   I
            0      34     5 chance   I
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>
      <no name>
      <no name>
      <no name>
}
SourceFile: "Dungeon.java"
NestHost: class ext/mods/dungeon/Dungeon
InnerClasses:
  public #43= #14 of #40;                 // DropData=class ext/mods/dungeon/Dungeon$DropData of class ext/mods/dungeon/Dungeon
