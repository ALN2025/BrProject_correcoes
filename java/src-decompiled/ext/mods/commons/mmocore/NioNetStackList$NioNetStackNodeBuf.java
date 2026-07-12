// Bytecode for: ext.mods.commons.mmocore.NioNetStackList$NioNetStackNodeBuf
// File: ext\mods\commons\mmocore\NioNetStackList$NioNetStackNodeBuf.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf.class
  Last modified 9 de jul de 2026; size 1891 bytes
  MD5 checksum 081deb8db0435578c01281573cc43b0c
  Compiled from "NioNetStackList.java"
final class ext.mods.commons.mmocore.NioNetStackList$NioNetStackNodeBuf
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf
  super_class: #14                        // java/lang/Object
  interfaces: 0, fields: 3, methods: 3, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf.this$0:Lext/mods/commons/mmocore/NioNetStackList;
   #8 = Class              #10            // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/mmocore/NioNetStackList;
  #10 = Utf8               ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/mmocore/NioNetStackList;
  #13 = Methodref          #14.#15        // java/lang/Object."<init>":()V
  #14 = Class              #16            // java/lang/Object
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/lang/Object
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Class              #20            // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
  #20 = Utf8               ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
  #21 = Methodref          #19.#22        // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode."<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
  #22 = NameAndType        #17:#23        // "<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
  #23 = Utf8               (Lext/mods/commons/mmocore/NioNetStackList;)V
  #24 = Fieldref           #8.#25         // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf._start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #25 = NameAndType        #26:#27        // _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #26 = Utf8               _start
  #27 = Utf8               Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #28 = Fieldref           #8.#29         // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf._end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #29 = NameAndType        #30:#27        // _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #30 = Utf8               _end
  #31 = Fieldref           #19.#32        // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #32 = NameAndType        #33:#27        // _next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #33 = Utf8               _next
  #34 = Fieldref           #19.#35        // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._value:Ljava/lang/Object;
  #35 = NameAndType        #36:#37        // _value:Ljava/lang/Object;
  #36 = Utf8               _value
  #37 = Utf8               Ljava/lang/Object;
  #38 = Utf8               Signature
  #39 = Utf8               Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;
  #40 = Utf8               Code
  #41 = Utf8               LineNumberTable
  #42 = Utf8               LocalVariableTable
  #43 = Utf8               this
  #44 = Utf8               Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf;
  #45 = Utf8               LocalVariableTypeTable
  #46 = Utf8               Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNodeBuf;
  #47 = Utf8               MethodParameters
  #48 = Utf8               addLast
  #49 = Utf8               (Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;)V
  #50 = Utf8               node
  #51 = Utf8               (Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;)V
  #52 = Utf8               removeFirst
  #53 = Utf8               ()Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #54 = Utf8               old
  #55 = Utf8               StackMapTable
  #56 = Utf8               ()Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;
  #57 = Utf8               SourceFile
  #58 = Utf8               NioNetStackList.java
  #59 = Utf8               NestHost
  #60 = Class              #61            // ext/mods/commons/mmocore/NioNetStackList
  #61 = Utf8               ext/mods/commons/mmocore/NioNetStackList
  #62 = Utf8               InnerClasses
  #63 = Utf8               NioNetStackNodeBuf
  #64 = Utf8               NioNetStackNode
{
  final ext.mods.commons.mmocore.NioNetStackList this$0;
    descriptor: Lext/mods/commons/mmocore/NioNetStackList;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.mmocore.NioNetStackList$NioNetStackNodeBuf(ext.mods.commons.mmocore.NioNetStackList);
    descriptor: (Lext/mods/commons/mmocore/NioNetStackList;)V
    flags: (0x0000)
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/commons/mmocore/NioNetStackList;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: aload_0
        15: new           #19                 // class ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
        18: dup
        19: aload_0
        20: getfield      #7                  // Field this$0:Lext/mods/commons/mmocore/NioNetStackList;
        23: invokespecial #21                 // Method ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode."<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
        26: putfield      #24                 // Field _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        29: aload_0
        30: new           #19                 // class ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
        33: dup
        34: aload_0
        35: getfield      #7                  // Field this$0:Lext/mods/commons/mmocore/NioNetStackList;
        38: invokespecial #21                 // Method ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode."<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
        41: putfield      #28                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        44: aload_0
        45: getfield      #24                 // Field _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        48: aload_0
        49: getfield      #28                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        52: putfield      #31                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        55: return
      LineNumberTable:
        line 79: 0
        line 74: 14
        line 76: 29
        line 80: 44
        line 81: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNodeBuf;
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic

  final void addLast(ext.mods.commons.mmocore.NioNetStackList<E>.NioNetStackNode);
    descriptor: (Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;)V
    flags: (0x0010) ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: aconst_null
         2: putfield      #31                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
         5: aload_1
         6: aconst_null
         7: putfield      #34                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._value:Ljava/lang/Object;
        10: aload_0
        11: getfield      #28                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        14: aload_1
        15: putfield      #31                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        18: aload_0
        19: aload_1
        20: putfield      #28                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        23: return
      LineNumberTable:
        line 85: 0
        line 86: 5
        line 87: 10
        line 88: 18
        line 89: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf;
            0      24     1  node   Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNodeBuf;
            0      24     1  node   Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;
    Signature: #51                          // (Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;)V

  final ext.mods.commons.mmocore.NioNetStackList<E>.NioNetStackNode removeFirst();
    descriptor: ()Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
    flags: (0x0010) ACC_FINAL
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
         4: getfield      #31                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
         7: aload_0
         8: getfield      #28                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        11: if_acmpne     26
        14: new           #19                 // class ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
        17: dup
        18: aload_0
        19: getfield      #7                  // Field this$0:Lext/mods/commons/mmocore/NioNetStackList;
        22: invokespecial #21                 // Method ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode."<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
        25: areturn
        26: aload_0
        27: getfield      #24                 // Field _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        30: getfield      #31                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        33: astore_1
        34: aload_0
        35: getfield      #24                 // Field _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        38: aload_1
        39: getfield      #31                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        42: putfield      #31                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        45: aload_1
        46: areturn
      LineNumberTable:
        line 93: 0
        line 94: 14
        line 96: 26
        line 97: 34
        line 98: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf;
           34      13     1   old   Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNodeBuf;
           34      13     1   old   Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;
      StackMapTable: number_of_entries = 1
        frame_type = 26 /* same */
    Signature: #56                          // ()Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;
}
SourceFile: "NioNetStackList.java"
NestHost: class ext/mods/commons/mmocore/NioNetStackList
