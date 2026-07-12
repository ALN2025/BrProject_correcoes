// Bytecode for: ext.mods.gameserver.data.manager.ItemLevelDelevelManager$LevelDelevelConfig
// File: ext\mods\gameserver\data\manager\ItemLevelDelevelManager$LevelDelevelConfig.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig.class
  Last modified 9 de jul de 2026; size 646 bytes
  MD5 checksum fddfaff550fa94130c2a8f7acfb3e465
  Compiled from "ItemLevelDelevelManager.java"
public final class ext.mods.gameserver.data.manager.ItemLevelDelevelManager$LevelDelevelConfig
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig.levelAdd:I
   #8 = Class              #10            // ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig
   #9 = NameAndType        #11:#12        // levelAdd:I
  #10 = Utf8               ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig
  #11 = Utf8               levelAdd
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig.levelRemove:I
  #14 = NameAndType        #15:#12        // levelRemove:I
  #15 = Utf8               levelRemove
  #16 = Utf8               (II)V
  #17 = Utf8               Code
  #18 = Utf8               LineNumberTable
  #19 = Utf8               LocalVariableTable
  #20 = Utf8               this
  #21 = Utf8               Lext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig;
  #22 = Utf8               SourceFile
  #23 = Utf8               ItemLevelDelevelManager.java
  #24 = Utf8               NestHost
  #25 = Class              #26            // ext/mods/gameserver/data/manager/ItemLevelDelevelManager
  #26 = Utf8               ext/mods/gameserver/data/manager/ItemLevelDelevelManager
  #27 = Utf8               InnerClasses
  #28 = Utf8               LevelDelevelConfig
{
  public final int levelAdd;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int levelRemove;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.gameserver.data.manager.ItemLevelDelevelManager$LevelDelevelConfig(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field levelAdd:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field levelRemove:I
        14: return
      LineNumberTable:
        line 162: 0
        line 163: 4
        line 164: 9
        line 165: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig;
            0      15     1 levelAdd   I
            0      15     2 levelRemove   I
}
SourceFile: "ItemLevelDelevelManager.java"
NestHost: class ext/mods/gameserver/data/manager/ItemLevelDelevelManager
InnerClasses:
  public static final #28= #8 of #25;     // LevelDelevelConfig=class ext/mods/gameserver/data/manager/ItemLevelDelevelManager$LevelDelevelConfig of class ext/mods/gameserver/data/manager/ItemLevelDelevelManager
