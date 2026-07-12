// Bytecode for: ext.mods.gameserver.model.pledge.SubPledge
// File: ext\mods\gameserver\model\pledge\SubPledge.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/pledge/SubPledge.class
  Last modified 9 de jul de 2026; size 993 bytes
  MD5 checksum 543b9ca9f622fc807c15c7e2521a7c1d
  Compiled from "SubPledge.java"
public class ext.mods.gameserver.model.pledge.SubPledge
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/pledge/SubPledge
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/pledge/SubPledge._id:I
   #8 = Class              #10            // ext/mods/gameserver/model/pledge/SubPledge
   #9 = NameAndType        #11:#12        // _id:I
  #10 = Utf8               ext/mods/gameserver/model/pledge/SubPledge
  #11 = Utf8               _id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/pledge/SubPledge._subPledgeName:Ljava/lang/String;
  #14 = NameAndType        #15:#16        // _subPledgeName:Ljava/lang/String;
  #15 = Utf8               _subPledgeName
  #16 = Utf8               Ljava/lang/String;
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/model/pledge/SubPledge._leaderId:I
  #18 = NameAndType        #19:#12        // _leaderId:I
  #19 = Utf8               _leaderId
  #20 = Utf8               (ILjava/lang/String;I)V
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lext/mods/gameserver/model/pledge/SubPledge;
  #26 = Utf8               id
  #27 = Utf8               name
  #28 = Utf8               leaderId
  #29 = Utf8               getId
  #30 = Utf8               ()I
  #31 = Utf8               getName
  #32 = Utf8               ()Ljava/lang/String;
  #33 = Utf8               setName
  #34 = Utf8               (Ljava/lang/String;)V
  #35 = Utf8               getLeaderId
  #36 = Utf8               setLeaderId
  #37 = Utf8               (I)V
  #38 = Utf8               SourceFile
  #39 = Utf8               SubPledge.java
{
  public ext.mods.gameserver.model.pledge.SubPledge(int, java.lang.String, int);
    descriptor: (ILjava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _id:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _subPledgeName:Ljava/lang/String;
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field _leaderId:I
        19: return
      LineNumberTable:
        line 27: 0
        line 28: 4
        line 29: 9
        line 30: 14
        line 31: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/pledge/SubPledge;
            0      20     1    id   I
            0      20     2  name   Ljava/lang/String;
            0      20     3 leaderId   I

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _id:I
         4: ireturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/SubPledge;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _subPledgeName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/SubPledge;

  public void setName(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #13                 // Field _subPledgeName:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 45: 0
        line 46: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/SubPledge;
            0       6     1  name   Ljava/lang/String;

  public int getLeaderId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _leaderId:I
         4: ireturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/SubPledge;

  public void setLeaderId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #17                 // Field _leaderId:I
         5: return
      LineNumberTable:
        line 55: 0
        line 56: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/pledge/SubPledge;
            0       6     1 leaderId   I
}
SourceFile: "SubPledge.java"
