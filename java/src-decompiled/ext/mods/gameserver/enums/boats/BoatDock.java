// Bytecode for: ext.mods.gameserver.enums.boats.BoatDock
// File: ext\mods\gameserver\enums\boats\BoatDock.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/boats/BoatDock.class
  Last modified 9 de jul de 2026; size 6623 bytes
  MD5 checksum 75fbdba9dd51f7a2a69afcfb7630ebf4
  Compiled from "BoatDock.java"
public final class ext.mods.gameserver.enums.boats.BoatDock extends java.lang.Enum<ext.mods.gameserver.enums.boats.BoatDock>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/boats/BoatDock
  super_class: #32                        // java/lang/Enum
  interfaces: 0, fields: 19, methods: 17, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/boats/BoatDock
    #2 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/boats/BoatDock.TALKING_ISLAND:Lext/mods/gameserver/enums/boats/BoatDock;
    #4 = NameAndType        #5:#6         // TALKING_ISLAND:Lext/mods/gameserver/enums/boats/BoatDock;
    #5 = Utf8               TALKING_ISLAND
    #6 = Utf8               Lext/mods/gameserver/enums/boats/BoatDock;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/boats/BoatDock.GLUDIN:Lext/mods/gameserver/enums/boats/BoatDock;
    #8 = NameAndType        #9:#6         // GLUDIN:Lext/mods/gameserver/enums/boats/BoatDock;
    #9 = Utf8               GLUDIN
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/boats/BoatDock.RUNE:Lext/mods/gameserver/enums/boats/BoatDock;
   #11 = NameAndType        #12:#6        // RUNE:Lext/mods/gameserver/enums/boats/BoatDock;
   #12 = Utf8               RUNE
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/boats/BoatDock.GIRAN:Lext/mods/gameserver/enums/boats/BoatDock;
   #14 = NameAndType        #15:#6        // GIRAN:Lext/mods/gameserver/enums/boats/BoatDock;
   #15 = Utf8               GIRAN
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/boats/BoatDock.PRIMEVAL:Lext/mods/gameserver/enums/boats/BoatDock;
   #17 = NameAndType        #18:#6        // PRIMEVAL:Lext/mods/gameserver/enums/boats/BoatDock;
   #18 = Utf8               PRIMEVAL
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/boats/BoatDock.INNADRIL:Lext/mods/gameserver/enums/boats/BoatDock;
   #20 = NameAndType        #21:#6        // INNADRIL:Lext/mods/gameserver/enums/boats/BoatDock;
   #21 = Utf8               INNADRIL
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/boats/BoatDock.$VALUES:[Lext/mods/gameserver/enums/boats/BoatDock;
   #23 = NameAndType        #24:#25       // $VALUES:[Lext/mods/gameserver/enums/boats/BoatDock;
   #24 = Utf8               $VALUES
   #25 = Utf8               [Lext/mods/gameserver/enums/boats/BoatDock;
   #26 = Methodref          #27.#28       // "[Lext/mods/gameserver/enums/boats/BoatDock;".clone:()Ljava/lang/Object;
   #27 = Class              #25           // "[Lext/mods/gameserver/enums/boats/BoatDock;"
   #28 = NameAndType        #29:#30       // clone:()Ljava/lang/Object;
   #29 = Utf8               clone
   #30 = Utf8               ()Ljava/lang/Object;
   #31 = Methodref          #32.#33       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #32 = Class              #34           // java/lang/Enum
   #33 = NameAndType        #35:#36       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #34 = Utf8               java/lang/Enum
   #35 = Utf8               valueOf
   #36 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #37 = Methodref          #32.#38       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #38 = NameAndType        #39:#40       // "<init>":(Ljava/lang/String;I)V
   #39 = Utf8               <init>
   #40 = Utf8               (Ljava/lang/String;I)V
   #41 = Fieldref           #1.#42        // ext/mods/gameserver/enums/boats/BoatDock._dockLoc:Lext/mods/gameserver/model/location/BoatLocation;
   #42 = NameAndType        #43:#44       // _dockLoc:Lext/mods/gameserver/model/location/BoatLocation;
   #43 = Utf8               _dockLoc
   #44 = Utf8               Lext/mods/gameserver/model/location/BoatLocation;
   #45 = Fieldref           #1.#46        // ext/mods/gameserver/enums/boats/BoatDock._oustLoc:Lext/mods/gameserver/model/location/Location;
   #46 = NameAndType        #47:#48       // _oustLoc:Lext/mods/gameserver/model/location/Location;
   #47 = Utf8               _oustLoc
   #48 = Utf8               Lext/mods/gameserver/model/location/Location;
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/boats/BoatDock._boatEntrance:Lext/mods/commons/geometry/basic/Line2D;
   #50 = NameAndType        #51:#52       // _boatEntrance:Lext/mods/commons/geometry/basic/Line2D;
   #51 = Utf8               _boatEntrance
   #52 = Utf8               Lext/mods/commons/geometry/basic/Line2D;
   #53 = Fieldref           #1.#54        // ext/mods/gameserver/enums/boats/BoatDock._boatExit:Lext/mods/commons/geometry/basic/Line2D;
   #54 = NameAndType        #55:#52       // _boatExit:Lext/mods/commons/geometry/basic/Line2D;
   #55 = Utf8               _boatExit
   #56 = Fieldref           #1.#57        // ext/mods/gameserver/enums/boats/BoatDock._axisLine:Lext/mods/commons/geometry/basic/Line2D;
   #57 = NameAndType        #58:#52       // _axisLine:Lext/mods/commons/geometry/basic/Line2D;
   #58 = Utf8               _axisLine
   #59 = Fieldref           #1.#60        // ext/mods/gameserver/enums/boats/BoatDock._isBusyOnStart:Z
   #60 = NameAndType        #61:#62       // _isBusyOnStart:Z
   #61 = Utf8               _isBusyOnStart
   #62 = Utf8               Z
   #63 = Methodref          #64.#65       // ext/mods/commons/geometry/basic/Line2D.getPoint:()Lext/mods/gameserver/model/location/Point2D;
   #64 = Class              #66           // ext/mods/commons/geometry/basic/Line2D
   #65 = NameAndType        #67:#68       // getPoint:()Lext/mods/gameserver/model/location/Point2D;
   #66 = Utf8               ext/mods/commons/geometry/basic/Line2D
   #67 = Utf8               getPoint
   #68 = Utf8               ()Lext/mods/gameserver/model/location/Point2D;
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/location/Point2D.calculateRelativeAngle:(Lext/mods/gameserver/model/location/Point2D;)D
   #70 = Class              #72           // ext/mods/gameserver/model/location/Point2D
   #71 = NameAndType        #73:#74       // calculateRelativeAngle:(Lext/mods/gameserver/model/location/Point2D;)D
   #72 = Utf8               ext/mods/gameserver/model/location/Point2D
   #73 = Utf8               calculateRelativeAngle
   #74 = Utf8               (Lext/mods/gameserver/model/location/Point2D;)D
   #75 = Fieldref           #1.#76        // ext/mods/gameserver/enums/boats/BoatDock._angle:D
   #76 = NameAndType        #77:#78       // _angle:D
   #77 = Utf8               _angle
   #78 = Utf8               D
   #79 = Methodref          #70.#80       // ext/mods/gameserver/model/location/Point2D.length:()D
   #80 = NameAndType        #81:#82       // length:()D
   #81 = Utf8               length
   #82 = Utf8               ()D
   #83 = Fieldref           #1.#84        // ext/mods/gameserver/enums/boats/BoatDock._factor:D
   #84 = NameAndType        #85:#78       // _factor:D
   #85 = Utf8               _factor
   #86 = Fieldref           #1.#87        // ext/mods/gameserver/enums/boats/BoatDock._isBusy:Z
   #87 = NameAndType        #88:#62       // _isBusy:Z
   #88 = Utf8               _isBusy
   #89 = Double             1.2d
   #91 = Double             0.9d
   #93 = Methodref          #64.#94       // ext/mods/commons/geometry/basic/Line2D.getAdjustedIntersectionPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;D)Lext/mods/gameserver/model/location/Point2D;
   #94 = NameAndType        #95:#96       // getAdjustedIntersectionPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;D)Lext/mods/gameserver/model/location/Point2D;
   #95 = Utf8               getAdjustedIntersectionPoint
   #96 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;D)Lext/mods/gameserver/model/location/Point2D;
   #97 = Methodref          #1.#98        // ext/mods/gameserver/enums/boats/BoatDock.getBoardingPoint:(Lext/mods/commons/geometry/basic/Line2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
   #98 = NameAndType        #99:#100      // getBoardingPoint:(Lext/mods/commons/geometry/basic/Line2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
   #99 = Utf8               getBoardingPoint
  #100 = Utf8               (Lext/mods/commons/geometry/basic/Line2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #101 = Methodref          #1.#102       // ext/mods/gameserver/enums/boats/BoatDock.getBoardingPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #102 = NameAndType        #99:#103      // getBoardingPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #103 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #104 = Methodref          #70.#105      // ext/mods/gameserver/model/location/Point2D.getX:()I
  #105 = NameAndType        #106:#107     // getX:()I
  #106 = Utf8               getX
  #107 = Utf8               ()I
  #108 = Methodref          #109.#110     // java/lang/Math.round:(D)J
  #109 = Class              #111          // java/lang/Math
  #110 = NameAndType        #112:#113     // round:(D)J
  #111 = Utf8               java/lang/Math
  #112 = Utf8               round
  #113 = Utf8               (D)J
  #114 = Methodref          #70.#115      // ext/mods/gameserver/model/location/Point2D.getY:()I
  #115 = NameAndType        #116:#107     // getY:()I
  #116 = Utf8               getY
  #117 = Methodref          #70.#118      // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
  #118 = NameAndType        #39:#119      // "<init>":(II)V
  #119 = Utf8               (II)V
  #120 = Methodref          #64.#121      // ext/mods/commons/geometry/basic/Line2D.getP1x:()I
  #121 = NameAndType        #122:#107     // getP1x:()I
  #122 = Utf8               getP1x
  #123 = Methodref          #64.#124      // ext/mods/commons/geometry/basic/Line2D.getP1y:()I
  #124 = NameAndType        #125:#107     // getP1y:()I
  #125 = Utf8               getP1y
  #126 = Methodref          #70.#127      // ext/mods/gameserver/model/location/Point2D.rotate:(D)V
  #127 = NameAndType        #128:#129     // rotate:(D)V
  #128 = Utf8               rotate
  #129 = Utf8               (D)V
  #130 = Methodref          #70.#131      // ext/mods/gameserver/model/location/Point2D.scale:(D)V
  #131 = NameAndType        #132:#129     // scale:(D)V
  #132 = Utf8               scale
  #133 = Methodref          #70.#134      // ext/mods/gameserver/model/location/Point2D.setX:(I)V
  #134 = NameAndType        #135:#136     // setX:(I)V
  #135 = Utf8               setX
  #136 = Utf8               (I)V
  #137 = Methodref          #70.#138      // ext/mods/gameserver/model/location/Point2D.setY:(I)V
  #138 = NameAndType        #139:#136     // setY:(I)V
  #139 = Utf8               setY
  #140 = String             #5            // TALKING_ISLAND
  #141 = Class              #142          // ext/mods/gameserver/model/location/BoatLocation
  #142 = Utf8               ext/mods/gameserver/model/location/BoatLocation
  #143 = Integer            -96622
  #144 = Integer            261660
  #145 = Methodref          #141.#146     // ext/mods/gameserver/model/location/BoatLocation."<init>":(IIIII)V
  #146 = NameAndType        #39:#147      // "<init>":(IIIII)V
  #147 = Utf8               (IIIII)V
  #148 = Class              #149          // ext/mods/gameserver/model/location/Location
  #149 = Utf8               ext/mods/gameserver/model/location/Location
  #150 = Integer            -96777
  #151 = Integer            258970
  #152 = Methodref          #148.#153     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #153 = NameAndType        #39:#154      // "<init>":(III)V
  #154 = Utf8               (III)V
  #155 = Integer            261420
  #156 = Integer            -96862
  #157 = Methodref          #64.#158      // ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
  #158 = NameAndType        #39:#159      // "<init>":(IIII)V
  #159 = Utf8               (IIII)V
  #160 = Integer            261900
  #161 = Methodref          #1.#162       // ext/mods/gameserver/enums/boats/BoatDock."<init>":(Ljava/lang/String;ILext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/model/location/Location;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Z)V
  #162 = NameAndType        #39:#163      // "<init>":(Ljava/lang/String;ILext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/model/location/Location;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Z)V
  #163 = Utf8               (Ljava/lang/String;ILext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/model/location/Location;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Z)V
  #164 = String             #9            // GLUDIN
  #165 = Integer            -95686
  #166 = Integer            150514
  #167 = Integer            -90015
  #168 = Integer            150422
  #169 = Integer            -95446
  #170 = Integer            150522
  #171 = Integer            -95454
  #172 = Integer            150762
  #173 = Integer            -95926
  #174 = Integer            150506
  #175 = Integer            -95934
  #176 = Integer            150746
  #177 = String             #12           // RUNE
  #178 = Integer            34381
  #179 = Integer            -37680
  #180 = Integer            34513
  #181 = Integer            -38009
  #182 = Integer            34548
  #183 = Integer            -37853
  #184 = Integer            34375
  #185 = Integer            -38019
  #186 = Integer            34214
  #187 = Integer            -37507
  #188 = Integer            34042
  #189 = Integer            -37674
  #190 = String             #15           // GIRAN
  #191 = Integer            48950
  #192 = Integer            190613
  #193 = Integer            46763
  #194 = Integer            187041
  #195 = Integer            48845
  #196 = Integer            190397
  #197 = Integer            49060
  #198 = Integer            190292
  #199 = Integer            49055
  #200 = Integer            190829
  #201 = Integer            49271
  #202 = Integer            190723
  #203 = String             #18           // PRIMEVAL
  #204 = String             #21           // INNADRIL
  #205 = Integer            111384
  #206 = Integer            226232
  #207 = Integer            107092
  #208 = Integer            219098
  #209 = Integer            111137
  #210 = Integer            225989
  #211 = Integer            111387
  #212 = Integer            225991
  #213 = Integer            226472
  #214 = Integer            111144
  #215 = Methodref          #1.#216       // ext/mods/gameserver/enums/boats/BoatDock.$values:()[Lext/mods/gameserver/enums/boats/BoatDock;
  #216 = NameAndType        #217:#218     // $values:()[Lext/mods/gameserver/enums/boats/BoatDock;
  #217 = Utf8               $values
  #218 = Utf8               ()[Lext/mods/gameserver/enums/boats/BoatDock;
  #219 = Methodref          #1.#220       // ext/mods/gameserver/enums/boats/BoatDock.values:()[Lext/mods/gameserver/enums/boats/BoatDock;
  #220 = NameAndType        #221:#218     // values:()[Lext/mods/gameserver/enums/boats/BoatDock;
  #221 = Utf8               values
  #222 = Fieldref           #1.#223       // ext/mods/gameserver/enums/boats/BoatDock.VALUES:[Lext/mods/gameserver/enums/boats/BoatDock;
  #223 = NameAndType        #224:#25      // VALUES:[Lext/mods/gameserver/enums/boats/BoatDock;
  #224 = Utf8               VALUES
  #225 = Utf8               IN_RATIO
  #226 = Utf8               ConstantValue
  #227 = Utf8               OUT_RATIO
  #228 = Utf8               Code
  #229 = Utf8               LineNumberTable
  #230 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/boats/BoatDock;
  #231 = Utf8               LocalVariableTable
  #232 = Utf8               name
  #233 = Utf8               Ljava/lang/String;
  #234 = Utf8               MethodParameters
  #235 = Utf8               this
  #236 = Utf8               dockLoc
  #237 = Utf8               oustLoc
  #238 = Utf8               dockEntrance
  #239 = Utf8               boatExit
  #240 = Utf8               boatEntrance
  #241 = Utf8               busyOnStart
  #242 = Utf8               boatPoint
  #243 = Utf8               Lext/mods/gameserver/model/location/Point2D;
  #244 = Utf8               axisPoint
  #245 = Utf8               Signature
  #246 = Utf8               (Lext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/model/location/Location;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Z)V
  #247 = Utf8               getDockLoc
  #248 = Utf8               ()Lext/mods/gameserver/model/location/BoatLocation;
  #249 = Utf8               getOustLoc
  #250 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #251 = Utf8               getBoatEntrance
  #252 = Utf8               ()Lext/mods/commons/geometry/basic/Line2D;
  #253 = Utf8               getBoatExit
  #254 = Utf8               isBusyOnStart
  #255 = Utf8               ()Z
  #256 = Utf8               isBusy
  #257 = Utf8               StackMapTable
  #258 = Utf8               setBusy
  #259 = Utf8               (Z)V
  #260 = Utf8               status
  #261 = Utf8               line
  #262 = Utf8               origin
  #263 = Utf8               dest
  #264 = Utf8               isInBoat
  #265 = Utf8               getAdjustedBoardingPoint
  #266 = Utf8               ratio
  #267 = Utf8               x
  #268 = Utf8               I
  #269 = Utf8               y
  #270 = Utf8               boardingPoint
  #271 = Utf8               convertBoatToWorldCoordinates
  #272 = Utf8               (II)Lext/mods/gameserver/model/location/Point2D;
  #273 = Utf8               point
  #274 = Utf8               convertWorldToBoatCoordinates
  #275 = Utf8               <clinit>
  #276 = Utf8               ()V
  #277 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/boats/BoatDock;>;
  #278 = Utf8               SourceFile
  #279 = Utf8               BoatDock.java
{
  public static final ext.mods.gameserver.enums.boats.BoatDock TALKING_ISLAND;
    descriptor: Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatDock GLUDIN;
    descriptor: Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatDock RUNE;
    descriptor: Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatDock GIRAN;
    descriptor: Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatDock PRIMEVAL;
    descriptor: Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatDock INNADRIL;
    descriptor: Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatDock[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.boats.BoatDock[] values();
    descriptor: ()[Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/enums/boats/BoatDock;
         3: invokevirtual #26                 // Method "[Lext/mods/gameserver/enums/boats/BoatDock;".clone:()Ljava/lang/Object;
         6: checkcast     #27                 // class "[Lext/mods/gameserver/enums/boats/BoatDock;"
         9: areturn
      LineNumberTable:
        line 26: 0

  public static ext.mods.gameserver.enums.boats.BoatDock valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/boats/BoatDock
         2: aload_0
         3: invokestatic  #31                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/boats/BoatDock
         9: areturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public ext.mods.gameserver.model.location.BoatLocation getDockLoc();
    descriptor: ()Lext/mods/gameserver/model/location/BoatLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _dockLoc:Lext/mods/gameserver/model/location/BoatLocation;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/boats/BoatDock;

  public ext.mods.gameserver.model.location.Location getOustLoc();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field _oustLoc:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/boats/BoatDock;

  public ext.mods.commons.geometry.basic.Line2D getBoatEntrance();
    descriptor: ()Lext/mods/commons/geometry/basic/Line2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _boatEntrance:Lext/mods/commons/geometry/basic/Line2D;
         4: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/boats/BoatDock;

  public ext.mods.commons.geometry.basic.Line2D getBoatExit();
    descriptor: ()Lext/mods/commons/geometry/basic/Line2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _boatExit:Lext/mods/commons/geometry/basic/Line2D;
         4: areturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/boats/BoatDock;

  public boolean isBusyOnStart();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #59                 // Field _isBusyOnStart:Z
         4: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/boats/BoatDock;

  public boolean isBusy();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #59                 // Field _isBusyOnStart:Z
         4: ifeq          18
         7: aload_0
         8: getfield      #86                 // Field _isBusy:Z
        11: ifeq          18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/enums/boats/BoatDock;
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setBusy(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #59                 // Field _isBusyOnStart:Z
         4: ifeq          12
         7: aload_0
         8: iload_1
         9: putfield      #86                 // Field _isBusy:Z
        12: return
      LineNumberTable:
        line 102: 0
        line 103: 7
        line 104: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/enums/boats/BoatDock;
            0      13     1 status   Z
      StackMapTable: number_of_entries = 1
        frame_type = 12 /* same */

  public static ext.mods.gameserver.model.location.Point2D getBoardingPoint(ext.mods.commons.geometry.basic.Line2D, ext.mods.gameserver.model.location.Point2D, ext.mods.gameserver.model.location.Point2D, boolean);
    descriptor: (Lext/mods/commons/geometry/basic/Line2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: iload_3
         4: ifeq          13
         7: ldc2_w        #89                 // double 1.2d
        10: goto          16
        13: ldc2_w        #91                 // double 0.9d
        16: invokevirtual #93                 // Method ext/mods/commons/geometry/basic/Line2D.getAdjustedIntersectionPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;D)Lext/mods/gameserver/model/location/Point2D;
        19: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  line   Lext/mods/commons/geometry/basic/Line2D;
            0      20     1 origin   Lext/mods/gameserver/model/location/Point2D;
            0      20     2  dest   Lext/mods/gameserver/model/location/Point2D;
            0      20     3 isInBoat   Z
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/commons/geometry/basic/Line2D, class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D, int ]
          stack = [ class ext/mods/commons/geometry/basic/Line2D, class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/commons/geometry/basic/Line2D, class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D, int ]
          stack = [ class ext/mods/commons/geometry/basic/Line2D, class ext/mods/gameserver/model/location/Point2D, class ext/mods/gameserver/model/location/Point2D, double ]

  public ext.mods.gameserver.model.location.Point2D getBoardingPoint(ext.mods.gameserver.model.location.Point2D, ext.mods.gameserver.model.location.Point2D, boolean);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #49                 // Field _boatEntrance:Lext/mods/commons/geometry/basic/Line2D;
         4: aload_1
         5: aload_2
         6: iload_3
         7: invokestatic  #97                 // Method getBoardingPoint:(Lext/mods/commons/geometry/basic/Line2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
        10: areturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/enums/boats/BoatDock;
            0      11     1 origin   Lext/mods/gameserver/model/location/Point2D;
            0      11     2  dest   Lext/mods/gameserver/model/location/Point2D;
            0      11     3 isInBoat   Z

  public ext.mods.gameserver.model.location.Point2D getAdjustedBoardingPoint(ext.mods.gameserver.model.location.Point2D, ext.mods.gameserver.model.location.Point2D, boolean);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: iload_3
         4: invokevirtual #101                // Method getBoardingPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
         7: astore        4
         9: aload         4
        11: ifnonnull     91
        14: iload_3
        15: ifeq          24
        18: ldc2_w        #89                 // double 1.2d
        21: goto          27
        24: ldc2_w        #91                 // double 0.9d
        27: dstore        5
        29: aload_1
        30: invokevirtual #104                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        33: i2d
        34: dload         5
        36: aload_2
        37: invokevirtual #104                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        40: aload_1
        41: invokevirtual #104                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        44: isub
        45: i2d
        46: dmul
        47: dadd
        48: invokestatic  #108                // Method java/lang/Math.round:(D)J
        51: l2i
        52: istore        7
        54: aload_1
        55: invokevirtual #114                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        58: i2d
        59: dload         5
        61: aload_2
        62: invokevirtual #114                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        65: aload_1
        66: invokevirtual #114                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        69: isub
        70: i2d
        71: dmul
        72: dadd
        73: invokestatic  #108                // Method java/lang/Math.round:(D)J
        76: l2i
        77: istore        8
        79: new           #70                 // class ext/mods/gameserver/model/location/Point2D
        82: dup
        83: iload         7
        85: iload         8
        87: invokespecial #117                // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
        90: areturn
        91: aload         4
        93: areturn
      LineNumberTable:
        line 118: 0
        line 119: 9
        line 121: 14
        line 122: 29
        line 123: 54
        line 124: 79
        line 126: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      62     5 ratio   D
           54      37     7     x   I
           79      12     8     y   I
            0      94     0  this   Lext/mods/gameserver/enums/boats/BoatDock;
            0      94     1 origin   Lext/mods/gameserver/model/location/Point2D;
            0      94     2  dest   Lext/mods/gameserver/model/location/Point2D;
            0      94     3 isInBoat   Z
            9      85     4 boardingPoint   Lext/mods/gameserver/model/location/Point2D;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/location/Point2D ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 63 /* same */

  public ext.mods.gameserver.model.location.Point2D convertBoatToWorldCoordinates(int, int);
    descriptor: (II)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #70                 // class ext/mods/gameserver/model/location/Point2D
         3: dup
         4: iload_1
         5: aload_0
         6: getfield      #56                 // Field _axisLine:Lext/mods/commons/geometry/basic/Line2D;
         9: invokevirtual #120                // Method ext/mods/commons/geometry/basic/Line2D.getP1x:()I
        12: isub
        13: iload_2
        14: aload_0
        15: getfield      #56                 // Field _axisLine:Lext/mods/commons/geometry/basic/Line2D;
        18: invokevirtual #123                // Method ext/mods/commons/geometry/basic/Line2D.getP1y:()I
        21: isub
        22: invokespecial #117                // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
        25: astore_3
        26: aload_3
        27: aload_0
        28: getfield      #75                 // Field _angle:D
        31: invokevirtual #126                // Method ext/mods/gameserver/model/location/Point2D.rotate:(D)V
        34: aload_3
        35: aload_0
        36: getfield      #83                 // Field _factor:D
        39: invokevirtual #130                // Method ext/mods/gameserver/model/location/Point2D.scale:(D)V
        42: aload_3
        43: aload_0
        44: getfield      #49                 // Field _boatEntrance:Lext/mods/commons/geometry/basic/Line2D;
        47: invokevirtual #120                // Method ext/mods/commons/geometry/basic/Line2D.getP1x:()I
        50: aload_3
        51: invokevirtual #104                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        54: iadd
        55: invokevirtual #133                // Method ext/mods/gameserver/model/location/Point2D.setX:(I)V
        58: aload_3
        59: aload_0
        60: getfield      #49                 // Field _boatEntrance:Lext/mods/commons/geometry/basic/Line2D;
        63: invokevirtual #123                // Method ext/mods/commons/geometry/basic/Line2D.getP1y:()I
        66: aload_3
        67: invokevirtual #114                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        70: iadd
        71: invokevirtual #137                // Method ext/mods/gameserver/model/location/Point2D.setY:(I)V
        74: aload_3
        75: areturn
      LineNumberTable:
        line 131: 0
        line 132: 26
        line 133: 34
        line 135: 42
        line 136: 58
        line 137: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      76     0  this   Lext/mods/gameserver/enums/boats/BoatDock;
            0      76     1     x   I
            0      76     2     y   I
           26      50     3 point   Lext/mods/gameserver/model/location/Point2D;

  public ext.mods.gameserver.model.location.Point2D convertWorldToBoatCoordinates(int, int);
    descriptor: (II)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #70                 // class ext/mods/gameserver/model/location/Point2D
         3: dup
         4: iload_1
         5: aload_0
         6: getfield      #49                 // Field _boatEntrance:Lext/mods/commons/geometry/basic/Line2D;
         9: invokevirtual #120                // Method ext/mods/commons/geometry/basic/Line2D.getP1x:()I
        12: isub
        13: iload_2
        14: aload_0
        15: getfield      #49                 // Field _boatEntrance:Lext/mods/commons/geometry/basic/Line2D;
        18: invokevirtual #123                // Method ext/mods/commons/geometry/basic/Line2D.getP1y:()I
        21: isub
        22: invokespecial #117                // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
        25: astore_3
        26: aload_3
        27: aload_0
        28: getfield      #75                 // Field _angle:D
        31: dneg
        32: invokevirtual #126                // Method ext/mods/gameserver/model/location/Point2D.rotate:(D)V
        35: aload_3
        36: dconst_1
        37: aload_0
        38: getfield      #83                 // Field _factor:D
        41: ddiv
        42: invokevirtual #130                // Method ext/mods/gameserver/model/location/Point2D.scale:(D)V
        45: aload_3
        46: aload_0
        47: getfield      #56                 // Field _axisLine:Lext/mods/commons/geometry/basic/Line2D;
        50: invokevirtual #120                // Method ext/mods/commons/geometry/basic/Line2D.getP1x:()I
        53: aload_3
        54: invokevirtual #104                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        57: iadd
        58: invokevirtual #133                // Method ext/mods/gameserver/model/location/Point2D.setX:(I)V
        61: aload_3
        62: aload_0
        63: getfield      #56                 // Field _axisLine:Lext/mods/commons/geometry/basic/Line2D;
        66: invokevirtual #123                // Method ext/mods/commons/geometry/basic/Line2D.getP1y:()I
        69: aload_3
        70: invokevirtual #114                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        73: iadd
        74: invokevirtual #137                // Method ext/mods/gameserver/model/location/Point2D.setY:(I)V
        77: aload_3
        78: areturn
      LineNumberTable:
        line 142: 0
        line 143: 26
        line 144: 35
        line 146: 45
        line 147: 61
        line 148: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  this   Lext/mods/gameserver/enums/boats/BoatDock;
            0      79     1     x   I
            0      79     2     y   I
           26      53     3 point   Lext/mods/gameserver/model/location/Point2D;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=14, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/boats/BoatDock
         3: dup
         4: ldc           #140                // String TALKING_ISLAND
         6: iconst_0
         7: new           #141                // class ext/mods/gameserver/model/location/BoatLocation
        10: dup
        11: ldc           #143                // int -96622
        13: ldc           #144                // int 261660
        15: sipush        -3610
        18: sipush        150
        21: sipush        1800
        24: invokespecial #145                // Method ext/mods/gameserver/model/location/BoatLocation."<init>":(IIIII)V
        27: new           #148                // class ext/mods/gameserver/model/location/Location
        30: dup
        31: ldc           #150                // int -96777
        33: ldc           #151                // int 258970
        35: sipush        -3623
        38: invokespecial #152                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        41: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
        44: dup
        45: ldc           #143                // int -96622
        47: ldc           #155                // int 261420
        49: ldc           #156                // int -96862
        51: ldc           #155                // int 261420
        53: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
        56: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
        59: dup
        60: ldc           #143                // int -96622
        62: ldc           #160                // int 261900
        64: ldc           #156                // int -96862
        66: ldc           #160                // int 261900
        68: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
        71: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
        74: dup
        75: sipush        230
        78: iconst_0
        79: sipush        230
        82: sipush        -260
        85: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
        88: iconst_1
        89: invokespecial #161                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/model/location/Location;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Z)V
        92: putstatic     #3                  // Field TALKING_ISLAND:Lext/mods/gameserver/enums/boats/BoatDock;
        95: new           #1                  // class ext/mods/gameserver/enums/boats/BoatDock
        98: dup
        99: ldc           #164                // String GLUDIN
       101: iconst_1
       102: new           #141                // class ext/mods/gameserver/model/location/BoatLocation
       105: dup
       106: ldc           #165                // int -95686
       108: ldc           #166                // int 150514
       110: sipush        -3610
       113: sipush        150
       116: sipush        800
       119: invokespecial #145                // Method ext/mods/gameserver/model/location/BoatLocation."<init>":(IIIII)V
       122: new           #148                // class ext/mods/gameserver/model/location/Location
       125: dup
       126: ldc           #167                // int -90015
       128: ldc           #168                // int 150422
       130: sipush        -3610
       133: invokespecial #152                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       136: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       139: dup
       140: ldc           #169                // int -95446
       142: ldc           #170                // int 150522
       144: ldc           #171                // int -95454
       146: ldc           #172                // int 150762
       148: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       151: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       154: dup
       155: ldc           #173                // int -95926
       157: ldc           #174                // int 150506
       159: ldc           #175                // int -95934
       161: ldc           #176                // int 150746
       163: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       166: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       169: dup
       170: sipush        -230
       173: iconst_0
       174: sipush        -230
       177: sipush        -260
       180: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       183: iconst_1
       184: invokespecial #161                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/model/location/Location;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Z)V
       187: putstatic     #7                  // Field GLUDIN:Lext/mods/gameserver/enums/boats/BoatDock;
       190: new           #1                  // class ext/mods/gameserver/enums/boats/BoatDock
       193: dup
       194: ldc           #177                // String RUNE
       196: iconst_2
       197: new           #141                // class ext/mods/gameserver/model/location/BoatLocation
       200: dup
       201: ldc           #178                // int 34381
       203: ldc           #179                // int -37680
       205: sipush        -3610
       208: sipush        220
       211: sipush        800
       214: invokespecial #145                // Method ext/mods/gameserver/model/location/BoatLocation."<init>":(IIIII)V
       217: new           #148                // class ext/mods/gameserver/model/location/Location
       220: dup
       221: ldc           #180                // int 34513
       223: ldc           #181                // int -38009
       225: sipush        -3640
       228: invokespecial #152                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       231: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       234: dup
       235: ldc           #182                // int 34548
       237: ldc           #183                // int -37853
       239: ldc           #184                // int 34375
       241: ldc           #185                // int -38019
       243: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       246: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       249: dup
       250: ldc           #186                // int 34214
       252: ldc           #187                // int -37507
       254: ldc           #188                // int 34042
       256: ldc           #189                // int -37674
       258: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       261: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       264: dup
       265: sipush        230
       268: iconst_0
       269: sipush        230
       272: sipush        -260
       275: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       278: iconst_1
       279: invokespecial #161                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/model/location/Location;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Z)V
       282: putstatic     #10                 // Field RUNE:Lext/mods/gameserver/enums/boats/BoatDock;
       285: new           #1                  // class ext/mods/gameserver/enums/boats/BoatDock
       288: dup
       289: ldc           #190                // String GIRAN
       291: iconst_3
       292: new           #141                // class ext/mods/gameserver/model/location/BoatLocation
       295: dup
       296: ldc           #191                // int 48950
       298: ldc           #192                // int 190613
       300: sipush        -3610
       303: sipush        150
       306: sipush        800
       309: invokespecial #145                // Method ext/mods/gameserver/model/location/BoatLocation."<init>":(IIIII)V
       312: new           #148                // class ext/mods/gameserver/model/location/Location
       315: dup
       316: ldc           #193                // int 46763
       318: ldc           #194                // int 187041
       320: sipush        -3451
       323: invokespecial #152                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       326: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       329: dup
       330: ldc           #195                // int 48845
       332: ldc           #196                // int 190397
       334: ldc           #197                // int 49060
       336: ldc           #198                // int 190292
       338: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       341: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       344: dup
       345: ldc           #199                // int 49055
       347: ldc           #200                // int 190829
       349: ldc           #201                // int 49271
       351: ldc           #202                // int 190723
       353: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       356: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       359: dup
       360: sipush        -230
       363: iconst_0
       364: sipush        -230
       367: sipush        -260
       370: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       373: iconst_0
       374: invokespecial #161                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/model/location/Location;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Z)V
       377: putstatic     #13                 // Field GIRAN:Lext/mods/gameserver/enums/boats/BoatDock;
       380: new           #1                  // class ext/mods/gameserver/enums/boats/BoatDock
       383: dup
       384: ldc           #203                // String PRIMEVAL
       386: iconst_4
       387: new           #141                // class ext/mods/gameserver/model/location/BoatLocation
       390: dup
       391: sipush        10342
       394: sipush        -27279
       397: sipush        -3610
       400: sipush        150
       403: sipush        1800
       406: invokespecial #145                // Method ext/mods/gameserver/model/location/BoatLocation."<init>":(IIIII)V
       409: new           #148                // class ext/mods/gameserver/model/location/Location
       412: dup
       413: sipush        10447
       416: sipush        -24982
       419: sipush        -3664
       422: invokespecial #152                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       425: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       428: dup
       429: sipush        10395
       432: sipush        -27034
       435: sipush        10538
       438: sipush        -27035
       441: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       444: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       447: dup
       448: sipush        10342
       451: sipush        -27519
       454: sipush        10582
       457: sipush        -27519
       460: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       463: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       466: dup
       467: sipush        230
       470: iconst_0
       471: sipush        230
       474: sipush        -260
       477: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       480: iconst_0
       481: invokespecial #161                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/model/location/Location;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Z)V
       484: putstatic     #16                 // Field PRIMEVAL:Lext/mods/gameserver/enums/boats/BoatDock;
       487: new           #1                  // class ext/mods/gameserver/enums/boats/BoatDock
       490: dup
       491: ldc           #204                // String INNADRIL
       493: iconst_5
       494: new           #141                // class ext/mods/gameserver/model/location/BoatLocation
       497: dup
       498: ldc           #205                // int 111384
       500: ldc           #206                // int 226232
       502: sipush        -3610
       505: sipush        150
       508: sipush        800
       511: invokespecial #145                // Method ext/mods/gameserver/model/location/BoatLocation."<init>":(IIIII)V
       514: new           #148                // class ext/mods/gameserver/model/location/Location
       517: dup
       518: ldc           #207                // int 107092
       520: ldc           #208                // int 219098
       522: sipush        -3952
       525: invokespecial #152                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       528: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       531: dup
       532: ldc           #209                // int 111137
       534: ldc           #210                // int 225989
       536: ldc           #211                // int 111387
       538: ldc           #212                // int 225991
       540: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       543: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       546: dup
       547: ldc           #205                // int 111384
       549: ldc           #213                // int 226472
       551: ldc           #214                // int 111144
       553: ldc           #213                // int 226472
       555: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       558: new           #64                 // class ext/mods/commons/geometry/basic/Line2D
       561: dup
       562: sipush        230
       565: sipush        -260
       568: sipush        230
       571: iconst_0
       572: invokespecial #157                // Method ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
       575: iconst_0
       576: invokespecial #161                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/model/location/Location;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Lext/mods/commons/geometry/basic/Line2D;Z)V
       579: putstatic     #19                 // Field INNADRIL:Lext/mods/gameserver/enums/boats/BoatDock;
       582: invokestatic  #215                // Method $values:()[Lext/mods/gameserver/enums/boats/BoatDock;
       585: putstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/enums/boats/BoatDock;
       588: invokestatic  #219                // Method values:()[Lext/mods/gameserver/enums/boats/BoatDock;
       591: putstatic     #222                // Field VALUES:[Lext/mods/gameserver/enums/boats/BoatDock;
       594: return
      LineNumberTable:
        line 28: 0
        line 29: 95
        line 30: 190
        line 31: 285
        line 32: 380
        line 33: 487
        line 26: 582
        line 35: 588
}
Signature: #277                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/boats/BoatDock;>;
SourceFile: "BoatDock.java"
