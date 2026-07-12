// Bytecode for: ext.mods.gameserver.data.manager.BotsPreventionManager$PlayerData
// File: ext\mods\gameserver\data\manager\BotsPreventionManager$PlayerData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.class
  Last modified 9 de jul de 2026; size 1014 bytes
  MD5 checksum 995bb4699351cbbf4291dce241d15692
  Compiled from "BotsPreventionManager.java"
public class ext.mods.gameserver.data.manager.BotsPreventionManager$PlayerData
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #17                         // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
  super_class: #8                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 1, attributes: 3
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
  #13 = Class              #14            // java/util/ArrayList
  #14 = Utf8               java/util/ArrayList
  #15 = Methodref          #13.#9         // java/util/ArrayList."<init>":()V
  #16 = Fieldref           #17.#18        // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.options:Ljava/util/List;
  #17 = Class              #19            // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
  #18 = NameAndType        #20:#21        // options:Ljava/util/List;
  #19 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
  #20 = Utf8               options
  #21 = Utf8               Ljava/util/List;
  #22 = Fieldref           #17.#23        // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.firstWindow:Z
  #23 = NameAndType        #24:#25        // firstWindow:Z
  #24 = Utf8               firstWindow
  #25 = Utf8               Z
  #26 = Utf8               mainPattern
  #27 = Utf8               I
  #28 = Utf8               Signature
  #29 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #30 = Utf8               patternId
  #31 = Utf8               (Lext/mods/gameserver/data/manager/BotsPreventionManager;)V
  #32 = Utf8               Code
  #33 = Utf8               LineNumberTable
  #34 = Utf8               LocalVariableTable
  #35 = Utf8               this
  #36 = Utf8               Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;
  #37 = Utf8               this$0
  #38 = Utf8               Lext/mods/gameserver/data/manager/BotsPreventionManager;
  #39 = Utf8               MethodParameters
  #40 = Utf8               SourceFile
  #41 = Utf8               BotsPreventionManager.java
  #42 = Utf8               NestHost
  #43 = Class              #44            // ext/mods/gameserver/data/manager/BotsPreventionManager
  #44 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager
  #45 = Utf8               InnerClasses
  #46 = Utf8               PlayerData
{
  public int mainPattern;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public java.util.List<java.lang.Integer> options;
    descriptor: Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Signature: #29                          // Ljava/util/List<Ljava/lang/Integer;>;

  public boolean firstWindow;
    descriptor: Z
    flags: (0x0001) ACC_PUBLIC

  public int patternId;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.data.manager.BotsPreventionManager$PlayerData(ext.mods.gameserver.data.manager.BotsPreventionManager);
    descriptor: (Lext/mods/gameserver/data/manager/BotsPreventionManager;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: dup
         2: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokespecial #7                  // Method java/lang/Object."<init>":()V
        11: aload_0
        12: new           #13                 // class java/util/ArrayList
        15: dup
        16: invokespecial #15                 // Method java/util/ArrayList."<init>":()V
        19: putfield      #16                 // Field options:Ljava/util/List;
        22: aload_0
        23: iconst_1
        24: putfield      #22                 // Field firstWindow:Z
        27: return
      LineNumberTable:
        line 422: 0
        line 427: 11
        line 423: 22
        line 424: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;
            0      28     1 this$0   Lext/mods/gameserver/data/manager/BotsPreventionManager;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
}
SourceFile: "BotsPreventionManager.java"
NestHost: class ext/mods/gameserver/data/manager/BotsPreventionManager
InnerClasses:
  public #46= #17 of #43;                 // PlayerData=class ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData of class ext/mods/gameserver/data/manager/BotsPreventionManager
