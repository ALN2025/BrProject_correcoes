// Bytecode for: ext.mods.commons.cached.CachedDataValueShort
// File: ext\mods\commons\cached\CachedDataValueShort.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/cached/CachedDataValueShort.class
  Last modified 9 de jul de 2026; size 1033 bytes
  MD5 checksum 1a8ed474b74eb848bc619631abb11921
  Compiled from "CachedDataValueShort.java"
public class ext.mods.commons.cached.CachedDataValueShort extends ext.mods.commons.cached.CachedDataValue
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/commons/cached/CachedDataValueShort
  super_class: #8                         // ext/mods/commons/cached/CachedDataValue
  interfaces: 0, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Short.toString:(S)Ljava/lang/String;
   #2 = Class              #4             // java/lang/Short
   #3 = NameAndType        #5:#6          // toString:(S)Ljava/lang/String;
   #4 = Utf8               java/lang/Short
   #5 = Utf8               toString
   #6 = Utf8               (S)Ljava/lang/String;
   #7 = Methodref          #8.#9          // ext/mods/commons/cached/CachedDataValue."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #8 = Class              #10            // ext/mods/commons/cached/CachedDataValue
   #9 = NameAndType        #11:#12        // "<init>":(Ljava/lang/String;Ljava/lang/String;I)V
  #10 = Utf8               ext/mods/commons/cached/CachedDataValue
  #11 = Utf8               <init>
  #12 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)V
  #13 = Fieldref           #14.#15        // ext/mods/commons/cached/CachedDataValueShort.value:S
  #14 = Class              #16            // ext/mods/commons/cached/CachedDataValueShort
  #15 = NameAndType        #17:#18        // value:S
  #16 = Utf8               ext/mods/commons/cached/CachedDataValueShort
  #17 = Utf8               value
  #18 = Utf8               S
  #19 = Methodref          #8.#20         // ext/mods/commons/cached/CachedDataValue.load:()V
  #20 = NameAndType        #21:#22        // load:()V
  #21 = Utf8               load
  #22 = Utf8               ()V
  #23 = Methodref          #14.#24        // ext/mods/commons/cached/CachedDataValueShort.getValue:()Ljava/lang/String;
  #24 = NameAndType        #25:#26        // getValue:()Ljava/lang/String;
  #25 = Utf8               getValue
  #26 = Utf8               ()Ljava/lang/String;
  #27 = Methodref          #2.#28         // java/lang/Short.parseShort:(Ljava/lang/String;)S
  #28 = NameAndType        #29:#30        // parseShort:(Ljava/lang/String;)S
  #29 = Utf8               parseShort
  #30 = Utf8               (Ljava/lang/String;)S
  #31 = Methodref          #14.#32        // ext/mods/commons/cached/CachedDataValueShort.setValue:(Ljava/lang/String;)V
  #32 = NameAndType        #33:#34        // setValue:(Ljava/lang/String;)V
  #33 = Utf8               setValue
  #34 = Utf8               (Ljava/lang/String;)V
  #35 = Utf8               (Ljava/lang/String;SI)V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/commons/cached/CachedDataValueShort;
  #41 = Utf8               name
  #42 = Utf8               Ljava/lang/String;
  #43 = Utf8               defaultValue
  #44 = Utf8               charId
  #45 = Utf8               I
  #46 = Utf8               get
  #47 = Utf8               ()S
  #48 = Utf8               set
  #49 = Utf8               (S)V
  #50 = Utf8               SourceFile
  #51 = Utf8               CachedDataValueShort.java
{
  ext.mods.commons.cached.CachedDataValueShort(java.lang.String, short, int);
    descriptor: (Ljava/lang/String;SI)V
    flags: (0x0000)
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokestatic  #1                  // Method java/lang/Short.toString:(S)Ljava/lang/String;
         6: iload_3
         7: invokespecial #7                  // Method ext/mods/commons/cached/CachedDataValue."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
        10: aload_0
        11: iload_2
        12: putfield      #13                 // Field value:S
        15: return
      LineNumberTable:
        line 26: 0
        line 27: 10
        line 28: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/cached/CachedDataValueShort;
            0      16     1  name   Ljava/lang/String;
            0      16     2 defaultValue   S
            0      16     3 charId   I

  void load();
    descriptor: ()V
    flags: (0x0000)
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #19                 // Method ext/mods/commons/cached/CachedDataValue.load:()V
         4: aload_0
         5: aload_0
         6: invokevirtual #23                 // Method getValue:()Ljava/lang/String;
         9: invokestatic  #27                 // Method java/lang/Short.parseShort:(Ljava/lang/String;)S
        12: putfield      #13                 // Field value:S
        15: return
      LineNumberTable:
        line 33: 0
        line 34: 4
        line 35: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/cached/CachedDataValueShort;

  public short get();
    descriptor: ()S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field value:S
         4: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/cached/CachedDataValueShort;

  public void set(short);
    descriptor: (S)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field value:S
         5: aload_0
         6: iload_1
         7: invokestatic  #1                  // Method java/lang/Short.toString:(S)Ljava/lang/String;
        10: invokevirtual #31                 // Method setValue:(Ljava/lang/String;)V
        13: return
      LineNumberTable:
        line 44: 0
        line 45: 5
        line 46: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/cached/CachedDataValueShort;
            0      14     1 value   S
}
SourceFile: "CachedDataValueShort.java"
