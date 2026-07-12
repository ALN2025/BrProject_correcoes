// Bytecode for: ext.mods.dressme.task.DressMeEffectManager$ActiveEffect
// File: ext\mods\dressme\task\DressMeEffectManager$ActiveEffect.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dressme/task/DressMeEffectManager$ActiveEffect.class
  Last modified 9 de jul de 2026; size 835 bytes
  MD5 checksum b02b381f20ef1678ccf05ba1d8ca3a5c
  Compiled from "DressMeEffectManager.java"
class ext.mods.dressme.task.DressMeEffectManager$ActiveEffect
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/dressme/task/DressMeEffectManager$ActiveEffect
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/dressme/task/DressMeEffectManager$ActiveEffect._skillId:I
   #8 = Class              #10            // ext/mods/dressme/task/DressMeEffectManager$ActiveEffect
   #9 = NameAndType        #11:#12        // _skillId:I
  #10 = Utf8               ext/mods/dressme/task/DressMeEffectManager$ActiveEffect
  #11 = Utf8               _skillId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/dressme/task/DressMeEffectManager$ActiveEffect._task:Ljava/util/concurrent/ScheduledFuture;
  #14 = NameAndType        #15:#16        // _task:Ljava/util/concurrent/ScheduledFuture;
  #15 = Utf8               _task
  #16 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #17 = Utf8               Signature
  #18 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #19 = Utf8               (ILjava/util/concurrent/ScheduledFuture;)V
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/dressme/task/DressMeEffectManager$ActiveEffect;
  #25 = Utf8               skillId
  #26 = Utf8               task
  #27 = Utf8               LocalVariableTypeTable
  #28 = Utf8               (ILjava/util/concurrent/ScheduledFuture<*>;)V
  #29 = Utf8               SourceFile
  #30 = Utf8               DressMeEffectManager.java
  #31 = Utf8               NestHost
  #32 = Class              #33            // ext/mods/dressme/task/DressMeEffectManager
  #33 = Utf8               ext/mods/dressme/task/DressMeEffectManager
  #34 = Utf8               InnerClasses
  #35 = Utf8               ActiveEffect
{
  public ext.mods.dressme.task.DressMeEffectManager$ActiveEffect(int, java.util.concurrent.ScheduledFuture<?>);
    descriptor: (ILjava/util/concurrent/ScheduledFuture;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _skillId:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
        14: return
      LineNumberTable:
        line 45: 0
        line 46: 4
        line 47: 9
        line 48: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/dressme/task/DressMeEffectManager$ActiveEffect;
            0      15     1 skillId   I
            0      15     2  task   Ljava/util/concurrent/ScheduledFuture;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     2  task   Ljava/util/concurrent/ScheduledFuture<*>;
    Signature: #28                          // (ILjava/util/concurrent/ScheduledFuture<*>;)V
}
SourceFile: "DressMeEffectManager.java"
NestHost: class ext/mods/dressme/task/DressMeEffectManager
