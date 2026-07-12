// Bytecode for: ext.mods.commons.cached.CachedDataValueInt
// File: ext\mods\commons\cached\CachedDataValueInt.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/cached/CachedDataValueInt.class
  Last modified 9 de jul de 2026; size 1023 bytes
  MD5 checksum 4704a520977a0502154634be2098a5a0
  Compiled from "CachedDataValueInt.java"
public class ext.mods.commons.cached.CachedDataValueInt extends ext.mods.commons.cached.CachedDataValue
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/commons/cached/CachedDataValueInt
  super_class: #8                         // ext/mods/commons/cached/CachedDataValue
  interfaces: 0, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Integer.toString:(I)Ljava/lang/String;
   #2 = Class              #4             // java/lang/Integer
   #3 = NameAndType        #5:#6          // toString:(I)Ljava/lang/String;
   #4 = Utf8               java/lang/Integer
   #5 = Utf8               toString
   #6 = Utf8               (I)Ljava/lang/String;
   #7 = Methodref          #8.#9          // ext/mods/commons/cached/CachedDataValue."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #8 = Class              #10            // ext/mods/commons/cached/CachedDataValue
   #9 = NameAndType        #11:#12        // "<init>":(Ljava/lang/String;Ljava/lang/String;I)V
  #10 = Utf8               ext/mods/commons/cached/CachedDataValue
  #11 = Utf8               <init>
  #12 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)V
  #13 = Fieldref           #14.#15        // ext/mods/commons/cached/CachedDataValueInt.value:I
  #14 = Class              #16            // ext/mods/commons/cached/CachedDataValueInt
  #15 = NameAndType        #17:#18        // value:I
  #16 = Utf8               ext/mods/commons/cached/CachedDataValueInt
  #17 = Utf8               value
  #18 = Utf8               I
  #19 = Methodref          #8.#20         // ext/mods/commons/cached/CachedDataValue.load:()V
  #20 = NameAndType        #21:#22        // load:()V
  #21 = Utf8               load
  #22 = Utf8               ()V
  #23 = Methodref          #14.#24        // ext/mods/commons/cached/CachedDataValueInt.getValue:()Ljava/lang/String;
  #24 = NameAndType        #25:#26        // getValue:()Ljava/lang/String;
  #25 = Utf8               getValue
  #26 = Utf8               ()Ljava/lang/String;
  #27 = Methodref          #2.#28         // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #28 = NameAndType        #29:#30        // parseInt:(Ljava/lang/String;)I
  #29 = Utf8               parseInt
  #30 = Utf8               (Ljava/lang/String;)I
  #31 = Methodref          #14.#32        // ext/mods/commons/cached/CachedDataValueInt.setValue:(Ljava/lang/String;)V
  #32 = NameAndType        #33:#34        // setValue:(Ljava/lang/String;)V
  #33 = Utf8               setValue
  #34 = Utf8               (Ljava/lang/String;)V
  #35 = Utf8               (Ljava/lang/String;II)V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/commons/cached/CachedDataValueInt;
  #41 = Utf8               name
  #42 = Utf8               Ljava/lang/String;
  #43 = Utf8               defaultValue
  #44 = Utf8               charId
  #45 = Utf8               get
  #46 = Utf8               ()I
  #47 = Utf8               set
  #48 = Utf8               (I)V
  #49 = Utf8               SourceFile
  #50 = Utf8               CachedDataValueInt.java
{
  ext.mods.commons.cached.CachedDataValueInt(java.lang.String, int, int);
    descriptor: (Ljava/lang/String;II)V
    flags: (0x0000)
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokestatic  #1                  // Method java/lang/Integer.toString:(I)Ljava/lang/String;
         6: iload_3
         7: invokespecial #7                  // Method ext/mods/commons/cached/CachedDataValue."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
        10: aload_0
        11: iload_2
        12: putfield      #13                 // Field value:I
        15: return
      LineNumberTable:
        line 26: 0
        line 27: 10
        line 28: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/cached/CachedDataValueInt;
            0      16     1  name   Ljava/lang/String;
            0      16     2 defaultValue   I
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
         9: invokestatic  #27                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        12: putfield      #13                 // Field value:I
        15: return
      LineNumberTable:
        line 33: 0
        line 34: 4
        line 35: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/cached/CachedDataValueInt;

  public int get();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field value:I
         4: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/cached/CachedDataValueInt;

  public void set(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field value:I
         5: aload_0
         6: iload_1
         7: invokestatic  #1                  // Method java/lang/Integer.toString:(I)Ljava/lang/String;
        10: invokevirtual #31                 // Method setValue:(Ljava/lang/String;)V
        13: return
      LineNumberTable:
        line 44: 0
        line 45: 5
        line 46: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/cached/CachedDataValueInt;
            0      14     1 value   I
}
SourceFile: "CachedDataValueInt.java"
