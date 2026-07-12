// Bytecode for: ext.mods.gameserver.model.holder.skillnode.EnchantSkillNode
// File: ext\mods\gameserver\model\holder\skillnode\EnchantSkillNode.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode.class
  Last modified 9 de jul de 2026; size 1935 bytes
  MD5 checksum 6a72c5df6e66b94f7bf8a2379f309648
  Compiled from "EnchantSkillNode.java"
public class ext.mods.gameserver.model.holder.skillnode.EnchantSkillNode extends ext.mods.gameserver.model.holder.IntIntHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode
  super_class: #12                        // ext/mods/gameserver/model/holder/IntIntHolder
  interfaces: 0, fields: 6, methods: 7, attributes: 1
Constant pool:
   #1 = String             #2             // id
   #2 = Utf8               id
   #3 = Methodref          #4.#5          // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #4 = Class              #6             // ext/mods/commons/data/StatSet
   #5 = NameAndType        #7:#8          // getInteger:(Ljava/lang/String;)I
   #6 = Utf8               ext/mods/commons/data/StatSet
   #7 = Utf8               getInteger
   #8 = Utf8               (Ljava/lang/String;)I
   #9 = String             #10            // lvl
  #10 = Utf8               lvl
  #11 = Methodref          #12.#13        // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #12 = Class              #14            // ext/mods/gameserver/model/holder/IntIntHolder
  #13 = NameAndType        #15:#16        // "<init>":(II)V
  #14 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #15 = Utf8               <init>
  #16 = Utf8               (II)V
  #17 = Fieldref           #18.#19        // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode._enchantRates:[I
  #18 = Class              #20            // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode
  #19 = NameAndType        #21:#22        // _enchantRates:[I
  #20 = Utf8               ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode
  #21 = Utf8               _enchantRates
  #22 = Utf8               [I
  #23 = String             #24            // exp
  #24 = Utf8               exp
  #25 = Fieldref           #18.#26        // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode._exp:I
  #26 = NameAndType        #27:#28        // _exp:I
  #27 = Utf8               _exp
  #28 = Utf8               I
  #29 = String             #30            // sp
  #30 = Utf8               sp
  #31 = Fieldref           #18.#32        // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode._sp:I
  #32 = NameAndType        #33:#28        // _sp:I
  #33 = Utf8               _sp
  #34 = String             #35            // rate76
  #35 = Utf8               rate76
  #36 = String             #37            // rate77
  #37 = Utf8               rate77
  #38 = String             #39            // rate78
  #39 = Utf8               rate78
  #40 = String             #41            // rate79
  #41 = Utf8               rate79
  #42 = String             #43            // rate80
  #43 = Utf8               rate80
  #44 = String             #45            // itemNeeded
  #45 = Utf8               itemNeeded
  #46 = Methodref          #4.#47         // ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
  #47 = NameAndType        #48:#49        // containsKey:(Ljava/lang/Object;)Z
  #48 = Utf8               containsKey
  #49 = Utf8               (Ljava/lang/Object;)Z
  #50 = Methodref          #4.#51         // ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #51 = NameAndType        #52:#53        // getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #52 = Utf8               getIntIntHolder
  #53 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #54 = Fieldref           #18.#55        // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode._item:Lext/mods/gameserver/model/holder/IntIntHolder;
  #55 = NameAndType        #56:#57        // _item:Lext/mods/gameserver/model/holder/IntIntHolder;
  #56 = Utf8               _item
  #57 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #58 = String             #59            // name
  #59 = Utf8               name
  #60 = String             #61            //
  #61 = Utf8
  #62 = Methodref          #4.#63         // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #63 = NameAndType        #64:#65        // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #64 = Utf8               getString
  #65 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #66 = Fieldref           #18.#67        // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode._name:Ljava/lang/String;
  #67 = NameAndType        #68:#69        // _name:Ljava/lang/String;
  #68 = Utf8               _name
  #69 = Utf8               Ljava/lang/String;
  #70 = String             #71            // desc
  #71 = Utf8               desc
  #72 = Fieldref           #18.#73        // ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode._desc:Ljava/lang/String;
  #73 = NameAndType        #74:#69        // _desc:Ljava/lang/String;
  #74 = Utf8               _desc
  #75 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #76 = Utf8               Code
  #77 = Utf8               LineNumberTable
  #78 = Utf8               LocalVariableTable
  #79 = Utf8               this
  #80 = Utf8               Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;
  #81 = Utf8               set
  #82 = Utf8               Lext/mods/commons/data/StatSet;
  #83 = Utf8               StackMapTable
  #84 = Utf8               getExp
  #85 = Utf8               ()I
  #86 = Utf8               getSp
  #87 = Utf8               getEnchantRate
  #88 = Utf8               (I)I
  #89 = Utf8               level
  #90 = Utf8               getItem
  #91 = Utf8               ()Lext/mods/gameserver/model/holder/IntIntHolder;
  #92 = Utf8               getName
  #93 = Utf8               ()Ljava/lang/String;
  #94 = Utf8               getDesc
  #95 = Utf8               SourceFile
  #96 = Utf8               EnchantSkillNode.java
{
  public ext.mods.gameserver.model.holder.skillnode.EnchantSkillNode(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #1                  // String id
         4: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #9                  // String lvl
        10: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: invokespecial #11                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        16: aload_0
        17: iconst_5
        18: newarray       int
        20: putfield      #17                 // Field _enchantRates:[I
        23: aload_0
        24: aload_1
        25: ldc           #23                 // String exp
        27: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        30: putfield      #25                 // Field _exp:I
        33: aload_0
        34: aload_1
        35: ldc           #29                 // String sp
        37: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        40: putfield      #31                 // Field _sp:I
        43: aload_0
        44: getfield      #17                 // Field _enchantRates:[I
        47: iconst_0
        48: aload_1
        49: ldc           #34                 // String rate76
        51: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        54: iastore
        55: aload_0
        56: getfield      #17                 // Field _enchantRates:[I
        59: iconst_1
        60: aload_1
        61: ldc           #36                 // String rate77
        63: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        66: iastore
        67: aload_0
        68: getfield      #17                 // Field _enchantRates:[I
        71: iconst_2
        72: aload_1
        73: ldc           #38                 // String rate78
        75: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        78: iastore
        79: aload_0
        80: getfield      #17                 // Field _enchantRates:[I
        83: iconst_3
        84: aload_1
        85: ldc           #40                 // String rate79
        87: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        90: iastore
        91: aload_0
        92: getfield      #17                 // Field _enchantRates:[I
        95: iconst_4
        96: aload_1
        97: ldc           #42                 // String rate80
        99: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       102: iastore
       103: aload_1
       104: ldc           #44                 // String itemNeeded
       106: invokevirtual #46                 // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       109: ifeq          122
       112: aload_0
       113: aload_1
       114: ldc           #44                 // String itemNeeded
       116: invokevirtual #50                 // Method ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
       119: putfield      #54                 // Field _item:Lext/mods/gameserver/model/holder/IntIntHolder;
       122: aload_0
       123: aload_1
       124: ldc           #58                 // String name
       126: ldc           #60                 // String
       128: invokevirtual #62                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       131: putfield      #66                 // Field _name:Ljava/lang/String;
       134: aload_0
       135: aload_1
       136: ldc           #70                 // String desc
       138: ldc           #60                 // String
       140: invokevirtual #62                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       143: putfield      #72                 // Field _desc:Ljava/lang/String;
       146: return
      LineNumberTable:
        line 41: 0
        line 32: 16
        line 43: 23
        line 44: 33
        line 46: 43
        line 47: 55
        line 48: 67
        line 49: 79
        line 50: 91
        line 52: 103
        line 53: 112
        line 55: 122
        line 56: 134
        line 57: 146
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     147     0  this   Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;
            0     147     1   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 122
          locals = [ class ext/mods/gameserver/model/holder/skillnode/EnchantSkillNode, class ext/mods/commons/data/StatSet ]
          stack = []

  public int getExp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _exp:I
         4: ireturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;

  public int getSp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _sp:I
         4: ireturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;

  public int getEnchantRate(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _enchantRates:[I
         4: iload_1
         5: bipush        76
         7: isub
         8: iaload
         9: ireturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;
            0      10     1 level   I

  public ext.mods.gameserver.model.holder.IntIntHolder getItem();
    descriptor: ()Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #54                 // Field _item:Lext/mods/gameserver/model/holder/IntIntHolder;
         4: areturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #66                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;

  public java.lang.String getDesc();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #72                 // Field _desc:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/skillnode/EnchantSkillNode;
}
SourceFile: "EnchantSkillNode.java"
