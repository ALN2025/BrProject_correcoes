// Bytecode for: ext.mods.commons.math.PrimeFinder
// File: ext\mods\commons\math\PrimeFinder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/math/PrimeFinder.class
  Last modified 9 de jul de 2026; size 3299 bytes
  MD5 checksum dfd49ae27b82fb079163ee5cc34ea9f2
  Compiled from "PrimeFinder.java"
public final class ext.mods.commons.math.PrimeFinder
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #17                         // ext/mods/commons/math/PrimeFinder
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
    #1 = Class              #2            // java/lang/Integer
    #2 = Utf8               java/lang/Integer
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
   #16 = Fieldref           #17.#18       // ext/mods/commons/math/PrimeFinder.PRIME_CAPACITIES:[I
   #17 = Class              #19           // ext/mods/commons/math/PrimeFinder
   #18 = NameAndType        #20:#21       // PRIME_CAPACITIES:[I
   #19 = Utf8               ext/mods/commons/math/PrimeFinder
   #20 = Utf8               PRIME_CAPACITIES
   #21 = Utf8               [I
   #22 = Methodref          #23.#24       // java/util/Arrays.binarySearch:([II)I
   #23 = Class              #25           // java/util/Arrays
   #24 = NameAndType        #26:#27       // binarySearch:([II)I
   #25 = Utf8               java/util/Arrays
   #26 = Utf8               binarySearch
   #27 = Utf8               ([II)I
   #28 = Integer            2147483647
   #29 = Integer            51437
   #30 = Integer            102877
   #31 = Integer            205759
   #32 = Integer            411527
   #33 = Integer            823117
   #34 = Integer            1646237
   #35 = Integer            3292489
   #36 = Integer            6584983
   #37 = Integer            13169977
   #38 = Integer            26339969
   #39 = Integer            52679969
   #40 = Integer            105359939
   #41 = Integer            210719881
   #42 = Integer            421439783
   #43 = Integer            842879579
   #44 = Integer            1685759167
   #45 = Integer            56591
   #46 = Integer            113189
   #47 = Integer            226379
   #48 = Integer            452759
   #49 = Integer            905551
   #50 = Integer            1811107
   #51 = Integer            3622219
   #52 = Integer            7244441
   #53 = Integer            14488931
   #54 = Integer            28977863
   #55 = Integer            57955739
   #56 = Integer            115911563
   #57 = Integer            231823147
   #58 = Integer            463646329
   #59 = Integer            927292699
   #60 = Integer            1854585413
   #61 = Integer            61169
   #62 = Integer            122347
   #63 = Integer            244703
   #64 = Integer            489407
   #65 = Integer            978821
   #66 = Integer            1957651
   #67 = Integer            3915341
   #68 = Integer            7830701
   #69 = Integer            15661423
   #70 = Integer            31322867
   #71 = Integer            62645741
   #72 = Integer            125291483
   #73 = Integer            250582987
   #74 = Integer            501165979
   #75 = Integer            1002331963
   #76 = Integer            2004663929
   #77 = Integer            33461
   #78 = Integer            66923
   #79 = Integer            133853
   #80 = Integer            267713
   #81 = Integer            535481
   #82 = Integer            1070981
   #83 = Integer            2141977
   #84 = Integer            4283963
   #85 = Integer            8567929
   #86 = Integer            17135863
   #87 = Integer            34271747
   #88 = Integer            68543509
   #89 = Integer            137087021
   #90 = Integer            274174111
   #91 = Integer            548348231
   #92 = Integer            1096696463
   #93 = Integer            35863
   #94 = Integer            71741
   #95 = Integer            143483
   #96 = Integer            286973
   #97 = Integer            573953
   #98 = Integer            1147921
   #99 = Integer            2295859
  #100 = Integer            4591721
  #101 = Integer            9183457
  #102 = Integer            18366923
  #103 = Integer            36733847
  #104 = Integer            73467739
  #105 = Integer            146935499
  #106 = Integer            293871013
  #107 = Integer            587742049
  #108 = Integer            1175484103
  #109 = Integer            38747
  #110 = Integer            77509
  #111 = Integer            155027
  #112 = Integer            310081
  #113 = Integer            620171
  #114 = Integer            1240361
  #115 = Integer            2480729
  #116 = Integer            4961459
  #117 = Integer            9922933
  #118 = Integer            19845871
  #119 = Integer            39691759
  #120 = Integer            79383533
  #121 = Integer            158767069
  #122 = Integer            317534141
  #123 = Integer            635068283
  #124 = Integer            1270136683
  #125 = Integer            41017
  #126 = Integer            82037
  #127 = Integer            164089
  #128 = Integer            328213
  #129 = Integer            656429
  #130 = Integer            1312867
  #131 = Integer            2625761
  #132 = Integer            5251529
  #133 = Integer            10503061
  #134 = Integer            21006137
  #135 = Integer            42012281
  #136 = Integer            84024581
  #137 = Integer            168049163
  #138 = Integer            336098327
  #139 = Integer            672196673
  #140 = Integer            1344393353
  #141 = Integer            43853
  #142 = Integer            87719
  #143 = Integer            175447
  #144 = Integer            350899
  #145 = Integer            701819
  #146 = Integer            1403641
  #147 = Integer            2807303
  #148 = Integer            5614657
  #149 = Integer            11229331
  #150 = Integer            22458671
  #151 = Integer            44917381
  #152 = Integer            89834777
  #153 = Integer            179669557
  #154 = Integer            359339171
  #155 = Integer            718678369
  #156 = Integer            1437356741
  #157 = Integer            46327
  #158 = Integer            92657
  #159 = Integer            185323
  #160 = Integer            370661
  #161 = Integer            741337
  #162 = Integer            1482707
  #163 = Integer            2965421
  #164 = Integer            5930887
  #165 = Integer            11861791
  #166 = Integer            23723597
  #167 = Integer            47447201
  #168 = Integer            94894427
  #169 = Integer            189788857
  #170 = Integer            379577741
  #171 = Integer            759155483
  #172 = Integer            1518310967
  #173 = Integer            48817
  #174 = Integer            97649
  #175 = Integer            195311
  #176 = Integer            390647
  #177 = Integer            781301
  #178 = Integer            1562611
  #179 = Integer            3125257
  #180 = Integer            6250537
  #181 = Integer            12501169
  #182 = Integer            25002389
  #183 = Integer            50004791
  #184 = Integer            100009607
  #185 = Integer            200019221
  #186 = Integer            400038451
  #187 = Integer            800076929
  #188 = Integer            1600153859
  #189 = Methodref          #23.#190      // java/util/Arrays.sort:([I)V
  #190 = NameAndType        #191:#192     // sort:([I)V
  #191 = Utf8               sort
  #192 = Utf8               ([I)V
  #193 = Utf8               LARGEST_PRIME
  #194 = Utf8               I
  #195 = Utf8               ConstantValue
  #196 = Utf8               Code
  #197 = Utf8               LineNumberTable
  #198 = Utf8               LocalVariableTable
  #199 = Utf8               this
  #200 = Utf8               Lext/mods/commons/math/PrimeFinder;
  #201 = Utf8               nextPrime
  #202 = Utf8               (I)I
  #203 = Utf8               desiredCapacity
  #204 = Utf8               i
  #205 = Utf8               StackMapTable
  #206 = Utf8               <clinit>
  #207 = Utf8               SourceFile
  #208 = Utf8               PrimeFinder.java
{
  public static final int LARGEST_PRIME;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2147483647

  public static final int nextPrime(int);
    descriptor: (I)I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=1
         0: getstatic     #16                 // Field PRIME_CAPACITIES:[I
         3: iload_0
         4: invokestatic  #22                 // Method java/util/Arrays.binarySearch:([II)I
         7: istore_1
         8: iload_1
         9: ifge          17
        12: iload_1
        13: ineg
        14: iconst_1
        15: isub
        16: istore_1
        17: getstatic     #16                 // Field PRIME_CAPACITIES:[I
        20: iload_1
        21: iaload
        22: ireturn
      LineNumberTable:
        line 324: 0
        line 325: 8
        line 327: 12
        line 329: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0 desiredCapacity   I
            8      15     1     i   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ int ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: sipush        245
         3: newarray       int
         5: dup
         6: iconst_0
         7: ldc           #28                 // int 2147483647
         9: iastore
        10: dup
        11: iconst_1
        12: iconst_5
        13: iastore
        14: dup
        15: iconst_2
        16: bipush        11
        18: iastore
        19: dup
        20: iconst_3
        21: bipush        23
        23: iastore
        24: dup
        25: iconst_4
        26: bipush        47
        28: iastore
        29: dup
        30: iconst_5
        31: bipush        97
        33: iastore
        34: dup
        35: bipush        6
        37: sipush        197
        40: iastore
        41: dup
        42: bipush        7
        44: sipush        397
        47: iastore
        48: dup
        49: bipush        8
        51: sipush        797
        54: iastore
        55: dup
        56: bipush        9
        58: sipush        1597
        61: iastore
        62: dup
        63: bipush        10
        65: sipush        3203
        68: iastore
        69: dup
        70: bipush        11
        72: sipush        6421
        75: iastore
        76: dup
        77: bipush        12
        79: sipush        12853
        82: iastore
        83: dup
        84: bipush        13
        86: sipush        25717
        89: iastore
        90: dup
        91: bipush        14
        93: ldc           #29                 // int 51437
        95: iastore
        96: dup
        97: bipush        15
        99: ldc           #30                 // int 102877
       101: iastore
       102: dup
       103: bipush        16
       105: ldc           #31                 // int 205759
       107: iastore
       108: dup
       109: bipush        17
       111: ldc           #32                 // int 411527
       113: iastore
       114: dup
       115: bipush        18
       117: ldc           #33                 // int 823117
       119: iastore
       120: dup
       121: bipush        19
       123: ldc           #34                 // int 1646237
       125: iastore
       126: dup
       127: bipush        20
       129: ldc           #35                 // int 3292489
       131: iastore
       132: dup
       133: bipush        21
       135: ldc           #36                 // int 6584983
       137: iastore
       138: dup
       139: bipush        22
       141: ldc           #37                 // int 13169977
       143: iastore
       144: dup
       145: bipush        23
       147: ldc           #38                 // int 26339969
       149: iastore
       150: dup
       151: bipush        24
       153: ldc           #39                 // int 52679969
       155: iastore
       156: dup
       157: bipush        25
       159: ldc           #40                 // int 105359939
       161: iastore
       162: dup
       163: bipush        26
       165: ldc           #41                 // int 210719881
       167: iastore
       168: dup
       169: bipush        27
       171: ldc           #42                 // int 421439783
       173: iastore
       174: dup
       175: bipush        28
       177: ldc           #43                 // int 842879579
       179: iastore
       180: dup
       181: bipush        29
       183: ldc           #44                 // int 1685759167
       185: iastore
       186: dup
       187: bipush        30
       189: sipush        433
       192: iastore
       193: dup
       194: bipush        31
       196: sipush        877
       199: iastore
       200: dup
       201: bipush        32
       203: sipush        1759
       206: iastore
       207: dup
       208: bipush        33
       210: sipush        3527
       213: iastore
       214: dup
       215: bipush        34
       217: sipush        7057
       220: iastore
       221: dup
       222: bipush        35
       224: sipush        14143
       227: iastore
       228: dup
       229: bipush        36
       231: sipush        28289
       234: iastore
       235: dup
       236: bipush        37
       238: ldc           #45                 // int 56591
       240: iastore
       241: dup
       242: bipush        38
       244: ldc           #46                 // int 113189
       246: iastore
       247: dup
       248: bipush        39
       250: ldc           #47                 // int 226379
       252: iastore
       253: dup
       254: bipush        40
       256: ldc           #48                 // int 452759
       258: iastore
       259: dup
       260: bipush        41
       262: ldc           #49                 // int 905551
       264: iastore
       265: dup
       266: bipush        42
       268: ldc           #50                 // int 1811107
       270: iastore
       271: dup
       272: bipush        43
       274: ldc           #51                 // int 3622219
       276: iastore
       277: dup
       278: bipush        44
       280: ldc           #52                 // int 7244441
       282: iastore
       283: dup
       284: bipush        45
       286: ldc           #53                 // int 14488931
       288: iastore
       289: dup
       290: bipush        46
       292: ldc           #54                 // int 28977863
       294: iastore
       295: dup
       296: bipush        47
       298: ldc           #55                 // int 57955739
       300: iastore
       301: dup
       302: bipush        48
       304: ldc           #56                 // int 115911563
       306: iastore
       307: dup
       308: bipush        49
       310: ldc           #57                 // int 231823147
       312: iastore
       313: dup
       314: bipush        50
       316: ldc           #58                 // int 463646329
       318: iastore
       319: dup
       320: bipush        51
       322: ldc           #59                 // int 927292699
       324: iastore
       325: dup
       326: bipush        52
       328: ldc           #60                 // int 1854585413
       330: iastore
       331: dup
       332: bipush        53
       334: sipush        953
       337: iastore
       338: dup
       339: bipush        54
       341: sipush        1907
       344: iastore
       345: dup
       346: bipush        55
       348: sipush        3821
       351: iastore
       352: dup
       353: bipush        56
       355: sipush        7643
       358: iastore
       359: dup
       360: bipush        57
       362: sipush        15287
       365: iastore
       366: dup
       367: bipush        58
       369: sipush        30577
       372: iastore
       373: dup
       374: bipush        59
       376: ldc           #61                 // int 61169
       378: iastore
       379: dup
       380: bipush        60
       382: ldc           #62                 // int 122347
       384: iastore
       385: dup
       386: bipush        61
       388: ldc           #63                 // int 244703
       390: iastore
       391: dup
       392: bipush        62
       394: ldc           #64                 // int 489407
       396: iastore
       397: dup
       398: bipush        63
       400: ldc           #65                 // int 978821
       402: iastore
       403: dup
       404: bipush        64
       406: ldc           #66                 // int 1957651
       408: iastore
       409: dup
       410: bipush        65
       412: ldc           #67                 // int 3915341
       414: iastore
       415: dup
       416: bipush        66
       418: ldc           #68                 // int 7830701
       420: iastore
       421: dup
       422: bipush        67
       424: ldc           #69                 // int 15661423
       426: iastore
       427: dup
       428: bipush        68
       430: ldc           #70                 // int 31322867
       432: iastore
       433: dup
       434: bipush        69
       436: ldc           #71                 // int 62645741
       438: iastore
       439: dup
       440: bipush        70
       442: ldc           #72                 // int 125291483
       444: iastore
       445: dup
       446: bipush        71
       448: ldc           #73                 // int 250582987
       450: iastore
       451: dup
       452: bipush        72
       454: ldc           #74                 // int 501165979
       456: iastore
       457: dup
       458: bipush        73
       460: ldc           #75                 // int 1002331963
       462: iastore
       463: dup
       464: bipush        74
       466: ldc           #76                 // int 2004663929
       468: iastore
       469: dup
       470: bipush        75
       472: sipush        1039
       475: iastore
       476: dup
       477: bipush        76
       479: sipush        2081
       482: iastore
       483: dup
       484: bipush        77
       486: sipush        4177
       489: iastore
       490: dup
       491: bipush        78
       493: sipush        8363
       496: iastore
       497: dup
       498: bipush        79
       500: sipush        16729
       503: iastore
       504: dup
       505: bipush        80
       507: ldc           #77                 // int 33461
       509: iastore
       510: dup
       511: bipush        81
       513: ldc           #78                 // int 66923
       515: iastore
       516: dup
       517: bipush        82
       519: ldc           #79                 // int 133853
       521: iastore
       522: dup
       523: bipush        83
       525: ldc           #80                 // int 267713
       527: iastore
       528: dup
       529: bipush        84
       531: ldc           #81                 // int 535481
       533: iastore
       534: dup
       535: bipush        85
       537: ldc           #82                 // int 1070981
       539: iastore
       540: dup
       541: bipush        86
       543: ldc           #83                 // int 2141977
       545: iastore
       546: dup
       547: bipush        87
       549: ldc           #84                 // int 4283963
       551: iastore
       552: dup
       553: bipush        88
       555: ldc           #85                 // int 8567929
       557: iastore
       558: dup
       559: bipush        89
       561: ldc           #86                 // int 17135863
       563: iastore
       564: dup
       565: bipush        90
       567: ldc           #87                 // int 34271747
       569: iastore
       570: dup
       571: bipush        91
       573: ldc           #88                 // int 68543509
       575: iastore
       576: dup
       577: bipush        92
       579: ldc           #89                 // int 137087021
       581: iastore
       582: dup
       583: bipush        93
       585: ldc           #90                 // int 274174111
       587: iastore
       588: dup
       589: bipush        94
       591: ldc           #91                 // int 548348231
       593: iastore
       594: dup
       595: bipush        95
       597: ldc           #92                 // int 1096696463
       599: iastore
       600: dup
       601: bipush        96
       603: bipush        31
       605: iastore
       606: dup
       607: bipush        97
       609: bipush        67
       611: iastore
       612: dup
       613: bipush        98
       615: sipush        137
       618: iastore
       619: dup
       620: bipush        99
       622: sipush        277
       625: iastore
       626: dup
       627: bipush        100
       629: sipush        557
       632: iastore
       633: dup
       634: bipush        101
       636: sipush        1117
       639: iastore
       640: dup
       641: bipush        102
       643: sipush        2237
       646: iastore
       647: dup
       648: bipush        103
       650: sipush        4481
       653: iastore
       654: dup
       655: bipush        104
       657: sipush        8963
       660: iastore
       661: dup
       662: bipush        105
       664: sipush        17929
       667: iastore
       668: dup
       669: bipush        106
       671: ldc           #93                 // int 35863
       673: iastore
       674: dup
       675: bipush        107
       677: ldc           #94                 // int 71741
       679: iastore
       680: dup
       681: bipush        108
       683: ldc           #95                 // int 143483
       685: iastore
       686: dup
       687: bipush        109
       689: ldc           #96                 // int 286973
       691: iastore
       692: dup
       693: bipush        110
       695: ldc           #97                 // int 573953
       697: iastore
       698: dup
       699: bipush        111
       701: ldc           #98                 // int 1147921
       703: iastore
       704: dup
       705: bipush        112
       707: ldc           #99                 // int 2295859
       709: iastore
       710: dup
       711: bipush        113
       713: ldc           #100                // int 4591721
       715: iastore
       716: dup
       717: bipush        114
       719: ldc           #101                // int 9183457
       721: iastore
       722: dup
       723: bipush        115
       725: ldc           #102                // int 18366923
       727: iastore
       728: dup
       729: bipush        116
       731: ldc           #103                // int 36733847
       733: iastore
       734: dup
       735: bipush        117
       737: ldc           #104                // int 73467739
       739: iastore
       740: dup
       741: bipush        118
       743: ldc           #105                // int 146935499
       745: iastore
       746: dup
       747: bipush        119
       749: ldc           #106                // int 293871013
       751: iastore
       752: dup
       753: bipush        120
       755: ldc           #107                // int 587742049
       757: iastore
       758: dup
       759: bipush        121
       761: ldc           #108                // int 1175484103
       763: iastore
       764: dup
       765: bipush        122
       767: sipush        599
       770: iastore
       771: dup
       772: bipush        123
       774: sipush        1201
       777: iastore
       778: dup
       779: bipush        124
       781: sipush        2411
       784: iastore
       785: dup
       786: bipush        125
       788: sipush        4831
       791: iastore
       792: dup
       793: bipush        126
       795: sipush        9677
       798: iastore
       799: dup
       800: bipush        127
       802: sipush        19373
       805: iastore
       806: dup
       807: sipush        128
       810: ldc           #109                // int 38747
       812: iastore
       813: dup
       814: sipush        129
       817: ldc           #110                // int 77509
       819: iastore
       820: dup
       821: sipush        130
       824: ldc           #111                // int 155027
       826: iastore
       827: dup
       828: sipush        131
       831: ldc           #112                // int 310081
       833: iastore
       834: dup
       835: sipush        132
       838: ldc           #113                // int 620171
       840: iastore
       841: dup
       842: sipush        133
       845: ldc           #114                // int 1240361
       847: iastore
       848: dup
       849: sipush        134
       852: ldc           #115                // int 2480729
       854: iastore
       855: dup
       856: sipush        135
       859: ldc           #116                // int 4961459
       861: iastore
       862: dup
       863: sipush        136
       866: ldc           #117                // int 9922933
       868: iastore
       869: dup
       870: sipush        137
       873: ldc           #118                // int 19845871
       875: iastore
       876: dup
       877: sipush        138
       880: ldc           #119                // int 39691759
       882: iastore
       883: dup
       884: sipush        139
       887: ldc           #120                // int 79383533
       889: iastore
       890: dup
       891: sipush        140
       894: ldc           #121                // int 158767069
       896: iastore
       897: dup
       898: sipush        141
       901: ldc           #122                // int 317534141
       903: iastore
       904: dup
       905: sipush        142
       908: ldc           #123                // int 635068283
       910: iastore
       911: dup
       912: sipush        143
       915: ldc           #124                // int 1270136683
       917: iastore
       918: dup
       919: sipush        144
       922: sipush        311
       925: iastore
       926: dup
       927: sipush        145
       930: sipush        631
       933: iastore
       934: dup
       935: sipush        146
       938: sipush        1277
       941: iastore
       942: dup
       943: sipush        147
       946: sipush        2557
       949: iastore
       950: dup
       951: sipush        148
       954: sipush        5119
       957: iastore
       958: dup
       959: sipush        149
       962: sipush        10243
       965: iastore
       966: dup
       967: sipush        150
       970: sipush        20507
       973: iastore
       974: dup
       975: sipush        151
       978: ldc           #125                // int 41017
       980: iastore
       981: dup
       982: sipush        152
       985: ldc           #126                // int 82037
       987: iastore
       988: dup
       989: sipush        153
       992: ldc           #127                // int 164089
       994: iastore
       995: dup
       996: sipush        154
       999: ldc           #128                // int 328213
      1001: iastore
      1002: dup
      1003: sipush        155
      1006: ldc           #129                // int 656429
      1008: iastore
      1009: dup
      1010: sipush        156
      1013: ldc           #130                // int 1312867
      1015: iastore
      1016: dup
      1017: sipush        157
      1020: ldc           #131                // int 2625761
      1022: iastore
      1023: dup
      1024: sipush        158
      1027: ldc           #132                // int 5251529
      1029: iastore
      1030: dup
      1031: sipush        159
      1034: ldc           #133                // int 10503061
      1036: iastore
      1037: dup
      1038: sipush        160
      1041: ldc           #134                // int 21006137
      1043: iastore
      1044: dup
      1045: sipush        161
      1048: ldc           #135                // int 42012281
      1050: iastore
      1051: dup
      1052: sipush        162
      1055: ldc           #136                // int 84024581
      1057: iastore
      1058: dup
      1059: sipush        163
      1062: ldc           #137                // int 168049163
      1064: iastore
      1065: dup
      1066: sipush        164
      1069: ldc           #138                // int 336098327
      1071: iastore
      1072: dup
      1073: sipush        165
      1076: ldc           #139                // int 672196673
      1078: iastore
      1079: dup
      1080: sipush        166
      1083: ldc           #140                // int 1344393353
      1085: iastore
      1086: dup
      1087: sipush        167
      1090: iconst_3
      1091: iastore
      1092: dup
      1093: sipush        168
      1096: bipush        7
      1098: iastore
      1099: dup
      1100: sipush        169
      1103: bipush        17
      1105: iastore
      1106: dup
      1107: sipush        170
      1110: bipush        37
      1112: iastore
      1113: dup
      1114: sipush        171
      1117: bipush        79
      1119: iastore
      1120: dup
      1121: sipush        172
      1124: sipush        163
      1127: iastore
      1128: dup
      1129: sipush        173
      1132: sipush        331
      1135: iastore
      1136: dup
      1137: sipush        174
      1140: sipush        673
      1143: iastore
      1144: dup
      1145: sipush        175
      1148: sipush        1361
      1151: iastore
      1152: dup
      1153: sipush        176
      1156: sipush        2729
      1159: iastore
      1160: dup
      1161: sipush        177
      1164: sipush        5471
      1167: iastore
      1168: dup
      1169: sipush        178
      1172: sipush        10949
      1175: iastore
      1176: dup
      1177: sipush        179
      1180: sipush        21911
      1183: iastore
      1184: dup
      1185: sipush        180
      1188: ldc           #141                // int 43853
      1190: iastore
      1191: dup
      1192: sipush        181
      1195: ldc           #142                // int 87719
      1197: iastore
      1198: dup
      1199: sipush        182
      1202: ldc           #143                // int 175447
      1204: iastore
      1205: dup
      1206: sipush        183
      1209: ldc           #144                // int 350899
      1211: iastore
      1212: dup
      1213: sipush        184
      1216: ldc           #145                // int 701819
      1218: iastore
      1219: dup
      1220: sipush        185
      1223: ldc           #146                // int 1403641
      1225: iastore
      1226: dup
      1227: sipush        186
      1230: ldc           #147                // int 2807303
      1232: iastore
      1233: dup
      1234: sipush        187
      1237: ldc           #148                // int 5614657
      1239: iastore
      1240: dup
      1241: sipush        188
      1244: ldc           #149                // int 11229331
      1246: iastore
      1247: dup
      1248: sipush        189
      1251: ldc           #150                // int 22458671
      1253: iastore
      1254: dup
      1255: sipush        190
      1258: ldc           #151                // int 44917381
      1260: iastore
      1261: dup
      1262: sipush        191
      1265: ldc           #152                // int 89834777
      1267: iastore
      1268: dup
      1269: sipush        192
      1272: ldc           #153                // int 179669557
      1274: iastore
      1275: dup
      1276: sipush        193
      1279: ldc           #154                // int 359339171
      1281: iastore
      1282: dup
      1283: sipush        194
      1286: ldc           #155                // int 718678369
      1288: iastore
      1289: dup
      1290: sipush        195
      1293: ldc           #156                // int 1437356741
      1295: iastore
      1296: dup
      1297: sipush        196
      1300: bipush        43
      1302: iastore
      1303: dup
      1304: sipush        197
      1307: bipush        89
      1309: iastore
      1310: dup
      1311: sipush        198
      1314: sipush        179
      1317: iastore
      1318: dup
      1319: sipush        199
      1322: sipush        359
      1325: iastore
      1326: dup
      1327: sipush        200
      1330: sipush        719
      1333: iastore
      1334: dup
      1335: sipush        201
      1338: sipush        1439
      1341: iastore
      1342: dup
      1343: sipush        202
      1346: sipush        2879
      1349: iastore
      1350: dup
      1351: sipush        203
      1354: sipush        5779
      1357: iastore
      1358: dup
      1359: sipush        204
      1362: sipush        11579
      1365: iastore
      1366: dup
      1367: sipush        205
      1370: sipush        23159
      1373: iastore
      1374: dup
      1375: sipush        206
      1378: ldc           #157                // int 46327
      1380: iastore
      1381: dup
      1382: sipush        207
      1385: ldc           #158                // int 92657
      1387: iastore
      1388: dup
      1389: sipush        208
      1392: ldc           #159                // int 185323
      1394: iastore
      1395: dup
      1396: sipush        209
      1399: ldc           #160                // int 370661
      1401: iastore
      1402: dup
      1403: sipush        210
      1406: ldc           #161                // int 741337
      1408: iastore
      1409: dup
      1410: sipush        211
      1413: ldc           #162                // int 1482707
      1415: iastore
      1416: dup
      1417: sipush        212
      1420: ldc           #163                // int 2965421
      1422: iastore
      1423: dup
      1424: sipush        213
      1427: ldc           #164                // int 5930887
      1429: iastore
      1430: dup
      1431: sipush        214
      1434: ldc           #165                // int 11861791
      1436: iastore
      1437: dup
      1438: sipush        215
      1441: ldc           #166                // int 23723597
      1443: iastore
      1444: dup
      1445: sipush        216
      1448: ldc           #167                // int 47447201
      1450: iastore
      1451: dup
      1452: sipush        217
      1455: ldc           #168                // int 94894427
      1457: iastore
      1458: dup
      1459: sipush        218
      1462: ldc           #169                // int 189788857
      1464: iastore
      1465: dup
      1466: sipush        219
      1469: ldc           #170                // int 379577741
      1471: iastore
      1472: dup
      1473: sipush        220
      1476: ldc           #171                // int 759155483
      1478: iastore
      1479: dup
      1480: sipush        221
      1483: ldc           #172                // int 1518310967
      1485: iastore
      1486: dup
      1487: sipush        222
      1490: sipush        379
      1493: iastore
      1494: dup
      1495: sipush        223
      1498: sipush        761
      1501: iastore
      1502: dup
      1503: sipush        224
      1506: sipush        1523
      1509: iastore
      1510: dup
      1511: sipush        225
      1514: sipush        3049
      1517: iastore
      1518: dup
      1519: sipush        226
      1522: sipush        6101
      1525: iastore
      1526: dup
      1527: sipush        227
      1530: sipush        12203
      1533: iastore
      1534: dup
      1535: sipush        228
      1538: sipush        24407
      1541: iastore
      1542: dup
      1543: sipush        229
      1546: ldc           #173                // int 48817
      1548: iastore
      1549: dup
      1550: sipush        230
      1553: ldc           #174                // int 97649
      1555: iastore
      1556: dup
      1557: sipush        231
      1560: ldc           #175                // int 195311
      1562: iastore
      1563: dup
      1564: sipush        232
      1567: ldc           #176                // int 390647
      1569: iastore
      1570: dup
      1571: sipush        233
      1574: ldc           #177                // int 781301
      1576: iastore
      1577: dup
      1578: sipush        234
      1581: ldc           #178                // int 1562611
      1583: iastore
      1584: dup
      1585: sipush        235
      1588: ldc           #179                // int 3125257
      1590: iastore
      1591: dup
      1592: sipush        236
      1595: ldc           #180                // int 6250537
      1597: iastore
      1598: dup
      1599: sipush        237
      1602: ldc           #181                // int 12501169
      1604: iastore
      1605: dup
      1606: sipush        238
      1609: ldc           #182                // int 25002389
      1611: iastore
      1612: dup
      1613: sipush        239
      1616: ldc           #183                // int 50004791
      1618: iastore
      1619: dup
      1620: sipush        240
      1623: ldc           #184                // int 100009607
      1625: iastore
      1626: dup
      1627: sipush        241
      1630: ldc           #185                // int 200019221
      1632: iastore
      1633: dup
      1634: sipush        242
      1637: ldc           #186                // int 400038451
      1639: iastore
      1640: dup
      1641: sipush        243
      1644: ldc           #187                // int 800076929
      1646: iastore
      1647: dup
      1648: sipush        244
      1651: ldc           #188                // int 1600153859
      1653: iastore
      1654: putstatic     #16                 // Field PRIME_CAPACITIES:[I
      1657: getstatic     #16                 // Field PRIME_CAPACITIES:[I
      1660: invokestatic  #189                // Method java/util/Arrays.sort:([I)V
      1663: return
      LineNumberTable:
        line 52: 0
        line 314: 1657
        line 315: 1663
}
SourceFile: "PrimeFinder.java"
