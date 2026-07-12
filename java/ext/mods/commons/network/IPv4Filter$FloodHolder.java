// Bytecode for: ext.mods.commons.network.IPv4Filter$FloodHolder
// File: ext\mods\commons\network\IPv4Filter$FloodHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/network/IPv4Filter$FloodHolder.class
  Last modified 9 de jul de 2026; size 792 bytes
  MD5 checksum 1c4644c9b6ed87b9211983ac76b349ff
  Compiled from "IPv4Filter.java"
public final class ext.mods.commons.network.IPv4Filter$FloodHolder
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #20                         // ext/mods/commons/network/IPv4Filter$FloodHolder
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
  #13 = Methodref          #14.#15        // java/lang/System.currentTimeMillis:()J
  #14 = Class              #16            // java/lang/System
  #15 = NameAndType        #17:#18        // currentTimeMillis:()J
  #16 = Utf8               java/lang/System
  #17 = Utf8               currentTimeMillis
  #18 = Utf8               ()J
  #19 = Fieldref           #20.#21        // ext/mods/commons/network/IPv4Filter$FloodHolder.lastAccess:J
  #20 = Class              #22            // ext/mods/commons/network/IPv4Filter$FloodHolder
  #21 = NameAndType        #23:#24        // lastAccess:J
  #22 = Utf8               ext/mods/commons/network/IPv4Filter$FloodHolder
  #23 = Utf8               lastAccess
  #24 = Utf8               J
  #25 = Utf8               tries
  #26 = Utf8               I
  #27 = Utf8               (Lext/mods/commons/network/IPv4Filter;)V
  #28 = Utf8               Code
  #29 = Utf8               LineNumberTable
  #30 = Utf8               LocalVariableTable
  #31 = Utf8               this
  #32 = Utf8               Lext/mods/commons/network/IPv4Filter$FloodHolder;
  #33 = Utf8               this$0
  #34 = Utf8               Lext/mods/commons/network/IPv4Filter;
  #35 = Utf8               MethodParameters
  #36 = Utf8               SourceFile
  #37 = Utf8               IPv4Filter.java
  #38 = Utf8               NestHost
  #39 = Class              #40            // ext/mods/commons/network/IPv4Filter
  #40 = Utf8               ext/mods/commons/network/IPv4Filter
  #41 = Utf8               InnerClasses
  #42 = Utf8               FloodHolder
{
  protected long lastAccess;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  protected int tries;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.commons.network.IPv4Filter$FloodHolder(ext.mods.commons.network.IPv4Filter);
    descriptor: (Lext/mods/commons/network/IPv4Filter;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: dup
         2: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokespecial #7                  // Method java/lang/Object."<init>":()V
        11: aload_0
        12: invokestatic  #13                 // Method java/lang/System.currentTimeMillis:()J
        15: putfield      #19                 // Field lastAccess:J
        18: return
      LineNumberTable:
        line 97: 0
        line 99: 11
        line 97: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/network/IPv4Filter$FloodHolder;
            0      19     1 this$0   Lext/mods/commons/network/IPv4Filter;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
}
SourceFile: "IPv4Filter.java"
NestHost: class ext/mods/commons/network/IPv4Filter
InnerClasses:
  protected final #42= #20 of #39;        // FloodHolder=class ext/mods/commons/network/IPv4Filter$FloodHolder of class ext/mods/commons/network/IPv4Filter
