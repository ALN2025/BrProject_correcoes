// Bytecode for: ext.mods.gameserver.model.balance.BalanceGeneration
// File: ext\mods\gameserver\model\balance\BalanceGeneration.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/balance/BalanceGeneration.class
  Last modified 9 de jul de 2026; size 4308 bytes
  MD5 checksum 004b294ba53a5688c0f617556ddd99b9
  Compiled from "BalanceGeneration.java"
public class ext.mods.gameserver.model.balance.BalanceGeneration
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #52                         // ext/mods/gameserver/model/balance/BalanceGeneration
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/holder/BalanceName.getClassMap:()Ljava/util/Map;
    #8 = Class              #10           // ext/mods/gameserver/model/holder/BalanceName
    #9 = NameAndType        #11:#12       // getClassMap:()Ljava/util/Map;
   #10 = Utf8               ext/mods/gameserver/model/holder/BalanceName
   #11 = Utf8               getClassMap
   #12 = Utf8               ()Ljava/util/Map;
   #13 = InterfaceMethodref #14.#15       // java/util/Map.keySet:()Ljava/util/Set;
   #14 = Class              #16           // java/util/Map
   #15 = NameAndType        #17:#18       // keySet:()Ljava/util/Set;
   #16 = Utf8               java/util/Map
   #17 = Utf8               keySet
   #18 = Utf8               ()Ljava/util/Set;
   #19 = InterfaceMethodref #20.#21       // java/util/Set.iterator:()Ljava/util/Iterator;
   #20 = Class              #22           // java/util/Set
   #21 = NameAndType        #23:#24       // iterator:()Ljava/util/Iterator;
   #22 = Utf8               java/util/Set
   #23 = Utf8               iterator
   #24 = Utf8               ()Ljava/util/Iterator;
   #25 = InterfaceMethodref #26.#27       // java/util/Iterator.hasNext:()Z
   #26 = Class              #28           // java/util/Iterator
   #27 = NameAndType        #29:#30       // hasNext:()Z
   #28 = Utf8               java/util/Iterator
   #29 = Utf8               hasNext
   #30 = Utf8               ()Z
   #31 = InterfaceMethodref #26.#32       // java/util/Iterator.next:()Ljava/lang/Object;
   #32 = NameAndType        #33:#34       // next:()Ljava/lang/Object;
   #33 = Utf8               next
   #34 = Utf8               ()Ljava/lang/Object;
   #35 = Class              #36           // java/lang/Integer
   #36 = Utf8               java/lang/Integer
   #37 = Methodref          #35.#38       // java/lang/Integer.intValue:()I
   #38 = NameAndType        #39:#40       // intValue:()I
   #39 = Utf8               intValue
   #40 = Utf8               ()I
   #41 = Methodref          #42.#43       // ext/mods/gameserver/custom/data/BalanceData.buildKey:(II)Ljava/lang/String;
   #42 = Class              #44           // ext/mods/gameserver/custom/data/BalanceData
   #43 = NameAndType        #45:#46       // buildKey:(II)Ljava/lang/String;
   #44 = Utf8               ext/mods/gameserver/custom/data/BalanceData
   #45 = Utf8               buildKey
   #46 = Utf8               (II)Ljava/lang/String;
   #47 = InterfaceMethodref #14.#48       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #48 = NameAndType        #49:#50       // containsKey:(Ljava/lang/Object;)Z
   #49 = Utf8               containsKey
   #50 = Utf8               (Ljava/lang/Object;)Z
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/balance/BalanceGeneration.calculateModifier:(II)Lext/mods/gameserver/model/holder/BalanceHolder;
   #52 = Class              #54           // ext/mods/gameserver/model/balance/BalanceGeneration
   #53 = NameAndType        #55:#56       // calculateModifier:(II)Lext/mods/gameserver/model/holder/BalanceHolder;
   #54 = Utf8               ext/mods/gameserver/model/balance/BalanceGeneration
   #55 = Utf8               calculateModifier
   #56 = Utf8               (II)Lext/mods/gameserver/model/holder/BalanceHolder;
   #57 = String             #58           // INSERT INTO balance_classes (class_id_attacker, class_id_target, p_atk_mod, m_atk_mod, p_def_mod, m_def_mod) VALUES (?, ?, ?, ?, ?, ?)
   #58 = Utf8               INSERT INTO balance_classes (class_id_attacker, class_id_target, p_atk_mod, m_atk_mod, p_def_mod, m_def_mod) VALUES (?, ?, ?, ?, ?, ?)
   #59 = InterfaceMethodref #60.#61       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #60 = Class              #62           // java/sql/Connection
   #61 = NameAndType        #63:#64       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #62 = Utf8               java/sql/Connection
   #63 = Utf8               prepareStatement
   #64 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #65 = InterfaceMethodref #66.#67       // java/sql/PreparedStatement.setInt:(II)V
   #66 = Class              #68           // java/sql/PreparedStatement
   #67 = NameAndType        #69:#70       // setInt:(II)V
   #68 = Utf8               java/sql/PreparedStatement
   #69 = Utf8               setInt
   #70 = Utf8               (II)V
   #71 = Fieldref           #72.#73       // ext/mods/gameserver/model/holder/BalanceHolder._pAtkMod:D
   #72 = Class              #74           // ext/mods/gameserver/model/holder/BalanceHolder
   #73 = NameAndType        #75:#76       // _pAtkMod:D
   #74 = Utf8               ext/mods/gameserver/model/holder/BalanceHolder
   #75 = Utf8               _pAtkMod
   #76 = Utf8               D
   #77 = InterfaceMethodref #66.#78       // java/sql/PreparedStatement.setDouble:(ID)V
   #78 = NameAndType        #79:#80       // setDouble:(ID)V
   #79 = Utf8               setDouble
   #80 = Utf8               (ID)V
   #81 = Fieldref           #72.#82       // ext/mods/gameserver/model/holder/BalanceHolder._mAtkMod:D
   #82 = NameAndType        #83:#76       // _mAtkMod:D
   #83 = Utf8               _mAtkMod
   #84 = Fieldref           #72.#85       // ext/mods/gameserver/model/holder/BalanceHolder._pDefMod:D
   #85 = NameAndType        #86:#76       // _pDefMod:D
   #86 = Utf8               _pDefMod
   #87 = Fieldref           #72.#88       // ext/mods/gameserver/model/holder/BalanceHolder._mDefMod:D
   #88 = NameAndType        #89:#76       // _mDefMod:D
   #89 = Utf8               _mDefMod
   #90 = InterfaceMethodref #66.#91       // java/sql/PreparedStatement.executeUpdate:()I
   #91 = NameAndType        #92:#40       // executeUpdate:()I
   #92 = Utf8               executeUpdate
   #93 = InterfaceMethodref #66.#94       // java/sql/PreparedStatement.close:()V
   #94 = NameAndType        #95:#6        // close:()V
   #95 = Utf8               close
   #96 = Class              #97           // java/lang/Throwable
   #97 = Utf8               java/lang/Throwable
   #98 = Methodref          #96.#99       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #99 = NameAndType        #100:#101     // addSuppressed:(Ljava/lang/Throwable;)V
  #100 = Utf8               addSuppressed
  #101 = Utf8               (Ljava/lang/Throwable;)V
  #102 = InterfaceMethodref #14.#103      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #103 = NameAndType        #104:#105     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #104 = Utf8               put
  #105 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #106 = Methodref          #8.#107       // ext/mods/gameserver/model/holder/BalanceName.getName:(I)Ljava/lang/String;
  #107 = NameAndType        #108:#109     // getName:(I)Ljava/lang/String;
  #108 = Utf8               getName
  #109 = Utf8               (I)Ljava/lang/String;
  #110 = Methodref          #111.#112     // java/lang/String.toLowerCase:()Ljava/lang/String;
  #111 = Class              #113          // java/lang/String
  #112 = NameAndType        #114:#115     // toLowerCase:()Ljava/lang/String;
  #113 = Utf8               java/lang/String
  #114 = Utf8               toLowerCase
  #115 = Utf8               ()Ljava/lang/String;
  #116 = String             #117          // dominator
  #117 = Utf8               dominator
  #118 = Methodref          #111.#119     // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #119 = NameAndType        #120:#121     // contains:(Ljava/lang/CharSequence;)Z
  #120 = Utf8               contains
  #121 = Utf8               (Ljava/lang/CharSequence;)Z
  #122 = String             #123          // doomcryer
  #123 = Utf8               doomcryer
  #124 = String             #125          // hierophant
  #125 = Utf8               hierophant
  #126 = String             #127          // shillien saint
  #127 = Utf8               shillien saint
  #128 = String             #129          // eva saint
  #129 = Utf8               eva saint
  #130 = String             #131          // phoenix knight
  #131 = Utf8               phoenix knight
  #132 = String             #133          // temple knight
  #133 = Utf8               temple knight
  #134 = String             #135          // warcryer
  #135 = Utf8               warcryer
  #136 = String             #137          // overlord
  #137 = Utf8               overlord
  #138 = String             #139          // ghost hunter
  #139 = Utf8               ghost hunter
  #140 = String             #141          // adventurer
  #141 = Utf8               adventurer
  #142 = String             #143          // wind rider
  #143 = Utf8               wind rider
  #144 = String             #145          // sagittarius
  #145 = Utf8               sagittarius
  #146 = String             #147          // ghost sentinel
  #147 = Utf8               ghost sentinel
  #148 = String             #149          // moonlight
  #149 = Utf8               moonlight
  #150 = String             #151          // archmage
  #151 = Utf8               archmage
  #152 = String             #153          // soultaker
  #153 = Utf8               soultaker
  #154 = String             #155          // storm screamer
  #155 = Utf8               storm screamer
  #156 = Double             0.3d
  #158 = Double             0.1d
  #160 = Double             0.2d
  #162 = Double             0.5d
  #164 = Double             1.5d
  #166 = Methodref          #167.#168     // java/lang/Math.min:(DD)D
  #167 = Class              #169          // java/lang/Math
  #168 = NameAndType        #170:#171     // min:(DD)D
  #169 = Utf8               java/lang/Math
  #170 = Utf8               min
  #171 = Utf8               (DD)D
  #172 = Methodref          #167.#173     // java/lang/Math.max:(DD)D
  #173 = NameAndType        #174:#171     // max:(DD)D
  #174 = Utf8               max
  #175 = Methodref          #72.#176      // ext/mods/gameserver/model/holder/BalanceHolder."<init>":(DDDD)V
  #176 = NameAndType        #5:#177       // "<init>":(DDDD)V
  #177 = Utf8               (DDDD)V
  #178 = Utf8               Code
  #179 = Utf8               LineNumberTable
  #180 = Utf8               LocalVariableTable
  #181 = Utf8               this
  #182 = Utf8               Lext/mods/gameserver/model/balance/BalanceGeneration;
  #183 = Utf8               generate
  #184 = Utf8               (Ljava/sql/Connection;Ljava/util/Map;)V
  #185 = Utf8               ps
  #186 = Utf8               Ljava/sql/PreparedStatement;
  #187 = Utf8               mod
  #188 = Utf8               Lext/mods/gameserver/model/holder/BalanceHolder;
  #189 = Utf8               key
  #190 = Utf8               Ljava/lang/String;
  #191 = Utf8               classTgt
  #192 = Utf8               I
  #193 = Utf8               classAtk
  #194 = Utf8               con
  #195 = Utf8               Ljava/sql/Connection;
  #196 = Utf8               modifiers
  #197 = Utf8               Ljava/util/Map;
  #198 = Utf8               classIds
  #199 = Utf8               Ljava/util/Set;
  #200 = Utf8               LocalVariableTypeTable
  #201 = Utf8               Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/model/holder/BalanceHolder;>;
  #202 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #203 = Utf8               StackMapTable
  #204 = Utf8               Exceptions
  #205 = Class              #206          // java/sql/SQLException
  #206 = Utf8               java/sql/SQLException
  #207 = Utf8               Signature
  #208 = Utf8               (Ljava/sql/Connection;Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/model/holder/BalanceHolder;>;)V
  #209 = Utf8               attacker
  #210 = Utf8               target
  #211 = Utf8               atkName
  #212 = Utf8               tgtName
  #213 = Utf8               pAtkMod
  #214 = Utf8               mAtkMod
  #215 = Utf8               pDefMod
  #216 = Utf8               mDefMod
  #217 = Utf8               atkIsWeakClass
  #218 = Utf8               Z
  #219 = Utf8               atkIsTopClass
  #220 = Utf8               tgtIsTopClass
  #221 = Utf8               SourceFile
  #222 = Utf8               BalanceGeneration.java
{
  public ext.mods.gameserver.model.balance.BalanceGeneration();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/balance/BalanceGeneration;

  public static void generate(java.sql.Connection, java.util.Map<java.lang.String, ext.mods.gameserver.model.holder.BalanceHolder>) throws java.sql.SQLException;
    descriptor: (Ljava/sql/Connection;Ljava/util/Map;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=12, args_size=2
         0: invokestatic  #7                  // Method ext/mods/gameserver/model/holder/BalanceName.getClassMap:()Ljava/util/Map;
         3: invokeinterface #13,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
         8: astore_2
         9: aload_2
        10: invokeinterface #19,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        15: astore_3
        16: aload_3
        17: invokeinterface #25,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        22: ifeq          253
        25: aload_3
        26: invokeinterface #31,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        31: checkcast     #35                 // class java/lang/Integer
        34: invokevirtual #37                 // Method java/lang/Integer.intValue:()I
        37: istore        4
        39: aload_2
        40: invokeinterface #19,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        45: astore        5
        47: aload         5
        49: invokeinterface #25,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        54: ifeq          250
        57: aload         5
        59: invokeinterface #31,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        64: checkcast     #35                 // class java/lang/Integer
        67: invokevirtual #37                 // Method java/lang/Integer.intValue:()I
        70: istore        6
        72: iload         4
        74: iload         6
        76: invokestatic  #41                 // Method ext/mods/gameserver/custom/data/BalanceData.buildKey:(II)Ljava/lang/String;
        79: astore        7
        81: aload_1
        82: aload         7
        84: invokeinterface #47,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        89: ifne          247
        92: iload         4
        94: iload         6
        96: invokestatic  #51                 // Method calculateModifier:(II)Lext/mods/gameserver/model/holder/BalanceHolder;
        99: astore        8
       101: aload_0
       102: ldc           #57                 // String INSERT INTO balance_classes (class_id_attacker, class_id_target, p_atk_mod, m_atk_mod, p_def_mod, m_def_mod) VALUES (?, ?, ?, ?, ?, ?)
       104: invokeinterface #59,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       109: astore        9
       111: aload         9
       113: iconst_1
       114: iload         4
       116: invokeinterface #65,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       121: aload         9
       123: iconst_2
       124: iload         6
       126: invokeinterface #65,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       131: aload         9
       133: iconst_3
       134: aload         8
       136: getfield      #71                 // Field ext/mods/gameserver/model/holder/BalanceHolder._pAtkMod:D
       139: invokeinterface #77,  4           // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
       144: aload         9
       146: iconst_4
       147: aload         8
       149: getfield      #81                 // Field ext/mods/gameserver/model/holder/BalanceHolder._mAtkMod:D
       152: invokeinterface #77,  4           // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
       157: aload         9
       159: iconst_5
       160: aload         8
       162: getfield      #84                 // Field ext/mods/gameserver/model/holder/BalanceHolder._pDefMod:D
       165: invokeinterface #77,  4           // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
       170: aload         9
       172: bipush        6
       174: aload         8
       176: getfield      #87                 // Field ext/mods/gameserver/model/holder/BalanceHolder._mDefMod:D
       179: invokeinterface #77,  4           // InterfaceMethod java/sql/PreparedStatement.setDouble:(ID)V
       184: aload         9
       186: invokeinterface #90,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       191: pop
       192: aload         9
       194: ifnull        236
       197: aload         9
       199: invokeinterface #93,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       204: goto          236
       207: astore        10
       209: aload         9
       211: ifnull        233
       214: aload         9
       216: invokeinterface #93,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       221: goto          233
       224: astore        11
       226: aload         10
       228: aload         11
       230: invokevirtual #98                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       233: aload         10
       235: athrow
       236: aload_1
       237: aload         7
       239: aload         8
       241: invokeinterface #102,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       246: pop
       247: goto          47
       250: goto          16
       253: return
      Exception table:
         from    to  target type
           111   192   207   Class java/lang/Throwable
           214   221   224   Class java/lang/Throwable
      LineNumberTable:
        line 35: 0
        line 37: 9
        line 39: 39
        line 41: 72
        line 43: 81
        line 45: 92
        line 47: 101
        line 49: 111
        line 50: 121
        line 51: 131
        line 52: 144
        line 53: 157
        line 54: 170
        line 55: 184
        line 56: 192
        line 47: 207
        line 58: 236
        line 60: 247
        line 61: 250
        line 62: 253
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          111     125     9    ps   Ljava/sql/PreparedStatement;
          101     146     8   mod   Lext/mods/gameserver/model/holder/BalanceHolder;
           81     166     7   key   Ljava/lang/String;
           72     175     6 classTgt   I
           39     211     4 classAtk   I
            0     254     0   con   Ljava/sql/Connection;
            0     254     1 modifiers   Ljava/util/Map;
            9     245     2 classIds   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     254     1 modifiers   Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/model/holder/BalanceHolder;>;
            9     245     2 classIds   Ljava/util/Set<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 9
        frame_type = 253 /* append */
          offset_delta = 16
          locals = [ class java/util/Set, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ int, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 159
          locals = [ class java/sql/Connection, class java/util/Map, class java/util/Set, class java/util/Iterator, int, class java/util/Iterator, int, class java/lang/String, class ext/mods/gameserver/model/holder/BalanceHolder, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class java/sql/Connection, class java/util/Map, class java/util/Set, class java/util/Iterator, int, class java/util/Iterator, int, class java/lang/String, class ext/mods/gameserver/model/holder/BalanceHolder, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 248 /* chop */
          offset_delta = 10
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
    Exceptions:
      throws java.sql.SQLException
    Signature: #208                         // (Ljava/sql/Connection;Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/model/holder/BalanceHolder;>;)V
}
SourceFile: "BalanceGeneration.java"
