// Bytecode for: ext.mods.gameserver.data.manager.RaidPointManager$SingletonHolder
// File: ext\mods\gameserver\data\manager\RaidPointManager$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder.class
  Last modified 9 de jul de 2026; size 642 bytes
  MD5 checksum b96cabd96e3d3a8313c6dfc8e6dd681d
  Compiled from "RaidPointManager.java"
class ext.mods.gameserver.data.manager.RaidPointManager$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/data/manager/RaidPointManager
   #8 = Utf8               ext/mods/gameserver/data/manager/RaidPointManager
   #9 = Methodref          #7.#3          // ext/mods/gameserver/data/manager/RaidPointManager."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/RaidPointManager;
  #11 = Class              #13            // ext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder
  #12 = NameAndType        #14:#15        // INSTANCE:Lext/mods/gameserver/data/manager/RaidPointManager;
  #13 = Utf8               ext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder
  #14 = Utf8               INSTANCE
  #15 = Utf8               Lext/mods/gameserver/data/manager/RaidPointManager;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               RaidPointManager.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  protected static final ext.mods.gameserver.data.manager.RaidPointManager INSTANCE;
    descriptor: Lext/mods/gameserver/data/manager/RaidPointManager;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/gameserver/data/manager/RaidPointManager
         3: dup
         4: invokespecial #9                  // Method ext/mods/gameserver/data/manager/RaidPointManager."<init>":()V
         7: putstatic     #10                 // Field INSTANCE:Lext/mods/gameserver/data/manager/RaidPointManager;
        10: return
      LineNumberTable:
        line 197: 0
}
SourceFile: "RaidPointManager.java"
NestHost: class ext/mods/gameserver/data/manager/RaidPointManager
