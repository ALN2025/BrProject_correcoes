// Bytecode for: ext.mods.Crypta.PlayerEmailManager$SingletonHolder
// File: ext\mods\Crypta\PlayerEmailManager$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Crypta/PlayerEmailManager$SingletonHolder.class
  Last modified 9 de jul de 2026; size 584 bytes
  MD5 checksum 2b7371ba5224c270a0534749779ff825
  Compiled from "PlayerEmailManager.java"
class ext.mods.Crypta.PlayerEmailManager$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/Crypta/PlayerEmailManager$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/Crypta/PlayerEmailManager
   #8 = Utf8               ext/mods/Crypta/PlayerEmailManager
   #9 = Methodref          #7.#3          // ext/mods/Crypta/PlayerEmailManager."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/Crypta/PlayerEmailManager$SingletonHolder.instance:Lext/mods/Crypta/PlayerEmailManager;
  #11 = Class              #13            // ext/mods/Crypta/PlayerEmailManager$SingletonHolder
  #12 = NameAndType        #14:#15        // instance:Lext/mods/Crypta/PlayerEmailManager;
  #13 = Utf8               ext/mods/Crypta/PlayerEmailManager$SingletonHolder
  #14 = Utf8               instance
  #15 = Utf8               Lext/mods/Crypta/PlayerEmailManager;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/Crypta/PlayerEmailManager$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               PlayerEmailManager.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  protected static final ext.mods.Crypta.PlayerEmailManager instance;
    descriptor: Lext/mods/Crypta/PlayerEmailManager;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/Crypta/PlayerEmailManager
         3: dup
         4: invokespecial #9                  // Method ext/mods/Crypta/PlayerEmailManager."<init>":()V
         7: putstatic     #10                 // Field instance:Lext/mods/Crypta/PlayerEmailManager;
        10: return
      LineNumberTable:
        line 142: 0
}
SourceFile: "PlayerEmailManager.java"
NestHost: class ext/mods/Crypta/PlayerEmailManager
