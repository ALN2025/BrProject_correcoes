// Bytecode for: ext.mods.gameserver.model.actor.container.npc.AggroInfo
// File: ext\mods\gameserver\model\actor\container\npc\AggroInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/npc/AggroInfo.class
  Last modified 9 de jul de 2026; size 2473 bytes
  MD5 checksum 554fd15a0d3fde2caf43a5f3a1d95694
  Compiled from "AggroInfo.java"
public final class ext.mods.gameserver.model.actor.container.npc.AggroInfo
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/npc/AggroInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 12, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/container/npc/AggroInfo._attacker:Lext/mods/gameserver/model/actor/Creature;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/container/npc/AggroInfo
   #9 = NameAndType        #11:#12        // _attacker:Lext/mods/gameserver/model/actor/Creature;
  #10 = Utf8               ext/mods/gameserver/model/actor/container/npc/AggroInfo
  #11 = Utf8               _attacker
  #12 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #13 = Methodref          #8.#14         // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
  #14 = NameAndType        #15:#16        // getAttacker:()Lext/mods/gameserver/model/actor/Creature;
  #15 = Utf8               getAttacker
  #16 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #17 = Methodref          #18.#19        // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #18 = Class              #20            // ext/mods/gameserver/model/actor/Creature
  #19 = NameAndType        #21:#22        // getObjectId:()I
  #20 = Utf8               ext/mods/gameserver/model/actor/Creature
  #21 = Utf8               getObjectId
  #22 = Utf8               ()I
  #23 = Methodref          #24.#25        // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #24 = Class              #26            // java/lang/String
  #25 = NameAndType        #27:#28        // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #26 = Utf8               java/lang/String
  #27 = Utf8               valueOf
  #28 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #29 = Fieldref           #8.#30         // ext/mods/gameserver/model/actor/container/npc/AggroInfo._damage:D
  #30 = NameAndType        #31:#32        // _damage:D
  #31 = Utf8               _damage
  #32 = Utf8               D
  #33 = Fieldref           #8.#34         // ext/mods/gameserver/model/actor/container/npc/AggroInfo._hate:D
  #34 = NameAndType        #35:#32        // _hate:D
  #35 = Utf8               _hate
  #36 = InvokeDynamic      #0:#37         // #0:makeConcatWithConstants:(Ljava/lang/String;DD)Ljava/lang/String;
  #37 = NameAndType        #38:#39        // makeConcatWithConstants:(Ljava/lang/String;DD)Ljava/lang/String;
  #38 = Utf8               makeConcatWithConstants
  #39 = Utf8               (Ljava/lang/String;DD)Ljava/lang/String;
  #40 = Double             9.99999999E8d
  #42 = Methodref          #43.#44        // java/lang/Math.min:(DD)D
  #43 = Class              #45            // java/lang/Math
  #44 = NameAndType        #46:#47        // min:(DD)D
  #45 = Utf8               java/lang/Math
  #46 = Utf8               min
  #47 = Utf8               (DD)D
  #48 = Fieldref           #8.#49         // ext/mods/gameserver/model/actor/container/npc/AggroInfo._timestamp:J
  #49 = NameAndType        #50:#51        // _timestamp:J
  #50 = Utf8               _timestamp
  #51 = Utf8               J
  #52 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #53 = Utf8               Code
  #54 = Utf8               LineNumberTable
  #55 = Utf8               LocalVariableTable
  #56 = Utf8               this
  #57 = Utf8               Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
  #58 = Utf8               attacker
  #59 = Utf8               equals
  #60 = Utf8               (Ljava/lang/Object;)Z
  #61 = Utf8               ai
  #62 = Utf8               obj
  #63 = Utf8               Ljava/lang/Object;
  #64 = Utf8               StackMapTable
  #65 = Utf8               hashCode
  #66 = Utf8               toString
  #67 = Utf8               ()Ljava/lang/String;
  #68 = Utf8               getDamage
  #69 = Utf8               ()D
  #70 = Utf8               addDamage
  #71 = Utf8               (D)V
  #72 = Utf8               value
  #73 = Utf8               getHate
  #74 = Utf8               addHate
  #75 = Utf8               stopHate
  #76 = Utf8               getTimestamp
  #77 = Utf8               ()J
  #78 = Utf8               setTimestamp
  #79 = Utf8               (J)V
  #80 = Utf8               timestamp
  #81 = Utf8               SourceFile
  #82 = Utf8               AggroInfo.java
  #83 = Utf8               BootstrapMethods
  #84 = String             #85            // AggroInfo [attacker=\u0001, damage=\u0001, hate=\u0001]
  #85 = Utf8               AggroInfo [attacker=\u0001, damage=\u0001, hate=\u0001]
  #86 = MethodHandle       6:#87          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #87 = Methodref          #88.#89        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #88 = Class              #90            // java/lang/invoke/StringConcatFactory
  #89 = NameAndType        #38:#91        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #90 = Utf8               java/lang/invoke/StringConcatFactory
  #91 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #92 = Utf8               InnerClasses
  #93 = Class              #94            // java/lang/invoke/MethodHandles$Lookup
  #94 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #95 = Class              #96            // java/lang/invoke/MethodHandles
  #96 = Utf8               java/lang/invoke/MethodHandles
  #97 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.container.npc.AggroInfo(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _attacker:Lext/mods/gameserver/model/actor/Creature;
         9: return
      LineNumberTable:
        line 36: 0
        line 37: 4
        line 38: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
            0      10     1 attacker   Lext/mods/gameserver/model/actor/Creature;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #8                  // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        11: ifeq          36
        14: aload_1
        15: checkcast     #8                  // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        18: astore_2
        19: aload_2
        20: invokevirtual #13                 // Method getAttacker:()Lext/mods/gameserver/model/actor/Creature;
        23: aload_0
        24: getfield      #7                  // Field _attacker:Lext/mods/gameserver/model/actor/Creature;
        27: if_acmpne     34
        30: iconst_1
        31: goto          35
        34: iconst_0
        35: ireturn
        36: iconst_0
        37: ireturn
      LineNumberTable:
        line 43: 0
        line 44: 5
        line 46: 7
        line 47: 19
        line 49: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      17     2    ai   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
            0      38     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
            0      38     1   obj   Ljava/lang/Object;
      StackMapTable: number_of_entries = 4
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AggroInfo ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _attacker:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
         7: ireturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _attacker:Lext/mods/gameserver/model/actor/Creature;
         4: invokestatic  #23                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         7: aload_0
         8: getfield      #29                 // Field _damage:D
        11: aload_0
        12: getfield      #33                 // Field _hate:D
        15: invokedynamic #36,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;DD)Ljava/lang/String;
        20: areturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;

  public ext.mods.gameserver.model.actor.Creature getAttacker();
    descriptor: ()Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _attacker:Lext/mods/gameserver/model/actor/Creature;
         4: areturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;

  public double getDamage();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _damage:D
         4: dreturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;

  public void addDamage(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #29                 // Field _damage:D
         5: dload_1
         6: dadd
         7: ldc2_w        #40                 // double 9.99999999E8d
        10: invokestatic  #42                 // Method java/lang/Math.min:(DD)D
        13: putfield      #29                 // Field _damage:D
        16: return
      LineNumberTable:
        line 76: 0
        line 77: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
            0      17     1 value   D

  public double getHate();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _hate:D
         4: dreturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;

  public void addHate(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #33                 // Field _hate:D
         5: dload_1
         6: dadd
         7: ldc2_w        #40                 // double 9.99999999E8d
        10: invokestatic  #42                 // Method java/lang/Math.min:(DD)D
        13: putfield      #33                 // Field _hate:D
        16: return
      LineNumberTable:
        line 86: 0
        line 87: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
            0      17     1 value   D

  public void stopHate();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: dconst_0
         2: putfield      #33                 // Field _hate:D
         5: return
      LineNumberTable:
        line 91: 0
        line 92: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;

  public long getTimestamp();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _timestamp:J
         4: lreturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;

  public void setTimestamp(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #48                 // Field _timestamp:J
         5: return
      LineNumberTable:
        line 101: 0
        line 102: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
            0       6     1 timestamp   J
}
SourceFile: "AggroInfo.java"
BootstrapMethods:
  0: #86 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #84 AggroInfo [attacker=\u0001, damage=\u0001, hate=\u0001]
InnerClasses:
  public static final #97= #93 of #95;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
