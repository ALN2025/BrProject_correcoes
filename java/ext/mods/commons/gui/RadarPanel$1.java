// Bytecode for: ext.mods.commons.gui.RadarPanel$1
// File: ext\mods\commons\gui\RadarPanel$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/RadarPanel$1.class
  Last modified 9 de jul de 2026; size 1414 bytes
  MD5 checksum b1fb1d49f0e815ed6955943b9cd4400f
  Compiled from "RadarPanel.java"
class ext.mods.commons.gui.RadarPanel$1 extends java.util.TimerTask
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/RadarPanel$1
  super_class: #14                        // java/util/TimerTask
  interfaces: 0, fields: 1, methods: 3, attributes: 5
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/RadarPanel$1.this$0:Lext/mods/commons/gui/RadarPanel;
   #8 = Class              #10            // ext/mods/commons/gui/RadarPanel$1
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/RadarPanel;
  #10 = Utf8               ext/mods/commons/gui/RadarPanel$1
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/RadarPanel;
  #13 = Methodref          #14.#15        // java/util/TimerTask."<init>":()V
  #14 = Class              #16            // java/util/TimerTask
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/util/TimerTask
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = InvokeDynamic      #0:#20         // #0:run:(Lext/mods/commons/gui/RadarPanel$1;)Ljava/lang/Runnable;
  #20 = NameAndType        #21:#22        // run:(Lext/mods/commons/gui/RadarPanel$1;)Ljava/lang/Runnable;
  #21 = Utf8               run
  #22 = Utf8               (Lext/mods/commons/gui/RadarPanel$1;)Ljava/lang/Runnable;
  #23 = Methodref          #24.#25        // javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
  #24 = Class              #26            // javax/swing/SwingUtilities
  #25 = NameAndType        #27:#28        // invokeLater:(Ljava/lang/Runnable;)V
  #26 = Utf8               javax/swing/SwingUtilities
  #27 = Utf8               invokeLater
  #28 = Utf8               (Ljava/lang/Runnable;)V
  #29 = Methodref          #30.#31        // ext/mods/commons/gui/RadarPanel.repaint:()V
  #30 = Class              #32            // ext/mods/commons/gui/RadarPanel
  #31 = NameAndType        #33:#18        // repaint:()V
  #32 = Utf8               ext/mods/commons/gui/RadarPanel
  #33 = Utf8               repaint
  #34 = Utf8               (Lext/mods/commons/gui/RadarPanel;)V
  #35 = Utf8               Code
  #36 = Utf8               LineNumberTable
  #37 = Utf8               LocalVariableTable
  #38 = Utf8               this
  #39 = Utf8               Lext/mods/commons/gui/RadarPanel$1;
  #40 = Utf8               MethodParameters
  #41 = Utf8               lambda$run$0
  #42 = Utf8               SourceFile
  #43 = Utf8               RadarPanel.java
  #44 = Utf8               EnclosingMethod
  #45 = Utf8               NestHost
  #46 = Utf8               BootstrapMethods
  #47 = MethodType         #18            //  ()V
  #48 = MethodHandle       5:#49          // REF_invokeVirtual ext/mods/commons/gui/RadarPanel$1.lambda$run$0:()V
  #49 = Methodref          #8.#50         // ext/mods/commons/gui/RadarPanel$1.lambda$run$0:()V
  #50 = NameAndType        #41:#18        // lambda$run$0:()V
  #51 = MethodHandle       6:#52          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #52 = Methodref          #53.#54        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #53 = Class              #55            // java/lang/invoke/LambdaMetafactory
  #54 = NameAndType        #56:#57        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #55 = Utf8               java/lang/invoke/LambdaMetafactory
  #56 = Utf8               metafactory
  #57 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #58 = Utf8               InnerClasses
  #59 = Class              #60            // java/lang/invoke/MethodHandles$Lookup
  #60 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #61 = Class              #62            // java/lang/invoke/MethodHandles
  #62 = Utf8               java/lang/invoke/MethodHandles
  #63 = Utf8               Lookup
{
  final ext.mods.commons.gui.RadarPanel this$0;
    descriptor: Lext/mods/commons/gui/RadarPanel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.RadarPanel$1(ext.mods.commons.gui.RadarPanel);
    descriptor: (Lext/mods/commons/gui/RadarPanel;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/commons/gui/RadarPanel;
        10: aload_0
        11: invokespecial #13                 // Method java/util/TimerTask."<init>":()V
        14: return
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/RadarPanel$1;
            0      15     1 this$0   Lext/mods/commons/gui/RadarPanel;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #19,  0             // InvokeDynamic #0:run:(Lext/mods/commons/gui/RadarPanel$1;)Ljava/lang/Runnable;
         6: invokestatic  #23                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
         9: return
      LineNumberTable:
        line 44: 0
        line 45: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/gui/RadarPanel$1;
}
SourceFile: "RadarPanel.java"
EnclosingMethod: #30.#15                // ext.mods.commons.gui.RadarPanel.<init>
NestHost: class ext/mods/commons/gui/RadarPanel
BootstrapMethods:
  0: #51 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #47 ()V
      #48 REF_invokeVirtual ext/mods/commons/gui/RadarPanel$1.lambda$run$0:()V
      #47 ()V
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/RadarPanel$1
  public static final #63= #59 of #61;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
