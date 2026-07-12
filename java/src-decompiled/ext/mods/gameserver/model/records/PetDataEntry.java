// Bytecode for: ext.mods.gameserver.model.records.PetDataEntry
// File: ext\mods\gameserver\model\records\PetDataEntry.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/PetDataEntry.class
  Last modified 9 de jul de 2026; size 5184 bytes
  MD5 checksum c5f79e0490c4859a7673827762f26c87
  Compiled from "PetDataEntry.java"
public final class ext.mods.gameserver.model.records.PetDataEntry extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/PetDataEntry
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 23, methods: 28, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/records/PetDataEntry.maxExp:J
    #8 = Class              #10           // ext/mods/gameserver/model/records/PetDataEntry
    #9 = NameAndType        #11:#12       // maxExp:J
   #10 = Utf8               ext/mods/gameserver/model/records/PetDataEntry
   #11 = Utf8               maxExp
   #12 = Utf8               J
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/records/PetDataEntry.maxMeal:I
   #14 = NameAndType        #15:#16       // maxMeal:I
   #15 = Utf8               maxMeal
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/records/PetDataEntry.expType:I
   #18 = NameAndType        #19:#16       // expType:I
   #19 = Utf8               expType
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/model/records/PetDataEntry.mealInBattle:I
   #21 = NameAndType        #22:#16       // mealInBattle:I
   #22 = Utf8               mealInBattle
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/records/PetDataEntry.mealInNormal:I
   #24 = NameAndType        #25:#16       // mealInNormal:I
   #25 = Utf8               mealInNormal
   #26 = Fieldref           #8.#27        // ext/mods/gameserver/model/records/PetDataEntry.pAtk:D
   #27 = NameAndType        #28:#29       // pAtk:D
   #28 = Utf8               pAtk
   #29 = Utf8               D
   #30 = Fieldref           #8.#31        // ext/mods/gameserver/model/records/PetDataEntry.pDef:D
   #31 = NameAndType        #32:#29       // pDef:D
   #32 = Utf8               pDef
   #33 = Fieldref           #8.#34        // ext/mods/gameserver/model/records/PetDataEntry.mAtk:D
   #34 = NameAndType        #35:#29       // mAtk:D
   #35 = Utf8               mAtk
   #36 = Fieldref           #8.#37        // ext/mods/gameserver/model/records/PetDataEntry.mDef:D
   #37 = NameAndType        #38:#29       // mDef:D
   #38 = Utf8               mDef
   #39 = Fieldref           #8.#40        // ext/mods/gameserver/model/records/PetDataEntry.maxHp:D
   #40 = NameAndType        #41:#29       // maxHp:D
   #41 = Utf8               maxHp
   #42 = Fieldref           #8.#43        // ext/mods/gameserver/model/records/PetDataEntry.maxMp:D
   #43 = NameAndType        #44:#29       // maxMp:D
   #44 = Utf8               maxMp
   #45 = Fieldref           #8.#46        // ext/mods/gameserver/model/records/PetDataEntry.hpRegen:F
   #46 = NameAndType        #47:#48       // hpRegen:F
   #47 = Utf8               hpRegen
   #48 = Utf8               F
   #49 = Fieldref           #8.#50        // ext/mods/gameserver/model/records/PetDataEntry.mpRegen:F
   #50 = NameAndType        #51:#48       // mpRegen:F
   #51 = Utf8               mpRegen
   #52 = Fieldref           #8.#53        // ext/mods/gameserver/model/records/PetDataEntry.ssCount:I
   #53 = NameAndType        #54:#16       // ssCount:I
   #54 = Utf8               ssCount
   #55 = Fieldref           #8.#56        // ext/mods/gameserver/model/records/PetDataEntry.spsCount:I
   #56 = NameAndType        #57:#16       // spsCount:I
   #57 = Utf8               spsCount
   #58 = Fieldref           #8.#59        // ext/mods/gameserver/model/records/PetDataEntry.mountMealInBattle:I
   #59 = NameAndType        #60:#16       // mountMealInBattle:I
   #60 = Utf8               mountMealInBattle
   #61 = Fieldref           #8.#62        // ext/mods/gameserver/model/records/PetDataEntry.mountMealInNormal:I
   #62 = NameAndType        #63:#16       // mountMealInNormal:I
   #63 = Utf8               mountMealInNormal
   #64 = Fieldref           #8.#65        // ext/mods/gameserver/model/records/PetDataEntry.mountAtkSpd:D
   #65 = NameAndType        #66:#29       // mountAtkSpd:D
   #66 = Utf8               mountAtkSpd
   #67 = Fieldref           #8.#68        // ext/mods/gameserver/model/records/PetDataEntry.mountPatk:D
   #68 = NameAndType        #69:#29       // mountPatk:D
   #69 = Utf8               mountPatk
   #70 = Fieldref           #8.#71        // ext/mods/gameserver/model/records/PetDataEntry.mountMatk:D
   #71 = NameAndType        #72:#29       // mountMatk:D
   #72 = Utf8               mountMatk
   #73 = Fieldref           #8.#74        // ext/mods/gameserver/model/records/PetDataEntry.mountBaseSpeed:I
   #74 = NameAndType        #75:#16       // mountBaseSpeed:I
   #75 = Utf8               mountBaseSpeed
   #76 = Fieldref           #8.#77        // ext/mods/gameserver/model/records/PetDataEntry.mountWaterSpeed:I
   #77 = NameAndType        #78:#16       // mountWaterSpeed:I
   #78 = Utf8               mountWaterSpeed
   #79 = Fieldref           #8.#80        // ext/mods/gameserver/model/records/PetDataEntry.mountFlySpeed:I
   #80 = NameAndType        #81:#16       // mountFlySpeed:I
   #81 = Utf8               mountFlySpeed
   #82 = String             #83           // exp
   #83 = Utf8               exp
   #84 = Methodref          #85.#86       // ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;)J
   #85 = Class              #87           // ext/mods/commons/data/StatSet
   #86 = NameAndType        #88:#89       // getLong:(Ljava/lang/String;)J
   #87 = Utf8               ext/mods/commons/data/StatSet
   #88 = Utf8               getLong
   #89 = Utf8               (Ljava/lang/String;)J
   #90 = String             #15           // maxMeal
   #91 = Methodref          #85.#92       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #92 = NameAndType        #93:#94       // getInteger:(Ljava/lang/String;)I
   #93 = Utf8               getInteger
   #94 = Utf8               (Ljava/lang/String;)I
   #95 = String             #19           // expType
   #96 = String             #22           // mealInBattle
   #97 = String             #25           // mealInNormal
   #98 = String             #28           // pAtk
   #99 = Methodref          #85.#100      // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
  #100 = NameAndType        #101:#102     // getDouble:(Ljava/lang/String;)D
  #101 = Utf8               getDouble
  #102 = Utf8               (Ljava/lang/String;)D
  #103 = String             #32           // pDef
  #104 = String             #35           // mAtk
  #105 = String             #38           // mDef
  #106 = String             #107          // hp
  #107 = Utf8               hp
  #108 = String             #109          // mp
  #109 = Utf8               mp
  #110 = String             #47           // hpRegen
  #111 = Methodref          #85.#112      // ext/mods/commons/data/StatSet.getFloat:(Ljava/lang/String;)F
  #112 = NameAndType        #113:#114     // getFloat:(Ljava/lang/String;)F
  #113 = Utf8               getFloat
  #114 = Utf8               (Ljava/lang/String;)F
  #115 = String             #51           // mpRegen
  #116 = String             #54           // ssCount
  #117 = String             #57           // spsCount
  #118 = String             #119          // mealInBattleOnRide
  #119 = Utf8               mealInBattleOnRide
  #120 = Methodref          #85.#121      // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #121 = NameAndType        #93:#122      // getInteger:(Ljava/lang/String;I)I
  #122 = Utf8               (Ljava/lang/String;I)I
  #123 = String             #124          // mealInNormalOnRide
  #124 = Utf8               mealInNormalOnRide
  #125 = String             #126          // atkSpdOnRide
  #126 = Utf8               atkSpdOnRide
  #127 = Methodref          #85.#128      // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
  #128 = NameAndType        #101:#129     // getDouble:(Ljava/lang/String;D)D
  #129 = Utf8               (Ljava/lang/String;D)D
  #130 = String             #131          // pAtkOnRide
  #131 = Utf8               pAtkOnRide
  #132 = String             #133          // mAtkOnRide
  #133 = Utf8               mAtkOnRide
  #134 = String             #75           // mountBaseSpeed
  #135 = String             #78           // mountWaterSpeed
  #136 = String             #81           // mountFlySpeed
  #137 = Methodref          #8.#138       // ext/mods/gameserver/model/records/PetDataEntry."<init>":(JIIIIDDDDDDFFIIIIDDDIII)V
  #138 = NameAndType        #5:#139       // "<init>":(JIIIIDDDDDDFFIIIIDDDIII)V
  #139 = Utf8               (JIIIIDDDDDDFFIIIIDDDIII)V
  #140 = InvokeDynamic      #0:#141       // #0:toString:(Lext/mods/gameserver/model/records/PetDataEntry;)Ljava/lang/String;
  #141 = NameAndType        #142:#143     // toString:(Lext/mods/gameserver/model/records/PetDataEntry;)Ljava/lang/String;
  #142 = Utf8               toString
  #143 = Utf8               (Lext/mods/gameserver/model/records/PetDataEntry;)Ljava/lang/String;
  #144 = InvokeDynamic      #0:#145       // #0:hashCode:(Lext/mods/gameserver/model/records/PetDataEntry;)I
  #145 = NameAndType        #146:#147     // hashCode:(Lext/mods/gameserver/model/records/PetDataEntry;)I
  #146 = Utf8               hashCode
  #147 = Utf8               (Lext/mods/gameserver/model/records/PetDataEntry;)I
  #148 = InvokeDynamic      #0:#149       // #0:equals:(Lext/mods/gameserver/model/records/PetDataEntry;Ljava/lang/Object;)Z
  #149 = NameAndType        #150:#151     // equals:(Lext/mods/gameserver/model/records/PetDataEntry;Ljava/lang/Object;)Z
  #150 = Utf8               equals
  #151 = Utf8               (Lext/mods/gameserver/model/records/PetDataEntry;Ljava/lang/Object;)Z
  #152 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #153 = Utf8               Code
  #154 = Utf8               LineNumberTable
  #155 = Utf8               LocalVariableTable
  #156 = Utf8               this
  #157 = Utf8               Lext/mods/gameserver/model/records/PetDataEntry;
  #158 = Utf8               set
  #159 = Utf8               Lext/mods/commons/data/StatSet;
  #160 = Utf8               MethodParameters
  #161 = Utf8               ()Ljava/lang/String;
  #162 = Utf8               ()I
  #163 = Utf8               (Ljava/lang/Object;)Z
  #164 = Utf8               o
  #165 = Utf8               Ljava/lang/Object;
  #166 = Utf8               ()J
  #167 = Utf8               ()D
  #168 = Utf8               ()F
  #169 = Utf8               SourceFile
  #170 = Utf8               PetDataEntry.java
  #171 = Utf8               Record
  #172 = Utf8               BootstrapMethods
  #173 = String             #174          // maxExp;maxMeal;expType;mealInBattle;mealInNormal;pAtk;pDef;mAtk;mDef;maxHp;maxMp;hpRegen;mpRegen;ssCount;spsCount;mountMealInBattle;mountMealInNormal;mountAtkSpd;mountPatk;mountMatk;mountBaseSpeed;mountWaterSpeed;mountFlySpeed
  #174 = Utf8               maxExp;maxMeal;expType;mealInBattle;mealInNormal;pAtk;pDef;mAtk;mDef;maxHp;maxMp;hpRegen;mpRegen;ssCount;spsCount;mountMealInBattle;mountMealInNormal;mountAtkSpd;mountPatk;mountMatk;mountBaseSpeed;mountWaterSpeed;mountFlySpeed
  #175 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/model/records/PetDataEntry.maxExp:J
  #176 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.maxMeal:I
  #177 = MethodHandle       1:#17         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.expType:I
  #178 = MethodHandle       1:#20         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mealInBattle:I
  #179 = MethodHandle       1:#23         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mealInNormal:I
  #180 = MethodHandle       1:#26         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.pAtk:D
  #181 = MethodHandle       1:#30         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.pDef:D
  #182 = MethodHandle       1:#33         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mAtk:D
  #183 = MethodHandle       1:#36         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mDef:D
  #184 = MethodHandle       1:#39         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.maxHp:D
  #185 = MethodHandle       1:#42         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.maxMp:D
  #186 = MethodHandle       1:#45         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.hpRegen:F
  #187 = MethodHandle       1:#49         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mpRegen:F
  #188 = MethodHandle       1:#52         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.ssCount:I
  #189 = MethodHandle       1:#55         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.spsCount:I
  #190 = MethodHandle       1:#58         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountMealInBattle:I
  #191 = MethodHandle       1:#61         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountMealInNormal:I
  #192 = MethodHandle       1:#64         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountAtkSpd:D
  #193 = MethodHandle       1:#67         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountPatk:D
  #194 = MethodHandle       1:#70         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountMatk:D
  #195 = MethodHandle       1:#73         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountBaseSpeed:I
  #196 = MethodHandle       1:#76         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountWaterSpeed:I
  #197 = MethodHandle       1:#79         // REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountFlySpeed:I
  #198 = MethodHandle       6:#199        // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #199 = Methodref          #200.#201     // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #200 = Class              #202          // java/lang/runtime/ObjectMethods
  #201 = NameAndType        #203:#204     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #202 = Utf8               java/lang/runtime/ObjectMethods
  #203 = Utf8               bootstrap
  #204 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #205 = Utf8               InnerClasses
  #206 = Class              #207          // java/lang/invoke/MethodHandles$Lookup
  #207 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #208 = Class              #209          // java/lang/invoke/MethodHandles
  #209 = Utf8               java/lang/invoke/MethodHandles
  #210 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.PetDataEntry(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=35, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #82                 // String exp
         4: invokevirtual #84                 // Method ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;)J
         7: aload_1
         8: ldc           #90                 // String maxMeal
        10: invokevirtual #91                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #95                 // String expType
        16: invokevirtual #91                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        19: aload_1
        20: ldc           #96                 // String mealInBattle
        22: invokevirtual #91                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        25: aload_1
        26: ldc           #97                 // String mealInNormal
        28: invokevirtual #91                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        31: aload_1
        32: ldc           #98                 // String pAtk
        34: invokevirtual #99                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        37: aload_1
        38: ldc           #103                // String pDef
        40: invokevirtual #99                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        43: aload_1
        44: ldc           #104                // String mAtk
        46: invokevirtual #99                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        49: aload_1
        50: ldc           #105                // String mDef
        52: invokevirtual #99                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        55: aload_1
        56: ldc           #106                // String hp
        58: invokevirtual #99                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        61: aload_1
        62: ldc           #108                // String mp
        64: invokevirtual #99                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        67: aload_1
        68: ldc           #110                // String hpRegen
        70: invokevirtual #111                // Method ext/mods/commons/data/StatSet.getFloat:(Ljava/lang/String;)F
        73: aload_1
        74: ldc           #115                // String mpRegen
        76: invokevirtual #111                // Method ext/mods/commons/data/StatSet.getFloat:(Ljava/lang/String;)F
        79: aload_1
        80: ldc           #116                // String ssCount
        82: invokevirtual #91                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        85: aload_1
        86: ldc           #117                // String spsCount
        88: invokevirtual #91                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        91: aload_1
        92: ldc           #118                // String mealInBattleOnRide
        94: iconst_0
        95: invokevirtual #120                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        98: aload_1
        99: ldc           #123                // String mealInNormalOnRide
       101: iconst_0
       102: invokevirtual #120                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       105: aload_1
       106: ldc           #125                // String atkSpdOnRide
       108: dconst_0
       109: invokevirtual #127                // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       112: aload_1
       113: ldc           #130                // String pAtkOnRide
       115: dconst_0
       116: invokevirtual #127                // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       119: aload_1
       120: ldc           #132                // String mAtkOnRide
       122: dconst_0
       123: invokevirtual #127                // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       126: aload_1
       127: ldc           #134                // String mountBaseSpeed
       129: invokevirtual #91                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       132: aload_1
       133: ldc           #135                // String mountWaterSpeed
       135: invokevirtual #91                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       138: aload_1
       139: ldc           #136                // String mountFlySpeed
       141: invokevirtual #91                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       144: invokespecial #137                // Method "<init>":(JIIIIDDDDDDFFIIIIDDDIII)V
       147: return
      LineNumberTable:
        line 26: 0
        line 27: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     148     0  this   Lext/mods/gameserver/model/records/PetDataEntry;
            0     148     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.PetDataEntry(long, int, int, int, int, double, double, double, double, double, double, float, float, int, int, int, int, double, double, double, int, int, int);
    descriptor: (JIIIIDDDDDDFFIIIIDDDIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=34, args_size=24
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: lload_1
         6: putfield      #7                  // Field maxExp:J
         9: aload_0
        10: iload_3
        11: putfield      #13                 // Field maxMeal:I
        14: aload_0
        15: iload         4
        17: putfield      #17                 // Field expType:I
        20: aload_0
        21: iload         5
        23: putfield      #20                 // Field mealInBattle:I
        26: aload_0
        27: iload         6
        29: putfield      #23                 // Field mealInNormal:I
        32: aload_0
        33: dload         7
        35: putfield      #26                 // Field pAtk:D
        38: aload_0
        39: dload         9
        41: putfield      #30                 // Field pDef:D
        44: aload_0
        45: dload         11
        47: putfield      #33                 // Field mAtk:D
        50: aload_0
        51: dload         13
        53: putfield      #36                 // Field mDef:D
        56: aload_0
        57: dload         15
        59: putfield      #39                 // Field maxHp:D
        62: aload_0
        63: dload         17
        65: putfield      #42                 // Field maxMp:D
        68: aload_0
        69: fload         19
        71: putfield      #45                 // Field hpRegen:F
        74: aload_0
        75: fload         20
        77: putfield      #49                 // Field mpRegen:F
        80: aload_0
        81: iload         21
        83: putfield      #52                 // Field ssCount:I
        86: aload_0
        87: iload         22
        89: putfield      #55                 // Field spsCount:I
        92: aload_0
        93: iload         23
        95: putfield      #58                 // Field mountMealInBattle:I
        98: aload_0
        99: iload         24
       101: putfield      #61                 // Field mountMealInNormal:I
       104: aload_0
       105: dload         25
       107: putfield      #64                 // Field mountAtkSpd:D
       110: aload_0
       111: dload         27
       113: putfield      #67                 // Field mountPatk:D
       116: aload_0
       117: dload         29
       119: putfield      #70                 // Field mountMatk:D
       122: aload_0
       123: iload         31
       125: putfield      #73                 // Field mountBaseSpeed:I
       128: aload_0
       129: iload         32
       131: putfield      #76                 // Field mountWaterSpeed:I
       134: aload_0
       135: iload         33
       137: putfield      #79                 // Field mountFlySpeed:I
       140: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     141     0  this   Lext/mods/gameserver/model/records/PetDataEntry;
            0     141     1 maxExp   J
            0     141     3 maxMeal   I
            0     141     4 expType   I
            0     141     5 mealInBattle   I
            0     141     6 mealInNormal   I
            0     141     7  pAtk   D
            0     141     9  pDef   D
            0     141    11  mAtk   D
            0     141    13  mDef   D
            0     141    15 maxHp   D
            0     141    17 maxMp   D
            0     141    19 hpRegen   F
            0     141    20 mpRegen   F
            0     141    21 ssCount   I
            0     141    22 spsCount   I
            0     141    23 mountMealInBattle   I
            0     141    24 mountMealInNormal   I
            0     141    25 mountAtkSpd   D
            0     141    27 mountPatk   D
            0     141    29 mountMatk   D
            0     141    31 mountBaseSpeed   I
            0     141    32 mountWaterSpeed   I
            0     141    33 mountFlySpeed   I
    MethodParameters:
      Name                           Flags
      maxExp
      maxMeal
      expType
      mealInBattle
      mealInNormal
      pAtk
      pDef
      mAtk
      mDef
      maxHp
      maxMp
      hpRegen
      mpRegen
      ssCount
      spsCount
      mountMealInBattle
      mountMealInNormal
      mountAtkSpd
      mountPatk
      mountMatk
      mountBaseSpeed
      mountWaterSpeed
      mountFlySpeed

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #140,  0            // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/PetDataEntry;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #144,  0            // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/PetDataEntry;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #148,  0            // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/PetDataEntry;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/PetDataEntry;
            0       8     1     o   Ljava/lang/Object;

  public long maxExp();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field maxExp:J
         4: lreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int maxMeal();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field maxMeal:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int expType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field expType:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int mealInBattle();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field mealInBattle:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int mealInNormal();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field mealInNormal:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public double pAtk();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field pAtk:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public double pDef();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field pDef:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public double mAtk();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field mAtk:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public double mDef();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field mDef:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public double maxHp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field maxHp:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public double maxMp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field maxMp:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public float hpRegen();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field hpRegen:F
         4: freturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public float mpRegen();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #49                 // Field mpRegen:F
         4: freturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int ssCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field ssCount:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int spsCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #55                 // Field spsCount:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int mountMealInBattle();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #58                 // Field mountMealInBattle:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int mountMealInNormal();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #61                 // Field mountMealInNormal:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public double mountAtkSpd();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #64                 // Field mountAtkSpd:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public double mountPatk();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #67                 // Field mountPatk:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public double mountMatk();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #70                 // Field mountMatk:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int mountBaseSpeed();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field mountBaseSpeed:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int mountWaterSpeed();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #76                 // Field mountWaterSpeed:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;

  public int mountFlySpeed();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #79                 // Field mountFlySpeed:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PetDataEntry;
}
SourceFile: "PetDataEntry.java"
  Record: length = 0x8C (unknown attribute)
   00 17 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 10 00 00 00 16 00 10 00 00 00 19 00 10 00 00
   00 1C 00 1D 00 00 00 20 00 1D 00 00 00 23 00 1D
   00 00 00 26 00 1D 00 00 00 29 00 1D 00 00 00 2C
   00 1D 00 00 00 2F 00 30 00 00 00 33 00 30 00 00
   00 36 00 10 00 00 00 39 00 10 00 00 00 3C 00 10
   00 00 00 3F 00 10 00 00 00 42 00 1D 00 00 00 45
   00 1D 00 00 00 48 00 1D 00 00 00 4B 00 10 00 00
   00 4E 00 10 00 00 00 51 00 10 00 00
