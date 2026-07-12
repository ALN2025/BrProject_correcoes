// Bytecode for: ext.mods.commons.util.PriorityQueueSet
// File: ext\mods\commons\util\PriorityQueueSet.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/util/PriorityQueueSet.class
  Last modified 9 de jul de 2026; size 1186 bytes
  MD5 checksum 57d4acba2f63f86be54260c08b5a9711
  Compiled from "PriorityQueueSet.java"
public class ext.mods.commons.util.PriorityQueueSet<T extends java.lang.Object> extends java.util.PriorityQueue<T>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/commons/util/PriorityQueueSet
  super_class: #2                         // java/util/PriorityQueue
  interfaces: 0, fields: 2, methods: 4, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // java/util/PriorityQueue."<init>":()V
   #2 = Class              #4             // java/util/PriorityQueue
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/util/PriorityQueue
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/util/HashSet
   #8 = Utf8               java/util/HashSet
   #9 = Methodref          #7.#3          // java/util/HashSet."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/commons/util/PriorityQueueSet._set:Ljava/util/HashSet;
  #11 = Class              #13            // ext/mods/commons/util/PriorityQueueSet
  #12 = NameAndType        #14:#15        // _set:Ljava/util/HashSet;
  #13 = Utf8               ext/mods/commons/util/PriorityQueueSet
  #14 = Utf8               _set
  #15 = Utf8               Ljava/util/HashSet;
  #16 = Methodref          #7.#17         // java/util/HashSet.add:(Ljava/lang/Object;)Z
  #17 = NameAndType        #18:#19        // add:(Ljava/lang/Object;)Z
  #18 = Utf8               add
  #19 = Utf8               (Ljava/lang/Object;)Z
  #20 = Methodref          #2.#17         // java/util/PriorityQueue.add:(Ljava/lang/Object;)Z
  #21 = Methodref          #7.#22         // java/util/HashSet.remove:(Ljava/lang/Object;)Z
  #22 = NameAndType        #23:#19        // remove:(Ljava/lang/Object;)Z
  #23 = Utf8               remove
  #24 = Methodref          #2.#22         // java/util/PriorityQueue.remove:(Ljava/lang/Object;)Z
  #25 = Methodref          #7.#26         // java/util/HashSet.contains:(Ljava/lang/Object;)Z
  #26 = NameAndType        #27:#19        // contains:(Ljava/lang/Object;)Z
  #27 = Utf8               contains
  #28 = Utf8               serialVersionUID
  #29 = Utf8               J
  #30 = Utf8               ConstantValue
  #31 = Long               1l
  #33 = Utf8               Signature
  #34 = Utf8               Ljava/util/HashSet<TT;>;
  #35 = Utf8               Code
  #36 = Utf8               LineNumberTable
  #37 = Utf8               LocalVariableTable
  #38 = Utf8               this
  #39 = Utf8               Lext/mods/commons/util/PriorityQueueSet;
  #40 = Utf8               LocalVariableTypeTable
  #41 = Utf8               Lext/mods/commons/util/PriorityQueueSet<TT;>;
  #42 = Utf8               element
  #43 = Utf8               Ljava/lang/Object;
  #44 = Utf8               TT;
  #45 = Utf8               StackMapTable
  #46 = Utf8               (TT;)Z
  #47 = Utf8               <T:Ljava/lang/Object;>Ljava/util/PriorityQueue<TT;>;
  #48 = Utf8               SourceFile
  #49 = Utf8               PriorityQueueSet.java
{
  public ext.mods.commons.util.PriorityQueueSet();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/util/PriorityQueue."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashSet
         8: dup
         9: invokespecial #9                  // Method java/util/HashSet."<init>":()V
        12: putfield      #10                 // Field _set:Ljava/util/HashSet;
        15: return
      LineNumberTable:
        line 30: 0
        line 31: 4
        line 32: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/util/PriorityQueueSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/util/PriorityQueueSet<TT;>;

  public boolean add(T);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _set:Ljava/util/HashSet;
         4: aload_1
         5: invokevirtual #16                 // Method java/util/HashSet.add:(Ljava/lang/Object;)Z
         8: ifeq          17
        11: aload_0
        12: aload_1
        13: invokespecial #20                 // Method java/util/PriorityQueue.add:(Ljava/lang/Object;)Z
        16: ireturn
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 37: 0
        line 38: 11
        line 40: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/util/PriorityQueueSet;
            0      19     1 element   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/util/PriorityQueueSet<TT;>;
            0      19     1 element   TT;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */
    Signature: #46                          // (TT;)Z

  public boolean remove(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _set:Ljava/util/HashSet;
         4: aload_1
         5: invokevirtual #21                 // Method java/util/HashSet.remove:(Ljava/lang/Object;)Z
         8: ifeq          17
        11: aload_0
        12: aload_1
        13: invokespecial #24                 // Method java/util/PriorityQueue.remove:(Ljava/lang/Object;)Z
        16: ireturn
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 46: 0
        line 47: 11
        line 49: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/util/PriorityQueueSet;
            0      19     1 element   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/util/PriorityQueueSet<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  public boolean contains(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _set:Ljava/util/HashSet;
         4: aload_1
         5: invokevirtual #25                 // Method java/util/HashSet.contains:(Ljava/lang/Object;)Z
         8: ireturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/util/PriorityQueueSet;
            0       9     1 element   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/util/PriorityQueueSet<TT;>;
}
Signature: #47                          // <T:Ljava/lang/Object;>Ljava/util/PriorityQueue<TT;>;
SourceFile: "PriorityQueueSet.java"
