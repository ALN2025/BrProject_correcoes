// Bytecode for: ext.mods.commons.cached.CachedDataValueObject$Converter
// File: ext\mods\commons\cached\CachedDataValueObject$Converter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/cached/CachedDataValueObject$Converter.class
  Last modified 9 de jul de 2026; size 523 bytes
  MD5 checksum 6c484d2f9cd32921e920a959322d2421
  Compiled from "CachedDataValueObject.java"
public interface ext.mods.commons.cached.CachedDataValueObject$Converter<T extends java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/commons/cached/CachedDataValueObject$Converter
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/commons/cached/CachedDataValueObject$Converter
   #2 = Utf8               ext/mods/commons/cached/CachedDataValueObject$Converter
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               fromString
   #6 = Utf8               (Ljava/lang/String;)Ljava/lang/Object;
   #7 = Utf8               Signature
   #8 = Utf8               (Ljava/lang/String;)TT;
   #9 = Utf8               toString
  #10 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #11 = Utf8               (TT;)Ljava/lang/String;
  #12 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/Object;
  #13 = Utf8               SourceFile
  #14 = Utf8               CachedDataValueObject.java
  #15 = Utf8               NestHost
  #16 = Class              #17            // ext/mods/commons/cached/CachedDataValueObject
  #17 = Utf8               ext/mods/commons/cached/CachedDataValueObject
  #18 = Utf8               InnerClasses
  #19 = Utf8               Converter
{
  public abstract T fromString(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    Signature: #8                           // (Ljava/lang/String;)TT;

  public abstract java.lang.String toString(T);
    descriptor: (Ljava/lang/Object;)Ljava/lang/String;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    Signature: #11                          // (TT;)Ljava/lang/String;
}
Signature: #12                          // <T:Ljava/lang/Object;>Ljava/lang/Object;
SourceFile: "CachedDataValueObject.java"
NestHost: class ext/mods/commons/cached/CachedDataValueObject
InnerClasses:
  public static #19= #1 of #16;           // Converter=class ext/mods/commons/cached/CachedDataValueObject$Converter of class ext/mods/commons/cached/CachedDataValueObject
