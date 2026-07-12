// Bytecode for: ext.mods.gameserver.model.actor.ai.Desire
// File: ext\mods\gameserver\model\actor\ai\Desire.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/Desire.class
  Last modified 9 de jul de 2026; size 2691 bytes
  MD5 checksum 579dd1c9b5e19e9b6db26d62493d0f85
  Compiled from "Desire.java"
public class ext.mods.gameserver.model.actor.ai.Desire extends ext.mods.gameserver.model.actor.ai.Intention
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/Desire
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/Intention
  interfaces: 0, fields: 1, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/ai/Intention."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/ai/Intention
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/ai/Desire._weight:D
    #8 = Class              #10           // ext/mods/gameserver/model/actor/ai/Desire
    #9 = NameAndType        #11:#12       // _weight:D
   #10 = Utf8               ext/mods/gameserver/model/actor/ai/Desire
   #11 = Utf8               _weight
   #12 = Utf8               D
   #13 = Methodref          #2.#14        // ext/mods/gameserver/model/actor/ai/Intention.equals:(Ljava/lang/Object;)Z
   #14 = NameAndType        #15:#16       // equals:(Ljava/lang/Object;)Z
   #15 = Utf8               equals
   #16 = Utf8               (Ljava/lang/Object;)Z
   #17 = Methodref          #8.#18        // ext/mods/gameserver/model/actor/ai/Desire.getWeight:()D
   #18 = NameAndType        #19:#20       // getWeight:()D
   #19 = Utf8               getWeight
   #20 = Utf8               ()D
   #21 = Methodref          #22.#23       // java/lang/Double.compare:(DD)I
   #22 = Class              #24           // java/lang/Double
   #23 = NameAndType        #25:#26       // compare:(DD)I
   #24 = Utf8               java/lang/Double
   #25 = Utf8               compare
   #26 = Utf8               (DD)I
   #27 = Methodref          #2.#28        // ext/mods/gameserver/model/actor/ai/Intention.compareTo:(Lext/mods/gameserver/model/actor/ai/Intention;)I
   #28 = NameAndType        #29:#30       // compareTo:(Lext/mods/gameserver/model/actor/ai/Intention;)I
   #29 = Utf8               compareTo
   #30 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)I
   #31 = Methodref          #2.#32        // ext/mods/gameserver/model/actor/ai/Intention.hashCode:()I
   #32 = NameAndType        #33:#34       // hashCode:()I
   #33 = Utf8               hashCode
   #34 = Utf8               ()I
   #35 = Fieldref           #8.#36        // ext/mods/gameserver/model/actor/ai/Desire._type:Lext/mods/gameserver/enums/IntentionType;
   #36 = NameAndType        #37:#38       // _type:Lext/mods/gameserver/enums/IntentionType;
   #37 = Utf8               _type
   #38 = Utf8               Lext/mods/gameserver/enums/IntentionType;
   #39 = Methodref          #40.#41       // ext/mods/gameserver/enums/IntentionType.toString:()Ljava/lang/String;
   #40 = Class              #42           // ext/mods/gameserver/enums/IntentionType
   #41 = NameAndType        #43:#44       // toString:()Ljava/lang/String;
   #42 = Utf8               ext/mods/gameserver/enums/IntentionType
   #43 = Utf8               toString
   #44 = Utf8               ()Ljava/lang/String;
   #45 = InvokeDynamic      #0:#46        // #0:makeConcatWithConstants:(Ljava/lang/String;D)Ljava/lang/String;
   #46 = NameAndType        #47:#48       // makeConcatWithConstants:(Ljava/lang/String;D)Ljava/lang/String;
   #47 = Utf8               makeConcatWithConstants
   #48 = Utf8               (Ljava/lang/String;D)Ljava/lang/String;
   #49 = Double             1.7976931348623157E308d
   #51 = Methodref          #52.#53       // java/lang/Math.min:(DD)D
   #52 = Class              #54           // java/lang/Math
   #53 = NameAndType        #55:#56       // min:(DD)D
   #54 = Utf8               java/lang/Math
   #55 = Utf8               min
   #56 = Utf8               (DD)D
   #57 = Fieldref           #58.#59       // ext/mods/gameserver/model/actor/ai/Desire$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #58 = Class              #60           // ext/mods/gameserver/model/actor/ai/Desire$1
   #59 = NameAndType        #61:#62       // $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #60 = Utf8               ext/mods/gameserver/model/actor/ai/Desire$1
   #61 = Utf8               $SwitchMap$ext$mods$gameserver$enums$IntentionType
   #62 = Utf8               [I
   #63 = Methodref          #40.#64       // ext/mods/gameserver/enums/IntentionType.ordinal:()I
   #64 = NameAndType        #65:#34       // ordinal:()I
   #65 = Utf8               ordinal
   #66 = Double             6.6d
   #68 = Double             66000.0d
   #70 = Double             0.5d
   #72 = Methodref          #8.#28        // ext/mods/gameserver/model/actor/ai/Desire.compareTo:(Lext/mods/gameserver/model/actor/ai/Intention;)I
   #73 = Utf8               (D)V
   #74 = Utf8               Code
   #75 = Utf8               LineNumberTable
   #76 = Utf8               LocalVariableTable
   #77 = Utf8               this
   #78 = Utf8               Lext/mods/gameserver/model/actor/ai/Desire;
   #79 = Utf8               weight
   #80 = Utf8               obj
   #81 = Utf8               Ljava/lang/Object;
   #82 = Utf8               weightCompare
   #83 = Utf8               otherDesire
   #84 = Utf8               other
   #85 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
   #86 = Utf8               StackMapTable
   #87 = Utf8               setWeight
   #88 = Utf8               addWeight
   #89 = Utf8               value
   #90 = Utf8               reduceWeight
   #91 = Utf8               autoDecreaseWeight
   #92 = Utf8               (Ljava/lang/Object;)I
   #93 = Utf8               MethodParameters
   #94 = Utf8               SourceFile
   #95 = Utf8               Desire.java
   #96 = Utf8               NestMembers
   #97 = Utf8               BootstrapMethods
   #98 = String             #99           // Desire [type=\u0001 weight=\u0001]
   #99 = Utf8               Desire [type=\u0001 weight=\u0001]
  #100 = MethodHandle       6:#101        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #101 = Methodref          #102.#103     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #102 = Class              #104          // java/lang/invoke/StringConcatFactory
  #103 = NameAndType        #47:#105      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #104 = Utf8               java/lang/invoke/StringConcatFactory
  #105 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #106 = Utf8               InnerClasses
  #107 = Class              #108          // java/lang/invoke/MethodHandles$Lookup
  #108 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #109 = Class              #110          // java/lang/invoke/MethodHandles
  #110 = Utf8               java/lang/invoke/MethodHandles
  #111 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.ai.Desire(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/Intention."<init>":()V
         4: aload_0
         5: dload_1
         6: putfield      #7                  // Field _weight:D
         9: return
      LineNumberTable:
        line 31: 0
        line 33: 4
        line 34: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/Desire;
            0      10     1 weight   D

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #13                 // Method ext/mods/gameserver/model/actor/ai/Intention.equals:(Ljava/lang/Object;)Z
         5: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/Desire;
            0       6     1   obj   Ljava/lang/Object;

  public int compareTo(ext.mods.gameserver.model.actor.ai.Intention);
    descriptor: (Lext/mods/gameserver/model/actor/ai/Intention;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=2
         0: aload_1
         1: instanceof    #8                  // class ext/mods/gameserver/model/actor/ai/Desire
         4: ifeq          53
         7: aload_1
         8: checkcast     #8                  // class ext/mods/gameserver/model/actor/ai/Desire
        11: astore_2
        12: aload_2
        13: invokevirtual #17                 // Method getWeight:()D
        16: aload_0
        17: invokevirtual #17                 // Method getWeight:()D
        20: invokestatic  #21                 // Method java/lang/Double.compare:(DD)I
        23: i2d
        24: dstore_3
        25: dload_3
        26: dconst_0
        27: dcmpl
        28: ifeq          53
        31: dload_3
        32: dconst_0
        33: dcmpl
        34: ifle          41
        37: iconst_1
        38: goto          52
        41: dload_3
        42: dconst_0
        43: dcmpg
        44: ifge          51
        47: iconst_m1
        48: goto          52
        51: iconst_0
        52: ireturn
        53: aload_0
        54: aload_1
        55: invokespecial #27                 // Method ext/mods/gameserver/model/actor/ai/Intention.compareTo:(Lext/mods/gameserver/model/actor/ai/Intention;)I
        58: ireturn
      LineNumberTable:
        line 45: 0
        line 47: 12
        line 48: 25
        line 49: 31
        line 52: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      28     3 weightCompare   D
           12      41     2 otherDesire   Lext/mods/gameserver/model/actor/ai/Desire;
            0      59     0  this   Lext/mods/gameserver/model/actor/ai/Desire;
            0      59     1 other   Lext/mods/gameserver/model/actor/ai/Intention;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/actor/ai/Desire, double ]
        frame_type = 9 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 0

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #31                 // Method ext/mods/gameserver/model/actor/ai/Intention.hashCode:()I
         4: ireturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Desire;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _type:Lext/mods/gameserver/enums/IntentionType;
         4: invokevirtual #39                 // Method ext/mods/gameserver/enums/IntentionType.toString:()Ljava/lang/String;
         7: aload_0
         8: getfield      #7                  // Field _weight:D
        11: invokedynamic #45,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;D)Ljava/lang/String;
        16: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/Desire;

  public double getWeight();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _weight:D
         4: dreturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Desire;

  public void setWeight(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: putfield      #7                  // Field _weight:D
         5: return
      LineNumberTable:
        line 74: 0
        line 75: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/Desire;
            0       6     1 weight   D

  public void addWeight(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #7                  // Field _weight:D
         5: dload_1
         6: dadd
         7: ldc2_w        #49                 // double 1.7976931348623157E308d
        10: invokestatic  #51                 // Method java/lang/Math.min:(DD)D
        13: putfield      #7                  // Field _weight:D
        16: return
      LineNumberTable:
        line 79: 0
        line 80: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/Desire;
            0      17     1 value   D

  public void reduceWeight(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: dup
         2: getfield      #7                  // Field _weight:D
         5: dload_1
         6: dsub
         7: putfield      #7                  // Field _weight:D
        10: return
      LineNumberTable:
        line 84: 0
        line 85: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/Desire;
            0      11     1 value   D

  public void autoDecreaseWeight();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: getstatic     #57                 // Field ext/mods/gameserver/model/actor/ai/Desire$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
         3: aload_0
         4: getfield      #35                 // Field _type:Lext/mods/gameserver/enums/IntentionType;
         7: invokevirtual #63                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        10: iaload
        11: tableswitch   { // 1 to 3

                       1: 36

                       2: 51

                       3: 66
                 default: 78
            }
        36: aload_0
        37: dup
        38: getfield      #7                  // Field _weight:D
        41: ldc2_w        #66                 // double 6.6d
        44: dsub
        45: putfield      #7                  // Field _weight:D
        48: goto          78
        51: aload_0
        52: dup
        53: getfield      #7                  // Field _weight:D
        56: ldc2_w        #68                 // double 66000.0d
        59: dsub
        60: putfield      #7                  // Field _weight:D
        63: goto          78
        66: aload_0
        67: dup
        68: getfield      #7                  // Field _weight:D
        71: ldc2_w        #70                 // double 0.5d
        74: dsub
        75: putfield      #7                  // Field _weight:D
        78: return
      LineNumberTable:
        line 89: 0
        line 92: 36
        line 93: 48
        line 96: 51
        line 97: 63
        line 100: 66
        line 103: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  this   Lext/mods/gameserver/model/actor/ai/Desire;
      StackMapTable: number_of_entries = 4
        frame_type = 36 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */

  public int compareTo(java.lang.Object);
    descriptor: (Ljava/lang/Object;)I
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #2                  // class ext/mods/gameserver/model/actor/ai/Intention
         5: invokevirtual #72                 // Method compareTo:(Lext/mods/gameserver/model/actor/ai/Intention;)I
         8: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/ai/Desire;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
SourceFile: "Desire.java"
NestMembers:
  ext/mods/gameserver/model/actor/ai/Desire$1
BootstrapMethods:
  0: #100 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #98 Desire [type=\u0001 weight=\u0001]
InnerClasses:
  static #58;                             // class ext/mods/gameserver/model/actor/ai/Desire$1
  public static final #111= #107 of #109; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
