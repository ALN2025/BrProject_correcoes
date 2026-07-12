// Bytecode for: ext.mods.gameserver.model.records.PlayerPair
// File: ext\mods\gameserver\model\records\PlayerPair.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/PlayerPair.class
  Last modified 9 de jul de 2026; size 1767 bytes
  MD5 checksum 6dda8ec46f293b5482b980483bbead61
  Compiled from "PlayerPair.java"
public final class ext.mods.gameserver.model.records.PlayerPair extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/PlayerPair
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 2, methods: 7, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/PlayerPair.id1:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/PlayerPair
   #9 = NameAndType        #11:#12        // id1:I
  #10 = Utf8               ext/mods/gameserver/model/records/PlayerPair
  #11 = Utf8               id1
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/PlayerPair.id2:I
  #14 = NameAndType        #15:#12        // id2:I
  #15 = Utf8               id2
  #16 = InvokeDynamic      #0:#17         // #0:toString:(Lext/mods/gameserver/model/records/PlayerPair;)Ljava/lang/String;
  #17 = NameAndType        #18:#19        // toString:(Lext/mods/gameserver/model/records/PlayerPair;)Ljava/lang/String;
  #18 = Utf8               toString
  #19 = Utf8               (Lext/mods/gameserver/model/records/PlayerPair;)Ljava/lang/String;
  #20 = InvokeDynamic      #0:#21         // #0:hashCode:(Lext/mods/gameserver/model/records/PlayerPair;)I
  #21 = NameAndType        #22:#23        // hashCode:(Lext/mods/gameserver/model/records/PlayerPair;)I
  #22 = Utf8               hashCode
  #23 = Utf8               (Lext/mods/gameserver/model/records/PlayerPair;)I
  #24 = InvokeDynamic      #0:#25         // #0:equals:(Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Object;)Z
  #25 = NameAndType        #26:#27        // equals:(Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Object;)Z
  #26 = Utf8               equals
  #27 = Utf8               (Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Object;)Z
  #28 = Utf8               (II)V
  #29 = Utf8               Code
  #30 = Utf8               LineNumberTable
  #31 = Utf8               LocalVariableTable
  #32 = Utf8               temp
  #33 = Utf8               this
  #34 = Utf8               Lext/mods/gameserver/model/records/PlayerPair;
  #35 = Utf8               StackMapTable
  #36 = Utf8               MethodParameters
  #37 = Utf8               contains
  #38 = Utf8               (I)Z
  #39 = Utf8               playerId
  #40 = Utf8               ()Ljava/lang/String;
  #41 = Utf8               ()I
  #42 = Utf8               (Ljava/lang/Object;)Z
  #43 = Utf8               o
  #44 = Utf8               Ljava/lang/Object;
  #45 = Utf8               SourceFile
  #46 = Utf8               PlayerPair.java
  #47 = Utf8               Record
  #48 = Utf8               BootstrapMethods
  #49 = String             #50            // id1;id2
  #50 = Utf8               id1;id2
  #51 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/PlayerPair.id1:I
  #52 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/PlayerPair.id2:I
  #53 = MethodHandle       6:#54          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #54 = Methodref          #55.#56        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #55 = Class              #57            // java/lang/runtime/ObjectMethods
  #56 = NameAndType        #58:#59        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #57 = Utf8               java/lang/runtime/ObjectMethods
  #58 = Utf8               bootstrap
  #59 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #60 = Utf8               InnerClasses
  #61 = Class              #62            // java/lang/invoke/MethodHandles$Lookup
  #62 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #63 = Class              #64            // java/lang/invoke/MethodHandles
  #64 = Utf8               java/lang/invoke/MethodHandles
  #65 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.PlayerPair(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: iload_1
         5: iload_2
         6: if_icmple     15
         9: iload_1
        10: istore_3
        11: iload_2
        12: istore_1
        13: iload_3
        14: istore_2
        15: aload_0
        16: iload_1
        17: putfield      #7                  // Field id1:I
        20: aload_0
        21: iload_2
        22: putfield      #13                 // Field id2:I
        25: return
      LineNumberTable:
        line 23: 0
        line 24: 4
        line 26: 9
        line 27: 11
        line 28: 13
        line 22: 15
        line 30: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           11       4     3  temp   I
            0      26     0  this   Lext/mods/gameserver/model/records/PlayerPair;
            0      26     1   id1   I
            0      26     2   id2   I
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/records/PlayerPair, int, int ]
          stack = []
    MethodParameters:
      Name                           Flags
      id1                            mandated
      id2                            mandated

  public boolean contains(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field id1:I
         4: iload_1
         5: if_icmpeq     16
         8: aload_0
         9: getfield      #13                 // Field id2:I
        12: iload_1
        13: if_icmpne     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/records/PlayerPair;
            0      22     1 playerId   I
      StackMapTable: number_of_entries = 3
        frame_type = 16 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #16,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/PlayerPair;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/PlayerPair;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #20,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/PlayerPair;)I
         6: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/PlayerPair;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #24,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/PlayerPair;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/PlayerPair;
            0       8     1     o   Ljava/lang/Object;

  public int id1();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field id1:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PlayerPair;

  public int id2();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field id2:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PlayerPair;
}
SourceFile: "PlayerPair.java"
  Record: length = 0xE (unknown attribute)
   00 02 00 0B 00 0C 00 00 00 0F 00 0C 00 00
BootstrapMethods:
  0: #53 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/PlayerPair
      #49 id1;id2
      #51 REF_getField ext/mods/gameserver/model/records/PlayerPair.id1:I
      #52 REF_getField ext/mods/gameserver/model/records/PlayerPair.id2:I
InnerClasses:
  public static final #65= #61 of #63;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
