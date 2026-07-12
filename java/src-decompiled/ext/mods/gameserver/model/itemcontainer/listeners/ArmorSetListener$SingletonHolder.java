// Bytecode for: ext.mods.gameserver.model.itemcontainer.listeners.ArmorSetListener$SingletonHolder
// File: ext\mods\gameserver\model\itemcontainer\listeners\ArmorSetListener$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder.class
  Last modified 9 de jul de 2026; size 710 bytes
  MD5 checksum 80921bf1e398457e83f7c9a8ed773c08
  Compiled from "ArmorSetListener.java"
class ext.mods.gameserver.model.itemcontainer.listeners.ArmorSetListener$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener
   #8 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener
   #9 = Methodref          #7.#3          // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
  #11 = Class              #13            // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder
  #12 = NameAndType        #14:#15        // INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
  #13 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder
  #14 = Utf8               INSTANCE
  #15 = Utf8               Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               ArmorSetListener.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  protected static final ext.mods.gameserver.model.itemcontainer.listeners.ArmorSetListener INSTANCE;
    descriptor: Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener
         3: dup
         4: invokespecial #9                  // Method ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener."<init>":()V
         7: putstatic     #10                 // Field INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
        10: return
      LineNumberTable:
        line 179: 0
}
SourceFile: "ArmorSetListener.java"
NestHost: class ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener
