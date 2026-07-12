// Bytecode for: ext.mods.extensions.interfaces.L2JExtension
// File: ext\mods\extensions\interfaces\L2JExtension.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/interfaces/L2JExtension.class
  Last modified 9 de jul de 2026; size 220 bytes
  MD5 checksum 5326d8c2c69e9c9a141079b8afc412ce
  Compiled from "L2JExtension.java"
public interface ext.mods.extensions.interfaces.L2JExtension
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/interfaces/L2JExtension
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/extensions/interfaces/L2JExtension
   #2 = Utf8               ext/mods/extensions/interfaces/L2JExtension
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               onLoad
   #6 = Utf8               ()V
   #7 = Utf8               onDisable
   #8 = Utf8               getName
   #9 = Utf8               ()Ljava/lang/String;
  #10 = Utf8               SourceFile
  #11 = Utf8               L2JExtension.java
{
  public abstract void onLoad();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void onDisable();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "L2JExtension.java"
