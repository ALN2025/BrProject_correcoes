// Bytecode for: ext.mods.commons.mmocore.NioNetStackList
// File: ext\mods\commons\mmocore\NioNetStackList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/NioNetStackList.class
  Last modified 9 de jul de 2026; size 2109 bytes
  MD5 checksum e5275f0f552f29edc3c1be39edd7c0b5
  Compiled from "NioNetStackList.java"
public final class ext.mods.commons.mmocore.NioNetStackList<E extends java.lang.Object> extends java.lang.Object
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #13                         // ext/mods/commons/mmocore/NioNetStackList
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 5, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
   #8 = Utf8               ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
   #9 = Methodref          #7.#10         // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode."<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
  #10 = NameAndType        #5:#11         // "<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
  #11 = Utf8               (Lext/mods/commons/mmocore/NioNetStackList;)V
  #12 = Fieldref           #13.#14        // ext/mods/commons/mmocore/NioNetStackList._start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #13 = Class              #15            // ext/mods/commons/mmocore/NioNetStackList
  #14 = NameAndType        #16:#17        // _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #15 = Utf8               ext/mods/commons/mmocore/NioNetStackList
  #16 = Utf8               _start
  #17 = Utf8               Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #18 = Class              #19            // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf
  #19 = Utf8               ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf
  #20 = Methodref          #18.#10        // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf."<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
  #21 = Fieldref           #13.#22        // ext/mods/commons/mmocore/NioNetStackList._buf:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf;
  #22 = NameAndType        #23:#24        // _buf:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf;
  #23 = Utf8               _buf
  #24 = Utf8               Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf;
  #25 = Fieldref           #13.#26        // ext/mods/commons/mmocore/NioNetStackList._end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #26 = NameAndType        #27:#17        // _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #27 = Utf8               _end
  #28 = Methodref          #13.#29        // ext/mods/commons/mmocore/NioNetStackList.clear:()V
  #29 = NameAndType        #30:#6         // clear:()V
  #30 = Utf8               clear
  #31 = Methodref          #18.#32        // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf.removeFirst:()Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #32 = NameAndType        #33:#34        // removeFirst:()Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #33 = Utf8               removeFirst
  #34 = Utf8               ()Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #35 = Fieldref           #7.#36         // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._value:Ljava/lang/Object;
  #36 = NameAndType        #37:#38        // _value:Ljava/lang/Object;
  #37 = Utf8               _value
  #38 = Utf8               Ljava/lang/Object;
  #39 = Fieldref           #7.#40         // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #40 = NameAndType        #41:#17        // _next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
  #41 = Utf8               _next
  #42 = Methodref          #18.#43        // ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf.addLast:(Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;)V
  #43 = NameAndType        #44:#45        // addLast:(Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;)V
  #44 = Utf8               addLast
  #45 = Utf8               (Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;)V
  #46 = Utf8               Signature
  #47 = Utf8               Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;
  #48 = Utf8               Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNodeBuf;
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               LocalVariableTable
  #52 = Utf8               this
  #53 = Utf8               Lext/mods/commons/mmocore/NioNetStackList;
  #54 = Utf8               LocalVariableTypeTable
  #55 = Utf8               Lext/mods/commons/mmocore/NioNetStackList<TE;>;
  #56 = Utf8               (Ljava/lang/Object;)V
  #57 = Utf8               elem
  #58 = Utf8               newEndNode
  #59 = Utf8               TE;
  #60 = Utf8               (TE;)V
  #61 = Utf8               ()Ljava/lang/Object;
  #62 = Utf8               old
  #63 = Utf8               value
  #64 = Utf8               ()TE;
  #65 = Utf8               isEmpty
  #66 = Utf8               ()Z
  #67 = Utf8               StackMapTable
  #68 = Utf8               <E:Ljava/lang/Object;>Ljava/lang/Object;
  #69 = Utf8               SourceFile
  #70 = Utf8               NioNetStackList.java
  #71 = Utf8               NestMembers
  #72 = Utf8               InnerClasses
  #73 = Utf8               NioNetStackNode
  #74 = Utf8               NioNetStackNodeBuf
{
  public ext.mods.commons.mmocore.NioNetStackList();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
         8: dup
         9: aload_0
        10: invokespecial #9                  // Method ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode."<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
        13: putfield      #12                 // Field _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        16: aload_0
        17: new           #18                 // class ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf
        20: dup
        21: aload_0
        22: invokespecial #20                 // Method ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf."<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
        25: putfield      #21                 // Field _buf:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf;
        28: aload_0
        29: new           #7                  // class ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
        32: dup
        33: aload_0
        34: invokespecial #9                  // Method ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode."<init>":(Lext/mods/commons/mmocore/NioNetStackList;)V
        37: putfield      #25                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        40: aload_0
        41: invokevirtual #28                 // Method clear:()V
        44: return
      LineNumberTable:
        line 29: 0
        line 22: 4
        line 24: 16
        line 26: 28
        line 30: 40
        line 31: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/commons/mmocore/NioNetStackList;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/commons/mmocore/NioNetStackList<TE;>;

  public final void addLast(E);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #21                 // Field _buf:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf;
         4: invokevirtual #31                 // Method ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf.removeFirst:()Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
         7: astore_2
         8: aload_0
         9: getfield      #25                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        12: aload_1
        13: putfield      #35                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._value:Ljava/lang/Object;
        16: aload_0
        17: getfield      #25                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        20: aload_2
        21: putfield      #39                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        24: aload_0
        25: aload_2
        26: putfield      #25                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        29: return
      LineNumberTable:
        line 35: 0
        line 36: 8
        line 37: 16
        line 38: 24
        line 39: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/commons/mmocore/NioNetStackList;
            0      30     1  elem   Ljava/lang/Object;
            8      22     2 newEndNode   Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/commons/mmocore/NioNetStackList<TE;>;
            0      30     1  elem   TE;
            8      22     2 newEndNode   Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;
    Signature: #60                          // (TE;)V

  public final E removeFirst();
    descriptor: ()Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
         4: getfield      #39                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
         7: astore_1
         8: aload_1
         9: getfield      #35                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._value:Ljava/lang/Object;
        12: astore_2
        13: aload_0
        14: getfield      #12                 // Field _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        17: aload_1
        18: getfield      #39                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        21: putfield      #39                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        24: aload_0
        25: getfield      #21                 // Field _buf:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf;
        28: aload_1
        29: invokevirtual #42                 // Method ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf.addLast:(Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;)V
        32: aload_2
        33: areturn
      LineNumberTable:
        line 43: 0
        line 44: 8
        line 45: 13
        line 46: 24
        line 47: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/commons/mmocore/NioNetStackList;
            8      26     1   old   Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
           13      21     2 value   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/commons/mmocore/NioNetStackList<TE;>;
            8      26     1   old   Lext/mods/commons/mmocore/NioNetStackList<TE;>.NioNetStackNode;
           13      21     2 value   TE;
    Signature: #64                          // ()TE;

  public final boolean isEmpty();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
         4: getfield      #39                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
         7: aload_0
         8: getfield      #25                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        11: if_acmpne     18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/mmocore/NioNetStackList;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/mmocore/NioNetStackList<TE;>;
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final void clear();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _start:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
         4: aload_0
         5: getfield      #25                 // Field _end:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
         8: putfield      #39                 // Field ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode._next:Lext/mods/commons/mmocore/NioNetStackList$NioNetStackNode;
        11: return
      LineNumberTable:
        line 57: 0
        line 58: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/mmocore/NioNetStackList;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/mmocore/NioNetStackList<TE;>;
}
Signature: #68                          // <E:Ljava/lang/Object;>Ljava/lang/Object;
SourceFile: "NioNetStackList.java"
NestMembers:
  ext/mods/commons/mmocore/NioNetStackList$NioNetStackNodeBuf
  ext/mods/commons/mmocore/NioNetStackList$NioNetStackNode
