// Bytecode for: ext.mods.gameserver.model.manor.ManorArea
// File: ext\mods\gameserver\model\manor\ManorArea.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/manor/ManorArea.class
  Last modified 9 de jul de 2026; size 646 bytes
  MD5 checksum 7702cf42b622484e2d88a0ace2cec43b
  Compiled from "ManorArea.java"
public class ext.mods.gameserver.model.manor.ManorArea extends ext.mods.commons.geometry.Territory
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/manor/ManorArea
  super_class: #2                         // ext/mods/commons/geometry/Territory
  interfaces: 0, fields: 1, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/commons/geometry/Territory."<init>":(Lext/mods/commons/data/StatSet;)V
   #2 = Class              #4             // ext/mods/commons/geometry/Territory
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/commons/data/StatSet;)V
   #4 = Utf8               ext/mods/commons/geometry/Territory
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #7 = String             #8             // castleId
   #8 = Utf8               castleId
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;)I
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/model/manor/ManorArea._castleId:I
  #16 = Class              #18            // ext/mods/gameserver/model/manor/ManorArea
  #17 = NameAndType        #19:#20        // _castleId:I
  #18 = Utf8               ext/mods/gameserver/model/manor/ManorArea
  #19 = Utf8               _castleId
  #20 = Utf8               I
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lext/mods/gameserver/model/manor/ManorArea;
  #26 = Utf8               set
  #27 = Utf8               Lext/mods/commons/data/StatSet;
  #28 = Utf8               getCastleId
  #29 = Utf8               ()I
  #30 = Utf8               SourceFile
  #31 = Utf8               ManorArea.java
{
  public ext.mods.gameserver.model.manor.ManorArea(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/commons/geometry/Territory."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #7                  // String castleId
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        12: putfield      #15                 // Field _castleId:I
        15: return
      LineNumberTable:
        line 35: 0
        line 37: 5
        line 38: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/manor/ManorArea;
            0      16     1   set   Lext/mods/commons/data/StatSet;

  public final int getCastleId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _castleId:I
         4: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/ManorArea;
}
SourceFile: "ManorArea.java"
