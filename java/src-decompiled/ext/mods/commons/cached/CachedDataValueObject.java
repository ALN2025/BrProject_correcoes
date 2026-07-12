// Bytecode for: ext.mods.commons.cached.CachedDataValueObject
// File: ext\mods\commons\cached\CachedDataValueObject.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/cached/CachedDataValueObject.class
  Last modified 9 de jul de 2026; size 1908 bytes
  MD5 checksum b2c72e173d423c999529e4141a880e36
  Compiled from "CachedDataValueObject.java"
public class ext.mods.commons.cached.CachedDataValueObject<T extends java.lang.Object> extends ext.mods.commons.cached.CachedDataValue
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/cached/CachedDataValueObject
  super_class: #2                         // ext/mods/commons/cached/CachedDataValue
  interfaces: 0, fields: 2, methods: 4, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/commons/cached/CachedDataValue."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #2 = Class              #4             // ext/mods/commons/cached/CachedDataValue
   #3 = NameAndType        #5:#6          // "<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #4 = Utf8               ext/mods/commons/cached/CachedDataValue
   #5 = Utf8               <init>
   #6 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)V
   #7 = Fieldref           #8.#9          // ext/mods/commons/cached/CachedDataValueObject.converter:Lext/mods/commons/cached/CachedDataValueObject$Converter;
   #8 = Class              #10            // ext/mods/commons/cached/CachedDataValueObject
   #9 = NameAndType        #11:#12        // converter:Lext/mods/commons/cached/CachedDataValueObject$Converter;
  #10 = Utf8               ext/mods/commons/cached/CachedDataValueObject
  #11 = Utf8               converter
  #12 = Utf8               Lext/mods/commons/cached/CachedDataValueObject$Converter;
  #13 = Methodref          #2.#14         // ext/mods/commons/cached/CachedDataValue.load:()V
  #14 = NameAndType        #15:#16        // load:()V
  #15 = Utf8               load
  #16 = Utf8               ()V
  #17 = Methodref          #8.#18         // ext/mods/commons/cached/CachedDataValueObject.getValue:()Ljava/lang/String;
  #18 = NameAndType        #19:#20        // getValue:()Ljava/lang/String;
  #19 = Utf8               getValue
  #20 = Utf8               ()Ljava/lang/String;
  #21 = InterfaceMethodref #22.#23        // ext/mods/commons/cached/CachedDataValueObject$Converter.fromString:(Ljava/lang/String;)Ljava/lang/Object;
  #22 = Class              #24            // ext/mods/commons/cached/CachedDataValueObject$Converter
  #23 = NameAndType        #25:#26        // fromString:(Ljava/lang/String;)Ljava/lang/Object;
  #24 = Utf8               ext/mods/commons/cached/CachedDataValueObject$Converter
  #25 = Utf8               fromString
  #26 = Utf8               (Ljava/lang/String;)Ljava/lang/Object;
  #27 = Fieldref           #8.#28         // ext/mods/commons/cached/CachedDataValueObject.value:Ljava/lang/Object;
  #28 = NameAndType        #29:#30        // value:Ljava/lang/Object;
  #29 = Utf8               value
  #30 = Utf8               Ljava/lang/Object;
  #31 = InterfaceMethodref #22.#32        // ext/mods/commons/cached/CachedDataValueObject$Converter.toString:(Ljava/lang/Object;)Ljava/lang/String;
  #32 = NameAndType        #33:#34        // toString:(Ljava/lang/Object;)Ljava/lang/String;
  #33 = Utf8               toString
  #34 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #35 = Methodref          #8.#36         // ext/mods/commons/cached/CachedDataValueObject.setValue:(Ljava/lang/String;)V
  #36 = NameAndType        #37:#38        // setValue:(Ljava/lang/String;)V
  #37 = Utf8               setValue
  #38 = Utf8               (Ljava/lang/String;)V
  #39 = Utf8               Signature
  #40 = Utf8               Lext/mods/commons/cached/CachedDataValueObject$Converter<TT;>;
  #41 = Utf8               TT;
  #42 = Utf8               (Ljava/lang/String;Ljava/lang/String;ILext/mods/commons/cached/CachedDataValueObject$Converter;)V
  #43 = Utf8               Code
  #44 = Utf8               LineNumberTable
  #45 = Utf8               LocalVariableTable
  #46 = Utf8               this
  #47 = Utf8               Lext/mods/commons/cached/CachedDataValueObject;
  #48 = Utf8               valueName
  #49 = Utf8               Ljava/lang/String;
  #50 = Utf8               defaultValue
  #51 = Utf8               charId
  #52 = Utf8               I
  #53 = Utf8               LocalVariableTypeTable
  #54 = Utf8               Lext/mods/commons/cached/CachedDataValueObject<TT;>;
  #55 = Utf8               (Ljava/lang/String;Ljava/lang/String;ILext/mods/commons/cached/CachedDataValueObject$Converter<TT;>;)V
  #56 = Utf8               get
  #57 = Utf8               ()Ljava/lang/Object;
  #58 = Utf8               ()TT;
  #59 = Utf8               set
  #60 = Utf8               (Ljava/lang/Object;)V
  #61 = Utf8               (TT;)V
  #62 = Utf8               <T:Ljava/lang/Object;>Lext/mods/commons/cached/CachedDataValue;
  #63 = Utf8               SourceFile
  #64 = Utf8               CachedDataValueObject.java
  #65 = Utf8               NestMembers
  #66 = Utf8               InnerClasses
  #67 = Utf8               Converter
{
  ext.mods.commons.cached.CachedDataValueObject(java.lang.String, java.lang.String, int, ext.mods.commons.cached.CachedDataValueObject$Converter<T>);
    descriptor: (Ljava/lang/String;Ljava/lang/String;ILext/mods/commons/cached/CachedDataValueObject$Converter;)V
    flags: (0x0000)
    Code:
      stack=4, locals=5, args_size=5
         0: aload_0
         1: aload_1
         2: aload_2
         3: iload_3
         4: invokespecial #1                  // Method ext/mods/commons/cached/CachedDataValue."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
         7: aload_0
         8: aload         4
        10: putfield      #7                  // Field converter:Lext/mods/commons/cached/CachedDataValueObject$Converter;
        13: return
      LineNumberTable:
        line 27: 0
        line 28: 7
        line 29: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/cached/CachedDataValueObject;
            0      14     1 valueName   Ljava/lang/String;
            0      14     2 defaultValue   Ljava/lang/String;
            0      14     3 charId   I
            0      14     4 converter   Lext/mods/commons/cached/CachedDataValueObject$Converter;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/cached/CachedDataValueObject<TT;>;
            0      14     4 converter   Lext/mods/commons/cached/CachedDataValueObject$Converter<TT;>;
    Signature: #55                          // (Ljava/lang/String;Ljava/lang/String;ILext/mods/commons/cached/CachedDataValueObject$Converter<TT;>;)V

  void load();
    descriptor: ()V
    flags: (0x0000)
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #13                 // Method ext/mods/commons/cached/CachedDataValue.load:()V
         4: aload_0
         5: aload_0
         6: getfield      #7                  // Field converter:Lext/mods/commons/cached/CachedDataValueObject$Converter;
         9: aload_0
        10: invokevirtual #17                 // Method getValue:()Ljava/lang/String;
        13: invokeinterface #21,  2           // InterfaceMethod ext/mods/commons/cached/CachedDataValueObject$Converter.fromString:(Ljava/lang/String;)Ljava/lang/Object;
        18: putfield      #27                 // Field value:Ljava/lang/Object;
        21: return
      LineNumberTable:
        line 34: 0
        line 35: 4
        line 36: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/commons/cached/CachedDataValueObject;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/commons/cached/CachedDataValueObject<TT;>;

  public T get();
    descriptor: ()Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field value:Ljava/lang/Object;
         4: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/cached/CachedDataValueObject;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/cached/CachedDataValueObject<TT;>;
    Signature: #58                          // ()TT;

  public void set(T);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #27                 // Field value:Ljava/lang/Object;
         5: aload_0
         6: aload_0
         7: getfield      #7                  // Field converter:Lext/mods/commons/cached/CachedDataValueObject$Converter;
        10: aload_1
        11: invokeinterface #31,  2           // InterfaceMethod ext/mods/commons/cached/CachedDataValueObject$Converter.toString:(Ljava/lang/Object;)Ljava/lang/String;
        16: invokevirtual #35                 // Method setValue:(Ljava/lang/String;)V
        19: return
      LineNumberTable:
        line 45: 0
        line 46: 5
        line 47: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/cached/CachedDataValueObject;
            0      20     1 value   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/cached/CachedDataValueObject<TT;>;
            0      20     1 value   TT;
    Signature: #61                          // (TT;)V
}
Signature: #62                          // <T:Ljava/lang/Object;>Lext/mods/commons/cached/CachedDataValue;
SourceFile: "CachedDataValueObject.java"
NestMembers:
  ext/mods/commons/cached/CachedDataValueObject$Converter
InnerClasses:
  public static #67= #22 of #8;           // Converter=class ext/mods/commons/cached/CachedDataValueObject$Converter of class ext/mods/commons/cached/CachedDataValueObject
