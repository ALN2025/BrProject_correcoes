// Bytecode for: ext.mods.dungeon.data.DungeonData$SingletonHolder
// File: ext\mods\dungeon\data\DungeonData$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dungeon/data/DungeonData$SingletonHolder.class
  Last modified 9 de jul de 2026; size 574 bytes
  MD5 checksum 186c9a1fc7af53b721c2351c397e2269
  Compiled from "DungeonData.java"
class ext.mods.dungeon.data.DungeonData$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/dungeon/data/DungeonData$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/dungeon/data/DungeonData
   #8 = Utf8               ext/mods/dungeon/data/DungeonData
   #9 = Methodref          #7.#3          // ext/mods/dungeon/data/DungeonData."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/dungeon/data/DungeonData$SingletonHolder._instance:Lext/mods/dungeon/data/DungeonData;
  #11 = Class              #13            // ext/mods/dungeon/data/DungeonData$SingletonHolder
  #12 = NameAndType        #14:#15        // _instance:Lext/mods/dungeon/data/DungeonData;
  #13 = Utf8               ext/mods/dungeon/data/DungeonData$SingletonHolder
  #14 = Utf8               _instance
  #15 = Utf8               Lext/mods/dungeon/data/DungeonData;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/dungeon/data/DungeonData$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               DungeonData.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/dungeon/data/DungeonData
         3: dup
         4: invokespecial #9                  // Method ext/mods/dungeon/data/DungeonData."<init>":()V
         7: putstatic     #10                 // Field _instance:Lext/mods/dungeon/data/DungeonData;
        10: return
      LineNumberTable:
        line 156: 0
}
SourceFile: "DungeonData.java"
NestHost: class ext/mods/dungeon/data/DungeonData
