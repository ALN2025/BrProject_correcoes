// Bytecode for: ext.mods.fakeplayer.FakePlayerTaskManager$SingletonHolder
// File: ext\mods\fakeplayer\FakePlayerTaskManager$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder.class
  Last modified 9 de jul de 2026; size 616 bytes
  MD5 checksum d92077116281a0c703f0186260b1e9aa
  Compiled from "FakePlayerTaskManager.java"
class ext.mods.fakeplayer.FakePlayerTaskManager$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/fakeplayer/FakePlayerTaskManager
   #8 = Utf8               ext/mods/fakeplayer/FakePlayerTaskManager
   #9 = Methodref          #7.#3          // ext/mods/fakeplayer/FakePlayerTaskManager."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder._instance:Lext/mods/fakeplayer/FakePlayerTaskManager;
  #11 = Class              #13            // ext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder
  #12 = NameAndType        #14:#15        // _instance:Lext/mods/fakeplayer/FakePlayerTaskManager;
  #13 = Utf8               ext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder
  #14 = Utf8               _instance
  #15 = Utf8               Lext/mods/fakeplayer/FakePlayerTaskManager;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/fakeplayer/FakePlayerTaskManager$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               FakePlayerTaskManager.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/fakeplayer/FakePlayerTaskManager
         3: dup
         4: invokespecial #9                  // Method ext/mods/fakeplayer/FakePlayerTaskManager."<init>":()V
         7: putstatic     #10                 // Field _instance:Lext/mods/fakeplayer/FakePlayerTaskManager;
        10: return
      LineNumberTable:
        line 81: 0
}
SourceFile: "FakePlayerTaskManager.java"
NestHost: class ext/mods/fakeplayer/FakePlayerTaskManager
