// Bytecode for: ext.mods.fakeplayer.move.GiranMove
// File: ext\mods\fakeplayer\move\GiranMove.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/move/GiranMove.class
  Last modified 9 de jul de 2026; size 3866 bytes
  MD5 checksum 9e176b35a5e8516bcc78cfcd0082d6af
  Compiled from "GiranMove.java"
public class ext.mods.fakeplayer.move.GiranMove
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #245                        // ext/mods/fakeplayer/move/GiranMove
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // Giran
    #8 = Utf8               Giran
    #9 = Class              #10           // ext/mods/gameserver/model/location/Location
   #10 = Utf8               ext/mods/gameserver/model/location/Location
   #11 = Integer            81474
   #12 = Integer            148002
   #13 = Methodref          #9.#14        // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #14 = NameAndType        #5:#15        // "<init>":(III)V
   #15 = Utf8               (III)V
   #16 = Integer            81184
   #17 = Integer            148917
   #18 = Integer            81615
   #19 = Integer            149575
   #20 = Integer            82072
   #21 = Integer            147560
   #22 = Integer            82792
   #23 = Integer            147832
   #24 = Integer            83320
   #25 = Integer            147976
   #26 = Integer            84584
   #27 = Integer            148536
   #28 = Integer            83384
   #29 = Integer            149256
   #30 = Integer            83064
   #31 = Integer            148392
   #32 = Integer            87016
   #33 = Integer            148632
   #34 = Integer            85816
   #35 = Integer            148872
   #36 = Integer            85832
   #37 = Integer            153208
   #38 = Integer            81384
   #39 = Integer            150040
   #40 = Integer            79656
   #41 = Integer            150728
   #42 = Integer            79272
   #43 = Integer            149544
   #44 = Integer            83623
   #45 = Integer            148626
   #46 = Integer            84167
   #47 = Integer            148609
   #48 = Integer            81543
   #49 = Integer            149722
   #50 = Integer            81548
   #51 = Integer            150020
   #52 = Integer            81370
   #53 = Integer            150045
   #54 = Integer            81291
   #55 = Integer            150296
   #56 = Integer            81778
   #57 = Integer            150649
   #58 = Integer            81976
   #59 = Integer            150659
   #60 = Integer            80948
   #61 = Integer            150324
   #62 = Integer            81549
   #63 = Integer            152312
   #64 = Integer            83905
   #65 = Integer            147541
   #66 = Integer            83884
   #67 = Integer            146570
   #68 = Integer            84094
   #69 = Integer            146505
   #70 = Integer            84619
   #71 = Integer            146483
   #72 = Integer            85193
   #73 = Integer            146476
   #74 = Integer            85585
   #75 = Integer            146469
   #76 = Integer            85315
   #77 = Integer            146599
   #78 = Integer            85263
   #79 = Integer            146353
   #80 = Integer            81544
   #81 = Integer            144452
   #82 = Integer            81289
   #83 = Integer            144438
   #84 = Integer            80632
   #85 = Integer            144381
   #86 = Integer            83868
   #87 = Integer            144641
   #88 = Integer            80617
   #89 = Integer            144573
   #90 = Integer            80529
   #91 = Integer            144810
   #92 = Integer            81537
   #93 = Integer            144596
   #94 = Integer            146509
   #95 = Integer            81635
   #96 = Integer            146555
   #97 = Integer            82051
   #98 = Integer            146596
   #99 = Integer            82895
  #100 = Integer            146666
  #101 = Integer            80744
  #102 = Integer            146424
  #103 = Integer            83555
  #104 = Integer            149262
  #105 = Integer            83597
  #106 = Integer            149573
  #107 = Integer            83948
  #108 = Integer            149662
  #109 = Integer            84467
  #110 = Integer            149595
  #111 = Integer            84950
  #112 = Integer            149607
  #113 = Integer            85409
  #114 = Integer            149739
  #115 = Integer            85429
  #116 = Integer            149633
  #117 = Integer            86243
  #118 = Integer            149683
  #119 = Integer            85858
  #120 = Integer            149825
  #121 = Integer            85778
  #122 = Integer            149843
  #123 = Integer            85933
  #124 = Integer            150223
  #125 = Integer            85712
  #126 = Integer            150219
  #127 = Integer            85415
  #128 = Integer            150127
  #129 = Integer            85861
  #130 = Integer            150424
  #131 = Integer            85905
  #132 = Integer            151003
  #133 = Integer            85810
  #134 = Integer            151867
  #135 = Integer            85823
  #136 = Integer            153169
  #137 = Integer            86306
  #138 = Integer            153286
  #139 = Integer            86327
  #140 = Integer            152997
  #141 = Integer            85335
  #142 = Integer            153136
  #143 = Integer            85367
  #144 = Integer            85327
  #145 = Integer            153309
  #146 = Integer            148412
  #147 = Integer            86480
  #148 = Integer            148426
  #149 = Integer            86866
  #150 = Integer            148754
  #151 = Integer            86465
  #152 = Integer            148803
  #153 = Integer            84661
  #154 = Integer            194055
  #155 = Integer            84894
  #156 = Integer            149055
  #157 = Integer            85691
  #158 = Integer            149085
  #159 = Integer            82440
  #160 = Integer            148789
  #161 = Integer            82202
  #162 = Integer            149019
  #163 = Integer            82186
  #164 = Integer            148915
  #165 = Integer            82472
  #166 = Integer            148409
  #167 = Integer            81772
  #168 = Integer            148139
  #169 = Integer            81008
  #170 = Integer            148624
  #171 = Integer            80431
  #172 = Integer            148614
  #173 = Integer            79808
  #174 = Integer            148716
  #175 = Integer            79006
  #176 = Integer            148671
  #177 = Integer            78491
  #178 = Integer            148438
  #179 = Integer            77354
  #180 = Integer            77543
  #181 = Integer            148378
  #182 = Integer            77510
  #183 = Integer            148175
  #184 = Integer            79031
  #185 = Integer            149381
  #186 = Integer            79801
  #187 = Integer            149470
  #188 = Integer            80387
  #189 = Integer            149447
  #190 = Integer            80418
  #191 = Integer            149307
  #192 = Integer            80421
  #193 = Integer            149186
  #194 = Integer            79295
  #195 = Integer            149555
  #196 = Integer            79797
  #197 = Integer            148227
  #198 = Integer            80051
  #199 = Integer            148181
  #200 = Integer            80340
  #201 = Integer            148179
  #202 = Integer            80442
  #203 = Integer            147945
  #204 = Integer            147877
  #205 = Integer            80486
  #206 = Integer            147711
  #207 = Integer            79916
  #208 = Integer            147639
  #209 = Integer            79325
  #210 = Integer            147081
  #211 = Integer            81028
  #212 = Integer            147014
  #213 = Integer            80781
  #214 = Integer            146472
  #215 = Integer            81356
  #216 = Integer            145540
  #217 = Integer            80512
  #218 = Integer            145492
  #219 = Integer            81029
  #220 = Integer            145796
  #221 = Integer            80002
  #222 = Integer            145839
  #223 = Integer            79671
  #224 = Integer            145566
  #225 = Integer            84759
  #226 = Integer            149488
  #227 = Methodref          #228.#229     // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
  #228 = Class              #230          // java/util/Arrays
  #229 = NameAndType        #231:#232     // asList:([Ljava/lang/Object;)Ljava/util/List;
  #230 = Utf8               java/util/Arrays
  #231 = Utf8               asList
  #232 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #233 = Methodref          #234.#235     // ext/mods/fakeplayer/holder/WalkerHolder.addCityWaypoints:(Ljava/lang/String;Ljava/util/List;)V
  #234 = Class              #236          // ext/mods/fakeplayer/holder/WalkerHolder
  #235 = NameAndType        #237:#238     // addCityWaypoints:(Ljava/lang/String;Ljava/util/List;)V
  #236 = Utf8               ext/mods/fakeplayer/holder/WalkerHolder
  #237 = Utf8               addCityWaypoints
  #238 = Utf8               (Ljava/lang/String;Ljava/util/List;)V
  #239 = Fieldref           #240.#241     // ext/mods/fakeplayer/move/GiranMove$SingletonHolder.INSTANCE:Lext/mods/fakeplayer/move/GiranMove;
  #240 = Class              #242          // ext/mods/fakeplayer/move/GiranMove$SingletonHolder
  #241 = NameAndType        #243:#244     // INSTANCE:Lext/mods/fakeplayer/move/GiranMove;
  #242 = Utf8               ext/mods/fakeplayer/move/GiranMove$SingletonHolder
  #243 = Utf8               INSTANCE
  #244 = Utf8               Lext/mods/fakeplayer/move/GiranMove;
  #245 = Class              #246          // ext/mods/fakeplayer/move/GiranMove
  #246 = Utf8               ext/mods/fakeplayer/move/GiranMove
  #247 = Utf8               Code
  #248 = Utf8               LineNumberTable
  #249 = Utf8               LocalVariableTable
  #250 = Utf8               this
  #251 = Utf8               getInstance
  #252 = Utf8               ()Lext/mods/fakeplayer/move/GiranMove;
  #253 = Utf8               SourceFile
  #254 = Utf8               GiranMove.java
  #255 = Utf8               NestMembers
  #256 = Utf8               InnerClasses
  #257 = Utf8               SingletonHolder
{
  public ext.mods.fakeplayer.move.GiranMove();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: ldc           #7                  // String Giran
         6: bipush        109
         8: anewarray     #9                  // class ext/mods/gameserver/model/location/Location
        11: dup
        12: iconst_0
        13: new           #9                  // class ext/mods/gameserver/model/location/Location
        16: dup
        17: ldc           #11                 // int 81474
        19: ldc           #12                 // int 148002
        21: sipush        -3474
        24: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        27: aastore
        28: dup
        29: iconst_1
        30: new           #9                  // class ext/mods/gameserver/model/location/Location
        33: dup
        34: ldc           #16                 // int 81184
        36: ldc           #17                 // int 148917
        38: sipush        -3474
        41: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        44: aastore
        45: dup
        46: iconst_2
        47: new           #9                  // class ext/mods/gameserver/model/location/Location
        50: dup
        51: ldc           #18                 // int 81615
        53: ldc           #19                 // int 149575
        55: sipush        -3474
        58: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        61: aastore
        62: dup
        63: iconst_3
        64: new           #9                  // class ext/mods/gameserver/model/location/Location
        67: dup
        68: ldc           #20                 // int 82072
        70: ldc           #21                 // int 147560
        72: sipush        -3464
        75: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        78: aastore
        79: dup
        80: iconst_4
        81: new           #9                  // class ext/mods/gameserver/model/location/Location
        84: dup
        85: ldc           #22                 // int 82792
        87: ldc           #23                 // int 147832
        89: sipush        -3464
        92: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        95: aastore
        96: dup
        97: iconst_5
        98: new           #9                  // class ext/mods/gameserver/model/location/Location
       101: dup
       102: ldc           #24                 // int 83320
       104: ldc           #25                 // int 147976
       106: sipush        -3400
       109: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       112: aastore
       113: dup
       114: bipush        6
       116: new           #9                  // class ext/mods/gameserver/model/location/Location
       119: dup
       120: ldc           #26                 // int 84584
       122: ldc           #27                 // int 148536
       124: sipush        -3400
       127: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       130: aastore
       131: dup
       132: bipush        7
       134: new           #9                  // class ext/mods/gameserver/model/location/Location
       137: dup
       138: ldc           #28                 // int 83384
       140: ldc           #29                 // int 149256
       142: sipush        -3400
       145: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       148: aastore
       149: dup
       150: bipush        8
       152: new           #9                  // class ext/mods/gameserver/model/location/Location
       155: dup
       156: ldc           #30                 // int 83064
       158: ldc           #31                 // int 148392
       160: sipush        -3464
       163: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       166: aastore
       167: dup
       168: bipush        9
       170: new           #9                  // class ext/mods/gameserver/model/location/Location
       173: dup
       174: ldc           #32                 // int 87016
       176: ldc           #33                 // int 148632
       178: sipush        -3400
       181: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       184: aastore
       185: dup
       186: bipush        10
       188: new           #9                  // class ext/mods/gameserver/model/location/Location
       191: dup
       192: ldc           #34                 // int 85816
       194: ldc           #35                 // int 148872
       196: sipush        -3400
       199: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       202: aastore
       203: dup
       204: bipush        11
       206: new           #9                  // class ext/mods/gameserver/model/location/Location
       209: dup
       210: ldc           #36                 // int 85832
       212: ldc           #37                 // int 153208
       214: sipush        -3496
       217: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       220: aastore
       221: dup
       222: bipush        12
       224: new           #9                  // class ext/mods/gameserver/model/location/Location
       227: dup
       228: ldc           #38                 // int 81384
       230: ldc           #39                 // int 150040
       232: sipush        -3528
       235: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       238: aastore
       239: dup
       240: bipush        13
       242: new           #9                  // class ext/mods/gameserver/model/location/Location
       245: dup
       246: ldc           #40                 // int 79656
       248: ldc           #41                 // int 150728
       250: sipush        -3512
       253: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       256: aastore
       257: dup
       258: bipush        14
       260: new           #9                  // class ext/mods/gameserver/model/location/Location
       263: dup
       264: ldc           #42                 // int 79272
       266: ldc           #43                 // int 149544
       268: sipush        -3528
       271: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       274: aastore
       275: dup
       276: bipush        15
       278: new           #9                  // class ext/mods/gameserver/model/location/Location
       281: dup
       282: ldc           #44                 // int 83623
       284: ldc           #45                 // int 148626
       286: sipush        -3405
       289: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       292: aastore
       293: dup
       294: bipush        16
       296: new           #9                  // class ext/mods/gameserver/model/location/Location
       299: dup
       300: ldc           #46                 // int 84167
       302: ldc           #47                 // int 148609
       304: sipush        -3402
       307: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       310: aastore
       311: dup
       312: bipush        17
       314: new           #9                  // class ext/mods/gameserver/model/location/Location
       317: dup
       318: ldc           #48                 // int 81543
       320: ldc           #49                 // int 149722
       322: sipush        -3464
       325: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       328: aastore
       329: dup
       330: bipush        18
       332: new           #9                  // class ext/mods/gameserver/model/location/Location
       335: dup
       336: ldc           #50                 // int 81548
       338: ldc           #51                 // int 150020
       340: sipush        -3533
       343: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       346: aastore
       347: dup
       348: bipush        19
       350: new           #9                  // class ext/mods/gameserver/model/location/Location
       353: dup
       354: ldc           #52                 // int 81370
       356: ldc           #53                 // int 150045
       358: sipush        -3533
       361: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       364: aastore
       365: dup
       366: bipush        20
       368: new           #9                  // class ext/mods/gameserver/model/location/Location
       371: dup
       372: ldc           #54                 // int 81291
       374: ldc           #55                 // int 150296
       376: sipush        -3533
       379: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       382: aastore
       383: dup
       384: bipush        21
       386: new           #9                  // class ext/mods/gameserver/model/location/Location
       389: dup
       390: ldc           #56                 // int 81778
       392: ldc           #57                 // int 150649
       394: sipush        -3533
       397: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       400: aastore
       401: dup
       402: bipush        22
       404: new           #9                  // class ext/mods/gameserver/model/location/Location
       407: dup
       408: ldc           #58                 // int 81976
       410: ldc           #59                 // int 150659
       412: sipush        -3533
       415: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       418: aastore
       419: dup
       420: bipush        23
       422: new           #9                  // class ext/mods/gameserver/model/location/Location
       425: dup
       426: ldc           #60                 // int 80948
       428: ldc           #61                 // int 150324
       430: sipush        -3528
       433: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       436: aastore
       437: dup
       438: bipush        24
       440: new           #9                  // class ext/mods/gameserver/model/location/Location
       443: dup
       444: ldc           #62                 // int 81549
       446: ldc           #63                 // int 152312
       448: sipush        -3533
       451: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       454: aastore
       455: dup
       456: bipush        25
       458: new           #9                  // class ext/mods/gameserver/model/location/Location
       461: dup
       462: ldc           #64                 // int 83905
       464: ldc           #65                 // int 147541
       466: sipush        -3405
       469: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       472: aastore
       473: dup
       474: bipush        26
       476: new           #9                  // class ext/mods/gameserver/model/location/Location
       479: dup
       480: ldc           #66                 // int 83884
       482: ldc           #67                 // int 146570
       484: sipush        -3405
       487: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       490: aastore
       491: dup
       492: bipush        27
       494: new           #9                  // class ext/mods/gameserver/model/location/Location
       497: dup
       498: ldc           #68                 // int 84094
       500: ldc           #69                 // int 146505
       502: sipush        -3405
       505: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       508: aastore
       509: dup
       510: bipush        28
       512: new           #9                  // class ext/mods/gameserver/model/location/Location
       515: dup
       516: ldc           #70                 // int 84619
       518: ldc           #71                 // int 146483
       520: sipush        -3405
       523: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       526: aastore
       527: dup
       528: bipush        29
       530: new           #9                  // class ext/mods/gameserver/model/location/Location
       533: dup
       534: ldc           #72                 // int 85193
       536: ldc           #73                 // int 146476
       538: sipush        -3400
       541: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       544: aastore
       545: dup
       546: bipush        30
       548: new           #9                  // class ext/mods/gameserver/model/location/Location
       551: dup
       552: ldc           #74                 // int 85585
       554: ldc           #75                 // int 146469
       556: sipush        -3400
       559: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       562: aastore
       563: dup
       564: bipush        31
       566: new           #9                  // class ext/mods/gameserver/model/location/Location
       569: dup
       570: ldc           #76                 // int 85315
       572: ldc           #77                 // int 146599
       574: sipush        -3401
       577: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       580: aastore
       581: dup
       582: bipush        32
       584: new           #9                  // class ext/mods/gameserver/model/location/Location
       587: dup
       588: ldc           #78                 // int 85263
       590: ldc           #79                 // int 146353
       592: sipush        -3400
       595: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       598: aastore
       599: dup
       600: bipush        33
       602: new           #9                  // class ext/mods/gameserver/model/location/Location
       605: dup
       606: ldc           #80                 // int 81544
       608: ldc           #81                 // int 144452
       610: sipush        -3533
       613: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       616: aastore
       617: dup
       618: bipush        34
       620: new           #9                  // class ext/mods/gameserver/model/location/Location
       623: dup
       624: ldc           #82                 // int 81289
       626: ldc           #83                 // int 144438
       628: sipush        -3533
       631: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       634: aastore
       635: dup
       636: bipush        35
       638: new           #9                  // class ext/mods/gameserver/model/location/Location
       641: dup
       642: ldc           #84                 // int 80632
       644: ldc           #85                 // int 144381
       646: sipush        -3533
       649: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       652: aastore
       653: dup
       654: bipush        36
       656: new           #9                  // class ext/mods/gameserver/model/location/Location
       659: dup
       660: ldc           #86                 // int 83868
       662: ldc           #87                 // int 144641
       664: sipush        -3405
       667: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       670: aastore
       671: dup
       672: bipush        37
       674: new           #9                  // class ext/mods/gameserver/model/location/Location
       677: dup
       678: ldc           #88                 // int 80617
       680: ldc           #89                 // int 144573
       682: sipush        -3533
       685: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       688: aastore
       689: dup
       690: bipush        38
       692: new           #9                  // class ext/mods/gameserver/model/location/Location
       695: dup
       696: ldc           #90                 // int 80529
       698: ldc           #91                 // int 144810
       700: sipush        -3533
       703: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       706: aastore
       707: dup
       708: bipush        39
       710: new           #9                  // class ext/mods/gameserver/model/location/Location
       713: dup
       714: ldc           #92                 // int 81537
       716: ldc           #93                 // int 144596
       718: sipush        -3528
       721: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       724: aastore
       725: dup
       726: bipush        40
       728: new           #9                  // class ext/mods/gameserver/model/location/Location
       731: dup
       732: ldc           #50                 // int 81548
       734: ldc           #94                 // int 146509
       736: sipush        -3533
       739: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       742: aastore
       743: dup
       744: bipush        41
       746: new           #9                  // class ext/mods/gameserver/model/location/Location
       749: dup
       750: ldc           #95                 // int 81635
       752: ldc           #96                 // int 146555
       754: sipush        -3533
       757: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       760: aastore
       761: dup
       762: bipush        42
       764: new           #9                  // class ext/mods/gameserver/model/location/Location
       767: dup
       768: ldc           #97                 // int 82051
       770: ldc           #98                 // int 146596
       772: sipush        -3533
       775: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       778: aastore
       779: dup
       780: bipush        43
       782: new           #9                  // class ext/mods/gameserver/model/location/Location
       785: dup
       786: ldc           #99                 // int 82895
       788: ldc           #100                // int 146666
       790: sipush        -3465
       793: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       796: aastore
       797: dup
       798: bipush        44
       800: new           #9                  // class ext/mods/gameserver/model/location/Location
       803: dup
       804: ldc           #101                // int 80744
       806: ldc           #102                // int 146424
       808: sipush        -3528
       811: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       814: aastore
       815: dup
       816: bipush        45
       818: new           #9                  // class ext/mods/gameserver/model/location/Location
       821: dup
       822: ldc           #103                // int 83555
       824: ldc           #104                // int 149262
       826: sipush        -3405
       829: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       832: aastore
       833: dup
       834: bipush        46
       836: new           #9                  // class ext/mods/gameserver/model/location/Location
       839: dup
       840: ldc           #105                // int 83597
       842: ldc           #106                // int 149573
       844: sipush        -3405
       847: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       850: aastore
       851: dup
       852: bipush        47
       854: new           #9                  // class ext/mods/gameserver/model/location/Location
       857: dup
       858: ldc           #107                // int 83948
       860: ldc           #108                // int 149662
       862: sipush        -3405
       865: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       868: aastore
       869: dup
       870: bipush        48
       872: new           #9                  // class ext/mods/gameserver/model/location/Location
       875: dup
       876: ldc           #109                // int 84467
       878: ldc           #110                // int 149595
       880: sipush        -3405
       883: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       886: aastore
       887: dup
       888: bipush        49
       890: new           #9                  // class ext/mods/gameserver/model/location/Location
       893: dup
       894: ldc           #111                // int 84950
       896: ldc           #112                // int 149607
       898: sipush        -3405
       901: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       904: aastore
       905: dup
       906: bipush        50
       908: new           #9                  // class ext/mods/gameserver/model/location/Location
       911: dup
       912: ldc           #113                // int 85409
       914: ldc           #114                // int 149739
       916: sipush        -3392
       919: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       922: aastore
       923: dup
       924: bipush        51
       926: new           #9                  // class ext/mods/gameserver/model/location/Location
       929: dup
       930: ldc           #115                // int 85429
       932: ldc           #116                // int 149633
       934: sipush        -3392
       937: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       940: aastore
       941: dup
       942: bipush        52
       944: new           #9                  // class ext/mods/gameserver/model/location/Location
       947: dup
       948: ldc           #117                // int 86243
       950: ldc           #118                // int 149683
       952: sipush        -3392
       955: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       958: aastore
       959: dup
       960: bipush        53
       962: new           #9                  // class ext/mods/gameserver/model/location/Location
       965: dup
       966: ldc           #119                // int 85858
       968: ldc           #120                // int 149825
       970: sipush        -3392
       973: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       976: aastore
       977: dup
       978: bipush        54
       980: new           #9                  // class ext/mods/gameserver/model/location/Location
       983: dup
       984: ldc           #121                // int 85778
       986: ldc           #122                // int 149843
       988: sipush        -3392
       991: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       994: aastore
       995: dup
       996: bipush        55
       998: new           #9                  // class ext/mods/gameserver/model/location/Location
      1001: dup
      1002: ldc           #123                // int 85933
      1004: ldc           #124                // int 150223
      1006: sipush        -3405
      1009: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1012: aastore
      1013: dup
      1014: bipush        56
      1016: new           #9                  // class ext/mods/gameserver/model/location/Location
      1019: dup
      1020: ldc           #125                // int 85712
      1022: ldc           #126                // int 150219
      1024: sipush        -3405
      1027: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1030: aastore
      1031: dup
      1032: bipush        57
      1034: new           #9                  // class ext/mods/gameserver/model/location/Location
      1037: dup
      1038: ldc           #127                // int 85415
      1040: ldc           #128                // int 150127
      1042: sipush        -3405
      1045: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1048: aastore
      1049: dup
      1050: bipush        58
      1052: new           #9                  // class ext/mods/gameserver/model/location/Location
      1055: dup
      1056: ldc           #129                // int 85861
      1058: ldc           #130                // int 150424
      1060: sipush        -3490
      1063: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1066: aastore
      1067: dup
      1068: bipush        59
      1070: new           #9                  // class ext/mods/gameserver/model/location/Location
      1073: dup
      1074: ldc           #131                // int 85905
      1076: ldc           #132                // int 151003
      1078: sipush        -3533
      1081: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1084: aastore
      1085: dup
      1086: bipush        60
      1088: new           #9                  // class ext/mods/gameserver/model/location/Location
      1091: dup
      1092: ldc           #133                // int 85810
      1094: ldc           #134                // int 151867
      1096: sipush        -3533
      1099: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1102: aastore
      1103: dup
      1104: bipush        61
      1106: new           #9                  // class ext/mods/gameserver/model/location/Location
      1109: dup
      1110: ldc           #135                // int 85823
      1112: ldc           #136                // int 153169
      1114: sipush        -3496
      1117: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1120: aastore
      1121: dup
      1122: bipush        62
      1124: new           #9                  // class ext/mods/gameserver/model/location/Location
      1127: dup
      1128: ldc           #137                // int 86306
      1130: ldc           #138                // int 153286
      1132: sipush        -3496
      1135: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1138: aastore
      1139: dup
      1140: bipush        63
      1142: new           #9                  // class ext/mods/gameserver/model/location/Location
      1145: dup
      1146: ldc           #139                // int 86327
      1148: ldc           #140                // int 152997
      1150: sipush        -3496
      1153: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1156: aastore
      1157: dup
      1158: bipush        64
      1160: new           #9                  // class ext/mods/gameserver/model/location/Location
      1163: dup
      1164: ldc           #141                // int 85335
      1166: ldc           #142                // int 153136
      1168: sipush        -3496
      1171: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1174: aastore
      1175: dup
      1176: bipush        65
      1178: new           #9                  // class ext/mods/gameserver/model/location/Location
      1181: dup
      1182: ldc           #143                // int 85367
      1184: sipush        15986
      1187: sipush        -3496
      1190: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1193: aastore
      1194: dup
      1195: bipush        66
      1197: new           #9                  // class ext/mods/gameserver/model/location/Location
      1200: dup
      1201: ldc           #144                // int 85327
      1203: ldc           #145                // int 153309
      1205: sipush        -3496
      1208: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1211: aastore
      1212: dup
      1213: bipush        67
      1215: new           #9                  // class ext/mods/gameserver/model/location/Location
      1218: dup
      1219: ldc           #34                 // int 85816
      1221: ldc           #146                // int 148412
      1223: sipush        -3400
      1226: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1229: aastore
      1230: dup
      1231: bipush        68
      1233: new           #9                  // class ext/mods/gameserver/model/location/Location
      1236: dup
      1237: ldc           #147                // int 86480
      1239: ldc           #148                // int 148426
      1241: sipush        -3402
      1244: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1247: aastore
      1248: dup
      1249: bipush        69
      1251: new           #9                  // class ext/mods/gameserver/model/location/Location
      1254: dup
      1255: ldc           #149                // int 86866
      1257: ldc           #150                // int 148754
      1259: sipush        -3402
      1262: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1265: aastore
      1266: dup
      1267: bipush        70
      1269: new           #9                  // class ext/mods/gameserver/model/location/Location
      1272: dup
      1273: ldc           #151                // int 86465
      1275: ldc           #152                // int 148803
      1277: sipush        -3402
      1280: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1283: aastore
      1284: dup
      1285: bipush        71
      1287: new           #9                  // class ext/mods/gameserver/model/location/Location
      1290: dup
      1291: ldc           #153                // int 84661
      1293: ldc           #154                // int 194055
      1295: sipush        -3391
      1298: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1301: aastore
      1302: dup
      1303: bipush        72
      1305: new           #9                  // class ext/mods/gameserver/model/location/Location
      1308: dup
      1309: ldc           #155                // int 84894
      1311: ldc           #156                // int 149055
      1313: sipush        -3391
      1316: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1319: aastore
      1320: dup
      1321: bipush        73
      1323: new           #9                  // class ext/mods/gameserver/model/location/Location
      1326: dup
      1327: ldc           #157                // int 85691
      1329: ldc           #158                // int 149085
      1331: sipush        -3402
      1334: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1337: aastore
      1338: dup
      1339: bipush        74
      1341: new           #9                  // class ext/mods/gameserver/model/location/Location
      1344: dup
      1345: ldc           #159                // int 82440
      1347: ldc           #160                // int 148789
      1349: sipush        -3469
      1352: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1355: aastore
      1356: dup
      1357: bipush        75
      1359: new           #9                  // class ext/mods/gameserver/model/location/Location
      1362: dup
      1363: ldc           #161                // int 82202
      1365: ldc           #162                // int 149019
      1367: sipush        -3469
      1370: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1373: aastore
      1374: dup
      1375: bipush        76
      1377: new           #9                  // class ext/mods/gameserver/model/location/Location
      1380: dup
      1381: ldc           #163                // int 82186
      1383: ldc           #164                // int 148915
      1385: sipush        -3467
      1388: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1391: aastore
      1392: dup
      1393: bipush        77
      1395: new           #9                  // class ext/mods/gameserver/model/location/Location
      1398: dup
      1399: ldc           #165                // int 82472
      1401: ldc           #166                // int 148409
      1403: sipush        -3469
      1406: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1409: aastore
      1410: dup
      1411: bipush        78
      1413: new           #9                  // class ext/mods/gameserver/model/location/Location
      1416: dup
      1417: ldc           #167                // int 81772
      1419: ldc           #168                // int 148139
      1421: sipush        -3467
      1424: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1427: aastore
      1428: dup
      1429: bipush        79
      1431: new           #9                  // class ext/mods/gameserver/model/location/Location
      1434: dup
      1435: ldc           #169                // int 81008
      1437: ldc           #170                // int 148624
      1439: sipush        -3469
      1442: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1445: aastore
      1446: dup
      1447: bipush        80
      1449: new           #9                  // class ext/mods/gameserver/model/location/Location
      1452: dup
      1453: ldc           #171                // int 80431
      1455: ldc           #172                // int 148614
      1457: sipush        -3528
      1460: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1463: aastore
      1464: dup
      1465: bipush        81
      1467: new           #9                  // class ext/mods/gameserver/model/location/Location
      1470: dup
      1471: ldc           #173                // int 79808
      1473: ldc           #174                // int 148716
      1475: sipush        -3533
      1478: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1481: aastore
      1482: dup
      1483: bipush        82
      1485: new           #9                  // class ext/mods/gameserver/model/location/Location
      1488: dup
      1489: ldc           #175                // int 79006
      1491: ldc           #176                // int 148671
      1493: sipush        -3597
      1496: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1499: aastore
      1500: dup
      1501: bipush        83
      1503: new           #9                  // class ext/mods/gameserver/model/location/Location
      1506: dup
      1507: ldc           #177                // int 78491
      1509: ldc           #178                // int 148438
      1511: sipush        -3597
      1514: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1517: aastore
      1518: dup
      1519: bipush        84
      1521: new           #9                  // class ext/mods/gameserver/model/location/Location
      1524: dup
      1525: ldc           #179                // int 77354
      1527: ldc           #33                 // int 148632
      1529: sipush        -3597
      1532: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1535: aastore
      1536: dup
      1537: bipush        85
      1539: new           #9                  // class ext/mods/gameserver/model/location/Location
      1542: dup
      1543: ldc           #180                // int 77543
      1545: ldc           #181                // int 148378
      1547: sipush        -3592
      1550: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1553: aastore
      1554: dup
      1555: bipush        86
      1557: new           #9                  // class ext/mods/gameserver/model/location/Location
      1560: dup
      1561: ldc           #182                // int 77510
      1563: ldc           #183                // int 148175
      1565: sipush        -3592
      1568: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1571: aastore
      1572: dup
      1573: bipush        87
      1575: new           #9                  // class ext/mods/gameserver/model/location/Location
      1578: dup
      1579: ldc           #184                // int 79031
      1581: ldc           #185                // int 149381
      1583: sipush        -3597
      1586: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1589: aastore
      1590: dup
      1591: bipush        88
      1593: new           #9                  // class ext/mods/gameserver/model/location/Location
      1596: dup
      1597: ldc           #186                // int 79801
      1599: ldc           #187                // int 149470
      1601: sipush        -3533
      1604: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1607: aastore
      1608: dup
      1609: bipush        89
      1611: new           #9                  // class ext/mods/gameserver/model/location/Location
      1614: dup
      1615: ldc           #188                // int 80387
      1617: ldc           #189                // int 149447
      1619: sipush        -3511
      1622: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1625: aastore
      1626: dup
      1627: bipush        90
      1629: new           #9                  // class ext/mods/gameserver/model/location/Location
      1632: dup
      1633: ldc           #190                // int 80418
      1635: ldc           #191                // int 149307
      1637: sipush        -3511
      1640: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1643: aastore
      1644: dup
      1645: bipush        91
      1647: new           #9                  // class ext/mods/gameserver/model/location/Location
      1650: dup
      1651: ldc           #192                // int 80421
      1653: ldc           #193                // int 149186
      1655: sipush        -3511
      1658: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1661: aastore
      1662: dup
      1663: bipush        92
      1665: new           #9                  // class ext/mods/gameserver/model/location/Location
      1668: dup
      1669: ldc           #194                // int 79295
      1671: ldc           #195                // int 149555
      1673: sipush        -3533
      1676: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1679: aastore
      1680: dup
      1681: bipush        93
      1683: new           #9                  // class ext/mods/gameserver/model/location/Location
      1686: dup
      1687: ldc           #196                // int 79797
      1689: ldc           #197                // int 148227
      1691: sipush        -3528
      1694: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1697: aastore
      1698: dup
      1699: bipush        94
      1701: new           #9                  // class ext/mods/gameserver/model/location/Location
      1704: dup
      1705: ldc           #198                // int 80051
      1707: ldc           #199                // int 148181
      1709: sipush        -3533
      1712: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1715: aastore
      1716: dup
      1717: bipush        95
      1719: new           #9                  // class ext/mods/gameserver/model/location/Location
      1722: dup
      1723: ldc           #200                // int 80340
      1725: ldc           #201                // int 148179
      1727: sipush        -3508
      1730: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1733: aastore
      1734: dup
      1735: bipush        96
      1737: new           #9                  // class ext/mods/gameserver/model/location/Location
      1740: dup
      1741: ldc           #202                // int 80442
      1743: ldc           #203                // int 147945
      1745: sipush        -3508
      1748: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1751: aastore
      1752: dup
      1753: bipush        97
      1755: new           #9                  // class ext/mods/gameserver/model/location/Location
      1758: dup
      1759: ldc           #171                // int 80431
      1761: ldc           #204                // int 147877
      1763: sipush        -3508
      1766: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1769: aastore
      1770: dup
      1771: bipush        98
      1773: new           #9                  // class ext/mods/gameserver/model/location/Location
      1776: dup
      1777: ldc           #205                // int 80486
      1779: ldc           #206                // int 147711
      1781: sipush        -3508
      1784: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1787: aastore
      1788: dup
      1789: bipush        99
      1791: new           #9                  // class ext/mods/gameserver/model/location/Location
      1794: dup
      1795: ldc           #207                // int 79916
      1797: ldc           #208                // int 147639
      1799: sipush        -3533
      1802: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1805: aastore
      1806: dup
      1807: bipush        100
      1809: new           #9                  // class ext/mods/gameserver/model/location/Location
      1812: dup
      1813: ldc           #209                // int 79325
      1815: ldc           #210                // int 147081
      1817: sipush        -3533
      1820: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1823: aastore
      1824: dup
      1825: bipush        101
      1827: new           #9                  // class ext/mods/gameserver/model/location/Location
      1830: dup
      1831: ldc           #211                // int 81028
      1833: ldc           #212                // int 147014
      1835: sipush        -3533
      1838: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1841: aastore
      1842: dup
      1843: bipush        102
      1845: new           #9                  // class ext/mods/gameserver/model/location/Location
      1848: dup
      1849: ldc           #213                // int 80781
      1851: ldc           #214                // int 146472
      1853: sipush        -3533
      1856: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1859: aastore
      1860: dup
      1861: bipush        103
      1863: new           #9                  // class ext/mods/gameserver/model/location/Location
      1866: dup
      1867: ldc           #215                // int 81356
      1869: ldc           #216                // int 145540
      1871: sipush        -3533
      1874: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1877: aastore
      1878: dup
      1879: bipush        104
      1881: new           #9                  // class ext/mods/gameserver/model/location/Location
      1884: dup
      1885: ldc           #217                // int 80512
      1887: ldc           #218                // int 145492
      1889: sipush        -3533
      1892: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1895: aastore
      1896: dup
      1897: bipush        105
      1899: new           #9                  // class ext/mods/gameserver/model/location/Location
      1902: dup
      1903: ldc           #219                // int 81029
      1905: ldc           #220                // int 145796
      1907: sipush        -3533
      1910: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1913: aastore
      1914: dup
      1915: bipush        106
      1917: new           #9                  // class ext/mods/gameserver/model/location/Location
      1920: dup
      1921: ldc           #221                // int 80002
      1923: ldc           #222                // int 145839
      1925: sipush        -3496
      1928: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1931: aastore
      1932: dup
      1933: bipush        107
      1935: new           #9                  // class ext/mods/gameserver/model/location/Location
      1938: dup
      1939: ldc           #223                // int 79671
      1941: ldc           #224                // int 145566
      1943: sipush        -3495
      1946: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1949: aastore
      1950: dup
      1951: bipush        108
      1953: new           #9                  // class ext/mods/gameserver/model/location/Location
      1956: dup
      1957: ldc           #225                // int 84759
      1959: ldc           #226                // int 149488
      1961: sipush        -3405
      1964: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
      1967: aastore
      1968: invokestatic  #227                // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
      1971: invokestatic  #233                // Method ext/mods/fakeplayer/holder/WalkerHolder.addCityWaypoints:(Ljava/lang/String;Ljava/util/List;)V
      1974: return
      LineNumberTable:
        line 29: 0
        line 30: 4
        line 141: 1974
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0    1975     0  this   Lext/mods/fakeplayer/move/GiranMove;

  public static ext.mods.fakeplayer.move.GiranMove getInstance();
    descriptor: ()Lext/mods/fakeplayer/move/GiranMove;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #239                // Field ext/mods/fakeplayer/move/GiranMove$SingletonHolder.INSTANCE:Lext/mods/fakeplayer/move/GiranMove;
         3: areturn
      LineNumberTable:
        line 145: 0
}
SourceFile: "GiranMove.java"
NestMembers:
  ext/mods/fakeplayer/move/GiranMove$SingletonHolder
