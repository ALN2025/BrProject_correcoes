// Bytecode for: ext.mods.gameserver.model.holder.IntIntHolder
// File: ext\mods\gameserver\model\holder\IntIntHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/holder/IntIntHolder.class
  Last modified 9 de jul de 2026; size 2174 bytes
  MD5 checksum 9b0061a4b0d075f98617fe618bde4b59
  Compiled from "IntIntHolder.java"
public class ext.mods.gameserver.model.holder.IntIntHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/holder/IntIntHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 9, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/holder/IntIntHolder._id:I
   #8 = Class              #10            // ext/mods/gameserver/model/holder/IntIntHolder
   #9 = NameAndType        #11:#12        // _id:I
  #10 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #11 = Utf8               _id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/holder/IntIntHolder._value:I
  #14 = NameAndType        #15:#12        // _value:I
  #15 = Utf8               _value
  #16 = InvokeDynamic      #0:#17         // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #17 = NameAndType        #18:#19        // makeConcatWithConstants:(II)Ljava/lang/String;
  #18 = Utf8               makeConcatWithConstants
  #19 = Utf8               (II)Ljava/lang/String;
  #20 = Methodref          #21.#22        // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #21 = Class              #23            // ext/mods/gameserver/data/SkillTable
  #22 = NameAndType        #24:#25        // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #23 = Utf8               ext/mods/gameserver/data/SkillTable
  #24 = Utf8               getInstance
  #25 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #26 = Methodref          #21.#27        // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #27 = NameAndType        #28:#29        // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #28 = Utf8               getInfo
  #29 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #30 = Methodref          #31.#32        // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #31 = Class              #33            // ext/mods/gameserver/data/xml/ItemData
  #32 = NameAndType        #24:#34        // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #33 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #34 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #35 = Methodref          #31.#36        // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #36 = NameAndType        #37:#38        // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #37 = Utf8               getTemplate
  #38 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #39 = Methodref          #40.#41        // ext/mods/gameserver/model/item/kind/Item.getWeight:()I
  #40 = Class              #42            // ext/mods/gameserver/model/item/kind/Item
  #41 = NameAndType        #43:#44        // getWeight:()I
  #42 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #43 = Utf8               getWeight
  #44 = Utf8               ()I
  #45 = Utf8               (II)V
  #46 = Utf8               Code
  #47 = Utf8               LineNumberTable
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               this
  #50 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #51 = Utf8               id
  #52 = Utf8               value
  #53 = Utf8               toString
  #54 = Utf8               ()Ljava/lang/String;
  #55 = Utf8               getId
  #56 = Utf8               getValue
  #57 = Utf8               setId
  #58 = Utf8               (I)V
  #59 = Utf8               setValue
  #60 = Utf8               getSkill
  #61 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #62 = Utf8               item
  #63 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #64 = Utf8               StackMapTable
  #65 = Utf8               equals
  #66 = Utf8               (II)Z
  #67 = Utf8               SourceFile
  #68 = Utf8               IntIntHolder.java
  #69 = Utf8               BootstrapMethods
  #70 = String             #71            // IntIntHolder [id=\u0001 value=\u0001]
  #71 = Utf8               IntIntHolder [id=\u0001 value=\u0001]
  #72 = MethodHandle       6:#73          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #73 = Methodref          #74.#75        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #74 = Class              #76            // java/lang/invoke/StringConcatFactory
  #75 = NameAndType        #18:#77        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #76 = Utf8               java/lang/invoke/StringConcatFactory
  #77 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #78 = Utf8               InnerClasses
  #79 = Class              #80            // java/lang/invoke/MethodHandles$Lookup
  #80 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #81 = Class              #82            // java/lang/invoke/MethodHandles
  #82 = Utf8               java/lang/invoke/MethodHandles
  #83 = Utf8               Lookup
{
  public ext.mods.gameserver.model.holder.IntIntHolder(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _id:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _value:I
        14: return
      LineNumberTable:
        line 34: 0
        line 35: 4
        line 36: 9
        line 37: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/holder/IntIntHolder;
            0      15     1    id   I
            0      15     2 value   I

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _id:I
         4: aload_0
         5: getfield      #13                 // Field _value:I
         8: invokedynamic #16,  0             // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
        13: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/holder/IntIntHolder;

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _id:I
         4: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/IntIntHolder;

  public int getValue();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _value:I
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/IntIntHolder;

  public void setId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _id:I
         5: return
      LineNumberTable:
        line 57: 0
        line 58: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/holder/IntIntHolder;
            0       6     1    id   I

  public void setValue(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _value:I
         5: return
      LineNumberTable:
        line 62: 0
        line 63: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/holder/IntIntHolder;
            0       6     1 value   I

  public final ext.mods.gameserver.skills.L2Skill getSkill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: invokestatic  #20                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
         3: aload_0
         4: getfield      #7                  // Field _id:I
         7: aload_0
         8: getfield      #13                 // Field _value:I
        11: invokevirtual #26                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        14: areturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/holder/IntIntHolder;

  public final int getWeight();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=1
         0: invokestatic  #30                 // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
         3: aload_0
         4: getfield      #7                  // Field _id:I
         7: invokevirtual #35                 // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        10: astore_1
        11: aload_1
        12: ifnonnull     17
        15: iconst_0
        16: ireturn
        17: aload_1
        18: invokevirtual #39                 // Method ext/mods/gameserver/model/item/kind/Item.getWeight:()I
        21: aload_0
        22: getfield      #13                 // Field _value:I
        25: imul
        26: ireturn
      LineNumberTable:
        line 79: 0
        line 80: 11
        line 81: 15
        line 83: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/holder/IntIntHolder;
           11      16     1  item   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]

  public final boolean equals(int, int);
    descriptor: (II)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #7                  // Field _id:I
         4: iload_1
         5: if_icmpne     20
         8: aload_0
         9: getfield      #13                 // Field _value:I
        12: iload_2
        13: if_icmpne     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/holder/IntIntHolder;
            0      22     1    id   I
            0      22     2 value   I
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "IntIntHolder.java"
BootstrapMethods:
  0: #72 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #70 IntIntHolder [id=\u0001 value=\u0001]
InnerClasses:
  public static final #83= #79 of #81;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
