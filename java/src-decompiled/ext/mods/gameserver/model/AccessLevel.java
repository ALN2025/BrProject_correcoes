// Bytecode for: ext.mods.gameserver.model.AccessLevel
// File: ext\mods\gameserver\model\AccessLevel.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/AccessLevel.class
  Last modified 9 de jul de 2026; size 3048 bytes
  MD5 checksum 5c59fa2d362cf1b1be2f00afb5217fad
  Compiled from "AccessLevel.java"
public class ext.mods.gameserver.model.AccessLevel
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/AccessLevel
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 11, methods: 11, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // level
    #8 = Utf8               level
    #9 = Methodref          #10.#11       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #10 = Class              #12           // ext/mods/commons/data/StatSet
   #11 = NameAndType        #13:#14       // getInteger:(Ljava/lang/String;)I
   #12 = Utf8               ext/mods/commons/data/StatSet
   #13 = Utf8               getInteger
   #14 = Utf8               (Ljava/lang/String;)I
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/model/AccessLevel._accessLevel:I
   #16 = Class              #18           // ext/mods/gameserver/model/AccessLevel
   #17 = NameAndType        #19:#20       // _accessLevel:I
   #18 = Utf8               ext/mods/gameserver/model/AccessLevel
   #19 = Utf8               _accessLevel
   #20 = Utf8               I
   #21 = String             #22           // name
   #22 = Utf8               name
   #23 = Methodref          #10.#24       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #24 = NameAndType        #25:#26       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #25 = Utf8               getString
   #26 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #27 = Fieldref           #16.#28       // ext/mods/gameserver/model/AccessLevel._name:Ljava/lang/String;
   #28 = NameAndType        #29:#30       // _name:Ljava/lang/String;
   #29 = Utf8               _name
   #30 = Utf8               Ljava/lang/String;
   #31 = String             #32           // nameColor
   #32 = Utf8               nameColor
   #33 = String             #34           // FFFFFF
   #34 = Utf8               FFFFFF
   #35 = Methodref          #10.#36       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #36 = NameAndType        #25:#37       // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #37 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #38 = InvokeDynamic      #0:#39        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #39 = NameAndType        #40:#26       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #40 = Utf8               makeConcatWithConstants
   #41 = Methodref          #42.#43       // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
   #42 = Class              #44           // java/lang/Integer
   #43 = NameAndType        #45:#46       // decode:(Ljava/lang/String;)Ljava/lang/Integer;
   #44 = Utf8               java/lang/Integer
   #45 = Utf8               decode
   #46 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
   #47 = Methodref          #42.#48       // java/lang/Integer.intValue:()I
   #48 = NameAndType        #49:#50       // intValue:()I
   #49 = Utf8               intValue
   #50 = Utf8               ()I
   #51 = Fieldref           #16.#52       // ext/mods/gameserver/model/AccessLevel._nameColor:I
   #52 = NameAndType        #53:#20       // _nameColor:I
   #53 = Utf8               _nameColor
   #54 = String             #55           // titleColor
   #55 = Utf8               titleColor
   #56 = String             #57           // FFFF77
   #57 = Utf8               FFFF77
   #58 = Fieldref           #16.#59       // ext/mods/gameserver/model/AccessLevel._titleColor:I
   #59 = NameAndType        #60:#20       // _titleColor:I
   #60 = Utf8               _titleColor
   #61 = String             #62           // childLevel
   #62 = Utf8               childLevel
   #63 = Methodref          #10.#64       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #64 = NameAndType        #13:#65       // getInteger:(Ljava/lang/String;I)I
   #65 = Utf8               (Ljava/lang/String;I)I
   #66 = Fieldref           #16.#67       // ext/mods/gameserver/model/AccessLevel._childLevel:I
   #67 = NameAndType        #68:#20       // _childLevel:I
   #68 = Utf8               _childLevel
   #69 = String             #70           // isGM
   #70 = Utf8               isGM
   #71 = Methodref          #10.#72       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
   #72 = NameAndType        #73:#74       // getBool:(Ljava/lang/String;Z)Z
   #73 = Utf8               getBool
   #74 = Utf8               (Ljava/lang/String;Z)Z
   #75 = Fieldref           #16.#76       // ext/mods/gameserver/model/AccessLevel._isGm:Z
   #76 = NameAndType        #77:#78       // _isGm:Z
   #77 = Utf8               _isGm
   #78 = Utf8               Z
   #79 = String             #80           // allowFixedRes
   #80 = Utf8               allowFixedRes
   #81 = Fieldref           #16.#82       // ext/mods/gameserver/model/AccessLevel._allowFixedRes:Z
   #82 = NameAndType        #83:#78       // _allowFixedRes:Z
   #83 = Utf8               _allowFixedRes
   #84 = String             #85           // allowTransaction
   #85 = Utf8               allowTransaction
   #86 = Fieldref           #16.#87       // ext/mods/gameserver/model/AccessLevel._allowTransaction:Z
   #87 = NameAndType        #88:#78       // _allowTransaction:Z
   #88 = Utf8               _allowTransaction
   #89 = String             #90           // allowAltg
   #90 = Utf8               allowAltg
   #91 = Fieldref           #16.#92       // ext/mods/gameserver/model/AccessLevel._allowAltG:Z
   #92 = NameAndType        #93:#78       // _allowAltG:Z
   #93 = Utf8               _allowAltG
   #94 = String             #95           // giveDamage
   #95 = Utf8               giveDamage
   #96 = Fieldref           #16.#97       // ext/mods/gameserver/model/AccessLevel._giveDamage:Z
   #97 = NameAndType        #98:#78       // _giveDamage:Z
   #98 = Utf8               _giveDamage
   #99 = Fieldref           #16.#100      // ext/mods/gameserver/model/AccessLevel._childAccess:Lext/mods/gameserver/model/AccessLevel;
  #100 = NameAndType        #101:#102     // _childAccess:Lext/mods/gameserver/model/AccessLevel;
  #101 = Utf8               _childAccess
  #102 = Utf8               Lext/mods/gameserver/model/AccessLevel;
  #103 = Methodref          #104.#105     // ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
  #104 = Class              #106          // ext/mods/gameserver/data/xml/AdminData
  #105 = NameAndType        #107:#108     // getInstance:()Lext/mods/gameserver/data/xml/AdminData;
  #106 = Utf8               ext/mods/gameserver/data/xml/AdminData
  #107 = Utf8               getInstance
  #108 = Utf8               ()Lext/mods/gameserver/data/xml/AdminData;
  #109 = Methodref          #104.#110     // ext/mods/gameserver/data/xml/AdminData.getAccessLevel:(I)Lext/mods/gameserver/model/AccessLevel;
  #110 = NameAndType        #111:#112     // getAccessLevel:(I)Lext/mods/gameserver/model/AccessLevel;
  #111 = Utf8               getAccessLevel
  #112 = Utf8               (I)Lext/mods/gameserver/model/AccessLevel;
  #113 = Methodref          #16.#114      // ext/mods/gameserver/model/AccessLevel.getLevel:()I
  #114 = NameAndType        #115:#50      // getLevel:()I
  #115 = Utf8               getLevel
  #116 = Methodref          #16.#117      // ext/mods/gameserver/model/AccessLevel.hasChildAccess:(Lext/mods/gameserver/model/AccessLevel;)Z
  #117 = NameAndType        #118:#119     // hasChildAccess:(Lext/mods/gameserver/model/AccessLevel;)Z
  #118 = Utf8               hasChildAccess
  #119 = Utf8               (Lext/mods/gameserver/model/AccessLevel;)Z
  #120 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #121 = Utf8               Code
  #122 = Utf8               LineNumberTable
  #123 = Utf8               LocalVariableTable
  #124 = Utf8               this
  #125 = Utf8               set
  #126 = Utf8               Lext/mods/commons/data/StatSet;
  #127 = Utf8               getName
  #128 = Utf8               ()Ljava/lang/String;
  #129 = Utf8               getNameColor
  #130 = Utf8               getTitleColor
  #131 = Utf8               isGm
  #132 = Utf8               ()Z
  #133 = Utf8               allowAltG
  #134 = Utf8               canGiveDamage
  #135 = Utf8               access
  #136 = Utf8               StackMapTable
  #137 = Utf8               SourceFile
  #138 = Utf8               AccessLevel.java
  #139 = Utf8               BootstrapMethods
  #140 = String             #141          // 0x\u0001
  #141 = Utf8               0x\u0001
  #142 = MethodHandle       6:#143        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #143 = Methodref          #144.#145     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #144 = Class              #146          // java/lang/invoke/StringConcatFactory
  #145 = NameAndType        #40:#147      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #146 = Utf8               java/lang/invoke/StringConcatFactory
  #147 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #148 = Utf8               InnerClasses
  #149 = Class              #150          // java/lang/invoke/MethodHandles$Lookup
  #150 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #151 = Class              #152          // java/lang/invoke/MethodHandles
  #152 = Utf8               java/lang/invoke/MethodHandles
  #153 = Utf8               Lookup
{
  public ext.mods.gameserver.model.AccessLevel(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String level
         8: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        11: putfield      #15                 // Field _accessLevel:I
        14: aload_0
        15: aload_1
        16: ldc           #21                 // String name
        18: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        21: putfield      #27                 // Field _name:Ljava/lang/String;
        24: aload_0
        25: aload_1
        26: ldc           #31                 // String nameColor
        28: ldc           #33                 // String FFFFFF
        30: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        33: invokedynamic #38,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        38: invokestatic  #41                 // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        41: invokevirtual #47                 // Method java/lang/Integer.intValue:()I
        44: putfield      #51                 // Field _nameColor:I
        47: aload_0
        48: aload_1
        49: ldc           #54                 // String titleColor
        51: ldc           #56                 // String FFFF77
        53: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        56: invokedynamic #38,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        61: invokestatic  #41                 // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        64: invokevirtual #47                 // Method java/lang/Integer.intValue:()I
        67: putfield      #58                 // Field _titleColor:I
        70: aload_0
        71: aload_1
        72: ldc           #61                 // String childLevel
        74: iconst_0
        75: invokevirtual #63                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        78: putfield      #66                 // Field _childLevel:I
        81: aload_0
        82: aload_1
        83: ldc           #69                 // String isGM
        85: iconst_0
        86: invokevirtual #71                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        89: putfield      #75                 // Field _isGm:Z
        92: aload_0
        93: aload_1
        94: ldc           #79                 // String allowFixedRes
        96: iconst_0
        97: invokevirtual #71                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       100: putfield      #81                 // Field _allowFixedRes:Z
       103: aload_0
       104: aload_1
       105: ldc           #84                 // String allowTransaction
       107: iconst_1
       108: invokevirtual #71                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       111: putfield      #86                 // Field _allowTransaction:Z
       114: aload_0
       115: aload_1
       116: ldc           #89                 // String allowAltg
       118: iconst_0
       119: invokevirtual #71                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       122: putfield      #91                 // Field _allowAltG:Z
       125: aload_0
       126: aload_1
       127: ldc           #94                 // String giveDamage
       129: iconst_1
       130: invokevirtual #71                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       133: putfield      #96                 // Field _giveDamage:Z
       136: return
      LineNumberTable:
        line 46: 0
        line 47: 4
        line 48: 14
        line 49: 24
        line 50: 47
        line 51: 70
        line 52: 81
        line 53: 92
        line 54: 103
        line 55: 114
        line 56: 125
        line 57: 136
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     137     0  this   Lext/mods/gameserver/model/AccessLevel;
            0     137     1   set   Lext/mods/commons/data/StatSet;

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _accessLevel:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/AccessLevel;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/AccessLevel;

  public int getNameColor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _nameColor:I
         4: ireturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/AccessLevel;

  public int getTitleColor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #58                 // Field _titleColor:I
         4: ireturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/AccessLevel;

  public boolean isGm();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #75                 // Field _isGm:Z
         4: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/AccessLevel;

  public boolean allowFixedRes();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #81                 // Field _allowFixedRes:Z
         4: ireturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/AccessLevel;

  public boolean allowTransaction();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #86                 // Field _allowTransaction:Z
         4: ireturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/AccessLevel;

  public boolean allowAltG();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #91                 // Field _allowAltG:Z
         4: ireturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/AccessLevel;

  public boolean canGiveDamage();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #96                 // Field _giveDamage:Z
         4: ireturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/AccessLevel;

  public boolean hasChildAccess(ext.mods.gameserver.model.AccessLevel);
    descriptor: (Lext/mods/gameserver/model/AccessLevel;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #99                 // Field _childAccess:Lext/mods/gameserver/model/AccessLevel;
         4: ifnonnull     28
         7: aload_0
         8: getfield      #66                 // Field _childLevel:I
        11: ifle          28
        14: aload_0
        15: invokestatic  #103                // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
        18: aload_0
        19: getfield      #66                 // Field _childLevel:I
        22: invokevirtual #109                // Method ext/mods/gameserver/data/xml/AdminData.getAccessLevel:(I)Lext/mods/gameserver/model/AccessLevel;
        25: putfield      #99                 // Field _childAccess:Lext/mods/gameserver/model/AccessLevel;
        28: aload_0
        29: getfield      #99                 // Field _childAccess:Lext/mods/gameserver/model/AccessLevel;
        32: ifnull        64
        35: aload_0
        36: getfield      #99                 // Field _childAccess:Lext/mods/gameserver/model/AccessLevel;
        39: invokevirtual #113                // Method getLevel:()I
        42: aload_1
        43: invokevirtual #113                // Method getLevel:()I
        46: if_icmpeq     60
        49: aload_0
        50: getfield      #99                 // Field _childAccess:Lext/mods/gameserver/model/AccessLevel;
        53: aload_1
        54: invokevirtual #116                // Method hasChildAccess:(Lext/mods/gameserver/model/AccessLevel;)Z
        57: ifeq          64
        60: iconst_1
        61: goto          65
        64: iconst_0
        65: ireturn
      LineNumberTable:
        line 138: 0
        line 139: 14
        line 141: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/model/AccessLevel;
            0      66     1 access   Lext/mods/gameserver/model/AccessLevel;
      StackMapTable: number_of_entries = 4
        frame_type = 28 /* same */
        frame_type = 31 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "AccessLevel.java"
BootstrapMethods:
  0: #142 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #140 0x\u0001
InnerClasses:
  public static final #153= #149 of #151; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
