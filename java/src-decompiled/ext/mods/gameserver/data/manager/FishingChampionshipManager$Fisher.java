// Bytecode for: ext.mods.gameserver.data.manager.FishingChampionshipManager$Fisher
// File: ext\mods\gameserver\data\manager\FishingChampionshipManager$Fisher.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher.class
  Last modified 9 de jul de 2026; size 1394 bytes
  MD5 checksum 34fa2fd00d02f2287de1e819c2bef431
  Compiled from "FishingChampionshipManager.java"
class ext.mods.gameserver.data.manager.FishingChampionshipManager$Fisher
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
  super_class: #8                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 6, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Methodref          #8.#9          // java/lang/Object."<init>":()V
   #8 = Class              #10            // java/lang/Object
   #9 = NameAndType        #11:#12        // "<init>":()V
  #10 = Utf8               java/lang/Object
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher._name:Ljava/lang/String;
  #14 = Class              #16            // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
  #15 = NameAndType        #17:#18        // _name:Ljava/lang/String;
  #16 = Utf8               ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher
  #17 = Utf8               _name
  #18 = Utf8               Ljava/lang/String;
  #19 = Fieldref           #14.#20        // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher._length:D
  #20 = NameAndType        #21:#22        // _length:D
  #21 = Utf8               _length
  #22 = Utf8               D
  #23 = Fieldref           #14.#24        // ext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher._reward:I
  #24 = NameAndType        #25:#26        // _reward:I
  #25 = Utf8               _reward
  #26 = Utf8               I
  #27 = Utf8               (Lext/mods/gameserver/data/manager/FishingChampionshipManager;Ljava/lang/String;DI)V
  #28 = Utf8               Code
  #29 = Utf8               LineNumberTable
  #30 = Utf8               LocalVariableTable
  #31 = Utf8               this
  #32 = Utf8               Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
  #33 = Utf8               name
  #34 = Utf8               length
  #35 = Utf8               rewardType
  #36 = Utf8               MethodParameters
  #37 = Utf8               setLength
  #38 = Utf8               (D)V
  #39 = Utf8               value
  #40 = Utf8               setRewardType
  #41 = Utf8               (I)V
  #42 = Utf8               getName
  #43 = Utf8               ()Ljava/lang/String;
  #44 = Utf8               getRewardType
  #45 = Utf8               ()I
  #46 = Utf8               getLength
  #47 = Utf8               ()D
  #48 = Utf8               SourceFile
  #49 = Utf8               FishingChampionshipManager.java
  #50 = Utf8               NestHost
  #51 = Class              #52            // ext/mods/gameserver/data/manager/FishingChampionshipManager
  #52 = Utf8               ext/mods/gameserver/data/manager/FishingChampionshipManager
  #53 = Utf8               InnerClasses
  #54 = Utf8               Fisher
{
  public ext.mods.gameserver.data.manager.FishingChampionshipManager$Fisher(ext.mods.gameserver.data.manager.FishingChampionshipManager, java.lang.String, double, int);
    descriptor: (Lext/mods/gameserver/data/manager/FishingChampionshipManager;Ljava/lang/String;DI)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=5
         0: aload_1
         1: dup
         2: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokespecial #7                  // Method java/lang/Object."<init>":()V
        11: aload_0
        12: aload_2
        13: putfield      #13                 // Field _name:Ljava/lang/String;
        16: aload_0
        17: dload_3
        18: putfield      #19                 // Field _length:D
        21: aload_0
        22: iload         5
        24: putfield      #23                 // Field _reward:I
        27: return
      LineNumberTable:
        line 486: 0
        line 487: 11
        line 488: 16
        line 489: 21
        line 490: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
            0      28     2  name   Ljava/lang/String;
            0      28     3 length   D
            0      28     5 rewardType   I
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic
      <no name>
      <no name>
      <no name>

  public void setLength(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: putfield      #19                 // Field _length:D
         5: return
      LineNumberTable:
        line 494: 0
        line 495: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
            0       6     1 value   D

  public void setRewardType(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #23                 // Field _reward:I
         5: return
      LineNumberTable:
        line 499: 0
        line 500: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
            0       6     1 value   I

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 504: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;

  public int getRewardType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _reward:I
         4: ireturn
      LineNumberTable:
        line 509: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;

  public double getLength();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _length:D
         4: dreturn
      LineNumberTable:
        line 514: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/FishingChampionshipManager$Fisher;
}
SourceFile: "FishingChampionshipManager.java"
NestHost: class ext/mods/gameserver/data/manager/FishingChampionshipManager
