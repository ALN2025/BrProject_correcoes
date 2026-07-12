// Bytecode for: ext.mods.commons.cached.CachedData
// File: ext\mods\commons\cached\CachedData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/cached/CachedData.class
  Last modified 9 de jul de 2026; size 6527 bytes
  MD5 checksum 4a67a0d74832372dfcca0afc13290729
  Compiled from "CachedData.java"
public class ext.mods.commons.cached.CachedData
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/commons/cached/CachedData
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 20, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/commons/cached/CachedData.cachedDataValueList:Ljava/util/List;
   #11 = Class              #13           // ext/mods/commons/cached/CachedData
   #12 = NameAndType        #14:#15       // cachedDataValueList:Ljava/util/List;
   #13 = Utf8               ext/mods/commons/cached/CachedData
   #14 = Utf8               cachedDataValueList
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/commons/cached/CachedData.charId:I
   #17 = NameAndType        #18:#19       // charId:I
   #18 = Utf8               charId
   #19 = Utf8               I
   #20 = InterfaceMethodref #21.#22       // java/util/List.iterator:()Ljava/util/Iterator;
   #21 = Class              #23           // java/util/List
   #22 = NameAndType        #24:#25       // iterator:()Ljava/util/Iterator;
   #23 = Utf8               java/util/List
   #24 = Utf8               iterator
   #25 = Utf8               ()Ljava/util/Iterator;
   #26 = InterfaceMethodref #27.#28       // java/util/Iterator.hasNext:()Z
   #27 = Class              #29           // java/util/Iterator
   #28 = NameAndType        #30:#31       // hasNext:()Z
   #29 = Utf8               java/util/Iterator
   #30 = Utf8               hasNext
   #31 = Utf8               ()Z
   #32 = InterfaceMethodref #27.#33       // java/util/Iterator.next:()Ljava/lang/Object;
   #33 = NameAndType        #34:#35       // next:()Ljava/lang/Object;
   #34 = Utf8               next
   #35 = Utf8               ()Ljava/lang/Object;
   #36 = Class              #37           // ext/mods/commons/cached/CachedDataValue
   #37 = Utf8               ext/mods/commons/cached/CachedDataValue
   #38 = Methodref          #36.#39       // ext/mods/commons/cached/CachedDataValue.load:()V
   #39 = NameAndType        #40:#6        // load:()V
   #40 = Utf8               load
   #41 = Methodref          #36.#42       // ext/mods/commons/cached/CachedDataValue.update:()V
   #42 = NameAndType        #43:#6        // update:()V
   #43 = Utf8               update
   #44 = Methodref          #11.#45       // ext/mods/commons/cached/CachedData.newBoolean:(Ljava/lang/String;Z)Lext/mods/commons/cached/CachedDataValueBoolean;
   #45 = NameAndType        #46:#47       // newBoolean:(Ljava/lang/String;Z)Lext/mods/commons/cached/CachedDataValueBoolean;
   #46 = Utf8               newBoolean
   #47 = Utf8               (Ljava/lang/String;Z)Lext/mods/commons/cached/CachedDataValueBoolean;
   #48 = Class              #49           // ext/mods/commons/cached/CachedDataValueBoolean
   #49 = Utf8               ext/mods/commons/cached/CachedDataValueBoolean
   #50 = Methodref          #48.#51       // ext/mods/commons/cached/CachedDataValueBoolean."<init>":(Ljava/lang/String;ZI)V
   #51 = NameAndType        #5:#52        // "<init>":(Ljava/lang/String;ZI)V
   #52 = Utf8               (Ljava/lang/String;ZI)V
   #53 = InterfaceMethodref #21.#54       // java/util/List.add:(Ljava/lang/Object;)Z
   #54 = NameAndType        #55:#56       // add:(Ljava/lang/Object;)Z
   #55 = Utf8               add
   #56 = Utf8               (Ljava/lang/Object;)Z
   #57 = Methodref          #11.#58       // ext/mods/commons/cached/CachedData.newByte:(Ljava/lang/String;B)Lext/mods/commons/cached/CachedDataValueByte;
   #58 = NameAndType        #59:#60       // newByte:(Ljava/lang/String;B)Lext/mods/commons/cached/CachedDataValueByte;
   #59 = Utf8               newByte
   #60 = Utf8               (Ljava/lang/String;B)Lext/mods/commons/cached/CachedDataValueByte;
   #61 = Class              #62           // ext/mods/commons/cached/CachedDataValueByte
   #62 = Utf8               ext/mods/commons/cached/CachedDataValueByte
   #63 = Methodref          #61.#64       // ext/mods/commons/cached/CachedDataValueByte."<init>":(Ljava/lang/String;BI)V
   #64 = NameAndType        #5:#65        // "<init>":(Ljava/lang/String;BI)V
   #65 = Utf8               (Ljava/lang/String;BI)V
   #66 = Methodref          #11.#67       // ext/mods/commons/cached/CachedData.newShort:(Ljava/lang/String;S)Lext/mods/commons/cached/CachedDataValueShort;
   #67 = NameAndType        #68:#69       // newShort:(Ljava/lang/String;S)Lext/mods/commons/cached/CachedDataValueShort;
   #68 = Utf8               newShort
   #69 = Utf8               (Ljava/lang/String;S)Lext/mods/commons/cached/CachedDataValueShort;
   #70 = Class              #71           // ext/mods/commons/cached/CachedDataValueShort
   #71 = Utf8               ext/mods/commons/cached/CachedDataValueShort
   #72 = Methodref          #70.#73       // ext/mods/commons/cached/CachedDataValueShort."<init>":(Ljava/lang/String;SI)V
   #73 = NameAndType        #5:#74        // "<init>":(Ljava/lang/String;SI)V
   #74 = Utf8               (Ljava/lang/String;SI)V
   #75 = Methodref          #11.#76       // ext/mods/commons/cached/CachedData.newInt:(Ljava/lang/String;I)Lext/mods/commons/cached/CachedDataValueInt;
   #76 = NameAndType        #77:#78       // newInt:(Ljava/lang/String;I)Lext/mods/commons/cached/CachedDataValueInt;
   #77 = Utf8               newInt
   #78 = Utf8               (Ljava/lang/String;I)Lext/mods/commons/cached/CachedDataValueInt;
   #79 = Class              #80           // ext/mods/commons/cached/CachedDataValueInt
   #80 = Utf8               ext/mods/commons/cached/CachedDataValueInt
   #81 = Methodref          #79.#82       // ext/mods/commons/cached/CachedDataValueInt."<init>":(Ljava/lang/String;II)V
   #82 = NameAndType        #5:#83        // "<init>":(Ljava/lang/String;II)V
   #83 = Utf8               (Ljava/lang/String;II)V
   #84 = Methodref          #11.#85       // ext/mods/commons/cached/CachedData.newLong:(Ljava/lang/String;J)Lext/mods/commons/cached/CachedDataValueLong;
   #85 = NameAndType        #86:#87       // newLong:(Ljava/lang/String;J)Lext/mods/commons/cached/CachedDataValueLong;
   #86 = Utf8               newLong
   #87 = Utf8               (Ljava/lang/String;J)Lext/mods/commons/cached/CachedDataValueLong;
   #88 = Class              #89           // ext/mods/commons/cached/CachedDataValueLong
   #89 = Utf8               ext/mods/commons/cached/CachedDataValueLong
   #90 = Methodref          #88.#91       // ext/mods/commons/cached/CachedDataValueLong."<init>":(Ljava/lang/String;JI)V
   #91 = NameAndType        #5:#92        // "<init>":(Ljava/lang/String;JI)V
   #92 = Utf8               (Ljava/lang/String;JI)V
   #93 = Methodref          #11.#94       // ext/mods/commons/cached/CachedData.newFloat:(Ljava/lang/String;F)Lext/mods/commons/cached/CachedDataValueFloat;
   #94 = NameAndType        #95:#96       // newFloat:(Ljava/lang/String;F)Lext/mods/commons/cached/CachedDataValueFloat;
   #95 = Utf8               newFloat
   #96 = Utf8               (Ljava/lang/String;F)Lext/mods/commons/cached/CachedDataValueFloat;
   #97 = Class              #98           // ext/mods/commons/cached/CachedDataValueFloat
   #98 = Utf8               ext/mods/commons/cached/CachedDataValueFloat
   #99 = Methodref          #97.#100      // ext/mods/commons/cached/CachedDataValueFloat."<init>":(Ljava/lang/String;FI)V
  #100 = NameAndType        #5:#101       // "<init>":(Ljava/lang/String;FI)V
  #101 = Utf8               (Ljava/lang/String;FI)V
  #102 = Methodref          #11.#103      // ext/mods/commons/cached/CachedData.newDouble:(Ljava/lang/String;D)Lext/mods/commons/cached/CachedDataValueDouble;
  #103 = NameAndType        #104:#105     // newDouble:(Ljava/lang/String;D)Lext/mods/commons/cached/CachedDataValueDouble;
  #104 = Utf8               newDouble
  #105 = Utf8               (Ljava/lang/String;D)Lext/mods/commons/cached/CachedDataValueDouble;
  #106 = Class              #107          // ext/mods/commons/cached/CachedDataValueDouble
  #107 = Utf8               ext/mods/commons/cached/CachedDataValueDouble
  #108 = Methodref          #106.#109     // ext/mods/commons/cached/CachedDataValueDouble."<init>":(Ljava/lang/String;DI)V
  #109 = NameAndType        #5:#110       // "<init>":(Ljava/lang/String;DI)V
  #110 = Utf8               (Ljava/lang/String;DI)V
  #111 = String             #112          //
  #112 = Utf8
  #113 = Methodref          #11.#114      // ext/mods/commons/cached/CachedData.newString:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueString;
  #114 = NameAndType        #115:#116     // newString:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueString;
  #115 = Utf8               newString
  #116 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueString;
  #117 = Class              #118          // ext/mods/commons/cached/CachedDataValueString
  #118 = Utf8               ext/mods/commons/cached/CachedDataValueString
  #119 = Methodref          #117.#120     // ext/mods/commons/cached/CachedDataValueString."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
  #120 = NameAndType        #5:#121       // "<init>":(Ljava/lang/String;Ljava/lang/String;I)V
  #121 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)V
  #122 = Class              #123          // ext/mods/commons/cached/CachedDataValueObject
  #123 = Utf8               ext/mods/commons/cached/CachedDataValueObject
  #124 = Methodref          #122.#125     // ext/mods/commons/cached/CachedDataValueObject."<init>":(Ljava/lang/String;Ljava/lang/String;ILext/mods/commons/cached/CachedDataValueObject$Converter;)V
  #125 = NameAndType        #5:#126       // "<init>":(Ljava/lang/String;Ljava/lang/String;ILext/mods/commons/cached/CachedDataValueObject$Converter;)V
  #126 = Utf8               (Ljava/lang/String;Ljava/lang/String;ILext/mods/commons/cached/CachedDataValueObject$Converter;)V
  #127 = Utf8               Signature
  #128 = Utf8               Ljava/util/List<Lext/mods/commons/cached/CachedDataValue;>;
  #129 = Utf8               BOOLEAN_DEFAULT
  #130 = Utf8               Z
  #131 = Utf8               ConstantValue
  #132 = Integer            1
  #133 = Utf8               BYTE_DEFAULT
  #134 = Utf8               B
  #135 = Integer            0
  #136 = Utf8               SHORT_DEFAULT
  #137 = Utf8               S
  #138 = Utf8               INT_DEFAULT
  #139 = Utf8               LONG_DEFAULT
  #140 = Utf8               J
  #141 = Long               0l
  #143 = Utf8               FLOAT_DEFAULT
  #144 = Utf8               F
  #145 = Float              0.0f
  #146 = Utf8               DOUBLE_DEFAULT
  #147 = Utf8               D
  #148 = Double             0.0d
  #150 = Utf8               STRING_DEFAULT
  #151 = Utf8               Ljava/lang/String;
  #152 = Utf8               (I)V
  #153 = Utf8               Code
  #154 = Utf8               LineNumberTable
  #155 = Utf8               LocalVariableTable
  #156 = Utf8               this
  #157 = Utf8               Lext/mods/commons/cached/CachedData;
  #158 = Utf8               value
  #159 = Utf8               Lext/mods/commons/cached/CachedDataValue;
  #160 = Utf8               StackMapTable
  #161 = Utf8               store
  #162 = Utf8               (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueBoolean;
  #163 = Utf8               name
  #164 = Utf8               defaultValue
  #165 = Utf8               Lext/mods/commons/cached/CachedDataValueBoolean;
  #166 = Utf8               (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueByte;
  #167 = Utf8               Lext/mods/commons/cached/CachedDataValueByte;
  #168 = Utf8               (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueShort;
  #169 = Utf8               Lext/mods/commons/cached/CachedDataValueShort;
  #170 = Utf8               (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueInt;
  #171 = Utf8               Lext/mods/commons/cached/CachedDataValueInt;
  #172 = Utf8               (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueLong;
  #173 = Utf8               Lext/mods/commons/cached/CachedDataValueLong;
  #174 = Utf8               (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueFloat;
  #175 = Utf8               Lext/mods/commons/cached/CachedDataValueFloat;
  #176 = Utf8               (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueDouble;
  #177 = Utf8               Lext/mods/commons/cached/CachedDataValueDouble;
  #178 = Utf8               (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueString;
  #179 = Utf8               Lext/mods/commons/cached/CachedDataValueString;
  #180 = Utf8               newObject
  #181 = Utf8               (Ljava/lang/String;Ljava/lang/String;Lext/mods/commons/cached/CachedDataValueObject$Converter;)Lext/mods/commons/cached/CachedDataValueObject;
  #182 = Utf8               converter
  #183 = Utf8               Lext/mods/commons/cached/CachedDataValueObject$Converter;
  #184 = Utf8               Lext/mods/commons/cached/CachedDataValueObject;
  #185 = Utf8               LocalVariableTypeTable
  #186 = Utf8               Lext/mods/commons/cached/CachedDataValueObject$Converter<TT;>;
  #187 = Utf8               Lext/mods/commons/cached/CachedDataValueObject<TT;>;
  #188 = Utf8               <T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/String;Lext/mods/commons/cached/CachedDataValueObject$Converter<TT;>;)Lext/mods/commons/cached/CachedDataValueObject<TT;>;
  #189 = Utf8               SourceFile
  #190 = Utf8               CachedData.java
  #191 = Utf8               InnerClasses
  #192 = Class              #193          // ext/mods/commons/cached/CachedDataValueObject$Converter
  #193 = Utf8               ext/mods/commons/cached/CachedDataValueObject$Converter
  #194 = Utf8               Converter
{
  public static final boolean BOOLEAN_DEFAULT;
    descriptor: Z
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final byte BYTE_DEFAULT;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final short SHORT_DEFAULT;
    descriptor: S
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final int INT_DEFAULT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final long LONG_DEFAULT;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 0l

  public static final float FLOAT_DEFAULT;
    descriptor: F
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: float 0.0f

  public static final double DOUBLE_DEFAULT;
    descriptor: D
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: double 0.0d

  public static final java.lang.String STRING_DEFAULT;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String

  public ext.mods.commons.cached.CachedData(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field cachedDataValueList:Ljava/util/List;
        15: aload_0
        16: iload_1
        17: putfield      #16                 // Field charId:I
        20: return
      LineNumberTable:
        line 30: 0
        line 27: 4
        line 31: 15
        line 32: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/cached/CachedData;
            0      21     1 charId   I

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
         4: invokeinterface #20,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #26,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          36
        19: aload_1
        20: invokeinterface #32,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #36                 // class ext/mods/commons/cached/CachedDataValue
        28: astore_2
        29: aload_2
        30: invokevirtual #38                 // Method ext/mods/commons/cached/CachedDataValue.load:()V
        33: goto          10
        36: return
      LineNumberTable:
        line 36: 0
        line 37: 29
        line 38: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       4     2 value   Lext/mods/commons/cached/CachedDataValue;
            0      37     0  this   Lext/mods/commons/cached/CachedData;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25

  public void store();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
         4: invokeinterface #20,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #26,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          36
        19: aload_1
        20: invokeinterface #32,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #36                 // class ext/mods/commons/cached/CachedDataValue
        28: astore_2
        29: aload_2
        30: invokevirtual #41                 // Method ext/mods/commons/cached/CachedDataValue.update:()V
        33: goto          10
        36: return
      LineNumberTable:
        line 42: 0
        line 43: 29
        line 44: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       4     2 value   Lext/mods/commons/cached/CachedDataValue;
            0      37     0  this   Lext/mods/commons/cached/CachedData;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25

  public ext.mods.commons.cached.CachedDataValueBoolean newBoolean(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueBoolean;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_1
         3: invokevirtual #44                 // Method newBoolean:(Ljava/lang/String;Z)Lext/mods/commons/cached/CachedDataValueBoolean;
         6: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/cached/CachedData;
            0       7     1  name   Ljava/lang/String;

  public ext.mods.commons.cached.CachedDataValueBoolean newBoolean(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)Lext/mods/commons/cached/CachedDataValueBoolean;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #48                 // class ext/mods/commons/cached/CachedDataValueBoolean
         3: dup
         4: aload_1
         5: iload_2
         6: aload_0
         7: getfield      #16                 // Field charId:I
        10: invokespecial #50                 // Method ext/mods/commons/cached/CachedDataValueBoolean."<init>":(Ljava/lang/String;ZI)V
        13: astore_3
        14: aload_0
        15: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
        18: aload_3
        19: invokeinterface #53,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_3
        26: areturn
      LineNumberTable:
        line 62: 0
        line 63: 14
        line 64: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/commons/cached/CachedData;
            0      27     1  name   Ljava/lang/String;
            0      27     2 defaultValue   Z
           14      13     3 value   Lext/mods/commons/cached/CachedDataValueBoolean;

  public ext.mods.commons.cached.CachedDataValueByte newByte(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueByte;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokevirtual #57                 // Method newByte:(Ljava/lang/String;B)Lext/mods/commons/cached/CachedDataValueByte;
         6: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/cached/CachedData;
            0       7     1  name   Ljava/lang/String;

  public ext.mods.commons.cached.CachedDataValueByte newByte(java.lang.String, byte);
    descriptor: (Ljava/lang/String;B)Lext/mods/commons/cached/CachedDataValueByte;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #61                 // class ext/mods/commons/cached/CachedDataValueByte
         3: dup
         4: aload_1
         5: iload_2
         6: aload_0
         7: getfield      #16                 // Field charId:I
        10: invokespecial #63                 // Method ext/mods/commons/cached/CachedDataValueByte."<init>":(Ljava/lang/String;BI)V
        13: astore_3
        14: aload_0
        15: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
        18: aload_3
        19: invokeinterface #53,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_3
        26: areturn
      LineNumberTable:
        line 74: 0
        line 75: 14
        line 76: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/commons/cached/CachedData;
            0      27     1  name   Ljava/lang/String;
            0      27     2 defaultValue   B
           14      13     3 value   Lext/mods/commons/cached/CachedDataValueByte;

  public ext.mods.commons.cached.CachedDataValueShort newShort(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueShort;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokevirtual #66                 // Method newShort:(Ljava/lang/String;S)Lext/mods/commons/cached/CachedDataValueShort;
         6: areturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/cached/CachedData;
            0       7     1  name   Ljava/lang/String;

  public ext.mods.commons.cached.CachedDataValueShort newShort(java.lang.String, short);
    descriptor: (Ljava/lang/String;S)Lext/mods/commons/cached/CachedDataValueShort;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #70                 // class ext/mods/commons/cached/CachedDataValueShort
         3: dup
         4: aload_1
         5: iload_2
         6: aload_0
         7: getfield      #16                 // Field charId:I
        10: invokespecial #72                 // Method ext/mods/commons/cached/CachedDataValueShort."<init>":(Ljava/lang/String;SI)V
        13: astore_3
        14: aload_0
        15: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
        18: aload_3
        19: invokeinterface #53,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_3
        26: areturn
      LineNumberTable:
        line 86: 0
        line 87: 14
        line 88: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/commons/cached/CachedData;
            0      27     1  name   Ljava/lang/String;
            0      27     2 defaultValue   S
           14      13     3 value   Lext/mods/commons/cached/CachedDataValueShort;

  public ext.mods.commons.cached.CachedDataValueInt newInt(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueInt;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokevirtual #75                 // Method newInt:(Ljava/lang/String;I)Lext/mods/commons/cached/CachedDataValueInt;
         6: areturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/cached/CachedData;
            0       7     1  name   Ljava/lang/String;

  public ext.mods.commons.cached.CachedDataValueInt newInt(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Lext/mods/commons/cached/CachedDataValueInt;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #79                 // class ext/mods/commons/cached/CachedDataValueInt
         3: dup
         4: aload_1
         5: iload_2
         6: aload_0
         7: getfield      #16                 // Field charId:I
        10: invokespecial #81                 // Method ext/mods/commons/cached/CachedDataValueInt."<init>":(Ljava/lang/String;II)V
        13: astore_3
        14: aload_0
        15: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
        18: aload_3
        19: invokeinterface #53,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_3
        26: areturn
      LineNumberTable:
        line 98: 0
        line 99: 14
        line 100: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/commons/cached/CachedData;
            0      27     1  name   Ljava/lang/String;
            0      27     2 defaultValue   I
           14      13     3 value   Lext/mods/commons/cached/CachedDataValueInt;

  public ext.mods.commons.cached.CachedDataValueLong newLong(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueLong;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: lconst_0
         3: invokevirtual #84                 // Method newLong:(Ljava/lang/String;J)Lext/mods/commons/cached/CachedDataValueLong;
         6: areturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/cached/CachedData;
            0       7     1  name   Ljava/lang/String;

  public ext.mods.commons.cached.CachedDataValueLong newLong(java.lang.String, long);
    descriptor: (Ljava/lang/String;J)Lext/mods/commons/cached/CachedDataValueLong;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=3
         0: new           #88                 // class ext/mods/commons/cached/CachedDataValueLong
         3: dup
         4: aload_1
         5: lload_2
         6: aload_0
         7: getfield      #16                 // Field charId:I
        10: invokespecial #90                 // Method ext/mods/commons/cached/CachedDataValueLong."<init>":(Ljava/lang/String;JI)V
        13: astore        4
        15: aload_0
        16: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
        19: aload         4
        21: invokeinterface #53,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        26: pop
        27: aload         4
        29: areturn
      LineNumberTable:
        line 110: 0
        line 111: 15
        line 112: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/commons/cached/CachedData;
            0      30     1  name   Ljava/lang/String;
            0      30     2 defaultValue   J
           15      15     4 value   Lext/mods/commons/cached/CachedDataValueLong;

  public ext.mods.commons.cached.CachedDataValueFloat newFloat(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueFloat;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: fconst_0
         3: invokevirtual #93                 // Method newFloat:(Ljava/lang/String;F)Lext/mods/commons/cached/CachedDataValueFloat;
         6: areturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/cached/CachedData;
            0       7     1  name   Ljava/lang/String;

  public ext.mods.commons.cached.CachedDataValueFloat newFloat(java.lang.String, float);
    descriptor: (Ljava/lang/String;F)Lext/mods/commons/cached/CachedDataValueFloat;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #97                 // class ext/mods/commons/cached/CachedDataValueFloat
         3: dup
         4: aload_1
         5: fload_2
         6: aload_0
         7: getfield      #16                 // Field charId:I
        10: invokespecial #99                 // Method ext/mods/commons/cached/CachedDataValueFloat."<init>":(Ljava/lang/String;FI)V
        13: astore_3
        14: aload_0
        15: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
        18: aload_3
        19: invokeinterface #53,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_3
        26: areturn
      LineNumberTable:
        line 122: 0
        line 123: 14
        line 124: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/commons/cached/CachedData;
            0      27     1  name   Ljava/lang/String;
            0      27     2 defaultValue   F
           14      13     3 value   Lext/mods/commons/cached/CachedDataValueFloat;

  public ext.mods.commons.cached.CachedDataValueDouble newDouble(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueDouble;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dconst_0
         3: invokevirtual #102                // Method newDouble:(Ljava/lang/String;D)Lext/mods/commons/cached/CachedDataValueDouble;
         6: areturn
      LineNumberTable:
        line 129: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/cached/CachedData;
            0       7     1  name   Ljava/lang/String;

  public ext.mods.commons.cached.CachedDataValueDouble newDouble(java.lang.String, double);
    descriptor: (Ljava/lang/String;D)Lext/mods/commons/cached/CachedDataValueDouble;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=3
         0: new           #106                // class ext/mods/commons/cached/CachedDataValueDouble
         3: dup
         4: aload_1
         5: dload_2
         6: aload_0
         7: getfield      #16                 // Field charId:I
        10: invokespecial #108                // Method ext/mods/commons/cached/CachedDataValueDouble."<init>":(Ljava/lang/String;DI)V
        13: astore        4
        15: aload_0
        16: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
        19: aload         4
        21: invokeinterface #53,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        26: pop
        27: aload         4
        29: areturn
      LineNumberTable:
        line 134: 0
        line 135: 15
        line 136: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/commons/cached/CachedData;
            0      30     1  name   Ljava/lang/String;
            0      30     2 defaultValue   D
           15      15     4 value   Lext/mods/commons/cached/CachedDataValueDouble;

  public ext.mods.commons.cached.CachedDataValueString newString(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueString;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #111                // String
         4: invokevirtual #113                // Method newString:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueString;
         7: areturn
      LineNumberTable:
        line 141: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/cached/CachedData;
            0       8     1  name   Ljava/lang/String;

  public ext.mods.commons.cached.CachedDataValueString newString(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)Lext/mods/commons/cached/CachedDataValueString;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #117                // class ext/mods/commons/cached/CachedDataValueString
         3: dup
         4: aload_1
         5: aload_2
         6: aload_0
         7: getfield      #16                 // Field charId:I
        10: invokespecial #119                // Method ext/mods/commons/cached/CachedDataValueString."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
        13: astore_3
        14: aload_0
        15: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
        18: aload_3
        19: invokeinterface #53,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_3
        26: areturn
      LineNumberTable:
        line 146: 0
        line 147: 14
        line 148: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/commons/cached/CachedData;
            0      27     1  name   Ljava/lang/String;
            0      27     2 defaultValue   Ljava/lang/String;
           14      13     3 value   Lext/mods/commons/cached/CachedDataValueString;

  public <T extends java.lang.Object> ext.mods.commons.cached.CachedDataValueObject<T> newObject(java.lang.String, java.lang.String, ext.mods.commons.cached.CachedDataValueObject$Converter<T>);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Lext/mods/commons/cached/CachedDataValueObject$Converter;)Lext/mods/commons/cached/CachedDataValueObject;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=4
         0: new           #122                // class ext/mods/commons/cached/CachedDataValueObject
         3: dup
         4: aload_1
         5: aload_2
         6: aload_0
         7: getfield      #16                 // Field charId:I
        10: aload_3
        11: invokespecial #124                // Method ext/mods/commons/cached/CachedDataValueObject."<init>":(Ljava/lang/String;Ljava/lang/String;ILext/mods/commons/cached/CachedDataValueObject$Converter;)V
        14: astore        4
        16: aload_0
        17: getfield      #10                 // Field cachedDataValueList:Ljava/util/List;
        20: aload         4
        22: invokeinterface #53,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        27: pop
        28: aload         4
        30: areturn
      LineNumberTable:
        line 153: 0
        line 154: 16
        line 155: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/commons/cached/CachedData;
            0      31     1  name   Ljava/lang/String;
            0      31     2 defaultValue   Ljava/lang/String;
            0      31     3 converter   Lext/mods/commons/cached/CachedDataValueObject$Converter;
           16      15     4 value   Lext/mods/commons/cached/CachedDataValueObject;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      31     3 converter   Lext/mods/commons/cached/CachedDataValueObject$Converter<TT;>;
           16      15     4 value   Lext/mods/commons/cached/CachedDataValueObject<TT;>;
    Signature: #188                         // <T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/String;Lext/mods/commons/cached/CachedDataValueObject$Converter<TT;>;)Lext/mods/commons/cached/CachedDataValueObject<TT;>;
}
SourceFile: "CachedData.java"
InnerClasses:
  public static #194= #192 of #122;       // Converter=class ext/mods/commons/cached/CachedDataValueObject$Converter of class ext/mods/commons/cached/CachedDataValueObject
