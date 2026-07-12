// Bytecode for: ext.mods.commons.gui.damage
// File: ext\mods\commons\gui\damage.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/damage.class
  Last modified 9 de jul de 2026; size 4855 bytes
  MD5 checksum 8f7e4eb04045e3ae2527fb5895993782
  Compiled from "damage.java"
public class ext.mods.commons.gui.damage extends javax.swing.table.AbstractTableModel
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/commons/gui/damage
  super_class: #2                         // javax/swing/table/AbstractTableModel
  interfaces: 0, fields: 4, methods: 8, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // javax/swing/table/AbstractTableModel."<init>":()V
    #2 = Class              #4            // javax/swing/table/AbstractTableModel
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               javax/swing/table/AbstractTableModel
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/lang/String
    #8 = Utf8               java/lang/String
    #9 = String             #10           // Attacker
   #10 = Utf8               Attacker
   #11 = String             #12           // Target
   #12 = Utf8               Target
   #13 = String             #14           // P.Atk
   #14 = Utf8               P.Atk
   #15 = String             #16           // M.Atk
   #16 = Utf8               M.Atk
   #17 = Fieldref           #18.#19       // ext/mods/commons/gui/damage.columnNames:[Ljava/lang/String;
   #18 = Class              #20           // ext/mods/commons/gui/damage
   #19 = NameAndType        #21:#22       // columnNames:[Ljava/lang/String;
   #20 = Utf8               ext/mods/commons/gui/damage
   #21 = Utf8               columnNames
   #22 = Utf8               [Ljava/lang/String;
   #23 = Class              #24           // java/util/ArrayList
   #24 = Utf8               java/util/ArrayList
   #25 = Methodref          #23.#3        // java/util/ArrayList."<init>":()V
   #26 = Fieldref           #18.#27       // ext/mods/commons/gui/damage.allData:Ljava/util/List;
   #27 = NameAndType        #28:#29       // allData:Ljava/util/List;
   #28 = Utf8               allData
   #29 = Utf8               Ljava/util/List;
   #30 = Fieldref           #18.#31       // ext/mods/commons/gui/damage.data:Ljava/util/List;
   #31 = NameAndType        #32:#29       // data:Ljava/util/List;
   #32 = Utf8               data
   #33 = Methodref          #34.#35       // ext/mods/gameserver/custom/data/BalanceData.getInstance:()Lext/mods/gameserver/custom/data/BalanceData;
   #34 = Class              #36           // ext/mods/gameserver/custom/data/BalanceData
   #35 = NameAndType        #37:#38       // getInstance:()Lext/mods/gameserver/custom/data/BalanceData;
   #36 = Utf8               ext/mods/gameserver/custom/data/BalanceData
   #37 = Utf8               getInstance
   #38 = Utf8               ()Lext/mods/gameserver/custom/data/BalanceData;
   #39 = Methodref          #34.#40       // ext/mods/gameserver/custom/data/BalanceData.getModifierMap:()Ljava/util/Map;
   #40 = NameAndType        #41:#42       // getModifierMap:()Ljava/util/Map;
   #41 = Utf8               getModifierMap
   #42 = Utf8               ()Ljava/util/Map;
   #43 = InterfaceMethodref #44.#45       // java/util/Map.keySet:()Ljava/util/Set;
   #44 = Class              #46           // java/util/Map
   #45 = NameAndType        #47:#48       // keySet:()Ljava/util/Set;
   #46 = Utf8               java/util/Map
   #47 = Utf8               keySet
   #48 = Utf8               ()Ljava/util/Set;
   #49 = InterfaceMethodref #50.#51       // java/util/Set.iterator:()Ljava/util/Iterator;
   #50 = Class              #52           // java/util/Set
   #51 = NameAndType        #53:#54       // iterator:()Ljava/util/Iterator;
   #52 = Utf8               java/util/Set
   #53 = Utf8               iterator
   #54 = Utf8               ()Ljava/util/Iterator;
   #55 = InterfaceMethodref #56.#57       // java/util/Iterator.hasNext:()Z
   #56 = Class              #58           // java/util/Iterator
   #57 = NameAndType        #59:#60       // hasNext:()Z
   #58 = Utf8               java/util/Iterator
   #59 = Utf8               hasNext
   #60 = Utf8               ()Z
   #61 = InterfaceMethodref #56.#62       // java/util/Iterator.next:()Ljava/lang/Object;
   #62 = NameAndType        #63:#64       // next:()Ljava/lang/Object;
   #63 = Utf8               next
   #64 = Utf8               ()Ljava/lang/Object;
   #65 = String             #66           // :
   #66 = Utf8               :
   #67 = Methodref          #7.#68        // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #68 = NameAndType        #69:#70       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #69 = Utf8               split
   #70 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #71 = Methodref          #72.#73       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #72 = Class              #74           // java/lang/Integer
   #73 = NameAndType        #75:#76       // parseInt:(Ljava/lang/String;)I
   #74 = Utf8               java/lang/Integer
   #75 = Utf8               parseInt
   #76 = Utf8               (Ljava/lang/String;)I
   #77 = Methodref          #34.#78       // ext/mods/gameserver/custom/data/BalanceData.getModifier:(II)Lext/mods/gameserver/model/holder/BalanceHolder;
   #78 = NameAndType        #79:#80       // getModifier:(II)Lext/mods/gameserver/model/holder/BalanceHolder;
   #79 = Utf8               getModifier
   #80 = Utf8               (II)Lext/mods/gameserver/model/holder/BalanceHolder;
   #81 = Class              #82           // ext/mods/commons/gui/damage$RowData
   #82 = Utf8               ext/mods/commons/gui/damage$RowData
   #83 = Methodref          #81.#84       // ext/mods/commons/gui/damage$RowData."<init>":(IILext/mods/gameserver/model/holder/BalanceHolder;)V
   #84 = NameAndType        #5:#85        // "<init>":(IILext/mods/gameserver/model/holder/BalanceHolder;)V
   #85 = Utf8               (IILext/mods/gameserver/model/holder/BalanceHolder;)V
   #86 = InterfaceMethodref #87.#88       // java/util/List.add:(Ljava/lang/Object;)Z
   #87 = Class              #89           // java/util/List
   #88 = NameAndType        #90:#91       // add:(Ljava/lang/Object;)Z
   #89 = Utf8               java/util/List
   #90 = Utf8               add
   #91 = Utf8               (Ljava/lang/Object;)Z
   #92 = InterfaceMethodref #87.#93       // java/util/List.size:()I
   #93 = NameAndType        #94:#95       // size:()I
   #94 = Utf8               size
   #95 = Utf8               ()I
   #96 = InterfaceMethodref #87.#97       // java/util/List.get:(I)Ljava/lang/Object;
   #97 = NameAndType        #98:#99       // get:(I)Ljava/lang/Object;
   #98 = Utf8               get
   #99 = Utf8               (I)Ljava/lang/Object;
  #100 = Fieldref           #81.#101      // ext/mods/commons/gui/damage$RowData._classAtk:I
  #101 = NameAndType        #102:#103     // _classAtk:I
  #102 = Utf8               _classAtk
  #103 = Utf8               I
  #104 = Methodref          #105.#106     // ext/mods/gameserver/model/holder/BalanceName.getName:(I)Ljava/lang/String;
  #105 = Class              #107          // ext/mods/gameserver/model/holder/BalanceName
  #106 = NameAndType        #108:#109     // getName:(I)Ljava/lang/String;
  #107 = Utf8               ext/mods/gameserver/model/holder/BalanceName
  #108 = Utf8               getName
  #109 = Utf8               (I)Ljava/lang/String;
  #110 = Fieldref           #81.#111      // ext/mods/commons/gui/damage$RowData._classTgt:I
  #111 = NameAndType        #112:#103     // _classTgt:I
  #112 = Utf8               _classTgt
  #113 = Fieldref           #81.#114      // ext/mods/commons/gui/damage$RowData._modifier:Lext/mods/gameserver/model/holder/BalanceHolder;
  #114 = NameAndType        #115:#116     // _modifier:Lext/mods/gameserver/model/holder/BalanceHolder;
  #115 = Utf8               _modifier
  #116 = Utf8               Lext/mods/gameserver/model/holder/BalanceHolder;
  #117 = Fieldref           #118.#119     // ext/mods/gameserver/model/holder/BalanceHolder._pAtkMod:D
  #118 = Class              #120          // ext/mods/gameserver/model/holder/BalanceHolder
  #119 = NameAndType        #121:#122     // _pAtkMod:D
  #120 = Utf8               ext/mods/gameserver/model/holder/BalanceHolder
  #121 = Utf8               _pAtkMod
  #122 = Utf8               D
  #123 = Methodref          #124.#125     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #124 = Class              #126          // java/lang/Double
  #125 = NameAndType        #127:#128     // valueOf:(D)Ljava/lang/Double;
  #126 = Utf8               java/lang/Double
  #127 = Utf8               valueOf
  #128 = Utf8               (D)Ljava/lang/Double;
  #129 = Fieldref           #118.#130     // ext/mods/gameserver/model/holder/BalanceHolder._mAtkMod:D
  #130 = NameAndType        #131:#122     // _mAtkMod:D
  #131 = Utf8               _mAtkMod
  #132 = Methodref          #133.#134     // java/lang/Object.toString:()Ljava/lang/String;
  #133 = Class              #135          // java/lang/Object
  #134 = NameAndType        #136:#137     // toString:()Ljava/lang/String;
  #135 = Utf8               java/lang/Object
  #136 = Utf8               toString
  #137 = Utf8               ()Ljava/lang/String;
  #138 = Methodref          #124.#139     // java/lang/Double.parseDouble:(Ljava/lang/String;)D
  #139 = NameAndType        #140:#141     // parseDouble:(Ljava/lang/String;)D
  #140 = Utf8               parseDouble
  #141 = Utf8               (Ljava/lang/String;)D
  #142 = Methodref          #34.#143      // ext/mods/gameserver/custom/data/BalanceData.updateModifier:(IILext/mods/gameserver/model/holder/BalanceHolder;)V
  #143 = NameAndType        #144:#85      // updateModifier:(IILext/mods/gameserver/model/holder/BalanceHolder;)V
  #144 = Utf8               updateModifier
  #145 = Methodref          #18.#146      // ext/mods/commons/gui/damage.fireTableCellUpdated:(II)V
  #146 = NameAndType        #147:#148     // fireTableCellUpdated:(II)V
  #147 = Utf8               fireTableCellUpdated
  #148 = Utf8               (II)V
  #149 = Class              #150          // java/lang/NumberFormatException
  #150 = Utf8               java/lang/NumberFormatException
  #151 = Fieldref           #152.#153     // java/lang/System.out:Ljava/io/PrintStream;
  #152 = Class              #154          // java/lang/System
  #153 = NameAndType        #155:#156     // out:Ljava/io/PrintStream;
  #154 = Utf8               java/lang/System
  #155 = Utf8               out
  #156 = Utf8               Ljava/io/PrintStream;
  #157 = Methodref          #7.#158       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #158 = NameAndType        #127:#159     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #159 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #160 = InvokeDynamic      #0:#161       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #161 = NameAndType        #162:#163     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #162 = Utf8               makeConcatWithConstants
  #163 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #164 = Methodref          #165.#166     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #165 = Class              #167          // java/io/PrintStream
  #166 = NameAndType        #168:#169     // println:(Ljava/lang/String;)V
  #167 = Utf8               java/io/PrintStream
  #168 = Utf8               println
  #169 = Utf8               (Ljava/lang/String;)V
  #170 = InterfaceMethodref #87.#171      // java/util/List.clear:()V
  #171 = NameAndType        #172:#6       // clear:()V
  #172 = Utf8               clear
  #173 = Methodref          #7.#174       // java/lang/String.trim:()Ljava/lang/String;
  #174 = NameAndType        #175:#137     // trim:()Ljava/lang/String;
  #175 = Utf8               trim
  #176 = Methodref          #7.#177       // java/lang/String.isEmpty:()Z
  #177 = NameAndType        #178:#60      // isEmpty:()Z
  #178 = Utf8               isEmpty
  #179 = InterfaceMethodref #87.#180      // java/util/List.addAll:(Ljava/util/Collection;)Z
  #180 = NameAndType        #181:#182     // addAll:(Ljava/util/Collection;)Z
  #181 = Utf8               addAll
  #182 = Utf8               (Ljava/util/Collection;)Z
  #183 = Methodref          #7.#184       // java/lang/String.toLowerCase:()Ljava/lang/String;
  #184 = NameAndType        #185:#137     // toLowerCase:()Ljava/lang/String;
  #185 = Utf8               toLowerCase
  #186 = InterfaceMethodref #87.#51       // java/util/List.iterator:()Ljava/util/Iterator;
  #187 = Methodref          #7.#188       // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #188 = NameAndType        #189:#190     // startsWith:(Ljava/lang/String;)Z
  #189 = Utf8               startsWith
  #190 = Utf8               (Ljava/lang/String;)Z
  #191 = Methodref          #18.#192      // ext/mods/commons/gui/damage.fireTableDataChanged:()V
  #192 = NameAndType        #193:#6       // fireTableDataChanged:()V
  #193 = Utf8               fireTableDataChanged
  #194 = Utf8               serialVersionUID
  #195 = Utf8               J
  #196 = Utf8               ConstantValue
  #197 = Long               1l
  #199 = Utf8               Signature
  #200 = Utf8               Ljava/util/List<Lext/mods/commons/gui/damage$RowData;>;
  #201 = Utf8               Code
  #202 = Utf8               LineNumberTable
  #203 = Utf8               LocalVariableTable
  #204 = Utf8               atk
  #205 = Utf8               tgt
  #206 = Utf8               mod
  #207 = Utf8               row
  #208 = Utf8               Lext/mods/commons/gui/damage$RowData;
  #209 = Utf8               key
  #210 = Utf8               Ljava/lang/String;
  #211 = Utf8               this
  #212 = Utf8               Lext/mods/commons/gui/damage;
  #213 = Utf8               StackMapTable
  #214 = Utf8               getRowCount
  #215 = Utf8               getColumnCount
  #216 = Utf8               getColumnName
  #217 = Utf8               col
  #218 = Utf8               isCellEditable
  #219 = Utf8               (II)Z
  #220 = Utf8               getValueAt
  #221 = Utf8               (II)Ljava/lang/Object;
  #222 = Utf8               r
  #223 = Class              #224          // java/io/Serializable
  #224 = Utf8               java/io/Serializable
  #225 = Utf8               setValueAt
  #226 = Utf8               (Ljava/lang/Object;II)V
  #227 = Utf8               val
  #228 = Utf8               e
  #229 = Utf8               Ljava/lang/NumberFormatException;
  #230 = Utf8               value
  #231 = Utf8               Ljava/lang/Object;
  #232 = Utf8               filter
  #233 = Utf8               atkName
  #234 = Utf8               lowerFilter
  #235 = Utf8               text
  #236 = Utf8               SourceFile
  #237 = Utf8               damage.java
  #238 = Utf8               NestMembers
  #239 = Utf8               BootstrapMethods
  #240 = String             #241          // Invalid value entered: \u0001
  #241 = Utf8               Invalid value entered: \u0001
  #242 = MethodHandle       6:#243        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #243 = Methodref          #244.#245     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #244 = Class              #246          // java/lang/invoke/StringConcatFactory
  #245 = NameAndType        #162:#247     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #246 = Utf8               java/lang/invoke/StringConcatFactory
  #247 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #248 = Utf8               InnerClasses
  #249 = Utf8               RowData
  #250 = Class              #251          // java/lang/invoke/MethodHandles$Lookup
  #251 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #252 = Class              #253          // java/lang/invoke/MethodHandles
  #253 = Utf8               java/lang/invoke/MethodHandles
  #254 = Utf8               Lookup
{
  public ext.mods.commons.gui.damage();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method javax/swing/table/AbstractTableModel."<init>":()V
         4: aload_0
         5: iconst_4
         6: anewarray     #7                  // class java/lang/String
         9: dup
        10: iconst_0
        11: ldc           #9                  // String Attacker
        13: aastore
        14: dup
        15: iconst_1
        16: ldc           #11                 // String Target
        18: aastore
        19: dup
        20: iconst_2
        21: ldc           #13                 // String P.Atk
        23: aastore
        24: dup
        25: iconst_3
        26: ldc           #15                 // String M.Atk
        28: aastore
        29: putfield      #17                 // Field columnNames:[Ljava/lang/String;
        32: aload_0
        33: new           #23                 // class java/util/ArrayList
        36: dup
        37: invokespecial #25                 // Method java/util/ArrayList."<init>":()V
        40: putfield      #26                 // Field allData:Ljava/util/List;
        43: aload_0
        44: new           #23                 // class java/util/ArrayList
        47: dup
        48: invokespecial #25                 // Method java/util/ArrayList."<init>":()V
        51: putfield      #30                 // Field data:Ljava/util/List;
        54: invokestatic  #33                 // Method ext/mods/gameserver/custom/data/BalanceData.getInstance:()Lext/mods/gameserver/custom/data/BalanceData;
        57: invokevirtual #39                 // Method ext/mods/gameserver/custom/data/BalanceData.getModifierMap:()Ljava/util/Map;
        60: invokeinterface #43,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
        65: invokeinterface #49,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        70: astore_1
        71: aload_1
        72: invokeinterface #55,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        77: ifeq          167
        80: aload_1
        81: invokeinterface #61,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        86: checkcast     #7                  // class java/lang/String
        89: astore_2
        90: aload_2
        91: ldc           #65                 // String :
        93: invokevirtual #67                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        96: astore_3
        97: aload_3
        98: iconst_0
        99: aaload
       100: invokestatic  #71                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       103: istore        4
       105: aload_3
       106: iconst_1
       107: aaload
       108: invokestatic  #71                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       111: istore        5
       113: invokestatic  #33                 // Method ext/mods/gameserver/custom/data/BalanceData.getInstance:()Lext/mods/gameserver/custom/data/BalanceData;
       116: iload         4
       118: iload         5
       120: invokevirtual #77                 // Method ext/mods/gameserver/custom/data/BalanceData.getModifier:(II)Lext/mods/gameserver/model/holder/BalanceHolder;
       123: astore        6
       125: new           #81                 // class ext/mods/commons/gui/damage$RowData
       128: dup
       129: iload         4
       131: iload         5
       133: aload         6
       135: invokespecial #83                 // Method ext/mods/commons/gui/damage$RowData."<init>":(IILext/mods/gameserver/model/holder/BalanceHolder;)V
       138: astore        7
       140: aload_0
       141: getfield      #26                 // Field allData:Ljava/util/List;
       144: aload         7
       146: invokeinterface #86,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       151: pop
       152: aload_0
       153: getfield      #30                 // Field data:Ljava/util/List;
       156: aload         7
       158: invokeinterface #86,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       163: pop
       164: goto          71
       167: return
      LineNumberTable:
        line 53: 0
        line 32: 4
        line 54: 32
        line 55: 43
        line 56: 54
        line 57: 90
        line 58: 97
        line 59: 105
        line 60: 113
        line 61: 125
        line 62: 140
        line 63: 152
        line 64: 164
        line 65: 167
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           97      67     3 split   [Ljava/lang/String;
          105      59     4   atk   I
          113      51     5   tgt   I
          125      39     6   mod   Lext/mods/gameserver/model/holder/BalanceHolder;
          140      24     7   row   Lext/mods/commons/gui/damage$RowData;
           90      74     2   key   Ljava/lang/String;
            0     168     0  this   Lext/mods/commons/gui/damage;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 71
          locals = [ class ext/mods/commons/gui/damage, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 95

  public int getRowCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field data:Ljava/util/List;
         4: invokeinterface #92,  1           // InterfaceMethod java/util/List.size:()I
         9: ireturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/gui/damage;

  public int getColumnCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field columnNames:[Ljava/lang/String;
         4: arraylength
         5: ireturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/gui/damage;

  public java.lang.String getColumnName(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field columnNames:[Ljava/lang/String;
         4: iload_1
         5: aaload
         6: areturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/gui/damage;
            0       7     1   col   I

  public boolean isCellEditable(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: iload_2
         1: iconst_2
         2: if_icmpeq     10
         5: iload_2
         6: iconst_3
         7: if_icmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/gui/damage;
            0      16     1   row   I
            0      16     2   col   I
      StackMapTable: number_of_entries = 3
        frame_type = 10 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.lang.Object getValueAt(int, int);
    descriptor: (II)Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #30                 // Field data:Ljava/util/List;
         4: iload_1
         5: invokeinterface #96,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        10: checkcast     #81                 // class ext/mods/commons/gui/damage$RowData
        13: astore_3
        14: iload_2
        15: tableswitch   { // 0 to 3

                       0: 44

                       1: 54

                       2: 64

                       3: 77
                 default: 90
            }
        44: aload_3
        45: getfield      #100                // Field ext/mods/commons/gui/damage$RowData._classAtk:I
        48: invokestatic  #104                // Method ext/mods/gameserver/model/holder/BalanceName.getName:(I)Ljava/lang/String;
        51: goto          91
        54: aload_3
        55: getfield      #110                // Field ext/mods/commons/gui/damage$RowData._classTgt:I
        58: invokestatic  #104                // Method ext/mods/gameserver/model/holder/BalanceName.getName:(I)Ljava/lang/String;
        61: goto          91
        64: aload_3
        65: getfield      #113                // Field ext/mods/commons/gui/damage$RowData._modifier:Lext/mods/gameserver/model/holder/BalanceHolder;
        68: getfield      #117                // Field ext/mods/gameserver/model/holder/BalanceHolder._pAtkMod:D
        71: invokestatic  #123                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        74: goto          91
        77: aload_3
        78: getfield      #113                // Field ext/mods/commons/gui/damage$RowData._modifier:Lext/mods/gameserver/model/holder/BalanceHolder;
        81: getfield      #129                // Field ext/mods/gameserver/model/holder/BalanceHolder._mAtkMod:D
        84: invokestatic  #123                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        87: goto          91
        90: aconst_null
        91: areturn
      LineNumberTable:
        line 89: 0
        line 90: 14
        line 91: 44
        line 92: 54
        line 93: 64
        line 94: 77
        line 95: 90
        line 90: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      92     0  this   Lext/mods/commons/gui/damage;
            0      92     1   row   I
            0      92     2   col   I
           14      78     3     r   Lext/mods/commons/gui/damage$RowData;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/commons/gui/damage$RowData ]
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/io/Serializable ]

  public void setValueAt(java.lang.Object, int, int);
    descriptor: (Ljava/lang/Object;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: aload_0
         1: getfield      #30                 // Field data:Ljava/util/List;
         4: iload_2
         5: invokeinterface #96,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        10: checkcast     #81                 // class ext/mods/commons/gui/damage$RowData
        13: astore        4
        15: aload_1
        16: invokevirtual #132                // Method java/lang/Object.toString:()Ljava/lang/String;
        19: invokestatic  #138                // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
        22: dstore        5
        24: iload_3
        25: lookupswitch  { // 2

                       2: 52

                       3: 65
                 default: 75
            }
        52: aload         4
        54: getfield      #113                // Field ext/mods/commons/gui/damage$RowData._modifier:Lext/mods/gameserver/model/holder/BalanceHolder;
        57: dload         5
        59: putfield      #117                // Field ext/mods/gameserver/model/holder/BalanceHolder._pAtkMod:D
        62: goto          75
        65: aload         4
        67: getfield      #113                // Field ext/mods/commons/gui/damage$RowData._modifier:Lext/mods/gameserver/model/holder/BalanceHolder;
        70: dload         5
        72: putfield      #129                // Field ext/mods/gameserver/model/holder/BalanceHolder._mAtkMod:D
        75: invokestatic  #33                 // Method ext/mods/gameserver/custom/data/BalanceData.getInstance:()Lext/mods/gameserver/custom/data/BalanceData;
        78: aload         4
        80: getfield      #100                // Field ext/mods/commons/gui/damage$RowData._classAtk:I
        83: aload         4
        85: getfield      #110                // Field ext/mods/commons/gui/damage$RowData._classTgt:I
        88: aload         4
        90: getfield      #113                // Field ext/mods/commons/gui/damage$RowData._modifier:Lext/mods/gameserver/model/holder/BalanceHolder;
        93: invokevirtual #142                // Method ext/mods/gameserver/custom/data/BalanceData.updateModifier:(IILext/mods/gameserver/model/holder/BalanceHolder;)V
        96: aload_0
        97: iload_2
        98: iload_3
        99: invokevirtual #145                // Method fireTableCellUpdated:(II)V
       102: goto          122
       105: astore        5
       107: getstatic     #151                // Field java/lang/System.out:Ljava/io/PrintStream;
       110: aload_1
       111: invokestatic  #157                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       114: invokedynamic #160,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       119: invokevirtual #164                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       122: return
      Exception table:
         from    to  target type
            15   102   105   Class java/lang/NumberFormatException
      LineNumberTable:
        line 101: 0
        line 103: 15
        line 104: 24
        line 105: 52
        line 106: 65
        line 108: 75
        line 109: 96
        line 112: 102
        line 110: 105
        line 111: 107
        line 113: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      78     5   val   D
          107      15     5     e   Ljava/lang/NumberFormatException;
            0     123     0  this   Lext/mods/commons/gui/damage;
            0     123     1 value   Ljava/lang/Object;
            0     123     2   row   I
            0     123     3   col   I
           15     108     4     r   Lext/mods/commons/gui/damage$RowData;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 52
          locals = [ class ext/mods/commons/gui/damage$RowData, double ]
        frame_type = 12 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/commons/gui/damage, class java/lang/Object, int, int, class ext/mods/commons/gui/damage$RowData ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 16 /* same */

  public void filter(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_0
         1: getfield      #30                 // Field data:Ljava/util/List;
         4: invokeinterface #170,  1          // InterfaceMethod java/util/List.clear:()V
         9: aload_1
        10: ifnull        23
        13: aload_1
        14: invokevirtual #173                // Method java/lang/String.trim:()Ljava/lang/String;
        17: invokevirtual #176                // Method java/lang/String.isEmpty:()Z
        20: ifeq          40
        23: aload_0
        24: getfield      #30                 // Field data:Ljava/util/List;
        27: aload_0
        28: getfield      #26                 // Field allData:Ljava/util/List;
        31: invokeinterface #179,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
        36: pop
        37: goto          115
        40: aload_1
        41: invokevirtual #173                // Method java/lang/String.trim:()Ljava/lang/String;
        44: invokevirtual #183                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        47: astore_2
        48: aload_0
        49: getfield      #26                 // Field allData:Ljava/util/List;
        52: invokeinterface #186,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        57: astore_3
        58: aload_3
        59: invokeinterface #55,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        64: ifeq          115
        67: aload_3
        68: invokeinterface #61,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        73: checkcast     #81                 // class ext/mods/commons/gui/damage$RowData
        76: astore        4
        78: aload         4
        80: getfield      #100                // Field ext/mods/commons/gui/damage$RowData._classAtk:I
        83: invokestatic  #104                // Method ext/mods/gameserver/model/holder/BalanceName.getName:(I)Ljava/lang/String;
        86: invokevirtual #183                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        89: astore        5
        91: aload         5
        93: aload_2
        94: invokevirtual #187                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        97: ifeq          112
       100: aload_0
       101: getfield      #30                 // Field data:Ljava/util/List;
       104: aload         4
       106: invokeinterface #86,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       111: pop
       112: goto          58
       115: aload_0
       116: invokevirtual #191                // Method fireTableDataChanged:()V
       119: return
      LineNumberTable:
        line 120: 0
        line 121: 9
        line 122: 23
        line 124: 40
        line 125: 48
        line 126: 78
        line 127: 91
        line 128: 100
        line 130: 112
        line 132: 115
        line 133: 119
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           91      21     5 atkName   Ljava/lang/String;
           78      34     4     r   Lext/mods/commons/gui/damage$RowData;
           48      67     2 lowerFilter   Ljava/lang/String;
            0     120     0  this   Lext/mods/commons/gui/damage;
            0     120     1  text   Ljava/lang/String;
      StackMapTable: number_of_entries = 5
        frame_type = 23 /* same */
        frame_type = 16 /* same */
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ class java/lang/String, class java/util/Iterator ]
        frame_type = 53 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
}
SourceFile: "damage.java"
NestMembers:
  ext/mods/commons/gui/damage$RowData
BootstrapMethods:
  0: #242 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #240 Invalid value entered: \u0001
InnerClasses:
  public static final #254= #250 of #252; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
