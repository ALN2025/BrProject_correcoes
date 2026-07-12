// Bytecode for: ext.mods.gameserver.model.entity.autofarm.OfflineFarmRoutine$SavedBuff
// File: ext\mods\gameserver\model\entity\autofarm\OfflineFarmRoutine$SavedBuff.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff.class
  Last modified 9 de jul de 2026; size 957 bytes
  MD5 checksum f74583186baa7a28adbe69933a24f8a4
  Compiled from "OfflineFarmRoutine.java"
class ext.mods.gameserver.model.entity.autofarm.OfflineFarmRoutine$SavedBuff
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 4, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff._skillId:I
   #8 = Class              #10            // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff
   #9 = NameAndType        #11:#12        // _skillId:I
  #10 = Utf8               ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff
  #11 = Utf8               _skillId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff._skillLevel:I
  #14 = NameAndType        #15:#12        // _skillLevel:I
  #15 = Utf8               _skillLevel
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff._remainingTime:I
  #17 = NameAndType        #18:#12        // _remainingTime:I
  #18 = Utf8               _remainingTime
  #19 = Utf8               (III)V
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff;
  #25 = Utf8               skillId
  #26 = Utf8               skillLevel
  #27 = Utf8               remainingTime
  #28 = Utf8               getSkillId
  #29 = Utf8               ()I
  #30 = Utf8               getSkillLevel
  #31 = Utf8               getRemainingTime
  #32 = Utf8               SourceFile
  #33 = Utf8               OfflineFarmRoutine.java
  #34 = Utf8               NestHost
  #35 = Class              #36            // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
  #36 = Utf8               ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
  #37 = Utf8               InnerClasses
  #38 = Utf8               SavedBuff
{
  public ext.mods.gameserver.model.entity.autofarm.OfflineFarmRoutine$SavedBuff(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _skillId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _skillLevel:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _remainingTime:I
        19: return
      LineNumberTable:
        line 49: 0
        line 50: 4
        line 51: 9
        line 52: 14
        line 53: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff;
            0      20     1 skillId   I
            0      20     2 skillLevel   I
            0      20     3 remainingTime   I

  public int getSkillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _skillId:I
         4: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff;

  public int getSkillLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _skillLevel:I
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff;

  public int getRemainingTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _remainingTime:I
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff;
}
SourceFile: "OfflineFarmRoutine.java"
NestHost: class ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
