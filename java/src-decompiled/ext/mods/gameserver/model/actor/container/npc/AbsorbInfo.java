// Bytecode for: ext.mods.gameserver.model.actor.container.npc.AbsorbInfo
// File: ext\mods\gameserver\model\actor\container\npc\AbsorbInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/npc/AbsorbInfo.class
  Last modified 9 de jul de 2026; size 1091 bytes
  MD5 checksum b89e500a944c5a82600f4588cdb40875
  Compiled from "AbsorbInfo.java"
public final class ext.mods.gameserver.model.actor.container.npc.AbsorbInfo
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo._itemId:I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo
   #9 = NameAndType        #11:#12        // _itemId:I
  #10 = Utf8               ext/mods/gameserver/model/actor/container/npc/AbsorbInfo
  #11 = Utf8               _itemId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo._registered:Z
  #14 = NameAndType        #15:#16        // _registered:Z
  #15 = Utf8               _registered
  #16 = Utf8               Z
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/model/actor/container/npc/AbsorbInfo._absorbedHpPercent:I
  #18 = NameAndType        #19:#12        // _absorbedHpPercent:I
  #19 = Utf8               _absorbedHpPercent
  #20 = Utf8               (I)V
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
  #26 = Utf8               itemId
  #27 = Utf8               isRegistered
  #28 = Utf8               ()Z
  #29 = Utf8               setRegistered
  #30 = Utf8               (Z)V
  #31 = Utf8               state
  #32 = Utf8               getItemId
  #33 = Utf8               ()I
  #34 = Utf8               setItemId
  #35 = Utf8               setAbsorbedHpPercent
  #36 = Utf8               percent
  #37 = Utf8               isValid
  #38 = Utf8               (I)Z
  #39 = Utf8               StackMapTable
  #40 = Utf8               SourceFile
  #41 = Utf8               AbsorbInfo.java
{
  public ext.mods.gameserver.model.actor.container.npc.AbsorbInfo(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _itemId:I
         9: return
      LineNumberTable:
        line 34: 0
        line 35: 4
        line 36: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
            0      10     1 itemId   I

  public boolean isRegistered();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _registered:Z
         4: ireturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;

  public void setRegistered(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _registered:Z
         5: return
      LineNumberTable:
        line 45: 0
        line 46: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
            0       6     1 state   Z

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;

  public void setItemId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _itemId:I
         5: return
      LineNumberTable:
        line 55: 0
        line 56: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
            0       6     1 itemId   I

  public void setAbsorbedHpPercent(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #17                 // Field _absorbedHpPercent:I
         5: return
      LineNumberTable:
        line 60: 0
        line 61: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
            0       6     1 percent   I

  public boolean isValid(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _itemId:I
         4: iload_1
         5: if_icmpne     21
         8: aload_0
         9: getfield      #17                 // Field _absorbedHpPercent:I
        12: bipush        50
        14: if_icmpge     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/container/npc/AbsorbInfo;
            0      23     1 itemId   I
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "AbsorbInfo.java"
