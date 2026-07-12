// Bytecode for: ext.mods.gameserver.handler.BypassHandler$Singleton
// File: ext\mods\gameserver\handler\BypassHandler$Singleton.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/BypassHandler$Singleton.class
  Last modified 9 de jul de 2026; size 589 bytes
  MD5 checksum 02c2d52b1285b5e163b1dd569e79c1ca
  Compiled from "BypassHandler.java"
class ext.mods.gameserver.handler.BypassHandler$Singleton
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/handler/BypassHandler$Singleton
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/handler/BypassHandler
   #8 = Utf8               ext/mods/gameserver/handler/BypassHandler
   #9 = Methodref          #7.#3          // ext/mods/gameserver/handler/BypassHandler."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/gameserver/handler/BypassHandler$Singleton.INSTANCE:Lext/mods/gameserver/handler/BypassHandler;
  #11 = Class              #13            // ext/mods/gameserver/handler/BypassHandler$Singleton
  #12 = NameAndType        #14:#15        // INSTANCE:Lext/mods/gameserver/handler/BypassHandler;
  #13 = Utf8               ext/mods/gameserver/handler/BypassHandler$Singleton
  #14 = Utf8               INSTANCE
  #15 = Utf8               Lext/mods/gameserver/handler/BypassHandler;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/gameserver/handler/BypassHandler$Singleton;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               BypassHandler.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               Singleton
{
  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/gameserver/handler/BypassHandler
         3: dup
         4: invokespecial #9                  // Method ext/mods/gameserver/handler/BypassHandler."<init>":()V
         7: putstatic     #10                 // Field INSTANCE:Lext/mods/gameserver/handler/BypassHandler;
        10: return
      LineNumberTable:
        line 53: 0
}
SourceFile: "BypassHandler.java"
NestHost: class ext/mods/gameserver/handler/BypassHandler
