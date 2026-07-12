// Bytecode for: ext.mods.gameserver.model.entity.CursedWeapon$DropTimer
// File: ext\mods\gameserver\model\entity\CursedWeapon$DropTimer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/CursedWeapon$DropTimer.class
  Last modified 9 de jul de 2026; size 914 bytes
  MD5 checksum ab8d16c4d9637799ff36e0b320c758d0
  Compiled from "CursedWeapon.java"
class ext.mods.gameserver.model.entity.CursedWeapon$DropTimer implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/CursedWeapon$DropTimer
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/entity/CursedWeapon$DropTimer.this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
   #8 = Class              #10            // ext/mods/gameserver/model/entity/CursedWeapon$DropTimer
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
  #10 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon$DropTimer
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/gameserver/model/entity/CursedWeapon;
  #13 = Methodref          #14.#15        // java/lang/Object."<init>":()V
  #14 = Class              #16            // java/lang/Object
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/lang/Object
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Methodref          #20.#21        // ext/mods/gameserver/model/entity/CursedWeapon.isDropped:()Z
  #20 = Class              #22            // ext/mods/gameserver/model/entity/CursedWeapon
  #21 = NameAndType        #23:#24        // isDropped:()Z
  #22 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon
  #23 = Utf8               isDropped
  #24 = Utf8               ()Z
  #25 = Methodref          #20.#26        // ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
  #26 = NameAndType        #27:#18        // endOfLife:()V
  #27 = Utf8               endOfLife
  #28 = Class              #29            // java/lang/Runnable
  #29 = Utf8               java/lang/Runnable
  #30 = Utf8               (Lext/mods/gameserver/model/entity/CursedWeapon;)V
  #31 = Utf8               Code
  #32 = Utf8               LineNumberTable
  #33 = Utf8               LocalVariableTable
  #34 = Utf8               this
  #35 = Utf8               Lext/mods/gameserver/model/entity/CursedWeapon$DropTimer;
  #36 = Utf8               MethodParameters
  #37 = Utf8               run
  #38 = Utf8               StackMapTable
  #39 = Utf8               SourceFile
  #40 = Utf8               CursedWeapon.java
  #41 = Utf8               NestHost
  #42 = Utf8               InnerClasses
  #43 = Utf8               DropTimer
{
  final ext.mods.gameserver.model.entity.CursedWeapon this$0;
    descriptor: Lext/mods/gameserver/model/entity/CursedWeapon;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  protected ext.mods.gameserver.model.entity.CursedWeapon$DropTimer(ext.mods.gameserver.model.entity.CursedWeapon);
    descriptor: (Lext/mods/gameserver/model/entity/CursedWeapon;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: return
      LineNumberTable:
        line 755: 0
        line 756: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/CursedWeapon$DropTimer;
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
         4: invokevirtual #19                 // Method ext/mods/gameserver/model/entity/CursedWeapon.isDropped:()Z
         7: ifeq          17
        10: aload_0
        11: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        14: invokevirtual #25                 // Method ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
        17: return
      LineNumberTable:
        line 761: 0
        line 762: 10
        line 763: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/entity/CursedWeapon$DropTimer;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */
}
SourceFile: "CursedWeapon.java"
NestHost: class ext/mods/gameserver/model/entity/CursedWeapon
