// Bytecode for: ext.mods.fakeplayer.FakePlayerManager$SingletonHolder
// File: ext\mods\fakeplayer\FakePlayerManager$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/FakePlayerManager$SingletonHolder.class
  Last modified 9 de jul de 2026; size 596 bytes
  MD5 checksum 66d22c4f6325e441b7ef31f83e202736
  Compiled from "FakePlayerManager.java"
class ext.mods.fakeplayer.FakePlayerManager$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/fakeplayer/FakePlayerManager$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/fakeplayer/FakePlayerManager
   #8 = Utf8               ext/mods/fakeplayer/FakePlayerManager
   #9 = Methodref          #7.#3          // ext/mods/fakeplayer/FakePlayerManager."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/fakeplayer/FakePlayerManager$SingletonHolder._instance:Lext/mods/fakeplayer/FakePlayerManager;
  #11 = Class              #13            // ext/mods/fakeplayer/FakePlayerManager$SingletonHolder
  #12 = NameAndType        #14:#15        // _instance:Lext/mods/fakeplayer/FakePlayerManager;
  #13 = Utf8               ext/mods/fakeplayer/FakePlayerManager$SingletonHolder
  #14 = Utf8               _instance
  #15 = Utf8               Lext/mods/fakeplayer/FakePlayerManager;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/fakeplayer/FakePlayerManager$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               FakePlayerManager.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/fakeplayer/FakePlayerManager
         3: dup
         4: invokespecial #9                  // Method ext/mods/fakeplayer/FakePlayerManager."<init>":()V
         7: putstatic     #10                 // Field _instance:Lext/mods/fakeplayer/FakePlayerManager;
        10: return
      LineNumberTable:
        line 119: 0
}
SourceFile: "FakePlayerManager.java"
NestHost: class ext/mods/fakeplayer/FakePlayerManager