BootstrapMethods:
  0: #198 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/PetDataEntry
      #173 maxExp;maxMeal;expType;mealInBattle;mealInNormal;pAtk;pDef;mAtk;mDef;maxHp;maxMp;hpRegen;mpRegen;ssCount;spsCount;mountMealInBattle;mountMealInNormal;mountAtkSpd;mountPatk;mountMatk;mountBaseSpeed;mountWaterSpeed;mountFlySpeed
      #175 REF_getField ext/mods/gameserver/model/records/PetDataEntry.maxExp:J
      #176 REF_getField ext/mods/gameserver/model/records/PetDataEntry.maxMeal:I
      #177 REF_getField ext/mods/gameserver/model/records/PetDataEntry.expType:I
      #178 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mealInBattle:I
      #179 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mealInNormal:I
      #180 REF_getField ext/mods/gameserver/model/records/PetDataEntry.pAtk:D
      #181 REF_getField ext/mods/gameserver/model/records/PetDataEntry.pDef:D
      #182 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mAtk:D
      #183 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mDef:D
      #184 REF_getField ext/mods/gameserver/model/records/PetDataEntry.maxHp:D
      #185 REF_getField ext/mods/gameserver/model/records/PetDataEntry.maxMp:D
      #186 REF_getField ext/mods/gameserver/model/records/PetDataEntry.hpRegen:F
      #187 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mpRegen:F
      #188 REF_getField ext/mods/gameserver/model/records/PetDataEntry.ssCount:I
      #189 REF_getField ext/mods/gameserver/model/records/PetDataEntry.spsCount:I
      #190 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountMealInBattle:I
      #191 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountMealInNormal:I
      #192 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountAtkSpd:D
      #193 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountPatk:D
      #194 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountMatk:D
      #195 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountBaseSpeed:I
      #196 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountWaterSpeed:I
      #197 REF_getField ext/mods/gameserver/model/records/PetDataEntry.mountFlySpeed:I
InnerClasses:
  public static final #210= #206 of #208; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
