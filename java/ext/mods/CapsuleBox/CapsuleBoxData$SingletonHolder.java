// Bytecode for: ext.mods.CapsuleBox.CapsuleBoxData$SingletonHolder
// File: ext\mods\CapsuleBox\CapsuleBoxData$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder.class
  Last modified 9 de jul de 2026; size 580 bytes
  MD5 checksum d7890ce9824fdb97fba3c78255ca6b28
  Compiled from "CapsuleBoxData.java"
class ext.mods.CapsuleBox.CapsuleBoxData$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/CapsuleBox/CapsuleBoxData
   #8 = Utf8               ext/mods/CapsuleBox/CapsuleBoxData
   #9 = Methodref          #7.#3          // ext/mods/CapsuleBox/CapsuleBoxData."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder.INSTANCE:Lext/mods/CapsuleBox/CapsuleBoxData;
  #11 = Class              #13            // ext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder
  #12 = NameAndType        #14:#15        // INSTANCE:Lext/mods/CapsuleBox/CapsuleBoxData;
  #13 = Utf8               ext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder
  #14 = Utf8               INSTANCE
  #15 = Utf8               Lext/mods/CapsuleBox/CapsuleBoxData;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               CapsuleBoxData.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  protected static final ext.mods.CapsuleBox.CapsuleBoxData INSTANCE;
    descriptor: Lext/mods/CapsuleBox/CapsuleBoxData;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/CapsuleBox/CapsuleBoxData
         3: dup
         4: invokespecial #9                  // Method ext/mods/CapsuleBox/CapsuleBoxData."<init>":()V
         7: putstatic     #10                 // Field INSTANCE:Lext/mods/CapsuleBox/CapsuleBoxData;
        10: return
      LineNumberTable:
        line 55: 0
}
SourceFile: "CapsuleBoxData.java"
NestHost: class ext/mods/CapsuleBox/CapsuleBoxData
