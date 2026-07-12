// Bytecode for: ext.mods.dungeon.DungeonManager$SingletonHolder
// File: ext\mods\dungeon\DungeonManager$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dungeon/DungeonManager$SingletonHolder.class
  Last modified 9 de jul de 2026; size 568 bytes
  MD5 checksum 52eecc5951d4d970c4e32bb445820d25
  Compiled from "DungeonManager.java"
class ext.mods.dungeon.DungeonManager$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/dungeon/DungeonManager$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/dungeon/DungeonManager
   #8 = Utf8               ext/mods/dungeon/DungeonManager
   #9 = Methodref          #7.#3          // ext/mods/dungeon/DungeonManager."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/dungeon/DungeonManager$SingletonHolder.instance:Lext/mods/dungeon/DungeonManager;
  #11 = Class              #13            // ext/mods/dungeon/DungeonManager$SingletonHolder
  #12 = NameAndType        #14:#15        // instance:Lext/mods/dungeon/DungeonManager;
  #13 = Utf8               ext/mods/dungeon/DungeonManager$SingletonHolder
  #14 = Utf8               instance
  #15 = Utf8               Lext/mods/dungeon/DungeonManager;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/dungeon/DungeonManager$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               DungeonManager.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  protected static final ext.mods.dungeon.DungeonManager instance;
    descriptor: Lext/mods/dungeon/DungeonManager;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/dungeon/DungeonManager
         3: dup
         4: invokespecial #9                  // Method ext/mods/dungeon/DungeonManager."<init>":()V
         7: putstatic     #10                 // Field instance:Lext/mods/dungeon/DungeonManager;
        10: return
      LineNumberTable:
        line 266: 0
}
SourceFile: "DungeonManager.java"
NestHost: class ext/mods/dungeon/DungeonManager
