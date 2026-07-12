// Bytecode for: ext.mods.commons.gui.InterfaceCoroutinePoolMetrics$1
// File: ext\mods\commons\gui\InterfaceCoroutinePoolMetrics$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1.class
  Last modified 9 de jul de 2026; size 865 bytes
  MD5 checksum 1ca4949c95206fda9cd484bf0788d974
  Compiled from "InterfaceCoroutinePoolMetrics.java"
class ext.mods.commons.gui.InterfaceCoroutinePoolMetrics$1 extends java.util.TimerTask
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1
  super_class: #14                        // java/util/TimerTask
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1.this$0:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;
   #8 = Class              #10            // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;
  #10 = Utf8               ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;
  #13 = Methodref          #14.#15        // java/util/TimerTask."<init>":()V
  #14 = Class              #16            // java/util/TimerTask
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/util/TimerTask
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Methodref          #20.#21        // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.update:()V
  #20 = Class              #22            // ext/mods/commons/gui/InterfaceCoroutinePoolMetrics
  #21 = NameAndType        #23:#18        // update:()V
  #22 = Utf8               ext/mods/commons/gui/InterfaceCoroutinePoolMetrics
  #23 = Utf8               update
  #24 = Utf8               (Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;)V
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               LocalVariableTable
  #28 = Utf8               this
  #29 = Utf8               Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1;
  #30 = Utf8               MethodParameters
  #31 = Utf8               run
  #32 = Utf8               SourceFile
  #33 = Utf8               InterfaceCoroutinePoolMetrics.java
  #34 = Utf8               EnclosingMethod
  #35 = Utf8               NestHost
  #36 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.InterfaceCoroutinePoolMetrics this$0;
    descriptor: Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceCoroutinePoolMetrics$1(ext.mods.commons.gui.InterfaceCoroutinePoolMetrics);
    descriptor: (Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;
        10: aload_0
        11: invokespecial #13                 // Method java/util/TimerTask."<init>":()V
        14: return
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1;
            0      15     1 this$0   Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics;
         4: invokevirtual #19                 // Method ext/mods/commons/gui/InterfaceCoroutinePoolMetrics.update:()V
         7: return
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1;
}
SourceFile: "InterfaceCoroutinePoolMetrics.java"
EnclosingMethod: #20.#15                // ext.mods.commons.gui.InterfaceCoroutinePoolMetrics.<init>
NestHost: class ext/mods/commons/gui/InterfaceCoroutinePoolMetrics
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/InterfaceCoroutinePoolMetrics$1
