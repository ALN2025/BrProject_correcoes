// Bytecode for: ext.mods.gameserver.model.actor.template.CreatureTemplate
// File: ext\mods\gameserver\model\actor\template\CreatureTemplate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/template/CreatureTemplate.class
  Last modified 9 de jul de 2026; size 3396 bytes
  MD5 checksum 1170465bc25abaac0acb531e55ff42d9
  Compiled from "CreatureTemplate.java"
public class ext.mods.gameserver.model.actor.template.CreatureTemplate
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/actor/template/CreatureTemplate
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 20, methods: 21, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // str
    #8 = Utf8               str
    #9 = Methodref          #10.#11       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #10 = Class              #12           // ext/mods/commons/data/StatSet
   #11 = NameAndType        #13:#14       // getInteger:(Ljava/lang/String;I)I
   #12 = Utf8               ext/mods/commons/data/StatSet
   #13 = Utf8               getInteger
   #14 = Utf8               (Ljava/lang/String;I)I
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseSTR:I
   #16 = Class              #18           // ext/mods/gameserver/model/actor/template/CreatureTemplate
   #17 = NameAndType        #19:#20       // _baseSTR:I
   #18 = Utf8               ext/mods/gameserver/model/actor/template/CreatureTemplate
   #19 = Utf8               _baseSTR
   #20 = Utf8               I
   #21 = String             #22           // con
   #22 = Utf8               con
   #23 = Fieldref           #16.#24       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseCON:I
   #24 = NameAndType        #25:#20       // _baseCON:I
   #25 = Utf8               _baseCON
   #26 = String             #27           // dex
   #27 = Utf8               dex
   #28 = Fieldref           #16.#29       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseDEX:I
   #29 = NameAndType        #30:#20       // _baseDEX:I
   #30 = Utf8               _baseDEX
   #31 = String             #32           // int
   #32 = Utf8               int
   #33 = Fieldref           #16.#34       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseINT:I
   #34 = NameAndType        #35:#20       // _baseINT:I
   #35 = Utf8               _baseINT
   #36 = String             #37           // wit
   #37 = Utf8               wit
   #38 = Fieldref           #16.#39       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseWIT:I
   #39 = NameAndType        #40:#20       // _baseWIT:I
   #40 = Utf8               _baseWIT
   #41 = String             #42           // men
   #42 = Utf8               men
   #43 = Fieldref           #16.#44       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseMEN:I
   #44 = NameAndType        #45:#20       // _baseMEN:I
   #45 = Utf8               _baseMEN
   #46 = String             #47           // hp
   #47 = Utf8               hp
   #48 = Methodref          #10.#49       // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
   #49 = NameAndType        #50:#51       // getDouble:(Ljava/lang/String;D)D
   #50 = Utf8               getDouble
   #51 = Utf8               (Ljava/lang/String;D)D
   #52 = Fieldref           #16.#53       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseHpMax:D
   #53 = NameAndType        #54:#55       // _baseHpMax:D
   #54 = Utf8               _baseHpMax
   #55 = Utf8               D
   #56 = String             #57           // mp
   #57 = Utf8               mp
   #58 = Fieldref           #16.#59       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseMpMax:D
   #59 = NameAndType        #60:#55       // _baseMpMax:D
   #60 = Utf8               _baseMpMax
   #61 = String             #62           // hpRegen
   #62 = Utf8               hpRegen
   #63 = Double             1.5d
   #65 = Fieldref           #16.#66       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseHpRegen:D
   #66 = NameAndType        #67:#55       // _baseHpRegen:D
   #67 = Utf8               _baseHpRegen
   #68 = String             #69           // mpRegen
   #69 = Utf8               mpRegen
   #70 = Double             0.9d
   #72 = Fieldref           #16.#73       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseMpRegen:D
   #73 = NameAndType        #74:#55       // _baseMpRegen:D
   #74 = Utf8               _baseMpRegen
   #75 = String             #76           // pAtk
   #76 = Utf8               pAtk
   #77 = Methodref          #10.#78       // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
   #78 = NameAndType        #50:#79       // getDouble:(Ljava/lang/String;)D
   #79 = Utf8               (Ljava/lang/String;)D
   #80 = Fieldref           #16.#81       // ext/mods/gameserver/model/actor/template/CreatureTemplate._basePAtk:D
   #81 = NameAndType        #82:#55       // _basePAtk:D
   #82 = Utf8               _basePAtk
   #83 = String             #84           // mAtk
   #84 = Utf8               mAtk
   #85 = Fieldref           #16.#86       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseMAtk:D
   #86 = NameAndType        #87:#55       // _baseMAtk:D
   #87 = Utf8               _baseMAtk
   #88 = String             #89           // pDef
   #89 = Utf8               pDef
   #90 = Fieldref           #16.#91       // ext/mods/gameserver/model/actor/template/CreatureTemplate._basePDef:D
   #91 = NameAndType        #92:#55       // _basePDef:D
   #92 = Utf8               _basePDef
   #93 = String             #94           // mDef
   #94 = Utf8               mDef
   #95 = Fieldref           #16.#96       // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseMDef:D
   #96 = NameAndType        #97:#55       // _baseMDef:D
   #97 = Utf8               _baseMDef
   #98 = String             #99           // atkSpd
   #99 = Utf8               atkSpd
  #100 = Double             300.0d
  #102 = Fieldref           #16.#103      // ext/mods/gameserver/model/actor/template/CreatureTemplate._basePAtkSpd:D
  #103 = NameAndType        #104:#55      // _basePAtkSpd:D
  #104 = Utf8               _basePAtkSpd
  #105 = String             #106          // crit
  #106 = Utf8               crit
  #107 = Double             4.0d
  #109 = Fieldref           #16.#110      // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseCritRate:D
  #110 = NameAndType        #111:#55      // _baseCritRate:D
  #111 = Utf8               _baseCritRate
  #112 = String             #113          // walkSpd
  #113 = Utf8               walkSpd
  #114 = Fieldref           #16.#115      // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseWalkSpd:D
  #115 = NameAndType        #116:#55      // _baseWalkSpd:D
  #116 = Utf8               _baseWalkSpd
  #117 = String             #118          // runSpd
  #118 = Utf8               runSpd
  #119 = Fieldref           #16.#120      // ext/mods/gameserver/model/actor/template/CreatureTemplate._baseRunSpd:D
  #120 = NameAndType        #121:#55      // _baseRunSpd:D
  #121 = Utf8               _baseRunSpd
  #122 = String             #123          // radius
  #123 = Utf8               radius
  #124 = Fieldref           #16.#125      // ext/mods/gameserver/model/actor/template/CreatureTemplate._collisionRadius:D
  #125 = NameAndType        #126:#55      // _collisionRadius:D
  #126 = Utf8               _collisionRadius
  #127 = String             #128          // height
  #128 = Utf8               height
  #129 = Fieldref           #16.#130      // ext/mods/gameserver/model/actor/template/CreatureTemplate._collisionHeight:D
  #130 = NameAndType        #131:#55      // _collisionHeight:D
  #131 = Utf8               _collisionHeight
  #132 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #133 = Utf8               Code
  #134 = Utf8               LineNumberTable
  #135 = Utf8               LocalVariableTable
  #136 = Utf8               this
  #137 = Utf8               Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #138 = Utf8               set
  #139 = Utf8               Lext/mods/commons/data/StatSet;
  #140 = Utf8               getBaseSTR
  #141 = Utf8               ()I
  #142 = Utf8               getBaseCON
  #143 = Utf8               getBaseDEX
  #144 = Utf8               getBaseINT
  #145 = Utf8               getBaseWIT
  #146 = Utf8               getBaseMEN
  #147 = Utf8               getBaseHpMax
  #148 = Utf8               (I)D
  #149 = Utf8               level
  #150 = Utf8               getBaseMpMax
  #151 = Utf8               getBaseHpRegen
  #152 = Utf8               getBaseMpRegen
  #153 = Utf8               getBasePAtk
  #154 = Utf8               ()D
  #155 = Utf8               getBaseMAtk
  #156 = Utf8               getBasePDef
  #157 = Utf8               getBaseMDef
  #158 = Utf8               getBasePAtkSpd
  #159 = Utf8               getBaseCritRate
  #160 = Utf8               getBaseWalkSpeed
  #161 = Utf8               getBaseRunSpeed
  #162 = Utf8               getCollisionRadius
  #163 = Utf8               getCollisionHeight
  #164 = Utf8               SourceFile
  #165 = Utf8               CreatureTemplate.java
{
  public double _baseHpMax;
    descriptor: D
    flags: (0x0001) ACC_PUBLIC

  public double _baseMpMax;
    descriptor: D
    flags: (0x0001) ACC_PUBLIC

  public double _basePAtk;
    descriptor: D
    flags: (0x0001) ACC_PUBLIC

  public double _baseMAtk;
    descriptor: D
    flags: (0x0001) ACC_PUBLIC

  public double _basePDef;
    descriptor: D
    flags: (0x0001) ACC_PUBLIC

  public double _baseMDef;
    descriptor: D
    flags: (0x0001) ACC_PUBLIC

  protected final double _collisionRadius;
    descriptor: D
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final double _collisionHeight;
    descriptor: D
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  public ext.mods.gameserver.model.actor.template.CreatureTemplate(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String str
         8: bipush        40
        10: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        13: putfield      #15                 // Field _baseSTR:I
        16: aload_0
        17: aload_1
        18: ldc           #21                 // String con
        20: bipush        21
        22: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        25: putfield      #23                 // Field _baseCON:I
        28: aload_0
        29: aload_1
        30: ldc           #26                 // String dex
        32: bipush        30
        34: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        37: putfield      #28                 // Field _baseDEX:I
        40: aload_0
        41: aload_1
        42: ldc           #31                 // String int
        44: bipush        20
        46: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        49: putfield      #33                 // Field _baseINT:I
        52: aload_0
        53: aload_1
        54: ldc           #36                 // String wit
        56: bipush        43
        58: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        61: putfield      #38                 // Field _baseWIT:I
        64: aload_0
        65: aload_1
        66: ldc           #41                 // String men
        68: bipush        20
        70: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        73: putfield      #43                 // Field _baseMEN:I
        76: aload_0
        77: aload_1
        78: ldc           #46                 // String hp
        80: dconst_0
        81: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
        84: putfield      #52                 // Field _baseHpMax:D
        87: aload_0
        88: aload_1
        89: ldc           #56                 // String mp
        91: dconst_0
        92: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
        95: putfield      #58                 // Field _baseMpMax:D
        98: aload_0
        99: aload_1
       100: ldc           #61                 // String hpRegen
       102: ldc2_w        #63                 // double 1.5d
       105: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       108: putfield      #65                 // Field _baseHpRegen:D
       111: aload_0
       112: aload_1
       113: ldc           #68                 // String mpRegen
       115: ldc2_w        #70                 // double 0.9d
       118: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       121: putfield      #72                 // Field _baseMpRegen:D
       124: aload_0
       125: aload_1
       126: ldc           #75                 // String pAtk
       128: invokevirtual #77                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
       131: putfield      #80                 // Field _basePAtk:D
       134: aload_0
       135: aload_1
       136: ldc           #83                 // String mAtk
       138: invokevirtual #77                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
       141: putfield      #85                 // Field _baseMAtk:D
       144: aload_0
       145: aload_1
       146: ldc           #88                 // String pDef
       148: invokevirtual #77                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
       151: putfield      #90                 // Field _basePDef:D
       154: aload_0
       155: aload_1
       156: ldc           #93                 // String mDef
       158: invokevirtual #77                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
       161: putfield      #95                 // Field _baseMDef:D
       164: aload_0
       165: aload_1
       166: ldc           #98                 // String atkSpd
       168: ldc2_w        #100                // double 300.0d
       171: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       174: putfield      #102                // Field _basePAtkSpd:D
       177: aload_0
       178: aload_1
       179: ldc           #105                // String crit
       181: ldc2_w        #107                // double 4.0d
       184: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       187: putfield      #109                // Field _baseCritRate:D
       190: aload_0
       191: aload_1
       192: ldc           #112                // String walkSpd
       194: dconst_0
       195: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       198: putfield      #114                // Field _baseWalkSpd:D
       201: aload_0
       202: aload_1
       203: ldc           #117                // String runSpd
       205: dconst_1
       206: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       209: putfield      #119                // Field _baseRunSpd:D
       212: aload_0
       213: aload_1
       214: ldc           #122                // String radius
       216: invokevirtual #77                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
       219: putfield      #124                // Field _collisionRadius:D
       222: aload_0
       223: aload_1
       224: ldc           #127                // String height
       226: invokevirtual #77                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
       229: putfield      #129                // Field _collisionHeight:D
       232: return
      LineNumberTable:
        line 56: 0
        line 57: 4
        line 58: 16
        line 59: 28
        line 60: 40
        line 61: 52
        line 62: 64
        line 64: 76
        line 65: 87
        line 67: 98
        line 68: 111
        line 70: 124
        line 71: 134
        line 72: 144
        line 73: 154
        line 75: 164
        line 77: 177
        line 79: 190
        line 80: 201
        line 82: 212
        line 83: 222
        line 84: 232
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     233     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;
            0     233     1   set   Lext/mods/commons/data/StatSet;

  public final int getBaseSTR();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _baseSTR:I
         4: ireturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final int getBaseCON();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _baseCON:I
         4: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final int getBaseDEX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _baseDEX:I
         4: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final int getBaseINT();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _baseINT:I
         4: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final int getBaseWIT();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _baseWIT:I
         4: ireturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final int getBaseMEN();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _baseMEN:I
         4: ireturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public double getBaseHpMax(int);
    descriptor: (I)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #52                 // Field _baseHpMax:D
         4: dreturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;
            0       5     1 level   I

  public double getBaseMpMax(int);
    descriptor: (I)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #58                 // Field _baseMpMax:D
         4: dreturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;
            0       5     1 level   I

  public double getBaseHpRegen(int);
    descriptor: (I)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #65                 // Field _baseHpRegen:D
         4: dreturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;
            0       5     1 level   I

  public double getBaseMpRegen(int);
    descriptor: (I)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #72                 // Field _baseMpRegen:D
         4: dreturn
      LineNumberTable:
        line 133: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;
            0       5     1 level   I

  public final double getBasePAtk();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #80                 // Field _basePAtk:D
         4: dreturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final double getBaseMAtk();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #85                 // Field _baseMAtk:D
         4: dreturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final double getBasePDef();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #90                 // Field _basePDef:D
         4: dreturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final double getBaseMDef();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #95                 // Field _baseMDef:D
         4: dreturn
      LineNumberTable:
        line 153: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final double getBasePAtkSpd();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #102                // Field _basePAtkSpd:D
         4: dreturn
      LineNumberTable:
        line 158: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final double getBaseCritRate();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #109                // Field _baseCritRate:D
         4: dreturn
      LineNumberTable:
        line 163: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final double getBaseWalkSpeed();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #114                // Field _baseWalkSpd:D
         4: dreturn
      LineNumberTable:
        line 168: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final double getBaseRunSpeed();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #119                // Field _baseRunSpd:D
         4: dreturn
      LineNumberTable:
        line 173: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final double getCollisionRadius();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #124                // Field _collisionRadius:D
         4: dreturn
      LineNumberTable:
        line 178: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final double getCollisionHeight();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #129                // Field _collisionHeight:D
         4: dreturn
      LineNumberTable:
        line 183: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/CreatureTemplate;
}
SourceFile: "CreatureTemplate.java"
