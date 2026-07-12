// Bytecode for: ext.mods.Config$JewelUpgrade
// File: ext\mods\Config$JewelUpgrade.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Config$JewelUpgrade.class
  Last modified 9 de jul de 2026; size 537 bytes
  MD5 checksum 56a229ba2b800ad434d438e676ce82c7
  Compiled from "Config.java"
public class ext.mods.Config$JewelUpgrade
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/Config$JewelUpgrade
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/Config$JewelUpgrade.itemId:I
   #8 = Class              #10            // ext/mods/Config$JewelUpgrade
   #9 = NameAndType        #11:#12        // itemId:I
  #10 = Utf8               ext/mods/Config$JewelUpgrade
  #11 = Utf8               itemId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/Config$JewelUpgrade.enchantLevel:I
  #14 = NameAndType        #15:#12        // enchantLevel:I
  #15 = Utf8               enchantLevel
  #16 = Fieldref           #8.#17         // ext/mods/Config$JewelUpgrade.newItemId:I
  #17 = NameAndType        #18:#12        // newItemId:I
  #18 = Utf8               newItemId
  #19 = Utf8               (III)V
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/Config$JewelUpgrade;
  #25 = Utf8               SourceFile
  #26 = Utf8               Config.java
  #27 = Utf8               NestHost
  #28 = Class              #29            // ext/mods/Config
  #29 = Utf8               ext/mods/Config
  #30 = Utf8               InnerClasses
  #31 = Utf8               JewelUpgrade
{
  public final int itemId;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int enchantLevel;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int newItemId;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.Config$JewelUpgrade(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field itemId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field enchantLevel:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field newItemId:I
        19: return
      LineNumberTable:
        line 128: 0
        line 129: 4
        line 130: 9
        line 131: 14
        line 132: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/Config$JewelUpgrade;
            0      20     1 itemId   I
            0      20     2 enchantLevel   I
            0      20     3 newItemId   I
}
SourceFile: "Config.java"
NestHost: class ext/mods/Config
InnerClasses:
  public static #31= #8 of #28;           // JewelUpgrade=class ext/mods/Config$JewelUpgrade of class ext/mods/Config
