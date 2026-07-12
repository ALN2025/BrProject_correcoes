// Bytecode for: ext.mods.Crypta.AgathionData$SingletonHolder
// File: ext\mods\Crypta\AgathionData$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Crypta/AgathionData$SingletonHolder.class
  Last modified 9 de jul de 2026; size 555 bytes
  MD5 checksum 746905657ca4a0159c78e5fb24ffbaae
  Compiled from "AgathionData.java"
class ext.mods.Crypta.AgathionData$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/Crypta/AgathionData$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/Crypta/AgathionData
   #8 = Utf8               ext/mods/Crypta/AgathionData
   #9 = Methodref          #7.#3          // ext/mods/Crypta/AgathionData."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/Crypta/AgathionData$SingletonHolder._instance:Lext/mods/Crypta/AgathionData;
  #11 = Class              #13            // ext/mods/Crypta/AgathionData$SingletonHolder
  #12 = NameAndType        #14:#15        // _instance:Lext/mods/Crypta/AgathionData;
  #13 = Utf8               ext/mods/Crypta/AgathionData$SingletonHolder
  #14 = Utf8               _instance
  #15 = Utf8               Lext/mods/Crypta/AgathionData;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/Crypta/AgathionData$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               AgathionData.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  protected static final ext.mods.Crypta.AgathionData _instance;
    descriptor: Lext/mods/Crypta/AgathionData;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/Crypta/AgathionData
         3: dup
         4: invokespecial #9                  // Method ext/mods/Crypta/AgathionData."<init>":()V
         7: putstatic     #10                 // Field _instance:Lext/mods/Crypta/AgathionData;
        10: return
      LineNumberTable:
        line 86: 0
}
SourceFile: "AgathionData.java"
NestHost: class ext/mods/Crypta/AgathionData
