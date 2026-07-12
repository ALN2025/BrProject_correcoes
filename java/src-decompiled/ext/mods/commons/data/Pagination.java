// Bytecode for: ext.mods.commons.data.Pagination
// File: ext\mods\commons\data\Pagination.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/data/Pagination.class
  Last modified 9 de jul de 2026; size 9186 bytes
  MD5 checksum 7440035ebb415482606db79bc04af3cc
  Compiled from "Pagination.java"
public class ext.mods.commons.data.Pagination<A extends java.lang.Object> extends java.util.AbstractList<A>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #2                          // ext/mods/commons/data/Pagination
  super_class: #8                         // java/util/AbstractList
  interfaces: 0, fields: 7, methods: 20, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
    #2 = Class              #4            // ext/mods/commons/data/Pagination
    #3 = NameAndType        #5:#6         // "<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
    #4 = Utf8               ext/mods/commons/data/Pagination
    #5 = Utf8               <init>
    #6 = Utf8               (Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
    #7 = Methodref          #8.#9         // java/util/AbstractList."<init>":()V
    #8 = Class              #10           // java/util/AbstractList
    #9 = NameAndType        #5:#11        // "<init>":()V
   #10 = Utf8               java/util/AbstractList
   #11 = Utf8               ()V
   #12 = Class              #13           // java/lang/StringBuilder
   #13 = Utf8               java/lang/StringBuilder
   #14 = Methodref          #12.#9        // java/lang/StringBuilder."<init>":()V
   #15 = Fieldref           #2.#16        // ext/mods/commons/data/Pagination._content:Ljava/lang/StringBuilder;
   #16 = NameAndType        #17:#18       // _content:Ljava/lang/StringBuilder;
   #17 = Utf8               _content
   #18 = Utf8               Ljava/lang/StringBuilder;
   #19 = Methodref          #2.#20        // ext/mods/commons/data/Pagination.initList:(Ljava/util/stream/Stream;Ljava/util/function/Predicate;Ljava/util/Comparator;)Ljava/util/List;
   #20 = NameAndType        #21:#22       // initList:(Ljava/util/stream/Stream;Ljava/util/function/Predicate;Ljava/util/Comparator;)Ljava/util/List;
   #21 = Utf8               initList
   #22 = Utf8               (Ljava/util/stream/Stream;Ljava/util/function/Predicate;Ljava/util/Comparator;)Ljava/util/List;
   #23 = Fieldref           #2.#24        // ext/mods/commons/data/Pagination._list:Ljava/util/List;
   #24 = NameAndType        #25:#26       // _list:Ljava/util/List;
   #25 = Utf8               _list
   #26 = Utf8               Ljava/util/List;
   #27 = InterfaceMethodref #28.#29       // java/util/List.size:()I
   #28 = Class              #30           // java/util/List
   #29 = NameAndType        #31:#32       // size:()I
   #30 = Utf8               java/util/List
   #31 = Utf8               size
   #32 = Utf8               ()I
   #33 = Fieldref           #2.#34        // ext/mods/commons/data/Pagination._totalEntries:I
   #34 = NameAndType        #35:#36       // _totalEntries:I
   #35 = Utf8               _totalEntries
   #36 = Utf8               I
   #37 = Methodref          #38.#39       // java/lang/Math.max:(II)I
   #38 = Class              #40           // java/lang/Math
   #39 = NameAndType        #41:#42       // max:(II)I
   #40 = Utf8               java/lang/Math
   #41 = Utf8               max
   #42 = Utf8               (II)I
   #43 = Fieldref           #2.#44        // ext/mods/commons/data/Pagination._limit:I
   #44 = NameAndType        #45:#36       // _limit:I
   #45 = Utf8               _limit
   #46 = Fieldref           #2.#47        // ext/mods/commons/data/Pagination._total:I
   #47 = NameAndType        #48:#36       // _total:I
   #48 = Utf8               _total
   #49 = Methodref          #38.#50       // java/lang/Math.clamp:(JII)I
   #50 = NameAndType        #51:#52       // clamp:(JII)I
   #51 = Utf8               clamp
   #52 = Utf8               (JII)I
   #53 = Fieldref           #2.#54        // ext/mods/commons/data/Pagination._page:I
   #54 = NameAndType        #55:#36       // _page:I
   #55 = Utf8               _page
   #56 = InterfaceMethodref #28.#57       // java/util/List.isEmpty:()Z
   #57 = NameAndType        #58:#59       // isEmpty:()Z
   #58 = Utf8               isEmpty
   #59 = Utf8               ()Z
   #60 = Methodref          #38.#61       // java/lang/Math.min:(II)I
   #61 = NameAndType        #62:#42       // min:(II)I
   #62 = Utf8               min
   #63 = InterfaceMethodref #28.#64       // java/util/List.subList:(II)Ljava/util/List;
   #64 = NameAndType        #65:#66       // subList:(II)Ljava/util/List;
   #65 = Utf8               subList
   #66 = Utf8               (II)Ljava/util/List;
   #67 = Methodref          #68.#69       // java/util/Collections.emptyList:()Ljava/util/List;
   #68 = Class              #70           // java/util/Collections
   #69 = NameAndType        #71:#72       // emptyList:()Ljava/util/List;
   #70 = Utf8               java/util/Collections
   #71 = Utf8               emptyList
   #72 = Utf8               ()Ljava/util/List;
   #73 = InterfaceMethodref #74.#75       // java/util/stream/Stream.toList:()Ljava/util/List;
   #74 = Class              #76           // java/util/stream/Stream
   #75 = NameAndType        #77:#72       // toList:()Ljava/util/List;
   #76 = Utf8               java/util/stream/Stream
   #77 = Utf8               toList
   #78 = InterfaceMethodref #74.#79       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #79 = NameAndType        #80:#81       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #80 = Utf8               filter
   #81 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #82 = InterfaceMethodref #74.#83       // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #83 = NameAndType        #84:#85       // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #84 = Utf8               sorted
   #85 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #86 = Methodref          #87.#88       // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #87 = Class              #89           // ext/mods/commons/lang/StringUtil
   #88 = NameAndType        #90:#91       // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #89 = Utf8               ext/mods/commons/lang/StringUtil
   #90 = Utf8               append
   #91 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #92 = Methodref          #2.#29        // ext/mods/commons/data/Pagination.size:()I
   #93 = InterfaceMethodref #94.#95       // java/util/stream/IntStream.range:(II)Ljava/util/stream/IntStream;
   #94 = Class              #96           // java/util/stream/IntStream
   #95 = NameAndType        #97:#98       // range:(II)Ljava/util/stream/IntStream;
   #96 = Utf8               java/util/stream/IntStream
   #97 = Utf8               range
   #98 = Utf8               (II)Ljava/util/stream/IntStream;
   #99 = InvokeDynamic      #0:#100       // #0:accept:(Lext/mods/commons/data/Pagination;)Ljava/util/function/IntConsumer;
  #100 = NameAndType        #101:#102     // accept:(Lext/mods/commons/data/Pagination;)Ljava/util/function/IntConsumer;
  #101 = Utf8               accept
  #102 = Utf8               (Lext/mods/commons/data/Pagination;)Ljava/util/function/IntConsumer;
  #103 = InterfaceMethodref #94.#104      // java/util/stream/IntStream.forEach:(Ljava/util/function/IntConsumer;)V
  #104 = NameAndType        #105:#106     // forEach:(Ljava/util/function/IntConsumer;)V
  #105 = Utf8               forEach
  #106 = Utf8               (Ljava/util/function/IntConsumer;)V
  #107 = InvokeDynamic      #1:#108       // #1:accept:(Lext/mods/commons/data/Pagination;I)Ljava/util/function/IntConsumer;
  #108 = NameAndType        #101:#109     // accept:(Lext/mods/commons/data/Pagination;I)Ljava/util/function/IntConsumer;
  #109 = Utf8               (Lext/mods/commons/data/Pagination;I)Ljava/util/function/IntConsumer;
  #110 = Class              #111          // java/lang/Object
  #111 = Utf8               java/lang/Object
  #112 = String             #113          // <table width=280 bgcolor=000000><tr><td FIXWIDTH=22 align=center><img height=2><button action=\"
  #113 = Utf8               <table width=280 bgcolor=000000><tr><td FIXWIDTH=22 align=center><img height=2><button action=\"
  #114 = String             #115          // %page%
  #115 = Utf8               %page%
  #116 = Methodref          #117.#118     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #117 = Class              #119          // java/lang/String
  #118 = NameAndType        #120:#121     // valueOf:(I)Ljava/lang/String;
  #119 = Utf8               java/lang/String
  #120 = Utf8               valueOf
  #121 = Utf8               (I)Ljava/lang/String;
  #122 = Methodref          #117.#123     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #123 = NameAndType        #124:#125     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #124 = Utf8               replace
  #125 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #126 = String             #127          // \" back=L2UI_CH3.prev1_down fore=L2UI_CH3.prev1 width=16 height=16></td>
  #127 = Utf8               \" back=L2UI_CH3.prev1_down fore=L2UI_CH3.prev1 width=16 height=16></td>
  #128 = Methodref          #2.#129       // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #129 = NameAndType        #90:#130      // append:([Ljava/lang/Object;)V
  #130 = Utf8               ([Ljava/lang/Object;)V
  #131 = String             #132          // <td FIXWIDTH=26 align=center>
  #132 = Utf8               <td FIXWIDTH=26 align=center>
  #133 = String             #134          //
  #134 = Utf8
  #135 = String             #136          // %02d
  #136 = Utf8               %02d
  #137 = Methodref          #138.#139     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #138 = Class              #140          // java/lang/Integer
  #139 = NameAndType        #120:#141     // valueOf:(I)Ljava/lang/Integer;
  #140 = Utf8               java/lang/Integer
  #141 = Utf8               (I)Ljava/lang/Integer;
  #142 = Methodref          #117.#143     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #143 = NameAndType        #144:#145     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #144 = Utf8               format
  #145 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #146 = InvokeDynamic      #2:#147       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #147 = NameAndType        #148:#149     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #148 = Utf8               makeConcatWithConstants
  #149 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #150 = String             #151          // </td>
  #151 = Utf8               </td>
  #152 = String             #153          // <td FIXWIDTH=26 align=center><font color=LEVEL>
  #153 = Utf8               <td FIXWIDTH=26 align=center><font color=LEVEL>
  #154 = String             #155          // </font></td>
  #155 = Utf8               </font></td>
  #156 = String             #157          // <td FIXWIDTH=22 align=center><img height=2><button action=\"
  #157 = Utf8               <td FIXWIDTH=22 align=center><img height=2><button action=\"
  #158 = String             #159          // \" back=L2UI_CH3.next1_down fore=L2UI_CH3.next1 width=16 height=16></td></tr></table>
  #159 = Utf8               \" back=L2UI_CH3.next1_down fore=L2UI_CH3.next1 width=16 height=16></td></tr></table>
  #160 = String             #161          // <img src=\"L2UI.SquareGray\" width=280 height=1>
  #161 = Utf8               <img src=\"L2UI.SquareGray\" width=280 height=1>
  #162 = Methodref          #2.#163       // ext/mods/commons/data/Pagination.generatePagesMedium:(Ljava/lang/String;I)V
  #163 = NameAndType        #164:#165     // generatePagesMedium:(Ljava/lang/String;I)V
  #164 = Utf8               generatePagesMedium
  #165 = Utf8               (Ljava/lang/String;I)V
  #166 = InvokeDynamic      #3:#167       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #167 = NameAndType        #148:#121     // makeConcatWithConstants:(I)Ljava/lang/String;
  #168 = InvokeDynamic      #4:#169       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #169 = NameAndType        #148:#170     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #170 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #171 = String             #172          // <table width=280 height=
  #172 = Utf8               <table width=280 height=
  #173 = String             #174          // ><tr>
  #174 = Utf8               ><tr>
  #175 = String             #176          // <td width=70 align=center>Search</td>
  #176 = Utf8               <td width=70 align=center>Search</td>
  #177 = String             #178          // <td width=140><edit var=\"search\" width=130 height=15></td>
  #178 = Utf8               <td width=140><edit var=\"search\" width=130 height=15></td>
  #179 = String             #180          // <td width=70><button value=\"Find\" action=\"
  #180 = Utf8               <td width=70><button value=\"Find\" action=\"
  #181 = String             #182          //  1 $search\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>
  #182 = Utf8                1 $search\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>
  #183 = String             #184          // </tr><tr>
  #184 = Utf8               </tr><tr>
  #185 = String             #186          // <td></td>
  #186 = Utf8               <td></td>
  #187 = String             #188          // <td align=center>Found
  #188 = Utf8               <td align=center>Found
  #189 = String             #190          //  results</td>
  #190 = Utf8                results</td>
  #191 = String             #192          // </tr></table>
  #192 = Utf8               </tr></table>
  #193 = Methodref          #12.#194      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #194 = NameAndType        #195:#196     // toString:()Ljava/lang/String;
  #195 = Utf8               toString
  #196 = Utf8               ()Ljava/lang/String;
  #197 = Methodref          #12.#198      // java/lang/StringBuilder.setLength:(I)V
  #198 = NameAndType        #199:#200     // setLength:(I)V
  #199 = Utf8               setLength
  #200 = Utf8               (I)V
  #201 = InterfaceMethodref #28.#202      // java/util/List.get:(I)Ljava/lang/Object;
  #202 = NameAndType        #203:#204     // get:(I)Ljava/lang/Object;
  #203 = Utf8               get
  #204 = Utf8               (I)Ljava/lang/Object;
  #205 = String             #206          // <img height=
  #206 = Utf8               <img height=
  #207 = String             #208          // >
  #208 = Utf8               >
  #209 = String             #210          // <img height=17>
  #210 = Utf8               <img height=17>
  #211 = Utf8               NORMAL_LINE_SIZE
  #212 = Utf8               Ljava/lang/String;
  #213 = Utf8               ConstantValue
  #214 = Utf8               Signature
  #215 = Utf8               Ljava/util/List<TA;>;
  #216 = Utf8               (Ljava/util/stream/Stream;II)V
  #217 = Utf8               Code
  #218 = Utf8               LineNumberTable
  #219 = Utf8               LocalVariableTable
  #220 = Utf8               this
  #221 = Utf8               Lext/mods/commons/data/Pagination;
  #222 = Utf8               stream
  #223 = Utf8               Ljava/util/stream/Stream;
  #224 = Utf8               page
  #225 = Utf8               limit
  #226 = Utf8               LocalVariableTypeTable
  #227 = Utf8               Lext/mods/commons/data/Pagination<TA;>;
  #228 = Utf8               Ljava/util/stream/Stream<TA;>;
  #229 = Utf8               (Ljava/util/stream/Stream<TA;>;II)V
  #230 = Utf8               (Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
  #231 = Utf8               Ljava/util/function/Predicate;
  #232 = Utf8               Ljava/util/function/Predicate<TA;>;
  #233 = Utf8               (Ljava/util/stream/Stream<TA;>;IILjava/util/function/Predicate<TA;>;)V
  #234 = Utf8               (Ljava/util/stream/Stream;IILjava/util/Comparator;)V
  #235 = Utf8               comparator
  #236 = Utf8               Ljava/util/Comparator;
  #237 = Utf8               Ljava/util/Comparator<TA;>;
  #238 = Utf8               (Ljava/util/stream/Stream<TA;>;IILjava/util/Comparator<TA;>;)V
  #239 = Utf8               StackMapTable
  #240 = Class              #241          // java/util/function/Predicate
  #241 = Utf8               java/util/function/Predicate
  #242 = Class              #243          // java/util/Comparator
  #243 = Utf8               java/util/Comparator
  #244 = Utf8               (Ljava/util/stream/Stream<TA;>;IILjava/util/function/Predicate<TA;>;Ljava/util/Comparator<TA;>;)V
  #245 = Utf8               (Ljava/util/stream/Stream<TA;>;Ljava/util/function/Predicate<TA;>;Ljava/util/Comparator<TA;>;)Ljava/util/List<TA;>;
  #246 = Utf8               content
  #247 = Utf8               [Ljava/lang/Object;
  #248 = Utf8               generateSpace
  #249 = Utf8               height
  #250 = Utf8               generatePages
  #251 = Utf8               (Ljava/lang/String;)V
  #252 = Utf8               index
  #253 = Utf8               action
  #254 = Class              #247          // "[Ljava/lang/Object;"
  #255 = Utf8               width
  #256 = Utf8               generateSearch
  #257 = Utf8               getContent
  #258 = Utf8               resetContent
  #259 = Utf8               totalEntries
  #260 = Utf8               getTotalPages
  #261 = Utf8               (I)TA;
  #262 = Utf8               lambda$generateSpace$1
  #263 = Utf8               (II)V
  #264 = Utf8               x
  #265 = Utf8               lambda$generateSpace$0
  #266 = Utf8               <A:Ljava/lang/Object;>Ljava/util/AbstractList<TA;>;
  #267 = Utf8               SourceFile
  #268 = Utf8               Pagination.java
  #269 = Utf8               BootstrapMethods
  #270 = MethodType         #200          //  (I)V
  #271 = MethodHandle       5:#272        // REF_invokeVirtual ext/mods/commons/data/Pagination.lambda$generateSpace$0:(I)V
  #272 = Methodref          #2.#273       // ext/mods/commons/data/Pagination.lambda$generateSpace$0:(I)V
  #273 = NameAndType        #265:#200     // lambda$generateSpace$0:(I)V
  #274 = MethodHandle       5:#275        // REF_invokeVirtual ext/mods/commons/data/Pagination.lambda$generateSpace$1:(II)V
  #275 = Methodref          #2.#276       // ext/mods/commons/data/Pagination.lambda$generateSpace$1:(II)V
  #276 = NameAndType        #262:#263     // lambda$generateSpace$1:(II)V
  #277 = String             #278          // <a action=\"\u0001\">\u0001</a>
  #278 = Utf8               <a action=\"\u0001\">\u0001</a>
  #279 = String             #280          // <table width=\u0001 bgcolor=000000><tr><td FIXWIDTH=22 align=center><img height=2><button action=\"
  #280 = Utf8               <table width=\u0001 bgcolor=000000><tr><td FIXWIDTH=22 align=center><img height=2><button action=\"
  #281 = String             #282          // <td FIXWIDTH=26 align=center>\u0001
  #282 = Utf8               <td FIXWIDTH=26 align=center>\u0001
  #283 = MethodHandle       6:#284        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #284 = Methodref          #285.#286     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #285 = Class              #287          // java/lang/invoke/LambdaMetafactory
  #286 = NameAndType        #288:#289     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #287 = Utf8               java/lang/invoke/LambdaMetafactory
  #288 = Utf8               metafactory
  #289 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #290 = MethodHandle       6:#291        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #291 = Methodref          #292.#293     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #292 = Class              #294          // java/lang/invoke/StringConcatFactory
  #293 = NameAndType        #148:#295     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #294 = Utf8               java/lang/invoke/StringConcatFactory
  #295 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #296 = Utf8               InnerClasses
  #297 = Class              #298          // java/lang/invoke/MethodHandles$Lookup
  #298 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #299 = Class              #300          // java/lang/invoke/MethodHandles
  #300 = Utf8               java/lang/invoke/MethodHandles
  #301 = Utf8               Lookup
{
  public ext.mods.commons.data.Pagination(java.util.stream.Stream<A>, int, int);
    descriptor: (Ljava/util/stream/Stream;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: iload_2
         3: iload_3
         4: aconst_null
         5: aconst_null
         6: invokespecial #1                  // Method "<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
         9: return
      LineNumberTable:
        line 44: 0
        line 45: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/Pagination;
            0      10     1 stream   Ljava/util/stream/Stream;
            0      10     2  page   I
            0      10     3 limit   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/Pagination<TA;>;
            0      10     1 stream   Ljava/util/stream/Stream<TA;>;
    Signature: #229                         // (Ljava/util/stream/Stream<TA;>;II)V

  public ext.mods.commons.data.Pagination(java.util.stream.Stream<A>, int, int, java.util.function.Predicate<A>);
    descriptor: (Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=5
         0: aload_0
         1: aload_1
         2: iload_2
         3: iload_3
         4: aload         4
         6: aconst_null
         7: invokespecial #1                  // Method "<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
        10: return
      LineNumberTable:
        line 49: 0
        line 50: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/data/Pagination;
            0      11     1 stream   Ljava/util/stream/Stream;
            0      11     2  page   I
            0      11     3 limit   I
            0      11     4 filter   Ljava/util/function/Predicate;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/data/Pagination<TA;>;
            0      11     1 stream   Ljava/util/stream/Stream<TA;>;
            0      11     4 filter   Ljava/util/function/Predicate<TA;>;
    Signature: #233                         // (Ljava/util/stream/Stream<TA;>;IILjava/util/function/Predicate<TA;>;)V

  public ext.mods.commons.data.Pagination(java.util.stream.Stream<A>, int, int, java.util.Comparator<A>);
    descriptor: (Ljava/util/stream/Stream;IILjava/util/Comparator;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=5
         0: aload_0
         1: aload_1
         2: iload_2
         3: iload_3
         4: aconst_null
         5: aload         4
         7: invokespecial #1                  // Method "<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
        10: return
      LineNumberTable:
        line 54: 0
        line 55: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/data/Pagination;
            0      11     1 stream   Ljava/util/stream/Stream;
            0      11     2  page   I
            0      11     3 limit   I
            0      11     4 comparator   Ljava/util/Comparator;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/data/Pagination<TA;>;
            0      11     1 stream   Ljava/util/stream/Stream<TA;>;
            0      11     4 comparator   Ljava/util/Comparator<TA;>;
    Signature: #238                         // (Ljava/util/stream/Stream<TA;>;IILjava/util/Comparator<TA;>;)V

  public ext.mods.commons.data.Pagination(java.util.stream.Stream<A>, int, int, java.util.function.Predicate<A>, java.util.Comparator<A>);
    descriptor: (Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=6
         0: aload_0
         1: invokespecial #7                  // Method java/util/AbstractList."<init>":()V
         4: aload_0
         5: new           #12                 // class java/lang/StringBuilder
         8: dup
         9: invokespecial #14                 // Method java/lang/StringBuilder."<init>":()V
        12: putfield      #15                 // Field _content:Ljava/lang/StringBuilder;
        15: aload_0
        16: aload_0
        17: aload_1
        18: aload         4
        20: aload         5
        22: invokevirtual #19                 // Method initList:(Ljava/util/stream/Stream;Ljava/util/function/Predicate;Ljava/util/Comparator;)Ljava/util/List;
        25: putfield      #23                 // Field _list:Ljava/util/List;
        28: aload_0
        29: aload_0
        30: getfield      #23                 // Field _list:Ljava/util/List;
        33: invokeinterface #27,  1           // InterfaceMethod java/util/List.size:()I
        38: putfield      #33                 // Field _totalEntries:I
        41: aload_0
        42: iload_3
        43: iconst_1
        44: invokestatic  #37                 // Method java/lang/Math.max:(II)I
        47: putfield      #43                 // Field _limit:I
        50: aload_0
        51: aload_0
        52: getfield      #23                 // Field _list:Ljava/util/List;
        55: invokeinterface #27,  1           // InterfaceMethod java/util/List.size:()I
        60: aload_0
        61: getfield      #43                 // Field _limit:I
        64: idiv
        65: aload_0
        66: getfield      #23                 // Field _list:Ljava/util/List;
        69: invokeinterface #27,  1           // InterfaceMethod java/util/List.size:()I
        74: aload_0
        75: getfield      #43                 // Field _limit:I
        78: irem
        79: ifne          86
        82: iconst_0
        83: goto          87
        86: iconst_1
        87: iadd
        88: putfield      #46                 // Field _total:I
        91: aload_0
        92: iload_2
        93: i2l
        94: iconst_1
        95: iconst_1
        96: aload_0
        97: getfield      #46                 // Field _total:I
       100: invokestatic  #37                 // Method java/lang/Math.max:(II)I
       103: invokestatic  #49                 // Method java/lang/Math.clamp:(JII)I
       106: putfield      #53                 // Field _page:I
       109: aload_0
       110: getfield      #23                 // Field _list:Ljava/util/List;
       113: invokeinterface #56,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       118: ifeq          122
       121: return
       122: aload_0
       123: aload_0
       124: getfield      #23                 // Field _list:Ljava/util/List;
       127: iload_2
       128: aload_0
       129: getfield      #46                 // Field _total:I
       132: invokestatic  #60                 // Method java/lang/Math.min:(II)I
       135: iconst_1
       136: isub
       137: iload_3
       138: imul
       139: iload_2
       140: aload_0
       141: getfield      #46                 // Field _total:I
       144: invokestatic  #60                 // Method java/lang/Math.min:(II)I
       147: iload_3
       148: imul
       149: aload_0
       150: getfield      #23                 // Field _list:Ljava/util/List;
       153: invokeinterface #27,  1           // InterfaceMethod java/util/List.size:()I
       158: invokestatic  #60                 // Method java/lang/Math.min:(II)I
       161: invokeinterface #63,  3           // InterfaceMethod java/util/List.subList:(II)Ljava/util/List;
       166: putfield      #23                 // Field _list:Ljava/util/List;
       169: return
      LineNumberTable:
        line 58: 0
        line 34: 4
        line 59: 15
        line 60: 28
        line 61: 41
        line 62: 50
        line 63: 91
        line 65: 109
        line 66: 121
        line 68: 122
        line 69: 169
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     170     0  this   Lext/mods/commons/data/Pagination;
            0     170     1 stream   Ljava/util/stream/Stream;
            0     170     2  page   I
            0     170     3 limit   I
            0     170     4 filter   Ljava/util/function/Predicate;
            0     170     5 comparator   Ljava/util/Comparator;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     170     0  this   Lext/mods/commons/data/Pagination<TA;>;
            0     170     1 stream   Ljava/util/stream/Stream<TA;>;
            0     170     4 filter   Ljava/util/function/Predicate<TA;>;
            0     170     5 comparator   Ljava/util/Comparator<TA;>;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 86
          locals = [ class ext/mods/commons/data/Pagination, class java/util/stream/Stream, int, int, class java/util/function/Predicate, class java/util/Comparator ]
          stack = [ class ext/mods/commons/data/Pagination, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/commons/data/Pagination, class java/util/stream/Stream, int, int, class java/util/function/Predicate, class java/util/Comparator ]
          stack = [ class ext/mods/commons/data/Pagination, int, int ]
        frame_type = 34 /* same */
    Signature: #244                         // (Ljava/util/stream/Stream<TA;>;IILjava/util/function/Predicate<TA;>;Ljava/util/Comparator<TA;>;)V

  public void append(java.lang.Object...);
    descriptor: ([Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #15                 // Field _content:Ljava/lang/StringBuilder;
         4: aload_1
         5: invokestatic  #86                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
         8: return
      LineNumberTable:
        line 90: 0
        line 91: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/Pagination;
            0       9     1 content   [Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/Pagination<TA;>;

  public void generateSpace();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #92                 // Method size:()I
         4: aload_0
         5: getfield      #43                 // Field _limit:I
         8: invokestatic  #93                 // InterfaceMethod java/util/stream/IntStream.range:(II)Ljava/util/stream/IntStream;
        11: aload_0
        12: invokedynamic #99,  0             // InvokeDynamic #0:accept:(Lext/mods/commons/data/Pagination;)Ljava/util/function/IntConsumer;
        17: invokeinterface #103,  2          // InterfaceMethod java/util/stream/IntStream.forEach:(Ljava/util/function/IntConsumer;)V
        22: return
      LineNumberTable:
        line 95: 0
        line 96: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/commons/data/Pagination;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/commons/data/Pagination<TA;>;

  public void generateSpace(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #92                 // Method size:()I
         4: aload_0
         5: getfield      #43                 // Field _limit:I
         8: invokestatic  #93                 // InterfaceMethod java/util/stream/IntStream.range:(II)Ljava/util/stream/IntStream;
        11: aload_0
        12: iload_1
        13: invokedynamic #107,  0            // InvokeDynamic #1:accept:(Lext/mods/commons/data/Pagination;I)Ljava/util/function/IntConsumer;
        18: invokeinterface #103,  2          // InterfaceMethod java/util/stream/IntStream.forEach:(Ljava/util/function/IntConsumer;)V
        23: return
      LineNumberTable:
        line 100: 0
        line 101: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/commons/data/Pagination;
            0      24     1 height   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/commons/data/Pagination<TA;>;

  public void generatePages(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=3, args_size=2
         0: aload_0
         1: iconst_3
         2: anewarray     #110                // class java/lang/Object
         5: dup
         6: iconst_0
         7: ldc           #112                // String <table width=280 bgcolor=000000><tr><td FIXWIDTH=22 align=center><img height=2><button action=\"
         9: aastore
        10: dup
        11: iconst_1
        12: aload_1
        13: ldc           #114                // String %page%
        15: iconst_1
        16: invokestatic  #116                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        19: invokevirtual #122                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        22: aastore
        23: dup
        24: iconst_2
        25: ldc           #126                // String \" back=L2UI_CH3.prev1_down fore=L2UI_CH3.prev1 width=16 height=16></td>
        27: aastore
        28: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
        31: aload_0
        32: getfield      #53                 // Field _page:I
        35: iconst_5
        36: isub
        37: istore_2
        38: iload_2
        39: aload_0
        40: getfield      #53                 // Field _page:I
        43: iconst_1
        44: isub
        45: if_icmpge     119
        48: aload_0
        49: iconst_3
        50: anewarray     #110                // class java/lang/Object
        53: dup
        54: iconst_0
        55: ldc           #131                // String <td FIXWIDTH=26 align=center>
        57: aastore
        58: dup
        59: iconst_1
        60: iload_2
        61: ifge          69
        64: ldc           #133                // String
        66: goto          104
        69: aload_1
        70: ldc           #114                // String %page%
        72: iload_2
        73: iconst_1
        74: iadd
        75: invokestatic  #116                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        78: invokevirtual #122                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        81: ldc           #135                // String %02d
        83: iconst_1
        84: anewarray     #110                // class java/lang/Object
        87: dup
        88: iconst_0
        89: iload_2
        90: iconst_1
        91: iadd
        92: invokestatic  #137                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        95: aastore
        96: invokestatic  #142                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        99: invokedynamic #146,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       104: aastore
       105: dup
       106: iconst_2
       107: ldc           #150                // String </td>
       109: aastore
       110: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       113: iinc          2, 1
       116: goto          38
       119: aload_0
       120: iconst_3
       121: anewarray     #110                // class java/lang/Object
       124: dup
       125: iconst_0
       126: ldc           #152                // String <td FIXWIDTH=26 align=center><font color=LEVEL>
       128: aastore
       129: dup
       130: iconst_1
       131: ldc           #135                // String %02d
       133: iconst_1
       134: anewarray     #110                // class java/lang/Object
       137: dup
       138: iconst_0
       139: aload_0
       140: getfield      #53                 // Field _page:I
       143: iconst_1
       144: invokestatic  #37                 // Method java/lang/Math.max:(II)I
       147: invokestatic  #137                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       150: aastore
       151: invokestatic  #142                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       154: aastore
       155: dup
       156: iconst_2
       157: ldc           #154                // String </font></td>
       159: aastore
       160: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       163: aload_0
       164: getfield      #53                 // Field _page:I
       167: istore_2
       168: iload_2
       169: aload_0
       170: getfield      #53                 // Field _page:I
       173: iconst_4
       174: iadd
       175: if_icmpge     253
       178: aload_0
       179: iconst_3
       180: anewarray     #110                // class java/lang/Object
       183: dup
       184: iconst_0
       185: ldc           #131                // String <td FIXWIDTH=26 align=center>
       187: aastore
       188: dup
       189: iconst_1
       190: iload_2
       191: aload_0
       192: getfield      #46                 // Field _total:I
       195: if_icmpge     236
       198: aload_1
       199: ldc           #114                // String %page%
       201: iload_2
       202: iconst_1
       203: iadd
       204: invokestatic  #116                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       207: invokevirtual #122                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       210: ldc           #135                // String %02d
       212: iconst_1
       213: anewarray     #110                // class java/lang/Object
       216: dup
       217: iconst_0
       218: iload_2
       219: iconst_1
       220: iadd
       221: invokestatic  #137                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       224: aastore
       225: invokestatic  #142                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       228: invokedynamic #146,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       233: goto          238
       236: ldc           #133                // String
       238: aastore
       239: dup
       240: iconst_2
       241: ldc           #150                // String </td>
       243: aastore
       244: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       247: iinc          2, 1
       250: goto          168
       253: aload_0
       254: iconst_3
       255: anewarray     #110                // class java/lang/Object
       258: dup
       259: iconst_0
       260: ldc           #156                // String <td FIXWIDTH=22 align=center><img height=2><button action=\"
       262: aastore
       263: dup
       264: iconst_1
       265: aload_1
       266: ldc           #114                // String %page%
       268: aload_0
       269: getfield      #46                 // Field _total:I
       272: invokestatic  #116                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       275: invokevirtual #122                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       278: aastore
       279: dup
       280: iconst_2
       281: ldc           #158                // String \" back=L2UI_CH3.next1_down fore=L2UI_CH3.next1 width=16 height=16></td></tr></table>
       283: aastore
       284: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       287: aload_0
       288: iconst_1
       289: anewarray     #110                // class java/lang/Object
       292: dup
       293: iconst_0
       294: ldc           #160                // String <img src=\"L2UI.SquareGray\" width=280 height=1>
       296: aastore
       297: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       300: return
      LineNumberTable:
        line 105: 0
        line 107: 31
        line 108: 48
        line 107: 113
        line 110: 119
        line 112: 163
        line 113: 178
        line 112: 247
        line 115: 253
        line 116: 287
        line 117: 300
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      81     2 index   I
          168      85     2 index   I
            0     301     0  this   Lext/mods/commons/data/Pagination;
            0     301     1 action   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     301     0  this   Lext/mods/commons/data/Pagination<TA;>;
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/commons/data/Pagination, class java/lang/String, int ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/commons/data/Pagination, class java/lang/String, int ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/commons/data/Pagination, class java/lang/String, int ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/commons/data/Pagination, class java/lang/String, int ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 14

  public void generatePagesMedium(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: sipush        320
         5: invokevirtual #162                // Method generatePagesMedium:(Ljava/lang/String;I)V
         8: return
      LineNumberTable:
        line 121: 0
        line 122: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/Pagination;
            0       9     1 action   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/Pagination<TA;>;

  public void generatePagesMedium(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=4, args_size=3
         0: aload_0
         1: iconst_3
         2: anewarray     #110                // class java/lang/Object
         5: dup
         6: iconst_0
         7: iload_2
         8: invokedynamic #166,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
        13: aastore
        14: dup
        15: iconst_1
        16: aload_1
        17: ldc           #114                // String %page%
        19: iconst_1
        20: invokestatic  #116                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        23: invokevirtual #122                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        26: aastore
        27: dup
        28: iconst_2
        29: ldc           #126                // String \" back=L2UI_CH3.prev1_down fore=L2UI_CH3.prev1 width=16 height=16></td>
        31: aastore
        32: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
        35: aload_0
        36: getfield      #53                 // Field _page:I
        39: iconst_5
        40: isub
        41: istore_3
        42: iload_3
        43: aload_0
        44: getfield      #53                 // Field _page:I
        47: iconst_1
        48: isub
        49: if_icmpge     123
        52: aload_0
        53: iconst_2
        54: anewarray     #110                // class java/lang/Object
        57: dup
        58: iconst_0
        59: iload_3
        60: ifge          68
        63: ldc           #133                // String
        65: goto          103
        68: aload_1
        69: ldc           #114                // String %page%
        71: iload_3
        72: iconst_1
        73: iadd
        74: invokestatic  #116                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        77: invokevirtual #122                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        80: ldc           #135                // String %02d
        82: iconst_1
        83: anewarray     #110                // class java/lang/Object
        86: dup
        87: iconst_0
        88: iload_3
        89: iconst_1
        90: iadd
        91: invokestatic  #137                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        94: aastore
        95: invokestatic  #142                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        98: invokedynamic #146,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       103: invokedynamic #168,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       108: aastore
       109: dup
       110: iconst_1
       111: ldc           #150                // String </td>
       113: aastore
       114: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       117: iinc          3, 1
       120: goto          42
       123: aload_0
       124: iconst_3
       125: anewarray     #110                // class java/lang/Object
       128: dup
       129: iconst_0
       130: ldc           #152                // String <td FIXWIDTH=26 align=center><font color=LEVEL>
       132: aastore
       133: dup
       134: iconst_1
       135: ldc           #135                // String %02d
       137: iconst_1
       138: anewarray     #110                // class java/lang/Object
       141: dup
       142: iconst_0
       143: aload_0
       144: getfield      #53                 // Field _page:I
       147: iconst_1
       148: invokestatic  #37                 // Method java/lang/Math.max:(II)I
       151: invokestatic  #137                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       154: aastore
       155: invokestatic  #142                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       158: aastore
       159: dup
       160: iconst_2
       161: ldc           #154                // String </font></td>
       163: aastore
       164: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       167: aload_0
       168: getfield      #53                 // Field _page:I
       171: istore_3
       172: iload_3
       173: aload_0
       174: getfield      #53                 // Field _page:I
       177: iconst_4
       178: iadd
       179: if_icmpge     257
       182: aload_0
       183: iconst_2
       184: anewarray     #110                // class java/lang/Object
       187: dup
       188: iconst_0
       189: iload_3
       190: aload_0
       191: getfield      #46                 // Field _total:I
       194: if_icmpge     235
       197: aload_1
       198: ldc           #114                // String %page%
       200: iload_3
       201: iconst_1
       202: iadd
       203: invokestatic  #116                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       206: invokevirtual #122                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       209: ldc           #135                // String %02d
       211: iconst_1
       212: anewarray     #110                // class java/lang/Object
       215: dup
       216: iconst_0
       217: iload_3
       218: iconst_1
       219: iadd
       220: invokestatic  #137                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       223: aastore
       224: invokestatic  #142                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       227: invokedynamic #146,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       232: goto          237
       235: ldc           #133                // String
       237: invokedynamic #168,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       242: aastore
       243: dup
       244: iconst_1
       245: ldc           #150                // String </td>
       247: aastore
       248: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       251: iinc          3, 1
       254: goto          172
       257: aload_0
       258: iconst_3
       259: anewarray     #110                // class java/lang/Object
       262: dup
       263: iconst_0
       264: ldc           #156                // String <td FIXWIDTH=22 align=center><img height=2><button action=\"
       266: aastore
       267: dup
       268: iconst_1
       269: aload_1
       270: ldc           #114                // String %page%
       272: aload_0
       273: getfield      #46                 // Field _total:I
       276: invokestatic  #116                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       279: invokevirtual #122                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       282: aastore
       283: dup
       284: iconst_2
       285: ldc           #158                // String \" back=L2UI_CH3.next1_down fore=L2UI_CH3.next1 width=16 height=16></td></tr></table>
       287: aastore
       288: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       291: return
      LineNumberTable:
        line 126: 0
        line 128: 35
        line 129: 52
        line 128: 117
        line 131: 123
        line 133: 167
        line 134: 182
        line 133: 251
        line 136: 257
        line 137: 291
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      81     3 index   I
          172      85     3 index   I
            0     292     0  this   Lext/mods/commons/data/Pagination;
            0     292     1 action   Ljava/lang/String;
            0     292     2 width   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     292     0  this   Lext/mods/commons/data/Pagination<TA;>;
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/commons/data/Pagination, class java/lang/String, int, int ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/commons/data/Pagination, class java/lang/String, int, int ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 62
          locals = [ class ext/mods/commons/data/Pagination, class java/lang/String, int, int ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/commons/data/Pagination, class java/lang/String, int, int ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 19

  public void generateSearch(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: iconst_3
         2: anewarray     #110                // class java/lang/Object
         5: dup
         6: iconst_0
         7: ldc           #171                // String <table width=280 height=
         9: aastore
        10: dup
        11: iconst_1
        12: iload_2
        13: invokestatic  #137                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: aastore
        17: dup
        18: iconst_2
        19: ldc           #173                // String ><tr>
        21: aastore
        22: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
        25: aload_0
        26: iconst_1
        27: anewarray     #110                // class java/lang/Object
        30: dup
        31: iconst_0
        32: ldc           #175                // String <td width=70 align=center>Search</td>
        34: aastore
        35: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
        38: aload_0
        39: iconst_1
        40: anewarray     #110                // class java/lang/Object
        43: dup
        44: iconst_0
        45: ldc           #177                // String <td width=140><edit var=\"search\" width=130 height=15></td>
        47: aastore
        48: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
        51: aload_0
        52: iconst_3
        53: anewarray     #110                // class java/lang/Object
        56: dup
        57: iconst_0
        58: ldc           #179                // String <td width=70><button value=\"Find\" action=\"
        60: aastore
        61: dup
        62: iconst_1
        63: aload_1
        64: aastore
        65: dup
        66: iconst_2
        67: ldc           #181                // String  1 $search\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"></td>
        69: aastore
        70: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
        73: aload_0
        74: iconst_1
        75: anewarray     #110                // class java/lang/Object
        78: dup
        79: iconst_0
        80: ldc           #183                // String </tr><tr>
        82: aastore
        83: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
        86: aload_0
        87: iconst_1
        88: anewarray     #110                // class java/lang/Object
        91: dup
        92: iconst_0
        93: ldc           #185                // String <td></td>
        95: aastore
        96: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
        99: aload_0
       100: iconst_3
       101: anewarray     #110                // class java/lang/Object
       104: dup
       105: iconst_0
       106: ldc           #187                // String <td align=center>Found
       108: aastore
       109: dup
       110: iconst_1
       111: aload_0
       112: getfield      #33                 // Field _totalEntries:I
       115: invokestatic  #137                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       118: aastore
       119: dup
       120: iconst_2
       121: ldc           #189                // String  results</td>
       123: aastore
       124: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       127: aload_0
       128: iconst_1
       129: anewarray     #110                // class java/lang/Object
       132: dup
       133: iconst_0
       134: ldc           #185                // String <td></td>
       136: aastore
       137: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       140: aload_0
       141: iconst_1
       142: anewarray     #110                // class java/lang/Object
       145: dup
       146: iconst_0
       147: ldc           #191                // String </tr></table>
       149: aastore
       150: invokevirtual #128                // Method append:([Ljava/lang/Object;)V
       153: return
      LineNumberTable:
        line 141: 0
        line 142: 25
        line 143: 38
        line 144: 51
        line 145: 73
        line 146: 86
        line 147: 99
        line 148: 127
        line 149: 140
        line 150: 153
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     154     0  this   Lext/mods/commons/data/Pagination;
            0     154     1 action   Ljava/lang/String;
            0     154     2 height   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     154     0  this   Lext/mods/commons/data/Pagination<TA;>;

  public java.lang.String getContent();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _content:Ljava/lang/StringBuilder;
         4: invokevirtual #193                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         7: areturn
      LineNumberTable:
        line 154: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/data/Pagination;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/data/Pagination<TA;>;

  public void resetContent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _content:Ljava/lang/StringBuilder;
         4: iconst_0
         5: invokevirtual #197                // Method java/lang/StringBuilder.setLength:(I)V
         8: return
      LineNumberTable:
        line 159: 0
        line 160: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/Pagination;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/Pagination<TA;>;

  public int totalEntries();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _totalEntries:I
         4: ireturn
      LineNumberTable:
        line 164: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/data/Pagination;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/data/Pagination<TA;>;

  public int getTotalPages();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _total:I
         4: ireturn
      LineNumberTable:
        line 169: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/data/Pagination;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/data/Pagination<TA;>;

  public A get(int);
    descriptor: (I)Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #23                 // Field _list:Ljava/util/List;
         4: iload_1
         5: invokeinterface #201,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        10: areturn
      LineNumberTable:
        line 175: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/data/Pagination;
            0      11     1 index   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/data/Pagination<TA;>;
    Signature: #261                         // (I)TA;

  public int size();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _list:Ljava/util/List;
         4: invokeinterface #27,  1           // InterfaceMethod java/util/List.size:()I
         9: ireturn
      LineNumberTable:
        line 181: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/Pagination;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/Pagination<TA;>;
}
Signature: #266                         // <A:Ljava/lang/Object;>Ljava/util/AbstractList<TA;>;
SourceFile: "Pagination.java"
BootstrapMethods:
  0: #283 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #270 (I)V
      #271 REF_invokeVirtual ext/mods/commons/data/Pagination.lambda$generateSpace$0:(I)V
      #270 (I)V
  1: #283 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #270 (I)V
      #274 REF_invokeVirtual ext/mods/commons/data/Pagination.lambda$generateSpace$1:(II)V
      #270 (I)V
  2: #290 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #277 <a action=\"\u0001\">\u0001</a>
  3: #290 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #279 <table width=\u0001 bgcolor=000000><tr><td FIXWIDTH=22 align=center><img height=2><button action=\"
  4: #290 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #281 <td FIXWIDTH=26 align=center>\u0001
InnerClasses:
  public static final #301= #297 of #299; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
