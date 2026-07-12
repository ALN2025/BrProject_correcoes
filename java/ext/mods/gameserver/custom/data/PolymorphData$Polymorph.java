// Bytecode for: ext.mods.gameserver.custom.data.PolymorphData$Polymorph
// File: ext\mods\gameserver\custom\data\PolymorphData$Polymorph.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/PolymorphData$Polymorph.class
  Last modified 9 de jul de 2026; size 6140 bytes
  MD5 checksum 718cf806ac7e3d0e7b6b9e15e6c17aa6
  Compiled from "PolymorphData.java"
public final class ext.mods.gameserver.custom.data.PolymorphData$Polymorph extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/custom/data/PolymorphData$Polymorph
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 27, methods: 32, attributes: 5
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.name:Ljava/lang/String;
    #8 = Class              #10           // ext/mods/gameserver/custom/data/PolymorphData$Polymorph
    #9 = NameAndType        #11:#12       // name:Ljava/lang/String;
   #10 = Utf8               ext/mods/gameserver/custom/data/PolymorphData$Polymorph
   #11 = Utf8               name
   #12 = Utf8               Ljava/lang/String;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.title:Ljava/lang/String;
   #14 = NameAndType        #15:#12       // title:Ljava/lang/String;
   #15 = Utf8               title
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.nameColor:I
   #17 = NameAndType        #18:#19       // nameColor:I
   #18 = Utf8               nameColor
   #19 = Utf8               I
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.titleColor:I
   #21 = NameAndType        #22:#19       // titleColor:I
   #22 = Utf8               titleColor
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.radius:D
   #24 = NameAndType        #25:#26       // radius:D
   #25 = Utf8               radius
   #26 = Utf8               D
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.height:D
   #28 = NameAndType        #29:#26       // height:D
   #29 = Utf8               height
   #30 = Fieldref           #8.#31        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.race:I
   #31 = NameAndType        #32:#19       // race:I
   #32 = Utf8               race
   #33 = Fieldref           #8.#34        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.sex:I
   #34 = NameAndType        #35:#19       // sex:I
   #35 = Utf8               sex
   #36 = Fieldref           #8.#37        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.classId:I
   #37 = NameAndType        #38:#19       // classId:I
   #38 = Utf8               classId
   #39 = Fieldref           #8.#40        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hairStyle:I
   #40 = NameAndType        #41:#19       // hairStyle:I
   #41 = Utf8               hairStyle
   #42 = Fieldref           #8.#43        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hairColor:I
   #43 = NameAndType        #44:#19       // hairColor:I
   #44 = Utf8               hairColor
   #45 = Fieldref           #8.#46        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.face:I
   #46 = NameAndType        #47:#19       // face:I
   #47 = Utf8               face
   #48 = Fieldref           #8.#49        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hero:B
   #49 = NameAndType        #50:#51       // hero:B
   #50 = Utf8               hero
   #51 = Utf8               B
   #52 = Fieldref           #8.#53        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.enchant:I
   #53 = NameAndType        #54:#19       // enchant:I
   #54 = Utf8               enchant
   #55 = Fieldref           #8.#56        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.rightHand:I
   #56 = NameAndType        #57:#19       // rightHand:I
   #57 = Utf8               rightHand
   #58 = Fieldref           #8.#59        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.leftHand:I
   #59 = NameAndType        #60:#19       // leftHand:I
   #60 = Utf8               leftHand
   #61 = Fieldref           #8.#62        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.chest:I
   #62 = NameAndType        #63:#19       // chest:I
   #63 = Utf8               chest
   #64 = Fieldref           #8.#65        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.legs:I
   #65 = NameAndType        #66:#19       // legs:I
   #66 = Utf8               legs
   #67 = Fieldref           #8.#68        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.gloves:I
   #68 = NameAndType        #69:#19       // gloves:I
   #69 = Utf8               gloves
   #70 = Fieldref           #8.#71        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.feet:I
   #71 = NameAndType        #72:#19       // feet:I
   #72 = Utf8               feet
   #73 = Fieldref           #8.#74        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hair:I
   #74 = NameAndType        #75:#19       // hair:I
   #75 = Utf8               hair
   #76 = Fieldref           #8.#77        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hair2:I
   #77 = NameAndType        #78:#19       // hair2:I
   #78 = Utf8               hair2
   #79 = Fieldref           #8.#80        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.clanId:I
   #80 = NameAndType        #81:#19       // clanId:I
   #81 = Utf8               clanId
   #82 = Fieldref           #8.#83        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.clanCrest:I
   #83 = NameAndType        #84:#19       // clanCrest:I
   #84 = Utf8               clanCrest
   #85 = Fieldref           #8.#86        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.allyId:I
   #86 = NameAndType        #87:#19       // allyId:I
   #87 = Utf8               allyId
   #88 = Fieldref           #8.#89        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.allyCrest:I
   #89 = NameAndType        #90:#19       // allyCrest:I
   #90 = Utf8               allyCrest
   #91 = Fieldref           #8.#92        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph.pledge:I
   #92 = NameAndType        #93:#19       // pledge:I
   #93 = Utf8               pledge
   #94 = String             #11           // name
   #95 = Methodref          #96.#97       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #96 = Class              #98           // ext/mods/commons/data/StatSet
   #97 = NameAndType        #99:#100      // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #98 = Utf8               ext/mods/commons/data/StatSet
   #99 = Utf8               getString
  #100 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #101 = String             #15           // title
  #102 = String             #18           // nameColor
  #103 = String             #104          // FFFFFF
  #104 = Utf8               FFFFFF
  #105 = InvokeDynamic      #0:#106       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #106 = NameAndType        #107:#108     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #107 = Utf8               makeConcatWithConstants
  #108 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #109 = Methodref          #110.#111     // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #110 = Class              #112          // java/lang/Integer
  #111 = NameAndType        #113:#114     // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #112 = Utf8               java/lang/Integer
  #113 = Utf8               decode
  #114 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #115 = Methodref          #110.#116     // java/lang/Integer.intValue:()I
  #116 = NameAndType        #117:#118     // intValue:()I
  #117 = Utf8               intValue
  #118 = Utf8               ()I
  #119 = String             #22           // titleColor
  #120 = String             #121          // FFFF77
  #121 = Utf8               FFFF77
  #122 = String             #25           // radius
  #123 = Methodref          #96.#124      // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
  #124 = NameAndType        #125:#126     // getDouble:(Ljava/lang/String;D)D
  #125 = Utf8               getDouble
  #126 = Utf8               (Ljava/lang/String;D)D
  #127 = String             #29           // height
  #128 = String             #32           // race
  #129 = Methodref          #96.#130      // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #130 = NameAndType        #131:#132     // getInteger:(Ljava/lang/String;I)I
  #131 = Utf8               getInteger
  #132 = Utf8               (Ljava/lang/String;I)I
  #133 = String             #35           // sex
  #134 = String             #38           // classId
  #135 = String             #41           // hairStyle
  #136 = String             #44           // hairColor
  #137 = String             #47           // face
  #138 = String             #50           // hero
  #139 = Methodref          #96.#140      // ext/mods/commons/data/StatSet.getByte:(Ljava/lang/String;B)B
  #140 = NameAndType        #141:#142     // getByte:(Ljava/lang/String;B)B
  #141 = Utf8               getByte
  #142 = Utf8               (Ljava/lang/String;B)B
  #143 = String             #54           // enchant
  #144 = String             #57           // rightHand
  #145 = String             #60           // leftHand
  #146 = String             #63           // chest
  #147 = String             #66           // legs
  #148 = String             #69           // gloves
  #149 = String             #72           // feet
  #150 = String             #75           // hair
  #151 = String             #78           // hair2
  #152 = String             #81           // clanId
  #153 = String             #84           // clanCrest
  #154 = String             #87           // allyId
  #155 = String             #90           // allyCrest
  #156 = String             #93           // pledge
  #157 = Methodref          #8.#158       // ext/mods/gameserver/custom/data/PolymorphData$Polymorph."<init>":(Ljava/lang/String;Ljava/lang/String;IIDDIIIIIIBIIIIIIIIIIIIII)V
  #158 = NameAndType        #5:#159       // "<init>":(Ljava/lang/String;Ljava/lang/String;IIDDIIIIIIBIIIIIIIIIIIIII)V
  #159 = Utf8               (Ljava/lang/String;Ljava/lang/String;IIDDIIIIIIBIIIIIIIIIIIIII)V
  #160 = InvokeDynamic      #1:#161       // #1:toString:(Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;)Ljava/lang/String;
  #161 = NameAndType        #162:#163     // toString:(Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;)Ljava/lang/String;
  #162 = Utf8               toString
  #163 = Utf8               (Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;)Ljava/lang/String;
  #164 = InvokeDynamic      #1:#165       // #1:hashCode:(Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;)I
  #165 = NameAndType        #166:#167     // hashCode:(Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;)I
  #166 = Utf8               hashCode
  #167 = Utf8               (Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;)I
  #168 = InvokeDynamic      #1:#169       // #1:equals:(Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;Ljava/lang/Object;)Z
  #169 = NameAndType        #170:#171     // equals:(Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;Ljava/lang/Object;)Z
  #170 = Utf8               equals
  #171 = Utf8               (Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;Ljava/lang/Object;)Z
  #172 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #173 = Utf8               Code
  #174 = Utf8               LineNumberTable
  #175 = Utf8               LocalVariableTable
  #176 = Utf8               this
  #177 = Utf8               Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
  #178 = Utf8               set
  #179 = Utf8               Lext/mods/commons/data/StatSet;
  #180 = Utf8               MethodParameters
  #181 = Utf8               ()Ljava/lang/String;
  #182 = Utf8               (Ljava/lang/Object;)Z
  #183 = Utf8               o
  #184 = Utf8               Ljava/lang/Object;
  #185 = Utf8               ()D
  #186 = Utf8               ()B
  #187 = Utf8               SourceFile
  #188 = Utf8               PolymorphData.java
  #189 = Utf8               NestHost
  #190 = Class              #191          // ext/mods/gameserver/custom/data/PolymorphData
  #191 = Utf8               ext/mods/gameserver/custom/data/PolymorphData
  #192 = Utf8               Record
  #193 = Utf8               BootstrapMethods
  #194 = String             #195          // 0x\u0001
  #195 = Utf8               0x\u0001
  #196 = String             #197          // name;title;nameColor;titleColor;radius;height;race;sex;classId;hairStyle;hairColor;face;hero;enchant;rightHand;leftHand;chest;legs;gloves;feet;hair;hair2;clanId;clanCrest;allyId;allyCrest;pledge
  #197 = Utf8               name;title;nameColor;titleColor;radius;height;race;sex;classId;hairStyle;hairColor;face;hero;enchant;rightHand;leftHand;chest;legs;gloves;feet;hair;hair2;clanId;clanCrest;allyId;allyCrest;pledge
  #198 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.name:Ljava/lang/String;
  #199 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.title:Ljava/lang/String;
  #200 = MethodHandle       1:#16         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.nameColor:I
  #201 = MethodHandle       1:#20         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.titleColor:I
  #202 = MethodHandle       1:#23         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.radius:D
  #203 = MethodHandle       1:#27         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.height:D
  #204 = MethodHandle       1:#30         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.race:I
  #205 = MethodHandle       1:#33         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.sex:I
  #206 = MethodHandle       1:#36         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.classId:I
  #207 = MethodHandle       1:#39         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hairStyle:I
  #208 = MethodHandle       1:#42         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hairColor:I
  #209 = MethodHandle       1:#45         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.face:I
  #210 = MethodHandle       1:#48         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hero:B
  #211 = MethodHandle       1:#52         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.enchant:I
  #212 = MethodHandle       1:#55         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.rightHand:I
  #213 = MethodHandle       1:#58         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.leftHand:I
  #214 = MethodHandle       1:#61         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.chest:I
  #215 = MethodHandle       1:#64         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.legs:I
  #216 = MethodHandle       1:#67         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.gloves:I
  #217 = MethodHandle       1:#70         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.feet:I
  #218 = MethodHandle       1:#73         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hair:I
  #219 = MethodHandle       1:#76         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hair2:I
  #220 = MethodHandle       1:#79         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.clanId:I
  #221 = MethodHandle       1:#82         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.clanCrest:I
  #222 = MethodHandle       1:#85         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.allyId:I
  #223 = MethodHandle       1:#88         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.allyCrest:I
  #224 = MethodHandle       1:#91         // REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.pledge:I
  #225 = MethodHandle       6:#226        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #226 = Methodref          #227.#228     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #227 = Class              #229          // java/lang/invoke/StringConcatFactory
  #228 = NameAndType        #107:#230     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #229 = Utf8               java/lang/invoke/StringConcatFactory
  #230 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #231 = MethodHandle       6:#232        // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #232 = Methodref          #233.#234     // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #233 = Class              #235          // java/lang/runtime/ObjectMethods
  #234 = NameAndType        #236:#237     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #235 = Utf8               java/lang/runtime/ObjectMethods
  #236 = Utf8               bootstrap
  #237 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #238 = Utf8               InnerClasses
  #239 = Utf8               Polymorph
  #240 = Class              #241          // java/lang/invoke/MethodHandles$Lookup
  #241 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #242 = Class              #243          // java/lang/invoke/MethodHandles
  #243 = Utf8               java/lang/invoke/MethodHandles
  #244 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.PolymorphData$Polymorph(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=32, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #94                 // String name
         4: aconst_null
         5: invokevirtual #95                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         8: aload_1
         9: ldc           #101                // String title
        11: aconst_null
        12: invokevirtual #95                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        15: aload_1
        16: ldc           #102                // String nameColor
        18: ldc           #103                // String FFFFFF
        20: invokevirtual #95                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        23: invokedynamic #105,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        28: invokestatic  #109                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        31: invokevirtual #115                // Method java/lang/Integer.intValue:()I
        34: aload_1
        35: ldc           #119                // String titleColor
        37: ldc           #120                // String FFFF77
        39: invokevirtual #95                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        42: invokedynamic #105,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        47: invokestatic  #109                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        50: invokevirtual #115                // Method java/lang/Integer.intValue:()I
        53: aload_1
        54: ldc           #122                // String radius
        56: dconst_0
        57: invokevirtual #123                // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
        60: aload_1
        61: ldc           #127                // String height
        63: dconst_0
        64: invokevirtual #123                // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
        67: aload_1
        68: ldc           #128                // String race
        70: iconst_0
        71: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        74: aload_1
        75: ldc           #133                // String sex
        77: iconst_0
        78: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        81: aload_1
        82: ldc           #134                // String classId
        84: iconst_0
        85: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        88: aload_1
        89: ldc           #135                // String hairStyle
        91: iconst_0
        92: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        95: aload_1
        96: ldc           #136                // String hairColor
        98: iconst_0
        99: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       102: aload_1
       103: ldc           #137                // String face
       105: iconst_0
       106: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       109: aload_1
       110: ldc           #138                // String hero
       112: iconst_m1
       113: invokevirtual #139                // Method ext/mods/commons/data/StatSet.getByte:(Ljava/lang/String;B)B
       116: aload_1
       117: ldc           #143                // String enchant
       119: iconst_0
       120: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       123: aload_1
       124: ldc           #144                // String rightHand
       126: iconst_0
       127: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       130: aload_1
       131: ldc           #145                // String leftHand
       133: iconst_0
       134: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       137: aload_1
       138: ldc           #146                // String chest
       140: iconst_0
       141: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       144: aload_1
       145: ldc           #147                // String legs
       147: iconst_0
       148: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       151: aload_1
       152: ldc           #148                // String gloves
       154: iconst_0
       155: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       158: aload_1
       159: ldc           #149                // String feet
       161: iconst_0
       162: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       165: aload_1
       166: ldc           #150                // String hair
       168: iconst_0
       169: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       172: aload_1
       173: ldc           #151                // String hair2
       175: iconst_0
       176: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       179: aload_1
       180: ldc           #152                // String clanId
       182: iconst_0
       183: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       186: aload_1
       187: ldc           #153                // String clanCrest
       189: iconst_0
       190: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       193: aload_1
       194: ldc           #154                // String allyId
       196: iconst_0
       197: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       200: aload_1
       201: ldc           #155                // String allyCrest
       203: iconst_0
       204: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       207: aload_1
       208: ldc           #156                // String pledge
       210: iconst_0
       211: invokevirtual #129                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       214: invokespecial #157                // Method "<init>":(Ljava/lang/String;Ljava/lang/String;IIDDIIIIIIBIIIIIIIIIIIIII)V
       217: return
      LineNumberTable:
        line 68: 0
        line 69: 217
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     218     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
            0     218     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.custom.data.PolymorphData$Polymorph(java.lang.String, java.lang.String, int, int, double, double, int, int, int, int, int, int, byte, int, int, int, int, int, int, int, int, int, int, int, int, int, int);
    descriptor: (Ljava/lang/String;Ljava/lang/String;IIDDIIIIIIBIIIIIIIIIIIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=30, args_size=28
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field name:Ljava/lang/String;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field title:Ljava/lang/String;
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field nameColor:I
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field titleColor:I
        25: aload_0
        26: dload         5
        28: putfield      #23                 // Field radius:D
        31: aload_0
        32: dload         7
        34: putfield      #27                 // Field height:D
        37: aload_0
        38: iload         9
        40: putfield      #30                 // Field race:I
        43: aload_0
        44: iload         10
        46: putfield      #33                 // Field sex:I
        49: aload_0
        50: iload         11
        52: putfield      #36                 // Field classId:I
        55: aload_0
        56: iload         12
        58: putfield      #39                 // Field hairStyle:I
        61: aload_0
        62: iload         13
        64: putfield      #42                 // Field hairColor:I
        67: aload_0
        68: iload         14
        70: putfield      #45                 // Field face:I
        73: aload_0
        74: iload         15
        76: putfield      #48                 // Field hero:B
        79: aload_0
        80: iload         16
        82: putfield      #52                 // Field enchant:I
        85: aload_0
        86: iload         17
        88: putfield      #55                 // Field rightHand:I
        91: aload_0
        92: iload         18
        94: putfield      #58                 // Field leftHand:I
        97: aload_0
        98: iload         19
       100: putfield      #61                 // Field chest:I
       103: aload_0
       104: iload         20
       106: putfield      #64                 // Field legs:I
       109: aload_0
       110: iload         21
       112: putfield      #67                 // Field gloves:I
       115: aload_0
       116: iload         22
       118: putfield      #70                 // Field feet:I
       121: aload_0
       122: iload         23
       124: putfield      #73                 // Field hair:I
       127: aload_0
       128: iload         24
       130: putfield      #76                 // Field hair2:I
       133: aload_0
       134: iload         25
       136: putfield      #79                 // Field clanId:I
       139: aload_0
       140: iload         26
       142: putfield      #82                 // Field clanCrest:I
       145: aload_0
       146: iload         27
       148: putfield      #85                 // Field allyId:I
       151: aload_0
       152: iload         28
       154: putfield      #88                 // Field allyCrest:I
       157: aload_0
       158: iload         29
       160: putfield      #91                 // Field pledge:I
       163: return
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     164     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
            0     164     1  name   Ljava/lang/String;
            0     164     2 title   Ljava/lang/String;
            0     164     3 nameColor   I
            0     164     4 titleColor   I
            0     164     5 radius   D
            0     164     7 height   D
            0     164     9  race   I
            0     164    10   sex   I
            0     164    11 classId   I
            0     164    12 hairStyle   I
            0     164    13 hairColor   I
            0     164    14  face   I
            0     164    15  hero   B
            0     164    16 enchant   I
            0     164    17 rightHand   I
            0     164    18 leftHand   I
            0     164    19 chest   I
            0     164    20  legs   I
            0     164    21 gloves   I
            0     164    22  feet   I
            0     164    23  hair   I
            0     164    24 hair2   I
            0     164    25 clanId   I
            0     164    26 clanCrest   I
            0     164    27 allyId   I
            0     164    28 allyCrest   I
            0     164    29 pledge   I
    MethodParameters:
      Name                           Flags
      name
      title
      nameColor
      titleColor
      radius
      height
      race
      sex
      classId
      hairStyle
      hairColor
      face
      hero
      enchant
      rightHand
      leftHand
      chest
      legs
      gloves
      feet
      hair
      hair2
      clanId
      clanCrest
      allyId
      allyCrest
      pledge

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #160,  0            // InvokeDynamic #1:toString:(Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #164,  0            // InvokeDynamic #1:hashCode:(Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;)I
         6: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #168,  0            // InvokeDynamic #1:equals:(Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
            0       8     1     o   Ljava/lang/Object;

  public java.lang.String name();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public java.lang.String title();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field title:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int nameColor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field nameColor:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int titleColor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field titleColor:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public double radius();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field radius:D
         4: dreturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public double height();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field height:D
         4: dreturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int race();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field race:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int sex();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field sex:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int classId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field classId:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int hairStyle();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field hairStyle:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int hairColor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field hairColor:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int face();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field face:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public byte hero();
    descriptor: ()B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field hero:B
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int enchant();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field enchant:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int rightHand();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #55                 // Field rightHand:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int leftHand();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #58                 // Field leftHand:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int chest();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #61                 // Field chest:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int legs();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #64                 // Field legs:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int gloves();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #67                 // Field gloves:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int feet();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #70                 // Field feet:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int hair();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field hair:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int hair2();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #76                 // Field hair2:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int clanId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #79                 // Field clanId:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int clanCrest();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #82                 // Field clanCrest:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int allyId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #85                 // Field allyId:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int allyCrest();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #88                 // Field allyCrest:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;

  public int pledge();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #91                 // Field pledge:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
}
SourceFile: "PolymorphData.java"
NestHost: class ext/mods/gameserver/custom/data/PolymorphData
  Record: length = 0xA4 (unknown attribute)
   00 1B 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 13 00 00 00 16 00 13 00 00 00 19 00 1A 00 00
   00 1D 00 1A 00 00 00 20 00 13 00 00 00 23 00 13
   00 00 00 26 00 13 00 00 00 29 00 13 00 00 00 2C
   00 13 00 00 00 2F 00 13 00 00 00 32 00 33 00 00
   00 36 00 13 00 00 00 39 00 13 00 00 00 3C 00 13
   00 00 00 3F 00 13 00 00 00 42 00 13 00 00 00 45
   00 13 00 00 00 48 00 13 00 00 00 4B 00 13 00 00
   00 4E 00 13 00 00 00 51 00 13 00 00 00 54 00 13
   00 00 00 57 00 13 00 00 00 5A 00 13 00 00 00 5D
   00 13 00 00
