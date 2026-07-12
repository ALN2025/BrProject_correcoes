// Bytecode for: ext.mods.battlerboss.register.BattleBossOpenRegister$SingletonHolder
// File: ext\mods\battlerboss\register\BattleBossOpenRegister$SingletonHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder.class
  Last modified 9 de jul de 2026; size 660 bytes
  MD5 checksum 23aece4acc9365dba5a81bd0134f4d94
  Compiled from "BattleBossOpenRegister.java"
class ext.mods.battlerboss.register.BattleBossOpenRegister$SingletonHolder
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/battlerboss/register/BattleBossOpenRegister
   #8 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister
   #9 = Methodref          #7.#3          // ext/mods/battlerboss/register/BattleBossOpenRegister."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder.INSTANCE:Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #11 = Class              #13            // ext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder
  #12 = NameAndType        #14:#15        // INSTANCE:Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #13 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder
  #14 = Utf8               INSTANCE
  #15 = Utf8               Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder;
  #21 = Utf8               <clinit>
  #22 = Utf8               SourceFile
  #23 = Utf8               BattleBossOpenRegister.java
  #24 = Utf8               NestHost
  #25 = Utf8               InnerClasses
  #26 = Utf8               SingletonHolder
{
  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #7                  // class ext/mods/battlerboss/register/BattleBossOpenRegister
         3: dup
         4: invokespecial #9                  // Method ext/mods/battlerboss/register/BattleBossOpenRegister."<init>":()V
         7: putstatic     #10                 // Field INSTANCE:Lext/mods/battlerboss/register/BattleBossOpenRegister;
        10: return
      LineNumberTable:
        line 307: 0
}
SourceFile: "BattleBossOpenRegister.java"
NestHost: class ext/mods/battlerboss/register/BattleBossOpenRegister
