// Bytecode for: ext.mods.commons.mmocore.NioNetStackList$NioNetStackNode
// File: ext\mods\commons\mmocore\NioNetStackList$NioNetStackNode.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode.class
  Last modified 9 de jul de 2026; size 843 bytes
  MD5 checksum b6ce0194ab210855fc27721e70165990
  Compiled from "NioNetStackList.java"
final class ext.mods.commons.mmocore.NioNetStackList$NioNetStackNode
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #13                         // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
  super_class: #8                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Methodref          #8.#9          // java/lang/Object."<init>":()V
   #8 = Class              #10            // java/lang/Object
   #9 = NameAndType        #11:#12        // "<init>":()V
  #10 = Utf8               java/lang/Object
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Class              #14            // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
  #14 = Utf8               ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
  #15 = Utf8               _next
  #16 = Utf8               Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #17 = Utf8               Signature
  #18 = Utf8               Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;
  #19 = Utf8               _value
  #20 = Utf8               Ljava/lang/Object;
  #21 = Utf8               TE;
  #22 = Utf8               (Lext/mods/commons/mmocore/NioNetStackList;)V
  #23 = Utf8               Code
  #24 = Utf8               LineNumberTable
  #25 = Utf8               LocalVariableTable
  #26 = Utf8               this
  #27 = Utf8               LocalVariableTypeTable
  #28 = Utf8               MethodParameters
  #29 = Utf8               SourceFile
  #30 = Utf8               NioNetStackList.java
  #31 = Utf8               NestHost
  #32 = Class              #33            // ext/mods/commons/mmocore/NioNetStackList
  #33 = Utf8               ext/mods/commons/mmocore/NioNetStackList
  #34 = Utf8               InnerClasses
  #35 = Utf8               NioNetStackNode
{
  protected ext.mods.commons.mmocore.NioNetStackList<E>.NioNetStackNode _next;
    descriptor: Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
    flags: (0x0004) ACC_PROTECTED
    Signature: #18                          // Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;

  protected E _value;
    descriptor: Ljava/lang/Object;
    flags: (0x0004) ACC_PROTECTED
    Signature: #21                          // TE;

  protected ext.mods.commons.mmocore.NioNetStackList$NioNetStackNode(ext.mods.commons.mmocore.NioNetStackList);
    descriptor: (Lext/mods/commons/mmocore/NioNetStackList;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: dup
         2: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokespecial #7                  // Method java/lang/Object."<init>":()V
        11: return
      LineNumberTable:
        line 67: 0
        line 69: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic
}
SourceFile: "NioNetStackList.java"
NestHost: class ext/mods/commons/mmocore/NioNetStackList
