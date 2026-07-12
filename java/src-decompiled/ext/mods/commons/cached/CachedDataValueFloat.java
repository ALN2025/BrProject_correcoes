// Bytecode for: ext.mods.commons.cached.CachedDataValueFloat
// File: ext\mods\commons\cached\CachedDataValueFloat.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/cached/CachedDataValueFloat.class
  Last modified 9 de jul de 2026; size 1033 bytes
  MD5 checksum cbe639c177b9798a788da6275990ad0b
  Compiled from "CachedDataValueFloat.java"
public class ext.mods.commons.cached.CachedDataValueFloat extends ext.mods.commons.cached.CachedDataValue
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/commons/cached/CachedDataValueFloat
  super_class: #8                         // ext/mods/commons/cached/CachedDataValue
  interfaces: 0, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Float.toString:(F)Ljava/lang/String;
   #2 = Class              #4             // java/lang/Float
   #3 = NameAndType        #5:#6          // toString:(F)Ljava/lang/String;
   #4 = Utf8               java/lang/Float
   #5 = Utf8               toString
   #6 = Utf8               (F)Ljava/lang/String;
   #7 = Methodref          #8.#9          // ext/mods/commons/cached/CachedDataValue."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #8 = Class              #10            // ext/mods/commons/cached/CachedDataValue
   #9 = NameAndType        #11:#12        // "<init>":(Ljava/lang/String;Ljava/lang/String;I)V
  #10 = Utf8               ext/mods/commons/cached/CachedDataValue
  #11 = Utf8               <init>
  #12 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)V
  #13 = Fieldref           #14.#15        // ext/mods/commons/cached/CachedDataValueFloat.value:F
  #14 = Class              #16            // ext/mods/commons/cached/CachedDataValueFloat
  #15 = NameAndType        #17:#18        // value:F
  #16 = Utf8               ext/mods/commons/cached/CachedDataValueFloat
  #17 = Utf8               value
  #18 = Utf8               F
  #19 = Methodref          #8.#20         // ext/mods/commons/cached/CachedDataValue.load:()V
  #20 = NameAndType        #21:#22        // load:()V
  #21 = Utf8               load
  #22 = Utf8               ()V
  #23 = Methodref          #14.#24        // ext/mods/commons/cached/CachedDataValueFloat.getValue:()Ljava/lang/String;
  #24 = NameAndType        #25:#26        // getValue:()Ljava/lang/String;
  #25 = Utf8               getValue
  #26 = Utf8               ()Ljava/lang/String;
  #27 = Methodref          #2.#28         // java/lang/Float.parseFloat:(Ljava/lang/String;)F
  #28 = NameAndType        #29:#30        // parseFloat:(Ljava/lang/String;)F
  #29 = Utf8               parseFloat
  #30 = Utf8               (Ljava/lang/String;)F
  #31 = Methodref          #14.#32        // ext/mods/commons/cached/CachedDataValueFloat.setValue:(Ljava/lang/String;)V
  #32 = NameAndType        #33:#34        // setValue:(Ljava/lang/String;)V
  #33 = Utf8               setValue
  #34 = Utf8               (Ljava/lang/String;)V
  #35 = Utf8               (Ljava/lang/String;FI)V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/commons/cached/CachedDataValueFloat;
  #41 = Utf8               name
  #42 = Utf8               Ljava/lang/String;
  #43 = Utf8               defaultValue
  #44 = Utf8               charId
  #45 = Utf8               I
  #46 = Utf8               get
  #47 = Utf8               ()F
  #48 = Utf8               set
  #49 = Utf8               (F)V
  #50 = Utf8               SourceFile
  #51 = Utf8               CachedDataValueFloat.java
{
  ext.mods.commons.cached.CachedDataValueFloat(java.lang.String, float, int);
    descriptor: (Ljava/lang/String;FI)V
    flags: (0x0000)
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: fload_2
         3: invokestatic  #1                  // Method java/lang/Float.toString:(F)Ljava/lang/String;
         6: iload_3
         7: invokespecial #7                  // Method ext/mods/commons/cached/CachedDataValue."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
        10: aload_0
        11: fload_2
        12: putfield      #13                 // Field value:F
        15: return
      LineNumberTable:
        line 26: 0
        line 27: 10
        line 28: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/cached/CachedDataValueFloat;
            0      16     1  name   Ljava/lang/String;
            0      16     2 defaultValue   F
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
         9: invokestatic  #27                 // Method java/lang/Float.parseFloat:(Ljava/lang/String;)F
        12: putfield      #13                 // Field value:F
        15: return
      LineNumberTable:
        line 33: 0
        line 34: 4
        line 35: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/cached/CachedDataValueFloat;

  public float get();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field value:F
         4: freturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/cached/CachedDataValueFloat;

  public void set(float);
    descriptor: (F)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: fload_1
         2: putfield      #13                 // Field value:F
         5: aload_0
         6: fload_1
         7: invokestatic  #1                  // Method java/lang/Float.toString:(F)Ljava/lang/String;
        10: invokevirtual #31                 // Method setValue:(Ljava/lang/String;)V
        13: return
      LineNumberTable:
        line 44: 0
        line 45: 5
        line 46: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/cached/CachedDataValueFloat;
            0      14     1 value   F
}
SourceFile: "CachedDataValueFloat.java"
