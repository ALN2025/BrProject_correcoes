// Bytecode for: ext.mods.gameserver.model.zone.type.subtype.ResidenceZoneType
// File: ext\mods\gameserver\model\zone\type\subtype\ResidenceZoneType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType.class
  Last modified 9 de jul de 2026; size 676 bytes
  MD5 checksum e4336e8d86de2dbbb3cb3a62ef5b214d
  Compiled from "ResidenceZoneType.java"
public abstract class ext.mods.gameserver.model.zone.type.subtype.ResidenceZoneType extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #3 = NameAndType        #5:#6          // "<init>":(I)V
   #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #5 = Utf8               <init>
   #6 = Utf8               (I)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType._residenceId:I
   #8 = Class              #10            // ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType
   #9 = NameAndType        #11:#12        // _residenceId:I
  #10 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType
  #11 = Utf8               _residenceId
  #12 = Utf8               I
  #13 = Utf8               Code
  #14 = Utf8               LineNumberTable
  #15 = Utf8               LocalVariableTable
  #16 = Utf8               this
  #17 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType;
  #18 = Utf8               id
  #19 = Utf8               banishForeigners
  #20 = Utf8               getResidenceId
  #21 = Utf8               ()I
  #22 = Utf8               setResidenceId
  #23 = Utf8               residenceId
  #24 = Utf8               SourceFile
  #25 = Utf8               ResidenceZoneType.java
{
  protected ext.mods.gameserver.model.zone.type.subtype.ResidenceZoneType(int);
    descriptor: (I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: return
      LineNumberTable:
        line 35: 0
        line 36: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType;
            0       6     1    id   I

  public abstract void banishForeigners(int);
    descriptor: (I)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public int getResidenceId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _residenceId:I
         4: ireturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType;

  protected void setResidenceId(int);
    descriptor: (I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _residenceId:I
         5: return
      LineNumberTable:
        line 51: 0
        line 52: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/subtype/ResidenceZoneType;
            0       6     1 residenceId   I
}
SourceFile: "ResidenceZoneType.java"
