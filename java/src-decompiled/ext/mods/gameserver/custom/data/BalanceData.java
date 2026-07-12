// Bytecode for: ext.mods.gameserver.custom.data.BalanceData
// File: ext\mods\gameserver\custom\data\BalanceData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/BalanceData.class
  Last modified 9 de jul de 2026; size 7797 bytes
  MD5 checksum d1b2574732f91b88b5b2ccb137c442d0
  Compiled from "BalanceData.java"
public class ext.mods.gameserver.custom.data.BalanceData
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/custom/data/BalanceData
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/custom/data/BalanceData._modifiers:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/custom/data/BalanceData
   #12 = NameAndType        #14:#15       // _modifiers:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/custom/data/BalanceData
   #14 = Utf8               _modifiers
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/custom/data/BalanceData._vulnModifiers:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // _vulnModifiers:Ljava/util/Map;
   #18 = Utf8               _vulnModifiers
   #19 = Fieldref           #20.#21       // java/lang/System.out:Ljava/io/PrintStream;
   #20 = Class              #22           // java/lang/System
   #21 = NameAndType        #23:#24       // out:Ljava/io/PrintStream;
   #22 = Utf8               java/lang/System
   #23 = Utf8               out
   #24 = Utf8               Ljava/io/PrintStream;
   #25 = String             #26           // Loaded Balance.
   #26 = Utf8               Loaded Balance.
   #27 = Methodref          #28.#29       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #28 = Class              #30           // java/io/PrintStream
   #29 = NameAndType        #31:#32       // println:(Ljava/lang/String;)V
   #30 = Utf8               java/io/PrintStream
   #31 = Utf8               println
   #32 = Utf8               (Ljava/lang/String;)V
   #33 = Methodref          #11.#34       // ext/mods/gameserver/custom/data/BalanceData.load:()V
   #34 = NameAndType        #35:#6        // load:()V
   #35 = Utf8               load
   #36 = InterfaceMethodref #37.#38       // java/util/Map.clear:()V
   #37 = Class              #39           // java/util/Map
   #38 = NameAndType        #40:#6        // clear:()V
   #39 = Utf8               java/util/Map
   #40 = Utf8               clear
   #41 = Methodref          #42.#43       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #42 = Class              #44           // ext/mods/commons/pool/ConnectionPool
   #43 = NameAndType        #45:#46       // getConnection:()Ljava/sql/Connection;
   #44 = Utf8               ext/mods/commons/pool/ConnectionPool
   #45 = Utf8               getConnection
   #46 = Utf8               ()Ljava/sql/Connection;
   #47 = String             #48           // SELECT * FROM balance_classes
   #48 = Utf8               SELECT * FROM balance_classes
   #49 = InterfaceMethodref #50.#51       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #50 = Class              #52           // java/sql/Connection
   #51 = NameAndType        #53:#54       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #52 = Utf8               java/sql/Connection
   #53 = Utf8               prepareStatement
   #54 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #55 = InterfaceMethodref #56.#57       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #56 = Class              #58           // java/sql/PreparedStatement
   #57 = NameAndType        #59:#60       // executeQuery:()Ljava/sql/ResultSet;
   #58 = Utf8               java/sql/PreparedStatement
   #59 = Utf8               executeQuery
   #60 = Utf8               ()Ljava/sql/ResultSet;
   #61 = InterfaceMethodref #62.#63       // java/sql/ResultSet.next:()Z
   #62 = Class              #64           // java/sql/ResultSet
   #63 = NameAndType        #65:#66       // next:()Z
   #64 = Utf8               java/sql/ResultSet
   #65 = Utf8               next
   #66 = Utf8               ()Z
   #67 = String             #68           // class_id_attacker
   #68 = Utf8               class_id_attacker
   #69 = InterfaceMethodref #62.#70       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #70 = NameAndType        #71:#72       // getInt:(Ljava/lang/String;)I
   #71 = Utf8               getInt
   #72 = Utf8               (Ljava/lang/String;)I
   #73 = String             #74           // class_id_target
   #74 = Utf8               class_id_target
   #75 = String             #76           // p_atk_mod
   #76 = Utf8               p_atk_mod
   #77 = InterfaceMethodref #62.#78       // java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
   #78 = NameAndType        #79:#80       // getDouble:(Ljava/lang/String;)D
   #79 = Utf8               getDouble
   #80 = Utf8               (Ljava/lang/String;)D
   #81 = String             #82           // m_atk_mod
   #82 = Utf8               m_atk_mod
   #83 = String             #84           // p_def_mod
   #84 = Utf8               p_def_mod
   #85 = String             #86           // m_def_mod
   #86 = Utf8               m_def_mod
   #87 = Methodref          #11.#88       // ext/mods/gameserver/custom/data/BalanceData.buildKey:(II)Ljava/lang/String;
   #88 = NameAndType        #89:#90       // buildKey:(II)Ljava/lang/String;
   #89 = Utf8               buildKey
   #90 = Utf8               (II)Ljava/lang/String;
   #91 = Class              #92           // ext/mods/gameserver/model/holder/BalanceHolder
   #92 = Utf8               ext/mods/gameserver/model/holder/BalanceHolder
   #93 = Methodref          #91.#94       // ext/mods/gameserver/model/holder/BalanceHolder."<init>":(DDDD)V
   #94 = NameAndType        #5:#95        // "<init>":(DDDD)V
   #95 = Utf8               (DDDD)V
   #96 = InterfaceMethodref #37.#97       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #97 = NameAndType        #98:#99       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #98 = Utf8               put
   #99 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #100 = InterfaceMethodref #62.#101      // java/sql/ResultSet.close:()V
  #101 = NameAndType        #102:#6       // close:()V
  #102 = Utf8               close
  #103 = Class              #104          // java/lang/Throwable
  #104 = Utf8               java/lang/Throwable
  #105 = Methodref          #103.#106     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #106 = NameAndType        #107:#108     // addSuppressed:(Ljava/lang/Throwable;)V
  #107 = Utf8               addSuppressed
  #108 = Utf8               (Ljava/lang/Throwable;)V
  #109 = InterfaceMethodref #56.#101      // java/sql/PreparedStatement.close:()V
  #110 = InterfaceMethodref #50.#101      // java/sql/Connection.close:()V
  #111 = Class              #112          // java/lang/Exception
  #112 = Utf8               java/lang/Exception
  #113 = Methodref          #114.#115     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #114 = Class              #116          // java/lang/String
  #115 = NameAndType        #117:#118     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #116 = Utf8               java/lang/String
  #117 = Utf8               valueOf
  #118 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #119 = InvokeDynamic      #0:#120       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #120 = NameAndType        #121:#122     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #121 = Utf8               makeConcatWithConstants
  #122 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #123 = Methodref          #124.#125     // ext/mods/gameserver/model/balance/BalanceGeneration.generate:(Ljava/sql/Connection;Ljava/util/Map;)V
  #124 = Class              #126          // ext/mods/gameserver/model/balance/BalanceGeneration
  #125 = NameAndType        #127:#128     // generate:(Ljava/sql/Connection;Ljava/util/Map;)V
  #126 = Utf8               ext/mods/gameserver/model/balance/BalanceGeneration
  #127 = Utf8               generate
  #128 = Utf8               (Ljava/sql/Connection;Ljava/util/Map;)V
  #129 = InvokeDynamic      #1:#120       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #130 = Methodref          #11.#131      // ext/mods/gameserver/custom/data/BalanceData.loadVulnerabilities:()V
  #131 = NameAndType        #132:#6       // loadVulnerabilities:()V
  #132 = Utf8               loadVulnerabilities
  #133 = String             #134          // SELECT skill_type, multiplier FROM balance_vulnerability
  #134 = Utf8               SELECT skill_type, multiplier FROM balance_vulnerability
  #135 = String             #136          // skill_type
  #136 = Utf8               skill_type
  #137 = InterfaceMethodref #62.#138      // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #138 = NameAndType        #139:#122     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #139 = Utf8               getString
  #140 = Methodref          #114.#141     // java/lang/String.toUpperCase:()Ljava/lang/String;
  #141 = NameAndType        #142:#143     // toUpperCase:()Ljava/lang/String;
  #142 = Utf8               toUpperCase
  #143 = Utf8               ()Ljava/lang/String;
  #144 = String             #145          // multiplier
  #145 = Utf8               multiplier
  #146 = Methodref          #147.#148     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #147 = Class              #149          // java/lang/Double
  #148 = NameAndType        #117:#150     // valueOf:(D)Ljava/lang/Double;
  #149 = Utf8               java/lang/Double
  #150 = Utf8               (D)Ljava/lang/Double;
  #151 = InvokeDynamic      #2:#120       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #152 = InvokeDynamic      #3:#153       // #3:makeConcatWithConstants:(II)Ljava/lang/String;
  #153 = NameAndType        #121:#90      // makeConcatWithConstants:(II)Ljava/lang/String;
  #154 = InterfaceMethodref #37.#155      // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #155 = NameAndType        #156:#99      // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #156 = Utf8               getOrDefault
  #157 = Methodref          #147.#158     // java/lang/Double.doubleValue:()D
  #158 = NameAndType        #159:#160     // doubleValue:()D
  #159 = Utf8               doubleValue
  #160 = Utf8               ()D
  #161 = String             #162          // INSERT INTO balance_classes (class_id_attacker, class_id_target, p_atk_mod, m_atk_mod, p_def_mod, m_def_mod) VALUES (?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE p_atk_mod = VALUES(p_atk_mod), m_atk_mod = VALUES(m_atk_mod), p_def_mod = VALUES(p_def_mod), m_def_mod = VALUES(m_def_mod)
  #162 = Utf8               INSERT INTO balance_classes (class_id_attacker, class_id_target, p_atk_mod, m_atk_mod, p_def_mod, m_def_mod) VALUES (?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE p_atk_mod = VALUES(p_atk_mod), m_atk_mod = VALUES(m_atk_mod), p_def_mod = VALUES(p_def_mod), m_def_mod = VALUES(m_def_mod)
  #163 = InterfaceMethodref #56.#164      // java/sql/PreparedStatement.setInt:(II)V
  #164 = NameAndType        #165:#166     // setInt:(II)V
  #165 = Utf8               setInt
  #166 = Utf8               (II)V
  #167 = Fieldref           #91.#168      // ext/mods/gameserver/model/holder/BalanceHolder._pAtkMod:D
  #168 = NameAndType        #169:#170     // _pAtkMod:D
  #169 = Utf8               _pAtkMod
  #170 = Utf8               D
  #171 = InterfaceMethodref #56.#172      // java/sql/PreparedStatement.setDouble:(ID)V
  #172 = NameAndType        #173:#174     // setDouble:(ID)V
  #173 = Utf8               setDouble
  #174 = Utf8               (ID)V
  #175 = Fieldref           #91.#176      // ext/mods/gameserver/model/holder/BalanceHolder._mAtkMod:D
  #176 = NameAndType        #177:#170     // _mAtkMod:D
  #177 = Utf8               _mAtkMod
  #178 = Fieldref           #91.#179      // ext/mods/gameserver/model/holder/BalanceHolder._pDefMod:D
  #179 = NameAndType        #180:#170     // _pDefMod:D
  #180 = Utf8               _pDefMod
  #181 = Fieldref           #91.#182      // ext/mods/gameserver/model/holder/BalanceHolder._mDefMod:D
  #182 = NameAndType        #183:#170     // _mDefMod:D
  #183 = Utf8               _mDefMod
  #184 = InterfaceMethodref #56.#185      // java/sql/PreparedStatement.executeUpdate:()I
  #185 = NameAndType        #186:#187     // executeUpdate:()I
  #186 = Utf8               executeUpdate
  #187 = Utf8               ()I
  #188 = Methodref          #189.#190     // ext/mods/gameserver/model/holder/BalanceName.getName:(I)Ljava/lang/String;
  #189 = Class              #191          // ext/mods/gameserver/model/holder/BalanceName
  #190 = NameAndType        #192:#193     // getName:(I)Ljava/lang/String;
  #191 = Utf8               ext/mods/gameserver/model/holder/BalanceName
  #192 = Utf8               getName
  #193 = Utf8               (I)Ljava/lang/String;
  #194 = Methodref          #114.#195     // java/lang/String.toLowerCase:()Ljava/lang/String;
  #195 = NameAndType        #196:#143     // toLowerCase:()Ljava/lang/String;
  #196 = Utf8               toLowerCase
  #197 = InvokeDynamic      #4:#198       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #198 = NameAndType        #121:#199     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #199 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #200 = InvokeDynamic      #5:#120       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #201 = String             #202          // REPLACE INTO balance_vulnerability (skill_type, multiplier) VALUES (?, ?)
  #202 = Utf8               REPLACE INTO balance_vulnerability (skill_type, multiplier) VALUES (?, ?)
  #203 = InterfaceMethodref #56.#204      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #204 = NameAndType        #205:#206     // setString:(ILjava/lang/String;)V
  #205 = Utf8               setString
  #206 = Utf8               (ILjava/lang/String;)V
  #207 = InvokeDynamic      #6:#208       // #6:makeConcatWithConstants:(Ljava/lang/String;D)Ljava/lang/String;
  #208 = NameAndType        #121:#209     // makeConcatWithConstants:(Ljava/lang/String;D)Ljava/lang/String;
  #209 = Utf8               (Ljava/lang/String;D)Ljava/lang/String;
  #210 = Methodref          #111.#211     // java/lang/Exception.printStackTrace:()V
  #211 = NameAndType        #212:#6       // printStackTrace:()V
  #212 = Utf8               printStackTrace
  #213 = Fieldref           #214.#215     // ext/mods/gameserver/custom/data/BalanceData$SingletonHolder.instance:Lext/mods/gameserver/custom/data/BalanceData;
  #214 = Class              #216          // ext/mods/gameserver/custom/data/BalanceData$SingletonHolder
  #215 = NameAndType        #217:#218     // instance:Lext/mods/gameserver/custom/data/BalanceData;
  #216 = Utf8               ext/mods/gameserver/custom/data/BalanceData$SingletonHolder
  #217 = Utf8               instance
  #218 = Utf8               Lext/mods/gameserver/custom/data/BalanceData;
  #219 = Utf8               Signature
  #220 = Utf8               Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/model/holder/BalanceHolder;>;
  #221 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/Double;>;
  #222 = Utf8               Code
  #223 = Utf8               LineNumberTable
  #224 = Utf8               LocalVariableTable
  #225 = Utf8               this
  #226 = Utf8               init
  #227 = Utf8               classAtk
  #228 = Utf8               I
  #229 = Utf8               classTgt
  #230 = Utf8               pAtk
  #231 = Utf8               mAtk
  #232 = Utf8               pDef
  #233 = Utf8               mDef
  #234 = Utf8               key
  #235 = Utf8               Ljava/lang/String;
  #236 = Utf8               rs
  #237 = Utf8               Ljava/sql/ResultSet;
  #238 = Utf8               ps
  #239 = Utf8               Ljava/sql/PreparedStatement;
  #240 = Utf8               con
  #241 = Utf8               Ljava/sql/Connection;
  #242 = Utf8               e
  #243 = Utf8               Ljava/lang/Exception;
  #244 = Utf8               con1
  #245 = Utf8               StackMapTable
  #246 = Utf8               type
  #247 = Utf8               atk
  #248 = Utf8               tgt
  #249 = Utf8               getSkillTypeMultiplier
  #250 = Utf8               skillType
  #251 = Utf8               getModifier
  #252 = Utf8               (II)Lext/mods/gameserver/model/holder/BalanceHolder;
  #253 = Utf8               getModifierMap
  #254 = Utf8               ()Ljava/util/Map;
  #255 = Utf8               ()Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/model/holder/BalanceHolder;>;
  #256 = Utf8               updateModifier
  #257 = Utf8               (IILext/mods/gameserver/model/holder/BalanceHolder;)V
  #258 = Utf8               atkName
  #259 = Utf8               tgtName
  #260 = Utf8               mod
  #261 = Utf8               Lext/mods/gameserver/model/holder/BalanceHolder;
  #262 = Utf8               sql
  #263 = Utf8               saveVulnerability
  #264 = Utf8               (Ljava/lang/String;D)V
  #265 = Utf8               getInstance
  #266 = Utf8               ()Lext/mods/gameserver/custom/data/BalanceData;
  #267 = Utf8               SourceFile
  #268 = Utf8               BalanceData.java
  #269 = Utf8               NestMembers
  #270 = Utf8               BootstrapMethods
  #271 = String             #272          // Error loading balance modifiers: \u0001
  #272 = Utf8               Error loading balance modifiers: \u0001
  #273 = String             #274          // Error loading insert balance modifiers or vulnerabilities: \u0001
  #274 = Utf8               Error loading insert balance modifiers or vulnerabilities: \u0001
  #275 = String             #276          // Error loading balance_vulnerability table:\u0001
  #276 = Utf8               Error loading balance_vulnerability table:\u0001
  #277 = String             #278          // \u0001:\u0001
  #278 = Utf8               \u0001:\u0001
  #279 = String             #280          // Loaded updating: \u0001 Vs \u0001.
  #280 = Utf8               Loaded updating: \u0001 Vs \u0001.
  #281 = String             #282          // Error updating modifier: \u0001
  #282 = Utf8               Error updating modifier: \u0001
  #283 = String             #284          // Loaded updated vulnerability: \u0001 = \u0001
  #284 = Utf8               Loaded updated vulnerability: \u0001 = \u0001
  #285 = MethodHandle       6:#286        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #286 = Methodref          #287.#288     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #287 = Class              #289          // java/lang/invoke/StringConcatFactory
  #288 = NameAndType        #121:#290     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #289 = Utf8               java/lang/invoke/StringConcatFactory
  #290 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #291 = Utf8               InnerClasses
  #292 = Utf8               SingletonHolder
  #293 = Class              #294          // java/lang/invoke/MethodHandles$Lookup
  #294 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #295 = Class              #296          // java/lang/invoke/MethodHandles
  #296 = Utf8               java/lang/invoke/MethodHandles
  #297 = Utf8               Lookup
{
  public final java.util.Map<java.lang.String, java.lang.Double> _vulnModifiers;
    descriptor: Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Signature: #221                         // Ljava/util/Map<Ljava/lang/String;Ljava/lang/Double;>;

  public ext.mods.gameserver.custom.data.BalanceData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _modifiers:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/HashMap
        19: dup
        20: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        23: putfield      #16                 // Field _vulnModifiers:Ljava/util/Map;
        26: return
      LineNumberTable:
        line 32: 0
        line 34: 4
        line 35: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/custom/data/BalanceData;

  public void init();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #25                 // String Loaded Balance.
         5: invokevirtual #27                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: aload_0
         9: invokevirtual #33                 // Method load:()V
        12: return
      LineNumberTable:
        line 39: 0
        line 40: 8
        line 41: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/custom/data/BalanceData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=12, locals=15, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _modifiers:Ljava/util/Map;
         4: invokeinterface #36,  1           // InterfaceMethod java/util/Map.clear:()V
         9: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        12: astore_1
        13: aload_1
        14: ldc           #47                 // String SELECT * FROM balance_classes
        16: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        21: astore_2
        22: aload_2
        23: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        28: astore_3
        29: aload_3
        30: invokeinterface #61,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        35: ifeq          137
        38: aload_3
        39: ldc           #67                 // String class_id_attacker
        41: invokeinterface #69,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        46: istore        4
        48: aload_3
        49: ldc           #73                 // String class_id_target
        51: invokeinterface #69,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        56: istore        5
        58: aload_3
        59: ldc           #75                 // String p_atk_mod
        61: invokeinterface #77,  2           // InterfaceMethod java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
        66: dstore        6
        68: aload_3
        69: ldc           #81                 // String m_atk_mod
        71: invokeinterface #77,  2           // InterfaceMethod java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
        76: dstore        8
        78: aload_3
        79: ldc           #83                 // String p_def_mod
        81: invokeinterface #77,  2           // InterfaceMethod java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
        86: dstore        10
        88: aload_3
        89: ldc           #85                 // String m_def_mod
        91: invokeinterface #77,  2           // InterfaceMethod java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
        96: dstore        12
        98: iload         4
       100: iload         5
       102: invokestatic  #87                 // Method buildKey:(II)Ljava/lang/String;
       105: astore        14
       107: aload_0
       108: getfield      #10                 // Field _modifiers:Ljava/util/Map;
       111: aload         14
       113: new           #91                 // class ext/mods/gameserver/model/holder/BalanceHolder
       116: dup
       117: dload         6
       119: dload         8
       121: dload         10
       123: dload         12
       125: invokespecial #93                 // Method ext/mods/gameserver/model/holder/BalanceHolder."<init>":(DDDD)V
       128: invokeinterface #96,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       133: pop
       134: goto          29
       137: aload_3
       138: ifnull        177
       141: aload_3
       142: invokeinterface #100,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       147: goto          177
       150: astore        4
       152: aload_3
       153: ifnull        174
       156: aload_3
       157: invokeinterface #100,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       162: goto          174
       165: astore        5
       167: aload         4
       169: aload         5
       171: invokevirtual #105                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       174: aload         4
       176: athrow
       177: aload_2
       178: ifnull        214
       181: aload_2
       182: invokeinterface #109,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       187: goto          214
       190: astore_3
       191: aload_2
       192: ifnull        212
       195: aload_2
       196: invokeinterface #109,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       201: goto          212
       204: astore        4
       206: aload_3
       207: aload         4
       209: invokevirtual #105                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       212: aload_3
       213: athrow
       214: aload_1
       215: ifnull        249
       218: aload_1
       219: invokeinterface #110,  1          // InterfaceMethod java/sql/Connection.close:()V
       224: goto          249
       227: astore_2
       228: aload_1
       229: ifnull        247
       232: aload_1
       233: invokeinterface #110,  1          // InterfaceMethod java/sql/Connection.close:()V
       238: goto          247
       241: astore_3
       242: aload_2
       243: aload_3
       244: invokevirtual #105                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       247: aload_2
       248: athrow
       249: goto          268
       252: astore_1
       253: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
       256: aload_1
       257: invokestatic  #113                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       260: invokedynamic #119,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       265: invokevirtual #27                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       268: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       271: astore_1
       272: aload_1
       273: aload_0
       274: getfield      #10                 // Field _modifiers:Ljava/util/Map;
       277: invokestatic  #123                // Method ext/mods/gameserver/model/balance/BalanceGeneration.generate:(Ljava/sql/Connection;Ljava/util/Map;)V
       280: aload_1
       281: ifnull        315
       284: aload_1
       285: invokeinterface #110,  1          // InterfaceMethod java/sql/Connection.close:()V
       290: goto          315
       293: astore_2
       294: aload_1
       295: ifnull        313
       298: aload_1
       299: invokeinterface #110,  1          // InterfaceMethod java/sql/Connection.close:()V
       304: goto          313
       307: astore_3
       308: aload_2
       309: aload_3
       310: invokevirtual #105                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       313: aload_2
       314: athrow
       315: goto          334
       318: astore_1
       319: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
       322: aload_1
       323: invokestatic  #113                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       326: invokedynamic #129,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       331: invokevirtual #27                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       334: aload_0
       335: invokevirtual #130                // Method loadVulnerabilities:()V
       338: return
      Exception table:
         from    to  target type
            29   137   150   Class java/lang/Throwable
           156   162   165   Class java/lang/Throwable
            22   177   190   Class java/lang/Throwable
           195   201   204   Class java/lang/Throwable
            13   214   227   Class java/lang/Throwable
           232   238   241   Class java/lang/Throwable
             9   249   252   Class java/lang/Exception
           272   280   293   Class java/lang/Throwable
           298   304   307   Class java/lang/Throwable
           268   315   318   Class java/lang/Exception
      LineNumberTable:
        line 45: 0
        line 47: 9
        line 49: 13
        line 50: 22
        line 52: 29
        line 54: 38
        line 55: 48
        line 57: 58
        line 58: 68
        line 59: 78
        line 60: 88
        line 62: 98
        line 63: 107
        line 64: 134
        line 66: 137
        line 49: 150
        line 66: 177
        line 49: 190
        line 68: 214
        line 47: 227
        line 72: 249
        line 69: 252
        line 71: 253
        line 74: 268
        line 76: 272
        line 77: 280
        line 74: 293
        line 81: 315
        line 78: 318
        line 80: 319
        line 83: 334
        line 85: 338
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48      86     4 classAtk   I
           58      76     5 classTgt   I
           68      66     6  pAtk   D
           78      56     8  mAtk   D
           88      46    10  pDef   D
           98      36    12  mDef   D
          107      27    14   key   Ljava/lang/String;
           29     148     3    rs   Ljava/sql/ResultSet;
           22     192     2    ps   Ljava/sql/PreparedStatement;
           13     236     1   con   Ljava/sql/Connection;
          253      15     1     e   Ljava/lang/Exception;
          272      43     1  con1   Ljava/sql/Connection;
          319      15     1     e   Ljava/lang/Exception;
            0     339     0  this   Lext/mods/gameserver/custom/data/BalanceData;
      StackMapTable: number_of_entries = 22
        frame_type = 254 /* append */
          offset_delta = 29
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 107
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, class java/sql/Connection ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 15 /* same */

  public static java.lang.String buildKey(int, int);
    descriptor: (II)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=2
         0: iload_0
         1: iload_1
         2: invokedynamic #152,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
         7: areturn
      LineNumberTable:
        line 109: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0   atk   I
            0       8     1   tgt   I

  public double getSkillTypeMultiplier(java.lang.String);
    descriptor: (Ljava/lang/String;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _vulnModifiers:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #140                // Method java/lang/String.toUpperCase:()Ljava/lang/String;
         8: dconst_1
         9: invokestatic  #146                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        12: invokeinterface #154,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #147                // class java/lang/Double
        20: invokevirtual #157                // Method java/lang/Double.doubleValue:()D
        23: dreturn
      LineNumberTable:
        line 114: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/custom/data/BalanceData;
            0      24     1 skillType   Ljava/lang/String;

  public ext.mods.gameserver.model.holder.BalanceHolder getModifier(int, int);
    descriptor: (II)Lext/mods/gameserver/model/holder/BalanceHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=12, locals=4, args_size=3
         0: iload_1
         1: iload_2
         2: invokestatic  #87                 // Method buildKey:(II)Ljava/lang/String;
         5: astore_3
         6: aload_0
         7: getfield      #10                 // Field _modifiers:Ljava/util/Map;
        10: aload_3
        11: new           #91                 // class ext/mods/gameserver/model/holder/BalanceHolder
        14: dup
        15: dconst_1
        16: dconst_1
        17: dconst_1
        18: dconst_1
        19: invokespecial #93                 // Method ext/mods/gameserver/model/holder/BalanceHolder."<init>":(DDDD)V
        22: invokeinterface #154,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        27: checkcast     #91                 // class ext/mods/gameserver/model/holder/BalanceHolder
        30: areturn
      LineNumberTable:
        line 119: 0
        line 120: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/custom/data/BalanceData;
            0      31     1 classAtk   I
            0      31     2 classTgt   I
            6      25     3   key   Ljava/lang/String;

  public java.util.Map<java.lang.String, ext.mods.gameserver.model.holder.BalanceHolder> getModifierMap();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _modifiers:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 125: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/BalanceData;
    Signature: #255                         // ()Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/model/holder/BalanceHolder;>;

  public void updateModifier(int, int, ext.mods.gameserver.model.holder.BalanceHolder);
    descriptor: (IILext/mods/gameserver/model/holder/BalanceHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=4
         0: ldc           #161                // String INSERT INTO balance_classes (class_id_attacker, class_id_target, p_atk_mod, m_atk_mod, p_def_mod, m_def_mod) VALUES (?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE p_atk_mod = VALUES(p_atk_mod), m_atk_mod = VALUES(m_atk_mod), p_def_mod = VALUES(p_def_mod), m_def_mod = VALUES(m_def_mod)
         2: astore        4
         4: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         7: astore        5
         9: aload         5
        11: aload         4
        13: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        18: astore        6
        20: aload         6
        22: iconst_1
        23: iload_1
        24: invokeinterface #163,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        29: aload         6
        31: iconst_2
        32: iload_2
        33: invokeinterface #163,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        38: aload         6
        40: iconst_3
        41: aload_3
        42: getfield      #167                // Field ext/mods/gameserver/model/holder/BalanceHolder._pAtkMod:D
        45: invokeinterface #171,  4          // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
        50: aload         6
        52: iconst_4
        53: aload_3
        54: getfield      #175                // Field ext/mods/gameserver/model/holder/BalanceHolder._mAtkMod:D
        57: invokeinterface #171,  4          // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
        62: aload         6
        64: iconst_5
        65: aload_3
        66: getfield      #178                // Field ext/mods/gameserver/model/holder/BalanceHolder._pDefMod:D
        69: invokeinterface #171,  4          // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
        74: aload         6
        76: bipush        6
        78: aload_3
        79: getfield      #181                // Field ext/mods/gameserver/model/holder/BalanceHolder._mDefMod:D
        82: invokeinterface #171,  4          // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
        87: aload         6
        89: invokeinterface #184,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        94: pop
        95: iload_1
        96: iload_2
        97: invokedynamic #152,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
       102: astore        7
       104: aload_0
       105: getfield      #10                 // Field _modifiers:Ljava/util/Map;
       108: aload         7
       110: aload_3
       111: invokeinterface #96,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       116: pop
       117: iload_1
       118: invokestatic  #188                // Method ext/mods/gameserver/model/holder/BalanceName.getName:(I)Ljava/lang/String;
       121: invokevirtual #194                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       124: astore        8
       126: iload_2
       127: invokestatic  #188                // Method ext/mods/gameserver/model/holder/BalanceName.getName:(I)Ljava/lang/String;
       130: invokevirtual #194                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       133: astore        9
       135: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
       138: aload         8
       140: aload         9
       142: invokedynamic #197,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       147: invokevirtual #27                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       150: aload         6
       152: ifnull        194
       155: aload         6
       157: invokeinterface #109,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       162: goto          194
       165: astore        7
       167: aload         6
       169: ifnull        191
       172: aload         6
       174: invokeinterface #109,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       179: goto          191
       182: astore        8
       184: aload         7
       186: aload         8
       188: invokevirtual #105                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       191: aload         7
       193: athrow
       194: aload         5
       196: ifnull        238
       199: aload         5
       201: invokeinterface #110,  1          // InterfaceMethod java/sql/Connection.close:()V
       206: goto          238
       209: astore        6
       211: aload         5
       213: ifnull        235
       216: aload         5
       218: invokeinterface #110,  1          // InterfaceMethod java/sql/Connection.close:()V
       223: goto          235
       226: astore        7
       228: aload         6
       230: aload         7
       232: invokevirtual #105                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       235: aload         6
       237: athrow
       238: goto          259
       241: astore        5
       243: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
       246: aload         5
       248: invokestatic  #113                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       251: invokedynamic #200,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       256: invokevirtual #27                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       259: return
      Exception table:
         from    to  target type
            20   150   165   Class java/lang/Throwable
           172   179   182   Class java/lang/Throwable
             9   194   209   Class java/lang/Throwable
           216   223   226   Class java/lang/Throwable
             4   238   241   Class java/lang/Exception
      LineNumberTable:
        line 130: 0
        line 132: 4
        line 133: 9
        line 135: 20
        line 136: 29
        line 137: 38
        line 138: 50
        line 139: 62
        line 140: 74
        line 141: 87
        line 143: 95
        line 144: 104
        line 146: 117
        line 147: 126
        line 149: 135
        line 150: 150
        line 132: 165
        line 150: 194
        line 132: 209
        line 154: 238
        line 151: 241
        line 153: 243
        line 155: 259
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          104      46     7   key   Ljava/lang/String;
          126      24     8 atkName   Ljava/lang/String;
          135      15     9 tgtName   Ljava/lang/String;
           20     174     6    ps   Ljava/sql/PreparedStatement;
            9     229     5   con   Ljava/sql/Connection;
          243      16     5     e   Ljava/lang/Exception;
            0     260     0  this   Lext/mods/gameserver/custom/data/BalanceData;
            0     260     1 classAtk   I
            0     260     2 classTgt   I
            0     260     3   mod   Lext/mods/gameserver/model/holder/BalanceHolder;
            4     256     4   sql   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 165
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, int, int, class ext/mods/gameserver/model/holder/BalanceHolder, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, int, int, class ext/mods/gameserver/model/holder/BalanceHolder, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, int, int, class ext/mods/gameserver/model/holder/BalanceHolder, class java/lang/String, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 17 /* same */

  public void saveVulnerability(java.lang.String, double);
    descriptor: (Ljava/lang/String;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=3
         0: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore        4
         5: aload         4
         7: ldc           #201                // String REPLACE INTO balance_vulnerability (skill_type, multiplier) VALUES (?, ?)
         9: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        14: astore        5
        16: aload         5
        18: iconst_1
        19: aload_1
        20: invokeinterface #203,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        25: aload         5
        27: iconst_2
        28: dload_2
        29: invokeinterface #171,  4          // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
        34: aload         5
        36: invokeinterface #184,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        41: pop
        42: aload_0
        43: getfield      #16                 // Field _vulnModifiers:Ljava/util/Map;
        46: aload_1
        47: dload_2
        48: invokestatic  #146                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        51: invokeinterface #96,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        56: pop
        57: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
        60: aload_1
        61: dload_2
        62: invokedynamic #207,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;D)Ljava/lang/String;
        67: invokevirtual #27                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        70: aload         5
        72: ifnull        114
        75: aload         5
        77: invokeinterface #109,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        82: goto          114
        85: astore        6
        87: aload         5
        89: ifnull        111
        92: aload         5
        94: invokeinterface #109,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        99: goto          111
       102: astore        7
       104: aload         6
       106: aload         7
       108: invokevirtual #105                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       111: aload         6
       113: athrow
       114: aload         4
       116: ifnull        158
       119: aload         4
       121: invokeinterface #110,  1          // InterfaceMethod java/sql/Connection.close:()V
       126: goto          158
       129: astore        5
       131: aload         4
       133: ifnull        155
       136: aload         4
       138: invokeinterface #110,  1          // InterfaceMethod java/sql/Connection.close:()V
       143: goto          155
       146: astore        6
       148: aload         5
       150: aload         6
       152: invokevirtual #105                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       155: aload         5
       157: athrow
       158: goto          168
       161: astore        4
       163: aload         4
       165: invokevirtual #210                // Method java/lang/Exception.printStackTrace:()V
       168: return
      Exception table:
         from    to  target type
            16    70    85   Class java/lang/Throwable
            92    99   102   Class java/lang/Throwable
             5   114   129   Class java/lang/Throwable
           136   143   146   Class java/lang/Throwable
             0   158   161   Class java/lang/Exception
      LineNumberTable:
        line 159: 0
        line 160: 5
        line 162: 16
        line 163: 25
        line 164: 34
        line 166: 42
        line 167: 57
        line 169: 70
        line 159: 85
        line 169: 114
        line 159: 129
        line 173: 158
        line 170: 161
        line 172: 163
        line 174: 168
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           16      98     5    ps   Ljava/sql/PreparedStatement;
            5     153     4   con   Ljava/sql/Connection;
          163       5     4     e   Ljava/lang/Exception;
            0     169     0  this   Lext/mods/gameserver/custom/data/BalanceData;
            0     169     1  type   Ljava/lang/String;
            0     169     2 multiplier   D
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 85
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, class java/lang/String, double, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, class java/lang/String, double, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/BalanceData, class java/lang/String, double, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 6 /* same */

  public static ext.mods.gameserver.custom.data.BalanceData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/BalanceData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #213                // Field ext/mods/gameserver/custom/data/BalanceData$SingletonHolder.instance:Lext/mods/gameserver/custom/data/BalanceData;
         3: areturn
      LineNumberTable:
        line 178: 0
}
SourceFile: "BalanceData.java"
NestMembers:
  ext/mods/gameserver/custom/data/BalanceData$SingletonHolder
BootstrapMethods:
  0: #285 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #271 Error loading balance modifiers: \u0001
  1: #285 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #273 Error loading insert balance modifiers or vulnerabilities: \u0001
  2: #285 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #275 Error loading balance_vulnerability table:\u0001
  3: #285 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #277 \u0001:\u0001
  4: #285 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #279 Loaded updating: \u0001 Vs \u0001.
  5: #285 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #281 Error updating modifier: \u0001
  6: #285 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #283 Loaded updated vulnerability: \u0001 = \u0001
InnerClasses:
  public static final #297= #293 of #295; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
