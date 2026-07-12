// Bytecode for: ext.mods.dressme.holder.DressMeHolder
// File: ext\mods\dressme\holder\DressMeHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dressme/holder/DressMeHolder.class
  Last modified 9 de jul de 2026; size 3138 bytes
  MD5 checksum 8d01832cfe6ca9c3f887e2827ebc710a
  Compiled from "DressMeHolder.java"
public class ext.mods.dressme.holder.DressMeHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/dressme/holder/DressMeHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 14, methods: 18, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // skillId
    #8 = Utf8               skillId
    #9 = Methodref          #10.#11       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #10 = Class              #12           // ext/mods/commons/data/StatSet
   #11 = NameAndType        #13:#14       // getInteger:(Ljava/lang/String;)I
   #12 = Utf8               ext/mods/commons/data/StatSet
   #13 = Utf8               getInteger
   #14 = Utf8               (Ljava/lang/String;)I
   #15 = Fieldref           #16.#17       // ext/mods/dressme/holder/DressMeHolder._skillId:I
   #16 = Class              #18           // ext/mods/dressme/holder/DressMeHolder
   #17 = NameAndType        #19:#20       // _skillId:I
   #18 = Utf8               ext/mods/dressme/holder/DressMeHolder
   #19 = Utf8               _skillId
   #20 = Utf8               I
   #21 = String             #22           // name
   #22 = Utf8               name
   #23 = String             #24           //
   #24 = Utf8
   #25 = Methodref          #10.#26       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #26 = NameAndType        #27:#28       // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #27 = Utf8               getString
   #28 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #29 = Fieldref           #16.#30       // ext/mods/dressme/holder/DressMeHolder._name:Ljava/lang/String;
   #30 = NameAndType        #31:#32       // _name:Ljava/lang/String;
   #31 = Utf8               _name
   #32 = Utf8               Ljava/lang/String;
   #33 = String             #34           // type
   #34 = Utf8               type
   #35 = String             #36           // ARMOR
   #36 = Utf8               ARMOR
   #37 = Methodref          #38.#39       // ext/mods/dressme/holder/DressMeVisualType.valueOf:(Ljava/lang/String;)Lext/mods/dressme/holder/DressMeVisualType;
   #38 = Class              #40           // ext/mods/dressme/holder/DressMeVisualType
   #39 = NameAndType        #41:#42       // valueOf:(Ljava/lang/String;)Lext/mods/dressme/holder/DressMeVisualType;
   #40 = Utf8               ext/mods/dressme/holder/DressMeVisualType
   #41 = Utf8               valueOf
   #42 = Utf8               (Ljava/lang/String;)Lext/mods/dressme/holder/DressMeVisualType;
   #43 = Fieldref           #16.#44       // ext/mods/dressme/holder/DressMeHolder._type:Lext/mods/dressme/holder/DressMeVisualType;
   #44 = NameAndType        #45:#46       // _type:Lext/mods/dressme/holder/DressMeVisualType;
   #45 = Utf8               _type
   #46 = Utf8               Lext/mods/dressme/holder/DressMeVisualType;
   #47 = String             #48           // isVip
   #48 = Utf8               isVip
   #49 = Methodref          #10.#50       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
   #50 = NameAndType        #51:#52       // getBool:(Ljava/lang/String;Z)Z
   #51 = Utf8               getBool
   #52 = Utf8               (Ljava/lang/String;Z)Z
   #53 = Fieldref           #16.#54       // ext/mods/dressme/holder/DressMeHolder._isVip:Z
   #54 = NameAndType        #55:#56       // _isVip:Z
   #55 = Utf8               _isVip
   #56 = Utf8               Z
   #57 = String             #58           // chest
   #58 = Utf8               chest
   #59 = Methodref          #10.#60       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #60 = NameAndType        #13:#61       // getInteger:(Ljava/lang/String;I)I
   #61 = Utf8               (Ljava/lang/String;I)I
   #62 = Fieldref           #16.#63       // ext/mods/dressme/holder/DressMeHolder._chestId:I
   #63 = NameAndType        #64:#20       // _chestId:I
   #64 = Utf8               _chestId
   #65 = String             #66           // legs
   #66 = Utf8               legs
   #67 = Fieldref           #16.#68       // ext/mods/dressme/holder/DressMeHolder._legsId:I
   #68 = NameAndType        #69:#20       // _legsId:I
   #69 = Utf8               _legsId
   #70 = String             #71           // gloves
   #71 = Utf8               gloves
   #72 = Fieldref           #16.#73       // ext/mods/dressme/holder/DressMeHolder._glovesId:I
   #73 = NameAndType        #74:#20       // _glovesId:I
   #74 = Utf8               _glovesId
   #75 = String             #76           // feet
   #76 = Utf8               feet
   #77 = Fieldref           #16.#78       // ext/mods/dressme/holder/DressMeHolder._feetId:I
   #78 = NameAndType        #79:#20       // _feetId:I
   #79 = Utf8               _feetId
   #80 = String             #81           // helmet
   #81 = Utf8               helmet
   #82 = Fieldref           #16.#83       // ext/mods/dressme/holder/DressMeHolder._helmetId:I
   #83 = NameAndType        #84:#20       // _helmetId:I
   #84 = Utf8               _helmetId
   #85 = String             #86           // rhand
   #86 = Utf8               rhand
   #87 = Fieldref           #16.#88       // ext/mods/dressme/holder/DressMeHolder._rHandId:I
   #88 = NameAndType        #89:#20       // _rHandId:I
   #89 = Utf8               _rHandId
   #90 = String             #91           // lhand
   #91 = Utf8               lhand
   #92 = Fieldref           #16.#93       // ext/mods/dressme/holder/DressMeHolder._lHandId:I
   #93 = NameAndType        #94:#20       // _lHandId:I
   #94 = Utf8               _lHandId
   #95 = String             #96           // lrhand
   #96 = Utf8               lrhand
   #97 = Fieldref           #16.#98       // ext/mods/dressme/holder/DressMeHolder._lrHandId:I
   #98 = NameAndType        #99:#20       // _lrHandId:I
   #99 = Utf8               _lrHandId
  #100 = Fieldref           #16.#101      // ext/mods/dressme/holder/DressMeHolder._weaponTypeVisual:Ljava/lang/String;
  #101 = NameAndType        #102:#32      // _weaponTypeVisual:Ljava/lang/String;
  #102 = Utf8               _weaponTypeVisual
  #103 = Fieldref           #16.#104      // ext/mods/dressme/holder/DressMeHolder._effect:Lext/mods/dressme/holder/DressMeEffectHolder;
  #104 = NameAndType        #105:#106     // _effect:Lext/mods/dressme/holder/DressMeEffectHolder;
  #105 = Utf8               _effect
  #106 = Utf8               Lext/mods/dressme/holder/DressMeEffectHolder;
  #107 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #108 = Utf8               Code
  #109 = Utf8               LineNumberTable
  #110 = Utf8               LocalVariableTable
  #111 = Utf8               this
  #112 = Utf8               Lext/mods/dressme/holder/DressMeHolder;
  #113 = Utf8               set
  #114 = Utf8               Lext/mods/commons/data/StatSet;
  #115 = Utf8               setVisualSet
  #116 = Utf8               setWeaponSet
  #117 = Utf8               setEffect
  #118 = Utf8               (Lext/mods/dressme/holder/DressMeEffectHolder;)V
  #119 = Utf8               effect
  #120 = Utf8               getSkillId
  #121 = Utf8               ()I
  #122 = Utf8               getName
  #123 = Utf8               ()Ljava/lang/String;
  #124 = Utf8               ()Z
  #125 = Utf8               getType
  #126 = Utf8               ()Lext/mods/dressme/holder/DressMeVisualType;
  #127 = Utf8               getChestId
  #128 = Utf8               getLegsId
  #129 = Utf8               getGlovesId
  #130 = Utf8               getFeetId
  #131 = Utf8               getHelmetId
  #132 = Utf8               getWeaponTypeVisual
  #133 = Utf8               getRightHandId
  #134 = Utf8               getLeftHandId
  #135 = Utf8               getTwoHandId
  #136 = Utf8               getEffect
  #137 = Utf8               ()Lext/mods/dressme/holder/DressMeEffectHolder;
  #138 = Utf8               SourceFile
  #139 = Utf8               DressMeHolder.java
{
  public ext.mods.dressme.holder.DressMeHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String skillId
         8: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        11: putfield      #15                 // Field _skillId:I
        14: aload_0
        15: aload_1
        16: ldc           #21                 // String name
        18: ldc           #23                 // String
        20: invokevirtual #25                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        23: putfield      #29                 // Field _name:Ljava/lang/String;
        26: aload_0
        27: aload_1
        28: ldc           #33                 // String type
        30: ldc           #35                 // String ARMOR
        32: invokevirtual #25                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        35: invokestatic  #37                 // Method ext/mods/dressme/holder/DressMeVisualType.valueOf:(Ljava/lang/String;)Lext/mods/dressme/holder/DressMeVisualType;
        38: putfield      #43                 // Field _type:Lext/mods/dressme/holder/DressMeVisualType;
        41: aload_0
        42: aload_1
        43: ldc           #47                 // String isVip
        45: iconst_0
        46: invokevirtual #49                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        49: putfield      #53                 // Field _isVip:Z
        52: return
      LineNumberTable:
        line 36: 0
        line 37: 4
        line 38: 14
        line 39: 26
        line 40: 41
        line 41: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/dressme/holder/DressMeHolder;
            0      53     1   set   Lext/mods/commons/data/StatSet;

  public void setVisualSet(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #57                 // String chest
         4: iconst_0
         5: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
         8: putfield      #62                 // Field _chestId:I
        11: aload_0
        12: aload_1
        13: ldc           #65                 // String legs
        15: iconst_0
        16: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        19: putfield      #67                 // Field _legsId:I
        22: aload_0
        23: aload_1
        24: ldc           #70                 // String gloves
        26: iconst_0
        27: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        30: putfield      #72                 // Field _glovesId:I
        33: aload_0
        34: aload_1
        35: ldc           #75                 // String feet
        37: iconst_0
        38: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        41: putfield      #77                 // Field _feetId:I
        44: aload_0
        45: aload_1
        46: ldc           #80                 // String helmet
        48: iconst_0
        49: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        52: putfield      #82                 // Field _helmetId:I
        55: return
      LineNumberTable:
        line 45: 0
        line 46: 11
        line 47: 22
        line 48: 33
        line 49: 44
        line 50: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/dressme/holder/DressMeHolder;
            0      56     1   set   Lext/mods/commons/data/StatSet;

  public void setWeaponSet(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #85                 // String rhand
         4: iconst_0
         5: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
         8: putfield      #87                 // Field _rHandId:I
        11: aload_0
        12: aload_1
        13: ldc           #90                 // String lhand
        15: iconst_0
        16: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        19: putfield      #92                 // Field _lHandId:I
        22: aload_0
        23: aload_1
        24: ldc           #95                 // String lrhand
        26: iconst_0
        27: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        30: putfield      #97                 // Field _lrHandId:I
        33: aload_0
        34: aload_1
        35: ldc           #33                 // String type
        37: ldc           #23                 // String
        39: invokevirtual #25                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        42: putfield      #100                // Field _weaponTypeVisual:Ljava/lang/String;
        45: return
      LineNumberTable:
        line 54: 0
        line 55: 11
        line 56: 22
        line 57: 33
        line 58: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/dressme/holder/DressMeHolder;
            0      46     1   set   Lext/mods/commons/data/StatSet;

  public void setEffect(ext.mods.dressme.holder.DressMeEffectHolder);
    descriptor: (Lext/mods/dressme/holder/DressMeEffectHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #103                // Field _effect:Lext/mods/dressme/holder/DressMeEffectHolder;
         5: return
      LineNumberTable:
        line 62: 0
        line 63: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/dressme/holder/DressMeHolder;
            0       6     1 effect   Lext/mods/dressme/holder/DressMeEffectHolder;

  public int getSkillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _skillId:I
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public boolean isVip();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _isVip:Z
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public ext.mods.dressme.holder.DressMeVisualType getType();
    descriptor: ()Lext/mods/dressme/holder/DressMeVisualType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _type:Lext/mods/dressme/holder/DressMeVisualType;
         4: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public int getChestId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #62                 // Field _chestId:I
         4: ireturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public int getLegsId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #67                 // Field _legsId:I
         4: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public int getGlovesId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #72                 // Field _glovesId:I
         4: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public int getFeetId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #77                 // Field _feetId:I
         4: ireturn
      LineNumberTable:
        line 102: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public int getHelmetId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #82                 // Field _helmetId:I
         4: ireturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public java.lang.String getWeaponTypeVisual();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #100                // Field _weaponTypeVisual:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public int getRightHandId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #87                 // Field _rHandId:I
         4: ireturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public int getLeftHandId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #92                 // Field _lHandId:I
         4: ireturn
      LineNumberTable:
        line 122: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public int getTwoHandId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #97                 // Field _lrHandId:I
         4: ireturn
      LineNumberTable:
        line 127: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;

  public ext.mods.dressme.holder.DressMeEffectHolder getEffect();
    descriptor: ()Lext/mods/dressme/holder/DressMeEffectHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #103                // Field _effect:Lext/mods/dressme/holder/DressMeEffectHolder;
         4: areturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeHolder;
}
SourceFile: "DressMeHolder.java"
