// Bytecode for: ext.mods.gameserver.handler.TargetHandler$SingletonHolder
// File: ext\mods\gameserver\handler\TargetHandler$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/TargetHandler$SingletonHolder.class
  Last modified 9 de jul de 2026; size 607 bytes
  MD5 checksum 7e61cce9163b8935310540081fc2425b
  Compiled from "TargetHandler.java"
class ext.mods.gameserver.handler.TargetHandler$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/handler/TargetHandler$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/handler/TargetHandler
   #8 = Utf8               ext/mods/gameserver/handler/TargetHandler
   #9 = Methodref          #7.#3          // ext/mods/gameserver/handler/TargetHandler."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/gameserver/handler/TargetHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/TargetHandler;
  #11 = Class              #13            // ext/mods/gameserver/handler/TargetHandler$SingletonHolder
  #12 = NameAndType        #14:#15        // INSTANCE:Lext/mods/gameserver/handler/TargetHandler;
  #13 = Utf8               ext/mods/gameserver/handler/TargetHandler$SingletonHolder
  #14 = Utf8               INSTANCE
  #15 = Utf8               Lext/mods/gameserver/handler/TargetHandler;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/gameserver/handler/TargetHandler$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               TargetHandler.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  protected static final ext.mods.gameserver.handler.TargetHandler INSTANCE;
    descriptor: Lext/mods/gameserver/handler/TargetHandler;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/gameserver/handler/TargetHandler
         3: dup
         4: invokespecial #9                  // Method ext/mods/gameserver/handler/TargetHandler."<init>":()V
         7: putstatic     #10                 // Field INSTANCE:Lext/mods/gameserver/handler/TargetHandler;
        10: return
      LineNumberTable:
        line 42: 0
}
SourceFile: "TargetHandler.java"
NestHost: class ext/mods/gameserver/handler/TargetHandler
