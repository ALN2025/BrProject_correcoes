// Bytecode for: ext.mods.gameserver.enums.LootRule
// File: ext\mods\gameserver\enums\LootRule.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/LootRule.class
  Last modified 9 de jul de 2026; size 1965 bytes
  MD5 checksum ba673a4959d5b31fb565b252fd30bbdc
  Compiled from "LootRule.java"
public final class ext.mods.gameserver.enums.LootRule extends java.lang.Enum<ext.mods.gameserver.enums.LootRule>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/LootRule
  super_class: #29                        // java/lang/Enum
  interfaces: 0, fields: 8, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/LootRule
   #2 = Utf8               ext/mods/gameserver/enums/LootRule
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/LootRule.ITEM_LOOTER:Lext/mods/gameserver/enums/LootRule;
   #4 = NameAndType        #5:#6          // ITEM_LOOTER:Lext/mods/gameserver/enums/LootRule;
   #5 = Utf8               ITEM_LOOTER
   #6 = Utf8               Lext/mods/gameserver/enums/LootRule;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/LootRule.ITEM_RANDOM:Lext/mods/gameserver/enums/LootRule;
   #8 = NameAndType        #9:#6          // ITEM_RANDOM:Lext/mods/gameserver/enums/LootRule;
   #9 = Utf8               ITEM_RANDOM
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/LootRule.ITEM_RANDOM_SPOIL:Lext/mods/gameserver/enums/LootRule;
  #11 = NameAndType        #12:#6         // ITEM_RANDOM_SPOIL:Lext/mods/gameserver/enums/LootRule;
  #12 = Utf8               ITEM_RANDOM_SPOIL
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/LootRule.ITEM_ORDER:Lext/mods/gameserver/enums/LootRule;
  #14 = NameAndType        #15:#6         // ITEM_ORDER:Lext/mods/gameserver/enums/LootRule;
  #15 = Utf8               ITEM_ORDER
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/LootRule.ITEM_ORDER_SPOIL:Lext/mods/gameserver/enums/LootRule;
  #17 = NameAndType        #18:#6         // ITEM_ORDER_SPOIL:Lext/mods/gameserver/enums/LootRule;
  #18 = Utf8               ITEM_ORDER_SPOIL
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/LootRule.$VALUES:[Lext/mods/gameserver/enums/LootRule;
  #20 = NameAndType        #21:#22        // $VALUES:[Lext/mods/gameserver/enums/LootRule;
  #21 = Utf8               $VALUES
  #22 = Utf8               [Lext/mods/gameserver/enums/LootRule;
  #23 = Methodref          #24.#25        // "[Lext/mods/gameserver/enums/LootRule;".clone:()Ljava/lang/Object;
  #24 = Class              #22            // "[Lext/mods/gameserver/enums/LootRule;"
  #25 = NameAndType        #26:#27        // clone:()Ljava/lang/Object;
  #26 = Utf8               clone
  #27 = Utf8               ()Ljava/lang/Object;
  #28 = Methodref          #29.#30        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #29 = Class              #31            // java/lang/Enum
  #30 = NameAndType        #32:#33        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #31 = Utf8               java/lang/Enum
  #32 = Utf8               valueOf
  #33 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Methodref          #29.#35        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #35 = NameAndType        #36:#37        // "<init>":(Ljava/lang/String;I)V
  #36 = Utf8               <init>
  #37 = Utf8               (Ljava/lang/String;I)V
  #38 = Fieldref           #1.#39         // ext/mods/gameserver/enums/LootRule._smId:Lext/mods/gameserver/network/SystemMessageId;
  #39 = NameAndType        #40:#41        // _smId:Lext/mods/gameserver/network/SystemMessageId;
  #40 = Utf8               _smId
  #41 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #42 = String             #5             // ITEM_LOOTER
  #43 = Fieldref           #44.#45        // ext/mods/gameserver/network/SystemMessageId.LOOTING_FINDERS_KEEPERS:Lext/mods/gameserver/network/SystemMessageId;
  #44 = Class              #46            // ext/mods/gameserver/network/SystemMessageId
  #45 = NameAndType        #47:#41        // LOOTING_FINDERS_KEEPERS:Lext/mods/gameserver/network/SystemMessageId;
  #46 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #47 = Utf8               LOOTING_FINDERS_KEEPERS
  #48 = Methodref          #1.#49         // ext/mods/gameserver/enums/LootRule."<init>":(Ljava/lang/String;ILext/mods/gameserver/network/SystemMessageId;)V
  #49 = NameAndType        #36:#50        // "<init>":(Ljava/lang/String;ILext/mods/gameserver/network/SystemMessageId;)V
  #50 = Utf8               (Ljava/lang/String;ILext/mods/gameserver/network/SystemMessageId;)V
  #51 = String             #9             // ITEM_RANDOM
  #52 = Fieldref           #44.#53        // ext/mods/gameserver/network/SystemMessageId.LOOTING_RANDOM:Lext/mods/gameserver/network/SystemMessageId;
  #53 = NameAndType        #54:#41        // LOOTING_RANDOM:Lext/mods/gameserver/network/SystemMessageId;
  #54 = Utf8               LOOTING_RANDOM
  #55 = String             #12            // ITEM_RANDOM_SPOIL
  #56 = Fieldref           #44.#57        // ext/mods/gameserver/network/SystemMessageId.LOOTING_RANDOM_INCLUDE_SPOIL:Lext/mods/gameserver/network/SystemMessageId;
  #57 = NameAndType        #58:#41        // LOOTING_RANDOM_INCLUDE_SPOIL:Lext/mods/gameserver/network/SystemMessageId;
  #58 = Utf8               LOOTING_RANDOM_INCLUDE_SPOIL
  #59 = String             #15            // ITEM_ORDER
  #60 = Fieldref           #44.#61        // ext/mods/gameserver/network/SystemMessageId.LOOTING_BY_TURN:Lext/mods/gameserver/network/SystemMessageId;
  #61 = NameAndType        #62:#41        // LOOTING_BY_TURN:Lext/mods/gameserver/network/SystemMessageId;
  #62 = Utf8               LOOTING_BY_TURN
  #63 = String             #18            // ITEM_ORDER_SPOIL
  #64 = Fieldref           #44.#65        // ext/mods/gameserver/network/SystemMessageId.LOOTING_BY_TURN_INCLUDE_SPOIL:Lext/mods/gameserver/network/SystemMessageId;
  #65 = NameAndType        #66:#41        // LOOTING_BY_TURN_INCLUDE_SPOIL:Lext/mods/gameserver/network/SystemMessageId;
  #66 = Utf8               LOOTING_BY_TURN_INCLUDE_SPOIL
  #67 = Methodref          #1.#68         // ext/mods/gameserver/enums/LootRule.$values:()[Lext/mods/gameserver/enums/LootRule;
  #68 = NameAndType        #69:#70        // $values:()[Lext/mods/gameserver/enums/LootRule;
  #69 = Utf8               $values
  #70 = Utf8               ()[Lext/mods/gameserver/enums/LootRule;
  #71 = Methodref          #1.#72         // ext/mods/gameserver/enums/LootRule.values:()[Lext/mods/gameserver/enums/LootRule;
  #72 = NameAndType        #73:#70        // values:()[Lext/mods/gameserver/enums/LootRule;
  #73 = Utf8               values
  #74 = Fieldref           #1.#75         // ext/mods/gameserver/enums/LootRule.VALUES:[Lext/mods/gameserver/enums/LootRule;
  #75 = NameAndType        #76:#22        // VALUES:[Lext/mods/gameserver/enums/LootRule;
  #76 = Utf8               VALUES
  #77 = Utf8               Code
  #78 = Utf8               LineNumberTable
  #79 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/LootRule;
  #80 = Utf8               LocalVariableTable
  #81 = Utf8               name
  #82 = Utf8               Ljava/lang/String;
  #83 = Utf8               MethodParameters
  #84 = Utf8               this
  #85 = Utf8               smId
  #86 = Utf8               Signature
  #87 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #88 = Utf8               getMessageId
  #89 = Utf8               ()Lext/mods/gameserver/network/SystemMessageId;
  #90 = Utf8               <clinit>
  #91 = Utf8               ()V
  #92 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/LootRule;>;
  #93 = Utf8               SourceFile
  #94 = Utf8               LootRule.java
{
  public static final ext.mods.gameserver.enums.LootRule ITEM_LOOTER;
    descriptor: Lext/mods/gameserver/enums/LootRule;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.LootRule ITEM_RANDOM;
    descriptor: Lext/mods/gameserver/enums/LootRule;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.LootRule ITEM_RANDOM_SPOIL;
    descriptor: Lext/mods/gameserver/enums/LootRule;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.LootRule ITEM_ORDER;
    descriptor: Lext/mods/gameserver/enums/LootRule;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.LootRule ITEM_ORDER_SPOIL;
    descriptor: Lext/mods/gameserver/enums/LootRule;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.LootRule[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/LootRule;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.LootRule[] values();
    descriptor: ()[Lext/mods/gameserver/enums/LootRule;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/LootRule;
         3: invokevirtual #23                 // Method "[Lext/mods/gameserver/enums/LootRule;".clone:()Ljava/lang/Object;
         6: checkcast     #24                 // class "[Lext/mods/gameserver/enums/LootRule;"
         9: areturn
      LineNumberTable:
        line 22: 0

  public static ext.mods.gameserver.enums.LootRule valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/LootRule;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/LootRule
         2: aload_0
         3: invokestatic  #28                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/LootRule
         9: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public ext.mods.gameserver.network.SystemMessageId getMessageId();
    descriptor: ()Lext/mods/gameserver/network/SystemMessageId;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _smId:Lext/mods/gameserver/network/SystemMessageId;
         4: areturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/LootRule;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/LootRule
         3: dup
         4: ldc           #42                 // String ITEM_LOOTER
         6: iconst_0
         7: getstatic     #43                 // Field ext/mods/gameserver/network/SystemMessageId.LOOTING_FINDERS_KEEPERS:Lext/mods/gameserver/network/SystemMessageId;
        10: invokespecial #48                 // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/network/SystemMessageId;)V
        13: putstatic     #3                  // Field ITEM_LOOTER:Lext/mods/gameserver/enums/LootRule;
        16: new           #1                  // class ext/mods/gameserver/enums/LootRule
        19: dup
        20: ldc           #51                 // String ITEM_RANDOM
        22: iconst_1
        23: getstatic     #52                 // Field ext/mods/gameserver/network/SystemMessageId.LOOTING_RANDOM:Lext/mods/gameserver/network/SystemMessageId;
        26: invokespecial #48                 // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/network/SystemMessageId;)V
        29: putstatic     #7                  // Field ITEM_RANDOM:Lext/mods/gameserver/enums/LootRule;
        32: new           #1                  // class ext/mods/gameserver/enums/LootRule
        35: dup
        36: ldc           #55                 // String ITEM_RANDOM_SPOIL
        38: iconst_2
        39: getstatic     #56                 // Field ext/mods/gameserver/network/SystemMessageId.LOOTING_RANDOM_INCLUDE_SPOIL:Lext/mods/gameserver/network/SystemMessageId;
        42: invokespecial #48                 // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/network/SystemMessageId;)V
        45: putstatic     #10                 // Field ITEM_RANDOM_SPOIL:Lext/mods/gameserver/enums/LootRule;
        48: new           #1                  // class ext/mods/gameserver/enums/LootRule
        51: dup
        52: ldc           #59                 // String ITEM_ORDER
        54: iconst_3
        55: getstatic     #60                 // Field ext/mods/gameserver/network/SystemMessageId.LOOTING_BY_TURN:Lext/mods/gameserver/network/SystemMessageId;
        58: invokespecial #48                 // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/network/SystemMessageId;)V
        61: putstatic     #13                 // Field ITEM_ORDER:Lext/mods/gameserver/enums/LootRule;
        64: new           #1                  // class ext/mods/gameserver/enums/LootRule
        67: dup
        68: ldc           #63                 // String ITEM_ORDER_SPOIL
        70: iconst_4
        71: getstatic     #64                 // Field ext/mods/gameserver/network/SystemMessageId.LOOTING_BY_TURN_INCLUDE_SPOIL:Lext/mods/gameserver/network/SystemMessageId;
        74: invokespecial #48                 // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/network/SystemMessageId;)V
        77: putstatic     #16                 // Field ITEM_ORDER_SPOIL:Lext/mods/gameserver/enums/LootRule;
        80: invokestatic  #67                 // Method $values:()[Lext/mods/gameserver/enums/LootRule;
        83: putstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/LootRule;
        86: invokestatic  #71                 // Method values:()[Lext/mods/gameserver/enums/LootRule;
        89: putstatic     #74                 // Field VALUES:[Lext/mods/gameserver/enums/LootRule;
        92: return
      LineNumberTable:
        line 24: 0
        line 25: 16
        line 26: 32
        line 27: 48
        line 28: 64
        line 22: 80
        line 42: 86
}
Signature: #92                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/LootRule;>;
SourceFile: "LootRule.java"
