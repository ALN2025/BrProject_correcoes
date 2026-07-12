// Bytecode for: ext.mods.FarmEventRandom.holder.RandomSpawnHolder
// File: ext\mods\FarmEventRandom\holder\RandomSpawnHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/FarmEventRandom/holder/RandomSpawnHolder.class
  Last modified 9 de jul de 2026; size 4377 bytes
  MD5 checksum 67503482b459bb11f667b083475f62df
  Compiled from "RandomSpawnHolder.java"
public class ext.mods.FarmEventRandom.holder.RandomSpawnHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #1                          // ext/mods/FarmEventRandom/holder/RandomSpawnHolder
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 13, methods: 14, attributes: 3
Constant pool:
    #1 = Class              #2            // ext/mods/FarmEventRandom/holder/RandomSpawnHolder
    #2 = Utf8               ext/mods/FarmEventRandom/holder/RandomSpawnHolder
    #3 = Methodref          #4.#5         // java/lang/Object."<init>":()V
    #4 = Class              #6            // java/lang/Object
    #5 = NameAndType        #7:#8         // "<init>":()V
    #6 = Utf8               java/lang/Object
    #7 = Utf8               <init>
    #8 = Utf8               ()V
    #9 = String             #10           // npcId
   #10 = Utf8               npcId
   #11 = Methodref          #12.#13       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #12 = Class              #14           // ext/mods/commons/data/StatSet
   #13 = NameAndType        #15:#16       // getInteger:(Ljava/lang/String;)I
   #14 = Utf8               ext/mods/commons/data/StatSet
   #15 = Utf8               getInteger
   #16 = Utf8               (Ljava/lang/String;)I
   #17 = Fieldref           #1.#18        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._npcId:I
   #18 = NameAndType        #19:#20       // _npcId:I
   #19 = Utf8               _npcId
   #20 = Utf8               I
   #21 = String             #22           // countAndRange
   #22 = Utf8               countAndRange
   #23 = Methodref          #12.#24       // ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
   #24 = NameAndType        #25:#26       // getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
   #25 = Utf8               getIntIntHolder
   #26 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
   #27 = Fieldref           #1.#28        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._countAndRange:Lext/mods/gameserver/model/holder/IntIntHolder;
   #28 = NameAndType        #29:#30       // _countAndRange:Lext/mods/gameserver/model/holder/IntIntHolder;
   #29 = Utf8               _countAndRange
   #30 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
   #31 = String             #32           // x
   #32 = Utf8               x
   #33 = Methodref          #12.#34       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #34 = NameAndType        #15:#35       // getInteger:(Ljava/lang/String;I)I
   #35 = Utf8               (Ljava/lang/String;I)I
   #36 = Fieldref           #1.#37        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._x:I
   #37 = NameAndType        #38:#20       // _x:I
   #38 = Utf8               _x
   #39 = String             #40           // y
   #40 = Utf8               y
   #41 = Fieldref           #1.#42        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._y:I
   #42 = NameAndType        #43:#20       // _y:I
   #43 = Utf8               _y
   #44 = String             #45           // z
   #45 = Utf8               z
   #46 = Fieldref           #1.#47        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._z:I
   #47 = NameAndType        #48:#20       // _z:I
   #48 = Utf8               _z
   #49 = String             #50           // respawnDelay
   #50 = Utf8               respawnDelay
   #51 = Fieldref           #1.#52        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._respawnDelay:I
   #52 = NameAndType        #53:#20       // _respawnDelay:I
   #53 = Utf8               _respawnDelay
   #54 = String             #55           // title
   #55 = Utf8               title
   #56 = String             #57           //
   #57 = Utf8
   #58 = Methodref          #12.#59       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #59 = NameAndType        #60:#61       // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #60 = Utf8               getString
   #61 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #62 = Fieldref           #1.#63        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._title:Ljava/lang/String;
   #63 = NameAndType        #64:#65       // _title:Ljava/lang/String;
   #64 = Utf8               _title
   #65 = Utf8               Ljava/lang/String;
   #66 = String             #67           // rateXp
   #67 = Utf8               rateXp
   #68 = Double             -1.0d
   #70 = Methodref          #12.#71       // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
   #71 = NameAndType        #72:#73       // getDouble:(Ljava/lang/String;D)D
   #72 = Utf8               getDouble
   #73 = Utf8               (Ljava/lang/String;D)D
   #74 = Fieldref           #1.#75        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._rateXp:D
   #75 = NameAndType        #76:#77       // _rateXp:D
   #76 = Utf8               _rateXp
   #77 = Utf8               D
   #78 = String             #79           // rateSp
   #79 = Utf8               rateSp
   #80 = Fieldref           #1.#81        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._rateSp:D
   #81 = NameAndType        #82:#77       // _rateSp:D
   #82 = Utf8               _rateSp
   #83 = String             #84           // rateAdena
   #84 = Utf8               rateAdena
   #85 = Fieldref           #1.#86        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._rateAdena:D
   #86 = NameAndType        #87:#77       // _rateAdena:D
   #87 = Utf8               _rateAdena
   #88 = Class              #89           // java/util/ArrayList
   #89 = Utf8               java/util/ArrayList
   #90 = Methodref          #88.#5        // java/util/ArrayList."<init>":()V
   #91 = Fieldref           #1.#92        // ext/mods/FarmEventRandom/holder/RandomSpawnHolder._drops:Ljava/util/List;
   #92 = NameAndType        #93:#94       // _drops:Ljava/util/List;
   #93 = Utf8               _drops
   #94 = Utf8               Ljava/util/List;
   #95 = String             #96           // drops
   #96 = Utf8               drops
   #97 = Methodref          #98.#99       // java/lang/String.isEmpty:()Z
   #98 = Class              #100          // java/lang/String
   #99 = NameAndType        #101:#102     // isEmpty:()Z
  #100 = Utf8               java/lang/String
  #101 = Utf8               isEmpty
  #102 = Utf8               ()Z
  #103 = String             #104          // ;
  #104 = Utf8               ;
  #105 = Methodref          #98.#106      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #106 = NameAndType        #107:#108     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #107 = Utf8               split
  #108 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #109 = String             #110          // -
  #110 = Utf8               -
  #111 = Methodref          #112.#113     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #112 = Class              #114          // java/lang/Integer
  #113 = NameAndType        #115:#16      // parseInt:(Ljava/lang/String;)I
  #114 = Utf8               java/lang/Integer
  #115 = Utf8               parseInt
  #116 = Class              #117          // ext/mods/FarmEventRandom/holder/DropHolder
  #117 = Utf8               ext/mods/FarmEventRandom/holder/DropHolder
  #118 = Methodref          #116.#119     // ext/mods/FarmEventRandom/holder/DropHolder."<init>":(III)V
  #119 = NameAndType        #7:#120       // "<init>":(III)V
  #120 = Utf8               (III)V
  #121 = InterfaceMethodref #122.#123     // java/util/List.add:(Ljava/lang/Object;)Z
  #122 = Class              #124          // java/util/List
  #123 = NameAndType        #125:#126     // add:(Ljava/lang/Object;)Z
  #124 = Utf8               java/util/List
  #125 = Utf8               add
  #126 = Utf8               (Ljava/lang/Object;)Z
  #127 = Class              #128          // java/lang/NumberFormatException
  #128 = Utf8               java/lang/NumberFormatException
  #129 = Fieldref           #1.#130       // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.LOGGER:Lext/mods/commons/logging/CLogger;
  #130 = NameAndType        #131:#132     // LOGGER:Lext/mods/commons/logging/CLogger;
  #131 = Utf8               LOGGER
  #132 = Utf8               Lext/mods/commons/logging/CLogger;
  #133 = InvokeDynamic      #0:#134       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #134 = NameAndType        #135:#136     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #135 = Utf8               makeConcatWithConstants
  #136 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #137 = Methodref          #138.#139     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #138 = Class              #140          // ext/mods/commons/logging/CLogger
  #139 = NameAndType        #141:#142     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #140 = Utf8               ext/mods/commons/logging/CLogger
  #141 = Utf8               error
  #142 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #143 = Methodref          #144.#145     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #144 = Class              #146          // ext/mods/gameserver/model/holder/IntIntHolder
  #145 = NameAndType        #147:#148     // getId:()I
  #146 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #147 = Utf8               getId
  #148 = Utf8               ()I
  #149 = Methodref          #144.#150     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #150 = NameAndType        #151:#148     // getValue:()I
  #151 = Utf8               getValue
  #152 = Methodref          #153.#154     // java/lang/Class.getName:()Ljava/lang/String;
  #153 = Class              #155          // java/lang/Class
  #154 = NameAndType        #156:#157     // getName:()Ljava/lang/String;
  #155 = Utf8               java/lang/Class
  #156 = Utf8               getName
  #157 = Utf8               ()Ljava/lang/String;
  #158 = Methodref          #138.#159     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #159 = NameAndType        #7:#160       // "<init>":(Ljava/lang/String;)V
  #160 = Utf8               (Ljava/lang/String;)V
  #161 = Utf8               DEBUG
  #162 = Utf8               Z
  #163 = Utf8               ConstantValue
  #164 = Integer            0
  #165 = Utf8               Signature
  #166 = Utf8               Ljava/util/List<Lext/mods/FarmEventRandom/holder/DropHolder;>;
  #167 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #168 = Utf8               Code
  #169 = Utf8               LineNumberTable
  #170 = Utf8               LocalVariableTable
  #171 = Utf8               itemId
  #172 = Utf8               count
  #173 = Utf8               chance
  #174 = Utf8               e
  #175 = Utf8               Ljava/lang/NumberFormatException;
  #176 = Utf8               vals
  #177 = Utf8               [Ljava/lang/String;
  #178 = Utf8               part
  #179 = Utf8               this
  #180 = Utf8               Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
  #181 = Utf8               set
  #182 = Utf8               Lext/mods/commons/data/StatSet;
  #183 = Utf8               dropsStr
  #184 = Utf8               StackMapTable
  #185 = Class              #177          // "[Ljava/lang/String;"
  #186 = Utf8               getNpcId
  #187 = Utf8               getCount
  #188 = Utf8               getRange
  #189 = Utf8               getX
  #190 = Utf8               getY
  #191 = Utf8               getZ
  #192 = Utf8               getRespawnDelay
  #193 = Utf8               getDrops
  #194 = Utf8               ()Ljava/util/List;
  #195 = Utf8               ()Ljava/util/List<Lext/mods/FarmEventRandom/holder/DropHolder;>;
  #196 = Utf8               getTitle
  #197 = Utf8               getRateXp
  #198 = Utf8               ()D
  #199 = Utf8               getRateSp
  #200 = Utf8               getRateAdena
  #201 = Utf8               <clinit>
  #202 = Utf8               SourceFile
  #203 = Utf8               RandomSpawnHolder.java
  #204 = Utf8               BootstrapMethods
  #205 = String             #206          // [RandomSpawnHolder] Error parsing drop: \u0001
  #206 = Utf8               [RandomSpawnHolder] Error parsing drop: \u0001
  #207 = MethodHandle       6:#208        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #208 = Methodref          #209.#210     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #209 = Class              #211          // java/lang/invoke/StringConcatFactory
  #210 = NameAndType        #135:#212     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #211 = Utf8               java/lang/invoke/StringConcatFactory
  #212 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #213 = Utf8               InnerClasses
  #214 = Class              #215          // java/lang/invoke/MethodHandles$Lookup
  #215 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #216 = Class              #217          // java/lang/invoke/MethodHandles
  #217 = Utf8               java/lang/invoke/MethodHandles
  #218 = Utf8               Lookup
{
  public ext.mods.FarmEventRandom.holder.RandomSpawnHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=11, args_size=2
         0: aload_0
         1: invokespecial #3                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #9                  // String npcId
         8: invokevirtual #11                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        11: putfield      #17                 // Field _npcId:I
        14: aload_0
        15: aload_1
        16: ldc           #21                 // String countAndRange
        18: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
        21: putfield      #27                 // Field _countAndRange:Lext/mods/gameserver/model/holder/IntIntHolder;
        24: aload_0
        25: aload_1
        26: ldc           #31                 // String x
        28: iconst_0
        29: invokevirtual #33                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        32: putfield      #36                 // Field _x:I
        35: aload_0
        36: aload_1
        37: ldc           #39                 // String y
        39: iconst_0
        40: invokevirtual #33                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        43: putfield      #41                 // Field _y:I
        46: aload_0
        47: aload_1
        48: ldc           #44                 // String z
        50: iconst_0
        51: invokevirtual #33                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        54: putfield      #46                 // Field _z:I
        57: aload_0
        58: aload_1
        59: ldc           #49                 // String respawnDelay
        61: iconst_m1
        62: invokevirtual #33                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        65: putfield      #51                 // Field _respawnDelay:I
        68: aload_0
        69: aload_1
        70: ldc           #54                 // String title
        72: ldc           #56                 // String
        74: invokevirtual #58                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        77: putfield      #62                 // Field _title:Ljava/lang/String;
        80: aload_0
        81: aload_1
        82: ldc           #66                 // String rateXp
        84: ldc2_w        #68                 // double -1.0d
        87: invokevirtual #70                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
        90: putfield      #74                 // Field _rateXp:D
        93: aload_0
        94: aload_1
        95: ldc           #78                 // String rateSp
        97: ldc2_w        #68                 // double -1.0d
       100: invokevirtual #70                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       103: putfield      #80                 // Field _rateSp:D
       106: aload_0
       107: aload_1
       108: ldc           #83                 // String rateAdena
       110: ldc2_w        #68                 // double -1.0d
       113: invokevirtual #70                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       116: putfield      #85                 // Field _rateAdena:D
       119: aload_0
       120: new           #88                 // class java/util/ArrayList
       123: dup
       124: invokespecial #90                 // Method java/util/ArrayList."<init>":()V
       127: putfield      #91                 // Field _drops:Ljava/util/List;
       130: aload_1
       131: ldc           #95                 // String drops
       133: ldc           #56                 // String
       135: invokevirtual #58                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       138: astore_2
       139: aload_2
       140: invokevirtual #97                 // Method java/lang/String.isEmpty:()Z
       143: ifne          265
       146: aload_2
       147: ldc           #103                // String ;
       149: invokevirtual #105                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       152: astore_3
       153: aload_3
       154: arraylength
       155: istore        4
       157: iconst_0
       158: istore        5
       160: iload         5
       162: iload         4
       164: if_icmpge     265
       167: aload_3
       168: iload         5
       170: aaload
       171: astore        6
       173: aload         6
       175: ldc           #109                // String -
       177: invokevirtual #105                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       180: astore        7
       182: aload         7
       184: arraylength
       185: iconst_3
       186: if_icmplt     259
       189: aload         7
       191: iconst_0
       192: aaload
       193: invokestatic  #111                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       196: istore        8
       198: aload         7
       200: iconst_1
       201: aaload
       202: invokestatic  #111                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       205: istore        9
       207: aload         7
       209: iconst_2
       210: aaload
       211: invokestatic  #111                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       214: istore        10
       216: aload_0
       217: getfield      #91                 // Field _drops:Ljava/util/List;
       220: new           #116                // class ext/mods/FarmEventRandom/holder/DropHolder
       223: dup
       224: iload         8
       226: iload         9
       228: iload         10
       230: invokespecial #118                // Method ext/mods/FarmEventRandom/holder/DropHolder."<init>":(III)V
       233: invokeinterface #121,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       238: pop
       239: goto          259
       242: astore        8
       244: getstatic     #129                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       247: aload         6
       249: invokedynamic #133,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       254: aload         8
       256: invokevirtual #137                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       259: iinc          5, 1
       262: goto          160
       265: return
      Exception table:
         from    to  target type
           189   239   242   Class java/lang/NumberFormatException
      LineNumberTable:
        line 46: 0
        line 47: 4
        line 48: 14
        line 49: 24
        line 50: 35
        line 51: 46
        line 52: 57
        line 53: 68
        line 55: 80
        line 56: 93
        line 57: 106
        line 59: 119
        line 60: 130
        line 61: 139
        line 63: 146
        line 65: 173
        line 66: 182
        line 69: 189
        line 70: 198
        line 71: 207
        line 72: 216
        line 75: 239
        line 73: 242
        line 74: 244
        line 63: 259
        line 88: 265
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          198      41     8 itemId   I
          207      32     9 count   I
          216      23    10 chance   I
          244      15     8     e   Ljava/lang/NumberFormatException;
          182      77     7  vals   [Ljava/lang/String;
          173      86     6  part   Ljava/lang/String;
            0     266     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
            0     266     1   set   Lext/mods/commons/data/StatSet;
          139     127     2 dropsStr   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 160
          locals = [ class ext/mods/FarmEventRandom/holder/RandomSpawnHolder, class ext/mods/commons/data/StatSet, class java/lang/String, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 81
          locals = [ class ext/mods/FarmEventRandom/holder/RandomSpawnHolder, class ext/mods/commons/data/StatSet, class java/lang/String, class "[Ljava/lang/String;", int, int, class java/lang/String, class "[Ljava/lang/String;" ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 249 /* chop */
          offset_delta = 16
        frame_type = 248 /* chop */
          offset_delta = 5

  public int getNpcId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _npcId:I
         4: ireturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;

  public int getCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _countAndRange:Lext/mods/gameserver/model/holder/IntIntHolder;
         4: ifnull        17
         7: aload_0
         8: getfield      #27                 // Field _countAndRange:Lext/mods/gameserver/model/holder/IntIntHolder;
        11: invokevirtual #143                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _countAndRange:Lext/mods/gameserver/model/holder/IntIntHolder;
         4: ifnull        17
         7: aload_0
         8: getfield      #27                 // Field _countAndRange:Lext/mods/gameserver/model/holder/IntIntHolder;
        11: invokevirtual #149                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field _x:I
         4: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;

  public int getY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _y:I
         4: ireturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;

  public int getZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _z:I
         4: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;

  public int getRespawnDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _respawnDelay:I
         4: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;

  public java.util.List<ext.mods.FarmEventRandom.holder.DropHolder> getDrops();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #91                 // Field _drops:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
    Signature: #195                         // ()Ljava/util/List<Lext/mods/FarmEventRandom/holder/DropHolder;>;

  public java.lang.String getTitle();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #62                 // Field _title:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;

  public double getRateXp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #74                 // Field _rateXp:D
         4: dreturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;

  public double getRateSp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #80                 // Field _rateSp:D
         4: dreturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;

  public double getRateAdena();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #85                 // Field _rateAdena:D
         4: dreturn
      LineNumberTable:
        line 116: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #138                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #1                  // class ext/mods/FarmEventRandom/holder/RandomSpawnHolder
         6: invokevirtual #152                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #158                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #129                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "RandomSpawnHolder.java"
BootstrapMethods:
  0: #207 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #205 [RandomSpawnHolder] Error parsing drop: \u0001
InnerClasses:
  public static final #218= #214 of #216; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
