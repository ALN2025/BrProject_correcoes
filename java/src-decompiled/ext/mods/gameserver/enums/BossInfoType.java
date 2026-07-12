// Bytecode for: ext.mods.gameserver.enums.BossInfoType
// File: ext\mods\gameserver\enums\BossInfoType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/BossInfoType.class
  Last modified 9 de jul de 2026; size 3369 bytes
  MD5 checksum 2976f21b71dd3339c8b560a00919eeaf
  Compiled from "BossInfoType.java"
public final class ext.mods.gameserver.enums.BossInfoType extends java.lang.Enum<ext.mods.gameserver.enums.BossInfoType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/BossInfoType
  super_class: #38                        // java/lang/Enum
  interfaces: 0, fields: 14, methods: 11, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/BossInfoType
    #2 = Utf8               ext/mods/gameserver/enums/BossInfoType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/BossInfoType.AQ:Lext/mods/gameserver/enums/BossInfoType;
    #4 = NameAndType        #5:#6         // AQ:Lext/mods/gameserver/enums/BossInfoType;
    #5 = Utf8               AQ
    #6 = Utf8               Lext/mods/gameserver/enums/BossInfoType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/BossInfoType.CORE:Lext/mods/gameserver/enums/BossInfoType;
    #8 = NameAndType        #9:#6         // CORE:Lext/mods/gameserver/enums/BossInfoType;
    #9 = Utf8               CORE
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/BossInfoType.ORFEN:Lext/mods/gameserver/enums/BossInfoType;
   #11 = NameAndType        #12:#6        // ORFEN:Lext/mods/gameserver/enums/BossInfoType;
   #12 = Utf8               ORFEN
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/BossInfoType.ZAKEN:Lext/mods/gameserver/enums/BossInfoType;
   #14 = NameAndType        #15:#6        // ZAKEN:Lext/mods/gameserver/enums/BossInfoType;
   #15 = Utf8               ZAKEN
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/BossInfoType.REGULAR:Lext/mods/gameserver/enums/BossInfoType;
   #17 = NameAndType        #18:#6        // REGULAR:Lext/mods/gameserver/enums/BossInfoType;
   #18 = Utf8               REGULAR
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/BossInfoType.BAIUM:Lext/mods/gameserver/enums/BossInfoType;
   #20 = NameAndType        #21:#6        // BAIUM:Lext/mods/gameserver/enums/BossInfoType;
   #21 = Utf8               BAIUM
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/BossInfoType.ANTHARAS:Lext/mods/gameserver/enums/BossInfoType;
   #23 = NameAndType        #24:#6        // ANTHARAS:Lext/mods/gameserver/enums/BossInfoType;
   #24 = Utf8               ANTHARAS
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/BossInfoType.VALAKAS:Lext/mods/gameserver/enums/BossInfoType;
   #26 = NameAndType        #27:#6        // VALAKAS:Lext/mods/gameserver/enums/BossInfoType;
   #27 = Utf8               VALAKAS
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/BossInfoType.$VALUES:[Lext/mods/gameserver/enums/BossInfoType;
   #29 = NameAndType        #30:#31       // $VALUES:[Lext/mods/gameserver/enums/BossInfoType;
   #30 = Utf8               $VALUES
   #31 = Utf8               [Lext/mods/gameserver/enums/BossInfoType;
   #32 = Methodref          #33.#34       // "[Lext/mods/gameserver/enums/BossInfoType;".clone:()Ljava/lang/Object;
   #33 = Class              #31           // "[Lext/mods/gameserver/enums/BossInfoType;"
   #34 = NameAndType        #35:#36       // clone:()Ljava/lang/Object;
   #35 = Utf8               clone
   #36 = Utf8               ()Ljava/lang/Object;
   #37 = Methodref          #38.#39       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #38 = Class              #40           // java/lang/Enum
   #39 = NameAndType        #41:#42       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #40 = Utf8               java/lang/Enum
   #41 = Utf8               valueOf
   #42 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #43 = Methodref          #38.#44       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #44 = NameAndType        #45:#46       // "<init>":(Ljava/lang/String;I)V
   #45 = Utf8               <init>
   #46 = Utf8               (Ljava/lang/String;I)V
   #47 = Fieldref           #1.#48        // ext/mods/gameserver/enums/BossInfoType._npcId:I
   #48 = NameAndType        #49:#50       // _npcId:I
   #49 = Utf8               _npcId
   #50 = Utf8               I
   #51 = Fieldref           #1.#52        // ext/mods/gameserver/enums/BossInfoType._ccRightsMsg:Lext/mods/gameserver/network/NpcStringId;
   #52 = NameAndType        #53:#54       // _ccRightsMsg:Lext/mods/gameserver/network/NpcStringId;
   #53 = Utf8               _ccRightsMsg
   #54 = Utf8               Lext/mods/gameserver/network/NpcStringId;
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/BossInfoType._ccNoRightsMsg:Lext/mods/gameserver/network/NpcStringId;
   #56 = NameAndType        #57:#54       // _ccNoRightsMsg:Lext/mods/gameserver/network/NpcStringId;
   #57 = Utf8               _ccNoRightsMsg
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/BossInfoType._requiredMembersAmount:I
   #59 = NameAndType        #60:#50       // _requiredMembersAmount:I
   #60 = Utf8               _requiredMembersAmount
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/BossInfoType.VALUES:[Lext/mods/gameserver/enums/BossInfoType;
   #62 = NameAndType        #63:#31       // VALUES:[Lext/mods/gameserver/enums/BossInfoType;
   #63 = Utf8               VALUES
   #64 = Methodref          #1.#65        // ext/mods/gameserver/enums/BossInfoType.getNpcId:()I
   #65 = NameAndType        #66:#67       // getNpcId:()I
   #66 = Utf8               getNpcId
   #67 = Utf8               ()I
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/group/CommandChannel.getMembersCount:()I
   #69 = Class              #71           // ext/mods/gameserver/model/group/CommandChannel
   #70 = NameAndType        #72:#67       // getMembersCount:()I
   #71 = Utf8               ext/mods/gameserver/model/group/CommandChannel
   #72 = Utf8               getMembersCount
   #73 = Methodref          #1.#74        // ext/mods/gameserver/enums/BossInfoType.getBossInfo:(I)Lext/mods/gameserver/enums/BossInfoType;
   #74 = NameAndType        #75:#76       // getBossInfo:(I)Lext/mods/gameserver/enums/BossInfoType;
   #75 = Utf8               getBossInfo
   #76 = Utf8               (I)Lext/mods/gameserver/enums/BossInfoType;
   #77 = Methodref          #1.#78        // ext/mods/gameserver/enums/BossInfoType.getRequiredMembersAmount:()I
   #78 = NameAndType        #79:#67       // getRequiredMembersAmount:()I
   #79 = Utf8               getRequiredMembersAmount
   #80 = String             #5            // AQ
   #81 = Fieldref           #82.#83       // ext/mods/gameserver/network/NpcStringId.ID_1800001:Lext/mods/gameserver/network/NpcStringId;
   #82 = Class              #84           // ext/mods/gameserver/network/NpcStringId
   #83 = NameAndType        #85:#54       // ID_1800001:Lext/mods/gameserver/network/NpcStringId;
   #84 = Utf8               ext/mods/gameserver/network/NpcStringId
   #85 = Utf8               ID_1800001
   #86 = Fieldref           #82.#87       // ext/mods/gameserver/network/NpcStringId.ID_1800005:Lext/mods/gameserver/network/NpcStringId;
   #87 = NameAndType        #88:#54       // ID_1800005:Lext/mods/gameserver/network/NpcStringId;
   #88 = Utf8               ID_1800005
   #89 = Methodref          #1.#90        // ext/mods/gameserver/enums/BossInfoType."<init>":(Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
   #90 = NameAndType        #45:#91       // "<init>":(Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
   #91 = Utf8               (Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
   #92 = String             #9            // CORE
   #93 = Fieldref           #82.#94       // ext/mods/gameserver/network/NpcStringId.ID_1800002:Lext/mods/gameserver/network/NpcStringId;
   #94 = NameAndType        #95:#54       // ID_1800002:Lext/mods/gameserver/network/NpcStringId;
   #95 = Utf8               ID_1800002
   #96 = Fieldref           #82.#97       // ext/mods/gameserver/network/NpcStringId.ID_1800006:Lext/mods/gameserver/network/NpcStringId;
   #97 = NameAndType        #98:#54       // ID_1800006:Lext/mods/gameserver/network/NpcStringId;
   #98 = Utf8               ID_1800006
   #99 = String             #12           // ORFEN
  #100 = Fieldref           #82.#101      // ext/mods/gameserver/network/NpcStringId.ID_1800003:Lext/mods/gameserver/network/NpcStringId;
  #101 = NameAndType        #102:#54      // ID_1800003:Lext/mods/gameserver/network/NpcStringId;
  #102 = Utf8               ID_1800003
  #103 = Fieldref           #82.#104      // ext/mods/gameserver/network/NpcStringId.ID_1800007:Lext/mods/gameserver/network/NpcStringId;
  #104 = NameAndType        #105:#54      // ID_1800007:Lext/mods/gameserver/network/NpcStringId;
  #105 = Utf8               ID_1800007
  #106 = String             #15           // ZAKEN
  #107 = Fieldref           #82.#108      // ext/mods/gameserver/network/NpcStringId.ID_1800004:Lext/mods/gameserver/network/NpcStringId;
  #108 = NameAndType        #109:#54      // ID_1800004:Lext/mods/gameserver/network/NpcStringId;
  #109 = Utf8               ID_1800004
  #110 = Fieldref           #82.#111      // ext/mods/gameserver/network/NpcStringId.ID_1800008:Lext/mods/gameserver/network/NpcStringId;
  #111 = NameAndType        #112:#54      // ID_1800008:Lext/mods/gameserver/network/NpcStringId;
  #112 = Utf8               ID_1800008
  #113 = String             #18           // REGULAR
  #114 = Fieldref           #82.#115      // ext/mods/gameserver/network/NpcStringId.ID_1800009:Lext/mods/gameserver/network/NpcStringId;
  #115 = NameAndType        #116:#54      // ID_1800009:Lext/mods/gameserver/network/NpcStringId;
  #116 = Utf8               ID_1800009
  #117 = Fieldref           #82.#118      // ext/mods/gameserver/network/NpcStringId.ID_1800010:Lext/mods/gameserver/network/NpcStringId;
  #118 = NameAndType        #119:#54      // ID_1800010:Lext/mods/gameserver/network/NpcStringId;
  #119 = Utf8               ID_1800010
  #120 = String             #21           // BAIUM
  #121 = String             #24           // ANTHARAS
  #122 = String             #27           // VALAKAS
  #123 = Methodref          #1.#124       // ext/mods/gameserver/enums/BossInfoType.$values:()[Lext/mods/gameserver/enums/BossInfoType;
  #124 = NameAndType        #125:#126     // $values:()[Lext/mods/gameserver/enums/BossInfoType;
  #125 = Utf8               $values
  #126 = Utf8               ()[Lext/mods/gameserver/enums/BossInfoType;
  #127 = Methodref          #1.#128       // ext/mods/gameserver/enums/BossInfoType.values:()[Lext/mods/gameserver/enums/BossInfoType;
  #128 = NameAndType        #129:#126     // values:()[Lext/mods/gameserver/enums/BossInfoType;
  #129 = Utf8               values
  #130 = Utf8               Code
  #131 = Utf8               LineNumberTable
  #132 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/BossInfoType;
  #133 = Utf8               LocalVariableTable
  #134 = Utf8               name
  #135 = Utf8               Ljava/lang/String;
  #136 = Utf8               MethodParameters
  #137 = Utf8               this
  #138 = Utf8               npcId
  #139 = Utf8               ccRightsMsg
  #140 = Utf8               ccNoRightsMsg
  #141 = Utf8               requiredMembersAmount
  #142 = Utf8               Signature
  #143 = Utf8               (ILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
  #144 = Utf8               getCcRightsMsg
  #145 = Utf8               ()Lext/mods/gameserver/network/NpcStringId;
  #146 = Utf8               getCcNoRightsMsg
  #147 = Utf8               bit
  #148 = Utf8               StackMapTable
  #149 = Utf8               isCcMeetCondition
  #150 = Utf8               (Lext/mods/gameserver/model/group/CommandChannel;I)Z
  #151 = Utf8               cc
  #152 = Utf8               Lext/mods/gameserver/model/group/CommandChannel;
  #153 = Utf8               <clinit>
  #154 = Utf8               ()V
  #155 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/BossInfoType;>;
  #156 = Utf8               SourceFile
  #157 = Utf8               BossInfoType.java
{
  public static final ext.mods.gameserver.enums.BossInfoType AQ;
    descriptor: Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.BossInfoType CORE;
    descriptor: Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.BossInfoType ORFEN;
    descriptor: Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.BossInfoType ZAKEN;
    descriptor: Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.BossInfoType REGULAR;
    descriptor: Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.BossInfoType BAIUM;
    descriptor: Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.BossInfoType ANTHARAS;
    descriptor: Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.BossInfoType VALAKAS;
    descriptor: Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.BossInfoType[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.BossInfoType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #28                 // Field $VALUES:[Lext/mods/gameserver/enums/BossInfoType;
         3: invokevirtual #32                 // Method "[Lext/mods/gameserver/enums/BossInfoType;".clone:()Ljava/lang/Object;
         6: checkcast     #33                 // class "[Lext/mods/gameserver/enums/BossInfoType;"
         9: areturn
      LineNumberTable:
        line 26: 0

  public static ext.mods.gameserver.enums.BossInfoType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/BossInfoType
         2: aload_0
         3: invokestatic  #37                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/BossInfoType
         9: areturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public int getNpcId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _npcId:I
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/BossInfoType;

  public ext.mods.gameserver.network.NpcStringId getCcRightsMsg();
    descriptor: ()Lext/mods/gameserver/network/NpcStringId;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _ccRightsMsg:Lext/mods/gameserver/network/NpcStringId;
         4: areturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/BossInfoType;

  public ext.mods.gameserver.network.NpcStringId getCcNoRightsMsg();
    descriptor: ()Lext/mods/gameserver/network/NpcStringId;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #55                 // Field _ccNoRightsMsg:Lext/mods/gameserver/network/NpcStringId;
         4: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/BossInfoType;

  public int getRequiredMembersAmount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #58                 // Field _requiredMembersAmount:I
         4: ireturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/BossInfoType;

  public static ext.mods.gameserver.enums.BossInfoType getBossInfo(int);
    descriptor: (I)Lext/mods/gameserver/enums/BossInfoType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=5, args_size=1
         0: getstatic     #61                 // Field VALUES:[Lext/mods/gameserver/enums/BossInfoType;
         3: astore_1
         4: aload_1
         5: arraylength
         6: istore_2
         7: iconst_0
         8: istore_3
         9: iload_3
        10: iload_2
        11: if_icmpge     37
        14: aload_1
        15: iload_3
        16: aaload
        17: astore        4
        19: aload         4
        21: invokevirtual #64                 // Method getNpcId:()I
        24: iload_0
        25: if_icmpne     31
        28: aload         4
        30: areturn
        31: iinc          3, 1
        34: goto          9
        37: getstatic     #16                 // Field REGULAR:Lext/mods/gameserver/enums/BossInfoType;
        40: areturn
      LineNumberTable:
        line 74: 0
        line 75: 19
        line 76: 28
        line 74: 31
        line 78: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      12     4   bit   Lext/mods/gameserver/enums/BossInfoType;
            0      41     0 npcId   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 9
          locals = [ class "[Lext/mods/gameserver/enums/BossInfoType;", int, int ]
        frame_type = 21 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public static boolean isCcMeetCondition(ext.mods.gameserver.model.group.CommandChannel, int);
    descriptor: (Lext/mods/gameserver/model/group/CommandChannel;I)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: ifnull        22
         4: aload_0
         5: invokevirtual #68                 // Method ext/mods/gameserver/model/group/CommandChannel.getMembersCount:()I
         8: iload_1
         9: invokestatic  #73                 // Method getBossInfo:(I)Lext/mods/gameserver/enums/BossInfoType;
        12: invokevirtual #77                 // Method getRequiredMembersAmount:()I
        15: if_icmple     22
        18: iconst_1
        19: goto          23
        22: iconst_0
        23: ireturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0    cc   Lext/mods/gameserver/model/group/CommandChannel;
            0      24     1 npcId   I
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=8, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/BossInfoType
         3: dup
         4: ldc           #80                 // String AQ
         6: iconst_0
         7: sipush        29001
        10: getstatic     #81                 // Field ext/mods/gameserver/network/NpcStringId.ID_1800001:Lext/mods/gameserver/network/NpcStringId;
        13: getstatic     #86                 // Field ext/mods/gameserver/network/NpcStringId.ID_1800005:Lext/mods/gameserver/network/NpcStringId;
        16: bipush        36
        18: invokespecial #89                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
        21: putstatic     #3                  // Field AQ:Lext/mods/gameserver/enums/BossInfoType;
        24: new           #1                  // class ext/mods/gameserver/enums/BossInfoType
        27: dup
        28: ldc           #92                 // String CORE
        30: iconst_1
        31: sipush        29006
        34: getstatic     #93                 // Field ext/mods/gameserver/network/NpcStringId.ID_1800002:Lext/mods/gameserver/network/NpcStringId;
        37: getstatic     #96                 // Field ext/mods/gameserver/network/NpcStringId.ID_1800006:Lext/mods/gameserver/network/NpcStringId;
        40: bipush        36
        42: invokespecial #89                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
        45: putstatic     #7                  // Field CORE:Lext/mods/gameserver/enums/BossInfoType;
        48: new           #1                  // class ext/mods/gameserver/enums/BossInfoType
        51: dup
        52: ldc           #99                 // String ORFEN
        54: iconst_2
        55: sipush        29014
        58: getstatic     #100                // Field ext/mods/gameserver/network/NpcStringId.ID_1800003:Lext/mods/gameserver/network/NpcStringId;
        61: getstatic     #103                // Field ext/mods/gameserver/network/NpcStringId.ID_1800007:Lext/mods/gameserver/network/NpcStringId;
        64: bipush        36
        66: invokespecial #89                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
        69: putstatic     #10                 // Field ORFEN:Lext/mods/gameserver/enums/BossInfoType;
        72: new           #1                  // class ext/mods/gameserver/enums/BossInfoType
        75: dup
        76: ldc           #106                // String ZAKEN
        78: iconst_3
        79: sipush        29022
        82: getstatic     #107                // Field ext/mods/gameserver/network/NpcStringId.ID_1800004:Lext/mods/gameserver/network/NpcStringId;
        85: getstatic     #110                // Field ext/mods/gameserver/network/NpcStringId.ID_1800008:Lext/mods/gameserver/network/NpcStringId;
        88: bipush        36
        90: invokespecial #89                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
        93: putstatic     #13                 // Field ZAKEN:Lext/mods/gameserver/enums/BossInfoType;
        96: new           #1                  // class ext/mods/gameserver/enums/BossInfoType
        99: dup
       100: ldc           #113                // String REGULAR
       102: iconst_4
       103: iconst_0
       104: getstatic     #114                // Field ext/mods/gameserver/network/NpcStringId.ID_1800009:Lext/mods/gameserver/network/NpcStringId;
       107: getstatic     #117                // Field ext/mods/gameserver/network/NpcStringId.ID_1800010:Lext/mods/gameserver/network/NpcStringId;
       110: bipush        18
       112: invokespecial #89                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
       115: putstatic     #16                 // Field REGULAR:Lext/mods/gameserver/enums/BossInfoType;
       118: new           #1                  // class ext/mods/gameserver/enums/BossInfoType
       121: dup
       122: ldc           #120                // String BAIUM
       124: iconst_5
       125: sipush        29020
       128: getstatic     #114                // Field ext/mods/gameserver/network/NpcStringId.ID_1800009:Lext/mods/gameserver/network/NpcStringId;
       131: getstatic     #117                // Field ext/mods/gameserver/network/NpcStringId.ID_1800010:Lext/mods/gameserver/network/NpcStringId;
       134: bipush        36
       136: invokespecial #89                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
       139: putstatic     #19                 // Field BAIUM:Lext/mods/gameserver/enums/BossInfoType;
       142: new           #1                  // class ext/mods/gameserver/enums/BossInfoType
       145: dup
       146: ldc           #121                // String ANTHARAS
       148: bipush        6
       150: sipush        29019
       153: getstatic     #114                // Field ext/mods/gameserver/network/NpcStringId.ID_1800009:Lext/mods/gameserver/network/NpcStringId;
       156: getstatic     #117                // Field ext/mods/gameserver/network/NpcStringId.ID_1800010:Lext/mods/gameserver/network/NpcStringId;
       159: sipush        225
       162: invokespecial #89                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
       165: putstatic     #22                 // Field ANTHARAS:Lext/mods/gameserver/enums/BossInfoType;
       168: new           #1                  // class ext/mods/gameserver/enums/BossInfoType
       171: dup
       172: ldc           #122                // String VALAKAS
       174: bipush        7
       176: sipush        29028
       179: getstatic     #114                // Field ext/mods/gameserver/network/NpcStringId.ID_1800009:Lext/mods/gameserver/network/NpcStringId;
       182: getstatic     #117                // Field ext/mods/gameserver/network/NpcStringId.ID_1800010:Lext/mods/gameserver/network/NpcStringId;
       185: bipush        36
       187: invokespecial #89                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/network/NpcStringId;Lext/mods/gameserver/network/NpcStringId;I)V
       190: putstatic     #25                 // Field VALAKAS:Lext/mods/gameserver/enums/BossInfoType;
       193: invokestatic  #123                // Method $values:()[Lext/mods/gameserver/enums/BossInfoType;
       196: putstatic     #28                 // Field $VALUES:[Lext/mods/gameserver/enums/BossInfoType;
       199: invokestatic  #127                // Method values:()[Lext/mods/gameserver/enums/BossInfoType;
       202: putstatic     #61                 // Field VALUES:[Lext/mods/gameserver/enums/BossInfoType;
       205: return
      LineNumberTable:
        line 28: 0
        line 29: 24
        line 30: 48
        line 31: 72
        line 32: 96
        line 33: 118
        line 34: 142
        line 35: 168
        line 26: 193
        line 37: 199
}
Signature: #155                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/BossInfoType;>;
SourceFile: "BossInfoType.java"
