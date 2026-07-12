// Bytecode for: ext.mods.gameserver.model.actor.template.DoorTemplate
// File: ext\mods\gameserver\model\actor\template\DoorTemplate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/template/DoorTemplate.class
  Last modified 9 de jul de 2026; size 5201 bytes
  MD5 checksum aeb4501272024a429b0b81590245cb43
  Compiled from "DoorTemplate.java"
public class ext.mods.gameserver.model.actor.template.DoorTemplate extends ext.mods.gameserver.model.actor.template.CreatureTemplate
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/actor/template/DoorTemplate
  super_class: #2                         // ext/mods/gameserver/model/actor/template/CreatureTemplate
  interfaces: 0, fields: 20, methods: 21, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/template/CreatureTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/template/CreatureTemplate
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/commons/data/StatSet;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/template/CreatureTemplate
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
    #7 = String             #8            // name
    #8 = Utf8               name
    #9 = Methodref          #10.#11       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #10 = Class              #12           // ext/mods/commons/data/StatSet
   #11 = NameAndType        #13:#14       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #12 = Utf8               ext/mods/commons/data/StatSet
   #13 = Utf8               getString
   #14 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/model/actor/template/DoorTemplate._name:Ljava/lang/String;
   #16 = Class              #18           // ext/mods/gameserver/model/actor/template/DoorTemplate
   #17 = NameAndType        #19:#20       // _name:Ljava/lang/String;
   #18 = Utf8               ext/mods/gameserver/model/actor/template/DoorTemplate
   #19 = Utf8               _name
   #20 = Utf8               Ljava/lang/String;
   #21 = String             #22           // id
   #22 = Utf8               id
   #23 = Methodref          #10.#24       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #24 = NameAndType        #25:#26       // getInteger:(Ljava/lang/String;)I
   #25 = Utf8               getInteger
   #26 = Utf8               (Ljava/lang/String;)I
   #27 = Fieldref           #16.#28       // ext/mods/gameserver/model/actor/template/DoorTemplate._id:I
   #28 = NameAndType        #29:#30       // _id:I
   #29 = Utf8               _id
   #30 = Utf8               I
   #31 = String             #32           // type
   #32 = Utf8               type
   #33 = Class              #34           // ext/mods/gameserver/enums/DoorType
   #34 = Utf8               ext/mods/gameserver/enums/DoorType
   #35 = Methodref          #10.#36       // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
   #36 = NameAndType        #37:#38       // getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
   #37 = Utf8               getEnum
   #38 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
   #39 = Fieldref           #16.#40       // ext/mods/gameserver/model/actor/template/DoorTemplate._type:Lext/mods/gameserver/enums/DoorType;
   #40 = NameAndType        #41:#42       // _type:Lext/mods/gameserver/enums/DoorType;
   #41 = Utf8               _type
   #42 = Utf8               Lext/mods/gameserver/enums/DoorType;
   #43 = String             #44           // level
   #44 = Utf8               level
   #45 = Fieldref           #16.#46       // ext/mods/gameserver/model/actor/template/DoorTemplate._level:I
   #46 = NameAndType        #47:#30       // _level:I
   #47 = Utf8               _level
   #48 = String             #49           // posX
   #49 = Utf8               posX
   #50 = Fieldref           #16.#51       // ext/mods/gameserver/model/actor/template/DoorTemplate._x:I
   #51 = NameAndType        #52:#30       // _x:I
   #52 = Utf8               _x
   #53 = String             #54           // posY
   #54 = Utf8               posY
   #55 = Fieldref           #16.#56       // ext/mods/gameserver/model/actor/template/DoorTemplate._y:I
   #56 = NameAndType        #57:#30       // _y:I
   #57 = Utf8               _y
   #58 = String             #59           // posZ
   #59 = Utf8               posZ
   #60 = Fieldref           #16.#61       // ext/mods/gameserver/model/actor/template/DoorTemplate._z:I
   #61 = NameAndType        #62:#30       // _z:I
   #62 = Utf8               _z
   #63 = String             #64           // geoX
   #64 = Utf8               geoX
   #65 = Fieldref           #16.#66       // ext/mods/gameserver/model/actor/template/DoorTemplate._geoX:I
   #66 = NameAndType        #67:#30       // _geoX:I
   #67 = Utf8               _geoX
   #68 = String             #69           // geoY
   #69 = Utf8               geoY
   #70 = Fieldref           #16.#71       // ext/mods/gameserver/model/actor/template/DoorTemplate._geoY:I
   #71 = NameAndType        #72:#30       // _geoY:I
   #72 = Utf8               _geoY
   #73 = String             #74           // geoZ
   #74 = Utf8               geoZ
   #75 = Fieldref           #16.#76       // ext/mods/gameserver/model/actor/template/DoorTemplate._geoZ:I
   #76 = NameAndType        #77:#30       // _geoZ:I
   #77 = Utf8               _geoZ
   #78 = String             #79           // geoData
   #79 = Utf8               geoData
   #80 = Class              #81           // "[[B"
   #81 = Utf8               [[B
   #82 = Methodref          #10.#83       // ext/mods/commons/data/StatSet.getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
   #83 = NameAndType        #84:#85       // getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
   #84 = Utf8               getObject
   #85 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
   #86 = Fieldref           #16.#87       // ext/mods/gameserver/model/actor/template/DoorTemplate._geoData:[[B
   #87 = NameAndType        #88:#81       // _geoData:[[B
   #88 = Utf8               _geoData
   #89 = String             #90           // coords
   #90 = Utf8               coords
   #91 = Class              #92           // "[Lext/mods/gameserver/model/location/Point2D;"
   #92 = Utf8               [Lext/mods/gameserver/model/location/Point2D;
   #93 = Fieldref           #16.#94       // ext/mods/gameserver/model/actor/template/DoorTemplate._coords:[Lext/mods/gameserver/model/location/Point2D;
   #94 = NameAndType        #95:#92       // _coords:[Lext/mods/gameserver/model/location/Point2D;
   #95 = Utf8               _coords
   #96 = String             #97           // castle
   #97 = Utf8               castle
   #98 = Methodref          #10.#99       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #99 = NameAndType        #25:#100      // getInteger:(Ljava/lang/String;I)I
  #100 = Utf8               (Ljava/lang/String;I)I
  #101 = Fieldref           #16.#102      // ext/mods/gameserver/model/actor/template/DoorTemplate._castleId:I
  #102 = NameAndType        #103:#30      // _castleId:I
  #103 = Utf8               _castleId
  #104 = String             #105          // clanHall
  #105 = Utf8               clanHall
  #106 = Fieldref           #16.#107      // ext/mods/gameserver/model/actor/template/DoorTemplate._clanHallId:I
  #107 = NameAndType        #108:#30      // _clanHallId:I
  #108 = Utf8               _clanHallId
  #109 = String             #110          // triggeredId
  #110 = Utf8               triggeredId
  #111 = Fieldref           #16.#112      // ext/mods/gameserver/model/actor/template/DoorTemplate._triggeredId:I
  #112 = NameAndType        #113:#30      // _triggeredId:I
  #113 = Utf8               _triggeredId
  #114 = String             #115          // opened
  #115 = Utf8               opened
  #116 = Methodref          #10.#117      // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #117 = NameAndType        #118:#119     // getBool:(Ljava/lang/String;Z)Z
  #118 = Utf8               getBool
  #119 = Utf8               (Ljava/lang/String;Z)Z
  #120 = Fieldref           #16.#121      // ext/mods/gameserver/model/actor/template/DoorTemplate._opened:Z
  #121 = NameAndType        #122:#123     // _opened:Z
  #122 = Utf8               _opened
  #123 = Utf8               Z
  #124 = String             #125          // openType
  #125 = Utf8               openType
  #126 = Class              #127          // ext/mods/gameserver/enums/OpenType
  #127 = Utf8               ext/mods/gameserver/enums/OpenType
  #128 = Fieldref           #126.#129     // ext/mods/gameserver/enums/OpenType.NPC:Lext/mods/gameserver/enums/OpenType;
  #129 = NameAndType        #130:#131     // NPC:Lext/mods/gameserver/enums/OpenType;
  #130 = Utf8               NPC
  #131 = Utf8               Lext/mods/gameserver/enums/OpenType;
  #132 = Methodref          #10.#133      // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #133 = NameAndType        #37:#134      // getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #134 = Utf8               (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #135 = Fieldref           #16.#136      // ext/mods/gameserver/model/actor/template/DoorTemplate._openType:Lext/mods/gameserver/enums/OpenType;
  #136 = NameAndType        #137:#131     // _openType:Lext/mods/gameserver/enums/OpenType;
  #137 = Utf8               _openType
  #138 = String             #139          // openTime
  #139 = Utf8               openTime
  #140 = Fieldref           #16.#141      // ext/mods/gameserver/model/actor/template/DoorTemplate._openTime:I
  #141 = NameAndType        #142:#30      // _openTime:I
  #142 = Utf8               _openTime
  #143 = String             #144          // randomTime
  #144 = Utf8               randomTime
  #145 = Fieldref           #16.#146      // ext/mods/gameserver/model/actor/template/DoorTemplate._randomTime:I
  #146 = NameAndType        #147:#30      // _randomTime:I
  #147 = Utf8               _randomTime
  #148 = String             #149          // closeTime
  #149 = Utf8               closeTime
  #150 = Fieldref           #16.#151      // ext/mods/gameserver/model/actor/template/DoorTemplate._closeTime:I
  #151 = NameAndType        #152:#30      // _closeTime:I
  #152 = Utf8               _closeTime
  #153 = InvokeDynamic      #0:#154       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #154 = NameAndType        #155:#14      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #155 = Utf8               makeConcatWithConstants
  #156 = Fieldref           #157.#158     // java/awt/Color.GREEN:Ljava/awt/Color;
  #157 = Class              #159          // java/awt/Color
  #158 = NameAndType        #160:#161     // GREEN:Ljava/awt/Color;
  #159 = Utf8               java/awt/Color
  #160 = Utf8               GREEN
  #161 = Utf8               Ljava/awt/Color;
  #162 = Methodref          #163.#164     // ext/mods/gameserver/model/location/Point2D.getX:()I
  #163 = Class              #165          // ext/mods/gameserver/model/location/Point2D
  #164 = NameAndType        #166:#167     // getX:()I
  #165 = Utf8               ext/mods/gameserver/model/location/Point2D
  #166 = Utf8               getX
  #167 = Utf8               ()I
  #168 = Methodref          #163.#169     // ext/mods/gameserver/model/location/Point2D.getY:()I
  #169 = NameAndType        #170:#167     // getY:()I
  #170 = Utf8               getY
  #171 = Methodref          #172.#173     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #172 = Class              #174          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #173 = NameAndType        #175:#176     // addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #174 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #175 = Utf8               addLine
  #176 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #177 = Fieldref           #157.#178     // java/awt/Color.YELLOW:Ljava/awt/Color;
  #178 = NameAndType        #179:#161     // YELLOW:Ljava/awt/Color;
  #179 = Utf8               YELLOW
  #180 = InvokeDynamic      #1:#154       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #181 = Fieldref           #157.#182     // java/awt/Color.RED:Ljava/awt/Color;
  #182 = NameAndType        #183:#161     // RED:Ljava/awt/Color;
  #183 = Utf8               RED
  #184 = Utf8               Code
  #185 = Utf8               LineNumberTable
  #186 = Utf8               LocalVariableTable
  #187 = Utf8               this
  #188 = Utf8               Lext/mods/gameserver/model/actor/template/DoorTemplate;
  #189 = Utf8               set
  #190 = Utf8               Lext/mods/commons/data/StatSet;
  #191 = Utf8               getName
  #192 = Utf8               ()Ljava/lang/String;
  #193 = Utf8               getId
  #194 = Utf8               getType
  #195 = Utf8               ()Lext/mods/gameserver/enums/DoorType;
  #196 = Utf8               getLevel
  #197 = Utf8               getPosX
  #198 = Utf8               getPosY
  #199 = Utf8               getPosZ
  #200 = Utf8               getGeoX
  #201 = Utf8               getGeoY
  #202 = Utf8               getGeoZ
  #203 = Utf8               getGeoData
  #204 = Utf8               ()[[B
  #205 = Utf8               getCastleId
  #206 = Utf8               getClanHallId
  #207 = Utf8               getTriggerId
  #208 = Utf8               isOpened
  #209 = Utf8               ()Z
  #210 = Utf8               getOpenType
  #211 = Utf8               ()Lext/mods/gameserver/enums/OpenType;
  #212 = Utf8               getOpenTime
  #213 = Utf8               getRandomTime
  #214 = Utf8               getCloseTime
  #215 = Utf8               visualizeDoor
  #216 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #217 = Utf8               nextIndex
  #218 = Utf8               curPoint
  #219 = Utf8               Lext/mods/gameserver/model/location/Point2D;
  #220 = Utf8               nextPoint
  #221 = Utf8               i
  #222 = Utf8               debug
  #223 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #224 = Utf8               z1
  #225 = Utf8               z2
  #226 = Utf8               StackMapTable
  #227 = Utf8               SourceFile
  #228 = Utf8               DoorTemplate.java
  #229 = Utf8               BootstrapMethods
  #230 = String             #231          // \u0001 MinZ
  #231 = Utf8               \u0001 MinZ
  #232 = String             #233          // \u0001 MaxZ
  #233 = Utf8               \u0001 MaxZ
  #234 = MethodHandle       6:#235        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #235 = Methodref          #236.#237     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #236 = Class              #238          // java/lang/invoke/StringConcatFactory
  #237 = NameAndType        #155:#239     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #238 = Utf8               java/lang/invoke/StringConcatFactory
  #239 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #240 = Utf8               InnerClasses
  #241 = Class              #242          // java/lang/invoke/MethodHandles$Lookup
  #242 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #243 = Class              #244          // java/lang/invoke/MethodHandles
  #244 = Utf8               java/lang/invoke/MethodHandles
  #245 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.template.DoorTemplate(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/template/CreatureTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #7                  // String name
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        12: putfield      #15                 // Field _name:Ljava/lang/String;
        15: aload_0
        16: aload_1
        17: ldc           #21                 // String id
        19: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        22: putfield      #27                 // Field _id:I
        25: aload_0
        26: aload_1
        27: ldc           #31                 // String type
        29: ldc           #33                 // class ext/mods/gameserver/enums/DoorType
        31: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
        34: checkcast     #33                 // class ext/mods/gameserver/enums/DoorType
        37: putfield      #39                 // Field _type:Lext/mods/gameserver/enums/DoorType;
        40: aload_0
        41: aload_1
        42: ldc           #43                 // String level
        44: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        47: putfield      #45                 // Field _level:I
        50: aload_0
        51: aload_1
        52: ldc           #48                 // String posX
        54: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        57: putfield      #50                 // Field _x:I
        60: aload_0
        61: aload_1
        62: ldc           #53                 // String posY
        64: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        67: putfield      #55                 // Field _y:I
        70: aload_0
        71: aload_1
        72: ldc           #58                 // String posZ
        74: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        77: putfield      #60                 // Field _z:I
        80: aload_0
        81: aload_1
        82: ldc           #63                 // String geoX
        84: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        87: putfield      #65                 // Field _geoX:I
        90: aload_0
        91: aload_1
        92: ldc           #68                 // String geoY
        94: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        97: putfield      #70                 // Field _geoY:I
       100: aload_0
       101: aload_1
       102: ldc           #73                 // String geoZ
       104: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       107: putfield      #75                 // Field _geoZ:I
       110: aload_0
       111: aload_1
       112: ldc           #78                 // String geoData
       114: ldc           #80                 // class "[[B"
       116: invokevirtual #82                 // Method ext/mods/commons/data/StatSet.getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
       119: checkcast     #80                 // class "[[B"
       122: putfield      #86                 // Field _geoData:[[B
       125: aload_0
       126: aload_1
       127: ldc           #89                 // String coords
       129: ldc           #91                 // class "[Lext/mods/gameserver/model/location/Point2D;"
       131: invokevirtual #82                 // Method ext/mods/commons/data/StatSet.getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
       134: checkcast     #91                 // class "[Lext/mods/gameserver/model/location/Point2D;"
       137: putfield      #93                 // Field _coords:[Lext/mods/gameserver/model/location/Point2D;
       140: aload_0
       141: aload_1
       142: ldc           #96                 // String castle
       144: iconst_0
       145: invokevirtual #98                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       148: putfield      #101                // Field _castleId:I
       151: aload_0
       152: aload_1
       153: ldc           #104                // String clanHall
       155: iconst_0
       156: invokevirtual #98                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       159: putfield      #106                // Field _clanHallId:I
       162: aload_0
       163: aload_1
       164: ldc           #109                // String triggeredId
       166: iconst_0
       167: invokevirtual #98                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       170: putfield      #111                // Field _triggeredId:I
       173: aload_0
       174: aload_1
       175: ldc           #114                // String opened
       177: iconst_0
       178: invokevirtual #116                // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       181: putfield      #120                // Field _opened:Z
       184: aload_0
       185: aload_1
       186: ldc           #124                // String openType
       188: ldc           #126                // class ext/mods/gameserver/enums/OpenType
       190: getstatic     #128                // Field ext/mods/gameserver/enums/OpenType.NPC:Lext/mods/gameserver/enums/OpenType;
       193: invokevirtual #132                // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
       196: checkcast     #126                // class ext/mods/gameserver/enums/OpenType
       199: putfield      #135                // Field _openType:Lext/mods/gameserver/enums/OpenType;
       202: aload_0
       203: aload_1
       204: ldc           #138                // String openTime
       206: iconst_0
       207: invokevirtual #98                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       210: putfield      #140                // Field _openTime:I
       213: aload_0
       214: aload_1
       215: ldc           #143                // String randomTime
       217: iconst_0
       218: invokevirtual #98                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       221: putfield      #145                // Field _randomTime:I
       224: aload_0
       225: aload_1
       226: ldc           #148                // String closeTime
       228: iconst_0
       229: invokevirtual #98                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       232: putfield      #150                // Field _closeTime:I
       235: return
      LineNumberTable:
        line 58: 0
        line 60: 5
        line 61: 15
        line 62: 25
        line 63: 40
        line 65: 50
        line 66: 60
        line 67: 70
        line 69: 80
        line 70: 90
        line 71: 100
        line 72: 110
        line 73: 125
        line 75: 140
        line 76: 151
        line 77: 162
        line 78: 173
        line 80: 184
        line 81: 202
        line 82: 213
        line 83: 224
        line 84: 235
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     236     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;
            0     236     1   set   Lext/mods/commons/data/StatSet;

  public final java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final ext.mods.gameserver.enums.DoorType getType();
    descriptor: ()Lext/mods/gameserver/enums/DoorType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _type:Lext/mods/gameserver/enums/DoorType;
         4: areturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getPosX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _x:I
         4: ireturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getPosY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #55                 // Field _y:I
         4: ireturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getPosZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #60                 // Field _z:I
         4: ireturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getGeoX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #65                 // Field _geoX:I
         4: ireturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getGeoY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #70                 // Field _geoY:I
         4: ireturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getGeoZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #75                 // Field _geoZ:I
         4: ireturn
      LineNumberTable:
        line 133: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final byte[][] getGeoData();
    descriptor: ()[[B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #86                 // Field _geoData:[[B
         4: areturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getCastleId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #101                // Field _castleId:I
         4: ireturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getClanHallId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #106                // Field _clanHallId:I
         4: ireturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getTriggerId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #111                // Field _triggeredId:I
         4: ireturn
      LineNumberTable:
        line 153: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final boolean isOpened();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #120                // Field _opened:Z
         4: ireturn
      LineNumberTable:
        line 158: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final ext.mods.gameserver.enums.OpenType getOpenType();
    descriptor: ()Lext/mods/gameserver/enums/OpenType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #135                // Field _openType:Lext/mods/gameserver/enums/OpenType;
         4: areturn
      LineNumberTable:
        line 163: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getOpenTime();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #140                // Field _openTime:I
         4: ireturn
      LineNumberTable:
        line 168: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getRandomTime();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #145                // Field _randomTime:I
         4: ireturn
      LineNumberTable:
        line 173: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public final int getCloseTime();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #150                // Field _closeTime:I
         4: ireturn
      LineNumberTable:
        line 178: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;

  public void visualizeDoor(ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=8, args_size=2
         0: aload_0
         1: getfield      #60                 // Field _z:I
         4: bipush        32
         6: isub
         7: istore_2
         8: aload_0
         9: getfield      #60                 // Field _z:I
        12: bipush        32
        14: iadd
        15: istore_3
        16: iconst_0
        17: istore        4
        19: iload         4
        21: aload_0
        22: getfield      #93                 // Field _coords:[Lext/mods/gameserver/model/location/Point2D;
        25: arraylength
        26: if_icmpge     190
        29: iload         4
        31: iconst_1
        32: iadd
        33: istore        5
        35: iload         5
        37: aload_0
        38: getfield      #93                 // Field _coords:[Lext/mods/gameserver/model/location/Point2D;
        41: arraylength
        42: if_icmpne     48
        45: iconst_0
        46: istore        5
        48: aload_0
        49: getfield      #93                 // Field _coords:[Lext/mods/gameserver/model/location/Point2D;
        52: iload         4
        54: aaload
        55: astore        6
        57: aload_0
        58: getfield      #93                 // Field _coords:[Lext/mods/gameserver/model/location/Point2D;
        61: iload         5
        63: aaload
        64: astore        7
        66: aload_1
        67: aload_0
        68: getfield      #15                 // Field _name:Ljava/lang/String;
        71: invokedynamic #153,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        76: getstatic     #156                // Field java/awt/Color.GREEN:Ljava/awt/Color;
        79: iconst_1
        80: aload         6
        82: invokevirtual #162                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        85: aload         6
        87: invokevirtual #168                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        90: iload_2
        91: aload         7
        93: invokevirtual #162                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        96: aload         7
        98: invokevirtual #168                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       101: iload_2
       102: invokevirtual #171                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       105: aload_1
       106: aload_0
       107: getfield      #15                 // Field _name:Ljava/lang/String;
       110: getstatic     #177                // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       113: iconst_1
       114: aload         6
       116: invokevirtual #162                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       119: aload         6
       121: invokevirtual #168                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       124: aload_0
       125: getfield      #60                 // Field _z:I
       128: aload         7
       130: invokevirtual #162                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       133: aload         7
       135: invokevirtual #168                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       138: aload_0
       139: getfield      #60                 // Field _z:I
       142: invokevirtual #171                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       145: aload_1
       146: aload_0
       147: getfield      #15                 // Field _name:Ljava/lang/String;
       150: invokedynamic #180,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       155: getstatic     #181                // Field java/awt/Color.RED:Ljava/awt/Color;
       158: iconst_1
       159: aload         6
       161: invokevirtual #162                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       164: aload         6
       166: invokevirtual #168                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       169: iload_3
       170: aload         7
       172: invokevirtual #162                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       175: aload         7
       177: invokevirtual #168                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       180: iload_3
       181: invokevirtual #171                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       184: iinc          4, 1
       187: goto          19
       190: return
      LineNumberTable:
        line 183: 0
        line 184: 8
        line 186: 16
        line 188: 29
        line 190: 35
        line 191: 45
        line 193: 48
        line 194: 57
        line 196: 66
        line 197: 105
        line 198: 145
        line 186: 184
        line 200: 190
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35     149     5 nextIndex   I
           57     127     6 curPoint   Lext/mods/gameserver/model/location/Point2D;
           66     118     7 nextPoint   Lext/mods/gameserver/model/location/Point2D;
           19     171     4     i   I
            0     191     0  this   Lext/mods/gameserver/model/actor/template/DoorTemplate;
            0     191     1 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
            8     183     2    z1   I
           16     175     3    z2   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 19
          locals = [ int, int, int ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 141
}
SourceFile: "DoorTemplate.java"
BootstrapMethods:
  0: #234 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #230 \u0001 MinZ
  1: #234 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #232 \u0001 MaxZ
InnerClasses:
  public static final #245= #241 of #243; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
