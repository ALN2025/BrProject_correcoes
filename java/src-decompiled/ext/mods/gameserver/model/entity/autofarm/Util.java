// Bytecode for: ext.mods.gameserver.model.entity.autofarm.Util
// File: ext\mods\gameserver\model\entity\autofarm\Util.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/Util.class
  Last modified 9 de jul de 2026; size 6653 bytes
  MD5 checksum 51e0ec3f836f95df31b4b99cd380381c
  Compiled from "Util.java"
public class ext.mods.gameserver.model.entity.autofarm.Util
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #185                        // ext/mods/gameserver/model/entity/autofarm/Util
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 8, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/lang/StringBuilder
    #8 = Utf8               java/lang/StringBuilder
    #9 = Methodref          #7.#3         // java/lang/StringBuilder."<init>":()V
   #10 = Methodref          #11.#12       // java/util/StringTokenizer.hasMoreTokens:()Z
   #11 = Class              #13           // java/util/StringTokenizer
   #12 = NameAndType        #14:#15       // hasMoreTokens:()Z
   #13 = Utf8               java/util/StringTokenizer
   #14 = Utf8               hasMoreTokens
   #15 = Utf8               ()Z
   #16 = Methodref          #11.#17       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #17 = NameAndType        #18:#19       // nextToken:()Ljava/lang/String;
   #18 = Utf8               nextToken
   #19 = Utf8               ()Ljava/lang/String;
   #20 = InvokeDynamic      #0:#21        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #21 = NameAndType        #22:#23       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #22 = Utf8               makeConcatWithConstants
   #23 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #24 = Methodref          #7.#25        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #25 = NameAndType        #26:#27       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #26 = Utf8               append
   #27 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #28 = Methodref          #7.#29        // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #29 = NameAndType        #30:#19       // toString:()Ljava/lang/String;
   #30 = Utf8               toString
   #31 = Methodref          #32.#33       // java/lang/String.trim:()Ljava/lang/String;
   #32 = Class              #34           // java/lang/String
   #33 = NameAndType        #35:#19       // trim:()Ljava/lang/String;
   #34 = Utf8               java/lang/String
   #35 = Utf8               trim
   #36 = Methodref          #37.#38       // ext/mods/gameserver/skills/L2Skill.isActive:()Z
   #37 = Class              #39           // ext/mods/gameserver/skills/L2Skill
   #38 = NameAndType        #40:#15       // isActive:()Z
   #39 = Utf8               ext/mods/gameserver/skills/L2Skill
   #40 = Utf8               isActive
   #41 = Methodref          #37.#42       // ext/mods/gameserver/skills/L2Skill.isSiegeSummonSkill:()Z
   #42 = NameAndType        #43:#15       // isSiegeSummonSkill:()Z
   #43 = Utf8               isSiegeSummonSkill
   #44 = Methodref          #37.#45       // ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #45 = NameAndType        #46:#47       // getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #46 = Utf8               getTargetType
   #47 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #48 = Methodref          #49.#50       // ext/mods/gameserver/enums/skills/SkillTargetType.name:()Ljava/lang/String;
   #49 = Class              #51           // ext/mods/gameserver/enums/skills/SkillTargetType
   #50 = NameAndType        #52:#19       // name:()Ljava/lang/String;
   #51 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #52 = Utf8               name
   #53 = String             #54           // CORPSE
   #54 = Utf8               CORPSE
   #55 = Methodref          #32.#56       // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
   #56 = NameAndType        #57:#58       // contains:(Ljava/lang/CharSequence;)Z
   #57 = Utf8               contains
   #58 = Utf8               (Ljava/lang/CharSequence;)Z
   #59 = Methodref          #37.#60       // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #60 = NameAndType        #61:#62       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #61 = Utf8               getSkillType
   #62 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #63 = Fieldref           #64.#65       // ext/mods/gameserver/enums/skills/SkillType.SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
   #64 = Class              #66           // ext/mods/gameserver/enums/skills/SkillType
   #65 = NameAndType        #67:#68       // SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
   #66 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #67 = Utf8               SLEEP
   #68 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #69 = Fieldref           #49.#70       // ext/mods/gameserver/enums/skills/SkillTargetType.ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #70 = NameAndType        #71:#72       // ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #71 = Utf8               ONE
   #72 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #73 = Fieldref           #74.#75       // ext/mods/gameserver/model/entity/autofarm/Util$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #74 = Class              #76           // ext/mods/gameserver/model/entity/autofarm/Util$1
   #75 = NameAndType        #77:#78       // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #76 = Utf8               ext/mods/gameserver/model/entity/autofarm/Util$1
   #77 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
   #78 = Utf8               [I
   #79 = Methodref          #64.#80       // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
   #80 = NameAndType        #81:#82       // ordinal:()I
   #81 = Utf8               ordinal
   #82 = Utf8               ()I
   #83 = Fieldref           #74.#84       // ext/mods/gameserver/model/entity/autofarm/Util$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
   #84 = NameAndType        #85:#78       // $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
   #85 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType
   #86 = Methodref          #49.#80       // ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
   #87 = Methodref          #37.#88       // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
   #88 = NameAndType        #89:#19       // getName:()Ljava/lang/String;
   #89 = Utf8               getName
   #90 = Methodref          #32.#91       // java/lang/String.hashCode:()I
   #91 = NameAndType        #92:#82       // hashCode:()I
   #92 = Utf8               hashCode
   #93 = String             #94           // Aura Symphony
   #94 = Utf8               Aura Symphony
   #95 = Methodref          #32.#96       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #96 = NameAndType        #97:#98       // equals:(Ljava/lang/Object;)Z
   #97 = Utf8               equals
   #98 = Utf8               (Ljava/lang/Object;)Z
   #99 = String             #100          // Inferno
  #100 = Utf8               Inferno
  #101 = String             #102          // Blizzard
  #102 = Utf8               Blizzard
  #103 = String             #104          // Demon Wind
  #104 = Utf8               Demon Wind
  #105 = String             #106          // Elemental Assault
  #106 = Utf8               Elemental Assault
  #107 = String             #108          // Elemental Symphony
  #108 = Utf8               Elemental Symphony
  #109 = String             #110          // Elemental Storm
  #110 = Utf8               Elemental Storm
  #111 = String             #112          // Harmony of Noblesse
  #112 = Utf8               Harmony of Noblesse
  #113 = String             #114          // Symphony of Noblesse
  #114 = Utf8               Symphony of Noblesse
  #115 = String             #116          // Clan Gate
  #116 = Utf8               Clan Gate
  #117 = String             #118          // Wyvern Aegis
  #118 = Utf8               Wyvern Aegis
  #119 = InvokeDynamic      #1:#120       // #1:compare:(Ljava/util/Set;)Ljava/util/Comparator;
  #120 = NameAndType        #121:#122     // compare:(Ljava/util/Set;)Ljava/util/Comparator;
  #121 = Utf8               compare
  #122 = Utf8               (Ljava/util/Set;)Ljava/util/Comparator;
  #123 = InvokeDynamic      #2:#124       // #2:compare:(Ljava/util/Collection;)Ljava/util/Comparator;
  #124 = NameAndType        #121:#125     // compare:(Ljava/util/Collection;)Ljava/util/Comparator;
  #125 = Utf8               (Ljava/util/Collection;)Ljava/util/Comparator;
  #126 = InterfaceMethodref #127.#128     // java/util/Collection.size:()I
  #127 = Class              #129          // java/util/Collection
  #128 = NameAndType        #130:#82      // size:()I
  #129 = Utf8               java/util/Collection
  #130 = Utf8               size
  #131 = InterfaceMethodref #132.#128     // java/util/List.size:()I
  #132 = Class              #133          // java/util/List
  #133 = Utf8               java/util/List
  #134 = InterfaceMethodref #127.#135     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #135 = NameAndType        #136:#137     // iterator:()Ljava/util/Iterator;
  #136 = Utf8               iterator
  #137 = Utf8               ()Ljava/util/Iterator;
  #138 = InterfaceMethodref #139.#140     // java/util/Iterator.hasNext:()Z
  #139 = Class              #141          // java/util/Iterator
  #140 = NameAndType        #142:#15      // hasNext:()Z
  #141 = Utf8               java/util/Iterator
  #142 = Utf8               hasNext
  #143 = InterfaceMethodref #139.#144     // java/util/Iterator.next:()Ljava/lang/Object;
  #144 = NameAndType        #145:#146     // next:()Ljava/lang/Object;
  #145 = Utf8               next
  #146 = Utf8               ()Ljava/lang/Object;
  #147 = Class              #148          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
  #148 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
  #149 = InterfaceMethodref #132.#150     // java/util/List.get:(I)Ljava/lang/Object;
  #150 = NameAndType        #151:#152     // get:(I)Ljava/lang/Object;
  #151 = Utf8               get
  #152 = Utf8               (I)Ljava/lang/Object;
  #153 = Class              #154          // ext/mods/gameserver/model/location/Location
  #154 = Utf8               ext/mods/gameserver/model/location/Location
  #155 = Methodref          #147.#156     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getX:()I
  #156 = NameAndType        #157:#82      // getX:()I
  #157 = Utf8               getX
  #158 = Methodref          #153.#156     // ext/mods/gameserver/model/location/Location.getX:()I
  #159 = Methodref          #147.#160     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getY:()I
  #160 = NameAndType        #161:#82      // getY:()I
  #161 = Utf8               getY
  #162 = Methodref          #153.#160     // ext/mods/gameserver/model/location/Location.getY:()I
  #163 = Methodref          #147.#164     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getZ:()I
  #164 = NameAndType        #165:#82      // getZ:()I
  #165 = Utf8               getZ
  #166 = Methodref          #153.#164     // ext/mods/gameserver/model/location/Location.getZ:()I
  #167 = Methodref          #37.#168      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #168 = NameAndType        #169:#82      // getId:()I
  #169 = Utf8               getId
  #170 = Methodref          #171.#172     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #171 = Class              #173          // java/lang/Integer
  #172 = NameAndType        #174:#175     // valueOf:(I)Ljava/lang/Integer;
  #173 = Utf8               java/lang/Integer
  #174 = Utf8               valueOf
  #175 = Utf8               (I)Ljava/lang/Integer;
  #176 = InterfaceMethodref #127.#177     // java/util/Collection.contains:(Ljava/lang/Object;)Z
  #177 = NameAndType        #57:#98       // contains:(Ljava/lang/Object;)Z
  #178 = Methodref          #32.#179      // java/lang/String.compareTo:(Ljava/lang/String;)I
  #179 = NameAndType        #180:#181     // compareTo:(Ljava/lang/String;)I
  #180 = Utf8               compareTo
  #181 = Utf8               (Ljava/lang/String;)I
  #182 = InterfaceMethodref #183.#177     // java/util/Set.contains:(Ljava/lang/Object;)Z
  #183 = Class              #184          // java/util/Set
  #184 = Utf8               java/util/Set
  #185 = Class              #186          // ext/mods/gameserver/model/entity/autofarm/Util
  #186 = Utf8               ext/mods/gameserver/model/entity/autofarm/Util
  #187 = Utf8               Code
  #188 = Utf8               LineNumberTable
  #189 = Utf8               LocalVariableTable
  #190 = Utf8               this
  #191 = Utf8               Lext/mods/gameserver/model/entity/autofarm/Util;
  #192 = Utf8               getRemainingTokens
  #193 = Utf8               (Ljava/util/StringTokenizer;)Ljava/lang/String;
  #194 = Utf8               st
  #195 = Utf8               Ljava/util/StringTokenizer;
  #196 = Utf8               remainingTokens
  #197 = Utf8               Ljava/lang/StringBuilder;
  #198 = Utf8               StackMapTable
  #199 = Utf8               isSkillCompatible
  #200 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #201 = Utf8               skill
  #202 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #203 = Utf8               getMonsterComparator
  #204 = Utf8               targets
  #205 = Utf8               Ljava/util/Set;
  #206 = Utf8               LocalVariableTypeTable
  #207 = Utf8               Ljava/util/Set<Ljava/lang/String;>;
  #208 = Utf8               Signature
  #209 = Utf8               (Ljava/util/Set<Ljava/lang/String;>;)Ljava/util/Comparator<Ljava/lang/String;>;
  #210 = Utf8               getSkillComparator
  #211 = Utf8               skills
  #212 = Utf8               Ljava/util/Collection;
  #213 = Utf8               Ljava/util/Collection<Ljava/lang/Integer;>;
  #214 = Utf8               (Ljava/util/Collection<Ljava/lang/Integer;>;)Ljava/util/Comparator<Lext/mods/gameserver/skills/L2Skill;>;
  #215 = Utf8               isNodeListEquals
  #216 = Utf8               (Ljava/util/Collection;Ljava/util/List;)Z
  #217 = Utf8               loc
  #218 = Utf8               Lext/mods/gameserver/model/location/Location;
  #219 = Utf8               point
  #220 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;
  #221 = Utf8               list1
  #222 = Utf8               list2
  #223 = Utf8               Ljava/util/List;
  #224 = Utf8               indice
  #225 = Utf8               I
  #226 = Utf8               Ljava/util/Collection<Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;
  #227 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #228 = Utf8               (Ljava/util/Collection<Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)Z
  #229 = Utf8               lambda$getSkillComparator$0
  #230 = Utf8               (Ljava/util/Collection;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #231 = Utf8               s1
  #232 = Utf8               s2
  #233 = Utf8               m1Selected
  #234 = Utf8               Z
  #235 = Utf8               m2Selected
  #236 = Utf8               lambda$getMonsterComparator$0
  #237 = Utf8               (Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)I
  #238 = Utf8               m1
  #239 = Utf8               Ljava/lang/String;
  #240 = Utf8               m2
  #241 = Utf8               SourceFile
  #242 = Utf8               Util.java
  #243 = Utf8               NestMembers
  #244 = Utf8               BootstrapMethods
  #245 = String             #246          // \u0001
  #246 = Utf8               \u0001
  #247 = MethodType         #248          //  (Ljava/lang/Object;Ljava/lang/Object;)I
  #248 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #249 = MethodHandle       6:#250        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/Util.lambda$getMonsterComparator$0:(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)I
  #250 = Methodref          #185.#251     // ext/mods/gameserver/model/entity/autofarm/Util.lambda$getMonsterComparator$0:(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)I
  #251 = NameAndType        #236:#237     // lambda$getMonsterComparator$0:(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)I
  #252 = MethodType         #253          //  (Ljava/lang/String;Ljava/lang/String;)I
  #253 = Utf8               (Ljava/lang/String;Ljava/lang/String;)I
  #254 = MethodHandle       6:#255        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/Util.lambda$getSkillComparator$0:(Ljava/util/Collection;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #255 = Methodref          #185.#256     // ext/mods/gameserver/model/entity/autofarm/Util.lambda$getSkillComparator$0:(Ljava/util/Collection;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #256 = NameAndType        #229:#230     // lambda$getSkillComparator$0:(Ljava/util/Collection;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #257 = MethodType         #258          //  (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #258 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #259 = MethodHandle       6:#260        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #260 = Methodref          #261.#262     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #261 = Class              #263          // java/lang/invoke/StringConcatFactory
  #262 = NameAndType        #22:#264      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #263 = Utf8               java/lang/invoke/StringConcatFactory
  #264 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #265 = MethodHandle       6:#266        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #266 = Methodref          #267.#268     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #267 = Class              #269          // java/lang/invoke/LambdaMetafactory
  #268 = NameAndType        #270:#271     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #269 = Utf8               java/lang/invoke/LambdaMetafactory
  #270 = Utf8               metafactory
  #271 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #272 = Utf8               InnerClasses
  #273 = Class              #274          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #274 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #275 = Utf8               Point
  #276 = Class              #277          // java/lang/invoke/MethodHandles$Lookup
  #277 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #278 = Class              #279          // java/lang/invoke/MethodHandles
  #279 = Utf8               java/lang/invoke/MethodHandles
  #280 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.autofarm.Util();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/Util;

  public static java.lang.String getRemainingTokens(java.util.StringTokenizer);
    descriptor: (Ljava/util/StringTokenizer;)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: new           #7                  // class java/lang/StringBuilder
         3: dup
         4: invokespecial #9                  // Method java/lang/StringBuilder."<init>":()V
         7: astore_1
         8: aload_0
         9: invokevirtual #10                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        12: ifeq          32
        15: aload_1
        16: aload_0
        17: invokevirtual #16                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        20: invokedynamic #20,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        25: invokevirtual #24                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        28: pop
        29: goto          8
        32: aload_1
        33: invokevirtual #28                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        36: invokevirtual #31                 // Method java/lang/String.trim:()Ljava/lang/String;
        39: areturn
      LineNumberTable:
        line 36: 0
        line 37: 8
        line 38: 15
        line 40: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0    st   Ljava/util/StringTokenizer;
            8      32     1 remainingTokens   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/lang/StringBuilder ]
        frame_type = 23 /* same */

  public static boolean isSkillCompatible(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #36                 // Method ext/mods/gameserver/skills/L2Skill.isActive:()Z
         4: ifeq          14
         7: aload_0
         8: invokevirtual #41                 // Method ext/mods/gameserver/skills/L2Skill.isSiegeSummonSkill:()Z
        11: ifeq          16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: invokevirtual #44                 // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
        20: invokevirtual #48                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.name:()Ljava/lang/String;
        23: ldc           #53                 // String CORPSE
        25: invokevirtual #55                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        28: ifeq          33
        31: iconst_0
        32: ireturn
        33: aload_0
        34: invokevirtual #59                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        37: getstatic     #63                 // Field ext/mods/gameserver/enums/skills/SkillType.SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
        40: if_acmpne     55
        43: aload_0
        44: invokevirtual #44                 // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
        47: getstatic     #69                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
        50: if_acmpne     55
        53: iconst_0
        54: ireturn
        55: getstatic     #73                 // Field ext/mods/gameserver/model/entity/autofarm/Util$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        58: aload_0
        59: invokevirtual #59                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        62: invokevirtual #79                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        65: iaload
        66: tableswitch   { // 1 to 17

                       1: 148

                       2: 148

                       3: 148

                       4: 148

                       5: 148

                       6: 148

                       7: 148

                       8: 148

                       9: 148

                      10: 148

                      11: 148

                      12: 148

                      13: 148

                      14: 148

                      15: 148

                      16: 148

                      17: 148
                 default: 150
            }
       148: iconst_0
       149: ireturn
       150: getstatic     #83                 // Field ext/mods/gameserver/model/entity/autofarm/Util$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       153: aload_0
       154: invokevirtual #44                 // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
       157: invokevirtual #86                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       160: iaload
       161: lookupswitch  { // 1

                       1: 180
                 default: 182
            }
       180: iconst_0
       181: ireturn
       182: aload_0
       183: invokevirtual #87                 // Method ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
       186: astore_1
       187: iconst_m1
       188: istore_2
       189: aload_1
       190: invokevirtual #90                 // Method java/lang/String.hashCode:()I
       193: lookupswitch  { // 11

             -1347733648: 376

             -1337244710: 391

             -1207507068: 348

              -895417548: 362

              -750023372: 320

              -685180305: 306

              -388130504: 292

              1255591005: 334

              1306760794: 436

              1426719407: 406

              1774072917: 421
                 default: 448
            }
       292: aload_1
       293: ldc           #93                 // String Aura Symphony
       295: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       298: ifeq          448
       301: iconst_0
       302: istore_2
       303: goto          448
       306: aload_1
       307: ldc           #99                 // String Inferno
       309: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       312: ifeq          448
       315: iconst_1
       316: istore_2
       317: goto          448
       320: aload_1
       321: ldc           #101                // String Blizzard
       323: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       326: ifeq          448
       329: iconst_2
       330: istore_2
       331: goto          448
       334: aload_1
       335: ldc           #103                // String Demon Wind
       337: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       340: ifeq          448
       343: iconst_3
       344: istore_2
       345: goto          448
       348: aload_1
       349: ldc           #105                // String Elemental Assault
       351: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       354: ifeq          448
       357: iconst_4
       358: istore_2
       359: goto          448
       362: aload_1
       363: ldc           #107                // String Elemental Symphony
       365: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       368: ifeq          448
       371: iconst_5
       372: istore_2
       373: goto          448
       376: aload_1
       377: ldc           #109                // String Elemental Storm
       379: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       382: ifeq          448
       385: bipush        6
       387: istore_2
       388: goto          448
       391: aload_1
       392: ldc           #111                // String Harmony of Noblesse
       394: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       397: ifeq          448
       400: bipush        7
       402: istore_2
       403: goto          448
       406: aload_1
       407: ldc           #113                // String Symphony of Noblesse
       409: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       412: ifeq          448
       415: bipush        8
       417: istore_2
       418: goto          448
       421: aload_1
       422: ldc           #115                // String Clan Gate
       424: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       427: ifeq          448
       430: bipush        9
       432: istore_2
       433: goto          448
       436: aload_1
       437: ldc           #117                // String Wyvern Aegis
       439: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       442: ifeq          448
       445: bipush        10
       447: istore_2
       448: iload_2
       449: tableswitch   { // 0 to 10

                       0: 508

                       1: 508

                       2: 508

                       3: 508

                       4: 508

                       5: 508

                       6: 508

                       7: 508

                       8: 508

                       9: 510

                      10: 512
                 default: 514
            }
       508: iconst_0
       509: ireturn
       510: iconst_0
       511: ireturn
       512: iconst_0
       513: ireturn
       514: iconst_1
       515: ireturn
      LineNumberTable:
        line 45: 0
        line 46: 14
        line 48: 16
        line 49: 31
        line 51: 33
        line 52: 53
        line 54: 55
        line 73: 148
        line 76: 150
        line 79: 180
        line 82: 182
        line 93: 508
        line 96: 510
        line 99: 512
        line 102: 514
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     516     0 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 24
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 16 /* same */
        frame_type = 21 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 92
        frame_type = 1 /* same */
        frame_type = 29 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 109
          locals = [ class java/lang/String, int ]
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 59 /* same */
        frame_type = 1 /* same */
        frame_type = 1 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1

  public static java.util.Comparator<java.lang.String> getMonsterComparator(java.util.Set<java.lang.String>);
    descriptor: (Ljava/util/Set;)Ljava/util/Comparator;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #119,  0            // InvokeDynamic #1:compare:(Ljava/util/Set;)Ljava/util/Comparator;
         6: areturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0 targets   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       7     0 targets   Ljava/util/Set<Ljava/lang/String;>;
    Signature: #209                         // (Ljava/util/Set<Ljava/lang/String;>;)Ljava/util/Comparator<Ljava/lang/String;>;

  public static java.util.Comparator<ext.mods.gameserver.skills.L2Skill> getSkillComparator(java.util.Collection<java.lang.Integer>);
    descriptor: (Ljava/util/Collection;)Ljava/util/Comparator;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #123,  0            // InvokeDynamic #2:compare:(Ljava/util/Collection;)Ljava/util/Comparator;
         6: areturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0 skills   Ljava/util/Collection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       7     0 skills   Ljava/util/Collection<Ljava/lang/Integer;>;
    Signature: #214                         // (Ljava/util/Collection<Ljava/lang/Integer;>;)Ljava/util/Comparator<Lext/mods/gameserver/skills/L2Skill;>;

  public static boolean isNodeListEquals(java.util.Collection<ext.mods.gameserver.network.serverpackets.ExServerPrimitive$Point>, java.util.List<ext.mods.gameserver.model.location.Location>);
    descriptor: (Ljava/util/Collection;Ljava/util/List;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_0
         1: invokeinterface #126,  1          // InterfaceMethod java/util/Collection.size:()I
         6: aload_1
         7: invokeinterface #131,  1          // InterfaceMethod java/util/List.size:()I
        12: if_icmpeq     17
        15: iconst_0
        16: ireturn
        17: iconst_0
        18: istore_2
        19: aload_0
        20: invokeinterface #134,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        25: astore_3
        26: aload_3
        27: invokeinterface #138,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        32: ifeq          105
        35: aload_3
        36: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        41: checkcast     #147                // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
        44: astore        4
        46: aload_1
        47: iload_2
        48: invokeinterface #149,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        53: checkcast     #153                // class ext/mods/gameserver/model/location/Location
        56: astore        5
        58: aload         4
        60: invokevirtual #155                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getX:()I
        63: aload         5
        65: invokevirtual #158                // Method ext/mods/gameserver/model/location/Location.getX:()I
        68: if_icmpne     97
        71: aload         4
        73: invokevirtual #159                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getY:()I
        76: aload         5
        78: invokevirtual #162                // Method ext/mods/gameserver/model/location/Location.getY:()I
        81: if_icmpne     97
        84: aload         4
        86: invokevirtual #163                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getZ:()I
        89: aload         5
        91: invokevirtual #166                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        94: if_icmpeq     99
        97: iconst_0
        98: ireturn
        99: iinc          2, 1
       102: goto          26
       105: iconst_1
       106: ireturn
      LineNumberTable:
        line 139: 0
        line 140: 15
        line 142: 17
        line 143: 19
        line 145: 46
        line 146: 58
        line 147: 97
        line 149: 99
        line 150: 102
        line 152: 105
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           58      44     5   loc   Lext/mods/gameserver/model/location/Location;
           46      56     4 point   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;
            0     107     0 list1   Ljava/util/Collection;
            0     107     1 list2   Ljava/util/List;
           19      88     2 indice   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     107     0 list1   Ljava/util/Collection<Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;
            0     107     1 list2   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 5
        frame_type = 17 /* same */
        frame_type = 253 /* append */
          offset_delta = 8
          locals = [ int, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point, class ext/mods/gameserver/model/location/Location ]
        frame_type = 1 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
    Signature: #228                         // (Ljava/util/Collection<Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)Z
}
SourceFile: "Util.java"
NestMembers:
  ext/mods/gameserver/model/entity/autofarm/Util$1
BootstrapMethods:
  0: #259 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #245 \u0001
  1: #265 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #247 (Ljava/lang/Object;Ljava/lang/Object;)I
      #249 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/Util.lambda$getMonsterComparator$0:(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)I
      #252 (Ljava/lang/String;Ljava/lang/String;)I
  2: #265 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #247 (Ljava/lang/Object;Ljava/lang/Object;)I
      #254 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/Util.lambda$getSkillComparator$0:(Ljava/util/Collection;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
      #257 (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
InnerClasses:
  static #74;                             // class ext/mods/gameserver/model/entity/autofarm/Util$1
  public static #275= #147 of #273;       // Point=class ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point of class ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  public static final #280= #276 of #278; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
