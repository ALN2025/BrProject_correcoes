// Bytecode for: ext.mods.gameserver.model.entity.events.teamvsteam.TvTAntiAFK$PlayerInfo
// File: ext\mods\gameserver\model\entity\events\teamvsteam\TvTAntiAFK$PlayerInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo.class
  Last modified 9 de jul de 2026; size 992 bytes
  MD5 checksum 2b7845fdc54fba58c7a8cc5898932039
  Compiled from "TvTAntiAFK.java"
class ext.mods.gameserver.model.entity.events.teamvsteam.TvTAntiAFK$PlayerInfo
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 3, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo._x:I
   #8 = Class              #10            // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo
   #9 = NameAndType        #11:#12        // _x:I
  #10 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo
  #11 = Utf8               _x
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo._y:I
  #14 = NameAndType        #15:#12        // _y:I
  #15 = Utf8               _y
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo._z:I
  #17 = NameAndType        #18:#12        // _z:I
  #18 = Utf8               _z
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo._sameLoc:I
  #20 = NameAndType        #21:#12        // _sameLoc:I
  #21 = Utf8               _sameLoc
  #22 = Utf8               (IIII)V
  #23 = Utf8               Code
  #24 = Utf8               LineNumberTable
  #25 = Utf8               LocalVariableTable
  #26 = Utf8               this
  #27 = Utf8               Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
  #28 = Utf8               x
  #29 = Utf8               y
  #30 = Utf8               z
  #31 = Utf8               sameLoc
  #32 = Utf8               isSameLocation
  #33 = Utf8               (III)Z
  #34 = Utf8               StackMapTable
  #35 = Utf8               incrementAndGetSameLoc
  #36 = Utf8               ()I
  #37 = Utf8               SourceFile
  #38 = Utf8               TvTAntiAFK.java
  #39 = Utf8               NestHost
  #40 = Class              #41            // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK
  #41 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK
  #42 = Utf8               InnerClasses
  #43 = Utf8               PlayerInfo
{
  public ext.mods.gameserver.model.entity.events.teamvsteam.TvTAntiAFK$PlayerInfo(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _x:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _y:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _z:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field _sameLoc:I
        25: return
      LineNumberTable:
        line 79: 0
        line 80: 4
        line 81: 9
        line 82: 14
        line 83: 19
        line 84: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
            0      26     1     x   I
            0      26     2     y   I
            0      26     3     z   I
            0      26     4 sameLoc   I

  public boolean isSameLocation(int, int, int);
    descriptor: (III)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: getfield      #7                  // Field _x:I
         4: iload_1
         5: if_icmpne     28
         8: aload_0
         9: getfield      #13                 // Field _y:I
        12: iload_2
        13: if_icmpne     28
        16: aload_0
        17: getfield      #16                 // Field _z:I
        20: iload_3
        21: if_icmpne     28
        24: iconst_1
        25: goto          29
        28: iconst_0
        29: ireturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
            0      30     1     x   I
            0      30     2     y   I
            0      30     3     z   I
      StackMapTable: number_of_entries = 2
        frame_type = 28 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int incrementAndGetSameLoc();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: dup
         2: getfield      #19                 // Field _sameLoc:I
         5: iconst_1
         6: iadd
         7: dup_x1
         8: putfield      #19                 // Field _sameLoc:I
        11: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK$PlayerInfo;
}
SourceFile: "TvTAntiAFK.java"
NestHost: class ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK
