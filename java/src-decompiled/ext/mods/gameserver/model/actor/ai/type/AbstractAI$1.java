// Bytecode for: ext.mods.gameserver.model.actor.ai.type.AbstractAI$1
// File: ext\mods\gameserver\model\actor\ai\type\AbstractAI$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/AbstractAI$1.class
  Last modified 9 de jul de 2026; size 2539 bytes
  MD5 checksum 421156d7dc285fc222c53bbc686ba47c
  Compiled from "AbstractAI.java"
class ext.mods.gameserver.model.actor.ai.type.AbstractAI$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/type/AbstractAI$1
  super_class: #126                       // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/enums/AiEventType.values:()[Lext/mods/gameserver/enums/AiEventType;
    #2 = Class              #4            // ext/mods/gameserver/enums/AiEventType
    #3 = NameAndType        #5:#6         // values:()[Lext/mods/gameserver/enums/AiEventType;
    #4 = Utf8               ext/mods/gameserver/enums/AiEventType
    #5 = Utf8               values
    #6 = Utf8               ()[Lext/mods/gameserver/enums/AiEventType;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/ai/type/AbstractAI$1.$SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/ai/type/AbstractAI$1
    #9 = NameAndType        #11:#12       // $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
   #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/AbstractAI$1
   #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$AiEventType
   #12 = Utf8               [I
   #13 = Fieldref           #2.#14        // ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
   #14 = NameAndType        #15:#16       // THINK:Lext/mods/gameserver/enums/AiEventType;
   #15 = Utf8               THINK
   #16 = Utf8               Lext/mods/gameserver/enums/AiEventType;
   #17 = Methodref          #2.#18        // ext/mods/gameserver/enums/AiEventType.ordinal:()I
   #18 = NameAndType        #19:#20       // ordinal:()I
   #19 = Utf8               ordinal
   #20 = Utf8               ()I
   #21 = Class              #22           // java/lang/NoSuchFieldError
   #22 = Utf8               java/lang/NoSuchFieldError
   #23 = Fieldref           #2.#24        // ext/mods/gameserver/enums/AiEventType.ATTACKED:Lext/mods/gameserver/enums/AiEventType;
   #24 = NameAndType        #25:#16       // ATTACKED:Lext/mods/gameserver/enums/AiEventType;
   #25 = Utf8               ATTACKED
   #26 = Fieldref           #2.#27        // ext/mods/gameserver/enums/AiEventType.AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
   #27 = NameAndType        #28:#16       // AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
   #28 = Utf8               AGGRESSION
   #29 = Fieldref           #2.#30        // ext/mods/gameserver/enums/AiEventType.EVADED:Lext/mods/gameserver/enums/AiEventType;
   #30 = NameAndType        #31:#16       // EVADED:Lext/mods/gameserver/enums/AiEventType;
   #31 = Utf8               EVADED
   #32 = Fieldref           #2.#33        // ext/mods/gameserver/enums/AiEventType.FINISHED_ATTACK:Lext/mods/gameserver/enums/AiEventType;
   #33 = NameAndType        #34:#16       // FINISHED_ATTACK:Lext/mods/gameserver/enums/AiEventType;
   #34 = Utf8               FINISHED_ATTACK
   #35 = Fieldref           #2.#36        // ext/mods/gameserver/enums/AiEventType.FINISHED_ATTACK_BOW:Lext/mods/gameserver/enums/AiEventType;
   #36 = NameAndType        #37:#16       // FINISHED_ATTACK_BOW:Lext/mods/gameserver/enums/AiEventType;
   #37 = Utf8               FINISHED_ATTACK_BOW
   #38 = Fieldref           #2.#39        // ext/mods/gameserver/enums/AiEventType.BOW_ATTACK_REUSED:Lext/mods/gameserver/enums/AiEventType;
   #39 = NameAndType        #40:#16       // BOW_ATTACK_REUSED:Lext/mods/gameserver/enums/AiEventType;
   #40 = Utf8               BOW_ATTACK_REUSED
   #41 = Fieldref           #2.#42        // ext/mods/gameserver/enums/AiEventType.ARRIVED:Lext/mods/gameserver/enums/AiEventType;
   #42 = NameAndType        #43:#16       // ARRIVED:Lext/mods/gameserver/enums/AiEventType;
   #43 = Utf8               ARRIVED
   #44 = Fieldref           #2.#45        // ext/mods/gameserver/enums/AiEventType.ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
   #45 = NameAndType        #46:#16       // ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
   #46 = Utf8               ARRIVED_BLOCKED
   #47 = Fieldref           #2.#48        // ext/mods/gameserver/enums/AiEventType.CANCEL:Lext/mods/gameserver/enums/AiEventType;
   #48 = NameAndType        #49:#16       // CANCEL:Lext/mods/gameserver/enums/AiEventType;
   #49 = Utf8               CANCEL
   #50 = Fieldref           #2.#51        // ext/mods/gameserver/enums/AiEventType.DEAD:Lext/mods/gameserver/enums/AiEventType;
   #51 = NameAndType        #52:#16       // DEAD:Lext/mods/gameserver/enums/AiEventType;
   #52 = Utf8               DEAD
   #53 = Fieldref           #2.#54        // ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
   #54 = NameAndType        #55:#16       // FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
   #55 = Utf8               FINISHED_CASTING
   #56 = Fieldref           #2.#57        // ext/mods/gameserver/enums/AiEventType.SAT_DOWN:Lext/mods/gameserver/enums/AiEventType;
   #57 = NameAndType        #58:#16       // SAT_DOWN:Lext/mods/gameserver/enums/AiEventType;
   #58 = Utf8               SAT_DOWN
   #59 = Fieldref           #2.#60        // ext/mods/gameserver/enums/AiEventType.STOOD_UP:Lext/mods/gameserver/enums/AiEventType;
   #60 = NameAndType        #61:#16       // STOOD_UP:Lext/mods/gameserver/enums/AiEventType;
   #61 = Utf8               STOOD_UP
   #62 = Fieldref           #2.#63        // ext/mods/gameserver/enums/AiEventType.OWNER_ATTACKED:Lext/mods/gameserver/enums/AiEventType;
   #63 = NameAndType        #64:#16       // OWNER_ATTACKED:Lext/mods/gameserver/enums/AiEventType;
   #64 = Utf8               OWNER_ATTACKED
   #65 = Fieldref           #2.#66        // ext/mods/gameserver/enums/AiEventType.TELEPORTED:Lext/mods/gameserver/enums/AiEventType;
   #66 = NameAndType        #67:#16       // TELEPORTED:Lext/mods/gameserver/enums/AiEventType;
   #67 = Utf8               TELEPORTED
   #68 = Methodref          #69.#70       // ext/mods/gameserver/enums/IntentionType.values:()[Lext/mods/gameserver/enums/IntentionType;
   #69 = Class              #71           // ext/mods/gameserver/enums/IntentionType
   #70 = NameAndType        #5:#72        // values:()[Lext/mods/gameserver/enums/IntentionType;
   #71 = Utf8               ext/mods/gameserver/enums/IntentionType
   #72 = Utf8               ()[Lext/mods/gameserver/enums/IntentionType;
   #73 = Fieldref           #8.#74        // ext/mods/gameserver/model/actor/ai/type/AbstractAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #74 = NameAndType        #75:#12       // $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #75 = Utf8               $SwitchMap$ext$mods$gameserver$enums$IntentionType
   #76 = Fieldref           #69.#77       // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #77 = NameAndType        #78:#79       // ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #78 = Utf8               ATTACK
   #79 = Utf8               Lext/mods/gameserver/enums/IntentionType;
   #80 = Methodref          #69.#18       // ext/mods/gameserver/enums/IntentionType.ordinal:()I
   #81 = Fieldref           #69.#82       // ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
   #82 = NameAndType        #83:#79       // CAST:Lext/mods/gameserver/enums/IntentionType;
   #83 = Utf8               CAST
   #84 = Fieldref           #69.#85       // ext/mods/gameserver/enums/IntentionType.FAKE_DEATH:Lext/mods/gameserver/enums/IntentionType;
   #85 = NameAndType        #86:#79       // FAKE_DEATH:Lext/mods/gameserver/enums/IntentionType;
   #86 = Utf8               FAKE_DEATH
   #87 = Fieldref           #69.#88       // ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
   #88 = NameAndType        #89:#79       // FLEE:Lext/mods/gameserver/enums/IntentionType;
   #89 = Utf8               FLEE
   #90 = Fieldref           #69.#91       // ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
   #91 = NameAndType        #92:#79       // FOLLOW:Lext/mods/gameserver/enums/IntentionType;
   #92 = Utf8               FOLLOW
   #93 = Fieldref           #69.#94       // ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
   #94 = NameAndType        #95:#79       // IDLE:Lext/mods/gameserver/enums/IntentionType;
   #95 = Utf8               IDLE
   #96 = Fieldref           #69.#97       // ext/mods/gameserver/enums/IntentionType.INTERACT:Lext/mods/gameserver/enums/IntentionType;
   #97 = NameAndType        #98:#79       // INTERACT:Lext/mods/gameserver/enums/IntentionType;
   #98 = Utf8               INTERACT
   #99 = Fieldref           #69.#100      // ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
  #100 = NameAndType        #101:#79      // MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
  #101 = Utf8               MOVE_ROUTE
  #102 = Fieldref           #69.#103      // ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #103 = NameAndType        #104:#79      // MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #104 = Utf8               MOVE_TO
  #105 = Fieldref           #69.#106      // ext/mods/gameserver/enums/IntentionType.NOTHING:Lext/mods/gameserver/enums/IntentionType;
  #106 = NameAndType        #107:#79      // NOTHING:Lext/mods/gameserver/enums/IntentionType;
  #107 = Utf8               NOTHING
  #108 = Fieldref           #69.#109      // ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
  #109 = NameAndType        #110:#79      // PICK_UP:Lext/mods/gameserver/enums/IntentionType;
  #110 = Utf8               PICK_UP
  #111 = Fieldref           #69.#112      // ext/mods/gameserver/enums/IntentionType.SIT:Lext/mods/gameserver/enums/IntentionType;
  #112 = NameAndType        #113:#79      // SIT:Lext/mods/gameserver/enums/IntentionType;
  #113 = Utf8               SIT
  #114 = Fieldref           #69.#115      // ext/mods/gameserver/enums/IntentionType.SOCIAL:Lext/mods/gameserver/enums/IntentionType;
  #115 = NameAndType        #116:#79      // SOCIAL:Lext/mods/gameserver/enums/IntentionType;
  #116 = Utf8               SOCIAL
  #117 = Fieldref           #69.#118      // ext/mods/gameserver/enums/IntentionType.STAND:Lext/mods/gameserver/enums/IntentionType;
  #118 = NameAndType        #119:#79      // STAND:Lext/mods/gameserver/enums/IntentionType;
  #119 = Utf8               STAND
  #120 = Fieldref           #69.#121      // ext/mods/gameserver/enums/IntentionType.USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
  #121 = NameAndType        #122:#79      // USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
  #122 = Utf8               USE_ITEM
  #123 = Fieldref           #69.#124      // ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
  #124 = NameAndType        #125:#79      // WANDER:Lext/mods/gameserver/enums/IntentionType;
  #125 = Utf8               WANDER
  #126 = Class              #127          // java/lang/Object
  #127 = Utf8               java/lang/Object
  #128 = Utf8               <clinit>
  #129 = Utf8               ()V
  #130 = Utf8               Code
  #131 = Utf8               LineNumberTable
  #132 = Utf8               LocalVariableTable
  #133 = Utf8               StackMapTable
  #134 = Utf8               SourceFile
  #135 = Utf8               AbstractAI.java
  #136 = Utf8               EnclosingMethod
  #137 = Class              #138          // ext/mods/gameserver/model/actor/ai/type/AbstractAI
  #138 = Utf8               ext/mods/gameserver/model/actor/ai/type/AbstractAI
  #139 = Utf8               NestHost
  #140 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$IntentionType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$AiEventType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/AiEventType.values:()[Lext/mods/gameserver/enums/AiEventType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/AiEventType.ATTACKED:Lext/mods/gameserver/enums/AiEventType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/AiEventType.AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/AiEventType.EVADED:Lext/mods/gameserver/enums/AiEventType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
        72: getstatic     #32                 // Field ext/mods/gameserver/enums/AiEventType.FINISHED_ATTACK:Lext/mods/gameserver/enums/AiEventType;
        75: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
        78: iconst_5
        79: iastore
        80: goto          84
        83: astore_0
        84: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
        87: getstatic     #35                 // Field ext/mods/gameserver/enums/AiEventType.FINISHED_ATTACK_BOW:Lext/mods/gameserver/enums/AiEventType;
        90: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
        93: bipush        6
        95: iastore
        96: goto          100
        99: astore_0
       100: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
       103: getstatic     #38                 // Field ext/mods/gameserver/enums/AiEventType.BOW_ATTACK_REUSED:Lext/mods/gameserver/enums/AiEventType;
       106: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
       109: bipush        7
       111: iastore
       112: goto          116
       115: astore_0
       116: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
       119: getstatic     #41                 // Field ext/mods/gameserver/enums/AiEventType.ARRIVED:Lext/mods/gameserver/enums/AiEventType;
       122: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
       125: bipush        8
       127: iastore
       128: goto          132
       131: astore_0
       132: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
       135: getstatic     #44                 // Field ext/mods/gameserver/enums/AiEventType.ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
       138: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
       141: bipush        9
       143: iastore
       144: goto          148
       147: astore_0
       148: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
       151: getstatic     #47                 // Field ext/mods/gameserver/enums/AiEventType.CANCEL:Lext/mods/gameserver/enums/AiEventType;
       154: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
       157: bipush        10
       159: iastore
       160: goto          164
       163: astore_0
       164: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
       167: getstatic     #50                 // Field ext/mods/gameserver/enums/AiEventType.DEAD:Lext/mods/gameserver/enums/AiEventType;
       170: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
       173: bipush        11
       175: iastore
       176: goto          180
       179: astore_0
       180: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
       183: getstatic     #53                 // Field ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
       186: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
       189: bipush        12
       191: iastore
       192: goto          196
       195: astore_0
       196: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
       199: getstatic     #56                 // Field ext/mods/gameserver/enums/AiEventType.SAT_DOWN:Lext/mods/gameserver/enums/AiEventType;
       202: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
       205: bipush        13
       207: iastore
       208: goto          212
       211: astore_0
       212: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
       215: getstatic     #59                 // Field ext/mods/gameserver/enums/AiEventType.STOOD_UP:Lext/mods/gameserver/enums/AiEventType;
       218: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
       221: bipush        14
       223: iastore
       224: goto          228
       227: astore_0
       228: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
       231: getstatic     #62                 // Field ext/mods/gameserver/enums/AiEventType.OWNER_ATTACKED:Lext/mods/gameserver/enums/AiEventType;
       234: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
       237: bipush        15
       239: iastore
       240: goto          244
       243: astore_0
       244: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
       247: getstatic     #65                 // Field ext/mods/gameserver/enums/AiEventType.TELEPORTED:Lext/mods/gameserver/enums/AiEventType;
       250: invokevirtual #17                 // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
       253: bipush        16
       255: iastore
       256: goto          260
       259: astore_0
       260: invokestatic  #68                 // Method ext/mods/gameserver/enums/IntentionType.values:()[Lext/mods/gameserver/enums/IntentionType;
       263: arraylength
       264: newarray       int
       266: putstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       269: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       272: getstatic     #76                 // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
       275: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       278: iconst_1
       279: iastore
       280: goto          284
       283: astore_0
       284: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       287: getstatic     #81                 // Field ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
       290: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       293: iconst_2
       294: iastore
       295: goto          299
       298: astore_0
       299: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       302: getstatic     #84                 // Field ext/mods/gameserver/enums/IntentionType.FAKE_DEATH:Lext/mods/gameserver/enums/IntentionType;
       305: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       308: iconst_3
       309: iastore
       310: goto          314
       313: astore_0
       314: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       317: getstatic     #87                 // Field ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
       320: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       323: iconst_4
       324: iastore
       325: goto          329
       328: astore_0
       329: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       332: getstatic     #90                 // Field ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
       335: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       338: iconst_5
       339: iastore
       340: goto          344
       343: astore_0
       344: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       347: getstatic     #93                 // Field ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
       350: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       353: bipush        6
       355: iastore
       356: goto          360
       359: astore_0
       360: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       363: getstatic     #96                 // Field ext/mods/gameserver/enums/IntentionType.INTERACT:Lext/mods/gameserver/enums/IntentionType;
       366: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       369: bipush        7
       371: iastore
       372: goto          376
       375: astore_0
       376: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       379: getstatic     #99                 // Field ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
       382: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       385: bipush        8
       387: iastore
       388: goto          392
       391: astore_0
       392: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       395: getstatic     #102                // Field ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
       398: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       401: bipush        9
       403: iastore
       404: goto          408
       407: astore_0
       408: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       411: getstatic     #105                // Field ext/mods/gameserver/enums/IntentionType.NOTHING:Lext/mods/gameserver/enums/IntentionType;
       414: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       417: bipush        10
       419: iastore
       420: goto          424
       423: astore_0
       424: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       427: getstatic     #108                // Field ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
       430: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       433: bipush        11
       435: iastore
       436: goto          440
       439: astore_0
       440: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       443: getstatic     #111                // Field ext/mods/gameserver/enums/IntentionType.SIT:Lext/mods/gameserver/enums/IntentionType;
       446: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       449: bipush        12
       451: iastore
       452: goto          456
       455: astore_0
       456: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       459: getstatic     #114                // Field ext/mods/gameserver/enums/IntentionType.SOCIAL:Lext/mods/gameserver/enums/IntentionType;
       462: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       465: bipush        13
       467: iastore
       468: goto          472
       471: astore_0
       472: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       475: getstatic     #117                // Field ext/mods/gameserver/enums/IntentionType.STAND:Lext/mods/gameserver/enums/IntentionType;
       478: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       481: bipush        14
       483: iastore
       484: goto          488
       487: astore_0
       488: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       491: getstatic     #120                // Field ext/mods/gameserver/enums/IntentionType.USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
       494: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       497: bipush        15
       499: iastore
       500: goto          504
       503: astore_0
       504: getstatic     #73                 // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       507: getstatic     #123                // Field ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
       510: invokevirtual #80                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       513: bipush        16
       515: iastore
       516: goto          520
       519: astore_0
       520: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            54    65    68   Class java/lang/NoSuchFieldError
            69    80    83   Class java/lang/NoSuchFieldError
            84    96    99   Class java/lang/NoSuchFieldError
           100   112   115   Class java/lang/NoSuchFieldError
           116   128   131   Class java/lang/NoSuchFieldError
           132   144   147   Class java/lang/NoSuchFieldError
           148   160   163   Class java/lang/NoSuchFieldError
           164   176   179   Class java/lang/NoSuchFieldError
           180   192   195   Class java/lang/NoSuchFieldError
           196   208   211   Class java/lang/NoSuchFieldError
           212   224   227   Class java/lang/NoSuchFieldError
           228   240   243   Class java/lang/NoSuchFieldError
           244   256   259   Class java/lang/NoSuchFieldError
           269   280   283   Class java/lang/NoSuchFieldError
           284   295   298   Class java/lang/NoSuchFieldError
           299   310   313   Class java/lang/NoSuchFieldError
           314   325   328   Class java/lang/NoSuchFieldError
           329   340   343   Class java/lang/NoSuchFieldError
           344   356   359   Class java/lang/NoSuchFieldError
           360   372   375   Class java/lang/NoSuchFieldError
           376   388   391   Class java/lang/NoSuchFieldError
           392   404   407   Class java/lang/NoSuchFieldError
           408   420   423   Class java/lang/NoSuchFieldError
           424   436   439   Class java/lang/NoSuchFieldError
           440   452   455   Class java/lang/NoSuchFieldError
           456   468   471   Class java/lang/NoSuchFieldError
           472   484   487   Class java/lang/NoSuchFieldError
           488   500   503   Class java/lang/NoSuchFieldError
           504   516   519   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 385: 0
        line 304: 260
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 64
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "AbstractAI.java"
EnclosingMethod: #137.#0                // ext.mods.gameserver.model.actor.ai.type.AbstractAI
NestHost: class ext/mods/gameserver/model/actor/ai/type/AbstractAI
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/ai/type/AbstractAI$1
