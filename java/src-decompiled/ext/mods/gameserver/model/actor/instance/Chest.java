// Bytecode for: ext.mods.gameserver.model.actor.instance.Chest
// File: ext\mods\gameserver\model\actor\instance\Chest.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Chest.class
  Last modified 9 de jul de 2026; size 1541 bytes
  MD5 checksum 1026807867d582969254ee3b9e7f40c9
  Compiled from "Chest.java"
public final class ext.mods.gameserver.model.actor.instance.Chest extends ext.mods.gameserver.model.actor.instance.Monster
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/Chest
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Monster
  interfaces: 0, fields: 3, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/Monster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/Monster
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/instance/Chest.BOXES:[I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/instance/Chest
   #9 = NameAndType        #11:#12        // BOXES:[I
  #10 = Utf8               ext/mods/gameserver/model/actor/instance/Chest
  #11 = Utf8               BOXES
  #12 = Utf8               [I
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
  #14 = Class              #16            // ext/mods/gameserver/model/actor/template/NpcTemplate
  #15 = NameAndType        #17:#18        // getNpcId:()I
  #16 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #17 = Utf8               getNpcId
  #18 = Utf8               ()I
  #19 = Methodref          #20.#21        // ext/mods/commons/util/ArraysUtil.contains:([II)Z
  #20 = Class              #22            // ext/mods/commons/util/ArraysUtil
  #21 = NameAndType        #23:#24        // contains:([II)Z
  #22 = Utf8               ext/mods/commons/util/ArraysUtil
  #23 = Utf8               contains
  #24 = Utf8               ([II)Z
  #25 = Fieldref           #8.#26         // ext/mods/gameserver/model/actor/instance/Chest._isBox:Z
  #26 = NameAndType        #27:#28        // _isBox:Z
  #27 = Utf8               _isBox
  #28 = Utf8               Z
  #29 = Fieldref           #8.#30         // ext/mods/gameserver/model/actor/instance/Chest._isInteracted:Z
  #30 = NameAndType        #31:#28        // _isInteracted:Z
  #31 = Utf8               _isInteracted
  #32 = Methodref          #8.#33         // ext/mods/gameserver/model/actor/instance/Chest.setNoRndWalk:(Z)V
  #33 = NameAndType        #34:#35        // setNoRndWalk:(Z)V
  #34 = Utf8               setNoRndWalk
  #35 = Utf8               (Z)V
  #36 = Methodref          #8.#37         // ext/mods/gameserver/model/actor/instance/Chest.disableCoreAi:(Z)V
  #37 = NameAndType        #38:#35        // disableCoreAi:(Z)V
  #38 = Utf8               disableCoreAi
  #39 = Methodref          #2.#40         // ext/mods/gameserver/model/actor/instance/Monster.onSpawn:()V
  #40 = NameAndType        #41:#42        // onSpawn:()V
  #41 = Utf8               onSpawn
  #42 = Utf8               ()V
  #43 = Utf8               Code
  #44 = Utf8               LineNumberTable
  #45 = Utf8               LocalVariableTable
  #46 = Utf8               this
  #47 = Utf8               Lext/mods/gameserver/model/actor/instance/Chest;
  #48 = Utf8               objectId
  #49 = Utf8               I
  #50 = Utf8               template
  #51 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #52 = Utf8               StackMapTable
  #53 = Utf8               isBox
  #54 = Utf8               ()Z
  #55 = Utf8               isInteracted
  #56 = Utf8               setInteracted
  #57 = Utf8               <clinit>
  #58 = Utf8               SourceFile
  #59 = Utf8               Chest.java
{
  public ext.mods.gameserver.model.actor.instance.Chest(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Monster."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: getstatic     #7                  // Field BOXES:[I
        10: aload_2
        11: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        14: invokestatic  #19                 // Method ext/mods/commons/util/ArraysUtil.contains:([II)Z
        17: putfield      #25                 // Field _isBox:Z
        20: aload_0
        21: iconst_0
        22: putfield      #29                 // Field _isInteracted:Z
        25: aload_0
        26: iconst_1
        27: invokevirtual #32                 // Method setNoRndWalk:(Z)V
        30: aload_0
        31: getfield      #25                 // Field _isBox:Z
        34: ifeq          42
        37: aload_0
        38: iconst_1
        39: invokevirtual #36                 // Method disableCoreAi:(Z)V
        42: return
      LineNumberTable:
        line 70: 0
        line 72: 6
        line 74: 20
        line 76: 25
        line 77: 30
        line 78: 37
        line 79: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/actor/instance/Chest;
            0      43     1 objectId   I
            0      43     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/actor/instance/Chest, int, class ext/mods/gameserver/model/actor/template/NpcTemplate ]
          stack = []

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #39                 // Method ext/mods/gameserver/model/actor/instance/Monster.onSpawn:()V
         4: aload_0
         5: iconst_0
         6: putfield      #29                 // Field _isInteracted:Z
         9: return
      LineNumberTable:
        line 84: 0
        line 86: 4
        line 87: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/Chest;

  public boolean isBox();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _isBox:Z
         4: ireturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Chest;

  public boolean isInteracted();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _isInteracted:Z
         4: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Chest;

  public void setInteracted();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #29                 // Field _isInteracted:Z
         5: return
      LineNumberTable:
        line 101: 0
        line 102: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Chest;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        34
         2: newarray       int
         4: dup
         5: iconst_0
         6: sipush        18265
         9: iastore
        10: dup
        11: iconst_1
        12: sipush        18266
        15: iastore
        16: dup
        17: iconst_2
        18: sipush        18267
        21: iastore
        22: dup
        23: iconst_3
        24: sipush        18268
        27: iastore
        28: dup
        29: iconst_4
        30: sipush        18269
        33: iastore
        34: dup
        35: iconst_5
        36: sipush        18270
        39: iastore
        40: dup
        41: bipush        6
        43: sipush        18271
        46: iastore
        47: dup
        48: bipush        7
        50: sipush        18272
        53: iastore
        54: dup
        55: bipush        8
        57: sipush        18273
        60: iastore
        61: dup
        62: bipush        9
        64: sipush        18274
        67: iastore
        68: dup
        69: bipush        10
        71: sipush        18275
        74: iastore
        75: dup
        76: bipush        11
        78: sipush        18276
        81: iastore
        82: dup
        83: bipush        12
        85: sipush        18277
        88: iastore
        89: dup
        90: bipush        13
        92: sipush        18278
        95: iastore
        96: dup
        97: bipush        14
        99: sipush        18279
       102: iastore
       103: dup
       104: bipush        15
       106: sipush        18280
       109: iastore
       110: dup
       111: bipush        16
       113: sipush        18281
       116: iastore
       117: dup
       118: bipush        17
       120: sipush        18282
       123: iastore
       124: dup
       125: bipush        18
       127: sipush        18283
       130: iastore
       131: dup
       132: bipush        19
       134: sipush        18284
       137: iastore
       138: dup
       139: bipush        20
       141: sipush        18285
       144: iastore
       145: dup
       146: bipush        21
       148: sipush        18286
       151: iastore
       152: dup
       153: bipush        22
       155: sipush        18287
       158: iastore
       159: dup
       160: bipush        23
       162: sipush        18288
       165: iastore
       166: dup
       167: bipush        24
       169: sipush        18289
       172: iastore
       173: dup
       174: bipush        25
       176: sipush        18290
       179: iastore
       180: dup
       181: bipush        26
       183: sipush        18291
       186: iastore
       187: dup
       188: bipush        27
       190: sipush        18292
       193: iastore
       194: dup
       195: bipush        28
       197: sipush        18293
       200: iastore
       201: dup
       202: bipush        29
       204: sipush        18294
       207: iastore
       208: dup
       209: bipush        30
       211: sipush        18295
       214: iastore
       215: dup
       216: bipush        31
       218: sipush        18296
       221: iastore
       222: dup
       223: bipush        32
       225: sipush        18297
       228: iastore
       229: dup
       230: bipush        33
       232: sipush        18298
       235: iastore
       236: putstatic     #7                  // Field BOXES:[I
       239: return
      LineNumberTable:
        line 26: 0
}
SourceFile: "Chest.java"
