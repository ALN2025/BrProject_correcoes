// Bytecode for: ext.mods.gameserver.data.manager.FenceManager
// File: ext\mods\gameserver\data\manager\FenceManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/FenceManager.class
  Last modified 9 de jul de 2026; size 4336 bytes
  MD5 checksum 4ca583d1a66244751f6dd19a6bad6d12
  Compiled from "FenceManager.java"
public class ext.mods.gameserver.data.manager.FenceManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/FenceManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 7, attributes: 3
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/FenceManager._fences:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/FenceManager
   #12 = NameAndType        #14:#15       // _fences:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/manager/FenceManager
   #14 = Utf8               _fences
   #15 = Utf8               Ljava/util/List;
   #16 = Methodref          #17.#18       // ext/mods/gameserver/model/World.isOutOfWorld:(IIII)Z
   #17 = Class              #19           // ext/mods/gameserver/model/World
   #18 = NameAndType        #20:#21       // isOutOfWorld:(IIII)Z
   #19 = Utf8               ext/mods/gameserver/model/World
   #20 = Utf8               isOutOfWorld
   #21 = Utf8               (IIII)Z
   #22 = Fieldref           #11.#23       // ext/mods/gameserver/data/manager/FenceManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #23 = NameAndType        #24:#25       // LOGGER:Lext/mods/commons/logging/CLogger;
   #24 = Utf8               LOGGER
   #25 = Utf8               Lext/mods/commons/logging/CLogger;
   #26 = String             #27           // Fence coords are outside of world.
   #27 = Utf8               Fence coords are outside of world.
   #28 = Methodref          #29.#30       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
   #29 = Class              #31           // ext/mods/commons/logging/CLogger
   #30 = NameAndType        #32:#33       // error:(Ljava/lang/Object;)V
   #31 = Utf8               ext/mods/commons/logging/CLogger
   #32 = Utf8               error
   #33 = Utf8               (Ljava/lang/Object;)V
   #34 = Methodref          #11.#35       // ext/mods/gameserver/data/manager/FenceManager.getFenceSize:(I)Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
   #35 = NameAndType        #36:#37       // getFenceSize:(I)Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
   #36 = Utf8               getFenceSize
   #37 = Utf8               (I)Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
   #38 = String             #39           // Unknown dimensions for fence, x={} y={}.
   #39 = Utf8               Unknown dimensions for fence, x={} y={}.
   #40 = Methodref          #41.#42       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #41 = Class              #43           // java/lang/Integer
   #42 = NameAndType        #44:#45       // valueOf:(I)Ljava/lang/Integer;
   #43 = Utf8               java/lang/Integer
   #44 = Utf8               valueOf
   #45 = Utf8               (I)Ljava/lang/Integer;
   #46 = Methodref          #29.#47       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #47 = NameAndType        #48:#49       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #48 = Utf8               warn
   #49 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #50 = Fieldref           #51.#52       // ext/mods/gameserver/data/manager/FenceManager$FenceSize._offset:I
   #51 = Class              #53           // ext/mods/gameserver/data/manager/FenceManager$FenceSize
   #52 = NameAndType        #54:#55       // _offset:I
   #53 = Utf8               ext/mods/gameserver/data/manager/FenceManager$FenceSize
   #54 = Utf8               _offset
   #55 = Utf8               I
   #56 = Fieldref           #51.#57       // ext/mods/gameserver/data/manager/FenceManager$FenceSize._geoDataSize:I
   #57 = NameAndType        #58:#55       // _geoDataSize:I
   #58 = Utf8               _geoDataSize
   #59 = Methodref          #60.#61       // ext/mods/gameserver/geoengine/GeoEngine.getGeoX:(I)I
   #60 = Class              #62           // ext/mods/gameserver/geoengine/GeoEngine
   #61 = NameAndType        #63:#64       // getGeoX:(I)I
   #62 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #63 = Utf8               getGeoX
   #64 = Utf8               (I)I
   #65 = Methodref          #60.#66       // ext/mods/gameserver/geoengine/GeoEngine.getGeoY:(I)I
   #66 = NameAndType        #67:#64       // getGeoY:(I)I
   #67 = Utf8               getGeoY
   #68 = Methodref          #60.#69       // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #69 = NameAndType        #70:#71       // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #70 = Utf8               getInstance
   #71 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #72 = Methodref          #60.#73       // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
   #73 = NameAndType        #74:#75       // getHeight:(III)S
   #74 = Utf8               getHeight
   #75 = Utf8               (III)S
   #76 = Class              #77           // "[[Z"
   #77 = Utf8               [[Z
   #78 = Methodref          #60.#79       // ext/mods/gameserver/geoengine/GeoEngine.calculateGeoObject:([[Z)[[B
   #79 = NameAndType        #80:#81       // calculateGeoObject:([[Z)[[B
   #80 = Utf8               calculateGeoObject
   #81 = Utf8               ([[Z)[[B
   #82 = Class              #83           // ext/mods/gameserver/model/actor/instance/Fence
   #83 = Utf8               ext/mods/gameserver/model/actor/instance/Fence
   #84 = Methodref          #82.#85       // ext/mods/gameserver/model/actor/instance/Fence."<init>":(IIIIIII[[B)V
   #85 = NameAndType        #5:#86        // "<init>":(IIIIIII[[B)V
   #86 = Utf8               (IIIIIII[[B)V
   #87 = Methodref          #82.#88       // ext/mods/gameserver/model/actor/instance/Fence.spawnMe:(III)V
   #88 = NameAndType        #89:#90       // spawnMe:(III)V
   #89 = Utf8               spawnMe
   #90 = Utf8               (III)V
   #91 = Methodref          #60.#92       // ext/mods/gameserver/geoengine/GeoEngine.addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #92 = NameAndType        #93:#94       // addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #93 = Utf8               addGeoObject
   #94 = Utf8               (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #95 = InterfaceMethodref #96.#97       // java/util/List.add:(Ljava/lang/Object;)Z
   #96 = Class              #98           // java/util/List
   #97 = NameAndType        #99:#100      // add:(Ljava/lang/Object;)Z
   #98 = Utf8               java/util/List
   #99 = Utf8               add
  #100 = Utf8               (Ljava/lang/Object;)Z
  #101 = Methodref          #82.#102      // ext/mods/gameserver/model/actor/instance/Fence.decayMe:()V
  #102 = NameAndType        #103:#6       // decayMe:()V
  #103 = Utf8               decayMe
  #104 = Methodref          #60.#105      // ext/mods/gameserver/geoengine/GeoEngine.removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #105 = NameAndType        #106:#94      // removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #106 = Utf8               removeGeoObject
  #107 = InterfaceMethodref #96.#108      // java/util/List.remove:(Ljava/lang/Object;)Z
  #108 = NameAndType        #109:#100     // remove:(Ljava/lang/Object;)Z
  #109 = Utf8               remove
  #110 = Fieldref           #51.#111      // ext/mods/gameserver/data/manager/FenceManager$FenceSize.SIZE_100:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #111 = NameAndType        #112:#113     // SIZE_100:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #112 = Utf8               SIZE_100
  #113 = Utf8               Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #114 = Fieldref           #51.#115      // ext/mods/gameserver/data/manager/FenceManager$FenceSize.SIZE_200:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #115 = NameAndType        #116:#113     // SIZE_200:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #116 = Utf8               SIZE_200
  #117 = Fieldref           #51.#118      // ext/mods/gameserver/data/manager/FenceManager$FenceSize.SIZE_300:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #118 = NameAndType        #119:#113     // SIZE_300:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #119 = Utf8               SIZE_300
  #120 = Fieldref           #51.#121      // ext/mods/gameserver/data/manager/FenceManager$FenceSize.SIZE_400:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #121 = NameAndType        #122:#113     // SIZE_400:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #122 = Utf8               SIZE_400
  #123 = Fieldref           #51.#124      // ext/mods/gameserver/data/manager/FenceManager$FenceSize.SIZE_500:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #124 = NameAndType        #125:#113     // SIZE_500:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #125 = Utf8               SIZE_500
  #126 = Fieldref           #51.#127      // ext/mods/gameserver/data/manager/FenceManager$FenceSize.SIZE_600:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #127 = NameAndType        #128:#113     // SIZE_600:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #128 = Utf8               SIZE_600
  #129 = Fieldref           #51.#130      // ext/mods/gameserver/data/manager/FenceManager$FenceSize.SIZE_700:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #130 = NameAndType        #131:#113     // SIZE_700:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #131 = Utf8               SIZE_700
  #132 = Fieldref           #51.#133      // ext/mods/gameserver/data/manager/FenceManager$FenceSize.SIZE_800:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #133 = NameAndType        #134:#113     // SIZE_800:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #134 = Utf8               SIZE_800
  #135 = Fieldref           #51.#136      // ext/mods/gameserver/data/manager/FenceManager$FenceSize.SIZE_900:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #136 = NameAndType        #137:#113     // SIZE_900:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #137 = Utf8               SIZE_900
  #138 = Fieldref           #51.#139      // ext/mods/gameserver/data/manager/FenceManager$FenceSize.SIZE_1000:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #139 = NameAndType        #140:#113     // SIZE_1000:Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
  #140 = Utf8               SIZE_1000
  #141 = Fieldref           #142.#143     // ext/mods/gameserver/data/manager/FenceManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/FenceManager;
  #142 = Class              #144          // ext/mods/gameserver/data/manager/FenceManager$SingletonHolder
  #143 = NameAndType        #145:#146     // INSTANCE:Lext/mods/gameserver/data/manager/FenceManager;
  #144 = Utf8               ext/mods/gameserver/data/manager/FenceManager$SingletonHolder
  #145 = Utf8               INSTANCE
  #146 = Utf8               Lext/mods/gameserver/data/manager/FenceManager;
  #147 = Methodref          #148.#149     // java/lang/Class.getName:()Ljava/lang/String;
  #148 = Class              #150          // java/lang/Class
  #149 = NameAndType        #151:#152     // getName:()Ljava/lang/String;
  #150 = Utf8               java/lang/Class
  #151 = Utf8               getName
  #152 = Utf8               ()Ljava/lang/String;
  #153 = Methodref          #29.#154      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #154 = NameAndType        #5:#155       // "<init>":(Ljava/lang/String;)V
  #155 = Utf8               (Ljava/lang/String;)V
  #156 = Utf8               Signature
  #157 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Fence;>;
  #158 = Utf8               Code
  #159 = Utf8               LineNumberTable
  #160 = Utf8               LocalVariableTable
  #161 = Utf8               this
  #162 = Utf8               getFences
  #163 = Utf8               ()Ljava/util/List;
  #164 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Fence;>;
  #165 = Utf8               addFence
  #166 = Utf8               (IIIIIII)Lext/mods/gameserver/model/actor/instance/Fence;
  #167 = Utf8               iy
  #168 = Utf8               ix
  #169 = Utf8               x
  #170 = Utf8               y
  #171 = Utf8               z
  #172 = Utf8               type
  #173 = Utf8               sizeX
  #174 = Utf8               sizeY
  #175 = Utf8               height
  #176 = Utf8               fsx
  #177 = Utf8               fsy
  #178 = Utf8               sx
  #179 = Utf8               sy
  #180 = Utf8               geoX
  #181 = Utf8               geoY
  #182 = Utf8               geoZ
  #183 = Utf8               inside
  #184 = Utf8               geoData
  #185 = Utf8               [[B
  #186 = Utf8               fence
  #187 = Utf8               Lext/mods/gameserver/model/actor/instance/Fence;
  #188 = Utf8               StackMapTable
  #189 = Class              #190          // "[Z"
  #190 = Utf8               [Z
  #191 = Utf8               removeFence
  #192 = Utf8               (Lext/mods/gameserver/model/actor/instance/Fence;)V
  #193 = Utf8               size
  #194 = Utf8               ()Lext/mods/gameserver/data/manager/FenceManager;
  #195 = Utf8               <clinit>
  #196 = Utf8               SourceFile
  #197 = Utf8               FenceManager.java
  #198 = Utf8               NestMembers
  #199 = Utf8               InnerClasses
  #200 = Utf8               FenceSize
  #201 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.data.manager.FenceManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _fences:Ljava/util/List;
        15: return
      LineNumberTable:
        line 70: 0
        line 67: 4
        line 71: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/manager/FenceManager;

  public final java.util.List<ext.mods.gameserver.model.actor.instance.Fence> getFences();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _fences:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/FenceManager;
    Signature: #164                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Fence;>;

  public final ext.mods.gameserver.model.actor.instance.Fence addFence(int, int, int, int, int, int, int);
    descriptor: (IIIIIII)Lext/mods/gameserver/model/actor/instance/Fence;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=18, args_size=8
         0: iload_1
         1: iload_1
         2: iload         5
         4: iadd
         5: iload_2
         6: iload_2
         7: iload         6
         9: iadd
        10: invokestatic  #16                 // Method ext/mods/gameserver/model/World.isOutOfWorld:(IIII)Z
        13: ifeq          26
        16: getstatic     #22                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        19: ldc           #26                 // String Fence coords are outside of world.
        21: invokevirtual #28                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
        24: aconst_null
        25: areturn
        26: iload         5
        28: invokestatic  #34                 // Method getFenceSize:(I)Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
        31: astore        8
        33: iload         6
        35: invokestatic  #34                 // Method getFenceSize:(I)Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
        38: astore        9
        40: aload         8
        42: ifnull        50
        45: aload         9
        47: ifnonnull     80
        50: getstatic     #22                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        53: ldc           #38                 // String Unknown dimensions for fence, x={} y={}.
        55: iconst_2
        56: anewarray     #2                  // class java/lang/Object
        59: dup
        60: iconst_0
        61: iload         5
        63: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        66: aastore
        67: dup
        68: iconst_1
        69: iload         6
        71: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        74: aastore
        75: invokevirtual #46                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        78: aconst_null
        79: areturn
        80: iload_1
        81: bipush        -16
        83: aload         8
        85: getfield      #50                 // Field ext/mods/gameserver/data/manager/FenceManager$FenceSize._offset:I
        88: iadd
        89: iand
        90: istore_1
        91: iload_2
        92: bipush        -16
        94: aload         9
        96: getfield      #50                 // Field ext/mods/gameserver/data/manager/FenceManager$FenceSize._offset:I
        99: iadd
       100: iand
       101: istore_2
       102: aload         8
       104: getfield      #56                 // Field ext/mods/gameserver/data/manager/FenceManager$FenceSize._geoDataSize:I
       107: istore        10
       109: aload         9
       111: getfield      #56                 // Field ext/mods/gameserver/data/manager/FenceManager$FenceSize._geoDataSize:I
       114: istore        11
       116: iload_1
       117: invokestatic  #59                 // Method ext/mods/gameserver/geoengine/GeoEngine.getGeoX:(I)I
       120: iload         10
       122: iconst_2
       123: idiv
       124: isub
       125: istore        12
       127: iload_2
       128: invokestatic  #65                 // Method ext/mods/gameserver/geoengine/GeoEngine.getGeoY:(I)I
       131: iload         11
       133: iconst_2
       134: idiv
       135: isub
       136: istore        13
       138: invokestatic  #68                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       141: iload_1
       142: iload_2
       143: iload_3
       144: invokevirtual #72                 // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       147: istore        14
       149: iload         10
       151: iload         11
       153: multianewarray #76,  2            // class "[[Z"
       157: astore        15
       159: iconst_1
       160: istore        16
       162: iload         16
       164: iload         10
       166: iconst_1
       167: isub
       168: if_icmpge     290
       171: iconst_1
       172: istore        17
       174: iload         17
       176: iload         11
       178: iconst_1
       179: isub
       180: if_icmpge     284
       183: iload         4
       185: iconst_2
       186: if_icmpne     235
       189: aload         15
       191: iload         16
       193: aaload
       194: iload         17
       196: iload         16
       198: iconst_3
       199: if_icmplt     226
       202: iload         16
       204: iload         10
       206: iconst_3
       207: isub
       208: if_icmpge     226
       211: iload         17
       213: iconst_3
       214: if_icmplt     226
       217: iload         17
       219: iload         11
       221: iconst_3
       222: isub
       223: if_icmplt     230
       226: iconst_1
       227: goto          231
       230: iconst_0
       231: bastore
       232: goto          278
       235: aload         15
       237: iload         16
       239: aaload
       240: iload         17
       242: iload         16
       244: iconst_3
       245: if_icmplt     257
       248: iload         16
       250: iload         10
       252: iconst_3
       253: isub
       254: if_icmplt     276
       257: iload         17
       259: iconst_3
       260: if_icmplt     272
       263: iload         17
       265: iload         11
       267: iconst_3
       268: isub
       269: if_icmplt     276
       272: iconst_1
       273: goto          277
       276: iconst_0
       277: bastore
       278: iinc          17, 1
       281: goto          174
       284: iinc          16, 1
       287: goto          162
       290: aload         15
       292: invokestatic  #78                 // Method ext/mods/gameserver/geoengine/GeoEngine.calculateGeoObject:([[Z)[[B
       295: astore        16
       297: new           #82                 // class ext/mods/gameserver/model/actor/instance/Fence
       300: dup
       301: iload         4
       303: iload         5
       305: iload         6
       307: iload         7
       309: iload         12
       311: iload         13
       313: iload         14
       315: aload         16
       317: invokespecial #84                 // Method ext/mods/gameserver/model/actor/instance/Fence."<init>":(IIIIIII[[B)V
       320: astore        17
       322: aload         17
       324: iload_1
       325: iload_2
       326: iload_3
       327: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/instance/Fence.spawnMe:(III)V
       330: invokestatic  #68                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       333: aload         17
       335: invokevirtual #91                 // Method ext/mods/gameserver/geoengine/GeoEngine.addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
       338: aload_0
       339: getfield      #10                 // Field _fences:Ljava/util/List;
       342: aload         17
       344: invokeinterface #95,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       349: pop
       350: aload         17
       352: areturn
      LineNumberTable:
        line 95: 0
        line 97: 16
        line 98: 24
        line 101: 26
        line 102: 33
        line 104: 40
        line 106: 50
        line 107: 78
        line 110: 80
        line 111: 91
        line 113: 102
        line 114: 109
        line 116: 116
        line 117: 127
        line 118: 138
        line 120: 149
        line 121: 159
        line 122: 171
        line 123: 183
        line 124: 189
        line 126: 235
        line 122: 278
        line 121: 284
        line 127: 290
        line 129: 297
        line 131: 322
        line 133: 330
        line 134: 338
        line 136: 350
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          174     110    17    iy   I
          162     128    16    ix   I
            0     353     0  this   Lext/mods/gameserver/data/manager/FenceManager;
            0     353     1     x   I
            0     353     2     y   I
            0     353     3     z   I
            0     353     4  type   I
            0     353     5 sizeX   I
            0     353     6 sizeY   I
            0     353     7 height   I
           33     320     8   fsx   Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
           40     313     9   fsy   Lext/mods/gameserver/data/manager/FenceManager$FenceSize;
          109     244    10    sx   I
          116     237    11    sy   I
          127     226    12  geoX   I
          138     215    13  geoY   I
          149     204    14  geoZ   I
          159     194    15 inside   [[Z
          297      56    16 geoData   [[B
          322      31    17 fence   Lext/mods/gameserver/model/actor/instance/Fence;
      StackMapTable: number_of_entries = 16
        frame_type = 26 /* same */
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/data/manager/FenceManager$FenceSize, class ext/mods/gameserver/data/manager/FenceManager$FenceSize ]
        frame_type = 29 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 81
          locals = [ class ext/mods/gameserver/data/manager/FenceManager, int, int, int, int, int, int, int, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, int, int, int, int, int, class "[[Z", int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/data/manager/FenceManager, int, int, int, int, int, int, int, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, int, int, int, int, int, class "[[Z", int, int ]
          stack = [ class "[Z", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/data/manager/FenceManager, int, int, int, int, int, int, int, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, int, int, int, int, int, class "[[Z", int, int ]
          stack = [ class "[Z", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/manager/FenceManager, int, int, int, int, int, int, int, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, int, int, int, int, int, class "[[Z", int, int ]
          stack = [ class "[Z", int, int ]
        frame_type = 3 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/data/manager/FenceManager, int, int, int, int, int, int, int, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, int, int, int, int, int, class "[[Z", int, int ]
          stack = [ class "[Z", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/FenceManager, int, int, int, int, int, int, int, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, int, int, int, int, int, class "[[Z", int, int ]
          stack = [ class "[Z", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/data/manager/FenceManager, int, int, int, int, int, int, int, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, int, int, int, int, int, class "[[Z", int, int ]
          stack = [ class "[Z", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/manager/FenceManager, int, int, int, int, int, int, int, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, class ext/mods/gameserver/data/manager/FenceManager$FenceSize, int, int, int, int, int, class "[[Z", int, int ]
          stack = [ class "[Z", int, int ]
        frame_type = 0 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 5

  public final void removeFence(ext.mods.gameserver.model.actor.instance.Fence);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Fence;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #101                // Method ext/mods/gameserver/model/actor/instance/Fence.decayMe:()V
         4: invokestatic  #68                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
         7: aload_1
         8: invokevirtual #104                // Method ext/mods/gameserver/geoengine/GeoEngine.removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
        11: aload_0
        12: getfield      #10                 // Field _fences:Ljava/util/List;
        15: aload_1
        16: invokeinterface #107,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        21: pop
        22: return
      LineNumberTable:
        line 145: 0
        line 147: 4
        line 148: 11
        line 149: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/manager/FenceManager;
            0      23     1 fence   Lext/mods/gameserver/model/actor/instance/Fence;

  public static ext.mods.gameserver.data.manager.FenceManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/FenceManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #141                // Field ext/mods/gameserver/data/manager/FenceManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/FenceManager;
         3: areturn
      LineNumberTable:
        line 193: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #29                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/FenceManager
         6: invokevirtual #147                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #153                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #22                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "FenceManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/FenceManager$SingletonHolder
  ext/mods/gameserver/data/manager/FenceManager$FenceSize