BootstrapMethods:
  0: #225 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #194 0x\u0001
  1: #231 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/custom/data/PolymorphData$Polymorph
      #196 name;title;nameColor;titleColor;radius;height;race;sex;classId;hairStyle;hairColor;face;hero;enchant;rightHand;leftHand;chest;legs;gloves;feet;hair;hair2;clanId;clanCrest;allyId;allyCrest;pledge
      #198 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.name:Ljava/lang/String;
      #199 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.title:Ljava/lang/String;
      #200 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.nameColor:I
      #201 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.titleColor:I
      #202 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.radius:D
      #203 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.height:D
      #204 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.race:I
      #205 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.sex:I
      #206 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.classId:I
      #207 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hairStyle:I
      #208 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hairColor:I
      #209 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.face:I
      #210 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hero:B
      #211 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.enchant:I
      #212 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.rightHand:I
      #213 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.leftHand:I
      #214 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.chest:I
      #215 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.legs:I
      #216 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.gloves:I
      #217 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.feet:I
      #218 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hair:I
      #219 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.hair2:I
      #220 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.clanId:I
      #221 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.clanCrest:I
      #222 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.allyId:I
      #223 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.allyCrest:I
      #224 REF_getField ext/mods/gameserver/custom/data/PolymorphData$Polymorph.pledge:I
InnerClasses:
  public static final #239= #8 of #190;   // Polymorph=class ext/mods/gameserver/custom/data/PolymorphData$Polymorph of class ext/mods/gameserver/custom/data/PolymorphData
  public static final #244= #240 of #242; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
