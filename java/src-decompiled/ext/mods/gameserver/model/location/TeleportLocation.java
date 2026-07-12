// Bytecode for: ext.mods.gameserver.model.location.TeleportLocation
// File: ext\mods\gameserver\model\location\TeleportLocation.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/location/TeleportLocation.class
  Last modified 9 de jul de 2026; size 4079 bytes
  MD5 checksum 62a529c4f6f3ec11635044c23a760774
  Compiled from "TeleportLocation.java"
public class ext.mods.gameserver.model.location.TeleportLocation extends ext.mods.gameserver.model.location.Location
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #26                         // ext/mods/gameserver/model/location/TeleportLocation
  super_class: #14                        // ext/mods/gameserver/model/location/Location
  interfaces: 0, fields: 6, methods: 10, attributes: 3
Constant pool:
    #1 = String             #2            // x
    #2 = Utf8               x
    #3 = Methodref          #4.#5         // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
    #4 = Class              #6            // ext/mods/commons/data/StatSet
    #5 = NameAndType        #7:#8         // getInteger:(Ljava/lang/String;)I
    #6 = Utf8               ext/mods/commons/data/StatSet
    #7 = Utf8               getInteger
    #8 = Utf8               (Ljava/lang/String;)I
    #9 = String             #10           // y
   #10 = Utf8               y
   #11 = String             #12           // z
   #12 = Utf8               z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #14 = Class              #16           // ext/mods/gameserver/model/location/Location
   #15 = NameAndType        #17:#18       // "<init>":(III)V
   #16 = Utf8               ext/mods/gameserver/model/location/Location
   #17 = Utf8               <init>
   #18 = Utf8               (III)V
   #19 = String             #20           // descEn
   #20 = Utf8               descEn
   #21 = Methodref          #4.#22        // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #22 = NameAndType        #23:#24       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #23 = Utf8               getString
   #24 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #25 = Fieldref           #26.#27       // ext/mods/gameserver/model/location/TeleportLocation._descEn:Ljava/lang/String;
   #26 = Class              #28           // ext/mods/gameserver/model/location/TeleportLocation
   #27 = NameAndType        #29:#30       // _descEn:Ljava/lang/String;
   #28 = Utf8               ext/mods/gameserver/model/location/TeleportLocation
   #29 = Utf8               _descEn
   #30 = Utf8               Ljava/lang/String;
   #31 = String             #32           // descRu
   #32 = Utf8               descRu
   #33 = Fieldref           #26.#34       // ext/mods/gameserver/model/location/TeleportLocation._descRu:Ljava/lang/String;
   #34 = NameAndType        #35:#30       // _descRu:Ljava/lang/String;
   #35 = Utf8               _descRu
   #36 = String             #37           // type
   #37 = Utf8               type
   #38 = Class              #39           // ext/mods/gameserver/enums/TeleportType
   #39 = Utf8               ext/mods/gameserver/enums/TeleportType
   #40 = Fieldref           #38.#41       // ext/mods/gameserver/enums/TeleportType.STANDARD:Lext/mods/gameserver/enums/TeleportType;
   #41 = NameAndType        #42:#43       // STANDARD:Lext/mods/gameserver/enums/TeleportType;
   #42 = Utf8               STANDARD
   #43 = Utf8               Lext/mods/gameserver/enums/TeleportType;
   #44 = Methodref          #4.#45        // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #45 = NameAndType        #46:#47       // getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #46 = Utf8               getEnum
   #47 = Utf8               (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #48 = Fieldref           #26.#49       // ext/mods/gameserver/model/location/TeleportLocation._type:Lext/mods/gameserver/enums/TeleportType;
   #49 = NameAndType        #50:#43       // _type:Lext/mods/gameserver/enums/TeleportType;
   #50 = Utf8               _type
   #51 = String             #52           // priceId
   #52 = Utf8               priceId
   #53 = Fieldref           #26.#54       // ext/mods/gameserver/model/location/TeleportLocation._priceId:I
   #54 = NameAndType        #55:#56       // _priceId:I
   #55 = Utf8               _priceId
   #56 = Utf8               I
   #57 = String             #58           // priceCount
   #58 = Utf8               priceCount
   #59 = Fieldref           #26.#60       // ext/mods/gameserver/model/location/TeleportLocation._priceCount:I
   #60 = NameAndType        #61:#56       // _priceCount:I
   #61 = Utf8               _priceCount
   #62 = String             #63           // castleId
   #63 = Utf8               castleId
   #64 = Methodref          #4.#65        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #65 = NameAndType        #7:#66        // getInteger:(Ljava/lang/String;I)I
   #66 = Utf8               (Ljava/lang/String;I)I
   #67 = Fieldref           #26.#68       // ext/mods/gameserver/model/location/TeleportLocation._castleId:I
   #68 = NameAndType        #69:#56       // _castleId:I
   #69 = Utf8               _castleId
   #70 = Methodref          #71.#72       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #71 = Class              #73           // java/lang/String
   #72 = NameAndType        #74:#75       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #73 = Utf8               java/lang/String
   #74 = Utf8               valueOf
   #75 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #76 = InvokeDynamic      #0:#77        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/String;
   #77 = NameAndType        #78:#79       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/String;
   #78 = Utf8               makeConcatWithConstants
   #79 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/String;
   #80 = Methodref          #81.#82       // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #81 = Class              #83           // java/util/Calendar
   #82 = NameAndType        #84:#85       // getInstance:()Ljava/util/Calendar;
   #83 = Utf8               java/util/Calendar
   #84 = Utf8               getInstance
   #85 = Utf8               ()Ljava/util/Calendar;
   #86 = Methodref          #81.#87       // java/util/Calendar.get:(I)I
   #87 = NameAndType        #88:#89       // get:(I)I
   #88 = Utf8               get
   #89 = Utf8               (I)I
   #90 = Class              #91           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #91 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #92 = Methodref          #93.#94       // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #93 = Class              #95           // ext/mods/gameserver/data/manager/SevenSignsManager
   #94 = NameAndType        #84:#96       // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #95 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #96 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #97 = Methodref          #93.#98       // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
   #98 = NameAndType        #99:#100      // isSealValidationPeriod:()Z
   #99 = Utf8               isSealValidationPeriod
  #100 = Utf8               ()Z
  #101 = Methodref          #102.#103     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #102 = Class              #104          // ext/mods/gameserver/model/actor/Player
  #103 = NameAndType        #105:#106     // getObjectId:()I
  #104 = Utf8               ext/mods/gameserver/model/actor/Player
  #105 = Utf8               getObjectId
  #106 = Utf8               ()I
  #107 = Methodref          #93.#108      // ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
  #108 = NameAndType        #109:#110     // getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
  #109 = Utf8               getPlayerCabal
  #110 = Utf8               (I)Lext/mods/gameserver/enums/CabalType;
  #111 = Fieldref           #112.#113     // ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
  #112 = Class              #114          // ext/mods/gameserver/enums/SealType
  #113 = NameAndType        #115:#116     // GNOSIS:Lext/mods/gameserver/enums/SealType;
  #114 = Utf8               ext/mods/gameserver/enums/SealType
  #115 = Utf8               GNOSIS
  #116 = Utf8               Lext/mods/gameserver/enums/SealType;
  #117 = Methodref          #93.#118      // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #118 = NameAndType        #119:#120     // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #119 = Utf8               getSealOwner
  #120 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #121 = Methodref          #93.#122      // ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerSeal:(I)Lext/mods/gameserver/enums/SealType;
  #122 = NameAndType        #123:#124     // getPlayerSeal:(I)Lext/mods/gameserver/enums/SealType;
  #123 = Utf8               getPlayerSeal
  #124 = Utf8               (I)Lext/mods/gameserver/enums/SealType;
  #125 = Double             1.6d
  #127 = Methodref          #26.#128      // ext/mods/gameserver/model/location/TeleportLocation.isCoreTime:()Z
  #128 = NameAndType        #129:#100     // isCoreTime:()Z
  #129 = Utf8               isCoreTime
  #130 = Methodref          #131.#132     // java/lang/Math.max:(II)I
  #131 = Class              #133          // java/lang/Math
  #132 = NameAndType        #134:#135     // max:(II)I
  #133 = Utf8               java/lang/Math
  #134 = Utf8               max
  #135 = Utf8               (II)I
  #136 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #137 = Utf8               Code
  #138 = Utf8               LineNumberTable
  #139 = Utf8               LocalVariableTable
  #140 = Utf8               this
  #141 = Utf8               Lext/mods/gameserver/model/location/TeleportLocation;
  #142 = Utf8               set
  #143 = Utf8               Lext/mods/commons/data/StatSet;
  #144 = Utf8               toString
  #145 = Utf8               ()Ljava/lang/String;
  #146 = Utf8               getDescEn
  #147 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #148 = Utf8               player
  #149 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #150 = Utf8               getDescRu
  #151 = Utf8               getType
  #152 = Utf8               ()Lext/mods/gameserver/enums/TeleportType;
  #153 = Utf8               getPriceId
  #154 = Utf8               getPriceCount
  #155 = Utf8               getCastleId
  #156 = Utf8               currentHour
  #157 = Utf8               now
  #158 = Utf8               Ljava/util/Calendar;
  #159 = Utf8               StackMapTable
  #160 = Utf8               getCalculatedPriceCount
  #161 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #162 = Utf8               ss
  #163 = Utf8               Lext/mods/gameserver/data/manager/SevenSignsManager;
  #164 = Utf8               check
  #165 = Utf8               Z
  #166 = Utf8               SourceFile
  #167 = Utf8               TeleportLocation.java
  #168 = Utf8               BootstrapMethods
  #169 = String             #170          // TeleportLocation [_descEn=\u0001, _descRu=\u0001, _type=\u0001, _priceId=\u0001, _priceCount=\u0001, _castleId=\u0001]
  #170 = Utf8               TeleportLocation [_descEn=\u0001, _descRu=\u0001, _type=\u0001, _priceId=\u0001, _priceCount=\u0001, _castleId=\u0001]
  #171 = MethodHandle       6:#172        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #172 = Methodref          #173.#174     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #173 = Class              #175          // java/lang/invoke/StringConcatFactory
  #174 = NameAndType        #78:#176      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #175 = Utf8               java/lang/invoke/StringConcatFactory
  #176 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #177 = Utf8               InnerClasses
  #178 = Class              #179          // java/lang/invoke/MethodHandles$Lookup
  #179 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #180 = Class              #181          // java/lang/invoke/MethodHandles
  #181 = Utf8               java/lang/invoke/MethodHandles
  #182 = Utf8               Lookup
{
  public ext.mods.gameserver.model.location.TeleportLocation(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #1                  // String x
         4: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #9                  // String y
        10: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #11                 // String z
        16: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        19: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        22: aload_0
        23: aload_1
        24: ldc           #19                 // String descEn
        26: invokevirtual #21                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        29: putfield      #25                 // Field _descEn:Ljava/lang/String;
        32: aload_0
        33: aload_1
        34: ldc           #31                 // String descRu
        36: invokevirtual #21                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        39: putfield      #33                 // Field _descRu:Ljava/lang/String;
        42: aload_0
        43: aload_1
        44: ldc           #36                 // String type
        46: ldc           #38                 // class ext/mods/gameserver/enums/TeleportType
        48: getstatic     #40                 // Field ext/mods/gameserver/enums/TeleportType.STANDARD:Lext/mods/gameserver/enums/TeleportType;
        51: invokevirtual #44                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
        54: checkcast     #38                 // class ext/mods/gameserver/enums/TeleportType
        57: putfield      #48                 // Field _type:Lext/mods/gameserver/enums/TeleportType;
        60: aload_0
        61: aload_1
        62: ldc           #51                 // String priceId
        64: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        67: putfield      #53                 // Field _priceId:I
        70: aload_0
        71: aload_1
        72: ldc           #57                 // String priceCount
        74: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        77: putfield      #59                 // Field _priceCount:I
        80: aload_0
        81: aload_1
        82: ldc           #62                 // String castleId
        84: iconst_0
        85: invokevirtual #64                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        88: putfield      #67                 // Field _castleId:I
        91: return
      LineNumberTable:
        line 44: 0
        line 46: 22
        line 47: 32
        line 48: 42
        line 49: 60
        line 50: 70
        line 51: 80
        line 52: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      92     0  this   Lext/mods/gameserver/model/location/TeleportLocation;
            0      92     1   set   Lext/mods/commons/data/StatSet;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _descEn:Ljava/lang/String;
         4: aload_0
         5: getfield      #33                 // Field _descRu:Ljava/lang/String;
         8: aload_0
         9: getfield      #48                 // Field _type:Lext/mods/gameserver/enums/TeleportType;
        12: invokestatic  #70                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        15: aload_0
        16: getfield      #53                 // Field _priceId:I
        19: aload_0
        20: getfield      #59                 // Field _priceCount:I
        23: aload_0
        24: getfield      #67                 // Field _castleId:I
        27: invokedynamic #76,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/String;
        32: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/location/TeleportLocation;

  public java.lang.String getDescEn(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field _descEn:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TeleportLocation;
            0       5     1 player   Lext/mods/gameserver/model/actor/Player;

  public java.lang.String getDescRu(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: getfield      #33                 // Field _descRu:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TeleportLocation;
            0       5     1 player   Lext/mods/gameserver/model/actor/Player;

  public ext.mods.gameserver.enums.TeleportType getType();
    descriptor: ()Lext/mods/gameserver/enums/TeleportType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _type:Lext/mods/gameserver/enums/TeleportType;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TeleportLocation;

  public int getPriceId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _priceId:I
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TeleportLocation;

  public int getPriceCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #59                 // Field _priceCount:I
         4: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TeleportLocation;

  public int getCastleId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #67                 // Field _castleId:I
         4: ireturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TeleportLocation;

  public int getCalculatedPriceCount(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: getfield      #53                 // Field _priceId:I
         4: sipush        5575
         7: if_icmpne     81
        10: invokestatic  #92                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        13: astore_2
        14: aload_2
        15: invokevirtual #97                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
        18: ifeq          57
        21: aload_2
        22: aload_1
        23: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        26: invokevirtual #107                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
        29: aload_2
        30: getstatic     #111                // Field ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
        33: invokevirtual #117                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
        36: if_acmpne     57
        39: aload_2
        40: aload_1
        41: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        44: invokevirtual #121                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerSeal:(I)Lext/mods/gameserver/enums/SealType;
        47: getstatic     #111                // Field ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
        50: if_acmpne     57
        53: iconst_1
        54: goto          58
        57: iconst_0
        58: istore_3
        59: iload_3
        60: ifeq          70
        63: aload_0
        64: getfield      #59                 // Field _priceCount:I
        67: goto          80
        70: aload_0
        71: getfield      #59                 // Field _priceCount:I
        74: i2d
        75: ldc2_w        #125                // double 1.6d
        78: dmul
        79: d2i
        80: ireturn
        81: aload_0
        82: getfield      #48                 // Field _type:Lext/mods/gameserver/enums/TeleportType;
        85: getstatic     #40                 // Field ext/mods/gameserver/enums/TeleportType.STANDARD:Lext/mods/gameserver/enums/TeleportType;
        88: if_acmpne     108
        91: invokestatic  #127                // Method isCoreTime:()Z
        94: ifeq          108
        97: aload_0
        98: getfield      #59                 // Field _priceCount:I
       101: iconst_1
       102: ishr
       103: iconst_1
       104: invokestatic  #130                // Method java/lang/Math.max:(II)I
       107: ireturn
       108: aload_0
       109: getfield      #59                 // Field _priceCount:I
       112: ireturn
      LineNumberTable:
        line 115: 0
        line 117: 10
        line 118: 14
        line 120: 59
        line 123: 81
        line 124: 97
        line 126: 108
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      67     2    ss   Lext/mods/gameserver/data/manager/SevenSignsManager;
           59      22     3 check   Z
            0     113     0  this   Lext/mods/gameserver/model/location/TeleportLocation;
            0     113     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/data/manager/SevenSignsManager ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 0
        frame_type = 26 /* same */
}
SourceFile: "TeleportLocation.java"
BootstrapMethods:
  0: #171 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #169 TeleportLocation [_descEn=\u0001, _descRu=\u0001, _type=\u0001, _priceId=\u0001, _priceCount=\u0001, _castleId=\u0001]
InnerClasses:
  public static final #182= #178 of #180; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
