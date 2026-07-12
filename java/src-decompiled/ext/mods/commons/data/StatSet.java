// Bytecode for: ext.mods.commons.data.StatSet
// File: ext\mods\commons\data\StatSet.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/data/StatSet.class
  Last modified 9 de jul de 2026; size 18393 bytes
  MD5 checksum b6bab460e5ffa225be87f7a8008d13da
  Compiled from "StatSet.java"
public class ext.mods.commons.data.StatSet extends java.util.HashMap<java.lang.String, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/commons/data/StatSet
  super_class: #2                         // java/util/HashMap
  interfaces: 0, fields: 0, methods: 49, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/util/HashMap."<init>":()V
    #2 = Class              #4            // java/util/HashMap
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/HashMap
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #2.#8         // java/util/HashMap."<init>":(I)V
    #8 = NameAndType        #5:#9         // "<init>":(I)V
    #9 = Utf8               (I)V
   #10 = Methodref          #2.#11        // java/util/HashMap."<init>":(Ljava/util/Map;)V
   #11 = NameAndType        #5:#12        // "<init>":(Ljava/util/Map;)V
   #12 = Utf8               (Ljava/util/Map;)V
   #13 = Methodref          #14.#15       // ext/mods/commons/data/StatSet.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #14 = Class              #16           // ext/mods/commons/data/StatSet
   #15 = NameAndType        #17:#18       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #16 = Utf8               ext/mods/commons/data/StatSet
   #17 = Utf8               put
   #18 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #19 = Fieldref           #20.#21       // java/lang/Boolean.TRUE:Ljava/lang/Boolean;
   #20 = Class              #22           // java/lang/Boolean
   #21 = NameAndType        #23:#24       // TRUE:Ljava/lang/Boolean;
   #22 = Utf8               java/lang/Boolean
   #23 = Utf8               TRUE
   #24 = Utf8               Ljava/lang/Boolean;
   #25 = Fieldref           #20.#26       // java/lang/Boolean.FALSE:Ljava/lang/Boolean;
   #26 = NameAndType        #27:#24       // FALSE:Ljava/lang/Boolean;
   #27 = Utf8               FALSE
   #28 = Methodref          #29.#30       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #29 = Class              #31           // java/lang/Integer
   #30 = NameAndType        #32:#33       // valueOf:(I)Ljava/lang/Integer;
   #31 = Utf8               java/lang/Integer
   #32 = Utf8               valueOf
   #33 = Utf8               (I)Ljava/lang/Integer;
   #34 = Methodref          #35.#36       // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #35 = Class              #37           // java/lang/Long
   #36 = NameAndType        #32:#38       // valueOf:(J)Ljava/lang/Long;
   #37 = Utf8               java/lang/Long
   #38 = Utf8               (J)Ljava/lang/Long;
   #39 = Methodref          #40.#41       // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #40 = Class              #42           // java/lang/Double
   #41 = NameAndType        #32:#43       // valueOf:(D)Ljava/lang/Double;
   #42 = Utf8               java/lang/Double
   #43 = Utf8               (D)Ljava/lang/Double;
   #44 = Methodref          #14.#45       // ext/mods/commons/data/StatSet.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #45 = NameAndType        #46:#47       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #46 = Utf8               remove
   #47 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #48 = Methodref          #14.#49       // ext/mods/commons/data/StatSet.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #49 = NameAndType        #50:#47       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #50 = Utf8               get
   #51 = Methodref          #20.#52       // java/lang/Boolean.booleanValue:()Z
   #52 = NameAndType        #53:#54       // booleanValue:()Z
   #53 = Utf8               booleanValue
   #54 = Utf8               ()Z
   #55 = Class              #56           // java/lang/String
   #56 = Utf8               java/lang/String
   #57 = Methodref          #20.#58       // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
   #58 = NameAndType        #59:#60       // parseBoolean:(Ljava/lang/String;)Z
   #59 = Utf8               parseBoolean
   #60 = Utf8               (Ljava/lang/String;)Z
   #61 = Class              #62           // java/lang/Number
   #62 = Utf8               java/lang/Number
   #63 = Methodref          #61.#64       // java/lang/Number.intValue:()I
   #64 = NameAndType        #65:#66       // intValue:()I
   #65 = Utf8               intValue
   #66 = Utf8               ()I
   #67 = Class              #68           // java/lang/IllegalArgumentException
   #68 = Utf8               java/lang/IllegalArgumentException
   #69 = Methodref          #55.#70       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #70 = NameAndType        #32:#71       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #71 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #72 = InvokeDynamic      #0:#73        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #73 = NameAndType        #74:#75       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #74 = Utf8               makeConcatWithConstants
   #75 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #76 = Methodref          #67.#77       // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
   #77 = NameAndType        #5:#78        // "<init>":(Ljava/lang/String;)V
   #78 = Utf8               (Ljava/lang/String;)V
   #79 = Methodref          #61.#80       // java/lang/Number.byteValue:()B
   #80 = NameAndType        #81:#82       // byteValue:()B
   #81 = Utf8               byteValue
   #82 = Utf8               ()B
   #83 = Methodref          #84.#85       // java/lang/Byte.parseByte:(Ljava/lang/String;)B
   #84 = Class              #86           // java/lang/Byte
   #85 = NameAndType        #87:#88       // parseByte:(Ljava/lang/String;)B
   #86 = Utf8               java/lang/Byte
   #87 = Utf8               parseByte
   #88 = Utf8               (Ljava/lang/String;)B
   #89 = InvokeDynamic      #1:#73        // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #90 = Methodref          #61.#91       // java/lang/Number.doubleValue:()D
   #91 = NameAndType        #92:#93       // doubleValue:()D
   #92 = Utf8               doubleValue
   #93 = Utf8               ()D
   #94 = Methodref          #40.#95       // java/lang/Double.parseDouble:(Ljava/lang/String;)D
   #95 = NameAndType        #96:#97       // parseDouble:(Ljava/lang/String;)D
   #96 = Utf8               parseDouble
   #97 = Utf8               (Ljava/lang/String;)D
   #98 = Methodref          #20.#99       // java/lang/Boolean.equals:(Ljava/lang/Object;)Z
   #99 = NameAndType        #100:#101     // equals:(Ljava/lang/Object;)Z
  #100 = Utf8               equals
  #101 = Utf8               (Ljava/lang/Object;)Z
  #102 = InvokeDynamic      #2:#73        // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #103 = Class              #104          // "[D"
  #104 = Utf8               [D
  #105 = String             #106          // ;
  #106 = Utf8               ;
  #107 = Methodref          #55.#108      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #108 = NameAndType        #109:#110     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #109 = Utf8               split
  #110 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #111 = InterfaceMethodref #112.#113     // java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #112 = Class              #114          // java/util/stream/Stream
  #113 = NameAndType        #115:#116     // of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #114 = Utf8               java/util/stream/Stream
  #115 = Utf8               of
  #116 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #117 = InvokeDynamic      #3:#118       // #3:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
  #118 = NameAndType        #119:#120     // applyAsDouble:()Ljava/util/function/ToDoubleFunction;
  #119 = Utf8               applyAsDouble
  #120 = Utf8               ()Ljava/util/function/ToDoubleFunction;
  #121 = InterfaceMethodref #112.#122     // java/util/stream/Stream.mapToDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;
  #122 = NameAndType        #123:#124     // mapToDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;
  #123 = Utf8               mapToDouble
  #124 = Utf8               (Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;
  #125 = InterfaceMethodref #126.#127     // java/util/stream/DoubleStream.toArray:()[D
  #126 = Class              #128          // java/util/stream/DoubleStream
  #127 = NameAndType        #129:#130     // toArray:()[D
  #128 = Utf8               java/util/stream/DoubleStream
  #129 = Utf8               toArray
  #130 = Utf8               ()[D
  #131 = InvokeDynamic      #4:#73        // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #132 = Methodref          #61.#133      // java/lang/Number.floatValue:()F
  #133 = NameAndType        #134:#135     // floatValue:()F
  #134 = Utf8               floatValue
  #135 = Utf8               ()F
  #136 = Methodref          #137.#138     // java/lang/Float.parseFloat:(Ljava/lang/String;)F
  #137 = Class              #139          // java/lang/Float
  #138 = NameAndType        #140:#141     // parseFloat:(Ljava/lang/String;)F
  #139 = Utf8               java/lang/Float
  #140 = Utf8               parseFloat
  #141 = Utf8               (Ljava/lang/String;)F
  #142 = InvokeDynamic      #5:#73        // #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #143 = Methodref          #29.#144      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #144 = NameAndType        #145:#146     // parseInt:(Ljava/lang/String;)I
  #145 = Utf8               parseInt
  #146 = Utf8               (Ljava/lang/String;)I
  #147 = InvokeDynamic      #6:#73        // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #148 = Class              #149          // "[I"
  #149 = Utf8               [I
  #150 = InvokeDynamic      #7:#151       // #7:applyAsInt:()Ljava/util/function/ToIntFunction;
  #151 = NameAndType        #152:#153     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #152 = Utf8               applyAsInt
  #153 = Utf8               ()Ljava/util/function/ToIntFunction;
  #154 = InterfaceMethodref #112.#155     // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #155 = NameAndType        #156:#157     // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #156 = Utf8               mapToInt
  #157 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #158 = InterfaceMethodref #159.#160     // java/util/stream/IntStream.toArray:()[I
  #159 = Class              #161          // java/util/stream/IntStream
  #160 = NameAndType        #129:#162     // toArray:()[I
  #161 = Utf8               java/util/stream/IntStream
  #162 = Utf8               ()[I
  #163 = InvokeDynamic      #8:#73        // #8:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #164 = Methodref          #14.#165      // ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
  #165 = NameAndType        #166:#167     // getIntegerArray:(Ljava/lang/String;)[I
  #166 = Utf8               getIntegerArray
  #167 = Utf8               (Ljava/lang/String;)[I
  #168 = Methodref          #169.#170     // java/util/Collections.emptyList:()Ljava/util/List;
  #169 = Class              #171          // java/util/Collections
  #170 = NameAndType        #172:#173     // emptyList:()Ljava/util/List;
  #171 = Utf8               java/util/Collections
  #172 = Utf8               emptyList
  #173 = Utf8               ()Ljava/util/List;
  #174 = Class              #175          // java/util/List
  #175 = Utf8               java/util/List
  #176 = Methodref          #61.#177      // java/lang/Number.longValue:()J
  #177 = NameAndType        #178:#179     // longValue:()J
  #178 = Utf8               longValue
  #179 = Utf8               ()J
  #180 = Methodref          #35.#181      // java/lang/Long.parseLong:(Ljava/lang/String;)J
  #181 = NameAndType        #182:#183     // parseLong:(Ljava/lang/String;)J
  #182 = Utf8               parseLong
  #183 = Utf8               (Ljava/lang/String;)J
  #184 = InvokeDynamic      #9:#73        // #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #185 = Class              #186          // "[J"
  #186 = Utf8               [J
  #187 = InvokeDynamic      #10:#188      // #10:applyAsLong:()Ljava/util/function/ToLongFunction;
  #188 = NameAndType        #189:#190     // applyAsLong:()Ljava/util/function/ToLongFunction;
  #189 = Utf8               applyAsLong
  #190 = Utf8               ()Ljava/util/function/ToLongFunction;
  #191 = InterfaceMethodref #112.#192     // java/util/stream/Stream.mapToLong:(Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;
  #192 = NameAndType        #193:#194     // mapToLong:(Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;
  #193 = Utf8               mapToLong
  #194 = Utf8               (Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;
  #195 = InterfaceMethodref #196.#197     // java/util/stream/LongStream.toArray:()[J
  #196 = Class              #198          // java/util/stream/LongStream
  #197 = NameAndType        #129:#199     // toArray:()[J
  #198 = Utf8               java/util/stream/LongStream
  #199 = Utf8               ()[J
  #200 = InvokeDynamic      #11:#73       // #11:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #201 = Methodref          #169.#202     // java/util/Collections.emptyMap:()Ljava/util/Map;
  #202 = NameAndType        #203:#204     // emptyMap:()Ljava/util/Map;
  #203 = Utf8               emptyMap
  #204 = Utf8               ()Ljava/util/Map;
  #205 = Class              #206          // java/util/Map
  #206 = Utf8               java/util/Map
  #207 = InvokeDynamic      #12:#208      // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #208 = NameAndType        #74:#209      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #209 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #210 = Methodref          #14.#211      // ext/mods/commons/data/StatSet.getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
  #211 = NameAndType        #212:#110     // getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
  #212 = Utf8               getStringArray
  #213 = Class              #214          // java/lang/Exception
  #214 = Utf8               java/lang/Exception
  #215 = Class              #216          // "[Ljava/lang/String;"
  #216 = Utf8               [Ljava/lang/String;
  #217 = InvokeDynamic      #13:#73       // #13:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #218 = Methodref          #14.#219      // ext/mods/commons/data/StatSet.getLocation:(Ljava/lang/String;)Lext/mods/gameserver/model/location/Location;
  #219 = NameAndType        #220:#221     // getLocation:(Ljava/lang/String;)Lext/mods/gameserver/model/location/Location;
  #220 = Utf8               getLocation
  #221 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/location/Location;
  #222 = Class              #223          // ext/mods/gameserver/model/location/Location
  #223 = Utf8               ext/mods/gameserver/model/location/Location
  #224 = Methodref          #225.#226     // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #225 = Class              #227          // java/util/Arrays
  #226 = NameAndType        #228:#116     // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #227 = Utf8               java/util/Arrays
  #228 = Utf8               stream
  #229 = InvokeDynamic      #14:#230      // #14:apply:()Ljava/util/function/Function;
  #230 = NameAndType        #231:#232     // apply:()Ljava/util/function/Function;
  #231 = Utf8               apply
  #232 = Utf8               ()Ljava/util/function/Function;
  #233 = InterfaceMethodref #112.#234     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #234 = NameAndType        #235:#236     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #235 = Utf8               map
  #236 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #237 = Methodref          #222.#238     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #238 = NameAndType        #5:#239       // "<init>":(III)V
  #239 = Utf8               (III)V
  #240 = InvokeDynamic      #15:#73       // #15:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #241 = Methodref          #14.#242      // ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #242 = NameAndType        #243:#244     // getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #243 = Utf8               getIntIntHolder
  #244 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #245 = Class              #246          // ext/mods/gameserver/model/holder/IntIntHolder
  #246 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #247 = Methodref          #245.#248     // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #248 = NameAndType        #5:#249       // "<init>":(II)V
  #249 = Utf8               (II)V
  #250 = String             #251          // -
  #251 = Utf8               -
  #252 = InvokeDynamic      #16:#73       // #16:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #253 = Methodref          #14.#254      // ext/mods/commons/data/StatSet.getIntIntHolderArray:(Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
  #254 = NameAndType        #255:#256     // getIntIntHolderArray:(Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
  #255 = Utf8               getIntIntHolderArray
  #256 = Utf8               (Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
  #257 = Methodref          #55.#258      // java/lang/String.isEmpty:()Z
  #258 = NameAndType        #259:#54      // isEmpty:()Z
  #259 = Utf8               isEmpty
  #260 = Methodref          #55.#261      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #261 = NameAndType        #262:#263     // contains:(Ljava/lang/CharSequence;)Z
  #262 = Utf8               contains
  #263 = Utf8               (Ljava/lang/CharSequence;)Z
  #264 = InvokeDynamic      #17:#73       // #17:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #265 = Methodref          #225.#266     // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
  #266 = NameAndType        #267:#268     // asList:([Ljava/lang/Object;)Ljava/util/List;
  #267 = Utf8               asList
  #268 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #269 = Class              #270          // java/util/ArrayList
  #270 = Utf8               java/util/ArrayList
  #271 = Methodref          #269.#8       // java/util/ArrayList."<init>":(I)V
  #272 = InterfaceMethodref #174.#273     // java/util/List.add:(Ljava/lang/Object;)Z
  #273 = NameAndType        #274:#101     // add:(Ljava/lang/Object;)Z
  #274 = Utf8               add
  #275 = InvokeDynamic      #18:#73       // #18:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #276 = Methodref          #14.#277      // ext/mods/commons/data/StatSet.getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
  #277 = NameAndType        #278:#279     // getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
  #278 = Utf8               getIntIntHolderList
  #279 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #280 = Methodref          #281.#282     // java/lang/Object.getClass:()Ljava/lang/Class;
  #281 = Class              #283          // java/lang/Object
  #282 = NameAndType        #284:#285     // getClass:()Ljava/lang/Class;
  #283 = Utf8               java/lang/Object
  #284 = Utf8               getClass
  #285 = Utf8               ()Ljava/lang/Class;
  #286 = Methodref          #287.#288     // java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
  #287 = Class              #289          // java/lang/Class
  #288 = NameAndType        #290:#291     // isAssignableFrom:(Ljava/lang/Class;)Z
  #289 = Utf8               java/lang/Class
  #290 = Utf8               isAssignableFrom
  #291 = Utf8               (Ljava/lang/Class;)Z
  #292 = Methodref          #287.#293     // java/lang/Class.isInstance:(Ljava/lang/Object;)Z
  #293 = NameAndType        #294:#101     // isInstance:(Ljava/lang/Object;)Z
  #294 = Utf8               isInstance
  #295 = Class              #296          // java/lang/Enum
  #296 = Utf8               java/lang/Enum
  #297 = Methodref          #295.#298     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #298 = NameAndType        #32:#299      // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #299 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #300 = Methodref          #287.#301     // java/lang/Class.getName:()Ljava/lang/String;
  #301 = NameAndType        #302:#303     // getName:()Ljava/lang/String;
  #302 = Utf8               getName
  #303 = Utf8               ()Ljava/lang/String;
  #304 = InvokeDynamic      #19:#73       // #19:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #305 = Methodref          #14.#306      // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #306 = NameAndType        #307:#146     // getInteger:(Ljava/lang/String;)I
  #307 = Utf8               getInteger
  #308 = Methodref          #309.#310     // ext/mods/gameserver/network/NpcStringId.get:(I)Lext/mods/gameserver/network/NpcStringId;
  #309 = Class              #311          // ext/mods/gameserver/network/NpcStringId
  #310 = NameAndType        #50:#312      // get:(I)Lext/mods/gameserver/network/NpcStringId;
  #311 = Utf8               ext/mods/gameserver/network/NpcStringId
  #312 = Utf8               (I)Lext/mods/gameserver/network/NpcStringId;
  #313 = Methodref          #14.#314      // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #314 = NameAndType        #307:#315     // getInteger:(Ljava/lang/String;I)I
  #315 = Utf8               (Ljava/lang/String;I)I
  #316 = Methodref          #14.#258      // ext/mods/commons/data/StatSet.isEmpty:()Z
  #317 = Methodref          #14.#318      // ext/mods/commons/data/StatSet.entrySet:()Ljava/util/Set;
  #318 = NameAndType        #319:#320     // entrySet:()Ljava/util/Set;
  #319 = Utf8               entrySet
  #320 = Utf8               ()Ljava/util/Set;
  #321 = InterfaceMethodref #322.#323     // java/util/Set.iterator:()Ljava/util/Iterator;
  #322 = Class              #324          // java/util/Set
  #323 = NameAndType        #325:#326     // iterator:()Ljava/util/Iterator;
  #324 = Utf8               java/util/Set
  #325 = Utf8               iterator
  #326 = Utf8               ()Ljava/util/Iterator;
  #327 = InterfaceMethodref #328.#329     // java/util/Iterator.hasNext:()Z
  #328 = Class              #330          // java/util/Iterator
  #329 = NameAndType        #331:#54      // hasNext:()Z
  #330 = Utf8               java/util/Iterator
  #331 = Utf8               hasNext
  #332 = InterfaceMethodref #328.#333     // java/util/Iterator.next:()Ljava/lang/Object;
  #333 = NameAndType        #334:#335     // next:()Ljava/lang/Object;
  #334 = Utf8               next
  #335 = Utf8               ()Ljava/lang/Object;
  #336 = Class              #337          // java/util/Map$Entry
  #337 = Utf8               java/util/Map$Entry
  #338 = InterfaceMethodref #336.#339     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #339 = NameAndType        #340:#335     // getKey:()Ljava/lang/Object;
  #340 = Utf8               getKey
  #341 = InterfaceMethodref #336.#342     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #342 = NameAndType        #343:#335     // getValue:()Ljava/lang/Object;
  #343 = Utf8               getValue
  #344 = Utf8               Code
  #345 = Utf8               LineNumberTable
  #346 = Utf8               LocalVariableTable
  #347 = Utf8               this
  #348 = Utf8               Lext/mods/commons/data/StatSet;
  #349 = Utf8               size
  #350 = Utf8               I
  #351 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #352 = Utf8               set
  #353 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #354 = Utf8               key
  #355 = Utf8               Ljava/lang/String;
  #356 = Utf8               value
  #357 = Utf8               Ljava/lang/Object;
  #358 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #359 = Utf8               (Ljava/lang/String;Z)V
  #360 = Utf8               Z
  #361 = Utf8               StackMapTable
  #362 = Utf8               (Ljava/lang/String;I)V
  #363 = Utf8               (Ljava/lang/String;[I)V
  #364 = Utf8               (Ljava/lang/String;J)V
  #365 = Utf8               J
  #366 = Utf8               (Ljava/lang/String;D)V
  #367 = Utf8               D
  #368 = Utf8               (Ljava/lang/String;Ljava/lang/Enum;)V
  #369 = Utf8               Ljava/lang/Enum;
  #370 = Utf8               LocalVariableTypeTable
  #371 = Utf8               Ljava/lang/Enum<*>;
  #372 = Utf8               Signature
  #373 = Utf8               (Ljava/lang/String;Ljava/lang/Enum<*>;)V
  #374 = Utf8               unset
  #375 = Utf8               getSet
  #376 = Utf8               ()Lext/mods/commons/data/StatSet;
  #377 = Utf8               getBool
  #378 = Utf8               bool
  #379 = Utf8               string
  #380 = Utf8               number
  #381 = Utf8               Ljava/lang/Number;
  #382 = Utf8               val
  #383 = Utf8               (Ljava/lang/String;Z)Z
  #384 = Utf8               defaultValue
  #385 = Utf8               getByte
  #386 = Utf8               (Ljava/lang/String;B)B
  #387 = Utf8               B
  #388 = Utf8               getDouble
  #389 = Utf8               (Ljava/lang/String;D)D
  #390 = Utf8               getDoubleArray
  #391 = Utf8               (Ljava/lang/String;)[D
  #392 = Utf8               array
  #393 = Utf8               getFloat
  #394 = Utf8               (Ljava/lang/String;F)F
  #395 = Utf8               F
  #396 = Utf8               (Ljava/lang/String;[I)[I
  #397 = Utf8               e
  #398 = Utf8               Ljava/lang/IllegalArgumentException;
  #399 = Utf8               defaultArray
  #400 = Utf8               getList
  #401 = Utf8               <T:Ljava/lang/Object;>(Ljava/lang/String;)Ljava/util/List<TT;>;
  #402 = Utf8               getLong
  #403 = Utf8               (Ljava/lang/String;J)J
  #404 = Utf8               getLongArray
  #405 = Utf8               (Ljava/lang/String;)[J
  #406 = Utf8               getMap
  #407 = Utf8               (Ljava/lang/String;)Ljava/util/Map;
  #408 = Utf8               <T:Ljava/lang/Object;U:Ljava/lang/Object;>(Ljava/lang/String;)Ljava/util/Map<TT;TU;>;
  #409 = Utf8               getString
  #410 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
  #411 = Utf8               Ljava/lang/Exception;
  #412 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #413 = Utf8               defaultLoc
  #414 = Utf8               Lext/mods/gameserver/model/location/Location;
  #415 = Utf8               loc
  #416 = Utf8               arr
  #417 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/holder/IntIntHolder;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #418 = Utf8               defaultHolder
  #419 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #420 = Utf8               toSplit
  #421 = Utf8               (Ljava/lang/String;[Lext/mods/gameserver/model/holder/IntIntHolder;)[Lext/mods/gameserver/model/holder/IntIntHolder;
  #422 = Utf8               defaultHolderArray
  #423 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #424 = Utf8               splittedHolder
  #425 = Utf8               splitted
  #426 = Utf8               tempArray
  #427 = Utf8               index
  #428 = Class              #423          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #429 = Utf8               entry
  #430 = Utf8               entries
  #431 = Utf8               list
  #432 = Utf8               Ljava/util/List;
  #433 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #434 = Utf8               (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #435 = Utf8               (Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
  #436 = Utf8               (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #437 = Utf8               getObject
  #438 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
  #439 = Utf8               type
  #440 = Utf8               Ljava/lang/Class;
  #441 = Utf8               Ljava/lang/Class<TA;>;
  #442 = Utf8               <A:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TA;>;)TA;
  #443 = Utf8               getEnum
  #444 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
  #445 = Utf8               name
  #446 = Utf8               enumClass
  #447 = Utf8               Ljava/lang/Class<TE;>;
  #448 = Utf8               <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/String;Ljava/lang/Class<TE;>;)TE;
  #449 = Utf8               (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #450 = Utf8               TE;
  #451 = Utf8               <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/String;Ljava/lang/Class<TE;>;TE;)TE;
  #452 = Utf8               getNpcStringId
  #453 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/NpcStringId;
  #454 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/NpcStringId;)Lext/mods/gameserver/network/NpcStringId;
  #455 = Utf8               Lext/mods/gameserver/network/NpcStringId;
  #456 = Utf8               id
  #457 = Utf8               merge
  #458 = Utf8               Ljava/util/Map$Entry;
  #459 = Utf8               other
  #460 = Utf8               Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;
  #461 = Utf8               Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;
  #462 = Utf8               SourceFile
  #463 = Utf8               StatSet.java
  #464 = Utf8               BootstrapMethods
  #465 = String             #466          // StatSet : Boolean value required, but found: \u0001 for key: \u0001.
  #466 = Utf8               StatSet : Boolean value required, but found: \u0001 for key: \u0001.
  #467 = String             #468          // StatSet : Byte value required, but found: \u0001 for key: \u0001.
  #468 = Utf8               StatSet : Byte value required, but found: \u0001 for key: \u0001.
  #469 = String             #470          // StatSet : Double value required, but found: \u0001 for key: \u0001.
  #470 = Utf8               StatSet : Double value required, but found: \u0001 for key: \u0001.
  #471 = MethodType         #472          //  (Ljava/lang/Object;)D
  #472 = Utf8               (Ljava/lang/Object;)D
  #473 = MethodHandle       6:#94         // REF_invokeStatic java/lang/Double.parseDouble:(Ljava/lang/String;)D
  #474 = MethodType         #97           //  (Ljava/lang/String;)D
  #475 = String             #476          // StatSet : Double array required, but found: \u0001 for key: \u0001.
  #476 = Utf8               StatSet : Double array required, but found: \u0001 for key: \u0001.
  #477 = String             #478          // StatSet : Float value required, but found: \u0001 for key: \u0001.
  #478 = Utf8               StatSet : Float value required, but found: \u0001 for key: \u0001.
  #479 = String             #480          // StatSet : Integer value required, but found: \u0001 for key: \u0001.
  #480 = Utf8               StatSet : Integer value required, but found: \u0001 for key: \u0001.
  #481 = MethodType         #482          //  (Ljava/lang/Object;)I
  #482 = Utf8               (Ljava/lang/Object;)I
  #483 = MethodHandle       6:#143        // REF_invokeStatic java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #484 = MethodType         #146          //  (Ljava/lang/String;)I
  #485 = String             #486          // StatSet : Integer array required, but found: \u0001 for key: \u0001.
  #486 = Utf8               StatSet : Integer array required, but found: \u0001 for key: \u0001.
  #487 = String             #488          // StatSet : Long value required, but found: \u0001 for key: \u0001.
  #488 = Utf8               StatSet : Long value required, but found: \u0001 for key: \u0001.
  #489 = MethodType         #490          //  (Ljava/lang/Object;)J
  #490 = Utf8               (Ljava/lang/Object;)J
  #491 = MethodHandle       6:#180        // REF_invokeStatic java/lang/Long.parseLong:(Ljava/lang/String;)J
  #492 = MethodType         #183          //  (Ljava/lang/String;)J
  #493 = String             #494          // StatSet : Long array required, but found: \u0001 for key: \u0001.
  #494 = Utf8               StatSet : Long array required, but found: \u0001 for key: \u0001.
  #495 = String             #496          // StatSet : String value required, but unspecified for key: \u0001.
  #496 = Utf8               StatSet : String value required, but unspecified for key: \u0001.
  #497 = String             #498          // StatSet : String array required, but found: \u0001 for key: \u0001.
  #498 = Utf8               StatSet : String array required, but found: \u0001 for key: \u0001.
  #499 = MethodType         #47           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #500 = MethodHandle       5:#501        // REF_invokeVirtual java/lang/String.trim:()Ljava/lang/String;
  #501 = Methodref          #55.#502      // java/lang/String.trim:()Ljava/lang/String;
  #502 = NameAndType        #503:#303     // trim:()Ljava/lang/String;
  #503 = Utf8               trim
  #504 = MethodType         #209          //  (Ljava/lang/String;)Ljava/lang/String;
  #505 = String             #506          // StatSet : Location required, but found: \u0001 for key: \u0001.
  #506 = Utf8               StatSet : Location required, but found: \u0001 for key: \u0001.
  #507 = String             #508          // StatSet : int-int (IntIntHolder) required, but found: \u0001 for key: \u0001.
  #508 = Utf8               StatSet : int-int (IntIntHolder) required, but found: \u0001 for key: \u0001.
  #509 = String             #510          // StatSet : int-int;int-int (int[] IntIntHolder) required, but found: \u0001 for key: \u0001.
  #510 = Utf8               StatSet : int-int;int-int (int[] IntIntHolder) required, but found: \u0001 for key: \u0001.
  #511 = String             #512          // StatSet : int-int;int-int (List<IntIntHolder>) required, but found: \u0001 for key: \u0001.
  #512 = Utf8               StatSet : int-int;int-int (List<IntIntHolder>) required, but found: \u0001 for key: \u0001.
  #513 = String             #514          // StatSet : Enum value of type \u0001 required, but found: \u0001.
  #514 = Utf8               StatSet : Enum value of type \u0001 required, but found: \u0001.
  #515 = MethodHandle       6:#516        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #516 = Methodref          #517.#518     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #517 = Class              #519          // java/lang/invoke/StringConcatFactory
  #518 = NameAndType        #74:#520      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #519 = Utf8               java/lang/invoke/StringConcatFactory
  #520 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #521 = MethodHandle       6:#522        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #522 = Methodref          #523.#524     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #523 = Class              #525          // java/lang/invoke/LambdaMetafactory
  #524 = NameAndType        #526:#527     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #525 = Utf8               java/lang/invoke/LambdaMetafactory
  #526 = Utf8               metafactory
  #527 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #528 = Utf8               InnerClasses
  #529 = Utf8               Entry
  #530 = Class              #531          // java/lang/invoke/MethodHandles$Lookup
  #531 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #532 = Class              #533          // java/lang/invoke/MethodHandles
  #533 = Utf8               java/lang/invoke/MethodHandles
  #534 = Utf8               Lookup
{
  public ext.mods.commons.data.StatSet();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/util/HashMap."<init>":()V
         4: return
      LineNumberTable:
        line 44: 0
        line 45: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/data/StatSet;

  public ext.mods.commons.data.StatSet(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #7                  // Method java/util/HashMap."<init>":(I)V
         5: return
      LineNumberTable:
        line 49: 0
        line 50: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/data/StatSet;
            0       6     1  size   I

  public ext.mods.commons.data.StatSet(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #10                 // Method java/util/HashMap."<init>":(Ljava/util/Map;)V
         5: return
      LineNumberTable:
        line 54: 0
        line 55: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/data/StatSet;
            0       6     1   set   Lext/mods/commons/data/StatSet;

  public void set(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #13                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: return
      LineNumberTable:
        line 59: 0
        line 60: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/data/StatSet;
            0       8     1   key   Ljava/lang/String;
            0       8     2 value   Ljava/lang/Object;

  public void set(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #13                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: return
      LineNumberTable:
        line 64: 0
        line 65: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/data/StatSet;
            0       8     1   key   Ljava/lang/String;
            0       8     2 value   Ljava/lang/String;

  public void set(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: ifeq          12
         6: getstatic     #19                 // Field java/lang/Boolean.TRUE:Ljava/lang/Boolean;
         9: goto          15
        12: getstatic     #25                 // Field java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        15: invokevirtual #13                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        18: pop
        19: return
      LineNumberTable:
        line 69: 0
        line 70: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/data/StatSet;
            0      20     1   key   Ljava/lang/String;
            0      20     2 value   Z
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/commons/data/StatSet, class java/lang/String, int ]
          stack = [ class ext/mods/commons/data/StatSet, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/commons/data/StatSet, class java/lang/String, int ]
          stack = [ class ext/mods/commons/data/StatSet, class java/lang/String, class java/lang/Boolean ]

  public void set(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokestatic  #28                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         6: invokevirtual #13                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         9: pop
        10: return
      LineNumberTable:
        line 74: 0
        line 75: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/data/StatSet;
            0      11     1   key   Ljava/lang/String;
            0      11     2 value   I

  public void set(java.lang.String, int[]);
    descriptor: (Ljava/lang/String;[I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #13                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: return
      LineNumberTable:
        line 79: 0
        line 80: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/data/StatSet;
            0       8     1   key   Ljava/lang/String;
            0       8     2 value   [I

  public void set(java.lang.String, long);
    descriptor: (Ljava/lang/String;J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: lload_2
         3: invokestatic  #34                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
         6: invokevirtual #13                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         9: pop
        10: return
      LineNumberTable:
        line 84: 0
        line 85: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/data/StatSet;
            0      11     1   key   Ljava/lang/String;
            0      11     2 value   J

  public void set(java.lang.String, double);
    descriptor: (Ljava/lang/String;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: dload_2
         3: invokestatic  #39                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
         6: invokevirtual #13                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         9: pop
        10: return
      LineNumberTable:
        line 89: 0
        line 90: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/data/StatSet;
            0      11     1   key   Ljava/lang/String;
            0      11     2 value   D

  public void set(java.lang.String, java.lang.Enum<?>);
    descriptor: (Ljava/lang/String;Ljava/lang/Enum;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #13                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: return
      LineNumberTable:
        line 94: 0
        line 95: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/data/StatSet;
            0       8     1   key   Ljava/lang/String;
            0       8     2 value   Ljava/lang/Enum;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       8     2 value   Ljava/lang/Enum<*>;
    Signature: #373                         // (Ljava/lang/String;Ljava/lang/Enum<*>;)V

  public void unset(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #44                 // Method remove:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: return
      LineNumberTable:
        line 99: 0
        line 100: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/data/StatSet;
            0       7     1   key   Ljava/lang/String;

  public ext.mods.commons.data.StatSet getSet();
    descriptor: ()Lext/mods/commons/data/StatSet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: areturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/data/StatSet;

  public boolean getBool(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #20                 // class java/lang/Boolean
        10: ifeq          23
        13: aload_2
        14: checkcast     #20                 // class java/lang/Boolean
        17: astore_3
        18: aload_3
        19: invokevirtual #51                 // Method java/lang/Boolean.booleanValue:()Z
        22: ireturn
        23: aload_2
        24: instanceof    #55                 // class java/lang/String
        27: ifeq          40
        30: aload_2
        31: checkcast     #55                 // class java/lang/String
        34: astore_3
        35: aload_3
        36: invokestatic  #57                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        39: ireturn
        40: aload_2
        41: instanceof    #61                 // class java/lang/Number
        44: ifeq          65
        47: aload_2
        48: checkcast     #61                 // class java/lang/Number
        51: astore_3
        52: aload_3
        53: invokevirtual #63                 // Method java/lang/Number.intValue:()I
        56: ifeq          63
        59: iconst_1
        60: goto          64
        63: iconst_0
        64: ireturn
        65: new           #67                 // class java/lang/IllegalArgumentException
        68: dup
        69: aload_2
        70: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        73: aload_1
        74: invokedynamic #72,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        79: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        82: athrow
      LineNumberTable:
        line 109: 0
        line 111: 6
        line 112: 18
        line 114: 23
        line 115: 35
        line 117: 40
        line 118: 52
        line 120: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       5     3  bool   Ljava/lang/Boolean;
           35       5     3 string   Ljava/lang/String;
           52      13     3 number   Ljava/lang/Number;
            0      83     0  this   Lext/mods/commons/data/StatSet;
            0      83     1   key   Ljava/lang/String;
            6      77     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/Object ]
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/lang/Number ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public boolean getBool(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_3
         6: aload_3
         7: instanceof    #20                 // class java/lang/Boolean
        10: ifeq          25
        13: aload_3
        14: checkcast     #20                 // class java/lang/Boolean
        17: astore        4
        19: aload         4
        21: invokevirtual #51                 // Method java/lang/Boolean.booleanValue:()Z
        24: ireturn
        25: aload_3
        26: instanceof    #55                 // class java/lang/String
        29: ifeq          44
        32: aload_3
        33: checkcast     #55                 // class java/lang/String
        36: astore        4
        38: aload         4
        40: invokestatic  #57                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        43: ireturn
        44: aload_3
        45: instanceof    #61                 // class java/lang/Number
        48: ifeq          71
        51: aload_3
        52: checkcast     #61                 // class java/lang/Number
        55: astore        4
        57: aload         4
        59: invokevirtual #63                 // Method java/lang/Number.intValue:()I
        62: ifeq          69
        65: iconst_1
        66: goto          70
        69: iconst_0
        70: ireturn
        71: iload_2
        72: ireturn
      LineNumberTable:
        line 125: 0
        line 127: 6
        line 128: 19
        line 130: 25
        line 131: 38
        line 133: 44
        line 134: 57
        line 136: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19       6     4  bool   Ljava/lang/Boolean;
           38       6     4 string   Ljava/lang/String;
           57      14     4 number   Ljava/lang/Number;
            0      73     0  this   Lext/mods/commons/data/StatSet;
            0      73     1   key   Ljava/lang/String;
            0      73     2 defaultValue   Z
            6      67     3   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/lang/Object ]
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/Number ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public byte getByte(java.lang.String);
    descriptor: (Ljava/lang/String;)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #61                 // class java/lang/Number
        10: ifeq          23
        13: aload_2
        14: checkcast     #61                 // class java/lang/Number
        17: astore_3
        18: aload_3
        19: invokevirtual #79                 // Method java/lang/Number.byteValue:()B
        22: ireturn
        23: aload_2
        24: instanceof    #55                 // class java/lang/String
        27: ifeq          40
        30: aload_2
        31: checkcast     #55                 // class java/lang/String
        34: astore_3
        35: aload_3
        36: invokestatic  #83                 // Method java/lang/Byte.parseByte:(Ljava/lang/String;)B
        39: ireturn
        40: new           #67                 // class java/lang/IllegalArgumentException
        43: dup
        44: aload_2
        45: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        48: aload_1
        49: invokedynamic #89,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        54: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        57: athrow
      LineNumberTable:
        line 141: 0
        line 143: 6
        line 144: 18
        line 146: 23
        line 147: 35
        line 149: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       5     3 number   Ljava/lang/Number;
           35       5     3 string   Ljava/lang/String;
            0      58     0  this   Lext/mods/commons/data/StatSet;
            0      58     1   key   Ljava/lang/String;
            6      52     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/Object ]
        frame_type = 16 /* same */

  public byte getByte(java.lang.String, byte);
    descriptor: (Ljava/lang/String;B)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_3
         6: aload_3
         7: instanceof    #61                 // class java/lang/Number
        10: ifeq          25
        13: aload_3
        14: checkcast     #61                 // class java/lang/Number
        17: astore        4
        19: aload         4
        21: invokevirtual #79                 // Method java/lang/Number.byteValue:()B
        24: ireturn
        25: aload_3
        26: instanceof    #55                 // class java/lang/String
        29: ifeq          44
        32: aload_3
        33: checkcast     #55                 // class java/lang/String
        36: astore        4
        38: aload         4
        40: invokestatic  #83                 // Method java/lang/Byte.parseByte:(Ljava/lang/String;)B
        43: ireturn
        44: iload_2
        45: ireturn
      LineNumberTable:
        line 154: 0
        line 156: 6
        line 157: 19
        line 159: 25
        line 160: 38
        line 162: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19       6     4 number   Ljava/lang/Number;
           38       6     4 string   Ljava/lang/String;
            0      46     0  this   Lext/mods/commons/data/StatSet;
            0      46     1   key   Ljava/lang/String;
            0      46     2 defaultValue   B
            6      40     3   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/lang/Object ]
        frame_type = 18 /* same */

  public double getDouble(java.lang.String);
    descriptor: (Ljava/lang/String;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #61                 // class java/lang/Number
        10: ifeq          23
        13: aload_2
        14: checkcast     #61                 // class java/lang/Number
        17: astore_3
        18: aload_3
        19: invokevirtual #90                 // Method java/lang/Number.doubleValue:()D
        22: dreturn
        23: aload_2
        24: instanceof    #55                 // class java/lang/String
        27: ifeq          40
        30: aload_2
        31: checkcast     #55                 // class java/lang/String
        34: astore_3
        35: aload_3
        36: invokestatic  #94                 // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
        39: dreturn
        40: aload_2
        41: instanceof    #20                 // class java/lang/Boolean
        44: ifeq          68
        47: aload_2
        48: checkcast     #20                 // class java/lang/Boolean
        51: astore_3
        52: getstatic     #19                 // Field java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        55: aload_3
        56: invokevirtual #98                 // Method java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        59: ifeq          66
        62: dconst_1
        63: goto          67
        66: dconst_0
        67: dreturn
        68: new           #67                 // class java/lang/IllegalArgumentException
        71: dup
        72: aload_2
        73: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        76: aload_1
        77: invokedynamic #102,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        82: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        85: athrow
      LineNumberTable:
        line 167: 0
        line 169: 6
        line 170: 18
        line 172: 23
        line 173: 35
        line 175: 40
        line 176: 52
        line 178: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       5     3 number   Ljava/lang/Number;
           35       5     3 string   Ljava/lang/String;
           52      16     3  bool   Ljava/lang/Boolean;
            0      86     0  this   Lext/mods/commons/data/StatSet;
            0      86     1   key   Ljava/lang/String;
            6      80     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/Object ]
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/lang/Boolean ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public double getDouble(java.lang.String, double);
    descriptor: (Ljava/lang/String;D)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore        4
         7: aload         4
         9: instanceof    #61                 // class java/lang/Number
        12: ifeq          28
        15: aload         4
        17: checkcast     #61                 // class java/lang/Number
        20: astore        5
        22: aload         5
        24: invokevirtual #90                 // Method java/lang/Number.doubleValue:()D
        27: dreturn
        28: aload         4
        30: instanceof    #55                 // class java/lang/String
        33: ifeq          49
        36: aload         4
        38: checkcast     #55                 // class java/lang/String
        41: astore        5
        43: aload         5
        45: invokestatic  #94                 // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
        48: dreturn
        49: aload         4
        51: instanceof    #20                 // class java/lang/Boolean
        54: ifeq          81
        57: aload         4
        59: checkcast     #20                 // class java/lang/Boolean
        62: astore        5
        64: getstatic     #19                 // Field java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        67: aload         5
        69: invokevirtual #98                 // Method java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        72: ifeq          79
        75: dconst_1
        76: goto          80
        79: dconst_0
        80: dreturn
        81: dload_2
        82: dreturn
      LineNumberTable:
        line 183: 0
        line 185: 7
        line 186: 22
        line 188: 28
        line 189: 43
        line 191: 49
        line 192: 64
        line 194: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22       6     5 number   Ljava/lang/Number;
           43       6     5 string   Ljava/lang/String;
           64      17     5  bool   Ljava/lang/Boolean;
            0      83     0  this   Lext/mods/commons/data/StatSet;
            0      83     1   key   Ljava/lang/String;
            0      83     2 defaultValue   D
            7      76     4   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/lang/Object ]
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/lang/Boolean ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public double[] getDoubleArray(java.lang.String);
    descriptor: (Ljava/lang/String;)[D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #103                // class "[D"
        10: ifeq          20
        13: aload_2
        14: checkcast     #103                // class "[D"
        17: astore_3
        18: aload_3
        19: areturn
        20: aload_2
        21: instanceof    #61                 // class java/lang/Number
        24: ifeq          43
        27: aload_2
        28: checkcast     #61                 // class java/lang/Number
        31: astore_3
        32: iconst_1
        33: newarray       double
        35: dup
        36: iconst_0
        37: aload_3
        38: invokevirtual #90                 // Method java/lang/Number.doubleValue:()D
        41: dastore
        42: areturn
        43: aload_2
        44: instanceof    #55                 // class java/lang/String
        47: ifeq          80
        50: aload_2
        51: checkcast     #55                 // class java/lang/String
        54: astore_3
        55: aload_3
        56: ldc           #105                // String ;
        58: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        61: invokestatic  #111                // InterfaceMethod java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
        64: invokedynamic #117,  0            // InvokeDynamic #3:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
        69: invokeinterface #121,  2          // InterfaceMethod java/util/stream/Stream.mapToDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;
        74: invokeinterface #125,  1          // InterfaceMethod java/util/stream/DoubleStream.toArray:()[D
        79: areturn
        80: new           #67                 // class java/lang/IllegalArgumentException
        83: dup
        84: aload_2
        85: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        88: aload_1
        89: invokedynamic #131,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        94: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        97: athrow
      LineNumberTable:
        line 199: 0
        line 201: 6
        line 202: 18
        line 204: 20
        line 205: 32
        line 207: 38
        line 205: 42
        line 210: 43
        line 211: 55
        line 213: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       2     3 array   [D
           32      11     3 number   Ljava/lang/Number;
           55      25     3 string   Ljava/lang/String;
            0      98     0  this   Lext/mods/commons/data/StatSet;
            0      98     1   key   Ljava/lang/String;
            6      92     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/Object ]
        frame_type = 22 /* same */
        frame_type = 36 /* same */

  public float getFloat(java.lang.String);
    descriptor: (Ljava/lang/String;)F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #61                 // class java/lang/Number
        10: ifeq          23
        13: aload_2
        14: checkcast     #61                 // class java/lang/Number
        17: astore_3
        18: aload_3
        19: invokevirtual #132                // Method java/lang/Number.floatValue:()F
        22: freturn
        23: aload_2
        24: instanceof    #55                 // class java/lang/String
        27: ifeq          40
        30: aload_2
        31: checkcast     #55                 // class java/lang/String
        34: astore_3
        35: aload_3
        36: invokestatic  #136                // Method java/lang/Float.parseFloat:(Ljava/lang/String;)F
        39: freturn
        40: aload_2
        41: instanceof    #20                 // class java/lang/Boolean
        44: ifeq          68
        47: aload_2
        48: checkcast     #20                 // class java/lang/Boolean
        51: astore_3
        52: getstatic     #19                 // Field java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        55: aload_3
        56: invokevirtual #98                 // Method java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        59: ifeq          66
        62: fconst_1
        63: goto          67
        66: fconst_0
        67: freturn
        68: new           #67                 // class java/lang/IllegalArgumentException
        71: dup
        72: aload_2
        73: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        76: aload_1
        77: invokedynamic #142,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        82: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        85: athrow
      LineNumberTable:
        line 218: 0
        line 220: 6
        line 221: 18
        line 223: 23
        line 224: 35
        line 226: 40
        line 227: 52
        line 229: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       5     3 number   Ljava/lang/Number;
           35       5     3 string   Ljava/lang/String;
           52      16     3  bool   Ljava/lang/Boolean;
            0      86     0  this   Lext/mods/commons/data/StatSet;
            0      86     1   key   Ljava/lang/String;
            6      80     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/Object ]
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/lang/Boolean ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ float ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public float getFloat(java.lang.String, float);
    descriptor: (Ljava/lang/String;F)F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_3
         6: aload_3
         7: instanceof    #61                 // class java/lang/Number
        10: ifeq          25
        13: aload_3
        14: checkcast     #61                 // class java/lang/Number
        17: astore        4
        19: aload         4
        21: invokevirtual #132                // Method java/lang/Number.floatValue:()F
        24: freturn
        25: aload_3
        26: instanceof    #55                 // class java/lang/String
        29: ifeq          44
        32: aload_3
        33: checkcast     #55                 // class java/lang/String
        36: astore        4
        38: aload         4
        40: invokestatic  #136                // Method java/lang/Float.parseFloat:(Ljava/lang/String;)F
        43: freturn
        44: aload_3
        45: instanceof    #20                 // class java/lang/Boolean
        48: ifeq          74
        51: aload_3
        52: checkcast     #20                 // class java/lang/Boolean
        55: astore        4
        57: getstatic     #19                 // Field java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        60: aload         4
        62: invokevirtual #98                 // Method java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        65: ifeq          72
        68: fconst_1
        69: goto          73
        72: fconst_0
        73: freturn
        74: fload_2
        75: freturn
      LineNumberTable:
        line 234: 0
        line 236: 6
        line 237: 19
        line 239: 25
        line 240: 38
        line 242: 44
        line 243: 57
        line 245: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19       6     4 number   Ljava/lang/Number;
           38       6     4 string   Ljava/lang/String;
           57      17     4  bool   Ljava/lang/Boolean;
            0      76     0  this   Lext/mods/commons/data/StatSet;
            0      76     1   key   Ljava/lang/String;
            0      76     2 defaultValue   F
            6      70     3   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/lang/Object ]
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/Boolean ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ float ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public int getInteger(java.lang.String);
    descriptor: (Ljava/lang/String;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #61                 // class java/lang/Number
        10: ifeq          23
        13: aload_2
        14: checkcast     #61                 // class java/lang/Number
        17: astore_3
        18: aload_3
        19: invokevirtual #63                 // Method java/lang/Number.intValue:()I
        22: ireturn
        23: aload_2
        24: instanceof    #55                 // class java/lang/String
        27: ifeq          40
        30: aload_2
        31: checkcast     #55                 // class java/lang/String
        34: astore_3
        35: aload_3
        36: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        39: ireturn
        40: aload_2
        41: instanceof    #20                 // class java/lang/Boolean
        44: ifeq          68
        47: aload_2
        48: checkcast     #20                 // class java/lang/Boolean
        51: astore_3
        52: getstatic     #19                 // Field java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        55: aload_3
        56: invokevirtual #98                 // Method java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        59: ifeq          66
        62: iconst_1
        63: goto          67
        66: iconst_0
        67: ireturn
        68: new           #67                 // class java/lang/IllegalArgumentException
        71: dup
        72: aload_2
        73: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        76: aload_1
        77: invokedynamic #147,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        82: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        85: athrow
      LineNumberTable:
        line 250: 0
        line 252: 6
        line 253: 18
        line 255: 23
        line 256: 35
        line 258: 40
        line 259: 52
        line 261: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       5     3 number   Ljava/lang/Number;
           35       5     3 string   Ljava/lang/String;
           52      16     3  bool   Ljava/lang/Boolean;
            0      86     0  this   Lext/mods/commons/data/StatSet;
            0      86     1   key   Ljava/lang/String;
            6      80     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/Object ]
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/lang/Boolean ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public int getInteger(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_3
         6: aload_3
         7: instanceof    #61                 // class java/lang/Number
        10: ifeq          25
        13: aload_3
        14: checkcast     #61                 // class java/lang/Number
        17: astore        4
        19: aload         4
        21: invokevirtual #63                 // Method java/lang/Number.intValue:()I
        24: ireturn
        25: aload_3
        26: instanceof    #55                 // class java/lang/String
        29: ifeq          44
        32: aload_3
        33: checkcast     #55                 // class java/lang/String
        36: astore        4
        38: aload         4
        40: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        43: ireturn
        44: aload_3
        45: instanceof    #20                 // class java/lang/Boolean
        48: ifeq          74
        51: aload_3
        52: checkcast     #20                 // class java/lang/Boolean
        55: astore        4
        57: getstatic     #19                 // Field java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        60: aload         4
        62: invokevirtual #98                 // Method java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        65: ifeq          72
        68: iconst_1
        69: goto          73
        72: iconst_0
        73: ireturn
        74: iload_2
        75: ireturn
      LineNumberTable:
        line 266: 0
        line 268: 6
        line 269: 19
        line 271: 25
        line 272: 38
        line 274: 44
        line 275: 57
        line 277: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19       6     4 number   Ljava/lang/Number;
           38       6     4 string   Ljava/lang/String;
           57      17     4  bool   Ljava/lang/Boolean;
            0      76     0  this   Lext/mods/commons/data/StatSet;
            0      76     1   key   Ljava/lang/String;
            0      76     2 defaultValue   I
            6      70     3   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/lang/Object ]
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/Boolean ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public int[] getIntegerArray(java.lang.String);
    descriptor: (Ljava/lang/String;)[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #148                // class "[I"
        10: ifeq          20
        13: aload_2
        14: checkcast     #148                // class "[I"
        17: astore_3
        18: aload_3
        19: areturn
        20: aload_2
        21: instanceof    #61                 // class java/lang/Number
        24: ifeq          43
        27: aload_2
        28: checkcast     #61                 // class java/lang/Number
        31: astore_3
        32: iconst_1
        33: newarray       int
        35: dup
        36: iconst_0
        37: aload_3
        38: invokevirtual #63                 // Method java/lang/Number.intValue:()I
        41: iastore
        42: areturn
        43: aload_2
        44: instanceof    #55                 // class java/lang/String
        47: ifeq          80
        50: aload_2
        51: checkcast     #55                 // class java/lang/String
        54: astore_3
        55: aload_3
        56: ldc           #105                // String ;
        58: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        61: invokestatic  #111                // InterfaceMethod java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
        64: invokedynamic #150,  0            // InvokeDynamic #7:applyAsInt:()Ljava/util/function/ToIntFunction;
        69: invokeinterface #154,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        74: invokeinterface #158,  1          // InterfaceMethod java/util/stream/IntStream.toArray:()[I
        79: areturn
        80: new           #67                 // class java/lang/IllegalArgumentException
        83: dup
        84: aload_2
        85: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        88: aload_1
        89: invokedynamic #163,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        94: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        97: athrow
      LineNumberTable:
        line 282: 0
        line 284: 6
        line 285: 18
        line 287: 20
        line 288: 32
        line 290: 38
        line 288: 42
        line 293: 43
        line 294: 55
        line 296: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       2     3 array   [I
           32      11     3 number   Ljava/lang/Number;
           55      25     3 string   Ljava/lang/String;
            0      98     0  this   Lext/mods/commons/data/StatSet;
            0      98     1   key   Ljava/lang/String;
            6      92     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/Object ]
        frame_type = 22 /* same */
        frame_type = 36 /* same */

  public int[] getIntegerArray(java.lang.String, int[]);
    descriptor: (Ljava/lang/String;[I)[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #164                // Method getIntegerArray:(Ljava/lang/String;)[I
         5: areturn
         6: astore_3
         7: aload_2
         8: areturn
      Exception table:
         from    to  target type
             0     5     6   Class java/lang/IllegalArgumentException
      LineNumberTable:
        line 303: 0
        line 305: 6
        line 307: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7       2     3     e   Ljava/lang/IllegalArgumentException;
            0       9     0  this   Lext/mods/commons/data/StatSet;
            0       9     1   key   Ljava/lang/String;
            0       9     2 defaultArray   [I
      StackMapTable: number_of_entries = 1
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/IllegalArgumentException ]

  public <T extends java.lang.Object> java.util.List<T> getList(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: ifnonnull     14
        10: invokestatic  #168                // Method java/util/Collections.emptyList:()Ljava/util/List;
        13: areturn
        14: aload_2
        15: checkcast     #174                // class java/util/List
        18: areturn
      LineNumberTable:
        line 314: 0
        line 316: 6
        line 317: 10
        line 319: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/data/StatSet;
            0      19     1   key   Ljava/lang/String;
            6      13     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/lang/Object ]
    Signature: #401                         // <T:Ljava/lang/Object;>(Ljava/lang/String;)Ljava/util/List<TT;>;

  public long getLong(java.lang.String);
    descriptor: (Ljava/lang/String;)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #61                 // class java/lang/Number
        10: ifeq          23
        13: aload_2
        14: checkcast     #61                 // class java/lang/Number
        17: astore_3
        18: aload_3
        19: invokevirtual #176                // Method java/lang/Number.longValue:()J
        22: lreturn
        23: aload_2
        24: instanceof    #55                 // class java/lang/String
        27: ifeq          40
        30: aload_2
        31: checkcast     #55                 // class java/lang/String
        34: astore_3
        35: aload_3
        36: invokestatic  #180                // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
        39: lreturn
        40: aload_2
        41: instanceof    #20                 // class java/lang/Boolean
        44: ifeq          68
        47: aload_2
        48: checkcast     #20                 // class java/lang/Boolean
        51: astore_3
        52: getstatic     #19                 // Field java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        55: aload_3
        56: invokevirtual #98                 // Method java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        59: ifeq          66
        62: lconst_1
        63: goto          67
        66: lconst_0
        67: lreturn
        68: new           #67                 // class java/lang/IllegalArgumentException
        71: dup
        72: aload_2
        73: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        76: aload_1
        77: invokedynamic #184,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        82: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        85: athrow
      LineNumberTable:
        line 324: 0
        line 326: 6
        line 327: 18
        line 329: 23
        line 330: 35
        line 332: 40
        line 333: 52
        line 335: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       5     3 number   Ljava/lang/Number;
           35       5     3 string   Ljava/lang/String;
           52      16     3  bool   Ljava/lang/Boolean;
            0      86     0  this   Lext/mods/commons/data/StatSet;
            0      86     1   key   Ljava/lang/String;
            6      80     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/Object ]
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/lang/Boolean ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ long ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public long getLong(java.lang.String, long);
    descriptor: (Ljava/lang/String;J)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore        4
         7: aload         4
         9: instanceof    #61                 // class java/lang/Number
        12: ifeq          28
        15: aload         4
        17: checkcast     #61                 // class java/lang/Number
        20: astore        5
        22: aload         5
        24: invokevirtual #176                // Method java/lang/Number.longValue:()J
        27: lreturn
        28: aload         4
        30: instanceof    #55                 // class java/lang/String
        33: ifeq          49
        36: aload         4
        38: checkcast     #55                 // class java/lang/String
        41: astore        5
        43: aload         5
        45: invokestatic  #180                // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
        48: lreturn
        49: aload         4
        51: instanceof    #20                 // class java/lang/Boolean
        54: ifeq          81
        57: aload         4
        59: checkcast     #20                 // class java/lang/Boolean
        62: astore        5
        64: getstatic     #19                 // Field java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        67: aload         5
        69: invokevirtual #98                 // Method java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        72: ifeq          79
        75: lconst_1
        76: goto          80
        79: lconst_0
        80: lreturn
        81: lload_2
        82: lreturn
      LineNumberTable:
        line 340: 0
        line 342: 7
        line 343: 22
        line 345: 28
        line 346: 43
        line 348: 49
        line 349: 64
        line 351: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22       6     5 number   Ljava/lang/Number;
           43       6     5 string   Ljava/lang/String;
           64      17     5  bool   Ljava/lang/Boolean;
            0      83     0  this   Lext/mods/commons/data/StatSet;
            0      83     1   key   Ljava/lang/String;
            0      83     2 defaultValue   J
            7      76     4   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/lang/Object ]
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/lang/Boolean ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ long ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public long[] getLongArray(java.lang.String);
    descriptor: (Ljava/lang/String;)[J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #185                // class "[J"
        10: ifeq          20
        13: aload_2
        14: checkcast     #185                // class "[J"
        17: astore_3
        18: aload_3
        19: areturn
        20: aload_2
        21: instanceof    #61                 // class java/lang/Number
        24: ifeq          43
        27: aload_2
        28: checkcast     #61                 // class java/lang/Number
        31: astore_3
        32: iconst_1
        33: newarray       long
        35: dup
        36: iconst_0
        37: aload_3
        38: invokevirtual #176                // Method java/lang/Number.longValue:()J
        41: lastore
        42: areturn
        43: aload_2
        44: instanceof    #55                 // class java/lang/String
        47: ifeq          80
        50: aload_2
        51: checkcast     #55                 // class java/lang/String
        54: astore_3
        55: aload_3
        56: ldc           #105                // String ;
        58: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        61: invokestatic  #111                // InterfaceMethod java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
        64: invokedynamic #187,  0            // InvokeDynamic #10:applyAsLong:()Ljava/util/function/ToLongFunction;
        69: invokeinterface #191,  2          // InterfaceMethod java/util/stream/Stream.mapToLong:(Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;
        74: invokeinterface #195,  1          // InterfaceMethod java/util/stream/LongStream.toArray:()[J
        79: areturn
        80: new           #67                 // class java/lang/IllegalArgumentException
        83: dup
        84: aload_2
        85: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        88: aload_1
        89: invokedynamic #200,  0            // InvokeDynamic #11:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        94: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        97: athrow
      LineNumberTable:
        line 356: 0
        line 358: 6
        line 359: 18
        line 361: 20
        line 362: 32
        line 364: 38
        line 362: 42
        line 367: 43
        line 368: 55
        line 370: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       2     3 array   [J
           32      11     3 number   Ljava/lang/Number;
           55      25     3 string   Ljava/lang/String;
            0      98     0  this   Lext/mods/commons/data/StatSet;
            0      98     1   key   Ljava/lang/String;
            6      92     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/Object ]
        frame_type = 22 /* same */
        frame_type = 36 /* same */

  public <T extends java.lang.Object, U extends java.lang.Object> java.util.Map<T, U> getMap(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: ifnonnull     14
        10: invokestatic  #201                // Method java/util/Collections.emptyMap:()Ljava/util/Map;
        13: areturn
        14: aload_2
        15: checkcast     #205                // class java/util/Map
        18: areturn
      LineNumberTable:
        line 376: 0
        line 378: 6
        line 379: 10
        line 381: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/data/StatSet;
            0      19     1   key   Ljava/lang/String;
            6      13     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/lang/Object ]
    Signature: #408                         // <T:Ljava/lang/Object;U:Ljava/lang/Object;>(Ljava/lang/String;)Ljava/util/Map<TT;TU;>;

  public java.lang.String getString(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: ifnull        15
        10: aload_2
        11: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        14: areturn
        15: new           #67                 // class java/lang/IllegalArgumentException
        18: dup
        19: aload_1
        20: invokedynamic #207,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        25: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        28: athrow
      LineNumberTable:
        line 386: 0
        line 388: 6
        line 389: 10
        line 391: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/commons/data/StatSet;
            0      29     1   key   Ljava/lang/String;
            6      23     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/lang/Object ]

  public java.lang.String getString(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_3
         6: aload_3
         7: ifnull        15
        10: aload_3
        11: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        14: areturn
        15: aload_2
        16: areturn
      LineNumberTable:
        line 396: 0
        line 398: 6
        line 399: 10
        line 401: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/data/StatSet;
            0      17     1   key   Ljava/lang/String;
            0      17     2 defaultValue   Ljava/lang/String;
            6      11     3   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/lang/Object ]

  public java.lang.String[] getStringArray(java.lang.String, java.lang.String[]);
    descriptor: (Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #210                // Method getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
         5: areturn
         6: astore_3
         7: aload_2
         8: areturn
      Exception table:
         from    to  target type
             0     5     6   Class java/lang/Exception
      LineNumberTable:
        line 408: 0
        line 410: 6
        line 412: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7       2     3     e   Ljava/lang/Exception;
            0       9     0  this   Lext/mods/commons/data/StatSet;
            0       9     1   key   Ljava/lang/String;
            0       9     2 defaultArray   [Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]

  public java.lang.String[] getStringArray(java.lang.String);
    descriptor: (Ljava/lang/String;)[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #215                // class "[Ljava/lang/String;"
        10: ifeq          20
        13: aload_2
        14: checkcast     #215                // class "[Ljava/lang/String;"
        17: astore_3
        18: aload_3
        19: areturn
        20: aload_2
        21: instanceof    #55                 // class java/lang/String
        24: ifeq          39
        27: aload_2
        28: checkcast     #55                 // class java/lang/String
        31: astore_3
        32: aload_3
        33: ldc           #105                // String ;
        35: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        38: areturn
        39: new           #67                 // class java/lang/IllegalArgumentException
        42: dup
        43: aload_2
        44: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        47: aload_1
        48: invokedynamic #217,  0            // InvokeDynamic #13:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        53: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        56: athrow
      LineNumberTable:
        line 418: 0
        line 420: 6
        line 421: 18
        line 423: 20
        line 424: 32
        line 426: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       2     3 array   [Ljava/lang/String;
           32       7     3 string   Ljava/lang/String;
            0      57     0  this   Lext/mods/commons/data/StatSet;
            0      57     1   key   Ljava/lang/String;
            6      51     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/Object ]
        frame_type = 18 /* same */

  public ext.mods.gameserver.model.location.Location getLocation(java.lang.String, ext.mods.gameserver.model.location.Location);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #218                // Method getLocation:(Ljava/lang/String;)Lext/mods/gameserver/model/location/Location;
         5: areturn
         6: astore_3
         7: aload_2
         8: areturn
      Exception table:
         from    to  target type
             0     5     6   Class java/lang/Exception
      LineNumberTable:
        line 433: 0
        line 435: 6
        line 437: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7       2     3     e   Ljava/lang/Exception;
            0       9     0  this   Lext/mods/commons/data/StatSet;
            0       9     1   key   Ljava/lang/String;
            0       9     2 defaultLoc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 1
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]

  public ext.mods.gameserver.model.location.Location getLocation(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #222                // class ext/mods/gameserver/model/location/Location
        10: ifeq          20
        13: aload_2
        14: checkcast     #222                // class ext/mods/gameserver/model/location/Location
        17: astore_3
        18: aload_3
        19: areturn
        20: aload_2
        21: instanceof    #55                 // class java/lang/String
        24: ifeq          88
        27: aload_2
        28: checkcast     #55                 // class java/lang/String
        31: astore_3
        32: aload_3
        33: ldc           #105                // String ;
        35: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        38: invokestatic  #224                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
        41: invokedynamic #229,  0            // InvokeDynamic #14:apply:()Ljava/util/function/Function;
        46: invokeinterface #233,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        51: invokedynamic #150,  0            // InvokeDynamic #7:applyAsInt:()Ljava/util/function/ToIntFunction;
        56: invokeinterface #154,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        61: invokeinterface #158,  1          // InterfaceMethod java/util/stream/IntStream.toArray:()[I
        66: astore        4
        68: new           #222                // class ext/mods/gameserver/model/location/Location
        71: dup
        72: aload         4
        74: iconst_0
        75: iaload
        76: aload         4
        78: iconst_1
        79: iaload
        80: aload         4
        82: iconst_2
        83: iaload
        84: invokespecial #237                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        87: areturn
        88: new           #67                 // class java/lang/IllegalArgumentException
        91: dup
        92: aload_2
        93: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        96: aload_1
        97: invokedynamic #240,  0            // InvokeDynamic #15:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       102: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
       105: athrow
      LineNumberTable:
        line 443: 0
        line 445: 6
        line 446: 18
        line 448: 20
        line 450: 32
        line 451: 68
        line 454: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       2     3   loc   Lext/mods/gameserver/model/location/Location;
           68      20     4   arr   [I
           32      56     3 string   Ljava/lang/String;
            0     106     0  this   Lext/mods/commons/data/StatSet;
            0     106     1   key   Ljava/lang/String;
            6     100     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/Object ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67

  public ext.mods.gameserver.model.holder.IntIntHolder getIntIntHolder(java.lang.String, ext.mods.gameserver.model.holder.IntIntHolder);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/holder/IntIntHolder;)Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #241                // Method getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
         5: areturn
         6: astore_3
         7: aload_2
         8: areturn
      Exception table:
         from    to  target type
             0     5     6   Class java/lang/Exception
      LineNumberTable:
        line 461: 0
        line 463: 6
        line 465: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7       2     3     e   Ljava/lang/Exception;
            0       9     0  this   Lext/mods/commons/data/StatSet;
            0       9     1   key   Ljava/lang/String;
            0       9     2 defaultHolder   Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 1
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]

  public ext.mods.gameserver.model.holder.IntIntHolder getIntIntHolder(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #215                // class "[Ljava/lang/String;"
        10: ifeq          38
        13: aload_2
        14: checkcast     #215                // class "[Ljava/lang/String;"
        17: astore_3
        18: new           #245                // class ext/mods/gameserver/model/holder/IntIntHolder
        21: dup
        22: aload_3
        23: iconst_0
        24: aaload
        25: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        28: aload_3
        29: iconst_1
        30: aaload
        31: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        34: invokespecial #247                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        37: areturn
        38: aload_2
        39: instanceof    #55                 // class java/lang/String
        42: ifeq          80
        45: aload_2
        46: checkcast     #55                 // class java/lang/String
        49: astore_3
        50: aload_3
        51: ldc           #250                // String -
        53: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        56: astore        4
        58: new           #245                // class ext/mods/gameserver/model/holder/IntIntHolder
        61: dup
        62: aload         4
        64: iconst_0
        65: aaload
        66: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        69: aload         4
        71: iconst_1
        72: aaload
        73: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        76: invokespecial #247                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        79: areturn
        80: new           #67                 // class java/lang/IllegalArgumentException
        83: dup
        84: aload_2
        85: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        88: aload_1
        89: invokedynamic #252,  0            // InvokeDynamic #16:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        94: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        97: athrow
      LineNumberTable:
        line 471: 0
        line 473: 6
        line 474: 18
        line 476: 38
        line 478: 50
        line 479: 58
        line 482: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18      20     3 array   [Ljava/lang/String;
           58      22     4 toSplit   [Ljava/lang/String;
           50      30     3 string   Ljava/lang/String;
            0      98     0  this   Lext/mods/commons/data/StatSet;
            0      98     1   key   Ljava/lang/String;
            6      92     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class java/lang/Object ]
        frame_type = 41 /* same */

  public ext.mods.gameserver.model.holder.IntIntHolder[] getIntIntHolderArray(java.lang.String, ext.mods.gameserver.model.holder.IntIntHolder[]);
    descriptor: (Ljava/lang/String;[Lext/mods/gameserver/model/holder/IntIntHolder;)[Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #253                // Method getIntIntHolderArray:(Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
         5: areturn
         6: astore_3
         7: aload_2
         8: areturn
      Exception table:
         from    to  target type
             0     5     6   Class java/lang/Exception
      LineNumberTable:
        line 489: 0
        line 491: 6
        line 493: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7       2     3     e   Ljava/lang/Exception;
            0       9     0  this   Lext/mods/commons/data/StatSet;
            0       9     1   key   Ljava/lang/String;
            0       9     2 defaultHolderArray   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 1
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]

  public ext.mods.gameserver.model.holder.IntIntHolder[] getIntIntHolderArray(java.lang.String);
    descriptor: (Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=12, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #215                // class "[Ljava/lang/String;"
        10: ifeq          100
        13: aload_2
        14: checkcast     #215                // class "[Ljava/lang/String;"
        17: astore_3
        18: aload_3
        19: arraylength
        20: anewarray     #245                // class ext/mods/gameserver/model/holder/IntIntHolder
        23: astore        4
        25: iconst_0
        26: istore        5
        28: aload_3
        29: astore        6
        31: aload         6
        33: arraylength
        34: istore        7
        36: iconst_0
        37: istore        8
        39: iload         8
        41: iload         7
        43: if_icmpge     97
        46: aload         6
        48: iload         8
        50: aaload
        51: astore        9
        53: aload         9
        55: ldc           #250                // String -
        57: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        60: astore        10
        62: aload         4
        64: iload         5
        66: iinc          5, 1
        69: new           #245                // class ext/mods/gameserver/model/holder/IntIntHolder
        72: dup
        73: aload         10
        75: iconst_0
        76: aaload
        77: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        80: aload         10
        82: iconst_1
        83: aaload
        84: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        87: invokespecial #247                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        90: aastore
        91: iinc          8, 1
        94: goto          39
        97: aload         4
        99: areturn
       100: aload_2
       101: instanceof    #55                 // class java/lang/String
       104: ifeq          267
       107: aload_2
       108: checkcast     #55                 // class java/lang/String
       111: astore_3
       112: aload_3
       113: invokevirtual #257                // Method java/lang/String.isEmpty:()Z
       116: ifeq          124
       119: iconst_0
       120: anewarray     #245                // class ext/mods/gameserver/model/holder/IntIntHolder
       123: areturn
       124: aload_3
       125: ldc           #105                // String ;
       127: invokevirtual #260                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       130: ifne          175
       133: aload_3
       134: ldc           #250                // String -
       136: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       139: astore        4
       141: iconst_1
       142: anewarray     #245                // class ext/mods/gameserver/model/holder/IntIntHolder
       145: astore        5
       147: aload         5
       149: iconst_0
       150: new           #245                // class ext/mods/gameserver/model/holder/IntIntHolder
       153: dup
       154: aload         4
       156: iconst_0
       157: aaload
       158: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       161: aload         4
       163: iconst_1
       164: aaload
       165: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       168: invokespecial #247                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
       171: aastore
       172: aload         5
       174: areturn
       175: aload_3
       176: ldc           #105                // String ;
       178: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       181: astore        4
       183: aload         4
       185: arraylength
       186: anewarray     #245                // class ext/mods/gameserver/model/holder/IntIntHolder
       189: astore        5
       191: iconst_0
       192: istore        6
       194: aload         4
       196: astore        7
       198: aload         7
       200: arraylength
       201: istore        8
       203: iconst_0
       204: istore        9
       206: iload         9
       208: iload         8
       210: if_icmpge     264
       213: aload         7
       215: iload         9
       217: aaload
       218: astore        10
       220: aload         10
       222: ldc           #250                // String -
       224: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       227: astore        11
       229: aload         5
       231: iload         6
       233: iinc          6, 1
       236: new           #245                // class ext/mods/gameserver/model/holder/IntIntHolder
       239: dup
       240: aload         11
       242: iconst_0
       243: aaload
       244: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       247: aload         11
       249: iconst_1
       250: aaload
       251: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       254: invokespecial #247                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
       257: aastore
       258: iinc          9, 1
       261: goto          206
       264: aload         5
       266: areturn
       267: new           #67                 // class java/lang/IllegalArgumentException
       270: dup
       271: aload_2
       272: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       275: aload_1
       276: invokedynamic #264,  0            // InvokeDynamic #17:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       281: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
       284: athrow
      LineNumberTable:
        line 499: 0
        line 501: 6
        line 503: 18
        line 505: 25
        line 506: 28
        line 508: 53
        line 509: 62
        line 506: 91
        line 512: 97
        line 515: 100
        line 517: 112
        line 518: 119
        line 520: 124
        line 522: 133
        line 523: 141
        line 524: 147
        line 525: 172
        line 528: 175
        line 530: 183
        line 532: 191
        line 533: 194
        line 535: 220
        line 536: 229
        line 533: 258
        line 539: 264
        line 542: 267
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           62      29    10 splittedHolder   [Ljava/lang/String;
           53      38     9 splitted   Ljava/lang/String;
           25      75     4 tempArray   [Lext/mods/gameserver/model/holder/IntIntHolder;
           28      72     5 index   I
           18      82     3 array   [Ljava/lang/String;
          141      34     4 toSplit   [Ljava/lang/String;
          147      28     5 tempArray   [Lext/mods/gameserver/model/holder/IntIntHolder;
          229      29    11 splittedHolder   [Ljava/lang/String;
          220      38    10 splitted   Ljava/lang/String;
          183      84     4 toSplit   [Ljava/lang/String;
          191      76     5 tempArray   [Lext/mods/gameserver/model/holder/IntIntHolder;
          194      73     6 index   I
          112     155     3 string   Ljava/lang/String;
            0     285     0  this   Lext/mods/commons/data/StatSet;
            0     285     1   key   Ljava/lang/String;
            6     279     2   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/commons/data/StatSet, class java/lang/String, class java/lang/Object, class "[Ljava/lang/String;", class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 57
        frame_type = 248 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/String ]
        frame_type = 50 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/commons/data/StatSet, class java/lang/String, class java/lang/Object, class java/lang/String, class "[Ljava/lang/String;", class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 57
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/commons/data/StatSet, class java/lang/String, class java/lang/Object ]
          stack = []

  public java.util.List<ext.mods.gameserver.model.holder.IntIntHolder> getIntIntHolderList(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=11, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_2
         6: aload_2
         7: instanceof    #55                 // class java/lang/String
        10: ifeq          171
        13: aload_2
        14: checkcast     #55                 // class java/lang/String
        17: astore_3
        18: aload_3
        19: invokevirtual #257                // Method java/lang/String.isEmpty:()Z
        22: ifeq          29
        25: invokestatic  #168                // Method java/util/Collections.emptyList:()Ljava/util/List;
        28: areturn
        29: aload_3
        30: ldc           #105                // String ;
        32: invokevirtual #260                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        35: ifne          78
        38: aload_3
        39: ldc           #250                // String -
        41: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        44: astore        4
        46: iconst_1
        47: anewarray     #245                // class ext/mods/gameserver/model/holder/IntIntHolder
        50: dup
        51: iconst_0
        52: new           #245                // class ext/mods/gameserver/model/holder/IntIntHolder
        55: dup
        56: aload         4
        58: iconst_0
        59: aaload
        60: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        63: aload         4
        65: iconst_1
        66: aaload
        67: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        70: invokespecial #247                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        73: aastore
        74: invokestatic  #265                // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        77: areturn
        78: aload_3
        79: ldc           #105                // String ;
        81: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        84: astore        4
        86: new           #269                // class java/util/ArrayList
        89: dup
        90: aload         4
        92: arraylength
        93: invokespecial #271                // Method java/util/ArrayList."<init>":(I)V
        96: astore        5
        98: aload         4
       100: astore        6
       102: aload         6
       104: arraylength
       105: istore        7
       107: iconst_0
       108: istore        8
       110: iload         8
       112: iload         7
       114: if_icmpge     168
       117: aload         6
       119: iload         8
       121: aaload
       122: astore        9
       124: aload         9
       126: ldc           #250                // String -
       128: invokevirtual #107                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       131: astore        10
       133: aload         5
       135: new           #245                // class ext/mods/gameserver/model/holder/IntIntHolder
       138: dup
       139: aload         10
       141: iconst_0
       142: aaload
       143: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       146: aload         10
       148: iconst_1
       149: aaload
       150: invokestatic  #143                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       153: invokespecial #247                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
       156: invokeinterface #272,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       161: pop
       162: iinc          8, 1
       165: goto          110
       168: aload         5
       170: areturn
       171: new           #67                 // class java/lang/IllegalArgumentException
       174: dup
       175: aload_2
       176: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       179: aload_1
       180: invokedynamic #275,  0            // InvokeDynamic #18:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       185: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
       188: athrow
      LineNumberTable:
        line 547: 0
        line 549: 6
        line 551: 18
        line 552: 25
        line 554: 29
        line 556: 38
        line 557: 46
        line 560: 78
        line 561: 86
        line 563: 98
        line 565: 124
        line 566: 133
        line 563: 162
        line 569: 168
        line 572: 171
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46      32     4 toSplit   [Ljava/lang/String;
          133      29    10 toSplit   [Ljava/lang/String;
          124      38     9 entry   Ljava/lang/String;
           86      85     4 entries   [Ljava/lang/String;
           98      73     5  list   Ljava/util/List;
           18     153     3 string   Ljava/lang/String;
            0     189     0  this   Lext/mods/commons/data/StatSet;
            0     189     1   key   Ljava/lang/String;
            6     183     2   val   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           98      73     5  list   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class java/lang/Object, class java/lang/String ]
        frame_type = 48 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/commons/data/StatSet, class java/lang/String, class java/lang/Object, class java/lang/String, class "[Ljava/lang/String;", class java/util/List, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 57
        frame_type = 248 /* chop */
          offset_delta = 2
    Signature: #434                         // (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;

  public java.util.List<ext.mods.gameserver.model.holder.IntIntHolder> getIntIntHolderList(java.lang.String, java.util.List<ext.mods.gameserver.model.holder.IntIntHolder>);
    descriptor: (Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #276                // Method getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
         5: areturn
         6: astore_3
         7: aload_2
         8: areturn
      Exception table:
         from    to  target type
             0     5     6   Class java/lang/IllegalArgumentException
      LineNumberTable:
        line 579: 0
        line 581: 6
        line 583: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7       2     3     e   Ljava/lang/IllegalArgumentException;
            0       9     0  this   Lext/mods/commons/data/StatSet;
            0       9     1   key   Ljava/lang/String;
            0       9     2 defaultHolder   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       9     2 defaultHolder   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 1
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/IllegalArgumentException ]
    Signature: #436                         // (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;

  public <A extends java.lang.Object> A getObject(java.lang.String, java.lang.Class<A>);
    descriptor: (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_3
         6: aload_3
         7: ifnull        21
        10: aload_2
        11: aload_3
        12: invokevirtual #280                // Method java/lang/Object.getClass:()Ljava/lang/Class;
        15: invokevirtual #286                // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        18: ifne          23
        21: aconst_null
        22: areturn
        23: aload_3
        24: areturn
      LineNumberTable:
        line 590: 0
        line 592: 6
        line 593: 21
        line 595: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/commons/data/StatSet;
            0      25     1   key   Ljava/lang/String;
            0      25     2  type   Ljava/lang/Class;
            6      19     3   val   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      25     2  type   Ljava/lang/Class<TA;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/lang/Object ]
        frame_type = 1 /* same */
    Signature: #442                         // <A:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TA;>;)TA;

  public <E extends java.lang.Enum<E>> E getEnum(java.lang.String, java.lang.Class<E>);
    descriptor: (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore_3
         6: aload_3
         7: ifnull        23
        10: aload_2
        11: aload_3
        12: invokevirtual #292                // Method java/lang/Class.isInstance:(Ljava/lang/Object;)Z
        15: ifeq          23
        18: aload_3
        19: checkcast     #295                // class java/lang/Enum
        22: areturn
        23: aload_3
        24: instanceof    #55                 // class java/lang/String
        27: ifeq          43
        30: aload_3
        31: checkcast     #55                 // class java/lang/String
        34: astore        4
        36: aload_2
        37: aload         4
        39: invokestatic  #297                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        42: areturn
        43: new           #67                 // class java/lang/IllegalArgumentException
        46: dup
        47: aload_2
        48: invokevirtual #300                // Method java/lang/Class.getName:()Ljava/lang/String;
        51: aload_3
        52: invokestatic  #69                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        55: invokedynamic #304,  0            // InvokeDynamic #19:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        60: invokespecial #76                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        63: athrow
      LineNumberTable:
        line 601: 0
        line 603: 6
        line 604: 18
        line 606: 23
        line 607: 36
        line 609: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36       7     4 string   Ljava/lang/String;
            0      64     0  this   Lext/mods/commons/data/StatSet;
            0      64     1  name   Ljava/lang/String;
            0      64     2 enumClass   Ljava/lang/Class;
            6      58     3   val   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      64     2 enumClass   Ljava/lang/Class<TE;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/Object ]
        frame_type = 19 /* same */
    Signature: #448                         // <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/String;Ljava/lang/Class<TE;>;)TE;

  public <E extends java.lang.Enum<E>> E getEnum(java.lang.String, java.lang.Class<E>, E);
    descriptor: (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: astore        4
         7: aload         4
         9: ifnull        27
        12: aload_2
        13: aload         4
        15: invokevirtual #292                // Method java/lang/Class.isInstance:(Ljava/lang/Object;)Z
        18: ifeq          27
        21: aload         4
        23: checkcast     #295                // class java/lang/Enum
        26: areturn
        27: aload         4
        29: instanceof    #55                 // class java/lang/String
        32: ifeq          49
        35: aload         4
        37: checkcast     #55                 // class java/lang/String
        40: astore        5
        42: aload_2
        43: aload         5
        45: invokestatic  #297                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        48: areturn
        49: aload_3
        50: areturn
      LineNumberTable:
        line 615: 0
        line 617: 7
        line 618: 21
        line 620: 27
        line 621: 42
        line 623: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42       7     5 string   Ljava/lang/String;
            0      51     0  this   Lext/mods/commons/data/StatSet;
            0      51     1  name   Ljava/lang/String;
            0      51     2 enumClass   Ljava/lang/Class;
            0      51     3 defaultValue   Ljava/lang/Enum;
            7      44     4   val   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      51     2 enumClass   Ljava/lang/Class<TE;>;
            0      51     3 defaultValue   TE;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/Object ]
        frame_type = 21 /* same */
    Signature: #451                         // <E:Ljava/lang/Enum<TE;>;>(Ljava/lang/String;Ljava/lang/Class<TE;>;TE;)TE;

  public ext.mods.gameserver.network.NpcStringId getNpcStringId(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/network/NpcStringId;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #305                // Method getInteger:(Ljava/lang/String;)I
         5: invokestatic  #308                // Method ext/mods/gameserver/network/NpcStringId.get:(I)Lext/mods/gameserver/network/NpcStringId;
         8: areturn
      LineNumberTable:
        line 628: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/StatSet;
            0       9     1  name   Ljava/lang/String;

  public ext.mods.gameserver.network.NpcStringId getNpcStringId(java.lang.String, ext.mods.gameserver.network.NpcStringId);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/NpcStringId;)Lext/mods/gameserver/network/NpcStringId;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokevirtual #313                // Method getInteger:(Ljava/lang/String;I)I
         6: istore_3
         7: iload_3
         8: ifle          18
        11: iload_3
        12: invokestatic  #308                // Method ext/mods/gameserver/network/NpcStringId.get:(I)Lext/mods/gameserver/network/NpcStringId;
        15: goto          19
        18: aload_2
        19: areturn
      LineNumberTable:
        line 633: 0
        line 634: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/data/StatSet;
            0      20     1  name   Ljava/lang/String;
            0      20     2 defaultValue   Lext/mods/gameserver/network/NpcStringId;
            7      13     3    id   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/NpcStringId ]

  public void merge(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #316                // Method isEmpty:()Z
         8: ifeq          12
        11: return
        12: aload_1
        13: invokevirtual #317                // Method entrySet:()Ljava/util/Set;
        16: invokeinterface #321,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        21: astore_2
        22: aload_2
        23: invokeinterface #327,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        28: ifeq          64
        31: aload_2
        32: invokeinterface #332,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #336                // class java/util/Map$Entry
        40: astore_3
        41: aload_0
        42: aload_3
        43: invokeinterface #338,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        48: checkcast     #55                 // class java/lang/String
        51: aload_3
        52: invokeinterface #341,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        57: invokevirtual #13                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        60: pop
        61: goto          22
        64: return
      LineNumberTable:
        line 639: 0
        line 641: 11
        line 643: 12
        line 645: 41
        line 646: 61
        line 647: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      20     3 entry   Ljava/util/Map$Entry;
            0      65     0  this   Lext/mods/commons/data/StatSet;
            0      65     1 other   Lext/mods/commons/data/StatSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           41      20     3 entry   Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;
      StackMapTable: number_of_entries = 4
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 41
}
Signature: #461                         // Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;
SourceFile: "StatSet.java"
BootstrapMethods:
  0: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #465 StatSet : Boolean value required, but found: \u0001 for key: \u0001.
  1: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #467 StatSet : Byte value required, but found: \u0001 for key: \u0001.
  2: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #469 StatSet : Double value required, but found: \u0001 for key: \u0001.
  3: #521 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #471 (Ljava/lang/Object;)D
      #473 REF_invokeStatic java/lang/Double.parseDouble:(Ljava/lang/String;)D
      #474 (Ljava/lang/String;)D
  4: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #475 StatSet : Double array required, but found: \u0001 for key: \u0001.
  5: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #477 StatSet : Float value required, but found: \u0001 for key: \u0001.
  6: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #479 StatSet : Integer value required, but found: \u0001 for key: \u0001.
  7: #521 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #481 (Ljava/lang/Object;)I
      #483 REF_invokeStatic java/lang/Integer.parseInt:(Ljava/lang/String;)I
      #484 (Ljava/lang/String;)I
  8: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #485 StatSet : Integer array required, but found: \u0001 for key: \u0001.
  9: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #487 StatSet : Long value required, but found: \u0001 for key: \u0001.
  10: #521 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #489 (Ljava/lang/Object;)J
      #491 REF_invokeStatic java/lang/Long.parseLong:(Ljava/lang/String;)J
      #492 (Ljava/lang/String;)J
  11: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #493 StatSet : Long array required, but found: \u0001 for key: \u0001.
  12: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #495 StatSet : String value required, but unspecified for key: \u0001.
  13: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #497 StatSet : String array required, but found: \u0001 for key: \u0001.
  14: #521 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #499 (Ljava/lang/Object;)Ljava/lang/Object;
      #500 REF_invokeVirtual java/lang/String.trim:()Ljava/lang/String;
      #504 (Ljava/lang/String;)Ljava/lang/String;
  15: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #505 StatSet : Location required, but found: \u0001 for key: \u0001.
  16: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #507 StatSet : int-int (IntIntHolder) required, but found: \u0001 for key: \u0001.
  17: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #509 StatSet : int-int;int-int (int[] IntIntHolder) required, but found: \u0001 for key: \u0001.
  18: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #511 StatSet : int-int;int-int (List<IntIntHolder>) required, but found: \u0001 for key: \u0001.
  19: #515 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #513 StatSet : Enum value of type \u0001 required, but found: \u0001.
InnerClasses:
  public static #529= #336 of #205;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #534= #530 of #532; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
