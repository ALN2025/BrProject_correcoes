// Bytecode for: ext.mods.commons.gui.ModernUI$NeonButton$1
// File: ext\mods\commons\gui\ModernUI$NeonButton$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ModernUI$NeonButton$1.class
  Last modified 9 de jul de 2026; size 1155 bytes
  MD5 checksum bd59dd18ce1177b8600d2f09277d81e8
  Compiled from "ModernUI.java"
class ext.mods.commons.gui.ModernUI$NeonButton$1 extends java.awt.event.MouseAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/ModernUI$NeonButton$1
  super_class: #14                        // java/awt/event/MouseAdapter
  interfaces: 0, fields: 1, methods: 3, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/ModernUI$NeonButton$1.this$0:Lext/mods/commons/gui/ModernUI$NeonButton;
   #8 = Class              #10            // ext/mods/commons/gui/ModernUI$NeonButton$1
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/ModernUI$NeonButton;
  #10 = Utf8               ext/mods/commons/gui/ModernUI$NeonButton$1
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/ModernUI$NeonButton;
  #13 = Methodref          #14.#15        // java/awt/event/MouseAdapter."<init>":()V
  #14 = Class              #16            // java/awt/event/MouseAdapter
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/awt/event/MouseAdapter
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Fieldref           #20.#21        // ext/mods/commons/gui/ModernUI$NeonButton.isHovered:Z
  #20 = Class              #22            // ext/mods/commons/gui/ModernUI$NeonButton
  #21 = NameAndType        #23:#24        // isHovered:Z
  #22 = Utf8               ext/mods/commons/gui/ModernUI$NeonButton
  #23 = Utf8               isHovered
  #24 = Utf8               Z
  #25 = Methodref          #20.#26        // ext/mods/commons/gui/ModernUI$NeonButton.repaint:()V
  #26 = NameAndType        #27:#18        // repaint:()V
  #27 = Utf8               repaint
  #28 = Utf8               (Lext/mods/commons/gui/ModernUI$NeonButton;)V
  #29 = Utf8               Code
  #30 = Utf8               LineNumberTable
  #31 = Utf8               LocalVariableTable
  #32 = Utf8               this
  #33 = Utf8               Lext/mods/commons/gui/ModernUI$NeonButton$1;
  #34 = Utf8               MethodParameters
  #35 = Utf8               mouseEntered
  #36 = Utf8               (Ljava/awt/event/MouseEvent;)V
  #37 = Utf8               e
  #38 = Utf8               Ljava/awt/event/MouseEvent;
  #39 = Utf8               mouseExited
  #40 = Utf8               SourceFile
  #41 = Utf8               ModernUI.java
  #42 = Utf8               EnclosingMethod
  #43 = NameAndType        #17:#44        // "<init>":(Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;ZLjavax/swing/Icon;)V
  #44 = Utf8               (Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;ZLjavax/swing/Icon;)V
  #45 = Utf8               NestHost
  #46 = Class              #47            // ext/mods/commons/gui/ModernUI
  #47 = Utf8               ext/mods/commons/gui/ModernUI
  #48 = Utf8               InnerClasses
  #49 = Utf8               NeonButton
{
  final ext.mods.commons.gui.ModernUI$NeonButton this$0;
    descriptor: Lext/mods/commons/gui/ModernUI$NeonButton;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.ModernUI$NeonButton$1(ext.mods.commons.gui.ModernUI$NeonButton);
    descriptor: (Lext/mods/commons/gui/ModernUI$NeonButton;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/commons/gui/ModernUI$NeonButton;
        10: aload_0
        11: invokespecial #13                 // Method java/awt/event/MouseAdapter."<init>":()V
        14: return
      LineNumberTable:
        line 145: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/ModernUI$NeonButton$1;
            0      15     1 this$0   Lext/mods/commons/gui/ModernUI$NeonButton;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void mouseEntered(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/ModernUI$NeonButton;
         4: iconst_1
         5: putfield      #19                 // Field ext/mods/commons/gui/ModernUI$NeonButton.isHovered:Z
         8: aload_0
         9: getfield      #7                  // Field this$0:Lext/mods/commons/gui/ModernUI$NeonButton;
        12: invokevirtual #25                 // Method ext/mods/commons/gui/ModernUI$NeonButton.repaint:()V
        15: return
      LineNumberTable:
        line 146: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/gui/ModernUI$NeonButton$1;
            0      16     1     e   Ljava/awt/event/MouseEvent;

  public void mouseExited(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/ModernUI$NeonButton;
         4: iconst_0
         5: putfield      #19                 // Field ext/mods/commons/gui/ModernUI$NeonButton.isHovered:Z
         8: aload_0
         9: getfield      #7                  // Field this$0:Lext/mods/commons/gui/ModernUI$NeonButton;
        12: invokevirtual #25                 // Method ext/mods/commons/gui/ModernUI$NeonButton.repaint:()V
        15: return
      LineNumberTable:
        line 147: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/gui/ModernUI$NeonButton$1;
            0      16     1     e   Ljava/awt/event/MouseEvent;
}
SourceFile: "ModernUI.java"
EnclosingMethod: #20.#43                // ext.mods.commons.gui.ModernUI$NeonButton.<init>
NestHost: class ext/mods/commons/gui/ModernUI
InnerClasses:
  public static #49= #20 of #46;          // NeonButton=class ext/mods/commons/gui/ModernUI$NeonButton of class ext/mods/commons/gui/ModernUI
  #8;                                     // class ext/mods/commons/gui/ModernUI$NeonButton$1
