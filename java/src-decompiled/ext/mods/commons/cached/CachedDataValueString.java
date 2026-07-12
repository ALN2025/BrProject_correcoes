// Bytecode for: ext.mods.commons.cached.CachedDataValueString
// File: ext\mods\commons\cached\CachedDataValueString.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/cached/CachedDataValueString.class
  Last modified 9 de jul de 2026; size 735 bytes
  MD5 checksum df7d291015a11cf402f7380aa2d75cae
  Compiled from "CachedDataValueString.java"
public class ext.mods.commons.cached.CachedDataValueString extends ext.mods.commons.cached.CachedDataValue
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/cached/CachedDataValueString
  super_class: #2                         // ext/mods/commons/cached/CachedDataValue
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/commons/cached/CachedDataValue."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #2 = Class              #4             // ext/mods/commons/cached/CachedDataValue
   #3 = NameAndType        #5:#6          // "<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #4 = Utf8               ext/mods/commons/cached/CachedDataValue
   #5 = Utf8               <init>
   #6 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)V
   #7 = Methodref          #8.#9          // ext/mods/commons/cached/CachedDataValueString.getValue:()Ljava/lang/String;
   #8 = Class              #10            // ext/mods/commons/cached/CachedDataValueString
   #9 = NameAndType        #11:#12        // getValue:()Ljava/lang/String;
  #10 = Utf8               ext/mods/commons/cached/CachedDataValueString
  #11 = Utf8               getValue
  #12 = Utf8               ()Ljava/lang/String;
  #13 = Methodref          #8.#14         // ext/mods/commons/cached/CachedDataValueString.setValue:(Ljava/lang/String;)V
  #14 = NameAndType        #15:#16        // setValue:(Ljava/lang/String;)V
  #15 = Utf8               setValue
  #16 = Utf8               (Ljava/lang/String;)V
  #17 = Utf8               Code
  #18 = Utf8               LineNumberTable
  #19 = Utf8               LocalVariableTable
  #20 = Utf8               this
  #21 = Utf8               Lext/mods/commons/cached/CachedDataValueString;
  #22 = Utf8               name
  #23 = Utf8               Ljava/lang/String;
  #24 = Utf8               defaultValue
  #25 = Utf8               charId
  #26 = Utf8               I
  #27 = Utf8               get
  #28 = Utf8               set
  #29 = Utf8               value
  #30 = Utf8               SourceFile
  #31 = Utf8               CachedDataValueString.java
{
  ext.mods.commons.cached.CachedDataValueString(java.lang.String, java.lang.String, int);
    descriptor: (Ljava/lang/String;Ljava/lang/String;I)V
    flags: (0x0000)
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: iload_3
         4: invokespecial #1                  // Method ext/mods/commons/cached/CachedDataValue."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
         7: return
      LineNumberTable:
        line 24: 0
        line 25: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/cached/CachedDataValueString;
            0       8     1  name   Ljava/lang/String;
            0       8     2 defaultValue   Ljava/lang/String;
            0       8     3 charId   I

  public java.lang.String get();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getValue:()Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/cached/CachedDataValueString;

  public void set(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #13                 // Method setValue:(Ljava/lang/String;)V
         5: return
      LineNumberTable:
        line 34: 0
        line 35: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/cached/CachedDataValueString;
            0       6     1 value   Ljava/lang/String;
}
SourceFile: "CachedDataValueString.java"
