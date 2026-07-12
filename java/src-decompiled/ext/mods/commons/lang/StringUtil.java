// Bytecode for: ext.mods.commons.lang.StringUtil
// File: ext\mods\commons\lang\StringUtil.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/lang/StringUtil.class
  Last modified 9 de jul de 2026; size 9760 bytes
  MD5 checksum 61a15be84b826d080de3c1ce37b57043
  Compiled from "StringUtil.java"
public final class ext.mods.commons.lang.StringUtil
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #1                          // ext/mods/commons/lang/StringUtil
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 21, attributes: 3
Constant pool:
    #1 = Class              #2            // ext/mods/commons/lang/StringUtil
    #2 = Utf8               ext/mods/commons/lang/StringUtil
    #3 = Methodref          #4.#5         // java/lang/Object."<init>":()V
    #4 = Class              #6            // java/lang/Object
    #5 = NameAndType        #7:#8         // "<init>":()V
    #6 = Utf8               java/lang/Object
    #7 = Utf8               <init>
    #8 = Utf8               ()V
    #9 = Class              #10           // java/lang/IllegalStateException
   #10 = Utf8               java/lang/IllegalStateException
   #11 = String             #12           // Utility class
   #12 = Utf8               Utility class
   #13 = Methodref          #9.#14        // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #14 = NameAndType        #7:#15        // "<init>":(Ljava/lang/String;)V
   #15 = Utf8               (Ljava/lang/String;)V
   #16 = Methodref          #17.#18       // java/lang/String.isEmpty:()Z
   #17 = Class              #19           // java/lang/String
   #18 = NameAndType        #20:#21       // isEmpty:()Z
   #19 = Utf8               java/lang/String
   #20 = Utf8               isEmpty
   #21 = Utf8               ()Z
   #22 = Methodref          #4.#23        // java/lang/Object.toString:()Ljava/lang/String;
   #23 = NameAndType        #24:#25       // toString:()Ljava/lang/String;
   #24 = Utf8               toString
   #25 = Utf8               ()Ljava/lang/String;
   #26 = Methodref          #27.#28       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #27 = Class              #29           // java/lang/StringBuilder
   #28 = NameAndType        #30:#31       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #29 = Utf8               java/lang/StringBuilder
   #30 = Utf8               append
   #31 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #32 = String             #33           // [0-9]+
   #33 = Utf8               [0-9]+
   #34 = Methodref          #17.#35       // java/lang/String.matches:(Ljava/lang/String;)Z
   #35 = NameAndType        #36:#37       // matches:(Ljava/lang/String;)Z
   #36 = Utf8               matches
   #37 = Utf8               (Ljava/lang/String;)Z
   #38 = Methodref          #17.#39       // java/lang/String.toCharArray:()[C
   #39 = NameAndType        #40:#41       // toCharArray:()[C
   #40 = Utf8               toCharArray
   #41 = Utf8               ()[C
   #42 = Methodref          #43.#44       // java/lang/Character.isLetterOrDigit:(C)Z
   #43 = Class              #45           // java/lang/Character
   #44 = NameAndType        #46:#47       // isLetterOrDigit:(C)Z
   #45 = Utf8               java/lang/Character
   #46 = Utf8               isLetterOrDigit
   #47 = Utf8               (C)Z
   #48 = Fieldref           #49.#50       // java/util/Locale.ENGLISH:Ljava/util/Locale;
   #49 = Class              #51           // java/util/Locale
   #50 = NameAndType        #52:#53       // ENGLISH:Ljava/util/Locale;
   #51 = Utf8               java/util/Locale
   #52 = Utf8               ENGLISH
   #53 = Utf8               Ljava/util/Locale;
   #54 = Methodref          #55.#56       // java/text/NumberFormat.getInstance:(Ljava/util/Locale;)Ljava/text/NumberFormat;
   #55 = Class              #57           // java/text/NumberFormat
   #56 = NameAndType        #58:#59       // getInstance:(Ljava/util/Locale;)Ljava/text/NumberFormat;
   #57 = Utf8               java/text/NumberFormat
   #58 = Utf8               getInstance
   #59 = Utf8               (Ljava/util/Locale;)Ljava/text/NumberFormat;
   #60 = Methodref          #55.#61       // java/text/NumberFormat.format:(J)Ljava/lang/String;
   #61 = NameAndType        #62:#63       // format:(J)Ljava/lang/String;
   #62 = Utf8               format
   #63 = Utf8               (J)Ljava/lang/String;
   #64 = String             #65           //
   #65 = Utf8
   #66 = Methodref          #17.#67       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #67 = NameAndType        #68:#69       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #68 = Utf8               split
   #69 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #70 = Methodref          #71.#72       // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
   #71 = Class              #73           // java/util/Arrays
   #72 = NameAndType        #74:#75       // asList:([Ljava/lang/Object;)Ljava/util/List;
   #73 = Utf8               java/util/Arrays
   #74 = Utf8               asList
   #75 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
   #76 = Methodref          #77.#78       // java/util/Collections.shuffle:(Ljava/util/List;)V
   #77 = Class              #79           // java/util/Collections
   #78 = NameAndType        #80:#81       // shuffle:(Ljava/util/List;)V
   #79 = Utf8               java/util/Collections
   #80 = Utf8               shuffle
   #81 = Utf8               (Ljava/util/List;)V
   #82 = Methodref          #17.#83       // java/lang/String.length:()I
   #83 = NameAndType        #84:#85       // length:()I
   #84 = Utf8               length
   #85 = Utf8               ()I
   #86 = Methodref          #27.#87       // java/lang/StringBuilder."<init>":(I)V
   #87 = NameAndType        #7:#88        // "<init>":(I)V
   #88 = Utf8               (I)V
   #89 = InterfaceMethodref #90.#91       // java/util/List.iterator:()Ljava/util/Iterator;
   #90 = Class              #92           // java/util/List
   #91 = NameAndType        #93:#94       // iterator:()Ljava/util/Iterator;
   #92 = Utf8               java/util/List
   #93 = Utf8               iterator
   #94 = Utf8               ()Ljava/util/Iterator;
   #95 = InterfaceMethodref #96.#97       // java/util/Iterator.hasNext:()Z
   #96 = Class              #98           // java/util/Iterator
   #97 = NameAndType        #99:#21       // hasNext:()Z
   #98 = Utf8               java/util/Iterator
   #99 = Utf8               hasNext
  #100 = InterfaceMethodref #96.#101      // java/util/Iterator.next:()Ljava/lang/Object;
  #101 = NameAndType        #102:#103     // next:()Ljava/lang/Object;
  #102 = Utf8               next
  #103 = Utf8               ()Ljava/lang/Object;
  #104 = Methodref          #27.#23       // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #105 = Methodref          #106.#107     // java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
  #106 = Class              #108          // java/util/regex/Pattern
  #107 = NameAndType        #109:#110     // compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
  #108 = Utf8               java/util/regex/Pattern
  #109 = Utf8               compile
  #110 = Utf8               (Ljava/lang/String;)Ljava/util/regex/Pattern;
  #111 = Class              #112          // java/util/regex/PatternSyntaxException
  #112 = Utf8               java/util/regex/PatternSyntaxException
  #113 = String             #114          // .*
  #114 = Utf8               .*
  #115 = Methodref          #106.#116     // java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #116 = NameAndType        #117:#118     // matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #117 = Utf8               matcher
  #118 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #119 = Methodref          #120.#121     // java/util/regex/Matcher.matches:()Z
  #120 = Class              #122          // java/util/regex/Matcher
  #121 = NameAndType        #36:#21       // matches:()Z
  #122 = Utf8               java/util/regex/Matcher
  #123 = InvokeDynamic      #0:#124       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #124 = NameAndType        #125:#126     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #125 = Utf8               makeConcatWithConstants
  #126 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #127 = Methodref          #27.#14       // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
  #128 = Methodref          #27.#83       // java/lang/StringBuilder.length:()I
  #129 = String             #130          // -
  #130 = Utf8               -
  #131 = Methodref          #27.#132      // java/lang/StringBuilder.insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;
  #132 = NameAndType        #133:#134     // insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;
  #133 = Utf8               insert
  #134 = Utf8               (ILjava/lang/String;)Ljava/lang/StringBuilder;
  #135 = Fieldref           #1.#136       // ext/mods/commons/lang/StringUtil.LOGGER:Lext/mods/commons/logging/CLogger;
  #136 = NameAndType        #137:#138     // LOGGER:Lext/mods/commons/logging/CLogger;
  #137 = Utf8               LOGGER
  #138 = Utf8               Lext/mods/commons/logging/CLogger;
  #139 = Methodref          #140.#141     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #140 = Class              #142          // ext/mods/commons/logging/CLogger
  #141 = NameAndType        #143:#144     // info:(Ljava/lang/Object;)V
  #142 = Utf8               ext/mods/commons/logging/CLogger
  #143 = Utf8               info
  #144 = Utf8               (Ljava/lang/Object;)V
  #145 = InvokeDynamic      #1:#146       // #1:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #146 = NameAndType        #125:#147     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #147 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #148 = InvokeDynamic      #2:#146       // #2:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #149 = InvokeDynamic      #3:#146       // #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #150 = String             #151          // .
  #151 = Utf8               .
  #152 = Methodref          #17.#153      // java/lang/String.lastIndexOf:(Ljava/lang/String;)I
  #153 = NameAndType        #154:#155     // lastIndexOf:(Ljava/lang/String;)I
  #154 = Utf8               lastIndexOf
  #155 = Utf8               (Ljava/lang/String;)I
  #156 = Methodref          #17.#157      // java/lang/String.substring:(II)Ljava/lang/String;
  #157 = NameAndType        #158:#159     // substring:(II)Ljava/lang/String;
  #158 = Utf8               substring
  #159 = Utf8               (II)Ljava/lang/String;
  #160 = Methodref          #1.#161       // ext/mods/commons/lang/StringUtil.trim:(Ljava/lang/String;I)Ljava/lang/String;
  #161 = NameAndType        #162:#147     // trim:(Ljava/lang/String;I)Ljava/lang/String;
  #162 = Utf8               trim
  #163 = InvokeDynamic      #4:#124       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #164 = String             #165          // no
  #165 = Utf8               no
  #166 = Methodref          #17.#167      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #167 = NameAndType        #168:#37      // equalsIgnoreCase:(Ljava/lang/String;)Z
  #168 = Utf8               equalsIgnoreCase
  #169 = String             #170          // hour
  #170 = Utf8               hour
  #171 = Methodref          #17.#172      // java/lang/String.endsWith:(Ljava/lang/String;)Z
  #172 = NameAndType        #173:#37      // endsWith:(Ljava/lang/String;)Z
  #173 = Utf8               endsWith
  #174 = Methodref          #175.#176     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #175 = Class              #177          // java/lang/Integer
  #176 = NameAndType        #178:#155     // parseInt:(Ljava/lang/String;)I
  #177 = Utf8               java/lang/Integer
  #178 = Utf8               parseInt
  #179 = String             #180          // min
  #180 = Utf8               min
  #181 = String             #182          // sec
  #182 = Utf8               sec
  #183 = String             #184          // none
  #184 = Utf8               none
  #185 = Methodref          #186.#187     // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #186 = Class              #188          // ext/mods/gameserver/model/actor/Creature
  #187 = NameAndType        #189:#190     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #188 = Utf8               ext/mods/gameserver/model/actor/Creature
  #189 = Utf8               getPosition
  #190 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #191 = Methodref          #192.#23      // ext/mods/gameserver/model/location/SpawnLocation.toString:()Ljava/lang/String;
  #192 = Class              #193          // ext/mods/gameserver/model/location/SpawnLocation
  #193 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #194 = String             #195          // ,
  #195 = Utf8               ,
  #196 = Methodref          #17.#197      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #197 = NameAndType        #198:#199     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #198 = Utf8               replace
  #199 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #200 = Methodref          #186.#201     // ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
  #201 = NameAndType        #202:#25      // getName:()Ljava/lang/String;
  #202 = Utf8               getName
  #203 = Methodref          #1.#204       // ext/mods/commons/lang/StringUtil.trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #204 = NameAndType        #205:#147     // trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #205 = Utf8               trimAndDress
  #206 = InvokeDynamic      #5:#207       // #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #207 = NameAndType        #125:#208     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #208 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #209 = Methodref          #17.#210      // java/lang/String.isBlank:()Z
  #210 = NameAndType        #211:#21      // isBlank:()Z
  #211 = Utf8               isBlank
  #212 = Methodref          #17.#213      // java/lang/String.toLowerCase:()Ljava/lang/String;
  #213 = NameAndType        #214:#25      // toLowerCase:()Ljava/lang/String;
  #214 = Utf8               toLowerCase
  #215 = String             #216          //
  #216 = Utf8
  #217 = Methodref          #71.#218      // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #218 = NameAndType        #219:#220     // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #219 = Utf8               stream
  #220 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #221 = InvokeDynamic      #6:#222       // #6:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #222 = NameAndType        #223:#224     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #223 = Utf8               test
  #224 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #225 = InterfaceMethodref #226.#227     // java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
  #226 = Class              #228          // java/util/stream/Stream
  #227 = NameAndType        #229:#230     // allMatch:(Ljava/util/function/Predicate;)Z
  #228 = Utf8               java/util/stream/Stream
  #229 = Utf8               allMatch
  #230 = Utf8               (Ljava/util/function/Predicate;)Z
  #231 = String             #232          // L2UI_CH3.br_bar1_mp
  #232 = Utf8               L2UI_CH3.br_bar1_mp
  #233 = Long               12l
  #235 = Long               -13l
  #237 = Methodref          #1.#238       // ext/mods/commons/lang/StringUtil.getGauge:(IJJZLjava/lang/String;Ljava/lang/String;JJ)Ljava/lang/String;
  #238 = NameAndType        #239:#240     // getGauge:(IJJZLjava/lang/String;Ljava/lang/String;JJ)Ljava/lang/String;
  #239 = Utf8               getGauge
  #240 = Utf8               (IJJZLjava/lang/String;Ljava/lang/String;JJ)Ljava/lang/String;
  #241 = Methodref          #242.#243     // java/lang/Math.min:(JJ)J
  #242 = Class              #244          // java/lang/Math
  #243 = NameAndType        #180:#245     // min:(JJ)J
  #244 = Utf8               java/lang/Math
  #245 = Utf8               (JJ)J
  #246 = Methodref          #27.#5        // java/lang/StringBuilder."<init>":()V
  #247 = String             #248          // <table width=
  #248 = Utf8               <table width=
  #249 = Methodref          #27.#250      // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
  #250 = NameAndType        #30:#251      // append:(I)Ljava/lang/StringBuilder;
  #251 = Utf8               (I)Ljava/lang/StringBuilder;
  #252 = String             #253          //  cellpadding=0 cellspacing=0>
  #253 = Utf8                cellpadding=0 cellspacing=0>
  #254 = String             #255          // <tr>
  #255 = Utf8               <tr>
  #256 = String             #257          // <td background=\"
  #257 = Utf8               <td background=\"
  #258 = String             #259          // \">
  #259 = Utf8               \">
  #260 = String             #261          // <img src=\"
  #261 = Utf8               <img src=\"
  #262 = String             #263          // \" width=
  #263 = Utf8               \" width=
  #264 = Methodref          #27.#265      // java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
  #265 = NameAndType        #30:#266      // append:(J)Ljava/lang/StringBuilder;
  #266 = Utf8               (J)Ljava/lang/StringBuilder;
  #267 = String             #268          //  height=
  #268 = Utf8                height=
  #269 = String             #270          // >
  #270 = Utf8               >
  #271 = String             #272          // </td>
  #272 = Utf8               </td>
  #273 = String             #274          // </tr>
  #274 = Utf8               </tr>
  #275 = String             #276          // <td align=center>
  #276 = Utf8               <td align=center>
  #277 = String             #278          // <table cellpadding=0 cellspacing=
  #278 = Utf8               <table cellpadding=0 cellspacing=
  #279 = String             #280          // <td>
  #280 = Utf8               <td>
  #281 = String             #282          // <table cellpadding=0 cellspacing=2>
  #282 = Utf8               <table cellpadding=0 cellspacing=2>
  #283 = String             #284          // <tr><td>
  #284 = Utf8               <tr><td>
  #285 = String             #286          // %.2f%%
  #286 = Utf8               %.2f%%
  #287 = Double             100.0d
  #289 = Methodref          #290.#291     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #290 = Class              #292          // java/lang/Double
  #291 = NameAndType        #293:#294     // valueOf:(D)Ljava/lang/Double;
  #292 = Utf8               java/lang/Double
  #293 = Utf8               valueOf
  #294 = Utf8               (D)Ljava/lang/Double;
  #295 = Methodref          #17.#296      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #296 = NameAndType        #62:#297      // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #297 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #298 = String             #299          // </td></tr>
  #299 = Utf8               </td></tr>
  #300 = String             #301          // </table>
  #301 = Utf8               </table>
  #302 = String             #303          // <table cellpadding=0 cellspacing=7>
  #303 = Utf8               <table cellpadding=0 cellspacing=7>
  #304 = String             #305          // <td width=
  #305 = Utf8               <td width=
  #306 = String             #307          //  align=right>
  #307 = Utf8                align=right>
  #308 = String             #309          // <td width=10 align=center>/</td>
  #309 = Utf8               <td width=10 align=center>/</td>
  #310 = Methodref          #17.#311      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #311 = NameAndType        #312:#313     // contains:(Ljava/lang/CharSequence;)Z
  #312 = Utf8               contains
  #313 = Utf8               (Ljava/lang/CharSequence;)Z
  #314 = Methodref          #315.#201     // java/lang/Class.getName:()Ljava/lang/String;
  #315 = Class              #316          // java/lang/Class
  #316 = Utf8               java/lang/Class
  #317 = Methodref          #140.#14      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #318 = Utf8               DIGITS
  #319 = Utf8               Ljava/lang/String;
  #320 = Utf8               ConstantValue
  #321 = String             #322          // 0123456789
  #322 = Utf8               0123456789
  #323 = Utf8               LOWER_CASE_LETTERS
  #324 = String             #325          // abcdefghijklmnopqrstuvwxyz
  #325 = Utf8               abcdefghijklmnopqrstuvwxyz
  #326 = Utf8               UPPER_CASE_LETTERS
  #327 = String             #328          // ABCDEFGHIJKLMNOPQRSTUVWXYZ
  #328 = Utf8               ABCDEFGHIJKLMNOPQRSTUVWXYZ
  #329 = Utf8               LETTERS
  #330 = String             #331          // abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ
  #331 = Utf8               abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ
  #332 = Utf8               LETTERS_AND_DIGITS
  #333 = String             #334          // abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
  #334 = Utf8               abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
  #335 = Utf8               Code
  #336 = Utf8               LineNumberTable
  #337 = Utf8               LocalVariableTable
  #338 = Utf8               this
  #339 = Utf8               Lext/mods/commons/lang/StringUtil;
  #340 = Utf8               ([Ljava/lang/String;)Z
  #341 = Utf8               str
  #342 = Utf8               strings
  #343 = Utf8               [Ljava/lang/String;
  #344 = Utf8               StackMapTable
  #345 = Class              #343          // "[Ljava/lang/String;"
  #346 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #347 = Utf8               obj
  #348 = Utf8               Ljava/lang/Object;
  #349 = Utf8               sb
  #350 = Utf8               Ljava/lang/StringBuilder;
  #351 = Utf8               content
  #352 = Utf8               [Ljava/lang/Object;
  #353 = Class              #352          // "[Ljava/lang/Object;"
  #354 = Utf8               isDigit
  #355 = Utf8               text
  #356 = Utf8               isAlphaNumeric
  #357 = Utf8               chars
  #358 = Utf8               C
  #359 = Class              #360          // "[C"
  #360 = Utf8               [C
  #361 = Utf8               formatNumber
  #362 = Utf8               value
  #363 = Utf8               J
  #364 = Utf8               scrambleString
  #365 = Utf8               c
  #366 = Utf8               string
  #367 = Utf8               letters
  #368 = Utf8               Ljava/util/List;
  #369 = Utf8               LocalVariableTypeTable
  #370 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #371 = Utf8               isValidString
  #372 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Z
  #373 = Utf8               pattern
  #374 = Utf8               Ljava/util/regex/Pattern;
  #375 = Utf8               e
  #376 = Utf8               Ljava/util/regex/PatternSyntaxException;
  #377 = Utf8               regex
  #378 = Utf8               regexp
  #379 = Utf8               Ljava/util/regex/Matcher;
  #380 = Utf8               printSection
  #381 = Utf8               getTimeStamp
  #382 = Utf8               (I)Ljava/lang/String;
  #383 = Utf8               time
  #384 = Utf8               I
  #385 = Utf8               hours
  #386 = Utf8               minutes
  #387 = Utf8               result
  #388 = Utf8               getNameWithoutExtension
  #389 = Utf8               fileName
  #390 = Utf8               pos
  #391 = Utf8               s
  #392 = Utf8               maxWidth
  #393 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #394 = Utf8               defaultValue
  #395 = Utf8               timestamp
  #396 = Utf8               getCreatureDescription
  #397 = Utf8               (Ljava/lang/StringBuilder;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/String;
  #398 = Utf8               creature
  #399 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #400 = Utf8               teleLoc
  #401 = Utf8               name
  #402 = Utf8               search
  #403 = Utf8               getMpGauge
  #404 = Utf8               (IJJZ)Ljava/lang/String;
  #405 = Utf8               width
  #406 = Utf8               current
  #407 = Utf8               max
  #408 = Utf8               displayAsPercentage
  #409 = Utf8               Z
  #410 = Utf8               tdWidth
  #411 = Utf8               currentValue
  #412 = Utf8               backgroundImage
  #413 = Utf8               image
  #414 = Utf8               imageHeight
  #415 = Utf8               top
  #416 = Utf8               lambda$matches$0
  #417 = Utf8               r
  #418 = Utf8               <clinit>
  #419 = Utf8               SourceFile
  #420 = Utf8               StringUtil.java
  #421 = Utf8               BootstrapMethods
  #422 = String             #423          // =[ \u0001 ]
  #423 = Utf8               =[ \u0001 ]
  #424 = String             #425          // \u0001\u0001h
  #425 = Utf8               \u0001\u0001h
  #426 = String             #427          // \u0001 \u0001m
  #427 = Utf8               \u0001 \u0001m
  #428 = String             #429          // \u0001 \u0001s
  #429 = Utf8               \u0001 \u0001s
  #430 = String             #431          // \u0001...
  #431 = Utf8               \u0001...
  #432 = String             #433          // <a action=\"bypass admin_teleport \u0001\">\u0001</a>
  #433 = Utf8               <a action=\"bypass admin_teleport \u0001\">\u0001</a>
  #434 = MethodType         #435          //  (Ljava/lang/Object;)Z
  #435 = Utf8               (Ljava/lang/Object;)Z
  #436 = MethodHandle       6:#437        // REF_invokeStatic ext/mods/commons/lang/StringUtil.lambda$matches$0:(Ljava/lang/String;Ljava/lang/String;)Z
  #437 = Methodref          #1.#438       // ext/mods/commons/lang/StringUtil.lambda$matches$0:(Ljava/lang/String;Ljava/lang/String;)Z
  #438 = NameAndType        #416:#372     // lambda$matches$0:(Ljava/lang/String;Ljava/lang/String;)Z
  #439 = MethodType         #37           //  (Ljava/lang/String;)Z
  #440 = MethodHandle       6:#441        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #441 = Methodref          #442.#443     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #442 = Class              #444          // java/lang/invoke/StringConcatFactory
  #443 = NameAndType        #125:#445     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #444 = Utf8               java/lang/invoke/StringConcatFactory
  #445 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #446 = MethodHandle       6:#447        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #447 = Methodref          #448.#449     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #448 = Class              #450          // java/lang/invoke/LambdaMetafactory
  #449 = NameAndType        #451:#452     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #450 = Utf8               java/lang/invoke/LambdaMetafactory
  #451 = Utf8               metafactory
  #452 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #453 = Utf8               InnerClasses
  #454 = Class              #455          // java/lang/invoke/MethodHandles$Lookup
  #455 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #456 = Class              #457          // java/lang/invoke/MethodHandles
  #457 = Utf8               java/lang/invoke/MethodHandles
  #458 = Utf8               Lookup
{
  public static final java.lang.String DIGITS;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String 0123456789

  public static final java.lang.String LOWER_CASE_LETTERS;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String abcdefghijklmnopqrstuvwxyz

  public static final java.lang.String UPPER_CASE_LETTERS;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String ABCDEFGHIJKLMNOPQRSTUVWXYZ

  public static final java.lang.String LETTERS;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ

  public static final java.lang.String LETTERS_AND_DIGITS;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789

  public static boolean isEmpty(java.lang.String...);
    descriptor: ([Ljava/lang/String;)Z
    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS
    Code:
      stack=2, locals=5, args_size=1
         0: aload_0
         1: astore_1
         2: aload_1
         3: arraylength
         4: istore_2
         5: iconst_0
         6: istore_3
         7: iload_3
         8: iload_2
         9: if_icmpge     38
        12: aload_1
        13: iload_3
        14: aaload
        15: astore        4
        17: aload         4
        19: ifnull        30
        22: aload         4
        24: invokevirtual #16                 // Method java/lang/String.isEmpty:()Z
        27: ifeq          32
        30: iconst_1
        31: ireturn
        32: iinc          3, 1
        35: goto          7
        38: iconst_0
        39: ireturn
      LineNumberTable:
        line 56: 0
        line 58: 17
        line 59: 30
        line 56: 32
        line 61: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17      15     4   str   Ljava/lang/String;
            0      40     0 strings   [Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 248 /* chop */
          offset_delta = 5

  public static void append(java.lang.StringBuilder, java.lang.Object...);
    descriptor: (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS
    Code:
      stack=2, locals=6, args_size=2
         0: aload_1
         1: astore_2
         2: aload_2
         3: arraylength
         4: istore_3
         5: iconst_0
         6: istore        4
         8: iload         4
        10: iload_3
        11: if_icmpge     45
        14: aload_2
        15: iload         4
        17: aaload
        18: astore        5
        20: aload_0
        21: aload         5
        23: ifnonnull     30
        26: aconst_null
        27: goto          35
        30: aload         5
        32: invokevirtual #22                 // Method java/lang/Object.toString:()Ljava/lang/String;
        35: invokevirtual #26                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        38: pop
        39: iinc          4, 1
        42: goto          8
        45: return
      LineNumberTable:
        line 71: 0
        line 72: 20
        line 71: 39
        line 73: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      19     5   obj   Ljava/lang/Object;
            0      46     0    sb   Ljava/lang/StringBuilder;
            0      46     1 content   [Ljava/lang/Object;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 8
          locals = [ class "[Ljava/lang/Object;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, int, class java/lang/Object ]
          stack = [ class java/lang/StringBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, int, class java/lang/Object ]
          stack = [ class java/lang/StringBuilder, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;" ]
          stack = []

  public static boolean isDigit(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: ldc           #32                 // String [0-9]+
         9: invokevirtual #34                 // Method java/lang/String.matches:(Ljava/lang/String;)Z
        12: ireturn
      LineNumberTable:
        line 81: 0
        line 82: 4
        line 84: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  text   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */

  public static boolean isAlphaNumeric(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=5, args_size=1
         0: aload_0
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: invokevirtual #38                 // Method java/lang/String.toCharArray:()[C
        10: astore_1
        11: aload_1
        12: arraylength
        13: istore_2
        14: iconst_0
        15: istore_3
        16: iload_3
        17: iload_2
        18: if_icmpge     42
        21: aload_1
        22: iload_3
        23: caload
        24: istore        4
        26: iload         4
        28: invokestatic  #42                 // Method java/lang/Character.isLetterOrDigit:(C)Z
        31: ifne          36
        34: iconst_0
        35: ireturn
        36: iinc          3, 1
        39: goto          16
        42: iconst_1
        43: ireturn
      LineNumberTable:
        line 93: 0
        line 94: 4
        line 96: 6
        line 98: 26
        line 99: 34
        line 96: 36
        line 101: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      10     4 chars   C
            0      44     0  text   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 6 /* same */
        frame_type = 254 /* append */
          offset_delta = 9
          locals = [ class "[C", int, int ]
        frame_type = 19 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public static java.lang.String formatNumber(long);
    descriptor: (J)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: getstatic     #48                 // Field java/util/Locale.ENGLISH:Ljava/util/Locale;
         3: invokestatic  #54                 // Method java/text/NumberFormat.getInstance:(Ljava/util/Locale;)Ljava/text/NumberFormat;
         6: lload_0
         7: invokevirtual #60                 // Method java/text/NumberFormat.format:(J)Ljava/lang/String;
        10: areturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0 value   J

  public static java.lang.String scrambleString(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: ldc           #64                 // String
         3: invokevirtual #66                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
         6: invokestatic  #70                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
         9: astore_1
        10: aload_1
        11: invokestatic  #76                 // Method java/util/Collections.shuffle:(Ljava/util/List;)V
        14: new           #27                 // class java/lang/StringBuilder
        17: dup
        18: aload_0
        19: invokevirtual #82                 // Method java/lang/String.length:()I
        22: invokespecial #86                 // Method java/lang/StringBuilder."<init>":(I)V
        25: astore_2
        26: aload_1
        27: invokeinterface #89,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        32: astore_3
        33: aload_3
        34: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        39: ifeq          63
        42: aload_3
        43: invokeinterface #100,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        48: checkcast     #17                 // class java/lang/String
        51: astore        4
        53: aload_2
        54: aload         4
        56: invokevirtual #26                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        59: pop
        60: goto          33
        63: aload_2
        64: invokevirtual #104                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        67: areturn
      LineNumberTable:
        line 119: 0
        line 120: 10
        line 122: 14
        line 123: 26
        line 124: 53
        line 126: 63
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53       7     4     c   Ljava/lang/String;
            0      68     0 string   Ljava/lang/String;
           10      58     1 letters   Ljava/util/List;
           26      42     2    sb   Ljava/lang/StringBuilder;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           10      58     1 letters   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 33
          locals = [ class java/util/List, class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 29

  public static boolean isValidString(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: invokestatic  #105                // Method java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
         4: astore_2
         5: goto          15
         8: astore_3
         9: ldc           #113                // String .*
        11: invokestatic  #105                // Method java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        14: astore_2
        15: aload_2
        16: aload_0
        17: invokevirtual #115                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        20: astore_3
        21: aload_3
        22: invokevirtual #119                // Method java/util/regex/Matcher.matches:()Z
        25: ireturn
      Exception table:
         from    to  target type
             0     5     8   Class java/util/regex/PatternSyntaxException
      LineNumberTable:
        line 140: 0
        line 145: 5
        line 142: 8
        line 144: 9
        line 147: 15
        line 149: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            5       3     2 pattern   Ljava/util/regex/Pattern;
            9       6     3     e   Ljava/util/regex/PatternSyntaxException;
            0      26     0  text   Ljava/lang/String;
            0      26     1 regex   Ljava/lang/String;
           15      11     2 pattern   Ljava/util/regex/Pattern;
           21       5     3 regexp   Ljava/util/regex/Matcher;
      StackMapTable: number_of_entries = 2
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ class java/util/regex/PatternSyntaxException ]
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ class java/util/regex/Pattern ]

  public static void printSection(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: new           #27                 // class java/lang/StringBuilder
         3: dup
         4: aload_0
         5: invokedynamic #123,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        10: invokespecial #127                // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
        13: astore_1
        14: aload_1
        15: invokevirtual #128                // Method java/lang/StringBuilder.length:()I
        18: bipush        61
        20: if_icmpge     34
        23: aload_1
        24: iconst_0
        25: ldc           #129                // String -
        27: invokevirtual #131                // Method java/lang/StringBuilder.insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;
        30: pop
        31: goto          14
        34: getstatic     #135                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        37: aload_1
        38: invokevirtual #104                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        41: invokevirtual #139                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        44: return
      LineNumberTable:
        line 158: 0
        line 159: 14
        line 161: 23
        line 164: 34
        line 165: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  text   Ljava/lang/String;
           14      31     1    sb   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/lang/StringBuilder ]
        frame_type = 19 /* same */

  public static java.lang.String getTimeStamp(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1
         0: iload_0
         1: sipush        3600
         4: idiv
         5: istore_1
         6: iload_0
         7: sipush        3600
        10: irem
        11: istore_0
        12: iload_0
        13: bipush        60
        15: idiv
        16: istore_2
        17: iload_0
        18: bipush        60
        20: irem
        21: istore_0
        22: ldc           #64                 // String
        24: astore_3
        25: iload_1
        26: ifle          37
        29: aload_3
        30: iload_1
        31: invokedynamic #145,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        36: astore_3
        37: iload_2
        38: ifle          49
        41: aload_3
        42: iload_2
        43: invokedynamic #148,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        48: astore_3
        49: iload_0
        50: ifgt          60
        53: aload_3
        54: invokevirtual #82                 // Method java/lang/String.length:()I
        57: ifne          68
        60: aload_3
        61: iload_0
        62: invokedynamic #149,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        67: astore_3
        68: aload_3
        69: areturn
      LineNumberTable:
        line 174: 0
        line 175: 6
        line 176: 12
        line 177: 17
        line 179: 22
        line 180: 25
        line 181: 29
        line 182: 37
        line 183: 41
        line 184: 49
        line 185: 60
        line 187: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  time   I
            6      64     1 hours   I
           17      53     2 minutes   I
           25      45     3 result   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 37
          locals = [ int, int, class java/lang/String ]
        frame_type = 11 /* same */
        frame_type = 10 /* same */
        frame_type = 7 /* same */

  public static java.lang.String getNameWithoutExtension(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: ldc           #150                // String .
         3: invokevirtual #152                // Method java/lang/String.lastIndexOf:(Ljava/lang/String;)I
         6: istore_1
         7: iload_1
         8: ifle          18
        11: aload_0
        12: iconst_0
        13: iload_1
        14: invokevirtual #156                // Method java/lang/String.substring:(II)Ljava/lang/String;
        17: astore_0
        18: aload_0
        19: areturn
      LineNumberTable:
        line 197: 0
        line 198: 7
        line 199: 11
        line 201: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0 fileName   Ljava/lang/String;
            7      13     1   pos   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]

  public static java.lang.String trim(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #82                 // Method java/lang/String.length:()I
         4: iload_1
         5: if_icmple     17
         8: aload_0
         9: iconst_0
        10: iload_1
        11: invokevirtual #156                // Method java/lang/String.substring:(II)Ljava/lang/String;
        14: goto          18
        17: aload_0
        18: areturn
      LineNumberTable:
        line 212: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0     s   Ljava/lang/String;
            0      19     1 maxWidth   I
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public static java.lang.String trim(java.lang.String, int, java.lang.String);
    descriptor: (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: ifnull        11
         4: aload_0
         5: invokevirtual #16                 // Method java/lang/String.isEmpty:()Z
         8: ifeq          13
        11: aload_2
        12: areturn
        13: aload_0
        14: iload_1
        15: invokestatic  #160                // Method trim:(Ljava/lang/String;I)Ljava/lang/String;
        18: areturn
      LineNumberTable:
        line 224: 0
        line 225: 11
        line 227: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0     s   Ljava/lang/String;
            0      19     1 maxWidth   I
            0      19     2 defaultValue   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 1 /* same */

  public static java.lang.String trimAndDress(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #82                 // Method java/lang/String.length:()I
         4: iload_1
         5: if_icmple     24
         8: aload_0
         9: iconst_0
        10: iload_1
        11: iconst_3
        12: isub
        13: invokevirtual #156                // Method java/lang/String.substring:(II)Ljava/lang/String;
        16: astore_0
        17: aload_0
        18: invokedynamic #163,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        23: astore_0
        24: aload_0
        25: areturn
      LineNumberTable:
        line 238: 0
        line 240: 8
        line 241: 17
        line 243: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0     s   Ljava/lang/String;
            0      26     1 maxWidth   I
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public static final int getTimeStamp(java.lang.String);
    descriptor: (Ljava/lang/String;)I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: ldc           #164                // String no
         9: invokevirtual #166                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        12: ifeq          17
        15: iconst_m1
        16: ireturn
        17: aload_0
        18: ldc           #169                // String hour
        20: invokevirtual #171                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        23: ifeq          42
        26: aload_0
        27: ldc           #169                // String hour
        29: invokevirtual #66                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        32: iconst_0
        33: aaload
        34: invokestatic  #174                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        37: sipush        3600
        40: imul
        41: ireturn
        42: aload_0
        43: ldc           #179                // String min
        45: invokevirtual #171                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        48: ifeq          66
        51: aload_0
        52: ldc           #179                // String min
        54: invokevirtual #66                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        57: iconst_0
        58: aaload
        59: invokestatic  #174                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        62: bipush        60
        64: imul
        65: ireturn
        66: aload_0
        67: ldc           #181                // String sec
        69: invokevirtual #171                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        72: ifeq          87
        75: aload_0
        76: ldc           #181                // String sec
        78: invokevirtual #66                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        81: iconst_0
        82: aaload
        83: invokestatic  #174                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        86: ireturn
        87: iconst_0
        88: ireturn
      LineNumberTable:
        line 252: 0
        line 253: 4
        line 255: 6
        line 256: 15
        line 258: 17
        line 259: 26
        line 261: 42
        line 262: 51
        line 264: 66
        line 265: 75
        line 267: 87
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      89     0 timestamp   Ljava/lang/String;
      StackMapTable: number_of_entries = 5
        frame_type = 6 /* same */
        frame_type = 10 /* same */
        frame_type = 24 /* same */
        frame_type = 23 /* same */
        frame_type = 20 /* same */

  public static java.lang.String getCreatureDescription(java.lang.StringBuilder, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/StringBuilder;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: ifnonnull     7
         4: ldc           #183                // String none
         6: areturn
         7: aload_1
         8: invokevirtual #185                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        11: invokevirtual #191                // Method ext/mods/gameserver/model/location/SpawnLocation.toString:()Ljava/lang/String;
        14: ldc           #194                // String ,
        16: ldc           #64                 // String
        18: invokevirtual #196                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        21: astore_2
        22: aload_2
        23: aload_1
        24: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
        27: bipush        12
        29: invokestatic  #203                // Method trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
        32: invokedynamic #206,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        37: areturn
      LineNumberTable:
        line 272: 0
        line 273: 4
        line 275: 7
        line 277: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0    sb   Ljava/lang/StringBuilder;
            0      38     1 creature   Lext/mods/gameserver/model/actor/Creature;
           22      16     2 teleLoc   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 7 /* same */

  public static boolean matches(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: ifnull        22
         4: aload_0
         5: invokevirtual #209                // Method java/lang/String.isBlank:()Z
         8: ifne          22
        11: aload_1
        12: ifnull        22
        15: aload_1
        16: invokevirtual #209                // Method java/lang/String.isBlank:()Z
        19: ifeq          24
        22: iconst_0
        23: ireturn
        24: aload_1
        25: invokevirtual #212                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        28: ldc           #215                // String
        30: invokevirtual #66                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        33: invokestatic  #217                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
        36: aload_0
        37: invokedynamic #221,  0            // InvokeDynamic #6:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        42: invokeinterface #225,  2          // InterfaceMethod java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
        47: ireturn
      LineNumberTable:
        line 287: 0
        line 288: 22
        line 290: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  name   Ljava/lang/String;
            0      48     1 search   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 1 /* same */

  public static java.lang.String getMpGauge(int, long, long, boolean);
    descriptor: (IJJZ)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=12, locals=6, args_size=4
         0: iload_0
         1: lload_1
         2: lload_3
         3: iload         5
         5: ldc           #231                // String L2UI_CH3.br_bar1_mp
         7: ldc           #231                // String L2UI_CH3.br_bar1_mp
         9: ldc2_w        #233                // long 12l
        12: ldc2_w        #235                // long -13l
        15: invokestatic  #237                // Method getGauge:(IJJZLjava/lang/String;Ljava/lang/String;JJ)Ljava/lang/String;
        18: areturn
      LineNumberTable:
        line 303: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0 width   I
            0      19     1 current   J
            0      19     3   max   J
            0      19     5 displayAsPercentage   Z

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #140                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #1                  // class ext/mods/commons/lang/StringUtil
         6: invokevirtual #314                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #317                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #135                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 47: 0
}
SourceFile: "StringUtil.java"
BootstrapMethods:
  0: #440 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #422 =[ \u0001 ]
  1: #440 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #424 \u0001\u0001h
  2: #440 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #426 \u0001 \u0001m
  3: #440 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #428 \u0001 \u0001s
  4: #440 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #430 \u0001...
  5: #440 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #432 <a action=\"bypass admin_teleport \u0001\">\u0001</a>
  6: #446 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #434 (Ljava/lang/Object;)Z
      #436 REF_invokeStatic ext/mods/commons/lang/StringUtil.lambda$matches$0:(Ljava/lang/String;Ljava/lang/String;)Z
      #439 (Ljava/lang/String;)Z
InnerClasses:
  public static final #458= #454 of #456; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
