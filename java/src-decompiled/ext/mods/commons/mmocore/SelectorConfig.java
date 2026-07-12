// Bytecode for: ext.mods.commons.mmocore.SelectorConfig
// File: ext\mods\commons\mmocore\SelectorConfig.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/SelectorConfig.class
  Last modified 9 de jul de 2026; size 702 bytes
  MD5 checksum b003fe22f2e7558b71bcd6f68c6022e7
  Compiled from "SelectorConfig.java"
public final class ext.mods.commons.mmocore.SelectorConfig
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #9                          // ext/mods/commons/mmocore/SelectorConfig
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Integer            65536
   #8 = Fieldref           #9.#10         // ext/mods/commons/mmocore/SelectorConfig.READ_BUFFER_SIZE:I
   #9 = Class              #11            // ext/mods/commons/mmocore/SelectorConfig
  #10 = NameAndType        #12:#13        // READ_BUFFER_SIZE:I
  #11 = Utf8               ext/mods/commons/mmocore/SelectorConfig
  #12 = Utf8               READ_BUFFER_SIZE
  #13 = Utf8               I
  #14 = Fieldref           #9.#15         // ext/mods/commons/mmocore/SelectorConfig.WRITE_BUFFER_SIZE:I
  #15 = NameAndType        #16:#13        // WRITE_BUFFER_SIZE:I
  #16 = Utf8               WRITE_BUFFER_SIZE
  #17 = Fieldref           #9.#18         // ext/mods/commons/mmocore/SelectorConfig.HELPER_BUFFER_COUNT:I
  #18 = NameAndType        #19:#13        // HELPER_BUFFER_COUNT:I
  #19 = Utf8               HELPER_BUFFER_COUNT
  #20 = Fieldref           #9.#21         // ext/mods/commons/mmocore/SelectorConfig.HELPER_BUFFER_SIZE:I
  #21 = NameAndType        #22:#13        // HELPER_BUFFER_SIZE:I
  #22 = Utf8               HELPER_BUFFER_SIZE
  #23 = Fieldref           #9.#24         // ext/mods/commons/mmocore/SelectorConfig.MAX_SEND_PER_PASS:I
  #24 = NameAndType        #25:#13        // MAX_SEND_PER_PASS:I
  #25 = Utf8               MAX_SEND_PER_PASS
  #26 = Fieldref           #9.#27         // ext/mods/commons/mmocore/SelectorConfig.MAX_READ_PER_PASS:I
  #27 = NameAndType        #28:#13        // MAX_READ_PER_PASS:I
  #28 = Utf8               MAX_READ_PER_PASS
  #29 = Fieldref           #9.#30         // ext/mods/commons/mmocore/SelectorConfig.SLEEP_TIME:I
  #30 = NameAndType        #31:#13        // SLEEP_TIME:I
  #31 = Utf8               SLEEP_TIME
  #32 = Fieldref           #9.#33         // ext/mods/commons/mmocore/SelectorConfig.TCP_NODELAY:Z
  #33 = NameAndType        #34:#35        // TCP_NODELAY:Z
  #34 = Utf8               TCP_NODELAY
  #35 = Utf8               Z
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/commons/mmocore/SelectorConfig;
  #41 = Utf8               SourceFile
  #42 = Utf8               SelectorConfig.java
{
  public int READ_BUFFER_SIZE;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int WRITE_BUFFER_SIZE;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int HELPER_BUFFER_COUNT;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int HELPER_BUFFER_SIZE;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int MAX_SEND_PER_PASS;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int MAX_READ_PER_PASS;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int SLEEP_TIME;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public boolean TCP_NODELAY;
    descriptor: Z
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.commons.mmocore.SelectorConfig();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: ldc           #7                  // int 65536
         7: putfield      #8                  // Field READ_BUFFER_SIZE:I
        10: aload_0
        11: ldc           #7                  // int 65536
        13: putfield      #14                 // Field WRITE_BUFFER_SIZE:I
        16: aload_0
        17: bipush        20
        19: putfield      #17                 // Field HELPER_BUFFER_COUNT:I
        22: aload_0
        23: ldc           #7                  // int 65536
        25: putfield      #20                 // Field HELPER_BUFFER_SIZE:I
        28: aload_0
        29: bipush        10
        31: putfield      #23                 // Field MAX_SEND_PER_PASS:I
        34: aload_0
        35: bipush        10
        37: putfield      #26                 // Field MAX_READ_PER_PASS:I
        40: aload_0
        41: bipush        10
        43: putfield      #29                 // Field SLEEP_TIME:I
        46: aload_0
        47: iconst_1
        48: putfield      #32                 // Field TCP_NODELAY:Z
        51: return
      LineNumberTable:
        line 20: 0
        line 22: 4
        line 23: 10
        line 25: 16
        line 26: 22
        line 32: 28
        line 38: 34
        line 48: 40
        line 58: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/commons/mmocore/SelectorConfig;
}
SourceFile: "SelectorConfig.java"
