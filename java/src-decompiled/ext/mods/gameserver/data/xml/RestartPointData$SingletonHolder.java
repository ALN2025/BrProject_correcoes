// Bytecode for: ext.mods.gameserver.data.xml.RestartPointData$SingletonHolder
// File: ext\mods\gameserver\data\xml\RestartPointData$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/RestartPointData$SingletonHolder.class
  Last modified 9 de jul de 2026; size 626 bytes
  MD5 checksum cf6419fee27db9855a144d44db8f5e4b
  Compiled from "RestartPointData.java"
class ext.mods.gameserver.data.xml.RestartPointData$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/RestartPointData$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/data/xml/RestartPointData
   #8 = Utf8               ext/mods/gameserver/data/xml/RestartPointData
   #9 = Methodref          #7.#3          // ext/mods/gameserver/data/xml/RestartPointData."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/gameserver/data/xml/RestartPointData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/RestartPointData;
  #11 = Class              #13            // ext/mods/gameserver/data/xml/RestartPointData$SingletonHolder
  #12 = NameAndType        #14:#15        // INSTANCE:Lext/mods/gameserver/data/xml/RestartPointData;
  #13 = Utf8               ext/mods/gameserver/data/xml/RestartPointData$SingletonHolder
  #14 = Utf8               INSTANCE
  #15 = Utf8               Lext/mods/gameserver/data/xml/RestartPointData;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/gameserver/data/xml/RestartPointData$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               RestartPointData.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  protected static final ext.mods.gameserver.data.xml.RestartPointData INSTANCE;
    descriptor: Lext/mods/gameserver/data/xml/RestartPointData;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/gameserver/data/xml/RestartPointData
         3: dup
         4: invokespecial #9                  // Method ext/mods/gameserver/data/xml/RestartPointData."<init>":()V
         7: putstatic     #10                 // Field INSTANCE:Lext/mods/gameserver/data/xml/RestartPointData;
        10: return
      LineNumberTable:
        line 422: 0
}
SourceFile: "RestartPointData.java"
NestHost: class ext/mods/gameserver/data/xml/RestartPointData
