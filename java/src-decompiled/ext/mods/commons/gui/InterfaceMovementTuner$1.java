// Bytecode for: ext.mods.commons.gui.InterfaceMovementTuner$1
// File: ext\mods\commons\gui\InterfaceMovementTuner$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceMovementTuner$1.class
  Last modified 9 de jul de 2026; size 2702 bytes
  MD5 checksum cf771b8e83428f8728e87441c05abcf8
  Compiled from "InterfaceMovementTuner.java"
class ext.mods.commons.gui.InterfaceMovementTuner$1 extends java.util.TimerTask
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/InterfaceMovementTuner$1
  super_class: #18                        // java/util/TimerTask
  interfaces: 0, fields: 2, methods: 4, attributes: 5
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/commons/gui/InterfaceMovementTuner$1.val$chkDebug:Ljavax/swing/JCheckBox;
    #2 = Class              #4            // ext/mods/commons/gui/InterfaceMovementTuner$1
    #3 = NameAndType        #5:#6         // val$chkDebug:Ljavax/swing/JCheckBox;
    #4 = Utf8               ext/mods/commons/gui/InterfaceMovementTuner$1
    #5 = Utf8               val$chkDebug
    #6 = Utf8               Ljavax/swing/JCheckBox;
    #7 = Methodref          #8.#9         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #8 = Class              #10           // java/util/Objects
    #9 = NameAndType        #11:#12       // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #10 = Utf8               java/util/Objects
   #11 = Utf8               requireNonNull
   #12 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #13 = Fieldref           #2.#14        // ext/mods/commons/gui/InterfaceMovementTuner$1.this$0:Lext/mods/commons/gui/InterfaceMovementTuner;
   #14 = NameAndType        #15:#16       // this$0:Lext/mods/commons/gui/InterfaceMovementTuner;
   #15 = Utf8               this$0
   #16 = Utf8               Lext/mods/commons/gui/InterfaceMovementTuner;
   #17 = Methodref          #18.#19       // java/util/TimerTask."<init>":()V
   #18 = Class              #20           // java/util/TimerTask
   #19 = NameAndType        #21:#22       // "<init>":()V
   #20 = Utf8               java/util/TimerTask
   #21 = Utf8               <init>
   #22 = Utf8               ()V
   #23 = Fieldref           #24.#25       // ext/mods/gameserver/model/actor/move/MovementConfig.DEBUG_ENABLED:Z
   #24 = Class              #26           // ext/mods/gameserver/model/actor/move/MovementConfig
   #25 = NameAndType        #27:#28       // DEBUG_ENABLED:Z
   #26 = Utf8               ext/mods/gameserver/model/actor/move/MovementConfig
   #27 = Utf8               DEBUG_ENABLED
   #28 = Utf8               Z
   #29 = Methodref          #30.#31       // javax/swing/JCheckBox.isSelected:()Z
   #30 = Class              #32           // javax/swing/JCheckBox
   #31 = NameAndType        #33:#34       // isSelected:()Z
   #32 = Utf8               javax/swing/JCheckBox
   #33 = Utf8               isSelected
   #34 = Utf8               ()Z
   #35 = InvokeDynamic      #0:#36        // #0:run:(Ljavax/swing/JCheckBox;)Ljava/lang/Runnable;
   #36 = NameAndType        #37:#38       // run:(Ljavax/swing/JCheckBox;)Ljava/lang/Runnable;
   #37 = Utf8               run
   #38 = Utf8               (Ljavax/swing/JCheckBox;)Ljava/lang/Runnable;
   #39 = Methodref          #40.#41       // javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
   #40 = Class              #42           // javax/swing/SwingUtilities
   #41 = NameAndType        #43:#44       // invokeLater:(Ljava/lang/Runnable;)V
   #42 = Utf8               javax/swing/SwingUtilities
   #43 = Utf8               invokeLater
   #44 = Utf8               (Ljava/lang/Runnable;)V
   #45 = Methodref          #24.#46       // ext/mods/gameserver/model/actor/move/MovementConfig.pollLog:()Ljava/lang/String;
   #46 = NameAndType        #47:#48       // pollLog:()Ljava/lang/String;
   #47 = Utf8               pollLog
   #48 = Utf8               ()Ljava/lang/String;
   #49 = InvokeDynamic      #1:#50        // #1:run:(Lext/mods/commons/gui/InterfaceMovementTuner$1;Ljava/lang/String;)Ljava/lang/Runnable;
   #50 = NameAndType        #37:#51       // run:(Lext/mods/commons/gui/InterfaceMovementTuner$1;Ljava/lang/String;)Ljava/lang/Runnable;
   #51 = Utf8               (Lext/mods/commons/gui/InterfaceMovementTuner$1;Ljava/lang/String;)Ljava/lang/Runnable;
   #52 = Fieldref           #53.#54       // ext/mods/commons/gui/InterfaceMovementTuner.logArea:Ljavax/swing/JTextArea;
   #53 = Class              #55           // ext/mods/commons/gui/InterfaceMovementTuner
   #54 = NameAndType        #56:#57       // logArea:Ljavax/swing/JTextArea;
   #55 = Utf8               ext/mods/commons/gui/InterfaceMovementTuner
   #56 = Utf8               logArea
   #57 = Utf8               Ljavax/swing/JTextArea;
   #58 = InvokeDynamic      #2:#59        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #59 = NameAndType        #60:#61       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #60 = Utf8               makeConcatWithConstants
   #61 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #62 = Methodref          #63.#64       // javax/swing/JTextArea.append:(Ljava/lang/String;)V
   #63 = Class              #65           // javax/swing/JTextArea
   #64 = NameAndType        #66:#67       // append:(Ljava/lang/String;)V
   #65 = Utf8               javax/swing/JTextArea
   #66 = Utf8               append
   #67 = Utf8               (Ljava/lang/String;)V
   #68 = Methodref          #63.#69       // javax/swing/JTextArea.getText:()Ljava/lang/String;
   #69 = NameAndType        #70:#48       // getText:()Ljava/lang/String;
   #70 = Utf8               getText
   #71 = Methodref          #72.#73       // java/lang/String.length:()I
   #72 = Class              #74           // java/lang/String
   #73 = NameAndType        #75:#76       // length:()I
   #74 = Utf8               java/lang/String
   #75 = Utf8               length
   #76 = Utf8               ()I
   #77 = String             #78           //
   #78 = Utf8
   #79 = Methodref          #63.#80       // javax/swing/JTextArea.setText:(Ljava/lang/String;)V
   #80 = NameAndType        #81:#67       // setText:(Ljava/lang/String;)V
   #81 = Utf8               setText
   #82 = Methodref          #30.#83       // javax/swing/JCheckBox.setSelected:(Z)V
   #83 = NameAndType        #84:#85       // setSelected:(Z)V
   #84 = Utf8               setSelected
   #85 = Utf8               (Z)V
   #86 = Utf8               (Lext/mods/commons/gui/InterfaceMovementTuner;Ljavax/swing/JCheckBox;)V
   #87 = Utf8               Code
   #88 = Utf8               LineNumberTable
   #89 = Utf8               LocalVariableTable
   #90 = Utf8               this
   #91 = Utf8               Lext/mods/commons/gui/InterfaceMovementTuner$1;
   #92 = Utf8               MethodParameters
   #93 = Utf8               msg
   #94 = Utf8               Ljava/lang/String;
   #95 = Utf8               StackMapTable
   #96 = Utf8               lambda$run$1
   #97 = Utf8               lambda$run$0
   #98 = Utf8               (Ljavax/swing/JCheckBox;)V
   #99 = Utf8               chkDebug
  #100 = Utf8               SourceFile
  #101 = Utf8               InterfaceMovementTuner.java
  #102 = Utf8               EnclosingMethod
  #103 = Utf8               NestHost
  #104 = Utf8               BootstrapMethods
  #105 = MethodType         #22           //  ()V
  #106 = MethodHandle       6:#107        // REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner$1.lambda$run$0:(Ljavax/swing/JCheckBox;)V
  #107 = Methodref          #2.#108       // ext/mods/commons/gui/InterfaceMovementTuner$1.lambda$run$0:(Ljavax/swing/JCheckBox;)V
  #108 = NameAndType        #97:#98       // lambda$run$0:(Ljavax/swing/JCheckBox;)V
  #109 = MethodHandle       5:#110        // REF_invokeVirtual ext/mods/commons/gui/InterfaceMovementTuner$1.lambda$run$1:(Ljava/lang/String;)V
  #110 = Methodref          #2.#111       // ext/mods/commons/gui/InterfaceMovementTuner$1.lambda$run$1:(Ljava/lang/String;)V
  #111 = NameAndType        #96:#67       // lambda$run$1:(Ljava/lang/String;)V
  #112 = String             #113          // \u0001\n
  #113 = Utf8               \u0001\n
  #114 = MethodHandle       6:#115        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #115 = Methodref          #116.#117     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #116 = Class              #118          // java/lang/invoke/LambdaMetafactory
  #117 = NameAndType        #119:#120     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #118 = Utf8               java/lang/invoke/LambdaMetafactory
  #119 = Utf8               metafactory
  #120 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #121 = MethodHandle       6:#122        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #122 = Methodref          #123.#124     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #123 = Class              #125          // java/lang/invoke/StringConcatFactory
  #124 = NameAndType        #60:#126      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #125 = Utf8               java/lang/invoke/StringConcatFactory
  #126 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #127 = Utf8               InnerClasses
  #128 = Class              #129          // java/lang/invoke/MethodHandles$Lookup
  #129 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #130 = Class              #131          // java/lang/invoke/MethodHandles
  #131 = Utf8               java/lang/invoke/MethodHandles
  #132 = Utf8               Lookup
{
  final javax.swing.JCheckBox val$chkDebug;
    descriptor: Ljavax/swing/JCheckBox;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.commons.gui.InterfaceMovementTuner this$0;
    descriptor: Lext/mods/commons/gui/InterfaceMovementTuner;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceMovementTuner$1(ext.mods.commons.gui.InterfaceMovementTuner, javax.swing.JCheckBox);
    descriptor: (Lext/mods/commons/gui/InterfaceMovementTuner;Ljavax/swing/JCheckBox;)V
    flags: (0x0000)
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$chkDebug:Ljavax/swing/JCheckBox;
         5: aload_0
         6: aload_1
         7: dup
         8: invokestatic  #7                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        11: pop
        12: putfield      #13                 // Field this$0:Lext/mods/commons/gui/InterfaceMovementTuner;
        15: aload_0
        16: invokespecial #17                 // Method java/util/TimerTask."<init>":()V
        19: return
      LineNumberTable:
        line 129: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/gui/InterfaceMovementTuner$1;
            0      20     1 this$0   Lext/mods/commons/gui/InterfaceMovementTuner;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: getstatic     #23                 // Field ext/mods/gameserver/model/actor/move/MovementConfig.DEBUG_ENABLED:Z
         3: ifne          28
         6: aload_0
         7: getfield      #1                  // Field val$chkDebug:Ljavax/swing/JCheckBox;
        10: invokevirtual #29                 // Method javax/swing/JCheckBox.isSelected:()Z
        13: ifeq          28
        16: aload_0
        17: getfield      #1                  // Field val$chkDebug:Ljavax/swing/JCheckBox;
        20: invokedynamic #35,  0             // InvokeDynamic #0:run:(Ljavax/swing/JCheckBox;)Ljava/lang/Runnable;
        25: invokestatic  #39                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        28: invokestatic  #45                 // Method ext/mods/gameserver/model/actor/move/MovementConfig.pollLog:()Ljava/lang/String;
        31: astore_1
        32: aload_1
        33: ifnull        46
        36: aload_0
        37: aload_1
        38: invokedynamic #49,  0             // InvokeDynamic #1:run:(Lext/mods/commons/gui/InterfaceMovementTuner$1;Ljava/lang/String;)Ljava/lang/Runnable;
        43: invokestatic  #39                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        46: return
      LineNumberTable:
        line 132: 0
        line 133: 16
        line 136: 28
        line 137: 32
        line 138: 36
        line 143: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/commons/gui/InterfaceMovementTuner$1;
           32      15     1   msg   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 28 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/lang/String ]
}
SourceFile: "InterfaceMovementTuner.java"
EnclosingMethod: #53.#19                // ext.mods.commons.gui.InterfaceMovementTuner.<init>
NestHost: class ext/mods/commons/gui/InterfaceMovementTuner
BootstrapMethods:
  0: #114 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #105 ()V
      #106 REF_invokeStatic ext/mods/commons/gui/InterfaceMovementTuner$1.lambda$run$0:(Ljavax/swing/JCheckBox;)V
      #105 ()V
  1: #114 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #105 ()V
      #109 REF_invokeVirtual ext/mods/commons/gui/InterfaceMovementTuner$1.lambda$run$1:(Ljava/lang/String;)V
      #105 ()V
  2: #121 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #112 \u0001\n
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/InterfaceMovementTuner$1
  public static final #132= #128 of #130; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
